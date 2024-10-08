package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

public final class BF8 extends AnonymousClass0T0 implements C269954fx {
    public final String A00;

    public final BF8 F4f() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof BF8) && 0qQ.A0K(this.A00, ((BF8) obj).A00));
    }

    public final String BSW() {
        return this.A00;
    }

    public final int hashCode() {
        return AnonymousClass7TG.A0E(this.A00);
    }

    public BF8(String str) {
        this.A00 = str;
    }

    public final TreeUpdaterJNI FHC() {
        LinkedHashMap A0t = C41845B3m.A0t();
        String str = this.A00;
        if (str != null) {
            A0t.put("metaCheckoutExperienceType", str);
        }
        return C41845B3m.A0T("XDTIGMetaCheckoutIABPostClickDataExtensionDict", 0Yt.A0B(A0t));
    }
}
