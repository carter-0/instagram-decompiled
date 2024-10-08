package X;

import com.instagram.camera.effect.models.CameraAREffect;

/* renamed from: X.82B  reason: invalid class name */
public final class AnonymousClass82B implements AnonymousClass82C {
    public final /* synthetic */ AnonymousClass82A A00;

    public AnonymousClass82B(AnonymousClass82A r1) {
        this.A00 = r1;
    }

    public final void DBZ(CameraAREffect cameraAREffect, boolean z, boolean z2) {
        AnonymousClass82A r3 = this.A00;
        boolean z3 = true;
        r3.A03 = true;
        r3.A05 = true;
        r3.A00 = 0.0d;
        boolean z4 = r3.A04;
        AnonymousClass82X r1 = r3.A01;
        if (z4) {
            if (r1 == null) {
                return;
            }
        } else if (r1 != null) {
            z3 = false;
        } else {
            return;
        }
        r1.A01 = z3;
        AnonymousClass82X.A00(r1, (Integer) null);
    }
}
