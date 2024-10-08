package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel;
import com.instagram.creation.capture.quickcapture.sundial.reshare.model.ClipsCelebrationReshareViewModel;

/* renamed from: X.9x3  reason: invalid class name and case insensitive filesystem */
public abstract class C393819x3 {
    public static final void A00(Activity activity, Fragment fragment, 28D r17, UserSession userSession, ReelsVisualRepliesModel reelsVisualRepliesModel, ClipsCelebrationReshareViewModel clipsCelebrationReshareViewModel, 1Xj r21, String str, boolean z) {
        UserSession userSession2 = userSession;
        28D r4 = r17;
        AnonymousClass9PJ.A00(userSession2).A07(r4, true);
        0gy r1 = null;
        Activity activity2 = activity;
        AnonymousClass6ST r9 = new AnonymousClass6ST(activity, true);
        r9.A00(activity.getString(2131965491));
        Fragment fragment2 = fragment;
        if (fragment != null && fragment2.isAdded() && !fragment2.mDetached) {
            r1 = AnonymousClass07i.A00(fragment2);
        }
        1Xj r8 = r21;
        C290815g0 A03 = C59730JVo.A03(activity2, userSession2, new C11211SFl(r8.A2U(), "ClipsReshareToStoryHelper", true, false, false));
        A03.A00 = new C385949jn(activity2, r4, userSession2, reelsVisualRepliesModel, clipsCelebrationReshareViewModel, r8, r9, str);
        if (z || r1 == null) {
            1ES.A03(A03);
        } else {
            1ES.A00(activity2, r1, A03);
        }
    }
}
