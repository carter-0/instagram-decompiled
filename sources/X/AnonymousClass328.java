package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.328  reason: invalid class name */
public final class AnonymousClass328 implements AnonymousClass329 {
    public final int A00;
    public final Fragment A01;

    public AnonymousClass328(Fragment fragment) {
        this(fragment, -1);
    }

    public final Fragment B7p() {
        return this.A01;
    }

    public final AnonymousClass32L BkP() {
        AnonymousClass32L r1 = this.A01;
        if (r1 instanceof AnonymousClass32L) {
            return r1;
        }
        return null;
    }

    public final int Bn8() {
        return this.A00;
    }

    public final AnonymousClass32F BqA() {
        AnonymousClass32F r1 = this.A01;
        if (r1 instanceof AnonymousClass32F) {
            return r1;
        }
        return null;
    }

    public final FragmentActivity getActivity() {
        return this.A01.getActivity();
    }

    public final Context getContext() {
        return this.A01.getContext();
    }

    public final View getRootView() {
        return this.A01.mView;
    }

    public final boolean isResumed() {
        return this.A01.isResumed();
    }

    public AnonymousClass328(Fragment fragment, int i) {
        this.A01 = fragment;
        this.A00 = i;
    }
}
