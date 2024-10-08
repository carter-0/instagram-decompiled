package X;

import android.content.Context;

/* renamed from: X.Ug4  reason: case insensitive filesystem */
public final class C15638Ug4 extends C14097Tpp {
    /* JADX WARNING: type inference failed for: r13v0, types: [X.4DU, X.0iw, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v1, types: [X.0rm, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001c, code lost:
        r2 = r12.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0O(android.view.View r32, X.C307786Rm r33, X.C276544tV r34, boolean r35) {
        /*
            r31 = this;
            r3 = 0
            r10 = 1
            r14 = r33
            X.0qQ.A0B(r14, r10)
            java.lang.String r9 = "HeroCarouselTryInARRenderUnit"
            com.instagram.common.session.UserSession r15 = X.C18182Vmw.A00(r14, r9)
            if (r15 == 0) goto L_0x01e5
            X.WWe r13 = new X.WWe
            r13.<init>()
            r23 = 0
            X.VZO r12 = X.C18680Vwd.A02(r14, r15, r9)
            if (r12 == 0) goto L_0x01e5
            com.instagram.shopping.intf.ProductDetailsPageArguments r2 = r12.A00
            com.instagram.user.model.Product r1 = r2.A06
            if (r1 == 0) goto L_0x01e5
            r4 = 40
            r17 = 0
            java.lang.String r20 = ""
            r7 = r20
            r5 = r34
            java.lang.String r0 = r5.A0K(r4)
            if (r0 == 0) goto L_0x0034
            r20 = r0
        L_0x0034:
            r21 = r7
            java.lang.String r0 = r5.A0G()
            if (r0 == 0) goto L_0x003e
            r21 = r0
        L_0x003e:
            r22 = r7
            java.lang.String r0 = r5.A0I()
            if (r0 == 0) goto L_0x0048
            r22 = r0
        L_0x0048:
            r28 = r7
            java.lang.String r0 = r5.A0H()
            if (r0 == 0) goto L_0x0052
            r28 = r0
        L_0x0052:
            r6 = r7
            java.lang.String r0 = r5.A0F()
            if (r0 == 0) goto L_0x005a
            r6 = r0
        L_0x005a:
            r0 = 46
            boolean r8 = r5.A0R(r0, r3)
            java.util.Map r0 = com.instagram.api.schemas.ContainerEffectEnum.A01
            java.lang.Object r0 = r0.get(r6)
            com.instagram.api.schemas.ContainerEffectEnum r0 = (com.instagram.api.schemas.ContainerEffectEnum) r0
            if (r0 != 0) goto L_0x006c
            com.instagram.api.schemas.ContainerEffectEnum r0 = com.instagram.api.schemas.ContainerEffectEnum.UNRECOGNIZED
        L_0x006c:
            com.instagram.api.schemas.DynamicEffectState r26 = com.instagram.api.schemas.DynamicEffectState.ENABLED
            com.instagram.model.shopping.ProductArEffectMetadata r18 = new com.instagram.model.shopping.ProductArEffectMetadata
            r24 = r18
            r25 = r0
            r27 = r23
            r29 = r23
            r30 = r23
            r24.<init>(r25, r26, r27, r28, r29, r30)
            r0 = 45
            X.4tV r0 = r5.A07(r0)
            if (r0 == 0) goto L_0x00aa
            java.lang.String r5 = r0.A0H()
            if (r5 == 0) goto L_0x008c
            r7 = r5
        L_0x008c:
            int r4 = r0.A03(r4, r3)
            r5 = 35
            int r5 = r0.A03(r5, r3)
            com.instagram.model.mediasize.ExtendedImageUrl r0 = new com.instagram.model.mediasize.ExtendedImageUrl
            r0.<init>(r7, r4, r5)
            java.util.ArrayList r28 = X.DbV.A14(r0)
            com.instagram.model.mediasize.ImageInfoImpl r17 = new com.instagram.model.mediasize.ImageInfoImpl
            r24 = r17
            r25 = r23
            r26 = r23
            r24.<init>(r25, r26, r27, r28, r29)
        L_0x00aa:
            java.lang.Boolean r19 = java.lang.Boolean.valueOf(r8)
            X.Urd r0 = new X.Urd
            r24 = r23
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            X.0rm r7 = new X.0rm
            r7.<init>()
            X.W2j r8 = new X.W2j
            r8.<init>()
            r8.A09 = r1
            r8.A08 = r1
            X.Uw7 r18 = X.Uw7.A02
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.util.HashMap r21 = new java.util.HashMap
            r21.<init>()
            java.util.List r5 = X.AnonymousClass7TE.A1I(r0)
            java.lang.String r4 = X.W1L.A00(r15, r1)
            r6.put(r4, r5)
            X.W1L r4 = new X.W1L
            r16 = r4
            r17 = r23
            r19 = r23
            r20 = r23
            r22 = r6
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r8.A04 = r4
            X.Vuf r4 = new X.Vuf
            r4.<init>(r8)
            r7.A00 = r4
            android.content.Context r5 = r14.A00
            X.Wcd r4 = new X.Wcd
            r4.<init>(r7)
            X.Vkr r6 = new X.Vkr
            r6.<init>(r5, r15, r13, r4)
            r4 = 17
            X.Wvs r8 = new X.Wvs
            r8.<init>(r7, r4)
            X.Wd9 r4 = new X.Wd9
            r16 = r4
            r18 = r8
            r21 = r23
            r22 = r23
            r16.<init>(r17, r18, r19, r20, r21, r22)
            X.DbS.A1X(r5)
            r11 = r5
            android.app.Activity r11 = (android.app.Activity) r11
            java.lang.String r8 = r2.A0Q
            java.lang.String r2 = r2.A0H
            X.VzJ r17 = new X.VzJ
            r18 = r11
            r19 = r15
            r20 = r4
            r21 = r8
            r22 = r2
            r17.<init>(r18, r19, r20, r21, r22)
            java.lang.Object r7 = r7.A00
            X.0qQ.A06(r7)
            X.Vuf r7 = (X.C18588Vuf) r7
            r2 = 2
            X.0qQ.A0B(r7, r2)
            X.Wcn r11 = new X.Wcn
            r18 = r4
            r19 = r7
            r20 = r1
            r16 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.String r6 = r1.A0H
            X.W1W r6 = X.C18182Vmw.A01(r12, r15, r13, r4, r6)
            X.2el r4 = X.2el.A00()
            X.2eX r8 = new X.2eX
            r7 = r32
            r8.<init>(r7)
            r4.A06(r7, r8)
            X.1wY r20 = X.1wY.A00(r15)
            X.0qQ.A07(r20)
            X.VYb r16 = new X.VYb
            r21 = r35
            r17 = r5
            r18 = r15
            r19 = r13
            r16.<init>(r17, r18, r19, r20, r21)
            X.0qQ.A0B(r6, r2)
            X.VkS r2 = new X.VkS
            r14 = r2
            r16 = r4
            r17 = r23
            r18 = r6
            r19 = r11
            r20 = r3
            r14.<init>(r15, r16, r17, r18, r19, r20)
            X.UAW r6 = new X.UAW
            r6.<init>(r5, r15)
            java.lang.Object r4 = r7.getTag()
            java.lang.String r5 = "null cannot be cast to non-null type com.instagram.shopping.adapter.pdp.herocarousel.HeroCarouselARViewBinder.Holder"
            X.0qQ.A0C(r4, r5)
            X.UDW r4 = (X.UDW) r4
            X.VsD r7 = new X.VsD
            r7.<init>(r15, r11, r2)
            X.Uxz r17 = X.C16605Uxz.LOADED
            X.Vbr r2 = new X.Vbr
            r16 = r2
            r18 = r1
            r19 = r9
            r20 = r23
            r21 = r10
            r22 = r3
            r23 = r3
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            r1 = 3
            X.GNG r5 = new X.GNG
            r5.<init>(r1, r11, r0)
            X.VkS r1 = r7.A02
            r1.A01(r0, r2)
            java.lang.String r3 = r0.A06
            java.lang.String r1 = r0.A05
            X.WSi r2 = X.C18464VsD.A00(r0, r2, r5)
            X.0qQ.A0B(r4, r10)
            X.Vtn r7 = X.C18535Vtn.A00
            X.VZm r0 = r4.A03
            r8 = r13
            r9 = r15
            r10 = r0
            r11 = r6
            r12 = r2
            r7.A00(r8, r9, r10, r11, r12)
            android.widget.TextView r0 = r4.A01
            r0.setText(r3)
            android.widget.TextView r0 = r4.A00
            r0.setText(r1)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r4.A02
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r1)
            com.instagram.model.mediasize.ExtendedImageUrl r0 = r2.A00(r0)
            if (r0 == 0) goto L_0x01e6
            r1.setUrl(r0, r13)
        L_0x01e5:
            return
        L_0x01e6:
            r1.A09()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15638Ug4.A0O(android.view.View, X.6Rm, X.4tV, boolean):void");
    }

    public final /* bridge */ /* synthetic */ Object ALg(Context context) {
        return A0J(context);
    }
}
