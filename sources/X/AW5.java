package X;

public final class AW5 implements C365558nJ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ 2JH A01;

    public AW5(2JH r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final void D59(AnonymousClass9GD r4) {
        String A002;
        2JH r2 = this.A01;
        Integer valueOf = Integer.valueOf(this.A00);
        if (r4.A0E()) {
            A002 = "completed";
        } else {
            A002 = 2JH.A00(r4);
        }
        2JH.A02(r2, "cancelInstall: %d completed: %s", new Object[]{valueOf, A002});
    }
}
