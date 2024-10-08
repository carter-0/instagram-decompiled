package X;

import java.io.BufferedReader;

public final class T7V implements 1NU {
    public final int A00;

    public T7V(int i) {
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object then(Object obj) {
        1Qb A002 = ((2ZL) obj).A00();
        A002.getClass();
        BufferedReader A0X = Pxg.A0X(A002.AjD());
        StringBuilder A1A = AnonymousClass7TE.A1A();
        while (true) {
            String readLine = A0X.readLine();
            if (readLine != null) {
                A1A.append(readLine);
                A1A.append(10);
            } else {
                A0X.close();
                C8769R8u r8u = new C8769R8u(C66580MXl.A17(A1A.toString()).getString("token"));
                r8u.mStatusCode = 200;
                return r8u;
            }
        }
    }
}
