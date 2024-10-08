package X;

import android.app.Application;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bloks.foa.screen.tracker.ActivityLifecycleTracker;

/* renamed from: X.UFb  reason: case insensitive filesystem */
public final class C14917UFb extends U81 {
    public final /* synthetic */ C18505Vt2 A00;

    public final void A08(Fragment fragment, 0hq r7) {
        C18505Vt2 vt2 = this.A00;
        if (fragment.equals(vt2.A02)) {
            ActivityLifecycleTracker activityLifecycleTracker = vt2.A04;
            if (!activityLifecycleTracker.A00) {
                activityLifecycleTracker.A00 = true;
                Application application = activityLifecycleTracker.A01.getApplication();
                if (application != null) {
                    application.registerActivityLifecycleCallbacks(activityLifecycleTracker);
                }
            }
            U81 u81 = vt2.A05;
            if (u81 != null && !u81.A00) {
                u81.A00 = true;
                0hq r1 = u81.A03;
                r1.A0r(u81, false);
                r1.A0s(u81);
            }
            C18505Vt2.A00(vt2, C16502Uvy.ENTER);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14917UFb(C18505Vt2 vt2) {
        super(vt2.A02, vt2.A03, new C20596WvZ(vt2, 0), vt2.A01);
        this.A00 = vt2;
    }

    public final void A03(Bundle bundle, Fragment fragment, 0hq r6) {
        C18505Vt2 vt2 = this.A00;
        if (fragment.equals(vt2.A02)) {
            bundle.putInt("key_bloks_navigation_tracker_backstack_size", vt2.A01);
            Integer num = vt2.A07;
            if (num != null) {
                bundle.putInt("key_bloks_navigation_tracker_parent_backstack_size", num.intValue());
            }
        }
    }

    public final void A04(Fragment fragment, 0hq r5) {
        AnonymousClass7TG.A1N(r5, fragment);
        super.A04(fragment, r5);
        C18505Vt2 vt2 = this.A00;
        if (fragment.equals(vt2.A02)) {
            C14917UFb uFb = vt2.A06;
            if (uFb.A00) {
                uFb.A00 = false;
                0hq r0 = uFb.A03;
                r0.A0q(uFb);
                r0.A0F.remove(uFb);
            }
            ActivityLifecycleTracker activityLifecycleTracker = vt2.A04;
            if (activityLifecycleTracker.A00) {
                activityLifecycleTracker.A00 = false;
                Application application = activityLifecycleTracker.A01.getApplication();
                if (application != null) {
                    application.unregisterActivityLifecycleCallbacks(activityLifecycleTracker);
                }
            }
            U81 u81 = vt2.A05;
            if (u81 != null && u81.A00) {
                u81.A00 = false;
                0hq r02 = u81.A03;
                r02.A0q(u81);
                r02.A0F.remove(u81);
            }
        }
    }
}
