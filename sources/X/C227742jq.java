package X;

import android.view.View;

/* renamed from: X.2jq  reason: invalid class name and case insensitive filesystem */
public final class C227742jq implements AnonymousClass0hF {
    public final /* synthetic */ AnonymousClass4DI A00;

    public C227742jq(AnonymousClass4DI r1) {
        this.A00 = r1;
    }

    public final void Dms(07T r2, AnonymousClass07Z r3) {
        View view;
        if (r2 == 07T.ON_STOP && (view = this.A00.mView) != null) {
            view.cancelPendingInputEvents();
        }
    }
}
