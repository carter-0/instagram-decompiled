package X;

/* renamed from: X.9Kh  reason: invalid class name and case insensitive filesystem */
public final class C377039Kh extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377039Kh(int i, int i2) {
        super(2);
        this.A00 = i2;
        this.A01 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int min;
        Number number = (Number) obj;
        if (this.A00 != 0) {
            int intValue = number.intValue();
            AnonymousClass51M r6 = (AnonymousClass51M) obj2;
            0qQ.A0B(r6, 1);
            AnonymousClass51R r2 = r6.A0F;
            min = Math.min(r2.A03 + ((intValue * LIC.A00(r6)) / this.A01), r2.A02);
        } else {
            int intValue2 = number.intValue();
            AnonymousClass51M r62 = (AnonymousClass51M) obj2;
            0qQ.A0B(r62, 1);
            min = (int) (((float) Math.min((intValue2 + 1) * this.A01, r62.A0B())) * r62.A00);
        }
        return Integer.valueOf(min);
    }
}
