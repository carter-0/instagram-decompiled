package com.instagram.direct.inbox.notes.models;

import X.0oU;
import X.AnonymousClass7TG;
import X.C51967G9n;
import X.DbS;
import X.Dbb;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum NoteCreationSource implements Parcelable {
    UNKNOWN(0),
    INBOX_TRAY(1),
    PROFILE_HEADER(2);
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final int A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        NoteCreationSource[] noteCreationSourceArr;
        A02 = 0oU.A00(noteCreationSourceArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (NoteCreationSource noteCreationSource : values()) {
            C51967G9n.A1O(noteCreationSource, A0x, noteCreationSource.A00);
        }
        A01 = A0x;
        CREATOR = new LVP(79);
    }

    /* access modifiers changed from: public */
    NoteCreationSource(int i) {
        this.A00 = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
