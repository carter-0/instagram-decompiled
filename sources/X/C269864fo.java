package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.4fo  reason: invalid class name and case insensitive filesystem */
public final class C269864fo extends AnonymousClass0T0 implements C269874fp {
    public final 1Xj A00;

    public final C269864fo FDx(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C269864fo) && 0qQ.A0K(this.A00, ((C269864fo) obj).A00));
    }

    public final int hashCode() {
        1Xj r0 = this.A00;
        if (r0 == null) {
            return 0;
        }
        return r0.hashCode();
    }

    public final 1Xj BPf() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        1Xj r0 = this.A00;
        if (r0 != null) {
            linkedHashMap.put("media", r0.A1C());
        }
        return new TreeUpdaterJNI("XDTCommentMediaInfo", 0Yt.A0B(linkedHashMap));
    }

    public C269864fo(1Xj r1) {
        this.A00 = r1;
    }

    public final C269874fp E9e(1E9 r1) {
        return this;
    }
}
