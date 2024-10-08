package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.4s2  reason: invalid class name and case insensitive filesystem */
public final class C275844s2 extends AnonymousClass0T0 implements C275854s3 {
    public final String A00;
    public final String A01;

    public C275844s2(String str, String str2) {
        0qQ.A0B(str2, 2);
        this.A00 = str;
        this.A01 = str2;
    }

    public final C275844s2 F7O() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C275844s2) {
                C275844s2 r5 = (C275844s2) obj;
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

    public final String Aq2() {
        return this.A00;
    }

    public final String BAR() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTProactiveWarningHarmInfo", C48344Ed1.A00(this));
    }
}
