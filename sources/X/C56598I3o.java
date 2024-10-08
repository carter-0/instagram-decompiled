package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.TextureView;
import android.view.View;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.ui.blur.BlurUtil;

/* renamed from: X.I3o  reason: case insensitive filesystem */
public abstract class C56598I3o {
    public static final Paint A00 = AnonymousClass7TE.A0V(7);

    public static Bitmap A00(int i, int i2, int i3) {
        int i4 = i / i3;
        int i5 = i2 / i3;
        if (i4 > 0 && i5 > 0) {
            return Bitmap.createBitmap(i4, i5, Bitmap.Config.ARGB_8888);
        }
        0wb.A03("BlurBitmapUtil_createScaledBitmap", StringFormatUtil.formatStrLocaleSafe("originalSize=%dx%d scale=%d scaledSize=%dx%d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}));
        return null;
    }

    public static Bitmap A01(Rect rect, Bitmap[] bitmapArr, Rect[] rectArr, View[] viewArr, int i, int i2) {
        int i3 = i;
        Bitmap A002 = A00(rect.width(), rect.height(), i3);
        if (A002 == null) {
            return null;
        }
        Canvas canvas = new Canvas(A002);
        A002.eraseColor(-1);
        for (int i4 = 0; i4 < viewArr.length; i4++) {
            TextureView textureView = viewArr[i4];
            if (textureView.getParent() != null && textureView.getVisibility() == 0 && textureView.isLaidOut()) {
                Rect rect2 = rectArr[i4];
                if (rect2 == null) {
                    rect2 = AnonymousClass7TE.A0W();
                }
                if (rect2.isEmpty()) {
                    int[] iArr = new int[2];
                    textureView.getLocationOnScreen(iArr);
                    int i5 = iArr[0] - rect.left;
                    rect2.set(i5, iArr[1] - rect.top, i5 + textureView.getWidth(), (iArr[1] - rect.top) + textureView.getHeight());
                }
                canvas.save();
                float f = (float) i3;
                canvas.translate((((float) rect2.left) * 1.0f) / f, (((float) rect2.top) * 1.0f) / f);
                if (textureView instanceof TextureView) {
                    Bitmap bitmap = bitmapArr[i4];
                    if (!(bitmap == null && (bitmap = A00(textureView.getWidth(), textureView.getHeight(), i3)) == null) && !bitmap.isRecycled()) {
                        textureView.getBitmap(bitmap);
                        canvas.drawBitmap(bitmap, 0.0f, 0.0f, A00);
                    }
                } else {
                    float f2 = 1.0f / f;
                    canvas.scale(f2, f2);
                    textureView.draw(canvas);
                }
                canvas.restore();
            }
        }
        BlurUtil.blurInPlace(A002, i2);
        return A002;
    }
}
