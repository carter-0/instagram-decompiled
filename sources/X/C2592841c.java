package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.AdFormatType;
import com.instagram.api.schemas.AppstoreMetadataDict;
import com.instagram.api.schemas.BrandedContentAdsPaidPartnershipLabelRemovalOption;
import com.instagram.api.schemas.CallAdsInfoDictIntf;
import com.instagram.api.schemas.DynamicProductAdDisplayOption;
import com.instagram.api.schemas.IGAdCreativeStory9x16CaptionData;
import com.instagram.api.schemas.IGAdProfileProductTabDict;
import com.instagram.api.schemas.IGAdsIABScreenshotDataDict;
import com.instagram.api.schemas.IGCTATextVariant;
import com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf;
import com.instagram.api.schemas.IGRFSurveyInfoDict;
import com.instagram.api.schemas.ImmutablePandoAppstoreMetadataDict;
import com.instagram.api.schemas.ImmutablePandoCallAdsInfoDict;
import com.instagram.api.schemas.ImmutablePandoIGAdCreativeStory9x16CaptionData;
import com.instagram.api.schemas.ImmutablePandoIGAdProfileProductTabDict;
import com.instagram.api.schemas.ImmutablePandoIGAdsIABScreenshotDataDict;
import com.instagram.api.schemas.ImmutablePandoIGCTATextVariant;
import com.instagram.api.schemas.ImmutablePandoIGCTMessagingAdsInfoDict;
import com.instagram.api.schemas.ImmutablePandoIGRFSurveyInfoDict;
import com.instagram.api.schemas.ImmutablePandoTestimonialDict;
import com.instagram.api.schemas.TestimonialDict;
import com.instagram.feed.media.ImmutablePandoMediaDict;
import com.instagram.model.androidlink.ImmutablePandoAndroidLink;
import com.instagram.model.mediatype.CTAStyle;
import com.instagram.sponsored.signals.model.AdsCTATrustInfoIntf;
import com.instagram.sponsored.signals.model.AdsIAWRatingInfoIntf;
import com.instagram.sponsored.signals.model.AdsRatingInfoIntf;
import com.instagram.sponsored.signals.model.AdsTextTrustInfoIntf;
import com.instagram.sponsored.signals.model.ImmutablePandoAdsCTATrustInfo;
import com.instagram.sponsored.signals.model.ImmutablePandoAdsIAWRatingInfo;
import com.instagram.sponsored.signals.model.ImmutablePandoAdsRatingInfo;
import com.instagram.sponsored.signals.model.ImmutablePandoAdsTextTrustInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.41c  reason: invalid class name and case insensitive filesystem */
public final class C2592841c extends 17P implements C250513lZ {
    public C257583xd A00;
    public IGAdProfileProductTabDict A01;
    public C257853y4 A02;
    public TestimonialDict A03;
    public C258003yJ A04;
    public C65211bM A05;
    public List A06;

    public final C257593xe AgF() {
        return null;
    }

    public final C250503lY FEK(1E6 r4) {
        return FEJ(new 1E9(r4, 6, false));
    }

    private final List A01(1E9 r5) {
        ImmutableList A08 = A08(100526016, ImmutablePandoMediaDict.class);
        if (A08 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(0Yv.A1E(A08, 10));
        Iterator it = A08.iterator();
        while (it.hasNext()) {
            ImmutablePandoMediaDict immutablePandoMediaDict = (ImmutablePandoMediaDict) it.next();
            1Xv r0 = 1Xj.A0h;
            0qQ.A0A(immutablePandoMediaDict);
            arrayList.add(1Xv.A00(r5, immutablePandoMediaDict));
        }
        return arrayList;
    }

    public final /* synthetic */ C2592741b AKZ() {
        return new C2592741b(this);
    }

    public final C257543xZ AZ1() {
        return (C257543xZ) A05(-1593201482, C44031CRr.class);
    }

    public final C239623He AZE() {
        return (C239623He) A05(-167621279, C44029CRp.class);
    }

    public final C257563xb AZG() {
        return (C257563xb) A05(-1422642818, CK6.class);
    }

    public final C239623He AZt() {
        return (C239623He) A05(309576122, C44029CRp.class);
    }

    public final AdsIAWRatingInfoIntf AZw() {
        return (AdsIAWRatingInfoIntf) A05(-369249631, ImmutablePandoAdsIAWRatingInfo.class);
    }

    public final AdsRatingInfoIntf Aa3() {
        return (AdsRatingInfoIntf) A05(566794394, ImmutablePandoAdsRatingInfo.class);
    }

    public final C257583xd Aa5() {
        C257583xd r0 = this.A00;
        if (r0 == null) {
            return (C257583xd) A05(2045846486, C43897CHq.class);
        }
        return r0;
    }

    public final C250183l2 AaH() {
        return (C250183l2) A05(682005289, HCQ.class);
    }

    public final AppstoreMetadataDict AcH() {
        return (AppstoreMetadataDict) A05(160943406, ImmutablePandoAppstoreMetadataDict.class);
    }

    public final BrandedContentAdsPaidPartnershipLabelRemovalOption Afb() {
        return (BrandedContentAdsPaidPartnershipLabelRemovalOption) A0N(-985471814, C46143DNw.A00);
    }

    public final C257603xf Aj9() {
        return (C257603xf) A05(-533849090, CIK.class);
    }

    public final CallAdsInfoDictIntf AjU() {
        return (CallAdsInfoDictIntf) A05(-608037986, ImmutablePandoCallAdsInfoDict.class);
    }

    public final List AmN() {
        return A08(-1211607222, CIL.class);
    }

    public final C250213l5 AnU() {
        return (C250213l5) A05(1406625574, CKu.class);
    }

    public final List ArM() {
        return A08(-295216049, CIL.class);
    }

    public final C257623xh AsP() {
        return (C257623xh) A05(-1153378822, CJM.class);
    }

    public final C257643xj AsR() {
        return (C257643xj) A05(-570023199, CJN.class);
    }

    public final C257663xl AtI() {
        return (C257663xl) A05(-816224899, CIM.class);
    }

    public final CTAStyle AtO() {
        return (CTAStyle) A0N(476264130, C46144DNx.A00);
    }

    public final C255013tR AtX() {
        return (C255013tR) A05(-1286346871, CIX.class);
    }

    public final C250243l8 Ata() {
        return (C250243l8) A05(1829539395, CIY.class);
    }

    public final IGCTMessagingAdsInfoDictIntf Atc() {
        return (IGCTMessagingAdsInfoDictIntf) A05(-926784535, ImmutablePandoIGCTMessagingAdsInfoDict.class);
    }

    public final C257673xm Atd() {
        return (C257673xm) A05(-1575976657, C16087UoI.class);
    }

    public final List AzY() {
        return A08(1887846250, C43924CJl.class);
    }

    public final DynamicProductAdDisplayOption Azd() {
        return (DynamicProductAdDisplayOption) A0N(-1572866338, C46145DNy.A00);
    }

    public final C257693xo B5E() {
        return (C257693xo) A05(518596130, CK5.class);
    }

    public final AdFormatType B7V() {
        return (AdFormatType) A0N(1458614914, C46146DNz.A00);
    }

    public final C257713xq B97() {
        return (C257713xq) A05(1828016905, CKO.class);
    }

    public final List BDE() {
        return A08(-983661271, C43927CKb.class);
    }

    public final C250333lH BDw() {
        return (C250333lH) A05(104010, CL0.class);
    }

    public final C250363lK BE1() {
        return (C250363lK) A05(1599949067, CL1.class);
    }

    public final C257723xr BEi() {
        return (C257723xr) A05(1875822737, C16089UoM.class);
    }

    public final C257733xs BEj() {
        return (C257733xs) A05(-402579701, C16090UoN.class);
    }

    public final AdsCTATrustInfoIntf BEk() {
        return (AdsCTATrustInfoIntf) A05(-292288265, ImmutablePandoAdsCTATrustInfo.class);
    }

    public final AdsTextTrustInfoIntf BEl() {
        return (AdsTextTrustInfoIntf) A05(649944304, ImmutablePandoAdsTextTrustInfo.class);
    }

    public final IGAdsIABScreenshotDataDict BEo() {
        return (IGAdsIABScreenshotDataDict) A05(1580830910, ImmutablePandoIGAdsIABScreenshotDataDict.class);
    }

    public final IGCTATextVariant BF0() {
        return (IGCTATextVariant) A05(-842046426, ImmutablePandoIGCTATextVariant.class);
    }

    public final C255123tc BF5() {
        return (C255123tc) A05(1431755399, C43931CKo.class);
    }

    public final C257743xt BF6() {
        return (C257743xt) A05(872587249, C43934CKy.class);
    }

    public final C257753xu BFW() {
        return (C257753xu) A05(421345560, CLS.class);
    }

    public final C257773xw BFX() {
        return (C257773xw) A05(-1240456943, CLT.class);
    }

    public final IGRFSurveyInfoDict BFe() {
        return (IGRFSurveyInfoDict) A05(-889553367, ImmutablePandoIGRFSurveyInfoDict.class);
    }

    public final C257783xx BFg() {
        return (C257783xx) A05(1390140446, C43940CLg.class);
    }

    public final C257803xz BFn() {
        return (C257803xz) A05(-2128019800, CNu.class);
    }

    public final AnonymousClass3I2 BIi() {
        return (AnonymousClass3I2) A05(-955246378, CSV.class);
    }

    public final List BM5() {
        return A08(2105301271, ImmutablePandoAndroidLink.class);
    }

    public final List BMB() {
        return A08(193745717, ImmutablePandoAndroidLink.class);
    }

    public final C257813y0 BMD() {
        return (C257813y0) A05(-57386478, CL5.class);
    }

    public final C257803xz BPl() {
        return (C257803xz) A05(1758667881, CNu.class);
    }

    public final C257833y2 BSA() {
        return (C257833y2) A05(-94351386, CMF.class);
    }

    public final C257853y4 BUs() {
        C257853y4 r0 = this.A02;
        if (r0 == null) {
            return (C257853y4) A05(-780321144, COU.class);
        }
        return r0;
    }

    public final C257873y6 BY1() {
        return (C257873y6) A05(-1699641528, C43952CMd.class);
    }

    public final C257883y7 BdU() {
        return (C257883y7) A05(1455378029, CN0.class);
    }

    public final List BeJ() {
        return A0p(-563721412, DO0.A00);
    }

    public final List BeK() {
        return A0p(-2012696332, C41733AzO.A00);
    }

    public final IGAdProfileProductTabDict BhC() {
        IGAdProfileProductTabDict iGAdProfileProductTabDict = this.A01;
        if (iGAdProfileProductTabDict == null) {
            return (IGAdProfileProductTabDict) A05(1285758778, ImmutablePandoIGAdProfileProductTabDict.class);
        }
        return iGAdProfileProductTabDict;
    }

    public final C257893y8 BhM() {
        return (C257893y8) A05(-749700953, CNe.class);
    }

    public final C257913yA Bl6() {
        return (C257913yA) A05(1239608894, HD8.class);
    }

    public final C257933yC Bl7() {
        return (C257933yC) A05(2009579145, CSr.class);
    }

    public final C257943yD Btx() {
        return (C257943yD) A05(1710237709, C43936CLc.class);
    }

    public final C257963yF ByK() {
        return (C257963yF) A05(1548981937, COT.class);
    }

    public final C257973yG C0P() {
        return (C257973yG) A05(-117255030, C43977COn.class);
    }

    public final IGAdCreativeStory9x16CaptionData C3f() {
        return (IGAdCreativeStory9x16CaptionData) A05(-1139417117, ImmutablePandoIGAdCreativeStory9x16CaptionData.class);
    }

    public final C65211bM C4i() {
        C65211bM r0 = this.A05;
        if (r0 == null) {
            return (C65211bM) A05(-965505206, C41895B5q.class);
        }
        return r0;
    }

    public final TestimonialDict C4j() {
        TestimonialDict testimonialDict = this.A03;
        if (testimonialDict == null) {
            return (TestimonialDict) A05(30484369, ImmutablePandoTestimonialDict.class);
        }
        return testimonialDict;
    }

    public final C257983yH C5I() {
        return (C257983yH) A05(934064958, C43935CLb.class);
    }

    public final C258003yJ CCN() {
        C258003yJ r0 = this.A04;
        if (r0 == null) {
            return (C258003yJ) A05(1238212428, C44002CQa.class);
        }
        return r0;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, X.3lZ, X.41c] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(C41880B4y.A00(this), this);
    }

    public final List getItems() {
        return this.A06;
    }

    public final String AXd() {
        return A0i(-1192534288);
    }

    public final String AYn() {
        return A0j(-1650554971);
    }

    public final String AYt() {
        return A0i(243470802);
    }

    public final Long AZ2() {
        return A0L(1394689863);
    }

    public final String AZ4() {
        return A0j(92655287);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.41c] */
    public final Integer AZB() {
        return getOptionalIntValueByHashCode(-2020695524);
    }

    public final String AZH() {
        return A0i(-1359893700);
    }

    public final String Aa8() {
        return A0i(2033156745);
    }

    public final String Ac5() {
        return A0j(-1411074055);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.41c] */
    public final List AiF() {
        return getOptionalIntListByHashCode(1763309900);
    }

    public final Long AiI() {
        return A0L(-383562417);
    }

    public final String Ajw() {
        return A0j(2083788458);
    }

    public final String ArA() {
        return A0i(-1108302649);
    }

    public final String AsL() {
        return A0i(1523404155);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.41c] */
    public final Boolean AxE() {
        return getOptionalBooleanValueByHashCode(669973513);
    }

    public final String Ay5() {
        return A0i(1341635297);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.41c] */
    public final Boolean Ay6() {
        return getOptionalBooleanValueByHashCode(-732595499);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.41c] */
    public final Boolean AyJ() {
        return getOptionalBooleanValueByHashCode(1546691918);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.41c] */
    public final Integer Ayn() {
        return getOptionalIntValueByHashCode(-1156866267);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.41c] */
    public final Boolean B10() {
        return getOptionalBooleanValueByHashCode(-463750539);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.41c] */
    public final Boolean B1H() {
        return getOptionalBooleanValueByHashCode(-388021690);
    }

    public final String B44() {
        return A0j(617356508);
    }

    public final String B4S() {
        return A0i(266416098);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.41c] */
    public final Integer B9V() {
        return getOptionalIntValueByHashCode(2034576965);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.41c] */
    public final Integer BD9() {
        return getOptionalIntValueByHashCode(-1555005202);
    }

    public final String BDB() {
        return A0i(686704055);
    }

    public final String BE3() {
        return A0i(-1505401810);
    }

    public final String BF3() {
        return A0i(-277445838);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.41c] */
    public final Integer BGW() {
        return getOptionalIntValueByHashCode(632151045);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.41c] */
    public final Integer BGc() {
        return getOptionalIntValueByHashCode(1550511618);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.41c] */
    public final Integer BJa() {
        return getOptionalIntValueByHashCode(-2141142810);
    }

    public final String BKL() {
        return A0i(102727412);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.41c] */
    public final Boolean BM4() {
        return getOptionalBooleanValueByHashCode(-1758543067);
    }

    public final String BM6() {
        return A0i(-701807740);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.41c] */
    public final Boolean BM8() {
        return getOptionalBooleanValueByHashCode(-1503904634);
    }

    public final String BM9() {
        return A0j(-1697466332);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.41c] */
    public final Boolean BMC() {
        return getOptionalBooleanValueByHashCode(-2101345088);
    }

    public final String BMm() {
        return A0i(-1410034208);
    }

    public final String BMq() {
        return A0i(-1624294830);
    }

    public final String BYW() {
        return A0i(427397093);
    }

    public final String BZp() {
        return A0i(924848935);
    }

    public final List Ba5() {
        return A0n(-774319794);
    }

    public final String BaE() {
        return A0j(-803548981);
    }

    public final String Bby() {
        return A0i(-612351174);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.41c] */
    public final Boolean Bu6() {
        return getOptionalBooleanValueByHashCode(-1007197316);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.41c] */
    public final Boolean Bua() {
        return getOptionalBooleanValueByHashCode(736103798);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.41c] */
    public final Boolean Buk() {
        return getOptionalBooleanValueByHashCode(-260609927);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.41c] */
    public final Boolean Bv0() {
        return getOptionalBooleanValueByHashCode(-1831214760);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.41c] */
    public final Boolean BvX() {
        return getOptionalBooleanValueByHashCode(-1903660933);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.41c] */
    public final Boolean Bvk() {
        return getOptionalBooleanValueByHashCode(-1641698328);
    }

    public final String C9L() {
        return A0i(-1938614671);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.41c] */
    public final Integer CDI() {
        return getOptionalIntValueByHashCode(-641011977);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.41c] */
    public final List CEo() {
        return getOptionalStringListByHashCode(-1573023373);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.41c] */
    public final Boolean COo() {
        return getOptionalBooleanValueByHashCode(1784862051);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.41c] */
    public final Boolean CPA() {
        return getOptionalBooleanValueByHashCode(-24105094);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.41c] */
    public final Boolean CPM() {
        return getOptionalBooleanValueByHashCode(-430048452);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.41c] */
    public final Boolean CPa() {
        return getOptionalBooleanValueByHashCode(1565244781);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.41c] */
    public final Boolean CQU() {
        return getOptionalBooleanValueByHashCode(784863612);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.41c] */
    public final Boolean CQV() {
        return getOptionalBooleanValueByHashCode(852642504);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.41c] */
    public final Boolean CQb() {
        return getOptionalBooleanValueByHashCode(-1630877749);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.41c] */
    public final Boolean CRH() {
        return getOptionalBooleanValueByHashCode(158239729);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.41c] */
    public final Boolean CRL() {
        return getOptionalBooleanValueByHashCode(2081772504);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.41c] */
    public final Boolean CSx() {
        return getOptionalBooleanValueByHashCode(2080043724);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.41c] */
    public final Boolean CTX() {
        return getOptionalBooleanValueByHashCode(1443018240);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.41c] */
    public final Boolean CTw() {
        return getOptionalBooleanValueByHashCode(224671005);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.41c] */
    public final Boolean CUk() {
        return getOptionalBooleanValueByHashCode(-1702889446);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.41c] */
    public final Boolean CUv() {
        return getOptionalBooleanValueByHashCode(1112511486);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.41c] */
    public final Boolean CWB() {
        return getOptionalBooleanValueByHashCode(1859602719);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.41c] */
    public final Boolean CWm() {
        return getOptionalBooleanValueByHashCode(-890554225);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.41c] */
    public final Boolean CXn() {
        return getOptionalBooleanValueByHashCode(-33515775);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.41c] */
    public final Boolean CZ2() {
        return getOptionalBooleanValueByHashCode(-1275697362);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.41c] */
    public final Boolean CZ3() {
        return getOptionalBooleanValueByHashCode(-1387806465);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.41c] */
    public final Boolean CZV() {
        return getOptionalBooleanValueByHashCode(409465363);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.41c] */
    public final Boolean CZl() {
        return getOptionalBooleanValueByHashCode(-178973479);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.41c] */
    public final Boolean Cax() {
        return getOptionalBooleanValueByHashCode(-1091878802);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.41c] */
    public final Boolean Cbd() {
        return getOptionalBooleanValueByHashCode(138640398);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.41c] */
    public final Boolean Cc3() {
        return getOptionalBooleanValueByHashCode(-525934283);
    }

    public final C250513lZ E9p(1E9 r3) {
        C257583xd Aa5 = Aa5();
        C258003yJ r1 = null;
        if (Aa5 != null) {
            Aa5.E72(r3);
        } else {
            Aa5 = null;
        }
        this.A00 = Aa5;
        this.A06 = A01(r3);
        C257853y4 BUs = BUs();
        if (BUs != null) {
            BUs.E8G(r3);
        } else {
            BUs = null;
        }
        this.A02 = BUs;
        IGAdProfileProductTabDict BhC = BhC();
        if (BhC != null) {
            BhC.E7V(r3);
        } else {
            BhC = null;
        }
        this.A01 = BhC;
        C65211bM C4i = C4i();
        if (C4i != null) {
            C4i.E9d(r3);
        } else {
            C4i = null;
        }
        this.A05 = C4i;
        TestimonialDict C4j = C4j();
        if (C4j != null) {
            C4j.E9M(r3);
        } else {
            C4j = null;
        }
        this.A03 = C4j;
        C258003yJ CCN = CCN();
        if (CCN != null) {
            CCN.E9U(r3);
            r1 = CCN;
        }
        this.A04 = r1;
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: X.17P} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C250503lY FEJ(X.1E9 r162) {
        /*
            r161 = this;
            r1 = -1192534288(0xffffffffb8eb5ef0, float:-1.1223357E-4)
            r0 = r161
            java.lang.String r120 = r0.A0i(r1)
            r1 = -1650554971(0xffffffff9d9e87a5, float:-4.1962505E-21)
            java.lang.String r121 = r0.A0j(r1)
            r1 = 243470802(0xe8311d2, float:3.2311154E-30)
            java.lang.String r122 = r0.A0i(r1)
            X.3xZ r1 = r0.AZ1()
            if (r1 == 0) goto L_0x0116
            X.3xY r64 = r1.FF9()
        L_0x0021:
            r1 = 1394689863(0x53214747, float:6.9268557E11)
            java.lang.Long r118 = r0.A0L(r1)
            r1 = 92655287(0x585ceb7, float:1.2583195E-35)
            java.lang.String r123 = r0.A0j(r1)
            r1 = -2020695524(0xffffffff878ea21c, float:-2.1461065E-34)
            java.lang.Integer r110 = r0.getOptionalIntValueByHashCode(r1)
            X.3He r1 = r0.AZE()
            if (r1 == 0) goto L_0x0112
            X.3Hd r62 = r1.FF4()
        L_0x0040:
            X.3xb r1 = r0.AZG()
            if (r1 == 0) goto L_0x010e
            X.3xa r27 = r1.F37()
        L_0x004a:
            r1 = -1359893700(0xffffffffaef1ab3c, float:-1.09898285E-10)
            java.lang.String r124 = r0.A0i(r1)
            X.3He r1 = r0.AZt()
            if (r1 == 0) goto L_0x010a
            X.3Hd r63 = r1.FF4()
        L_0x005b:
            com.instagram.sponsored.signals.model.AdsIAWRatingInfoIntf r1 = r0.AZw()
            if (r1 == 0) goto L_0x0106
            com.instagram.sponsored.signals.model.AdsIAWRatingInfo r69 = r1.FGg()
        L_0x0065:
            com.instagram.sponsored.signals.model.AdsRatingInfoIntf r1 = r0.Aa3()
            if (r1 == 0) goto L_0x0102
            com.instagram.sponsored.signals.model.AdsRatingInfo r70 = r1.FGh()
        L_0x006f:
            X.3xd r1 = r0.Aa5()
            r4 = r162
            if (r1 == 0) goto L_0x00ff
            X.3xc r13 = r1.F0I(r4)
        L_0x007b:
            r1 = 2033156745(0x792f8289, float:5.695622E34)
            java.lang.String r125 = r0.A0i(r1)
            X.3l2 r1 = r0.AaH()
            if (r1 == 0) goto L_0x00fd
            X.3l1 r14 = r1.F0M()
        L_0x008c:
            r1 = -1411074055(0xffffffffabe4b7f9, float:-1.6251437E-12)
            java.lang.String r126 = r0.A0j(r1)
            com.instagram.api.schemas.AppstoreMetadataDict r1 = r0.AcH()
            if (r1 == 0) goto L_0x00fb
            com.instagram.api.schemas.AppstoreMetadataDictImpl r15 = r1.F0X()
        L_0x009d:
            com.instagram.api.schemas.BrandedContentAdsPaidPartnershipLabelRemovalOption r16 = r0.Afb()
            r59 = 0
            r1 = 1763309900(0x6919f94c, float:1.1633933E25)
            com.google.common.collect.ImmutableList r148 = r0.getOptionalIntListByHashCode(r1)
            r1 = -383562417(0xffffffffe9234d4f, float:-1.2338749E25)
            java.lang.Long r119 = r0.A0L(r1)
            X.3xf r1 = r0.Aj9()
            if (r1 == 0) goto L_0x00f8
            X.BE0 r17 = r1.F15()
        L_0x00bb:
            com.instagram.api.schemas.CallAdsInfoDictIntf r1 = r0.AjU()
            if (r1 == 0) goto L_0x00f5
            com.instagram.api.schemas.CallAdsInfoDict r19 = r1.F19()
        L_0x00c5:
            r1 = 2083788458(0x7c3416aa, float:3.7402925E36)
            java.lang.String r127 = r0.A0j(r1)
            java.util.List r1 = r0.AmN()
            r3 = 10
            if (r1 == 0) goto L_0x011a
            int r2 = X.0Yv.A1E(r1, r3)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r2)
            java.util.Iterator r2 = r1.iterator()
        L_0x00e1:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x011b
            java.lang.Object r1 = r2.next()
            X.3kr r1 = (X.C250073kr) r1
            X.3kq r1 = r1.F16()
            r10.add(r1)
            goto L_0x00e1
        L_0x00f5:
            r19 = 0
            goto L_0x00c5
        L_0x00f8:
            r17 = 0
            goto L_0x00bb
        L_0x00fb:
            r15 = 0
            goto L_0x009d
        L_0x00fd:
            r14 = 0
            goto L_0x008c
        L_0x00ff:
            r13 = 0
            goto L_0x007b
        L_0x0102:
            r70 = 0
            goto L_0x006f
        L_0x0106:
            r69 = 0
            goto L_0x0065
        L_0x010a:
            r63 = 0
            goto L_0x005b
        L_0x010e:
            r27 = 0
            goto L_0x004a
        L_0x0112:
            r62 = 0
            goto L_0x0040
        L_0x0116:
            r64 = 0
            goto L_0x0021
        L_0x011a:
            r10 = 0
        L_0x011b:
            X.3l5 r1 = r0.AnU()
            if (r1 == 0) goto L_0x015a
            X.3l4 r37 = r1.F48()
        L_0x0125:
            r1 = -1108302649(0xffffffffbdf0a4c7, float:-0.11750179)
            java.lang.String r128 = r0.A0i(r1)
            r1 = 952189583(0x38c1428f, float:9.215355E-5)
            com.google.common.collect.ImmutableList r150 = r0.getOptionalStringListByHashCode(r1)
            java.util.List r1 = r0.ArM()
            if (r1 == 0) goto L_0x015d
            int r2 = X.0Yv.A1E(r1, r3)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r2)
            java.util.Iterator r2 = r1.iterator()
        L_0x0146:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x015e
            java.lang.Object r1 = r2.next()
            X.3kr r1 = (X.C250073kr) r1
            X.3kq r1 = r1.F16()
            r9.add(r1)
            goto L_0x0146
        L_0x015a:
            r37 = 0
            goto L_0x0125
        L_0x015d:
            r9 = 0
        L_0x015e:
            r1 = 1523404155(0x5acd4d7b, float:2.88937805E16)
            java.lang.String r129 = r0.A0i(r1)
            X.3xh r1 = r0.AsP()
            if (r1 == 0) goto L_0x0214
            X.3xg r23 = r1.F2E()
        L_0x016f:
            X.3xj r1 = r0.AsR()
            if (r1 == 0) goto L_0x0210
            X.3xi r24 = r1.F2F()
        L_0x0179:
            X.3xl r1 = r0.AtI()
            if (r1 == 0) goto L_0x020c
            X.3xk r18 = r1.F17()
        L_0x0183:
            com.instagram.model.mediatype.CTAStyle r61 = r0.AtO()
            X.3tR r1 = r0.AtX()
            if (r1 == 0) goto L_0x0209
            X.3tQ r20 = r1.F1K()
        L_0x0191:
            X.3l8 r1 = r0.Ata()
            if (r1 == 0) goto L_0x0206
            X.3l7 r21 = r1.F1L()
        L_0x019b:
            com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf r1 = r0.Atc()
            if (r1 == 0) goto L_0x0203
            com.instagram.api.schemas.IGCTMessagingAdsInfoDict r36 = r1.F47()
        L_0x01a5:
            X.3xm r1 = r0.Atd()
            if (r1 == 0) goto L_0x0200
            X.UMr r22 = r1.F1M()
        L_0x01af:
            r1 = 669973513(0x27eefc09, float:6.6331527E-15)
            java.lang.Boolean r72 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = 1341635297(0x4ff7bae1, float:8.3124393E9)
            java.lang.String r130 = r0.A0i(r1)
            r1 = -732595499(0xffffffffd4557ad5, float:-3.66755525E12)
            java.lang.Boolean r73 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = 1546691918(0x5c30a54e, float:1.98885401E17)
            java.lang.Boolean r74 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = 1714924804(0x6637ad04, float:2.1684616E23)
            java.lang.String r131 = r0.A0i(r1)
            r1 = -1156866267(0xffffffffbb0b9f25, float:-0.0021304574)
            java.lang.Integer r111 = r0.getOptionalIntValueByHashCode(r1)
            java.util.List r1 = r0.AzY()
            if (r1 == 0) goto L_0x0218
            int r2 = X.0Yv.A1E(r1, r3)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r2)
            java.util.Iterator r2 = r1.iterator()
        L_0x01ec:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0219
            java.lang.Object r1 = r2.next()
            X.DTD r1 = (X.DTD) r1
            X.BEd r1 = r1.F2i()
            r8.add(r1)
            goto L_0x01ec
        L_0x0200:
            r22 = 0
            goto L_0x01af
        L_0x0203:
            r36 = 0
            goto L_0x01a5
        L_0x0206:
            r21 = 0
            goto L_0x019b
        L_0x0209:
            r20 = 0
            goto L_0x0191
        L_0x020c:
            r18 = 0
            goto L_0x0183
        L_0x0210:
            r24 = 0
            goto L_0x0179
        L_0x0214:
            r23 = 0
            goto L_0x016f
        L_0x0218:
            r8 = 0
        L_0x0219:
            com.instagram.api.schemas.DynamicProductAdDisplayOption r25 = r0.Azd()
            r1 = -463750539(0xffffffffe45bba75, float:-1.621309E22)
            java.lang.Boolean r75 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = -388021690(0xffffffffe8df4246, float:-8.434482E24)
            java.lang.Boolean r76 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = 617356508(0x24cc1cdc, float:8.851979E-17)
            java.lang.String r132 = r0.A0j(r1)
            r1 = 266416098(0xfe12fe2, float:2.2205157E-29)
            java.lang.String r133 = r0.A0i(r1)
            X.3xo r1 = r0.B5E()
            if (r1 == 0) goto L_0x0290
            X.3xn r26 = r1.F36()
        L_0x0243:
            com.instagram.api.schemas.AdFormatType r12 = r0.B7V()
            X.3xq r1 = r0.B97()
            if (r1 == 0) goto L_0x028d
            X.3xp r28 = r1.F3Q()
        L_0x0251:
            r1 = 2034576965(0x79452e45, float:6.398881E34)
            java.lang.Integer r112 = r0.getOptionalIntValueByHashCode(r1)
            r1 = -1555005202(0xffffffffa35080ee, float:-1.13030045E-17)
            java.lang.Integer r113 = r0.getOptionalIntValueByHashCode(r1)
            r1 = 686704055(0x28ee45b7, float:2.6453542E-14)
            java.lang.String r134 = r0.A0i(r1)
            java.util.List r1 = r0.BDE()
            if (r1 == 0) goto L_0x0293
            int r2 = X.0Yv.A1E(r1, r3)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r2)
            java.util.Iterator r2 = r1.iterator()
        L_0x0279:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0294
            java.lang.Object r1 = r2.next()
            X.3lB r1 = (X.C250273lB) r1
            X.3lA r1 = r1.F3f()
            r7.add(r1)
            goto L_0x0279
        L_0x028d:
            r28 = 0
            goto L_0x0251
        L_0x0290:
            r26 = 0
            goto L_0x0243
        L_0x0293:
            r7 = 0
        L_0x0294:
            X.3lH r1 = r0.BDw()
            if (r1 == 0) goto L_0x0462
            X.3lG r39 = r1.F4E()
        L_0x029e:
            X.3lK r1 = r0.BE1()
            if (r1 == 0) goto L_0x045e
            X.3lJ r40 = r1.F4F()
        L_0x02a8:
            r1 = -1505401810(0xffffffffa645642e, float:-6.8483874E-16)
            java.lang.String r135 = r0.A0i(r1)
            X.3xr r1 = r0.BEi()
            if (r1 == 0) goto L_0x045a
            X.UN1 r30 = r1.F3p()
        L_0x02b9:
            X.3xs r1 = r0.BEj()
            if (r1 == 0) goto L_0x0456
            X.UN2 r31 = r1.F3q()
        L_0x02c3:
            com.instagram.sponsored.signals.model.AdsCTATrustInfoIntf r1 = r0.BEk()
            if (r1 == 0) goto L_0x0452
            com.instagram.sponsored.signals.model.AdsCTATrustInfo r68 = r1.FGf()
        L_0x02cd:
            com.instagram.sponsored.signals.model.AdsTextTrustInfoIntf r1 = r0.BEl()
            if (r1 == 0) goto L_0x044e
            com.instagram.sponsored.signals.model.AdsTextTrustInfo r71 = r1.FGi()
        L_0x02d7:
            com.instagram.api.schemas.IGAdsIABScreenshotDataDict r1 = r0.BEo()
            if (r1 == 0) goto L_0x044a
            com.instagram.api.schemas.IGAdsIABScreenshotDataDictImpl r34 = r1.F3x()
        L_0x02e1:
            com.instagram.api.schemas.IGCTATextVariant r1 = r0.BF0()
            if (r1 == 0) goto L_0x0446
            com.instagram.api.schemas.IGCTATextVariantImpl r35 = r1.F46()
        L_0x02eb:
            r1 = -277445838(0xffffffffef768332, float:-7.629192E28)
            java.lang.String r136 = r0.A0i(r1)
            X.3tc r1 = r0.BF5()
            if (r1 == 0) goto L_0x0442
            X.3tb r33 = r1.F3w()
        L_0x02fc:
            X.3xt r1 = r0.BF6()
            if (r1 == 0) goto L_0x043e
            X.56L r38 = r1.F4C()
        L_0x0306:
            X.3xu r1 = r0.BFW()
            if (r1 == 0) goto L_0x043a
            X.BFA r42 = r1.F4q()
        L_0x0310:
            X.3xw r1 = r0.BFX()
            if (r1 == 0) goto L_0x0436
            X.3xv r43 = r1.F4r()
        L_0x031a:
            com.instagram.api.schemas.IGRFSurveyInfoDict r1 = r0.BFe()
            if (r1 == 0) goto L_0x0432
            com.instagram.api.schemas.IGRFSurveyInfoDictImpl r44 = r1.F51()
        L_0x0324:
            X.3xx r1 = r0.BFg()
            if (r1 == 0) goto L_0x042e
            X.5CY r47 = r1.F57()
        L_0x032e:
            X.3xz r1 = r0.BFn()
            if (r1 == 0) goto L_0x042a
            X.3xy r52 = r1.F8Z()
        L_0x0338:
            r1 = 632151045(0x25addc05, float:3.0159807E-16)
            java.lang.Integer r114 = r0.getOptionalIntValueByHashCode(r1)
            r1 = 1550511618(0x5c6aee02, float:2.64507348E17)
            java.lang.Integer r115 = r0.getOptionalIntValueByHashCode(r1)
            X.3I2 r1 = r0.BIi()
            if (r1 == 0) goto L_0x0426
            X.3I1 r65 = r1.FG3()
        L_0x0350:
            r1 = 2080043724(0x7bfaf2cc, float:2.6059974E36)
            java.lang.Boolean r77 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = 1784862051(0x6a62d563, float:6.855623E25)
            java.lang.Boolean r78 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = -24105094(0xfffffffffe902f7a, float:-9.582767E37)
            java.lang.Boolean r79 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = -430048452(0xffffffffe65dfb3c, float:-2.6206936E23)
            java.lang.Boolean r80 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = 1565244781(0x5d4bbd6d, float:9.1756314E17)
            java.lang.Boolean r81 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = 784863612(0x2ec8117c, float:9.098053E-11)
            java.lang.Boolean r82 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = 852642504(0x32d24ac8, float:2.4481224E-8)
            java.lang.Boolean r83 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = -1630877749(0xffffffff9ecac7cb, float:-2.1470214E-20)
            java.lang.Boolean r84 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = 158239729(0x96e8bf1, float:2.8714008E-33)
            java.lang.Boolean r85 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = 2081772504(0x7c1553d8, float:3.101411E36)
            java.lang.Boolean r86 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = 1443018240(0x5602b600, float:3.5929549E13)
            java.lang.Boolean r87 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = 224671005(0xd64351d, float:7.0321857E-31)
            java.lang.Boolean r88 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = -1702889446(0xffffffff9a7ff81a, float:-5.293318E-23)
            java.lang.Boolean r89 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = 1112511486(0x424f93fe, float:51.894524)
            java.lang.Boolean r90 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = 1859602719(0x6ed7491f, float:3.3313838E28)
            java.lang.Boolean r91 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = -890554225(0xffffffffcaeb388f, float:-7707719.5)
            java.lang.Boolean r92 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = -33515775(0xfffffffffe009701, float:-4.273131E37)
            java.lang.Boolean r93 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = -1275697362(0xffffffffb3f6672e, float:-1.1474036E-7)
            java.lang.Boolean r94 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = -1387806465(0xffffffffad47c0ff, float:-1.1354694E-11)
            java.lang.Boolean r95 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = 409465363(0x1867f213, float:2.9978266E-24)
            java.lang.Boolean r96 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = -178973479(0xfffffffff55514d9, float:-2.7011281E32)
            java.lang.Boolean r97 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = -1091878802(0xffffffffbeeb406e, float:-0.45947593)
            java.lang.Boolean r98 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = 138640398(0x8437c0e, float:5.8826504E-34)
            java.lang.Boolean r99 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = -525934283(0xffffffffe0a6e135, float:-9.619961E19)
            java.lang.Boolean r100 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = -2141142810(0xffffffff8060c0e6, float:-8.885407E-39)
            java.lang.Integer r116 = r0.getOptionalIntValueByHashCode(r1)
            java.util.List r1 = r0.A01(r4)
            if (r1 == 0) goto L_0x0466
            int r2 = X.0Yv.A1E(r1, r3)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r2)
            java.util.Iterator r2 = r1.iterator()
        L_0x0412:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0467
            java.lang.Object r1 = r2.next()
            X.1Xj r1 = (X.1Xj) r1
            X.17K r1 = r4.A00(r1)
            r6.add(r1)
            goto L_0x0412
        L_0x0426:
            r65 = 0
            goto L_0x0350
        L_0x042a:
            r52 = 0
            goto L_0x0338
        L_0x042e:
            r47 = 0
            goto L_0x032e
        L_0x0432:
            r44 = 0
            goto L_0x0324
        L_0x0436:
            r43 = 0
            goto L_0x031a
        L_0x043a:
            r42 = 0
            goto L_0x0310
        L_0x043e:
            r38 = 0
            goto L_0x0306
        L_0x0442:
            r33 = 0
            goto L_0x02fc
        L_0x0446:
            r35 = 0
            goto L_0x02eb
        L_0x044a:
            r34 = 0
            goto L_0x02e1
        L_0x044e:
            r71 = 0
            goto L_0x02d7
        L_0x0452:
            r68 = 0
            goto L_0x02cd
        L_0x0456:
            r31 = 0
            goto L_0x02c3
        L_0x045a:
            r30 = 0
            goto L_0x02b9
        L_0x045e:
            r40 = 0
            goto L_0x02a8
        L_0x0462:
            r39 = 0
            goto L_0x029e
        L_0x0466:
            r6 = 0
        L_0x0467:
            r1 = 102727412(0x61f7ef4, float:2.9997847E-35)
            java.lang.String r137 = r0.A0i(r1)
            r1 = -1758543067(0xffffffff972ec325, float:-5.646874E-25)
            java.lang.Boolean r101 = r0.getOptionalBooleanValueByHashCode(r1)
            java.util.List r1 = r0.BM5()
            if (r1 == 0) goto L_0x049c
            int r2 = X.0Yv.A1E(r1, r3)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r2)
            java.util.Iterator r2 = r1.iterator()
        L_0x0488:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x049d
            java.lang.Object r1 = r2.next()
            com.instagram.model.androidlink.AndroidLink r1 = (com.instagram.model.androidlink.AndroidLink) r1
            com.instagram.model.androidlink.AndroidLinkImpl r1 = r1.FES()
            r5.add(r1)
            goto L_0x0488
        L_0x049c:
            r5 = 0
        L_0x049d:
            r1 = -701807740(0xffffffffd62b4384, float:-4.7076616E13)
            java.lang.String r138 = r0.A0i(r1)
            r1 = -1503904634(0xffffffffa65c3c86, float:-7.640986E-16)
            java.lang.Boolean r102 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = -1697466332(0xffffffff9ad2b824, float:-8.715146E-23)
            java.lang.String r139 = r0.A0j(r1)
            java.util.List r1 = r0.BMB()
            if (r1 == 0) goto L_0x04d9
            int r3 = X.0Yv.A1E(r1, r3)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r3)
            java.util.Iterator r3 = r1.iterator()
        L_0x04c5:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x04da
            java.lang.Object r1 = r3.next()
            com.instagram.model.androidlink.AndroidLink r1 = (com.instagram.model.androidlink.AndroidLink) r1
            com.instagram.model.androidlink.AndroidLinkImpl r1 = r1.FES()
            r2.add(r1)
            goto L_0x04c5
        L_0x04d9:
            r2 = 0
        L_0x04da:
            r1 = -2101345088(0xffffffff82c004c0, float:-2.821459E-37)
            java.lang.Boolean r103 = r0.getOptionalBooleanValueByHashCode(r1)
            X.3y0 r1 = r0.BMD()
            if (r1 == 0) goto L_0x0662
            X.4zJ r41 = r1.F4J()
        L_0x04eb:
            r1 = -1410034208(0xffffffffabf495e0, float:-1.7378841E-12)
            java.lang.String r140 = r0.A0i(r1)
            r1 = -1624294830(0xffffffff9f2f3a52, float:-3.7105933E-20)
            java.lang.String r141 = r0.A0i(r1)
            X.3xz r1 = r0.BPl()
            if (r1 == 0) goto L_0x065e
            X.3xy r53 = r1.F8Z()
        L_0x0503:
            java.lang.String r142 = r0.A0f()
            X.3y2 r1 = r0.BSA()
            if (r1 == 0) goto L_0x065a
            X.3y1 r48 = r1.F6A()
        L_0x0511:
            X.3y4 r1 = r0.BUs()
            if (r1 == 0) goto L_0x0656
            X.3y3 r55 = r1.F9J(r4)
        L_0x051b:
            X.3y6 r1 = r0.BY1()
            if (r1 == 0) goto L_0x0652
            X.3y5 r49 = r1.F71()
        L_0x0525:
            r1 = 427397093(0x19798fe5, float:1.29020576E-23)
            java.lang.String r143 = r0.A0i(r1)
            r1 = 924848935(0x37201327, float:9.541202E-6)
            java.lang.String r144 = r0.A0i(r1)
            r1 = -774319794(0xffffffffd1d8d14e, float:-1.16403061E11)
            java.util.List r157 = r0.A0n(r1)
            r1 = -803548981(0xffffffffd01ad0cb, float:-1.03894989E10)
            java.lang.String r145 = r0.A0j(r1)
            r1 = -612351174(0xffffffffdb80433a, float:-7.2205427E16)
            java.lang.String r146 = r0.A0i(r1)
            X.3y7 r1 = r0.BdU()
            if (r1 == 0) goto L_0x064e
            X.5Ca r50 = r1.F7X()
        L_0x0552:
            java.util.List r158 = r0.BeJ()
            java.util.List r159 = r0.BeK()
            com.instagram.api.schemas.IGAdProfileProductTabDict r1 = r0.BhC()
            if (r1 == 0) goto L_0x064a
            com.instagram.api.schemas.IGAdProfileProductTabDictImpl r32 = r1.F3r(r4)
        L_0x0564:
            X.3y8 r1 = r0.BhM()
            if (r1 == 0) goto L_0x0646
            X.54p r51 = r1.F8E()
        L_0x056e:
            X.3yA r1 = r0.Bl6()
            if (r1 == 0) goto L_0x0642
            X.3y9 r66 = r1.FGZ()
        L_0x0578:
            X.3yC r1 = r0.Bl7()
            if (r1 == 0) goto L_0x063e
            X.3yB r67 = r1.FGa()
        L_0x0582:
            X.3yD r1 = r0.Btx()
            if (r1 == 0) goto L_0x063a
            X.4zN r46 = r1.F53()
        L_0x058c:
            r1 = -1007197316(0xffffffffc3f7637c, float:-494.77722)
            java.lang.Boolean r104 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = 736103798(0x2be00d76, float:1.5919893E-12)
            java.lang.Boolean r105 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = -260609927(0xfffffffff0776879, float:-3.0627639E29)
            java.lang.Boolean r106 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = -1831214760(0xffffffff92d9e158, float:-1.3750177E-27)
            java.lang.Boolean r107 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = -1903660933(0xffffffff8e88707b, float:-3.3634903E-30)
            java.lang.Boolean r108 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = -1641698328(0xffffffff9e25abe8, float:-8.770577E-21)
            java.lang.Boolean r109 = r0.getOptionalBooleanValueByHashCode(r1)
            X.3yF r1 = r0.ByK()
            if (r1 == 0) goto L_0x0637
            X.3yE r54 = r1.F9I()
        L_0x05c0:
            X.3yG r1 = r0.C0P()
            if (r1 == 0) goto L_0x0634
            X.BGk r56 = r1.F9o()
        L_0x05ca:
            com.instagram.api.schemas.IGAdCreativeStory9x16CaptionData r1 = r0.C3f()
            if (r1 == 0) goto L_0x0631
            com.instagram.api.schemas.IGAdCreativeStory9x16CaptionDataImpl r29 = r1.F3o()
        L_0x05d4:
            X.1bM r1 = r0.C4i()
            if (r1 == 0) goto L_0x062e
            X.1bK r60 = r1.FDv(r4)
        L_0x05de:
            com.instagram.api.schemas.TestimonialDict r1 = r0.C4j()
            if (r1 == 0) goto L_0x062b
            com.instagram.api.schemas.TestimonialDictImpl r57 = r1.FCN(r4)
        L_0x05e8:
            X.3yH r1 = r0.C5I()
            if (r1 == 0) goto L_0x0628
            X.BFC r45 = r1.F52()
        L_0x05f2:
            r1 = -1938614671(0xffffffff8c731671, float:-1.8726792E-31)
            java.lang.String r147 = r0.A0i(r1)
            X.3yJ r1 = r0.CCN()
            if (r1 == 0) goto L_0x0625
            X.3yI r58 = r1.FD0(r4)
        L_0x0603:
            r1 = -641011977(0xffffffffd9caeef7, float:-7.1400862E15)
            java.lang.Integer r117 = r0.getOptionalIntValueByHashCode(r1)
            r1 = -1573023373(0xffffffffa23d9173, float:-2.5691277E-18)
            com.google.common.collect.ImmutableList r160 = r0.getOptionalStringListByHashCode(r1)
            X.3lY r11 = new X.3lY
            r149 = r10
            r151 = r9
            r152 = r8
            r153 = r7
            r154 = r6
            r155 = r5
            r156 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, r109, r110, r111, r112, r113, r114, r115, r116, r117, r118, r119, r120, r121, r122, r123, r124, r125, r126, r127, r128, r129, r130, r131, r132, r133, r134, r135, r136, r137, r138, r139, r140, r141, r142, r143, r144, r145, r146, r147, r148, r149, r150, r151, r152, r153, r154, r155, r156, r157, r158, r159, r160)
            return r11
        L_0x0625:
            r58 = 0
            goto L_0x0603
        L_0x0628:
            r45 = 0
            goto L_0x05f2
        L_0x062b:
            r57 = 0
            goto L_0x05e8
        L_0x062e:
            r60 = 0
            goto L_0x05de
        L_0x0631:
            r29 = 0
            goto L_0x05d4
        L_0x0634:
            r56 = 0
            goto L_0x05ca
        L_0x0637:
            r54 = 0
            goto L_0x05c0
        L_0x063a:
            r46 = 0
            goto L_0x058c
        L_0x063e:
            r67 = 0
            goto L_0x0582
        L_0x0642:
            r66 = 0
            goto L_0x0578
        L_0x0646:
            r51 = 0
            goto L_0x056e
        L_0x064a:
            r32 = 0
            goto L_0x0564
        L_0x064e:
            r50 = 0
            goto L_0x0552
        L_0x0652:
            r49 = 0
            goto L_0x0525
        L_0x0656:
            r55 = 0
            goto L_0x051b
        L_0x065a:
            r48 = 0
            goto L_0x0511
        L_0x065e:
            r53 = 0
            goto L_0x0503
        L_0x0662:
            r41 = 0
            goto L_0x04eb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2592841c.FEJ(X.1E9):X.3lY");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.41c] */
    public final List getCookies() {
        return getOptionalStringListByHashCode(952189583);
    }

    public final String getDominantColor() {
        return A0i(1714924804);
    }

    public final String getMediaId() {
        return A0f();
    }
}
