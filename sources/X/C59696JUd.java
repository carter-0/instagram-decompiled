package X;

import java.util.ArrayList;

/* renamed from: X.JUd  reason: case insensitive filesystem */
public final class C59696JUd implements AnonymousClass1FD {
    public static final C59696JUd A00 = new C59696JUd();

    public final /* bridge */ /* synthetic */ Object invoke(16F r4) {
        ArrayList A0q = AnonymousClass7TF.A0q(r4, 0);
        if (r4.A11() == 16L.A0C) {
            while (r4.A1J() != 16L.A08) {
                X5I parseFromJson = W3F.parseFromJson(r4);
                if (parseFromJson != null) {
                    A0q.add(parseFromJson);
                }
            }
        }
        return A0q;
    }
}
