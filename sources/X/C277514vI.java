package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.4vI  reason: invalid class name and case insensitive filesystem */
public final class C277514vI extends AnonymousClass0T0 implements C277524vJ {
    public final boolean A00;

    public final C277514vI F4a() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C277514vI) && this.A00 == ((C277514vI) obj).A00);
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enabled", Boolean.valueOf(this.A00));
        return new TreeUpdaterJNI("XDTIGLiveUseRsysRtcInfra", 0Yt.A0B(linkedHashMap));
    }

    public final int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public C277514vI(boolean z) {
        this.A00 = z;
    }
}
