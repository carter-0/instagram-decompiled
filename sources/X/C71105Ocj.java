package X;

import android.net.Uri;
import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Ocj  reason: case insensitive filesystem */
public final class C71105Ocj {
    public static final AnonymousClass0eM A05 = AnonymousClass0eN.A00(0eO.A03, C73712PiZ.A00);
    public C69302Nj3 A00 = C69302Nj3.Unknown;
    public final UserSession A01;
    public final OyP A02;
    public final Map A03 = Collections.synchronizedMap(new C58044Ikc(1));
    public final ConcurrentHashMap A04 = new ConcurrentHashMap();

    public C71105Ocj(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        C71042OaK oaK = OyP.A08;
        this.A02 = C71042OaK.A01(userSession);
        if (AnonymousClass45R.A00(userSession)) {
            C69901Nu3.A00(userSession, AnonymousClass05K.A1F).A06(new C59110J6s(this, 12));
        }
    }

    public static final void A00(C74383Pty pty, C71105Ocj ocj, String str) {
        String str2 = str;
        CommonMediaTransport A032 = C66834MdS.A03(str);
        C74383Pty pty2 = pty;
        if (A032 == null) {
            0KC.A0C("ArmadilloExpressMediaStore", 002.A0R("Invalid uri to fetch: ", str));
            pty.DCq("Invalid uri to fetch", 20002, "ArmadilloExpressMediaStore");
            return;
        }
        C71105Ocj ocj2 = ocj;
        Ni4 A002 = OyP.A00(ocj.A02, C71042OaK.A02(A032));
        if (A002.exists()) {
            pty.Dog(DbT.A10(Uri.fromFile(A002)), true);
        } else {
            A01(ocj, A032, str, new C74189PqV((Object) pty2, (Object) ocj2, (Object) A032, str2, 35));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009c, code lost:
        if ((r16 / 1000000) <= (r14 - (r12 * com.instagram.debug.devoptions.sandboxselector.SandboxRepository.CACHE_TTL))) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c7, code lost:
        r10 = new java.util.concurrent.CountDownLatch(1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C71105Ocj r22, com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r23, java.lang.String r24, X.0sP r25) {
        /*
            r2 = 0
            java.lang.String r0 = "msys://ae-media"
            r9 = 0
            r1 = r24
            boolean r0 = X.00p.A0k(r1, r0, r2)
            r7 = r23
            r4 = r25
            if (r0 == 0) goto L_0x0074
            android.net.Uri r5 = X.DbT.A09(r1)
            java.lang.String r0 = "thead_id"
            java.lang.String r1 = r5.getQueryParameter(r0)
            java.lang.String r0 = "thead_jid"
            java.lang.String r3 = r5.getQueryParameter(r0)
            java.lang.String r0 = "otid"
            java.lang.String r19 = r5.getQueryParameter(r0)
            java.lang.String r0 = "timestamp_us"
            java.lang.String r0 = r5.getQueryParameter(r0)
            if (r1 == 0) goto L_0x0074
            if (r19 == 0) goto L_0x0074
            if (r3 == 0) goto L_0x0074
            if (r0 == 0) goto L_0x0074
            java.lang.Long r18 = X.AnonymousClass7TE.A10(r3)
            long r16 = java.lang.Long.parseLong(r0)
            java.lang.String r0 = "force_eb_restore"
            boolean r6 = r5.getBooleanQueryParameter(r0, r2)
            r8 = 1
            r5 = r22
            com.instagram.common.session.UserSession r3 = r5.A01
            X.3U9 r0 = X.C66582MXn.A0b(r3, r1)
            r1 = 0
            if (r0 == 0) goto L_0x0055
            boolean r0 = r0.CVb()
            if (r0 != r8) goto L_0x0055
            r1 = 1
        L_0x0055:
            r25 = r1 ^ 1
            int r0 = r7.bitField0_
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0074
            if (r6 != 0) goto L_0x009e
            X.0Tu r6 = X.0Tu.A05
            r0 = 2342165513276238048(0x20810b20000028e0, double:4.06770911286111E-152)
            boolean r0 = X.182.A06(r6, r3, r0)
            if (r0 == 0) goto L_0x0074
            if (r25 != 0) goto L_0x007a
            X.Nj3 r1 = r5.A00
            X.Nj3 r0 = X.C69302Nj3.DeviceNotOnboarded
            if (r1 != r0) goto L_0x007a
        L_0x0074:
            java.lang.String r0 = r7.directPath_
        L_0x0076:
            r4.invoke(r0)
            return
        L_0x007a:
            long r14 = X.AnonymousClass7TG.A0I()
            if (r25 == 0) goto L_0x00fd
            r0 = 36603979039380466(0x820b20000213f2, double:3.211841964672706E-306)
        L_0x0085:
            long r12 = X.182.A01(r6, r3, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r12)
            X.0qQ.A0A(r0)
            r0 = 86400(0x15180, double:4.26873E-319)
            long r12 = r12 * r0
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r10 = r16 / r0
            long r14 = r14 - r12
            int r0 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r0 > 0) goto L_0x0074
        L_0x009e:
            java.lang.String r6 = r7.objectId_
            X.0qQ.A07(r6)
            java.util.concurrent.ConcurrentHashMap r11 = r5.A04
            java.lang.Object r12 = r11.get(r6)
            java.util.concurrent.CountDownLatch r12 = (java.util.concurrent.CountDownLatch) r12
            if (r12 == 0) goto L_0x00b7
            r0 = 5
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS
            r12.await(r0, r10)
            r11.remove(r6)
        L_0x00b7:
            java.util.Map r0 = r5.A03
            java.lang.Object r0 = r0.get(r6)
            if (r0 != 0) goto L_0x0076
            if (r18 == 0) goto L_0x016a
            java.lang.Object r10 = r11.get(r6)
            if (r10 != 0) goto L_0x00d3
            java.util.concurrent.CountDownLatch r10 = new java.util.concurrent.CountDownLatch
            r10.<init>(r8)
            java.lang.Object r0 = r11.putIfAbsent(r6, r10)
            if (r0 == 0) goto L_0x00d3
            r10 = r0
        L_0x00d3:
            int r0 = r7.bitField0_
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x00fb
            java.lang.String r0 = r7.mimetype_
        L_0x00db:
            java.lang.Integer r9 = X.C66834MdS.A04(r0)
            X.65C r0 = X.AnonymousClass65B.A03
            X.65B r3 = X.AnonymousClass65C.A01(r3)
            long r7 = r18.longValue()
            long r23 = X.AnonymousClass7TE.A0P(r16)
            r16 = 36
            X.PqV r1 = new X.PqV
            r11 = r1
            r12 = r10
            r13 = r5
            r14 = r4
            r15 = r6
            r11.<init>((java.lang.Object) r12, (java.lang.Object) r13, (java.lang.Object) r14, (java.lang.String) r15, (int) r16)
            monitor-enter(r3)
            goto L_0x0103
        L_0x00fb:
            r0 = 0
            goto L_0x00db
        L_0x00fd:
            r0 = 36603979039314929(0x820b20000113f1, double:3.21184196463126E-306)
            goto L_0x0085
        L_0x0103:
            r0 = 4
            X.0qQ.A0B(r9, r0)     // Catch:{ all -> 0x0167 }
            java.lang.String r18 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0167 }
            int r0 = r9.intValue()     // Catch:{ all -> 0x0167 }
            java.lang.String r21 = "audio"
            switch(r0) {
                case 0: goto L_0x0132;
                case 1: goto L_0x0114;
                case 2: goto L_0x0114;
                case 3: goto L_0x012f;
                case 4: goto L_0x012c;
                case 5: goto L_0x0129;
                default: goto L_0x0114;
            }     // Catch:{ all -> 0x0167 }
        L_0x0114:
            X.Pqr r4 = new X.Pqr     // Catch:{ all -> 0x0167 }
            r20 = r6
            r22 = r1
            r16 = r4
            r17 = r3
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r25)     // Catch:{ all -> 0x0167 }
            r0 = 40
            X.Pha r5 = new X.Pha     // Catch:{ all -> 0x0167 }
            r5.<init>(r1, r0)     // Catch:{ all -> 0x0167 }
            goto L_0x0135
        L_0x0129:
            java.lang.String r21 = "sticker"
            goto L_0x0114
        L_0x012c:
            java.lang.String r21 = "gif"
            goto L_0x0114
        L_0x012f:
            java.lang.String r21 = "video"
            goto L_0x0114
        L_0x0132:
            java.lang.String r21 = "image"
            goto L_0x0114
        L_0x0135:
            if (r25 == 0) goto L_0x014f
            byte[] r5 = X.AnonymousClass65B.A04     // Catch:{ all -> 0x0167 }
            byte[] r2 = new byte[r2]     // Catch:{ all -> 0x0167 }
            X.0eE r1 = X.AnonymousClass0t1.A01     // Catch:{ all -> 0x0167 }
            com.instagram.common.session.UserSession r0 = r3.A02     // Catch:{ all -> 0x0167 }
            java.lang.Long r0 = X.C66581MXm.A0r(r0, r1)     // Catch:{ all -> 0x0167 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0167 }
            java.lang.Long r0 = X.C51971G9r.A0m()     // Catch:{ all -> 0x0167 }
            r4.invoke(r5, r2, r1, r0)     // Catch:{ all -> 0x0167 }
            goto L_0x0163
        L_0x014f:
            boolean r0 = r3.A01     // Catch:{ all -> 0x0165 }
            if (r0 == 0) goto L_0x0157
            X.AnonymousClass65B.A03(r3, r5, r4)     // Catch:{ all -> 0x0165 }
            goto L_0x0163
        L_0x0157:
            com.instagram.common.session.UserSession r2 = r3.A02     // Catch:{ all -> 0x0167 }
            r1 = 41
            X.J6W r0 = new X.J6W     // Catch:{ all -> 0x0167 }
            r0.<init>(r1, r5, r4, r3)     // Catch:{ all -> 0x0167 }
            X.AnonymousClass65B.A04(r0, r2)     // Catch:{ all -> 0x0167 }
        L_0x0163:
            monitor-exit(r3)
            return
        L_0x0165:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0167 }
        L_0x0167:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x016a:
            r4.invoke(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71105Ocj.A01(X.Ocj, com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport, java.lang.String, X.0sP):void");
    }

    public final void A03(C74383Pty pty, String str) {
        0qQ.A0B(str, 0);
        if (11Z.A07()) {
            0nY.A00().ATE(new NSE(pty, this, str));
        } else {
            A00(pty, this, str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0025, code lost:
        if ((r4.bitField0_ & 256) == 0) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0027, code lost:
        r2 = r4.mimetype_;
        X.0qQ.A07(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0033, code lost:
        if (X.00p.A0k(r2, org.webrtc.MediaStreamTrack.VIDEO_TRACK_KIND, true) == false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0035, code lost:
        r1 = r3.A02();
        r0 = r4.fileSha256_;
        X.0qQ.A07(r0);
        r1.EEX(X.C69852NtG.A00(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0045, code lost:
        X.JTR.A1O(X.OyP.A00(r3, X.C71042OaK.A02(r4)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0050, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C71105Ocj r5, java.lang.String r6, boolean r7) {
        /*
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r4 = X.C66834MdS.A03(r6)
            if (r4 != 0) goto L_0x0012
            java.lang.String r0 = "Invalid uri to delete: "
            java.lang.String r1 = X.002.A0R(r0, r6)
            java.lang.String r0 = "ArmadilloExpressMediaStore"
            X.0KC.A0C(r0, r1)
            return
        L_0x0012:
            X.OyP r3 = r5.A02
            monitor-enter(r3)
            if (r7 != 0) goto L_0x0020
            boolean r0 = r3.A01     // Catch:{ all -> 0x001d }
            if (r0 != 0) goto L_0x0020
            monitor-exit(r3)
            return
        L_0x001d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0020:
            monitor-exit(r3)
            int r0 = r4.bitField0_
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0035
            java.lang.String r2 = r4.mimetype_
            X.0qQ.A07(r2)
            java.lang.String r1 = "video"
            r0 = 1
            boolean r0 = X.00p.A0k(r2, r1, r0)
            if (r0 == 0) goto L_0x0045
        L_0x0035:
            X.3mW r1 = r3.A02()
            java.lang.String r0 = r4.fileSha256_
            X.0qQ.A07(r0)
            java.lang.String r0 = X.C69852NtG.A00(r0)
            r1.EEX(r0)
        L_0x0045:
            java.lang.String r0 = X.C71042OaK.A02(r4)
            X.Ni4 r0 = X.OyP.A00(r3, r0)
            X.JTR.A1O(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71105Ocj.A02(X.Ocj, java.lang.String, boolean):void");
    }
}
