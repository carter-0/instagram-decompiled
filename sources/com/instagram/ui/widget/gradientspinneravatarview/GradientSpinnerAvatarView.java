package com.instagram.ui.widget.gradientspinneravatarview;

import X.0nA;
import X.0qQ;
import X.0wb;
import X.2Yu;
import X.AnonymousClass000;
import X.AnonymousClass0fD;
import X.AnonymousClass0iw;
import X.AnonymousClass0od;
import X.AnonymousClass9IV;
import X.C241473Pi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.api.schemas.RingSpec;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class GradientSpinnerAvatarView extends IgFrameLayout {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public Drawable A06;
    public boolean A07;
    public boolean A08;
    public float A09;
    public float A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public Drawable A0I;
    public boolean A0J;
    public final CircularImageView A0K;
    public final CircularImageView A0L;
    public final CircularImageView A0M;
    public final CircularImageView A0N;
    public final GradientSpinner A0O;
    public final GradientSpinner A0P;
    public final Paint A0Q;
    public final RectF A0R;
    public final boolean A0S;

    public static /* synthetic */ void getDisplayMode$annotations() {
    }

    public final void A06() {
        this.A0J = true;
        this.A08 = false;
        Context context = getContext();
        0qQ.A07(context);
        this.A0K.A0H((int) 0nA.A04(context, 1), context.getColor(2Yu.A0H(context, R.attr.igds_color_photo_border)));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    public final void A0D(Drawable drawable) {
        this.A0K.setImageDrawable(drawable);
        A02((AnonymousClass9IV) null);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    public final void A0E(Drawable drawable, AnonymousClass0iw r4, ImageUrl imageUrl) {
        ? r0;
        if (!this.A08 || (r0 = this.A0L) == 0) {
            throw new IllegalStateException(AnonymousClass000.A00(463));
        }
        r0.setImageDrawable(drawable);
        if (imageUrl != null) {
            this.A0K.setUrl(imageUrl, r4);
        }
        A03((AnonymousClass9IV) null, this);
    }

    public final void A0F(AnonymousClass9IV r3, AnonymousClass0iw r4, ImageUrl imageUrl) {
        0qQ.A0B(r4, 1);
        if (imageUrl == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("avatar url is null, ");
            sb.append(r4);
            0wb.A03("GradientSpinnerAvatarView", sb.toString());
            return;
        }
        this.A0K.setUrl(imageUrl, r4);
        A02(r3);
    }

    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        0qQ.A0B(canvas, 0);
        super.dispatchDraw(canvas);
        Drawable drawable = this.A06;
        if (drawable != null) {
            A01(canvas2, drawable, this.A09, this.A00, this.A01, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        Drawable drawable2 = this.A0I;
        if (drawable2 != null) {
            Rect bounds = drawable2.getBounds();
            0qQ.A07(bounds);
            int i = bounds.right - bounds.left;
            int i2 = bounds.bottom - bounds.top;
            float f = this.A02;
            if (f == 0.0f) {
                f = 0.03f;
            }
            A01(canvas2, drawable2, f, this.A0A, 0.0f, i, i2);
        }
    }

    public final boolean verifyDrawable(Drawable drawable) {
        0qQ.A0B(drawable, 0);
        if (this.A06 == drawable || this.A0I == drawable || super.verifyDrawable(drawable)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GradientSpinnerAvatarView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v6, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r4v2, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r3v1, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    private final void A00() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.A04;
        int i6 = 0;
        boolean z = false;
        if (i5 == 2) {
            z = true;
        }
        int i7 = this.A0H;
        if (z) {
            i = this.A0C;
        } else {
            i = this.A0G;
        }
        if (z) {
            i2 = this.A0D;
        } else {
            i2 = 0;
        }
        if (i5 == 2) {
            i7 = this.A0E;
            i6 = this.A0F;
        }
        int i8 = 17;
        if (z) {
            i8 = 51;
        }
        GradientSpinner gradientSpinner = this.A0O;
        ViewGroup.LayoutParams layoutParams = gradientSpinner.getLayoutParams();
        0qQ.A0C(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        ? r3 = this.A0K;
        ViewGroup.LayoutParams layoutParams3 = r3.getLayoutParams();
        0qQ.A0C(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
        layoutParams2.height = i;
        layoutParams2.width = i;
        layoutParams4.gravity = i8;
        layoutParams2.gravity = i8;
        layoutParams4.height = i7;
        layoutParams4.width = i7;
        layoutParams4.leftMargin = i2;
        layoutParams4.topMargin = i6;
        if (z) {
            int i9 = (i - i7) / 2;
            layoutParams2.topMargin = i6 - i9;
            i3 = i2 - i9;
        } else {
            i3 = 0;
            layoutParams2.topMargin = 0;
        }
        layoutParams2.leftMargin = i3;
        if (this.A08) {
            if (z) {
                i4 = r3.A00;
            } else {
                i4 = 0;
            }
            r3.setStrokeAlpha(i4);
        }
        gradientSpinner.setLayoutParams(layoutParams2);
        r3.setLayoutParams(layoutParams4);
        this.A0M.setLayoutParams(layoutParams4);
        if (z) {
            int i10 = this.A0B;
            GradientSpinner gradientSpinner2 = this.A0P;
            if (gradientSpinner2 != null) {
                ? r4 = this.A0L;
                if (r4 != 0) {
                    ? r32 = this.A0N;
                    if (r32 != 0) {
                        ViewGroup.LayoutParams layoutParams5 = gradientSpinner2.getLayoutParams();
                        0qQ.A0C(layoutParams5, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams5;
                        ViewGroup.LayoutParams layoutParams6 = r4.getLayoutParams();
                        0qQ.A0C(layoutParams6, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) layoutParams6;
                        int i11 = i + i10;
                        marginLayoutParams.height = i11;
                        marginLayoutParams.width = i11;
                        gradientSpinner2.setPadding(i10, i10, 0, 0);
                        layoutParams7.height = i7;
                        layoutParams7.width = i7;
                        layoutParams7.gravity = 85;
                        layoutParams7.rightMargin = i2;
                        layoutParams7.bottomMargin = i6;
                        int i12 = (i - i7) / 2;
                        marginLayoutParams.topMargin = i6 - i12;
                        marginLayoutParams.leftMargin = i2 - i12;
                        r4.setStrokeAlpha(r4.A00);
                        gradientSpinner2.setLayoutParams(marginLayoutParams);
                        r4.setLayoutParams(layoutParams7);
                        r32.setLayoutParams(layoutParams7);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v8, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    private final void A02(AnonymousClass9IV r4) {
        if (this.A08) {
            ? r0 = this.A0L;
            if (r0 != 0) {
                r0.setVisibility(8);
                GradientSpinner gradientSpinner = this.A0P;
                if (gradientSpinner != null) {
                    gradientSpinner.setVisibility(8);
                    ? r02 = this.A0N;
                    if (r02 != 0) {
                        r02.setVisibility(8);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        if (1 != this.A04) {
            this.A04 = 1;
            A00();
        }
        if (r4 != null) {
            this.A0O.setProgressState((C241473Pi) r4.A00);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public static final void A03(AnonymousClass9IV r4, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        ? r1 = gradientSpinnerAvatarView.A0L;
        if (r1 != 0) {
            r1.setVisibility(0);
            GradientSpinner gradientSpinner = gradientSpinnerAvatarView.A0P;
            if (gradientSpinner != null) {
                gradientSpinner.setVisibility(0);
                if (2 != gradientSpinnerAvatarView.A04) {
                    gradientSpinnerAvatarView.A04 = 2;
                    gradientSpinnerAvatarView.A00();
                }
                if (r4 != null) {
                    gradientSpinnerAvatarView.A0O.setProgressState((C241473Pi) r4.A00);
                    C241473Pi r0 = (C241473Pi) r4.A01;
                    if (r0 != null) {
                        gradientSpinner.setProgressState(r0);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A04() {
        this.A0K.A09();
        if (this.A08) {
            CircularImageView circularImageView = this.A0L;
            if (circularImageView != null) {
                circularImageView.A09();
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void A05() {
        this.A0O.setVisibility(8);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v2, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void A07() {
        this.A0K.setVisibility(0);
        if (this.A04 == 2) {
            ? r0 = this.A0L;
            if (r0 != 0) {
                r0.setVisibility(0);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void A08() {
        this.A0O.A05();
        if (this.A04 == 2) {
            GradientSpinner gradientSpinner = this.A0P;
            if (gradientSpinner != null) {
                gradientSpinner.A05();
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void A09() {
        this.A0O.A06();
        if (this.A04 == 2) {
            GradientSpinner gradientSpinner = this.A0P;
            if (gradientSpinner != null) {
                gradientSpinner.A06();
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void A0A() {
        this.A0O.A08();
        if (this.A04 == 2) {
            GradientSpinner gradientSpinner = this.A0P;
            if (gradientSpinner != null) {
                gradientSpinner.A08();
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void A0B(int i, int i2) {
        this.A0H = i;
        Context context = getContext();
        0qQ.A07(context);
        this.A0G = AnonymousClass0od.A05(context, i, i2);
        A00();
    }

    public final void A0G(AnonymousClass9IV r3, AnonymousClass0iw r4, ImageUrl imageUrl, ImageUrl imageUrl2) {
        CircularImageView circularImageView;
        if (!this.A08 || (circularImageView = this.A0L) == null) {
            throw new IllegalStateException(AnonymousClass000.A00(463));
        }
        if (!(imageUrl == null || r4 == null)) {
            circularImageView.setUrl(imageUrl, r4);
        }
        if (imageUrl2 == null) {
            this.A0K.A0B();
        } else if (r4 != null) {
            this.A0K.setUrl(imageUrl2, r4);
        }
        A03(r3, this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: com.instagram.common.ui.widget.imageview.CircularImageView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.RectF getAvatarBounds() {
        /*
            r2 = this;
            int r1 = r2.A04
            r0 = 2
            if (r1 != r0) goto L_0x000b
            r0 = r2
        L_0x0006:
            android.graphics.RectF r0 = X.0nA.A0F(r0)
            return r0
        L_0x000b:
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r2.A0K
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView.getAvatarBounds():android.graphics.RectF");
    }

    public final CircularImageView getBackAvatarView() {
        return this.A0K;
    }

    public final GradientSpinner getBackGradientSpinner() {
        return this.A0O;
    }

    public final Drawable getBottomBadgeDrawable() {
        return this.A06;
    }

    public final AnonymousClass9IV getCurrentSpinnerProgressState() {
        C241473Pi r2;
        C241473Pi progressState = this.A0O.getProgressState();
        GradientSpinner gradientSpinner = this.A0P;
        if (gradientSpinner != null) {
            r2 = gradientSpinner.getProgressState();
        } else {
            r2 = null;
        }
        return new AnonymousClass9IV(37, (Object) r2, (Object) progressState);
    }

    public final CircularImageView getFrontAvatarView() {
        return this.A0L;
    }

    public final GradientSpinner getFrontGradientSpinner() {
        return this.A0P;
    }

    public final boolean getGradientSpinnerActivated() {
        if (this.A0O.A06 == 0) {
            return true;
        }
        return false;
    }

    public final Drawable getPresenceBadgeDrawable() {
        return this.A0I;
    }

    public final int getSpinnerMargin() {
        int i;
        int i2;
        if (this.A04 == 2) {
            i = this.A0E;
            i2 = this.A0C;
        } else {
            i = this.A0H;
            i2 = this.A0G;
        }
        return (i2 - i) / 2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    /* JADX WARNING: type inference failed for: r0v2, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    public final void setAvatarViewDrawable(Drawable drawable) {
        this.A0K.setImageDrawable(drawable);
        if (this.A04 == 2) {
            ? r0 = this.A0L;
            if (r0 != 0) {
                r0.setImageDrawable(drawable);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void setBackAvatarTranslationZ(float f) {
        this.A0K.setTranslationZ(f);
    }

    public final void setBackgroundRingColor(int i) {
        this.A03 = i;
        if (this.A08) {
            CircularImageView circularImageView = this.A0L;
            if (circularImageView != null) {
                int i2 = this.A05;
                circularImageView.A0H(i2, i);
                this.A0K.A0H(i2, this.A03);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void setBottomBadgeDrawable(Drawable drawable) {
        Drawable drawable2 = this.A06;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            this.A06 = drawable;
            if (drawable != null) {
                drawable.setCallback(this);
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            }
            invalidate();
        }
    }

    public final void setDoubleAvatarGradientPadding(int i) {
        this.A0B = i;
        A00();
    }

    public final void setGradientColor(RingSpec ringSpec) {
        if (ringSpec != null) {
            this.A0O.setGradientColors(ringSpec);
            if (this.A08) {
                GradientSpinner gradientSpinner = this.A0P;
                if (gradientSpinner != null) {
                    gradientSpinner.setGradientColors(ringSpec);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
        }
    }

    public final void setGradientColorRes(int i) {
        this.A0O.setGradientColors(i);
        if (this.A08) {
            GradientSpinner gradientSpinner = this.A0P;
            if (gradientSpinner != null) {
                gradientSpinner.setGradientColors(i);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void setGradientSpinnerActivated(boolean z) {
        GradientSpinner gradientSpinner = this.A0O;
        if (z) {
            gradientSpinner.A02();
            if (this.A04 == 2) {
                GradientSpinner gradientSpinner2 = this.A0P;
                if (gradientSpinner2 != null) {
                    gradientSpinner2.A02();
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            return;
        }
        gradientSpinner.A04();
        if (this.A04 == 2) {
            GradientSpinner gradientSpinner3 = this.A0P;
            if (gradientSpinner3 != null) {
                gradientSpinner3.A04();
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void setGradientSpinnerActiveStrokeWidth(float f) {
        this.A0O.setActiveStrokeWidth(f);
        if (this.A08) {
            GradientSpinner gradientSpinner = this.A0P;
            if (gradientSpinner != null) {
                gradientSpinner.setActiveStrokeWidth(f);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void setGradientSpinnerInactiveStrokeWidth(float f) {
        this.A0O.setInactiveStrokeWidth(f);
        if (this.A08) {
            GradientSpinner gradientSpinner = this.A0P;
            if (gradientSpinner != null) {
                gradientSpinner.setInactiveStrokeWidth(f);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void setGradientSpinnerVisible(boolean z) {
        int i;
        GradientSpinner gradientSpinner;
        GradientSpinner gradientSpinner2 = this.A0O;
        if (z) {
            i = 0;
            gradientSpinner2.setVisibility(0);
            if (this.A04 == 2) {
                gradientSpinner = this.A0P;
                if (gradientSpinner == null) {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                return;
            }
        } else {
            i = 4;
            gradientSpinner2.setVisibility(4);
            if (this.A04 == 2) {
                gradientSpinner = this.A0P;
                if (gradientSpinner == null) {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                return;
            }
        }
        gradientSpinner.setVisibility(i);
    }

    public final void setPresenceBadgeDrawable(Drawable drawable) {
        Drawable drawable2 = this.A0I;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            this.A0I = drawable;
            if (drawable != null) {
                drawable.setCallback(this);
                drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            }
            invalidate();
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    public final void setScaleType(ImageView.ScaleType scaleType) {
        this.A0K.setScaleType(scaleType);
    }

    public final void setSpinnerRotation(float f) {
        this.A0O.setRotation(f);
        if (this.A08) {
            GradientSpinner gradientSpinner = this.A0P;
            if (gradientSpinner != null) {
                gradientSpinner.setRotation(f);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    private final void A01(Canvas canvas, Drawable drawable, float f, float f2, float f3, int i, int i2) {
        float f4;
        canvas.save();
        int width = getWidth();
        int height = getHeight();
        if (!this.A07) {
            f3 += ((float) (height - i2)) - (((float) height) * f);
            if (this.A0S) {
                f4 = (((float) width) * f) - f2;
            } else {
                f4 = (((float) (width - i)) - (((float) width) * f)) + f2;
            }
            f2 = f4;
        }
        canvas.translate(f2, f3);
        drawable.draw(canvas);
        canvas.restore();
    }

    public final void A0C(Context context, int i, int i2) {
        this.A01 = (float) context.getResources().getDimensionPixelSize(i);
        this.A00 = (float) context.getResources().getDimensionPixelSize(i2);
        this.A07 = true;
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(556483911);
        super.onAttachedToWindow();
        Drawable drawable = this.A06;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        Drawable drawable2 = this.A0I;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
        AnonymousClass0fD.A0D(1189109594, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(1107170153);
        super.onDetachedFromWindow();
        Drawable drawable = this.A06;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
        Drawable drawable2 = this.A0I;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        AnonymousClass0fD.A0D(1083735507, A062);
    }

    public final void setBottomBadgeAdditionalHorizontalOffset(float f) {
        this.A00 = f;
    }

    public final void setBottomBadgeAdditionalVerticalOffset(float f) {
        this.A01 = f;
    }

    public final void setBottomBadgeDrawableMarginPercent(float f) {
        this.A09 = f;
    }

    public final void setPresenceBadgeAdditionalHorizontalOffset(float f) {
        this.A0A = f;
    }

    public final void setPresenceBadgeDrawableMarginPercent(float f) {
        this.A02 = f;
    }

    public final void setShouldUseAbsoluteOffset(boolean z) {
        this.A07 = z;
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: com.instagram.common.ui.widget.imageview.CircularImageView} */
    /* JADX WARNING: type inference failed for: r6v2, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v1, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r8v3 */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00b9, code lost:
        if (r13.A0D == -1) goto L_0x00bb;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GradientSpinnerAvatarView(android.content.Context r14, android.util.AttributeSet r15, int r16) {
        /*
            r13 = this;
            r2 = 1
            X.0qQ.A0B(r14, r2)
            r0 = r16
            r13.<init>(r14, r15, r0)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r13.A0Q = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r13.A0R = r0
            r0 = 1022739087(0x3cf5c28f, float:0.03)
            r13.A09 = r0
            boolean r0 = X.0mk.A02(r14)
            r13.A0S = r0
            r13.A0J = r2
            r13.A04 = r2
            android.content.Context r4 = r13.getContext()
            r0 = 2130970237(0x7f04067d, float:1.7549178E38)
            int r0 = X.2Yu.A0H(r14, r0)
            int r1 = r4.getColor(r0)
            int[] r0 = X.C71382cm.A0w
            android.content.res.TypedArray r3 = r14.obtainStyledAttributes(r15, r0)
            X.0qQ.A07(r3)
            r0 = 9
            r5 = -1
            int r0 = r3.getDimensionPixelSize(r0, r5)     // Catch:{ all -> 0x01b4 }
            r13.A0G = r0     // Catch:{ all -> 0x01b4 }
            r0 = 4
            int r0 = r3.getDimensionPixelSize(r0, r5)     // Catch:{ all -> 0x01b4 }
            r13.A0C = r0     // Catch:{ all -> 0x01b4 }
            r0 = 10
            int r0 = r3.getDimensionPixelSize(r0, r5)     // Catch:{ all -> 0x01b4 }
            r13.A0H = r0     // Catch:{ all -> 0x01b4 }
            r0 = 6
            int r0 = r3.getDimensionPixelSize(r0, r5)     // Catch:{ all -> 0x01b4 }
            r13.A0E = r0     // Catch:{ all -> 0x01b4 }
            r0 = 5
            int r0 = r3.getDimensionPixelSize(r0, r5)     // Catch:{ all -> 0x01b4 }
            r13.A0D = r0     // Catch:{ all -> 0x01b4 }
            r7 = 7
            r6 = 2
            float r0 = X.0nA.A04(r4, r6)     // Catch:{ all -> 0x01b4 }
            int r0 = (int) r0     // Catch:{ all -> 0x01b4 }
            int r0 = r3.getDimensionPixelSize(r7, r0)     // Catch:{ all -> 0x01b4 }
            r13.A0F = r0     // Catch:{ all -> 0x01b4 }
            r0 = 3
            int r0 = r3.getDimensionPixelSize(r0, r5)     // Catch:{ all -> 0x01b4 }
            r13.A0B = r0     // Catch:{ all -> 0x01b4 }
            r10 = 8
            boolean r7 = r3.hasValue(r10)     // Catch:{ all -> 0x01b4 }
            if (r7 == 0) goto L_0x0086
            boolean r0 = r3.getBoolean(r10, r2)     // Catch:{ all -> 0x01b4 }
            r13.A0J = r0     // Catch:{ all -> 0x01b4 }
        L_0x0086:
            float r0 = X.0nA.A04(r4, r6)     // Catch:{ all -> 0x01b4 }
            int r0 = (int) r0     // Catch:{ all -> 0x01b4 }
            int r0 = r3.getDimensionPixelSize(r6, r0)     // Catch:{ all -> 0x01b4 }
            r13.A05 = r0     // Catch:{ all -> 0x01b4 }
            r12 = 0
            r0 = 2130970269(0x7f04069d, float:1.7549243E38)
            int r0 = X.2Yu.A0H(r14, r0)     // Catch:{ all -> 0x01b4 }
            int r0 = r14.getColor(r0)     // Catch:{ all -> 0x01b4 }
            int r0 = r3.getColor(r12, r0)     // Catch:{ all -> 0x01b4 }
            r13.A03 = r0     // Catch:{ all -> 0x01b4 }
            boolean r6 = r3.getBoolean(r2, r12)     // Catch:{ all -> 0x01b4 }
            r3.recycle()
            int r0 = r13.A0E
            if (r0 == r5) goto L_0x00bb
            int r0 = r13.A0C
            if (r0 == r5) goto L_0x00bb
            int r0 = r13.A0B
            if (r0 == r5) goto L_0x00bb
            int r0 = r13.A0D
            r3 = 1
            if (r0 != r5) goto L_0x00bc
        L_0x00bb:
            r3 = 0
        L_0x00bc:
            r13.A08 = r3
            if (r7 != 0) goto L_0x00c4
            if (r3 == 0) goto L_0x00c4
            r13.A0J = r12
        L_0x00c4:
            boolean r0 = r13.A0J
            if (r0 == 0) goto L_0x00d2
            if (r3 == 0) goto L_0x00d2
            java.lang.String r1 = "showSingleAvatarBorder is only applicable to GradientSpinnerAvatarViews that support single avatar mode"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00d2:
            r9 = 0
            r7 = 2130970024(0x7f0405a8, float:1.7548746E38)
            com.instagram.ui.widget.gradientspinner.GradientSpinner r3 = new com.instagram.ui.widget.gradientspinner.GradientSpinner
            r3.<init>(r14, r15, r7)
            r13.A0O = r3
            com.instagram.common.ui.widget.imageview.CircularImageView r11 = new com.instagram.common.ui.widget.imageview.CircularImageView
            r11.<init>(r14, r15, r12)
            r11.A01 = r6
            r13.A0K = r11
            com.instagram.common.ui.widget.imageview.CircularImageView r6 = new com.instagram.common.ui.widget.imageview.CircularImageView
            r6.<init>(r14, r15, r12)
            r13.A0M = r6
            boolean r0 = r13.A08
            if (r0 == 0) goto L_0x00f6
            com.instagram.ui.widget.gradientspinner.GradientSpinner r9 = new com.instagram.ui.widget.gradientspinner.GradientSpinner
            r9.<init>(r14, r15, r7)
        L_0x00f6:
            r13.A0P = r9
            boolean r0 = r13.A08
            if (r0 == 0) goto L_0x0199
            com.instagram.common.ui.widget.imageview.CircularImageView r8 = new com.instagram.common.ui.widget.imageview.CircularImageView
            r8.<init>(r14, r15, r12)
        L_0x0101:
            r13.A0N = r8
            boolean r0 = r13.A08
            if (r0 == 0) goto L_0x0196
            com.instagram.common.ui.widget.imageview.CircularImageView r7 = new com.instagram.common.ui.widget.imageview.CircularImageView
            r7.<init>(r14, r15, r12)
        L_0x010c:
            r13.A0L = r7
            r13.addView(r3)
            boolean r0 = r13.A08
            if (r0 == 0) goto L_0x0118
            r13.addView(r9)
        L_0x0118:
            r13.addView(r11)
            r11.setPlaceHolderColor(r1)
            r13.addView(r6)
            r6.setVisibility(r10)
            boolean r0 = r13.A08
            if (r0 == 0) goto L_0x017c
            java.lang.String r6 = "Required value was null."
            if (r7 == 0) goto L_0x01ae
            r13.addView(r7)
            r7.setPlaceHolderColor(r1)
            if (r8 == 0) goto L_0x01a8
            r13.addView(r8)
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = r13.A0L
            if (r1 == 0) goto L_0x01a2
            int r2 = r13.A05
            int r0 = r13.A03
            r1.A0H(r2, r0)
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = r13.A0K
            int r0 = r13.A03
            r1.A0H(r2, r0)
            if (r9 == 0) goto L_0x019c
            r9.setVisibility(r10)
            r7.setVisibility(r10)
            r8.setVisibility(r10)
        L_0x0154:
            int r1 = r13.A0H
            if (r1 == r5) goto L_0x0178
            int r0 = r13.A0G
            if (r0 == r5) goto L_0x0162
            int r0 = X.AnonymousClass0od.A05(r4, r1, r0)
            r13.A0G = r0
        L_0x0162:
            int r1 = r13.A0H
            float r0 = r3.A00
            float r0 = X.AnonymousClass0od.A00(r4, r0, r1)
            r3.setActiveStrokeWidth(r0)
            int r1 = r13.A0H
            float r0 = r3.A02
            float r0 = X.AnonymousClass0od.A01(r4, r0, r1)
            r3.setInactiveStrokeWidth(r0)
        L_0x0178:
            r13.A00()
            return
        L_0x017c:
            boolean r0 = r13.A0J
            if (r0 == 0) goto L_0x0154
            float r0 = X.0nA.A04(r4, r2)
            int r2 = (int) r0
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = r13.A0K
            r0 = 2130970259(0x7f040693, float:1.7549223E38)
            int r0 = X.2Yu.A0H(r4, r0)
            int r0 = r4.getColor(r0)
            r1.A0H(r2, r0)
            goto L_0x0154
        L_0x0196:
            r7 = 0
            goto L_0x010c
        L_0x0199:
            r8 = 0
            goto L_0x0101
        L_0x019c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r6)
            throw r0
        L_0x01a2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r6)
            throw r0
        L_0x01a8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r6)
            throw r0
        L_0x01ae:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r6)
            throw r0
        L_0x01b4:
            r0 = move-exception
            r3.recycle()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GradientSpinnerAvatarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GradientSpinnerAvatarView(Context context) {
        this(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
    }
}
