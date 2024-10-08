package com.instagram.reels.music.external.pulseanimation;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C60041Jdu;
import X.C71382cm;
import X.DbW;
import X.JTO;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.RelativeLayout;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import org.webrtc.CameraVideoCapturer;

public final class PulseAnimation extends RelativeLayout {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public AnimatorSet A06;
    public Paint A07;
    public ArrayList A08;
    public ArrayList A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PulseAnimation(Context context) {
        super(context);
        0qQ.A0B(context, 1);
        this.A02 = getContext().getColor(R.color.pulse_color);
        this.A05 = CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS;
        this.A03 = 4;
        this.A00 = getResources().getDimension(R.dimen.appreciation_reels_grid_item_width);
        this.A01 = 3.0f;
        A00();
    }

    public final void A01() {
        String str;
        this.A0B = true;
        if (!this.A0C) {
            ArrayList arrayList = this.A09;
            if (arrayList == null) {
                str = "circleViewList";
            } else {
                Iterator A1G = AnonymousClass7TE.A1G(arrayList);
                while (A1G.hasNext()) {
                    ((View) AnonymousClass7TF.A0a(A1G)).setVisibility(0);
                }
                this.A0C = true;
                AnimatorSet animatorSet = this.A06;
                if (animatorSet == null) {
                    str = "animatorSet";
                } else {
                    animatorSet.start();
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    private final void A00() {
        String str;
        if (!this.A0B) {
            this.A04 = this.A05 / this.A03;
            Paint A0C2 = JTO.A0C();
            this.A07 = A0C2;
            A0C2.setAntiAlias(true);
            Paint paint = this.A07;
            if (paint != null) {
                AnonymousClass7TE.A1Q(paint);
                Paint paint2 = this.A07;
                if (paint2 != null) {
                    paint2.setColor(this.A02);
                    AnimatorSet animatorSet = new AnimatorSet();
                    this.A06 = animatorSet;
                    animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    this.A08 = A1C;
                    this.A09 = AnonymousClass7TE.A1C();
                    int i = this.A03;
                    int i2 = 0;
                    while (true) {
                        str = "animatorList";
                        if (i2 < i) {
                            C60041Jdu jdu = new C60041Jdu(AnonymousClass7TE.A0S(this), this);
                            int i3 = (int) (2.0f * this.A00);
                            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i3, i3);
                            layoutParams.addRule(12, -1);
                            layoutParams.addRule(14, -1);
                            addView(jdu, layoutParams);
                            ArrayList arrayList = this.A09;
                            if (arrayList != null) {
                                arrayList.add(jdu);
                                double d = ((double) this.A04) / 2.5d;
                                float f = (float) (-d);
                                float random = (float) ((Math.random() * ((double) f)) + ((double) (((float) d) - f)));
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(jdu, "ScaleX", new float[]{1.0f, getRippleScale()});
                                0qQ.A0A(ofFloat);
                                long j = (long) this.A05;
                                ofFloat.setRepeatCount(IgNetworkConsentStorage.MAX_ENTRIES);
                                ofFloat.setRepeatMode(1);
                                ofFloat.setDuration(j);
                                ofFloat.setStartDelay((long) (((float) (this.A04 * i2)) + random));
                                ArrayList arrayList2 = this.A08;
                                if (arrayList2 == null) {
                                    break;
                                }
                                arrayList2.add(ofFloat);
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(jdu, "ScaleY", new float[]{1.0f, getRippleScale()});
                                0qQ.A0A(ofFloat2);
                                long j2 = (long) this.A05;
                                ofFloat2.setRepeatCount(IgNetworkConsentStorage.MAX_ENTRIES);
                                ofFloat2.setRepeatMode(1);
                                ofFloat2.setDuration(j2);
                                ofFloat2.setStartDelay((long) (((float) (this.A04 * i2)) + random));
                                ArrayList arrayList3 = this.A08;
                                if (arrayList3 == null) {
                                    break;
                                }
                                arrayList3.add(ofFloat2);
                                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(jdu, "Alpha", new float[]{1.0f, 0.0f});
                                0qQ.A0A(ofFloat3);
                                long j3 = (long) this.A05;
                                ofFloat3.setRepeatCount(IgNetworkConsentStorage.MAX_ENTRIES);
                                ofFloat3.setRepeatMode(1);
                                ofFloat3.setDuration(j3);
                                ofFloat3.setStartDelay((long) (((float) (this.A04 * i2)) + random));
                                A1C = this.A08;
                                if (A1C == null) {
                                    break;
                                }
                                A1C.add(ofFloat3);
                                i2++;
                            } else {
                                str = "circleViewList";
                                break;
                            }
                        } else {
                            AnimatorSet animatorSet2 = this.A06;
                            if (animatorSet2 == null) {
                                str = "animatorSet";
                            } else if (A1C != null) {
                                animatorSet2.playTogether(A1C);
                                return;
                            }
                        }
                    }
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
            }
            0qQ.A0F("paint");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void A02() {
        if (this.A0C) {
            AnimatorSet animatorSet = this.A06;
            if (animatorSet != null) {
                if (animatorSet.isStarted()) {
                    AnimatorSet animatorSet2 = this.A06;
                    if (animatorSet2 != null) {
                        animatorSet2.end();
                    }
                }
                this.A0C = false;
                return;
            }
            0qQ.A0F("animatorSet");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final boolean getRandomScaling() {
        return this.A0A;
    }

    public final int getRippleColor() {
        return this.A02;
    }

    public final int getRippleCount() {
        return this.A03;
    }

    public final int getRippleDelayMs() {
        return this.A04;
    }

    public final int getRippleDurationMs() {
        return this.A05;
    }

    public final float getRippleRadius() {
        return this.A00;
    }

    public final float getRippleScale() {
        boolean z = this.A0A;
        float f = this.A01;
        if (!z) {
            return f;
        }
        float f2 = f / 2.0f;
        return (float) ((Math.random() * ((double) f2)) + ((double) (f - f2)));
    }

    public final void setRandomScaling(boolean z) {
        this.A0A = z;
    }

    public final void setRippleColor(int i) {
        this.A02 = i;
    }

    public final void setRippleCount(int i) {
        this.A03 = i;
    }

    public final void setRippleDelayMs(int i) {
        this.A04 = i;
    }

    public final void setRippleDurationMs(int i) {
        this.A05 = i;
    }

    public final void setRippleRadius(float f) {
        this.A00 = f;
    }

    public final void setRippleScale(float f) {
        this.A01 = f;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PulseAnimation(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int A022 = DbW.A02(1, context, attributeSet);
        this.A02 = getContext().getColor(R.color.pulse_color);
        this.A05 = CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS;
        this.A03 = 4;
        Resources resources = getResources();
        this.A00 = resources.getDimension(R.dimen.appreciation_reels_grid_item_width);
        this.A01 = 3.0f;
        if (!isInEditMode()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C71382cm.A1q);
            0qQ.A07(obtainStyledAttributes);
            this.A02 = obtainStyledAttributes.getColor(0, context.getColor(R.color.pulse_color));
            this.A00 = obtainStyledAttributes.getDimension(A022, resources.getDimension(R.dimen.appreciation_reels_grid_item_width));
            this.A05 = obtainStyledAttributes.getInt(1, CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS);
            this.A03 = obtainStyledAttributes.getInt(4, 4);
            this.A01 = obtainStyledAttributes.getFloat(5, 3.0f);
            this.A0A = obtainStyledAttributes.getBoolean(3, false);
            obtainStyledAttributes.recycle();
        }
        A00();
    }
}
