package com.instagram.camera.capture;

import X.0qQ;
import X.2cs;
import X.C252203oj;
import X.C340257ky;
import X.C61340me;
import X.C71392co;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class IgCameraFocusView extends View {
    public float A00;
    public boolean A01;
    public final float A02;
    public final PointF A03;
    public final 2cs A04;
    public final Paint A05;
    public final C252203oj A06;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgCameraFocusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        super.onDraw(canvas);
        if (this.A01) {
            PointF pointF = this.A03;
            canvas.drawCircle(pointF.x, pointF.y, this.A00, this.A05);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgCameraFocusView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        setWillNotDraw(false);
        this.A03 = new PointF();
        Paint paint = new Paint(1);
        this.A05 = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        Resources resources = getResources();
        paint.setStrokeWidth(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        this.A02 = TypedValue.applyDimension(1, 30.0f, resources.getDisplayMetrics());
        C340257ky r3 = new C340257ky(this);
        this.A06 = r3;
        2cs A022 = C61340me.A00().A02();
        A022.A09(C71392co.A03(0.5d, 0.5d));
        A022.A0A(r3);
        this.A04 = A022;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IgCameraFocusView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgCameraFocusView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }
}
