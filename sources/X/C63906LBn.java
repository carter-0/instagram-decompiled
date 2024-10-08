package X;

/* renamed from: X.LBn  reason: case insensitive filesystem */
public final class C63906LBn {
    public final C63828L8j A00 = new C63828L8j(this);

    public final 0V2 A00(C62448Kfy kfy) {
        C63751L5j l5j;
        int A02 = DbU.A02(kfy, 0);
        if (A02 == 1) {
            l5j = this.A00.A02;
        } else if (A02 == 2) {
            l5j = this.A00.A01;
        } else {
            throw AnonymousClass7TE.A0w("invalid load type for hints");
        }
        return l5j.A01;
    }
}
