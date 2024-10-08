package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.4vL  reason: invalid class name and case insensitive filesystem */
public final class C277544vL extends AnonymousClass0T0 implements C277554vM {
    public final boolean A00;

    public final C277544vL F4Z() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C277544vL) && this.A00 == ((C277544vL) obj).A00);
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enabled", Boolean.valueOf(this.A00));
        return new TreeUpdaterJNI("XDTIGLiveUpvoteableQA", 0Yt.A0B(linkedHashMap));
    }

    public final int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public C277544vL(boolean z) {
        this.A00 = z;
    }
}
