package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.5HH  reason: invalid class name */
public final class AnonymousClass5HH extends AnonymousClass0T0 implements AnonymousClass5HI {
    public final String A00;

    public AnonymousClass5HH(String str) {
        0qQ.A0B(str, 1);
        this.A00 = str;
    }

    public final AnonymousClass5HH F5k() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass5HH) && 0qQ.A0K(this.A00, ((AnonymousClass5HH) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.A00;
        if (str != null) {
            linkedHashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
        }
        return new TreeUpdaterJNI("XDTMediaAttribution", 0Yt.A0B(linkedHashMap));
    }

    public final String getName() {
        return this.A00;
    }
}
