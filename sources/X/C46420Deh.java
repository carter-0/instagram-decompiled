package X;

/* renamed from: X.Deh  reason: case insensitive filesystem */
public final class C46420Deh implements C360008dq {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C46420Deh(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void DfA(C360018dr r5) {
        if (this.A00 != 0) {
            0qQ.A0B(r5, 0);
            ((G6F) this.A01).onResult(r5);
            ((C359978dn) this.A02).EEE(this);
            return;
        }
        C46583DhP dhP = (C46583DhP) this.A01;
        if (dhP.A0A.getAndSet(r5) != r5) {
            G8K g8k = dhP.A00;
            if (g8k != null && (r5 instanceof C385529j5)) {
                g8k.AAI("action_load_step");
            }
            try {
                dhP.A09.set(r5.A00);
                dhP.A08.set(dhP.A06.now());
            } finally {
                ((C360008dq) this.A02).DfA(r5);
            }
        }
    }
}
