package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.3Ks  reason: invalid class name and case insensitive filesystem */
public abstract class C240393Ks extends 0SM {
    public void A0I() {
    }

    public void A0J() {
    }

    public final void A0H() {
        if (this instanceof C240373Kq) {
            C240373Kq r2 = (C240373Kq) this;
            r2.A01.A01();
            0lg A0M = r2.A0M();
            if (A0M != null) {
                2cc A00 = C71342cb.A00(A0M);
                AnonymousClass378 r0 = new AnonymousClass378(r2);
                r0.A01(A00);
                r2.A00 = r0;
            }
        }
    }

    public void A0K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, View view) {
        if (this instanceof C240373Kq) {
            C240373Kq r1 = (C240373Kq) this;
            0qQ.A0B(layoutInflater, 0);
            if (view != null) {
                r1.A01.A0C(view);
            }
        }
    }

    public final LayoutInflater getLayoutInflater(Bundle bundle) {
        if (this.A07) {
            return C240393Ks.super.getLayoutInflater(bundle);
        }
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
            C240393Ks.super.setHasOptionsMenu(z);
        }
    }

    public final void setUserVisibleHint(boolean z) {
        AnonymousClass378 r0;
        0hq r1;
        boolean z2 = this.mUserVisibleHint;
        if (!z2 && z && this.mState < 5 && (r1 = this.mFragmentManager) != null) {
            r1.A0w(r1.A0V(this));
        }
        C240393Ks.super.setUserVisibleHint(z);
        if (this instanceof C240373Kq) {
            C240373Kq r2 = (C240373Kq) this;
            boolean z3 = false;
            if (z2 != z) {
                z3 = true;
            }
            r2.A02.A00(r2, z);
            if (z3 && (r0 = r2.A00) != null) {
                r0.A00();
            }
        }
    }

    public int A0G(06p r2, String str, boolean z) {
        r2.A0B(this, str);
        return ((0s1) r2).A0J(true);
    }

    public final void performActivityCreated(Bundle bundle) {
        C240393Ks.super.performActivityCreated(bundle);
    }

    public final void performCreate(Bundle bundle) {
        try {
            C240393Ks.super.performCreate(bundle);
        } finally {
            A0H();
        }
    }

    public final void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            C240393Ks.super.performCreateView(layoutInflater, viewGroup, bundle);
        } finally {
            A0K(layoutInflater, viewGroup, bundle, this.mView);
        }
    }

    public final void performDestroy() {
        try {
            C240393Ks.super.performDestroy();
        } finally {
            if (this instanceof C240373Kq) {
                ((C240373Kq) this).A01.A02();
            }
        }
    }

    public final void performDestroyView() {
        try {
            C240393Ks.super.performDestroyView();
        } finally {
            if (this instanceof C240373Kq) {
                ((C240373Kq) this).A01.A03();
            }
        }
    }

    public final void performPause() {
        boolean z;
        try {
            A0J();
            C240393Ks.super.performPause();
            if (!z) {
                return;
            }
        } finally {
            if (this instanceof C240373Kq) {
                C240373Kq r1 = (C240373Kq) this;
                r1.A01.A04();
                AnonymousClass378 r0 = r1.A00;
                if (r0 != null) {
                    r0.A00();
                }
            }
        }
    }

    public final void performResume() {
        try {
            C240393Ks.super.performResume();
        } finally {
            A0I();
        }
    }

    public final void performStart() {
        try {
            C240393Ks.super.performStart();
        } finally {
            if (this instanceof C240373Kq) {
                ((C240373Kq) this).A01.A06();
            }
        }
    }

    public final void performStop() {
        try {
            C240393Ks.super.performStop();
        } finally {
            if (this instanceof C240373Kq) {
                ((C240373Kq) this).A01.A07();
            }
        }
    }

    public final void performViewCreated() {
        C240393Ks.super.performViewCreated();
    }
}
