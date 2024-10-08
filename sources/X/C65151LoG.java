package X;

/* renamed from: X.LoG  reason: case insensitive filesystem */
public final class C65151LoG implements C66512MUq {
    public final /* synthetic */ MV4 A00;
    public final /* synthetic */ C60703Jpo A01;

    public final void Dl1() {
    }

    public C65151LoG(MV4 mv4, C60703Jpo jpo) {
        this.A01 = jpo;
        this.A00 = mv4;
    }

    public final void DHl() {
        C60703Jpo jpo = this.A01;
        if (jpo.A02) {
            this.A00.DC8();
            jpo.A02 = false;
        }
    }

    public final void DP0() {
        MV4 mv4 = this.A00;
        if (mv4.CRZ()) {
            C60703Jpo jpo = this.A01;
            if (!jpo.A02) {
                jpo.A02 = true;
                mv4.DmR(jpo);
            }
        }
    }
}
