package X;

import java.util.Map;

/* renamed from: X.SoY  reason: case insensitive filesystem */
public final class C12183SoY implements C13817Thl {
    public int A00;
    public final int A01;

    public final long B2S() {
        return 0;
    }

    public final boolean AJl() {
        return AnonymousClass7TF.A1R(this.A00);
    }

    public final C13817Thl AKi() {
        return new C12183SoY(this.A01);
    }

    public final Map BOA() {
        return DbY.A0p(RH0.A0J.A00, String.valueOf((this.A01 - this.A00) + 1), AnonymousClass7TE.A1L(RH0.A0M.A00, "simple"));
    }

    public final void EAk() {
        this.A00--;
    }

    public C12183SoY(int i) {
        this.A01 = i;
        this.A00 = i;
    }

    public C12183SoY() {
        this(3);
    }
}
