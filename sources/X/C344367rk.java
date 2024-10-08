package X;

import android.os.Handler;

/* renamed from: X.7rk  reason: invalid class name and case insensitive filesystem */
public final class C344367rk extends C344317rf implements C344377rl {
    public C365178mf A00;
    public C345557ti A01;
    public AJ3 A02;
    public volatile C344477rv A03;

    public final void A09() {
        this.A01 = new C345557ti(this.A00.getContext().getResources());
        this.A03 = (C344477rv) A0A(C344477rv.A01);
    }

    public final void AOr() {
        AJ3 aj3 = this.A02;
        if (aj3 != null) {
            Handler handler = aj3.A0K;
            handler.post(new C40740AiS(aj3));
            handler.post(new C40739AiR(aj3));
            handler.getLooper().quitSafely();
            this.A02 = null;
        }
    }

    public final C343717qg BJt() {
        return C344377rl.A00;
    }
}
