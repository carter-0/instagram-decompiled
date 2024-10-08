package com.instagram.direct.stella;

import X.09i;
import X.0KC;
import X.0lg;
import X.AnonymousClass0fD;
import X.C69370NkA;
import X.O05;
import X.O06;
import X.OUo;
import X.OZH;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.instagram.direct.stella.api.ISendDirectMessageCallback;
import com.instagram.direct.stella.api.IStellaDirectMessagingService;
import com.instagram.realtimeclient.RealtimeConstants;
import org.json.JSONObject;

public final class StellaDirectMessagingService$binder$1 extends Binder implements IStellaDirectMessagingService {
    public final /* synthetic */ StellaDirectMessagingService A00;

    public static String A00() {
        return new OZH(3, "payload is empty").A01();
    }

    public static void A01(Object obj, JSONObject jSONObject) {
        jSONObject.put(RealtimeConstants.SEND_SUCCESS, true);
        jSONObject.putOpt("result", obj);
    }

    public StellaDirectMessagingService$binder$1() {
        int A03 = AnonymousClass0fD.A03(-1284992723);
        attachInterface(this, "com.instagram.direct.stella.api.IStellaDirectMessagingService");
        AnonymousClass0fD.A0A(-718171360, A03);
    }

    public static boolean A02(0lg r0) {
        return O05.A00(r0).booleanValue();
    }

    public final void EBT(ISendDirectMessageCallback iSendDirectMessageCallback) {
        int i;
        int A03 = AnonymousClass0fD.A03(2003985676);
        OUo oUo = OUo.A00;
        StellaDirectMessagingService stellaDirectMessagingService = this.A00;
        if (oUo.A00(stellaDirectMessagingService, (Intent) null, stellaDirectMessagingService.A01) != C69370NkA.SUCCESS) {
            0KC.A0D("StellaDirectMessagingService", "Failed to register callback");
            i = -606075514;
        } else {
            stellaDirectMessagingService.A00 = iSendDirectMessageCallback;
            O06.A00(09i.A0A.A08(stellaDirectMessagingService)).A00(stellaDirectMessagingService.A00);
            i = -1350835582;
        }
        AnonymousClass0fD.A0A(i, A03);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Npg, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v1, types: [java.lang.Object, X.1K2] */
    /* JADX WARNING: type inference failed for: r3v17, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture, X.1K2] */
    /* JADX WARNING: type inference failed for: r0v37, types: [java.lang.Object, X.0bY] */
    /* JADX WARNING: type inference failed for: r30v2, types: [X.0r1, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r14v9, types: [java.lang.Object, X.1K2] */
    /* JADX WARNING: type inference failed for: r13v10, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:643|644) */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x02f9, code lost:
        if (r27 != null) goto L_0x02fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0370, code lost:
        if (X.00l.A0W(r6) != false) goto L_0x0372;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0474, code lost:
        if (X.00l.A0W(r7) != false) goto L_0x0476;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0482, code lost:
        if (r7 != null) goto L_0x0484;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0488, code lost:
        if (X.00l.A0W(r7) != false) goto L_0x048f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x048a, code lost:
        r7 = X.C66582MXn.A0b(r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x048f, code lost:
        r7 = X.2L2.A00(r0).B32(new com.instagram.model.direct.DirectShareTarget(new com.instagram.pendingmedia.model.recipients.PendingRecipient(com.instagram.pendingmedia.model.recipients.PendingRecipient.A0g, com.instagram.user.model.FollowStatus.A08, (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Long) null, r27, "", "", (java.lang.String) null, 0, 0, -1, false, false, false, true, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x04f1, code lost:
        if (r7 == null) goto L_0x04ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x04f7, code lost:
        if (r7.C6C() != null) goto L_0x0542;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x04fd, code lost:
        if (r7.C6k() != null) goto L_0x0542;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x04ff, code lost:
        if (r27 == null) goto L_0x052c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0505, code lost:
        if (X.00l.A0W(r27) != false) goto L_0x052c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0507, code lost:
        r7 = X.0sr.A1M(new java.lang.String[]{r27});
        r3 = new X.OCD(r1, r0);
        r2 = com.instagram.direct.request.DirectThreadApi.A0D(r0, X.DbV.A0s(), (java.lang.String) null, r7);
        X.NMH.A00(r2, r3, r0, 14);
        X.1ES.A05(r2, 315964894, 2, true, true);
        r1 = X.DbS.A11();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x052c, code lost:
        r1 = 3;
        r0 = "Can not create thread, the recipient id is empty";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0542, code lost:
        r3 = X.OYS.A00(r1, r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:?, code lost:
        r1.put(com.instagram.realtimeclient.RealtimeConstants.SEND_SUCCESS, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x054e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:?, code lost:
        X.C66583MXo.A1U(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x066d, code lost:
        if (X.00l.A0W(r7) != false) goto L_0x066f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0687, code lost:
        if (X.00l.A0W(r7) != false) goto L_0x0689;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x06a8, code lost:
        if (X.00l.A0W(r10) != false) goto L_0x06aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:644:?, code lost:
        r5.A07("not_supported", r8.A00, true);
        r3 = X.OZH.A00(X.C69370NkA.A0D);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:643:0x0d42 */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0225 A[SYNTHETIC, Splitter:B:108:0x0225] */
    /* JADX WARNING: Removed duplicated region for block: B:417:0x0945 A[Catch:{ IllegalArgumentException -> 0x0d42 }] */
    /* JADX WARNING: Removed duplicated region for block: B:663:0x0a4a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0175 A[Catch:{ JSONException -> 0x0d56, Exception -> 0x0d7e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String EHH(java.lang.String r70) {
        /*
            r69 = this;
            r0 = -171968889(0xfffffffff5bff687, float:-4.86684E32)
            int r16 = X.AnonymousClass0fD.A03(r0)
            java.lang.Integer r3 = X.AnonymousClass05K.A0X
            r19 = 0
            r2 = 0
            r6 = 2
            X.0qQ.A0B(r3, r6)
            X.Npg r1 = new X.Npg
            r1.<init>()
            r0 = r19
            r1.A03 = r0
            r1.A00 = r3
            r1.A01 = r2
            X.NEe r5 = new X.NEe
            r5.<init>(r1)
            r5.A03()
            X.OUo r3 = X.OUo.A00
            r0 = r69
            com.instagram.direct.stella.StellaDirectMessagingService r1 = r0.A00
            X.0cT r0 = r1.A01
            X.NkA r3 = r3.A00(r1, r2, r0)
            X.NkA r0 = X.C69370NkA.SUCCESS
            if (r3 == r0) goto L_0x012b
            java.lang.Integer r0 = r3.A01
            int r0 = r0.intValue()
            switch(r0) {
                case 1: goto L_0x0058;
                case 2: goto L_0x005b;
                case 3: goto L_0x005e;
                case 4: goto L_0x0061;
                case 5: goto L_0x0064;
                case 6: goto L_0x0067;
                case 7: goto L_0x006a;
                case 8: goto L_0x006d;
                case 9: goto L_0x0070;
                case 10: goto L_0x0073;
                case 11: goto L_0x0076;
                case 12: goto L_0x007d;
                case 13: goto L_0x0084;
                case 14: goto L_0x008b;
                case 15: goto L_0x008e;
                case 16: goto L_0x0091;
                case 17: goto L_0x0094;
                case 18: goto L_0x0097;
                case 19: goto L_0x009e;
                case 20: goto L_0x00a1;
                case 21: goto L_0x00a4;
                case 22: goto L_0x00a7;
                case 23: goto L_0x00aa;
                case 24: goto L_0x00ad;
                case 25: goto L_0x00b0;
                case 26: goto L_0x00b3;
                case 27: goto L_0x00b6;
                case 28: goto L_0x00b9;
                case 29: goto L_0x00bc;
                case 30: goto L_0x00bf;
                case 31: goto L_0x00c3;
                case 32: goto L_0x00c7;
                case 33: goto L_0x00cb;
                case 34: goto L_0x00cf;
                case 35: goto L_0x00d3;
                case 36: goto L_0x00d7;
                case 37: goto L_0x00db;
                case 38: goto L_0x00df;
                case 39: goto L_0x00e3;
                case 40: goto L_0x00e7;
                case 41: goto L_0x00eb;
                case 42: goto L_0x00ef;
                case 43: goto L_0x00f3;
                case 44: goto L_0x00f7;
                case 45: goto L_0x00fb;
                case 46: goto L_0x00ff;
                case 47: goto L_0x0103;
                case 48: goto L_0x0107;
                case 49: goto L_0x010b;
                case 50: goto L_0x010f;
                case 51: goto L_0x0113;
                case 52: goto L_0x0117;
                case 53: goto L_0x011b;
                case 54: goto L_0x011f;
                case 55: goto L_0x0123;
                case 56: goto L_0x0127;
                default: goto L_0x003e;
            }
        L_0x003e:
            java.lang.String r2 = "action_string"
        L_0x0040:
            java.lang.String r1 = r3.A02
            r0 = 1
            r5.A07(r2, r1, r0)
            r0 = 3376(0xd30, float:4.731E-42)
            r5.A06(r0)
            java.lang.String r3 = X.OZH.A00(r3)
        L_0x004f:
            r1 = 1034710693(0x3dac6ea5, float:0.08419541)
            r0 = r16
            X.AnonymousClass0fD.A0A(r1, r0)
            return r3
        L_0x0058:
            java.lang.String r2 = "destination_app"
            goto L_0x0040
        L_0x005b:
            java.lang.String r2 = "destination_app_version"
            goto L_0x0040
        L_0x005e:
            java.lang.String r2 = "device_type"
            goto L_0x0040
        L_0x0061:
            java.lang.String r2 = "host_app"
            goto L_0x0040
        L_0x0064:
            java.lang.String r2 = "intent_handled"
            goto L_0x0040
        L_0x0067:
            java.lang.String r2 = "is_outgoing"
            goto L_0x0040
        L_0x006a:
            java.lang.String r2 = "is_user_triggered"
            goto L_0x0040
        L_0x006d:
            java.lang.String r2 = "log_id"
            goto L_0x0040
        L_0x0070:
            java.lang.String r2 = "reconnect_state"
            goto L_0x0040
        L_0x0073:
            java.lang.String r2 = "request_type"
            goto L_0x0040
        L_0x0076:
            r0 = 271(0x10f, float:3.8E-43)
            java.lang.String r2 = X.Pxd.A00(r0)
            goto L_0x0040
        L_0x007d:
            r0 = 390(0x186, float:5.47E-43)
            java.lang.String r2 = X.C273654mx.A00(r0)
            goto L_0x0040
        L_0x0084:
            r0 = 5014(0x1396, float:7.026E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
            goto L_0x0040
        L_0x008b:
            java.lang.String r2 = "reconnect_not_attempted"
            goto L_0x0040
        L_0x008e:
            java.lang.String r2 = "reconnect_successful"
            goto L_0x0040
        L_0x0091:
            java.lang.String r2 = "reconnect_failed"
            goto L_0x0040
        L_0x0094:
            java.lang.String r2 = "error_log"
            goto L_0x0040
        L_0x0097:
            r0 = 84
            java.lang.String r2 = X.Pxd.A00(r0)
            goto L_0x0040
        L_0x009e:
            java.lang.String r2 = "account_mismatch"
            goto L_0x0040
        L_0x00a1:
            java.lang.String r2 = "account_not_connected"
            goto L_0x0040
        L_0x00a4:
            java.lang.String r2 = "account_not_logged_in"
            goto L_0x0040
        L_0x00a7:
            java.lang.String r2 = "app_not_installed"
            goto L_0x0040
        L_0x00aa:
            java.lang.String r2 = "exception_handling_intent"
            goto L_0x0040
        L_0x00ad:
            java.lang.String r2 = "failed_action"
            goto L_0x0040
        L_0x00b0:
            java.lang.String r2 = "feature_not_enabled"
            goto L_0x0040
        L_0x00b3:
            java.lang.String r2 = "ig_account_privacy_status_mismatch"
            goto L_0x0040
        L_0x00b6:
            java.lang.String r2 = "invalid_request"
            goto L_0x0040
        L_0x00b9:
            java.lang.String r2 = "invalid_request_json"
            goto L_0x0040
        L_0x00bc:
            java.lang.String r2 = "failed_ipc_request_processing"
            goto L_0x0040
        L_0x00bf:
            java.lang.String r2 = "failed_ipc_response"
            goto L_0x0040
        L_0x00c3:
            java.lang.String r2 = "ipc_service_not_bound"
            goto L_0x0040
        L_0x00c7:
            java.lang.String r2 = "failed_ipc_transport"
            goto L_0x0040
        L_0x00cb:
            java.lang.String r2 = "not_allowed"
            goto L_0x0040
        L_0x00cf:
            java.lang.String r2 = "process_not_foregrounded"
            goto L_0x0040
        L_0x00d3:
            java.lang.String r2 = "not_supported"
            goto L_0x0040
        L_0x00d7:
            java.lang.String r2 = "package_invalid"
            goto L_0x0040
        L_0x00db:
            java.lang.String r2 = "request_source_media_error"
            goto L_0x0040
        L_0x00df:
            java.lang.String r2 = "security_exception"
            goto L_0x0040
        L_0x00e3:
            java.lang.String r2 = "service_not_exposed"
            goto L_0x0040
        L_0x00e7:
            java.lang.String r2 = "timeout"
            goto L_0x0040
        L_0x00eb:
            java.lang.String r2 = "unknown_error"
            goto L_0x0040
        L_0x00ef:
            java.lang.String r2 = "unsupported_action"
            goto L_0x0040
        L_0x00f3:
            java.lang.String r2 = "user_opt_out"
            goto L_0x0040
        L_0x00f7:
            java.lang.String r2 = "protocol_version_high"
            goto L_0x0040
        L_0x00fb:
            java.lang.String r2 = "protocol_version_low"
            goto L_0x0040
        L_0x00ff:
            java.lang.String r2 = "instagram_direct_not_init"
            goto L_0x0040
        L_0x0103:
            java.lang.String r2 = ""
            goto L_0x0040
        L_0x0107:
            java.lang.String r2 = "User does not have close friends"
            goto L_0x0040
        L_0x010b:
            java.lang.String r2 = "Missing audio calling permission"
            goto L_0x0040
        L_0x010f:
            java.lang.String r2 = "feature_gk_off"
            goto L_0x0040
        L_0x0113:
            java.lang.String r2 = "execution_end"
            goto L_0x0040
        L_0x0117:
            java.lang.String r2 = "execution_start"
            goto L_0x0040
        L_0x011b:
            java.lang.String r2 = "intent_handle_end"
            goto L_0x0040
        L_0x011f:
            java.lang.String r2 = "intent_handle_start"
            goto L_0x0040
        L_0x0123:
            java.lang.String r2 = "reconnect_end"
            goto L_0x0040
        L_0x0127:
            java.lang.String r2 = "reconnect_start"
            goto L_0x0040
        L_0x012b:
            X.OYS r15 = X.OYS.A01
            X.08y r0 = X.09i.A0A
            com.instagram.common.session.UserSession r0 = r0.A08(r1)
            java.lang.String r18 = " for: "
            r4 = 1
            r17 = r70
            if (r70 != 0) goto L_0x013f
            java.lang.Integer r3 = X.AnonymousClass05K.A0L     // Catch:{ JSONException -> 0x0d56, Exception -> 0x0d7e }
            java.lang.String r8 = "request is empty"
            goto L_0x014f
        L_0x013f:
            org.json.JSONObject r7 = X.C66580MXl.A17(r17)     // Catch:{ JSONException -> 0x0d56, Exception -> 0x0d7e }
            java.lang.String r3 = "header"
            org.json.JSONObject r10 = r7.optJSONObject(r3)     // Catch:{ JSONException -> 0x0d56, Exception -> 0x0d7e }
            if (r10 != 0) goto L_0x017a
            java.lang.Integer r3 = X.AnonymousClass05K.A0K     // Catch:{ JSONException -> 0x0d56, Exception -> 0x0d7e }
            java.lang.String r8 = "header is empty"
        L_0x014f:
            int r3 = r3.intValue()     // Catch:{ JSONException -> 0x0d56, Exception -> 0x0d7e }
            int r3 = 27 - r3
            if (r3 == 0) goto L_0x0177
            java.lang.String r3 = "invalid_request_json"
        L_0x0159:
            r5.A07(r3, r8, r4)     // Catch:{ JSONException -> 0x0d56, Exception -> 0x0d7e }
            r7 = 3
            X.OZH r3 = new X.OZH     // Catch:{ JSONException -> 0x0d56, Exception -> 0x0d7e }
            r3.<init>(r7, r8)     // Catch:{ JSONException -> 0x0d56, Exception -> 0x0d7e }
        L_0x0162:
            java.lang.String r9 = r3.A01()     // Catch:{ JSONException -> 0x0d56, Exception -> 0x0d7e }
            org.json.JSONObject r7 = X.DbS.A11()     // Catch:{ JSONException -> 0x0d56, Exception -> 0x0d7e }
            java.lang.String r3 = ""
            X.N2i r8 = new X.N2i     // Catch:{ JSONException -> 0x0d56, Exception -> 0x0d7e }
            r8.<init>(r3, r9, r7, r2)     // Catch:{ JSONException -> 0x0d56, Exception -> 0x0d7e }
        L_0x0171:
            java.lang.String r3 = r8.A01     // Catch:{ JSONException -> 0x0d56, Exception -> 0x0d7e }
            if (r3 == 0) goto L_0x0225
            goto L_0x0221
        L_0x0177:
            java.lang.String r3 = "invalid_request"
            goto L_0x0159
        L_0x017a:
            java.lang.String r3 = "action"
            java.lang.String r9 = r7.getString(r3)     // Catch:{ JSONException -> 0x0d56, Exception -> 0x0d7e }
            X.0qQ.A0A(r9)     // Catch:{ JSONException -> 0x0d56, Exception -> 0x0d7e }
            com.instagram.direct.stella.api.IpcConstants$RequestAction r8 = com.instagram.direct.stella.api.IpcConstants$RequestAction.valueOf(r9)     // Catch:{ JSONException -> 0x0d56, Exception -> 0x0d7e }
            int r3 = r9.length()     // Catch:{ JSONException -> 0x0d56, Exception -> 0x0d7e }
            if (r3 != 0) goto L_0x0192
            java.lang.Integer r3 = X.AnonymousClass05K.A0K     // Catch:{ JSONException -> 0x0d56, Exception -> 0x0d7e }
            java.lang.String r8 = "action is empty"
            goto L_0x014f
        L_0x0192:
            java.lang.String r3 = "action_string"
            r5.A05(r3, r9)     // Catch:{ JSONException -> 0x0d56, Exception -> 0x0d7e }
            java.lang.String r3 = "payload"
            org.json.JSONObject r7 = r7.optJSONObject(r3)     // Catch:{ JSONException -> 0x0d56, Exception -> 0x0d7e }
            com.instagram.direct.stella.api.IpcConstants$RequestAction r3 = com.instagram.direct.stella.api.IpcConstants$RequestAction.OPT_OUT_INSTAGRAM     // Catch:{ JSONException -> 0x0d56, Exception -> 0x0d7e }
            if (r8 == r3) goto L_0x0208
            com.instagram.direct.stella.api.IpcConstants$RequestAction r3 = com.instagram.direct.stella.api.IpcConstants$RequestAction.CONNECTED_USER_ACTIVE     // Catch:{ JSONException -> 0x0d56, Exception -> 0x0d7e }
            if (r8 == r3) goto L_0x0208
            com.instagram.direct.stella.api.IpcConstants$RequestAction r3 = com.instagram.direct.stella.api.IpcConstants$RequestAction.FETCH_LOGS_ACTION     // Catch:{ JSONException -> 0x0d56, Exception -> 0x0d7e }
            if (r8 == r3) goto L_0x0208
            boolean r3 = A02(r0)     // Catch:{ JSONException -> 0x0d56, Exception -> 0x0d7e }
            if (r3 != 0) goto L_0x0208
            r3 = 91
            java.lang.String r3 = X.AnonymousClass000.A00(r3)     // Catch:{ JSONException -> 0x0d56, Exception -> 0x0d7e }
            X.0tX r11 = X.0xn.A01(r3)     // Catch:{ JSONException -> 0x0d56, Exception -> 0x0d7e }
            java.lang.String r8 = "pairedIgUserId"
            java.lang.String r11 = r11.getString(r8, r2)     // Catch:{ JSONException -> 0x0d56, Exception -> 0x0d7e }
            if (r11 == 0) goto L_0x01fe
            int r8 = r11.length()     // Catch:{ JSONException -> 0x0d56, Exception -> 0x0d7e }
            if (r8 == 0) goto L_0x01fe
            boolean r8 = X.C66580MXl.A1X(r0, r11)     // Catch:{ JSONException -> 0x0d56, Exception -> 0x0d7e }
            if (r8 != 0) goto L_0x01dc
            java.lang.String r7 = "account does not match"
            java.lang.String r3 = "account_mismatch"
            r5.A07(r3, r7, r4)     // Catch:{ JSONException -> 0x0d56, Exception -> 0x0d7e }
            X.NkA r8 = X.C69370NkA.ACCOUNT_NOT_MATCH     // Catch:{ JSONException -> 0x0d56, Exception -> 0x0d7e }
        L_0x01d6:
            X.OZH r3 = new X.OZH     // Catch:{ JSONException -> 0x0d56, Exception -> 0x0d7e }
            r3.<init>(r8)     // Catch:{ JSONException -> 0x0d56, Exception -> 0x0d7e }
            goto L_0x0162
        L_0x01dc:
            java.lang.Integer r8 = X.JTS.A0e(r0)     // Catch:{ JSONException -> 0x0d56, Exception -> 0x0d7e }
            java.lang.String r8 = X.17d.A00(r8)     // Catch:{ JSONException -> 0x0d56, Exception -> 0x0d7e }
            X.0tX r11 = X.0xn.A01(r3)     // Catch:{ JSONException -> 0x0d56, Exception -> 0x0d7e }
            java.lang.String r3 = "pairedIgUserPrivacyStatus"
            java.lang.String r3 = r11.getString(r3, r2)     // Catch:{ JSONException -> 0x0d56, Exception -> 0x0d7e }
            boolean r3 = X.0qQ.A0K(r8, r3)     // Catch:{ JSONException -> 0x0d56, Exception -> 0x0d7e }
            if (r3 != 0) goto L_0x0208
            X.NkA r8 = X.C69370NkA.IG_ACCOUNT_PRIVACY_STATUS_MISMATCH     // Catch:{ JSONException -> 0x0d56, Exception -> 0x0d7e }
            java.lang.String r7 = "IG account privacy status changed"
            java.lang.String r3 = "IG_ACCOUNT_PRIVACY_STATUS_MISMATCH"
            r5.A07(r3, r7, r4)     // Catch:{ JSONException -> 0x0d56, Exception -> 0x0d7e }
            goto L_0x01d6
        L_0x01fe:
            java.lang.String r7 = "account not linked"
            java.lang.String r3 = "account_not_connected"
            r5.A07(r3, r7, r4)     // Catch:{ JSONException -> 0x0d56, Exception -> 0x0d7e }
            X.NkA r8 = X.C69370NkA.ACCOUNT_NOT_LINKED     // Catch:{ JSONException -> 0x0d56, Exception -> 0x0d7e }
            goto L_0x01d6
        L_0x0208:
            java.lang.String r3 = "protocol_version"
            int r3 = r10.getInt(r3)     // Catch:{ JSONException -> 0x0d56, Exception -> 0x0d7e }
            if (r3 >= r4) goto L_0x021a
            X.NkA r8 = X.C69370NkA.UNSUPPORTED_PROTOCOL_VERSION     // Catch:{ JSONException -> 0x0d56, Exception -> 0x0d7e }
            java.lang.String r7 = "This protocol version is no longer supported"
            java.lang.String r3 = "protocol_version_low"
            r5.A07(r3, r7, r4)     // Catch:{ JSONException -> 0x0d56, Exception -> 0x0d7e }
            goto L_0x01d6
        L_0x021a:
            X.N2i r8 = new X.N2i     // Catch:{ JSONException -> 0x0d56, Exception -> 0x0d7e }
            r8.<init>(r9, r2, r10, r7)     // Catch:{ JSONException -> 0x0d56, Exception -> 0x0d7e }
            goto L_0x0171
        L_0x0221:
            r0 = 3376(0xd30, float:4.731E-42)
            goto L_0x0d51
        L_0x0225:
            java.lang.String r9 = X.C51972G9s.A0n()     // Catch:{ IllegalArgumentException -> 0x0d42 }
            java.lang.String r10 = r8.A00     // Catch:{ IllegalArgumentException -> 0x0d42 }
            com.instagram.direct.stella.api.IpcConstants$RequestAction r11 = com.instagram.direct.stella.api.IpcConstants$RequestAction.valueOf(r10)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            java.lang.Integer r7 = r11.A00     // Catch:{ IllegalArgumentException -> 0x0d42 }
            r3 = r19
            X.0qQ.A0B(r7, r3)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            X.Npg r3 = r5.A00     // Catch:{ IllegalArgumentException -> 0x0d42 }
            r3.A00 = r7     // Catch:{ IllegalArgumentException -> 0x0d42 }
            X.C68378NEe.A00(r5, r7)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            int r3 = r11.ordinal()     // Catch:{ IllegalArgumentException -> 0x0d42 }
            switch(r3) {
                case 0: goto L_0x0249;
                case 1: goto L_0x0a5c;
                case 2: goto L_0x0ca7;
                case 3: goto L_0x08ac;
                case 4: goto L_0x0c89;
                case 5: goto L_0x0587;
                case 6: goto L_0x0587;
                case 7: goto L_0x0558;
                case 8: goto L_0x0244;
                case 9: goto L_0x0244;
                case 10: goto L_0x03fe;
                case 11: goto L_0x0bba;
                case 12: goto L_0x03cb;
                case 13: goto L_0x0244;
                case 14: goto L_0x0244;
                case 15: goto L_0x0b07;
                case 16: goto L_0x0b8f;
                case 17: goto L_0x0adc;
                default: goto L_0x0244;
            }     // Catch:{ IllegalArgumentException -> 0x0d42 }
        L_0x0244:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r10)     // Catch:{ IllegalArgumentException -> 0x0d42 }
        L_0x0248:
            throw r0     // Catch:{ IllegalArgumentException -> 0x0d42 }
        L_0x0249:
            org.json.JSONObject r7 = r8.A02     // Catch:{ IllegalArgumentException -> 0x0d42 }
            monitor-enter(r15)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            boolean r1 = A02(r0)     // Catch:{ all -> 0x03c7 }
            if (r1 != 0) goto L_0x025a
            X.NkA r0 = X.C69370NkA.A0D     // Catch:{ all -> 0x03c7 }
            java.lang.String r3 = X.OZH.A00(r0)     // Catch:{ all -> 0x03c7 }
            goto L_0x0d40
        L_0x025a:
            if (r7 != 0) goto L_0x0262
            java.lang.String r3 = A00()     // Catch:{ all -> 0x03c7 }
            goto L_0x0d40
        L_0x0262:
            java.lang.String r3 = "thread_id"
            boolean r1 = r7.has(r3)     // Catch:{ all -> 0x03c7 }
            r65 = 0
            if (r1 == 0) goto L_0x02a8
            java.lang.String r6 = r7.getString(r3)     // Catch:{ all -> 0x03c7 }
        L_0x0270:
            java.lang.String r3 = "recipient_id"
            boolean r1 = r7.has(r3)     // Catch:{ all -> 0x03c7 }
            if (r1 == 0) goto L_0x02a5
            java.lang.String r27 = r7.getString(r3)     // Catch:{ all -> 0x03c7 }
        L_0x027c:
            java.lang.String r3 = "message_text"
            boolean r1 = r7.has(r3)     // Catch:{ all -> 0x03c7 }
            if (r1 == 0) goto L_0x0288
            java.lang.String r65 = r7.getString(r3)     // Catch:{ all -> 0x03c7 }
        L_0x0288:
            java.lang.String r3 = "compound_contact_id"
            boolean r1 = r7.has(r3)     // Catch:{ all -> 0x03c7 }
            if (r1 == 0) goto L_0x02b1
            java.lang.String r3 = r7.getString(r3)     // Catch:{ all -> 0x03c7 }
            if (r3 == 0) goto L_0x02b1
            boolean r1 = X.00l.A0W(r3)     // Catch:{ all -> 0x03c7 }
            if (r1 != 0) goto L_0x02b1
            X.N49 r3 = X.O0A.A00(r3)     // Catch:{ all -> 0x03c7 }
            java.lang.String r1 = r3.A01     // Catch:{ all -> 0x03c7 }
            if (r1 == 0) goto L_0x02ac
            goto L_0x02aa
        L_0x02a5:
            r27 = r2
            goto L_0x027c
        L_0x02a8:
            r6 = r2
            goto L_0x0270
        L_0x02aa:
            r27 = r1
        L_0x02ac:
            java.lang.String r1 = r3.A00     // Catch:{ all -> 0x03c7 }
            if (r1 == 0) goto L_0x02b1
            r6 = r1
        L_0x02b1:
            if (r6 != 0) goto L_0x02b5
            if (r27 == 0) goto L_0x03bf
        L_0x02b5:
            if (r65 == 0) goto L_0x03bf
            X.Oy8 r3 = X.O06.A00(r0)     // Catch:{ all -> 0x03c7 }
            r7 = 22
            X.BBV r1 = new X.BBV     // Catch:{ all -> 0x03c7 }
            r1.<init>(r2, r7)     // Catch:{ all -> 0x03c7 }
            com.google.common.util.concurrent.SettableFuture r14 = new com.google.common.util.concurrent.SettableFuture     // Catch:{ all -> 0x03c7 }
            r14.<init>()     // Catch:{ all -> 0x03c7 }
            com.google.common.util.concurrent.SettableFuture r13 = new com.google.common.util.concurrent.SettableFuture     // Catch:{ all -> 0x03c7 }
            r13.<init>()     // Catch:{ all -> 0x03c7 }
            X.5Cn r10 = X.C282285Cm.A00(r0)     // Catch:{ all -> 0x03c7 }
            X.PEt r7 = new X.PEt     // Catch:{ all -> 0x03c7 }
            r7.<init>(r1, r13)     // Catch:{ all -> 0x03c7 }
            monitor-enter(r10)     // Catch:{ all -> 0x03c7 }
            r10.A00 = r7     // Catch:{ all -> 0x03bc }
            monitor-exit(r10)     // Catch:{ all -> 0x03c7 }
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x03c7 }
            X.0nl r7 = X.C61560nl.A00()     // Catch:{ all -> 0x03c7 }
            java.util.concurrent.ScheduledThreadPoolExecutor r7 = r7.A00     // Catch:{ all -> 0x03c7 }
            r10 = 10
            com.google.common.util.concurrent.ListenableFuture r11 = X.C255183ti.A02(r13, r7, r12, r10)     // Catch:{ all -> 0x03c7 }
            r7 = 4
            X.OrO r10 = new X.OrO     // Catch:{ all -> 0x03c7 }
            r10.<init>(r7, r1, r14, r0)     // Catch:{ all -> 0x03c7 }
            X.0nl r7 = X.C61560nl.A00()     // Catch:{ all -> 0x03c7 }
            java.util.concurrent.ScheduledThreadPoolExecutor r7 = r7.A00     // Catch:{ all -> 0x03c7 }
            X.C255183ti.A04(r10, r11, r7)     // Catch:{ all -> 0x03c7 }
            if (r6 != 0) goto L_0x02fb
            r7 = 0
            if (r27 == 0) goto L_0x02fc
        L_0x02fb:
            r7 = 1
        L_0x02fc:
            X.17k.A0E(r7)     // Catch:{ all -> 0x03c7 }
            com.instagram.common.session.UserSession r7 = r3.A00     // Catch:{ all -> 0x03c7 }
            X.7Zi r62 = X.C333527Zh.A00(r7)     // Catch:{ all -> 0x03c7 }
            X.2Dm r10 = X.2L2.A00(r7)     // Catch:{ all -> 0x03c7 }
            java.lang.String r28 = ""
            com.instagram.common.typedurl.ImageUrl r21 = com.instagram.pendingmedia.model.recipients.PendingRecipient.A0g     // Catch:{ all -> 0x03c7 }
            com.instagram.user.model.FollowStatus r22 = com.instagram.user.model.FollowStatus.A08     // Catch:{ all -> 0x03c7 }
            r33 = -1
            com.instagram.pendingmedia.model.recipients.PendingRecipient r7 = new com.instagram.pendingmedia.model.recipients.PendingRecipient     // Catch:{ all -> 0x03c7 }
            r20 = r7
            r23 = r2
            r24 = r2
            r25 = r2
            r26 = r2
            r29 = r28
            r30 = r2
            r31 = r19
            r32 = r19
            r34 = r19
            r35 = r19
            r36 = r19
            r37 = r4
            r38 = r19
            r39 = r19
            r40 = r19
            r41 = r19
            r42 = r19
            r43 = r19
            r44 = r4
            r45 = r19
            r46 = r19
            r47 = r19
            r48 = r19
            r49 = r19
            r50 = r19
            r51 = r19
            r52 = r19
            r53 = r19
            r54 = r19
            r55 = r19
            r56 = r19
            r57 = r19
            r58 = r19
            r59 = r19
            r60 = r19
            r61 = r19
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61)     // Catch:{ all -> 0x03c7 }
            com.instagram.model.direct.DirectShareTarget r11 = new com.instagram.model.direct.DirectShareTarget     // Catch:{ all -> 0x03c7 }
            r11.<init>((com.instagram.pendingmedia.model.recipients.PendingRecipient) r7)     // Catch:{ all -> 0x03c7 }
            X.3U9 r11 = r10.B32(r11)     // Catch:{ all -> 0x03c7 }
            if (r6 == 0) goto L_0x0372
            boolean r10 = X.00l.A0W(r6)     // Catch:{ all -> 0x03c7 }
            r7 = 0
            if (r10 == 0) goto L_0x0373
        L_0x0372:
            r7 = 1
        L_0x0373:
            if (r7 == 0) goto L_0x037e
            if (r11 == 0) goto L_0x0378
            goto L_0x037a
        L_0x0378:
            r6 = 0
            goto L_0x037e
        L_0x037a:
            java.lang.String r6 = r11.C6C()     // Catch:{ all -> 0x03c7 }
        L_0x037e:
            java.lang.String[] r7 = new java.lang.String[]{r27}     // Catch:{ all -> 0x03c7 }
            java.util.ArrayList r10 = X.0sr.A1M(r7)     // Catch:{ all -> 0x03c7 }
            com.instagram.model.direct.DirectThreadKey r7 = new com.instagram.model.direct.DirectThreadKey     // Catch:{ all -> 0x03c7 }
            r7.<init>(r6, r10)     // Catch:{ all -> 0x03c7 }
            java.lang.String r66 = "none"
            r63 = r2
            r64 = r7
            r67 = r2
            r68 = r19
            java.lang.String r7 = r62.EMr(r63, r64, r65, r66, r67, r68)     // Catch:{ all -> 0x03c7 }
            if (r7 == 0) goto L_0x03a8
            java.lang.Object r6 = r3.A01     // Catch:{ all -> 0x03c7 }
            monitor-enter(r6)     // Catch:{ all -> 0x03c7 }
            java.util.Set r3 = r3.A02     // Catch:{ all -> 0x03a4 }
            r3.add(r7)     // Catch:{ all -> 0x03a4 }
            goto L_0x03a7
        L_0x03a4:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x03c7 }
            goto L_0x03be
        L_0x03a7:
            monitor-exit(r6)     // Catch:{ all -> 0x03c7 }
        L_0x03a8:
            r1.A00 = r7     // Catch:{ all -> 0x03c7 }
            X.Orv r3 = X.OYS.A00     // Catch:{ all -> 0x03c7 }
            java.lang.String r1 = "OTHERS"
            X.C70883OQa.A00(r2, r3, r0, r9, r1)     // Catch:{ all -> 0x03c7 }
            java.lang.Object r3 = r14.get()     // Catch:{ all -> 0x03c7 }
            X.0qQ.A07(r3)     // Catch:{ all -> 0x03c7 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x03c7 }
            goto L_0x0d40
        L_0x03bc:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x03c7 }
        L_0x03be:
            throw r0     // Catch:{ all -> 0x03c7 }
        L_0x03bf:
            X.NkA r0 = X.C69370NkA.INVALID_REQUEST     // Catch:{ all -> 0x03c7 }
            java.lang.String r3 = X.OZH.A00(r0)     // Catch:{ all -> 0x03c7 }
            goto L_0x0d40
        L_0x03c7:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            goto L_0x0248
        L_0x03cb:
            r1 = 91
            java.lang.String r1 = X.AnonymousClass000.A00(r1)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            X.0tX r3 = X.0xn.A01(r1)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            java.lang.String r1 = "pairedIgUserId"
            java.lang.String r1 = r3.getString(r1, r2)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            boolean r0 = X.C51966G9m.A1W(r0, r1)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            org.json.JSONObject r1 = X.DbS.A11()     // Catch:{ IllegalArgumentException -> 0x0d42 }
            java.lang.String r0 = "success"
            r1.put(r0, r4)     // Catch:{ JSONException -> 0x03f4 }
            if (r2 == 0) goto L_0x03f8
            java.lang.String r0 = "result"
            r1.putOpt(r0, r2)     // Catch:{ JSONException -> 0x03f4 }
            goto L_0x03f8
        L_0x03f4:
            r0 = move-exception
            X.C66583MXo.A1U(r0)     // Catch:{ IllegalArgumentException -> 0x0d42 }
        L_0x03f8:
            java.lang.String r3 = X.DbT.A10(r1)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            goto L_0x0d4f
        L_0x03fe:
            org.json.JSONObject r9 = r8.A02     // Catch:{ IllegalArgumentException -> 0x0d42 }
            boolean r3 = A02(r0)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            if (r3 != 0) goto L_0x0413
            X.NkA r0 = X.C69370NkA.A0D     // Catch:{ IllegalArgumentException -> 0x0d42 }
            X.OZH r2 = new X.OZH     // Catch:{ IllegalArgumentException -> 0x0d42 }
            r2.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x0d42 }
        L_0x040d:
            java.lang.String r3 = r2.A01()     // Catch:{ IllegalArgumentException -> 0x0d42 }
            goto L_0x0d4f
        L_0x0413:
            if (r9 == 0) goto L_0x0534
            r11 = 0
            java.lang.String r28 = ""
            r7 = r28
            r27 = r7
            java.lang.String r3 = "thread_id"
            boolean r10 = r9.has(r3)     // Catch:{ JSONException -> 0x046e }
            if (r10 == 0) goto L_0x0428
            java.lang.String r7 = r9.getString(r3)     // Catch:{ JSONException -> 0x046e }
        L_0x0428:
            java.lang.String r3 = "recipient_id"
            boolean r10 = r9.has(r3)     // Catch:{ JSONException -> 0x046e }
            if (r10 == 0) goto L_0x0434
            java.lang.String r27 = r9.getString(r3)     // Catch:{ JSONException -> 0x046e }
        L_0x0434:
            java.lang.String r3 = "is_e2ee_thread"
            boolean r10 = r9.has(r3)     // Catch:{ JSONException -> 0x046e }
            if (r10 == 0) goto L_0x043f
            r9.getBoolean(r3)     // Catch:{ JSONException -> 0x046e }
        L_0x043f:
            java.lang.String r3 = "is_group_thread"
            boolean r10 = r9.has(r3)     // Catch:{ JSONException -> 0x046e }
            if (r10 == 0) goto L_0x044b
            boolean r11 = r9.getBoolean(r3)     // Catch:{ JSONException -> 0x046e }
        L_0x044b:
            java.lang.String r3 = "compound_contact_id"
            boolean r10 = r9.has(r3)     // Catch:{ JSONException -> 0x046e }
            if (r10 == 0) goto L_0x046e
            java.lang.String r9 = r9.getString(r3)     // Catch:{ JSONException -> 0x046e }
            if (r9 == 0) goto L_0x046e
            boolean r3 = X.00l.A0W(r9)     // Catch:{ JSONException -> 0x046e }
            if (r3 != 0) goto L_0x046e
            X.N49 r9 = X.O0A.A00(r9)     // Catch:{ JSONException -> 0x046e }
            java.lang.String r3 = r9.A01     // Catch:{ JSONException -> 0x046e }
            if (r3 == 0) goto L_0x0469
            r27 = r3
        L_0x0469:
            java.lang.String r3 = r9.A00     // Catch:{ JSONException -> 0x046e }
            if (r3 == 0) goto L_0x046e
            r7 = r3
        L_0x046e:
            if (r7 == 0) goto L_0x0476
            boolean r3 = X.00l.A0W(r7)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            if (r3 == 0) goto L_0x0484
        L_0x0476:
            if (r27 == 0) goto L_0x0530
            boolean r3 = X.00l.A0W(r27)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            if (r3 != 0) goto L_0x0530
            if (r11 == 0) goto L_0x0482
            goto L_0x0538
        L_0x0482:
            if (r7 == 0) goto L_0x048f
        L_0x0484:
            boolean r3 = X.00l.A0W(r7)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            if (r3 != 0) goto L_0x048f
            X.3U9 r7 = X.C66582MXn.A0b(r0, r7)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            goto L_0x04f1
        L_0x048f:
            X.2Dm r7 = X.2L2.A00(r0)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            com.instagram.common.typedurl.ImageUrl r21 = com.instagram.pendingmedia.model.recipients.PendingRecipient.A0g     // Catch:{ IllegalArgumentException -> 0x0d42 }
            com.instagram.user.model.FollowStatus r22 = com.instagram.user.model.FollowStatus.A08     // Catch:{ IllegalArgumentException -> 0x0d42 }
            r33 = -1
            com.instagram.pendingmedia.model.recipients.PendingRecipient r3 = new com.instagram.pendingmedia.model.recipients.PendingRecipient     // Catch:{ IllegalArgumentException -> 0x0d42 }
            r20 = r3
            r23 = r2
            r24 = r2
            r25 = r2
            r26 = r2
            r29 = r28
            r30 = r2
            r31 = r19
            r32 = r19
            r34 = r19
            r35 = r19
            r36 = r19
            r37 = r4
            r38 = r19
            r39 = r19
            r40 = r19
            r41 = r19
            r42 = r19
            r43 = r19
            r44 = r4
            r45 = r19
            r46 = r19
            r47 = r19
            r48 = r19
            r49 = r19
            r50 = r19
            r51 = r19
            r52 = r19
            r53 = r19
            r54 = r19
            r55 = r19
            r56 = r19
            r57 = r19
            r58 = r19
            r59 = r19
            r60 = r19
            r61 = r19
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            com.instagram.model.direct.DirectShareTarget r9 = new com.instagram.model.direct.DirectShareTarget     // Catch:{ IllegalArgumentException -> 0x0d42 }
            r9.<init>((com.instagram.pendingmedia.model.recipients.PendingRecipient) r3)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            X.3U9 r7 = r7.B32(r9)     // Catch:{ IllegalArgumentException -> 0x0d42 }
        L_0x04f1:
            if (r7 == 0) goto L_0x04ff
            java.lang.String r3 = r7.C6C()     // Catch:{ IllegalArgumentException -> 0x0d42 }
            if (r3 != 0) goto L_0x0542
            java.lang.String r3 = r7.C6k()     // Catch:{ IllegalArgumentException -> 0x0d42 }
            if (r3 != 0) goto L_0x0542
        L_0x04ff:
            if (r27 == 0) goto L_0x052c
            boolean r3 = X.00l.A0W(r27)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            if (r3 != 0) goto L_0x052c
            java.lang.String[] r3 = new java.lang.String[]{r27}     // Catch:{ IllegalArgumentException -> 0x0d42 }
            java.util.ArrayList r7 = X.0sr.A1M(r3)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            X.OCD r3 = new X.OCD     // Catch:{ IllegalArgumentException -> 0x0d42 }
            r3.<init>(r1, r0)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            java.lang.String r1 = X.DbV.A0s()     // Catch:{ IllegalArgumentException -> 0x0d42 }
            X.1OC r2 = com.instagram.direct.request.DirectThreadApi.A0D(r0, r1, r2, r7)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            r1 = 14
            X.NMH.A00(r2, r3, r0, r1)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            r0 = 315964894(0x12d53dde, float:1.3457441E-27)
            X.1ES.A05(r2, r0, r6, r4, r4)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            org.json.JSONObject r1 = X.DbS.A11()     // Catch:{ IllegalArgumentException -> 0x0d42 }
            goto L_0x0548
        L_0x052c:
            r1 = 3
            java.lang.String r0 = "Can not create thread, the recipient id is empty"
            goto L_0x053b
        L_0x0530:
            r1 = 3
            java.lang.String r0 = "both thread id and participant id"
            goto L_0x053b
        L_0x0534:
            r1 = 3
            java.lang.String r0 = "payload is empty"
            goto L_0x053b
        L_0x0538:
            r1 = 3
            java.lang.String r0 = "group thread id is not valid"
        L_0x053b:
            X.OZH r2 = new X.OZH     // Catch:{ IllegalArgumentException -> 0x0d42 }
            r2.<init>(r1, r0)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            goto L_0x040d
        L_0x0542:
            java.lang.String r3 = X.OYS.A00(r1, r0, r7)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            goto L_0x0d4f
        L_0x0548:
            java.lang.String r0 = "success"
            r1.put(r0, r4)     // Catch:{ JSONException -> 0x054e }
            goto L_0x0552
        L_0x054e:
            r0 = move-exception
            X.C66583MXo.A1U(r0)     // Catch:{ IllegalArgumentException -> 0x0d42 }
        L_0x0552:
            java.lang.String r3 = X.DbT.A10(r1)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            goto L_0x0d4f
        L_0x0558:
            org.json.JSONObject r0 = r8.A02     // Catch:{ IllegalArgumentException -> 0x0d42 }
            if (r0 != 0) goto L_0x0562
            java.lang.String r3 = A00()     // Catch:{ IllegalArgumentException -> 0x0d42 }
            goto L_0x0d4f
        L_0x0562:
            X.OGG r3 = new X.OGG     // Catch:{ IllegalArgumentException -> 0x0d42 }
            r3.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            X.0nO r2 = X.0nY.A00()     // Catch:{ IllegalArgumentException -> 0x0d42 }
            X.NS1 r0 = new X.NS1     // Catch:{ IllegalArgumentException -> 0x0d42 }
            r0.<init>(r1, r3)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            r2.ATE(r0)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            org.json.JSONObject r1 = X.DbS.A11()     // Catch:{ IllegalArgumentException -> 0x0d42 }
            java.lang.String r0 = "success"
            r1.put(r0, r4)     // Catch:{ JSONException -> 0x057d }
            goto L_0x0581
        L_0x057d:
            r0 = move-exception
            X.C66583MXo.A1U(r0)     // Catch:{ IllegalArgumentException -> 0x0d42 }
        L_0x0581:
            java.lang.String r3 = X.DbT.A10(r1)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            goto L_0x0d4f
        L_0x0587:
            org.json.JSONObject r3 = r8.A02     // Catch:{ IllegalArgumentException -> 0x0d42 }
            if (r3 != 0) goto L_0x0591
            java.lang.String r3 = A00()     // Catch:{ IllegalArgumentException -> 0x0d42 }
            goto L_0x0d4f
        L_0x0591:
            X.OGG r14 = new X.OGG     // Catch:{ IllegalArgumentException -> 0x0d42 }
            r14.<init>(r3)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            java.util.ArrayList r3 = r14.A03     // Catch:{ IllegalArgumentException -> 0x0d42 }
            X.0rm r13 = X.C51965G9l.A11()     // Catch:{ IllegalArgumentException -> 0x0d42 }
            java.util.Iterator r25 = r3.iterator()     // Catch:{ IllegalArgumentException -> 0x0d42 }
        L_0x05a0:
            boolean r3 = r25.hasNext()     // Catch:{ IllegalArgumentException -> 0x0d42 }
            if (r3 == 0) goto L_0x088d
            java.lang.String r3 = X.AnonymousClass7TE.A18(r25)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            if (r3 == 0) goto L_0x05a0
            android.net.Uri r6 = X.DbT.A09(r3)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            X.OOC r3 = new X.OOC     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            r3.<init>()     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            r3.A02(r1, r6, r2, r2)     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            X.Ni4 r6 = r3.A00()     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            X.1ud r3 = X.1ua.A0G     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            X.1ua r12 = r3.A01(r1, r0)     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            java.lang.String r20 = X.JTQ.A0Z()     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            java.lang.String r15 = r6.getPath()     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            X.0qQ.A0A(r15)     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            r6 = 46
            int r3 = X.C66581MXm.A04(r15)     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            int r3 = r3 + -1
            int r3 = X.00l.A05(r15, r6, r3)     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            java.lang.String r11 = X.C66580MXl.A0z(r15, r3)     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            java.lang.String r3 = ".jpg"
            r24 = 0
            java.lang.String r10 = ".png"
            java.lang.String r7 = ".jpeg"
            java.lang.String r6 = ".webp"
            java.lang.String[] r3 = new java.lang.String[]{r3, r10, r7, r6}     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            java.util.Set r3 = X.0sc.A07(r3)     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            boolean r3 = r3.contains(r11)     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            if (r3 == 0) goto L_0x0601
            X.3Q2 r3 = X.AnonymousClass9T3.A01(r20)     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            r12.A0E(r3)     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            r3.A33 = r15     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            r11 = 1
            goto L_0x069b
        L_0x0601:
            java.lang.String r3 = ".mp4"
            boolean r3 = r11.equals(r3)     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            if (r3 == 0) goto L_0x0858
            X.3Q2 r3 = X.AnonymousClass9T3.A02(r20)     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            r12.A0F(r3)     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            r10 = 1065353216(0x3f800000, float:1.0)
            r3.A02 = r10     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            android.media.MediaMetadataRetriever r7 = new android.media.MediaMetadataRetriever     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            r7.<init>()     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            r7.setDataSource(r15)     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            r6 = 18
            java.lang.String r23 = r7.extractMetadata(r6)     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            r6 = 19
            java.lang.String r22 = r7.extractMetadata(r6)     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            r6 = 9
            java.lang.String r6 = r7.extractMetadata(r6)     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            if (r23 == 0) goto L_0x083e
            if (r22 == 0) goto L_0x083e
            if (r6 == 0) goto L_0x083e
            int r21 = java.lang.Integer.parseInt(r23)     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            int r20 = java.lang.Integer.parseInt(r22)     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            int r7 = java.lang.Integer.parseInt(r6)     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            r6 = 16777215(0xffffff, float:2.3509886E-38)
            com.instagram.pendingmedia.model.ClipInfo r11 = new com.instagram.pendingmedia.model.ClipInfo     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            r11.<init>(r2, r6)     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            r6 = -1
            r11.A03 = r6     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            r6 = r21
            r11.A09 = r6     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            r6 = r20
            r11.A06 = r6     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            r6 = r19
            r11.A07 = r6     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            r11.A05 = r7     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            long r6 = (long) r7     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            r11.A0A = r6     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r19)     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            r11.A0C = r6     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            r11.A0F = r15     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            java.lang.String r7 = r14.A01     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            if (r7 == 0) goto L_0x066f
            boolean r15 = X.00l.A0W(r7)     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            r6 = 0
            if (r15 == 0) goto L_0x0670
        L_0x066f:
            r6 = 1
        L_0x0670:
            if (r6 == 0) goto L_0x0675
            r6 = 1065353216(0x3f800000, float:1.0)
            goto L_0x067e
        L_0x0675:
            float r6 = java.lang.Float.parseFloat(r23)     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            float r15 = java.lang.Float.parseFloat(r22)     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            float r6 = r6 / r15
        L_0x067e:
            r11.A00 = r6     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            if (r7 == 0) goto L_0x0689
            boolean r7 = X.00l.A0W(r7)     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            r6 = 0
            if (r7 == 0) goto L_0x068a
        L_0x0689:
            r6 = 1
        L_0x068a:
            if (r6 != 0) goto L_0x0695
            float r10 = java.lang.Float.parseFloat(r23)     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            float r6 = java.lang.Float.parseFloat(r22)     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            float r10 = r10 / r6
        L_0x0695:
            r3.A02 = r10     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            X.Q0X.A04(r11, r3)     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            r11 = 0
        L_0x069b:
            r6 = 55
            r3.A0K = r6     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            java.lang.String r10 = r14.A01     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            if (r10 == 0) goto L_0x06aa
            boolean r7 = X.00l.A0W(r10)     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            r6 = 0
            if (r7 == 0) goto L_0x06ab
        L_0x06aa:
            r6 = 1
        L_0x06ab:
            if (r6 == 0) goto L_0x06ae
            goto L_0x06b1
        L_0x06ae:
            X.514 r6 = X.AnonymousClass514.ORIGINAL     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            goto L_0x06b3
        L_0x06b1:
            X.514 r6 = X.AnonymousClass514.NINE_BY_SIXTEEN     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
        L_0x06b3:
            r3.A15 = r6     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            r3.A5V = r4     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            com.instagram.pendingmedia.model.constants.ShareType r6 = com.instagram.pendingmedia.model.constants.ShareType.REEL_SHARE     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            r3.A0e(r6)     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            com.instagram.common.gallery.metadata.MediaUploadMetadata r7 = r3.A13     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            java.lang.String r6 = r14.A02     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            r7.A03 = r6     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            if (r11 == 0) goto L_0x06c5
            goto L_0x06c8
        L_0x06c5:
            X.Nlv r6 = X.C69451Nlv.VIDEO     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            goto L_0x06ca
        L_0x06c8:
            X.Nlv r6 = X.C69451Nlv.PHOTO     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
        L_0x06ca:
            r13.A00 = r6     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            java.lang.Integer r7 = r14.A00     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            java.lang.Integer r6 = X.AnonymousClass05K.A01     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            if (r7 != r6) goto L_0x06e1
            com.instagram.user.model.User r6 = X.DbT.A0j(r0)     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            boolean r6 = r6.A1m()     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            if (r6 == 0) goto L_0x082f
            X.3QO r6 = X.AnonymousClass3QO.CLOSE_FRIENDS     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            r3.A0U(r6)     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
        L_0x06e1:
            X.9sz r6 = X.C391429sz.A0n     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            r3.A0f(r6)     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            if (r10 == 0) goto L_0x06ee
            boolean r6 = X.00l.A0W(r10)     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            if (r6 == 0) goto L_0x06f0
        L_0x06ee:
            r24 = 1
        L_0x06f0:
            if (r24 != 0) goto L_0x06f3
            goto L_0x070f
        L_0x06f3:
            X.0r1 r30 = new X.0r1     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            r30.<init>()     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            X.PIW r6 = new X.PIW     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            r26 = r6
            r27 = r0
            r28 = r3
            r29 = r9
            r31 = r13
            r26.<init>(r27, r28, r29, r30, r31)     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            r12.A0J(r6)     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            r12.A0B(r3)     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            goto L_0x05a0
        L_0x070f:
            boolean r9 = r14.A04     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            java.lang.Object r6 = r13.A00     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            X.Nlv r6 = (X.C69451Nlv) r6     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            boolean r7 = X.C51966G9m.A1X(r10)     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            if (r7 == 0) goto L_0x081b
            if (r9 == 0) goto L_0x071e
            goto L_0x0736
        L_0x071e:
            com.instagram.pendingmedia.model.recipients.PendingRecipient r7 = new com.instagram.pendingmedia.model.recipients.PendingRecipient     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            r7.<init>((java.lang.String) r10)     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            com.instagram.pendingmedia.model.recipients.PendingRecipient[] r7 = new com.instagram.pendingmedia.model.recipients.PendingRecipient[]{r7}     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            java.util.ArrayList r7 = X.0sr.A1M(r7)     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            X.5gg r9 = new X.5gg     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            r9.<init>(r7)     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            com.instagram.pendingmedia.model.recipients.PendingRecipient r7 = new com.instagram.pendingmedia.model.recipients.PendingRecipient     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            r7.<init>((java.lang.String) r10)     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            goto L_0x0793
        L_0x0736:
            X.3t0 r9 = X.C66580MXl.A0g(r10)     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            java.lang.String r28 = ""
            com.instagram.common.typedurl.ImageUrl r21 = com.instagram.pendingmedia.model.recipients.PendingRecipient.A0g     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            com.instagram.user.model.FollowStatus r22 = com.instagram.user.model.FollowStatus.A08     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            r33 = -1
            com.instagram.pendingmedia.model.recipients.PendingRecipient r7 = new com.instagram.pendingmedia.model.recipients.PendingRecipient     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            r20 = r7
            r23 = r2
            r24 = r2
            r25 = r2
            r26 = r2
            r27 = r2
            r29 = r28
            r30 = r2
            r31 = r19
            r32 = r19
            r34 = r19
            r35 = r19
            r36 = r19
            r37 = r4
            r38 = r19
            r39 = r19
            r40 = r19
            r41 = r19
            r42 = r19
            r43 = r19
            r44 = r4
            r45 = r19
            r46 = r19
            r47 = r19
            r48 = r19
            r49 = r19
            r50 = r19
            r51 = r19
            r52 = r19
            r53 = r19
            r54 = r19
            r55 = r19
            r56 = r19
            r57 = r19
            r58 = r19
            r59 = r19
            r60 = r19
            r61 = r19
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61)     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
        L_0x0793:
            int r10 = r6.ordinal()     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            r6 = r19
            if (r10 == r6) goto L_0x07a3
            if (r10 != r4) goto L_0x079e
            goto L_0x07c7
        L_0x079e:
            X.Wub r0 = X.AnonymousClass7TE.A1K()     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            throw r0     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
        L_0x07a3:
            X.7Z6 r20 = X.AnonymousClass7Z6.A00(r0)     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            com.instagram.model.direct.DirectShareTarget r0 = new com.instagram.model.direct.DirectShareTarget     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            r0.<init>((X.C254783t2) r9, (com.instagram.pendingmedia.model.recipients.PendingRecipient) r7)     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            X.8Cl r25 = new X.8Cl     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            r25.<init>()     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            java.lang.String r28 = X.DbV.A0s()     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            java.lang.String r27 = "smart_glasses_share_from_glasses"
            r21 = r1
            r22 = r2
            r23 = r0
            r24 = r3
            r26 = r2
            r29 = r6
            r20.EMI(r21, r22, r23, r24, r25, r26, r27, r28, r29)     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            goto L_0x081b
        L_0x07c7:
            android.content.Context r12 = X.C51966G9m.A0P(r0)     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            com.instagram.pendingmedia.model.ClipInfo r6 = r3.A1N     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            int r11 = r6.A09     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            float r10 = (float) r11     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            int r6 = r6.A06     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            float r6 = (float) r6     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            float r10 = r10 / r6
            android.graphics.Point r6 = X.AEW.A01(r12, r0, r10, r11)     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            int r12 = r6.x     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            int r11 = r6.y     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            java.io.File r10 = X.AnonymousClass457.A01()     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            r6 = 100
            X.C64188LSv.A02(r3, r10, r12, r11, r6)     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            java.lang.String r6 = r10.getAbsolutePath()     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            r3.A33 = r6     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            X.7Z6 r20 = X.AnonymousClass7Z6.A00(r0)     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            com.instagram.model.direct.DirectShareTarget r0 = new com.instagram.model.direct.DirectShareTarget     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            r0.<init>((X.C254783t2) r9, (com.instagram.pendingmedia.model.recipients.PendingRecipient) r7)     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            com.instagram.pendingmedia.model.ClipInfo r6 = r3.A1N     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            java.lang.String r28 = r10.getAbsolutePath()     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            java.lang.String r30 = "smart_glasses_share_from_glasses"
            r21 = r1
            r22 = r2
            r23 = r2
            r24 = r0
            r25 = r6
            r26 = r3
            r27 = r2
            r29 = r2
            r31 = r2
            r32 = r2
            r33 = r2
            r34 = r19
            r35 = r19
            r36 = r19
            r20.EN0(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
        L_0x081b:
            org.json.JSONObject r1 = X.DbS.A11()     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            java.lang.String r0 = "success"
            r1.put(r0, r4)     // Catch:{ JSONException -> 0x0825 }
            goto L_0x0829
        L_0x0825:
            r0 = move-exception
            X.C66583MXo.A1U(r0)     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
        L_0x0829:
            java.lang.String r3 = X.DbT.A10(r1)     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            goto L_0x0d4f
        L_0x082f:
            r2 = 17
            java.lang.String r1 = "User does not have close friends story"
            X.OZH r0 = new X.OZH     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            r0.<init>(r2, r1)     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            java.lang.String r3 = r0.A01()     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            goto L_0x0d4f
        L_0x083e:
            java.lang.String r2 = "StellaRequestHandler"
            java.lang.String r1 = "Unable to extract metadata from %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r15}     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            X.0KC.A0O(r2, r1, r0)     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            r2 = 13
            java.lang.String r1 = "unable to extract metadata from source media"
            X.OZH r0 = new X.OZH     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            r0.<init>(r2, r1)     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            java.lang.String r3 = r0.A01()     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            goto L_0x0d4f
        L_0x0858:
            java.lang.String r2 = "StellaRequestHandler"
            java.lang.String r1 = "Media format not supported: %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r11}     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            X.0KC.A0O(r2, r1, r0)     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            r2 = 13
            java.lang.String r1 = "media not supported"
            X.OZH r0 = new X.OZH     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            r0.<init>(r2, r1)     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            java.lang.String r3 = r0.A01()     // Catch:{ IOException -> 0x0878, IllegalArgumentException -> 0x0872 }
            goto L_0x0d4f
        L_0x0872:
            r1 = move-exception
            java.lang.String r0 = "StellaRequestHandler"
            java.lang.String r2 = "IllegalArgumentException when receiving media"
            goto L_0x087d
        L_0x0878:
            r1 = move-exception
            java.lang.String r0 = "StellaRequestHandler"
            java.lang.String r2 = "Unexpected IO Exception when receiving media"
        L_0x087d:
            X.0KC.A0G(r0, r2, r1)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            r1 = 14
            X.OZH r0 = new X.OZH     // Catch:{ IllegalArgumentException -> 0x0d42 }
            r0.<init>(r1, r2)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            java.lang.String r3 = r0.A01()     // Catch:{ IllegalArgumentException -> 0x0d42 }
            goto L_0x0d4f
        L_0x088d:
            X.Orv r3 = X.OYS.A00     // Catch:{ IllegalArgumentException -> 0x0d42 }
            java.lang.Object r2 = r13.A00     // Catch:{ IllegalArgumentException -> 0x0d42 }
            X.Nlv r2 = (X.C69451Nlv) r2     // Catch:{ IllegalArgumentException -> 0x0d42 }
            java.lang.String r1 = "MEDIA_SHARING"
            X.C70883OQa.A00(r2, r3, r0, r9, r1)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            org.json.JSONObject r1 = X.DbS.A11()     // Catch:{ IllegalArgumentException -> 0x0d42 }
            java.lang.String r0 = "success"
            r1.put(r0, r4)     // Catch:{ JSONException -> 0x08a2 }
            goto L_0x08a6
        L_0x08a2:
            r0 = move-exception
            X.C66583MXo.A1U(r0)     // Catch:{ IllegalArgumentException -> 0x0d42 }
        L_0x08a6:
            java.lang.String r3 = X.DbT.A10(r1)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            goto L_0x0d4f
        L_0x08ac:
            org.json.JSONObject r11 = r8.A02     // Catch:{ IllegalArgumentException -> 0x0d42 }
            boolean r3 = A02(r0)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            if (r3 != 0) goto L_0x08bc
            X.NkA r0 = X.C69370NkA.A0D     // Catch:{ IllegalArgumentException -> 0x0d42 }
            java.lang.String r3 = X.OZH.A00(r0)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            goto L_0x0d4f
        L_0x08bc:
            if (r11 != 0) goto L_0x08c4
            java.lang.String r3 = A00()     // Catch:{ IllegalArgumentException -> 0x0d42 }
            goto L_0x0d4f
        L_0x08c4:
            java.lang.String r10 = "thread_id"
            boolean r3 = r11.has(r10)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            r12 = 0
            if (r3 == 0) goto L_0x08fa
            java.lang.String r7 = r11.getString(r10)     // Catch:{ IllegalArgumentException -> 0x0d42 }
        L_0x08d1:
            java.lang.String r6 = "recipient_id"
            boolean r3 = r11.has(r6)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            if (r3 == 0) goto L_0x08dd
            java.lang.String r12 = r11.getString(r6)     // Catch:{ IllegalArgumentException -> 0x0d42 }
        L_0x08dd:
            java.lang.String r6 = "compound_contact_id"
            boolean r3 = r11.has(r6)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            if (r3 == 0) goto L_0x0902
            java.lang.String r6 = r11.getString(r6)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            if (r6 == 0) goto L_0x0902
            boolean r3 = X.00l.A0W(r6)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            if (r3 != 0) goto L_0x0902
            X.N49 r6 = X.O0A.A00(r6)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            java.lang.String r3 = r6.A01     // Catch:{ IllegalArgumentException -> 0x0d42 }
            if (r3 == 0) goto L_0x08fd
            goto L_0x08fc
        L_0x08fa:
            r7 = r2
            goto L_0x08d1
        L_0x08fc:
            r12 = r3
        L_0x08fd:
            java.lang.String r3 = r6.A00     // Catch:{ IllegalArgumentException -> 0x0d42 }
            if (r3 == 0) goto L_0x0902
            r7 = r3
        L_0x0902:
            X.2Dm r6 = X.1bJ.A00(r0)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            if (r7 == 0) goto L_0x0a31
            int r3 = r7.length()     // Catch:{ IllegalArgumentException -> 0x0d42 }
            if (r3 == 0) goto L_0x0a31
            com.instagram.model.direct.DirectThreadKey r11 = new com.instagram.model.direct.DirectThreadKey     // Catch:{ IllegalArgumentException -> 0x0d42 }
            r11.<init>(r7, r2)     // Catch:{ IllegalArgumentException -> 0x0d42 }
        L_0x0913:
            X.2Dr r6 = (X.2Dr) r6     // Catch:{ IllegalArgumentException -> 0x0d42 }
            java.util.HashMap r7 = X.AnonymousClass7TE.A1E()     // Catch:{ IllegalArgumentException -> 0x0d42 }
            X.48S r3 = r6.A0P(r11)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            if (r3 == 0) goto L_0x0928
            X.3U9 r6 = r3.A0I     // Catch:{ IllegalArgumentException -> 0x0d42 }
            java.util.List r3 = r3.A0O()     // Catch:{ IllegalArgumentException -> 0x0d42 }
            r7.put(r6, r3)     // Catch:{ IllegalArgumentException -> 0x0d42 }
        L_0x0928:
            java.util.Map r3 = java.util.Collections.unmodifiableMap(r7)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            X.0qQ.A07(r3)     // Catch:{ IllegalArgumentException -> 0x0d42 }
        L_0x092f:
            X.Orv r7 = X.OYS.A00     // Catch:{ IllegalArgumentException -> 0x0d42 }
            java.lang.String r6 = "OTHERS"
            X.C70883OQa.A00(r2, r7, r0, r9, r6)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            org.json.JSONArray r9 = new org.json.JSONArray     // Catch:{ IllegalArgumentException -> 0x0d42 }
            r9.<init>()     // Catch:{ IllegalArgumentException -> 0x0d42 }
            java.util.Iterator r24 = X.AnonymousClass7TF.A0u(r3)     // Catch:{ IllegalArgumentException -> 0x0d42 }
        L_0x093f:
            boolean r3 = r24.hasNext()     // Catch:{ IllegalArgumentException -> 0x0d42 }
            if (r3 == 0) goto L_0x0a4a
            java.util.Map$Entry r3 = X.AnonymousClass7TE.A1J(r24)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            java.lang.Object r7 = r3.getKey()     // Catch:{ IllegalArgumentException -> 0x0d42 }
            X.2Ep r7 = (X.AnonymousClass2Ep) r7     // Catch:{ IllegalArgumentException -> 0x0d42 }
            java.lang.Object r12 = r3.getValue()     // Catch:{ IllegalArgumentException -> 0x0d42 }
            java.util.List r12 = (java.util.List) r12     // Catch:{ IllegalArgumentException -> 0x0d42 }
            boolean r3 = r7.isMuted()     // Catch:{ JSONException -> 0x0a27 }
            if (r3 != 0) goto L_0x093f
            java.lang.String r3 = r7.C6C()     // Catch:{ JSONException -> 0x0a27 }
            if (r3 == 0) goto L_0x093f
            java.lang.String r11 = r7.C6f()     // Catch:{ JSONException -> 0x0a27 }
            boolean r3 = r7.CUG()     // Catch:{ JSONException -> 0x0a27 }
            if (r3 == 0) goto L_0x0a0a
            boolean r3 = r7.CY7()     // Catch:{ JSONException -> 0x0a27 }
            if (r3 != 0) goto L_0x097b
            java.util.List r6 = r7.BRZ()     // Catch:{ JSONException -> 0x0a27 }
            r3 = r19
            java.lang.String r11 = X.AnonymousClass48N.A08(r1, r0, r2, r6, r3)     // Catch:{ JSONException -> 0x0a27 }
        L_0x097b:
            java.util.Iterator r23 = r12.iterator()     // Catch:{ JSONException -> 0x0a27 }
        L_0x097f:
            boolean r3 = r23.hasNext()     // Catch:{ JSONException -> 0x0a27 }
            if (r3 == 0) goto L_0x093f
            X.3su r6 = X.C66580MXl.A0a(r23)     // Catch:{ JSONException -> 0x0a27 }
            X.17i r12 = X.17h.A00(r0)     // Catch:{ JSONException -> 0x0a27 }
            java.lang.String r3 = r6.A1u     // Catch:{ JSONException -> 0x0a27 }
            com.instagram.user.model.User r22 = r12.A02(r3)     // Catch:{ JSONException -> 0x0a27 }
            java.lang.String r3 = r7.C6C()     // Catch:{ JSONException -> 0x0a27 }
            if (r3 == 0) goto L_0x097f
            java.lang.String r3 = r6.A0g()     // Catch:{ JSONException -> 0x0a27 }
            if (r3 == 0) goto L_0x097f
            if (r22 == 0) goto L_0x097f
            java.lang.Object r3 = r6.A1T     // Catch:{ JSONException -> 0x0a27 }
            if (r3 == 0) goto L_0x097f
            java.lang.String r15 = r7.C6C()     // Catch:{ JSONException -> 0x0a27 }
            java.lang.String r12 = ""
            if (r15 != 0) goto L_0x09ae
            r15 = r12
        L_0x09ae:
            boolean r21 = r7.CUG()     // Catch:{ JSONException -> 0x0a27 }
            java.lang.String r14 = r6.A0g()     // Catch:{ JSONException -> 0x0a27 }
            if (r14 != 0) goto L_0x09b9
            r14 = r12
        L_0x09b9:
            java.lang.String r20 = X.O09.A00(r6)     // Catch:{ JSONException -> 0x0a27 }
            java.lang.Object r13 = r6.A1T     // Catch:{ JSONException -> 0x0a27 }
            boolean r3 = r13 instanceof java.lang.String     // Catch:{ JSONException -> 0x0a27 }
            if (r3 == 0) goto L_0x09c6
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ JSONException -> 0x0a27 }
            goto L_0x09c7
        L_0x09c6:
            r13 = 0
        L_0x09c7:
            if (r13 != 0) goto L_0x09ca
            r13 = r12
        L_0x09ca:
            java.lang.String r3 = r6.A1u     // Catch:{ JSONException -> 0x0a27 }
            r25 = r3
            X.0qQ.A07(r25)     // Catch:{ JSONException -> 0x0a27 }
            java.lang.String r12 = r22.B8Q()     // Catch:{ JSONException -> 0x0a27 }
            org.json.JSONObject r6 = X.DbS.A11()     // Catch:{ JSONException -> 0x0a27 }
            r6.put(r10, r15)     // Catch:{ JSONException -> 0x0a27 }
            java.lang.String r3 = "thread_name"
            r6.put(r3, r11)     // Catch:{ JSONException -> 0x0a27 }
            java.lang.String r15 = "is_group"
            r3 = r21
            r6.put(r15, r3)     // Catch:{ JSONException -> 0x0a27 }
            java.lang.String r3 = "message_id"
            r6.put(r3, r14)     // Catch:{ JSONException -> 0x0a27 }
            java.lang.String r14 = "message_type"
            r3 = r20
            r6.put(r14, r3)     // Catch:{ JSONException -> 0x0a27 }
            java.lang.String r3 = "message_text"
            r6.put(r3, r13)     // Catch:{ JSONException -> 0x0a27 }
            java.lang.String r13 = "message_user_id"
            r3 = r25
            r6.put(r13, r3)     // Catch:{ JSONException -> 0x0a27 }
            java.lang.String r3 = "message_sender_name"
            r6.put(r3, r12)     // Catch:{ JSONException -> 0x0a27 }
            r9.put(r6)     // Catch:{ JSONException -> 0x0a27 }
            goto L_0x097f
        L_0x0a0a:
            java.util.List r6 = r7.BRZ()     // Catch:{ JSONException -> 0x0a27 }
            boolean r3 = X.AnonymousClass7TE.A1b(r6)     // Catch:{ JSONException -> 0x0a27 }
            if (r3 == 0) goto L_0x097b
            r3 = r19
            java.lang.Object r3 = X.00k.A0O(r6, r3)     // Catch:{ JSONException -> 0x0a27 }
            com.instagram.user.model.User r3 = (com.instagram.user.model.User) r3     // Catch:{ JSONException -> 0x0a27 }
            if (r3 == 0) goto L_0x0a24
            java.lang.String r11 = r3.B8Q()     // Catch:{ JSONException -> 0x0a27 }
            goto L_0x097b
        L_0x0a24:
            r11 = r2
            goto L_0x097b
        L_0x0a27:
            r7 = move-exception
            java.lang.String r6 = "MessageUtils"
            java.lang.String r3 = "Skip one message serialization due to error"
            X.0KC.A0F(r6, r3, r7)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            goto L_0x093f
        L_0x0a31:
            if (r12 == 0) goto L_0x0a44
            int r3 = r12.length()     // Catch:{ IllegalArgumentException -> 0x0d42 }
            if (r3 == 0) goto L_0x0a44
            java.util.List r3 = X.AnonymousClass7TE.A1I(r12)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            com.instagram.model.direct.DirectThreadKey r11 = new com.instagram.model.direct.DirectThreadKey     // Catch:{ IllegalArgumentException -> 0x0d42 }
            r11.<init>(r2, r3)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            goto L_0x0913
        L_0x0a44:
            java.util.Map r3 = r6.CBr()     // Catch:{ IllegalArgumentException -> 0x0d42 }
            goto L_0x092f
        L_0x0a4a:
            org.json.JSONObject r1 = X.DbS.A11()     // Catch:{ IllegalArgumentException -> 0x0d42 }
            A01(r9, r1)     // Catch:{ JSONException -> 0x0a52 }
            goto L_0x0a56
        L_0x0a52:
            r0 = move-exception
            X.C66583MXo.A1U(r0)     // Catch:{ IllegalArgumentException -> 0x0d42 }
        L_0x0a56:
            java.lang.String r3 = X.DbT.A10(r1)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            goto L_0x0d4f
        L_0x0a5c:
            org.json.JSONObject r6 = r8.A02     // Catch:{ IllegalArgumentException -> 0x0d42 }
            boolean r1 = A02(r0)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            if (r1 != 0) goto L_0x0a6c
            X.NkA r0 = X.C69370NkA.A0D     // Catch:{ IllegalArgumentException -> 0x0d42 }
            java.lang.String r3 = X.OZH.A00(r0)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            goto L_0x0d4f
        L_0x0a6c:
            if (r6 != 0) goto L_0x0a74
            java.lang.String r3 = A00()     // Catch:{ IllegalArgumentException -> 0x0d42 }
            goto L_0x0d4f
        L_0x0a74:
            java.lang.String r1 = "thread_id"
            java.lang.String r22 = r6.getString(r1)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            java.lang.String r1 = "message_id"
            java.lang.String r23 = r6.getString(r1)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            java.lang.String r1 = "message_user_id"
            java.lang.String r24 = r6.getString(r1)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            java.lang.String r3 = "compound_contact_id"
            boolean r1 = r6.has(r3)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            if (r1 == 0) goto L_0x0aaa
            java.lang.String r3 = r6.getString(r3)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            if (r3 == 0) goto L_0x0aaa
            boolean r1 = X.00l.A0W(r3)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            if (r1 != 0) goto L_0x0aaa
            X.N49 r3 = X.O0A.A00(r3)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            java.lang.String r1 = r3.A01     // Catch:{ IllegalArgumentException -> 0x0d42 }
            if (r1 == 0) goto L_0x0aa4
            r24 = r1
        L_0x0aa4:
            java.lang.String r1 = r3.A00     // Catch:{ IllegalArgumentException -> 0x0d42 }
            if (r1 == 0) goto L_0x0aaa
            r22 = r1
        L_0x0aaa:
            java.lang.String r1 = ""
            if (r22 != 0) goto L_0x0ab0
            r22 = r1
        L_0x0ab0:
            if (r24 != 0) goto L_0x0ab4
            r24 = r1
        L_0x0ab4:
            r26 = 0
            r20 = r2
            r21 = r0
            r25 = r2
            r28 = r19
            X.C66671Mae.A00(r20, r21, r22, r23, r24, r25, r26, r28)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            X.Orv r3 = X.OYS.A00     // Catch:{ IllegalArgumentException -> 0x0d42 }
            java.lang.String r1 = "OTHERS"
            X.C70883OQa.A00(r2, r3, r0, r9, r1)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            org.json.JSONObject r1 = X.DbS.A11()     // Catch:{ IllegalArgumentException -> 0x0d42 }
            java.lang.String r0 = "success"
            r1.put(r0, r4)     // Catch:{ JSONException -> 0x0ad2 }
            goto L_0x0ad6
        L_0x0ad2:
            r0 = move-exception
            X.C66583MXo.A1U(r0)     // Catch:{ IllegalArgumentException -> 0x0d42 }
        L_0x0ad6:
            java.lang.String r3 = X.DbT.A10(r1)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            goto L_0x0d4f
        L_0x0adc:
            boolean r2 = A02(r0)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            if (r2 != 0) goto L_0x0aea
            X.NkA r0 = X.C69370NkA.A0D     // Catch:{ IllegalArgumentException -> 0x0d42 }
            java.lang.String r3 = X.OZH.A00(r0)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            goto L_0x0d4f
        L_0x0aea:
            X.OyC r1 = X.C66953Mfm.A00(r1, r0)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            java.lang.String r0 = "User trigger via assistant"
            r1.A07(r0)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            java.lang.String r0 = "true"
            org.json.JSONObject r1 = X.DbS.A11()     // Catch:{ IllegalArgumentException -> 0x0d42 }
            A01(r0, r1)     // Catch:{ JSONException -> 0x0afd }
            goto L_0x0b01
        L_0x0afd:
            r0 = move-exception
            X.C66583MXo.A1U(r0)     // Catch:{ IllegalArgumentException -> 0x0d42 }
        L_0x0b01:
            java.lang.String r3 = X.DbT.A10(r1)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            goto L_0x0d4f
        L_0x0b07:
            boolean r3 = A02(r0)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            if (r3 != 0) goto L_0x0b1a
            X.NkA r0 = X.C69370NkA.A0D     // Catch:{ IllegalArgumentException -> 0x0d42 }
            X.OZH r2 = new X.OZH     // Catch:{ IllegalArgumentException -> 0x0d42 }
            r2.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x0d42 }
        L_0x0b14:
            java.lang.String r3 = r2.A01()     // Catch:{ IllegalArgumentException -> 0x0d42 }
            goto L_0x0d4f
        L_0x0b1a:
            java.lang.String r3 = "android.permission.RECORD_AUDIO"
            int r3 = X.02K.A00(r1, r3)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            if (r3 == 0) goto L_0x0b2c
            r1 = 19
            java.lang.String r0 = "Need to grant record audio permission through notification"
            X.OZH r2 = new X.OZH     // Catch:{ IllegalArgumentException -> 0x0d42 }
            r2.<init>(r1, r0)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            goto L_0x0b14
        L_0x0b2c:
            X.OyC r10 = X.C66953Mfm.A00(r1, r0)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            X.OVd r0 = r10.A09     // Catch:{ IllegalArgumentException -> 0x0d42 }
            X.Oaz r0 = r0.A0K     // Catch:{ IllegalArgumentException -> 0x0d42 }
            X.N3a r9 = r0.A03     // Catch:{ IllegalArgumentException -> 0x0d42 }
            X.N4R r0 = r0.A00     // Catch:{ IllegalArgumentException -> 0x0d42 }
            java.lang.Object r0 = r0.A00     // Catch:{ IllegalArgumentException -> 0x0d42 }
            X.N9J r0 = (X.N9J) r0     // Catch:{ IllegalArgumentException -> 0x0d42 }
            com.instagram.model.rtc.RtcCallKey r7 = r0.A00     // Catch:{ IllegalArgumentException -> 0x0d42 }
            if (r9 == 0) goto L_0x0b7b
            if (r7 == 0) goto L_0x0b7b
            java.lang.String r6 = r9.A04     // Catch:{ IllegalArgumentException -> 0x0d42 }
            if (r6 == 0) goto L_0x0b4c
            int r0 = r6.length()     // Catch:{ IllegalArgumentException -> 0x0d42 }
            if (r0 != 0) goto L_0x0b4e
        L_0x0b4c:
            java.lang.String r6 = r9.A06     // Catch:{ IllegalArgumentException -> 0x0d42 }
        L_0x0b4e:
            X.Nid r1 = r9.A02     // Catch:{ IllegalArgumentException -> 0x0d42 }
            X.Nid r0 = X.C69277Nid.NO_E2EE     // Catch:{ IllegalArgumentException -> 0x0d42 }
            boolean r0 = X.C51969G9p.A1a(r1, r0)
            r3 = 0
            if (r0 != 0) goto L_0x0b5b
            java.lang.String r2 = r9.A08     // Catch:{ IllegalArgumentException -> 0x0d42 }
        L_0x0b5b:
            if (r0 == 0) goto L_0x0b5f
            java.lang.String r3 = r9.A08     // Catch:{ IllegalArgumentException -> 0x0d42 }
        L_0x0b5f:
            android.os.Handler r1 = X.AnonymousClass7TF.A0D()     // Catch:{ IllegalArgumentException -> 0x0d42 }
            X.Pc7 r0 = new X.Pc7     // Catch:{ IllegalArgumentException -> 0x0d42 }
            r20 = r0
            r21 = r7
            r22 = r9
            r23 = r9
            r24 = r10
            r25 = r2
            r26 = r3
            r27 = r6
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            r1.post(r0)     // Catch:{ IllegalArgumentException -> 0x0d42 }
        L_0x0b7b:
            java.lang.String r0 = "true"
            org.json.JSONObject r1 = X.DbS.A11()     // Catch:{ IllegalArgumentException -> 0x0d42 }
            A01(r0, r1)     // Catch:{ JSONException -> 0x0b85 }
            goto L_0x0b89
        L_0x0b85:
            r0 = move-exception
            X.C66583MXo.A1U(r0)     // Catch:{ IllegalArgumentException -> 0x0d42 }
        L_0x0b89:
            java.lang.String r3 = X.DbT.A10(r1)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            goto L_0x0d4f
        L_0x0b8f:
            boolean r2 = A02(r0)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            if (r2 != 0) goto L_0x0b9d
            X.NkA r0 = X.C69370NkA.A0D     // Catch:{ IllegalArgumentException -> 0x0d42 }
            java.lang.String r3 = X.OZH.A00(r0)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            goto L_0x0d4f
        L_0x0b9d:
            X.OyC r1 = X.C66953Mfm.A00(r1, r0)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            r0 = r19
            r1.A01(r4, r0)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            java.lang.String r0 = "true"
            org.json.JSONObject r1 = X.DbS.A11()     // Catch:{ IllegalArgumentException -> 0x0d42 }
            A01(r0, r1)     // Catch:{ JSONException -> 0x0bb0 }
            goto L_0x0bb4
        L_0x0bb0:
            r0 = move-exception
            X.C66583MXo.A1U(r0)     // Catch:{ IllegalArgumentException -> 0x0d42 }
        L_0x0bb4:
            java.lang.String r3 = X.DbT.A10(r1)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            goto L_0x0d4f
        L_0x0bba:
            java.lang.String r7 = "FetchLogsRequestHandler"
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ IllegalArgumentException -> 0x0d42 }
            r6.<init>()     // Catch:{ IllegalArgumentException -> 0x0d42 }
            java.lang.String r3 = "debuglog-latest"
            java.lang.String r0 = ".txt"
            java.io.File r3 = java.io.File.createTempFile(r3, r0)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            if (r3 != 0) goto L_0x0bcc
            goto L_0x0bf6
        L_0x0bcc:
            X.JTR.A1O(r3)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            java.lang.String r9 = "logcat"
            java.lang.String r10 = "-v"
            java.lang.String r11 = "threadtime,year,zone"
            java.lang.String r12 = "-t"
            java.lang.String r13 = "1000"
            java.lang.String r14 = "-f"
            java.lang.String r15 = r3.getCanonicalPath()     // Catch:{ Exception -> 0x0bef }
            java.lang.String[] r9 = new java.lang.String[]{r9, r10, r11, r12, r13, r14, r15}     // Catch:{ Exception -> 0x0bef }
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()     // Catch:{ Exception -> 0x0bef }
            java.lang.Process r0 = r0.exec(r9)     // Catch:{ Exception -> 0x0bef }
            r0.waitFor()     // Catch:{ Exception -> 0x0bef }
            goto L_0x0bf7
        L_0x0bef:
            r9 = move-exception
            java.lang.String r0 = "Failed to fetch logs"
            X.0KC.A0F(r7, r0, r9)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            goto L_0x0bf7
        L_0x0bf6:
            r3 = 0
        L_0x0bf7:
            if (r3 == 0) goto L_0x0c77
            r14 = 0
            X.NEJ r11 = new X.NEJ     // Catch:{ IOException -> 0x0c68 }
            r11.<init>()     // Catch:{ IOException -> 0x0c68 }
            java.lang.String r0 = r3.getName()     // Catch:{ IOException -> 0x0c68 }
            r13 = 46
            int r12 = r0.lastIndexOf(r13)     // Catch:{ IOException -> 0x0c68 }
            r9 = -1
            java.lang.String r10 = r3.getName()     // Catch:{ IOException -> 0x0c68 }
            if (r12 == r9) goto L_0x0c16
            r0 = r19
            java.lang.String r10 = r10.substring(r0, r12)     // Catch:{ IOException -> 0x0c68 }
        L_0x0c16:
            java.lang.String r0 = r3.getName()     // Catch:{ IOException -> 0x0c68 }
            int r0 = r0.lastIndexOf(r13)     // Catch:{ IOException -> 0x0c68 }
            if (r0 != r9) goto L_0x0c39
            java.lang.String r9 = ""
        L_0x0c22:
            java.util.HashMap r0 = X.MY3.A06     // Catch:{ IOException -> 0x0c68 }
            X.0TC r0 = new X.0TC     // Catch:{ IOException -> 0x0c68 }
            r0.<init>()     // Catch:{ IOException -> 0x0c68 }
            X.MY3 r0 = X.MY3.A01(r1, r2, r0)     // Catch:{ IOException -> 0x0c68 }
            java.io.File r10 = r11.A03(r1, r10, r9)     // Catch:{ IOException -> 0x0c68 }
            android.net.Uri r9 = r0.A04(r10)     // Catch:{ IOException -> 0x0c68 }
            X.JTR.A1O(r10)     // Catch:{ IOException -> 0x0c68 }
            goto L_0x0c44
        L_0x0c39:
            java.lang.String r9 = r3.getName()     // Catch:{ IOException -> 0x0c68 }
            int r0 = r0 + 1
            java.lang.String r9 = r9.substring(r0)     // Catch:{ IOException -> 0x0c68 }
            goto L_0x0c22
        L_0x0c44:
            java.lang.String r2 = r3.getCanonicalPath()     // Catch:{ all -> 0x0c54 }
            java.lang.String r0 = r10.getCanonicalPath()     // Catch:{ all -> 0x0c54 }
            android.system.Os.symlink(r2, r0)     // Catch:{ all -> 0x0c54 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)     // Catch:{ IOException -> 0x0c68 }
            goto L_0x0c58
        L_0x0c54:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r19)     // Catch:{ IOException -> 0x0c68 }
        L_0x0c58:
            boolean r0 = r0.booleanValue()     // Catch:{ IOException -> 0x0c68 }
            if (r0 != 0) goto L_0x0c61
            X.0b9.A01(r3, r10)     // Catch:{ IOException -> 0x0c68 }
        L_0x0c61:
            r14 = r9
            java.lang.String r0 = "com.facebook.stella"
            r1.grantUriPermission(r0, r9, r4)     // Catch:{ IOException -> 0x0c68 }
            goto L_0x0c6e
        L_0x0c68:
            r1 = move-exception
            java.lang.String r0 = "Failed to fetch logs"
            X.0KC.A0F(r7, r0, r1)     // Catch:{ IllegalArgumentException -> 0x0d42 }
        L_0x0c6e:
            if (r14 == 0) goto L_0x0c77
            java.lang.String r0 = r14.toString()     // Catch:{ IllegalArgumentException -> 0x0d42 }
            r6.put(r0)     // Catch:{ IllegalArgumentException -> 0x0d42 }
        L_0x0c77:
            org.json.JSONObject r1 = X.DbS.A11()     // Catch:{ IllegalArgumentException -> 0x0d42 }
            A01(r6, r1)     // Catch:{ JSONException -> 0x0c7f }
            goto L_0x0c83
        L_0x0c7f:
            r0 = move-exception
            X.C66583MXo.A1U(r0)     // Catch:{ IllegalArgumentException -> 0x0d42 }
        L_0x0c83:
            java.lang.String r3 = X.DbT.A10(r1)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            goto L_0x0d4f
        L_0x0c89:
            X.O0B.A00(r2, r2)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            X.Orv r3 = X.OYS.A00     // Catch:{ IllegalArgumentException -> 0x0d42 }
            java.lang.String r1 = "PROVIDER_UNLINKING"
            X.C70883OQa.A00(r2, r3, r0, r9, r1)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            org.json.JSONObject r1 = X.DbS.A11()     // Catch:{ IllegalArgumentException -> 0x0d42 }
            java.lang.String r0 = "success"
            r1.put(r0, r4)     // Catch:{ JSONException -> 0x0c9d }
            goto L_0x0ca1
        L_0x0c9d:
            r0 = move-exception
            X.C66583MXo.A1U(r0)     // Catch:{ IllegalArgumentException -> 0x0d42 }
        L_0x0ca1:
            java.lang.String r3 = X.DbT.A10(r1)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            goto L_0x0d4f
        L_0x0ca7:
            boolean r1 = A02(r0)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            if (r1 != 0) goto L_0x0cb5
            X.NkA r0 = X.C69370NkA.A0D     // Catch:{ IllegalArgumentException -> 0x0d42 }
        L_0x0caf:
            java.lang.String r3 = X.OZH.A00(r0)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            goto L_0x0d4f
        L_0x0cb5:
            java.lang.String r11 = r0.A06     // Catch:{ IllegalArgumentException -> 0x0d42 }
            int r1 = r11.length()     // Catch:{ IllegalArgumentException -> 0x0d42 }
            if (r1 != 0) goto L_0x0cc3
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ IllegalArgumentException -> 0x0d42 }
            r6.<init>()     // Catch:{ IllegalArgumentException -> 0x0d42 }
            goto L_0x0d22
        L_0x0cc3:
            X.0Tu r1 = X.0Tu.A05     // Catch:{ IllegalArgumentException -> 0x0d42 }
            r6 = 36328332333235443(0x81106d00013cf3, double:3.037521877766398E-306)
            boolean r1 = X.182.A06(r1, r0, r6)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            if (r1 == 0) goto L_0x0cea
            com.google.common.util.concurrent.SettableFuture r3 = new com.google.common.util.concurrent.SettableFuture     // Catch:{ IllegalArgumentException -> 0x0d42 }
            r3.<init>()     // Catch:{ IllegalArgumentException -> 0x0d42 }
            X.PEr r1 = new X.PEr     // Catch:{ IllegalArgumentException -> 0x0d42 }
            r1.<init>(r3)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            X.O07.A00(r0, r1)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            r6 = 15
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ Exception -> 0x0ce8 }
            java.lang.Object r6 = r3.get(r6, r1)     // Catch:{ Exception -> 0x0ce8 }
            org.json.JSONArray r6 = (org.json.JSONArray) r6     // Catch:{ Exception -> 0x0ce8 }
            goto L_0x0d22
        L_0x0ce8:
            r6 = 0
            goto L_0x0d22
        L_0x0cea:
            com.google.common.util.concurrent.SettableFuture r10 = new com.google.common.util.concurrent.SettableFuture     // Catch:{ IllegalArgumentException -> 0x0d42 }
            r10.<init>()     // Catch:{ IllegalArgumentException -> 0x0d42 }
            r1 = 6
            X.EDL r3 = new X.EDL     // Catch:{ IllegalArgumentException -> 0x0d42 }
            r3.<init>(r10, r0, r11, r1)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            java.lang.String r1 = "stella_share_sheet"
            java.util.List r23 = X.AnonymousClass7TE.A1I(r1)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            r20 = r0
            r21 = r2
            r22 = r2
            r24 = r2
            r25 = r19
            X.1OC r1 = X.C290985gK.A01(r20, r21, r22, r23, r24, r25)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            r1.A00 = r3     // Catch:{ IllegalArgumentException -> 0x0d42 }
            X.1ES.A03(r1)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            r6 = 15
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ Exception -> 0x0d19 }
            java.lang.Object r6 = r10.get(r6, r1)     // Catch:{ Exception -> 0x0d19 }
            org.json.JSONArray r6 = (org.json.JSONArray) r6     // Catch:{ Exception -> 0x0d19 }
            goto L_0x0d22
        L_0x0d19:
            r6 = move-exception
            java.lang.String r3 = "InstagramContactHelper"
            java.lang.String r1 = "Failed to get contacts from server"
            X.0KC.A0F(r3, r1, r6)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            r6 = 0
        L_0x0d22:
            if (r6 == 0) goto L_0x0d25
            goto L_0x0d28
        L_0x0d25:
            X.NkA r0 = X.C69370NkA.UNKNOWN     // Catch:{ IllegalArgumentException -> 0x0d42 }
            goto L_0x0caf
        L_0x0d28:
            X.Orv r3 = X.OYS.A00     // Catch:{ IllegalArgumentException -> 0x0d42 }
            java.lang.String r1 = "OTHERS"
            X.C70883OQa.A00(r2, r3, r0, r9, r1)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            org.json.JSONObject r1 = X.DbS.A11()     // Catch:{ IllegalArgumentException -> 0x0d42 }
            A01(r6, r1)     // Catch:{ JSONException -> 0x0d37 }
            goto L_0x0d3b
        L_0x0d37:
            r0 = move-exception
            X.C66583MXo.A1U(r0)     // Catch:{ IllegalArgumentException -> 0x0d42 }
        L_0x0d3b:
            java.lang.String r3 = X.DbT.A10(r1)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            goto L_0x0d4f
        L_0x0d40:
            monitor-exit(r15)     // Catch:{ IllegalArgumentException -> 0x0d42 }
            goto L_0x0d4f
        L_0x0d42:
            java.lang.String r1 = r8.A00     // Catch:{ JSONException -> 0x0d56, Exception -> 0x0d7e }
            java.lang.String r0 = "not_supported"
            r5.A07(r0, r1, r4)     // Catch:{ JSONException -> 0x0d56, Exception -> 0x0d7e }
            X.NkA r0 = X.C69370NkA.A0D     // Catch:{ JSONException -> 0x0d56, Exception -> 0x0d7e }
            java.lang.String r3 = X.OZH.A00(r0)     // Catch:{ JSONException -> 0x0d56, Exception -> 0x0d7e }
        L_0x0d4f:
            short r0 = r5.A00     // Catch:{ JSONException -> 0x0d56, Exception -> 0x0d7e }
        L_0x0d51:
            r5.A06(r0)     // Catch:{ JSONException -> 0x0d56, Exception -> 0x0d7e }
            goto L_0x004f
        L_0x0d56:
            r2 = move-exception
            java.lang.String r1 = "StellaRequestHandler"
            java.lang.String r0 = "Operation failed"
            X.0KC.A0F(r1, r0, r2)
            java.lang.String r3 = "JSONException "
            java.lang.String r2 = r2.getMessage()
            r1 = r18
            r0 = r17
            java.lang.String r1 = X.002.A0u(r3, r2, r1, r0)
            java.lang.String r0 = "invalid_request_json"
            r5.A07(r0, r1, r4)
            r0 = 3376(0xd30, float:4.731E-42)
            r5.A06(r0)
            X.NkA r0 = X.C69370NkA.REQUEST_JSON_PARSE_FAILED
            java.lang.String r3 = X.OZH.A00(r0)
            goto L_0x004f
        L_0x0d7e:
            r3 = move-exception
            java.lang.String r1 = "StellaRequestHandler"
            java.lang.String r0 = "Unhandled exception"
            X.0KC.A0J(r1, r0, r3)
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Encountered exception "
            r1.append(r0)
            r1.append(r3)
            r0 = r18
            r1.append(r0)
            r0 = r17
            java.lang.String r2 = X.AnonymousClass7TF.A0l(r0, r1)
            java.lang.String r1 = "failed_ipc_request_processing"
            r0 = r19
            r5.A07(r1, r2, r0)
            r0 = 3
            r5.A06(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.stella.StellaDirectMessagingService$binder$1.EHH(java.lang.String):java.lang.String");
    }

    public final IBinder asBinder() {
        AnonymousClass0fD.A0A(-1384374591, AnonymousClass0fD.A03(833994989));
        return this;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [com.instagram.direct.stella.api.ISendDirectMessageCallback$Stub$Proxy, java.lang.Object] */
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        ISendDirectMessageCallback iSendDirectMessageCallback;
        int A03 = AnonymousClass0fD.A03(1236982173);
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("com.instagram.direct.stella.api.IStellaDirectMessagingService");
                if (i == 1) {
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder == null) {
                        iSendDirectMessageCallback = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.instagram.direct.stella.api.ISendDirectMessageCallback");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof ISendDirectMessageCallback)) {
                            ? obj = new Object();
                            int A032 = AnonymousClass0fD.A03(-1184040099);
                            obj.A00 = readStrongBinder;
                            AnonymousClass0fD.A0A(1877711693, A032);
                            iSendDirectMessageCallback = obj;
                        } else {
                            iSendDirectMessageCallback = (ISendDirectMessageCallback) queryLocalInterface;
                        }
                    }
                    EBT(iSendDirectMessageCallback);
                    parcel2.writeNoException();
                } else if (i == 2) {
                    String EHH = EHH(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(EHH);
                }
                i3 = 1749529690;
            } else if (i == 1598968902) {
                parcel2.writeString("com.instagram.direct.stella.api.IStellaDirectMessagingService");
                i3 = -2122839959;
            }
            AnonymousClass0fD.A0A(i3, A03);
            return true;
        }
        boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
        AnonymousClass0fD.A0A(141195160, A03);
        return onTransact;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public StellaDirectMessagingService$binder$1(StellaDirectMessagingService stellaDirectMessagingService) {
        this();
        this.A00 = stellaDirectMessagingService;
        AnonymousClass0fD.A0A(85231848, AnonymousClass0fD.A03(-1135217224));
    }
}
