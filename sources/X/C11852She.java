package X;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: X.She  reason: case insensitive filesystem */
public final class C11852She implements C13795ThE {
    public static final byte[] A00 = "Exif\u0000\u0000".getBytes(Pxe.A17());
    public static final int[] A01 = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0045, code lost:
        android.util.Log.isLoggable("DfltImageHeaderParser", 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004c, code lost:
        if (r6 == -1) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0050, code lost:
        r12 = r17;
        r10 = (byte[]) r12.A04(r6, byte[].class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r0 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005f, code lost:
        if (r5.E6A(r10, r6) != r6) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0061, code lost:
        if (r10 == null) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0063, code lost:
        r5 = A00;
        r4 = r5.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0066, code lost:
        if (r6 <= r4) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0068, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0069, code lost:
        if (r3 >= r4) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x006f, code lost:
        if (r10[r3] != r5[r3]) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0071, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0074, code lost:
        r1 = java.nio.ByteBuffer.wrap(r10);
        r3 = java.nio.ByteOrder.BIG_ENDIAN;
        r9 = (java.nio.ByteBuffer) r1.order(r3).limit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x008b, code lost:
        if ((r9.remaining() - 6) < 2) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008d, code lost:
        r2 = r9.getShort(6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0093, code lost:
        if (r2 == 18761) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0097, code lost:
        if (r2 == 19789) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x009a, code lost:
        r3 = java.nio.ByteOrder.LITTLE_ENDIAN;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x009d, code lost:
        android.util.Log.isLoggable("DfltImageHeaderParser", 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a0, code lost:
        r9.order(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ab, code lost:
        if ((r9.remaining() - 10) < 4) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ad, code lost:
        r1 = r9.getInt(10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00b1, code lost:
        r6 = r1 + 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00b8, code lost:
        if ((r9.remaining() - r6) < 2) goto L_0x012f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ba, code lost:
        r5 = r9.getShort(r6);
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c0, code lost:
        r1 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00c2, code lost:
        if (r4 >= r5) goto L_0x012f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00c4, code lost:
        r2 = (r6 + 2) + (r4 * 12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ce, code lost:
        if ((r9.remaining() - r2) < 2) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d6, code lost:
        if (r9.getShort(r2) != 274) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00d8, code lost:
        r3 = r2 + 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00df, code lost:
        if ((r9.remaining() - r3) < 2) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00e1, code lost:
        r15 = r9.getShort(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00e6, code lost:
        if (r15 < 1) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00ea, code lost:
        if (r15 > 12) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00ec, code lost:
        r3 = r2 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00f3, code lost:
        if ((r9.remaining() - r3) < 4) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00f5, code lost:
        r3 = r9.getInt(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00f9, code lost:
        if (r3 < 0) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00fb, code lost:
        android.util.Log.isLoggable("DfltImageHeaderParser", 3);
        r3 = r3 + A01[r15];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0103, code lost:
        if (r3 > 4) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0105, code lost:
        r2 = r2 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0107, code lost:
        if (r2 < 0) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x010d, code lost:
        if (r2 > r9.remaining()) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x010f, code lost:
        if (r3 < 0) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0116, code lost:
        if ((r3 + r2) > r9.remaining()) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r2 == 18761) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x011d, code lost:
        if ((r9.remaining() - r2) < 2) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x011f, code lost:
        r0 = r9.getShort(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0124, code lost:
        android.util.Log.isLoggable("DfltImageHeaderParser", 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0127, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x012a, code lost:
        r0 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x012c, code lost:
        android.util.Log.isLoggable("DfltImageHeaderParser", 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        r12.A05(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0132, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int A00(X.ST0 r17, X.C13798ThH r18) {
        /*
            r16 = this;
            r11 = -1
            r5 = r18
            int r2 = r5.CAy()     // Catch:{ RCT -> 0x0138 }
            r1 = 65496(0xffd8, float:9.178E-41)
            r0 = r2 & r1
            if (r0 == r1) goto L_0x0017
            r0 = 19789(0x4d4d, float:2.773E-41)
            if (r2 == r0) goto L_0x0017
            r1 = 18761(0x4949, float:2.629E-41)
            r0 = 0
            if (r2 != r1) goto L_0x0018
        L_0x0017:
            r0 = 1
        L_0x0018:
            r14 = 3
            java.lang.String r13 = "DfltImageHeaderParser"
            if (r0 != 0) goto L_0x001e
            goto L_0x0048
        L_0x001e:
            short r1 = r5.CAz()     // Catch:{ RCT -> 0x0138 }
            r0 = 255(0xff, float:3.57E-43)
            if (r1 != r0) goto L_0x0045
            short r1 = r5.CAz()     // Catch:{ RCT -> 0x0138 }
            r0 = 218(0xda, float:3.05E-43)
            if (r1 == r0) goto L_0x0048
            r0 = 217(0xd9, float:3.04E-43)
            if (r1 == r0) goto L_0x0045
            int r0 = r5.CAy()     // Catch:{ RCT -> 0x0138 }
            int r6 = r0 + -2
            r0 = 225(0xe1, float:3.15E-43)
            if (r1 == r0) goto L_0x004c
            long r1 = (long) r6     // Catch:{ RCT -> 0x0138 }
            long r3 = r5.skip(r1)     // Catch:{ RCT -> 0x0138 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x001e
        L_0x0045:
            android.util.Log.isLoggable(r13, r14)     // Catch:{ RCT -> 0x0138 }
        L_0x0048:
            android.util.Log.isLoggable(r13, r14)     // Catch:{ RCT -> 0x0138 }
            goto L_0x004f
        L_0x004c:
            if (r6 == r11) goto L_0x0048
            goto L_0x0050
        L_0x004f:
            return r11
        L_0x0050:
            java.lang.Class<byte[]> r0 = byte[].class
            r12 = r17
            java.lang.Object r10 = r12.A04(r6, r0)     // Catch:{ RCT -> 0x0138 }
            byte[] r10 = (byte[]) r10     // Catch:{ RCT -> 0x0138 }
            int r1 = r5.E6A(r10, r6)     // Catch:{ all -> 0x0133 }
            r0 = -1
            if (r1 != r6) goto L_0x012c
            if (r10 == 0) goto L_0x012c
            byte[] r5 = A00     // Catch:{ all -> 0x0133 }
            int r4 = r5.length     // Catch:{ all -> 0x0133 }
            if (r6 <= r4) goto L_0x012c
            r3 = 0
        L_0x0069:
            if (r3 >= r4) goto L_0x0074
            byte r2 = r10[r3]     // Catch:{ all -> 0x0133 }
            byte r1 = r5[r3]     // Catch:{ all -> 0x0133 }
            if (r2 != r1) goto L_0x012c
            int r3 = r3 + 1
            goto L_0x0069
        L_0x0074:
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r10)     // Catch:{ all -> 0x0133 }
            java.nio.ByteOrder r3 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ all -> 0x0133 }
            java.nio.ByteBuffer r1 = r1.order(r3)     // Catch:{ all -> 0x0133 }
            java.nio.Buffer r9 = r1.limit(r6)     // Catch:{ all -> 0x0133 }
            java.nio.ByteBuffer r9 = (java.nio.ByteBuffer) r9     // Catch:{ all -> 0x0133 }
            r2 = 6
            r8 = 2
            int r1 = r9.remaining()     // Catch:{ all -> 0x0133 }
            int r1 = r1 - r2
            if (r1 < r8) goto L_0x009d
            short r2 = r9.getShort(r2)     // Catch:{ all -> 0x0133 }
            r1 = 18761(0x4949, float:2.629E-41)
            if (r2 == r1) goto L_0x009a
            r1 = 19789(0x4d4d, float:2.773E-41)
            if (r2 == r1) goto L_0x00a0
            goto L_0x009d
        L_0x009a:
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ all -> 0x0133 }
            goto L_0x00a0
        L_0x009d:
            android.util.Log.isLoggable(r13, r14)     // Catch:{ all -> 0x0133 }
        L_0x00a0:
            r9.order(r3)     // Catch:{ all -> 0x0133 }
            r2 = 10
            r7 = 4
            int r1 = r9.remaining()     // Catch:{ all -> 0x0133 }
            int r1 = r1 - r2
            if (r1 < r7) goto L_0x00c0
            int r1 = r9.getInt(r2)     // Catch:{ all -> 0x0133 }
        L_0x00b1:
            int r6 = r1 + 6
            int r1 = r9.remaining()     // Catch:{ all -> 0x0133 }
            int r1 = r1 - r6
            if (r1 < r8) goto L_0x012f
            short r5 = r9.getShort(r6)     // Catch:{ all -> 0x0133 }
            r4 = 0
            goto L_0x00c2
        L_0x00c0:
            r1 = -1
            goto L_0x00b1
        L_0x00c2:
            if (r4 >= r5) goto L_0x012f
            int r2 = r6 + 2
            int r1 = r4 * 12
            int r2 = r2 + r1
            int r1 = r9.remaining()     // Catch:{ all -> 0x0133 }
            int r1 = r1 - r2
            if (r1 < r8) goto L_0x0127
            short r3 = r9.getShort(r2)     // Catch:{ all -> 0x0133 }
            r1 = 274(0x112, float:3.84E-43)
            if (r3 != r1) goto L_0x0127
            int r3 = r2 + 2
            int r1 = r9.remaining()     // Catch:{ all -> 0x0133 }
            int r1 = r1 - r3
            if (r1 < r8) goto L_0x0124
            short r15 = r9.getShort(r3)     // Catch:{ all -> 0x0133 }
            r1 = 1
            if (r15 < r1) goto L_0x0124
            r1 = 12
            if (r15 > r1) goto L_0x0124
            int r3 = r2 + 4
            int r1 = r9.remaining()     // Catch:{ all -> 0x0133 }
            int r1 = r1 - r3
            if (r1 < r7) goto L_0x0124
            int r3 = r9.getInt(r3)     // Catch:{ all -> 0x0133 }
            if (r3 < 0) goto L_0x0124
            android.util.Log.isLoggable(r13, r14)     // Catch:{ all -> 0x0133 }
            int[] r1 = A01     // Catch:{ all -> 0x0133 }
            r1 = r1[r15]     // Catch:{ all -> 0x0133 }
            int r3 = r3 + r1
            if (r3 > r7) goto L_0x0124
            int r2 = r2 + 8
            if (r2 < 0) goto L_0x0124
            int r1 = r9.remaining()     // Catch:{ all -> 0x0133 }
            if (r2 > r1) goto L_0x0124
            if (r3 < 0) goto L_0x0124
            int r3 = r3 + r2
            int r1 = r9.remaining()     // Catch:{ all -> 0x0133 }
            if (r3 > r1) goto L_0x0124
            int r0 = r9.remaining()     // Catch:{ all -> 0x0133 }
            int r0 = r0 - r2
            if (r0 < r8) goto L_0x012a
            short r0 = r9.getShort(r2)     // Catch:{ all -> 0x0133 }
            goto L_0x012f
        L_0x0124:
            android.util.Log.isLoggable(r13, r14)     // Catch:{ all -> 0x0133 }
        L_0x0127:
            int r4 = r4 + 1
            goto L_0x00c2
        L_0x012a:
            r0 = -1
            goto L_0x012f
        L_0x012c:
            android.util.Log.isLoggable(r13, r14)     // Catch:{ all -> 0x0133 }
        L_0x012f:
            r12.A05(r10)     // Catch:{ RCT -> 0x0138 }
            return r0
        L_0x0133:
            r0 = move-exception
            r12.A05(r10)     // Catch:{ RCT -> 0x0138 }
            throw r0     // Catch:{ RCT -> 0x0138 }
        L_0x0138:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11852She.A00(X.ST0, X.ThH):int");
    }

    public static int A01(C13798ThH thH) {
        return (thH.CAy() << 16) | thH.CAy();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003b, code lost:
        return com.bumptech.glide.load.ImageHeaderParser$ImageType.PNG;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0039 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.bumptech.glide.load.ImageHeaderParser$ImageType A02(X.C13798ThH r6) {
        /*
            r5 = this;
            int r1 = r6.CAy()     // Catch:{ RCT -> 0x00d1 }
            r0 = 65496(0xffd8, float:9.178E-41)
            if (r1 != r0) goto L_0x000c
            com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = com.bumptech.glide.load.ImageHeaderParser$ImageType.JPEG     // Catch:{ RCT -> 0x00d1 }
            return r0
        L_0x000c:
            int r1 = r1 << 8
            short r0 = r6.CAz()     // Catch:{ RCT -> 0x00d1 }
            r1 = r1 | r0
            r0 = 4671814(0x474946, float:6.546606E-39)
            if (r1 != r0) goto L_0x001b
            com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = com.bumptech.glide.load.ImageHeaderParser$ImageType.GIF     // Catch:{ RCT -> 0x00d1 }
            return r0
        L_0x001b:
            int r2 = r1 << 8
            short r0 = r6.CAz()     // Catch:{ RCT -> 0x00d1 }
            r2 = r2 | r0
            r0 = -1991225785(0xffffffff89504e47, float:-2.5073895E-33)
            if (r2 != r0) goto L_0x003c
            r0 = 21
            r6.skip(r0)     // Catch:{ RCT -> 0x00d1 }
            short r1 = r6.CAz()     // Catch:{ RCT -> 0x0039 }
            r0 = 3
            if (r1 < r0) goto L_0x0036
            com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = com.bumptech.glide.load.ImageHeaderParser$ImageType.PNG_A     // Catch:{ RCT -> 0x0039 }
            return r0
        L_0x0036:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = com.bumptech.glide.load.ImageHeaderParser$ImageType.PNG     // Catch:{ RCT -> 0x0039 }
            return r0
        L_0x0039:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = com.bumptech.glide.load.ImageHeaderParser$ImageType.PNG     // Catch:{ RCT -> 0x00d1 }
            return r0
        L_0x003c:
            r0 = 1380533830(0x52494646, float:2.16116855E11)
            if (r2 == r0) goto L_0x007c
            int r1 = A01(r6)     // Catch:{ RCT -> 0x00d1 }
            r0 = 1718909296(0x66747970, float:2.8862439E23)
            if (r1 != r0) goto L_0x0079
            int r0 = A01(r6)     // Catch:{ RCT -> 0x00d1 }
            r4 = 1635150182(0x61766966, float:2.8409336E20)
            if (r0 == r4) goto L_0x0076
            r3 = 1635150195(0x61766973, float:2.8409359E20)
            if (r0 == r3) goto L_0x0076
            r0 = 4
            r6.skip(r0)     // Catch:{ RCT -> 0x00d1 }
            int r2 = r2 + -16
            int r0 = r2 % 4
            if (r0 != 0) goto L_0x0079
            r1 = 0
        L_0x0064:
            if (r2 <= 0) goto L_0x0079
            int r0 = A01(r6)     // Catch:{ RCT -> 0x00d1 }
            if (r0 == r4) goto L_0x0076
            if (r0 == r3) goto L_0x0076
            int r1 = r1 + 1
            int r2 = r2 + -4
            r0 = 5
            if (r1 >= r0) goto L_0x0079
            goto L_0x0064
        L_0x0076:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = com.bumptech.glide.load.ImageHeaderParser$ImageType.AVIF     // Catch:{ RCT -> 0x00d1 }
            return r0
        L_0x0079:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN     // Catch:{ RCT -> 0x00d1 }
            return r0
        L_0x007c:
            r2 = 4
            r6.skip(r2)     // Catch:{ RCT -> 0x00d1 }
            int r1 = A01(r6)     // Catch:{ RCT -> 0x00d1 }
            r0 = 1464156752(0x57454250, float:2.16888601E14)
            if (r1 == r0) goto L_0x008d
            com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN     // Catch:{ RCT -> 0x00d1 }
            return r0
        L_0x008d:
            int r4 = A01(r6)     // Catch:{ RCT -> 0x00d1 }
            r1 = r4 & -256(0xffffffffffffff00, float:NaN)
            r0 = 1448097792(0x56503800, float:5.7234734E13)
            if (r1 == r0) goto L_0x009b
            com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN     // Catch:{ RCT -> 0x00d1 }
            return r0
        L_0x009b:
            r1 = r4 & 255(0xff, float:3.57E-43)
            r0 = 88
            if (r1 != r0) goto L_0x00b9
            r6.skip(r2)     // Catch:{ RCT -> 0x00d1 }
            short r1 = r6.CAz()     // Catch:{ RCT -> 0x00d1 }
            r0 = r1 & 2
            if (r0 == 0) goto L_0x00af
            com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = com.bumptech.glide.load.ImageHeaderParser$ImageType.ANIMATED_WEBP     // Catch:{ RCT -> 0x00d1 }
            return r0
        L_0x00af:
            r0 = r1 & 16
            if (r0 == 0) goto L_0x00b6
            com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = com.bumptech.glide.load.ImageHeaderParser$ImageType.WEBP_A     // Catch:{ RCT -> 0x00d1 }
            return r0
        L_0x00b6:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = com.bumptech.glide.load.ImageHeaderParser$ImageType.WEBP     // Catch:{ RCT -> 0x00d1 }
            return r0
        L_0x00b9:
            r0 = 76
            if (r1 != r0) goto L_0x00ce
            r6.skip(r2)     // Catch:{ RCT -> 0x00d1 }
            short r0 = r6.CAz()     // Catch:{ RCT -> 0x00d1 }
            r0 = r0 & 8
            if (r0 == 0) goto L_0x00cb
            com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = com.bumptech.glide.load.ImageHeaderParser$ImageType.WEBP_A     // Catch:{ RCT -> 0x00d1 }
            return r0
        L_0x00cb:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = com.bumptech.glide.load.ImageHeaderParser$ImageType.WEBP     // Catch:{ RCT -> 0x00d1 }
            return r0
        L_0x00ce:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = com.bumptech.glide.load.ImageHeaderParser$ImageType.WEBP     // Catch:{ RCT -> 0x00d1 }
            return r0
        L_0x00d1:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11852She.A02(X.ThH):com.bumptech.glide.load.ImageHeaderParser$ImageType");
    }

    public final int BYu(ST0 st0, InputStream inputStream) {
        C9217RTu.A00(inputStream);
        C11966Sjh sjh = new C11966Sjh(inputStream);
        C9217RTu.A00(st0);
        return A00(st0, sjh);
    }

    public final int BYv(ST0 st0, ByteBuffer byteBuffer) {
        C9217RTu.A00(byteBuffer);
        C11965Sjg sjg = new C11965Sjg(byteBuffer);
        C9217RTu.A00(st0);
        return A00(st0, sjg);
    }

    public final ImageHeaderParser$ImageType CAC(InputStream inputStream) {
        C9217RTu.A00(inputStream);
        return A02(new C11966Sjh(inputStream));
    }

    public final ImageHeaderParser$ImageType CAD(ByteBuffer byteBuffer) {
        C9217RTu.A00(byteBuffer);
        return A02(new C11965Sjg(byteBuffer));
    }
}
