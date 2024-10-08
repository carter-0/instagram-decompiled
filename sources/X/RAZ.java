package X;

import android.content.Context;
import android.graphics.RectF;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.concurrent.ExecutorService;

public final class RAZ extends 0ng {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ int A05;
    public final /* synthetic */ int A06;
    public final /* synthetic */ int A07;
    public final /* synthetic */ Context A08;
    public final /* synthetic */ RectF A09;
    public final /* synthetic */ UserSession A0A;
    public final /* synthetic */ C13754TgQ A0B;
    public final /* synthetic */ 2Nn A0C;
    public final /* synthetic */ File A0D;
    public final /* synthetic */ File A0E;
    public final /* synthetic */ Integer A0F;
    public final /* synthetic */ String A0G;
    public final /* synthetic */ ExecutorService A0H;
    public final /* synthetic */ boolean A0I;
    public final /* synthetic */ boolean A0J;

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x016f A[Catch:{ IOException -> 0x01a4, 8Af -> 0x01fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x019d A[Catch:{ IOException -> 0x01a4, 8Af -> 0x01fc }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r44 = this;
            java.lang.String r5 = "metadata was null but no exception was thrown when trying to get the metadata a second time..."
            r4 = r44
            java.lang.Integer r0 = r4.A0F
            if (r0 == 0) goto L_0x000f
            int r1 = r0.intValue()
            if (r1 != 0) goto L_0x001c
        L_0x000f:
            java.io.File r0 = r4.A0E     // Catch:{ IOException -> 0x0208 }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ IOException -> 0x0208 }
            X.0qQ.A07(r0)     // Catch:{ IOException -> 0x0208 }
            int r1 = X.AIF.A00(r0)     // Catch:{ IOException -> 0x0208 }
        L_0x001c:
            int r0 = r4.A06
            int r7 = java.lang.Math.min(r1, r0)
            int r6 = r4.A07
            int r41 = r7 - r6
            r13 = 0
            if (r6 > 0) goto L_0x0039
            if (r7 > 0) goto L_0x0039
            java.lang.String r1 = "start and end time less than or equal to zero: start="
            java.lang.String r0 = " end="
            java.lang.String r0 = X.002.A02(r6, r7, r1, r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x0039:
            int r3 = r4.A02
            int r2 = r4.A03
            r1 = 64000(0xfa00, float:8.9683E-41)
            X.SFQ r19 = new X.SFQ
            r0 = r19
            r0.<init>(r1, r3, r2)
            int r0 = r4.A05
            r43 = r0
            int r0 = r4.A04
            r42 = r0
            java.io.File r12 = r4.A0E
            android.content.Context r3 = r4.A08
            X.SOn r2 = X.C9606Rdk.A00(r3, r12, r13)
            if (r2 != 0) goto L_0x0091
            X.TgQ r4 = r4.A0B
            r2 = 0
            X.Q1i r1 = new X.Q1i     // Catch:{ RuntimeException -> 0x0089, all -> 0x007a }
            r1.<init>(r3, r13)     // Catch:{ RuntimeException -> 0x0089, all -> 0x007a }
            java.lang.String r0 = r12.getPath()     // Catch:{ RuntimeException -> 0x0089, all -> 0x007a }
            android.net.Uri r0 = X.0cp.A03(r0)     // Catch:{ RuntimeException -> 0x0089, all -> 0x007a }
            r1.AU7(r0)     // Catch:{ RuntimeException -> 0x0089, all -> 0x007a }
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r5)
            X.THY r0 = new X.THY
            r0.<init>(r4, r2)
            X.11Z.A02(r0)
            return
        L_0x007a:
            r1 = move-exception
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r5)
            X.THY r0 = new X.THY
            r0.<init>(r4, r2)
            X.11Z.A02(r0)
            throw r1
        L_0x0089:
            r0 = move-exception
            X.THY r2 = new X.THY
            r2.<init>(r4, r0)
            goto L_0x0204
        L_0x0091:
            java.lang.String r0 = r4.A0G
            r18 = 0
            r8 = 1
            r23 = r43
            r24 = r42
            r25 = r8
            r20 = r2
            r21 = r0
            r22 = r18
            X.SRj.A03(r20, r21, r22, r23, r24, r25)
            android.graphics.RectF r0 = r4.A09
            if (r0 != 0) goto L_0x00bd
            boolean r0 = r4.A0I
            if (r0 == 0) goto L_0x00bf
            r0 = r43
            float r9 = (float) r0
            r0 = r42
            float r5 = (float) r0
            int r0 = r4.A01
            float r1 = (float) r0
            int r0 = r4.A00
            float r0 = (float) r0
            android.graphics.RectF r0 = X.C9823Rhl.A00(r9, r5, r1, r0)
        L_0x00bd:
            r2.A0E = r0
        L_0x00bf:
            com.instagram.common.session.UserSession r5 = r4.A0A
            X.0Tu r9 = X.0Tu.A06
            r0 = 36593516499174746(0x82019c0004055a, double:3.205225412117341E-306)
            long r16 = X.182.A01(r9, r5, r0)
            long r10 = X.0mb.A00(r3)
            r0 = 20
            long r10 = r10 >> r0
            r0 = 36593516499109209(0x82019c00030559, double:3.205225412075895E-306)
            long r14 = X.182.A01(r9, r5, r0)
            int r1 = X.C63114Kri.A00()
            int r0 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            boolean r10 = X.Pxf.A1R(r0)
            long r0 = (long) r1
            int r9 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            boolean r0 = X.Pxf.A1R(r9)
            if (r10 == 0) goto L_0x0113
            if (r0 == 0) goto L_0x0113
            X.0Tu r9 = X.0Tu.A05
            r0 = 36312041522267008(0x81019c00010380, double:3.027219503312129E-306)
            boolean r0 = X.182.A06(r9, r5, r0)
            if (r0 == 0) goto L_0x0113
            r0 = 36593516498912600(0x82019c00000558, double:3.2052254119515586E-306)
            int r1 = X.DbS.A04(r9, r5, r0)
            int r0 = r2.A04
            int r0 = r0 * r1
            float r1 = (float) r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r0
            int r0 = (int) r1
            r2.A04 = r0
            r2.A01 = r0
        L_0x0113:
            java.util.concurrent.ExecutorService r11 = r4.A0H     // Catch:{ 8Af -> 0x01fc }
            X.833 r1 = new X.833     // Catch:{ 8Af -> 0x01fc }
            r1.<init>(r5)     // Catch:{ 8Af -> 0x01fc }
            X.2Nn r0 = r4.A0C     // Catch:{ 8Af -> 0x01fc }
            X.AVe r10 = new X.AVe     // Catch:{ 8Af -> 0x01fc }
            r10.<init>(r3, r1, r0)     // Catch:{ 8Af -> 0x01fc }
            X.TgQ r15 = r4.A0B     // Catch:{ 8Af -> 0x01fc }
            r0 = 3
            X.MBb r9 = new X.MBb     // Catch:{ 8Af -> 0x01fc }
            r9.<init>(r15, r0)     // Catch:{ 8Af -> 0x01fc }
            X.0Tu r14 = X.0Tu.A05     // Catch:{ 8Af -> 0x01fc }
            r0 = 36319373031382198(0x81084700001cb6, double:3.031855979198193E-306)
            boolean r35 = X.182.A06(r14, r5, r0)     // Catch:{ 8Af -> 0x01fc }
            r0 = 2
            r30 = -1
            X.0qQ.A0B(r11, r8)     // Catch:{ 8Af -> 0x01fc }
            X.0qQ.A0B(r12, r0)     // Catch:{ 8Af -> 0x01fc }
            r24 = r19
            r25 = r12
            r26 = r11
            r27 = r6
            r28 = r7
            r29 = r0
            r32 = r8
            r33 = r8
            r34 = r8
            r36 = r13
            r37 = r13
            r38 = r13
            r39 = r13
            r40 = r13
            r19 = r3
            r20 = r9
            r21 = r2
            r22 = r10
            r23 = r18
            java.io.File r9 = X.C9598Rdc.A00(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r32, r33, r34, r35, r36, r37, r38, r39, r40)     // Catch:{ 8Af -> 0x01fc }
            java.io.File r7 = r4.A0D     // Catch:{ 8Af -> 0x01fc }
            boolean r0 = r9.canRead()     // Catch:{ IOException -> 0x01a4 }
            if (r0 == 0) goto L_0x019d
            boolean r0 = r7.exists()     // Catch:{ IOException -> 0x01a4 }
            if (r0 != 0) goto L_0x0178
            r7.createNewFile()     // Catch:{ IOException -> 0x01a4 }
        L_0x0178:
            boolean r0 = r7.canWrite()     // Catch:{ IOException -> 0x01a4 }
            if (r0 == 0) goto L_0x0196
            com.google.common.io.Files.A02(r9, r7)     // Catch:{ IOException -> 0x01a4 }
            boolean r0 = r4.A0J     // Catch:{ 8Af -> 0x01fc }
            X.TKa r36 = new X.TKa     // Catch:{ 8Af -> 0x01fc }
            r37 = r15
            r38 = r7
            r39 = r43
            r40 = r42
            r42 = r0
            r36.<init>(r37, r38, r39, r40, r41, r42)     // Catch:{ 8Af -> 0x01fc }
            X.11Z.A02(r36)     // Catch:{ 8Af -> 0x01fc }
            return
        L_0x0196:
            java.lang.String r0 = "cannot write output file"
            java.io.IOException r0 = X.JTO.A0u(r0)     // Catch:{ IOException -> 0x01a4 }
            goto L_0x01a3
        L_0x019d:
            java.lang.String r0 = "cannot read transcode file"
            java.io.IOException r0 = X.JTO.A0u(r0)     // Catch:{ IOException -> 0x01a4 }
        L_0x01a3:
            throw r0     // Catch:{ IOException -> 0x01a4 }
        L_0x01a4:
            r2 = move-exception
            r0 = r18
            java.io.File r0 = r3.getExternalFilesDir(r0)     // Catch:{ 8Af -> 0x01fc }
            if (r0 != 0) goto L_0x01b0
            r5 = 0
            goto L_0x01c2
        L_0x01b0:
            java.lang.String r1 = r0.getAbsolutePath()     // Catch:{ 8Af -> 0x01fc }
            android.os.StatFs r0 = new android.os.StatFs     // Catch:{ 8Af -> 0x01fc }
            r0.<init>(r1)     // Catch:{ 8Af -> 0x01fc }
            long r5 = r0.getAvailableBlocksLong()     // Catch:{ 8Af -> 0x01fc }
            long r0 = r0.getBlockSizeLong()     // Catch:{ 8Af -> 0x01fc }
            long r5 = r5 * r0
        L_0x01c2:
            long r0 = X.0mb.A00(r3)     // Catch:{ 8Af -> 0x01fc }
            java.lang.StringBuilder r10 = X.AnonymousClass7TE.A1A()     // Catch:{ 8Af -> 0x01fc }
            java.lang.String r3 = "availableE="
            r10.append(r3)     // Catch:{ 8Af -> 0x01fc }
            r10.append(r5)     // Catch:{ 8Af -> 0x01fc }
            java.lang.String r3 = "availableI="
            r10.append(r3)     // Catch:{ 8Af -> 0x01fc }
            r10.append(r0)     // Catch:{ 8Af -> 0x01fc }
            java.lang.String r0 = ",1="
            r10.append(r0)     // Catch:{ 8Af -> 0x01fc }
            java.lang.String r0 = r9.getPath()     // Catch:{ 8Af -> 0x01fc }
            r10.append(r0)     // Catch:{ 8Af -> 0x01fc }
            java.lang.String r0 = ",2="
            r10.append(r0)     // Catch:{ 8Af -> 0x01fc }
            java.lang.String r0 = r7.getPath()     // Catch:{ 8Af -> 0x01fc }
            java.lang.String r1 = X.AnonymousClass7TF.A0l(r0, r10)     // Catch:{ 8Af -> 0x01fc }
            X.0qQ.A0B(r1, r8)     // Catch:{ 8Af -> 0x01fc }
            X.8Af r0 = new X.8Af     // Catch:{ 8Af -> 0x01fc }
            r0.<init>(r1, r2)     // Catch:{ 8Af -> 0x01fc }
            throw r0     // Catch:{ 8Af -> 0x01fc }
        L_0x01fc:
            r1 = move-exception
            X.TgQ r0 = r4.A0B
            X.THZ r2 = new X.THZ
            r2.<init>(r1, r0)
        L_0x0204:
            X.11Z.A02(r2)
            return
        L_0x0208:
            r2 = move-exception
            X.TgQ r1 = r4.A0B
            X.THa r0 = new X.THa
            r0.<init>(r1, r2)
            X.11Z.A02(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RAZ.run():void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RAZ(Context context, RectF rectF, UserSession userSession, C13754TgQ tgQ, 2Nn r8, File file, File file2, Integer num, String str, ExecutorService executorService, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, boolean z2) {
        super(90, 4, false, false);
        this.A0F = num;
        this.A0E = file;
        this.A06 = i;
        this.A07 = i2;
        this.A02 = i3;
        this.A03 = i4;
        this.A05 = i5;
        this.A04 = i6;
        this.A08 = context;
        this.A0G = str;
        this.A09 = rectF;
        this.A0I = z;
        this.A01 = i7;
        this.A00 = i8;
        this.A0A = userSession;
        this.A0H = executorService;
        this.A0C = r8;
        this.A0B = tgQ;
        this.A0D = file2;
        this.A0J = z2;
    }
}
