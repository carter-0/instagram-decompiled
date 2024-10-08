package com.instagram.creation.video.ui;

import X.1G0;
import X.AnonymousClass05K;
import X.C59796JYp;
import X.C59872Jav;
import X.C66523MVb;
import X.DbT;
import X.DbU;
import X.JWN;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

public class VideoCaptureTimerView extends FrameLayout implements C66523MVb {
    public Animation A00;
    public ImageView A01;
    public TextView A02;
    public C59872Jav A03;

    public VideoCaptureTimerView(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void D3P(C59796JYp jYp) {
    }

    public final void D3W(C59796JYp jYp) {
    }

    public final void D3X() {
    }

    public final void DfJ() {
    }

    private void A00() {
        C59872Jav jav = this.A03;
        jav.getClass();
        this.A02.setText(1G0.A02((long) jav.A01.A00()));
    }

    public final void D3Q(C59796JYp jYp, Integer num) {
        if (num == AnonymousClass05K.A00) {
            A00();
            setVisibility(0);
            this.A01.startAnimation(this.A00);
            return;
        }
        setVisibility(4);
        this.A01.clearAnimation();
    }

    public void setClipStackManager(C59872Jav jav) {
        this.A03 = jav;
        A00();
    }

    public final void D3R(C59796JYp jYp) {
        A00();
    }

    public VideoCaptureTimerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = getContext();
        View.inflate(context2, R.layout.video_capture_timer_view, this);
        this.A01 = DbU.A0F(this, R.id.video_capture_blinker);
        this.A02 = DbU.A0G(this, R.id.video_capture_timer);
        Integer A022 = JWN.A02(context2);
        if (A022 == AnonymousClass05K.A0C || A022 == AnonymousClass05K.A0N) {
            DbT.A17(context2, this.A02, R.color.design_dark_default_color_on_background);
        }
        this.A00 = AnimationUtils.loadAnimation(context2, R.anim.recording_blinker);
    }

    public VideoCaptureTimerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
