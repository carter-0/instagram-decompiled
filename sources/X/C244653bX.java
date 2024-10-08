package X;

/* renamed from: X.3bX  reason: invalid class name and case insensitive filesystem */
public final class C244653bX extends 0Yg implements 0sL {
    public final /* synthetic */ C277274um A00;
    public final /* synthetic */ C277274um A01;
    public final /* synthetic */ 2V5 A02;
    public final /* synthetic */ 0sK A03;
    public final /* synthetic */ 0rm A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C244653bX(C277274um r2, C277274um r3, 2V5 r4, 0sK r5, 0rm r6) {
        super(2);
        this.A02 = r4;
        this.A04 = r6;
        this.A00 = r2;
        this.A03 = r5;
        this.A01 = r3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object obj3 = obj2;
        0qQ.A0B(obj2, 1);
        2V5 r4 = this.A02;
        if (r4 != null) {
            0rm r3 = this.A04;
            Object obj4 = r3.A00;
            if (obj4 == null) {
                obj4 = new C271194i6(this.A00, r4, obj2, this.A03);
                r3.A00 = obj4;
            }
            r4.A01.add(obj4);
            Object obj5 = r4.A00;
            C277274um r1 = this.A00;
            if (r1 != null) {
                this.A03.invoke(r1, obj2, obj5);
            }
        }
        return new C246263eI(new AnonymousClass9MR(0, r4, this.A04, obj3, this.A01));
    }
}
