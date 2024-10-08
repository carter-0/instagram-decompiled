package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;

/* renamed from: X.3TU  reason: invalid class name */
public final class AnonymousClass3TU implements ViewStub.OnInflateListener {
    public final /* synthetic */ AnonymousClass3TT A00;

    public AnonymousClass3TU(AnonymousClass3TT r1) {
        this.A00 = r1;
    }

    public final void onInflate(ViewStub viewStub, View view) {
        AnonymousClass3TT r1 = this.A00;
        0qQ.A0C(view, "null cannot be cast to non-null type android.view.ViewGroup");
        AnonymousClass3TT.A00((ViewGroup) view, r1);
    }
}
