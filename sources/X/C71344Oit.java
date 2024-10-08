package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.model.direct.DirectSearchPrompt;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Oit  reason: case insensitive filesystem */
public final class C71344Oit implements View.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public C71344Oit(int i, int i2, Object obj, Object obj2) {
        this.A00 = i2;
        this.A03 = obj2;
        this.A02 = obj;
        this.A01 = i;
    }

    public final void onClick(View view) {
        int A05;
        String str;
        String str2;
        int i;
        int i2;
        C254793t3 r2;
        String str3;
        String str4;
        switch (this.A00) {
            case 0:
                A05 = AnonymousClass0fD.A05(557466045);
                C313756gx r7 = (C313756gx) this.A02;
                NJY njy = (NJY) this.A03;
                N4P n4p = njy.A0Z;
                C254793t3 r9 = null;
                if (n4p == null || (r2 = n4p.A0L) == null) {
                    str = null;
                } else {
                    str = C300965yF.A07(r2);
                }
                N4P n4p2 = njy.A0Z;
                if (n4p2 != null) {
                    str2 = n4p2.A0Q;
                } else {
                    str2 = null;
                }
                int i3 = this.A01;
                1Ln A0J = DbT.A0J(r7);
                if (DbT.A1Y(A0J)) {
                    DbW.A17(A0J, r7);
                    DbV.A1M(A0J, "render_best_practices_sheet");
                    A0J.A0p("best_practices_button");
                    C66582MXn.A1C(A0J, r7, DbZ.A0b(A0J, "thread_details", str, str2, i3));
                }
                UserSession A0l = AnonymousClass7TE.A0l(njy.A14);
                FragmentActivity requireActivity = njy.requireActivity();
                N4P n4p3 = njy.A0Z;
                if (n4p3 != null) {
                    r9 = n4p3.A0L;
                }
                C69270NiW niW = C69270NiW.BEST_PRACTICES;
                if (n4p3 != null) {
                    i = n4p3.A06();
                } else {
                    i = 0;
                }
                C69873Ntb.A00(requireActivity, A0l, niW, r9, "thread_details", NJY.__redex_internal_original_name, i);
                i2 = 43049423;
                break;
            case 1:
                A05 = AnonymousClass0fD.A05(-164876294);
                C254743sy r4 = (C254743sy) this.A02;
                if (C66647MaG.A0F(r4)) {
                    C72342P2h p2h = (C72342P2h) this.A03;
                    Context context = p2h.A00;
                    FragmentActivity fragmentActivity = p2h.A01;
                    UserSession userSession = p2h.A03;
                    if (!C71118OdC.A03(fragmentActivity, context, p2h.A02, userSession, (2EM) null, C330397Mp.A00(p2h.A04), true)) {
                        C71118OdC odC = C71118OdC.A00;
                        2Dm A002 = 1bJ.A00(userSession);
                        DirectThreadKey A032 = C66647MaG.A03(r4);
                        int i4 = this.A01;
                        odC.A04(context, new N4G(i4), userSession, A002, A032, new MJ3(i4, 26, p2h), false);
                    }
                }
                i2 = 1401657114;
                break;
            case 2:
                A05 = AnonymousClass0fD.A05(-1604803794);
                DirectSearchPrompt directSearchPrompt = (DirectSearchPrompt) this.A02;
                int i5 = this.A01;
                C71874OsH osH = ((O7Q) this.A03).A00;
                UserSession userSession2 = osH.A0D;
                0Tu A0J2 = DbS.A0J(userSession2, 0);
                if (!182.A06(A0J2, userSession2, 36328091815001015L) || !182.A06(A0J2, userSession2, 36328091815328700L)) {
                    C71874OsH.A00(osH, directSearchPrompt, i5, false);
                } else {
                    C70151Ny5.A00(userSession2, osH.A0G, directSearchPrompt.A03, "TYPEAHEAD");
                }
                i2 = -868924137;
                break;
            case 3:
                A05 = AnonymousClass0fD.A05(-1594252452);
                C67687MsP msP = (C67687MsP) this.A03;
                AnonymousClass3UH r22 = msP.A01;
                if (r22 != null) {
                    int i6 = this.A01;
                    AnonymousClass3UL r5 = (AnonymousClass3UL) this.A02;
                    if (i6 != -1) {
                        msP.A07.DpF((Activity) null, (View) null, msP.A06, r5, (Integer) null, r22.A0C, "fish-eye", r22.getId(), r22.A0I, (String) null, (List) null, r22.A01, i6, i6);
                    }
                }
                i2 = 1151942127;
                break;
            case 4:
                A05 = AnonymousClass0fD.A05(1514174453);
                C67687MsP msP2 = (C67687MsP) this.A03;
                AnonymousClass3UH r23 = msP2.A01;
                if (r23 != null) {
                    int i7 = this.A01;
                    AnonymousClass3UL r52 = (AnonymousClass3UL) this.A02;
                    if (i7 != -1) {
                        C67687MsP.A01(msP2, i7);
                        msP2.A07.DpH(r23.B5J(), r52, r23.A0C, "fish-eye", r23.getId(), r23.A0I, r23.A01, i7);
                    }
                }
                i2 = 1021565462;
                break;
            case 5:
                A05 = AnonymousClass0fD.A05(614514075);
                C17774Vfl vfl = ((C67804Mv8) this.A03).A00;
                if (vfl != null) {
                    int i8 = this.A01;
                    View view2 = view;
                    0qQ.A0A(view2);
                    vfl.A00(view2, i8);
                }
                i2 = -389889209;
                break;
            case 6:
                A05 = AnonymousClass0fD.A05(-117243964);
                C67809MvD mvD = (C67809MvD) this.A03;
                Oy4 A003 = O15.A00(mvD.A03);
                N5I n5i = (N5I) ((C74530PwP) this.A02);
                String str5 = n5i.A06;
                int i9 = this.A01;
                String str6 = mvD.A00;
                boolean A1X = AnonymousClass7TG.A1X(n5i.A02);
                DbY.A1S(str5, str6);
                0Aj A0e = AnonymousClass7TE.A0e(A003.A00, "igd_channels_client_actions");
                if (A0e.isSampled()) {
                    A0e.AAJ("user_igid", A003.A01);
                    DbS.A1I(A0e, "channel_suggestion_clicked");
                    DbS.A1M(A0e, "feed_netego");
                    Dba.A1B(A0e, "source", "channel_suggestion_item");
                    A0e.A9F("suggestion_position", DbV.A0p(A0e, "ig_thread_id", str5, i9));
                    A0e.AAJ("ranking_request_id", str6);
                    if (A1X) {
                        str3 = "True";
                    } else {
                        str3 = "False";
                    }
                    C66583MXo.A18(A0e, AnonymousClass7TF.A0w("is_follower", str3));
                }
                String str7 = n5i.A04;
                if (str7 != null) {
                    mvD.A04.A00(str5, str7);
                }
                i2 = 2083712516;
                break;
            case 7:
                A05 = AnonymousClass0fD.A05(501330706);
                C67809MvD mvD2 = (C67809MvD) this.A03;
                Oy4 A004 = O15.A00(mvD2.A03);
                N5I n5i2 = (N5I) ((C74530PwP) this.A02);
                String str8 = n5i2.A06;
                int i10 = this.A01;
                String str9 = mvD2.A00;
                boolean A1X2 = AnonymousClass7TG.A1X(n5i2.A02);
                DbY.A1S(str8, str9);
                0Aj A0e2 = AnonymousClass7TE.A0e(A004.A00, "igd_channels_client_actions");
                if (A0e2.isSampled()) {
                    A0e2.AAJ("user_igid", A004.A01);
                    DbS.A1I(A0e2, "dismiss_channel_suggestion");
                    DbS.A1M(A0e2, "feed_netego");
                    Dba.A1B(A0e2, "source", "dismiss_suggestion_button");
                    A0e2.A9F("suggestion_position", DbV.A0p(A0e2, "ig_thread_id", str8, i10));
                    A0e2.AAJ("ranking_request_id", str9);
                    if (A1X2) {
                        str4 = "True";
                    } else {
                        str4 = "False";
                    }
                    C66583MXo.A18(A0e2, AnonymousClass7TF.A0w("is_follower", str4));
                }
                ArrayList arrayList = mvD2.A01;
                if (arrayList != null) {
                    arrayList.remove(i10);
                }
                mvD2.notifyDataSetChanged();
                i2 = 1540644065;
                break;
            case 8:
                A05 = AnonymousClass0fD.A05(1178143885);
                C67341MmH mmH = ((C67342MmI) this.A03).A04;
                int i11 = this.A01;
                C67337MmD mmD = mmH.A00;
                if (mmD.A03) {
                    ((ReboundViewPager) mmD.A0B.A03.getValue()).A0L(i11, 0.0f);
                }
                i2 = -321128841;
                break;
            default:
                A05 = AnonymousClass0fD.A05(-1049400939);
                C74507Pw2 pw2 = (C74507Pw2) this.A02;
                pw2.Czh();
                UserSession userSession3 = (UserSession) this.A03;
                int i12 = this.A01;
                boolean CQM = pw2.CQM(userSession3, (User) null);
                0Aj A0e3 = AnonymousClass7TE.A0e(AnonymousClass0kN.A01((AnonymousClass0iw) null, userSession3), "ig_non_feed_activation_click");
                A0e3.A7p("completed", JTP.A0g(A0e3, "card_type", pw2.Beb(), CQM));
                A0e3.A9F("pos", DbS.A0j(i12));
                A0e3.Cgf();
                i2 = 238517003;
                break;
        }
        AnonymousClass0fD.A0C(i2, A05);
    }
}
