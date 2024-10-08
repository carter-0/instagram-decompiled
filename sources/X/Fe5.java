package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public final class Fe5 implements C51882G5u {
    public final int A00;
    public final Object A01;

    public Fe5(FHD fhd, int i) {
        this.A00 = i;
        switch (i) {
            case 0:
            case 1:
                this.A01 = fhd;
                return;
            default:
                this.A01 = fhd;
                return;
        }
    }

    public static void A00(FragmentActivity fragmentActivity, Fe5 fe5, UserSession userSession, C309416Ye r19, String str, List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(list);
        UserSession userSession2 = userSession;
        for (Reel reel : 1OP.A05(userSession2).A0U(true)) {
            if (!reel.A16(userSession2) && !reel.A0f()) {
                linkedHashSet.add(reel.getId());
            }
        }
        ArrayList A1D = AnonymousClass7TE.A1D(linkedHashSet);
        FragmentActivity fragmentActivity2 = fragmentActivity;
        C309416Ye r14 = r19;
        if (!new HashSet(Arrays.asList(new String[]{Pxd.A00(231), "subscribed_reel_post", Pxd.A00(273), AnonymousClass000.A00(4053)})).contains(str) || 182.A06(0Tu.A06, userSession2, 36328027391146876L)) {
            C309516Yo A0M = DbS.A0M(fragmentActivity2, userSession2);
            r14.A09(A1D);
            r14.A0A(A1D);
            A0M.A0E(C18280Vp0.A01(r14.A00()));
            A0M.A04();
            return;
        }
        HashSet A1F = AnonymousClass7TE.A1F();
        Iterator it = A1D.iterator();
        while (it.hasNext()) {
            String A18 = AnonymousClass7TE.A18(it);
            if (Dba.A0L(userSession2, A18) == null) {
                A1F.add(A18);
            }
        }
        if (!A1F.isEmpty()) {
            new AnonymousClass3PT(userSession2, AnonymousClass3BU.NOTIFICATION, new C47992EPy(fragmentActivity2, fe5, userSession2, r14, A1D), "AppStartupUtil", (Map) null, A1F).A07(fragmentActivity2, AnonymousClass07i.A00(fragmentActivity2));
            return;
        }
        A01(fragmentActivity2, userSession2, r14, A1D);
    }

    public static void A01(FragmentActivity fragmentActivity, UserSession userSession, C309416Ye r5, List list) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Reel A0L = Dba.A0L(userSession, AnonymousClass7TE.A18(it));
            if (A0L != null) {
                A1C.add(A0L);
            }
        }
        r5.A0V = false;
        r5.A02(userSession, AnonymousClass7TE.A19(list, 0), A1C);
        Bundle A002 = r5.A00();
        if (!fragmentActivity.getSupportFragmentManager().A12()) {
            C309516Yo A0M = DbS.A0M(fragmentActivity, userSession);
            A0M.A0E(C18280Vp0.A01(A002));
            A0M.A04();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:216:0x07b6, code lost:
        r4.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x07b9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0180, code lost:
        r1.A0E(r0);
        r1.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0186, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0187  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E2Z(android.os.Bundle r26, androidx.fragment.app.FragmentActivity r27, com.instagram.common.session.UserSession r28) {
        /*
            r25 = this;
            r1 = r25
            int r2 = r1.A00
            r0 = r26
            r12 = r27
            r14 = r28
            switch(r2) {
                case 0: goto L_0x03ee;
                case 1: goto L_0x03ae;
                case 2: goto L_0x077e;
                case 3: goto L_0x00b6;
                case 4: goto L_0x075a;
                case 5: goto L_0x00ac;
                case 6: goto L_0x0747;
                case 7: goto L_0x073b;
                case 8: goto L_0x0160;
                case 9: goto L_0x0731;
                case 10: goto L_0x072d;
                case 11: goto L_0x0729;
                case 12: goto L_0x070f;
                case 13: goto L_0x0706;
                case 14: goto L_0x0356;
                case 15: goto L_0x00a1;
                case 16: goto L_0x0096;
                case 17: goto L_0x003a;
                case 18: goto L_0x027f;
                case 19: goto L_0x00c1;
                case 20: goto L_0x06f8;
                case 21: goto L_0x06ec;
                case 22: goto L_0x06d4;
                case 23: goto L_0x06b3;
                case 24: goto L_0x0690;
                case 25: goto L_0x0683;
                case 26: goto L_0x067c;
                case 27: goto L_0x059d;
                case 28: goto L_0x0599;
                case 29: goto L_0x0588;
                case 30: goto L_0x01d0;
                case 31: goto L_0x0562;
                case 32: goto L_0x0544;
                case 33: goto L_0x04f4;
                case 34: goto L_0x04d1;
                case 35: goto L_0x04b6;
                case 36: goto L_0x047c;
                case 37: goto L_0x018f;
                case 38: goto L_0x0457;
                case 39: goto L_0x0130;
                default: goto L_0x000d;
            }
        L_0x000d:
            java.lang.String r9 = X.DbS.A0l(r0)
            java.lang.String r1 = "incentive_id"
            java.lang.String r3 = r0.getString(r1)
            java.lang.String r1 = "merchant_id"
            java.lang.String r2 = r0.getString(r1)
            java.lang.String r1 = "merchant_username"
            java.lang.String r1 = r0.getString(r1)
            X.3kF r4 = X.C249713kF.A00
            X.UzB r7 = X.C16675UzB.INCENTIVE
            r8 = 0
            r5 = r12
            r6 = r14
            X.Vk1 r0 = r4.A0J(r5, r6, r7, r8, r9)
            r0.A0D = r1
            r0.A05 = r3
            r0.A08 = r2
            r0.A09 = r1
            r0.A00()
        L_0x0039:
            return
        L_0x003a:
            java.lang.String r2 = ""
            java.lang.String r1 = "TRUSTED_NOTIFICATION_USER_ACTION_KEY"
            int r1 = r0.getInt(r1)
            java.lang.Integer r15 = X.C49236Erf.A00(r1)
            r23 = 0
            java.lang.String r1 = "lat"
            java.lang.String r1 = r0.getString(r1, r2)     // Catch:{ NullPointerException | NumberFormatException -> 0x005d }
            double r21 = java.lang.Double.parseDouble(r1)     // Catch:{ NullPointerException | NumberFormatException -> 0x005d }
            java.lang.String r1 = "long"
            java.lang.String r1 = r0.getString(r1, r2)     // Catch:{ NullPointerException | NumberFormatException -> 0x005f }
            double r23 = java.lang.Double.parseDouble(r1)     // Catch:{ NullPointerException | NumberFormatException -> 0x005f }
            goto L_0x0066
        L_0x005d:
            r21 = 0
        L_0x005f:
            java.lang.String r3 = "AppStartupUtil"
            java.lang.String r1 = "Trusted Notification contains invalid latitude/longitude"
            X.0wb.A03(r3, r1)
        L_0x0066:
            java.lang.String r1 = "dn"
            java.lang.String r16 = r0.getString(r1, r2)
            java.lang.String r1 = "ts"
            java.lang.String r17 = r0.getString(r1, r2)
            java.lang.String r1 = "ln"
            java.lang.String r18 = r0.getString(r1, r2)
            java.lang.String r1 = "rdi"
            java.lang.String r19 = r0.getString(r1, r2)
            java.lang.String r1 = "tfi"
            java.lang.String r20 = r0.getString(r1, r2)
            X.6Yo r1 = X.DbS.A0M(r12, r14)
            X.1YQ r0 = X.AnonymousClass1YQ.A00
            if (r0 == 0) goto L_0x0187
            X.1YP r0 = (X.AnonymousClass1YP) r0
            X.1YR r14 = r0.A00
            X.E3A r0 = r14.A00(r15, r16, r17, r18, r19, r20, r21, r23)
            goto L_0x0180
        L_0x0096:
            X.6Yo r1 = X.C46447Df9.A01(r12, r14)
            X.E3E r0 = new X.E3E
            r0.<init>()
            goto L_0x0180
        L_0x00a1:
            X.6Yo r1 = X.DbS.A0M(r12, r14)
            X.NKT r0 = new X.NKT
            r0.<init>()
            goto L_0x0180
        L_0x00ac:
            X.6Yo r1 = X.DbU.A0Q(r12, r14)
            androidx.fragment.app.Fragment r0 = X.SAY.A00(r0)
            goto L_0x0180
        L_0x00b6:
            X.6Yo r1 = X.DbS.A0M(r12, r14)
            X.KXc r0 = new X.KXc
            r0.<init>()
            goto L_0x0180
        L_0x00c1:
            java.lang.String r2 = "ReelViewerFragment.ARGUMENTS_KEY_EXTRA_SELECTED_REEL_IDS"
            java.util.ArrayList r5 = r0.getStringArrayList(r2)
            java.lang.String r2 = "ReelViewerFragment.ARGUMENTS_KEY_EXTRA_PUSH_NOTIF_TYPE"
            java.lang.String r6 = r0.getString(r2)
            if (r5 == 0) goto L_0x0039
            X.6Ye r4 = X.DbS.A0i()
            r2 = 1
            r4.A0V = r2
            X.DbY.A1R(r4)
            X.3BQ r2 = X.AnonymousClass3BQ.PUSH_NOTIFICATION
            r4.A03(r2)
            r4.A0G = r6
            X.3BN r2 = new X.3BN
            r2.<init>()
            r4.A02 = r2
            java.lang.String r2 = "disable_interstitial"
            r3 = 0
            boolean r2 = r0.getBoolean(r2, r3)
            r2 = r2 ^ 1
            r4.A0Y = r2
            java.lang.String r2 = "chain_unseen_reels"
            boolean r0 = r0.getBoolean(r2, r3)
            if (r0 == 0) goto L_0x011f
            com.instagram.reels.store.ReelStore r0 = X.1OP.A05(r14)
            boolean r0 = r0.A0d()
            if (r0 == 0) goto L_0x07ba
            X.1Ng r3 = X.AnonymousClass1Nd.A00(r14)
            long r15 = java.lang.System.currentTimeMillis()
            java.lang.Class<X.376> r2 = X.AnonymousClass376.class
            X.FXX r0 = new X.FXX
            r7 = r0
            r8 = r12
            r9 = r1
            r10 = r3
            r11 = r14
            r12 = r4
            r13 = r6
            r14 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            r3.A01(r0, r2)
            return
        L_0x011f:
            X.6Yo r1 = X.DbS.A0M(r12, r14)
            r4.A0O = r5
            r4.A0Q = r5
            android.os.Bundle r0 = r4.A00()
            instagram.features.stories.fragment.ReelViewerFragment r0 = X.C18280Vp0.A01(r0)
            goto L_0x0180
        L_0x0130:
            X.0Tu r3 = X.0Tu.A05
            r1 = 36311835363771167(0x81016c0000031f, double:3.027089127849226E-306)
            boolean r1 = X.182.A06(r3, r14, r1)
            if (r1 == 0) goto L_0x0039
            java.lang.String r9 = X.DbS.A0l(r0)
            java.lang.String r1 = "merchant_igid"
            java.lang.String r3 = r0.getString(r1)
            X.3kF r0 = X.C249713kF.A00
            if (r3 != 0) goto L_0x07c2
            r7 = 0
            X.V1Z r2 = X.V1Z.UNKNOWN
            X.V1W r3 = X.V1W.UNKNOWN
            X.V1Y r4 = X.V1Y.UNKNOWN
            X.V1X r5 = X.V1X.UNKNOWN
            r13 = 0
            java.lang.String r8 = "app_startup"
            r1 = r12
            r6 = r14
            r10 = r7
            r11 = r7
            r12 = r7
            r0.A0p(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        L_0x0160:
            java.lang.String r1 = "screen_id"
            java.lang.String r3 = r0.getString(r1)
            java.lang.String r1 = "entrypoint"
            java.lang.String r2 = r0.getString(r1)
            if (r3 == 0) goto L_0x0039
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = r3.toUpperCase(r0)
            X.XQw r0 = X.C21251XQw.valueOf(r0)
            X.6Yo r1 = X.DbS.A0M(r12, r14)
            X.JaK r0 = X.Eq6.A00(r0, r2)
        L_0x0180:
            r1.A0E(r0)
            r1.A04()
            return
        L_0x0187:
            X.DbS.A15()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x018f:
            X.FHD.A0G(r14, r12)
            java.lang.String r2 = "CommentThreadFragment.MEDIA_ID"
            java.lang.String r16 = r0.getString(r2)
            java.lang.String r2 = "CommentThreadFragment.TARGET_COMMENT_ID"
            java.lang.String r17 = r0.getString(r2)
            java.lang.String r2 = "CommentThreadFragment.INTENT_EXTRA_SORT_ORDER"
            r0.getString(r2)
            java.lang.String r2 = "CommentThreadFragment.PERMALINK_ENABLED"
            boolean r20 = r0.getBoolean(r2)
            r2 = 101(0x65, float:1.42E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            boolean r23 = r0.getBoolean(r2)
            X.1Y4 r0 = X.C3018960m.A00()
            X.Hs6 r11 = r0.A00()
            X.Fbx r15 = new X.Fbx
            r15.<init>(r1)
            r18 = 0
            r19 = 0
            r22 = 1
            X.5OB r13 = X.AnonymousClass5OB.NOTIFICATIONS
            r21 = r19
            r24 = r19
            r11.A02(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return
        L_0x01d0:
            java.lang.String r3 = "merchant_id"
            java.lang.String r5 = r0.getString(r3)
            if (r5 != 0) goto L_0x01da
            java.lang.String r5 = ""
        L_0x01da:
            java.lang.String r10 = "merchant_username"
            java.lang.String r6 = r0.getString(r10)
            java.lang.String r2 = "seller_shoppable_feed_type"
            java.lang.String r2 = r0.getString(r2)
            com.instagram.api.schemas.SellerShoppableFeedType r13 = X.16m.A00(r2)
            java.lang.String r2 = "pinned_product_ids"
            java.util.ArrayList r4 = r0.getStringArrayList(r2)
            java.lang.String r18 = X.DbS.A0l(r0)
            if (r18 != 0) goto L_0x01f8
            java.lang.String r18 = "deep_link"
        L_0x01f8:
            java.lang.String r2 = "deep_link_launch_mode"
            java.lang.String r0 = r0.getString(r2)
            if (r0 == 0) goto L_0x024c
            X.VPQ r2 = X.C17091VHn.A00(r14)
            com.instagram.common.session.UserSession r2 = r2.A00
            r7 = 1
            X.0qQ.A0B(r2, r7)
            java.lang.String r11 = "profile_shop"
            X.1Am r8 = X.1Al.A01(r2)
            X.1An r7 = X.1An.A2s
            X.0xa r9 = r8.A03(r7)
            java.lang.String r8 = "pinned"
            boolean r7 = r0.equals(r8)
            if (r7 != 0) goto L_0x0265
            java.lang.String r7 = "recent"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x024c
            boolean r0 = X.2R8.A00(r2)
            r2 = 0
            if (r0 == 0) goto L_0x024c
            java.lang.String r0 = "deep_link_launch:%s:%s:%s"
            java.lang.String r3 = X.DbU.A0s(r0, r11, r7, r3)
            java.lang.String r3 = r9.getString(r3, r2)
            java.lang.String r0 = X.DbU.A0s(r0, r11, r7, r10)
            java.lang.String r2 = r9.getString(r0, r2)
        L_0x023f:
            if (r3 == 0) goto L_0x024c
            if (r2 == 0) goto L_0x024c
            X.Ex3 r0 = new X.Ex3
            r0.<init>(r3, r2)
            java.lang.String r5 = r0.A00
            java.lang.String r6 = r0.A01
        L_0x024c:
            X.Fbw r15 = new X.Fbw
            r15.<init>(r1)
            X.3kF r11 = X.C249713kF.A00
            r16 = 0
            r17 = r16
            r19 = r5
            r20 = r6
            X.W2P r0 = r11.A0N(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r0.A0H = r4
            r0.A05()
            return
        L_0x0265:
            boolean r0 = X.2R8.A00(r2)
            r7 = 0
            if (r0 == 0) goto L_0x024c
            java.lang.String r2 = "deep_link_launch:%s:%s:%s"
            java.lang.String r0 = X.DbU.A0s(r2, r11, r8, r3)
            java.lang.String r3 = r9.getString(r0, r7)
            java.lang.String r0 = X.DbU.A0s(r2, r11, r8, r10)
            java.lang.String r2 = r9.getString(r0, r7)
            goto L_0x023f
        L_0x027f:
            X.FHD.A0G(r14, r12)
            java.lang.String r2 = "forced_preview_comment_argument"
            java.lang.String r2 = r0.getString(r2)
            java.lang.String r3 = "InstagramUrlLaunchConstants.EXTRA_PUSH_NOTIFICATION_TYPE"
            java.lang.String r5 = r0.getString(r3)
            java.lang.String r3 = "media_ids"
            java.lang.String r6 = r0.getString(r3)
            r3 = 141(0x8d, float:1.98E-43)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            boolean r3 = r0.getBoolean(r3)
            java.lang.String r4 = "id"
            if (r3 != 0) goto L_0x02db
            java.lang.String r3 = "like"
            boolean r22 = r3.equals(r5)
            if (r22 != 0) goto L_0x02b6
            r3 = 4180(0x1054, float:5.857E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x02db
        L_0x02b6:
            X.1Y4 r3 = X.C3018960m.A00()
            X.Hs6 r11 = r3.A00()
            X.Fbu r15 = new X.Fbu
            r15.<init>(r1)
            java.lang.String r16 = r0.getString(r4)
            r19 = 0
            r20 = 1
            r18 = 0
            X.5OB r13 = X.AnonymousClass5OB.NOTIFICATIONS
            r21 = r19
            r23 = r19
            r24 = r19
            r17 = r2
            r11.A02(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return
        L_0x02db:
            if (r6 == 0) goto L_0x0314
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto L_0x0314
            java.util.ArrayList r4 = X.DbY.A0l(r6)
            X.6Yo r3 = X.DbS.A0M(r12, r14)
            java.lang.String r2 = "app_startup"
            X.Del r1 = X.C49262Es5.A00(r2)
            java.lang.String r0 = "Static"
            r1.A06 = r0
            java.lang.String r0 = X.AnonymousClass7TF.A0b()
            r1.A0A = r0
            r0 = 2131962592(0x7f132ae0, float:1.9561914E38)
            java.lang.String r0 = r12.getString(r0)
            r1.A07 = r0
            r1.A09(r4)
            r1.A09 = r2
            instagram.features.feed.fragment.ContextualFeedFragment r0 = r1.A07()
        L_0x030d:
            r3.A0E(r0)
            r3.A04()
            return
        L_0x0314:
            java.lang.String r1 = "carousel_pending_sub_post_upload_notif"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x032c
            java.lang.String r1 = "parent_post_id"
            java.lang.String r2 = r0.getString(r1)
            java.lang.String r1 = "parent_post_thumbnail_url"
            java.lang.String r0 = r0.getString(r1)
            X.C54999HaW.A00(r12, r14, r2, r0)
            return
        L_0x032c:
            java.lang.String r4 = r0.getString(r4)
            if (r4 != 0) goto L_0x0340
            X.0Tu r3 = X.0Tu.A05
            r0 = 36325768237692109(0x810e18000034cd, double:3.0359003334200095E-306)
            boolean r0 = X.182.A06(r3, r14, r0)
            if (r0 == 0) goto L_0x0340
            return
        L_0x0340:
            X.6Yo r3 = X.DbS.A0M(r12, r14)
            com.instagram.util.fragment.IgFragmentFactoryImpl r0 = com.instagram.util.fragment.IgFragmentFactoryImpl.A00()
            X.F3W r1 = r0.A03(r4)
            r0 = 1
            r1.A0M = r0
            r1.A09 = r2
            X.32F r0 = r1.A01()
            goto L_0x030d
        L_0x0356:
            java.lang.String r2 = "media_id"
            java.lang.String r4 = r0.getString(r2)
            if (r4 != 0) goto L_0x0366
            java.lang.String r1 = "AppStartupUtil"
            java.lang.String r0 = "media_id not available for SHARE_MEDIA_TO_STORY destination"
            X.0wb.A03(r1, r0)
            return
        L_0x0366:
            X.1Xj r15 = X.DbV.A0U(r14, r4)
            X.0hq r0 = r12.getSupportFragmentManager()
            r3 = 0
            if (r15 != 0) goto L_0x039a
            r6 = 5
            X.EDW r2 = new X.EDW
            r5 = r2
            r7 = r12
            r8 = r1
            r9 = r0
            r10 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            X.06j r0 = r0.A0U
            java.util.List r0 = r0.A04()
            java.lang.Object r0 = r0.get(r3)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.0gy r1 = X.AnonymousClass07i.A00(r0)
            java.lang.String r0 = android.net.Uri.encode(r4)
            X.1OC r0 = X.C3724090s.A04(r14, r0)
            r0.A00 = r2
            X.1ES.A00(r12, r1, r0)
            return
        L_0x039a:
            X.06j r0 = r0.A0U
            java.util.List r0 = r0.A04()
            java.lang.Object r13 = r0.get(r3)
            androidx.fragment.app.Fragment r13 = (androidx.fragment.app.Fragment) r13
            java.lang.String r16 = "activity_tab"
            r17 = r3
            X.1OP.A09(r12, r13, r14, r15, r16, r17)
            return
        L_0x03ae:
            java.lang.Object r5 = r1.A01
            java.lang.String r1 = "media_id"
            java.lang.String r2 = r0.getString(r1)
            X.1Xj r1 = X.DbV.A0U(r14, r2)
            X.0hq r4 = r12.getSupportFragmentManager()
            if (r1 == 0) goto L_0x03c7
            r1.A3F()
            X.ABC.A00(r0, r12, r14, r1)
            return
        L_0x03c7:
            r1 = 0
            X.1OC r3 = X.AnonymousClass93V.A04(r14, r2, r1, r1)
            r2 = 0
            X.H4f r1 = new X.H4f
            r10 = r1
            r11 = r2
            r13 = r5
            r15 = r0
            r16 = r4
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r3.A00 = r1
            X.06j r0 = r4.A0U
            java.util.List r0 = r0.A04()
            java.lang.Object r0 = r0.get(r2)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.0gy r0 = X.AnonymousClass07i.A00(r0)
            X.1ES.A00(r12, r0, r3)
            return
        L_0x03ee:
            java.lang.Object r13 = r1.A01
            java.lang.String r1 = "media_id"
            java.lang.String r4 = r0.getString(r1)
            if (r4 != 0) goto L_0x0403
            java.lang.String r1 = "media_id not available for INSIGHTS destination"
        L_0x03fa:
            java.lang.String r0 = "AppStartupUtil"
            X.0wb.A03(r0, r1)
            X.C59689JTv.A0C(r12, r1)
            return
        L_0x0403:
            X.1Xj r5 = X.DbV.A0U(r14, r4)
            X.0hq r3 = r12.getSupportFragmentManager()
            X.06j r6 = r3.A0U
            java.util.List r0 = r6.A04()
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.0gy r1 = X.AnonymousClass07i.A00(r0)
            java.util.List r0 = r6.A04()
            java.lang.Object r15 = r0.get(r2)
            if (r15 == 0) goto L_0x0446
            boolean r0 = r15 instanceof X.AnonymousClass0iw
            if (r0 == 0) goto L_0x0446
            boolean r0 = r15 instanceof X.AnonymousClass4DJ
            if (r0 == 0) goto L_0x0446
            boolean r0 = r15 instanceof X.AnonymousClass4D6
            if (r0 == 0) goto L_0x0446
            if (r5 != 0) goto L_0x0449
            r11 = 1
            X.H4f r10 = new X.H4f
            r16 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16)
            X.1OC r0 = X.C3724090s.A04(r14, r4)
            r0.A00 = r10
            X.1ES.A00(r12, r1, r0)
            return
        L_0x0446:
            java.lang.String r1 = "fragment not eligible open insights"
            goto L_0x03fa
        L_0x0449:
            X.0iw r15 = (X.AnonymousClass0iw) r15
            X.4DJ r15 = (X.AnonymousClass4DJ) r15
            X.4D6 r15 = (X.AnonymousClass4D6) r15
            androidx.fragment.app.Fragment r15 = (androidx.fragment.app.Fragment) r15
            java.lang.String r0 = "app_startup"
            X.C48899Elz.A00(r15, r14, r5, r0)
            return
        L_0x0457:
            X.FHD.A0G(r14, r12)
            X.6Yo r5 = X.DbS.A0M(r12, r14)
            X.1a1 r4 = X.C46447Df9.A02()
            java.lang.String r1 = "id"
            java.lang.String r3 = r0.getString(r1)
            java.lang.String r1 = "source_application"
            java.lang.String r2 = r0.getString(r1)
            java.lang.String r1 = "app_startup_profile_uri"
            java.lang.String r0 = "app_startup"
            X.Dfc r0 = X.C46548Dgp.A01(r14, r3, r1, r0)
            r0.A0M = r2
            X.C46474Dfc.A02(r5, r14, r4, r0)
            return
        L_0x047c:
            X.FHD.A0G(r14, r12)
            java.lang.String r1 = "id"
            java.lang.String r1 = r0.getString(r1)
            X.6Yo r5 = X.DbS.A0M(r12, r14)
            com.instagram.util.fragment.IgFragmentFactoryImpl.A00()
            r4 = 1
            X.Ua1 r3 = new X.Ua1
            r3.<init>()
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            r0 = 58
            java.lang.String r0 = X.Pxd.A00(r0)
            r2.putString(r0, r1)
            r0 = 57
            java.lang.String r1 = X.Pxd.A00(r0)
            r0 = 0
            r2.putBoolean(r1, r0)
            r0 = 884(0x374, float:1.239E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putBoolean(r0, r4)
            X.DbX.A18(r2, r3, r5)
            return
        L_0x04b6:
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.lang.String r1 = "ExplorePeopleFragment.ARGUMENT_ENTRY_POINT"
            java.lang.String r0 = "push"
            r2.putString(r1, r0)
            X.6Yo r1 = X.DbS.A0M(r12, r14)
            X.FC6.A01()
            X.E3O r0 = new X.E3O
            r0.<init>()
            X.DbX.A18(r2, r0, r1)
            return
        L_0x04d1:
            X.6Yo r4 = X.DbS.A0M(r12, r14)
            X.1YF r3 = X.C46339Dch.A01()
            java.lang.String r1 = "type"
            java.lang.String r2 = r0.getString(r1)
            java.lang.String r1 = "ranking_order"
            java.lang.String r1 = r0.getString(r1)
            X.1YE r3 = (X.1YE) r3
            r0 = 0
            X.AnonymousClass7TG.A1O(r2, r1)
            X.Der r0 = r3.Cr6(r14, r2, r1, r0)
            r4.A0E(r0)
            goto L_0x07b6
        L_0x04f4:
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            r1 = 29
            java.lang.String r2 = X.C66579MXk.A00(r1)
            java.lang.String r1 = r0.getString(r2)
            r3.putString(r2, r1)
            java.lang.String r2 = "ExplorePeopleFragment.ARGUMENT_SURFACE"
            java.lang.String r1 = r0.getString(r2)
            r3.putString(r2, r1)
            r1 = 97
            java.lang.String r2 = X.C66579MXk.A00(r1)
            java.lang.String r1 = r0.getString(r2)
            r3.putString(r2, r1)
            java.lang.String r2 = "ExplorePeopleFragment.ARGUMENT_ENTRY_POINT"
            java.lang.String r1 = "push"
            r3.putString(r2, r1)
            java.lang.String r2 = "request_from_notif_type"
            java.lang.String r1 = r0.getString(r2)
            r3.putString(r2, r1)
            java.lang.String r1 = "is_sectioned"
            java.lang.String r0 = r0.getString(r1)
            r3.putString(r1, r0)
            X.6Yo r1 = X.DbS.A0M(r12, r14)
            X.FC6.A01()
            X.E3O r0 = new X.E3O
            r0.<init>()
            X.DbX.A18(r3, r0, r1)
            return
        L_0x0544:
            X.6Yo r3 = X.DbS.A0M(r12, r14)
            X.1a1 r2 = X.C46447Df9.A02()
            java.lang.String r1 = "edit_profile_photo"
            java.lang.String r0 = "app_startup"
            X.Dfc r1 = X.C46548Dgp.A00(r14, r1, r0)
            r0 = 1
            r1.A0X = r0
            androidx.fragment.app.Fragment r0 = X.C46474Dfc.A00(r14, r2, r1)
            r3.A0E(r0)
            X.DbV.A1O(r3)
            return
        L_0x0562:
            java.lang.String r1 = "should_redesign_nux_contact_import"
            r3 = 1
            r0.putBoolean(r1, r3)
            java.lang.String r2 = "redesign_ci_variant"
            java.lang.String r1 = "A"
            r0.putString(r2, r1)
            java.lang.String r1 = "should_remove_nux_ci_skip_button"
            r0.putBoolean(r1, r3)
            X.EVs r2 = X.C48100EVs.SYNC_CONTACTS_PUSH
            java.lang.String r1 = "extra_delegate_source"
            r0.putSerializable(r1, r2)
            X.6Yo r2 = X.DbY.A0J(r12, r14)
            X.E2z r1 = new X.E2z
            r1.<init>()
            X.DbX.A18(r0, r1, r2)
            return
        L_0x0588:
            X.6Yo r2 = X.DbU.A0Q(r12, r14)
            r1 = 0
            r0 = 0
            X.K57 r0 = X.C55243HeY.A00(r0, r14, r1)
            r2.A0E(r0)
            r2.A04()
            return
        L_0x0599:
            X.FHD.A0G(r14, r12)
            return
        L_0x059d:
            X.FHD.A0G(r14, r12)
            java.lang.String r1 = "InstagramUrlLaunchConstants.EXTRA_PUSH_NOTIFICATION_TYPE"
            java.lang.String r6 = r0.getString(r1)
            if (r6 == 0) goto L_0x05c9
            r1 = 1613(0x64d, float:2.26E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto L_0x0659
            r1 = 743(0x2e7, float:1.041E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x05c9
            X.6Yo r1 = X.DbS.A0M(r12, r14)
            r0 = 0
            X.C46354Dcy.A03(r1, r14, r0)
            return
        L_0x05c9:
            r5 = 0
            r9 = 0
            r8 = 0
            r7 = 0
            java.lang.String r1 = "upcoming_event_id"
            java.lang.String r3 = r0.getString(r1)
            if (r3 == 0) goto L_0x0657
            java.lang.String r1 = "upcoming_event_name"
            java.lang.String r8 = r0.getString(r1)
            java.lang.String r1 = "upcoming_event_start_time"
            long r1 = r0.getLong(r1)
            java.lang.Long r7 = java.lang.Long.valueOf(r1)
            java.lang.String r1 = "upcoming_event_end_time"
            long r1 = r0.getLong(r1)
            java.lang.Long r5 = java.lang.Long.valueOf(r1)
            r4 = 1
            r9 = r3
        L_0x05f1:
            java.lang.String r1 = "user_id"
            java.lang.String r3 = r0.getString(r1)
            java.lang.String r2 = "app_startup"
            if (r6 == 0) goto L_0x0612
            java.lang.String r1 = "ig_profile_wall_note_create"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x0612
            if (r3 == 0) goto L_0x0612
            X.Dfc r3 = X.C46548Dgp.A01(r14, r3, r2, r2)
        L_0x0609:
            X.6Yo r4 = X.DbS.A0M(r12, r14)
            androidx.fragment.app.Fragment r3 = X.C46447Df9.A00(r14, r3)
            goto L_0x0677
        L_0x0612:
            java.lang.String r1 = "id"
            java.lang.String r1 = r0.getString(r1)
            if (r1 != 0) goto L_0x062a
            java.lang.String r0 = "Username missing when navigating to user detail from notification type: "
            if (r6 != 0) goto L_0x0620
            java.lang.String r6 = "unknown"
        L_0x0620:
            java.lang.String r1 = X.002.A0R(r0, r6)
            java.lang.String r0 = "startup_missing_username"
            X.0wb.A03(r0, r1)
            return
        L_0x062a:
            X.Dfc r3 = X.C46548Dgp.A02(r14, r1, r2, r2)
            r2 = 0
            r1 = r2
            if (r4 == 0) goto L_0x0633
            r1 = r9
        L_0x0633:
            r3.A0P = r1
            r1 = r2
            if (r4 == 0) goto L_0x0639
            r1 = r8
        L_0x0639:
            r3.A0Q = r1
            r1 = r2
            if (r4 == 0) goto L_0x063f
            r1 = r7
        L_0x063f:
            r3.A07 = r1
            if (r4 == 0) goto L_0x0644
            r2 = r5
        L_0x0644:
            r3.A06 = r2
            java.lang.String r2 = "InstagramUrlLaunchConstants.EXTRA_AUTO_LAUNCH_REEL_PARAMS"
            boolean r1 = r0.containsKey(r2)
            if (r1 == 0) goto L_0x0609
            android.os.Parcelable r0 = r0.getParcelable(r2)
            com.instagram.profile.intf.AutoLaunchReelParams r0 = (com.instagram.profile.intf.AutoLaunchReelParams) r0
            r3.A02 = r0
            goto L_0x0609
        L_0x0657:
            r4 = 0
            goto L_0x05f1
        L_0x0659:
            X.6Yo r4 = X.DbS.A0M(r12, r14)
            com.instagram.util.fragment.IgFragmentFactoryImpl.A00()
            java.lang.String r1 = "id"
            java.lang.String r2 = r0.getString(r1)
            X.E6a r3 = new X.E6a
            r3.<init>()
            android.os.Bundle r1 = X.DbY.A09(r14)
            java.lang.String r0 = "FeaturedUserFragment.EXTRA_USER_NAME"
            r1.putString(r0, r2)
            r3.setArguments(r1)
        L_0x0677:
            r4.A0E(r3)
            goto L_0x07b6
        L_0x067c:
            java.lang.String r1 = "app_startup"
            r0 = 0
            X.C49950FGf.A06(r12, r14, r1, r0)
            return
        L_0x0683:
            java.lang.String r1 = "req_fbid"
            java.lang.String r2 = r0.getString(r1)
            java.lang.String r1 = "bc_inbox_push_notification"
            r0 = 0
            X.C49950FGf.A04(r12, r14, r1, r2, r0)
            return
        L_0x0690:
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()
            java.lang.String r1 = "step"
            java.lang.String r0 = "0"
            r2.put(r1, r0)
            r0 = 557(0x22d, float:7.8E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.DiU r2 = X.C46649DiU.A04(r0, r2)
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = X.DbS.A0N(r14)
            r0 = 2131964965(0x7f133425, float:1.9566727E38)
            X.DbS.A18(r12, r1, r0)
            X.C46649DiU.A07(r12, r1, r2)
            return
        L_0x06b3:
            r0 = 0
            X.0wc r1 = X.DbX.A0O(r0, r14)
            java.lang.String r0 = "ig_branded_content_tag_approval_request_notification_tapped"
            X.Dba.A1I(r1, r0)
            X.6Yo r3 = X.C49892FBu.A00(r12, r14)
            java.lang.String r2 = "push_category"
            X.K8c r1 = new X.K8c
            r1.<init>()
            java.lang.String r0 = "entry_point"
            X.DbZ.A1B(r1, r0, r2)
            r3.A0E(r1)
            r3.A04()
            return
        L_0x06d4:
            java.lang.String r1 = "CommentThreadFragment.MEDIA_ID"
            java.lang.String r2 = r0.getString(r1)
            java.lang.String r1 = "com.instagram.brandedcontent.violation.ARGUMENT_EXTRA_VIOLATION_MEDIA_ID"
            r0.putString(r1, r2)
            X.6Yo r2 = X.C49892FBu.A00(r12, r14)
            X.E4r r1 = new X.E4r
            r1.<init>()
            X.DbX.A18(r0, r1, r2)
            return
        L_0x06ec:
            X.FHD.A0G(r14, r12)
            X.6Yo r1 = X.DbS.A0M(r12, r14)
            r0 = 0
            X.C46354Dcy.A03(r1, r14, r0)
            return
        L_0x06f8:
            X.1Yi r0 = X.C48732EjH.A00()
            java.lang.String r3 = "notification"
            r4 = 0
            r5 = 0
            r1 = r12
            r2 = r14
            r0.A02(r1, r2, r3, r4, r5)
            return
        L_0x0706:
            X.AnonymousClass7TG.A1N(r12, r14)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            X.C250563lf.A0b(r12, r14, r0)
            return
        L_0x070f:
            X.6Yo r4 = X.DbS.A0M(r12, r14)
            X.1as r0 = X.1as.A04
            X.1ap r3 = r0.A02
            java.lang.String r2 = r14.A05
            java.lang.String r1 = "direct_inbox_push_notification"
            r0 = 0
            X.4mt r0 = r3.A09(r1, r2, r0)
            r4.A0E(r0)
            java.lang.String r0 = "push"
            r4.A0B = r0
            goto L_0x07b6
        L_0x0729:
            X.FHB.A07(r0, r12, r14)
            return
        L_0x072d:
            X.FHB.A09(r0, r12, r14)
            return
        L_0x0731:
            X.1Yi r2 = X.C48732EjH.A00()
            java.lang.String r1 = "notification"
            r2.A00(r0, r12, r14, r1)
            return
        L_0x073b:
            java.lang.String r1 = "content_type"
            java.lang.String r1 = r0.getString(r1)
            java.lang.String r0 = "Notifications"
            X.FGP.A02(r12, r14, r1, r0)
            return
        L_0x0747:
            java.lang.String r2 = "com.instagram.settings.intf.ARGUMENT_FORCE_RISK_FETCH"
            r1 = 1
            r0.putBoolean(r2, r1)
            X.6Yo r2 = X.DbU.A0Q(r12, r14)
            com.instagram.settings.common.PaymentOptionsFragment r1 = new com.instagram.settings.common.PaymentOptionsFragment
            r1.<init>()
            X.DbX.A18(r0, r1, r2)
            return
        L_0x075a:
            java.lang.String r1 = "app_id"
            java.lang.String r2 = X.DbU.A0l(r0, r1)
            java.lang.String r1 = "params"
            java.lang.String r1 = r0.getString(r1)
            java.util.HashMap r1 = X.C18136VmC.A01(r14, r1)
            X.DiU r2 = X.C46649DiU.A04(r2, r1)
            java.lang.String r1 = "config"
            java.lang.String r0 = r0.getString(r1)
            X.F1e r0 = X.C18136VmC.A00(r14, r0)
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = r0.A00
            r2.A0D(r12, r0)
            return
        L_0x077e:
            X.6Yo r4 = X.DbS.A0M(r12, r14)
            X.C49765F5y.A01()
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            java.lang.String r1 = "deep_link"
            X.C49765F5y.A01()
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "GDPR.Fragment.EntryPoint"
            r2.putString(r0, r1)
            java.lang.String r1 = X.C49766F5z.A01(r3)
            java.lang.String r0 = "GDPR.Fragment.UserState"
            r2.putString(r0, r1)
            r1 = 1
            java.lang.String r0 = "GDPR.Fragment.Entrance.Enabled"
            r2.putBoolean(r0, r1)
            X.AnonymousClass0Dg.A00(r2, r14)
            X.ELb r0 = new X.ELb
            r0.<init>()
            r0.setArguments(r2)
            r4.A0E(r0)
            java.lang.String r0 = "GDPR.Fragment.Entrance"
            r4.A0A = r0
        L_0x07b6:
            r4.A04()
            return
        L_0x07ba:
            r0 = r12
            r2 = r14
            r3 = r4
            r4 = r6
            A00(r0, r1, r2, r3, r4, r5)
            return
        L_0x07c2:
            r4 = 0
            java.lang.String r5 = "app_startup"
            r1 = r12
            r2 = r14
            r6 = r9
            r7 = r4
            r8 = r4
            r0.A01(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Fe5.E2Z(android.os.Bundle, androidx.fragment.app.FragmentActivity, com.instagram.common.session.UserSession):void");
    }
}
