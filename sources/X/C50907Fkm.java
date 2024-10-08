package X;

import android.content.Context;

/* renamed from: X.Fkm  reason: case insensitive filesystem */
public final class C50907Fkm implements G6K {
    public final /* synthetic */ C311426cf A00;

    public C50907Fkm(C311426cf r1) {
        this.A00 = r1;
    }

    public final AnonymousClass6ST Aww(Context context) {
        C311426cf r2 = this.A00;
        AnonymousClass6ST r1 = r2.A00;
        if (r1 == null) {
            r1 = DbV.A0h(context);
            DbX.A15(context, r1);
        }
        if (r2.A00 == null) {
            r2.A00 = r1;
        }
        return r1;
    }
}
