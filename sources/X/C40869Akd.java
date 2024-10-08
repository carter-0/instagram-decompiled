package X;

/* renamed from: X.Akd  reason: case insensitive filesystem */
public final class C40869Akd implements Runnable {
    public final /* synthetic */ C332637Vu A00;

    public C40869Akd(C332637Vu r1) {
        this.A00 = r1;
    }

    public final void run() {
        C332637Vu r1 = this.A00;
        ((C274644oo) r1.A0I.invoke()).AZJ().notifyDataSetChanged();
        AnonymousClass7FA r12 = r1.A02;
        if (r12 != null) {
            r12.A05(false);
        }
    }
}
