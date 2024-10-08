package X;

/* renamed from: X.OmV  reason: case insensitive filesystem */
public final class C71534OmV implements C74290PsI {
    public final /* synthetic */ 1a8 A00;
    public final /* synthetic */ OO6 A01;
    public final /* synthetic */ P12 A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ 0sP A05;

    public C71534OmV(1a8 r1, OO6 oo6, P12 p12, Integer num, Integer num2, 0sP r6) {
        this.A02 = p12;
        this.A04 = num;
        this.A03 = num2;
        this.A01 = oo6;
        this.A00 = r1;
        this.A05 = r6;
    }

    public final /* bridge */ /* synthetic */ void run(Object obj) {
        String str;
        if (DbX.A1a(obj)) {
            P12 p12 = this.A02;
            Integer num = this.A04;
            Integer num2 = this.A03;
            OO6 oo6 = this.A01;
            1a8 r3 = this.A00;
            PU8.A00(oo6.A04(r3, num2), r3, new C72306P0x(C69901Nu3.A00(p12.A00, num), num, this.A05), 3);
            return;
        }
        this.A05.invoke(C68716NUc.A00);
        AnonymousClass0eM r4 = this.A02.A01;
        C66913Mex A0U = C66580MXl.A0U(r4);
        Integer num3 = this.A03;
        A0U.A09();
        if (num3 == AnonymousClass05K.A00) {
            str = "YES";
        } else {
            str = "NO";
        }
        A0U.A0D("IS_V3_IMPLICIT_BACKUP", str);
        A0U.A0D("CALLSITE", C69892Ntu.A00(num3));
        C66913Mex A0U2 = C66580MXl.A0U(r4);
        A0U2.A0D("IS_BLOCKSTORE_E2EE_ENABLED", "NO");
        A0U2.A07();
    }
}
