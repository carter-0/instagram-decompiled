package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PorterDuff;
import android.graphics.RectF;

public abstract class LBv {
    public final Q8d A00;

    public final void A00(Canvas canvas, Integer num) {
        Q8d q8d;
        Bitmap bitmap;
        if (this instanceof KBC) {
            KBC kbc = (KBC) this;
            0qQ.A0B(num, 1);
            Canvas canvas2 = kbc.A02;
            canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
            Paint paint = kbc.A03;
            float[] A1b = C51965G9l.A1b();
            // fill-array-data instruction
            A1b[0] = 1092616192;
            A1b[1] = 1092616192;
            paint.setPathEffect(new DashPathEffect(A1b, 0.0f));
            q8d = kbc.A00;
            paint.setStrokeWidth(0nA.A00(AnonymousClass7TE.A0S(q8d), 1.0f));
            for (L3V l3v : kbc.A04) {
                if (num == AnonymousClass05K.A00 || l3v.A00) {
                    RectF rectF = new RectF(l3v.A01);
                    float f = -kbc.A00;
                    rectF.inset(f, f);
                    if (l3v.A00) {
                        AnonymousClass7TE.A1Q(paint);
                    }
                    canvas2.drawRect(rectF, paint);
                    JTO.A1N(paint);
                }
            }
            bitmap = kbc.A01;
        } else if (this instanceof KBB) {
            KBB kbb = (KBB) this;
            0qQ.A0B(num, 1);
            Canvas canvas3 = kbb.A01;
            canvas3.drawColor(0, PorterDuff.Mode.CLEAR);
            Paint paint2 = kbb.A02;
            paint2.setPathEffect((PathEffect) null);
            JTO.A1N(paint2);
            Q8d q8d2 = kbb.A00;
            paint2.setStrokeWidth(0nA.A00(AnonymousClass7TE.A0S(q8d2), 2.0f));
            for (Path drawPath : kbb.A03) {
                canvas3.drawPath(drawPath, paint2);
            }
            canvas.drawBitmap(kbb.A00, q8d2.A04, (Paint) null);
            return;
        } else {
            KBA kba = (KBA) this;
            bitmap = kba.A00;
            q8d = kba.A00;
        }
        canvas.drawBitmap(bitmap, q8d.A04, (Paint) null);
    }

    public LBv(Q8d q8d) {
        this.A00 = q8d;
    }
}
