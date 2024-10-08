package X;

import android.app.Activity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.nux.common.HowItWorksNuxFragment$Row;

/* renamed from: X.Kwx  reason: case insensitive filesystem */
public abstract class C63437Kwx {
    public static final void A00(Activity activity, AnonymousClass0iw r9, UserSession userSession, BottomSheetFragment bottomSheetFragment) {
        0qQ.A0B(userSession, 0);
        HowItWorksNuxFragment$Row howItWorksNuxFragment$Row = new HowItWorksNuxFragment$Row(2131973570, 2131973569, Integer.valueOf(R.drawable.instagram_camera_pano_outline_24), (Integer) null);
        int i = 2131973571;
        if (182.A06(0Tu.A06, userSession, 36321675133986431L)) {
            i = 2131973572;
        }
        E1X A01 = C49781F6o.A01(userSession, r9.getModuleName(), 0sr.A1L(new HowItWorksNuxFragment$Row[]{howItWorksNuxFragment$Row, new HowItWorksNuxFragment$Row(2131973573, Integer.valueOf(i), Integer.valueOf(R.drawable.instagram_direct_pano_outline_24), (Integer) null), new HowItWorksNuxFragment$Row(2131973575, 2131973574, Integer.valueOf(R.drawable.instagram_circle_check_pano_outline_24), (Integer) null), new HowItWorksNuxFragment$Row(2131973577, 2131973576, Integer.valueOf(R.drawable.instagram_eye_pano_outline_24), (Integer) null)}));
        if (bottomSheetFragment != null) {
            C331157Pu r2 = bottomSheetFragment.A02;
            if (r2 != null) {
                C331127Pr A0W = DbS.A0W(userSession);
                DbZ.A0z(activity, A0W, 2131973578);
                r2.A0F(A01, A0W);
                return;
            }
            return;
        }
        C331127Pr A0W2 = DbS.A0W(userSession);
        DbZ.A0z(activity, A0W2, 2131973578);
        DbU.A0y(activity, A01, A0W2);
    }
}
