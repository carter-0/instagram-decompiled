package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.os.Handler;
import com.instagram.common.session.UserSession;
import java.io.File;

public final class LT1 {
    public static Handler A00;
    public static final Handler A01 = AnonymousClass7TF.A0D();
    public static final LT1 A02 = new Object();

    public static final void A01(Context context, Bitmap bitmap, Bitmap bitmap2, UserSession userSession, MSD msd, File file, float f, int i, int i2) {
        Context context2 = context;
        UserSession userSession2 = userSession;
        AnonymousClass7TF.A1H(context, userSession);
        MSD msd2 = msd;
        0qQ.A0B(msd, 8);
        if (bitmap != null) {
            int i3 = i;
            int i4 = i2;
            Bitmap A09 = 1MF.A09(bitmap, i, i4, 0, false);
            0qQ.A07(A09);
            if (bitmap2 != null) {
                Bitmap A092 = 1MF.A09(bitmap2, i, i4, 0, false);
                0qQ.A07(A092);
                Bitmap createBitmap = Bitmap.createBitmap(A09.getWidth(), A09.getHeight(), Bitmap.Config.ARGB_8888);
                if (createBitmap != null) {
                    Canvas A0B = JTO.A0B(createBitmap);
                    A0B.drawBitmap(A09, 0.0f, 0.0f, (Paint) null);
                    A0B.drawBitmap(A092, 0.0f, 0.0f, (Paint) null);
                    A09 = createBitmap;
                } else {
                    return;
                }
            }
            A02(context2, A09, userSession2, msd2, file, f, i3);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A02(Context context, Bitmap bitmap, UserSession userSession, MSD msd, File file, float f, int i) {
        UserSession userSession2 = userSession;
        Point A012 = AEW.A01(context, userSession, f, i);
        Bitmap A002 = 0fO.A00(bitmap, A012.x, A012.y, true);
        0qQ.A07(A002);
        bitmap.recycle();
        int width = A002.getWidth();
        int height = A002.getHeight();
        Handler handler = A00;
        if (handler == null) {
            handler = new Handler(C64021Cb.A00());
            A00 = handler;
        }
        handler.post(new MA4(A002, userSession2, msd, file, width, height));
    }

    public static final void A03(Context context, UserSession userSession, MSD msd, File file, String str, float f, int i, int i2) {
        UserSession userSession2 = userSession;
        DbW.A1N(userSession, 1, str);
        MSD msd2 = msd;
        0qQ.A0B(msd, 7);
        Bitmap A002 = A02.A00(str, 1);
        if (A002 != null) {
            Bitmap A09 = 1MF.A09(A002, i, i2, C364678lo.A01(str), false);
            0qQ.A07(A09);
            A02(context, A09, userSession2, msd2, file, f, i);
        }
    }

    private final Bitmap A00(String str, int i) {
        Bitmap bitmap;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = i;
            bitmap = BitmapFactory.decodeFile(str, options);
        } catch (OutOfMemoryError unused) {
            bitmap = null;
        }
        if (bitmap == null && i == 1) {
            return A00(str, 2);
        }
        return bitmap;
    }
}
