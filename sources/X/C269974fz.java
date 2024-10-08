package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.4fz  reason: invalid class name and case insensitive filesystem */
public final class C269974fz extends AnonymousClass0T0 implements C269984g0 {
    public final Boolean A00;
    public final String A01;
    public final List A02;

    public final C269974fz F4x() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C269974fz) {
                C269974fz r5 = (C269974fz) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A02, r5.A02)) {
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
        Boolean bool = this.A00;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        List list = this.A02;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public final String B7E() {
        return this.A01;
    }

    public final List Bhg() {
        return this.A02;
    }

    public final Boolean CP8() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGPromoAdsAutofillPostClickDataExtensionDict", CZH.A00(this));
    }

    public C269974fz(Boolean bool, String str, List list) {
        this.A01 = str;
        this.A00 = bool;
        this.A02 = list;
    }
}
