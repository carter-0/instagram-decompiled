package X;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.Stack;

/* renamed from: X.TxQ  reason: case insensitive filesystem */
public abstract class C14504TxQ {
    public static RectF A00 = new RectF(0.0f, 0.0f, 18.0f, 5.0f);

    /* JADX WARNING: type inference failed for: r9v4, types: [java.lang.Object, X.V4H] */
    public static void A00(Canvas canvas, RectF rectF, int i) {
        Stack stack = new Stack();
        stack.push(new Matrix());
        Paint paint = C14505TxR.A00;
        int argb = Color.argb(85, 0, 0, 0);
        int argb2 = Color.argb(51, 0, 0, 0);
        int argb3 = Color.argb(10, 0, 0, 0);
        int argb4 = Color.argb(25, 0, 0, 0);
        V4H v4h = C14505TxR.A07;
        V4H v4h2 = v4h;
        if (v4h == null) {
            ? obj = new Object();
            obj.A01 = new int[]{argb, argb2, argb4, argb3, 0};
            obj.A00 = new float[]{0.0f, 0.25f, 0.5f, 0.76f, 1.0f};
            C14505TxR.A07 = obj;
            v4h2 = obj;
        }
        Canvas canvas2 = canvas;
        canvas2.save();
        RectF rectF2 = C14505TxR.A06;
        RectF rectF3 = C14505TxR.A05;
        RectF rectF4 = rectF;
        if (rectF3.equals(rectF4) || rectF == null) {
            rectF2.set(rectF3);
        } else {
            float min = Math.min(Math.abs(rectF4.width() / rectF3.width()), Math.abs(rectF4.height() / rectF3.height()));
            float abs = Math.abs(rectF3.width() * min);
            float f = abs / 2.0f;
            float abs2 = Math.abs(rectF3.height() * min) / 2.0f;
            rectF2.set(rectF4.centerX() - f, rectF4.centerY() - abs2, rectF4.centerX() + f, rectF4.centerY() + abs2);
        }
        canvas2.translate(rectF2.left, rectF2.top);
        float width = rectF2.width();
        RectF rectF5 = A00;
        canvas2.scale(width / rectF5.width(), rectF2.height() / rectF5.height());
        canvas2.save();
        canvas2.translate(9.0f, 3.5f);
        Object peek = stack.peek();
        peek.getClass();
        ((Matrix) peek).postTranslate(9.0f, 3.5f);
        canvas2.scale(1.25f, 0.1f);
        Object peek2 = stack.peek();
        peek2.getClass();
        ((Matrix) peek2).postScale(1.25f, 0.1f);
        RectF rectF6 = C14505TxR.A04;
        rectF6.set(-6.0f, -6.0f, 6.0f, 6.0f);
        Path path = C14505TxR.A02;
        path.reset();
        path.addOval(rectF6, Path.Direction.CW);
        paint.reset();
        paint.setFlags(1);
        paint.reset();
        paint.setFlags(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        VYB vyb = C14505TxR.A08;
        if (vyb.A02 == null || vyb.A00 != 0.57f || vyb.A01 != 6.01f || !2Ob.A00(vyb.A03, v4h2)) {
            vyb.A00 = 0.57f;
            vyb.A01 = 6.01f;
            vyb.A03 = v4h2;
            int[] iArr = v4h2.A01;
            int length = iArr.length;
            float[] fArr = new float[length];
            float f2 = 0.57f / 6.01f;
            for (int i2 = 0; i2 < length; i2++) {
                fArr[i2] = (v4h2.A00[i2] * (1.0f - f2)) + f2;
            }
            int[] iArr2 = iArr;
            vyb.A02 = new RadialGradient(0.0f, 0.0f, 6.01f, iArr2, fArr, Shader.TileMode.CLAMP);
        }
        paint.setShader(vyb.A02);
        canvas2.drawPath(path, paint);
        canvas2.restore();
        C14505TxR.A03.set(3.0f, 0.0f, 15.0f, 3.51f);
        Path path2 = C14505TxR.A01;
        path2.reset();
        path2.moveTo(10.35f, 2.99f);
        path2.cubicTo(9.59f, 3.69f, 8.41f, 3.69f, 7.65f, 2.99f);
        path2.cubicTo(6.15f, 1.61f, 5.05f, 0.46f, 3.0f, 0.0f);
        path2.lineTo(15.0f, 0.0f);
        path2.cubicTo(13.17f, 0.31f, 11.64f, 1.78f, 10.35f, 2.99f);
        path2.close();
        paint.reset();
        paint.setFlags(1);
        paint.setStyle(style);
        paint.setColor(i);
        canvas2.drawPath(path2, paint);
        canvas2.restore();
    }
}
