package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.3lA  reason: invalid class name and case insensitive filesystem */
public final class C250263lA extends AnonymousClass0T0 implements C250273lB {
    public final String A00;
    public final String A01;

    public C250263lA(String str, String str2) {
        0qQ.A0B(str2, 2);
        this.A00 = str;
        this.A01 = str2;
    }

    public final C250263lA F3f() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C250263lA) {
                C250263lA r5 = (C250263lA) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A00;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.A01.hashCode();
    }

    public final String Bjz() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTHideReasonDict", B50.A00(this));
    }

    public final String getText() {
        return this.A01;
    }
}
