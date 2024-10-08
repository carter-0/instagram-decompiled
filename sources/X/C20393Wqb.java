package X;

import java.util.concurrent.Callable;

/* renamed from: X.Wqb  reason: case insensitive filesystem */
public final /* synthetic */ class C20393Wqb implements Callable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ AnonymousClass9RJ A02;

    public /* synthetic */ C20393Wqb(AnonymousClass9RJ r1, float f, float f2) {
        this.A02 = r1;
        this.A00 = f;
        this.A01 = f2;
    }

    public final Object call() {
        AnonymousClass9RJ r5 = this.A02;
        float f = this.A00;
        float f2 = this.A01;
        if (!r5.isConnected() || !r5.A0e) {
            return 0;
        }
        int A0M = AnonymousClass7TE.A0M(r5.AlD().A01(C342687p0.A0j));
        int min = Math.min(Math.max(0, (int) C13988Tno.A00((float) A0M, f, f2)), A0M);
        r5.A0M.A00(min);
        return Integer.valueOf(min);
    }
}
