package X;

import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import java.util.Set;

/* renamed from: X.8Hs  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C353458Hs implements C61910qF, C3495480u {
    public final /* synthetic */ C353398Hl A00;

    public C353458Hs(C353398Hl r1) {
        this.A00 = r1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3495480u) || !(obj instanceof C61910qF)) {
            return false;
        }
        return 0qQ.A0K(getFunctionDelegate(), ((C61910qF) obj).getFunctionDelegate());
    }

    public final AnonymousClass0eL getFunctionDelegate() {
        return new 03J(1, this.A00, C353398Hl.class, "onCameraConfigurationChanged", "onCameraConfigurationChanged(Lcom/instagram/creation/cameraconfiguration/CameraConfiguration;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        AnonymousClass8Ho r0;
        CameraConfiguration cameraConfiguration = (CameraConfiguration) obj;
        0qQ.A0B(cameraConfiguration, 0);
        C353398Hl r4 = this.A00;
        C41832B2n b2n = r4.A01;
        if (b2n != null) {
            r0 = b2n.BN9();
        } else {
            r0 = null;
        }
        if (r0 instanceof C353438Hq) {
            boolean z = r4.A05;
            C279284yO r2 = cameraConfiguration.A03;
            C3494680m r1 = r4.A0A.A09;
            if (z != C358218aY.A00(r2, (Set) r1.A00)) {
                r4.A05 = C358218aY.A00(r2, (Set) r1.A00);
                C353398Hl.A02(r2, r4);
            }
        }
    }
}
