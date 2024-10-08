package com.instagram.common.ui.widget.imageview;

import X.0qQ;
import X.1Tx;
import X.1U1;
import X.AnonymousClass0fD;
import X.AnonymousClass1U3;
import X.AnonymousClass2hJ;
import X.AnonymousClass2hL;
import X.AnonymousClass37O;
import X.C226582hK;
import X.C240563Lj;
import X.C71382cm;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import kotlin.jvm.internal.DefaultConstructorMarker;

public class CircularImageView extends IgImageView {
    public int A00;
    public boolean A01;
    public boolean A02;
    public int A03;
    public int A04;
    public C226582hK A05;
    public boolean A06;
    public boolean A07;
    public final Rect A08;
    public final AnonymousClass2hJ A09;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CircularImageView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        CircularImageView.super.onDraw(canvas);
        C226582hK r0 = this.A05;
        if (r0 != null) {
            r0.draw(canvas);
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    private final Rect getPaddingAffordanceRect() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (this.A07) {
            i = getPaddingLeft();
            i2 = getPaddingTop();
            i3 = getPaddingRight();
            i4 = getPaddingBottom();
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        return new Rect(i, i2, i3, i4);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void A0H(int i, int i2) {
        if (i != 0) {
            this.A04 = i;
            C226582hK r0 = this.A05;
            if (r0 == null) {
                C226582hK r02 = new C226582hK(i, i2);
                this.A05 = r02;
                this.A00 = r02.A00.getAlpha();
            } else {
                r0.A00.setStrokeWidth((float) i);
                C226582hK r03 = this.A05;
                if (r03 != null) {
                    r03.A00.setColor(i2);
                }
            }
        }
        invalidate();
    }

    public final int getStrokeWidth() {
        return this.A04;
    }

    public void setImageBitmap(Bitmap bitmap) {
        C240563Lj r0;
        if (bitmap != null) {
            r0 = new C240563Lj(bitmap, this.A01);
        } else {
            r0 = null;
        }
        CircularImageView.super.setImageDrawable(r0);
    }

    public void setImageDrawable(Drawable drawable) {
        boolean z = drawable instanceof ColorDrawable;
        GradientDrawable gradientDrawable = drawable;
        if (z) {
            int color = ((ColorDrawable) drawable).getColor();
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(color);
            gradientDrawable2.setShape(1);
            gradientDrawable = gradientDrawable2;
        }
        CircularImageView.super.setImageDrawable(gradientDrawable);
        A00(getPaddingAffordanceRect());
    }

    public void setImageResource(int i) {
        throw new UnsupportedOperationException("Use setImageDrawable or setImageBitmap");
    }

    public void setImageURI(Uri uri) {
        throw new UnsupportedOperationException("Use setImageDrawable or setImageBitmap");
    }

    public final void setStrokeAlpha(int i) {
        C226582hK r0 = this.A05;
        if (r0 != null) {
            r0.setAlpha(i);
        }
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    private final void A00(Rect rect) {
        Drawable drawable = getDrawable();
        if (this.A02 && drawable != null) {
            Rect bounds = drawable.getBounds();
            0qQ.A07(bounds);
            int i = this.A04;
            drawable.setBounds(rect.left + bounds.left + i, rect.top + bounds.top + i, (bounds.right - rect.right) - i, (bounds.bottom - rect.bottom) - i);
        }
    }

    public final 1U1 A07(1Tx r3) {
        AnonymousClass1U3 r1 = new AnonymousClass1U3(CircularImageView.super.A07(r3));
        r1.A0I = this.A09;
        return new 1U1(r1);
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        Rect rect;
        int A062 = AnonymousClass0fD.A06(229240072);
        CircularImageView.super.onSizeChanged(i, i2, i3, i4);
        if (this.A05 != null) {
            if (getBackground() != null) {
                Drawable background = getBackground();
                rect = this.A08;
                background.getPadding(rect);
            } else {
                rect = this.A08;
                rect.set(0, 0, 0, 0);
            }
            Rect paddingAffordanceRect = getPaddingAffordanceRect();
            A00(paddingAffordanceRect);
            Rect rect2 = new Rect(paddingAffordanceRect.left + rect.left, paddingAffordanceRect.top + rect.top, (getWidth() - paddingAffordanceRect.bottom) - rect.right, (getHeight() - paddingAffordanceRect.top) - rect.bottom);
            C226582hK r0 = this.A05;
            if (r0 != null) {
                r0.setBounds(rect2);
            }
        }
        AnonymousClass0fD.A0D(1332306114, A062);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView, android.view.View] */
    public void setPressed(boolean z) {
        CircularImageView.super.setPressed(z);
        if (this.A06 && z) {
            setColorFilter(AnonymousClass37O.A00(this.A03));
        }
    }

    public final void setCenterCrop(boolean z) {
        this.A01 = z;
    }

    public final void setDarkenOnPress(boolean z) {
        this.A06 = z;
    }

    public final void setFitImageInsideStroke(boolean z) {
        this.A02 = z;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CircularImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A08 = new Rect();
        this.A09 = new AnonymousClass2hJ(this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C71382cm.A0F);
            0qQ.A07(obtainStyledAttributes);
            int color = obtainStyledAttributes.getColor(2, 0);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(5, 0);
            this.A07 = obtainStyledAttributes.getBoolean(3, false);
            this.A02 = obtainStyledAttributes.getBoolean(4, false);
            this.A03 = obtainStyledAttributes.getColor(1, 1711276032);
            this.A01 = obtainStyledAttributes.getBoolean(0, false);
            this.A06 = false;
            obtainStyledAttributes.recycle();
            A0H(dimensionPixelSize, color);
        }
        setOutlineProvider(new AnonymousClass2hL());
        setClipToOutline(true);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CircularImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CircularImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
