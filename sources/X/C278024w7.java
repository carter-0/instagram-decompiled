package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.4w7  reason: invalid class name and case insensitive filesystem */
public final class C278024w7 extends AnonymousClass0T0 implements C278034w8 {
    public final Integer A00;
    public final Integer A01;
    public final String A02;
    public final String A03;

    public final C278024w7 F59() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C278024w7) {
                C278024w7 r5 = (C278024w7) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A00;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.A01;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.A02;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A03;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode3 + i;
    }

    public final Integer BED() {
        return this.A00;
    }

    public final Integer BEN() {
        return this.A01;
    }

    public final String ByX() {
        return this.A03;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIconSpec", CZX.A00(this));
    }

    public final String getName() {
        return this.A02;
    }

    public C278024w7(Integer num, Integer num2, String str, String str2) {
        this.A00 = num;
        this.A01 = num2;
        this.A02 = str;
        this.A03 = str2;
    }
}
