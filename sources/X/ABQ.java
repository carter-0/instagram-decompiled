package X;

public abstract class ABQ {
    public static boolean A00(C59796JYp jYp, AnonymousClass7IH r6, long j, long j2, boolean z) {
        int i;
        long j3 = jYp.A03;
        if (j3 < 0) {
            11Z.A02(new C41094AoG(r6, 2131976486));
            return false;
        }
        if (j3 == -2) {
            i = 2131976480;
        } else if (z && j3 < j) {
            i = 2131976485;
        } else if (j3 <= j2) {
            return true;
        } else {
            0wb.A03("Import long clip", String.valueOf(j3));
            i = 2131976484;
        }
        11Z.A02(new C41094AoG(r6, i));
        return false;
    }

    public static boolean A01(C59796JYp jYp, AnonymousClass7IH r10, boolean z, boolean z2) {
        int i;
        long j = jYp.A03;
        if (j < 0) {
            11Z.A02(new C41094AoG(r10, 2131976486));
            return false;
        }
        if (j == -2) {
            i = 2131976480;
        } else if (z && j < 500) {
            i = 2131976485;
        } else if (!z2 || j <= 600000) {
            return true;
        } else {
            0wb.A03("Import long clip", String.valueOf(j));
            i = 2131976484;
        }
        11Z.A02(new C41094AoG(r10, i));
        return false;
    }
}
