package X;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.view.View;
import com.instagram.android.R;

/* renamed from: X.5sS  reason: invalid class name and case insensitive filesystem */
public abstract class C297845sS {
    public static final int[] A00 = {16843848};

    public static void A00(View view, float f) {
        int integer = view.getResources().getInteger(R.integer.abc_config_activityShortDur);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = (long) integer;
        stateListAnimator.addState(new int[]{16842766, R.attr.state_liftable, -2130971242}, ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(j));
        stateListAnimator.addState(new int[]{16842766}, ObjectAnimator.ofFloat(view, "elevation", new float[]{f}).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(0));
        view.setStateListAnimator(stateListAnimator);
    }
}
