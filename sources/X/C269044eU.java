package X;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.4eU  reason: invalid class name and case insensitive filesystem */
public class C269044eU extends C269034eT implements Serializable {
    public static final C269134ed A00;
    public static final C269134ed A01;
    public static final C269134ed A02;
    public static final C269134ed A03;
    public static final C269134ed A04;

    public final SJu A06(C268894eF r7, C269144ee r8, C269124ec r9, boolean z) {
        C10974S3i qkA;
        C268894eF r1 = r7;
        C269144ee r2 = r8;
        C269054eV A002 = STz.A00(r7, r8, r9);
        if (r7.A0P()) {
            qkA = new C8200Qk9(r8, A002);
        } else {
            qkA = new C8201QkA(r8, A002, "set");
        }
        return new SJu(r1, r2, qkA, A002, z);
    }

    static {
        Class<Object> cls = Object.class;
        Class<String> cls2 = String.class;
        A04 = new C269134ed(C268934eJ.A00(cls2), (C269144ee) null, new C269054eV(cls2), Collections.emptyList());
        Class cls3 = Boolean.TYPE;
        A00 = new C269134ed(C268934eJ.A00(cls3), (C269144ee) null, new C269054eV(cls3), Collections.emptyList());
        Class cls4 = Integer.TYPE;
        A01 = new C269134ed(C268934eJ.A00(cls4), (C269144ee) null, new C269054eV(cls4), Collections.emptyList());
        Class cls5 = Long.TYPE;
        A02 = new C269134ed(C268934eJ.A00(cls5), (C269144ee) null, new C269054eV(cls5), Collections.emptyList());
        A03 = new C269134ed(C268934eJ.A00(cls), (C269144ee) null, new C269054eV(cls), Collections.emptyList());
    }

    public static final C269134ed A00(C268894eF r3, C269144ee r4) {
        Class<Boolean> cls;
        Class<Boolean> cls2 = r3.A00;
        if (cls2.isPrimitive()) {
            if (cls2 != Integer.TYPE) {
                if (cls2 != Long.TYPE) {
                    cls = Boolean.TYPE;
                }
                return A02;
            }
            return A01;
        } else if (C269574fL.A0J(cls2)) {
            if (cls2 == Object.class) {
                return A03;
            }
            if (cls2 == String.class) {
                return A04;
            }
            if (cls2 != Integer.class) {
                if (cls2 != Long.class) {
                    cls = Boolean.class;
                }
                return A02;
            }
            return A01;
        } else if (C252503pD.class.isAssignableFrom(cls2)) {
            return new C269134ed(r3, r4, new C269054eV(cls2), Collections.emptyList());
        } else {
            return null;
        }
        if (cls2 == cls) {
            return A00;
        }
        return null;
    }

    public C269134ed A02(C269454f9 r3, C268894eF r4, C269124ec r5) {
        C269134ed A002 = A00(r4, r3);
        if (A002 != null) {
            return A002;
        }
        C269134ed A042 = A04(r4, r3);
        if (A042 == null) {
            return new C269134ed(A06(r4, r3, r5, false));
        }
        return A042;
    }

    public C269134ed A03(C268894eF r3, C269294et r4, C269124ec r5) {
        C269134ed A002 = A00(r3, r4);
        if (A002 != null) {
            return A002;
        }
        C269134ed A042 = A04(r3, r4);
        if (A042 == null) {
            return new C269134ed(A06(r3, r4, r5, true));
        }
        return A042;
    }

    public final C269134ed A04(C268894eF r4, C269144ee r5) {
        if (!r4.A0N() || (r4 instanceof AnonymousClass4iN)) {
            return null;
        }
        Class cls = r4.A00;
        if (!C269574fL.A0J(cls)) {
            return null;
        }
        if (Collection.class.isAssignableFrom(cls) || Map.class.isAssignableFrom(cls)) {
            return new C269134ed(r4, r5, STz.A00(r4, r5, r5), Collections.emptyList());
        }
        return null;
    }

    public final C269134ed A05(C268894eF r4, C269144ee r5, C269124ec r6) {
        C269054eV A06;
        C269134ed A002 = A00(r4, r5);
        if (A002 != null) {
            return A002;
        }
        if (r4 instanceof AnonymousClass4iN) {
            A06 = new C269054eV(r4.A00);
        } else {
            A06 = new STz(r4, r5, r6).A06();
        }
        return new C269134ed(r4, r5, A06, Collections.emptyList());
    }
}
