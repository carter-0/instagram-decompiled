package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.enums.EnumEntries;

/* renamed from: X.SRg  reason: case insensitive filesystem */
public abstract class C11392SRg {
    public static final Integer A00(C10860RzL rzL) {
        0qQ.A0B(rzL, 0);
        QP6 qp6 = rzL.A06;
        if (!Pxj.A1Y(SDK.A0B, (Iterable) qp6.A00)) {
            return AnonymousClass05K.A00;
        }
        if (Pxj.A1Y(SDK.A06, (Iterable) qp6.A00)) {
            return AnonymousClass05K.A0C;
        }
        return AnonymousClass05K.A01;
    }

    public static final String A02(C10860RzL rzL) {
        0qQ.A0B(rzL, 0);
        QP6 qp6 = rzL.A06;
        if (!Pxj.A1Y(SDK.A0B, (Iterable) qp6.A00)) {
            return "CONTACT_AUTOFILL";
        }
        if (Pxj.A1Y(SDK.A06, (Iterable) qp6.A00)) {
            return "CONTACT_AND_PAYMENT_AUTOFILL";
        }
        return "PAYMENT_AUTOFILL";
    }

    public static final boolean A03(C10860RzL rzL) {
        0qQ.A0B(rzL, 0);
        QP6 qp6 = rzL.A06;
        if (qp6.A06 == null || A04(rzL) || !SDK.A03.contains(qp6.A06)) {
            return false;
        }
        return true;
    }

    public static final boolean A04(C10860RzL rzL) {
        0qQ.A0B(rzL, 0);
        EnumEntries<RFU> enumEntries = RFU.A01;
        ArrayList<Object> A0r = AnonymousClass7TG.A0r(enumEntries);
        for (RFU rfu : enumEntries) {
            A0r.add(rfu.A00);
        }
        if (!(A0r instanceof Collection) || !A0r.isEmpty()) {
            for (Object A0K : A0r) {
                if (0qQ.A0K(A0K, rzL.A06.A06)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final String A01(RFU rfu, C10860RzL rzL) {
        return String.valueOf(((Set) rzL.A06.A02).contains(rfu.A00));
    }
}
