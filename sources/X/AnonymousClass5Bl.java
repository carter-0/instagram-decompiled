package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.5Bl  reason: invalid class name */
public final class AnonymousClass5Bl extends AnonymousClass0T0 implements AnonymousClass5Bm {
    public final String A00;
    public final String A01;

    public AnonymousClass5Bl(String str, String str2) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        this.A00 = str;
        this.A01 = str2;
    }

    public final AnonymousClass5Bl F5S() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5Bl) {
                AnonymousClass5Bl r5 = (AnonymousClass5Bl) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTLinkedFBPage", C48340Ecx.A00(this));
    }

    public final String getId() {
        return this.A00;
    }

    public final String getName() {
        return this.A01;
    }
}
