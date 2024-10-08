package X;

/* renamed from: X.LhZ  reason: case insensitive filesystem */
public final class C64757LhZ implements C232262tL {
    public final JWF A00;

    public C64757LhZ(JWF jwf) {
        0qQ.A0B(jwf, 1);
        this.A00 = jwf;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00.A04;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        JWF jwf;
        C64757LhZ lhZ = (C64757LhZ) obj;
        JWF jwf2 = this.A00;
        if (lhZ != null) {
            jwf = lhZ.A00;
        } else {
            jwf = null;
        }
        return 0qQ.A0K(jwf2, jwf);
    }
}
