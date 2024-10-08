package X;

/* renamed from: X.RfO  reason: case insensitive filesystem */
public abstract class C9705RfO {
    public static String A00(String str, Object... objArr) {
        int length;
        String A0I;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                A0I = "null";
            } else {
                try {
                    A0I = obj.toString();
                } catch (Exception e) {
                    A0I = Pxk.A0I(obj, e);
                }
            }
            objArr[i2] = A0I;
            i2++;
        }
        int length2 = str.length();
        StringBuilder A15 = Pxe.A15(length2, length * 16);
        int i3 = 0;
        while (i < length) {
            int indexOf = str.indexOf("%s", i3);
            if (indexOf == -1) {
                break;
            }
            A15.append(str, i3, indexOf);
            A15.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        A15.append(str, i3, length2);
        if (i < length) {
            int A07 = Pxg.A07(" [", A15, objArr, i);
            while (A07 < length) {
                A07 = Pxg.A07(", ", A15, objArr, A07);
            }
            A15.append(']');
        }
        return A15.toString();
    }
}
