package X;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;

/* renamed from: X.3Kq  reason: invalid class name and case insensitive filesystem */
public abstract class C240373Kq extends C240383Kr implements AnonymousClass0iw, AnonymousClass4D6, AnonymousClass4DJ, AnonymousClass4DK, AnonymousClass4DL, AnonymousClass4DP, AnonymousClass4DQ {
    public static final String __redex_internal_original_name = "IgDialogFragmentCompat";
    public AnonymousClass378 A00;
    public final C227622jd A01 = new C227622jd();
    public final C227632je A02 = new C227632je();

    public abstract 0lg A0M();

    public final void addFragmentVisibilityListener(C238693Db r2) {
        0qQ.A0B(r2, 0);
        this.A02.addFragmentVisibilityListener(r2);
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return C3253772d.A01(this, i2, z, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        this.A01.A0C(view);
    }

    public final void registerLifecycleListener(C252243on r2) {
        0qQ.A0B(r2, 0);
        this.A01.A0E(r2);
    }

    public final void removeFragmentVisibilityListener(C238693Db r2) {
        0qQ.A0B(r2, 0);
        this.A02.removeFragmentVisibilityListener(r2);
    }

    public final void unregisterLifecycleListener(C252243on r2) {
        0qQ.A0B(r2, 0);
        this.A01.A00.remove(r2);
    }

    public void A0I() {
        this.A01.A05();
        AnonymousClass378 r0 = this.A00;
        if (r0 != null) {
            r0.A00();
        }
    }

    public final AnonymousClass378 getFragmentVisibilityDetector() {
        return this.A00;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.07Z, androidx.fragment.app.Fragment, X.3Kq] */
    public final void schedule(AnonymousClass11X r3) {
        if (r3 != null) {
            1ES.A00(requireContext(), AnonymousClass07i.A00(this), r3);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final Activity getRootActivity() {
        Context context = getContext();
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            Activity parent = activity.getParent();
            if (parent != null) {
                return parent;
            }
            return activity;
        }
        throw new RuntimeException("Fragment is not attached.");
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C240373Kq.super.onActivityResult(i, i2, intent);
        this.A01.A08(i, i2, intent);
    }

    public final Animator onCreateAnimator(int i, boolean z, int i2) {
        return C3253772d.A00(this, i2, z);
    }

    public final void onViewStateRestored(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(243126670);
        C240373Kq.super.onViewStateRestored(bundle);
        this.A01.A0B(bundle);
        AnonymousClass0fD.A09(907210736, A022);
    }

    public final void schedule(AnonymousClass11X r1, int i, int i2, boolean z, boolean z2) {
        schedule(r1);
    }
}
