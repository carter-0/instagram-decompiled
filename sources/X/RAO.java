package X;

import android.content.Context;

public final class RAO extends 0ng {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ 19f A01;
    public final /* synthetic */ AnonymousClass0aP A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RAO(Context context, 19f r6, AnonymousClass0aP r7) {
        super(215, 4, false, true);
        this.A02 = r7;
        this.A01 = r6;
        this.A00 = context;
    }

    public final void run() {
        C60820jg r0 = 0jh.A04;
        AnonymousClass0aP r2 = this.A02;
        String A022 = r0.A01(r2).A02(this.A01);
        if (A022 != null) {
            Ri2.A00(this.A00, r2, A022);
            return;
        }
        Context context = this.A00;
        C12757T5r t5r = C12757T5r.A00;
        String A012 = 1Q0.A01();
        0qQ.A0B(t5r, 2);
        0xB r3 = new 0xB(context, t5r, A012, 604800);
        r3.A02(new C12189Soe(context, r3, r2), r2);
    }
}
