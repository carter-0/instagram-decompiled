package X;

/* renamed from: X.4ZA  reason: invalid class name */
public final class AnonymousClass4ZA extends 1P0 {
    public final /* synthetic */ AnonymousClass4Z9 A00;

    public final synchronized void onFail(C268654dm r4) {
        int A03 = AnonymousClass0fD.A03(-1006331159);
        0qQ.A0B(r4, 0);
        AnonymousClass4Z9 r1 = this.A00;
        r1.A00 = r4;
        1P0 r0 = r1.A06;
        if (r0 != null) {
            r0.onFail(r4);
        }
        for (1P0 onFail : r1.A09) {
            onFail.onFail(r4);
        }
        AnonymousClass0fD.A0A(-369024525, A03);
    }

    public final synchronized void onFailInBackground(C268654dm r4) {
        int A03 = AnonymousClass0fD.A03(57307722);
        0qQ.A0B(r4, 0);
        AnonymousClass4Z9 r1 = this.A00;
        r1.A01 = r4;
        1P0 r0 = r1.A06;
        if (r0 != null) {
            r0.onFailInBackground(r4);
        }
        for (1P0 onFailInBackground : r1.A09) {
            onFailInBackground.onFailInBackground(r4);
        }
        AnonymousClass0fD.A0A(1067117705, A03);
    }

    public final synchronized void onFinish() {
        int A03 = AnonymousClass0fD.A03(2089946364);
        AnonymousClass4Z9 r1 = this.A00;
        r1.A04 = true;
        1P0 r0 = r1.A06;
        if (r0 != null) {
            r0.onFinish();
        }
        for (1P0 onFinish : r1.A09) {
            onFinish.onFinish();
        }
        AnonymousClass0fD.A0A(1227261742, A03);
    }

    public final synchronized void onStart() {
        int A03 = AnonymousClass0fD.A03(1535617924);
        AnonymousClass4Z9 r1 = this.A00;
        r1.A05 = true;
        1P0 r0 = r1.A06;
        if (r0 != null) {
            r0.onStart();
        }
        for (1P0 onStart : r1.A09) {
            onStart.onStart();
        }
        AnonymousClass0fD.A0A(880642472, A03);
    }

    public AnonymousClass4ZA(AnonymousClass4Z9 r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(57372988);
        1XR r6 = (1XR) obj;
        synchronized (this) {
            int A032 = AnonymousClass0fD.A03(2141000644);
            0qQ.A0B(r6, 0);
            AnonymousClass4Z9 r1 = this.A00;
            r1.A02 = r6;
            1P0 r0 = r1.A06;
            if (r0 != null) {
                r0.onSuccess(r6);
            }
            for (1P0 onSuccess : r1.A09) {
                onSuccess.onSuccess(r6);
            }
            AnonymousClass0fD.A0A(1606911864, A032);
        }
        AnonymousClass0fD.A0A(551546893, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = AnonymousClass0fD.A03(1813318779);
        1XR r6 = (1XR) obj;
        synchronized (this) {
            int A032 = AnonymousClass0fD.A03(-363529930);
            0qQ.A0B(r6, 0);
            AnonymousClass4Z9 r1 = this.A00;
            r1.A03 = r6;
            1P0 r0 = r1.A06;
            if (r0 != null) {
                r0.onSuccessInBackground(r6);
            }
            for (1P0 onSuccessInBackground : r1.A09) {
                onSuccessInBackground.onSuccessInBackground(r6);
            }
            AnonymousClass0fD.A0A(-1628175278, A032);
        }
        AnonymousClass0fD.A0A(-1796546934, A03);
    }
}
