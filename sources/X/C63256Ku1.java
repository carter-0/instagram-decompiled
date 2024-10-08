package X;

/* renamed from: X.Ku1  reason: case insensitive filesystem */
public abstract class C63256Ku1 {
    /* JADX WARNING: type inference failed for: r3v27, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture, X.1K2] */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0302, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:?, code lost:
        X.1zE.A00(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0306, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0309, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:?, code lost:
        X.1zE.A00(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x03d7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:?, code lost:
        X.1zE.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x03db, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x03de, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:?, code lost:
        X.1zE.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x03ea, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:?, code lost:
        X.1zE.A00(r12, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x03ee, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x03f1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:?, code lost:
        X.1zE.A00(r15, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x03f5, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x03ff, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:?, code lost:
        X.1zE.A00(r25, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x040b, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x040c, code lost:
        X.1zE.A00(r14, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x015a, code lost:
        if ("-".equals(r13) != false) goto L_0x015c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01b2, code lost:
        if (r31 != -1) goto L_0x01b4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0212 A[Catch:{ IOException -> 0x0251, TimeoutException -> 0x0247, all -> 0x0410 }] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0254 A[SYNTHETIC, Splitter:B:118:0x0254] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01be A[Catch:{ all -> 0x03ff }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C352218Cl A00(android.content.Context r36, android.net.Uri r37, com.instagram.common.session.UserSession r38) {
        /*
            r0 = 0
            r8 = r37
            r7 = r38
            boolean r2 = X.AnonymousClass7TF.A1U(r0, r8, r7)
            android.net.Uri r1 = android.net.Uri.EMPTY
            if (r8 == r1) goto L_0x0422
            r29 = r36
            java.io.File r4 = r29.getCacheDir()
            java.lang.String r3 = "direct_share_content_"
            java.lang.String r1 = ".jpg"
            java.io.File r26 = java.io.File.createTempFile(r3, r1, r4)
            java.nio.ByteBuffer r1 = X.C63561KzA.A01     // Catch:{ all -> 0x0410 }
            android.graphics.BitmapFactory$Options r5 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x0410 }
            r5.<init>()     // Catch:{ all -> 0x0410 }
            android.content.ContentResolver r1 = r29.getContentResolver()     // Catch:{ all -> 0x0410 }
            java.lang.String r6 = "r"
            android.content.res.AssetFileDescriptor r25 = r1.openAssetFileDescriptor(r8, r6)     // Catch:{ all -> 0x0410 }
            java.lang.String r24 = "Required value was null."
            if (r25 == 0) goto L_0x0406
            java.io.FileDescriptor r3 = r25.getFileDescriptor()     // Catch:{ all -> 0x03fd }
            X.0qQ.A0A(r3)     // Catch:{ all -> 0x03fd }
            r5.inJustDecodeBounds = r2     // Catch:{ all -> 0x03fd }
            r23 = 0
            r1 = r23
            android.graphics.BitmapFactory.decodeFileDescriptor(r3, r1, r5)     // Catch:{ all -> 0x03fd }
            int r4 = r5.outWidth     // Catch:{ all -> 0x03fd }
            int r1 = r5.outHeight     // Catch:{ all -> 0x03fd }
            android.graphics.Point r3 = new android.graphics.Point     // Catch:{ all -> 0x03fd }
            r3.<init>(r4, r1)     // Catch:{ all -> 0x03fd }
            int r1 = r3.x     // Catch:{ all -> 0x03fd }
            r27 = r1
            int r1 = r3.y     // Catch:{ all -> 0x03fd }
            r28 = r1
            java.text.SimpleDateFormat r1 = X.C227922kK.A0K     // Catch:{ all -> 0x03fd }
            java.io.FileInputStream r1 = r25.createInputStream()     // Catch:{ all -> 0x03fd }
            X.2kK r10 = new X.2kK     // Catch:{ all -> 0x03fd }
            r10.<init>((java.io.InputStream) r1)     // Catch:{ all -> 0x03fd }
            android.graphics.Matrix r1 = X.AnonymousClass7TE.A0U()     // Catch:{ all -> 0x03fd }
            java.lang.String r3 = "Orientation"
            int r13 = r10.A0M(r3, r0)     // Catch:{ all -> 0x03fd }
            r12 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r11 = 1119092736(0x42b40000, float:90.0)
            r9 = 1127481344(0x43340000, float:180.0)
            r4 = 1065353216(0x3f800000, float:1.0)
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            switch(r13) {
                case 2: goto L_0x008b;
                case 3: goto L_0x008f;
                case 4: goto L_0x0093;
                case 5: goto L_0x0097;
                case 6: goto L_0x009b;
                case 7: goto L_0x009f;
                case 8: goto L_0x00a6;
                default: goto L_0x0073;
            }     // Catch:{ all -> 0x03fd }
        L_0x0073:
            r3 = 2283(0x8eb, float:3.199E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)     // Catch:{ all -> 0x03fd }
            java.lang.String r4 = r10.A0N(r3)     // Catch:{ all -> 0x03fd }
            r3 = 2285(0x8ed, float:3.202E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)     // Catch:{ all -> 0x03fd }
            java.lang.String r9 = r10.A0N(r3)     // Catch:{ all -> 0x03fd }
            r12 = 0
            if (r4 == 0) goto L_0x00e7
            goto L_0x00aa
        L_0x008b:
            r1.setScale(r3, r4)     // Catch:{ all -> 0x03fd }
            goto L_0x0073
        L_0x008f:
            r1.setRotate(r9)     // Catch:{ all -> 0x03fd }
            goto L_0x0073
        L_0x0093:
            r1.setRotate(r9)     // Catch:{ all -> 0x03fd }
            goto L_0x00a2
        L_0x0097:
            r1.setRotate(r11)     // Catch:{ all -> 0x03fd }
            goto L_0x00a2
        L_0x009b:
            r1.setRotate(r11)     // Catch:{ all -> 0x03fd }
            goto L_0x0073
        L_0x009f:
            r1.setRotate(r12)     // Catch:{ all -> 0x03fd }
        L_0x00a2:
            r1.postScale(r3, r4)     // Catch:{ all -> 0x03fd }
            goto L_0x0073
        L_0x00a6:
            r1.setRotate(r12)     // Catch:{ all -> 0x03fd }
            goto L_0x0073
        L_0x00aa:
            if (r9 == 0) goto L_0x00e7
            java.util.regex.Pattern r11 = X.C227922kK.A0M     // Catch:{ all -> 0x03fd }
            java.util.regex.Matcher r3 = r11.matcher(r4)     // Catch:{ all -> 0x03fd }
            boolean r3 = r3.matches()     // Catch:{ all -> 0x03fd }
            if (r3 != 0) goto L_0x00c3
            java.util.regex.Matcher r3 = r11.matcher(r9)     // Catch:{ all -> 0x03fd }
            boolean r3 = r3.matches()     // Catch:{ all -> 0x03fd }
            if (r3 != 0) goto L_0x00c3
            goto L_0x00e7
        L_0x00c3:
            r3 = 32
            java.lang.String r9 = X.002.A0T(r4, r9, r3)     // Catch:{ all -> 0x03fd }
            java.text.ParsePosition r4 = new java.text.ParsePosition     // Catch:{ all -> 0x03fd }
            r4.<init>(r0)     // Catch:{ all -> 0x03fd }
            java.text.SimpleDateFormat r3 = X.C227922kK.A0J     // Catch:{ IllegalArgumentException -> 0x00e7 }
            java.util.Date r3 = r3.parse(r9, r4)     // Catch:{ IllegalArgumentException -> 0x00e7 }
            if (r3 != 0) goto L_0x00df
            java.text.SimpleDateFormat r3 = X.C227922kK.A0K     // Catch:{ IllegalArgumentException -> 0x00e7 }
            java.util.Date r3 = r3.parse(r9, r4)     // Catch:{ IllegalArgumentException -> 0x00e7 }
            if (r3 != 0) goto L_0x00df
            goto L_0x00e7
        L_0x00df:
            long r3 = r3.getTime()     // Catch:{ IllegalArgumentException -> 0x00e7 }
            java.lang.Long r12 = java.lang.Long.valueOf(r3)     // Catch:{ IllegalArgumentException -> 0x00e7 }
        L_0x00e7:
            r21 = -1
            if (r12 == 0) goto L_0x00f5
            long r31 = r12.longValue()     // Catch:{ all -> 0x03fd }
            int r3 = (r31 > r21 ? 1 : (r31 == r21 ? 0 : -1))
            if (r3 == 0) goto L_0x00f5
            goto L_0x01b4
        L_0x00f5:
            java.lang.String r3 = "DateTime"
            java.lang.String r9 = r10.A0N(r3)     // Catch:{ all -> 0x03fd }
            java.lang.String r3 = "SubSecTime"
            java.lang.String r12 = r10.A0N(r3)     // Catch:{ all -> 0x03fd }
            java.lang.String r3 = "OffsetTime"
            java.lang.String r14 = r10.A0N(r3)     // Catch:{ all -> 0x03fd }
            r20 = 0
            if (r9 == 0) goto L_0x01a7
            java.util.regex.Pattern r3 = X.C227922kK.A0M     // Catch:{ all -> 0x03fd }
            java.util.regex.Matcher r3 = r3.matcher(r9)     // Catch:{ all -> 0x03fd }
            boolean r3 = r3.matches()     // Catch:{ all -> 0x03fd }
            if (r3 == 0) goto L_0x01a7
            java.text.ParsePosition r4 = new java.text.ParsePosition     // Catch:{ all -> 0x03fd }
            r4.<init>(r0)     // Catch:{ all -> 0x03fd }
            java.text.SimpleDateFormat r3 = X.C227922kK.A0J     // Catch:{ IllegalArgumentException -> 0x01a4 }
            java.util.Date r3 = r3.parse(r9, r4)     // Catch:{ IllegalArgumentException -> 0x01a4 }
            if (r3 != 0) goto L_0x012d
            java.text.SimpleDateFormat r3 = X.C227922kK.A0K     // Catch:{ IllegalArgumentException -> 0x01a4 }
            java.util.Date r3 = r3.parse(r9, r4)     // Catch:{ IllegalArgumentException -> 0x01a4 }
            if (r3 != 0) goto L_0x012d
            goto L_0x01a7
        L_0x012d:
            long r18 = r3.getTime()     // Catch:{ IllegalArgumentException -> 0x01a4 }
            if (r14 == 0) goto L_0x0181
            r17 = 1
            java.lang.String r13 = r14.substring(r0, r2)     // Catch:{ IllegalArgumentException -> 0x01a4 }
            r11 = 3
            java.lang.String r3 = r14.substring(r2, r11)     // Catch:{ IllegalArgumentException -> 0x01a4 }
            int r9 = java.lang.Integer.parseInt(r3)     // Catch:{ IllegalArgumentException -> 0x01a4 }
            r3 = 6
            r4 = 4
            java.lang.String r3 = r14.substring(r4, r3)     // Catch:{ IllegalArgumentException -> 0x01a4 }
            int r16 = java.lang.Integer.parseInt(r3)     // Catch:{ IllegalArgumentException -> 0x01a4 }
            java.lang.String r3 = "+"
            boolean r15 = r3.equals(r13)     // Catch:{ IllegalArgumentException -> 0x01a4 }
            java.lang.String r3 = "-"
            if (r15 != 0) goto L_0x015c
            boolean r15 = r3.equals(r13)     // Catch:{ IllegalArgumentException -> 0x01a4 }
            if (r15 == 0) goto L_0x0181
        L_0x015c:
            java.lang.String r15 = ":"
            java.lang.String r4 = r14.substring(r11, r4)     // Catch:{ IllegalArgumentException -> 0x01a4 }
            boolean r4 = r15.equals(r4)     // Catch:{ IllegalArgumentException -> 0x01a4 }
            if (r4 == 0) goto L_0x0181
            r4 = 14
            if (r9 > r4) goto L_0x0181
            int r4 = r9 * 60
            int r4 = r4 + r16
            int r4 = r4 * 60
            int r4 = r4 * 1000
            boolean r3 = r3.equals(r13)     // Catch:{ IllegalArgumentException -> 0x01a4 }
            if (r3 != 0) goto L_0x017c
            r17 = -1
        L_0x017c:
            int r4 = r4 * r17
            long r3 = (long) r4     // Catch:{ IllegalArgumentException -> 0x01a4 }
            long r18 = r18 + r3
        L_0x0181:
            if (r12 == 0) goto L_0x01a0
            int r3 = r12.length()     // Catch:{ NumberFormatException -> 0x019c }
            r13 = 3
            int r9 = java.lang.Math.min(r3, r13)     // Catch:{ NumberFormatException -> 0x019c }
            java.lang.String r3 = r12.substring(r0, r9)     // Catch:{ NumberFormatException -> 0x019c }
            long r11 = java.lang.Long.parseLong(r3)     // Catch:{ NumberFormatException -> 0x019c }
        L_0x0194:
            if (r9 >= r13) goto L_0x019e
            r3 = 10
            long r11 = r11 * r3
            int r9 = r9 + 1
            goto L_0x0194
        L_0x019c:
            r11 = 0
        L_0x019e:
            long r18 = r18 + r11
        L_0x01a0:
            java.lang.Long r20 = java.lang.Long.valueOf(r18)     // Catch:{ IllegalArgumentException -> 0x01a4 }
        L_0x01a4:
            if (r20 == 0) goto L_0x01a7
            goto L_0x01ac
        L_0x01a7:
            long r31 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x03fd }
            goto L_0x01b4
        L_0x01ac:
            long r31 = r20.longValue()     // Catch:{ all -> 0x03fd }
            int r3 = (r31 > r21 ? 1 : (r31 == r21 ? 0 : -1))
            if (r3 == 0) goto L_0x01a7
        L_0x01b4:
            java.lang.String r13 = ""
            java.lang.String r3 = "Model"
            java.lang.String r12 = r10.A0N(r3)     // Catch:{ all -> 0x03fd }
            if (r12 == 0) goto L_0x0202
            java.lang.String r3 = "Hammerhead"
            boolean r3 = X.00l.A0d(r12, r3, r0)     // Catch:{ all -> 0x03fd }
            java.lang.String r11 = "com.facebook.stella"
            java.lang.String r10 = "com.facebook.hammerhead"
            if (r3 == r2) goto L_0x0201
            java.lang.String r3 = "Ray-Ban | Meta"
            boolean r3 = X.00l.A0d(r12, r3, r0)     // Catch:{ all -> 0x03fd }
            if (r3 == r2) goto L_0x0201
            boolean r3 = X.00l.A0d(r12, r10, r0)     // Catch:{ all -> 0x03fd }
            if (r3 == r2) goto L_0x0201
            X.0Tu r9 = X.0Tu.A05     // Catch:{ all -> 0x03fd }
            r3 = 36880652242583895(0x8306c200010157, double:3.386811212452122E-306)
            java.lang.String r3 = X.182.A04(r9, r7, r3)     // Catch:{ all -> 0x03fd }
            boolean r3 = X.00l.A0d(r12, r3, r0)     // Catch:{ all -> 0x03fd }
            if (r3 == r2) goto L_0x0201
            java.lang.String r3 = "Ray-Ban Stories"
            boolean r3 = X.00l.A0d(r12, r3, r0)     // Catch:{ all -> 0x03fd }
            if (r3 == r2) goto L_0x01ff
            java.lang.String r3 = "Facebook View"
            boolean r3 = X.00l.A0d(r12, r3, r0)     // Catch:{ all -> 0x03fd }
            if (r3 == r2) goto L_0x01ff
            boolean r3 = X.00l.A0d(r12, r11, r0)     // Catch:{ all -> 0x03fd }
            if (r3 != r2) goto L_0x0202
        L_0x01ff:
            r13 = r11
            goto L_0x0202
        L_0x0201:
            r13 = r10
        L_0x0202:
            r25.close()     // Catch:{ all -> 0x0410 }
            X.0Tu r9 = X.0Tu.A05     // Catch:{ all -> 0x0410 }
            r3 = 2342168992199947706(0x20810e4a000335ba, double:4.0706589450580835E-152)
            boolean r3 = X.182.A06(r9, r7, r3)     // Catch:{ all -> 0x0410 }
            if (r3 == 0) goto L_0x0254
            java.lang.String r0 = "preparePhotoSync should be called on a background thread"
            X.11Z.A05(r0)     // Catch:{ all -> 0x0410 }
            com.google.common.util.concurrent.SettableFuture r3 = new com.google.common.util.concurrent.SettableFuture     // Catch:{ all -> 0x0410 }
            r3.<init>()     // Catch:{ all -> 0x0410 }
            android.content.ContentResolver r0 = X.JTP.A0B(r29)     // Catch:{ all -> 0x0410 }
            X.RBa r2 = new X.RBa     // Catch:{ all -> 0x0410 }
            r2.<init>(r0, r8)     // Catch:{ all -> 0x0410 }
            X.M0B r1 = new X.M0B     // Catch:{ all -> 0x0410 }
            r1.<init>(r3)     // Catch:{ all -> 0x0410 }
            r0 = r29
            X.C39908AIz.A05(r0, r7, r2, r1)     // Catch:{ all -> 0x0410 }
            r0 = 36607457963021895(0x820e4a00041647, double:3.214042049992047E-306)
            long r1 = X.182.A01(r9, r7, r0)     // Catch:{ IOException -> 0x0251, TimeoutException -> 0x0247 }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ IOException -> 0x0251, TimeoutException -> 0x0247 }
            java.lang.Object r2 = r3.get(r1, r0)     // Catch:{ IOException -> 0x0251, TimeoutException -> 0x0247 }
            X.8Cl r2 = (X.C352218Cl) r2     // Catch:{ IOException -> 0x0251, TimeoutException -> 0x0247 }
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r2.A01()     // Catch:{ all -> 0x0410 }
            r0.A03 = r13     // Catch:{ all -> 0x0410 }
            return r2
        L_0x0247:
            r1 = move-exception
            java.lang.String r0 = "Timeout while preparing photo"
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x0410 }
            r2.<init>(r0, r1)     // Catch:{ all -> 0x0410 }
            goto L_0x040f
        L_0x0251:
            r2 = move-exception
            goto L_0x040f
        L_0x0254:
            android.content.ContentResolver r3 = r29.getContentResolver()     // Catch:{ all -> 0x0410 }
            android.content.res.AssetFileDescriptor r14 = r3.openAssetFileDescriptor(r8, r6)     // Catch:{ all -> 0x0410 }
            if (r14 == 0) goto L_0x03f8
            java.io.FileInputStream r15 = r14.createInputStream()     // Catch:{ all -> 0x03f6 }
            java.io.FileOutputStream r12 = X.JTO.A0t(r26)     // Catch:{ all -> 0x03ef }
            android.content.ContentResolver r3 = r29.getContentResolver()     // Catch:{ all -> 0x03e8 }
            android.content.res.AssetFileDescriptor r4 = r3.openAssetFileDescriptor(r8, r6)     // Catch:{ all -> 0x03e8 }
            if (r4 == 0) goto L_0x03e3
            java.io.FileInputStream r3 = r4.createInputStream()     // Catch:{ all -> 0x03dc }
            java.nio.channels.FileChannel r3 = r3.getChannel()     // Catch:{ all -> 0x03dc }
            long r35 = r3.size()     // Catch:{ all -> 0x03d5 }
            r7 = 4
            r10 = 0
            int r6 = (r35 > r7 ? 1 : (r35 == r7 ? 0 : -1))
            if (r6 < 0) goto L_0x02b2
            java.nio.channels.FileChannel$MapMode r17 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x03d5 }
            r18 = 0
            r20 = 2
            r16 = r3
            java.nio.MappedByteBuffer r6 = r16.map(r17, r18, r20)     // Catch:{ all -> 0x03d5 }
            long r35 = r35 - r20
            r33 = r3
            r34 = r17
            r37 = r20
            java.nio.MappedByteBuffer r9 = r33.map(r34, r35, r37)     // Catch:{ all -> 0x03d5 }
            java.nio.ByteBuffer r8 = X.C63561KzA.A00     // Catch:{ all -> 0x03d5 }
            r8.position(r0)     // Catch:{ all -> 0x03d5 }
            java.nio.ByteBuffer r7 = X.C63561KzA.A01     // Catch:{ all -> 0x03d5 }
            r7.position(r0)     // Catch:{ all -> 0x03d5 }
            boolean r6 = X.0qQ.A0K(r6, r8)     // Catch:{ all -> 0x03d5 }
            if (r6 == 0) goto L_0x02b2
            boolean r6 = X.0qQ.A0K(r9, r7)     // Catch:{ all -> 0x03d5 }
            if (r6 == 0) goto L_0x02b2
            r10 = 1
        L_0x02b2:
            r3.close()     // Catch:{ all -> 0x03dc }
            r4.close()     // Catch:{ all -> 0x03e8 }
            if (r10 == 0) goto L_0x030f
            boolean r3 = r1.isIdentity()     // Catch:{ all -> 0x03e8 }
            if (r3 == 0) goto L_0x030f
            java.nio.channels.FileChannel r6 = r15.getChannel()     // Catch:{ all -> 0x03e8 }
            java.nio.channels.FileChannel r1 = r12.getChannel()     // Catch:{ all -> 0x0307 }
            X.0qQ.A0A(r6)     // Catch:{ all -> 0x0300 }
            long r4 = r14.getLength()     // Catch:{ all -> 0x0300 }
            X.0qQ.A0A(r1)     // Catch:{ all -> 0x0300 }
            r7 = 0
        L_0x02d4:
            int r2 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x02e1
            long r9 = r4 - r7
            r11 = r1
            long r2 = r6.transferTo(r7, r9, r11)     // Catch:{ all -> 0x0300 }
            long r7 = r7 + r2
            goto L_0x02d4
        L_0x02e1:
            long r29 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0300 }
            X.8Cl r2 = new X.8Cl     // Catch:{ all -> 0x0300 }
            r25 = r2
            r33 = r0
            r25.<init>(r26, r27, r28, r29, r31, r33)     // Catch:{ all -> 0x0300 }
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r2.A01()     // Catch:{ all -> 0x0300 }
            r0.A03 = r13     // Catch:{ all -> 0x0300 }
            if (r1 == 0) goto L_0x02f9
            r1.close()     // Catch:{ all -> 0x0307 }
        L_0x02f9:
            if (r6 == 0) goto L_0x03aa
            r6.close()     // Catch:{ all -> 0x03e8 }
            goto L_0x03aa
        L_0x0300:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0302 }
        L_0x0302:
            r0 = move-exception
            X.1zE.A00(r1, r2)     // Catch:{ all -> 0x0307 }
            throw r0     // Catch:{ all -> 0x0307 }
        L_0x0307:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0309 }
        L_0x0309:
            r2 = move-exception
            X.1zE.A00(r6, r0)     // Catch:{ all -> 0x03e8 }
            goto L_0x03d4
        L_0x030f:
            java.io.FileDescriptor r11 = r15.getFD()     // Catch:{ all -> 0x03e8 }
            X.0qQ.A07(r11)     // Catch:{ all -> 0x03e8 }
            r5.inJustDecodeBounds = r0     // Catch:{ all -> 0x03e8 }
            r5.inPreferQualityOverSpeed = r2     // Catch:{ all -> 0x03e8 }
            r10 = r23
            r9 = r10
            r16 = r10
            r8 = 0
        L_0x0320:
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r3 = (double) r8     // Catch:{ all -> 0x03e8 }
            double r3 = java.lang.Math.pow(r6, r3)     // Catch:{ all -> 0x03e8 }
            int r6 = (int) r3     // Catch:{ all -> 0x03e8 }
            r5.inSampleSize = r6     // Catch:{ all -> 0x03e8 }
            r3 = 256(0x100, float:3.59E-43)
            if (r6 >= r3) goto L_0x03c4
            int r4 = r5.outWidth     // Catch:{ all -> 0x03e8 }
            int r4 = r4 / r6
            int r3 = r5.outHeight     // Catch:{ all -> 0x03e8 }
            int r3 = r3 / r6
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x0347 }
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r4, r3, r6)     // Catch:{ all -> 0x0347 }
            if (r9 == 0) goto L_0x0357
            boolean r7 = r1.isIdentity()     // Catch:{ all -> 0x0347 }
            if (r7 != 0) goto L_0x034a
            android.graphics.Bitmap r16 = android.graphics.Bitmap.createBitmap(r4, r3, r6)     // Catch:{ all -> 0x0347 }
            goto L_0x034a
        L_0x0347:
            r10 = move-exception
            if (r9 == 0) goto L_0x0357
        L_0x034a:
            boolean r3 = r1.isIdentity()     // Catch:{ all -> 0x03e8 }
            if (r3 != 0) goto L_0x035a
            if (r16 != 0) goto L_0x035a
            r9.recycle()     // Catch:{ all -> 0x03e8 }
            r9 = r23
        L_0x0357:
            int r8 = r8 + 1
            goto L_0x0320
        L_0x035a:
            r5.inBitmap = r9     // Catch:{ all -> 0x03e8 }
            r3 = r23
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeFileDescriptor(r11, r3, r5)     // Catch:{ all -> 0x03bb }
            if (r3 == 0) goto L_0x03b4
            if (r16 == 0) goto L_0x0387
            r16.recycle()     // Catch:{ all -> 0x03cc }
            int r6 = r3.getWidth()     // Catch:{ all -> 0x03cc }
            int r7 = r3.getHeight()     // Catch:{ all -> 0x03cc }
            X.0fO.A03(r3)     // Catch:{ all -> 0x03cc }
            r4 = r0
            r5 = r0
            r8 = r1
            r9 = r2
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x03cc }
            r3.recycle()     // Catch:{ all -> 0x03e8 }
            r3 = r1
            if (r1 != 0) goto L_0x0387
            r27 = 0
            r28 = 0
            goto L_0x0397
        L_0x0387:
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x03e8 }
            X.JZK.A00(r1, r3, r12)     // Catch:{ all -> 0x03e8 }
            r3.recycle()     // Catch:{ all -> 0x03e8 }
            int r27 = r3.getWidth()     // Catch:{ all -> 0x03e8 }
            int r28 = r3.getHeight()     // Catch:{ all -> 0x03e8 }
        L_0x0397:
            long r29 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x03e8 }
            X.8Cl r2 = new X.8Cl     // Catch:{ all -> 0x03e8 }
            r25 = r2
            r33 = r0
            r25.<init>(r26, r27, r28, r29, r31, r33)     // Catch:{ all -> 0x03e8 }
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r2.A01()     // Catch:{ all -> 0x03e8 }
            r0.A03 = r13     // Catch:{ all -> 0x03e8 }
        L_0x03aa:
            r12.close()     // Catch:{ all -> 0x03ef }
            r15.close()     // Catch:{ all -> 0x03f6 }
            r14.close()     // Catch:{ all -> 0x0410 }
            return r2
        L_0x03b4:
            java.lang.String r0 = "Failed to decode the file descriptor into bitmap"
            java.io.IOException r2 = X.JTO.A0u(r0)     // Catch:{ all -> 0x03e8 }
            goto L_0x03d4
        L_0x03bb:
            r1 = move-exception
            java.lang.String r0 = "Failed to decode the file descriptor into bitmap."
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x03e8 }
            r2.<init>(r0, r1)     // Catch:{ all -> 0x03e8 }
            goto L_0x03d4
        L_0x03c4:
            java.lang.String r0 = "Failed to allocate enough memory for bitmaps"
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x03e8 }
            r2.<init>(r0, r10)     // Catch:{ all -> 0x03e8 }
            goto L_0x03d4
        L_0x03cc:
            r1 = move-exception
            java.lang.String r0 = "Failed to transform bitmap"
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x03e8 }
            r2.<init>(r0, r1)     // Catch:{ all -> 0x03e8 }
        L_0x03d4:
            throw r2     // Catch:{ all -> 0x03e8 }
        L_0x03d5:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x03d7 }
        L_0x03d7:
            r0 = move-exception
            X.1zE.A00(r3, r1)     // Catch:{ all -> 0x03dc }
            throw r0     // Catch:{ all -> 0x03dc }
        L_0x03dc:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x03de }
        L_0x03de:
            r0 = move-exception
            X.1zE.A00(r4, r1)     // Catch:{ all -> 0x03e8 }
            goto L_0x03e7
        L_0x03e3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r24)     // Catch:{ all -> 0x03e8 }
        L_0x03e7:
            throw r0     // Catch:{ all -> 0x03e8 }
        L_0x03e8:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x03ea }
        L_0x03ea:
            r0 = move-exception
            X.1zE.A00(r12, r1)     // Catch:{ all -> 0x03ef }
            throw r0     // Catch:{ all -> 0x03ef }
        L_0x03ef:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x03f1 }
        L_0x03f1:
            r0 = move-exception
            X.1zE.A00(r15, r1)     // Catch:{ all -> 0x03f6 }
            throw r0     // Catch:{ all -> 0x03f6 }
        L_0x03f6:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x040b }
        L_0x03f8:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r24)     // Catch:{ all -> 0x0410 }
            goto L_0x040f
        L_0x03fd:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x03ff }
        L_0x03ff:
            r2 = move-exception
            r0 = r25
            X.1zE.A00(r0, r1)     // Catch:{ all -> 0x0410 }
            goto L_0x040f
        L_0x0406:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r24)     // Catch:{ all -> 0x0410 }
            goto L_0x040f
        L_0x040b:
            r2 = move-exception
            X.1zE.A00(r14, r0)     // Catch:{ all -> 0x0410 }
        L_0x040f:
            throw r2     // Catch:{ all -> 0x0410 }
        L_0x0410:
            r2 = move-exception
            r26.delete()
            java.lang.String r1 = "DirectExternalMediaShareHelper io error"
            java.lang.String r0 = "DirectExternalMediaShareHelper#getPhoto failure: %s"
            java.lang.String r1 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r1)
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1, r2)
            throw r0
        L_0x0422:
            java.lang.String r0 = "Photo uri is empty"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63256Ku1.A00(android.content.Context, android.net.Uri, com.instagram.common.session.UserSession):X.8Cl");
    }
}
