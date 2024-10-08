package X;

/* renamed from: X.7f2  reason: invalid class name and case insensitive filesystem */
public abstract class C336697f2 {
    public final C337547gW A00;
    public final boolean A01;
    public final boolean A02;

    public C337497gR A00() {
        C336687f1 r2 = (C336687f1) this;
        C337487gQ r1 = new C337487gQ();
        r1.A01 = r2.A00;
        r1.A02 = r2.A01;
        return r1;
    }

    public /* synthetic */ C336697f2(2V1 r29, AnonymousClass3X7 r30, int i, int i2, boolean z, boolean z2, boolean z3) {
        boolean z4;
        boolean z5 = z2;
        int i3 = i2;
        boolean z6 = z;
        2V1 r6 = r29;
        if ((i2 & 32) != 0) {
            z4 = r6.A02.A01.A0M;
        } else {
            z4 = false;
        }
        z6 = (i3 & 128) != 0 ? false : z6;
        z5 = (i3 & 256) != 0 ? false : z5;
        this.A01 = z6;
        C337497gR A002 = A00();
        int i4 = i;
        A002.E1Q(i4);
        A002.EB4(new C337507gS(new C338087hO(2Sa.A03(r6.A02.A01, r30, (2Sd) null, (Integer) null, (Integer) null, -161, 15, false, false, false, false, z4, false, false, false, false, false, false, false, false, false), (C338587iC) null, Boolean.valueOf(z3), (Integer) null, 2.0f, 0, 0, false, false, false, false, false, z5)));
        this.A00 = A002.AEH();
        this.A02 = i4 != 1 ? false : true;
    }
}
