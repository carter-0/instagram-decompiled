package X;

import java.util.HashSet;
import java.util.Set;

/* renamed from: X.4Z9  reason: invalid class name */
public final class AnonymousClass4Z9 implements AnonymousClass11X {
    public C268654dm A00;
    public C268654dm A01;
    public 1XR A02;
    public 1XR A03;
    public boolean A04;
    public boolean A05;
    public final 1P0 A06;
    public final 1OC A07;
    public final C61480nO A08;
    public final Set A09 = new HashSet();
    public final 1P0 A0A;

    public AnonymousClass4Z9(1P0 r2, 1OC r3, C61480nO r4) {
        0qQ.A0B(r3, 1);
        this.A07 = r3;
        this.A08 = r4;
        this.A06 = r2;
        AnonymousClass4ZA r0 = new AnonymousClass4ZA(this);
        this.A0A = r0;
        r3.A00 = r0;
    }

    public final void onCancel() {
    }

    public final String toString() {
        return "HttpEngine";
    }

    public final void A00(1P0 r5) {
        synchronized (this.A0A) {
            if (this.A05) {
                r5.onStart();
            }
            if (this.A03 != null) {
                this.A08.ATE(new AnonymousClass5IA(r5, this, this.A07.A04.runnableId));
            }
            if (this.A01 != null) {
                this.A08.ATE(new H88(r5, this, this.A07.A04.runnableId));
            }
            if (this.A04) {
                int A002 = 2Ri.A00(r5.getClass(), this.A07.A05, "ReplayableHttpRequestTask.onFinish");
                r5.onFinish();
                2Ri.A00.ASJ(A002);
            }
            if (this.A02 != null) {
                int A003 = 2Ri.A00(r5.getClass(), this.A07.A05, "ReplayableHttpRequestTask.onSuccess");
                1XR r0 = this.A02;
                0qQ.A0A(r0);
                r5.onSuccess(r0);
                2Ri.A00.ASJ(A003);
            }
            if (this.A00 != null) {
                int A004 = 2Ri.A00(r5.getClass(), this.A07.A05, "ReplayableHttpRequestTask.onFail");
                C268654dm r02 = this.A00;
                0qQ.A0A(r02);
                r5.onFail(r02);
                2Ri.A00.ASJ(A004);
            }
            this.A09.add(r5);
        }
    }

    public final String getName() {
        return 002.A0R("replayable ", this.A07.A05);
    }

    public final int getRunnableId() {
        return this.A07.A04.runnableId;
    }

    public final void onFinish() {
        this.A07.onFinish();
    }

    public final void onStart() {
        this.A07.onStart();
    }

    public final void run() {
        this.A07.run();
    }
}
