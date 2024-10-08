package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.4fj  reason: invalid class name and case insensitive filesystem */
public final class C269814fj extends AnonymousClass0T0 implements C269824fk {
    public final Float A00;
    public final Float A01;
    public final Float A02;
    public final Float A03;
    public final Integer A04;
    public final String A05;
    public final String A06;

    public final C269814fj FF8() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C269814fj) {
                C269814fj r5 = (C269814fj) obj;
                if (!0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A05;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Float f = this.A00;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.A01;
        int hashCode3 = (hashCode2 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.A02;
        int hashCode4 = (hashCode3 + (f3 == null ? 0 : f3.hashCode())) * 31;
        String str2 = this.A06;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.A04;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Float f4 = this.A03;
        if (f4 != null) {
            i = f4.hashCode();
        }
        return hashCode6 + i;
    }

    public final Float BCy() {
        return this.A00;
    }

    public final Float Byx() {
        return this.A01;
    }

    public final Float Byz() {
        return this.A02;
    }

    public final Integer C5c() {
        return this.A04;
    }

    public final Float CGb() {
        return this.A03;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryAdAutoCropCaptionInfoDict", C44902Cms.A00(this));
    }

    public final String getBackgroundColor() {
        return this.A05;
    }

    public final String getTextColor() {
        return this.A06;
    }

    public C269814fj(Float f, Float f2, Float f3, Float f4, Integer num, String str, String str2) {
        this.A05 = str;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A06 = str2;
        this.A04 = num;
        this.A03 = f4;
    }
}
