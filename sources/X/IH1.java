package X;

public final class IH1 implements C59648JRq {
    public final AnonymousClass5ZB A00;
    public final C55613HkY A01;
    public final C55613HkY A02;

    /* JADX INFO: finally extract failed */
    public final C56072HsL AV6(C286025Tq r8) {
        C55613HkY hkY;
        0qQ.A0B(r8, 0);
        int i = 0;
        boolean A1Q = AnonymousClass7TF.A1Q(r8.length());
        C303876Bd A0b = C51969G9p.A0b();
        C55613HkY hkY2 = this.A02;
        int A002 = A0b.A00(hkY2.A00);
        try {
            String str = hkY2.A01;
            A0b.A09(str);
            A0b.A04(A002);
            A002 = A0b.A00(this.A00);
            A0b.A05(r8);
            A0b.A04(A002);
            if (A1Q && (hkY = this.A01) != null) {
                A002 = A0b.A00(hkY.A00);
                A0b.A09(hkY.A01);
                A0b.A04(A002);
            }
            C286025Tq A022 = A0b.A02();
            int length = str.length();
            C55613HkY hkY3 = this.A01;
            if (hkY3 != null) {
                i = hkY3.A01.length();
            }
            return new C56072HsL(A022, new C56902IGx(A1Q, length, i));
        } catch (Throwable th) {
            A0b.A04(A002);
            throw th;
        }
    }

    public IH1(AnonymousClass5ZB r1, C55613HkY hkY, C55613HkY hkY2) {
        this.A02 = hkY;
        this.A01 = hkY2;
        this.A00 = r1;
    }
}
