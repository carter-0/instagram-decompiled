package X;

public final class WNM implements C267664bz {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C18072Vl0 A01;
    public final /* synthetic */ C14437TwL A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public WNM(C18072Vl0 vl0, C14437TwL twL, String str, String str2, String str3, String str4, int i) {
        this.A05 = str;
        this.A04 = str2;
        this.A02 = twL;
        this.A03 = str3;
        this.A06 = str4;
        this.A00 = i;
        this.A01 = vl0;
    }

    public final void A8T(0xI r5) {
        0qQ.A0B(r5, 0);
        C13989Tnp.A1O(r5, this.A05, this.A04, this.A02.A07);
        String str = this.A03;
        String str2 = this.A06;
        int i = this.A00;
        r5.A0C("search_tab", str);
        r5.A0C("selected_type", str2);
        r5.A08(Integer.valueOf(i), "position");
        C18072Vl0 vl0 = this.A01;
        if (vl0 != null) {
            r5.A04(C18217Vnh.A01(vl0.A00()).A00());
        }
    }
}
