package X;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.U0e  reason: case insensitive filesystem */
public final class C14658U0e extends Drawable {
    public C18659VwF A00;
    public final Paint A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final int A05;
    public final Context A06;

    public final void draw(Canvas canvas) {
        C18651Vw5 vw5;
        Canvas canvas2 = canvas;
        0qQ.A0B(canvas2, 0);
        float A002 = W2U.A00((float) AnonymousClass7TF.A06(this));
        float A003 = W2U.A00((float) JTP.A06(this));
        C18659VwF vwF = this.A00;
        if (vwF != null) {
            C18651Vw5 A004 = vwF.A00(this.A06, A002, A003, getLayoutDirection());
            vw5 = new C18651Vw5(W08.A00(A004.A02), W08.A00(A004.A03), W08.A00(A004.A00), W08.A00(A004.A01));
        } else {
            vw5 = null;
        }
        float A012 = W2U.A01(this.A04);
        RectF rectF = new RectF(getBounds());
        float f = -A012;
        rectF.inset(f, f);
        rectF.offset(W2U.A01(this.A02), W2U.A01(this.A03));
        int save = canvas2.save();
        if (vw5 == null || !vw5.A00()) {
            canvas2.clipOutRect(getBounds());
            canvas2.drawRect(rectF, this.A01);
        } else {
            RectF rectF2 = new RectF(getBounds());
            rectF2.inset(0.4f, 0.4f);
            Path path = new Path();
            W08 w08 = vw5.A02;
            float f2 = w08.A00;
            float f3 = f2;
            float f4 = w08.A01;
            float f5 = f4;
            W08 w082 = vw5.A03;
            float f6 = w082.A00;
            float f7 = w082.A01;
            W08 w083 = vw5.A01;
            float f8 = w083.A00;
            float f9 = w083.A01;
            W08 w084 = vw5.A00;
            float f10 = w084.A00;
            float f11 = w084.A01;
            float[] fArr = {f2, f4, f6, f7, f8, f9, f10, f11};
            Path.Direction direction = Path.Direction.CW;
            Path path2 = path;
            path2.addRoundRect(rectF2, fArr, direction);
            canvas2.clipOutPath(path2);
            Path path3 = new Path();
            path3.addRoundRect(rectF, new float[]{V6F.A00(f3, A012), V6F.A00(f5, A012), V6F.A00(f6, A012), V6F.A00(f7, A012), V6F.A00(f8, A012), V6F.A00(f9, A012), V6F.A00(f10, A012), V6F.A00(f11, A012)}, direction);
            canvas2.drawPath(path3, this.A01);
        }
        canvas2.restoreToCount(save);
    }

    public final int getOpacity() {
        int alpha = Color.alpha(this.A05);
        if (alpha == 0) {
            return -2;
        }
        return AnonymousClass7TE.A06((((float) this.A01.getAlpha()) / 255.0f) / (((float) alpha) / 255.0f), 255.0f);
    }

    public final void setAlpha(int i) {
        this.A01.setAlpha(AnonymousClass7TE.A06((((float) i) / 255.0f) * (((float) Color.alpha(this.A05)) / 255.0f), 255.0f));
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A01.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public C14658U0e(Context context, C18659VwF vwF, float f, float f2, float f3, float f4, int i) {
        this.A06 = context;
        this.A05 = i;
        this.A02 = f;
        this.A03 = f2;
        this.A04 = f4;
        this.A00 = vwF;
        Paint paint = new Paint();
        paint.setColor(i);
        if (f3 > 0.0f) {
            paint.setMaskFilter(new BlurMaskFilter(C18808W3f.A00(f3 * 0.5f), BlurMaskFilter.Blur.NORMAL));
        }
        this.A01 = paint;
    }
}
