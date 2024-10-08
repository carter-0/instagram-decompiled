package com.facebook.smartcapture.ui.view;

import X.0qQ;
import X.AnonymousClass000;
import X.AnonymousClass00P;
import X.AnonymousClass7TE;
import X.C10563RuH;
import X.C11408SSf;
import X.DbU;
import X.JTO;
import X.RFH;
import X.SKW;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.instagram.android.R;
import java.util.Arrays;

public final class ArrowHintView extends FrameLayout {
    public static final Interpolator A07 = new AccelerateDecelerateInterpolator();
    public Paint A00;
    public ImageView A01;
    public ImageView A02;
    public C10563RuH A03;
    public final Paint A04;
    public final Paint A05 = AnonymousClass7TE.A0V(1);
    public final Paint A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArrowHintView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        Paint A0V = AnonymousClass7TE.A0V(1);
        this.A04 = A0V;
        this.A00 = A0V;
        this.A06 = AnonymousClass7TE.A0V(1);
        A00(context);
    }

    private final void A00(Context context) {
        setWillNotDraw(false);
        setClipToPadding(false);
        LayoutInflater.from(context).inflate(R.layout.arrow_hint_view, this, true);
        this.A01 = SKW.A01(this, R.id.iv_arrow);
        ImageView A012 = SKW.A01(this, R.id.iv_face_check);
        this.A02 = A012;
        String str = "checkView";
        if (A012 != null) {
            A012.setVisibility(8);
            ImageView imageView = this.A01;
            if (imageView == null) {
                str = "arrow";
            } else {
                imageView.setColorFilter(C11408SSf.A01(context, R.attr.selfie_arrow_hint_pending));
                ImageView imageView2 = this.A02;
                if (imageView2 != null) {
                    imageView2.setColorFilter(C11408SSf.A01(context, R.attr.selfie_arrow_hint_success));
                    Paint paint = this.A06;
                    paint.setStyle(Paint.Style.FILL);
                    this.A04.setColor(C11408SSf.A01(context, R.attr.selfie_arrow_hint_fill_pending));
                    this.A05.setColor(C11408SSf.A01(context, R.attr.selfie_arrow_hint_fill_success));
                    paint.setStrokeWidth(C11408SSf.A00(context, R.attr.selfie_arrow_hint_border));
                    JTO.A1N(paint);
                    paint.setColor(C11408SSf.A01(context, R.attr.selfie_arrow_hint_border_color));
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        float width = ((float) getWidth()) / 2.0f;
        float A032 = AnonymousClass7TE.A03(this) / 2.0f;
        float min = ((float) Math.min(getWidth(), getHeight())) / 2.0f;
        Paint paint = this.A06;
        canvas.drawCircle(width, A032, min - (paint.getStrokeWidth() / 2.0f), this.A00);
        canvas.drawCircle(width, A032, min - (paint.getStrokeWidth() / 2.0f), paint);
    }

    private final void setArrowGravity(int i) {
        ImageView imageView = this.A01;
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            0qQ.A0C(layoutParams, AnonymousClass000.A00(1));
            ((FrameLayout.LayoutParams) layoutParams).gravity = i;
            ImageView imageView2 = this.A01;
            if (imageView2 != null) {
                imageView2.requestLayout();
                return;
            }
        }
        0qQ.A0F("arrow");
        throw AnonymousClass00P.createAndThrow();
    }

    private final void setArrowMode(RFH rfh) {
        int i;
        ImageView imageView = this.A01;
        if (rfh == null) {
            if (imageView != null) {
                imageView.setVisibility(8);
                return;
            }
        } else if (imageView != null) {
            imageView.setVisibility(0);
            int ordinal = rfh.ordinal();
            if (ordinal == 0) {
                ImageView imageView2 = this.A01;
                if (imageView2 != null) {
                    imageView2.setRotation(0.0f);
                    i = 19;
                }
            } else if (ordinal == 1) {
                ImageView imageView3 = this.A01;
                if (imageView3 != null) {
                    imageView3.setRotation(90.0f);
                    i = 49;
                }
            } else if (ordinal == 2) {
                ImageView imageView4 = this.A01;
                if (imageView4 != null) {
                    imageView4.setRotation(180.0f);
                    i = 21;
                }
            } else if (ordinal == 3) {
                ImageView imageView5 = this.A01;
                if (imageView5 != null) {
                    imageView5.setRotation(270.0f);
                    i = 81;
                }
            } else {
                throw AnonymousClass7TE.A1K();
            }
            setArrowGravity(i);
            return;
        }
        0qQ.A0F("arrow");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void setCaptureState(RFH rfh) {
        String str;
        Property property;
        float[] fArr;
        Property property2;
        if (rfh != null) {
            setArrowMode(rfh);
            C10563RuH ruH = this.A03;
            if (ruH != null) {
                ruH.A00 = true;
                ruH.A01.cancel();
                ImageView imageView = this.A01;
                if (imageView == null) {
                    str = "arrow";
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
                imageView.setRotationX(0.0f);
                imageView.setRotationY(0.0f);
                imageView.setTranslationX(0.0f);
                imageView.setTranslationY(0.0f);
            }
            this.A03 = null;
            ImageView imageView2 = this.A01;
            str = "arrow";
            if (imageView2 != null) {
                float dimension = DbU.A05(imageView2).getDimension(R.dimen.abc_button_inset_vertical_material);
                C10563RuH ruH2 = new C10563RuH();
                AnimatorSet animatorSet = ruH2.A01;
                animatorSet.setStartDelay(300);
                animatorSet.setDuration(1200);
                animatorSet.setInterpolator(A07);
                ImageView imageView3 = this.A01;
                if (imageView3 != null) {
                    int ordinal = rfh.ordinal();
                    if (ordinal == 0) {
                        property2 = View.TRANSLATION_X;
                        fArr = new float[3];
                        fArr[0] = 0.0f;
                        dimension = -dimension;
                    } else if (ordinal != 1) {
                        if (ordinal == 2) {
                            property = View.TRANSLATION_X;
                        } else if (ordinal == 3) {
                            property = View.TRANSLATION_Y;
                        } else {
                            throw AnonymousClass7TE.A1K();
                        }
                        fArr = new float[3];
                        fArr[0] = 0.0f;
                    } else {
                        property2 = View.TRANSLATION_Y;
                        fArr = new float[3];
                        fArr[0] = 0.0f;
                        dimension = -dimension;
                    }
                    fArr[1] = dimension;
                    fArr[2] = 0.0f;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView3, property, fArr);
                    0qQ.A0A(ofFloat);
                    animatorSet.playTogether((Animator[]) Arrays.copyOf(new Animator[]{ofFloat}, 1));
                    this.A03 = ruH2;
                    animatorSet.start();
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArrowHintView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        Paint A0V = AnonymousClass7TE.A0V(1);
        this.A04 = A0V;
        this.A00 = A0V;
        this.A06 = AnonymousClass7TE.A0V(1);
        A00(context);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArrowHintView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        0qQ.A0B(context, 1);
        Paint A0V = AnonymousClass7TE.A0V(1);
        this.A04 = A0V;
        this.A00 = A0V;
        this.A06 = AnonymousClass7TE.A0V(1);
        A00(context);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArrowHintView(Context context) {
        super(context);
        0qQ.A0B(context, 1);
        Paint A0V = AnonymousClass7TE.A0V(1);
        this.A04 = A0V;
        this.A00 = A0V;
        this.A06 = AnonymousClass7TE.A0V(1);
        A00(context);
    }
}
