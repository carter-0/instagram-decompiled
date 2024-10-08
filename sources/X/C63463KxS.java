package X;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;

/* renamed from: X.KxS  reason: case insensitive filesystem */
public abstract class C63463KxS {
    public static Animation A00(Fragment fragment, int i, boolean z) {
        View view = fragment.mView;
        if (i == R.anim.right_in && z) {
            Animation loadAnimation = AnimationUtils.loadAnimation(fragment.requireContext(), R.anim.right_in);
            loadAnimation.setAnimationListener(new IE5(view, 7));
            return loadAnimation;
        } else if (view == null) {
            return null;
        } else {
            view.setTranslationZ(0.0f);
            return null;
        }
    }
}
