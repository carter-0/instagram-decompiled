package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.4Jq  reason: invalid class name */
public abstract class AnonymousClass4Jq {
    public static final void A00(Context context, AnonymousClass9IP r3, AnonymousClass3V4 r4, AnonymousClass4Js r5, C62320sa r6) {
        0qQ.A0B(r3, 2);
        0qQ.A0B(r5, 3);
        if (r3.A02) {
            r4.A00 = new Oj5(context, r4, r5, r6);
        }
        C59671JTb jTb = (C59671JTb) r3.A01;
        if (jTb != null) {
            r4.A00(C245853da.SHOW);
            View A01 = r4.A01.A01();
            0qQ.A07(A01);
            View findViewById = A01.findViewById(R.id.zero_rating_video_badge_container);
            if (findViewById != null) {
                int i = 8;
                if (jTb.A00) {
                    i = 0;
                }
                findViewById.setVisibility(i);
                return;
            }
            return;
        }
        r4.A00(C245853da.HIDDEN);
    }

    public static final void A01(AnonymousClass0iw r5, UserSession userSession, AnonymousClass4Jp r7, AnonymousClass3V4 r8, C245853da r9, boolean z) {
        0qQ.A0B(r9, 5);
        C263224Jr r2 = new C263224Jr(userSession);
        AnonymousClass4Js r3 = new AnonymousClass4Js(r5, userSession);
        C71662eb r1 = r8.A01;
        View A01 = r1.A01();
        0qQ.A07(A01);
        Context context = A01.getContext();
        0qQ.A07(context);
        AnonymousClass9IP A00 = r2.A00(context, r9, z);
        View A012 = r1.A01();
        0qQ.A07(A012);
        Context context2 = A012.getContext();
        0qQ.A07(context2);
        A00(context2, A00, r8, r3, new AnonymousClass9L2(r7, 5));
    }
}
