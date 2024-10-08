package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;

public final class KHC extends 2Cl {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AnonymousClass4DH A01;
    public final /* synthetic */ 1P0 A02;
    public final /* synthetic */ AnonymousClass0aP A03;
    public final /* synthetic */ C48259Ebe A04;
    public final /* synthetic */ LQc A05;
    public final /* synthetic */ C46634DiE A06;
    public final /* synthetic */ Boolean A07;
    public final /* synthetic */ String A08;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0053, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005c, code lost:
        r10 = r2.getMessage();
        r11 = android.text.TextUtils.join("\n", r2.getStackTrace());
        X.AnonymousClass7TF.A1H(r4, r6);
        X.C49944FFx.A00(r4, false, r6, "client_start_message_not_found", "auto_conf_client_start_query_failed", (java.lang.String) null, r10, r11, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null);
        X.0wb.A06("FeO2IntegrateHelper", "auto_conf_client_start_query_failed", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0081, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005b A[ExcHandler: 6GV | RemoteException | SecurityException (r2v1 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x0013] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r15 = this;
            r3 = 0
            X.FFx r2 = X.C49944FFx.A00
            X.0aP r4 = r15.A03
            X.DiE r0 = r15.A06
            java.lang.String r6 = r0.A01
            r0 = 1173(0x495, float:1.644E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A02(r4, r6, r0)
            r9 = 0
            X.LQc r1 = r15.A05     // Catch:{ 6GV | RemoteException | SecurityException -> 0x005b }
            X.S6k r0 = X.LQc.A07     // Catch:{ 6GV | RemoteException | SecurityException -> 0x005b }
            X.LQW r1 = r1.A02     // Catch:{ 6GV | RemoteException | SecurityException -> 0x005b }
            android.os.Bundle r0 = X.AnonymousClass7TE.A0a()     // Catch:{ 6GV | RemoteException | SecurityException -> 0x005b }
            X.LSS.A01(r0)     // Catch:{ 6GV | RemoteException | SecurityException -> 0x005b }
            android.os.Bundle r0 = X.LQW.A01(r0, r1)     // Catch:{ Exception -> 0x0053, 6GV | RemoteException | SecurityException -> 0x005b, 6GV | RemoteException | SecurityException -> 0x005b }
            if (r0 != 0) goto L_0x0027
            goto L_0x0030
        L_0x0027:
            android.os.Bundle r3 = r0.deepCopy()     // Catch:{ Exception -> 0x0053, 6GV | RemoteException | SecurityException -> 0x005b, 6GV | RemoteException | SecurityException -> 0x005b }
            X.C62990Kpg.A00(r3)     // Catch:{ Exception -> 0x0053, 6GV | RemoteException | SecurityException -> 0x005b, 6GV | RemoteException | SecurityException -> 0x005b }
            r0 = 1
            goto L_0x0031
        L_0x0030:
            r0 = 0
        L_0x0031:
            if (r0 != 0) goto L_0x003b
            java.lang.String r1 = "client_start_message_not_found"
            java.lang.String r0 = "empty_auto_conf_start_query_result"
            r2.A03(r4, r6, r1, r0)     // Catch:{ 6GV | RemoteException | SecurityException -> 0x005b }
            return r9
        L_0x003b:
            java.lang.String r0 = "client_start_message_found"
            r2.A02(r4, r6, r0)     // Catch:{ 6GV | RemoteException | SecurityException -> 0x005b }
            X.S6k r2 = X.LQc.A07     // Catch:{ 6GV | RemoteException | SecurityException -> 0x005b }
            java.lang.String r1 = "startMessage"
            boolean r0 = r3.containsKey(r1)     // Catch:{ 6GV | RemoteException | SecurityException -> 0x005b }
            if (r0 == 0) goto L_0x0055
            byte[] r0 = r3.getByteArray(r1)     // Catch:{ 6GV | RemoteException | SecurityException -> 0x005b }
            java.lang.String r9 = r2.A02(r0)     // Catch:{ 6GV | RemoteException | SecurityException -> 0x005b }
            return r9
        L_0x0053:
            r0 = move-exception
            goto L_0x005a
        L_0x0055:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ 6GV | RemoteException | SecurityException -> 0x005b }
            r0.<init>()     // Catch:{ 6GV | RemoteException | SecurityException -> 0x005b }
        L_0x005a:
            throw r0     // Catch:{ 6GV | RemoteException | SecurityException -> 0x005b }
        L_0x005b:
            r2 = move-exception
            java.lang.String r8 = "auto_conf_client_start_query_failed"
            java.lang.String r10 = r2.getMessage()
            java.lang.StackTraceElement[] r1 = r2.getStackTrace()
            java.lang.String r0 = "\n"
            java.lang.String r11 = android.text.TextUtils.join(r0, r1)
            java.lang.String r7 = "client_start_message_not_found"
            r0 = 0
            X.AnonymousClass7TF.A1H(r4, r6)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            r12 = r9
            r13 = r9
            r14 = r9
            X.C49944FFx.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.String r0 = "FeO2IntegrateHelper"
            X.0wb.A06(r0, r8, r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KHC.call():java.lang.Object");
    }

    public final int getRunnableId() {
        return 1200830798;
    }

    public KHC(View view, AnonymousClass4DH r2, 1P0 r3, AnonymousClass0aP r4, C48259Ebe ebe, LQc lQc, C46634DiE diE, Boolean bool, String str) {
        this.A05 = lQc;
        this.A03 = r4;
        this.A06 = diE;
        this.A08 = str;
        this.A07 = bool;
        this.A01 = r2;
        this.A00 = view;
        this.A02 = r3;
        this.A04 = ebe;
    }

    public final void onFail(Exception exc) {
        AnonymousClass0aP r2 = this.A03;
        String str = this.A06.A01;
        String message = exc.getMessage();
        String join = TextUtils.join("\n", exc.getStackTrace());
        AnonymousClass7TF.A1H(r2, str);
        C49944FFx.A00(r2, false, str, "client_start_request_fail", "client start request to FeO2 fails", (String) null, message, join, (String) null, (String) null, (String) null);
        this.A04.A01();
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str = (String) obj;
        if (str != null) {
            C49944FFx fFx = C49944FFx.A00;
            AnonymousClass0aP r5 = this.A03;
            C46634DiE diE = this.A06;
            fFx.A03(r5, diE.A01, "client_start_request_query_verifier", "client sends start message to server to query verifier");
            LQc lQc = this.A05;
            C11032S6k s6k = LQc.A07;
            Context context = lQc.A00;
            String str2 = this.A08;
            Boolean bool = this.A07;
            boolean booleanValue = bool.booleanValue();
            1OC A002 = FHA.A00(context, r5, false, bool, str2, str, true, false);
            A002.A00 = new EDB(this.A00, this.A01, this.A02, r5, lQc, diE, str, str2, booleanValue);
            1ES.A03(A002);
            return;
        }
        this.A04.A01();
    }
}
