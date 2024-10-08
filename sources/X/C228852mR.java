package X;

/* renamed from: X.2mR  reason: invalid class name and case insensitive filesystem */
public final class C228852mR implements AnonymousClass1GR {
    public boolean A00;
    public final 1P0 A01;

    public C228852mR(1P0 r2) {
        0qQ.A0B(r2, 1);
        this.A01 = r2;
    }

    public final void D58(AnonymousClass1QW r1, AnonymousClass2ZK r2) {
    }

    public final void DEO(C268654dm r2, AnonymousClass1QW r3) {
        0qQ.A0B(r2, 1);
        this.A01.onFail(r2);
    }

    public final void DEQ(C268654dm r6, AnonymousClass1QW r7) {
        String str;
        0qQ.A0B(r6, 1);
        Throwable A012 = r6.A01();
        String str2 = null;
        if (A012 != null) {
            str = A012.getMessage();
        } else {
            str = null;
        }
        0wb.A03(C273654mx.A00(1389), 002.A0R("error=", str));
        if (this.A00) {
            if (A012 != null) {
                str2 = A012.getMessage();
            }
            0wb.A03(C273654mx.A00(1390), 002.A0R("error=", str2));
        }
        this.A01.onFailInBackground(r6);
    }

    public final /* bridge */ /* synthetic */ void DTw(1XR r2, AnonymousClass1QW r3, AnonymousClass2ZK r4) {
        0qQ.A0B(r2, 2);
        this.A01.onSuccess(r2);
    }

    public final void DTx() {
    }

    public final /* bridge */ /* synthetic */ void DTy(1XR r2, AnonymousClass1QW r3, AnonymousClass2ZK r4) {
        0qQ.A0B(r2, 2);
        this.A00 = true;
        this.A01.onSuccessInBackground(r2);
    }

    public final void DeX() {
        this.A01.onFinish();
    }

    public final void Den() {
        this.A01.onStart();
    }

    public final void DfH(AnonymousClass1QW r2, AnonymousClass2ZK r3) {
        this.A01.onResponseStarted();
    }
}
