package X;

/* renamed from: X.Akb  reason: case insensitive filesystem */
public final class C40867Akb implements Runnable {
    public final /* synthetic */ C65126Lno A00;

    public C40867Akb(C65126Lno lno) {
        this.A00 = lno;
    }

    public final void run() {
        AnonymousClass8QZ r3 = this.A00.A00;
        if (r3.A0R.getCount() == 1 && r3.A08 == null && AnonymousClass7TE.A0q(r3.A0O).getInt("gallery_thumbnail_tray_preview_tooltip", 0) < 3) {
            AnonymousClass8QZ.A06(r3, AnonymousClass7TE.A16(r3.A0L.getContext(), 2131962976), new AnonymousClass9L5(r3, 11));
        }
    }
}
