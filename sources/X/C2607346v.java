package X;

import android.app.Activity;
import android.content.Context;
import android.widget.TextView;
import com.instagram.common.session.UserSession;

/* renamed from: X.46v  reason: invalid class name and case insensitive filesystem */
public final class C2607346v extends C252633pQ {
    public final UserSession A00;
    public final boolean A01;
    public final Activity A02;
    public final Context A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2607346v(Activity activity, Context context, UserSession userSession, boolean z) {
        super(context);
        0qQ.A0B(context, 2);
        0qQ.A0B(userSession, 3);
        this.A02 = activity;
        this.A03 = context;
        this.A00 = userSession;
        this.A01 = z;
    }

    public static final void A00(C376499If r3, AnonymousClass49J r4) {
        0qQ.A0B(r4, 0);
        0qQ.A0B(r3, 1);
        if (r3.A04) {
            C376459Ib r2 = (C376459Ib) r3.A01;
            ((0sP) r2.A02).invoke(r3.A02);
            ((0sP) r2.A01).invoke(r4);
        }
        r4.A01 = r3;
        if (r3.A05) {
            r4.A00();
            r4.A01(r3);
            return;
        }
        TextView textView = r4.A00;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }
}
