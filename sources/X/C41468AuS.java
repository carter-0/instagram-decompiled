package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Map;

/* renamed from: X.AuS  reason: case insensitive filesystem */
public final /* synthetic */ class C41468AuS implements 0sP {
    public final /* synthetic */ C337587ga A00;
    public final /* synthetic */ C337557gX A01;

    public /* synthetic */ C41468AuS(C337587ga r1, C337557gX r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final Object invoke(Object obj) {
        int i;
        C337557gX r0 = this.A01;
        C337587ga r2 = this.A00;
        Map map = (Map) obj;
        C337657gh r02 = r0.A02;
        if (r02 != null) {
            i = r02.hashCode();
        } else {
            i = -1;
        }
        map.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, Integer.valueOf(i));
        map.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r2.A09);
        return C60340gF.A00;
    }
}
