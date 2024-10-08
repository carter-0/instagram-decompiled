package X;

public final class JX4 extends AnonymousClass0T0 implements C232262tL {
    public final C357268Xf A00;

    public JX4(C357268Xf r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof JX4) && 0qQ.A0K(this.A00, ((JX4) obj).A00));
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        String str;
        C357268Xf r3 = this.A00;
        if (r3.CAp().intValue() != 0) {
            str = "REMOTE";
        } else {
            str = "SYSTEM";
        }
        return 002.A0G(str, '_', r3.BEU());
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A00);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        JX4 jx4 = (JX4) obj;
        if (jx4 == null || !0qQ.A0K(this.A00.getName(), jx4.A00.getName())) {
            return false;
        }
        return true;
    }
}
