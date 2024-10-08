package X;

import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.DlC  reason: case insensitive filesystem */
public final class C46784DlC extends 2YL {
    public final UserSession A00;
    public final C390899s1 A01;
    public final 17i A02;
    public final String A03;

    public static C47256Dtk A00(Object[] objArr, int i) {
        return new C47256Dtk(new GKO(objArr, i));
    }

    public final C47166Drh A01() {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        C51862G4v g4v;
        C47256Dtk dtk;
        C51862G4v g4v2;
        GKO gko;
        GKO gko2;
        GKO gko3;
        GKO gko4;
        Object[] objArr;
        int i5;
        User A022 = this.A02.A02(this.A03);
        GKO gko5 = null;
        if (A022 != null) {
            str = A022.getUsername();
        } else {
            str = "";
        }
        switch (this.A01.ordinal()) {
            case 0:
                i4 = R.drawable.ig_illustrations_illo_messages_refresh;
                gko4 = DbS.A0Q(new Object[0], 2131974081);
                i3 = R.drawable.instagram_reactions_pano_outline_24;
                gko3 = DbS.A0Q(new Object[0], 2131955051);
                g4v2 = new C47257Dtl();
                i2 = R.drawable.instagram_users_pano_outline_24;
                gko2 = DbS.A0Q(new Object[0], 2131974083);
                dtk = A00(new Object[0], 2131974082);
                i = R.drawable.instagram_shield_star_pano_outline_24;
                gko = DbS.A0Q(new Object[0], 2131974085);
                objArr = new Object[0];
                i5 = 2131974084;
                break;
            case 1:
                GKO A0Q = DbS.A0Q(new Object[]{str}, 2131974161);
                GKO A0Q2 = DbS.A0Q(new Object[0], 2131955051);
                C47257Dtl dtl = new C47257Dtl();
                return new C47166Drh(A0Q, A0Q2, DbS.A0Q(new Object[0], 2131974083), DbS.A0Q(new Object[0], 2131974163), (C266444Yx) null, dtl, A00(new Object[0], 2131974082), A00(new Object[]{str}, 2131974162), R.drawable.ig_illustrations_illo_channels_social_refresh, R.drawable.instagram_reactions_pano_outline_24, R.drawable.instagram_users_pano_outline_24, R.drawable.instagram_shield_star_pano_outline_24);
            case 2:
                GKO A0Q3 = DbS.A0Q(new Object[0], 2131954265);
                GKO A0Q4 = DbS.A0Q(new Object[0], 2131954267);
                C47256Dtk A002 = A00(new Object[0], 2131954266);
                GKO A0Q5 = DbS.A0Q(new Object[0], 2131954269);
                C47256Dtk A003 = A00(new Object[0], 2131954268);
                GKO A0Q6 = DbS.A0Q(new Object[0], 2131954271);
                C47256Dtk A004 = A00(new Object[0], 2131954270);
                if (182.A06(0Tu.A05, this.A00, 36320472543470057L)) {
                    gko5 = DbS.A0Q(new Object[0], 2131954264);
                }
                return new C47166Drh(A0Q3, A0Q4, A0Q5, A0Q6, gko5, A002, A003, A004, R.drawable.ig_illustrations_illo_channels_broadcast_refresh, R.drawable.instagram_media_account_pano_outline_24, R.drawable.instagram_reactions_pano_outline_24, R.drawable.instagram_app_messenger_pano_outline_24);
            case 3:
                GKO A0Q7 = DbS.A0Q(new Object[0], 2131954265);
                GKO A0Q8 = DbS.A0Q(new Object[0], 2131954267);
                C47256Dtk A005 = A00(new Object[0], 2131954266);
                return new C47166Drh(A0Q7, A0Q8, DbS.A0Q(new Object[0], 2131954269), DbS.A0Q(new Object[0], 2131954271), (C266444Yx) null, A005, A00(new Object[0], 2131974607), A00(new Object[0], 2131954270), R.drawable.ig_illustrations_illo_messages_refresh, R.drawable.instagram_media_account_pano_outline_24, R.drawable.instagram_reactions_pano_outline_24, R.drawable.instagram_app_messenger_pano_outline_24);
            case 4:
                i4 = R.drawable.ig_illustrations_illo_messages_refresh;
                gko4 = DbS.A0Q(new Object[0], 2131963215);
                i3 = R.drawable.instagram_users_pano_outline_24;
                gko3 = DbS.A0Q(new Object[0], 2131963212);
                g4v2 = A00(new Object[0], 2131963211);
                i2 = R.drawable.instagram_report_pano_outline_24;
                gko2 = DbS.A0Q(new Object[0], 2131963214);
                dtk = A00(new Object[0], 2131963213);
                i = R.drawable.instagram_reactions_pano_outline_24;
                gko = DbS.A0Q(new Object[0], 2131955051);
                g4v = new C47257Dtl();
                break;
            case 5:
                i4 = R.drawable.ig_illustrations_illo_messages_refresh;
                gko4 = DbS.A0Q(new Object[0], 2131963220);
                i3 = R.drawable.instagram_reactions_pano_outline_24;
                gko3 = DbS.A0Q(new Object[0], 2131955051);
                g4v2 = new C47257Dtl();
                i2 = R.drawable.instagram_users_pano_outline_24;
                gko2 = DbS.A0Q(new Object[0], 2131963217);
                dtk = A00(new Object[0], 2131963216);
                i = R.drawable.instagram_report_pano_outline_24;
                gko = DbS.A0Q(new Object[0], 2131963219);
                objArr = new Object[0];
                i5 = 2131963218;
                break;
            default:
                throw AnonymousClass7TE.A1K();
        }
        g4v = A00(objArr, i5);
        return new C47166Drh(gko4, gko3, gko2, gko, (C266444Yx) null, g4v2, dtk, g4v, i4, i3, i2, i);
    }

    public C46784DlC(UserSession userSession, C390899s1 r3, 17i r4, String str) {
        AnonymousClass7TG.A1U(userSession, str, r3);
        0qQ.A0B(r4, 4);
        this.A00 = userSession;
        this.A03 = str;
        this.A01 = r3;
        this.A02 = r4;
    }
}
