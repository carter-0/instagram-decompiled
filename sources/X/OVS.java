package X;

import com.instagram.common.session.UserSession;

public final class OVS {
    public final 0bY A00 = DbW.A0G();
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final AnonymousClass0eM A03 = C73897PlY.A00(this, 32);
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A01(C73752PjD.A00);
    public final C62320sa A05;
    public final C62320sa A06;
    public final C62320sa A07;

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.1Ln r8, X.OVS r9, java.lang.String r10, java.lang.String r11, java.util.Map r12) {
        /*
            r1 = 0
            int r0 = r10.length()
            if (r0 == 0) goto L_0x0087
            X.0bY r0 = r9.A00
            android.net.Uri r3 = X.0cp.A01(r0, r10)
            if (r3 == 0) goto L_0x0087
            java.lang.String r5 = "destination"
            java.lang.String r7 = r3.getQueryParameter(r5)
            java.lang.String r0 = "feed_type"
            java.lang.String r6 = r3.getQueryParameter(r0)
            java.lang.String r0 = r3.getHost()
            java.lang.String r4 = "share_to_direct_preview"
            boolean r2 = r4.equalsIgnoreCase(r0)
            java.lang.String r0 = "is_add_from_share_to_friends_story"
            boolean r1 = r3.getBooleanQueryParameter(r0, r1)
            if (r7 == 0) goto L_0x0033
            int r0 = r7.length()
            if (r0 != 0) goto L_0x0045
        L_0x0033:
            java.lang.String r0 = "reshare_chaining"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x0088
            X.0eM r0 = r9.A04
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 == 0) goto L_0x0088
            java.lang.String r7 = "feed_reshare_chaining"
        L_0x0045:
            r8.A0R(r5, r7)
        L_0x0048:
            X.0sa r0 = r9.A05
            X.7Zg r0 = X.C66580MXl.A0W(r0)
            X.7ZY r1 = r0.BSN()
            if (r11 != 0) goto L_0x0056
            java.lang.String r11 = ""
        L_0x0056:
            r0 = 0
            com.instagram.model.direct.messageid.MessageIdentifier r0 = X.C66580MXl.A0i(r11, r0)
            java.util.Map r2 = r1.BOG(r0)
            java.util.LinkedHashMap r1 = X.AnonymousClass7TE.A1H()
            if (r12 == 0) goto L_0x0068
            r1.putAll(r12)
        L_0x0068:
            X.0eM r0 = r9.A03
            java.lang.Object r0 = r0.getValue()
            X.7I3 r0 = (X.AnonymousClass7I3) r0
            java.util.LinkedHashMap r0 = r0.A03(r3)
            r1.putAll(r0)
            if (r2 == 0) goto L_0x007c
            r1.putAll(r2)
        L_0x007c:
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0087
            r8.A0w(r1)
        L_0x0087:
            return
        L_0x0088:
            if (r1 == 0) goto L_0x008d
            java.lang.String r7 = "story_post_capture"
            goto L_0x0045
        L_0x008d:
            if (r2 == 0) goto L_0x0048
            r8.A0R(r5, r4)
            goto L_0x0048
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OVS.A00(X.1Ln, X.OVS, java.lang.String, java.lang.String, java.util.Map):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00cc, code lost:
        if (r11.contains("reel") != true) goto L_0x00ce;
     */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0180  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.2FW r18, java.lang.Long r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.util.List r28, java.util.Map r29, boolean r30, boolean r31, boolean r32) {
        /*
            r17 = this;
            r10 = r25
            r6 = 0
            r0 = 6
            r7 = r23
            X.0qQ.A0B(r7, r0)
            r8 = 1
            r3 = r17
            r2 = r20
            if (r20 == 0) goto L_0x01ad
            int r0 = r2.length()
            if (r0 == 0) goto L_0x01ad
            X.0bY r0 = r3.A00
            android.net.Uri r9 = X.0cp.A01(r0, r2)
        L_0x001c:
            java.lang.String r0 = "xma_pending_share_to_friends_story_request"
            boolean r0 = X.0qQ.A0K(r10, r0)
            r4 = r22
            if (r0 != 0) goto L_0x0038
            java.lang.String r0 = "xma_approved_share_to_friends_story_request"
            boolean r0 = X.0qQ.A0K(r10, r0)
            if (r0 != 0) goto L_0x0038
            if (r9 == 0) goto L_0x01aa
            java.lang.String r0 = "is_add_from_share_to_friends_story"
            boolean r0 = r9.getBooleanQueryParameter(r0, r6)
            if (r0 != r8) goto L_0x01aa
        L_0x0038:
            r1 = 0
        L_0x0039:
            com.instagram.common.session.UserSession r12 = r3.A02
            X.0iw r11 = r3.A01
            X.0sa r0 = r3.A07
            java.lang.Object r13 = r0.invoke()
            X.3sy r13 = (X.C254743sy) r13
            boolean r16 = X.C321406u6.A06(r2)
            r14 = r30
            r15 = r31
            X.1Ln r5 = X.C3265677h.A00(r11, r12, r13, r14, r15, r16)
            if (r25 != 0) goto L_0x0057
            r0 = r18
            java.lang.String r10 = r0.A00
        L_0x0057:
            java.lang.String r0 = "web_link_entry_source"
            r5.A0R(r0, r10)
            java.lang.String r0 = "message_id"
            r5.A0R(r0, r1)
            r0 = r28
            if (r28 == 0) goto L_0x01a7
            java.lang.String r1 = X.AnonymousClass7TE.A19(r0, r6)
        L_0x0069:
            java.lang.String r0 = "media_id"
            r5.A0R(r0, r1)
            java.lang.String r0 = "client_context"
            r1 = r24
            r5.A0R(r0, r1)
            java.lang.String r10 = "bot_response_id"
            r6 = r29
            if (r29 == 0) goto L_0x01a0
            java.lang.Object r0 = r6.get(r10)
            if (r0 == 0) goto L_0x01a0
            X.0Tu r11 = X.0Tu.A05
            r0 = 36327288656247108(0x810f7a00023944, double:3.036861852236425E-306)
            boolean r0 = X.182.A06(r11, r12, r0)
            if (r0 == 0) goto L_0x01a0
            java.lang.String r0 = "thread_session_id"
            r1 = r26
            r5.A0R(r0, r1)
            java.lang.String r0 = X.DbT.A11(r10, r6)
            r5.A0R(r10, r0)
            java.lang.String r0 = "entrypoint"
            r1 = r27
            r5.A0R(r0, r1)
            java.lang.String r0 = "xma_tap_index"
            java.lang.String r0 = X.DbT.A11(r0, r6)
            if (r0 == 0) goto L_0x019d
            java.lang.Integer r0 = X.00y.A0l(r0)
            if (r0 == 0) goto L_0x019d
            int r0 = r0.intValue()
        L_0x00b5:
            X.N1G r10 = X.N1G.A00(r0)
            if (r9 == 0) goto L_0x0199
            java.util.List r11 = r9.getPathSegments()
            java.util.Set r13 = r9.getQueryParameterNames()
            if (r11 == 0) goto L_0x00ce
            java.lang.String r0 = "reel"
            boolean r1 = r11.contains(r0)
            r0 = 1
            if (r1 == r8) goto L_0x00cf
        L_0x00ce:
            r0 = 0
        L_0x00cf:
            java.lang.String r12 = ""
            java.lang.String r1 = "content"
            if (r0 == 0) goto L_0x012c
            X.NmQ r7 = X.C69482NmQ.REELS
            java.lang.String r0 = "type"
            r10.A01(r7, r0)
            java.lang.String r7 = "id"
            java.lang.String r0 = r9.getQueryParameter(r7)
            if (r0 == 0) goto L_0x00e5
            r12 = r0
        L_0x00e5:
            r10.A06(r7, r12)
        L_0x00e8:
            r5.A0N(r10, r1)
        L_0x00eb:
            java.lang.String r0 = "tap_surface"
            r5.A0R(r0, r1)
        L_0x00f0:
            r1 = r19
            if (r19 == 0) goto L_0x00f9
            java.lang.String r0 = "index_id"
            r5.A0Q(r0, r1)
        L_0x00f9:
            if (r32 != 0) goto L_0x01b6
            r0 = 10
            r1 = r21
            java.lang.Long r1 = X.00y.A0n(r0, r1)
            java.lang.String r0 = "sender_id"
            r5.A0Q(r0, r1)
            X.0sa r0 = r3.A06
            java.lang.Object r0 = r0.invoke()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x01b0
            java.util.ArrayList r7 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x011a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01b1
            com.instagram.user.model.User r0 = X.DbT.A0k(r1)
            java.lang.String r0 = r0.getId()
            X.C66582MXn.A1N(r0, r7)
            goto L_0x011a
        L_0x012c:
            java.lang.String r14 = "igid"
            if (r13 == 0) goto L_0x014f
            boolean r0 = r13.contains(r14)
            if (r0 != r8) goto L_0x015c
            X.NmQ r7 = X.C69482NmQ.USER
            java.lang.String r0 = "type"
            r10.A01(r7, r0)
            java.lang.String r0 = r9.getQueryParameter(r14)
            if (r0 == 0) goto L_0x0144
            r12 = r0
        L_0x0144:
            java.lang.String r0 = "id"
            r10.A06(r0, r12)
            r5.A0N(r10, r1)
            java.lang.String r1 = "profile"
            goto L_0x00eb
        L_0x014f:
            if (r11 == 0) goto L_0x0182
            java.lang.String r0 = "p"
            boolean r0 = r11.contains(r0)
            if (r0 != r8) goto L_0x0182
            X.NmQ r7 = X.C69482NmQ.PHOTO
            goto L_0x016a
        L_0x015c:
            r0 = 70
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r13.contains(r0)
            if (r0 != r8) goto L_0x014f
            X.NmQ r7 = X.C69482NmQ.CAROUSEL
        L_0x016a:
            java.lang.String r0 = "type"
            r10.A01(r7, r0)
            java.lang.String r0 = r9.getLastPathSegment()
            if (r0 == 0) goto L_0x0180
            java.lang.String r7 = X.C70282O0m.A00(r0)
        L_0x0179:
            java.lang.String r0 = "id"
            r10.A06(r0, r7)
            goto L_0x00e8
        L_0x0180:
            r7 = 0
            goto L_0x0179
        L_0x0182:
            java.lang.String r0 = "cta1"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x00f0
            java.lang.String r0 = "instagram://gen_ai_accounts/"
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x00f0
            r5.A0N(r10, r1)
            java.lang.String r1 = "see_more_button"
            goto L_0x00eb
        L_0x0199:
            r11 = 0
            r13 = 0
            goto L_0x00ce
        L_0x019d:
            r0 = 0
            goto L_0x00b5
        L_0x01a0:
            java.lang.String r0 = "tap_surface"
            r5.A0R(r0, r7)
            goto L_0x00f0
        L_0x01a7:
            r1 = 0
            goto L_0x0069
        L_0x01aa:
            r1 = r4
            goto L_0x0039
        L_0x01ad:
            r9 = 0
            goto L_0x001c
        L_0x01b0:
            r7 = 0
        L_0x01b1:
            java.lang.String r0 = "recipient_ids"
            r5.A0S(r0, r7)
        L_0x01b6:
            if (r20 == 0) goto L_0x01be
            X.0qQ.A0A(r5)
            A00(r5, r3, r2, r4, r6)
        L_0x01be:
            r5.Cgf()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OVS.A01(X.2FW, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.Map, boolean, boolean, boolean):void");
    }

    public OVS(AnonymousClass0iw r2, UserSession userSession, C62320sa r4, C62320sa r5, C62320sa r6) {
        this.A02 = userSession;
        this.A01 = r2;
        this.A07 = r4;
        this.A06 = r5;
        this.A05 = r6;
    }
}
