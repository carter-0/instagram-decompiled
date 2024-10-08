package X;

import com.facebook.pando.TreeUpdaterJNI;

public final class UN2 extends AnonymousClass0T0 implements C257733xs {
    public final Float A00;
    public final Float A01;
    public final Float A02;
    public final Float A03;

    public final UN2 F3q() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UN2) {
                UN2 un2 = (UN2) obj;
                if (!0qQ.A0K(this.A00, un2.A00) || !0qQ.A0K(this.A01, un2.A01) || !0qQ.A0K(this.A02, un2.A02) || !0qQ.A0K(this.A03, un2.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Float AhS() {
        return this.A00;
    }

    public final Float AhT() {
        return this.A01;
    }

    public final Float AhU() {
        return this.A02;
    }

    public final Float AhV() {
        return this.A03;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGAdMediaTextOCRInfoDict", V7J.A00(this));
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A03);
    }

    public UN2(Float f, Float f2, Float f3, Float f4) {
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A03 = f4;
    }
}
