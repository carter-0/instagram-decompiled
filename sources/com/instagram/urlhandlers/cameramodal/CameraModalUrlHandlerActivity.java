package com.instagram.urlhandlers.cameramodal;

import X.AnonymousClass0wW;
import X.AnonymousClass80L;
import X.AnonymousClass80N;
import X.AnonymousClass9QA;
import X.C279284yO;
import X.C363138jC;
import X.DbS;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public final class CameraModalUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    public static final C279284yO A00(String str) {
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case 3138974:
                if (str.equals("feed")) {
                    return C363138jC.A00;
                }
                return null;
            case 3322092:
                if (str.equals("live")) {
                    return AnonymousClass80L.A00;
                }
                return null;
            case 3496474:
                if (str.equals("reel")) {
                    return AnonymousClass80N.A00;
                }
                return null;
            case 109770997:
                if (str.equals("story")) {
                    return AnonymousClass9QA.A00;
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [com.instagram.base.activity.BaseFragmentActivity, java.lang.Object, com.instagram.urlhandlers.cameramodal.CameraModalUrlHandlerActivity, android.app.Activity] */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d3, code lost:
        if (X.C71172bH.A00() != null) goto L_0x00d5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r12) {
        /*
            r11 = this;
            r0 = -837402942(0xffffffffce163ec2, float:-6.3017382E8)
            int r4 = X.AnonymousClass0fD.A00(r0)
            super.onCreate(r12)
            android.os.Bundle r5 = X.DbX.A0A(r11)
            if (r5 == 0) goto L_0x00d5
            java.lang.String r3 = X.DbS.A0m(r5)
            if (r3 == 0) goto L_0x00d5
            X.08y r2 = X.09i.A0A
            X.0wW r1 = r2.A05(r11)
            boolean r0 = r1 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x00d9
            X.0wW r6 = r2.A05(r11)
            boolean r0 = r6 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x00dc
            if (r6 == 0) goto L_0x00dc
            android.net.Uri r8 = X.DbT.A09(r3)
            java.lang.String r10 = X.DbZ.A0h(r8)
            X.28D[] r9 = X.28D.values()
            int r7 = r9.length
            r3 = 0
        L_0x0038:
            r0 = 0
            if (r3 >= r7) goto L_0x0052
            r5 = r9[r3]
            long r1 = r5.A00
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            if (r10 == 0) goto L_0x0049
            java.lang.Long r0 = X.AnonymousClass7TE.A10(r10)
        L_0x0049:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0054
            int r3 = r3 + 1
            goto L_0x0038
        L_0x0052:
            X.28D r5 = X.28D.A5J
        L_0x0054:
            java.lang.String r0 = "target_mode"
            java.lang.String r0 = r8.getQueryParameter(r0)
            X.4yO r7 = A00(r0)
            java.lang.String r0 = "modes"
            java.lang.String r0 = r8.getQueryParameter(r0)
            if (r0 == 0) goto L_0x0088
            java.util.List r0 = X.DbX.A0x(r0)
            if (r0 == 0) goto L_0x0088
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r1 = r0.iterator()
        L_0x0074:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x008a
            java.lang.String r0 = X.AnonymousClass7TE.A18(r1)
            X.4yO r0 = A00(r0)
            if (r0 == 0) goto L_0x0074
            r2.add(r0)
            goto L_0x0074
        L_0x0088:
            X.0sn r2 = X.0sn.A00
        L_0x008a:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x00a0
            X.8jC r3 = X.C363138jC.A00
            X.80N r2 = X.AnonymousClass80N.A00
            X.9QA r1 = X.AnonymousClass9QA.A00
            X.80L r0 = X.AnonymousClass80L.A00
            X.4yO[] r0 = new X.C279284yO[]{r3, r2, r1, r0}
            java.util.List r2 = X.0sr.A1P(r0)
        L_0x00a0:
            X.Hrt r5 = X.C250563lf.A0C(r5)
            r3 = 1
            r5.A0m = r3
            r5.A0n = r3
            if (r7 == 0) goto L_0x00ad
            r5.A03 = r7
        L_0x00ad:
            java.util.Iterator r1 = r2.iterator()
        L_0x00b1:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00c1
            java.lang.Object r0 = r1.next()
            X.4yO r0 = (X.C279284yO) r0
            r5.A01(r0)
            goto L_0x00b1
        L_0x00c1:
            android.os.Bundle r1 = r5.A00()
            java.lang.String r0 = "modal_dismiss_on_cancel"
            r1.putBoolean(r0, r3)
            java.lang.String r0 = "clips_camera"
            X.Dba.A0l(r11, r1, r6, r0)
            X.2ZQ r0 = X.C71172bH.A00()
            if (r0 == 0) goto L_0x00dc
        L_0x00d5:
            r11.finish()
            goto L_0x00dc
        L_0x00d9:
            X.FFQ.A01(r11, r5, r1)
        L_0x00dc:
            r11.finish()
            r0 = 1489538304(0x58c88d00, float:1.76406333E15)
            X.AnonymousClass0fD.A07(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.cameramodal.CameraModalUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0S(this);
    }
}
