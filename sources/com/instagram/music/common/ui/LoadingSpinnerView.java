package com.instagram.music.common.ui;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass0fD;
import X.C61360ml;
import X.C71382cm;
import X.JY5;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;

public final class LoadingSpinnerView extends ColorFilterAlphaImageView {
    public ObjectAnimator A00;
    public boolean A01 = true;
    public boolean A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoadingSpinnerView(Context context) {
        super(context);
        0qQ.A0B(context, 1);
        A00(context, (AttributeSet) null);
    }

    public final void onVisibilityChanged(View view, int i) {
        boolean z = false;
        0qQ.A0B(view, 0);
        super.onVisibilityChanged(view, i);
        if (getWindowToken() != null) {
            if (i != 0 || getVisibility() != 0 || !this.A01) {
                ObjectAnimator objectAnimator = this.A00;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                }
                0qQ.A0F("animator");
                throw AnonymousClass00P.createAndThrow();
            } else if (getAnimation() != null) {
                return;
            } else {
                if (getMeasuredWidth() != 0) {
                    ObjectAnimator objectAnimator2 = this.A00;
                    if (objectAnimator2 != null) {
                        objectAnimator2.start();
                        return;
                    }
                    0qQ.A0F("animator");
                    throw AnonymousClass00P.createAndThrow();
                }
                z = true;
            }
            this.A02 = z;
        }
    }

    public final void setLoadingStatus(JY5 jy5) {
        int i;
        0qQ.A0B(jy5, 0);
        int ordinal = jy5.ordinal();
        if (ordinal == 0) {
            this.A01 = true;
            ObjectAnimator objectAnimator = this.A00;
            if (objectAnimator == null) {
                0qQ.A0F("animator");
                throw AnonymousClass00P.createAndThrow();
            }
            objectAnimator.start();
            setBackgroundDrawableInternal(R.drawable.spinner_large);
            i = 0;
        } else if (ordinal == 1) {
            i = 8;
        } else {
            throw new RuntimeException();
        }
        setVisibility(i);
    }

    private final void A00(Context context, AttributeSet attributeSet) {
        setScaleType(ImageView.ScaleType.CENTER);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "rotation", new float[]{0.0f, 360.0f}).setDuration(850);
        this.A00 = duration;
        if (duration != null) {
            duration.setRepeatMode(1);
            ObjectAnimator objectAnimator = this.A00;
            if (objectAnimator != null) {
                objectAnimator.setRepeatCount(-1);
                ObjectAnimator objectAnimator2 = this.A00;
                if (objectAnimator2 != null) {
                    objectAnimator2.setInterpolator(new LinearInterpolator());
                    if (attributeSet != null) {
                        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C71382cm.A1g);
                        0qQ.A07(obtainStyledAttributes);
                        if (obtainStyledAttributes.getBoolean(0, false)) {
                            setLoadingStatus(JY5.LOADING);
                        }
                        obtainStyledAttributes.recycle();
                        return;
                    }
                    return;
                }
            }
        }
        0qQ.A0F("animator");
        throw AnonymousClass00P.createAndThrow();
    }

    private final void setBackgroundDrawableInternal(int i) {
        Context context = getContext();
        0qQ.A07(context);
        Drawable A002 = C61360ml.A00(context, i);
        A002.mutate().setColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
        setBackground(A002);
    }

    public final void onAttachedToWindow() {
        int A06 = AnonymousClass0fD.A06(340399246);
        super.onAttachedToWindow();
        if (isShown() && this.A01) {
            ObjectAnimator objectAnimator = this.A00;
            if (objectAnimator == null) {
                0qQ.A0F("animator");
                throw AnonymousClass00P.createAndThrow();
            }
            objectAnimator.start();
        }
        AnonymousClass0fD.A0D(-380273420, A06);
    }

    public final void onDetachedFromWindow() {
        int A06 = AnonymousClass0fD.A06(-1937689460);
        this.A02 = false;
        ObjectAnimator objectAnimator = this.A00;
        if (objectAnimator == null) {
            0qQ.A0F("animator");
            throw AnonymousClass00P.createAndThrow();
        }
        objectAnimator.cancel();
        super.onDetachedFromWindow();
        AnonymousClass0fD.A0D(1221064863, A06);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A02 && this.A01) {
            ObjectAnimator objectAnimator = this.A00;
            if (objectAnimator == null) {
                0qQ.A0F("animator");
                throw AnonymousClass00P.createAndThrow();
            }
            objectAnimator.start();
            this.A02 = false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoadingSpinnerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        A00(context, attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoadingSpinnerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        A00(context, attributeSet);
    }
}
