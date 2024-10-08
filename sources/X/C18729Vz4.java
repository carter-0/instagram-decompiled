package X;

/* renamed from: X.Vz4  reason: case insensitive filesystem */
public final class C18729Vz4 {
    public boolean A00;
    public final /* synthetic */ C19869Wgw A01;

    public C18729Vz4(C19869Wgw wgw) {
        this.A01 = wgw;
    }

    public static void A00(C18729Vz4 vz4, Exception exc) {
        if (!vz4.A00) {
            vz4.A00 = true;
            VQS vqs = vz4.A01.A0A;
            synchronized (vqs) {
                if (!vqs.A01) {
                    vqs.A01 = true;
                    vqs.A00 = exc;
                    vqs.notifyAll();
                }
            }
        }
    }

    public C18729Vz4() {
    }
}
