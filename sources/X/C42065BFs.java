package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.BFs  reason: case insensitive filesystem */
public final class C42065BFs extends AnonymousClass0T0 implements AnonymousClass60E {
    public final String A00;

    public C42065BFs(String str) {
        0qQ.A0B(str, 1);
        this.A00 = str;
    }

    public final C42065BFs F7g() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C42065BFs) && 0qQ.A0K(this.A00, ((C42065BFs) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String Bep() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        LinkedHashMap A0t = C41845B3m.A0t();
        String str = this.A00;
        if (str != null) {
            A0t.put("presence_id", str);
        }
        return C41845B3m.A0T("XDTPresenceNoteResponseInfo", 0Yt.A0B(A0t));
    }
}
