package com.instagram.wonderwall.repository;

import X.0qQ;
import X.0sP;
import X.AnonymousClass7TE;
import X.JQP;
import com.instagram.wonderwall.api.WallApiGraphQLImpl;
import com.instagram.wonderwall.model.WallGifPostItem;
import com.instagram.wonderwall.model.WallMediaPostItem;
import com.instagram.wonderwall.model.WallMusicPostItem;
import com.instagram.wonderwall.model.WallPostInfo;
import com.instagram.wonderwall.model.WallPostItem;
import com.instagram.wonderwall.model.WallRepostItem;
import com.instagram.wonderwall.model.WallTextPostItem;

public final class WallPostRepository {
    public final WallPendingPostManager A00;
    public final JQP A01;
    public final WallApiGraphQLImpl A02;

    public WallPostRepository(WallApiGraphQLImpl wallApiGraphQLImpl, WallPendingPostManager wallPendingPostManager, JQP jqp) {
        0qQ.A0B(wallPendingPostManager, 3);
        this.A02 = wallApiGraphQLImpl;
        this.A01 = jqp;
        this.A00 = wallPendingPostManager;
    }

    public static final WallPostItem A00(WallPostItem wallPostItem, 0sP r4) {
        WallPostItem wallRepostItem;
        if (wallPostItem instanceof WallTextPostItem) {
            wallRepostItem = new WallTextPostItem((WallPostInfo) r4.invoke(((WallTextPostItem) wallPostItem).A00));
        } else if (wallPostItem instanceof WallMediaPostItem) {
            WallMediaPostItem wallMediaPostItem = (WallMediaPostItem) wallPostItem;
            wallRepostItem = new WallMediaPostItem(wallMediaPostItem.A01, (WallPostInfo) r4.invoke(wallMediaPostItem.A02));
        } else if (wallPostItem instanceof WallMusicPostItem) {
            WallMusicPostItem wallMusicPostItem = (WallMusicPostItem) wallPostItem;
            wallRepostItem = new WallMusicPostItem(wallMusicPostItem.A00, (WallPostInfo) r4.invoke(wallMusicPostItem.A01), wallMusicPostItem.A02);
        } else if (wallPostItem instanceof WallGifPostItem) {
            WallGifPostItem wallGifPostItem = (WallGifPostItem) wallPostItem;
            String str = wallGifPostItem.A02;
            wallRepostItem = new WallGifPostItem(wallGifPostItem.A00, (WallPostInfo) r4.invoke(wallGifPostItem.A01), str);
        } else if (wallPostItem instanceof WallRepostItem) {
            WallRepostItem wallRepostItem2 = (WallRepostItem) wallPostItem;
            wallRepostItem = new WallRepostItem((WallPostInfo) r4.invoke(wallRepostItem2.A00), wallRepostItem2.A01);
        } else {
            throw AnonymousClass7TE.A1K();
        }
        return wallRepostItem;
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.Ikt, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.C61046Jvk r11, com.instagram.wonderwall.model.WallPostItem r12, X.AnonymousClass4D7 r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof X.C58061Ikt
            if (r0 == 0) goto L_0x0076
            r7 = r13
            X.Ikt r7 = (X.C58061Ikt) r7
            int r2 = r7.A01
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0076
            int r2 = r2 - r1
            r7.A01 = r2
        L_0x0012:
            java.lang.Object r0 = r7.A05
            X.1Hj r8 = X.1Hj.A02
            int r1 = r7.A01
            r6 = 1
            if (r1 == 0) goto L_0x0043
            if (r1 != r6) goto L_0x007c
            boolean r5 = r7.A04
            int r4 = r7.A00
            java.lang.Object r12 = r7.A03
            com.instagram.wonderwall.model.WallPostItem r12 = (com.instagram.wonderwall.model.WallPostItem) r12
            java.lang.Object r1 = r7.A02
            com.instagram.wonderwall.repository.WallPostRepository r1 = (com.instagram.wonderwall.repository.WallPostRepository) r1
            X.0eS.A00(r0)
        L_0x002c:
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 != 0) goto L_0x0040
            X.JQP r1 = r1.A01
            X.IwY r0 = new X.IwY
            r0.<init>(r5, r4)
            com.instagram.wonderwall.model.WallPostItem r0 = A00(r12, r0)
            r1.E01(r0)
        L_0x0040:
            X.0gF r8 = X.C60340gF.A00
        L_0x0042:
            return r8
        L_0x0043:
            X.0eS.A00(r0)
            com.instagram.wonderwall.model.WallPostInfo r9 = r12.BeB()
            int r4 = r9.A01
            boolean r5 = r9.A0A
            boolean r3 = r11.A01
            X.JQP r2 = r10.A01
            r1 = 26
            X.GL4 r0 = new X.GL4
            r0.<init>(r3, r1)
            com.instagram.wonderwall.model.WallPostItem r0 = A00(r12, r0)
            r2.E01(r0)
            com.instagram.wonderwall.api.WallApiGraphQLImpl r1 = r10.A02
            java.lang.String r0 = r9.A06
            r7.A02 = r10
            r7.A03 = r12
            r7.A00 = r4
            r7.A04 = r5
            r7.A01 = r6
            java.lang.Object r0 = r1.A01(r11, r0, r7)
            if (r0 == r8) goto L_0x0042
            r1 = r10
            goto L_0x002c
        L_0x0076:
            X.Ikt r7 = new X.Ikt
            r7.<init>(r10, r13)
            goto L_0x0012
        L_0x007c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wonderwall.repository.WallPostRepository.A01(X.Jvk, com.instagram.wonderwall.model.WallPostItem, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MDj, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(com.instagram.wonderwall.model.WallPostItem r8, X.AnonymousClass4D7 r9) {
        /*
            r7 = this;
            r3 = 15
            boolean r0 = X.C66131MDj.A01(r3, r9)
            if (r0 == 0) goto L_0x007f
            r6 = r9
            X.MDj r6 = (X.C66131MDj) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x007f
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r6.A03
            X.1Hj r5 = X.1Hj.A02
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L_0x0056
            if (r0 != r4) goto L_0x0085
            java.lang.Object r8 = r6.A02
            com.instagram.wonderwall.model.WallPostItem r8 = (com.instagram.wonderwall.model.WallPostItem) r8
            java.lang.Object r1 = r6.A01
            com.instagram.wonderwall.repository.WallPostRepository r1 = (com.instagram.wonderwall.repository.WallPostRepository) r1
            X.0eS.A00(r2)
        L_0x002c:
            boolean r0 = X.AnonymousClass7TE.A1a(r2)
            if (r0 == 0) goto L_0x0042
            X.JQP r1 = r1.A01
            com.instagram.wonderwall.model.WallPostInfo r0 = r8.BeB()
            java.lang.String r0 = r0.A06
            r1.Dzx(r0)
        L_0x003d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L_0x0042:
            X.HMM r3 = X.HMM.IDLE
            X.JQP r2 = r1.A01
            r1 = 39
            X.MPC r0 = new X.MPC
            r0.<init>(r3, r1)
            com.instagram.wonderwall.model.WallPostItem r0 = A00(r8, r0)
            r2.E01(r0)
            r4 = 0
            goto L_0x003d
        L_0x0056:
            X.0eS.A00(r2)
            X.HMM r3 = X.HMM.DELETING
            X.JQP r2 = r7.A01
            r1 = 39
            X.MPC r0 = new X.MPC
            r0.<init>(r3, r1)
            com.instagram.wonderwall.model.WallPostItem r0 = A00(r8, r0)
            r2.E01(r0)
            com.instagram.wonderwall.api.WallApiGraphQLImpl r1 = r7.A02
            com.instagram.wonderwall.model.WallPostInfo r0 = r8.BeB()
            java.lang.String r0 = r0.A06
            X.C51966G9m.A1P(r7, r8, r6, r4)
            java.lang.Object r2 = r1.A03(r0, r6)
            if (r2 != r5) goto L_0x007d
            return r5
        L_0x007d:
            r1 = r7
            goto L_0x002c
        L_0x007f:
            X.MDj r6 = new X.MDj
            r6.<init>(r7, r9, r3)
            goto L_0x0016
        L_0x0085:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wonderwall.repository.WallPostRepository.A02(com.instagram.wonderwall.model.WallPostItem, X.4D7):java.lang.Object");
    }
}
