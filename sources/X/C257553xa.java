package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.3xa  reason: invalid class name and case insensitive filesystem */
public final class C257553xa extends AnonymousClass0T0 implements C257563xb {
    public final String A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public final C257553xa F37() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C257553xa) {
                C257553xa r5 = (C257553xa) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02)) {
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
        List list = this.A03;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.A01;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A02;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public final String AZ4() {
        return this.A00;
    }

    public final List Bdo() {
        return this.A03;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTFeedImageTooltipAdTagDict", B70.A00(this));
    }

    public final String getSubtitle() {
        return this.A01;
    }

    public final String getTitle() {
        return this.A02;
    }

    public C257553xa(String str, String str2, String str3, List list) {
        this.A00 = str;
        this.A03 = list;
        this.A01 = str2;
        this.A02 = str3;
    }
}
