package X;

/* renamed from: X.IHh  reason: case insensitive filesystem */
public final class C56912IHh implements C74290PsI {
    public final int A00;
    public final Object A01;

    public C56912IHh(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* bridge */ /* synthetic */ void run(Object obj) {
        C71087ObS obS;
        switch (this.A00) {
            case 0:
                obS = (C71087ObS) this.A01;
                if (obj == null) {
                    obj = new N0J(new Exception());
                    break;
                }
                break;
            case 1:
                obS = (C71087ObS) this.A01;
                if (obj == null) {
                    obj = new N0J(new Exception());
                    break;
                }
                break;
            default:
                if (!(obj instanceof N0I)) {
                    obj = new N0J((Exception) null);
                }
                AnonymousClass67Z r0 = (AnonymousClass67Z) this.A01;
                0qQ.A0A(r0);
                r0.A02(obj);
                r0.A00();
                return;
        }
        obS.A05(obj);
    }
}
