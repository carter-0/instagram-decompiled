package X;

/* renamed from: X.30O  reason: invalid class name */
public final class AnonymousClass30O {
    public long A00 = -1;
    public final Integer A01;

    public final long A00(AnonymousClass30Y r8, C252093oY r9, AnonymousClass2pP r10) {
        0qQ.A0B(r10, 0);
        String id = ((1Xj) r8.A03).getId();
        if (id == null) {
            return 0;
        }
        int intValue = this.A01.intValue();
        if (intValue == 0) {
            return r9.B0M(r8);
        }
        if (intValue == 1) {
            return r10.A00(id).A01(r9);
        }
        if (intValue != 2) {
            throw new RuntimeException();
        } else if (this.A00 >= 0) {
            return r9.B0M(r8) - this.A00;
        } else {
            return 0;
        }
    }

    public final void A01(AnonymousClass30Y r7, C252093oY r8, AnonymousClass2pP r9) {
        0qQ.A0B(r9, 0);
        String id = ((1Xj) r7.A03).getId();
        if (id != null && this.A00 < 0) {
            long A012 = r9.A00(id).A01(r8);
            if (A012 > 0) {
                this.A00 = r8.B0M(r7) - A012;
            }
        }
    }

    public AnonymousClass30O(Integer num) {
        this.A01 = num;
    }
}
