package X;

/* renamed from: X.IzF  reason: case insensitive filesystem */
public final class C58890IzF extends 0Yg implements 0sP {
    public static final C58890IzF A00 = new C58890IzF();

    public C58890IzF() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        I77 i77 = (I77) obj;
        C3022462f r3 = i77.A06;
        if (r3 == null) {
            return null;
        }
        JS3 js3 = i77.A07;
        int FHr = js3.FHr(r3.A03(r3.A03.A06(js3.E1S(C285965Tk.A01(i77.A00)))));
        if (Integer.valueOf(FHr) != null) {
            return new C56891IGm(C51968G9o.A02(i77.A00) - FHr, 0);
        }
        return null;
    }
}
