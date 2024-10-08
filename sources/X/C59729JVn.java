package X;

/* renamed from: X.JVn  reason: case insensitive filesystem */
public final class C59729JVn extends AnonymousClass1Ek implements 0sJ {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;
    public final Object A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59729JVn(AnonymousClass4D7 r2, 0sF r3, int i) {
        super(4, r2);
        this.A04 = i;
        this.A05 = r3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2 = this.A04;
        AnonymousClass4D7 r7 = (AnonymousClass4D7) obj4;
        0sF r2 = (0sF) this.A05;
        if (i2 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        C59729JVn jVn = new C59729JVn(r7, r2, i);
        jVn.A01 = obj;
        jVn.A02 = obj2;
        jVn.A03 = obj3;
        return jVn.invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        1Hj r3 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj);
            return obj;
        }
        0eS.A00(obj);
        AnonymousClass59G r1 = (AnonymousClass59G) this.A01;
        AnonymousClass59G r0 = (AnonymousClass59G) this.A02;
        Object obj2 = this.A03;
        Object obj3 = r1.A00;
        Object obj4 = r1.A01;
        Object obj5 = r1.A02;
        Object obj6 = r0.A00;
        Object obj7 = r0.A01;
        Object obj8 = r0.A02;
        this.A01 = null;
        this.A02 = null;
        this.A00 = 1;
        Object invoke = ((0sF) this.A05).invoke(obj3, obj4, obj5, obj6, obj7, obj8, obj2, this);
        if (invoke != r3) {
            return invoke;
        }
        return r3;
    }
}
