package X;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import com.facebook.react.modules.dialog.DialogModule;

public final class SGR {
    public static final SGR A00 = new Object();

    public final Float A00(String str) {
        Float f;
        MediaMetadataRetriever mediaMetadataRetriever;
        MediaExtractor mediaExtractor = new MediaExtractor();
        try {
            mediaExtractor.setDataSource(str);
            int trackCount = mediaExtractor.getTrackCount();
            for (int i = 0; i < trackCount; i++) {
                MediaFormat trackFormat = mediaExtractor.getTrackFormat(i);
                String A0a = Pxf.A0a(trackFormat);
                boolean z = true;
                if (A0a == null || !C66580MXl.A1a("video/", 1, A0a)) {
                    z = false;
                }
                if (z) {
                    if (trackFormat.containsKey("frame-rate")) {
                        f = Float.valueOf((float) trackFormat.getInteger("frame-rate"));
                    } else {
                        mediaExtractor.release();
                        mediaMetadataRetriever = new MediaMetadataRetriever();
                        mediaMetadataRetriever.setDataSource(str);
                        f = null;
                        String extractMetadata = mediaMetadataRetriever.extractMetadata(25);
                        if (extractMetadata != null) {
                            f = Float.valueOf(Float.parseFloat(extractMetadata));
                        }
                        mediaMetadataRetriever.release();
                    }
                    mediaExtractor.release();
                    return f;
                }
            }
        } catch (Throwable th) {
            try {
                AnonymousClass7TF.A19(0wj.A01.AEf("FrameRateUtil", 817901174), DialogModule.KEY_MESSAGE, "fps_extractor_error", th);
                0KC.A0F("FrameRateUtil", "Error extracting fps", th);
            } catch (Throwable th2) {
                mediaExtractor.release();
                throw th2;
            }
        }
        mediaExtractor.release();
        return null;
    }
}
