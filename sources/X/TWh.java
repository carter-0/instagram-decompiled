package X;

import androidx.window.sidecar.SidecarDisplayFeature;

public final class TWh extends 0Yg implements 0sP {
    public static final TWh A00 = new TWh();

    public TWh() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        SidecarDisplayFeature sidecarDisplayFeature = (SidecarDisplayFeature) obj;
        0qQ.A0B(sidecarDisplayFeature, 0);
        boolean z = true;
        if (!(sidecarDisplayFeature.getType() != 1 || sidecarDisplayFeature.getRect().width() == 0 || sidecarDisplayFeature.getRect().height() == 0)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
