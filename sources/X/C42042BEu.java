package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.BEu  reason: case insensitive filesystem */
public final class C42042BEu extends AnonymousClass0T0 implements C46279DTi {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public C42042BEu(String str, String str2, String str3, String str4) {
        0qQ.A0B(str, 1);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
    }

    public final C42042BEu F3R() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42042BEu) {
                C42042BEu bEu = (C42042BEu) obj;
                if (!0qQ.A0K(this.A00, bEu.A00) || !0qQ.A0K(this.A01, bEu.A01) || !0qQ.A0K(this.A02, bEu.A02) || !0qQ.A0K(this.A03, bEu.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String C75() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTGiphyVideoInfo", CY8.A00(this));
    }

    public final String getId() {
        return this.A00;
    }

    public final String getTitle() {
        return this.A02;
    }

    public final String getUsername() {
        return this.A03;
    }

    public final int hashCode() {
        return ((((AnonymousClass7TE.A0O(this.A00) + AnonymousClass7TG.A0E(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + C41845B3m.A00(this.A03);
    }
}
