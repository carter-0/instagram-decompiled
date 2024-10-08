package X;

import com.instagram.creation.cameraconfiguration.CameraConfiguration;

/* renamed from: X.Auo  reason: case insensitive filesystem */
public final /* synthetic */ class C41490Auo implements C61910qF, C3495480u {
    public final /* synthetic */ C352828Fe A00;

    public C41490Auo(C352828Fe r1) {
        this.A00 = r1;
    }

    public final AnonymousClass0eL getFunctionDelegate() {
        return new 03J(1, this.A00, C352828Fe.class, "onCameraConfigurationChanged", "onCameraConfigurationChanged(Lcom/instagram/creation/cameraconfiguration/CameraConfiguration;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3495480u) || !(obj instanceof C61910qF)) {
            return false;
        }
        return AnonymousClass7TG.A1Y(obj, getFunctionDelegate());
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        int i;
        CameraConfiguration cameraConfiguration = (CameraConfiguration) obj;
        0qQ.A0B(cameraConfiguration, 0);
        C352828Fe r3 = this.A00;
        C279284yO r2 = cameraConfiguration.A03;
        AnonymousClass80K r1 = AnonymousClass80K.A00;
        if (r2 == r1) {
            i = 22;
        } else {
            if (r3.A00 == r1) {
                r3.A08.A0C();
                i = 23;
            }
            r3.A00 = r2;
        }
        C352828Fe.A00(r3, new C51765G0h(r3, i));
        r3.A00 = r2;
    }
}
