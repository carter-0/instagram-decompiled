package X;

public final class UMs extends AnonymousClass0T0 implements C21010X9l {
    public final BAY A00;
    public final UKM A01;
    public final boolean A02;
    public final Boolean A03;
    public final String A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UMs) {
                UMs uMs = (UMs) obj;
                if (!0qQ.A0K(this.A04, uMs.A04) || this.A02 != uMs.A02 || !0qQ.A0K(this.A01, uMs.A01) || !0qQ.A0K(this.A03, uMs.A03) || !0qQ.A0K(this.A00, uMs.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((AnonymousClass7TF.A09(this.A02, AnonymousClass7TG.A0E(this.A04) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public UMs(BAY bay, UKM ukm, Boolean bool, String str, boolean z) {
        this.A04 = str;
        this.A02 = z;
        this.A01 = ukm;
        this.A03 = bool;
        this.A00 = bay;
    }
}
