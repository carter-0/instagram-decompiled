package X;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.2jV  reason: invalid class name and case insensitive filesystem */
public abstract class C227542jV extends C227552jW implements AnonymousClass0iw, AnonymousClass4D6, AnonymousClass4DJ, AnonymousClass4DK, AnonymousClass4DL, AnonymousClass4DP {
    public static final String __redex_internal_original_name = "IgViewLessFragment";
    public Rect A00;
    public AnonymousClass378 A01;
    public final C227622jd A02 = new C227622jd();
    public final C227632je A03 = new C227632je();

    public final void onSetUserVisibleHint(boolean z, boolean z2) {
        AnonymousClass378 r0;
        boolean z3 = false;
        if (z2 != z) {
            z3 = true;
        }
        this.A03.A00(this, z);
        if (z3 && (r0 = this.A01) != null) {
            r0.A00();
        }
    }

    public final void addFragmentVisibilityListener(C238693Db r2) {
        this.A03.addFragmentVisibilityListener(r2);
    }

    public final void afterOnCreate(Bundle bundle) {
        this.A02.A01();
        0lg r0 = (0lg) ((C227532jU) this).A05.getValue();
        if (r0 != null) {
            2cc A002 = C71342cb.A00(r0);
            AnonymousClass378 r02 = new AnonymousClass378(this);
            this.A01 = r02;
            r02.A01(A002);
        }
    }

    public final void afterOnCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, View view) {
        if (view != null) {
            this.A02.A0C(view);
        }
    }

    public final void afterOnDestroy() {
        this.A02.A02();
    }

    public final void afterOnDestroyView() {
        this.A02.A03();
    }

    public final void afterOnPause() {
        this.A02.A04();
        AnonymousClass378 r0 = this.A01;
        if (r0 != null) {
            r0.A00();
        }
    }

    public final void afterOnResume() {
        this.A02.A05();
        AnonymousClass378 r0 = this.A01;
        if (r0 != null) {
            r0.A00();
        }
    }

    public final void afterOnStart() {
        this.A02.A06();
    }

    public final void afterOnStop() {
        this.A02.A07();
    }

    public final AnonymousClass378 getFragmentVisibilityDetector() {
        return this.A01;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        this.A02.A08(i, i2, intent);
    }

    public final void onHiddenChanged(boolean z) {
        AnonymousClass378 r0 = this.A01;
        if (r0 != null) {
            r0.A00();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        Rect rect = this.A00;
        if (rect != null) {
            bundle.putParcelable(AnonymousClass4DH.KEY_CONTENT_INSETS, rect);
        }
        this.A02.A0A(bundle);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.A02.A0D(view, bundle);
        if (!(bundle == null || bundle.getParcelable(AnonymousClass4DH.KEY_CONTENT_INSETS) == null)) {
            this.A00 = (Rect) bundle.getParcelable(AnonymousClass4DH.KEY_CONTENT_INSETS);
        }
        View view2 = this.mView;
        if (view2 != null && this.A00 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                Rect rect = this.A00;
                ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(rect.left, rect.top, rect.right, rect.bottom);
            }
        }
    }

    public final void registerLifecycleListener(C252243on r2) {
        this.A02.A0E(r2);
    }

    public final void removeFragmentVisibilityListener(C238693Db r2) {
        this.A03.removeFragmentVisibilityListener(r2);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.07Z, X.2jV, androidx.fragment.app.Fragment] */
    public final void schedule(AnonymousClass11X r3) {
        if (r3 != null) {
            1ES.A00(requireContext(), AnonymousClass07i.A00(this), r3);
        }
    }

    public final void unregisterLifecycleListener(C252243on r3) {
        C227622jd r1 = this.A02;
        0qQ.A0B(r3, 0);
        r1.A00.remove(r3);
    }

    public final Activity getRootActivity() {
        if (getContext() instanceof Activity) {
            Activity parent = ((Activity) getContext()).getParent();
            if (parent == null) {
                return (Activity) getContext();
            }
            return parent;
        }
        throw new RuntimeException("Fragment is not attached.");
    }

    public void onDestroy() {
        int A022 = AnonymousClass0fD.A02(89982638);
        C227542jV.super.onDestroy();
        C305926Kc.A00(this);
        AnonymousClass0fD.A09(726815957, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1415958630);
        C227542jV.super.onDestroyView();
        AnonymousClass0fD.A09(-494834276, A022);
    }

    public void onResume() {
        int A022 = AnonymousClass0fD.A02(331497784);
        C227542jV.super.onResume();
        AnonymousClass0fD.A09(-1201278086, A022);
    }

    public final void onViewStateRestored(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(27272210);
        C227542jV.super.onViewStateRestored(bundle);
        this.A02.A0B(bundle);
        AnonymousClass0fD.A09(-1547844035, A022);
    }

    public final void schedule(AnonymousClass11X r1, int i, int i2, boolean z, boolean z2) {
        schedule(r1);
    }
}
