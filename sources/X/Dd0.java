package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.HashtagImpl;
import java.util.HashSet;
import java.util.List;

public final class Dd0 implements AnonymousClass0lh {
    public final UserSession A00;
    public final HashSet A01 = AnonymousClass7TE.A1F();

    public Dd0(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x012b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0F(X.JV7 r7, X.AnonymousClass0iw r8, X.C283155Gi r9, java.lang.String r10, int r11) {
        /*
            r6 = this;
            r4 = 0
            r5 = 0
            X.AnonymousClass7TF.A1B(r9, r5, r8)
            com.instagram.common.session.UserSession r0 = r6.A00
            X.0wc r1 = X.AnonymousClass0kN.A01(r8, r0)
            java.lang.String r0 = "newsfeed_story_long_click"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x0125
            X.Dq5 r2 = new X.Dq5
            r2.<init>()
            java.lang.String r1 = r8.getModuleName()
            java.lang.String r0 = "module_name"
            r2.A06(r0, r1)
            java.lang.String r0 = A06(r2, r9)
            java.lang.String r1 = A07(r2, r9, r0)
            java.lang.String r0 = "channel_id"
            r2.A06(r0, r1)
            java.lang.String r0 = "prior_module"
            r2.A06(r0, r4)
            java.lang.String r0 = "prior_submodule"
            r2.A06(r0, r4)
            java.lang.String r1 = r9.A08()
            java.lang.String r0 = "event_id"
            r2.A06(r0, r1)
            if (r10 == 0) goto L_0x004c
            java.lang.String r0 = "clicked_filters"
            r2.A06(r0, r10)
        L_0x004c:
            X.5Gm r1 = r9.A05
            X.5Gm r0 = X.C283195Gm.USER_COMMENT_LIKED_SINGLE_MEDIA
            if (r1 == r0) goto L_0x0056
            X.5Gm r0 = X.C283195Gm.USER_SINGLE_MEDIA
            if (r1 != r0) goto L_0x005f
        L_0x0056:
            X.5Gj r0 = r9.A04
            java.lang.String r1 = r0.A0b
            java.lang.String r0 = "comment_id"
            r2.A06(r0, r1)
        L_0x005f:
            java.util.HashSet r1 = r9.A0C()
            if (r1 == 0) goto L_0x0076
            java.lang.String[] r0 = new java.lang.String[r5]
            java.lang.Object[] r0 = r1.toArray(r0)
            if (r0 == 0) goto L_0x0076
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "highlighted_notifications"
            r2.A06(r0, r1)
        L_0x0076:
            java.lang.String r5 = "product_id"
            java.lang.String r0 = r9.A09(r5)
            java.lang.Long r1 = X.DbZ.A0d(r0)
            java.lang.String r0 = "collection_id"
            java.lang.String r0 = r9.A09(r0)
            if (r1 != 0) goto L_0x012d
            if (r0 == 0) goto L_0x00a7
            A0D(r2, r9, r0)
        L_0x008d:
            java.lang.String r1 = "merchant_name"
            java.lang.String r0 = r9.A09(r1)
            if (r0 != 0) goto L_0x009b
            java.lang.String r0 = "business_username"
            java.lang.String r0 = r9.A09(r0)
        L_0x009b:
            r2.A06(r1, r0)
            java.lang.Long r1 = A05(r9)
            java.lang.String r0 = "merchant_id"
            r2.A05(r0, r1)
        L_0x00a7:
            java.lang.String r1 = r9.A09
            java.lang.String r0 = "story_id"
            r3.AAJ(r0, r1)
            int r0 = r9.A00
            java.lang.Long r1 = X.DbS.A0j(r0)
            java.lang.String r0 = "story_type"
            r3.A9F(r0, r1)
            X.5Gj r0 = r9.A04
            java.lang.Long r1 = r0.A0Q
            java.lang.String r0 = "af_candidate_id"
            r3.A9F(r0, r1)
            java.lang.String r1 = r9.A07()
            java.lang.String r0 = "mediaId"
            r3.AAJ(r0, r1)
            X.5Gj r0 = r9.A04
            java.lang.String r1 = r0.A0s
            java.lang.String r0 = "tuuid"
            r3.AAJ(r0, r1)
            java.lang.String r1 = r9.A0D
            java.lang.String r0 = "section"
            java.lang.Long r1 = X.DbV.A0p(r3, r0, r1, r11)
            java.lang.String r0 = "position"
            r3.A9F(r0, r1)
            java.lang.String r1 = "all"
            java.lang.String r0 = "tab"
            r3.AAJ(r0, r1)
            X.DbY.A1C(r3)
            com.instagram.model.hashtag.HashtagImpl r0 = r9.A02()
            if (r0 == 0) goto L_0x012b
            java.lang.String r0 = r0.A0C
            if (r0 == 0) goto L_0x012b
            java.lang.Long r1 = X.AnonymousClass7TE.A10(r0)
        L_0x00f9:
            java.lang.String r0 = "tag_id"
            r3.A9F(r0, r1)
            boolean r0 = r9.A0H()
            if (r0 == 0) goto L_0x0128
            X.Dd2 r1 = X.Dd2.UNSEEN
        L_0x0106:
            java.lang.String r0 = "highlight_type"
            r3.A8M(r1, r0)
            if (r7 == 0) goto L_0x0126
            java.lang.String r1 = r7.A01
        L_0x010f:
            java.lang.String r0 = "notification_feed_session_id"
            r3.AAJ(r0, r1)
            if (r7 == 0) goto L_0x0118
            java.lang.String r4 = r7.A02
        L_0x0118:
            java.lang.String r0 = "notification_feed_visit_id"
            r3.AAJ(r0, r4)
            java.lang.String r0 = "extra_data"
            r3.AAK(r2, r0)
            r3.Cgf()
        L_0x0125:
            return
        L_0x0126:
            r1 = r4
            goto L_0x010f
        L_0x0128:
            X.Dd2 r1 = X.Dd2.A02
            goto L_0x0106
        L_0x012b:
            r1 = r4
            goto L_0x00f9
        L_0x012d:
            r2.A05(r5, r1)
            goto L_0x008d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Dd0.A0F(X.JV7, X.0iw, X.5Gi, java.lang.String, int):void");
    }

    public final void A0G(JV7 jv7, AnonymousClass0iw r7, C283155Gi r8, String str, String str2, String str3, int i) {
        List list;
        JV2 jv2;
        Dd2 dd2;
        String str4;
        List A0x;
        0qQ.A0B(r7, 3);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r7, this.A00), "newsfeed_story_hide");
        if (A0e.isSampled()) {
            0bb r3 = new 0bb();
            r3.A06("module_name", r7.getModuleName());
            r3.A06("channel_id", A07(r3, r8, A06(r3, r8)));
            if (str2 != null) {
                r3.A06("clicked_filters", str2);
            }
            A0e.A9F("af_candidate_id", A04(A0e, this, r8, str));
            A0B(A0e, r8);
            A0e.A9F("af_candidate_id", r8.A04.A0Q);
            A0e.A9F("position", DbS.A0j(i));
            DbY.A1C(A0e);
            A0C(A0e, r8);
            String str5 = null;
            if (str2 == null || (A0x = DbX.A0x(str2)) == null) {
                list = null;
            } else {
                list = 00k.A0a(A0x);
            }
            A0e.AAe("selected_filters", list);
            A0e.AAJ("pill", str3);
            if (jv7 != null) {
                jv2 = (JV2) jv7.A00;
            } else {
                jv2 = null;
            }
            A0e.AAK(A02(jv2), "truncation_logging_data");
            if (r8.A0H()) {
                dd2 = Dd2.UNSEEN;
            } else {
                dd2 = Dd2.A02;
            }
            A0e.A8M(dd2, "highlight_type");
            if (jv7 != null) {
                str4 = jv7.A01;
            } else {
                str4 = null;
            }
            A0e.AAJ("notification_feed_session_id", str4);
            if (jv7 != null) {
                str5 = jv7.A02;
            }
            A0e.AAJ("notification_feed_visit_id", str5);
            A0e.AAK(r3, "extra_data");
            A0e.Cgf();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0152  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0H(X.JV7 r6, X.AnonymousClass0iw r7, X.C283155Gi r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, int r12) {
        /*
            r5 = this;
            r2 = 0
            r0 = 3
            X.0qQ.A0B(r7, r0)
            X.5Gj r0 = r8.A04
            java.lang.String r1 = r0.A0s
            if (r1 == 0) goto L_0x0013
            java.util.HashSet r0 = r5.A01
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0148
        L_0x0013:
            com.instagram.common.session.UserSession r0 = r5.A00
            X.0wc r1 = X.AnonymousClass0kN.A01(r7, r0)
            java.lang.String r0 = "newsfeed_story_impression"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r4.isSampled()
            if (r0 == 0) goto L_0x013d
            X.Dq4 r3 = new X.Dq4
            r3.<init>()
            java.lang.String r0 = A06(r3, r8)
            java.lang.String r1 = A07(r3, r8, r0)
            java.lang.String r0 = "channel_id"
            r3.A06(r0, r1)
            java.lang.String r1 = r8.A08()
            java.lang.String r0 = "event_id"
            r3.A06(r0, r1)
            java.lang.String r1 = r7.getModuleName()
            java.lang.String r0 = "module_name"
            r3.A06(r0, r1)
            if (r10 == 0) goto L_0x0050
            java.lang.String r0 = "clicked_filters"
            r3.A06(r0, r10)
        L_0x0050:
            X.5Gm r1 = r8.A05
            X.5Gm r0 = X.C283195Gm.USER_COMMENT_LIKED_SINGLE_MEDIA
            if (r1 == r0) goto L_0x005a
            X.5Gm r0 = X.C283195Gm.USER_SINGLE_MEDIA
            if (r1 != r0) goto L_0x0063
        L_0x005a:
            X.5Gj r0 = r8.A04
            java.lang.String r1 = r0.A0b
            java.lang.String r0 = "comment_id"
            r3.A06(r0, r1)
        L_0x0063:
            java.util.HashSet r1 = r8.A0C()
            if (r1 == 0) goto L_0x007a
            java.lang.String[] r0 = new java.lang.String[r2]
            java.lang.Object[] r0 = r1.toArray(r0)
            if (r0 == 0) goto L_0x007a
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "highlighted_notifications"
            r3.A06(r0, r1)
        L_0x007a:
            java.lang.String r2 = "product_id"
            java.lang.String r0 = r8.A09(r2)
            java.lang.Long r1 = X.DbZ.A0d(r0)
            java.lang.String r0 = "collection_id"
            java.lang.String r0 = r8.A09(r0)
            if (r1 != 0) goto L_0x0154
            if (r0 == 0) goto L_0x00ab
            A0D(r3, r8, r0)
        L_0x0091:
            java.lang.String r1 = "merchant_name"
            java.lang.String r0 = r8.A09(r1)
            if (r0 != 0) goto L_0x009f
            java.lang.String r0 = "business_username"
            java.lang.String r0 = r8.A09(r0)
        L_0x009f:
            r3.A06(r1, r0)
            java.lang.Long r1 = A05(r8)
            java.lang.String r0 = "merchant_id"
            r3.A05(r0, r1)
        L_0x00ab:
            java.lang.Long r1 = A04(r4, r5, r8, r9)
            java.lang.String r0 = "af_candidate_id"
            r4.A9F(r0, r1)
            java.lang.String r1 = r8.A07()
            java.lang.String r0 = "mediaId"
            r4.AAJ(r0, r1)
            A0B(r4, r8)
            java.lang.Long r1 = X.DbS.A0j(r12)
            java.lang.String r0 = "position"
            r4.A9F(r0, r1)
            java.lang.String r1 = X.DbV.A0t()
            java.lang.String r0 = "physical_device_id"
            r4.AAJ(r0, r1)
            com.instagram.model.hashtag.HashtagImpl r0 = r8.A02()
            r1 = 0
            if (r0 == 0) goto L_0x0152
            java.lang.String r2 = r0.A0C
        L_0x00db:
            java.lang.String r0 = "tag_id"
            r4.AAJ(r0, r2)
            A0C(r4, r8)
            if (r10 == 0) goto L_0x0150
            java.util.List r0 = X.DbX.A0x(r10)
            if (r0 == 0) goto L_0x0150
            java.util.List r2 = X.00k.A0a(r0)
        L_0x00ef:
            java.lang.String r0 = "selected_filters"
            r4.AAe(r0, r2)
            java.lang.String r0 = "pill"
            r4.AAJ(r0, r11)
            java.lang.String r0 = r8.A0A
            java.lang.Boolean r2 = X.DbV.A0m(r0)
            java.lang.String r0 = "is_pinned_row"
            r4.A7p(r0, r2)
            X.DbY.A1C(r4)
            if (r6 == 0) goto L_0x014e
            java.lang.Object r0 = r6.A00
            X.JV2 r0 = (X.JV2) r0
        L_0x010d:
            X.Dq1 r2 = A02(r0)
            java.lang.String r0 = "truncation_logging_data"
            r4.AAK(r2, r0)
            boolean r0 = r8.A0H()
            if (r0 == 0) goto L_0x014b
            X.Dd2 r2 = X.Dd2.UNSEEN
        L_0x011e:
            java.lang.String r0 = "highlight_type"
            r4.A8M(r2, r0)
            if (r6 == 0) goto L_0x0149
            java.lang.String r2 = r6.A01
        L_0x0127:
            java.lang.String r0 = "notification_feed_session_id"
            r4.AAJ(r0, r2)
            if (r6 == 0) goto L_0x0130
            java.lang.String r1 = r6.A02
        L_0x0130:
            java.lang.String r0 = "notification_feed_visit_id"
            r4.AAJ(r0, r1)
            java.lang.String r0 = "extra_data"
            r4.AAK(r3, r0)
            r4.Cgf()
        L_0x013d:
            X.5Gj r0 = r8.A04
            java.lang.String r1 = r0.A0s
            if (r1 == 0) goto L_0x0148
            java.util.HashSet r0 = r5.A01
            r0.add(r1)
        L_0x0148:
            return
        L_0x0149:
            r2 = r1
            goto L_0x0127
        L_0x014b:
            X.Dd2 r2 = X.Dd2.A02
            goto L_0x011e
        L_0x014e:
            r0 = r1
            goto L_0x010d
        L_0x0150:
            r2 = r1
            goto L_0x00ef
        L_0x0152:
            r2 = r1
            goto L_0x00db
        L_0x0154:
            r3.A05(r2, r1)
            goto L_0x0091
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Dd0.A0H(X.JV7, X.0iw, X.5Gi, java.lang.String, java.lang.String, java.lang.String, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0I(X.AnonymousClass0iw r16, X.C47179Dru r17, X.C283155Gi r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23) {
        /*
            r15 = this;
            r5 = 0
            r6 = r18
            X.0qQ.A0B(r6, r5)
            r3 = 1
            r14 = 2
            r7 = r17
            r4 = r16
            X.AnonymousClass7TF.A1E(r4, r14, r7)
            com.instagram.common.session.UserSession r8 = r15.A00
            X.0wc r1 = X.AnonymousClass0kN.A01(r4, r8)
            java.lang.String r0 = "newsfeed_story_click"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x01e5
            X.Dq2 r10 = new X.Dq2
            r10.<init>()
            java.lang.String r1 = r4.getModuleName()
            java.lang.String r0 = "module_name"
            r10.A06(r0, r1)
            java.lang.String r0 = A06(r10, r6)
            java.lang.String r1 = A07(r10, r6, r0)
            java.lang.String r0 = "channel_id"
            r10.A06(r0, r1)
            java.lang.String r0 = "prior_module"
            r1 = r20
            r10.A06(r0, r1)
            java.lang.String r0 = "prior_submodule"
            r1 = r21
            r10.A06(r0, r1)
            java.lang.String r1 = r6.A08()
            java.lang.String r0 = "event_id"
            r10.A06(r0, r1)
            r11 = r22
            if (r22 == 0) goto L_0x005c
            java.lang.String r0 = "clicked_filters"
            r10.A06(r0, r11)
        L_0x005c:
            X.5Gm r1 = r6.A05
            X.5Gm r0 = X.C283195Gm.USER_COMMENT_LIKED_SINGLE_MEDIA
            if (r1 == r0) goto L_0x0066
            X.5Gm r0 = X.C283195Gm.USER_SINGLE_MEDIA
            if (r1 != r0) goto L_0x006f
        L_0x0066:
            X.5Gj r0 = r6.A04
            java.lang.String r1 = r0.A0b
            java.lang.String r0 = "comment_id"
            r10.A06(r0, r1)
        L_0x006f:
            java.util.HashSet r1 = r6.A0C()
            if (r1 == 0) goto L_0x0086
            java.lang.String[] r0 = new java.lang.String[r5]
            java.lang.Object[] r0 = r1.toArray(r0)
            if (r0 == 0) goto L_0x0086
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "highlighted_notifications"
            r10.A06(r0, r1)
        L_0x0086:
            java.lang.String r4 = "product_id"
            java.lang.String r0 = r6.A09(r4)
            java.lang.Long r1 = X.DbZ.A0d(r0)
            java.lang.String r0 = "collection_id"
            java.lang.String r0 = r6.A09(r0)
            if (r1 != 0) goto L_0x023c
            if (r0 == 0) goto L_0x00b7
            A0D(r10, r6, r0)
        L_0x009d:
            java.lang.String r1 = "merchant_name"
            java.lang.String r0 = r6.A09(r1)
            if (r0 != 0) goto L_0x00ab
            java.lang.String r0 = "business_username"
            java.lang.String r0 = r6.A09(r0)
        L_0x00ab:
            r10.A06(r1, r0)
            java.lang.Long r1 = A05(r6)
            java.lang.String r0 = "merchant_id"
            r10.A05(r0, r1)
        L_0x00b7:
            r4 = r19
            java.lang.Long r1 = A04(r2, r15, r6, r4)
            java.lang.String r0 = "af_candidate_id"
            r2.A9F(r0, r1)
            A0B(r2, r6)
            int r0 = r7.A00
            java.lang.Long r1 = X.DbS.A0j(r0)
            java.lang.String r0 = "position"
            r2.A9F(r0, r1)
            java.lang.String r1 = X.DbV.A0t()
            java.lang.String r0 = "physical_device_id"
            r2.AAJ(r0, r1)
            com.instagram.model.hashtag.HashtagImpl r0 = r6.A02()
            r1 = 0
            if (r0 == 0) goto L_0x0239
            java.lang.String r9 = r0.A0C
        L_0x00e2:
            java.lang.String r0 = "tag_id"
            r2.AAJ(r0, r9)
            A0C(r2, r6)
            if (r22 == 0) goto L_0x0236
            java.util.List r0 = X.DbX.A0x(r11)
            if (r0 == 0) goto L_0x0236
            java.util.List r9 = X.00k.A0a(r0)
        L_0x00f6:
            java.lang.String r0 = "selected_filters"
            r2.AAe(r0, r9)
            java.lang.String r0 = "pill"
            r9 = r23
            r2.AAJ(r0, r9)
            java.lang.String r0 = r6.A0A
            java.lang.Boolean r9 = X.DbV.A0m(r0)
            java.lang.String r0 = "is_pinned_row"
            r2.A7p(r0, r9)
            X.DbY.A1C(r2)
            X.JV7 r11 = r7.A01
            if (r11 == 0) goto L_0x0233
            java.lang.Object r0 = r11.A00
            X.JV2 r0 = (X.JV2) r0
        L_0x0118:
            X.Dq1 r9 = A02(r0)
            java.lang.String r0 = "truncation_logging_data"
            r2.AAK(r9, r0)
            boolean r0 = r6.A0H()
            if (r0 == 0) goto L_0x022f
            X.Dd2 r9 = X.Dd2.UNSEEN
        L_0x0129:
            java.lang.String r0 = "highlight_type"
            r2.A8M(r9, r0)
            if (r11 == 0) goto L_0x022c
            java.lang.String r9 = r11.A01
        L_0x0132:
            java.lang.String r0 = "notification_feed_session_id"
            r2.AAJ(r0, r9)
            if (r11 == 0) goto L_0x013b
            java.lang.String r1 = r11.A02
        L_0x013b:
            java.lang.String r0 = "notification_feed_visit_id"
            r2.AAJ(r0, r1)
            java.lang.String r0 = "extra_data"
            r2.AAK(r10, r0)
            X.EVf r9 = r7.A02
            if (r9 == 0) goto L_0x0150
            int r0 = r9.ordinal()
            switch(r0) {
                case 0: goto L_0x0218;
                case 1: goto L_0x021c;
                case 2: goto L_0x0210;
                case 3: goto L_0x0150;
                case 4: goto L_0x0200;
                case 5: goto L_0x0150;
                case 6: goto L_0x0214;
                case 7: goto L_0x0208;
                case 8: goto L_0x020c;
                case 9: goto L_0x0228;
                case 10: goto L_0x0224;
                case 11: goto L_0x0150;
                case 12: goto L_0x0150;
                case 13: goto L_0x0150;
                case 14: goto L_0x0220;
                default: goto L_0x0150;
            }
        L_0x0150:
            r1 = 0
        L_0x0151:
            java.lang.String r0 = "tap_target"
            r2.AAJ(r0, r1)
            java.lang.String r1 = r6.A07()
            java.lang.String r0 = "mediaId"
            r2.AAJ(r0, r1)
            r2.Cgf()
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323440365415583(0x810bfa00002c9f, double:3.034428177618745E-306)
            boolean r0 = X.182.A06(r2, r8, r0)
            if (r0 == 0) goto L_0x01e5
            X.Dd5 r10 = X.Dd5.A00
            X.0qQ.A0B(r10, r3)
            r0 = 9
            X.GNG r1 = new X.GNG
            r1.<init>(r0, r10, r8)
            java.lang.Class<X.Mf8> r0 = X.Mf8.class
            java.lang.Object r1 = r8.A01(r0, r1)
            X.Mf8 r1 = (X.Mf8) r1
            java.lang.String r12 = r6.A09
            java.lang.String r8 = r6.A0C
            if (r9 != 0) goto L_0x01fb
            r0 = -1
        L_0x018a:
            r13 = 0
            if (r0 == r14) goto L_0x01f6
            r9 = 4
            if (r0 == r9) goto L_0x01ef
            if (r0 == r5) goto L_0x01e6
            if (r0 != r3) goto L_0x019c
            X.5Gj r0 = r6.A04
            X.0eM r0 = r0.A1B
            java.lang.String r13 = X.DbS.A0t(r0)
        L_0x019c:
            java.util.List r0 = A0A(r6)
            java.util.List r3 = r1.A01
            int r5 = r3.size()
            if (r5 != r14) goto L_0x01ab
            X.018.A15(r3)
        L_0x01ab:
            java.lang.Integer r9 = X.AnonymousClass05K.A00
            X.0sa r5 = r1.A03
            java.lang.Object r5 = r5.invoke()
            long r5 = X.AnonymousClass7TE.A0R(r5)
            long r5 = X.AnonymousClass7TE.A0P(r5)
            java.lang.Long r10 = java.lang.Long.valueOf(r5)
            X.JwB r11 = new X.JwB
            r11.<init>((java.lang.String) r4, (java.lang.String) r8, (java.util.List) r0)
            X.GnY r8 = new X.GnY
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r3.add(r8)
            com.instagram.common.session.UserSession r0 = r1.A00
            r4 = 36323440365481120(0x810bfa00012ca0, double:3.034428177660191E-306)
            boolean r0 = X.182.A06(r2, r0, r4)
            if (r0 == 0) goto L_0x01e5
            java.util.List r2 = r1.A02
            r1 = 32
            X.JVf r0 = new X.JVf
            r0.<init>((java.util.List) r2, (java.util.List) r3, (int) r1)
            X.C324716zm.A01(r0)
        L_0x01e5:
            return
        L_0x01e6:
            X.DgL r0 = r6.A03()
            if (r0 == 0) goto L_0x019c
            java.lang.String r13 = r0.A00
            goto L_0x019c
        L_0x01ef:
            java.lang.Integer r0 = r7.A03
            java.lang.String r13 = A09(r0)
            goto L_0x019c
        L_0x01f6:
            java.lang.String r13 = r6.A06()
            goto L_0x019c
        L_0x01fb:
            int r0 = r9.ordinal()
            goto L_0x018a
        L_0x0200:
            java.lang.Integer r0 = r7.A03
            java.lang.String r1 = A09(r0)
            goto L_0x0151
        L_0x0208:
            java.lang.String r1 = "ufi_reply"
            goto L_0x0151
        L_0x020c:
            java.lang.String r1 = "ufi_reply_with_reel"
            goto L_0x0151
        L_0x0210:
            java.lang.String r1 = "media_thumbnail"
            goto L_0x0151
        L_0x0214:
            java.lang.String r1 = "ufi_like"
            goto L_0x0151
        L_0x0218:
            java.lang.String r1 = "cell_row"
            goto L_0x0151
        L_0x021c:
            java.lang.String r1 = "profile_picture"
            goto L_0x0151
        L_0x0220:
            java.lang.String r1 = "bolded_text"
            goto L_0x0151
        L_0x0224:
            java.lang.String r1 = "message"
            goto L_0x0151
        L_0x0228:
            java.lang.String r1 = "ufi_view_reply"
            goto L_0x0151
        L_0x022c:
            r9 = r1
            goto L_0x0132
        L_0x022f:
            X.Dd2 r9 = X.Dd2.A02
            goto L_0x0129
        L_0x0233:
            r0 = r1
            goto L_0x0118
        L_0x0236:
            r9 = r1
            goto L_0x00f6
        L_0x0239:
            r9 = r1
            goto L_0x00e2
        L_0x023c:
            r10.A05(r4, r1)
            goto L_0x009d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Dd0.A0I(X.0iw, X.Dru, X.5Gi, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static final Dd1 A00(C283155Gi r1) {
        Dd1 dd1;
        try {
            String str = r1.A0D;
            if (str == null) {
                str = "";
            }
            dd1 = Dd1.valueOf(AnonymousClass7TF.A0k(str));
        } catch (Throwable th) {
            dd1 = new 0eQ(th);
        }
        if (dd1 instanceof 0eQ) {
            dd1 = null;
        }
        Dd1 dd12 = dd1;
        if (dd12 == null) {
            return Dd1.OTHER_STORIES;
        }
        return dd12;
    }

    public static final C47066Dq1 A02(JV2 jv2) {
        if (jv2 == null || !jv2.A02) {
            return null;
        }
        0bb r2 = new 0bb();
        r2.A05("show_more_position", DbS.A0j(jv2.A01));
        r2.A03("is_show_more_clicked", DbT.A0l(jv2.A03));
        return r2;
    }

    private final C68099N0n A03(C283155Gi r5, String str) {
        List list;
        Long l;
        0bb r3 = new 0bb();
        r3.A01(C46327Dbv.ACTIVITY_FEED, "notification_channel");
        r3.A05("recipient_ig_id", Long.valueOf(DbZ.A07(str)));
        r3.A06("notification_type", r5.A0C);
        r3.A07("mentioned_user_ids", A0A(r5));
        C376509Ig r0 = r5.A04.A07;
        Long l2 = null;
        if (r0 != null) {
            list = (List) r0.A03;
        } else {
            list = null;
        }
        r3.A07("mentioned_content_ids", list);
        C376509Ig r02 = r5.A04.A07;
        if (r02 != null) {
            l = (Long) r02.A02;
        } else {
            l = null;
        }
        r3.A05("content_id", l);
        C376509Ig r03 = r5.A04.A07;
        if (r03 != null) {
            l2 = (Long) r03.A01;
        }
        r3.A05("ad_id", l2);
        return r3;
    }

    public static final Long A05(C283155Gi r1) {
        String A09 = r1.A09("merchant_id");
        if (A09 == null && (A09 = r1.A09("business_user_id")) == null) {
            return null;
        }
        return AnonymousClass7TE.A10(A09);
    }

    public static String A06(0bb r2, C283155Gi r3) {
        r2.A06(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r3.A05.toString());
        C283175Gk r0 = r3.A04.A0I;
        if (r0 != null) {
            return r0.A0F;
        }
        return null;
    }

    public static String A07(0bb r1, C283155Gi r2, String str) {
        r1.A06("tip_id", str);
        C283175Gk r0 = r2.A04.A0I;
        if (r0 != null) {
            return r0.A04;
        }
        return null;
    }

    public static final String A09(Integer num) {
        if (num == null) {
            return "custom_button";
        }
        switch (num.intValue()) {
            case 0:
                return "follow";
            case 1:
                return "unfollow";
            case 2:
                return "confirm";
            case 3:
                return "request_cancelled";
            case 4:
                return "unblock";
            case 5:
                return "delete";
            default:
                return "custom_button";
        }
    }

    public static final List A0A(C283155Gi r4) {
        Long l;
        List list;
        C283165Gj r1 = r4.A04;
        C376509Ig r0 = r1.A07;
        if (r0 != null && (list = (List) r0.A04) != null) {
            return list;
        }
        List list2 = r1.A0y;
        if (list2 != null) {
            return list2;
        }
        String str = r1.A0f;
        Long l2 = null;
        if (str != null) {
            l = AnonymousClass7TE.A10(str);
        } else {
            l = null;
        }
        String str2 = r4.A04.A0l;
        if (str2 != null) {
            l2 = AnonymousClass7TE.A10(str2);
        }
        Long[] lArr = {l, l2};
        0qQ.A0B(lArr, 0);
        return 03t.A0I(lArr);
    }

    public static void A0B(0Aj r2, C283155Gi r3) {
        r2.AAJ("tuuid", r3.A04.A0s);
        r2.A8M(A00(r3), "section");
    }

    public static void A0C(0Aj r2, C283155Gi r3) {
        r2.AAJ(C273654mx.A00(2198), r3.A04.A0d);
        r2.AAJ(C273654mx.A00(412), A08(r3.A06));
    }

    public static void A0D(0bb r2, C283155Gi r3, String str) {
        r2.A06("collection_id", str);
        r2.A06("collection_type", r3.A09("collection_type"));
        r2.A06(DialogModule.KEY_TITLE, r3.A09(DialogModule.KEY_TITLE));
    }

    public final void onSessionWillEnd() {
        this.A01.clear();
    }

    public static final Dd1 A01(String str) {
        Dd1 dd1;
        try {
            dd1 = Dd1.valueOf(AnonymousClass7TF.A0k(str));
        } catch (Throwable th) {
            dd1 = new 0eQ(th);
        }
        if (dd1 instanceof 0eQ) {
            dd1 = null;
        }
        Dd1 dd12 = dd1;
        if (dd12 == null) {
            return Dd1.OTHER_STORIES;
        }
        return dd12;
    }

    public static Long A04(0Aj r3, Dd0 dd0, C283155Gi r5, String str) {
        r3.AAK(dd0.A03(r5, str), AnonymousClass000.A00(1621));
        0bb r2 = new 0bb();
        r2.A06("activity_feed_tab", "all");
        r2.A06(C273654mx.A00(1442), r5.A04.A0V);
        r2.A06("af_agg_id", r5.A09);
        r3.AAK(r2, "activity_feed_data");
        r3.A9F("story_type", Long.valueOf((long) r5.A00));
        return r5.A04.A0Q;
    }

    public static final String A08(Integer num) {
        switch (num.intValue()) {
            case 2:
                return "TODAY";
            case 3:
                return "YESTERDAY";
            case 4:
                return "LAST_7_DAYS";
            case 5:
                return "LAST_30_DAYS";
            case 6:
                return "OLDER";
            default:
                return null;
        }
    }

    public static final void A0E(AnonymousClass0iw r5, Dd0 dd0, C283155Gi r7, String str, int i) {
        String str2;
        String str3;
        Object[] array;
        String str4;
        0xI A012 = 0xI.A01(str, r5.getModuleName());
        A012.A0C("story_id", r7.A09);
        A012.A08(Integer.valueOf(r7.A00), "story_type");
        A012.A0C("tuuid", r7.A04.A0s);
        A012.A0C("section", r7.A0D);
        A012.A08(Integer.valueOf(i), "position");
        A012.A0B("af_candidate_id", r7.A04.A0Q);
        HashtagImpl A02 = r7.A02();
        if (A02 != null) {
            A012.A0C("tag_id", A02.A0C);
        }
        A012.A0C("tab", "you");
        String A0t = DbV.A0t();
        if (A0t != null) {
            A012.A0C("physical_device_id", A0t);
        }
        0xF r3 = new 0xF();
        0xF.A00(r3, r5.getModuleName(), "module_name");
        0xF.A00(r3, r7.A05.toString(), PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        C283175Gk r0 = r7.A04.A0I;
        if (r0 != null) {
            str2 = r0.A0F;
        } else {
            str2 = null;
        }
        if (str2 != null) {
            0xF.A00(r3, str2, "tip_id");
        }
        C283175Gk r02 = r7.A04.A0I;
        if (r02 != null) {
            str3 = r02.A04;
        } else {
            str3 = null;
        }
        if (str3 != null) {
            0xF.A00(r3, str3, "channel_id");
        }
        String A08 = r7.A08();
        if (A08 != null) {
            0xF.A00(r3, A08, "event_id");
        }
        C283195Gm r1 = r7.A05;
        if ((r1 == C283195Gm.USER_COMMENT_LIKED_SINGLE_MEDIA || r1 == C283195Gm.USER_SINGLE_MEDIA) && (str4 = r7.A04.A0b) != null) {
            0xF.A00(r3, str4, "comment_id");
        }
        String str5 = "product_id";
        String A09 = r7.A09(str5);
        String A092 = r7.A09("collection_id");
        if (A09 == null) {
            if (A092 != null) {
                0xF.A00(r3, A092, "collection_id");
                0xF.A00(r3, r7.A09("collection_type"), "collection_type");
                str5 = DialogModule.KEY_TITLE;
                A09 = r7.A09(str5);
            }
            HashSet A0C = r7.A0C();
            if (!(A0C == null || (array = A0C.toArray(new String[0])) == null)) {
                0xF.A00(r3, array.toString(), "highlighted_notifications");
            }
            A012.A05(r3, "extra_data");
            DbU.A1R(A012, dd0.A00);
        }
        0xF.A00(r3, A09, str5);
        String A093 = r7.A09("merchant_name");
        if (A093 == null) {
            A093 = r7.A09("business_username");
        }
        0xF.A00(r3, A093, "merchant_name");
        String A094 = r7.A09("merchant_id");
        if (A094 == null) {
            A094 = r7.A09("business_user_id");
        }
        0xF.A00(r3, A094, "merchant_id");
        HashSet A0C2 = r7.A0C();
        0xF.A00(r3, array.toString(), "highlighted_notifications");
        A012.A05(r3, "extra_data");
        DbU.A1R(A012, dd0.A00);
    }
}
