package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.4gp  reason: invalid class name and case insensitive filesystem */
public final class C270494gp extends AnonymousClass0T0 implements C270504gq {
    public final String A00;

    public C270494gp(String str) {
        0qQ.A0B(str, 1);
        this.A00 = str;
    }

    public final C270494gp FDd() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C270494gp) && 0qQ.A0K(this.A00, ((C270494gp) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.A00;
        if (str != null) {
            linkedHashMap.put(AnonymousClass000.A00(4722), str);
        }
        return new TreeUpdaterJNI("XDTClipsBreakingContentInfo", 0Yt.A0B(linkedHashMap));
    }
}
