package X;

/* renamed from: X.Mah  reason: case insensitive filesystem */
public final class C66674Mah implements C74417PuX {
    public C74417PuX A00;
    public final C74551Pwk A01;

    public final void DEJ(C270214gN r3, Integer num) {
        C74551Pwk pwk = this.A01;
        C3265677h.A0Z(pwk.B3j(), num);
        pwk.DTM(r3, (String) null);
        C74417PuX puX = this.A00;
        if (puX != null) {
            puX.DEJ(r3, num);
        }
    }

    public final void Dop(C74353PtT ptT, Integer num) {
        String str;
        C74551Pwk pwk = this.A01;
        C3265677h.A0a(pwk.BsS(), num);
        try {
            str = ptT.BJR();
        } catch (Exception unused) {
            0wj.A00("Item ID doesn't exist in Send Callback", 20134884, true).report();
            str = null;
        }
        pwk.DTM((C270214gN) null, str);
        C74417PuX puX = this.A00;
        if (puX != null) {
            puX.Dop(ptT, num);
        }
    }

    public C66674Mah(C74551Pwk pwk, C74417PuX puX) {
        this.A01 = pwk;
        this.A00 = puX;
    }
}
