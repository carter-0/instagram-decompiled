package X;

import com.instagram.common.session.UserSession;
import com.instagram.profile.interest.ProfileInterestPickerViewModel$viewState$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.DlR  reason: case insensitive filesystem */
public final class C46792DlR extends 2YL {
    public static final 0xG A0E = DbS.A0O("profile_interest_picker_viewModel");
    public boolean A00;
    public boolean A01;
    public final UserSession A02;
    public final C49650F0h A03;
    public final E53 A04;
    public final List A05;
    public final C249513ju A06;
    public final AnonymousClass0r6 A07;
    public final AnonymousClass0r6 A08;
    public final 05G A09;
    public final 05G A0A;
    public final AnonymousClass0Ud A0B;
    public final String A0C;
    public final AnonymousClass0Ud A0D;

    public C46792DlR(UserSession userSession, C49650F0h f0h, E53 e53, String str) {
        ArrayList arrayList;
        C61082JwK jwK;
        AnonymousClass7TF.A1C(userSession, 1, e53);
        this.A02 = userSession;
        this.A03 = f0h;
        this.A04 = e53;
        this.A0C = str;
        List<C51954G8x> A0S = AnonymousClass7TF.A0Q(userSession).A0S();
        this.A05 = A0S;
        if (A0S != null) {
            arrayList = AnonymousClass7TG.A0r(A0S);
            for (C51954G8x g8x : A0S) {
                if (g8x == null || g8x.B6N() == null) {
                    jwK = null;
                } else {
                    jwK = new C61082JwK(g8x, true);
                }
                arrayList.add(jwK);
            }
        } else {
            arrayList = 0sn.A00;
        }
        02z A012 = 106.A01(arrayList);
        this.A0A = A012;
        05F A032 = 10b.A03(A012);
        this.A0B = A032;
        02z A10 = DbS.A10(false);
        this.A09 = A10;
        05F A033 = 10b.A03(A10);
        this.A0D = A033;
        1HR r0 = new 1HR(0);
        this.A06 = r0;
        this.A07 = 0u9.A04(r0);
        C49650F0h f0h2 = this.A03;
        this.A08 = AnonymousClass10H.A02(new ProfileInterestPickerViewModel$viewState$1(this, (AnonymousClass4D7) null), f0h2.A04, f0h2.A06, A032, f0h2.A05, A033);
        if (!this.A01) {
            A02((Boolean) null, "surface_entry", (List) null);
        }
        DbX.A1X(this, C318116oQ.A00(this), 2);
    }

    public static final int A00(String str, List list) {
        String str2;
        C51954G8x g8x;
        int i = -1;
        if (str != null) {
            int i2 = 0;
            for (Object next : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    0sr.A1T();
                    throw AnonymousClass00P.createAndThrow();
                }
                C61082JwK jwK = (C61082JwK) next;
                if (jwK == null || (g8x = (C51954G8x) jwK.A00) == null) {
                    str2 = null;
                } else {
                    str2 = g8x.B6N();
                }
                if (0qQ.A0K(str2, str)) {
                    i = i2;
                }
                i2 = i3;
            }
        }
        return i;
    }

    public final void A02(Boolean bool, String str, List list) {
        String A0k = DbS.A0k();
        if (A0k != null) {
            UserSession userSession = this.A02;
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(A0E, userSession), "ig_bio_interests_picker");
            A0e.A9F("viewer_id", DbV.A0q(userSession.A06));
            DbS.A1K(A0e, "bio_interests_picker");
            A0e.AAJ("action_type", str);
            A0e.AAJ("nav_chain", A0k);
            A0e.AAJ("topic_name", (String) null);
            A0e.AAe("bio_interest_ids", list);
            A0e.A7p("has_unsaved_changes", bool);
            DbV.A1I(A0e, this.A0C);
        }
    }

    public static final List A01(List list) {
        String str;
        C51954G8x g8x;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C61082JwK jwK = (C61082JwK) it.next();
            if (jwK == null || (g8x = (C51954G8x) jwK.A00) == null) {
                str = null;
            } else {
                str = g8x.B6N();
            }
            A0r.add(str);
        }
        return A0r;
    }
}
