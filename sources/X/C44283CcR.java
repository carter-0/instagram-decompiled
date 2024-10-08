package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.androidlink.AndroidLink;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CcR  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44283CcR {
    public static Map A00(C257893y8 r3) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r3.Abb() != null) {
            AndroidLink Abb = r3.Abb();
            if (Abb != null) {
                treeUpdaterJNI = Abb.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("android_link", treeUpdaterJNI);
        }
        if (r3.Bqc() != null) {
            A1H.put("secondary_cta_destination", r3.Bqc());
        }
        if (r3.Bqd() != null) {
            A1H.put("secondary_cta_hint_text", r3.Bqd());
        }
        if (r3.Bqf() != null) {
            A1H.put("secondary_cta_title", r3.Bqf());
        }
        return 0Yt.A0B(A1H);
    }
}
