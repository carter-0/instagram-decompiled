package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.FBBioLinkSocialContextType;

/* renamed from: X.5Bi  reason: invalid class name and case insensitive filesystem */
public final class C282075Bi extends AnonymousClass0T0 implements C282085Bj {
    public final int A00;
    public final FBBioLinkSocialContextType A01;
    public final String A02;

    public C282075Bi(FBBioLinkSocialContextType fBBioLinkSocialContextType, String str, int i) {
        0qQ.A0B(str, 1);
        0qQ.A0B(fBBioLinkSocialContextType, 3);
        this.A02 = str;
        this.A00 = i;
        this.A01 = fBBioLinkSocialContextType;
    }

    public final C282075Bi F2r() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C282075Bi) {
                C282075Bi r5 = (C282075Bi) obj;
                if (!(0qQ.A0K(this.A02, r5.A02) && this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A02.hashCode() * 31) + this.A00) * 31) + this.A01.hashCode();
    }

    public final String AyC() {
        return this.A02;
    }

    public final int BOo() {
        return this.A00;
    }

    public final FBBioLinkSocialContextType BxV() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTFBBioLinkSocialContext", CXT.A00(this));
    }
}
