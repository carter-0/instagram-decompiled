package X;

public final class MBH implements AnonymousClass0eK {
    public final int A00;
    public final Object A01;

    public MBH(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0134, code lost:
        r0 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object get() {
        /*
            r8 = this;
            int r0 = r8.A00
            switch(r0) {
                case 0: goto L_0x0081;
                case 1: goto L_0x00a3;
                case 2: goto L_0x00c0;
                case 3: goto L_0x00c3;
                case 4: goto L_0x00d3;
                case 5: goto L_0x00de;
                case 6: goto L_0x0005;
                case 7: goto L_0x00ee;
                case 8: goto L_0x0005;
                case 9: goto L_0x00f5;
                case 10: goto L_0x0104;
                case 11: goto L_0x010f;
                case 12: goto L_0x011a;
                case 13: goto L_0x0125;
                case 14: goto L_0x0136;
                case 15: goto L_0x013d;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r5 = r8.A01
            X.LoS r5 = (X.C65163LoS) r5
            X.8my r0 = r5.A03
            if (r0 != 0) goto L_0x001e
            X.8mI r2 = r5.A0H
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r1 = r5.A0P
            java.lang.String r0 = "ImageRenderController"
            com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter r1 = X.C395019z4.A00(r1, r0)
            r0 = 0
            X.8my r0 = r2.A05(r1, r0)
            r5.A03 = r0
        L_0x001e:
            r0.getClass()
            X.XBw r6 = r5.A04
            if (r6 == 0) goto L_0x006b
            X.8mI r0 = r5.A0H
            com.instagram.creation.base.CropInfo r7 = r0.A01
            r7.getClass()
            X.8my r0 = r5.A03
            int r4 = r0.getWidth()
            int r3 = r0.getHeight()
            int r2 = r7.A01
            int r1 = r7.A00
            android.graphics.Rect r0 = r7.A02
            android.graphics.Rect r1 = X.C63218KtP.A00(r0, r4, r3, r2, r1)
            int r0 = r5.A0C
            int r0 = r0 % 180
            if (r0 != 0) goto L_0x0077
            int r0 = r1.width()
            float r4 = (float) r0
            int r0 = r1.height()
        L_0x004f:
            float r0 = (float) r0
            float r4 = r4 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r3 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x006e
            int r2 = r6.getHeight()
            float r0 = (float) r2
            float r0 = r0 * r4
            float r0 = r0 + r3
            int r1 = (int) r0
        L_0x0061:
            r6.EiS(r1, r2)
            X.LDl r0 = r5.A01
            if (r0 == 0) goto L_0x006b
            r0.A00(r1, r2)
        L_0x006b:
            X.8my r3 = r5.A03
            return r3
        L_0x006e:
            int r1 = r6.getWidth()
            float r0 = (float) r1
            float r0 = r0 / r4
            float r0 = r0 + r3
            int r2 = (int) r0
            goto L_0x0061
        L_0x0077:
            int r0 = r1.height()
            float r4 = (float) r0
            int r0 = r1.width()
            goto L_0x004f
        L_0x0081:
            java.lang.Object r0 = r8.A01
            X.K7G r0 = (X.K7G) r0
            java.lang.String r2 = r0.A03
            if (r2 != 0) goto L_0x008b
            java.lang.String r2 = "comment_sticker_picker_tab_fragment"
        L_0x008b:
            X.0eM r0 = r0.A07
            com.instagram.common.session.UserSession r1 = X.JTU.A0J(r0)
            X.K3M r3 = new X.K3M
            r3.<init>()
            java.lang.String r0 = "args_previous_module_name"
            android.os.Bundle r0 = X.DbY.A0B(r0, r2)
            X.C227642jf.A04(r0, r1)
            r3.setArguments(r0)
            return r3
        L_0x00a3:
            java.lang.Object r1 = r8.A01
            X.K7G r1 = (X.K7G) r1
            X.0eM r0 = r1.A07
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            X.NjK r3 = X.C69319NjK.COMMENT_COMPOSER
            r4 = 0
            java.lang.String r5 = ""
            r6 = 0
            r7 = r6
            X.NJi r3 = X.C69920NuM.A00(r2, r3, r4, r5, r6, r7)
            X.LqI r0 = new X.LqI
            r0.<init>(r1)
            r3.A00 = r0
            return r3
        L_0x00c0:
            com.instagram.api.schemas.GiphyRequestSurface r3 = com.instagram.api.schemas.GiphyRequestSurface.CREATE_MODE
            return r3
        L_0x00c3:
            java.lang.Object r0 = r8.A01
            X.JYD r0 = (X.JYD) r0
            android.content.Context r2 = r0.A08
            com.instagram.common.session.UserSession r1 = r0.A0H
            java.lang.String r0 = r0.A0U
            X.4MM r3 = new X.4MM
            r3.<init>(r2, r1, r0)
            return r3
        L_0x00d3:
            java.lang.Object r0 = r8.A01
            X.LER r0 = (X.LER) r0
            X.0eM r0 = r0.A0C
            java.lang.Object r3 = X.AnonymousClass7TE.A14(r0)
            return r3
        L_0x00de:
            java.lang.Object r0 = r8.A01
            X.LER r0 = (X.LER) r0
            X.L83 r0 = r0.A08
            int r1 = r0.A01
            int r0 = r0.A00
            X.TsU r3 = new X.TsU
            r3.<init>(r1, r0)
            return r3
        L_0x00ee:
            java.lang.Object r0 = r8.A01
            X.LoS r0 = (X.C65163LoS) r0
            X.XBw r3 = r0.A04
            return r3
        L_0x00f5:
            java.lang.Object r0 = r8.A01
            X.KH6 r0 = (X.KH6) r0
            java.lang.Object r0 = r0.A01
            com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController r0 = (com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController) r0
            com.instagram.common.session.UserSession r0 = r0.A0B
            X.2Dm r3 = X.1bJ.A00(r0)
            return r3
        L_0x0104:
            java.lang.Object r0 = r8.A01
            X.JZO r0 = (X.JZO) r0
            com.instagram.common.session.UserSession r0 = r0.A01
            X.2Dm r3 = X.1bJ.A00(r0)
            return r3
        L_0x010f:
            java.lang.Object r0 = r8.A01
            X.KX6 r0 = (X.KX6) r0
            com.instagram.common.session.UserSession r0 = r0.A02
            X.2Dm r3 = X.2L2.A00(r0)
            return r3
        L_0x011a:
            java.lang.Object r0 = r8.A01
            X.Ttm r0 = (X.C14312Ttm) r0
            X.TuM r0 = r0.A04
            if (r0 == 0) goto L_0x0134
            X.Tto r0 = r0.A08
            goto L_0x012f
        L_0x0125:
            java.lang.Object r0 = r8.A01
            X.Ttm r0 = (X.C14312Ttm) r0
            X.TuM r0 = r0.A04
            if (r0 == 0) goto L_0x0134
            java.lang.Object r0 = r0.A03
        L_0x012f:
            X.3xP r3 = X.C257443xP.A00(r0)
            return r3
        L_0x0134:
            r0 = 0
            goto L_0x012f
        L_0x0136:
            java.lang.Object r0 = r8.A01
            X.KfY r0 = (X.C62423KfY) r0
            X.MVr r3 = r0.A0F
            return r3
        L_0x013d:
            java.lang.Object r0 = r8.A01
            X.KfX r0 = (X.C62422KfX) r0
            X.MVr r3 = r0.A07
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MBH.get():java.lang.Object");
    }
}
