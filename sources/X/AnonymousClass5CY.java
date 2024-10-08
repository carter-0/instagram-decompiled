package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.5CY  reason: invalid class name */
public final class AnonymousClass5CY extends AnonymousClass0T0 implements C257783xx {
    public final String A00;
    public final List A01;

    public final AnonymousClass5CY F57() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5CY) {
                AnonymousClass5CY r5 = (AnonymousClass5CY) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List list = this.A01;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.A00;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final List Axq() {
        return this.A01;
    }

    public final String B93() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGTransparencyAndControlDisclaimerData", CZW.A00(this));
    }

    public AnonymousClass5CY(List list, String str) {
        this.A01 = list;
        this.A00 = str;
    }
}
