package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.I0b  reason: case insensitive filesystem */
public final class C56530I0b {
    public final UserSession A00;

    public C56530I0b(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public static final void A00(AnonymousClass9JA r5, AnonymousClass0iw r6, IO5 io5, AnonymousClass3W1 r8) {
        DbZ.A0t(0, io5, r6, r8);
        View view = io5.A04;
        if (r5 == null) {
            view.setVisibility(8);
            return;
        }
        view.setVisibility(0);
        io5.A00 = r5.A03;
        io5.A01(r5.A02, r5.A04);
        io5.A05.setVisibility(0);
        io5.A02.setVisibility(8);
        io5.A00(r8);
        ID2.A02(view, 22, r6, r5);
        view.setOnTouchListener(new IDT(0, r8, io5));
        view.addOnAttachStateChangeListener(new I9u(r8, 4));
        r8.A0L(io5, (Integer) null, false);
    }

    public final View A01(Context context, ViewGroup viewGroup) {
        View inflate = DbT.A0B(context).inflate(R.layout.broadcast_channel_feed_cta, viewGroup, false);
        UserSession userSession = this.A00;
        0qQ.A0A(inflate);
        inflate.setTag(new IO5(inflate, userSession, AnonymousClass3HA.A00(context)));
        return inflate;
    }
}
