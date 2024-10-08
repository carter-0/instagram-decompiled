package com.instagram.common.ui.widget.imageview;

import X.0qQ;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C51965G9l;
import X.C62738Klc;
import X.JTP;
import X.KI5;
import X.KI6;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public final class PunchedOverlayView extends View {
    public float A00 = 1.0f;
    public int A01 = Color.argb(192, 0, 0, 0);
    public Paint A02;
    public Path A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PunchedOverlayView(Context context) {
        super(context);
        0qQ.A0B(context, 1);
    }

    public final void A00(C62738Klc klc) {
        int width = getWidth();
        int height = getHeight();
        Path A0C = C51965G9l.A0C();
        A0C.setFillType(Path.FillType.EVEN_ODD);
        A0C.addRect(0.0f, 0.0f, (float) width, (float) height, Path.Direction.CW);
        this.A03 = A0C;
        if (klc instanceof KI6) {
            KI6 ki6 = (KI6) klc;
            float f = ki6.A00;
            if (f > 0.0f) {
                A0C.addCircle((float) ki6.A01, (float) ki6.A02, f, Path.Direction.CCW);
            }
        } else {
            KI5 ki5 = (KI5) klc;
            RectF rectF = ki5.A01;
            float f2 = ki5.A00;
            A0C.addRoundRect(rectF, f2, f2, Path.Direction.CCW);
        }
        Paint A0D = JTP.A0D();
        A0D.setColor(this.A01);
        A0D.setAlpha((int) (this.A00 * ((float) Color.alpha(this.A01))));
        this.A02 = A0D;
        invalidate();
    }

    public final void draw(Canvas canvas) {
        int A0D = AnonymousClass7TG.A0D(canvas, 1072568178);
        Path path = this.A03;
        if (path != null) {
            Paint paint = this.A02;
            if (paint != null) {
                canvas.drawPath(path, paint);
                float f = this.A00;
                if (f < 1.0f) {
                    float min = Math.min(f + (1.0f / 0.0f), 1.0f);
                    this.A00 = min;
                    Paint paint2 = this.A02;
                    if (paint2 != null) {
                        paint2.setAlpha((int) (min * ((float) Color.alpha(this.A01))));
                    }
                    postInvalidateOnAnimation();
                }
            } else {
                IllegalArgumentException A0w = AnonymousClass7TE.A0w("Required value was null.");
                AnonymousClass0fD.A0A(513994468, A0D);
                throw A0w;
            }
        }
        AnonymousClass0fD.A0A(-2144461042, A0D);
    }

    public final void setDarkenColor(int i) {
        this.A01 = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PunchedOverlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass7TG.A1O(context, attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PunchedOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass7TG.A1O(context, attributeSet);
    }
}
