package com.instagram.direct.fragment.channels.discovery.base;

import X.05G;
import X.0Tu;
import X.0eO;
import X.0qQ;
import X.0sn;
import X.106;
import X.182;
import X.1Eo;
import X.2YL;
import X.AnonymousClass0Ud;
import X.AnonymousClass0eM;
import X.AnonymousClass12T;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C232262tL;
import X.C262204Co;
import X.C318116oQ;
import X.C51966G9m;
import X.C51970G9q;
import X.C62510Kh0;
import X.C69263NiP;
import X.C69374NkE;
import X.C73568Pfp;
import X.DbS;
import X.DbX;
import X.Dba;
import X.JTO;
import X.MFR;
import X.N64;
import X.NVO;
import X.NVP;
import X.NVR;
import X.OBQ;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.fragment.channels.discovery.suggestions.ChannelDirectoryInboxViewModel;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;

public abstract class ChannelDiscoveryViewModel extends 2YL {
    public boolean A00;
    public boolean A01;
    public boolean A02 = true;
    public C262204Co A03;
    public final UserSession A04;
    public final C69263NiP A05;
    public final AnonymousClass0eM A06 = Dba.A0g(this, 0eO.A02, 47);
    public final 05G A07 = DbS.A10(C62510Kh0.INITIAL_LOAD);
    public final 05G A08 = JTO.A1J();
    public final boolean A09;
    public final 05G A0A = 106.A01((Object) null);

    public ChannelDiscoveryViewModel(UserSession userSession, C69263NiP niP, boolean z) {
        this.A04 = userSession;
        this.A05 = niP;
        this.A09 = z;
    }

    public static final N64 A00(N64 n64) {
        String str = n64.A08;
        ImageUrl imageUrl = n64.A02;
        ImageUrl imageUrl2 = n64.A01;
        String str2 = n64.A07;
        String str3 = n64.A04;
        boolean z = n64.A0A;
        return new N64(imageUrl, imageUrl2, n64.A03, str, str2, str3, n64.A05, n64.A06, n64.A00, z, false);
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.MDx, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01f4, code lost:
        if (r1 != null) goto L_0x01c2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.instagram.direct.fragment.channels.discovery.base.ChannelDiscoveryViewModel r30, X.C69374NkE r31, X.AnonymousClass4D7 r32) {
        /*
            r0 = r30
            r4 = r31
            r9 = 13
            r6 = r32
            boolean r1 = X.C66145MDx.A02(r9, r6)
            if (r1 == 0) goto L_0x0194
            r3 = r6
            X.MDx r3 = (X.C66145MDx) r3
            int r5 = r3.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r5 & r2
            if (r1 == 0) goto L_0x0194
            int r5 = r5 - r2
            r3.A00 = r5
        L_0x001c:
            java.lang.Object r2 = r3.A03
            X.1Hj r5 = X.1Hj.A02
            int r1 = r3.A00
            r6 = 1
            r13 = 0
            if (r1 == 0) goto L_0x0114
            if (r1 != r6) goto L_0x01fc
            java.lang.Object r4 = r3.A02
            X.NkE r4 = (X.C69374NkE) r4
            java.lang.Object r0 = r3.A01
            com.instagram.direct.fragment.channels.discovery.base.ChannelDiscoveryViewModel r0 = (com.instagram.direct.fragment.channels.discovery.base.ChannelDiscoveryViewModel) r0
            X.0eS.A00(r2)
        L_0x0033:
            r5 = r2
            X.3Ii r5 = (X.C239803Ii) r5
            boolean r1 = r5 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x019b
            X.3lr r1 = X.C41846B3n.A0R(r5)
            if (r1 == 0) goto L_0x01a4
            java.lang.Class<X.Bh7> r5 = X.C42710Bh7.class
            java.lang.String r3 = "xfb_igd_channel_directory(data:$data)"
            r2 = 811088590(0x30583ace, float:7.866391E-10)
            X.3lr r7 = r1.A03(r5, r3, r2)
            if (r7 == 0) goto L_0x01a4
            java.lang.Class<X.Bh6> r5 = X.C42709Bh6.class
            r12 = 0
            java.lang.String r3 = "channels_directory_info"
            r2 = -791629481(0xffffffffd0d0b157, float:-2.80102646E10)
            com.google.common.collect.ImmutableList r2 = r7.getRequiredCompactedTreeListField(r12, r3, r5, r2)
            if (r2 == 0) goto L_0x01a4
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            r5 = 0
            java.util.Iterator r15 = r2.iterator()
        L_0x0064:
            boolean r2 = r15.hasNext()
            if (r2 == 0) goto L_0x01a5
            java.lang.Object r2 = r15.next()
            int r14 = r5 + 1
            if (r5 >= 0) goto L_0x007a
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x007a:
            X.3lr r2 = (X.C250663lr) r2
            java.lang.String r7 = "thread_igid"
            java.lang.String r11 = r2.getOptionalStringField(r12, r7)
            java.lang.String r32 = ""
            if (r11 != 0) goto L_0x0088
            r11 = r32
        L_0x0088:
            java.lang.String r7 = "title"
            java.lang.String r7 = r2.getOptionalStringField(r6, r7)
            if (r7 == 0) goto L_0x0092
            r32 = r7
        L_0x0092:
            r10 = 14
            X.0qQ.A0B(r11, r10)
            java.lang.String r7 = "subtitle"
            java.lang.String r30 = r2.A09(r7)
            java.lang.String r7 = "invite_link"
            java.lang.String r27 = r2.A0A(r7)
            java.lang.String r7 = "group_image_uri"
            java.lang.String r26 = r2.A0B(r7)
            java.lang.String r7 = "group_image_background_uri"
            java.lang.String r25 = r2.A0C(r7)
            r8 = 6
            java.lang.String r7 = "thread_subtype"
            int r7 = r2.getCoercedIntField(r8, r7)
            java.lang.Integer r22 = X.JTO.A0w(r7)
            r8 = 7
            java.lang.String r7 = "number_of_members"
            int r7 = r2.getCoercedIntField(r8, r7)
            java.lang.Integer r21 = X.JTO.A0w(r7)
            r8 = 8
            java.lang.String r7 = "is_member"
            java.lang.Boolean r19 = X.C41846B3n.A0d(r2, r7, r8)
            r8 = 9
            java.lang.String r7 = "creator_igid"
            java.lang.String r23 = r2.getOptionalStringField(r8, r7)
            r8 = 10
            java.lang.String r7 = "is_creator_verified"
            java.lang.Boolean r18 = X.C41846B3n.A0d(r2, r7, r8)
            r8 = 11
            java.lang.String r7 = "should_badge_channel"
            java.lang.Boolean r20 = X.C41846B3n.A0d(r2, r7, r8)
            r8 = 12
            java.lang.String r7 = "creator_username"
            java.lang.String r24 = r2.getOptionalStringField(r8, r7)
            r7 = 186(0xba, float:2.6E-43)
            java.lang.String r7 = X.C273654mx.A00(r7)
            java.lang.String r29 = r2.getOptionalStringField(r9, r7)
            java.lang.String r7 = "social_channel_invite_id"
            java.lang.String r28 = r2.getOptionalStringField(r10, r7)
            X.47n r2 = new X.47n
            r31 = r11
            r17 = r13
            r16 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            X.2tL r2 = r0.A07(r2, r4, r5)
            if (r2 == 0) goto L_0x0111
            r3.add(r2)
        L_0x0111:
            r5 = r14
            goto L_0x0064
        L_0x0114:
            X.0eS.A00(r2)
            com.instagram.common.session.UserSession r1 = r0.A04
            X.1vn r2 = X.1vm.A01(r1)
            X.2IS r8 = X.C41845B3m.A04()
            X.2IS r12 = X.C41845B3m.A04()
            X.0K0 r10 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r1 = 20
            java.lang.Integer r7 = X.JTO.A0w(r1)
            java.lang.String r1 = "thread_limit"
            X.0Df r10 = X.C41845B3m.A03(r10, r7, r1)
            java.lang.String r7 = r4.A02
            java.lang.String r1 = "surface_view"
            X.0Df.A00(r10, r7, r1)
            X.05G r11 = r0.A0A
            java.lang.Object r1 = r11.getValue()
            X.OBQ r1 = (X.OBQ) r1
            if (r1 == 0) goto L_0x0192
            java.lang.String r7 = r1.A01
        L_0x0146:
            java.lang.String r1 = "cursor_thread_id"
            X.0Df.A00(r10, r7, r1)
            java.lang.Object r1 = r11.getValue()
            X.OBQ r1 = (X.OBQ) r1
            if (r1 == 0) goto L_0x0190
            java.lang.Long r1 = r1.A00
            if (r1 == 0) goto L_0x0190
            java.lang.String r7 = r1.toString()
        L_0x015b:
            java.lang.String r1 = "cursor_timestamp_milliseconds"
            X.0Df.A00(r10, r7, r1)
            java.lang.String r1 = "data"
            X.1vR r15 = X.C41847B3o.A04(r10, r8, r1)
            java.util.Map r17 = r8.getParamsCopy()
            java.util.Map r18 = r12.getParamsCopy()
            java.lang.Class<X.Bh8> r19 = X.C42711Bh8.class
            java.util.ArrayList r25 = X.AnonymousClass7TE.A1C()
            java.lang.String r16 = "IGDChannelDirectory"
            r20 = 0
            java.lang.String r24 = "xfb_igd_channel_directory"
            com.facebook.pando.PandoGraphQLRequest r1 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r1
            r21 = r13
            r22 = r20
            r23 = r13
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            X.C66145MDx.A00(r0, r4, r3, r6)
            java.lang.Object r2 = r2.A04(r1, r3)
            if (r2 != r5) goto L_0x0033
            return r5
        L_0x0190:
            r7 = r13
            goto L_0x015b
        L_0x0192:
            r7 = r13
            goto L_0x0146
        L_0x0194:
            X.MDx r3 = new X.MDx
            r3.<init>(r0, r6, r9)
            goto L_0x001c
        L_0x019b:
            boolean r0 = r5 instanceof X.C297815sO
            if (r0 != 0) goto L_0x01e6
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x01a4:
            r3 = r13
        L_0x01a5:
            X.05G r7 = r0.A0A
            if (r1 == 0) goto L_0x01f3
            java.lang.Class<X.Bh7> r4 = X.C42710Bh7.class
            java.lang.String r2 = "xfb_igd_channel_directory(data:$data)"
            r0 = 811088590(0x30583ace, float:7.866391E-10)
            X.3lr r2 = r1.A03(r4, r2, r0)
            if (r2 == 0) goto L_0x01f3
            java.lang.String r0 = "cursor_timestamp_milliseconds"
            java.lang.String r0 = r2.A09(r0)
            if (r0 == 0) goto L_0x01f3
            java.lang.Long r5 = X.AnonymousClass7TE.A10(r0)
        L_0x01c2:
            java.lang.Class<X.Bh7> r4 = X.C42710Bh7.class
            java.lang.String r2 = "xfb_igd_channel_directory(data:$data)"
            r0 = 811088590(0x30583ace, float:7.866391E-10)
            X.3lr r1 = r1.A03(r4, r2, r0)
            if (r1 == 0) goto L_0x01d5
            java.lang.String r0 = "cursor_thread_id"
            java.lang.String r13 = r1.getOptionalStringField(r6, r0)
        L_0x01d5:
            X.OBQ r0 = new X.OBQ
            r0.<init>(r13, r5)
            r7.Epw(r0)
            if (r3 != 0) goto L_0x01e1
            X.0sn r3 = X.0sn.A00
        L_0x01e1:
            X.3Ih r5 = new X.3Ih
            r5.<init>(r3)
        L_0x01e6:
            boolean r0 = r5 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x01f2
            boolean r0 = r5 instanceof X.C297815sO
            if (r0 == 0) goto L_0x01f7
            X.5sO r5 = X.DbU.A0f()
        L_0x01f2:
            return r5
        L_0x01f3:
            r5 = r13
            if (r1 == 0) goto L_0x01d5
            goto L_0x01c2
        L_0x01f7:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x01fc:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.channels.discovery.base.ChannelDiscoveryViewModel.A01(com.instagram.direct.fragment.channels.discovery.base.ChannelDiscoveryViewModel, X.NkE, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [X.MDx, X.4D7] */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00cb, code lost:
        if (r0 == r6) goto L_0x00cd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(com.instagram.direct.fragment.channels.discovery.base.ChannelDiscoveryViewModel r10, X.C69374NkE r11, X.AnonymousClass4D7 r12) {
        /*
            r3 = 14
            boolean r0 = X.C66145MDx.A02(r3, r12)
            if (r0 == 0) goto L_0x00d0
            r8 = r12
            X.MDx r8 = (X.C66145MDx) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00d0
            int r2 = r2 - r1
            r8.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r8.A03
            X.1Hj r6 = X.1Hj.A02
            int r1 = r8.A00
            r9 = 1
            if (r1 == 0) goto L_0x009f
            if (r1 != r9) goto L_0x00dc
            java.lang.Object r11 = r8.A02
            X.NkE r11 = (X.C69374NkE) r11
            java.lang.Object r10 = r8.A01
            com.instagram.direct.fragment.channels.discovery.base.ChannelDiscoveryViewModel r10 = (com.instagram.direct.fragment.channels.discovery.base.ChannelDiscoveryViewModel) r10
            X.0eS.A00(r0)
        L_0x002c:
            r6 = r0
            X.3Ii r6 = (X.C239803Ii) r6
            boolean r0 = r6 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0074
            X.3Ih r6 = (X.C239793Ih) r6
            java.lang.Object r0 = r6.A00
            X.CE8 r0 = (X.CE8) r0
            X.PwF r5 = r0.A00
            if (r5 != 0) goto L_0x0045
            X.C41845B3m.A0v()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0045:
            r0 = r5
            X.N58 r0 = (X.N58) r0
            java.util.List r0 = r0.A02
            java.util.ArrayList r4 = X.AnonymousClass7TG.A0r(r0)
            r3 = 0
            java.util.Iterator r2 = r0.iterator()
        L_0x0053:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x007d
            java.lang.Object r0 = r2.next()
            int r1 = r3 + 1
            if (r3 >= 0) goto L_0x0069
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0069:
            X.47o r0 = (X.C2609247o) r0
            X.2tL r0 = r10.A07(r0, r11, r3)
            r4.add(r0)
            r3 = r1
            goto L_0x0053
        L_0x0074:
            boolean r0 = r6 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0092
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x007d:
            X.05G r3 = r10.A0A
            X.N58 r5 = (X.N58) r5
            java.lang.Long r2 = r5.A00
            java.lang.String r1 = r5.A01
            X.OBQ r0 = new X.OBQ
            r0.<init>(r1, r2)
            r3.Epw(r0)
            X.3Ih r6 = new X.3Ih
            r6.<init>(r4)
        L_0x0092:
            boolean r0 = r6 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x00cd
            boolean r0 = r6 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00d7
            X.5sO r6 = X.DbU.A0f()
            return r6
        L_0x009f:
            X.0eS.A00(r0)
            com.instagram.common.session.UserSession r7 = r10.A04
            r5 = 20
            int r4 = r11.A00
            X.05G r3 = r10.A0A
            java.lang.Object r1 = r3.getValue()
            X.OBQ r1 = (X.OBQ) r1
            r0 = 0
            if (r1 == 0) goto L_0x00ce
            java.lang.String r2 = r1.A01
        L_0x00b5:
            java.lang.Object r1 = r3.getValue()
            X.OBQ r1 = (X.OBQ) r1
            if (r1 == 0) goto L_0x00bf
            java.lang.Long r0 = r1.A00
        L_0x00bf:
            X.1OC r1 = com.instagram.direct.request.DirectThreadApi.A03(r7, r0, r2, r5, r4)
            X.C66145MDx.A00(r10, r11, r8, r9)
            r0 = -5
            java.lang.Object r0 = r1.A00(r0, r8)
            if (r0 != r6) goto L_0x002c
        L_0x00cd:
            return r6
        L_0x00ce:
            r2 = r0
            goto L_0x00b5
        L_0x00d0:
            X.MDx r8 = new X.MDx
            r8.<init>(r10, r12, r3)
            goto L_0x0016
        L_0x00d7:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00dc:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.channels.discovery.base.ChannelDiscoveryViewModel.A02(com.instagram.direct.fragment.channels.discovery.base.ChannelDiscoveryViewModel, X.NkE, X.4D7):java.lang.Object");
    }

    public static final Object A03(ChannelDiscoveryViewModel channelDiscoveryViewModel, AnonymousClass4D7 r6) {
        05G r3;
        if (channelDiscoveryViewModel instanceof NVR) {
            r3 = ((NVR) channelDiscoveryViewModel).A00;
        } else {
            r3 = ((NVO) channelDiscoveryViewModel).A00;
        }
        C69374NkE nkE = (C69374NkE) r3.getValue();
        C69263NiP niP = channelDiscoveryViewModel.A05;
        if (niP == C69263NiP.FEED && r3.getValue() == C69374NkE.A06) {
            nkE = C69374NkE.A08;
        }
        if (r3.getValue() == C69374NkE.A06 && channelDiscoveryViewModel.A01 && niP == C69263NiP.ACTIVITY_FEED) {
            nkE = C69374NkE.A07;
        }
        if (182.A06(0Tu.A05, channelDiscoveryViewModel.A04, 36319407398591869L)) {
            return A01(channelDiscoveryViewModel, nkE, r6);
        }
        return A02(channelDiscoveryViewModel, nkE, r6);
    }

    /* JADX WARNING: type inference failed for: r3v6, types: [X.N64] */
    /* JADX WARNING: type inference failed for: r3v11, types: [X.N64] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C232262tL A07(X.C2609247o r17, X.C69374NkE r18, int r19) {
        /*
            r16 = this;
            r2 = r16
            boolean r0 = r2 instanceof X.NVR
            r1 = r17
            r5 = r18
            if (r0 == 0) goto L_0x014d
            r0 = r2
            X.NVR r0 = (X.NVR) r0
            boolean r2 = r0 instanceof X.NVP
            if (r2 == 0) goto L_0x00b0
            X.NVP r0 = (X.NVP) r0
            r2 = 0
            X.0qQ.A0B(r1, r2)
            r2 = 1
            r4 = 2
            int r2 = X.DbU.A02(r5, r2)
            java.lang.String r3 = ""
            java.lang.String r7 = r1.getTitle()
            if (r2 != r4) goto L_0x006c
            java.lang.String r2 = r1.B9z()
            if (r2 != 0) goto L_0x002c
            r2 = r3
        L_0x002c:
            com.instagram.common.typedurl.SimpleImageUrl r4 = X.DbS.A0V(r2)
            r5 = 0
            java.lang.String r8 = r1.C6E()
            java.lang.String r9 = r1.Asi()
            if (r9 != 0) goto L_0x003c
            r9 = r3
        L_0x003c:
            java.lang.Boolean r2 = r1.CQt()
            boolean r13 = X.C51972G9s.A1Z(r2)
            java.lang.Boolean r2 = r1.Btz()
            boolean r14 = X.C51972G9s.A1Z(r2)
            java.lang.Integer r6 = r1.C6b()
            X.05G r0 = r0.A00
            java.lang.Object r0 = r0.getValue()
            int r12 = X.DbS.A05(r0)
            int r12 = r12 + r19
            java.lang.String r10 = r1.BIn()
            java.lang.String r11 = r1.BxL()
            X.N64 r3 = new X.N64
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x0069:
            X.2tL r3 = (X.C232262tL) r3
            return r3
        L_0x006c:
            java.lang.String r8 = r1.getSubtitle()
            if (r8 != 0) goto L_0x0073
            r8 = r3
        L_0x0073:
            java.lang.String r9 = r1.B9z()
            if (r9 != 0) goto L_0x007a
            r9 = r3
        L_0x007a:
            java.lang.String r10 = r1.C6E()
            java.lang.String r11 = r1.Asi()
            if (r11 != 0) goto L_0x0085
            r11 = r3
        L_0x0085:
            java.lang.String r12 = r1.BxX()
            java.lang.Integer r2 = r1.BXU()
            int r13 = X.DbX.A01(r2)
            java.lang.Boolean r2 = r1.CQt()
            boolean r15 = X.C51972G9s.A1Z(r2)
            java.lang.Integer r6 = r1.C6b()
            X.05G r0 = r0.A01
            java.lang.Object r0 = r0.getValue()
            int r14 = X.DbS.A05(r0)
            int r14 = r14 + r19
            X.N65 r3 = new X.N65
            r4 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x0069
        L_0x00b0:
            r2 = 0
            X.0qQ.A0B(r1, r2)
            r2 = 1
            r4 = 2
            int r2 = X.DbU.A02(r5, r2)
            java.lang.String r3 = ""
            java.lang.String r7 = r1.getTitle()
            if (r2 != r4) goto L_0x0109
            java.lang.String r2 = r1.B9z()
            if (r2 != 0) goto L_0x00c9
            r2 = r3
        L_0x00c9:
            com.instagram.common.typedurl.SimpleImageUrl r4 = X.DbS.A0V(r2)
            r5 = 0
            java.lang.String r8 = r1.C6E()
            java.lang.String r9 = r1.Asi()
            if (r9 != 0) goto L_0x00d9
            r9 = r3
        L_0x00d9:
            java.lang.Boolean r2 = r1.CQt()
            boolean r13 = X.C51972G9s.A1Z(r2)
            java.lang.Boolean r2 = r1.Btz()
            boolean r14 = X.C51972G9s.A1Z(r2)
            java.lang.Integer r6 = r1.C6b()
            X.05G r0 = r0.A08
            java.lang.Object r0 = r0.getValue()
            int r12 = X.DbS.A05(r0)
            int r12 = r12 + r19
            java.lang.String r10 = r1.BIn()
            java.lang.String r11 = r1.BxL()
            X.N64 r3 = new X.N64
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x0106:
            X.2tL r3 = (X.C232262tL) r3
            return r3
        L_0x0109:
            java.lang.String r8 = r1.getSubtitle()
            if (r8 != 0) goto L_0x0110
            r8 = r3
        L_0x0110:
            java.lang.String r9 = r1.B9z()
            if (r9 != 0) goto L_0x0117
            r9 = r3
        L_0x0117:
            java.lang.String r10 = r1.C6E()
            java.lang.String r11 = r1.Asi()
            if (r11 != 0) goto L_0x0122
            r11 = r3
        L_0x0122:
            java.lang.String r12 = r1.BxX()
            java.lang.Integer r2 = r1.BXU()
            int r13 = X.DbX.A01(r2)
            java.lang.Boolean r2 = r1.CQt()
            boolean r15 = X.C51972G9s.A1Z(r2)
            java.lang.Integer r6 = r1.C6b()
            X.05G r0 = r0.A08
            java.lang.Object r0 = r0.getValue()
            int r14 = X.DbS.A05(r0)
            int r14 = r14 + r19
            X.N65 r3 = new X.N65
            r4 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x0106
        L_0x014d:
            boolean r4 = X.AnonymousClass7TG.A1Z(r1, r5)
            java.lang.String r8 = r1.getTitle()
            java.lang.String r0 = r1.B9z()
            java.lang.String r3 = ""
            if (r0 != 0) goto L_0x015e
            r0 = r3
        L_0x015e:
            com.instagram.common.typedurl.SimpleImageUrl r5 = X.DbS.A0V(r0)
            java.lang.Integer r0 = r1.C6b()
            if (r0 == 0) goto L_0x01b7
            int r0 = r0.intValue()
            boolean r0 = X.AnonymousClass48O.A01(r0)
            if (r0 != r4) goto L_0x01b7
            java.lang.String r0 = r1.B9y()
            if (r0 != 0) goto L_0x0179
            r0 = r3
        L_0x0179:
            com.instagram.common.typedurl.SimpleImageUrl r6 = X.DbS.A0V(r0)
        L_0x017d:
            java.lang.String r9 = r1.C6E()
            java.lang.String r10 = r1.Asi()
            if (r10 != 0) goto L_0x0188
            r10 = r3
        L_0x0188:
            java.lang.Boolean r0 = r1.CQt()
            boolean r14 = X.C51972G9s.A1Z(r0)
            java.lang.Boolean r0 = r1.Btz()
            boolean r15 = X.C51972G9s.A1Z(r0)
            java.lang.Integer r7 = r1.C6b()
            X.05G r0 = r2.A08
            java.lang.Object r0 = r0.getValue()
            int r13 = X.DbS.A05(r0)
            int r13 = r13 + r19
            java.lang.String r11 = r1.BIn()
            java.lang.String r12 = r1.BxL()
            X.N64 r3 = new X.N64
            r4 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r3
        L_0x01b7:
            r6 = 0
            goto L_0x017d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.channels.discovery.base.ChannelDiscoveryViewModel.A07(X.47o, X.NkE, int):X.2tL");
    }

    public final 05G A08() {
        if (this instanceof ChannelDirectoryInboxViewModel) {
            05G r1 = ((ChannelDirectoryInboxViewModel) this).A07;
            0qQ.A0C(r1, "null cannot be cast to non-null type kotlinx.coroutines.flow.MutableStateFlow<kotlin.collections.List<com.instagram.common.recyclerview.model.RecyclerViewModel<*, *>>>");
            return r1;
        } else if (this instanceof NVP) {
            return ((NVP) this).A00;
        } else {
            return this.A08;
        }
    }

    public final AnonymousClass0Ud A09() {
        if (this instanceof ChannelDirectoryInboxViewModel) {
            return ((ChannelDirectoryInboxViewModel) this).A08;
        }
        if (this instanceof NVP) {
            return ((NVP) this).A02;
        }
        return ((NVO) this).A01;
    }

    public final void A0A() {
        05G r2 = this.A07;
        Object value = r2.getValue();
        C62510Kh0 kh0 = C62510Kh0.PAGINATION_LOAD;
        if (value != kh0 && A0C()) {
            r2.Epw(kh0);
            C51970G9q.A1S(this.A03);
            this.A03 = 1Eo.A04(DbX.A0c(AnonymousClass12T.A00), new MFR(this, (AnonymousClass4D7) null, 41), C318116oQ.A00(this));
        }
    }

    public final void A0B(String str) {
        if (this.A09) {
            05G A082 = A08();
            Iterable<Object> iterable = (Iterable) A082.getValue();
            ArrayList A0r = AnonymousClass7TG.A0r(iterable);
            for (Object obj : iterable) {
                if (obj instanceof N64) {
                    N64 n64 = (N64) obj;
                    if (0qQ.A0K(n64.A07, str)) {
                        obj = A00(n64);
                    }
                }
                A0r.add(obj);
            }
            A082.Epw(A0r);
        }
    }

    public final boolean A0C() {
        OBQ obq = (OBQ) this.A0A.getValue();
        if (obq != null) {
            if (obq.A01 == null) {
                return false;
            }
            Long l = obq.A00;
            if (l == null || l.longValue() != -1) {
                return true;
            }
            return false;
        }
        return true;
    }

    public void A0D() {
        this.A07.Epw(C62510Kh0.INITIAL_LOAD);
        this.A08.Epw(0sn.A00);
        this.A0A.Epw((Object) null);
        C262204Co r0 = this.A03;
        if (r0 != null) {
            r0.AG7((CancellationException) null);
        }
        this.A03 = C51966G9m.A1L(new C73568Pfp(this, (AnonymousClass4D7) null, 7), C318116oQ.A00(this));
    }

    public void A0E(String str) {
        05G A082 = A08();
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : (Iterable) A082.getValue()) {
            C232262tL r1 = (C232262tL) next;
            if (!(r1 instanceof N64) || !0qQ.A0K(((N64) r1).A07, str)) {
                A1C.add(next);
            }
        }
        A082.Epw(A1C);
    }
}
