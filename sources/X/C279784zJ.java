package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGLeadGenSubheaderTrustSignalDataDict;

/* renamed from: X.4zJ  reason: invalid class name and case insensitive filesystem */
public final class C279784zJ extends AnonymousClass0T0 implements C257813y0 {
    public final C279774zI A00;
    public final C279794zK A01;
    public final IGLeadGenSubheaderTrustSignalDataDict A02;

    public final C279784zJ F4J() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C279784zJ) {
                C279784zJ r5 = (C279784zJ) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C279794zK r0 = this.A01;
        int i = 0;
        int hashCode = (r0 == null ? 0 : r0.hashCode()) * 31;
        C279774zI r02 = this.A00;
        int hashCode2 = (hashCode + (r02 == null ? 0 : r02.hashCode())) * 31;
        IGLeadGenSubheaderTrustSignalDataDict iGLeadGenSubheaderTrustSignalDataDict = this.A02;
        if (iGLeadGenSubheaderTrustSignalDataDict != null) {
            i = iGLeadGenSubheaderTrustSignalDataDict.hashCode();
        }
        return hashCode2 + i;
    }

    public final C279794zK B68() {
        return this.A01;
    }

    public final C279774zI BMA() {
        return this.A00;
    }

    public final IGLeadGenSubheaderTrustSignalDataDict CA2() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGLeadGenPreClickDataDict", C44185CYy.A00(this));
    }

    public C279784zJ(C279774zI r1, C279794zK r2, IGLeadGenSubheaderTrustSignalDataDict iGLeadGenSubheaderTrustSignalDataDict) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = iGLeadGenSubheaderTrustSignalDataDict;
    }
}
