package com.instagram.urlhandlers.live;

import X.AnonymousClass0wW;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public class LiveExternalUrlHandlerActivity extends BaseFragmentActivity {
    public AnonymousClass0wW A00;

    public final void A0j(Bundle bundle) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: androidx.fragment.app.FragmentActivity} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r20) {
        /*
            r19 = this;
            r0 = -320039085(0xffffffffecec9753, float:-2.2881688E27)
            int r5 = X.AnonymousClass0fD.A00(r0)
            r6 = r19
            r0 = r20
            super.onCreate(r0)
            android.os.Bundle r4 = X.DbX.A0A(r6)
            if (r4 == 0) goto L_0x00bd
            java.lang.String r1 = "original_url"
            java.lang.String r0 = r4.getString(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00bd
            X.0wW r0 = X.DbT.A0W(r4)
            r6.A00 = r0
            java.lang.String r0 = r4.getString(r1)
            r11 = 0
            android.net.Uri r2 = X.0cp.A03(r0)
            if (r2 != 0) goto L_0x003b
            r6.finish()
            r0 = -471731562(0xffffffffe3e1f296, float:-8.335995E21)
        L_0x0037:
            X.AnonymousClass0fD.A07(r0, r5)
            return
        L_0x003b:
            X.EVh r0 = X.C48089EVh.INSTAGRAM
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = r2.getScheme()
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x006d
            java.lang.String r1 = r2.getHost()
            java.lang.String r0 = "live_camera"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x006d
            X.14B r0 = X.AnonymousClass14B.A00()
            android.content.Intent r0 = r0.A01(r6)
            android.content.Intent r0 = r0.setData(r2)
            X.DbV.A19(r6, r0)
            r6.finish()
            r0 = -1684788246(0xffffffff9b942bea, float:-2.4512925E-22)
            goto L_0x0037
        L_0x006d:
            java.util.List r9 = r2.getPathSegments()
            java.lang.Object r0 = X.AnonymousClass7TE.A13(r9)
            java.lang.String r0 = (java.lang.String) r0
            android.os.Bundle r8 = X.AnonymousClass7TE.A0a()
            java.lang.String r7 = "InstagramUrlLaunchConstants.EXTRA_USER_NAME"
            r8.putString(r7, r0)
            java.lang.Integer r10 = X.AnonymousClass05K.A0C
            r14 = 0
            int r0 = r9.size()
            java.lang.String r3 = "InstagramUrlLaunchConstants.EXTRA_AUTO_LAUNCH_REEL_PARAMS"
            r2 = 2
            if (r0 == r2) goto L_0x0097
            int r1 = r9.size()
            r0 = 3
            if (r1 != r0) goto L_0x00bb
            java.lang.String r14 = X.AnonymousClass7TE.A19(r9, r2)
        L_0x0097:
            r15 = 0
            r16 = 1
            com.instagram.profile.intf.AutoLaunchReelParams r9 = new com.instagram.profile.intf.AutoLaunchReelParams
            r12 = r11
            r13 = r11
            r17 = r15
            r18 = r15
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r8.putParcelable(r3, r9)
        L_0x00a8:
            r4.putAll(r8)
            boolean r0 = r4.containsKey(r7)
            if (r0 == 0) goto L_0x00b6
            X.0wW r0 = r6.A00
            X.FHB.A0A(r4, r6, r0)
        L_0x00b6:
            r0 = -1528531820(0xffffffffa4e47494, float:-9.907673E-17)
            goto L_0x0037
        L_0x00bb:
            r8 = r11
            goto L_0x00a8
        L_0x00bd:
            r6.finish()
            r0 = -512565558(0xffffffffe172deca, float:-2.8001036E20)
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.live.LiveExternalUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}
