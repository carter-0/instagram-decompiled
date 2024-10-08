package com.instagram.immersivecatchup.repository;

import X.00k;
import X.0qQ;
import X.AnonymousClass43D;
import X.C239793Ih;
import X.C252733pa;
import X.C41845B3m;
import X.C55511Hit;
import X.C55731HmS;
import com.instagram.common.session.UserSession;
import com.instagram.reels.store.ReelStore;
import java.util.List;

public final class ImmersiveCatchUpRepository extends C252733pa {
    public final C55731HmS A00;
    public final UserSession A01;
    public final C55511Hit A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImmersiveCatchUpRepository(UserSession userSession, C55731HmS hmS, C55511Hit hit) {
        super("ImmersiveCatchUpRepository", AnonymousClass43D.A01(557672991, 3));
        0qQ.A0B(userSession, 3);
        this.A00 = hmS;
        this.A02 = hit;
        this.A01 = userSession;
    }

    public final C239793Ih A00() {
        C55731HmS hmS = this.A00;
        List list = hmS.A02;
        if (list == null) {
            list = 00k.A0d(ReelStore.A03(this.A02.A00).A0U(false), 5);
            0qQ.A0B(list, 0);
            hmS.A02 = list;
        }
        return C41845B3m.A0d(list);
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDx, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.C55562Hji r7, X.AnonymousClass4D7 r8) {
        /*
            r6 = this;
            r3 = 44
            boolean r0 = X.C66145MDx.A02(r3, r8)
            if (r0 == 0) goto L_0x0069
            r5 = r8
            X.MDx r5 = (X.C66145MDx) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0069
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r4 = r5.A03
            X.1Hj r3 = X.1Hj.A02
            int r0 = r5.A00
            r2 = 1
            if (r0 == 0) goto L_0x0055
            if (r0 != r2) goto L_0x0091
            java.lang.Object r1 = r5.A02
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r7 = r5.A01
            X.Hji r7 = (X.C55562Hji) r7
            X.0eS.A00(r4)
        L_0x002c:
            X.3Ii r4 = (X.C239803Ii) r4
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x006f
            X.3Ih r4 = (X.C239793Ih) r4
            java.lang.Object r0 = r4.A00
            X.5u7 r0 = (X.C298835u7) r0
            java.util.List r0 = r0.Ao4()
            r1.addAll(r0)
            boolean r0 = X.AnonymousClass7TE.A1b(r1)
            if (r0 == 0) goto L_0x007d
            X.2is r0 = r7.A00
            X.GD6 r0 = r0.A0C
            if (r0 != 0) goto L_0x0078
            java.lang.String r0 = "viewerAdapter"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0055:
            X.0eS.A00(r4)
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            r5.A01 = r7
            r5.A02 = r1
            r5.A00 = r2
            java.lang.Object r4 = r6.A03(r5)
            if (r4 != r3) goto L_0x002c
            return r3
        L_0x0069:
            X.MDx r5 = new X.MDx
            r5.<init>(r6, r8, r3)
            goto L_0x0016
        L_0x006f:
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0081
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0078:
            X.GBg r0 = r0.A0A
            r0.A0O(r2, r1)
        L_0x007d:
            X.3Ih r4 = X.C51967G9n.A0d()
        L_0x0081:
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x008e
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 != 0) goto L_0x008e
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x008e:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x0091:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.immersivecatchup.repository.ImmersiveCatchUpRepository.A01(X.Hji, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.4D7, X.MDp] */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: type inference failed for: r6v7 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.AnonymousClass4D7 r19) {
        /*
            r18 = this;
            r3 = 35
            r5 = r19
            boolean r0 = X.C66137MDp.A02(r3, r5)
            r4 = r18
            if (r0 == 0) goto L_0x009b
            r6 = r5
            X.MDp r6 = (X.C66137MDp) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x009b
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x001a:
            java.lang.Object r2 = r6.A02
            X.1Hj r3 = X.1Hj.A02
            int r0 = r6.A00
            r1 = 1
            if (r0 == 0) goto L_0x0039
            if (r0 != r1) goto L_0x00a7
            java.lang.Object r0 = r6.A01
            com.instagram.immersivecatchup.repository.ImmersiveCatchUpRepository r0 = (com.instagram.immersivecatchup.repository.ImmersiveCatchUpRepository) r0
            X.0eS.A00(r2)
        L_0x002c:
            X.BxI r2 = (X.C43380BxI) r2
            X.HmS r0 = r0.A00
            r0.A01 = r2
            if (r2 == 0) goto L_0x00a2
            X.3Ih r3 = X.C41845B3m.A0d(r2)
        L_0x0038:
            return r3
        L_0x0039:
            X.0eS.A00(r2)
            X.HmS r0 = r4.A00
            X.BxI r0 = r0.A01
            if (r0 == 0) goto L_0x0047
            X.3Ih r3 = X.C41845B3m.A0d(r0)
            return r3
        L_0x0047:
            X.Hit r5 = r4.A02
            r6.A01 = r4
            r6.A00 = r1
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.C241503Pl.A01
            X.4D7 r0 = X.1Ey.A02(r6)
            X.3Pl r2 = new X.3Pl
            r2.<init>(r0)
            r0 = 11
            X.H50 r1 = new X.H50
            r1.<init>(r2, r0)
            com.instagram.common.session.UserSession r5 = r5.A00
            r12 = 0
            r13 = 0
            X.2IS r6 = X.C41845B3m.A04()
            X.2IS r0 = X.C41845B3m.A04()
            X.1vR r7 = X.C41845B3m.A05()
            java.util.Map r9 = r6.getParamsCopy()
            java.util.Map r10 = r0.getParamsCopy()
            java.lang.Class<X.BxI> r11 = X.C43380BxI.class
            java.util.ArrayList r17 = X.AnonymousClass7TE.A1C()
            java.lang.String r8 = "IGDCatchUpQuery"
            r0 = 1443(0x5a3, float:2.022E-42)
            java.lang.String r16 = X.AnonymousClass000.A00(r0)
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.1vn r0 = X.1vm.A01(r5)
            r0.A06(r6, r1)
            java.lang.Object r2 = r2.A00()
            if (r2 == r3) goto L_0x0038
            r0 = r4
            goto L_0x002c
        L_0x009b:
            X.MDp r6 = new X.MDp
            r6.<init>(r4, r5, r3)
            goto L_0x001a
        L_0x00a2:
            X.5sO r3 = X.DbU.A0f()
            return r3
        L_0x00a7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.immersivecatchup.repository.ImmersiveCatchUpRepository.A02(X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.4D7, X.MDp] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(X.AnonymousClass4D7 r11) {
        /*
            r10 = this;
            r3 = 36
            boolean r0 = X.C66137MDp.A02(r3, r11)
            if (r0 == 0) goto L_0x010d
            r4 = r11
            X.MDp r4 = (X.C66137MDp) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x010d
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A02
            X.1Hj r5 = X.1Hj.A02
            int r0 = r4.A00
            r6 = 2
            r8 = 1
            if (r0 == 0) goto L_0x0044
            if (r0 == r8) goto L_0x0053
            if (r0 != r6) goto L_0x011d
            java.lang.Object r3 = r4.A01
            com.instagram.immersivecatchup.repository.ImmersiveCatchUpRepository r3 = (com.instagram.immersivecatchup.repository.ImmersiveCatchUpRepository) r3
            X.0eS.A00(r1)
        L_0x002b:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0114
            X.HmS r2 = r3.A00
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r1 = r1.A00
            X.5u7 r1 = (X.C298835u7) r1
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r2.A00 = r1
            X.3Ih r5 = X.C41845B3m.A0d(r1)
        L_0x0043:
            return r5
        L_0x0044:
            X.0eS.A00(r1)
            r4.A01 = r10
            r4.A00 = r8
            java.lang.Object r1 = r10.A02(r4)
            if (r1 == r5) goto L_0x0043
            r3 = r10
            goto L_0x005a
        L_0x0053:
            java.lang.Object r3 = r4.A01
            com.instagram.immersivecatchup.repository.ImmersiveCatchUpRepository r3 = (com.instagram.immersivecatchup.repository.ImmersiveCatchUpRepository) r3
            X.0eS.A00(r1)
        L_0x005a:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0122
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r7 = r1.A00
            X.3lr r7 = (X.C250663lr) r7
            X.HmS r0 = r3.A00
            X.5u7 r0 = r0.A00
            if (r0 == 0) goto L_0x0071
            X.3Ih r5 = X.C41845B3m.A0d(r0)
            return r5
        L_0x0071:
            if (r7 == 0) goto L_0x00d8
            java.lang.Class<X.BxH> r2 = X.C43379BxH.class
            r0 = 1443(0x5a3, float:2.022E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = -41400937(0xfffffffffd884597, float:-2.2642042E37)
            X.3lr r7 = r7.A03(r2, r1, r0)
            if (r7 == 0) goto L_0x00d8
            java.lang.Class<X.BxG> r2 = X.C43378BxG.class
            java.lang.String r1 = "data"
            r0 = -1021914952(0xffffffffc316d0b8, float:-150.8153)
            com.google.common.collect.ImmutableList r0 = r7.A06(r2, r1, r0)
            if (r0 == 0) goto L_0x00d8
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r7 = r0.iterator()
        L_0x0099:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00b8
            java.lang.Object r2 = r7.next()
            r1 = r2
            X.3lr r1 = (X.C250663lr) r1
            java.lang.String r0 = "item_type"
            java.lang.String r1 = r1.getOptionalStringField(r6, r0)
            java.lang.String r0 = "clip"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0099
            r9.add(r2)
            goto L_0x0099
        L_0x00b8:
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r9.iterator()
        L_0x00c0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00d9
            java.lang.Object r1 = r2.next()
            X.3lr r1 = (X.C250663lr) r1
            java.lang.String r0 = "media_id"
            java.lang.String r0 = r1.getOptionalStringField(r8, r0)
            if (r0 == 0) goto L_0x00c0
            r7.add(r0)
            goto L_0x00c0
        L_0x00d8:
            r7 = 0
        L_0x00d9:
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>()
            if (r7 == 0) goto L_0x00f2
            java.util.Iterator r1 = r7.iterator()
        L_0x00e4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00f2
            java.lang.Object r0 = r1.next()
            r2.put(r0)
            goto L_0x00e4
        L_0x00f2:
            java.lang.String r2 = X.DbT.A10(r2)
            X.Hit r0 = r3.A02
            r4.A01 = r3
            r4.A00 = r6
            com.instagram.common.session.UserSession r1 = r0.A00
            r0 = 0
            X.1OC r1 = X.AnonymousClass93V.A03(r0, r1, r2)
            r0 = 557672991(0x213d6a1f, float:6.417614E-19)
            java.lang.Object r1 = r1.A00(r0, r4)
            if (r1 != r5) goto L_0x002b
            return r5
        L_0x010d:
            X.MDp r4 = new X.MDp
            r4.<init>(r10, r11, r3)
            goto L_0x0016
        L_0x0114:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x012b
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x011d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0122:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x012b
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x012b:
            X.5sO r5 = X.DbU.A0f()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.immersivecatchup.repository.ImmersiveCatchUpRepository.A03(X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.4D7, X.MDp] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0081 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(X.AnonymousClass4D7 r7) {
        /*
            r6 = this;
            r3 = 37
            boolean r0 = X.C66137MDp.A02(r3, r7)
            if (r0 == 0) goto L_0x0061
            r5 = r7
            X.MDp r5 = (X.C66137MDp) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0061
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r4 = r5.A02
            X.1Hj r2 = X.1Hj.A02
            int r1 = r5.A00
            r0 = 1
            if (r1 == 0) goto L_0x004f
            if (r1 != r0) goto L_0x0082
            java.lang.Object r3 = r5.A01
            java.util.List r3 = (java.util.List) r3
            X.0eS.A00(r4)
        L_0x0028:
            X.3Ii r4 = (X.C239803Ii) r4
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0067
            X.3Ih r4 = (X.C239793Ih) r4
            java.lang.Object r0 = r4.A00
            X.5u7 r0 = (X.C298835u7) r0
            java.util.List r0 = r0.Ao4()
            java.util.Iterator r2 = r0.iterator()
        L_0x003c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0070
            X.4bN r1 = X.C51966G9m.A0m(r2)
            X.GpZ r0 = new X.GpZ
            r0.<init>(r1)
            r3.add(r0)
            goto L_0x003c
        L_0x004f:
            X.0eS.A00(r4)
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            r5.A01 = r3
            r5.A00 = r0
            java.lang.Object r4 = r6.A03(r5)
            if (r4 != r2) goto L_0x0028
            return r2
        L_0x0061:
            X.MDp r5 = new X.MDp
            r5.<init>(r6, r7, r3)
            goto L_0x0016
        L_0x0067:
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0074
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0070:
            X.3Ih r4 = X.C51967G9n.A0d()
        L_0x0074:
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0081
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0081
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0081:
            return r3
        L_0x0082:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.immersivecatchup.repository.ImmersiveCatchUpRepository.A04(X.4D7):java.lang.Object");
    }
}
