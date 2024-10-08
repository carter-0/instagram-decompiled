package X;

import android.media.MediaMetadataRetriever;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Deprecated;

public final class AIF {
    public static final int A00(String str) {
        IOException iOException;
        String str2;
        String str3;
        0qQ.A0B(str, 0);
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(str);
            try {
                String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
                if (extractMetadata != null) {
                    int parseInt = Integer.parseInt(extractMetadata);
                    if (parseInt > 0) {
                        return parseInt;
                    }
                    str3 = 002.A0O("got invalid integer duration value: ", parseInt);
                } else {
                    str3 = "got null duration metadata string";
                }
                iOException = A02((Exception) null, str3, str);
            } finally {
                try {
                    mediaMetadataRetriever.release();
                } catch (Exception unused) {
                }
            }
        } catch (IllegalArgumentException e) {
            e = e;
            str2 = "Cannot setDataSource: file corrupted or incomplete";
            iOException = A02(e, str2, str);
            throw iOException;
        } catch (RuntimeException e2) {
            e = e2;
            str2 = "Cannot setDataSource: got RuntimeException";
            iOException = A02(e, str2, str);
            throw iOException;
        }
        throw iOException;
    }

    @Deprecated(message = "Use [MediaDurationUtil#extractMediaDurationMs(String)] which forces the caller to\n        properly handle the exception.")
    public static final int A01(String str) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(str);
            String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
            if (extractMetadata != null) {
                return Integer.parseInt(extractMetadata);
            }
            throw AnonymousClass7TE.A0y();
        } finally {
            try {
                mediaMetadataRetriever.release();
            } catch (Exception unused) {
            }
        }
    }

    public static final IOException A02(Exception exc, String str, String str2) {
        String format = String.format(Locale.US, "%s - pathExists=%b, path=%s", Arrays.copyOf(new Object[]{str, Boolean.valueOf(AnonymousClass7TE.A0t(str2).exists()), str2}, 3));
        0qQ.A07(format);
        String obj = AIF.class.toString();
        if (exc == null) {
            0qQ.A07(obj);
            0wb.A03(obj, format);
        } else {
            0qQ.A07(obj);
            0wb.A06(obj, format, exc);
        }
        return new IOException(format, exc);
    }
}
