package X;

import java.util.List;

/* renamed from: X.GmN  reason: case insensitive filesystem */
public final class C53337GmN extends AnonymousClass0T0 {
    public final List A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53337GmN) {
                C53337GmN gmN = (C53337GmN) obj;
                if (!0qQ.A0K(this.A01, gmN.A01) || !0qQ.A0K(this.A00, gmN.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TE.A0K(this.A01));
    }

    public C53337GmN(List list, List list2) {
        AnonymousClass7TG.A1O(list, list2);
        this.A01 = list;
        this.A00 = list2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ViewState(suggestedAudioTracks=");
        A1A.append(this.A01);
        A1A.append(", preSelectedAudio=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
