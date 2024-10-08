package X;

import java.io.BufferedReader;
import java.util.List;

/* renamed from: X.T7b  reason: case insensitive filesystem */
public final class C12791T7b implements 1NU {
    public static final C8749R7n A00(2ZL r5) {
        0qQ.A0B(r5, 0);
        1Qb A00 = r5.A00();
        if (A00 != null) {
            BufferedReader A0X = Pxg.A0X(A00.AjD());
            StringBuilder A1A = AnonymousClass7TE.A1A();
            while (true) {
                String readLine = A0X.readLine();
                if (readLine != null) {
                    A1A.append(readLine);
                } else {
                    A0X.close();
                    int i = r5.A02;
                    String A10 = DbT.A10(A1A);
                    String str = r5.A03;
                    List list = r5.A04;
                    Object[] array = list.toArray(new 1Fn[list.size()]);
                    0qQ.A07(array);
                    return new C8749R7n(i, A10, str, 03t.A0J(array));
                }
            }
        } else {
            throw AnonymousClass7TE.A0y();
        }
    }

    public final /* bridge */ /* synthetic */ Object then(Object obj) {
        return A00((2ZL) obj);
    }
}
