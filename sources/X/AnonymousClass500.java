package X;

import android.os.Looper;
import android.os.Message;
import android.os.Process;

/* renamed from: X.500  reason: invalid class name */
public final class AnonymousClass500 implements C274834pA {
    public int A00;
    public boolean A01;
    public final AnonymousClass2TF A02;
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A00(0eO.A02, new C377179Kv(this, 6));
    public final int A04;

    public final void Ex8(Looper looper, String str) {
    }

    private final void A00() {
        AnonymousClass2TF r1 = this.A02;
        if (!r1.A06() || !this.A01) {
            if (r1.A07()) {
                this.A00 = Process.getThreadPriority(0);
            }
            A01(this.A04);
            this.A01 = true;
        }
    }

    private final void A01(int i) {
        if (this.A02.A09()) {
            C39665A4f a4f = (C39665A4f) this.A03.getValue();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - a4f.A00 > a4f.A01) {
                a4f.A00 = currentTimeMillis;
            } else {
                return;
            }
        }
        Process.setThreadPriority(i);
    }

    public final void AVV(Message message) {
        if (this.A02.A07()) {
            A01(this.A00);
        }
    }

    public final void AVY() {
        AnonymousClass2TF r1 = this.A02;
        if (r1.A08() && r1.A07()) {
            A01(this.A00);
        }
    }

    public final void ExE() {
        if (this.A02.A08()) {
            A00();
        }
    }

    public AnonymousClass500(AnonymousClass2TF r4) {
        this.A02 = r4;
        this.A04 = r4.A00();
    }

    public final void Ewt(Message message) {
        A00();
    }
}
