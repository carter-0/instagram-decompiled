package X;

import android.content.Context;
import android.content.Intent;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.ArrayList;
import java.util.Collections;

public final class OZC {
    public static final 0Pj A00;
    public static final OZC A01 = new Object();
    public static final ArrayList A02;
    public static final ArrayList A03;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.OZC] */
    static {
        ArrayList A1D = AnonymousClass7TE.A1D(AnonymousClass7TE.A1I(C60020ci.A1d));
        A03 = A1D;
        ArrayList A1D2 = AnonymousClass7TE.A1D(C66581MXm.A11("com.facebook.stella", "com.facebook.stella_debug"));
        A02 = A1D2;
        A00 = new 0Pj(0cQ.A03(Collections.unmodifiableSet(C66580MXl.A12(A1D)), Collections.unmodifiableSet(C66580MXl.A12(A1D2))));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01a2, code lost:
        if (r1.equals(r0) == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01a4, code lost:
        r1 = X.AnonymousClass05K.A0D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0089, code lost:
        if (r1.equals(r0) == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008b, code lost:
        r1 = X.AnonymousClass05K.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c0, code lost:
        if (r1.equals(r0) == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c2, code lost:
        r1 = X.AnonymousClass05K.A0K;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x014b, code lost:
        if (r1.equals(r0) == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x014d, code lost:
        r1 = X.AnonymousClass05K.A0j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0172, code lost:
        if (r1.equals(r0) == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0174, code lost:
        r1 = X.AnonymousClass05K.A0N;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x017e, code lost:
        if (r1.equals(r0) == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0180, code lost:
        r1 = X.AnonymousClass05K.A0O;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x018a, code lost:
        if (r1.equals(r0) == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x018c, code lost:
        r1 = X.AnonymousClass05K.A0u;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.content.Context r13, android.content.Intent r14, X.0wc r15) {
        /*
            java.lang.String r1 = r14.getAction()
            if (r1 == 0) goto L_0x000d
            int r0 = r1.hashCode()
            switch(r0) {
                case -2037861481: goto L_0x003b;
                case -1999701223: goto L_0x0046;
                case -1582098194: goto L_0x0051;
                case -1559967952: goto L_0x0055;
                case -1551326476: goto L_0x0058;
                case -1549350201: goto L_0x005c;
                case -1249772606: goto L_0x0067;
                case -1211783387: goto L_0x006a;
                case -1031987972: goto L_0x0075;
                case -888945261: goto L_0x0080;
                case -814812433: goto L_0x0083;
                case -747763178: goto L_0x008e;
                case -615377759: goto L_0x0092;
                case -515411495: goto L_0x009e;
                case -304269513: goto L_0x00aa;
                case -137035184: goto L_0x00b6;
                case -133906216: goto L_0x00ba;
                case -120878971: goto L_0x00c6;
                case -101944730: goto L_0x00d2;
                case 72487100: goto L_0x00d6;
                case 197090608: goto L_0x00e2;
                case 214200535: goto L_0x00ee;
                case 231616915: goto L_0x00fa;
                case 329451507: goto L_0x0106;
                case 365956412: goto L_0x0112;
                case 399258430: goto L_0x011e;
                case 760111539: goto L_0x012a;
                case 865465166: goto L_0x012d;
                case 942742582: goto L_0x0139;
                case 947358635: goto L_0x0145;
                case 1076397649: goto L_0x0151;
                case 1142886164: goto L_0x015d;
                case 1358643288: goto L_0x0160;
                case 1830059237: goto L_0x016c;
                case 1900621316: goto L_0x0178;
                case 1918101913: goto L_0x0184;
                case 1966489759: goto L_0x0190;
                case 1982916708: goto L_0x019c;
                case 2050355068: goto L_0x01a8;
                default: goto L_0x000d;
            }
        L_0x000d:
            java.lang.String r0 = "Unhandled action: "
            java.lang.String r1 = X.002.A0R(r0, r1)
            java.lang.String r0 = "IpcQplConsts"
            X.0KC.A0D(r0, r1)
            java.lang.Integer r1 = X.AnonymousClass05K.A0X
        L_0x001a:
            java.lang.String r0 = r14.getAction()
            boolean r5 = X.DbW.A1Y(r1)
            X.NEe r3 = X.C71034OZv.A02(r1, r0, r5)
            r3.A03()
            java.lang.String r6 = "com.facebook.stella"
            java.lang.String r0 = "com.facebook.stella.assistant.services.StellaInstagramIpcIntentService"
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r14)
            X.C66581MXm.A17(r2, r6, r0)
            r2.getAction()
            r4 = 0
            goto L_0x01b4
        L_0x003b:
            java.lang.String r0 = "FETCH_MESSAGE_IMAGE_ACTION"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.Integer r1 = X.AnonymousClass05K.A04
            goto L_0x001a
        L_0x0046:
            java.lang.String r0 = "FETCH_GROUPS"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.Integer r1 = X.AnonymousClass05K.A1I
            goto L_0x001a
        L_0x0051:
            java.lang.String r0 = "incoming_message"
            goto L_0x019e
        L_0x0055:
            java.lang.String r0 = "com.facebook.stella.ipc.instagram.ACTION_CALL_ENGINE_STATE"
            goto L_0x0085
        L_0x0058:
            java.lang.String r0 = "com.facebook.stella.ipc.messenger.ACTION_REVOKE_MESSAGE"
            goto L_0x017a
        L_0x005c:
            java.lang.String r0 = "com.facebook.stella.ipc.messenger.ACTION_GROUP_THREADS_CHANGE_EVENT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.Integer r1 = X.AnonymousClass05K.A09
            goto L_0x001a
        L_0x0067:
            java.lang.String r0 = "opt_out"
            goto L_0x00bc
        L_0x006a:
            java.lang.String r0 = "SEND_MESSAGE_ACTION"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.Integer r1 = X.AnonymousClass05K.A0P
            goto L_0x001a
        L_0x0075:
            java.lang.String r0 = "MARK_THREAD_READ_ACTION"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.Integer r1 = X.AnonymousClass05K.A0G
            goto L_0x001a
        L_0x0080:
            java.lang.String r0 = "OPT_OUT_ACTION"
            goto L_0x00bc
        L_0x0083:
            java.lang.String r0 = "com.facebook.stella.ipc.messenger.ACTION_CALL_ENGINE_STATE"
        L_0x0085:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            goto L_0x001a
        L_0x008e:
            java.lang.String r0 = "com.facebook.stella.ipc.messenger.ACTION_CALL_STATE"
            goto L_0x016e
        L_0x0092:
            java.lang.String r0 = "FETCH_LOGS_ACTION"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.Integer r1 = X.AnonymousClass05K.A02
            goto L_0x001a
        L_0x009e:
            java.lang.String r0 = "GET_CALL_HISTORY_ACTION"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.Integer r1 = X.AnonymousClass05K.A06
            goto L_0x001a
        L_0x00aa:
            java.lang.String r0 = "CALL_ACTION"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.Integer r1 = X.AnonymousClass05K.A0U
            goto L_0x001a
        L_0x00b6:
            java.lang.String r0 = "com.facebook.stella.ipc.messenger.ACTION_CONTACT_CHANGE_EVENT"
            goto L_0x0147
        L_0x00ba:
            java.lang.String r0 = "authorization_revoked"
        L_0x00bc:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.Integer r1 = X.AnonymousClass05K.A0K
            goto L_0x001a
        L_0x00c6:
            java.lang.String r0 = "LOAD_MESSAGES"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.Integer r1 = X.AnonymousClass05K.A0E
            goto L_0x001a
        L_0x00d2:
            java.lang.String r0 = "message_revoked"
            goto L_0x017a
        L_0x00d6:
            java.lang.String r0 = "FETCH_MESSAGE_AUDIO_ACTION"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.Integer r1 = X.AnonymousClass05K.A03
            goto L_0x001a
        L_0x00e2:
            java.lang.String r0 = "LOAD_THREADS"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.Integer r1 = X.AnonymousClass05K.A0F
            goto L_0x001a
        L_0x00ee:
            java.lang.String r0 = "CHECK_STATE_FOR_ENABLE_STELLA_ACTION"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.Integer r1 = X.AnonymousClass05K.A0Y
            goto L_0x001a
        L_0x00fa:
            java.lang.String r0 = "STELLA_OPT_IN_OUT_ACTION"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.Integer r1 = X.AnonymousClass05K.A0J
            goto L_0x001a
        L_0x0106:
            java.lang.String r0 = "share_stories"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.Integer r1 = X.AnonymousClass05K.A0Q
            goto L_0x001a
        L_0x0112:
            java.lang.String r0 = "GET_CALL_STATE_ACTION"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.Integer r1 = X.AnonymousClass05K.A07
            goto L_0x001a
        L_0x011e:
            java.lang.String r0 = "FETCH_UNREAD_MESSAGES_ACTION"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.Integer r1 = X.AnonymousClass05K.A05
            goto L_0x001a
        L_0x012a:
            java.lang.String r0 = "END_CALL_ACTION"
            goto L_0x0186
        L_0x012d:
            java.lang.String r0 = "DECLINE_CALL_ACTION"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.Integer r1 = X.AnonymousClass05K.A15
            goto L_0x001a
        L_0x0139:
            java.lang.String r0 = "ANSWER_CALL_ACTION"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            goto L_0x001a
        L_0x0145:
            java.lang.String r0 = "contact_updates"
        L_0x0147:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.Integer r1 = X.AnonymousClass05K.A0j
            goto L_0x001a
        L_0x0151:
            java.lang.String r0 = "com.facebook.stella.ipc.messenger.ACTION_INCOMING_CALL"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.Integer r1 = X.AnonymousClass05K.A0B
            goto L_0x001a
        L_0x015d:
            java.lang.String r0 = "com.facebook.stella.ipc.messenger.ACTION_INCOMING_MESSAGE"
            goto L_0x019e
        L_0x0160:
            java.lang.String r0 = "FETCH_CONTACTS"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.Integer r1 = X.AnonymousClass05K.A1F
            goto L_0x001a
        L_0x016c:
            java.lang.String r0 = "call_state_changed"
        L_0x016e:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            goto L_0x001a
        L_0x0178:
            java.lang.String r0 = "revoke_notification"
        L_0x017a:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.Integer r1 = X.AnonymousClass05K.A0O
            goto L_0x001a
        L_0x0184:
            java.lang.String r0 = "call_ended"
        L_0x0186:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.Integer r1 = X.AnonymousClass05K.A0u
            goto L_0x001a
        L_0x0190:
            java.lang.String r0 = "CALL_ENGINE_DISPATCH_ACTION"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            goto L_0x001a
        L_0x019c:
            java.lang.String r0 = "incoming_notification"
        L_0x019e:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.Integer r1 = X.AnonymousClass05K.A0D
            goto L_0x001a
        L_0x01a8:
            java.lang.String r0 = "com.facebook.stella.ipc.messenger.ACTION_MISSED_CALL"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.Integer r1 = X.AnonymousClass05K.A0I
            goto L_0x001a
        L_0x01b4:
            X.0b6 r1 = X.0b6.A00()     // Catch:{ IllegalStateException -> 0x0272, SecurityException -> 0x0283 }
            X.0Pj r0 = A00     // Catch:{ IllegalStateException -> 0x0272, SecurityException -> 0x0283 }
            X.0bs r1 = r1.A0B(r0)     // Catch:{ IllegalStateException -> 0x0272, SecurityException -> 0x0283 }
            java.lang.String r0 = "MANAGE_MESSAGING"
            X.0bs r0 = r1.A06(r0)     // Catch:{ IllegalStateException -> 0x0272, SecurityException -> 0x0283 }
            android.content.ComponentName r0 = r0.A05(r13, r2)     // Catch:{ IllegalStateException -> 0x0272, SecurityException -> 0x0283 }
            if (r0 != 0) goto L_0x01d7
            java.lang.String r0 = "Component name null for pkg: "
            java.lang.String r1 = X.002.A0R(r0, r6)     // Catch:{ IllegalStateException -> 0x0272, SecurityException -> 0x0283 }
            java.lang.String r0 = "app_not_installed"
            r3.A07(r0, r1, r5)     // Catch:{ IllegalStateException -> 0x0272, SecurityException -> 0x0283 }
            goto L_0x0293
        L_0x01d7:
            java.lang.String r2 = r14.getAction()     // Catch:{ IllegalStateException -> 0x0272, SecurityException -> 0x0283 }
            if (r2 == 0) goto L_0x026a
            int r1 = r2.hashCode()     // Catch:{ IllegalStateException -> 0x0272, SecurityException -> 0x0283 }
            r0 = 1900621316(0x71492e04, float:9.961939E29)
            if (r1 == r0) goto L_0x01f6
            r0 = 1982916708(0x7630e864, float:8.97029E32)
            if (r1 != r0) goto L_0x026a
            java.lang.String r0 = "incoming_notification"
            boolean r0 = r2.equals(r0)     // Catch:{ IllegalStateException -> 0x0272, SecurityException -> 0x0283 }
            if (r0 == 0) goto L_0x026a
            java.lang.String r11 = "foa_send_notif"
            goto L_0x0200
        L_0x01f6:
            java.lang.String r0 = "revoke_notification"
            boolean r0 = r2.equals(r0)     // Catch:{ IllegalStateException -> 0x0272, SecurityException -> 0x0283 }
            if (r0 == 0) goto L_0x026a
            java.lang.String r11 = "foa_revoke_notif"
        L_0x0200:
            java.lang.String r9 = "push_id"
            java.lang.String r8 = r14.getStringExtra(r9)     // Catch:{ IllegalStateException -> 0x0272, SecurityException -> 0x0283 }
            java.lang.String r2 = "message_id"
            java.lang.String r10 = r14.getStringExtra(r2)     // Catch:{ IllegalStateException -> 0x0272, SecurityException -> 0x0283 }
            r7 = 0
            X.OJL r1 = X.C70916ORl.A00     // Catch:{ IllegalStateException -> 0x0272, SecurityException -> 0x0283 }
            X.Omd r0 = X.C71542Omd.A00     // Catch:{ IllegalStateException -> 0x0272, SecurityException -> 0x0283 }
            r1.A00(r0)     // Catch:{ IllegalStateException -> 0x0272, SecurityException -> 0x0283 }
            long r13 = java.lang.System.currentTimeMillis()     // Catch:{ IllegalStateException -> 0x0272, SecurityException -> 0x0283 }
            java.util.LinkedHashMap r12 = X.AnonymousClass7TE.A1H()     // Catch:{ IllegalStateException -> 0x0272, SecurityException -> 0x0283 }
            java.lang.String r0 = "wearable_foa_notification_delivery"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r15, r0)     // Catch:{ IllegalStateException -> 0x0272, SecurityException -> 0x0283 }
            r0 = 414(0x19e, float:5.8E-43)
            X.1Ln r6 = new X.1Ln     // Catch:{ IllegalStateException -> 0x0272, SecurityException -> 0x0283 }
            r6.<init>(r1, r0)     // Catch:{ IllegalStateException -> 0x0272, SecurityException -> 0x0283 }
            boolean r0 = X.DbT.A1Y(r6)     // Catch:{ IllegalStateException -> 0x0272, SecurityException -> 0x0283 }
            if (r0 == 0) goto L_0x0293
            r6.A0k(r11)     // Catch:{ IllegalStateException -> 0x0272, SecurityException -> 0x0283 }
            java.lang.Long r1 = java.lang.Long.valueOf(r13)     // Catch:{ IllegalStateException -> 0x0272, SecurityException -> 0x0283 }
            java.lang.String r0 = "client_timestamp_ms"
            r6.A0Q(r0, r1)     // Catch:{ IllegalStateException -> 0x0272, SecurityException -> 0x0283 }
            r6.A0R(r9, r8)     // Catch:{ IllegalStateException -> 0x0272, SecurityException -> 0x0283 }
            r6.A0R(r2, r10)     // Catch:{ IllegalStateException -> 0x0272, SecurityException -> 0x0283 }
            java.lang.String r0 = "error"
            r6.A0R(r0, r7)     // Catch:{ IllegalStateException -> 0x0272, SecurityException -> 0x0283 }
            org.json.JSONObject r2 = X.DbS.A11()     // Catch:{ IllegalStateException -> 0x0272, SecurityException -> 0x0283 }
            java.util.Iterator r1 = X.AnonymousClass7TF.A0s(r12)     // Catch:{ IllegalStateException -> 0x0272, SecurityException -> 0x0283 }
        L_0x024e:
            boolean r0 = r1.hasNext()     // Catch:{ IllegalStateException -> 0x0272, SecurityException -> 0x0283 }
            if (r0 == 0) goto L_0x0258
            X.C66584MXp.A18(r1, r2)     // Catch:{ IllegalStateException -> 0x0272, SecurityException -> 0x0283 }
            goto L_0x024e
        L_0x0258:
            java.lang.String r1 = X.DbT.A10(r2)     // Catch:{ IllegalStateException -> 0x0272, SecurityException -> 0x0283 }
            java.lang.String r0 = "extras"
            r6.A0R(r0, r1)     // Catch:{ IllegalStateException -> 0x0272, SecurityException -> 0x0283 }
            java.lang.String r0 = "uuid"
            r6.A0R(r0, r7)     // Catch:{ IllegalStateException -> 0x0272, SecurityException -> 0x0283 }
            r6.Cgf()     // Catch:{ IllegalStateException -> 0x0272, SecurityException -> 0x0283 }
            goto L_0x0293
        L_0x026a:
            java.lang.String r1 = "WearableIGAnalyticsEventLogger"
            java.lang.String r0 = "intent is created without action"
            X.0KC.A0C(r1, r0)     // Catch:{ IllegalStateException -> 0x0272, SecurityException -> 0x0283 }
            goto L_0x0293
        L_0x0272:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Not foregrounded: "
            java.lang.String r1 = X.AnonymousClass7TG.A0m(r2, r0, r1)
            java.lang.String r0 = "process_not_foregrounded"
            r3.A07(r0, r1, r5)
            goto L_0x0293
        L_0x0283:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Failed starting service since the service is not exposed: "
            java.lang.String r1 = X.AnonymousClass7TG.A0m(r2, r0, r1)
            java.lang.String r0 = "not_allowed"
            r3.A07(r0, r1, r4)
        L_0x0293:
            short r0 = r3.A00
            r3.A06(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OZC.A00(android.content.Context, android.content.Intent, X.0wc):void");
    }

    public final void A01(Context context, 0wc r5, C254703su r6, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, ArrayList arrayList, ArrayList arrayList2, boolean z) {
        0qQ.A0B(context, 0);
        Intent intent = new Intent("incoming_notification");
        intent.putExtra(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str);
        intent.putExtra("sender_name", str2);
        intent.putExtra("message_text", str3);
        intent.putExtra("is_group_thread", z);
        if (!(str4 == null || str4.length() == 0)) {
            intent.putExtra("instagram_notification_message", str4);
        }
        if (str5 != null) {
            intent.putExtra(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str5);
        }
        if (str6 != null) {
            intent.putExtra("instagram_fb_thread_id", str6);
        }
        if (str8 != null) {
            intent.putExtra("message_id", str8);
        }
        if (str9 != null) {
            intent.putExtra("message_user_id", str9);
        }
        if (str7 != null) {
            intent.putExtra("thread_name", str7);
        }
        if (r6 != null) {
            intent.putExtra("message_type", O09.A00(r6));
            intent.putExtra("instagram_message_type", r6.A10.A00);
        }
        ArrayList arrayList3 = arrayList;
        if (arrayList != null) {
            intent.putStringArrayListExtra("message_participant_list", arrayList3);
        }
        String str13 = str10;
        if (str10 != null) {
            intent.putExtra("push_id", str13);
        }
        String str14 = str11;
        if (!(str11 == null || str14.length() == 0)) {
            intent.putExtra("thread_profile_pic_url", str14);
        }
        ArrayList arrayList4 = arrayList2;
        if (arrayList2 != null && !arrayList4.isEmpty()) {
            intent.putExtra("participant_profile_pic_urls", arrayList4);
        }
        if (!(str12 == null || str12.length() == 0)) {
            intent.putStringArrayListExtra("message_attachment_uris", C66581MXm.A0z(str12));
        }
        A00(context, intent, r5);
    }
}
