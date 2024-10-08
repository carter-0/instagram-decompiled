package com.instagram.ui.widget.countdowntimer;

import X.0qQ;
import X.AnonymousClass8JB;
import X.C41783B0m;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CountdownTimerView extends FrameLayout {
    public int A00;
    public AlphaAnimation A01;
    public TextView A02;
    public C41783B0m A03;
    public GradientSpinner A04;
    public AnonymousClass8JB A05;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CountdownTimerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    public final void setCallback(C41783B0m b0m) {
        this.A03 = b0m;
    }

    public final void setNumTicks(int i) {
        this.A00 = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CountdownTimerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A00 = 3;
        LayoutInflater.from(getContext()).inflate(R.layout.layout_countdown_timer, this);
        this.A04 = (GradientSpinner) requireViewById(R.id.countdown_timer_spinner);
        this.A02 = (TextView) requireViewById(R.id.countdown_timer_title_text);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.5f);
        this.A01 = alphaAnimation;
        alphaAnimation.setDuration(1000);
        AlphaAnimation alphaAnimation2 = this.A01;
        0qQ.A0A(alphaAnimation2);
        alphaAnimation2.setRepeatCount(-1);
        AlphaAnimation alphaAnimation3 = this.A01;
        0qQ.A0A(alphaAnimation3);
        alphaAnimation3.setRepeatMode(2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CountdownTimerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CountdownTimerView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }
}
