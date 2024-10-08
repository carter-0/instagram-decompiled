package X;

/* renamed from: X.VuJ  reason: case insensitive filesystem */
public final class C18567VuJ {
    public static final C18567VuJ A05 = new C18567VuJ();
    public final C18543Vtv A00 = C18543Vtv.A01;
    public final WM2 A01 = new WM2();
    public final WM2 A02 = new WM2();
    public final WM2 A03 = new WM2();
    public final WM1 A04 = new WM1();

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C18567VuJ)) {
            return false;
        }
        C18567VuJ vuJ = (C18567VuJ) obj;
        return this.A04.equals(vuJ.A04) && this.A02.equals(vuJ.A02) && this.A01.equals(vuJ.A01) && this.A00.equals(vuJ.A00) && this.A03.equals(vuJ.A03);
    }
}
