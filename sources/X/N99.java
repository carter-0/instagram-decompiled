package X;

import java.util.List;

public final class N99 extends AnonymousClass0T0 implements C74269Prx {
    public final List A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N99) {
                N99 n99 = (N99) obj;
                if (!0qQ.A0K(this.A00, n99.A00) || this.A01 != n99.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A09(this.A01, AnonymousClass7TE.A0K(this.A00)) + C54732HQn.A00();
    }

    public N99(List list, boolean z) {
        this.A00 = list;
        this.A01 = z;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("RtcCallParticipantsStateModel(participantsState=");
        A1A.append(this.A00);
        A1A.append(", isCallExpanded=");
        A1A.append(this.A01);
        A1A.append(", canShowParticipantStates=");
        return G9t.A1C(A1A, false);
    }
}
