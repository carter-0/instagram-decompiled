package X;

/* renamed from: X.IoT  reason: case insensitive filesystem */
public final class C58225IoT extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58225IoT(Object obj, Object obj2, Object obj3, Object obj4, String str, String str2, int i) {
        super(0);
        this.A00 = i;
        this.A04 = obj;
        this.A06 = str;
        this.A02 = obj2;
        this.A01 = obj3;
        this.A05 = str2;
        this.A03 = obj4;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                AnonymousClass325.A02((AnonymousClass325) this.A04);
                1Xj r2 = (1Xj) this.A03;
                String str = this.A05;
                if (r2.A5D()) {
                    0qQ.A0A(r2.A1f(str));
                }
                ((JQL) this.A02).DeI();
                break;
            case 1:
                0lg r3 = (0lg) this.A04;
                0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r3), AnonymousClass000.A00(2560));
                if (A0e.isSampled()) {
                    DbS.A1N(A0e, this.A06);
                    A0e.A7p("is_short_copy", AnonymousClass7TE.A0u());
                    A0e.Cgf();
                }
                ((C49726F3q) this.A02).A03(new C58210IoE(this.A01, r3, this.A03, this.A05, 20));
                break;
            default:
                C56140HtS htS = (C56140HtS) this.A04;
                Object obj = new Object();
                I4X i4x = (I4X) this.A01;
                htS.A02.A02((C49719F3f) this.A03, obj, J6R.A00(this.A02, i4x, 2));
                htS.A04.addLast(new C56109Hsw(i4x, this.A06, this.A05));
                break;
        }
        return C60340gF.A00;
    }
}
