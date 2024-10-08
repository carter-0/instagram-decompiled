package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.4vv  reason: invalid class name and case insensitive filesystem */
public final class C277904vv extends AnonymousClass0T0 implements C277914vw {
    public final boolean A00;

    public final C277904vv F4O() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C277904vv) && this.A00 == ((C277904vv) obj).A00);
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("show_join_live_sheet", Boolean.valueOf(this.A00));
        return new TreeUpdaterJNI("XDTIGLiveBFFUpsell", 0Yt.A0B(linkedHashMap));
    }

    public final int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public C277904vv(boolean z) {
        this.A00 = z;
    }
}
