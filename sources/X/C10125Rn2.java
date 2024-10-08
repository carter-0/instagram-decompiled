package X;

import com.google.common.collect.ImmutableMap;
import java.util.Map;

/* renamed from: X.Rn2  reason: case insensitive filesystem */
public abstract class C10125Rn2 {
    public static final AnonymousClass2hV A00 = DGW.A00;
    public static final AnonymousClass2hV A01 = DGX.A00;
    public static final AnonymousClass2hV A02 = DGY.A00;
    public static final Map A03;

    static {
        ImmutableMap.Builder A0Q = Pxf.A0Q();
        A0Q.put(C21268XRn.A02, REG.CREDIT_CARD);
        A0Q.put(C21268XRn.A07, REG.PAYPAL);
        A0Q.put(C21268XRn.A03, REG.DIRECT_DEBIT);
        ImmutableMap A0Z = Pxe.A0Z(A0Q, C21268XRn.A08, REG.SHOP_PAY);
        0qQ.A07(A0Z);
        A03 = A0Z;
    }
}
