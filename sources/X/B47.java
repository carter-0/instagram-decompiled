package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

public final class B47 extends AnonymousClass0T0 implements C279774zI {
    public final String A00;

    public final B47 F4I() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof B47) && 0qQ.A0K(this.A00, ((B47) obj).A00));
    }

    public final String BCo() {
        return this.A00;
    }

    public final int hashCode() {
        return AnonymousClass7TG.A0E(this.A00);
    }

    public B47(String str) {
        this.A00 = str;
    }

    public final TreeUpdaterJNI FHC() {
        LinkedHashMap A0t = C41845B3m.A0t();
        String str = this.A00;
        if (str != null) {
            A0t.put("headline", str);
        }
        return C41845B3m.A0T("XDTIGLeadGenIncentiveInfoDict", 0Yt.A0B(A0t));
    }
}
