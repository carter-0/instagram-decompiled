package X;

import android.os.Looper;
import android.view.Surface;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class W1D {
    public int A00;
    public int A01;
    public Surface A02;
    public U0U A03;
    public LPE A04;
    public C14968UHg A05;
    public boolean A06;
    public final C340307l3 A07;
    public final AnonymousClass82X A08;
    public final C14693U1s A09;
    public final Map A0A = new HashMap();

    public static final void A01(W1D w1d) {
        C340297l2 r1;
        w1d.A06 = false;
        Map map = w1d.A0A;
        Iterator A0v = AnonymousClass7TF.A0v(map);
        while (A0v.hasNext()) {
            AnonymousClass8KU r12 = (AnonymousClass8KU) A0v.next();
            AnonymousClass82X r0 = w1d.A08;
            0qQ.A0B(r12, 0);
            C340397lC r02 = r0.A04.A04;
            if (r02 != null) {
                r02.EEM(r12);
            }
        }
        map.clear();
        11Z.A02(new C20099Wkx(w1d.A04));
        C340307l3 r13 = w1d.A07;
        if ((r13 instanceof C340297l2) && (r1 = (C340297l2) r13) != null) {
            r1.A0D();
        }
    }

    public static final void A00(C21028XAh xAh, W1D w1d) {
        LPE lpe = w1d.A04;
        Map map = w1d.A0A;
        C14969UHh uHh = new C14969UHh(lpe, xAh, map.isEmpty());
        C340397lC r0 = w1d.A08.A04.A04;
        if (r0 != null) {
            r0.A9i(uHh);
        }
        map.put(xAh, uHh);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.UHg, X.8KU, X.8mi] */
    public static final void A02(W1D w1d) {
        int i;
        Surface surface = w1d.A02;
        if (surface != null) {
            C14968UHg uHg = w1d.A05;
            if (uHg != null) {
                uHg.A01(surface, w1d.A01, w1d.A00);
                return;
            }
            int i2 = w1d.A01;
            if (i2 > 0 && (i = w1d.A00) > 0) {
                ? r1 = new C365208mi(surface, AnonymousClass8KV.PREVIEW, i2, i);
                w1d.A05 = r1;
                C340397lC r0 = w1d.A08.A04.A04;
                if (r0 != null) {
                    r0.A9i(r1);
                }
            }
        }
    }

    public W1D(Looper looper, C340307l3 r3, AnonymousClass82X r4) {
        this.A08 = r4;
        this.A07 = r3;
        this.A09 = new C14693U1s(looper, this);
    }
}
