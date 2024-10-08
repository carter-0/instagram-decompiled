package X;

import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Dhr  reason: case insensitive filesystem */
public abstract class C46611Dhr {
    public static void A0C(IgBloksScreenConfig igBloksScreenConfig, C307786Rm r3, C307896Rx r4, C276544tV r5) {
        C46615Dhv A00 = C46616Dhw.A00((C20880X2h) null, r3, r4, A02(r5));
        if (A00 != null) {
            igBloksScreenConfig.A07(A00);
        }
    }

    public static int A00(C276544tV r2) {
        int i;
        if (AnonymousClass7TF.A1S(r2.A04, 13647)) {
            i = 44;
        } else if (A0F(r2)) {
            i = 49;
        } else {
            throw AnonymousClass7TE.A0w("screen should be an instance of BloksScreenData or BloksScreenV2Data");
        }
        return r2.A03(i, 0);
    }

    public static C276544tV A02(C276544tV r2) {
        int i;
        if (r2.A04 == 13647) {
            i = 38;
        } else if (A0F(r2)) {
            C276544tV A07 = r2.A07(51);
            if (A07 != null) {
                return A07;
            }
            i = 41;
        } else {
            throw AnonymousClass7TE.A0w("screen should be an instance of BloksScreenData or BloksScreenV2Data");
        }
        return r2.A07(i);
    }

    public static C277014uI A04(C276544tV r2) {
        int i;
        if (r2.A04 == 13647) {
            i = 48;
        } else if (A0F(r2)) {
            i = 44;
        } else {
            throw AnonymousClass7TE.A0w("screen should be an instance of BloksScreenData or BloksScreenV2Data");
        }
        return r2.A0A(i);
    }

    public static String A06(C276544tV r2) {
        if (r2.A04 == 13647) {
            String A0D = r2.A0D();
            A0D.getClass();
            return DbV.A11(r2, A0D, 50);
        } else if (A0F(r2)) {
            return r2.A0J();
        } else {
            throw AnonymousClass7TE.A0w("screen should be an instance of BloksScreenData or BloksScreenV2Data");
        }
    }

    public static String A07(C276544tV r2) {
        String A0D;
        if (r2.A04 != 13647) {
            if (A0F(r2)) {
                C276544tV A03 = A03(A09(r2), 15855);
                if (A03 != null) {
                    A0D = A03.A0E();
                    A0D.getClass();
                    return A0D;
                }
            } else {
                throw AnonymousClass7TE.A0w("screen should be an instance of BloksScreenData or BloksScreenV2Data");
            }
        }
        A0D = r2.A0D();
        A0D.getClass();
        return A0D;
    }

    public static String A08(C276544tV r2) {
        int i;
        if (AnonymousClass7TF.A1S(r2.A04, 13647)) {
            i = 40;
        } else if (A0F(r2)) {
            i = 45;
        } else {
            throw AnonymousClass7TE.A0w("screen should be an instance of BloksScreenData or BloksScreenV2Data");
        }
        return DbV.A11(r2, "0", i);
    }

    public static Map A0A(C307896Rx r2, C276544tV r3) {
        if (r3 == null || !A0F(r3) || r3.A0A(56) == null) {
            return AnonymousClass7TE.A1E();
        }
        return (Map) C299275ur.A00(r2, AnonymousClass6Tm.A01, r3.A0A(56));
    }

    public static Map A0B(C307896Rx r2, C276544tV r3, int i) {
        if (r3 == null || r3.A0A(i) == null) {
            return AnonymousClass7TE.A1E();
        }
        return (Map) C299275ur.A00(r2, AnonymousClass6Tm.A01, r3.A0A(i));
    }

    public static boolean A0E(C276544tV r2) {
        if (r2.A04 == 13647 || A0F(r2)) {
            return true;
        }
        return false;
    }

    public static boolean A0F(C276544tV r1) {
        return AnonymousClass7TF.A1S(r1.A04, 13784);
    }

    public static C3034368u A01(C307896Rx r4, C276544tV r5) {
        C277014uI A0A;
        Object obj;
        if (!A0F(r5) || (A0A = r5.A0A(54)) == null) {
            return null;
        }
        try {
            obj = AnonymousClass6Tn.A00(r4, AnonymousClass6Tm.A01, A0A);
        } catch (AnonymousClass6QV e) {
            1Kn.A00(r4.A03, "BloksScreenUtils", "Failed executing ACTION_LOADED_SCREEN_PARSE_RESULT, returning empty parse result", e);
            obj = C3034368u.A00(r4, new C276544tV(13320));
        }
        return (C3034368u) obj;
    }

    public static C276544tV A03(List list, int i) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C276544tV r1 = (C276544tV) it.next();
            if (r1.A04 == i) {
                return r1;
            }
        }
        return null;
    }

    public static String A05(C276544tV r1) {
        if (A0F(r1)) {
            return r1.A0K(55);
        }
        return null;
    }

    public static List A09(C276544tV r1) {
        if (A0F(r1)) {
            Object A00 = C276544tV.A00(r1, 42);
            if (A00 instanceof List) {
                return (List) A00;
            }
        }
        return Collections.emptyList();
    }

    public static void A0D(IgBloksScreenConfig igBloksScreenConfig, C276544tV r2) {
        if (A0E(r2)) {
            igBloksScreenConfig.A0A = A04(r2);
        }
    }
}
