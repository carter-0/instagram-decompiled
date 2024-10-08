package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;

/* renamed from: X.4yy  reason: invalid class name and case insensitive filesystem */
public final class C279634yy extends AnonymousClass0T0 implements C279644yz {
    public final User A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public final C279634yy F7e(1E9 r1) {
        return this;
    }

    public final C279634yy F7f(1E6 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C279634yy) {
                C279634yy r5 = (C279634yy) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A06, r5.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A01;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A02;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A03;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A04;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        User user = this.A00;
        int hashCode5 = (hashCode4 + (user == null ? 0 : user.hashCode())) * 31;
        String str5 = this.A05;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.A06;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode6 + i;
    }

    public final String An9() {
        return this.A01;
    }

    public final User BRo() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTPrefetchedProductDict", C44245Cbg.A00(this));
    }

    public final String getCurrentPrice() {
        return this.A02;
    }

    public final String getExternalUrl() {
        return this.A03;
    }

    public final String getFullPrice() {
        return this.A04;
    }

    public final String getName() {
        return this.A05;
    }

    public final String getProductId() {
        return this.A06;
    }

    public C279634yy(User user, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A00 = user;
        this.A05 = str5;
        this.A06 = str6;
    }

    public final C279644yz E7y(1E9 r1) {
        return this;
    }
}
