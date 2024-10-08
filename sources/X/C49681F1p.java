package X;

/* renamed from: X.F1p  reason: case insensitive filesystem */
public final class C49681F1p {
    public final /* synthetic */ ESU A00;

    public final void A00(String str, String str2, String str3) {
        ESU esu = this.A00;
        EQW eqw = new EQW(esu.A01, this, str2, str, str3);
        FCT.A02(esu.A02, "notifications", 002.A0R(str2, "_setting_changed"));
        esu.A04.A01(str2, str, "radio");
        1OC A01 = F7X.A01(esu.A02, str2, str);
        A01.A00 = eqw;
        esu.schedule(A01);
    }

    public C49681F1p(ESU esu) {
        this.A00 = esu;
    }
}
