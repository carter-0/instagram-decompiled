package X;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import java.util.ArrayList;

public abstract class Ahv implements AutoCloseable {
    public static int A00(MediaExtractor mediaExtractor) {
        2HY A0C = C229632nm.A0C(0, mediaExtractor.getTrackCount());
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : A0C) {
            MediaFormat trackFormat = mediaExtractor.getTrackFormat(AnonymousClass7TE.A0M(next));
            0qQ.A07(trackFormat);
            String string = trackFormat.getString("mime");
            if (string != null && 00p.A0k(string, "audio/", false)) {
                A1C.add(next);
            }
        }
        return A1C.size();
    }
}
