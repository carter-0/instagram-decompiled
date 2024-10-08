package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.3tQ  reason: invalid class name and case insensitive filesystem */
public final class C255003tQ extends AnonymousClass0T0 implements C255013tR {
    public final Float A00;
    public final String A01;
    public final String A02;

    public final C255003tQ F1K() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C255003tQ) {
                C255003tQ r5 = (C255003tQ) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Float f = this.A00;
        int i = 0;
        int hashCode = (f == null ? 0 : f.hashCode()) * 31;
        String str = this.A01;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A02;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final Float Aic() {
        return this.A00;
    }

    public final String Aid() {
        return this.A01;
    }

    public final String CGP() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTClickToDirectAdsInfo", C41919B6u.A00(this));
    }

    public C255003tQ(Float f, String str, String str2) {
        this.A00 = f;
        this.A01 = str;
        this.A02 = str2;
    }
}
