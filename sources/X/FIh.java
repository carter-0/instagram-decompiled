package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.instagram.api.schemas.BonusPromoDialogAudienceType;
import com.instagram.api.schemas.BonusPromoDialogType;
import com.instagram.api.schemas.GrowthFrictionInterventionDetail;
import com.instagram.bugreporter.source.BugReportSource;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.user.model.User;
import java.util.Map;

public final class FIh implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public FIh(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i;
        this.A02 = obj3;
        this.A01 = obj;
        this.A03 = obj2;
        this.A05 = obj5;
        this.A04 = obj4;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        String id;
        Integer num;
        switch (this.A00) {
            case 0:
                C18550Vu2 vu2 = (C18550Vu2) this.A05;
                AnonymousClass4VR r6 = (AnonymousClass4VR) this.A03;
                2cW r8 = (2cW) this.A02;
                Object obj = this.A04;
                Context context = (Context) this.A01;
                C18080Vl9 vl9 = new C18080Vl9(context);
                vl9.A08("Force Mode Options");
                Integer[] numArr = vu2.A01;
                int length = numArr.length;
                CharSequence[] charSequenceArr = new CharSequence[length];
                for (int i2 = 0; i2 < length; i2++) {
                    switch (numArr[i2].intValue()) {
                        case 1:
                            str = "Force On";
                            break;
                        case 2:
                            str = "Force Off";
                            break;
                        case 3:
                            str = "Ignore Enable Time";
                            break;
                        default:
                            str = ServerW3CShippingAddressConstants.DEFAULT;
                            break;
                    }
                    charSequenceArr[i2] = str;
                }
                int B7J = r8.B7J(((AnonymousClass4VQ) r6).A01.A0D);
                C50019FJe fJe = new C50019FJe(0, (Object) charSequenceArr, (Object) r6, (Object) vu2, (Object) r8, (Object) context, obj);
                C17742VdB vdB = vl9.A01;
                vdB.A0J = charSequenceArr;
                vdB.A03 = fJe;
                vdB.A00 = B7J;
                vdB.A0I = true;
                AnonymousClass0fN.A00(vl9.A00());
                return;
            case 1:
                0qQ.A0B(dialogInterface, 0);
                1Xj r0 = (1Xj) this.A04;
                if (r0 == null || (id = r0.getId()) == null) {
                    C59689JTv.A0B((Context) this.A02, "missing_media_id_for_unavailable_audio_dialog");
                    return;
                }
                new C65145Lo9((Context) this.A02, (Fragment) this.A03, (AnonymousClass0iw) this.A01, (UserSession) this.A05, id).Exg((C62642Kk4) null, (C371088xY) null, (AudioOverlayTrack) null, AnonymousClass05K.A05, (String) null, (Map) null);
                return;
            case 2:
                C70830ONc oNc = (C70830ONc) this.A05;
                C66930MfP mfP = oNc.A02;
                2Er r3 = (2Er) this.A04;
                mfP.A03(r3.C6C(), r3.C6k(), r3.AdN());
                int C6a = r3.C6a();
                int AdN = r3.AdN();
                oNc.A02((C69309NjA) this.A01, (C69365Nk5) this.A02, (DirectThreadKey) this.A03, C6a, AdN);
                return;
            case 3:
                1Xj r5 = (1Xj) this.A01;
                UserSession userSession = (UserSession) this.A02;
                CallerContext callerContext = C56910IHf.A00;
                C56910IHf.A01((Context) this.A03, AnonymousClass07i.A00((Fragment) this.A04), (1P0) this.A05, userSession, r5);
                C48897Elx.A00("delete_instagram_only_click", userSession, r5);
                return;
            case 4:
                C19201WPh wPh = (C19201WPh) this.A05;
                Context context2 = (Context) this.A01;
                C255773uh r4 = (C255773uh) this.A02;
                Object obj2 = this.A03;
                Object obj3 = this.A04;
                UserSession userSession2 = wPh.A0B;
                C64113LOb lOb = r4.A0E;
                lOb.getClass();
                String str2 = lOb.A03.A00.A02;
                if (str2 != null) {
                    1NY A0a = AnonymousClass7TG.A0a(userSession2);
                    A0a.A0A("brandx/superlatives/delete_superlatives_card/");
                    A0a.A9m(AnonymousClass000.A00(2772), str2);
                    1OC A0L = DbW.A0L(A0a, C47305DuY.class, F4K.class, true);
                    AnonymousClass6ST r7 = new AnonymousClass6ST(context2, true);
                    DbU.A18(context2, r7, 2131974754);
                    A0L.A00 = new C15608Ufa(2, r4, wPh, obj3, r7, obj2, context2);
                    1ES.A00(context2, wPh.A08, A0L);
                    return;
                }
                throw AnonymousClass7TE.A0y();
            case 5:
                if (i == 0) {
                    ((C49673F1f) this.A02).A00(AnonymousClass05K.A0u);
                    Context context3 = (Context) this.A01;
                    0kR.A0F(context3, DbV.A07(context3.getApplicationContext(), C66579MXk.A00(131)));
                    return;
                }
                if (i != 1) {
                    ((C49673F1f) this.A02).A00(AnonymousClass05K.A0C);
                }
                Context context4 = (Context) this.A03;
                int i3 = 2131971293;
                if (i == 1) {
                    i3 = 2131973088;
                }
                String A16 = AnonymousClass7TE.A16(context4, i3);
                int i4 = 2131954333;
                if (i == 1) {
                    i4 = 2131964189;
                }
                String A162 = AnonymousClass7TE.A16(context4, i4);
                FGP.A01((Activity) this.A01, (BugReportSource) this.A04, (UserSession) this.A05, A16, A162);
                return;
            case 6:
                Activity activity = (Activity) this.A02;
                ((0BQ) this.A03).E2U(activity, (Intent) this.A04, (UserSession) this.A05, (User) this.A01, "horizontal_switch", true, true);
                if (activity.isTaskRoot()) {
                    activity.finish();
                    return;
                }
                return;
            case 7:
                GrowthFrictionInterventionDetail growthFrictionInterventionDetail = (GrowthFrictionInterventionDetail) this.A02;
                Integer num2 = (Integer) this.A03;
                0qQ.A0B(num2, 3);
                FEL.A00(growthFrictionInterventionDetail, (UserSession) this.A05, (User) this.A04, num2, "user_selected_continue_on_dialog");
                dialogInterface.dismiss();
                ((Runnable) this.A01).run();
                return;
            case 8:
                AnonymousClass0xx A002 = AnonymousClass07a.A00((ComponentActivity) this.A02);
                UserSession userSession3 = (UserSession) this.A03;
                AnonymousClass7TE.A1Z(new MGC(this.A04, (Object) userSession3, (AnonymousClass4D7) null, 9), A002);
                AnonymousClass0iw r62 = C46359DdX.A00;
                AnonymousClass7TG.A1N(userSession3, r62);
                DcM.A03(new DcM(r62, userSession3), ((AnonymousClass3FW) this.A05).A03(0), "ig_quiet_mode_upsell_dialog_try_tap", "in_app_upsell");
                DbT.A0j(userSession3).A1D(true);
                C59689JTv.A07((Context) this.A01, 2131971230);
                AnonymousClass7TG.A1N(userSession3, r62);
                DcM.A03(new DcM(r62, userSession3), new AnonymousClass3FW(userSession3).A03(0), "ig_quiet_mode_confirmation_toast_shown", "in_app_upsell");
                return;
            case 9:
                String A0q = DbS.A0q(this.A01);
                AnonymousClass73V.A02((0wc) this.A05, (C3263576k) this.A02, (C69445Nlp) this.A03, (C48088EVg) this.A04, "click", "optimistic_restrict_dismiss_button", A0q);
                return;
            default:
                C50327FYh fYh = (C50327FYh) this.A04;
                if (this.A02 == BonusPromoDialogType.SELF_PROFILE_REELS) {
                    num = AnonymousClass05K.A0j;
                } else {
                    num = AnonymousClass05K.A1F;
                }
                fYh.A00(num, (String) null, (String) null, (String) null);
                C47152DrT drT = (C47152DrT) this.A03;
                BonusPromoDialogAudienceType bonusPromoDialogAudienceType = drT.A00;
                if (bonusPromoDialogAudienceType != null) {
                    int ordinal = bonusPromoDialogAudienceType.ordinal();
                    if (ordinal == 1 || ordinal == 3) {
                        UserSession userSession4 = (UserSession) this.A05;
                        C309516Yo A0M = DbS.A0M((FragmentActivity) this.A01, userSession4);
                        A0M.A0B((Bundle) null, F9Y.A00().A03(userSession4, "NATIVE_PROMO_DIALOG", (String) null, "Bonuses"));
                        A0M.A04();
                        return;
                    } else if (ordinal == 2) {
                        UserSession userSession5 = (UserSession) this.A05;
                        String str3 = drT.A01;
                        C309516Yo A0M2 = DbS.A0M((FragmentActivity) this.A01, userSession5);
                        A0M2.A0B((Bundle) null, F9Y.A00().A01(userSession5, str3, "NATIVE_PROMO_DIALOG"));
                        A0M2.A04();
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
        }
    }
}
