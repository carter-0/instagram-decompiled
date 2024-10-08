package X;

import android.os.Handler;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public final class AQX implements C341587nC {
    public C343487qI A00;
    public C341747nS A01;
    public AtomicLong A02 = new AtomicLong(0);
    public 0sL A03;
    public byte[] A04;
    public final C22555YAe A05;
    public final MTE A06;
    public volatile float A07;

    public final void A9l(Handler handler, C39897ADz aDz, C39732A6y a6y, C341687nM r5, C341747nS r6) {
        AnonymousClass7TF.A1D(r6, 0, handler);
        this.A01 = r6;
        handler.post(new C40909AlH(r5));
    }

    public final Map AvY() {
        return null;
    }

    public final void E3s(Handler handler, Handler handler2, C343487qI r18, C341687nM r19) {
        Handler handler3 = handler;
        C343487qI r8 = r18;
        boolean A1U = AnonymousClass7TF.A1U(0, r8, handler3);
        Handler handler4 = handler2;
        0qQ.A0B(handler4, 3);
        this.A00 = r8;
        this.A02 = new AtomicLong(0);
        C22018Xss xss = new C22018Xss(handler3, AQW.A00, r8, this.A05, A1U ? 1 : 0, 2, 0, false);
        C341687nM r4 = r19;
        xss.A04(r4, handler4);
        int length = this.A04.length;
        int i = xss.A00;
        if (length < i) {
            this.A04 = new byte[i];
        }
        0sL r2 = this.A03;
        if (r2 != null) {
            r2.invoke(xss, new C63822L8d(this.A06));
        }
        handler4.post(new C40910AlI(r4));
    }

    public final void EEP(Handler handler, C341687nM r3, C341747nS r4) {
        0qQ.A0B(handler, 2);
        this.A01 = null;
        handler.post(new C40911AlJ(r3));
    }

    public final void release() {
        this.A01 = null;
    }

    public AQX(MTE mte, int i, int i2) {
        this.A06 = mte;
        this.A04 = new byte[i2];
        this.A05 = new AQZ(this, i);
    }
}
