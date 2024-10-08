package X;

import android.content.Context;
import android.net.Uri;
import android.webkit.URLUtil;
import androidx.fragment.app.Fragment;
import com.facebook.privacy.zone.policy.ZonePolicy;
import com.instagram.common.session.UserSession;
import com.instagram.inappbrowser.helper.BrowserLinkshimUrlCache;
import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.7VL  reason: invalid class name */
public final class AnonymousClass7VL implements AnonymousClass7VM {
    public final 0bY A00 = new 1Q7("IgSecureUriParser").A00;
    public final AnonymousClass4DH A01;
    public final AnonymousClass4DH A02;
    public final UserSession A03;
    public final UserSession A04;
    public final String A05;
    public final String A06;
    public final C62320sa A07;
    public final C62320sa A08;
    public final C62320sa A09;
    public final C62320sa A0A;
    public final C62320sa A0B;
    public final C62320sa A0C;
    public final boolean A0D;

    public final void A02(String str, String str2, String str3, String str4, boolean z) {
        String obj;
        UserSession userSession = this.A03;
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        if (182.A06(0Tu.A05, userSession, 36313579121805428L)) {
            if (!z) {
                A01(str5, str6, str7, "system_browser", str8);
            }
            0kR.A0F(this.A01.requireContext(), 0cp.A03(str));
        } else if (z || A03(str8)) {
            Uri A032 = 0cp.A03(str);
            0qQ.A07(A032);
            if (A032.getScheme() == null) {
                obj = URLUtil.guessUrl(str);
                if (obj == null) {
                    obj = "";
                }
            } else {
                obj = A032.toString();
                0qQ.A07(obj);
            }
            SUL sul = new SUL(this.A01.requireActivity(), userSession, 2EG.A1V, obj, false);
            sul.A0E(userSession.A06);
            sul.A0F((String) this.A08.invoke());
            sul.A0S = this.A05;
            sul.A0r = false;
            sul.A0D = ZonePolicy.A0D;
            sul.A0A();
        } else {
            A01(str5, str6, str7, "in_app_browser", str8);
            BrowserLinkshimUrlCache browserLinkshimUrlCache = (BrowserLinkshimUrlCache) userSession.A01(BrowserLinkshimUrlCache.class, new C66299MMi(userSession, 33));
            Fragment fragment = this.A01;
            Context requireContext = fragment.requireContext();
            0gy A002 = AnonymousClass07i.A00(fragment);
            A8Z a8z = new A8Z(this);
            String str9 = (String) browserLinkshimUrlCache.A00.BEh(str);
            if (str9 == null || str9.length() == 0) {
                1NY r2 = new 1NY(browserLinkshimUrlCache.A01);
                r2.A04();
                r2.A0A("linkshim/fetch_lynx_url/");
                r2.A9m("url", str);
                r2.A9m("callsite", RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING);
                r2.A0R(C384559hW.class, AB1.class);
                1OC A0M = r2.A0M();
                A0M.A00 = new C385369ip(a8z, browserLinkshimUrlCache, str);
                1ES.A00(requireContext, A002, A0M);
                return;
            }
            a8z.A00(str9);
        }
    }

    public final void Cqo(String str, String str2, String str3) {
        0qQ.A0B(str, 0);
        A00(str, "inline_link", str2, str3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x008a, code lost:
        if (X.0qQ.A0K(r2.A0D(r5), true) == false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0015, code lost:
        r6 = r32;
        r7 = r6.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36) {
        /*
            r32 = this;
            java.lang.String r22 = "url"
            r4 = 0
            r3 = r33
            X.0qQ.A0B(r3, r4)
            r12 = 1
            int r0 = r3.length()
            r21 = 0
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r12)
            if (r0 == 0) goto L_0x0476
            r6 = r32
            X.4DH r7 = r6.A02
            android.content.Context r11 = r7.getContext()
            if (r11 == 0) goto L_0x0476
            java.lang.String r0 = r6.A06
            r30 = r0
            com.instagram.common.session.UserSession r0 = r6.A04
            r1 = r30
            android.os.Bundle r5 = X.FGU.A00(r0, r3, r1)
            X.0sa r1 = r6.A0A
            r29 = r1
            java.lang.Object r2 = r29.invoke()
            java.lang.String r2 = (java.lang.String) r2
            r1 = 828(0x33c, float:1.16E-42)
            java.lang.String r20 = X.C66579MXk.A00(r1)
            r1 = r20
            r5.putString(r1, r2)
            X.0sa r1 = r6.A0C
            java.lang.Object r2 = r1.invoke()
            java.lang.String r2 = (java.lang.String) r2
            r1 = 315(0x13b, float:4.41E-43)
            java.lang.String r1 = X.C66579MXk.A00(r1)
            r5.putString(r1, r2)
            r19 = 0
            r13 = r11
            r14 = r19
            r15 = r5
            r16 = r0
            r17 = r3
            r18 = r4
            X.34S r1 = X.FGU.A01(r13, r14, r15, r16, r17, r18)
            java.lang.Object r1 = r1.A00
            boolean r1 = X.0qQ.A0K(r1, r8)
            if (r1 != 0) goto L_0x0476
            r5 = r36
            if (r36 == 0) goto L_0x008c
            X.0sa r1 = r6.A09
            java.lang.Object r1 = r1.invoke()
            X.7Zg r1 = (X.C333517Zg) r1
            X.7S7 r2 = r1.C6l()
            boolean r1 = r2 instanceof X.AnonymousClass7S6
            if (r1 == 0) goto L_0x008c
            X.7S6 r2 = (X.AnonymousClass7S6) r2
            if (r2 == 0) goto L_0x008c
            java.lang.Boolean r1 = r2.A0D(r5)
            boolean r1 = X.0qQ.A0K(r1, r8)
            r10 = 1
            if (r1 != 0) goto L_0x008d
        L_0x008c:
            r10 = 0
        L_0x008d:
            X.0bY r1 = r6.A00
            android.net.Uri r8 = X.0cp.A01(r1, r3)
            if (r8 == 0) goto L_0x0476
            java.lang.String r1 = "android.intent.action.VIEW"
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r1, r8)
            r1 = 3
            java.lang.String r1 = X.C66579MXk.A00(r1)
            android.content.Intent r2 = r2.putExtra(r1, r12)
            java.lang.String r1 = "InstagramUrlLaunchConstants.EXTRA_IS_ARMADILLO_EXPRESS_MESSAGE"
            android.content.Intent r2 = r2.putExtra(r1, r10)
            r1 = 65536(0x10000, float:9.18355E-41)
            android.content.Intent r9 = r2.setFlags(r1)
            X.0qQ.A07(r9)
            r31 = r34
            r13 = r35
            java.lang.String r1 = r8.getHost()     // Catch:{ Exception -> 0x00ff }
            if (r1 == 0) goto L_0x010d
            java.lang.String r2 = r8.getHost()     // Catch:{ Exception -> 0x00ff }
            if (r2 == 0) goto L_0x00f0
            r1 = 1335(0x537, float:1.871E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)     // Catch:{ Exception -> 0x00ff }
            boolean r1 = X.00l.A0d(r2, r1, r4)     // Catch:{ Exception -> 0x00ff }
            if (r1 != r12) goto L_0x00f0
        L_0x00d0:
            java.lang.String r2 = "instagram_direct"
            java.lang.String r1 = "deeplink_ref_surface"
            java.lang.String r1 = r8.getQueryParameter(r1)     // Catch:{ Exception -> 0x00ff }
            boolean r1 = r2.equals(r1)     // Catch:{ Exception -> 0x00ff }
            if (r1 == 0) goto L_0x010d
            java.lang.String r24 = r8.getHost()     // Catch:{ Exception -> 0x00ff }
            java.lang.String r27 = "in_app_browser"
            r23 = r6
            r25 = r31
            r26 = r13
            r28 = r5
            r23.A01(r24, r25, r26, r27, r28)     // Catch:{ Exception -> 0x00ff }
            goto L_0x010d
        L_0x00f0:
            java.lang.String r2 = r8.getHost()     // Catch:{ Exception -> 0x00ff }
            if (r2 == 0) goto L_0x010d
            java.lang.String r1 = "watch"
            boolean r1 = X.00l.A0d(r2, r1, r4)     // Catch:{ Exception -> 0x00ff }
            if (r1 != r12) goto L_0x010d
            goto L_0x00d0
        L_0x00ff:
            r2 = move-exception
            boolean r1 = r2 instanceof java.lang.SecurityException
            if (r1 != 0) goto L_0x010d
            boolean r1 = r2 instanceof java.lang.NullPointerException
            if (r1 != 0) goto L_0x010d
            boolean r1 = r2 instanceof java.lang.UnsupportedOperationException
            if (r1 != 0) goto L_0x010d
            throw r2
        L_0x010d:
            X.A8a r23 = new X.A8a
            r23.<init>()
            boolean r1 = r6.A0D
            r18 = r1
            r24 = r7
            r25 = r0
            r26 = r3
            r27 = r13
            r28 = r1
            r23.A00(r24, r25, r26, r27, r28)
            int r15 = X.0oI.A00(r11, r9)
            android.content.pm.PackageManager r1 = r11.getPackageManager()
            r14 = 0
            java.util.List r1 = r1.queryIntentActivities(r9, r4)
            X.0qQ.A07(r1)
            java.util.Iterator r8 = r1.iterator()
        L_0x0137:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0150
            java.lang.Object r1 = r8.next()
            android.content.pm.ResolveInfo r1 = (android.content.pm.ResolveInfo) r1
            android.content.pm.ActivityInfo r1 = r1.activityInfo
            java.lang.String r2 = r1.packageName
            java.lang.String r1 = "com.google.android.youtube"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0137
            r14 = 1
        L_0x0150:
            r8 = 2
            if (r14 == 0) goto L_0x0195
            X.0Tu r1 = X.0Tu.A05
            r16 = 36322611436726568(0x810b3900002928, double:3.033903959777984E-306)
            r14 = r1
            r1 = r16
            boolean r1 = X.182.A06(r14, r0, r1)
            if (r1 == 0) goto L_0x0195
        L_0x0163:
            X.14E r1 = X.14D.A04
            X.14D r1 = r1.A00()
            if (r1 == 0) goto L_0x01ad
            X.34S r1 = r1.A00(r0, r3)
            if (r1 == 0) goto L_0x01ad
            java.lang.Object r10 = r1.A00
            X.G7o r10 = (X.C51920G7o) r10
            if (r10 == 0) goto L_0x01ad
            java.lang.Object r9 = r1.A01
            android.os.Bundle r9 = (android.os.Bundle) r9
            if (r9 == 0) goto L_0x01ad
            java.lang.String r1 = "sender_igid"
            r9.putString(r1, r13)
            java.lang.String r2 = r0.A06
            r1 = 2578(0xa12, float:3.613E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r9.putString(r1, r2)
            androidx.fragment.app.FragmentActivity r1 = r7.requireActivity()
            r10.CI1(r9, r1, r0)
            return
        L_0x0195:
            if (r15 == 0) goto L_0x0350
            if (r15 == r12) goto L_0x034c
            if (r15 == r8) goto L_0x0163
            r0 = 3
            if (r15 != r0) goto L_0x01a9
            boolean r0 = X.0oI.A0D(r11)
            if (r0 == 0) goto L_0x0340
            java.lang.String r0 = "com.instagram.android"
            r9.setPackage(r0)
        L_0x01a9:
            X.0kR.A03(r9, r7)
            return
        L_0x01ad:
            if (r35 == 0) goto L_0x0207
            X.17i r1 = X.17h.A00(r0)
            com.instagram.user.model.User r1 = r1.A02(r13)
            if (r1 == 0) goto L_0x0207
            X.4Cl r1 = r1.A03
            X.4s9 r1 = r1.CZP()
            if (r1 == 0) goto L_0x0207
            boolean r1 = r1.CZT()
            if (r1 == 0) goto L_0x0207
            X.0Tu r9 = X.0Tu.A05
            r1 = 36320369463796086(0x81092f00002176, double:3.032486127069047E-306)
            boolean r1 = X.182.A06(r9, r0, r1)
            if (r1 == 0) goto L_0x0207
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.lang.String r1 = "user_id"
            r4.put(r1, r13)
            r1 = r22
            r4.put(r1, r3)
            java.lang.String r2 = "link_entry_source"
            r1 = r31
            r4.put(r2, r1)
            java.lang.String r2 = java.lang.String.valueOf(r18)
            java.lang.String r1 = "is_secured_thread"
            r4.put(r1, r2)
            java.lang.String r2 = "com.bloks.www.ig.profile_protection.link_warnings_async_action"
            r1 = r19
            X.8ey r1 = X.C359988do.A02(r1, r0, r2, r4)
            X.9iF r0 = new X.9iF
            r0.<init>(r6)
            r1.A00(r0)
            r7.schedule(r1)
            return
        L_0x0207:
            X.1Av r9 = X.1Au.A00(r0)
            r1 = 1330(0x532, float:1.864E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r1)
            X.0xa r1 = r9.A01
            int r1 = r1.getInt(r2, r4)
            if (r1 >= r8) goto L_0x021b
            r21 = 1
        L_0x021b:
            X.0sa r9 = r6.A09
            java.lang.Object r1 = r9.invoke()
            X.7Zg r1 = (X.C333517Zg) r1
            X.7S7 r1 = r1.C6l()
            X.7SD r1 = r1.C6Q()
            int r1 = r1.A08
            boolean r1 = X.AnonymousClass7LY.A00(r1)
            if (r1 != 0) goto L_0x0340
            if (r21 == 0) goto L_0x0340
            X.37E r2 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r1 = r7.requireActivity()
            X.37D r1 = r2.A01(r1)
            X.7Pu r2 = X.C48943Emh.A00(r1)
            if (r2 == 0) goto L_0x02f2
            boolean r1 = r2.A0S()
            if (r1 == 0) goto L_0x02f2
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r1 = r2.A03
            androidx.fragment.app.Fragment r1 = r1.A0M()
            if (r1 == 0) goto L_0x02f2
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r4 = "bottom_sheet_content_fragment"
            r1 = 3083(0xc0b, float:4.32E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r2.putString(r4, r1)
            r1 = 3089(0xc11, float:4.329E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r2.putString(r1, r3)
            r1 = 3087(0xc0f, float:4.326E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r2.putString(r1, r13)
            java.lang.Object r3 = r29.invoke()
            java.lang.String r3 = (java.lang.String) r3
            r1 = r20
            r2.putString(r1, r3)
            r1 = 3086(0xc0e, float:4.324E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r1)
            r1 = r30
            r2.putString(r3, r1)
            r1 = 3084(0xc0c, float:4.322E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r1)
            r1 = r31
            r2.putString(r3, r1)
            r1 = 3085(0xc0d, float:4.323E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r2.putString(r1, r5)
            java.lang.Object r1 = r9.invoke()
            X.7Zg r1 = (X.C333517Zg) r1
            X.7S7 r1 = r1.C6l()
            X.3sy r3 = r1.B8S()
            X.0qQ.A07(r3)
            r1 = 3088(0xc10, float:4.327E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.C67002Mga.A01(r2, r3, r1)
            if (r18 != 0) goto L_0x02ef
            boolean r1 = r6.A03(r5)
            if (r1 != 0) goto L_0x02ef
            java.lang.Integer r1 = X.AnonymousClass05K.A01
        L_0x02c3:
            int r1 = r1.intValue()
            if (r1 == r8) goto L_0x02ec
            com.facebook.privacy.zone.policy.ZonePolicy r3 = com.facebook.privacy.zone.policy.ZonePolicy.A0F
        L_0x02cb:
            r1 = 3090(0xc12, float:4.33E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r2.putParcelable(r1, r3)
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r12 = com.instagram.modal.TransparentModalActivity.class
            androidx.fragment.app.FragmentActivity r9 = r7.requireActivity()
            java.lang.String r13 = "bottom_sheet"
            X.6W8 r1 = new X.6W8
            r8 = r1
            r10 = r2
            r11 = r0
            r8.<init>(r9, r10, r11, r12, r13)
            androidx.fragment.app.FragmentActivity r0 = r7.requireActivity()
            r1.A0C(r0)
            return
        L_0x02ec:
            com.facebook.privacy.zone.policy.ZonePolicy r3 = com.facebook.privacy.zone.policy.ZonePolicy.A0D
            goto L_0x02cb
        L_0x02ef:
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            goto L_0x02c3
        L_0x02f2:
            X.1as r14 = X.1as.A04
            androidx.fragment.app.FragmentActivity r15 = r7.requireActivity()
            android.content.Context r16 = r7.requireContext()
            java.lang.Object r2 = r29.invoke()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r9.invoke()
            X.7Zg r1 = (X.C333517Zg) r1
            X.7S7 r1 = r1.C6l()
            X.3sy r19 = r1.B8S()
            if (r18 != 0) goto L_0x033d
            boolean r1 = r6.A03(r5)
            if (r1 != 0) goto L_0x033d
            java.lang.Integer r1 = X.AnonymousClass05K.A01
        L_0x031a:
            int r1 = r1.intValue()
            if (r1 == r8) goto L_0x033a
            com.facebook.privacy.zone.policy.ZonePolicy r17 = com.facebook.privacy.zone.policy.ZonePolicy.A0F
        L_0x0322:
            r20 = r3
            r21 = r13
            r22 = r2
            r23 = r30
            r24 = r31
            r25 = r5
            r26 = r4
            r18 = r0
            X.7Pu r0 = r14.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            X.0qQ.A0A(r0)
            return
        L_0x033a:
            com.facebook.privacy.zone.policy.ZonePolicy r17 = com.facebook.privacy.zone.policy.ZonePolicy.A0D
            goto L_0x0322
        L_0x033d:
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            goto L_0x031a
        L_0x0340:
            r0 = r6
            r1 = r3
            r2 = r31
            r3 = r13
            r4 = r5
            r5 = r18
            r0.A02(r1, r2, r3, r4, r5)
            return
        L_0x034c:
            X.0kR.A02(r9, r7)
            return
        L_0x0350:
            android.net.Uri r1 = X.0cp.A03(r3)     // Catch:{ SecurityException -> 0x0385 }
            if (r1 == 0) goto L_0x0385
            java.lang.String r2 = r1.getHost()
            r1 = 704(0x2c0, float:9.87E-43)
            java.lang.String r1 = X.Pxd.A00(r1)
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0385
            X.AnonymousClass2E0.A07()
            android.app.Activity r3 = r7.getRootActivity()
            X.0qQ.A0A(r3)
            r0 = 474(0x1da, float:6.64E-43)
            java.lang.String r2 = X.Pxd.A00(r0)
            r1 = 10
            X.0qQ.A0B(r3, r8)
            X.0b6 r0 = X.0kR.A00
            X.0R3 r0 = r0.A08(r2)
            r0.A0F(r3, r9, r1)
            return
        L_0x0385:
            X.0sa r1 = r6.A0B
            java.lang.Object r1 = r1.invoke()
            X.7VG r1 = (X.AnonymousClass7VG) r1
            X.0eK r1 = r1.A00
            java.lang.Object r2 = r1.get()
            X.2Es r2 = (X.AnonymousClass2Es) r2
            if (r2 == 0) goto L_0x03c1
            java.lang.String r1 = r2.BA0()
            if (r1 == 0) goto L_0x03c1
            java.lang.String r1 = r2.BA0()
            android.net.Uri r1 = android.net.Uri.parse(r1)
            X.0qQ.A07(r1)
            java.lang.String r2 = X.OXO.A00(r1)
            android.net.Uri r1 = android.net.Uri.parse(r3)
            X.0qQ.A07(r1)
            java.lang.String r1 = X.OXO.A00(r1)
            if (r2 == 0) goto L_0x03c1
            if (r1 == 0) goto L_0x03c1
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0476
        L_0x03c1:
            java.lang.String r1 = r11.getPackageName()
            r9.setPackage(r1)
            r1 = 227(0xe3, float:3.18E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r9.putExtra(r1, r12)
            boolean r1 = X.0kR.A0G(r9, r7)
            if (r1 != 0) goto L_0x03de
            boolean r1 = r7.mDetached
            if (r1 != 0) goto L_0x03de
            X.0kR.A0C(r11, r9)
        L_0x03de:
            java.lang.String r2 = "inline_link"
            r1 = r31
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0476
            if (r18 != 0) goto L_0x03ec
            if (r10 == 0) goto L_0x0476
        L_0x03ec:
            android.net.Uri r4 = X.0cp.A03(r3)
            X.0qQ.A07(r4)
            java.lang.String r2 = r4.getHost()
            java.lang.String r1 = "www.instagram.com"
            if (r2 == 0) goto L_0x0473
            boolean r1 = r2.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x0473
            java.lang.String r2 = r4.getPath()
            if (r2 == 0) goto L_0x0471
            java.lang.String r1 = "/reel/"
            boolean r1 = X.00p.A0k(r2, r1, r12)
            if (r1 == 0) goto L_0x045b
            X.2FW r1 = X.2FW.A1p
        L_0x0411:
            java.lang.String r4 = r1.A00
        L_0x0413:
            X.0sa r2 = r6.A09
            java.lang.Object r1 = r2.invoke()
            X.7Zg r1 = (X.C333517Zg) r1
            X.7S7 r1 = r1.C6l()
            X.3sy r8 = r1.B8S()
            java.lang.Object r1 = r2.invoke()
            X.7Zg r1 = (X.C333517Zg) r1
            X.7S7 r1 = r1.C6l()
            X.3sy r1 = r1.B8S()
            boolean r9 = X.C66647MaG.A0E(r1)
            android.content.Context r1 = r7.requireContext()
            boolean r10 = X.0oI.A0A(r1)
            boolean r11 = X.C321406u6.A06(r3)
            r6 = r7
            r7 = r0
            X.1Ln r2 = X.C3265677h.A00(r6, r7, r8, r9, r10, r11)
            java.lang.String r0 = "web_link_entry_source"
            r2.A0R(r0, r4)
            java.lang.Object r1 = r29.invoke()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "viewer_session_id"
            r2.A0R(r0, r1)
            r2.Cgf()
            return
        L_0x045b:
            java.lang.String r1 = "/p/"
            boolean r1 = X.00l.A0d(r2, r1, r12)
            if (r1 == 0) goto L_0x0466
            X.2FW r1 = X.2FW.A1v
            goto L_0x0411
        L_0x0466:
            java.lang.String r1 = "/live/"
            boolean r1 = X.00l.A0d(r2, r1, r12)
            if (r1 == 0) goto L_0x0473
            X.2FW r1 = X.2FW.A1t
            goto L_0x0411
        L_0x0471:
            r4 = 0
            goto L_0x0413
        L_0x0473:
            X.2FW r1 = X.2FW.A1s
            goto L_0x0411
        L_0x0476:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7VL.A00(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16) {
        /*
            r11 = this;
            r3 = r16
            if (r16 == 0) goto L_0x00e8
            X.0sa r0 = r11.A07
            java.lang.Object r0 = r0.invoke()
            X.7Zg r0 = (X.C333517Zg) r0
            X.7S7 r1 = r0.C6l()
            r0 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.0qQ.A0C(r1, r0)
            X.7S6 r1 = (X.AnonymousClass7S6) r1
            java.lang.Boolean r0 = r1.A0D(r3)
            if (r0 == 0) goto L_0x00e8
            boolean r4 = r0.booleanValue()
        L_0x0025:
            com.instagram.common.session.UserSession r6 = r11.A03
            X.4DH r5 = r11.A01
            X.0sa r2 = r11.A07
            java.lang.Object r0 = r2.invoke()
            X.7Zg r0 = (X.C333517Zg) r0
            X.7S7 r0 = r0.C6l()
            X.3sy r7 = r0.B8S()
            java.lang.Object r0 = r2.invoke()
            X.7Zg r0 = (X.C333517Zg) r0
            X.7S7 r0 = r0.C6l()
            X.3sy r0 = r0.B8S()
            boolean r8 = X.C66647MaG.A0E(r0)
            android.content.Context r0 = r5.requireContext()
            boolean r9 = X.0oI.A0A(r0)
            boolean r10 = X.C321406u6.A06(r12)
            X.1Ln r5 = X.C3265677h.A00(r5, r6, r7, r8, r9, r10)
            java.lang.String r0 = "destination"
            r5.A0R(r0, r15)
            java.lang.String r0 = "web_link_entry_source"
            r5.A0R(r0, r13)
            X.0sa r0 = r11.A08
            java.lang.Object r1 = r0.invoke()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "viewer_session_id"
            r5.A0R(r0, r1)
            java.lang.String r0 = "message_id"
            r5.A0R(r0, r3)
            if (r14 == 0) goto L_0x0086
            if (r4 != 0) goto L_0x0086
            r0 = 10
            java.lang.Long r1 = X.00y.A0n(r0, r14)
            java.lang.String r0 = "sender_id"
            r5.A0Q(r0, r1)
        L_0x0086:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            r0 = 651(0x28b, float:9.12E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x00b8
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            java.lang.String r1 = "content_type"
            r0 = 104(0x68, float:1.46E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r6.put(r1, r0)
            java.lang.String r1 = "surface"
            java.lang.String r0 = "thread"
            r6.put(r1, r0)
            java.lang.String r1 = "selected_item"
            java.lang.String r0 = "ai_bot_search_powered_by_bing"
            r6.put(r1, r0)
            r4.putAll(r6)
        L_0x00b8:
            java.lang.Object r0 = r2.invoke()
            X.7Zg r0 = (X.C333517Zg) r0
            X.7ZY r2 = r0.BSN()
            if (r16 != 0) goto L_0x00c6
            java.lang.String r3 = ""
        L_0x00c6:
            r1 = 0
            com.instagram.model.direct.messageid.MessageIdentifier r0 = new com.instagram.model.direct.messageid.MessageIdentifier
            r0.<init>(r3, r1)
            java.util.Map r0 = r2.BOG(r0)
            if (r0 != 0) goto L_0x00d6
            X.0sm r0 = X.0Yt.A0E()
        L_0x00d6:
            r4.putAll(r0)
            boolean r0 = r4.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00e4
            r5.A0w(r4)
        L_0x00e4:
            r5.Cgf()
            return
        L_0x00e8:
            r4 = 0
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7VL.A01(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final boolean A03(String str) {
        AnonymousClass7S6 r3;
        C62320sa r4 = this.A07;
        AnonymousClass7S7 C6l = ((C333517Zg) r4.invoke()).C6l();
        if (C6l instanceof AnonymousClass7S6) {
            r3 = (AnonymousClass7S6) C6l;
        } else {
            r3 = null;
        }
        if (r3 == null || str == null) {
            return false;
        }
        C254703su BRz = r3.A0O.BRz(r3.B8S(), str);
        if ((BRz == null || !BRz.A1c()) && (!r3.A0D(str).booleanValue() || !C331057Pi.A02(((C333517Zg) r4.invoke()).C6l().C6Q().A0H))) {
            return false;
        }
        return true;
    }

    public AnonymousClass7VL(AnonymousClass4DH r3, UserSession userSession, String str, C62320sa r6, C62320sa r7, C62320sa r8, C62320sa r9, boolean z) {
        this.A01 = r3;
        this.A03 = userSession;
        this.A05 = str;
        this.A07 = r6;
        this.A08 = r7;
        this.A02 = r3;
        this.A04 = userSession;
        this.A0D = z;
        this.A06 = str;
        this.A09 = r6;
        this.A0A = r7;
        this.A0C = r8;
        this.A0B = r9;
    }
}
