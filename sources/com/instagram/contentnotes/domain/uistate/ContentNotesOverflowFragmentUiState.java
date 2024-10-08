package com.instagram.contentnotes.domain.uistate;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41848B3p;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

public final class ContentNotesOverflowFragmentUiState extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LVP(0);
    public final String A00;
    public final List A01;

    public ContentNotesOverflowFragmentUiState(String str, List list) {
        0qQ.A0B(str, 1);
        this.A00 = str;
        this.A01 = list;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ContentNotesOverflowFragmentUiState) {
                ContentNotesOverflowFragmentUiState contentNotesOverflowFragmentUiState = (ContentNotesOverflowFragmentUiState) obj;
                if (!0qQ.A0K(this.A00, contentNotesOverflowFragmentUiState.A00) || !0qQ.A0K(this.A01, contentNotesOverflowFragmentUiState.A01)) {
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
        Iterator A1F = C41848B3p.A1F(parcel, this.A01);
        while (A1F.hasNext()) {
            ((NotesPogThoughtBubbleUiState) A1F.next()).writeToParcel(parcel, i);
        }
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TE.A0O(this.A00));
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ContentNotesOverflowFragmentUiState(mediaId=");
        A1A.append(this.A00);
        A1A.append(", notes=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
