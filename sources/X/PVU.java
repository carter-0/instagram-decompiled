package X;

public final class PVU implements Runnable {
    public final /* synthetic */ C67737Mtq A00;

    public PVU(C67737Mtq mtq) {
        this.A00 = mtq;
    }

    public final void run() {
        C67737Mtq mtq = this.A00;
        if (!mtq.A00.hasNext()) {
            mtq.A00 = mtq.A03.listIterator();
        }
        int A0M = AnonymousClass7TE.A0M(mtq.A00.next());
        05G r3 = mtq.A04;
        r3.getValue();
        r3.Epw(new C61078JwG((Object) Integer.valueOf(A0M), 2));
        mtq.A01.postDelayed(this, 4000);
    }
}
