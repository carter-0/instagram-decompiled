package X;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import com.instagram.common.session.UserSession;

/* renamed from: X.Hyd  reason: case insensitive filesystem */
public abstract class C56445Hyd {
    public static final int A00 = Color.argb(128, 0, 0, 0);

    public static final Bitmap A00(Bitmap bitmap, Rect rect, Integer num, float[] fArr, boolean z) {
        Bitmap A01;
        if (bitmap == null || fArr == null || bitmap.getWidth() * bitmap.getHeight() != fArr.length) {
            return null;
        }
        UserSession userSession = 08y.A00().A05.A00;
        boolean z2 = true;
        boolean A1W = AnonymousClass7TF.A1W(num, AnonymousClass05K.A15);
        if (!DbY.A1Y(0Tu.A05, userSession, 36328882088984221L) || !A1W) {
            z2 = false;
        }
        C22004XqK xqK = C22004XqK.A00;
        if (z) {
            A01 = xqK.A02(bitmap, fArr);
        } else {
            A01 = xqK.A01(bitmap, rect, fArr);
        }
        if (!z2) {
            return A01;
        }
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap copy = A01.copy(config, true);
        0qQ.A07(copy);
        Bitmap copy2 = copy.copy(config, true);
        0qQ.A0A(copy2);
        C59358JGk jGk = new C59358JGk(copy2, 0, -1, 0);
        int width = copy2.getWidth();
        for (int i = 0; i < width; i++) {
            int height = copy2.getHeight();
            for (int i2 = 0; i2 < height; i2++) {
                jGk.invoke(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(copy2.getPixel(i, i2)));
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(A01.getWidth() + 6, A01.getHeight() + 6, config);
        0qQ.A07(createBitmap);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setAntiAlias(true);
        int i3 = -3;
        while (true) {
            int i4 = -3;
            while (true) {
                if ((i3 * i3) + (i4 * i4) <= 9) {
                    canvas.drawBitmap(copy2, (float) (i3 + 3), (float) (i4 + 3), paint);
                }
                if (i4 == 3) {
                    break;
                }
                i4++;
            }
            if (i3 != 3) {
                i3++;
            } else {
                canvas.drawBitmap(A01, 3.0f, 3.0f, (Paint) null);
                int i5 = A00;
                int width2 = createBitmap.getWidth();
                int height2 = createBitmap.getHeight();
                int i6 = (int) (2.0f * 2.0f);
                Bitmap createBitmap2 = Bitmap.createBitmap(width2 + i6, i6 + height2, config);
                0qQ.A07(createBitmap2);
                Canvas canvas2 = new Canvas(createBitmap2);
                Paint A0V = AnonymousClass7TE.A0V(1);
                Bitmap createBitmap3 = Bitmap.createBitmap(width2, height2, Bitmap.Config.ALPHA_8);
                0qQ.A07(createBitmap3);
                Canvas canvas3 = new Canvas(createBitmap3);
                A0V.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
                canvas3.drawBitmap(createBitmap, 0.0f, 0.0f, A0V);
                A0V.reset();
                A0V.setMaskFilter(new BlurMaskFilter(2.0f, BlurMaskFilter.Blur.NORMAL));
                A0V.setAlpha(Color.alpha(i5));
                float f = 1.0f + 2.0f;
                canvas2.drawBitmap(createBitmap3, f, f, A0V);
                A0V.reset();
                canvas2.drawBitmap(createBitmap, 2.0f, 2.0f, A0V);
                createBitmap.recycle();
                createBitmap3.recycle();
                return createBitmap2;
            }
        }
    }
}
