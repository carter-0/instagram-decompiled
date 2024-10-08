package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGConsiderAndBrowseType;
import java.util.LinkedHashMap;

/* renamed from: X.4xF  reason: invalid class name and case insensitive filesystem */
public final class C278614xF extends AnonymousClass0T0 implements C278624xG {
    public final IGConsiderAndBrowseType A00;

    public C278614xF(IGConsiderAndBrowseType iGConsiderAndBrowseType) {
        0qQ.A0B(iGConsiderAndBrowseType, 1);
        this.A00 = iGConsiderAndBrowseType;
    }

    public final C278614xF F11() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C278614xF) && this.A00 == ((C278614xF) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final IGConsiderAndBrowseType CGB() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (CGB() != null) {
            IGConsiderAndBrowseType CGB = CGB();
            0qQ.A0B(CGB, 0);
            linkedHashMap.put("watch_type", CGB.A00);
        }
        return new TreeUpdaterJNI("XDTBrowseInfoDict", 0Yt.A0B(linkedHashMap));
    }
}
