package com.instagram.creation.capture.quickcapture.freetransform.widget;

import X.0qQ;
import X.2Yu;
import X.AnonymousClass7TE;
import X.C51965G9l;
import X.JTO;
import X.JTT;
import X.JTU;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.android.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ClipTransformItemView extends View {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public RectF A04;
    public float A05;
    public Bitmap A06;
    public Matrix A07;
    public RectF A08;
    public RectF A09;
    public final float A0A;
    public final Path A0B;
    public final int A0C;
    public final Paint A0D;
    public final Paint A0E;
    public final Paint A0F;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ClipTransformItemView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        super.onDraw(canvas);
        RectF rectF = this.A04;
        canvas.drawRoundRect(rectF, rectF.width() * 0.1f, this.A04.width() * 0.1f, this.A0D);
        canvas.drawRect(this.A08, this.A0F);
        Bitmap bitmap = this.A06;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, this.A07, (Paint) null);
        }
        canvas.save();
        Path path = this.A0B;
        0qQ.A0B(path, 1);
        canvas.clipOutPath(path);
        canvas.drawColor(this.A0C);
        canvas.restore();
        RectF rectF2 = this.A04;
        canvas.drawRoundRect(rectF2, rectF2.width() * 0.1f, this.A04.width() * 0.1f, this.A0E);
    }

    private final void A00() {
        float centerX = this.A04.centerX();
        float centerY = this.A04.centerY();
        Bitmap bitmap = this.A06;
        Matrix A0U = AnonymousClass7TE.A0U();
        if (bitmap != null) {
            RectF rectF = this.A09;
            A0U.preTranslate(rectF.left, rectF.top);
            A0U.preScale(this.A09.width() / JTO.A02(bitmap), this.A09.height() / JTO.A01(bitmap));
            JTU.A0i(A0U, this, centerX, centerY);
        }
        this.A07 = A0U;
        invalidate();
    }

    private final void A01() {
        float width = this.A04.width();
        float f = width / this.A05;
        float centerX = this.A04.centerX();
        float centerY = this.A04.centerY();
        float f2 = width / 2.0f;
        float f3 = f / 2.0f;
        this.A09 = new RectF(centerX - f2, centerY - f3, centerX + f2, centerY + f3);
        A02(this);
    }

    public static final void A02(ClipTransformItemView clipTransformItemView) {
        float centerX = clipTransformItemView.A04.centerX();
        float centerY = clipTransformItemView.A04.centerY();
        Matrix A0U = AnonymousClass7TE.A0U();
        JTU.A0i(A0U, clipTransformItemView, centerX, centerY);
        A0U.mapRect(clipTransformItemView.A08, clipTransformItemView.A09);
        clipTransformItemView.A00();
    }

    public final Bitmap getBitmap() {
        return this.A06;
    }

    public final float getVideoAspect() {
        return this.A05;
    }

    public final void setBitmap(Bitmap bitmap) {
        this.A06 = bitmap;
        A00();
    }

    public final void setVideoAspect(float f) {
        if (this.A05 != f) {
            this.A05 = f;
        }
        A01();
    }

    public final void onMeasure(int i, int i2) {
        float f;
        float f2;
        float f3;
        super.onMeasure(i, i2);
        PointF pointF = new PointF(((float) getMeasuredWidth()) / 2.0f, ((float) getMeasuredHeight()) / 2.0f);
        float f4 = this.A0A;
        if (((float) getMeasuredWidth()) / ((float) getMeasuredHeight()) >= f4) {
            f = ((float) getMeasuredHeight()) * 0.9f;
            f2 = pointF.x;
            f3 = (f4 * f) / 2.0f;
        } else {
            float measuredWidth = ((float) getMeasuredWidth()) * 0.9f;
            f = measuredWidth / f4;
            f2 = pointF.x;
            f3 = measuredWidth / 2.0f;
        }
        float f5 = pointF.y;
        float f6 = f / 2.0f;
        this.A04 = new RectF(f2 - f3, f5 - f6, f2 + f3, f5 + f6);
        Path path = this.A0B;
        path.reset();
        RectF rectF = this.A04;
        path.addRoundRect(rectF, rectF.width() * 0.1f, this.A04.width() * 0.1f, Path.Direction.CW);
        A01();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClipTransformItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        Paint A0C2 = JTO.A0C();
        A0C2.setColor(-16777216);
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        A0C2.setStyle(style);
        this.A0D = A0C2;
        Paint A0C3 = JTO.A0C();
        AnonymousClass7TE.A1N(context, A0C3, 2Yu.A0H(context, R.attr.igds_color_creation_tools_grey_04));
        A0C3.setStyle(style);
        this.A0F = A0C3;
        Paint A0C4 = JTO.A0C();
        A0C4.setColor(-1);
        A0C4.setStrokeWidth(1.0f);
        JTO.A1N(A0C4);
        this.A0E = A0C4;
        this.A0C = context.getColor(R.color.black_50_transparent);
        this.A0A = 0.5625f;
        this.A04 = AnonymousClass7TE.A0Y();
        this.A0B = C51965G9l.A0C();
        this.A09 = AnonymousClass7TE.A0Y();
        this.A08 = AnonymousClass7TE.A0Y();
        this.A07 = AnonymousClass7TE.A0U();
        this.A05 = 1.7777778f;
        this.A01 = 1.0f;
    }

    public /* synthetic */ ClipTransformItemView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ClipTransformItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }
}
