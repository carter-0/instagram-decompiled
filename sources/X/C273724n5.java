package X;

/* renamed from: X.4n5  reason: invalid class name and case insensitive filesystem */
public final class C273724n5 implements C244503bI {
    public final int A00;
    public final String A01;
    public final /* synthetic */ Object A02;
    public final /* synthetic */ 01F A03;

    public final C246263eI ADL(AnonymousClass2WF r5, Object obj, Object obj2) {
        0qQ.A0B(r5, 1);
        0qQ.A0B(obj, 1);
        01F r3 = this.A03;
        r3.A02(obj, this.A02);
        return new C246263eI(new AnonymousClass9MH(7, obj, (Object) r3, (Object) null));
    }

    public C273724n5(2WE r2, Object obj, 01F r4) {
        this.A03 = r4;
        this.A02 = obj;
        this.A00 = r2.A02.size();
        this.A01 = r2.A00;
    }

    public final String getDescription() {
        Object obj = this.A01;
        if (obj == null) {
            obj = Integer.valueOf(this.A00);
        }
        return String.valueOf(obj);
    }

    public final boolean Ete(Object obj, Object obj2, Object obj3, Object obj4) {
        return !C245173cR.A02(obj, obj2);
    }
}
