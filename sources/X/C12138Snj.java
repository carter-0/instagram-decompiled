package X;

/* renamed from: X.Snj  reason: case insensitive filesystem */
public final class C12138Snj implements C13711TfY {
    public final /* synthetic */ C10931S1j A00;
    public final /* synthetic */ C307896Rx A01;
    public final /* synthetic */ C277014uI A02;
    public final /* synthetic */ C277014uI A03;

    public final void DEY(C10211RoS roS) {
        0qQ.A0B(roS, 0);
        S87.A01(this.A01, this.A03, roS.A00);
    }

    public final void Doe(String str) {
        C277014uI r1;
        String str2;
        0qQ.A0B(str, 0);
        C307896Rx r2 = this.A01;
        Boolean bool = (Boolean) C299275ur.A00(r2, DbY.A0Q(str), this.A02);
        if (bool == null) {
            r1 = this.A03;
            str2 = "could_not_parse_coverage_response";
        } else if (!bool.booleanValue()) {
            r1 = this.A03;
            str2 = "coverage_not_available";
        } else {
            this.A00.A00();
            return;
        }
        S87.A01(r2, r1, str2);
    }

    public C12138Snj(C10931S1j s1j, C307896Rx r2, C277014uI r3, C277014uI r4) {
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = s1j;
    }
}
