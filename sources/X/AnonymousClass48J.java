package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.48J  reason: invalid class name */
public final class AnonymousClass48J extends AnonymousClass0T0 implements AnonymousClass48K {
    public final String A00;

    public AnonymousClass48J(String str) {
        0qQ.A0B(str, 1);
        this.A00 = str;
    }

    public final AnonymousClass48J F6y() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass48J) && 0qQ.A0K(this.A00, ((AnonymousClass48J) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String BJm() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.A00;
        if (str != null) {
            linkedHashMap.put("json_response", str);
        }
        return new TreeUpdaterJNI("XDTNotificationSettingResponse", 0Yt.A0B(linkedHashMap));
    }
}
