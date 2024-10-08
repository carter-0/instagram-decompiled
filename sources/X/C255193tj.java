package X;

import android.text.TextUtils;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.3tj  reason: invalid class name and case insensitive filesystem */
public abstract class C255193tj {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0043, code lost:
        if (r3.A03() != false) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C363928ka A00(com.instagram.common.session.UserSession r5) {
        /*
            X.1Av r0 = X.1Au.A00(r5)
            java.lang.String r2 = "captured_media_recovery_info"
            java.lang.String r1 = ""
            X.0xa r0 = r0.A01
            java.lang.String r1 = r0.getString(r2, r1)
            X.0qQ.A07(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            r4 = 0
            if (r0 == 0) goto L_0x0019
            return r4
        L_0x0019:
            X.16F r0 = X.16P.A00(r1)     // Catch:{ IOException -> 0x0024 }
            X.8ka r3 = X.C363948kc.parseFromJson(r0)     // Catch:{ IOException -> 0x0024 }
            if (r3 == 0) goto L_0x0045
            goto L_0x003f
        L_0x0024:
            r3 = move-exception
            X.0wj r2 = X.0wj.A01
            r1 = 817904119(0x30c039f7, float:1.3986313E-9)
            java.lang.String r0 = "CapturedMediaRecoveryUtil"
            X.0f9 r2 = r2.AEf(r0, r1)
            java.lang.String r1 = "message"
            java.lang.String r0 = "Failed to retrieve captured media recovery info"
            r2.ABQ(r1, r0)
            r2.ERJ(r3)
            r2.report()
            r3 = r4
            goto L_0x0045
        L_0x003f:
            boolean r0 = r3.A03()
            if (r0 != 0) goto L_0x0053
        L_0x0045:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322791825680804(0x810b63000529a4, double:3.034018038479011E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x0053
            return r4
        L_0x0053:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C255193tj.A00(com.instagram.common.session.UserSession):X.8ka");
    }

    public static void A01(UserSession userSession, C3499482o r3, C352218Cl r4) {
        C352218Cl r0;
        if (!r3.A0G()) {
            AnonymousClass82Y r1 = r3.A01;
            if (r1.A02() == null && !r4.A12 && !r4.A16) {
                C357638Yz r02 = r1.A0X;
                r02.getClass();
                if (!(r02.A08.A00 instanceof AnonymousClass80M)) {
                    C363928ka A00 = A00(userSession);
                    if (A00 != null && (r0 = A00.A03) != null && r0.equals(r4)) {
                        return;
                    }
                    if (r4.A0z) {
                        A02(userSession, new C363928ka(r4));
                        return;
                    }
                    r4.A0D.A01(new C363908kY(userSession, r4));
                }
            }
        }
    }

    public static void A02(UserSession userSession, C363928ka r5) {
        try {
            1Av A00 = 1Au.A00(userSession);
            StringWriter stringWriter = new StringWriter();
            17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
            C363948kc.A00(A0A, r5);
            A0A.close();
            String obj = stringWriter.toString();
            0qQ.A0B(obj, 0);
            0xY AR4 = A00.A01.AR4();
            AR4.E5g("captured_media_recovery_info", obj);
            AR4.apply();
            0xY AR42 = 1Au.A00(userSession).A01.AR4();
            AR42.E5T("has_ever_captured_media_for_recovery", true);
            AR42.apply();
        } catch (IOException e) {
            0f9 AEf = 0wj.A01.AEf("CapturedMediaRecoveryUtil", 817904119);
            AEf.ABQ(DialogModule.KEY_MESSAGE, "Failed to save recovery info");
            AEf.ERJ(e);
            AEf.report();
        }
    }

    public static boolean A03(UserSession userSession, C363928ka r6) {
        long currentTimeMillis = System.currentTimeMillis() - 86400000;
        if (!(!TextUtils.isEmpty(r6.A05)) || r6.A01 < currentTimeMillis) {
            return false;
        }
        if (!182.A06(0Tu.A05, userSession, 36322791825353120L) || new File(r6.A02()).exists()) {
            return true;
        }
        return false;
    }
}
