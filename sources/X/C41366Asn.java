package X;

import android.hardware.camera2.CaptureRequest;
import java.io.FileDescriptor;
import java.util.concurrent.Callable;

/* renamed from: X.Asn  reason: case insensitive filesystem */
public final /* synthetic */ class C41366Asn implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ CaptureRequest.Builder A04;
    public final /* synthetic */ C340737lk A05;
    public final /* synthetic */ C340817ls A06;
    public final /* synthetic */ C343187po A07;
    public final /* synthetic */ C343047pa A08;
    public final /* synthetic */ C341047mF A09;
    public final /* synthetic */ FileDescriptor A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;

    public /* synthetic */ C41366Asn(CaptureRequest.Builder builder, C340737lk r2, C340817ls r3, C343187po r4, C343047pa r5, C341047mF r6, FileDescriptor fileDescriptor, String str, int i, int i2, int i3, long j, boolean z, boolean z2) {
        this.A06 = r3;
        this.A0A = fileDescriptor;
        this.A0B = str;
        this.A08 = r5;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A0D = z;
        this.A0C = z2;
        this.A09 = r6;
        this.A05 = r2;
        this.A04 = builder;
        this.A07 = r4;
        this.A03 = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x010b, code lost:
        if (r0.A0C() == false) goto L_0x010d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x012d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r29 = this;
            r1 = r29
            X.7ls r7 = r1.A06
            java.io.FileDescriptor r0 = r1.A0A
            r17 = r0
            java.lang.String r0 = r1.A0B
            r16 = r0
            r19 = 0
            X.7pa r12 = r1.A08
            int r6 = r1.A00
            int r11 = r1.A01
            int r10 = r1.A02
            boolean r0 = r1.A0D
            r24 = r0
            boolean r9 = r1.A0C
            X.7mF r0 = r1.A09
            r18 = r0
            X.7lk r15 = r1.A05
            android.hardware.camera2.CaptureRequest$Builder r8 = r1.A04
            X.7po r5 = r1.A07
            long r0 = r1.A03
            r27 = r0
            r12.getClass()
            X.7lr r1 = r7.A09
            java.lang.String r0 = "Method recordVideo() must run on the Optic Background Thread."
            r1.A01(r0)
            android.hardware.camera2.CameraDevice r0 = r7.A0B
            if (r0 == 0) goto L_0x0181
            X.7p0 r0 = r7.A05
            if (r0 == 0) goto L_0x0181
            X.7p2 r1 = r7.A03
            if (r1 == 0) goto L_0x0181
            X.7lu r0 = r7.A02
            if (r0 == 0) goto L_0x0181
            X.7lt r0 = r7.A01
            if (r0 == 0) goto L_0x0181
            X.7ko r0 = r7.A04
            if (r0 == 0) goto L_0x017a
            X.7p4 r13 = X.C342717p3.A0B
            int r0 = X.AnonymousClass7TG.A08(r13, r1)
            r2 = 1
            r3 = 0
            r4 = 3
            if (r0 == 0) goto L_0x007c
            if (r8 == 0) goto L_0x007c
            if (r9 != 0) goto L_0x007c
            X.7p7 r1 = new X.7p7
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r1.A01(r13, r0)
            X.7pk r1 = r1.A00()
            X.7p2 r0 = r7.A03
            r0.A04(r1)
            X.7p2 r1 = r7.A03
            X.7p0 r0 = r7.A05
            X.C343587qS.A01(r8, r1, r0, r3)
            X.7lu r0 = r7.A02
            r0.A05()
        L_0x007c:
            r8.getClass()
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_CAPTURE_INTENT
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r8.set(r1, r0)
            X.7ko r1 = r7.A04
            X.7ks r0 = X.C340167ko.A0W
            java.lang.Object r14 = r1.AXG(r0)
            X.7lo r13 = r7.A08
            X.7ot r0 = X.C340777lo.A01(r13, r6)     // Catch:{ CameraAccessException -> 0x009d }
            java.lang.String r0 = r0.A02     // Catch:{ CameraAccessException -> 0x009d }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ CameraAccessException -> 0x009d }
            goto L_0x00a5
        L_0x009d:
            java.lang.String r1 = "CameraInventory"
            java.lang.String r0 = "Failed to load CameraInfo to obtain camera id"
            X.C340577lU.A02(r1, r0)
            r0 = 0
        L_0x00a5:
            android.media.CamcorderProfile r4 = android.media.CamcorderProfile.get(r0, r2)
            X.7ko r3 = r7.A04
            X.7p2 r0 = r7.A03
            X.7p4 r2 = X.C342717p3.A0w
            int r1 = X.AnonymousClass7TG.A08(r2, r0)
            int r0 = r12.A02
            int r12 = r12.A01
            java.lang.Integer r1 = r3.CDq(r1, r0, r12)
            if (r1 == 0) goto L_0x014c
            int r1 = r1.intValue()
        L_0x00c1:
            r4.videoBitRate = r1
        L_0x00c3:
            r1 = 2
            r4.videoCodec = r1
            X.7p2 r1 = r7.A03
            int r1 = X.AnonymousClass7TG.A08(r2, r1)
            r4.videoFrameRate = r1
            r4.videoFrameWidth = r0
            r4.videoFrameHeight = r12
            r18.getClass()
            X.7na r0 = r18.CEH()
            r7.A07 = r0
            if (r0 != 0) goto L_0x00ec
            X.7p2 r1 = r7.A03
            X.7p4 r0 = X.C342717p3.A0N
            boolean r1 = X.AnonymousClass7TG.A1W(r0, r1)
            X.XyI r0 = new X.XyI
            r0.<init>(r15, r1)
            r7.A07 = r0
        L_0x00ec:
            X.7lt r0 = r7.A01
            r0.A03(r8, r5, r9)
            if (r16 == 0) goto L_0x012d
            X.7na r2 = r7.A07
            int r23 = r13.A05(r6, r11, r10)
            X.7p2 r1 = r7.A03
            X.7p4 r0 = X.C342717p3.A0N
            boolean r25 = X.AnonymousClass7TG.A1W(r0, r1)
            X.7lu r0 = r7.A02
            if (r0 == 0) goto L_0x010d
            boolean r0 = r0.A0C()
            r26 = 1
            if (r0 != 0) goto L_0x010f
        L_0x010d:
            r26 = 0
        L_0x010f:
            r17 = r2
            r18 = r4
            r20 = r16
            r21 = r19
            r22 = r6
            X.Xoh r2 = r17.Exn(r18, r19, r20, r21, r22, r23, r24, r25, r26)
        L_0x011d:
            r7.A06 = r2
            r7.A06 = r2
            X.XZ9 r1 = X.C21986Xoh.A0V
            java.lang.Long r0 = java.lang.Long.valueOf(r27)
            r2.A02(r1, r0)
            X.Xoh r0 = r7.A06
            return r0
        L_0x012d:
            if (r17 == 0) goto L_0x0173
            X.7na r2 = r7.A07
            int r14 = r13.A05(r6, r11, r10)
            X.7p2 r1 = r7.A03
            X.7p4 r0 = X.C342717p3.A0N
            boolean r16 = X.AnonymousClass7TG.A1W(r0, r1)
            r8 = r2
            r9 = r4
            r11 = r17
            r12 = r19
            r13 = r6
            r15 = r24
            r10 = r12
            X.Xoh r2 = r8.Exm(r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x011d
        L_0x014c:
            X.7kp r1 = X.C340177kp.HIGH
            boolean r1 = r14.equals(r1)
            if (r1 == 0) goto L_0x0159
            r1 = 5000000(0x4c4b40, float:7.006492E-39)
            goto L_0x00c1
        L_0x0159:
            X.7kp r1 = X.C340177kp.MEDIUM
            boolean r1 = r14.equals(r1)
            if (r1 == 0) goto L_0x0166
            r1 = 3000000(0x2dc6c0, float:4.203895E-39)
            goto L_0x00c1
        L_0x0166:
            X.7kp r1 = X.C340177kp.LOW
            boolean r1 = r14.equals(r1)
            if (r1 == 0) goto L_0x00c3
            r1 = 1000000(0xf4240, float:1.401298E-39)
            goto L_0x00c1
        L_0x0173:
            java.lang.String r0 = "Cannot start recording video, both filePath and fileDescriptor cannot be null, one must contain a valid value"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x017a:
            java.lang.String r0 = "Cannot setup media recorder, trying to setup camera params without a StartupSettings."
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0181:
            java.lang.String r0 = "Cannot start recording video, camera is closed"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41366Asn.call():java.lang.Object");
    }
}
