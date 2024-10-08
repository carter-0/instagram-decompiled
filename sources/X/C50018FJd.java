package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.api.schemas.FanClubCategoryType;
import com.instagram.common.session.UserSession;
import com.instagram.fanclub.consideration.FanClubConsiderationViewModel;
import com.instagram.user.model.User;
import java.util.Map;

/* renamed from: X.FJd  reason: case insensitive filesystem */
public final class C50018FJd implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public C50018FJd(Ez0 ez0, EEM eem, String str, int i) {
        this.A00 = i;
        this.A01 = eem;
        this.A03 = str;
        this.A02 = ez0;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.A00) {
            case 0:
                String str = this.A03;
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(0cp.A03(str));
                0b6.A00().A07().A0G((Context) this.A02, intent);
                ((Activity) this.A01).finish();
                return;
            case 1:
                UserSession userSession = (UserSession) this.A02;
                27r A012 = 27p.A01(userSession);
                A012.A1Q(A012.A04.A0C, "META_CLOUD_ALBUM_NUX_OK");
                AnonymousClass9PQ.A06((AnonymousClass0iw) this.A01, userSession, AnonymousClass05K.A0N, this.A03);
                return;
            case 2:
                E7X e7x = (E7X) this.A02;
                ((C46776Dl3) e7x.A0L.getValue()).A01();
                C48146EZo eZo = C48146EZo.NEW_SUBSCRIBER_CHAT;
                C50337FYu.A01(C48147EZp.DISCARD_CHANGES_DIALOG, eZo, (C50337FYu) e7x.A0I.getValue(), "discard_changes_yes", "tap", (Map) null);
                E7X.A00((FanClubCategoryType) this.A01, e7x, this.A03);
                return;
            case 3:
                C47477E4b e4b = (C47477E4b) this.A02;
                FanClubConsiderationViewModel A002 = C47477E4b.A00(e4b);
                Context requireContext = e4b.requireContext();
                EVK evk = (EVK) ((C61059Jvx) this.A01).A02;
                String str2 = this.A03;
                AnonymousClass7TG.A1O(evk, str2);
                int ordinal = evk.ordinal();
                if (ordinal == 3) {
                    Dbb.A0k(requireContext, A002.A03, 2EG.A1m, "https://help.instagram.com/467290348140020");
                    return;
                } else if (ordinal == 4) {
                    1Eo.A05(((AnonymousClass12U) A002.A02).A04, new MFW(A002, str2, (AnonymousClass4D7) null, 40), C318116oQ.A00(A002));
                    return;
                } else {
                    throw AnonymousClass7TE.A0w("Unsupported auxiliary button");
                }
            case 4:
                Context context = (Context) this.A01;
                Dba.A0q(context, (0lg) this.A02, new C11225SFz(this.A03), context.getString(2131964884));
                return;
            case 5:
                dialogInterface.dismiss();
                EEM.A04((EEM) this.A01, (User) this.A02, this.A03);
                return;
            case 6:
                EEM eem = (EEM) this.A01;
                EEM.A05(eem, 1Q0.A0e, this.A03);
                dialogInterface.dismiss();
                String str3 = ((Ez0) this.A02).A03;
                AnonymousClass0aP r8 = eem.A08;
                String str4 = eem.A09.A01;
                AnonymousClass7TF.A1H(r8, str4);
                double A013 = DbS.A01();
                double A003 = DbS.A00();
                0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r8), "fb_clash_log_in_tapped");
                Dbc.A0X(A0e, A013, A003);
                DbS.A1H(A0e, str4);
                DbZ.A1E(A0e);
                FH8.A04(A0e);
                FH8.A09(A0e, r8);
                DbW.A10(A0e);
                A0e.Cgf();
                C309516Yo A0J = DbY.A0J(eem.A06.getActivity(), r8);
                Bundle A0a = AnonymousClass7TE.A0a();
                A0a.putString("com.instagram.android.login.fragment.ARGUMENT_OMNISTRING", str3);
                DbX.A18(A0a, new E54(), A0J);
                return;
            case 7:
                dialogInterface.dismiss();
                EEM eem2 = (EEM) this.A01;
                AnonymousClass0aP r3 = eem2.A08;
                String str5 = this.A03;
                C257453xQ A014 = C257443xP.A01(((Ez0) this.A02).A03);
                C2612848z r1 = C2612848z.A00;
                EEM.A02(A014, r1, r1, r3, eem2, (Boolean) null, (String) null, str5, (String) null, (String) null, true);
                return;
            case 8:
                ((C51028FnK) this.A01).A00((User) this.A02, this.A03);
                return;
            case 9:
                String str6 = this.A03;
                0Aj A0e2 = AnonymousClass7TE.A0e((0wc) this.A02, "instagram_shopping_seller_featured_product_nux_tap");
                0bb r12 = new 0bb();
                r12.A06("submodule", "learn_more");
                r12.A06("prior_module", str6);
                A0e2.AAK(r12, "navigation_info");
                A0e2.Cgf();
                0kR.A0F((Context) this.A01, 0cp.A03("https://www.facebook.com/help/instagram/3514581701914650"));
                return;
            case 10:
                UserSession userSession2 = (UserSession) this.A02;
                AnonymousClass0iw r0 = C46359DdX.A00;
                AnonymousClass7TG.A1N(userSession2, r0);
                DcM.A03(new DcM(r0, userSession2), Dba.A0Q((AnonymousClass3FW) this.A01), "ig_quiet_mode_upsell_enable_flow_dialog_not_now", this.A03);
                break;
            default:
                AnonymousClass0iw r13 = C49848F9n.A00;
                0qQ.A0B(r13, 1);
                DcM.A01(AnonymousClass0kN.A01(r13, (0lg) this.A02), (F10) this.A01, "ig_quiet_mode_upsell_unified_dialog_ok_tap", this.A03);
                break;
        }
        dialogInterface.dismiss();
    }

    public C50018FJd(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A03 = str;
        this.A02 = obj2;
        this.A01 = obj;
    }
}
