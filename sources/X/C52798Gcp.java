package X;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;

/* renamed from: X.Gcp  reason: case insensitive filesystem */
public final class C52798Gcp extends Drawable {
    public double A00;
    public double A01;
    public int A02;
    public int A03;
    public final float A04;
    public final Animator.AnimatorListener A05;
    public final C71392co A06;
    public final C71392co A07;
    public final SNZ A08;
    public final Integer A09;
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C;
    public final AnonymousClass0eM A0D;
    public final AnonymousClass0eM A0E;
    public final AnonymousClass0eM A0F;
    public final AnonymousClass0eM A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final float A0K;
    public final PathMeasure A0L = new PathMeasure();
    public final Integer A0M;

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        AnonymousClass0eM r6 = this.A0E;
        ((Paint) r6.getValue()).setAlpha(this.A02);
        Path A0C2 = C51965G9l.A0C();
        PathMeasure pathMeasure = this.A0L;
        pathMeasure.getSegment(0.0f, pathMeasure.getLength() * ((float) this.A00), A0C2, true);
        if (this.A00 != 0.0d) {
            canvas.drawPath(A0C2, (Paint) r6.getValue());
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public static final void A00(C52798Gcp gcp) {
        C51970G9q.A1R(gcp.A0A);
        C51970G9q.A1R(gcp.A0B);
        C51970G9q.A1R(gcp.A0G);
        C51970G9q.A1R(gcp.A0D);
        C51970G9q.A1R(gcp.A0C);
    }

    public final void A01() {
        AnonymousClass0eM r0;
        int i = this.A02;
        if (i == 255) {
            A00(this);
            r0 = this.A0A;
        } else if (i > 0) {
            A00(this);
            r0 = this.A0B;
        } else {
            return;
        }
        ((Animator) r0.getValue()).start();
    }

    public final void A02(double d) {
        if (this.A01 != d) {
            this.A01 = d;
            ((2cs) this.A0F.getValue()).A06(d);
        }
    }

    public C52798Gcp(Context context, Integer num, Integer num2, float f, float f2, boolean z, boolean z2, boolean z3) {
        this.A0K = f;
        this.A09 = num;
        this.A0M = num2;
        this.A04 = f2;
        this.A0H = z;
        this.A0I = z2;
        this.A0J = z3;
        SNZ snz = new SNZ(context);
        this.A08 = snz;
        this.A07 = C71392co.A04(15.0d, 18.0d);
        this.A06 = C71392co.A04(18.0d, 8.0d);
        this.A05 = new C56678I7i(this, 1);
        0eO r2 = 0eO.A02;
        this.A0E = C58710IwJ.A00(this, r2, 10);
        this.A0A = C58710IwJ.A00(this, r2, 6);
        this.A0B = C58710IwJ.A00(this, r2, 7);
        this.A0G = C58710IwJ.A00(this, r2, 12);
        this.A0D = C58710IwJ.A00(this, r2, 9);
        this.A0C = C58710IwJ.A00(this, r2, 8);
        this.A0F = C58710IwJ.A00(this, r2, 11);
        this.A02 = 255;
        this.A03 = snz.A00;
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        Paint paint;
        SweepGradient sweepGradient;
        super.setBounds(i, i2, i3, i4);
        RectF rectF = new RectF((float) i, (float) i2, (float) i3, (float) i4);
        float f = this.A04 / 2.0f;
        rectF.inset(f, f);
        float f2 = this.A0K;
        this.A0L.setPath(I2S.A00(rectF, this.A0M, f2, f2), false);
        A02(this.A00);
        int intValue = this.A09.intValue();
        if (intValue == 1) {
            paint = (Paint) this.A0E.getValue();
            SNZ snz = this.A08;
            float width = rectF.width() / 2.0f;
            float height = rectF.height() / 2.0f;
            sweepGradient = new SweepGradient(width, height, snz.A04, snz.A03);
            Matrix matrix = new Matrix();
            matrix.postRotate(90.0f, width, height);
            sweepGradient.setLocalMatrix(matrix);
        } else if (intValue == 0) {
            paint = (Paint) this.A0E.getValue();
            sweepGradient = null;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        paint.setShader(sweepGradient);
    }
}
