package X;

import androidx.window.sidecar.SidecarDisplayFeature;

public final class TWf extends 0Yg implements 0sP {
    public static final TWf A00 = new TWf();

    public TWf() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        SidecarDisplayFeature sidecarDisplayFeature = (SidecarDisplayFeature) obj;
        0qQ.A0B(sidecarDisplayFeature, 0);
        boolean z = true;
        if (!(sidecarDisplayFeature.getType() == 1 || sidecarDisplayFeature.getType() == 2)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
