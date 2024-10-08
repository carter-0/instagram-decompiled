package X;

/* renamed from: X.MDw  reason: case insensitive filesystem */
public final class C66144MDw extends C64101El {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66144MDw(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A04 = i;
        this.A03 = obj;
    }

    public static void A00(Object obj, C66144MDw mDw) {
        mDw.A02 = obj;
        mDw.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public static void A01(Object obj, C66144MDw mDw) {
        mDw.A03 = obj;
        mDw.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public static boolean A02(int i, Object obj) {
        if (!(obj instanceof C66144MDw) || ((C66144MDw) obj).A04 != i) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.MDw, java.lang.Object, X.4D7] */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x022c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.A04
            switch(r0) {
                case 0: goto L_0x0012;
                case 1: goto L_0x001e;
                case 2: goto L_0x0029;
                case 3: goto L_0x0034;
                case 4: goto L_0x003f;
                case 5: goto L_0x004b;
                case 6: goto L_0x0057;
                case 7: goto L_0x0062;
                case 8: goto L_0x006b;
                case 9: goto L_0x0074;
                case 10: goto L_0x0081;
                case 11: goto L_0x008d;
                case 12: goto L_0x008d;
                case 13: goto L_0x0097;
                case 14: goto L_0x008d;
                case 15: goto L_0x00a4;
                case 16: goto L_0x00b1;
                case 17: goto L_0x00be;
                case 18: goto L_0x00cb;
                case 19: goto L_0x00d8;
                case 20: goto L_0x00e4;
                case 21: goto L_0x00f1;
                case 22: goto L_0x0102;
                case 23: goto L_0x010f;
                case 24: goto L_0x011c;
                case 25: goto L_0x0129;
                case 26: goto L_0x0136;
                case 27: goto L_0x0143;
                case 28: goto L_0x0151;
                case 29: goto L_0x015f;
                case 30: goto L_0x016b;
                case 31: goto L_0x0178;
                case 32: goto L_0x0185;
                case 33: goto L_0x0191;
                case 34: goto L_0x019e;
                case 35: goto L_0x01ab;
                case 36: goto L_0x01b8;
                case 37: goto L_0x01c5;
                case 38: goto L_0x01d2;
                case 39: goto L_0x01df;
                case 40: goto L_0x01ef;
                case 41: goto L_0x01ef;
                case 42: goto L_0x01fc;
                case 43: goto L_0x0209;
                case 44: goto L_0x0266;
                case 45: goto L_0x0272;
                case 46: goto L_0x027f;
                case 47: goto L_0x028c;
                case 48: goto L_0x0299;
                default: goto L_0x0005;
            }
        L_0x0005:
            A00(r8, r7)
            java.lang.Object r1 = r7.A03
            com.instagram.arp.api.AvatarTaskHelper r1 = (com.instagram.arp.api.AvatarTaskHelper) r1
            r0 = 0
            java.lang.Object r0 = com.instagram.arp.api.AvatarTaskHelper.A00(r1, r0, r7, r0)
            return r0
        L_0x0012:
            A00(r8, r7)
            java.lang.Object r0 = r7.A03
            androidx.compose.foundation.HoverableNode r0 = (androidx.compose.foundation.HoverableNode) r0
            java.lang.Object r0 = androidx.compose.foundation.HoverableNode.A01(r0, r7)
            return r0
        L_0x001e:
            A01(r8, r7)
            r2 = 0
            r0 = 0
            java.lang.Object r0 = androidx.compose.foundation.gestures.DragGestureDetectorKt.A00(r2, r7, r0)
            return r0
        L_0x0029:
            A01(r8, r7)
            r2 = 0
            r0 = 0
            java.lang.Object r0 = androidx.compose.foundation.gestures.DragGestureDetectorKt.A01(r2, r7, r0)
            return r0
        L_0x0034:
            A01(r8, r7)
            r2 = 0
            r0 = 0
            java.lang.Object r0 = androidx.compose.foundation.gestures.DragGestureDetectorKt.A02(r2, r7, r2, r0)
            return r0
        L_0x003f:
            A00(r8, r7)
            java.lang.Object r0 = r7.A03
            androidx.compose.foundation.gestures.PressGestureScopeImpl r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl) r0
            java.lang.Object r0 = r0.A00(r7)
            return r0
        L_0x004b:
            A00(r8, r7)
            java.lang.Object r0 = r7.A03
            androidx.compose.foundation.gestures.PressGestureScopeImpl r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl) r0
            java.lang.Object r0 = r0.FI7(r7)
            return r0
        L_0x0057:
            A01(r8, r7)
            r2 = 0
            r0 = 0
            java.lang.Object r0 = androidx.compose.foundation.gestures.ScrollableKt.A00(r2, r7, r0)
            return r0
        L_0x0062:
            A01(r8, r7)
            r0 = 0
            java.lang.Object r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A00(r0, r0, r7)
            return r0
        L_0x006b:
            A01(r8, r7)
            r0 = 0
            java.lang.Object r0 = androidx.compose.foundation.text.selection.SelectionGesturesKt.A01(r0, r0, r0, r0, r7)
            return r0
        L_0x0074:
            A00(r8, r7)
            java.lang.Object r1 = r7.A03
            androidx.compose.ui.scrollcapture.RelativeScroller r1 = (androidx.compose.ui.scrollcapture.RelativeScroller) r1
            r0 = 0
            java.lang.Object r0 = androidx.compose.ui.scrollcapture.RelativeScroller.A00(r1, r7, r0)
            return r0
        L_0x0081:
            A00(r8, r7)
            java.lang.Object r0 = r7.A03
            androidx.datastore.core.SingleProcessDataStore r0 = (androidx.datastore.core.SingleProcessDataStore) r0
            java.lang.Object r0 = androidx.datastore.core.SingleProcessDataStore.A02(r0, r7)
            return r0
        L_0x008d:
            A00(r8, r7)
            java.lang.Object r0 = r7.A03
            java.lang.Object r0 = X.MCn.A00(r0, r7)
            return r0
        L_0x0097:
            A00(r8, r7)
            java.lang.Object r1 = r7.A03
            androidx.paging.SeparatorState r1 = (androidx.paging.SeparatorState) r1
            r0 = 0
            java.lang.Object r0 = r1.A04(r0, r7)
            return r0
        L_0x00a4:
            A00(r8, r7)
            java.lang.Object r1 = r7.A03
            androidx.paging.SingleRunner r1 = (androidx.paging.SingleRunner) r1
            r0 = 0
            java.lang.Object r0 = r1.A00(r7, r0)
            return r0
        L_0x00b1:
            A00(r8, r7)
            java.lang.Object r1 = r7.A03
            com.aiplatform.tools.upload.ig.ImageUploadTool r1 = (com.aiplatform.tools.upload.ig.ImageUploadTool) r1
            r0 = 0
            java.lang.Object r0 = r1.A01(r0, r0, r0, r7)
            return r0
        L_0x00be:
            A00(r8, r7)
            java.lang.Object r1 = r7.A03
            com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl r1 = (com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl) r1
            r0 = 0
            java.lang.Object r0 = com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl.A01(r1, r0, r7)
            return r0
        L_0x00cb:
            A00(r8, r7)
            java.lang.Object r1 = r7.A03
            com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl r1 = (com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl) r1
            r0 = 0
            java.lang.Object r0 = com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl.A02(r1, r0, r7)
            return r0
        L_0x00d8:
            A00(r8, r7)
            java.lang.Object r0 = r7.A03
            com.facebook.avatar.expresso.graphql.asset.ODRAssetRepository r0 = (com.facebook.avatar.expresso.graphql.asset.ODRAssetRepository) r0
            java.lang.Object r0 = r0.A00(r7)
            return r0
        L_0x00e4:
            A00(r8, r7)
            java.lang.Object r1 = r7.A03
            com.facebook.avatar.expresso.instagram.ExpressoImpl r1 = (com.facebook.avatar.expresso.instagram.ExpressoImpl) r1
            r0 = 0
            java.lang.Object r0 = com.facebook.avatar.expresso.instagram.ExpressoImpl.A00(r1, r0, r7)
            return r0
        L_0x00f1:
            A00(r8, r7)
            java.lang.Object r2 = r7.A03
            com.facebook.avatar.expresso.odr.ODRController r2 = (com.facebook.avatar.expresso.odr.ODRController) r2
            r3 = 0
            r4 = r3
            r5 = r3
            r6 = r3
            r8 = r3
            java.lang.Object r0 = com.facebook.avatar.expresso.odr.ODRController.A02(r2, r3, r4, r5, r6, r7, r8)
            return r0
        L_0x0102:
            A00(r8, r7)
            java.lang.Object r1 = r7.A03
            com.facebook.avatar.expresso.odr.network.ExpressoTemplatePackAndUserInfo r1 = (com.facebook.avatar.expresso.odr.network.ExpressoTemplatePackAndUserInfo) r1
            r0 = 0
            java.lang.Object r0 = r1.A00(r0, r0, r0, r7)
            return r0
        L_0x010f:
            A00(r8, r7)
            java.lang.Object r1 = r7.A03
            com.facebook.caa.shared.passkey.PasskeyService r1 = (com.facebook.caa.shared.passkey.PasskeyService) r1
            r0 = 0
            java.lang.Object r0 = com.facebook.caa.shared.passkey.PasskeyService.A01(r1, r7, r0)
            return r0
        L_0x011c:
            A00(r8, r7)
            java.lang.Object r1 = r7.A03
            com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper r1 = (com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper) r1
            r0 = 0
            java.lang.Object r0 = r1.A02(r0, r7)
            return r0
        L_0x0129:
            A00(r8, r7)
            java.lang.Object r1 = r7.A03
            com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper r1 = (com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper) r1
            r0 = 0
            java.lang.Object r0 = com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper.A00(r1, r0, r7)
            return r0
        L_0x0136:
            A00(r8, r7)
            java.lang.Object r1 = r7.A03
            com.facebook.commonavatarliveediting.CdlProviderImpl r1 = (com.facebook.commonavatarliveediting.CdlProviderImpl) r1
            r0 = 0
            java.lang.Object r0 = com.facebook.commonavatarliveediting.CdlProviderImpl.A01(r1, r0, r7, r0)
            return r0
        L_0x0143:
            A00(r8, r7)
            java.lang.Object r2 = r7.A03
            com.facebook.fbavatar.cdsavatareditor.liveediting.ig.IgCdlProviderBuilder r2 = (com.facebook.fbavatar.cdsavatareditor.liveediting.ig.IgCdlProviderBuilder) r2
            r1 = 0
            r0 = 0
            java.lang.Object r0 = r2.A00(r1, r7, r0)
            return r0
        L_0x0151:
            A00(r8, r7)
            java.lang.Object r2 = r7.A03
            com.facebook.fbavatar.cdsavatareditor.liveediting.ig.IgCdlProviderBuilder r2 = (com.facebook.fbavatar.cdsavatareditor.liveediting.ig.IgCdlProviderBuilder) r2
            r1 = 0
            r0 = 0
            java.lang.Object r0 = r2.A01(r1, r7, r0)
            return r0
        L_0x015f:
            A00(r8, r7)
            java.lang.Object r0 = r7.A03
            com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession r0 = (com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession) r0
            java.lang.Object r0 = r0.A00(r7)
            return r0
        L_0x016b:
            A00(r8, r7)
            java.lang.Object r1 = r7.A03
            com.instagram.aistudio.editor.AiSettingsRepository r1 = (com.instagram.aistudio.editor.AiSettingsRepository) r1
            r0 = 0
            java.lang.Object r0 = r1.A08(r0, r0, r0, r7)
            return r0
        L_0x0178:
            A00(r8, r7)
            java.lang.Object r1 = r7.A03
            com.instagram.aistudio.home.repository.AiSearchRepository r1 = (com.instagram.aistudio.home.repository.AiSearchRepository) r1
            r0 = 0
            java.lang.Object r0 = r1.A00(r0, r7)
            return r0
        L_0x0185:
            A00(r8, r7)
            java.lang.Object r0 = r7.A03
            com.instagram.aistudio.yourais.YourAisRepository r0 = (com.instagram.aistudio.yourais.YourAisRepository) r0
            java.lang.Object r0 = r0.A00(r7)
            return r0
        L_0x0191:
            A00(r8, r7)
            java.lang.Object r1 = r7.A03
            com.instagram.appreciation.funding.AppreciationBuyAndSendViewModel r1 = (com.instagram.appreciation.funding.AppreciationBuyAndSendViewModel) r1
            r0 = 0
            java.lang.Object r0 = com.instagram.appreciation.funding.AppreciationBuyAndSendViewModel.A01(r1, r0, r7)
            return r0
        L_0x019e:
            A00(r8, r7)
            java.lang.Object r1 = r7.A03
            com.instagram.appreciation.funding.AppreciationFundingViewModel r1 = (com.instagram.appreciation.funding.AppreciationFundingViewModel) r1
            r0 = 0
            java.lang.Object r0 = com.instagram.appreciation.funding.AppreciationFundingViewModel.A00(r1, r0, r7)
            return r0
        L_0x01ab:
            A00(r8, r7)
            java.lang.Object r1 = r7.A03
            com.instagram.appreciation.funding.AppreciationFundingViewModel r1 = (com.instagram.appreciation.funding.AppreciationFundingViewModel) r1
            r0 = 0
            java.lang.Object r0 = com.instagram.appreciation.funding.AppreciationFundingViewModel.A01(r1, r0, r7)
            return r0
        L_0x01b8:
            A00(r8, r7)
            java.lang.Object r1 = r7.A03
            com.instagram.appreciation.gifting.repository.AppreciationGiftingRepository r1 = (com.instagram.appreciation.gifting.repository.AppreciationGiftingRepository) r1
            r0 = 0
            java.lang.Object r0 = r1.A00(r0, r7)
            return r0
        L_0x01c5:
            A00(r8, r7)
            java.lang.Object r1 = r7.A03
            X.Av3 r1 = (X.C41502Av3) r1
            r0 = 0
            java.lang.Object r0 = r1.emit(r0, r7)
            return r0
        L_0x01d2:
            A00(r8, r7)
            java.lang.Object r1 = r7.A03
            com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService r1 = (com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService) r1
            r0 = 0
            java.lang.Object r0 = com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService.A03(r1, r0, r0, r0, r7)
            return r0
        L_0x01df:
            A00(r8, r7)
            java.lang.Object r2 = r7.A03
            com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService r2 = (com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService) r2
            r3 = 0
            r4 = r3
            r5 = r3
            r6 = r3
            java.lang.Object r0 = com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService.A02(r2, r3, r4, r5, r6, r7)
            return r0
        L_0x01ef:
            A00(r8, r7)
            java.lang.Object r1 = r7.A03
            X.Av1 r1 = (X.C41500Av1) r1
            r0 = 0
            java.lang.Object r0 = r1.emit(r0, r7)
            return r0
        L_0x01fc:
            A00(r8, r7)
            java.lang.Object r1 = r7.A03
            com.instagram.ar.core.effectcollection.EffectCollectionService r1 = (com.instagram.ar.core.effectcollection.EffectCollectionService) r1
            r0 = 0
            java.lang.Object r0 = r1.A09(r0, r7)
            return r0
        L_0x0209:
            r7.A02 = r8
            int r6 = r7.A00
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r6 | r5
            r7.A00 = r6
            java.lang.Object r2 = r7.A03
            r4 = 0
            r1 = 43
            boolean r0 = A02(r1, r7)
            if (r0 == 0) goto L_0x024a
            r3 = r7
            r0 = r6 & r5
            if (r0 == 0) goto L_0x024a
            int r6 = r6 - r5
            r7.A00 = r6
        L_0x0225:
            java.lang.Object r2 = r3.A02
            int r1 = r3.A00
            r0 = 1
            if (r1 == 0) goto L_0x0255
            if (r1 != r0) goto L_0x0250
            java.lang.Object r1 = r3.A01
            X.L3I r1 = (X.L3I) r1
            X.0eS.A00(r2)
            boolean r0 = X.AnonymousClass7TE.A1a(r2)
            X.02m r3 = r1.A01
            int r2 = r1.A00
            r1 = 3
            if (r0 == 0) goto L_0x0241
            r1 = 2
        L_0x0241:
            r0 = 17642986(0x10d35ea, float:2.593629E-38)
            r3.markerEnd(r0, r2, r1)
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x024a:
            X.MDw r3 = new X.MDw
            r3.<init>(r2, r7, r1)
            goto L_0x0225
        L_0x0250:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0255:
            X.0eS.A00(r2)
            r1 = 0
            X.L3I r0 = new X.L3I
            r0.<init>()
            X.0qQ.A0B(r4, r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0266:
            A00(r8, r7)
            java.lang.Object r0 = r7.A03
            X.6dc r0 = (X.C311976dc) r0
            java.lang.Object r0 = X.C311976dc.A04(r0, r7)
            return r0
        L_0x0272:
            A00(r8, r7)
            java.lang.Object r1 = r7.A03
            X.MCh r1 = (X.C66118MCh) r1
            r0 = 0
            java.lang.Object r0 = r1.A02(r0, r7)
            return r0
        L_0x027f:
            A00(r8, r7)
            java.lang.Object r1 = r7.A03
            com.instagram.archive.data.ArchiveStoryRecycleBinRepository r1 = (com.instagram.archive.data.ArchiveStoryRecycleBinRepository) r1
            r0 = 0
            java.lang.Object r0 = r1.A00(r7, r0)
            return r0
        L_0x028c:
            A00(r8, r7)
            java.lang.Object r1 = r7.A03
            com.instagram.arp.api.AvatarEffectsApiController r1 = (com.instagram.arp.api.AvatarEffectsApiController) r1
            r0 = 0
            java.lang.Object r0 = com.instagram.arp.api.AvatarEffectsApiController.A00(r1, r7, r0)
            return r0
        L_0x0299:
            A00(r8, r7)
            java.lang.Object r0 = r7.A03
            com.instagram.arp.api.AvatarEffectsApiController r0 = (com.instagram.arp.api.AvatarEffectsApiController) r0
            java.lang.Object r0 = r0.A01(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66144MDw.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66144MDw(int i, AnonymousClass4D7 r2) {
        super(r2);
        this.A04 = i;
    }
}
