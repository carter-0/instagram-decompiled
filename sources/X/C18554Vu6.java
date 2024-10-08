package X;

/* renamed from: X.Vu6  reason: case insensitive filesystem */
public final class C18554Vu6 {
    public static final C18554Vu6 A02 = new C18554Vu6(AnonymousClass05K.A00, 0.0f);
    public static final C18554Vu6 A03 = new C18554Vu6(AnonymousClass05K.A01, 0.0f);
    public final float A00;
    public final Integer A01;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.A00);
        sb.append(' ');
        switch (this.A01.intValue()) {
            case 0:
                str = "UNSET";
                break;
            case 1:
                str = "PIXEL";
                break;
            default:
                str = "DP";
                break;
        }
        return AnonymousClass7TF.A0l(str, sb);
    }

    public C18554Vu6(Integer num, float f) {
        this.A01 = num;
        this.A00 = f;
    }
}
