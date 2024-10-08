package com.instagram.brandedcontent.project;

import X.02z;
import X.05G;
import X.10b;
import X.1vn;
import X.2IS;
import X.AnonymousClass0Ud;
import X.AnonymousClass0iw;
import X.AnonymousClass7TE;
import X.BYW;
import X.C41845B3m;
import X.C51970G9q;
import X.C61082JwK;
import X.C64394LbB;
import X.C64397LbE;
import X.DbS;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class BrandedContentProjectRepository implements AnonymousClass0iw {
    public final UserSession A00;
    public final 05G A01;
    public final AnonymousClass0Ud A02;
    public final AnonymousClass0Ud A03;
    public final 1vn A04;
    public final 05G A05;

    public final void A02(ImmutableList immutableList, int i) {
        2IS A042 = C41845B3m.A04();
        2IS A043 = C41845B3m.A04();
        A042.A03("profilePicSize", 50);
        A042.A05("project_states", immutableList);
        A042.A03("first", Integer.valueOf(i));
        C64394LbB.A00(new C64397LbE(this, 6), new PandoGraphQLRequest(C41845B3m.A05(), "GetListOfProjects", A042.getParamsCopy(), A043.getParamsCopy(), BYW.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "cam_creator_profile", AnonymousClass7TE.A1C()), this.A04, this, 6);
    }

    public final String getModuleName() {
        return "BrandedContentProjectRepository";
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDg, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(com.google.common.collect.ImmutableList r21, X.AnonymousClass4D7 r22, int r23) {
        /*
            r20 = this;
            r3 = 12
            r6 = r22
            boolean r0 = X.C66128MDg.A01(r3, r6)
            r5 = r20
            if (r0 == 0) goto L_0x00cc
            r4 = r6
            X.MDg r4 = (X.C66128MDg) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00cc
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x001a:
            java.lang.Object r1 = r4.A02
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x0075
            if (r0 != r2) goto L_0x00df
            java.lang.Object r4 = r4.A01
            com.instagram.brandedcontent.project.BrandedContentProjectRepository r4 = (com.instagram.brandedcontent.project.BrandedContentProjectRepository) r4
            X.0eS.A00(r1)
        L_0x002c:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00d3
            X.3lr r3 = X.C41846B3n.A0R(r1)
            if (r3 == 0) goto L_0x00dc
            java.lang.Class<X.BYV> r2 = X.BYV.class
            java.lang.String r1 = "cam_creator_profile"
            r0 = 265934746(0xfd9d79a, float:2.1480899E-29)
            X.3lr r3 = r3.A03(r2, r1, r0)
            if (r3 == 0) goto L_0x00dc
            java.lang.Class<X.BYU> r2 = X.BYU.class
            java.lang.String r1 = "creator_profile"
            r0 = -1587776802(0xffffffffa15c72de, float:-7.4690925E-19)
            X.3lr r3 = r3.A03(r2, r1, r0)
            if (r3 == 0) goto L_0x00dc
            java.lang.Class<X.BYT> r2 = X.BYT.class
            r0 = 1246(0x4de, float:1.746E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 564437363(0x21a4a173, float:1.1155808E-18)
            X.3lr r3 = r3.A03(r2, r1, r0)
            if (r3 == 0) goto L_0x00dc
            java.lang.Class<X.UPW> r2 = X.UPW.class
            java.lang.String r1 = "nodes"
            r0 = -2020547369(0xffffffff8790e4d7, float:-2.1801212E-34)
            com.google.common.collect.ImmutableList r0 = r3.A06(r2, r1, r0)
            if (r0 == 0) goto L_0x00dc
            java.util.ArrayList r0 = A00(r4, r0)
            return r0
        L_0x0075:
            X.0eS.A00(r1)
            X.1vn r1 = r5.A04
            r15 = 0
            X.2IS r8 = X.C41845B3m.A04()
            X.2IS r7 = X.C41845B3m.A04()
            r0 = 50
            java.lang.Integer r6 = X.JTO.A0w(r0)
            java.lang.String r0 = "profilePicSize"
            r8.A03(r0, r6)
            java.lang.String r0 = "project_states"
            r6 = r21
            r8.A05(r0, r6)
            java.lang.Integer r6 = X.JTO.A0w(r23)
            java.lang.String r0 = "first"
            r8.A03(r0, r6)
            X.1vR r9 = X.C41845B3m.A05()
            java.util.Map r11 = r8.getParamsCopy()
            java.util.Map r12 = r7.getParamsCopy()
            java.lang.Class<X.BYW> r13 = X.BYW.class
            java.util.ArrayList r19 = X.AnonymousClass7TE.A1C()
            java.lang.String r10 = "GetListOfProjects"
            r14 = 0
            java.lang.String r18 = "cam_creator_profile"
            com.facebook.pando.PandoGraphQLRequest r8 = new com.facebook.pando.PandoGraphQLRequest
            r16 = r14
            r17 = r15
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r4.A01 = r5
            r4.A00 = r2
            java.lang.Object r1 = r1.A04(r8, r4)
            if (r1 != r3) goto L_0x00c9
            return r3
        L_0x00c9:
            r4 = r5
            goto L_0x002c
        L_0x00cc:
            X.MDg r4 = new X.MDg
            r4.<init>(r5, r6, r3)
            goto L_0x001a
        L_0x00d3:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x00dc
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00dc:
            X.0sn r0 = X.0sn.A00
            return r0
        L_0x00df:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.project.BrandedContentProjectRepository.A01(com.google.common.collect.ImmutableList, X.4D7, int):java.lang.Object");
    }

    public BrandedContentProjectRepository(UserSession userSession, 1vn r7) {
        this.A00 = userSession;
        this.A04 = r7;
        02z A10 = DbS.A10(new C61082JwK((List) null, 3, 9, false));
        this.A01 = A10;
        this.A03 = 10b.A03(A10);
        02z A102 = C51970G9q.A10(false);
        this.A05 = A102;
        this.A02 = 10b.A03(A102);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0094, code lost:
        if (r6 != null) goto L_0x0096;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.ArrayList A00(com.instagram.brandedcontent.project.BrandedContentProjectRepository r23, java.util.List r24) {
        /*
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.LinkedHashSet r4 = X.DbS.A0y()
            java.util.Iterator r12 = r24.iterator()
            r3 = 0
            r2 = 0
        L_0x000e:
            boolean r0 = r12.hasNext()
            r21 = 0
            if (r0 == 0) goto L_0x0169
            X.3lr r7 = X.C41845B3m.A0V(r12)
            java.lang.Class<X.UPT> r6 = X.UPT.class
            r2 = 4
            r0 = 2690(0xa82, float:3.77E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 745524792(0x2c6fce38, float:3.4078417E-12)
            X.3lr r6 = r7.getOptionalTreeField(r2, r1, r6, r0)
            if (r6 == 0) goto L_0x0165
            java.lang.Class<X.UPS> r2 = X.UPS.class
            r0 = 2723(0xaa3, float:3.816E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 1502601768(0x598fe228, float:5.0624479E15)
            X.3lr r6 = r6.getOptionalTreeField(r3, r1, r2, r0)
            if (r6 == 0) goto L_0x0165
            java.lang.Class<X.UPR> r2 = X.UPR.class
            r0 = 3309(0xced, float:4.637E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 1865060896(0x6f2a9220, float:5.2789106E28)
            X.3lr r6 = r6.getOptionalTreeField(r3, r1, r2, r0)
        L_0x004c:
            java.lang.Class<X.UPV> r8 = X.UPV.class
            r2 = 5
            r0 = 3810(0xee2, float:5.339E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 615638272(0x24b1e500, float:7.7149455E-17)
            X.3lr r1 = r7.getOptionalTreeField(r2, r1, r8, r0)
            java.lang.String r8 = "strong_id__"
            java.lang.String r0 = r7.getOptionalStringField(r3, r8)
            r2 = 1
            if (r0 == 0) goto L_0x015d
            int r0 = r0.length()
            if (r0 == 0) goto L_0x015d
            r10 = 0
        L_0x006c:
            java.lang.String r9 = "name"
            java.lang.String r0 = r7.getOptionalStringField(r2, r9)
            if (r0 == 0) goto L_0x007a
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0080
        L_0x007a:
            java.lang.String r0 = "project_name"
            r4.add(r0)
            r10 = 1
        L_0x0080:
            if (r6 == 0) goto L_0x008e
            java.lang.String r0 = r6.getOptionalStringField(r3, r8)
            if (r0 == 0) goto L_0x008e
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0096
        L_0x008e:
            java.lang.String r0 = "brand_id"
            r4.add(r0)
            r10 = 1
            if (r6 == 0) goto L_0x0156
        L_0x0096:
            java.lang.String r0 = X.Dbp.A01()
            java.lang.String r0 = r6.getOptionalStringField(r2, r0)
            if (r0 == 0) goto L_0x0156
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0156
            r2 = r10
            if (r10 != 0) goto L_0x000e
            java.lang.String r16 = r7.getOptionalStringField(r3, r8)
            java.lang.String r11 = ""
            if (r16 != 0) goto L_0x00b3
            r16 = r11
        L_0x00b3:
            java.lang.String r17 = r7.A08(r9)
            if (r17 != 0) goto L_0x00bb
            r17 = r11
        L_0x00bb:
            if (r1 == 0) goto L_0x00c3
            java.lang.String r18 = r1.getOptionalStringField(r3, r8)
            if (r18 != 0) goto L_0x00cb
        L_0x00c3:
            java.lang.String r18 = r6.getOptionalStringField(r3, r8)
            if (r18 != 0) goto L_0x00cb
            r18 = r11
        L_0x00cb:
            if (r1 == 0) goto L_0x00d7
            java.lang.String r0 = X.Dbp.A01()
            java.lang.String r19 = r1.A08(r0)
            if (r19 != 0) goto L_0x00e3
        L_0x00d7:
            java.lang.String r0 = X.Dbp.A01()
            java.lang.String r19 = r6.A08(r0)
            if (r19 != 0) goto L_0x00e3
            r19 = r11
        L_0x00e3:
            r8 = 3
            r0 = 4159(0x103f, float:5.828E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            long r8 = r7.getCoercedTimeField(r8, r0)
            java.lang.Long r15 = java.lang.Long.valueOf(r8)
            r8 = 2
            java.lang.String r0 = "ads_permission_required"
            java.lang.Boolean r14 = X.C41846B3n.A0d(r7, r0, r8)
            java.lang.Class<X.UPU> r10 = X.UPU.class
            r9 = 6
            r0 = 2692(0xa84, float:3.772E-42)
            java.lang.String r8 = X.AnonymousClass000.A00(r0)
            r0 = -544627480(0xffffffffdf89a4e8, float:-1.9836615E19)
            X.3lr r8 = r7.getOptionalTreeField(r9, r8, r10, r0)
            if (r8 == 0) goto L_0x0153
            java.lang.String r0 = "content_id"
            java.lang.Integer r0 = X.C41846B3n.A0g(r8, r0, r3)
            java.lang.String r20 = r0.toString()
        L_0x0115:
            java.lang.Class<X.BYS> r10 = X.BYS.class
            r9 = 7
            r0 = 2691(0xa83, float:3.771E-42)
            java.lang.String r8 = X.AnonymousClass000.A00(r0)
            r0 = -376479384(0xffffffffe98f6168, float:-2.1667048E25)
            X.3lr r7 = r7.getOptionalTreeField(r9, r8, r10, r0)
            if (r7 == 0) goto L_0x012d
            java.lang.String r0 = "package"
            java.lang.String r21 = r7.getOptionalStringField(r3, r0)
        L_0x012d:
            if (r1 == 0) goto L_0x013b
            r0 = 747(0x2eb, float:1.047E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r22 = r1.A09(r0)
            if (r22 != 0) goto L_0x0149
        L_0x013b:
            r0 = 747(0x2eb, float:1.047E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r22 = r6.A09(r0)
            if (r22 != 0) goto L_0x0149
            r22 = r11
        L_0x0149:
            X.Jus r13 = new X.Jus
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r5.add(r13)
            goto L_0x000e
        L_0x0153:
            r20 = r21
            goto L_0x0115
        L_0x0156:
            java.lang.String r0 = "brand_username"
            r4.add(r0)
            goto L_0x000e
        L_0x015d:
            java.lang.String r0 = "project_id"
            r4.add(r0)
            r10 = 1
            goto L_0x006c
        L_0x0165:
            r6 = r21
            goto L_0x004c
        L_0x0169:
            r7 = r23
            if (r2 == 0) goto L_0x017e
            com.instagram.common.session.UserSession r6 = r7.A00
            java.lang.Integer r2 = X.AnonymousClass05K.A0d
            java.lang.String r1 = r4.toString()
            java.lang.String r0 = "missing_fields"
            java.util.Map r0 = X.AnonymousClass7TF.A0w(r0, r1)
            X.JVF.A05(r7, r6, r2, r0)
        L_0x017e:
            X.05G r4 = r7.A01
            r2 = 2
            r1 = 9
            X.JwK r0 = new X.JwK
            r0.<init>(r5, r2, r1, r3)
            r4.Epw(r0)
            X.05G r1 = r7.A05
            boolean r0 = X.DbT.A1b(r5)
            X.AnonymousClass7TF.A1O(r1, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.project.BrandedContentProjectRepository.A00(com.instagram.brandedcontent.project.BrandedContentProjectRepository, java.util.List):java.util.ArrayList");
    }
}
