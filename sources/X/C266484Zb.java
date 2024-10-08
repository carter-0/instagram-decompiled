package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.4Zb  reason: invalid class name and case insensitive filesystem */
public final class C266484Zb implements AnonymousClass11X {
    public C268654dm A00;
    public C268654dm A01;
    public 1XR A02;
    public 1XR A03;
    public final 1P0 A04;
    public final AnonymousClass4Z9 A05;
    public final CountDownLatch A06 = new CountDownLatch(1);

    public C266484Zb(1P0 r3, AnonymousClass4Z9 r4) {
        this.A05 = r4;
        this.A04 = r3;
        r4.A00(new C266494Zc(this));
    }

    public final void onCancel() {
    }

    public final String getName() {
        return this.A05.getName();
    }

    public final int getRunnableId() {
        return this.A05.A07.A04.runnableId;
    }

    public final void onFinish() {
        if (this.A06.getCount() > 0) {
            0wb.A03("HttpRequestConnectTask", "onFinish could not be called before the task is finished");
        }
        1P0 r1 = this.A04;
        r1.onFinish();
        1XR r0 = this.A02;
        if (r0 != null) {
            r1.onSuccess(r0);
            return;
        }
        C268654dm r02 = this.A00;
        if (r02 != null) {
            r1.onFail(r02);
        }
    }

    public final void onStart() {
        this.A04.onStart();
    }

    public final void run() {
        try {
            this.A06.await();
        } catch (InterruptedException unused) {
        }
        1XR r1 = this.A03;
        if (r1 != null) {
            this.A04.onSuccessInBackground(r1);
            return;
        }
        C268654dm r12 = this.A01;
        if (r12 != null) {
            this.A04.onFailInBackground(r12);
        }
    }
}
