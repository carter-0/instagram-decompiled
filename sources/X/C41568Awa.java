package X;

/* renamed from: X.Awa  reason: case insensitive filesystem */
public final class C41568Awa extends 0Yg implements C62320sa {
    public final /* synthetic */ AnonymousClass6HJ A00;
    public final /* synthetic */ AnonymousClass5Y2 A01;
    public final /* synthetic */ C286015Tp A02;
    public final /* synthetic */ Object A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Object[] A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41568Awa(AnonymousClass6HJ r2, AnonymousClass5Y2 r3, C286015Tp r4, Object obj, String str, Object[] objArr) {
        super(0);
        this.A00 = r2;
        this.A02 = r4;
        this.A01 = r3;
        this.A04 = str;
        this.A03 = obj;
        this.A05 = objArr;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        boolean z;
        AnonymousClass6HJ r7 = this.A00;
        C286015Tp r6 = this.A02;
        AnonymousClass5Y2 r1 = this.A01;
        String str = this.A04;
        Object obj = this.A03;
        Object[] objArr = this.A05;
        boolean z2 = true;
        if (r7.A01 != r1) {
            r7.A01 = r1;
            z = true;
        } else {
            z = false;
        }
        if (!0qQ.A0K(r7.A04, str)) {
            r7.A04 = str;
        } else {
            z2 = z;
        }
        r7.A02 = r6;
        r7.A03 = obj;
        r7.A05 = objArr;
        C305556In r0 = r7.A00;
        if (r0 != null && z2) {
            r0.FIq();
            r7.A00 = null;
            AnonymousClass6HJ.A00(r7);
        }
        return C60340gF.A00;
    }
}
