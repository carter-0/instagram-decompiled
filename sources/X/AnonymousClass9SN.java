package X;

/* renamed from: X.9SN  reason: invalid class name */
public final class AnonymousClass9SN extends C344317rf implements AnonymousClass9Tp {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public C341067mH A06;
    public A3O A07;
    public boolean A08;
    public boolean A09 = false;
    public C344477rv A0A;
    public final C344407ro A0B = new C344407ro();
    public final Runnable A0C = new C379329Tk(this);
    public final C346267ut A0D = new C40149ATp(this, 1);
    public volatile C341147mP A0E;
    public volatile C346027uT A0F;

    public static C344477rv A00(AnonymousClass9SN r1) {
        C344477rv r0 = r1.A0A;
        if (r0 != null) {
            return r0;
        }
        C344477rv r02 = (C344477rv) r1.A0A(C344477rv.A01);
        r1.A0A = r02;
        return r02;
    }

    public static void A01(AnonymousClass9SN r5) {
        C345047sq r3 = new C345047sq();
        C341067mH r2 = r5.A06;
        if (r2 == null) {
            boolean z = false;
            Object Apu = r5.A00.Apu(C343737qi.A08);
            if (Apu != null) {
                z = Apu;
            }
            r2 = new C378839Rk(!AnonymousClass7TE.A1a(z));
            r5.A06 = r2;
        }
        r5.A07 = new A3O(r2, r5.A0D, r3);
        C344697sH BQ8 = A00(r5).BQ8();
        C344407ro r22 = r5.A0B;
        C346247ur r1 = r5.A07.A00;
        r1.getClass();
        BQ8.EZt(new C346277uu(r22, r1, false), 0);
    }

    public static void A03(AnonymousClass9SN r11) {
        int i;
        int i2;
        if (r11.A02 % 180 != 0) {
            i = r11.A01;
            i2 = r11.A03;
        } else {
            i = r11.A03;
            i2 = r11.A01;
        }
        int i3 = r11.A05;
        int i4 = r11.A04;
        C341067mH r0 = r11.A06;
        if (r0 != null) {
            r0.EU1(i, i2);
        }
        A3O a3o = r11.A07;
        if (a3o != null) {
            a3o.A00.FKc(i, i2, i, i2, 0, 0, r11.A00, false);
        }
        C346027uT r02 = r11.A0F;
        if (r02 != null) {
            r02.A06 = 0;
        }
        A00(r11).FLA(0, i, i2, false, i3, i4);
    }

    public final C343717qg BJt() {
        return AnonymousClass9Tp.A00;
    }

    public AnonymousClass9SN(C343837qt r3) {
        super(r3);
    }
}
