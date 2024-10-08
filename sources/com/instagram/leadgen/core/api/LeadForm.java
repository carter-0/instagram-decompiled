package com.instagram.leadgen.core.api;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C41848B3p;
import X.C51974G9v;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;
import java.util.Iterator;
import java.util.List;

public final class LeadForm extends AnonymousClass0T0 implements Parcelable, LeadFormIntf {
    public static final Parcelable.Creator CREATOR = new W6E(82);
    public final ImageUrl A00;
    public final Boolean A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;

    public final LeadForm FEQ() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LeadForm) {
                LeadForm leadForm = (LeadForm) obj;
                if (!0qQ.A0K(this.A00, leadForm.A00) || !0qQ.A0K(this.A02, leadForm.A02) || !0qQ.A0K(this.A03, leadForm.A03) || !0qQ.A0K(this.A05, leadForm.A05) || !0qQ.A0K(this.A01, leadForm.A01) || !0qQ.A0K(this.A04, leadForm.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        boolean booleanValue;
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        Iterator A1F = C41848B3p.A1F(parcel, this.A05);
        while (A1F.hasNext()) {
            ((LeadGenInfoFieldData) A1F.next()).writeToParcel(parcel, i);
        }
        Boolean bool = this.A01;
        if (bool == null) {
            booleanValue = false;
        } else {
            parcel.writeInt(1);
            booleanValue = bool.booleanValue();
        }
        parcel.writeInt(booleanValue ? 1 : 0);
        parcel.writeString(this.A04);
    }

    public final String B7N() {
        return this.A03;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A07(this.A05, AnonymousClass7TF.A08(this.A03, AnonymousClass7TF.A08(this.A02, AnonymousClass7TG.A0C(this.A00) * 31))) + AnonymousClass7TG.A0C(this.A01)) * 31) + C41845B3m.A00(this.A04);
    }

    public LeadForm(ImageUrl imageUrl, Boolean bool, String str, String str2, String str3, List list) {
        C51974G9v.A1M(str, str2, list);
        this.A00 = imageUrl;
        this.A02 = str;
        this.A03 = str2;
        this.A05 = list;
        this.A01 = bool;
        this.A04 = str3;
    }
}
