package X;

import com.facebook.pando.TreeUpdaterJNI;

public final class BDx extends AnonymousClass0T0 implements C46274DTd {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final BDx F0s() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BDx) {
                BDx bDx = (BDx) obj;
                if (!0qQ.A0K(this.A00, bDx.A00) || !0qQ.A0K(this.A01, bDx.A01) || !0qQ.A0K(this.A02, bDx.A02) || !0qQ.A0K(this.A03, bDx.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String AXs() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTBloksStickerNativePropsIGMention", C44081CUy.A00(this));
    }

    public final String getFullName() {
        return this.A01;
    }

    public final String getProfilePicUrl() {
        return this.A02;
    }

    public final String getUsername() {
        return this.A03;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A03, AnonymousClass7TF.A08(this.A02, AnonymousClass7TF.A08(this.A01, AnonymousClass7TE.A0O(this.A00))));
    }

    public BDx(String str, String str2, String str3, String str4) {
        AnonymousClass7TG.A1U(str, str2, str3);
        0qQ.A0B(str4, 4);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
    }
}
