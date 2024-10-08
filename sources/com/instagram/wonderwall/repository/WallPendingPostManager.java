package com.instagram.wonderwall.repository;

import X.0qQ;
import X.19E;
import X.1Ng;
import X.AnonymousClass12T;
import X.AnonymousClass19G;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C252733pa;
import X.C262204Co;
import X.C262224Cq;
import X.C51966G9m;
import X.C51974G9v;
import X.C56353Hx4;
import X.C58729Iwc;
import X.C63824L8f;
import X.HMM;
import X.MH7;
import X.MPC;
import com.instagram.user.model.User;
import com.instagram.wonderwall.api.WallApiGraphQLImpl;
import com.instagram.wonderwall.model.WallGifPostItem;
import com.instagram.wonderwall.model.WallInfo;
import com.instagram.wonderwall.model.WallMediaPostItem;
import com.instagram.wonderwall.model.WallMusicPostItem;
import com.instagram.wonderwall.model.WallPostInfo;
import com.instagram.wonderwall.model.WallPostItem;
import com.instagram.wonderwall.model.WallRepostItem;
import com.instagram.wonderwall.model.WallTextPostItem;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class WallPendingPostManager extends C252733pa {
    public static final C56353Hx4 A05 = new Object();
    public final C63824L8f A00;
    public final Map A01 = AnonymousClass7TE.A1H();
    public final ConcurrentHashMap A02 = new ConcurrentHashMap();
    public final 1Ng A03;
    public final WallApiGraphQLImpl A04;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r1 = X.DbS.A10(X.AnonymousClass7TE.A1C());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A04(java.lang.String r4, X.0sP r5) {
        /*
            r3 = this;
            r0 = 0
            X.0qQ.A0B(r4, r0)
            java.util.concurrent.ConcurrentHashMap r2 = r3.A02
            java.lang.Object r1 = r2.get(r4)
            if (r1 != 0) goto L_0x001b
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            X.02z r1 = X.DbS.A10(r0)
            java.lang.Object r0 = r2.putIfAbsent(r4, r1)
            if (r0 == 0) goto L_0x001b
            r1 = r0
        L_0x001b:
            X.05G r1 = (X.05G) r1
            java.lang.Object r0 = r1.getValue()
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.ArrayList r0 = X.00k.A0U(r0)
            r5.invoke(r0)
            r1.Epw(r0)
            r2.put(r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wonderwall.repository.WallPendingPostManager.A04(java.lang.String, X.0sP):void");
    }

    public final void A05(WallPostItem wallPostItem, String str) {
        AnonymousClass7TG.A1N(str, wallPostItem);
        A04(str, new MPC(wallPostItem, 37));
        Map map = this.A01;
        String str2 = wallPostItem.BeB().A06;
        C262224Cq r0 = this.A01;
        map.put(str2, C51966G9m.A1L(new MH7((Object) this, (Object) wallPostItem, str, (AnonymousClass4D7) null, 23), r0));
    }

    public static final WallPostItem A00(WallPostItem wallPostItem, HMM hmm) {
        int i;
        WallMediaPostItem wallMediaPostItem;
        HMM hmm2 = hmm;
        WallPostItem wallPostItem2 = wallPostItem;
        int ordinal = hmm2.ordinal();
        if (ordinal == 5) {
            i = -1;
        } else if (ordinal == 3 || ordinal == 4) {
            i = wallPostItem2.BeB().A00 + 1;
        } else {
            i = wallPostItem2.BeB().A00;
        }
        WallPostInfo BeB = wallPostItem2.BeB();
        String str = BeB.A06;
        User user = BeB.A03;
        WallInfo wallInfo = BeB.A04;
        String str2 = BeB.A07;
        boolean z = BeB.A0B;
        boolean z2 = BeB.A09;
        boolean z3 = BeB.A0A;
        int i2 = BeB.A01;
        List list = BeB.A08;
        long j = BeB.A02;
        C51974G9v.A1O(str, user, wallInfo, str2);
        0qQ.A0B(list, 8);
        WallPostInfo wallPostInfo = new WallPostInfo(user, wallInfo, hmm2, str, str2, list, i2, i, j, z, z2, z3);
        if (wallPostItem2 instanceof WallTextPostItem) {
            return new WallTextPostItem(wallPostInfo);
        }
        if (wallPostItem2 instanceof WallMediaPostItem) {
            WallMediaPostItem wallMediaPostItem2 = (WallMediaPostItem) wallPostItem2;
            WallMediaPostItem wallMediaPostItem3 = new WallMediaPostItem(wallMediaPostItem2.A01, wallPostInfo);
            wallMediaPostItem3.A00 = wallMediaPostItem2.A00;
            wallMediaPostItem = wallMediaPostItem3;
        } else if (wallPostItem2 instanceof WallMusicPostItem) {
            WallMusicPostItem wallMusicPostItem = (WallMusicPostItem) wallPostItem2;
            wallMediaPostItem = new WallMusicPostItem(wallMusicPostItem.A00, wallPostInfo, wallMusicPostItem.A02);
        } else if (wallPostItem2 instanceof WallGifPostItem) {
            WallGifPostItem wallGifPostItem = (WallGifPostItem) wallPostItem2;
            wallMediaPostItem = new WallGifPostItem(wallGifPostItem.A00, wallPostInfo, wallGifPostItem.A02);
        } else if (wallPostItem2 instanceof WallRepostItem) {
            wallMediaPostItem = new WallRepostItem(wallPostInfo, ((WallRepostItem) wallPostItem2).A01);
        } else {
            throw AnonymousClass7TE.A1K();
        }
        return (WallPostItem) wallMediaPostItem;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDz, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.instagram.wonderwall.model.WallPostItem r7, com.instagram.wonderwall.repository.WallPendingPostManager r8, java.lang.String r9, X.AnonymousClass4D7 r10) {
        /*
            r3 = 22
            boolean r0 = X.C66147MDz.A02(r3, r10)
            if (r0 == 0) goto L_0x00cb
            r5 = r10
            X.MDz r5 = (X.C66147MDz) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00cb
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r4 = r5.A04
            X.1Hj r3 = X.1Hj.A02
            int r0 = r5.A00
            r6 = 2
            r1 = 1
            if (r0 == 0) goto L_0x004c
            if (r0 == r1) goto L_0x0069
            if (r0 != r6) goto L_0x00d2
            java.lang.Object r7 = r5.A03
            X.3Ii r7 = (X.C239803Ii) r7
            java.lang.Object r9 = r5.A02
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r5.A01
            com.instagram.wonderwall.repository.WallPendingPostManager r8 = (com.instagram.wonderwall.repository.WallPendingPostManager) r8
            X.0eS.A00(r4)
        L_0x0033:
            X.1Ng r2 = r8.A03
            X.3Ih r7 = (X.C239793Ih) r7
            java.lang.Object r1 = r7.A00
            com.instagram.wonderwall.model.WallPostItem r1 = (com.instagram.wonderwall.model.WallPostItem) r1
            X.HMM r0 = X.HMM.IDLE
            com.instagram.wonderwall.model.WallPostItem r1 = A00(r1, r0)
            X.IbW r0 = new X.IbW
            r0.<init>(r1)
            X.G9w.A1K(r2, r0, r9)
        L_0x0049:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x004c:
            X.0eS.A00(r4)
            X.HMM r0 = X.HMM.PUBLISHING
            com.instagram.wonderwall.model.WallPostItem r0 = A00(r7, r0)
            A02(r0, r8, r9)
            com.instagram.wonderwall.api.WallApiGraphQLImpl r0 = r8.A04
            r5.A01 = r8
            r5.A02 = r9
            r5.A03 = r7
            r5.A00 = r1
            java.lang.Object r4 = r0.A02(r7, r9, r5)
            if (r4 != r3) goto L_0x0078
            return r3
        L_0x0069:
            java.lang.Object r7 = r5.A03
            com.instagram.wonderwall.model.WallPostItem r7 = (com.instagram.wonderwall.model.WallPostItem) r7
            java.lang.Object r9 = r5.A02
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r5.A01
            com.instagram.wonderwall.repository.WallPendingPostManager r8 = (com.instagram.wonderwall.repository.WallPendingPostManager) r8
            X.0eS.A00(r4)
        L_0x0078:
            X.3Ii r4 = (X.C239803Ii) r4
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00b0
            com.instagram.wonderwall.model.WallPostInfo r0 = r7.BeB()
            java.lang.String r0 = r0.A06
            A03(r8, r0)
            X.1Ng r2 = r8.A03
            r7 = r4
            r0 = r7
            X.3Ih r0 = (X.C239793Ih) r0
            java.lang.Object r1 = r0.A00
            com.instagram.wonderwall.model.WallPostItem r1 = (com.instagram.wonderwall.model.WallPostItem) r1
            X.HMM r0 = X.HMM.PUBLISHED
            com.instagram.wonderwall.model.WallPostItem r1 = A00(r1, r0)
            X.IbW r0 = new X.IbW
            r0.<init>(r1)
            X.G9w.A1K(r2, r0, r9)
            r0 = 2000(0x7d0, double:9.88E-321)
            r5.A01 = r8
            r5.A02 = r9
            r5.A03 = r4
            r5.A00 = r6
            java.lang.Object r0 = X.C241603Pv.A01(r5, r0)
            if (r0 != r3) goto L_0x0033
            return r3
        L_0x00b0:
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00d7
            X.5sO r4 = (X.C297815sO) r4
            java.lang.Object r0 = r4.A00
            X.CuT r0 = (X.C45325CuT) r0
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x00c8
            X.HMM r0 = X.HMM.PUBLISH_FAILED_CAN_RETRY
        L_0x00c0:
            com.instagram.wonderwall.model.WallPostItem r0 = A00(r7, r0)
            A02(r0, r8, r9)
            goto L_0x0049
        L_0x00c8:
            X.HMM r0 = X.HMM.PUBLISH_FAILED
            goto L_0x00c0
        L_0x00cb:
            X.MDz r5 = new X.MDz
            r5.<init>(r8, r10, r3)
            goto L_0x0016
        L_0x00d2:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00d7:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wonderwall.repository.WallPendingPostManager.A01(com.instagram.wonderwall.model.WallPostItem, com.instagram.wonderwall.repository.WallPendingPostManager, java.lang.String, X.4D7):java.lang.Object");
    }

    public static final void A02(WallPostItem wallPostItem, WallPendingPostManager wallPendingPostManager, String str) {
        wallPendingPostManager.A04(str, new MPC(wallPostItem, 38));
    }

    public static final void A03(WallPendingPostManager wallPendingPostManager, String str) {
        Set keySet = wallPendingPostManager.A02.keySet();
        0qQ.A07(keySet);
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            String A18 = AnonymousClass7TE.A18(it);
            0qQ.A0A(A18);
            wallPendingPostManager.A04(A18, new C58729Iwc(str, 14));
        }
    }

    public WallPendingPostManager(1Ng r5, WallApiGraphQLImpl wallApiGraphQLImpl, C63824L8f l8f) {
        super("WallPendingPostManager", 19E.A02(new AnonymousClass19G((C262204Co) null).plus(AnonymousClass12T.A00.CO6(405442214, 3))));
        this.A03 = r5;
        this.A00 = l8f;
        this.A04 = wallApiGraphQLImpl;
    }
}
