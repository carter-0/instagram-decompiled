package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

public final class U18 extends Drawable {
    public static final /* synthetic */ AnonymousClass0YZ[] A0B;
    public float A00;
    public int A01;
    public RectF A02;
    public C18651Vw5 A03;
    public Integer A04;
    public final float A05 = 0.8f;
    public final Paint A06;
    public final Path A07;
    public final 0s0 A08;
    public final 0s0 A09;
    public final Context A0A;

    public static final float A00(float f, float f2) {
        if (f != 0.0f) {
            return f + (f2 * 0.5f);
        }
        return 0.0f;
    }

    public final void draw(Canvas canvas) {
        C18651Vw5 vw5;
        W08 w08;
        W08 w082;
        W08 w083;
        0qQ.A0B(canvas, 0);
        if (this.A00 != 0.0f) {
            Path path = this.A07;
            path.reset();
            0s0 r0 = this.A08;
            AnonymousClass0YZ[] r9 = A0B;
            C18659VwF vwF = (C18659VwF) Pxe.A0s(this, r0, r9, 0);
            if (vwF != null) {
                vw5 = vwF.A00(this.A0A, W2U.A01((float) AnonymousClass7TF.A06(this)), W2U.A01((float) JTP.A06(this)), getLayoutDirection());
            } else {
                vw5 = null;
            }
            this.A03 = vw5;
            RectF rectF = this.A02;
            C13988Tno.A0v(rectF, this);
            float f = rectF.top;
            0s0 r8 = this.A09;
            float f2 = this.A05;
            rectF.top = f - (((this.A00 * 0.5f) + AnonymousClass7TE.A04(Pxe.A0s(this, r8, r9, 1))) - f2);
            rectF.bottom += ((this.A00 * 0.5f) + AnonymousClass7TE.A04(Pxe.A0s(this, r8, r9, 1))) - f2;
            rectF.left -= ((this.A00 * 0.5f) + AnonymousClass7TE.A04(Pxe.A0s(this, r8, r9, 1))) - f2;
            rectF.right += ((this.A00 * 0.5f) + AnonymousClass7TE.A04(Pxe.A0s(this, r8, r9, 1))) - f2;
            C18651Vw5 vw52 = this.A03;
            if (vw52 == null || !vw52.A00()) {
                path.addRect(rectF, Path.Direction.CW);
            } else {
                W08 A002 = W08.A00(vw52.A02);
                C18651Vw5 vw53 = this.A03;
                if (vw53 != null) {
                    w08 = W08.A00(vw53.A03);
                } else {
                    w08 = new W08(0.0f, 0.0f);
                }
                C18651Vw5 vw54 = this.A03;
                if (vw54 != null) {
                    w082 = W08.A00(vw54.A00);
                } else {
                    w082 = new W08(0.0f, 0.0f);
                }
                C18651Vw5 vw55 = this.A03;
                if (vw55 != null) {
                    w083 = W08.A00(vw55.A01);
                } else {
                    w083 = new W08(0.0f, 0.0f);
                }
                float f3 = A002.A00;
                float f4 = this.A00;
                path.addRoundRect(rectF, new float[]{A00(f3, f4), A00(A002.A01, f4), A00(w08.A00, f4), A00(w08.A01, f4), A00(w083.A00, f4), A00(w083.A01, f4), A00(w082.A00, f4), A00(w082.A01, f4)}, Path.Direction.CW);
            }
            canvas.drawPath(path, this.A06);
        }
    }

    static {
        Class<U18> cls = U18.class;
        A0B = new AnonymousClass0YZ[]{new 015(cls, "borderRadius", "getBorderRadius()Lcom/facebook/react/uimanager/style/BorderRadiusStyle;", 0), new 015(cls, "outlineOffset", "getOutlineOffset()F", 0)};
    }

    public U18(Context context, C18659VwF vwF, Integer num) {
        this.A0A = context;
        this.A08 = new C13408TYs(0, this, vwF);
        this.A09 = new C13408TYs(0, this, Float.valueOf(0.0f));
        this.A04 = num;
        this.A01 = -16777216;
        this.A00 = 0.0f;
        Paint paint = new Paint();
        JTO.A1N(paint);
        paint.setColor(-16777216);
        paint.setStrokeWidth(0.0f);
        paint.setPathEffect((PathEffect) null);
        this.A06 = paint;
        this.A02 = new RectF();
        this.A07 = new Path();
    }

    public final int getOpacity() {
        return AnonymousClass7TE.A06((((float) this.A06.getAlpha()) / 255.0f) / (((float) Color.alpha(this.A01)) / 255.0f), 255.0f);
    }

    public final void setAlpha(int i) {
        this.A06.setAlpha(AnonymousClass7TE.A06((((float) i) / 255.0f) * (((float) Color.alpha(this.A01)) / 255.0f), 255.0f));
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A06.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public static final DashPathEffect A01(Integer num, float f) {
        float[] fArr;
        int intValue = num.intValue();
        if (intValue == 0) {
            return null;
        }
        if (intValue == 1) {
            fArr = new float[4];
            f *= 3.0f;
        } else if (intValue == 2) {
            fArr = new float[4];
        } else {
            throw new RuntimeException();
        }
        fArr[0] = f;
        fArr[1] = f;
        fArr[2] = f;
        fArr[3] = f;
        return new DashPathEffect(fArr, 0.0f);
    }
}
