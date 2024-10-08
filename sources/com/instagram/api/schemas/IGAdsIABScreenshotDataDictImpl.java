package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.AnonymousClass7TH;
import X.C41845B3m;
import X.C41848B3p;
import X.C48329Ecm;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class IGAdsIABScreenshotDataDictImpl extends AnonymousClass0T0 implements IGAdsIABScreenshotDataDict, Parcelable {
    public static final Parcelable.Creator CREATOR = FK5.A00(5);
    public final IABScreenshotEffectOnUserAction A00;
    public final IABScreenshotTransitionTime A01;
    public final IGAdsIABScreenshotVariant A02;
    public final Boolean A03;
    public final Float A04;
    public final Float A05;
    public final Float A06;
    public final Float A07;
    public final String A08;
    public final String A09;

    public final IGAdsIABScreenshotDataDictImpl F3x() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IGAdsIABScreenshotDataDictImpl) {
                IGAdsIABScreenshotDataDictImpl iGAdsIABScreenshotDataDictImpl = (IGAdsIABScreenshotDataDictImpl) obj;
                if (!0qQ.A0K(this.A04, iGAdsIABScreenshotDataDictImpl.A04) || !0qQ.A0K(this.A05, iGAdsIABScreenshotDataDictImpl.A05) || this.A00 != iGAdsIABScreenshotDataDictImpl.A00 || !0qQ.A0K(this.A06, iGAdsIABScreenshotDataDictImpl.A06) || !0qQ.A0K(this.A07, iGAdsIABScreenshotDataDictImpl.A07) || this.A01 != iGAdsIABScreenshotDataDictImpl.A01 || !0qQ.A0K(this.A08, iGAdsIABScreenshotDataDictImpl.A08) || this.A02 != iGAdsIABScreenshotDataDictImpl.A02 || !0qQ.A0K(this.A03, iGAdsIABScreenshotDataDictImpl.A03) || !0qQ.A0K(this.A09, iGAdsIABScreenshotDataDictImpl.A09)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TH.A0P(parcel, this.A04);
        AnonymousClass7TH.A0P(parcel, this.A05);
        parcel.writeParcelable(this.A00, i);
        AnonymousClass7TH.A0P(parcel, this.A06);
        AnonymousClass7TH.A0P(parcel, this.A07);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A08);
        parcel.writeParcelable(this.A02, i);
        C41848B3p.A1I(parcel, this.A03);
        parcel.writeString(this.A09);
    }

    public final Float BPL() {
        return this.A04;
    }

    public final Float BTC() {
        return this.A05;
    }

    public final IABScreenshotEffectOnUserAction Bpw() {
        return this.A00;
    }

    public final Float Bpx() {
        return this.A06;
    }

    public final Float Bpy() {
        return this.A07;
    }

    public final IABScreenshotTransitionTime Bpz() {
        return this.A01;
    }

    public final String Bq0() {
        return this.A08;
    }

    public final IGAdsIABScreenshotVariant Bq1() {
        return this.A02;
    }

    public final Boolean Bvf() {
        return this.A03;
    }

    public final String C5A() {
        return this.A09;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGAdsIABScreenshotDataDict", C48329Ecm.A00(this));
    }

    public final int hashCode() {
        return (((((((((((((((((AnonymousClass7TG.A0C(this.A04) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + C41845B3m.A00(this.A09);
    }

    public IGAdsIABScreenshotDataDictImpl(IABScreenshotEffectOnUserAction iABScreenshotEffectOnUserAction, IABScreenshotTransitionTime iABScreenshotTransitionTime, IGAdsIABScreenshotVariant iGAdsIABScreenshotVariant, Boolean bool, Float f, Float f2, Float f3, Float f4, String str, String str2) {
        this.A04 = f;
        this.A05 = f2;
        this.A00 = iABScreenshotEffectOnUserAction;
        this.A06 = f3;
        this.A07 = f4;
        this.A01 = iABScreenshotTransitionTime;
        this.A08 = str;
        this.A02 = iGAdsIABScreenshotVariant;
        this.A03 = bool;
        this.A09 = str2;
    }
}
