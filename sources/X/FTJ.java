package X;

import java.util.List;

public final class FTJ implements 2IR {
    public final void onFailure(Throwable th) {
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        List list = (List) obj;
        0qQ.A0B(list, 0);
        C376139Gr r0 = (C376139Gr) 00k.A0J(list);
        if (r0 != null) {
            C376119Gp r1 = r0.A01;
            0qQ.A07(r1.A00);
            C376109Go r02 = r1.A01;
            0qQ.A07(r02);
            0qQ.A07(r02.A02);
        }
    }
}
