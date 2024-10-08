package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.ui.widget.edittext.AnimatedHintsTextLayout;

/* renamed from: X.61n  reason: invalid class name and case insensitive filesystem */
public final class C3020961n implements View.OnLayoutChangeListener {
    public final /* synthetic */ AnimatedHintsTextLayout A00;

    public C3020961n(AnimatedHintsTextLayout animatedHintsTextLayout) {
        this.A00 = animatedHintsTextLayout;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        String str;
        AnimatedHintsTextLayout animatedHintsTextLayout = this.A00;
        TextView textView = animatedHintsTextLayout.A08;
        if (textView == null) {
            str = "currentHintTextView";
        } else {
            AnimatedHintsTextLayout.A01(textView, animatedHintsTextLayout);
            TextView textView2 = animatedHintsTextLayout.A09;
            if (textView2 == null) {
                str = "nextHintTextView";
            } else {
                AnimatedHintsTextLayout.A01(textView2, animatedHintsTextLayout);
                AnimatedHintsTextLayout.A02(animatedHintsTextLayout);
                animatedHintsTextLayout.invalidate();
                animatedHintsTextLayout.requestLayout();
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
