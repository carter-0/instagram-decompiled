package X;

import com.instagram.igds.components.switchbutton.IgdsSwitch;

public final class M83 implements Runnable {
    public final /* synthetic */ IgdsSwitch A00;
    public final /* synthetic */ C60058JeZ A01;

    public M83(IgdsSwitch igdsSwitch, C60058JeZ jeZ) {
        this.A01 = jeZ;
        this.A00 = igdsSwitch;
    }

    public final void run() {
        C60058JeZ jeZ = this.A01;
        jeZ.A0L.A00(jeZ.A0H, this.A00, jeZ.A0J);
    }
}
