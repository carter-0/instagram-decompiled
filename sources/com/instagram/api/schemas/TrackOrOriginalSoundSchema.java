package com.instagram.api.schemas;

import X.0qQ;
import X.1E9;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C44545Cgf;
import X.FK6;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class TrackOrOriginalSoundSchema extends AnonymousClass0T0 implements TrackOrOriginalSoundSchemaIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = new FK6(49);
    public final OriginalSoundData A00;
    public final TrackData A01;
    public final TrackMetadata A02;

    public final TrackOrOriginalSoundSchema FCx(1E9 r1) {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TrackOrOriginalSoundSchema) {
                TrackOrOriginalSoundSchema trackOrOriginalSoundSchema = (TrackOrOriginalSoundSchema) obj;
                if (!0qQ.A0K(this.A02, trackOrOriginalSoundSchema.A02) || !0qQ.A0K(this.A00, trackOrOriginalSoundSchema.A00) || !0qQ.A0K(this.A01, trackOrOriginalSoundSchema.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
    }

    public final TrackMetadata BSi() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ OriginalSoundDataIntf BZA() {
        return this.A00;
    }

    public final TrackData C92() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTTrackOrOriginalSoundSchema", C44545Cgf.A00(this));
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0C(this.A02) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public TrackOrOriginalSoundSchema(OriginalSoundData originalSoundData, TrackData trackData, TrackMetadata trackMetadata) {
        this.A02 = trackMetadata;
        this.A00 = originalSoundData;
        this.A01 = trackData;
    }

    public final TrackOrOriginalSoundSchemaIntf E9T(1E9 r1) {
        return this;
    }
}
