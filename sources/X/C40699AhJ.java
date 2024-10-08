package X;

import android.view.View;

/* renamed from: X.AhJ  reason: case insensitive filesystem */
public final class C40699AhJ implements G83 {
    public final /* synthetic */ AnonymousClass7V7 A00;

    public C40699AhJ(AnonymousClass7V7 r1) {
        this.A00 = r1;
    }

    public final void DEH(Integer num) {
        C59689JTv.A0B(this.A00.A00.requireContext(), "something_went_wrong");
    }

    public final void onFinish() {
        View view = this.A00.A00.mView;
        if (view != null) {
            C46445Df7.A00(view, false);
        }
    }

    public final void onStart() {
        View view = this.A00.A00.mView;
        if (view != null) {
            C46445Df7.A00(view, true);
        }
    }

    public final void onSuccess() {
        AnonymousClass7V7 r3 = this.A00;
        AnonymousClass4DH r2 = r3.A00;
        C59689JTv.A07(r2.requireContext(), 2131952113);
        if (r2.isResumed()) {
            AnonymousClass7V4 r1 = r3.A04.A00;
            r1.A0A.invoke();
            r1.A07.invoke();
        }
        r3.A04.A00.A09.invoke();
    }
}
