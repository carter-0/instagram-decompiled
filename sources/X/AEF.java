package X;

import android.app.Activity;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.nux.common.HowItWorksNuxFragment$Row;
import java.util.ArrayList;
import java.util.List;

public abstract class AEF {
    public static final C39890ADo A00(C39741A7h a7h) {
        C39890ADo aDo = new C39890ADo();
        aDo.A03 = a7h.A02;
        aDo.A0A = AnonymousClass05K.A01;
        aDo.A06 = new C16337Ut7(a7h.A00, a7h.A01);
        aDo.A04 = a7h.A04;
        aDo.A02 = a7h.A03;
        aDo.A0Q = false;
        aDo.A0R = false;
        return aDo;
    }

    public static final C310416b1 A01(C255783ui r31) {
        C255783ui r2 = r31;
        return new C310416b1((AnonymousClass8BH) new C16337Ut7(r2.A03, r2.A04), (AnonymousClass8DA) null, (C3510487j) null, AnonymousClass05K.A01, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, 1.0f, 2.0f, -1.0f, r2.A02, r2.A01 * 360.0f, 7, true, false, true, false, true, false, false, true, true, true, true, true, false, false);
    }

    public static final void A02(Activity activity, View.OnClickListener onClickListener, UserSession userSession) {
        ArrayList A1L;
        int i;
        UserSession userSession2 = userSession;
        boolean A1U = AnonymousClass7TF.A1U(0, userSession2, activity);
        boolean A01 = 2R8.A01(userSession2);
        int i2 = 2131974536;
        if (!A01) {
            i2 = 2131974539;
        }
        HowItWorksNuxFragment$Row[] howItWorksNuxFragment$RowArr = new HowItWorksNuxFragment$Row[3];
        AnonymousClass7TH.A0b(2131974538, howItWorksNuxFragment$RowArr, R.drawable.instagram_circle_check_pano_outline_24, 0);
        if (A01) {
            AnonymousClass7TH.A0b(2131974535, howItWorksNuxFragment$RowArr, R.drawable.instagram_user_circle_pano_outline_24, A1U);
            AnonymousClass7TH.A0b(2131974537, howItWorksNuxFragment$RowArr, R.drawable.instagram_eye_pano_outline_24, 2);
            A1L = 0sr.A1L(howItWorksNuxFragment$RowArr);
            if (182.A06(0Tu.A05, userSession2, 36319939967524664L)) {
                i = 2131974533;
            }
            C331127Pr r2 = new C331127Pr(userSession2);
            r2.A0g = activity.getString(2131974531);
            r2.A1J = A1U;
            r2.A0K = new FPE(31, (Object) activity, (Object) onClickListener);
            r2.A0h = activity.getString(2131971912);
            r2.A0w = A1U;
            r2.A00().A02(activity, C49781F6o.A00(userSession2, (Boolean) null, (Integer) null, "story_templates_disclosure", activity.getString(2131974546), (String) null, A1L));
        }
        AnonymousClass7TH.A0b(2131974535, howItWorksNuxFragment$RowArr, R.drawable.instagram_user_circle_pano_outline_24, A1U ? 1 : 0);
        AnonymousClass7TH.A0b(Integer.valueOf(i2), howItWorksNuxFragment$RowArr, R.drawable.instagram_story_pano_outline_24, 2);
        A1L = 0sr.A1L(howItWorksNuxFragment$RowArr);
        if (182.A06(0Tu.A05, userSession2, 36319939967524664L)) {
            i = 2131974534;
        }
        C331127Pr r22 = new C331127Pr(userSession2);
        r22.A0g = activity.getString(2131974531);
        r22.A1J = A1U;
        r22.A0K = new FPE(31, (Object) activity, (Object) onClickListener);
        r22.A0h = activity.getString(2131971912);
        r22.A0w = A1U;
        r22.A00().A02(activity, C49781F6o.A00(userSession2, (Boolean) null, (Integer) null, "story_templates_disclosure", activity.getString(2131974546), (String) null, A1L));
        A1L.add(new HowItWorksNuxFragment$Row(Integer.valueOf(i), (Integer) null, Integer.valueOf(R.drawable.instagram_delete_pano_outline_24), (Integer) null));
        C331127Pr r222 = new C331127Pr(userSession2);
        r222.A0g = activity.getString(2131974531);
        r222.A1J = A1U;
        r222.A0K = new FPE(31, (Object) activity, (Object) onClickListener);
        r222.A0h = activity.getString(2131971912);
        r222.A0w = A1U;
        r222.A00().A02(activity, C49781F6o.A00(userSession2, (Boolean) null, (Integer) null, "story_templates_disclosure", activity.getString(2131974546), (String) null, A1L));
    }
}
