package X;

/* renamed from: X.6ox  reason: invalid class name and case insensitive filesystem */
public final class C318446ox implements AnonymousClass1GR {
    public boolean A00;
    public final C324596za A01;
    public final C324366zA A02;
    public final AnonymousClass11X A03;

    public C318446ox(AnonymousClass11X r2, C324596za r3, C324366zA r4) {
        0qQ.A0B(r4, 2);
        this.A03 = r2;
        this.A02 = r4;
        this.A01 = r3;
    }

    public final void DEO(C268654dm r3, AnonymousClass1QW r4) {
        0qQ.A0B(r3, 1);
        C324366zA r1 = this.A02;
        r1.A01 = null;
        r1.A00(AnonymousClass05K.A01);
        this.A01.onFail(r3);
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
        0wb.A03("StreamingFeedRequestCallbackFailure", 002.A0R("error=", str));
        if (this.A00) {
            if (A012 != null) {
                str2 = A012.getMessage();
            }
            0wb.A03("StreamingFeedRequestCallbackPartialFailure", 002.A0R("error=", str2));
        }
        this.A01.onFailInBackground(r6);
    }

    public final void DTx() {
    }

    public final /* bridge */ /* synthetic */ void DTy(1XR r2, AnonymousClass1QW r3, AnonymousClass2ZK r4) {
        0qQ.A0B(r2, 2);
        this.A00 = true;
        this.A01.onSuccessInBackground(r2);
    }

    public final void D58(AnonymousClass1QW r3, AnonymousClass2ZK r4) {
        C324366zA r1 = this.A02;
        r1.A01 = null;
        r1.A00(AnonymousClass05K.A0C);
    }

    public final /* bridge */ /* synthetic */ void DTw(1XR r4, AnonymousClass1QW r5, AnonymousClass2ZK r6) {
        AnonymousClass1XV r42 = (AnonymousClass1XV) r4;
        0qQ.A0B(r42, 2);
        C324366zA r2 = this.A02;
        r2.A07 = r42.getNextMaxId();
        r2.A0A = r42.CP6();
        if (r42 instanceof C298815u5) {
            r2.A02 = ((C298815u5) r42).A01;
        }
        if (r42 instanceof C273664mz) {
            C273664mz r1 = (C273664mz) r42;
            r2.A09 = r1.A02;
            r2.A08 = r1.A01;
        }
        this.A01.onSuccess(r42);
    }

    public final void DeX() {
        C324366zA r2 = this.A02;
        r2.A01 = null;
        if (r2.A03 == AnonymousClass05K.A00) {
            r2.A00(AnonymousClass05K.A0C);
        }
        this.A01.onFinish();
    }

    public final void Den() {
        C324366zA r1 = this.A02;
        r1.A00(AnonymousClass05K.A00);
        r1.A01 = this.A03;
        this.A01.onStart();
    }

    public final void DfH(AnonymousClass1QW r2, AnonymousClass2ZK r3) {
        this.A01.onResponseStarted();
    }
}
