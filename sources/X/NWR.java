package X;

import com.instagram.direct.inbox.notes.models.NoteAudience;

public final class NWR extends C71950Otb {
    public final NoteAudience A00;
    public final boolean A01;

    public NWR(NoteAudience noteAudience, boolean z) {
        0qQ.A0B(noteAudience, 1);
        this.A00 = noteAudience;
        this.A01 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NWR) {
                NWR nwr = (NWR) obj;
                if (!(this.A00 == nwr.A00 && this.A01 == nwr.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00.toString();
    }

    public final int hashCode() {
        return DbS.A06(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C71950Otb otb = (C71950Otb) obj;
        if (!(otb instanceof NWR)) {
            return false;
        }
        NWR nwr = (NWR) otb;
        if (this.A00 == nwr.A00 && this.A01 == nwr.A01) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("AudienceViewModel(audience=");
        A1A.append(this.A00);
        A1A.append(", isSelected=");
        return G9t.A1C(A1A, this.A01);
    }
}
