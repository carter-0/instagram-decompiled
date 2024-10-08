package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;

public final class UWT extends C297875sV {
    public int A00;
    public final Paint A01;
    public final RectF A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UWT(C297895sX r3) {
        super(r3 == null ? new C297895sX() : r3);
        Paint A0D = JTP.A0D();
        this.A01 = A0D;
        A0D.setStyle(Paint.Style.FILL_AND_STROKE);
        A0D.setColor(-1);
        Pxi.A0v(A0D, PorterDuff.Mode.DST_OUT);
        this.A02 = new RectF();
    }

    public final void A0J(float f, float f2, float f3, float f4) {
        RectF rectF = this.A02;
        if (f != rectF.left || f2 != rectF.top || f3 != rectF.right || f4 != rectF.bottom) {
            rectF.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }

    public final void draw(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        Canvas canvas2 = canvas;
        if (callback instanceof View) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, (Paint) null);
            }
        } else {
            this.A00 = canvas2.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), (Paint) null);
        }
        super.draw(canvas);
        canvas.drawRect(this.A02, this.A01);
        if (!(getCallback() instanceof View)) {
            canvas.restoreToCount(this.A00);
        }
    }

    public UWT() {
        this((C297895sX) null);
    }
}
