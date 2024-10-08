package X;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.QDk  reason: case insensitive filesystem */
public final class C7445QDk extends C22071Xux {
    public long A00;
    public AssetFileDescriptor A01;
    public SH8 A02;
    public InputStream A03;
    public boolean A04;
    public final Context A05;

    public C7445QDk(Context context) {
        super(false);
        this.A05 = context.getApplicationContext();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0040, code lost:
        if (r5.A04 == false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0051, code lost:
        if (r5.A04 == false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0059, code lost:
        if (r5.A04 == false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x005b, code lost:
        r5.A04 = false;
        A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0060, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
            r5 = this;
            r4 = 0
            r5.A02 = r4
            r3 = 0
            java.io.InputStream r0 = r5.A03     // Catch:{ IOException -> 0x0029 }
            if (r0 == 0) goto L_0x000b
            r0.close()     // Catch:{ IOException -> 0x0029 }
        L_0x000b:
            r5.A03 = r4
            android.content.res.AssetFileDescriptor r0 = r5.A01     // Catch:{ IOException -> 0x0020 }
            if (r0 == 0) goto L_0x0014
            r0.close()     // Catch:{ IOException -> 0x0020 }
        L_0x0014:
            r5.A01 = r4
            boolean r0 = r5.A04
            if (r0 == 0) goto L_0x001f
            r5.A04 = r3
            r5.A02()
        L_0x001f:
            return
        L_0x0020:
            r2 = move-exception
            r1 = 2000(0x7d0, float:2.803E-42)
            X.QDp r0 = new X.QDp     // Catch:{ all -> 0x0054 }
            r0.<init>(r4, r2, r1)     // Catch:{ all -> 0x0054 }
            throw r0     // Catch:{ all -> 0x0054 }
        L_0x0029:
            r2 = move-exception
            r1 = 2000(0x7d0, float:2.803E-42)
            X.QDp r0 = new X.QDp     // Catch:{ all -> 0x0032 }
            r0.<init>(r4, r2, r1)     // Catch:{ all -> 0x0032 }
            throw r0     // Catch:{ all -> 0x0032 }
        L_0x0032:
            r1 = move-exception
            r5.A03 = r4
            android.content.res.AssetFileDescriptor r0 = r5.A01     // Catch:{ IOException -> 0x0043 }
            if (r0 == 0) goto L_0x003c
            r0.close()     // Catch:{ IOException -> 0x0043 }
        L_0x003c:
            r5.A01 = r4
            boolean r0 = r5.A04
            if (r0 == 0) goto L_0x0060
            goto L_0x005b
        L_0x0043:
            r2 = move-exception
            r1 = 2000(0x7d0, float:2.803E-42)
            X.QDp r0 = new X.QDp     // Catch:{ all -> 0x004c }
            r0.<init>(r4, r2, r1)     // Catch:{ all -> 0x004c }
            throw r0     // Catch:{ all -> 0x004c }
        L_0x004c:
            r1 = move-exception
            r5.A01 = r4
            boolean r0 = r5.A04
            if (r0 == 0) goto L_0x0060
            goto L_0x005b
        L_0x0054:
            r1 = move-exception
            r5.A01 = r4
            boolean r0 = r5.A04
            if (r0 == 0) goto L_0x0060
        L_0x005b:
            r5.A04 = r3
            r5.A02()
        L_0x0060:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7445QDk.close():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0148  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long E0f(X.SH8 r19) {
        /*
            r18 = this;
            r12 = r18
            r11 = r19
            r12.A02 = r11
            r12.A03()
            android.content.Context r6 = r12.A05
            android.net.Uri r0 = r11.A01
            android.net.Uri r2 = r0.normalizeScheme()
            java.lang.String r1 = r2.getScheme()
            java.lang.String r0 = "rawresource"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            r10 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0048
            android.content.res.Resources r5 = r6.getResources()
            java.util.List r3 = r2.getPathSegments()
            int r0 = r3.size()
            if (r0 != r10) goto L_0x0035
            java.lang.Object r3 = X.AnonymousClass7TE.A13(r3)
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x00b2
        L_0x0035:
            java.lang.String r1 = "rawresource:// URI must have exactly one path element, found "
            int r0 = r3.size()
            java.lang.String r2 = X.002.A0O(r1, r0)
            r1 = 2000(0x7d0, float:2.803E-42)
            X.QDp r0 = new X.QDp
            r0.<init>(r2, r4, r1)
            throw r0
        L_0x0048:
            java.lang.String r0 = r2.getScheme()
            java.lang.String r5 = "android.resource"
            boolean r0 = android.text.TextUtils.equals(r5, r0)
            if (r0 == 0) goto L_0x0178
            java.lang.String r3 = r2.getPath()
            r3.getClass()
            java.lang.String r0 = "/"
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L_0x0067
            java.lang.String r3 = r3.substring(r10)
        L_0x0067:
            java.lang.String r0 = r2.getHost()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00ad
            java.lang.String r1 = r6.getPackageName()
        L_0x0075:
            java.lang.String r0 = r6.getPackageName()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00a4
            android.content.res.Resources r5 = r6.getResources()
        L_0x0083:
            java.lang.String r0 = "\\d+"
            boolean r0 = r3.matches(r0)
            if (r0 != 0) goto L_0x00b2
            java.lang.String r0 = ":"
            java.lang.String r1 = X.002.A0g(r1, r0, r3)
            java.lang.String r0 = "raw"
            int r0 = r5.getIdentifier(r1, r0, r4)
            if (r0 != 0) goto L_0x00b6
            java.lang.String r2 = "Resource not found."
            r1 = 2005(0x7d5, float:2.81E-42)
            X.QDp r0 = new X.QDp
            r0.<init>(r2, r4, r1)
            throw r0
        L_0x00a4:
            android.content.pm.PackageManager r0 = r6.getPackageManager()     // Catch:{ NameNotFoundException -> 0x016d }
            android.content.res.Resources r5 = r0.getResourcesForApplication(r1)     // Catch:{ NameNotFoundException -> 0x016d }
            goto L_0x0083
        L_0x00ad:
            java.lang.String r1 = r2.getHost()
            goto L_0x0075
        L_0x00b2:
            int r0 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x0163 }
        L_0x00b6:
            android.content.res.AssetFileDescriptor r0 = r5.openRawResourceFd(r0)     // Catch:{ NotFoundException -> 0x015a }
            if (r0 == 0) goto L_0x0148
            r12.A01 = r0
            long r5 = r0.getLength()
            android.content.res.AssetFileDescriptor r0 = r12.A01
            java.io.FileDescriptor r0 = r0.getFileDescriptor()
            java.io.FileInputStream r13 = new java.io.FileInputStream
            r13.<init>(r0)
            r12.A03 = r13
            r9 = 2008(0x7d8, float:2.814E-42)
            r7 = -1
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x00e3
            long r0 = r11.A00     // Catch:{ QDp -> 0x0146, IOException -> 0x013d }
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x00e3
            X.QDp r0 = new X.QDp     // Catch:{ QDp -> 0x0146, IOException -> 0x013d }
            r0.<init>(r4, r4, r9)     // Catch:{ QDp -> 0x0146, IOException -> 0x013d }
            throw r0     // Catch:{ QDp -> 0x0146, IOException -> 0x013d }
        L_0x00e3:
            android.content.res.AssetFileDescriptor r0 = r12.A01     // Catch:{ QDp -> 0x0146, IOException -> 0x013d }
            long r14 = r0.getStartOffset()     // Catch:{ QDp -> 0x0146, IOException -> 0x013d }
            long r2 = r11.A00     // Catch:{ QDp -> 0x0146, IOException -> 0x013d }
            long r0 = r2 + r14
            long r16 = r13.skip(r0)     // Catch:{ QDp -> 0x0146, IOException -> 0x013d }
            long r16 = r16 - r14
            int r0 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0137
            r14 = 0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0121
            java.nio.channels.FileChannel r3 = r13.getChannel()     // Catch:{ QDp -> 0x0146, IOException -> 0x013d }
            long r1 = r3.size()     // Catch:{ QDp -> 0x0146, IOException -> 0x013d }
            int r0 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x010c
            r12.A00 = r7     // Catch:{ QDp -> 0x0146, IOException -> 0x013d }
            goto L_0x012f
        L_0x010c:
            long r0 = r3.size()     // Catch:{ QDp -> 0x0146, IOException -> 0x013d }
            long r2 = r3.position()     // Catch:{ QDp -> 0x0146, IOException -> 0x013d }
            long r0 = r0 - r2
            r12.A00 = r0     // Catch:{ QDp -> 0x0146, IOException -> 0x013d }
            int r2 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r2 >= 0) goto L_0x012f
            X.QDp r0 = new X.QDp     // Catch:{ QDp -> 0x0146, IOException -> 0x013d }
            r0.<init>(r4, r4, r9)     // Catch:{ QDp -> 0x0146, IOException -> 0x013d }
            throw r0     // Catch:{ QDp -> 0x0146, IOException -> 0x013d }
        L_0x0121:
            long r5 = r5 - r16
            r12.A00 = r5     // Catch:{ QDp -> 0x0146, IOException -> 0x013d }
            int r0 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x012f
            X.RCg r0 = new X.RCg     // Catch:{ QDp -> 0x0146, IOException -> 0x013d }
            r0.<init>()     // Catch:{ QDp -> 0x0146, IOException -> 0x013d }
            throw r0     // Catch:{ QDp -> 0x0146, IOException -> 0x013d }
        L_0x012f:
            r12.A04 = r10
            r12.A05(r11)
            long r0 = r12.A00
            return r0
        L_0x0137:
            X.QDp r0 = new X.QDp     // Catch:{ QDp -> 0x0146, IOException -> 0x013d }
            r0.<init>(r4, r4, r9)     // Catch:{ QDp -> 0x0146, IOException -> 0x013d }
            throw r0     // Catch:{ QDp -> 0x0146, IOException -> 0x013d }
        L_0x013d:
            r2 = move-exception
            r1 = 2000(0x7d0, float:2.803E-42)
            X.QDp r0 = new X.QDp
            r0.<init>(r4, r2, r1)
            throw r0
        L_0x0146:
            r0 = move-exception
            throw r0
        L_0x0148:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Resource is compressed: "
            java.lang.String r2 = X.AnonymousClass7TG.A0m(r2, r0, r1)
            r1 = 2000(0x7d0, float:2.803E-42)
            X.QDp r0 = new X.QDp
            r0.<init>(r2, r4, r1)
            throw r0
        L_0x015a:
            r2 = move-exception
            r1 = 2005(0x7d5, float:2.81E-42)
            X.QDp r0 = new X.QDp
            r0.<init>(r4, r2, r1)
            throw r0
        L_0x0163:
            java.lang.String r2 = "Resource identifier must be an integer."
            r1 = 1004(0x3ec, float:1.407E-42)
            X.QDp r0 = new X.QDp
            r0.<init>(r2, r4, r1)
            throw r0
        L_0x016d:
            r3 = move-exception
            java.lang.String r2 = "Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility."
            r1 = 2005(0x7d5, float:2.81E-42)
            X.QDp r0 = new X.QDp
            r0.<init>(r2, r3, r1)
            throw r0
        L_0x0178:
            java.lang.String r3 = "Unsupported URI scheme ("
            java.lang.String r2 = r2.getScheme()
            java.lang.String r1 = "). Only "
            java.lang.String r0 = " is supported."
            java.lang.String r2 = X.002.A11(r3, r2, r1, r5, r0)
            r1 = 1004(0x3ec, float:1.407E-42)
            X.QDp r0 = new X.QDp
            r0.<init>(r2, r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7445QDk.E0f(X.SH8):long");
    }

    public final Uri getUri() {
        SH8 sh8 = this.A02;
        if (sh8 != null) {
            return sh8.A01;
        }
        return null;
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.A00;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, (long) i2);
                } catch (IOException e) {
                    throw new C8841RCg((String) null, e, CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS);
                }
            }
            int read = this.A03.read(bArr, i, i2);
            if (read != -1) {
                long j2 = this.A00;
                if (j2 != -1) {
                    this.A00 = j2 - ((long) read);
                }
                A04(read);
                return read;
            } else if (this.A00 != -1) {
                throw new C8841RCg("End of stream reached having not read sufficient data.", new EOFException(), CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS);
            }
        }
        return -1;
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i) {
        return Uri.parse(002.A0O("rawresource:///", i));
    }
}
