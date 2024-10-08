package com.instagram.common.ui.widget.imageview;

import X.0qQ;
import X.1MF;
import X.AnonymousClass0fD;
import X.AnonymousClass3MJ;
import X.C316256lM;
import X.C316266lN;
import X.C40025AOh;
import X.C59985Jcu;
import X.C71382cm;
import X.C74234PrN;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class RoundedCornerImageView extends IgImageView {
    public float A00;
    public int A01;
    public View.OnLayoutChangeListener A02;
    public AnonymousClass3MJ A03;
    public C74234PrN A04;
    public boolean A05;
    public int A06;
    public int A07;
    public int A08;
    public C316256lM A09;
    public boolean A0A;
    public boolean A0B;
    public final Paint A0C;
    public final RectF A0D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RoundedCornerImageView(Context context) {
        super(context);
        0qQ.A0B(context, 1);
        this.A0C = new Paint(1);
        this.A0D = new RectF();
        this.A0B = true;
        this.A03 = AnonymousClass3MJ.NONE;
        this.A00 = 0.0f;
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [com.instagram.common.ui.widget.imageview.IgImageView, com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    /* access modifiers changed from: private */
    public final void setDrawable(Bitmap bitmap) {
        Matrix matrix;
        this.A0A = false;
        float f = this.A00;
        if (this.A03 == AnonymousClass3MJ.CENTER_CROP) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int width2 = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int i = this.A01;
            boolean z = this.A05;
            boolean z2 = 1MF.A02;
            matrix = new Matrix();
            1MF.A0J(matrix, width, height, width2, height2, i, z);
        } else {
            matrix = null;
        }
        RoundedCornerImageView.super.setImageDrawable(new C59985Jcu(bitmap, matrix, f, this.A06));
    }

    public void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        RoundedCornerImageView.super.onDraw(canvas);
        if (this.A0A) {
            RectF rectF = this.A0D;
            float f = this.A00;
            canvas.drawRoundRect(rectF, f, f, this.A0C);
        }
        C316256lM r1 = this.A09;
        if (this.A0B && r1 != null) {
            r1.draw(canvas);
        }
    }

    public final void setBitmapShaderScaleType(AnonymousClass3MJ r2) {
        0qQ.A0B(r2, 0);
        this.A03 = r2;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    public void setPlaceHolderColor(int i) {
        this.A0A = true;
        this.A0C.setColor(i);
        invalidate();
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    private final void A00() {
        this.A09 = new C316256lM(this.A00, this.A08, this.A07, this.A06);
        setOutlineProvider(new C316266lN(this));
        setClipToOutline(true);
    }

    public void setImageResource(int i) {
        throw new UnsupportedOperationException();
    }

    public void setImageURI(Uri uri) {
        throw new UnsupportedOperationException();
    }

    public final void setRadius(float f) {
        this.A00 = f;
        if (this.A09 != null) {
            A00();
        }
    }

    public final void setStrokeColor(int i) {
        this.A07 = i;
        C316256lM r2 = this.A09;
        if (r2 != null) {
            Paint paint = r2.A01;
            if (paint.getColor() != i) {
                paint.setColor(i);
                r2.invalidateSelf();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    public final void setStrokeEnabled(boolean z) {
        if (this.A0B != z) {
            this.A0B = z;
            invalidate();
        }
    }

    public final void setStrokeWidth(int i) {
        this.A08 = i;
        C316256lM r3 = this.A09;
        if (r3 != null) {
            float f = (float) i;
            Paint paint = r3.A01;
            if (Float.compare(f, paint.getStrokeWidth()) != 0) {
                paint.setStrokeWidth(f);
                r3.invalidateSelf();
            }
        } else if (i > 0) {
            this.A09 = new C316256lM(this.A00, i, this.A07, this.A06);
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.common.ui.widget.imageview.IgImageView, com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    private final void A04(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C71382cm.A0q);
        0qQ.A07(obtainStyledAttributes);
        this.A00 = (float) obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.A06 = obtainStyledAttributes.getInt(2, 15);
        this.A08 = obtainStyledAttributes.getDimensionPixelOffset(4, 0);
        this.A07 = obtainStyledAttributes.getColor(3, 0);
        if (this.A08 > 0) {
            A00();
        }
        int color = obtainStyledAttributes.getColor(0, 0);
        if (color != 0) {
            setPlaceHolderColor(color);
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0fD.A06(897815248);
        RoundedCornerImageView.super.onSizeChanged(i, i2, i3, i4);
        RectF rectF = this.A0D;
        rectF.set((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()));
        C316256lM r4 = this.A09;
        if (r4 != null) {
            r4.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        }
        AnonymousClass0fD.A0D(-1417323995, A062);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A052 = AnonymousClass0fD.A05(1654531403);
        0qQ.A0B(motionEvent, 0);
        boolean z = false;
        if (RoundedCornerImageView.super.onTouchEvent(motionEvent)) {
            z = true;
        }
        AnonymousClass0fD.A0C(-251955689, A052);
        return z;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.common.ui.widget.imageview.IgImageView, com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    public void setImageBitmap(Bitmap bitmap) {
        A09();
        View.OnLayoutChangeListener onLayoutChangeListener = this.A02;
        if (onLayoutChangeListener != null) {
            removeOnLayoutChangeListener(onLayoutChangeListener);
            this.A02 = null;
        }
        if (this.A03 != AnonymousClass3MJ.NONE && getWidth() == 0 && getHeight() == 0) {
            if (bitmap != null) {
                C40025AOh aOh = new C40025AOh(bitmap, this);
                this.A02 = aOh;
                addOnLayoutChangeListener(aOh);
            }
        } else if (bitmap != null) {
            setDrawable(bitmap);
        }
    }

    public final void setBitmapMirrored(boolean z) {
        this.A05 = z;
    }

    public final void setBitmapShaderRotation(int i) {
        this.A01 = i;
    }

    public final void setOnTouchListener(C74234PrN prN) {
        this.A04 = prN;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RoundedCornerImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A0C = new Paint(1);
        this.A0D = new RectF();
        this.A0B = true;
        this.A03 = AnonymousClass3MJ.NONE;
        A04(attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RoundedCornerImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        this.A0C = new Paint(1);
        this.A0D = new RectF();
        this.A0B = true;
        this.A03 = AnonymousClass3MJ.NONE;
        A04(attributeSet);
    }
}
