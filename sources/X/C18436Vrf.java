package X;

/* renamed from: X.Vrf  reason: case insensitive filesystem */
public final class C18436Vrf {
    public WM2 A00;
    public WM2 A01;

    public static WM2 A00(C18436Vrf vrf) {
        WM2 wm2 = vrf.A00;
        WM2 wm22 = vrf.A01;
        if (wm2 != wm22) {
            return wm22;
        }
        WM2 wm23 = new WM2(wm2);
        vrf.A01 = wm23;
        return wm23;
    }

    public C18436Vrf() {
        WM2 wm2 = new WM2();
        this.A01 = wm2;
        this.A00 = wm2;
    }
}
