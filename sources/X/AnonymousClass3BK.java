package X;

/* renamed from: X.3BK  reason: invalid class name */
public final class AnonymousClass3BK {
    public Long A00;
    public Long A01;
    public boolean A02;
    public boolean A03;
    public final 0xa A04;
    public final C62320sa A05;
    public final AnonymousClass3BL A06;
    public final AnonymousClass0t1 A07;

    public AnonymousClass3BK(0xa r2, AnonymousClass3BL r3, AnonymousClass0t1 r4, C62320sa r5) {
        0qQ.A0B(r4, 1);
        0qQ.A0B(r2, 2);
        0qQ.A0B(r5, 4);
        this.A07 = r4;
        this.A04 = r2;
        this.A06 = r3;
        this.A05 = r5;
    }

    public final long A00() {
        Long l = this.A00;
        if (l == null || !A01()) {
            return 300;
        }
        return l.longValue() - ((Number) this.A05.invoke()).longValue();
    }

    public final boolean A01() {
        Long l = this.A00;
        if (l != null) {
            if (((Number) this.A05.invoke()).longValue() > l.longValue()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean A02(C255773uh r3) {
        if (!0qQ.A0K(r3.A0k, "election:rollcall_v2") || this.A03) {
            return false;
        }
        return true;
    }
}
