package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.react.bridge.BaseJavaModule;
import java.util.Map;

/* renamed from: X.AuT  reason: case insensitive filesystem */
public final /* synthetic */ class C41469AuT implements 0sP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C337657gh A01;

    public /* synthetic */ C41469AuT(C337657gh r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final Object invoke(Object obj) {
        String str;
        C337657gh r0 = this.A01;
        int i = this.A00;
        Map map = (Map) obj;
        map.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, Integer.valueOf(r0.hashCode()));
        if (i == -1) {
            str = NetInfoModule.CONNECTION_TYPE_NONE;
        } else if (i == 0) {
            str = "setRoot";
        } else if (i == 1) {
            str = "setRootAsync";
        } else if (i != 2) {
            str = "updateStateAsync";
        } else {
            str = "updateState";
        }
        map.put("source", str);
        boolean z = true;
        if (!(i == 1 || i == 3)) {
            z = false;
        }
        map.put(BaseJavaModule.METHOD_TYPE_ASYNC, Boolean.valueOf(z));
        return C60340gF.A00;
    }
}
