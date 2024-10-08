package com.facebook.rti.push.service;

import X.002;
import X.00f;
import X.0KC;
import X.0Sy;
import X.0qQ;
import X.AnonymousClass000;
import X.AnonymousClass05K;
import X.AnonymousClass3RD;
import X.AnonymousClass3RX;
import X.AnonymousClass3RY;
import X.AnonymousClass45I;
import X.AnonymousClass45J;
import X.C10413Rrp;
import X.C10793RyF;
import X.C10983S3t;
import X.C11004S4y;
import X.C12232Spm;
import X.C12256SqA;
import X.C12264SqI;
import X.C12267SqM;
import X.C12269SqO;
import X.C13578Td3;
import X.C13849TiS;
import X.C241823Ri;
import X.C241833Rj;
import X.C241873Rq;
import X.C241883Rr;
import X.C241893Rt;
import X.C241903Rv;
import X.C282425Da;
import X.C66579MXk;
import X.C71774Oqa;
import X.C7860Qbk;
import X.C7861Qbl;
import X.C7876Qc0;
import X.C8947RGw;
import X.C9555Rcs;
import X.C9558Rcv;
import X.Pxd;
import X.RQH;
import X.S3T;
import X.S9L;
import X.SER;
import X.SFM;
import X.SHZ;
import X.SP2;
import X.SRO;
import X.SRS;
import X.ST2;
import X.T9D;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.IBinder;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.push.fbns.ipc.IFbnsAIDLService;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.facebook.rti.mqtt.manager.MqttPushServiceDelegate;
import com.instagram.realtimeclient.RealtimeConstants;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

public class FbnsServiceDelegate extends MqttPushServiceDelegate {
    public static FbnsServiceDelegate A0D;
    public static final List A0E = new C241883Rr();
    public static final List A0F = new C241893Rt();
    public static final Map A0G;
    public IFbnsAIDLService.Stub A00;
    public C241903Rv A01;
    public C11004S4y A02;
    public C12232Spm A03;
    public SP2 A04;
    public S3T A05;
    public SER A06;
    public RQH A07;
    public SRS A08;
    public C10983S3t A09;
    public String A0A;
    public final C13578Td3 A0B;
    public final SFM A0C;

    /* JADX WARNING: Removed duplicated region for block: B:168:0x053e A[Catch:{ JSONException -> 0x0778 }] */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x05a6 A[Catch:{ JSONException -> 0x0778 }] */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0765 A[Catch:{ JSONException -> 0x0778 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0R(X.SBU r48, java.lang.Long r49, java.lang.String r50, byte[] r51, int r52, long r53) {
        /*
            r47 = this;
            r12 = 0
            r8 = 1
            r15 = r50
            r1 = r51
            if (r51 != 0) goto L_0x0014
            java.lang.String r2 = "FbnsServiceDelegate"
            java.lang.Object[] r1 = new java.lang.Object[]{r15}
            java.lang.String r0 = "receive/publish/empty_payload; topic=%s"
            X.0KC.A0O(r2, r0, r1)
        L_0x0013:
            return
        L_0x0014:
            java.lang.String r9 = "FbnsServiceDelegate"
            r18 = 0
            r3 = r47
            java.lang.String r0 = "UTF-8"
            java.lang.String r2 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0770 }
            r2.<init>(r1, r0)     // Catch:{ UnsupportedEncodingException -> 0x0770 }
            r18 = r2
            java.lang.String r0 = "/fbns_msg"
            boolean r0 = r0.equals(r15)     // Catch:{ JSONException -> 0x0778 }
            if (r0 != 0) goto L_0x0208
            r0 = 459(0x1cb, float:6.43E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)     // Catch:{ JSONException -> 0x0778 }
            boolean r0 = r0.equals(r15)     // Catch:{ JSONException -> 0x0778 }
            if (r0 != 0) goto L_0x0208
            java.lang.String r0 = "/fbns_reg_resp"
            boolean r0 = r0.equals(r15)     // Catch:{ JSONException -> 0x0778 }
            if (r0 == 0) goto L_0x008b
            X.CuW r4 = new X.CuW     // Catch:{ JSONException -> 0x0778 }
            r4.<init>()     // Catch:{ JSONException -> 0x0778 }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0778 }
            r1.<init>(r2)     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r0 = "pkg_name"
            java.lang.String r0 = r1.optString(r0)     // Catch:{ JSONException -> 0x0778 }
            r4.A01 = r0     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r0 = "token"
            java.lang.String r0 = r1.optString(r0)     // Catch:{ JSONException -> 0x0778 }
            r4.A02 = r0     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r0 = "error"
            java.lang.String r0 = r1.optString(r0)     // Catch:{ JSONException -> 0x0778 }
            r4.A00 = r0     // Catch:{ JSONException -> 0x0778 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ JSONException -> 0x0778 }
            if (r0 == 0) goto L_0x019a
            java.lang.String r0 = r4.A01     // Catch:{ JSONException -> 0x0778 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r1 = "resp_fail"
            if (r0 == 0) goto L_0x00b1
            java.lang.String r0 = "service/register/response/invalid"
            X.0KC.A0C(r9, r0)     // Catch:{ JSONException -> 0x0778 }
            X.S3t r2 = r3.A09     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r0 = "invalid_package_name"
            r2.A00(r1, r0)     // Catch:{ JSONException -> 0x0778 }
            java.util.Map r8 = java.util.Collections.emptyMap()     // Catch:{ JSONException -> 0x0778 }
            r6 = 0
            java.lang.String r5 = ""
            java.lang.String r7 = "server response with invalid package name"
            r4 = r1
            A02(r3, r4, r5, r6, r7, r8)     // Catch:{ JSONException -> 0x0778 }
            goto L_0x00b0
        L_0x008b:
            java.lang.String r0 = "/pp"
            boolean r0 = r0.equals(r15)     // Catch:{ JSONException -> 0x0778 }
            if (r0 != 0) goto L_0x0013
            java.lang.String r1 = "receive/publish/wrong_topic; topic=%s"
            java.lang.Object[] r0 = new java.lang.Object[]{r15}     // Catch:{ JSONException -> 0x0778 }
            X.0KC.A0O(r9, r1, r0)     // Catch:{ JSONException -> 0x0778 }
            X.S3t r2 = r3.A09     // Catch:{ JSONException -> 0x0778 }
            java.lang.Integer r1 = X.AnonymousClass05K.A01     // Catch:{ JSONException -> 0x0778 }
            r0 = 587(0x24b, float:8.23E-43)
            java.lang.String r0 = X.Pxd.A00(r0)     // Catch:{ JSONException -> 0x0778 }
            r2.A00(r0, r15)     // Catch:{ JSONException -> 0x0778 }
            X.S4y r0 = r3.A02     // Catch:{ JSONException -> 0x0778 }
            r0.A00(r1, r15)     // Catch:{ JSONException -> 0x0778 }
            goto L_0x0207
        L_0x00b0:
            return
        L_0x00b1:
            java.lang.String r0 = r4.A02     // Catch:{ JSONException -> 0x0778 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ JSONException -> 0x0778 }
            if (r0 == 0) goto L_0x00d8
            java.lang.String r0 = "service/register/response/empty_token"
            X.0KC.A0C(r9, r0)     // Catch:{ JSONException -> 0x0778 }
            X.S3t r2 = r3.A09     // Catch:{ JSONException -> 0x0778 }
            r0 = 1300(0x514, float:1.822E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ JSONException -> 0x0778 }
            r2.A00(r1, r0)     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r0 = r4.A01     // Catch:{ JSONException -> 0x0778 }
            java.util.Map r8 = java.util.Collections.emptyMap()     // Catch:{ JSONException -> 0x0778 }
            r6 = 0
            java.lang.String r7 = "server response with invalid token"
            r4 = r1
            r5 = r0
            A02(r3, r4, r5, r6, r7, r8)     // Catch:{ JSONException -> 0x0778 }
            return
        L_0x00d8:
            X.SRS r5 = r3.A08     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r6 = r4.A01     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r8 = r4.A02     // Catch:{ JSONException -> 0x0778 }
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ JSONException -> 0x0778 }
            r0 = r0 ^ 1
            X.S9L.A00(r0)     // Catch:{ JSONException -> 0x0778 }
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch:{ JSONException -> 0x0778 }
            r0 = r0 ^ 1
            X.S9L.A00(r0)     // Catch:{ JSONException -> 0x0778 }
            X.45J r0 = X.SRS.A00(r5)     // Catch:{ JSONException -> 0x0778 }
            X.TiS r1 = r0.AR1()     // Catch:{ JSONException -> 0x0778 }
            r0 = 647(0x287, float:9.07E-43)
            java.lang.String r0 = X.Pxd.A00(r0)     // Catch:{ JSONException -> 0x0778 }
            r1.ED1(r0)     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r2 = "RegistrationState"
            java.lang.String r0 = "PreferencesManager failed to clear auth failed register time."
            r1.AIR(r2, r0)     // Catch:{ JSONException -> 0x0778 }
            X.45J r7 = X.SRS.A01(r5)     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r1 = ""
            r0 = r7
            X.45I r0 = (X.AnonymousClass45I) r0     // Catch:{ JSONException -> 0x0778 }
            X.0qQ.A0B(r6, r12)     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r1 = r0.getString(r6, r1)     // Catch:{ JSONException -> 0x0778 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x0778 }
            if (r0 == 0) goto L_0x0137
            java.lang.String r0 = "Missing entry"
            X.0KC.A0C(r2, r0)     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r0 = "service/register/response/cache_update_failed"
            X.0KC.A0C(r9, r0)     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r0 = r4.A01     // Catch:{ JSONException -> 0x0778 }
            java.util.Map r8 = java.util.Collections.emptyMap()     // Catch:{ JSONException -> 0x0778 }
            r6 = 0
            java.lang.String r4 = "cache_update_fail"
            r5 = r0
            r7 = r6
            A02(r3, r4, r5, r6, r7, r8)     // Catch:{ JSONException -> 0x0778 }
            return
        L_0x0137:
            X.SHZ r5 = X.SHZ.A00(r1)     // Catch:{ JSONException -> 0x017b }
            r5.A03 = r8     // Catch:{ JSONException -> 0x017b }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x017b }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ JSONException -> 0x017b }
            r5.A00 = r0     // Catch:{ JSONException -> 0x017b }
            boolean r0 = X.SRS.A02(r7, r5, r6)     // Catch:{ JSONException -> 0x017b }
            if (r0 == 0) goto L_0x016a
            java.lang.String r5 = r4.A01     // Catch:{ JSONException -> 0x017b }
            java.lang.String r1 = r4.A02     // Catch:{ JSONException -> 0x017b }
            java.lang.String r0 = "unknown"
            A01(r3, r5, r1, r0)     // Catch:{ JSONException -> 0x017b }
            java.lang.String r0 = r4.A01     // Catch:{ JSONException -> 0x017b }
            java.util.Map r24 = java.util.Collections.emptyMap()     // Catch:{ JSONException -> 0x017b }
            r22 = 0
            java.lang.String r20 = "resp_success"
        L_0x0160:
            r19 = r3
            r21 = r0
            r23 = r22
            A02(r19, r20, r21, r22, r23, r24)     // Catch:{ JSONException -> 0x017b }
            goto L_0x017a
        L_0x016a:
            java.lang.String r0 = "service/register/response/cache_update_failed"
            X.0KC.A0C(r9, r0)     // Catch:{ JSONException -> 0x017b }
            java.lang.String r0 = r4.A01     // Catch:{ JSONException -> 0x017b }
            java.util.Map r24 = java.util.Collections.emptyMap()     // Catch:{ JSONException -> 0x017b }
            r22 = 0
            java.lang.String r20 = "cache_update_fail"
            goto L_0x0160
        L_0x017a:
            return
        L_0x017b:
            r1 = move-exception
            java.lang.String r0 = "Parse failed"
            X.0KC.A0G(r2, r0, r1)     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r0 = "Missing entry"
            X.0KC.A0C(r2, r0)     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r0 = "service/register/response/cache_update_failed"
            X.0KC.A0C(r9, r0)     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r0 = r4.A01     // Catch:{ JSONException -> 0x0778 }
            java.util.Map r8 = java.util.Collections.emptyMap()     // Catch:{ JSONException -> 0x0778 }
            r6 = 0
            java.lang.String r4 = "cache_update_fail"
            r5 = r0
            r7 = r6
            A02(r3, r4, r5, r6, r7, r8)     // Catch:{ JSONException -> 0x0778 }
            return
        L_0x019a:
            java.lang.String r0 = r4.A01     // Catch:{ JSONException -> 0x0778 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ JSONException -> 0x0778 }
            if (r0 == 0) goto L_0x01b9
            java.lang.String r0 = "service/register/response/empty_package"
            X.0KC.A0C(r9, r0)     // Catch:{ JSONException -> 0x0778 }
        L_0x01a7:
            java.lang.String r1 = r4.A01     // Catch:{ JSONException -> 0x0778 }
            java.util.Map r8 = java.util.Collections.emptyMap()     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r0 = r4.A00     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r4 = "resp_fail"
            java.lang.String r6 = ""
            r5 = r1
            r7 = r0
            A02(r3, r4, r5, r6, r7, r8)     // Catch:{ JSONException -> 0x0778 }
            goto L_0x0206
        L_0x01b9:
            X.SRS r1 = r3.A08     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r7 = r4.A01     // Catch:{ JSONException -> 0x0778 }
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch:{ JSONException -> 0x0778 }
            r0 = r0 ^ 1
            X.S9L.A00(r0)     // Catch:{ JSONException -> 0x0778 }
            X.45J r6 = X.SRS.A01(r1)     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r5 = ""
            r0 = r6
            X.45I r0 = (X.AnonymousClass45I) r0     // Catch:{ JSONException -> 0x0778 }
            X.0qQ.A0B(r7, r12)     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r1 = r0.getString(r7, r5)     // Catch:{ JSONException -> 0x0778 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x0778 }
            if (r0 == 0) goto L_0x01e4
            java.lang.String r1 = "RegistrationState"
            java.lang.String r0 = "Missing entry"
            X.0KC.A0C(r1, r0)     // Catch:{ JSONException -> 0x0778 }
            goto L_0x01a7
        L_0x01e4:
            X.SHZ r2 = X.SHZ.A00(r1)     // Catch:{ JSONException -> 0x01f8 }
            r2.A03 = r5     // Catch:{ JSONException -> 0x01f8 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x01f8 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ JSONException -> 0x01f8 }
            r2.A00 = r0     // Catch:{ JSONException -> 0x01f8 }
            X.SRS.A02(r6, r2, r7)     // Catch:{ JSONException -> 0x01f8 }
            goto L_0x01a7
        L_0x01f8:
            r2 = move-exception
            java.lang.String r1 = "RegistrationState"
            java.lang.String r0 = "Parse failed"
            X.0KC.A0G(r1, r0, r2)     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r0 = "Missing entry"
            X.0KC.A0C(r1, r0)     // Catch:{ JSONException -> 0x0778 }
            goto L_0x01a7
        L_0x0206:
            return
        L_0x0207:
            return
        L_0x0208:
            java.lang.String r33 = ""
            X.Qbk r4 = X.C7860Qbk.A00     // Catch:{ JSONException -> 0x0778 }
            java.lang.Integer r30 = X.AnonymousClass05K.A00     // Catch:{ JSONException -> 0x0778 }
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0778 }
            r10.<init>(r2)     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r29 = "pim"
            r0 = r29
            java.lang.String r28 = r10.optString(r0)     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r27 = "token"
            r0 = r27
            java.lang.String r26 = r10.optString(r0)     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r0 = "ck"
            r10.optString(r0)     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r0 = "pn"
            java.lang.String r2 = r10.optString(r0)     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r0 = "cp"
            java.lang.String r25 = r10.optString(r0)     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r0 = "fbpushnotif"
            java.lang.String r24 = r10.optString(r0)     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r0 = "nid"
            java.lang.String r5 = r10.optString(r0)     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r0 = "bu"
            r10.optString(r0)     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r7 = "l"
            boolean r0 = r10.has(r7)     // Catch:{ JSONException -> 0x0778 }
            if (r0 == 0) goto L_0x027a
            boolean r0 = r10.isNull(r7)     // Catch:{ JSONException -> 0x0778 }
            if (r0 != 0) goto L_0x027a
            boolean r0 = r10.getBoolean(r7)     // Catch:{ JSONException -> 0x0778 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ JSONException -> 0x0778 }
            r0.getClass()     // Catch:{ JSONException -> 0x0778 }
            X.Qbl r6 = new X.Qbl     // Catch:{ JSONException -> 0x0778 }
            r6.<init>(r0)     // Catch:{ JSONException -> 0x0778 }
        L_0x0263:
            java.lang.String r0 = "qt"
            long r16 = r10.optLong(r0)     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r0 = "j"
            java.lang.String r38 = r10.optString(r0)     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r0 = "at"
            r23 = 0
            int r1 = r10.optInt(r0, r12)     // Catch:{ JSONException -> 0x0778 }
            if (r1 == r8) goto L_0x0282
            goto L_0x027c
        L_0x027a:
            r6 = r4
            goto L_0x0263
        L_0x027c:
            r0 = 2
            if (r1 == r0) goto L_0x0285
            r22 = r30
            goto L_0x0287
        L_0x0282:
            java.lang.Integer r22 = X.AnonymousClass05K.A01     // Catch:{ JSONException -> 0x0778 }
            goto L_0x0287
        L_0x0285:
            java.lang.Integer r22 = X.AnonymousClass05K.A0C     // Catch:{ JSONException -> 0x0778 }
        L_0x0287:
            java.lang.String r1 = "s"
            java.lang.String r0 = "MQTT"
            java.lang.String r21 = r10.optString(r1, r0)     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r0 = "mt"
            boolean r1 = r10.has(r0)     // Catch:{ JSONException -> 0x0778 }
            if (r1 == 0) goto L_0x02ed
            long r0 = r10.getLong(r0)     // Catch:{ JSONException -> 0x0778 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ JSONException -> 0x0778 }
            r1.getClass()     // Catch:{ JSONException -> 0x0778 }
            X.Qbl r20 = new X.Qbl     // Catch:{ JSONException -> 0x0778 }
            r0 = r20
            r0.<init>(r1)     // Catch:{ JSONException -> 0x0778 }
        L_0x02a9:
            java.lang.String r0 = "ttl"
            boolean r1 = r10.has(r0)     // Catch:{ JSONException -> 0x0778 }
            if (r1 == 0) goto L_0x02ea
            long r0 = r10.getLong(r0)     // Catch:{ JSONException -> 0x0778 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ JSONException -> 0x0778 }
            r1.getClass()     // Catch:{ JSONException -> 0x0778 }
            X.Qbl r19 = new X.Qbl     // Catch:{ JSONException -> 0x0778 }
            r0 = r19
            r0.<init>(r1)     // Catch:{ JSONException -> 0x0778 }
        L_0x02c3:
            java.lang.String r0 = "st"
            boolean r1 = r10.has(r0)     // Catch:{ JSONException -> 0x0778 }
            if (r1 == 0) goto L_0x02d5
            boolean r1 = r10.isNull(r0)     // Catch:{ JSONException -> 0x0778 }
            if (r1 != 0) goto L_0x02d5
            boolean r23 = r10.optBoolean(r0)     // Catch:{ JSONException -> 0x0778 }
        L_0x02d5:
            X.RQH r10 = r3.A07     // Catch:{ JSONException -> 0x0778 }
            boolean r0 = r6 instanceof X.C7860Qbk     // Catch:{ JSONException -> 0x0778 }
            if (r0 == 0) goto L_0x0388
            java.util.concurrent.CountDownLatch r11 = new java.util.concurrent.CountDownLatch     // Catch:{ JSONException -> 0x0778 }
            r11.<init>(r8)     // Catch:{ JSONException -> 0x0778 }
            X.3RY[] r0 = X.AnonymousClass3RY.A02     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r6 = "LOG_SR"
            java.lang.String r1 = "/"
            r0 = r2
            if (r2 != 0) goto L_0x02f2
            goto L_0x02f0
        L_0x02ea:
            r19 = r4
            goto L_0x02c3
        L_0x02ed:
            r20 = r4
            goto L_0x02a9
        L_0x02f0:
            r0 = r33
        L_0x02f2:
            java.lang.String r1 = X.002.A0g(r6, r1, r0)     // Catch:{ JSONException -> 0x0778 }
            java.util.concurrent.atomic.AtomicInteger r13 = new java.util.concurrent.atomic.AtomicInteger     // Catch:{ JSONException -> 0x0778 }
            r13.<init>(r12)     // Catch:{ JSONException -> 0x0778 }
            X.45J r0 = r10.A00     // Catch:{ JSONException -> 0x0778 }
            X.45I r0 = (X.AnonymousClass45I) r0     // Catch:{ JSONException -> 0x0778 }
            X.0qQ.A0B(r1, r12)     // Catch:{ JSONException -> 0x0778 }
            boolean r14 = r0.contains(r1)     // Catch:{ JSONException -> 0x0778 }
            X.45J r0 = r10.A00     // Catch:{ JSONException -> 0x0778 }
            if (r14 != 0) goto L_0x030b
            r1 = r6
        L_0x030b:
            X.45I r0 = (X.AnonymousClass45I) r0     // Catch:{ JSONException -> 0x0778 }
            int r0 = r0.getInt(r1, r12)     // Catch:{ JSONException -> 0x0778 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ JSONException -> 0x0778 }
            int r0 = r0.intValue()     // Catch:{ JSONException -> 0x0778 }
            r13.set(r0)     // Catch:{ JSONException -> 0x0778 }
            r11.countDown()     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r14 = "Waiting for sampleRate was interrupted"
            r0 = 5
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0329 }
            r11.await(r0, r6)     // Catch:{ InterruptedException -> 0x0329 }
            goto L_0x032f
        L_0x0329:
            r11 = move-exception
            java.lang.String r6 = "NotificationLifecycleEventsSampler"
            X.0KC.A0F(r6, r14, r11)     // Catch:{ JSONException -> 0x0778 }
        L_0x032f:
            int r14 = r13.get()     // Catch:{ JSONException -> 0x0778 }
            java.util.concurrent.CountDownLatch r13 = new java.util.concurrent.CountDownLatch     // Catch:{ JSONException -> 0x0778 }
            r13.<init>(r8)     // Catch:{ JSONException -> 0x0778 }
            java.util.concurrent.atomic.AtomicBoolean r11 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ JSONException -> 0x0778 }
            r11.<init>(r12)     // Catch:{ JSONException -> 0x0778 }
            X.45J r10 = r10.A00     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r6 = "is_employee"
            X.45I r10 = (X.AnonymousClass45I) r10     // Catch:{ JSONException -> 0x0778 }
            boolean r6 = r10.getBoolean(r6, r12)     // Catch:{ JSONException -> 0x0778 }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch:{ JSONException -> 0x0778 }
            boolean r6 = r6.booleanValue()     // Catch:{ JSONException -> 0x0778 }
            r11.set(r6)     // Catch:{ JSONException -> 0x0778 }
            r13.countDown()     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r10 = "Waiting for isEmployee was interrupted"
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x035d }
            r13.await(r0, r6)     // Catch:{ InterruptedException -> 0x035d }
            goto L_0x0363
        L_0x035d:
            r1 = move-exception
            java.lang.String r0 = "NotificationLifecycleEventsSampler"
            X.0KC.A0F(r0, r10, r1)     // Catch:{ JSONException -> 0x0778 }
        L_0x0363:
            boolean r10 = r11.get()     // Catch:{ JSONException -> 0x0778 }
            java.util.Random r1 = new java.util.Random     // Catch:{ JSONException -> 0x0778 }
            r1.<init>()     // Catch:{ JSONException -> 0x0778 }
            r0 = 10000(0x2710, float:1.4013E-41)
            int r1 = r1.nextInt(r0)     // Catch:{ JSONException -> 0x0778 }
            r6 = 1
            r0 = 0
            if (r1 >= r14) goto L_0x0377
            r0 = 1
        L_0x0377:
            if (r10 != 0) goto L_0x037c
            if (r0 != 0) goto L_0x037c
            r6 = 0
        L_0x037c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)     // Catch:{ JSONException -> 0x0778 }
            r0.getClass()     // Catch:{ JSONException -> 0x0778 }
            X.Qbl r6 = new X.Qbl     // Catch:{ JSONException -> 0x0778 }
            r6.<init>(r0)     // Catch:{ JSONException -> 0x0778 }
        L_0x0388:
            r0 = 0
            int r10 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r10 == 0) goto L_0x03b3
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x0778 }
            long r11 = r11 - r16
            int r10 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r10 < 0) goto L_0x0399
            r0 = r11
        L_0x0399:
            X.S3t r12 = r3.A09     // Catch:{ JSONException -> 0x0778 }
            X.00f r10 = r3.A01     // Catch:{ JSONException -> 0x0778 }
            android.content.Context r10 = r10.getApplicationContext()     // Catch:{ JSONException -> 0x0778 }
            X.0qQ.A07(r10)     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r11 = r10.getPackageName()     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r10 = "receive"
            java.lang.String[] r11 = new java.lang.String[]{r10, r11, r2}     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r10 = "fbns_e2e_latency"
            r12.A01(r10, r11, r0)     // Catch:{ JSONException -> 0x0778 }
        L_0x03b3:
            X.Spm r11 = r3.A03     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r12 = "===Received Notif: target = "
            java.lang.String r10 = "; notifId = "
            java.lang.String r10 = X.002.A0u(r12, r2, r10, r5)     // Catch:{ JSONException -> 0x0778 }
            r11.Cgi(r10)     // Catch:{ JSONException -> 0x0778 }
            java.util.HashMap r11 = new java.util.HashMap     // Catch:{ JSONException -> 0x0778 }
            r11.<init>()     // Catch:{ JSONException -> 0x0778 }
            boolean r10 = r6 instanceof X.C7860Qbk     // Catch:{ JSONException -> 0x0778 }
            if (r10 == 0) goto L_0x03cb
            r14 = 0
            goto L_0x03d7
        L_0x03cb:
            r14 = 1
            java.lang.Object r10 = r6.A01()     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ JSONException -> 0x0778 }
            r11.put(r7, r10)     // Catch:{ JSONException -> 0x0778 }
        L_0x03d7:
            java.lang.String r10 = "src"
            r12 = r21
            r11.put(r10, r12)     // Catch:{ JSONException -> 0x0778 }
            r13 = r26
            r12 = r24
            java.lang.String r12 = X.002.A0g(r12, r2, r13)     // Catch:{ JSONException -> 0x0778 }
            int r12 = r12.hashCode()     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r13 = java.lang.String.valueOf(r12)     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r12 = "hash"
            r11.put(r12, r13)     // Catch:{ JSONException -> 0x0778 }
            r43 = 0
            java.lang.String r40 = "receive"
            r39 = r3
            r41 = r5
            r42 = r2
            r44 = r11
            r45 = r0
            A03(r39, r40, r41, r42, r43, r44, r45)     // Catch:{ JSONException -> 0x0778 }
            X.SER r0 = r3.A06     // Catch:{ JSONException -> 0x0778 }
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch:{ JSONException -> 0x0778 }
            if (r1 != 0) goto L_0x0457
            android.util.Pair r11 = new android.util.Pair     // Catch:{ JSONException -> 0x0778 }
            r11.<init>(r5, r2)     // Catch:{ JSONException -> 0x0778 }
            java.util.LinkedList r1 = r0.A01     // Catch:{ JSONException -> 0x0778 }
            boolean r0 = r1.contains(r11)     // Catch:{ JSONException -> 0x0778 }
            if (r0 == 0) goto L_0x044c
            java.lang.Long r0 = java.lang.Long.valueOf(r16)     // Catch:{ JSONException -> 0x0778 }
            r0.getClass()     // Catch:{ JSONException -> 0x0778 }
            X.Spm r1 = r3.A03     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r0 = "Duplicated Notif: notifId = "
            java.lang.String r0 = X.002.A0R(r0, r5)     // Catch:{ JSONException -> 0x0778 }
            r1.Cgi(r0)     // Catch:{ JSONException -> 0x0778 }
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ JSONException -> 0x0778 }
            r1.<init>()     // Catch:{ JSONException -> 0x0778 }
            if (r14 == 0) goto L_0x043d
            java.lang.Object r0 = r6.A01()     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ JSONException -> 0x0778 }
            r1.put(r7, r0)     // Catch:{ JSONException -> 0x0778 }
        L_0x043d:
            r0 = r21
            r1.put(r10, r0)     // Catch:{ JSONException -> 0x0778 }
            r45 = 0
            java.lang.String r40 = "duplicate"
            r44 = r1
            A03(r39, r40, r41, r42, r43, r44, r45)     // Catch:{ JSONException -> 0x0778 }
            return
        L_0x044c:
            int r7 = r1.size()     // Catch:{ JSONException -> 0x0778 }
            r0 = 100
            if (r7 > r0) goto L_0x04b6
            r1.add(r11)     // Catch:{ JSONException -> 0x0778 }
        L_0x0457:
            X.SER r0 = r3.A06     // Catch:{ JSONException -> 0x0778 }
            java.util.LinkedList r10 = r0.A01     // Catch:{ JSONException -> 0x0778 }
            int r0 = r10.size()     // Catch:{ JSONException -> 0x0778 }
            r7 = 100
            if (r0 <= r7) goto L_0x04ad
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)     // Catch:{ JSONException -> 0x0778 }
            java.lang.Object[] r1 = new java.lang.Object[]{r0}     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r0 = "notifications %d size limit reached"
            X.0KC.A0P(r9, r0, r1)     // Catch:{ JSONException -> 0x0778 }
            java.lang.Object r0 = r10.removeFirst()     // Catch:{ JSONException -> 0x0778 }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ JSONException -> 0x0778 }
            if (r0 == 0) goto L_0x04ad
            X.SP2 r13 = r3.A04     // Catch:{ JSONException -> 0x0778 }
            java.lang.Object r12 = r0.first     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ JSONException -> 0x0778 }
            java.lang.Object r11 = r0.second     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ JSONException -> 0x0778 }
            java.lang.Integer r10 = X.AnonymousClass05K.A01     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r0 = "Oldest"
            X.Qbl r1 = new X.Qbl     // Catch:{ JSONException -> 0x0778 }
            r1.<init>(r0)     // Catch:{ JSONException -> 0x0778 }
            X.Rrp r0 = new X.Rrp     // Catch:{ JSONException -> 0x0778 }
            r0.<init>(r1, r10)     // Catch:{ JSONException -> 0x0778 }
            r13.A04(r0, r12, r11)     // Catch:{ JSONException -> 0x0778 }
            X.S3t r12 = r3.A09     // Catch:{ JSONException -> 0x0778 }
            X.00f r0 = r3.A01     // Catch:{ JSONException -> 0x0778 }
            android.content.Context r0 = r0.getApplicationContext()     // Catch:{ JSONException -> 0x0778 }
            X.0qQ.A07(r0)     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r0 = r0.getPackageName()     // Catch:{ JSONException -> 0x0778 }
            java.lang.String[] r11 = new java.lang.String[]{r0, r2}     // Catch:{ JSONException -> 0x0778 }
            r0 = 1
            java.lang.String r10 = "notifications_store_limit_reached"
            r12.A01(r10, r11, r0)     // Catch:{ JSONException -> 0x0778 }
        L_0x04ad:
            java.lang.String r0 = "message"
            int r1 = r22.intValue()     // Catch:{ JSONException -> 0x0778 }
            if (r1 == r8) goto L_0x04c2
            goto L_0x04bc
        L_0x04b6:
            java.lang.String r0 = "Limit reached: Ignore notification. Missing limitSize() call?"
            X.0KC.A0D(r9, r0)     // Catch:{ JSONException -> 0x0778 }
            goto L_0x0457
        L_0x04bc:
            r8 = 2
            if (r1 == r8) goto L_0x04c9
            java.lang.String r8 = "com.facebook.rti.fbns.intent.RECEIVE"
            goto L_0x04cf
        L_0x04c2:
            r1 = 681(0x2a9, float:9.54E-43)
            java.lang.String r8 = X.Pxd.A00(r1)     // Catch:{ JSONException -> 0x0778 }
            goto L_0x04cf
        L_0x04c9:
            r1 = 682(0x2aa, float:9.56E-43)
            java.lang.String r8 = X.Pxd.A00(r1)     // Catch:{ JSONException -> 0x0778 }
        L_0x04cf:
            android.content.Intent r1 = new android.content.Intent     // Catch:{ JSONException -> 0x0778 }
            r1.<init>(r8)     // Catch:{ JSONException -> 0x0778 }
            r1.setPackage(r2)     // Catch:{ JSONException -> 0x0778 }
            r1.addCategory(r2)     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r8 = "receive_type"
            r1.putExtra(r8, r0)     // Catch:{ JSONException -> 0x0778 }
            if (r24 == 0) goto L_0x04e8
            java.lang.String r8 = "data"
            r0 = r24
            r1.putExtra(r8, r0)     // Catch:{ JSONException -> 0x0778 }
        L_0x04e8:
            if (r28 == 0) goto L_0x04f1
            r8 = r29
            r0 = r28
            r1.putExtra(r8, r0)     // Catch:{ JSONException -> 0x0778 }
        L_0x04f1:
            boolean r0 = android.text.TextUtils.isEmpty(r26)     // Catch:{ JSONException -> 0x0778 }
            if (r0 != 0) goto L_0x04fe
            r8 = r27
            r0 = r26
            r1.putExtra(r8, r0)     // Catch:{ JSONException -> 0x0778 }
        L_0x04fe:
            boolean r0 = android.text.TextUtils.isEmpty(r25)     // Catch:{ JSONException -> 0x0778 }
            if (r0 != 0) goto L_0x050f
            r0 = 2171(0x87b, float:3.042E-42)
            java.lang.String r8 = X.C273654mx.A00(r0)     // Catch:{ JSONException -> 0x0778 }
            r0 = r25
            r1.putExtra(r8, r0)     // Catch:{ JSONException -> 0x0778 }
        L_0x050f:
            X.SP2 r0 = r3.A04     // Catch:{ JSONException -> 0x0778 }
            boolean r8 = android.text.TextUtils.isEmpty(r5)     // Catch:{ JSONException -> 0x0778 }
            if (r8 == 0) goto L_0x05b8
            com.facebook.rti.push.service.FbnsServiceDelegate r0 = r0.A05     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r34 = "null pnid"
            r31 = r0
            r32 = r6
            r35 = r43
            r36 = r43
            r37 = r21
            r31.A0Y(r32, r33, r34, r35, r36, r37)     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r0 = "Missing pnid"
            X.Qbl r4 = new X.Qbl     // Catch:{ JSONException -> 0x0778 }
            r4.<init>(r0)     // Catch:{ JSONException -> 0x0778 }
        L_0x052f:
            X.Rrp r7 = new X.Rrp     // Catch:{ JSONException -> 0x0778 }
            r0 = r30
            r7.<init>(r4, r0)     // Catch:{ JSONException -> 0x0778 }
        L_0x0536:
            java.lang.Integer r1 = r7.A01     // Catch:{ JSONException -> 0x0778 }
            boolean r0 = X.S9K.A01(r1)     // Catch:{ JSONException -> 0x0778 }
            if (r0 != 0) goto L_0x05a6
            int r0 = r1.intValue()     // Catch:{ JSONException -> 0x0778 }
            switch(r0) {
                case 1: goto L_0x057c;
                case 2: goto L_0x057f;
                case 3: goto L_0x0582;
                case 4: goto L_0x0585;
                case 5: goto L_0x0588;
                case 6: goto L_0x058b;
                case 7: goto L_0x058e;
                case 8: goto L_0x0591;
                case 9: goto L_0x0594;
                case 10: goto L_0x0597;
                case 11: goto L_0x059a;
                case 12: goto L_0x059d;
                case 13: goto L_0x05a0;
                case 14: goto L_0x05a3;
                default: goto L_0x0545;
            }     // Catch:{ JSONException -> 0x0778 }
        L_0x0545:
            java.lang.String r4 = "DATA_INVALID"
        L_0x0547:
            java.lang.String r1 = "Error: Delivery helper failed notifId = "
            java.lang.String r0 = "; reason = "
            java.lang.String r27 = X.002.A0u(r1, r5, r0, r4)     // Catch:{ JSONException -> 0x0778 }
            r22 = r3
            r23 = r6
            r24 = r2
            r25 = r4
            r26 = r5
            r28 = r21
            r22.A0Y(r23, r24, r25, r26, r27, r28)     // Catch:{ JSONException -> 0x0778 }
        L_0x055e:
            java.lang.Long r0 = java.lang.Long.valueOf(r16)     // Catch:{ JSONException -> 0x0778 }
            r0.getClass()     // Catch:{ JSONException -> 0x0778 }
            X.ST2 r0 = r3.A05     // Catch:{ JSONException -> 0x0778 }
            java.util.concurrent.ConcurrentMap r1 = r0.A02     // Catch:{ JSONException -> 0x0778 }
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong     // Catch:{ JSONException -> 0x0778 }
            r0.<init>()     // Catch:{ JSONException -> 0x0778 }
            r1.putIfAbsent(r2, r0)     // Catch:{ JSONException -> 0x0778 }
            java.lang.Object r0 = r1.get(r2)     // Catch:{ JSONException -> 0x0778 }
            java.util.concurrent.atomic.AtomicLong r0 = (java.util.concurrent.atomic.AtomicLong) r0     // Catch:{ JSONException -> 0x0778 }
            r0.incrementAndGet()     // Catch:{ JSONException -> 0x0778 }
            goto L_0x076c
        L_0x057c:
            java.lang.String r4 = "DATA_EXPIRED"
            goto L_0x0547
        L_0x057f:
            java.lang.String r4 = "NOTIF_ACKED"
            goto L_0x0547
        L_0x0582:
            java.lang.String r4 = "NOTIF_DUPED"
            goto L_0x0547
        L_0x0585:
            java.lang.String r4 = "BROADCAST_SENT"
            goto L_0x0547
        L_0x0588:
            java.lang.String r4 = "BROADCAST_FAILED"
            goto L_0x0547
        L_0x058b:
            java.lang.String r4 = "PACKAGE_FAILED"
            goto L_0x0547
        L_0x058e:
            java.lang.String r4 = "PACKAGE_INVALID"
            goto L_0x0547
        L_0x0591:
            java.lang.String r4 = "PACKAGE_UNSUPPORTED"
            goto L_0x0547
        L_0x0594:
            java.lang.String r4 = "PACKAGE_INCOMPATIBLE"
            goto L_0x0547
        L_0x0597:
            java.lang.String r4 = "PACKAGE_NOT_INSTALLED"
            goto L_0x0547
        L_0x059a:
            java.lang.String r4 = "PACKAGE_DISABLED"
            goto L_0x0547
        L_0x059d:
            java.lang.String r4 = "PACKAGE_NOT_TRUSTED"
            goto L_0x0547
        L_0x05a0:
            java.lang.String r4 = "PACKAGE_TRUSTED"
            goto L_0x0547
        L_0x05a3:
            java.lang.String r4 = "PROCESSOR_FAILED"
            goto L_0x0547
        L_0x05a6:
            X.S3t r6 = r3.A09     // Catch:{ JSONException -> 0x0778 }
            if (r6 == 0) goto L_0x055e
            java.lang.String r0 = "broadcast_sent"
            java.lang.String[] r5 = new java.lang.String[]{r0, r2}     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r4 = "notifications"
            r0 = 1
            r6.A01(r4, r5, r0)     // Catch:{ JSONException -> 0x0778 }
            goto L_0x055e
        L_0x05b8:
            java.lang.String r8 = r1.getPackage()     // Catch:{ JSONException -> 0x0778 }
            boolean r10 = android.text.TextUtils.isEmpty(r8)     // Catch:{ JSONException -> 0x0778 }
            if (r10 == 0) goto L_0x05e5
            java.lang.String r1 = "Error: invalid receiver = "
            java.lang.String r1 = X.002.A0R(r1, r8)     // Catch:{ JSONException -> 0x0778 }
            com.facebook.rti.push.service.FbnsServiceDelegate r0 = r0.A05     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r34 = "invalid dpn"
            r31 = r0
            r32 = r6
            r35 = r5
            r36 = r1
            r37 = r21
            r31.A0Y(r32, r33, r34, r35, r36, r37)     // Catch:{ JSONException -> 0x0778 }
            java.lang.Integer r30 = X.AnonymousClass05K.A15     // Catch:{ JSONException -> 0x0778 }
            r1.getClass()     // Catch:{ JSONException -> 0x0778 }
            X.Qbl r4 = new X.Qbl     // Catch:{ JSONException -> 0x0778 }
            r4.<init>(r1)     // Catch:{ JSONException -> 0x0778 }
            goto L_0x052f
        L_0x05e5:
            java.lang.Object r11 = X.AnonymousClass3RD.A00     // Catch:{ JSONException -> 0x0778 }
            X.3RX r11 = (X.AnonymousClass3RX) r11     // Catch:{ JSONException -> 0x0778 }
            X.3Rv r10 = r0.A03     // Catch:{ JSONException -> 0x0778 }
            X.5Da r10 = r11.A01(r1, r10)     // Catch:{ JSONException -> 0x0778 }
            r10.FMy()     // Catch:{ 3Rp -> 0x075a }
            android.content.Context r10 = r0.A02     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r11 = r10.getPackageName()     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r10 = "extra_notification_sender"
            r1.putExtra(r10, r11)     // Catch:{ JSONException -> 0x0778 }
            r10 = 34
            java.lang.String r10 = X.C66579MXk.A00(r10)     // Catch:{ JSONException -> 0x0778 }
            r1.putExtra(r10, r5)     // Catch:{ JSONException -> 0x0778 }
            if (r23 != 0) goto L_0x069a
            X.SQk r11 = r0.A03()     // Catch:{ IllegalStateException -> 0x0697 }
            r12 = 0
            int r10 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r10 != 0) goto L_0x0614
            r12 = r4
            goto L_0x0620
        L_0x0614:
            java.lang.Long r10 = java.lang.Long.valueOf(r16)     // Catch:{ IllegalStateException -> 0x0697 }
            r10.getClass()     // Catch:{ IllegalStateException -> 0x0697 }
            X.Qbl r12 = new X.Qbl     // Catch:{ IllegalStateException -> 0x0697 }
            r12.<init>(r10)     // Catch:{ IllegalStateException -> 0x0697 }
        L_0x0620:
            monitor-enter(r11)     // Catch:{ IllegalStateException -> 0x0697 }
            r1.getPackage()     // Catch:{ all -> 0x0694 }
            X.45J r10 = r11.A02     // Catch:{ all -> 0x0694 }
            boolean r13 = r10.contains(r5)     // Catch:{ all -> 0x0694 }
            if (r13 != 0) goto L_0x065e
            long r40 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0694 }
            X.SHs r31 = new X.SHs     // Catch:{ all -> 0x0694 }
            r32 = r1
            r33 = r6
            r34 = r12
            r35 = r20
            r36 = r19
            r37 = r5
            r39 = r21
            r42 = r40
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r40, r42)     // Catch:{ all -> 0x0694 }
            java.lang.String r12 = r31.A01()     // Catch:{ all -> 0x0694 }
            boolean r13 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x0694 }
            if (r13 != 0) goto L_0x0659
            X.TiS r10 = r10.AR1()     // Catch:{ all -> 0x0694 }
            r10.E5e(r5, r12)     // Catch:{ all -> 0x0694 }
            X.C11375SQk.A01(r10)     // Catch:{ all -> 0x0694 }
        L_0x0659:
            java.util.LinkedHashSet r10 = r11.A03     // Catch:{ all -> 0x0694 }
            r10.add(r5)     // Catch:{ all -> 0x0694 }
        L_0x065e:
            monitor-exit(r11)     // Catch:{ IllegalStateException -> 0x0697 }
            X.SQk r12 = r0.A03()     // Catch:{ IllegalStateException -> 0x0697 }
            monitor-enter(r12)     // Catch:{ IllegalStateException -> 0x0697 }
            java.util.LinkedHashSet r11 = r12.A03     // Catch:{ all -> 0x0691 }
            int r10 = r11.size()     // Catch:{ all -> 0x0691 }
            if (r10 <= r7) goto L_0x068e
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x0691 }
            boolean r7 = r11.hasNext()     // Catch:{ all -> 0x0691 }
            if (r7 == 0) goto L_0x068e
            java.lang.Object r10 = r11.next()     // Catch:{ all -> 0x0691 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0691 }
            r11.remove()     // Catch:{ all -> 0x0691 }
            X.C11375SQk.A00(r12, r10)     // Catch:{ all -> 0x0691 }
            X.45J r7 = r12.A02     // Catch:{ all -> 0x0691 }
            X.TiS r7 = r7.AR1()     // Catch:{ all -> 0x0691 }
            r7.ED1(r10)     // Catch:{ all -> 0x0691 }
            X.C11375SQk.A01(r7)     // Catch:{ all -> 0x0691 }
        L_0x068e:
            monitor-exit(r12)     // Catch:{ IllegalStateException -> 0x0697 }
            goto L_0x0721
        L_0x0691:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ IllegalStateException -> 0x0697 }
            goto L_0x0696
        L_0x0694:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ IllegalStateException -> 0x0697 }
        L_0x0696:
            throw r0     // Catch:{ IllegalStateException -> 0x0697 }
        L_0x0697:
            r1 = move-exception
            goto L_0x075f
        L_0x069a:
            com.facebook.rti.push.service.FbnsServiceDelegate r13 = r0.A05     // Catch:{ JSONException -> 0x0778 }
            r12 = r5
            if (r8 == 0) goto L_0x06a5
            r10 = 95
            java.lang.String r12 = X.002.A0T(r5, r8, r10)     // Catch:{ JSONException -> 0x0778 }
        L_0x06a5:
            r29 = 0
            int r10 = (r16 > r29 ? 1 : (r16 == r29 ? 0 : -1))
            if (r10 != 0) goto L_0x06ad
            r11 = r4
            goto L_0x06b9
        L_0x06ad:
            java.lang.Long r10 = java.lang.Long.valueOf(r16)     // Catch:{ JSONException -> 0x0778 }
            r10.getClass()     // Catch:{ JSONException -> 0x0778 }
            X.Qbl r11 = new X.Qbl     // Catch:{ JSONException -> 0x0778 }
            r11.<init>(r10)     // Catch:{ JSONException -> 0x0778 }
        L_0x06b9:
            X.RyF r10 = new X.RyF     // Catch:{ JSONException -> 0x0778 }
            r22 = r10
            r23 = r6
            r24 = r11
            r25 = r20
            r26 = r21
            r27 = r5
            r28 = r8
            r22.<init>(r23, r24, r25, r26, r27, r28, r29)     // Catch:{ JSONException -> 0x0778 }
            X.SER r11 = r13.A06     // Catch:{ JSONException -> 0x0778 }
            java.lang.Object r19 = X.SER.A02     // Catch:{ JSONException -> 0x0778 }
            monitor-enter(r19)     // Catch:{ JSONException -> 0x0778 }
            java.util.LinkedHashMap r11 = r11.A00     // Catch:{ all -> 0x076d }
            int r14 = r11.size()     // Catch:{ all -> 0x076d }
            if (r14 < r7) goto L_0x06f2
            java.util.Set r7 = r11.keySet()     // Catch:{ all -> 0x076d }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x076d }
            java.lang.Object r7 = r7.next()     // Catch:{ all -> 0x076d }
            java.lang.Object r7 = r11.remove(r7)     // Catch:{ all -> 0x076d }
            X.RyF r7 = (X.C10793RyF) r7     // Catch:{ all -> 0x076d }
            if (r7 == 0) goto L_0x06f2
            X.Qbl r4 = new X.Qbl     // Catch:{ all -> 0x076d }
            r4.<init>(r7)     // Catch:{ all -> 0x076d }
        L_0x06f2:
            r11.put(r12, r10)     // Catch:{ all -> 0x076d }
            monitor-exit(r19)     // Catch:{ all -> 0x076d }
            boolean r7 = r4 instanceof X.C7860Qbk     // Catch:{ JSONException -> 0x0778 }
            if (r7 != 0) goto L_0x0721
            java.lang.Object r7 = r4.A01()     // Catch:{ JSONException -> 0x0778 }
            X.RyF r7 = (X.C10793RyF) r7     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r14 = r7.A05     // Catch:{ JSONException -> 0x0778 }
            java.lang.Object r7 = r4.A01()     // Catch:{ JSONException -> 0x0778 }
            X.RyF r7 = (X.C10793RyF) r7     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r12 = r7.A04     // Catch:{ JSONException -> 0x0778 }
            java.lang.Integer r11 = X.AnonymousClass05K.A01     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r7 = "Oldest in non-persistent cache"
            X.Qbl r10 = new X.Qbl     // Catch:{ JSONException -> 0x0778 }
            r10.<init>(r7)     // Catch:{ JSONException -> 0x0778 }
            X.Rrp r7 = new X.Rrp     // Catch:{ JSONException -> 0x0778 }
            r7.<init>(r10, r11)     // Catch:{ JSONException -> 0x0778 }
            java.lang.Object r4 = r4.A01()     // Catch:{ JSONException -> 0x0778 }
            X.RyF r4 = (X.C10793RyF) r4     // Catch:{ JSONException -> 0x0778 }
            r13.A0X(r7, r4, r14, r12)     // Catch:{ JSONException -> 0x0778 }
        L_0x0721:
            r4 = r21
            X.Rrp r7 = X.SP2.A00(r1, r6, r0, r4)     // Catch:{ JSONException -> 0x0778 }
            java.lang.Integer r4 = r7.A01     // Catch:{ JSONException -> 0x0778 }
            boolean r1 = X.S9K.A00(r4)     // Catch:{ JSONException -> 0x0778 }
            if (r1 == 0) goto L_0x0734
            r0.A04(r7, r5, r8)     // Catch:{ JSONException -> 0x0778 }
            goto L_0x0536
        L_0x0734:
            boolean r1 = X.S9K.A01(r4)     // Catch:{ JSONException -> 0x0778 }
            if (r1 != 0) goto L_0x0536
            java.lang.Long r1 = java.lang.Long.valueOf(r16)     // Catch:{ JSONException -> 0x0778 }
            r1.getClass()     // Catch:{ JSONException -> 0x0778 }
            com.facebook.rti.push.service.FbnsServiceDelegate r0 = r0.A05     // Catch:{ JSONException -> 0x0778 }
            X.S3t r10 = r0.A09     // Catch:{ JSONException -> 0x0778 }
            if (r10 == 0) goto L_0x0536
            r0 = 783(0x30f, float:1.097E-42)
            java.lang.String r0 = X.Pxd.A00(r0)     // Catch:{ JSONException -> 0x0778 }
            java.lang.String[] r8 = new java.lang.String[]{r0, r8}     // Catch:{ JSONException -> 0x0778 }
            java.lang.String r4 = "notifications"
            r0 = 1
            r10.A01(r4, r8, r0)     // Catch:{ JSONException -> 0x0778 }
            goto L_0x0536
        L_0x075a:
            r1 = move-exception
            java.lang.Integer r0 = r1.A00     // Catch:{ JSONException -> 0x0778 }
            r30 = r0
        L_0x075f:
            java.lang.String r0 = r1.getMessage()     // Catch:{ JSONException -> 0x0778 }
            if (r0 == 0) goto L_0x052f
            X.Qbl r4 = new X.Qbl     // Catch:{ JSONException -> 0x0778 }
            r4.<init>(r0)     // Catch:{ JSONException -> 0x0778 }
            goto L_0x052f
        L_0x076c:
            return
        L_0x076d:
            r1 = move-exception
            monitor-exit(r19)     // Catch:{ all -> 0x076d }
            goto L_0x0777
        L_0x0770:
            java.lang.String r0 = "UTF-8 not supported"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ JSONException -> 0x0778 }
            r1.<init>(r0)     // Catch:{ JSONException -> 0x0778 }
        L_0x0777:
            throw r1     // Catch:{ JSONException -> 0x0778 }
        L_0x0778:
            r2 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[]{r15}
            java.lang.String r0 = "receive/publish/payload_exception; topic=%s"
            X.0KC.A0L(r9, r0, r2, r1)
            X.S3t r2 = r3.A09
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            r0 = 520(0x208, float:7.29E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            r2.A00(r0, r15)
            X.S4y r0 = r3.A02
            r0.A00(r1, r15)
            X.Spm r2 = r3.A03
            java.lang.String r1 = "Error: invalid payload = "
            r0 = r18
            java.lang.String r0 = X.002.A0R(r1, r0)
            r2.Cgi(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rti.push.service.FbnsServiceDelegate.A0R(X.SBU, java.lang.Long, java.lang.String, byte[], int, long):void");
    }

    public final synchronized void A0c(ArrayList arrayList) {
        for (SHZ shz : this.A08.A04()) {
            arrayList.add(shz.A02);
        }
    }

    static {
        HashMap hashMap = new HashMap();
        A0G = hashMap;
        hashMap.put("com.instagram.android", 30);
        hashMap.put("com.facebook.lite", 100);
        hashMap.put("com.oculus.horizon", 10);
    }

    public static void A01(FbnsServiceDelegate fbnsServiceDelegate, String str, String str2, String str3) {
        fbnsServiceDelegate.A05.A00(str);
        Intent intent = new Intent("com.facebook.rti.fbns.intent.RECEIVE");
        intent.setPackage(str);
        intent.addCategory(str);
        intent.putExtra("receive_type", "registered");
        if (str2 != null) {
            intent.putExtra("data", str2);
        }
        intent.putExtra("push_renew_trigger", str3);
        fbnsServiceDelegate.A0W(intent);
    }

    public static void A02(FbnsServiceDelegate fbnsServiceDelegate, String str, String str2, String str3, String str4, Map map) {
        FbnsServiceDelegate fbnsServiceDelegate2 = fbnsServiceDelegate;
        String str5 = str2;
        String str6 = str;
        fbnsServiceDelegate2.A09.A01(AnonymousClass000.A00(1752), new String[]{str6, str5}, 1);
        C11004S4y s4y = fbnsServiceDelegate2.A02;
        long j = fbnsServiceDelegate2.A00;
        boolean A002 = fbnsServiceDelegate2.A07.A00();
        long j2 = fbnsServiceDelegate2.A07.A03.get();
        AnonymousClass45J r4 = s4y.A02;
        AnonymousClass3RY[] r2 = AnonymousClass3RY.A02;
        boolean z = ((AnonymousClass45I) r4).getBoolean("is_employee", false);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - s4y.A00;
        long j4 = elapsedRealtime - j;
        long j5 = elapsedRealtime - s4y.A04.A06.get();
        long j6 = elapsedRealtime - j2;
        if (j2 < 0) {
            j6 = 0;
        }
        SRO sro = new SRO("fbns_push_registration_lifecycle", s4y.A05, Locale.getDefault().toString(), Build.MODEL, Build.MANUFACTURER);
        sro.A08 = str6;
        if (str5 == null) {
            str5 = "";
        }
        sro.A07 = str5;
        sro.A05 = str4;
        sro.A00 = elapsedRealtime;
        sro.A04 = j3;
        sro.A01 = j4;
        sro.A02 = j5;
        sro.A03 = j6;
        sro.A0A = A002;
        sro.A06 = str3;
        sro.A09 = z;
        sro.A03(map);
        sro.toString();
        s4y.A01.reportEvent(sro);
    }

    public static void A03(FbnsServiceDelegate fbnsServiceDelegate, String str, String str2, String str3, String str4, Map map, long j) {
        FbnsServiceDelegate fbnsServiceDelegate2 = fbnsServiceDelegate;
        String str5 = str;
        String str6 = str3;
        fbnsServiceDelegate2.A09.A01("notifications", new String[]{str5, str6}, 1);
        C11004S4y s4y = fbnsServiceDelegate2.A02;
        long j2 = fbnsServiceDelegate2.A00;
        boolean A002 = fbnsServiceDelegate2.A07.A00();
        long j3 = fbnsServiceDelegate2.A07.A03.get();
        AnonymousClass45J r4 = s4y.A02;
        AnonymousClass3RY[] r2 = AnonymousClass3RY.A02;
        boolean z = ((AnonymousClass45I) r4).getBoolean("is_employee", false);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j4 = elapsedRealtime - s4y.A00;
        long j5 = elapsedRealtime - j2;
        long j6 = elapsedRealtime - s4y.A04.A06.get();
        long j7 = elapsedRealtime - j3;
        if (j3 < 0) {
            j7 = 0;
        }
        SRO sro = new SRO("fbns_push_notification_lifecycle", s4y.A05, Locale.getDefault().toString(), Build.MODEL, Build.MANUFACTURER);
        sro.A08 = str5;
        sro.A07 = str6;
        sro.A09 = str2;
        sro.A01 = elapsedRealtime;
        sro.A05 = j4;
        sro.A02 = j5;
        sro.A03 = j6;
        sro.A04 = j7;
        sro.A0B = A002;
        sro.A06 = str4;
        sro.A00 = j;
        sro.A0A = z;
        sro.A03(map);
        sro.toString();
        s4y.A01.reportEvent(sro);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0035, code lost:
        if (r0.A00() == false) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A04(java.lang.String r16, java.lang.String r17, java.lang.String r18) {
        /*
            r15 = this;
            X.S3t r4 = r15.A09
            r5 = r16
            r6 = r17
            if (r4 == 0) goto L_0x0020
            X.00f r0 = r15.A01
            android.content.Context r0 = r0.getApplicationContext()
            X.0qQ.A07(r0)
            java.lang.String r0 = r0.getPackageName()
            java.lang.String[] r3 = new java.lang.String[]{r5, r0, r6}
            java.lang.String r2 = "services"
            r0 = 1
            r4.A01(r2, r3, r0)
        L_0x0020:
            X.S4y r4 = r15.A02
            if (r4 == 0) goto L_0x0048
            java.util.concurrent.atomic.AtomicBoolean r0 = r15.A0B
            boolean r13 = r0.get()
            long r9 = r15.A00
            X.SHi r0 = r15.A07
            if (r0 == 0) goto L_0x0037
            boolean r0 = r0.A00()
            r14 = 1
            if (r0 != 0) goto L_0x0038
        L_0x0037:
            r14 = 0
        L_0x0038:
            X.SHi r0 = r15.A07
            if (r0 == 0) goto L_0x0049
            java.util.concurrent.atomic.AtomicLong r0 = r0.A03
            long r11 = r0.get()
        L_0x0042:
            r8 = 0
            r7 = r18
            r4.A01(r5, r6, r7, r8, r9, r11, r13, r14)
        L_0x0048:
            return
        L_0x0049:
            r11 = 0
            goto L_0x0042
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rti.push.service.FbnsServiceDelegate.A04(java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final IBinder A0B(Intent intent) {
        Intent intent2 = intent;
        intent2.toString();
        A04("bind", intent2.getAction(), intent2.getStringExtra("caller"));
        C71774Oqa oqa = new C71774Oqa(intent2, this.A01, "fbns_aidl_auth_domain");
        String A002 = C241903Rv.A00(intent2);
        if (!oqa.CeP()) {
            0KC.A0O("FbnsServiceDelegate", "onBind invalid signature: %s", new Object[]{intent2.toString()});
            HashMap hashMap = new HashMap();
            Context applicationContext = this.A01.getApplicationContext();
            0qQ.A07(applicationContext);
            hashMap.put("cntr", applicationContext.getPackageName());
            hashMap.put("clr", A002);
            C241903Rv r1 = this.A01;
            int i = 0;
            if (A002 != null) {
                try {
                    PackageManager packageManager = r1.A00.getPackageManager();
                    if (packageManager != null) {
                        i = Integer.parseInt(packageManager.getPackageInfo(A002, 0).versionName.split("\\.", 2)[0]);
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    0KC.A0F("FbnsSecurityContextHelper", "requested package not found on the device", e);
                } catch (NumberFormatException e2) {
                    0KC.A0L("FbnsSecurityContextHelper", "Failed to parse major version for package: %s", e2, new Object[]{A002});
                }
            }
            hashMap.put("ver", String.valueOf(i));
            C11004S4y s4y = this.A02;
            boolean z = this.A0B.get();
            s4y.A01("bind", "TRUSTED_APP_AUTH_INVALID", intent2.getAction(), hashMap, this.A00, this.A07.A03.get(), z, this.A07.A00());
            this.A09.A01("fbns_ipc_auth", new String[]{"unauthorized", "secure", A002, intent2.getAction()}, 1);
            return null;
        }
        this.A09.A01("fbns_ipc_auth", new String[]{"authorised", "secure", A002, intent2.getAction()}, 1);
        return this.A00;
    }

    public final void A0J(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        try {
            printWriter.println(002.A0g("[ ", "FbnsServiceDelegate", " ]"));
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Context applicationContext = this.A01.getApplicationContext();
            0qQ.A07(applicationContext);
            C241833Rj.A01(applicationContext, arrayList, arrayList2);
            ArrayList arrayList3 = new ArrayList();
            A0c(arrayList3);
            StringBuilder sb = new StringBuilder();
            sb.append("validCompatibleApps=");
            sb.append(arrayList);
            printWriter.println(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("enabledCompatibleApps=");
            sb2.append(arrayList2);
            printWriter.println(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("registeredApps=");
            sb3.append(arrayList3);
            printWriter.println(sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append("notificationCounter=");
            sb4.append(this.A05.A02);
            printWriter.println(sb4.toString());
        } catch (Exception unused) {
        }
        super.A0J(fileDescriptor, printWriter, strArr);
    }

    public final void A0S(C241823Ri r4, Integer num) {
        A04("start", C9558Rcv.A00(num), r4.A03);
        super.A0S(r4, num);
    }

    public final T9D A0U(String str) {
        T9D t9d;
        SER ser = this.A06;
        synchronized (SER.A02) {
            C10793RyF ryF = (C10793RyF) ser.A00.remove(str);
            if (ryF != null) {
                t9d = new C7861Qbl(ryF);
            } else {
                t9d = C7860Qbk.A00;
            }
        }
        return t9d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x014f, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x0152;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x015f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0V(android.content.Intent r16) {
        /*
            r15 = this;
            java.lang.String r0 = "pkg_name"
            r5 = r16
            java.lang.String r11 = r5.getStringExtra(r0)
            java.lang.String r0 = "appid"
            java.lang.String r12 = r5.getStringExtra(r0)
            java.lang.String r0 = "local_generation"
            r3 = 0
            boolean r4 = r5.getBooleanExtra(r0, r3)
            java.util.HashMap r14 = new java.util.HashMap
            r14.<init>()
            java.lang.String r1 = "push_renew_trigger"
            boolean r0 = r5.hasExtra(r1)
            java.lang.String r2 = "unknown"
            if (r0 == 0) goto L_0x0062
            java.lang.String r8 = r5.getStringExtra(r1)
        L_0x0028:
            r9 = r15
            X.S3T r0 = r15.A05
            r0.A00(r11)
            java.util.concurrent.atomic.AtomicBoolean r0 = r15.A0B
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0044
            java.lang.String r1 = "FbnsServiceDelegate"
            java.lang.String r0 = "service/register/not_started"
            X.0KC.A0C(r1, r0)
            java.lang.String r10 = "reg_fail"
            java.lang.String r13 = "service not started"
            A02(r9, r10, r11, r12, r13, r14)
        L_0x0044:
            r13 = 0
            java.lang.String r10 = "reg_called"
            A02(r9, r10, r11, r12, r13, r14)
            X.SRS r0 = r15.A08
            java.lang.String r1 = r0.A03(r11)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0064
            if (r8 == 0) goto L_0x0059
            r2 = r8
        L_0x0059:
            A01(r15, r11, r1, r2)
            java.lang.String r10 = "cache_hit"
            A02(r9, r10, r11, r12, r13, r14)
            return
        L_0x0062:
            r8 = r2
            goto L_0x0028
        L_0x0064:
            if (r4 == 0) goto L_0x0161
            X.00f r0 = r15.A01
            android.content.Context r0 = r0.getApplicationContext()
            X.0qQ.A07(r0)
            java.lang.String r0 = r0.getPackageName()
            boolean r0 = X.C241833Rj.A02(r0)
            if (r0 == 0) goto L_0x0161
            java.lang.Object r0 = X.AnonymousClass3RD.A00
            X.3RX r0 = (X.AnonymousClass3RX) r0
            java.util.Set r0 = r0.A08
            boolean r0 = r0.contains(r11)
            if (r0 == 0) goto L_0x0151
            X.ST9 r0 = r15.A09
            X.ThS r0 = r0.A0I
            X.42j r0 = r0.BK9()
            java.lang.Object r6 = r0.first
            java.lang.String r6 = (java.lang.String) r6
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x0151
            java.lang.String r0 = r15.A0A
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0151
            java.lang.String r7 = r15.A0A
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x010c
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x010c
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 != 0) goto L_0x010c
            java.lang.String r0 = "{"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r0)
            java.lang.String r0 = "\"pn\":"
            r4.append(r0)
            java.lang.String r5 = "\""
            java.lang.String r0 = X.002.A0g(r5, r11, r5)
            r4.append(r0)
            java.lang.String r1 = ","
            r4.append(r1)
            java.lang.String r0 = "\"di\":"
            r4.append(r0)
            java.lang.String r0 = X.002.A0g(r5, r7, r5)
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = "\"ai\":"
            r4.append(r0)
            r0 = 340(0x154, float:4.76E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = "\"ck\":"
            r4.append(r0)
            java.lang.String r0 = X.002.A0g(r5, r6, r5)
            r4.append(r0)
            java.lang.String r0 = "}"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            byte[] r1 = r0.getBytes()     // Catch:{ AssertionError -> 0x010c }
            r0 = 2
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ AssertionError -> 0x010c }
            goto L_0x010d
        L_0x010c:
            r0 = r13
        L_0x010d:
            java.lang.String r6 = "fbns-b64"
            if (r0 == 0) goto L_0x015f
            java.lang.String r1 = "{"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r1)
            java.lang.String r1 = "\"k\":"
            r5.append(r1)
            java.lang.String r4 = "\""
            java.lang.String r0 = X.002.A0g(r4, r0, r4)
            r5.append(r0)
            java.lang.String r1 = ","
            r5.append(r1)
            java.lang.String r0 = "\"v\":"
            r5.append(r0)
            r5.append(r3)
            r5.append(r1)
            java.lang.String r0 = "\"t\":"
            r5.append(r0)
            java.lang.String r0 = X.002.A0g(r4, r6, r4)
            r5.append(r0)
            java.lang.String r0 = "}"
            r5.append(r0)
            java.lang.String r1 = r5.toString()
        L_0x014b:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x0152
        L_0x0151:
            r1 = r13
        L_0x0152:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0161
            if (r8 == 0) goto L_0x015b
            r2 = r8
        L_0x015b:
            A01(r15, r11, r1, r2)
            return
        L_0x015f:
            r1 = 0
            goto L_0x014b
        L_0x0161:
            r15.A0b(r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rti.push.service.FbnsServiceDelegate.A0V(android.content.Intent):void");
    }

    public final void A0X(C10413Rrp rrp, C10793RyF ryF, String str, String str2) {
        T9D qbl;
        C10793RyF ryF2 = ryF;
        T9D t9d = ryF2.A01;
        T9D t9d2 = ryF2.A03;
        String obj = rrp.toString();
        long j = ryF2.A00;
        if (t9d2 instanceof C7860Qbk) {
            qbl = C7860Qbk.A00;
        } else {
            Long valueOf = Long.valueOf(System.currentTimeMillis() - ((Number) t9d2.A01()).longValue());
            valueOf.getClass();
            qbl = new C7861Qbl(valueOf);
        }
        String str3 = ryF2.A06;
        String str4 = str;
        this.A03.Cgi(002.A0R("Error: Fail to deliver notifId = ", str4));
        String str5 = str2;
        if (!(qbl instanceof C7860Qbk)) {
            C10983S3t s3t = this.A09;
            Context applicationContext = this.A01.getApplicationContext();
            0qQ.A07(applicationContext);
            s3t.A01("fbns_e2e_latency", new String[]{"discard", applicationContext.getPackageName(), str5}, ((Number) qbl.A01()).longValue());
        }
        C10983S3t s3t2 = this.A09;
        Context applicationContext2 = this.A01.getApplicationContext();
        0qQ.A07(applicationContext2);
        s3t2.A01("fbns_latency", new String[]{"discard", applicationContext2.getPackageName(), str5}, j);
        HashMap hashMap = new HashMap();
        if (!(t9d instanceof C7860Qbk)) {
            hashMap.put("l", String.valueOf(t9d.A01()));
        }
        hashMap.put("src", str3);
        A03(this, "discard", str4, str5, obj, hashMap, j);
    }

    public final void A0Z(C10793RyF ryF, String str, String str2) {
        C10793RyF ryF2 = ryF;
        T9D t9d = ryF2.A01;
        T9D t9d2 = ryF2.A03;
        C10983S3t s3t = this.A09;
        00f r2 = this.A01;
        Context applicationContext = r2.getApplicationContext();
        0qQ.A07(applicationContext);
        String packageName = applicationContext.getPackageName();
        long j = ryF2.A00;
        String str3 = str2;
        s3t.A01("fbns_latency", new String[]{"acknowledge", packageName, str3}, j);
        if (!(t9d2 instanceof C7860Qbk)) {
            Long valueOf = Long.valueOf(System.currentTimeMillis() - ((Number) t9d2.A01()).longValue());
            valueOf.getClass();
            C7861Qbl qbl = new C7861Qbl(valueOf);
            C10983S3t s3t2 = this.A09;
            Context applicationContext2 = r2.getApplicationContext();
            0qQ.A07(applicationContext2);
            s3t2.A01("fbns_e2e_latency", new String[]{"acknowledge", applicationContext2.getPackageName(), str3}, ((Number) qbl.A01()).longValue());
        }
        String str4 = str;
        this.A03.Cgi(002.A12("ACK from ", str3, ": notifId = ", str4, "; delay = ", j));
        HashMap hashMap = new HashMap();
        if (!(t9d instanceof C7860Qbk)) {
            hashMap.put("l", String.valueOf(t9d.A01()));
        }
        hashMap.put("src", ryF2.A06);
        A03(this, "acknowledge", str4, str3, (String) null, hashMap, j);
    }

    public final void A0a(String str, String str2) {
        this.A09.A01("ack_failures", new String[]{str, str2}, 1);
    }

    public final void A0b(String str, String str2) {
        String str3;
        String str4;
        HashMap hashMap = new HashMap();
        String str5 = str;
        String str6 = str2;
        if (TextUtils.isEmpty(str5) || TextUtils.isEmpty(str6)) {
            str4 = "reg_fail";
            str3 = "invalid input";
        } else {
            try {
                S3T s3t = this.A05;
                0qQ.A0B(str5, 0);
                long j = ((AnonymousClass45I) s3t.A04).getLong(str5, 120000);
                String A002 = Pxd.A00(498);
                Intent intent = new Intent("com.facebook.rti.fbns.intent.REGISTER_RETRY");
                intent.putExtra("pkg_name", str5);
                intent.putExtra(PublicKeyCredentialControllerUtility.JSON_KEY_APPID, str6);
                s3t.A02.A02(intent);
                0Sy r5 = new 0Sy();
                Context context = s3t.A01;
                r5.A0B(intent, context.getClassLoader());
                r5.A09();
                r5.A08 = s3t.A09;
                PendingIntent A032 = r5.A03(context, 0, 134217728);
                s3t.A08.put(str5, A032);
                s3t.A06.A04(context, s3t.A00, 2, SystemClock.elapsedRealtime() + j, A032);
                long j2 = j * 2;
                if (j2 > 86400000) {
                    j2 = 86400000;
                }
                C13849TiS AR1 = s3t.A04.AR1();
                AR1.E5a(str5, j2);
                AR1.AIR(A002, "PreferencesManager failed to store backOffTimeMs");
            } catch (Exception e) {
                0KC.A0G("FbnsServiceDelegate", "service/register_retry/schedule_failed", e);
                A02(this, "reg_retry_schedule_fail", str5, str6, e.getMessage(), hashMap);
            }
            SRS srs = this.A08;
            S9L.A00(!TextUtils.isEmpty(str5));
            S9L.A00(!TextUtils.isEmpty(str6));
            SHZ shz = new SHZ();
            shz.A02 = str5;
            shz.A01 = str6;
            shz.A00 = Long.valueOf(System.currentTimeMillis());
            SRS.A02(SRS.A01(srs), shz, str5);
            Context applicationContext = this.A01.getApplicationContext();
            0qQ.A07(applicationContext);
            if (C9555Rcs.A00(applicationContext)) {
                this.A0A.A0T.C84();
                throw null;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("pkg_name", str5);
                jSONObject.putOpt(PublicKeyCredentialControllerUtility.JSON_KEY_APPID, str6);
                String obj = jSONObject.toString();
                C12264SqI sqI = new C12264SqI(this, str5, str6, hashMap);
                try {
                    if (this.A09.A04(sqI, AnonymousClass05K.A01, C66579MXk.A00(460), obj.getBytes(ReactWebViewManager.HTML_ENCODING)) == -1) {
                        str4 = "reg_fail";
                        str3 = "mqtt not connected";
                    } else {
                        return;
                    }
                } catch (UnsupportedEncodingException unused) {
                    throw new RuntimeException("UTF-8 not supported");
                } catch (C241873Rq unused2) {
                }
            } catch (JSONException e2) {
                0KC.A0G("FbnsServiceDelegate", "service/register/serialize_exception", e2);
                A02(this, "reg_fail", str5, str6, "serialization exception: unknown client", hashMap);
                return;
            }
        }
        A02(this, str4, str5, str6, str3, hashMap);
    }

    public FbnsServiceDelegate(00f r3) {
        super(r3);
        SFM sfm = new SFM();
        this.A0C = sfm;
        this.A0B = new C12256SqA(sfm);
    }

    public static String A00(String str) {
        if (C241833Rj.A02(str)) {
            return ((AnonymousClass3RX) AnonymousClass3RD.A00).A03;
        }
        return FbnsService.class.getName();
    }

    public final void A0D(Intent intent) {
        A04("rebind", intent.getAction(), intent.getStringExtra("caller"));
        FbnsServiceDelegate.super.A0D(intent);
    }

    public final boolean A0E(Intent intent) {
        A04("unbind", intent.getAction(), intent.getStringExtra("caller"));
        return FbnsServiceDelegate.super.A0E(intent);
    }

    public final void A0H() {
        super.A0H();
        if (A0D == this) {
            A0D = null;
        }
    }

    public final C241823Ri A0K(Intent intent, int i, int i2) {
        return super.A0K(intent, i, i2);
    }

    public final Future A0L(C8947RGw rGw) {
        A04("stop", rGw.toString(), (String) null);
        return super.A0L(rGw);
    }

    public final void A0M() {
        super.A0M();
        ST2 st2 = this.A05;
        this.A04.A03();
        st2.A0I = "S";
    }

    public final void A0N() {
        super.A0N();
        C7876Qc0 qc0 = (C7876Qc0) this.A0A;
        SRS srs = qc0.A03;
        C11004S4y s4y = qc0.A01;
        S3T s3t = qc0.A02;
        C241903Rv r5 = qc0.A00;
        SP2 sp2 = new SP2(r5, qc0.A05, this);
        Context applicationContext = this.A01.getApplicationContext();
        0qQ.A07(applicationContext);
        FbnsAIDLService fbnsAIDLService = new FbnsAIDLService(applicationContext, new C12267SqM(this), this.A03);
        this.A08 = srs;
        this.A02 = s4y;
        this.A05 = s3t;
        this.A06 = new SER();
        this.A01 = r5;
        this.A04 = sp2;
        this.A00 = fbnsAIDLService;
    }

    public final void A0W(Intent intent) {
        String str = intent.getPackage();
        if (!TextUtils.isEmpty(str)) {
            C241903Rv r3 = this.A01;
            AnonymousClass3RX r2 = (AnonymousClass3RX) AnonymousClass3RD.A00;
            C282425Da A012 = r2.A01(intent, r3);
            Context applicationContext = this.A01.getApplicationContext();
            0qQ.A07(applicationContext);
            if (str.equals(applicationContext.getPackageName()) || A012.CeN()) {
                r3.A02(intent);
                intent.setPackage(str);
                if (r2.A01(intent, r3).CeN()) {
                    r3.A01.A08(r3.A00, intent);
                    return;
                }
                return;
            }
            this.A08.A06(new C12269SqO(this, str), str);
        }
    }

    public final void A0Y(T9D t9d, String str, String str2, String str3, String str4, String str5) {
        if (!TextUtils.isEmpty(str4)) {
            this.A03.Cgi(str4);
        }
        HashMap hashMap = new HashMap();
        if (!(t9d instanceof C7860Qbk)) {
            hashMap.put("l", String.valueOf(t9d.A01()));
        }
        hashMap.put("src", str5);
        A03(this, RealtimeConstants.SEND_FAIL, str3, str, str2, hashMap, 0);
    }

    public final void A0C() {
        super.A0C();
    }
}
