package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.5Ca  reason: invalid class name and case insensitive filesystem */
public final class C282165Ca extends AnonymousClass0T0 implements C257883y7 {
    public final String A00;

    public final C282165Ca F7X() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C282165Ca) && 0qQ.A0K(this.A00, ((C282165Ca) obj).A00));
    }

    public final int hashCode() {
        String str = this.A00;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String AjA() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.A00;
        if (str != null) {
            linkedHashMap.put("byline_text", str);
        }
        return new TreeUpdaterJNI("XDTPoliticalContext", 0Yt.A0B(linkedHashMap));
    }

    public C282165Ca(String str) {
        this.A00 = str;
    }
}
