package X;

/* renamed from: X.Ajf  reason: case insensitive filesystem */
public final class C40809Ajf implements Runnable {
    public final /* synthetic */ C362178hT A00;

    public C40809Ajf(C362178hT r1) {
        this.A00 = r1;
    }

    public final void run() {
        C362178hT r3 = this.A00;
        if (r3.A03().A1D.isShowing()) {
            AnonymousClass9PQ.A05(r3.A0I, r3.A0J, AnonymousClass05K.A0Y);
            r3.A03().A1D.dismiss();
            C59689JTv.A0F(r3.A0H.requireContext(), "gallery_meta_gallery_netego_album_fetch_failed", 2131962942);
        }
    }
}
