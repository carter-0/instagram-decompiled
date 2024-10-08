package com.instagram.profile.avatars;

import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C250663lr;
import X.C273654mx;
import X.C319296qM;
import X.C60340gF;
import X.DdZ;
import com.instagram.avatars.coinflip.AvatarCoinFlipSticker;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.profile.avatars.AvatarProfileViewModel$postEventWithPosesFromCache$1", f = "AvatarProfileViewModel.kt", i = {}, l = {537}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarProfileViewModel$postEventWithPosesFromCache$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final /* synthetic */ C319296qM A01;
    public final /* synthetic */ DdZ A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarProfileViewModel$postEventWithPosesFromCache$1(C319296qM r2, DdZ ddZ, String str, String str2, AnonymousClass4D7 r6, boolean z, boolean z2) {
        super(2, r6);
        this.A02 = ddZ;
        this.A06 = z;
        this.A01 = r2;
        this.A05 = z2;
        this.A03 = str;
        this.A04 = str2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.profile.avatars.AvatarProfileViewModel$postEventWithPosesFromCache$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r10) {
        DdZ ddZ = this.A02;
        boolean z = this.A06;
        return new AvatarProfileViewModel$postEventWithPosesFromCache$1(this.A01, ddZ, this.A03, this.A04, r10, z, this.A05);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.profile.avatars.AvatarProfileViewModel$postEventWithPosesFromCache$1, X.4D7] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0065 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b7 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0101 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x013e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r8 = r22
            X.1Hj r1 = X.1Hj.A02
            r3 = r21
            int r0 = r3.A00
            r2 = 1
            if (r0 == 0) goto L_0x0179
            X.0eS.A00(r8)
        L_0x000e:
            X.3lr r8 = (X.C250663lr) r8
            boolean r7 = r3.A06
            r9 = 0
            if (r7 == 0) goto L_0x0141
            if (r8 == 0) goto L_0x0175
            java.lang.Class<X.Bnp> r4 = X.C42947Bnp.class
            java.lang.String r1 = "background_options"
            r0 = -1604829439(0xffffffffa0583f01, float:-1.8316758E-19)
            com.google.common.collect.ImmutableList r0 = r8.A06(r4, r1, r0)
            if (r0 == 0) goto L_0x0175
            java.lang.Object r4 = X.00k.A0J(r0)
            X.3lr r4 = (X.C250663lr) r4
        L_0x002a:
            if (r4 == 0) goto L_0x0176
            java.lang.String r0 = "id"
            java.lang.String r0 = r4.A07(r0)
        L_0x0032:
            java.lang.String r6 = java.lang.String.valueOf(r0)
            if (r4 == 0) goto L_0x013e
            java.lang.String r0 = "name"
            java.lang.String r0 = r4.getOptionalStringField(r2, r0)
        L_0x003e:
            java.lang.String r5 = java.lang.String.valueOf(r0)
            if (r4 == 0) goto L_0x013b
            java.lang.String r0 = "cdn_url"
            java.lang.String r0 = r4.A09(r0)
        L_0x004a:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            if (r4 == 0) goto L_0x0138
            r0 = 64
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.String r0 = r4.A0A(r0)
        L_0x005a:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            com.instagram.api.schemas.AvatarCoinFlipBackgroundOptionResponse r10 = new com.instagram.api.schemas.AvatarCoinFlipBackgroundOptionResponse
            r10.<init>(r0, r1, r6, r5)
            if (r7 == 0) goto L_0x0101
            if (r8 == 0) goto L_0x0135
            java.lang.Class<X.C7q> r4 = X.C43746C7q.class
            java.lang.String r1 = "animation_options"
            r0 = 23160973(0x161688d, float:4.1400985E-38)
            com.google.common.collect.ImmutableList r0 = r8.getRequiredCompactedTreeListField(r2, r1, r4, r0)
            if (r0 == 0) goto L_0x0135
            java.lang.Object r4 = X.00k.A0J(r0)
            X.C7q r4 = (X.C43746C7q) r4
        L_0x007a:
            r11 = 0
            if (r4 == 0) goto L_0x0095
            com.google.common.collect.ImmutableList r0 = r4.A0E()
            if (r0 == 0) goto L_0x0095
            java.lang.Object r1 = X.00k.A0O(r0, r2)
            X.3lr r1 = (X.C250663lr) r1
            if (r1 == 0) goto L_0x0095
            java.lang.String r0 = "cdn_url"
            java.lang.String r0 = r1.A09(r0)
            com.instagram.avatars.coinflip.AvatarCoinFlipSticker r11 = A00(r1, r0)
        L_0x0095:
            r12 = 0
            if (r4 == 0) goto L_0x00b1
            com.google.common.collect.ImmutableList r0 = r4.A0E()
            if (r0 == 0) goto L_0x00b1
            r5 = 2
            java.lang.Object r1 = X.00k.A0O(r0, r5)
            X.3lr r1 = (X.C250663lr) r1
            if (r1 == 0) goto L_0x00b1
            java.lang.String r0 = "cdn_url"
            java.lang.String r0 = r1.getOptionalStringField(r5, r0)
            com.instagram.avatars.coinflip.AvatarCoinFlipSticker r12 = A00(r1, r0)
        L_0x00b1:
            X.6qM r5 = r3.A01
            com.instagram.avatars.coinflip.AvatarCoinFlipConfig r7 = r5.A00
            if (r7 == 0) goto L_0x00e9
            if (r4 == 0) goto L_0x00c1
            java.lang.String r0 = "sticker_pack_id"
            java.lang.String r15 = r4.A07(r0)
            if (r15 != 0) goto L_0x00c3
        L_0x00c1:
            java.lang.String r15 = r7.A07
        L_0x00c3:
            if (r12 != 0) goto L_0x00c7
            com.instagram.avatars.coinflip.AvatarCoinFlipSticker r12 = r7.A06
        L_0x00c7:
            if (r11 != 0) goto L_0x00cb
            com.instagram.avatars.coinflip.AvatarCoinFlipSticker r11 = r7.A05
        L_0x00cb:
            boolean r6 = r3.A05
            boolean r4 = r7.A09
            X.6tJ r13 = r7.A00
            boolean r1 = r7.A03
            com.instagram.avatars.common.AvatarInfo r14 = r7.A01
            boolean r0 = r7.A02
            X.Dba.A0j(r2, r11, r12)
            com.instagram.avatars.coinflip.AvatarCoinFlipConfig r9 = new com.instagram.avatars.coinflip.AvatarCoinFlipConfig
            r18 = r6
            r19 = r1
            r20 = r0
            r16 = r6
            r17 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
        L_0x00e9:
            java.lang.String r4 = r5.A01
            java.lang.String r2 = r5.A02
            boolean r0 = r5.A03
            X.DbY.A1S(r4, r2)
            X.6qM r1 = new X.6qM
            r1.<init>(r9, r4, r2, r0)
            X.DdZ r0 = r3.A02
            X.05G r0 = r0.A0E
            r0.Epw(r1)
            X.0gF r1 = X.C60340gF.A00
            return r1
        L_0x0101:
            if (r8 == 0) goto L_0x0135
            java.lang.Class<X.C7q> r4 = X.C43746C7q.class
            java.lang.String r1 = "animation_options"
            r0 = 23160973(0x161688d, float:4.1400985E-38)
            com.google.common.collect.ImmutableList r0 = r8.getRequiredCompactedTreeListField(r2, r1, r4, r0)
            if (r0 == 0) goto L_0x0135
            java.lang.String r6 = r3.A04
            java.util.Iterator r5 = r0.iterator()
        L_0x0116:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0133
            java.lang.Object r4 = r5.next()
            r1 = r4
            X.3lr r1 = (X.C250663lr) r1
            java.lang.String r0 = "sticker_pack_id"
            java.lang.String r0 = r1.A07(r0)
            boolean r0 = X.0qQ.A0K(r0, r6)
            if (r0 == 0) goto L_0x0116
        L_0x012f:
            X.C7q r4 = (X.C43746C7q) r4
            goto L_0x007a
        L_0x0133:
            r4 = r9
            goto L_0x012f
        L_0x0135:
            r4 = r9
            goto L_0x007a
        L_0x0138:
            r0 = r9
            goto L_0x005a
        L_0x013b:
            r0 = r9
            goto L_0x004a
        L_0x013e:
            r0 = r9
            goto L_0x003e
        L_0x0141:
            if (r8 == 0) goto L_0x0175
            java.lang.Class<X.Bnp> r4 = X.C42947Bnp.class
            java.lang.String r1 = "background_options"
            r0 = -1604829439(0xffffffffa0583f01, float:-1.8316758E-19)
            com.google.common.collect.ImmutableList r0 = r8.A06(r4, r1, r0)
            if (r0 == 0) goto L_0x0175
            java.lang.String r6 = r3.A03
            java.util.Iterator r5 = r0.iterator()
        L_0x0156:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0173
            java.lang.Object r4 = r5.next()
            r1 = r4
            X.3lr r1 = (X.C250663lr) r1
            java.lang.String r0 = "id"
            java.lang.String r0 = r1.A07(r0)
            boolean r0 = X.0qQ.A0K(r0, r6)
            if (r0 == 0) goto L_0x0156
        L_0x016f:
            X.3lr r4 = (X.C250663lr) r4
            goto L_0x002a
        L_0x0173:
            r4 = r9
            goto L_0x016f
        L_0x0175:
            r4 = r9
        L_0x0176:
            r0 = r9
            goto L_0x0032
        L_0x0179:
            X.0eS.A00(r8)
            X.DdZ r0 = r3.A02
            com.instagram.avatars.graphql.AvatarCustomizationOptionsRepository r0 = r0.A05
            X.0r6 r0 = r0.A03
            r3.A00 = r2
            java.lang.Object r8 = X.AnonymousClass10c.A02(r3, r0)
            if (r8 != r1) goto L_0x000e
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.profile.avatars.AvatarProfileViewModel$postEventWithPosesFromCache$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public static AvatarCoinFlipSticker A00(C250663lr r7, Object obj) {
        return new AvatarCoinFlipSticker(String.valueOf(obj), r7.getCoercedIntField(4, "margin_top"), r7.getCoercedIntField(7, C273654mx.A00(333)), r7.getCoercedIntField(5, C273654mx.A00(334)), r7.getCoercedIntField(6, C273654mx.A00(335)), r7.getCoercedIntField(8, IgReactMediaPickerNativeModule.HEIGHT));
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarProfileViewModel$postEventWithPosesFromCache$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
