package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.hashtag.Hashtag;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Dcf  reason: case insensitive filesystem */
public abstract /* synthetic */ class C46337Dcf {
    public static Map A00(C255253tp r4) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (r4.BCW() != null) {
            Hashtag BCW = r4.BCW();
            if (BCW != null) {
                treeUpdaterJNI = BCW.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("hashtag", treeUpdaterJNI);
        }
        if (r4.CCb() != null) {
            C255233tn CCb = r4.CCb();
            if (CCb != null) {
                treeUpdaterJNI2 = CCb.FHC();
            }
            A1H.put(PublicKeyCredentialControllerUtility.JSON_KEY_USER, treeUpdaterJNI2);
        }
        return 0Yt.A0B(A1H);
    }
}
