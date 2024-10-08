package X;

/* renamed from: X.8Li  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C354278Li implements AnonymousClass2gO {
    public final /* synthetic */ C354248Lf A00;

    public /* synthetic */ C354278Li(C354248Lf r1) {
        this.A00 = r1;
    }

    public final void onChanged(Object obj) {
        C354248Lf r1 = this.A00;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        r1.A03 = booleanValue;
        if (booleanValue) {
            C354248Lf.A01(r1);
            return;
        }
        C378369Pn r12 = r1.A06.A0B;
        if (r12 != null) {
            r12.A09(false);
        }
    }
}
