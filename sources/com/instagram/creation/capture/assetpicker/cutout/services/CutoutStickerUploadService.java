package com.instagram.creation.capture.assetpicker.cutout.services;

import X.0qQ;
import X.AnonymousClass1Nd;
import X.AnonymousClass2Zd;
import X.AnonymousClass3Q2;
import X.AnonymousClass3QD;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C64676Lg2;
import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.EnumSet;
import java.util.List;

public final class CutoutStickerUploadService implements AnonymousClass2Zd {
    public final UserSession A00;
    public final List A01 = AnonymousClass7TE.A1C();
    public final Context A02;

    public final void DFp(AnonymousClass3Q2 r6) {
        0qQ.A0B(r6, 0);
        if (!EnumSet.of(AnonymousClass3QD.UPLOADED, AnonymousClass3QD.CONFIGURED).contains(r6.A1f)) {
            AnonymousClass1Nd.A00(this.A00).A00(new C64676Lg2(r6.A1C, (Integer) null, "upload failed"));
        }
    }

    public final /* synthetic */ void DQx(AnonymousClass3Q2 r1) {
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MED, X.4D7] */
    /* JADX WARNING: type inference failed for: r1v4, types: [X.1us, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(android.graphics.Bitmap r11, X.1ua r12, java.lang.String r13, java.lang.String r14, X.AnonymousClass4D7 r15) {
        /*
            r10 = this;
            r3 = 25
            boolean r0 = X.MED.A04(r3, r15)
            r8 = r10
            if (r0 == 0) goto L_0x0087
            r5 = r15
            X.MED r5 = (X.MED) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0087
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0017:
            java.lang.Object r1 = r5.A04
            X.1Hj r2 = X.1Hj.A02
            int r0 = r5.A00
            r4 = 1
            if (r0 == 0) goto L_0x002a
            if (r0 != r4) goto L_0x008d
            X.0eS.A00(r1)
        L_0x0025:
            X.0eR r1 = (X.0eR) r1
            java.lang.Object r0 = r1.A00
            return r0
        L_0x002a:
            X.0eS.A00(r1)
            X.3Q2 r6 = X.AnonymousClass9T3.A01(r14)
            java.lang.String r0 = X.AnonymousClass45F.A02(r11)
            r6.A33 = r0
            r6.A3h = r13
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.CUTOUT_STICKER
            r6.A0e(r0)
            r0 = 6
            r6.A0N = r0
            com.instagram.common.session.UserSession r3 = r10.A00
            com.instagram.pendingmedia.store.PendingMediaStore r1 = X.28K.A00(r3)
            java.lang.String r0 = r6.A35
            r1.A0D(r6, r0)
            X.JTP.A1M(r3)
            r9 = r12
            X.MED.A00(r10, r12, r6, r5, r4)
            X.3Pl r7 = X.JTQ.A0m(r5)
            com.instagram.pendingmedia.store.PendingMediaStore r1 = X.28K.A00(r3)
            android.content.Context r0 = r10.A02
            r1.A0B(r0)
            r5 = 0
            X.LgR r4 = new X.LgR
            r4.<init>(r5, r6, r7, r8, r9)
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r3)
            java.lang.Class<X.Lg2> r0 = X.C64676Lg2.class
            r1.A01(r4, r0)
            java.util.List r0 = r10.A01
            r0.add(r4)
            r12.A0J(r10)
            X.1ur r1 = new X.1ur
            r1.<init>()
            r0 = 0
            r12.A0G(r6, r1, r0)
            java.lang.Object r1 = r7.A00()
            if (r1 != r2) goto L_0x0025
            return r2
        L_0x0087:
            X.MED r5 = new X.MED
            r5.<init>(r10, r15, r3)
            goto L_0x0017
        L_0x008d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.assetpicker.cutout.services.CutoutStickerUploadService.A00(android.graphics.Bitmap, X.1ua, java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    public CutoutStickerUploadService(UserSession userSession, Context context) {
        AnonymousClass7TG.A1O(userSession, context);
        this.A00 = userSession;
        this.A02 = context;
    }
}
