package X;

import android.app.Activity;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.nux.common.HowItWorksNuxFragment$Row;
import java.util.ArrayList;

public abstract class A14 {
    public static final void A00(Activity activity, View.OnClickListener onClickListener, UserSession userSession) {
        ArrayList A1L;
        UserSession userSession2 = userSession;
        boolean A1U = AnonymousClass7TF.A1U(0, userSession2, activity);
        boolean A01 = 2R8.A01(userSession2);
        HowItWorksNuxFragment$Row[] howItWorksNuxFragment$RowArr = new HowItWorksNuxFragment$Row[4];
        AnonymousClass7TH.A0b(2131967841, howItWorksNuxFragment$RowArr, R.drawable.instagram_photo_pano_outline_24, 0);
        AnonymousClass7TH.A0b(2131967842, howItWorksNuxFragment$RowArr, R.drawable.instagram_creator_marketplace_pano_outline_24, A1U ? 1 : 0);
        AnonymousClass7TH.A0b(2131967843, howItWorksNuxFragment$RowArr, R.drawable.instagram_delete_pano_outline_24, 2);
        if (A01) {
            AnonymousClass7TH.A0b(2131967844, howItWorksNuxFragment$RowArr, R.drawable.instagram_eye_pano_outline_24, 3);
            A1L = 0sr.A1L(howItWorksNuxFragment$RowArr);
        } else {
            AnonymousClass7TH.A0b(2131967845, howItWorksNuxFragment$RowArr, R.drawable.instagram_eye_pano_outline_24, 3);
            A1L = 0sr.A1L(howItWorksNuxFragment$RowArr);
        }
        C331127Pr r2 = new C331127Pr(userSession2);
        r2.A0g = activity.getString(2131974457);
        r2.A1J = A1U;
        r2.A0K = new FPG(45, (Object) activity, (Object) onClickListener);
        r2.A0h = activity.getString(2131971912);
        r2.A0w = A1U;
        r2.A00().A02(activity, C49781F6o.A00(userSession2, (Boolean) null, Integer.valueOf(R.drawable.ig_illustrations_illo_music_pick_refresh), "story_music_pick_disclosure", activity.getString(2131974458), (String) null, A1L));
    }
}
