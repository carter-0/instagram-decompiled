package com.facebook.fbavatar.cdsavatareditor.liveediting.ig;

import X.0qQ;
import X.AnonymousClass07Z;
import X.AnonymousClass0JR;
import X.C17973VjA;
import X.C18081VlB;
import X.C18741VzM;
import X.C262224Cq;
import X.MTM;
import X.UIG;
import X.VLB;
import X.X2N;
import X.X7R;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

public final class FoaLiveEditingProvider implements X2N {
    public X7R A00;
    public MTM A01;
    public C18741VzM A02;
    public C18081VlB A03;
    public final AnonymousClass07Z A04;
    public final VLB A05;
    public final AnonymousClass0JR A06;
    public final UserSession A07;
    public final C262224Cq A08;

    /* JADX WARNING: type inference failed for: r10v1, types: [X.WvD, X.4D7] */
    /* JADX WARNING: type inference failed for: r10v9 */
    /* JADX WARNING: type inference failed for: r10v10 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x02b5  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(android.content.Context r26, android.view.ViewGroup r27, X.C17788Vg0 r28, X.C18006Vji r29, X.C15046UKz r30, X.C18073Vl1 r31, X.AnonymousClass4D7 r32, boolean r33) {
        /*
            r25 = this;
            r1 = r26
            r9 = r32
            r2 = r27
            r4 = r28
            r5 = r29
            r3 = r31
            r7 = r30
            boolean r0 = r9 instanceof X.C20585WvD
            r11 = r25
            if (r0 == 0) goto L_0x0136
            r10 = r9
            X.WvD r10 = (X.C20585WvD) r10
            int r8 = r10.A00
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r8 & r6
            if (r0 == 0) goto L_0x0136
            int r8 = r8 - r6
            r10.A00 = r8
        L_0x0022:
            java.lang.Object r13 = r10.A0A
            X.1Hj r9 = X.1Hj.A02
            int r0 = r10.A00
            java.lang.String r8 = "Required value was null."
            r6 = 1
            if (r0 == 0) goto L_0x0082
            if (r0 != r6) goto L_0x02c3
            java.lang.Object r14 = r10.A09
            com.facebook.commonavatarliveediting.prefetch.CommonCdlProviderHolder r14 = (com.facebook.commonavatarliveediting.prefetch.CommonCdlProviderHolder) r14
            java.lang.Object r12 = r10.A08
            X.LZb r12 = (X.C64301LZb) r12
            java.lang.Object r7 = r10.A07
            X.UKz r7 = (X.C15046UKz) r7
            java.lang.Object r5 = r10.A06
            X.Vji r5 = (X.C18006Vji) r5
            java.lang.Object r4 = r10.A05
            X.Vg0 r4 = (X.C17788Vg0) r4
            java.lang.Object r3 = r10.A04
            X.Vl1 r3 = (X.C18073Vl1) r3
            java.lang.Object r2 = r10.A03
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            java.lang.Object r1 = r10.A02
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r9 = r10.A01
            com.facebook.fbavatar.cdsavatareditor.liveediting.ig.FoaLiveEditingProvider r9 = (com.facebook.fbavatar.cdsavatareditor.liveediting.ig.FoaLiveEditingProvider) r9
            X.0eS.A00(r13)
        L_0x0056:
            X.MTM r13 = r14.cdlProviderInstance
            if (r13 == 0) goto L_0x02bb
            r9.A01 = r13
        L_0x005c:
            X.4Cq r10 = r9.A08
            X.UIE r0 = new X.UIE
            r0.<init>(r1, r13, r12, r10)
            r9.A03 = r0
        L_0x0065:
            X.4Cq r11 = r9.A08
            X.0JR r10 = r9.A06
            X.VLB r15 = r9.A05
            X.VlB r0 = r9.A03
            if (r0 == 0) goto L_0x02b5
            X.VzM r14 = new X.VzM
            r18 = r9
            r19 = r11
            r16 = r10
            r17 = r0
            r14.<init>(r15, r16, r17, r18, r19)
            r11 = 0
            X.JvN r13 = X.C61023JvN.A01
            monitor-enter(r14)
            goto L_0x013d
        L_0x0082:
            X.0eS.A00(r13)
            com.instagram.common.session.UserSession r0 = r11.A07
            X.0Tu r14 = X.0Tu.A05
            r12 = 36321035183727645(0x8109ca0000241d, double:3.032907131034404E-306)
            boolean r12 = X.182.A06(r14, r0, r12)
            r15 = 0
            if (r12 == 0) goto L_0x00c1
            X.02m r16 = X.02m.A0p
            X.0qQ.A07(r16)
            X.12T r14 = X.AnonymousClass12T.A00
            r13 = 637710289(0x2602afd1, float:4.5341086E-16)
            r12 = 3
            X.0nV r14 = r14.CO6(r13, r12)
            r13 = 0
            com.facebook.avatar.expresso.webp.WebPEncoderImpl r12 = new com.facebook.avatar.expresso.webp.WebPEncoderImpl
            r12.<init>(r14, r13)
            r21 = 4
            r23 = 2
            X.LGB r14 = new X.LGB
            r18 = r15
            r19 = r15
            r22 = r6
            r24 = r13
            r17 = r15
            r20 = r6
            r15 = r12
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r15 = r14
        L_0x00c1:
            X.LZb r12 = new X.LZb
            r12.<init>(r15, r0)
            X.07Z r13 = r11.A04
            X.07V r13 = r13.getLifecycle()
            r13.A09(r12)
            boolean r13 = r7.A0F
            if (r13 == 0) goto L_0x0105
            X.VdH r10 = X.C18609Vv2.A06
            r9 = 0
            X.0qQ.A0B(r0, r9)
            X.VQO r9 = X.VQO.A01
            if (r9 != 0) goto L_0x00e4
            X.VQO r9 = new X.VQO
            r9.<init>(r0)
            X.VQO.A01 = r9
        L_0x00e4:
            X.Vv2 r0 = r10.A00(r9)
            X.WGt r13 = new X.WGt
            r13.<init>(r0)
            r13.EBP(r11)
            r13.CMo(r7)
            X.VjA r10 = r13.A00
            if (r10 == 0) goto L_0x02c8
            X.4Cq r9 = r11.A08
            X.UIG r0 = new X.UIG
            r0.<init>(r1, r10, r12, r9)
            r11.A03 = r0
            r11.A00 = r13
            r9 = r11
            goto L_0x0065
        L_0x0105:
            X.VLB r13 = r11.A05
            com.facebook.fbavatar.cdsavatareditor.liveediting.ig.IgCdlProviderBuilder r0 = X.C62981KpX.A00(r13, r0)
            com.facebook.commonavatarliveediting.prefetch.CommonCdlProviderHolder r14 = X.C62976KpS.A00(r1, r0)
            X.MTM r13 = r11.A01
            if (r13 != 0) goto L_0x0133
            r10.A01 = r11
            r10.A02 = r1
            r10.A03 = r2
            r10.A04 = r3
            r10.A05 = r4
            r10.A06 = r5
            r10.A07 = r7
            r10.A08 = r12
            r10.A09 = r14
            r10.A00 = r6
            r0 = r33
            java.lang.Object r0 = r14.A00(r7, r3, r10, r0)
            if (r0 != r9) goto L_0x0130
            return r9
        L_0x0130:
            r9 = r11
            goto L_0x0056
        L_0x0133:
            r9 = r11
            goto L_0x005c
        L_0x0136:
            X.WvD r10 = new X.WvD
            r10.<init>(r11, r9)
            goto L_0x0022
        L_0x013d:
            r10 = 0
            X.0qQ.A0B(r1, r10)     // Catch:{ all -> 0x02b2 }
            X.AnonymousClass7TF.A1B(r2, r6, r12)     // Catch:{ all -> 0x02b2 }
            X.C51974G9v.A1N(r4, r5, r7)     // Catch:{ all -> 0x02b2 }
            r0 = 9
            X.0qQ.A0B(r13, r0)     // Catch:{ all -> 0x02b2 }
            X.LZb r0 = r14.A08     // Catch:{ all -> 0x02b2 }
            if (r0 != 0) goto L_0x02a4
            r14.A04 = r7     // Catch:{ all -> 0x02b2 }
            X.L7X r0 = new X.L7X     // Catch:{ all -> 0x02b2 }
            r0.<init>(r1, r2, r13)     // Catch:{ all -> 0x02b2 }
            r14.A07 = r0     // Catch:{ all -> 0x02b2 }
            X.C18741VzM.A00(r14)     // Catch:{ all -> 0x02b2 }
            r14.A00 = r1     // Catch:{ all -> 0x02b2 }
            java.lang.String r1 = r7.A09     // Catch:{ all -> 0x02b2 }
            if (r1 == 0) goto L_0x02ac
            r14.A01 = r2     // Catch:{ all -> 0x02b2 }
            r14.A05 = r3     // Catch:{ all -> 0x02b2 }
            r14.A02 = r4     // Catch:{ all -> 0x02b2 }
            java.util.List r0 = r5.A05     // Catch:{ all -> 0x02b2 }
            r0.add(r14)     // Catch:{ all -> 0x02b2 }
            X.UKz r0 = r5.A04     // Catch:{ all -> 0x02b2 }
            X.Uwl r3 = r0.A00     // Catch:{ all -> 0x02b2 }
            X.Uwl r0 = X.C16540Uwl.FALLBACK_MODE     // Catch:{ all -> 0x02b2 }
            if (r3 != r0) goto L_0x017f
            X.Uvc r3 = X.C16482Uvc.A04     // Catch:{ all -> 0x02b2 }
            java.lang.String r0 = "low_memory"
            r5.A01(r3, r0)     // Catch:{ all -> 0x02b2 }
        L_0x017c:
            X.Gms r0 = r7.A01     // Catch:{ all -> 0x02b2 }
            goto L_0x019c
        L_0x017f:
            r4 = r5
            X.UI6 r4 = (X.UI6) r4     // Catch:{ all -> 0x02b2 }
            X.0qJ r0 = X.C62670v5.A0B     // Catch:{ all -> 0x02b2 }
            X.WTr r3 = r4.A01     // Catch:{ all -> 0x02b2 }
            r0.A03(r3)     // Catch:{ all -> 0x02b2 }
            X.0v5 r0 = r0.A01()     // Catch:{ all -> 0x02b2 }
            android.net.NetworkInfo r0 = r0.A03()     // Catch:{ all -> 0x02b2 }
            r3.onConnectionChanged(r0)     // Catch:{ all -> 0x02b2 }
            X.1Jf r3 = r4.A02     // Catch:{ all -> 0x02b2 }
            X.WGi r0 = r4.A00     // Catch:{ all -> 0x02b2 }
            r3.EBn(r0)     // Catch:{ all -> 0x02b2 }
            goto L_0x017c
        L_0x019c:
            if (r0 != 0) goto L_0x01a5
            X.Uvc r3 = X.C16482Uvc.A04     // Catch:{ all -> 0x02b2 }
            java.lang.String r0 = "quality_override_null"
            r5.A01(r3, r0)     // Catch:{ all -> 0x02b2 }
        L_0x01a5:
            r14.A03 = r5     // Catch:{ all -> 0x02b2 }
            java.lang.String r3 = r14.A09     // Catch:{ all -> 0x02b2 }
            if (r3 != 0) goto L_0x0298
            X.Vg0 r3 = r14.A02     // Catch:{ all -> 0x02b2 }
            if (r3 == 0) goto L_0x01b4
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x02b2 }
            r3.A00(r0, r11)     // Catch:{ all -> 0x02b2 }
        L_0x01b4:
            r14.A08 = r12     // Catch:{ all -> 0x02b2 }
            X.Vl1 r3 = r14.A05     // Catch:{ all -> 0x02b2 }
            if (r3 == 0) goto L_0x01bf
            java.lang.String r0 = "EFFECT_RENDER"
            r3.A02(r0)     // Catch:{ all -> 0x02b2 }
        L_0x01bf:
            r5 = 0
            X.4Cq r4 = r14.A0C     // Catch:{ all -> 0x02b2 }
            X.4CZ r0 = X.AnonymousClass12W.A01     // Catch:{ all -> 0x02b2 }
            X.134 r3 = X.AnonymousClass12y.A00     // Catch:{ all -> 0x02b2 }
            com.facebook.fbavatar.cdsavatareditor.liveediting.common.CommonLiveEditingProvider$setRichAvatarViewAlpha$1 r0 = new com.facebook.fbavatar.cdsavatareditor.liveediting.common.CommonLiveEditingProvider$setRichAvatarViewAlpha$1     // Catch:{ all -> 0x02b2 }
            r0.<init>(r14, r11, r5)     // Catch:{ all -> 0x02b2 }
            X.1Eo.A05(r3, r0, r4)     // Catch:{ all -> 0x02b2 }
            X.VlB r4 = r14.A0B     // Catch:{ all -> 0x02b2 }
            java.util.concurrent.CopyOnWriteArrayList r0 = r4.A0E     // Catch:{ all -> 0x02b2 }
            r0.add(r14)     // Catch:{ all -> 0x02b2 }
            boolean r0 = r4 instanceof X.UIE     // Catch:{ all -> 0x02b2 }
            if (r0 == 0) goto L_0x0218
            X.UIE r4 = (X.UIE) r4     // Catch:{ all -> 0x02b2 }
            r0 = 495(0x1ef, float:6.94E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)     // Catch:{ all -> 0x02b2 }
            boolean r3 = r4.A04     // Catch:{ all -> 0x02b2 }
            if (r3 == 0) goto L_0x01f1
            java.lang.String r1 = "[InitPlayer][Player already initialized]"
            X.0KC.A0C(r0, r1)     // Catch:{ all -> 0x02b2 }
        L_0x01ea:
            java.util.List r0 = X.C18288VpB.A00     // Catch:{ all -> 0x02b2 }
            r0.add(r14)     // Catch:{ all -> 0x02b2 }
            goto L_0x028d
        L_0x01f1:
            r4.A04 = r6     // Catch:{ all -> 0x02b2 }
            X.LZb r3 = r4.A0C     // Catch:{ all -> 0x02b2 }
            X.L39 r0 = new X.L39     // Catch:{ all -> 0x02b2 }
            r0.<init>(r4, r7)     // Catch:{ all -> 0x02b2 }
            r3.A01 = r0     // Catch:{ all -> 0x02b2 }
            X.LZb r15 = r4.A06     // Catch:{ all -> 0x02b2 }
            android.content.Context r6 = r4.A05     // Catch:{ all -> 0x02b2 }
            X.4Cq r5 = r4.A07     // Catch:{ all -> 0x02b2 }
            boolean r4 = r7.A03     // Catch:{ all -> 0x02b2 }
            r3 = 2
            X.Jvg r0 = new X.Jvg     // Catch:{ all -> 0x02b2 }
            r0.<init>((int) r3, (int) r10, (boolean) r4)     // Catch:{ all -> 0x02b2 }
            r18 = r0
            r19 = r1
            r20 = r5
            r17 = r2
            r16 = r6
            r15.A00(r16, r17, r18, r19, r20)     // Catch:{ all -> 0x02b2 }
            goto L_0x01ea
        L_0x0218:
            boolean r0 = r4 instanceof X.UIG     // Catch:{ all -> 0x02b2 }
            if (r0 == 0) goto L_0x0261
            X.UIG r4 = (X.UIG) r4     // Catch:{ all -> 0x02b2 }
            java.lang.String r3 = "AleLiveEditingPlayer"
            boolean r0 = r4.A05     // Catch:{ all -> 0x02b2 }
            if (r0 == 0) goto L_0x022a
            java.lang.String r0 = "[InitPlayer][Player already initialized]"
            X.0KC.A0C(r3, r0)     // Catch:{ all -> 0x02b2 }
            goto L_0x01ea
        L_0x022a:
            r4.A05 = r6     // Catch:{ all -> 0x02b2 }
            r4.A00 = r7     // Catch:{ all -> 0x02b2 }
            X.LZb r3 = r4.A0C     // Catch:{ all -> 0x02b2 }
            X.L39 r0 = new X.L39     // Catch:{ all -> 0x02b2 }
            r0.<init>(r4, r7)     // Catch:{ all -> 0x02b2 }
            r3.A01 = r0     // Catch:{ all -> 0x02b2 }
            X.LZb r15 = r4.A07     // Catch:{ all -> 0x02b2 }
            android.content.Context r8 = r4.A06     // Catch:{ all -> 0x02b2 }
            X.4Cq r6 = r4.A08     // Catch:{ all -> 0x02b2 }
            boolean r5 = r7.A03     // Catch:{ all -> 0x02b2 }
            boolean r3 = r7.A0D     // Catch:{ all -> 0x02b2 }
            X.Jvg r0 = new X.Jvg     // Catch:{ all -> 0x02b2 }
            r0.<init>((boolean) r5, (boolean) r3, (int) r10)     // Catch:{ all -> 0x02b2 }
            r18 = r0
            r19 = r1
            r20 = r6
            r17 = r2
            r16 = r8
            r15.A00(r16, r17, r18, r19, r20)     // Catch:{ all -> 0x02b2 }
            java.lang.ref.WeakReference r0 = r4.A02     // Catch:{ all -> 0x02b2 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x02b2 }
            X.VjA r0 = (X.C17973VjA) r0     // Catch:{ all -> 0x02b2 }
            if (r0 == 0) goto L_0x01ea
            r0.A00(r4)     // Catch:{ all -> 0x02b2 }
            goto L_0x0274
        L_0x0261:
            X.UIF r4 = (X.UIF) r4     // Catch:{ all -> 0x02b2 }
            r4.A00 = r7     // Catch:{ all -> 0x02b2 }
            java.lang.ref.WeakReference r0 = r4.A02     // Catch:{ all -> 0x02b2 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x02b2 }
            X.VjA r0 = (X.C17973VjA) r0     // Catch:{ all -> 0x02b2 }
            if (r0 == 0) goto L_0x01ea
            r0.A00(r4)     // Catch:{ all -> 0x02b2 }
            X.LZb r15 = r4.A04     // Catch:{ all -> 0x02b2 }
        L_0x0274:
            X.VQW r0 = r0.A00     // Catch:{ all -> 0x02b2 }
            if (r0 != 0) goto L_0x027e
            java.lang.String r0 = "aleBridge"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x02b2 }
            goto L_0x0293
        L_0x027e:
            com.facebook.cdl.gltfmemorypointerholder.LiveEditingRawMemoryPointerHolder r1 = new com.facebook.cdl.gltfmemorypointerholder.LiveEditingRawMemoryPointerHolder     // Catch:{ all -> 0x02b2 }
            r1.<init>()     // Catch:{ all -> 0x02b2 }
            com.facebook.ale.native.AvatarLiveEditing r0 = r0.A00     // Catch:{ all -> 0x02b2 }
            r0.getAlePointerHolder(r1)     // Catch:{ all -> 0x02b2 }
            r15.A02(r1)     // Catch:{ all -> 0x02b2 }
            goto L_0x01ea
        L_0x028d:
            monitor-exit(r14)
            r9.A02 = r14
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0293:
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            goto L_0x02b1
        L_0x0298:
            java.lang.String r0 = "LE initial check failed because of "
            java.lang.String r0 = X.002.A0R(r0, r3)     // Catch:{ all -> 0x02b2 }
            X.WuU r1 = new X.WuU     // Catch:{ all -> 0x02b2 }
            r1.<init>(r0)     // Catch:{ all -> 0x02b2 }
            goto L_0x02b1
        L_0x02a4:
            java.lang.String r0 = "already initialised"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x02b2 }
            r1.<init>(r0)     // Catch:{ all -> 0x02b2 }
            goto L_0x02b1
        L_0x02ac:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x02b2 }
            r1.<init>(r8)     // Catch:{ all -> 0x02b2 }
        L_0x02b1:
            throw r1     // Catch:{ all -> 0x02b2 }
        L_0x02b2:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        L_0x02b5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r8)
            throw r0
        L_0x02bb:
            java.lang.String r1 = "initCdlHolder not called"
            X.0fC r0 = new X.0fC
            r0.<init>(r1)
            throw r0
        L_0x02c3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x02c8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fbavatar.cdsavatareditor.liveediting.ig.FoaLiveEditingProvider.A00(android.content.Context, android.view.ViewGroup, X.Vg0, X.Vji, X.UKz, X.Vl1, X.4D7, boolean):java.lang.Object");
    }

    public final void Cv0(C17973VjA vjA) {
        UIG uig = (UIG) this.A03;
        if (uig != null) {
            uig.A02 = new WeakReference(vjA);
        }
    }

    public FoaLiveEditingProvider(AnonymousClass07Z r2, VLB vlb, UserSession userSession, C262224Cq r5) {
        this.A07 = userSession;
        this.A04 = r2;
        this.A08 = r5;
        this.A05 = vlb;
        AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
        0qQ.A07(awakeTimeSinceBootClock);
        this.A06 = awakeTimeSinceBootClock;
    }
}
