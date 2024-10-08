package X;

import android.view.View;

public final class Y0B implements C357708Zh {
    public int A00 = -1;
    public Runnable A01 = new C22389Y1u(this);
    public boolean A02;
    public final View A03;
    public final AnonymousClass8N0 A04;
    public final AnonymousClass869 A05;

    public Y0B(View view, AnonymousClass869 r3, AnonymousClass8N0 r4) {
        DbZ.A0t(1, view, r3, r4);
        this.A03 = view;
        this.A05 = r3;
        this.A04 = r4;
    }

    public final int B85() {
        int A002 = this.A05.A00();
        if (A002 < 0) {
            return -1;
        }
        return A002;
    }

    public final void Exh() {
        if (!this.A02) {
            this.A02 = true;
            View view = this.A03;
            Runnable runnable = this.A01;
            if (runnable == null) {
                0qQ.A0F("timeRunnable");
                throw AnonymousClass00P.createAndThrow();
            } else {
                view.postOnAnimation(runnable);
            }
        }
    }

    public final void EyM() {
        if (this.A02) {
            this.A02 = false;
            View view = this.A03;
            Runnable runnable = this.A01;
            if (runnable == null) {
                0qQ.A0F("timeRunnable");
                throw AnonymousClass00P.createAndThrow();
            } else {
                view.removeCallbacks(runnable);
            }
        }
    }

    public final int getDurationInMs() {
        int i;
        AnonymousClass869 r1 = this.A05;
        if (!r1.A03 || (i = r1.A01) < 0) {
            return -1;
        }
        return i;
    }

    public final void onDestroyView() {
        this.A04.A00.A0B(AnonymousClass8N0.A01);
        EyM();
    }

    public final /* synthetic */ int Bd7() {
        return 0;
    }

    public final /* synthetic */ int CEG() {
        return 0;
    }
}
