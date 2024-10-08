package X;

import java.util.List;

public abstract class SUi {
    public static final SK0 A00;
    public static final SK0 A01 = new SK0();
    public static final Class A02;

    static {
        Class<?> cls;
        SK0 sk0 = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        A02 = cls;
        try {
            Class<?> cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
            if (cls2 != null) {
                sk0 = (SK0) Pxh.A0e(cls2);
            }
        } catch (Throwable unused2) {
        }
        A00 = sk0;
    }

    public static SK0 A0C() {
        return A00;
    }

    public static SK0 A0D() {
        return A01;
    }

    public static boolean A0V(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int A00(C13845TiL tiL, Object obj, int i) {
        return C8567Qx5.A00(i << 3) + C8567Qx5.A02((C13957TmK) obj, tiL);
    }

    public static Object A0E(SK0 sk0, Object obj, Object obj2, int i, int i2) {
        if (obj2 == null) {
            obj2 = sk0.A03(obj);
        }
        sk0.A07(obj2, i, (long) i2);
        return obj2;
    }

    public static void A0G(C13865Tim tim, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            tim.FQV(i, z, list);
        }
    }

    public static void A0H(C13865Tim tim, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            tim.FOj(i, z, list);
        }
    }

    public static void A0I(C13865Tim tim, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            tim.FOl(i, z, list);
        }
    }

    public static void A0J(C13865Tim tim, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            tim.FOq(i, z, list);
        }
    }

    public static void A0K(C13865Tim tim, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            tim.FOs(i, z, list);
        }
    }

    public static void A0L(C13865Tim tim, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            tim.FPR(i, z, list);
        }
    }

    public static void A0M(C13865Tim tim, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            tim.FPt(i, z, list);
        }
    }

    public static void A0N(C13865Tim tim, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            tim.FQ7(i, z, list);
        }
    }

    public static void A0O(C13865Tim tim, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            tim.FQD(i, z, list);
        }
    }

    public static void A0P(C13865Tim tim, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            tim.FQG(i, z, list);
        }
    }

    public static void A0Q(C13865Tim tim, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            tim.FQJ(i, z, list);
        }
    }

    public static void A0R(C13865Tim tim, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            tim.FQM(i, z, list);
        }
    }

    public static void A0S(C13865Tim tim, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            tim.FQO(i, z, list);
        }
    }

    public static void A0T(C13865Tim tim, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            tim.FQS(i, z, list);
        }
    }

    public static void A0U(Class cls) {
        Class cls2;
        if (!C8563Qx1.class.isAssignableFrom(cls) && (cls2 = A02) != null && !cls2.isAssignableFrom(cls)) {
            throw AnonymousClass7TE.A0w("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static int A01(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C8564Qx2) {
            C8564Qx2 qx2 = (C8564Qx2) list;
            i = 0;
            while (i2 < size) {
                i += C8567Qx5.A01((long) qx2.A04(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C8567Qx5.A01((long) C51971G9r.A0I(list, i2));
                i2++;
            }
        }
        return i;
    }

    public static int A02(List list) {
        return list.size() * 4;
    }

    public static int A03(List list) {
        return list.size() * 8;
    }

    public static int A04(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C8564Qx2) {
            C8564Qx2 qx2 = (C8564Qx2) list;
            i = 0;
            while (i2 < size) {
                i += C8567Qx5.A01((long) qx2.A04(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C8567Qx5.A01((long) C51971G9r.A0I(list, i2));
                i2++;
            }
        }
        return i;
    }

    public static int A05(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += C8567Qx5.A01(Pxg.A0I(list, i2));
        }
        return i;
    }

    public static int A06(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C8564Qx2) {
            C8564Qx2 qx2 = (C8564Qx2) list;
            i = 0;
            while (i2 < size) {
                int A04 = qx2.A04(i2);
                i += C8567Qx5.A00((A04 >> 31) ^ (A04 + A04));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                int A0I = C51971G9r.A0I(list, i2);
                i3 = i + C8567Qx5.A00((A0I >> 31) ^ (A0I + A0I));
                i2++;
            }
        }
        return i;
    }

    public static int A07(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            long A0I = Pxg.A0I(list, i2);
            i += C8567Qx5.A01((A0I >> 63) ^ (A0I + A0I));
        }
        return i;
    }

    public static int A08(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C8564Qx2) {
            C8564Qx2 qx2 = (C8564Qx2) list;
            i = 0;
            while (i2 < size) {
                i += C8567Qx5.A00(qx2.A04(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C8567Qx5.A00(C51971G9r.A0I(list, i2));
                i2++;
            }
        }
        return i;
    }

    public static int A09(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += C8567Qx5.A01(Pxg.A0I(list, i2));
        }
        return i;
    }

    public static int A0A(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (SA4.A07(i) + 4);
    }

    public static int A0B(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (SA4.A07(i) + 8);
    }

    public static void A0F(SK0 sk0, Object obj, Object obj2) {
        sk0.A08(obj, sk0.A04(sk0.A02(obj), sk0.A02(obj2)));
    }
}
