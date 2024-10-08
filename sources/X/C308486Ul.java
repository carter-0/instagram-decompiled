package X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;

/* renamed from: X.6Ul  reason: invalid class name and case insensitive filesystem */
public abstract class C308486Ul {
    public static final AnonymousClass9O8 A00(Bitmap bitmap, ShapeDrawable shapeDrawable, Shape shape) {
        0qQ.A0B(shape, 1);
        AnonymousClass9O8 r3 = new AnonymousClass9O8(bitmap);
        shapeDrawable.setShaderFactory(r3);
        Paint paint = shapeDrawable.getPaint();
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(0.0f);
        paint.setAlpha(255);
        if (shape instanceof C308496Um) {
            C328047Df r0 = (C328047Df) ((C308496Um) shape);
            r0.A00 = 0.0f;
            r0.A03 = true;
        }
        shapeDrawable.setShape(shape);
        return r3;
    }

    public static final AnonymousClass7OE A01(Bitmap bitmap, Paint.Cap cap, Paint.Style style, ShapeDrawable shapeDrawable, Shape shape, int[] iArr, float f, float f2) {
        0qQ.A0B(shapeDrawable, 0);
        0qQ.A0B(shape, 1);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        Shader r3 = new C3266577q(tileMode, shapeDrawable, iArr, f);
        if (bitmap != null) {
            shapeDrawable.setIntrinsicWidth(bitmap.getWidth());
            shapeDrawable.setIntrinsicHeight(bitmap.getHeight());
            r3 = new AnonymousClass9O0(new BitmapShader(bitmap, tileMode, tileMode), r3, PorterDuff.Mode.SRC_IN);
        }
        Paint paint = shapeDrawable.getPaint();
        paint.setStyle(style);
        paint.setStrokeWidth(f2);
        paint.setStrokeCap(cap);
        paint.setShader(r3);
        paint.setAlpha(255);
        if (shape instanceof C308496Um) {
            C328047Df r0 = (C328047Df) ((C308496Um) shape);
            r0.A00 = 0.0f;
            r0.A03 = true;
        }
        shapeDrawable.setShaderFactory((ShapeDrawable.ShaderFactory) null);
        shapeDrawable.setShape(shape);
        return (AnonymousClass7OE) r3;
    }

    public static final void A02(Paint.Style style, ShapeDrawable shapeDrawable, Shape shape, float f, int i) {
        0qQ.A0B(shapeDrawable, 0);
        0qQ.A0B(shape, 1);
        Paint paint = shapeDrawable.getPaint();
        paint.setColor(i);
        paint.setStyle(style);
        paint.setStrokeWidth(f);
        paint.setAlpha(Color.alpha(i));
        paint.setShader((Shader) null);
        if (shape instanceof C308496Um) {
            C328047Df r1 = (C328047Df) ((C308496Um) shape);
            r1.A00 = 0.0f;
            r1.A03 = true;
        }
        shapeDrawable.setShaderFactory((ShapeDrawable.ShaderFactory) null);
        shapeDrawable.setShape(shape);
    }

    public static final void A03(ShapeDrawable shapeDrawable, Shape shape, float f, int i) {
        0qQ.A0B(shapeDrawable, 0);
        0qQ.A0B(shape, 1);
        Paint paint = shapeDrawable.getPaint();
        paint.setColor(i);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAlpha(255);
        paint.setStrokeWidth(f);
        paint.setShader((Shader) null);
        if (shape instanceof C308496Um) {
            C328047Df r0 = (C328047Df) ((C308496Um) shape);
            r0.A00 = f;
            r0.A03 = true;
        }
        shapeDrawable.setShaderFactory((ShapeDrawable.ShaderFactory) null);
        shapeDrawable.setShape(shape);
    }
}
