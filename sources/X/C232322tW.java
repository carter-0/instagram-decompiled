package X;

/* renamed from: X.2tW  reason: invalid class name and case insensitive filesystem */
public abstract class C232322tW {
    public abstract int A02();

    public abstract int A03();

    public boolean A04(int i, int i2) {
        AnonymousClass2tV r1 = (AnonymousClass2tV) this;
        C232272tM r3 = (C232272tM) r1.A01.get(i);
        Object obj = r1.A00.get(i2);
        r3.getClass();
        obj.getClass();
        if (!r3.getClass().equals(obj.getClass()) || !r3.isContentSame(obj)) {
            return false;
        }
        return true;
    }

    public boolean A05(int i, int i2) {
        AnonymousClass2tV r1 = (AnonymousClass2tV) this;
        C232262tL r4 = (C232262tL) r1.A01.get(i);
        C232262tL r3 = (C232262tL) r1.A00.get(i2);
        if (r4 == r3 || (r4 != null && r3 != null && r4.getKey() != null && r3.getKey() != null && r4.getClass().equals(r3.getClass()) && r4.getKey().equals(r3.getKey()))) {
            return true;
        }
        return false;
    }

    public Object A01(int i, int i2) {
        if (!(this instanceof AnonymousClass3DC)) {
            return null;
        }
        AnonymousClass3D9 r2 = ((AnonymousClass3DC) this).A00;
        Object obj = r2.A04.get(i);
        Object obj2 = r2.A03.get(i2);
        if (obj != null && obj2 != null) {
            return null;
        }
        throw new AssertionError();
    }
}
