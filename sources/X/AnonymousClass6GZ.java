package X;

/* renamed from: X.6GZ  reason: invalid class name */
public abstract class AnonymousClass6GZ {
    /* JADX WARNING: type inference failed for: r1v1, types: [X.5af, java.lang.Object, X.5ah] */
    /* JADX WARNING: type inference failed for: r1v2, types: [X.5af, java.lang.Object, X.5ai] */
    /* JADX WARNING: type inference failed for: r1v3, types: [X.5af, java.lang.Object, X.5ae] */
    public static final C287725af A01(C287725af r1) {
        if (r1 instanceof C287735ag) {
            return new C287735ag(0.0f, 0.0f);
        }
        if (r1 instanceof C287715ae) {
            ? obj = new Object();
            obj.A00 = 0.0f;
            return obj;
        } else if (r1 instanceof C287755ai) {
            ? obj2 = new Object();
            obj2.A00 = 0.0f;
            obj2.A01 = 0.0f;
            obj2.A02 = 0.0f;
            obj2.A03 = 0.0f;
            return obj2;
        } else {
            ? obj3 = new Object();
            obj3.A00 = 0.0f;
            obj3.A01 = 0.0f;
            obj3.A02 = 0.0f;
            return obj3;
        }
    }

    public static final C287725af A00(C287725af r4) {
        C287725af A01 = A01(r4);
        int A012 = A01.A01();
        for (int i = 0; i < A012; i++) {
            A01.A03(i, r4.A00(i));
        }
        return A01;
    }
}
