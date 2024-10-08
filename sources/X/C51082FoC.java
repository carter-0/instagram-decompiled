package X;

import com.instagram.igds.components.switchbutton.IgdsSwitch;

/* renamed from: X.FoC  reason: case insensitive filesystem */
public final class C51082FoC implements C59557JOd {
    public final /* synthetic */ AnonymousClass3FW A00;
    public final /* synthetic */ E3D A01;

    public C51082FoC(AnonymousClass3FW r1, E3D e3d) {
        this.A01 = e3d;
        this.A00 = r1;
    }

    public final void Drf(long j) {
        E3D e3d = this.A01;
        IgdsSwitch igdsSwitch = e3d.A0L;
        if (igdsSwitch == null) {
            0qQ.A0F("quietModeToggle");
            throw AnonymousClass00P.createAndThrow();
        }
        E3D.A0D(e3d, this.A00.A01(), j, igdsSwitch.isChecked(), false);
    }
}
