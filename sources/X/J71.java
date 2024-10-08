package X;

public final class J71 extends 0Yg implements 0sL {
    public final int A00;
    public final boolean A01;
    public final boolean A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J71(boolean z, boolean z2, int i) {
        super(2);
        this.A00 = i;
        if (i != 0) {
            this.A02 = z;
            this.A01 = z2;
        } else {
            this.A01 = z;
            this.A02 = z2;
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i;
        Object obj3 = obj2;
        Object obj4 = obj;
        if (this.A00 != 0) {
            AnonymousClass59G r7 = (AnonymousClass59G) obj4;
            AnonymousClass59G r6 = (AnonymousClass59G) obj3;
            Number number = (Number) r7.A01;
            int intValue = number.intValue();
            Number number2 = (Number) r6.A01;
            int intValue2 = number2.intValue();
            if (!this.A02 || intValue == intValue2) {
                long parseLong = Long.parseLong((String) r7.A02);
                long parseLong2 = Long.parseLong((String) r6.A02);
                if (!this.A01 || parseLong == parseLong2) {
                    i = 0;
                } else {
                    i = (int) (parseLong2 - parseLong);
                }
            } else {
                i = number2.intValue() - number.intValue();
            }
            return Integer.valueOf(i);
        }
        C286575Wy r72 = (C286575Wy) obj4;
        if (C51968G9o.A0B(obj3) != 2 || !r72.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1665529397, "com.instagram.compose.startup.TixuUnitPrewarmer.setCompactViewLoadingShimmer.<anonymous>.<anonymous> (TixuUnitPrewarmer.kt:104)");
            }
            AnonymousClass5vX r10 = new AnonymousClass5vX((Boolean) null, AnonymousClass05K.A01, "startup", "Threads", AnonymousClass62M.A01, AnonymousClass62Q.A04(DbS.A0V(""), DbS.A0V(""), DbS.A0V("")), 0, false, this.A01, true, this.A02);
            C299645vb r9 = C299645vb.A00;
            C299685vf r8 = C299685vf.A00;
            C58324Iq5 iq5 = C58324Iq5.A00;
            C58325Iq6 iq6 = C58325Iq6.A00;
            C58977J1o j1o = C58977J1o.A00;
            C304036Bx.A00(r72, r8, r9, r10, iq5, iq6, C58326Iq7.A00, C58327Iq8.A00, j1o, C58978J1p.A00, C58979J1q.A00, C58980J1r.A00, JF2.A00, 920350128, 224694, 0, false, false, false, false);
            if (0fL.A02()) {
                0fL.A00(669438379);
            }
        } else {
            r72.Evl();
        }
        return C60340gF.A00;
    }
}
