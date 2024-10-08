package X;

import androidx.compose.ui.unit.Constraints;
import java.util.List;

/* renamed from: X.I0i  reason: case insensitive filesystem */
public final class C56535I0i {
    public final C286305Uu A00;
    public final C268024cd A01;
    public final AnonymousClass5Q8 A02;
    public final C56495HzR A03 = new C56495HzR(8);

    public static C3022462f A00(C56535I0i i0i, AnonymousClass5Z4 r10, String str) {
        long A05 = AnonymousClass5SF.A05(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
        AnonymousClass5Q8 r5 = i0i.A02;
        C268024cd r4 = i0i.A01;
        C286305Uu r3 = i0i.A00;
        0sn r6 = 0sn.A00;
        return i0i.A01(new C286025Tq(r6, r6, str), r10, r3, r4, r5, r6, A05);
    }

    public C56535I0i(C286305Uu r3, C268024cd r4, AnonymousClass5Q8 r5) {
        this.A00 = r3;
        this.A01 = r4;
        this.A02 = r5;
    }

    public final C3022462f A01(C286025Tq r22, AnonymousClass5Z4 r23, C286305Uu r24, C268024cd r25, AnonymousClass5Q8 r26, List list, long j) {
        int i;
        long j2 = j;
        AnonymousClass62Y r9 = new AnonymousClass62Y(r22, r23, r24, r25, r26, list, Integer.MAX_VALUE, 1, j2, true);
        C286345Uy r4 = this.A03.A00;
        C3022462f r0 = (C3022462f) r4.A01(new C56019HrR(r9));
        if (r0 != null) {
            C3022262d r6 = r0.A03;
            if (!r6.A03.BC8()) {
                return new C3022462f(r6, r9, AnonymousClass5SF.A07(j2, C289155d7.A00((int) ((float) Math.ceil((double) r6.A01)), (int) ((float) Math.ceil((double) r6.A00)))));
            }
        }
        AnonymousClass62Z r10 = new AnonymousClass62Z(r9.A03, C291695hj.A00(r9.A04, r9.A07), r9.A05, r9.A06, r9.A08);
        long j3 = r9.A02;
        int A032 = Constraints.A03(j3);
        if (Constraints.A07(j3)) {
            i = Constraints.A01(j3);
        } else {
            i = Integer.MAX_VALUE;
        }
        if (A032 != i) {
            i = C229632nm.A03((int) ((float) Math.ceil((double) r10.BP9())), A032, i);
        }
        C3022262d r11 = new C3022262d(r10, Integer.MAX_VALUE, C288985co.A04(0, i, 0, Constraints.A00(j3)), false);
        C3022462f r2 = new C3022462f(r11, r9, AnonymousClass5SF.A07(j3, C289155d7.A00((int) ((float) Math.ceil((double) r11.A01)), (int) ((float) Math.ceil((double) r11.A00)))));
        r4.A02(new C56019HrR(r9), r2);
        return r2;
    }
}
