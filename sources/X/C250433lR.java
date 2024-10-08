package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.3lR  reason: invalid class name and case insensitive filesystem */
public final class C250433lR extends AnonymousClass0T0 implements C250443lS {
    public final String A00;
    public final List A01;

    public final C250433lR FG2() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C250433lR) {
                C250433lR r5 = (C250433lR) obj;
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

    public final List Apl() {
        return this.A01;
    }

    public final String BwJ() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTClientInvalidationInstructionDict", B52.A00(this));
    }

    public C250433lR(List list, String str) {
        this.A01 = list;
        this.A00 = str;
    }
}
