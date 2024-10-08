package X;

/* renamed from: X.FBm  reason: case insensitive filesystem */
public final class C49886FBm {
    public Et6 A00;
    public 0xI A01;
    public 0lg A02;

    public static Et6 A00(C49886FBm fBm) {
        Et6 et6 = fBm.A00;
        if (et6 == null) {
            return new Et6();
        }
        return et6;
    }

    public static void A01(C49886FBm fBm, boolean z) {
        fBm.A05("is_account_linked", z);
        fBm.A02();
    }

    public final void A02() {
        C60510iO.A00(this.A02).EFq(this.A01);
    }

    public final void A03(String str, int i) {
        this.A01.A08(Integer.valueOf(i), str);
        synchronized (A00(this)) {
        }
    }

    public final void A04(String str, String str2) {
        this.A01.A0C(str, str2);
        synchronized (A00(this)) {
        }
    }

    public final void A05(String str, boolean z) {
        this.A01.A09(str, Boolean.valueOf(z));
        synchronized (A00(this)) {
        }
    }
}
