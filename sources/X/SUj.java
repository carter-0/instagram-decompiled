package X;

import com.facebookpay.common.recyclerview.adapteritems.PuxAccordionItem;
import com.facebookpay.expresscheckout.models.TransactionInfo;
import java.util.AbstractCollection;
import java.util.List;

public final class SUj {
    public final C8882RDz A00;
    public final Object A01;
    public final Throwable A02;

    public static SUj A02() {
        return A08((Object) null);
    }

    public static SUj A0B(Throwable th) {
        return A0A((Object) null, th);
    }

    public static TransactionInfo A01(QDN qdn) {
        return (TransactionInfo) qdn.A0S.A01;
    }

    public static SUj A03(1MD r1, SUj sUj) {
        return A06(sUj, r1.apply(sUj.A01));
    }

    public static SUj A04(1MD r1, SUj sUj) {
        Object obj;
        Object obj2 = sUj.A01;
        if (obj2 != null) {
            obj = r1.apply(obj2);
        } else {
            obj = null;
        }
        return A06(sUj, obj);
    }

    public static SUj A05(RH6 rh6, C10781Ry2 ry2, SUj sUj, List list, boolean z) {
        return A09(new PuxAccordionItem(rh6, ry2, sUj, list, z));
    }

    public static SUj A06(SUj sUj, Object obj) {
        return new SUj(sUj.A00, obj, sUj.A02);
    }

    public static SUj A07(Integer num, Object obj, String str) {
        return A09(new C10575RuU(num, obj, str));
    }

    public static SUj A08(Object obj) {
        return new SUj(C8882RDz.LOADING, obj, (Throwable) null);
    }

    public static SUj A09(Object obj) {
        return new SUj(C8882RDz.SUCCESS, obj, (Throwable) null);
    }

    public static SUj A0A(Object obj, Throwable th) {
        return new SUj(C8882RDz.ERROR, obj, th);
    }

    public static Object A0D(SUj sUj) {
        Object obj = sUj.A01;
        obj.getClass();
        return obj;
    }

    public static void A0F(AnonymousClass07Z r2, 2Fk r3, AnonymousClass2gO r4) {
        r3.A06(r2, new C11648Sdq(r3, r4, 28));
    }

    public static void A0G(AnonymousClass07Z r2, 2Fk r3, AnonymousClass2gO r4) {
        r3.A06(r2, new C11648Sdq(r3, r4, 29));
    }

    public static void A0H(2Fk r2, AnonymousClass2gO r3) {
        r2.A09(new C11648Sdq(r2, r3, 26));
    }

    public static void A0J(2Fk r1, Integer num, Object obj, String str) {
        r1.A0B(A09(new C10575RuU(num, obj, str)));
    }

    public static void A0N(QDP qdp, SUj sUj) {
        qdp.A06.A0B(sUj.A00);
        qdp.A05.A0B(Boolean.valueOf(A0T(sUj)));
    }

    public static boolean A0S(SUj sUj) {
        if (sUj == null || sUj.A00 != C8882RDz.ERROR) {
            return false;
        }
        return true;
    }

    public static boolean A0T(SUj sUj) {
        if (sUj == null || sUj.A00 != C8882RDz.LOADING) {
            return false;
        }
        return true;
    }

    public static boolean A0U(SUj sUj) {
        if (sUj != null && sUj.A00 == C8882RDz.LOADING && sUj.A01 == null) {
            return true;
        }
        return false;
    }

    public static boolean A0V(SUj sUj) {
        if (sUj == null || sUj.A00 != C8882RDz.SUCCESS) {
            return false;
        }
        return true;
    }

    public SUj(C8882RDz rDz, Object obj, Throwable th) {
        this.A00 = rDz;
        this.A01 = obj;
        this.A02 = th;
    }

    public static AnonymousClass2Fj A00(Object obj) {
        return new 2Fk(A08(obj));
    }

    public static Object A0C(2Fk r0) {
        Object obj = ((SUj) r0.A02()).A01;
        obj.getClass();
        return obj;
    }

    public static void A0E(1MD r0, 2Fk r1, SUj sUj) {
        r1.A0B(A03(r0, sUj));
    }

    public static void A0I(2Fk r1, SUj sUj, Object obj) {
        r1.A0B(A06(sUj, obj));
    }

    public static void A0K(2Fk r1, Object obj) {
        r1.A0B(A09(obj));
    }

    public static void A0L(2Fk r1, Object obj) {
        r1.A0B(A08(obj));
    }

    public static void A0M(2Fk r1, Object obj, Throwable th) {
        r1.A0B(A0A(obj, th));
    }

    public static void A0O(Object obj, AbstractCollection abstractCollection) {
        abstractCollection.add(A09(obj));
    }

    public static boolean A0P(2Fk r0) {
        return A0S((SUj) r0.A02());
    }

    public static boolean A0Q(2Fk r0) {
        return A0V((SUj) r0.A02());
    }

    public static boolean A0R(2Fk r0) {
        return A0T((SUj) r0.A02());
    }
}
