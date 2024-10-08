package X;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.SystemClock;
import android.view.Surface;
import java.io.FileDescriptor;

/* renamed from: X.7ls  reason: invalid class name and case insensitive filesystem */
public final class C340817ls {
    public long A00;
    public C340827lt A01;
    public C340837lu A02;
    public C342707p2 A03;
    public C340167ko A04;
    public C342687p0 A05;
    public C21986Xoh A06;
    public C341827na A07;
    public final C340777lo A08;
    public final C340807lr A09;
    public final C340757lm A0A;
    public volatile CameraDevice A0B;
    public volatile boolean A0C;
    public volatile boolean A0D;

    public final Exception A00() {
        Surface surface;
        this.A09.A01("Method stopVideoRecording() must be run on the background thread.");
        C341827na r0 = this.A07;
        if (r0 != null) {
            try {
                r0.EyQ();
                e = null;
            } catch (Exception e) {
                e = e;
            }
            this.A07 = null;
        } else {
            e = null;
        }
        C340837lu r2 = this.A02;
        if (r2 != null) {
            C340807lr r1 = r2.A0J;
            r1.A01("Can only stop video recording on the Optic thread");
            r1.A01("Can only check if the prepared on the Optic thread");
            if (r1.A00) {
                CaptureRequest.Builder builder = r2.A02;
                if (!(builder == null || (surface = r2.A06) == null)) {
                    builder.removeTarget(surface);
                }
                r2.A06 = null;
            }
        }
        this.A06 = null;
        this.A0D = false;
        this.A0C = false;
        return e;
    }

    public final void A01(CaptureRequest.Builder builder, AnonymousClass8GD r22, C340737lk r23, C343187po r24, C341047mF r25, FileDescriptor fileDescriptor, String str, int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        C340837lu r0 = this.A02;
        AnonymousClass8GD r3 = r22;
        if (r0 == null || !r0.A0S || this.A03 == null) {
            r3.A01(new IllegalStateException("Cannot start recording video, camera is not ready or has been closed."));
        } else if (this.A0D) {
            r3.A01(new IllegalStateException("Cannot start recording video, there is a video already being recorded"));
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C342707p2 r02 = this.A03;
            C342727p4 r2 = C342717p3.A0y;
            Object A022 = r02.A02(r2);
            C342707p2 r03 = this.A03;
            if (A022 == null) {
                r2 = C342717p3.A0q;
            }
            C343047pa r9 = (C343047pa) r03.A02(r2);
            FileDescriptor fileDescriptor2 = fileDescriptor;
            String str2 = str;
            if (str == null && fileDescriptor == null) {
                r3.A01(new IllegalArgumentException("Cannot start recording video, both filePath and fileDescriptor cannot be null, one must contain a valid value"));
                return;
            }
            this.A0D = true;
            this.A0C = false;
            CaptureRequest.Builder builder2 = builder;
            C343187po r8 = r24;
            this.A0A.A00(new C364348lH(builder2, r3, this, r8, z3), "start_video_recording", new C41366Asn(builder2, r23, this, r8, r9, r25, fileDescriptor2, str2, i, i2, i3, elapsedRealtime, z, z2));
        }
    }

    public C340817ls(C340777lo r2, C340757lm r3) {
        this.A0A = r3;
        this.A08 = r2;
        this.A09 = new C340807lr(r3);
    }
}
