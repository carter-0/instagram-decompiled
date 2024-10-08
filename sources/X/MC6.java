package X;

public final class MC6 implements AnonymousClass0r6 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public MC6(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
        this.A03 = str;
    }

    public final Object collect(02o r6, AnonymousClass4D7 r7) {
        AnonymousClass0r6 r4;
        02o fxF;
        if (this.A00 != 0) {
            r4 = (AnonymousClass0r6) this.A01;
            fxF = new MCl(42, this.A02, (Object) r6);
        } else {
            r4 = (AnonymousClass0r6) this.A02;
            fxF = new C51626FxF(r6, this.A01, this.A03, 3);
        }
        return AnonymousClass7TG.A0i(r7, r4, fxF);
    }
}
