package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bloks.foa.screen.tracker.ActivityLifecycleTracker;

/* renamed from: X.Vt2  reason: case insensitive filesystem */
public final class C18505Vt2 {
    public C16502Uvy A00;
    public final int A01;
    public final Fragment A02;
    public final 0hq A03;
    public final ActivityLifecycleTracker A04;
    public final U81 A05;
    public final C14917UFb A06;
    public final Integer A07;
    public final C20942X5l A08;

    public static final void A00(C18505Vt2 vt2, C16502Uvy uvy) {
        C20942X5l x5l;
        Integer num;
        if (uvy != vt2.A00) {
            vt2.A00 = uvy;
            int ordinal = uvy.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    x5l = vt2.A08;
                    num = AnonymousClass05K.A01;
                } else if (ordinal == 2) {
                    x5l = vt2.A08;
                    num = AnonymousClass05K.A0C;
                } else {
                    throw new RuntimeException();
                }
                x5l.DDJ(num);
                return;
            }
            vt2.A08.DCH();
        }
    }

    public C18505Vt2(Fragment fragment, C20942X5l x5l) {
        U81 u81;
        this.A02 = fragment;
        this.A08 = x5l;
        0hq parentFragmentManager = fragment.getParentFragmentManager();
        this.A03 = parentFragmentManager;
        this.A01 = parentFragmentManager.A0M();
        C14917UFb uFb = new C14917UFb(this);
        this.A06 = uFb;
        FragmentActivity requireActivity = fragment.requireActivity();
        C66310MMt mMt = new C66310MMt(this, 40);
        this.A04 = new ActivityLifecycleTracker(requireActivity, mMt);
        if (fragment.mParentFragment != null) {
            0hq parentFragmentManager2 = fragment.requireParentFragment().getParentFragmentManager();
            int A0M = parentFragmentManager2.A0M();
            this.A07 = Integer.valueOf(A0M);
            u81 = new U81(fragment.requireParentFragment(), parentFragmentManager2, mMt, A0M);
        } else {
            u81 = null;
            this.A07 = null;
        }
        this.A05 = u81;
        if (!uFb.A00) {
            uFb.A00 = true;
            0hq r1 = uFb.A03;
            r1.A0r(uFb, false);
            r1.A0s(uFb);
        }
    }
}
