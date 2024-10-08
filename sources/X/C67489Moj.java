package X;

import java.util.Arrays;

/* renamed from: X.Moj  reason: case insensitive filesystem */
public final class C67489Moj {
    public OD9 A00;
    public final OD9 A01;
    public final String A02;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.OD9, java.lang.Object] */
    public static void A00(C67489Moj moj, Object obj, String str) {
        ? obj2 = new Object();
        moj.A00.A00 = obj2;
        moj.A00 = obj2;
        obj2.A01 = obj;
        obj2.A02 = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.A02);
        sb.append('{');
        String str = "";
        for (OD9 od9 = this.A01.A00; od9 != null; od9 = od9.A00) {
            Object obj = od9.A01;
            sb.append(str);
            if (od9.A02 != null) {
                sb.append(od9.A02);
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

    /* JADX WARNING: type inference failed for: r0v0, types: [X.OD9, java.lang.Object] */
    public C67489Moj(String str) {
        ? obj = new Object();
        this.A01 = obj;
        this.A00 = obj;
        str.getClass();
        this.A02 = str;
    }
}
