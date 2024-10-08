package com.instagram.creation.sharesheet.advancedsettings.config;

import X.0qQ;
import X.0sn;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C273654mx;
import X.C41847B3o;
import X.C41848B3p;
import X.DbS;
import X.G9t;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.BrandedContentGatingInfo;
import com.instagram.api.schemas.BrandedContentProjectMetadata;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(message = "This class will be removed eventually, please do not add anything to this. New fields should be added to PublishScreenData instead.")
public final class ClipsAdvancedSettingsConfig extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = LVP.A00(47);
    public BrandedContentGatingInfo A00;
    public List A01;
    public boolean A02;
    public boolean A03;
    public BrandedContentProjectMetadata A04;
    public Boolean A05;
    public String A06;
    public String A07;
    public boolean A08;
    public final boolean A09;

    public ClipsAdvancedSettingsConfig(BrandedContentGatingInfo brandedContentGatingInfo, BrandedContentProjectMetadata brandedContentProjectMetadata, Boolean bool, String str, String str2, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        0qQ.A0B(list, 5);
        this.A06 = str;
        this.A07 = str2;
        this.A05 = bool;
        this.A02 = z;
        this.A01 = list;
        this.A04 = brandedContentProjectMetadata;
        this.A00 = brandedContentGatingInfo;
        this.A09 = z2;
        this.A03 = z3;
        this.A08 = z4;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ClipsAdvancedSettingsConfig) {
                ClipsAdvancedSettingsConfig clipsAdvancedSettingsConfig = (ClipsAdvancedSettingsConfig) obj;
                if (!0qQ.A0K(this.A06, clipsAdvancedSettingsConfig.A06) || !0qQ.A0K(this.A07, clipsAdvancedSettingsConfig.A07) || !0qQ.A0K(this.A05, clipsAdvancedSettingsConfig.A05) || this.A02 != clipsAdvancedSettingsConfig.A02 || !0qQ.A0K(this.A01, clipsAdvancedSettingsConfig.A01) || !0qQ.A0K(this.A04, clipsAdvancedSettingsConfig.A04) || !0qQ.A0K(this.A00, clipsAdvancedSettingsConfig.A00) || this.A09 != clipsAdvancedSettingsConfig.A09 || this.A03 != clipsAdvancedSettingsConfig.A03 || this.A08 != clipsAdvancedSettingsConfig.A08) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeInt(C41848B3p.A1Y(parcel, this.A05) ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        Iterator A1F = C41848B3p.A1F(parcel, this.A01);
        while (A1F.hasNext()) {
            C41847B3o.A1I(parcel, A1F, i);
        }
        parcel.writeParcelable(this.A04, i);
        parcel.writeParcelable(this.A00, i);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
    }

    public final int hashCode() {
        int A092 = AnonymousClass7TF.A09(this.A02, ((((AnonymousClass7TG.A0E(this.A06) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31);
        return DbS.A06(this.A08, AnonymousClass7TF.A09(this.A03, AnonymousClass7TF.A09(this.A09, (((AnonymousClass7TF.A07(this.A01, A092) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TE.A0L(this.A00)) * 31)));
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ClipsAdvancedSettingsConfig(brandedContentMerchantId=");
        A1A.append(this.A06);
        A1A.append(C273654mx.A00(99));
        A1A.append(this.A07);
        A1A.append(", isCapturedVideo=");
        A1A.append(this.A05);
        A1A.append(", isPaidPartnership=");
        A1A.append(this.A02);
        A1A.append(", brandedContentTags=");
        A1A.append(this.A01);
        A1A.append(", brandedContentProjectMetadata=");
        A1A.append(this.A04);
        A1A.append(", mediaGatingInfo=");
        A1A.append(this.A00);
        A1A.append(", isAccountRevshareEligible=");
        A1A.append(this.A09);
        A1A.append(", shouldShowAdsToggledOn=");
        A1A.append(this.A03);
        A1A.append(", isPostEntryPoint=");
        return G9t.A1C(A1A, this.A08);
    }

    public ClipsAdvancedSettingsConfig() {
        this((BrandedContentGatingInfo) null, (BrandedContentProjectMetadata) null, (Boolean) null, (String) null, (String) null, 0sn.A00, false, false, false, false);
    }
}
