package X;

import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7cz  reason: invalid class name and case insensitive filesystem */
public final class C335457cz {
    public static final C335457cz A00 = new Object();

    public static final Integer A00(C333777a7 r1, boolean z, boolean z2) {
        if (z2) {
            return AnonymousClass05K.A0N;
        }
        if (!z) {
            return AnonymousClass05K.A0C;
        }
        if (r1 == null) {
            return AnonymousClass05K.A00;
        }
        if (r1.A0T) {
            return AnonymousClass05K.A01;
        }
        int ordinal = r1.A05.ordinal();
        if (ordinal == 0) {
            return AnonymousClass05K.A0Y;
        }
        if (ordinal != 1) {
            return AnonymousClass05K.A0u;
        }
        return AnonymousClass05K.A0j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A01(com.instagram.user.model.User r5, java.lang.String r6, java.util.List r7, boolean r8, boolean r9) {
        /*
            boolean r0 = r7 instanceof java.util.Collection
            r4 = 0
            if (r0 == 0) goto L_0x000d
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x000d
        L_0x000b:
            r4 = 1
        L_0x000c:
            return r4
        L_0x000d:
            java.util.Iterator r3 = r7.iterator()
        L_0x0011:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x000b
            java.lang.Object r2 = r3.next()
            X.7dj r2 = (X.C335907dj) r2
            java.lang.Integer r1 = r2.A0H
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x000c
            com.instagram.user.model.User r0 = r2.A0C
            boolean r0 = X.0qQ.A0K(r5, r0)
            if (r0 != 0) goto L_0x002f
            if (r8 != 0) goto L_0x002f
            if (r9 == 0) goto L_0x000c
        L_0x002f:
            java.lang.String r0 = r2.A0K
            boolean r0 = X.0qQ.A0K(r0, r6)
            if (r0 != 0) goto L_0x000c
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C335457cz.A01(com.instagram.user.model.User, java.lang.String, java.util.List, boolean, boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0206, code lost:
        if (r12 == false) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002d, code lost:
        if (r4.A0d != true) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0193, code lost:
        if (X.182.A06(r9, r3, 36323032344177408L) == false) goto L_0x0195;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01b8, code lost:
        if (X.182.A06(r9, r3, 36323032344177408L) == false) goto L_0x01ba;
     */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0200  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList A02(X.C335907dj r36, X.C333777a7 r37, X.C333717a0 r38, com.instagram.common.session.UserSession r39, com.instagram.user.model.User r40, boolean r41, boolean r42, boolean r43, boolean r44, boolean r45, boolean r46) {
        /*
            r35 = this;
            r21 = 0
            r5 = r36
            r0 = r21
            X.0qQ.A0B(r5, r0)
            r0 = 8
            r10 = r38
            X.0qQ.A0B(r10, r0)
            r9 = 10
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.instagram.user.model.User r6 = r5.A0C
            r34 = r40
            r0 = r34
            boolean r12 = r0.equals(r6)
            r20 = 1
            r4 = r37
            if (r37 == 0) goto L_0x002f
            boolean r1 = r4.A0d
            r19 = 1
            r0 = r20
            if (r1 == r0) goto L_0x0031
        L_0x002f:
            r19 = 0
        L_0x0031:
            r18 = 0
            if (r37 == 0) goto L_0x02bc
            com.instagram.model.mediatype.ProductType r15 = r4.A07
        L_0x0037:
            r3 = r39
            if (r19 == 0) goto L_0x021b
            X.7dd r0 = r5.A07
            X.7fs r8 = r5.A03
            X.571 r1 = r5.A08
            java.lang.String r0 = r0.A04
            r11 = 1
            r7 = 0
            if (r0 == 0) goto L_0x0048
            r7 = 1
        L_0x0048:
            r0 = 0
            if (r8 == 0) goto L_0x004c
            r0 = 1
        L_0x004c:
            if (r1 != 0) goto L_0x004f
            r11 = 0
        L_0x004f:
            if (r7 != 0) goto L_0x0217
            if (r0 != 0) goto L_0x0217
            if (r11 != 0) goto L_0x0217
            java.lang.Integer r7 = X.AnonymousClass05K.A00
        L_0x0057:
            X.GpS r0 = new X.GpS
            r0.<init>((java.lang.Integer) r7)
            r2.add(r0)
            r27 = 1
        L_0x0061:
            r7 = r41
            if (r45 != 0) goto L_0x0087
            if (r41 == 0) goto L_0x0087
            if (r19 != 0) goto L_0x0087
            if (r43 != 0) goto L_0x0087
            if (r44 != 0) goto L_0x0087
            boolean r0 = r5.A0V
            if (r0 != 0) goto L_0x0087
            boolean r0 = r5.A0e
            if (r0 != 0) goto L_0x0087
            boolean r0 = r5.A0R
            if (r0 != 0) goto L_0x0087
            boolean r14 = r5.A0b
            java.lang.String r13 = r5.A0K
            java.lang.String r11 = r5.A0M
            X.GpQ r0 = new X.GpQ
            r0.<init>(r13, r11, r12, r14)
            r2.add(r0)
        L_0x0087:
            if (r15 == 0) goto L_0x012b
            if (r8 != 0) goto L_0x008f
            if (r1 != 0) goto L_0x008f
            r27 = 0
        L_0x008f:
            if (r37 == 0) goto L_0x0211
            com.instagram.user.model.User r11 = r4.A0A
            X.3QO r1 = r4.A04
            com.instagram.model.mediatype.ProductType r0 = r4.A07
        L_0x0097:
            r23 = r1
            r24 = r0
            r25 = r11
            r26 = r12
            r22 = r3
            boolean r0 = X.C393849x6.A00(r22, r23, r24, r25, r26, r27)
            if (r0 == 0) goto L_0x012b
            X.GpS r0 = new X.GpS
            r0.<init>((com.instagram.model.mediatype.ProductType) r15)
            r2.add(r0)
            java.lang.String r15 = r5.A0M
            java.lang.String r14 = r5.A0L
            java.lang.String r13 = r5.A0K
            X.0wc r11 = r10.A01
            java.lang.String r1 = "instagram_comment_action_menu_impression"
            X.0kJ r0 = r11.A00
            X.0Aj r1 = r11.A00(r0, r1)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x012b
            java.util.concurrent.atomic.AtomicBoolean r0 = X.1Xj.A0i
            java.lang.String r11 = X.1Xv.A06(r15)
            int r0 = r11.length()
            if (r0 != 0) goto L_0x00d3
            java.lang.String r11 = "0"
        L_0x00d3:
            long r15 = java.lang.Long.parseLong(r11)
            java.lang.Long r11 = java.lang.Long.valueOf(r15)
            java.lang.String r0 = "media_id"
            r1.A9F(r0, r11)
            if (r14 == 0) goto L_0x020d
            java.lang.Long r0 = X.00y.A0n(r9, r14)
            if (r0 == 0) goto L_0x020d
            long r14 = r0.longValue()
        L_0x00ec:
            java.lang.Long r11 = java.lang.Long.valueOf(r14)
            r0 = 165(0xa5, float:2.31E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r1.A9F(r0, r11)
            X.4DU r0 = r10.A03
            java.lang.String r10 = r0.getModuleName()
            java.lang.String r0 = "containermodule"
            r1.AAJ(r0, r10)
            java.lang.Long r9 = X.00y.A0n(r9, r13)
            java.lang.String r0 = "comment_id"
            r1.A9F(r0, r9)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r20)
            r0 = 3974(0xf86, float:5.569E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.A7p(r0, r9)
            java.lang.String r9 = "long_press"
            java.lang.String r0 = "action"
            r1.AAJ(r0, r9)
            java.lang.String r9 = X.AnonymousClass1K6.A00
            java.lang.String r0 = "canonical_nav_chain"
            r1.AAJ(r0, r9)
            r1.Cgf()
        L_0x012b:
            if (r8 == 0) goto L_0x0209
            java.lang.String r10 = r8.A04
        L_0x012f:
            r8 = r46
            if (r19 != 0) goto L_0x0206
            if (r10 == 0) goto L_0x014a
            X.0Tu r9 = X.0Tu.A05
            r0 = 36323032344177408(0x810b9b000a2b00, double:3.034170143344754E-306)
            boolean r0 = X.182.A06(r9, r3, r0)
            if (r0 == 0) goto L_0x014a
            X.GpP r0 = new X.GpP
            r0.<init>(r10)
            r2.add(r0)
        L_0x014a:
            if (r41 != 0) goto L_0x0173
            X.2f1 r0 = X.AnonymousClass2f1.A00(r3)
            boolean r0 = r0.A0Q(r6)
            if (r0 == 0) goto L_0x0173
            X.0Tu r9 = X.0Tu.A05
            r0 = 36319042319031162(0x8107fa00021b7a, double:3.031646835375726E-306)
            boolean r0 = X.182.A06(r9, r3, r0)
            if (r0 != 0) goto L_0x016e
            r0 = 36323032344177408(0x810b9b000a2b00, double:3.034170143344754E-306)
            boolean r0 = X.182.A06(r9, r3, r0)
            if (r0 == 0) goto L_0x0173
        L_0x016e:
            X.IN2 r0 = X.IN2.A00
            r2.add(r0)
        L_0x0173:
            if (r12 != 0) goto L_0x01cb
            boolean r0 = X.AGf.A00(r3, r6)
            if (r0 == 0) goto L_0x019a
            if (r41 != 0) goto L_0x0195
            X.0Tu r9 = X.0Tu.A05
            r0 = 36319042319031162(0x8107fa00021b7a, double:3.031646835375726E-306)
            boolean r0 = X.182.A06(r9, r3, r0)
            if (r0 != 0) goto L_0x019a
            r0 = 36323032344177408(0x810b9b000a2b00, double:3.034170143344754E-306)
            boolean r0 = X.182.A06(r9, r3, r0)
            if (r0 != 0) goto L_0x019a
        L_0x0195:
            X.IN0 r0 = X.IN0.A00
            r2.add(r0)
        L_0x019a:
            boolean r0 = X.AGf.A01(r3, r6)
            if (r0 == 0) goto L_0x01bf
            if (r41 != 0) goto L_0x01ba
            X.0Tu r9 = X.0Tu.A05
            r0 = 36319042319031162(0x8107fa00021b7a, double:3.031646835375726E-306)
            boolean r0 = X.182.A06(r9, r3, r0)
            if (r0 != 0) goto L_0x01bf
            r0 = 36323032344177408(0x810b9b000a2b00, double:3.034170143344754E-306)
            boolean r0 = X.182.A06(r9, r3, r0)
            if (r0 != 0) goto L_0x01bf
        L_0x01ba:
            X.IN3 r0 = X.IN3.A00
            r2.add(r0)
        L_0x01bf:
            r9 = r46 ^ 1
            X.GpR r1 = new X.GpR
            r0 = r20
            r1.<init>(r9, r0)
            r2.add(r1)
        L_0x01cb:
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r0 = r0.A01(r3)
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x01e7
            boolean r0 = r6.CPV()
            if (r0 != 0) goto L_0x01e7
            X.GpR r1 = new X.GpR
            r0 = r21
            r1.<init>(r8, r0)
            r2.add(r1)
        L_0x01e7:
            java.util.List r3 = java.util.Collections.singletonList(r5)
            X.0qQ.A07(r3)
            if (r37 == 0) goto L_0x01f4
            java.lang.String r0 = r4.A0G
            r18 = r0
        L_0x01f4:
            r4 = r42
            r1 = r34
            r0 = r18
            boolean r0 = A01(r1, r0, r3, r7, r4)
            if (r0 == 0) goto L_0x0205
            X.IMz r0 = X.C57059IMz.A00
            r2.add(r0)
        L_0x0205:
            return r2
        L_0x0206:
            if (r12 != 0) goto L_0x01cb
            goto L_0x01bf
        L_0x0209:
            r10 = r18
            goto L_0x012f
        L_0x020d:
            r14 = 0
            goto L_0x00ec
        L_0x0211:
            r11 = r18
            r1 = r11
            r0 = r11
            goto L_0x0097
        L_0x0217:
            java.lang.Integer r7 = X.AnonymousClass05K.A01
            goto L_0x0057
        L_0x021b:
            X.I5a r28 = X.I5a.A00
            X.7dd r0 = r5.A07
            X.7fs r8 = r5.A03
            X.571 r1 = r5.A08
            r27 = 1
            r29 = r8
            r30 = r4
            r31 = r0
            r32 = r3
            r33 = r1
            boolean r0 = r28.A02(r29, r30, r31, r32, r33)
            if (r0 == 0) goto L_0x0061
            java.lang.String r16 = r6.getId()
            java.lang.String r0 = r5.A0K
            r22 = r0
            if (r37 == 0) goto L_0x02b9
            java.lang.String r14 = r4.A0K
        L_0x0241:
            X.0wc r11 = r10.A01
            java.lang.String r7 = "instagram_share_comment_to_story_entrypoint_impression"
            X.0kJ r0 = r11.A00
            X.0Aj r11 = r11.A00(r0, r7)
            com.instagram.common.session.UserSession r0 = r10.A02
            java.lang.String r0 = r0.A06
            java.lang.Long r13 = X.00y.A0n(r9, r0)
            boolean r0 = r11.isSampled()
            if (r0 == 0) goto L_0x02b2
            if (r14 == 0) goto L_0x02b2
            long r16 = java.lang.Long.parseLong(r16)
            java.lang.Long r7 = java.lang.Long.valueOf(r16)
            java.lang.String r0 = "target_comment_owner_id"
            r11.A9F(r0, r7)
            long r16 = java.lang.Long.parseLong(r22)
            java.lang.Long r7 = java.lang.Long.valueOf(r16)
            java.lang.String r0 = "target_comment_id"
            r11.A9F(r0, r7)
            long r16 = java.lang.Long.parseLong(r14)
            java.lang.Long r7 = java.lang.Long.valueOf(r16)
            r0 = 1577(0x629, float:2.21E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r11.A9F(r0, r7)
            r0 = 116(0x74, float:1.63E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r11.A9F(r0, r13)
            java.lang.String r7 = "impression"
            java.lang.String r0 = "event"
            r11.AAJ(r0, r7)
            X.EZb r7 = X.EZb.COMMENTS
            java.lang.String r0 = "screen"
            r11.A8M(r7, r0)
            r0 = 2898(0xb52, float:4.061E-42)
            java.lang.String r7 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "entry_point"
            r11.AAJ(r0, r7)
            X.HOa r7 = X.C54669HOa.SHARE_COMMENT_TO_STORY
            java.lang.String r0 = "project"
            r11.A8M(r7, r0)
            r11.Cgf()
        L_0x02b2:
            X.IN1 r0 = X.IN1.A00
            r2.add(r0)
            goto L_0x0061
        L_0x02b9:
            r14 = r18
            goto L_0x0241
        L_0x02bc:
            r15 = r18
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C335457cz.A02(X.7dj, X.7a7, X.7a0, com.instagram.common.session.UserSession, com.instagram.user.model.User, boolean, boolean, boolean, boolean, boolean, boolean):java.util.ArrayList");
    }

    public final boolean A03(UserSession userSession, List list, boolean z) {
        if (!z) {
            return false;
        }
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!2R8.A04(userSession, ((C335907dj) it.next()).A0C)) {
                return true;
            }
        }
        return false;
    }
}
