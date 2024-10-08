package X;

import com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem;
import java.util.Map;

/* renamed from: X.8ET  reason: invalid class name */
public final class AnonymousClass8ET extends C232922uf {
    public final /* synthetic */ AnonymousClass8EL A00;

    public AnonymousClass8ET(AnonymousClass8EL r1) {
        this.A00 = r1;
    }

    public final void DmE(2cs r7) {
        AnonymousClass8EL r5 = this.A00;
        C358088aL r4 = C358088aL.A0g;
        float f = (float) r5.A0B.A09.A00;
        for (Map.Entry entry : r5.A0I.entrySet()) {
            Object key = entry.getKey();
            CameraToolMenuItem cameraToolMenuItem = (CameraToolMenuItem) entry.getValue();
            if (key == r4) {
                AnonymousClass8EL.A04(r5, cameraToolMenuItem, f);
            }
        }
    }
}
