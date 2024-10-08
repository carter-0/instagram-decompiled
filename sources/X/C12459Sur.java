package X;

/* renamed from: X.Sur  reason: case insensitive filesystem */
public final class C12459Sur implements C13735Tg7 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;

    public C12459Sur(1MD r1, AnonymousClass2gB r2, C10440RsH rsH, SSY ssy, Object obj, String str, int i) {
        this.A00 = i;
        this.A01 = ssy;
        this.A06 = str;
        if (i != 0) {
            this.A03 = r1;
            this.A04 = obj;
            this.A05 = r2;
            this.A02 = rsH;
        } else {
            this.A02 = r1;
            this.A04 = obj;
            this.A05 = r2;
            this.A03 = rsH;
        }
    }

    public final void Cwz(Throwable th) {
        ((2Fk) this.A05).A0A(SUj.A0B(th));
    }

    public final void Cx0(C10586Rug rug) {
        1MD r0;
        Object obj;
        AnonymousClass2gB r1;
        Object obj2;
        int i = this.A00;
        SSY ssy = (SSY) this.A01;
        String str = this.A06;
        if (i != 0) {
            r0 = (1MD) this.A03;
            obj = this.A04;
            r1 = (AnonymousClass2gB) this.A05;
            obj2 = this.A02;
        } else {
            r0 = (1MD) this.A02;
            obj = this.A04;
            r1 = (AnonymousClass2gB) this.A05;
            obj2 = this.A03;
        }
        SSY.A00(r0, r1, (C10440RsH) obj2, rug, ssy, obj, str);
    }
}
