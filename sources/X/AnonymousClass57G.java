package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.57G  reason: invalid class name */
public final class AnonymousClass57G {
    public final AnonymousClass4DU A00;
    public final Map A01 = new HashMap();
    public final Map A02 = new HashMap();
    public final Map A03 = new HashMap();
    public final UserSession A04;
    public final C232842uX A05;

    public static String A00(AnonymousClass57G r2, 1Nv r3) {
        AnonymousClass4DU r1 = r2.A00;
        if (AnonymousClass3WX.A02(r3, r1)) {
            return 002.A0R(Integer.toHexString(C231122qu.A06(r2.A04, r3).hashCode()), r3.getId());
        }
        if (AnonymousClass3WX.A01(r3, r1)) {
            return r3.getId();
        }
        return null;
    }

    public static String A01(AnonymousClass57G r2, 1Nv r3, String str) {
        AnonymousClass4DU r1 = r2.A00;
        if (AnonymousClass3WX.A02(r3, r1)) {
            return 002.A0g(Integer.toHexString(C231122qu.A06(r2.A04, r3).hashCode()), r3.getId(), str);
        }
        if (AnonymousClass3WX.A01(r3, r1)) {
            return r3.getId();
        }
        return null;
    }

    public AnonymousClass57G(UserSession userSession, C232842uX r3, AnonymousClass4DU r4) {
        this.A00 = r4;
        this.A05 = r3;
        this.A04 = userSession;
    }

    public final void A02(1Nv r3, String str) {
        String A012 = A01(this, r3, str);
        if (AnonymousClass3WX.A02(r3, this.A00) && this.A01.remove(A012) != null) {
            System.currentTimeMillis();
        }
    }
}
