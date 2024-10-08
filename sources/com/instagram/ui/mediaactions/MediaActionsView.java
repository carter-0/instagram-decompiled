package com.instagram.ui.mediaactions;

import X.0nA;
import X.0qQ;
import X.1G0;
import X.AnonymousClass05K;
import X.AnonymousClass3TN;
import X.AnonymousClass3TO;
import X.AnonymousClass4LZ;
import X.C279084y3;
import X.C355538Qj;
import X.C59971Jcg;
import X.C71662eb;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.TransitionDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.instagram.android.R;
import java.util.Locale;

public class MediaActionsView extends FrameLayout implements AnonymousClass3TN {
    public int A00;
    public ObjectAnimator A01;
    public TransitionDrawable A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public ViewStub A07;
    public ViewStub A08;
    public ViewStub A09;
    public ViewStub A0A;
    public ProgressBar A0B;
    public TextView A0C;
    public TextView A0D;
    public C71662eb A0E;
    public C279084y3 A0F;
    public Integer A0G;
    public boolean A0H;
    public float A0I;
    public int A0J;
    public ViewStub A0K;
    public ViewStub A0L;
    public AnonymousClass3TO A0M;
    public final ViewStub A0N;

    public MediaActionsView(Context context) {
        this(context, (AttributeSet) null);
    }

    private void setProgress(int i) {
        A02(i, false);
    }

    public final void EIB() {
        A02(0, false);
    }

    public void setVisibility(int i) {
        AnonymousClass4LZ.A00(this.A06, C355538Qj.DEFAULT_SWIPE_ANIMATION_DURATION, true, true);
        View view = this.A04;
        RectF rectF = 0nA.A01;
        if (view != null) {
            view.setVisibility(i);
        }
    }

    private void A00() {
        if (this.A0D == null) {
            ViewStub viewStub = this.A0L;
            viewStub.getClass();
            TextView textView = (TextView) viewStub.inflate();
            this.A0D = textView;
            this.A0I = textView.getX();
            this.A0D.setText(1G0.A02(0));
            TextView textView2 = this.A0D;
            C59971Jcg jcg = new C59971Jcg(getContext().getColor(R.color.design_dark_default_color_on_background));
            RectF rectF = 0nA.A01;
            0qQ.A0B(textView2, 0);
            textView2.setBackground(jcg);
        }
    }

    private void A01() {
        if (this.A04 == null) {
            View inflate = this.A0N.inflate();
            this.A04 = inflate;
            this.A02 = (TransitionDrawable) inflate.getBackground();
            View requireViewById = this.A04.requireViewById(R.id.video_states);
            this.A06 = requireViewById;
            this.A09 = (ViewStub) requireViewById.requireViewById(R.id.retry_stub);
            this.A0E = new C71662eb((ViewStub) this.A06.requireViewById(R.id.video_icon_viewstub));
            this.A07 = (ViewStub) this.A06.requireViewById(R.id.caminner_viewstub);
            this.A0C = (TextView) this.A06.requireViewById(R.id.countdown_timer);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.A07, "alpha", new float[]{1.0f, 0.0f});
            this.A01 = ofFloat;
            ofFloat.setDuration(750);
            this.A01.setRepeatMode(2);
            this.A01.setRepeatCount(-1);
            this.A01.setInterpolator(new AccelerateInterpolator());
            this.A08 = (ViewStub) this.A04.findViewById(R.id.progress_bar_stub);
            this.A0L = (ViewStub) this.A04.findViewById(R.id.time_pill_stub);
            this.A0A = (ViewStub) this.A04.findViewById(R.id.video_controls_nux_stub);
            this.A0K = (ViewStub) this.A04.findViewById(R.id.thumbnail_preview_stub);
        }
    }

    private void A02(int i, boolean z) {
        ProgressBar progressBar = this.A0B;
        if (progressBar != null && progressBar.getProgress() != i) {
            this.A0B.setProgress(i, z);
            A00();
            this.A0D.getClass();
            this.A0D.setText(1G0.A02((long) i));
            TextView textView = this.A0D;
            A00();
            this.A04.getClass();
            float width = (((float) this.A04.getWidth()) * 0.06999999f) / 2.0f;
            int width2 = this.A04.getWidth();
            TextView textView2 = this.A0D;
            textView2.getClass();
            textView.setX(Math.min(Math.max((((((float) i) / ((float) this.A00)) * (((float) this.A04.getWidth()) * 0.93f)) + width) - ((float) (this.A0D.getWidth() / 2)), width), ((float) (width2 - textView2.getWidth())) - width));
        }
    }

    private void A03(boolean z) {
        ProgressBar progressBar = this.A0B;
        if (progressBar != null && this.A04 != null) {
            0nA.A0W(progressBar, 80);
            this.A04.getHeight();
            getContext().getResources().getDimensionPixelOffset(R.dimen.abc_action_bar_elevation_material);
            int max = this.A0B.getMax();
            int i = this.A00;
            if (max != i) {
                this.A0B.setMax(i);
            }
            A02(this.A0J, z);
        }
    }

    public final void DJF() {
        if (this.A04 != null) {
            AnonymousClass4LZ.A00(this.A05, 100, false, true);
        }
    }

    public final void DkZ() {
        ViewStub viewStub;
        if (this.A04 != null) {
            View view = this.A05;
            if (view == null && (viewStub = this.A0A) != null) {
                view = viewStub.inflate();
                this.A05 = view;
            }
            AnonymousClass4LZ.A00(view, 100, true, true);
        }
    }

    public final void FLB(int i, int i2) {
        if (this.A0G == AnonymousClass05K.A01) {
            this.A0J = i;
            this.A00 = i2;
            A03(true);
        }
    }

    public void setProgressBar(ProgressBar progressBar, C279084y3 r4) {
        ProgressBar progressBar2 = this.A0B;
        if (!(progressBar2 == null || progressBar2.getId() == progressBar.getId())) {
            this.A0B.setVisibility(8);
        }
        this.A0F = r4;
        this.A0B = progressBar;
        this.A08 = null;
    }

    public void setShouldAlwaysShowCollapsedProgressBar(boolean z) {
        ViewStub viewStub;
        if (z) {
            ProgressBar progressBar = this.A0B;
            if (progressBar == null || progressBar.getVisibility() != 0) {
                if (this.A0B == null && (viewStub = this.A08) != null) {
                    viewStub.setLayoutResource(R.layout.view_media_actions_progress_bar);
                    this.A0B = (ProgressBar) this.A08.inflate();
                    A03(false);
                }
                AnonymousClass4LZ.A00(this.A0B, 100, true, true);
            }
        } else if (this.A0G == AnonymousClass05K.A00) {
            AnonymousClass4LZ.A00(this.A0B, 100, false, true);
        }
    }

    public void setShouldShowCountdownTimer(boolean z) {
        this.A0H = z;
        A01();
        this.A0C.getClass();
        clearAnimation();
        TextView textView = this.A0C;
        int i = 8;
        if (z) {
            i = 0;
        }
        textView.setVisibility(i);
        invalidate();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00cf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setVideoIconState(X.AnonymousClass3TO r10) {
        /*
            r9 = this;
            X.3TO r0 = r9.A0M
            if (r0 == r10) goto L_0x00ac
            r9.A01()
            X.3TO r5 = X.AnonymousClass3TO.HIDDEN_IMMEDIATELY
            r4 = 0
            r3 = 0
            if (r10 == r5) goto L_0x000e
            r3 = 1
        L_0x000e:
            android.view.ViewStub r0 = r9.A07
            if (r0 == 0) goto L_0x0081
            X.2eb r0 = r9.A0E
            if (r0 == 0) goto L_0x0081
            android.view.ViewStub r2 = r9.A09
            r2.getClass()
            X.3TO r1 = X.AnonymousClass3TO.RETRY
            r6 = 8
            r0 = 8
            if (r10 != r1) goto L_0x0024
            r0 = 0
        L_0x0024:
            r2.setVisibility(r0)
            X.3TO r1 = X.AnonymousClass3TO.CLIPS
            if (r10 != r1) goto L_0x00ed
            X.2eb r0 = r9.A0E
            android.view.View r8 = r0.A01()
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            android.content.Context r7 = r9.getContext()
            r2 = 2131238689(0x7f081f21, float:1.8093664E38)
            r0 = 2131099843(0x7f0600c3, float:1.781205E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3JT.A06(r7, r2, r0)
            r8.setImageDrawable(r0)
        L_0x0044:
            android.view.ViewStub r0 = r9.A07
            r0.setVisibility(r6)
        L_0x0049:
            android.animation.ObjectAnimator r0 = r9.A01
            r0.getClass()
            X.3TO r0 = X.AnonymousClass3TO.LOADING
            if (r10 != r0) goto L_0x00cf
            android.animation.ObjectAnimator r2 = r9.A01
            android.view.View r0 = r9.A03
        L_0x0056:
            r2.setTarget(r0)
            android.animation.ObjectAnimator r0 = r9.A01
            r0.start()
        L_0x005e:
            boolean r0 = r9.A0H
            if (r0 == 0) goto L_0x0081
            X.3TO r0 = X.AnonymousClass3TO.TIMER
            if (r10 == r0) goto L_0x00c6
            X.3TO r0 = X.AnonymousClass3TO.LOADING_ANIMATE_TIMER
            if (r10 == r0) goto L_0x00c6
            X.3TO r0 = X.AnonymousClass3TO.AUTOPLAY_USING_TIMER
            if (r10 == r0) goto L_0x00c6
            android.widget.TextView r0 = r9.A0C
            r2 = 250(0xfa, float:3.5E-43)
            X.AnonymousClass4LZ.A00(r0, r2, r4, r3)
            if (r10 != r1) goto L_0x0081
            X.2eb r0 = r9.A0E
            android.view.View r1 = r0.A01()
            r0 = 1
            X.AnonymousClass4LZ.A00(r1, r2, r0, r3)
        L_0x0081:
            android.view.View r0 = r9.A06
            if (r0 == 0) goto L_0x00ad
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x00ad
            X.3TO r0 = X.AnonymousClass3TO.HIDDEN
            if (r10 == r0) goto L_0x0091
            if (r10 != r5) goto L_0x00ad
        L_0x0091:
            android.view.View r1 = r9.A06
            r0 = 250(0xfa, float:3.5E-43)
            X.AnonymousClass4LZ.A00(r1, r0, r4, r3)
        L_0x0098:
            android.view.View r1 = r9.A04
            r1.getClass()
            X.3TO r0 = X.AnonymousClass3TO.GONE
            if (r10 == r0) goto L_0x00a5
            boolean r0 = r9.A0H
            if (r0 != 0) goto L_0x00a7
        L_0x00a5:
            r4 = 8
        L_0x00a7:
            r1.setVisibility(r4)
            r9.A0M = r10
        L_0x00ac:
            return
        L_0x00ad:
            android.view.View r0 = r9.A06
            if (r0 == 0) goto L_0x0098
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x0098
            X.3TO r0 = X.AnonymousClass3TO.HIDDEN
            if (r10 == r0) goto L_0x0098
            if (r10 == r5) goto L_0x0098
            android.view.View r2 = r9.A06
            r1 = 250(0xfa, float:3.5E-43)
            r0 = 1
            X.AnonymousClass4LZ.A00(r2, r1, r0, r3)
            goto L_0x0098
        L_0x00c6:
            android.widget.TextView r0 = r9.A0C
            r0.getClass()
            r0.setVisibility(r4)
            goto L_0x0081
        L_0x00cf:
            X.3TO r0 = X.AnonymousClass3TO.LOADING_ANIMATE_TIMER
            android.animation.ObjectAnimator r2 = r9.A01
            if (r10 != r0) goto L_0x00d9
            android.widget.TextView r0 = r9.A0C
            goto L_0x0056
        L_0x00d9:
            r2.end()
            android.view.ViewStub r0 = r9.A07
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.setAlpha(r2)
            android.widget.TextView r0 = r9.A0C
            r0.getClass()
            r0.setAlpha(r2)
            goto L_0x005e
        L_0x00ed:
            X.3TO r0 = X.AnonymousClass3TO.PLAY
            if (r10 != r0) goto L_0x0106
            X.2eb r0 = r9.A0E
            r0.A03(r4)
            X.2eb r0 = r9.A0E
            android.view.View r2 = r0.A01()
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r0 = 2131237276(0x7f08199c, float:1.8090798E38)
            r2.setImageResource(r0)
            goto L_0x0044
        L_0x0106:
            X.3TO r0 = X.AnonymousClass3TO.LOADING
            if (r10 == r0) goto L_0x0115
            X.3TO r0 = X.AnonymousClass3TO.AUTOPLAY
            if (r10 == r0) goto L_0x0115
            X.2eb r0 = r9.A0E
            r0.A03(r6)
            goto L_0x0044
        L_0x0115:
            X.2eb r0 = r9.A0E
            r0.A03(r4)
            X.2eb r0 = r9.A0E
            android.view.View r2 = r0.A01()
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r0 = 2131237268(0x7f081994, float:1.8090782E38)
            r2.setImageResource(r0)
            android.view.View r0 = r9.A03
            if (r0 != 0) goto L_0x0136
            android.view.ViewStub r0 = r9.A07
            if (r0 == 0) goto L_0x0136
            android.view.View r0 = r0.inflate()
            r9.A03 = r0
        L_0x0136:
            android.view.ViewStub r0 = r9.A07
            r0.setVisibility(r4)
            goto L_0x0049
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.mediaactions.MediaActionsView.setVideoIconState(X.3TO):void");
    }

    private float getTimePillScalePivotX() {
        A00();
        this.A0D.getClass();
        return ((this.A0D.getX() - this.A0I) / ((float) this.A0D.getWidth())) + 0.5f;
    }

    public final void EiM(int i, boolean z) {
        A01();
        this.A0C.getClass();
        String A022 = 1G0.A02((long) i);
        if (z) {
            A022 = String.format(Locale.getDefault(), this.A0C.getResources().getString(2131976522), new Object[]{A022});
        }
        this.A0C.setText(A022);
        this.A0C.requestLayout();
    }

    public void setVideoControlsDelegate(C279084y3 r1) {
        this.A0F = r1;
    }

    public final void AJC(Integer num, boolean z, boolean z2) {
        this.A0G = num;
    }

    public MediaActionsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0H = true;
        this.A0M = AnonymousClass3TO.GONE;
        this.A0G = AnonymousClass05K.A00;
        this.A0N = (ViewStub) LayoutInflater.from(context).inflate(R.layout.view_media_actions, this).requireViewById(R.id.video_actions_view_stub);
    }

    public MediaActionsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
