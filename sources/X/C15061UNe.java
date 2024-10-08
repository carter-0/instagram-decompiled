package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.UNe  reason: case insensitive filesystem */
public final class C15061UNe extends AnonymousClass0T0 implements XAJ {
    public final String A00;

    public final C15061UNe FCP() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C15061UNe) && 0qQ.A0K(this.A00, ((C15061UNe) obj).A00));
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.A00;
        if (str != null) {
            linkedHashMap.put("fully_qualified_username", str);
        }
        return new TreeUpdaterJNI("XDTTextAppFediverseUserMentionTextFragment", 0Yt.A0B(linkedHashMap));
    }

    public final int hashCode() {
        return AnonymousClass7TG.A0E(this.A00);
    }

    public C15061UNe(String str) {
        this.A00 = str;
    }
}
