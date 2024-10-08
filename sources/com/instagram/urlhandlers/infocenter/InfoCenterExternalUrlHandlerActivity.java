package com.instagram.urlhandlers.infocenter;

import X.AnonymousClass05K;
import X.AnonymousClass0wW;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public final class InfoCenterExternalUrlHandlerActivity extends BaseFragmentActivity {
    public AnonymousClass0wW A00;
    public Integer A01 = AnonymousClass05K.A01;

    public final void A0j(Bundle bundle) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: androidx.fragment.app.FragmentActivity} */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bf, code lost:
        if (r5 != null) goto L_0x00c1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r19) {
        /*
            r18 = this;
            r0 = 840631933(0x321b067d, float:9.023663E-9)
            int r2 = X.AnonymousClass0fD.A00(r0)
            r12 = r18
            r0 = r19
            super.onCreate(r0)
            android.os.Bundle r3 = X.DbX.A0A(r12)
            if (r3 != 0) goto L_0x001e
            r12.finish()
            r0 = -481635949(0xffffffffe34ad193, float:-3.7413437E21)
        L_0x001a:
            X.AnonymousClass0fD.A07(r0, r2)
            return
        L_0x001e:
            X.0wW r13 = X.DbT.A0W(r3)
            r12.A00 = r13
            java.lang.String r8 = X.DbS.A0m(r3)
            if (r8 == 0) goto L_0x014e
            int r0 = r8.length()
            if (r0 == 0) goto L_0x014e
            java.lang.String r0 = "votinginfocenter"
            r4 = 0
            boolean r0 = X.00l.A0d(r8, r0, r4)
            if (r0 != 0) goto L_0x0084
            r0 = 4212(0x1074, float:5.902E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = X.00l.A0d(r8, r0, r4)
            if (r0 != 0) goto L_0x0084
            java.lang.Integer r0 = X.AnonymousClass05K.A01
        L_0x0047:
            r12.A01 = r0
            java.io.PrintStream r10 = java.lang.System.err
            java.lang.StringBuilder r11 = X.AnonymousClass7TE.A1A()
            java.lang.Integer r9 = X.AnonymousClass05K.A00
            boolean r0 = X.AnonymousClass7TF.A1W(r0, r9)
            r11.append(r0)
            r7 = 32
            r11.append(r7)
            X.0wW r5 = r12.A00
            X.0Tu r6 = X.0Tu.A06
            r0 = 36311350032531966(0x8100fb000101fe, double:3.026782202419283E-306)
            boolean r5 = X.DbY.A1Y(r6, r5, r0)
            r11.append(r5)
            r11.append(r7)
            java.lang.String r5 = r11.toString()
            r10.println(r5)
            java.lang.Integer r5 = r12.A01
            if (r5 != r9) goto L_0x014e
            X.0wW r5 = r12.A00
            boolean r0 = X.DbY.A1Y(r6, r5, r0)
            if (r0 == 0) goto L_0x014e
            goto L_0x0087
        L_0x0084:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x0047
        L_0x0087:
            android.net.Uri r7 = X.0cp.A03(r8)     // Catch:{ Exception -> 0x014e }
            java.lang.String r1 = r7.getScheme()
            java.lang.String r0 = "https"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x0137
            java.lang.String r0 = "http"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x0137
            java.lang.String r0 = "instagram"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x014e
            java.lang.String r5 = r7.getPath()
            r1 = 1
            if (r5 == 0) goto L_0x00bb
            int r0 = r5.length()
            if (r0 == 0) goto L_0x00bb
            java.lang.String r5 = r5.substring(r1)
            X.0qQ.A07(r5)
        L_0x00bb:
            android.os.Bundle r8 = X.AnonymousClass7TE.A0a()
            if (r5 == 0) goto L_0x00c6
        L_0x00c1:
            java.lang.String r0 = "url_path"
            r8.putString(r0, r5)
        L_0x00c6:
            java.lang.String r6 = "entry_point"
            java.lang.String r0 = r7.getQueryParameter(r6)
            if (r0 == 0) goto L_0x00d1
            r8.putString(r6, r0)
        L_0x00d1:
            java.lang.String r5 = "media_id"
            java.lang.String r0 = r7.getQueryParameter(r5)
            if (r0 == 0) goto L_0x00dc
            r8.putString(r5, r0)
        L_0x00dc:
            java.lang.String r1 = "utm_source"
            java.lang.String r0 = r7.getQueryParameter(r1)
            if (r0 == 0) goto L_0x00e7
            r8.putString(r1, r0)
        L_0x00e7:
            r3.putAll(r8)
            X.0qQ.A0B(r13, r4)
            X.0hq r0 = r12.getSupportFragmentManager()
            boolean r0 = X.AnonymousClass06S.A01(r0)
            if (r0 == 0) goto L_0x00fe
            boolean r0 = r13 instanceof com.instagram.common.session.UserSession
            if (r0 != 0) goto L_0x0103
            X.FFQ.A01(r12, r3, r13)
        L_0x00fe:
            r0 = -2121028031(0xffffffff8193ae41, float:-5.4249314E-38)
            goto L_0x001a
        L_0x0103:
            boolean r0 = r3.containsKey(r6)
            if (r0 == 0) goto L_0x0134
            java.lang.String r0 = r3.getString(r6)
            X.EWI r14 = X.C48952Emq.A00(r0)
        L_0x0111:
            java.lang.Integer r0 = r12.A01
            int r0 = r0.intValue()
            if (r0 != r4) goto L_0x0130
            X.1ZB r11 = X.C48953Emr.A00()
            com.instagram.common.session.UserSession r13 = (com.instagram.common.session.UserSession) r13
            java.lang.String r15 = r3.getString(r5)
            java.lang.String r0 = "url_path"
            java.lang.String r16 = r3.getString(r0)
            java.lang.String r17 = r3.getString(r1)
            r11.A00(r12, r13, r14, r15, r16, r17)
        L_0x0130:
            r12.finish()
            goto L_0x00fe
        L_0x0134:
            X.EWI r14 = X.EWI.DEEPLINK
            goto L_0x0111
        L_0x0137:
            java.util.List r5 = r7.getPathSegments()
            android.os.Bundle r8 = X.AnonymousClass7TE.A0a()
            int r1 = r5.size()
            r0 = 1
            if (r1 <= r0) goto L_0x00c6
            java.lang.Object r5 = X.00k.A0O(r5, r0)
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x00c1
        L_0x014e:
            r12.finish()
            r0 = 1649285155(0x624e1823, float:9.504421E20)
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.infocenter.InfoCenterExternalUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}
