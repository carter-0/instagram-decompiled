package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

public final class BIF extends AnonymousClass0T0 implements DSR {
    public final String A00;

    public BIF(String str) {
        0qQ.A0B(str, 1);
        this.A00 = str;
    }

    public final BIF FDL() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof BIF) && 0qQ.A0K(this.A00, ((BIF) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String getPk() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        LinkedHashMap A0t = C41845B3m.A0t();
        String str = this.A00;
        if (str != null) {
            A0t.put("pk", str);
        }
        return C41845B3m.A0T("XDTVisualRepliesOriginalMediaInfo", 0Yt.A0B(A0t));
    }
}
