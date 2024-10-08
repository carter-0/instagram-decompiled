package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.AnK  reason: case insensitive filesystem */
public final class C41036AnK implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C339297jN A01;

    public C41036AnK(C339297jN r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final void run() {
        C339297jN r7 = this.A01;
        View view = r7.A00;
        if (view != null) {
            int i = this.A00;
            C339317jP r4 = r7.A0M;
            ViewGroup viewGroup = r7.A09;
            UserSession userSession = r7.A0E;
            Context context = view.getContext();
            int i2 = 2131965164;
            if (i == 0) {
                i2 = 2131965163;
            }
            r4.A01(view, viewGroup, userSession, AnonymousClass7TE.A16(context, i2));
            r7.A05 = true;
            0xY A0p = AnonymousClass7TE.A0p(1Au.A00(userSession));
            A0p.E5Z("live_pre_live_audience_pill_tooltip_view_count", i + 1);
            A0p.apply();
        }
    }
}
