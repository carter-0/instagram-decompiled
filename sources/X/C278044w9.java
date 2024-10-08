package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.4w9  reason: invalid class name and case insensitive filesystem */
public final class C278044w9 extends AnonymousClass0T0 implements AnonymousClass3ZV {
    public final String A00;

    public final C278044w9 F0J() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C278044w9) && 0qQ.A0K(this.A00, ((C278044w9) obj).A00));
    }

    public final int hashCode() {
        String str = this.A00;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String Axr() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.A00;
        if (str != null) {
            linkedHashMap.put("disclosure_tag", str);
        }
        return new TreeUpdaterJNI("XDTAffiliateInfo", 0Yt.A0B(linkedHashMap));
    }

    public C278044w9(String str) {
        this.A00 = str;
    }
}
