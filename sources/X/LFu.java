package X;

public final class LFu {
    public final long A00;
    public final long A01;
    public final String A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LFu) {
                LFu lFu = (LFu) obj;
                if (!(this.A03 == lFu.A03 && 0qQ.A0K(this.A02, lFu.A02) && this.A01 == lFu.A01 && this.A00 == lFu.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public LFu(long j, String str, boolean z, long j2) {
        this.A03 = z;
        this.A02 = str;
        this.A01 = j;
        this.A00 = j2;
    }

    public final int hashCode() {
        int A012 = AnonymousClass7TF.A01(this.A01, AnonymousClass7TF.A08(this.A02, AnonymousClass7TF.A09(this.A03, 38161)));
        long j = this.A00;
        return A012 + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("StickerTypeaheadConfigParams(getStickerConcurrently=");
        A1A.append(true);
        A1A.append(", typeaheadLibEnabled=");
        A1A.append(this.A03);
        A1A.append(", liveRules=");
        A1A.append(this.A02);
        A1A.append(", triggerMinLen=");
        A1A.append(this.A01);
        A1A.append(", triggerMaxWord=");
        A1A.append(this.A00);
        return AnonymousClass7TG.A0p(A1A);
    }
}
