package X;

/* renamed from: X.3bQ  reason: invalid class name and case insensitive filesystem */
public final class C244583bQ implements C244503bI {
    public final int A00;
    public final String A01;
    public final /* synthetic */ Object A02;
    public final /* synthetic */ Object A03;
    public final /* synthetic */ C59520Ya A04;

    public final C246263eI ADL(AnonymousClass2WF r5, Object obj, Object obj2) {
        0qQ.A0B(r5, 1);
        0qQ.A0B(obj, 1);
        0sL r3 = this.A04;
        r3.invoke(obj, this.A03);
        return new C246263eI(new AnonymousClass9MH(6, obj, (Object) r3, this.A02));
    }

    public C244583bQ(2WE r2, Object obj, Object obj2, C59520Ya r5) {
        this.A04 = r5;
        this.A03 = obj;
        this.A02 = obj2;
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
