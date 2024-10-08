package X;

public final class Xny {
    public int A00;
    public long A01;
    public long A02;
    public String A03;
    public C21983Xod A04;
    public C21971XoG A05;
    public XRO A06;
    public C21464Xbw A07;
    public Y1H A08;
    public Y1H A09;
    public Y1H A0A;
    public Y1D A0B;
    public C21485Xcc A0C;

    public final Y1H A00() {
        if (this.A07 == null) {
            throw AnonymousClass7TE.A0z("request == null");
        } else if (this.A06 != null) {
            int i = this.A00;
            if (i < 0) {
                throw DbW.A0b("code < 0: ", i);
            } else if (this.A03 != null) {
                return new Y1H(this);
            } else {
                throw AnonymousClass7TE.A0z("message == null");
            }
        } else {
            throw AnonymousClass7TE.A0z("protocol == null");
        }
    }

    public Xny(Y1H y1h) {
        this.A00 = -1;
        this.A07 = y1h.A07;
        this.A06 = y1h.A06;
        this.A00 = y1h.A00;
        this.A03 = y1h.A03;
        this.A04 = y1h.A04;
        this.A05 = C21971XoG.A00(y1h.A05);
        this.A0B = y1h.A0B;
        this.A09 = y1h.A09;
        this.A08 = y1h.A08;
        this.A0A = y1h.A0A;
        this.A02 = y1h.A02;
        this.A01 = y1h.A01;
        this.A0C = y1h.A0C;
    }

    public Xny() {
        this.A00 = -1;
        this.A05 = new C21971XoG();
    }
}
