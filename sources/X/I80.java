package X;

import android.animation.ValueAnimator;
import com.instagram.reels.prompt.model.PromptStickerModel;

public final class I80 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ AnonymousClass4X0 A00;
    public final /* synthetic */ C354808Nl A01;
    public final /* synthetic */ PromptStickerModel A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    public I80(AnonymousClass4X0 r1, C354808Nl r2, PromptStickerModel promptStickerModel, boolean z, boolean z2, boolean z3) {
        this.A03 = z;
        this.A01 = r2;
        this.A05 = z2;
        this.A00 = r1;
        this.A04 = z3;
        this.A02 = promptStickerModel;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0032, code lost:
        if (r0 == null) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAnimationUpdate(android.animation.ValueAnimator r10) {
        /*
            r9 = this;
            float r8 = X.AnonymousClass7TH.A00(r10)
            boolean r0 = r9.A03
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x0015
            X.8Nl r1 = r9.A01
            r0 = 1060320051(0x3f333333, float:0.7)
            float r0 = r0 * r8
            float r0 = r7 - r0
            r1.EVv(r0)
        L_0x0015:
            boolean r0 = r9.A05
            if (r0 == 0) goto L_0x006e
            double r1 = (double) r8
            r5 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            java.lang.String r4 = "progressViewStubber"
            java.lang.String r3 = "stickerView"
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x003c
            r2 = 0
            r1 = 1056964608(0x3f000000, float:0.5)
            r0 = 1067030938(0x3f99999a, float:1.2)
            float r2 = X.0mi.A02(r8, r2, r1, r7, r0)
            X.4X0 r1 = r9.A00
            com.instagram.common.ui.base.IgSimpleImageView r0 = r1.A03
            if (r0 != 0) goto L_0x004e
        L_0x0034:
            X.0qQ.A0F(r3)
        L_0x0037:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x003c:
            r2 = 1056964608(0x3f000000, float:0.5)
            r1 = -1080452710(0xffffffffbf99999a, float:-1.2)
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = X.0mi.A02(r8, r2, r7, r1, r0)
            X.4X0 r1 = r9.A00
            com.instagram.common.ui.base.IgSimpleImageView r0 = r1.A03
            if (r0 == 0) goto L_0x0034
            float r2 = -r2
        L_0x004e:
            r0.setScaleX(r2)
            com.instagram.common.ui.base.IgSimpleImageView r0 = r1.A03
            if (r0 == 0) goto L_0x0034
            r0.setScaleY(r2)
            X.3oV r0 = r1.A05
            if (r0 == 0) goto L_0x00a6
            android.view.View r0 = r0.getView()
            r0.setScaleX(r2)
            X.3oV r0 = r1.A05
            if (r0 == 0) goto L_0x00a6
            android.view.View r0 = r0.getView()
            r0.setScaleY(r2)
        L_0x006e:
            boolean r6 = r9.A04
            if (r6 == 0) goto L_0x008d
            X.4X0 r0 = r9.A00
            X.Gcp r1 = r0.A02
            if (r1 == 0) goto L_0x008d
            double r2 = (double) r8
            double r4 = r1.A01
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x008d
            r1.A01 = r2
            X.0eM r0 = r1.A0F
            java.lang.Object r1 = r0.getValue()
            X.2cs r1 = (X.2cs) r1
            r0 = 1
            r1.A08(r2, r0)
        L_0x008d:
            int r0 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x00a5
            if (r6 == 0) goto L_0x009c
            X.4X0 r0 = r9.A00
            X.Gcp r0 = r0.A02
            if (r0 == 0) goto L_0x009c
            r0.A01()
        L_0x009c:
            X.4X0 r0 = r9.A00
            java.util.Set r1 = r0.A0I
            com.instagram.reels.prompt.model.PromptStickerModel r0 = r9.A02
            r1.add(r0)
        L_0x00a5:
            return
        L_0x00a6:
            X.0qQ.A0F(r4)
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I80.onAnimationUpdate(android.animation.ValueAnimator):void");
    }
}
