package org.example.notify.concretes;

import org.example.notify.abstracts.Notification;

import static java.lang.System.out;

public class SmsNotifier implements Notification{

  @Override
  public void notifyUser() {
    out.println("User notified Sms channel");
  }
}
