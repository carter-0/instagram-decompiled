package X;

import android.os.Handler;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Oan  reason: case insensitive filesystem */
public final class C71068Oan {
    public int A00;
    public Handler A01;
    public AnonymousClass638 A02;
    public C70812OMh A03;
    public C3023662u A04;
    public Runnable A05;
    public boolean A06;
    public boolean A07 = true;
    public boolean A08;
    public final AnonymousClass66d A09 = new C71737Opx(this, 0);
    public final AnonymousClass66d A0A = new C71737Opx(this, 1);
    public final QuickPerformanceLogger A0B;
    public final C70571OBt A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final Set A0G = DbS.A0y();
    public final Set A0H = DbS.A0y();
    public final Set A0I = DbS.A0y();
    public final AtomicBoolean A0J = new AtomicBoolean(false);
    public final HashMap A0K;

    public C71068Oan(QuickPerformanceLogger quickPerformanceLogger, C70571OBt oBt, String str, String str2, String str3, HashMap hashMap) {
        C51973G9u.A0r(1, str, str2, str3);
        this.A0D = str;
        this.A0B = quickPerformanceLogger;
        this.A0C = oBt;
        this.A0E = str2;
        this.A0F = str3;
        this.A0K = hashMap;
    }

    public static final void A00(C71068Oan oan, Boolean bool, Integer num, String str, String str2) {
        int hashCode = oan.A0D.hashCode();
        QuickPerformanceLogger quickPerformanceLogger = oan.A0B;
        if (quickPerformanceLogger.isMarkerOn(755177991, hashCode)) {
            if (str2 != null) {
                quickPerformanceLogger.markerAnnotate(755177991, hashCode, str, str2);
            }
            if (bool != null) {
                quickPerformanceLogger.markerAnnotate(755177991, hashCode, str, bool.booleanValue());
            }
            if (num != null) {
                quickPerformanceLogger.markerAnnotate(755177991, hashCode, str, num.intValue());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r14.equals("SwitchAccount") != false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (r12.A06 != false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C71068Oan r12, java.lang.Runnable r13, java.lang.String r14) {
        /*
            java.lang.String r0 = "Timeout"
            boolean r3 = r14.equals(r0)
            r5 = 0
            r2 = 1
            if (r3 != 0) goto L_0x0013
            java.lang.String r0 = "SwitchAccount"
            boolean r0 = r14.equals(r0)
            r8 = 0
            if (r0 == 0) goto L_0x0014
        L_0x0013:
            r8 = 1
        L_0x0014:
            boolean r0 = r12.A07
            if (r0 == 0) goto L_0x001d
            boolean r0 = r12.A06
            r4 = 1
            if (r0 == 0) goto L_0x001e
        L_0x001d:
            r4 = 0
        L_0x001e:
            int r1 = r12.A00
            if (r1 <= 0) goto L_0x002b
            java.util.Set r0 = r12.A0H
            int r0 = r0.size()
            if (r1 > r0) goto L_0x002b
            r4 = 0
        L_0x002b:
            java.util.Set r0 = r12.A0G
            int r1 = r0.size()
            java.util.Set r0 = r12.A0H
            int r0 = r0.size()
            int r1 = r1 + r0
            if (r8 != 0) goto L_0x0045
            boolean r0 = r12.A08
            if (r0 == 0) goto L_0x0044
            if (r4 != 0) goto L_0x0044
            int r0 = r12.A00
            if (r0 <= r1) goto L_0x0045
        L_0x0044:
            return
        L_0x0045:
            java.util.concurrent.atomic.AtomicBoolean r0 = r12.A0J
            boolean r0 = r0.getAndSet(r2)
            if (r0 != 0) goto L_0x0044
            android.os.Handler r0 = r12.A01
            r4 = 0
            if (r0 == 0) goto L_0x0055
            r0.removeCallbacksAndMessages(r4)
        L_0x0055:
            r12.A01 = r4
            X.OBt r11 = r12.A0C
            com.instagram.common.session.UserSession r6 = r11.A01
            r9 = 0
            boolean r0 = X.2Aj.A04(r6)
            if (r0 == 0) goto L_0x00ec
            com.facebook.msys.mci.AccountSession r0 = X.C300345wy.A02(r6, r5)
        L_0x0066:
            if (r0 == 0) goto L_0x0075
            com.facebook.msys.mci.SessionedNotificationCenter r7 = r0.getSessionedNotificationCenter()
            if (r7 == 0) goto L_0x0075
            X.66d r1 = r12.A0A
            java.lang.String r0 = "MEMOfflineHandlingCompletionNotification"
            r7.removeObserver(r1, r0, r4)
        L_0x0075:
            boolean r0 = X.2Aj.A04(r6)
            if (r0 == 0) goto L_0x00e3
            com.facebook.msys.mci.AccountSession r0 = X.C300345wy.A02(r6, r5)
        L_0x007f:
            if (r0 == 0) goto L_0x008e
            com.facebook.msys.mci.SessionedNotificationCenter r6 = r0.getSessionedNotificationCenter()
            if (r6 == 0) goto L_0x008e
            X.66d r1 = r12.A09
            java.lang.String r0 = "MEBHandleProtobufBackupWriteResultNotification"
            r6.removeObserver(r1, r0, r4)
        L_0x008e:
            if (r8 == 0) goto L_0x0093
            if (r3 != 0) goto L_0x0093
            r5 = 1
        L_0x0093:
            java.lang.String r0 = "DeactivateInstance"
            A02(r12, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            java.lang.String r0 = "TearDownByAccountSwitch"
            A00(r12, r1, r4, r0, r4)
            boolean r0 = r12.A07
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "EncryptedBackupsEnabled"
            A00(r12, r1, r4, r0, r4)
            java.lang.String r0 = "TearDownReason"
            A00(r12, r4, r4, r0, r14)
            java.util.Set r1 = r12.A0I
            boolean r0 = X.C66580MXl.A1b(r1)
            if (r0 == 0) goto L_0x00c4
            java.lang.String r0 = ","
            java.lang.String r1 = X.DbT.A0z(r0, r1, r4)
            java.lang.String r0 = "ThreadIds"
            A00(r12, r4, r4, r0, r1)
        L_0x00c4:
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.messagingclient.multiinstance.provider.BackgroundAccountSyncProviderV2"
            X.0qQ.A0C(r11, r0)
            r0 = 3
            X.GA1 r10 = new X.GA1
            r10.<init>(r0, r12, r3)
            X.OMh r3 = r12.A03
            if (r3 != 0) goto L_0x00f6
            com.facebook.msys.mca.MailboxCallback r1 = r11.A00
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r1.onCompletion(r0)
            r10.invoke()
            r13.run()
            return
        L_0x00e3:
            java.lang.Class<com.facebook.msys.mci.AccountSession> r0 = com.facebook.msys.mci.AccountSession.class
            java.lang.Object r0 = r6.A00(r0)
            com.facebook.msys.mci.AccountSession r0 = (com.facebook.msys.mci.AccountSession) r0
            goto L_0x007f
        L_0x00ec:
            java.lang.Class<com.facebook.msys.mci.AccountSession> r0 = com.facebook.msys.mci.AccountSession.class
            java.lang.Object r0 = r6.A00(r0)
            com.facebook.msys.mci.AccountSession r0 = (com.facebook.msys.mci.AccountSession) r0
            goto L_0x0066
        L_0x00f6:
            X.638 r0 = r12.A02
            if (r0 == 0) goto L_0x0109
            com.google.common.util.concurrent.SettableFuture r1 = r0.A03()
            X.IL2 r8 = new X.IL2
            r8.<init>(r9, r10, r11, r12, r13)
            X.1Lf r0 = X.1Lf.A01
            X.C255183ti.A04(r8, r1, r0)
            return
        L_0x0109:
            r2 = 2
            r1 = 15
            X.OoW r0 = new X.OoW
            r0.<init>(r1, r12, r13, r10)
            r3.A01(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71068Oan.A01(X.Oan, java.lang.Runnable, java.lang.String):void");
    }

    public static final void A02(C71068Oan oan, String str) {
        int hashCode = oan.A0D.hashCode();
        QuickPerformanceLogger quickPerformanceLogger = oan.A0B;
        if (quickPerformanceLogger.isMarkerOn(755177991, hashCode)) {
            quickPerformanceLogger.markerPoint(755177991, hashCode, str);
        }
    }
}
