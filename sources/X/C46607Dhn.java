package X;

import androidx.fragment.app.Fragment;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.Dhn  reason: case insensitive filesystem */
public final class C46607Dhn implements AnonymousClass4DJ, C13907Tl7, AnonymousClass4DL, C238693Db, AnonymousClass4DQ {
    public final AnonymousClass07V A00;
    public final AnonymousClass4DL A01;
    public final List A02 = new CopyOnWriteArrayList();
    public final List A03 = new CopyOnWriteArrayList();

    public C46607Dhn(AnonymousClass07V r2, AnonymousClass4DL r3) {
        0qQ.A0B(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
        r3.addFragmentVisibilityListener(this);
        r2.A09(this);
    }

    public final void addFragmentVisibilityListener(C238693Db r2) {
        0qQ.A0B(r2, 0);
        this.A03.add(r2);
    }

    public final /* synthetic */ void onCreate(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onStart(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onStop(AnonymousClass07Z r1) {
    }

    public final void removeFragmentVisibilityListener(C238693Db r2) {
        0qQ.A0B(r2, 0);
        this.A03.remove(r2);
    }

    public final boolean isResumed() {
        if (this.A00.A07().compareTo(07U.A04) >= 0) {
            return true;
        }
        return false;
    }

    public final void onDestroy(AnonymousClass07Z r3) {
        for (C252243on onDestroyView : this.A02) {
            onDestroyView.onDestroyView();
        }
        this.A01.removeFragmentVisibilityListener(this);
        this.A00.A0A(this);
    }

    public final void onPause(AnonymousClass07Z r3) {
        for (C252243on onPause : this.A02) {
            onPause.onPause();
        }
    }

    public final void onResume(AnonymousClass07Z r3) {
        for (C252243on onResume : this.A02) {
            onResume.onResume();
        }
    }

    public final void registerLifecycleListener(C252243on r2) {
        if (r2 != null) {
            this.A02.add(r2);
        }
    }

    public final void unregisterLifecycleListener(C252243on r2) {
        if (r2 != null) {
            this.A02.remove(r2);
        }
    }

    public final void DGh(Fragment fragment) {
        if (isResumed()) {
            for (C238693Db DGh : this.A03) {
                DGh.DGh(fragment);
            }
        }
    }

    public final void DGl(Fragment fragment) {
        if (isResumed()) {
            for (C238693Db DGl : this.A03) {
                DGl.DGl(fragment);
            }
        }
    }
}
