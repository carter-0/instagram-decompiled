package X;

import android.view.View;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.7SI  reason: invalid class name */
public final class AnonymousClass7SI implements C2597342w {
    public final /* synthetic */ AnonymousClass9H7 A00;

    public final void D8q(C254703su r1, DirectThreadKey directThreadKey, boolean z) {
    }

    public final void D8r(DirectThreadKey directThreadKey, Long l, String str, boolean z) {
    }

    public final void Dq6(AnonymousClass651 r1) {
    }

    public AnonymousClass7SI(AnonymousClass9H7 r1) {
        this.A00 = r1;
    }

    public final void D8s(C254703su r4, DirectThreadKey directThreadKey, boolean z) {
        View view;
        AnonymousClass9H7 r2 = this.A00;
        C254793t3 r1 = AnonymousClass9H7.A03(r2).A0P;
        if (r4.A0U() != null && 0qQ.A0K(r4.A0U(), r1) && AnonymousClass9H7.A03(r2).A13 && !0qQ.A0K(r2.A10.A06, r4.BsI()) && (view = r2.A0u.mView) != null) {
            view.post(new C40875Akj(r2));
        }
    }
}
