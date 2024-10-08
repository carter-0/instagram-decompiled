package X;

/* renamed from: X.2m2  reason: invalid class name and case insensitive filesystem */
public final class C228642m2 extends AnonymousClass2m1 {
    public final AnonymousClass28j A00;
    public final C61410nE A01;

    public C228642m2(C61410nE r2, AnonymousClass28j r3) {
        0qQ.A0B(r2, 1);
        0qQ.A0B(r3, 2);
        this.A01 = r2;
        this.A00 = r3;
    }

    public final void Dek(AnonymousClass1GU r11) {
        0qQ.A0B(r11, 0);
        1FS r1 = r11.A00;
        AnonymousClass28j r3 = this.A00;
        long currentTimeMillis = System.currentTimeMillis();
        String obj = r1.A04.toString();
        String str = r1.A09;
        String str2 = r1.A0A;
        synchronized (r3.A01) {
            C241343Ov r12 = r3.A00;
            if (r12 != null) {
                r3.A02.add(0, r12);
            }
            r3.A00 = new C241343Ov(currentTimeMillis, obj, str, str2);
        }
    }

    public final void Dey(AnonymousClass1GU r7, 1XM r8) {
        11Z.A02(new C242563Ut(this, r8.mStatusCode, r8.A00().size(), System.currentTimeMillis()));
    }
}
