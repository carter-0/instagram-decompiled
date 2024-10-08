package X;

/* renamed from: X.4rw  reason: invalid class name and case insensitive filesystem */
public final class C275784rw implements C61110lV {
    public final /* synthetic */ C275764ru A00;

    public C275784rw(C275764ru r1) {
        this.A00 = r1;
    }

    public final void onAppBackgrounded() {
        int A03 = AnonymousClass0fD.A03(-184540720);
        C275764ru r2 = this.A00;
        Long A002 = C275764ru.A00(r2, System.currentTimeMillis());
        if (A002 != null) {
            r2.A00 = A002;
            r2.A01.A05(r2.A06);
        }
        AnonymousClass0fD.A0A(1782762717, A03);
    }

    public final void onAppForegrounded() {
        int A03 = AnonymousClass0fD.A03(-1430774845);
        C275764ru r2 = this.A00;
        Long l = r2.A00;
        if (l != null) {
            r2.A01(l.longValue());
        }
        r2.A00 = null;
        AnonymousClass0fD.A0A(-312732452, A03);
    }
}
