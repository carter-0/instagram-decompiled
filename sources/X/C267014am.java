package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.instagram.android.R;
import java.util.Arrays;

/* renamed from: X.4am  reason: invalid class name and case insensitive filesystem */
public abstract class C267014am {
    public static final Bitmap A01(Context context, Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
        0qQ.A07(createBitmap);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(canvas);
        Paint paint = new Paint();
        int[] iArr = new int[5];
        A03(context, (AttributeSet) null, iArr, R.style.GradientPatternStyle);
        paint.setShader(A02(iArr, intrinsicWidth, intrinsicHeight));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawRect(0.0f, 0.0f, (float) intrinsicWidth, (float) intrinsicHeight, paint);
        return createBitmap;
    }

    public static final void A03(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        0qQ.A0B(context, 0);
        0qQ.A0B(iArr, 3);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C71382cm.A0u, 0, i);
        0qQ.A07(obtainStyledAttributes);
        try {
            iArr[0] = obtainStyledAttributes.getColor(0, -16777216);
            iArr[1] = obtainStyledAttributes.getColor(1, -16777216);
            iArr[2] = obtainStyledAttributes.getColor(2, -16777216);
            iArr[3] = obtainStyledAttributes.getColor(3, -16777216);
            iArr[4] = obtainStyledAttributes.getColor(4, -16777216);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static final LinearGradient A02(int[] iArr, int i, int i2) {
        if (Arrays.equals(iArr, AnonymousClass5BH.A02)) {
            0qQ.A0A(iArr);
            return new LinearGradient(0.0f, 0.0f, (float) i, (float) i2, iArr, new float[]{0.06f, 0.37f, 0.64f, 0.7f, 1.0f}, Shader.TileMode.CLAMP);
        }
        0qQ.A0A(iArr);
        return new LinearGradient(0.0f, (float) i2, (float) i, 0.0f, iArr, new float[]{0.0f, 0.27f, 0.51f, 0.75f, 1.0f}, Shader.TileMode.CLAMP);
    }

    public static final Bitmap A00(Context context, Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        0qQ.A07(createBitmap);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        Paint paint = new Paint();
        int[] iArr = new int[5];
        A03(context, (AttributeSet) null, iArr, R.style.GradientPatternStyle);
        paint.setShader(A02(iArr, width, height));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawRect(0.0f, 0.0f, (float) width, (float) height, paint);
        return createBitmap;
    }
}
