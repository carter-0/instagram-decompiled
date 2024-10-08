package com.instagram.creation.photo.crop;

import X.0qQ;
import X.AnonymousClass1GB;
import X.AnonymousClass7TE;
import X.AnonymousClass81H;
import X.C301485zM;
import X.C59741JVz;
import X.C66511MUp;
import X.JTT;
import X.JWQ;
import X.JWR;
import X.MQU;
import X.U02;
import X.X96;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CropImageView extends C59741JVz {
    public RectF A00;
    public U02 A01;
    public MQU A02;
    public C66511MUp A03;
    public AnonymousClass81H A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Rect A08;
    public final RectF A09;
    public final JWQ A0A;
    public final Point A0B;
    public final X96 A0C;

    /* JADX WARNING: type inference failed for: r8v0, types: [com.instagram.common.ui.widget.imageview.IgImageView, X.JVz, com.instagram.creation.photo.crop.CropImageView, android.widget.ImageView, android.view.View] */
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        0qQ.A0B(canvas, 0);
        CropImageView.super.onDraw(canvas);
        C66511MUp mUp = this.A03;
        if (mUp != null) {
            Matrix imageMatrix = getImageMatrix();
            0qQ.A07(imageMatrix);
            int i5 = (((double) (C59741JVz.A00(imageMatrix, this) / C59741JVz.A00(this.A07, this))) > 1.0d ? 1 : (((double) (C59741JVz.A00(imageMatrix, this) / C59741JVz.A00(this.A07, this))) == 1.0d ? 0 : -1));
            boolean z = false;
            if (i5 >= 0) {
                z = true;
            }
            mUp.DAm(z);
        }
        AnonymousClass81H r4 = this.A04;
        if (r4 != null) {
            RectF rectF = this.A00;
            if (rectF != null) {
                this.A09.set(rectF);
            }
            Matrix imageMatrix2 = getImageMatrix();
            RectF rectF2 = this.A09;
            imageMatrix2.mapRect(rectF2);
            Rect rect = this.A08;
            try {
                i = AnonymousClass1GB.A01(rectF2.left);
            } catch (IllegalArgumentException unused) {
                i = 0;
            }
            rect.left = Math.max(i, 0);
            try {
                i2 = AnonymousClass1GB.A01(rectF2.top);
            } catch (IllegalArgumentException unused2) {
                i2 = 0;
            }
            rect.top = Math.max(i2, 0);
            try {
                i3 = AnonymousClass1GB.A01(rectF2.right);
            } catch (IllegalArgumentException unused3) {
                i3 = 0;
            }
            rect.right = Math.min(i3, getWidth());
            try {
                i4 = AnonymousClass1GB.A01(rectF2.bottom);
            } catch (IllegalArgumentException unused4) {
                i4 = 0;
            }
            rect.bottom = Math.min(i4, getHeight());
            if (this.A06) {
                int i6 = rect.left;
                if (i6 > 0) {
                    rect.right = (int) (((float) i6) + Math.min(rectF2.width(), AnonymousClass7TE.A02(this)));
                } else if (rect.right < getWidth()) {
                    rect.left = (int) (((float) rect.right) - Math.min(rectF2.width(), AnonymousClass7TE.A02(this)));
                }
                int i7 = rect.top;
                if (i7 > 0) {
                    rect.bottom = (int) (((float) i7) + Math.min(rectF2.height(), AnonymousClass7TE.A03(this)));
                } else if (rect.bottom < getHeight()) {
                    rect.top = (int) (((float) rect.bottom) - Math.min(rectF2.height(), AnonymousClass7TE.A03(this)));
                }
            }
            C301485zM r2 = r4.A01;
            if (r2 != null) {
                if (!(r2.A01 == 3 && r2.A00 == 3)) {
                    r2.A01 = 3;
                    r2.A00 = 3;
                    r2.A02 = new float[2];
                    r2.A03 = new float[2];
                }
                r2.A03(rect);
            }
            r4.A00(canvas);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.creation.photo.crop.CropImageView, android.view.View] */
    public final void setHighlightView(AnonymousClass81H r2) {
        0qQ.A0B(r2, 0);
        this.A04 = r2;
        invalidate();
    }

    public final void A0L(boolean z) {
        if (z != this.A07) {
            this.A07 = z;
            super.A0L(z);
            A0O(!this.A07, true);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.creation.photo.crop.CropImageView, android.view.View] */
    public final void A0N() {
        if (this.A05) {
            U02 u02 = new U02();
            this.A01 = u02;
            u02.A00 = 1.0f;
            setOnTouchListener(u02);
            U02 u022 = this.A01;
            if (u022 != null) {
                u022.A02 = this.A0C;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.creation.photo.crop.CropImageView, android.view.View] */
    public final void A0O(boolean z, boolean z2) {
        float f;
        AnonymousClass81H r2 = this.A04;
        if (r2 != null && r2.A01 != null) {
            JWQ jwq = this.A0A;
            jwq.cancel();
            if (z) {
                f = 1.0f;
            } else if (z2) {
                JWQ jwq2 = jwq.A01.A0A;
                jwq2.setStartTime(-1);
                jwq2.setStartOffset(500);
                jwq2.setDuration(250);
                startAnimation(jwq);
                return;
            } else {
                f = 0.0f;
            }
            C301485zM r0 = r2.A01;
            if (r0 != null && r0.A04(f)) {
                invalidate();
            }
        }
    }

    public final AnonymousClass81H getHighlightView() {
        return this.A04;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.creation.photo.crop.CropImageView, android.view.View] */
    public final void setSameProportionalGrid(boolean z) {
        this.A06 = z;
        invalidate();
    }

    public /* synthetic */ CropImageView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i));
    }

    public final void setGridLinesNumberProvider(MQU mqu) {
        this.A02 = mqu;
    }

    public final void setListener(C66511MUp mUp) {
        this.A03 = mUp;
    }

    public final void setTouchEnabled(boolean z) {
        this.A05 = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        this.A0B = new Point(1, 1);
        this.A0A = new JWQ(this);
        this.A07 = true;
        this.A05 = true;
        this.A09 = AnonymousClass7TE.A0Y();
        this.A08 = AnonymousClass7TE.A0W();
        this.A0C = new JWR(this);
    }
}
