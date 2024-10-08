package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* renamed from: X.4DI  reason: invalid class name */
public abstract class AnonymousClass4DI extends Fragment {
    public void afterOnActivityCreated(Bundle bundle) {
    }

    public void afterOnCreate(Bundle bundle) {
    }

    public void afterOnCreateOptionsMenu(Menu menu, MenuInflater menuInflater, boolean z) {
    }

    public void afterOnCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, View view) {
    }

    public void afterOnDestroy() {
    }

    public void afterOnDestroyView() {
    }

    public void afterOnPause() {
    }

    public void afterOnResume() {
    }

    public void afterOnStart() {
    }

    public void afterOnStop() {
    }

    public void afterOnViewCreated() {
    }

    public void beforeOnActivityCreated(Bundle bundle) {
    }

    public void beforeOnCreate(Bundle bundle) {
    }

    public boolean beforeOnCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        return false;
    }

    public void beforeOnCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
    }

    public void beforeOnDestroy() {
    }

    public void beforeOnDestroyView() {
    }

    public void beforeOnPause() {
    }

    public void beforeOnResume() {
    }

    public void beforeOnStart() {
    }

    public void beforeOnStop() {
    }

    public void beforeOnViewCreated() {
    }

    @Deprecated
    public void onSetUserVisibleHint(boolean z, boolean z2) {
    }

    public LayoutInflater provideOverrideLayoutInflater() {
        return null;
    }

    public final 0ly getFragmentHost() {
        return this.mHost;
    }

    public LayoutInflater getLayoutInflater(Bundle bundle) {
        0ly r0 = this.mHost;
        if (r0 != null) {
            LayoutInflater cloneInContext = r0.A02().cloneInContext(this.mHost.A01);
            getChildFragmentManager();
            cloneInContext.setFactory2(this.mChildFragmentManager.A0S);
            return cloneInContext;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void invalidateOptionsMenu() {
        0ly r1 = this.mHost;
        if (r1 != null && this.mHasMenu && isAdded() && !isHidden() && isMenuVisible()) {
            r1.A04();
        }
    }

    public void performCreate(Bundle bundle) {
        try {
            this.mLifecycleRegistry.A09(new C227742jq(this));
            beforeOnCreate(bundle);
            AnonymousClass4DI.super.performCreate(bundle);
        } finally {
            afterOnCreate(bundle);
        }
    }

    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z && isMenuVisible()) {
            AnonymousClass4DI.super.setHasOptionsMenu(z);
        }
    }

    public final void setUserVisibleHint(boolean z) {
        0hq r1;
        boolean z2 = this.mUserVisibleHint;
        if (!z2 && z && this.mState < 5 && (r1 = this.mFragmentManager) != null) {
            r1.A0w(r1.A0V(this));
        }
        AnonymousClass4DI.super.setUserVisibleHint(z);
        onSetUserVisibleHint(z, z2);
    }

    public void performActivityCreated(Bundle bundle) {
        AnonymousClass4DI.super.performActivityCreated(bundle);
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        return AnonymousClass4DI.super.performCreateOptionsMenu(menu, menuInflater);
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            beforeOnCreateView(layoutInflater, viewGroup, bundle);
            AnonymousClass4DI.super.performCreateView(layoutInflater, viewGroup, bundle);
        } finally {
            afterOnCreateView(layoutInflater, viewGroup, bundle, this.mView);
        }
    }

    public void performDestroy() {
        try {
            beforeOnDestroy();
            AnonymousClass4DI.super.performDestroy();
        } finally {
            afterOnDestroy();
        }
    }

    public void performDestroyView() {
        try {
            beforeOnDestroyView();
            AnonymousClass4DI.super.performDestroyView();
        } finally {
            afterOnDestroyView();
        }
    }

    public void performPause() {
        try {
            beforeOnPause();
            AnonymousClass4DI.super.performPause();
        } finally {
            afterOnPause();
        }
    }

    public void performResume() {
        try {
            beforeOnResume();
            AnonymousClass4DI.super.performResume();
        } finally {
            afterOnResume();
        }
    }

    public void performStart() {
        try {
            beforeOnStart();
            AnonymousClass4DI.super.performStart();
        } finally {
            afterOnStart();
        }
    }

    public void performStop() {
        try {
            AnonymousClass4DI.super.performStop();
        } finally {
            afterOnStop();
        }
    }

    public void performViewCreated() {
        try {
            AnonymousClass4DI.super.performViewCreated();
        } finally {
            afterOnViewCreated();
        }
    }
}
