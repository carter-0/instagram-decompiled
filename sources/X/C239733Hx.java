package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGAdsStoryInteractiveMediaInfoDataDesignOptionEnum;
import java.util.List;

/* renamed from: X.3Hx  reason: invalid class name and case insensitive filesystem */
public final class C239733Hx extends AnonymousClass0T0 implements C239743Hy {
    public final IGAdsStoryInteractiveMediaInfoDataDesignOptionEnum A00;
    public final Boolean A01;
    public final Float A02;
    public final Float A03;
    public final Integer A04;
    public final List A05;

    public final C239733Hx F3z() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C239733Hx) {
                C239733Hx r5 = (C239733Hx) obj;
                if (!0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A05, r5.A05) || this.A00 != r5.A00 || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A04;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.A05;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        IGAdsStoryInteractiveMediaInfoDataDesignOptionEnum iGAdsStoryInteractiveMediaInfoDataDesignOptionEnum = this.A00;
        int hashCode3 = (hashCode2 + (iGAdsStoryInteractiveMediaInfoDataDesignOptionEnum == null ? 0 : iGAdsStoryInteractiveMediaInfoDataDesignOptionEnum.hashCode())) * 31;
        Boolean bool = this.A01;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Float f = this.A02;
        int hashCode5 = (hashCode4 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.A03;
        if (f2 != null) {
            i = f2.hashCode();
        }
        return hashCode5 + i;
    }

    public final Integer Aw9() {
        return this.A04;
    }

    public final List B98() {
        return this.A05;
    }

    public final IGAdsStoryInteractiveMediaInfoDataDesignOptionEnum BIK() {
        return this.A00;
    }

    public final Float Bp7() {
        return this.A02;
    }

    public final Float Bp8() {
        return this.A03;
    }

    public final Boolean CVe() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGAdsStoryInteractiveMediaInfoDataDict", C44174CYn.A00(this));
    }

    public C239733Hx(IGAdsStoryInteractiveMediaInfoDataDesignOptionEnum iGAdsStoryInteractiveMediaInfoDataDesignOptionEnum, Boolean bool, Float f, Float f2, Integer num, List list) {
        this.A04 = num;
        this.A05 = list;
        this.A00 = iGAdsStoryInteractiveMediaInfoDataDesignOptionEnum;
        this.A01 = bool;
        this.A02 = f;
        this.A03 = f2;
    }
}
