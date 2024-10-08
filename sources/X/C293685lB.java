package X;

/* renamed from: X.5lB  reason: invalid class name and case insensitive filesystem */
public final class C293685lB extends 1P0 {
    public final /* synthetic */ C293665l9 A00;

    public C293685lB(C293665l9 r1) {
        this.A00 = r1;
    }

    public final void onFailInBackground(C268654dm r5) {
        int A03 = AnonymousClass0fD.A03(-1372486884);
        C293665l9 r2 = this.A00;
        synchronized (r2) {
            try {
                if (r2.A00 != null) {
                    r2.A00 = null;
                    ((C363368jb) r2.A06.getValue()).A03();
                }
            } finally {
                AnonymousClass0fD.A0A(1724793353, A03);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = AnonymousClass0fD.A03(1340583925);
        NH4 nh4 = (NH4) obj;
        int A032 = AnonymousClass0fD.A03(2114526300);
        0qQ.A0B(nh4, 0);
        C293665l9 r7 = this.A00;
        synchronized (r7) {
            try {
                if (r7.A00 != null) {
                    r7.A00 = null;
                    AnonymousClass0eM r2 = r7.A06;
                    ((C363368jb) r2.getValue()).A07(nh4.A00);
                    ((C363368jb) r2.getValue()).A05(System.currentTimeMillis() + C293665l9.A0A);
                }
            } catch (Throwable th) {
                AnonymousClass0fD.A0A(-1554791828, A032);
                throw th;
            }
        }
        AnonymousClass0fD.A0A(-676541762, A032);
        AnonymousClass0fD.A0A(313936072, A03);
    }
}
