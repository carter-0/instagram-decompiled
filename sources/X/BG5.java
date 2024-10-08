package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

public final class BG5 extends AnonymousClass0T0 implements DS2 {
    public final String A00;

    public final BG5 F8J() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof BG5) && 0qQ.A0K(this.A00, ((BG5) obj).A00));
    }

    public final int hashCode() {
        return AnonymousClass7TG.A0E(this.A00);
    }

    public BG5(String str) {
        this.A00 = str;
    }

    public final TreeUpdaterJNI FHC() {
        LinkedHashMap A0t = C41845B3m.A0t();
        String str = this.A00;
        if (str != null) {
            A0t.put("collection_id", str);
        }
        return C41845B3m.A0T("XDTPublicCollectionTappableData", 0Yt.A0B(A0t));
    }
}
