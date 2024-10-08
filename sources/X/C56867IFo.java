package X;

/* renamed from: X.IFo  reason: case insensitive filesystem */
public final class C56867IFo implements C270284gU {
    public final AnonymousClass6H2 A00;
    public final C284945Oz A01;
    public final C284945Oz A02;
    public final C284945Oz A03;
    public final C284945Oz A04 = C51969G9p.A0S(1);
    public final C284945Oz A05 = C51969G9p.A0S(1);
    public final C284945Oz A06;
    public final C284945Oz A07;
    public final C284945Oz A08;
    public final C284945Oz A09;
    public final C284945Oz A0A;
    public final C284945Oz A0B;
    public final C270284gU A0C;
    public final C270284gU A0D;
    public final C270284gU A0E;

    public static final void A00(C56867IFo iFo, float f) {
        S7N s7n;
        C51967G9n.A14(iFo.A08, f);
        if (C51971G9r.A1W(iFo.A0B) && (s7n = (S7N) iFo.A02.getValue()) != null) {
            f -= f % (1.0f / s7n.A01);
        }
        C51967G9n.A14(iFo.A07, f);
    }

    public final int A01() {
        return C51971G9r.A0B(this.A04);
    }

    public final /* bridge */ /* synthetic */ Object getValue() {
        return Float.valueOf(C51971G9r.A02(this.A07));
    }

    public C56867IFo() {
        Boolean A0u = AnonymousClass7TE.A0u();
        this.A03 = C51970G9q.A0S(A0u);
        this.A09 = C51969G9p.A0S(A0u);
        this.A01 = C51969G9p.A0S((Object) null);
        this.A0A = C51969G9p.A0S(C51967G9n.A0h());
        this.A0B = C51969G9p.A0S(A0u);
        this.A0D = C51965G9l.A0I((C284895Os) null, new C13347TVu(this, 26));
        this.A02 = C51969G9p.A0S((Object) null);
        Float A0g = C51967G9n.A0g();
        this.A08 = C51969G9p.A0S(A0g);
        this.A07 = C51969G9p.A0S(A0g);
        this.A06 = C51969G9p.A0S(Long.MIN_VALUE);
        this.A0C = C51965G9l.A0I((C284895Os) null, new C13347TVu(this, 25));
        this.A0E = C51965G9l.A0I((C284895Os) null, new C13347TVu(this, 27));
        this.A00 = new AnonymousClass6H2();
    }
}
