package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.UrpRendererType;
import java.util.List;

public final class BI5 extends AnonymousClass0T0 implements DUE {
    public final UrpRendererType A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public BI5(UrpRendererType urpRendererType, String str, String str2, String str3, List list) {
        AnonymousClass7TF.A1D(urpRendererType, 3, str2);
        this.A04 = list;
        this.A01 = str;
        this.A00 = urpRendererType;
        this.A02 = str2;
        this.A03 = str3;
    }

    public final BI5 FD2() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BI5) {
                BI5 bi5 = (BI5) obj;
                if (!0qQ.A0K(this.A04, bi5.A04) || !0qQ.A0K(this.A01, bi5.A01) || this.A00 != bi5.A00 || !0qQ.A0K(this.A02, bi5.A02) || !0qQ.A0K(this.A03, bi5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final List Ace() {
        return this.A04;
    }

    public final String BOF() {
        return this.A01;
    }

    public final UrpRendererType Blw() {
        return this.A00;
    }

    public final String Bm0() {
        return this.A02;
    }

    public final String C4Z() {
        return this.A03;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTUrpMediaComposition", C44558Cgs.A00(this));
    }

    public final int hashCode() {
        return AnonymousClass7TF.A08(this.A02, AnonymousClass7TF.A07(this.A00, ((AnonymousClass7TG.A0C(this.A04) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31)) + C41845B3m.A00(this.A03);
    }
}
