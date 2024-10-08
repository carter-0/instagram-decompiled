package com.instagram.camera.effect.mq.effectmetadata;

import X.00k;
import X.05G;
import X.0Yv;
import X.0qQ;
import X.0rr;
import X.0sn;
import X.106;
import X.11M;
import X.AnonymousClass0r6;
import X.AnonymousClass12V;
import X.AnonymousClass82X;
import X.C348117xu;
import X.C349177zi;
import X.C349217zm;
import X.C3502984c;
import X.C3504784u;
import X.C3504984y;
import X.C357648Za;
import X.C359218cI;
import X.C359238cK;
import X.C359248cL;
import X.C359258cM;
import X.C61410nE;
import com.instagram.ar.core.effectcollection.EffectCollectionService;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

public final class EffectTrayService {
    public final C3502984c A00;
    public final EffectCollectionService A01;
    public final AnonymousClass82X A02;
    public final C61410nE A03;
    public final C3504784u A04;
    public final 05G A05 = 106.A01(C3504984y.A00);
    public final EffectsByIdMetadataService A06;
    public final AnonymousClass12V A07;

    public EffectTrayService(C3502984c r2, EffectCollectionService effectCollectionService, AnonymousClass82X r4, AnonymousClass12V r5, UserSession userSession, C61410nE r7, C3504784u r8) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r4, 2);
        0qQ.A0B(effectCollectionService, 3);
        0qQ.A0B(r5, 6);
        0qQ.A0B(r7, 7);
        this.A02 = r4;
        this.A01 = effectCollectionService;
        this.A04 = r8;
        this.A00 = r2;
        this.A07 = r5;
        this.A03 = r7;
        this.A06 = new EffectsByIdMetadataService(effectCollectionService, userSession);
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MDy, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(X.C39753A7t r14, com.instagram.camera.effect.mq.effectmetadata.EffectTrayService r15, X.AnonymousClass4D7 r16) {
        /*
            r3 = r14
            r2 = r15
            r5 = 31
            r7 = r16
            boolean r0 = X.C66146MDy.A02(r5, r7)
            if (r0 == 0) goto L_0x0115
            r6 = r7
            X.MDy r6 = (X.C66146MDy) r6
            int r4 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r1
            if (r0 == 0) goto L_0x0115
            int r4 = r4 - r1
            r6.A00 = r4
        L_0x001a:
            java.lang.Object r7 = r6.A03
            X.1Hj r5 = X.1Hj.A02
            int r1 = r6.A00
            r4 = 2
            r0 = 1
            if (r1 == 0) goto L_0x002e
            if (r1 == r0) goto L_0x00db
            if (r1 != r4) goto L_0x011c
            X.0eS.A00(r7)
        L_0x002b:
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x002e:
            X.0eS.A00(r7)
            r6.A01 = r15
            r6.A02 = r14
            r6.A00 = r0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.C241503Pl.A01
            X.4D7 r0 = X.1Ey.A02(r6)
            X.3Pl r8 = new X.3Pl
            r8.<init>(r0)
            X.84u r14 = r15.A04
            if (r14 == 0) goto L_0x00cf
            X.A3W r10 = new X.A3W
            r10.<init>(r8)
            com.instagram.user.model.Product r13 = r14.A04()
            if (r13 != 0) goto L_0x0059
            com.instagram.model.shopping.ProductItemWithAR r0 = r14.A01
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r0.A01
            com.instagram.user.model.Product r13 = X.C14502TxO.A00(r0)
        L_0x0059:
            java.lang.String r0 = r14.A07
            X.A5g r7 = r14.A0E
            if (r0 != 0) goto L_0x00d6
            r1 = 0
        L_0x0060:
            java.lang.String r0 = r14.A08
            r16 = r0
            java.lang.String r12 = r14.A04
            java.lang.String r11 = r14.A09
            X.A5h r9 = new X.A5h
            r9.<init>(r10, r14)
            r10 = 0
            java.lang.String r15 = r13.A0H
            com.instagram.user.model.User r0 = r13.A0B
            if (r0 == 0) goto L_0x007a
            java.lang.String r14 = X.AnonymousClass3ZA.A00(r0)
            if (r14 != 0) goto L_0x007c
        L_0x007a:
            java.lang.String r14 = ""
        L_0x007c:
            X.0qQ.A0B(r15, r10)
            java.lang.Integer r10 = r7.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r10 == r0) goto L_0x00cf
            r7.A00 = r0
            com.instagram.common.session.UserSession r13 = r7.A01
            r0 = -2
            X.1NY r10 = new X.1NY
            r10.<init>(r13, r0)
            r10.A05()
            java.lang.Object[] r13 = new java.lang.Object[]{r15}
            java.lang.String r0 = "commerce/products/%s/ar/"
            r10.A0K(r0, r13)
            java.lang.String r0 = "merchant_id"
            r10.A9m(r0, r14)
            java.lang.String r0 = "source_media_id"
            r10.A0G(r0, r1)
            java.lang.String r1 = "ch"
            r0 = r16
            r10.A0G(r1, r0)
            java.lang.String r0 = "effect_config_id"
            r10.A0G(r0, r12)
            r0 = 402(0x192, float:5.63E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r10.A0G(r0, r11)
            java.lang.Class<X.9ha> r1 = X.C384599ha.class
            java.lang.Class<X.ABJ> r0 = X.ABJ.class
            r10.A0Q(r1, r0)
            X.1OC r1 = r10.A0M()
            X.9in r0 = new X.9in
            r0.<init>(r7, r9)
            r1.A00 = r0
            X.1ES.A03(r1)
        L_0x00cf:
            java.lang.Object r7 = r8.A00()
            if (r7 != r5) goto L_0x00e6
            return r5
        L_0x00d6:
            java.lang.String r1 = X.AnonymousClass3VO.A02(r0)
            goto L_0x0060
        L_0x00db:
            java.lang.Object r3 = r6.A02
            X.A7t r3 = (X.C39753A7t) r3
            java.lang.Object r2 = r6.A01
            com.instagram.camera.effect.mq.effectmetadata.EffectTrayService r2 = (com.instagram.camera.effect.mq.effectmetadata.EffectTrayService) r2
            X.0eS.A00(r7)
        L_0x00e6:
            X.3Ii r7 = (X.C239803Ii) r7
            boolean r0 = r7 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0106
            X.3Ih r7 = (X.C239793Ih) r7
            java.lang.Object r1 = r7.A00
            java.util.List r1 = (java.util.List) r1
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r3.A00 = r1
            r0 = 0
            r6.A01 = r0
            r6.A02 = r0
            r6.A00 = r4
            java.lang.Object r0 = A01(r3, r2, r6)
            if (r0 != r5) goto L_0x002b
            return r5
        L_0x0106:
            boolean r0 = r7 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0124
            X.05G r1 = r2.A05
            X.5sO r7 = (X.C297815sO) r7
            java.lang.Object r0 = r7.A00
            r1.Epw(r0)
            goto L_0x002b
        L_0x0115:
            X.MDy r6 = new X.MDy
            r6.<init>(r15, r7, r5)
            goto L_0x001a
        L_0x011c:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0124:
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.camera.effect.mq.effectmetadata.EffectTrayService.A02(X.A7t, com.instagram.camera.effect.mq.effectmetadata.EffectTrayService, X.4D7):java.lang.Object");
    }

    public final C359258cM A04(C359248cL r21, String str, String str2, String str3, List list, boolean z) {
        AnonymousClass0r6 r0;
        Integer num;
        boolean z2;
        C357648Za r3;
        C359248cL r1 = r21;
        0qQ.A0B(r1, 0);
        if (r1 instanceof C359238cK) {
            C359238cK r4 = (C359238cK) r1;
            List<C359218cI> list2 = r4.A04;
            ArrayList arrayList = new ArrayList(0Yv.A1E(list2, 10));
            for (C359218cI r10 : list2) {
                EffectCollectionService effectCollectionService = this.A01;
                long j = r4.A00;
                if (0qQ.A0K(r10.A01, "SAVED")) {
                    num = null;
                } else {
                    num = r4.A02;
                }
                C3502984c r32 = this.A00;
                if (r32 == null || (r3 = (C357648Za) r32.A00.A00()) == null) {
                    z2 = true;
                } else {
                    z2 = r3.A04();
                }
                arrayList.add(effectCollectionService.A07(new C349177zi(r10, num, (String) null, j, true, true, false, z2, z)));
            }
            r0 = 11M.A01(this.A07.AOJ(818336140, 3), new C349217zm(this, r4, (AnonymousClass0r6[]) 00k.A0a(arrayList).toArray(new AnonymousClass0r6[0])));
        } else {
            0sn r7 = 0sn.A00;
            0qQ.A0B(r7, 0);
            r0 = new 0rr(new C348117xu((CameraAREffect) null, (String) null, (String) null, r7, (List) null, true, true, false));
        }
        return new C359258cM(this, r1, str2, str3, str, list, r0);
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [X.9JU, X.4D7] */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C359218cI r9, com.instagram.camera.effect.mq.effectmetadata.EffectTrayService r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, X.AnonymousClass4D7 r14) {
        /*
            r3 = 12
            r4 = r14
            boolean r0 = X.AnonymousClass9JU.A00(r3, r14)
            if (r0 == 0) goto L_0x004b
            r8 = r4
            X.9JU r8 = (X.AnonymousClass9JU) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x004b
            int r2 = r2 - r1
            r8.A00 = r2
        L_0x0017:
            java.lang.Object r3 = r8.A01
            X.1Hj r1 = X.1Hj.A02
            int r0 = r8.A00
            r2 = 1
            if (r0 == 0) goto L_0x0030
            if (r0 != r2) goto L_0x005f
            X.0eS.A00(r3)
        L_0x0025:
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0053
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r1 = r3.A00
            return r1
        L_0x0030:
            X.0eS.A00(r3)
            com.instagram.ar.core.effectcollection.EffectCollectionService r3 = r10.A01
            r5 = r11
            X.0qQ.A0B(r11, r2)
            r0 = 2
            r4 = r9
            X.0qQ.A0B(r9, r0)
            r8.A00 = r2
            r9 = 3
            r6 = r12
            r7 = r13
            java.lang.Object r3 = com.instagram.ar.core.effectcollection.EffectCollectionService.A03(r3, r4, r5, r6, r7, r8, r9)
            if (r3 != r1) goto L_0x0025
            return r1
        L_0x004b:
            r0 = 42
            X.9JU r8 = new X.9JU
            r8.<init>(r10, r14, r3, r0)
            goto L_0x0017
        L_0x0053:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0059
            r1 = 0
            return r1
        L_0x0059:
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x005f:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.camera.effect.mq.effectmetadata.EffectTrayService.A00(X.8cI, com.instagram.camera.effect.mq.effectmetadata.EffectTrayService, java.lang.String, java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDg, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(X.C39753A7t r5, com.instagram.camera.effect.mq.effectmetadata.EffectTrayService r6, X.AnonymousClass4D7 r7) {
        /*
            r3 = 15
            boolean r0 = X.C66128MDg.A01(r3, r7)
            if (r0 == 0) goto L_0x0053
            r4 = r7
            X.MDg r4 = (X.C66128MDg) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0053
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A02
            X.1Hj r2 = X.1Hj.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x0043
            if (r0 != r1) goto L_0x005f
            java.lang.Object r6 = r4.A01
            com.instagram.camera.effect.mq.effectmetadata.EffectTrayService r6 = (com.instagram.camera.effect.mq.effectmetadata.EffectTrayService) r6
            X.0eS.A00(r3)
        L_0x0028:
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x003a
            X.05G r1 = r6.A05
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r0 = r3.A00
        L_0x0034:
            r1.Epw(r0)
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x003a:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0059
            X.05G r1 = r6.A05
            X.9iI r0 = X.C385039iI.A00
            goto L_0x0034
        L_0x0043:
            X.0eS.A00(r3)
            com.instagram.camera.effect.mq.effectmetadata.EffectsByIdMetadataService r0 = r6.A06
            r4.A01 = r6
            r4.A00 = r1
            java.lang.Object r3 = r0.A02(r5, r4)
            if (r3 != r2) goto L_0x0028
            return r2
        L_0x0053:
            X.MDg r4 = new X.MDg
            r4.<init>(r6, r7, r3)
            goto L_0x0016
        L_0x0059:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x005f:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.camera.effect.mq.effectmetadata.EffectTrayService.A01(X.A7t, com.instagram.camera.effect.mq.effectmetadata.EffectTrayService, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.9JU, X.4D7] */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A03(com.instagram.camera.effect.mq.effectmetadata.EffectTrayService r7, X.C359248cL r8, java.lang.String r9, java.util.List r10, X.AnonymousClass4D7 r11) {
        /*
            r4 = 13
            boolean r0 = X.AnonymousClass9JU.A00(r4, r11)
            if (r0 == 0) goto L_0x0097
            r1 = r11
            X.9JU r1 = (X.AnonymousClass9JU) r1
            int r3 = r1.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L_0x0097
            int r3 = r3 - r2
            r1.A00 = r3
        L_0x0016:
            java.lang.Object r3 = r1.A01
            X.1Hj r2 = X.1Hj.A02
            int r0 = r1.A00
            r11 = 1
            if (r0 == 0) goto L_0x004c
            if (r0 != r11) goto L_0x00a3
            X.0eS.A00(r3)
        L_0x0024:
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0042
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r2 = r3.A00
            X.9Tj r2 = (X.C379319Tj) r2
            com.instagram.camera.effect.models.CameraAREffect r0 = r2.A00
            if (r0 == 0) goto L_0x00a0
            java.util.List r1 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r1)
            java.util.List r0 = r2.A04
            java.util.ArrayList r0 = X.00k.A0S(r0, r1)
            return r0
        L_0x0042:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0069
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x004c:
            X.0eS.A00(r3)
            boolean r0 = r8 instanceof X.C359238cK
            if (r0 == 0) goto L_0x006b
            X.8cK r8 = (X.C359238cK) r8
            X.8cI r4 = r8.A01
        L_0x0057:
            java.lang.String r3 = r4.A01
            if (r10 == 0) goto L_0x0069
            boolean r0 = X.0qQ.A0K(r3, r9)
            if (r0 != 0) goto L_0x0070
            java.lang.String r0 = "EFFECT_BY_ID"
            boolean r0 = X.0qQ.A0K(r3, r0)
            if (r0 != 0) goto L_0x0070
        L_0x0069:
            r0 = 0
            return r0
        L_0x006b:
            X.9Pu r8 = (X.C378439Pu) r8
            X.8cI r4 = r8.A00
            goto L_0x0057
        L_0x0070:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r8.addAll(r10)
            com.instagram.ar.core.effectcollection.EffectCollectionService r0 = r7.A01
            java.lang.Object r5 = X.018.A13(r8)
            if (r5 == 0) goto L_0x00ab
            java.lang.String r5 = (java.lang.String) r5
            r6 = 0
            X.0qQ.A0B(r5, r11)
            r9 = 3
            X.9Rs r3 = new X.9Rs
            r7 = r6
            r3.<init>(r4, r5, r6, r7, r8, r9, r11)
            r1.A00 = r11
            java.lang.Object r3 = r0.A09(r3, r1)
            if (r3 != r2) goto L_0x0024
            return r2
        L_0x0097:
            r0 = 42
            X.9JU r1 = new X.9JU
            r1.<init>(r7, r11, r4, r0)
            goto L_0x0016
        L_0x00a0:
            java.util.List r0 = r2.A04
            return r0
        L_0x00a3:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00ab:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.camera.effect.mq.effectmetadata.EffectTrayService.A03(com.instagram.camera.effect.mq.effectmetadata.EffectTrayService, X.8cL, java.lang.String, java.util.List, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.9JX, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A05(X.C39753A7t r15, X.AnonymousClass4D7 r16) {
        /*
            r14 = this;
            r4 = 14
            r5 = r16
            boolean r0 = X.AnonymousClass9JX.A00(r4, r5)
            r7 = r14
            if (r0 == 0) goto L_0x007e
            r2 = r5
            X.9JX r2 = (X.AnonymousClass9JX) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x007e
            int r3 = r3 - r1
            r2.A00 = r3
        L_0x0019:
            java.lang.Object r0 = r2.A02
            X.1Hj r1 = X.1Hj.A02
            int r6 = r2.A00
            r4 = 3
            r5 = 2
            r3 = 1
            r13 = 0
            if (r6 == 0) goto L_0x003c
            if (r6 == r3) goto L_0x0038
            if (r6 == r5) goto L_0x0038
            if (r6 != r4) goto L_0x0084
            java.lang.Object r3 = r2.A01
            X.05G r3 = (X.05G) r3
            X.0eS.A00(r0)
        L_0x0032:
            r3.Epw(r0)
        L_0x0035:
            X.0gF r1 = X.C60340gF.A00
            return r1
        L_0x0038:
            X.0eS.A00(r0)
            goto L_0x0035
        L_0x003c:
            X.0eS.A00(r0)
            java.lang.Integer r0 = r15.A03
            int r0 = r0.intValue()
            if (r0 == r13) goto L_0x0062
            if (r0 != r3) goto L_0x008c
            X.05G r3 = r14.A05
            X.8cL r8 = r15.A02
            r9 = 0
            java.lang.String r10 = r15.A06
            java.lang.String r11 = r15.A07
            r12 = r9
            X.8cM r0 = r7.A04(r8, r9, r10, r11, r12, r13)
            r2.A01 = r3
            r2.A00 = r4
            java.lang.Object r0 = X.AnonymousClass10c.A02(r2, r0)
            if (r0 != r1) goto L_0x0032
            return r1
        L_0x0062:
            X.84u r0 = r14.A04
            if (r0 == 0) goto L_0x0077
            java.util.List r0 = r15.A00
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0077
            r2.A00 = r3
            java.lang.Object r0 = A02(r15, r14, r2)
        L_0x0074:
            if (r0 != r1) goto L_0x0035
            return r1
        L_0x0077:
            r2.A00 = r5
            java.lang.Object r0 = A01(r15, r14, r2)
            goto L_0x0074
        L_0x007e:
            X.9JX r2 = new X.9JX
            r2.<init>(r14, r5, r4)
            goto L_0x0019
        L_0x0084:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x008c:
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.camera.effect.mq.effectmetadata.EffectTrayService.A05(X.A7t, X.4D7):java.lang.Object");
    }
}
