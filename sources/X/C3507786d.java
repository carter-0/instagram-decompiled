package X;

/* renamed from: X.86d  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C3507786d implements AnonymousClass2gO {
    public final /* synthetic */ AnonymousClass80R A00;

    public /* synthetic */ C3507786d(AnonymousClass80R r1) {
        this.A00 = r1;
    }

    public final void onChanged(Object obj) {
        C331157Pu r0;
        AnonymousClass80R r3 = this.A00;
        if (!r3.A1q.A03) {
            return;
        }
        if (obj.equals(AnonymousClass826.PENDING_OPEN)) {
            if (!r3.A0W.A0V(C358088aL.A0K)) {
                AnonymousClass80R.A04(r3);
            }
            r3.A0G.A00(r3.A09, r3.A00);
        } else if (obj.equals(AnonymousClass826.PENDING_CLOSE) && (r0 = r3.A0G.A00) != null) {
            r0.A07();
        }
    }
}
