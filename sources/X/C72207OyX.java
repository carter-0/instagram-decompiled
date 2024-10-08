package X;

import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.SessionedNotificationCenter;
import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.OyX  reason: case insensitive filesystem */
public final class C72207OyX implements AnonymousClass0lh, C74333Pt9 {
    public AnonymousClass66d A00;
    public final SessionedNotificationCenter A01;
    public final AccountSession A02;
    public final UserSession A03;
    public final AtomicBoolean A04 = JTQ.A0k();

    public C72207OyX(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A03 = userSession;
        AccountSession A022 = C300345wy.A02(userSession, !userSession.A07());
        this.A02 = A022;
        SessionedNotificationCenter sessionedNotificationCenter = A022.getSessionedNotificationCenter();
        0qQ.A07(sessionedNotificationCenter);
        this.A01 = sessionedNotificationCenter;
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [X.NAO, com.facebook.msys.mca.MailboxFeature] */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0124, code lost:
        if (X.0JC.A00().A04() == false) goto L_0x0126;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.0sP r38) {
        /*
            r37 = this;
            r2 = 0
            java.lang.String r1 = "MEMSessionManager.createAndLogin"
            r0 = 538823819(0x201dcc8b, float:1.3366095E-19)
            X.0fh.A01(r1, r0)
            r1 = r37
            java.util.concurrent.atomic.AtomicBoolean r3 = r1.A04
            r0 = 1
            boolean r0 = r3.getAndSet(r0)
            if (r0 != 0) goto L_0x0177
            com.facebook.msys.mci.AccountSession r0 = r1.A02
            X.62u r6 = new X.62u
            r6.<init>(r0)
            android.content.Context r7 = X.C60960kU.A00
            X.0qQ.A07(r7)
            X.0JC r0 = X.0JC.A00()
            boolean r0 = r0.A04()
            r10 = 4
            if (r0 == 0) goto L_0x002c
            r10 = 0
        L_0x002c:
            java.lang.String r0 = "e2e_android_messenger_wa_sandbox.ports.regfb"
            java.lang.String r5 = com.facebook.endtoend.EndToEnd.A00(r0, r2, r2)
            if (r5 != 0) goto L_0x0036
            java.lang.String r5 = "22222"
        L_0x0036:
            java.lang.String r0 = "e2e_android_messenger_wa_sandbox.protocol.regfb"
            java.lang.String r3 = com.facebook.endtoend.EndToEnd.A00(r0, r2, r2)
            if (r3 != 0) goto L_0x0040
            java.lang.String r3 = "http"
        L_0x0040:
            java.lang.String r0 = "e2e_android_messenger_wa_sandbox.hostname"
            java.lang.String r4 = com.facebook.endtoend.EndToEnd.A00(r0, r2, r2)
            java.lang.String r0 = "e2e_android_messenger_wa_sandbox.ports.chatd"
            java.lang.String r0 = com.facebook.endtoend.EndToEnd.A00(r0, r2, r2)
            r27 = 0
            if (r4 == 0) goto L_0x00d2
            if (r0 == 0) goto L_0x00d2
            int r8 = java.lang.Integer.parseInt(r0)
            java.lang.StringBuilder r3 = X.AnonymousClass7TF.A0n(r3)
            java.lang.String r0 = "://"
            r3.append(r0)
            r3.append(r4)
            r0 = 58
            r3.append(r0)
            r3.append(r5)
            r0 = 1170(0x492, float:1.64E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.String r27 = X.AnonymousClass7TF.A0l(r0, r3)
            r0 = 3041(0xbe1, float:4.261E-42)
            java.lang.String r25 = X.C273654mx.A00(r0)
            r33 = 1
        L_0x007c:
            java.lang.String r0 = "ig.e2e.e2e_igid"
            java.lang.String r0 = com.facebook.endtoend.EndToEnd.A00(r0, r2, r2)
            if (r0 == 0) goto L_0x00a3
            r0 = 2065(0x811, float:2.894E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r0)
            java.util.Map r0 = com.facebook.endtoend.EndToEnd.A01()
            if (r0 == 0) goto L_0x00a3
            java.lang.Object r3 = r0.get(r3)
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            if (r3 == 0) goto L_0x00a3
            java.lang.String r0 = "value"
            java.lang.String r0 = r3.optString(r0)
            if (r0 == 0) goto L_0x00a3
            com.facebook.msys.mci.NetworkUtils.setSandboxDomain(r0)
        L_0x00a3:
            com.instagram.common.session.UserSession r5 = r1.A03
            X.6AT r0 = X.AnonymousClass6AR.A00(r5)
            X.NAO r11 = new X.NAO
            r11.<init>(r6)
            java.lang.String r6 = X.C61120lW.A04(r7)
            java.lang.String r3 = "."
            java.util.List r3 = X.DbV.A18(r6, r3)
            java.util.ArrayList r6 = X.AnonymousClass7TG.A0r(r3)
            java.util.Iterator r7 = r3.iterator()
        L_0x00c0:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x00d8
            java.lang.String r3 = X.AnonymousClass7TE.A18(r7)
            int r3 = java.lang.Integer.parseInt(r3)
            X.AnonymousClass7TF.A1M(r6, r3)
            goto L_0x00c0
        L_0x00d2:
            r25 = r27
            r8 = 0
            r33 = 0
            goto L_0x007c
        L_0x00d8:
            r3 = 11
            java.lang.Integer r13 = java.lang.Integer.valueOf(r3)
            java.lang.String r18 = android.os.Build.MANUFACTURER
            java.lang.String r3 = "unknown"
            if (r18 != 0) goto L_0x00e6
            r18 = r3
        L_0x00e6:
            java.lang.String r19 = android.os.Build.MODEL
            if (r19 != 0) goto L_0x00ec
            r19 = r3
        L_0x00ec:
            java.lang.String r20 = android.os.Build.DISPLAY
            if (r20 != 0) goto L_0x00f2
            r20 = r3
        L_0x00f2:
            java.lang.String r21 = android.os.Build.BOARD
            if (r21 != 0) goto L_0x00f8
            r21 = r3
        L_0x00f8:
            java.lang.String r22 = android.os.Build.VERSION.RELEASE
            if (r22 != 0) goto L_0x00fe
            r22 = r3
        L_0x00fe:
            java.util.Locale r3 = java.util.Locale.getDefault()
            if (r3 != 0) goto L_0x0106
            java.util.Locale r3 = X.C70362O3o.A00
        L_0x0106:
            java.lang.String r23 = r3.getCountry()
            java.util.Locale r3 = java.util.Locale.getDefault()
            if (r3 != 0) goto L_0x0112
            java.util.Locale r3 = X.C70362O3o.A00
        L_0x0112:
            java.lang.String r24 = r3.getLanguage()
            boolean r3 = r0.A05
            if (r3 == 0) goto L_0x0126
            X.0JC r3 = X.0JC.A00()
            boolean r3 = r3.A04()
            r31 = 1
            if (r3 != 0) goto L_0x0128
        L_0x0126:
            r31 = 0
        L_0x0128:
            boolean r9 = r0.A02
            java.lang.Integer r14 = java.lang.Integer.valueOf(r2)
            boolean r35 = com.facebook.endtoend.EndToEnd.isRunningEndToEndTest()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r8)
            java.util.HashSet r3 = X.AnonymousClass7TE.A1F()
            boolean r2 = r0.A03
            if (r2 == 0) goto L_0x0142
            r2 = 4
            X.AnonymousClass7TF.A1M(r3, r2)
        L_0x0142:
            java.lang.Integer r16 = java.lang.Integer.valueOf(r10)
            long r7 = r0.A01
            java.lang.Long r17 = java.lang.Long.valueOf(r7)
            java.lang.String r8 = r5.A06
            boolean r7 = r0.A06
            r2 = 44
            X.Oph r0 = new X.Oph
            r5 = r38
            r0.<init>((int) r2, (java.lang.Object) r5, (java.lang.Object) r1)
            X.68L r1 = X.C66581MXm.A0I(r11)
            com.facebook.msys.mca.MailboxFutureImpl r12 = X.C66581MXm.A0J(r1, r0)
            X.OpR r10 = new X.OpR
            r26 = r4
            r28 = r8
            r29 = r6
            r30 = r3
            r32 = r9
            r34 = r33
            r36 = r7
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            X.C66582MXn.A1E(r1, r10, r12)
        L_0x0177:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72207OyX.A00(X.0sP):void");
    }

    public final void onSessionWillEnd() {
        AnonymousClass66d r1;
        synchronized (this) {
            r1 = this.A00;
        }
        if (r1 != null) {
            this.A01.removeEveryObserver(r1);
        }
    }

    public final void Ct4(boolean z) {
        MailboxFeature mailboxFeature;
        AnonymousClass68L A0I;
        MailboxFutureImpl A0J;
        int i;
        C3023662u r0 = new C3023662u(this.A02);
        if (z) {
            C71711OpV opV = C71711OpV.A00;
            A0I = C66581MXm.A0I(mailboxFeature);
            A0J = C66581MXm.A0J(A0I, opV);
            i = 33;
        } else {
            mailboxFeature = new MailboxFeature(r0);
            C71712OpW opW = C71712OpW.A00;
            A0I = C66581MXm.A0I(mailboxFeature);
            A0J = C66581MXm.A0J(A0I, opW);
            i = 34;
        }
        C66582MXn.A1D(A0I, new C71723Oph(i, (Object) mailboxFeature, (Object) A0J), A0J);
    }
}
