package X;

/* renamed from: X.HqQ  reason: case insensitive filesystem */
public final class C55959HqQ {
    public final C284945Oz A00 = C51970G9q.A0S((Object) null);
    public final C287805an A01;
    public final String A02;
    public final /* synthetic */ C56606I4f A03;

    public C55959HqQ(C56606I4f i4f, C287805an r3, String str) {
        this.A03 = i4f;
        this.A01 = r3;
        this.A02 = str;
    }

    public final C56866IFn A00(0sP r7, 0sP r8) {
        C284945Oz r5 = this.A00;
        C56866IFn iFn = (C56866IFn) r5.getValue();
        if (iFn == null) {
            C56606I4f i4f = this.A03;
            Object invoke = r8.invoke(i4f.A04());
            C287805an r2 = this.A01;
            C287725af r1 = (C287725af) ((C287795am) r2).A01.invoke(r8.invoke(i4f.A04()));
            r1.A02();
            iFn = new C56866IFn(this, new C56868IFp(r1, i4f, r2, invoke), r7, r8);
            r5.Epw(iFn);
            i4f.A09.add(iFn.A02);
        }
        C56606I4f i4f2 = this.A03;
        iFn.A00 = r8;
        iFn.A01 = r7;
        iFn.A00(i4f2.A03());
        return iFn;
    }
}
