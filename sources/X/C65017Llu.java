package X;

import java.util.List;

/* renamed from: X.Llu  reason: case insensitive filesystem */
public final class C65017Llu implements MTV {
    public final /* synthetic */ AnonymousClass8Fi A00;

    public C65017Llu(AnonymousClass8Fi r1) {
        this.A00 = r1;
    }

    public final void Doh(List list) {
        AnonymousClass8Fi r1 = this.A00;
        Object A0J = 00k.A0J(list);
        if (A0J != null) {
            r1.Doa((C352218Cl) A0J);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void onFailure(Exception exc) {
        this.A00.onFailure(exc);
    }
}
