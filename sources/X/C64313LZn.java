package X;

/* renamed from: X.LZn  reason: case insensitive filesystem */
public final /* synthetic */ class C64313LZn implements AnonymousClass2gO {
    public final /* synthetic */ KI1 A00;

    public /* synthetic */ C64313LZn(KI1 ki1) {
        this.A00 = ki1;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.KI1, android.view.View, java.lang.Object] */
    public final void onChanged(Object obj) {
        ? r6 = this.A00;
        if ((obj instanceof K3L) && r6.A06.compareAndSet(false, true)) {
            MMP mmp = new MMP(r6, 7);
            C294975nL A0c = JTP.A0c(r6, 0);
            A0c.A0I(0.0f);
            A0c.A0P(0.0f, ((float) r6.getMeasuredWidth()) / 2.0f);
            A0c.A0Q(0.0f, ((float) r6.getMeasuredHeight()) / 2.0f);
            A0c.A06 = new C65726Lyg(mmp, 1);
            A0c.A0H();
        }
    }
}
