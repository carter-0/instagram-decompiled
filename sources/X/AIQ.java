package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import com.instagram.common.session.UserSession;

public final class AIQ {
    public static final AIQ A00 = new Object();

    public static final Bitmap A00(Context context, UserSession userSession, AnonymousClass3Q2 r6) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        String str = r6.A3V;
        if (str != null) {
            mediaMetadataRetriever.setDataSource(str);
            Bitmap A01 = A01(mediaMetadataRetriever);
            try {
                mediaMetadataRetriever.release();
            } catch (Throwable th) {
                new 0eQ(th);
            }
            if (A01 == null) {
                return null;
            }
            Point A012 = AEW.A01(context, userSession, r6.A02, r6.A1N.A09);
            Bitmap A002 = 0fO.A00(A01, A012.x, A012.y, true);
            0qQ.A07(A002);
            if (A002.equals(A01)) {
                return A002;
            }
            A01.recycle();
            return A002;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final Bitmap A01(MediaMetadataRetriever mediaMetadataRetriever) {
        Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(0, 2);
        if (frameAtTime != null) {
            return frameAtTime;
        }
        Bitmap frameAtTime2 = mediaMetadataRetriever.getFrameAtTime(1, 2);
        if (frameAtTime2 != null) {
            return frameAtTime2;
        }
        Bitmap frameAtTime3 = mediaMetadataRetriever.getFrameAtTime();
        if (frameAtTime3 == null) {
            return mediaMetadataRetriever.getFrameAtTime(1000);
        }
        return frameAtTime3;
    }

    public final Bitmap A02(MediaMetadataRetriever mediaMetadataRetriever, int i, int i2) {
        MediaMetadataRetriever mediaMetadataRetriever2 = mediaMetadataRetriever;
        int i3 = i;
        int i4 = i2;
        if (Build.VERSION.SDK_INT < 30) {
            Bitmap A01 = A01(mediaMetadataRetriever);
            if (A01 == null) {
                return null;
            }
            Matrix A0U = AnonymousClass7TE.A0U();
            A0U.postScale(((float) i) / ((float) A01.getWidth()), ((float) i2) / ((float) A01.getHeight()));
            int width = A01.getWidth();
            int height = A01.getHeight();
            0fO.A03(A01);
            Bitmap createBitmap = Bitmap.createBitmap(A01, 0, 0, width, height, A0U, false);
            0qQ.A07(createBitmap);
            A01.recycle();
            return createBitmap;
        }
        MediaMetadataRetriever.BitmapParams bitmapParams = new MediaMetadataRetriever.BitmapParams();
        bitmapParams.setPreferredConfig(Bitmap.Config.RGB_565);
        Bitmap scaledFrameAtTime = mediaMetadataRetriever2.getScaledFrameAtTime(0, 2, i3, i4, bitmapParams);
        if (scaledFrameAtTime == null) {
            return mediaMetadataRetriever2.getScaledFrameAtTime(1, 2, i3, i4, bitmapParams);
        }
        return scaledFrameAtTime;
    }
}
