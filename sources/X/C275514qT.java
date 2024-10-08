package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.4qT  reason: invalid class name and case insensitive filesystem */
public final class C275514qT extends AnonymousClass0T0 implements C275524qU {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public C275514qT(String str, String str2, String str3, String str4, String str5) {
        0qQ.A0B(str2, 2);
        0qQ.A0B(str5, 5);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = str5;
    }

    public final C275514qT F0G() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C275514qT) {
                C275514qT r5 = (C275514qT) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A00;
        int i = 0;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.A01.hashCode()) * 31;
        String str2 = this.A02;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A03;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode2 + i) * 31) + this.A04.hashCode();
    }

    public final String AnW() {
        return this.A00;
    }

    public final String AnX() {
        return this.A01;
    }

    public final String B1U() {
        return this.A02;
    }

    public final String B1V() {
        return this.A03;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTAdsFeedbackInterfaceClickable", HTC.A00(this));
    }

    public final String getText() {
        return this.A04;
    }
}
