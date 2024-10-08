package com.instagram.creation.capture.quickcapture.gallery.editing.ui;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C63150KsJ;
import X.C63407KwT;
import X.JTO;
import X.JTT;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.android.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class GalleryCroppingMaskView extends View {
    public Path A00;
    public Matrix A01;
    public Rect A02;
    public final int A03;
    public final Paint A04;
    public final Paint A05;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GalleryCroppingMaskView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public final void onDraw(Canvas canvas) {
        AnonymousClass7TF.A12(canvas);
        setLayerType(2, (Paint) null);
        canvas.setMatrix(this.A01);
        canvas.drawColor(this.A03);
        Path path = this.A00;
        if (path != null) {
            C63150KsJ.A00(path, this.A02);
            canvas.drawPath(path, this.A05);
            canvas.drawPath(path, this.A04);
        }
        canvas.restore();
    }

    public final void setMask(Rect rect, Matrix matrix, Path path) {
        AnonymousClass7TG.A1N(rect, matrix);
        this.A01 = matrix;
        this.A00 = path;
        this.A02 = rect;
        invalidate();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GalleryCroppingMaskView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        Paint A0C = JTO.A0C();
        A0C.setAntiAlias(true);
        AnonymousClass7TE.A1Q(A0C);
        A0C.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.A05 = A0C;
        this.A03 = context.getColor(R.color.black_60_transparent);
        this.A02 = AnonymousClass7TE.A0W();
        this.A04 = C63407KwT.A00();
    }

    public /* synthetic */ GalleryCroppingMaskView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GalleryCroppingMaskView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }
}
