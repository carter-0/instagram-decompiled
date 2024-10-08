package X;

/* renamed from: X.FsN  reason: case insensitive filesystem */
public final class C51329FsN implements Runnable {
    public final /* synthetic */ EDH A00;
    public final /* synthetic */ String A01;

    public C51329FsN(EDH edh, String str) {
        this.A00 = edh;
        this.A01 = str;
    }

    public final void run() {
        EDH edh = this.A00;
        if (!edh.A00.requireActivity().isFinishing()) {
            boolean z = AnonymousClass36O.A0G;
            AnonymousClass36Q.A03(edh.A01, edh.A02, this.A01);
        }
    }
}
