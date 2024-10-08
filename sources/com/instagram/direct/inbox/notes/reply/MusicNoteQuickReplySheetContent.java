package com.instagram.direct.inbox.notes.reply;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C41848B3p;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.TrackData;
import com.instagram.user.model.User;

public final class MusicNoteQuickReplySheetContent extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LVP(80);
    public final int A00;
    public final int A01;
    public final TrackData A02;
    public final User A03;
    public final Boolean A04;
    public final Boolean A05;
    public final String A06;
    public final boolean A07;

    public MusicNoteQuickReplySheetContent(TrackData trackData, User user, Boolean bool, Boolean bool2, String str, int i, int i2, boolean z) {
        0qQ.A0B(trackData, 5);
        this.A01 = i;
        this.A00 = i2;
        this.A06 = str;
        this.A07 = z;
        this.A02 = trackData;
        this.A03 = user;
        this.A04 = bool;
        this.A05 = bool2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A03, i);
        C41848B3p.A1I(parcel, this.A04);
        C41848B3p.A1I(parcel, this.A05);
    }
}
