package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGAdsFeedVideoWBViewerTypeEnum;

/* renamed from: X.3tb  reason: invalid class name and case insensitive filesystem */
public final class C255113tb extends AnonymousClass0T0 implements C255123tc {
    public final IGAdsFeedVideoWBViewerTypeEnum A00;
    public final Boolean A01;
    public final Float A02;

    public final C255113tb F3w() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C255113tb) {
                C255113tb r5 = (C255113tb) obj;
                if (!0qQ.A0K(this.A02, r5.A02) || this.A00 != r5.A00 || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Float f = this.A02;
        int i = 0;
        int hashCode = (f == null ? 0 : f.hashCode()) * 31;
        IGAdsFeedVideoWBViewerTypeEnum iGAdsFeedVideoWBViewerTypeEnum = this.A00;
        int hashCode2 = (hashCode + (iGAdsFeedVideoWBViewerTypeEnum == null ? 0 : iGAdsFeedVideoWBViewerTypeEnum.hashCode())) * 31;
        Boolean bool = this.A01;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode2 + i;
    }

    public final Float BEm() {
        return this.A02;
    }

    public final IGAdsFeedVideoWBViewerTypeEnum BEn() {
        return this.A00;
    }

    public final Boolean Cd2() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGAdsFeedVideoWBInfoDict", C44173CYm.A00(this));
    }

    public C255113tb(IGAdsFeedVideoWBViewerTypeEnum iGAdsFeedVideoWBViewerTypeEnum, Boolean bool, Float f) {
        this.A02 = f;
        this.A00 = iGAdsFeedVideoWBViewerTypeEnum;
        this.A01 = bool;
    }
}
