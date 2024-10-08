package com.instagram.creator.inspiration.repository;

import X.0qQ;
import X.0sn;
import X.1E4;
import X.1E5;
import X.1E9;
import X.1Xj;
import X.1Xv;
import X.AnonymousClass4D7;
import X.AnonymousClass6A1;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C229352nF;
import X.C250663lr;
import X.C276114sa;
import X.C294895nD;
import X.C295375o3;
import X.C60347Jjs;
import X.C63967LFt;
import X.LCU;
import X.N4R;
import androidx.paging.PagingSource;
import com.facebook.pando.TreeJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl;
import com.instagram.creator.inspiration.repository.graphql.IGCreatorInspirationHubMediaFragmentImpl;
import com.instagram.feed.media.ImmutablePandoMediaDict;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public final class CreatorInspirationHubReelsHScrollPagingSource extends PagingSource {
    public final UserSession A00;
    public final C229352nF A01;
    public final String A02;
    public final String A03;
    public final Map A04;
    public final Map A05;

    public CreatorInspirationHubReelsHScrollPagingSource(C229352nF r2, UserSession userSession, String str, String str2, Map map, Map map2) {
        0qQ.A0B(map, 4);
        this.A00 = userSession;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = map;
        this.A05 = map2;
        this.A01 = r2;
    }

    public static void A02(CreatorInspirationHubReelsHScrollPagingSource creatorInspirationHubReelsHScrollPagingSource, AbstractCollection abstractCollection, Iterator it) {
        C250663lr requiredTreeField = ((C250663lr) it.next()).getRequiredTreeField(0, "media", GetCreatorInspirationHubQueryResponseImpl.XdtAsyncGetCreatorInspirationHub.SectionContent.Data.ClipsSectionContentData.ClipsItems.Media.class, -251780288);
        0qQ.A0C(requiredTreeField, "null cannot be cast to non-null type com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl.XdtAsyncGetCreatorInspirationHub.SectionContent.Data.ClipsSectionContentData.ClipsItems.Media");
        C250663lr reinterpretRequired = requiredTreeField.reinterpretRequired(0, IGCreatorInspirationHubMediaFragmentImpl.class, -1290013599);
        1E5 A002 = 1E4.A00(creatorInspirationHubReelsHScrollPagingSource.A00);
        0qQ.A0B(A002, 0);
        1Xv r0 = 1Xj.A0h;
        TreeJNI reinterpret = reinterpretRequired.reinterpret(ImmutablePandoMediaDict.class);
        0qQ.A07(reinterpret);
        abstractCollection.add(C295375o3.A02(1Xv.A00(new 1E9(A002, 6, false), (ImmutablePandoMediaDict) reinterpret)));
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDh, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.creator.inspiration.repository.CreatorInspirationHubReelsHScrollPagingSource r12, java.lang.String r13, X.AnonymousClass4D7 r14) {
        /*
            r3 = 18
            boolean r0 = X.C66129MDh.A01(r3, r14)
            if (r0 == 0) goto L_0x00bc
            r5 = r14
            X.MDh r5 = (X.C66129MDh) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00bc
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A02
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r3 = 1
            r6 = 0
            if (r0 == 0) goto L_0x00a0
            if (r0 != r3) goto L_0x0106
            java.lang.Object r12 = r5.A01
            com.instagram.creator.inspiration.repository.CreatorInspirationHubReelsHScrollPagingSource r12 = (com.instagram.creator.inspiration.repository.CreatorInspirationHubReelsHScrollPagingSource) r12
            X.0eS.A00(r1)
        L_0x0029:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00ee
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.3JC r0 = (X.AnonymousClass3JC) r0
            java.lang.Object r0 = r0.A01
            com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl r0 = (com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl) r0
            if (r0 == 0) goto L_0x00c3
            com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl$XdtAsyncGetCreatorInspirationHub r0 = r0.A0E()
            if (r0 == 0) goto L_0x00c3
            com.google.common.collect.ImmutableList r0 = r0.A0E()
            if (r0 == 0) goto L_0x00c3
            java.util.Iterator r4 = r0.iterator()
        L_0x004b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x009e
            java.lang.Object r2 = r4.next()
            r3 = r2
            X.3lr r3 = (X.C250663lr) r3
            r1 = 2
            java.lang.String r0 = "section_id"
            java.lang.String r1 = X.C41847B3o.A1A(r3, r0, r1)
            java.lang.String r0 = r12.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x004b
        L_0x0067:
            com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl$XdtAsyncGetCreatorInspirationHub$SectionContent r2 = (com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl.XdtAsyncGetCreatorInspirationHub.SectionContent) r2
            if (r2 == 0) goto L_0x00c4
            com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl$XdtAsyncGetCreatorInspirationHub$SectionContent$Data r4 = r2.A0E()
            if (r4 == 0) goto L_0x00c4
            java.lang.Class<com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl$XdtAsyncGetCreatorInspirationHub$SectionContent$Data$ClipsSectionContentData> r3 = com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl.XdtAsyncGetCreatorInspirationHub.SectionContent.Data.ClipsSectionContentData.class
            r1 = -2052938767(0xffffffff85a2a3f1, float:-1.529463E-35)
            java.lang.String r0 = "clips_section_content_data"
            X.3lr r5 = r4.A03(r3, r0, r1)
            if (r5 == 0) goto L_0x00c4
            java.lang.Class<com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl$XdtAsyncGetCreatorInspirationHub$SectionContent$Data$ClipsSectionContentData$ClipsItems> r4 = com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl.XdtAsyncGetCreatorInspirationHub.SectionContent.Data.ClipsSectionContentData.ClipsItems.class
            r3 = 1639908408(0x61bf0438, float:4.40454E20)
            r1 = 0
            java.lang.String r0 = "clips_items"
            com.google.common.collect.ImmutableList r0 = r5.getRequiredCompactedTreeListField(r1, r0, r4, r3)
            if (r0 == 0) goto L_0x00c4
            java.util.ArrayList r9 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0094:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00c6
            A02(r12, r9, r1)
            goto L_0x0094
        L_0x009e:
            r2 = r6
            goto L_0x0067
        L_0x00a0:
            X.0eS.A00(r1)
            com.instagram.common.session.UserSession r1 = r12.A00
            X.1vn r0 = X.1vm.A01(r1)
            X.Hq0 r2 = new X.Hq0
            r2.<init>(r1, r0)
            java.lang.String r1 = r12.A02
            r0 = 0
            r5.A01 = r12
            r5.A00 = r3
            java.lang.Object r1 = r2.A00(r1, r13, r5, r0)
            if (r1 != r4) goto L_0x0029
            return r4
        L_0x00bc:
            X.MDh r5 = new X.MDh
            r5.<init>(r12, r14, r3)
            goto L_0x0016
        L_0x00c3:
            r2 = r6
        L_0x00c4:
            X.0sn r9 = X.0sn.A00
        L_0x00c6:
            X.2nF r5 = r12.A01
            if (r5 == 0) goto L_0x00e4
            java.lang.String r8 = r12.A03
            if (r2 == 0) goto L_0x00dd
            java.lang.Class<X.6A1> r1 = X.AnonymousClass6A1.class
            java.lang.String r0 = "paging_info"
            com.facebook.pando.TreeJNI r6 = r2.getTreeValue(r0, r1)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.api.schemas.PagingInfo"
            X.0qQ.A0C(r6, r0)
            X.4sa r6 = (X.C276114sa) r6
        L_0x00dd:
            r10 = 0
            X.5nD r7 = X.C294895nD.DEFAULT
            r11 = r10
            r5.A03(r6, r7, r8, r9, r10, r11)
        L_0x00e4:
            java.lang.String r0 = r12.A01(r2)
            X.Jjs r1 = new X.Jjs
            r1.<init>(r0, r9)
            return r1
        L_0x00ee:
            java.lang.String r0 = "null cannot be cast to non-null type com.meta.kotlin.Try.Failure<com.instagram.common.api.base.ApiError<com.instagram.graphql.network.IGGraphQLResult<com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponse>>>"
            X.0qQ.A0C(r1, r0)
            X.5sO r1 = (X.C297815sO) r1
            java.lang.Object r0 = r1.A00
            java.lang.String r1 = r0.toString()
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>(r1)
            X.Jjr r1 = new X.Jjr
            r1.<init>(r0)
            return r1
        L_0x0106:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.inspiration.repository.CreatorInspirationHubReelsHScrollPagingSource.A00(com.instagram.creator.inspiration.repository.CreatorInspirationHubReelsHScrollPagingSource, java.lang.String, X.4D7):java.lang.Object");
    }

    private final String A01(GetCreatorInspirationHubQueryResponseImpl.XdtAsyncGetCreatorInspirationHub.SectionContent sectionContent) {
        String A07;
        if (sectionContent == null) {
            return null;
        }
        GetCreatorInspirationHubQueryResponseImpl.XdtAsyncGetCreatorInspirationHub.SectionContent.PagingInfo A0F = sectionContent.A0F();
        if (!(A0F == null || (A07 = A0F.A07("max_id")) == null)) {
            this.A05.put(this.A03, A07);
        }
        GetCreatorInspirationHubQueryResponseImpl.XdtAsyncGetCreatorInspirationHub.SectionContent.PagingInfo A0F2 = sectionContent.A0F();
        if (A0F2 == null || !A0F2.getRequiredBooleanField(1, "more_available")) {
            return null;
        }
        return sectionContent.A0F().A07("max_id");
    }

    public final Object A04(LCU lcu, AnonymousClass4D7 r12) {
        ArrayList arrayList;
        GetCreatorInspirationHubQueryResponseImpl.XdtAsyncGetCreatorInspirationHub.SectionContent.Data A0E;
        C250663lr A032;
        ImmutableList requiredCompactedTreeListField;
        Object A002 = lcu.A00();
        if (A002 != null) {
            return A00(this, (String) A002, r12);
        }
        Map map = this.A04;
        String str = this.A03;
        if (!map.containsKey(str) || map.get(str) == null) {
            return new C60347Jjs((Object) null, (Object) null, 0sn.A00, 0, 3);
        }
        Object obj = map.get(str);
        if (obj != null) {
            GetCreatorInspirationHubQueryResponseImpl.XdtAsyncGetCreatorInspirationHub.SectionContent sectionContent = (GetCreatorInspirationHubQueryResponseImpl.XdtAsyncGetCreatorInspirationHub.SectionContent) ((N4R) obj).A00;
            if (sectionContent == null || (A0E = sectionContent.A0E()) == null || (A032 = A0E.A03(GetCreatorInspirationHubQueryResponseImpl.XdtAsyncGetCreatorInspirationHub.SectionContent.Data.ClipsSectionContentData.class, "clips_section_content_data", -2052938767)) == null || (requiredCompactedTreeListField = A032.getRequiredCompactedTreeListField(0, "clips_items", GetCreatorInspirationHubQueryResponseImpl.XdtAsyncGetCreatorInspirationHub.SectionContent.Data.ClipsSectionContentData.ClipsItems.class, 1639908408)) == null) {
                arrayList = 0sn.A00;
            } else {
                arrayList = AnonymousClass7TG.A0r(requiredCompactedTreeListField);
                Iterator it = requiredCompactedTreeListField.iterator();
                while (it.hasNext()) {
                    A02(this, arrayList, it);
                }
            }
            if (!(!arrayList.isEmpty())) {
                return new C60347Jjs((Object) null, (Object) null, arrayList, 0, 3);
            }
            C229352nF r3 = this.A01;
            C276114sa r4 = null;
            if (r3 != null) {
                if (sectionContent != null) {
                    TreeJNI treeValue = sectionContent.getTreeValue("paging_info", AnonymousClass6A1.class);
                    0qQ.A0C(treeValue, "null cannot be cast to non-null type com.instagram.api.schemas.PagingInfo");
                    r4 = (C276114sa) treeValue;
                }
                r3.A03(r4, C294895nD.DEFAULT, str, arrayList, true, false);
            }
            return new C60347Jjs(A01(sectionContent), arrayList);
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final /* bridge */ /* synthetic */ Object A05(C63967LFt lFt) {
        return null;
    }
}
