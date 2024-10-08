package X;

import android.media.MediaMetadataRetriever;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public abstract class Q0Y {
    public static final int A00(RandomAccessFile randomAccessFile, String str, long j, long j2) {
        int readInt;
        byte[] bArr = new byte[4];
        randomAccessFile.seek(j2);
        while (randomAccessFile.getFilePointer() < j && (readInt = randomAccessFile.readInt()) >= 8) {
            if (randomAccessFile.read(bArr) == 4) {
                Charset charset = StandardCharsets.US_ASCII;
                0qQ.A08(charset);
                if (new String(bArr, charset).equals(str)) {
                    return readInt;
                }
            }
            randomAccessFile.skipBytes(readInt - 8);
        }
        return -1;
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [java.lang.Object, X.JtC] */
    public static final C60892JtC A01(File file) {
        int i;
        int i2;
        Integer A0m;
        Integer A0m2;
        Long A10;
        int i3 = 0;
        0qQ.A0B(file, 0);
        try {
            String absolutePath = file.getAbsolutePath();
            0qQ.A07(absolutePath);
            i = 0;
            do {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(absolutePath);
                long j = 0;
                ? obj = new Object();
                obj.A02 = 0;
                obj.A01 = 0;
                obj.A00 = 0;
                obj.A03 = null;
                String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
                if (!(extractMetadata == null || (A10 = AnonymousClass7TE.A10(extractMetadata)) == null)) {
                    j = A10.longValue();
                }
                obj.A02 = j;
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(18);
                if (extractMetadata2 == null || (A0m2 = 00y.A0m(extractMetadata2, 10)) == null) {
                    i2 = 0;
                } else {
                    i2 = A0m2.intValue();
                }
                obj.A01 = i2;
                String extractMetadata3 = mediaMetadataRetriever.extractMetadata(19);
                if (!(extractMetadata3 == null || (A0m = 00y.A0m(extractMetadata3, 10)) == null)) {
                    i3 = A0m.intValue();
                }
                obj.A00 = i3;
                obj.A03 = mediaMetadataRetriever.extractMetadata(12);
                return obj;
            } while (i >= 6);
        } catch (RuntimeException e) {
            i++;
            if (i >= 6) {
                throw e;
            }
        } catch (RuntimeException e2) {
            throw Pxe.A0h("Cannot retrieve metadata from file", e2);
        }
        throw e;
    }

    public static final boolean A03(String str) {
        0qQ.A0B(str, 0);
        return AnonymousClass7TF.A1Q((Pxf.A0F(str) > 0 ? 1 : (Pxf.A0F(str) == 0 ? 0 : -1)));
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x001e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.HashMap A02(java.lang.String r4) {
        /*
            java.util.HashMap r3 = X.C66582MXn.A0x(r4)
            android.media.MediaMetadataRetriever r2 = new android.media.MediaMetadataRetriever
            r2.<init>()
            java.io.File r0 = X.AnonymousClass7TE.A0t(r4)     // Catch:{ IllegalArgumentException -> 0x001e, all -> 0x0022 }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ IllegalArgumentException -> 0x001e, all -> 0x0022 }
            r2.setDataSource(r0)     // Catch:{ IllegalArgumentException -> 0x001e, all -> 0x0022 }
            r0 = 5
            java.lang.String r1 = r2.extractMetadata(r0)     // Catch:{ IllegalArgumentException -> 0x001e, all -> 0x0022 }
            java.lang.String r0 = "date_time_original"
            r3.put(r0, r1)     // Catch:{ IllegalArgumentException -> 0x001e, all -> 0x0022 }
        L_0x001e:
            r2.release()     // Catch:{ Exception -> 0x0021 }
        L_0x0021:
            return r3
        L_0x0022:
            r0 = move-exception
            r2.release()     // Catch:{ Exception -> 0x0026 }
        L_0x0026:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q0Y.A02(java.lang.String):java.util.HashMap");
    }
}
