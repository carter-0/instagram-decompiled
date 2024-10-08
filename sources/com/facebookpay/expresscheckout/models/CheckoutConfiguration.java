package com.facebookpay.expresscheckout.models;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C11084S9e;
import X.C273654mx;
import X.C41848B3p;
import X.C51971G9r;
import X.C8891REi;
import X.C8942RGk;
import X.Pxj;
import X.REn;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.Iterator;
import java.util.Set;

public final class CheckoutConfiguration implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWV.A00(28);
    @SerializedName("orientation")
    public final int A00;
    @SerializedName("apmConfiguration")
    public final APMConfiguration A01;
    @SerializedName("nuxBannerType")
    public final C8942RGk A02;
    @SerializedName("puxBannerType")
    public final C8942RGk A03;
    @SerializedName("defaultEmailOptOut")
    public final Boolean A04;
    @SerializedName("enableAnonCheckoutRedesign")
    public final Boolean A05;
    @SerializedName("enableCheckoutOptionality")
    public final Boolean A06;
    @SerializedName("enableMissingBillingOptimization")
    public final Boolean A07;
    @SerializedName("enableRedesignOptimizations")
    public final Boolean A08;
    @SerializedName("enableRedesignPhase2")
    public final Boolean A09;
    @SerializedName("enableRedesignPhase4")
    public final Boolean A0A;
    @SerializedName("isBloksCheckoutAvailable")
    public final Boolean A0B;
    @SerializedName("pickupOptionSupport")
    public final Boolean A0C;
    @SerializedName("fulfillmentType")
    public final Integer A0D;
    @SerializedName("checkoutCTAButtonText")
    public final String A0E;
    @SerializedName("emailOptInUrl")
    public final String A0F;
    @SerializedName("languageLocal")
    public final String A0G;
    @SerializedName("optionalFields")
    public final Set<REn> A0H;
    @SerializedName("returnFields")
    public final Set<C8891REi> A0I;
    @SerializedName("fullBillingAddressRequired")
    public final boolean A0J;
    @SerializedName("isCheckoutInFullScreen")
    public final boolean A0K;
    @SerializedName("shouldShowHeaderBranding")
    public final boolean A0L;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CheckoutConfiguration) {
                CheckoutConfiguration checkoutConfiguration = (CheckoutConfiguration) obj;
                if (!0qQ.A0K(this.A0G, checkoutConfiguration.A0G) || !0qQ.A0K(this.A0H, checkoutConfiguration.A0H) || !0qQ.A0K(this.A0I, checkoutConfiguration.A0I) || !0qQ.A0K(this.A0E, checkoutConfiguration.A0E) || this.A0J != checkoutConfiguration.A0J || this.A02 != checkoutConfiguration.A02 || this.A03 != checkoutConfiguration.A03 || !0qQ.A0K(this.A09, checkoutConfiguration.A09) || !0qQ.A0K(this.A0A, checkoutConfiguration.A0A) || !0qQ.A0K(this.A05, checkoutConfiguration.A05) || !0qQ.A0K(this.A0C, checkoutConfiguration.A0C) || !0qQ.A0K(this.A01, checkoutConfiguration.A01) || !0qQ.A0K(this.A0F, checkoutConfiguration.A0F) || !0qQ.A0K(this.A04, checkoutConfiguration.A04) || !0qQ.A0K(this.A06, checkoutConfiguration.A06) || this.A0D != checkoutConfiguration.A0D || !0qQ.A0K(this.A08, checkoutConfiguration.A08) || this.A00 != checkoutConfiguration.A00 || this.A0K != checkoutConfiguration.A0K || !0qQ.A0K(this.A07, checkoutConfiguration.A07) || this.A0L != checkoutConfiguration.A0L || !0qQ.A0K(this.A0B, checkoutConfiguration.A0B)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A0G);
        Iterator A0w = Pxj.A0w(parcel, this.A0H);
        while (A0w.hasNext()) {
            AnonymousClass7TE.A1T(parcel, (REn) A0w.next());
        }
        Iterator A0w2 = Pxj.A0w(parcel, this.A0I);
        while (A0w2.hasNext()) {
            AnonymousClass7TE.A1T(parcel, (C8891REi) A0w2.next());
        }
        parcel.writeString(this.A0E);
        parcel.writeInt(this.A0J ? 1 : 0);
        Pxj.A1A(parcel, this.A02);
        Pxj.A1A(parcel, this.A03);
        C41848B3p.A1I(parcel, this.A09);
        C41848B3p.A1I(parcel, this.A0A);
        C41848B3p.A1I(parcel, this.A05);
        C41848B3p.A1I(parcel, this.A0C);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A0F);
        C41848B3p.A1I(parcel, this.A04);
        C41848B3p.A1I(parcel, this.A06);
        Integer num = this.A0D;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(C11084S9e.A01(num));
        }
        C41848B3p.A1I(parcel, this.A08);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A0K ? 1 : 0);
        C41848B3p.A1I(parcel, this.A07);
        parcel.writeInt(this.A0L ? 1 : 0);
        C41848B3p.A1I(parcel, this.A0B);
    }

    public CheckoutConfiguration(APMConfiguration aPMConfiguration, C8942RGk rGk, C8942RGk rGk2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Integer num, String str, String str2, String str3, Set set, Set set2, int i, boolean z, boolean z2, boolean z3) {
        Set set3 = set;
        Set set4 = set2;
        AnonymousClass7TG.A1Q(set3, set4);
        this.A0G = str;
        this.A0H = set3;
        this.A0I = set4;
        this.A0E = str2;
        this.A0J = z;
        this.A02 = rGk;
        this.A03 = rGk2;
        this.A09 = bool;
        this.A0A = bool2;
        this.A05 = bool3;
        this.A0C = bool4;
        this.A01 = aPMConfiguration;
        this.A0F = str3;
        this.A04 = bool5;
        this.A06 = bool6;
        this.A0D = num;
        this.A08 = bool7;
        this.A00 = i;
        this.A0K = z2;
        this.A07 = bool8;
        this.A0L = z3;
        this.A0B = bool9;
    }

    public final int hashCode() {
        int A0D2;
        int A072 = AnonymousClass7TF.A07(this.A0H, AnonymousClass7TG.A0E(this.A0G) * 31);
        int A092 = (((((((((((((((((((AnonymousClass7TF.A09(this.A0J, (AnonymousClass7TF.A07(this.A0I, A072) + AnonymousClass7TG.A0E(this.A0E)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A09)) * 31) + AnonymousClass7TG.A0C(this.A0A)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A0C)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A0F)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31;
        Integer num = this.A0D;
        if (num == null) {
            A0D2 = 0;
        } else {
            A0D2 = C51971G9r.A0D(num, C11084S9e.A01(num));
        }
        boolean z = this.A0K;
        return AnonymousClass7TF.A09(this.A0L, (AnonymousClass7TF.A09(z, (((((A092 + A0D2) * 31) + AnonymousClass7TG.A0C(this.A08)) * 31) + this.A00) * 31) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TE.A0L(this.A0B);
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CheckoutConfiguration(languageLocal=");
        A1A.append(this.A0G);
        A1A.append(", optionalFields=");
        A1A.append(this.A0H);
        A1A.append(", returnFields=");
        A1A.append(this.A0I);
        A1A.append(", checkoutCTAButtonText=");
        A1A.append(this.A0E);
        A1A.append(", fullBillingAddressRequired=");
        A1A.append(this.A0J);
        A1A.append(", nuxBannerType=");
        A1A.append(this.A02);
        A1A.append(", puxBannerType=");
        A1A.append(this.A03);
        A1A.append(", enableRedesignPhase2=");
        A1A.append(this.A09);
        A1A.append(", enableRedesignPhase4=");
        A1A.append(this.A0A);
        A1A.append(", enableAnonCheckoutRedesign=");
        A1A.append(this.A05);
        A1A.append(", pickupOptionSupport=");
        A1A.append(this.A0C);
        A1A.append(", apmConfiguration=");
        A1A.append(this.A01);
        A1A.append(", emailOptInUrl=");
        A1A.append(this.A0F);
        A1A.append(", defaultEmailOptOut=");
        A1A.append(this.A04);
        A1A.append(", enableCheckoutOptionality=");
        A1A.append(this.A06);
        A1A.append(", fulfillmentType=");
        Integer num = this.A0D;
        if (num != null) {
            str = C11084S9e.A01(num);
        } else {
            str = "null";
        }
        A1A.append(str);
        A1A.append(", enableRedesignOptimizations=");
        A1A.append(this.A08);
        A1A.append(C273654mx.A00(100));
        A1A.append(this.A00);
        A1A.append(", isCheckoutInFullScreen=");
        A1A.append(this.A0K);
        A1A.append(", enableMissingBillingOptimization=");
        A1A.append(this.A07);
        A1A.append(", shouldShowHeaderBranding=");
        A1A.append(this.A0L);
        A1A.append(", isBloksCheckoutAvailable=");
        return AnonymousClass7TG.A0n(this.A0B, A1A);
    }
}
