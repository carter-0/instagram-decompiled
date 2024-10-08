package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.JxB  reason: case insensitive filesystem */
public final class C61100JxB extends AnonymousClass0T0 implements DSX {
    public final Integer A00;
    public final String A01;

    public final C61100JxB F24() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61100JxB) {
                C61100JxB jxB = (C61100JxB) obj;
                if (!0qQ.A0K(this.A00, jxB.A00) || !0qQ.A0K(this.A01, jxB.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Integer Bpd() {
        return this.A00;
    }

    public final String CDB() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTContentSchedulingMetadata", C63014Kq4.A00(this));
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A00) * 31) + C41845B3m.A00(this.A01);
    }

    public C61100JxB(Integer num, String str) {
        this.A00 = num;
        this.A01 = str;
    }
}
