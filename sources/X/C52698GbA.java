package X;

/* renamed from: X.GbA  reason: case insensitive filesystem */
public final class C52698GbA extends C267794cD implements AnonymousClass5VH, JLL, C268824e3, C59665JSk {
    public C52754Gc7 A00;
    public C52697Gb9 A01;
    public C52693Gb5 A02;
    public final C284945Oz A03 = C51970G9q.A0S((Object) null);

    public final void A0E() {
        C52697Gb9 gb9 = this.A01;
        if (gb9.A00 == null) {
            gb9.A00 = this;
            return;
        }
        throw AnonymousClass7TE.A0z("Expected textInputModifierNode to be null");
    }

    public final void A0F() {
        this.A01.A02(this);
    }

    public final void DIA(C268064ch r2) {
        this.A03.Epw(r2);
    }

    public C52698GbA(C52754Gc7 gc7, C52697Gb9 gb9, C52693Gb5 gb5) {
        this.A01 = gb9;
        this.A00 = gc7;
        this.A02 = gb5;
    }
}
