package X;

/* renamed from: X.FhM  reason: case insensitive filesystem */
public final class C50721FhM implements AnonymousClass5IX {
    public final Long A00;
    public final Long A01;

    public final boolean E1z(AnonymousClass5IY r10) {
        Long l;
        int i;
        Long l2 = this.A00;
        if (l2 == null || (l = this.A01) == null) {
            return false;
        }
        long A0P = AnonymousClass7TE.A0P(System.currentTimeMillis() - C280074zx.A00());
        long longValue = l2.longValue();
        long longValue2 = l.longValue();
        if (longValue > longValue2) {
            if (A0P < longValue) {
                i = (A0P > longValue2 ? 1 : (A0P == longValue2 ? 0 : -1));
            }
            return true;
        } else if (A0P > longValue2) {
            return false;
        } else {
            i = (longValue > A0P ? 1 : (longValue == A0P ? 0 : -1));
        }
        if (i <= 0) {
            return true;
        }
        return false;
    }

    public C50721FhM(Long l, Long l2) {
        this.A00 = l;
        this.A01 = l2;
    }
}
