package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent;
import com.instagram.direct.armadilloexpress.transportpayload.Media;
import com.instagram.direct.armadilloexpress.transportpayload.ReceiverFetchXma;
import com.instagram.direct.armadilloexpress.transportpayload.TransportPayload;
import com.instagram.direct.model.DirectForwardingParams;

/* renamed from: X.OVn  reason: case insensitive filesystem */
public final class C70992OVn {
    public static final C70992OVn A00 = new Object();

    public final TransportPayload A00(N1Z n1z, UserSession userSession, Media media, DirectForwardingParams directForwardingParams, 1bp r11, String str) {
        1bp r5 = r11;
        AnonymousClass7TG.A1O(n1z, r11);
        String A10 = DbT.A10(n1z.A00);
        R4O A0I = ReceiverFetchXma.DEFAULT_INSTANCE.A0I();
        ReceiverFetchXma receiverFetchXma = (ReceiverFetchXma) C66580MXl.A0L(A0I);
        receiverFetchXma.bitField0_ |= 1;
        receiverFetchXma.contentRef_ = A10;
        if (str != null) {
            ReceiverFetchXma receiverFetchXma2 = (ReceiverFetchXma) C66580MXl.A0L(A0I);
            receiverFetchXma2.bitField0_ |= 2;
            receiverFetchXma2.text_ = str;
        }
        if (media != null) {
            ReceiverFetchXma receiverFetchXma3 = (ReceiverFetchXma) C66580MXl.A0L(A0I);
            receiverFetchXma3.media_ = media;
            receiverFetchXma3.bitField0_ |= 4;
        }
        C68404NFl A002 = AddMessageContent.A00();
        C66582MXn.A0Q(A002, A0I).addMessageContentCase_ = 4;
        return A01(userSession, (AddMessageContent) C66580MXl.A0M(A002), directForwardingParams, (OCA) null, r5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0032, code lost:
        if (X.C308556Us.A0L(r14, r7, true) != false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0137, code lost:
        if (r2 != null) goto L_0x0139;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01ec, code lost:
        if (r1 != null) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002b, code lost:
        if (r2 != null) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002d, code lost:
        r12 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.instagram.direct.armadilloexpress.transportpayload.TransportPayload A01(com.instagram.common.session.UserSession r14, com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent r15, com.instagram.direct.model.DirectForwardingParams r16, X.OCA r17, X.1bp r18) {
        /*
            r13 = this;
            r1 = 0
            r5 = 1
            X.0qQ.A0B(r15, r5)
            r3 = r18
            java.util.List r0 = r3.C6L()
            X.0qQ.A07(r0)
            java.lang.Object r0 = X.00k.A0O(r0, r1)
            com.instagram.model.direct.DirectThreadKey r0 = (com.instagram.model.direct.DirectThreadKey) r0
            r7 = 0
            if (r0 == 0) goto L_0x01f0
            X.3U9 r1 = X.C66582MXn.A0a(r14, r0)
        L_0x001b:
            X.MaY r0 = r3.A02
            X.ODs r2 = r0.A00
            if (r2 != 0) goto L_0x01ec
            if (r1 == 0) goto L_0x01e9
            X.ODs r2 = r1.B25()
        L_0x0027:
            X.3Tu r7 = r1.AiM()
            if (r2 == 0) goto L_0x0034
        L_0x002d:
            boolean r0 = X.C308556Us.A0L(r14, r7, r5)
            r12 = 1
            if (r0 != 0) goto L_0x0035
        L_0x0034:
            r12 = 0
        L_0x0035:
            r4 = r2
            com.instagram.direct.armadilloexpress.transportpayload.AddMessageMetadata r0 = com.instagram.direct.armadilloexpress.transportpayload.AddMessageMetadata.DEFAULT_INSTANCE
            X.R4O r11 = r0.A0I()
            X.0qQ.A07(r11)
            X.MaY r0 = r3.A02
            boolean r0 = r0.A0A
            if (r0 == 0) goto L_0x0053
            X.R5b r1 = X.C66580MXl.A0L(r11)
            com.instagram.direct.armadilloexpress.transportpayload.AddMessageMetadata r1 = (com.instagram.direct.armadilloexpress.transportpayload.AddMessageMetadata) r1
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.sendSilently_ = r5
        L_0x0053:
            r9 = r17
            if (r17 == 0) goto L_0x009d
            com.instagram.direct.armadilloexpress.transportpayload.PrivateReplyInfo r0 = com.instagram.direct.armadilloexpress.transportpayload.PrivateReplyInfo.DEFAULT_INSTANCE
            X.R4O r8 = r0.A0I()
            X.0qQ.A07(r8)
            java.lang.String r6 = r9.A00
            X.R5b r1 = X.C66580MXl.A0L(r8)
            com.instagram.direct.armadilloexpress.transportpayload.PrivateReplyInfo r1 = (com.instagram.direct.armadilloexpress.transportpayload.PrivateReplyInfo) r1
            r6.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.commentId_ = r6
            java.lang.String r6 = r9.A01
            X.R5b r1 = X.C66580MXl.A0L(r8)
            com.instagram.direct.armadilloexpress.transportpayload.PrivateReplyInfo r1 = (com.instagram.direct.armadilloexpress.transportpayload.PrivateReplyInfo) r1
            r6.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.postLink_ = r6
            X.R5b r1 = X.C66580MXl.A0L(r11)
            com.instagram.direct.armadilloexpress.transportpayload.AddMessageMetadata r1 = (com.instagram.direct.armadilloexpress.transportpayload.AddMessageMetadata) r1
            X.R5b r0 = r8.A02()
            com.instagram.direct.armadilloexpress.transportpayload.PrivateReplyInfo r0 = (com.instagram.direct.armadilloexpress.transportpayload.PrivateReplyInfo) r0
            r0.getClass()
            r1.privateReplyInfo_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
        L_0x009d:
            X.3tI r0 = r3.A03()
            if (r0 == 0) goto L_0x00fe
            java.lang.String r10 = r0.A0T
            java.lang.String r6 = r0.A0R
            java.lang.String r8 = r0.A0S
            if (r10 == 0) goto L_0x00fe
            if (r6 == 0) goto L_0x00fe
            com.instagram.direct.armadilloexpress.transportpayload.RepliedToMessage r0 = com.instagram.direct.armadilloexpress.transportpayload.RepliedToMessage.DEFAULT_INSTANCE
            X.R4O r9 = r0.A0I()
            X.R5b r1 = X.C66580MXl.A0L(r9)
            com.instagram.direct.armadilloexpress.transportpayload.RepliedToMessage r1 = (com.instagram.direct.armadilloexpress.transportpayload.RepliedToMessage) r1
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.repliedToMessageOtid_ = r6
            long r0 = X.C2611348j.A00(r10)
            java.lang.String r6 = java.lang.String.valueOf(r0)
            X.R5b r1 = X.C66580MXl.A0L(r9)
            com.instagram.direct.armadilloexpress.transportpayload.RepliedToMessage r1 = (com.instagram.direct.armadilloexpress.transportpayload.RepliedToMessage) r1
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.repliedToMessageWaServerTimeSec_ = r6
            if (r8 == 0) goto L_0x00e7
            X.R5b r1 = X.C66580MXl.A0L(r9)
            com.instagram.direct.armadilloexpress.transportpayload.RepliedToMessage r1 = (com.instagram.direct.armadilloexpress.transportpayload.RepliedToMessage) r1
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r1.repliedToMessageCollectionItemId_ = r8
        L_0x00e7:
            X.R5b r1 = X.C66580MXl.A0L(r11)
            com.instagram.direct.armadilloexpress.transportpayload.AddMessageMetadata r1 = (com.instagram.direct.armadilloexpress.transportpayload.AddMessageMetadata) r1
            X.R5b r0 = r9.A02()
            com.instagram.direct.armadilloexpress.transportpayload.RepliedToMessage r0 = (com.instagram.direct.armadilloexpress.transportpayload.RepliedToMessage) r0
            r0.getClass()
            r1.repliedToMessage_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
        L_0x00fe:
            r0 = r16
            if (r16 == 0) goto L_0x0131
            java.lang.String r8 = r0.A07
            if (r8 == 0) goto L_0x0131
            com.instagram.direct.armadilloexpress.transportpayload.ForwardingParams r0 = com.instagram.direct.armadilloexpress.transportpayload.ForwardingParams.DEFAULT_INSTANCE
            X.R4O r6 = r0.A0I()
            X.R5b r1 = X.C66580MXl.A0L(r6)
            com.instagram.direct.armadilloexpress.transportpayload.ForwardingParams r1 = (com.instagram.direct.armadilloexpress.transportpayload.ForwardingParams) r1
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.forwardedThreadId_ = r8
            X.R5b r1 = X.C66580MXl.A0L(r11)
            com.instagram.direct.armadilloexpress.transportpayload.AddMessageMetadata r1 = (com.instagram.direct.armadilloexpress.transportpayload.AddMessageMetadata) r1
            X.R5b r0 = r6.A02()
            com.instagram.direct.armadilloexpress.transportpayload.ForwardingParams r0 = (com.instagram.direct.armadilloexpress.transportpayload.ForwardingParams) r0
            r0.getClass()
            r1.forwardingParams_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 8
            r1.bitField0_ = r0
        L_0x0131:
            X.MaY r0 = r3.A02
            X.ODs r0 = r0.A00
            if (r0 != 0) goto L_0x01e6
            if (r2 == 0) goto L_0x016c
        L_0x0139:
            java.lang.Long r0 = r4.A01
            if (r0 == 0) goto L_0x016c
            long r0 = r0.longValue()
            com.instagram.direct.armadilloexpress.transportpayload.EphemeralityParams r4 = com.instagram.direct.armadilloexpress.transportpayload.EphemeralityParams.DEFAULT_INSTANCE
            X.R4O r8 = r4.A0I()
            X.R5b r6 = X.C66580MXl.A0L(r8)
            com.instagram.direct.armadilloexpress.transportpayload.EphemeralityParams r6 = (com.instagram.direct.armadilloexpress.transportpayload.EphemeralityParams) r6
            int r4 = r6.bitField0_
            r4 = r4 | 1
            r6.bitField0_ = r4
            r6.ephemeralDurationSec_ = r0
            X.R5b r1 = X.C66580MXl.A0L(r11)
            com.instagram.direct.armadilloexpress.transportpayload.AddMessageMetadata r1 = (com.instagram.direct.armadilloexpress.transportpayload.AddMessageMetadata) r1
            X.R5b r0 = r8.A02()
            com.instagram.direct.armadilloexpress.transportpayload.EphemeralityParams r0 = (com.instagram.direct.armadilloexpress.transportpayload.EphemeralityParams) r0
            r0.getClass()
            r1.ephemeralityParams_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 16
            r1.bitField0_ = r0
        L_0x016c:
            X.R5b r6 = X.C66580MXl.A0M(r11)
            com.instagram.direct.armadilloexpress.transportpayload.AddMessageMetadata r6 = (com.instagram.direct.armadilloexpress.transportpayload.AddMessageMetadata) r6
            com.instagram.direct.armadilloexpress.transportpayload.AddMessagePayload r0 = com.instagram.direct.armadilloexpress.transportpayload.AddMessagePayload.DEFAULT_INSTANCE
            X.R4O r4 = r0.A0I()
            X.R5b r1 = X.C66580MXl.A0L(r4)
            com.instagram.direct.armadilloexpress.transportpayload.AddMessagePayload r1 = (com.instagram.direct.armadilloexpress.transportpayload.AddMessagePayload) r1
            r6.getClass()
            r1.metadata_ = r6
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            X.R5b r1 = X.C66580MXl.A0L(r4)
            com.instagram.direct.armadilloexpress.transportpayload.AddMessagePayload r1 = (com.instagram.direct.armadilloexpress.transportpayload.AddMessagePayload) r1
            r1.content_ = r15
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            com.instagram.direct.armadilloexpress.transportpayload.TransportPayload r0 = com.instagram.direct.armadilloexpress.transportpayload.TransportPayload.DEFAULT_INSTANCE
            X.R4O r6 = r0.A0I()
            X.NFs r6 = (X.C68411NFs) r6
            com.instagram.direct.armadilloexpress.transportpayload.TransportPayload r0 = X.C66584MXp.A0J(r6, r4)
            r0.transportPayloadCase_ = r5
            X.797 r1 = X.AnonymousClass796.A01(r14, r3)
            X.797 r0 = X.AnonymousClass797.ARMADILLO_EXPRESS_OPEN_EB
            if (r1 != r0) goto L_0x01b0
            r6.A08(r5)
        L_0x01b0:
            if (r12 == 0) goto L_0x01dd
            if (r2 == 0) goto L_0x01dd
            X.Nkj r1 = r2.A00
            X.Nkj r0 = X.C69405Nkj.DISAPPEARING_MESSAGE
            if (r1 != r0) goto L_0x01dd
            java.lang.Long r0 = r2.A01
            r3 = 0
            if (r0 == 0) goto L_0x01dd
            long r1 = r0.longValue()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x01dd
        L_0x01c8:
            X.R5b r1 = X.C66580MXl.A0L(r6)
            com.instagram.direct.armadilloexpress.transportpayload.TransportPayload r1 = (com.instagram.direct.armadilloexpress.transportpayload.TransportPayload) r1
            int r0 = r1.bitField0_
            r0 = r0 | 32
            r1.bitField0_ = r0
            r1.isE2EeAttributed_ = r5
        L_0x01d6:
            X.R5b r0 = X.C66580MXl.A0M(r6)
            com.instagram.direct.armadilloexpress.transportpayload.TransportPayload r0 = (com.instagram.direct.armadilloexpress.transportpayload.TransportPayload) r0
            return r0
        L_0x01dd:
            if (r7 == 0) goto L_0x01d6
            boolean r0 = X.C331057Pi.A02(r7)
            if (r0 != r5) goto L_0x01d6
            goto L_0x01c8
        L_0x01e6:
            r4 = r0
            goto L_0x0139
        L_0x01e9:
            r2 = r7
            goto L_0x0034
        L_0x01ec:
            if (r1 == 0) goto L_0x002d
            goto L_0x0027
        L_0x01f0:
            r1 = r7
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70992OVn.A01(com.instagram.common.session.UserSession, com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent, com.instagram.direct.model.DirectForwardingParams, X.OCA, X.1bp):com.instagram.direct.armadilloexpress.transportpayload.TransportPayload");
    }
}
