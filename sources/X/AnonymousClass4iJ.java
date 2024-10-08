package X;

import java.lang.reflect.Array;

/* renamed from: X.4iJ  reason: invalid class name */
public final class AnonymousClass4iJ {
    public Qm4 A00 = null;
    public Qm5 A01 = null;
    public Qm6 A02 = null;
    public Qm7 A03 = null;
    public Qm8 A04 = null;
    public C8255Qm9 A05 = null;
    public C8256QmA A06 = null;

    public static Object[] A00(Object obj, Object[] objArr) {
        Object[] objArr2;
        int length = objArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), length + 1);
                if (length > 0) {
                    System.arraycopy(objArr, 0, objArr2, 1, length);
                }
                objArr2[0] = obj;
            } else if (objArr[i] != obj) {
                i++;
            } else if (i == 0) {
                return objArr;
            } else {
                objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), length);
                System.arraycopy(objArr, 0, objArr2, 1, i);
                objArr2[0] = obj;
                int i2 = i + 1;
                int i3 = length - i2;
                if (i3 > 0) {
                    System.arraycopy(objArr, i2, objArr2, i2, i3);
                    return objArr2;
                }
            }
        }
        return objArr2;
    }
}
