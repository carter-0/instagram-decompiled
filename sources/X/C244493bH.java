package X;

/* renamed from: X.3bH  reason: invalid class name and case insensitive filesystem */
public final class C244493bH implements C244503bI {
    public final int A00;
    public final String A01;
    public final /* synthetic */ 0sL A02;

    public final C246263eI ADL(AnonymousClass2WF r2, Object obj, Object obj2) {
        0qQ.A0B(r2, 1);
        0qQ.A0B(obj, 1);
        return (C246263eI) this.A02.invoke(r2, obj);
    }

    public C244493bH(2WE r2, 0sL r3) {
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
        return !C245173cR.A02(obj, obj2);
    }
}
