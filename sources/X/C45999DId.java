package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.api.schemas.AppInstallCTAInfoIntf;
import com.instagram.api.schemas.AppstoreMetadataDict;
import com.instagram.api.schemas.AudienceListIntf;
import com.instagram.api.schemas.BoostUpsellBannerPayloadSchema;
import com.instagram.api.schemas.BrandSafetyContentBlocklistBitmapQLObj;
import com.instagram.api.schemas.BrandedContentProjectMetadataIntf;
import com.instagram.api.schemas.ClipsMashupFollowButtonInfo;
import com.instagram.api.schemas.ClipsTrialDict;
import com.instagram.api.schemas.CollabFollowButtonInfo;
import com.instagram.common.session.UserSession;
import com.instagram.feed.audio.AudioIntf;
import com.instagram.model.androidlink.AndroidLink;
import com.instagram.model.mediasize.ImageInfo;
import go.Seq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.webrtc.EglBase14Impl;

/* renamed from: X.DId  reason: case insensitive filesystem */
public final class C45999DId extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45999DId(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                ((GU6) this.A01).A00.A05(new C57076INq(false));
                return C60340gF.A00;
            case 1:
                return new C55633Hks((UserSession) this.A01);
            case 2:
                return new C55498Hig((UserSession) this.A01);
            case 3:
                UserSession userSession = (UserSession) this.A01;
                0qQ.A0B(userSession, 1);
                return new C229252n5(userSession, AnonymousClass000.A00(3339), AnonymousClass000.A00(3338));
            case 4:
                return new VS9((UserSession) this.A01);
            case 5:
                return new GJ1(1Al.A01((UserSession) this.A01).A03(1An.A1b));
            case 6:
                DTH dth = (DTH) this.A01;
                if (dth != null) {
                    return dth.FHC();
                }
                return null;
            case 7:
            case 38:
                AnonymousClass1eD r0 = (AnonymousClass1eD) this.A01;
                if (r0 != null) {
                    return r0.FHC();
                }
                return null;
            case 8:
                C257543xZ r02 = (C257543xZ) this.A01;
                if (r02 != null) {
                    return r02.FHC();
                }
                return null;
            case 9:
                List<C250103ku> list = (List) this.A01;
                if (list == null) {
                    return null;
                }
                ArrayList A0r = AnonymousClass7TG.A0r(list);
                for (C250103ku FHC : list) {
                    A0r.add(FHC.FHC());
                }
                return A0r;
            case 10:
                C257563xb r03 = (C257563xb) this.A01;
                if (r03 != null) {
                    return r03.FHC();
                }
                return null;
            case 11:
                AnonymousClass3ZV r04 = (AnonymousClass3ZV) this.A01;
                if (r04 != null) {
                    return r04.FHC();
                }
                return null;
            case 13:
                List<AndroidLink> list2 = (List) this.A01;
                if (list2 == null) {
                    return null;
                }
                ArrayList A0r2 = AnonymousClass7TG.A0r(list2);
                for (AndroidLink FHC2 : list2) {
                    A0r2.add(FHC2.FHC());
                }
                return A0r2;
            case 14:
                AppInstallCTAInfoIntf appInstallCTAInfoIntf = (AppInstallCTAInfoIntf) this.A01;
                if (appInstallCTAInfoIntf != null) {
                    return appInstallCTAInfoIntf.FHC();
                }
                return null;
            case 15:
                AppstoreMetadataDict appstoreMetadataDict = (AppstoreMetadataDict) this.A01;
                if (appstoreMetadataDict != null) {
                    return appstoreMetadataDict.FHC();
                }
                return null;
            case 16:
                List<C46266DSv> list3 = (List) this.A01;
                if (list3 == null) {
                    return null;
                }
                ArrayList A0r3 = AnonymousClass7TG.A0r(list3);
                for (C46266DSv FHC3 : list3) {
                    A0r3.add(FHC3.FHC());
                }
                return A0r3;
            case 17:
                AnonymousClass5HI r05 = (AnonymousClass5HI) this.A01;
                if (r05 != null) {
                    return r05.FHC();
                }
                return null;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                List<AudienceListIntf> list4 = (List) this.A01;
                if (list4 == null) {
                    return null;
                }
                ArrayList A0r4 = AnonymousClass7TG.A0r(list4);
                for (AudienceListIntf FHC4 : list4) {
                    A0r4.add(FHC4.FHC());
                }
                return A0r4;
            case 19:
                AudioIntf audioIntf = (AudioIntf) this.A01;
                if (audioIntf != null) {
                    return audioIntf.FHC();
                }
                return null;
            case 20:
                List<AnonymousClass5Hc> list5 = (List) this.A01;
                if (list5 == null) {
                    return null;
                }
                ArrayList A0r5 = AnonymousClass7TG.A0r(list5);
                for (AnonymousClass5Hc FHC5 : list5) {
                    A0r5.add(FHC5.FHC());
                }
                return A0r5;
            case 21:
                List<C46273DTc> list6 = (List) this.A01;
                if (list6 == null) {
                    return null;
                }
                ArrayList A0r6 = AnonymousClass7TG.A0r(list6);
                for (C46273DTc FHC6 : list6) {
                    A0r6.add(FHC6.FHC());
                }
                return A0r6;
            case 22:
                BoostUpsellBannerPayloadSchema boostUpsellBannerPayloadSchema = (BoostUpsellBannerPayloadSchema) this.A01;
                if (boostUpsellBannerPayloadSchema != null) {
                    return boostUpsellBannerPayloadSchema.FHC();
                }
                return null;
            case 23:
                List<DU2> list7 = (List) this.A01;
                if (list7 == null) {
                    return null;
                }
                ArrayList A0r7 = AnonymousClass7TG.A0r(list7);
                for (DU2 FHC7 : list7) {
                    A0r7.add(FHC7.FHC());
                }
                return A0r7;
            case 24:
                BrandedContentProjectMetadataIntf brandedContentProjectMetadataIntf = (BrandedContentProjectMetadataIntf) this.A01;
                if (brandedContentProjectMetadataIntf != null) {
                    return brandedContentProjectMetadataIntf.FHC();
                }
                return null;
            case 25:
                BrandSafetyContentBlocklistBitmapQLObj brandSafetyContentBlocklistBitmapQLObj = (BrandSafetyContentBlocklistBitmapQLObj) this.A01;
                if (brandSafetyContentBlocklistBitmapQLObj != null) {
                    return brandSafetyContentBlocklistBitmapQLObj.FHC();
                }
                return null;
            case 26:
                C13902TjP tjP = (C13902TjP) this.A01;
                if (tjP != null) {
                    return tjP.FHC();
                }
                return null;
            case 27:
                C65211bM r06 = (C65211bM) this.A01;
                if (r06 != null) {
                    return r06.FHC();
                }
                return null;
            case 28:
                C272054k1 r07 = (C272054k1) this.A01;
                if (r07 != null) {
                    return r07.FHC();
                }
                return null;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                List list8 = (List) this.A01;
                if (list8 == null) {
                    return null;
                }
                ArrayList A0r8 = AnonymousClass7TG.A0r(list8);
                Iterator it = list8.iterator();
                while (it.hasNext()) {
                    C41846B3n.A1U(A0r8, it);
                }
                return A0r8;
            case 30:
                ImageInfo imageInfo = (ImageInfo) this.A01;
                if (imageInfo != null) {
                    return imageInfo.FHC();
                }
                return null;
            case 31:
                C2609247o r08 = (C2609247o) this.A01;
                if (r08 != null) {
                    return r08.FHC();
                }
                return null;
            case 33:
                C46247DSc dSc = (C46247DSc) this.A01;
                if (dSc != null) {
                    return dSc.FHC();
                }
                return null;
            case 34:
                DTA dta = (DTA) this.A01;
                if (dta != null) {
                    return dta.FHC();
                }
                return null;
            case 35:
                DUF duf = (DUF) this.A01;
                if (duf != null) {
                    return duf.FHC();
                }
                return null;
            case 36:
                List<XB1> list9 = (List) this.A01;
                if (list9 == null) {
                    return null;
                }
                ArrayList A0r9 = AnonymousClass7TG.A0r(list9);
                for (XB1 FHC8 : list9) {
                    A0r9.add(FHC8.FHC());
                }
                return A0r9;
            case 37:
                AnonymousClass41C r09 = (AnonymousClass41C) this.A01;
                if (r09 != null) {
                    return r09.FHC();
                }
                return null;
            case 39:
                List<C22562YBc> list10 = (List) this.A01;
                if (list10 == null) {
                    return null;
                }
                ArrayList A0r10 = AnonymousClass7TG.A0r(list10);
                for (C22562YBc FHC9 : list10) {
                    A0r10.add(FHC9.FHC());
                }
                return A0r10;
            case 40:
                ClipsMashupFollowButtonInfo clipsMashupFollowButtonInfo = (ClipsMashupFollowButtonInfo) this.A01;
                if (clipsMashupFollowButtonInfo != null) {
                    return clipsMashupFollowButtonInfo.FHC();
                }
                return null;
            case Seq.NULL_REFNUM:
                C67231sQ r010 = (C67231sQ) this.A01;
                if (r010 != null) {
                    return r010.FHC();
                }
                return null;
            case Seq.RefTracker.REF_OFFSET:
                C257873y6 r011 = (C257873y6) this.A01;
                if (r011 != null) {
                    return r011.FHC();
                }
                return null;
            case 43:
                List<DTB> list11 = (List) this.A01;
                if (list11 == null) {
                    return null;
                }
                ArrayList A0r11 = AnonymousClass7TG.A0r(list11);
                for (DTB FHC10 : list11) {
                    A0r11.add(FHC10.FHC());
                }
                return A0r11;
            case 44:
                List<DTC> list12 = (List) this.A01;
                if (list12 == null) {
                    return null;
                }
                ArrayList A0r12 = AnonymousClass7TG.A0r(list12);
                for (DTC FHC11 : list12) {
                    A0r12.add(FHC11.FHC());
                }
                return A0r12;
            case 45:
                DUG dug = (DUG) this.A01;
                if (dug != null) {
                    return dug.FHC();
                }
                return null;
            case 46:
                List<YC7> list13 = (List) this.A01;
                if (list13 == null) {
                    return null;
                }
                ArrayList A0r13 = AnonymousClass7TG.A0r(list13);
                for (YC7 FHC12 : list13) {
                    A0r13.add(FHC12.FHC());
                }
                return A0r13;
            case 47:
                ClipsTrialDict clipsTrialDict = (ClipsTrialDict) this.A01;
                if (clipsTrialDict != null) {
                    return clipsTrialDict.FHC();
                }
                return null;
            case 49:
                CollabFollowButtonInfo collabFollowButtonInfo = (CollabFollowButtonInfo) this.A01;
                if (collabFollowButtonInfo != null) {
                    return collabFollowButtonInfo.FHC();
                }
                return null;
            default:
                List list14 = (List) this.A01;
                if (list14 == null) {
                    return null;
                }
                ArrayList A0r14 = AnonymousClass7TG.A0r(list14);
                Iterator it2 = list14.iterator();
                while (it2.hasNext()) {
                    C41846B3n.A1T(A0r14, it2);
                }
                return A0r14;
        }
    }
}
