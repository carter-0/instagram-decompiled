package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.TIFUAppDestinationEnum;

/* renamed from: X.4oS  reason: invalid class name and case insensitive filesystem */
public final class C274494oS extends AnonymousClass0T0 implements C274504oT {
    public final TIFUAppDestinationEnum A00;
    public final String A01;

    public final C274494oS FCI() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C274494oS) {
                C274494oS r5 = (C274494oS) obj;
                if (this.A00 != r5.A00 || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        TIFUAppDestinationEnum tIFUAppDestinationEnum = this.A00;
        int i = 0;
        int hashCode = (tIFUAppDestinationEnum == null ? 0 : tIFUAppDestinationEnum.hashCode()) * 31;
        String str = this.A01;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final TIFUAppDestinationEnum BKS() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTTIFUAppUrl", C44499Cfv.A00(this));
    }

    public final String getUrl() {
        return this.A01;
    }

    public C274494oS(TIFUAppDestinationEnum tIFUAppDestinationEnum, String str) {
        this.A00 = tIFUAppDestinationEnum;
        this.A01 = str;
    }
}
