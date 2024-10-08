package com.facebook.msys.mca;

import X.0KC;
import X.AnonymousClass685;
import X.AnonymousClass68L;
import X.C301355z3;
import X.C301365z4;
import X.C3030367d;
import X.C303676Ai;
import android.os.ConditionVariable;
import android.os.Looper;
import com.facebook.msys.mci.Execution;
import com.facebook.msys.util.NotificationScope;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class MailboxFutureImpl extends MailboxObservableImpl implements AnonymousClass685 {
    public static final Thread UI_THREAD = Looper.getMainLooper().getThread();
    public boolean A00;
    public final C301365z4 A01;
    public final ConditionVariable mCompletionCV = new ConditionVariable();
    public final AnonymousClass68L mMailboxApiHandleProvider;
    public String mNotificationName;
    public NotificationScope mNotificationScope;

    public final synchronized AnonymousClass685 A7y(MailboxCallback mailboxCallback, Executor executor) {
        MailboxCallback mailboxCallback2 = mailboxCallback;
        this.A01.A01(mailboxCallback2, new C303676Ai(this), (Object) null, executor, isCancelled());
        return this;
    }

    @Deprecated
    public final synchronized AnonymousClass685 Eiu(MailboxCallback mailboxCallback) {
        C301355z3 r2 = (C301355z3) this.resultCallbacks;
        boolean z = this.A00;
        C3030367d r4 = new C3030367d(this);
        boolean z2 = this.mSetResult;
        Object obj = this.mResult;
        synchronized (r2) {
            if (!r2.A01) {
                r2.A01 = true;
                if (!z) {
                    r2.A00 = mailboxCallback;
                    if (!r4.A00.isDisabled()) {
                        r2.A01(r2.A00, r4, obj, (Executor) null, z2);
                    }
                }
            } else {
                throw new IllegalStateException("Cannot set multiple callbacks");
            }
        }
        return this;
    }

    public final synchronized boolean cancel(boolean z) {
        boolean z2;
        z2 = false;
        if (!isDone()) {
            z2 = true;
        }
        if (!this.A00) {
            this.A00 = true;
            ((C301355z3) this.resultCallbacks).A00();
            cancelNotificationCallback(z);
            if (z2) {
                this.A01.A02(new C303676Ai(this), (Object) null);
            }
        }
        return z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x000e, code lost:
        getResultBlocking(r2, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0011, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0014, code lost:
        if (r1.mSetResult == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0016, code lost:
        r0 = r1.mResult;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0018, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0019, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x001c, code lost:
        if (r1.A00 == false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x001e, code lost:
        r0 = new java.util.concurrent.CancellationException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0023, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0024, code lost:
        r0 = new java.util.concurrent.TimeoutException();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get(long r2, java.util.concurrent.TimeUnit r4) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.mSetResult     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0009
            java.lang.Object r0 = r1.mResult     // Catch:{ all -> 0x0033 }
            monitor-exit(r1)     // Catch:{ all -> 0x0033 }
            return r0
        L_0x0009:
            boolean r0 = r1.A00     // Catch:{ all -> 0x0033 }
            if (r0 != 0) goto L_0x002d
            monitor-exit(r1)     // Catch:{ all -> 0x0033 }
            r1.getResultBlocking(r2, r4)
            monitor-enter(r1)
            boolean r0 = r1.mSetResult     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x001a
            java.lang.Object r0 = r1.mResult     // Catch:{ all -> 0x002a }
            monitor-exit(r1)     // Catch:{ all -> 0x002a }
            return r0
        L_0x001a:
            boolean r0 = r1.A00     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x0024
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException     // Catch:{ all -> 0x002a }
            r0.<init>()     // Catch:{ all -> 0x002a }
        L_0x0023:
            throw r0     // Catch:{ all -> 0x002a }
        L_0x0024:
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException     // Catch:{ all -> 0x002a }
            r0.<init>()     // Catch:{ all -> 0x002a }
            goto L_0x0023
        L_0x002a:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x002a }
            throw r0
        L_0x002d:
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException     // Catch:{ all -> 0x0033 }
            r0.<init>()     // Catch:{ all -> 0x0033 }
            throw r0     // Catch:{ all -> 0x0033 }
        L_0x0033:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0033 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.msys.mca.MailboxFutureImpl.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0008, code lost:
        if (r2.mSetResult != false) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean isCancelled() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.A00     // Catch:{ all -> 0x000d }
            if (r0 == 0) goto L_0x000a
            boolean r1 = r2.mSetResult     // Catch:{ all -> 0x000d }
            r0 = 1
            if (r1 == 0) goto L_0x000b
        L_0x000a:
            r0 = 0
        L_0x000b:
            monitor-exit(r2)
            return r0
        L_0x000d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.msys.mca.MailboxFutureImpl.isCancelled():boolean");
    }

    public final synchronized boolean isDisabled() {
        return this.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000a, code lost:
        if (isCancelled() != false) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean isDone() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.mSetResult     // Catch:{ all -> 0x000f }
            if (r0 != 0) goto L_0x000c
            boolean r1 = r2.isCancelled()     // Catch:{ all -> 0x000f }
            r0 = 0
            if (r1 == 0) goto L_0x000d
        L_0x000c:
            r0 = 1
        L_0x000d:
            monitor-exit(r2)
            return r0
        L_0x000f:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.msys.mca.MailboxFutureImpl.isDone():boolean");
    }

    public synchronized MailboxFutureImpl setNotification(String str, NotificationScope notificationScope) {
        if (this.mNotificationName == null && this.mNotificationScope == null) {
            str.getClass();
            this.mNotificationName = str;
            this.mNotificationScope = notificationScope;
            if (this.A00) {
                cancelNotificationCallback();
            }
        } else {
            throw new IllegalStateException("Cannot set multiple notifications");
        }
        return this;
    }

    public MailboxFutureImpl(AnonymousClass68L r2) {
        super(new C301365z4(r2));
        this.A01 = new C301365z4(r2);
        this.mMailboxApiHandleProvider = r2;
    }

    public void getResultBlocking(long j, TimeUnit timeUnit) {
        if (UI_THREAD.equals(Thread.currentThread())) {
            0KC.A0E("MailboxFutureImpl", "Do not block on Mailbox API calls from the UI thread because it will result in hangs in the UI.");
        }
        if (Execution.getExecutionContext() != 0) {
            throw new IllegalStateException("The task cannot run on any MSYS thread");
        }
        this.mCompletionCV.block(TimeUnit.MILLISECONDS.convert(j, timeUnit));
    }

    public void cancelNotificationCallback(boolean z) {
        cancelNotificationCallback();
        this.mCompletionCV.open();
    }

    private synchronized void cancelNotificationCallback() {
        NotificationScope notificationScope;
        String str = this.mNotificationName;
        if (!(str == null || (notificationScope = this.mNotificationScope) == null)) {
            this.mMailboxApiHandleProvider.AGQ(notificationScope, str);
        }
    }

    public final Object get() {
        try {
            return get(0, TimeUnit.MILLISECONDS);
        } catch (TimeoutException e) {
            throw new IllegalStateException(e);
        }
    }
}
