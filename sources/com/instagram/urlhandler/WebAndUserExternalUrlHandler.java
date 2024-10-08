package com.instagram.urlhandler;

import X.0Tu;
import X.0bY;
import X.0kR;
import X.0qQ;
import X.182;
import X.2Aq;
import X.2Ay;
import X.2Ci;
import X.2EG;
import X.AnonymousClass0wW;
import X.AnonymousClass14B;
import X.AnonymousClass16q;
import X.C273654mx;
import X.C49953FGi;
import X.C51016Fn7;
import X.C51920G7o;
import X.DbS;
import X.DbW;
import X.DbX;
import X.Dc1;
import X.EWJ;
import X.FHB;
import X.FVC;
import X.FVD;
import X.GAH;
import X.SCN;
import android.net.Uri;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public final class WebAndUserExternalUrlHandler implements C51920G7o {
    public static final 0bY A03 = DbW.A0G();
    public static final Set A04 = new HashSet(Arrays.asList(new String[]{"donate"}));
    public static final Set A05 = new HashSet(Arrays.asList(new String[]{"about", "about-ads", "account", "accounts", "blog", "business", "client_error", "community", "componentexplorer", "developer", "developers", "download", "getapp", "help", "instameets", "invites", "nametag", "press", "research", "security", "support", "terms", "xwoiynko", "accounts_center"}));
    public static final Set A06 = new HashSet(Arrays.asList(new String[]{"ads", "android", "dyi", "emails", "enoozer", "internal", "legal", "media", "mixi", "oauth", "threads", "weibo", "aymh", "b"}));
    public static final Pattern A07 = Pattern.compile("[a-zA-Z0-9_]+(\\.[a-zA-Z0-9_]+)*");
    public final FVC A00;
    public final C51016Fn7 A01;
    public final FVD A02;

    public final boolean EHn() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:88:0x021d, code lost:
        if ("r".equalsIgnoreCase(r2) == false) goto L_0x021f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle AFW(X.AnonymousClass0wW r30, java.lang.String r31) {
        /*
            r29 = this;
            r14 = r30
            X.0bY r0 = A03
            r6 = 1
            r1 = r31
            android.net.Uri r9 = X.0cp.A01(r0, r1)
            r21 = 0
            if (r9 == 0) goto L_0x033a
            java.lang.String r1 = r9.getScheme()
            java.lang.String r0 = "https"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x0065
            java.lang.String r0 = "http"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x0065
            java.lang.String r0 = "instagram"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x033a
            java.lang.String r1 = r9.getHost()
            java.lang.String r0 = "user"
            boolean r0 = r0.equalsIgnoreCase(r1)
            r5 = 0
            if (r0 == 0) goto L_0x0064
            java.util.Set r2 = r9.getQueryParameterNames()
            java.lang.String r1 = X.Dbe.A01()
            boolean r0 = r2.contains(r1)
            if (r0 == 0) goto L_0x0064
            java.lang.String r1 = r9.getQueryParameter(r1)
            r1.getClass()
            java.util.regex.Pattern r0 = A07
            boolean r0 = X.DbV.A1b(r1, r0)
            if (r0 != 0) goto L_0x0138
            java.lang.String r1 = "Ig-scheme url contains invalid username: "
            java.lang.String r0 = r9.getPath()
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.String r0 = "url_handler_user"
            X.0wb.A03(r0, r1)
        L_0x0064:
            return r5
        L_0x0065:
            boolean r0 = X.C49846F9l.A00(r9)
            r20 = 0
            if (r0 == 0) goto L_0x033a
            android.os.Bundle r5 = X.AnonymousClass7TE.A0a()
            java.util.List r10 = r9.getPathSegments()
            java.util.Set r2 = r9.getQueryParameterNames()
            java.lang.String r0 = "open_create_flow"
            boolean r1 = r2.contains(r0)
            java.lang.String r0 = "InstagramUrlLaunchConstants.EXTRA_USER_OPEN_CREATION_SHEET"
            r5.putBoolean(r0, r1)
            java.lang.String r0 = r9.getHost()
            if (r0 == 0) goto L_0x00a1
            java.lang.String r1 = r9.getHost()
            java.lang.String r0 = "help.instagram"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x00a1
        L_0x0096:
            java.lang.String r0 = "should_land_on_web"
            r5.putBoolean(r0, r6)
            java.lang.String r0 = "uri"
            r5.putParcelable(r0, r9)
            return r5
        L_0x00a1:
            boolean r0 = r10.isEmpty()
            java.lang.String r13 = "uri"
            if (r0 != 0) goto L_0x0326
            r8 = 0
            java.lang.String r1 = X.AnonymousClass7TE.A19(r10, r8)
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            int r0 = r10.size()
            java.lang.String r12 = "InstagramUrlLaunchConstants.EXTRA_USER_ID"
            r7 = 2
            if (r0 < r7) goto L_0x00e7
            java.lang.String r3 = X.AnonymousClass7TE.A19(r10, r8)
            java.lang.String r0 = "invites"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L_0x00e7
            java.lang.String r3 = X.AnonymousClass7TE.A19(r10, r6)
            java.lang.String r0 = "contact"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L_0x00e7
            java.lang.String r0 = "should_land_on_web"
            r5.putBoolean(r0, r8)
            r5.putParcelable(r13, r9)
            java.lang.String r1 = "utm_content"
            boolean r0 = r2.contains(r1)
            if (r0 == 0) goto L_0x0064
            goto L_0x0188
        L_0x00e7:
            java.util.Set r0 = A04
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x00f6
            int r0 = r10.size()
            if (r0 <= r6) goto L_0x00f6
            return r21
        L_0x00f6:
            java.util.Set r0 = A05
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0096
            java.util.Set r0 = A06
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x010c
            int r0 = r10.size()
            if (r0 > r6) goto L_0x0096
        L_0x010c:
            int r0 = r10.size()
            if (r0 < r7) goto L_0x01a5
            java.lang.String r1 = X.AnonymousClass7TE.A19(r10, r8)
            java.lang.String r0 = "fxcal"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x01a5
            java.lang.String r1 = X.AnonymousClass7TE.A19(r10, r6)
            java.lang.String r0 = "consent"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x0096
            java.lang.String r1 = X.AnonymousClass7TE.A19(r10, r6)
            java.lang.String r0 = "specific_login"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x01a5
            goto L_0x0096
        L_0x0138:
            android.os.Bundle r5 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "InstagramUrlLaunchConstants.EXTRA_USER_NAME"
            r5.putString(r0, r1)
            java.lang.String r0 = "launch_reel"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x016d
            java.lang.Integer r20 = X.AnonymousClass05K.A01
            java.lang.String r0 = "include_viewers"
            boolean r25 = r2.contains(r0)
            java.lang.String r0 = "media_id"
            java.lang.String r23 = r9.getQueryParameter(r0)
            r27 = 0
            com.instagram.profile.intf.AutoLaunchReelParams r1 = new com.instagram.profile.intf.AutoLaunchReelParams
            r19 = r1
            r22 = r21
            r24 = r21
            r26 = r6
            r28 = r27
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28)
            java.lang.String r0 = "InstagramUrlLaunchConstants.EXTRA_AUTO_LAUNCH_REEL_PARAMS"
            r5.putParcelable(r0, r1)
        L_0x016d:
            java.lang.String r0 = "open_create_flow"
            boolean r1 = r2.contains(r0)
            java.lang.String r0 = "InstagramUrlLaunchConstants.EXTRA_USER_OPEN_CREATION_SHEET"
            r5.putBoolean(r0, r1)
            r0 = 263(0x107, float:3.69E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            boolean r1 = r2.contains(r0)
            java.lang.String r0 = "InstagramUrlLaunchConstants.EXTRA_SHOULD_INCLUDE_BACK_STACK"
            r5.putBoolean(r0, r1)
            return r5
        L_0x0188:
            java.lang.String r2 = r9.getQueryParameter(r1)     // Catch:{ NumberFormatException -> 0x019e }
            r2.getClass()     // Catch:{ NumberFormatException -> 0x019e }
            r1 = 36
            java.math.BigInteger r0 = new java.math.BigInteger     // Catch:{ NumberFormatException -> 0x019e }
            r0.<init>(r2, r1)     // Catch:{ NumberFormatException -> 0x019e }
            java.lang.String r0 = r0.toString()     // Catch:{ NumberFormatException -> 0x019e }
            r5.putString(r12, r0)     // Catch:{ NumberFormatException -> 0x019e }
            return r5
        L_0x019e:
            r1 = move-exception
            java.lang.String r0 = "EXTERNAL_URL_WITH_BAD_UTM_CONTENT"
            X.0wb.A07(r0, r1)
            return r5
        L_0x01a5:
            int r0 = X.DbT.A02(r10, r6)
            java.lang.String r1 = X.AnonymousClass7TE.A19(r10, r0)
            java.lang.String r0 = "reels"
            boolean r19 = r0.equalsIgnoreCase(r1)
            if (r19 == 0) goto L_0x01bd
            int r0 = X.DbT.A02(r10, r6)
            java.util.List r10 = r10.subList(r8, r0)
        L_0x01bd:
            int r0 = r10.size()
            java.lang.String r15 = "url_handler_user"
            java.lang.String r11 = "_u"
            java.lang.String r18 = "profile_clips"
            java.lang.String r4 = "InstagramUrlLaunchConstants.EXTRA_STARTING_TAB"
            java.lang.String r3 = "InstagramUrlLaunchConstants.EXTRA_USER_NAME"
            if (r0 != r6) goto L_0x01ff
            java.lang.String r2 = X.AnonymousClass7TE.A19(r10, r8)
            java.lang.String r0 = "explore"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto L_0x02bb
            java.lang.String r0 = "_n"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto L_0x02bb
            boolean r0 = r11.equalsIgnoreCase(r2)
            if (r0 != 0) goto L_0x02bb
            java.util.regex.Pattern r0 = A07
            boolean r0 = X.DbV.A1b(r2, r0)
            if (r0 == 0) goto L_0x02a7
            r5.putParcelable(r13, r9)
        L_0x01f2:
            r5.putString(r3, r2)
        L_0x01f5:
            if (r19 == 0) goto L_0x01f9
            r20 = r18
        L_0x01f9:
            r0 = r20
            r5.putString(r4, r0)
            return r5
        L_0x01ff:
            int r0 = r10.size()
            if (r0 != r7) goto L_0x02bb
            java.lang.String r1 = X.AnonymousClass7TE.A19(r10, r8)
            java.lang.String r2 = X.DbU.A0t(r10, r6)
            java.lang.String r0 = "a"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x021f
            java.lang.String r0 = "r"
            boolean r0 = r0.equalsIgnoreCase(r2)
            r17 = 1
            if (r0 != 0) goto L_0x0221
        L_0x021f:
            r17 = 0
        L_0x0221:
            java.lang.String r0 = "ar"
            boolean r16 = r0.equalsIgnoreCase(r1)
            if (r17 != 0) goto L_0x0258
            if (r16 != 0) goto L_0x0258
            java.lang.String r0 = X.AnonymousClass7TE.A19(r10, r8)
            boolean r0 = r11.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0244
            java.util.regex.Pattern r0 = A07
            boolean r0 = X.DbV.A1b(r2, r0)
            if (r0 != 0) goto L_0x01f2
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Url contains invalid username: "
            goto L_0x02ad
        L_0x0244:
            java.lang.String r1 = X.AnonymousClass7TE.A19(r10, r8)
            java.lang.String r0 = "_uid"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x02bb
            java.lang.String r0 = X.AnonymousClass7TE.A19(r10, r6)
            r5.putString(r12, r0)
            goto L_0x01f5
        L_0x0258:
            r5.putParcelable(r13, r9)
            if (r30 == 0) goto L_0x02a5
            com.instagram.common.session.UserSession r14 = (com.instagram.common.session.UserSession) r14
        L_0x025f:
            android.content.Context r3 = X.C60960kU.A00
            X.1X9 r1 = X.AnonymousClass38W.A00()
            java.lang.String r0 = "encoded_token"
            java.lang.String r0 = r9.getQueryParameter(r0)
            if (r0 == 0) goto L_0x026e
            r8 = 1
        L_0x026e:
            if (r14 == 0) goto L_0x029d
            boolean r0 = r1.A02(r3, r14)
            if (r0 == 0) goto L_0x029d
            java.lang.String r0 = "EXTRA_VIDEO_CALL"
        L_0x0278:
            r5.putBoolean(r0, r6)
            if (r16 != 0) goto L_0x0283
            java.lang.String r0 = "effect_id"
            java.lang.String r2 = r9.getQueryParameter(r0)
        L_0x0283:
            java.lang.String r0 = "effect_id_key"
            r5.putString(r0, r2)
            java.lang.String r0 = "ch"
            java.lang.String r1 = r9.getQueryParameter(r0)
            java.lang.String r0 = "ch_key"
            r5.putString(r0, r1)
            java.lang.String r0 = "revision_id"
            java.lang.String r1 = r9.getQueryParameter(r0)
            java.lang.String r0 = "revisionID_key"
            goto L_0x0336
        L_0x029d:
            if (r8 == 0) goto L_0x02a2
            java.lang.String r0 = "EXTRA_AD_CAMERA"
            goto L_0x0278
        L_0x02a2:
            java.lang.String r0 = "EXTRA_STORY_CAMERA"
            goto L_0x0278
        L_0x02a5:
            r14 = 0
            goto L_0x025f
        L_0x02a7:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Explore url contains invalid username: "
        L_0x02ad:
            r1.append(r0)
            java.lang.String r0 = r9.getPath()
            java.lang.String r0 = X.AnonymousClass7TF.A0l(r0, r1)
            X.0wb.A03(r15, r0)
        L_0x02bb:
            java.lang.String r1 = X.AnonymousClass7TE.A19(r10, r8)
            java.lang.String r0 = "stories"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x030f
            int r0 = r10.size()
            if (r0 >= r7) goto L_0x02cf
            if (r30 == 0) goto L_0x030f
        L_0x02cf:
            java.lang.String r0 = X.AnonymousClass7TE.A19(r10, r6)
            r5.putString(r3, r0)
            java.lang.Integer r20 = X.AnonymousClass05K.A01
            r23 = 0
            java.lang.String r0 = "story-show-report"
            java.lang.String r0 = r9.getQueryParameter(r0)
            java.lang.String r1 = "1"
            boolean r27 = r1.equals(r0)
            java.lang.String r0 = "story-show-fact-check"
            java.lang.String r0 = r9.getQueryParameter(r0)
            boolean r28 = r1.equals(r0)
            int r0 = r10.size()
            if (r0 <= r7) goto L_0x02fa
            java.lang.String r23 = X.AnonymousClass7TE.A19(r10, r7)
        L_0x02fa:
            com.instagram.profile.intf.AutoLaunchReelParams r1 = new com.instagram.profile.intf.AutoLaunchReelParams
            r19 = r1
            r22 = r21
            r24 = r21
            r25 = r8
            r26 = r6
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28)
            java.lang.String r0 = "InstagramUrlLaunchConstants.EXTRA_AUTO_LAUNCH_REEL_PARAMS"
            r5.putParcelable(r0, r1)
            return r5
        L_0x030f:
            X.0wj r2 = X.0wj.A01
            r1 = 817890849(0x30c00621, float:1.3971581E-9)
            java.lang.String r0 = "WebAndUserExternalUrlHandler cannot resolve IG host url"
            X.0f9 r2 = r2.AEf(r0, r1)
            java.lang.String r1 = r9.toString()
            java.lang.String r0 = "url"
            r2.ABQ(r0, r1)
            r2.report()
        L_0x0326:
            r5.putParcelable(r13, r9)
            java.lang.String r1 = "mainfeed"
            java.lang.String r0 = "destination_id"
            r5.putString(r0, r1)
            java.lang.String r1 = r9.getEncodedQuery()
            java.lang.String r0 = "encoded_query"
        L_0x0336:
            r5.putString(r0, r1)
            return r5
        L_0x033a:
            return r21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandler.WebAndUserExternalUrlHandler.AFW(X.0wW, java.lang.String):android.os.Bundle");
    }

    public final void CI1(Bundle bundle, FragmentActivity fragmentActivity, AnonymousClass0wW r10) {
        String str;
        AnonymousClass16q C31;
        Boolean CaJ;
        if (r10 instanceof UserSession) {
            UserSession userSession = (UserSession) r10;
            if (!(!182.A06(DbS.A0J(userSession, 0), userSession, 36328396757679428L) || (C31 = DbX.A0m(userSession).C31()) == null || (CaJ = C31.CaJ()) == null || CaJ.booleanValue() || C49953FGi.A02(userSession) == null)) {
                2Aq A032 = 2Aq.A03(userSession);
                2Ay r4 = 2Ay.A09;
                2Ci.A04(userSession, (EWJ) null, "scheduled_break", A032.A0P());
                A032.A0V(fragmentActivity, r4, (EWJ) null);
                return;
            }
        }
        Uri uri = (Uri) bundle.getParcelable("uri");
        Dc1 A002 = GAH.A00(r10);
        if (uri == null || !bundle.getBoolean("should_land_on_web")) {
            if (uri == null) {
                FHB.A0A(bundle, fragmentActivity, r10);
                str = PublicKeyCredentialControllerUtility.JSON_KEY_USER;
            } else if (bundle.containsKey("EXTRA_VIDEO_CALL")) {
                this.A02.CI1(bundle, fragmentActivity, r10);
                str = "video_call";
            } else {
                if (bundle.containsKey("EXTRA_AD_CAMERA")) {
                    this.A00.CI1(bundle, fragmentActivity, r10);
                    0qQ.A0B("ad_camera", 1);
                    A002.A00.A0J("destination", "ad_camera");
                    A002.A01();
                }
                if (bundle.containsKey("EXTRA_STORY_CAMERA")) {
                    this.A01.CI1(bundle, fragmentActivity, r10);
                    0qQ.A0B("story_camera", 1);
                    A002.A00.A0J("destination", "story_camera");
                    A002.A01();
                }
                if (bundle.containsKey("InstagramUrlLaunchConstants.EXTRA_USER_NAME") || bundle.containsKey("InstagramUrlLaunchConstants.EXTRA_USER_ID")) {
                    FHB.A0A(bundle, fragmentActivity, r10);
                } else {
                    FHB.A03(fragmentActivity, bundle);
                }
            }
            A002.A00.A0J("destination", str);
        } else {
            0Tu r5 = 0Tu.A05;
            if (182.A06(r5, r10, 36318621412694341L)) {
                0kR.A0B(fragmentActivity, AnonymousClass14B.A00().A01(fragmentActivity));
            }
            String string = bundle.getString(C273654mx.A00(133));
            if (string == null) {
                string = "url_handler";
            }
            if (182.A06(r5, r10, 36318621412497732L)) {
                FHB.A04(fragmentActivity, r10, 2EG.A1S, uri.toString(), string);
            } else if (!SCN.A00(fragmentActivity, uri, r10)) {
                FHB.A02(fragmentActivity, uri, r10, string);
            }
            fragmentActivity.finish();
            A002.A00.A0K("launch_browser", true);
        }
        A002.A01();
    }

    public WebAndUserExternalUrlHandler(FVC fvc, C51016Fn7 fn7, FVD fvd) {
        this.A01 = fn7;
        this.A02 = fvd;
        this.A00 = fvc;
    }
}
