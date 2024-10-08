package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C44060CUd;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class AudienceList extends AnonymousClass0T0 implements AudienceListIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = new SWT(45);
    public final String A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public final AudienceList F0b() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AudienceList) {
                AudienceList audienceList = (AudienceList) obj;
                if (!(this.A02 == audienceList.A02 && this.A03 == audienceList.A03 && this.A04 == audienceList.A04 && 0qQ.A0K(this.A00, audienceList.A00) && 0qQ.A0K(this.A01, audienceList.A01))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public final String BN7() {
        return this.A00;
    }

    public final boolean CRG() {
        return this.A02;
    }

    public final boolean CWL() {
        return this.A03;
    }

    public final boolean CWM() {
        return this.A04;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTAudienceList", C44060CUd.A00(this));
    }

    public final String getName() {
        return this.A01;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        return C41845B3m.A01(this.A01, AnonymousClass7TF.A08(this.A00, AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A09(this.A03, i * 31))));
    }

    public AudienceList(String str, String str2, boolean z, boolean z2, boolean z3) {
        AnonymousClass7TG.A1R(str, str2);
        this.A02 = z;
        this.A03 = z2;
        this.A04 = z3;
        this.A00 = str;
        this.A01 = str2;
    }
}
