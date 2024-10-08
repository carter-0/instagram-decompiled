package X;

public final class M0L implements X7B {
    public final /* synthetic */ M0Y A00;
    public final /* synthetic */ String A01;

    public M0L(M0Y m0y, String str) {
        this.A00 = m0y;
        this.A01 = str;
    }

    public final void CsD() {
        C313886hJ r3 = this.A00.A0B;
        String str = this.A01;
        Object A02 = r3.A03.A02();
        if (A02 != null) {
            AnonymousClass7TE.A1Z(new C66173MGk(A02, r3, str, (AnonymousClass4D7) null, 29), C318116oQ.A00(r3));
        }
    }

    public final void EOa(boolean z) {
        Integer num;
        M0Y m0y = this.A00;
        Integer num2 = m0y.A01;
        Integer num3 = AnonymousClass05K.A15;
        if (z) {
            if (!(num2 == num3 || num2 == (num = AnonymousClass05K.A1F))) {
                if (num2 == AnonymousClass05K.A0Y || num2 == AnonymousClass05K.A0j) {
                    num3 = num;
                }
            }
            AnonymousClass7TF.A1O(C313776gz.A0K.A00(m0y.A06, C313666go.BROADCASTER).A02().A0O, z);
        }
        if (num2 == num3 || num2 == AnonymousClass05K.A1F) {
            boolean z2 = true;
            if (num2 != AnonymousClass05K.A1F) {
                z2 = false;
            }
            int ordinal = m0y.A0A.ordinal();
            if (z2) {
                if (ordinal == 2) {
                    num3 = AnonymousClass05K.A0j;
                } else if (ordinal == 6) {
                    num3 = AnonymousClass05K.A0u;
                }
            } else if (ordinal == 2) {
                num3 = AnonymousClass05K.A01;
            } else if (ordinal == 6) {
                num3 = AnonymousClass05K.A0C;
            }
            num3 = AnonymousClass05K.A00;
        }
        AnonymousClass7TF.A1O(C313776gz.A0K.A00(m0y.A06, C313666go.BROADCASTER).A02().A0O, z);
        Integer num4 = AnonymousClass05K.A0C;
        if (!(num2 == num4 || num2 == AnonymousClass05K.A0u) || num3 == num4 || num3 == AnonymousClass05K.A0u) {
            m0y.A01 = num3;
        }
        AnonymousClass7TF.A1O(C313776gz.A0K.A00(m0y.A06, C313666go.BROADCASTER).A02().A0O, z);
    }
}
