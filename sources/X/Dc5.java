package X;

import android.content.res.Resources;

public abstract class Dc5 {
    public static final int A00() {
        return DbX.A07(Dc2.A0S);
    }

    public static final int A01() {
        return DbX.A07(Dc2.A0T);
    }

    public static final Dc2 A02(Resources resources, C51878G5q g5q) {
        C310336ap A0a = DbS.A0a();
        A0a.A0C = C310346aq.ERROR;
        DbT.A1D(resources, A0a, 2131968407);
        if (g5q != null) {
            A0a.A0G = AnonymousClass7TF.A0d(resources, 2131972372);
            FdH.A00(A0a, g5q, 3);
            A0a.A0L = true;
        }
        A0a.A06();
        return A0a.A00();
    }
}
