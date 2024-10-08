package com.instagram.contentnotes.domain.uistate;

import X.002;
import X.0qQ;
import X.AnonymousClass0T0;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;

public final class NoteTextStringResourceContent extends AnonymousClass0T0 implements NoteTextContent {
    public static final Parcelable.Creator CREATOR = LVP.A00(2);
    public final int A00;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof NoteTextStringResourceContent) && this.A00 == ((NoteTextStringResourceContent) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return 002.A0I("NoteTextStringResourceContent(textResourceId=", ')', this.A00);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A00);
    }

    public NoteTextStringResourceContent(int i) {
        this.A00 = i;
    }
}
