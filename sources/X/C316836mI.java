package X;

import android.content.Context;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgProgressBar;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.6mI  reason: invalid class name and case insensitive filesystem */
public final class C316836mI implements C317556nS {
    public ViewGroup A00;
    public IgProgressBar A01;
    public IgTextView A02;
    public AnonymousClass8D7 A03;
    public final C71662eb A04;

    public final void EcX(boolean z) {
        IgTextView igTextView = this.A02;
        if (z) {
            if (igTextView != null) {
                igTextView.setVisibility(4);
                IgProgressBar igProgressBar = this.A01;
                if (igProgressBar != null) {
                    igProgressBar.setVisibility(0);
                    return;
                }
                0qQ.A0F("loadingSpinner");
                throw AnonymousClass00P.createAndThrow();
            }
        } else if (igTextView != null) {
            igTextView.setVisibility(0);
            IgProgressBar igProgressBar2 = this.A01;
            if (igProgressBar2 != null) {
                igProgressBar2.setVisibility(4);
                return;
            }
            0qQ.A0F("loadingSpinner");
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F("buttonView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void FJq(UserSession userSession) {
        String str;
        IgTextView igTextView = this.A02;
        if (igTextView == null) {
            str = "buttonView";
        } else {
            Context context = igTextView.getContext();
            0qQ.A0A(context);
            AnonymousClass8D7 r0 = this.A03;
            if (r0 == null) {
                str = "model";
            } else {
                UOB uob = r0.A0E;
                if (uob != null) {
                    C55098Hc7.A00(context, userSession, uob);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public C316836mI(C71662eb r1) {
        this.A04 = r1;
    }
}
