package X;

/* renamed from: X.Sc7  reason: case insensitive filesystem */
public final class C11546Sc7 implements 1MD {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public C11546Sc7(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
        this.A03 = str;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C10901S0b s0b;
        QNI qni;
        int i = this.A00;
        S4g s4g = (S4g) obj;
        0qQ.A0B(s4g, 0);
        Object obj2 = this.A02;
        switch (i) {
            case 2:
                s0b = (C10901S0b) ((SNY) obj2).A02.getValue();
                qni = (QNI) this.A01;
                qni.A07("", "platform_trust_token");
                break;
            case 3:
                C10901S0b s0b2 = ((Stc) obj2).A03;
                QNI qni2 = (QNI) this.A01;
                qni2.A07("", "platform_trust_token");
                return s0b2.A00(s4g, qni2, this.A03);
            default:
                s0b = ((C12404Std) obj2).A02;
                qni = (QNI) this.A01;
                break;
        }
        return s0b.A00(s4g, qni, this.A03);
    }
}
