package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3sN  reason: invalid class name and case insensitive filesystem */
public abstract class C254373sN {
    public static final C230432pc A02(String str) {
        0qQ.A0B(str, 0);
        if (str.equals("feed_timeline")) {
            return C230432pc.FEED;
        }
        if (00p.A0k(str, "reel_", false)) {
            return C230432pc.STORIES;
        }
        if (00p.A0k(str, "clips_viewer_", false)) {
            return C230432pc.CLIPS;
        }
        return C230432pc.UNKNOWN;
    }

    public static final String A03(UserSession userSession, 1Xj r2) {
        0qQ.A0B(userSession, 1);
        String A06 = C231122qu.A06(userSession, r2);
        if (A06 == null) {
            return "";
        }
        return A06;
    }

    public static final String A04(UserSession userSession, 1Xl r4) {
        String A2n;
        0qQ.A0B(userSession, 1);
        if (r4 == null) {
            return "n/a";
        }
        if (r4 instanceof AnonymousClass3OA) {
            return ((AnonymousClass3OA) r4).A0S;
        }
        boolean CcK = r4.BPf().CcK();
        1Xj BPf = r4.BPf();
        if (CcK) {
            A2n = C231122qu.A07(userSession, BPf);
        } else {
            A2n = BPf.A2n();
        }
        if (A2n == null) {
            return "n/a";
        }
        return A2n;
    }

    public static final int A00(1Xj r0) {
        Integer A2P;
        if (r0 == null || (A2P = r0.A2P()) == null) {
            return -1;
        }
        return A2P.intValue();
    }

    public static final AnonymousClass9JO A01(1Xj r8) {
        String str;
        String str2;
        if (r8 == null) {
            return new AnonymousClass9JO(2);
        }
        r8.CcK();
        String A2R = r8.A2R();
        if (A2R == null) {
            A2R = "";
        }
        String A2V = r8.A2V();
        if (A2V == null) {
            A2V = "";
        }
        C250513lZ injected = r8.A0C.getInjected();
        if (injected == null || (str = injected.Ac5()) == null || str.equals("0")) {
            str = "";
        }
        String A2r = r8.A2r();
        if (A2r == null) {
            A2r = "";
        }
        C250513lZ injected2 = r8.A0C.getInjected();
        if (injected2 == null || (str2 = injected2.AYn()) == null) {
            str2 = "";
        }
        String id = r8.getId();
        if (id != null) {
            return new AnonymousClass9JO(A2R, A2V, str, 2, A2r, str2, id);
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final String A06(String str) {
        if (0qQ.A0K(str, "media_or_ad")) {
            return "user_connected";
        }
        if (0qQ.A0K(str, "explore_story")) {
            return "explore_unconnected";
        }
        return "n/a";
    }

    public static final String A05(1Xj r3, AnonymousClass3W1 r4) {
        String id;
        List Alu;
        if ((!r3.A5D() || ((Alu = r3.A0C.Alu()) != null && (r3 = (1Xj) Alu.get(r4.A0B)) != null)) && (id = r3.getId()) != null) {
            return id;
        }
        return "n/a";
    }

    public static final List A07(1Xj r2) {
        List<1Xj> Alu;
        if (!r2.A5D() || (Alu = r2.A0C.Alu()) == null) {
            return 0sn.A00;
        }
        ArrayList arrayList = new ArrayList(0Yv.A1E(Alu, 10));
        for (1Xj id : Alu) {
            String id2 = id.getId();
            if (id2 != null) {
                arrayList.add(id2);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return arrayList;
    }
}
