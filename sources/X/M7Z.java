package X;

public final class M7Z implements Runnable {
    public final /* synthetic */ AnonymousClass3M8 A00;
    public final /* synthetic */ C66536MVq A01;

    public M7Z(AnonymousClass3M8 r1, C66536MVq mVq) {
        this.A00 = r1;
        this.A01 = mVq;
    }

    public final void run() {
        C66536MVq mVq;
        AnonymousClass3M8 r2 = this.A00;
        if (r2.A0B == AnonymousClass05K.A0C) {
            LQT lqt = r2.A06;
            if (lqt != null) {
                mVq = lqt.A02;
            } else {
                mVq = null;
            }
            if (mVq == this.A01) {
                AnonymousClass3M8.A02(r2);
            }
        }
    }
}
