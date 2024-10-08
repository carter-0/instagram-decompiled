package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.4vy  reason: invalid class name and case insensitive filesystem */
public final class C277934vy extends AnonymousClass0T0 implements C277944vz {
    public final boolean A00;

    public final C277934vy F4V() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C277934vy) && this.A00 == ((C277934vy) obj).A00);
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("viewer_poll_enabled", Boolean.valueOf(this.A00));
        return new TreeUpdaterJNI("XDTIGLiveGamesConfig", 0Yt.A0B(linkedHashMap));
    }

    public final int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public C277934vy(boolean z) {
        this.A00 = z;
    }
}
