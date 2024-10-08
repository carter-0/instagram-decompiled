package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.instagram.android.R;

/* renamed from: X.Rhu  reason: case insensitive filesystem */
public abstract class C9832Rhu {
    public static final Bitmap A00(Context context, Bitmap bitmap) {
        0qQ.A0B(bitmap, 1);
        Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
        Canvas A0B = JTO.A0B(copy);
        Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.meta_ai_watermark);
        float A02 = JTO.A02(decodeResource) / JTO.A01(decodeResource);
        int width = (int) (((double) bitmap.getWidth()) * 0.02d);
        int width2 = (int) (((double) bitmap.getWidth()) * 0.14d);
        int i = (int) (((float) width2) / A02);
        int height = (bitmap.getHeight() - i) - width;
        A0B.drawBitmap(decodeResource, new Rect(0, 0, decodeResource.getWidth(), decodeResource.getHeight()), new Rect(width, height, width2 + width, i + height), new Paint());
        0qQ.A0A(copy);
        return copy;
    }
}
