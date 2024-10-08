package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.OrganicCTAType;
import java.util.List;

/* renamed from: X.5HS  reason: invalid class name */
public final class AnonymousClass5HS extends AnonymousClass0T0 implements AnonymousClass5HT {
    public final OrganicCTAType A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public AnonymousClass5HS(OrganicCTAType organicCTAType, String str, String str2, List list) {
        0qQ.A0B(str2, 3);
        0qQ.A0B(organicCTAType, 4);
        this.A03 = list;
        this.A01 = str;
        this.A02 = str2;
        this.A00 = organicCTAType;
    }

    public final AnonymousClass5HS F7B() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5HS) {
                AnonymousClass5HS r5 = (AnonymousClass5HS) obj;
                if (!0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List list = this.A03;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.A01;
        if (str != null) {
            i = str.hashCode();
        }
        return ((((hashCode + i) * 31) + this.A02.hashCode()) * 31) + this.A00.hashCode();
    }

    public final List AtA() {
        return this.A03;
    }

    public final OrganicCTAType AtT() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTOrganicCTADict", Cb9.A00(this));
    }

    public final String getCtaSubtitle() {
        return this.A01;
    }

    public final String getCtaTitle() {
        return this.A02;
    }
}
