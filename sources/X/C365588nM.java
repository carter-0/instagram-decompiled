package X;

/* renamed from: X.8nM  reason: invalid class name and case insensitive filesystem */
public final class C365588nM implements C70062Je {
    public final /* synthetic */ 2JF A00;

    public C365588nM(2JF r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void Dmy(Object obj) {
        C10893Rzt rzt = (C10893Rzt) obj;
        2JF r3 = this.A00;
        synchronized (r3) {
            int i = ((Qy2) rzt).A01;
            boolean z = true;
            if (!(i == 2 || i == 1 || i == 4)) {
                z = false;
            }
            r3.A02 = z;
        }
        r3.A0D.execute(new C40977AmN(this, rzt));
    }
}
