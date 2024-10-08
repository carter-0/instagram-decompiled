package X;

import com.instagram.ui.widget.volume.VolumeIndicator;

/* renamed from: X.PXm  reason: case insensitive filesystem */
public final class C73151PXm implements Runnable {
    public final /* synthetic */ VolumeIndicator A00;

    public C73151PXm(VolumeIndicator volumeIndicator) {
        this.A00 = volumeIndicator;
    }

    public final void run() {
        VolumeIndicator volumeIndicator = this.A00;
        C66581MXm.A0D(volumeIndicator.animate()).setListener(new C69202Nh0(volumeIndicator, 5)).alpha(0.0f);
    }
}
