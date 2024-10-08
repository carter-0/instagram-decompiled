package X;

/* renamed from: X.WgT  reason: case insensitive filesystem */
public final class C19848WgT implements C342997pV {
    public final /* synthetic */ 0wc A00;
    public final /* synthetic */ C18514VtD A01;

    public final void EuW(C335737dS r13) {
        UOK uok;
        0qQ.A0B(r13, 0);
        U91 A002 = C18514VtD.A00(this.A01);
        0wc r3 = this.A00;
        0qQ.A0B(r3, 1);
        if (r13 == C335737dS.LWN_STORY_REPLY_RESPECTFUL) {
            Object value = A002.A0G.getValue();
            if ((value instanceof UOK) && (uok = (UOK) value) != null) {
                05G r1 = A002.A0E;
                C19665WdT wdT = C19665WdT.A00;
                C20852X1e x1e = uok.A00;
                String str = uok.A03;
                Integer num = uok.A02;
                boolean z = uok.A04;
                AnonymousClass7TG.A1T(x1e, str, num);
                0qQ.A0B(wdT, 4);
                r1.Epw(new UOK(x1e, wdT, num, str, z));
                1Yp.A04(r3, AnonymousClass05K.A01, false);
                A002.A01 = true;
            }
        }
    }

    public C19848WgT(0wc r1, C18514VtD vtD) {
        this.A01 = vtD;
        this.A00 = r1;
    }

    public final void Cya() {
        U91 A002 = C18514VtD.A00(this.A01);
        A002.A01 = true;
        U91.A03(A002);
    }

    public final void Cyt() {
        C18514VtD vtD = this.A01;
        vtD.A08.post(new C20084Wki(vtD));
        U91.A04(C18514VtD.A00(vtD));
    }
}
