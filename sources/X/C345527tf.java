package X;

/* renamed from: X.7tf  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C345527tf implements C345537tg {
    public final /* synthetic */ C345517te A00;

    public /* synthetic */ C345527tf(C345517te r1) {
        this.A00 = r1;
    }

    public final void DQO(Long l) {
        C345517te r2 = this.A00;
        synchronized (r2) {
            if (!r2.A01) {
                r2.A01 = true;
                C343937r3 r1 = C343927r2.A00;
                ((C343897qz) ((C343927r2) r2.A00.Apf(r1))).A00.post(new C365298mr(r2));
            }
        }
    }
}
