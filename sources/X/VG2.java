package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;

public abstract class VG2 {
    public static void A00(Bundle bundle, FragmentActivity fragmentActivity, UserSession userSession, String str) {
        bundle.putString("content_fragment_type", str);
        AnonymousClass6W8 r3 = new AnonymousClass6W8(fragmentActivity, bundle, userSession, TransparentModalActivity.class, "reel_swipe_up");
        r3.A0J = new int[]{R.anim.modal_slide_up_enter, R.anim.modal_empty_animation, R.anim.modal_empty_animation, R.anim.modal_slide_down_exit};
        r3.A0C(fragmentActivity);
    }
}
