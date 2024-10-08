package com.instagram.direct.realtime.armadilloexpress.plugins.payloadhandler;

import X.0sr;
import X.AnonymousClass7TG;
import X.C66580MXl;
import X.C66583MXo;
import X.C68398NFf;
import X.C68405NFm;
import X.C68411NFs;
import X.C68413NFu;
import X.C70147Ny1;
import X.R36;
import X.R4O;
import X.R5b;
import X.TAP;
import com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport;
import com.instagram.direct.armadilloexpress.transportpayload.OriginalTransportPayload;
import com.instagram.direct.armadilloexpress.transportpayload.SupplementMessageContent;
import com.instagram.direct.armadilloexpress.transportpayload.SupplementMessagePayload;
import com.instagram.direct.armadilloexpress.transportpayload.TransportPayload;
import java.util.List;

public final class IGInstamadilloPayloadHandlerPluginImplSessionless extends Sessionless {
    public static final C70147Ny1 Companion = new Object();
    @Deprecated
    public static final String TAG = "IGInstamadilloPayloadHandlerPluginImplSessionless";

    private final TransportPayload createSupplementalPayloadWithOriginalPayload(String str, byte[] bArr, boolean z) {
        C68398NFf nFf = (C68398NFf) SupplementMessageContent.DEFAULT_INSTANCE.A0I();
        R4O A0I = OriginalTransportPayload.DEFAULT_INSTANCE.A0I();
        R36 A01 = TAP.A01(bArr, 0, bArr.length);
        OriginalTransportPayload originalTransportPayload = (OriginalTransportPayload) C66580MXl.A0L(A0I);
        originalTransportPayload.bitField0_ |= 1;
        originalTransportPayload.originalTransportPayload_ = A01;
        SupplementMessageContent supplementMessageContent = (SupplementMessageContent) C66580MXl.A0L(nFf);
        R5b A02 = A0I.A02();
        A02.getClass();
        supplementMessageContent.supplementMessageContent_ = A02;
        supplementMessageContent.supplementMessageContentCase_ = 5;
        C68411NFs nFs = (C68411NFs) TransportPayload.DEFAULT_INSTANCE.A0I();
        C68413NFu nFu = (C68413NFu) SupplementMessagePayload.DEFAULT_INSTANCE.A0I();
        nFu.A07(str);
        nFu.A06(nFf);
        nFs.A07(nFu);
        if (z) {
            nFs.A08(true);
        }
        return (TransportPayload) C66580MXl.A0M(nFs);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0075, code lost:
        if (r1 != 2) goto L_0x0077;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.instagram.direct.armadilloexpress.transportpayload.TransportPayload removeLinksAndRepack(byte[] r11) {
        /*
            r10 = this;
            com.instagram.direct.armadilloexpress.transportpayload.TransportPayload r0 = com.instagram.direct.armadilloexpress.transportpayload.TransportPayload.DEFAULT_INSTANCE
            X.R5b r0 = X.R5b.A04(r0, r11)
            X.R4O r8 = r0.A0J()
            X.R5b r0 = r8.A00
            com.instagram.direct.armadilloexpress.transportpayload.TransportPayload r0 = (com.instagram.direct.armadilloexpress.transportpayload.TransportPayload) r0
            com.instagram.direct.armadilloexpress.transportpayload.AddMessagePayload r0 = r0.A0L()
            X.R4O r7 = r0.A0J()
            X.R5b r0 = r7.A00
            com.instagram.direct.armadilloexpress.transportpayload.AddMessagePayload r0 = (com.instagram.direct.armadilloexpress.transportpayload.AddMessagePayload) r0
            com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent r0 = r0.content_
            if (r0 != 0) goto L_0x0020
            com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent r0 = com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent.DEFAULT_INSTANCE
        L_0x0020:
            X.R4O r6 = r0.A0J()
            X.NFl r6 = (X.C68404NFl) r6
            X.R5b r0 = r6.A00
            com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent r0 = (com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent) r0
            com.instagram.direct.armadilloexpress.transportpayload.Media r0 = r0.A0L()
            X.R4O r5 = r0.A0J()
            X.NFp r5 = (X.C68408NFp) r5
            X.R5b r0 = r5.A00
            com.instagram.direct.armadilloexpress.transportpayload.Media r0 = (com.instagram.direct.armadilloexpress.transportpayload.Media) r0
            com.instagram.direct.armadilloexpress.transportpayload.Raven r0 = r0.A0M()
            X.R4O r4 = r0.A0J()
            X.NFb r4 = (X.C68394NFb) r4
            X.R5b r2 = r4.A00
            com.instagram.direct.armadilloexpress.transportpayload.Raven r2 = (com.instagram.direct.armadilloexpress.transportpayload.Raven) r2
            X.Nmx r1 = r2.A0L()
            X.Nmx r0 = X.C69515Nmx.RAVEN_VIEW_MODEL_PERMANENT
            r9 = 0
            if (r1 == r0) goto L_0x01c7
            com.instagram.direct.armadilloexpress.transportpayload.RavenContent r0 = r2.content_
            if (r0 != 0) goto L_0x0055
            com.instagram.direct.armadilloexpress.transportpayload.RavenContent r0 = com.instagram.direct.armadilloexpress.transportpayload.RavenContent.DEFAULT_INSTANCE
        L_0x0055:
            X.R4O r3 = r0.A0J()
            X.NFo r3 = (X.C68407NFo) r3
            X.R5b r2 = r3.A00
            com.instagram.direct.armadilloexpress.transportpayload.RavenContent r2 = (com.instagram.direct.armadilloexpress.transportpayload.RavenContent) r2
            int r1 = r2.ravenContentCase_
            if (r1 == 0) goto L_0x01c3
            r0 = 1
            if (r1 == r0) goto L_0x01bf
            r0 = 2
            if (r1 == r0) goto L_0x01bb
            r0 = 0
        L_0x006a:
            int r1 = r0.intValue()
            r0 = 0
            if (r1 == r0) goto L_0x0131
            r0 = 1
            if (r1 == r0) goto L_0x00b9
            r0 = 2
            if (r1 == r0) goto L_0x01c7
        L_0x0077:
            X.R5b r1 = X.C66580MXl.A0L(r4)
            com.instagram.direct.armadilloexpress.transportpayload.Raven r1 = (com.instagram.direct.armadilloexpress.transportpayload.Raven) r1
            X.R5b r0 = r3.A02()
            com.instagram.direct.armadilloexpress.transportpayload.RavenContent r0 = (com.instagram.direct.armadilloexpress.transportpayload.RavenContent) r0
            r0.getClass()
            r1.content_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r5.A08(r4)
            r6.A06(r5)
            X.R5b r1 = X.C66580MXl.A0L(r7)
            com.instagram.direct.armadilloexpress.transportpayload.AddMessagePayload r1 = (com.instagram.direct.armadilloexpress.transportpayload.AddMessagePayload) r1
            X.R5b r0 = r6.A02()
            com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent r0 = (com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent) r0
            r0.getClass()
            r1.content_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            com.instagram.direct.armadilloexpress.transportpayload.TransportPayload r1 = X.C66584MXp.A0J(r8, r7)
            r0 = 1
            r1.transportPayloadCase_ = r0
            X.R5b r0 = r8.A02()
            com.instagram.direct.armadilloexpress.transportpayload.TransportPayload r0 = (com.instagram.direct.armadilloexpress.transportpayload.TransportPayload) r0
            return r0
        L_0x00b9:
            com.instagram.direct.armadilloexpress.transportpayload.Video r0 = r2.A0M()
            X.R4O r9 = r0.A0J()
            X.NFv r9 = (X.C68414NFv) r9
            X.R5b r0 = r9.A00
            com.instagram.direct.armadilloexpress.transportpayload.Video r0 = (com.instagram.direct.armadilloexpress.transportpayload.Video) r0
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r0 = r0.mediaTransport_
            if (r0 != 0) goto L_0x00cd
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r0 = com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport.DEFAULT_INSTANCE
        L_0x00cd:
            X.0qQ.A07(r0)
            X.NFm r0 = r10.clearDirectPath(r0)
            X.R5b r1 = X.C66580MXl.A0L(r9)
            com.instagram.direct.armadilloexpress.transportpayload.Video r1 = (com.instagram.direct.armadilloexpress.transportpayload.Video) r1
            X.R5b r0 = r0.A02()
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r0 = (com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport) r0
            r0.getClass()
            r1.mediaTransport_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            X.R5b r1 = r9.A00
            com.instagram.direct.armadilloexpress.transportpayload.Video r1 = (com.instagram.direct.armadilloexpress.transportpayload.Video) r1
            int r0 = r1.bitField0_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x012c
            com.instagram.direct.armadilloexpress.transportpayload.Thumbnail r0 = r1.thumbnail_
            if (r0 != 0) goto L_0x00fb
            com.instagram.direct.armadilloexpress.transportpayload.Thumbnail r0 = com.instagram.direct.armadilloexpress.transportpayload.Thumbnail.DEFAULT_INSTANCE
        L_0x00fb:
            X.R4O r2 = r0.A0J()
            X.NFr r2 = (X.C68410NFr) r2
            X.R5b r0 = r2.A00
            com.instagram.direct.armadilloexpress.transportpayload.Thumbnail r0 = (com.instagram.direct.armadilloexpress.transportpayload.Thumbnail) r0
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r0 = r0.mediaTransport_
            if (r0 != 0) goto L_0x010b
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r0 = com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport.DEFAULT_INSTANCE
        L_0x010b:
            X.0qQ.A07(r0)
            X.NFm r0 = r10.clearDirectPath(r0)
            X.R5b r1 = X.C66580MXl.A0L(r2)
            com.instagram.direct.armadilloexpress.transportpayload.Thumbnail r1 = (com.instagram.direct.armadilloexpress.transportpayload.Thumbnail) r1
            X.R5b r0 = r0.A02()
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r0 = (com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport) r0
            r0.getClass()
            r1.mediaTransport_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r9.A09(r2)
        L_0x012c:
            r3.A07(r9)
            goto L_0x0077
        L_0x0131:
            com.instagram.direct.armadilloexpress.transportpayload.StaticPhoto r0 = r2.A0L()
            X.R4O r2 = r0.A0J()
            X.NFq r2 = (X.C68409NFq) r2
            X.R5b r0 = r2.A00
            com.instagram.direct.armadilloexpress.transportpayload.StaticPhoto r0 = (com.instagram.direct.armadilloexpress.transportpayload.StaticPhoto) r0
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r0 = r0.mediaTransport_
            if (r0 != 0) goto L_0x0145
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r0 = com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport.DEFAULT_INSTANCE
        L_0x0145:
            X.0qQ.A07(r0)
            X.NFm r0 = r10.clearDirectPath(r0)
            X.R5b r1 = X.C66580MXl.A0L(r2)
            com.instagram.direct.armadilloexpress.transportpayload.StaticPhoto r1 = (com.instagram.direct.armadilloexpress.transportpayload.StaticPhoto) r1
            X.R5b r0 = r0.A02()
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r0 = (com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport) r0
            r0.getClass()
            r1.mediaTransport_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            X.R5b r1 = r2.A00
            com.instagram.direct.armadilloexpress.transportpayload.StaticPhoto r1 = (com.instagram.direct.armadilloexpress.transportpayload.StaticPhoto) r1
            int r0 = r1.bitField0_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x01b6
            com.instagram.direct.armadilloexpress.transportpayload.Thumbnail r0 = r1.thumbnail_
            if (r0 != 0) goto L_0x0173
            com.instagram.direct.armadilloexpress.transportpayload.Thumbnail r0 = com.instagram.direct.armadilloexpress.transportpayload.Thumbnail.DEFAULT_INSTANCE
        L_0x0173:
            X.R4O r9 = r0.A0J()
            X.R5b r0 = r9.A00
            com.instagram.direct.armadilloexpress.transportpayload.Thumbnail r0 = (com.instagram.direct.armadilloexpress.transportpayload.Thumbnail) r0
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r0 = r0.mediaTransport_
            if (r0 != 0) goto L_0x0181
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r0 = com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport.DEFAULT_INSTANCE
        L_0x0181:
            X.0qQ.A07(r0)
            X.NFm r0 = r10.clearDirectPath(r0)
            X.R5b r1 = X.C66580MXl.A0L(r9)
            com.instagram.direct.armadilloexpress.transportpayload.Thumbnail r1 = (com.instagram.direct.armadilloexpress.transportpayload.Thumbnail) r1
            X.R5b r0 = r0.A02()
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r0 = (com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport) r0
            r0.getClass()
            r1.mediaTransport_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            X.R5b r1 = X.C66580MXl.A0L(r2)
            com.instagram.direct.armadilloexpress.transportpayload.StaticPhoto r1 = (com.instagram.direct.armadilloexpress.transportpayload.StaticPhoto) r1
            X.R5b r0 = r9.A02()
            com.instagram.direct.armadilloexpress.transportpayload.Thumbnail r0 = (com.instagram.direct.armadilloexpress.transportpayload.Thumbnail) r0
            r0.getClass()
            r1.thumbnail_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 8
            r1.bitField0_ = r0
        L_0x01b6:
            r3.A06(r2)
            goto L_0x0077
        L_0x01bb:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x006a
        L_0x01bf:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x006a
        L_0x01c3:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            goto L_0x006a
        L_0x01c7:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.realtime.armadilloexpress.plugins.payloadhandler.IGInstamadilloPayloadHandlerPluginImplSessionless.removeLinksAndRepack(byte[]):com.instagram.direct.armadilloexpress.transportpayload.TransportPayload");
    }

    private final C68405NFm clearDirectPath(CommonMediaTransport commonMediaTransport) {
        C68405NFm nFm = (C68405NFm) commonMediaTransport.A0J();
        CommonMediaTransport A0O = C66583MXo.A0O(nFm);
        A0O.bitField0_ &= -17;
        CommonMediaTransport commonMediaTransport2 = CommonMediaTransport.DEFAULT_INSTANCE;
        A0O.directPath_ = commonMediaTransport2.directPath_;
        CommonMediaTransport A0O2 = C66583MXo.A0O(nFm);
        A0O2.bitField0_ &= -3;
        A0O2.fileSha256_ = commonMediaTransport2.fileSha256_;
        return nFm;
    }

    public List IGInstamadilloPayloadHandlerPluginImpl_InstamadilloPayloadHandlingCreateSplitRavenPayload(String str, byte[] bArr, long j) {
        AnonymousClass7TG.A1N(str, bArr);
        TransportPayload removeLinksAndRepack = removeLinksAndRepack(bArr);
        if (removeLinksAndRepack == null) {
            return null;
        }
        return 0sr.A1P(new byte[][]{removeLinksAndRepack.A0H(), createSupplementalPayloadWithOriginalPayload(str, bArr, removeLinksAndRepack.openEb_).A0H()});
    }
}
