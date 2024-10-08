package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.Collections;

public abstract class FH7 {
    public static final C50186FSs A00 = new C50186FSs(1);

    public static final Intent A00(Context context, String str) {
        Intent data = new Intent("android.intent.action.VIEW").setFlags(268435456).setData(0cp.A01(A00, str));
        0qQ.A07(data);
        if ((00p.A0k(str, "market://", false) || 00p.A0k(str, "https://play.google.com/", false)) && 0oI.A0F(context)) {
            data.setPackage("com.android.vending");
        }
        return data;
    }

    public static final void A01(Activity activity, 0lg r21, String str, String str2) {
        Activity activity2 = activity;
        0qQ.A0B(activity2, 0);
        String str3 = str;
        if (00p.A0k(str3, "instagram://", false)) {
            A03(activity2, str3);
            return;
        }
        0lg r0 = r21;
        SimpleWebViewActivity.A02.A02(activity2, r0, new SimpleWebViewConfig(str2, (String) null, false, false, true, false, false, true, true, false, true, false, false, false, (String) null, SQU.A02(activity2, 1Ma.A03(str3))));
    }

    public static final void A02(Context context, String str) {
        0qQ.A0B(str, 1);
        if (!0kR.A0A(context, A00(context, str))) {
            C59689JTv.A07(context, 2131976820);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b6, code lost:
        if (r15 != null) goto L_0x00b8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A06(androidx.fragment.app.FragmentActivity r14, com.instagram.common.session.UserSession r15, X.AnonymousClass47L r16, X.C49716F3b r17, java.lang.String r18, java.lang.String r19) {
        /*
            r9 = 0
            X.0qQ.A0B(r14, r9)
            java.lang.String r4 = "url"
            r8 = 1
            r5 = r18
            X.0qQ.A0B(r5, r8)
            java.lang.String r3 = "urlType"
            android.content.Intent r2 = A00(r14, r5)
            java.lang.String r0 = "fb-messenger-family"
            boolean r0 = X.00p.A0k(r5, r0, r9)
            java.lang.String r7 = "hsdp"
            r6 = 817893089(0x30c00ee1, float:1.3974067E-9)
            if (r0 == 0) goto L_0x0064
            X.0wj r1 = X.0wj.A01
            java.lang.String r0 = "attempting to open messenger intent"
            X.DbT.A1Q(r1, r0, r6)
            boolean r11 = X.0kR.A09(r14, r2)
            if (r11 != 0) goto L_0x0031
            java.lang.String r0 = "3P opener has failed"
            X.DbT.A1Q(r1, r0, r6)
        L_0x0031:
            r12 = 0
        L_0x0032:
            android.app.Activity r10 = X.C61190ls.A00(r14)
            r1 = 2130771974(0x7f010006, float:1.7147053E38)
            r0 = 2130772039(0x7f010047, float:1.7147185E38)
            r10.overridePendingTransition(r1, r0)
            if (r11 != 0) goto L_0x0170
            r10 = r19
            if (r19 == 0) goto L_0x0137
            if (r15 == 0) goto L_0x0137
            X.0Tu r11 = X.0Tu.A05
            r0 = 36326068885403112(0x810e5e000035e8, double:3.036090464243059E-306)
            boolean r0 = X.182.A06(r11, r15, r0)
            if (r0 == 0) goto L_0x0137
            android.content.Context r0 = r14.getApplicationContext()
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.content.Intent r11 = r0.getLaunchIntentForPackage(r10)
            if (r11 == 0) goto L_0x0137
            goto L_0x0113
        L_0x0064:
            X.0Tu r11 = X.0Tu.A05
            r0 = 36318037296551691(0x8107100000170b, double:3.031011255112808E-306)
            boolean r0 = X.182.A06(r11, r15, r0)
            r13 = r17
            if (r0 == 0) goto L_0x00b5
            android.net.Uri r1 = android.net.Uri.parse(r5)
            java.lang.String r0 = "listing"
            java.lang.String r0 = r1.getQueryParameter(r0)
            if (r0 == 0) goto L_0x00b5
            boolean r0 = X.00l.A0W(r0)
            if (r0 != 0) goto L_0x00b5
            r10 = r2
            r0 = 98516969(0x5df3fe9, float:2.0994296E-35)
            boolean r0 = A0C(r14, r15, r13, r5, r0)
            if (r0 == 0) goto L_0x00b6
            if (r15 == 0) goto L_0x010c
            if (r17 == 0) goto L_0x00b8
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r0)
            r13.A00(r2, r5)
            boolean r0 = X.0kR.A08(r14, r2, r9)     // Catch:{ ActivityNotFoundException -> 0x00a5 }
            if (r0 == 0) goto L_0x00aa
            r11 = 1
            goto L_0x0031
        L_0x00a5:
            java.lang.String r0 = "HSDP opener with CSL has crashed"
            A05(r2, r5, r0)
        L_0x00aa:
            java.lang.String r0 = "HSDP opener with CSL has failed, defaulting to BAU launcher"
            A05(r2, r5, r0)
            boolean r11 = X.0kR.A09(r14, r10)
            goto L_0x0031
        L_0x00b5:
            r10 = r2
        L_0x00b6:
            if (r15 == 0) goto L_0x010c
        L_0x00b8:
            r0 = 36323629344173396(0x810c2600032d54, double:3.0345476885461425E-306)
            boolean r0 = X.182.A06(r11, r15, r0)
            if (r0 == 0) goto L_0x010c
            r0 = 98502499(0x5df0763, float:2.0973533E-35)
            r12 = 0
            boolean r0 = A0C(r14, r15, r13, r5, r0)
            if (r0 == 0) goto L_0x010d
            if (r17 == 0) goto L_0x0179
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r0)
            r13.A00(r2, r5)
            boolean r0 = X.0kR.A08(r14, r2, r9)     // Catch:{ ActivityNotFoundException -> 0x00e2 }
            if (r0 == 0) goto L_0x00f3
            r11 = 1
            goto L_0x0032
        L_0x00e2:
            X.0wj r0 = X.0wj.A01
            java.lang.String r1 = "HSDP opener has crashed"
            X.0f9 r0 = r0.AEf(r1, r6)
            r0.ABQ(r7, r1)
            A04(r2, r0, r4, r5)
            r0.report()
        L_0x00f3:
            X.0wj r1 = X.0wj.A01
            java.lang.String r0 = "HSDP opener has failed, defaulting to BAU launcher"
            X.0f9 r1 = r1.AEf(r0, r6)
            java.lang.String r0 = "HSDP opener has failed"
            r1.ABQ(r7, r0)
            A04(r2, r1, r4, r5)
            r1.report()
            boolean r11 = X.0kR.A09(r14, r10)
            goto L_0x0032
        L_0x010c:
            r12 = 0
        L_0x010d:
            boolean r11 = X.0kR.A09(r14, r2)
            goto L_0x0032
        L_0x0113:
            boolean r12 = X.0kR.A08(r14, r11, r9)     // Catch:{ ActivityNotFoundException -> 0x0118 }
            goto L_0x011d
        L_0x0118:
            java.lang.String r0 = "Opening app with package name threw an exception"
            A05(r11, r5, r0)
        L_0x011d:
            X.0wj r1 = X.0wj.A01
            java.lang.String r0 = "Deep Link failed, opening app with package name"
            X.0f9 r1 = r1.AEf(r0, r6)
            java.lang.String r0 = "Deep link failed"
            r1.ABQ(r7, r0)
            r1.ABQ(r4, r5)
            java.lang.String r0 = "package"
            A04(r11, r1, r0, r10)
            r1.report()
            if (r12 != 0) goto L_0x0170
        L_0x0137:
            int r7 = r16.ordinal()
            if (r7 == r8) goto L_0x0175
            r0 = 4
            if (r7 == r0) goto L_0x0171
            r1 = 3
            r0 = 2131969040(0x7f134410, float:1.9574992E38)
            if (r7 == r1) goto L_0x0149
            r0 = 2131969037(0x7f13440d, float:1.9574986E38)
        L_0x0149:
            X.C59689JTv.A07(r14, r0)
            if (r15 == 0) goto L_0x0170
            X.0Tu r7 = X.0Tu.A05
            r0 = 36323629344238933(0x810c2600042d55, double:3.0345476885875884E-306)
            boolean r0 = X.182.A06(r7, r15, r0)
            if (r0 == 0) goto L_0x0170
            X.0wj r1 = X.0wj.A01
            java.lang.String r0 = "openAdDeepLinkUrl failed"
            X.0f9 r1 = r1.AEf(r0, r6)
            A04(r2, r1, r4, r5)
            java.lang.String r0 = r16.toString()
            r1.ABQ(r3, r0)
            r1.report()
        L_0x0170:
            return
        L_0x0171:
            r0 = 2131969039(0x7f13440f, float:1.957499E38)
            goto L_0x0149
        L_0x0175:
            r0 = 2131968927(0x7f13439f, float:1.9574762E38)
            goto L_0x0149
        L_0x0179:
            java.lang.IllegalArgumentException r0 = X.DbU.A0h()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FH7.A06(androidx.fragment.app.FragmentActivity, com.instagram.common.session.UserSession, X.47L, X.F3b, java.lang.String, java.lang.String):void");
    }

    public static final void A08(FragmentActivity fragmentActivity, UserSession userSession, 2EG r8, String str, String str2) {
        0qQ.A0B(fragmentActivity, 0);
        AnonymousClass7TG.A1U(userSession, str, r8);
        0qQ.A0B(str2, 4);
        SUL sul = new SUL(fragmentActivity, userSession, r8, str, false);
        sul.A0S = str2;
        sul.A0A();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v8, resolved type: boolean} */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01e2, code lost:
        if (r2 != 3) goto L_0x01e4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x021f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A09(androidx.fragment.app.FragmentActivity r18, com.instagram.common.session.UserSession r19, X.2EG r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24) {
        /*
            r13 = 0
            r4 = r18
            r6 = r19
            r3 = r21
            android.net.Uri r2 = X.DbT.A09(r3)     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x00ed }
            java.lang.String r1 = r2.getHost()     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x00ed }
            if (r1 == 0) goto L_0x00c6
            r0 = 237(0xed, float:3.32E-43)
            java.lang.String r0 = X.Pxd.A00(r0)     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x00ed }
            boolean r0 = r1.equals(r0)     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x00ed }
            if (r0 == 0) goto L_0x00a9
            X.0Tu r5 = X.0Tu.A05     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x00ed }
            r0 = 36330862068908858(0x8112ba0000433a, double:3.0391216927926936E-306)
            boolean r0 = X.182.A06(r5, r6, r0)     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x00ed }
            if (r0 == 0) goto L_0x0065
            java.lang.String r0 = "u"
            java.lang.String r8 = r2.getQueryParameter(r0)     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x00ed }
            if (r8 == 0) goto L_0x00d3
            X.14E r0 = X.14D.A04     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x00ed }
            X.14D r7 = r0.A00()     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x00ed }
            X.F1E r0 = X.C47281Du9.A01     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x00ed }
            X.Du9 r5 = r0.A00()     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x00ed }
            X.EVT r2 = X.EVT.PUBLIC     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x00ed }
            X.0sn r1 = X.0sn.A00     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x00ed }
            X.Du8 r0 = new X.Du8     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x00ed }
            r0.<init>(r2, r1, r1)     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x00ed }
            android.content.Intent r0 = r5.A00(r4, r0, r8, r13)     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x00ed }
            if (r0 != 0) goto L_0x0055
            if (r7 == 0) goto L_0x005d
            X.34S r0 = r7.A00(r6, r8)     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x00ed }
            if (r0 == 0) goto L_0x005d
        L_0x0055:
            r0 = 1
            X.DrE r5 = new X.DrE     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x00ed }
            r5.<init>(r8, r0)     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x00ed }
            goto L_0x00f3
        L_0x005d:
            r0 = 0
            X.DrE r5 = new X.DrE     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x00ed }
            r5.<init>(r3, r0)     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x00ed }
            goto L_0x00f3
        L_0x0065:
            java.lang.String r0 = "u"
            java.lang.String r7 = r2.getQueryParameter(r0)     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x00ed }
            if (r7 == 0) goto L_0x008f
            X.14E r0 = X.14D.A04     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x00ed }
            X.14D r2 = r0.A00()     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x00ed }
            r1 = 1
            if (r2 == 0) goto L_0x0088
            android.content.Intent r0 = X.FHE.A0G(r4, r7)     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x00ed }
            if (r0 != 0) goto L_0x0082
            X.34S r0 = r2.A00(r6, r7)     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x00ed }
            if (r0 == 0) goto L_0x0088
        L_0x0082:
            X.DrE r5 = new X.DrE     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x00ed }
            r5.<init>(r7, r1)     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x00ed }
            goto L_0x00f3
        L_0x0088:
            r0 = 0
            X.DrE r5 = new X.DrE     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x00ed }
            r5.<init>(r3, r0)     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x00ed }
            goto L_0x00f3
        L_0x008f:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x00ed }
            java.lang.String r0 = "No deeplink in shim url:["
            r1.append(r0)     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x00ed }
            r1.append(r2)     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x00ed }
            r0 = 93
            r1.append(r0)     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x00ed }
            java.lang.String r0 = r1.toString()     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x00ed }
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x00ed }
            goto L_0x00ec
        L_0x00a9:
            X.14E r0 = X.14D.A04     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x00ed }
            X.14D r2 = r0.A00()     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x00ed }
            r1 = 1
            if (r2 == 0) goto L_0x00c4
            android.content.Intent r0 = X.FHE.A0G(r4, r3)     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x00ed }
            if (r0 != 0) goto L_0x00be
            X.34S r0 = r2.A00(r6, r3)     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x00ed }
            if (r0 == 0) goto L_0x00c4
        L_0x00be:
            X.DrE r5 = new X.DrE     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x00ed }
            r5.<init>(r3, r1)     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x00ed }
            goto L_0x00f3
        L_0x00c4:
            r1 = 0
            goto L_0x00be
        L_0x00c6:
            java.lang.String r1 = "Invalid url:["
            r0 = 93
            java.lang.String r0 = X.002.A0S(r1, r3, r0)     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x00ed }
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x00ed }
            goto L_0x00ec
        L_0x00d3:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x00ed }
            java.lang.String r0 = "No deeplink in shim url:["
            r1.append(r0)     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x00ed }
            r1.append(r2)     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x00ed }
            r0 = 93
            r1.append(r0)     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x00ed }
            java.lang.String r0 = r1.toString()     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x00ed }
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x00ed }
        L_0x00ec:
            throw r0     // Catch:{ IllegalStateException | NullPointerException | SecurityException -> 0x00ed }
        L_0x00ed:
            r0 = move-exception
            X.DrD r5 = new X.DrD
            r5.<init>(r0)
        L_0x00f3:
            r2 = r5
            r8 = 0
            boolean r0 = r5 instanceof X.C47137DrE
            if (r0 == 0) goto L_0x0266
            X.DrE r2 = (X.C47137DrE) r2
            int r1 = r2.A00
            r7 = r22
            if (r1 != r8) goto L_0x025d
            java.lang.String r12 = r2.A01
            r3 = 2
            X.0qQ.A0B(r12, r3)
            X.SUL r0 = new X.SUL
            r14 = r0
            r15 = r4
            r16 = r6
            r18 = r12
            r19 = r8
            r17 = r20
            r14.<init>(r15, r16, r17, r18, r19)
            r0.A0S = r7
            r4 = r23
            if (r23 == 0) goto L_0x012d
            r0.A0C(r4)
            r5 = 1
            X.QKn r1 = r0.A1L
            android.os.Bundle r2 = r1.A00
            r1 = 585(0x249, float:8.2E-43)
            java.lang.String r1 = X.Pxd.A00(r1)
            r2.putBoolean(r1, r5)
        L_0x012d:
            r1 = r24
            if (r24 == 0) goto L_0x0134
            r0.A0E(r1)
        L_0x0134:
            X.1Xj r10 = X.DbV.A0U(r6, r4)
            if (r10 == 0) goto L_0x0204
            X.0Tu r5 = X.0Tu.A05
            r1 = 36320979351380986(0x8109bd002223fa, double:3.032871822433558E-306)
            boolean r1 = X.182.A06(r5, r6, r1)
            if (r1 == 0) goto L_0x0204
            X.1Xy r1 = r10.A0C
            com.instagram.api.schemas.IABPostClickDataDict r1 = r1.BF7()
            if (r1 == 0) goto L_0x0204
            com.instagram.api.schemas.IGBWPIABPostClickDataExtensionDict r1 = r1.Aj6()
            if (r1 == 0) goto L_0x0204
            X.1Xy r1 = r10.A0C
            com.instagram.api.schemas.IABPostClickDataDict r11 = r1.BF7()
            if (r11 == 0) goto L_0x0200
            com.instagram.api.schemas.IGBWPIABPostClickDataExtensionDict r1 = r11.Aj6()
            if (r1 == 0) goto L_0x0200
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.List r1 = r11.B0f()
            if (r1 == 0) goto L_0x018d
            java.util.Iterator r7 = r1.iterator()
        L_0x0171:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x018d
            java.lang.Object r1 = r7.next()
            com.instagram.api.schemas.IABPostClickEligibleExperienceTypes r1 = (com.instagram.api.schemas.IABPostClickEligibleExperienceTypes) r1
            int r2 = r1.ordinal()
            r1 = 1
            if (r2 != r1) goto L_0x018a
            X.EUw r1 = X.C48078EUw.IAB_BUY_WITH_PRIME
        L_0x0186:
            r9.add(r1)
            goto L_0x0171
        L_0x018a:
            X.EUw r1 = X.C48078EUw.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            goto L_0x0186
        L_0x018d:
            java.util.List r1 = X.00k.A0a(r9)
            com.google.common.collect.ImmutableList r9 = X.DbU.A0K(r1)
            X.1Xy r1 = r10.A0C
            java.lang.String r1 = r1.AnT()
            if (r1 == 0) goto L_0x0259
            java.util.List r7 = X.AnonymousClass7TE.A1I(r1)
        L_0x01a1:
            java.lang.String r21 = r10.getId()
            X.0wc r18 = X.AnonymousClass0kN.A02(r6)
            r1 = 36320979349414900(0x8109bd000423f4, double:3.032871821190197E-306)
            boolean r22 = X.182.A06(r5, r6, r1)
            r1 = 36320979350463478(0x8109bd001423f6, double:3.032871821853322E-306)
            boolean r23 = X.182.A06(r5, r6, r1)
            com.instagram.api.schemas.IGBWPIABPostClickDataExtensionDict r5 = r11.Aj6()
            java.lang.Integer r11 = X.AnonymousClass05K.A0N
            com.facebook.iabbwpextension.IABBwPExtension r10 = new com.facebook.iabbwpextension.IABBwPExtension
            r14 = r13
            r15 = r13
            r16 = r13
            r17 = r8
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            if (r22 != 0) goto L_0x01d0
            if (r23 == 0) goto L_0x0237
        L_0x01d0:
            if (r5 == 0) goto L_0x0237
            com.instagram.api.schemas.IGBWPExperienceTypes r1 = r5.Aj4()
            if (r1 == 0) goto L_0x01e4
            int r2 = r1.ordinal()
            r1 = 1
            if (r2 == r1) goto L_0x0234
            if (r2 == r3) goto L_0x0231
            r1 = 3
            if (r2 == r1) goto L_0x01e6
        L_0x01e4:
            java.lang.Integer r11 = X.AnonymousClass05K.A00
        L_0x01e6:
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            if (r11 != r1) goto L_0x01ec
            if (r22 == 0) goto L_0x01f2
        L_0x01ec:
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            if (r11 != r1) goto L_0x0208
            if (r23 != 0) goto L_0x0208
        L_0x01f2:
            r24 = 1
            r19 = r11
            r20 = r13
            X.S8F.A00(r18, r19, r20, r21, r22, r23, r24)
        L_0x01fb:
            com.facebook.iabbwpextension.IABBwPContext r13 = new com.facebook.iabbwpextension.IABBwPContext
            r13.<init>(r10, r9, r7)
        L_0x0200:
            r0.A0C = r13
            r0.A0R = r4
        L_0x0204:
            r0.A0A()
            return
        L_0x0208:
            r24 = 1
            r19 = r11
            r20 = r13
            X.S8F.A00(r18, r19, r20, r21, r22, r23, r24)
            java.lang.String r13 = r5.Ac0()
            java.lang.String r14 = r5.getAccessToken()
            java.lang.Integer r1 = r5.AXl()
            if (r1 == 0) goto L_0x0223
            int r17 = r1.intValue()
        L_0x0223:
            java.lang.String r15 = r5.AfY()
            java.lang.String r16 = r5.BaI()
            com.facebook.iabbwpextension.IABBwPExtension r10 = new com.facebook.iabbwpextension.IABBwPExtension
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x01fb
        L_0x0231:
            java.lang.Integer r11 = X.AnonymousClass05K.A0C
            goto L_0x01e6
        L_0x0234:
            java.lang.Integer r11 = X.AnonymousClass05K.A01
            goto L_0x01e6
        L_0x0237:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r22)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r23)
            if (r5 != 0) goto L_0x0243
            r17 = 1
        L_0x0243:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r17)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r2, r1}
            r1 = 538(0x21a, float:7.54E-43)
            java.lang.String r2 = X.Pxd.A00(r1)
            boolean r1 = X.SQO.A00
            if (r1 == 0) goto L_0x01fb
            java.lang.String.format(r13, r2, r3)
            goto L_0x01fb
        L_0x0259:
            X.0sn r7 = X.0sn.A00
            goto L_0x01a1
        L_0x025d:
            r0 = 1
            if (r1 != r0) goto L_0x0266
            java.lang.String r0 = r2.A01
            A0B(r4, r6, r0, r7)
            return
        L_0x0266:
            boolean r0 = r5 instanceof X.C47136DrD
            if (r0 == 0) goto L_0x0278
            X.FSs r3 = A00
            X.DrD r5 = (X.C47136DrD) r5
            java.lang.Throwable r2 = r5.A00
            java.lang.String r1 = "OpenUrlHelper"
            java.lang.String r0 = "Sticker Link Parse url failed"
            r3.EFT(r1, r0, r2)
            return
        L_0x0278:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FH7.A09(androidx.fragment.app.FragmentActivity, com.instagram.common.session.UserSession, X.2EG, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static final void A0A(FragmentActivity fragmentActivity, UserSession userSession, Product product, String str, String str2, String str3) {
        String str4;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        UserSession userSession2 = userSession;
        AnonymousClass7TF.A1H(fragmentActivity, userSession);
        0qQ.A0B(str3, 5);
        String str5 = product.A0F;
        if (str5 != null) {
            SUL sul = new SUL(fragmentActivity2, userSession2, 2EG.A2u, str5, false);
            sul.A0C(str);
            String str6 = product.A0H;
            0qQ.A0B(str6, 0);
            C7572QKn qKn = sul.A1L;
            qKn.A00.putString(C273654mx.A00(1398), str6);
            User user = product.A0B;
            if (user != null) {
                str4 = AnonymousClass3ZA.A00(user);
            } else {
                str4 = null;
            }
            0qQ.A0A(str4);
            0qQ.A0B(str4, 0);
            qKn.A00.putString("TrackingInfo.ARG_MERCHANT_ID", str4);
            sul.A0F(str2);
            sul.A0S = str3;
            sul.A0A();
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final boolean A0B(Activity activity, UserSession userSession, String str, String str2) {
        Uri A01;
        0qQ.A0B(activity, 0);
        DbZ.A0t(1, userSession, str, str2);
        if (AnonymousClass7TE.A1a(FGU.A01(activity, (Intent) null, FGU.A00(userSession, str, str2), userSession, str, false).A00)) {
            return true;
        }
        14D A002 = 14D.A04.A00();
        if (A002 == null || A002.A00(userSession, str) == null || (A01 = 0cp.A01(A00, str)) == null) {
            return false;
        }
        Intent A04 = DbT.A0e().A04(activity, A01);
        A04.putExtra(C66579MXk.A00(3), true);
        return 0kR.A0B(activity, A04);
    }

    public static final boolean A0C(Context context, UserSession userSession, C49716F3b f3b, String str, int i) {
        if (!(userSession == null || f3b == null)) {
            UserSession userSession2 = f3b.A01;
            0Tu r7 = 0Tu.A05;
            if (182.A06(r7, userSession2, 36323629343976786L)) {
                1QP A002 = AnonymousClass1QO.A00(userSession);
                long flowStartForMarker = A002.flowStartForMarker(i, "openUrlHelper", false);
                boolean z = false;
                if (00p.A0k(str, AnonymousClass000.A00(694), false) || 00p.A0k(str, Pxd.A00(221), false) || 00p.A0k(str, Pxd.A00(219), false) || 00p.A0k(str, Pxd.A00(222), false)) {
                    z = true;
                }
                if (!z) {
                    A002.flowEndCancel(flowStartForMarker, "is_url_eligible_for_hsdp");
                } else {
                    A002.flowMarkPoint(flowStartForMarker, "is_url_eligible_for_hsdp");
                    String str2 = "is_store_available";
                    if (0oI.A0F(context)) {
                        A002.flowMarkPoint(flowStartForMarker, str2);
                        String A04 = 182.A04(r7, userSession2, 36886579297452756L);
                        String A05 = 0oI.A05(f3b.A00, "com.android.vending");
                        boolean z2 = false;
                        if (A05 != null && A05.compareTo(A04) >= 0) {
                            z2 = true;
                        }
                        str2 = "is_min_google_play_version_supported";
                        if (z2) {
                            A002.flowMarkPoint(flowStartForMarker, str2);
                            str2 = "is_last_update_by_GP";
                            if (f3b.A02()) {
                                A002.flowMarkPoint(flowStartForMarker, str2);
                                A002.flowEndSuccess(flowStartForMarker);
                                return true;
                            }
                        }
                    }
                    A002.flowEndCancel(flowStartForMarker, str2);
                    return false;
                }
            }
        }
        return false;
    }

    public static void A04(Intent intent, 0f9 r3, String str, String str2) {
        r3.ABQ(str, str2);
        r3.ABQ("intent", String.valueOf(intent.getData()));
    }

    public static final void A05(Intent intent, String str, String str2) {
        0f9 AEf = 0wj.A01.AEf("openAdDeepLinkUrl failed", 817893089);
        AEf.ABQ(DialogModule.KEY_MESSAGE, str2);
        AEf.ABQ("url", str);
        AEf.ABQ("urlType", String.valueOf(intent.getData()));
        AEf.report();
    }

    public static final void A07(FragmentActivity fragmentActivity, UserSession userSession, AnonymousClass47L r14, 2EG r15, String str, String str2, String str3, String str4, String str5, 0sn r21) {
        String str6 = str2;
        2EG r7 = r15;
        String str7 = str;
        AnonymousClass47L r11 = r14;
        AnonymousClass7TG.A0w(2, str7, r14, str6);
        String str8 = str3;
        0qQ.A0B(str8, 6);
        FragmentActivity fragmentActivity2 = fragmentActivity;
        UserSession userSession2 = userSession;
        if (AnonymousClass47L.AD_DESTINATION_WEB == r14) {
            if (r15 == null) {
                r7 = 2EG.A0l;
            }
            SUL sul = new SUL(fragmentActivity2, userSession2, r7, str7, false);
            if (r21 == null) {
                r21 = 0sn.A00;
            }
            sul.A0T = Collections.unmodifiableList(r21);
            sul.A0o = true;
            if (str6.length() == 0) {
                str6 = null;
            }
            sul.A0C(str6);
            sul.A0B(str4);
            sul.A0D(str5);
            sul.A0S = str8;
            sul.A0A();
            return;
        }
        A06(fragmentActivity2, userSession, r11, (C49716F3b) null, str7, (String) null);
    }

    public static final void A03(Context context, String str) {
        AnonymousClass7TG.A1N(context, str);
        if (!0kR.A09(context, A00(context, str))) {
            C59689JTv.A07(context, 2131976820);
        }
    }
}
