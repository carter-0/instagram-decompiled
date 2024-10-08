package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.3yB  reason: invalid class name and case insensitive filesystem */
public final class C257923yB extends AnonymousClass0T0 implements C257933yC {
    public final String A00;

    public final C257923yB FGa() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C257923yB) && 0qQ.A0K(this.A00, ((C257923yB) obj).A00));
    }

    public final int hashCode() {
        String str = this.A00;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String AZ6() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.A00;
        if (str != null) {
            linkedHashMap.put("ad_info_text", str);
        }
        return new TreeUpdaterJNI("XDTReelsMultiAdsInfo", 0Yt.A0B(linkedHashMap));
    }

    public C257923yB(String str) {
        this.A00 = str;
    }
}
