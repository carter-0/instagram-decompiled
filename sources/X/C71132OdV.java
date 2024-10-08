package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Base64;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.dextricks.DalvikConstants;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.bugreporter.BugReportComposerViewModel;
import com.instagram.bugreporter.BugReportUploadFailedNotificationDismissedReceiver;
import com.instagram.bugreporter.BugReporterActivity;
import com.instagram.bugreporter.model.BugReport;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.meta.flytrap.attachment.model.BugReportAttachment;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.OdV  reason: case insensitive filesystem */
public final class C71132OdV {
    public static final C71132OdV A00 = new Object();
    public static final C262224Cq A01 = 19E.A02(AnonymousClass12T.A00.AOJ(1291882252, 3).plus(new AnonymousClass19G((C262204Co) null)));

    public static final void A02(PendingIntent pendingIntent, Context context, Intent intent, 0lg r9, String str, String str2, String str3, int i, int i2, boolean z) {
        2HA A02 = C3726691w.A02(context, r9, "support_ticket");
        0Sy r4 = new 0Sy();
        if (z) {
            r4.A0D = true;
        } else {
            r4.A0B(intent, context.getClassLoader());
        }
        PendingIntent A012 = r4.A01(context, (int) System.currentTimeMillis(), 268435456);
        AnonymousClass9T8 r42 = new AnonymousClass9T8(context, A02.A00);
        r42.A0C(str);
        r42.A0B(str2);
        r42.A04(i);
        r42.A0E(true);
        r42.A0D(str3);
        long currentTimeMillis = System.currentTimeMillis();
        Notification notification = r42.A0A;
        notification.when = currentTimeMillis;
        r42.A0i = true;
        r42.A0C = A012;
        if (pendingIntent != null) {
            notification.deleteIntent = pendingIntent;
        }
        new 1Fs(context).A00((String) null, i2, r42.A03());
    }

    public static final void A03(Context context, BugReportComposerViewModel bugReportComposerViewModel, BugReport bugReport, 0lg r13, boolean z) {
        Context context2 = context;
        Intent A0A = C66580MXl.A0A(context, BugReporterActivity.class);
        0lg r8 = r13;
        A0A.putExtra("IgSessionManager.SESSION_TOKEN_KEY", r13.getToken());
        A0A.setFlags(268435456);
        C70995OVq oVq = C70995OVq.A00;
        oVq.A01(A0A, bugReport, r13);
        A0A.putExtra("BugReporterActivity.INTENT_EXTRA_VIEWMODEL", bugReportComposerViewModel);
        A0A.putExtra("BugReporterActivity.INTENT_UPLOAD_FAILED", true);
        String A0K = 2Yu.A0K(context);
        0qQ.A07(A0K);
        Intent A0A2 = C66580MXl.A0A(context, BugReportUploadFailedNotificationDismissedReceiver.class);
        A0A2.putExtra("IgSessionManager.SESSION_TOKEN_KEY", r13.getToken());
        oVq.A01(A0A2, bugReport, r13);
        PendingIntent A02 = C66582MXn.A0K(context, A0A2).A02(context, 0, 0);
        String A0u = DbV.A0u(context, A0K, bugReport.A0A, 2131954325);
        0qQ.A07(A0u);
        int i = 2131954323;
        if (z) {
            i = 2131954322;
        }
        String A0p = C51967G9n.A0p(context, i);
        String A0c = DbY.A0c(context2, A0K, 2131954324);
        if (!z) {
            A0A = DbS.A09();
        }
        A02(A02, context2, A0A, r8, A0u, A0p, A0c, 17301642, 2, !z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:92:0x031a  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0394  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(android.content.Context r40, X.C70757OKd r41, com.instagram.bugreporter.model.BugReport r42, X.0lg r43, java.io.File r44, java.util.concurrent.CountDownLatch r45, int r46, long r47) {
        /*
            r2 = r46
            java.lang.String r3 = "BugReporterUploader"
            r29 = r44
            java.lang.String r23 = r29.getCanonicalPath()     // Catch:{ IOException -> 0x03e9 }
            X.0Tu r1 = X.0Tu.A05
            r3 = 36605834465580355(0x820cd000071543, double:3.2130153436727174E-306)
            r24 = r43
            r0 = r24
            int r35 = X.DbS.A04(r1, r0, r3)
            java.lang.String r22 = r29.getName()
            long r43 = r29.length()
            r4 = 0
            r7 = 0
            r17 = 0
            r38 = 1
            java.util.HashMap r8 = X.AnonymousClass7TE.A1E()
            r3 = r42
            java.util.Map r6 = r3.A0N
            if (r6 == 0) goto L_0x0051
            java.util.Iterator r5 = X.DbV.A16(r6)
        L_0x0035:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0051
            java.lang.Object r1 = r5.next()
            java.lang.Object r0 = r6.get(r1)
            if (r0 == 0) goto L_0x004c
            X.0qQ.A0B(r1, r4)
            r8.put(r1, r0)
            goto L_0x0035
        L_0x004c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0051:
            X.1Yd r6 = X.HWC.A00()
            X.1Yc r6 = (X.C64901Yc) r6
            X.ODK r5 = r6.A00
            if (r5 == 0) goto L_0x0073
            long r11 = java.lang.System.currentTimeMillis()
            long r0 = r5.A00
            long r11 = r11 - r0
            long r9 = X.C64901Yc.A02
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x014e
            java.lang.String r1 = r5.A01
            java.util.Map r0 = r5.A02
            java.lang.String r0 = X.JTQ.A0c(r0)
            r8.put(r1, r0)
        L_0x0073:
            X.0qv r1 = X.0qv.A02
            android.content.Context r0 = X.C60960kU.A00
            java.lang.String r15 = r1.A04(r0)
            if (r15 == 0) goto L_0x03e4
            java.lang.String r14 = r3.A08
            if (r14 != 0) goto L_0x0083
            java.lang.String r14 = "493186350727442"
        L_0x0083:
            java.lang.String r11 = r3.A09
            if (r11 != 0) goto L_0x0089
            java.lang.String r11 = "161101191344941"
        L_0x0089:
            java.lang.String r0 = r3.A06
            r21 = r0
            java.lang.String r20 = ""
            r6 = r20
            if (r0 != 0) goto L_0x0095
            r21 = r6
        L_0x0095:
            java.lang.String r0 = r3.A0A
            if (r0 == 0) goto L_0x009b
            r20 = r0
        L_0x009b:
            com.instagram.bugreporter.source.BugReportSource r0 = r3.A00
            java.lang.String r10 = r0.toString()
            X.1ND r0 = X.1ND.A00(r24)
            java.lang.String r1 = r0.A02
            java.lang.String r9 = r3.A0H
            r19 = 0
            r36 = r47
            java.lang.String r18 = java.lang.String.valueOf(r36)
            r0 = r24
            boolean r0 = r0 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x00df
            r4 = r24
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            X.1Av r0 = X.1Au.A00(r4)
            java.lang.String r5 = "fbns_token"
            X.0xa r0 = r0.A01
            java.lang.String r0 = r0.getString(r5, r6)
            X.0qQ.A07(r0)
            r8.put(r5, r0)
            java.lang.String r7 = r4.A06
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r4)
            java.lang.String r17 = r0.getUsername()
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r4)
            boolean r4 = r0.CPm()
        L_0x00df:
            if (r23 == 0) goto L_0x03dd
            r6 = 0
            X.1NY r5 = X.AnonymousClass7TG.A0a(r24)
            java.lang.String r0 = "graphql.instagram.com"
            boolean r12 = X.1Q6.A00(r0)
            if (r12 == 0) goto L_0x03d2
            r5.A0D = r0
            java.lang.String r0 = "/bug_report_file_upload/"
            r5.A0A(r0)
            java.lang.Class<X.NHT> r13 = X.NHT.class
            java.lang.Class<X.OOo> r12 = X.OOo.class
            r0 = r19
            r5.A0O(r6, r13, r12, r0)
            if (r7 == 0) goto L_0x0105
            java.lang.String r0 = "user_identifier"
            r5.A9m(r0, r7)
        L_0x0105:
            long r12 = X.AnonymousClass7TG.A0I()
            java.lang.String r12 = java.lang.String.valueOf(r12)
            java.lang.String r0 = "client_time"
            r5.A9m(r0, r12)
            r0 = 2913(0xb61, float:4.082E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r5.A9m(r0, r11)
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r11 = X.1UR.A01(r0)
            java.lang.String r0 = "locale"
            r5.A9m(r0, r11)
            if (r4 == 0) goto L_0x014b
            java.lang.String r4 = "1"
        L_0x012c:
            r0 = 1497(0x5d9, float:2.098E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r5.A9m(r0, r4)
            java.lang.String r13 = "source"
            if (r10 == 0) goto L_0x013c
            r5.A9m(r13, r10)
        L_0x013c:
            java.lang.String r4 = "endpoint"
            if (r9 == 0) goto L_0x0143
            r5.A9m(r4, r9)
        L_0x0143:
            if (r1 == 0) goto L_0x0152
            java.lang.String r0 = "claim"
            r5.A9m(r0, r1)
            goto L_0x0152
        L_0x014b:
            java.lang.String r4 = "0"
            goto L_0x012c
        L_0x014e:
            r6.A00 = r7
            goto L_0x0073
        L_0x0152:
            r25 = r40
            java.io.StringWriter r16 = X.JTO.A0v()     // Catch:{ IOException -> 0x02f7 }
            android.util.JsonWriter r1 = new android.util.JsonWriter     // Catch:{ IOException -> 0x02f7 }
            r0 = r16
            r1.<init>(r0)     // Catch:{ IOException -> 0x02f7 }
            android.util.JsonWriter r12 = r1.beginObject()     // Catch:{ IOException -> 0x02f7 }
            r11 = 9
            r1 = 37
            r0 = r19
            java.lang.String r0 = X.Dbp.A02(r0, r11, r1)     // Catch:{ IOException -> 0x02f7 }
            android.util.JsonWriter r0 = r12.name(r0)     // Catch:{ IOException -> 0x02f7 }
            android.util.JsonWriter r1 = r0.value(r15)     // Catch:{ IOException -> 0x02f7 }
            java.lang.String r0 = "last_seen_ad_id"
            android.util.JsonWriter r1 = r1.name(r0)     // Catch:{ IOException -> 0x02f7 }
            r0 = r21
            android.util.JsonWriter r1 = r1.value(r0)     // Catch:{ IOException -> 0x02f7 }
            java.lang.String r0 = "IG_Username"
            android.util.JsonWriter r1 = r1.name(r0)     // Catch:{ IOException -> 0x02f7 }
            r0 = r17
            android.util.JsonWriter r1 = r1.value(r0)     // Catch:{ IOException -> 0x02f7 }
            java.lang.String r0 = "Git_Hash"
            android.util.JsonWriter r1 = r1.name(r0)     // Catch:{ IOException -> 0x02f7 }
            java.lang.String r0 = X.C61120lW.A03(r25)     // Catch:{ IOException -> 0x02f7 }
            android.util.JsonWriter r1 = r1.value(r0)     // Catch:{ IOException -> 0x02f7 }
            java.lang.String r0 = "Build_Num"
            android.util.JsonWriter r11 = r1.name(r0)     // Catch:{ IOException -> 0x02f7 }
            int r0 = X.C61120lW.A00()     // Catch:{ IOException -> 0x02f7 }
            long r0 = (long) r0     // Catch:{ IOException -> 0x02f7 }
            android.util.JsonWriter r1 = r11.value(r0)     // Catch:{ IOException -> 0x02f7 }
            java.lang.String r0 = "Branch"
            android.util.JsonWriter r1 = r1.name(r0)     // Catch:{ IOException -> 0x02f7 }
            java.lang.String r0 = X.C61120lW.A02(r25)     // Catch:{ IOException -> 0x02f7 }
            android.util.JsonWriter r1 = r1.value(r0)     // Catch:{ IOException -> 0x02f7 }
            java.lang.String r0 = "OS_Version"
            android.util.JsonWriter r1 = r1.name(r0)     // Catch:{ IOException -> 0x02f7 }
            java.lang.String r0 = android.os.Build.VERSION.RELEASE     // Catch:{ IOException -> 0x02f7 }
            android.util.JsonWriter r1 = r1.value(r0)     // Catch:{ IOException -> 0x02f7 }
            java.lang.String r0 = "Manufacturer"
            android.util.JsonWriter r1 = r1.name(r0)     // Catch:{ IOException -> 0x02f7 }
            java.lang.String r0 = android.os.Build.MANUFACTURER     // Catch:{ IOException -> 0x02f7 }
            android.util.JsonWriter r1 = r1.value(r0)     // Catch:{ IOException -> 0x02f7 }
            java.lang.String r0 = "Model"
            android.util.JsonWriter r1 = r1.name(r0)     // Catch:{ IOException -> 0x02f7 }
            java.lang.String r0 = android.os.Build.MODEL     // Catch:{ IOException -> 0x02f7 }
            android.util.JsonWriter r1 = r1.value(r0)     // Catch:{ IOException -> 0x02f7 }
            java.lang.String r0 = "Locale"
            android.util.JsonWriter r11 = r1.name(r0)     // Catch:{ IOException -> 0x02f7 }
            java.util.Locale r1 = java.util.Locale.getDefault()     // Catch:{ IOException -> 0x02f7 }
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ IOException -> 0x02f7 }
            java.lang.String r0 = r1.getDisplayName(r0)     // Catch:{ IOException -> 0x02f7 }
            android.util.JsonWriter r1 = r11.value(r0)     // Catch:{ IOException -> 0x02f7 }
            java.lang.String r0 = "Build_Type"
            android.util.JsonWriter r1 = r1.name(r0)     // Catch:{ IOException -> 0x02f7 }
            X.0eM r0 = X.0lY.A02     // Catch:{ IOException -> 0x02f7 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ IOException -> 0x02f7 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x02f7 }
            android.util.JsonWriter r1 = r1.value(r0)     // Catch:{ IOException -> 0x02f7 }
            java.lang.String r0 = "last_played_video_ids"
            android.util.JsonWriter r1 = r1.name(r0)     // Catch:{ IOException -> 0x02f7 }
            java.util.Deque r0 = X.AnonymousClass4P5.A00     // Catch:{ IOException -> 0x02f7 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x02f7 }
            android.util.JsonWriter r1 = r1.value(r0)     // Catch:{ IOException -> 0x02f7 }
            java.lang.String r0 = "ar_engine_supported"
            android.util.JsonWriter r1 = r1.name(r0)     // Catch:{ IOException -> 0x02f7 }
            java.lang.String r0 = java.lang.String.valueOf(r19)     // Catch:{ IOException -> 0x02f7 }
            android.util.JsonWriter r1 = r1.value(r0)     // Catch:{ IOException -> 0x02f7 }
            java.lang.String r0 = "available_disk_space_bytes"
            android.util.JsonWriter r1 = r1.name(r0)     // Catch:{ IOException -> 0x02f7 }
            X.0JN r0 = X.0JN.A01()     // Catch:{ IOException -> 0x02f7 }
            long r11 = r0.A05()     // Catch:{ IOException -> 0x02f7 }
            java.lang.String r0 = java.lang.String.valueOf(r11)     // Catch:{ IOException -> 0x02f7 }
            android.util.JsonWriter r1 = r1.value(r0)     // Catch:{ IOException -> 0x02f7 }
            if (r7 == 0) goto L_0x0243
            java.lang.String r0 = "IG_UserId"
            android.util.JsonWriter r0 = r1.name(r0)     // Catch:{ IOException -> 0x02f7 }
            r0.value(r7)     // Catch:{ IOException -> 0x02f7 }
        L_0x0243:
            if (r10 == 0) goto L_0x024c
            android.util.JsonWriter r0 = r1.name(r13)     // Catch:{ IOException -> 0x02f7 }
            r0.value(r10)     // Catch:{ IOException -> 0x02f7 }
        L_0x024c:
            if (r9 == 0) goto L_0x0255
            android.util.JsonWriter r0 = r1.name(r4)     // Catch:{ IOException -> 0x02f7 }
            r0.value(r9)     // Catch:{ IOException -> 0x02f7 }
        L_0x0255:
            java.util.Set r0 = r8.keySet()     // Catch:{ IOException -> 0x02f7 }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ IOException -> 0x02f7 }
        L_0x025d:
            boolean r0 = r7.hasNext()     // Catch:{ IOException -> 0x02f7 }
            if (r0 == 0) goto L_0x0273
            java.lang.String r0 = X.AnonymousClass7TE.A18(r7)     // Catch:{ IOException -> 0x02f7 }
            android.util.JsonWriter r4 = r1.name(r0)     // Catch:{ IOException -> 0x02f7 }
            java.lang.String r0 = X.DbS.A0r(r0, r8)     // Catch:{ IOException -> 0x02f7 }
            r4.value(r0)     // Catch:{ IOException -> 0x02f7 }
            goto L_0x025d
        L_0x0273:
            android.util.JsonWriter r0 = r1.endObject()     // Catch:{ IOException -> 0x02f7 }
            r0.close()     // Catch:{ IOException -> 0x02f7 }
            java.io.StringWriter r4 = X.JTO.A0v()     // Catch:{ IOException -> 0x02f7 }
            java.lang.String r1 = "connectivity"
            r0 = r25
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch:{ IOException -> 0x02f7 }
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch:{ IOException -> 0x02f7 }
            if (r0 == 0) goto L_0x028e
            android.net.NetworkInfo r6 = r0.getActiveNetworkInfo()     // Catch:{ IOException -> 0x02f7 }
        L_0x028e:
            android.util.JsonWriter r0 = new android.util.JsonWriter     // Catch:{ IOException -> 0x02f7 }
            r0.<init>(r4)     // Catch:{ IOException -> 0x02f7 }
            android.util.JsonWriter r1 = r0.beginObject()     // Catch:{ IOException -> 0x02f7 }
            java.lang.String r0 = "description"
            android.util.JsonWriter r1 = r1.name(r0)     // Catch:{ IOException -> 0x02f7 }
            r0 = r20
            android.util.JsonWriter r1 = r1.value(r0)     // Catch:{ IOException -> 0x02f7 }
            java.lang.String r0 = "category_id"
            android.util.JsonWriter r0 = r1.name(r0)     // Catch:{ IOException -> 0x02f7 }
            android.util.JsonWriter r1 = r0.value(r14)     // Catch:{ IOException -> 0x02f7 }
            java.lang.String r0 = "misc_info"
            android.util.JsonWriter r1 = r1.name(r0)     // Catch:{ IOException -> 0x02f7 }
            java.lang.String r0 = r16.toString()     // Catch:{ IOException -> 0x02f7 }
            android.util.JsonWriter r1 = r1.value(r0)     // Catch:{ IOException -> 0x02f7 }
            r0 = 173(0xad, float:2.42E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x02f7 }
            android.util.JsonWriter r1 = r1.name(r0)     // Catch:{ IOException -> 0x02f7 }
            java.lang.String r7 = "null"
            if (r6 != 0) goto L_0x02cb
            r0 = r7
            goto L_0x02cf
        L_0x02cb:
            java.lang.String r0 = r6.getTypeName()     // Catch:{ IOException -> 0x02f7 }
        L_0x02cf:
            android.util.JsonWriter r1 = r1.value(r0)     // Catch:{ IOException -> 0x02f7 }
            r0 = 1612(0x64c, float:2.259E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x02f7 }
            android.util.JsonWriter r0 = r1.name(r0)     // Catch:{ IOException -> 0x02f7 }
            if (r6 == 0) goto L_0x02e3
            java.lang.String r7 = r6.getSubtypeName()     // Catch:{ IOException -> 0x02f7 }
        L_0x02e3:
            android.util.JsonWriter r0 = r0.value(r7)     // Catch:{ IOException -> 0x02f7 }
            android.util.JsonWriter r0 = r0.endObject()     // Catch:{ IOException -> 0x02f7 }
            r0.close()     // Catch:{ IOException -> 0x02f7 }
            java.lang.String r1 = "metadata"
            java.lang.String r0 = r4.toString()     // Catch:{ IOException -> 0x02f7 }
            r5.A9m(r1, r0)     // Catch:{ IOException -> 0x02f7 }
        L_0x02f7:
            java.io.File r7 = X.AnonymousClass7TE.A0t(r23)
            boolean r0 = r7.exists()
            if (r0 == 0) goto L_0x0326
            boolean r0 = X.C70352O3e.A00(r7)     // Catch:{ IOException -> 0x030a }
            if (r0 == 0) goto L_0x0312
            java.lang.String r6 = "application/gzip"
            goto L_0x0316
        L_0x030a:
            r4 = move-exception
            java.lang.String r1 = "FlytrapApi"
            java.lang.String r0 = "Unable to detect gzip compression for attachment file"
            X.0KC.A0F(r1, r0, r4)
        L_0x0312:
            java.lang.String r6 = X.0mf.A00(r23)
        L_0x0316:
            java.lang.String r4 = "file"
            if (r6 == 0) goto L_0x0394
            X.1Fc r0 = r5.A0W
            java.util.Map r1 = r0.A00
            X.T6D r0 = new X.T6D
            r0.<init>(r7, r6)
            r1.put(r4, r0)
        L_0x0326:
            java.lang.String r1 = "bug_id"
            r0 = r18
            X.1OC r4 = X.DbT.A0T(r5, r1, r0)
            r6 = 18
            X.Phi r1 = new X.Phi
            r5 = r45
            r0 = r23
            r1.<init>(r0, r5, r6)
            X.0qQ.A0A(r22)
            r6 = r22
            r0 = r19
            X.0qQ.A0B(r6, r0)
            r0 = r41
            long r12 = r0.A00
            java.lang.String r6 = X.002.A0A(r12, r6)
            int r10 = r6.hashCode()
            int r6 = r46 * 31
            int r10 = r10 + r6
            com.facebook.quicklog.QuickPerformanceLogger r8 = r0.A01
            r9 = 396371619(0x17a026a3, float:1.0349511E-24)
            r8.markerStart(r9, r10)
            java.lang.String r11 = "server_bug_id"
            r8.markerAnnotate(r9, r10, r11, r12)
            java.lang.String r7 = r0.A02
            java.lang.String r6 = "client_server_join_key"
            r8.markerAnnotate(r9, r10, r6, r7)
            java.lang.String r7 = "file_name"
            r6 = r22
            r8.markerAnnotate(r9, r10, r7, r6)
            java.lang.String r42 = "file_size"
            r39 = r8
            r40 = r9
            r41 = r10
            r39.markerAnnotate(r40, r41, r42, r43)
            java.lang.String r6 = "retry_num"
            r8.markerAnnotate(r9, r10, r6, r2)
            r7 = 0
            int r6 = (r43 > r7 ? 1 : (r43 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x0398
            java.lang.Integer r8 = X.AnonymousClass05K.A0N
            java.lang.String r5 = "fileSize == 0"
            r3 = r0
            r4 = r22
            r6 = r2
            r7 = r19
            r3.A00(r4, r5, r6, r7, r8)
            r1.invoke()
            return
        L_0x0394:
            r5.A06(r7, r4)
            goto L_0x0326
        L_0x0398:
            X.NM9 r6 = new X.NM9
            r26 = r0
            r27 = r3
            r28 = r24
            r30 = r22
            r31 = r23
            r32 = r5
            r33 = r1
            r34 = r2
            r24 = r6
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r4.A00 = r6
            if (r46 <= 0) goto L_0x03ce
            r3 = 0
            r1 = 1
        L_0x03b5:
            r0 = r3
            r3 = r1
            if (r2 > 0) goto L_0x03ca
            int r0 = r0 * 5000
            r35 = 953404791(0x38d3cd77, float:1.0099535E-4)
            r36 = 4
            r39 = r19
            r34 = r4
            r37 = r0
            X.1ES.A04(r34, r35, r36, r37, r38, r39)
            return
        L_0x03ca:
            int r2 = r2 + -1
            int r1 = r1 + r0
            goto L_0x03b5
        L_0x03ce:
            X.1ES.A02(r4)
            return
        L_0x03d2:
            r0 = 26
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x03dd:
            java.lang.String r0 = "null attachment path received"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x03e4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x03e9:
            r1 = move-exception
            java.lang.String r0 = "Failed to read attachment"
            X.0KC.A0G(r3, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71132OdV.A04(android.content.Context, X.OKd, com.instagram.bugreporter.model.BugReport, X.0lg, java.io.File, java.util.concurrent.CountDownLatch, int, long):void");
    }

    public final void A05(Context context, BugReportComposerViewModel bugReportComposerViewModel, C74547Pwg pwg, BugReport bugReport, 0lg r32) {
        Collection A1F;
        String str;
        NetworkInfo networkInfo;
        String str2;
        String str3;
        String str4;
        BugReport bugReport2 = bugReport;
        Context context2 = context;
        BugReportComposerViewModel bugReportComposerViewModel2 = bugReportComposerViewModel;
        C51973G9u.A1E(context2, bugReport2, bugReportComposerViewModel2);
        C74547Pwg pwg2 = pwg;
        0lg r5 = r32;
        int A08 = C51970G9q.A08(3, pwg2, r5);
        C70758OKe oKe = new C70758OKe(bugReport2.A0G);
        pwg2.AVw();
        if (!182.A06(0Tu.A05, r5, 36327889951603472L)) {
            OWB owb = new OWB();
            owb.A02(bugReport2);
            owb.A0J = AnonymousClass7TE.A1D(AnonymousClass7TE.A1D(00k.A0S(bugReport2.A0J, bugReport2.A0M)));
            0sn r0 = 0sn.A00;
            0qQ.A0B(r0, 0);
            owb.A0M = r0;
            bugReport2 = owb.A01();
        }
        List list = bugReport2.A0L;
        if (list.isEmpty()) {
            A1F = bugReport2.A0K;
        } else {
            A1F = 0Yv.A1F(list);
        }
        ArrayList A0S = 00k.A0S(bugReport2.A0J, A1F);
        List list2 = bugReport2.A0M;
        0eP A012 = A01((Integer) null, A0S);
        0eP A013 = A01(Integer.valueOf(DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE), list2);
        Collection collection = (Collection) A012.A00;
        List list3 = (List) A013.A00;
        Object obj = A012.A01;
        Object obj2 = obj;
        List list4 = (List) A013.A01;
        AnonymousClass7TF.A1B(collection, 1, list3);
        0qQ.A0B(obj, 3);
        ArrayList A0q = AnonymousClass7TF.A0q(list4, A08);
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : list4) {
            if (((0eP) next).A01 == C69299Nj0.FILE_TOO_BIG) {
                A0q.add(next);
            } else {
                A1C.add(next);
            }
        }
        0eP A1L = AnonymousClass7TE.A1L(A0q, A1C);
        Iterable iterable = (Iterable) A1L.A00;
        Object obj3 = A1L.A01;
        Object obj4 = obj3;
        ArrayList A0S2 = 00k.A0S(iterable, collection);
        DbW.A1N(obj3, A08, iterable);
        ArrayList A0S3 = 00k.A0S(list3, A0S2);
        ArrayList A0r = AnonymousClass7TG.A0r(list3);
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            A0r.add(AnonymousClass7TE.A0t(((BugReportAttachment) JTO.A1A(it).A00).A03));
        }
        JSONObject A11 = DbS.A11();
        Iterator it2 = A0r.iterator();
        while (it2.hasNext()) {
            A11.put(((File) it2.next()).getName(), 1);
        }
        try {
            str = A11.toString();
        } catch (Throwable th) {
            str = new 0eQ(th);
        }
        if (0eR.A00(str) != null) {
            str = "{}";
        }
        0qQ.A09(str);
        QuickPerformanceLogger quickPerformanceLogger = oKe.A01;
        int i = oKe.A00;
        quickPerformanceLogger.markerStart(396363964, i);
        quickPerformanceLogger.markerAnnotate(396363964, i, "endpoint", "graphql");
        quickPerformanceLogger.markerAnnotate(396363964, i, "client_server_join_key", oKe.A02);
        quickPerformanceLogger.markerAnnotate(396363964, i, "sync_attachments", str);
        ConnectivityManager connectivityManager = (ConnectivityManager) context2.getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        QNI qni = new QNI();
        String str5 = bugReport2.A0A;
        String str6 = bugReport2.A07;
        if (str5 == null) {
            str5 = "";
        }
        if (str6 == null) {
            str6 = "";
        }
        qni.A07(0rw.A0t(002.A11("\n            ", str5, "\n            ", str6, "\n            ")), DevServerEntity.COLUMN_DESCRIPTION);
        String str7 = bugReport2.A08;
        if (str7 == null) {
            str7 = "493186350727442";
        }
        qni.A07(str7, "category_id");
        qni.A07(bugReport2.A00.toString(), "source");
        qni.A07(1ND.A00(r5).A02, "claim");
        qni.A07(bugReport2.A0H, "endpoint");
        qni.A07(bugReport2.A0B, "nav_chain");
        qni.A07(String.valueOf(C61120lW.A00()), "build_num");
        if (networkInfo != null) {
            str2 = networkInfo.getTypeName();
        } else {
            str2 = null;
        }
        qni.A07(str2, AnonymousClass000.A00(173));
        if (networkInfo != null) {
            str3 = networkInfo.getSubtypeName();
        } else {
            str3 = null;
        }
        qni.A07(str3, AnonymousClass000.A00(1612));
        qni.A07(A00("misc_info", new C73679Phs(0, bugReport2, r5, A0S3, obj2, iterable, context2, bugReportComposerViewModel2, obj4)), "misc_info");
        qni.A07(A00("attachment_file_names", new C20606Wvn(A0S3, 1)), "attachment_file_names");
        0Df.A00(qni.A02(), Boolean.valueOf(bugReportComposerViewModel2.A03), "has_complete_logs_consent");
        qni.A05("files", (List) null);
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        for (Object next2 : list3) {
            if (((0eP) next2).A01 == C69299Nj0.FILE_VALID) {
                A1C2.add(next2);
            }
        }
        ArrayList A1C3 = AnonymousClass7TE.A1C();
        Iterator it3 = A1C2.iterator();
        while (it3.hasNext()) {
            File A0t = AnonymousClass7TE.A0t(((BugReportAttachment) JTO.A1A(it3).A00).A03);
            if (A0t.exists()) {
                try {
                    if (C70352O3e.A00(A0t)) {
                        str4 = "application/gzip";
                        2IV r6 = new 2IV();
                        r6.A09(A0t.getName(), PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                        r6.A09(str4, "mimetype");
                        r6.A09(Base64.encodeToString(C272134kB.A03(A0t), 0), "data");
                        A1C3.add(r6);
                    }
                } catch (IOException e) {
                    0KC.A0F("BugReporterUploader", "Unable to detect gzip compression for sync attachment file", e);
                }
                str4 = 0mf.A00(A0t.getPath());
                2IV r62 = new 2IV();
                r62.A09(A0t.getName(), PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                r62.A09(str4, "mimetype");
                r62.A09(Base64.encodeToString(C272134kB.A03(A0t), 0), "data");
                A1C3.add(r62);
            }
        }
        qni.A05("sync_inline_attachments", A1C3);
        2IS A04 = C41845B3m.A04();
        A04.A00(qni, "input");
        1OC A05 = JTS.A0S(A04, r5, C68129N1s.class, "IGBugReportSubmitMutation", true).A05();
        A05.A00 = new C15608Ufa(0, context2, bugReportComposerViewModel2, oKe, bugReport2, r5, A0S2);
        1ES.A02(A05);
    }

    public static final String A00(String str, C62320sa r5) {
        try {
            return r5.invoke().toString();
        } catch (JSONException e) {
            String A0S = 002.A0S("Error constructing JSON for Flytrap bug report field '", str, '\'');
            0qQ.A0B(A0S, 1);
            0f9 AEf = 0wj.A01.AEf("BugReporterUploader", 817892340);
            AEf.ABQ(DialogModule.KEY_MESSAGE, A0S);
            AEf.ERJ(e);
            AEf.report();
            return "";
        }
    }

    public static final 0eP A01(Integer num, Iterable iterable) {
        C69299Nj0 nj0;
        LinkedHashMap A0x = DbS.A0x(JTT.A08(iterable));
        for (Object next : iterable) {
            File A0t = AnonymousClass7TE.A0t(((BugReportAttachment) next).A03);
            if (!A0t.exists()) {
                C66580MXl.A1U("Discarding non-existent bug report attachment file ", A0t.getName(), "BugReportAttachmentValidity");
                nj0 = C69299Nj0.FILE_MISSING;
            } else if (A0t.length() == 0) {
                C66580MXl.A1U("Discarding zero-length bug report attachment file: ", A0t.getName(), "BugReportAttachmentValidity");
                nj0 = C69299Nj0.FILE_EMPTY;
            } else if (num == null || A0t.length() <= ((long) num.intValue())) {
                nj0 = C69299Nj0.FILE_VALID;
            } else {
                C66580MXl.A1U("Discarding oversized bug report attachment file: ", A0t.getName(), "BugReportAttachmentValidity");
                nj0 = C69299Nj0.FILE_TOO_BIG;
            }
            A0x.put(next, nj0);
        }
        List A002 = 01U.A00(A0x);
        ArrayList A1C = AnonymousClass7TE.A1C();
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        for (Object next2 : A002) {
            if (((0eP) next2).A01 == C69299Nj0.FILE_VALID) {
                A1C.add(next2);
            } else {
                A1C2.add(next2);
            }
        }
        return AnonymousClass7TE.A1L(A1C, A1C2);
    }
}
