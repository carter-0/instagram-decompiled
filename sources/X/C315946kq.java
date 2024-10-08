package X;

import android.content.Context;

/* renamed from: X.6kq  reason: invalid class name and case insensitive filesystem */
public final class C315946kq implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C315936kp A01;

    public C315946kq(Context context, C315936kp r2) {
        this.A01 = r2;
        this.A00 = context;
    }

    public final void run() {
        C315936kp r3 = this.A01;
        C315956kr r2 = new C315956kr(r3);
        r3.A01 = r2;
        C315966ks r1 = new C315966ks(this.A00, r2);
        r3.A00 = r1;
        r1.A06 = 0;
        r1.A0A = false;
    }
}
