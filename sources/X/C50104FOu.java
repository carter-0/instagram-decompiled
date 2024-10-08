package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.aistudio.model.UtmMetadata;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.user.model.User;
import java.util.HashMap;

/* renamed from: X.FOu  reason: case insensitive filesystem */
public final class C50104FOu implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public C50104FOu(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A00 = i;
        this.A01 = obj3;
        this.A04 = str;
        this.A03 = obj2;
        this.A02 = obj;
    }

    public final void onClick(View view) {
        int A05;
        int i;
        String str;
        switch (this.A00) {
            case 0:
                A05 = AnonymousClass0fD.A05(190128060);
                C50143FRa.A03((0lg) this.A03, this.A04, "claim_page", "not_now");
                DialogInterface.OnCancelListener onCancelListener = (Fragment) this.A02;
                if (onCancelListener instanceof DialogInterface.OnCancelListener) {
                    onCancelListener.onCancel((Dialog) this.A01);
                }
                DbS.A1V(this.A01);
                i = -1537018704;
                break;
            case 1:
                A05 = AnonymousClass0fD.A05(1178795747);
                E1H e1h = (E1H) this.A03;
                C53020GhB ghB = (C53020GhB) e1h.A0E.getValue();
                String str2 = ((C61046Jvk) this.A02).A00;
                String str3 = this.A04;
                String A0t = DbS.A0t(e1h.A05);
                String A0t2 = DbS.A0t(e1h.A0B);
                String A0t3 = DbS.A0t(e1h.A02);
                String A16 = AnonymousClass7TE.A16(((View) this.A01).getContext(), 2131957578);
                AnonymousClass7TG.A1N(str2, str3);
                ghB.A00.A04((Integer) e1h.A03.getValue(), ghB.A01, str2, str3, A0t, A0t2, A0t3, A16);
                DbZ.A15(e1h);
                i = -897848855;
                break;
            case 2:
                A05 = AnonymousClass0fD.A05(-1593624112);
                AnonymousClass9B9.A00();
                NJY njy = (NJY) this.A03;
                UserSession A0N = njy.A0N();
                FragmentActivity requireActivity = njy.requireActivity();
                String str4 = this.A04;
                0qQ.A0B(A0N, 0);
                C49951FGg.A00(requireActivity, (UtmMetadata) null, A0N, str4, (String) null);
                LTH lth = (LTH) this.A02;
                User user = (User) this.A01;
                if (user != null) {
                    str = user.A03.AaU();
                } else {
                    str = null;
                }
                1Ln A002 = LTH.A00(lth);
                if (DbT.A1Y(A002)) {
                    A002.A0l("thread_details_ai_studio_button_clicked");
                    A002.A0j(DbZ.A0d(str));
                    A002.Cgf();
                }
                i = 978614028;
                break;
            case 3:
                A05 = AnonymousClass0fD.A05(788720172);
                String AaU = ((User) this.A01).A03.AaU();
                1Ln A003 = LTH.A00((LTH) this.A02);
                if (DbT.A1Y(A003)) {
                    A003.A0l("thread_view_creator_button_thread_details_clicked");
                    A003.A0j(DbZ.A0d(AaU));
                    A003.Cgf();
                }
                NJY njy2 = (NJY) this.A03;
                Bundle A012 = C46447Df9.A02().A01(njy2.A0N(), C46474Dfc.A01(njy2.A0N(), this.A04, "direct_thread_ugc_ai", C66579MXk.A00(103)));
                DbT.A1L(njy2, DbS.A0b(njy2.requireActivity(), A012, njy2.A0N(), ModalActivity.class, "profile"));
                i = 401591366;
                break;
            case 4:
                A05 = AnonymousClass0fD.A05(-1543039641);
                Bundle A0a = AnonymousClass7TE.A0a();
                C50404FbC fbC = (C50404FbC) this.A03;
                AnonymousClass7SD C6Q = fbC.A03.C6l().C6Q();
                A0a.putString("bottom_sheet_content_fragment", C66579MXk.A00(261));
                A0a.putString("content_id", DbX.A0r((User) 00k.A0J(C6Q.A0b)));
                A0a.putString("prior_module", fbC.A01.getModuleName());
                FragmentActivity fragmentActivity = fbC.A00;
                AnonymousClass6W8 A0b = DbS.A0b(fragmentActivity, A0a, fbC.A02, TransparentModalActivity.class, "bottom_sheet");
                LTH lth2 = (LTH) this.A02;
                String str5 = this.A04;
                if (!0qQ.A0K(str5, C66579MXk.A00(50)) && !0qQ.A0K(str5, AnonymousClass000.A00(857))) {
                    1Ln A004 = LTH.A00(lth2);
                    if (DbT.A1Y(A004)) {
                        A004.A0l("thread_view_share_button_clicked");
                        A004.A0j(DbZ.A0d(str5));
                        A004.Cgf();
                    }
                }
                AnonymousClass7TN r3 = (AnonymousClass7TN) this.A01;
                AnonymousClass7TN.A00(r3, new MMK(r3, 2));
                A0b.A0C(fragmentActivity);
                i = -1063852675;
                break;
            case 5:
                A05 = AnonymousClass0fD.A05(-1809375788);
                HashMap A1E = AnonymousClass7TE.A1E();
                A1E.put("page_id", this.A04);
                A1E.put("referrer", "map_profile_action");
                C46649DiU A042 = C46649DiU.A04(C273654mx.A00(2174), A1E);
                0lg r5 = (0lg) this.A03;
                IgBloksScreenConfig A0N2 = DbS.A0N(r5);
                A0N2.A0i = true;
                Bundle A005 = C49891FBs.A00(A0N2, A042);
                DbU.A0w((Activity) this.A02, A005, r5, ModalActivity.class, "bloks");
                i = 453159215;
                break;
            case 6:
                A05 = AnonymousClass0fD.A05(-1404262987);
                C17934ViP viP = (C17934ViP) this.A03;
                Fragment fragment = (Fragment) this.A02;
                String str6 = this.A04;
                AnonymousClass0iw r8 = (AnonymousClass0iw) this.A01;
                if (fragment.isAdded()) {
                    HashMap A0m = DbY.A0m("url", str6);
                    String str7 = viP.A06;
                    if (str7 != null) {
                        A0m.put("media_id", str7);
                    }
                    C46395DeI.A0Q(fragment.requireActivity(), DbX.A0D(str6), r8, viP.A03, "share_to_system_sheet", A0m);
                }
                i = -936570709;
                break;
            default:
                A05 = AnonymousClass0fD.A05(-1412156646);
                boolean z = ((E1R) this.A02).A00;
                if (!z) {
                    C319606qt r4 = (C319606qt) this.A03;
                    String str8 = this.A04;
                    C319646qx A022 = C319606qt.A02(r4, str8);
                    A022.A0A = true;
                    r4.A00.put(str8, A022);
                    r4.A0B((AnonymousClass0iw) null, (0lg) null, (Iterable) null, false);
                }
                FH4 fh4 = (FH4) this.A01;
                UserSession userSession = fh4.A04;
                C319606qt A013 = C319606qt.A01(userSession);
                String str9 = this.A04;
                A013.A09(fh4.A01.getApplicationContext(), fh4.A03, userSession, AnonymousClass05K.A0u, str9, z);
                fh4.A0D(EVP.SINGLE, z);
                i = -640269436;
                break;
        }
        AnonymousClass0fD.A0C(i, A05);
    }

    public C50104FOu(LTH lth, NJY njy, User user, String str, int i) {
        this.A00 = i;
        if (2 - i != 0) {
            this.A02 = lth;
            this.A01 = user;
            this.A03 = njy;
            this.A04 = str;
        } else {
            this.A03 = njy;
            this.A04 = str;
            this.A02 = lth;
            this.A01 = user;
        }
    }
}
