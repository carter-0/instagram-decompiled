package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.4vp  reason: invalid class name and case insensitive filesystem */
public final class C277844vp extends AnonymousClass0T0 implements C277854vq {
    public final boolean A00;

    public final C277844vp F40() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C277844vp) && this.A00 == ((C277844vp) obj).A00);
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("allow", Boolean.valueOf(this.A00));
        return new TreeUpdaterJNI("XDTIGAllow4PLiveWith", 0Yt.A0B(linkedHashMap));
    }

    public final int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public C277844vp(boolean z) {
        this.A00 = z;
    }
}
