package X;

/* renamed from: X.WiW  reason: case insensitive filesystem */
public final class C19959WiW implements Runnable {
    public final /* synthetic */ U3N A00;

    public C19959WiW(U3N u3n) {
        this.A00 = u3n;
    }

    public final void run() {
        U3N u3n = this.A00;
        u3n.removeCallbacks(u3n.A05);
        u3n.removeCallbacks(u3n.A04);
        u3n.A01 = true;
        U12 u12 = u3n.A00;
        if (u12 != null) {
            C14090Tph tph = u12.A03;
            if (tph != null) {
                tph.A01();
            }
            u12.A03 = null;
        }
    }
}
