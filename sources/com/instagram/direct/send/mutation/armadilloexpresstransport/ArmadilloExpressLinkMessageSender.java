package com.instagram.direct.send.mutation.armadilloexpresstransport;

import X.0Tu;
import X.0eO;
import X.0qQ;
import X.182;
import X.1a8;
import X.1aJ;
import X.1aP;
import X.1aU;
import X.1cX;
import X.AnonymousClass000;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass436;
import X.AnonymousClass7TE;
import X.C2612848z;
import X.C269794fh;
import X.C278354wk;
import X.C318146oT;
import X.C318206oZ;
import X.C51966G9m;
import X.C60340gF;
import X.C66580MXl;
import X.C66581MXm;
import X.C66582MXn;
import X.C66789Mca;
import X.C68404NFl;
import X.C70174NyS;
import X.C70175NyT;
import X.C70176NyU;
import X.C70992OVn;
import X.C72993PSc;
import X.C73817PkG;
import X.C74097Pp0;
import X.C74551Pwk;
import X.N2L;
import X.OWT;
import X.Ov3;
import X.R4O;
import X.XQQ;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent;
import com.instagram.direct.armadilloexpress.transportpayload.Link;
import com.instagram.direct.armadilloexpress.transportpayload.LinkContext;
import com.instagram.direct.armadilloexpress.transportpayload.TransportPayload;
import com.instagram.direct.model.DirectForwardingParams;
import com.instagram.model.direct.DirectThreadKey;
import java.util.concurrent.TimeUnit;

public final class ArmadilloExpressLinkMessageSender {
    public final Context A00;
    public final UserSession A01;
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A00(0eO.A02, C73817PkG.A00);

    public ArmadilloExpressLinkMessageSender(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = C51966G9m.A0P(userSession);
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.4D7, X.ME1] */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.instagram.direct.model.DirectForwardingParams r10, X.N2L r11, com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressLinkMessageSender r12, X.1cX r13, X.AnonymousClass4D7 r14) {
        /*
            r9 = r13
            r7 = r10
            r3 = 6
            boolean r0 = X.ME1.A02(r3, r14)
            if (r0 == 0) goto L_0x009a
            r5 = r14
            X.ME1 r5 = (X.ME1) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x009a
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0017:
            java.lang.Object r2 = r5.A06
            X.1Hj r6 = X.1Hj.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x0068
            if (r0 != r3) goto L_0x00a1
            java.lang.Object r4 = r5.A05
            X.R4O r4 = (X.R4O) r4
            java.lang.Object r3 = r5.A04
            X.R4O r3 = (X.R4O) r3
            java.lang.Object r7 = r5.A03
            com.instagram.direct.model.DirectForwardingParams r7 = (com.instagram.direct.model.DirectForwardingParams) r7
            java.lang.Object r9 = r5.A02
            X.1cX r9 = (X.1cX) r9
            java.lang.Object r12 = r5.A01
            com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressLinkMessageSender r12 = (com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressLinkMessageSender) r12
            X.0eS.A00(r2)
        L_0x0039:
            com.instagram.direct.armadilloexpress.transportpayload.LinkContext r2 = (com.instagram.direct.armadilloexpress.transportpayload.LinkContext) r2
            X.R5b r1 = X.C66580MXl.A0L(r4)
            com.instagram.direct.armadilloexpress.transportpayload.Link r1 = (com.instagram.direct.armadilloexpress.transportpayload.Link) r1
            r2.getClass()
            r1.linkContext_ = r2
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            X.OVn r4 = X.C70992OVn.A00
            com.instagram.common.session.UserSession r5 = r12.A01
            X.NFl r2 = com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent.A00()
            com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent r1 = X.C66582MXn.A0Q(r2, r3)
            r0 = 3
            r1.addMessageContentCase_ = r0
            X.R5b r6 = X.C66580MXl.A0M(r2)
            com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent r6 = (com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent) r6
            X.OCA r8 = r9.A03
            com.instagram.direct.armadilloexpress.transportpayload.TransportPayload r0 = r4.A01(r5, r6, r7, r8, r9)
            return r0
        L_0x0068:
            X.0eS.A00(r2)
            com.instagram.direct.armadilloexpress.transportpayload.Link r0 = com.instagram.direct.armadilloexpress.transportpayload.Link.DEFAULT_INSTANCE
            X.R4O r4 = r0.A0I()
            X.9Iu r0 = r13.A00
            java.lang.String r2 = r0.A01
            if (r2 == 0) goto L_0x00a6
            X.R5b r1 = X.C66580MXl.A0L(r4)
            com.instagram.direct.armadilloexpress.transportpayload.Link r1 = (com.instagram.direct.armadilloexpress.transportpayload.Link) r1
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.text_ = r2
            r5.A01 = r12
            r5.A02 = r13
            r5.A03 = r10
            r5.A04 = r4
            r5.A05 = r4
            r5.A00 = r3
            java.lang.Object r2 = A02(r11, r12, r5)
            if (r2 != r6) goto L_0x0098
            return r6
        L_0x0098:
            r3 = r4
            goto L_0x0039
        L_0x009a:
            X.ME1 r5 = new X.ME1
            r5.<init>(r12, r14, r3)
            goto L_0x0017
        L_0x00a1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00a6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressLinkMessageSender.A01(com.instagram.direct.model.DirectForwardingParams, X.N2L, com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressLinkMessageSender, X.1cX, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00df, code lost:
        if (r4 != null) goto L_0x00e1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(com.instagram.direct.model.DirectForwardingParams r11, X.C278354wk r12, X.C74551Pwk r13, X.N2L r14, com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressLinkMessageSender r15, X.1cX r16) {
        /*
            r10 = r11
            r7 = r13
            r11 = r14
            r8 = r15
            r9 = r16
            if (r14 == 0) goto L_0x001c
            X.0eM r0 = r15.A02
            java.lang.Object r0 = r0.getValue()
            X.4Cq r0 = (X.C262224Cq) r0
            r12 = 0
            r13 = 36
            X.JUk r6 = new X.JUk
            r6.<init>((java.lang.Object) r7, (java.lang.Object) r8, (java.lang.Object) r9, (java.lang.Object) r10, (java.lang.Object) r11, (X.AnonymousClass4D7) r12, (int) r13)
            X.AnonymousClass7TE.A1Z(r6, r0)
            return
        L_0x001c:
            com.instagram.direct.armadilloexpress.transportpayload.Link r0 = com.instagram.direct.armadilloexpress.transportpayload.Link.DEFAULT_INSTANCE
            X.R4O r3 = r0.A0I()
            X.9Iu r0 = r9.A00
            java.lang.String r2 = r0.A01
            if (r2 == 0) goto L_0x0143
            X.R5b r1 = X.C66580MXl.A0L(r3)
            com.instagram.direct.armadilloexpress.transportpayload.Link r1 = (com.instagram.direct.armadilloexpress.transportpayload.Link) r1
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.text_ = r2
            if (r12 == 0) goto L_0x011e
            com.instagram.direct.armadilloexpress.transportpayload.LinkContext r0 = com.instagram.direct.armadilloexpress.transportpayload.LinkContext.DEFAULT_INSTANCE
            X.R4O r6 = r0.A0I()
            java.lang.String r2 = r12.A05
            com.instagram.direct.armadilloexpress.transportpayload.LinkContext r1 = A00(r6)
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r1.linkUrl_ = r2
            java.lang.String r2 = r12.A04
            if (r2 == 0) goto L_0x005f
            com.instagram.direct.armadilloexpress.transportpayload.LinkContext r1 = A00(r6)
            int r0 = r1.bitField0_
            r0 = r0 | 8
            r1.bitField0_ = r0
            r1.linkSummary_ = r2
        L_0x005f:
            java.lang.String r2 = r12.A03
            if (r2 == 0) goto L_0x006f
            com.instagram.direct.armadilloexpress.transportpayload.LinkContext r1 = A00(r6)
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.linkPreviewTitle_ = r2
        L_0x006f:
            com.instagram.common.typedurl.ImageUrl r5 = r12.A00
            if (r5 == 0) goto L_0x00c7
            com.instagram.direct.armadilloexpress.transportpayload.ImageUrl r0 = com.instagram.direct.armadilloexpress.transportpayload.ImageUrl.DEFAULT_INSTANCE
            X.R4O r4 = r0.A0I()
            java.lang.String r2 = r5.getUrl()
            X.R5b r1 = X.C66580MXl.A0L(r4)
            com.instagram.direct.armadilloexpress.transportpayload.ImageUrl r1 = (com.instagram.direct.armadilloexpress.transportpayload.ImageUrl) r1
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.url_ = r2
            int r2 = r5.getWidth()
            X.R5b r1 = X.C66580MXl.A0L(r4)
            com.instagram.direct.armadilloexpress.transportpayload.ImageUrl r1 = (com.instagram.direct.armadilloexpress.transportpayload.ImageUrl) r1
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.width_ = r2
            int r2 = r5.getHeight()
            X.R5b r1 = X.C66580MXl.A0L(r4)
            com.instagram.direct.armadilloexpress.transportpayload.ImageUrl r1 = (com.instagram.direct.armadilloexpress.transportpayload.ImageUrl) r1
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r1.height_ = r2
            com.instagram.direct.armadilloexpress.transportpayload.LinkContext r1 = A00(r6)
            X.R5b r0 = r4.A02()
            com.instagram.direct.armadilloexpress.transportpayload.ImageUrl r0 = (com.instagram.direct.armadilloexpress.transportpayload.ImageUrl) r0
            r0.getClass()
            r1.linkImageUrl_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
        L_0x00c7:
            java.lang.String r2 = r12.A01
            if (r2 == 0) goto L_0x00d7
            com.instagram.direct.armadilloexpress.transportpayload.LinkContext r1 = A00(r6)
            int r0 = r1.bitField0_
            r0 = r0 | 16
            r1.bitField0_ = r0
            r1.linkMusicPreviewUrl_ = r2
        L_0x00d7:
            java.util.List r0 = r12.A06
            if (r0 == 0) goto L_0x013e
            com.google.common.collect.ImmutableList r4 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)
            if (r4 == 0) goto L_0x00f7
        L_0x00e1:
            com.instagram.direct.armadilloexpress.transportpayload.LinkContext r2 = A00(r6)
            X.TnY r1 = r2.linkMusicPreviewCountriesAllowed_
            r0 = r1
            X.TRv r0 = (X.C13255TRv) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x00f4
            X.TnY r1 = X.R5b.A06(r1)
            r2.linkMusicPreviewCountriesAllowed_ = r1
        L_0x00f4:
            X.T5K.A00(r4, r1)
        L_0x00f7:
            java.lang.String r2 = r12.A02
            if (r2 == 0) goto L_0x0107
            com.instagram.direct.armadilloexpress.transportpayload.LinkContext r1 = A00(r6)
            int r0 = r1.bitField0_
            r0 = r0 | 64
            r1.bitField0_ = r0
            r1.linkPreviewBody_ = r2
        L_0x0107:
            X.R5b r0 = X.C66580MXl.A0M(r6)
            com.instagram.direct.armadilloexpress.transportpayload.LinkContext r0 = (com.instagram.direct.armadilloexpress.transportpayload.LinkContext) r0
            X.R5b r1 = X.C66580MXl.A0L(r3)
            com.instagram.direct.armadilloexpress.transportpayload.Link r1 = (com.instagram.direct.armadilloexpress.transportpayload.Link) r1
            r0.getClass()
            r1.linkContext_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
        L_0x011e:
            X.OVn r11 = X.C70992OVn.A00
            com.instagram.common.session.UserSession r12 = r15.A01
            X.NFl r2 = com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent.A00()
            com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent r1 = X.C66582MXn.A0Q(r2, r3)
            r0 = 3
            r1.addMessageContentCase_ = r0
            X.R5b r13 = X.C66580MXl.A0M(r2)
            com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent r13 = (com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent) r13
            X.OCA r15 = r9.A03
            r14 = r10
            com.instagram.direct.armadilloexpress.transportpayload.TransportPayload r0 = r11.A01(r12, r13, r14, r15, r16)
            A03(r0, r7, r8, r9)
            return
        L_0x013e:
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            goto L_0x00e1
        L_0x0143:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressLinkMessageSender.A04(com.instagram.direct.model.DirectForwardingParams, X.4wk, X.Pwk, X.N2L, com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressLinkMessageSender, X.1cX):void");
    }

    public final void A05(DirectForwardingParams directForwardingParams, C74551Pwk pwk, 1cX r13) {
        0qQ.A0B(pwk, 1);
        R4O A0I = Link.DEFAULT_INSTANCE.A0I();
        1cX r9 = r13;
        String str = r13.A00.A01;
        if (str != null) {
            Link link = (Link) C66580MXl.A0L(A0I);
            link.bitField0_ |= 1;
            link.text_ = str;
            C70992OVn oVn = C70992OVn.A00;
            UserSession userSession = this.A01;
            C68404NFl A002 = AddMessageContent.A00();
            C66582MXn.A0Q(A002, A0I).addMessageContentCase_ = 3;
            TransportPayload A012 = oVn.A01(userSession, (AddMessageContent) C66580MXl.A0M(A002), directForwardingParams, r13.A03, r9);
            1cX ACS = r13.ACS();
            if (ACS != null) {
                A03(A012, pwk, this, ACS);
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void A06(DirectForwardingParams directForwardingParams, C74551Pwk pwk, 1cX r15) {
        C269794fh A0O;
        UserSession userSession = this.A01;
        1cX r11 = r15;
        DirectForwardingParams directForwardingParams2 = directForwardingParams;
        C74551Pwk pwk2 = pwk;
        if (C70176NyU.A00(userSession).A05((DirectThreadKey) C66582MXn.A0q(r15), AnonymousClass000.A00(1797))) {
            C278354wk r1 = (C278354wk) r15.A00.A00;
            if (r1 != null) {
                A04(directForwardingParams, r1, pwk, (N2L) null, this, r15);
                return;
            }
            OWT A002 = C70174NyS.A00(this.A00, userSession);
            String str = r15.A00.A01;
            if (str != null) {
                N2L A003 = A002.A00(str);
                if (A003 != null) {
                    A04(directForwardingParams, (C278354wk) null, pwk, A003, this, r15);
                    return;
                }
                String str2 = r15.A00.A01;
                if (str2 != null) {
                    1a8 A0P = C66581MXm.A0P();
                    if (182.A06(0Tu.A05, userSession, 36328001620884321L)) {
                        A0O = C318146oT.A00;
                    } else {
                        A0O = C66582MXn.A0O(userSession, AnonymousClass436.A00);
                    }
                    1aU A0H = C66789Mca.A00(A002.A01.A0T(C60340gF.A00).A0L(new Ov3(str2, A002, 7)), C74097Pp0.A00, 14).A0H();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    C269794fh r12 = C318146oT.A00;
                    1aU A09 = 1aU.A09(C2612848z.A00);
                    1aJ r4 = A0H.A00;
                    C318206oZ r3 = r12.A00;
                    1aJ r2 = A09.A00;
                    1aP.A01(r2, "other is null");
                    1aP.A01(r3, "scheduler is null");
                    A0P.A02(new 1aU(new XQQ(r4, r2, r3, timeUnit)).A0P(A0O), new C72993PSc(4, A0P, pwk2, this, directForwardingParams2, r11));
                    return;
                }
                throw AnonymousClass7TE.A0y();
            }
            throw AnonymousClass7TE.A0y();
        }
        A05(directForwardingParams, pwk, r15);
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.MDx, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(X.N2L r15, com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressLinkMessageSender r16, X.AnonymousClass4D7 r17) {
        /*
            r4 = 24
            r5 = r17
            boolean r0 = X.C66145MDx.A02(r4, r5)
            r9 = r16
            if (r0 == 0) goto L_0x0106
            r3 = r5
            X.MDx r3 = (X.C66145MDx) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0106
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x001a:
            java.lang.Object r11 = r3.A03
            X.1Hj r2 = X.1Hj.A02
            int r0 = r3.A00
            r8 = 1
            if (r0 == 0) goto L_0x006b
            if (r0 != r8) goto L_0x010d
            java.lang.Object r1 = r3.A02
            X.R4O r1 = (X.R4O) r1
            java.lang.Object r15 = r3.A01
            X.N2L r15 = (X.N2L) r15
            X.0eS.A00(r11)
        L_0x0030:
            java.lang.String r11 = (java.lang.String) r11
            if (r11 == 0) goto L_0x0066
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r3 = X.C66834MdS.A03(r11)
            if (r3 == 0) goto L_0x0066
            com.instagram.direct.armadilloexpress.transportpayload.Thumbnail r0 = com.instagram.direct.armadilloexpress.transportpayload.Thumbnail.DEFAULT_INSTANCE
            X.R4O r2 = r0.A0I()
            X.NFr r2 = (X.C68410NFr) r2
            r2.A08(r3)
            int r0 = r15.A01
            r2.A07(r0)
            int r0 = r15.A00
            r2.A06(r0)
            com.instagram.direct.armadilloexpress.transportpayload.LinkContext r3 = A00(r1)
            X.R5b r2 = r2.A02()
            com.instagram.direct.armadilloexpress.transportpayload.Thumbnail r2 = (com.instagram.direct.armadilloexpress.transportpayload.Thumbnail) r2
            int r0 = com.instagram.direct.armadilloexpress.transportpayload.LinkContext.LINK_IMAGE_URL_FIELD_NUMBER
            r2.getClass()
            r3.linkPreviewThumbnail_ = r2
            int r0 = r3.bitField0_
            r0 = r0 | 32
            r3.bitField0_ = r0
        L_0x0066:
            X.R5b r0 = X.C66580MXl.A0M(r1)
            return r0
        L_0x006b:
            X.0eS.A00(r11)
            com.instagram.direct.armadilloexpress.transportpayload.LinkContext r0 = com.instagram.direct.armadilloexpress.transportpayload.LinkContext.DEFAULT_INSTANCE
            X.R4O r1 = r0.A0I()
            java.lang.String r5 = r15.A03
            com.instagram.direct.armadilloexpress.transportpayload.LinkContext r4 = A00(r1)
            r5.getClass()
            int r0 = r4.bitField0_
            r0 = r0 | 4
            r4.bitField0_ = r0
            r4.linkUrl_ = r5
            java.lang.String r5 = r15.A07
            if (r5 == 0) goto L_0x0095
            com.instagram.direct.armadilloexpress.transportpayload.LinkContext r4 = A00(r1)
            int r0 = r4.bitField0_
            r0 = r0 | 2
            r4.bitField0_ = r0
            r4.linkPreviewTitle_ = r5
        L_0x0095:
            java.lang.String r5 = r15.A06
            if (r5 == 0) goto L_0x00a5
            com.instagram.direct.armadilloexpress.transportpayload.LinkContext r4 = A00(r1)
            int r0 = r4.bitField0_
            r0 = r0 | 8
            r4.bitField0_ = r0
            r4.linkSummary_ = r5
        L_0x00a5:
            java.lang.String r5 = r15.A02
            if (r5 == 0) goto L_0x00b5
            com.instagram.direct.armadilloexpress.transportpayload.LinkContext r4 = A00(r1)
            int r0 = r4.bitField0_
            r0 = r0 | 16
            r4.bitField0_ = r0
            r4.linkMusicPreviewUrl_ = r5
        L_0x00b5:
            java.util.List r0 = r15.A08
            if (r0 == 0) goto L_0x00e1
            java.util.Iterator r7 = r0.iterator()
        L_0x00bd:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00e1
            java.lang.Object r6 = r7.next()
            com.instagram.direct.armadilloexpress.transportpayload.LinkContext r5 = A00(r1)
            r6.getClass()
            X.TnY r4 = r5.linkMusicPreviewCountriesAllowed_
            r0 = r4
            X.TRv r0 = (X.C13255TRv) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x00dd
            X.TnY r4 = X.R5b.A06(r4)
            r5.linkMusicPreviewCountriesAllowed_ = r4
        L_0x00dd:
            r4.add(r6)
            goto L_0x00bd
        L_0x00e1:
            X.C66145MDx.A00(r15, r1, r3, r8)
            byte[] r10 = r15.A09
            r0 = 0
            X.0qQ.A0B(r10, r0)
            byte[] r0 = X.OWT.A06
            boolean r0 = X.AnonymousClass7TF.A1W(r10, r0)
            r0 = r0 ^ 1
            r11 = 0
            if (r0 == 0) goto L_0x0030
            int r12 = r15.A01
            int r13 = r15.A00
            r14 = 3
            X.MGm r8 = new X.MGm
            r8.<init>(r9, r10, r11, r12, r13, r14)
            java.lang.Object r11 = X.19E.A00(r3, r8)
            if (r11 != r2) goto L_0x0030
            return r2
        L_0x0106:
            X.MDx r3 = new X.MDx
            r3.<init>(r9, r5, r4)
            goto L_0x001a
        L_0x010d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressLinkMessageSender.A02(X.N2L, com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressLinkMessageSender, X.4D7):java.lang.Object");
    }

    public static final void A03(TransportPayload transportPayload, C74551Pwk pwk, ArmadilloExpressLinkMessageSender armadilloExpressLinkMessageSender, 1cX r9) {
        C70175NyT.A00(armadilloExpressLinkMessageSender.A01).A02(transportPayload, pwk, r9, (DirectThreadKey) C66582MXn.A0q(r9), 7);
    }

    public static LinkContext A00(R4O r4o) {
        r4o.A04();
        return (LinkContext) r4o.A00;
    }
}
