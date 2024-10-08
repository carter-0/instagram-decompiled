package com.facebook.msys.mca;

import X.C301365z4;
import X.C301405z8;
import java.util.concurrent.Executor;

public abstract class MailboxObservableImpl implements MailboxObservable {
    public Object mResult;
    public boolean mSetResult;
    public final C301365z4 resultCallbacks;

    public synchronized MailboxObservable addResultCallback(MailboxCallback mailboxCallback) {
        if (!isDisabled()) {
            MailboxCallback mailboxCallback2 = mailboxCallback;
            if (mailboxCallback != null) {
                C301365z4 r0 = this.resultCallbacks;
                boolean z = this.mSetResult;
                r0.A01(mailboxCallback2, new C301405z8(this), this.mResult, (Executor) null, z);
            }
        }
        return this;
    }

    public abstract boolean isDisabled();

    public synchronized MailboxObservable setResult(Object obj) {
        synchronized (this) {
            if (!this.mSetResult) {
                this.mResult = obj;
                this.mSetResult = true;
                MailboxFutureImpl mailboxFutureImpl = (MailboxFutureImpl) this;
                mailboxFutureImpl.A01.A00();
                mailboxFutureImpl.mCompletionCV.open();
                this.resultCallbacks.A02(new C301405z8(this), this.mResult);
            } else {
                throw new IllegalStateException("Cannot set multiple results");
            }
        }
        return this;
    }

    public MailboxObservableImpl(C301365z4 r1) {
        this.resultCallbacks = r1;
    }

    public synchronized MailboxObservable addResultCallback(Executor executor, MailboxCallback mailboxCallback) {
        if (!isDisabled()) {
            mailboxCallback.getClass();
            executor.getClass();
            boolean z = this.mSetResult;
            Object obj = this.mResult;
            this.resultCallbacks.A01(mailboxCallback, new C301405z8(this), obj, executor, z);
        }
        return this;
    }
}
