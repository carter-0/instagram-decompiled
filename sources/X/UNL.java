package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class UNL extends AnonymousClass0T0 implements C21025XAe {
    public final XAP A00;
    public final C21024XAd A01;
    public final XAQ A02;
    public final List A03;

    public final UNL F6h() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UNL) {
                UNL unl = (UNL) obj;
                if (!0qQ.A0K(this.A02, unl.A02) || !0qQ.A0K(this.A01, unl.A01) || !0qQ.A0K(this.A00, unl.A00) || !0qQ.A0K(this.A03, unl.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final XAQ Abh() {
        return this.A02;
    }

    public final C21024XAd Aeh() {
        return this.A01;
    }

    public final XAP Af0() {
        return this.A00;
    }

    public final List BcE() {
        return this.A03;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTNativeInfoCardPhotoCardMetadataPayloadV1", C16837V7s.A00(this));
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0C(this.A02) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TE.A0L(this.A03);
    }

    public UNL(XAP xap, C21024XAd xAd, XAQ xaq, List list) {
        this.A02 = xaq;
        this.A01 = xAd;
        this.A00 = xap;
        this.A03 = list;
    }
}
