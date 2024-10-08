package X;

public final class MEj extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Object A04;
    public final boolean A05;
    public final boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MEj(Object obj, AnonymousClass4D7 r3, int i, int i2, int i3, boolean z, boolean z2) {
        super(2, r3);
        this.A01 = i3;
        this.A04 = obj;
        this.A06 = z;
        this.A05 = z2;
        this.A03 = i;
        this.A02 = i2;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.MEj, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r10) {
        int i;
        int i2 = this.A01;
        Object obj2 = this.A04;
        boolean z = this.A06;
        boolean z2 = this.A05;
        int i3 = this.A03;
        int i4 = this.A02;
        if (i2 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        return new MEj(obj2, r10, i3, i4, i, z, z2);
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [X.MEj, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        Integer num;
        int i;
        1Hj r7 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            0V2 r5 = ((C60098Jfe) this.A04).A04;
            if (this.A06) {
                num = AnonymousClass05K.A01;
            } else {
                num = AnonymousClass05K.A0C;
            }
            if (this.A05) {
                i = this.A03;
            } else {
                i = this.A02;
            }
            C61052Jvq jvq = new C61052Jvq(num, i, 4, false);
            this.A00 = 1;
            if (r5.emit(jvq, this) == r7) {
                return r7;
            }
        }
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MEj) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
