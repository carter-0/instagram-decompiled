package X;

import com.facebook.pando.TreeUpdaterJNI;

public final class BFF extends AnonymousClass0T0 implements C46281DTk {
    public final int A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public BFF(String str, String str2, int i, boolean z) {
        AnonymousClass7TF.A1D(str, 2, str2);
        this.A03 = z;
        this.A01 = str;
        this.A00 = i;
        this.A02 = str2;
    }

    public final BFF F56() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BFF) {
                BFF bff = (BFF) obj;
                if (this.A03 != bff.A03 || !0qQ.A0K(this.A01, bff.A01) || this.A00 != bff.A00 || !0qQ.A0K(this.A02, bff.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTIGTVSeriesInfo", CZU.A00(this));
    }

    public final boolean getHasCoverPhoto() {
        return this.A03;
    }

    public final String getId() {
        return this.A01;
    }

    public final int getNumEpisodes() {
        return this.A00;
    }

    public final String getTitle() {
        return this.A02;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A03) {
            i = 1231;
        }
        int i2 = i * 31;
        return C41845B3m.A01(this.A02, (AnonymousClass7TF.A08(this.A01, i2) + this.A00) * 31);
    }
}
