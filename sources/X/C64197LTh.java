package X;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.LTh  reason: case insensitive filesystem */
public final class C64197LTh implements LayoutTransition.TransitionListener {
    public final /* synthetic */ LayoutTransition A00;

    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i) {
    }

    public C64197LTh(LayoutTransition layoutTransition) {
        this.A00 = layoutTransition;
    }

    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i) {
        this.A00.disableTransitionType(4);
    }
}
