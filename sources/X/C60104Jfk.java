package X;

import android.app.Application;

/* renamed from: X.Jfk  reason: case insensitive filesystem */
public final class C60104Jfk extends C361478gI {
    public SOK A00 = SOK.A01("InstallViewModel");
    public Boolean A01;
    public boolean A02;
    public final 2Fk A03;
    public final 2Fk A04;
    public final 2Fk A05;
    public final 2Fk A06;
    public final 2Fk A07;
    public final RRG A08;
    public final C13712Tfa A09;
    public final Integer A0A;
    public final 0V2 A0B;
    public final C63889LAs A0C;
    public final LCW A0D;
    public final AnonymousClass0r6 A0E;
    public final AnonymousClass0r6 A0F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60104Jfk(Application application, RRG rrg, C13712Tfa tfa) {
        super(application);
        0qQ.A0B(application, 1);
        AnonymousClass7TF.A1C(rrg, 2, tfa);
        this.A08 = rrg;
        this.A09 = tfa;
        C63889LAs lAs = new C63889LAs(A0D(), rrg, tfa);
        this.A0C = lAs;
        LCW lcw = new LCW(application);
        this.A0D = lcw;
        AnonymousClass0r6 r2 = lcw.A01;
        19B r3 = 19B.A00;
        this.A04 = C226292g8.A00(r3, r2);
        this.A0A = lAs.A02;
        AnonymousClass0r6 r1 = lAs.A03;
        this.A07 = C226292g8.A00(r3, MCA.A00(this, r1, 5));
        this.A06 = C226292g8.A00(r3, r1);
        AnonymousClass0r6 A012 = AnonymousClass11E.A01(new C62160rj(new C66194MHk((Object) this, (AnonymousClass4D7) null, 2), C66193MHj.A01(r2, r1, 1)));
        this.A0F = A012;
        this.A05 = C226292g8.A00(r3, A012);
        05D A013 = 10D.A01(AnonymousClass05K.A0C, 10, 10);
        this.A0B = A013;
        AnonymousClass0r6 A014 = AnonymousClass11E.A01(A013);
        this.A0E = A014;
        this.A03 = C226292g8.A00(r3, A014);
    }

    public static final void A00(C60104Jfk jfk, C13941Tln tln, boolean z) {
        jfk.A01 = Boolean.valueOf(z);
        SOK sok = jfk.A00;
        C11000S4u s4u = ((C12172SoN) tln).A00;
        s4u.A03.A00(new C13020TIc(sok, s4u, z));
    }

    public final void A0E(L7Y l7y) {
        MHD.A00(l7y, this, C318116oQ.A00(this), 3);
    }
}
