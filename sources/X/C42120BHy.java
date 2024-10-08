package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.BHy  reason: case insensitive filesystem */
public final class C42120BHy extends AnonymousClass0T0 implements DT0 {
    public final String A00;
    public final List A01;

    public C42120BHy(List list, String str) {
        0qQ.A0B(str, 2);
        this.A01 = list;
        this.A00 = str;
    }

    public final C42120BHy FCp() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42120BHy) {
                C42120BHy bHy = (C42120BHy) obj;
                if (!0qQ.A0K(this.A01, bHy.A01) || !0qQ.A0K(this.A00, bHy.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final List B1p() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTTextWithEntities", C44535CgV.A00(this));
    }

    public final String getText() {
        return this.A00;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A00, AnonymousClass7TG.A0C(this.A01) * 31);
    }
}
