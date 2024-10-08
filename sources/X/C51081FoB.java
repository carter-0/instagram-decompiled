package X;

import com.instagram.igds.components.switchbutton.IgdsSwitch;

/* renamed from: X.FoB  reason: case insensitive filesystem */
public final class C51081FoB implements C59557JOd {
    public final /* synthetic */ AnonymousClass3FW A00;
    public final /* synthetic */ E3D A01;

    public C51081FoB(AnonymousClass3FW r1, E3D e3d) {
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
        long j2 = j;
        E3D.A0D(e3d, j2, this.A00.A00(), igdsSwitch.isChecked(), true);
    }
}
