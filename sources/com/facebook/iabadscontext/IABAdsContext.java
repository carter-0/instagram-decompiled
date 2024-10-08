package com.facebook.iabadscontext;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C273654mx;
import X.C41845B3m;
import X.C51972G9s;
import X.C51975G9x;
import X.RFY;
import X.SWS;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.iabbwpextension.IABBwPExtension;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class IABAdsContext extends AnonymousClass0T0 implements Parcelable, IabAdsTrait {
    public static final Parcelable.Creator CREATOR = SWS.A00(97);
    public final IABAdsBwIntegrationExtension A00;
    public final IABAdsMetaCheckoutDataExtension A01;
    public final IABAdsMetaCheckoutPaymentsSDKDataExtension A02;
    public final IABPostClickPersonalizationDataExtension A03;
    public final IgPromoAdsExtension A04;
    public final IABBwPExtension A05;
    public final ImmutableList A06;
    public final Integer A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final List A0B;
    public final Map A0C;
    public final IABBwPayPalExtension A0D;
    public final IABWatchAndBrowseWebToWAExtension A0E;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IABAdsContext) {
                IABAdsContext iABAdsContext = (IABAdsContext) obj;
                if (!0qQ.A0K(this.A07, iABAdsContext.A07) || !0qQ.A0K(this.A06, iABAdsContext.A06) || !0qQ.A0K(this.A09, iABAdsContext.A09) || !0qQ.A0K(this.A0C, iABAdsContext.A0C) || !0qQ.A0K(this.A08, iABAdsContext.A08) || !0qQ.A0K(this.A0B, iABAdsContext.A0B) || !0qQ.A0K(this.A01, iABAdsContext.A01) || !0qQ.A0K(this.A05, iABAdsContext.A05) || !0qQ.A0K(this.A04, iABAdsContext.A04) || !0qQ.A0K(this.A02, iABAdsContext.A02) || !0qQ.A0K(this.A0E, iABAdsContext.A0E) || !0qQ.A0K(this.A00, iABAdsContext.A00) || !0qQ.A0K(this.A03, iABAdsContext.A03) || !0qQ.A0K(this.A0D, iABAdsContext.A0D) || !0qQ.A0K(this.A0A, iABAdsContext.A0A)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TG.A16(parcel, this.A07, 0, 1);
        parcel.writeSerializable(this.A06);
        parcel.writeString(this.A09);
        Map map = this.A0C;
        parcel.writeInt(map.size());
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            AnonymousClass7TE.A1T(parcel, (RFY) A1J.getKey());
            ((DisclaimerText) A1J.getValue()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.A08);
        parcel.writeStringList(this.A0B);
        this.A01.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A05, i);
        IgPromoAdsExtension igPromoAdsExtension = this.A04;
        if (igPromoAdsExtension == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            igPromoAdsExtension.writeToParcel(parcel, i);
        }
        IABAdsMetaCheckoutPaymentsSDKDataExtension iABAdsMetaCheckoutPaymentsSDKDataExtension = this.A02;
        if (iABAdsMetaCheckoutPaymentsSDKDataExtension == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iABAdsMetaCheckoutPaymentsSDKDataExtension.writeToParcel(parcel, i);
        }
        IABWatchAndBrowseWebToWAExtension iABWatchAndBrowseWebToWAExtension = this.A0E;
        if (iABWatchAndBrowseWebToWAExtension == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iABWatchAndBrowseWebToWAExtension.writeToParcel(parcel, i);
        }
        IABAdsBwIntegrationExtension iABAdsBwIntegrationExtension = this.A00;
        if (iABAdsBwIntegrationExtension == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iABAdsBwIntegrationExtension.writeToParcel(parcel, i);
        }
        IABPostClickPersonalizationDataExtension iABPostClickPersonalizationDataExtension = this.A03;
        if (iABPostClickPersonalizationDataExtension == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iABPostClickPersonalizationDataExtension.writeToParcel(parcel, i);
        }
        IABBwPayPalExtension iABBwPayPalExtension = this.A0D;
        if (iABBwPayPalExtension == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iABBwPayPalExtension.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A0A);
    }

    public final IABAdsContext A00() {
        Integer num = this.A07;
        ImmutableList immutableList = this.A06;
        String str = this.A09;
        Map map = this.A0C;
        String str2 = this.A08;
        List list = this.A0B;
        IABAdsMetaCheckoutDataExtension iABAdsMetaCheckoutDataExtension = this.A01;
        IgPromoAdsExtension igPromoAdsExtension = this.A04;
        return new IABAdsContext((IABAdsBwIntegrationExtension) null, iABAdsMetaCheckoutDataExtension, this.A02, (IABBwPayPalExtension) null, this.A03, this.A0E, igPromoAdsExtension, (IABBwPExtension) null, immutableList, num, str, str2, (String) null, list, map);
    }

    public final int hashCode() {
        int A0C2 = AnonymousClass7TG.A0C(this.A07) * 31;
        Map map = this.A0C;
        return ((((((((((((((AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A07(this.A0B, (AnonymousClass7TF.A07(map, (AnonymousClass7TF.A07(this.A06, A0C2) + AnonymousClass7TG.A0E(this.A09)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31)) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A0E)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A0D)) * 31) + C41845B3m.A00(this.A0A);
    }

    public IABAdsContext(IABAdsBwIntegrationExtension iABAdsBwIntegrationExtension, IABAdsMetaCheckoutDataExtension iABAdsMetaCheckoutDataExtension, IABAdsMetaCheckoutPaymentsSDKDataExtension iABAdsMetaCheckoutPaymentsSDKDataExtension, IABBwPayPalExtension iABBwPayPalExtension, IABPostClickPersonalizationDataExtension iABPostClickPersonalizationDataExtension, IABWatchAndBrowseWebToWAExtension iABWatchAndBrowseWebToWAExtension, IgPromoAdsExtension igPromoAdsExtension, IABBwPExtension iABBwPExtension, ImmutableList immutableList, Integer num, String str, String str2, String str3, List list, Map map) {
        C51972G9s.A1C(immutableList, map);
        C51972G9s.A1E(list, iABAdsMetaCheckoutDataExtension);
        this.A07 = num;
        this.A06 = immutableList;
        this.A09 = str;
        this.A0C = map;
        this.A08 = str2;
        this.A0B = list;
        this.A01 = iABAdsMetaCheckoutDataExtension;
        this.A05 = iABBwPExtension;
        this.A04 = igPromoAdsExtension;
        this.A02 = iABAdsMetaCheckoutPaymentsSDKDataExtension;
        this.A0E = iABWatchAndBrowseWebToWAExtension;
        this.A00 = iABAdsBwIntegrationExtension;
        this.A03 = iABPostClickPersonalizationDataExtension;
        this.A0D = iABBwPayPalExtension;
        this.A0A = str3;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("IABAdsContext(adImpressionTime=");
        A1A.append(this.A07);
        A1A.append(", eligibleExperienceType=");
        A1A.append(this.A06);
        A1A.append(", adId=");
        A1A.append(this.A09);
        A1A.append(", disclaimerText=");
        A1A.append(this.A0C);
        A1A.append(", actorUrl=");
        A1A.append(this.A08);
        A1A.append(", clickIds=");
        A1A.append(this.A0B);
        A1A.append(", metaCheckoutDataExtension=");
        A1A.append(this.A01);
        A1A.append(", buyWithPrimeExtension=");
        A1A.append(this.A05);
        A1A.append(", igPromoAdsExtension=");
        A1A.append(this.A04);
        A1A.append(", metaCheckoutPaymentsSDKExtension=");
        A1A.append(this.A02);
        A1A.append(", watchAndBrowseWebToWAExtension=");
        A1A.append(this.A0E);
        A1A.append(", buyWithIntegrationExtension=");
        A1A.append(this.A00);
        A1A.append(", iabPostClickPersonalizationDataExtension=");
        A1A.append(this.A03);
        A1A.append(", buyWithPayPalExtension=");
        A1A.append(this.A0D);
        A1A.append(C273654mx.A00(101));
        return C51975G9x.A0i(this.A0A, A1A);
    }
}
