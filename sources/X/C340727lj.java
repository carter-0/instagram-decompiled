package X;

import android.media.MediaRecorder;

/* renamed from: X.7lj  reason: invalid class name and case insensitive filesystem */
public final class C340727lj implements C340737lk {
    public final /* synthetic */ C340597lW A00;

    public final void DQi(MediaRecorder mediaRecorder, int i, int i2, boolean z) {
    }

    public final void Djc(MediaRecorder mediaRecorder) {
        String str;
        try {
            mediaRecorder.setVideoSource(2);
        } catch (Exception e) {
            if (e.getMessage() != null) {
                str = e.getMessage();
            } else {
                str = "";
            }
            C340577lU.A02("Camera2Device.setVideoRecordingSource", str);
        }
    }

    public C340727lj(C340597lW r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0072, code lost:
        if (java.lang.Boolean.TRUE.equals(r5.A02(X.C342717p3.A0K)) == false) goto L_0x0074;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DmV(android.media.MediaRecorder r11) {
        /*
            r10 = this;
            X.7lW r2 = r10.A00
            X.7lm r1 = r2.A0Z
            java.lang.String r0 = "Method onStartMediaRecorder() must run on the Optic Background Thread."
            r1.A06(r0)
            X.7lu r3 = r2.A0R
            X.7lr r1 = r3.A0J
            java.lang.String r0 = "Can only check if the prepared on the Optic thread"
            r1.A01(r0)
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x001e
            java.lang.String r1 = "Camera2Device"
            java.lang.String r0 = "Can not start video recording, PreviewController is not prepared"
            X.C340577lU.A03(r1, r0)
            return
        L_0x001e:
            X.7ls r0 = r2.A0S
            r2 = 1
            r0.A0C = r2
            android.view.Surface r8 = r11.getSurface()
            java.lang.String r0 = "Cannot start video recording."
            r1.A00(r0)
            android.hardware.camera2.CaptureRequest$Builder r0 = r3.A02
            if (r0 == 0) goto L_0x00c7
            android.view.Surface r0 = r3.A04
            if (r0 == 0) goto L_0x00c7
            X.7p0 r1 = r3.A0F
            if (r1 == 0) goto L_0x004e
            X.7p1 r0 = X.C342687p0.A0c
            java.lang.Object r0 = r1.A01(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x004e
            java.lang.String r1 = "Cannot start video native capture, not supported!"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x004e:
            X.7p0 r1 = r3.A0F
            r4 = 0
            if (r1 == 0) goto L_0x0074
            X.7p1 r0 = X.C342687p0.A0J
            java.lang.Object r0 = r1.A01(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0074
            X.7p2 r5 = r3.A0A
            if (r5 == 0) goto L_0x0074
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            X.7p4 r0 = X.C342717p3.A0K
            java.lang.Object r0 = r5.A02(r0)
            boolean r0 = r1.equals(r0)
            r9 = 1
            if (r0 != 0) goto L_0x0075
        L_0x0074:
            r9 = 0
        L_0x0075:
            r0 = 0
            X.7pv r7 = new X.7pv
            r7.<init>(r8, r4, r0)
            android.view.Surface r6 = r3.A04
            X.7pv r5 = new X.7pv
            r5.<init>(r6, r4, r0)
            if (r9 == 0) goto L_0x008f
            X.7pv r7 = new X.7pv
            r7.<init>(r8, r2, r0)
            X.7pv r5 = new X.7pv
            r5.<init>(r6, r2, r0)
        L_0x008f:
            r3.A06 = r8
            X.7pv[] r0 = new X.C343257pv[]{r5, r7}
            java.util.List r1 = java.util.Arrays.asList(r0)
            X.7pz r0 = r3.A09
            if (r0 == 0) goto L_0x00a0
            r0.close()
        L_0x00a0:
            java.lang.String r0 = "record_video_on_camera_thread"
            X.7pz r0 = X.C340837lu.A00(r3, r0, r1, r9)
            r3.A09 = r0
            android.hardware.camera2.CaptureRequest$Builder r0 = r3.A02
            r0.addTarget(r8)
            X.7po r1 = r3.A08
            r1.getClass()
            r0 = 7
            r1.A0H = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r1.A0B = r0
            r0 = 0
            r1.A01 = r0
            r3.A09(r4)
            java.lang.String r0 = "Preview session was closed while starting recording."
            r3.A0A(r2, r0)
            return
        L_0x00c7:
            java.lang.String r1 = "Cannot start video recording, preview closed."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C340727lj.DmV(android.media.MediaRecorder):void");
    }
}
