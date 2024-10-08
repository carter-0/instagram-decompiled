package X;

import java.util.Arrays;

/* renamed from: X.S4a  reason: case insensitive filesystem */
public final class C10988S4a {
    public C10606Rv0 A00;
    public final C10606Rv0 A01;
    public final String A02;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Rv0, java.lang.Object] */
    public final void A00(Object obj, String str) {
        ? obj2 = new Object();
        this.A00.A00 = obj2;
        this.A00 = obj2;
        obj2.A01 = obj;
        obj2.A02 = str;
    }

    public final String toString() {
        StringBuilder A14 = Pxe.A14(32);
        A14.append(this.A02);
        A14.append('{');
        C10606Rv0 rv0 = this.A01.A00;
        String str = "";
        while (rv0 != null) {
            Object obj = rv0.A01;
            A14.append(str);
            String str2 = rv0.A02;
            if (str2 != null) {
                A14.append(str2);
                A14.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                A14.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                A14.append(deepToString, 1, deepToString.length() - 1);
            }
            rv0 = rv0.A00;
            str = ", ";
        }
        return Pxg.A0x(A14);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.Rv0, java.lang.Object] */
    public /* synthetic */ C10988S4a(String str) {
        ? obj = new Object();
        this.A01 = obj;
        this.A00 = obj;
        str.getClass();
        this.A02 = str;
    }
}
