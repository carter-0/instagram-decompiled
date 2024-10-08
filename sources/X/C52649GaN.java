package X;

/* renamed from: X.GaN  reason: case insensitive filesystem */
public final class C52649GaN extends 0Yg implements C62320sa {
    public final int A00;
    public final boolean A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52649GaN(boolean z, int i) {
        super(0);
        this.A00 = i;
        this.A01 = z;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 1:
                int i = 0;
                if (this.A01) {
                    i = 60;
                }
                return C51965G9l.A0T((float) i);
            case 4:
                return C51970G9q.A0S(Boolean.valueOf(this.A01));
            case 6:
            case 8:
                int i2 = 0;
                if (this.A01) {
                    i2 = 12;
                }
                return Integer.valueOf(i2);
            default:
                return Boolean.valueOf(this.A01);
        }
    }
}
