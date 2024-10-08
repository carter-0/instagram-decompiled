package X;

public final class GY0 extends 0Yg implements 0sP {
    public final float A00;
    public final float A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GY0(int i, float f, float f2) {
        super(1);
        this.A02 = i;
        switch (i) {
            case 0:
            case 1:
            case 7:
                this.A00 = f;
                this.A01 = f2;
                break;
            default:
                this.A01 = f;
                this.A00 = f2;
                break;
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        float f;
        if (7 - this.A02 != 0) {
            throw AnonymousClass7TE.A11("setName");
        }
        if (AnonymousClass7TE.A1a(obj)) {
            f = this.A00;
        } else {
            f = this.A01;
        }
        return Float.valueOf(f);
    }
}
