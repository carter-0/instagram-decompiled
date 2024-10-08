package X;

import java.io.FileDescriptor;
import java.util.concurrent.Callable;

/* renamed from: X.Asa  reason: case insensitive filesystem */
public final /* synthetic */ class C41353Asa implements Callable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass9RJ A01;
    public final /* synthetic */ FileDescriptor A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ C41353Asa(AnonymousClass9RJ r1, FileDescriptor fileDescriptor, String str, long j) {
        this.A01 = r1;
        this.A03 = str;
        this.A02 = fileDescriptor;
        this.A00 = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00cd, code lost:
        if (java.lang.Integer.valueOf(r22) == null) goto L_0x00cf;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r26 = this;
            r0 = r26
            X.9RJ r12 = r0.A01
            java.lang.String r11 = r0.A03
            r18 = 0
            java.io.FileDescriptor r15 = r0.A02
            long r2 = r0.A00
            r1 = 584873335(0x22dc7577, float:5.975549E-18)
            java.lang.String r0 = "Camera1Device.startVideoRecording.startVideoTask.call"
            X.0fg.A01(r0, r1)
            java.util.HashSet r17 = X.C348147xx.A01
            boolean r0 = X.C348137xw.A02(r17)
            if (r0 != 0) goto L_0x0021
            X.9S6 r0 = r12.A0I
            r0.A02()
        L_0x0021:
            X.9Rx r1 = r12.A0N
            int r0 = r12.A00
            X.7p3 r13 = r1.A02(r0)
            X.7p4 r0 = X.C342717p3.A0W
            boolean r0 = X.AnonymousClass7TG.A1W(r0, r13)
            r12.A0A = r0
            X.7p4 r10 = X.C342717p3.A0B
            int r0 = X.AnonymousClass7TG.A08(r10, r13)
            r12.A02 = r0
            int r0 = r12.A00
            X.7p3 r14 = r1.A02(r0)
            boolean r16 = X.C348137xw.A02(r17)
            X.7ko r1 = r12.A06
            r1.getClass()
            X.7ks r0 = X.C340167ko.A01
            java.lang.Object r0 = r1.AXG(r0)
            int r9 = X.AnonymousClass7TE.A0M(r0)
            r8 = 1
            r0 = -1
            if (r9 == r0) goto L_0x0157
            int r0 = r12.A00
            boolean r0 = android.media.CamcorderProfile.hasProfile(r0, r9)
            if (r0 == 0) goto L_0x0157
        L_0x005e:
            X.9RZ r7 = r12.A0H
            int r0 = r12.A00
            int r0 = X.AnonymousClass9RZ.A00(r7, r0)
            android.media.CamcorderProfile r6 = android.media.CamcorderProfile.get(r0, r9)
            X.7p4 r0 = X.C342717p3.A0y
            java.lang.Object r0 = r14.A02(r0)
            X.7pa r0 = (X.C343047pa) r0
            if (r0 != 0) goto L_0x007c
            X.7p4 r0 = X.C342717p3.A0q
            java.lang.Object r0 = r14.A02(r0)
            X.7pa r0 = (X.C343047pa) r0
        L_0x007c:
            X.7ko r5 = r12.A06
            int r4 = r6.videoFrameRate
            r0.getClass()
            int r1 = r0.A02
            int r0 = r0.A01
            java.lang.Integer r5 = r5.CDq(r4, r1, r0)
            if (r5 == 0) goto L_0x0093
            int r4 = r5.intValue()
            r6.videoBitRate = r4
        L_0x0093:
            if (r16 == 0) goto L_0x0097
            if (r9 != r8) goto L_0x00bd
        L_0x0097:
            r4 = 2
            r6.videoCodec = r4
            r6.videoFrameWidth = r1
            r6.videoFrameHeight = r0
            X.7p4 r0 = X.C342717p3.A0w
            int r0 = X.AnonymousClass7TG.A08(r0, r14)
            r6.videoFrameRate = r0
            if (r5 != 0) goto L_0x00bd
            X.7ko r1 = r12.A06
            X.7ks r0 = X.C340167ko.A0W
            java.lang.Object r1 = r1.AXG(r0)
            X.7kp r0 = X.C340177kp.HIGH
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x013d
            r0 = 5000000(0x4c4b40, float:7.006492E-39)
        L_0x00bb:
            r6.videoBitRate = r0
        L_0x00bd:
            boolean r0 = r12.A0B
            if (r0 == 0) goto L_0x00cf
            int r1 = r12.A00
            int r0 = r12.A0Y
            int r22 = r7.A06(r1, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r22)
            if (r0 != 0) goto L_0x00d7
        L_0x00cf:
            int r1 = r12.A00
            int r0 = r12.A0Y
            int r22 = r7.A06(r1, r0)
        L_0x00d7:
            int r5 = r12.A00
            X.7p4 r0 = X.C342717p3.A0N
            boolean r4 = X.AnonymousClass7TG.A1W(r0, r13)
            X.7mF r0 = r12.A0b
            r0.getClass()
            X.7na r1 = r0.CEH()
            r12.A09 = r1
            if (r1 != 0) goto L_0x013a
            boolean r0 = X.C348137xw.A02(r17)
            if (r0 == 0) goto L_0x00f7
            X.9S6 r0 = r12.A0I
            r0.A02()
        L_0x00f7:
            X.9Ry r8 = X.AnonymousClass9RJ.A01(r12, r5)
            X.7p4 r0 = X.C342717p3.A0T
            boolean r0 = X.AnonymousClass7TG.A1W(r0, r13)
            r7 = r0 ^ 1
            X.Tsa r1 = r8.A00
            X.7p1 r0 = X.C342687p0.A0X
            boolean r0 = X.AnonymousClass7TG.A1V(r0, r1)
            if (r0 == 0) goto L_0x011a
            r0 = 0
            if (r7 == 0) goto L_0x0111
            r0 = 3
        L_0x0111:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.7p7 r0 = r8.A00
            r0.A01(r10, r1)
        L_0x011a:
            X.7p4 r7 = X.C342717p3.A0x
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
            X.7p7 r0 = r8.A00
            r0.A01(r7, r1)
            r8.A02()
            X.7lk r0 = r12.A05
            if (r0 != 0) goto L_0x0133
            X.AUm r0 = new X.AUm
            r0.<init>(r12)
            r12.A05 = r0
        L_0x0133:
            X.XyI r1 = new X.XyI
            r1.<init>(r0, r4)
            r12.A09 = r1
        L_0x013a:
            if (r11 == 0) goto L_0x0173
            goto L_0x015a
        L_0x013d:
            X.7kp r0 = X.C340177kp.MEDIUM
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x014a
            r0 = 3000000(0x2dc6c0, float:4.203895E-39)
            goto L_0x00bb
        L_0x014a:
            X.7kp r0 = X.C340177kp.LOW
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00bd
            r0 = 1000000(0xf4240, float:1.401298E-39)
            goto L_0x00bb
        L_0x0157:
            r9 = 1
            goto L_0x005e
        L_0x015a:
            boolean r0 = r12.A0B     // Catch:{ all -> 0x01a8 }
            r25 = 0
            r17 = r6
            r19 = r11
            r20 = r18
            r21 = r5
            r23 = r0
            r24 = r4
            r16 = r1
            X.Xoh r0 = r16.Exn(r17, r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ all -> 0x01a8 }
            r12.A08 = r0     // Catch:{ all -> 0x01a8 }
            goto L_0x018c
        L_0x0173:
            r15.getClass()     // Catch:{ all -> 0x01a8 }
            boolean r0 = r12.A0B     // Catch:{ all -> 0x01a8 }
            r17 = r6
            r19 = r15
            r20 = r18
            r21 = r5
            r23 = r0
            r24 = r4
            r16 = r1
            X.Xoh r0 = r16.Exm(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x01a8 }
            r12.A08 = r0     // Catch:{ all -> 0x01a8 }
        L_0x018c:
            android.hardware.Camera r0 = r12.A0Z
            r0.getClass()
            r0.lock()
            X.Xoh r4 = r12.A08
            X.XZ9 r1 = X.C21986Xoh.A0V
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r4.A02(r1, r0)
            r0 = 1513551561(0x5a36f6c9, float:1.28749472E16)
            X.0fg.A00(r0)
            X.Xoh r0 = r12.A08
            return r0
        L_0x01a8:
            r1 = move-exception
            android.hardware.Camera r0 = r12.A0Z
            r0.getClass()
            r0.lock()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41353Asa.call():java.lang.Object");
    }
}
