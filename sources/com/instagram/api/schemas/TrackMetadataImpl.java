package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C41847B3o;
import X.C41848B3p;
import X.C44544Cge;
import X.FK6;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.Iterator;
import java.util.List;

public final class TrackMetadataImpl extends AnonymousClass0T0 implements TrackMetadata, Parcelable {
    public static final Parcelable.Creator CREATOR = new FK6(48);
    public final Boolean A00;
    public final Integer A01;
    public final Integer A02;
    public final Long A03;
    public final String A04;
    public final List A05;
    public final boolean A06;
    public final boolean A07;

    public final TrackMetadataImpl FCw() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TrackMetadataImpl) {
                TrackMetadataImpl trackMetadataImpl = (TrackMetadataImpl) obj;
                if (this.A06 != trackMetadataImpl.A06 || !0qQ.A0K(this.A05, trackMetadataImpl.A05) || !0qQ.A0K(this.A03, trackMetadataImpl.A03) || !0qQ.A0K(this.A04, trackMetadataImpl.A04) || this.A07 != trackMetadataImpl.A07 || !0qQ.A0K(this.A00, trackMetadataImpl.A00) || !0qQ.A0K(this.A01, trackMetadataImpl.A01) || !0qQ.A0K(this.A02, trackMetadataImpl.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A06 ? 1 : 0);
        List list = this.A05;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator A1G = C41848B3p.A1G(parcel, list);
            while (A1G.hasNext()) {
                C41847B3o.A1I(parcel, A1G, i);
            }
        }
        C41848B3p.A1K(parcel, this.A03);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A07 ? 1 : 0);
        C41848B3p.A1I(parcel, this.A00);
        AnonymousClass7TG.A16(parcel, this.A01, 0, 1);
        AnonymousClass7TG.A16(parcel, this.A02, 0, 1);
    }

    public final List Ay7() {
        return this.A05;
    }

    public final Long Ay8() {
        return this.A03;
    }

    public final Integer BfI() {
        return this.A01;
    }

    public final Integer C9r() {
        return this.A02;
    }

    public final Boolean Cde() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTTrackMetadata", C44544Cge.A00(this));
    }

    public final boolean getAllowMediaCreationWithMusic() {
        return this.A06;
    }

    public final String getFormattedClipsMediaCount() {
        return this.A04;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A06) {
            i = 1231;
        }
        return ((((AnonymousClass7TF.A09(this.A07, ((((((i * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A02);
    }

    public final boolean isBookmarked() {
        return this.A07;
    }

    public TrackMetadataImpl(Boolean bool, Integer num, Integer num2, Long l, String str, List list, boolean z, boolean z2) {
        this.A06 = z;
        this.A05 = list;
        this.A03 = l;
        this.A04 = str;
        this.A07 = z2;
        this.A00 = bool;
        this.A01 = num;
        this.A02 = num2;
    }
}
