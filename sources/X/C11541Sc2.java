package X;

/* renamed from: X.Sc2  reason: case insensitive filesystem */
public final class C11541Sc2 implements 1MD {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C12404Std A01;

    public C11541Sc2(C12404Std std, int i) {
        this.A01 = std;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C7799QXk A0E;
        C7790QXb A0E2;
        QVE A0E3;
        QVG A0S;
        QXN A0E4;
        QSH A0E5;
        QXI qxi = (QXI) obj;
        int i = this.A00;
        if (qxi == null || (A0E = qxi.A0E()) == null) {
            return null;
        }
        if (i != 0) {
            QXF A0F = A0E.A0F();
            if (A0F == null || (A0E4 = A0F.A0E()) == null || (A0E5 = A0E4.A0E()) == null) {
                return null;
            }
            A0S = Pxj.A0S(A0E5);
        } else {
            QXH A0H = A0E.A0H();
            if (A0H == null || (A0E2 = A0H.A0E()) == null || (A0E3 = A0E2.A0E()) == null) {
                return null;
            }
            A0S = Pxj.A0S(A0E3);
        }
        if (A0S != null) {
            return SPz.A03(A0S);
        }
        return null;
    }
}
