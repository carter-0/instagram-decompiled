package com.instagram.leadgen.organic.model;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41847B3o;
import X.C41848B3p;
import X.C51974G9v;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import com.instagram.leadgen.core.model.privacypolicy.LeadGenPrivacyPolicy;
import java.util.Iterator;
import java.util.List;

public final class LeadGenConsumerFormData extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6E(99);
    public LeadGenFormBaseQuestion A00;
    public final int A01;
    public final long A02;
    public final ImageUrl A03;
    public final ImageUrl A04;
    public final LeadGenPrivacyPolicy A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final List A0B;
    public final boolean A0C;
    public final boolean A0D;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LeadGenConsumerFormData) {
                LeadGenConsumerFormData leadGenConsumerFormData = (LeadGenConsumerFormData) obj;
                if (!0qQ.A0K(this.A08, leadGenConsumerFormData.A08) || !0qQ.A0K(this.A06, leadGenConsumerFormData.A06) || this.A02 != leadGenConsumerFormData.A02 || !0qQ.A0K(this.A07, leadGenConsumerFormData.A07) || !0qQ.A0K(this.A03, leadGenConsumerFormData.A03) || this.A01 != leadGenConsumerFormData.A01 || !0qQ.A0K(this.A09, leadGenConsumerFormData.A09) || this.A0D != leadGenConsumerFormData.A0D || this.A0C != leadGenConsumerFormData.A0C || !0qQ.A0K(this.A0A, leadGenConsumerFormData.A0A) || !0qQ.A0K(this.A04, leadGenConsumerFormData.A04) || !0qQ.A0K(this.A0B, leadGenConsumerFormData.A0B) || !0qQ.A0K(this.A05, leadGenConsumerFormData.A05) || !0qQ.A0K(this.A00, leadGenConsumerFormData.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A08);
        parcel.writeString(this.A06);
        parcel.writeLong(this.A02);
        parcel.writeString(this.A07);
        parcel.writeParcelable(this.A03, i);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A09);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeString(this.A0A);
        parcel.writeParcelable(this.A04, i);
        Iterator A1F = C41848B3p.A1F(parcel, this.A0B);
        while (A1F.hasNext()) {
            C41847B3o.A1I(parcel, A1F, i);
        }
        parcel.writeParcelable(this.A05, i);
        parcel.writeParcelable(this.A00, i);
    }

    public final int hashCode() {
        int A082 = AnonymousClass7TF.A08(this.A07, AnonymousClass7TF.A01(this.A02, AnonymousClass7TF.A08(this.A06, AnonymousClass7TE.A0O(this.A08))));
        int A092 = AnonymousClass7TF.A09(this.A0D, AnonymousClass7TF.A08(this.A09, (AnonymousClass7TF.A07(this.A03, A082) + this.A01) * 31));
        return ((AnonymousClass7TF.A07(this.A0B, (((AnonymousClass7TF.A09(this.A0C, A092) + AnonymousClass7TG.A0E(this.A0A)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public LeadGenConsumerFormData(ImageUrl imageUrl, ImageUrl imageUrl2, LeadGenFormBaseQuestion leadGenFormBaseQuestion, LeadGenPrivacyPolicy leadGenPrivacyPolicy, String str, String str2, String str3, String str4, String str5, List list, int i, long j, boolean z, boolean z2) {
        C51974G9v.A1L(str, str2, str3);
        AnonymousClass7TF.A1E(imageUrl, 5, str4);
        0qQ.A0B(list, 12);
        this.A08 = str;
        this.A06 = str2;
        this.A02 = j;
        this.A07 = str3;
        this.A03 = imageUrl;
        this.A01 = i;
        this.A09 = str4;
        this.A0D = z;
        this.A0C = z2;
        this.A0A = str5;
        this.A04 = imageUrl2;
        this.A0B = list;
        this.A05 = leadGenPrivacyPolicy;
        this.A00 = leadGenFormBaseQuestion;
    }
}
