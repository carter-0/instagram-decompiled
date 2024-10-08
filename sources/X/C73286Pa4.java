package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Map;

/* renamed from: X.Pa4  reason: case insensitive filesystem */
public final class C73286Pa4 implements Runnable {
    public final /* synthetic */ C69661Npj A00;
    public final /* synthetic */ OLX A01;
    public final /* synthetic */ OBD A02;

    public C73286Pa4(C69661Npj npj, OLX olx, OBD obd) {
        this.A01 = olx;
        this.A02 = obd;
        this.A00 = npj;
    }

    public final void run() {
        OLX olx = this.A01;
        olx.A00();
        if (!olx.A01) {
            OBD obd = this.A02;
            C308276Tl r0 = new C308276Tl();
            r0.A01(PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT);
            C299275ur.A00(obd.A00, r0.A00(), obd.A01);
            this.A00.A00("client_flashcall_not_found_time_out", (Map) null);
        }
    }
}
