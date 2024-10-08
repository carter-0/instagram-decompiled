package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.UNh  reason: case insensitive filesystem */
public final class C15064UNh extends AnonymousClass0T0 implements XAK {
    public final String A00;

    public final C15064UNh FCV() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C15064UNh) && 0qQ.A0K(this.A00, ((C15064UNh) obj).A00));
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.A00;
        if (str != null) {
            C41845B3m.A0x(str, linkedHashMap);
        }
        return new TreeUpdaterJNI("XDTTextAppTagFragment", 0Yt.A0B(linkedHashMap));
    }

    public final int hashCode() {
        return AnonymousClass7TG.A0E(this.A00);
    }

    public C15064UNh(String str) {
        this.A00 = str;
    }
}
