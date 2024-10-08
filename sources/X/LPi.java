package X;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import com.instagram.pendingmedia.model.constants.ShareType;

public abstract class LPi {
    public static final Bitmap A00(String str) {
        Bitmap bitmap;
        Bitmap bitmap2 = null;
        if (str == null) {
            return null;
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(str);
            bitmap = AIQ.A00.A02(mediaMetadataRetriever, 256, 256);
            mediaMetadataRetriever.release();
        } catch (Throwable th) {
            bitmap = JTO.A1B(th);
        }
        Throwable A00 = 0eR.A00(bitmap);
        if (A00 != null) {
            0KC.A0F("PendingMediaWorkerUtils", "Failed to create bitmap from video file path", A00);
        }
        if (!(bitmap instanceof 0eQ)) {
            bitmap2 = bitmap;
        }
        return bitmap2;
    }

    public static final Bitmap A01(String str) {
        Bitmap bitmap;
        Bitmap bitmap2 = null;
        if (str == null) {
            return null;
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(str);
            bitmap = AIQ.A01(mediaMetadataRetriever);
            mediaMetadataRetriever.release();
        } catch (Throwable th) {
            bitmap = JTO.A1B(th);
        }
        Throwable A00 = 0eR.A00(bitmap);
        if (A00 != null) {
            0KC.A0F("PendingMediaWorkerUtils", "Failed to create bitmap from video file path", A00);
        }
        if (!(bitmap instanceof 0eQ)) {
            bitmap2 = bitmap;
        }
        return bitmap2;
    }

    public static final boolean A02(ShareType shareType) {
        if (!0oI.A0C(C60960kU.A00)) {
            return true;
        }
        if (shareType != null) {
            C63389KwA kwA = C63389KwA.$redex_init_class;
            switch (shareType.ordinal()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 9:
                case 16:
                    return true;
            }
        }
        return false;
    }
}
