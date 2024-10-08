package com.instagram.urlhandler;

import X.0qQ;
import X.0sr;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.C49919FEu;
import X.DbT;
import X.DbX;
import X.FFQ;
import X.GAH;
import X.QP5;
import android.app.Activity;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.urlhandlers.media.MediaExternalUrlHandlerActivity;

public abstract class UserSessionUrlHandlerActivity extends BaseFragmentActivity {
    public AnonymousClass0wW A00;

    public static String A00(Activity activity, QP5 qp5, UserSession userSession) {
        String stringExtra = activity.getIntent().getStringExtra("component");
        QP5 qp52 = qp5;
        if (0sr.A1P(new String[]{"activity_feed", "push_notification"}).contains(qp5.A00)) {
            C49919FEu.A00(qp52, userSession, "tap", "deeplink", stringExtra, (String) null);
        }
        return stringExtra;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.instagram.base.activity.BaseFragmentActivity, android.app.Activity, com.instagram.urlhandler.UserSessionUrlHandlerActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = AnonymousClass0fD.A00(1684039386);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (A0A == null) {
            finish();
            i = 1186046370;
        } else {
            UserSession A0W = DbT.A0W(A0A);
            this.A00 = A0W;
            if (A0W instanceof UserSession) {
                A0n(bundle, A0A, A0W);
            } else {
                if (this instanceof MediaExternalUrlHandlerActivity) {
                    0qQ.A0B(A0W, 0);
                    A0A.putBoolean("ARGUMENT_SHOW_LOGIN_FOR_CONTENT_DIALOG", true);
                    GAH.A00(A0W).A02("signed out");
                }
                FFQ.A01(this, A0A, A0W);
                finish();
            }
            i = 1549420951;
        }
        AnonymousClass0fD.A07(i, A002);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: androidx.fragment.app.FragmentActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: android.app.Activity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: X.0BQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v50, resolved type: X.0BQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v51, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v22, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v57, resolved type: com.instagram.urlhandlers.directpollmessage.DirectPollMessageUrlHandlerActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v58, resolved type: com.instagram.urlhandlers.directpollmessage.DirectPollMessageUrlHandlerActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v117, resolved type: com.instagram.urlhandlers.downloadyourinformation.DownloadYourInformationUrlHandlerActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v160, resolved type: com.instagram.urlhandlers.security.SecurityUrlHandlerActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v89, resolved type: android.app.Activity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v90, resolved type: android.app.Activity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v91, resolved type: android.app.Activity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v92, resolved type: android.app.Activity} */
    /* JADX WARNING: type inference failed for: r8v12, types: [X.F1I, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v26, types: [java.lang.Object, com.instagram.urlhandlers.directthreadinternal.DirectThreadInternalUrlHandlerActivity, android.app.Activity] */
    /* JADX WARNING: type inference failed for: r3v159, types: [X.0iw, android.app.Activity] */
    /* JADX WARNING: type inference failed for: r3v187 */
    /* JADX WARNING: type inference failed for: r3v188 */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x1622: MOVE  (r3v53 androidx.fragment.app.FragmentActivity) = (r3v52 androidx.fragment.app.FragmentActivity)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:122)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:34)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:73)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
        */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0396  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x039d  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x03a8  */
    /* JADX WARNING: Removed duplicated region for block: B:967:0x18f6  */
    public void A0n(android.os.Bundle r31, android.os.Bundle r32, com.instagram.common.session.UserSession r33) {
        /*
            r30 = this;
            r1 = r30
            boolean r0 = r1 instanceof com.instagram.urlhandlers.wearables.WearablesSharingUrlHandlerActivity
            if (r0 != 0) goto L_0x0034
            boolean r2 = r1 instanceof com.instagram.urlhandlers.viewleadopportunitydetails.ViewLeadOpportunityDetailsUrlHandlerActivity
            r5 = r32
            r0 = r33
            if (r2 == 0) goto L_0x0035
            X.AnonymousClass7TG.A1O(r0, r5)
            java.lang.String r3 = X.DbS.A0m(r5)
            if (r3 == 0) goto L_0x00dc
            int r2 = r3.length()
            if (r2 == 0) goto L_0x00dc
            android.net.Uri r2 = X.DbT.A09(r3)
            java.lang.String r3 = r2.getLastPathSegment()
            if (r3 != 0) goto L_0x0029
            java.lang.String r3 = ""
        L_0x0029:
            java.lang.String r2 = "lead_opportunity_id"
            java.util.HashMap r3 = X.DbY.A0m(r2, r3)
            java.lang.String r2 = "com.bloks.www.ig.smb.services.lead_gen.opportunity_details"
            X.W2F.A01(r1, r0, r2, r3)
        L_0x0034:
            return
        L_0x0035:
            boolean r2 = r1 instanceof com.instagram.urlhandlers.verifiedusercalling.VerifiedUserCallingUrlHandlerActivity
            if (r2 == 0) goto L_0x0059
            r2 = 1
            X.0qQ.A0B(r0, r2)
            java.lang.String r2 = "call_settings_megaphone"
            android.os.Bundle r3 = X.DbX.A0B(r2)
            X.ERz r2 = new X.ERz
            r2.<init>()
            r2.setArguments(r3)
            X.6Yo r0 = X.DbS.A0M(r1, r0)
            X.0qQ.A0A(r2)
            r0.A0D(r2)
            X.DbV.A1O(r0)
            return
        L_0x0059:
            boolean r2 = r1 instanceof com.instagram.urlhandlers.userblockedlist.UserBlockedListUrlHandlerActivity
            if (r2 == 0) goto L_0x006d
            r2 = 1
            X.0qQ.A0B(r0, r2)
            X.1YF r2 = X.C46339Dch.A01()
            X.E2k r2 = r2.Cqz(r0)
            X.Dbb.A13(r2, r1, r0)
            return
        L_0x006d:
            boolean r2 = r1 instanceof com.instagram.urlhandlers.timespent.TimeSpentNotificationUrlHandlerActivity
            if (r2 == 0) goto L_0x0087
            r2 = 1
            X.0qQ.A0B(r0, r2)
            X.1We r2 = X.1We.A02
            if (r2 == 0) goto L_0x0034
            X.1Wg r3 = X.1We.A00(r2)
            X.EWJ r2 = X.EWJ.IG_TS_ENTRY_POINT_NOTIFICATION
            X.3M3 r2 = r3.A01(r0, r2)
            X.Dbb.A13(r2, r1, r0)
            return
        L_0x0087:
            boolean r2 = r1 instanceof com.instagram.urlhandlers.superlative.SuperlativeUrlHandlerActivity
            if (r2 == 0) goto L_0x00bc
            X.AnonymousClass7TG.A1O(r0, r5)
            java.lang.String r10 = X.DbS.A0m(r5)
            if (r10 == 0) goto L_0x00dc
            X.0Tu r4 = X.0Tu.A05
            r2 = 36319424570989969(0x81085300001d91, double:3.031888573053681E-306)
            boolean r2 = X.182.A06(r4, r0, r2)
            if (r2 == 0) goto L_0x00dc
            X.1OC r5 = X.C49105EpU.A00(r0)
            r4 = 1
            X.6ST r3 = new X.6ST
            r3.<init>(r1, r4)
            r11 = 3
            X.EDU r2 = new X.EDU
            r6 = r2
            r7 = r3
            r8 = r1
            r9 = r0
            r6.<init>(r7, r8, r9, r10, r11)
            r5.A00 = r2
            r0 = -5
            X.1ES.A05(r5, r0, r4, r4, r4)
            return
        L_0x00bc:
            boolean r2 = r1 instanceof com.instagram.urlhandlers.subscriptionsdirectinvite.SubscriptionsDirectInviteHandlerActivity
            if (r2 == 0) goto L_0x00e0
            X.AnonymousClass7TG.A1O(r0, r5)
            java.lang.String r3 = "original_url"
            java.lang.String r2 = r5.getString(r3)
            X.C320236s2.A03(r5, r2, r3)
            android.net.Uri r3 = X.DbT.A09(r2)
            X.2ZQ r2 = X.C71172bH.A00()
            X.DbS.A1X(r2)
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            X.C49169Eqa.A00(r3, r2, r0)
        L_0x00dc:
            r1.finish()
            return
        L_0x00e0:
            boolean r2 = r1 instanceof com.instagram.urlhandlers.subscriptiongifting.SubscriptionGiftingHandlerActivity
            if (r2 == 0) goto L_0x0114
            X.AnonymousClass7TG.A1O(r0, r5)
            java.lang.String r2 = X.DbS.A0m(r5)
            if (r2 == 0) goto L_0x00dc
            android.net.Uri r2 = X.DbT.A09(r2)
            java.lang.String r3 = "gift_id"
            java.lang.String r2 = r2.getQueryParameter(r3)
            if (r2 == 0) goto L_0x00dc
            X.FC8.A02()
            r4 = 0
            java.util.HashMap r3 = X.DbY.A0m(r3, r2)
            java.lang.String r2 = "com.instagram.user_pay.fan_club.screens.gifting_received_confirmation"
            X.3M3 r2 = X.C46649DiU.A02(r0, r2, r3)
            X.6Yo r6 = X.DbU.A0Q(r1, r0)
        L_0x010b:
            r6.A0D = r4
        L_0x010d:
            r6.A0D(r2)
        L_0x0110:
            r6.A04()
            return
        L_0x0114:
            boolean r2 = r1 instanceof com.instagram.urlhandlers.stories.StoriesUrlHandlerActivity
            if (r2 == 0) goto L_0x0152
            r4 = r1
            com.instagram.urlhandlers.stories.StoriesUrlHandlerActivity r4 = (com.instagram.urlhandlers.stories.StoriesUrlHandlerActivity) r4
            r9 = 1
            X.AnonymousClass7TF.A1B(r0, r9, r5)
            java.lang.String r3 = X.DbS.A0m(r5)
            if (r3 == 0) goto L_0x014e
            X.0hq r2 = r4.getSupportFragmentManager()
            X.06Q r1 = r4.A00
            r2.A0s(r1)
            android.net.Uri r6 = X.DbT.A09(r3)
            java.lang.String r2 = r6.getHost()
            java.lang.String r1 = "story-camera"
            if (r2 == 0) goto L_0x0f95
            boolean r1 = r2.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x0f95
            android.content.Intent r0 = X.DbX.A08(r4)
            android.content.Intent r0 = r0.setData(r6)
            X.0qQ.A07(r0)
            X.DbV.A19(r4, r0)
        L_0x014e:
            r4.finish()
            return
        L_0x0152:
            boolean r2 = r1 instanceof com.instagram.urlhandlers.shopsads.ShopsAdsCheckoutDeeplinkUrlHandlerActivity
            if (r2 == 0) goto L_0x01c7
            r2 = 1
            X.0qQ.A0B(r0, r2)
            X.0hq r3 = r1.getSupportFragmentManager()
            r2 = 30
            X.C50128FQl.A00(r3, r1, r2)
            android.content.Intent r2 = r1.getIntent()
            java.lang.String r9 = "order_id"
            java.lang.String r8 = r2.getStringExtra(r9)
            android.content.Intent r2 = r1.getIntent()
            java.lang.String r7 = "experience_type"
            java.lang.String r6 = r2.getStringExtra(r7)
            if (r8 == 0) goto L_0x0034
            if (r6 == 0) goto L_0x0034
            java.lang.String r5 = X.AnonymousClass7TF.A0c()
            X.0qQ.A07(r5)
            X.02m r3 = X.02m.A0p
            r2 = 37371680(0x23a3f20, float:1.3683238E-37)
            r3.markerStart(r2)
            java.lang.String r4 = X.C2818159r.A01()
            java.util.HashMap r3 = X.AnonymousClass7TE.A1E()
            r2 = 3527(0xdc7, float:4.942E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r3.put(r2, r4)
            r3.put(r9, r8)
            java.lang.String r2 = "shopping_session_id"
            r3.put(r2, r5)
            r3.put(r7, r6)
            java.lang.String r2 = "INTERNAL_INFRA_screen_id"
            java.lang.String r5 = "com.bloks.www.payment.bloks.ecp.checkout.cds.deeplink.entrypoint"
            r3.put(r2, r5)
            java.util.HashMap r4 = X.C359608dC.A01(r3)
            com.instagram.bloks.hosting.IgBloksScreenConfig r3 = X.DbS.A0N(r0)
            java.util.Map r0 = java.util.Collections.emptyMap()
            X.DiU r2 = new X.DiU
            r2.<init>(r4, r0, r5)
            r0 = 37369934(0x23a384e, float:1.368128E-37)
            r2.A00 = r0
            r2.A0F(r1, r3)
            return
        L_0x01c7:
            boolean r2 = r1 instanceof com.instagram.urlhandlers.settingselevation.SettingsElevationUrlHandlerActivity
            if (r2 == 0) goto L_0x01de
            r2 = 1
            X.0qQ.A0B(r0, r2)
            X.XQw r2 = X.C21251XQw.MAIN_SETTINGS_SCREEN
            r3 = 0
            X.JaK r2 = X.Eq6.A00(r2, r3)
            X.6Yo r0 = X.DbU.A0P(r3, r2, r1, r0)
            X.DbV.A1O(r0)
            return
        L_0x01de:
            boolean r2 = r1 instanceof com.instagram.urlhandlers.settings2.Settings2UrlHandlerActivity
            if (r2 == 0) goto L_0x020b
            X.AnonymousClass7TG.A1O(r0, r5)
            java.lang.String r3 = X.DbS.A0m(r5)
            if (r3 == 0) goto L_0x00dc
            int r2 = r3.length()
            if (r2 == 0) goto L_0x00dc
            android.net.Uri r4 = X.DbT.A09(r3)
            java.lang.String r2 = "screen_id"
            java.lang.String r3 = r4.getQueryParameter(r2)
            java.lang.String r2 = "entrypoint"
            java.lang.String r4 = r4.getQueryParameter(r2)
            if (r3 == 0) goto L_0x00dc
            int r2 = r3.length()
            if (r2 == 0) goto L_0x00dc
            goto L_0x181b
        L_0x020b:
            boolean r2 = r1 instanceof com.instagram.urlhandlers.settings.SettingsUrlHandlerActivity
            if (r2 == 0) goto L_0x0245
            r6 = r1
            com.instagram.urlhandlers.settings.SettingsUrlHandlerActivity r6 = (com.instagram.urlhandlers.settings.SettingsUrlHandlerActivity) r6
            X.AnonymousClass7TG.A1O(r0, r5)
            java.lang.String r1 = X.DbS.A0m(r5)
            r4 = 0
            if (r1 == 0) goto L_0x1a26
            android.net.Uri r1 = X.0cp.A03(r1)
            java.lang.String r3 = r1.getHost()
            if (r3 == 0) goto L_0x1a26
            X.0hq r2 = r6.getSupportFragmentManager()
            X.06Q r1 = r6.A00
            r2.A0s(r1)
            java.lang.String r1 = "settings_devoptions"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x100e
            boolean r1 = X.2R8.A00(r0)
            if (r1 == 0) goto L_0x1a26
            X.0hq r1 = r6.getSupportFragmentManager()
            com.instagram.debug.devoptions.api.DeveloperOptionsLauncher.loadAndLaunchDeveloperOptions(r6, r1, r6, r0)
            return
        L_0x0245:
            boolean r2 = r1 instanceof com.instagram.urlhandlers.securityalerts.SecurityAlertsUrlHandlerActivity
            if (r2 == 0) goto L_0x0259
            r4 = r1
            com.instagram.urlhandlers.securityalerts.SecurityAlertsUrlHandlerActivity r4 = (com.instagram.urlhandlers.securityalerts.SecurityAlertsUrlHandlerActivity) r4
            X.AnonymousClass7TG.A1O(r0, r5)
            java.lang.String r3 = X.DbS.A0m(r5)
            if (r3 != 0) goto L_0x101d
            r4.finish()
            return
        L_0x0259:
            boolean r2 = r1 instanceof com.instagram.urlhandlers.security.SecurityUrlHandlerActivity
            if (r2 == 0) goto L_0x0284
            r3 = r1
            com.instagram.urlhandlers.security.SecurityUrlHandlerActivity r3 = (com.instagram.urlhandlers.security.SecurityUrlHandlerActivity) r3
            r1 = 1
            X.0qQ.A0B(r0, r1)
            boolean r1 = X.DbY.A1a(r0)
            if (r1 == 0) goto L_0x1832
            X.0hq r2 = r3.getSupportFragmentManager()
            X.06Q r1 = r3.A00
            r2.A0s(r1)
            r7 = 0
            java.lang.String r5 = "deeplink_screen"
            java.lang.String r6 = "security_and_login"
        L_0x0278:
            r2 = r3
            r4 = r0
            boolean r0 = X.C49955FGk.A05(r2, r3, r4, r5, r6, r7)
            if (r0 != 0) goto L_0x0034
            r3.finish()
            return
        L_0x0284:
            boolean r2 = r1 instanceof com.instagram.urlhandlers.promoteexternal.PromoteExternalUrlHandlerActivity
            if (r2 == 0) goto L_0x02ed
            X.AnonymousClass7TG.A1O(r0, r5)
            java.lang.String r2 = X.DbS.A0m(r5)
            if (r2 == 0) goto L_0x02d6
            android.net.Uri r3 = X.DbT.A09(r2)
            java.lang.String r2 = "coupon_offer_id"
            X.DbU.A1B(r3, r5, r2)
            java.lang.String r2 = "media_id"
            X.DbU.A1B(r3, r5, r2)
            java.lang.String r2 = "objective"
            X.DbU.A1B(r3, r5, r2)
            java.lang.String r2 = "entry_point"
            X.DbU.A1B(r3, r5, r2)
            java.lang.String r2 = "referral_code"
            X.DbU.A1B(r3, r5, r2)
            java.lang.String r2 = "aymt_channel"
            X.DbU.A1B(r3, r5, r2)
            java.lang.String r2 = "dummy_param_random_uuid"
            X.DbU.A1B(r3, r5, r2)
            java.lang.String r2 = "budget"
            X.DbU.A1B(r3, r5, r2)
            java.lang.String r2 = "duration"
            X.DbU.A1B(r3, r5, r2)
            java.lang.String r2 = "is_cta_ctwa_aymt"
            X.DbT.A1E(r3, r5, r2)
            java.lang.String r2 = "is_cta_lead_ads_aymt"
            X.DbT.A1E(r3, r5, r2)
            java.lang.String r2 = "has_relaunched_from_main_activity"
            X.DbT.A1E(r3, r5, r2)
            java.lang.String r2 = "is_client_spec_override"
            X.DbT.A1E(r3, r5, r2)
        L_0x02d6:
            android.content.Intent r3 = r1.getIntent()
            java.lang.String r2 = "access_token"
            r3.getStringExtra(r2)
            android.content.Intent r3 = r1.getIntent()
            java.lang.String r2 = "user_id"
            r3.getStringExtra(r2)
            X.FHB.A09(r5, r1, r0)
            goto L_0x00dc
        L_0x02ed:
            boolean r2 = r1 instanceof com.instagram.urlhandlers.pro2pro.Pro2ProFrameworkUrlHandlerActivity
            if (r2 == 0) goto L_0x034b
            r6 = r1
            com.instagram.urlhandlers.pro2pro.Pro2ProFrameworkUrlHandlerActivity r6 = (com.instagram.urlhandlers.pro2pro.Pro2ProFrameworkUrlHandlerActivity) r6
            X.AnonymousClass7TG.A1O(r0, r5)
            X.0hq r2 = r6.getSupportFragmentManager()
            r1 = 23
            X.C50128FQl.A00(r2, r6, r1)
            android.content.Intent r1 = r6.getIntent()
            java.lang.String r10 = "flow"
            java.lang.String r4 = r1.getStringExtra(r10)
            android.content.Intent r1 = r6.getIntent()
            java.lang.String r9 = "entry_point"
            java.lang.String r8 = r1.getStringExtra(r9)
            java.lang.String r1 = X.DbS.A0m(r5)
            if (r1 == 0) goto L_0x1872
            android.net.Uri r11 = android.net.Uri.parse(r1)
            if (r11 == 0) goto L_0x1872
            java.util.Set r1 = r11.getQueryParameterNames()
            if (r1 == 0) goto L_0x1872
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r12 = r1.iterator()
        L_0x032e:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x183b
            java.lang.Object r7 = r12.next()
            r3 = r7
            java.lang.String r3 = (java.lang.String) r3
            X.0qQ.A0A(r3)
            java.lang.String r2 = "custom_parameters"
            r1 = 0
            boolean r1 = X.00p.A0k(r3, r2, r1)
            if (r1 == 0) goto L_0x032e
            r5.add(r7)
            goto L_0x032e
        L_0x034b:
            boolean r2 = r1 instanceof com.instagram.urlhandlers.permissionsremovedaccounts.PermissionsRemovedAccountsUrlHandlerActivity
            if (r2 != 0) goto L_0x0034
            boolean r2 = r1 instanceof com.instagram.urlhandlers.permissionsmanagement.PermissionsManagementUrlHandlerActivity
            if (r2 != 0) goto L_0x0034
            boolean r2 = r1 instanceof com.instagram.urlhandlers.permissionsinvitation.PermissionsInvitationUrlHandlerActivity
            if (r2 != 0) goto L_0x0034
            boolean r2 = r1 instanceof com.instagram.urlhandlers.opentocollab.OpenToCollabSurfaceUrlHandlerActivity
            if (r2 == 0) goto L_0x040c
            r3 = 1
            X.AnonymousClass7TF.A1B(r0, r3, r5)
            X.0hq r4 = r1.getSupportFragmentManager()
            r2 = 18
            X.C50128FQl.A00(r4, r1, r2)
            r15 = 0
            java.util.LinkedHashMap r6 = X.AnonymousClass7TE.A1H()
            java.util.BitSet r8 = X.DbS.A0w(r3)
            java.lang.String r2 = X.DbS.A0m(r5)
            r9 = 0
            if (r2 == 0) goto L_0x0409
            android.net.Uri r4 = X.0cp.A03(r2)
            if (r4 == 0) goto L_0x0386
            java.lang.String r2 = "entrypoint"
            java.lang.String r10 = r4.getQueryParameter(r2)
            if (r10 != 0) goto L_0x03d0
        L_0x0386:
            java.lang.String r10 = "unknown"
            if (r4 != 0) goto L_0x03d0
            r7 = r15
        L_0x038b:
            java.lang.String r2 = "entrypoint"
            r4 = 0
            r6.put(r2, r10)
            r8.set(r4)
            if (r7 == 0) goto L_0x039b
            java.lang.String r2 = "from_profile_igid"
            r6.put(r2, r7)
        L_0x039b:
            if (r9 == 0) goto L_0x03a2
            java.lang.String r2 = "user_igids_to_rank_first"
            r6.put(r2, r9)
        L_0x03a2:
            int r2 = r8.nextClearBit(r4)
            if (r2 < r3) goto L_0x18f6
            X.0sm r18 = X.0Yt.A0E()
            java.util.Map r17 = X.0Yt.A0B(r6)
            r20 = 60
            r19 = 719983200(0x2aea1260, float:4.15795E-13)
            java.lang.String r14 = "com.bloks.www.ig.creator_connections.BloksIGOpenToCollabSurfaceScreenQuery"
            X.ShW r13 = new X.ShW
            r16 = r15
            r22 = r3
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r22)
            X.WF5 r2 = new X.WF5
            r2.<init>(r15, r15, r15, r15)
            X.6Qj r0 = X.C48721Ej6.A00(r0, r4)
            X.0qQ.A0B(r0, r3)
            r13.E0s(r1, r2, r0)
            return
        L_0x03d0:
            java.lang.String r2 = "from_profile_igid"
            java.lang.String r7 = r4.getQueryParameter(r2)
            java.lang.String r2 = "user_igids_to_rank_first"
            java.lang.String r2 = r4.getQueryParameter(r2)
            if (r2 == 0) goto L_0x038b
            java.util.ArrayList r14 = X.AnonymousClass7TE.A1C()
            org.json.JSONArray r13 = new org.json.JSONArray     // Catch:{ Exception -> 0x03fe }
            r13.<init>(r2)     // Catch:{ Exception -> 0x03fe }
            r12 = 0
            int r11 = r13.length()     // Catch:{ Exception -> 0x03fe }
        L_0x03ec:
            if (r12 >= r11) goto L_0x03fc
            long r4 = r13.getLong(r12)     // Catch:{ Exception -> 0x03fe }
            java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x03fe }
            r14.add(r2)     // Catch:{ Exception -> 0x03fe }
            int r12 = r12 + 1
            goto L_0x03ec
        L_0x03fc:
            r9 = r14
            goto L_0x038b
        L_0x03fe:
            X.0wj r5 = X.0wj.A01
            r4 = 245701013(0xea51995, float:4.0700275E-30)
            java.lang.String r2 = "OpenToCollabSurfaceUrlHandlerActivity: Failed to parse json array"
            r5.EFR(r4, r2)
            goto L_0x038b
        L_0x0409:
            r4 = r15
            goto L_0x0386
        L_0x040c:
            boolean r2 = r1 instanceof com.instagram.urlhandlers.musicselector.MusicSelectorUrlHandlerActivity
            if (r2 == 0) goto L_0x042b
            X.AnonymousClass7TG.A1O(r0, r5)
            java.lang.String r2 = X.DbS.A0m(r5)
            if (r2 == 0) goto L_0x0427
            android.net.Uri r3 = X.DbT.A09(r2)
            java.lang.String r2 = "media_id"
            X.DbU.A1B(r3, r5, r2)
            java.lang.String r2 = "entry_point"
            X.DbU.A1B(r3, r5, r2)
        L_0x0427:
            X.FHB.A0C(r5, r1, r0)
            return
        L_0x042b:
            boolean r2 = r1 instanceof com.instagram.urlhandlers.messagingadinspiration.MessagingAdInspirationUrlHandlerActivity
            if (r2 == 0) goto L_0x0483
            X.AnonymousClass7TG.A1O(r0, r5)
            java.lang.String r7 = X.DbS.A0m(r5)
            X.0Tu r4 = X.0Tu.A05
            r2 = 36330604370870979(0x81127e000042c3, double:3.038958723515872E-306)
            boolean r2 = X.182.A06(r4, r0, r2)
            if (r2 == 0) goto L_0x00dc
            r6 = 1
            if (r7 == 0) goto L_0x00dc
            int r2 = r7.length()
            if (r2 == 0) goto L_0x00dc
            r11 = 0
            android.net.Uri r4 = X.DbT.A09(r7)
            X.EVh r2 = X.C48089EVh.INSTAGRAM
            java.lang.String r3 = r2.toString()
            java.lang.String r2 = r4.getScheme()
            boolean r2 = X.00p.A0j(r3, r2, r6)
            if (r2 == 0) goto L_0x00dc
            java.lang.String r3 = r4.getHost()
            java.lang.String r2 = "messaging_ad_inspiration"
            if (r3 == 0) goto L_0x00dc
            boolean r2 = r3.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x00dc
            X.0xx r3 = X.DbW.A0E(r1)
            r12 = 34
            X.MHL r2 = new X.MHL
            r6 = r2
            r7 = r0
            r8 = r1
            r9 = r5
            r10 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12)
            X.AnonymousClass7TE.A1Z(r2, r3)
            return
        L_0x0483:
            boolean r2 = r1 instanceof com.instagram.urlhandlers.ifyrecipeselector.OpenIfyRecipeSelectorUrlHandlerActivity
            if (r2 == 0) goto L_0x04de
            r3 = 1
            X.0Tu r2 = X.DbS.A0J(r0, r3)
            r4 = 36329642298261741(0x81119e000140ed, double:3.0383503049238346E-306)
            boolean r2 = X.182.A06(r2, r0, r4)
            if (r2 == 0) goto L_0x00dc
            r5 = 0
            java.util.LinkedHashMap r4 = X.AnonymousClass7TE.A1H()
            r12 = 0
            java.util.BitSet r2 = X.DbS.A0w(r12)
            int r2 = r2.nextClearBit(r12)
            if (r2 < r12) goto L_0x18fb
            X.0sm r19 = X.0Yt.A0E()
            java.util.Map r18 = X.0Yt.A0B(r4)
            r21 = 0
            r20 = 719983200(0x2aea1260, float:4.15795E-13)
            java.lang.String r15 = "com.bloks.www.screen_query.BloksIFYPlaygroundRecipeSelectorScreenQuery"
            X.ShW r14 = new X.ShW
            r16 = r5
            r17 = r5
            r23 = r3
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r23)
            X.6Qj r2 = X.C48721Ej6.A00(r0, r12)
            java.lang.String r9 = ""
            X.Vbz r4 = new X.Vbz
            r6 = r5
            r7 = r5
            r8 = r5
            r10 = r5
            r11 = r5
            r13 = r12
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            X.WF5 r0 = new X.WF5
            r0.<init>(r4, r5, r5, r5)
            X.0qQ.A0B(r2, r3)
            r14.E0s(r1, r0, r2)
            return
        L_0x04de:
            boolean r2 = r1 instanceof com.instagram.urlhandlers.ifycarousel.OpenIfyCarouselUrlHandlerActivity
            if (r2 == 0) goto L_0x04fa
            r2 = 1
            X.AnonymousClass7TF.A1B(r0, r2, r5)
            java.lang.String r5 = X.DbS.A0m(r5)
            r4 = 0
            if (r5 == 0) goto L_0x00dc
            int r3 = r5.length()
            if (r3 == 0) goto L_0x00dc
            r10 = 0
            android.net.Uri r3 = X.DbT.A09(r5)
            goto L_0x1900
        L_0x04fa:
            boolean r2 = r1 instanceof com.instagram.urlhandlers.hidelikes.HideLikesUrlHandlerActivity
            if (r2 == 0) goto L_0x0522
            r2 = 1
            X.0qQ.A0B(r0, r2)
            java.util.HashMap r3 = X.AnonymousClass7TE.A1E()
            r2 = 2883(0xb43, float:4.04E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            X.DiU r4 = X.C46649DiU.A04(r2, r3)
            com.instagram.bloks.hosting.IgBloksScreenConfig r3 = X.DbS.A0N(r0)
            r2 = 2131963378(0x7f132df2, float:1.9563508E38)
            X.DbS.A18(r1, r3, r2)
            X.3M3 r2 = X.C49891FBs.A02(r3, r4)
            X.Dbb.A13(r2, r1, r0)
            return
        L_0x0522:
            boolean r2 = r1 instanceof com.instagram.urlhandlers.hiddenwords.HiddenWordsUrlHandlerActivity
            if (r2 == 0) goto L_0x053a
            r2 = 1
            X.0qQ.A0B(r0, r2)
            X.1ZQ r2 = X.C48883Elj.A00()
            X.1ZR r3 = r2.A00
            java.lang.Integer r2 = X.AnonymousClass05K.A1I
            androidx.fragment.app.Fragment r2 = r3.A00(r1, r0, r2)
            X.Dbb.A13(r2, r1, r0)
            return
        L_0x053a:
            boolean r2 = r1 instanceof com.instagram.urlhandlers.hallpass.HallPassUrlHandlerActivity
            if (r2 == 0) goto L_0x0571
            r9 = 1
            X.AnonymousClass7TF.A1B(r0, r9, r5)
            java.lang.String r2 = X.DbS.A0m(r5)
            if (r2 == 0) goto L_0x00dc
            r6 = 0
            android.net.Uri r3 = X.DbT.A09(r2)
            java.lang.String r2 = "hallpass_id"
            java.lang.String r8 = r3.getQueryParameter(r2)
            if (r8 == 0) goto L_0x0034
            java.lang.String r2 = "hallpass_name"
            java.lang.String r7 = r3.getQueryParameter(r2)
            if (r7 == 0) goto L_0x0034
            java.lang.String r3 = r3.getHost()
            java.lang.String r2 = "hallpass_members"
            if (r3 == 0) goto L_0x12a4
            boolean r2 = r3.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x12a4
            r2 = 0
            X.C49957FGp.A06(r1, r0, r8, r7, r2)
            goto L_0x00dc
        L_0x0571:
            boolean r2 = r1 instanceof com.instagram.urlhandlers.fbsurvey.InstagramFbSurveyConfirmUserActivity
            if (r2 != 0) goto L_0x0034
            boolean r2 = r1 instanceof com.instagram.urlhandlers.fbstorytagnotifications.FbStoryTagNotificationsUrlHandlerActivity
            if (r2 == 0) goto L_0x0596
            r4 = r1
            com.instagram.urlhandlers.fbstorytagnotifications.FbStoryTagNotificationsUrlHandlerActivity r4 = (com.instagram.urlhandlers.fbstorytagnotifications.FbStoryTagNotificationsUrlHandlerActivity) r4
            android.content.Intent r0 = r4.getIntent()
            if (r0 == 0) goto L_0x014e
            android.os.Bundle r0 = X.DbT.A0A(r0)
            if (r0 == 0) goto L_0x014e
            java.lang.String r1 = X.DbS.A0m(r0)
            if (r1 == 0) goto L_0x014e
            int r0 = r1.length()
            if (r0 == 0) goto L_0x014e
            goto L_0x06d7
        L_0x0596:
            boolean r2 = r1 instanceof com.instagram.urlhandlers.fbprofilelink.FbProfileLinkUrlHandlerActivity
            if (r2 == 0) goto L_0x0649
            r7 = r1
            com.instagram.urlhandlers.fbprofilelink.FbProfileLinkUrlHandlerActivity r7 = (com.instagram.urlhandlers.fbprofilelink.FbProfileLinkUrlHandlerActivity) r7
            r6 = 1
            X.0Tu r3 = X.DbS.A0J(r0, r6)
            r1 = 36320120357068837(0x8108f500152025, double:3.0323285909716625E-306)
            boolean r1 = X.182.A06(r3, r0, r1)
            if (r1 == 0) goto L_0x191f
            android.content.Intent r1 = r7.getIntent()
            r5 = 0
            if (r1 == 0) goto L_0x191f
            android.os.Bundle r1 = X.DbT.A0A(r1)
            if (r1 == 0) goto L_0x191f
            java.lang.String r2 = X.DbS.A0m(r1)
            if (r2 == 0) goto L_0x191f
            int r1 = r2.length()
            if (r1 == 0) goto L_0x191f
            android.net.Uri r1 = X.DbT.A09(r2)
            java.lang.String r9 = "variant"
            java.lang.String r4 = r1.getQueryParameter(r9)
            if (r4 != 0) goto L_0x05d4
            java.lang.String r4 = ""
        L_0x05d4:
            java.lang.String r1 = "a"
            boolean r8 = r4.equals(r1)
            X.0wc r2 = X.AnonymousClass0kN.A01(r7, r0)
            java.lang.String r1 = "fb_link_flow_add_from_upsell"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r2, r1)
            boolean r1 = r3.isSampled()
            if (r1 == 0) goto L_0x05fd
            java.util.LinkedHashMap r2 = X.AnonymousClass7TE.A1H()
            r2.put(r9, r4)
            r1 = 2335(0x91f, float:3.272E-42)
            java.lang.String r1 = X.C273654mx.A00(r1)
            r3.A9H(r1, r2)
            r3.Cgf()
        L_0x05fd:
            if (r8 == 0) goto L_0x0646
            java.lang.String r1 = "profile_bio_user_deep_link_interstitial"
        L_0x0601:
            X.1a1 r2 = X.C46447Df9.A02()
            java.lang.String r4 = "fb_profile_link_url_handler"
            X.Dfc r1 = X.C46548Dgp.A00(r0, r1, r4)
            androidx.fragment.app.Fragment r3 = X.C46474Dfc.A00(r0, r2, r1)
            boolean r1 = r3 instanceof X.AnonymousClass4DH
            if (r1 == 0) goto L_0x191f
            if (r8 != 0) goto L_0x0625
            X.0xY r2 = X.AnonymousClass7TF.A0N(r0)
            r1 = 3337(0xd09, float:4.676E-42)
            java.lang.String r1 = X.C273654mx.A00(r1)
            r2.E5T(r1, r6)
            r2.apply()
        L_0x0625:
            X.0wW r1 = r7.A00
            X.6Yo r1 = X.Dba.A0B(r7, r1)
            r1.A0F = r6
            r1.A0B(r5, r3)
            r1.A04()
            if (r8 == 0) goto L_0x0034
            X.1Z9 r2 = X.C48920EmK.A00()
            X.Fp5 r1 = new X.Fp5
            r1.<init>(r6, r3, r0, r7)
            X.ELU r0 = r2.A00(r7, r0, r1)
            r0.A06(r4, r5)
            return
        L_0x0646:
            java.lang.String r1 = "profile_bio_user_deep_link_add_fb_link"
            goto L_0x0601
        L_0x0649:
            boolean r2 = r1 instanceof com.instagram.urlhandlers.fbmentionsinigstories.FBMentionsInIGStoryUrlHandlerActivity
            if (r2 == 0) goto L_0x0669
            android.content.Intent r0 = r1.getIntent()
            if (r0 == 0) goto L_0x00dc
            android.os.Bundle r0 = X.DbT.A0A(r0)
            if (r0 == 0) goto L_0x00dc
            java.lang.String r2 = X.DbS.A0m(r0)
            if (r2 == 0) goto L_0x00dc
            int r0 = r2.length()
            if (r0 == 0) goto L_0x00dc
            java.lang.String r4 = "FBMentionsInIGStoryUrlHandlerActivity"
            goto L_0x12e8
        L_0x0669:
            boolean r2 = r1 instanceof com.instagram.urlhandlers.facebookpageonboarding.FacebookPageOnboardingUrlHandlerActivity
            if (r2 == 0) goto L_0x06b2
            r2 = 1
            X.0qQ.A0B(r0, r2)
            X.0hq r3 = r1.getSupportFragmentManager()
            r2 = 10
            X.C50128FQl.A00(r3, r1, r2)
            org.json.JSONObject r5 = X.DbS.A11()
            org.json.JSONObject r4 = X.DbS.A11()
            java.lang.String r3 = "flow"
            java.lang.String r2 = "pro2pro_framework_ccp_page_link_to_existing_page_flow"
            r4.put(r3, r2)
            java.lang.String r3 = "entry_point"
            java.lang.String r2 = "deeplink"
            r4.put(r3, r2)
            java.lang.String r2 = "server_params"
            r5.put(r2, r4)
            java.lang.String r3 = r5.toString()
            java.lang.String r2 = "params"
            java.util.HashMap r3 = X.DbY.A0m(r2, r3)
            X.0gy r4 = X.AnonymousClass07i.A00(r1)
            java.lang.String r2 = "com.bloks.www.pro_to_pro.framework.async.controller.entry"
            X.8ey r3 = X.C359988do.A05(r0, r2, r3)
            r2 = 24
            X.E86.A01(r3, r0, r1, r2)
            X.1ES.A00(r1, r4, r3)
            return
        L_0x06b2:
            boolean r2 = r1 instanceof com.instagram.urlhandlers.downloadyourinformation.DownloadYourInformationUrlHandlerActivity
            if (r2 == 0) goto L_0x07e2
            r3 = r1
            com.instagram.urlhandlers.downloadyourinformation.DownloadYourInformationUrlHandlerActivity r3 = (com.instagram.urlhandlers.downloadyourinformation.DownloadYourInformationUrlHandlerActivity) r3
            r1 = 1
            X.0qQ.A0B(r0, r1)
            boolean r1 = X.DbY.A1a(r0)
            if (r1 == 0) goto L_0x1928
            X.0hq r2 = r3.getSupportFragmentManager()
            X.06Q r1 = r3.A00
            r2.A0s(r1)
            r7 = 0
            java.lang.String r5 = "deeplink_screen"
            r1 = 1907(0x773, float:2.672E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r1)
            goto L_0x0278
        L_0x06d7:
            r3 = 0
            android.net.Uri r1 = X.DbT.A09(r1)     // Catch:{ SecurityException -> 0x07da }
            java.lang.String r0 = "story_bucket_id"
            java.lang.String r8 = r1.getQueryParameter(r0)     // Catch:{ SecurityException -> 0x07da }
            java.lang.String r7 = ""
            if (r8 != 0) goto L_0x06e7
            r8 = r7
        L_0x06e7:
            java.lang.String r0 = "story_card_id"
            java.lang.String r0 = r1.getQueryParameter(r0)     // Catch:{ SecurityException -> 0x07da }
            if (r0 == 0) goto L_0x06f0
            r7 = r0
        L_0x06f0:
            int r0 = r8.length()     // Catch:{ SecurityException -> 0x07da }
            if (r0 == 0) goto L_0x07d3
            int r0 = r7.length()     // Catch:{ SecurityException -> 0x07da }
            if (r0 == 0) goto L_0x07d3
            X.0wW r2 = r4.A00     // Catch:{ SecurityException -> 0x07da }
            X.0Tu r5 = X.0Tu.A05     // Catch:{ SecurityException -> 0x07da }
            r0 = 36320210550333549(0x81090a0005206d, double:3.0323856295554455E-306)
            boolean r0 = X.DbY.A1Y(r5, r2, r0)     // Catch:{ SecurityException -> 0x07da }
            if (r0 == 0) goto L_0x07cc
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch:{ SecurityException -> 0x07da }
            java.lang.String r0 = "com.facebook.wakizashi"
            android.content.Intent r0 = r1.getLaunchIntentForPackage(r0)     // Catch:{ SecurityException -> 0x07da }
            if (r0 != 0) goto L_0x0723
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch:{ SecurityException -> 0x07da }
            java.lang.String r0 = "com.facebook.katana"
            android.content.Intent r0 = r1.getLaunchIntentForPackage(r0)     // Catch:{ SecurityException -> 0x07da }
            if (r0 == 0) goto L_0x077d
        L_0x0723:
            X.0wW r2 = r4.A00     // Catch:{ SecurityException -> 0x07da }
            r0 = 36320210550268012(0x81090a0004206c, double:3.0323856295139996E-306)
            boolean r0 = X.DbY.A1Y(r5, r2, r0)     // Catch:{ SecurityException -> 0x07da }
            if (r0 == 0) goto L_0x077d
            X.0wW r2 = r4.A00     // Catch:{ SecurityException -> 0x07da }
            r0 = 36883160503878126(0x83090a000701ee, double:3.388397446994551E-306)
            java.lang.String r1 = X.182.A04(r5, r2, r0)     // Catch:{ SecurityException -> 0x07da }
            boolean r0 = X.00l.A0W(r1)     // Catch:{ SecurityException -> 0x07da }
            if (r0 == 0) goto L_0x076d
            java.lang.String r0 = "Story mention tracker mibextid is not available"
            com.instagram.urlhandlers.fbstorytagnotifications.FbStoryTagNotificationsUrlHandlerActivity.A02(r4, r0, r3)     // Catch:{ SecurityException -> 0x07da }
            java.lang.String r0 = com.instagram.urlhandlers.fbstorytagnotifications.FbStoryTagNotificationsUrlHandlerActivity.A00     // Catch:{ SecurityException -> 0x07da }
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r8, r7)     // Catch:{ SecurityException -> 0x07da }
        L_0x074c:
            X.0qQ.A0A(r0)     // Catch:{ SecurityException -> 0x07da }
            android.net.Uri r2 = X.DbT.A09(r0)     // Catch:{ SecurityException -> 0x07da }
            X.0wW r1 = r4.A00     // Catch:{ SecurityException -> 0x07da }
            X.DbS.A1Z(r1)     // Catch:{ SecurityException -> 0x07da }
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1     // Catch:{ SecurityException -> 0x07da }
            java.lang.String r0 = r2.toString()     // Catch:{ SecurityException -> 0x07da }
            boolean r0 = X.AnonymousClass5FF.A00(r4, r1, r0)     // Catch:{ SecurityException -> 0x07da }
            if (r0 == 0) goto L_0x0774
            java.lang.String r0 = X.DbT.A10(r2)     // Catch:{ SecurityException -> 0x07da }
            X.FH7.A03(r4, r0)     // Catch:{ SecurityException -> 0x07da }
            goto L_0x014e
        L_0x076d:
            java.lang.String r0 = com.instagram.urlhandlers.fbstorytagnotifications.FbStoryTagNotificationsUrlHandlerActivity.A01     // Catch:{ SecurityException -> 0x07da }
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r8, r7, r1)     // Catch:{ SecurityException -> 0x07da }
            goto L_0x074c
        L_0x0774:
            java.lang.String r0 = com.instagram.urlhandlers.fbstorytagnotifications.FbStoryTagNotificationsUrlHandlerActivity.A01(r4, r8, r7)     // Catch:{ SecurityException -> 0x07da }
            android.net.Uri r0 = X.DbT.A09(r0)     // Catch:{ SecurityException -> 0x07da }
            goto L_0x07bc
        L_0x077d:
            X.0wW r2 = r4.A00     // Catch:{ SecurityException -> 0x07da }
            r0 = 36601685527105843(0x82090a00061133, double:3.210391538275002E-306)
            java.lang.Long r0 = X.AnonymousClass7TF.A0Y(r5, r2, r0)     // Catch:{ SecurityException -> 0x07da }
            r1 = -1
            if (r0 == 0) goto L_0x07c1
            long r5 = r0.longValue()     // Catch:{ SecurityException -> 0x07da }
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x014e
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x07ae
            java.lang.String r3 = com.instagram.urlhandlers.fbstorytagnotifications.FbStoryTagNotificationsUrlHandlerActivity.A01(r4, r8, r7)     // Catch:{ SecurityException -> 0x07da }
            X.0wW r2 = r4.A00     // Catch:{ SecurityException -> 0x07da }
            X.DbS.A1Z(r2)     // Catch:{ SecurityException -> 0x07da }
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2     // Catch:{ SecurityException -> 0x07da }
            X.2EG r1 = X.2EG.A1S     // Catch:{ SecurityException -> 0x07da }
            java.lang.String r0 = "fb_story_tag_notifications"
            X.FH7.A08(r4, r2, r1, r3, r0)     // Catch:{ SecurityException -> 0x07da }
            goto L_0x014e
        L_0x07ae:
            r1 = 1
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x07c1
            java.lang.String r0 = com.instagram.urlhandlers.fbstorytagnotifications.FbStoryTagNotificationsUrlHandlerActivity.A01(r4, r8, r7)     // Catch:{ SecurityException -> 0x07da }
            android.net.Uri r0 = X.DbT.A09(r0)     // Catch:{ SecurityException -> 0x07da }
        L_0x07bc:
            X.0kR.A0F(r4, r0)     // Catch:{ SecurityException -> 0x07da }
            goto L_0x014e
        L_0x07c1:
            r0 = 967(0x3c7, float:1.355E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ SecurityException -> 0x07da }
            com.instagram.urlhandlers.fbstorytagnotifications.FbStoryTagNotificationsUrlHandlerActivity.A02(r4, r0, r3)     // Catch:{ SecurityException -> 0x07da }
            goto L_0x014e
        L_0x07cc:
            java.lang.String r0 = "Story mention deep link is not enabled"
            com.instagram.urlhandlers.fbstorytagnotifications.FbStoryTagNotificationsUrlHandlerActivity.A02(r4, r0, r3)     // Catch:{ SecurityException -> 0x07da }
            goto L_0x014e
        L_0x07d3:
            java.lang.String r0 = "Invalid or missing story_bucket_id and story_card_id params"
            com.instagram.urlhandlers.fbstorytagnotifications.FbStoryTagNotificationsUrlHandlerActivity.A02(r4, r0, r3)     // Catch:{ SecurityException -> 0x07da }
            goto L_0x014e
        L_0x07da:
            r1 = move-exception
            java.lang.String r0 = "SecurityException"
            com.instagram.urlhandlers.fbstorytagnotifications.FbStoryTagNotificationsUrlHandlerActivity.A02(r4, r0, r1)     // Catch:{ all -> 0x191a }
            goto L_0x014e
        L_0x07e2:
            boolean r2 = r1 instanceof com.instagram.urlhandlers.directthreadinternal.DirectThreadInternalUrlHandlerActivity
            if (r2 == 0) goto L_0x07fd
            r7 = r1
            com.instagram.urlhandlers.directthreadinternal.DirectThreadInternalUrlHandlerActivity r7 = (com.instagram.urlhandlers.directthreadinternal.DirectThreadInternalUrlHandlerActivity) r7
            r3 = 1
            int r6 = X.DbW.A02(r3, r0, r5)
            java.lang.String r2 = X.DbS.A0m(r5)
            if (r2 == 0) goto L_0x19b7
            int r1 = r2.length()
            if (r1 <= 0) goto L_0x19b7
            r5 = 0
            goto L_0x1931
        L_0x07fd:
            boolean r2 = r1 instanceof com.instagram.urlhandlers.directsuggestedreplysettings.DirectSuggestedReplySettingsUriHandlerActivity
            if (r2 == 0) goto L_0x0812
            r2 = 1
            X.0qQ.A0B(r0, r2)
            X.6Yo r6 = X.Dba.A0B(r1, r0)
            r6.A0F = r2
            X.ERm r2 = new X.ERm
            r2.<init>()
            goto L_0x010d
        L_0x0812:
            boolean r2 = r1 instanceof com.instagram.urlhandlers.directpollmessage.DirectPollMessageUrlHandlerActivity
            if (r2 == 0) goto L_0x089a
            r4 = r1
            com.instagram.urlhandlers.directpollmessage.DirectPollMessageUrlHandlerActivity r4 = (com.instagram.urlhandlers.directpollmessage.DirectPollMessageUrlHandlerActivity) r4
            r6 = 1
            X.AnonymousClass7TF.A1B(r0, r6, r5)
            java.lang.String r5 = X.DbS.A0m(r5)
            if (r5 != 0) goto L_0x0825
            java.lang.String r5 = ""
        L_0x0825:
            r3 = 0
            int r1 = r5.length()
            if (r1 == 0) goto L_0x014e
            android.net.Uri r8 = X.DbT.A09(r5)
            java.lang.String r1 = r8.getScheme()
            java.lang.String r7 = "instagram"
            boolean r1 = r7.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x0864
            java.lang.String r2 = r8.getHost()
            java.lang.String r1 = "thread"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L_0x0864
            int r2 = X.DbV.A03(r8)
            r1 = 3
            if (r2 != r1) goto L_0x0864
            java.util.List r1 = r8.getPathSegments()
            java.lang.String r2 = X.AnonymousClass7TE.A19(r1, r6)
            java.lang.String r1 = "group_polls"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L_0x0864
            com.instagram.urlhandlers.directpollmessage.DirectPollMessageUrlHandlerActivity.A01(r0, r4, r5, r3)
            goto L_0x014e
        L_0x0864:
            android.net.Uri r3 = X.DbT.A09(r5)
            java.lang.String r1 = r3.getScheme()
            boolean r1 = r7.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x014e
            java.lang.String r2 = r3.getHost()
            java.lang.String r1 = "msys_thread"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L_0x014e
            int r2 = X.DbV.A03(r3)
            r1 = 3
            if (r2 != r1) goto L_0x014e
            java.util.List r1 = r3.getPathSegments()
            java.lang.String r2 = X.AnonymousClass7TE.A19(r1, r6)
            java.lang.String r1 = "group_polls"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L_0x014e
            com.instagram.urlhandlers.directpollmessage.DirectPollMessageUrlHandlerActivity.A01(r0, r4, r5, r6)
            goto L_0x014e
        L_0x089a:
            boolean r2 = r1 instanceof com.instagram.urlhandlers.directinstantreply.DirectInstantReplySettingsUriHandlerActivity
            if (r2 == 0) goto L_0x08df
            r6 = 1
            X.AnonymousClass7TF.A1B(r0, r6, r5)
            java.lang.String r2 = X.DbS.A0m(r5)
            java.lang.String r3 = "entry_point"
            if (r2 == 0) goto L_0x08b4
            android.net.Uri r2 = android.net.Uri.parse(r2)
            java.lang.String r2 = r2.getQueryParameter(r3)
            if (r2 != 0) goto L_0x08b6
        L_0x08b4:
            java.lang.String r2 = "unknown"
        L_0x08b6:
            java.lang.Class<com.instagram.modal.ModalActivity> r5 = com.instagram.modal.ModalActivity.class
            java.util.HashMap r3 = X.DbY.A0m(r3, r2)
            java.lang.String r2 = "com.bloks.www.business_messaging.ig.messaging_tool.instant_reply"
            X.DiU r4 = X.C46649DiU.A04(r2, r3)
            com.instagram.bloks.hosting.IgBloksScreenConfig r3 = X.DbS.A0N(r0)
            r2 = 2131960070(0x7f132106, float:1.9556798E38)
            X.DbS.A18(r1, r3, r2)
            android.os.Bundle r3 = X.C49891FBs.A00(r3, r4)
            java.lang.String r2 = "bloks"
            X.6W8 r0 = X.AnonymousClass6W8.A03(r1, r3, r0, r5, r2)
            r0.A08 = r6
            r0.A08()
            r0.A0C(r1)
            return
        L_0x08df:
            boolean r2 = r1 instanceof com.instagram.urlhandlers.directgroupcreate.DirectCreateGroupUrlHandlerActivity
            if (r2 == 0) goto L_0x08fe
            r4 = 1
            android.os.Bundle r3 = X.DbV.A0B(r0, r4)
            java.lang.String r2 = "direct_is_creating_group_chat"
            r3.putBoolean(r2, r4)
            X.E5H r2 = new X.E5H
            r2.<init>()
            r2.setArguments(r3)
            X.6Yo r6 = X.DbU.A0Q(r1, r0)
            r0 = 0
            r6.A0D = r0
            goto L_0x010d
        L_0x08fe:
            boolean r2 = r1 instanceof com.instagram.urlhandlers.directagents.DirectAiAgentUrlHandlerActivity
            if (r2 == 0) goto L_0x0929
            r7 = 1
            X.AnonymousClass7TF.A1B(r0, r7, r5)
            X.1ps r6 = X.AnonymousClass9B9.A00()
            r2 = 133(0x85, float:1.86E-43)
            java.lang.String r2 = X.C273654mx.A00(r2)
            java.lang.String r4 = r5.getString(r2)
            if (r4 == 0) goto L_0x0926
            java.lang.String r3 = "reel"
            r2 = 0
            boolean r2 = X.00p.A0k(r4, r3, r2)
            if (r2 != r7) goto L_0x0926
            X.Nml r2 = X.C69503Nml.A0F
        L_0x0921:
            r6.A00(r1, r2, r0)
            goto L_0x00dc
        L_0x0926:
            X.Nml r2 = X.C69503Nml.A0D
            goto L_0x0921
        L_0x0929:
            boolean r2 = r1 instanceof com.instagram.urlhandlers.directagents.DirectAiAgentExternalUrlHandlerActivity
            if (r2 == 0) goto L_0x094b
            r2 = 1
            X.0qQ.A0B(r0, r2)
            X.AnonymousClass9B9.A00()
            X.9BB r2 = X.AnonymousClass9BA.A00(r0)
            java.lang.Integer r3 = r2.A00()
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            if (r3 == r2) goto L_0x13ae
            X.1ps r3 = X.AnonymousClass9B9.A00()
            X.Nml r2 = X.C69503Nml.A07
            r3.A00(r1, r2, r0)
            goto L_0x00dc
        L_0x094b:
            boolean r2 = r1 instanceof com.instagram.urlhandlers.direct.DirectUrlHandlerActivity
            if (r2 == 0) goto L_0x0a23
            r10 = 1
            X.AnonymousClass7TF.A1B(r0, r10, r5)
            java.lang.String r3 = X.DbS.A0m(r5)
            if (r3 == 0) goto L_0x00dc
            int r2 = r3.length()
            if (r2 == 0) goto L_0x00dc
            r28 = 0
            android.net.Uri r9 = X.DbT.A09(r3)
            java.lang.String r13 = r9.getHost()
            if (r13 == 0) goto L_0x00dc
            java.lang.String r12 = "id"
            java.lang.String r8 = r9.getQueryParameter(r12)
            java.lang.String r11 = "sender_id"
            java.lang.String r27 = r9.getQueryParameter(r11)
            java.lang.String r7 = "thread_id"
            java.lang.String r23 = r9.getQueryParameter(r7)
            java.lang.String r6 = "scroll_to_message_id"
            java.lang.String r22 = r9.getQueryParameter(r6)
            X.EVh r2 = X.C48089EVh.INSTAGRAM
            java.lang.String r3 = r2.toString()
            java.lang.String r2 = r9.getScheme()
            boolean r2 = X.00p.A0j(r3, r2, r10)
            if (r2 == 0) goto L_0x00dc
            java.lang.String r26 = "ad_id"
            r2 = r26
            java.lang.String r21 = r9.getQueryParameter(r2)
            r14 = 0
            X.17i r3 = X.17h.A00(r0)
            java.lang.String r2 = r0.A06
            r29 = r2
            com.instagram.user.model.User r2 = r3.A02(r2)
            com.instagram.user.model.User r3 = X.DbV.A0j(r0, r8)
            if (r2 == 0) goto L_0x0a20
            X.4Cl r2 = r2.A03
            java.lang.String r15 = r2.getUsername()
        L_0x09b4:
            if (r3 == 0) goto L_0x0a1d
            X.4Cl r2 = r3.A03
            java.lang.String r3 = r2.getUsername()
        L_0x09bc:
            java.lang.String r25 = "welcome_message"
            r2 = r25
            java.lang.String r4 = r9.getQueryParameter(r2)
            if (r4 != 0) goto L_0x0a00
            r4 = r28
        L_0x09c8:
            java.util.Set r2 = r9.getQueryParameterNames()
            java.util.ArrayList r20 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r16 = r2.iterator()
            r3 = 0
        L_0x09d5:
            boolean r2 = r16.hasNext()
            if (r2 == 0) goto L_0x13b6
            java.lang.String r15 = X.AnonymousClass7TE.A18(r16)
            X.0qQ.A0A(r15)
            java.lang.String r2 = "ice_breakers"
            boolean r2 = X.00l.A0d(r15, r2, r14)
            if (r2 == 0) goto L_0x09d5
            java.lang.String r15 = "ice_breakers["
            r2 = 93
            java.lang.String r2 = X.002.A0I(r15, r2, r3)
            java.lang.String r15 = r9.getQueryParameter(r2)
            if (r15 == 0) goto L_0x09d5
            r2 = r20
            r2.add(r15)
            int r3 = r3 + 1
            goto L_0x09d5
        L_0x0a00:
            if (r15 == 0) goto L_0x0a14
            java.lang.String r2 = "{{user_first_name}}"
            java.lang.String r4 = X.00p.A0g(r4, r2, r15, r14)
            java.lang.String r2 = "{{user_last_name}}"
            java.lang.String r4 = X.00p.A0g(r4, r2, r15, r14)
            java.lang.String r2 = "{{user_full_name}}"
            java.lang.String r4 = X.00p.A0g(r4, r2, r15, r14)
        L_0x0a14:
            if (r3 == 0) goto L_0x09c8
            java.lang.String r2 = "{{page_name}}"
            java.lang.String r4 = X.00p.A0g(r4, r2, r3, r14)
            goto L_0x09c8
        L_0x0a1d:
            r3 = r28
            goto L_0x09bc
        L_0x0a20:
            r15 = r28
            goto L_0x09b4
        L_0x0a23:
            boolean r2 = r1 instanceof com.instagram.urlhandlers.crossapptagging.XATTagsSettingsUrlHandlerActivity
            if (r2 == 0) goto L_0x0a56
            X.AnonymousClass7TG.A1O(r0, r5)
            java.lang.String r2 = X.DbS.A0m(r5)
            if (r2 == 0) goto L_0x00dc
            int r2 = r2.length()
            if (r2 == 0) goto L_0x00dc
            java.util.HashMap r3 = X.AnonymousClass7TE.A1E()
            r2 = 1201(0x4b1, float:1.683E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            X.DiU r4 = X.C46649DiU.A04(r2, r3)
            com.instagram.bloks.hosting.IgBloksScreenConfig r3 = X.DbS.A0N(r0)
            r2 = 2131976924(0x7f1362dc, float:1.9590982E38)
            X.DbS.A18(r1, r3, r2)
            X.3M3 r2 = X.C49891FBs.A02(r3, r4)
            X.Dbb.A13(r2, r1, r0)
            return
        L_0x0a56:
            boolean r2 = r1 instanceof com.instagram.urlhandlers.creatortools.CreatorToolsUrlHandlerActivity
            if (r2 == 0) goto L_0x0a8c
            X.AnonymousClass7TG.A1O(r0, r5)
            java.lang.String r2 = X.DbS.A0m(r5)
            if (r2 == 0) goto L_0x00dc
            android.net.Uri r2 = X.DbT.A09(r2)
            java.lang.String r3 = "entry_point"
            java.lang.String r2 = r2.getQueryParameter(r3)
            X.6Yo r6 = X.DbS.A0M(r1, r0)
            X.E2m r1 = new X.E2m
            r1.<init>()
            X.0eP r0 = X.AnonymousClass7TE.A1L(r3, r2)
            r5 = 0
            X.0eP[] r0 = new X.0eP[]{r0}
            X.DbT.A1N(r1, r0)
            r6.A0D(r1)
            r0 = 1
            r6.A0F = r0
        L_0x0a88:
            r6.A0D = r5
            goto L_0x0110
        L_0x0a8c:
            boolean r2 = r1 instanceof com.instagram.urlhandlers.creatorresumeonboarding.CreatorResumeOnboardingUrlHandlerActivity
            if (r2 == 0) goto L_0x0ac4
            X.AnonymousClass7TG.A1O(r0, r5)
            java.lang.String r2 = X.DbS.A0m(r5)
            if (r2 == 0) goto L_0x00dc
            r5 = 0
            android.net.Uri r4 = X.DbT.A09(r2)
            java.lang.String r2 = "product"
            java.lang.String r3 = r4.getQueryParameter(r2)
            java.lang.String r2 = "origin"
            java.lang.String r10 = r4.getQueryParameter(r2)
            java.lang.String r2 = "created_deal_id"
            java.lang.String r11 = r4.getQueryParameter(r2)
            java.lang.String r2 = "fe_id"
            java.lang.String r12 = r4.getQueryParameter(r2)
            java.lang.String r9 = "CreatorResumeOnboardingUrlHandlerActivity"
            com.instagram.api.schemas.UserMonetizationProductType r7 = X.C272504kq.A00(r3)
            r6 = r1
            r8 = r0
            r13 = r5
            X.F6T.A01(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x00dc
        L_0x0ac4:
            boolean r2 = r1 instanceof com.instagram.urlhandlers.creatoronboarding.CreatorOnboardingUrlHandlerActivity
            if (r2 == 0) goto L_0x0b30
            X.AnonymousClass7TG.A1O(r0, r5)
            java.lang.String r2 = X.DbS.A0m(r5)
            if (r2 == 0) goto L_0x00dc
            r4 = 0
            android.net.Uri r7 = X.DbT.A09(r2)
            java.lang.String r2 = X.DbT.A10(r7)
            java.lang.String r13 = "igtv_revshare_onboarding"
            r5 = 0
            r3 = 0
            boolean r2 = X.00l.A0d(r2, r13, r3)
            if (r2 == 0) goto L_0x1054
            java.lang.String r2 = "origin"
            java.lang.String r2 = r7.getQueryParameter(r2)
            if (r2 == 0) goto L_0x0af0
            java.lang.String r5 = X.DbY.A0k(r2)
        L_0x0af0:
            java.lang.String r2 = "PRO_HOME"
            boolean r2 = X.0qQ.A0K(r5, r2)
            if (r2 != 0) goto L_0x1054
            r1.finish()
            X.2ZQ r2 = X.C71172bH.A00()
            boolean r0 = r2 instanceof androidx.fragment.app.FragmentActivity
            if (r0 == 0) goto L_0x0034
            android.app.Activity r2 = (android.app.Activity) r2
            if (r2 == 0) goto L_0x0034
            X.8ab r2 = X.DbS.A0X(r2)
            r0 = 2131237593(0x7f081ad9, float:1.809144E38)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            r2.A0j(r0)
            r0 = 2131964088(0x7f1330b8, float:1.9564948E38)
            r2.A09(r0)
            r0 = 2131964086(0x7f1330b6, float:1.9564944E38)
            r2.A08(r0)
            r1 = 2131964087(0x7f1330b7, float:1.9564946E38)
            X.8ae r0 = X.C358278ae.DEFAULT
            r2.A0Q(r4, r0, r1)
            r2.A0s(r3)
            X.DbT.A1V(r2)
            return
        L_0x0b30:
            boolean r2 = r1 instanceof com.instagram.urlhandlers.creatormonetizationopenaccess.CreatorMonetizationOpenAccessUrlHandlerActivity
            if (r2 == 0) goto L_0x0b80
            r6 = r1
            com.instagram.urlhandlers.creatormonetizationopenaccess.CreatorMonetizationOpenAccessUrlHandlerActivity r6 = (com.instagram.urlhandlers.creatormonetizationopenaccess.CreatorMonetizationOpenAccessUrlHandlerActivity) r6
            X.AnonymousClass7TG.A1O(r0, r5)
            java.lang.String r3 = X.DbS.A0m(r5)
            if (r3 == 0) goto L_0x1a26
            X.0hq r2 = r6.getSupportFragmentManager()
            X.06Q r1 = r6.A00
            r2.A0s(r1)
            r4 = 0
            android.net.Uri r2 = X.DbT.A09(r3)
            r8 = 0
            java.lang.String r7 = X.DbT.A10(r2)
            java.lang.String r5 = "origin"
            java.lang.String r1 = r2.getQueryParameter(r5)
            java.lang.String r3 = "id"
            java.lang.String r2 = r2.getQueryParameter(r3)
            X.0eP r1 = X.AnonymousClass7TE.A1L(r5, r1)
            java.util.HashMap r2 = X.Dbb.A0e(r3, r2, r1)
            java.lang.String r1 = "open_access_application_enrollment"
            boolean r1 = X.00l.A0d(r7, r1, r8)
            if (r1 == 0) goto L_0x175e
            X.6Yo r6 = X.DbU.A0Q(r6, r0)
            r6.A0D = r8
            java.lang.String r1 = "com.instagram.creator_monetization.open_access.screens.application_start"
            X.3M3 r0 = X.C46649DiU.A02(r0, r1, r2)
            r6.A0B(r4, r0)
            goto L_0x0110
        L_0x0b80:
            boolean r2 = r1 instanceof com.instagram.urlhandlers.completeyourprofile.CompleteYourProfileUrlHandlerActivity
            if (r2 == 0) goto L_0x0bb9
            r7 = 1
            X.AnonymousClass7TF.A1B(r0, r7, r5)
            X.0hq r3 = r1.getSupportFragmentManager()
            r2 = 7
            X.C50128FQl.A00(r3, r1, r2)
            com.instagram.profile.edit.fragment.CompleteYourProfileFragment r6 = new com.instagram.profile.edit.fragment.CompleteYourProfileFragment
            r6.<init>()
            android.os.Bundle r4 = X.DbY.A08(r6)
            r4.putAll(r5)
            java.lang.String r3 = "entry_point"
            java.lang.String r2 = "professional_onboarding_checklist"
            r4.putString(r3, r2)
            r6.setArguments(r4)
            X.F1I r8 = new X.F1I
            r8.<init>()
            r12 = 0
            X.EtT r2 = new X.EtT
            r2.<init>(r0)
            r9 = r6
            r10 = r1
            r11 = r2
            r13 = r7
            r8.A00(r9, r10, r11, r12, r13)
            return
        L_0x0bb9:
            boolean r2 = r1 instanceof com.instagram.urlhandlers.commerceappeals.CommerceAppealsEditMediaInfoUrlHandlerActivity
            if (r2 == 0) goto L_0x0c0f
            r4 = r1
            com.instagram.urlhandlers.commerceappeals.CommerceAppealsEditMediaInfoUrlHandlerActivity r4 = (com.instagram.urlhandlers.commerceappeals.CommerceAppealsEditMediaInfoUrlHandlerActivity) r4
            X.AnonymousClass7TG.A1O(r0, r5)
            java.lang.String r3 = X.DbS.A0m(r5)
            if (r3 == 0) goto L_0x1a2a
            X.0hq r2 = r4.getSupportFragmentManager()
            X.06Q r1 = r4.A00
            r2.A0s(r1)
            android.net.Uri r2 = X.DbT.A09(r3)
            java.lang.String r1 = "media_id"
            java.lang.String r8 = r2.getQueryParameter(r1)
            java.lang.String r1 = "uid"
            java.lang.String r3 = r2.getQueryParameter(r1)
            if (r8 == 0) goto L_0x1a2a
            com.instagram.user.model.User r1 = X.AnonymousClass7TF.A0Q(r0)
            java.lang.String r2 = r1.getId()
            java.lang.String r1 = ""
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x1a2a
            boolean r1 = r2.equals(r3)
            if (r1 == 0) goto L_0x1a2a
            X.6Yo r6 = X.DbS.A0M(r4, r0)
            X.LGR r7 = X.AnonymousClass36R.A01()
            X.1iA r0 = X.1iA.A0Q
            int r9 = r0.A00
            r10 = -1
            r12 = 0
            r11 = r10
            com.instagram.creation.fragment.EditMediaInfoFragment r2 = r7.A02(r8, r9, r10, r11, r12)
            goto L_0x010d
        L_0x0c0f:
            boolean r2 = r1 instanceof com.instagram.urlhandlers.businessprofilecalling.BusinessProfileCallingUrlHandlerActivity
            if (r2 == 0) goto L_0x0c53
            r2 = 1
            X.0qQ.A0B(r0, r2)
            X.6qr r3 = X.C319586qr.EDIT_PROFILE
            java.lang.String r2 = X.AnonymousClass7TF.A0b()
            java.lang.String r6 = "deep_link"
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r4 = X.C319596qs.A01(r3, r0, r6, r2)
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r0)
            X.DbU.A0R()
            boolean r2 = r0.A2M()
            r5 = 0
            r0 = 2
            android.os.Bundle r3 = X.DbV.A0B(r6, r0)
            java.lang.String r0 = "is_profile_audio_call_enabled"
            r3.putBoolean(r0, r2)
            java.lang.String r0 = "maybe_show_confirmation_dialog"
            r3.putBoolean(r0, r5)
            X.DbS.A1B(r3, r6)
            X.E2a r2 = new X.E2a
            r2.<init>()
            r2.A00 = r4
            r2.setArguments(r3)
            X.0wW r0 = r1.A00
            X.6Yo r6 = X.DbV.A0M(r2, r1, r0)
            goto L_0x0a88
        L_0x0c53:
            boolean r2 = r1 instanceof com.instagram.urlhandlers.brandedcontentad.BrandedContentAdUrlHandlerActivity
            if (r2 == 0) goto L_0x0c87
            r4 = r1
            com.instagram.urlhandlers.brandedcontentad.BrandedContentAdUrlHandlerActivity r4 = (com.instagram.urlhandlers.brandedcontentad.BrandedContentAdUrlHandlerActivity) r4
            r3 = 1
            X.AnonymousClass7TF.A1B(r0, r3, r5)
            java.lang.String r1 = X.DbS.A0m(r5)
            if (r1 == 0) goto L_0x014e
            r6 = 0
            android.net.Uri r2 = X.DbT.A09(r1)
            java.lang.String r1 = "destination"
            java.lang.String r7 = r2.getQueryParameter(r1)
            java.lang.String r1 = "data"
            java.lang.String r5 = r2.getQueryParameter(r1)
            java.lang.String r2 = X.DbZ.A0h(r2)
            if (r2 != 0) goto L_0x0c7d
            java.lang.String r2 = "DEEP_LINK"
        L_0x0c7d:
            if (r7 == 0) goto L_0x014e
            int r1 = r7.hashCode()
            switch(r1) {
                case -1146486146: goto L_0x1794;
                case 441045596: goto L_0x1788;
                case 1114935692: goto L_0x0f38;
                case 1898854722: goto L_0x177b;
                default: goto L_0x0c86;
            }
        L_0x0c86:
            return
        L_0x0c87:
            boolean r2 = r1 instanceof com.instagram.urlhandlers.brandedcontent.BrandedContentUrlHandlerActivity
            if (r2 == 0) goto L_0x0cdc
            X.AnonymousClass7TG.A1O(r0, r5)
            java.lang.String r2 = X.DbS.A0m(r5)
            if (r2 == 0) goto L_0x00dc
            r7 = 0
            android.net.Uri r3 = X.DbT.A09(r2)
            java.lang.String r4 = X.DbT.A10(r3)
            java.lang.String r2 = "branded_content_project"
            r5 = 0
            boolean r2 = X.00l.A0d(r4, r2, r5)
            if (r2 == 0) goto L_0x120c
            java.lang.String r2 = "project_id"
            java.lang.String r3 = r3.getQueryParameter(r2)
            if (r3 == 0) goto L_0x00dc
            boolean r2 = X.00l.A0W(r3)
            if (r2 != 0) goto L_0x00dc
            com.instagram.bloks.hosting.IgBloksScreenConfig r7 = X.DbS.A0N(r0)
            java.lang.String r2 = "ent_id"
            X.0eP r6 = X.AnonymousClass7TE.A1L(r2, r3)
            java.lang.String r3 = "use_case"
            java.lang.String r2 = "PROJECT"
            X.0eP r4 = X.AnonymousClass7TE.A1L(r3, r2)
            java.lang.String r3 = "entrypoint"
            java.lang.String r2 = "PARTNERSHIP_THREAD"
            java.util.LinkedHashMap r3 = X.DbY.A0q(r3, r2, r6, r4)
            java.lang.String r2 = "com.bloks.www.creator_commerce.project_details"
            X.DiU r2 = X.C46649DiU.A04(r2, r3)
            X.6Yo r6 = X.C46649DiU.A01(r1, r7, r2, r0)
            r6.A0D = r5
            goto L_0x0110
        L_0x0cdc:
            boolean r2 = r1 instanceof com.instagram.urlhandlers.boostresharedmedianotdelivering.BoostResharedMediaNotDeliveringUrlHandlerActivity
            if (r2 == 0) goto L_0x0cf6
            X.AnonymousClass7TG.A1O(r0, r5)
            java.lang.String r2 = X.DbS.A0m(r5)
            if (r2 == 0) goto L_0x0cf2
            android.net.Uri r3 = X.DbT.A09(r2)
            java.lang.String r2 = "media_id"
            X.DbU.A1B(r3, r5, r2)
        L_0x0cf2:
            X.FHB.A0B(r5, r1, r0)
            return
        L_0x0cf6:
            boolean r2 = r1 instanceof com.instagram.urlhandlers.booking.BookingOptOutAdminTextHandler
            if (r2 == 0) goto L_0x0d23
            r2 = 1
            X.0qQ.A0B(r0, r2)
            java.lang.String r2 = r0.A06
            java.lang.Long r2 = X.DbV.A0q(r2)
            java.lang.String r3 = r2.toString()
            java.lang.String r2 = "merchant_id"
            X.0eP r2 = X.AnonymousClass7TE.A1L(r2, r3)
            r4 = 0
            X.0eP[] r2 = new X.0eP[]{r2}
            java.util.HashMap r3 = X.0Yt.A02(r2)
            java.lang.String r2 = "com.bloks.www.services.ig.appointment.booking.opt_out.setting"
            X.3M3 r2 = X.C46649DiU.A02(r0, r2, r3)
            X.6Yo r6 = X.DbS.A0M(r1, r0)
            goto L_0x010b
        L_0x0d23:
            boolean r2 = r1 instanceof com.instagram.urlhandlers.bloksformflow.BloksFormFlowUrlHandlerActivity
            if (r2 == 0) goto L_0x0e14
            r4 = 1
            X.AnonymousClass7TF.A1B(r0, r4, r5)
            com.instagram.bloks.hosting.IgBloksScreenConfig r9 = X.DbS.A0N(r0)
            java.lang.String r10 = "com.bloks.www.bloks.form.flow.start"
            r9.A0R = r10
            android.content.Intent r3 = r1.getIntent()
            r6 = 0
            if (r3 == 0) goto L_0x0e11
            java.lang.String r2 = "user_id"
            java.lang.String r8 = r3.getStringExtra(r2)
        L_0x0d40:
            android.content.Intent r3 = r1.getIntent()
            if (r3 == 0) goto L_0x0e0e
            java.lang.String r2 = "product"
            java.lang.String r3 = r3.getStringExtra(r2)
        L_0x0d4c:
            android.content.Intent r7 = r1.getIntent()
            if (r7 == 0) goto L_0x0e0b
            java.lang.String r2 = "entrypoint"
            java.lang.String r11 = r7.getStringExtra(r2)
        L_0x0d58:
            if (r8 == 0) goto L_0x0d68
            int r2 = r8.length()
            if (r2 == 0) goto L_0x0d68
            if (r3 == 0) goto L_0x0d68
            int r2 = r3.length()
            if (r2 != 0) goto L_0x0d6b
        L_0x0d68:
            r1.finish()
        L_0x0d6b:
            java.lang.String r2 = r0.A06
            boolean r2 = X.0qQ.A0K(r2, r8)
            if (r2 == 0) goto L_0x0db9
            java.util.HashMap r12 = X.AnonymousClass7TE.A1E()
            java.util.HashMap r8 = X.AnonymousClass7TE.A1E()
            java.util.HashMap r7 = X.AnonymousClass7TE.A1E()
            java.util.BitSet r5 = X.DbS.A0w(r4)
            java.lang.String r2 = "product"
            boolean r3 = X.Dba.A1Z(r2, r3, r12, r5)
            if (r11 == 0) goto L_0x0d91
            int r2 = r11.length()
            if (r2 != 0) goto L_0x0d93
        L_0x0d91:
            java.lang.String r11 = "UNKNOWN"
        L_0x0d93:
            java.lang.String r2 = "entry_point"
            r12.put(r2, r11)
            int r2 = r5.nextClearBit(r3)
            if (r2 < r4) goto L_0x1a2e
            X.DiU r2 = X.C46649DiU.A05(r10, r12, r8)
            r2.A03 = r6
            r2.A02 = r6
            r2.A04 = r6
            r2.A0H(r7)
            X.3M3 r2 = r2.A0C(r1, r9)
            X.6Yo r0 = X.DbU.A0P(r6, r2, r1, r0)
            r0.A0D = r3
            r0.A04()
        L_0x0db8:
            return
        L_0x0db9:
            X.0BQ r7 = X.AnonymousClass0BO.A00(r0)
            r2 = r7
            X.0tB r2 = (X.0tB) r2
            java.util.List r2 = r2.BNy(r6)
            boolean r2 = X.00k.A0u(r2, r8)
            if (r2 == 0) goto L_0x1a34
            com.instagram.user.model.User r6 = r7.BNw(r8)
            if (r6 == 0) goto L_0x0db8
            boolean r2 = r7.AG1(r1, r0, r6)
            if (r2 == 0) goto L_0x0db8
            java.lang.String r3 = X.DbS.A0m(r5)
            if (r3 == 0) goto L_0x0db8
            int r2 = r3.length()
            if (r2 == 0) goto L_0x0db8
            android.net.Uri r4 = X.DbT.A09(r3)     // Catch:{ SecurityException -> 0x0db8 }
            java.lang.String r2 = "android.intent.action.VIEW"
            android.content.Intent r3 = new android.content.Intent     // Catch:{ SecurityException -> 0x0db8 }
            r3.<init>(r2, r4)     // Catch:{ SecurityException -> 0x0db8 }
            r2 = 65536(0x10000, float:9.18355E-41)
            android.content.Intent r3 = r3.setFlags(r2)     // Catch:{ SecurityException -> 0x0db8 }
            X.0qQ.A07(r3)     // Catch:{ SecurityException -> 0x0db8 }
            java.lang.String r2 = r1.getPackageName()     // Catch:{ SecurityException -> 0x0db8 }
            r3.setPackage(r2)     // Catch:{ SecurityException -> 0x0db8 }
            java.lang.String r12 = "deep_link"
            r8 = r1
            r9 = r3
            r10 = r0
            r11 = r6
            r7.E2S(r8, r9, r10, r11, r12)     // Catch:{ SecurityException -> 0x0db8 }
            r1.finish()     // Catch:{ SecurityException -> 0x0db8 }
            goto L_0x1a33
        L_0x0e0b:
            r11 = r6
            goto L_0x0d58
        L_0x0e0e:
            r3 = r6
            goto L_0x0d4c
        L_0x0e11:
            r8 = r6
            goto L_0x0d40
        L_0x0e14:
            boolean r2 = r1 instanceof com.instagram.urlhandlers.birthdayvisibilitysettings.BirthdayVisibilitySettingsUrlHandlerActivity
            if (r2 == 0) goto L_0x0e4c
            r7 = 1
            X.AnonymousClass7TF.A1B(r0, r7, r5)
            android.content.Intent r3 = r1.getIntent()
            r4 = 0
            if (r3 == 0) goto L_0x0e4a
            java.lang.String r2 = "target_user_id"
            java.lang.String r3 = r3.getStringExtra(r2)
            if (r3 == 0) goto L_0x0e31
            int r2 = r3.length()
            if (r2 != 0) goto L_0x0e34
        L_0x0e31:
            r1.finish()
        L_0x0e34:
            java.lang.String r2 = r0.A06
            boolean r2 = X.0qQ.A0K(r2, r3)
            if (r2 == 0) goto L_0x1640
            X.6Yo r6 = X.Dba.A0B(r1, r0)
            X.ESH r0 = new X.ESH
            r0.<init>()
            r6.A0B(r4, r0)
            goto L_0x0110
        L_0x0e4a:
            r3 = r4
            goto L_0x0e31
        L_0x0e4c:
            boolean r2 = r1 instanceof com.instagram.urlhandlers.birthdayeffectssettings.BirthdayEffectsSettingsUrlHandlerActivity
            if (r2 == 0) goto L_0x0e5f
            r2 = 1
            X.0qQ.A0B(r0, r2)
            X.6Yo r6 = X.Dba.A0B(r1, r0)
            X.E26 r2 = new X.E26
            r2.<init>()
            goto L_0x010d
        L_0x0e5f:
            boolean r2 = r1 instanceof com.instagram.urlhandlers.birthdaycenter.BirthdayCenterUrlHandlerActivity
            if (r2 == 0) goto L_0x0e72
            r2 = 1
            X.0qQ.A0B(r0, r2)
            X.6Yo r6 = X.Dba.A0B(r1, r0)
            X.E1k r2 = new X.E1k
            r2.<init>()
            goto L_0x010d
        L_0x0e72:
            boolean r2 = r1 instanceof com.instagram.urlhandlers.aiconsumption.OpenMifuCarouselUrlHandlerActivity
            if (r2 == 0) goto L_0x0e9c
            r2 = 1
            X.AnonymousClass7TF.A1B(r0, r2, r5)
            X.0Tu r6 = X.0Tu.A05
            r3 = 36328349513694482(0x811071000a3d12, double:3.0375327427578744E-306)
            boolean r3 = X.182.A06(r6, r0, r3)
            if (r3 == 0) goto L_0x00dc
            java.lang.String r5 = X.DbS.A0m(r5)
            r12 = 1
            r4 = 0
            if (r5 == 0) goto L_0x00dc
            int r3 = r5.length()
            if (r3 == 0) goto L_0x00dc
            r13 = 0
            android.net.Uri r6 = X.DbT.A09(r5)
            goto L_0x1a78
        L_0x0e9c:
            boolean r2 = r1 instanceof com.instagram.urlhandlers.adspayments.AdsPaymentsUrlHandlerActivity
            if (r2 == 0) goto L_0x0eaf
            r2 = 1
            X.0qQ.A0B(r0, r2)
            X.6Yo r6 = X.Dba.A0B(r1, r0)
            X.UsI r2 = new X.UsI
            r2.<init>()
            goto L_0x010d
        L_0x0eaf:
            boolean r2 = r1 instanceof com.instagram.urlhandlers.adactivity.AdActivityUrlHandlerActivity
            if (r2 == 0) goto L_0x0ec0
            X.0wW r0 = r1.A00
            X.6Yo r6 = X.Dba.A0B(r1, r0)
            com.instagram.adshistory.fragment.RecentAdActivityFragment r2 = new com.instagram.adshistory.fragment.RecentAdActivityFragment
            r2.<init>()
            goto L_0x010d
        L_0x0ec0:
            boolean r2 = r1 instanceof com.instagram.creator.agent.suggestedreplies.deeplink.SuggestedRepliesSettingsUrlHandlerActivity
            if (r2 == 0) goto L_0x1682
            X.AnonymousClass7TG.A1O(r0, r5)
            X.0Tu r4 = X.0Tu.A06
            r2 = 36321279997060323(0x810a03000324e3, double:3.0330619519717737E-306)
            boolean r2 = X.182.A06(r4, r0, r2)
            if (r2 == 0) goto L_0x00dc
            java.lang.String r3 = X.DbS.A0m(r5)
            r5 = 0
            if (r3 == 0) goto L_0x00dc
            int r2 = r3.length()
            if (r2 == 0) goto L_0x00dc
            android.net.Uri r2 = X.0cp.A03(r3)
            java.lang.String r8 = "entrypoint"
            java.lang.String r7 = r2.getQueryParameter(r8)
            java.lang.String r2 = "qp"
            boolean r9 = X.0qQ.A0K(r7, r2)
            X.1Av r6 = X.1Au.A00(r0)
            X.0s0 r4 = r6.A1a
            X.0YZ[] r3 = X.1Av.A8a
            r2 = 387(0x183, float:5.42E-43)
            boolean r2 = X.AnonymousClass7TG.A1a(r6, r4, r3, r2)
            if (r2 == 0) goto L_0x0f1a
            if (r9 != 0) goto L_0x0f1a
            X.K4q r4 = new X.K4q
            r4.<init>()
            X.0eP[] r2 = X.DbW.A1b(r8, r7)
        L_0x0f0c:
            X.DbT.A1N(r4, r2)
            X.6Yo r6 = X.DbS.A0M(r1, r0)
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            r6.A0D(r4)
            goto L_0x0a88
        L_0x0f1a:
            X.E3z r4 = new X.E3z
            r4.<init>()
            java.lang.String r2 = "prodash_tools"
            boolean r2 = X.0qQ.A0K(r7, r2)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            java.lang.String r2 = "should_open_settings"
            X.0eP r3 = X.AnonymousClass7TE.A1L(r2, r3)
            X.0eP r2 = X.AnonymousClass7TE.A1L(r8, r7)
            X.0eP[] r2 = new X.0eP[]{r3, r2}
            goto L_0x0f0c
        L_0x0f38:
            java.lang.String r1 = "copy_ad_code_xma"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x0034
            if (r5 != 0) goto L_0x0f44
            java.lang.String r5 = ""
        L_0x0f44:
            android.content.Context r3 = r4.getApplicationContext()
            java.lang.Object r2 = X.DbZ.A0e(r3)
            boolean r1 = r2 instanceof android.content.ClipboardManager
            if (r1 == 0) goto L_0x0f62
            android.content.ClipboardManager r2 = (android.content.ClipboardManager) r2
            if (r2 == 0) goto L_0x0f62
            r1 = 2131969184(0x7f1344a0, float:1.9575284E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r3, r1)
            android.content.ClipData r1 = android.content.ClipData.newPlainText(r1, r5)
            r2.setPrimaryClip(r1)
        L_0x0f62:
            android.os.Handler r5 = X.AnonymousClass7TF.A0D()
            X.Frq r3 = new X.Frq
            r3.<init>(r4)
            r1 = 500(0x1f4, double:2.47E-321)
            r5.postDelayed(r3, r1)
            java.lang.String r1 = "BrandedContentAdUrlHandlerActivity"
            X.0xG r1 = X.DbS.A0O(r1)
            java.lang.String r2 = "xma"
            X.0wc r1 = X.AnonymousClass0kN.A01(r1, r0)
            java.lang.String r0 = "instagram_bc_boost_code_access_token_copy"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            r0 = 527(0x20f, float:7.38E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.DbU.A1N(r1, r0, r2, r6)
            java.lang.String r0 = "sponsor_igid"
            r1.AAJ(r0, r6)
            r1.Cgf()
            goto L_0x014e
        L_0x0f95:
            java.lang.String r1 = "user_id"
            java.lang.String r7 = r6.getQueryParameter(r1)
            java.lang.String r1 = X.Dbe.A01()
            java.lang.String r2 = r6.getQueryParameter(r1)
            if (r7 != 0) goto L_0x0fb5
            if (r2 == 0) goto L_0x0034
            X.0BQ r1 = X.AnonymousClass0BO.A00(r0)
            com.instagram.user.model.User r1 = r1.BNx(r2)
            if (r1 == 0) goto L_0x0034
            java.lang.String r7 = r1.getId()
        L_0x0fb5:
            java.lang.String r1 = "media_id"
            java.lang.String r8 = r6.getQueryParameter(r1)
            if (r8 == 0) goto L_0x0034
            r5 = 0
            java.lang.String[] r1 = new java.lang.String[]{r7}
            java.util.ArrayList r3 = X.0sr.A1L(r1)
            java.lang.String r1 = "open_story_viewer_list"
            boolean r2 = r6.getBooleanQueryParameter(r1, r5)
            X.6Yo r6 = X.DbS.A0M(r4, r0)
            X.6Ye r1 = X.DbS.A0i()
            r1.A09(r3)
            r1.A0A(r3)
            X.DbY.A1R(r1)
            X.3BQ r0 = X.AnonymousClass3BQ.DEEPLINK
            r1.A03(r0)
            r1.A0V = r9
            X.3BN r0 = new X.3BN
            r0.<init>()
            r1.A02 = r0
            r0 = 95
            java.lang.String r0 = X.002.A0T(r8, r7, r0)
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.HashSet r0 = X.0sc.A05(r0)
            java.util.HashMap r0 = X.DbY.A0m(r7, r0)
            X.0qQ.A0B(r0, r5)
            r1.A0T = r0
            r1.A0Z = r2
            android.os.Bundle r0 = r1.A00()
            instagram.features.stories.fragment.ReelViewerFragment r2 = X.C18280Vp0.A01(r0)
            goto L_0x010d
        L_0x100e:
            X.6Yo r6 = X.Dba.A0B(r6, r0)
            X.XQw r0 = X.C21251XQw.MAIN_SETTINGS_SCREEN
            X.JaK r0 = X.Eq6.A00(r0, r4)
            r6.A0B(r4, r0)
            goto L_0x0110
        L_0x101d:
            X.0hq r2 = r4.getSupportFragmentManager()
            X.06Q r1 = r4.A00
            r2.A0s(r1)
            android.net.Uri r1 = X.0cp.A03(r3)
            java.lang.String r3 = r1.getHost()
            if (r3 == 0) goto L_0x0034
            int r2 = r3.hashCode()
            r1 = 375755212(0x166591cc, float:1.8544478E-25)
            if (r2 == r1) goto L_0x1750
            r1 = 1997865356(0x7715018c, float:3.0222016E33)
            if (r2 != r1) goto L_0x0034
            java.lang.String r1 = "security_alerts_feeds"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0034
            X.6Yo r6 = X.DbS.A0M(r4, r0)
            X.LLR.A00()
            X.NIT r2 = new X.NIT
            r2.<init>()
            goto L_0x010d
        L_0x1054:
            java.lang.String r8 = X.DbT.A10(r7)
            java.lang.String r9 = "origin"
            java.lang.String r2 = r7.getQueryParameter(r9)
            if (r2 == 0) goto L_0x11fa
            java.lang.String r6 = X.DbY.A0k(r2)
        L_0x1064:
            java.lang.String r5 = X.DbT.A0v(r7)
            java.lang.String r2 = "product"
            java.lang.String r14 = r7.getQueryParameter(r2)
            java.lang.String r2 = "program"
            java.lang.String r12 = r7.getQueryParameter(r2)
            java.lang.String r2 = "intent"
            r7.getQueryParameter(r2)
            java.lang.String r2 = "deal_template_id"
            java.lang.String r11 = r7.getQueryParameter(r2)
            java.lang.String r2 = "fbid_of_incentive"
            java.lang.String r10 = r7.getQueryParameter(r2)
            r15 = 0
            boolean r2 = X.00l.A0d(r8, r13, r3)
            if (r2 == 0) goto L_0x10a1
            X.F1W r7 = X.FCL.A00()
            com.instagram.api.schemas.IGRevShareProductType r2 = com.instagram.api.schemas.IGRevShareProductType.PROFILE_ADS
            X.EN1 r5 = r7.A00(r2, r6, r5)
        L_0x1096:
            X.6Yo r6 = X.DbU.A0Q(r1, r0)
            r6.A0D = r3
            r6.A0B(r4, r5)
            goto L_0x0110
        L_0x10a1:
            java.lang.String r2 = "reels_overlay_ads_onboarding"
            boolean r2 = X.00l.A0d(r8, r2, r3)
            if (r2 == 0) goto L_0x10b4
            X.F1W r7 = X.FCL.A00()
            com.instagram.api.schemas.IGRevShareProductType r2 = com.instagram.api.schemas.IGRevShareProductType.REELS_OVERLAY_ADS
            X.EN1 r5 = r7.A00(r2, r6, r5)
            goto L_0x1096
        L_0x10b4:
            java.lang.String r2 = "user_pay_onboarding"
            boolean r2 = X.00l.A0d(r8, r2, r3)
            if (r2 == 0) goto L_0x10c9
            X.1Yw r2 = X.C49195Er0.A00()
            X.LEU r2 = r2.A00()
            X.KUY r5 = r2.A00(r6, r5)
            goto L_0x1096
        L_0x10c9:
            java.lang.String r2 = "incentive_platform_management"
            boolean r2 = X.00l.A0d(r8, r2, r3)
            if (r2 == 0) goto L_0x10da
            X.FBk r2 = X.F9Y.A00()
            X.E4f r5 = r2.A03(r0, r6, r5, r12)
            goto L_0x1096
        L_0x10da:
            java.lang.String r2 = "incentive_platform_available_bonus"
            boolean r2 = X.00l.A0d(r8, r2, r3)
            if (r2 == 0) goto L_0x10fe
            X.FBk r2 = X.F9Y.A00()
            if (r11 != 0) goto L_0x10f9
            java.lang.String r5 = X.DbY.A0j(r6)
            java.lang.String r2 = "entry_point"
            java.util.HashMap r5 = X.DbY.A0m(r2, r5)
            java.lang.String r2 = "com.instagram.incentive_platform.screens.deal_information"
            X.3M3 r5 = X.C46649DiU.A02(r0, r2, r5)
            goto L_0x1096
        L_0x10f9:
            X.3M3 r5 = r2.A01(r0, r11, r6)
            goto L_0x1096
        L_0x10fe:
            java.lang.String r2 = "incentive_platform_progress_tracking"
            boolean r2 = X.00l.A0d(r8, r2, r3)
            if (r2 == 0) goto L_0x110f
            X.FBk r2 = X.F9Y.A00()
            X.3M3 r5 = r2.A02(r0, r6, r10)
            goto L_0x1096
        L_0x110f:
            java.lang.String r2 = "incentive_platform_xar_upsell"
            boolean r2 = X.00l.A0d(r8, r2, r3)
            if (r2 == 0) goto L_0x112b
            X.FBk r6 = X.F9Y.A00()
            java.lang.String r2 = "creator_prodash_url_handler"
            X.0xG r8 = X.DbS.A0O(r2)
            java.lang.String r11 = "PRO_HOME"
            r7 = r1
            r9 = r0
            X.K5L r5 = r6.A04(r7, r8, r9, r10, r11)
            goto L_0x1096
        L_0x112b:
            java.lang.String r2 = "product_eligibility"
            boolean r2 = X.00l.A0d(r8, r2, r3)
            if (r2 == 0) goto L_0x1141
            com.instagram.monetization.impl.MonetizationFragmentFactoryImpl r5 = X.F6R.A00()
            com.instagram.api.schemas.UserMonetizationProductType r2 = X.C272504kq.A00(r14)
            androidx.fragment.app.Fragment r5 = r5.A00(r2, r0, r4, r3)
            goto L_0x1096
        L_0x1141:
            java.lang.String r2 = "subscriptions_management"
            boolean r2 = X.00l.A0d(r8, r2, r3)
            if (r2 == 0) goto L_0x1153
            X.F3X r2 = X.FC8.A00()
            X.EN2 r5 = r2.A02(r6)
            goto L_0x1096
        L_0x1153:
            java.lang.String r2 = "subscriptions_guided_activation_confirmation"
            boolean r2 = X.00l.A0d(r8, r2, r3)
            if (r2 == 0) goto L_0x116f
            X.FC8.A00()
            X.E42 r5 = new X.E42
            r5.<init>()
            android.os.Bundle r2 = X.DbY.A0B(r9, r6)
            X.C227642jf.A04(r2, r0)
            r5.setArguments(r2)
            goto L_0x1096
        L_0x116f:
            java.lang.String r2 = "fan_club/subscribed_tab"
            boolean r2 = X.00l.A0d(r8, r2, r3)
            if (r2 == 0) goto L_0x1193
            com.instagram.user.model.User r8 = X.AnonymousClass7TF.A0Q(r0)
            X.1YF r6 = X.C46339Dch.A01()
            X.Df5 r5 = X.C46443Df5.SUBSCRIBED
            java.lang.String r2 = r8.getId()
            com.instagram.user.recommended.FollowListData r9 = X.C46451DfE.A00(r5, r2, r4, r3)
            r12 = 1
            r7 = r0
            r10 = r4
            r11 = r4
            com.instagram.user.userlist.fragment.UnifiedFollowFragment r5 = r6.CrR(r7, r8, r9, r10, r11, r12)
            goto L_0x1096
        L_0x1193:
            java.lang.String r2 = "creator_tools_value_props"
            boolean r2 = X.00l.A0d(r8, r2, r3)
            if (r2 == 0) goto L_0x11ad
            java.lang.String r2 = "flow_type"
            java.lang.String r2 = r7.getQueryParameter(r2)
            java.lang.String r5 = java.lang.String.valueOf(r2)
            java.lang.String r2 = "pro_home"
            X.E2L r5 = X.F5N.A00(r5, r2)
            goto L_0x1096
        L_0x11ad:
            java.lang.String r2 = "content_appreciation_management"
            boolean r2 = X.00l.A0d(r8, r2, r3)
            if (r2 == 0) goto L_0x11d9
            java.lang.String r2 = "start_onboarding"
            java.lang.String r2 = r7.getQueryParameter(r2)
            if (r2 == 0) goto L_0x11c7
            java.lang.Boolean r2 = X.00l.A0A(r2)
            if (r2 == 0) goto L_0x11c7
            boolean r15 = r2.booleanValue()
        L_0x11c7:
            X.1Z0 r2 = X.AnonymousClass2BF.A00()
            X.LBX r10 = r2.A02()
            r11 = r0
            r12 = r6
            r13 = r5
            r14 = r4
            X.KUZ r5 = r10.A00(r11, r12, r13, r14, r15)
            goto L_0x1096
        L_0x11d9:
            java.lang.String r2 = "subscriptions_customized_benefits_selection"
            boolean r2 = X.00l.A0d(r8, r2, r3)
            if (r2 == 0) goto L_0x00dc
            X.FC8.A02()
            r2 = 864(0x360, float:1.211E-42)
            java.lang.String r5 = X.AnonymousClass000.A00(r2)
            java.lang.String r2 = "subscription_details"
            android.os.Bundle r2 = X.DbY.A0B(r5, r2)
            X.E7R r5 = new X.E7R
            r5.<init>()
            r5.setArguments(r2)
            goto L_0x1096
        L_0x11fa:
            java.lang.String r2 = X.DbT.A10(r7)
            boolean r2 = X.00l.A0d(r2, r13, r3)
            if (r2 == 0) goto L_0x1208
            java.lang.String r6 = "EMAIL"
            goto L_0x1064
        L_0x1208:
            java.lang.String r6 = "PRO_HOME"
            goto L_0x1064
        L_0x120c:
            java.lang.String r2 = "destination"
            java.lang.String r6 = r3.getQueryParameter(r2)
            java.lang.String r11 = "entry_point"
            java.lang.String r4 = r3.getQueryParameter(r11)
            java.lang.String r10 = ""
            if (r4 != 0) goto L_0x121d
            r4 = r10
        L_0x121d:
            r2 = 1243(0x4db, float:1.742E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            java.lang.String r9 = r3.getQueryParameter(r2)
            if (r9 != 0) goto L_0x122a
            r9 = r10
        L_0x122a:
            java.lang.String r2 = "creator_id"
            java.lang.String r8 = r3.getQueryParameter(r2)
            if (r8 != 0) goto L_0x1233
            r8 = r10
        L_0x1233:
            java.lang.String r2 = "media_id"
            java.lang.String r2 = r3.getQueryParameter(r2)
            if (r2 == 0) goto L_0x123c
            r10 = r2
        L_0x123c:
            if (r6 == 0) goto L_0x00dc
            int r2 = r6.hashCode()
            java.lang.String r3 = "entrypoint"
            switch(r2) {
                case -1711915649: goto L_0x1248;
                case -1081434779: goto L_0x1263;
                case -335082989: goto L_0x1266;
                case -92572578: goto L_0x17a0;
                case 21116443: goto L_0x127e;
                case 100344454: goto L_0x17b3;
                case 595233003: goto L_0x160e;
                case 1766549027: goto L_0x17ee;
                default: goto L_0x1247;
            }
        L_0x1247:
            return
        L_0x1248:
            java.lang.String r2 = "approve_content_creators"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x0034
            X.6Yo r6 = X.DbS.A0M(r1, r0)
            r6.A0D = r5
            X.C49892FBu.A02()
            X.K8c r1 = new X.K8c
            r1.<init>()
            android.os.Bundle r0 = X.DbY.A0B(r11, r4)
            goto L_0x129c
        L_0x1263:
            java.lang.String r2 = "manage"
            goto L_0x1284
        L_0x1266:
            java.lang.String r2 = "branded_content_approve_media"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x0034
            X.6Yo r6 = X.DbS.A0M(r1, r0)
            r6.A0D = r5
            X.C49892FBu.A02()
            java.lang.String r0 = "deep_link"
            X.E4q r1 = X.LSU.A02(r9, r8, r10, r0)
            goto L_0x129f
        L_0x127e:
            r2 = 96
            java.lang.String r2 = X.Pxd.A00(r2)
        L_0x1284:
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x0034
            X.6Yo r6 = X.DbU.A0Q(r1, r0)
            r6.A0D = r5
            X.C49892FBu.A02()
            X.E47 r1 = new X.E47
            r1.<init>()
            android.os.Bundle r0 = X.AnonymousClass7TE.A0a()
        L_0x129c:
            r1.setArguments(r0)
        L_0x129f:
            r6.A0B(r7, r1)
            goto L_0x0110
        L_0x12a4:
            java.lang.String r2 = X.AnonymousClass7TF.A0b()
            X.0qQ.A07(r2)
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r5 = com.instagram.modal.TransparentModalActivity.class
            android.os.Bundle r4 = X.AnonymousClass7TE.A0a()
            java.lang.String r3 = "bottom_sheet_content_fragment"
            r2 = 1397(0x575, float:1.958E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r4.putString(r3, r2)
            r2 = 14
            java.lang.String r2 = X.C66579MXk.A00(r2)
            r4.putBoolean(r2, r9)
            java.lang.String r2 = "hall_pass_id"
            r4.putString(r2, r8)
            java.lang.String r2 = "hall_pass_name"
            r4.putString(r2, r7)
            java.lang.String r2 = "media_id"
            r4.putString(r2, r6)
            java.lang.String r2 = "media_owner_id"
            r4.putString(r2, r6)
            java.lang.String r2 = "view_session_id"
            r4.putString(r2, r6)
            X.DbS.A1B(r4, r6)
            java.lang.String r2 = "bottom_sheet"
            X.DbU.A0w(r1, r4, r0, r5, r2)
            goto L_0x00dc
        L_0x12e8:
            android.net.Uri r2 = X.DbT.A09(r2)     // Catch:{ SecurityException -> 0x13a6 }
            java.lang.String r0 = "user_id"
            java.lang.String r6 = r2.getQueryParameter(r0)     // Catch:{ SecurityException -> 0x13a6 }
            if (r6 != 0) goto L_0x12f6
            java.lang.String r6 = ""
        L_0x12f6:
            int r0 = r6.length()     // Catch:{ SecurityException -> 0x13a6 }
            if (r0 != 0) goto L_0x1303
            java.lang.String r0 = "Invalid or missing user_id param"
        L_0x12fe:
            X.0KC.A0C(r4, r0)     // Catch:{ SecurityException -> 0x13a6 }
            goto L_0x00dc
        L_0x1303:
            X.0wW r0 = r1.A00     // Catch:{ SecurityException -> 0x13a6 }
            X.0Tu r7 = X.0Tu.A05     // Catch:{ SecurityException -> 0x13a6 }
            r2 = 36599757086396018(0x82074900000e72, double:3.209171984604901E-306)
            java.lang.Long r0 = X.AnonymousClass7TF.A0Y(r7, r0, r2)     // Catch:{ SecurityException -> 0x13a6 }
            r2 = -1
            if (r0 == 0) goto L_0x1329
            long r8 = r0.longValue()     // Catch:{ SecurityException -> 0x13a6 }
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x00dc
            r2 = 0
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x1389
            r2 = 1
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x1329
            goto L_0x1330
        L_0x1329:
            r0 = 967(0x3c7, float:1.355E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ SecurityException -> 0x13a6 }
            goto L_0x12fe
        L_0x1330:
            android.content.pm.PackageManager r0 = r1.getPackageManager()     // Catch:{ SecurityException -> 0x13a6 }
            java.lang.String r5 = "com.facebook.wakizashi"
            android.content.Intent r0 = r0.getLaunchIntentForPackage(r5)     // Catch:{ SecurityException -> 0x13a6 }
            if (r0 != 0) goto L_0x1348
            android.content.pm.PackageManager r2 = r1.getPackageManager()     // Catch:{ SecurityException -> 0x13a6 }
            java.lang.String r0 = "com.facebook.katana"
            android.content.Intent r0 = r2.getLaunchIntentForPackage(r0)     // Catch:{ SecurityException -> 0x13a6 }
            if (r0 == 0) goto L_0x1389
        L_0x1348:
            X.0wW r0 = r1.A00     // Catch:{ SecurityException -> 0x13a6 }
            r2 = 36881232063168887(0x83074900010177, double:3.387177893324821E-306)
            java.lang.String r3 = X.182.A04(r7, r0, r2)     // Catch:{ SecurityException -> 0x13a6 }
            java.lang.String r2 = X.C10065Rm2.A01     // Catch:{ SecurityException -> 0x13a6 }
            java.lang.String r0 = "profile/%s?mibextid=%s"
            java.lang.String r0 = X.002.A0R(r2, r0)     // Catch:{ SecurityException -> 0x13a6 }
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r6, r3)     // Catch:{ SecurityException -> 0x13a6 }
            X.0qQ.A07(r0)     // Catch:{ SecurityException -> 0x13a6 }
            android.net.Uri r3 = X.DbT.A09(r0)     // Catch:{ SecurityException -> 0x13a6 }
            android.content.pm.PackageManager r0 = r1.getPackageManager()     // Catch:{ SecurityException -> 0x13a6 }
            android.content.Intent r0 = r0.getLaunchIntentForPackage(r5)     // Catch:{ SecurityException -> 0x13a6 }
            if (r0 != 0) goto L_0x1372
            java.lang.String r5 = "com.facebook.katana"
        L_0x1372:
            java.lang.String r2 = "android.intent.action.VIEW"
            android.content.Intent r0 = new android.content.Intent     // Catch:{ SecurityException -> 0x13a6 }
            r0.<init>(r2)     // Catch:{ SecurityException -> 0x13a6 }
            android.content.Intent r0 = r0.setData(r3)     // Catch:{ SecurityException -> 0x13a6 }
            android.content.Intent r0 = r0.setPackage(r5)     // Catch:{ SecurityException -> 0x13a6 }
            X.0qQ.A07(r0)     // Catch:{ SecurityException -> 0x13a6 }
            X.0kR.A0A(r1, r0)     // Catch:{ SecurityException -> 0x13a6 }
            goto L_0x00dc
        L_0x1389:
            X.0wW r0 = r1.A00     // Catch:{ SecurityException -> 0x13a6 }
            r2 = 36881232063168887(0x83074900010177, double:3.387177893324821E-306)
            java.lang.String r2 = X.182.A04(r7, r0, r2)     // Catch:{ SecurityException -> 0x13a6 }
            java.lang.String r0 = "https://m.facebook.com/profile.php?id=%s&mibextid=%s"
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r6, r2)     // Catch:{ SecurityException -> 0x13a6 }
            X.0qQ.A07(r0)     // Catch:{ SecurityException -> 0x13a6 }
            android.net.Uri r0 = X.DbT.A09(r0)     // Catch:{ SecurityException -> 0x13a6 }
            X.0kR.A0F(r1, r0)     // Catch:{ SecurityException -> 0x13a6 }
            goto L_0x00dc
        L_0x13a6:
            r2 = move-exception
            java.lang.String r0 = "Error parsing url"
            X.0KC.A0F(r4, r0, r2)     // Catch:{ all -> 0x1923 }
            goto L_0x00dc
        L_0x13ae:
            X.FEh r2 = X.C49909FEh.A00
            r0 = 0
            r2.A01(r1, r0)
            goto L_0x00dc
        L_0x13b6:
            if (r3 != 0) goto L_0x13ba
            r20 = r28
        L_0x13ba:
            java.lang.String r3 = "entry_point"
            java.lang.String r19 = r9.getQueryParameter(r3)
            java.lang.String r24 = "ig_messaging_as_bottom_sheet"
            r2 = r24
            java.lang.String r14 = r9.getQueryParameter(r2)
            java.lang.String r2 = "1"
            boolean r18 = X.0qQ.A0K(r14, r2)
            java.lang.String r2 = "direct-thread"
            boolean r2 = r13.equalsIgnoreCase(r2)
            r17 = 0
            if (r2 == 0) goto L_0x13dc
            r16 = 1
            if (r8 != 0) goto L_0x13e0
        L_0x13dc:
            r16 = 0
            if (r2 == 0) goto L_0x13e4
        L_0x13e0:
            if (r23 == 0) goto L_0x13e4
            r17 = 1
        L_0x13e4:
            java.lang.String r15 = "direct-inbox"
            boolean r2 = r13.equalsIgnoreCase(r15)
            android.os.Bundle r14 = X.AnonymousClass7TE.A0a()
            if (r2 == 0) goto L_0x1436
            r14.putString(r12, r8)
        L_0x13f3:
            java.lang.String r2 = r9.getHost()
            boolean r2 = r15.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x1475
            android.content.Intent r2 = X.DbX.A08(r1)
            android.content.Intent r5 = r2.setData(r9)
            X.0qQ.A07(r5)
            java.lang.String r2 = "com.instagram.url.extra.IS_ALREADY_HANDLED"
            r5.putExtra(r2, r10)
            java.lang.String r3 = r14.getString(r12)
            if (r3 == 0) goto L_0x1470
            r2 = r29
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x1470
            X.0BQ r4 = X.AnonymousClass0BO.A00(r0)
            com.instagram.user.model.User r3 = r4.BNw(r3)
            if (r3 == 0) goto L_0x1470
            boolean r2 = r4.AG1(r1, r0, r3)
            if (r2 == 0) goto L_0x1470
            java.lang.String r11 = "deep_link"
            r6 = r4
            r7 = r1
            r8 = r5
            r9 = r0
            r10 = r3
            r6.E2S(r7, r8, r9, r10, r11)
            return
        L_0x1436:
            if (r16 == 0) goto L_0x1463
            r14.putString(r12, r8)
            r2 = r27
            r14.putString(r11, r2)
            X.DbZ.A11(r9, r14, r13)
            r8 = r26
            r2 = r21
            r14.putString(r8, r2)
            r2 = r25
            r14.putString(r2, r4)
            java.lang.String r4 = "ice_breakers"
            r2 = r20
            r14.putStringArrayList(r4, r2)
            r2 = r19
            r14.putString(r3, r2)
            r4 = r24
            r2 = r18
            r14.putBoolean(r4, r2)
            goto L_0x13f3
        L_0x1463:
            if (r17 == 0) goto L_0x00dc
            r2 = r23
            r14.putString(r7, r2)
            r2 = r22
            r14.putString(r6, r2)
            goto L_0x13f3
        L_0x1470:
            X.0kR.A0B(r1, r5)
            goto L_0x00dc
        L_0x1475:
            r5.putAll(r14)
            X.0BQ r8 = X.AnonymousClass0BO.A00(r0)
            java.lang.String r12 = r5.getString(r12)
            java.lang.String r11 = r5.getString(r11)
            r2 = 33
            java.lang.String r2 = X.Pxd.A00(r2)
            android.os.Parcelable r2 = r5.getParcelable(r2)
            android.content.Intent r2 = (android.content.Intent) r2
            if (r2 == 0) goto L_0x15a1
            android.os.Bundle r4 = r2.getExtras()
            if (r4 == 0) goto L_0x15a1
            java.lang.String r2 = "source_application"
            java.lang.String r23 = r4.getString(r2)
        L_0x149e:
            java.lang.String r22 = r5.getString(r7)
            java.lang.String r21 = r5.getString(r6)
            java.lang.String r3 = r5.getString(r3)
            if (r3 == 0) goto L_0x14b6
            java.lang.String r2 = "click_to_direct"
            boolean r2 = r3.equals(r2)
            r20 = 1
            if (r2 == r10) goto L_0x14b8
        L_0x14b6:
            r20 = 0
        L_0x14b8:
            r2 = r26
            java.lang.String r13 = r5.getString(r2)
            r2 = r25
            java.lang.String r7 = r5.getString(r2)
            java.lang.String r2 = "ice_breakers"
            java.util.ArrayList r6 = r5.getStringArrayList(r2)
            java.lang.String r2 = "encrypted_fbconsumer_token"
            java.lang.String r4 = r9.getQueryParameter(r2)
            r19 = 0
            java.io.Serializable[] r2 = new java.io.Serializable[]{r13, r7, r6, r4}
            java.util.List r3 = X.0sr.A1P(r2)
            boolean r2 = r3 instanceof java.util.Collection
            if (r2 == 0) goto L_0x1590
            boolean r2 = r3.isEmpty()
            if (r2 == 0) goto L_0x1590
        L_0x14e4:
            r19 = 1
        L_0x14e6:
            X.0Tu r14 = X.0Tu.A05
            r2 = 36325188417106609(0x810d91000032b1, double:3.035533652546989E-306)
            boolean r18 = X.182.A06(r14, r0, r2)
            r2 = r29
            boolean r2 = X.0qQ.A0K(r11, r2)
            java.lang.String r14 = ""
            if (r2 == 0) goto L_0x152a
            X.0Tu r17 = X.0Tu.A06
            r15 = 36329779737149767(0x8111be00004147, double:3.038437221830044E-306)
            r2 = r15
            r15 = r17
            boolean r2 = X.182.A06(r15, r0, r2)
            if (r2 == 0) goto L_0x152a
            X.0iw r3 = com.instagram.urlhandlers.direct.DirectUrlHandlerActivity.A00
            java.lang.String r2 = "ig_ai_business_agent"
            X.1pE r2 = X.1pE.A01(r1, r3, r0, r2)
            com.instagram.common.typedurl.ImageUrl r0 = com.instagram.pendingmedia.model.recipients.PendingRecipient.A0g
            com.instagram.user.model.User r0 = new com.instagram.user.model.User
            r0.<init>(r12, r14)
            X.Dbc.A0x(r2, r0)
            r0 = r24
            boolean r0 = r5.getBoolean(r0)
            r2.A0s = r0
        L_0x1525:
            r2.A06()
            goto L_0x00dc
        L_0x152a:
            if (r20 != 0) goto L_0x156b
            if (r19 != 0) goto L_0x156b
            r2 = r29
            boolean r2 = X.0qQ.A0K(r11, r2)
            if (r2 == 0) goto L_0x1553
            java.lang.String r3 = "com.instagram.barcelona"
            r2 = r23
            boolean r2 = X.0qQ.A0K(r2, r3)
            if (r2 == 0) goto L_0x1553
            X.0iw r3 = com.instagram.urlhandlers.direct.DirectUrlHandlerActivity.A00
            java.lang.String r2 = "threads_app_message"
            X.1pE r2 = X.1pE.A01(r1, r3, r0, r2)
            com.instagram.common.typedurl.ImageUrl r0 = com.instagram.pendingmedia.model.recipients.PendingRecipient.A0g
            com.instagram.user.model.User r0 = new com.instagram.user.model.User
            r0.<init>(r12, r14)
            X.Dbc.A0x(r2, r0)
            goto L_0x1525
        L_0x1553:
            if (r22 == 0) goto L_0x15a5
            X.0iw r3 = com.instagram.urlhandlers.direct.DirectUrlHandlerActivity.A00
            r2 = 56
            java.lang.String r2 = X.C66579MXk.A00(r2)
            X.1pE r2 = X.1pE.A01(r1, r3, r0, r2)
            r0 = r22
            X.DbZ.A1Z(r2, r0)
            r0 = r21
            r2.A0e = r0
            goto L_0x1525
        L_0x156b:
            X.0iw r3 = com.instagram.urlhandlers.direct.DirectUrlHandlerActivity.A00
            java.lang.String r2 = "fbapp_direct_link"
            X.1pE r2 = X.1pE.A01(r1, r3, r0, r2)
            com.instagram.common.typedurl.ImageUrl r3 = com.instagram.pendingmedia.model.recipients.PendingRecipient.A0g
            com.instagram.user.model.User r3 = new com.instagram.user.model.User
            r3.<init>(r12, r14)
            X.Dbc.A0x(r2, r3)
            if (r20 != 0) goto L_0x158d
            if (r18 == 0) goto L_0x1525
            r3 = 11
        L_0x1583:
            X.C48902Em2.A00(r0, r13, r4, r3)
            r2.A0L = r7
            r2.A0k = r6
            r2.A0t = r10
            goto L_0x1525
        L_0x158d:
            r3 = 10
            goto L_0x1583
        L_0x1590:
            java.util.Iterator r3 = r3.iterator()
        L_0x1594:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x14e4
            java.lang.Object r2 = r3.next()
            if (r2 == 0) goto L_0x14e6
            goto L_0x1594
        L_0x15a1:
            r23 = 0
            goto L_0x149e
        L_0x15a5:
            r3 = r8
            X.0tB r3 = (X.0tB) r3
            r2 = r28
            java.util.List r2 = r3.BNy(r2)
            boolean r2 = X.00k.A0u(r2, r11)
            if (r2 == 0) goto L_0x15ff
            com.instagram.user.model.User r3 = r8.BNw(r11)
            if (r3 == 0) goto L_0x0034
            boolean r2 = r8.AG1(r1, r0, r3)
            if (r2 == 0) goto L_0x0034
            r2 = r26
            java.lang.String r2 = r5.getString(r2)
            java.lang.String r4 = "DirectUrlHandler"
            if (r18 == 0) goto L_0x15e8
            if (r2 == 0) goto L_0x15e8
            X.14B r2 = X.AnonymousClass14B.A00()
            android.content.Intent r2 = r2.A01(r1)
            X.OP0.A01(r1, r2, r9, r11, r4)
        L_0x15d7:
            X.0qQ.A07(r2)
            android.content.Intent r6 = r1.getIntent()
            java.lang.String r9 = "deep_link"
            r4 = r8
            r5 = r1
            r7 = r0
            r8 = r3
            r4.E2S(r5, r6, r7, r8, r9)
            return
        L_0x15e8:
            com.instagram.common.typedurl.ImageUrl r2 = com.instagram.pendingmedia.model.recipients.PendingRecipient.A0g
            com.instagram.user.model.User r2 = new com.instagram.user.model.User
            r2.<init>(r12, r14)
            java.util.List r15 = X.DbW.A0n(r2)
            r9 = r1
            r10 = r11
            r11 = r28
            r12 = r11
            r13 = r4
            r14 = r11
            android.content.Intent r2 = X.F5W.A01(r9, r10, r11, r12, r13, r14, r15)
            goto L_0x15d7
        L_0x15ff:
            boolean r2 = X.FFT.A02(r0)
            if (r2 == 0) goto L_0x167a
            java.lang.String r2 = "IS_ADD_ACCOUNT_FLOW"
            r5.putBoolean(r2, r10)
            X.FFQ.A01(r1, r5, r0)
            return
        L_0x160e:
            java.lang.String r2 = "notification"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x0034
            android.os.Bundle r4 = X.DbV.A0A(r0)
            X.2ZQ r3 = X.C71172bH.A00()
            boolean r2 = r3 instanceof androidx.fragment.app.FragmentActivity
            if (r2 == 0) goto L_0x00dc
            androidx.fragment.app.FragmentActivity r3 = (androidx.fragment.app.FragmentActivity) r3
            if (r3 == 0) goto L_0x00dc
            X.0hq r2 = r3.getSupportFragmentManager()
            boolean r2 = r2.A12()
            if (r2 != 0) goto L_0x00dc
            X.C49892FBu.A02()
            X.H1y r2 = new X.H1y
            r2.<init>()
            r2.setArguments(r4)
            X.Dbb.A0o(r7, r2, r3, r0)
            goto L_0x00dc
        L_0x1640:
            X.0BQ r6 = X.AnonymousClass0BO.A00(r0)
            r2 = r6
            X.0tB r2 = (X.0tB) r2
            java.util.List r2 = r2.BNy(r4)
            boolean r2 = X.00k.A0u(r2, r3)
            if (r2 == 0) goto L_0x166b
            com.instagram.user.model.User r4 = r6.BNw(r3)
            if (r4 == 0) goto L_0x0034
            boolean r2 = r6.AG1(r1, r0, r4)
            if (r2 == 0) goto L_0x0034
            java.lang.String r3 = X.DbS.A0m(r5)
            if (r3 == 0) goto L_0x0034
            int r2 = r3.length()
            if (r2 == 0) goto L_0x0034
            goto L_0x1a4d
        L_0x166b:
            boolean r2 = X.FFT.A02(r0)
            if (r2 == 0) goto L_0x167a
            java.lang.String r2 = "IS_ADD_ACCOUNT_FLOW"
            r5.putBoolean(r2, r7)
            X.FFQ.A01(r1, r5, r0)
            return
        L_0x167a:
            r0 = 2131965890(0x7f1337c2, float:1.9568603E38)
            X.C59689JTv.A07(r1, r0)
            goto L_0x00dc
        L_0x1682:
            boolean r2 = r1 instanceof com.instagram.creator.agent.settings.deeplink.EnableAutoReplyNuxUrlHandlerActivity
            if (r2 == 0) goto L_0x16b8
            X.AnonymousClass7TG.A1O(r0, r5)
            java.lang.String r3 = "original_url"
            java.lang.String r2 = r5.getString(r3)
            X.C320236s2.A03(r5, r2, r3)
            android.net.Uri r3 = X.DbT.A09(r2)
            java.lang.String r2 = "params"
            java.lang.String r3 = r3.getQueryParameter(r2)
            r6 = 0
            if (r3 == 0) goto L_0x16a9
            X.0c5 r2 = X.0c9.A04     // Catch:{ IOException -> 0x16a9 }
            X.0c9 r2 = r2.A01(r0, r3)     // Catch:{ IOException -> 0x16a9 }
            java.util.HashMap r6 = X.F5I.A00(r2)     // Catch:{ IOException -> 0x16a9 }
        L_0x16a9:
            X.FU3 r2 = new X.FU3
            r2.<init>()
            java.lang.String r4 = "com.bloks.www.creators_genai.turn_on_auto_replies_nux.action"
            java.lang.String r5 = "EnableAutoReplyNuxUrlHandlerActivity"
            r3 = r0
            X.FHB.A0D(r1, r2, r3, r4, r5, r6)
            goto L_0x00dc
        L_0x16b8:
            boolean r2 = r1 instanceof com.instagram.creator.agent.disclosure.inthread.deeplink.CreatorAIFanNuxLearnMoreDeeplinkActivity
            if (r2 == 0) goto L_0x16d5
            r2 = 1
            X.0qQ.A0B(r0, r2)
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r4 = com.instagram.modal.TransparentModalActivity.class
            java.lang.String r3 = "bottom_sheet_content_fragment"
            r2 = 1241(0x4d9, float:1.739E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            android.os.Bundle r3 = X.DbY.A0B(r3, r2)
            java.lang.String r2 = "bottom_sheet"
            X.DbU.A0w(r1, r3, r0, r4, r2)
            goto L_0x00dc
        L_0x16d5:
            boolean r2 = r1 instanceof com.instagram.creator.agent.disclosure.inthread.deeplink.CreatorAIFanNuxDeeplinkActivity
            if (r2 == 0) goto L_0x172b
            X.AnonymousClass7TG.A1O(r0, r5)
            java.lang.String r2 = "original_url"
            java.lang.String r4 = r5.getString(r2)
            X.C320236s2.A03(r5, r4, r2)
            android.net.Uri r3 = X.0cp.A03(r4)
            java.lang.String r2 = "creator_id"
            java.lang.String r3 = r3.getQueryParameter(r2)
            android.net.Uri r2 = X.0cp.A03(r4)
            java.lang.String r4 = X.DbZ.A0h(r2)
            if (r4 != 0) goto L_0x16fb
            java.lang.String r4 = "unknown"
        L_0x16fb:
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r6 = com.instagram.modal.TransparentModalActivity.class
            r2 = 136(0x88, float:1.9E-43)
            java.lang.String r2 = X.C273654mx.A00(r2)
            X.0eP r5 = X.AnonymousClass7TE.A1L(r2, r3)
            r3 = 0
            r2 = 42
            java.lang.String r2 = X.C273654mx.A00(r2)
            X.0eP r4 = X.AnonymousClass7TE.A1L(r2, r4)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r2 = 1240(0x4d8, float:1.738E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            android.os.Bundle r3 = X.DbY.A0C(r2, r3, r5, r4)
            r2 = 641(0x281, float:8.98E-43)
            java.lang.String r2 = X.C273654mx.A00(r2)
            X.DbU.A0w(r1, r3, r0, r6, r2)
            goto L_0x00dc
        L_0x172b:
            X.AnonymousClass7TG.A1O(r0, r5)
            java.lang.String r2 = X.DbS.A0m(r5)
            if (r2 == 0) goto L_0x00dc
            r5 = 0
            android.net.Uri r4 = X.DbT.A09(r2)
            java.lang.String r3 = X.DbZ.A0h(r4)
            if (r3 != 0) goto L_0x1741
            java.lang.String r3 = "deeplink"
        L_0x1741:
            r2 = 607(0x25f, float:8.5E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            java.lang.String r2 = r4.getQueryParameter(r2)
            X.C49951FGg.A00(r1, r5, r0, r3, r2)
            goto L_0x00dc
        L_0x1750:
            java.lang.String r1 = "security_alerts_settings"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0034
            java.lang.String r1 = ""
            X.C250563lf.A0d(r4, r0, r1)
            return
        L_0x175e:
            java.lang.String r1 = "open_access_profile_review_status"
            boolean r1 = X.00l.A0d(r7, r1, r8)
            if (r1 == 0) goto L_0x0034
            java.lang.String r1 = "open_access_monetization_status_handler"
            X.0xG r3 = X.DbS.A0O(r1)
            java.lang.String r1 = "com.instagram.creator_monetization.open_access.utils.open_access_monetization_status_handler"
            X.8ey r2 = X.C359988do.A02(r4, r0, r1, r2)
            r1 = 14
            X.E85.A00(r2, r3, r6, r0, r1)
            X.1ES.A03(r2)
            return
        L_0x177b:
            java.lang.String r1 = "bca_settings"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x0034
            r1 = 0
            X.C49950FGf.A07(r4, r0, r2, r3, r1)
            return
        L_0x1788:
            java.lang.String r1 = "approve_posts_for_ads"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x0034
            X.C49950FGf.A06(r4, r0, r2, r3)
            return
        L_0x1794:
            java.lang.String r1 = "bca_permission_request"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x0034
            X.C49950FGf.A04(r4, r0, r2, r5, r3)
            return
        L_0x17a0:
            java.lang.String r2 = "partnerships_creator_onboarding"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x0034
            java.util.Map r6 = X.AnonymousClass7TF.A0w(r3, r4)
            r2 = 620(0x26c, float:8.69E-43)
            java.lang.String r5 = X.C273654mx.A00(r2)
            goto L_0x17fc
        L_0x17b3:
            java.lang.String r2 = "inbox"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x0034
            boolean r2 = X.AnonymousClass430.A01(r0)
            if (r2 == 0) goto L_0x0034
            boolean r2 = X.JYR.A01(r0)
            if (r2 != 0) goto L_0x17cd
            boolean r2 = X.JYR.A00(r0)
            if (r2 == 0) goto L_0x0034
        L_0x17cd:
            r2 = 431(0x1af, float:6.04E-43)
            java.lang.String r3 = X.AnonymousClass000.A00(r2)
            java.lang.String r2 = "branded_content"
            android.os.Bundle r4 = X.DbY.A0B(r3, r2)
            java.lang.Class<com.instagram.modal.ModalActivity> r3 = com.instagram.modal.ModalActivity.class
            r2 = 124(0x7c, float:1.74E-43)
            java.lang.String r2 = X.C273654mx.A00(r2)
            X.6W8 r0 = X.DbW.A0W(r1, r4, r0, r3, r2)
            r0.A08()
            r0.A07 = r5
            r0.A0C(r1)
            return
        L_0x17ee:
            java.lang.String r2 = "partnerships_brand_onboarding"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x0034
            java.util.Map r6 = X.AnonymousClass7TF.A0w(r3, r4)
            java.lang.String r5 = "com.instagram.branded_content.onboarding.brand.brand_onboarding_handler"
        L_0x17fc:
            X.0hq r4 = X.DbT.A0F(r1)
            r3 = 3
            X.FQk r2 = new X.FQk
            r2.<init>(r3, r1, r4)
            r4.A0s(r2)
            X.8ey r4 = X.C359988do.A02(r7, r0, r5, r6)
            r3 = 13
            X.E85 r2 = new X.E85
            r2.<init>(r3, r1, r0, r1)
            r4.A00(r2)
            X.1ES.A03(r4)
            return
        L_0x181b:
            java.lang.String r2 = X.AnonymousClass7TF.A0k(r3)     // Catch:{ IllegalArgumentException -> 0x1b45 }
            X.XQw r3 = X.C21251XQw.valueOf(r2)     // Catch:{ IllegalArgumentException -> 0x1b45 }
            X.6Yo r2 = X.DbS.A0M(r1, r0)     // Catch:{ IllegalArgumentException -> 0x1b45 }
            X.JaK r0 = X.Eq6.A00(r3, r4)     // Catch:{ IllegalArgumentException -> 0x1b45 }
            r2.A0D(r0)     // Catch:{ IllegalArgumentException -> 0x1b45 }
            X.DbV.A1O(r2)     // Catch:{ IllegalArgumentException -> 0x1b45 }
            return
        L_0x1832:
            X.ESE r1 = new X.ESE
            r1.<init>()
            X.Dbb.A13(r1, r3, r0)
            return
        L_0x183b:
            r1 = 10
            int r1 = X.0Yv.A1E(r5, r1)
            int r1 = X.AnonymousClass7TG.A01(r1)
            java.util.LinkedHashMap r7 = X.DbS.A0x(r1)
            java.util.Iterator r5 = r5.iterator()
        L_0x184d:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x1876
            java.lang.String r3 = X.AnonymousClass7TE.A18(r5)
            X.0qQ.A0A(r3)
            java.lang.String r1 = "["
            java.lang.String r2 = X.00l.A0K(r3, r1, r3)
            java.lang.String r1 = "]"
            java.lang.String r2 = X.00l.A0L(r2, r1, r2)
            java.lang.String r1 = r11.getQueryParameter(r3)
            if (r1 != 0) goto L_0x186e
            java.lang.String r1 = ""
        L_0x186e:
            r7.put(r2, r1)
            goto L_0x184d
        L_0x1872:
            X.0sm r7 = X.0Yt.A0E()
        L_0x1876:
            r2 = 0
            if (r4 == 0) goto L_0x18ea
            int r1 = r4.length()
            if (r1 == 0) goto L_0x18ea
            if (r8 == 0) goto L_0x18ea
            int r1 = r8.length()
            if (r1 == 0) goto L_0x18ea
            X.0Tu r3 = X.0Tu.A05
            r1 = 2342169262782690971(0x20810e890000369b, double:4.070888376271482E-152)
            boolean r1 = X.182.A06(r3, r0, r1)
            if (r1 == 0) goto L_0x18dd
            org.json.JSONObject r5 = X.DbS.A11()
            org.json.JSONObject r3 = X.DbS.A11()
            r3.put(r10, r4)
            r3.put(r9, r8)
            boolean r1 = r7.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x18b4
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>(r7)
            java.lang.String r1 = "custom_parameters"
            r3.put(r1, r2)
        L_0x18b4:
            java.lang.String r1 = "server_params"
            r5.put(r1, r3)
            java.lang.String r2 = r5.toString()
            java.lang.String r1 = "params"
            X.0eP[] r1 = X.DbW.A1b(r1, r2)
        L_0x18c3:
            java.util.HashMap r2 = X.0Yt.A02(r1)
            X.0gy r3 = X.AnonymousClass07i.A00(r6)
            java.lang.String r1 = "com.bloks.www.pro_to_pro.framework.async.controller.entry"
            X.8ey r2 = X.C359988do.A05(r0, r1, r2)
            X.E7v r1 = new X.E7v
            r1.<init>(r0, r6, r4)
            r2.A00(r1)
            X.1ES.A00(r6, r3, r2)
            return
        L_0x18dd:
            X.0eP r2 = X.AnonymousClass7TE.A1L(r10, r4)
            X.0eP r1 = X.AnonymousClass7TE.A1L(r9, r8)
            X.0eP[] r1 = new X.0eP[]{r2, r1}
            goto L_0x18c3
        L_0x18ea:
            java.lang.String r1 = "invalid_params"
            r0 = 2131969781(0x7f1346f5, float:1.9576495E38)
            X.C59689JTv.A01(r6, r1, r0, r2)
            r6.finish()
            return
        L_0x18f6:
            java.lang.IllegalStateException r0 = X.DbT.A0n()
            throw r0
        L_0x18fb:
            java.lang.IllegalStateException r0 = X.DbT.A0n()
            throw r0
        L_0x1900:
            java.lang.String r9 = "fetch_type"
            java.lang.String r8 = r3.getQueryParameter(r9)     // Catch:{  }
            java.lang.String r7 = "recipe_id"
            java.lang.String r3 = r3.getQueryParameter(r7)     // Catch:{  }
            if (r3 == 0) goto L_0x1913
            java.lang.Integer r6 = X.00y.A0l(r3)     // Catch:{  }
            goto L_0x1914
        L_0x1913:
            r6 = 0
        L_0x1914:
            if (r8 != 0) goto L_0x1aeb
            r1.finish()     // Catch:{  }
            return
        L_0x191a:
            r0 = move-exception
            r4.finish()
            throw r0
        L_0x191f:
            r7.finish()
            return
        L_0x1923:
            r0 = move-exception
            r1.finish()
            throw r0
        L_0x1928:
            X.EQs r1 = new X.EQs
            r1.<init>()
            X.Dbb.A13(r1, r3, r0)
            return
        L_0x1931:
            r18 = 0
            android.net.Uri r2 = X.0cp.A03(r2)     // Catch:{ SecurityException -> 0x19b7 }
            if (r2 == 0) goto L_0x19b7
            java.lang.String r4 = "direct-thread"
            java.lang.String r1 = r2.getHost()
            boolean r1 = r4.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x19b7
            java.lang.String r15 = X.DbT.A0v(r2)
            if (r15 == 0) goto L_0x19b7
            java.lang.String r1 = "is_ai_agent"
            boolean r1 = r2.getBooleanQueryParameter(r1, r5)
            if (r1 == 0) goto L_0x19cc
            X.1ps r1 = X.1ps.A03
            if (r1 == 0) goto L_0x19b7
            X.AnonymousClass9B9.A00()
            java.lang.String r1 = "DirectMessageInternalUrlHandler"
            X.0xG r8 = X.DbS.A0O(r1)
            java.lang.String r1 = "thread_id"
            java.lang.String r9 = r2.getQueryParameter(r1)
            java.lang.String r10 = X.DbZ.A0h(r2)
            java.lang.String r1 = "story_creator_id"
            java.lang.String r11 = r2.getQueryParameter(r1)
            java.lang.String r1 = "persona_id"
            java.lang.String r4 = r2.getQueryParameter(r1)
            X.LTH r2 = new X.LTH
            r2.<init>(r0)
            r1 = 50
            java.lang.String r1 = X.C66579MXk.A00(r1)
            boolean r1 = X.0qQ.A0K(r4, r1)
            if (r1 != 0) goto L_0x19a0
            X.1Ln r2 = X.LTH.A00(r2)
            boolean r1 = X.DbT.A1Y(r2)
            if (r1 == 0) goto L_0x19a0
            java.lang.String r1 = "ai_agent_thread_deeplink_clicked"
            r2.A0l(r1)
            java.lang.Long r1 = X.DbZ.A0d(r4)
            r2.A0j(r1)
            r2.Cgf()
        L_0x19a0:
            if (r9 == 0) goto L_0x19bb
            com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher r6 = new com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher
            r6.<init>(r0)
            X.0Tu r3 = X.0Tu.A06
            r1 = 2342170800381246149(0x20810fef00043ac5, double:4.072192129415448E-152)
            boolean r13 = X.182.A06(r3, r0, r1)
            r12 = 1012(0x3f4, float:1.418E-42)
            r6.A07(r7, r8, r9, r10, r11, r12, r13)
        L_0x19b7:
            r7.finish()
            return
        L_0x19bb:
            com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher r12 = new com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher
            r12.<init>(r0)
            r13 = r7
            r14 = r8
            r16 = r10
            r17 = r11
            r19 = r3
            r12.A08(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x19b7
        L_0x19cc:
            java.lang.String r1 = "is_interop_user"
            boolean r1 = r2.getBooleanQueryParameter(r1, r5)
            if (r1 == 0) goto L_0x1a00
            java.lang.Long r1 = X.AnonymousClass7TE.A10(r15)
            if (r1 == 0) goto L_0x19b7
            long r1 = r1.longValue()
            X.17i r4 = X.17h.A00(r0)
            com.instagram.user.model.User r4 = r4.A00(r1)
            if (r4 != 0) goto L_0x1a11
            X.441 r4 = X.AnonymousClass441.A02
            X.FnE r2 = new X.FnE
            r2.<init>(r3, r0, r7)
            java.util.HashSet r1 = r4.A01
            boolean r1 = r1.add(r15)
            if (r1 == 0) goto L_0x19b7
            X.ECY r1 = new X.ECY
            r1.<init>(r0, r2, r4, r15)
            r4.A01(r1, r0, r15)
            goto L_0x19b7
        L_0x1a00:
            com.instagram.user.model.User r4 = X.DbV.A0j(r0, r15)
            if (r4 != 0) goto L_0x1a11
            X.441 r2 = X.AnonymousClass441.A02
            X.FnE r1 = new X.FnE
            r1.<init>(r6, r0, r7)
            r2.A02(r0, r1, r15)
            goto L_0x19b7
        L_0x1a11:
            java.lang.String r1 = "DirectMessageInternalUrlHandler"
            X.0xG r2 = X.DbS.A0O(r1)
            java.lang.String r1 = "direct_thread"
            X.1pE r0 = X.1pE.A01(r7, r2, r0, r1)
            X.Dbc.A0x(r0, r4)
            r0.A0m = r3
            r0.A06()
            goto L_0x19b7
        L_0x1a26:
            r6.finish()
            return
        L_0x1a2a:
            r4.finish()
            return
        L_0x1a2e:
            java.lang.IllegalStateException r0 = X.DbU.A0i()
            throw r0
        L_0x1a33:
            return
        L_0x1a34:
            boolean r2 = X.FFT.A02(r0)
            if (r2 == 0) goto L_0x1a43
            java.lang.String r2 = "IS_ADD_ACCOUNT_FLOW"
            r5.putBoolean(r2, r4)
            X.FFQ.A01(r1, r5, r0)
            return
        L_0x1a43:
            r0 = 2131965890(0x7f1337c2, float:1.9568603E38)
            X.C59689JTv.A07(r1, r0)
            r1.finish()
            return
        L_0x1a4d:
            android.net.Uri r2 = X.DbT.A09(r3)     // Catch:{ SecurityException -> 0x1a6d }
            android.content.Intent r3 = X.DbX.A08(r1)     // Catch:{ SecurityException -> 0x1a6d }
            r3.setData(r2)     // Catch:{ SecurityException -> 0x1a6d }
            java.lang.String r2 = r1.getPackageName()     // Catch:{ SecurityException -> 0x1a6d }
            r3.setPackage(r2)     // Catch:{ SecurityException -> 0x1a6d }
            java.lang.String r10 = "deep_link"
            r5 = r6
            r6 = r1
            r7 = r3
            r8 = r0
            r9 = r4
            r5.E2S(r6, r7, r8, r9, r10)     // Catch:{ SecurityException -> 0x1a6d }
            r1.finish()     // Catch:{ SecurityException -> 0x1a6d }
            return
        L_0x1a6d:
            X.0wj r2 = X.0wj.A01
            r1 = 817897458(0x30c01ff2, float:1.3978918E-9)
            java.lang.String r0 = "BirthdayVisibilitySettingsUrlHandlerActivity:onCreate: failed to switch account to another logged in user"
            X.DbT.A1Q(r2, r0, r1)
            return
        L_0x1a78:
            java.lang.String r11 = "recipe_id"
            java.lang.String r3 = r6.getQueryParameter(r11)     // Catch:{  }
            if (r3 == 0) goto L_0x1a9f
            java.lang.Long r10 = X.AnonymousClass7TE.A10(r3)     // Catch:{  }
        L_0x1a84:
            java.lang.String r5 = "fetch_type"
            java.lang.String r3 = r6.getQueryParameter(r5)     // Catch:{  }
            java.lang.String r9 = "recipe_release_environment"
            java.lang.String r8 = r6.getQueryParameter(r9)     // Catch:{  }
            java.util.LinkedHashMap r7 = X.AnonymousClass7TE.A1H()     // Catch:{  }
            java.util.BitSet r6 = X.DbS.A0w(r4)     // Catch:{  }
            r7.put(r11, r10)     // Catch:{  }
            r7.put(r5, r3)     // Catch:{  }
            goto L_0x1aa1
        L_0x1a9f:
            r10 = 0
            goto L_0x1a84
        L_0x1aa1:
            if (r10 == 0) goto L_0x1aa4
            r12 = 0
        L_0x1aa4:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r12)     // Catch:{  }
            java.lang.String r3 = "show_all_recipes"
            r7.put(r3, r5)     // Catch:{  }
            r7.put(r9, r8)     // Catch:{  }
            int r3 = r6.nextClearBit(r4)     // Catch:{  }
            if (r3 < r4) goto L_0x1b40
            X.0sm r15 = X.0Yt.A0E()     // Catch:{  }
            java.util.Map r14 = X.0Yt.A0B(r7)     // Catch:{  }
            r17 = 0
            r16 = 719983200(0x2aea1260, float:4.15795E-13)
            java.lang.String r11 = "com.bloks.www.screen_query.ig.BloksMemuForYouCarouselScreenQuery"
            X.ShW r3 = new X.ShW     // Catch:{  }
            r19 = r2
            r10 = r3
            r12 = r13
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r19)     // Catch:{  }
            X.6Qj r5 = X.C48721Ej6.A00(r0, r4)     // Catch:{  }
            java.lang.String r17 = ""
            X.Vbz r12 = new X.Vbz     // Catch:{  }
            r14 = r13
            r15 = r13
            r16 = r13
            r18 = r13
            r19 = r13
            r20 = r4
            r21 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{  }
            X.WF5 r0 = new X.WF5     // Catch:{  }
            r0.<init>(r12, r13, r13, r13)     // Catch:{  }
            goto L_0x1b34
        L_0x1aeb:
            java.util.LinkedHashMap r5 = X.AnonymousClass7TE.A1H()     // Catch:{  }
            java.util.BitSet r3 = X.DbS.A0w(r2)     // Catch:{  }
            r5.put(r9, r8)     // Catch:{  }
            r3.set(r4)     // Catch:{  }
            r5.put(r7, r6)     // Catch:{  }
            int r3 = r3.nextClearBit(r4)     // Catch:{  }
            if (r3 < r2) goto L_0x1b3b
            X.0sm r12 = X.0Yt.A0E()     // Catch:{  }
            java.util.Map r11 = X.0Yt.A0B(r5)     // Catch:{  }
            r14 = 0
            r13 = 719983200(0x2aea1260, float:4.15795E-13)
            java.lang.String r8 = "com.bloks.www.screen_query.BloksIFYIGCarouselScreenQuery"
            X.ShW r3 = new X.ShW     // Catch:{  }
            r7 = r3
            r9 = r10
            r16 = r2
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r16)     // Catch:{  }
            X.6Qj r5 = X.C48721Ej6.A00(r0, r4)     // Catch:{  }
            java.lang.String r14 = ""
            X.Vbz r9 = new X.Vbz     // Catch:{  }
            r11 = r10
            r12 = r10
            r13 = r10
            r15 = r10
            r16 = r10
            r18 = r4
            r17 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{  }
            X.WF5 r0 = new X.WF5     // Catch:{  }
            r0.<init>(r9, r10, r10, r10)     // Catch:{  }
        L_0x1b34:
            X.0qQ.A0B(r5, r2)     // Catch:{  }
            r3.E0s(r1, r0, r5)     // Catch:{  }
            return
        L_0x1b3b:
            java.lang.IllegalStateException r0 = X.DbT.A0n()     // Catch:{  }
            throw r0     // Catch:{  }
        L_0x1b40:
            java.lang.IllegalStateException r0 = X.DbT.A0n()     // Catch:{  }
            throw r0     // Catch:{  }
        L_0x1b45:
            r1.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandler.UserSessionUrlHandlerActivity.A0n(android.os.Bundle, android.os.Bundle, com.instagram.common.session.UserSession):void");
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}
