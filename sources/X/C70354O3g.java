package X;

import android.app.Activity;
import android.graphics.RectF;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.direct.camera.DirectCameraViewModel;

/* renamed from: X.O3g  reason: case insensitive filesystem */
public abstract class C70354O3g {
    public static final void A00(Activity activity, RectF rectF, 28D r10, UserSession userSession, C273434mZ r12, DirectCameraViewModel directCameraViewModel, C250973mM r14, Integer num, String str, float f, boolean z) {
        RectF rectF2;
        String A0r = JTP.A0r(r14.A0H);
        int i = r14.A01;
        if (z) {
            float A08 = (float) 0nA.A08(activity);
            rectF2 = new RectF(rectF.left, A08 - f, rectF.right, A08);
        } else {
            rectF2 = rectF;
        }
        C360908fL.A00(r10);
        Bundle A0B = C66582MXn.A0B(directCameraViewModel);
        A0B.putBoolean("DirectReplyCameraFragments.ARG_REPLY_THUMBNAIL_ENABLED", false);
        A0B.putString("DirectVisualReplyFragment.ARG_REPLY_REEL_ID", A0r);
        A0B.putInt("DirectVisualReplyFragment.ARG_REPLY_REEL_CURRENT_ITEM_INDEX", i);
        A0B.putString(AnonymousClass000.A00(926), str);
        A0B.putParcelable(AnonymousClass000.A00(24), rectF);
        A0B.putParcelable(AnonymousClass000.A00(2201), rectF2);
        A0B.putSerializable("DirectReplyCameraFragments.ARG_REPLY_ENTRY_POINT", r10);
        A0B.putString("DirectQuickReplyCameraFragment.REPLY_CAM_ARG_CAMERA_AR_EFFECT_ID", (String) null);
        A0B.putString("DirectQuickReplyCameraFragment.REPLY_CAM_ARG_CAMERA_INITIAL_CANVAS_ELEMENT", (String) null);
        AnonymousClass6W8 A02 = AnonymousClass6W8.A02(activity, A0B, userSession, TransparentModalActivity.class, "direct_visual_reply_fragment");
        A02.A0E(r12);
        if (num != null) {
            A02.A0A(activity, num.intValue());
        } else {
            A02.A0C(activity);
        }
        1wS.A01(userSession).A00.A07();
    }
}
