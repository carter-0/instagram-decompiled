package com.instagram.direct.fragment.channels.discovery.suggestions;

import X.02z;
import X.05G;
import X.0Tu;
import X.0pq;
import X.0qQ;
import X.0sn;
import X.106;
import X.10b;
import X.1ES;
import X.1Eo;
import X.1wn;
import X.AnonymousClass0Ud;
import X.AnonymousClass10A;
import X.AnonymousClass10H;
import X.AnonymousClass12T;
import X.AnonymousClass1Nd;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C262204Co;
import X.C290635fd;
import X.C290645fe;
import X.C318116oQ;
import X.C51965G9l;
import X.C51975G9x;
import X.C62510Kh0;
import X.C69263NiP;
import X.C70222Kg;
import X.C71932OtG;
import X.C73580PgE;
import X.DbX;
import X.MFR;
import X.NQT;
import X.NVR;
import X.OBR;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class ChannelDirectoryInboxViewModel extends NVR {
    public C290645fe A00;
    public C262204Co A01;
    public C262204Co A02;
    public boolean A03;
    public final UserSession A04;
    public final C69263NiP A05;
    public final List A06 = AnonymousClass7TE.A1C();
    public final 05G A07;
    public final AnonymousClass0Ud A08;
    public final boolean A09;
    public final 1wn A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelDirectoryInboxViewModel(UserSession userSession, C69263NiP niP) {
        super(userSession, niP);
        0qQ.A0B(userSession, 1);
        this.A04 = userSession;
        this.A05 = niP;
        0sn r6 = 0sn.A00;
        02z A012 = 106.A01(r6);
        this.A07 = A012;
        0pq A013 = AnonymousClass10H.A01(new C73580PgE(this, 0), this.A07, this.A00, A012, this.A08);
        this.A08 = 10b.A02(new OBR(C62510Kh0.INITIAL_LOAD, r6), C318116oQ.A00(this), A013, AnonymousClass10A.A01);
        C71932OtG A002 = C71932OtG.A00(this, 12);
        this.A0A = A002;
        boolean A1a = C51965G9l.A1a(0Tu.A05, userSession, 36317934219368112L);
        this.A09 = A1a;
        if (A1a) {
            UserSession userSession2 = this.A04;
            NQT nqt = new NQT(this, 4);
            0qQ.A0B(userSession2, 0);
            1ES.A05(C290635fd.A01(userSession2, nqt), 1967622104, 2, false, false);
            AnonymousClass1Nd.A00(userSession).A01(A002, C70222Kg.class);
        }
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.MDx, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: type inference failed for: r2v10 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A04(X.C69374NkE r27, com.instagram.direct.fragment.channels.discovery.suggestions.ChannelDirectoryInboxViewModel r28, X.AnonymousClass4D7 r29) {
        /*
            r0 = r28
            r4 = r27
            r6 = 15
            r7 = r29
            boolean r1 = X.C66145MDx.A02(r6, r7)
            if (r1 == 0) goto L_0x016b
            r2 = r7
            X.MDx r2 = (X.C66145MDx) r2
            int r5 = r2.A00
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r5 & r3
            if (r1 == 0) goto L_0x016b
            int r5 = r5 - r3
            r2.A00 = r5
        L_0x001c:
            java.lang.Object r5 = r2.A03
            X.1Hj r3 = X.1Hj.A02
            int r1 = r2.A00
            r8 = 1
            if (r1 == 0) goto L_0x0117
            if (r1 != r8) goto L_0x0194
            java.lang.Object r4 = r2.A02
            X.NkE r4 = (X.C69374NkE) r4
            java.lang.Object r0 = r2.A01
            com.instagram.direct.fragment.channels.discovery.base.ChannelDiscoveryViewModel r0 = (com.instagram.direct.fragment.channels.discovery.base.ChannelDiscoveryViewModel) r0
            X.0eS.A00(r5)
        L_0x0032:
            r3 = r5
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r1 = r3 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x0172
            X.3lr r5 = X.C41846B3n.A0R(r3)
            if (r5 == 0) goto L_0x017b
            java.lang.Class<X.Bh7> r3 = X.C42710Bh7.class
            java.lang.String r2 = "xfb_igd_channel_directory(data:$data)"
            r1 = 811088590(0x30583ace, float:7.866391E-10)
            X.3lr r5 = r5.A03(r3, r2, r1)
            if (r5 == 0) goto L_0x017b
            java.lang.Class<X.Bh6> r3 = X.C42709Bh6.class
            r10 = 0
            java.lang.String r2 = "channels_directory_info"
            r1 = -791629481(0xffffffffd0d0b157, float:-2.80102646E10)
            com.google.common.collect.ImmutableList r1 = r5.getRequiredCompactedTreeListField(r10, r2, r3, r1)
            if (r1 == 0) goto L_0x017b
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            r3 = 0
            java.util.Iterator r12 = r1.iterator()
        L_0x0063:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x017d
            java.lang.Object r1 = r12.next()
            int r11 = r3 + 1
            if (r3 >= 0) goto L_0x0079
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0079:
            X.3lr r1 = (X.C250663lr) r1
            java.lang.String r5 = "thread_igid"
            java.lang.String r9 = r1.getOptionalStringField(r10, r5)
            java.lang.String r29 = ""
            if (r9 != 0) goto L_0x0087
            r9 = r29
        L_0x0087:
            java.lang.String r5 = "title"
            java.lang.String r5 = r1.getOptionalStringField(r8, r5)
            if (r5 == 0) goto L_0x0091
            r29 = r5
        L_0x0091:
            r14 = 0
            r7 = 14
            X.0qQ.A0B(r9, r7)
            java.lang.String r5 = "subtitle"
            java.lang.String r27 = r1.A09(r5)
            java.lang.String r5 = "invite_link"
            java.lang.String r24 = r1.A0A(r5)
            java.lang.String r5 = "group_image_uri"
            java.lang.String r23 = r1.A0B(r5)
            java.lang.String r5 = "group_image_background_uri"
            java.lang.String r22 = r1.A0C(r5)
            r6 = 6
            java.lang.String r5 = "thread_subtype"
            int r5 = r1.getCoercedIntField(r6, r5)
            java.lang.Integer r19 = X.JTO.A0w(r5)
            r6 = 7
            java.lang.String r5 = "number_of_members"
            int r5 = r1.getCoercedIntField(r6, r5)
            java.lang.Integer r18 = X.JTO.A0w(r5)
            r6 = 8
            java.lang.String r5 = "is_member"
            java.lang.Boolean r16 = X.C41846B3n.A0d(r1, r5, r6)
            r6 = 9
            java.lang.String r5 = "creator_igid"
            java.lang.String r20 = r1.getOptionalStringField(r6, r5)
            r6 = 10
            java.lang.String r5 = "is_creator_verified"
            java.lang.Boolean r15 = X.C41846B3n.A0d(r1, r5, r6)
            r6 = 11
            java.lang.String r5 = "should_badge_channel"
            java.lang.Boolean r17 = X.C41846B3n.A0d(r1, r5, r6)
            r6 = 12
            java.lang.String r5 = "creator_username"
            java.lang.String r21 = r1.getOptionalStringField(r6, r5)
            r6 = 13
            r5 = 186(0xba, float:2.6E-43)
            java.lang.String r5 = X.C273654mx.A00(r5)
            java.lang.String r26 = r1.getOptionalStringField(r6, r5)
            java.lang.String r5 = "social_channel_invite_id"
            java.lang.String r25 = r1.getOptionalStringField(r7, r5)
            X.47n r13 = new X.47n
            r28 = r9
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            X.2tL r3 = r0.A07(r13, r4, r3)
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.direct.fragment.channels.discovery.model.ChannelDiscoveryInvitesRowViewModel"
            X.0qQ.A0C(r3, r1)
            if (r3 == 0) goto L_0x0114
            r2.add(r3)
        L_0x0114:
            r3 = r11
            goto L_0x0063
        L_0x0117:
            X.0eS.A00(r5)
            com.instagram.common.session.UserSession r1 = r0.A04
            X.1vn r1 = X.1vm.A01(r1)
            r17 = 0
            X.2IS r9 = X.C41845B3m.A04()
            X.2IS r10 = X.C41845B3m.A04()
            X.0K0 r7 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r5 = 3
            java.lang.Integer r6 = X.JTO.A0w(r5)
            java.lang.String r5 = "thread_limit"
            X.0Df r7 = X.C41845B3m.A03(r7, r6, r5)
            java.lang.String r6 = r4.A02
            java.lang.String r5 = "surface_view"
            X.0Df.A00(r7, r6, r5)
            java.lang.String r5 = "data"
            X.1vR r11 = X.C41847B3o.A04(r7, r9, r5)
            java.util.Map r13 = r9.getParamsCopy()
            java.util.Map r14 = r10.getParamsCopy()
            java.lang.Class<X.Bh8> r15 = X.C42711Bh8.class
            java.util.ArrayList r21 = X.AnonymousClass7TE.A1C()
            java.lang.String r12 = "IGDChannelDirectory"
            r16 = 0
            java.lang.String r20 = "xfb_igd_channel_directory"
            com.facebook.pando.PandoGraphQLRequest r10 = new com.facebook.pando.PandoGraphQLRequest
            r18 = r16
            r19 = r17
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.C66145MDx.A00(r0, r4, r2, r8)
            java.lang.Object r5 = r1.A04(r10, r2)
            if (r5 != r3) goto L_0x0032
            return r3
        L_0x016b:
            X.MDx r2 = new X.MDx
            r2.<init>(r0, r7, r6)
            goto L_0x001c
        L_0x0172:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0182
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x017b:
            X.0sn r2 = X.0sn.A00
        L_0x017d:
            X.3Ih r3 = new X.3Ih
            r3.<init>(r2)
        L_0x0182:
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x018e
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 == 0) goto L_0x018f
            X.5sO r3 = X.DbU.A0f()
        L_0x018e:
            return r3
        L_0x018f:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0194:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.channels.discovery.suggestions.ChannelDirectoryInboxViewModel.A04(X.NkE, com.instagram.direct.fragment.channels.discovery.suggestions.ChannelDirectoryInboxViewModel, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MDx, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a8, code lost:
        if (r0 == r5) goto L_0x00aa;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A05(X.C69374NkE r7, com.instagram.direct.fragment.channels.discovery.suggestions.ChannelDirectoryInboxViewModel r8, X.AnonymousClass4D7 r9) {
        /*
            r3 = 16
            boolean r0 = X.C66145MDx.A02(r3, r9)
            if (r0 == 0) goto L_0x00ab
            r6 = r9
            X.MDx r6 = (X.C66145MDx) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00ab
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r6.A03
            X.1Hj r5 = X.1Hj.A02
            int r1 = r6.A00
            r4 = 1
            if (r1 == 0) goto L_0x0093
            if (r1 != r4) goto L_0x00b7
            java.lang.Object r7 = r6.A02
            X.NkE r7 = (X.C69374NkE) r7
            java.lang.Object r8 = r6.A01
            com.instagram.direct.fragment.channels.discovery.base.ChannelDiscoveryViewModel r8 = (com.instagram.direct.fragment.channels.discovery.base.ChannelDiscoveryViewModel) r8
            X.0eS.A00(r0)
        L_0x002c:
            r5 = r0
            X.3Ii r5 = (X.C239803Ii) r5
            boolean r0 = r5 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0078
            X.3Ih r5 = (X.C239793Ih) r5
            java.lang.Object r0 = r5.A00
            X.CE8 r0 = (X.CE8) r0
            X.PwF r0 = r0.A00
            if (r0 != 0) goto L_0x0045
            X.C41845B3m.A0v()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0045:
            X.N58 r0 = (X.N58) r0
            java.util.List r0 = r0.A02
            java.util.ArrayList r4 = X.AnonymousClass7TG.A0r(r0)
            r1 = 0
            java.util.Iterator r3 = r0.iterator()
        L_0x0052:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0081
            java.lang.Object r0 = r3.next()
            int r2 = r1 + 1
            if (r1 >= 0) goto L_0x0068
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0068:
            X.47o r0 = (X.C2609247o) r0
            X.2tL r1 = r8.A07(r0, r7, r1)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.fragment.channels.discovery.model.ChannelDiscoveryInvitesRowViewModel"
            X.0qQ.A0C(r1, r0)
            r4.add(r1)
            r1 = r2
            goto L_0x0052
        L_0x0078:
            boolean r0 = r5 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0086
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0081:
            X.3Ih r5 = new X.3Ih
            r5.<init>(r4)
        L_0x0086:
            boolean r0 = r5 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x00aa
            boolean r0 = r5 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00b2
            X.5sO r5 = X.DbU.A0f()
            return r5
        L_0x0093:
            X.0eS.A00(r0)
            com.instagram.common.session.UserSession r3 = r8.A04
            r2 = 3
            int r1 = r7.A00
            r0 = 0
            X.1OC r1 = com.instagram.direct.request.DirectThreadApi.A03(r3, r0, r0, r2, r1)
            X.C66145MDx.A00(r8, r7, r6, r4)
            r0 = -5
            java.lang.Object r0 = r1.A00(r0, r6)
            if (r0 != r5) goto L_0x002c
        L_0x00aa:
            return r5
        L_0x00ab:
            X.MDx r6 = new X.MDx
            r6.<init>(r8, r9, r3)
            goto L_0x0016
        L_0x00b2:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00b7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.channels.discovery.suggestions.ChannelDirectoryInboxViewModel.A05(X.NkE, com.instagram.direct.fragment.channels.discovery.suggestions.ChannelDirectoryInboxViewModel, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ae, code lost:
        if (r4 != null) goto L_0x00b0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A06(com.instagram.direct.fragment.channels.discovery.suggestions.ChannelDirectoryInboxViewModel r26) {
        /*
            r3 = r26
            boolean r0 = r3.A09
            if (r0 == 0) goto L_0x0123
            X.5fe r1 = r3.A00
            if (r1 == 0) goto L_0x0123
            java.lang.String r0 = "direct_ibc_inbox_invitations"
            X.5g5 r0 = r1.A01(r0)
            java.util.List r0 = r0.A02
            X.05G r7 = r3.A07
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            r24 = 0
            java.util.Iterator r14 = r0.iterator()
        L_0x001e:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x00fe
            java.lang.Object r9 = r14.next()
            int r13 = r24 + 1
            if (r24 >= 0) goto L_0x0034
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0034:
            com.instagram.model.direct.DirectShareTarget r9 = (com.instagram.model.direct.DirectShareTarget) r9
            java.lang.String r6 = r9.A08()
            r0 = 0
            if (r6 == 0) goto L_0x00e8
            java.util.List r1 = X.DbT.A14(r9)
            java.lang.Object r11 = X.AnonymousClass7TE.A13(r1)
            com.instagram.pendingmedia.model.recipients.PendingRecipient r11 = (com.instagram.pendingmedia.model.recipients.PendingRecipient) r11
            com.instagram.direct.model.thread.DiscoverableThreadInfo r1 = r9.A06
            if (r1 == 0) goto L_0x00fb
            java.lang.String r4 = r1.A01
            if (r4 == 0) goto L_0x00fb
            X.0eE r2 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r1 = r3.A04
            com.instagram.user.model.User r2 = r2.A01(r1)
            java.util.List r1 = X.DbT.A14(r9)
            X.34S r5 = X.AnonymousClass3UE.A00(r0, r2, r4, r0, r1)
            java.lang.Object r4 = r5.A00
            java.util.List r1 = X.DbT.A14(r9)
            int r2 = r1.size()
            r1 = 1
            if (r2 <= r1) goto L_0x00f8
            java.lang.Object r1 = r5.A01
        L_0x006e:
            X.0eP r4 = X.AnonymousClass7TE.A1L(r4, r1)
        L_0x0072:
            boolean r5 = r9.A0U
            com.instagram.common.session.UserSession r12 = r3.A04
            X.0Tu r10 = X.0Tu.A05
            r1 = 36317934219433649(0x8106f8002016b1, double:3.0309460687283E-306)
            boolean r1 = X.182.A06(r10, r12, r1)
            if (r1 == 0) goto L_0x00a2
            java.util.Iterator r10 = X.C66583MXo.A0l(r7)
        L_0x0087:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x00f6
            java.lang.Object r2 = r10.next()
            r1 = r2
            X.N64 r1 = (X.N64) r1
            java.lang.String r1 = r1.A07
            boolean r1 = X.0qQ.A0K(r1, r6)
            if (r1 == 0) goto L_0x0087
        L_0x009c:
            X.N64 r2 = (X.N64) r2
            if (r2 == 0) goto L_0x00a2
            boolean r5 = r2.A09
        L_0x00a2:
            java.lang.String r19 = X.DbT.A0y(r9)
            com.instagram.direct.model.thread.CreatorBroadcastThreadInfo r1 = r9.A04
            if (r1 == 0) goto L_0x00ec
            com.instagram.common.typedurl.ImageUrl r10 = r1.A02
            if (r10 == 0) goto L_0x00ec
            if (r4 == 0) goto L_0x00f4
        L_0x00b0:
            java.lang.Object r4 = r4.A01
            com.instagram.common.typedurl.ImageUrl r4 = (com.instagram.common.typedurl.ImageUrl) r4
        L_0x00b4:
            java.lang.String r2 = r11.A0C
            boolean r1 = r11.A0b
            int r11 = r9.A01
            java.lang.Integer r18 = java.lang.Integer.valueOf(r11)
            java.lang.Object r11 = r7.getValue()
            int r11 = X.DbS.A05(r11)
            int r24 = r24 + r11
            java.lang.String r22 = r9.A07()
            com.instagram.direct.model.thread.DiscoverableThreadInfo r9 = r9.A06
            if (r9 == 0) goto L_0x00d2
            java.lang.String r0 = r9.A00
        L_0x00d2:
            X.N64 r15 = new X.N64
            r20 = r6
            r21 = r2
            r23 = r0
            r25 = r1
            r26 = r5
            r16 = r10
            r17 = r4
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r8.add(r15)
        L_0x00e8:
            r24 = r13
            goto L_0x001e
        L_0x00ec:
            if (r4 == 0) goto L_0x00f3
            java.lang.Object r10 = r4.A00
            com.instagram.common.typedurl.ImageUrl r10 = (com.instagram.common.typedurl.ImageUrl) r10
            goto L_0x00b0
        L_0x00f3:
            r10 = r0
        L_0x00f4:
            r4 = r0
            goto L_0x00b4
        L_0x00f6:
            r2 = r0
            goto L_0x009c
        L_0x00f8:
            r1 = r0
            goto L_0x006e
        L_0x00fb:
            r4 = r0
            goto L_0x0072
        L_0x00fe:
            r7.Epw(r8)
            boolean r0 = r3.A03
            if (r0 != 0) goto L_0x0123
            java.lang.Object r0 = r7.getValue()
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r2 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0123
            X.0eM r0 = r3.A06
            java.lang.Object r1 = r0.getValue()
            X.Odl r1 = (X.C71140Odl) r1
            java.lang.String r0 = "inbox_directory_sheet"
            r1.A0B(r0)
            r3.A03 = r2
        L_0x0123:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.channels.discovery.suggestions.ChannelDirectoryInboxViewModel.A06(com.instagram.direct.fragment.channels.discovery.suggestions.ChannelDirectoryInboxViewModel):void");
    }

    public final void onCleared() {
        if (this.A09) {
            AnonymousClass1Nd.A00(this.A04).A02(this.A0A, C70222Kg.class);
        }
    }

    public final void A0D() {
        super.A0D();
        if (this.A09) {
            A06(this);
            return;
        }
        AnonymousClass4D7 A0t = C51975G9x.A0t(this.A01);
        this.A01 = 1Eo.A04(DbX.A0c(AnonymousClass12T.A00), new MFR(this, A0t, 43), C318116oQ.A00(this));
    }

    public final void A0E(String str) {
        super.A0E(str);
        if (!this.A09) {
            AnonymousClass4D7 A0t = C51975G9x.A0t(this.A01);
            this.A01 = 1Eo.A04(DbX.A0c(AnonymousClass12T.A00), new MFR(this, A0t, 45), C318116oQ.A00(this));
        }
        this.A06.add(str);
    }
}
