package X;

import android.content.Context;

/* renamed from: X.LAs  reason: case insensitive filesystem */
public final class C63889LAs {
    public final C13712Tfa A00;
    public final C11000S4u A01;
    public final Integer A02;
    public final AnonymousClass0r6 A03;
    public final 2Fk A04;
    public final RRG A05;
    public final C63577KzQ A06;
    public final C10949S2h A07;
    public final AnonymousClass0r6 A08;

    public C63889LAs(Context context, RRG rrg, C13712Tfa tfa) {
        C11000S4u s4u;
        0rr r1;
        this.A05 = rrg;
        this.A00 = tfa;
        C63577KzQ kzQ = new C63577KzQ(context);
        this.A06 = kzQ;
        new S1A(tfa).A00(new C13019TIb(rrg, kzQ, tfa));
        C10949S2h s2h = new C10949S2h(kzQ.A00, rrg, tfa);
        this.A07 = s2h;
        Integer A002 = s2h.A00();
        0qQ.A07(A002);
        this.A02 = A002;
        Integer A003 = s2h.A00();
        Integer num = AnonymousClass05K.A01;
        if (A003 == num) {
            s4u = new C11000S4u(s2h.A00, s2h.A01, s2h.A02);
        } else {
            s4u = null;
        }
        this.A01 = s4u;
        C62160rj r12 = new C62160rj(new C66194MHk((Object) this, (AnonymousClass4D7) null, 1), AnonymousClass0Zq.A00(new MHD((Object) this, (AnonymousClass4D7) null, 2)));
        this.A03 = r12;
        if (A002 != num) {
            r1 = new 0rr(AnonymousClass7TE.A0u());
        } else {
            r1 = new C62130rc(MC9.A00(r12, 5));
        }
        this.A08 = r1;
        this.A04 = DbT.A0G(r1);
    }
}
