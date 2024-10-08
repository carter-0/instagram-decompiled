package X;

/* renamed from: X.8na  reason: invalid class name and case insensitive filesystem */
public final class C365728na implements C365558nJ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ 2JH A01;

    public C365728na(2JH r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final void D59(AnonymousClass9GD r4) {
        Object A002;
        2JH r2 = this.A01;
        Integer valueOf = Integer.valueOf(this.A00);
        if (r4.A0E()) {
            A002 = r4.A06();
            A002.getClass();
        } else {
            A002 = 2JH.A00(r4);
        }
        2JH.A02(r2, "startInstall onCompleted id: %d result: %s", new Object[]{valueOf, A002});
    }
}
