package X;

import java.util.concurrent.Callable;

/* renamed from: X.Pca  reason: case insensitive filesystem */
public final class C73435Pca implements Callable {
    public final /* synthetic */ C70548OAw A00;

    public C73435Pca(C70548OAw oAw) {
        this.A00 = oAw;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C70548OAw oAw = this.A00;
        int i = oAw.A00;
        if (i <= 0 || oAw.A01.nextInt(i) != 0) {
            return "";
        }
        Class[] A01 = 1AO.A04.A01();
        try {
            long[] A002 = 18x.A00(A01);
            StringBuilder A1A = AnonymousClass7TE.A1A();
            boolean z = false;
            for (int i2 = 0; i2 < A002.length; i2++) {
                Class cls = A01[i2];
                if (cls != null) {
                    if (z) {
                        A1A.append(",");
                    }
                    A1A.append("<cls>");
                    A1A.append(cls.getName());
                    A1A.append("</cls>:");
                    A1A.append(A002[i2]);
                    z = true;
                }
            }
            return A1A.toString();
        } catch (Throwable unused) {
            return "";
        }
    }
}
