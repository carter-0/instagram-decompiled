package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGClickToMessagingCardTypeEnum;

public final class BF5 extends AnonymousClass0T0 implements C46247DSc {
    public final IGClickToMessagingCardTypeEnum A00;
    public final String A01;

    public final BF5 F49() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BF5) {
                BF5 bf5 = (BF5) obj;
                if (this.A00 != bf5.A00 || !0qQ.A0K(this.A01, bf5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final IGClickToMessagingCardTypeEnum Alj() {
        return this.A00;
    }

    public final String BE4() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTIGClickToMessagingCardDict", C44175CYo.A00(this));
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A00) * 31) + C41845B3m.A00(this.A01);
    }

    public BF5(IGClickToMessagingCardTypeEnum iGClickToMessagingCardTypeEnum, String str) {
        this.A00 = iGClickToMessagingCardTypeEnum;
        this.A01 = str;
    }
}
