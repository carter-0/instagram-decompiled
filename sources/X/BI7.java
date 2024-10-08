package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class BI7 extends AnonymousClass0T0 implements DT2 {
    public final String A00;
    public final List A01;

    public final BI7 FD7() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BI7) {
                BI7 bi7 = (BI7) obj;
                if (!0qQ.A0K(this.A01, bi7.A01) || !0qQ.A0K(this.A00, bi7.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final List B0d() {
        return this.A01;
    }

    public final String BTA() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTUserEngagementBasedInsertionSetting", C44563Cgx.A00(this));
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A01) * 31) + C41845B3m.A00(this.A00);
    }

    public BI7(List list, String str) {
        this.A01 = list;
        this.A00 = str;
    }
}
