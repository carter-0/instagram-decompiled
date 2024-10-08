package X;

import androidx.fragment.app.FragmentActivity;

public final class TG1 implements Runnable {
    public final /* synthetic */ 0SM A00;
    public final /* synthetic */ FragmentActivity A01;

    public TG1(0SM r1, FragmentActivity fragmentActivity) {
        this.A00 = r1;
        this.A01 = fragmentActivity;
    }

    public final void run() {
        this.A00.A0B(this.A01.getSupportFragmentManager(), "consent_dialog");
    }
}
