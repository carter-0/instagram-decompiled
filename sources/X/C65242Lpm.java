package X;

/* renamed from: X.Lpm  reason: case insensitive filesystem */
public final class C65242Lpm implements C363658k8 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C65242Lpm(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj3;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final /* synthetic */ void Dcq() {
        if (1 - this.A00 == 0) {
            C61149Jy0 jy0 = (C61149Jy0) this.A01;
            C311296cS.A03((C255773uh) this.A02, jy0, (C311296cS) this.A03);
        }
    }

    public final void Dcr() {
        switch (this.A00) {
            case 0:
                Object obj = this.A02;
                Object obj2 = this.A01;
                AnonymousClass7TE.A1Z(new MHJ(obj, obj2, (AnonymousClass4D7) null, 7), ((C61438K7n) this.A03).A0K);
                return;
            case 1:
                C311296cS r2 = (C311296cS) this.A03;
                C299955wH.A00(r2.A07).A01((C295035nS) null);
                C311296cS.A03((C255773uh) this.A02, (C61149Jy0) this.A01, r2);
                return;
            default:
                C255773uh r1 = (C255773uh) this.A02;
                AnonymousClass7TF.A0D().postDelayed(new M9K((AnonymousClass818) this.A01, r1, (C311296cS) this.A03), 500);
                return;
        }
    }
}
