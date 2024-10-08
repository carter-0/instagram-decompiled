package com.instagram.direct.inbox.notes.models;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41847B3o;
import X.C41848B3p;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

public final class NoteAudienceItem extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LVP(78);
    public final NoteAudience A00;
    public final int A01;
    public final String A02;
    public final List A03;

    public NoteAudienceItem(NoteAudience noteAudience, String str, List list, int i) {
        0qQ.A0B(noteAudience, 1);
        this.A00 = noteAudience;
        this.A02 = str;
        this.A01 = i;
        this.A03 = list;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NoteAudienceItem) {
                NoteAudienceItem noteAudienceItem = (NoteAudienceItem) obj;
                if (this.A00 != noteAudienceItem.A00 || !0qQ.A0K(this.A02, noteAudienceItem.A02) || this.A01 != noteAudienceItem.A01 || !0qQ.A0K(this.A03, noteAudienceItem.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        this.A00.writeToParcel(parcel, i);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A01);
        List list = this.A03;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        Iterator A1F = C41848B3p.A1F(parcel, list);
        while (A1F.hasNext()) {
            C41847B3o.A1I(parcel, A1F, i);
        }
    }

    public final int hashCode() {
        return ((((AnonymousClass7TE.A0K(this.A00) + AnonymousClass7TG.A0E(this.A02)) * 31) + this.A01) * 31) + AnonymousClass7TE.A0L(this.A03);
    }
}
