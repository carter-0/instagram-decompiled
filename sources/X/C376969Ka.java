package X;

/* renamed from: X.9Ka  reason: invalid class name and case insensitive filesystem */
public final class C376969Ka extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C376969Ka(Object obj, Object obj2, Object obj3, String str, AnonymousClass4D7 r6, int i) {
        super(2, r6);
        this.A01 = i;
        this.A03 = obj;
        this.A02 = obj2;
        this.A04 = obj3;
        this.A05 = str;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.9Ka, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r9) {
        Object obj2;
        Object obj3;
        Object obj4;
        String str;
        int i;
        AnonymousClass4D7 r5 = r9;
        if (this.A01 != 0) {
            obj4 = this.A04;
            str = this.A05;
            obj2 = this.A03;
            obj3 = this.A02;
            i = 1;
        } else {
            obj2 = this.A03;
            obj3 = this.A02;
            obj4 = this.A04;
            str = this.A05;
            i = 0;
        }
        return new C376969Ka(obj2, obj3, obj4, str, r5, i);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C376969Ka) create(obj, (AnonymousClass4D7) obj2)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [X.9Ka, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        0sP r1;
        Object obj2;
        if (this.A01 != 0) {
            1Hj r8 = 1Hj.A02;
            if (this.A00 != 0) {
                0eS.A00(obj);
            } else {
                0eS.A00(obj);
                String str = this.A05;
                this.A00 = 1;
                obj = ((C294705mt) this.A04).A07(str, this);
                if (obj == r8) {
                    return r8;
                }
            }
            C239803Ii r10 = (C239803Ii) obj;
            if (r10 instanceof C239793Ih) {
                r1 = (0sP) this.A03;
                if (r1 != null) {
                    obj2 = ((C239793Ih) r10).A00;
                }
            } else if (r10 instanceof C297815sO) {
                r1 = (0sP) this.A02;
                if (r1 != null) {
                    obj2 = ((C297815sO) r10).A00;
                }
            } else {
                throw new RuntimeException();
            }
            r1.invoke(obj2);
        } else {
            1Hj r82 = 1Hj.A02;
            if (this.A00 != 0) {
                0eS.A00(obj);
            } else {
                0eS.A00(obj);
                AnonymousClass07V lifecycle = ((AnonymousClass07Z) this.A03).getLifecycle();
                C66174MGl mGl = new C66174MGl(this.A04, this.A05, (AnonymousClass4D7) null, 31);
                this.A00 = 1;
                if (AnonymousClass3DM.A00((07U) this.A02, lifecycle, this, mGl) == r82) {
                    return r82;
                }
            }
        }
        return C60340gF.A00;
    }
}
