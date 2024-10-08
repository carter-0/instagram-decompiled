package com.instagram.contentnotes.domain.uistate;

import X.0qQ;
import X.AnonymousClass0T0;
import X.G9w;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;

public final class NoteTextStringLiteralContent extends AnonymousClass0T0 implements NoteTextContent {
    public static final Parcelable.Creator CREATOR = new LVP(1);
    public final String A00;

    public NoteTextStringLiteralContent(String str) {
        0qQ.A0B(str, 1);
        this.A00 = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof NoteTextStringLiteralContent) && 0qQ.A0K(this.A00, ((NoteTextStringLiteralContent) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
    }

    public final String toString() {
        return G9w.A0k("NoteTextStringLiteralContent(text=", this.A00);
    }
}
