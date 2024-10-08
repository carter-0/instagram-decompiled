package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.P2y  reason: case insensitive filesystem */
public final class C72359P2y implements C74394PuA {
    public final Context A00;
    public final FragmentActivity A01;
    public final UserSession A02;
    public final AnonymousClass43Q A03;
    public final C70738OJg A04;
    public final 2Dm A05;
    public final N4P A06;
    public final C358618bC A07 = new C72739PHt(this, 8);
    public final C358618bC A08 = new C72739PHt(this, 9);
    public final AnonymousClass0eM A09;
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C;
    public final AnonymousClass0eM A0D;
    public final 0sL A0E;
    public final AnonymousClass2HN A0F;

    public C72359P2y(Context context, FragmentActivity fragmentActivity, UserSession userSession, C70738OJg oJg, N4P n4p) {
        0qQ.A0B(userSession, 3);
        this.A01 = fragmentActivity;
        this.A00 = context;
        this.A02 = userSession;
        this.A06 = n4p;
        this.A04 = oJg;
        this.A05 = 1bJ.A00(userSession);
        this.A0F = 2HM.A00(userSession);
        this.A03 = AnonymousClass43P.A00(userSession);
        0eO r2 = 0eO.A02;
        this.A09 = AnonymousClass0eN.A00(r2, new C73899Pla(this, 10));
        this.A0E = new C59110J6s(this, 39);
        this.A0C = AnonymousClass0eN.A00(r2, new C73899Pla(this, 13));
        this.A0D = AnonymousClass0eN.A00(r2, new C73899Pla(this, 14));
        this.A0B = AnonymousClass0eN.A00(r2, new C73899Pla(this, 12));
        this.A0A = AnonymousClass0eN.A00(r2, new C73899Pla(this, 11));
    }

    public static final void A00(C72359P2y p2y, String str, String str2, boolean z) {
        if (str2 == null) {
            if (z) {
                str2 = "Failed to toggle TTLC";
            } else {
                str2 = "Cannot cutover this thread";
            }
        }
        C358248ab A0g = DbX.A0g(p2y.A00, str, str2);
        A0g.A0R(C71213Ofe.A00, C358278ae.BLUE, 2131968772);
        DbT.A1V(A0g);
    }

    public static final boolean A01(C72359P2y p2y, boolean z) {
        User user;
        String str;
        User A012 = AnonymousClass0t1.A01.A01(p2y.A02);
        AnonymousClass0eM r1 = p2y.A06.A0c;
        if (JTO.A15(r1).isEmpty()) {
            user = A012;
        } else {
            C68303N9q n9q = (C68303N9q) 00k.A0O(JTO.A15(r1), 0);
            if (n9q != null) {
                user = n9q.A00;
            }
            A00(p2y, "No target user found", (String) null, z);
            return false;
        }
        if (user != null) {
            Long BST = user.BST();
            int A0R = (int) AnonymousClass7TE.A0R(p2y.A0F.A1V.getValue());
            if (BST == null || BST.longValue() <= 0) {
                str = "Target user has no eimu id";
            } else if (user.BIW() != 0 || 2Ek.A03(user)) {
                str = "Target is not a normal IG account (could be a fb/professional/creator/business account)";
            } else if (!user.A1c()) {
                str = "Target user is not eligible for WA infra (waAddressable = false)";
            } else if (!A012.A1c()) {
                str = "Current user is not eligible for WA infra (waAddressable = false)";
            } else if (A0R > 0 || (str = 002.A0O("Current user is not e2ee eligible, eligibility level: ", A0R)) == null) {
                return true;
            }
            A00(p2y, str, (String) null, z);
            return false;
        }
        A00(p2y, "No target user found", (String) null, z);
        return false;
    }

    public final boolean isEnabled() {
        UserSession userSession = this.A02;
        if (2Aj.A01(userSession) || 2Aj.A00(userSession) || 182.A06(0Tu.A05, userSession, 36329955830940040L)) {
            N4P n4p = this.A06;
            if (!(n4p.A08() instanceof DirectThreadKey) || N4P.A05(n4p)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final List getItems() {
        ArrayList A1C = AnonymousClass7TE.A1C();
        UserSession userSession = this.A02;
        if (2Aj.A01(userSession)) {
            A1C.add(this.A09.getValue());
        }
        if (2Aj.A00(userSession)) {
            A1C.add(this.A0C.getValue());
            A1C.add(this.A0D.getValue());
        }
        if (182.A06(0Tu.A05, userSession, 36329955830940040L)) {
            A1C.add(this.A0B.getValue());
        }
        if (2Aj.A01(userSession) || 2Aj.A00(userSession)) {
            A1C.add(this.A0A.getValue());
        }
        return A1C;
    }
}
