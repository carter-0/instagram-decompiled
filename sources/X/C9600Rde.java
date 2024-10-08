package X;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import java.util.ArrayList;

/* renamed from: X.Rde  reason: case insensitive filesystem */
public abstract class C9600Rde {
    public static ArrayList A00(MediaExtractor mediaExtractor) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        int trackCount = mediaExtractor.getTrackCount();
        for (int i = 0; i < trackCount; i++) {
            MediaFormat trackFormat = mediaExtractor.getTrackFormat(i);
            if (trackFormat.getString("mime").startsWith("video/")) {
                A1C.add(new C10428Rs4(trackFormat, i));
            }
        }
        return A1C;
    }
}
