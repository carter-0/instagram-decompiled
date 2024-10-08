package X;

/* renamed from: X.5Pu  reason: invalid class name and case insensitive filesystem */
public abstract class C285115Pu {
    public static final Object[] A00(Object obj, Object obj2, Object[] objArr, int i) {
        int length = objArr.length;
        Object[] objArr2 = new Object[(length + 2)];
        0Yw.A0V(objArr, objArr2, 0, 0, i);
        0Yw.A0V(objArr, objArr2, i + 2, i, length);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final Object[] A01(Object[] objArr, int i) {
        int length = objArr.length;
        Object[] objArr2 = new Object[(length - 2)];
        0Yw.A0V(objArr, objArr2, 0, 0, i);
        0Yw.A0V(objArr, objArr2, i, i + 2, length);
        return objArr2;
    }
}
