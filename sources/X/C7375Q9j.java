package X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: X.Q9j  reason: case insensitive filesystem */
public final class C7375Q9j extends ImageView {
    public static final float A01 = ((float) RVO.A00(2));
    public float A00;

    public final void draw(Canvas canvas) {
        int i;
        Bitmap createBitmap;
        int i2;
        int A03 = AnonymousClass0fD.A03(902654691);
        if (isInEditMode()) {
            super.draw(canvas);
            i = 300945811;
        } else {
            Drawable drawable = getDrawable();
            if (drawable != null) {
                if (drawable instanceof BitmapDrawable) {
                    createBitmap = ((BitmapDrawable) drawable).getBitmap();
                } else {
                    try {
                        createBitmap = Bitmap.createBitmap(Math.max(drawable.getIntrinsicWidth(), 2), Math.max(drawable.getIntrinsicHeight(), 2), Bitmap.Config.ARGB_8888);
                        Canvas A0B = JTO.A0B(createBitmap);
                        drawable.setBounds(0, 0, A0B.getWidth(), A0B.getHeight());
                        drawable.draw(A0B);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (createBitmap != null && createBitmap.getWidth() > 0 && createBitmap.getHeight() > 0) {
                    int width = createBitmap.getWidth();
                    int height = createBitmap.getHeight();
                    if (width != height) {
                        int min = Math.min(width, height);
                        int i3 = 0;
                        if (width > height) {
                            i3 = (width - height) / 2;
                        } else if (width < height) {
                            i2 = (height - width) / 2;
                            0fO.A03(createBitmap);
                            createBitmap = Bitmap.createBitmap(createBitmap, i3, i2, min, min);
                        }
                        i2 = 0;
                        0fO.A03(createBitmap);
                        createBitmap = Bitmap.createBitmap(createBitmap, i3, i2, min, min);
                    }
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(createBitmap, tileMode, tileMode);
                    float f = this.A00;
                    float max = Math.max(f / ((float) width), f / ((float) height));
                    Matrix A0U = AnonymousClass7TE.A0U();
                    A0U.setScale(max, max);
                    bitmapShader.setLocalMatrix(A0U);
                    Paint paint = new Paint();
                    Paint paint2 = new Paint();
                    paint2.setAntiAlias(true);
                    paint2.setFilterBitmap(true);
                    paint2.setDither(true);
                    paint2.setColor(-1);
                    JTO.A1N(paint2);
                    paint2.setStrokeWidth(A01);
                    paint.setAntiAlias(true);
                    paint.setFilterBitmap(true);
                    paint.setDither(true);
                    paint.setShader(bitmapShader);
                    float measuredWidth = ((float) getMeasuredWidth()) / 2.0f;
                    float measuredHeight = ((float) getMeasuredHeight()) / 2.0f;
                    float f2 = f / 2.0f;
                    canvas.drawCircle(measuredWidth, measuredHeight, f2, paint);
                    canvas.drawCircle(measuredWidth, measuredHeight, f2, paint2);
                    i = -98417357;
                }
            }
            super.draw(canvas);
            i = -98417357;
        }
        AnonymousClass0fD.A0A(i, A03);
    }
}
