package com.facebook.msys.mca;

import java.util.concurrent.Executor;

public interface MailboxObservable {
    MailboxObservable addResultCallback(MailboxCallback mailboxCallback);

    MailboxObservable addResultCallback(Executor executor, MailboxCallback mailboxCallback);
}
