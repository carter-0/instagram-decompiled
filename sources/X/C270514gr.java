package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.4gr  reason: invalid class name and case insensitive filesystem */
public final class C270514gr extends AnonymousClass0T0 implements C270524gs {
    public final String A00;

    public C270514gr(String str) {
        0qQ.A0B(str, 1);
        this.A00 = str;
    }

    public final C270514gr FDe() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C270514gr) && 0qQ.A0K(this.A00, ((C270514gr) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String C3v() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.A00;
        if (str != null) {
            linkedHashMap.put("tag_name", str);
        }
        return new TreeUpdaterJNI("XDTClipsChallengeInfo", 0Yt.A0B(linkedHashMap));
    }
}
