package X;

/* renamed from: X.94H  reason: invalid class name */
public final class AnonymousClass94H extends 1P0 {
    public final /* synthetic */ C363288jT A00;

    public AnonymousClass94H(C363288jT r1) {
        this.A00 = r1;
    }

    public final void onFailInBackground(C268654dm r5) {
        int A03 = AnonymousClass0fD.A03(89890893);
        C363288jT r2 = this.A00;
        synchronized (r2) {
            try {
                if (r2.A00 != null) {
                    r2.A00 = null;
                    C363288jT.A02(r2);
                }
            } catch (Throwable th) {
                while (true) {
                    AnonymousClass0fD.A0A(775335359, A03);
                    throw th;
                }
            }
        }
        AnonymousClass0fD.A0A(882725542, A03);
    }

    /* JADX WARNING: type inference failed for: r0v17, types: [X.1qK, java.lang.Object] */
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1366292016);
        AnonymousClass94F r14 = (AnonymousClass94F) obj;
        int A032 = AnonymousClass0fD.A03(-1110474627);
        C363288jT r4 = this.A00;
        synchronized (r4) {
            try {
                if (r4.A00 != null) {
                    r4.A00 = null;
                    C363288jT.A01(r4);
                    C363368jb r10 = r4.A02;
                    r10.A07(r14.A01);
                    for (Object A02 : r14.A01) {
                        r4.A04.A02(A02);
                    }
                    C363368jb r9 = r4.A01;
                    r9.A07(r14.A00);
                    long j = -1;
                    for (C293645l7 r0 : r9.A05.values()) {
                        long j2 = r0.A00;
                        if (j == -1 || j2 == -1) {
                            j = j2;
                        } else {
                            j = Math.min(j, j2);
                        }
                    }
                    long j3 = -1;
                    if (j != -1) {
                        j3 = System.currentTimeMillis() + (j * 1000);
                    }
                    r10.A05(j3);
                    r9.A05(j3);
                    r10.A04();
                    r9.A04();
                    AnonymousClass1Nd.A00(r4.A03).A00(new Object());
                }
            } catch (Throwable th) {
                while (true) {
                    AnonymousClass0fD.A0A(1154365239, A032);
                    throw th;
                }
            }
        }
        AnonymousClass0fD.A0A(1090676721, A032);
        AnonymousClass0fD.A0A(-1166865352, A03);
    }
}
