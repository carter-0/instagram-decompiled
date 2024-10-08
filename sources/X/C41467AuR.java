package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.bridge.BaseJavaModule;
import java.util.Map;

/* renamed from: X.AuR  reason: case insensitive filesystem */
public final /* synthetic */ class C41467AuR implements 0sP {
    public final /* synthetic */ C337587ga A00;
    public final /* synthetic */ C337657gh A01;

    public /* synthetic */ C41467AuR(C337587ga r1, C337657gh r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final Object invoke(Object obj) {
        String str;
        C337657gh r0 = this.A01;
        C337587ga r2 = this.A00;
        Map map = (Map) obj;
        map.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, Integer.valueOf(r0.hashCode()));
        if (r2 != null) {
            str = r2.A09;
        } else {
            str = "null";
        }
        map.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
        map.put(BaseJavaModule.METHOD_TYPE_ASYNC, AnonymousClass7TE.A0u());
        return C60340gF.A00;
    }
}
