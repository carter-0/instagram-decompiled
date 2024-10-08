package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.6jN  reason: invalid class name and case insensitive filesystem */
public final class C315116jN implements C315036jF {
    public final AnonymousClass9UE C8F(UserSession userSession, C255773uh r3, C316026kz r4) {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r1 == false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean EtQ(com.instagram.common.session.UserSession r6, X.C255773uh r7, X.C250973mM r8, X.C316026kz r9) {
        /*
            r5 = this;
            r3 = 0
            X.0qQ.A0B(r7, r3)
            java.util.List r1 = r7.A0b()
            X.3WT r0 = X.AnonymousClass3WT.COUNTDOWN
            X.3ui r0 = X.C289745e8.A00(r0, r1)
            if (r0 == 0) goto L_0x004f
            X.WaO r4 = r0.A0B()
        L_0x0014:
            X.1Xj r0 = r7.A0b
            r2 = 1
            if (r0 == 0) goto L_0x0020
            boolean r1 = r0.CcK()
            r0 = 1
            if (r1 != 0) goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0051
            boolean r0 = X.C309186Xg.A02(r4)
            if (r0 == 0) goto L_0x0051
            X.1Av r0 = X.1Au.A00(r6)
            X.0xa r1 = r0.A01
            java.lang.String r0 = "has_ever_tapped_on_story_countdown"
            boolean r0 = r1.getBoolean(r0, r3)
            if (r0 != 0) goto L_0x0051
            X.1Av r0 = X.1Au.A00(r6)
            X.0xa r1 = r0.A01
            java.lang.String r0 = "story_countdown_tooltip_impression_count"
            int r1 = r1.getInt(r0, r3)
            r0 = 3
            if (r1 >= r0) goto L_0x0051
            return r2
        L_0x004f:
            r4 = 0
            goto L_0x0014
        L_0x0051:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C315116jN.EtQ(com.instagram.common.session.UserSession, X.3uh, X.3mM, X.6kz):boolean");
    }

    public final View C8E(C255773uh r2, C316026kz r3) {
        return ((C316006kx) r3).A19.A02.getView();
    }

    public final C226262fy C8G() {
        return C226262fy.ABOVE_ANCHOR;
    }

    public final AnonymousClass5Gs C8I(Context context, UserSession userSession, C255773uh r5, C250973mM r6) {
        return new C315476jx((CharSequence) context.getString(2131956792));
    }

    public final void DsI(Context context, AnonymousClass0iw r6, UserSession userSession, C255773uh r8, C250973mM r9) {
        0xa r3 = 1Au.A00(userSession).A01;
        int i = r3.getInt("story_countdown_tooltip_impression_count", 0) + 1;
        0xY AR4 = r3.AR4();
        AR4.E5Z("story_countdown_tooltip_impression_count", i);
        AR4.apply();
    }
}
