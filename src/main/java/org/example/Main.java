package org.example;

import org.example.notify.NotificationFactory;
import org.example.notify.abstracts.Notification;

public class Main {
  public static void main(String[] args) {

    Notification smsNotification = NotificationFactory.createNotification("SMS");
    smsNotification.notifyUser();

    Notification mailNotification = NotificationFactory.createNotification("EMAIL");
    mailNotification.notifyUser();

    Notification pushNotification = NotificationFactory.createNotification("PUSH");
    pushNotification.notifyUser();

    // Expected Error.
    Notification orherNotification = NotificationFactory.createNotification("OTHER");
    mailNotification.notifyUser();

  }
}