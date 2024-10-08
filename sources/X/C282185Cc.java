package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.5Cc  reason: invalid class name and case insensitive filesystem */
public final class C282185Cc extends AnonymousClass0T0 implements C282195Cd {
    public final Boolean A00;
    public final Integer A01;
    public final Integer A02;
    public final Integer A03;
    public final String A04;

    public final C282185Cc FD4() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C282185Cc) {
                C282185Cc r5 = (C282185Cc) obj;
                if (!0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A04;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.A00;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.A01;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.A02;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.A03;
        if (num3 != null) {
            i = num3.hashCode();
        }
        return hashCode4 + i;
    }

    public final String Azw() {
        return this.A04;
    }

    public final Integer BPE() {
        return this.A01;
    }

    public final Integer BPF() {
        return this.A02;
    }

    public final Integer BWt() {
        return this.A03;
    }

    public final Boolean CRk() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTUserAddressEditingConfigDict", C44562Cgw.A00(this));
    }

    public C282185Cc(Boolean bool, Integer num, Integer num2, Integer num3, String str) {
        this.A04 = str;
        this.A00 = bool;
        this.A01 = num;
        this.A02 = num2;
        this.A03 = num3;
    }
}
