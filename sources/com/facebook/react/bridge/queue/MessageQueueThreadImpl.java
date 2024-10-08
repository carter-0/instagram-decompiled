package com.facebook.react.bridge.queue;

import X.002;
import X.0I1;
import X.AnonymousClass7TF;
import X.C10222Rod;
import X.C41845B3m;
import X.C9533RcW;
import X.Pxg;
import X.Q7o;
import X.S9A;
import X.SEQ;
import X.TCG;
import X.TCH;
import X.TG6;
import X.TO9;
import android.os.Looper;
import android.util.Pair;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class MessageQueueThreadImpl implements MessageQueueThread {
    public final Looper A00;
    public final C9533RcW A01;
    public final String A02;
    public final Q7o A03;
    public final String A04;
    public volatile boolean A05 = false;

    public void quitSynchronous() {
        this.A05 = true;
        Looper looper = this.A00;
        looper.quit();
        if (looper.getThread() != Thread.currentThread()) {
            try {
                looper.getThread().join();
            } catch (InterruptedException unused) {
                throw Pxg.A0k("Got interrupted waiting to join thread ", this.A02);
            }
        }
    }

    public static MessageQueueThreadImpl A00(C10222Rod rod, SEQ seq) {
        Looper looper;
        C9533RcW rcW;
        int intValue = seq.A00.intValue();
        String str = seq.A01;
        if (intValue != 0) {
            TO9 to9 = new TO9();
            new Thread((ThreadGroup) null, new TCG(to9), 002.A0R("mqt_", str), 0).start();
            try {
                Pair pair = (Pair) to9.get();
                looper = (Looper) pair.first;
                rcW = (C9533RcW) pair.second;
            } catch (InterruptedException e) {
                throw C41845B3m.A0j(e);
            } catch (ExecutionException e2) {
                throw C41845B3m.A0j(e2);
            }
        } else {
            looper = Looper.getMainLooper();
            rcW = null;
        }
        return new MessageQueueThreadImpl(looper, rod, rcW, str);
    }

    public Future callOnQueue(Callable callable) {
        TO9 to9 = new TO9();
        runOnQueue(new TG6(to9, callable));
        return to9;
    }

    public C9533RcW getPerfStats() {
        return this.A01;
    }

    public boolean isIdle() {
        return this.A00.getQueue().isIdle();
    }

    public boolean isOnThread() {
        return AnonymousClass7TF.A1W(this.A00.getThread(), Thread.currentThread());
    }

    public void resetPerfStats() {
        runOnQueue(new TCH(this));
    }

    public boolean runOnQueue(Runnable runnable) {
        if (this.A05) {
            0I1.A04("ReactNative", 002.A0g("Tried to enqueue runnable on already finished thread: '", this.A02, "... dropping Runnable."));
            return false;
        }
        this.A03.post(runnable);
        return true;
    }

    public MessageQueueThreadImpl(Looper looper, C10222Rod rod, C9533RcW rcW, String str) {
        this.A02 = str;
        this.A00 = looper;
        this.A03 = new Q7o(looper, rod);
        this.A01 = rcW;
        this.A04 = 002.A0g("Expected to be called from the '", this.A02, "' thread!");
    }

    public void assertIsOnThread(String str) {
        S9A.A00(isOnThread(), 002.A0g(this.A04, " ", str));
    }

    public void assertIsOnThread() {
        S9A.A00(isOnThread(), this.A04);
    }
}
