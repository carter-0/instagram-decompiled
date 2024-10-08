package X;

public abstract class RhB {
    public static final Object A00(C307896Rx r10, AnonymousClass6Tm r11) {
        Integer num;
        String A0g = DbY.A0g(r11);
        boolean A01 = Q0A.A01(r11.A02());
        int A04 = DbW.A04(r11.A00(), "null cannot be cast to non-null type kotlin.Number");
        1Ng A00 = AnonymousClass1Nd.A00(DbW.A0R(r10));
        Integer valueOf = Integer.valueOf(A04);
        Integer[] A002 = AnonymousClass05K.A00(4);
        int length = A002.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                num = AnonymousClass05K.A00;
                break;
            }
            num = A002[i];
            int A003 = C9758RgG.A00(num);
            if (valueOf != null && A003 == A04) {
                break;
            }
            i++;
        }
        Pxi.A1F(A00, num, A0g, A01);
        return null;
    }
}
