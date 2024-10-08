package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.4Hz  reason: invalid class name and case insensitive filesystem */
public final class C263154Hz extends AnonymousClass0T0 implements AnonymousClass4I0 {
    public final AnonymousClass4Hy A00;
    public final Boolean A01;
    public final Boolean A02;
    public final String A03;

    public C263154Hz(AnonymousClass4Hy r2, Boolean bool, Boolean bool2, String str) {
        0qQ.A0B(str, 4);
        this.A00 = r2;
        this.A01 = bool;
        this.A02 = bool2;
        this.A03 = str;
    }

    public final C263154Hz FEV() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C263154Hz) {
                C263154Hz r5 = (C263154Hz) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        AnonymousClass4Hy r0 = this.A00;
        int i = 0;
        int hashCode = (r0 == null ? 0 : r0.hashCode()) * 31;
        Boolean bool = this.A01;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.A02;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return ((hashCode2 + i) * 31) + this.A03.hashCode();
    }

    public final AnonymousClass4Hy AqD() {
        return this.A00;
    }

    public final Boolean BAU() {
        return this.A01;
    }

    public final Boolean CT3() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTProfileFundraiserDict", C41884B5c.A00(this));
    }

    public final String getPk() {
        return this.A03;
    }
}
