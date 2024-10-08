package X;

import android.animation.Animator;
import android.view.ViewGroup;
import android.widget.TextView;

/* renamed from: X.9R4  reason: invalid class name */
public final class AnonymousClass9R4 extends AnonymousClass4HM {
    public final /* synthetic */ TextView A00;
    public final /* synthetic */ TextView A01;
    public final /* synthetic */ C62320sa A02;

    public AnonymousClass9R4(TextView textView, TextView textView2, C62320sa r3) {
        this.A01 = textView;
        this.A00 = textView2;
        this.A02 = r3;
    }

    public final void onAnimationEnd(Animator animator) {
        TextView textView = this.A00;
        if (textView != null) {
            textView.setVisibility(4);
        }
    }

    public final void onAnimationStart(Animator animator) {
        TextView textView = this.A01;
        if (textView != null) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            0qQ.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            layoutParams.width = textView.getMeasuredWidth();
            layoutParams.height = textView.getMeasuredHeight();
            textView.setLayoutParams(layoutParams);
        }
        TextView textView2 = this.A00;
        if (textView2 != null) {
            ViewGroup.LayoutParams layoutParams2 = textView2.getLayoutParams();
            0qQ.A0C(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            layoutParams2.width = textView2.getMeasuredWidth();
            layoutParams2.height = textView2.getMeasuredHeight();
            textView2.setLayoutParams(layoutParams2);
        }
        this.A02.invoke();
    }
}
