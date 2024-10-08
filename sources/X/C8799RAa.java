package X;

/* renamed from: X.RAa  reason: case insensitive filesystem */
public final class C8799RAa extends 0vM {
    public final /* synthetic */ C242143Su A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8799RAa(C242143Su r7) {
        super("foregroundlocation", 511, 5, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        try {
            C242143Su r1 = this.A00;
            if (r1.A03) {
                C242143Su.A01(r1);
                r1.A03 = false;
            }
        } catch (Exception e) {
            0wb.A06(AnonymousClass000.A00(952), "app-foregrounded", e);
        }
    }
}
