package X;

import android.media.CamcorderProfile;
import java.io.FileDescriptor;

/* renamed from: X.7nZ  reason: invalid class name and case insensitive filesystem */
public final class C341817nZ implements C341827na {
    public final /* synthetic */ C345407tR A00;

    public C341817nZ(C345407tR r1) {
        this.A00 = r1;
    }

    public final /* synthetic */ C21986Xoh Exm(CamcorderProfile camcorderProfile, C342077o0 r4, FileDescriptor fileDescriptor, FileDescriptor fileDescriptor2, int i, int i2, boolean z, boolean z2) {
        throw new UnsupportedOperationException(AnonymousClass000.A00(1010));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0054, code lost:
        if (r14.CTO(113) != false) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized X.C21986Xoh Exn(android.media.CamcorderProfile r24, X.C342077o0 r25, java.lang.String r26, java.lang.String r27, int r28, int r29, boolean r30, boolean r31, boolean r32) {
        /*
            r23 = this;
            r7 = r23
            monitor-enter(r7)
            X.7tR r2 = r7.A00     // Catch:{ all -> 0x01c8 }
            java.lang.StringBuffer r1 = r2.A0B     // Catch:{ all -> 0x01c8 }
            java.lang.String r0 = "oStart,"
            r1.append(r0)     // Catch:{ all -> 0x01c8 }
            java.lang.Integer r0 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x01c8 }
            r2.A04 = r0     // Catch:{ all -> 0x01c8 }
            boolean r0 = r2.A0F     // Catch:{ all -> 0x01c8 }
            r6 = 0
            if (r0 != 0) goto L_0x0034
            X.7rD r8 = r2.A09     // Catch:{ all -> 0x01c8 }
            java.lang.String r11 = "ArVideoCaptureCoordinator"
            int r0 = r2.hashCode()     // Catch:{ all -> 0x01c8 }
            long r15 = (long) r0     // Catch:{ all -> 0x01c8 }
            java.lang.String r1 = "One Camera released during video recording start"
            r0 = 20000(0x4e20, float:2.8026E-41)
            X.9dU r9 = new X.9dU     // Catch:{ all -> 0x01c8 }
            r9.<init>((int) r0, (java.lang.String) r1)     // Catch:{ all -> 0x01c8 }
            java.lang.String r10 = "recording_controller_error"
            java.lang.String r12 = ""
            java.lang.String r13 = "high"
            java.lang.String r14 = "handleOpticReadyToStartRecording"
            r8.Cjw(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x01c8 }
            goto L_0x01c5
        L_0x0034:
            X.7rD r3 = r2.A09     // Catch:{ all -> 0x01c8 }
            r1 = 19
            java.lang.String r0 = "recording_camera_ready"
            r3.DD7(r1, r0)     // Catch:{ all -> 0x01c8 }
            X.7qt r5 = r2.A00     // Catch:{ all -> 0x01c8 }
            android.content.Context r0 = r5.getContext()     // Catch:{ all -> 0x01c8 }
            X.7r6 r14 = r2.A0A     // Catch:{ all -> 0x01c8 }
            boolean r0 = X.C393069vq.A00(r0, r14)     // Catch:{ all -> 0x01c8 }
            r9 = 1
            if (r0 != 0) goto L_0x0056
            r0 = 113(0x71, float:1.58E-43)
            boolean r0 = r14.CTO(r0)     // Catch:{ all -> 0x01c8 }
            r19 = 0
            if (r0 == 0) goto L_0x0058
        L_0x0056:
            r19 = 1
        L_0x0058:
            java.lang.Boolean r0 = r2.A03     // Catch:{ all -> 0x01c8 }
            if (r0 == 0) goto L_0x009b
            boolean r20 = r0.booleanValue()     // Catch:{ all -> 0x01c8 }
        L_0x0060:
            android.content.Context r11 = r5.getContext()     // Catch:{ all -> 0x01c8 }
            r0 = 171(0xab, float:2.4E-43)
            boolean r0 = r14.CTO(r0)     // Catch:{ all -> 0x01c8 }
            r21 = 1
            if (r0 != 0) goto L_0x00b7
            boolean r0 = r14 instanceof X.C343947r4     // Catch:{ all -> 0x01c8 }
            if (r0 == 0) goto L_0x0098
            r0 = r14
            X.7r4 r0 = (X.C343947r4) r0     // Catch:{ all -> 0x01c8 }
            com.instagram.common.session.UserSession r8 = r0.A00     // Catch:{ all -> 0x01c8 }
            X.0Tu r3 = X.0Tu.A06     // Catch:{ all -> 0x01c8 }
            r0 = 36593314635449439(0x82016d0000045f, double:3.2050977526846166E-306)
            long r0 = X.182.A01(r3, r8, r0)     // Catch:{ all -> 0x01c8 }
            X.0Tu r10 = X.0Tu.A05     // Catch:{ all -> 0x01c8 }
            r3 = 36593314635646048(0x82016d00030460, double:3.205097752808953E-306)
            long r3 = X.182.A01(r10, r8, r3)     // Catch:{ all -> 0x01c8 }
            long r0 = r0 + r3
        L_0x008e:
            int r4 = (int) r0     // Catch:{ all -> 0x01c8 }
            r0 = 115(0x73, float:1.61E-43)
            boolean r0 = r14.CTO(r0)     // Catch:{ all -> 0x01c8 }
            if (r0 == 0) goto L_0x00a9
            goto L_0x009e
        L_0x0098:
            r0 = 0
            goto L_0x008e
        L_0x009b:
            r20 = 0
            goto L_0x0060
        L_0x009e:
            if (r4 > 0) goto L_0x00a9
            int r1 = X.AnonymousClass0Ke.A00(r11)     // Catch:{ all -> 0x01c8 }
            r0 = 2016(0x7e0, float:2.825E-42)
            if (r1 < r0) goto L_0x00a9
            goto L_0x00b5
        L_0x00a9:
            r0 = 13
            long r0 = r14.B4o(r0)     // Catch:{ all -> 0x01c8 }
            int r3 = (int) r0     // Catch:{ all -> 0x01c8 }
            if (r3 <= 0) goto L_0x00b5
            if (r4 > r3) goto L_0x00b5
            goto L_0x00b7
        L_0x00b5:
            r21 = 0
        L_0x00b7:
            X.7tG r0 = r2.A00     // Catch:{ all -> 0x01c8 }
            X.7tF r0 = (X.C345287tF) r0     // Catch:{ all -> 0x01c8 }
            X.7n6 r0 = r0.A00     // Catch:{ all -> 0x01c8 }
            if (r0 == 0) goto L_0x00c2
            int r1 = r0.A02     // Catch:{ all -> 0x01c8 }
            goto L_0x00c3
        L_0x00c2:
            r1 = 0
        L_0x00c3:
            if (r0 == 0) goto L_0x00c6
            goto L_0x00c8
        L_0x00c6:
            r0 = 0
            goto L_0x00ca
        L_0x00c8:
            int r0 = r0.A01     // Catch:{ all -> 0x01c8 }
        L_0x00ca:
            X.ADm r15 = r2.A01     // Catch:{ all -> 0x01c8 }
            r3 = 0
            X.AUM r12 = new X.AUM     // Catch:{ all -> 0x01c8 }
            r13 = r24
            r16 = r29
            r22 = r32
            r17 = r1
            r18 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x01c8 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x01c8 }
            r4.<init>()     // Catch:{ all -> 0x01c8 }
            r4.add(r12)     // Catch:{ all -> 0x01c8 }
            if (r31 == 0) goto L_0x013b
            X.7qg r1 = X.C345257tC.A00     // Catch:{ all -> 0x01c8 }
            boolean r0 = r5.CQN(r1)     // Catch:{ all -> 0x01c8 }
            if (r0 == 0) goto L_0x0116
            X.7qe r0 = r5.Ape(r1)     // Catch:{ all -> 0x01c8 }
            X.7tC r0 = (X.C345257tC) r0     // Catch:{ all -> 0x01c8 }
            X.7tB r0 = (X.C345247tB) r0     // Catch:{ all -> 0x01c8 }
            X.7mr r0 = r0.A02     // Catch:{ all -> 0x01c8 }
            if (r0 == 0) goto L_0x0116
            X.7r6 r8 = r0.A0M     // Catch:{ all -> 0x01c8 }
            r0 = 76
            boolean r1 = r8.CTP(r0)     // Catch:{ all -> 0x01c8 }
            r0 = 2
            if (r1 == 0) goto L_0x0106
            r0 = 4
        L_0x0106:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01c8 }
            r0 = 22
            long r0 = r8.B4o(r0)     // Catch:{ all -> 0x01c8 }
            int r8 = (int) r0     // Catch:{ all -> 0x01c8 }
            if (r8 > 0) goto L_0x0119
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0119
        L_0x0116:
            r8 = r6
            r5 = r6
            goto L_0x011d
        L_0x0119:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x01c8 }
        L_0x011d:
            X.ADm r0 = r2.A01     // Catch:{ all -> 0x01c8 }
            X.7qG r0 = X.C345407tR.A00(r14, r0, r5, r8, r3)     // Catch:{ all -> 0x01c8 }
            r4.add(r0)     // Catch:{ all -> 0x01c8 }
            X.ADm r1 = r2.A01     // Catch:{ all -> 0x01c8 }
            if (r1 == 0) goto L_0x013b
            java.lang.Boolean r0 = r1.A03     // Catch:{ all -> 0x01c8 }
            if (r0 == 0) goto L_0x013b
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01c8 }
            if (r0 == 0) goto L_0x013b
            X.7qG r0 = X.C345407tR.A00(r14, r1, r5, r8, r9)     // Catch:{ all -> 0x01c8 }
            r4.add(r0)     // Catch:{ all -> 0x01c8 }
        L_0x013b:
            X.A9v r1 = r12.A01     // Catch:{ all -> 0x01c8 }
            boolean r0 = r1.A09     // Catch:{ all -> 0x01c8 }
            r10 = 0
            if (r0 == 0) goto L_0x018a
            r0 = 2
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01c8 }
            int r0 = r1.A01     // Catch:{ all -> 0x01c8 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01c8 }
            int r0 = r1.A02     // Catch:{ all -> 0x01c8 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01c8 }
        L_0x0153:
            int r11 = r1.A05     // Catch:{ all -> 0x01c8 }
            int r0 = r1.A04     // Catch:{ all -> 0x01c8 }
            X.Xnz r1 = new X.Xnz     // Catch:{ all -> 0x01c8 }
            r9 = r26
            r14 = r1
            r15 = r6
            r16 = r9
            r17 = r11
            r18 = r0
            r19 = r3
            r20 = r28
            r14.<init>(r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x01c8 }
            X.XZ9 r3 = X.C21986Xoh.A0T     // Catch:{ all -> 0x01c8 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r31)     // Catch:{ all -> 0x01c8 }
            r1.A01(r3, r0)     // Catch:{ all -> 0x01c8 }
            X.XZ9 r3 = X.C21986Xoh.A0N     // Catch:{ all -> 0x01c8 }
            int r0 = r13.audioCodec     // Catch:{ all -> 0x01c8 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01c8 }
            r1.A01(r3, r0)     // Catch:{ all -> 0x01c8 }
            X.XZ9 r3 = X.C21986Xoh.A0Z     // Catch:{ all -> 0x01c8 }
            int r0 = r13.videoCodec     // Catch:{ all -> 0x01c8 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01c8 }
            r1.A01(r3, r0)     // Catch:{ all -> 0x01c8 }
            goto L_0x018d
        L_0x018a:
            r8 = r6
            r5 = r6
            goto L_0x0153
        L_0x018d:
            if (r10 == 0) goto L_0x0194
            X.XZ9 r0 = X.C21986Xoh.A0O     // Catch:{ all -> 0x01c8 }
            r1.A01(r0, r10)     // Catch:{ all -> 0x01c8 }
        L_0x0194:
            if (r8 == 0) goto L_0x019b
            X.XZ9 r0 = X.C21986Xoh.A0P     // Catch:{ all -> 0x01c8 }
            r1.A01(r0, r8)     // Catch:{ all -> 0x01c8 }
        L_0x019b:
            if (r5 == 0) goto L_0x01a2
            X.XZ9 r0 = X.C21986Xoh.A0Q     // Catch:{ all -> 0x01c8 }
            r1.A01(r0, r5)     // Catch:{ all -> 0x01c8 }
        L_0x01a2:
            X.Xoh r8 = new X.Xoh     // Catch:{ all -> 0x01c8 }
            r8.<init>(r1)     // Catch:{ all -> 0x01c8 }
            X.7nI r5 = r2.A02     // Catch:{ all -> 0x01c8 }
            X.7tG r3 = r2.A00     // Catch:{ all -> 0x01c8 }
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x01c8 }
            r1.<init>(r9)     // Catch:{ all -> 0x01c8 }
            X.ADm r0 = r2.A01     // Catch:{ all -> 0x01c8 }
            X.AD9 r1 = r3.AMQ(r6, r0, r1)     // Catch:{ all -> 0x01c8 }
            X.AUI r0 = new X.AUI     // Catch:{ all -> 0x01c8 }
            r0.<init>(r2, r12, r8)     // Catch:{ all -> 0x01c8 }
            r5.A02(r1, r0, r4)     // Catch:{ all -> 0x01c8 }
            X.9dU r0 = r2.A0D     // Catch:{ all -> 0x01c8 }
            r2.A0D = r6     // Catch:{ all -> 0x01c8 }
            if (r0 != 0) goto L_0x01c7
            r6 = r8
        L_0x01c5:
            monitor-exit(r7)
            return r6
        L_0x01c7:
            throw r0     // Catch:{ all -> 0x01c8 }
        L_0x01c8:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C341817nZ.Exn(android.media.CamcorderProfile, X.7o0, java.lang.String, java.lang.String, int, int, boolean, boolean, boolean):X.Xoh");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0080, code lost:
        if (r1 == null) goto L_0x0082;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void EyQ() {
        /*
            r18 = this;
            r0 = r18
            monitor-enter(r0)
            X.7tR r3 = r0.A00     // Catch:{ all -> 0x008a }
            java.lang.StringBuffer r2 = r3.A0B     // Catch:{ all -> 0x008a }
            java.lang.String r1 = "oStop,"
            r2.append(r1)     // Catch:{ all -> 0x008a }
            java.lang.Integer r1 = X.AnonymousClass05K.A0u     // Catch:{ all -> 0x008a }
            r3.A04 = r1     // Catch:{ all -> 0x008a }
            java.util.concurrent.atomic.AtomicBoolean r6 = r3.A0C     // Catch:{ all -> 0x008a }
            boolean r1 = r6.get()     // Catch:{ all -> 0x008a }
            if (r1 != 0) goto L_0x0036
            X.7rD r4 = r3.A09     // Catch:{ all -> 0x008a }
            java.lang.String r7 = "ArVideoCaptureCoordinator"
            int r1 = r3.hashCode()     // Catch:{ all -> 0x008a }
            long r11 = (long) r1     // Catch:{ all -> 0x008a }
            java.lang.String r2 = "Optics calls stop recording without start"
            r1 = 20000(0x4e20, float:2.8026E-41)
            X.9dU r5 = new X.9dU     // Catch:{ all -> 0x008a }
            r5.<init>((int) r1, (java.lang.String) r2)     // Catch:{ all -> 0x008a }
            java.lang.String r6 = "recording_controller_error"
            java.lang.String r8 = ""
            java.lang.String r9 = "low"
            java.lang.String r10 = "handleOpticReadyToStopRecording"
            r4.Cjw(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x008a }
            goto L_0x0082
        L_0x0036:
            X.7rD r9 = r3.A09     // Catch:{ all -> 0x008a }
            r2 = 19
            java.lang.String r1 = "recording_camera_stop_finished"
            r9.DD7(r2, r1)     // Catch:{ all -> 0x008a }
            r2 = 1
            java.util.concurrent.CountDownLatch r1 = new java.util.concurrent.CountDownLatch     // Catch:{ all -> 0x008a }
            r1.<init>(r2)     // Catch:{ all -> 0x008a }
            r3.A05 = r1     // Catch:{ all -> 0x008a }
            X.7nI r1 = r3.A02     // Catch:{ all -> 0x008a }
            r5 = 0
            r1.A01()     // Catch:{ all -> 0x008a }
            r4 = 0
            java.util.concurrent.CountDownLatch r8 = r3.A05     // Catch:{ InterruptedException -> 0x0058 }
            r1 = 12
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0058 }
            r8.await(r1, r7)     // Catch:{ InterruptedException -> 0x0058 }
            goto L_0x0075
        L_0x0058:
            java.lang.String r11 = "recording_controller_error"
            java.lang.String r12 = "ArVideoCaptureCoordinator"
            int r1 = r3.hashCode()     // Catch:{ all -> 0x0084 }
            long r1 = (long) r1     // Catch:{ all -> 0x0084 }
            java.lang.String r13 = ""
            java.lang.String r8 = "Stop recording timeout"
            r7 = 20000(0x4e20, float:2.8026E-41)
            X.9dU r10 = new X.9dU     // Catch:{ all -> 0x0084 }
            r10.<init>((int) r7, (java.lang.String) r8)     // Catch:{ all -> 0x0084 }
            java.lang.String r14 = "low"
            java.lang.String r15 = "handleOpticReadyToStopRecording"
            r16 = r1
            r9.Cjw(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0084 }
        L_0x0075:
            r3.A05 = r4     // Catch:{ all -> 0x008a }
            r3.A01 = r4     // Catch:{ all -> 0x008a }
            r6.set(r5)     // Catch:{ all -> 0x008a }
            X.9dU r1 = r3.A0D     // Catch:{ all -> 0x008a }
            r3.A0D = r4     // Catch:{ all -> 0x008a }
            if (r1 != 0) goto L_0x0089
        L_0x0082:
            monitor-exit(r0)
            return
        L_0x0084:
            r1 = move-exception
            r3.A05 = r4     // Catch:{ all -> 0x008a }
            r3.A01 = r4     // Catch:{ all -> 0x008a }
        L_0x0089:
            throw r1     // Catch:{ all -> 0x008a }
        L_0x008a:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C341817nZ.EyQ():void");
    }
}
