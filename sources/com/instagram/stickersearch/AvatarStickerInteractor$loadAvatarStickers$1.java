package com.instagram.stickersearch;

import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C317846nw;
import X.C317866ny;
import X.C60340gF;
import X.C61082JwK;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.stickersearch.AvatarStickerInteractor$loadAvatarStickers$1", f = "AvatarStickerInteractor.kt", i = {0, 1, 1, 2, 2}, l = {67, 79, 83, 94, 106}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "stickerPackId", "$this$flow", "stickerPackId"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1"})
public final class AvatarStickerInteractor$loadAvatarStickers$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public /* synthetic */ Object A02;
    public final /* synthetic */ C61082JwK A03;
    public final /* synthetic */ C317846nw A04;
    public final /* synthetic */ C317866ny A05;
    public final /* synthetic */ AvatarStickerInteractor A06;
    public final /* synthetic */ Integer A07;
    public final /* synthetic */ Integer A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickerInteractor$loadAvatarStickers$1(C61082JwK jwK, C317846nw r3, C317866ny r4, AvatarStickerInteractor avatarStickerInteractor, Integer num, Integer num2, String str, AnonymousClass4D7 r9, boolean z, boolean z2) {
        super(2, r9);
        this.A06 = avatarStickerInteractor;
        this.A04 = r3;
        this.A05 = r4;
        this.A03 = jwK;
        this.A0A = z;
        this.A07 = num;
        this.A08 = num2;
        this.A09 = str;
        this.A0B = z2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.stickersearch.AvatarStickerInteractor$loadAvatarStickers$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r13) {
        AvatarStickerInteractor avatarStickerInteractor = this.A06;
        C317846nw r2 = this.A04;
        C317866ny r3 = this.A05;
        AnonymousClass4D7 r8 = r13;
        ? avatarStickerInteractor$loadAvatarStickers$1 = new AvatarStickerInteractor$loadAvatarStickers$1(this.A03, r2, r3, avatarStickerInteractor, this.A07, this.A08, this.A09, r8, this.A0A, this.A0B);
        avatarStickerInteractor$loadAvatarStickers$1.A02 = obj;
        return avatarStickerInteractor$loadAvatarStickers$1;
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [com.instagram.stickersearch.AvatarStickerInteractor$loadAvatarStickers$1, X.4D7] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0121 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            r29 = this;
            r2 = r30
            X.1Hj r10 = X.1Hj.A02
            r11 = r29
            int r0 = r11.A00
            r7 = 5
            r16 = 4
            r3 = 3
            r4 = 2
            r1 = 1
            r13 = 0
            if (r0 == 0) goto L_0x001b
            if (r0 == r1) goto L_0x0031
            if (r0 == r4) goto L_0x0102
            X.0eS.A00(r2)
        L_0x0018:
            X.0gF r10 = X.C60340gF.A00
            return r10
        L_0x001b:
            X.0eS.A00(r2)
            java.lang.Object r12 = r11.A02
            X.02o r12 = (X.02o) r12
            com.instagram.stickersearch.AvatarStickerInteractor r0 = r11.A06
            com.instagram.avatars.store.AvatarStore r0 = r0.A01
            r11.A02 = r12
            r11.A00 = r1
            java.lang.Object r2 = r0.A01(r11)
            if (r2 != r10) goto L_0x0037
            return r10
        L_0x0031:
            java.lang.Object r0 = r11.A02
            X.02o r12 = X.JTO.A1H(r0, r2)
        L_0x0037:
            X.5vi r0 = X.C299715vi.A00
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 != 0) goto L_0x0045
            X.6nw r1 = r11.A04
            X.6nw r0 = X.C317846nw.POST_AVATAR_CREATION_STICKERS
            if (r1 != r0) goto L_0x0018
        L_0x0045:
            X.6nx r5 = X.C317846nw.A01
            com.instagram.stickersearch.AvatarStickerInteractor r15 = r11.A06
            com.instagram.common.session.UserSession r1 = r15.A02
            X.6ny r8 = r11.A05
            X.6nw r14 = r11.A04
            X.JwK r6 = r11.A03
            if (r6 == 0) goto L_0x0084
            boolean r0 = r6.A01
        L_0x0055:
            java.lang.String r9 = r5.A00(r14, r8, r1, r0)
            boolean r0 = X.C318076oL.A00(r1)
            if (r0 == 0) goto L_0x0086
            r0 = 0
            X.0qQ.A0B(r14, r0)
            X.6nw r2 = X.C317846nw.MUSIC_AVATAR_STICKERS_ANIMATED_DEFAULT_STICKER
            if (r14 == r2) goto L_0x006b
            X.6nw r2 = X.C317846nw.MUSIC_AVATAR_STICKERS_ICON
            if (r14 != r2) goto L_0x0086
        L_0x006b:
            com.instagram.stickersearch.api.ODRAvatarStickerRepository r2 = r15.A04
            if (r2 == 0) goto L_0x00bb
            java.lang.String r1 = r5.A00(r14, r8, r1, r0)
            java.lang.String r0 = r8.name()
            r11.A02 = r12
            r11.A01 = r9
            r11.A00 = r4
            java.lang.Object r2 = r2.A00(r1, r0, r11)
            if (r2 != r10) goto L_0x010c
            return r10
        L_0x0084:
            r0 = 0
            goto L_0x0055
        L_0x0086:
            boolean r5 = r11.A0A
            java.lang.Integer r4 = r11.A07
            java.lang.Integer r3 = r11.A08
            java.lang.String r2 = r11.A09
            boolean r1 = r11.A0B
            com.instagram.stickersearch.AvatarStickerInteractor$fetchFromNetworkRespository$1 r0 = new com.instagram.stickersearch.AvatarStickerInteractor$fetchFromNetworkRespository$1
            r21 = r9
            r22 = r2
            r23 = r13
            r24 = r5
            r25 = r1
            r18 = r15
            r19 = r4
            r20 = r3
            r17 = r8
            r16 = r14
            r14 = r0
            r15 = r6
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            X.05E r2 = new X.05E
            r2.<init>(r0)
            r0 = 33
            X.MCk r1 = X.MCk.A00(r12, r0)
            r11.A02 = r13
            r11.A00 = r7
            goto L_0x00fd
        L_0x00bb:
            com.instagram.stickersearch.AvatarStickerInteractor r14 = r11.A06
            X.6ny r8 = r11.A05
            X.6nw r7 = r11.A04
            boolean r6 = r11.A0A
            java.lang.Integer r5 = r11.A07
            java.lang.Integer r4 = r11.A08
            X.JwK r3 = r11.A03
            java.lang.String r2 = r11.A09
            boolean r1 = r11.A0B
            com.instagram.stickersearch.AvatarStickerInteractor$fetchFromNetworkRespository$1 r0 = new com.instagram.stickersearch.AvatarStickerInteractor$fetchFromNetworkRespository$1
            r23 = r4
            r24 = r9
            r25 = r2
            r26 = r13
            r27 = r6
            r28 = r1
            r20 = r8
            r21 = r14
            r22 = r5
            r19 = r7
            r18 = r3
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            X.05E r2 = new X.05E
            r2.<init>(r0)
            r0 = 32
            X.MCk r1 = X.MCk.A00(r12, r0)
            r11.A02 = r13
            r11.A01 = r13
            r0 = r16
            r11.A00 = r0
        L_0x00fd:
            java.lang.Object r0 = r2.collect(r1, r11)
            goto L_0x011f
        L_0x0102:
            java.lang.Object r9 = r11.A01
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r0 = r11.A02
            X.02o r12 = X.JTO.A1H(r0, r2)
        L_0x010c:
            X.K1h r2 = (X.C61294K1h) r2
            if (r2 == 0) goto L_0x00bb
            X.KZx r0 = new X.KZx
            r0.<init>(r2)
            r11.A02 = r12
            r11.A01 = r9
            r11.A00 = r3
            java.lang.Object r0 = r12.emit(r0, r11)
        L_0x011f:
            if (r0 != r10) goto L_0x0018
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.stickersearch.AvatarStickerInteractor$loadAvatarStickers$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarStickerInteractor$loadAvatarStickers$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
