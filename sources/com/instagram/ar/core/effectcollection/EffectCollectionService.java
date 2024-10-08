package com.instagram.ar.core.effectcollection;

import X.0Tu;
import X.0qQ;
import X.0sL;
import X.10q;
import X.182;
import X.19E;
import X.1Hj;
import X.1wR;
import X.AnonymousClass05E;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass0r6;
import X.AnonymousClass11E;
import X.AnonymousClass12T;
import X.AnonymousClass19G;
import X.AnonymousClass19S;
import X.AnonymousClass1t4;
import X.AnonymousClass4D7;
import X.AnonymousClass9KB;
import X.AnonymousClass9KF;
import X.AnonymousClass9KQ;
import X.C262204Co;
import X.C262224Cq;
import X.C311976dc;
import X.C346077uZ;
import X.C346187uk;
import X.C348767yz;
import X.C349177zi;
import X.C349187zj;
import X.C349197zk;
import X.C349207zl;
import X.C359218cI;
import X.C376879Jr;
import X.C376949Jy;
import X.C376959Jz;
import X.C377199Kx;
import X.C41322As4;
import X.C60340gF;
import X.C61410nE;
import X.C62170rn;
import X.C62180ro;
import X.MHA;
import X.MHH;
import android.content.Context;
import com.instagram.ar.core.effectcollection.persistence.RoomEffectCollectionRepository;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

public final class EffectCollectionService {
    public final long A00;
    public final long A01;
    public final long A02;
    public final Context A03;
    public final RoomEffectCollectionRepository A04;
    public final UserSession A05;
    public final C61410nE A06;
    public final AnonymousClass0eM A07 = AnonymousClass0eN.A01(new C377199Kx(this, 28));
    public final C262224Cq A08;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r4v1, types: [X.9Jd, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(com.instagram.ar.core.effectcollection.EffectCollectionService r15, X.C378919Rs r16, X.AnonymousClass4D7 r17) {
        /*
            r2 = r15
            r0 = r16
            r6 = 7
            r7 = r17
            boolean r1 = X.C376739Jd.A00(r6, r7)
            if (r1 == 0) goto L_0x014c
            r4 = r7
            X.9Jd r4 = (X.C376739Jd) r4
            int r5 = r4.A00
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r5 & r3
            if (r1 == 0) goto L_0x014c
            int r5 = r5 - r3
            r4.A00 = r5
        L_0x001a:
            java.lang.Object r10 = r4.A04
            X.1Hj r3 = X.1Hj.A02
            int r1 = r4.A00
            r6 = 3
            r5 = 2
            r8 = 1
            if (r1 == 0) goto L_0x002f
            if (r1 == r8) goto L_0x0052
            if (r1 == r5) goto L_0x0104
            if (r1 != r6) goto L_0x0153
            X.0eS.A00(r10)
        L_0x002e:
            return r10
        L_0x002f:
            X.0eS.A00(r10)
            boolean r1 = r0.A06
            if (r1 == 0) goto L_0x0143
            java.util.ArrayList r9 = r0.A00()
            com.instagram.ar.core.effectcollection.persistence.RoomEffectCollectionRepository r10 = r15.A04
            long r6 = r0.A00
            X.8cI r11 = r0.A01
            r4.A01 = r15
            r4.A02 = r0
            r4.A03 = r9
            r4.A00 = r8
            r14 = r6
            r12 = r9
            r13 = r4
            java.lang.Object r10 = r10.A02(r11, r12, r13, r14)
            if (r10 != r3) goto L_0x0061
            return r3
        L_0x0052:
            java.lang.Object r9 = r4.A03
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r0 = r4.A02
            X.9Rs r0 = (X.C378919Rs) r0
            java.lang.Object r2 = r4.A01
            com.instagram.ar.core.effectcollection.EffectCollectionService r2 = (com.instagram.ar.core.effectcollection.EffectCollectionService) r2
            X.0eS.A00(r10)
        L_0x0061:
            java.util.List r10 = (java.util.List) r10
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r13 = r10.iterator()
        L_0x0071:
            boolean r6 = r13.hasNext()
            if (r6 == 0) goto L_0x0090
            java.lang.Object r12 = r13.next()
            r6 = r12
            com.instagram.camera.effect.models.CameraAREffect r6 = (com.instagram.camera.effect.models.CameraAREffect) r6
            java.lang.String r7 = r6.A0K
            java.lang.String r6 = r0.A02
            boolean r6 = X.0qQ.A0K(r7, r6)
            if (r6 == 0) goto L_0x008c
            r11.add(r12)
            goto L_0x0071
        L_0x008c:
            r1.add(r12)
            goto L_0x0071
        L_0x0090:
            int r7 = r9.size()
            int r6 = r10.size()
            if (r7 != r6) goto L_0x00bc
            java.lang.Object r2 = X.00k.A0I(r11)
            com.instagram.camera.effect.models.CameraAREffect r2 = (com.instagram.camera.effect.models.CameraAREffect) r2
            java.util.List r0 = r0.A05
            java.util.List r6 = X.C67269Ml3.A00(r1, r0)
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
            r7 = 0
            X.0qQ.A0B(r2, r7)
            X.0qQ.A0B(r6, r8)
            r4 = 0
            X.9Tj r1 = new X.9Tj
            r5 = r4
            r1.<init>(r2, r3, r4, r5, r6, r7)
        L_0x00b6:
            X.3Ih r10 = new X.3Ih
            r10.<init>(r1)
            return r10
        L_0x00bc:
            long r15 = r2.A00
            java.lang.String r11 = r0.A02
            X.8cI r10 = r0.A01
            java.util.List r9 = r0.A05
            r6 = 10
            int r6 = X.0Yv.A1E(r1, r6)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r6)
            java.util.Iterator r7 = r1.iterator()
        L_0x00d3:
            boolean r6 = r7.hasNext()
            if (r6 == 0) goto L_0x00e5
            java.lang.Object r6 = r7.next()
            com.instagram.camera.effect.models.CameraAREffect r6 = (com.instagram.camera.effect.models.CameraAREffect) r6
            java.lang.String r6 = r6.A0K
            r8.add(r6)
            goto L_0x00d3
        L_0x00e5:
            java.util.List r14 = X.00k.A0e(r9, r8)
            java.lang.String r12 = r0.A03
            java.lang.String r13 = r0.A04
            r17 = 0
            X.9Rs r9 = new X.9Rs
            r9.<init>(r10, r11, r12, r13, r14, r15, r17)
            r4.A01 = r0
            r4.A02 = r1
            r6 = 0
            r4.A03 = r6
            r4.A00 = r5
            java.lang.Object r10 = A01(r2, r9, r4)
            if (r10 != r3) goto L_0x010f
            return r3
        L_0x0104:
            java.lang.Object r1 = r4.A02
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Object r0 = r4.A01
            X.9Rs r0 = (X.C378919Rs) r0
            X.0eS.A00(r10)
        L_0x010f:
            X.3Ii r10 = (X.C239803Ii) r10
            boolean r2 = r10 instanceof X.C239793Ih
            if (r2 == 0) goto L_0x0139
            X.3Ih r10 = (X.C239793Ih) r10
            java.lang.Object r2 = r10.A00
            X.9Tj r2 = (X.C379319Tj) r2
            com.instagram.camera.effect.models.CameraAREffect r3 = r2.A00
            java.lang.String r5 = r2.A03
            java.lang.String r6 = r2.A02
            boolean r8 = r2.A05
            java.util.List r2 = r2.A04
            java.util.ArrayList r1 = X.00k.A0S(r1, r2)
            java.util.List r0 = r0.A05
            java.util.List r7 = X.C67269Ml3.A00(r1, r0)
            java.lang.Integer r4 = X.AnonymousClass05K.A0j
            X.9Tj r1 = new X.9Tj
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8)
            goto L_0x00b6
        L_0x0139:
            boolean r0 = r10 instanceof X.C297815sO
            if (r0 != 0) goto L_0x002e
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x0143:
            r4.A00 = r6
            java.lang.Object r10 = A01(r15, r0, r4)
            if (r10 != r3) goto L_0x002e
            return r3
        L_0x014c:
            X.9Jd r4 = new X.9Jd
            r4.<init>(r15, r7, r6)
            goto L_0x001a
        L_0x0153:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.effectcollection.EffectCollectionService.A02(com.instagram.ar.core.effectcollection.EffectCollectionService, X.9Rs, X.4D7):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: X.5sO} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: X.3Ih} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: X.5sO} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: X.5sO} */
    /* JADX WARNING: type inference failed for: r4v1, types: [X.9JX, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object A03(com.instagram.ar.core.effectcollection.EffectCollectionService r14, X.C359218cI r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, X.AnonymousClass4D7 r19, long r20) {
        /*
            r3 = 9
            r5 = r19
            boolean r0 = X.AnonymousClass9JX.A00(r3, r5)
            if (r0 == 0) goto L_0x00b3
            r4 = r5
            X.9JX r4 = (X.AnonymousClass9JX) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00b3
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0018:
            java.lang.Object r2 = r4.A02
            X.1Hj r1 = X.1Hj.A02
            int r0 = r4.A00
            r13 = 1
            if (r0 == 0) goto L_0x008d
            if (r0 != r13) goto L_0x00ce
            java.lang.Object r3 = r4.A01
            X.JYO r3 = (X.JYO) r3
            X.0eS.A00(r2)
        L_0x002a:
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0070
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r1 = r2.A00
            X.9Tj r1 = (X.C379319Tj) r1
            com.instagram.camera.effect.models.CameraAREffect r0 = r1.A00
            if (r0 != 0) goto L_0x0045
            boolean r0 = r1.A05
            if (r0 == 0) goto L_0x0066
            X.K2Y r0 = X.K2Y.A00
        L_0x0040:
            X.5sO r2 = new X.5sO
            r2.<init>(r0)
        L_0x0045:
            r3.A01(r2)
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x005c
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r0 = r2.A00
            X.9Tj r0 = (X.C379319Tj) r0
            com.instagram.camera.effect.models.CameraAREffect r0 = r0.A00
            if (r0 == 0) goto L_0x00ba
            X.3Ih r2 = new X.3Ih
            r2.<init>(r0)
        L_0x005b:
            return r2
        L_0x005c:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 != 0) goto L_0x005b
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0066:
            java.lang.String r2 = r1.A03
            java.lang.String r1 = r1.A02
            X.R7r r0 = new X.R7r
            r0.<init>(r2, r1)
            goto L_0x0040
        L_0x0070:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00c8
            X.5sO r2 = (X.C297815sO) r2
            java.lang.Object r1 = r2.A00
            boolean r0 = r1 instanceof X.K2W
            if (r0 == 0) goto L_0x007f
            X.K2a r0 = X.C61313K2a.A00
            goto L_0x0040
        L_0x007f:
            boolean r0 = r1 instanceof X.K2V
            if (r0 == 0) goto L_0x0086
            X.K2Z r0 = X.K2Z.A00
            goto L_0x0040
        L_0x0086:
            boolean r0 = r1 instanceof X.K2X
            if (r0 == 0) goto L_0x00c2
            X.K2b r0 = X.C61314K2b.A00
            goto L_0x0040
        L_0x008d:
            X.0eS.A00(r2)
            X.JYO r3 = new X.JYO
            r6 = r15
            r3.<init>(r15)
            r3.A00(r13)
            X.0sn r10 = X.0sn.A00
            X.9Rs r5 = new X.9Rs
            r7 = r16
            r8 = r17
            r9 = r18
            r11 = r20
            r5.<init>(r6, r7, r8, r9, r10, r11, r13)
            r4.A01 = r3
            r4.A00 = r13
            java.lang.Object r2 = A02(r14, r5, r4)
            if (r2 != r1) goto L_0x002a
            return r1
        L_0x00b3:
            X.9JX r4 = new X.9JX
            r4.<init>(r14, r5, r3)
            goto L_0x0018
        L_0x00ba:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00c2:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x00c8:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x00ce:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.effectcollection.EffectCollectionService.A03(com.instagram.ar.core.effectcollection.EffectCollectionService, X.8cI, java.lang.String, java.lang.String, java.lang.String, X.4D7, long):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.9Jd, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0180 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A05(com.instagram.ar.core.effectcollection.EffectCollectionService r12, X.C346197ul r13, X.C346197ul r14, X.AnonymousClass4D7 r15) {
        /*
            r9 = r12
            r3 = 8
            r4 = r15
            boolean r0 = X.C376739Jd.A00(r3, r15)
            if (r0 == 0) goto L_0x0187
            r5 = r4
            X.9Jd r5 = (X.C376739Jd) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0187
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0018:
            java.lang.Object r8 = r5.A04
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r3 = 2
            r10 = 1
            if (r0 == 0) goto L_0x0054
            if (r0 == r10) goto L_0x012e
            if (r0 != r3) goto L_0x018e
            java.lang.Object r10 = r5.A03
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r2 = r5.A02
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r1 = r5.A01
            X.7z9 r1 = (X.C348867z9) r1
            X.0eS.A00(r8)
        L_0x0035:
            int r6 = r10.size()
            int r5 = r2.size()
            X.02m r4 = r1.A02
            int r2 = r1.A00
            r1 = 17636272(0x10d1bb0, float:2.5917475E-38)
            java.lang.String r0 = "smart_eviction_candidates_count"
            r4.markerAnnotate(r1, r2, r0, r6)
            java.lang.String r0 = "maybe_smart_eviction_candidates_count"
            r4.markerAnnotate(r1, r2, r0, r5)
            r4.markerEnd(r1, r2, r3)
        L_0x0051:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x0054:
            X.0eS.A00(r8)
            java.lang.Object r11 = r13.A00
            X.9Ih r11 = (X.C376519Ih) r11
            java.lang.Object r0 = r11.A01
            X.8cI r0 = (X.C359218cI) r0
            X.0qQ.A0B(r0, r10)
            X.7z9 r1 = new X.7z9
            r1.<init>(r0)
            X.02m r8 = r1.A02
            int r7 = r1.A00
            r6 = 17636272(0x10d1bb0, float:2.5917475E-38)
            r8.markerStart(r6, r7)
            X.8cI r12 = r1.A01
            java.lang.String r2 = r12.A02
            java.lang.String r0 = "product_id"
            r8.markerAnnotate(r6, r7, r0, r2)
            java.lang.String r2 = r12.A01
            java.lang.String r0 = "category_id"
            r8.markerAnnotate(r6, r7, r0, r2)
            if (r14 == 0) goto L_0x0181
            java.lang.Object r0 = r14.A00
            X.9Ih r0 = (X.C376519Ih) r0
            if (r0 == 0) goto L_0x0181
            java.lang.Object r2 = r0.A02
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            if (r2 == 0) goto L_0x0181
            java.lang.Object r0 = r11.A02
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r2 = X.00k.A0e(r2, r0)
            if (r2 == 0) goto L_0x0181
            boolean r0 = r2.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0181
            com.instagram.ar.core.effectcollection.persistence.RoomEffectCollectionRepository r7 = r9.A04
            r0 = 10
            int r0 = X.0Yv.A1E(r2, r0)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r0)
            java.util.Iterator r6 = r2.iterator()
        L_0x00b2:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00c4
            java.lang.Object r0 = r6.next()
            com.instagram.camera.effect.models.CameraAREffect r0 = (com.instagram.camera.effect.models.CameraAREffect) r0
            java.lang.String r0 = r0.A0K
            r8.add(r0)
            goto L_0x00b2
        L_0x00c4:
            r5.A01 = r9
            r5.A02 = r1
            r5.A03 = r2
            r5.A00 = r10
            X.6dc r11 = r7.A00
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r6 = "\n"
            r10.append(r6)
            java.lang.String r0 = "      SELECT DISTINCT effectId FROM effect_collections_effects "
            r10.append(r0)
            r10.append(r6)
            java.lang.String r0 = "      WHERE effectId IN ("
            r10.append(r0)
            int r7 = r8.size()
            X.1wO.A00(r10, r7)
            java.lang.String r0 = ")"
            r10.append(r0)
            r10.append(r6)
            java.lang.String r0 = "  "
            r10.append(r0)
            java.lang.String r6 = r10.toString()
            java.util.TreeMap r0 = X.1WY.A08
            X.1WY r10 = X.1Wa.A00(r6, r7)
            java.util.Iterator r7 = r8.iterator()
            r6 = 1
        L_0x0108:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x011a
            java.lang.Object r0 = r7.next()
            java.lang.String r0 = (java.lang.String) r0
            r10.ADh(r6, r0)
            int r6 = r6 + 1
            goto L_0x0108
        L_0x011a:
            android.os.CancellationSignal r8 = new android.os.CancellationSignal
            r8.<init>()
            X.3oI r7 = r11.A07
            X.8w7 r6 = new X.8w7
            r6.<init>(r10, r11)
            r0 = 0
            java.lang.Object r8 = X.1wR.A00(r8, r7, r6, r5, r0)
            if (r8 != r4) goto L_0x013d
            return r4
        L_0x012e:
            java.lang.Object r2 = r5.A03
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r1 = r5.A02
            X.7z9 r1 = (X.C348867z9) r1
            java.lang.Object r9 = r5.A01
            com.instagram.ar.core.effectcollection.EffectCollectionService r9 = (com.instagram.ar.core.effectcollection.EffectCollectionService) r9
            X.0eS.A00(r8)
        L_0x013d:
            java.util.List r8 = (java.util.List) r8
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r7 = r2.iterator()
        L_0x0148:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0161
            java.lang.Object r6 = r7.next()
            r0 = r6
            com.instagram.camera.effect.models.CameraAREffect r0 = (com.instagram.camera.effect.models.CameraAREffect) r0
            java.lang.String r0 = r0.A0K
            boolean r0 = r8.contains(r0)
            if (r0 != 0) goto L_0x0148
            r10.add(r6)
            goto L_0x0148
        L_0x0161:
            X.0eM r0 = r9.A07
            java.lang.Object r12 = r0.getValue()
            r5.A01 = r1
            r5.A02 = r2
            r5.A03 = r10
            r5.A00 = r3
            X.0sn r11 = X.0sn.A00
            java.lang.Integer r13 = X.AnonymousClass05K.A01
            r14 = 0
            r15 = 5
            X.9KM r9 = new X.9KM
            r9.<init>((java.lang.Object) r10, (java.lang.Object) r11, (java.lang.Object) r12, (java.lang.Object) r13, (X.AnonymousClass4D7) r14, (int) r15)
            java.lang.Object r0 = X.19E.A00(r5, r9)
            if (r0 != r4) goto L_0x0035
            return r4
        L_0x0181:
            r0 = 4
            r8.markerEnd(r6, r7, r0)
            goto L_0x0051
        L_0x0187:
            X.9Jd r5 = new X.9Jd
            r5.<init>(r12, r15, r3)
            goto L_0x0018
        L_0x018e:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.effectcollection.EffectCollectionService.A05(com.instagram.ar.core.effectcollection.EffectCollectionService, X.7ul, X.7ul, X.4D7):java.lang.Object");
    }

    public static final C62180ro A06(C349177zi r7, EffectCollectionService effectCollectionService) {
        0sL mha;
        C349177zi r4 = r7;
        C346077uZ r6 = new C346077uZ(r7.A01, r7.A03);
        EffectCollectionService effectCollectionService2 = effectCollectionService;
        if (r7.A08) {
            mha = new AnonymousClass9KF((Object) r7, (AnonymousClass4D7) null, (Object) effectCollectionService, 11);
        } else {
            mha = new MHA(49, (AnonymousClass4D7) null);
        }
        return new C62180ro(new C376949Jy(r6, (AnonymousClass4D7) null, 3), new C62170rn(new C376959Jz((Object) r4, (Object) r6, (AnonymousClass4D7) null, 11), 10q.A02(new AnonymousClass9KQ(r4, effectCollectionService2, r6, (AnonymousClass4D7) null, 1), 10q.A02(new AnonymousClass9KQ(r4, effectCollectionService2, r6, (AnonymousClass4D7) null, 0), new AnonymousClass05E(mha)))));
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.9Jc, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0B(X.C346197ul r11, X.AnonymousClass4D7 r12, boolean r13, boolean r14) {
        /*
            r10 = this;
            r7 = r11
            r3 = 0
            boolean r0 = r12 instanceof X.C376729Jc
            if (r0 == 0) goto L_0x006c
            r4 = r12
            X.9Jc r4 = (X.C376729Jc) r4
            int r0 = r4.A06
            if (r0 != r3) goto L_0x006c
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x006c
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0018:
            java.lang.Object r6 = r4.A03
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L_0x002c
            if (r0 == r1) goto L_0x0043
            if (r0 != r2) goto L_0x0072
            X.0eS.A00(r6)
        L_0x0029:
            X.0gF r3 = X.C60340gF.A00
        L_0x002b:
            return r3
        L_0x002c:
            X.0eS.A00(r6)
            com.instagram.ar.core.effectcollection.persistence.RoomEffectCollectionRepository r0 = r10.A04
            r4.A01 = r10
            r4.A02 = r11
            r4.A04 = r13
            r4.A05 = r14
            r4.A00 = r1
            java.lang.Object r6 = r0.A03(r11, r4, r13)
            if (r6 == r3) goto L_0x002b
            r5 = r10
            goto L_0x0050
        L_0x0043:
            boolean r14 = r4.A05
            boolean r13 = r4.A04
            java.lang.Object r7 = r4.A02
            java.lang.Object r5 = r4.A01
            com.instagram.ar.core.effectcollection.EffectCollectionService r5 = (com.instagram.ar.core.effectcollection.EffectCollectionService) r5
            X.0eS.A00(r6)
        L_0x0050:
            if (r13 == 0) goto L_0x0029
            if (r14 == 0) goto L_0x0029
            r8 = 0
            r4.A01 = r8
            r4.A02 = r8
            r4.A00 = r2
            X.4Cq r2 = r5.A08
            r9 = 13
            X.9KF r4 = new X.9KF
            r4.<init>(r5, r6, r7, r8, r9)
            X.19B r1 = X.19B.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.1Eo.A03(r0, r1, r4, r2)
            goto L_0x0029
        L_0x006c:
            X.9Jc r4 = new X.9Jc
            r4.<init>(r10, r12, r3)
            goto L_0x0018
        L_0x0072:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.effectcollection.EffectCollectionService.A0B(X.7ul, X.4D7, boolean, boolean):java.lang.Object");
    }

    public /* synthetic */ EffectCollectionService(Context context, RoomEffectCollectionRepository roomEffectCollectionRepository, UserSession userSession) {
        C61410nE r4 = C61410nE.A00;
        AnonymousClass12T r3 = AnonymousClass12T.A00;
        AnonymousClass19S A022 = 19E.A02(r3.AOJ(1362142542, 3).plus(new AnonymousClass19G((C262204Co) null)));
        0qQ.A0B(userSession, 2);
        0qQ.A0B(r4, 3);
        0qQ.A0B(A022, 9);
        this.A04 = roomEffectCollectionRepository;
        this.A05 = userSession;
        this.A06 = r4;
        this.A03 = context;
        this.A08 = A022;
        this.A00 = 182.A01(0Tu.A05, userSession, 36612135182145842L);
        TimeUnit timeUnit = TimeUnit.DAYS;
        this.A02 = timeUnit.toMillis(90);
        this.A01 = timeUnit.toMillis(2);
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.9Ja, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007e, code lost:
        if (r5.A05 == false) goto L_0x0080;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.ar.core.effectcollection.EffectCollectionService r6, X.C346077uZ r7, X.C359218cI r8, X.C346197ul r9, java.lang.String r10, X.AnonymousClass4D7 r11, boolean r12) {
        /*
            r4 = 9
            boolean r0 = X.C376709Ja.A00(r4, r11)
            if (r0 == 0) goto L_0x0094
            r3 = r11
            X.9Ja r3 = (X.C376709Ja) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0094
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r3.A03
            X.1Hj r2 = X.1Hj.A02
            int r0 = r3.A00
            r4 = 1
            if (r0 == 0) goto L_0x0040
            if (r0 != r4) goto L_0x009b
            java.lang.Object r7 = r3.A02
            X.7uZ r7 = (X.C346077uZ) r7
            java.lang.Object r9 = r3.A01
            X.7ul r9 = (X.C346197ul) r9
            X.0eS.A00(r1)
        L_0x002c:
            java.lang.Object r0 = r9.A00
            X.9Ih r0 = (X.C376519Ih) r0
            java.lang.Object r1 = r0.A03
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r0 = r0.A02
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            r7.A01(r0, r1)
            return r9
        L_0x0040:
            X.0eS.A00(r1)
            java.lang.Object r5 = r9.A00
            X.9Ih r5 = (X.C376519Ih) r5
            java.lang.Object r0 = r5.A02
            java.util.List r0 = (java.util.List) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0079
            java.lang.String r1 = r8.A01
            java.lang.String r0 = "SAVED"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0079
            X.02m r4 = X.02m.A0p
            X.0qQ.A07(r4)
            int r3 = X.C346077uZ.A00(r7)
            r2 = 17631244(0x10d080c, float:2.5903383E-38)
            java.lang.String r1 = "failure_reason"
            java.lang.String r0 = "effects_empty"
            r4.markerAnnotate(r2, r3, r1, r0)
            int r1 = X.C346077uZ.A00(r7)
            r0 = 3
            r4.markerEnd(r2, r1, r0)
            return r9
        L_0x0079:
            if (r12 == 0) goto L_0x0080
            boolean r1 = r5.A05
            r0 = 0
            if (r1 != 0) goto L_0x0081
        L_0x0080:
            r0 = 1
        L_0x0081:
            r3.A01 = r9
            r3.A02 = r7
            r3.A00 = r4
            if (r0 == 0) goto L_0x002c
            r0 = 0
            if (r10 != 0) goto L_0x008d
            r0 = 1
        L_0x008d:
            java.lang.Object r0 = r6.A0B(r9, r3, r0, r4)
            if (r0 != r2) goto L_0x002c
            return r2
        L_0x0094:
            X.9Ja r3 = new X.9Ja
            r3.<init>(r6, r11, r4)
            goto L_0x0016
        L_0x009b:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.effectcollection.EffectCollectionService.A00(com.instagram.ar.core.effectcollection.EffectCollectionService, X.7uZ, X.8cI, X.7ul, java.lang.String, X.4D7, boolean):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.9JX, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.instagram.ar.core.effectcollection.EffectCollectionService r21, X.C378919Rs r22, X.AnonymousClass4D7 r23) {
        /*
            r2 = r21
            r4 = 10
            r6 = r23
            boolean r0 = X.AnonymousClass9JX.A00(r4, r6)
            if (r0 == 0) goto L_0x01ec
            r5 = r6
            X.9JX r5 = (X.AnonymousClass9JX) r5
            int r3 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x01ec
            int r3 = r3 - r1
            r5.A00 = r3
        L_0x001a:
            java.lang.Object r0 = r5.A02
            X.1Hj r4 = X.1Hj.A02
            int r1 = r5.A00
            r3 = 1
            if (r1 == 0) goto L_0x003e
            if (r1 != r3) goto L_0x01f3
            java.lang.Object r2 = r5.A01
            com.instagram.ar.core.effectcollection.EffectCollectionService r2 = (com.instagram.ar.core.effectcollection.EffectCollectionService) r2
            X.0eS.A00(r0)
        L_0x002c:
            X.4Cq r5 = r2.A08
            r4 = 0
            r1 = 18
            X.9K3 r3 = new X.9K3
            r3.<init>((java.lang.Object) r2, (java.lang.Object) r0, (X.AnonymousClass4D7) r4, (int) r1)
            X.19B r2 = X.19B.A00
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            X.1Eo.A03(r1, r2, r3, r5)
            return r0
        L_0x003e:
            X.0eS.A00(r0)
            X.0JN r0 = X.0JN.A01()
            boolean r0 = r0.A0A()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0055
            X.K2X r0 = X.K2X.A00
            X.5sO r4 = new X.5sO
            r4.<init>(r0)
            return r4
        L_0x0055:
            com.instagram.common.session.UserSession r1 = r2.A05
            X.0nE r0 = r2.A06
            X.0qQ.A0B(r0, r3)
            X.7un r6 = new X.7un
            r6.<init>(r1, r0)
            r1 = r22
            java.lang.String r8 = r1.A02
            X.8cI r0 = r1.A01
            r23 = r0
            java.lang.String r0 = r1.A03
            r22 = r0
            java.lang.String r9 = r1.A04
            java.util.List r0 = r1.A05
            r21 = r0
            long r0 = r1.A00
            r19 = r0
            r11 = 0
            com.instagram.common.session.UserSession r10 = r6.A01
            r18 = 0
            X.2IV r13 = X.C278474ww.A01(r10)
            r0 = r23
            X.84A r0 = r0.A00
            X.0qQ.A0B(r0, r11)
            int r0 = r0.ordinal()
            r7 = 3
            if (r0 != r7) goto L_0x0140
            java.lang.Integer r17 = X.AnonymousClass05K.A00
        L_0x0090:
            X.0K0 r1 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r0 = "effect_id"
            X.0Df r14 = r1.A02()
            X.0Df.A00(r14, r8, r0)
            java.lang.String r1 = "crypto_hash"
            r0 = r22
            X.0Df.A00(r14, r0, r1)
            java.lang.String r0 = "revision_id"
            X.0Df.A00(r14, r9, r0)
            X.2IS r12 = new X.2IS
            r12.<init>()
            java.lang.String r0 = "device_capabilities"
            r12.A00(r13, r0)
            r0 = 240(0xf0, float:3.36E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "preview_width"
            r12.A03(r0, r1)
            java.lang.String r0 = "preview_height"
            r12.A03(r0, r1)
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r21)
            java.lang.String r0 = "requested_effect_ids"
            r12.A05(r0, r1)
            r16 = 0
            if (r1 == 0) goto L_0x00d0
            r16 = 1
        L_0x00d0:
            java.lang.String r0 = "target_effect_id"
            r12.A04(r0, r8)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r11)
            java.lang.String r0 = "include_preview_image"
            r12.A02(r0, r1)
            java.lang.String r15 = "TAR_BROTLI"
            java.lang.String r0 = "ZIP"
            com.google.common.collect.ImmutableList r15 = com.google.common.collect.ImmutableList.of(r15, r0)
            X.0qQ.A07(r15)
            java.lang.String r0 = "supported_compression_types"
            r12.A05(r0, r15)
            if (r17 == 0) goto L_0x013e
            java.lang.String r15 = "INSTAGRAM__DIRECT__RTC__EFFECTS_BY_ID"
        L_0x00f2:
            java.lang.String r0 = "surface_identity"
            r12.A04(r0, r15)
            java.lang.String r15 = "target_effect_params"
            X.2IV r0 = r12.A00
            X.0Df r0 = r0.A02()
            r0.A0E(r14, r15)
            java.lang.String r0 = "formatted_media_count_enabled"
            r12.A02(r0, r1)
            java.util.TreeMap r1 = new java.util.TreeMap
            r1.<init>()
            X.0Df r0 = r13.A00
            com.facebook.graphql.calls.GraphQlCallInput.A01(r0, r13, r1)
            java.lang.String r13 = "supported_texture_formats"
            boolean r0 = r1.containsKey(r13)
            if (r0 == 0) goto L_0x014b
            java.lang.Object r1 = r1.get(r13)
            boolean r0 = r1 instanceof java.util.List
            if (r0 == 0) goto L_0x014b
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r15 = r1.iterator()
        L_0x012c:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0144
            java.lang.Object r1 = r15.next()
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x012c
            r14.add(r1)
            goto L_0x012c
        L_0x013e:
            r15 = 0
            goto L_0x00f2
        L_0x0140:
            r17 = 0
            goto L_0x0090
        L_0x0144:
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r14)
            r12.A05(r13, r0)
        L_0x014b:
            X.17k.A0E(r16)
            java.lang.Class<X.B6w> r1 = X.B6w.class
            java.lang.String r0 = "IGAREffectsByIdQuery"
            X.3Fa r13 = new X.3Fa
            r13.<init>(r12, r1, r0, r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = r10.A06
            r11.append(r0)
            r1 = 95
            r11.append(r1)
            r11.append(r8)
            r11.append(r1)
            r0 = r22
            r11.append(r0)
            r11.append(r1)
            r11.append(r9)
            r11.append(r1)
            r0 = r21
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            int r1 = r0.hashCode()
            java.lang.String r0 = "effects_by_id_"
            java.lang.String r9 = X.002.A0O(r0, r1)
            r11 = 0
            int r0 = (r19 > r11 ? 1 : (r19 == r11 ? 0 : -1))
            r8 = 0
            if (r0 <= 0) goto L_0x0195
            r8 = 1
        L_0x0195:
            X.0qQ.A0B(r9, r7)
            X.3Fb r1 = new X.3Fb
            r1.<init>(r10)
            r1.A08(r13)
            if (r8 == 0) goto L_0x01e9
            X.1JQ r0 = X.1JQ.A05
            if (r0 == 0) goto L_0x01e6
            boolean r0 = r0.A02(r9)
            if (r0 != r3) goto L_0x01e6
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
        L_0x01ae:
            r1.A03 = r0
            r0 = 0
            if (r8 == 0) goto L_0x01b4
            r0 = r9
        L_0x01b4:
            r1.A05 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r19)
            r1.A04 = r0
            X.1OC r1 = r1.A06()
            r0 = 710(0x2c6, float:9.95E-43)
            X.032 r8 = r1.A04(r0, r7)
            r7 = 9
            X.9Jr r1 = new X.9Jr
            r0 = r18
            r1.<init>(r7, r0)
            X.7qX r7 = new X.7qX
            r7.<init>(r1, r8)
            X.JYs r1 = new X.JYs
            r0 = r23
            r1.<init>(r6, r0, r7)
            r5.A01 = r2
            r5.A00 = r3
            java.lang.Object r0 = X.AnonymousClass10c.A02(r5, r1)
            if (r0 != r4) goto L_0x002c
            return r4
        L_0x01e6:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x01ae
        L_0x01e9:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x01ae
        L_0x01ec:
            X.9JX r5 = new X.9JX
            r5.<init>(r2, r6, r4)
            goto L_0x001a
        L_0x01f3:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.effectcollection.EffectCollectionService.A01(com.instagram.ar.core.effectcollection.EffectCollectionService, X.9Rs, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r9v1, types: [X.ME4, X.4D7] */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A04(com.instagram.ar.core.effectcollection.EffectCollectionService r11, X.C359218cI r12, java.lang.String r13, X.AnonymousClass4D7 r14) {
        /*
            r3 = 11
            boolean r0 = X.ME4.A03(r3, r14)
            r4 = r11
            if (r0 == 0) goto L_0x0049
            r9 = r14
            X.ME4 r9 = (X.ME4) r9
            int r2 = r9.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0049
            int r2 = r2 - r1
            r9.A00 = r2
        L_0x0017:
            java.lang.Object r3 = r9.A01
            X.1Hj r2 = X.1Hj.A02
            int r0 = r9.A00
            r1 = 1
            if (r0 == 0) goto L_0x0030
            if (r0 != r1) goto L_0x005d
            X.0eS.A00(r3)
        L_0x0025:
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0051
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r2 = r3.A00
            return r2
        L_0x0030:
            X.0eS.A00(r3)
            long r10 = r11.A01
            r7 = 0
            r6 = r13
            X.0qQ.A0B(r13, r1)
            r0 = 2
            r5 = r12
            X.0qQ.A0B(r12, r0)
            r9.A00 = r1
            r8 = r7
            java.lang.Object r3 = A03(r4, r5, r6, r7, r8, r9, r10)
            if (r3 != r2) goto L_0x0025
            return r2
        L_0x0049:
            r0 = 42
            X.ME4 r9 = new X.ME4
            r9.<init>(r11, r14, r3, r0)
            goto L_0x0017
        L_0x0051:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0057
            r2 = 0
            return r2
        L_0x0057:
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x005d:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.effectcollection.EffectCollectionService.A04(com.instagram.ar.core.effectcollection.EffectCollectionService, X.8cI, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: X.5sO} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: X.3Ih} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: X.5sO} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: X.5sO} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C239803Ii A08(X.AnonymousClass4D7 r6) {
        /*
            r5 = this;
            r4 = 9
            boolean r0 = X.AnonymousClass9JX.A00(r4, r6)
            if (r0 == 0) goto L_0x0089
            r3 = r6
            X.9JX r3 = (X.AnonymousClass9JX) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0089
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r3.A02
            int r1 = r3.A00
            r0 = 1
            if (r1 == 0) goto L_0x00ab
            if (r1 != r0) goto L_0x00a3
            java.lang.Object r3 = r3.A01
            X.JYO r3 = (X.JYO) r3
            X.0eS.A00(r2)
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x006c
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r1 = r2.A00
            X.9Tj r1 = (X.C379319Tj) r1
            com.instagram.camera.effect.models.CameraAREffect r0 = r1.A00
            if (r0 != 0) goto L_0x0041
            boolean r0 = r1.A05
            if (r0 == 0) goto L_0x0062
            X.K2Y r0 = X.K2Y.A00
        L_0x003c:
            X.5sO r2 = new X.5sO
            r2.<init>(r0)
        L_0x0041:
            r3.A01(r2)
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0058
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r0 = r2.A00
            X.9Tj r0 = (X.C379319Tj) r0
            com.instagram.camera.effect.models.CameraAREffect r0 = r0.A00
            if (r0 == 0) goto L_0x008f
            X.3Ih r2 = new X.3Ih
            r2.<init>(r0)
        L_0x0057:
            return r2
        L_0x0058:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0057
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0062:
            java.lang.String r2 = r1.A03
            java.lang.String r1 = r1.A02
            X.R7r r0 = new X.R7r
            r0.<init>(r2, r1)
            goto L_0x003c
        L_0x006c:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 == 0) goto L_0x009d
            X.5sO r2 = (X.C297815sO) r2
            java.lang.Object r1 = r2.A00
            boolean r0 = r1 instanceof X.K2W
            if (r0 == 0) goto L_0x007b
            X.K2a r0 = X.C61313K2a.A00
            goto L_0x003c
        L_0x007b:
            boolean r0 = r1 instanceof X.K2V
            if (r0 == 0) goto L_0x0082
            X.K2Z r0 = X.K2Z.A00
            goto L_0x003c
        L_0x0082:
            boolean r0 = r1 instanceof X.K2X
            if (r0 == 0) goto L_0x0097
            X.K2b r0 = X.C61314K2b.A00
            goto L_0x003c
        L_0x0089:
            X.9JX r3 = new X.9JX
            r3.<init>(r5, r6, r4)
            goto L_0x0016
        L_0x008f:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0097:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x009d:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x00a3:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00ab:
            X.0eS.A00(r2)
            java.lang.String r1 = "collectionId"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.effectcollection.EffectCollectionService.A08(X.4D7):X.3Ii");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDw, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(X.C378919Rs r7, X.AnonymousClass4D7 r8) {
        /*
            r6 = this;
            r3 = 42
            boolean r0 = X.C66144MDw.A02(r3, r8)
            if (r0 == 0) goto L_0x004e
            r5 = r8
            X.MDw r5 = (X.C66144MDw) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x004e
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r4 = r5.A02
            X.1Hj r3 = X.1Hj.A02
            int r0 = r5.A00
            r2 = 1
            if (r0 == 0) goto L_0x002e
            if (r0 != r2) goto L_0x0054
            java.lang.Object r1 = r5.A01
            X.JYO r1 = (X.JYO) r1
            X.0eS.A00(r4)
        L_0x0028:
            X.3Ii r4 = (X.C239803Ii) r4
            r1.A01(r4)
            return r4
        L_0x002e:
            X.0eS.A00(r4)
            X.8cI r0 = r7.A01
            X.JYO r1 = new X.JYO
            r1.<init>(r0)
            java.util.ArrayList r0 = r7.A00()
            int r0 = r0.size()
            r1.A00(r0)
            r5.A01 = r1
            r5.A00 = r2
            java.lang.Object r4 = A02(r6, r7, r5)
            if (r4 != r3) goto L_0x0028
            return r3
        L_0x004e:
            X.MDw r5 = new X.MDw
            r5.<init>(r6, r8, r3)
            goto L_0x0016
        L_0x0054:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.effectcollection.EffectCollectionService.A09(X.9Rs, X.4D7):java.lang.Object");
    }

    public final Object A0A(C359218cI r6, AnonymousClass4D7 r7) {
        C311976dc r4 = this.A04.A00;
        Object A002 = AnonymousClass1t4.A00(r4.A07, r7, new C348767yz(r4, C346187uk.A01(r6, (String) null, System.currentTimeMillis(), false)));
        1Hj r0 = 1Hj.A02;
        if (A002 != r0) {
            A002 = C60340gF.A00;
        }
        if (A002 != r0) {
            return C60340gF.A00;
        }
        return A002;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.MED, java.lang.Object, X.4D7] */
    /* JADX WARNING: type inference failed for: r10v1, types: [X.MDw, java.lang.Object, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v2, types: [X.ME4, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0085, code lost:
        if (r0 != r6) goto L_0x018e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0C(X.AnonymousClass84A r14, X.AnonymousClass8Yi r15, X.AnonymousClass4D7 r16) {
        /*
            r13 = this;
            r4 = 16
            r5 = r16
            boolean r0 = X.MED.A04(r4, r5)
            if (r0 == 0) goto L_0x0035
            r3 = r5
            X.MED r3 = (X.MED) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0035
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0018:
            java.lang.Object r10 = r3.A04
            X.1Hj r6 = X.1Hj.A02
            int r0 = r3.A00
            r7 = 4
            r11 = 3
            r2 = 2
            r8 = 1
            r4 = 0
            if (r0 == 0) goto L_0x003b
            if (r0 == r8) goto L_0x0059
            if (r0 == r2) goto L_0x018b
            if (r0 == r11) goto L_0x00b8
            if (r0 == r7) goto L_0x018b
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0035:
            X.MED r3 = new X.MED
            r3.<init>(r13, r5, r4)
            goto L_0x0018
        L_0x003b:
            X.0eS.A00(r10)
            X.8cI r0 = X.C359218cI.A0M
            X.8cI r9 = X.C359228cJ.A00(r14)
            java.lang.String r0 = r15.A01
            X.0qQ.A07(r0)
            r3.A01 = r13
            r3.A02 = r15
            r3.A03 = r9
            r3.A00 = r8
            java.lang.Object r10 = A04(r13, r9, r0, r3)
            if (r10 == r6) goto L_0x0087
            r5 = r13
            goto L_0x0068
        L_0x0059:
            java.lang.Object r9 = r3.A03
            X.8cI r9 = (X.C359218cI) r9
            java.lang.Object r15 = r3.A02
            X.8Yi r15 = (X.AnonymousClass8Yi) r15
            java.lang.Object r5 = r3.A01
            com.instagram.ar.core.effectcollection.EffectCollectionService r5 = (com.instagram.ar.core.effectcollection.EffectCollectionService) r5
            X.0eS.A00(r10)
        L_0x0068:
            com.instagram.camera.effect.models.CameraAREffect r10 = (com.instagram.camera.effect.models.CameraAREffect) r10
            if (r10 == 0) goto L_0x018e
            X.3Ym r0 = r15.A00
            r10.EjB(r0)
            boolean r1 = r10.CbC()
            com.instagram.ar.core.effectcollection.persistence.RoomEffectCollectionRepository r0 = r5.A04
            if (r1 == 0) goto L_0x0088
            r3.A01 = r4
            r3.A02 = r4
            r3.A03 = r4
            r3.A00 = r2
            java.lang.Object r0 = r0.A00(r9, r10, r3)
        L_0x0085:
            if (r0 != r6) goto L_0x018e
        L_0x0087:
            return r6
        L_0x0088:
            r3.A01 = r5
            r3.A02 = r10
            r3.A03 = r4
            r3.A00 = r11
            X.6dc r12 = r0.A00
            r0 = -1
            r2 = 0
            X.7ud r2 = X.C346187uk.A01(r9, r4, r0, r2)
            java.lang.String r11 = r2.A01
            java.lang.String r9 = r10.A0K
            X.0qQ.A07(r9)
            X.7z7 r2 = new X.7z7
            r2.<init>(r11, r9, r0)
            X.3oI r1 = r12.A07
            X.As1 r0 = new X.As1
            r0.<init>(r2, r12)
            java.lang.Object r0 = X.1wR.A01(r1, r0, r3)
            if (r0 == r6) goto L_0x00b4
            X.0gF r0 = X.C60340gF.A00
        L_0x00b4:
            if (r0 == r6) goto L_0x0087
            r9 = r10
            goto L_0x00c3
        L_0x00b8:
            java.lang.Object r9 = r3.A02
            com.instagram.camera.effect.models.CameraAREffect r9 = (com.instagram.camera.effect.models.CameraAREffect) r9
            java.lang.Object r5 = r3.A01
            com.instagram.ar.core.effectcollection.EffectCollectionService r5 = (com.instagram.ar.core.effectcollection.EffectCollectionService) r5
            X.0eS.A00(r10)
        L_0x00c3:
            X.0qQ.A0B(r9, r8)
            r3.A01 = r4
            r3.A02 = r4
            r3.A00 = r7
            r1 = 43
            boolean r0 = X.C66144MDw.A02(r1, r3)
            if (r0 == 0) goto L_0x00dc
            java.lang.String r1 = "i3"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x00dc:
            X.MDw r10 = new X.MDw
            r10.<init>(r5, r3, r1)
            java.lang.Object r1 = r10.A02
            int r0 = r10.A00
            if (r0 == 0) goto L_0x0108
            if (r0 != r8) goto L_0x017b
            java.lang.Object r7 = r10.A01
            X.L3I r7 = (X.L3I) r7
            X.0eS.A00(r1)
        L_0x00f0:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            X.02m r3 = r7.A01
            int r2 = r7.A00
            r1 = 3
            if (r0 == 0) goto L_0x00fe
            r1 = 2
        L_0x00fe:
            r0 = 17642986(0x10d35ea, float:2.593629E-38)
            r3.markerEnd(r0, r2, r1)
            X.0gF r0 = X.C60340gF.A00
            goto L_0x0085
        L_0x0108:
            X.0eS.A00(r1)
            X.L3I r7 = new X.L3I
            r7.<init>()
            X.02m r4 = r7.A01
            int r3 = r7.A00
            r2 = 17642986(0x10d35ea, float:2.593629E-38)
            r4.markerStart(r2, r3)
            java.lang.String r1 = "save_status_update"
            java.lang.String r0 = "effect_update_type"
            r4.markerAnnotate(r2, r3, r0, r1)
            com.instagram.ar.core.effectcollection.persistence.RoomEffectCollectionRepository r2 = r5.A04
            r10.A01 = r7
            r10.A00 = r8
            r1 = 14
            boolean r0 = X.ME4.A03(r1, r10)
            if (r0 == 0) goto L_0x0137
            java.lang.String r1 = "i2"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0137:
            r0 = 42
            X.ME4 r5 = new X.ME4
            r5.<init>(r2, r10, r1, r0)
            java.lang.Object r1 = r5.A01
            int r0 = r5.A00
            r4 = 1
            if (r0 == 0) goto L_0x015a
            if (r0 != r8) goto L_0x0183
            X.0eS.A00(r1)
        L_0x014a:
            java.lang.Number r1 = (java.lang.Number) r1
            int r0 = r1.intValue()
            if (r0 > 0) goto L_0x0153
            r4 = 0
        L_0x0153:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            if (r1 != r6) goto L_0x00f0
            return r6
        L_0x015a:
            X.0eS.A00(r1)
            X.6dc r3 = r2.A00
            java.lang.String r1 = r9.A0K
            X.0qQ.A07(r1)
            int r0 = r9.A01
            X.A4v r2 = new X.A4v
            r2.<init>(r1, r0)
            r5.A00 = r8
            X.3oI r1 = r3.A07
            X.As2 r0 = new X.As2
            r0.<init>(r3, r2)
            java.lang.Object r1 = X.1wR.A01(r1, r0, r5)
            if (r1 != r6) goto L_0x014a
            return r6
        L_0x017b:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0183:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x018b:
            X.0eS.A00(r10)
        L_0x018e:
            X.0gF r0 = X.C60340gF.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.effectcollection.EffectCollectionService.A0C(X.84A, X.8Yi, X.4D7):java.lang.Object");
    }

    public final Object A0D(String str, AnonymousClass4D7 r5) {
        C311976dc r2 = this.A04.A00;
        Object A012 = 1wR.A01(r2.A07, new C41322As4(r2, str), r5);
        1Hj r0 = 1Hj.A02;
        if (A012 != r0) {
            A012 = C60340gF.A00;
        }
        if (A012 != r0) {
            return C60340gF.A00;
        }
        return A012;
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [X.9JX, X.4D7] */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0E(java.util.List r10, X.AnonymousClass4D7 r11) {
        /*
            r9 = this;
            r3 = 8
            boolean r0 = X.AnonymousClass9JX.A00(r3, r11)
            if (r0 == 0) goto L_0x0067
            r8 = r11
            X.9JX r8 = (X.AnonymousClass9JX) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0067
            int r2 = r2 - r1
            r8.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r8.A02
            X.1Hj r7 = X.1Hj.A02
            int r0 = r8.A00
            r6 = 1
            if (r0 == 0) goto L_0x003f
            if (r0 != r6) goto L_0x006d
            java.lang.Object r5 = r8.A01
            X.9TR r5 = (X.AnonymousClass9TR) r5
            X.0eS.A00(r1)
        L_0x0028:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            X.02m r3 = r5.A01
            int r2 = r5.A00
            r1 = 3
            if (r0 == 0) goto L_0x0036
            r1 = 2
        L_0x0036:
            r0 = 17633701(0x10d11a5, float:2.591027E-38)
            r3.markerEnd(r0, r2, r1)
            X.0gF r7 = X.C60340gF.A00
            return r7
        L_0x003f:
            X.0eS.A00(r1)
            X.9TR r5 = new X.9TR
            r5.<init>()
            int r4 = r10.size()
            X.02m r3 = r5.A01
            int r2 = r5.A00
            r1 = 17633701(0x10d11a5, float:2.591027E-38)
            r3.markerStart(r1, r2)
            java.lang.String r0 = "effects_count"
            r3.markerAnnotate(r1, r2, r0, r4)
            com.instagram.ar.core.effectcollection.persistence.RoomEffectCollectionRepository r0 = r9.A04
            r8.A01 = r5
            r8.A00 = r6
            java.lang.Object r1 = r0.A04(r10, r8)
            if (r1 != r7) goto L_0x0028
            return r7
        L_0x0067:
            X.9JX r8 = new X.9JX
            r8.<init>(r9, r11, r3)
            goto L_0x0016
        L_0x006d:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.effectcollection.EffectCollectionService.A0E(java.util.List, X.4D7):java.lang.Object");
    }

    public final AnonymousClass0r6 A0F(C349177zi r6) {
        Object A062;
        if (r6.A04) {
            A062 = new AnonymousClass05E(new MHH((Object) new AnonymousClass05E(new AnonymousClass9KF((Object) r6, (AnonymousClass4D7) null, (Object) this, 12)), (Object) new AnonymousClass9KB(this, r6, (AnonymousClass4D7) null, 0), (AnonymousClass4D7) null, 16));
        } else {
            A062 = A06(r6, this);
        }
        UserSession userSession = this.A05;
        C61410nE r1 = this.A06;
        0qQ.A0B(r1, 1);
        return AnonymousClass11E.A01(new AnonymousClass05E(new MHH(A062, (Object) new C349187zj(userSession, r1), (AnonymousClass4D7) null, 17)));
    }

    public final C349207zl A07(C349177zi r5) {
        return C349197zk.A00(new C376879Jr(8, (AnonymousClass4D7) null), A0F(r5));
    }
}
