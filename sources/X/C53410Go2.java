package X;

import android.graphics.Path;

/* renamed from: X.Go2  reason: case insensitive filesystem */
public final class C53410Go2 extends AnonymousClass0T0 implements C59539JNl {
    public final C53418GoA A00;
    public final C53426GoI A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53410Go2) {
                C53410Go2 go2 = (C53410Go2) obj;
                if (!0qQ.A0K(this.A00, go2.A00) || !0qQ.A0K(this.A01, go2.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public C53410Go2(C53418GoA goA, C53426GoI goI) {
        this.A00 = goA;
        this.A01 = goI;
    }

    public final void AC7(Path path, I13 i13) {
        AnonymousClass7TG.A1N(path, i13);
        C53418GoA goA = this.A00;
        C53426GoI goI = this.A01;
        Path A002 = i13.A00(goA, goI);
        i13.A01(goI, new TY5(A002, 45));
        path.addPath(A002);
    }
}
