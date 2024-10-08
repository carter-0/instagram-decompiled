package X;

import android.os.Looper;
import android.os.MessageQueue;

public final class OYc {
    public static final MessageQueue A02;
    public static final C69697NqJ A03 = new Object();
    public final 01W A00;
    public final C69697NqJ A01;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.NqJ] */
    static {
        MessageQueue myQueue = Looper.myQueue();
        0qQ.A07(myQueue);
        A02 = myQueue;
    }

    public OYc() {
        this(A03);
    }

    public OYc(C69697NqJ nqJ) {
        0qQ.A0B(nqJ, 1);
        this.A01 = nqJ;
        this.A00 = new 01W();
    }
}
