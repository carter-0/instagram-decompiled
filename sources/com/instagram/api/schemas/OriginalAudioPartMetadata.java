package com.instagram.api.schemas;

import X.0qQ;
import X.1E9;
import X.AnonymousClass0T0;
import X.C376389Hu;
import X.C63023KqE;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.List;

public final class OriginalAudioPartMetadata extends AnonymousClass0T0 implements OriginalAudioPartMetadataIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = new C376389Hu(92);
    public final int A00;
    public final int A01;
    public final int A02;
    public final MusicCanonicalType A03;
    public final ImageUrl A04;
    public final User A05;
    public final Boolean A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final List A0A;
    public final boolean A0B;
    public final boolean A0C;

    public OriginalAudioPartMetadata(MusicCanonicalType musicCanonicalType, ImageUrl imageUrl, User user, Boolean bool, String str, String str2, String str3, List list, int i, int i2, int i3, boolean z, boolean z2) {
        0qQ.A0B(musicCanonicalType, 3);
        0qQ.A0B(str, 4);
        0qQ.A0B(str2, 5);
        0qQ.A0B(str3, 11);
        0qQ.A0B(imageUrl, 13);
        this.A0A = list;
        this.A00 = i;
        this.A03 = musicCanonicalType;
        this.A07 = str;
        this.A08 = str2;
        this.A01 = i2;
        this.A05 = user;
        this.A0B = z;
        this.A06 = bool;
        this.A0C = z2;
        this.A09 = str3;
        this.A02 = i3;
        this.A04 = imageUrl;
    }

    public final OriginalAudioPartMetadata F7C(1E9 r1) {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OriginalAudioPartMetadata) {
                OriginalAudioPartMetadata originalAudioPartMetadata = (OriginalAudioPartMetadata) obj;
                if (!0qQ.A0K(this.A0A, originalAudioPartMetadata.A0A) || this.A00 != originalAudioPartMetadata.A00 || this.A03 != originalAudioPartMetadata.A03 || !0qQ.A0K(this.A07, originalAudioPartMetadata.A07) || !0qQ.A0K(this.A08, originalAudioPartMetadata.A08) || this.A01 != originalAudioPartMetadata.A01 || !0qQ.A0K(this.A05, originalAudioPartMetadata.A05) || this.A0B != originalAudioPartMetadata.A0B || !0qQ.A0K(this.A06, originalAudioPartMetadata.A06) || this.A0C != originalAudioPartMetadata.A0C || !0qQ.A0K(this.A09, originalAudioPartMetadata.A09) || this.A02 != originalAudioPartMetadata.A02 || !0qQ.A0K(this.A04, originalAudioPartMetadata.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        List<Parcelable> list = this.A0A;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (Parcelable writeParcelable : list) {
                parcel.writeParcelable(writeParcelable, i);
            }
        }
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A03, i);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeInt(this.A01);
        parcel.writeParcelable(this.A05, i);
        parcel.writeInt(this.A0B ? 1 : 0);
        Boolean bool = this.A06;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeString(this.A09);
        parcel.writeInt(this.A02);
        parcel.writeParcelable(this.A04, i);
    }

    public final List Adc() {
        return this.A0A;
    }

    public final int Adr() {
        return this.A00;
    }

    public final MusicCanonicalType Adu() {
        return this.A03;
    }

    public final User BEv() {
        return this.A05;
    }

    public final int Bag() {
        return this.A02;
    }

    public final ImageUrl C72() {
        return this.A04;
    }

    public final Boolean CRq() {
        return this.A06;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTOriginalAudioPartMetadata", C63023KqE.A00(this));
    }

    public final String getDisplayArtist() {
        return this.A07;
    }

    public final String getDisplayTitle() {
        return this.A08;
    }

    public final int getDurationInMs() {
        return this.A01;
    }

    public final String getMusicCanonicalId() {
        return this.A09;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        List list = this.A0A;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int hashCode3 = ((((((((((hashCode * 31) + this.A00) * 31) + this.A03.hashCode()) * 31) + this.A07.hashCode()) * 31) + this.A08.hashCode()) * 31) + this.A01) * 31;
        User user = this.A05;
        if (user == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = user.hashCode();
        }
        int i2 = (hashCode3 + hashCode2) * 31;
        int i3 = 1237;
        if (this.A0B) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        Boolean bool = this.A06;
        if (bool != null) {
            i = bool.hashCode();
        }
        int i5 = (i4 + i) * 31;
        int i6 = 1237;
        if (this.A0C) {
            i6 = 1231;
        }
        return ((((((i5 + i6) * 31) + this.A09.hashCode()) * 31) + this.A02) * 31) + this.A04.hashCode();
    }

    public final boolean isBookmarked() {
        return this.A0B;
    }

    public final boolean isExplicit() {
        return this.A0C;
    }

    public final OriginalAudioPartMetadataIntf E7p(1E9 r1) {
        return this;
    }
}
