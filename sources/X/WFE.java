package X;

import com.facebook.android.maps.model.CameraPosition;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.instagram.archive.fragment.ArchiveReelMapFragment;

public final class WFE implements X2A {
    public final int A00;
    public final Object A01;

    public WFE(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void D02(CameraPosition cameraPosition) {
        if (this.A00 != 0) {
            C18016Vjs vjs = (C18016Vjs) this.A01;
            if (!vjs.A03.A0I.A0W) {
                WFX wfx = vjs.A06;
                int i = vjs.A00;
                V3J v3j = wfx.A0A;
                UserFlowLogger userFlowLogger = v3j.A01;
                if (userFlowLogger != null) {
                    userFlowLogger.markPointWithEditor(v3j.A00, "cluster_end").addPointData("is_interactive", true).addPointData("reclusterCount", i).markerEditingCompleted();
                }
                vjs.A00 = 0;
                return;
            }
            return;
        }
        ((ArchiveReelMapFragment) this.A01).A02.A01(cameraPosition);
    }
}
