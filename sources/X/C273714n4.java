package X;

/* renamed from: X.4n4  reason: invalid class name and case insensitive filesystem */
public final class C273714n4 implements C244503bI {
    public final int A00;
    public final String A01;
    public final /* synthetic */ 0sK A02;

    public final C246263eI ADL(AnonymousClass2WF r2, Object obj, Object obj2) {
        0qQ.A0B(r2, 0);
        0qQ.A0B(obj, 1);
        return (C246263eI) this.A02.invoke(r2, obj, obj2);
    }

    public C273714n4(2WE r2, 0sK r3) {
        this.A02 = r3;
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
        if (!C245173cR.A02(obj3, obj4) || !C245173cR.A02(obj, obj2)) {
            return true;
        }
        return false;
    }
}
