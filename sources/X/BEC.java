package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

public final class BEC extends AnonymousClass0T0 implements DSG {
    public final String A00;

    public BEC(String str) {
        0qQ.A0B(str, 1);
        this.A00 = str;
    }

    public final BEC F1c() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof BEC) && 0qQ.A0K(this.A00, ((BEC) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String getEffectId() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        LinkedHashMap A0t = C41845B3m.A0t();
        String str = this.A00;
        if (str != null) {
            A0t.put("effect_id", str);
        }
        return C41845B3m.A0T("XDTClipsSmartTemplateInfo", 0Yt.A0B(A0t));
    }
}
