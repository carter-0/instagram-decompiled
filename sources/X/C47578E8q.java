package X;

import android.content.Context;
import java.util.List;

/* renamed from: X.E8q  reason: case insensitive filesystem */
public final class C47578E8q extends C331047Ph {
    public final Context A00;
    public final C46437Dez A01;
    public final List A02 = AnonymousClass7TE.A1C();
    public final C47608E9u A03;

    public C47578E8q(Context context, E6U e6u) {
        this.A00 = context;
        C47608E9u e9u = new C47608E9u(context, e6u);
        this.A03 = e9u;
        C46437Dez dez = new C46437Dez(context);
        this.A01 = dez;
        A0B(e9u, dez);
    }

    public static final void A00(C47578E8q e8q) {
        e8q.A06();
        for (Object A09 : e8q.A02) {
            e8q.A09(e8q.A03, A09, (Object) null);
        }
        e8q.A07();
    }
}
