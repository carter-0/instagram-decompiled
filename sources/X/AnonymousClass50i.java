package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.50i  reason: invalid class name */
public final class AnonymousClass50i extends AnonymousClass0T0 implements C2801550j {
    public final String A00;
    public final String A01;
    public final String A02;

    public final AnonymousClass50i F3h() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass50i) {
                AnonymousClass50i r5 = (AnonymousClass50i) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A00;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A01;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A02;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String Bkc() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTHighlightsAttributionDict", GTR.A00(this));
    }

    public final String getMediaId() {
        return this.A00;
    }

    public final String getTitle() {
        return this.A02;
    }

    public AnonymousClass50i(String str, String str2, String str3) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }
}
