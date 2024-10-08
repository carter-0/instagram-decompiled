package X;

/* renamed from: X.72Y  reason: invalid class name */
public abstract class AnonymousClass72Y {
    /* JADX WARNING: type inference failed for: r3v0, types: [X.0r1, java.lang.Object] */
    public static final AnonymousClass2gB A00(2Fk r4) {
        2Fk r2;
        ? obj = new Object();
        obj.A00 = true;
        if (r4.A08 != 2Fk.A0A) {
            obj.A00 = false;
            r2 = new 2Fk(r4.A02());
            r2.A00 = new Pxo();
        } else {
            r2 = new AnonymousClass2gB();
        }
        r2.A0E(r4, new AnonymousClass72Z(new C377469Ly(20, (Object) r2, (Object) obj)));
        return r2;
    }

    public static final AnonymousClass2gB A01(2Fk r3, 0sP r4) {
        2Fk r2;
        0qQ.A0B(r3, 0);
        if (r3.A08 != 2Fk.A0A) {
            r2 = new 2Fk(r4.invoke(r3.A02()));
            r2.A00 = new Pxo();
        } else {
            r2 = new AnonymousClass2gB();
        }
        r2.A0E(r3, new AnonymousClass72Z(new C377469Ly(21, (Object) r4, (Object) r2)));
        return r2;
    }

    public static final AnonymousClass2gB A02(2Fk r4, 0sP r5) {
        2Fk r2;
        2Fk r1;
        Object obj = new Object();
        Object obj2 = r4.A08;
        Object obj3 = 2Fk.A0A;
        if (obj2 == obj3 || (r1 = (2Fk) r5.invoke(r4.A02())) == null || r1.A08 == obj3) {
            r2 = new AnonymousClass2gB();
        } else {
            r2 = new 2Fk(r1.A02());
            r2.A00 = new Pxo();
        }
        r2.A0E(r4, new AnonymousClass72Z(new C58751Iwy(13, obj, r5, r2)));
        return r2;
    }
}
