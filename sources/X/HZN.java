package X;

import android.content.res.Resources;

public abstract /* synthetic */ class HZN {
    public static C59485JLj A00(Resources resources, JM1 jm1) {
        C59485JLj jLj;
        if (jm1 instanceof C53535Gq5) {
            C266444Yx r1 = ((C53535Gq5) jm1).A00;
            0qQ.A0B(r1, 1);
            return new C53510Gpg(r1.A00(resources).toString());
        }
        if (jm1 instanceof C57144IQi) {
            jLj = IPX.A00;
        } else if (jm1 instanceof C57145IQj) {
            jLj = IPY.A00;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        return jLj;
    }
}
