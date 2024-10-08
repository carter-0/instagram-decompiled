package X;

import android.animation.Animator;
import android.widget.TextView;
import com.instagram.common.ui.base.IgTextView;

public final class HG1 extends AnonymousClass4HM {
    public final /* synthetic */ C254073rt A00;

    public HG1(C254073rt r1) {
        this.A00 = r1;
    }

    public final void onAnimationEnd(Animator animator) {
        C254073rt r1 = this.A00;
        TextView textView = r1.A01;
        textView.setVisibility(8);
        IgTextView igTextView = r1.A06;
        igTextView.setVisibility(8);
        textView.setAlpha(1.0f);
        igTextView.setAlpha(1.0f);
    }
}
