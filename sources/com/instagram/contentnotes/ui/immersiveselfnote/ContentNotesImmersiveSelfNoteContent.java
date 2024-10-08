package com.instagram.contentnotes.ui.immersiveselfnote;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C51972G9s;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.contentnotes.data.metadata.ContentNoteMetadata;
import com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState;

public final class ContentNotesImmersiveSelfNoteContent extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LVP(4);
    public final ContentNoteMetadata A00;
    public final NotesPogThoughtBubbleUiState A01;
    public final boolean A02;
    public final boolean A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeParcelable(this.A01, i);
    }

    public ContentNotesImmersiveSelfNoteContent(ContentNoteMetadata contentNoteMetadata, NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState, boolean z, boolean z2) {
        C51972G9s.A1B(contentNoteMetadata, notesPogThoughtBubbleUiState);
        this.A00 = contentNoteMetadata;
        this.A02 = z;
        this.A03 = z2;
        this.A01 = notesPogThoughtBubbleUiState;
    }
}
