package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

public final class BEG extends AnonymousClass0T0 implements DSH {
    public final String A00;

    public BEG(String str) {
        0qQ.A0B(str, 1);
        this.A00 = str;
    }

    public final BEG F1g() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof BEG) && 0qQ.A0K(this.A00, ((BEG) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String BW0() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        LinkedHashMap A0t = C41845B3m.A0t();
        String str = this.A00;
        if (str != null) {
            A0t.put("new_text", str);
        }
        return C41845B3m.A0T("XDTClipsSpinSwappedText", 0Yt.A0B(A0t));
    }
}
