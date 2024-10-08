package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.32H  reason: invalid class name */
public abstract class AnonymousClass32H extends 0S7 {
    public abstract void A0W(Bundle bundle);

    public final LayoutInflater getLayoutInflater(Bundle bundle) {
        0ly r0 = this.mHost;
        if (r0 != null) {
            LayoutInflater cloneInContext = r0.A02().cloneInContext(this.mHost.A01);
            getChildFragmentManager();
            cloneInContext.setFactory2(this.mChildFragmentManager.A0S);
            return cloneInContext;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public final void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z && isMenuVisible()) {
            AnonymousClass32H.super.setHasOptionsMenu(z);
        }
    }

    public final void setUserVisibleHint(boolean z) {
        AnonymousClass378 r0;
        0hq r1;
        boolean z2 = this.mUserVisibleHint;
        if (!z2 && z && this.mState < 5 && (r1 = this.mFragmentManager) != null) {
            r1.A0w(r1.A0V(this));
        }
        AnonymousClass32H.super.setUserVisibleHint(z);
        AnonymousClass32G r2 = (AnonymousClass32G) this;
        boolean z3 = false;
        if (z2 != z) {
            z3 = true;
        }
        r2.A05.A00(r2, z);
        if (z3 && (r0 = r2.A01) != null) {
            r0.A00();
        }
    }

    public final void performActivityCreated(Bundle bundle) {
        AnonymousClass32H.super.performActivityCreated(bundle);
    }

    public final void performCreate(Bundle bundle) {
        try {
            AnonymousClass32H.super.performCreate(bundle);
        } finally {
            A0W(bundle);
        }
    }

    public final void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            AnonymousClass32H.super.performCreateView(layoutInflater, viewGroup, bundle);
        } finally {
            View view = this.mView;
            AnonymousClass32G r1 = (AnonymousClass32G) this;
            0qQ.A0B(layoutInflater, 0);
            if (view != null) {
                r1.A04.A0C(view);
            }
        }
    }

    public final void performDestroy() {
        try {
            AnonymousClass32H.super.performDestroy();
        } finally {
            ((AnonymousClass32G) this).A04.A02();
        }
    }

    public final void performDestroyView() {
        try {
            AnonymousClass32H.super.performDestroyView();
        } finally {
            ((AnonymousClass32G) this).A04.A03();
        }
    }

    public final void performPause() {
        try {
            AnonymousClass32H.super.performPause();
        } finally {
            AnonymousClass32G r1 = (AnonymousClass32G) this;
            r1.A04.A04();
            AnonymousClass378 r0 = r1.A01;
            if (r0 != null) {
                r0.A00();
            }
        }
    }

    public final void performResume() {
        try {
            AnonymousClass32H.super.performResume();
        } finally {
            AnonymousClass32G r1 = (AnonymousClass32G) this;
            r1.A04.A05();
            AnonymousClass378 r0 = r1.A01;
            if (r0 != null) {
                r0.A00();
            }
        }
    }

    public final void performStart() {
        try {
            AnonymousClass32H.super.performStart();
        } finally {
            ((AnonymousClass32G) this).A04.A06();
        }
    }

    public final void performStop() {
        try {
            AnonymousClass32H.super.performStop();
        } finally {
            ((AnonymousClass32G) this).A04.A07();
        }
    }

    public final void performViewCreated() {
        AnonymousClass32H.super.performViewCreated();
    }
}
