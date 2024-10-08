package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fik  reason: case insensitive filesystem */
public final class C50804Fik implements G6H {
    public final Activity A00;
    public final UserSession A01;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
        if (java.util.regex.Pattern.compile(".*survey.instagram.com.*").matcher(r1).find() == false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CI0(android.net.Uri r23, android.os.Bundle r24) {
        /*
            r22 = this;
            r8 = 0
            r1 = r23
            X.0qQ.A0B(r1, r8)
            java.lang.String r0 = "url"
            java.lang.String r1 = r1.getQueryParameter(r0)
            if (r1 == 0) goto L_0x001f
            java.lang.String r0 = ".*survey.instagram.com.*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            java.util.regex.Matcher r0 = r0.matcher(r1)
            boolean r0 = r0.find()
            r4 = 1
            if (r0 != 0) goto L_0x0020
        L_0x001f:
            r4 = 0
        L_0x0020:
            X.FEe r3 = com.instagram.simplewebview.SimpleWebViewActivity.A02
            r0 = r22
            android.app.Activity r2 = r0.A00
            com.instagram.common.session.UserSession r0 = r0.A01
            r6 = 0
            r10 = 1
            com.instagram.simplewebview.SimpleWebViewConfig r5 = new com.instagram.simplewebview.SimpleWebViewConfig
            r7 = r6
            r9 = r8
            r11 = r8
            r12 = r8
            r13 = r10
            r14 = r8
            r15 = r8
            r16 = r10
            r17 = r8
            r18 = r8
            r19 = r10
            r20 = r6
            r21 = r1
            r5.<init>((java.lang.String) r6, (java.lang.String) r7, (boolean) r8, (boolean) r9, (boolean) r10, (boolean) r11, (boolean) r12, (boolean) r13, (boolean) r14, (boolean) r15, (boolean) r16, (boolean) r17, (boolean) r18, (boolean) r19, (java.lang.String) r20, (java.lang.String) r21)
            r1 = 5652(0x1614, float:7.92E-42)
            if (r4 == 0) goto L_0x004e
            android.content.Intent r0 = X.C49906FEe.A00(r2, r0, r5)
            X.0kR.A07(r2, r0, r1)
            return
        L_0x004e:
            r3.A02(r2, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50804Fik.CI0(android.net.Uri, android.os.Bundle):void");
    }

    public C50804Fik(Activity activity, UserSession userSession) {
        this.A00 = activity;
        this.A01 = userSession;
    }
}
