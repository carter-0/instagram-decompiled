package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.UjL  reason: case insensitive filesystem */
public final class C15835UjL extends C268694dq {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final Context A09;
    public final Paint A0A = new Paint(1);
    public final Paint A0B;
    public final Path A0C;
    public final RectF A0D;
    public final RectF A0E;
    public final RectF A0F;
    public final C306386Ly A0G;

    public C15835UjL(Context context) {
        Context context2 = context;
        this.A09 = context2;
        int A012 = C61380mr.A01(context2, 10);
        int A013 = C61380mr.A01(context2, 34);
        int A014 = C61380mr.A01(context2, 14);
        this.A06 = A014;
        int A015 = C61380mr.A01(context2, 25);
        float A016 = (float) C61380mr.A01(context2, 50);
        this.A00 = A016;
        float A017 = (float) C61380mr.A01(context2, 34);
        this.A01 = A017;
        this.A02 = (float) C61380mr.A01(context2, 6);
        int A018 = C61380mr.A01(context2, 4);
        this.A07 = A018;
        this.A08 = C61380mr.A01(context2, 12);
        float A019 = (float) C61380mr.A01(context2, 8);
        this.A03 = A019;
        this.A04 = (float) C61380mr.A01(context2, 5);
        float f = A019 * 1.8f;
        float A0110 = (float) C61380mr.A01(context2, 4);
        RectF rectF = new RectF(0.0f, 0.0f, A016, A017);
        this.A0D = rectF;
        RectF rectF2 = new RectF(A0110, A0110, A016 - A0110, A017 - A0110);
        this.A0F = rectF2;
        RectF rectF3 = new RectF();
        this.A0E = rectF3;
        C306386Ly r4 = new C306386Ly(context2, A013);
        Context context3 = r4.A0Z;
        0qQ.A07(context3);
        AnonymousClass7TE.A1X(0qm.A0T, AnonymousClass0qo.A00(context3), r4);
        r4.A0A((float) A012);
        AnonymousClass7TG.A0y(context3, r4, R.attr.igds_color_text_on_color);
        r4.A0M(context3.getString(2131956460));
        this.A0G = r4;
        Path path = new Path();
        path.setFillType(Path.FillType.WINDING);
        path.addRoundRect(rectF2, f, f, Path.Direction.CW);
        this.A0C = path;
        Paint paint = new Paint(1);
        paint.setColor(0);
        paint.setShadowLayer(f, 2.0f, 8.0f, context2.getColor(R.color.black_30_transparent));
        this.A0B = paint;
        this.A05 = AnonymousClass1GD.A03() ? AnonymousClass7TF.A03(context2, R.attr.igds_color_elevated_background) : AnonymousClass7TF.A03(context2, R.attr.igds_color_primary_background);
        setBounds(0, 0, (int) this.A00, getIntrinsicHeight());
        float f2 = (float) A015;
        float centerX = rectF.centerX() - (f2 / 2.0f);
        float f3 = rectF.bottom - ((float) A018);
        rectF3.set(centerX, f3, f2 + centerX, ((float) A014) + f3);
        int i = r4.A0A;
        int i2 = r4.A06;
        r4.setBounds(AnonymousClass1GB.A01((A016 / 2.0f) - (((float) i) / 2.0f)), AnonymousClass1GB.A01((A017 / 2.0f) - (((float) i2) / 2.0f)), i, i2);
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        canvas.translate(0.0f, 0.0f);
        canvas.drawPath(this.A0C, this.A0B);
        RectF rectF = this.A0D;
        rectF.set(new RectF(0.0f, 0.0f, this.A00, this.A01));
        Paint paint = this.A0A;
        int i = this.A05;
        paint.setColor(i);
        float f = this.A03;
        canvas.drawRoundRect(rectF, f, 1.2f * f, paint);
        float f2 = this.A02;
        rectF.inset(f2, f2);
        Context context = this.A09;
        0qQ.A0B(context, 1);
        AnonymousClass7TE.A1N(context, paint, 2Yu.A0H(context, R.attr.igds_color_gradient_blue));
        float f3 = this.A04;
        canvas.drawRoundRect(rectF, f3, f3, paint);
        this.A0G.draw(canvas);
        C14504TxQ.A00(canvas, this.A0E, i);
    }

    public final List A07() {
        return 0sr.A1M(new Drawable[]{this.A0G});
    }

    public final int getIntrinsicHeight() {
        return ((((int) this.A01) + this.A06) - this.A07) + this.A08;
    }

    public final int getIntrinsicWidth() {
        return (int) this.A00;
    }
}
