package com.facebook.smartcapture.components;

import X.0qQ;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.C51965G9l;
import X.C65838M1e;
import X.JTO;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.android.R;

public final class RectDetectionVisualizerView extends View {
    public Handler A00;
    public final Paint A01;
    public final Path A02 = C51965G9l.A0C();
    public final Path A03 = C51965G9l.A0C();
    public final Paint A04;
    public final Paint A05;
    public final Runnable A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RectDetectionVisualizerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        Paint A0C = JTO.A0C();
        AnonymousClass7TE.A1Q(A0C);
        A00(A0C);
        this.A05 = A0C;
        Paint A0C2 = JTO.A0C();
        JTO.A1N(A0C2);
        A0C2.setStrokeWidth(getResources().getDimension(R.dimen.abc_control_corner_material));
        A00(A0C2);
        this.A04 = A0C2;
        Paint A0C3 = JTO.A0C();
        AnonymousClass7TE.A1Q(A0C3);
        A00(A0C3);
        this.A01 = A0C3;
        this.A06 = new C65838M1e(this);
    }

    private final void A00(Paint paint) {
        paint.setColor(0);
        paint.setDither(true);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setPathEffect(new CornerPathEffect(getResources().getDimension(R.dimen.abc_action_bar_elevation_material)));
        paint.setAntiAlias(true);
    }

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        super.onDraw(canvas);
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(-1497981615);
        super.onAttachedToWindow();
        Handler handler = new Handler();
        handler.post(this.A06);
        this.A00 = handler;
        AnonymousClass0fD.A0D(-428774044, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(-237318060);
        super.onDetachedFromWindow();
        Handler handler = this.A00;
        if (handler != null) {
            handler.removeCallbacks(this.A06);
        }
        this.A00 = null;
        AnonymousClass0fD.A0D(-455829498, A062);
    }

    public final void setProgress(int i) {
        postInvalidate();
    }
}
