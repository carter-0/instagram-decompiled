package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGPBIAProfileBrowseTypeEnum;

/* renamed from: X.3xv  reason: invalid class name and case insensitive filesystem */
public final class C257763xv extends AnonymousClass0T0 implements C257773xw {
    public final IGPBIAProfileBrowseTypeEnum A00;
    public final Boolean A01;

    public final C257763xv F4r() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C257763xv) {
                C257763xv r5 = (C257763xv) obj;
                if (this.A00 != r5.A00 || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        IGPBIAProfileBrowseTypeEnum iGPBIAProfileBrowseTypeEnum = this.A00;
        int i = 0;
        int hashCode = (iGPBIAProfileBrowseTypeEnum == null ? 0 : iGPBIAProfileBrowseTypeEnum.hashCode()) * 31;
        Boolean bool = this.A01;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }

    public final IGPBIAProfileBrowseTypeEnum BFY() {
        return this.A00;
    }

    public final Boolean BuS() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGPBIAProfileBrowseInfoDict", CZE.A00(this));
    }

    public C257763xv(IGPBIAProfileBrowseTypeEnum iGPBIAProfileBrowseTypeEnum, Boolean bool) {
        this.A00 = iGPBIAProfileBrowseTypeEnum;
        this.A01 = bool;
    }
}
