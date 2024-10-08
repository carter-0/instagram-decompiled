package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGPostClickEligibleExperienceTypes;
import java.util.List;

public final class BF6 extends AnonymousClass0T0 implements DTE {
    public final IGPostClickEligibleExperienceTypes A00;
    public final String A01;
    public final List A02;

    public final BF6 F4G() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BF6) {
                BF6 bf6 = (BF6) obj;
                if (!0qQ.A0K(this.A02, bf6.A02) || !0qQ.A0K(this.A01, bf6.A01) || this.A00 != bf6.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final List Axn() {
        return this.A02;
    }

    public final String Axp() {
        return this.A01;
    }

    public final IGPostClickEligibleExperienceTypes B0e() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTIGIABPostClickDataDisclaimerDict", C44181CYu.A00(this));
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0C(this.A02) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public BF6(IGPostClickEligibleExperienceTypes iGPostClickEligibleExperienceTypes, String str, List list) {
        this.A02 = list;
        this.A01 = str;
        this.A00 = iGPostClickEligibleExperienceTypes;
    }
}
