package com.instagram.reels.storiestemplate.discovery.repository;

import X.0qQ;
import X.C45310CuE;
import X.C63967LFt;
import androidx.paging.PagingSource;

public final class StoryTemplateDiscoverySurfaceSectionPagingSource extends PagingSource {
    public final C45310CuE A00;

    public StoryTemplateDiscoverySurfaceSectionPagingSource(C45310CuE cuE) {
        0qQ.A0B(cuE, 1);
        this.A00 = cuE;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.4D7, X.MEA] */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.reels.storiestemplate.discovery.repository.StoryTemplateDiscoverySurfaceSectionPagingSource r15, X.AnonymousClass4D7 r16) {
        /*
            r4 = 8
            r5 = r16
            boolean r0 = X.MEA.A03(r4, r5)
            if (r0 == 0) goto L_0x00a8
            r3 = r5
            X.MEA r3 = (X.MEA) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00a8
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0018:
            java.lang.Object r4 = r3.A01
            X.1Hj r2 = X.1Hj.A02
            int r1 = r3.A00
            r0 = 1
            if (r1 == 0) goto L_0x004d
            if (r1 != r0) goto L_0x00d3
            X.0eS.A00(r4)
        L_0x0026:
            X.3Ii r4 = (X.C239803Ii) r4
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00c1
            X.3lr r3 = X.C41846B3n.A0R(r4)
            if (r3 == 0) goto L_0x00b1
            java.lang.Class<X.C3d> r2 = X.C43629C3d.class
            java.lang.String r1 = "xdt_trending_template_sections(fetch_reel_templates:$fetch_reel_templates)"
            r0 = 1891574422(0x70bf2296, float:4.732276E29)
            X.3lr r3 = r3.A05(r2, r1, r0)
            java.lang.Class<X.C3c> r2 = X.C43628C3c.class
            java.lang.String r1 = "section_infos"
            r0 = -1940154261(0xffffffff8c5b986b, float:-1.6917013E-31)
            com.google.common.collect.ImmutableList r0 = r3.A06(r2, r1, r0)
            X.3Ih r2 = X.C41845B3m.A0d(r0)
            return r2
        L_0x004d:
            X.0eS.A00(r4)
            X.CuE r4 = r15.A00
            r3.A00 = r0
            r12 = 0
            X.2IS r8 = X.C41845B3m.A04()
            X.2IS r7 = X.C41845B3m.A04()
            com.instagram.common.session.UserSession r6 = r4.A00
            X.0Tu r5 = X.0Tu.A05
            r0 = 36329951535841669(0x8111e600004185, double:3.038545868014581E-306)
            java.lang.Boolean r1 = X.AnonymousClass7TF.A0R(r5, r6, r0)
            java.lang.String r0 = "fetch_reel_templates"
            r8.A02(r0, r1)
            boolean r0 = X.AnonymousClass7TF.A1V(r1)
            X.1vR r6 = X.C41845B3m.A06(r0)
            java.util.Map r8 = r8.getParamsCopy()
            java.util.Map r9 = r7.getParamsCopy()
            java.lang.Class<X.C3e> r10 = X.C43630C3e.class
            java.util.ArrayList r16 = X.AnonymousClass7TE.A1C()
            java.lang.String r7 = "StoryTemplateDiscoverySurfaceSectionQuery"
            r11 = 0
            java.lang.String r15 = "xdt_trending_template_sections"
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest
            r13 = r11
            r14 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0 = 600000(0x927c0, double:2.964394E-318)
            X.1Ef r5 = r5.setFreshCacheAgeMs(r0)
            r0 = 900000(0xdbba0, double:4.44659E-318)
            X.1Ef r1 = r5.setMaxToleratedCacheAgeMs(r0)
            X.1vn r0 = r4.A01
            java.lang.Object r4 = r0.A04(r1, r3)
            if (r4 != r2) goto L_0x0026
            return r2
        L_0x00a8:
            r0 = 42
            X.MEA r3 = new X.MEA
            r3.<init>(r15, r5, r4, r0)
            goto L_0x0018
        L_0x00b1:
            java.lang.String r0 = "Empty response received from server"
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r0)
            X.4dn r0 = new X.4dn
            r0.<init>(r1)
            X.5sO r2 = X.C41845B3m.A0c(r0)
            return r2
        L_0x00c1:
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00ce
            X.5sO r4 = (X.C297815sO) r4
            java.lang.Object r0 = r4.A00
            X.5sO r2 = X.C41845B3m.A0c(r0)
            return r2
        L_0x00ce:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00d3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.reels.storiestemplate.discovery.repository.StoryTemplateDiscoverySurfaceSectionPagingSource.A00(com.instagram.reels.storiestemplate.discovery.repository.StoryTemplateDiscoverySurfaceSectionPagingSource, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.MDq, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(X.LCU r9, X.AnonymousClass4D7 r10) {
        /*
            r8 = this;
            r4 = 38
            boolean r0 = X.C66138MDq.A02(r4, r10)
            if (r0 == 0) goto L_0x006a
            r3 = r10
            X.MDq r3 = (X.C66138MDq) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x006a
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r3.A02
            X.1Hj r1 = X.1Hj.A02
            int r0 = r3.A00
            r7 = 1
            if (r0 == 0) goto L_0x005c
            if (r0 != r7) goto L_0x00a3
            X.0eS.A00(r2)
        L_0x0024:
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0077
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r0 = r2.A00
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r6 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r5 = r0.iterator()
        L_0x0038:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0070
            X.3lr r4 = X.C41845B3m.A0V(r5)
            X.EWj r2 = X.C48117EWj.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r1 = 0
            java.lang.String r0 = "id"
            java.lang.Enum r3 = r4.getRequiredEnumField(r1, r0, r2)
            java.lang.String r0 = "title"
            java.lang.String r2 = r4.getRequiredStringField(r7, r0)
            r1 = 9
            X.JwE r0 = new X.JwE
            r0.<init>((java.lang.String) r2, (java.lang.Object) r3, (int) r1)
            r6.add(r0)
            goto L_0x0038
        L_0x005c:
            X.0eS.A00(r2)
            r3.A01 = r8
            r3.A00 = r7
            java.lang.Object r2 = A00(r8, r3)
            if (r2 != r1) goto L_0x0024
            return r1
        L_0x006a:
            X.MDq r3 = new X.MDq
            r3.<init>(r8, r10, r4)
            goto L_0x0016
        L_0x0070:
            r1 = 0
            X.Jjs r0 = new X.Jjs
            r0.<init>(r1, r6)
            return r0
        L_0x0077:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 == 0) goto L_0x009e
            X.5sO r2 = (X.C297815sO) r2
            java.lang.Object r1 = r2.A00
            X.4dm r1 = (X.C268654dm) r1
            boolean r0 = r1 instanceof X.C268664dn
            if (r0 == 0) goto L_0x008f
            X.4dn r1 = (X.C268664dn) r1
            java.lang.Throwable r1 = r1.A00
            X.Jjr r0 = new X.Jjr
            r0.<init>(r1)
            return r0
        L_0x008f:
            boolean r0 = r1 instanceof X.C268674do
            if (r0 == 0) goto L_0x0099
            X.Jjq r0 = new X.Jjq
            r0.<init>()
            return r0
        L_0x0099:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x009e:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00a3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.reels.storiestemplate.discovery.repository.StoryTemplateDiscoverySurfaceSectionPagingSource.A04(X.LCU, X.4D7):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object A05(C63967LFt lFt) {
        return null;
    }
}
