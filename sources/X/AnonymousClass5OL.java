package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.CreateModeType;
import java.util.List;

/* renamed from: X.5OL  reason: invalid class name */
public final class AnonymousClass5OL extends AnonymousClass0T0 implements AnonymousClass5OM {
    public final CreateModeType A00;
    public final C42040BEs A01;
    public final C46238DRt A02;
    public final C42141BIw A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final List A07;
    public final List A08;

    public final AnonymousClass5OL F2C(1E9 r1) {
        return this;
    }

    public final AnonymousClass5OL F2D(1E6 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5OL) {
                AnonymousClass5OL r5 = (AnonymousClass5OL) obj;
                if (!0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A05, r5.A05) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List list = this.A06;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.A07;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        C42040BEs bEs = this.A01;
        int hashCode3 = (hashCode2 + (bEs == null ? 0 : bEs.hashCode())) * 31;
        C46238DRt dRt = this.A02;
        int hashCode4 = (hashCode3 + (dRt == null ? 0 : dRt.hashCode())) * 31;
        String str = this.A04;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        List list3 = this.A08;
        int hashCode6 = (hashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        C42141BIw bIw = this.A03;
        int hashCode7 = (hashCode6 + (bIw == null ? 0 : bIw.hashCode())) * 31;
        String str2 = this.A05;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CreateModeType createModeType = this.A00;
        if (createModeType != null) {
            i = createModeType.hashCode();
        }
        return hashCode8 + i;
    }

    public final List Alk() {
        return this.A06;
    }

    public final List B8Z() {
        return this.A07;
    }

    public final /* bridge */ /* synthetic */ C46278DTh B9H() {
        return this.A01;
    }

    public final C46238DRt BA8() {
        return this.A02;
    }

    public final List BdY() {
        return this.A08;
    }

    public final /* bridge */ /* synthetic */ DT7 C4f() {
        return this.A03;
    }

    public final String C75() {
        return this.A05;
    }

    public final CreateModeType CAL() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTCreateModeInfo", CWS.A00(this));
    }

    public final String getName() {
        return this.A04;
    }

    public AnonymousClass5OL(CreateModeType createModeType, C42040BEs bEs, C46238DRt dRt, C42141BIw bIw, String str, String str2, List list, List list2, List list3) {
        this.A06 = list;
        this.A07 = list2;
        this.A01 = bEs;
        this.A02 = dRt;
        this.A04 = str;
        this.A08 = list3;
        this.A03 = bIw;
        this.A05 = str2;
        this.A00 = createModeType;
    }

    public final AnonymousClass5OM E7H(1E9 r1) {
        return this;
    }
}
