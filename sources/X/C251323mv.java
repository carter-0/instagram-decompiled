package X;

import android.graphics.Rect;

/* renamed from: X.3mv  reason: invalid class name and case insensitive filesystem */
public abstract class C251323mv {
    public abstract Object A0A();

    public void A0B(Rect rect, C245753dQ r2, Object obj) {
    }

    public void A0C(C245753dQ r1) {
    }

    public void A0D(C245753dQ r2) {
        if (this instanceof C245803dV) {
            C245803dV.A03(r2);
        }
    }

    public void A0E(C245753dQ r3) {
        if (this instanceof C251313mu) {
            r3.A00();
            C245773dS r1 = (C245773dS) r3.A02;
            r1.A00 = null;
            r1.A02 = null;
            r1.A01 = null;
        } else if (this instanceof C245803dV) {
            C245823dX r12 = (C245823dX) r3.A02;
            r12.A05.setEmpty();
            r12.A01 = null;
        } else if (this instanceof C245643dF) {
            r3.A00();
            C245793dU r13 = (C245793dU) r3.A02;
            r13.A04.setEmpty();
            r13.A06.clear();
        }
    }

    public final String A09() {
        Class<?> cls = getClass();
        String name = cls.getName();
        if (name.length() <= 80) {
            return 002.A0g("<cls>", name, "</cls>");
        }
        String simpleName = cls.getSimpleName();
        0qQ.A07(simpleName);
        return simpleName;
    }
}
