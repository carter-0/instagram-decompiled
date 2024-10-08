package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.Map;

/* renamed from: X.3xe  reason: invalid class name and case insensitive filesystem */
public final class C257593xe extends AnonymousClass0T0 {
    public C270864hR A00;
    public String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C257593xe) {
                C257593xe r5 = (C257593xe) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C270864hR r0 = this.A00;
        int i = 0;
        int hashCode = (r0 == null ? 0 : r0.hashCode()) * 31;
        String str = this.A01;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final TreeUpdaterJNI A00() {
        Map A0E;
        String str = this.A01;
        if (str != null) {
            A0E = 0se.A0M(new 0eP("payload", str));
        } else {
            A0E = 0Yt.A0E();
        }
        return new TreeUpdaterJNI("XDTBloksRenderResponse", A0E);
    }
}
