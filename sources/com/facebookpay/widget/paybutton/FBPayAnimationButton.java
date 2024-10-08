package com.facebookpay.widget.paybutton;

import X.0Tu;
import X.0qQ;
import X.182;
import X.AnonymousClass000;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass2E0;
import X.AnonymousClass7TE;
import X.C11409SSh;
import X.C11431STx;
import X.C11434SUn;
import X.C18674VwX;
import X.C273654mx;
import X.C54770HSc;
import X.C56678I7i;
import X.C62320sa;
import X.C71382cm;
import X.C8882RDz;
import X.C8923RFr;
import X.DbU;
import X.I82;
import X.QA4;
import X.RH3;
import X.SRn;
import X.SUj;
import X.TVA;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RotateDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewPropertyAnimator;
import android.view.animation.PathInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.common.dextricks.Constants;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.facebookpay.widget.button.FBPayButton;
import com.instagram.android.R;

public final class FBPayAnimationButton extends ShimmerFrameLayout {
    public static final AnonymousClass0eM A0C = AnonymousClass0eN.A01(TVA.A00);
    public static final boolean A0D = 182.A06(0Tu.A06, C11431STx.A00(), 36314498245855888L);
    public Drawable A00;
    public Drawable A01;
    public ViewPropertyAnimator A02;
    public ViewPropertyAnimator A03;
    public TextView A04;
    public FBPayButton A05;
    public QA4 A06;
    public C62320sa A07;
    public String A08;
    public boolean A09;
    public final int A0A;
    public final AttributeSet A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FBPayAnimationButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A0B = attributeSet;
        this.A0A = i;
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 17));
        setClipChildren(false);
        Context context2 = getContext();
        AnonymousClass2E0.A0A();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(R.style.FBPayUIButton, C71382cm.A0d);
        AnonymousClass2E0.A0A();
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        if (drawable != null) {
            AnonymousClass2E0.A0A();
            DbU.A10(context2, drawable, R.color.igds_primary_text);
            this.A00 = drawable;
            AnonymousClass2E0.A0A();
            Drawable drawable2 = obtainStyledAttributes.getDrawable(1);
            if (drawable2 != null) {
                AnonymousClass2E0.A0A();
                DbU.A10(context2, drawable2, R.color.fds_transparent);
                this.A01 = drawable2;
                obtainStyledAttributes.recycle();
                C54770HSc.A00(this, (Integer) null);
                A00(this);
                this.A08 = "";
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    private final Animator.AnimatorListener getCollapseButtonAnimationEndListener() {
        return new C56678I7i(this, 0);
    }

    public final void A06(boolean z) {
        super.A06(true);
        Drawable drawable = this.A00;
        if (drawable == null) {
            0qQ.A0F("shimmerViewBackground");
            throw AnonymousClass00P.createAndThrow();
        }
        setBackground(drawable);
        getButtonView().setVisibility(8);
        getProgressBarView().setVisibility(8);
        C18674VwX.A00(this, (Boolean) null, AnonymousClass05K.A00, (String) null, getButtonView().getContext().getString(2131961222));
        setImportantForAccessibility(1);
    }

    public final void A08(SUj sUj) {
        C8882RDz rDz = sUj.A00;
        if (rDz != C8882RDz.LOADING) {
            removeView(getButtonView());
            if (getProgressBarView().getScaleX() != 1.0f) {
                getProgressBarView().setScaleX(1.0f);
                getProgressBarView().setScaleY(1.0f);
            }
            A01(this);
            if (rDz != null) {
                int ordinal = rDz.ordinal();
                if (ordinal == 0) {
                    C18674VwX.A00(this, (Boolean) null, AnonymousClass05K.A00, (String) null, getContext().getString(2131961388));
                    setImportantForAccessibility(1);
                    getProgressBarView().setIcon(RH3.A0P);
                    QA4 progressBarView = getProgressBarView();
                    progressBarView.setVisibility(0);
                    progressBarView.setCircleColor(4);
                    progressBarView.A00(21);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                    ofFloat.setDuration(250).addUpdateListener(new I82(2, (Object) AnonymousClass7TE.A0S(progressBarView), (Object) this, (Object) this.A07));
                    ofFloat.start();
                    return;
                } else if (ordinal == 1) {
                    C18674VwX.A00(this, (Boolean) null, AnonymousClass05K.A00, (String) null, getContext().getString(2131961389));
                    setImportantForAccessibility(1);
                    getProgressBarView().setCircleColor(4);
                    QA4 progressBarView2 = getProgressBarView();
                    progressBarView2.A00(4);
                    RotateDrawable rotateDrawable = progressBarView2.A02;
                    if (rotateDrawable == null) {
                        0qQ.A0F("layerSpinnerRingDrawable");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    rotateDrawable.setAlpha(0);
                    getProgressBarView().setIcon(RH3.A0Q);
                    if (Build.VERSION.SDK_INT >= 30) {
                        performHapticFeedback(16);
                        return;
                    }
                    return;
                } else if (ordinal == 2) {
                    return;
                }
            }
            throw AnonymousClass7TE.A1K();
        }
    }

    public final void setButtonView(FBPayButton fBPayButton) {
        0qQ.A0B(fBPayButton, 0);
        this.A05 = fBPayButton;
    }

    public final void setProgressBarView(QA4 qa4) {
        0qQ.A0B(qa4, 0);
        this.A06 = qa4;
    }

    public final void setProgressMsgView(TextView textView) {
        0qQ.A0B(textView, 0);
        this.A04 = textView;
    }

    public final void setText(String str) {
        0qQ.A0B(str, 0);
        getButtonView().setText(str);
        this.A08 = str;
    }

    public static final void A01(FBPayAnimationButton fBPayAnimationButton) {
        ViewPropertyAnimator viewPropertyAnimator = fBPayAnimationButton.A03;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator viewPropertyAnimator2 = fBPayAnimationButton.A02;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
        }
        ViewPropertyAnimator viewPropertyAnimator3 = fBPayAnimationButton.getProgressBarView().A03;
        if (viewPropertyAnimator3 != null) {
            viewPropertyAnimator3.cancel();
        }
        fBPayAnimationButton.getProgressBarView().setVisibility(8);
        fBPayAnimationButton.getProgressMsgView().setVisibility(8);
    }

    public final AttributeSet getAttrs() {
        return this.A0B;
    }

    public final FBPayButton getButtonView() {
        FBPayButton fBPayButton = this.A05;
        if (fBPayButton != null) {
            return fBPayButton;
        }
        0qQ.A0F("buttonView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final int getDefStyleAttr() {
        return this.A0A;
    }

    public final boolean getPayButtonState() {
        return this.A09;
    }

    public final C62320sa getPostSuccessfulTransactionAction() {
        return this.A07;
    }

    public final QA4 getProgressBarView() {
        QA4 qa4 = this.A06;
        if (qa4 != null) {
            return qa4;
        }
        0qQ.A0F("progressBarView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final TextView getProgressMsgView() {
        TextView textView = this.A04;
        if (textView != null) {
            return textView;
        }
        0qQ.A0F("progressMsgView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getText() {
        return this.A08;
    }

    public final void setPostSuccessfulTransactionAction(C62320sa r1) {
        this.A07 = r1;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.QA4, android.widget.ProgressBar, android.view.View] */
    public static final void A00(FBPayAnimationButton fBPayAnimationButton) {
        Context A0S = AnonymousClass7TE.A0S(fBPayAnimationButton);
        AttributeSet attributeSet = fBPayAnimationButton.A0B;
        int i = fBPayAnimationButton.A0A;
        fBPayAnimationButton.setButtonView(new FBPayButton(A0S, attributeSet, i, C8923RFr.A08));
        fBPayAnimationButton.getButtonView().setId(R.id.fbpay_ui_button_id);
        ? progressBar = new ProgressBar(A0S, attributeSet, i);
        progressBar.setIndeterminate(true);
        Resources resources = progressBar.getResources();
        progressBar.setIndeterminateDrawable(resources.getDrawable(R.drawable.fbpay_widget_pay_spinner, progressBar.getContext().getTheme()));
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.account_group_management_clickable_width);
        progressBar.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize, 17));
        Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
        0qQ.A0C(indeterminateDrawable, C273654mx.A00(16));
        LayerDrawable layerDrawable = (LayerDrawable) indeterminateDrawable;
        Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.layer_item_circle);
        0qQ.A0C(findDrawableByLayerId, C273654mx.A00(0));
        progressBar.A01 = (GradientDrawable) findDrawableByLayerId;
        Drawable findDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(R.id.layer_item_spinner);
        0qQ.A0C(findDrawableByLayerId2, "null cannot be cast to non-null type android.graphics.drawable.RotateDrawable");
        progressBar.A02 = (RotateDrawable) findDrawableByLayerId2;
        Drawable findDrawableByLayerId3 = layerDrawable.findDrawableByLayerId(R.id.layer_item_icon);
        0qQ.A0C(findDrawableByLayerId3, AnonymousClass000.A00(13));
        progressBar.A00 = findDrawableByLayerId3;
        progressBar.setCircleColor(20);
        progressBar.setIcon(RH3.A0S);
        progressBar.A00(16);
        C11409SSh.A01(progressBar, 4);
        progressBar.setVisibility(4);
        fBPayAnimationButton.setProgressBarView(progressBar);
        fBPayAnimationButton.getProgressBarView().setId(R.id.fbpay_ui_progress_bar_id);
        TextView textView = new TextView(A0S, attributeSet, i);
        textView.setAlpha(0.0f);
        SRn.A01(textView, 3, 1);
        fBPayAnimationButton.setProgressMsgView(textView);
        fBPayAnimationButton.getProgressMsgView().setId(R.id.fbpay_ui_progress_message_id);
        TextView progressMsgView = fBPayAnimationButton.getProgressMsgView();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        progressMsgView.setLayoutParams(layoutParams);
        fBPayAnimationButton.addView(fBPayAnimationButton.getButtonView());
        fBPayAnimationButton.addView(fBPayAnimationButton.getProgressBarView());
        fBPayAnimationButton.addView(fBPayAnimationButton.getProgressMsgView());
        fBPayAnimationButton.A05();
    }

    public final void A05() {
        super.A05();
        Drawable drawable = this.A01;
        if (drawable == null) {
            0qQ.A0F("trasparentBackground");
            throw AnonymousClass00P.createAndThrow();
        }
        setBackground(drawable);
        getButtonView().setVisibility(0);
        setFocusable(false);
        setImportantForAccessibility(2);
        getProgressMsgView().setImportantForAccessibility(2);
    }

    public final void A07() {
        if (getProgressBarView().getVisibility() != 0) {
            182.A06(0Tu.A05, C11431STx.A00(), 36314498245855888L);
            Drawable current = getButtonView().getBackground().getCurrent();
            0qQ.A0C(current, C273654mx.A00(0));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{((GradientDrawable) current).getCornerRadius(), AnonymousClass7TE.A03(getButtonView()) / 2.0f});
            ofFloat.setDuration(400).addUpdateListener(new C11434SUn(this));
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, (getButtonView().getX() + ((float) (getButtonView().getWidth() / 2))) - ((float) (getButtonView().getHeight() / 2)), 0.0f, 0.0f);
            AnonymousClass0eM r2 = A0C;
            PathInterpolator pathInterpolator = (PathInterpolator) r2.getValue();
            if (pathInterpolator != null) {
                translateAnimation.setInterpolator(pathInterpolator);
            }
            translateAnimation.setDuration(400);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(ofFloat);
            PathInterpolator pathInterpolator2 = (PathInterpolator) r2.getValue();
            if (pathInterpolator2 != null) {
                animatorSet.setInterpolator(pathInterpolator2);
            }
            animatorSet.addListener(new C56678I7i(this, 0));
            animatorSet.start();
            getButtonView().startAnimation(translateAnimation);
            C18674VwX.A00(this, (Boolean) null, AnonymousClass05K.A00, (String) null, getContext().getString(2131961390));
            setImportantForAccessibility(1);
            sendAccessibilityEvent(Constants.LOAD_RESULT_PGO);
            getButtonView().setEnabled(false);
        }
    }

    public final void setPayButtonState(boolean z) {
        getButtonView().setEnabled(z);
        this.A09 = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FBPayAnimationButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FBPayAnimationButton(Context context) {
        this(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
    }
}
