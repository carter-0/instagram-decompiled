package com.instagram.wonderwall.repository;

import X.02z;
import X.05G;
import X.0Tu;
import X.0eO;
import X.0qQ;
import X.0sn;
import X.106;
import X.182;
import X.1Ng;
import X.AnonymousClass0Ud;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass1Nd;
import X.AnonymousClass4HU;
import X.AnonymousClass4HW;
import X.AnonymousClass5F4;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C20610Wvr;
import X.C229632nm;
import X.C335967dq;
import X.C51967G9n;
import X.C53359Gmj;
import X.DbS;
import com.instagram.common.session.UserSession;
import com.instagram.wonderwall.api.WallApiGraphQLImpl;
import com.instagram.wonderwall.model.WallPostItem;
import java.util.ArrayList;
import java.util.List;

public final class WallFeedRepository {
    public final 1Ng A00;
    public final AnonymousClass4HW A01;
    public final AnonymousClass4HW A02;
    public final UserSession A03;
    public final WallApiGraphQLImpl A04;
    public final String A05;
    public final AnonymousClass0eM A06 = AnonymousClass0eN.A00(0eO.A04, new C20610Wvr(this, 39));
    public final 05G A07;
    public final 05G A08;
    public final 05G A09;
    public final AnonymousClass0Ud A0A;
    public final AnonymousClass0Ud A0B;
    public final AnonymousClass0Ud A0C;

    public final void A01(WallPostItem wallPostItem) {
        Object value;
        ArrayList A0r;
        0qQ.A0B(wallPostItem, 0);
        05G r6 = this.A07;
        do {
            value = r6.getValue();
            List<WallPostItem> list = (List) value;
            A0r = AnonymousClass7TG.A0r(list);
            for (WallPostItem wallPostItem2 : list) {
                if (0qQ.A0K(wallPostItem2.BeB().A06, wallPostItem.BeB().A06)) {
                    wallPostItem2 = wallPostItem;
                }
                A0r.add(wallPostItem2);
            }
        } while (!r6.AIY(value, A0r));
    }

    public final void A02(String str) {
        Object value;
        ArrayList A1C;
        0qQ.A0B(str, 0);
        05G r5 = this.A07;
        do {
            value = r5.getValue();
            A1C = AnonymousClass7TE.A1C();
            for (Object next : (List) value) {
                if (!0qQ.A0K(((WallPostItem) next).BeB().A06, str)) {
                    A1C.add(next);
                }
            }
        } while (!r5.AIY(value, A1C));
    }

    public /* synthetic */ WallFeedRepository(UserSession userSession, String str) {
        WallApiGraphQLImpl wallApiGraphQLImpl = new WallApiGraphQLImpl(userSession);
        1Ng A002 = AnonymousClass1Nd.A00(userSession);
        0qQ.A0B(A002, 4);
        this.A05 = str;
        this.A03 = userSession;
        this.A04 = wallApiGraphQLImpl;
        this.A00 = A002;
        02z A0u = C51967G9n.A0u();
        this.A09 = A0u;
        this.A0C = A0u;
        02z A10 = DbS.A10(new C53359Gmj());
        this.A08 = A10;
        this.A0B = A10;
        02z A012 = 106.A01(0sn.A00);
        this.A07 = A012;
        this.A0A = A012;
        AnonymousClass4HU r1 = AnonymousClass4HU.A00;
        this.A02 = C335967dq.A00(r1);
        this.A01 = C335967dq.A00(r1);
        C229632nm.A07(new AnonymousClass5F4(1, 60), 182.A01(0Tu.A05, userSession, 36603828716049366L));
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDs, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.wonderwall.repository.WallFeedRepository r8, java.lang.String r9, X.AnonymousClass4D7 r10, boolean r11, boolean r12) {
        /*
            r3 = 14
            boolean r0 = X.C66140MDs.A01(r3, r10)
            if (r0 == 0) goto L_0x00e0
            r5 = r10
            X.MDs r5 = (X.C66140MDs) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00e0
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A03
            X.1Hj r6 = X.1Hj.A02
            int r0 = r5.A00
            r4 = 1
            if (r0 == 0) goto L_0x00b3
            if (r0 != r4) goto L_0x00ec
            boolean r11 = r5.A05
            java.lang.Object r9 = r5.A02
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r5.A01
            com.instagram.wonderwall.repository.WallFeedRepository r8 = (com.instagram.wonderwall.repository.WallFeedRepository) r8
            X.0eS.A00(r1)
        L_0x002e:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00a7
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.HlL r0 = (X.C55662HlL) r0
            java.util.List r6 = r0.A01
            X.05G r1 = r8.A09
            com.instagram.wonderwall.model.WallInfo r0 = r0.A00
            r1.Epw(r0)
            java.lang.String r1 = r8.A05
            com.instagram.common.session.UserSession r0 = r8.A03
            boolean r0 = X.C51966G9m.A1W(r0, r1)
            if (r0 == 0) goto L_0x007c
            X.0eM r5 = r8.A06
            java.lang.Object r4 = r5.getValue()
            X.1Av r4 = (X.1Av) r4
            r3 = 0
            X.0s0 r2 = r4.A8R
            X.0YZ[] r7 = X.1Av.A8a
            r0 = 490(0x1ea, float:6.87E-43)
            r1 = r7[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r2.Epx(r4, r0, r1)
            java.lang.Object r5 = r5.getValue()
            X.1Av r5 = (X.1Av) r5
            long r3 = java.lang.System.currentTimeMillis()
            X.0s0 r2 = r5.A8S
            r0 = 489(0x1e9, float:6.85E-43)
            r1 = r7[r0]
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r2.Epx(r5, r0, r1)
        L_0x007c:
            X.05G r1 = r8.A07
            if (r11 != 0) goto L_0x008a
            java.lang.Object r0 = r1.getValue()
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.ArrayList r6 = X.00k.A0S(r6, r0)
        L_0x008a:
            r1.Epw(r6)
            r0 = 13
            X.Iwc r3 = new X.Iwc
            r3.<init>(r9, r0)
        L_0x0094:
            X.05G r2 = r8.A08
        L_0x0096:
            java.lang.Object r1 = r2.getValue()
            java.lang.Object r0 = r3.invoke(r1)
            boolean r0 = r2.AIY(r1, r0)
            if (r0 == 0) goto L_0x0096
            X.0gF r6 = X.C60340gF.A00
            return r6
        L_0x00a7:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00e7
            r0 = 36
            X.MPC r3 = new X.MPC
            r3.<init>(r1, r0)
            goto L_0x0094
        L_0x00b3:
            X.0eS.A00(r1)
            r0 = 25
            X.GL4 r3 = new X.GL4
            r3.<init>(r12, r0)
            X.05G r2 = r8.A08
        L_0x00bf:
            java.lang.Object r1 = r2.getValue()
            java.lang.Object r0 = r3.invoke(r1)
            boolean r0 = r2.AIY(r1, r0)
            if (r0 == 0) goto L_0x00bf
            com.instagram.wonderwall.api.WallApiGraphQLImpl r1 = r8.A04
            java.lang.String r0 = r8.A05
            r5.A01 = r8
            r5.A02 = r9
            r5.A05 = r11
            r5.A00 = r4
            java.lang.Object r1 = r1.A05(r0, r5)
            if (r1 != r6) goto L_0x002e
            return r6
        L_0x00e0:
            X.MDs r5 = new X.MDs
            r5.<init>(r8, r10, r3)
            goto L_0x0016
        L_0x00e7:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00ec:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wonderwall.repository.WallFeedRepository.A00(com.instagram.wonderwall.repository.WallFeedRepository, java.lang.String, X.4D7, boolean, boolean):java.lang.Object");
    }
}
