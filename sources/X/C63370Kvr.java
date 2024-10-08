package X;

/* renamed from: X.Kvr  reason: case insensitive filesystem */
public abstract class C63370Kvr {
    public static final Integer A00(AnonymousClass3QD r3, boolean z) {
        int ordinal = r3.ordinal();
        if (ordinal != 2) {
            if (ordinal != 5) {
                if (ordinal == 6) {
                    return AnonymousClass05K.A0C;
                }
                0wb.A03("wrong_endpoint_map", 002.A0G(r3.name(), ':', ordinal));
                return AnonymousClass05K.A0C;
            }
        } else if (z) {
            return AnonymousClass05K.A00;
        }
        return AnonymousClass05K.A01;
    }
}
