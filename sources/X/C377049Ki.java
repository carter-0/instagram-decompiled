package X;

/* renamed from: X.9Ki  reason: invalid class name and case insensitive filesystem */
public final class C377049Ki extends 0Yg implements 0sP {
    public final int A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377049Ki(int i, int i2) {
        super(1);
        this.A00 = i2;
        this.A01 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        switch (this.A00) {
            case 0:
                AnonymousClass51M r5 = (AnonymousClass51M) obj;
                if (r5 == null) {
                    i = 0;
                    break;
                } else {
                    i = (int) Math.ceil(((double) r5.A0B()) / ((double) this.A01));
                    break;
                }
            case 1:
                break;
            case 2:
            case 4:
                ((Number) obj).intValue();
                break;
            default:
                int intValue = ((Number) obj).intValue();
                i = 100;
                if (intValue >= 0 && intValue < this.A01) {
                    i = 1;
                    break;
                }
        }
        i = this.A01;
        return Integer.valueOf(i);
    }
}
