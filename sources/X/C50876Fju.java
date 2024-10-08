package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fju  reason: case insensitive filesystem */
public final class C50876Fju implements G6H {
    public final FragmentActivity A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r2.length() == 0) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CI0(android.net.Uri r6, android.os.Bundle r7) {
        /*
            r5 = this;
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.String r0 = "target_user_id"
            java.lang.String r2 = r6.getQueryParameter(r0)
            if (r2 == 0) goto L_0x0013
            int r1 = r2.length()
            r0 = 0
            if (r1 != 0) goto L_0x0014
        L_0x0013:
            r0 = 1
        L_0x0014:
            r3 = 0
            if (r0 == 0) goto L_0x002e
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "SecretConverstationUserThreadActionHandler"
            r1.append(r0)
            java.lang.String r0 = ":Unable to extract target_user_id from URI: "
            java.lang.String r2 = X.AnonymousClass7TG.A0m(r6, r0, r1)
            com.instagram.common.session.UserSession r1 = r5.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A1F
            X.C46436Dey.A00(r1, r0, r2, r3)
            return
        L_0x002e:
            com.instagram.common.session.UserSession r4 = r5.A02
            com.instagram.user.model.User r0 = X.DbV.A0j(r4, r2)
            if (r0 != 0) goto L_0x0044
            java.lang.String r1 = "SecretConverstationUserThreadActionHandler"
            java.lang.String r0 = ":Unable to fetch user with id: "
            java.lang.String r1 = X.002.A0g(r1, r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A1F
            X.C46436Dey.A00(r4, r0, r1, r3)
            return
        L_0x0044:
            com.instagram.model.direct.threadkey.impl.MsysPendingRecipient r0 = X.OXK.A00(r0)
            java.util.List r2 = X.AnonymousClass7TE.A1I(r0)
            com.instagram.direct.msys.subtype.MsysThreadSubtype$Standard r1 = com.instagram.direct.msys.subtype.MsysThreadSubtype.Standard.A00
            X.3tH r0 = X.C254923tH.ACT
            X.PIO r3 = new X.PIO
            r3.<init>(r0, r1, r2)
            androidx.fragment.app.FragmentActivity r2 = r5.A00
            X.0iw r1 = r5.A01
            java.lang.String r0 = "thread_details"
            X.1pE r0 = X.1pE.A01(r2, r1, r4, r0)
            r0.A0B = r3
            X.DbV.A1R(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50876Fju.CI0(android.net.Uri, android.os.Bundle):void");
    }

    public C50876Fju(FragmentActivity fragmentActivity, AnonymousClass0iw r2, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A01 = r2;
    }
}
