package X;

public final class Q43 implements C13670Tee {
    public final C13670Tee A00;

    public Q43(C13670Tee tee) {
        this.A00 = tee;
    }

    public final boolean Ezc(C276544tV r9) {
        AnonymousClass1KX A03 = C64361Kj.A00().A03();
        int i = r9.A04;
        int[] A002 = A03.A00(i);
        for (int A0M : A002) {
            for (C276544tV r1 : r9.A0M(A0M)) {
                if (r1 != null && this.A00.Ezc(r1)) {
                    return true;
                }
            }
        }
        int[] A01 = C64361Kj.A00().A03().A01(i);
        for (int A07 : A01) {
            C276544tV A072 = r9.A07(A07);
            if (A072 != null && this.A00.Ezc(A072)) {
                return true;
            }
        }
        return false;
    }
}
