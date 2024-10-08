package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.SOh  reason: case insensitive filesystem */
public final class C11348SOh {
    public C11180SEg A00;
    public C62637KjI A01;
    public C11181SEh A02;
    public S16 A03;
    public C10543Rtx A04;
    public String A05;
    public String A06;
    public Map A07;
    public boolean A08 = true;
    public boolean A09 = true;

    public C11348SOh(C62637KjI kjI) {
        0qQ.A0B(kjI, 1);
        A00(this);
        this.A01 = kjI;
    }

    public static void A00(C11348SOh sOh) {
        sOh.A01 = C62637KjI.A0K;
        sOh.A07 = new HashMap();
        C11181SEh sEh = new C11181SEh();
        sOh.A02 = sEh;
        sOh.A04 = new C10543Rtx(sEh);
        C11180SEg sEg = new C11180SEg(0, false);
        sOh.A00 = sEg;
        sOh.A03 = new S16(sEg);
    }

    public final void A01(C11180SEg sEg) {
        this.A00 = sEg;
        this.A03 = new S16(sEg);
    }

    public final void A02(C11181SEh sEh) {
        this.A02 = sEh;
        this.A04 = new C10543Rtx(sEh);
    }

    public C11348SOh() {
        A00(this);
    }
}
