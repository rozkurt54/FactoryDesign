package org.example.notify.concretes;

import org.example.notify.abstracts.Notification;
import static java.lang.System.*;

public class EMailNotifier implements Notification{

  @Override
  public void notifyUser() {
    out.println("User notified Email channel");
  }
}
