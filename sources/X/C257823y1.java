package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.3y1  reason: invalid class name and case insensitive filesystem */
public final class C257823y1 extends AnonymousClass0T0 implements C257833y2 {
    public final String A00;
    public final String A01;

    public C257823y1(String str, String str2) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        this.A00 = str;
        this.A01 = str2;
    }

    public final C257823y1 F6A() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C257823y1) {
                C257823y1 r5 = (C257823y1) obj;
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

    public final String AYR() {
        return this.A00;
    }

    public final String BSB() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTMessageExtensionInfo", CaO.A00(this));
    }
}
