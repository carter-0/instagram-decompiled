package X;

import java.util.concurrent.Callable;

/* renamed from: X.TNr  reason: case insensitive filesystem */
public final class C13159TNr implements Callable {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;

    public static SSQ A00(Object obj, String str, String str2) {
        return C11425STh.A05((Runnable) null, str2, new C13159TNr(obj, str, str2, 1));
    }

    public C13159TNr(Object obj, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
        this.A03 = str2;
    }

    /* JADX WARNING: type inference failed for: r0v86, types: [X.RSM, java.lang.Object] */
    /* JADX WARNING: Can't wrap try/catch for region: R(15:28|(3:30|d4|51)|(11:56|57|58|(2:60|(1:62))|64|65|(1:67)(2:81|(1:83))|68|(2:70|(1:72)(2:76|77))(1:80)|73|(3:75|161|(2:163|164)(1:178)))|84|86|87|88|89|(13:91|92|93|(1:95)|96|(2:120|(1:122)(6:127|156|157|(1:177)|161|(0)(0)))(3:104|(2:117|(1:119)(6:126|156|157|(0)|161|(0)(0)))(2:110|(1:112)(6:125|156|157|(0)|161|(0)(0)))|113)|114|(2:116|(1:124))|156|157|(0)|161|(0)(0))|128|129|(7:131|151|156|157|(0)|161|(0)(0))|132|133|(3:134|135|(1:137)(10:138|139|140|141|151|156|157|(0)|161|(0)(0)))) */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0341, code lost:
        if (0 == 0) goto L_0x034b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0149, code lost:
        if (r7.exists() != false) goto L_0x014b;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:128:0x02d0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:132:0x02db */
    /* JADX WARNING: Missing exception handler attribute for start block: B:140:0x031a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:145:0x0326 */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02d9 A[Catch:{ IOException -> 0x02db }] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x030e A[Catch:{ all -> 0x0322, IOException -> 0x0327 }, LOOP:0: B:134:0x0308->B:137:0x030e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0317 A[SYNTHETIC, Splitter:B:138:0x0317] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0351  */
    /* JADX WARNING: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:178:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r18 = this;
            r5 = r18
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x0359;
                case 1: goto L_0x00c5;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r3 = r5.A01
            X.L6x r3 = (X.C63791L6x) r3
            java.lang.String r4 = r5.A02
            java.lang.String r14 = r5.A03
            boolean r0 = X.JTQ.A1Z(r4)
            if (r0 == 0) goto L_0x00bf
            X.2kK r1 = new X.2kK
            r1.<init>((java.lang.String) r4)
            r13 = 1
            java.lang.String r0 = "Orientation"
            int r2 = r1.A0M(r0, r13)
            r0 = 3
            if (r2 == r0) goto L_0x0080
            r0 = 6
            if (r2 == r0) goto L_0x007d
            r1 = 8
            r0 = 270(0x10e, float:3.78E-43)
            if (r2 == r1) goto L_0x002e
            r0 = 0
        L_0x002e:
            android.graphics.Matrix r12 = X.AnonymousClass7TE.A0U()
            float r0 = (float) r0
            r12.postRotate(r0)
            android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeFile(r4)
            if (r7 == 0) goto L_0x0372
            int r10 = r7.getWidth()
            int r11 = r7.getHeight()
            r8 = 0
            X.0fO.A03(r7)
            r9 = r8
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r7, r8, r9, r10, r11, r12, r13)
            X.0qQ.A07(r2)
            int r16 = r2.getWidth()
            android.content.Context r0 = r3.A00
            java.io.File r1 = X.0mb.A04(r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x00b7
            X.1MF.A0M(r2, r1)
            r7.recycle()
            r2.recycle()
            java.lang.String r13 = X.JTQ.A0Z()
            java.lang.String r15 = X.JTP.A0t(r1)
            com.instagram.common.session.UserSession r12 = r3.A02
            java.lang.String r5 = "EverstoreUploadImageHelper"
            java.io.File r7 = X.AnonymousClass7TE.A0t(r15)
            X.C64134LPj.A02(r7)
            goto L_0x0083
        L_0x007d:
            r0 = 90
            goto L_0x002e
        L_0x0080:
            r0 = 180(0xb4, float:2.52E-43)
            goto L_0x002e
        L_0x0083:
            java.lang.String r6 = X.C9842RiE.A00(r15, r13, r8)     // Catch:{ RKf -> 0x00a4 }
            r4 = 0
            r17 = r8
            X.SFy r3 = X.C63392KwD.A00(r12, r13, r14, r15, r16, r17)     // Catch:{ RKf -> 0x00a4 }
            X.SmU r2 = X.JTR.A0e(r12)     // Catch:{ RKf -> 0x00a4 }
            java.lang.String r1 = "image/jpeg"
            X.SSw r0 = new X.SSw     // Catch:{ RKf -> 0x00a4 }
            r0.<init>((java.io.File) r7, (java.lang.String) r1, (java.lang.String) r6)     // Catch:{ RKf -> 0x00a4 }
            X.MPe r0 = r2.Ewf(r3, r0, r4)     // Catch:{ RKf -> 0x00a4 }
            X.SJe r0 = r2.FNE(r0)     // Catch:{ RKf -> 0x00a4 }
            java.lang.String r8 = r0.A03     // Catch:{ RKf -> 0x00a4 }
            return r8
        L_0x00a4:
            r2 = move-exception
            java.lang.String r0 = "fbuploader upload error"
            X.0KC.A0G(r5, r0, r2)
            java.lang.String r1 = r2.getMessage()
            java.lang.Throwable r0 = r2.getCause()
            java.io.IOException r0 = X.Pxe.A0c(r1, r0)
            throw r0
        L_0x00b7:
            java.lang.String r0 = "Unable to create temp file"
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException
            r1.<init>(r0)
            throw r1
        L_0x00bf:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException
            r1.<init>()
            throw r1
        L_0x00c5:
            r12 = 0
            java.lang.Object r10 = r5.A01
            android.content.Context r10 = (android.content.Context) r10
            java.lang.String r6 = r5.A02
            java.lang.String r3 = r5.A03
            X.Rqr r2 = X.C10110Rmm.A02
            if (r2 != 0) goto L_0x010a
            java.lang.Class<X.Rqr> r5 = X.C10354Rqr.class
            monitor-enter(r5)
            X.Rqr r2 = X.C10110Rmm.A02     // Catch:{ all -> 0x0107 }
            if (r2 != 0) goto L_0x0105
            android.content.Context r2 = r10.getApplicationContext()     // Catch:{ all -> 0x0107 }
            X.SNx r4 = X.C10110Rmm.A01     // Catch:{ all -> 0x0107 }
            if (r4 != 0) goto L_0x00f9
            java.lang.Class<X.SNx> r1 = X.C11341SNx.class
            monitor-enter(r1)     // Catch:{ all -> 0x0107 }
            X.SNx r4 = X.C10110Rmm.A01     // Catch:{ all -> 0x00f6 }
            if (r4 != 0) goto L_0x00f4
            X.RnX r0 = new X.RnX     // Catch:{ all -> 0x00f6 }
            r0.<init>(r2)     // Catch:{ all -> 0x00f6 }
            X.SNx r4 = new X.SNx     // Catch:{ all -> 0x00f6 }
            r4.<init>(r0)     // Catch:{ all -> 0x00f6 }
            X.C10110Rmm.A01 = r4     // Catch:{ all -> 0x00f6 }
        L_0x00f4:
            monitor-exit(r1)     // Catch:{ all -> 0x00f6 }
            goto L_0x00f9
        L_0x00f6:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00f6 }
            throw r0     // Catch:{ all -> 0x0107 }
        L_0x00f9:
            X.RSM r0 = new X.RSM     // Catch:{ all -> 0x0107 }
            r0.<init>()     // Catch:{ all -> 0x0107 }
            X.Rqr r2 = new X.Rqr     // Catch:{ all -> 0x0107 }
            r2.<init>(r0, r4)     // Catch:{ all -> 0x0107 }
            X.C10110Rmm.A02 = r2     // Catch:{ all -> 0x0107 }
        L_0x0105:
            monitor-exit(r5)     // Catch:{ all -> 0x0107 }
            goto L_0x010a
        L_0x0107:
            r1 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0107 }
            throw r1
        L_0x010a:
            if (r3 == 0) goto L_0x01b0
            X.SNx r8 = r2.A00
            java.io.File r1 = X.C11341SNx.A00(r8)     // Catch:{ FileNotFoundException -> 0x01b0 }
            X.RGY r4 = X.RGY.JSON     // Catch:{ FileNotFoundException -> 0x01b0 }
            r5 = 0
            java.lang.String r0 = X.C11341SNx.A01(r4, r6, r5)     // Catch:{ FileNotFoundException -> 0x01b0 }
            java.io.File r7 = X.JTO.A0s(r1, r0)     // Catch:{ FileNotFoundException -> 0x01b0 }
            boolean r0 = r7.exists()     // Catch:{ FileNotFoundException -> 0x01b0 }
            if (r0 != 0) goto L_0x014b
            java.io.File r1 = X.C11341SNx.A00(r8)     // Catch:{ FileNotFoundException -> 0x01b0 }
            X.RGY r0 = X.RGY.ZIP     // Catch:{ FileNotFoundException -> 0x01b0 }
            java.lang.String r0 = X.C11341SNx.A01(r0, r6, r5)     // Catch:{ FileNotFoundException -> 0x01b0 }
            java.io.File r7 = X.JTO.A0s(r1, r0)     // Catch:{ FileNotFoundException -> 0x01b0 }
            boolean r0 = r7.exists()     // Catch:{ FileNotFoundException -> 0x01b0 }
            if (r0 != 0) goto L_0x014b
            java.io.File r1 = X.C11341SNx.A00(r8)     // Catch:{ FileNotFoundException -> 0x01b0 }
            X.RGY r0 = X.RGY.GZIP     // Catch:{ FileNotFoundException -> 0x01b0 }
            java.lang.String r0 = X.C11341SNx.A01(r0, r6, r5)     // Catch:{ FileNotFoundException -> 0x01b0 }
            java.io.File r7 = X.JTO.A0s(r1, r0)     // Catch:{ FileNotFoundException -> 0x01b0 }
            boolean r0 = r7.exists()     // Catch:{ FileNotFoundException -> 0x01b0 }
            if (r0 == 0) goto L_0x01b0
        L_0x014b:
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x01b0 }
            r5.<init>(r7)     // Catch:{ FileNotFoundException -> 0x01b0 }
            java.lang.String r1 = r7.getAbsolutePath()
            java.lang.String r0 = ".zip"
            boolean r0 = r1.endsWith(r0)
            if (r0 == 0) goto L_0x01a1
            X.RGY r4 = X.RGY.ZIP
        L_0x015e:
            r7.getAbsolutePath()
            android.util.Pair r1 = X.Pxe.A0K(r4, r5)
            java.lang.Object r0 = r1.first
            X.RGY r0 = (X.RGY) r0
            java.lang.Object r4 = r1.second
            java.io.InputStream r4 = (java.io.InputStream) r4
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x0197
            r0 = 2
            if (r1 == r0) goto L_0x0186
            X.SIM r1 = X.C11425STh.A04(r4, r3)
        L_0x017b:
            java.lang.Object r0 = r1.A00
            if (r0 == 0) goto L_0x01b0
            X.SIM r8 = new X.SIM
            r8.<init>((java.lang.Object) r0)
            goto L_0x034d
        L_0x0186:
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x0190 }
            r0.<init>(r4)     // Catch:{ IOException -> 0x0190 }
            X.SIM r1 = X.C11425STh.A04(r0, r3)     // Catch:{ IOException -> 0x0190 }
            goto L_0x017b
        L_0x0190:
            r0 = move-exception
            X.SIM r1 = new X.SIM
            r1.<init>((java.lang.Throwable) r0)
            goto L_0x017b
        L_0x0197:
            java.util.zip.ZipInputStream r0 = new java.util.zip.ZipInputStream
            r0.<init>(r4)
            X.SIM r1 = X.C11425STh.A02(r10, r3, r0)
            goto L_0x017b
        L_0x01a1:
            java.lang.String r1 = r7.getAbsolutePath()
            java.lang.String r0 = ".gz"
            boolean r0 = r1.endsWith(r0)
            if (r0 == 0) goto L_0x015e
            X.RGY r4 = X.RGY.GZIP
            goto L_0x015e
        L_0x01b0:
            java.lang.String r4 = "LottieFetchResult close failed "
            r5 = 0
            java.net.URL r0 = new java.net.URL     // Catch:{ Exception -> 0x033b }
            r0.<init>(r6)     // Catch:{ Exception -> 0x033b }
            java.net.URLConnection r8 = r0.openConnection()     // Catch:{ Exception -> 0x033b }
            java.net.HttpURLConnection r8 = (java.net.HttpURLConnection) r8     // Catch:{ Exception -> 0x033b }
            java.lang.String r0 = "GET"
            r8.setRequestMethod(r0)     // Catch:{ Exception -> 0x033b }
            r0 = 826277727(0x313fff5f, float:2.793932E-9)
            X.0fi.A02(r8, r0)     // Catch:{ Exception -> 0x033b }
            r12 = r8
            r5 = 1
            int r0 = r8.getResponseCode()     // Catch:{ IOException -> 0x02d0 }
            int r1 = r0 / 100
            r0 = 2
            if (r1 != r0) goto L_0x02d0
            r0 = 414090128(0x18ae8390, float:4.511079E-24)
            X.0fV r7 = X.0fi.A00(r8, r0)     // Catch:{ Exception -> 0x033b }
            java.lang.String r9 = r8.getContentType()     // Catch:{ Exception -> 0x033b }
            if (r9 != 0) goto L_0x01e3
            java.lang.String r9 = "application/json"
        L_0x01e3:
            java.lang.String r0 = "application/zip"
            boolean r0 = r9.contains(r0)     // Catch:{ Exception -> 0x033b }
            if (r0 != 0) goto L_0x0281
            java.lang.String r0 = "application/x-zip"
            boolean r0 = r9.contains(r0)     // Catch:{ Exception -> 0x033b }
            if (r0 != 0) goto L_0x0281
            java.lang.String r0 = "application/x-zip-compressed"
            boolean r0 = r9.contains(r0)     // Catch:{ Exception -> 0x033b }
            if (r0 != 0) goto L_0x0281
            java.lang.String r8 = "\\?"
            java.lang.String[] r0 = r6.split(r8)     // Catch:{ Exception -> 0x033b }
            r11 = 0
            r1 = r0[r11]     // Catch:{ Exception -> 0x033b }
            java.lang.String r0 = ".lottie"
            boolean r0 = r1.endsWith(r0)     // Catch:{ Exception -> 0x033b }
            if (r0 != 0) goto L_0x0281
            r0 = 665(0x299, float:9.32E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)     // Catch:{ Exception -> 0x033b }
            boolean r0 = r9.contains(r0)     // Catch:{ Exception -> 0x033b }
            if (r0 != 0) goto L_0x026c
            java.lang.String r0 = "application/x-gzip"
            boolean r0 = r9.contains(r0)     // Catch:{ Exception -> 0x033b }
            if (r0 != 0) goto L_0x026c
            java.lang.String[] r0 = r6.split(r8)     // Catch:{ Exception -> 0x033b }
            r1 = r0[r11]     // Catch:{ Exception -> 0x033b }
            java.lang.String r0 = ".tgs"
            boolean r0 = r1.endsWith(r0)     // Catch:{ Exception -> 0x033b }
            if (r0 != 0) goto L_0x026c
            X.RGY r9 = X.RGY.JSON     // Catch:{ Exception -> 0x033b }
            if (r3 == 0) goto L_0x02b3
            X.SNx r0 = r2.A00     // Catch:{ Exception -> 0x033b }
            java.io.File r0 = r0.A02(r9, r7, r6)     // Catch:{ Exception -> 0x033b }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ Exception -> 0x033b }
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x033b }
            r1.<init>(r0)     // Catch:{ Exception -> 0x033b }
        L_0x0241:
            X.SIM r8 = X.C11425STh.A04(r1, r6)     // Catch:{ Exception -> 0x033b }
        L_0x0245:
            java.lang.Object r0 = r8.A00     // Catch:{ Exception -> 0x033b }
            if (r0 == 0) goto L_0x0343
            X.SNx r0 = r2.A00     // Catch:{ Exception -> 0x033b }
            java.lang.String r1 = X.C11341SNx.A01(r9, r6, r5)     // Catch:{ Exception -> 0x033b }
            java.io.File r0 = X.C11341SNx.A00(r0)     // Catch:{ Exception -> 0x033b }
            java.io.File r6 = X.JTO.A0s(r0, r1)     // Catch:{ Exception -> 0x033b }
            java.lang.String r2 = r6.getAbsolutePath()     // Catch:{ Exception -> 0x033b }
            java.lang.String r1 = ".temp"
            java.lang.String r0 = ""
            java.lang.String r0 = r2.replace(r1, r0)     // Catch:{ Exception -> 0x033b }
            java.io.File r1 = X.AnonymousClass7TE.A0t(r0)     // Catch:{ Exception -> 0x033b }
            boolean r0 = r6.renameTo(r1)     // Catch:{ Exception -> 0x033b }
            goto L_0x029a
        L_0x026c:
            X.RGY r9 = X.RGY.GZIP     // Catch:{ Exception -> 0x033b }
            if (r3 == 0) goto L_0x02ba
            X.SNx r0 = r2.A00     // Catch:{ Exception -> 0x033b }
            java.io.File r1 = r0.A02(r9, r7, r6)     // Catch:{ Exception -> 0x033b }
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ Exception -> 0x033b }
            r0.<init>(r1)     // Catch:{ Exception -> 0x033b }
            java.util.zip.GZIPInputStream r1 = new java.util.zip.GZIPInputStream     // Catch:{ Exception -> 0x033b }
            r1.<init>(r0)     // Catch:{ Exception -> 0x033b }
            goto L_0x0241
        L_0x0281:
            X.RGY r9 = X.RGY.ZIP     // Catch:{ Exception -> 0x033b }
            if (r3 == 0) goto L_0x02c5
            X.SNx r0 = r2.A00     // Catch:{ Exception -> 0x033b }
            java.io.File r0 = r0.A02(r9, r7, r6)     // Catch:{ Exception -> 0x033b }
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x033b }
            r1.<init>(r0)     // Catch:{ Exception -> 0x033b }
            java.util.zip.ZipInputStream r0 = new java.util.zip.ZipInputStream     // Catch:{ Exception -> 0x033b }
            r0.<init>(r1)     // Catch:{ Exception -> 0x033b }
            X.SIM r8 = X.C11425STh.A02(r10, r6, r0)     // Catch:{ Exception -> 0x033b }
            goto L_0x0245
        L_0x029a:
            if (r0 != 0) goto L_0x0343
            java.lang.String r7 = "Unable to rename cache file "
            java.lang.String r6 = r6.getAbsolutePath()     // Catch:{ Exception -> 0x033b }
            java.lang.String r2 = " to "
            java.lang.String r1 = r1.getAbsolutePath()     // Catch:{ Exception -> 0x033b }
            java.lang.String r0 = "."
            java.lang.String r0 = X.002.A11(r7, r6, r2, r1, r0)     // Catch:{ Exception -> 0x033b }
            X.S85.A00(r0)     // Catch:{ Exception -> 0x033b }
            goto L_0x0343
        L_0x02b3:
            r0 = 0
            X.SIM r8 = X.C11425STh.A04(r7, r0)     // Catch:{ Exception -> 0x033b }
            goto L_0x0343
        L_0x02ba:
            java.util.zip.GZIPInputStream r1 = new java.util.zip.GZIPInputStream     // Catch:{ Exception -> 0x033b }
            r1.<init>(r7)     // Catch:{ Exception -> 0x033b }
            r0 = 0
            X.SIM r8 = X.C11425STh.A04(r1, r0)     // Catch:{ Exception -> 0x033b }
            goto L_0x0343
        L_0x02c5:
            java.util.zip.ZipInputStream r1 = new java.util.zip.ZipInputStream     // Catch:{ Exception -> 0x033b }
            r1.<init>(r7)     // Catch:{ Exception -> 0x033b }
            r0 = 0
            X.SIM r8 = X.C11425STh.A02(r10, r0, r1)     // Catch:{ Exception -> 0x033b }
            goto L_0x0343
        L_0x02d0:
            int r0 = r8.getResponseCode()     // Catch:{ IOException -> 0x02db }
            int r1 = r0 / 100
            r0 = 2
            if (r1 != r0) goto L_0x02db
            r0 = 0
            goto L_0x0331
        L_0x02db:
            java.lang.StringBuilder r6 = X.AnonymousClass7TE.A1A()     // Catch:{ IOException -> 0x0327 }
            java.lang.String r0 = "Unable to fetch "
            r6.append(r0)     // Catch:{ IOException -> 0x0327 }
            java.net.URL r0 = r8.getURL()     // Catch:{ IOException -> 0x0327 }
            r6.append(r0)     // Catch:{ IOException -> 0x0327 }
            java.lang.String r0 = ". Failed with "
            r6.append(r0)     // Catch:{ IOException -> 0x0327 }
            int r0 = r8.getResponseCode()     // Catch:{ IOException -> 0x0327 }
            r6.append(r0)     // Catch:{ IOException -> 0x0327 }
            java.lang.String r0 = "\n"
            r6.append(r0)     // Catch:{ IOException -> 0x0327 }
            java.io.InputStream r0 = r8.getErrorStream()     // Catch:{ IOException -> 0x0327 }
            java.io.BufferedReader r2 = X.Pxg.A0X(r0)     // Catch:{ IOException -> 0x0327 }
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ IOException -> 0x0327 }
        L_0x0308:
            java.lang.String r0 = r2.readLine()     // Catch:{ all -> 0x0322 }
            if (r0 == 0) goto L_0x0317
            r1.append(r0)     // Catch:{ all -> 0x0322 }
            r0 = 10
            r1.append(r0)     // Catch:{ all -> 0x0322 }
            goto L_0x0308
        L_0x0317:
            r2.close()     // Catch:{ Exception -> 0x031a }
        L_0x031a:
            X.Pxf.A1O(r6, r1)     // Catch:{ IOException -> 0x0327 }
            java.lang.String r0 = r6.toString()     // Catch:{ IOException -> 0x0327 }
            goto L_0x0331
        L_0x0322:
            r0 = move-exception
            r2.close()     // Catch:{ Exception -> 0x0326 }
        L_0x0326:
            throw r0     // Catch:{ IOException -> 0x0327 }
        L_0x0327:
            r1 = move-exception
            java.lang.String r0 = "get error failed "
            X.S85.A01(r0, r1)     // Catch:{ Exception -> 0x033b }
            java.lang.String r0 = r1.getMessage()     // Catch:{ Exception -> 0x033b }
        L_0x0331:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)     // Catch:{ Exception -> 0x033b }
            X.SIM r8 = new X.SIM     // Catch:{ Exception -> 0x033b }
            r8.<init>((java.lang.Throwable) r0)     // Catch:{ Exception -> 0x033b }
            goto L_0x0343
        L_0x033b:
            r0 = move-exception
            X.SIM r8 = new X.SIM     // Catch:{ all -> 0x0366 }
            r8.<init>((java.lang.Throwable) r0)     // Catch:{ all -> 0x0366 }
            if (r5 == 0) goto L_0x034b
        L_0x0343:
            r12.disconnect()     // Catch:{ IOException -> 0x0347 }
            goto L_0x034b
        L_0x0347:
            r0 = move-exception
            X.S85.A01(r4, r0)
        L_0x034b:
            if (r3 == 0) goto L_0x0365
        L_0x034d:
            java.lang.Object r1 = r8.A00
            if (r1 == 0) goto L_0x0365
            X.SDm r0 = X.SDm.A01
            X.01e r0 = r0.A00
            r0.A05(r3, r1)
            return r8
        L_0x0359:
            java.lang.Object r2 = r5.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r1 = r5.A02
            java.lang.String r0 = r5.A03
            X.SIM r8 = X.C11425STh.A01(r2, r1, r0)
        L_0x0365:
            return r8
        L_0x0366:
            r1 = move-exception
            if (r5 == 0) goto L_0x037c
            r12.disconnect()     // Catch:{ IOException -> 0x036d }
            throw r1
        L_0x036d:
            r0 = move-exception
            X.S85.A01(r4, r0)
            throw r1
        L_0x0372:
            r0 = 254(0xfe, float:3.56E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            java.io.IOException r1 = X.JTO.A0u(r0)
        L_0x037c:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13159TNr.call():java.lang.Object");
    }
}
