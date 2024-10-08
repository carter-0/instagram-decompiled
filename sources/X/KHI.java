package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;

public final class KHI extends 2Cl {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C63578KzR A01;
    public final /* synthetic */ AnonymousClass4DH A02;
    public final /* synthetic */ AnonymousClass0aP A03;
    public final /* synthetic */ C48259Ebe A04;
    public final /* synthetic */ LQc A05;
    public final /* synthetic */ C46634DiE A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;

    public final int getRunnableId() {
        return 1981478238;
    }

    public KHI(View view, C63578KzR kzR, AnonymousClass4DH r3, AnonymousClass0aP r4, C48259Ebe ebe, LQc lQc, C46634DiE diE, String str, String str2, String str3) {
        this.A05 = lQc;
        this.A03 = r4;
        this.A06 = diE;
        this.A01 = kzR;
        this.A00 = view;
        this.A09 = str;
        this.A08 = str2;
        this.A07 = str3;
        this.A02 = r3;
        this.A04 = ebe;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0087, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0088, code lost:
        r13 = r2.getMessage();
        r14 = android.text.TextUtils.join("\n", r2.getStackTrace());
        X.AnonymousClass7TF.A1H(r6, r8);
        X.C49944FFx.A00(r6, false, r8, "client_auth_response_not_found", "auto_conf_client_authenticate_failed", "optimistic_authentication_flow", "ar_code_sms", r13, r14, "authenticate_exception_caught", (java.lang.String) null);
        X.0wb.A06("FeO2IntegrateHelper", "auto_conf_client_authenticate_failed", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ac, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0087 A[ExcHandler: 6GV | RemoteException | SecurityException (r2v1 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x0024] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r24 = this;
            r16 = 0
            X.FFx r17 = X.C49944FFx.A00
            r2 = r24
            X.0aP r6 = r2.A03
            X.DiE r0 = r2.A06
            java.lang.String r8 = r0.A01
            java.lang.String r11 = "optimistic_authentication_flow"
            X.LQc r1 = r2.A05
            X.S6k r0 = X.LQc.A07
            java.lang.String r12 = "ar_code_sms"
            java.lang.String r20 = "client_auth_request_generate_auth_response"
            java.lang.String r21 = "authenticate query called to feo2 client"
            r18 = r6
            r19 = r8
            r22 = r11
            r23 = r12
            r17.A04(r18, r19, r20, r21, r22, r23)
            r5 = 0
            X.LQW r4 = r1.A02     // Catch:{ 6GV | RemoteException | SecurityException -> 0x0087 }
            X.KzR r3 = r2.A01     // Catch:{ 6GV | RemoteException | SecurityException -> 0x0087 }
            android.os.Bundle r2 = r3.A00     // Catch:{ 6GV | RemoteException | SecurityException -> 0x0087 }
            java.lang.Class r1 = X.LSS.A00(r2)     // Catch:{ 6GV | RemoteException | SecurityException -> 0x0087 }
            java.lang.String r0 = "useDebugKey"
            X.LSS.A02(r2, r1, r0)     // Catch:{ 6GV | RemoteException | SecurityException -> 0x0087 }
            java.lang.String r0 = "allowMultiSession"
            X.LSS.A02(r2, r1, r0)     // Catch:{ 6GV | RemoteException | SecurityException -> 0x0087 }
            android.os.Bundle r0 = X.AnonymousClass7TE.A0a()     // Catch:{ 6GV | RemoteException | SecurityException -> 0x0087 }
            r3.A00 = r0     // Catch:{ 6GV | RemoteException | SecurityException -> 0x0087 }
            android.os.Bundle r0 = X.LQW.A00(r2, r4)     // Catch:{ Exception -> 0x007f, 6GV | RemoteException | SecurityException -> 0x0087, 6GV | RemoteException | SecurityException -> 0x0087 }
            if (r0 != 0) goto L_0x0045
            goto L_0x0052
        L_0x0045:
            android.os.Bundle r3 = r0.deepCopy()     // Catch:{ Exception -> 0x007f, 6GV | RemoteException | SecurityException -> 0x0087, 6GV | RemoteException | SecurityException -> 0x0087 }
            if (r3 == 0) goto L_0x0078
            java.lang.String r0 = "response"
            X.LSS.A04(r0, r3)     // Catch:{ Exception -> 0x007f, 6GV | RemoteException | SecurityException -> 0x0087, 6GV | RemoteException | SecurityException -> 0x0087 }
            r0 = 1
            goto L_0x0054
        L_0x0052:
            r3 = 0
            r0 = 0
        L_0x0054:
            if (r0 != 0) goto L_0x005e
            java.lang.String r20 = "client_auth_response_not_found"
            java.lang.String r21 = "empty_auto_conf_authenticate_result"
            r17.A04(r18, r19, r20, r21, r22, r23)     // Catch:{ 6GV | RemoteException | SecurityException -> 0x0087 }
            return r5
        L_0x005e:
            java.lang.String r20 = "client_auth_response_found"
            r21 = r5
            r17.A04(r18, r19, r20, r21, r22, r23)     // Catch:{ 6GV | RemoteException | SecurityException -> 0x0087 }
            X.S6k r2 = X.LQc.A07     // Catch:{ 6GV | RemoteException | SecurityException -> 0x0087 }
            java.lang.String r1 = "response"
            boolean r0 = r3.containsKey(r1)     // Catch:{ 6GV | RemoteException | SecurityException -> 0x0087 }
            if (r0 == 0) goto L_0x0081
            byte[] r0 = r3.getByteArray(r1)     // Catch:{ 6GV | RemoteException | SecurityException -> 0x0087 }
            java.lang.String r5 = r2.A02(r0)     // Catch:{ 6GV | RemoteException | SecurityException -> 0x0087 }
            return r5
        L_0x0078:
            java.lang.String r0 = "Bundle is null"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)     // Catch:{ Exception -> 0x007f, 6GV | RemoteException | SecurityException -> 0x0087, 6GV | RemoteException | SecurityException -> 0x0087 }
            throw r0     // Catch:{ Exception -> 0x007f, 6GV | RemoteException | SecurityException -> 0x0087, 6GV | RemoteException | SecurityException -> 0x0087 }
        L_0x007f:
            r0 = move-exception
            goto L_0x0086
        L_0x0081:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ 6GV | RemoteException | SecurityException -> 0x0087 }
            r0.<init>()     // Catch:{ 6GV | RemoteException | SecurityException -> 0x0087 }
        L_0x0086:
            throw r0     // Catch:{ 6GV | RemoteException | SecurityException -> 0x0087 }
        L_0x0087:
            r2 = move-exception
            java.lang.String r10 = "auto_conf_client_authenticate_failed"
            java.lang.String r13 = r2.getMessage()
            java.lang.StackTraceElement[] r1 = r2.getStackTrace()
            java.lang.String r0 = "\n"
            java.lang.String r14 = android.text.TextUtils.join(r0, r1)
            java.lang.String r9 = "client_auth_response_not_found"
            java.lang.String r15 = "authenticate_exception_caught"
            r0 = 0
            X.AnonymousClass7TF.A1H(r6, r8)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
            X.C49944FFx.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r0 = "FeO2IntegrateHelper"
            X.0wb.A06(r0, r10, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KHI.call():java.lang.Object");
    }

    public final void onFail(Exception exc) {
        AnonymousClass0aP r2 = this.A03;
        String str = this.A06.A01;
        String str2 = this.A08;
        C11032S6k s6k = LQc.A07;
        String message = exc.getMessage();
        String join = TextUtils.join("\n", exc.getStackTrace());
        String A002 = AnonymousClass000.A00(2789);
        AnonymousClass7TF.A1H(r2, str);
        C49944FFx.A00(r2, false, str, A002, "authentication request to FeO2 client failed", str2, "ar_code_sms", message, join, (String) null, (String) null);
        this.A04.A00();
    }

    public final void onFinish() {
        AnonymousClass7TH.A0R(this.A00);
        KHI.super.onFinish();
    }

    public final void onStart() {
        AnonymousClass7TF.A16(this.A00);
        KHI.super.onStart();
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str = (String) obj;
        if (str != null) {
            C49944FFx fFx = C49944FFx.A00;
            AnonymousClass0aP r5 = this.A03;
            C46634DiE diE = this.A06;
            String str2 = diE.A01;
            LQc lQc = this.A05;
            C11032S6k s6k = LQc.A07;
            fFx.A04(r5, str2, "client_auth_request_auth_service", "client sends auth response to server to authenticate", "optimistic_authentication_flow", "ar_code_sms");
            Context context = lQc.A00;
            String str3 = this.A09;
            1OC A062 = FHA.A06(context, r5, str3, "111111", this.A08, (String) null, str, this.A07);
            AnonymousClass4DH r4 = this.A02;
            A062.A00 = new EMJ(r4.getRootActivity(), (AnonymousClass0iw) r4, r5, (G8H) new C50515Fdb(r4.requireActivity()), this, diE, AnonymousClass05K.A01, str3);
            1ES.A03(A062);
            return;
        }
        this.A04.A00();
    }
}
