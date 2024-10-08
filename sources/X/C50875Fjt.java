package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fjt  reason: case insensitive filesystem */
public final class C50875Fjt implements G6H {
    public final FragmentActivity A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0097, code lost:
        if (r6.length() == 0) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        if (r2.length() == 0) goto L_0x001e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CI0(android.net.Uri r12, android.os.Bundle r13) {
        /*
            r11 = this;
            r7 = 0
            X.0qQ.A0B(r12, r7)
            java.lang.String r0 = "target_user_ids"
            java.lang.String r2 = r12.getQueryParameter(r0)
            r0 = 4086(0xff6, float:5.726E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r6 = r12.getQueryParameter(r0)
            r10 = 1
            if (r2 == 0) goto L_0x001e
            int r1 = r2.length()
            r0 = 0
            if (r1 != 0) goto L_0x001f
        L_0x001e:
            r0 = 1
        L_0x001f:
            r8 = 0
            if (r0 == 0) goto L_0x0034
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "SecretConversationGroupThreadActionHandler:Unable to extract target_user_ids from URI::"
            java.lang.String r2 = X.AnonymousClass7TG.A0m(r12, r0, r1)
            com.instagram.common.session.UserSession r1 = r11.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A1F
            X.C46436Dey.A00(r1, r0, r2, r8)
            return
        L_0x0034:
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.lang.String r0 = ","
            java.util.List r2 = X.DbW.A0o(r2, r0)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0084
            int r0 = r2.size()
            java.util.ListIterator r1 = r2.listIterator(r0)
        L_0x004c:
            boolean r0 = r1.hasPrevious()
            if (r0 == 0) goto L_0x0084
            int r0 = X.DbX.A06(r1)
            if (r0 == 0) goto L_0x004c
            java.util.List r0 = X.DbX.A0y(r2, r1)
        L_0x005c:
            java.lang.String[] r5 = X.DbU.A1b(r0, r7)
            int r4 = r5.length
            r3 = 0
        L_0x0062:
            if (r3 >= r4) goto L_0x0087
            r1 = r5[r3]
            com.instagram.common.session.UserSession r2 = r11.A02
            com.instagram.user.model.User r0 = X.DbV.A0j(r2, r1)
            if (r0 != 0) goto L_0x007a
            java.lang.String r0 = "SecretConversationGroupThreadActionHandler:Unable to fetch user from UserCache with id:"
            java.lang.String r1 = X.002.A0R(r0, r1)
            java.lang.Integer r0 = X.AnonymousClass05K.A1F
            X.C46436Dey.A00(r2, r0, r1, r8)
            return
        L_0x007a:
            com.instagram.model.direct.threadkey.impl.MsysPendingRecipient r0 = X.OXK.A00(r0)
            r9.add(r0)
            int r3 = r3 + 1
            goto L_0x0062
        L_0x0084:
            X.0sn r0 = X.0sn.A00
            goto L_0x005c
        L_0x0087:
            com.instagram.direct.msys.subtype.MsysThreadSubtype$Standard r1 = com.instagram.direct.msys.subtype.MsysThreadSubtype.Standard.A00
            X.3tH r0 = X.C254923tH.ACT
            X.PIO r4 = new X.PIO
            r4.<init>(r0, r1, r9)
            if (r6 == 0) goto L_0x0099
            int r1 = r6.length()
            r0 = 0
            if (r1 != 0) goto L_0x009a
        L_0x0099:
            r0 = 1
        L_0x009a:
            java.lang.String r5 = "inbox_new_message"
            if (r0 == 0) goto L_0x00ae
            androidx.fragment.app.FragmentActivity r2 = r11.A00
            com.instagram.common.session.UserSession r1 = r11.A02
            X.0iw r0 = r11.A01
            X.1pE r0 = X.1pE.A01(r2, r0, r1, r5)
            r0.A0B = r4
        L_0x00aa:
            X.DbV.A1R(r0)
            return
        L_0x00ae:
            com.instagram.common.session.UserSession r3 = r11.A02
            X.OZd r0 = X.C71026OZd.A00(r3)
            java.lang.Integer r0 = r0.A01
            int r2 = r0.intValue()
            int r0 = X.DbX.A05(r6)
            if (r0 <= r2) goto L_0x00d6
            X.0qQ.A0A(r6)
            int r2 = r2 - r10
            java.lang.String r1 = "..."
            int r0 = r1.length()
            int r2 = r2 - r0
            java.lang.String r0 = r6.substring(r7, r2)
            X.0qQ.A07(r0)
            java.lang.String r6 = X.002.A0R(r0, r1)
        L_0x00d6:
            androidx.fragment.app.FragmentActivity r1 = r11.A00
            X.0iw r0 = r11.A01
            X.1pE r0 = X.1pE.A01(r1, r0, r3, r5)
            r0.A0B = r4
            r0.A0j = r6
            goto L_0x00aa
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50875Fjt.CI0(android.net.Uri, android.os.Bundle):void");
    }

    public C50875Fjt(FragmentActivity fragmentActivity, AnonymousClass0iw r2, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A01 = r2;
    }
}
