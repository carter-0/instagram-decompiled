package X;

import com.facebook.msys.mca.MailboxFutureImpl;

public final class PSQ implements 1aV {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C69183NgW A02;

    public PSQ(C69183NgW ngW, int i, long j) {
        this.A01 = j;
        this.A02 = ngW;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        AnonymousClass638 r2 = (AnonymousClass638) obj;
        0qQ.A0B(r2, 0);
        long j = this.A01;
        C71724Opi opi = new C71724Opi(r2, this.A02, this.A00, j);
        AnonymousClass632 r22 = r2.A07;
        AnonymousClass68L A0F = C66580MXl.A0F(r22, 0);
        MailboxFutureImpl A0J = C66581MXm.A0J(A0F, opi);
        C66582MXn.A1E(A0F, new C71718Opc(r22, A0J, 1, j), A0J);
    }
}
