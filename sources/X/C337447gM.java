package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Map;

/* renamed from: X.7gM  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C337447gM implements 0sP {
    public final /* synthetic */ 2Wh A00;

    public /* synthetic */ C337447gM(2Wh r1) {
        this.A00 = r1;
    }

    public final Object invoke(Object obj) {
        Map map = (Map) obj;
        map.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, Integer.valueOf(this.A00.hashCode()));
        map.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "SectionsRecyclerView");
        return C60340gF.A00;
    }
}
