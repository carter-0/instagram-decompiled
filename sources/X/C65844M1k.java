package X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.M1k  reason: case insensitive filesystem */
public final class C65844M1k implements Runnable {
    public final /* synthetic */ KB0 A00;

    public C65844M1k(KB0 kb0) {
        this.A00 = kb0;
    }

    public final void run() {
        KB0 kb0 = this.A00;
        FragmentActivity fragmentActivity = kb0.A07;
        0hq r0 = kb0.A08;
        if (r0 != null && AnonymousClass06S.A01(r0) && fragmentActivity != null) {
            fragmentActivity.onBackPressed();
        }
    }
}
