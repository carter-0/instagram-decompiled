package X;

/* renamed from: X.9KA  reason: invalid class name */
public final class AnonymousClass9KA extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Object A05;
    public final boolean A06;
    public final boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9KA(1OC r2, AnonymousClass4D7 r3, int i, int i2, int i3, boolean z, boolean z2) {
        super(2, r3);
        this.A02 = i3;
        this.A05 = r2;
        this.A04 = i;
        this.A03 = i2;
        this.A07 = z;
        this.A06 = z2;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.9KA, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r10) {
        int i;
        int i2 = this.A02;
        1OC r1 = (1OC) this.A05;
        int i3 = this.A04;
        int i4 = this.A03;
        boolean z = this.A07;
        boolean z2 = this.A06;
        if (i2 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        ? r0 = new AnonymousClass9KA(r1, r10, i3, i4, i, z, z2);
        r0.A01 = obj;
        return r0;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AnonymousClass9KA) create(obj, (AnonymousClass4D7) obj2)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [X.9KA, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        C252683pV r5;
        1OC r4;
        int i;
        int i2 = this.A02;
        1Hj r6 = 1Hj.A02;
        int i3 = this.A00;
        if (i2 != 0) {
            if (i3 == 0) {
                0eS.A00(obj);
                r5 = (C252683pV) this.A01;
                0ki.A00("LoadingFlow loading", new C20611Wvs(r5, 22));
                r4 = (1OC) this.A05;
                r4.A00 = new C385479j0(r5, 4);
                1ES.A05(r4, this.A04, this.A03, this.A07, this.A06);
                i = 23;
            }
            0eS.A00(obj);
            return C60340gF.A00;
        }
        if (i3 == 0) {
            0eS.A00(obj);
            r5 = (C252683pV) this.A01;
            r4 = (1OC) this.A05;
            r4.A00 = new C385479j0(r5, 3);
            1ES.A05(r4, this.A04, this.A03, this.A07, this.A06);
            i = 21;
        }
        0eS.A00(obj);
        return C60340gF.A00;
        C20611Wvs wvs = new C20611Wvs(r4, i);
        this.A00 = 1;
        if (C239083Et.A00(this, wvs, r5) == r6) {
            return r6;
        }
        return C60340gF.A00;
    }
}
