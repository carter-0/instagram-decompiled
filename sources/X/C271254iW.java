package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.4iW  reason: invalid class name and case insensitive filesystem */
public final class C271254iW extends AnonymousClass0T0 implements C271264iX {
    public final String A00;

    public final C271254iW F5l() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C271254iW) && 0qQ.A0K(this.A00, ((C271254iW) obj).A00));
    }

    public final int hashCode() {
        String str = this.A00;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.A00;
        if (str != null) {
            linkedHashMap.put("background_color", str);
        }
        return new TreeUpdaterJNI("XDTMediaBackgroundColor", 0Yt.A0B(linkedHashMap));
    }

    public final String getBackgroundColor() {
        return this.A00;
    }

    public C271254iW(String str) {
        this.A00 = str;
    }
}
