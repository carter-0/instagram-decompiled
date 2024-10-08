package X;

import android.app.Activity;
import android.graphics.RectF;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;
import java.util.List;
import java.util.Map;

public final class FOS implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;

    public FOS(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, int i) {
        this.A00 = i;
        this.A04 = obj4;
        this.A05 = obj3;
        this.A02 = obj2;
        this.A01 = obj;
        this.A03 = obj5;
        this.A06 = str;
    }

    public final void onClick(View view) {
        int A052;
        int i;
        String str;
        2FW r1;
        String str2;
        String A002;
        switch (this.A00) {
            case 0:
                A052 = AnonymousClass0fD.A05(-933847176);
                String str3 = this.A06;
                User user = (User) this.A03;
                ((LRN) this.A02).A02((Long) this.A04, str3, user.getId(), true);
                K8G.A02((Activity) this.A01, (K8G) this.A05, user.getId());
                i = -1059052417;
                break;
            case 1:
                A052 = AnonymousClass0fD.A05(859351516);
                ((1pw) this.A01).CfZ((FragmentActivity) this.A02, (UserSession) this.A05, (User) this.A04, this.A06, C66579MXk.A00(103), (Map) this.A03);
                i = 1547907683;
                break;
            case 2:
                A052 = AnonymousClass0fD.A05(-35877731);
                0rm r10 = (0rm) this.A01;
                FV3 fv3 = (FV3) this.A05;
                2Dm r4 = (2Dm) fv3.A07.getValue();
                2Eq r8 = (2Eq) this.A04;
                DirectThreadKey BJy = r8.BJy();
                OHR ohr = fv3.A01;
                String str4 = null;
                if (ohr != null) {
                    str = ohr.A02;
                } else {
                    str = null;
                }
                r10.A00 = r4.BRz(BJy, String.valueOf(str));
                C71866Os8 A003 = C69841Nt5.A00(fv3.A04);
                String str5 = this.A06;
                C254703su r12 = (C254703su) r10.A00;
                if (r12 != null) {
                    r1 = r12.A10;
                } else {
                    r1 = null;
                }
                String valueOf = String.valueOf(r1);
                0qQ.A0B(valueOf, 1);
                0Aj A0e = AnonymousClass7TE.A0e(A003.A00, "direct_pinned_messages_banner_click");
                A0e.AAJ("open_thread_id", str5);
                A0e.AAJ("media_type", valueOf);
                A0e.A9F(C273654mx.A00(360), Long.valueOf((long) fv3.A00));
                A0e.Cgf();
                int i2 = fv3.A00;
                OHR ohr2 = fv3.A01;
                if (ohr2 != null && AnonymousClass7TF.A1Y(ohr2.A00, false)) {
                    C333517Zg r2 = fv3.A05;
                    OHR ohr3 = fv3.A01;
                    if (ohr3 != null) {
                        str4 = ohr3.A02;
                    }
                    r2.FKo(new OG0(fv3, r8, str5, r10, i2), String.valueOf(str4));
                }
                List list = (List) this.A03;
                fv3.A00 = (fv3.A00 + 1) % list.size();
                FV3.A00(fv3.A03, (View) this.A02, fv3, list);
                i = 2097574621;
                break;
            case 3:
                A052 = AnonymousClass0fD.A05(2046141235);
                C49884FBk.A00((FragmentActivity) this.A01, (AnonymousClass0iw) this.A02, (UserSession) this.A04, (C49884FBk) this.A05, (FBQ) this.A03, (String) null, this.A06, 2);
                i = 1992139274;
                break;
            case 4:
                A052 = AnonymousClass0fD.A05(1108338718);
                Object obj = this.A04;
                Object obj2 = this.A02;
                0qQ.A0A(obj2);
                ((0sL) this.A03).invoke(obj, obj2);
                String str6 = this.A06;
                UserSession userSession = (UserSession) this.A05;
                AnonymousClass0iw r22 = (AnonymousClass0iw) this.A01;
                AnonymousClass62O r13 = I7S.A00;
                if (2R8.A05(userSession, str6)) {
                    str2 = "opal_self_profile";
                } else {
                    str2 = "opal_profile";
                }
                C49049EoT.A00(r22, userSession, "tap", "profile_picture", str2, str6, (String) null);
                i = 1927963753;
                break;
            case 5:
                A052 = AnonymousClass0fD.A05(1683878866);
                AnonymousClass32A r5 = (AnonymousClass32A) this.A03;
                r5.A0C = this.A06;
                EHF ehf = (EHF) this.A05;
                FragmentActivity activity = ehf.A01.getActivity();
                GradientSpinnerAvatarView gradientSpinnerAvatarView = (GradientSpinnerAvatarView) this.A01;
                C50896Fkb.A00(activity, gradientSpinnerAvatarView.getAvatarBounds(), r5, ehf, 8);
                List list2 = (List) this.A04;
                r5.A09((Reel) this.A02, AnonymousClass3BQ.UNKNOWN, gradientSpinnerAvatarView, list2, list2, list2);
                i = 2119143467;
                break;
            case 6:
                A052 = DbX.A03(view, 1797518575);
                C255773uh r3 = (C255773uh) this.A02;
                String str7 = this.A06;
                RectF rectF = 0nA.A01;
                RectF rectF2 = new RectF();
                0nA.A0L(rectF2, view);
                ((C317116mk) this.A03).Czz(rectF2, r3, (C250973mM) this.A04, str7);
                UserSession userSession2 = (UserSession) this.A05;
                AnonymousClass0iw r42 = (AnonymousClass0iw) this.A01;
                if (0qQ.A0K(str7, AnonymousClass000.A00(1854))) {
                    A002 = "entrypoint";
                } else {
                    A002 = C273654mx.A00(3300);
                }
                C67000MgY.A00(r42, userSession2, (Long) null, A002, "tap", "story_viewer", r3.A0j, (Map) null);
                i = 1786866033;
                break;
            default:
                A052 = AnonymousClass0fD.A05(-1457042115);
                List list3 = GBV.A07;
                UserSession userSession3 = (UserSession) this.A05;
                C46575DhH.A02((Activity) this.A01, (AnonymousClass0iw) this.A02, userSession3, (C46578DhK) this.A04, (C51981GAe) this.A03, this.A06, list3, true);
                C230012om r43 = GBV.A06;
                if (r43 != null) {
                    0Aj A0e2 = AnonymousClass7TE.A0e(r43.A01, C273654mx.A00(3212));
                    A0e2.AAJ("view_module", "suggested_users_reels_netego");
                    DbS.A1O(A0e2, r43.A02);
                    A0e2.Cgf();
                }
                i = -1728573542;
                break;
        }
        AnonymousClass0fD.A0C(i, A052);
    }
}
