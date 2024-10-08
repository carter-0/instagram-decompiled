package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.LZe  reason: case insensitive filesystem */
public final class C64304LZe implements AnonymousClass0hF {
    public final /* synthetic */ 07U A00;
    public final /* synthetic */ AnonymousClass07V A01;
    public final /* synthetic */ C62320sa A02;
    public final /* synthetic */ 1IX A03;

    public final void Dms(07T r4, AnonymousClass07Z r5) {
        1IX r2;
        Object obj;
        0qQ.A0B(r4, 1);
        if (r4 == AnonymousClass07R.A01(this.A00)) {
            this.A01.A0A(this);
            r2 = this.A03;
            try {
                obj = this.A02.invoke();
            } catch (Throwable th) {
                obj = JTO.A1B(th);
            }
        } else if (r4 == 07T.ON_DESTROY) {
            this.A01.A0A(this);
            r2 = this.A03;
            obj = JTU.A0c(new CancellationException((String) null));
        } else {
            return;
        }
        r2.resumeWith(obj);
    }

    public C64304LZe(07U r1, AnonymousClass07V r2, C62320sa r3, 1IX r4) {
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
    }
}
