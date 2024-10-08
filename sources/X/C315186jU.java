package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.6jU  reason: invalid class name and case insensitive filesystem */
public final class C315186jU implements C315036jF {
    public boolean A00;
    public boolean A01;

    public final View C8E(C255773uh r3, C316026kz r4) {
        View view;
        0qQ.A0B(r4, 0);
        if (this.A00) {
            view = r4.C8D();
        } else {
            view = null;
        }
        if (this.A01) {
            return r4.C8C();
        }
        return view;
    }

    public final AnonymousClass9UE C8F(UserSession userSession, C255773uh r3, C316026kz r4) {
        return null;
    }

    public final AnonymousClass5Gs C8I(Context context, UserSession userSession, C255773uh r5, C250973mM r6) {
        0qQ.A0B(context, 1);
        String string = context.getString(2131971745);
        0qQ.A07(string);
        return new C315476jx((CharSequence) string);
    }

    public final void DsI(Context context, AnonymousClass0iw r6, UserSession userSession, C255773uh r8, C250973mM r9) {
        0qQ.A0B(userSession, 0);
        if (this.A00) {
            0xY AR4 = 1Au.A00(userSession).A01.AR4();
            AR4.E5T("story_promote_seen_tooltip", true);
            AR4.apply();
            this.A00 = false;
        }
        if (this.A01) {
            0xY AR42 = 1Au.A00(userSession).A01.AR4();
            AR42.E5T("story_promote_button_seen_tooltip", true);
            AR42.apply();
            this.A01 = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003f, code lost:
        if (X.1Au.A00(r4).A01.getBoolean("story_promote_button_seen_tooltip", false) != false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0026, code lost:
        if (X.1Au.A00(r4).A01.getBoolean("story_promote_seen_tooltip", false) != false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean EtQ(com.instagram.common.session.UserSession r4, X.C255773uh r5, X.C250973mM r6, X.C316026kz r7) {
        /*
            r3 = this;
            r0 = 0
            X.0qQ.A0B(r4, r0)
            r0 = 1
            X.0qQ.A0B(r5, r0)
            r0 = 3
            X.0qQ.A0B(r7, r0)
            android.view.View r0 = r7.C8D()
            if (r0 == 0) goto L_0x0028
            android.view.View r0 = r7.C8C()
            if (r0 != 0) goto L_0x0028
            X.1Av r0 = X.1Au.A00(r4)
            X.0xa r2 = r0.A01
            java.lang.String r1 = "story_promote_seen_tooltip"
            r0 = 0
            boolean r1 = r2.getBoolean(r1, r0)
            r0 = 1
            if (r1 == 0) goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            r3.A00 = r0
            android.view.View r0 = r7.C8C()
            if (r0 == 0) goto L_0x0041
            X.1Av r0 = X.1Au.A00(r4)
            X.0xa r2 = r0.A01
            java.lang.String r1 = "story_promote_button_seen_tooltip"
            r0 = 0
            boolean r0 = r2.getBoolean(r1, r0)
            r1 = 1
            if (r0 == 0) goto L_0x0042
        L_0x0041:
            r1 = 0
        L_0x0042:
            r3.A01 = r1
            boolean r0 = r3.A00
            if (r0 != 0) goto L_0x004a
            if (r1 == 0) goto L_0x0085
        L_0x004a:
            X.1Xj r2 = r5.A0b
            X.0t1 r0 = X.0eE.A00(r4)
            com.instagram.user.model.User r1 = r0.A00()
            if (r2 == 0) goto L_0x0085
            com.instagram.user.model.User r0 = r2.A2A(r4)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0085
            boolean r0 = r1.A1M()
            if (r0 == 0) goto L_0x0085
            X.UyC r0 = r2.A1Z()
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x0085
            r0 = 2
            if (r1 == r0) goto L_0x0085
            r0 = 4
            if (r1 == r0) goto L_0x0085
            r0 = 6
            if (r1 == r0) goto L_0x0085
            r0 = 11
            if (r1 == r0) goto L_0x0085
            boolean r0 = X.DdM.A00(r4)
            r1 = 1
            if (r0 != 0) goto L_0x0086
        L_0x0085:
            r1 = 0
        L_0x0086:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C315186jU.EtQ(com.instagram.common.session.UserSession, X.3uh, X.3mM, X.6kz):boolean");
    }

    public final C226262fy C8G() {
        return C226262fy.ABOVE_ANCHOR;
    }
}
