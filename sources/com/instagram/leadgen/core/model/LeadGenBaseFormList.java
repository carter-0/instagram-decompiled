package com.instagram.leadgen.core.model;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C41847B3o;
import X.C41848B3p;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.leadgen.core.api.LeadForm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class LeadGenBaseFormList extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6E(86);
    public XIGIGBoostCallToAction A00;
    public LeadForm A01;
    public String A02;
    public String A03;
    public List A04;
    public boolean A05;

    public LeadGenBaseFormList(XIGIGBoostCallToAction xIGIGBoostCallToAction, LeadForm leadForm, String str, String str2, List list, boolean z) {
        0qQ.A0B(str2, 6);
        this.A00 = xIGIGBoostCallToAction;
        this.A01 = leadForm;
        this.A04 = list;
        this.A02 = str;
        this.A05 = z;
        this.A03 = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LeadGenBaseFormList) {
                LeadGenBaseFormList leadGenBaseFormList = (LeadGenBaseFormList) obj;
                if (this.A00 != leadGenBaseFormList.A00 || !0qQ.A0K(this.A01, leadGenBaseFormList.A01) || !0qQ.A0K(this.A04, leadGenBaseFormList.A04) || !0qQ.A0K(this.A02, leadGenBaseFormList.A02) || this.A05 != leadGenBaseFormList.A05 || !0qQ.A0K(this.A03, leadGenBaseFormList.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
        Iterator A1F = C41848B3p.A1F(parcel, this.A04);
        while (A1F.hasNext()) {
            C41847B3o.A1I(parcel, A1F, i);
        }
        parcel.writeString(this.A02);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeString(this.A03);
    }

    public final int hashCode() {
        List list = this.A04;
        return C41845B3m.A01(this.A03, AnonymousClass7TF.A09(this.A05, (AnonymousClass7TF.A07(list, ((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + C41845B3m.A00(this.A02)) * 31));
    }

    public LeadGenBaseFormList() {
        this((XIGIGBoostCallToAction) null, (LeadForm) null, (String) null, "", new ArrayList(), false);
    }
}
