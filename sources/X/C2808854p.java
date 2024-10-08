package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.androidlink.AndroidLink;

/* renamed from: X.54p  reason: invalid class name and case insensitive filesystem */
public final class C2808854p extends AnonymousClass0T0 implements C257893y8 {
    public final AndroidLink A00;
    public final Integer A01;
    public final String A02;
    public final String A03;

    public final C2808854p F8E() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2808854p) {
                C2808854p r5 = (C2808854p) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        AndroidLink androidLink = this.A00;
        int i = 0;
        int hashCode = (androidLink == null ? 0 : androidLink.hashCode()) * 31;
        Integer num = this.A01;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.A02;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A03;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode3 + i;
    }

    public final AndroidLink Abb() {
        return this.A00;
    }

    public final Integer Bqc() {
        return this.A01;
    }

    public final String Bqd() {
        return this.A02;
    }

    public final String Bqf() {
        return this.A03;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTProfileVisitAdsInfo", C44283CcR.A00(this));
    }

    public C2808854p(AndroidLink androidLink, Integer num, String str, String str2) {
        this.A00 = androidLink;
        this.A01 = num;
        this.A02 = str;
        this.A03 = str2;
    }
}
