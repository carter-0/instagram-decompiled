package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C41848B3p;
import X.CYH;
import X.DE7;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class GrowthFrictionInterventionButtonImpl extends AnonymousClass0T0 implements Parcelable, GrowthFrictionInterventionButton {
    public static final Parcelable.Creator CREATOR = DE7.A00(90);
    public final Boolean A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final GrowthFrictionInterventionButtonImpl F3Z() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GrowthFrictionInterventionButtonImpl) {
                GrowthFrictionInterventionButtonImpl growthFrictionInterventionButtonImpl = (GrowthFrictionInterventionButtonImpl) obj;
                if (!0qQ.A0K(this.A01, growthFrictionInterventionButtonImpl.A01) || !0qQ.A0K(this.A00, growthFrictionInterventionButtonImpl.A00) || !0qQ.A0K(this.A02, growthFrictionInterventionButtonImpl.A02) || !0qQ.A0K(this.A03, growthFrictionInterventionButtonImpl.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeInt(C41848B3p.A1Y(parcel, this.A00) ? 1 : 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
    }

    public final String AYH() {
        return this.A01;
    }

    public final Boolean CZp() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTGrowthFrictionInterventionButton", CYH.A00(this));
    }

    public final String getText() {
        return this.A02;
    }

    public final String getUrl() {
        return this.A03;
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + C41845B3m.A00(this.A03);
    }

    public GrowthFrictionInterventionButtonImpl(Boolean bool, String str, String str2, String str3) {
        this.A01 = str;
        this.A00 = bool;
        this.A02 = str2;
        this.A03 = str3;
    }
}
