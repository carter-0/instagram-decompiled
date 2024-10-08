package X;

public final class NC9 extends C232922uf {
    public final int A00;
    public final Object A01;

    public NC9(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ce, code lost:
        if (r11 > 270.0f) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d8, code lost:
        if (r2 == false) goto L_0x00da;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0196  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DmE(X.2cs r18) {
        /*
            r17 = this;
            r3 = r17
            int r0 = r3.A00
            r6 = r18
            switch(r0) {
                case 0: goto L_0x0134;
                case 1: goto L_0x008a;
                case 2: goto L_0x0020;
                default: goto L_0x0009;
            }
        L_0x0009:
            r0 = 0
            X.0qQ.A0B(r6, r0)
            X.2ct r0 = r6.A09
            double r0 = r0.A00
            float r2 = (float) r0
            java.lang.Object r0 = r3.A01
            X.OEL r0 = (X.OEL) r0
            r0.A00 = r2
            X.6Yq r1 = r0.A02
            android.view.View r0 = r0.A01
            r1.A00(r0, r2)
        L_0x001f:
            return
        L_0x0020:
            if (r18 == 0) goto L_0x001f
            java.lang.Object r7 = r3.A01
            X.MmD r7 = (X.C67337MmD) r7
            X.MmG r0 = r7.A0B
            X.0eM r5 = r0.A02
            android.view.View r3 = X.AnonymousClass7TE.A0c(r5)
            X.2ct r0 = r6.A09
            double r1 = r0.A00
            float r0 = (float) r1
            r3.setAlpha(r0)
            android.view.View r0 = X.AnonymousClass7TE.A0c(r5)
            float r1 = r0.getAlpha()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x01ba
            r4 = 0
            r7.A03 = r4
            java.lang.Object r0 = r5.getValue()
            X.C51969G9p.A1M(r0)
            X.MmF r3 = r7.A09
            boolean r0 = r3.A09
            if (r0 == 0) goto L_0x02a7
            long r8 = java.lang.System.currentTimeMillis()
            long r0 = r3.A04
            long r8 = r8 - r0
            r3.A06 = r8
            X.0wc r1 = r3.A0A
            java.lang.String r0 = "ig_highlights_scrubber_action"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x028a
            java.util.Map r0 = r3.A0C
            java.util.Collection r0 = r0.values()
            r8 = 0
            java.util.Iterator r6 = r0.iterator()
        L_0x0076:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x021b
            java.lang.Object r0 = r6.next()
            X.59G r0 = (X.AnonymousClass59G) r0
            java.lang.Object r0 = r0.A02
            long r0 = X.AnonymousClass7TE.A0R(r0)
            long r8 = r8 + r0
            goto L_0x0076
        L_0x008a:
            java.lang.Object r4 = r3.A01
            X.OTv r4 = (X.C70974OTv) r4
            X.2cs r6 = r4.A09
            X.2ct r3 = r6.A09
            double r7 = r3.A00
            r0 = 4640537203540230144(0x4066800000000000, double:180.0)
            double r7 = r7 * r0
            r0 = 4645040803167600640(0x4076800000000000, double:360.0)
            double r7 = r7 % r0
            float r11 = (float) r7
            r1 = 0
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00a9
            r0 = 1135869952(0x43b40000, float:360.0)
            float r11 = r11 + r0
        L_0x00a9:
            r10 = 1132920832(0x43870000, float:270.0)
            r12 = 1119092736(0x42b40000, float:90.0)
            int r0 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r0 > 0) goto L_0x011e
            r0 = 1056964608(0x3f000000, float:0.5)
            float r8 = X.0mi.A02(r11, r12, r1, r1, r0)
        L_0x00b7:
            android.view.View r0 = r4.A05
            r0.setRotationY(r11)
            android.view.View r9 = r4.A04
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            r9.setScaleX(r7)
            X.JTR.A1B(r0)
            r5 = 0
            int r0 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x00d0
            int r0 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            r2 = 0
            if (r0 <= 0) goto L_0x00d1
        L_0x00d0:
            r2 = 1
        L_0x00d1:
            android.widget.ImageView r1 = r4.A08
            boolean r0 = r4.A0B
            if (r0 == 0) goto L_0x00da
            r0 = 0
            if (r2 != 0) goto L_0x00db
        L_0x00da:
            r0 = 4
        L_0x00db:
            r1.setVisibility(r0)
            android.view.View r1 = r4.A06
            r0 = 4
            if (r2 == 0) goto L_0x00e4
            r0 = 0
        L_0x00e4:
            r1.setVisibility(r0)
            if (r2 == 0) goto L_0x00ea
            r5 = 4
        L_0x00ea:
            r9.setVisibility(r5)
            android.widget.ImageView r0 = r4.A07
            if (r2 == 0) goto L_0x00f3
            r7 = 1065353216(0x3f800000, float:1.0)
        L_0x00f3:
            r0.setScaleX(r7)
            X.U11 r0 = r4.A0A
            r0.A00 = r8
            r0.invalidateSelf()
            X.2co r1 = r6.A05
            X.2co r0 = X.C70974OTv.A0C
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001f
            double r4 = r3.A01
            double r2 = java.lang.Math.abs(r4)
            r0 = 4599976659396224614(0x3fd6666666666666, double:0.35)
            double r0 = java.lang.Math.max(r2, r0)
            double r0 = java.lang.Math.copySign(r0, r4)
            r6.A07(r0)
            return
        L_0x011e:
            int r0 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r0 > 0) goto L_0x0129
            r0 = 1065353216(0x3f800000, float:1.0)
            float r8 = X.0mi.A02(r11, r10, r12, r1, r0)
            goto L_0x00b7
        L_0x0129:
            r2 = 1135869952(0x43b40000, float:360.0)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = 1056964608(0x3f000000, float:0.5)
            float r8 = X.0mi.A02(r11, r10, r2, r1, r0)
            goto L_0x00b7
        L_0x0134:
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.Object r5 = r3.A01
            com.facebook.common.draggableview.DraggableViewContainer r5 = (com.facebook.common.draggableview.DraggableViewContainer) r5
            int r0 = r5.A06
            if (r0 > 0) goto L_0x001f
            X.2cs r4 = r5.A0K
            boolean r0 = r6.equals(r4)
            if (r0 == 0) goto L_0x01a5
            android.view.View r3 = r5.A09
            if (r3 == 0) goto L_0x0154
            X.2ct r0 = r4.A09
            double r1 = r0.A00
            float r0 = (float) r1
            r3.setTranslationX(r0)
        L_0x0154:
            boolean r0 = r5.A0C
            if (r0 == 0) goto L_0x001f
            boolean r0 = r6.equals(r4)
            if (r0 == 0) goto L_0x001f
            android.view.View r2 = r5.A09
            if (r2 == 0) goto L_0x001f
            int r0 = r2.getWidth()
            if (r0 == 0) goto L_0x001f
            int r0 = r2.getWidth()
            double r3 = (double) r0
            int r0 = r5.getWidth()
            double r11 = (double) r0
            r5 = 4596373779801702400(0x3fc99999a0000000, double:0.20000000298023224)
            double r5 = r5 * r3
            float r0 = r2.getX()
            double r7 = (double) r0
            r9 = 0
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x019a
            double r11 = -r3
            double r11 = r11 + r5
        L_0x0185:
            r13 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r15 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r3 = X.AnonymousClass37Q.A04(r7, r9, r11, r13, r15)
        L_0x018d:
            float r1 = (float) r3
            float r0 = r2.getAlpha()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x001f
            r2.setAlpha(r1)
            return
        L_0x019a:
            double r9 = r11 - r3
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x01a2
            double r11 = r11 - r5
            goto L_0x0185
        L_0x01a2:
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L_0x018d
        L_0x01a5:
            X.2cs r1 = r5.A0L
            boolean r0 = r6.equals(r1)
            if (r0 == 0) goto L_0x0154
            android.view.View r3 = r5.A09
            if (r3 == 0) goto L_0x0154
            X.2ct r0 = r1.A09
            double r1 = r0.A00
            float r0 = (float) r1
            r3.setTranslationY(r0)
            goto L_0x0154
        L_0x01ba:
            boolean r0 = r7.A03
            if (r0 != 0) goto L_0x02a7
            r8 = 1
            r7.A03 = r8
            android.view.View r1 = X.AnonymousClass7TE.A0c(r5)
            r0 = 0
            r1.setVisibility(r0)
            X.3mM r0 = r7.A01
            if (r0 == 0) goto L_0x0211
            com.instagram.model.reels.Reel r1 = r0.A0H
            X.MmF r6 = r7.A09
            java.lang.String r4 = r7.A02
            X.0qQ.A0B(r4, r8)
            r9 = -1
            X.1Ns r0 = r1.A0W     // Catch:{ NumberFormatException -> 0x01ed }
            if (r0 == 0) goto L_0x01ed
            java.lang.String r0 = r0.getId()     // Catch:{ NumberFormatException -> 0x01ed }
            if (r0 == 0) goto L_0x01ed
            java.lang.Long r0 = X.AnonymousClass7TE.A10(r0)     // Catch:{ NumberFormatException -> 0x01ed }
            if (r0 == 0) goto L_0x01ed
            long r2 = r0.longValue()     // Catch:{ NumberFormatException -> 0x01ed }
            goto L_0x01ef
        L_0x01ed:
            r2 = -1
        L_0x01ef:
            java.lang.String r1 = r1.getId()
            r6.A08 = r1
            boolean r0 = r6.A09
            if (r0 != 0) goto L_0x0211
            java.lang.String r0 = ""
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0211
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x0211
            long r0 = java.lang.System.currentTimeMillis()
            r6.A04 = r0
            r6.A05 = r2
            r6.A07 = r4
            r6.A09 = r8
        L_0x0211:
            X.C67337MmD.A00(r7)
            X.2S0 r0 = X.AnonymousClass2S0.A01
            r0.A04()
            goto L_0x02a7
        L_0x021b:
            java.lang.String r0 = "close"
            X.DbS.A1J(r2, r0)
            java.lang.String r1 = r3.A0B
            java.lang.String r0 = "container_module"
            r2.AAJ(r0, r1)
            java.lang.String r1 = r3.A07
            java.lang.String r0 = "click_point"
            r2.AAJ(r0, r1)
            long r0 = r3.A06
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "scrubber_time"
            r2.A9F(r0, r1)
            java.lang.String r1 = r3.A08
            java.lang.String r0 = "reel_id"
            r2.AAJ(r0, r1)
            long r0 = r3.A01
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "first_media_id"
            r2.A9F(r0, r1)
            long r0 = r3.A03
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "last_media_id"
            r2.A9F(r0, r1)
            long r0 = r3.A00
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "first_client_position"
            r2.A9F(r0, r1)
            long r0 = r3.A02
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r0 = 4586(0x11ea, float:6.426E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A9F(r0, r1)
            X.DbY.A1C(r2)
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            java.lang.String r0 = "media_count"
            r2.A9F(r0, r1)
            long r0 = r3.A05
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "profile_user_id"
            r2.A9F(r0, r1)
            r2.Cgf()
        L_0x028a:
            r3.A09 = r4
            r1 = -1
            r3.A04 = r1
            r3.A06 = r1
            java.lang.String r0 = "unknown"
            r3.A08 = r0
            r3.A07 = r0
            r3.A01 = r1
            r3.A03 = r1
            r3.A00 = r1
            r3.A02 = r1
            r3.A05 = r1
            java.util.Map r0 = r3.A0C
            r0.clear()
        L_0x02a7:
            X.MmE r2 = r7.A0C
            android.view.View r0 = X.AnonymousClass7TE.A0c(r5)
            float r1 = r0.getAlpha()
            X.6lA r0 = r2.A00
            r0.A01 = r1
            r0.A00()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NC9.DmE(X.2cs):void");
    }
}
