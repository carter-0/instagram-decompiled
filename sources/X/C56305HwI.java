package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.HwI  reason: case insensitive filesystem */
public abstract class C56305HwI {
    public static final void A00(Context context, UserSession userSession, 1Xj r9, int i, boolean z) {
        r9.A0C.Ec1(Boolean.valueOf(z));
        r9.AE7(userSession);
        boolean A61 = r9.A61();
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("media/update_like_and_view_counts_visibility/");
        A0a.A0H(AnonymousClass000.A00(82), z);
        A0a.A0H(AnonymousClass000.A00(777), A61);
        DbX.A1M(A0a, "media_id", r9.getId());
        1OC A0M = A0a.A0M();
        Context context2 = context;
        A0M.A00 = new H4R(context2, userSession, r9, new GA1(30, r9, z), i, 0);
        1ES.A03(A0M);
    }

    public static final void A01(Context context, UserSession userSession, 1Xj r9, int i, boolean z) {
        r9.A0C.Ek9(Boolean.valueOf(z));
        r9.AE7(userSession);
        boolean A5c = r9.A5c();
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("media/update_like_and_view_counts_visibility/");
        A0a.A0H(AnonymousClass000.A00(82), A5c);
        A0a.A0H(AnonymousClass000.A00(777), z);
        DbX.A1M(A0a, "media_id", r9.getId());
        1OC A0M = A0a.A0M();
        Context context2 = context;
        A0M.A00 = new H4R(context2, userSession, r9, new GA1(31, r9, z), i, 0);
        1ES.A03(A0M);
    }
}
