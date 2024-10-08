package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.concurrent.Callable;

/* renamed from: X.TNn  reason: case insensitive filesystem */
public final class C13155TNn implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ Context A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ C11211SFl A05;
    public final /* synthetic */ boolean A06;

    public C13155TNn(Context context, UserSession userSession, C11211SFl sFl, int i, int i2, long j, boolean z) {
        this.A05 = sFl;
        this.A03 = context;
        this.A06 = z;
        this.A04 = userSession;
        this.A02 = j;
        this.A01 = i;
        this.A00 = i2;
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [X.SHv, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v11, types: [java.lang.Object, X.TdI] */
    /* JADX WARNING: type inference failed for: r1v12, types: [X.Tgv, X.Srl, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v2, types: [X.Tfu, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02e8, code lost:
        throw X.Pxg.A0Z("Unsupported image format: ", r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02fd, code lost:
        if (r4.equals(r3) == false) goto L_0x02e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02ff, code lost:
        r5 = android.graphics.Bitmap.CompressFormat.JPEG;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x030c, code lost:
        r4 = X.C9832Rhu.A00(r1, r6);
        r3 = X.JTO.A0t(r0);
        X.0fO.A02(r5, r4, r3, 100);
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0139, code lost:
        if (X.182.A06(X.0Tu.A05, r11, 36327258592000280L) != false) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0150, code lost:
        if (X.182.A06(X.0Tu.A05, r11, 36319918493998832L) == false) goto L_0x0152;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01a0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01a1, code lost:
        X.1zE.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01a4, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x035e  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0112  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r23 = this;
            r5 = r23
            X.SFl r2 = r5.A05
            java.lang.String r9 = r2.A02
            if (r9 == 0) goto L_0x036e
            boolean r7 = r2.A07
            r13 = 0
            if (r7 == 0) goto L_0x0063
            android.content.Context r1 = r5.A03
            long r3 = java.lang.System.nanoTime()
            boolean r6 = r5.A06
            r10 = 1
            java.lang.String r0 = "mp4"
            java.lang.String r0 = X.AnonymousClass457.A09(r1, r0, r3, r6)
            java.io.File r0 = X.AnonymousClass7TE.A0t(r0)
            boolean r3 = r2.A06
            if (r3 != 0) goto L_0x00ee
            java.lang.String r3 = "msys:/"
            boolean r3 = r9.startsWith(r3)
            if (r3 == 0) goto L_0x0059
            com.instagram.common.session.UserSession r6 = r5.A04
            X.Pxe.A1G()
            X.PwU r3 = X.MZ3.A00
            r8 = 0
            if (r3 == 0) goto L_0x0110
            java.util.concurrent.CountDownLatch r12 = new java.util.concurrent.CountDownLatch
            r12.<init>(r10)
            java.lang.String[] r11 = new java.lang.String[r10]
            r10 = 0
            X.0qQ.A0B(r6, r10)
            X.Ocj r4 = new X.Ocj
            r4.<init>(r6)
            X.T6w r3 = new X.T6w
            r3.<init>(r12, r11)
            r4.A03(r3, r9)
            long r3 = X.C59730JVo.A00     // Catch:{ InterruptedException -> 0x00f3 }
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x00f3 }
            r12.await(r3, r6)     // Catch:{ InterruptedException -> 0x00f3 }
            goto L_0x00fe
        L_0x0059:
            long r3 = r5.A02
            com.instagram.common.session.UserSession r6 = r5.A04
            java.io.File r8 = X.C59730JVo.A07(r6, r0, r9, r3)
            goto L_0x0110
        L_0x0063:
            boolean r0 = r5.A06
            android.content.Context r1 = r5.A03
            if (r0 == 0) goto L_0x00e5
            java.lang.String r0 = ".jpg"
            java.io.File r0 = X.0qc.A00(r1, r0)
        L_0x006f:
            if (r0 == 0) goto L_0x0367
            boolean r3 = r2.A06
            if (r3 != 0) goto L_0x00ee
            int r11 = r5.A01
            if (r11 == 0) goto L_0x00d3
            int r10 = r5.A00
            if (r10 == 0) goto L_0x00d3
            com.instagram.common.session.UserSession r8 = r5.A04
            r12 = 0
            X.0qQ.A0B(r8, r12)
            r3 = 25
            X.Wvs r4 = new X.Wvs
            r4.<init>(r8, r3)
            java.lang.Class<X.2kd> r3 = X.C228002kd.class
            java.lang.Object r3 = r8.A01(r3, r4)
            X.2kd r3 = (X.C228002kd) r3
            java.lang.String r6 = r2.A03
            X.0qQ.A0B(r6, r12)
            java.util.Set r3 = r3.A01
            r3.add(r6)
            X.1NK r4 = X.1NK.A00()
            com.instagram.common.typedurl.SimpleImageUrl r3 = new com.instagram.common.typedurl.SimpleImageUrl
            r3.<init>(r9, r11, r10)
            X.3LX r4 = r4.A0K(r8, r3, r6)
        L_0x00a9:
            if (r4 == 0) goto L_0x00ec
            android.graphics.Bitmap r14 = r4.A01
            if (r14 == 0) goto L_0x00ec
            java.io.File r3 = r0.getParentFile()
            r3.getClass()
            java.io.File r3 = r0.getParentFile()
            java.lang.String r17 = r3.getAbsolutePath()
            java.lang.String r18 = r0.getName()
            r19 = 0
            X.9Iu r15 = r4.A02
            r16 = r8
            r20 = r19
            X.8Cl r3 = X.C39908AIz.A03(r14, r15, r16, r17, r18, r19, r20)
            java.io.File r8 = r3.A03()
            goto L_0x0110
        L_0x00d3:
            X.1NK r6 = X.1NK.A00()
            com.instagram.common.session.UserSession r8 = r5.A04
            com.instagram.common.typedurl.SimpleImageUrl r4 = new com.instagram.common.typedurl.SimpleImageUrl
            r4.<init>(r9)
            java.lang.String r3 = "MediaSaver"
            X.3LX r4 = r6.A0K(r8, r4, r3)
            goto L_0x00a9
        L_0x00e5:
            java.lang.String r0 = ".jpg"
            java.io.File r0 = X.0qc.A01(r0)
            goto L_0x006f
        L_0x00ec:
            r8 = r13
            goto L_0x0110
        L_0x00ee:
            java.io.File r8 = X.AnonymousClass7TE.A0t(r9)
            goto L_0x0110
        L_0x00f3:
            java.lang.String r4 = "MediaSaver"
            r3 = 579(0x243, float:8.11E-43)
            java.lang.String r3 = X.C66579MXk.A00(r3)
            X.0KC.A0C(r4, r3)
        L_0x00fe:
            r3 = r11[r10]
            if (r3 == 0) goto L_0x0110
            android.net.Uri r3 = X.0cp.A03(r3)
            java.lang.String r3 = r3.getPath()
            if (r3 == 0) goto L_0x0110
            java.io.File r8 = X.AnonymousClass7TE.A0t(r3)
        L_0x0110:
            if (r8 == 0) goto L_0x035e
            boolean r3 = r8.equals(r0)
            if (r3 != 0) goto L_0x0123
            java.io.FileInputStream r3 = new java.io.FileInputStream
            r3.<init>(r8)
            X.0mb.A09(r0, r3)
            com.google.common.io.Closeables.A01(r3)
        L_0x0123:
            boolean r14 = r2.A05
            r9 = 1
            r6 = 0
            if (r14 == 0) goto L_0x013b
            com.instagram.common.session.UserSession r11 = r5.A04
            X.0qQ.A0B(r11, r6)
            X.0Tu r10 = X.0Tu.A05
            r3 = 36327258592000280(0x810f73000a3918, double:3.036842839485672E-306)
            boolean r3 = X.182.A06(r10, r11, r3)
            if (r3 == 0) goto L_0x0152
        L_0x013b:
            boolean r3 = r2.A04
            if (r3 == 0) goto L_0x0152
            com.instagram.common.session.UserSession r11 = r5.A04
            X.0qQ.A0B(r11, r6)
            X.0Tu r10 = X.0Tu.A05
            r3 = 36319918493998832(0x8108c6001b1ef0, double:3.032200931953354E-306)
            boolean r4 = X.182.A06(r10, r11, r3)
            r3 = 1
            if (r4 != 0) goto L_0x0153
        L_0x0152:
            r3 = 0
        L_0x0153:
            if (r7 == 0) goto L_0x02b3
            boolean r12 = r2.A08
            if (r12 != 0) goto L_0x015b
            if (r3 == 0) goto L_0x02b3
        L_0x015b:
            java.io.File r7 = r8.getParentFile()
            if (r3 == 0) goto L_0x01ba
            X.0qQ.A0B(r1, r6)
            android.net.Uri r3 = android.net.Uri.fromFile(r0)
            X.0qQ.A07(r3)
            X.Q0d r3 = X.SRj.A01(r1, r3, r6)
            if (r3 == 0) goto L_0x01ac
            int r4 = r3.A05
            int r3 = r3.A03
            android.graphics.Bitmap r3 = X.AnonymousClass7TF.A0B(r4, r3)
            android.graphics.Bitmap r11 = X.C9832Rhu.A00(r1, r3)
            java.lang.String r3 = ".webp"
            java.io.File r3 = X.0qc.A01(r3)
            if (r3 == 0) goto L_0x0194
            java.lang.String r3 = r3.getAbsolutePath()
        L_0x0189:
            if (r3 == 0) goto L_0x01a5
            java.io.File r10 = X.AnonymousClass7TE.A0t(r3)
            java.io.FileOutputStream r8 = X.JTO.A0t(r10)
            goto L_0x0196
        L_0x0194:
            r3 = 0
            goto L_0x0189
        L_0x0196:
            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.WEBP     // Catch:{ all -> 0x019e }
            r3 = 100
            X.0fO.A02(r4, r11, r8, r3)     // Catch:{ all -> 0x019e }
            goto L_0x01b3
        L_0x019e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01a0 }
        L_0x01a0:
            r0 = move-exception
            X.1zE.A00(r8, r1)
            throw r0
        L_0x01a5:
            java.lang.String r0 = "Couldn't create temp image for watermark image"
            java.io.IOException r0 = X.JTO.A0u(r0)
            throw r0
        L_0x01ac:
            java.lang.String r0 = "Can't read video metadata"
            java.io.IOException r0 = X.JTO.A0u(r0)
            throw r0
        L_0x01b3:
            r8.close()
            android.net.Uri r13 = android.net.Uri.fromFile(r10)
        L_0x01ba:
            r4 = 72
            r3 = 4
            X.0na r11 = new X.0na
            r11.<init>(r4, r3, r9, r6)
            X.SrW r10 = new X.SrW
            r10.<init>(r7)
            com.instagram.common.session.UserSession r7 = r5.A04
            X.0Tu r5 = X.0Tu.A05
            r3 = 36324179100381027(0x810ca600092f63, double:3.034895356585539E-306)
            boolean r18 = X.182.A06(r5, r7, r3)
            r3 = 36324179101036394(0x810ca600132f6a, double:3.0348953569999957E-306)
            boolean r19 = X.182.A06(r5, r7, r3)
            r3 = 36324179101167468(0x810ca600152f6c, double:3.0348953570828874E-306)
            boolean r20 = X.182.A06(r5, r7, r3)
            r3 = 36324179101429616(0x810ca600192f70, double:3.034895357248671E-306)
            boolean r21 = X.182.A06(r5, r7, r3)
            r3 = 36605654077478179(0x820ca6000f1523, double:3.212901265510537E-306)
            long r16 = X.182.A01(r5, r7, r3)
            r3 = 36324179102019449(0x810ca600222f79, double:3.0348953576216836E-306)
            boolean r22 = X.182.A06(r5, r7, r3)
            java.lang.String r8 = "Failure when modifying video"
            X.0qQ.A0B(r1, r6)
            X.0rm r7 = X.C51965G9l.A11()
            X.0rm r5 = X.C51965G9l.A11()
            X.Qdy r4 = new X.Qdy
            r4.<init>(r9, r5, r7)
            X.SQv r3 = new X.SQv
            r3.<init>()
            r3.A0D = r0
            r3.A0H = r12
            r3.A07 = r4
            X.QeD r4 = new X.QeD
            r15 = r4
            r15.<init>(r16, r18, r19, r20, r21, r22)
            r3.A0B = r4
            if (r13 == 0) goto L_0x0254
            android.net.Uri r4 = android.net.Uri.fromFile(r0)
            X.0qQ.A07(r4)
            X.Q0d r12 = X.SRj.A01(r1, r4, r6)
            if (r12 == 0) goto L_0x02ac
            X.SNc r6 = X.C11326SNc.A05
            X.Sr1 r15 = new X.Sr1
            r15.<init>(r9)
            X.Sr5 r9 = new X.Sr5
            r9.<init>()
            X.Sr2 r4 = new X.Sr2
            r4.<init>(r13, r9)
            java.lang.Object[] r4 = new java.lang.Object[]{r15, r4}
            java.util.List r4 = X.0sr.A1P(r4)
            X.SOn r4 = X.C11354SOn.A00(r12, r6, r4)
            r3.A06 = r4
        L_0x0254:
            X.SHv r6 = new X.SHv
            r6.<init>()
            X.RzN r4 = new X.RzN
            r4.<init>(r3)
            r6.A0C = r4
            r6.A00 = r1
            r6.A07 = r10
            r6.A0E = r11
            X.Q0h r3 = X.C9955RkA.A00
            X.Srw r1 = new X.Srw
            r1.<init>(r3)
            r6.A0A = r1
            X.Srj r1 = new X.Srj
            r1.<init>()
            r6.A08 = r1
            X.Srl r1 = new X.Srl
            r1.<init>()
            r1.A00 = r3
            r6.A09 = r1
            X.Rz8 r1 = r6.A01()
            X.Tgt r1 = X.SRj.A00(r1)
            r1.FNH()     // Catch:{ ExecutionException -> 0x02a6, InterruptedException -> 0x02a0 }
            java.lang.Object r1 = r5.A00
            if (r1 != 0) goto L_0x0299
            java.lang.Object r1 = r7.A00
            java.io.File r1 = (java.io.File) r1
            if (r1 == 0) goto L_0x0324
            r1.renameTo(r0)
            goto L_0x0324
        L_0x0299:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.io.IOException r0 = X.Pxe.A0c(r8, r1)
            throw r0
        L_0x02a0:
            r0 = move-exception
            java.io.IOException r0 = X.Pxe.A0c(r8, r0)
            throw r0
        L_0x02a6:
            r0 = move-exception
            java.io.IOException r0 = X.Pxe.A0c(r8, r0)
            throw r0
        L_0x02ac:
            java.lang.String r0 = "Can't read video metadata"
            java.io.IOException r0 = X.JTO.A0u(r0)
            throw r0
        L_0x02b3:
            if (r7 != 0) goto L_0x0324
            if (r3 == 0) goto L_0x0324
            X.0qQ.A0B(r1, r9)
            java.lang.String r5 = r0.getCanonicalPath()
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeFile(r5)
            if (r6 == 0) goto L_0x031d
            X.0qQ.A0A(r5)
            r4 = 46
            int r3 = X.C66581MXm.A04(r5)
            int r3 = r3 + -1
            int r3 = X.00l.A05(r5, r4, r3)
            java.lang.String r3 = X.C66580MXl.A0z(r5, r3)
            java.lang.String r4 = X.AnonymousClass7TF.A0j(r3)
            int r3 = r4.hashCode()
            switch(r3) {
                case 1475827: goto L_0x02e9;
                case 1481531: goto L_0x02ec;
                case 45750678: goto L_0x02f7;
                case 46127306: goto L_0x0302;
                default: goto L_0x02e2;
            }
        L_0x02e2:
            java.lang.String r0 = "Unsupported image format: "
            java.io.IOException r0 = X.Pxg.A0Z(r0, r4)
            throw r0
        L_0x02e9:
            java.lang.String r3 = ".jpg"
            goto L_0x02f9
        L_0x02ec:
            java.lang.String r3 = ".png"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x02e2
            android.graphics.Bitmap$CompressFormat r5 = android.graphics.Bitmap.CompressFormat.PNG
            goto L_0x030c
        L_0x02f7:
            java.lang.String r3 = ".jpeg"
        L_0x02f9:
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x02e2
            android.graphics.Bitmap$CompressFormat r5 = android.graphics.Bitmap.CompressFormat.JPEG
            goto L_0x030c
        L_0x0302:
            java.lang.String r3 = ".webp"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x02e2
            android.graphics.Bitmap$CompressFormat r5 = android.graphics.Bitmap.CompressFormat.WEBP
        L_0x030c:
            android.graphics.Bitmap r4 = X.C9832Rhu.A00(r1, r6)
            java.io.FileOutputStream r3 = X.JTO.A0t(r0)
            r1 = 100
            X.0fO.A02(r5, r4, r3, r1)
            r3.close()
            goto L_0x0324
        L_0x031d:
            java.lang.String r0 = "failed to read bitmap"
            java.io.IOException r0 = X.JTO.A0u(r0)
            throw r0
        L_0x0324:
            java.lang.String r1 = r0.getCanonicalPath()     // Catch:{ IOException -> 0x033e }
            if (r1 == 0) goto L_0x035d
            X.2kK r3 = new X.2kK     // Catch:{ IOException -> 0x033e }
            r3.<init>((java.lang.String) r1)     // Catch:{ IOException -> 0x033e }
            if (r14 != 0) goto L_0x0335
            boolean r1 = r2.A04     // Catch:{ IOException -> 0x033e }
            if (r1 == 0) goto L_0x033a
        L_0x0335:
            X.SGV r1 = X.SGV.A00     // Catch:{ IOException -> 0x033e }
            r1.A00(r3)     // Catch:{ IOException -> 0x033e }
        L_0x033a:
            r3.A0O()     // Catch:{ IOException -> 0x033e }
            return r0
        L_0x033e:
            r5 = move-exception
            java.lang.String r4 = r5.getLocalizedMessage()
            X.0wj r3 = X.0wj.A01
            r2 = 817899034(0x30c0261a, float:1.3980668E-9)
            r1 = 111(0x6f, float:1.56E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.0f9 r2 = r3.AEf(r1, r2)
            if (r4 != 0) goto L_0x0357
            java.lang.String r4 = "null"
        L_0x0357:
            java.lang.String r1 = "message"
            X.AnonymousClass7TF.A19(r2, r1, r4, r5)
        L_0x035d:
            return r0
        L_0x035e:
            java.lang.String r1 = "Unable to access file via cache or download. Product: "
            java.lang.String r0 = r2.A03
            java.io.IOException r0 = X.Pxg.A0Z(r1, r0)
            throw r0
        L_0x0367:
            java.lang.String r0 = "Unable to generate photo file"
            java.io.IOException r0 = X.JTO.A0u(r0)
            throw r0
        L_0x036e:
            java.lang.String r4 = "No source path specified: isLocalfile: "
            boolean r3 = r2.A06
            java.lang.String r1 = ", isVideo: "
            boolean r0 = r2.A07
            java.lang.String r0 = X.002.A1C(r4, r1, r3, r0)
            java.io.IOException r0 = X.JTO.A0u(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13155TNn.call():java.lang.Object");
    }
}
