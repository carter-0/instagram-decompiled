package X;

/* renamed from: X.AWw  reason: case insensitive filesystem */
public final class C40232AWw implements AnonymousClass98W {
    public static final C3739197l A01 = C3739197l.A01;
    public final AnonymousClass98Z A00;

    public C40232AWw(AnonymousClass98Z r2) {
        if (A01.A00()) {
            this.A00 = r2;
            return;
        }
        throw AnonymousClass7TG.A0q("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
