package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.AdFormatType;
import com.instagram.api.schemas.AppstoreMetadataDict;
import com.instagram.api.schemas.BrandedContentAdsPaidPartnershipLabelRemovalOption;
import com.instagram.api.schemas.CallAdsInfoDict;
import com.instagram.api.schemas.CallAdsInfoDictIntf;
import com.instagram.api.schemas.DynamicProductAdDisplayOption;
import com.instagram.api.schemas.IGAdCreativeStory9x16CaptionData;
import com.instagram.api.schemas.IGAdProfileProductTabDict;
import com.instagram.api.schemas.IGAdsIABScreenshotDataDict;
import com.instagram.api.schemas.IGCTATextVariant;
import com.instagram.api.schemas.IGCTMessagingAdsInfoDict;
import com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf;
import com.instagram.api.schemas.IGRFSurveyInfoDict;
import com.instagram.api.schemas.TestimonialDict;
import com.instagram.model.mediatype.CTAStyle;
import com.instagram.sponsored.signals.model.AdsCTATrustInfo;
import com.instagram.sponsored.signals.model.AdsCTATrustInfoIntf;
import com.instagram.sponsored.signals.model.AdsIAWRatingInfo;
import com.instagram.sponsored.signals.model.AdsIAWRatingInfoIntf;
import com.instagram.sponsored.signals.model.AdsRatingInfo;
import com.instagram.sponsored.signals.model.AdsRatingInfoIntf;
import com.instagram.sponsored.signals.model.AdsTextTrustInfo;
import com.instagram.sponsored.signals.model.AdsTextTrustInfoIntf;
import java.util.List;

/* renamed from: X.3lY  reason: invalid class name and case insensitive filesystem */
public final class C250503lY extends AnonymousClass0T0 implements C250513lZ {
    public final AdFormatType A00;
    public final C257573xc A01;
    public final C250173l1 A02;
    public final AppstoreMetadataDict A03;
    public final BrandedContentAdsPaidPartnershipLabelRemovalOption A04;
    public final C257603xf A05;
    public final C257653xk A06;
    public final CallAdsInfoDict A07;
    public final C255013tR A08;
    public final C250243l8 A09;
    public final C257673xm A0A;
    public final C257613xg A0B;
    public final C257633xi A0C;
    public final DynamicProductAdDisplayOption A0D;
    public final C257683xn A0E;
    public final C257553xa A0F;
    public final C257703xp A0G;
    public final IGAdCreativeStory9x16CaptionData A0H;
    public final C257723xr A0I;
    public final C257733xs A0J;
    public final IGAdProfileProductTabDict A0K;
    public final C255113tb A0L;
    public final IGAdsIABScreenshotDataDict A0M;
    public final IGCTATextVariant A0N;
    public final IGCTMessagingAdsInfoDict A0O;
    public final C250203l4 A0P;
    public final C257743xt A0Q;
    public final C250333lH A0R;
    public final C250353lJ A0S;
    public final C257813y0 A0T;
    public final C257753xu A0U;
    public final C257763xv A0V;
    public final IGRFSurveyInfoDict A0W;
    public final C257983yH A0X;
    public final C257943yD A0Y;
    public final C257783xx A0Z;
    public final C257823y1 A0a;
    public final C257863y5 A0b;
    public final C257883y7 A0c;
    public final C257893y8 A0d;
    public final C257793xy A0e;
    public final C257793xy A0f;
    public final C257953yE A0g;
    public final C257843y3 A0h;
    public final C257973yG A0i;
    public final TestimonialDict A0j;
    public final C257993yI A0k;
    public final C257593xe A0l;
    public final 1bK A0m;
    public final CTAStyle A0n;
    public final C239613Hd A0o;
    public final C239613Hd A0p;
    public final C257533xY A0q;
    public final AnonymousClass3I1 A0r;
    public final C257903y9 A0s;
    public final C257923yB A0t;
    public final AdsCTATrustInfo A0u;
    public final AdsIAWRatingInfo A0v;
    public final AdsRatingInfo A0w;
    public final AdsTextTrustInfo A0x;
    public final Boolean A0y;
    public final Boolean A0z;
    public final Boolean A10;
    public final Boolean A11;
    public final Boolean A12;
    public final Boolean A13;
    public final Boolean A14;
    public final Boolean A15;
    public final Boolean A16;
    public final Boolean A17;
    public final Boolean A18;
    public final Boolean A19;
    public final Boolean A1A;
    public final Boolean A1B;
    public final Boolean A1C;
    public final Boolean A1D;
    public final Boolean A1E;
    public final Boolean A1F;
    public final Boolean A1G;
    public final Boolean A1H;
    public final Boolean A1I;
    public final Boolean A1J;
    public final Boolean A1K;
    public final Boolean A1L;
    public final Boolean A1M;
    public final Boolean A1N;
    public final Boolean A1O;
    public final Boolean A1P;
    public final Boolean A1Q;
    public final Boolean A1R;
    public final Boolean A1S;
    public final Boolean A1T;
    public final Boolean A1U;
    public final Boolean A1V;
    public final Boolean A1W;
    public final Boolean A1X;
    public final Boolean A1Y;
    public final Boolean A1Z;
    public final Integer A1a;
    public final Integer A1b;
    public final Integer A1c;
    public final Integer A1d;
    public final Integer A1e;
    public final Integer A1f;
    public final Integer A1g;
    public final Integer A1h;
    public final Long A1i;
    public final Long A1j;
    public final String A1k;
    public final String A1l;
    public final String A1m;
    public final String A1n;
    public final String A1o;
    public final String A1p;
    public final String A1q;
    public final String A1r;
    public final String A1s;
    public final String A1t;
    public final String A1u;
    public final String A1v;
    public final String A1w;
    public final String A1x;
    public final String A1y;
    public final String A1z;
    public final String A20;
    public final String A21;
    public final String A22;
    public final String A23;
    public final String A24;
    public final String A25;
    public final String A26;
    public final String A27;
    public final String A28;
    public final String A29;
    public final String A2A;
    public final String A2B;
    public final List A2C;
    public final List A2D;
    public final List A2E;
    public final List A2F;
    public final List A2G;
    public final List A2H;
    public final List A2I;
    public final List A2J;
    public final List A2K;
    public final List A2L;
    public final List A2M;
    public final List A2N;
    public final List A2O;

    public final C250503lY FEJ(1E9 r1) {
        return this;
    }

    public final C250503lY FEK(1E6 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C250503lY) {
                C250503lY r5 = (C250503lY) obj;
                if (!0qQ.A0K(this.A1k, r5.A1k) || !0qQ.A0K(this.A1l, r5.A1l) || !0qQ.A0K(this.A1m, r5.A1m) || !0qQ.A0K(this.A0q, r5.A0q) || !0qQ.A0K(this.A1i, r5.A1i) || !0qQ.A0K(this.A1n, r5.A1n) || !0qQ.A0K(this.A1a, r5.A1a) || !0qQ.A0K(this.A0o, r5.A0o) || !0qQ.A0K(this.A0F, r5.A0F) || !0qQ.A0K(this.A1o, r5.A1o) || !0qQ.A0K(this.A0p, r5.A0p) || !0qQ.A0K(this.A0v, r5.A0v) || !0qQ.A0K(this.A0w, r5.A0w) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A1p, r5.A1p) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A1q, r5.A1q) || !0qQ.A0K(this.A03, r5.A03) || this.A04 != r5.A04 || !0qQ.A0K(this.A0l, r5.A0l) || !0qQ.A0K(this.A2C, r5.A2C) || !0qQ.A0K(this.A1j, r5.A1j) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A1r, r5.A1r) || !0qQ.A0K(this.A2D, r5.A2D) || !0qQ.A0K(this.A0P, r5.A0P) || !0qQ.A0K(this.A1s, r5.A1s) || !0qQ.A0K(this.A2E, r5.A2E) || !0qQ.A0K(this.A2F, r5.A2F) || !0qQ.A0K(this.A1t, r5.A1t) || !0qQ.A0K(this.A0B, r5.A0B) || !0qQ.A0K(this.A0C, r5.A0C) || !0qQ.A0K(this.A06, r5.A06) || this.A0n != r5.A0n || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A09, r5.A09) || !0qQ.A0K(this.A0O, r5.A0O) || !0qQ.A0K(this.A0A, r5.A0A) || !0qQ.A0K(this.A0y, r5.A0y) || !0qQ.A0K(this.A1u, r5.A1u) || !0qQ.A0K(this.A0z, r5.A0z) || !0qQ.A0K(this.A10, r5.A10) || !0qQ.A0K(this.A1v, r5.A1v) || !0qQ.A0K(this.A1b, r5.A1b) || !0qQ.A0K(this.A2G, r5.A2G) || this.A0D != r5.A0D || !0qQ.A0K(this.A11, r5.A11) || !0qQ.A0K(this.A12, r5.A12) || !0qQ.A0K(this.A1w, r5.A1w) || !0qQ.A0K(this.A1x, r5.A1x) || !0qQ.A0K(this.A0E, r5.A0E) || this.A00 != r5.A00 || !0qQ.A0K(this.A0G, r5.A0G) || !0qQ.A0K(this.A1c, r5.A1c) || !0qQ.A0K(this.A1d, r5.A1d) || !0qQ.A0K(this.A1y, r5.A1y) || !0qQ.A0K(this.A2H, r5.A2H) || !0qQ.A0K(this.A0R, r5.A0R) || !0qQ.A0K(this.A0S, r5.A0S) || !0qQ.A0K(this.A1z, r5.A1z) || !0qQ.A0K(this.A0I, r5.A0I) || !0qQ.A0K(this.A0J, r5.A0J) || !0qQ.A0K(this.A0u, r5.A0u) || !0qQ.A0K(this.A0x, r5.A0x) || !0qQ.A0K(this.A0M, r5.A0M) || !0qQ.A0K(this.A0N, r5.A0N) || !0qQ.A0K(this.A20, r5.A20) || !0qQ.A0K(this.A0L, r5.A0L) || !0qQ.A0K(this.A0Q, r5.A0Q) || !0qQ.A0K(this.A0U, r5.A0U) || !0qQ.A0K(this.A0V, r5.A0V) || !0qQ.A0K(this.A0W, r5.A0W) || !0qQ.A0K(this.A0Z, r5.A0Z) || !0qQ.A0K(this.A0e, r5.A0e) || !0qQ.A0K(this.A1e, r5.A1e) || !0qQ.A0K(this.A1f, r5.A1f) || !0qQ.A0K(this.A0r, r5.A0r) || !0qQ.A0K(this.A1C, r5.A1C) || !0qQ.A0K(this.A13, r5.A13) || !0qQ.A0K(this.A14, r5.A14) || !0qQ.A0K(this.A15, r5.A15) || !0qQ.A0K(this.A16, r5.A16) || !0qQ.A0K(this.A17, r5.A17) || !0qQ.A0K(this.A18, r5.A18) || !0qQ.A0K(this.A19, r5.A19) || !0qQ.A0K(this.A1A, r5.A1A) || !0qQ.A0K(this.A1B, r5.A1B) || !0qQ.A0K(this.A1D, r5.A1D) || !0qQ.A0K(this.A1E, r5.A1E) || !0qQ.A0K(this.A1F, r5.A1F) || !0qQ.A0K(this.A1G, r5.A1G) || !0qQ.A0K(this.A1H, r5.A1H) || !0qQ.A0K(this.A1I, r5.A1I) || !0qQ.A0K(this.A1J, r5.A1J) || !0qQ.A0K(this.A1K, r5.A1K) || !0qQ.A0K(this.A1L, r5.A1L) || !0qQ.A0K(this.A1M, r5.A1M) || !0qQ.A0K(this.A1N, r5.A1N) || !0qQ.A0K(this.A1O, r5.A1O) || !0qQ.A0K(this.A1P, r5.A1P) || !0qQ.A0K(this.A1Q, r5.A1Q) || !0qQ.A0K(this.A1g, r5.A1g) || !0qQ.A0K(this.A2I, r5.A2I) || !0qQ.A0K(this.A21, r5.A21) || !0qQ.A0K(this.A1R, r5.A1R) || !0qQ.A0K(this.A2J, r5.A2J) || !0qQ.A0K(this.A22, r5.A22) || !0qQ.A0K(this.A1S, r5.A1S) || !0qQ.A0K(this.A23, r5.A23) || !0qQ.A0K(this.A2K, r5.A2K) || !0qQ.A0K(this.A1T, r5.A1T) || !0qQ.A0K(this.A0T, r5.A0T) || !0qQ.A0K(this.A24, r5.A24) || !0qQ.A0K(this.A25, r5.A25) || !0qQ.A0K(this.A0f, r5.A0f) || !0qQ.A0K(this.A26, r5.A26) || !0qQ.A0K(this.A0a, r5.A0a) || !0qQ.A0K(this.A0h, r5.A0h) || !0qQ.A0K(this.A0b, r5.A0b) || !0qQ.A0K(this.A27, r5.A27) || !0qQ.A0K(this.A28, r5.A28) || !0qQ.A0K(this.A2L, r5.A2L) || !0qQ.A0K(this.A29, r5.A29) || !0qQ.A0K(this.A2A, r5.A2A) || !0qQ.A0K(this.A0c, r5.A0c) || !0qQ.A0K(this.A2M, r5.A2M) || !0qQ.A0K(this.A2N, r5.A2N) || !0qQ.A0K(this.A0K, r5.A0K) || !0qQ.A0K(this.A0d, r5.A0d) || !0qQ.A0K(this.A0s, r5.A0s) || !0qQ.A0K(this.A0t, r5.A0t) || !0qQ.A0K(this.A0Y, r5.A0Y) || !0qQ.A0K(this.A1U, r5.A1U) || !0qQ.A0K(this.A1V, r5.A1V) || !0qQ.A0K(this.A1W, r5.A1W) || !0qQ.A0K(this.A1X, r5.A1X) || !0qQ.A0K(this.A1Y, r5.A1Y) || !0qQ.A0K(this.A1Z, r5.A1Z) || !0qQ.A0K(this.A0g, r5.A0g) || !0qQ.A0K(this.A0i, r5.A0i) || !0qQ.A0K(this.A0H, r5.A0H) || !0qQ.A0K(this.A0m, r5.A0m) || !0qQ.A0K(this.A0j, r5.A0j) || !0qQ.A0K(this.A0X, r5.A0X) || !0qQ.A0K(this.A2B, r5.A2B) || !0qQ.A0K(this.A0k, r5.A0k) || !0qQ.A0K(this.A1h, r5.A1h) || !0qQ.A0K(this.A2O, r5.A2O)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A1k;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A1l;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A1m;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        C257533xY r0 = this.A0q;
        int hashCode4 = (hashCode3 + (r0 == null ? 0 : r0.hashCode())) * 31;
        Long l = this.A1i;
        int hashCode5 = (hashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        String str4 = this.A1n;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.A1a;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        C239613Hd r02 = this.A0o;
        int hashCode8 = (hashCode7 + (r02 == null ? 0 : r02.hashCode())) * 31;
        C257553xa r03 = this.A0F;
        int hashCode9 = (hashCode8 + (r03 == null ? 0 : r03.hashCode())) * 31;
        String str5 = this.A1o;
        int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        C239613Hd r04 = this.A0p;
        int hashCode11 = (hashCode10 + (r04 == null ? 0 : r04.hashCode())) * 31;
        AdsIAWRatingInfo adsIAWRatingInfo = this.A0v;
        int hashCode12 = (hashCode11 + (adsIAWRatingInfo == null ? 0 : adsIAWRatingInfo.hashCode())) * 31;
        AdsRatingInfo adsRatingInfo = this.A0w;
        int hashCode13 = (hashCode12 + (adsRatingInfo == null ? 0 : adsRatingInfo.hashCode())) * 31;
        C257573xc r05 = this.A01;
        int hashCode14 = (hashCode13 + (r05 == null ? 0 : r05.hashCode())) * 31;
        String str6 = this.A1p;
        int hashCode15 = (hashCode14 + (str6 == null ? 0 : str6.hashCode())) * 31;
        C250173l1 r06 = this.A02;
        int hashCode16 = (hashCode15 + (r06 == null ? 0 : r06.hashCode())) * 31;
        String str7 = this.A1q;
        int hashCode17 = (hashCode16 + (str7 == null ? 0 : str7.hashCode())) * 31;
        AppstoreMetadataDict appstoreMetadataDict = this.A03;
        int hashCode18 = (hashCode17 + (appstoreMetadataDict == null ? 0 : appstoreMetadataDict.hashCode())) * 31;
        BrandedContentAdsPaidPartnershipLabelRemovalOption brandedContentAdsPaidPartnershipLabelRemovalOption = this.A04;
        int hashCode19 = (hashCode18 + (brandedContentAdsPaidPartnershipLabelRemovalOption == null ? 0 : brandedContentAdsPaidPartnershipLabelRemovalOption.hashCode())) * 31;
        C257593xe r07 = this.A0l;
        int hashCode20 = (hashCode19 + (r07 == null ? 0 : r07.hashCode())) * 31;
        List list = this.A2C;
        int hashCode21 = (hashCode20 + (list == null ? 0 : list.hashCode())) * 31;
        Long l2 = this.A1j;
        int hashCode22 = (hashCode21 + (l2 == null ? 0 : l2.hashCode())) * 31;
        C257603xf r08 = this.A05;
        int hashCode23 = (hashCode22 + (r08 == null ? 0 : r08.hashCode())) * 31;
        CallAdsInfoDict callAdsInfoDict = this.A07;
        int hashCode24 = (hashCode23 + (callAdsInfoDict == null ? 0 : callAdsInfoDict.hashCode())) * 31;
        String str8 = this.A1r;
        int hashCode25 = (hashCode24 + (str8 == null ? 0 : str8.hashCode())) * 31;
        List list2 = this.A2D;
        int hashCode26 = (hashCode25 + (list2 == null ? 0 : list2.hashCode())) * 31;
        C250203l4 r09 = this.A0P;
        int hashCode27 = (hashCode26 + (r09 == null ? 0 : r09.hashCode())) * 31;
        String str9 = this.A1s;
        int hashCode28 = (hashCode27 + (str9 == null ? 0 : str9.hashCode())) * 31;
        List list3 = this.A2E;
        int hashCode29 = (hashCode28 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.A2F;
        int hashCode30 = (hashCode29 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str10 = this.A1t;
        int hashCode31 = (hashCode30 + (str10 == null ? 0 : str10.hashCode())) * 31;
        C257613xg r010 = this.A0B;
        int hashCode32 = (hashCode31 + (r010 == null ? 0 : r010.hashCode())) * 31;
        C257633xi r011 = this.A0C;
        int hashCode33 = (hashCode32 + (r011 == null ? 0 : r011.hashCode())) * 31;
        C257653xk r012 = this.A06;
        int hashCode34 = (hashCode33 + (r012 == null ? 0 : r012.hashCode())) * 31;
        CTAStyle cTAStyle = this.A0n;
        int hashCode35 = (hashCode34 + (cTAStyle == null ? 0 : cTAStyle.hashCode())) * 31;
        C255013tR r013 = this.A08;
        int hashCode36 = (hashCode35 + (r013 == null ? 0 : r013.hashCode())) * 31;
        C250243l8 r014 = this.A09;
        int hashCode37 = (hashCode36 + (r014 == null ? 0 : r014.hashCode())) * 31;
        IGCTMessagingAdsInfoDict iGCTMessagingAdsInfoDict = this.A0O;
        int hashCode38 = (hashCode37 + (iGCTMessagingAdsInfoDict == null ? 0 : iGCTMessagingAdsInfoDict.hashCode())) * 31;
        C257673xm r015 = this.A0A;
        int hashCode39 = (hashCode38 + (r015 == null ? 0 : r015.hashCode())) * 31;
        Boolean bool = this.A0y;
        int hashCode40 = (hashCode39 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str11 = this.A1u;
        int hashCode41 = (hashCode40 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Boolean bool2 = this.A0z;
        int hashCode42 = (hashCode41 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.A10;
        int hashCode43 = (hashCode42 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str12 = this.A1v;
        int hashCode44 = (hashCode43 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Integer num2 = this.A1b;
        int hashCode45 = (hashCode44 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List list5 = this.A2G;
        int hashCode46 = (hashCode45 + (list5 == null ? 0 : list5.hashCode())) * 31;
        DynamicProductAdDisplayOption dynamicProductAdDisplayOption = this.A0D;
        int hashCode47 = (hashCode46 + (dynamicProductAdDisplayOption == null ? 0 : dynamicProductAdDisplayOption.hashCode())) * 31;
        Boolean bool4 = this.A11;
        int hashCode48 = (hashCode47 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.A12;
        int hashCode49 = (hashCode48 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str13 = this.A1w;
        int hashCode50 = (hashCode49 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.A1x;
        int hashCode51 = (hashCode50 + (str14 == null ? 0 : str14.hashCode())) * 31;
        C257683xn r016 = this.A0E;
        int hashCode52 = (hashCode51 + (r016 == null ? 0 : r016.hashCode())) * 31;
        AdFormatType adFormatType = this.A00;
        int hashCode53 = (hashCode52 + (adFormatType == null ? 0 : adFormatType.hashCode())) * 31;
        C257703xp r017 = this.A0G;
        int hashCode54 = (hashCode53 + (r017 == null ? 0 : r017.hashCode())) * 31;
        Integer num3 = this.A1c;
        int hashCode55 = (hashCode54 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.A1d;
        int hashCode56 = (hashCode55 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str15 = this.A1y;
        int hashCode57 = (hashCode56 + (str15 == null ? 0 : str15.hashCode())) * 31;
        List list6 = this.A2H;
        int hashCode58 = (hashCode57 + (list6 == null ? 0 : list6.hashCode())) * 31;
        C250333lH r018 = this.A0R;
        int hashCode59 = (hashCode58 + (r018 == null ? 0 : r018.hashCode())) * 31;
        C250353lJ r019 = this.A0S;
        int hashCode60 = (hashCode59 + (r019 == null ? 0 : r019.hashCode())) * 31;
        String str16 = this.A1z;
        int hashCode61 = (hashCode60 + (str16 == null ? 0 : str16.hashCode())) * 31;
        C257723xr r020 = this.A0I;
        int hashCode62 = (hashCode61 + (r020 == null ? 0 : r020.hashCode())) * 31;
        C257733xs r021 = this.A0J;
        int hashCode63 = (hashCode62 + (r021 == null ? 0 : r021.hashCode())) * 31;
        AdsCTATrustInfo adsCTATrustInfo = this.A0u;
        int hashCode64 = (hashCode63 + (adsCTATrustInfo == null ? 0 : adsCTATrustInfo.hashCode())) * 31;
        AdsTextTrustInfo adsTextTrustInfo = this.A0x;
        int hashCode65 = (hashCode64 + (adsTextTrustInfo == null ? 0 : adsTextTrustInfo.hashCode())) * 31;
        IGAdsIABScreenshotDataDict iGAdsIABScreenshotDataDict = this.A0M;
        int hashCode66 = (hashCode65 + (iGAdsIABScreenshotDataDict == null ? 0 : iGAdsIABScreenshotDataDict.hashCode())) * 31;
        IGCTATextVariant iGCTATextVariant = this.A0N;
        int hashCode67 = (hashCode66 + (iGCTATextVariant == null ? 0 : iGCTATextVariant.hashCode())) * 31;
        String str17 = this.A20;
        int hashCode68 = (hashCode67 + (str17 == null ? 0 : str17.hashCode())) * 31;
        C255113tb r022 = this.A0L;
        int hashCode69 = (hashCode68 + (r022 == null ? 0 : r022.hashCode())) * 31;
        C257743xt r023 = this.A0Q;
        int hashCode70 = (hashCode69 + (r023 == null ? 0 : r023.hashCode())) * 31;
        C257753xu r024 = this.A0U;
        int hashCode71 = (hashCode70 + (r024 == null ? 0 : r024.hashCode())) * 31;
        C257763xv r025 = this.A0V;
        int hashCode72 = (hashCode71 + (r025 == null ? 0 : r025.hashCode())) * 31;
        IGRFSurveyInfoDict iGRFSurveyInfoDict = this.A0W;
        int hashCode73 = (hashCode72 + (iGRFSurveyInfoDict == null ? 0 : iGRFSurveyInfoDict.hashCode())) * 31;
        C257783xx r026 = this.A0Z;
        int hashCode74 = (hashCode73 + (r026 == null ? 0 : r026.hashCode())) * 31;
        C257793xy r027 = this.A0e;
        int hashCode75 = (hashCode74 + (r027 == null ? 0 : r027.hashCode())) * 31;
        Integer num5 = this.A1e;
        int hashCode76 = (hashCode75 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.A1f;
        int hashCode77 = (hashCode76 + (num6 == null ? 0 : num6.hashCode())) * 31;
        AnonymousClass3I1 r028 = this.A0r;
        int hashCode78 = (hashCode77 + (r028 == null ? 0 : r028.hashCode())) * 31;
        Boolean bool6 = this.A1C;
        int hashCode79 = (hashCode78 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.A13;
        int hashCode80 = (hashCode79 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.A14;
        int hashCode81 = (hashCode80 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.A15;
        int hashCode82 = (hashCode81 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.A16;
        int hashCode83 = (hashCode82 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.A17;
        int hashCode84 = (hashCode83 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        Boolean bool12 = this.A18;
        int hashCode85 = (hashCode84 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        Boolean bool13 = this.A19;
        int hashCode86 = (hashCode85 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
        Boolean bool14 = this.A1A;
        int hashCode87 = (hashCode86 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
        Boolean bool15 = this.A1B;
        int hashCode88 = (hashCode87 + (bool15 == null ? 0 : bool15.hashCode())) * 31;
        Boolean bool16 = this.A1D;
        int hashCode89 = (hashCode88 + (bool16 == null ? 0 : bool16.hashCode())) * 31;
        Boolean bool17 = this.A1E;
        int hashCode90 = (hashCode89 + (bool17 == null ? 0 : bool17.hashCode())) * 31;
        Boolean bool18 = this.A1F;
        int hashCode91 = (hashCode90 + (bool18 == null ? 0 : bool18.hashCode())) * 31;
        Boolean bool19 = this.A1G;
        int hashCode92 = (hashCode91 + (bool19 == null ? 0 : bool19.hashCode())) * 31;
        Boolean bool20 = this.A1H;
        int hashCode93 = (hashCode92 + (bool20 == null ? 0 : bool20.hashCode())) * 31;
        Boolean bool21 = this.A1I;
        int hashCode94 = (hashCode93 + (bool21 == null ? 0 : bool21.hashCode())) * 31;
        Boolean bool22 = this.A1J;
        int hashCode95 = (hashCode94 + (bool22 == null ? 0 : bool22.hashCode())) * 31;
        Boolean bool23 = this.A1K;
        int hashCode96 = (hashCode95 + (bool23 == null ? 0 : bool23.hashCode())) * 31;
        Boolean bool24 = this.A1L;
        int hashCode97 = (hashCode96 + (bool24 == null ? 0 : bool24.hashCode())) * 31;
        Boolean bool25 = this.A1M;
        int hashCode98 = (hashCode97 + (bool25 == null ? 0 : bool25.hashCode())) * 31;
        Boolean bool26 = this.A1N;
        int hashCode99 = (hashCode98 + (bool26 == null ? 0 : bool26.hashCode())) * 31;
        Boolean bool27 = this.A1O;
        int hashCode100 = (hashCode99 + (bool27 == null ? 0 : bool27.hashCode())) * 31;
        Boolean bool28 = this.A1P;
        int hashCode101 = (hashCode100 + (bool28 == null ? 0 : bool28.hashCode())) * 31;
        Boolean bool29 = this.A1Q;
        int hashCode102 = (hashCode101 + (bool29 == null ? 0 : bool29.hashCode())) * 31;
        Integer num7 = this.A1g;
        int hashCode103 = (hashCode102 + (num7 == null ? 0 : num7.hashCode())) * 31;
        List list7 = this.A2I;
        int hashCode104 = (hashCode103 + (list7 == null ? 0 : list7.hashCode())) * 31;
        String str18 = this.A21;
        int hashCode105 = (hashCode104 + (str18 == null ? 0 : str18.hashCode())) * 31;
        Boolean bool30 = this.A1R;
        int hashCode106 = (hashCode105 + (bool30 == null ? 0 : bool30.hashCode())) * 31;
        List list8 = this.A2J;
        int hashCode107 = (hashCode106 + (list8 == null ? 0 : list8.hashCode())) * 31;
        String str19 = this.A22;
        int hashCode108 = (hashCode107 + (str19 == null ? 0 : str19.hashCode())) * 31;
        Boolean bool31 = this.A1S;
        int hashCode109 = (hashCode108 + (bool31 == null ? 0 : bool31.hashCode())) * 31;
        String str20 = this.A23;
        int hashCode110 = (hashCode109 + (str20 == null ? 0 : str20.hashCode())) * 31;
        List list9 = this.A2K;
        int hashCode111 = (hashCode110 + (list9 == null ? 0 : list9.hashCode())) * 31;
        Boolean bool32 = this.A1T;
        int hashCode112 = (hashCode111 + (bool32 == null ? 0 : bool32.hashCode())) * 31;
        C257813y0 r029 = this.A0T;
        int hashCode113 = (hashCode112 + (r029 == null ? 0 : r029.hashCode())) * 31;
        String str21 = this.A24;
        int hashCode114 = (hashCode113 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.A25;
        int hashCode115 = (hashCode114 + (str22 == null ? 0 : str22.hashCode())) * 31;
        C257793xy r030 = this.A0f;
        int hashCode116 = (hashCode115 + (r030 == null ? 0 : r030.hashCode())) * 31;
        String str23 = this.A26;
        int hashCode117 = (hashCode116 + (str23 == null ? 0 : str23.hashCode())) * 31;
        C257823y1 r031 = this.A0a;
        int hashCode118 = (hashCode117 + (r031 == null ? 0 : r031.hashCode())) * 31;
        C257843y3 r032 = this.A0h;
        int hashCode119 = (hashCode118 + (r032 == null ? 0 : r032.hashCode())) * 31;
        C257863y5 r033 = this.A0b;
        int hashCode120 = (hashCode119 + (r033 == null ? 0 : r033.hashCode())) * 31;
        String str24 = this.A27;
        int hashCode121 = (hashCode120 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.A28;
        int hashCode122 = (hashCode121 + (str25 == null ? 0 : str25.hashCode())) * 31;
        List list10 = this.A2L;
        int hashCode123 = (hashCode122 + (list10 == null ? 0 : list10.hashCode())) * 31;
        String str26 = this.A29;
        int hashCode124 = (hashCode123 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.A2A;
        int hashCode125 = (hashCode124 + (str27 == null ? 0 : str27.hashCode())) * 31;
        C257883y7 r034 = this.A0c;
        int hashCode126 = (hashCode125 + (r034 == null ? 0 : r034.hashCode())) * 31;
        List list11 = this.A2M;
        int hashCode127 = (hashCode126 + (list11 == null ? 0 : list11.hashCode())) * 31;
        List list12 = this.A2N;
        int hashCode128 = (hashCode127 + (list12 == null ? 0 : list12.hashCode())) * 31;
        IGAdProfileProductTabDict iGAdProfileProductTabDict = this.A0K;
        int hashCode129 = (hashCode128 + (iGAdProfileProductTabDict == null ? 0 : iGAdProfileProductTabDict.hashCode())) * 31;
        C257893y8 r035 = this.A0d;
        int hashCode130 = (hashCode129 + (r035 == null ? 0 : r035.hashCode())) * 31;
        C257903y9 r036 = this.A0s;
        int hashCode131 = (hashCode130 + (r036 == null ? 0 : r036.hashCode())) * 31;
        C257923yB r037 = this.A0t;
        int hashCode132 = (hashCode131 + (r037 == null ? 0 : r037.hashCode())) * 31;
        C257943yD r038 = this.A0Y;
        int hashCode133 = (hashCode132 + (r038 == null ? 0 : r038.hashCode())) * 31;
        Boolean bool33 = this.A1U;
        int hashCode134 = (hashCode133 + (bool33 == null ? 0 : bool33.hashCode())) * 31;
        Boolean bool34 = this.A1V;
        int hashCode135 = (hashCode134 + (bool34 == null ? 0 : bool34.hashCode())) * 31;
        Boolean bool35 = this.A1W;
        int hashCode136 = (hashCode135 + (bool35 == null ? 0 : bool35.hashCode())) * 31;
        Boolean bool36 = this.A1X;
        int hashCode137 = (hashCode136 + (bool36 == null ? 0 : bool36.hashCode())) * 31;
        Boolean bool37 = this.A1Y;
        int hashCode138 = (hashCode137 + (bool37 == null ? 0 : bool37.hashCode())) * 31;
        Boolean bool38 = this.A1Z;
        int hashCode139 = (hashCode138 + (bool38 == null ? 0 : bool38.hashCode())) * 31;
        C257953yE r039 = this.A0g;
        int hashCode140 = (hashCode139 + (r039 == null ? 0 : r039.hashCode())) * 31;
        C257973yG r040 = this.A0i;
        int hashCode141 = (hashCode140 + (r040 == null ? 0 : r040.hashCode())) * 31;
        IGAdCreativeStory9x16CaptionData iGAdCreativeStory9x16CaptionData = this.A0H;
        int hashCode142 = (hashCode141 + (iGAdCreativeStory9x16CaptionData == null ? 0 : iGAdCreativeStory9x16CaptionData.hashCode())) * 31;
        1bK r041 = this.A0m;
        int hashCode143 = (hashCode142 + (r041 == null ? 0 : r041.hashCode())) * 31;
        TestimonialDict testimonialDict = this.A0j;
        int hashCode144 = (hashCode143 + (testimonialDict == null ? 0 : testimonialDict.hashCode())) * 31;
        C257983yH r042 = this.A0X;
        int hashCode145 = (hashCode144 + (r042 == null ? 0 : r042.hashCode())) * 31;
        String str28 = this.A2B;
        int hashCode146 = (hashCode145 + (str28 == null ? 0 : str28.hashCode())) * 31;
        C257993yI r043 = this.A0k;
        int hashCode147 = (hashCode146 + (r043 == null ? 0 : r043.hashCode())) * 31;
        Integer num8 = this.A1h;
        int hashCode148 = (hashCode147 + (num8 == null ? 0 : num8.hashCode())) * 31;
        List list13 = this.A2O;
        if (list13 != null) {
            i = list13.hashCode();
        }
        return hashCode148 + i;
    }

    public final /* bridge */ /* synthetic */ C2592741b AKZ() {
        return new C2592741b(this);
    }

    public final String AXd() {
        return this.A1k;
    }

    public final String AYn() {
        return this.A1l;
    }

    public final String AYt() {
        return this.A1m;
    }

    public final /* bridge */ /* synthetic */ C257543xZ AZ1() {
        return this.A0q;
    }

    public final Long AZ2() {
        return this.A1i;
    }

    public final String AZ4() {
        return this.A1n;
    }

    public final Integer AZB() {
        return this.A1a;
    }

    public final /* bridge */ /* synthetic */ C239623He AZE() {
        return this.A0o;
    }

    public final /* bridge */ /* synthetic */ C257563xb AZG() {
        return this.A0F;
    }

    public final String AZH() {
        return this.A1o;
    }

    public final /* bridge */ /* synthetic */ C239623He AZt() {
        return this.A0p;
    }

    public final /* bridge */ /* synthetic */ AdsIAWRatingInfoIntf AZw() {
        return this.A0v;
    }

    public final /* bridge */ /* synthetic */ AdsRatingInfoIntf Aa3() {
        return this.A0w;
    }

    public final /* bridge */ /* synthetic */ C257583xd Aa5() {
        return this.A01;
    }

    public final String Aa8() {
        return this.A1p;
    }

    public final /* bridge */ /* synthetic */ C250183l2 AaH() {
        return this.A02;
    }

    public final String Ac5() {
        return this.A1q;
    }

    public final AppstoreMetadataDict AcH() {
        return this.A03;
    }

    public final BrandedContentAdsPaidPartnershipLabelRemovalOption Afb() {
        return this.A04;
    }

    public final C257593xe AgF() {
        return this.A0l;
    }

    public final List AiF() {
        return this.A2C;
    }

    public final Long AiI() {
        return this.A1j;
    }

    public final C257603xf Aj9() {
        return this.A05;
    }

    public final /* bridge */ /* synthetic */ CallAdsInfoDictIntf AjU() {
        return this.A07;
    }

    public final String Ajw() {
        return this.A1r;
    }

    public final List AmN() {
        return this.A2D;
    }

    public final /* bridge */ /* synthetic */ C250213l5 AnU() {
        return this.A0P;
    }

    public final String ArA() {
        return this.A1s;
    }

    public final List ArM() {
        return this.A2F;
    }

    public final String AsL() {
        return this.A1t;
    }

    public final /* bridge */ /* synthetic */ C257623xh AsP() {
        return this.A0B;
    }

    public final /* bridge */ /* synthetic */ C257643xj AsR() {
        return this.A0C;
    }

    public final /* bridge */ /* synthetic */ C257663xl AtI() {
        return this.A06;
    }

    public final CTAStyle AtO() {
        return this.A0n;
    }

    public final C255013tR AtX() {
        return this.A08;
    }

    public final C250243l8 Ata() {
        return this.A09;
    }

    public final /* bridge */ /* synthetic */ IGCTMessagingAdsInfoDictIntf Atc() {
        return this.A0O;
    }

    public final C257673xm Atd() {
        return this.A0A;
    }

    public final Boolean AxE() {
        return this.A0y;
    }

    public final String Ay5() {
        return this.A1u;
    }

    public final Boolean Ay6() {
        return this.A0z;
    }

    public final Boolean AyJ() {
        return this.A10;
    }

    public final Integer Ayn() {
        return this.A1b;
    }

    public final List AzY() {
        return this.A2G;
    }

    public final DynamicProductAdDisplayOption Azd() {
        return this.A0D;
    }

    public final Boolean B10() {
        return this.A11;
    }

    public final Boolean B1H() {
        return this.A12;
    }

    public final String B44() {
        return this.A1w;
    }

    public final String B4S() {
        return this.A1x;
    }

    public final /* bridge */ /* synthetic */ C257693xo B5E() {
        return this.A0E;
    }

    public final AdFormatType B7V() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ C257713xq B97() {
        return this.A0G;
    }

    public final Integer B9V() {
        return this.A1c;
    }

    public final Integer BD9() {
        return this.A1d;
    }

    public final String BDB() {
        return this.A1y;
    }

    public final List BDE() {
        return this.A2H;
    }

    public final C250333lH BDw() {
        return this.A0R;
    }

    public final /* bridge */ /* synthetic */ C250363lK BE1() {
        return this.A0S;
    }

    public final String BE3() {
        return this.A1z;
    }

    public final C257723xr BEi() {
        return this.A0I;
    }

    public final C257733xs BEj() {
        return this.A0J;
    }

    public final /* bridge */ /* synthetic */ AdsCTATrustInfoIntf BEk() {
        return this.A0u;
    }

    public final /* bridge */ /* synthetic */ AdsTextTrustInfoIntf BEl() {
        return this.A0x;
    }

    public final IGAdsIABScreenshotDataDict BEo() {
        return this.A0M;
    }

    public final IGCTATextVariant BF0() {
        return this.A0N;
    }

    public final String BF3() {
        return this.A20;
    }

    public final /* bridge */ /* synthetic */ C255123tc BF5() {
        return this.A0L;
    }

    public final C257743xt BF6() {
        return this.A0Q;
    }

    public final C257753xu BFW() {
        return this.A0U;
    }

    public final /* bridge */ /* synthetic */ C257773xw BFX() {
        return this.A0V;
    }

    public final IGRFSurveyInfoDict BFe() {
        return this.A0W;
    }

    public final C257783xx BFg() {
        return this.A0Z;
    }

    public final /* bridge */ /* synthetic */ C257803xz BFn() {
        return this.A0e;
    }

    public final Integer BGW() {
        return this.A1e;
    }

    public final Integer BGc() {
        return this.A1f;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass3I2 BIi() {
        return this.A0r;
    }

    public final Integer BJa() {
        return this.A1g;
    }

    public final String BKL() {
        return this.A21;
    }

    public final Boolean BM4() {
        return this.A1R;
    }

    public final List BM5() {
        return this.A2J;
    }

    public final String BM6() {
        return this.A22;
    }

    public final Boolean BM8() {
        return this.A1S;
    }

    public final String BM9() {
        return this.A23;
    }

    public final List BMB() {
        return this.A2K;
    }

    public final Boolean BMC() {
        return this.A1T;
    }

    public final C257813y0 BMD() {
        return this.A0T;
    }

    public final String BMm() {
        return this.A24;
    }

    public final String BMq() {
        return this.A25;
    }

    public final /* bridge */ /* synthetic */ C257803xz BPl() {
        return this.A0f;
    }

    public final /* bridge */ /* synthetic */ C257833y2 BSA() {
        return this.A0a;
    }

    public final /* bridge */ /* synthetic */ C257853y4 BUs() {
        return this.A0h;
    }

    public final /* bridge */ /* synthetic */ C257873y6 BY1() {
        return this.A0b;
    }

    public final String BYW() {
        return this.A27;
    }

    public final String BZp() {
        return this.A28;
    }

    public final List Ba5() {
        return this.A2L;
    }

    public final String BaE() {
        return this.A29;
    }

    public final String Bby() {
        return this.A2A;
    }

    public final C257883y7 BdU() {
        return this.A0c;
    }

    public final List BeJ() {
        return this.A2M;
    }

    public final List BeK() {
        return this.A2N;
    }

    public final IGAdProfileProductTabDict BhC() {
        return this.A0K;
    }

    public final C257893y8 BhM() {
        return this.A0d;
    }

    public final /* bridge */ /* synthetic */ C257913yA Bl6() {
        return this.A0s;
    }

    public final /* bridge */ /* synthetic */ C257933yC Bl7() {
        return this.A0t;
    }

    public final C257943yD Btx() {
        return this.A0Y;
    }

    public final Boolean Bu6() {
        return this.A1U;
    }

    public final Boolean Bua() {
        return this.A1V;
    }

    public final Boolean Buk() {
        return this.A1W;
    }

    public final Boolean Bv0() {
        return this.A1X;
    }

    public final Boolean BvX() {
        return this.A1Y;
    }

    public final Boolean Bvk() {
        return this.A1Z;
    }

    public final /* bridge */ /* synthetic */ C257963yF ByK() {
        return this.A0g;
    }

    public final C257973yG C0P() {
        return this.A0i;
    }

    public final IGAdCreativeStory9x16CaptionData C3f() {
        return this.A0H;
    }

    public final /* bridge */ /* synthetic */ C65211bM C4i() {
        return this.A0m;
    }

    public final TestimonialDict C4j() {
        return this.A0j;
    }

    public final C257983yH C5I() {
        return this.A0X;
    }

    public final String C9L() {
        return this.A2B;
    }

    public final /* bridge */ /* synthetic */ C258003yJ CCN() {
        return this.A0k;
    }

    public final Integer CDI() {
        return this.A1h;
    }

    public final List CEo() {
        return this.A2O;
    }

    public final Boolean COo() {
        return this.A13;
    }

    public final Boolean CPA() {
        return this.A14;
    }

    public final Boolean CPM() {
        return this.A15;
    }

    public final Boolean CPa() {
        return this.A16;
    }

    public final Boolean CQU() {
        return this.A17;
    }

    public final Boolean CQV() {
        return this.A18;
    }

    public final Boolean CQb() {
        return this.A19;
    }

    public final Boolean CRH() {
        return this.A1A;
    }

    public final Boolean CRL() {
        return this.A1B;
    }

    public final Boolean CSx() {
        return this.A1C;
    }

    public final Boolean CTX() {
        return this.A1D;
    }

    public final Boolean CTw() {
        return this.A1E;
    }

    public final Boolean CUk() {
        return this.A1F;
    }

    public final Boolean CUv() {
        return this.A1G;
    }

    public final Boolean CWB() {
        return this.A1H;
    }

    public final Boolean CWm() {
        return this.A1I;
    }

    public final Boolean CXn() {
        return this.A1J;
    }

    public final Boolean CZ2() {
        return this.A1K;
    }

    public final Boolean CZ3() {
        return this.A1L;
    }

    public final Boolean CZV() {
        return this.A1M;
    }

    public final Boolean CZl() {
        return this.A1N;
    }

    public final Boolean Cax() {
        return this.A1O;
    }

    public final Boolean Cbd() {
        return this.A1P;
    }

    public final Boolean Cc3() {
        return this.A1Q;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTAdInsertionItemClientDict", C41880B4y.A00(this));
    }

    public final List getCookies() {
        return this.A2E;
    }

    public final String getDominantColor() {
        return this.A1v;
    }

    public final List getItems() {
        return this.A2I;
    }

    public final String getMediaId() {
        return this.A26;
    }

    public final C250513lZ E9p(1E9 r1) {
        return this;
    }

    public C250503lY(AdFormatType adFormatType, C257573xc r3, C250173l1 r4, AppstoreMetadataDict appstoreMetadataDict, BrandedContentAdsPaidPartnershipLabelRemovalOption brandedContentAdsPaidPartnershipLabelRemovalOption, C257603xf r7, C257653xk r8, CallAdsInfoDict callAdsInfoDict, C255013tR r10, C250243l8 r11, C257673xm r12, C257613xg r13, C257633xi r14, DynamicProductAdDisplayOption dynamicProductAdDisplayOption, C257683xn r16, C257553xa r17, C257703xp r18, IGAdCreativeStory9x16CaptionData iGAdCreativeStory9x16CaptionData, C257723xr r20, C257733xs r21, IGAdProfileProductTabDict iGAdProfileProductTabDict, C255113tb r23, IGAdsIABScreenshotDataDict iGAdsIABScreenshotDataDict, IGCTATextVariant iGCTATextVariant, IGCTMessagingAdsInfoDict iGCTMessagingAdsInfoDict, C250203l4 r27, C257743xt r28, C250333lH r29, C250353lJ r30, C257813y0 r31, C257753xu r32, C257763xv r33, IGRFSurveyInfoDict iGRFSurveyInfoDict, C257983yH r35, C257943yD r36, C257783xx r37, C257823y1 r38, C257863y5 r39, C257883y7 r40, C257893y8 r41, C257793xy r42, C257793xy r43, C257953yE r44, C257843y3 r45, C257973yG r46, TestimonialDict testimonialDict, C257993yI r48, C257593xe r49, 1bK r50, CTAStyle cTAStyle, C239613Hd r52, C239613Hd r53, C257533xY r54, AnonymousClass3I1 r55, C257903y9 r56, C257923yB r57, AdsCTATrustInfo adsCTATrustInfo, AdsIAWRatingInfo adsIAWRatingInfo, AdsRatingInfo adsRatingInfo, AdsTextTrustInfo adsTextTrustInfo, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, Boolean bool21, Boolean bool22, Boolean bool23, Boolean bool24, Boolean bool25, Boolean bool26, Boolean bool27, Boolean bool28, Boolean bool29, Boolean bool30, Boolean bool31, Boolean bool32, Boolean bool33, Boolean bool34, Boolean bool35, Boolean bool36, Boolean bool37, Boolean bool38, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13) {
        this.A1k = str;
        this.A1l = str2;
        this.A1m = str3;
        this.A0q = r54;
        this.A1i = l;
        this.A1n = str4;
        this.A1a = num;
        this.A0o = r52;
        this.A0F = r17;
        this.A1o = str5;
        this.A0p = r53;
        this.A0v = adsIAWRatingInfo;
        this.A0w = adsRatingInfo;
        this.A01 = r3;
        this.A1p = str6;
        this.A02 = r4;
        this.A1q = str7;
        this.A03 = appstoreMetadataDict;
        this.A04 = brandedContentAdsPaidPartnershipLabelRemovalOption;
        this.A0l = r49;
        this.A2C = list;
        this.A1j = l2;
        this.A05 = r7;
        this.A07 = callAdsInfoDict;
        this.A1r = str8;
        this.A2D = list2;
        this.A0P = r27;
        this.A1s = str9;
        this.A2E = list3;
        this.A2F = list4;
        this.A1t = str10;
        this.A0B = r13;
        this.A0C = r14;
        this.A06 = r8;
        this.A0n = cTAStyle;
        this.A08 = r10;
        this.A09 = r11;
        this.A0O = iGCTMessagingAdsInfoDict;
        this.A0A = r12;
        this.A0y = bool;
        this.A1u = str11;
        this.A0z = bool2;
        this.A10 = bool3;
        this.A1v = str12;
        this.A1b = num2;
        this.A2G = list5;
        this.A0D = dynamicProductAdDisplayOption;
        this.A11 = bool4;
        this.A12 = bool5;
        this.A1w = str13;
        this.A1x = str14;
        this.A0E = r16;
        this.A00 = adFormatType;
        this.A0G = r18;
        this.A1c = num3;
        this.A1d = num4;
        this.A1y = str15;
        this.A2H = list6;
        this.A0R = r29;
        this.A0S = r30;
        this.A1z = str16;
        this.A0I = r20;
        this.A0J = r21;
        this.A0u = adsCTATrustInfo;
        this.A0x = adsTextTrustInfo;
        this.A0M = iGAdsIABScreenshotDataDict;
        this.A0N = iGCTATextVariant;
        this.A20 = str17;
        this.A0L = r23;
        this.A0Q = r28;
        this.A0U = r32;
        this.A0V = r33;
        this.A0W = iGRFSurveyInfoDict;
        this.A0Z = r37;
        this.A0e = r42;
        this.A1e = num5;
        this.A1f = num6;
        this.A0r = r55;
        this.A1C = bool6;
        this.A13 = bool7;
        this.A14 = bool8;
        this.A15 = bool9;
        this.A16 = bool10;
        this.A17 = bool11;
        this.A18 = bool12;
        this.A19 = bool13;
        this.A1A = bool14;
        this.A1B = bool15;
        this.A1D = bool16;
        this.A1E = bool17;
        this.A1F = bool18;
        this.A1G = bool19;
        this.A1H = bool20;
        this.A1I = bool21;
        this.A1J = bool22;
        this.A1K = bool23;
        this.A1L = bool24;
        this.A1M = bool25;
        this.A1N = bool26;
        this.A1O = bool27;
        this.A1P = bool28;
        this.A1Q = bool29;
        this.A1g = num7;
        this.A2I = list7;
        this.A21 = str18;
        this.A1R = bool30;
        this.A2J = list8;
        this.A22 = str19;
        this.A1S = bool31;
        this.A23 = str20;
        this.A2K = list9;
        this.A1T = bool32;
        this.A0T = r31;
        this.A24 = str21;
        this.A25 = str22;
        this.A0f = r43;
        this.A26 = str23;
        this.A0a = r38;
        this.A0h = r45;
        this.A0b = r39;
        this.A27 = str24;
        this.A28 = str25;
        this.A2L = list10;
        this.A29 = str26;
        this.A2A = str27;
        this.A0c = r40;
        this.A2M = list11;
        this.A2N = list12;
        this.A0K = iGAdProfileProductTabDict;
        this.A0d = r41;
        this.A0s = r56;
        this.A0t = r57;
        this.A0Y = r36;
        this.A1U = bool33;
        this.A1V = bool34;
        this.A1W = bool35;
        this.A1X = bool36;
        this.A1Y = bool37;
        this.A1Z = bool38;
        this.A0g = r44;
        this.A0i = r46;
        this.A0H = iGAdCreativeStory9x16CaptionData;
        this.A0m = r50;
        this.A0j = testimonialDict;
        this.A0X = r35;
        this.A2B = str28;
        this.A0k = r48;
        this.A1h = num8;
        this.A2O = list13;
    }
}
