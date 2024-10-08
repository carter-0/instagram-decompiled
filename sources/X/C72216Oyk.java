package X;

/* renamed from: X.Oyk  reason: case insensitive filesystem */
public final class C72216Oyk implements C61180ln {
    public final int A00;
    public final Object A01;

    public C72216Oyk(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Cvc(0lg r5) {
        if (this.A00 != 0) {
            C67734Mtn mtn = (C67734Mtn) this.A01;
            mtn.A03.A0B("HARD_BLOCK_PIN_FLOW_APP_BACKGROUNDED");
            if (!mtn.A00) {
                NUF nuf = mtn.A02;
                nuf.A09();
                nuf.A0D("BACKGROUND_SOURCE", "PIN_HARDBLOCK_FLOW");
                nuf.A08();
            }
            mtn.A00 = true;
        }
    }

    public final void Cve(0lg r3) {
        if (this.A00 != 0) {
            ((C67734Mtn) this.A01).A03.A0B("HARD_BLOCK_PIN_FLOW_APP_FOREGROUNDED");
            return;
        }
        Mf8 mf8 = (Mf8) this.A01;
        mf8.A02.clear();
        mf8.A01.clear();
        C324716zm.A01((C59721JVf) null);
    }
}
