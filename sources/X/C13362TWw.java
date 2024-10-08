package X;

import java.util.Map;

/* renamed from: X.TWw  reason: case insensitive filesystem */
public final class C13362TWw extends 0Yg implements 0sP {
    public static final C13362TWw A00 = new C13362TWw();

    public C13362TWw() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        StringBuilder A0l = C51975G9x.A0l(entry);
        A0l.append("|    ");
        Pxg.A1S(A0l, entry);
        A0l.append(" = ");
        return AnonymousClass7TF.A0i(entry.getValue(), A0l);
    }
}
