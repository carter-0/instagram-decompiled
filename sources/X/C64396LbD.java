package X;

/* renamed from: X.LbD  reason: case insensitive filesystem */
public final class C64396LbD implements AnonymousClass2Kv {
    public final /* synthetic */ 0sP A00;

    public C64396LbD(0sP r1) {
        this.A00 = r1;
    }

    public final void invoke(AnonymousClass3JD r5) {
        int i;
        C43740C7k c7k;
        C43739C7j A0E;
        C43738C7i A0E2;
        if (r5 == null || (c7k = (C43740C7k) r5.Bny()) == null || (A0E = c7k.A0E()) == null || (A0E2 = A0E.A0E()) == null) {
            i = 0;
        } else {
            i = A0E2.getCoercedIntField(3, AnonymousClass000.A00(3934));
        }
        C51967G9n.A0w((int) Math.ceil(AnonymousClass30M.A00(AnonymousClass30J.DAYS, AnonymousClass30K.A04(AnonymousClass30J.SECONDS, (long) i))), this.A00);
    }
}
