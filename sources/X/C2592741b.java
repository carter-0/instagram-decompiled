package X;

import com.facebook.pando.TreeJNI;
import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.AdFormatType;
import com.instagram.api.schemas.AppstoreMetadataDict;
import com.instagram.api.schemas.AppstoreMetadataDictImpl;
import com.instagram.api.schemas.BrandedContentAdsPaidPartnershipLabelRemovalOption;
import com.instagram.api.schemas.CallAdsInfoDict;
import com.instagram.api.schemas.CallAdsInfoDictIntf;
import com.instagram.api.schemas.DynamicProductAdDisplayOption;
import com.instagram.api.schemas.IGAdCreativeStory9x16CaptionData;
import com.instagram.api.schemas.IGAdCreativeStory9x16CaptionDataImpl;
import com.instagram.api.schemas.IGAdProfileProductTabDict;
import com.instagram.api.schemas.IGAdProfileProductTabDictImpl;
import com.instagram.api.schemas.IGAdsIABScreenshotDataDict;
import com.instagram.api.schemas.IGAdsIABScreenshotDataDictImpl;
import com.instagram.api.schemas.IGCTATextVariant;
import com.instagram.api.schemas.IGCTATextVariantImpl;
import com.instagram.api.schemas.IGCTMessagingAdsInfoDict;
import com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf;
import com.instagram.api.schemas.IGPostTriggerExperience;
import com.instagram.api.schemas.IGRFSurveyInfoDict;
import com.instagram.api.schemas.IGRFSurveyInfoDictImpl;
import com.instagram.api.schemas.PostTriggerExperienceEligibleTrigger;
import com.instagram.api.schemas.TestimonialDict;
import com.instagram.api.schemas.TestimonialDictImpl;
import com.instagram.common.session.UserSession;
import com.instagram.model.androidlink.AndroidLink;
import com.instagram.model.mediatype.CTAStyle;
import com.instagram.sponsored.signals.model.AdsCTATrustInfo;
import com.instagram.sponsored.signals.model.AdsCTATrustInfoIntf;
import com.instagram.sponsored.signals.model.AdsIAWRatingInfo;
import com.instagram.sponsored.signals.model.AdsIAWRatingInfoIntf;
import com.instagram.sponsored.signals.model.AdsRatingInfo;
import com.instagram.sponsored.signals.model.AdsRatingInfoIntf;
import com.instagram.sponsored.signals.model.AdsTextTrustInfo;
import com.instagram.sponsored.signals.model.AdsTextTrustInfoIntf;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.41b  reason: invalid class name and case insensitive filesystem */
public class C2592741b {
    public C257583xd A00;
    public C257603xf A01;
    public C255013tR A02;
    public C257673xm A03;
    public C257563xb A04;
    public IGCTMessagingAdsInfoDictIntf A05;
    public C250213l5 A06;
    public C257883y7 A07;
    public C257893y8 A08;
    public C257803xz A09;
    public C257853y4 A0A;
    public CTAStyle A0B;
    public C239623He A0C;
    public C239623He A0D;
    public C257543xZ A0E;
    public AnonymousClass3I2 A0F;
    public C257913yA A0G;
    public AdsCTATrustInfoIntf A0H;
    public AdsIAWRatingInfoIntf A0I;
    public AdsRatingInfoIntf A0J;
    public AdsTextTrustInfoIntf A0K;
    public Boolean A0L;
    public Boolean A0M;
    public Boolean A0N;
    public Boolean A0O;
    public Boolean A0P;
    public Boolean A0Q;
    public Boolean A0R;
    public Boolean A0S;
    public Boolean A0T;
    public Boolean A0U;
    public Boolean A0V;
    public Boolean A0W;
    public Boolean A0X;
    public Boolean A0Y;
    public Boolean A0Z;
    public Integer A0a;
    public Integer A0b;
    public Integer A0c;
    public Integer A0d;
    public Integer A0e;
    public String A0f;
    public String A0g;
    public String A0h;
    public String A0i;
    public String A0j;
    public String A0k;
    public String A0l;
    public String A0m;
    public String A0n;
    public String A0o;
    public String A0p;
    public String A0q;
    public String A0r;
    public String A0s;
    public String A0t;
    public String A0u;
    public String A0v;
    public String A0w;
    public String A0x;
    public String A0y;
    public List A0z;
    public List A10;
    public List A11;
    public List A12;
    public List A13;
    public AdFormatType A14;
    public C250183l2 A15;
    public AppstoreMetadataDict A16;
    public BrandedContentAdsPaidPartnershipLabelRemovalOption A17;
    public C257663xl A18;
    public CallAdsInfoDictIntf A19;
    public C250243l8 A1A;
    public C257623xh A1B;
    public C257643xj A1C;
    public DynamicProductAdDisplayOption A1D;
    public C257693xo A1E;
    public C257713xq A1F;
    public IGAdCreativeStory9x16CaptionData A1G;
    public C257723xr A1H;
    public C257733xs A1I;
    public IGAdProfileProductTabDict A1J;
    public C255123tc A1K;
    public IGAdsIABScreenshotDataDict A1L;
    public IGCTATextVariant A1M;
    public C257743xt A1N;
    public C250333lH A1O;
    public C250363lK A1P;
    public C257813y0 A1Q;
    public C257753xu A1R;
    public C257773xw A1S;
    public IGRFSurveyInfoDict A1T;
    public C257983yH A1U;
    public C257943yD A1V;
    public C257783xx A1W;
    public C257833y2 A1X;
    public C257873y6 A1Y;
    public C257803xz A1Z;
    public C257963yF A1a;
    public C257973yG A1b;
    public TestimonialDict A1c;
    public C258003yJ A1d;
    public C257593xe A1e;
    public C65211bM A1f;
    public C257933yC A1g;
    public Boolean A1h;
    public Boolean A1i;
    public Boolean A1j;
    public Boolean A1k;
    public Boolean A1l;
    public Boolean A1m;
    public Boolean A1n;
    public Boolean A1o;
    public Boolean A1p;
    public Boolean A1q;
    public Boolean A1r;
    public Boolean A1s;
    public Boolean A1t;
    public Boolean A1u;
    public Boolean A1v;
    public Boolean A1w;
    public Boolean A1x;
    public Boolean A1y;
    public Boolean A1z;
    public Boolean A20;
    public Boolean A21;
    public Boolean A22;
    public Boolean A23;
    public Integer A24;
    public Integer A25;
    public Integer A26;
    public Long A27;
    public Long A28;
    public String A29;
    public String A2A;
    public String A2B;
    public String A2C;
    public String A2D;
    public String A2E;
    public String A2F;
    public String A2G;
    public List A2H;
    public List A2I;
    public List A2J;
    public List A2K;
    public List A2L;
    public List A2M;
    public List A2N;
    public List A2O;
    public final C250513lZ A2P;

    public final C250503lY A00() {
        C257533xY r69;
        C239613Hd r67;
        C257553xa r32;
        C239613Hd r68;
        AdsIAWRatingInfo adsIAWRatingInfo;
        AdsRatingInfo adsRatingInfo;
        C257573xc r18;
        C250173l1 r19;
        BE0 be0;
        CallAdsInfoDict callAdsInfoDict;
        ArrayList arrayList;
        C250203l4 r42;
        ArrayList arrayList2;
        C257613xg r28;
        C257633xi r29;
        C257653xk r23;
        C255003tQ r25;
        C250233l7 r26;
        IGCTMessagingAdsInfoDict iGCTMessagingAdsInfoDict;
        UMr uMr;
        ArrayList arrayList3;
        C257683xn r31;
        C257703xp r33;
        ArrayList arrayList4;
        C250323lG r44;
        C250353lJ r45;
        UN1 un1;
        UN2 un2;
        AdsCTATrustInfo adsCTATrustInfo;
        AdsTextTrustInfo adsTextTrustInfo;
        IGAdsIABScreenshotDataDictImpl iGAdsIABScreenshotDataDictImpl;
        IGCTATextVariantImpl iGCTATextVariantImpl;
        C255113tb r38;
        AnonymousClass56L r43;
        BFA bfa;
        C257763xv r48;
        IGRFSurveyInfoDictImpl iGRFSurveyInfoDictImpl;
        AnonymousClass5CY r52;
        C257793xy r57;
        AnonymousClass3I1 r70;
        ArrayList arrayList5;
        ArrayList arrayList6;
        C279784zJ r46;
        C257793xy r58;
        C257823y1 r53;
        C257843y3 r60;
        C257863y5 r54;
        C282165Ca r55;
        IGAdProfileProductTabDictImpl iGAdProfileProductTabDictImpl;
        C2808854p r56;
        C257903y9 r71;
        C257923yB r72;
        C279814zN r51;
        C257953yE r59;
        C42081BGk bGk;
        IGAdCreativeStory9x16CaptionDataImpl iGAdCreativeStory9x16CaptionDataImpl;
        1bK r65;
        TestimonialDictImpl testimonialDictImpl;
        BFC bfc;
        C257993yI r63;
        AppstoreMetadataDictImpl appstoreMetadataDictImpl = null;
        1E9 r4 = new 1E9(new 1hu((UserSession) null), 6, false);
        String str = this.A29;
        String str2 = this.A0f;
        String str3 = this.A0g;
        C257543xZ r0 = this.A0E;
        if (r0 != null) {
            r69 = r0.FF9();
        } else {
            r69 = null;
        }
        Long l = this.A27;
        String str4 = this.A0h;
        Integer num = this.A24;
        C239623He r02 = this.A0C;
        if (r02 != null) {
            r67 = r02.FF4();
        } else {
            r67 = null;
        }
        C257563xb r03 = this.A04;
        if (r03 != null) {
            r32 = r03.F37();
        } else {
            r32 = null;
        }
        String str5 = this.A0i;
        C239623He r04 = this.A0D;
        if (r04 != null) {
            r68 = r04.FF4();
        } else {
            r68 = null;
        }
        AdsIAWRatingInfoIntf adsIAWRatingInfoIntf = this.A0I;
        if (adsIAWRatingInfoIntf != null) {
            adsIAWRatingInfo = adsIAWRatingInfoIntf.FGg();
        } else {
            adsIAWRatingInfo = null;
        }
        AdsRatingInfoIntf adsRatingInfoIntf = this.A0J;
        if (adsRatingInfoIntf != null) {
            adsRatingInfo = adsRatingInfoIntf.FGh();
        } else {
            adsRatingInfo = null;
        }
        C257583xd r05 = this.A00;
        if (r05 != null) {
            r18 = r05.F0I(r4);
        } else {
            r18 = null;
        }
        String str6 = this.A0j;
        C250183l2 r06 = this.A15;
        if (r06 != null) {
            r19 = r06.F0M();
        } else {
            r19 = null;
        }
        String str7 = this.A0k;
        AppstoreMetadataDict appstoreMetadataDict = this.A16;
        if (appstoreMetadataDict != null) {
            appstoreMetadataDictImpl = appstoreMetadataDict.F0X();
        }
        BrandedContentAdsPaidPartnershipLabelRemovalOption brandedContentAdsPaidPartnershipLabelRemovalOption = this.A17;
        C257593xe r64 = this.A1e;
        List list = this.A2H;
        Long l2 = this.A28;
        C257603xf r07 = this.A01;
        if (r07 != null) {
            be0 = r07.F15();
        } else {
            be0 = null;
        }
        CallAdsInfoDictIntf callAdsInfoDictIntf = this.A19;
        if (callAdsInfoDictIntf != null) {
            callAdsInfoDict = callAdsInfoDictIntf.F19();
        } else {
            callAdsInfoDict = null;
        }
        String str8 = this.A0l;
        List<C250073kr> list2 = this.A0z;
        if (list2 != null) {
            arrayList = new ArrayList(0Yv.A1E(list2, 10));
            for (C250073kr F16 : list2) {
                arrayList.add(F16.F16());
            }
        } else {
            arrayList = null;
        }
        C250213l5 r08 = this.A06;
        if (r08 != null) {
            r42 = r08.F48();
        } else {
            r42 = null;
        }
        String str9 = this.A2A;
        List list3 = this.A10;
        List<C250073kr> list4 = this.A11;
        if (list4 != null) {
            arrayList2 = new ArrayList(0Yv.A1E(list4, 10));
            for (C250073kr F162 : list4) {
                arrayList2.add(F162.F16());
            }
        } else {
            arrayList2 = null;
        }
        String str10 = this.A0m;
        C257623xh r09 = this.A1B;
        if (r09 != null) {
            r28 = r09.F2E();
        } else {
            r28 = null;
        }
        C257643xj r010 = this.A1C;
        if (r010 != null) {
            r29 = r010.F2F();
        } else {
            r29 = null;
        }
        C257663xl r011 = this.A18;
        if (r011 != null) {
            r23 = r011.F17();
        } else {
            r23 = null;
        }
        CTAStyle cTAStyle = this.A0B;
        C255013tR r012 = this.A02;
        if (r012 != null) {
            r25 = r012.F1K();
        } else {
            r25 = null;
        }
        C250243l8 r013 = this.A1A;
        if (r013 != null) {
            r26 = r013.F1L();
        } else {
            r26 = null;
        }
        IGCTMessagingAdsInfoDictIntf iGCTMessagingAdsInfoDictIntf = this.A05;
        if (iGCTMessagingAdsInfoDictIntf != null) {
            iGCTMessagingAdsInfoDict = iGCTMessagingAdsInfoDictIntf.F47();
        } else {
            iGCTMessagingAdsInfoDict = null;
        }
        C257673xm r014 = this.A03;
        if (r014 != null) {
            uMr = r014.F1M();
        } else {
            uMr = null;
        }
        Boolean bool = this.A0L;
        String str11 = this.A0n;
        Boolean bool2 = this.A0M;
        Boolean bool3 = this.A0N;
        String str12 = this.A0o;
        Integer num2 = this.A0a;
        List<DTD> list5 = this.A12;
        if (list5 != null) {
            arrayList3 = new ArrayList(0Yv.A1E(list5, 10));
            for (DTD F2i : list5) {
                arrayList3.add(F2i.F2i());
            }
        } else {
            arrayList3 = null;
        }
        DynamicProductAdDisplayOption dynamicProductAdDisplayOption = this.A1D;
        Boolean bool4 = this.A1h;
        Boolean bool5 = this.A1i;
        String str13 = this.A0p;
        String str14 = this.A0q;
        C257693xo r015 = this.A1E;
        if (r015 != null) {
            r31 = r015.F36();
        } else {
            r31 = null;
        }
        AdFormatType adFormatType = this.A14;
        C257713xq r016 = this.A1F;
        if (r016 != null) {
            r33 = r016.F3Q();
        } else {
            r33 = null;
        }
        Integer num3 = this.A0b;
        Integer num4 = this.A0c;
        String str15 = this.A2B;
        List<C250273lB> list6 = this.A13;
        if (list6 != null) {
            arrayList4 = new ArrayList(0Yv.A1E(list6, 10));
            for (C250273lB F3f : list6) {
                arrayList4.add(F3f.F3f());
            }
        } else {
            arrayList4 = null;
        }
        C250333lH r017 = this.A1O;
        if (r017 != null) {
            r44 = r017.F4E();
        } else {
            r44 = null;
        }
        C250363lK r018 = this.A1P;
        if (r018 != null) {
            r45 = r018.F4F();
        } else {
            r45 = null;
        }
        String str16 = this.A2C;
        C257723xr r019 = this.A1H;
        if (r019 != null) {
            un1 = r019.F3p();
        } else {
            un1 = null;
        }
        C257733xs r020 = this.A1I;
        if (r020 != null) {
            un2 = r020.F3q();
        } else {
            un2 = null;
        }
        AdsCTATrustInfoIntf adsCTATrustInfoIntf = this.A0H;
        if (adsCTATrustInfoIntf != null) {
            adsCTATrustInfo = adsCTATrustInfoIntf.FGf();
        } else {
            adsCTATrustInfo = null;
        }
        AdsTextTrustInfoIntf adsTextTrustInfoIntf = this.A0K;
        if (adsTextTrustInfoIntf != null) {
            adsTextTrustInfo = adsTextTrustInfoIntf.FGi();
        } else {
            adsTextTrustInfo = null;
        }
        IGAdsIABScreenshotDataDict iGAdsIABScreenshotDataDict = this.A1L;
        if (iGAdsIABScreenshotDataDict != null) {
            iGAdsIABScreenshotDataDictImpl = iGAdsIABScreenshotDataDict.F3x();
        } else {
            iGAdsIABScreenshotDataDictImpl = null;
        }
        IGCTATextVariant iGCTATextVariant = this.A1M;
        if (iGCTATextVariant != null) {
            iGCTATextVariantImpl = iGCTATextVariant.F46();
        } else {
            iGCTATextVariantImpl = null;
        }
        String str17 = this.A2D;
        C255123tc r021 = this.A1K;
        if (r021 != null) {
            r38 = r021.F3w();
        } else {
            r38 = null;
        }
        C257743xt r022 = this.A1N;
        if (r022 != null) {
            r43 = r022.F4C();
        } else {
            r43 = null;
        }
        C257753xu r023 = this.A1R;
        if (r023 != null) {
            bfa = r023.F4q();
        } else {
            bfa = null;
        }
        C257773xw r024 = this.A1S;
        if (r024 != null) {
            r48 = r024.F4r();
        } else {
            r48 = null;
        }
        IGRFSurveyInfoDict iGRFSurveyInfoDict = this.A1T;
        if (iGRFSurveyInfoDict != null) {
            iGRFSurveyInfoDictImpl = iGRFSurveyInfoDict.F51();
        } else {
            iGRFSurveyInfoDictImpl = null;
        }
        C257783xx r025 = this.A1W;
        if (r025 != null) {
            r52 = r025.F57();
        } else {
            r52 = null;
        }
        C257803xz r026 = this.A1Z;
        if (r026 != null) {
            r57 = r026.F8Z();
        } else {
            r57 = null;
        }
        Integer num5 = this.A0d;
        Integer num6 = this.A25;
        AnonymousClass3I2 r027 = this.A0F;
        if (r027 != null) {
            r70 = r027.FG3();
        } else {
            r70 = null;
        }
        Boolean bool6 = this.A1q;
        Boolean bool7 = this.A1j;
        Boolean bool8 = this.A0O;
        Boolean bool9 = this.A1k;
        Boolean bool10 = this.A1l;
        Boolean bool11 = this.A1m;
        Boolean bool12 = this.A1n;
        Boolean bool13 = this.A1o;
        Boolean bool14 = this.A1p;
        Boolean bool15 = this.A0P;
        Boolean bool16 = this.A1r;
        Boolean bool17 = this.A1s;
        Boolean bool18 = this.A0Q;
        Boolean bool19 = this.A1t;
        Boolean bool20 = this.A1u;
        Boolean bool21 = this.A0R;
        Boolean bool22 = this.A0S;
        Boolean bool23 = this.A0T;
        Boolean bool24 = this.A0U;
        Boolean bool25 = this.A1v;
        Boolean bool26 = this.A0V;
        Boolean bool27 = this.A0W;
        Boolean bool28 = this.A0X;
        Boolean bool29 = this.A1w;
        Integer num7 = this.A0e;
        List list7 = this.A2I;
        String str18 = this.A0r;
        Boolean bool30 = this.A1x;
        List<AndroidLink> list8 = this.A2J;
        if (list8 != null) {
            arrayList5 = new ArrayList(0Yv.A1E(list8, 10));
            for (AndroidLink FES : list8) {
                arrayList5.add(FES.FES());
            }
        } else {
            arrayList5 = null;
        }
        String str19 = this.A2E;
        Boolean bool31 = this.A1y;
        String str20 = this.A0s;
        List<AndroidLink> list9 = this.A2K;
        if (list9 != null) {
            arrayList6 = new ArrayList(0Yv.A1E(list9, 10));
            for (AndroidLink FES2 : list9) {
                arrayList6.add(FES2.FES());
            }
        } else {
            arrayList6 = null;
        }
        Boolean bool32 = this.A1z;
        C257813y0 r028 = this.A1Q;
        if (r028 != null) {
            r46 = r028.F4J();
        } else {
            r46 = null;
        }
        String str21 = this.A0t;
        String str22 = this.A0u;
        C257803xz r029 = this.A09;
        if (r029 != null) {
            r58 = r029.F8Z();
        } else {
            r58 = null;
        }
        String str23 = this.A0v;
        C257833y2 r030 = this.A1X;
        if (r030 != null) {
            r53 = r030.F6A();
        } else {
            r53 = null;
        }
        C257853y4 r031 = this.A0A;
        if (r031 != null) {
            r60 = r031.F9J(r4);
        } else {
            r60 = null;
        }
        C257873y6 r032 = this.A1Y;
        if (r032 != null) {
            r54 = r032.F71();
        } else {
            r54 = null;
        }
        String str24 = this.A2F;
        String str25 = this.A0w;
        List list10 = this.A2L;
        String str26 = this.A0x;
        String str27 = this.A2G;
        C257883y7 r033 = this.A07;
        if (r033 != null) {
            r55 = r033.F7X();
        } else {
            r55 = null;
        }
        List list11 = this.A2M;
        List list12 = this.A2N;
        IGAdProfileProductTabDict iGAdProfileProductTabDict = this.A1J;
        if (iGAdProfileProductTabDict != null) {
            iGAdProfileProductTabDictImpl = iGAdProfileProductTabDict.F3r(r4);
        } else {
            iGAdProfileProductTabDictImpl = null;
        }
        C257893y8 r034 = this.A08;
        if (r034 != null) {
            r56 = r034.F8E();
        } else {
            r56 = null;
        }
        C257913yA r035 = this.A0G;
        if (r035 != null) {
            r71 = r035.FGZ();
        } else {
            r71 = null;
        }
        C257933yC r036 = this.A1g;
        if (r036 != null) {
            r72 = r036.FGa();
        } else {
            r72 = null;
        }
        C257943yD r037 = this.A1V;
        if (r037 != null) {
            r51 = r037.F53();
        } else {
            r51 = null;
        }
        Boolean bool33 = this.A20;
        Boolean bool34 = this.A21;
        Boolean bool35 = this.A0Y;
        Boolean bool36 = this.A0Z;
        Boolean bool37 = this.A22;
        Boolean bool38 = this.A23;
        C257963yF r038 = this.A1a;
        if (r038 != null) {
            r59 = r038.F9I();
        } else {
            r59 = null;
        }
        C257973yG r039 = this.A1b;
        if (r039 != null) {
            bGk = r039.F9o();
        } else {
            bGk = null;
        }
        IGAdCreativeStory9x16CaptionData iGAdCreativeStory9x16CaptionData = this.A1G;
        if (iGAdCreativeStory9x16CaptionData != null) {
            iGAdCreativeStory9x16CaptionDataImpl = iGAdCreativeStory9x16CaptionData.F3o();
        } else {
            iGAdCreativeStory9x16CaptionDataImpl = null;
        }
        C65211bM r040 = this.A1f;
        if (r040 != null) {
            r65 = r040.FDv(r4);
        } else {
            r65 = null;
        }
        TestimonialDict testimonialDict = this.A1c;
        if (testimonialDict != null) {
            testimonialDictImpl = testimonialDict.FCN(r4);
        } else {
            testimonialDictImpl = null;
        }
        C257983yH r041 = this.A1U;
        if (r041 != null) {
            bfc = r041.F52();
        } else {
            bfc = null;
        }
        String str28 = this.A0y;
        C258003yJ r042 = this.A1d;
        if (r042 != null) {
            r63 = r042.FD0(r4);
        } else {
            r63 = null;
        }
        return new C250503lY(adFormatType, r18, r19, appstoreMetadataDictImpl, brandedContentAdsPaidPartnershipLabelRemovalOption, be0, r23, callAdsInfoDict, r25, r26, uMr, r28, r29, dynamicProductAdDisplayOption, r31, r32, r33, iGAdCreativeStory9x16CaptionDataImpl, un1, un2, iGAdProfileProductTabDictImpl, r38, iGAdsIABScreenshotDataDictImpl, iGCTATextVariantImpl, iGCTMessagingAdsInfoDict, r42, r43, r44, r45, r46, bfa, r48, iGRFSurveyInfoDictImpl, bfc, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, bGk, testimonialDictImpl, r63, r64, r65, cTAStyle, r67, r68, r69, r70, r71, r72, adsCTATrustInfo, adsIAWRatingInfo, adsRatingInfo, adsTextTrustInfo, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, bool10, bool11, bool12, bool13, bool14, bool15, bool16, bool17, bool18, bool19, bool20, bool21, bool22, bool23, bool24, bool25, bool26, bool27, bool28, bool29, bool30, bool31, bool32, bool33, bool34, bool35, bool36, bool37, bool38, num, num2, num3, num4, num5, num6, num7, this.A26, l, l2, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, list, arrayList, list3, arrayList2, arrayList3, arrayList4, list7, arrayList5, arrayList6, list10, list11, list12, this.A2O);
    }

    public final C250513lZ A01() {
        Object obj;
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        TreeUpdaterJNI treeUpdaterJNI3;
        TreeUpdaterJNI treeUpdaterJNI4;
        TreeUpdaterJNI treeUpdaterJNI5;
        TreeUpdaterJNI treeUpdaterJNI6;
        TreeUpdaterJNI treeUpdaterJNI7;
        TreeUpdaterJNI treeUpdaterJNI8;
        TreeUpdaterJNI treeUpdaterJNI9;
        String str;
        TreeUpdaterJNI treeUpdaterJNI10;
        TreeUpdaterJNI treeUpdaterJNI11;
        TreeUpdaterJNI treeUpdaterJNI12;
        ArrayList arrayList;
        TreeUpdaterJNI treeUpdaterJNI13;
        ArrayList arrayList2;
        TreeUpdaterJNI treeUpdaterJNI14;
        TreeUpdaterJNI treeUpdaterJNI15;
        TreeUpdaterJNI treeUpdaterJNI16;
        String str2;
        TreeUpdaterJNI treeUpdaterJNI17;
        TreeUpdaterJNI treeUpdaterJNI18;
        TreeUpdaterJNI treeUpdaterJNI19;
        TreeUpdaterJNI treeUpdaterJNI20;
        ArrayList arrayList3;
        String str3;
        TreeUpdaterJNI treeUpdaterJNI21;
        String str4;
        TreeUpdaterJNI treeUpdaterJNI22;
        ArrayList arrayList4;
        TreeUpdaterJNI treeUpdaterJNI23;
        TreeUpdaterJNI treeUpdaterJNI24;
        TreeUpdaterJNI treeUpdaterJNI25;
        TreeUpdaterJNI treeUpdaterJNI26;
        TreeUpdaterJNI treeUpdaterJNI27;
        TreeUpdaterJNI treeUpdaterJNI28;
        TreeUpdaterJNI treeUpdaterJNI29;
        TreeUpdaterJNI treeUpdaterJNI30;
        TreeUpdaterJNI treeUpdaterJNI31;
        TreeUpdaterJNI treeUpdaterJNI32;
        TreeUpdaterJNI treeUpdaterJNI33;
        TreeUpdaterJNI treeUpdaterJNI34;
        TreeUpdaterJNI treeUpdaterJNI35;
        TreeUpdaterJNI treeUpdaterJNI36;
        TreeUpdaterJNI treeUpdaterJNI37;
        TreeUpdaterJNI treeUpdaterJNI38;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        TreeUpdaterJNI treeUpdaterJNI39;
        TreeUpdaterJNI treeUpdaterJNI40;
        TreeUpdaterJNI treeUpdaterJNI41;
        TreeUpdaterJNI treeUpdaterJNI42;
        TreeUpdaterJNI treeUpdaterJNI43;
        TreeUpdaterJNI treeUpdaterJNI44;
        ArrayList arrayList8;
        ArrayList arrayList9;
        TreeUpdaterJNI treeUpdaterJNI45;
        TreeUpdaterJNI treeUpdaterJNI46;
        TreeUpdaterJNI treeUpdaterJNI47;
        TreeUpdaterJNI treeUpdaterJNI48;
        TreeUpdaterJNI treeUpdaterJNI49;
        TreeUpdaterJNI treeUpdaterJNI50;
        TreeUpdaterJNI treeUpdaterJNI51;
        TreeUpdaterJNI treeUpdaterJNI52;
        TreeUpdaterJNI treeUpdaterJNI53;
        TreeUpdaterJNI treeUpdaterJNI54;
        TreeUpdaterJNI treeUpdaterJNI55;
        TreeUpdaterJNI treeUpdaterJNI56 = null;
        new 1E9(new 1hu((UserSession) null), 6, false);
        C250513lZ r0 = this.A2P;
        C250513lZ r16 = r0;
        if (r0 instanceof C2592841c) {
            0eP[] r61 = new 0eP[149];
            0eP r02 = new 0eP("about_ad_params", this.A29);
            0eP r03 = new 0eP("actor_id", this.A0f);
            0eP r04 = new 0eP("ad_action", this.A0g);
            C257543xZ r05 = this.A0E;
            if (r05 != null) {
                treeUpdaterJNI = r05.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            0eP r06 = new 0eP("ad_disclaimer_info", treeUpdaterJNI);
            0eP r07 = new 0eP("ad_expiry_timestamp_in_millis", this.A27);
            0eP r6 = new 0eP("ad_id", this.A0h);
            0eP r08 = new 0eP("ad_objective_type", this.A24);
            C239623He r09 = this.A0C;
            if (r09 != null) {
                treeUpdaterJNI2 = r09.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            0eP r010 = new 0eP("ad_pod_rules", treeUpdaterJNI2);
            C257563xb r011 = this.A04;
            if (r011 != null) {
                treeUpdaterJNI3 = r011.FHC();
            } else {
                treeUpdaterJNI3 = null;
            }
            0eP r012 = new 0eP("ad_tag", treeUpdaterJNI3);
            0eP r013 = new 0eP("ad_title", this.A0i);
            C239623He r014 = this.A0D;
            if (r014 != null) {
                treeUpdaterJNI4 = r014.FHC();
            } else {
                treeUpdaterJNI4 = null;
            }
            0eP r015 = new 0eP("adpod_rules", treeUpdaterJNI4);
            AdsIAWRatingInfoIntf adsIAWRatingInfoIntf = this.A0I;
            if (adsIAWRatingInfoIntf != null) {
                treeUpdaterJNI5 = adsIAWRatingInfoIntf.FHC();
            } else {
                treeUpdaterJNI5 = null;
            }
            0eP r016 = new 0eP("ads_iaw_rating_info", treeUpdaterJNI5);
            AdsRatingInfoIntf adsRatingInfoIntf = this.A0J;
            if (adsRatingInfoIntf != null) {
                treeUpdaterJNI6 = adsRatingInfoIntf.FHC();
            } else {
                treeUpdaterJNI6 = null;
            }
            0eP r017 = new 0eP("ads_rating_and_review_info", treeUpdaterJNI6);
            C257583xd r018 = this.A00;
            if (r018 != null) {
                treeUpdaterJNI7 = r018.FHC();
            } else {
                treeUpdaterJNI7 = null;
            }
            0eP r019 = new 0eP("ads_shopping_info", treeUpdaterJNI7);
            0eP r020 = new 0eP("adtaxon_i18n_top1_l7_prediction", this.A0j);
            C250183l2 r021 = this.A15;
            if (r021 != null) {
                treeUpdaterJNI8 = r021.FHC();
            } else {
                treeUpdaterJNI8 = null;
            }
            0eP r15 = new 0eP("afi_info", treeUpdaterJNI8);
            0eP r14 = new 0eP("app_id", this.A0k);
            AppstoreMetadataDict appstoreMetadataDict = this.A16;
            if (appstoreMetadataDict != null) {
                treeUpdaterJNI9 = appstoreMetadataDict.FHC();
            } else {
                treeUpdaterJNI9 = null;
            }
            0eP r13 = new 0eP("appstore_metadata", treeUpdaterJNI9);
            BrandedContentAdsPaidPartnershipLabelRemovalOption brandedContentAdsPaidPartnershipLabelRemovalOption = this.A17;
            if (brandedContentAdsPaidPartnershipLabelRemovalOption != null) {
                str = brandedContentAdsPaidPartnershipLabelRemovalOption.A00;
            } else {
                str = null;
            }
            0eP r12 = new 0eP("bca_ppl_removal_option", str);
            C257593xe r022 = this.A1e;
            if (r022 != null) {
                treeUpdaterJNI10 = r022.A00();
            } else {
                treeUpdaterJNI10 = null;
            }
            0eP r11 = new 0eP("bloks_cta_component", treeUpdaterJNI10);
            0eP r10 = new 0eP("brs_applied_content_blocklists", this.A2H);
            0eP r9 = new 0eP("brs_threshold", this.A28);
            C257603xf r023 = this.A01;
            if (r023 != null) {
                treeUpdaterJNI11 = r023.FHC();
            } else {
                treeUpdaterJNI11 = null;
            }
            0eP r8 = new 0eP("buyer_incentive_feed", treeUpdaterJNI11);
            CallAdsInfoDictIntf callAdsInfoDictIntf = this.A19;
            if (callAdsInfoDictIntf != null) {
                treeUpdaterJNI12 = callAdsInfoDictIntf.FHC();
            } else {
                treeUpdaterJNI12 = null;
            }
            0eP r7 = new 0eP("call_ads_info", treeUpdaterJNI12);
            0eP r5 = new 0eP("campaign_id", this.A0l);
            List<C250073kr> list = this.A0z;
            if (list != null) {
                arrayList = new ArrayList();
                for (C250073kr r024 : list) {
                    if (r024 != null) {
                        arrayList.add(r024.FHC());
                    }
                }
            } else {
                arrayList = null;
            }
            0eP r4 = new 0eP("cca_optimization_options", arrayList);
            C250213l5 r025 = this.A06;
            if (r025 != null) {
                treeUpdaterJNI13 = r025.FHC();
            } else {
                treeUpdaterJNI13 = null;
            }
            System.arraycopy(new 0eP[]{r02, r03, r04, r06, r07, r6, r08, r010, r012, r013, r015, r016, r017, r019, r020, r15, r14, r13, r12, r11, r10, r9, r8, r7, r5, r4, new 0eP("click_to_direct_lead_gen_ads_info", treeUpdaterJNI13)}, 0, r61, 0, 27);
            0eP r026 = new 0eP("contextual_label_info", this.A2A);
            0eP r027 = new 0eP("cookies", this.A10);
            List<C250073kr> list2 = this.A11;
            if (list2 != null) {
                arrayList2 = new ArrayList();
                for (C250073kr r028 : list2) {
                    if (r028 != null) {
                        arrayList2.add(r028.FHC());
                    }
                }
            } else {
                arrayList2 = null;
            }
            0eP r029 = new 0eP("cop_render_output", arrayList2);
            0eP r030 = new 0eP("creation_source", this.A0m);
            C257623xh r031 = this.A1B;
            if (r031 != null) {
                treeUpdaterJNI14 = r031.FHC();
            } else {
                treeUpdaterJNI14 = null;
            }
            0eP r032 = new 0eP("creative_transformations", treeUpdaterJNI14);
            C257643xj r033 = this.A1C;
            if (r033 != null) {
                treeUpdaterJNI15 = r033.FHC();
            } else {
                treeUpdaterJNI15 = null;
            }
            0eP r62 = new 0eP("creative_transformations_v2", treeUpdaterJNI15);
            C257663xl r034 = this.A18;
            if (r034 != null) {
                treeUpdaterJNI16 = r034.FHC();
            } else {
                treeUpdaterJNI16 = null;
            }
            0eP r035 = new 0eP("cta_info", treeUpdaterJNI16);
            CTAStyle cTAStyle = this.A0B;
            if (cTAStyle != null) {
                str2 = cTAStyle.A00;
            } else {
                str2 = null;
            }
            0eP r036 = new 0eP("cta_style", str2);
            C255013tR r037 = this.A02;
            if (r037 != null) {
                treeUpdaterJNI17 = r037.FHC();
            } else {
                treeUpdaterJNI17 = null;
            }
            0eP r038 = new 0eP("ctd_ads_info", treeUpdaterJNI17);
            C250243l8 r039 = this.A1A;
            if (r039 != null) {
                treeUpdaterJNI18 = r039.FHC();
            } else {
                treeUpdaterJNI18 = null;
            }
            0eP r040 = new 0eP("ctj_ads_info", treeUpdaterJNI18);
            IGCTMessagingAdsInfoDictIntf iGCTMessagingAdsInfoDictIntf = this.A05;
            if (iGCTMessagingAdsInfoDictIntf != null) {
                treeUpdaterJNI19 = iGCTMessagingAdsInfoDictIntf.FHC();
            } else {
                treeUpdaterJNI19 = null;
            }
            0eP r041 = new 0eP("ctmessaging_ads_info", treeUpdaterJNI19);
            C257673xm r042 = this.A03;
            if (r042 != null) {
                treeUpdaterJNI20 = r042.FHC();
            } else {
                treeUpdaterJNI20 = null;
            }
            0eP r043 = new 0eP("ctw_fallback_wrapper", treeUpdaterJNI20);
            0eP r044 = new 0eP("direct_share", this.A0L);
            0eP r045 = new 0eP("display_domain", this.A0n);
            0eP r046 = new 0eP("display_fb_page_name", this.A0M);
            0eP r152 = new 0eP("display_viewability_eligible", this.A0N);
            0eP r142 = new 0eP("dominant_color", this.A0o);
            0eP r132 = new 0eP("dr_ad_type", this.A0a);
            List<DTD> list3 = this.A12;
            if (list3 != null) {
                arrayList3 = new ArrayList();
                for (DTD dtd : list3) {
                    if (dtd != null) {
                        arrayList3.add(dtd.FHC());
                    }
                }
            } else {
                arrayList3 = null;
            }
            0eP r122 = new 0eP("dynamic_ads_links", arrayList3);
            DynamicProductAdDisplayOption dynamicProductAdDisplayOption = this.A1D;
            if (dynamicProductAdDisplayOption != null) {
                str3 = dynamicProductAdDisplayOption.A00;
            } else {
                str3 = null;
            }
            0eP r112 = new 0eP("dynamic_product_ad_display_option", str3);
            0eP r102 = new 0eP("enable_ads_follow_button", this.A1h);
            0eP r92 = new 0eP("enable_reels_end_scene", this.A1i);
            0eP r82 = new 0eP("fb_app_id", this.A0p);
            0eP r72 = new 0eP("fb_page_url", this.A0q);
            C257693xo r047 = this.A1E;
            if (r047 != null) {
                treeUpdaterJNI21 = r047.FHC();
            } else {
                treeUpdaterJNI21 = null;
            }
            0eP r52 = new 0eP("feed_end_scene_data", treeUpdaterJNI21);
            AdFormatType adFormatType = this.A14;
            if (adFormatType != null) {
                str4 = adFormatType.A00;
            } else {
                str4 = null;
            }
            0eP r42 = new 0eP("format_type", str4);
            C257713xq r048 = this.A1F;
            if (r048 != null) {
                treeUpdaterJNI22 = r048.FHC();
            } else {
                treeUpdaterJNI22 = null;
            }
            System.arraycopy(new 0eP[]{r026, r027, r029, r030, r032, r62, r035, r036, r038, r040, r041, r043, r044, r045, r046, r152, r142, r132, r122, r112, r102, r92, r82, r72, r52, r42, new 0eP("gesture_to_action_info", treeUpdaterJNI22)}, 0, r61, 27, 27);
            0eP r049 = new 0eP("global_position", this.A0b);
            0eP r050 = new 0eP("hide_flow_type", this.A0c);
            0eP r051 = new 0eP("hide_label", this.A2B);
            List<C250273lB> list4 = this.A13;
            if (list4 != null) {
                arrayList4 = new ArrayList();
                for (C250273lB r052 : list4) {
                    if (r052 != null) {
                        arrayList4.add(r052.FHC());
                    }
                }
            } else {
                arrayList4 = null;
            }
            0eP r053 = new 0eP("hide_reasons_v2", arrayList4);
            C250333lH r054 = this.A1O;
            if (r054 != null) {
                treeUpdaterJNI23 = r054.FHC();
            } else {
                treeUpdaterJNI23 = null;
            }
            0eP r055 = new 0eP("iab", treeUpdaterJNI23);
            C250363lK r056 = this.A1P;
            if (r056 != null) {
                treeUpdaterJNI24 = r056.FHC();
            } else {
                treeUpdaterJNI24 = null;
            }
            0eP r63 = new 0eP("iab_post_click_data", treeUpdaterJNI24);
            0eP r057 = new 0eP("iaw_wca_exclusion_targeting_rule_oc", this.A2C);
            C257723xr r058 = this.A1H;
            if (r058 != null) {
                treeUpdaterJNI25 = r058.FHC();
            } else {
                treeUpdaterJNI25 = null;
            }
            0eP r059 = new 0eP("ig_ad_media_smart_crop_info", treeUpdaterJNI25);
            C257733xs r060 = this.A1I;
            if (r060 != null) {
                treeUpdaterJNI26 = r060.FHC();
            } else {
                treeUpdaterJNI26 = null;
            }
            0eP r061 = new 0eP("ig_ad_media_text_ocr_info", treeUpdaterJNI26);
            AdsCTATrustInfoIntf adsCTATrustInfoIntf = this.A0H;
            if (adsCTATrustInfoIntf != null) {
                treeUpdaterJNI27 = adsCTATrustInfoIntf.FHC();
            } else {
                treeUpdaterJNI27 = null;
            }
            0eP r062 = new 0eP("ig_ad_rendering_cta_trust_info_data", treeUpdaterJNI27);
            AdsTextTrustInfoIntf adsTextTrustInfoIntf = this.A0K;
            if (adsTextTrustInfoIntf != null) {
                treeUpdaterJNI28 = adsTextTrustInfoIntf.FHC();
            } else {
                treeUpdaterJNI28 = null;
            }
            0eP r063 = new 0eP("ig_ad_rendering_text_trust_info_data", treeUpdaterJNI28);
            IGAdsIABScreenshotDataDict iGAdsIABScreenshotDataDict = this.A1L;
            if (iGAdsIABScreenshotDataDict != null) {
                treeUpdaterJNI29 = iGAdsIABScreenshotDataDict.FHC();
            } else {
                treeUpdaterJNI29 = null;
            }
            0eP r064 = new 0eP("ig_ads_iab_screenshot_data", treeUpdaterJNI29);
            IGCTATextVariant iGCTATextVariant = this.A1M;
            if (iGCTATextVariant != null) {
                treeUpdaterJNI30 = iGCTATextVariant.FHC();
            } else {
                treeUpdaterJNI30 = null;
            }
            0eP r065 = new 0eP("ig_cta_text_variant_data", treeUpdaterJNI30);
            0eP r066 = new 0eP("ig_events_extracted_date", this.A2D);
            C255123tc r067 = this.A1K;
            if (r067 != null) {
                treeUpdaterJNI31 = r067.FHC();
            } else {
                treeUpdaterJNI31 = null;
            }
            0eP r068 = new 0eP("ig_feed_video_watch_and_browse_info", treeUpdaterJNI31);
            C257743xt r069 = this.A1N;
            if (r069 != null) {
                treeUpdaterJNI32 = r069.FHC();
            } else {
                treeUpdaterJNI32 = null;
            }
            0eP r153 = new 0eP("ig_format_liquidity_ads_info", treeUpdaterJNI32);
            C257753xu r070 = this.A1R;
            if (r070 != null) {
                treeUpdaterJNI33 = r070.FHC();
            } else {
                treeUpdaterJNI33 = null;
            }
            0eP r143 = new 0eP("ig_oops_survey_info", treeUpdaterJNI33);
            C257773xw r071 = this.A1S;
            if (r071 != null) {
                treeUpdaterJNI34 = r071.FHC();
            } else {
                treeUpdaterJNI34 = null;
            }
            0eP r133 = new 0eP("ig_pbia_profile_and_browse_info", treeUpdaterJNI34);
            IGRFSurveyInfoDict iGRFSurveyInfoDict = this.A1T;
            if (iGRFSurveyInfoDict != null) {
                treeUpdaterJNI35 = iGRFSurveyInfoDict.FHC();
            } else {
                treeUpdaterJNI35 = null;
            }
            0eP r123 = new 0eP("ig_rf_survey_info", treeUpdaterJNI35);
            C257783xx r072 = this.A1W;
            if (r072 != null) {
                treeUpdaterJNI36 = r072.FHC();
            } else {
                treeUpdaterJNI36 = null;
            }
            0eP r113 = new 0eP("ig_transparency_and_control_disclaimer_data", treeUpdaterJNI36);
            C257803xz r073 = this.A1Z;
            if (r073 != null) {
                treeUpdaterJNI37 = r073.FHC();
            } else {
                treeUpdaterJNI37 = null;
            }
            0eP r103 = new 0eP("igtv_media_background", treeUpdaterJNI37);
            0eP r93 = new 0eP("imp_signature", this.A0d);
            0eP r83 = new 0eP("impression_signature", this.A25);
            AnonymousClass3I2 r074 = this.A0F;
            if (r074 != null) {
                treeUpdaterJNI38 = r074.FHC();
            } else {
                treeUpdaterJNI38 = null;
            }
            System.arraycopy(new 0eP[]{r049, r050, r051, r053, r055, r63, r057, r059, r061, r062, r063, r064, r065, r066, r068, r153, r143, r133, r123, r113, r103, r93, r83, new 0eP("invalidation_rules", treeUpdaterJNI38), new 0eP("isExternalUrlLandingPage", this.A1q), new 0eP("is_app_mae_ad_exclusion_eligible", this.A1j), new 0eP("is_autotranslated", this.A0O)}, 0, r61, 54, 27);
            0eP r075 = new 0eP("is_bau_ifu_eligible", this.A1k);
            0eP r076 = new 0eP("is_boosted", this.A1l);
            0eP r077 = new 0eP("is_consent_growth_ifu_eligible", this.A1m);
            0eP r078 = new 0eP("is_consent_growth_popup_eligible", this.A1n);
            0eP r079 = new 0eP("is_conversions_ad_with_upcoming_event", this.A1o);
            0eP r53 = new 0eP("is_delayed_skip_ad", this.A1p);
            0eP r080 = new 0eP("is_demo", this.A0P);
            0eP r081 = new 0eP("is_feed_glados_control_eligible", this.A1r);
            0eP r082 = new 0eP("is_form_extension_eligible", this.A1s);
            0eP r083 = new 0eP("is_holdout", this.A0Q);
            0eP r084 = new 0eP("is_ig_events_excluded_ad", this.A1t);
            0eP r085 = new 0eP("is_leadgen_native_eligible", this.A1u);
            0eP r086 = new 0eP("is_luxury_vertical_ad", this.A0R);
            0eP r087 = new 0eP("is_multi_ads_eligible", this.A0S);
            0eP r088 = new 0eP("is_pharma_and_sensitive_vertical_ad", this.A0T);
            0eP r144 = new 0eP("is_pharma_vertical_ad", this.A0U);
            0eP r134 = new 0eP("is_post_click_afi_eligible", this.A1v);
            0eP r124 = new 0eP("is_previewable_video_ad", this.A0V);
            0eP r114 = new 0eP("is_rev_share", this.A0W);
            0eP r104 = new 0eP("is_sensitive_vertical_ad", this.A0X);
            0eP r94 = new 0eP("is_shops_ifu_eligible", this.A1w);
            0eP r84 = new 0eP("item_type", this.A0e);
            List<1Xj> list5 = this.A2I;
            if (list5 != null) {
                arrayList5 = new ArrayList(0Yv.A1E(list5, 10));
                for (1Xj A1C2 : list5) {
                    arrayList5.add(A1C2.A1C());
                }
            } else {
                arrayList5 = null;
            }
            0eP r154 = new 0eP(DialogModule.KEY_ITEMS, arrayList5);
            0eP r73 = new 0eP("label", this.A0r);
            0eP r64 = new 0eP("lead_gen_allow_phone_zip_format_improvement", this.A1x);
            List<AndroidLink> list6 = this.A2J;
            if (list6 != null) {
                arrayList6 = new ArrayList();
                for (AndroidLink androidLink : list6) {
                    if (androidLink != null) {
                        arrayList6.add(androidLink.FHC());
                    }
                }
            } else {
                arrayList6 = null;
            }
            System.arraycopy(new 0eP[]{r075, r076, r077, r078, r079, r53, r080, r081, r082, r083, r084, r085, r086, r087, r088, r144, r134, r124, r114, r104, r94, r84, r154, r73, r64, new 0eP("lead_gen_android_links", arrayList6), new 0eP("lead_gen_call_to_action_title", this.A2E)}, 0, r61, 81, 27);
            0eP r089 = new 0eP("lead_gen_force_full_page_context_card", this.A1y);
            0eP r090 = new 0eP("lead_gen_form_id", this.A0s);
            List<AndroidLink> list7 = this.A2K;
            if (list7 != null) {
                arrayList7 = new ArrayList();
                for (AndroidLink androidLink2 : list7) {
                    if (androidLink2 != null) {
                        arrayList7.add(androidLink2.FHC());
                    }
                }
            } else {
                arrayList7 = null;
            }
            0eP r091 = new 0eP("lead_gen_ios_links", arrayList7);
            0eP r092 = new 0eP("lead_gen_new_experience_ineligible", this.A1z);
            C257813y0 r093 = this.A1Q;
            if (r093 != null) {
                treeUpdaterJNI39 = r093.FHC();
            } else {
                treeUpdaterJNI39 = null;
            }
            0eP r094 = new 0eP("lead_gen_preclick_data", treeUpdaterJNI39);
            0eP r2 = new 0eP("link_hint_text", this.A0t);
            0eP r095 = new 0eP("link_text", this.A0u);
            C257803xz r096 = this.A09;
            if (r096 != null) {
                treeUpdaterJNI40 = r096.FHC();
            } else {
                treeUpdaterJNI40 = null;
            }
            0eP r097 = new 0eP("media_background", treeUpdaterJNI40);
            0eP r098 = new 0eP("media_id", this.A0v);
            C257833y2 r099 = this.A1X;
            if (r099 != null) {
                treeUpdaterJNI41 = r099.FHC();
            } else {
                treeUpdaterJNI41 = null;
            }
            0eP r0100 = new 0eP("message_extension_info", treeUpdaterJNI41);
            C257853y4 r0101 = this.A0A;
            if (r0101 != null) {
                treeUpdaterJNI42 = r0101.FHC();
            } else {
                treeUpdaterJNI42 = null;
            }
            0eP r0102 = new 0eP("music_info", treeUpdaterJNI42);
            C257873y6 r0103 = this.A1Y;
            if (r0103 != null) {
                treeUpdaterJNI43 = r0103.FHC();
            } else {
                treeUpdaterJNI43 = null;
            }
            0eP r0104 = new 0eP("on_impressions_control", treeUpdaterJNI43);
            0eP r0105 = new 0eP("optimization_goal_name", this.A2F);
            0eP r0106 = new 0eP("overlay_subtitle", this.A0w);
            0eP r0107 = new 0eP("pac_ad_media_ids", this.A2L);
            0eP r115 = new 0eP("page_id", this.A0x);
            0eP r105 = new 0eP(C21058XCk.A01(9, 12, 49), this.A2G);
            C257883y7 r0108 = this.A07;
            if (r0108 != null) {
                treeUpdaterJNI44 = r0108.FHC();
            } else {
                treeUpdaterJNI44 = null;
            }
            0eP r95 = new 0eP("political_context", treeUpdaterJNI44);
            List<IGPostTriggerExperience> list8 = this.A2M;
            if (list8 != null) {
                arrayList8 = new ArrayList(0Yv.A1E(list8, 10));
                for (IGPostTriggerExperience iGPostTriggerExperience : list8) {
                    0qQ.A0B(iGPostTriggerExperience, 0);
                    arrayList8.add(iGPostTriggerExperience.A00);
                }
            } else {
                arrayList8 = null;
            }
            0eP r135 = new 0eP("post_trigger_experience_eligibilities", arrayList8);
            List<PostTriggerExperienceEligibleTrigger> list9 = this.A2N;
            if (list9 != null) {
                arrayList9 = new ArrayList(0Yv.A1E(list9, 10));
                for (PostTriggerExperienceEligibleTrigger postTriggerExperienceEligibleTrigger : list9) {
                    0qQ.A0B(postTriggerExperienceEligibleTrigger, 0);
                    arrayList9.add(postTriggerExperienceEligibleTrigger.A00);
                }
            } else {
                arrayList9 = null;
            }
            0eP r155 = new 0eP("post_trigger_experience_eligible_triggers", arrayList9);
            IGAdProfileProductTabDict iGAdProfileProductTabDict = this.A1J;
            if (iGAdProfileProductTabDict != null) {
                treeUpdaterJNI45 = iGAdProfileProductTabDict.FHC();
            } else {
                treeUpdaterJNI45 = null;
            }
            0eP r145 = new 0eP("profile_product_tab_data", treeUpdaterJNI45);
            C257893y8 r0109 = this.A08;
            if (r0109 != null) {
                treeUpdaterJNI46 = r0109.FHC();
            } else {
                treeUpdaterJNI46 = null;
            }
            0eP r125 = new 0eP("profile_visit_ads_info", treeUpdaterJNI46);
            C257913yA r0110 = this.A0G;
            if (r0110 != null) {
                treeUpdaterJNI47 = r0110.FHC();
            } else {
                treeUpdaterJNI47 = null;
            }
            0eP r85 = new 0eP("reels_mid_scene_info", treeUpdaterJNI47);
            C257933yC r0111 = this.A1g;
            if (r0111 != null) {
                treeUpdaterJNI48 = r0111.FHC();
            } else {
                treeUpdaterJNI48 = null;
            }
            0eP r74 = new 0eP("reels_multi_ads_info", treeUpdaterJNI48);
            C257943yD r0112 = this.A1V;
            if (r0112 != null) {
                treeUpdaterJNI49 = r0112.FHC();
            } else {
                treeUpdaterJNI49 = null;
            }
            System.arraycopy(new 0eP[]{r089, r090, r091, r092, r094, r2, r095, r097, r098, r0100, r0102, r0104, r0105, r0106, r0107, r115, r105, r95, r135, r155, r145, r125, r85, r74, new 0eP("short_video_dtd", treeUpdaterJNI49), new 0eP("should_fetch_preview_comments", this.A20), new 0eP("should_show_exclusive_info_cta", this.A21)}, 0, r61, 108, 27);
            0eP r136 = new 0eP("should_show_secondary_cta_on_profile", this.A0Y);
            0eP r126 = new 0eP("show_ad_choices", this.A0Z);
            0eP r116 = new 0eP("show_icon", this.A22);
            0eP r106 = new 0eP("show_page_name_in_headline", this.A23);
            C257963yF r0113 = this.A1a;
            if (r0113 != null) {
                treeUpdaterJNI50 = r0113.FHC();
            } else {
                treeUpdaterJNI50 = null;
            }
            0eP r96 = new 0eP("sponsored_ad_disclaimer", treeUpdaterJNI50);
            C257973yG r0114 = this.A1b;
            if (r0114 != null) {
                treeUpdaterJNI51 = r0114.FHC();
            } else {
                treeUpdaterJNI51 = null;
            }
            0eP r86 = new 0eP("story_dynamic_ad_flexible_tiles_info", treeUpdaterJNI51);
            IGAdCreativeStory9x16CaptionData iGAdCreativeStory9x16CaptionData = this.A1G;
            if (iGAdCreativeStory9x16CaptionData != null) {
                treeUpdaterJNI52 = iGAdCreativeStory9x16CaptionData.FHC();
            } else {
                treeUpdaterJNI52 = null;
            }
            0eP r75 = new 0eP("systematic_caption", treeUpdaterJNI52);
            C65211bM r0115 = this.A1f;
            if (r0115 != null) {
                treeUpdaterJNI53 = r0115.FHC();
            } else {
                treeUpdaterJNI53 = null;
            }
            0eP r65 = new 0eP("testimonial_data", treeUpdaterJNI53);
            TestimonialDict testimonialDict = this.A1c;
            if (testimonialDict != null) {
                treeUpdaterJNI54 = testimonialDict.FHC();
            } else {
                treeUpdaterJNI54 = null;
            }
            0eP r54 = new 0eP("testimonial_data_v2", treeUpdaterJNI54);
            C257983yH r0116 = this.A1U;
            if (r0116 != null) {
                treeUpdaterJNI55 = r0116.FHC();
            } else {
                treeUpdaterJNI55 = null;
            }
            0eP r43 = new 0eP("text_overlay", treeUpdaterJNI55);
            0eP r3 = new 0eP("tracking_token", this.A0y);
            C258003yJ r0117 = this.A1d;
            if (r0117 != null) {
                treeUpdaterJNI56 = r0117.FHC();
            }
            0eP r18 = r136;
            0eP r19 = r126;
            0eP r20 = r116;
            0eP r21 = r106;
            System.arraycopy(new 0eP[]{r18, r19, r20, r21, r96, r86, r75, r65, r54, r43, r3, new 0eP("urp_card_transformation", treeUpdaterJNI56), new 0eP("validated_product_cursor", this.A26), new 0eP("view_tags", this.A2O)}, 0, r61, 135, 14);
            TreeJNI treeJNI = (TreeJNI) r16;
            obj = new TreeUpdaterJNI(0Yt.A06(r61), treeJNI).applyToTree(treeJNI);
            0qQ.A07(obj);
        } else {
            obj = A00();
        }
        return (C250513lZ) obj;
    }

    public C2592741b(C250513lZ r2) {
        this.A2P = r2;
        this.A29 = r2.AXd();
        this.A0f = r2.AYn();
        this.A0g = r2.AYt();
        this.A0E = r2.AZ1();
        this.A27 = r2.AZ2();
        this.A0h = r2.AZ4();
        this.A24 = r2.AZB();
        this.A0C = r2.AZE();
        this.A04 = r2.AZG();
        this.A0i = r2.AZH();
        this.A0D = r2.AZt();
        this.A0I = r2.AZw();
        this.A0J = r2.Aa3();
        this.A00 = r2.Aa5();
        this.A0j = r2.Aa8();
        this.A15 = r2.AaH();
        this.A0k = r2.Ac5();
        this.A16 = r2.AcH();
        this.A17 = r2.Afb();
        this.A1e = r2.AgF();
        this.A2H = r2.AiF();
        this.A28 = r2.AiI();
        this.A01 = r2.Aj9();
        this.A19 = r2.AjU();
        this.A0l = r2.Ajw();
        this.A0z = r2.AmN();
        this.A06 = r2.AnU();
        this.A2A = r2.ArA();
        this.A10 = r2.getCookies();
        this.A11 = r2.ArM();
        this.A0m = r2.AsL();
        this.A1B = r2.AsP();
        this.A1C = r2.AsR();
        this.A18 = r2.AtI();
        this.A0B = r2.AtO();
        this.A02 = r2.AtX();
        this.A1A = r2.Ata();
        this.A05 = r2.Atc();
        this.A03 = r2.Atd();
        this.A0L = r2.AxE();
        this.A0n = r2.Ay5();
        this.A0M = r2.Ay6();
        this.A0N = r2.AyJ();
        this.A0o = r2.getDominantColor();
        this.A0a = r2.Ayn();
        this.A12 = r2.AzY();
        this.A1D = r2.Azd();
        this.A1h = r2.B10();
        this.A1i = r2.B1H();
        this.A0p = r2.B44();
        this.A0q = r2.B4S();
        this.A1E = r2.B5E();
        this.A14 = r2.B7V();
        this.A1F = r2.B97();
        this.A0b = r2.B9V();
        this.A0c = r2.BD9();
        this.A2B = r2.BDB();
        this.A13 = r2.BDE();
        this.A1O = r2.BDw();
        this.A1P = r2.BE1();
        this.A2C = r2.BE3();
        this.A1H = r2.BEi();
        this.A1I = r2.BEj();
        this.A0H = r2.BEk();
        this.A0K = r2.BEl();
        this.A1L = r2.BEo();
        this.A1M = r2.BF0();
        this.A2D = r2.BF3();
        this.A1K = r2.BF5();
        this.A1N = r2.BF6();
        this.A1R = r2.BFW();
        this.A1S = r2.BFX();
        this.A1T = r2.BFe();
        this.A1W = r2.BFg();
        this.A1Z = r2.BFn();
        this.A0d = r2.BGW();
        this.A25 = r2.BGc();
        this.A0F = r2.BIi();
        this.A1q = r2.CSx();
        this.A1j = r2.COo();
        this.A0O = r2.CPA();
        this.A1k = r2.CPM();
        this.A1l = r2.CPa();
        this.A1m = r2.CQU();
        this.A1n = r2.CQV();
        this.A1o = r2.CQb();
        this.A1p = r2.CRH();
        this.A0P = r2.CRL();
        this.A1r = r2.CTX();
        this.A1s = r2.CTw();
        this.A0Q = r2.CUk();
        this.A1t = r2.CUv();
        this.A1u = r2.CWB();
        this.A0R = r2.CWm();
        this.A0S = r2.CXn();
        this.A0T = r2.CZ2();
        this.A0U = r2.CZ3();
        this.A1v = r2.CZV();
        this.A0V = r2.CZl();
        this.A0W = r2.Cax();
        this.A0X = r2.Cbd();
        this.A1w = r2.Cc3();
        this.A0e = r2.BJa();
        this.A2I = r2.getItems();
        this.A0r = r2.BKL();
        this.A1x = r2.BM4();
        this.A2J = r2.BM5();
        this.A2E = r2.BM6();
        this.A1y = r2.BM8();
        this.A0s = r2.BM9();
        this.A2K = r2.BMB();
        this.A1z = r2.BMC();
        this.A1Q = r2.BMD();
        this.A0t = r2.BMm();
        this.A0u = r2.BMq();
        this.A09 = r2.BPl();
        this.A0v = r2.getMediaId();
        this.A1X = r2.BSA();
        this.A0A = r2.BUs();
        this.A1Y = r2.BY1();
        this.A2F = r2.BYW();
        this.A0w = r2.BZp();
        this.A2L = r2.Ba5();
        this.A0x = r2.BaE();
        this.A2G = r2.Bby();
        this.A07 = r2.BdU();
        this.A2M = r2.BeJ();
        this.A2N = r2.BeK();
        this.A1J = r2.BhC();
        this.A08 = r2.BhM();
        this.A0G = r2.Bl6();
        this.A1g = r2.Bl7();
        this.A1V = r2.Btx();
        this.A20 = r2.Bu6();
        this.A21 = r2.Bua();
        this.A0Y = r2.Buk();
        this.A0Z = r2.Bv0();
        this.A22 = r2.BvX();
        this.A23 = r2.Bvk();
        this.A1a = r2.ByK();
        this.A1b = r2.C0P();
        this.A1G = r2.C3f();
        this.A1f = r2.C4i();
        this.A1c = r2.C4j();
        this.A1U = r2.C5I();
        this.A0y = r2.C9L();
        this.A1d = r2.CCN();
        this.A26 = r2.CDI();
        this.A2O = r2.CEo();
    }
}
