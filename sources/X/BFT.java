package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class BFT extends AnonymousClass0T0 implements DUO {
    public final int A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public BFT(int i, String str, String str2, List list) {
        AnonymousClass7TF.A1D(str, 3, str2);
        this.A03 = list;
        this.A00 = i;
        this.A01 = str;
        this.A02 = str2;
    }

    public final BFT F5y(1E9 r1) {
        return this;
    }

    public final BFT F5z(1E6 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BFT) {
                BFT bft = (BFT) obj;
                if (!0qQ.A0K(this.A03, bft.A03) || this.A00 != bft.A00 || !0qQ.A0K(this.A01, bft.A01) || !0qQ.A0K(this.A02, bft.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final List B3f() {
        return this.A03;
    }

    public final int Bak() {
        return this.A00;
    }

    public final String Bhp() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTMediaPromptData", CaI.A00(this));
    }

    public final String getText() {
        return this.A02;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A02, AnonymousClass7TF.A08(this.A01, ((AnonymousClass7TG.A0C(this.A03) * 31) + this.A00) * 31));
    }

    public final DUO E7Z(1E9 r1) {
        return this;
    }
}
