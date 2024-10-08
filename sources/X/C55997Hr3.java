package X;

import androidx.compose.ui.unit.Constraints;
import java.util.List;

/* renamed from: X.Hr3  reason: case insensitive filesystem */
public final class C55997Hr3 {
    public static C55997Hr3 A07;
    public float A00 = Float.NaN;
    public float A01 = Float.NaN;
    public final AnonymousClass5Z4 A02;
    public final C286305Uu A03;
    public final C268024cd A04;
    public final AnonymousClass5Q8 A05;
    public final AnonymousClass5Z4 A06;

    public final long A00(long j, int i) {
        int A022;
        int i2 = i;
        float f = this.A01;
        float f2 = this.A00;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            String str = C55372Hge.A00;
            AnonymousClass5Z4 r5 = this.A06;
            long A052 = AnonymousClass5SF.A05(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
            C268024cd r7 = this.A04;
            C286305Uu r6 = this.A03;
            List list = 0sn.A00;
            f = new C292045iJ(new C291835hx(r5, r6, r7, str, list, list), 1, A052, false).BCs();
            String str2 = C55372Hge.A01;
            f2 = new C292045iJ(new C291835hx(r5, r6, r7, str2, list, list), 2, AnonymousClass5SF.A05(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE), false).BCs() - f;
            this.A01 = f;
            this.A00 = f2;
        }
        if (i2 != 1) {
            int round = Math.round(f + (f2 * ((float) (i - 1))));
            A022 = C51970G9q.A07(round, round);
            int A002 = Constraints.A00(j);
            if (A022 > A002) {
                A022 = A002;
            }
        } else {
            A022 = Constraints.A02(j);
        }
        return AnonymousClass5SF.A04(Constraints.A03(j), Constraints.A01(j), A022, Constraints.A00(j));
    }

    public C55997Hr3(AnonymousClass5Z4 r2, C286305Uu r3, C268024cd r4, AnonymousClass5Q8 r5) {
        this.A05 = r5;
        this.A02 = r2;
        this.A04 = r4;
        this.A03 = r3;
        this.A06 = C291695hj.A00(r2, r5);
    }
}
