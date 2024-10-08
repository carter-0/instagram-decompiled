package com.instagram.leadgen.organic.model;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C16602Uxw;
import X.C51974G9v;
import X.C71269Ogb;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.Iterator;

public final class LeadGenFormData extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C71269Ogb(0);
    public ImageUrl A00;
    public C16602Uxw A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public ArrayList A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;

    public final void A00(String str) {
        0qQ.A0B(str, 0);
        this.A04 = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LeadGenFormData) {
                LeadGenFormData leadGenFormData = (LeadGenFormData) obj;
                if (this.A01 != leadGenFormData.A01 || !0qQ.A0K(this.A03, leadGenFormData.A03) || !0qQ.A0K(this.A04, leadGenFormData.A04) || !0qQ.A0K(this.A05, leadGenFormData.A05) || !0qQ.A0K(this.A02, leadGenFormData.A02) || !0qQ.A0K(this.A00, leadGenFormData.A00) || this.A08 != leadGenFormData.A08 || this.A09 != leadGenFormData.A09 || this.A07 != leadGenFormData.A07 || this.A0A != leadGenFormData.A0A || !0qQ.A0K(this.A06, leadGenFormData.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TE.A1T(parcel, this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A00, i);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A0A ? 1 : 0);
        ArrayList arrayList = this.A06;
        parcel.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((LeadFormCustomQuestion) it.next()).writeToParcel(parcel, i);
        }
    }

    public final int hashCode() {
        int A082 = AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A08(this.A03, AnonymousClass7TE.A0K(this.A01)));
        return AnonymousClass7TE.A0N(this.A06, AnonymousClass7TF.A09(this.A0A, AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A09(this.A09, AnonymousClass7TF.A09(this.A08, (((AnonymousClass7TF.A08(this.A05, A082) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A00)) * 31)))));
    }

    public LeadGenFormData(ImageUrl imageUrl, C16602Uxw uxw, String str, String str2, String str3, String str4, ArrayList arrayList, boolean z, boolean z2, boolean z3, boolean z4) {
        C51974G9v.A1P(uxw, str, str2, str3);
        this.A01 = uxw;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A02 = str4;
        this.A00 = imageUrl;
        this.A08 = z;
        this.A09 = z2;
        this.A07 = z3;
        this.A0A = z4;
        this.A06 = arrayList;
    }
}
