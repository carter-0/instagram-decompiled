package X;

import android.content.Context;
import android.graphics.Point;
import com.instagram.common.session.UserSession;
import java.io.IOException;

/* renamed from: X.M0u  reason: case insensitive filesystem */
public final class C65828M0u implements C13830Ti1 {
    public int A00;
    public final float A01;
    public final Context A02;
    public final UserSession A03;
    public final AnonymousClass3Q2 A04;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0022, code lost:
        if (r3.A0E() == com.instagram.pendingmedia.model.constants.ShareType.CLIPS) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CN7(X.AnonymousClass9R7 r18, int r19) {
        /*
            r17 = this;
            r9 = 0
            r7 = r18
            X.0qQ.A0B(r7, r9)
            r4 = r17
            X.3Q2 r3 = r4.A04
            com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r8 = r3.A16
            r6 = 1
            if (r8 == 0) goto L_0x006a
            android.content.Context r0 = r4.A02
            boolean r0 = X.C305756Jk.A00(r0)
            r5 = r0 ^ 1
            com.instagram.camera.effect.models.CameraAREffect r0 = r3.A10
            if (r0 != 0) goto L_0x0024
            com.instagram.pendingmedia.model.constants.ShareType r2 = r3.A0E()
            com.instagram.pendingmedia.model.constants.ShareType r1 = com.instagram.pendingmedia.model.constants.ShareType.CLIPS
            r0 = 0
            if (r2 != r1) goto L_0x0025
        L_0x0024:
            r0 = 1
        L_0x0025:
            r13 = 0
            java.lang.Float r12 = X.C51967G9n.A0h()
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r6)
            X.AD8 r10 = new X.AD8
            r14 = r13
            r15 = r13
            r16 = r13
            r10.<init>(r11, r12, r13, r14, r15, r16)
            com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r11 = X.C364738lv.A01(r8, r10, r5, r0, r9)
        L_0x003b:
            java.lang.String r0 = r3.A2Q
            if (r0 == 0) goto L_0x0068
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeFile(r0)
        L_0x0043:
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r5 = r3.A1D
            if (r5 == 0) goto L_0x006c
            X.3QG r0 = r3.A1i
            int r2 = r0.A01
            int r1 = r0.A00
            com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl r5 = (com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl) r5
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain r0 = r5.A02
            X.C63122Krq.A00(r0, r2, r1)
            com.instagram.pendingmedia.model.ClipInfo r0 = r3.A1N
            r7.A02(r0, r6)
            int r2 = r3.A05
            int r1 = r0.A07
            int r0 = r0.A05
            int r0 = X.C229632nm.A03(r2, r1, r0)
            r4.A00 = r0
            r3.A05 = r0
            return
        L_0x0068:
            r8 = 0
            goto L_0x0043
        L_0x006a:
            r11 = 0
            goto L_0x003b
        L_0x006c:
            android.content.Context r7 = r4.A02
            com.instagram.common.session.UserSession r9 = r4.A03
            X.3QG r13 = r3.A1i
            com.instagram.common.util.gradient.BackgroundGradientColors r10 = r3.A14
            r12 = 0
            X.C17123VIt.A00(r7, r8, r9, r10, r11, r12, r13)
            r0 = 1058(0x422, float:1.483E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass7TE.A1B(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65828M0u.CN7(X.9R7, int):void");
    }

    public final void E3K(AnonymousClass9R7 r2) {
        0qQ.A0B(r2, 0);
    }

    public final boolean ETu(Q0Z q0z) {
        0qQ.A0B(q0z, 0);
        try {
            String str = this.A04.A1N.A0F;
            if (str == null) {
                str = "";
            }
            q0z.ETt(str);
            return true;
        } catch (IOException e) {
            0KC.A0M(Pxd.A00(166), "Exception when preparing codec: %s", e, new Object[]{e.getMessage()});
            return false;
        }
    }

    public final void Enx(AnonymousClass9RG r5) {
        0qQ.A0B(r5, 0);
        Point C4P = C4P();
        r5.A08.offer(new M9F(r5, C4P.x, C4P.y));
    }

    public final int Byl() {
        return this.A00;
    }

    public final Point C4P() {
        return AEW.A01(this.A02, this.A03, this.A01, this.A04.A1N.A09);
    }

    public C65828M0u(Context context, UserSession userSession, AnonymousClass3Q2 r3, float f) {
        AnonymousClass7TG.A1U(r3, context, userSession);
        this.A04 = r3;
        this.A02 = context;
        this.A03 = userSession;
        this.A01 = f;
    }
}
