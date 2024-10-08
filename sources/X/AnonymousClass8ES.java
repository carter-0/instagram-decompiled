package X;

import com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem;

/* renamed from: X.8ES  reason: invalid class name */
public final class AnonymousClass8ES extends C232922uf {
    public final /* synthetic */ AnonymousClass8EL A00;

    public AnonymousClass8ES(AnonymousClass8EL r1) {
        this.A00 = r1;
    }

    public final void DmC(2cs r6) {
        Double valueOf;
        if (r6 != null && (valueOf = Double.valueOf(r6.A01)) != null && valueOf.doubleValue() == 0.0d) {
            this.A00.A0G.A00(false);
        }
    }

    public final void DmE(2cs r10) {
        AnonymousClass8EL r8 = this.A00;
        float f = (float) r8.A0D.A09.A00;
        for (CameraToolMenuItem cameraToolMenuItem : r8.A0J) {
            if (!0qQ.A0K(cameraToolMenuItem, r8.A07) || r8.A0C.A01 != 0.0d) {
                AnonymousClass8EL.A04(r8, cameraToolMenuItem, f);
            } else {
                AnonymousClass8EL.A04(r8, cameraToolMenuItem, 0.0f);
            }
        }
    }
}
