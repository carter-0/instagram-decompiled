package X;

/* renamed from: X.8nH  reason: invalid class name and case insensitive filesystem */
public final class C365538nH implements C365558nJ {
    public final /* synthetic */ 2JH A00;
    public final /* synthetic */ String A01;

    public C365538nH(2JH r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final void D59(AnonymousClass9GD r4) {
        String A002;
        if (r4.A0E()) {
            A002 = "successful";
        } else {
            A002 = 2JH.A00(r4);
        }
        2JH.A02(this.A00, "deferredInstall: %s result: %s", new Object[]{this.A01, A002});
    }
}
