package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGAdsRrFormatEnum;

/* renamed from: X.51u  reason: invalid class name and case insensitive filesystem */
public final class C2804251u extends AnonymousClass0T0 implements C2804351v {
    public final UN3 A00;
    public final IGAdsRrFormatEnum A01;
    public final UOA A02;

    public final C2804251u FF7() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2804251u) {
                C2804251u r5 = (C2804251u) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A02, r5.A02) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        UN3 un3 = this.A00;
        int i = 0;
        int hashCode = (un3 == null ? 0 : un3.hashCode()) * 31;
        UOA uoa = this.A02;
        int hashCode2 = (hashCode + (uoa == null ? 0 : uoa.hashCode())) * 31;
        IGAdsRrFormatEnum iGAdsRrFormatEnum = this.A01;
        if (iGAdsRrFormatEnum != null) {
            i = iGAdsRrFormatEnum.hashCode();
        }
        return hashCode2 + i;
    }

    public final /* bridge */ /* synthetic */ XAV ArS() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ C21021XAa Bgi() {
        return this.A02;
    }

    public final IGAdsRrFormatEnum Boq() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGAdsRatingsAndReviewsInfoDict", C17014VEo.A00(this));
    }

    public C2804251u(UN3 un3, IGAdsRrFormatEnum iGAdsRrFormatEnum, UOA uoa) {
        this.A00 = un3;
        this.A02 = uoa;
        this.A01 = iGAdsRrFormatEnum;
    }
}
