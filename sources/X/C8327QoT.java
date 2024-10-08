package X;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.QoT  reason: case insensitive filesystem */
public final class C8327QoT extends C257213x2 {
    public long A00;
    public AssetFileDescriptor A01;
    public Uri A02;
    public InputStream A03;
    public boolean A04;
    public final Resources A05;
    public final String A06;

    public C8327QoT(Context context) {
        super(false);
        this.A05 = context.getResources();
        this.A06 = context.getPackageName();
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
        A01();
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
            r5.A01()
        L_0x001f:
            return
        L_0x0020:
            r2 = move-exception
            r1 = 2000(0x7d0, float:2.803E-42)
            X.QoY r0 = new X.QoY     // Catch:{ all -> 0x0054 }
            r0.<init>(r4, r2, r1)     // Catch:{ all -> 0x0054 }
            throw r0     // Catch:{ all -> 0x0054 }
        L_0x0029:
            r2 = move-exception
            r1 = 2000(0x7d0, float:2.803E-42)
            X.QoY r0 = new X.QoY     // Catch:{ all -> 0x0032 }
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
            X.QoY r0 = new X.QoY     // Catch:{ all -> 0x004c }
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
            r5.A01()
        L_0x0060:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8327QoT.close():void");
    }

    public final Uri getUri() {
        return this.A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003a, code lost:
        if (r1.matches("\\d+") != false) goto L_0x0092;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0147  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long open(X.C257263x7 r19) {
        /*
            r18 = this;
            r9 = r19
            android.net.Uri r4 = r9.A06
            r10 = r18
            r10.A02 = r4
            java.lang.String r1 = r4.getScheme()
            java.lang.String r0 = "rawresource"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            r8 = 1
            r11 = 0
            if (r0 != 0) goto L_0x0092
            java.lang.String r0 = r4.getScheme()
            java.lang.String r2 = "android.resource"
            boolean r0 = android.text.TextUtils.equals(r2, r0)
            if (r0 == 0) goto L_0x003d
            java.util.List r0 = r4.getPathSegments()
            int r0 = r0.size()
            if (r0 != r8) goto L_0x003d
            java.lang.String r1 = r4.getLastPathSegment()
            r1.getClass()
            java.lang.String r0 = "\\d+"
            boolean r0 = r1.matches(r0)
            if (r0 == 0) goto L_0x003d
            goto L_0x0092
        L_0x003d:
            java.lang.String r0 = r4.getScheme()
            boolean r0 = android.text.TextUtils.equals(r2, r0)
            if (r0 == 0) goto L_0x0088
            java.lang.String r2 = r4.getPath()
            r2.getClass()
            java.lang.String r0 = "/"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L_0x005a
            java.lang.String r2 = r2.substring(r8)
        L_0x005a:
            java.lang.String r1 = r4.getHost()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x0081
            java.lang.String r0 = ""
        L_0x0066:
            java.lang.String r3 = X.002.A0R(r0, r2)
            android.content.res.Resources r2 = r10.A05
            java.lang.String r1 = r10.A06
            java.lang.String r0 = "raw"
            int r1 = r2.getIdentifier(r3, r0, r1)
            if (r1 != 0) goto L_0x009d
            java.lang.String r2 = "Resource not found."
            r1 = 2005(0x7d5, float:2.81E-42)
            X.QoY r0 = new X.QoY
            r0.<init>(r2, r11, r1)
            throw r0
        L_0x0081:
            java.lang.String r0 = ":"
            java.lang.String r0 = X.002.A0R(r1, r0)
            goto L_0x0066
        L_0x0088:
            java.lang.String r2 = "URI must either use scheme rawresource or android.resource"
            r1 = 1004(0x3ec, float:1.407E-42)
            X.QoY r0 = new X.QoY
            r0.<init>(r2, r11, r1)
            throw r0
        L_0x0092:
            java.lang.String r0 = r4.getLastPathSegment()     // Catch:{ NumberFormatException -> 0x0162 }
            r0.getClass()     // Catch:{ NumberFormatException -> 0x0162 }
            int r1 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0162 }
        L_0x009d:
            r10.A02()
            android.content.res.Resources r0 = r10.A05     // Catch:{ NotFoundException -> 0x0159 }
            android.content.res.AssetFileDescriptor r3 = r0.openRawResourceFd(r1)     // Catch:{ NotFoundException -> 0x0159 }
            r10.A01 = r3
            if (r3 == 0) goto L_0x0147
            long r4 = r3.getLength()
            java.io.FileDescriptor r0 = r3.getFileDescriptor()
            java.io.FileInputStream r13 = new java.io.FileInputStream
            r13.<init>(r0)
            r10.A03 = r13
            r12 = 2008(0x7d8, float:2.814E-42)
            r6 = -1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x00cd
            long r0 = r9.A04     // Catch:{ QoY -> 0x0145, IOException -> 0x013c }
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x00cd
            X.QoY r0 = new X.QoY     // Catch:{ QoY -> 0x0145, IOException -> 0x013c }
            r0.<init>(r11, r11, r12)     // Catch:{ QoY -> 0x0145, IOException -> 0x013c }
            throw r0     // Catch:{ QoY -> 0x0145, IOException -> 0x013c }
        L_0x00cd:
            long r14 = r3.getStartOffset()     // Catch:{ QoY -> 0x0145, IOException -> 0x013c }
            long r2 = r9.A04     // Catch:{ QoY -> 0x0145, IOException -> 0x013c }
            long r0 = r2 + r14
            long r16 = r13.skip(r0)     // Catch:{ QoY -> 0x0145, IOException -> 0x013c }
            long r16 = r16 - r14
            int r0 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0136
            r14 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0109
            java.nio.channels.FileChannel r3 = r13.getChannel()     // Catch:{ QoY -> 0x0145, IOException -> 0x013c }
            long r1 = r3.size()     // Catch:{ QoY -> 0x0145, IOException -> 0x013c }
            int r0 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x00f4
            r10.A00 = r6     // Catch:{ QoY -> 0x0145, IOException -> 0x013c }
            goto L_0x0117
        L_0x00f4:
            long r4 = r3.size()     // Catch:{ QoY -> 0x0145, IOException -> 0x013c }
            long r0 = r3.position()     // Catch:{ QoY -> 0x0145, IOException -> 0x013c }
            long r4 = r4 - r0
            r10.A00 = r4     // Catch:{ QoY -> 0x0145, IOException -> 0x013c }
            int r0 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x0119
            X.QoY r0 = new X.QoY     // Catch:{ QoY -> 0x0145, IOException -> 0x013c }
            r0.<init>(r11, r11, r12)     // Catch:{ QoY -> 0x0145, IOException -> 0x013c }
            throw r0     // Catch:{ QoY -> 0x0145, IOException -> 0x013c }
        L_0x0109:
            long r4 = r4 - r16
            r10.A00 = r4     // Catch:{ QoY -> 0x0145, IOException -> 0x013c }
            int r0 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x0119
            X.47s r0 = new X.47s     // Catch:{ QoY -> 0x0145, IOException -> 0x013c }
            r0.<init>()     // Catch:{ QoY -> 0x0145, IOException -> 0x013c }
            throw r0     // Catch:{ QoY -> 0x0145, IOException -> 0x013c }
        L_0x0117:
            r4 = -1
        L_0x0119:
            long r2 = r9.A03
            r0 = r2
            int r11 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r11 == 0) goto L_0x012a
            int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r11 == 0) goto L_0x0128
            long r2 = java.lang.Math.min(r4, r2)
        L_0x0128:
            r10.A00 = r2
        L_0x012a:
            r10.A04 = r8
            r10.A04(r9)
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x0135
            long r0 = r10.A00
        L_0x0135:
            return r0
        L_0x0136:
            X.QoY r0 = new X.QoY     // Catch:{ QoY -> 0x0145, IOException -> 0x013c }
            r0.<init>(r11, r11, r12)     // Catch:{ QoY -> 0x0145, IOException -> 0x013c }
            throw r0     // Catch:{ QoY -> 0x0145, IOException -> 0x013c }
        L_0x013c:
            r2 = move-exception
            r1 = 2000(0x7d0, float:2.803E-42)
            X.QoY r0 = new X.QoY
            r0.<init>(r11, r2, r1)
            throw r0
        L_0x0145:
            r0 = move-exception
            throw r0
        L_0x0147:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Resource is compressed: "
            java.lang.String r2 = X.AnonymousClass7TG.A0m(r4, r0, r1)
            r1 = 2000(0x7d0, float:2.803E-42)
            X.QoY r0 = new X.QoY
            r0.<init>(r2, r11, r1)
            throw r0
        L_0x0159:
            r2 = move-exception
            r1 = 2005(0x7d5, float:2.81E-42)
            X.QoY r0 = new X.QoY
            r0.<init>(r11, r2, r1)
            throw r0
        L_0x0162:
            java.lang.String r2 = "Resource identifier must be an integer."
            r1 = 1004(0x3ec, float:1.407E-42)
            X.QoY r0 = new X.QoY
            r0.<init>(r2, r11, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8327QoT.open(X.3x7):long");
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
                    throw new C2609647s((String) null, e, CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS);
                }
            }
            int read = this.A03.read(bArr, i, i2);
            if (read != -1) {
                long j2 = this.A00;
                if (j2 != -1) {
                    this.A00 = j2 - ((long) read);
                }
                A03(read);
                return read;
            } else if (this.A00 != -1) {
                throw new C2609647s("End of stream reached having not read sufficient data.", new EOFException(), CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS);
            }
        }
        return -1;
    }
}
