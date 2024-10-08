package X;

import android.media.MediaCodec;
import android.os.Build;
import com.facebook.react.views.webview.ReactWebViewManager;
import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.4aL  reason: invalid class name and case insensitive filesystem */
public abstract class C266784aL {
    public static final int A00 = Build.VERSION.SDK_INT;

    /* JADX WARNING: Can't wrap try/catch for region: R(7:28|29|30|31|32|33|34) */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a9, code lost:
        r2.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x0088 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.io.File A01(android.content.Context r7, java.lang.String r8) {
        /*
            r3 = 0
            java.lang.String r0 = "content"
            boolean r0 = X.00p.A0k(r8, r0, r3)
            if (r0 == 0) goto L_0x00ad
            java.io.File r4 = r7.getCacheDir()     // Catch:{ IOException -> 0x00ad }
            android.content.ContentResolver r1 = r7.getContentResolver()     // Catch:{ IOException -> 0x00ad }
            android.net.Uri r0 = X.0cp.A03(r8)     // Catch:{ IOException -> 0x00ad }
            java.lang.String r2 = r1.getType(r0)     // Catch:{ IOException -> 0x00ad }
            java.lang.String r1 = ".tmp"
            if (r2 == 0) goto L_0x0028
            android.webkit.MimeTypeMap r0 = android.webkit.MimeTypeMap.getSingleton()     // Catch:{ IOException -> 0x00ad }
            java.lang.String r0 = r0.getExtensionFromMimeType(r2)     // Catch:{ IOException -> 0x00ad }
            if (r0 == 0) goto L_0x0028
            r1 = r0
        L_0x0028:
            r0 = 1572(0x624, float:2.203E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x00ad }
            java.io.File r6 = java.io.File.createTempFile(r0, r1, r4)     // Catch:{ IOException -> 0x00ad }
            android.net.Uri r2 = X.0cp.A03(r8)     // Catch:{ IOException -> 0x00ad }
            X.0qQ.A07(r2)     // Catch:{ IOException -> 0x00ad }
            X.0qQ.A0A(r6)     // Catch:{ IOException -> 0x00ad }
            r0 = 2
            X.0qQ.A0B(r6, r0)     // Catch:{ IOException -> 0x00ad }
            android.content.ContentResolver r0 = r7.getContentResolver()     // Catch:{ IOException -> 0x00ad }
            java.io.InputStream r5 = r0.openInputStream(r2)     // Catch:{ IOException -> 0x00ad }
            if (r5 == 0) goto L_0x008e
            java.lang.String r4 = "IOException when getting file from URI:\" + contentURIFilePath"
            boolean r0 = r6.exists()     // Catch:{ IOException -> 0x00ad }
            if (r0 == 0) goto L_0x0055
            r6.delete()     // Catch:{ IOException -> 0x00ad }
        L_0x0055:
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00ad }
            r2.<init>(r6)     // Catch:{ IOException -> 0x00ad }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r1 = new byte[r0]     // Catch:{ all -> 0x007c }
        L_0x005e:
            int r0 = r5.read(r1)     // Catch:{ all -> 0x007c }
            if (r0 < 0) goto L_0x0068
            r2.write(r1, r3, r0)     // Catch:{ all -> 0x007c }
            goto L_0x005e
        L_0x0068:
            r2.flush()     // Catch:{ IOException -> 0x00ad }
            java.io.FileDescriptor r0 = r2.getFD()     // Catch:{ IOException -> 0x0076 }
            r0.sync()     // Catch:{ IOException -> 0x0076 }
            r2.close()     // Catch:{ IOException -> 0x00ad }
            return r6
        L_0x0076:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x00ad }
            r1.<init>(r4)     // Catch:{ IOException -> 0x00ad }
            goto L_0x00ac
        L_0x007c:
            r1 = move-exception
            r2.flush()     // Catch:{ IOException -> 0x00ad }
            java.io.FileDescriptor r0 = r2.getFD()     // Catch:{ IOException -> 0x0088 }
            r0.sync()     // Catch:{ IOException -> 0x0088 }
            goto L_0x00a9
        L_0x0088:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x00ad }
            r0.<init>(r4)     // Catch:{ IOException -> 0x00ad }
            throw r0     // Catch:{ IOException -> 0x00ad }
        L_0x008e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00ad }
            r1.<init>()     // Catch:{ IOException -> 0x00ad }
            r0 = 490(0x1ea, float:6.87E-43)
            java.lang.String r0 = X.Pxd.A00(r0)     // Catch:{ IOException -> 0x00ad }
            r1.append(r0)     // Catch:{ IOException -> 0x00ad }
            r1.append(r2)     // Catch:{ IOException -> 0x00ad }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x00ad }
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ IOException -> 0x00ad }
            r1.<init>(r0)     // Catch:{ IOException -> 0x00ad }
            goto L_0x00ac
        L_0x00a9:
            r2.close()     // Catch:{ IOException -> 0x00ad }
        L_0x00ac:
            throw r1     // Catch:{ IOException -> 0x00ad }
        L_0x00ad:
            java.lang.String r0 = "file:/"
            boolean r0 = X.00p.A0k(r8, r0, r3)
            if (r0 == 0) goto L_0x00c5
            android.net.Uri r0 = X.0cp.A03(r8)     // Catch:{ SecurityException -> 0x00c5 }
            java.lang.String r0 = r0.getPath()     // Catch:{ SecurityException -> 0x00c5 }
            if (r0 == 0) goto L_0x00c5
            java.io.File r6 = new java.io.File     // Catch:{ SecurityException -> 0x00c5 }
            r6.<init>(r0)     // Catch:{ SecurityException -> 0x00c5 }
            return r6
        L_0x00c5:
            java.io.File r0 = new java.io.File
            r0.<init>(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C266784aL.A01(android.content.Context, java.lang.String):java.io.File");
    }

    public static final String A02(MediaCodec.CodecException codecException) {
        0qQ.A0B(codecException, 0);
        String format = String.format(Locale.US, "mediaCodecErrorCode: %s, mediaCodecErrorDiagnosticInfo: %s, isRecoverable: %s, isTransient: %s", Arrays.copyOf(new Object[]{Integer.valueOf(codecException.getErrorCode()), codecException.getDiagnosticInfo(), Boolean.valueOf(codecException.isRecoverable()), Boolean.valueOf(codecException.isTransient())}, 4));
        0qQ.A07(format);
        return format;
    }

    public static final String A04(byte[] bArr) {
        0qQ.A0B(bArr, 0);
        StringBuilder sb = new StringBuilder();
        for (byte valueOf : bArr) {
            String format = String.format(Locale.ROOT, "%02X", Arrays.copyOf(new Object[]{Byte.valueOf(valueOf)}, 1));
            0qQ.A07(format);
            sb.append(format);
        }
        String obj = sb.toString();
        0qQ.A07(obj);
        return obj;
    }

    public static final String A03(Class cls, Map map) {
        StringBuilder sb = new StringBuilder(32);
        sb.append(cls.getSimpleName());
        sb.append('{');
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            sb.append((String) entry.getKey());
            sb.append('=');
            sb.append(value);
            sb.append(", ");
        }
        if (sb.charAt(sb.length() - 2) == ',') {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append('}');
        String obj = sb.toString();
        0qQ.A07(obj);
        return obj;
    }

    public static final void A05(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("argument cannot be null");
        }
    }

    public static final void A06(boolean z, String str) {
        if (!z) {
            if (str == null) {
                str = "";
            }
            throw new IllegalArgumentException(str);
        }
    }

    public static final C10392RrT A00(JSONObject jSONObject) {
        String obj = jSONObject.toString();
        0qQ.A07(obj);
        Charset forName = Charset.forName(ReactWebViewManager.HTML_ENCODING);
        0qQ.A07(forName);
        byte[] bytes = obj.getBytes(forName);
        0qQ.A07(bytes);
        return new C10392RrT(new C11420SSw(new ByteArrayInputStream(bytes)), 0);
    }
}
