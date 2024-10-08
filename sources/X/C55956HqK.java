package X;

/* renamed from: X.HqK  reason: case insensitive filesystem */
public final class C55956HqK {
    public final C270284gU A00 = C51965G9l.A0I((C284895Os) null, C58704IwD.A01(this, 5));
    public final C55869Hoq A01;
    public final String A02 = AnonymousClass7TG.A0j();

    public C55956HqK(C55869Hoq hoq) {
        0qQ.A0B(hoq, 1);
        this.A01 = hoq;
    }

    public final void A00() {
        C53342GmS gmS;
        C55869Hoq hoq = this.A01;
        String str = this.A02;
        C284945Oz r2 = hoq.A06;
        if (!C51969G9p.A1T(r2, str) && (gmS = (C53342GmS) hoq.A07.get(str)) != null) {
            hoq.A04 = true;
            r2.Epw(str);
            hoq.A02 = gmS.A01;
            hoq.A01 = gmS.A00;
            hoq.A00 = gmS.A00();
            hoq.A03 = false;
        }
    }
}
