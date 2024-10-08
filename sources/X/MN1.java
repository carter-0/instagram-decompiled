package X;

public final class MN1 extends 0Yg implements 0sP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C60107Jfn A01;
    public final /* synthetic */ AnonymousClass51N A02;
    public final /* synthetic */ 0sP A03;
    public final /* synthetic */ 0sP A04;
    public final /* synthetic */ 0sL A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MN1(C60107Jfn jfn, AnonymousClass51N r3, 0sP r4, 0sP r5, 0sL r6, int i) {
        super(1);
        this.A04 = r4;
        this.A00 = i;
        this.A01 = jfn;
        this.A02 = r3;
        this.A05 = r6;
        this.A03 = r5;
    }

    public final void A00(boolean z) {
        if (!z) {
            C51967G9n.A0w(this.A00, this.A04);
            return;
        }
        C60107Jfn jfn = this.A01;
        if (jfn.A01 == null) {
            jfn.A01 = new ZLu();
            ZLu A002 = jfn.A01;
            if (A002 != null) {
                jfn.A02.A01.put(A002.A00(), A002);
            }
        }
        int i = this.A00;
        C60107Jfn.A02(jfn, (AnonymousClass51M) this.A02, this.A04, this.A03, this.A05, i);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A00(AnonymousClass7TE.A1a(obj));
        return C60340gF.A00;
    }
}
