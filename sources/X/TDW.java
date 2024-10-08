package X;

import androidx.fragment.app.FragmentActivity;

public final class TDW implements Runnable {
    public final /* synthetic */ FragmentActivity A00;

    public TDW(FragmentActivity fragmentActivity) {
        this.A00 = fragmentActivity;
    }

    public final void run() {
        this.A00.onBackPressed();
    }
}
