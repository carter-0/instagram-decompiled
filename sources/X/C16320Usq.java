package X;

/* renamed from: X.Usq  reason: case insensitive filesystem */
public final class C16320Usq extends C19724WeQ {
    public final XCG[] A00 = new XCG[3];
    public final /* synthetic */ C16312Usg A01;

    public C16320Usq(C16312Usg usg) {
        this.A01 = usg;
        int i = 0;
        do {
            this.A00[i] = this.A01.A00[i].AML();
            i++;
        } while (i < 3);
    }

    public final void AQF() {
        XCG[] xcgArr = this.A00;
        int i = 0;
        do {
            XCG xcg = xcgArr[i];
            0qQ.A0A(xcg);
            xcg.AQF();
            i++;
        } while (i < 3);
    }
}
