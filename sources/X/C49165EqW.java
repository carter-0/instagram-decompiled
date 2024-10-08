package X;

import android.animation.LayoutTransition;
import android.view.ViewGroup;

/* renamed from: X.EqW  reason: case insensitive filesystem */
public abstract class C49165EqW {
    public static final void A00(ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 0);
        LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
        if (layoutTransition == null) {
            layoutTransition = new LayoutTransition();
            viewGroup.setLayoutTransition(layoutTransition);
        }
        layoutTransition.enableTransitionType(4);
        viewGroup.setClipChildren(false);
    }
}
