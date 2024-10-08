package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.MoreInfoFacepilePositionType;
import com.instagram.api.schemas.MoreInfoFacepileSizeType;

/* renamed from: X.4rj  reason: invalid class name and case insensitive filesystem */
public final class C275694rj extends AnonymousClass0T0 implements C275704rk {
    public final MoreInfoFacepilePositionType A00;
    public final MoreInfoFacepileSizeType A01;

    public final C275694rj F6P() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C275694rj) {
                C275694rj r5 = (C275694rj) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        MoreInfoFacepilePositionType moreInfoFacepilePositionType = this.A00;
        int i = 0;
        int hashCode = (moreInfoFacepilePositionType == null ? 0 : moreInfoFacepilePositionType.hashCode()) * 31;
        MoreInfoFacepileSizeType moreInfoFacepileSizeType = this.A01;
        if (moreInfoFacepileSizeType != null) {
            i = moreInfoFacepileSizeType.hashCode();
        }
        return hashCode + i;
    }

    public final MoreInfoFacepilePositionType Bdn() {
        return this.A00;
    }

    public final MoreInfoFacepileSizeType Bwd() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTMoreInfoFacepileMetadata", C44218Caf.A00(this));
    }

    public C275694rj(MoreInfoFacepilePositionType moreInfoFacepilePositionType, MoreInfoFacepileSizeType moreInfoFacepileSizeType) {
        this.A00 = moreInfoFacepilePositionType;
        this.A01 = moreInfoFacepileSizeType;
    }
}
