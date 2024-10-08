package X;

import android.content.DialogInterface;

public final class FTC implements 1UV {
    public final /* synthetic */ AnonymousClass4DH A00;
    public final /* synthetic */ AnonymousClass0aP A01;
    public final /* synthetic */ G8H A02;
    public final /* synthetic */ G51 A03;
    public final /* synthetic */ ENX A04;

    public FTC(AnonymousClass4DH r1, AnonymousClass0aP r2, G8H g8h, G51 g51, ENX enx) {
        this.A04 = enx;
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = g8h;
        this.A03 = g51;
    }

    public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
        ENQ enq = (ENQ) obj;
        ENX enx = this.A04;
        C49669F1b f1b = C49669F1b.A00;
        C48260Ebf ebf = enx.A00;
        if (ebf != null) {
            ebf.A00();
        }
        enq.getClass();
        Object obj2 = enq.A02.get();
        obj2.getClass();
        if (obj2 == C48075EUt.SUCCESSFUL) {
            Object obj3 = null;
            obj3.getClass();
            throw AnonymousClass00P.createAndThrow();
        }
        C358248ab A0I = Dba.A0I(this.A00);
        A0I.A08(2131961742);
        Dba.A0t((DialogInterface.OnClickListener) null, A0I, 17039370);
        return false;
    }
}
