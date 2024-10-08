package X;

import android.hardware.camera2.CameraDevice;
import java.util.concurrent.ExecutionException;

/* renamed from: X.7la  reason: invalid class name and case insensitive filesystem */
public final class C340637la implements C340647lb {
    public final /* synthetic */ C340597lW A00;

    public C340637la(C340597lW r1) {
        this.A00 = r1;
    }

    public final void onCameraClosed(CameraDevice cameraDevice) {
        C340597lW r4 = this.A00;
        if (r4.A0j == cameraDevice) {
            C340837lu r2 = r4.A0R;
            C341897nh r0 = r2.A0E;
            if (r0 != null) {
                r0.onCameraClosed(cameraDevice);
            }
            C341877nf r3 = r4.A0l;
            if (r3 != null) {
                String A02 = r4.A0Y.A02();
                if (!r3.A00.isEmpty()) {
                    C342057ny.A00(new C367468qn(r3, A02));
                }
            }
            r4.A0q = false;
            r4.A0r = false;
            r4.A0j = null;
            r4.A0D = null;
            r4.A08 = null;
            r4.A09 = null;
            r4.A05 = null;
            C342627ou r5 = r4.A07;
            if (r5 != null) {
                r5.A0E.removeMessages(1);
                r5.A08 = null;
                r5.A06 = null;
                r5.A07 = null;
                r5.A05 = null;
                r5.A04 = null;
                r5.A0A = null;
                r5.A0D = null;
                r5.A0C = null;
            }
            r4.A0Q.A0G = false;
            r4.A0P.A00();
            C340817ls r1 = r4.A0S;
            if (r1.A0D && (!r4.A0s || r1.A0C)) {
                try {
                    r4.A0Z.A00(new C364648ll(this), "on_camera_closed_stop_video_recording", new C41299Arf(this)).get();
                } catch (InterruptedException | ExecutionException e) {
                    C340577lU.A00(4, 0, e);
                }
            }
            if (r2.A09 != null) {
                synchronized (C340837lu.A0U) {
                    C343187po r02 = r2.A08;
                    if (r02 != null) {
                        r02.A0J = false;
                        r2.A08 = null;
                    }
                }
                try {
                    r2.A09.A6w();
                    r2.A09.close();
                } catch (Exception unused) {
                }
                r2.A09 = null;
            }
            String id = cameraDevice.getId();
            C340617lY r12 = r4.A0N;
            if (id.equals(r12.A00)) {
                r12.A01();
                r12.A00 = null;
            }
        }
    }
}
