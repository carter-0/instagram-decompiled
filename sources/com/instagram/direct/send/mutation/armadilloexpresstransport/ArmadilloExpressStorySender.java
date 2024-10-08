package com.instagram.direct.send.mutation.armadilloexpresstransport;

import X.0mb;
import X.1MF;
import X.25x;
import X.AnonymousClass12T;
import X.C262224Cq;
import X.C51966G9m;
import X.JTP;
import X.JTR;
import X.OKG;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import com.instagram.common.session.UserSession;
import java.io.File;

public final class ArmadilloExpressStorySender {
    public final Context A00;
    public final AnonymousClass12T A01;
    public final UserSession A02;
    public final OKG A03;
    public final C262224Cq A04;

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MED, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.N1Z r16, com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressStorySender r17, X.C65481cr r18, X.AnonymousClass4D7 r19) {
        /*
            r8 = r17
            r1 = r18
            r14 = r16
            r4 = 40
            r5 = r19
            boolean r0 = X.MED.A04(r4, r5)
            if (r0 == 0) goto L_0x0080
            r6 = r5
            X.MED r6 = (X.MED) r6
            int r3 = r6.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L_0x0080
            int r3 = r3 - r2
            r6.A00 = r3
        L_0x001e:
            java.lang.Object r2 = r6.A04
            X.1Hj r5 = X.1Hj.A02
            int r0 = r6.A00
            r3 = 1
            r10 = 0
            if (r0 == 0) goto L_0x003e
            if (r0 != r3) goto L_0x00f9
            java.lang.Object r14 = r6.A03
            X.N1Z r14 = (X.N1Z) r14
            java.lang.Object r1 = r6.A02
            X.1cr r1 = (X.C65481cr) r1
            java.lang.Object r8 = r6.A01
            com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressStorySender r8 = (com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressStorySender) r8
            X.0eS.A00(r2)
        L_0x0039:
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x0086
            return r10
        L_0x003e:
            X.0eS.A00(r2)
            com.instagram.model.mediasize.ExtendedImageUrl r0 = r1.A01
            if (r0 == 0) goto L_0x007e
            com.instagram.common.typedurl.SimpleImageUrl r7 = X.O1D.A00(r0)
        L_0x0049:
            java.lang.String r0 = r1.A08
            if (r0 == 0) goto L_0x00fe
            if (r7 == 0) goto L_0x00fe
            X.1NK r4 = X.1NK.A00()
            com.instagram.common.session.UserSession r2 = r8.A02
            java.lang.String r0 = "SendReceiverFetchXma"
            X.3LX r0 = r4.A0K(r2, r7, r0)
            if (r0 == 0) goto L_0x00fe
            android.graphics.Bitmap r9 = r0.A01
            if (r9 == 0) goto L_0x00fe
            int r11 = r9.getWidth()
            int r12 = r9.getHeight()
            r6.A01 = r8
            r6.A02 = r1
            r6.A03 = r14
            r6.A00 = r3
            r13 = 4
            X.MGm r7 = new X.MGm
            r7.<init>(r8, r9, r10, r11, r12, r13)
            java.lang.Object r2 = X.19E.A00(r6, r7)
            if (r2 != r5) goto L_0x0039
            return r5
        L_0x007e:
            r7 = r10
            goto L_0x0049
        L_0x0080:
            X.MED r6 = new X.MED
            r6.<init>(r8, r5, r4)
            goto L_0x001e
        L_0x0086:
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r0 = X.C66834MdS.A03(r2)
            if (r0 == 0) goto L_0x00e8
            X.NFm r2 = com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport.A00(r0)
            java.lang.String r0 = "image/webp"
            r2.A06(r0)
            X.R5b r2 = r2.A02()
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r2 = (com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport) r2
            com.instagram.direct.armadilloexpress.transportpayload.AvatarSticker r0 = com.instagram.direct.armadilloexpress.transportpayload.AvatarSticker.DEFAULT_INSTANCE
            X.R4O r4 = r0.A0I()
            X.NFt r4 = (X.C68412NFt) r4
            r4.A06(r2)
            r4.A09(r3)
            java.lang.Integer r0 = r1.A07
            if (r0 == 0) goto L_0x00bf
            int r3 = r0.intValue()
            X.R5b r2 = X.C66580MXl.A0L(r4)
            com.instagram.direct.armadilloexpress.transportpayload.AvatarSticker r2 = (com.instagram.direct.armadilloexpress.transportpayload.AvatarSticker) r2
            int r0 = r2.bitField0_
            r0 = r0 | 16
            r2.bitField0_ = r0
            r2.nuxType_ = r3
        L_0x00bf:
            com.instagram.common.session.UserSession r0 = r8.A02
            X.797 r2 = X.AnonymousClass796.A01(r0, r1)
            X.797 r0 = X.AnonymousClass797.ARMADILLO_EXPRESS_OPEN_EB
            if (r2 != r0) goto L_0x00d7
            java.lang.String r0 = r1.A08
            if (r0 == 0) goto L_0x00d0
            r4.A07(r0)
        L_0x00d0:
            java.lang.String r0 = r1.A0A
            if (r0 == 0) goto L_0x00d7
            r4.A08(r0)
        L_0x00d7:
            com.instagram.direct.armadilloexpress.transportpayload.Media r0 = com.instagram.direct.armadilloexpress.transportpayload.Media.DEFAULT_INSTANCE
            X.R4O r0 = r0.A0I()
            X.NFp r0 = (X.C68408NFp) r0
            r0.A06(r4)
            X.R5b r10 = r0.A02()
            com.instagram.direct.armadilloexpress.transportpayload.Media r10 = (com.instagram.direct.armadilloexpress.transportpayload.Media) r10
        L_0x00e8:
            X.OVn r13 = X.C70992OVn.A00
            com.instagram.common.session.UserSession r15 = r8.A02
            r17 = 0
            r16 = r10
            r18 = r1
            r19 = r17
            com.instagram.direct.armadilloexpress.transportpayload.TransportPayload r0 = r13.A00(r14, r15, r16, r17, r18, r19)
            return r0
        L_0x00f9:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00fe:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressStorySender.A00(X.N1Z, com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressStorySender, X.1cr, X.4D7):java.lang.Object");
    }

    public static final String A01(Bitmap bitmap, ArmadilloExpressStorySender armadilloExpressStorySender) {
        Bitmap.CompressFormat compressFormat;
        File A042 = 0mb.A04(armadilloExpressStorySender.A00);
        A042.deleteOnExit();
        if (Build.VERSION.SDK_INT >= 30) {
            compressFormat = Bitmap.CompressFormat.WEBP_LOSSLESS;
        } else {
            compressFormat = Bitmap.CompressFormat.WEBP;
        }
        1MF.A0L(compressFormat, bitmap, A042, 100);
        return JTP.A0t(A042);
    }

    public /* synthetic */ ArmadilloExpressStorySender(UserSession userSession) {
        OKG okg = new OKG(25x.A00(userSession), userSession);
        this.A02 = userSession;
        this.A03 = okg;
        AnonymousClass12T r1 = AnonymousClass12T.A00;
        this.A01 = r1;
        this.A04 = JTR.A17(r1, 319);
        this.A00 = C51966G9m.A0P(userSession);
    }
}
