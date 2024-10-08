package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.MoreInfoProductTagType;
import com.instagram.api.schemas.MoreInfoSUGPositionType;
import com.instagram.api.schemas.MoreInfoStickerCTAType;
import com.instagram.api.schemas.MoreInfoTextStyle;
import com.instagram.api.schemas.MoreInfoType;
import com.instagram.sponsored.signals.model.AdsRatingInfo;
import com.instagram.sponsored.signals.model.AdsRatingInfoIntf;
import java.util.List;

/* renamed from: X.4hP  reason: invalid class name */
public final class AnonymousClass4hP extends AnonymousClass0T0 implements C270854hQ {
    public final C275704rk A00;
    public final MoreInfoProductTagType A01;
    public final MoreInfoSUGPositionType A02;
    public final MoreInfoStickerCTAType A03;
    public final MoreInfoTextStyle A04;
    public final MoreInfoType A05;
    public final AdsRatingInfo A06;
    public final Boolean A07;
    public final Boolean A08;
    public final Integer A09;
    public final String A0A;
    public final List A0B;

    public final AnonymousClass4hP F6Q() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4hP) {
                AnonymousClass4hP r5 = (AnonymousClass4hP) obj;
                if (!0qQ.A0K(this.A06, r5.A06) || this.A03 != r5.A03 || !0qQ.A0K(this.A0A, r5.A0A) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A08, r5.A08) || this.A05 != r5.A05 || this.A01 != r5.A01 || !0qQ.A0K(this.A0B, r5.A0B) || this.A02 != r5.A02 || this.A04 != r5.A04 || !0qQ.A0K(this.A09, r5.A09)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        AdsRatingInfo adsRatingInfo = this.A06;
        int i = 0;
        int hashCode = (adsRatingInfo == null ? 0 : adsRatingInfo.hashCode()) * 31;
        MoreInfoStickerCTAType moreInfoStickerCTAType = this.A03;
        int hashCode2 = (hashCode + (moreInfoStickerCTAType == null ? 0 : moreInfoStickerCTAType.hashCode())) * 31;
        String str = this.A0A;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        C275704rk r0 = this.A00;
        int hashCode4 = (hashCode3 + (r0 == null ? 0 : r0.hashCode())) * 31;
        Boolean bool = this.A07;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.A08;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        MoreInfoType moreInfoType = this.A05;
        int hashCode7 = (hashCode6 + (moreInfoType == null ? 0 : moreInfoType.hashCode())) * 31;
        MoreInfoProductTagType moreInfoProductTagType = this.A01;
        int hashCode8 = (hashCode7 + (moreInfoProductTagType == null ? 0 : moreInfoProductTagType.hashCode())) * 31;
        List list = this.A0B;
        int hashCode9 = (hashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        MoreInfoSUGPositionType moreInfoSUGPositionType = this.A02;
        int hashCode10 = (hashCode9 + (moreInfoSUGPositionType == null ? 0 : moreInfoSUGPositionType.hashCode())) * 31;
        MoreInfoTextStyle moreInfoTextStyle = this.A04;
        int hashCode11 = (hashCode10 + (moreInfoTextStyle == null ? 0 : moreInfoTextStyle.hashCode())) * 31;
        Integer num = this.A09;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode11 + i;
    }

    public final /* bridge */ /* synthetic */ AdsRatingInfoIntf Aa4() {
        return this.A06;
    }

    public final MoreInfoStickerCTAType AtM() {
        return this.A03;
    }

    public final String AyB() {
        return this.A0A;
    }

    public final C275704rk B3b() {
        return this.A00;
    }

    public final Boolean BDH() {
        return this.A07;
    }

    public final MoreInfoType BUD() {
        return this.A05;
    }

    public final MoreInfoProductTagType BgU() {
        return this.A01;
    }

    public final List C2F() {
        return this.A0B;
    }

    public final MoreInfoSUGPositionType C2j() {
        return this.A02;
    }

    public final MoreInfoTextStyle C5h() {
        return this.A04;
    }

    public final Integer CD7() {
        return this.A09;
    }

    public final Boolean CVd() {
        return this.A08;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTMoreInfoMetadata", C44219Cag.A00(this));
    }

    public AnonymousClass4hP(C275704rk r1, MoreInfoProductTagType moreInfoProductTagType, MoreInfoSUGPositionType moreInfoSUGPositionType, MoreInfoStickerCTAType moreInfoStickerCTAType, MoreInfoTextStyle moreInfoTextStyle, MoreInfoType moreInfoType, AdsRatingInfo adsRatingInfo, Boolean bool, Boolean bool2, Integer num, String str, List list) {
        this.A06 = adsRatingInfo;
        this.A03 = moreInfoStickerCTAType;
        this.A0A = str;
        this.A00 = r1;
        this.A07 = bool;
        this.A08 = bool2;
        this.A05 = moreInfoType;
        this.A01 = moreInfoProductTagType;
        this.A0B = list;
        this.A02 = moreInfoSUGPositionType;
        this.A04 = moreInfoTextStyle;
        this.A09 = num;
    }
}
