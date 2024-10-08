package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.5DV  reason: invalid class name */
public final class AnonymousClass5DV extends AnonymousClass0T0 implements AnonymousClass5DW {
    public final String A00;
    public final String A01;
    public final boolean A02;

    public AnonymousClass5DV(boolean z, String str, String str2) {
        0qQ.A0B(str2, 3);
        this.A02 = z;
        this.A00 = str;
        this.A01 = str2;
    }

    public final AnonymousClass5DV F2d() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5DV) {
                AnonymousClass5DV r5 = (AnonymousClass5DV) obj;
                if (this.A02 != r5.A02 || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTCutoutStickerUser", CX6.A00(this));
    }

    public final String getProfilePicUrl() {
        return this.A00;
    }

    public final String getUsername() {
        return this.A01;
    }

    public final int hashCode() {
        int hashCode;
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        int i2 = i * 31;
        String str = this.A00;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((i2 + hashCode) * 31) + this.A01.hashCode();
    }

    public final boolean isVerified() {
        return this.A02;
    }
}
