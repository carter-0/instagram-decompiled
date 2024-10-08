package X;

/* renamed from: X.Fmo  reason: case insensitive filesystem */
public final class C51001Fmo implements AnonymousClass3AB {
    public final int A00;
    public final Object A01;

    public C51001Fmo(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Dcp() {
        C14221Ts1 ts1;
        switch (this.A00) {
            case 0:
                EEU eeu = (EEU) this.A01;
                if (!eeu.A03 && eeu.A06.isResumed()) {
                    eeu.A04 = true;
                    EEU.A00(eeu);
                    return;
                }
                return;
            case 1:
                ((C47523E6j) this.A01).A02();
                return;
            default:
                C46430Der der = (C46430Der) this.A01;
                der.A0e = true;
                F05 f05 = der.A0F;
                if (f05 != null) {
                    f05.A03.clear();
                    F05 f052 = der.A0F;
                    if (f052 != null) {
                        if (f052.A00) {
                            ts1 = f052.A01;
                        } else {
                            ts1 = f052.A02;
                        }
                        ts1.A06("");
                        return;
                    }
                }
                0qQ.A0F("followListFragmentQueryManager");
                throw AnonymousClass00P.createAndThrow();
        }
    }
}
