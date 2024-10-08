package X;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import com.instagram.common.session.UserSession;

public final class KHD extends 2Cl {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Et7 A01;
    public final /* synthetic */ AnonymousClass0iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C47667ECb A04;
    public final /* synthetic */ LQc A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a6, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ae, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00af, code lost:
        r24 = r2.getMessage();
        r25 = android.text.TextUtils.join("\n", r2.getStackTrace());
        X.AnonymousClass7TF.A1H(r9, r11);
        X.C49944FFx.A00(r9, false, r11, "client_reg_query_verifier_failed", "exception when getting enc verifier from feo2 client", r22, r23, r24, r25, (java.lang.String) null, (java.lang.String) null);
        X.0wb.A06("FeO2IntegrateHelper", "auto_conf_client_register_failed", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00db, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ae A[ExcHandler: 6GV | RemoteException | SecurityException (r2v1 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x001f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r28 = this;
            r3 = 0
            X.FFx r17 = X.C49944FFx.A00
            r2 = r28
            com.instagram.common.session.UserSession r9 = r2.A03
            java.lang.String r11 = r2.A08
            java.lang.String r14 = "registration_flow"
            java.lang.String r15 = r2.A07
            java.lang.String r20 = "client_reg_request_create_and_acquire_verifier"
            r16 = 0
            r18 = r9
            r19 = r11
            r21 = r3
            r22 = r14
            r23 = r15
            r17.A04(r18, r19, r20, r21, r22, r23)
            r8 = 0
            X.LQc r1 = r2.A05     // Catch:{ 6GV | RemoteException | SecurityException -> 0x00ae }
            X.S6k r0 = X.LQc.A07     // Catch:{ 6GV | RemoteException | SecurityException -> 0x00ae }
            X.LQW r6 = r1.A02     // Catch:{ 6GV | RemoteException | SecurityException -> 0x00ae }
            X.Et7 r2 = r2.A01     // Catch:{ 6GV | RemoteException | SecurityException -> 0x00ae }
            android.os.Bundle r7 = r2.A00     // Catch:{ 6GV | RemoteException | SecurityException -> 0x00ae }
            java.lang.String r0 = "requestMessage"
            X.LSS.A04(r0, r7)     // Catch:{ 6GV | RemoteException | SecurityException -> 0x00ae }
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            java.lang.String r0 = "auxAttributes"
            X.LSS.A02(r7, r1, r0)     // Catch:{ 6GV | RemoteException | SecurityException -> 0x00ae }
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            java.lang.String r0 = "useDebugKey"
            X.LSS.A02(r7, r1, r0)     // Catch:{ 6GV | RemoteException | SecurityException -> 0x00ae }
            java.lang.String r0 = "backupAttributes"
            X.LSS.A02(r7, r1, r0)     // Catch:{ 6GV | RemoteException | SecurityException -> 0x00ae }
            android.os.Bundle r0 = X.AnonymousClass7TE.A0a()     // Catch:{ 6GV | RemoteException | SecurityException -> 0x00ae }
            r2.A00 = r0     // Catch:{ 6GV | RemoteException | SecurityException -> 0x00ae }
            android.net.Uri r5 = r6.A01     // Catch:{ Exception -> 0x00a6, 6GV | RemoteException | SecurityException -> 0x00ae, 6GV | RemoteException | SecurityException -> 0x00ae }
            X.Ru3 r4 = r6.A02     // Catch:{ Exception -> 0x00a6, 6GV | RemoteException | SecurityException -> 0x00ae, 6GV | RemoteException | SecurityException -> 0x00ae }
            android.content.ContentResolver r1 = r6.A00     // Catch:{ Exception -> 0x00a6, 6GV | RemoteException | SecurityException -> 0x00ae, 6GV | RemoteException | SecurityException -> 0x00ae }
            java.lang.String r2 = "register"
            android.os.Bundle r0 = r7.deepCopy()     // Catch:{ Exception -> 0x00a6, 6GV | RemoteException | SecurityException -> 0x00ae, 6GV | RemoteException | SecurityException -> 0x00ae }
            android.os.Bundle r1 = X.S92.A00(r1, r5, r0, r4, r2)     // Catch:{ Exception -> 0x00a6, 6GV | RemoteException | SecurityException -> 0x00ae, 6GV | RemoteException | SecurityException -> 0x00ae }
            X.LLu r0 = X.C64076LLu.A01     // Catch:{ Exception -> 0x00a6, 6GV | RemoteException | SecurityException -> 0x00ae, 6GV | RemoteException | SecurityException -> 0x00ae }
            X.1Tr r0 = r6.A03     // Catch:{ Exception -> 0x00a6, 6GV | RemoteException | SecurityException -> 0x00ae, 6GV | RemoteException | SecurityException -> 0x00ae }
            X.S92.A01(r1, r0, r2)     // Catch:{ Exception -> 0x00a6, 6GV | RemoteException | SecurityException -> 0x00ae, 6GV | RemoteException | SecurityException -> 0x00ae }
            if (r1 != 0) goto L_0x0064
            r0 = 0
        L_0x0061:
            if (r0 != 0) goto L_0x0087
            goto L_0x0071
        L_0x0064:
            android.os.Bundle r3 = r1.deepCopy()     // Catch:{ Exception -> 0x00a6, 6GV | RemoteException | SecurityException -> 0x00ae, 6GV | RemoteException | SecurityException -> 0x00ae }
            if (r3 == 0) goto L_0x009f
            java.lang.String r0 = "verifier"
            X.LSS.A04(r0, r3)     // Catch:{ Exception -> 0x00a6, 6GV | RemoteException | SecurityException -> 0x00ae, 6GV | RemoteException | SecurityException -> 0x00ae }
            r0 = 1
            goto L_0x0061
        L_0x0071:
            java.lang.String r12 = "client_reg_query_verifier_failed"
            java.lang.String r13 = "empty enc verifier from feo2 client"
            java.lang.String r18 = "null enc verifier from feo2 client"
            r0 = 0
            X.AnonymousClass7TF.A1H(r9, r11)     // Catch:{ 6GV | RemoteException | SecurityException -> 0x00ae }
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r0)     // Catch:{ 6GV | RemoteException | SecurityException -> 0x00ae }
            r17 = r8
            r19 = r8
            X.C49944FFx.A00(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ 6GV | RemoteException | SecurityException -> 0x00ae }
            return r8
        L_0x0087:
            java.lang.String r20 = "client_reg_query_verifier_success"
            r17.A04(r18, r19, r20, r21, r22, r23)     // Catch:{ 6GV | RemoteException | SecurityException -> 0x00ae }
            X.S6k r2 = X.LQc.A07     // Catch:{ 6GV | RemoteException | SecurityException -> 0x00ae }
            java.lang.String r1 = "verifier"
            boolean r0 = r3.containsKey(r1)     // Catch:{ 6GV | RemoteException | SecurityException -> 0x00ae }
            if (r0 == 0) goto L_0x00a8
            byte[] r0 = r3.getByteArray(r1)     // Catch:{ 6GV | RemoteException | SecurityException -> 0x00ae }
            java.lang.String r8 = r2.A02(r0)     // Catch:{ 6GV | RemoteException | SecurityException -> 0x00ae }
            return r8
        L_0x009f:
            java.lang.String r0 = "Bundle is null"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)     // Catch:{ Exception -> 0x00a6, 6GV | RemoteException | SecurityException -> 0x00ae, 6GV | RemoteException | SecurityException -> 0x00ae }
            throw r0     // Catch:{ Exception -> 0x00a6, 6GV | RemoteException | SecurityException -> 0x00ae, 6GV | RemoteException | SecurityException -> 0x00ae }
        L_0x00a6:
            r0 = move-exception
            goto L_0x00ad
        L_0x00a8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ 6GV | RemoteException | SecurityException -> 0x00ae }
            r0.<init>()     // Catch:{ 6GV | RemoteException | SecurityException -> 0x00ae }
        L_0x00ad:
            throw r0     // Catch:{ 6GV | RemoteException | SecurityException -> 0x00ae }
        L_0x00ae:
            r2 = move-exception
            java.lang.String r24 = r2.getMessage()
            java.lang.StackTraceElement[] r1 = r2.getStackTrace()
            java.lang.String r0 = "\n"
            java.lang.String r25 = android.text.TextUtils.join(r0, r1)
            java.lang.String r20 = "client_reg_query_verifier_failed"
            java.lang.String r21 = "exception when getting enc verifier from feo2 client"
            r0 = 0
            X.AnonymousClass7TF.A1H(r9, r11)
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r0)
            r17 = r9
            r19 = r11
            r26 = r8
            r27 = r8
            X.C49944FFx.A00(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            java.lang.String r1 = "FeO2IntegrateHelper"
            java.lang.String r0 = "auto_conf_client_register_failed"
            X.0wb.A06(r1, r0, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KHD.call():java.lang.Object");
    }

    public final int getRunnableId() {
        return 1654495535;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str = (String) obj;
        if (str != null) {
            C49944FFx fFx = C49944FFx.A00;
            UserSession userSession = this.A03;
            String str2 = this.A08;
            String str3 = this.A07;
            fFx.A04(userSession, str2, "client_reg_request_register_feo2_service", "register query called to feo2 client", "registration_flow", str3);
            LQc lQc = this.A05;
            C11032S6k s6k = LQc.A07;
            1OC A09 = FHA.A09(lQc.A00, userSession, str, this.A06, str3, true);
            A09.A00 = this.A04;
            1ES.A03(A09);
            return;
        }
        C46413Dea.A06(this.A00, (Uri) null, this.A02, this.A03);
    }

    public KHD(Activity activity, Et7 et7, AnonymousClass0iw r3, UserSession userSession, C47667ECb eCb, LQc lQc, String str, String str2, String str3) {
        this.A05 = lQc;
        this.A03 = userSession;
        this.A08 = str;
        this.A07 = str2;
        this.A01 = et7;
        this.A06 = str3;
        this.A04 = eCb;
        this.A00 = activity;
        this.A02 = r3;
    }

    public final void onFail(Exception exc) {
        UserSession userSession = this.A03;
        String str = this.A08;
        C11032S6k s6k = LQc.A07;
        String message = exc.getMessage();
        String join = TextUtils.join("\n", exc.getStackTrace());
        AnonymousClass7TF.A1H(userSession, str);
        C49944FFx.A00(userSession, false, str, "client_reg_query_verifier_failed", "failure when getting enc verifier from feo2 client", "registration_flow", "ar_code_sms", message, join, (String) null, (String) null);
        C46413Dea.A06(this.A00, (Uri) null, this.A02, userSession);
    }
}
