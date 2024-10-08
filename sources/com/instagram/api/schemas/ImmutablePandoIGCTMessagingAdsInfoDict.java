package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C17710Vcf;
import X.C3035269k;
import X.CTC;
import X.V7N;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoIGCTMessagingAdsInfoDict extends 17P implements IGCTMessagingAdsInfoDictIntf {
    public static final C3035269k CREATOR = new CTC(96);

    public final /* synthetic */ C17710Vcf AKD() {
        return new C17710Vcf(this);
    }

    public final OnFeedMessagesIntf BTY() {
        return (OnFeedMessagesIntf) A05(104069929, ImmutablePandoOnFeedMessages.class);
    }

    public final PrivacyDisclosureInfo Bfm() {
        return (PrivacyDisclosureInfo) A05(-1212111389, ImmutablePandoPrivacyDisclosureInfo.class);
    }

    public final SocialProofInfo BxZ() {
        return (SocialProofInfo) A05(1972204325, ImmutablePandoSocialProofInfo.class);
    }

    public final WhatsAppAttributionInfo CGQ() {
        return (WhatsAppAttributionInfo) A05(1614568734, ImmutablePandoWhatsAppAttributionInfo.class);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoIGCTMessagingAdsInfoDict, com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(V7N.A00(this), this);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String BEr() {
        return A0j(-985404444);
    }

    public final String BaD() {
        return A0j(-995752982);
    }

    public final String Bnt() {
        return A0i(1471967704);
    }

    public final String BqY() {
        return A0i(-216554444);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoIGCTMessagingAdsInfoDict] */
    public final Boolean BuH() {
        return getOptionalBooleanValueByHashCode(1863941321);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoIGCTMessagingAdsInfoDict] */
    public final Boolean Buu() {
        return getOptionalBooleanValueByHashCode(1789984418);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoIGCTMessagingAdsInfoDict] */
    public final Boolean COE() {
        return getOptionalBooleanValueByHashCode(-748916528);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoIGCTMessagingAdsInfoDict] */
    public final Boolean CSD() {
        return getOptionalBooleanValueByHashCode(466272913);
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoIGCTMessagingAdsInfoDict, X.17P] */
    public final IGCTMessagingAdsInfoDict F47() {
        OnFeedMessages onFeedMessages;
        PrivacyDisclosureInfoImpl privacyDisclosureInfoImpl;
        SocialProofInfoImpl socialProofInfoImpl;
        String A0j = A0j(-985404444);
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-748916528);
        Boolean optionalBooleanValueByHashCode2 = getOptionalBooleanValueByHashCode(466272913);
        OnFeedMessagesIntf BTY = BTY();
        WhatsAppAttributionInfoImpl whatsAppAttributionInfoImpl = null;
        if (BTY != null) {
            onFeedMessages = BTY.F70();
        } else {
            onFeedMessages = null;
        }
        String A0j2 = A0j(-995752982);
        PrivacyDisclosureInfo Bfm = Bfm();
        if (Bfm != null) {
            privacyDisclosureInfoImpl = Bfm.F7i();
        } else {
            privacyDisclosureInfoImpl = null;
        }
        String A0i = A0i(1471967704);
        String A0i2 = A0i(-216554444);
        Boolean optionalBooleanValueByHashCode3 = getOptionalBooleanValueByHashCode(1863941321);
        Boolean optionalBooleanValueByHashCode4 = getOptionalBooleanValueByHashCode(1789984418);
        SocialProofInfo BxZ = BxZ();
        if (BxZ != null) {
            socialProofInfoImpl = BxZ.F9D();
        } else {
            socialProofInfoImpl = null;
        }
        WhatsAppAttributionInfo CGQ = CGQ();
        if (CGQ != null) {
            whatsAppAttributionInfoImpl = CGQ.FDR();
        }
        return new IGCTMessagingAdsInfoDict(onFeedMessages, privacyDisclosureInfoImpl, socialProofInfoImpl, whatsAppAttributionInfoImpl, optionalBooleanValueByHashCode, optionalBooleanValueByHashCode2, optionalBooleanValueByHashCode3, optionalBooleanValueByHashCode4, A0j, A0j2, A0i, A0i2);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoIGCTMessagingAdsInfoDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
