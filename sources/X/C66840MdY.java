package X;

import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.msys.reverb.ReverbMessage;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.react.modules.base.IgReactQEModule;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Deprecated;
import org.webrtc.EglBase14Impl;

/* renamed from: X.MdY  reason: case insensitive filesystem */
public final class C66840MdY {
    public final UserSession A00;
    public final C370778x3 A01;
    public final ONE A02;
    public final AnonymousClass43Q A03;
    public final AnonymousClass43L A04;
    public final C68951Nba A05;
    public final AnonymousClass43S A06;

    public C66840MdY(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A06 = (AnonymousClass43S) userSession.A01(AnonymousClass43S.class, C73911Plm.A00(userSession, 45));
        this.A04 = (AnonymousClass43L) userSession.A01(AnonymousClass43L.class, C73911Plm.A00(userSession, 43));
        this.A05 = (C68951Nba) userSession.A01(C68951Nba.class, C73911Plm.A00(userSession, 44));
        this.A03 = AnonymousClass43P.A00(userSession);
        this.A01 = C370768x2.A00(userSession);
        this.A02 = (ONE) userSession.A01(ONE.class, new C73661Pha(userSession, 42));
        OSF.A00();
    }

    public static final int A00(String str) {
        Integer num;
        if (00l.A0d(str, "Failed to parse transport event", false)) {
            num = AnonymousClass05K.A06;
        } else if (00l.A0d(str, "Failed to parse transport payload", false)) {
            num = AnonymousClass05K.A07;
        } else if (00l.A0d(str, "Not a top level payload", false)) {
            num = AnonymousClass05K.A09;
        } else if (00l.A0d(str, "Failed to parse protobuf", false)) {
            num = AnonymousClass05K.A08;
        } else if (00l.A0d(str, "Not able to resolve senderIgid", false)) {
            num = AnonymousClass05K.A0A;
        } else if (00l.A0d(str, "Not able to resolve threadIgId", false)) {
            num = AnonymousClass05K.A0B;
        } else if (00l.A0d(str, "Not able to resolve message metadata", false)) {
            num = AnonymousClass05K.A0D;
        } else {
            num = AnonymousClass05K.A01;
        }
        switch (num.intValue()) {
            case 1:
                return 10001;
            case 2:
                return 10002;
            case 3:
                return 10010;
            case 4:
                return 10011;
            case 5:
                return 10012;
            case 6:
                return 10013;
            case 7:
                return 10014;
            case 8:
                return 10015;
            case 9:
                return 10016;
            case 10:
                return 10017;
            case 11:
                return 10018;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return 10019;
            case 13:
                return 10020;
            case 14:
                return 10021;
            case 15:
                return 10022;
            case 16:
                return 10023;
            case 17:
                return 10024;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return 10025;
            case 19:
                return 10026;
            default:
                return 10027;
        }
    }

    public static final 0eP A03(C66840MdY mdY, C74490Pvk pvk, C331237Qc r5, long j, boolean z) {
        N4L n4l;
        0eP A032 = C71037Oa0.A00.A03(mdY.A00, pvk, r5, j);
        C254703su r2 = (C254703su) A032.A00;
        if (r2 == null) {
            return A032;
        }
        N4L n4l2 = r2.A0D;
        if (n4l2 != null) {
            n4l = new N4L((Boolean) n4l2.A03, (Boolean) n4l2.A02, !z, n4l2.A06, z);
        } else {
            n4l = null;
        }
        r2.A0w(n4l);
        return AnonymousClass7TE.A1L(r2, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (X.11Z.A07() != false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.0eP A05(X.C66840MdY r10, X.AnonymousClass7BV r11, java.lang.String r12, java.lang.String r13, java.util.List r14, java.util.List r15, long r16, boolean r18) {
        /*
            X.Nba r3 = r10.A05
            java.lang.String r0 = "reverb_mailbox_api_start"
            r3.A07(r11, r0)
            int r0 = com.facebook.msys.mci.Execution.getExecutionContext()
            boolean r0 = X.AnonymousClass7TF.A1P(r0)
            r1 = 0
            if (r0 != 0) goto L_0x0019
            boolean r0 = X.11Z.A07()
            r2 = 1
            if (r0 == 0) goto L_0x001a
        L_0x0019:
            r2 = 0
        L_0x001a:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = "Synchronous call to load messages from Reverb must NOT be on Msys thread or UI thread."
            X.17k.A0J(r2, r0, r1)
            com.instagram.common.session.UserSession r2 = r10.A00
            java.lang.String r1 = r2.A06()
            java.lang.String r0 = "user_session_state"
            r3.A09(r11, r0, r1)
            if (r13 != 0) goto L_0x006f
            if (r11 == 0) goto L_0x006d
            java.lang.String r13 = ""
        L_0x0032:
            int r1 = r11.A01
            int r0 = r11.A00
        L_0x0036:
            com.instagram.direct.msys.reverb.InstamadilloLoggingContext r7 = new com.instagram.direct.msys.reverb.InstamadilloLoggingContext
            r7.<init>(r13, r1, r0)
        L_0x003b:
            X.Mdg r0 = X.O4V.A00
            r9 = 14
            X.Pzd r4 = new X.Pzd
            r8 = r12
            r6 = r14
            r5 = r15
            r10 = r18
            r4.<init>((java.lang.Object) r5, (java.lang.Object) r6, (java.lang.Object) r7, (java.lang.String) r8, (int) r9, (boolean) r10)
            com.google.common.util.concurrent.SettableFuture r1 = r0.A01(r2, r4)
            java.lang.String r0 = "Synchronous message fetch of Reverb loadMessagesByOTIDs"
            r4 = r16
            X.0eP r0 = A06(r0, r1, r4)
            java.lang.Object r2 = r0.A00
            java.lang.Object r1 = r0.A01
            java.lang.Exception r1 = (java.lang.Exception) r1
            java.lang.String r0 = "reverb_mailbox_api_end"
            r3.A07(r11, r0)
            if (r1 == 0) goto L_0x0068
            if (r11 == 0) goto L_0x0068
            r0 = 0
            r3.A06(r11, r1, r0)
        L_0x0068:
            X.0eP r0 = X.AnonymousClass7TE.A1L(r2, r1)
            return r0
        L_0x006d:
            r7 = 0
            goto L_0x003b
        L_0x006f:
            r0 = -1
            if (r11 != 0) goto L_0x0032
            r1 = -1
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66840MdY.A05(X.MdY, X.7BV, java.lang.String, java.lang.String, java.util.List, java.util.List, long, boolean):X.0eP");
    }

    @Deprecated(message = "Use the futures and passing them downstream.")
    public static final 0eP A06(String str, Future future, long j) {
        Object obj;
        if (j > 0) {
            try {
                obj = future.get(j, TimeUnit.MILLISECONDS);
            } catch (ExecutionException e) {
                0KC.A0E("ArmadilloExpressEncryptedBackupReverbImpl", 002.A0R(str, " failed on ExecutionException"));
                return AnonymousClass7TE.A1L((Object) null, e);
            } catch (TimeoutException e2) {
                long currentTimeMillis = System.currentTimeMillis();
                StringBuilder A0n = AnonymousClass7TF.A0n(str);
                A0n.append(" failed on timeout at ");
                A0n.append(currentTimeMillis);
                0KC.A0E("ArmadilloExpressEncryptedBackupReverbImpl", A0n.toString());
                return AnonymousClass7TE.A1L((Object) null, e2);
            } catch (InterruptedException e3) {
                0KC.A0E("ArmadilloExpressEncryptedBackupReverbImpl", 002.A0R(str, " failed on InterruptedException"));
                return AnonymousClass7TE.A1L((Object) null, e3);
            }
        } else {
            obj = future.get();
        }
        return AnonymousClass7TE.A1L(obj, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:204:0x04ef, code lost:
        X.0qQ.A0A(r4);
        r7.add(r4);
     */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0325  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x033f  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x036e  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x04a2  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x04a7  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x04b2  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x04f6  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x050d  */
    /* JADX WARNING: Removed duplicated region for block: B:265:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0236  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A07(X.C66840MdY r33, X.C331237Qc r34, X.AnonymousClass7BV r35, X.C370538wd r36, java.util.List r37, java.util.List r38, java.util.Map r39, long r40) {
        /*
            r32 = r37
            int r28 = r32.size()
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.lang.String r23 = "[mergeMessagesToServerThreadResult]["
            java.lang.String r5 = "ArmadilloExpressEncryptedBackupReverbImpl"
            r8 = r33
            X.8x3 r4 = r8.A01
            r15 = 0
            r9 = r38
            boolean r24 = X.DbW.A1X(r9)
            com.instagram.common.session.UserSession r3 = r4.A01
            X.0Tu r25 = X.0Tu.A05
            r0 = 36322766056270227(0x810b5d000b2993, double:3.034001741799997E-306)
            r2 = r25
            boolean r0 = X.182.A06(r2, r3, r0)
            r30 = r40
            if (r0 == 0) goto L_0x00a9
            r0 = r24
            java.lang.String r10 = X.C51966G9m.A1G(r9, r0)
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r6 = X.AnonymousClass7TE.A1A()
            r11 = 4
            java.lang.StringBuilder r12 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "thread_fetch_merge_start_"
            r12.append(r0)
            r0 = r30
            r12.append(r0)
            r0 = 95
            r12.append(r0)
            r12.append(r2)
            java.lang.String r0 = " : ["
            java.lang.String r12 = X.AnonymousClass7TF.A0l(r0, r12)
            java.lang.String r13 = "timestamp : "
            java.text.SimpleDateFormat r1 = r4.A02
            java.util.Date r0 = new java.util.Date
            r0.<init>(r2)
            java.lang.String r0 = r1.format(r0)
            java.lang.String r3 = ", "
            java.lang.String r2 = X.002.A0g(r13, r0, r3)
            java.lang.String r13 = "thread_jid : "
            r0 = r30
            java.lang.String r13 = X.002.A0e(r13, r3, r0)
            java.lang.String r1 = "local_return_messages : "
            X.Pnf r14 = X.C74014Pnf.A00
            r0 = r32
            java.lang.String r0 = X.DbT.A0z(r3, r0, r14)
            r3 = 32
            java.lang.String r0 = X.002.A0S(r1, r0, r3)
            java.lang.String[] r2 = new java.lang.String[]{r12, r2, r13, r0}
            r1 = 0
        L_0x0087:
            r0 = r2[r1]
            r6.append(r0)
            int r1 = r1 + 1
            if (r1 < r11) goto L_0x0087
            if (r10 == 0) goto L_0x009b
            java.lang.String r0 = ", local_has_more_metadata : "
            java.lang.String r0 = X.002.A0S(r0, r10, r3)
            r6.append(r0)
        L_0x009b:
            java.lang.String r0 = "]"
            r6.append(r0)
            com.google.common.collect.EvictingQueue r1 = r4.A00
            java.lang.String r0 = r6.toString()
            r1.add(r0)
        L_0x00a9:
            java.util.HashMap r27 = X.AnonymousClass7TE.A1E()
            java.util.HashMap r26 = X.AnonymousClass7TE.A1E()
            java.util.HashMap r4 = X.AnonymousClass7TE.A1E()
            r6 = r36
            boolean r12 = r6.CKJ()
            java.lang.String r0 = r6.A06
            if (r0 == 0) goto L_0x00d6
            long r0 = X.C2611348j.A01(r0)
            long r0 = X.AnonymousClass7TE.A0P(r0)
            java.lang.Long r11 = java.lang.Long.valueOf(r0)
        L_0x00cb:
            boolean r0 = r9.isEmpty()
            r10 = 1
            r0 = r0 ^ 1
            r2 = 0
            if (r0 == 0) goto L_0x010b
            goto L_0x00d8
        L_0x00d6:
            r11 = 0
            goto L_0x00cb
        L_0x00d8:
            r0 = r24
            java.lang.Object r0 = r9.get(r0)     // Catch:{ JSONException -> 0x0108 }
            X.DbS.A1Y(r0)     // Catch:{ JSONException -> 0x0108 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ JSONException -> 0x0108 }
            org.json.JSONObject r9 = X.C66580MXl.A17(r0)     // Catch:{ JSONException -> 0x0108 }
            java.lang.String r0 = "hasMoreBefore"
            java.lang.String r1 = r9.getString(r0)     // Catch:{ JSONException -> 0x0108 }
            java.lang.String r0 = "true"
            boolean r3 = r1.equals(r0)     // Catch:{ JSONException -> 0x0108 }
            if (r3 == 0) goto L_0x0113
            java.lang.String r0 = "oldestLocalTimestampInResult"
            java.lang.String r1 = r9.getString(r0)     // Catch:{ JSONException -> 0x010d }
            if (r1 == 0) goto L_0x0113
            int r0 = r1.length()     // Catch:{ JSONException -> 0x010d }
            if (r0 == 0) goto L_0x0113
            java.lang.Long r15 = X.AnonymousClass7TE.A10(r1)     // Catch:{ JSONException -> 0x010d }
            goto L_0x0113
        L_0x0108:
            r1 = move-exception
            r3 = 0
            goto L_0x010e
        L_0x010b:
            r3 = 0
            goto L_0x0113
        L_0x010d:
            r1 = move-exception
        L_0x010e:
            java.lang.String r0 = "cannot parse incoming json"
            X.0KC.A0J(r5, r0, r1)
        L_0x0113:
            if (r12 == 0) goto L_0x011d
            if (r11 != 0) goto L_0x011d
            java.lang.String r0 = "[getMergedCursor] serverOldestTimestampMs should not be null if serverHasMore is true"
            X.0KC.A0C(r5, r0)
            r12 = 0
        L_0x011d:
            if (r3 == 0) goto L_0x0127
            if (r15 != 0) goto L_0x0127
            java.lang.String r0 = "[getMergedCursor] localOldestTimestampMs should not be null if localHasMore is true"
            X.0KC.A0C(r5, r0)
            r3 = 0
        L_0x0127:
            if (r12 != 0) goto L_0x012c
            if (r3 != 0) goto L_0x012c
            r10 = 0
        L_0x012c:
            java.lang.String r22 = "Required value was null."
            if (r12 == 0) goto L_0x01d3
            if (r3 == 0) goto L_0x01cb
            if (r11 == 0) goto L_0x052a
            long r2 = r11.longValue()
            if (r15 == 0) goto L_0x0525
            long r0 = r15.longValue()
            long r0 = java.lang.Math.max(r2, r0)
        L_0x0142:
            java.lang.Long r2 = X.C66582MXn.A0l(r0)
        L_0x0146:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            X.0eP r0 = X.AnonymousClass7TE.A1L(r0, r2)
            java.lang.Object r3 = r0.A00
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r21 = r3.booleanValue()
            java.lang.Object r11 = r0.A01
            java.lang.Number r11 = (java.lang.Number) r11
            r29 = r39
            if (r39 == 0) goto L_0x01dd
            java.util.Iterator r10 = X.AnonymousClass7TF.A0u(r29)
        L_0x0162:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x01dd
            java.lang.Object r1 = r10.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r0 = r1.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r2 = r0.intValue()
            r0 = 10000(0x2710, float:1.4013E-41)
            if (r2 == r0) goto L_0x0162
            r0 = 10028(0x272c, float:1.4052E-41)
            if (r2 == r0) goto L_0x0162
            r0 = 10002(0x2712, float:1.4016E-41)
            if (r2 != r0) goto L_0x019a
            java.lang.Object r9 = r1.getKey()
            java.lang.String r2 = "This message "
            java.lang.Object r1 = r1.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = " is locally marked as deleted."
            java.lang.String r0 = X.002.A0g(r2, r1, r0)
            r4.put(r9, r0)
            goto L_0x0162
        L_0x019a:
            r0 = 10010(0x271a, float:1.4027E-41)
            if (r2 == r0) goto L_0x01c7
            r0 = 10011(0x271b, float:1.4028E-41)
            if (r2 == r0) goto L_0x01c7
            r0 = 10017(0x2721, float:1.4037E-41)
            if (r2 == r0) goto L_0x01c7
            r0 = 10020(0x2724, float:1.4041E-41)
            if (r2 == r0) goto L_0x01c7
            r0 = 10012(0x271c, float:1.403E-41)
            if (r2 == r0) goto L_0x01c7
            java.lang.Object r9 = r1.getKey()
            java.lang.String r2 = "Reverb query failed with error code "
            java.lang.Object r0 = r1.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            r0 = 46
            java.lang.String r0 = X.002.A0I(r2, r0, r1)
            r4.put(r9, r0)
        L_0x01c7:
            r0 = 1
            r6.A09 = r0
            goto L_0x0162
        L_0x01cb:
            if (r11 == 0) goto L_0x052f
            long r0 = r11.longValue()
            goto L_0x0142
        L_0x01d3:
            if (r3 == 0) goto L_0x0146
            if (r15 == 0) goto L_0x0534
            long r0 = r15.longValue()
            goto L_0x0142
        L_0x01dd:
            java.util.List r0 = r6.A07
            java.util.ArrayList r9 = X.DbV.A15(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x01e7:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01fe
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.3su r0 = (X.C254703su) r0
            boolean r0 = r0.A1d()
            if (r0 == 0) goto L_0x01e7
            r9.add(r1)
            goto L_0x01e7
        L_0x01fe:
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r1 = r9.iterator()
        L_0x0206:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x021c
            java.lang.Object r0 = r1.next()
            X.3su r0 = (X.C254703su) r0
            java.lang.String r0 = r0.A0f()
            if (r0 == 0) goto L_0x0206
            r2.add(r0)
            goto L_0x0206
        L_0x021c:
            java.util.Set r20 = X.00k.A0k(r2)
            X.43S r2 = r8.A06
            java.lang.String r0 = "build_direct_message_from_reverb_message_start"
            r9 = r35
            r2.A07(r9, r0)
            java.util.ArrayList r19 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r18 = X.AnonymousClass7TE.A1C()
            r1 = 0
        L_0x0232:
            r0 = r28
            if (r1 >= r0) goto L_0x031f
            r0 = r32
            java.lang.Object r10 = r0.get(r1)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.msys.reverb.ReverbMessage"
            X.0qQ.A0C(r10, r0)
            com.instagram.direct.msys.reverb.ReverbMessage r10 = (com.instagram.direct.msys.reverb.ReverbMessage) r10
            X.ONE r13 = r8.A02
            java.lang.String r12 = r10.getMessageId()
            r0 = r20
            boolean r17 = r0.contains(r12)
            r33 = r34
            r12 = r13
            r13 = r33
            r14 = r10
            r15 = r30
            X.0eP r0 = r12.A00(r13, r14, r15, r17)
            java.lang.Object r13 = r0.A00
            X.3su r13 = (X.C254703su) r13
            java.lang.Object r12 = r0.A01
            java.lang.String r12 = (java.lang.String) r12
            if (r13 == 0) goto L_0x0291
            java.lang.String r0 = r13.A0g()
            java.lang.String r10 = X.C2611348j.A03(r0)
            if (r10 == 0) goto L_0x0274
            r0 = r27
            r0.put(r10, r13)
        L_0x0274:
            if (r21 == 0) goto L_0x0284
            long r16 = r13.C7c()
            if (r11 == 0) goto L_0x031a
            long r14 = r11.longValue()
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r0 < 0) goto L_0x028e
        L_0x0284:
            r7.add(r13)
            if (r10 == 0) goto L_0x028e
            r0 = r26
            r0.put(r10, r13)
        L_0x028e:
            int r1 = r1 + 1
            goto L_0x0232
        L_0x0291:
            if (r12 != 0) goto L_0x0295
            java.lang.String r12 = "Fail to build direct message from reverb message."
        L_0x0295:
            java.lang.String r0 = r10.getMessageId()
            if (r0 == 0) goto L_0x028e
            java.lang.String r0 = r10.getMessageId()
            r4.put(r0, r12)
            java.lang.String r14 = "failed to build direct message from reverb message "
            java.lang.String r13 = r10.getMessageId()
            java.lang.String r0 = " due to "
            java.lang.String r0 = X.002.A0u(r14, r13, r0, r12)
            X.0KC.A0C(r5, r0)
            boolean r0 = r10.isFromEBServer()
            if (r0 != 0) goto L_0x028e
            java.lang.String r0 = r10.getMessageId()
            r13 = 58
            java.lang.String r14 = X.002.A0T(r0, r12, r13)
            r0 = r18
            r0.add(r14)
            java.lang.String r0 = r10.getMessageId()
            java.lang.String r15 = X.C2611348j.A03(r0)
            com.instagram.common.session.UserSession r0 = r8.A00
            X.2Dm r14 = X.2L2.A00(r0)
            r0 = r33
            com.instagram.model.direct.DirectThreadKey r0 = r0.A00
            X.3su r0 = r14.BRz(r0, r15)
            if (r0 != 0) goto L_0x028e
            java.lang.String r0 = r10.getMessageId()
            java.lang.String r13 = X.002.A0T(r0, r12, r13)
            r0 = r19
            r0.add(r13)
            X.0wj r14 = X.0wj.A01
            r13 = 20123732(0x1331054, float:3.2888822E-38)
            java.lang.String r0 = "failed to build direct message from reverb message and message is missing in cache"
            X.0f9 r13 = r14.AEf(r0, r13)
            java.lang.Long r0 = r6.A00()
            long r14 = r0.longValue()
            java.lang.String r14 = java.lang.String.valueOf(r14)
            java.lang.String r0 = "threadId"
            r13.ABQ(r0, r14)
            java.lang.String r10 = r10.getMessageId()
            java.lang.String r0 = "messageId"
            r13.ABQ(r0, r10)
            java.lang.String r0 = "error"
            r13.ABQ(r0, r12)
            r13.report()
            goto L_0x028e
        L_0x031a:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r22)
            throw r0
        L_0x031f:
            boolean r0 = X.DbT.A1b(r18)
            if (r0 == 0) goto L_0x0339
            X.Pnm r10 = X.C74021Pnm.A00
            java.lang.String r1 = ", "
            r0 = r18
            java.lang.String r0 = X.DbT.A0z(r1, r0, r10)
            java.lang.String r1 = "build_reverb_only_messages_error_message"
            r2.A09(r9, r1, r0)
            java.lang.String r0 = "message_build_issue"
            r2.A0A(r9, r0, r1)
        L_0x0339:
            boolean r0 = X.DbT.A1b(r19)
            if (r0 == 0) goto L_0x0357
            int r1 = r19.size()
            java.lang.String r0 = "size_of_missing_reverb_only_messages"
            r2.A08(r9, r0, r1)
            X.Pnn r10 = X.C74022Pnn.A00
            java.lang.String r1 = ", "
            r0 = r19
            java.lang.String r1 = X.DbT.A0z(r1, r0, r10)
            java.lang.String r0 = "missing_reverb_only_messages_error_message"
            r2.A09(r9, r0, r1)
        L_0x0357:
            java.lang.String r0 = "build_direct_message_from_reverb_message_end"
            r2.A07(r9, r0)
            r32.size()
            r7.size()
            java.util.List r0 = r6.A07
            java.util.Iterator r19 = r0.iterator()
        L_0x0368:
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x0494
            java.lang.Object r12 = r19.next()
            X.0qQ.A07(r12)
            X.3su r12 = (X.C254703su) r12
            java.lang.String r0 = r12.A0g()
            java.lang.String r10 = X.C2611348j.A03(r0)
            if (r10 == 0) goto L_0x040e
            r0 = r27
            boolean r0 = r0.containsKey(r10)
            if (r0 == 0) goto L_0x03e5
            X.2FW r1 = r12.A10
            X.2FW r0 = X.2FW.A0n
            if (r1 != r0) goto L_0x03e5
            r0 = r27
            java.lang.Object r10 = r0.get(r10)
            if (r10 == 0) goto L_0x0485
            X.3su r10 = (X.C254703su) r10
            java.lang.String r1 = r12.A0g()
            if (r1 == 0) goto L_0x0480
            java.lang.String r0 = r10.A0g()
            if (r0 == 0) goto L_0x047b
            int r0 = r1.compareTo(r0)
            if (r0 >= 0) goto L_0x0368
            java.lang.String r0 = "Run into a case where we need to update e2eeMessage's timestamp"
            X.0KC.A0C(r5, r0)
            java.lang.String r0 = r12.A0g()
            r10.A1E(r0)
            long r17 = r12.C7c()
            long r15 = r10.C7c()
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 >= 0) goto L_0x0368
            if (r11 == 0) goto L_0x03d9
            long r13 = r11.longValue()
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 < 0) goto L_0x03d9
            int r0 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x03d9
            java.lang.String r0 = "Run into a case where we trim the mssage after e2ee timestamp change"
            X.0KC.A0C(r5, r0)
            r7.remove(r10)
        L_0x03d9:
            long r0 = r12.C7c()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r10.A1A(r0)
            goto L_0x0368
        L_0x03e5:
            r0 = r26
            boolean r0 = r0.containsKey(r10)
            if (r0 == 0) goto L_0x040e
            com.instagram.common.session.UserSession r14 = r8.A00
            r0 = 36318892004022995(0x8107d700891ad3, double:3.031551775559291E-306)
            r13 = r25
            boolean r0 = X.182.A06(r13, r14, r0)
            if (r0 == 0) goto L_0x040e
            r0 = r26
            java.lang.Object r0 = r0.get(r10)
            if (r0 == 0) goto L_0x048a
            X.3su r0 = (X.C254703su) r0
            boolean r0 = X.C254703su.A0B(r12, r0)
            if (r0 == 0) goto L_0x040e
            goto L_0x0368
        L_0x040e:
            if (r21 == 0) goto L_0x041e
            long r15 = r12.C7c()
            if (r11 == 0) goto L_0x048f
            long r13 = r11.longValue()
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 < 0) goto L_0x0368
        L_0x041e:
            X.2FW r1 = r12.A10
            X.2FW r0 = X.2FW.A0n
            if (r1 != r0) goto L_0x0473
            if (r10 == 0) goto L_0x0449
            java.lang.Object r13 = r4.get(r10)
            java.lang.String r13 = (java.lang.String) r13
            if (r13 != 0) goto L_0x043c
            if (r39 == 0) goto L_0x0478
            java.lang.String r1 = "has_messages_fail_to_deserialize"
            r0 = r29
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L_0x0478
            java.lang.String r13 = "Message decryption might fail at deserialization."
        L_0x043c:
            java.lang.String r1 = r12.A0k()
            r0 = 32
            java.lang.String r0 = X.002.A0T(r1, r13, r0)
            r12.A1F(r0)
        L_0x0449:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r0 = r23
            r13.append(r0)
            r0 = r30
            r13.append(r0)
            java.lang.String r0 = "]["
            r13.append(r0)
            r13.append(r10)
            java.lang.String r0 = "] One message not decrypted correctly in reverb"
            r13.append(r0)
            java.lang.String r0 = r13.toString()
            X.0KC.A0C(r5, r0)
            java.lang.String r1 = "unknonw_reverb_error"
            java.lang.String r0 = "potential_decryption_error"
            r2.A0A(r9, r1, r0)
        L_0x0473:
            r7.add(r12)
            goto L_0x0368
        L_0x0478:
            java.lang.String r13 = "Server message is not processed for unknown error."
            goto L_0x043c
        L_0x047b:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r22)
            throw r0
        L_0x0480:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r22)
            throw r0
        L_0x0485:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r22)
            throw r0
        L_0x048a:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r22)
            throw r0
        L_0x048f:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r22)
            throw r0
        L_0x0494:
            r7.size()
            r0 = 2
            java.util.List r8 = X.C73429PcU.A00(r7, r0)
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x050d
            r0 = 0
        L_0x04a3:
            r6.A07 = r8
            if (r0 == 0) goto L_0x04f6
            r6.A06 = r0
        L_0x04a9:
            r6.A04 = r3
            r8.size()
            X.NHP r0 = r6.A02
            if (r0 == 0) goto L_0x0524
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.List r0 = r0.A04
            if (r0 == 0) goto L_0x0518
            java.util.Iterator r5 = r0.iterator()
        L_0x04be:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0518
            java.lang.Object r4 = r5.next()
            X.3su r4 = (X.C254703su) r4
            java.util.Iterator r3 = r8.iterator()
        L_0x04ce:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x04ef
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.3su r0 = (X.C254703su) r0
            java.lang.String r1 = r0.A0f()
            java.lang.String r0 = r4.A0f()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x04ce
            if (r2 == 0) goto L_0x04ef
            r7.add(r2)
            goto L_0x04be
        L_0x04ef:
            X.0qQ.A0A(r4)
            r7.add(r4)
            goto L_0x04be
        L_0x04f6:
            if (r21 == 0) goto L_0x04a9
            java.lang.String r7 = "] oldest cursor is null while hasOlder is true"
            r4 = r23
            r0 = r30
            java.lang.String r0 = X.002.A0e(r4, r7, r0)
            X.0KC.A0C(r5, r0)
            java.lang.String r1 = "cursor"
            java.lang.String r0 = "oldest cursor is null while hasOlder is true"
            r2.A0A(r9, r1, r0)
            goto L_0x04a9
        L_0x050d:
            r0 = r24
            java.lang.Object r0 = r8.get(r0)
            java.lang.String r0 = X.C66580MXl.A0y(r0)
            goto L_0x04a3
        L_0x0518:
            boolean r0 = X.DbT.A1b(r7)
            if (r0 == 0) goto L_0x0524
            X.NHP r0 = r6.A02
            if (r0 == 0) goto L_0x0524
            r0.A04 = r7
        L_0x0524:
            return
        L_0x0525:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r22)
            throw r0
        L_0x052a:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r22)
            throw r0
        L_0x052f:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r22)
            throw r0
        L_0x0534:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r22)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66840MdY.A07(X.MdY, X.7Qc, X.7BV, X.8wd, java.util.List, java.util.List, java.util.Map, long):void");
    }

    public static final void A08(C370538wd r3, String str) {
        StringBuilder sb;
        String A0k;
        String A0E = 002.A0E(str, ' ', '.');
        List<C254703su> list = r3.A07;
        0qQ.A07(list);
        for (C254703su r2 : list) {
            if (r2.A10 == 2FW.A0n) {
                if (r2.A0k() == null) {
                    A0k = "default error is";
                } else {
                    sb = new StringBuilder();
                    A0k = r2.A0k();
                }
                sb.append(A0k);
                sb.append(A0E);
                r2.A1F(sb.toString());
            }
        }
    }

    public final 0eP A09(C331237Qc r35, String str, String str2, List list, List list2, int i, long j, long j2) {
        2FW r1;
        int i2;
        Integer num;
        int i3;
        String str3;
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A032 = C2611348j.A03(AnonymousClass7TE.A18(it));
            if (A032 != null) {
                A1C.add(A032);
            }
        }
        LinkedHashMap linkedHashMap = null;
        if (A1C.isEmpty()) {
            list.size();
        } else {
            C68951Nba nba = this.A05;
            UserSession userSession = this.A00;
            long j3 = j;
            String valueOf = String.valueOf(j3);
            C331237Qc r33 = r35;
            String str4 = r33.A00.A01;
            int i4 = i;
            C68951Nba nba2 = nba;
            UserSession userSession2 = userSession;
            AnonymousClass7BV A012 = nba2.A01(userSession2, Boolean.valueOf(AnonymousClass7TF.A1S(i4, 2)), Boolean.valueOf(AnonymousClass7TF.A1S(i4, 1)), (Long) null, 20128172, this.A03.A00(), 2Aj.A02(userSession), false);
            02m r10 = nba.A00;
            int i5 = A012.A01;
            int i6 = A012.A00;
            MarkerEditor withMarker = r10.withMarker(i5, i6);
            withMarker.annotate("thread_jid", valueOf);
            withMarker.annotate("network_fetch_disabled", true);
            withMarker.annotate(DialogModule.KEY_MESSAGE, 00k.A0P(",", "", "", A1C, (0sP) null));
            withMarker.annotate("message_count", A1C.size());
            String str5 = str2;
            withMarker.annotate("fetch_reason", str5);
            withMarker.annotate("reverb_include_deleted_messages", false);
            withMarker.annotate("reverb_include_replied_messages", false);
            withMarker.markerEditingCompleted();
            if (str4 != null) {
                r10.markerAnnotate(i5, i6, ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str4);
            }
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            Map A0E = 0Yt.A0E();
            LinkedHashMap A1H = AnonymousClass7TE.A1H();
            LinkedHashSet A0y = DbS.A0y();
            0Tu r16 = 0Tu.A05;
            List list3 = list2;
            if (!182.A06(r16, userSession, 36318892003564238L) || (list2 != null && !list3.isEmpty())) {
                nba.A07(A012, "reverb_intercept_start");
                0eP A052 = A05(this, A012, valueOf, str, A1C, list3, j2, false);
                C70546OAu oAu = (C70546OAu) A052.A00;
                Exception exc = (Exception) A052.A01;
                nba.A07(A012, "reverb_intercept_end");
                if (exc != null) {
                    nba.A06(A012, exc, (String) null);
                }
                if (oAu == null) {
                    A1C.size();
                    nba.A0A(A012, "reverb_error", "queryMessageByOTIDS response is null");
                    if (exc instanceof TimeoutException) {
                        num = AnonymousClass05K.A0u;
                    } else if (exc instanceof ExecutionException) {
                        num = AnonymousClass05K.A15;
                    } else if (exc instanceof InterruptedException) {
                        num = AnonymousClass05K.A1F;
                    }
                    switch (num.intValue()) {
                        case 6:
                            i3 = 10013;
                            break;
                        case 7:
                            i3 = 10014;
                            break;
                        default:
                            i3 = 10015;
                            break;
                    }
                    Integer valueOf2 = Integer.valueOf(i3);
                    if (valueOf2 != null) {
                        linkedHashMap = C66582MXn.A0y("message_fetch_infra_exception_key", valueOf2);
                    }
                } else {
                    List list4 = oAu.A00;
                    A0E = oAu.A01;
                    0qQ.A0C(A0E, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Int>");
                    int size = list4.size();
                    A1H.putAll(A0E);
                    for (int i7 = 0; i7 < size; i7++) {
                        Object obj = list4.get(i7);
                        0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.msys.reverb.ReverbMessage");
                        ReverbMessage reverbMessage = (ReverbMessage) obj;
                        0eP A002 = this.A02.A00(r33, reverbMessage, j3, false);
                        C254703su r0 = (C254703su) A002.A00;
                        String str6 = (String) A002.A01;
                        if (r0 != null) {
                            A1C2.add(r0);
                            String A0f = r0.A0f();
                            if (A0f != null) {
                                A0y.add(A0f);
                            }
                        }
                        if (str6 != null) {
                            int A003 = A00(str6);
                            String messageId = reverbMessage.getMessageId();
                            0qQ.A07(messageId);
                            C66580MXl.A1T(messageId, A1H, A003);
                        }
                    }
                }
            } else {
                NAP A004 = C66843Mdb.A00(userSession);
                int size2 = list.size();
                ArrayList A0v = DbS.A0v(size2);
                for (int i8 = 0; i8 < size2; i8++) {
                    A0v.add(valueOf);
                }
                AnonymousClass68L A0F = C66580MXl.A0F(A004, 2);
                MailboxFutureImpl A0G = C66580MXl.A0G(A0F);
                C66582MXn.A1E(A0F, new C71664Ooj(2, A004, A0v, A0G, A1C), A0G);
                NB3 nb3 = (NB3) ((MailboxNullable) A0G.get()).value;
                if (nb3 != null) {
                    int A042 = C66580MXl.A04(nb3);
                    for (int i9 = 0; i9 < A042; i9++) {
                        0eP A033 = A03(this, new P0X(nb3, i9), r33, j3, false);
                        C254703su r02 = (C254703su) A033.A00;
                        if (r02 != null) {
                            A1C2.add(r02);
                            String A0f2 = r02.A0f();
                            if (A0f2 != null) {
                                A0y.add(A0f2);
                            }
                        } else {
                            Object obj2 = A033.A01;
                            if (obj2 != null) {
                                Throwable th = (Throwable) obj2;
                                if (th == null || (str3 = th.getMessage()) == null) {
                                    str3 = "unknown";
                                }
                                C66580MXl.A1T(new P0X(nb3, i9).BZR(), A1H, A00(str3));
                            }
                        }
                    }
                }
            }
            Iterator it2 = A1C.iterator();
            while (it2.hasNext()) {
                String A18 = AnonymousClass7TE.A18(it2);
                if (!A0y.contains(A18)) {
                    C66580MXl.A1T(A18, A1H, 10016);
                    0f9 AEf = 0wj.A01.AEf("Message point query fetch fails", 20123732);
                    AEf.ABQ("fetchReason", str5);
                    AEf.ABP("threadId", j3);
                    AEf.ABQ("messageId", A18);
                    Number A0z = JTO.A0z(A18, A1H);
                    if (A0z != null) {
                        i2 = A0z.intValue();
                    } else {
                        i2 = 10001;
                    }
                    AEf.ABO("error", i2);
                    AEf.report();
                }
            }
            if (A1C2.size() < A1C.size()) {
                nba.A0A(A012, "reverb_error", 002.A0R("Few messages were not fetched, possible reasons are ", 00k.A0P(",", "", "", A1H.entrySet(), (0sP) null)));
            } else {
                nba.A0C(A012);
            }
            if (!182.A06(r16, userSession, 2342161901213981354L)) {
                ArrayList A1C3 = AnonymousClass7TE.A1C();
                Iterator it3 = A1C2.iterator();
                while (it3.hasNext()) {
                    Object next = it3.next();
                    C254933tI A0P = ((C254703su) next).A0P();
                    if (A0P != null) {
                        r1 = A0P.A0F;
                    } else {
                        r1 = null;
                    }
                    if (r1 == 2FW.A1M) {
                        A1C3.add(next);
                    }
                }
                Iterator it4 = A1C3.iterator();
                while (it4.hasNext()) {
                    C66580MXl.A0a(it4).A13((C254933tI) null);
                }
            }
            return AnonymousClass7TE.A1L(A1C2, A0E);
        }
        return AnonymousClass7TE.A1L(0sn.A00, linkedHashMap);
    }

    /* JADX WARNING: type inference failed for: r10v6, types: [X.NB3, X.5z0] */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x030f, code lost:
        X.0qQ.A0A(r12);
        r10.add(r12);
     */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0441  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0464 A[LOOP:9: B:157:0x045e->B:159:0x0464, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0473  */
    /* JADX WARNING: Removed duplicated region for block: B:203:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B(X.C331237Qc r42, X.AnonymousClass7BV r43, X.C370538wd r44, java.lang.String r45, java.lang.String r46, int r47, long r48, long r50, boolean r52) {
        /*
            r41 = this;
            r0 = r44
            java.util.List r1 = r0.A07
            java.util.ArrayList r8 = X.DbV.A15(r1)
            java.util.Iterator r2 = r1.iterator()
        L_0x000c:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0020
            java.lang.Object r1 = r2.next()
            X.3su r1 = (X.C254703su) r1
            java.lang.String r1 = r1.A1Y
            if (r1 == 0) goto L_0x000c
            r8.add(r1)
            goto L_0x000c
        L_0x0020:
            java.util.List r1 = r0.A07
            r1.size()
            r8.size()
            boolean r3 = r0.A03()
            r7 = 0
            r2 = r41
            r36 = r42
            r1 = r43
            r16 = r47
            r25 = r48
            if (r3 != 0) goto L_0x03a1
            com.instagram.common.session.UserSession r3 = r2.A00
            r40 = r3
            r5 = 0
            X.0Tu r9 = X.0Tu.A05
            r3 = 36318892003564238(0x8107d700821ace, double:3.0315517752691715E-306)
            r6 = r40
            boolean r3 = X.182.A06(r9, r6, r3)
            if (r3 == 0) goto L_0x03a1
            java.util.List r3 = r0.A07
            java.util.ArrayList r6 = X.DbV.A15(r3)
            java.util.Iterator r4 = r3.iterator()
        L_0x0057:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L_0x006b
            java.lang.Object r3 = r4.next()
            X.3su r3 = (X.C254703su) r3
            java.lang.String r3 = r3.A1Y
            if (r3 == 0) goto L_0x0057
            r6.add(r3)
            goto L_0x0057
        L_0x006b:
            java.util.List r3 = r0.A07
            r3.size()
            r6.size()
            java.lang.String r3 = r0.A05
            X.C2611348j.A03(r3)
            java.lang.String r3 = r0.A05
            X.C2611348j.A03(r3)
            java.lang.String r3 = r0.A06
            X.C2611348j.A03(r3)
            X.NAP r7 = X.C66843Mdb.A00(r40)
            java.lang.String r24 = java.lang.String.valueOf(r25)
            java.util.List r9 = X.AnonymousClass7TE.A1I(r24)
            if (r45 == 0) goto L_0x0180
            java.lang.String r3 = X.C2611348j.A03(r45)
        L_0x0094:
            java.util.List r10 = X.0sr.A1N(r3)
            X.68J r4 = r7.mMailboxApiHandleMetaProvider
            r3 = 2
            X.68L r4 = r4.ASa(r3)
            com.facebook.msys.mca.MailboxFutureImpl r8 = X.C66580MXl.A0G(r4)
            X.Oot r6 = new X.Oot
            r12 = r52
            r11 = r16
            r6.<init>(r7, r8, r9, r10, r11, r12)
            X.C66582MXn.A1E(r4, r6, r8)
            java.lang.Object r4 = r8.get()
            com.facebook.msys.mca.MailboxNullable r4 = (com.facebook.msys.mca.MailboxNullable) r4
            java.lang.Object r4 = r4.value
            X.5z0 r4 = (X.C301345z0) r4
            if (r4 != 0) goto L_0x00c4
            X.43S r8 = r2.A06
            java.lang.String r7 = "query_message_from_direct_cql"
            java.lang.String r6 = "result_from_direct_cql_is_null"
            r8.A0A(r1, r7, r6)
        L_0x00c4:
            java.util.ArrayList r15 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r13 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.lang.String r23 = "error"
            java.lang.String r22 = "messageId"
            java.lang.String r21 = "threadId"
            java.lang.String r20 = "Unknown error"
            r12 = 0
            if (r4 == 0) goto L_0x0198
            int r6 = X.C66580MXl.A04(r4)
            if (r6 <= 0) goto L_0x0198
            com.facebook.msys.mci.CQLResultSet r6 = r4.mResultSet
            boolean r32 = r6.getBoolean(r5, r3)
            com.facebook.msys.mci.CQLResultSet r3 = r4.mResultSet
            r11 = 1
            boolean r33 = r3.getBoolean(r5, r11)
            com.facebook.msys.mci.CQLResultSet r6 = r4.mResultSet
            r3 = 4
            com.facebook.msys.mci.CQLResultSet r3 = r6.getChildResultSet(r5, r3)
            X.NB3 r10 = new X.NB3
            r10.<init>(r3)
            com.facebook.msys.mci.CQLResultSet r4 = r4.mResultSet
            r3 = 5
            com.facebook.msys.mci.CQLResultSet r19 = r4.getChildResultSet(r5, r3)
            int r18 = X.C66580MXl.A04(r10)
        L_0x0109:
            r3 = r18
            if (r12 >= r3) goto L_0x0183
            X.P0X r3 = new X.P0X
            r3.<init>(r10, r12)
            r34 = r2
            r35 = r3
            r39 = r5
            r37 = r25
            X.0eP r6 = A03(r34, r35, r36, r37, r39)
            java.lang.Object r3 = r6.A00
            if (r3 == 0) goto L_0x0128
            r15.add(r3)
        L_0x0125:
            int r12 = r12 + 1
            goto L_0x0109
        L_0x0128:
            X.P0X r3 = new X.P0X
            r3.<init>(r10, r12)
            java.lang.String r9 = r3.BZR()
            X.2Dm r4 = X.2L2.A00(r40)
            r3 = r36
            com.instagram.model.direct.DirectThreadKey r3 = r3.A00
            X.3su r3 = r4.BRz(r3, r9)
            if (r3 != 0) goto L_0x0125
            java.lang.Object r3 = r6.A01
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            if (r3 == 0) goto L_0x014b
            java.lang.String r6 = r3.getLocalizedMessage()
            if (r6 != 0) goto L_0x014d
        L_0x014b:
            r6 = r20
        L_0x014d:
            r3 = 58
            java.lang.String r3 = X.002.A0T(r9, r6, r3)
            r8.add(r3)
            X.0wj r14 = X.0wj.A01
            java.lang.String r4 = "direct cql result failed to parse message for revreb messages"
            r3 = 20123732(0x1331054, float:3.2888822E-38)
            X.0f9 r4 = r14.AEf(r4, r3)
            java.lang.Long r3 = r0.A00()
            long r16 = r3.longValue()
            java.lang.String r14 = java.lang.String.valueOf(r16)
            r3 = r21
            r4.ABQ(r3, r14)
            r3 = r22
            r4.ABQ(r3, r9)
            r3 = r23
            r4.ABQ(r3, r6)
            r4.report()
            goto L_0x0125
        L_0x0180:
            r3 = 0
            goto L_0x0094
        L_0x0183:
            int r6 = r19.getCount()
            r4 = 0
        L_0x0188:
            if (r4 >= r6) goto L_0x019c
            r3 = r19
            java.lang.String r3 = r3.getString(r4, r11)
            if (r3 == 0) goto L_0x0195
            r13.add(r3)
        L_0x0195:
            int r4 = r4 + 1
            goto L_0x0188
        L_0x0198:
            r32 = 0
            r33 = 0
        L_0x019c:
            java.util.List r3 = r0.A07
            X.0qQ.A07(r3)
            r3.size()
            r15.size()
            java.util.List r3 = r0.A07
            java.util.ArrayList r6 = X.DbV.A15(r3)
            java.util.Iterator r9 = r3.iterator()
        L_0x01b1:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L_0x01ce
            java.lang.Object r4 = r9.next()
            r3 = r4
            X.3su r3 = (X.C254703su) r3
            java.lang.String r3 = r3.A0f()
            boolean r3 = X.00k.A0u(r13, r3)
            r3 = r3 ^ 1
            if (r3 == 0) goto L_0x01b1
            r6.add(r4)
            goto L_0x01b1
        L_0x01ce:
            java.util.ArrayList r3 = X.00k.A0U(r6)
            java.util.Comparator r4 = X.AnonymousClass48U.A04
            java.util.List r28 = X.00k.A0g(r3, r4)
            java.util.List r29 = X.00k.A0g(r15, r4)
            boolean r30 = r0.CKJ()
            java.lang.Boolean r3 = r0.A03
            if (r3 != 0) goto L_0x029a
            r31 = 0
        L_0x01e6:
            r27 = r4
            X.59G r6 = X.C70002Nvg.A00(r27, r28, r29, r30, r31, r32, r33)
            java.lang.Object r4 = r6.A00
            java.util.List r4 = (java.util.List) r4
            int r10 = r4.size()
            r9 = 0
        L_0x01f5:
            if (r9 >= r10) goto L_0x02a0
            java.lang.Object r11 = r4.get(r9)
            X.3su r11 = (X.C254703su) r11
            java.lang.String r13 = r11.A1Y
            X.2FW r12 = r11.A10
            X.2FW r3 = X.2FW.A0n
            if (r12 != r3) goto L_0x023b
            if (r13 == 0) goto L_0x023b
            org.json.JSONObject r12 = new org.json.JSONObject
            r12.<init>(r13)
            java.lang.String r3 = "is_open_eb"
            boolean r3 = r12.getBoolean(r3)
            if (r3 == 0) goto L_0x023b
            X.P0W r3 = new X.P0W
            r3.<init>(r12)
            r17 = 1
            r12 = r2
            r13 = r3
            r14 = r36
            r15 = r25
            X.0eP r3 = A03(r12, r13, r14, r15, r17)
            java.lang.Object r13 = r3.A00
            X.3su r13 = (X.C254703su) r13
            if (r13 == 0) goto L_0x0240
            com.instagram.model.direct.DirectThreadKey r3 = r14.A00
            java.lang.String r3 = r3.A00
            if (r3 == 0) goto L_0x023e
            X.3t0 r12 = new X.3t0
            r12.<init>(r3)
        L_0x0236:
            r3 = r40
            r11.A10(r3, r13, r12)
        L_0x023b:
            int r9 = r9 + 1
            goto L_0x01f5
        L_0x023e:
            r12 = 0
            goto L_0x0236
        L_0x0240:
            java.lang.String r13 = "Failed to create from reverb top level payload: "
            java.lang.Object r3 = r3.A01
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            if (r3 == 0) goto L_0x024e
            java.lang.String r12 = r3.getLocalizedMessage()
            if (r12 != 0) goto L_0x0250
        L_0x024e:
            r12 = r20
        L_0x0250:
            r3 = 46
            java.lang.String r3 = X.002.A0S(r13, r12, r3)
            r11.A1F(r3)
            java.lang.String r14 = r11.A0f()
            if (r14 == 0) goto L_0x023b
            java.lang.String r13 = r11.A0k()
            if (r13 != 0) goto L_0x0267
            r13 = r20
        L_0x0267:
            r3 = 58
            java.lang.String r3 = X.002.A0T(r14, r13, r3)
            r7.add(r3)
            X.0wj r12 = X.0wj.A01
            java.lang.String r11 = "direct cql result failed to parse message for eb messages"
            r3 = 20123732(0x1331054, float:3.2888822E-38)
            X.0f9 r12 = r12.AEf(r11, r3)
            java.lang.Long r3 = r0.A00()
            long r15 = r3.longValue()
            java.lang.String r11 = java.lang.String.valueOf(r15)
            r3 = r21
            r12.ABQ(r3, r11)
            r3 = r22
            r12.ABQ(r3, r14)
            r3 = r23
            r12.ABQ(r3, r13)
            r12.report()
            goto L_0x023b
        L_0x029a:
            boolean r31 = r3.booleanValue()
            goto L_0x01e6
        L_0x02a0:
            boolean r3 = X.AnonymousClass7TE.A1b(r4)
            if (r3 == 0) goto L_0x02ce
            java.lang.Object r3 = X.00k.A0I(r4)
            java.lang.String r3 = X.C66580MXl.A0y(r3)
            java.lang.String r9 = "Required value was null."
            if (r3 == 0) goto L_0x039c
            r0.A06 = r3
            java.lang.Object r3 = X.00k.A0K(r4)
            java.lang.String r3 = X.C66580MXl.A0y(r3)
            if (r3 == 0) goto L_0x0397
            r0.A05 = r3
            java.lang.Object r3 = r6.A01
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            r0.A04 = r3
            java.lang.Object r3 = r6.A02
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            r0.A03 = r3
            r0.A07 = r4
        L_0x02ce:
            X.NHP r3 = r0.A02
            if (r3 == 0) goto L_0x0322
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            java.util.List r3 = r3.A04
            if (r3 == 0) goto L_0x0316
            java.util.Iterator r13 = r3.iterator()
        L_0x02de:
            boolean r3 = r13.hasNext()
            if (r3 == 0) goto L_0x0316
            java.lang.Object r12 = r13.next()
            X.3su r12 = (X.C254703su) r12
            java.util.Iterator r11 = r4.iterator()
        L_0x02ee:
            boolean r3 = r11.hasNext()
            if (r3 == 0) goto L_0x030f
            java.lang.Object r9 = r11.next()
            r3 = r9
            X.3su r3 = (X.C254703su) r3
            java.lang.String r6 = r3.A0f()
            java.lang.String r3 = r12.A0f()
            boolean r3 = X.0qQ.A0K(r6, r3)
            if (r3 == 0) goto L_0x02ee
            if (r9 == 0) goto L_0x030f
            r10.add(r9)
            goto L_0x02de
        L_0x030f:
            X.0qQ.A0A(r12)
            r10.add(r12)
            goto L_0x02de
        L_0x0316:
            boolean r3 = X.DbT.A1b(r10)
            if (r3 == 0) goto L_0x0322
            X.NHP r3 = r0.A02
            if (r3 == 0) goto L_0x0322
            r3.A04 = r10
        L_0x0322:
            r4.size()
            boolean r3 = X.DbT.A1b(r8)
            if (r3 == 0) goto L_0x0352
            X.43S r6 = r2.A06
            int r4 = r8.size()
            java.lang.String r3 = "size_of_missing_reverb_only_messages"
            r6.A08(r1, r3, r4)
            X.Pnp r3 = X.C74024Pnp.A00
            java.lang.String r10 = ", "
            java.lang.String r9 = ""
            java.lang.String r4 = X.00k.A0P(r10, r9, r9, r8, r3)
            java.lang.String r3 = "missing_reverb_only_messages_error_message"
            r6.A09(r1, r3, r4)
            X.8x3 r6 = r2.A01
            X.Pnq r3 = X.C74025Pnq.A00
            java.lang.String r4 = X.00k.A0P(r10, r9, r9, r8, r3)
            r3 = r24
            r6.A02(r4, r5, r3)
        L_0x0352:
            boolean r3 = X.DbT.A1b(r7)
            if (r3 == 0) goto L_0x0380
            X.43S r6 = r2.A06
            int r4 = r7.size()
            java.lang.String r3 = "size_of_missing_eb_only_messages"
            r6.A08(r1, r3, r4)
            X.Pnr r3 = X.C74026Pnr.A00
            java.lang.String r9 = ", "
            java.lang.String r5 = ""
            java.lang.String r4 = X.00k.A0P(r9, r5, r5, r7, r3)
            java.lang.String r3 = "missing_eb_only_messages_error_message"
            r6.A09(r1, r3, r4)
            X.8x3 r6 = r2.A01
            X.Pns r3 = X.C74027Pns.A00
            java.lang.String r5 = X.00k.A0P(r9, r5, r5, r7, r3)
            r4 = 1
            r3 = r24
            r6.A02(r5, r4, r3)
        L_0x0380:
            boolean r3 = X.DbT.A1b(r8)
            if (r3 != 0) goto L_0x038c
            boolean r3 = X.DbT.A1b(r7)
            if (r3 == 0) goto L_0x0420
        L_0x038c:
            X.43S r5 = r2.A06
            java.lang.String r4 = "build_message_from_direct_cql_result"
            java.lang.String r3 = "missing messages from building direct message from cql result"
            r5.A0A(r1, r4, r3)
            goto L_0x0420
        L_0x0397:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)
            throw r0
        L_0x039c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)
            throw r0
        L_0x03a1:
            java.lang.String r12 = java.lang.String.valueOf(r25)
            if (r45 == 0) goto L_0x0477
            long r3 = X.C2611348j.A01(r45)
            long r3 = X.AnonymousClass7TE.A0P(r3)
            java.lang.Long r11 = java.lang.Long.valueOf(r3)
        L_0x03b3:
            r13 = r46
            r17 = r50
            r9 = r2
            r10 = r1
            r14 = r7
            r15 = r8
            X.0eP r3 = A04(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r11 = r3.A00
            X.Mda r11 = (X.C66842Mda) r11
            java.lang.Object r3 = r3.A01
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            if (r3 == 0) goto L_0x03d1
            java.lang.String r7 = r3.getLocalizedMessage()
            if (r7 != 0) goto L_0x03d1
            java.lang.String r7 = "Unknown error"
        L_0x03d1:
            A08(r0, r7)
            if (r11 != 0) goto L_0x03da
            r1 = 1
            r0.A09 = r1
        L_0x03d9:
            return
        L_0x03da:
            java.util.List r10 = r11.A01
            r10.size()
            X.43S r9 = r2.A06
            int r8 = r10.size()
            java.lang.String r7 = "merge_local_and_server_messages_after_reverb_call_start"
            java.lang.String r6 = "mailbox_api_response_message_count"
            if (r43 == 0) goto L_0x03f7
            X.02m r5 = r9.A00
            int r4 = r1.A01
            int r3 = r1.A00
            r5.markerPoint(r4, r3, r7)
            r5.markerAnnotate(r4, r3, r6, r8)
        L_0x03f7:
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.collections.List<com.instagram.direct.msys.reverb.ReverbMessage>"
            X.0qQ.A0C(r10, r3)
            java.util.List r5 = r11.A00
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>"
            X.0qQ.A0C(r5, r3)
            java.util.Map r4 = r11.A02
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Int>"
            X.0qQ.A0C(r4, r3)
            r18 = r2
            r19 = r36
            r20 = r1
            r21 = r0
            r22 = r10
            r23 = r5
            r24 = r4
            A07(r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.String r3 = "merge_local_and_server_messages_after_reverb_call_end"
            r9.A07(r1, r3)
        L_0x0420:
            com.instagram.common.session.UserSession r4 = r2.A00
            X.0Tu r3 = X.0Tu.A05
            r1 = 2342161901213981354(0x208107d700501aaa, double:4.064646390470077E-152)
            boolean r1 = X.182.A06(r3, r4, r1)
            if (r1 != 0) goto L_0x046f
            java.util.List r1 = r0.A07
            if (r1 == 0) goto L_0x046f
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r4 = r1.iterator()
        L_0x043b:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x045a
            java.lang.Object r3 = r4.next()
            r1 = r3
            X.3su r1 = (X.C254703su) r1
            X.3tI r1 = r1.A0P()
            if (r1 == 0) goto L_0x0458
            X.2FW r2 = r1.A0F
        L_0x0450:
            X.2FW r1 = X.2FW.A1M
            if (r2 != r1) goto L_0x043b
            r5.add(r3)
            goto L_0x043b
        L_0x0458:
            r2 = 0
            goto L_0x0450
        L_0x045a:
            java.util.Iterator r3 = r5.iterator()
        L_0x045e:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x046f
            java.lang.Object r2 = r3.next()
            X.3su r2 = (X.C254703su) r2
            r1 = 0
            r2.A13(r1)
            goto L_0x045e
        L_0x046f:
            java.util.List r0 = r0.A07
            if (r0 == 0) goto L_0x03d9
            r0.size()
            return
        L_0x0477:
            r11 = 0
            goto L_0x03b3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66840MdY.A0B(X.7Qc, X.7BV, X.8wd, java.lang.String, java.lang.String, int, long, long, boolean):void");
    }

    public static final C254703su A01(C66840MdY mdY, C254703su r4, DirectThreadKey directThreadKey) {
        try {
            StringWriter A0v = JTO.A0v();
            17W A0A = AnonymousClass15o.A00.A0A(A0v);
            C293235kO.A00(A0A, r4);
            A0A.close();
            String obj = A0v.toString();
            0c5 r1 = 0c9.A04;
            UserSession userSession = mdY.A00;
            0qQ.A0A(obj);
            C254703su A002 = C254703su.A00(r1.A01(userSession, obj), directThreadKey, false);
            if (A002 != null) {
                return A002;
            }
            throw AnonymousClass7TE.A0y();
        } catch (IOException unused) {
            0KC.A0C("ArmadilloExpressEncryptedBackupReverbImpl", "cannot clone a direct message by serializing and deserializing to JSON");
            return r4;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (X.11Z.A07() != false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List A02(X.C66840MdY r4, java.lang.Long r5, int r6, long r7, boolean r9) {
        /*
            int r0 = com.facebook.msys.mci.Execution.getExecutionContext()
            boolean r0 = X.AnonymousClass7TF.A1P(r0)
            r1 = 0
            if (r0 != 0) goto L_0x0012
            boolean r0 = X.11Z.A07()
            r2 = 1
            if (r0 == 0) goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = "Synchronous call to load messages from Reverb must NOT be on Msys thread or UI thread."
            X.17k.A0J(r2, r0, r1)
            X.Mdg r1 = X.O4V.A00
            com.instagram.common.session.UserSession r0 = r4.A00
            X.PmO r2 = new X.PmO
            r3 = r5
            r4 = r6
            r5 = r7
            r7 = r9
            r2.<init>(r3, r4, r5, r7)
            com.google.common.util.concurrent.SettableFuture r3 = r1.A01(r0, r2)
            r1 = 10000(0x2710, double:4.9407E-320)
            java.lang.String r0 = "Synchronous data fetch of ReverbForThreadMessagesForReporting"
            X.0eP r0 = A06(r0, r3, r1)
            java.lang.Object r0 = r0.A00
            java.util.List r0 = (java.util.List) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66840MdY.A02(X.MdY, java.lang.Long, int, long, boolean):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (X.11Z.A07() != false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.0eP A04(X.C66840MdY r8, X.AnonymousClass7BV r9, java.lang.Long r10, java.lang.String r11, java.lang.String r12, java.util.List r13, java.util.List r14, int r15, long r16) {
        /*
            int r0 = com.facebook.msys.mci.Execution.getExecutionContext()
            boolean r0 = X.AnonymousClass7TF.A1P(r0)
            r1 = 0
            if (r0 != 0) goto L_0x0012
            boolean r0 = X.11Z.A07()
            r2 = 1
            if (r0 == 0) goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = "Synchronous call to load messages from Reverb must NOT be on Msys thread or UI thread."
            X.17k.A0J(r2, r0, r1)
            java.lang.String r6 = "SHH_"
            if (r13 == 0) goto L_0x006c
            r0 = r6
        L_0x001f:
            X.43S r5 = r8.A06
            java.lang.String r7 = "load_message_list_api_call"
            java.lang.String r1 = "_start"
            java.lang.String r1 = X.002.A0g(r0, r7, r1)
            r5.A07(r9, r1)
            java.lang.String r1 = "user_session_state"
            java.lang.String r3 = X.002.A0R(r0, r1)
            com.instagram.common.session.UserSession r2 = r8.A00
            java.lang.String r1 = r2.A06()
            r5.A09(r9, r3, r1)
            X.Mdg r1 = X.O4V.A00
            X.Mde r8 = new X.Mde
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            com.google.common.util.concurrent.SettableFuture r2 = r1.A01(r2, r8)
            java.lang.String r1 = "Synchronous data fetch of Reverb loadMessageList"
            r3 = r16
            X.0eP r2 = A06(r1, r2, r3)
            java.lang.String r1 = "_end"
            java.lang.String r1 = X.002.A0g(r0, r7, r1)
            r5.A07(r9, r1)
            java.lang.Object r1 = r2.A01
            if (r1 == 0) goto L_0x0068
            java.lang.Exception r1 = (java.lang.Exception) r1
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0069
            java.lang.String r0 = "shh_message_fetch_failed"
        L_0x0065:
            r5.A06(r9, r1, r0)
        L_0x0068:
            return r2
        L_0x0069:
            java.lang.String r0 = "message_fetch_failed"
            goto L_0x0065
        L_0x006c:
            java.lang.String r0 = ""
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66840MdY.A04(X.MdY, X.7BV, java.lang.Long, java.lang.String, java.lang.String, java.util.List, java.util.List, int, long):X.0eP");
    }

    public final void A0A(long j, long j2) {
        C73935PmF pmF = new C73935PmF(j, j2, DbV.A0s());
        UserSession userSession = this.A00;
        if (182.A06(0Tu.A05, userSession, 36325965806319003L)) {
            pmF.invoke(new MailboxFeature(C66845Mdd.A00.A00(userSession)));
        } else {
            C66847Mdg.A00(pmF, userSession);
        }
    }
}
