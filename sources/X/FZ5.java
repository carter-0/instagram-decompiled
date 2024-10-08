package X;

import com.facebook.systrace.Systrace;
import com.instagram.profile.fragment.UserDetailFragment;
import java.lang.ref.WeakReference;

public final class FZ5 implements AnonymousClass4D6 {
    public WeakReference A00;
    public final int A01;
    public final C262224Cq A02;
    public final boolean A03;

    public final void schedule(AnonymousClass11X r7) {
        UserDetailFragment userDetailFragment;
        if (Systrace.A0E(1)) {
            0fS.A01("UserDetailFragmentPrimer.ScopeScheduler.schedule", -2067923934);
        }
        try {
            WeakReference weakReference = this.A00;
            if (weakReference != null && (userDetailFragment = (UserDetailFragment) weakReference.get()) != null) {
                userDetailFragment.schedule(r7);
            } else if (r7 != null) {
                r7.onStart();
                AnonymousClass7TE.A1Z(new C51648Fy7(this, r7, (AnonymousClass4D7) null, 33), this.A02);
            }
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(-1160894737);
            }
        }
    }

    public FZ5(C262224Cq r1, int i, boolean z) {
        this.A02 = r1;
        this.A03 = z;
        this.A01 = i;
    }

    public final void schedule(AnonymousClass11X r8, int i, int i2, boolean z, boolean z2) {
        AnonymousClass4DH r1;
        WeakReference weakReference = this.A00;
        if (weakReference != null) {
            r1 = (AnonymousClass4DH) weakReference.get();
        } else {
            r1 = null;
        }
        AnonymousClass11X r2 = r8;
        if (!this.A03 || r1 == null) {
            schedule(r8);
        } else {
            r1.schedule(r2, i, i2, z, z2);
        }
    }
}
