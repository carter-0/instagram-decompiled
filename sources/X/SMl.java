package X;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.util.List;

public final class SMl {
    public static final SMl A00;
    public static final String A01;

    /* JADX WARNING: type inference failed for: r0v0, types: [X.SMl, java.lang.Object] */
    static {
        ? obj = new Object();
        A00 = obj;
        A01 = C51968G9o.A16(obj);
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [X.SrR, java.lang.Object] */
    public static final List A00(File file) {
        0sn r3;
        try {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(file.getPath()));
            r3 = AnonymousClass7TE.A1C();
            boolean z = true;
            if (mimeTypeFromExtension == null || !00p.A0k(mimeTypeFromExtension, "image", true)) {
                z = false;
            }
            if (z) {
                r3.add(DbT.A10(new Object().AU7(Uri.fromFile(file))));
            } else {
                MediaExtractor mediaExtractor = new MediaExtractor();
                mediaExtractor.setDataSource(file.getPath());
                int trackCount = mediaExtractor.getTrackCount();
                for (int i = 0; i < trackCount; i++) {
                    MediaFormat trackFormat = mediaExtractor.getTrackFormat(i);
                    0qQ.A07(trackFormat);
                    DbU.A1X(trackFormat, r3);
                }
                mediaExtractor.release();
            }
        } catch (Throwable th) {
            r3 = JTO.A1B(th);
        }
        Throwable A002 = 0eR.A00(r3);
        if (A002 != null) {
            0KC.A0G(A01, "video_format_scan_error", A002);
            0wb.A07("video_format_scan_error", A002);
        }
        0sn r1 = 0sn.A00;
        if (r3 instanceof 0eQ) {
            r3 = r1;
        }
        return (List) r3;
    }
}
