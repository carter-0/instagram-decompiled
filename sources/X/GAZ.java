package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class GAZ {
    public static Map A00(C246193eB r3) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (r3.getData() != null) {
            linkedHashMap.put("data", r3.getData());
        }
        if (r3.AwK() != null) {
            AnonymousClass1eD AwK = r3.AwK();
            if (AwK != null) {
                treeUpdaterJNI = AwK.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put("demotion_control", treeUpdaterJNI);
        }
        if (r3.getId() != null) {
            linkedHashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r3.getId());
        }
        r3.BvY();
        linkedHashMap.put("show_icon", Boolean.valueOf(r3.BvY()));
        if (r3.C27() != null) {
            linkedHashMap.put("style", r3.C27());
        }
        if (r3.getText() != null) {
            linkedHashMap.put("text", r3.getText());
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
