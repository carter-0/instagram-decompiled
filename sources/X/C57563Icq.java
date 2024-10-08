package X;

import java.util.List;

/* renamed from: X.Icq  reason: case insensitive filesystem */
public final class C57563Icq implements JMQ {
    public final List A00;
    public final 0sP A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C57563Icq) {
                C57563Icq icq = (C57563Icq) obj;
                if (!0qQ.A0K(this.A00, icq.A00) || !0qQ.A0K(this.A01, icq.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public C57563Icq(0sP r1, List list) {
        this.A00 = list;
        this.A01 = r1;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("MetaAIReelsUIState(reelsData=");
        A1A.append(this.A00);
        A1A.append(", onReelClicked=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
