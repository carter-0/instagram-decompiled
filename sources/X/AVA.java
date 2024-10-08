package X;

import android.media.CamcorderProfile;
import java.io.File;
import java.io.FileDescriptor;
import java.util.concurrent.CountDownLatch;

public final class AVA implements C341827na {
    public C343967r6 A00;
    public ADm A01;
    public C341647nI A02;
    public C21986Xoh A03;
    public File A04;
    public CountDownLatch A05;
    public final C41827B2i A06 = new AUH(this, 0);
    public volatile C382309dU A07;
    public final /* synthetic */ C345727tz A08;

    public AVA(C345727tz r3) {
        this.A08 = r3;
    }

    public final /* synthetic */ C21986Xoh Exm(CamcorderProfile camcorderProfile, C342077o0 r3, FileDescriptor fileDescriptor, FileDescriptor fileDescriptor2, int i, int i2, boolean z, boolean z2) {
        throw AnonymousClass7TE.A1B(AnonymousClass000.A00(1010));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0026, code lost:
        if (r7 == 270) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C21986Xoh Exn(android.media.CamcorderProfile r18, X.C342077o0 r19, java.lang.String r20, java.lang.String r21, int r22, int r23, boolean r24, boolean r25, boolean r26) {
        /*
            r17 = this;
            r12 = r20
            java.io.File r1 = X.AnonymousClass7TE.A0t(r12)
            r0 = r17
            r0.A04 = r1
            X.7tz r1 = r0.A08
            int r8 = r1.A03
            int r9 = r1.A01
            int r10 = r1.A00
            int r11 = r1.A02
            X.7r6 r6 = r0.A00
            X.AUM r4 = new X.AUM
            r5 = r18
            r7 = r23
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r1 = 90
            if (r7 == r1) goto L_0x0028
            r1 = 270(0x10e, float:3.78E-43)
            r2 = 1
            if (r7 != r1) goto L_0x0029
        L_0x0028:
            r2 = 0
        L_0x0029:
            r8 = 0
            X.A9v r1 = r4.A01
            if (r2 == 0) goto L_0x0094
            int r13 = r1.A05
            int r14 = r1.A04
        L_0x0032:
            X.Xnz r10 = new X.Xnz
            r16 = r22
            r11 = r8
            r15 = r7
            r10.<init>(r11, r12, r13, r14, r15, r16)
            X.XZ9 r2 = X.C21986Xoh.A0N
            if (r25 == 0) goto L_0x0092
            int r1 = r5.audioCodec
        L_0x0041:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r10.A01(r2, r1)
            X.XZ9 r2 = X.C21986Xoh.A0Z
            int r1 = r5.videoCodec
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r10.A01(r2, r1)
            X.Xoh r1 = new X.Xoh
            r1.<init>(r10)
            r0.A03 = r1
            X.7nI r1 = r0.A02
            if (r1 == 0) goto L_0x008f
            X.7nG r1 = r1.A04
            java.lang.Integer r2 = r1.A04
            java.lang.Integer r1 = X.AnonymousClass05K.A0u
            if (r2 != r1) goto L_0x008f
            r1 = 2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r1)
            X.ADm r7 = r0.A01
            X.7r6 r6 = r0.A00
            X.7qG r5 = new X.7qG
            r9 = r8
            r10 = r8
            r12 = r8
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r3.add(r5)
            r3.add(r4)
            X.7nI r2 = r0.A02
            java.io.File r7 = r0.A04
            java.lang.Integer r9 = X.AnonymousClass05K.A0C
            X.AD9 r5 = new X.AD9
            r6 = r8
            r5.<init>(r6, r7, r8, r9, r10)
            X.B2i r1 = r0.A06
            r2.A02(r5, r1, r3)
        L_0x008f:
            X.Xoh r0 = r0.A03
            return r0
        L_0x0092:
            r1 = -1
            goto L_0x0041
        L_0x0094:
            int r13 = r1.A04
            int r14 = r1.A05
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AVA.Exn(android.media.CamcorderProfile, X.7o0, java.lang.String, java.lang.String, int, int, boolean, boolean, boolean):X.Xoh");
    }

    public final void EyQ() {
        Integer num;
        C341647nI r0 = this.A02;
        if (r0 != null && (num = r0.A04.A04) != AnonymousClass05K.A0j && num != AnonymousClass05K.A0u) {
            if (this.A05 == null) {
                this.A07 = null;
                this.A05 = new CountDownLatch(1);
                this.A02.A01();
                try {
                    this.A05.await();
                    if (this.A07 != null) {
                        throw this.A07;
                    }
                } catch (InterruptedException e) {
                    0KC.A0F("SurfaceRecorder", "Thread interrupted while recording", e);
                } catch (Throwable th) {
                    this.A05 = null;
                    throw th;
                }
                this.A05 = null;
                return;
            }
            0KC.A0C("SurfaceRecorder", "Unfinished previous recording state");
            throw AnonymousClass7TE.A0z("LiteVideoRecorder: Unfinished previous recording state");
        }
    }
}
