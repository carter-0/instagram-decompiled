package X;

import java.util.List;

/* renamed from: X.5SY  reason: invalid class name */
public final class AnonymousClass5SY {
    public final C63090yB A00;
    public final AnonymousClass5SV A01;

    public AnonymousClass5SY(01O r7, AnonymousClass5SX r8) {
        this.A01 = r8.A05;
        int[] iArr = AnonymousClass01R.A00;
        01Q r1 = new 01Q();
        long[] jArr = 01o.A00;
        C63090yB.A02(r1, 6);
        this.A00 = r1;
        List A08 = r8.A08(false, true);
        int size = A08.size();
        for (int i = 0; i < size; i++) {
            AnonymousClass5SX r2 = (AnonymousClass5SX) A08.get(i);
            if (r7.A04(r2.A02)) {
                this.A00.A06(r2.A02);
            }
        }
    }
}
