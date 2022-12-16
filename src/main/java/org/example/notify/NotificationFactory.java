package org.example.notify;

import org.example.notify.abstracts.Notification;
import org.example.notify.concretes.EMailNotifier;
import org.example.notify.concretes.PushNotifier;
import org.example.notify.concretes.SmsNotifier;

public class NotificationFactory {

  public static Notification createNotification(String channel) {
    if(channel.isEmpty()) {
      return null;
    }
    return switch (channel) {
      case "SMS" -> new SmsNotifier();
      case "EMAIL" -> new EMailNotifier();
      case "PUSH" -> new PushNotifier();
      default -> throw new IllegalArgumentException("Unknown channel \"" + channel + "\"");
    };
  }

}
