package X;

import com.instagram.creation.cameraconfiguration.CameraConfiguration;

/* renamed from: X.Aun  reason: case insensitive filesystem */
public final /* synthetic */ class C41489Aun implements C61910qF, C3495480u {
    public final /* synthetic */ C352848Fg A00;

    public C41489Aun(C352848Fg r1) {
        this.A00 = r1;
    }

    public final AnonymousClass0eL getFunctionDelegate() {
        return new 03J(1, this.A00, C352848Fg.class, "onCameraConfigurationChanged", "onCameraConfigurationChanged(Lcom/instagram/creation/cameraconfiguration/CameraConfiguration;)V", 0);
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
        CameraConfiguration cameraConfiguration = (CameraConfiguration) obj;
        0qQ.A0B(cameraConfiguration, 0);
        0qQ.A0K(cameraConfiguration.A03, AnonymousClass80J.A00);
    }
}
