package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.4JR  reason: invalid class name */
public final class AnonymousClass4JR extends AnonymousClass0T0 implements AnonymousClass48Z {
    public final Boolean A00;
    public final Boolean A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Boolean A04;

    public final AnonymousClass4JR FEP() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4JR) {
                AnonymousClass4JR r5 = (AnonymousClass4JR) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean bool = this.A00;
        int i = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.A01;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.A02;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.A03;
        int hashCode4 = (hashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.A04;
        if (bool5 != null) {
            i = bool5.hashCode();
        }
        return hashCode4 + i;
    }

    public final Boolean BC3() {
        return this.A00;
    }

    public final Boolean BVa() {
        return this.A04;
    }

    public final Boolean CYY() {
        return this.A01;
    }

    public final Boolean CYs() {
        return this.A02;
    }

    public final Boolean Ca7() {
        return this.A03;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTOpenCarouselMediaConfig", C44750CkM.A00(this));
    }

    public AnonymousClass4JR(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5) {
        this.A00 = bool;
        this.A01 = bool2;
        this.A02 = bool3;
        this.A03 = bool4;
        this.A04 = bool5;
    }
}
