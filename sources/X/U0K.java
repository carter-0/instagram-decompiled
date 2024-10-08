package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

public final class U0K extends AnimatorListenerAdapter {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ TextView A02;
    public final /* synthetic */ TextView A03;
    public final /* synthetic */ C18786W1o A04;

    public U0K(TextView textView, TextView textView2, C18786W1o w1o, int i, int i2) {
        this.A04 = w1o;
        this.A01 = i;
        this.A02 = textView;
        this.A00 = i2;
        this.A03 = textView2;
    }

    public final void onAnimationEnd(Animator animator) {
        TextView textView;
        C18786W1o w1o = this.A04;
        w1o.A00 = this.A01;
        w1o.A04 = null;
        TextView textView2 = this.A02;
        if (textView2 != null) {
            textView2.setVisibility(4);
            if (this.A00 == 1 && (textView = w1o.A09) != null) {
                textView.setText((CharSequence) null);
            }
        }
        TextView textView3 = this.A03;
        if (textView3 != null) {
            textView3.setTranslationY(0.0f);
            textView3.setAlpha(1.0f);
        }
    }

    public final void onAnimationStart(Animator animator) {
        AnonymousClass7TF.A16(this.A03);
    }
}
