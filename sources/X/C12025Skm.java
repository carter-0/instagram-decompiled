package X;

import android.os.Looper;
import android.os.Message;

/* renamed from: X.Skm  reason: case insensitive filesystem */
public final class C12025Skm implements C274834pA {
    public final int A00;
    public final C274854pC A01 = new C274854pC();

    public final void Ewt(Message message) {
        C274854pC r0;
        0qQ.A0B(message, 0);
        int i = this.A00;
        if (i == 1) {
            r0 = this.A01;
        } else if (i == 2) {
            r0 = this.A01;
            r0.A05(message);
        } else {
            return;
        }
        r0.A02();
    }

    public final void Ex8(Looper looper, String str) {
    }

    public final void AVV(Message message) {
        C274854pC r0;
        int i = this.A00;
        if (i == 1) {
            r0 = this.A01;
        } else if (i == 2) {
            r0 = this.A01;
            r0.A03();
        } else {
            return;
        }
        r0.A04();
    }

    public final void AVY() {
        C274854pC r0;
        int i = this.A00;
        if (i == 1) {
            r0 = this.A01;
        } else if (i == 2) {
            r0 = this.A01;
            r0.A03();
        } else {
            return;
        }
        r0.A04();
    }

    public final void ExE() {
        C274854pC r1;
        int i = this.A00;
        if (i == 1) {
            r1 = this.A01;
        } else if (i == 2) {
            r1 = this.A01;
            r1.A0A = true;
        } else {
            return;
        }
        r1.A02();
    }

    public C12025Skm(int i) {
        this.A00 = i;
    }
}
