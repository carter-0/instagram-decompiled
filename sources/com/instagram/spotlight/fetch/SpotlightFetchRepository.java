package com.instagram.spotlight.fetch;

import X.00k;
import X.02z;
import X.05G;
import X.0Tu;
import X.0qQ;
import X.106;
import X.10b;
import X.182;
import X.19B;
import X.1Eo;
import X.1vm;
import X.1vn;
import X.AnonymousClass0Ud;
import X.AnonymousClass43D;
import X.AnonymousClass4A8;
import X.AnonymousClass4D7;
import X.C252733pa;
import X.C262204Co;
import X.C262224Cq;
import X.C52088GEi;
import X.C57996Ijp;
import X.C57997Ijq;
import X.C61063Jw1;
import X.MG5;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class SpotlightFetchRepository extends C252733pa {
    public long A00;
    public C262204Co A01;
    public final UserSession A02;
    public final AnonymousClass4A8 A03;
    public final HashSet A04 = new HashSet();
    public final AnonymousClass0Ud A05;
    public final 1vn A06;
    public final 05G A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SpotlightFetchRepository(UserSession userSession) {
        super("SpotlightFetchRepository", AnonymousClass43D.A01(129243710, 3));
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A03 = new AnonymousClass4A8(userSession);
        this.A06 = 1vm.A01(userSession);
        02z A012 = 106.A01((Object) null);
        this.A07 = A012;
        this.A05 = 10b.A03(A012);
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDr, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v10 */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.spotlight.fetch.SpotlightFetchRepository r22, X.AnonymousClass4D7 r23) {
        /*
            r1 = r22
            r5 = 6
            r6 = r23
            boolean r0 = X.C66139MDr.A01(r5, r6)
            if (r0 == 0) goto L_0x01a2
            r4 = r6
            X.MDr r4 = (X.C66139MDr) r4
            int r3 = r4.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L_0x01a2
            int r3 = r3 - r2
            r4.A00 = r3
        L_0x0019:
            java.lang.Object r5 = r4.A02
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x0162
            if (r0 != r2) goto L_0x01b9
            java.lang.Object r1 = r4.A01
            com.instagram.spotlight.fetch.SpotlightFetchRepository r1 = (com.instagram.spotlight.fetch.SpotlightFetchRepository) r1
            X.0eS.A00(r5)
        L_0x002b:
            X.3Ii r5 = (X.C239803Ii) r5
            boolean r0 = r5 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x01a9
            X.3Ih r5 = (X.C239793Ih) r5
            java.lang.Object r0 = r5.A00
            X.3JC r0 = (X.AnonymousClass3JC) r0
            java.lang.Object r5 = r0.A01
            X.3lr r5 = (X.C250663lr) r5
            if (r5 == 0) goto L_0x0060
            java.lang.Class<X.C5F> r4 = X.C5F.class
            r6 = 0
            r0 = 1938(0x792, float:2.716E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r0)
            r0 = -602966726(0xffffffffdc0f753a, float:-1.61519255E17)
            X.3lr r5 = r5.getRequiredTreeField(r6, r3, r4, r0)
            if (r5 == 0) goto L_0x0060
            java.lang.Class<X.C5E> r4 = X.C5E.class
            r0 = 2917(0xb65, float:4.088E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r0)
            r0 = 157905211(0x969713b, float:2.8099596E-33)
            com.google.common.collect.ImmutableList r5 = r5.getRequiredCompactedTreeListField(r6, r3, r4, r0)
            if (r5 != 0) goto L_0x0062
        L_0x0060:
            X.0sn r5 = X.0sn.A00
        L_0x0062:
            long r3 = java.lang.System.currentTimeMillis()
            r1.A00 = r3
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r7 = 10
            int r0 = X.0Yv.A1E(r5, r7)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r0)
            java.util.Iterator r17 = r5.iterator()
        L_0x0081:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x01b3
            java.lang.Object r13 = r17.next()
            X.3lr r13 = (X.C250663lr) r13
            java.lang.Class<X.C5C> r12 = X.C5C.class
            r0 = 4031(0xfbf, float:5.649E-42)
            java.lang.String r11 = X.AnonymousClass000.A00(r0)
            r4 = 969665650(0x39cbec72, float:3.8895343E-4)
            com.google.common.collect.ImmutableList r0 = r13.getRequiredCompactedTreeListField(r2, r11, r12, r4)
            X.0qQ.A07(r0)
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x015b
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR
            java.lang.Class<com.instagram.user.model.ImmutablePandoUserDict> r3 = com.instagram.user.model.ImmutablePandoUserDict.class
            java.lang.String r0 = "user"
            com.facebook.pando.TreeJNI r3 = r13.getTreeValue(r0, r3)
            com.instagram.user.model.ImmutablePandoUserDict r3 = (com.instagram.user.model.ImmutablePandoUserDict) r3
            X.1cB r0 = new X.1cB
            r0.<init>(r3)
            X.0qQ.A0A(r0)
            com.instagram.user.model.User r10 = new com.instagram.user.model.User
            r10.<init>(r0)
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            com.google.common.collect.ImmutableList r0 = r13.getRequiredCompactedTreeListField(r2, r11, r12, r4)
            X.0qQ.A07(r0)
            java.util.Iterator r16 = r0.iterator()
        L_0x00d0:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x015b
            java.lang.Object r4 = r16.next()
            X.3lr r4 = (X.C250663lr) r4
            X.0qQ.A0A(r4)
            X.1Xv r0 = X.1Xj.A0h
            java.lang.Class<com.instagram.feed.media.ImmutablePandoMediaDict> r3 = com.instagram.feed.media.ImmutablePandoMediaDict.class
            java.lang.String r0 = "ig_media"
            com.facebook.pando.TreeJNI r0 = r4.getTreeValue(r0, r3)
            com.instagram.feed.media.ImmutablePandoMediaDict r0 = (com.instagram.feed.media.ImmutablePandoMediaDict) r0
            X.1q3 r3 = new X.1q3
            r3.<init>(r0)
            X.0qQ.A0A(r3)
            com.instagram.common.session.UserSession r0 = r1.A02
            X.1E5 r0 = X.1E4.A00(r0)
            X.1Xj r11 = new X.1Xj
            r11.<init>(r0, r3)
            java.lang.String r0 = r11.getId()
            if (r0 == 0) goto L_0x00d0
            boolean r3 = r5.contains(r0)
            if (r3 != 0) goto L_0x00d0
            java.lang.String r3 = "creation_time"
            java.lang.String r3 = r4.getOptionalStringField(r2, r3)
            if (r3 == 0) goto L_0x0158
            java.lang.Long r3 = X.00y.A0n(r7, r3)
            if (r3 == 0) goto L_0x0158
            long r22 = r3.longValue()
        L_0x011c:
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r3 = java.lang.System.currentTimeMillis()
            long r14 = r12.toSeconds(r3)
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.HOURS
            r3 = 24
            long r3 = r12.toSeconds(r3)
            long r12 = r22 + r3
            int r3 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r3 < 0) goto L_0x00d0
            r5.add(r0)
            com.instagram.common.typedurl.ImageUrl r19 = r11.A1Q()
            X.GEi r4 = new X.GEi
            r20 = r10
            r21 = r0
            r18 = r4
            r18.<init>((com.instagram.common.typedurl.ImageUrl) r19, (com.instagram.user.model.User) r20, (java.lang.String) r21, (long) r22)
            java.util.HashSet r3 = r1.A04
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L_0x0153
            r9.add(r4)
            goto L_0x00d0
        L_0x0153:
            r8.add(r4)
            goto L_0x00d0
        L_0x0158:
            r22 = 0
            goto L_0x011c
        L_0x015b:
            X.0gF r0 = X.C60340gF.A00
            r6.add(r0)
            goto L_0x0081
        L_0x0162:
            X.0eS.A00(r5)
            r13 = 0
            X.2IS r6 = new X.2IS
            r6.<init>()
            X.2IS r5 = new X.2IS
            r5.<init>()
            X.2IY r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r7 = X.AnonymousClass1vS.A00()
            java.util.Map r9 = r6.getParamsCopy()
            java.util.Map r10 = r5.getParamsCopy()
            java.lang.Class<X.C5G> r11 = X.C5G.class
            java.util.ArrayList r17 = new java.util.ArrayList
            r17.<init>()
            java.lang.String r8 = "SpotlightFetchPostsQuery"
            r12 = 0
            r0 = 1938(0x792, float:2.716E-42)
            java.lang.String r16 = X.AnonymousClass000.A00(r0)
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.1vn r0 = r1.A06
            r4.A01 = r1
            r4.A00 = r2
            java.lang.Object r5 = r0.A04(r6, r4)
            if (r5 != r3) goto L_0x002b
            return r3
        L_0x01a2:
            X.MDr r4 = new X.MDr
            r4.<init>(r1, r6, r5)
            goto L_0x0019
        L_0x01a9:
            boolean r0 = r5 instanceof X.C297815sO
            if (r0 != 0) goto L_0x01b6
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x01b3:
            A01(r1, r9, r8)
        L_0x01b6:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x01b9:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.spotlight.fetch.SpotlightFetchRepository.A00(com.instagram.spotlight.fetch.SpotlightFetchRepository, X.4D7):java.lang.Object");
    }

    public static final void A01(SpotlightFetchRepository spotlightFetchRepository, List list, List list2) {
        ArrayList A0S = 00k.A0S(00k.A0g(list, new C57996Ijp()), 00k.A0g(list2, new C57997Ijq()));
        ArrayList arrayList = new ArrayList();
        Iterator it = A0S.iterator();
        while (it.hasNext()) {
            Object obj = ((C52088GEi) it.next()).A02;
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        spotlightFetchRepository.A07.Epw(new C61063Jw1(00k.A0d(arrayList, 3), (List) A0S, A0S.size()));
    }

    public final void A02(boolean z) {
        UserSession userSession = this.A03.A00;
        if (182.A06(0Tu.A06, userSession, 36316074496495521L) && 182.A06(0Tu.A05, userSession, 36325239956779784L)) {
            C262204Co r0 = this.A01;
            if (r0 == null || !r0.isActive()) {
                boolean z2 = false;
                if (this.A00 + TimeUnit.SECONDS.toMillis(120) >= System.currentTimeMillis()) {
                    z2 = true;
                }
                if (z || !z2) {
                    C262224Cq r3 = this.A01;
                    this.A01 = 1Eo.A04(19B.A00, new MG5(this, (AnonymousClass4D7) null, 20), r3);
                }
            }
        }
    }
}
