package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;

public final class LQL {
    public static final LQL A00 = new Object();

    public static final void A00(Canvas canvas, ViewGroup viewGroup, LQL lql) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            int[] iArr = new int[2];
            childAt.getLocationOnScreen(iArr);
            int i2 = iArr[0];
            int i3 = iArr[1];
            if (childAt.getVisibility() == 0) {
                if (childAt instanceof ViewGroup) {
                    canvas.save();
                    canvas.translate((float) i2, (float) i3);
                    ViewGroup viewGroup2 = (ViewGroup) childAt;
                    viewGroup2.draw(canvas);
                    canvas.restore();
                    A00(canvas, viewGroup2, lql);
                } else if (!(childAt instanceof TextureView)) {
                    continue;
                } else {
                    Bitmap bitmap = ((TextureView) childAt).getBitmap();
                    if (bitmap != null) {
                        canvas.drawBitmap(bitmap, (float) i2, (float) i3, (Paint) null);
                    } else {
                        throw AnonymousClass7TE.A0w("Texture view returned null bitmap");
                    }
                }
            }
        }
    }
}
