package X;

/* renamed from: X.UqM  reason: case insensitive filesystem */
public final class C16197UqM extends C66972Mg5 {
    public final TwD A00;
    public final C17962Viv A01;

    public final boolean A03(C296935qt r3) {
        0qQ.A0B(r3, 0);
        if (r3 instanceof C16197UqM) {
            C16197UqM uqM = (C16197UqM) r3;
            if (!0qQ.A0K(this.A00, uqM.A00) || !0qQ.A0K(this.A01, uqM.A01)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.TwD, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v2, types: [X.Viv, java.lang.Object] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C16197UqM(java.lang.String r3, int r4, boolean r5) {
        /*
            r2 = this;
            X.TwD r1 = new X.TwD
            r1.<init>()
            java.lang.String r0 = ""
            r1.A01 = r0
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1.A00 = r0
            r1.A01 = r3
            r1.A00 = r4
            X.Viv r0 = new X.Viv
            r0.<init>()
            r0.A00 = r5
            r2.<init>(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16197UqM.<init>(java.lang.String, int, boolean):void");
    }

    public final long A00() {
        return 30;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16197UqM(TwD twD, C17962Viv viv) {
        super("search_footer");
        AnonymousClass7TG.A1O(twD, viv);
        this.A00 = twD;
        this.A01 = viv;
    }
}
