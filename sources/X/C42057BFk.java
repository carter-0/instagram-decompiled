package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.BFk  reason: case insensitive filesystem */
public final class C42057BFk extends AnonymousClass0T0 implements DSM {
    public final String A00;

    public final C42057BFk F7S() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C42057BFk) && 0qQ.A0K(this.A00, ((C42057BFk) obj).A00));
    }

    public final String getUrl() {
        return this.A00;
    }

    public final int hashCode() {
        return AnonymousClass7TG.A0E(this.A00);
    }

    public C42057BFk(String str) {
        this.A00 = str;
    }

    public final TreeUpdaterJNI FHC() {
        LinkedHashMap A0t = C41845B3m.A0t();
        String str = this.A00;
        if (str != null) {
            C41845B3m.A0y(str, A0t);
        }
        return C41845B3m.A0T("XDTPhoto3DInfo", 0Yt.A0B(A0t));
    }
}
