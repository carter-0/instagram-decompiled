package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C17710Vcf;
import X.C376389Hu;
import X.V7N;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class IGCTMessagingAdsInfoDict extends AnonymousClass0T0 implements IGCTMessagingAdsInfoDictIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = new C376389Hu(28);
    public final OnFeedMessages A00;
    public final PrivacyDisclosureInfo A01;
    public final SocialProofInfo A02;
    public final WhatsAppAttributionInfo A03;
    public final Boolean A04;
    public final Boolean A05;
    public final Boolean A06;
    public final Boolean A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;

    public final IGCTMessagingAdsInfoDict F47() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IGCTMessagingAdsInfoDict) {
                IGCTMessagingAdsInfoDict iGCTMessagingAdsInfoDict = (IGCTMessagingAdsInfoDict) obj;
                if (!0qQ.A0K(this.A08, iGCTMessagingAdsInfoDict.A08) || !0qQ.A0K(this.A04, iGCTMessagingAdsInfoDict.A04) || !0qQ.A0K(this.A05, iGCTMessagingAdsInfoDict.A05) || !0qQ.A0K(this.A00, iGCTMessagingAdsInfoDict.A00) || !0qQ.A0K(this.A09, iGCTMessagingAdsInfoDict.A09) || !0qQ.A0K(this.A01, iGCTMessagingAdsInfoDict.A01) || !0qQ.A0K(this.A0A, iGCTMessagingAdsInfoDict.A0A) || !0qQ.A0K(this.A0B, iGCTMessagingAdsInfoDict.A0B) || !0qQ.A0K(this.A06, iGCTMessagingAdsInfoDict.A06) || !0qQ.A0K(this.A07, iGCTMessagingAdsInfoDict.A07) || !0qQ.A0K(this.A02, iGCTMessagingAdsInfoDict.A02) || !0qQ.A0K(this.A03, iGCTMessagingAdsInfoDict.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A08;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.A04;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.A05;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        OnFeedMessages onFeedMessages = this.A00;
        int hashCode4 = (hashCode3 + (onFeedMessages == null ? 0 : onFeedMessages.hashCode())) * 31;
        String str2 = this.A09;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        PrivacyDisclosureInfo privacyDisclosureInfo = this.A01;
        int hashCode6 = (hashCode5 + (privacyDisclosureInfo == null ? 0 : privacyDisclosureInfo.hashCode())) * 31;
        String str3 = this.A0A;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A0B;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool3 = this.A06;
        int hashCode9 = (hashCode8 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.A07;
        int hashCode10 = (hashCode9 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        SocialProofInfo socialProofInfo = this.A02;
        int hashCode11 = (hashCode10 + (socialProofInfo == null ? 0 : socialProofInfo.hashCode())) * 31;
        WhatsAppAttributionInfo whatsAppAttributionInfo = this.A03;
        if (whatsAppAttributionInfo != null) {
            i = whatsAppAttributionInfo.hashCode();
        }
        return hashCode11 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A08);
        Boolean bool = this.A04;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.A05;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A09);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0B);
        Boolean bool3 = this.A06;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        Boolean bool4 = this.A07;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A03, i);
    }

    public final /* bridge */ /* synthetic */ C17710Vcf AKD() {
        return new C17710Vcf(this);
    }

    public final String BEr() {
        return this.A08;
    }

    public final /* bridge */ /* synthetic */ OnFeedMessagesIntf BTY() {
        return this.A00;
    }

    public final String BaD() {
        return this.A09;
    }

    public final PrivacyDisclosureInfo Bfm() {
        return this.A01;
    }

    public final String Bnt() {
        return this.A0A;
    }

    public final String BqY() {
        return this.A0B;
    }

    public final Boolean BuH() {
        return this.A06;
    }

    public final Boolean Buu() {
        return this.A07;
    }

    public final SocialProofInfo BxZ() {
        return this.A02;
    }

    public final WhatsAppAttributionInfo CGQ() {
        return this.A03;
    }

    public final Boolean COE() {
        return this.A04;
    }

    public final Boolean CSD() {
        return this.A05;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGCTMessagingAdsInfoDict", V7N.A00(this));
    }

    public IGCTMessagingAdsInfoDict(OnFeedMessages onFeedMessages, PrivacyDisclosureInfo privacyDisclosureInfo, SocialProofInfo socialProofInfo, WhatsAppAttributionInfo whatsAppAttributionInfo, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str, String str2, String str3, String str4) {
        this.A08 = str;
        this.A04 = bool;
        this.A05 = bool2;
        this.A00 = onFeedMessages;
        this.A09 = str2;
        this.A01 = privacyDisclosureInfo;
        this.A0A = str3;
        this.A0B = str4;
        this.A06 = bool3;
        this.A07 = bool4;
        this.A02 = socialProofInfo;
        this.A03 = whatsAppAttributionInfo;
    }
}
