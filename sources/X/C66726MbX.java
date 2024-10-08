package X;

import java.util.Arrays;

/* renamed from: X.MbX  reason: case insensitive filesystem */
public final class C66726MbX {
    public ODJ A00;
    public final ODJ A01;
    public final String A02;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.ODJ, java.lang.Object] */
    public static void A00(C66726MbX mbX, Object obj, String str) {
        ? obj2 = new Object();
        mbX.A00.A00 = obj2;
        mbX.A00 = obj2;
        obj2.A01 = obj;
        obj2.A02 = str;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.ODJ, java.lang.Object] */
    public final void A01(Object obj, String str) {
        ? obj2 = new Object();
        this.A00.A00 = obj2;
        this.A00 = obj2;
        obj2.A01 = obj;
        obj2.A02 = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.A02);
        sb.append('{');
        String str = "";
        for (ODJ odj = this.A01.A00; odj != null; odj = odj.A00) {
            Object obj = odj.A01;
            sb.append(str);
            String str2 = odj.A02;
            if (str2 != null) {
                sb.append(str2);
                sb.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append(deepToString, 1, deepToString.length() - 1);
            }
            str = ", ";
        }
        return C51967G9n.A0r(sb, '}');
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.ODJ, java.lang.Object] */
    public C66726MbX(String str) {
        ? obj = new Object();
        this.A01 = obj;
        this.A00 = obj;
        str.getClass();
        this.A02 = str;
    }

    public final void A02(String str, int i) {
        A00(this, String.valueOf(i), str);
    }

    public final void A03(String str, long j) {
        A00(this, String.valueOf(j), str);
    }

    public final void A04(String str, boolean z) {
        A00(this, String.valueOf(z), str);
    }
}
