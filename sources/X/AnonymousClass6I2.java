package X;

import java.util.LinkedHashMap;

/* renamed from: X.6I2  reason: invalid class name */
public final class AnonymousClass6I2 extends 0Yg implements 0sL {
    public static final AnonymousClass6I2 A00 = new AnonymousClass6I2();

    public AnonymousClass6I2() {
        super(2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        AnonymousClass6I1 r5 = (AnonymousClass6I1) obj2;
        LinkedHashMap A03 = 0Yt.A03(r5.A02);
        for (AnonymousClass6JC A002 : r5.A01.values()) {
            A002.A00(A03);
        }
        if (A03.isEmpty()) {
            return null;
        }
        return A03;
    }
}
