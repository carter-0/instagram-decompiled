package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.54j  reason: invalid class name and case insensitive filesystem */
public final class C2808354j extends AnonymousClass0T0 implements C2808454k {
    public final String A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public final C2808354j F4K() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2808354j) {
                C2808354j r5 = (C2808354j) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03)) {
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
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A01;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A02;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.A03;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode3 + i;
    }

    public final String AYw() {
        return this.A00;
    }

    public final String BKL() {
        return this.A02;
    }

    public final List BYc() {
        return this.A03;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGLeadGenQuestionCardDict", C44186CYz.A00(this));
    }

    public final String getCtaText() {
        return this.A01;
    }

    public C2808354j(String str, String str2, String str3, List list) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = list;
    }
}
