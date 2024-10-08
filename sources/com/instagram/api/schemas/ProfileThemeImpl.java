package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C44281CcP;
import X.DE6;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class ProfileThemeImpl extends AnonymousClass0T0 implements Parcelable, ProfileTheme {
    public static final Parcelable.Creator CREATOR = DE6.A00(51);
    public final ProfileThemeType A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;

    public final ProfileThemeImpl F8D() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProfileThemeImpl) {
                ProfileThemeImpl profileThemeImpl = (ProfileThemeImpl) obj;
                if (!0qQ.A0K(this.A01, profileThemeImpl.A01) || !0qQ.A0K(this.A02, profileThemeImpl.A02) || !0qQ.A0K(this.A03, profileThemeImpl.A03) || !0qQ.A0K(this.A06, profileThemeImpl.A06) || !0qQ.A0K(this.A04, profileThemeImpl.A04) || this.A00 != profileThemeImpl.A00 || !0qQ.A0K(this.A05, profileThemeImpl.A05)) {
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
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeStringList(this.A06);
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A05);
    }

    public final String AbJ() {
        return this.A01;
    }

    public final String AbK() {
        return this.A02;
    }

    public final String Aev() {
        return this.A03;
    }

    public final List B9h() {
        return this.A06;
    }

    public final String C5u() {
        return this.A04;
    }

    public final ProfileThemeType C5x() {
        return this.A00;
    }

    public final String C75() {
        return this.A05;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTProfileTheme", C44281CcP.A00(this));
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A07(this.A06, ((((AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31))) + C41845B3m.A00(this.A05);
    }

    public ProfileThemeImpl(ProfileThemeType profileThemeType, String str, String str2, String str3, String str4, String str5, List list) {
        AnonymousClass7TG.A1R(list, str4);
        0qQ.A0B(profileThemeType, 6);
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A06 = list;
        this.A04 = str4;
        this.A00 = profileThemeType;
        this.A05 = str5;
    }
}
