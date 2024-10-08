package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.4sQ  reason: invalid class name and case insensitive filesystem */
public final class C276064sQ extends AnonymousClass0T0 implements C276074sR {
    public final String A00;
    public final String A01;

    public C276064sQ(String str, String str2) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        this.A00 = str;
        this.A01 = str2;
    }

    public final C276064sQ FDH() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C276064sQ) {
                C276064sQ r5 = (C276064sQ) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public final String BKV() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTVideoSubtitleInfo", C370598wj.A00(this));
    }

    public final String getUri() {
        return this.A01;
    }
}
