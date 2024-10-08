package X;

import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: X.UlC  reason: case insensitive filesystem */
public final class C15942UlC extends WW4 {
    public final int A00;
    public final Object A01;

    public C15942UlC(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(Bundle bundle, HAI hai, 1Xj r4, C46424Del del) {
        del.A09(new ArrayList(HAI.A00(hai.A00, hai).A05()));
        del.A08 = r4.getId();
        del.A01 = bundle;
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [X.VVd, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v6, types: [X.VVd, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v13, types: [X.VVd, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x05b8, code lost:
        r2.A08();
        r2.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x05be, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x05bf, code lost:
        r16 = "scrollableNavigationHelper";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        X.0qQ.A0F(r16);
     */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x059d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DJt(android.view.View r41, X.C296995qz r42, X.C296935qt r43, X.1Xj r44) {
        /*
            r40 = this;
            r6 = r40
            int r0 = r6.A00
            r5 = r42
            r4 = r43
            r1 = r44
            switch(r0) {
                case 0: goto L_0x05cd;
                case 1: goto L_0x0400;
                case 2: goto L_0x0291;
                case 3: goto L_0x00cc;
                case 4: goto L_0x0397;
                default: goto L_0x000d;
            }
        L_0x000d:
            java.lang.Object r5 = r6.A01
            X.H0k r5 = (X.C54140H0k) r5
            if (r44 == 0) goto L_0x06e4
            java.lang.String r17 = r1.getId()
            if (r17 == 0) goto L_0x06e4
            X.HOV r4 = r5.A00
            r15 = 0
            if (r4 != 0) goto L_0x0028
            java.lang.String r16 = "entrySurface"
        L_0x0020:
            X.0qQ.A0F(r16)
        L_0x0023:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0028:
            X.0eM r1 = r5.A08
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r1)
            X.1Xj r0 = r5.A02
            java.lang.String r16 = "entryMedia"
            if (r0 == 0) goto L_0x0020
            r2 = 1
            X.0qQ.A0B(r3, r2)
            java.lang.Integer r8 = X.AnonymousClass05K.A00
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>()
            r9 = r17
            r6 = r3
            r7 = r0
            X.C55209Hdz.A00(r4, r5, r6, r7, r8, r9, r10)
            X.0eM r0 = r5.A07
            java.lang.Object r0 = r0.getValue()
            X.Ghd r0 = (X.C53045Ghd) r0
            X.0Ud r0 = r0.A03
            java.lang.Object r0 = r0.getValue()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r0.iterator()
        L_0x005f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x006f
            java.lang.String r0 = X.C51971G9r.A0v(r3)
            if (r0 == 0) goto L_0x005f
            r4.add(r0)
            goto L_0x005f
        L_0x006f:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r4)
            r0 = 4415(0x113f, float:6.187E-42)
            java.lang.String r18 = X.AnonymousClass000.A00(r0)
            r25 = 0
            r8 = 0
            X.1Xj r0 = r5.A02
            if (r0 == 0) goto L_0x0020
            X.1Xy r0 = r0.A0C
            X.JSO r0 = r0.CGF()
            if (r0 == 0) goto L_0x008d
            java.lang.String r15 = r0.getIconicHorizonWorldName()
        L_0x008d:
            java.lang.String r14 = "Static"
            java.lang.String r0 = r5.A05
            r9 = r8
            r10 = r8
            r11 = r8
            r12 = r8
            r13 = r8
            r16 = r8
            r19 = r0
            r20 = r8
            r21 = r8
            r22 = r8
            r23 = r8
            r24 = r3
            r26 = r25
            r27 = r25
            r28 = r25
            r29 = r25
            r30 = r25
            r31 = r25
            r32 = r25
            r33 = r2
            android.os.Bundle r4 = X.C46424Del.A01(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            X.0lg r3 = X.DbT.A0X(r1)
            java.lang.Class<com.instagram.modal.ModalActivity> r2 = com.instagram.modal.ModalActivity.class
            androidx.fragment.app.FragmentActivity r1 = r5.requireActivity()
            java.lang.String r0 = "contextual_feed"
            X.6W8 r0 = X.DbV.A0Y(r1, r4, r3, r2, r0)
            X.DbT.A1L(r5, r0)
            return
        L_0x00cc:
            X.DbY.A1S(r4, r5)
            java.lang.Object r0 = r6.A01
            X.UZq r0 = (X.C15286UZq) r0
            X.0hq r2 = r0.mFragmentManager
            boolean r2 = X.AnonymousClass06S.A01(r2)
            if (r2 == 0) goto L_0x06e4
            if (r44 == 0) goto L_0x06e4
            r0.A0A(r5, r4, r1)
            boolean r2 = X.C13989Tnp.A1Y(r0)
            if (r2 == 0) goto L_0x00f2
            X.UZa r2 = r0.A06()
            X.2js r3 = r2.A01()
            r2 = 1
            X.C227762js.A01(r3, r2)
        L_0x00f2:
            com.instagram.model.keyword.Keyword r9 = X.C18243VoA.A00(r4)
            if (r9 == 0) goto L_0x0126
            androidx.fragment.app.FragmentActivity r4 = r0.requireActivity()
            X.0eM r3 = r0.A0m
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r3)
            java.lang.String r11 = r0.getModuleName()
            java.lang.String r10 = X.AnonymousClass7TG.A0j()
            java.lang.String r2 = r1.getId()
            if (r2 == 0) goto L_0x05c3
            java.util.List r14 = X.AnonymousClass7TE.A1I(r2)
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r3)
            boolean r15 = X.C55141Hcp.A00(r2)
            r6 = 0
            java.lang.String r12 = ""
            r7 = r0
            r8 = r1
            r13 = r6
            X.C18243VoA.A01(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        L_0x0126:
            r8 = 0
            r0.A07()
            java.lang.String r11 = X.C13988Tno.A0X(r0)
            java.lang.String r12 = X.C13988Tno.A0a(r0)
            java.lang.String r13 = X.C13988Tno.A0Z(r0)
            java.lang.String r14 = r0.A08()
            java.lang.String r15 = r0.A09()
            java.lang.String r16 = X.C13988Tno.A0X(r0)
            com.instagram.search.surface.fragment.contextualfeed.SerpContextualFeedConfig r10 = new com.instagram.search.surface.fragment.contextualfeed.SerpContextualFeedConfig
            r10.<init>(r11, r12, r13, r14, r15, r16)
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            java.lang.String r2 = "contextual_feed_config"
            r9.putParcelable(r2, r10)
            X.MuC r2 = r0.A07()
            X.2Fk r2 = r2.A05
            java.lang.Object r2 = r2.A02()
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x01a9
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r2.iterator()
        L_0x0168:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x01ac
            java.lang.Object r5 = r6.next()
            boolean r4 = r1.CcK()
            java.lang.String r3 = r1.getId()
            if (r3 == 0) goto L_0x05c8
            boolean r2 = r5 instanceof X.C296985qy
            if (r2 == 0) goto L_0x0190
            X.5qy r5 = (X.C296985qy) r5
            X.1Xj r2 = r5.A01
            if (r2 == 0) goto L_0x0168
            java.lang.String r3 = r2.getId()
            if (r3 == 0) goto L_0x0168
        L_0x018c:
            r7.add(r3)
            goto L_0x0168
        L_0x0190:
            if (r4 == 0) goto L_0x0168
            boolean r2 = r5 instanceof X.C52435GSn
            if (r2 == 0) goto L_0x0168
            X.GSn r5 = (X.C52435GSn) r5
            X.1Xj r2 = r5.BPf()
            if (r2 == 0) goto L_0x0168
            java.lang.String r2 = r2.getId()
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0168
            goto L_0x018c
        L_0x01a9:
            r7 = 0
            r6 = -1
            goto L_0x01b4
        L_0x01ac:
            java.lang.String r2 = r1.getId()
            int r6 = r7.indexOf(r2)
        L_0x01b4:
            androidx.fragment.app.FragmentActivity r5 = r0.requireActivity()
            X.0eM r4 = r0.A0m
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r4)
            X.6Yo r2 = new X.6Yo
            r2.<init>(r5, r3)
            r3 = 149(0x95, float:2.09E-43)
            java.lang.String r18 = X.AnonymousClass000.A00(r3)
            r29 = 0
            r30 = 1
            java.lang.String r14 = "Serp"
            java.util.ArrayList r3 = new java.util.ArrayList
            if (r7 != 0) goto L_0x028c
            r3.<init>()
        L_0x01d6:
            java.lang.String r17 = r1.getId()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r6)
            java.lang.String r26 = X.C13988Tno.A0Z(r0)
            X.0jB r1 = new X.0jB
            r1.<init>()
            X.0j9 r6 = X.C297705sC.A03
            X.UZa r5 = r0.A06()
            java.lang.String r5 = r5.A0E
            r1.A04(r6, r5)
            X.0j9 r6 = X.C297705sC.A04
            java.lang.String r5 = X.C13988Tno.A0X(r0)
            r1.A04(r6, r5)
            X.0j9 r6 = X.C297695sB.A01
            java.lang.String r5 = X.C13988Tno.A0Y(r0)
            r1.A04(r6, r5)
            X.0j9 r6 = X.C297695sB.A02
            java.lang.String r5 = X.C13988Tno.A0Z(r0)
            r1.A04(r6, r5)
            java.lang.String r6 = X.C13988Tno.A0a(r0)
            java.lang.String r5 = "search_session_id"
            r1.A0A(r5, r6)
            X.0j9 r6 = X.C297695sB.A00
            java.lang.String r5 = X.C13988Tno.A0X(r0)
            r1.A04(r6, r5)
            X.0j9 r5 = X.C297695sB.A03
            android.os.Bundle r6 = r0.requireArguments()
            java.lang.String r0 = "HashtagFeedFragment.ARGUMENT_ENTRY_TRIGGER"
            java.lang.String r0 = r6.getString(r0)
            r1.A04(r5, r0)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            X.6zg r0 = X.C324636ze.A00(r0)
            r0.A00(r1)
            X.0jB r10 = new X.0jB
            r10.<init>()
            r10.A06(r1)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            X.6zg r0 = X.C324636ze.A00(r0)
            com.instagram.search.common.analytics.SearchContext r12 = r0.A00
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            boolean r0 = X.C55141Hcp.A00(r0)
            r39 = r0 ^ 1
            instagram.features.feed.fragment.ContextualFeedFragment r1 = new instagram.features.feed.fragment.ContextualFeedFragment
            r1.<init>()
            r11 = r8
            r15 = r8
            r16 = r8
            r19 = r8
            r20 = r8
            r21 = r8
            r22 = r8
            r23 = r8
            r24 = r8
            r25 = r8
            r27 = r8
            r28 = r3
            r31 = r29
            r32 = r29
            r33 = r29
            r34 = r29
            r35 = r29
            r36 = r29
            r37 = r29
            r38 = r30
            android.os.Bundle r0 = X.C46424Del.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            r1.setArguments(r0)
            r2.A0B(r8, r1)
            goto L_0x05b8
        L_0x028c:
            r3.<init>(r7)
            goto L_0x01d6
        L_0x0291:
            java.lang.Object r4 = r6.A01
            X.Ub9 r4 = (X.C15357Ub9) r4
            X.0hq r0 = r4.mFragmentManager
            boolean r0 = X.AnonymousClass06S.A01(r0)
            if (r0 == 0) goto L_0x06e4
            X.VhB r3 = r4.A0C
            int r2 = r5.A01
            int r0 = r5.A00
            r3.A00(r1, r2, r0)
            X.2js r0 = r4.A01
            r6 = 1
            X.C227762js.A01(r0, r6)
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            X.HAI r0 = r4.A08
            X.Uz8 r2 = r0.A00
            r10 = 0
            X.VVd r3 = new X.VVd
            r3.<init>()
            X.VvE r0 = r4.A0E
            X.Vbo r0 = X.C18621VvE.A00(r0, r2)
            X.6z9 r0 = r0.A04
            X.6zA r0 = r0.A03
            java.lang.String r0 = r0.A07
            r3.A00 = r0
            X.VvE r0 = r4.A0E
            X.Vbo r0 = X.C18621VvE.A00(r0, r2)
            X.VW4 r0 = r0.A00
            if (r0 == 0) goto L_0x0394
            java.util.List r0 = r0.A01
        L_0x02d5:
            r3.A02 = r0
            X.VvE r0 = r4.A0E
            X.Vbo r0 = X.C18621VvE.A00(r0, r2)
            X.VW4 r0 = r0.A00
            if (r0 == 0) goto L_0x0391
            java.lang.String r0 = r0.A00
        L_0x02e3:
            r3.A01 = r0
            com.instagram.discovery.api.model.SectionPagination r8 = new com.instagram.discovery.api.model.SectionPagination
            r8.<init>(r3)
            X.HAI r0 = r4.A08
            X.Uz8 r3 = r0.A00
            X.VgA r0 = r0.A01
            int r13 = r0.A00(r3)
            X.VW5 r0 = r4.A0G
            X.Ub9 r0 = r0.A02
            com.instagram.model.venue.Venue r0 = r0.A0H
            if (r0 == 0) goto L_0x038e
            com.instagram.model.venue.LocationDictIntf r0 = r0.A00
            java.lang.String r11 = r0.getName()
        L_0x0302:
            X.HAI r0 = r4.A08
            X.Uz8 r0 = r0.A00
            int r3 = r0.ordinal()
            if (r3 == r6) goto L_0x038a
            r0 = 3
            if (r3 == r0) goto L_0x0386
            r0 = 0
            if (r3 == r0) goto L_0x0384
            r3 = 0
        L_0x0313:
            android.content.Context r0 = r4.requireContext()
            java.lang.String r12 = r0.getString(r3)
        L_0x031b:
            r14 = 10
            r15 = 1
            com.instagram.discovery.contextualfeed.model.EntityContextualFeedConfig r7 = new com.instagram.discovery.contextualfeed.model.EntityContextualFeedConfig
            r9 = r2
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.String r6 = r4.A0J
            java.lang.String r3 = r4.A0I
            X.VvE r0 = r4.A0E
            X.Vbo r0 = X.C18621VvE.A00(r0, r2)
            java.lang.String r0 = r0.A01
            com.instagram.location.contextualfeed.intf.LocationContextualFeedConfig r2 = new com.instagram.location.contextualfeed.intf.LocationContextualFeedConfig
            r2.<init>(r7, r3, r0, r6)
            java.lang.String r0 = "contextual_feed_config"
            r5.putParcelable(r0, r2)
            com.instagram.model.venue.Venue r0 = r4.A0H
            X.0jB r6 = X.C18217Vnh.A01(r0)
            com.instagram.common.session.UserSession r0 = r4.A02
            X.6zg r0 = X.C324636ze.A00(r0)
            r0.A00(r6)
            androidx.fragment.app.FragmentActivity r3 = r4.requireActivity()
            com.instagram.common.session.UserSession r0 = r4.A02
            X.6Yo r2 = new X.6Yo
            r2.<init>(r3, r0)
            java.lang.String r0 = "feed_contextual_location"
            X.Del r3 = X.C49262Es5.A00(r0)
            java.lang.String r0 = "Location"
            r3.A06 = r0
            X.HAI r0 = r4.A08
            A00(r5, r0, r1, r3)
            java.lang.String r0 = r4.A0I
            r3.A0A = r0
            X.0jB r0 = new X.0jB
            r0.<init>()
            r0.A06(r6)
            r3.A02 = r0
            com.instagram.common.session.UserSession r0 = r4.A02
            X.6zg r0 = X.C324636ze.A00(r0)
            com.instagram.search.common.analytics.SearchContext r0 = r0.A00
            r3.A04 = r0
            instagram.features.feed.fragment.ContextualFeedFragment r0 = r3.A07()
            r2.A0E(r0)
            goto L_0x05b8
        L_0x0384:
            r12 = 0
            goto L_0x031b
        L_0x0386:
            r3 = 2131966742(0x7f133b16, float:1.957033E38)
            goto L_0x0313
        L_0x038a:
            r3 = 2131975493(0x7f135d45, float:1.958808E38)
            goto L_0x0313
        L_0x038e:
            r11 = 0
            goto L_0x0302
        L_0x0391:
            r0 = 0
            goto L_0x02e3
        L_0x0394:
            r0 = 0
            goto L_0x02d5
        L_0x0397:
            X.DbY.A1S(r4, r5)
            if (r44 == 0) goto L_0x03a3
            java.lang.Object r0 = r6.A01
            X.UbA r0 = (X.C15358UbA) r0
            X.C15358UbA.A01(r5, r4, r1, r0)
        L_0x03a3:
            X.5ov r0 = r4.A03
            if (r0 == 0) goto L_0x03de
            java.lang.Object r3 = r6.A01
            X.UbA r3 = (X.C15358UbA) r3
            X.0qQ.A0A(r1)
            com.instagram.model.keyword.Keyword r2 = X.C18243VoA.A00(r4)
            if (r2 == 0) goto L_0x03dc
            java.util.List r0 = X.AnonymousClass7TE.A1I(r1)
            X.C15358UbA.A02(r1, r2, r3, r0)
            r0 = 1
        L_0x03bc:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x03c0:
            r2 = 1
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r2)
            if (r0 != 0) goto L_0x06e4
            if (r44 == 0) goto L_0x06e4
            java.lang.Object r10 = r6.A01
            X.UbA r10 = (X.C15358UbA) r10
            X.2js r0 = r10.A00
            if (r0 == 0) goto L_0x05bf
            X.C227762js.A01(r0, r2)
            com.instagram.model.keyword.Keyword r6 = r10.A08
            if (r6 != 0) goto L_0x03e0
            java.lang.String r16 = "surfaceKeyword"
            goto L_0x0020
        L_0x03dc:
            r0 = 0
            goto L_0x03bc
        L_0x03de:
            r0 = 0
            goto L_0x03c0
        L_0x03e0:
            java.lang.String r5 = r10.A0C
            if (r5 != 0) goto L_0x03e8
            java.lang.String r16 = "keywordSessionId"
            goto L_0x0020
        L_0x03e8:
            X.Vhq r0 = r10.A0A
            if (r0 != 0) goto L_0x03f0
            java.lang.String r16 = "requestController"
            goto L_0x0020
        L_0x03f0:
            X.6z9 r0 = r0.A00
            X.6zA r0 = r0.A03
            java.lang.String r4 = r0.A07
            java.lang.String r3 = r10.A0E
            X.GWW r0 = r10.A04
            if (r0 != 0) goto L_0x06be
            java.lang.String r16 = "dataSource"
            goto L_0x0020
        L_0x0400:
            r0 = 2
            X.0qQ.A0B(r5, r0)
            if (r44 == 0) goto L_0x06e4
            java.lang.Object r9 = r6.A01
            X.Ube r9 = (X.C15381Ube) r9
            int r3 = r5.A01
            int r2 = r5.A00
            X.0hq r0 = r9.getParentFragmentManager()
            boolean r0 = X.AnonymousClass06S.A01(r0)
            if (r0 == 0) goto L_0x06e4
            X.VZZ r4 = r9.A0D
            if (r4 != 0) goto L_0x0420
            java.lang.String r16 = "gridAnalyticsDelegate"
            goto L_0x0020
        L_0x0420:
            X.0iw r10 = r4.A01
            X.0xF r11 = r4.A00
            java.lang.String r0 = r4.A04
            r15 = r2
            r12 = r1
            r13 = r0
            r14 = r3
            X.0xI r3 = X.VBN.A00(r10, r11, r12, r13, r14, r15)
            X.X6c r0 = r4.A03
            X.Uz8 r2 = r0.C3h()
            int r0 = r0.C3k()
            X.C18766W0k.A02(r3, r2, r0)
            com.instagram.common.session.UserSession r0 = r4.A02
            X.DbU.A1R(r3, r0)
            X.2js r0 = r9.A01
            if (r0 == 0) goto L_0x05bf
            r3 = 1
            X.C227762js.A01(r0, r3)
            X.HAI r2 = r9.A08
            java.lang.String r16 = "dataSource"
            r11 = 0
            if (r2 == 0) goto L_0x0020
            X.Uz8 r0 = r2.A00
            X.GWV r0 = X.HAI.A00(r0, r2)
            java.util.List r0 = r0.A02
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r4 = r0.iterator()
        L_0x0460:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0478
            java.lang.Object r2 = r4.next()
            boolean r0 = r2 instanceof X.C296985qy
            if (r0 == 0) goto L_0x0460
            X.5qy r2 = (X.C296985qy) r2
            X.1Xj r0 = r2.A01
            if (r0 == 0) goto L_0x0460
            r6.add(r0)
            goto L_0x0460
        L_0x0478:
            X.0eM r0 = r9.A0i
            r26 = r0
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r26)
            r4 = 0
            X.0qQ.A0B(r5, r4)
            java.lang.Class<X.VO6> r2 = X.VO6.class
            X.Wwi r0 = X.C20650Wwi.A00
            java.lang.Object r0 = r5.A01(r2, r0)
            X.VO6 r0 = (X.VO6) r0
            java.lang.String r10 = r9.A0g
            X.0qQ.A0B(r10, r4)
            java.util.Map r0 = r0.A00
            r0.put(r10, r6)
            X.0jB r0 = r9.E4k()
            X.To7 r8 = r9.A0Z
            r8.A02(r0)
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            X.Vt4 r0 = X.C15381Ube.A01(r9)
            com.instagram.model.hashtag.Hashtag r12 = r0.A01
            X.VVd r4 = new X.VVd
            r4.<init>()
            X.VuR r0 = r9.A0I
            java.lang.String r5 = "feedRequestController"
            if (r0 == 0) goto L_0x0508
            X.6z9 r0 = X.C18459Vs8.A00(r0)
            X.6zA r0 = r0.A03
            java.lang.String r0 = r0.A07
            r4.A00 = r0
            X.VuR r2 = r9.A0I
            if (r2 == 0) goto L_0x0508
            X.Uz8 r0 = r2.A00
            X.Vs8 r0 = X.C18575VuR.A00(r0, r2)
            java.util.List r0 = r0.A01
            r4.A02 = r0
            X.VuR r2 = r9.A0I
            if (r2 == 0) goto L_0x0508
            X.Uz8 r0 = r2.A00
            X.Vs8 r0 = X.C18575VuR.A00(r0, r2)
            java.lang.String r0 = r0.A00
            r4.A01 = r0
            com.instagram.discovery.api.model.SectionPagination r6 = new com.instagram.discovery.api.model.SectionPagination
            r6.<init>(r4)
            X.HAI r0 = r9.A08
            if (r0 == 0) goto L_0x0020
            X.Uz8 r15 = r0.A00
            java.lang.String r2 = r9.A0O
            java.util.Map r0 = X.C16672Uz8.A01
            java.lang.Object r5 = r0.get(r2)
            X.Uz8 r5 = (X.C16672Uz8) r5
            if (r5 != 0) goto L_0x04f6
            X.Uz8 r5 = X.C16672Uz8.UNSPECIFIED
        L_0x04f6:
            X.HAI r0 = r9.A08
            if (r0 == 0) goto L_0x0020
            X.Uz8 r2 = r0.A00
            X.VgA r0 = r0.A01
            int r23 = r0.A00(r2)
            java.lang.String r4 = r9.A0N
            if (r4 != 0) goto L_0x050d
            java.lang.String r5 = "_actionBarTitle"
        L_0x0508:
            X.0qQ.A0F(r5)
            goto L_0x0023
        L_0x050d:
            X.HAI r0 = r9.A08
            if (r0 == 0) goto L_0x0020
            X.Uz8 r14 = r0.A00
            X.0qQ.A07(r14)
            int r2 = r14.ordinal()
            if (r2 == r3) goto L_0x0558
            r0 = 3
            if (r2 == r0) goto L_0x0554
            r0 = 4
            if (r2 == r0) goto L_0x055c
            X.HAI r0 = r9.A08
            if (r0 == 0) goto L_0x0020
            X.VgA r0 = r0.A01
            java.util.List r13 = r0.A01
            int r3 = r13.size()
            r2 = 0
        L_0x052f:
            if (r2 >= r3) goto L_0x0552
            java.lang.Object r0 = r13.get(r2)
            X.VsV r0 = (X.C18479VsV) r0
            X.Uz8 r0 = r0.A00
            if (r0 == 0) goto L_0x054e
            if (r0 != r14) goto L_0x054b
            java.lang.Object r0 = r13.get(r2)
            X.VsV r0 = (X.C18479VsV) r0
            java.lang.String r2 = r0.A02
            if (r2 != 0) goto L_0x0563
            java.lang.String r16 = "title"
            goto L_0x0020
        L_0x054b:
            int r2 = r2 + 1
            goto L_0x052f
        L_0x054e:
            java.lang.String r16 = "type"
            goto L_0x0020
        L_0x0552:
            r2 = 0
            goto L_0x0563
        L_0x0554:
            r0 = 2131966742(0x7f133b16, float:1.957033E38)
            goto L_0x055f
        L_0x0558:
            r0 = 2131975493(0x7f135d45, float:1.958808E38)
            goto L_0x055f
        L_0x055c:
            r0 = 2131955518(0x7f130f3e, float:1.9547566E38)
        L_0x055f:
            java.lang.String r2 = r9.getString(r0)
        L_0x0563:
            r24 = 10
            r25 = 1
            com.instagram.discovery.contextualfeed.model.EntityContextualFeedConfig r0 = new com.instagram.discovery.contextualfeed.model.EntityContextualFeedConfig
            r19 = r15
            r20 = r5
            r21 = r4
            r22 = r2
            r17 = r0
            r18 = r6
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)
            com.instagram.hashtag.contextualfeed.intf.HashtagContextualFeedConfig r2 = new com.instagram.hashtag.contextualfeed.intf.HashtagContextualFeedConfig
            r2.<init>(r0, r12, r10, r11)
            java.lang.String r0 = "contextual_feed_config"
            r7.putParcelable(r0, r2)
            androidx.fragment.app.FragmentActivity r3 = r9.requireActivity()
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r26)
            X.6Yo r2 = new X.6Yo
            r2.<init>(r3, r0)
            java.lang.String r0 = "feed_contextual_hashtag"
            X.Del r3 = X.C49262Es5.A00(r0)
            java.lang.String r0 = "Hashtag"
            r3.A06 = r0
            X.HAI r0 = r9.A08
            if (r0 == 0) goto L_0x0020
            A00(r7, r0, r1, r3)
            r3.A08(r8)
            r3.A0A = r10
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r26)
            X.6zg r0 = X.C324636ze.A00(r0)
            com.instagram.search.common.analytics.SearchContext r0 = r0.A00
            r3.A04 = r0
            instagram.features.feed.fragment.ContextualFeedFragment r0 = r3.A07()
            r2.A0B(r11, r0)
        L_0x05b8:
            r2.A08()
            r2.A04()
            return
        L_0x05bf:
            java.lang.String r16 = "scrollableNavigationHelper"
            goto L_0x0020
        L_0x05c3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x05c8:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x05cd:
            if (r44 == 0) goto L_0x06e4
            java.lang.Object r4 = r6.A01
            X.Ugy r4 = (X.C15693Ugy) r4
            com.instagram.discovery.mediamap.fragment.LocationDetailFragment r0 = r4.A0J
            java.lang.String r6 = r1.A2n()
            X.W3Q r2 = X.Dba.A0F(r0)
            com.instagram.discovery.mediamap.model.MediaMapPin r5 = r0.A03
            com.instagram.discovery.mediamap.intf.MediaMapQuery r3 = r0.A02
            java.lang.String r0 = "instagram_map_location_detail_tap_feed_media"
            X.1Ln r2 = X.W3Q.A01(r2, r0)
            X.C13990Tnq.A12(r2, r3)
            X.W3Q.A05(r2, r5)
            java.lang.String r0 = "media_id"
            r2.A0R(r0, r6)
            r2.Cgf()
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            X.HAI r0 = r4.A05
            X.Uz8 r2 = r0.A00
            r10 = 0
            X.VVd r5 = new X.VVd
            r5.<init>()
            X.VvE r0 = r4.A09
            X.Vbo r0 = X.C18621VvE.A00(r0, r2)
            X.6z9 r0 = r0.A04
            X.6zA r0 = r0.A03
            java.lang.String r0 = r0.A07
            r5.A00 = r0
            X.VvE r0 = r4.A09
            X.Vbo r0 = X.C18621VvE.A00(r0, r2)
            X.VW4 r0 = r0.A00
            if (r0 == 0) goto L_0x06bb
            java.util.List r0 = r0.A01
        L_0x061e:
            r5.A02 = r0
            X.VvE r0 = r4.A09
            X.Vbo r0 = X.C18621VvE.A00(r0, r2)
            X.VW4 r0 = r0.A00
            if (r0 == 0) goto L_0x06b8
            java.lang.String r0 = r0.A00
        L_0x062c:
            r5.A01 = r0
            com.instagram.discovery.api.model.SectionPagination r8 = new com.instagram.discovery.api.model.SectionPagination
            r8.<init>(r5)
            X.HAI r0 = r4.A05
            X.Uz8 r5 = r0.A00
            X.VgA r0 = r0.A01
            int r13 = r0.A00(r5)
            com.instagram.discovery.mediamap.model.MediaMapPin r0 = r4.A02
            com.instagram.model.venue.LocationDict r0 = r0.A09
            com.instagram.model.venue.Venue r0 = X.C18231Vnv.A00(r0)
            com.instagram.model.venue.LocationDictIntf r0 = r0.A00
            java.lang.String r11 = r0.getName()
            X.HAI r0 = r4.A05
            X.Uz8 r0 = r0.A00
            int r5 = r0.ordinal()
            r0 = 1
            if (r5 == r0) goto L_0x06a6
            r0 = 3
            if (r5 == r0) goto L_0x06a2
            r0 = 6
            if (r5 == r0) goto L_0x06aa
            r0 = 0
            if (r5 != r0) goto L_0x06a6
            r12 = 0
        L_0x0660:
            r14 = 10
            r15 = 1
            com.instagram.discovery.contextualfeed.model.EntityContextualFeedConfig r7 = new com.instagram.discovery.contextualfeed.model.EntityContextualFeedConfig
            r9 = r2
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            com.instagram.discovery.mediamap.model.MediaMapPin r0 = r4.A02
            java.lang.String r6 = X.C18231Vnv.A01(r0)
            java.lang.String r5 = r4.A0K
            X.VvE r0 = r4.A09
            X.Vbo r0 = X.C18621VvE.A00(r0, r2)
            java.lang.String r0 = r0.A01
            com.instagram.location.contextualfeed.intf.LocationContextualFeedConfig r2 = new com.instagram.location.contextualfeed.intf.LocationContextualFeedConfig
            r2.<init>(r7, r5, r0, r6)
            java.lang.String r0 = "contextual_feed_config"
            r3.putParcelable(r0, r2)
            java.lang.String r0 = "feed_contextual_map"
            X.Del r2 = X.C49262Es5.A00(r0)
            java.lang.String r0 = "Location"
            r2.A06 = r0
            X.HAI r0 = r4.A05
            A00(r3, r0, r1, r2)
            r2.A0A = r5
            android.os.Bundle r3 = r2.A06()
            com.instagram.common.session.UserSession r2 = r4.A0I
            androidx.fragment.app.FragmentActivity r1 = r4.A0G
            java.lang.String r0 = "contextual_feed"
            X.DbY.A0u(r1, r3, r2, r0)
            return
        L_0x06a2:
            r5 = 2131966742(0x7f133b16, float:1.957033E38)
            goto L_0x06ad
        L_0x06a6:
            r5 = 2131975493(0x7f135d45, float:1.958808E38)
            goto L_0x06ad
        L_0x06aa:
            r5 = 2131952100(0x7f1301e4, float:1.9540633E38)
        L_0x06ad:
            X.4DH r0 = r4.A0H
            android.content.Context r0 = r0.requireContext()
            java.lang.String r12 = r0.getString(r5)
            goto L_0x0660
        L_0x06b8:
            r0 = 0
            goto L_0x062c
        L_0x06bb:
            r0 = 0
            goto L_0x061e
        L_0x06be:
            X.GWV r0 = r0.A01
            java.util.ArrayList r17 = r0.A05()
            androidx.fragment.app.FragmentActivity r7 = r10.requireActivity()
            X.0eM r0 = r10.A0N
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r0)
            X.To7 r9 = r10.A0K
            java.lang.String r2 = r10.A0D
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            boolean r18 = X.C55141Hcp.A00(r0)
            r14 = r2
            r15 = r4
            r16 = r3
            r11 = r1
            r12 = r6
            r13 = r5
            X.C18243VoA.A01(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
        L_0x06e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15942UlC.DJt(android.view.View, X.5qz, X.5qt, X.1Xj):void");
    }
}
