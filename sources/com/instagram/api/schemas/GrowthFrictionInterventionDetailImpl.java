package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C41847B3o;
import X.C41848B3p;
import X.C48328Ecl;
import X.DE7;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.Iterator;
import java.util.List;

public final class GrowthFrictionInterventionDetailImpl extends AnonymousClass0T0 implements Parcelable, GrowthFrictionInterventionDetail {
    public static final Parcelable.Creator CREATOR = DE7.A00(91);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;

    public final GrowthFrictionInterventionDetailImpl F3b() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GrowthFrictionInterventionDetailImpl) {
                GrowthFrictionInterventionDetailImpl growthFrictionInterventionDetailImpl = (GrowthFrictionInterventionDetailImpl) obj;
                if (!0qQ.A0K(this.A00, growthFrictionInterventionDetailImpl.A00) || !0qQ.A0K(this.A05, growthFrictionInterventionDetailImpl.A05) || !0qQ.A0K(this.A01, growthFrictionInterventionDetailImpl.A01) || !0qQ.A0K(this.A02, growthFrictionInterventionDetailImpl.A02) || !0qQ.A0K(this.A03, growthFrictionInterventionDetailImpl.A03) || !0qQ.A0K(this.A04, growthFrictionInterventionDetailImpl.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
        Iterator A1F = C41848B3p.A1F(parcel, this.A05);
        while (A1F.hasNext()) {
            C41847B3o.A1I(parcel, A1F, i);
        }
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
    }

    public final String AYH() {
        return this.A00;
    }

    public final List Aj1() {
        return this.A05;
    }

    public final String BIY() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTGrowthFrictionInterventionDetail", C48328Ecl.A00(this));
    }

    public final String getDescription() {
        return this.A01;
    }

    public final String getTitle() {
        return this.A03;
    }

    public final String getUrl() {
        return this.A04;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A08(this.A03, AnonymousClass7TF.A08(this.A02, AnonymousClass7TF.A08(this.A01, AnonymousClass7TF.A07(this.A05, AnonymousClass7TE.A0O(this.A00))))) + AnonymousClass7TG.A0E(this.A04);
    }

    public GrowthFrictionInterventionDetailImpl(String str, String str2, String str3, String str4, String str5, List list) {
        AnonymousClass7TG.A1U(str, list, str2);
        AnonymousClass7TG.A1R(str3, str4);
        this.A00 = str;
        this.A05 = list;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = str5;
    }
}
