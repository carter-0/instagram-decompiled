package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;

public final class KA6 extends 1P0 {
    public UserSession A00;
    public final /* synthetic */ LAY A01;

    public KA6(UserSession userSession, LAY lay) {
        this.A01 = lay;
        this.A00 = userSession;
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [X.KHA, X.11X] */
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int A03 = AnonymousClass0fD.A03(-1728334691);
        int A032 = AnonymousClass0fD.A03(1394812817);
        C60901JtL jtL = ((C61273K0i) obj).A00;
        if (jtL == null) {
            C41845B3m.A0v();
            throw AnonymousClass00P.createAndThrow();
        }
        String str = jtL.A00;
        if (str == null) {
            i = 1818940943;
        } else {
            LAY lay = this.A01;
            UserSession userSession = this.A00;
            C63578KzR kzR = new C63578KzR();
            kzR.A00.putByteArray(PublicKeyCredentialControllerUtility.JSON_KEY_CHALLENGE, LAY.A07.A03(str));
            kzR.A00.putBoolean("useDebugKey", false);
            1ES.A03(new KHA(3, lay, userSession, kzR));
            i = -1474190458;
        }
        AnonymousClass0fD.A0A(i, A032);
        AnonymousClass0fD.A0A(-1489168822, A03);
    }
}
