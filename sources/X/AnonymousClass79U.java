package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.79U  reason: invalid class name */
public final class AnonymousClass79U {
    public static final String A00(C254703su r3) {
        0qQ.A0B(r3, 0);
        2FW r1 = r3.A10;
        AnonymousClass79V r0 = AnonymousClass79V.$redex_init_class;
        int ordinal = r1.ordinal();
        if (ordinal == 2) {
            Object obj = r3.A1T;
            if (obj instanceof List) {
                0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
                ArrayList arrayList = new ArrayList();
                for (Object next : (List) obj) {
                    if (next instanceof String) {
                        arrayList.add(next);
                    }
                }
                obj = 00k.A0L(arrayList);
            } else if (!(obj instanceof String)) {
                return "";
            } else {
                0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.String");
            }
            return (String) obj;
        } else if (ordinal != 11) {
            return r3.A1q;
        } else {
            Object obj2 = r3.A1T;
            0qQ.A0C(obj2, "null cannot be cast to non-null type com.instagram.direct.model.DirectLink");
            return ((C376649Iu) obj2).A01;
        }
    }

    public static final boolean A01(UserSession userSession, C254703su r6) {
        String str;
        if (!182.A06(0Tu.A05, userSession, 36319407392759087L)) {
            return true;
        }
        synchronized (r6) {
            str = r6.A1g;
        }
        if (str == null) {
            return false;
        }
        return !0qQ.A0K(00l.A0R(str, new String[]{"_"}, 0).get(0), 00l.A0R(AnonymousClass1Q2.A00(), new String[]{"_"}, 0).get(0));
    }

    public static final boolean A03(C254703su r3) {
        String str;
        String A0o;
        synchronized (r3) {
            str = r3.A1s;
        }
        if (!00p.A0j(str, AnonymousClass1Q2.A00(), false) || (A0o = r3.A0o()) == null || A0o.length() == 0) {
            return false;
        }
        return true;
    }

    public static final boolean A02(AnonymousClass7LQ r3) {
        String str;
        String A0o;
        C254703su r32 = r3.A0e;
        synchronized (r32) {
            str = r32.A1s;
        }
        if (!00p.A0j(str, AnonymousClass1Q2.A00(), false) || (A0o = r32.A0o()) == null || A0o.length() == 0) {
            return false;
        }
        return true;
    }

    public final String A04(UserSession userSession, AnonymousClass7LQ r8) {
        String A00;
        C254703su r2 = r8.A0e;
        String A0o = r2.A0o();
        if (A0o == null || !A02(r8) || r8.A0N != AnonymousClass05K.A01) {
            A0o = A00(r2);
            if (A0o == null) {
                return "";
            }
        } else if ((r8.A0G.A08 != 29 || 0qQ.A0K(userSession.A06, r2.BsI())) && (A00 = A00(r2)) != null) {
            int length = A00.length();
            r8.A09 = new C53368Gms(length, length + 1 + A0o.length(), 14);
            return 002.A0T(A00, A0o, 10);
        }
        return A0o;
    }
}
