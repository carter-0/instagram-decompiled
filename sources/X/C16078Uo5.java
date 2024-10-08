package X;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.instagram.android.R;
import java.util.Stack;

/* renamed from: X.Uo5  reason: case insensitive filesystem */
public final class C16078Uo5 extends U0Z {
    public float A00 = 1.0f;
    public float A01;
    public float A02 = 1.0f;
    public long A03;
    public long A04;
    public Integer A05 = AnonymousClass05K.A01;
    public float A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final Context A0B;
    public final RectF A0C;

    public final void setAlpha(int i) {
    }

    public final int getIntrinsicHeight() {
        return this.A07;
    }

    public final int getIntrinsicWidth() {
        return this.A08;
    }

    public C16078Uo5(Context context) {
        super(context);
        this.A0B = context;
        this.A0C = new RectF();
        this.A09 = context.getResources().getColor(2Yu.A0H(context, R.attr.igds_color_icon_badge));
        this.A0A = context.getResources().getColor(R.color.design_dark_default_color_on_background);
        this.A08 = Math.round(0nA.A00(context, 45.0f));
        this.A07 = Math.round(0nA.A00(context, 52.0f));
        this.A06 = (float) C13988Tno.A09(context, 12);
    }

    public static void A00(Stack stack) {
        stack.push(new Matrix((Matrix) stack.peek()));
    }

    public final void draw(Canvas canvas) {
        long currentTimeMillis = System.currentTimeMillis() - this.A04;
        float f = this.A02;
        if (f != this.A00) {
            long j = this.A03;
            if (j == 0) {
                this.A00 = f;
            } else {
                this.A00 = 0mi.A02((float) currentTimeMillis, 0.0f, (float) j, this.A01, f);
            }
        }
        RectF rectF = this.A0C;
        C13988Tno.A0v(rectF, this);
        rectF.offset(0.0f, -this.A06);
        int i = this.A09;
        int i2 = this.A0A;
        float f2 = this.A00;
        Stack stack = new Stack();
        stack.push(new Matrix());
        Paint paint = C17165VKu.A00;
        VYC vyc = C17165VKu.A08;
        vyc.A02 = Color.argb(26, 255, 255, 255);
        vyc.A00 = 1.0f;
        if (vyc.A01 != 2.0f) {
            vyc.A03 = null;
            vyc.A01 = 2.0f;
        }
        float f3 = 2.0f / f2;
        Canvas canvas2 = canvas;
        canvas2.save();
        A00(stack);
        RectF rectF2 = C17165VKu.A07;
        RectF rectF3 = C17165VKu.A05;
        if (!rectF3.equals(rectF)) {
            float min = Math.min(Math.abs(rectF.width() / rectF3.width()), Math.abs(rectF.height() / rectF3.height()));
            float abs = Math.abs(rectF3.width() * min);
            float f4 = abs / 2.0f;
            float abs2 = Math.abs(rectF3.height() * min) / 2.0f;
            rectF2.set(rectF.centerX() - f4, rectF.centerY() - abs2, rectF.centerX() + f4, rectF.centerY() + abs2);
        } else {
            rectF2.set(rectF3);
        }
        canvas2.translate(rectF2.left, rectF2.top);
        canvas2.scale(rectF2.width() / 45.0f, rectF2.height() / 52.0f);
        canvas2.save();
        A00(stack);
        canvas2.translate(23.0f, 51.0f);
        Object peek = stack.peek();
        peek.getClass();
        ((Matrix) peek).postTranslate(23.0f, 51.0f);
        canvas2.scale(f2, f2);
        ((Matrix) stack.peek()).postScale(f2, f2);
        C17165VKu.A04.set(-15.0f, -38.18f, 15.0f, 0.0f);
        Path path = C17165VKu.A02;
        path.reset();
        path.moveTo(0.0f, -38.18f);
        path.cubicTo(8.28f, -38.18f, 15.0f, -31.45f, 15.0f, -23.16f);
        path.cubicTo(15.0f, -10.57f, 0.81f, 0.4f, 0.0f, -0.01f);
        path.cubicTo(-0.81f, 0.4f, -15.0f, -10.57f, -15.0f, -22.75f);
        path.cubicTo(-15.0f, -31.05f, -8.28f, -38.18f, 0.0f, -38.18f);
        path.close();
        paint.reset();
        paint.setFlags(1);
        canvas2.saveLayerAlpha((RectF) null, 255, 31);
        A00(stack);
        Matrix matrix = new Matrix();
        ((Matrix) stack.peek()).invert(matrix);
        canvas2.concat(matrix);
        canvas2.translate(0.0f, vyc.A00);
        canvas2.concat((Matrix) stack.peek());
        Paint paint2 = C17165VKu.A01;
        paint2.set(paint);
        float f5 = vyc.A01;
        if (f5 > 0.0f) {
            BlurMaskFilter blurMaskFilter = vyc.A03;
            if (blurMaskFilter == null) {
                blurMaskFilter = new BlurMaskFilter(f5, BlurMaskFilter.Blur.NORMAL);
                vyc.A03 = blurMaskFilter;
            }
            paint2.setMaskFilter(blurMaskFilter);
        }
        canvas2.drawPath(path, paint2);
        paint2.setXfermode(VK3.A00);
        canvas2.saveLayer((RectF) null, paint2, 31);
        A00(stack);
        canvas2.drawColor(vyc.A02);
        stack.pop();
        canvas2.restore();
        stack.pop();
        canvas2.restore();
        AnonymousClass7TE.A1Q(paint);
        paint.setColor(i);
        canvas2.drawPath(path, paint);
        paint.reset();
        paint.setFlags(1);
        paint.setStrokeWidth(f3);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        canvas2.save();
        A00(stack);
        JTO.A1N(paint);
        paint.setColor(i2);
        canvas2.drawPath(path, paint);
        stack.pop();
        canvas2.restore();
        RectF rectF4 = C17165VKu.A06;
        rectF4.set(-4.14f, -27.32f, 4.14f, -19.04f);
        Path path2 = C17165VKu.A03;
        path2.reset();
        path2.addOval(rectF4, Path.Direction.CW);
        paint.reset();
        paint.setFlags(1);
        AnonymousClass7TE.A1Q(paint);
        paint.setColor(i2);
        canvas2.drawPath(path2, paint);
        stack.pop();
        canvas2.restore();
        stack.pop();
        canvas2.restore();
        if (this.A00 != this.A02) {
            invalidateSelf();
        }
    }
}
