package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.nux.common.HowItWorksNuxFragment$Row;

/* renamed from: X.FGp  reason: case insensitive filesystem */
public abstract class C49957FGp {
    public static final void A03(Activity activity, UserSession userSession, C273414mX r6) {
        C47509E5s e5s = new C47509E5s();
        C331127Pr A0e = DbX.A0e(userSession, false);
        A0e.A0g = activity.getString(2131968772);
        A0e.A0v = true;
        A0e.A0U = r6;
        DbU.A0y(activity, e5s, A0e);
    }

    public static final void A04(Activity activity, UserSession userSession, Integer num, String str, String str2) {
        String str3;
        Bundle A0B = DbV.A0B(userSession, 0);
        if (num.intValue() != 0) {
            str3 = "ADD_PEOPLE";
        } else {
            str3 = "CREATION";
        }
        A0B.putString(AnonymousClass000.A00(154), str3);
        A0B.putString("hall_pass_id", str);
        A0B.putString("hall_pass_name", str2);
        A0B.putBoolean(AnonymousClass000.A00(1157), false);
        Dbb.A0i(activity, A0B, userSession, ModalActivity.class, C273654mx.A00(126));
    }

    public static final void A05(Activity activity, UserSession userSession, String str, String str2) {
        0qQ.A0B(userSession, 0);
        AnonymousClass7TG.A1U(activity, str, str2);
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("hall_pass_id", str);
        A0a.putString("hall_pass_name", str2);
        A0a.putBoolean("should_show_add_story_button", false);
        Dbb.A0i(activity, A0a, userSession, ModalActivity.class, "campfire_member_list");
    }

    public static final void A06(Activity activity, UserSession userSession, String str, String str2, boolean z) {
        AnonymousClass7TF.A1C(userSession, 0, str2);
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("hall_pass_id", str);
        A0a.putString("hall_pass_name", str2);
        A0a.putBoolean("should_show_add_story_button", z);
        Dbb.A0i(activity, A0a, userSession, ModalActivity.class, "hall_pass_member_list");
    }

    public static final E1X A00(UserSession userSession, String str) {
        return C49781F6o.A01(userSession, str, 0sr.A1L(new HowItWorksNuxFragment$Row[]{new HowItWorksNuxFragment$Row(2131954701, 2131954700, Integer.valueOf(R.drawable.instagram_lock_pano_outline_24), (Integer) null), new HowItWorksNuxFragment$Row(2131954690, 2131954689, Integer.valueOf(R.drawable.instagram_user_circle_pano_outline_24), (Integer) null), new HowItWorksNuxFragment$Row(2131954692, 2131954691, Integer.valueOf(R.drawable.instagram_eye_pano_outline_24), (Integer) null)}));
    }

    public static final void A01(Activity activity, 28D r4, UserSession userSession, String str, String str2, boolean z, boolean z2) {
        DbY.A1S(userSession, str);
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString(AnonymousClass000.A00(1013), str);
        A0a.putString(AnonymousClass000.A00(1014), str2);
        A0a.putBoolean(AnonymousClass000.A00(1015), z2);
        A0a.putBoolean(AnonymousClass000.A00(1016), z);
        A0a.putSerializable(AnonymousClass000.A00(1012), r4);
        DbU.A0x(activity, A0a, userSession, TransparentModalActivity.class, C273654mx.A00(918));
    }

    public static final void A02(Activity activity, UserSession userSession, C51906G7a g7a, String str, String str2) {
        E7Y A00 = C48941Emf.A00(userSession, g7a, str, str2, AnonymousClass7TG.A1Z(userSession, activity));
        C331127Pr A0W = DbS.A0W(userSession);
        A0W.A0U = A00;
        A0W.A0T = A00;
        DbU.A0y(activity, A00, A0W);
    }

    public static final void A07(28D r5, AnonymousClass4DH r6, UserSession userSession, String str, String str2) {
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString(AnonymousClass000.A00(1013), str);
        A0a.putString(AnonymousClass000.A00(1014), str2);
        A0a.putBoolean(AnonymousClass000.A00(1015), false);
        A0a.putBoolean(AnonymousClass000.A00(1016), true);
        A0a.putSerializable(AnonymousClass000.A00(1012), r5);
        Dba.A0K(r6.getRootActivity(), A0a, userSession, ModalActivity.class, C273654mx.A00(918)).A0D(r6, 73438);
    }

    public static final void A08(UserSession userSession, E7Y e7y, BottomSheetFragment bottomSheetFragment, String str, String str2) {
        Bundle A0A = DbY.A0A(userSession);
        C227642jf.A03(A0A, userSession);
        A0A.putString("hall_pass_id", str);
        A0A.putString("hall_pass_primary_button_text", str2);
        E1Q e1q = new E1Q();
        e1q.setArguments(A0A);
        e1q.A00 = e7y;
        C331157Pu r1 = bottomSheetFragment.A02;
        if (r1 != null) {
            r1.A0F(e1q, DbS.A0W(userSession));
        }
    }
}
