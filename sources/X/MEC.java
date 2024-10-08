package X;

public final class MEC extends C64101El {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX WARNING: type inference failed for: r12v0, types: [java.lang.Object, X.MEC, X.4D7] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            r8 = r12
            int r0 = r12.A03
            switch(r0) {
                case 0: goto L_0x0016;
                case 1: goto L_0x001f;
                case 2: goto L_0x0028;
                case 3: goto L_0x0034;
                case 4: goto L_0x003e;
                case 5: goto L_0x0047;
                case 6: goto L_0x0057;
                case 7: goto L_0x0065;
                case 8: goto L_0x006e;
                case 9: goto L_0x007d;
                case 10: goto L_0x0087;
                case 11: goto L_0x0087;
                case 12: goto L_0x0087;
                case 13: goto L_0x0094;
                case 14: goto L_0x00a1;
                case 15: goto L_0x007d;
                case 16: goto L_0x00ae;
                case 17: goto L_0x00bc;
                case 18: goto L_0x00cc;
                case 19: goto L_0x00dc;
                case 20: goto L_0x00e9;
                case 21: goto L_0x00f6;
                case 22: goto L_0x0106;
                case 23: goto L_0x0087;
                case 24: goto L_0x0087;
                case 25: goto L_0x007d;
                case 26: goto L_0x0113;
                case 27: goto L_0x011c;
                case 28: goto L_0x0172;
                case 29: goto L_0x01bf;
                case 30: goto L_0x01d1;
                case 31: goto L_0x01e4;
                case 32: goto L_0x01f1;
                case 33: goto L_0x007d;
                case 34: goto L_0x007d;
                case 35: goto L_0x007d;
                case 36: goto L_0x007d;
                case 37: goto L_0x0087;
                case 38: goto L_0x0087;
                case 39: goto L_0x0087;
                case 40: goto L_0x0087;
                case 41: goto L_0x007d;
                case 42: goto L_0x007d;
                case 43: goto L_0x0087;
                case 44: goto L_0x0087;
                case 45: goto L_0x0087;
                case 46: goto L_0x0087;
                case 47: goto L_0x0087;
                case 48: goto L_0x01fe;
                default: goto L_0x0006;
            }
        L_0x0006:
            A01(r13, r12)
            java.lang.Object r3 = r12.A02
            com.instagram.appreciation.giftfeed.repository.AppreciationGiftFeedDataSource r3 = (com.instagram.appreciation.giftfeed.repository.AppreciationGiftFeedDataSource) r3
            r4 = 0
            r5 = r4
            r6 = r4
            r7 = r4
            java.lang.Object r0 = r3.A00(r4, r5, r6, r7, r8)
            return r0
        L_0x0016:
            A02(r13, r12)
            r0 = 0
            java.lang.Object r0 = androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt.A00(r0, r12)
            return r0
        L_0x001f:
            A02(r13, r12)
            r0 = 0
            java.lang.Object r0 = androidx.compose.foundation.gestures.ForEachGestureKt.A00(r0, r12)
            return r0
        L_0x0028:
            A01(r13, r12)
            java.lang.Object r0 = r12.A02
            androidx.compose.foundation.gestures.PressGestureScopeImpl r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl) r0
            java.lang.Object r0 = r0.AD2(r12)
            return r0
        L_0x0034:
            A02(r13, r12)
            r1 = 0
            r0 = 0
            java.lang.Object r0 = androidx.compose.foundation.gestures.ScrollExtensionsKt.A00(r1, r1, r12, r0)
            return r0
        L_0x003e:
            A02(r13, r12)
            r0 = 0
            java.lang.Object r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A02(r0, r12)
            return r0
        L_0x0047:
            A01(r13, r12)
            java.lang.Object r7 = r12.A02
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior r7 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehavior) r7
            r6 = 0
            r10 = 0
            r9 = r6
            r11 = r10
            java.lang.Object r0 = androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.A01(r6, r7, r8, r9, r10, r11)
            return r0
        L_0x0057:
            A01(r13, r12)
            java.lang.Object r2 = r12.A02
            androidx.compose.foundation.pager.PagerWrapperFlingBehavior r2 = (androidx.compose.foundation.pager.PagerWrapperFlingBehavior) r2
            r1 = 0
            r0 = 0
            java.lang.Object r0 = r2.E2W(r1, r12, r0)
            return r0
        L_0x0065:
            A02(r13, r12)
            r0 = 0
            java.lang.Object r0 = androidx.compose.foundation.text.selection.SelectionGesturesKt.A02(r0, r12)
            return r0
        L_0x006e:
            A01(r13, r12)
            java.lang.Object r3 = r12.A02
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine r3 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) r3
            r1 = 0
            r0 = 0
            java.lang.Object r0 = r3.FNZ(r12, r0, r1)
            return r0
        L_0x007d:
            A02(r13, r12)
            java.lang.Object r0 = r12.A01
            java.lang.Object r0 = X.MCn.A00(r0, r12)
            return r0
        L_0x0087:
            A02(r13, r12)
            java.lang.Object r1 = r12.A01
            X.MCh r1 = (X.C66118MCh) r1
            r0 = 0
            java.lang.Object r0 = r1.emit(r0, r12)
            return r0
        L_0x0094:
            A02(r13, r12)
            java.lang.Object r1 = r12.A01
            androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$5$$inlined$map$1$2 r1 = (androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$5$$inlined$map$1$2) r1
            r0 = 0
            java.lang.Object r0 = r1.emit(r0, r12)
            return r0
        L_0x00a1:
            A01(r13, r12)
            java.lang.Object r1 = r12.A02
            X.MCh r1 = (X.C66118MCh) r1
            r0 = 0
            java.lang.Object r0 = r1.A01(r0, r12)
            return r0
        L_0x00ae:
            A01(r13, r12)
            java.lang.Object r2 = r12.A02
            com.aiplatform.tools.upload.ig.ImageUploadTool r2 = (com.aiplatform.tools.upload.ig.ImageUploadTool) r2
            r1 = 0
            r0 = 0
            java.lang.Object r0 = com.aiplatform.tools.upload.ig.ImageUploadTool.A00(r2, r1, r1, r12, r0)
            return r0
        L_0x00bc:
            A01(r13, r12)
            java.lang.Object r3 = r12.A02
            com.bloks.components.bkavatareditorsparkavatarpreview.BKBloksAvatarEditorSparkAvatarPreviewRenderUnit r3 = (com.bloks.components.bkavatareditorsparkavatarpreview.BKBloksAvatarEditorSparkAvatarPreviewRenderUnit) r3
            r4 = 0
            r5 = r4
            r6 = r4
            r7 = r4
            java.lang.Object r0 = r3.A0O(r4, r5, r6, r7, r8)
            return r0
        L_0x00cc:
            A01(r13, r12)
            java.lang.Object r4 = r12.A02
            com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl r4 = (com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl) r4
            r5 = 0
            r9 = 0
            r6 = r5
            r7 = r5
            java.lang.Object r0 = r4.A04(r5, r6, r7, r8, r9)
            return r0
        L_0x00dc:
            A01(r13, r12)
            java.lang.Object r1 = r12.A02
            com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl r1 = (com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl) r1
            r0 = 0
            java.lang.Object r0 = com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl.A00(r1, r0, r12)
            return r0
        L_0x00e9:
            A01(r13, r12)
            java.lang.Object r1 = r12.A02
            com.facebook.avatar.expresso.odr.ODRController r1 = (com.facebook.avatar.expresso.odr.ODRController) r1
            r0 = 0
            java.lang.Object r0 = com.facebook.avatar.expresso.odr.ODRController.A06(r1, r0, r0, r12)
            return r0
        L_0x00f6:
            A01(r13, r12)
            java.lang.Object r4 = r12.A02
            com.facebook.avatar.expresso.odr.ODRController r4 = (com.facebook.avatar.expresso.odr.ODRController) r4
            r5 = 0
            r9 = 0
            r6 = r5
            r7 = r5
            java.lang.Object r0 = com.facebook.avatar.expresso.odr.ODRController.A04(r4, r5, r6, r7, r8, r9)
            return r0
        L_0x0106:
            A01(r13, r12)
            java.lang.Object r1 = r12.A02
            com.facebook.avatar.expresso.odr.network.ODRNetworkDownloader r1 = (com.facebook.avatar.expresso.odr.network.ODRNetworkDownloader) r1
            r0 = 0
            java.lang.Object r0 = r1.A00(r0, r0, r0, r12)
            return r0
        L_0x0113:
            A02(r13, r12)
            r0 = 0
            X.1Hj r0 = X.MHP.A00(r0, r12)
            return r0
        L_0x011c:
            r12.A01 = r13
            int r5 = r12.A00
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r5 | r4
            r12.A00 = r5
            java.lang.Object r2 = r12.A02
            r1 = 27
            boolean r0 = A03(r1, r12)
            if (r0 == 0) goto L_0x0150
            r3 = r12
            r0 = r5 & r4
            if (r0 == 0) goto L_0x0150
            int r5 = r5 - r4
            r12.A00 = r5
        L_0x0137:
            java.lang.Object r2 = r3.A01
            int r1 = r3.A00
            r0 = 1
            if (r1 == 0) goto L_0x015a
            if (r1 != r0) goto L_0x0155
            X.0eS.A00(r2)
            X.S21 r2 = (X.S21) r2
            X.SUj r1 = r2.A00()
            X.LZS r0 = X.LZS.A00
            X.SUj r0 = X.SUj.A03(r0, r1)
            return r0
        L_0x0150:
            X.MEC r3 = A00(r2, r12, r1)
            goto L_0x0137
        L_0x0155:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x015a:
            X.0eS.A00(r2)
            r3.A00 = r0
            java.lang.Class<X.LGp> r0 = X.LGp.class
            X.C41847B3o.A16(r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x016b }
            java.lang.String r0 = "getAddressId"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x016b:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0172:
            r12.A01 = r13
            int r5 = r12.A00
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r5 | r4
            r12.A00 = r5
            java.lang.Object r2 = r12.A02
            r1 = 28
            boolean r0 = A03(r1, r12)
            if (r0 == 0) goto L_0x01a6
            r3 = r12
            r0 = r5 & r4
            if (r0 == 0) goto L_0x01a6
            int r5 = r5 - r4
            r12.A00 = r5
        L_0x018d:
            java.lang.Object r2 = r3.A01
            int r1 = r3.A00
            r0 = 1
            if (r1 == 0) goto L_0x01b0
            if (r1 != r0) goto L_0x01ab
            X.0eS.A00(r2)
            X.S21 r2 = (X.S21) r2
            X.SUj r1 = r2.A00()
            X.ScD r0 = X.C11552ScD.A00
            X.SUj r0 = X.SUj.A03(r0, r1)
            return r0
        L_0x01a6:
            X.MEC r3 = A00(r2, r12, r1)
            goto L_0x018d
        L_0x01ab:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x01b0:
            X.0eS.A00(r2)
            r3.A00 = r0
            X.C62999Kpp.A00()
            java.lang.String r0 = "getQueryInput"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x01bf:
            A01(r13, r12)
            java.lang.Object r1 = r12.A02
            com.facebookpay.expresscheckout.api.executor.ECPCheckoutSetupMutationAPI r1 = (com.facebookpay.expresscheckout.api.executor.ECPCheckoutSetupMutationAPI) r1
            r2 = 0
            r3 = r2
            r4 = r2
            r5 = r2
            r6 = r2
            r7 = r2
            java.lang.Object r0 = r1.A00(r2, r3, r4, r5, r6, r7, r8)
            return r0
        L_0x01d1:
            A01(r13, r12)
            java.lang.Object r0 = r12.A02
            com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r0 = (com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl) r0
            r1 = 0
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            java.lang.Object r0 = r0.A04(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
        L_0x01e4:
            A01(r13, r12)
            java.lang.Object r1 = r12.A02
            com.facebookpay.offsite.repositoriesimpl.OffsitePaymentRepositoryImpl r1 = (com.facebookpay.offsite.repositoriesimpl.OffsitePaymentRepositoryImpl) r1
            r0 = 0
            java.lang.Object r0 = r1.A00(r0, r12)
            return r0
        L_0x01f1:
            A01(r13, r12)
            java.lang.Object r1 = r12.A02
            com.facebookpay.offsite.repositoriesimpl.OffsitePaymentRepositoryImpl r1 = (com.facebookpay.offsite.repositoriesimpl.OffsitePaymentRepositoryImpl) r1
            r0 = 0
            java.lang.Object r0 = r1.A01(r0, r12)
            return r0
        L_0x01fe:
            A01(r13, r12)
            java.lang.Object r1 = r12.A02
            com.instagram.appreciation.giftfeed.repository.AppreciationGiftFeedDataSource r1 = (com.instagram.appreciation.giftfeed.repository.AppreciationGiftFeedDataSource) r1
            r0 = 0
            java.lang.Object r0 = r1.A01(r0, r0, r0, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MEC.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MEC(Object obj, AnonymousClass4D7 r2, int i, int i2) {
        super(r2);
        this.A03 = i;
        this.A02 = obj;
    }

    public static MEC A00(Object obj, AnonymousClass4D7 r3, int i) {
        return new MEC(obj, r3, i, 42);
    }

    public static void A01(Object obj, MEC mec) {
        mec.A01 = obj;
        mec.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public static void A02(Object obj, MEC mec) {
        mec.A02 = obj;
        mec.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public static boolean A03(int i, Object obj) {
        if (!(obj instanceof MEC) || ((MEC) obj).A03 != i) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MEC(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A03 = i;
        this.A01 = obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MEC(int i, AnonymousClass4D7 r2) {
        super(r2);
        this.A03 = i;
    }
}
