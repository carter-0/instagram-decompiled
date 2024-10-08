package X;

/* renamed from: X.IkJ  reason: case insensitive filesystem */
public final class C58026IkJ implements AnonymousClass0r6 {
    public final int A00;
    public final Object A01;

    public C58026IkJ(AnonymousClass0r6 r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public final Object collect(02o r4, AnonymousClass4D7 r5) {
        int i;
        int i2 = this.A00;
        AnonymousClass0r6 r2 = (AnonymousClass0r6) this.A01;
        switch (i2) {
            case 0:
                i = 1;
                break;
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            default:
                i = 4;
                break;
        }
        return AnonymousClass7TG.A0i(r5, r2, new DIJ(r4, i));
    }
}
