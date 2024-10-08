package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.3l4  reason: invalid class name and case insensitive filesystem */
public final class C250203l4 extends AnonymousClass0T0 implements C250213l5 {
    public final Boolean A00;

    public final C250203l4 F48() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C250203l4) && 0qQ.A0K(this.A00, ((C250203l4) obj).A00));
    }

    public final int hashCode() {
        Boolean bool = this.A00;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final Boolean CW9() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Boolean bool = this.A00;
        if (bool != null) {
            linkedHashMap.put("isLeadGenAd", bool);
        }
        return new TreeUpdaterJNI("XDTIGClickToDirectLeadGenAdsInfoDict", 0Yt.A0B(linkedHashMap));
    }

    public C250203l4(Boolean bool) {
        this.A00 = bool;
    }
}
