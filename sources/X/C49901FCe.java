package X;

import com.instagram.common.session.UserSession;
import com.meta.foa.session.FoaUserSession;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.FCe  reason: case insensitive filesystem */
public abstract class C49901FCe {
    public static final void A02(FoaUserSession foaUserSession, String str, String str2, String str3, List list, boolean z) {
        0qQ.A0B(foaUserSession, 0);
        AnonymousClass7TG.A1U(str, str2, list);
        C55025Haw.A00(C56316HwT.A00(foaUserSession), str, str2, str3, list.size(), list.size(), 0, z);
    }

    public static final void A00(C46397DeK deK, FoaUserSession foaUserSession, String str, String str2, long j, boolean z, boolean z2) {
        String str3;
        UserSession A00 = C56316HwT.A00(foaUserSession);
        0qQ.A0B(A00, 0);
        C46398DeL A002 = C46400DeN.A00(str);
        Long A10 = AnonymousClass7TE.A10(A00.A06);
        C46397DeK deK2 = C46397DeK.INSTAGRAM;
        if (deK == deK2) {
            str3 = "intra_app";
        } else {
            str3 = "inter_app";
        }
        boolean A1Z = DbW.A1Z(A002);
        double A003 = DbS.A00();
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(A00), "switch_user_tapped");
        if (A0e.isSampled()) {
            A0e.A9F("raw_initiator_account_id", A10);
            A0e.A9F("initiator_identity_id", A10);
            DbW.A12(A0e, A003);
            A0e.AAJ("event_session_id", str2);
            DbS.A1F(A002, A0e);
            A0e.A7p("is_cds", Boolean.valueOf(A1Z));
            A0e.AAJ("switch_type", str3);
            A0e.A7p("is_logged_in", Boolean.valueOf(z));
            A0e.A7p("is_badge_shown", Boolean.valueOf(z2));
            A0e.A9F("badge_count", Long.valueOf(j));
            A0e.A8M(deK2, "initiator_account_type");
            A0e.A8M(deK, "target_account_type");
            A0e.Cgf();
        }
    }

    public static final void A01(FoaUserSession foaUserSession, int i, boolean z) {
        AnonymousClass2g1 r5;
        2aD r1;
        UserSession A00 = C56316HwT.A00(foaUserSession);
        0qQ.A0B(A00, 0);
        boolean z2 = C46400DeN.A04;
        DbU.A0c(A00).A00.AHZ();
        if (z) {
            r5 = AnonymousClass2g1.BOTTOM_SHEET_HORIZONTAL;
            r1 = 2aD.A0R;
        } else {
            r5 = AnonymousClass2g1.BOTTOM_SHEET_VERTICAL;
            r1 = 2aD.A0p;
        }
        2aX r6 = new 2aX(2aD.A06, (List) null, i, i);
        2aT A0c = DbU.A0c(A00);
        C226252fx r4 = C226252fx.NUMBERED;
        2aT.A00(A0c, r4, r5, r6, AnonymousClass05K.A0C, "click", (Map) null, 0, 0, 0, 0);
        2aV A0a = DbV.A0a(A00);
        2aX r2 = new 2aX(r1, (List) null, i, i);
        AnonymousClass2g1 r12 = AnonymousClass2g1.BOTTOM_SHEET;
        0qQ.A0B(r12, 0);
        A0a.A03(new C239993Jd(r4, r12, (C71062aE) null, (Set) null), r2, false);
    }
}
