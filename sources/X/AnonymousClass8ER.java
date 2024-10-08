package X;

import com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem;

/* renamed from: X.8ER  reason: invalid class name */
public final class AnonymousClass8ER extends C232922uf {
    public final /* synthetic */ AnonymousClass8EL A00;

    public AnonymousClass8ER(AnonymousClass8EL r1) {
        this.A00 = r1;
    }

    public final void DmE(2cs r9) {
        AnonymousClass8EL r7 = this.A00;
        2cs r2 = r7.A0C;
        float f = (float) r2.A09.A00;
        float f2 = (float) r2.A01;
        for (CameraToolMenuItem cameraToolMenuItem : r7.A0J) {
            cameraToolMenuItem.A02 = f;
            if (Float.valueOf(f2).equals(Double.valueOf(1.0d))) {
                cameraToolMenuItem.A0Q.A04();
            }
            CameraToolMenuItem.A02(cameraToolMenuItem);
        }
        r7.EBG();
        AnonymousClass8EA r0 = r7.A0G.A00;
        AnonymousClass8EA.A01(r0);
        AnonymousClass8EA.A02(r0);
    }
}
