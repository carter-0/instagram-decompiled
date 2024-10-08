package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.7jP  reason: invalid class name and case insensitive filesystem */
public final class C339317jP {
    public AnonymousClass5Gv A00;

    public final void A00(View view, ViewGroup viewGroup, UserSession userSession, int i) {
        0qQ.A0B(viewGroup, 0);
        AnonymousClass5Gv r0 = this.A00;
        if (r0 == null) {
            C315476jx r2 = new C315476jx(i);
            Context context = view.getContext();
            0qQ.A07(context);
            AnonymousClass5Gt r02 = new AnonymousClass5Gt(context, viewGroup, r2);
            r02.A03(view);
            r02.A0F = false;
            r02.A02();
            r0 = r02.A00();
            this.A00 = r0;
        }
        if (r0 != null) {
            r0.A07(userSession);
        }
    }

    public final void A01(View view, ViewGroup viewGroup, UserSession userSession, String str) {
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(userSession, 1);
        0qQ.A0B(view, 2);
        AnonymousClass5Gv r0 = this.A00;
        if (r0 == null) {
            C315476jx r2 = new C315476jx((CharSequence) str);
            Context context = view.getContext();
            0qQ.A07(context);
            AnonymousClass5Gt r1 = new AnonymousClass5Gt(context, viewGroup, r2);
            r1.A03(view);
            r1.A0F = false;
            r1.A06(C226262fy.ABOVE_ANCHOR);
            r0 = r1.A00();
            this.A00 = r0;
        }
        if (r0 != null) {
            r0.A07(userSession);
        }
    }
}
