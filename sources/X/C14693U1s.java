package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import java.util.List;

/* renamed from: X.U1s  reason: case insensitive filesystem */
public final class C14693U1s extends Handler {
    public final /* synthetic */ W1D A00;

    public final void handleMessage(Message message) {
        C18594Vul vul;
        C340397lC r0;
        List<C21028XAh> list;
        C340297l2 r2;
        C340397lC r02;
        0qQ.A0B(message, 0);
        int i = message.what;
        switch (i) {
            case 1:
                W1D w1d = this.A00;
                Object obj = message.obj;
                0qQ.A0C(obj, "null cannot be cast to non-null type android.view.Surface");
                w1d.A02 = (Surface) obj;
                W1D.A02(w1d);
                U0U u0u = new U0U();
                11Z.A02(new C20258Wnx(u0u, w1d.A04));
                w1d.A03 = u0u;
                return;
            case 2:
                W1D w1d2 = this.A00;
                C14968UHg uHg = w1d2.A05;
                if (uHg != null && (r02 = w1d2.A08.A04.A04) != null) {
                    r02.A9i(uHg);
                    return;
                }
                return;
            case 3:
                Object obj2 = message.obj;
                if ((obj2 instanceof List) && (list = (List) obj2) != null) {
                    W1D w1d3 = this.A00;
                    W1D.A01(w1d3);
                    for (C21028XAh xAh : list) {
                        xAh.EcM(new VU4(xAh, w1d3));
                        W1D.A00(xAh, w1d3);
                    }
                    w1d3.A06 = true;
                    11Z.A02(new C20098Wkw(w1d3.A04));
                    C340307l3 r22 = w1d3.A07;
                    if ((r22 instanceof C340297l2) && (r2 = (C340297l2) r22) != null) {
                        r2.A0P(AnonymousClass80L.A00, "");
                        return;
                    }
                    return;
                }
                return;
            case 4:
                W1D.A01(this.A00);
                return;
            case 5:
                W1D w1d4 = this.A00;
                C14968UHg uHg2 = w1d4.A05;
                if (!(uHg2 == null || (r0 = w1d4.A08.A04.A04) == null)) {
                    r0.EEM(uHg2);
                }
                U0U u0u2 = w1d4.A03;
                if (u0u2 != null) {
                    u0u2.release();
                    w1d4.A03 = null;
                }
                11Z.A02(new C20100Wky(w1d4.A04));
                return;
            case 6:
                W1D w1d5 = this.A00;
                int i2 = message.arg1;
                int i3 = message.arg2;
                w1d5.A01 = i2;
                w1d5.A00 = i3;
                W1D.A02(w1d5);
                return;
            case 7:
                Object obj3 = message.obj;
                if ((obj3 instanceof C18594Vul) && (vul = (C18594Vul) obj3) != null) {
                    C14968UHg uHg3 = this.A00.A05;
                    if (uHg3 != null) {
                        uHg3.A01 = vul;
                        uHg3.A00 = 0;
                        return;
                    }
                    vul.A03(new IllegalStateException("View hasn't been setup yet"));
                    return;
                }
                return;
            default:
                throw DbW.A0a("Invalid msg what: ", i);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14693U1s(Looper looper, W1D w1d) {
        super(looper);
        this.A00 = w1d;
    }
}
