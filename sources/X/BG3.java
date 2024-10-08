package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ProfileBannerType;

public final class BG3 extends AnonymousClass0T0 implements C46258DSn {
    public final ProfileBannerType A00;
    public final String A01;

    public final BG3 F88() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BG3) {
                BG3 bg3 = (BG3) obj;
                if (!0qQ.A0K(this.A01, bg3.A01) || this.A00 != bg3.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String AfC() {
        return this.A01;
    }

    public final ProfileBannerType AfI() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTProfileBannerInfo", C44279CcN.A00(this));
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TE.A0O(this.A01));
    }

    public BG3(ProfileBannerType profileBannerType, String str) {
        AnonymousClass7TG.A1O(str, profileBannerType);
        this.A01 = str;
        this.A00 = profileBannerType;
    }
}
