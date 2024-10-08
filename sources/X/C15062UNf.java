package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.UNf  reason: case insensitive filesystem */
public final class C15062UNf extends AnonymousClass0T0 implements XAR {
    public final String A00;
    public final String A01;

    public final C15062UNf FCQ() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C15062UNf) {
                C15062UNf uNf = (C15062UNf) obj;
                if (!0qQ.A0K(this.A00, uNf.A00) || !0qQ.A0K(this.A01, uNf.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String AyC() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTTextAppLinkTextFragment", V8P.A00(this));
    }

    public final String getUri() {
        return this.A01;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0E(this.A00) * 31) + C41845B3m.A00(this.A01);
    }

    public C15062UNf(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
