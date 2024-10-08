package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.EkB  reason: case insensitive filesystem */
public abstract class C48788EkB {
    public static final void A00(Context context, AnonymousClass0iw r10, UserSession userSession, String str, C62320sa r13) {
        String A0h;
        if (AnonymousClass7TE.A0q(userSession).getInt("meta_gallery_recents_nux_impression_count", 0) < 1) {
            long A01 = 182.A01(0Tu.A05, userSession, 36598137885822061L);
            Long valueOf = Long.valueOf(A01);
            C358248ab A0Y = DbS.A0Y(context);
            A0Y.A09(2131962952);
            if (A01 == -1) {
                A0h = context.getString(2131962954);
            } else {
                A0h = DbW.A0h(context, valueOf, 2131962950);
            }
            A0Y.A0q(A0h);
            A0Y.A0I(new C50018FJd((Object) r10, (Object) userSession, str, 1), 2131962949);
            A0Y.A0f(new C50032FJr(r10, userSession, str, r13));
            A0Y.A0r(true);
            A0Y.A0s(true);
            A0Y.A0H(new FIZ(context, r10, userSession, str, 2), 2131962951);
            A0Y.A0g(new C50039FJy(r10, userSession, str, 0));
            DbT.A1V(A0Y);
        }
    }
}
