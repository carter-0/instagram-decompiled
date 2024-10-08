package X;

import android.view.View;

public final class ICI implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ WWP A01;
    public final /* synthetic */ C2363633l A02;
    public final /* synthetic */ C53157GjT A03;
    public final /* synthetic */ C57251IUm A04;

    public ICI(WWP wwp, C2363633l r2, C53157GjT gjT, C57251IUm iUm, int i) {
        this.A01 = wwp;
        this.A00 = i;
        this.A02 = r2;
        this.A03 = gjT;
        this.A04 = iUm;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1680976602);
        WWP wwp = this.A01;
        0sn r1 = wwp.A01.A0A;
        if (r1 == null) {
            r1 = 0sn.A00;
        }
        String Bjz = ((C250273lB) r1.get(this.A00)).Bjz();
        C2363233h r6 = this.A02.A00;
        C53157GjT gjT = this.A03;
        r6.Ds5(1UQ.A0K, gjT.A01, wwp.getId(), wwp.C9L(), Bjz, (String) null, (String) null, (String) null, -1, -1, false, false, false);
        this.A04.A01 = AnonymousClass05K.A00;
        C2363733m.A06(gjT);
        AnonymousClass0fD.A0C(496612442, A05);
    }
}
