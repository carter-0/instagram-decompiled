package X;

/* renamed from: X.IIy  reason: case insensitive filesystem */
public final class C56954IIy implements C307816Rp {
    public final /* synthetic */ 2Wa A00;
    public final /* synthetic */ GY7 A01;

    public C56954IIy(2Wa r1, GY7 gy7) {
        this.A01 = gy7;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void ASZ(C59476JLa jLa) {
        String str;
        GY7 gy7 = this.A01;
        synchronized (gy7) {
            gy7.A00.add(jLa);
        }
        2Wa r6 = this.A00;
        C59080J5n j5n = C59080J5n.A00;
        0qQ.A0B(j5n, 0);
        C251243mn r4 = r6.A02;
        String str2 = r6.A04;
        int i = r6.A00;
        boolean z = r6.A05;
        if (!r4.AFu(str2, j5n, i, z)) {
            C293775lK r1 = new C293775lK(r6, j5n);
            C251263mp r0 = r6.A01;
            if (r0 == null || (str = r0.A0J()) == null) {
                str = "hook";
            }
            r4.FKa(r1, str2, str, z);
        }
    }
}
