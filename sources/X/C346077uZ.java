package X;

/* renamed from: X.7uZ  reason: invalid class name and case insensitive filesystem */
public final class C346077uZ {
    public C268654dm A00;
    public final C359218cI A01;
    public final String A02;
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A01(C346087ua.A00);

    public C346077uZ(C359218cI r2, String str) {
        0qQ.A0B(r2, 1);
        this.A01 = r2;
        this.A02 = str;
    }

    public final void A01(int i, Integer num) {
        0qQ.A0B(num, 0);
        02m r4 = 02m.A0p;
        switch (num.intValue()) {
            case 0:
            case 1:
            case 2:
            case 3:
                r4.markerAnnotate(17631244, A00(this), "cache_type", C346207um.A00(num));
                break;
            case 4:
            case 5:
                break;
            default:
                throw new RuntimeException();
        }
        r4.markerAnnotate(17631244, A00(this), "effects_count", i);
        r4.markerEnd(17631244, A00(this), 2);
    }

    public static final int A00(C346077uZ r0) {
        return ((Number) r0.A03.getValue()).intValue();
    }
}
