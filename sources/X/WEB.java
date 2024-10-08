package X;

public final class WEB implements AnonymousClass2gO {
    public final int A00;
    public final Object A01;

    public WEB(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: X.Uin} */
    /* JADX WARNING: type inference failed for: r7v4, types: [X.6Ye, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v13, types: [X.2tL] */
    /* JADX WARNING: type inference failed for: r6v18, types: [X.2tL, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onChanged(java.lang.Object r21) {
        /*
            r20 = this;
            r5 = r20
            r3 = r21
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x015e;
                case 1: goto L_0x0114;
                case 2: goto L_0x04ca;
                case 3: goto L_0x03e5;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.GnE r3 = (X.C53382GnE) r3
            java.lang.Object r0 = r5.A01
            X.Uai r0 = (X.C15333Uai) r0
            X.0eM r0 = r0.A08
            java.lang.Object r2 = r0.getValue()
            X.VTW r2 = (X.VTW) r2
            X.0qQ.A0A(r3)
            r5 = 0
            X.0qQ.A0B(r3, r5)
            com.instagram.common.recyclerview.ViewModelListUpdate r1 = new com.instagram.common.recyclerview.ViewModelListUpdate
            r1.<init>()
            java.lang.String r0 = r3.A03
            int r9 = r0.length()
            r8 = 0
            r4 = 1
            if (r9 != 0) goto L_0x0069
            X.Uio r6 = new X.Uio
            r6.<init>()
            r1.A00(r6)
            java.lang.String r7 = "learn_more_section_divider_key"
            X.WRt r6 = new X.WRt
            r6.<init>(r7)
            r1.A00(r6)
            android.content.Context r7 = r2.A00
            r6 = 2131971361(0x7f134d21, float:1.95797E38)
            java.lang.String r15 = X.AnonymousClass7TE.A16(r7, r6)
            r11 = 0
            java.lang.Object[] r7 = new java.lang.Object[]{r15, r11, r11}
            java.lang.String r6 = "%s_%s_%s:"
            java.lang.String r14 = X.0mp.A06(r6, r7)
            X.UNy r10 = new X.UNy
            r12 = r11
            r13 = r11
            r16 = r11
            r17 = r11
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            r1.A00(r10)
            X.Uim r6 = new X.Uim
            r6.<init>()
            r1.A00(r6)
        L_0x0069:
            boolean r6 = r3.A06
            if (r6 == 0) goto L_0x007b
            X.Uin r3 = new X.Uin
            r3.<init>(r0)
        L_0x0072:
            r1.A00(r3)
        L_0x0075:
            X.2t9 r0 = r2.A01
            r0.A05(r1)
        L_0x007a:
            return
        L_0x007b:
            if (r9 != 0) goto L_0x007e
            r8 = 1
        L_0x007e:
            r7 = 0
            if (r8 != 0) goto L_0x009c
            java.lang.Object r6 = r3.A02
            java.util.List r6 = (java.util.List) r6
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x009c
            android.content.Context r8 = r2.A00
            r6 = 2131969812(0x7f134714, float:1.9576557E38)
            java.lang.String r8 = X.AnonymousClass7TE.A16(r8, r6)
            X.Uiq r6 = new X.Uiq
            r6.<init>(r8, r7)
            r1.A00(r6)
        L_0x009c:
            java.lang.Object r6 = r3.A02
            java.util.List r6 = (java.util.List) r6
            java.util.Iterator r11 = r6.iterator()
        L_0x00a4:
            boolean r6 = r11.hasNext()
            if (r6 == 0) goto L_0x0109
            java.lang.Object r6 = r11.next()
            X.VkR r6 = (X.C18043VkR) r6
            r13 = 2131973730(0x7f135662, float:1.9584504E38)
            r14 = 2131973731(0x7f135663, float:1.9584506E38)
            r15 = 2131973733(0x7f135665, float:1.958451E38)
            r16 = 2131973735(0x7f135667, float:1.9584514E38)
            r17 = 2131973736(0x7f135668, float:1.9584516E38)
            r18 = 2131973734(0x7f135666, float:1.9584512E38)
            X.Glc r12 = new X.Glc
            r19 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r9 = r3.A01
            java.util.Set r9 = (java.util.Set) r9
            java.lang.String r8 = r6.A01()
            boolean r10 = r9.contains(r8)
            r8 = 4
            X.JZA r9 = new X.JZA
            r9.<init>((java.lang.String) r7, (boolean) r10, (boolean) r4, (int) r8)
            java.lang.String r10 = r6.A02()
            java.lang.String r8 = "product_item_list_item"
            boolean r8 = X.0qQ.A0K(r10, r8)
            if (r8 == 0) goto L_0x00f8
            X.WSY r13 = new X.WSY
            r14 = r12
            r15 = r9
            r16 = r6
            r17 = r0
            r18 = r5
            r13.<init>(r14, r15, r16, r17, r18)
            r1.A00(r13)
            goto L_0x00a4
        L_0x00f8:
            java.lang.String r8 = "product_group_list_item"
            boolean r8 = X.0qQ.A0K(r10, r8)
            if (r8 == 0) goto L_0x00a4
            X.WSS r8 = new X.WSS
            r8.<init>(r12, r9, r6, r0)
            r1.A00(r8)
            goto L_0x00a4
        L_0x0109:
            boolean r0 = r3.A04
            if (r0 == 0) goto L_0x0075
            X.Uil r3 = new X.Uil
            r3.<init>()
            goto L_0x0072
        L_0x0114:
            X.JwH r3 = (X.C61079JwH) r3
            r4 = 0
            X.0qQ.A0B(r3, r4)
            java.lang.Object r0 = r3.A01
            int r1 = X.AnonymousClass7TE.A0M(r0)
            r2 = 1
            if (r1 == r2) goto L_0x04df
            r0 = 3
            if (r1 == r0) goto L_0x014a
            r0 = 2
            if (r1 != r0) goto L_0x007a
            java.lang.Object r3 = r5.A01
            com.instagram.archive.fragment.ArchiveReelRecycleBinFragment r3 = (com.instagram.archive.fragment.ArchiveReelRecycleBinFragment) r3
            com.instagram.archive.fragment.ArchiveReelRecycleBinFragment.A02(r3)
            com.instagram.archive.fragment.ArchiveReelRecycleBinFragment.A01(r3)
        L_0x0133:
            X.0S7.A00(r3)
            android.widget.ListView r1 = r3.A04
            r0 = 31
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
            com.instagram.ui.widget.refresh.RefreshableListView r1 = (com.instagram.ui.widget.refresh.RefreshableListView) r1
            r1.setIsLoading(r4)
            X.C46445Df7.A01(r3, r4)
            return
        L_0x014a:
            java.lang.Object r3 = r5.A01
            com.instagram.archive.fragment.ArchiveReelRecycleBinFragment r3 = (com.instagram.archive.fragment.ArchiveReelRecycleBinFragment) r3
            androidx.fragment.app.FragmentActivity r2 = r3.getActivity()
            r1 = 2131956760(0x7f131418, float:1.9550085E38)
            java.lang.String r0 = "could_not_refresh_feed"
            X.C59689JTv.A01(r2, r0, r1, r4)
            com.instagram.archive.fragment.ArchiveReelRecycleBinFragment.A03(r3)
            goto L_0x0133
        L_0x015e:
            java.lang.Object r5 = r5.A01
            com.instagram.archive.fragment.ArchiveReelFragment r5 = (com.instagram.archive.fragment.ArchiveReelFragment) r5
            X.Jvu r3 = (X.C61056Jvu) r3
            java.lang.Object r0 = r3.A03
            int r1 = X.AnonymousClass7TE.A0M(r0)
            r4 = 1
            if (r1 == r4) goto L_0x032f
            r6 = 0
            if (r1 == r6) goto L_0x0342
            r0 = 2
            if (r1 != r0) goto L_0x035e
            java.lang.Object r0 = r3.A04
            X.MbG r0 = (X.C66709MbG) r0
            if (r0 == 0) goto L_0x0183
            java.lang.Object r1 = r0.A02
            X.1Xj r1 = (X.1Xj) r1
            if (r1 == 0) goto L_0x0183
            X.UdK r0 = r5.A00
            r0.A00 = r1
        L_0x0183:
            com.instagram.archive.fragment.ArchiveReelFragment.A05(r5)
            X.UdK r0 = r5.A00
            int r1 = r0.getCount()
            int r7 = r1 + -1
            boolean r0 = r5.A0D
            if (r0 != 0) goto L_0x01bf
            if (r1 <= 0) goto L_0x01bf
            r5.A0D = r4
            com.instagram.archive.fragment.ArchiveReelFragment.A03(r5)
            r2 = 0
            com.instagram.common.session.UserSession r0 = r5.A04
            X.1Av r1 = X.1Au.A00(r0)
            boolean r0 = r5.A0F
            if (r0 != 0) goto L_0x01b7
            X.0xa r1 = r1.A01
            java.lang.String r0 = "stories_archive_privacy_banner_view_count"
            int r1 = r1.getInt(r0, r6)
            r0 = 3
            if (r1 < r0) goto L_0x01b7
            android.view.View r0 = r5.requireView()
            int r2 = r0.getHeight()
        L_0x01b7:
            X.0S7.A00(r5)
            android.widget.ListView r0 = r5.A04
            r0.setSelectionFromTop(r7, r2)
        L_0x01bf:
            com.instagram.archive.fragment.ArchiveReelFragment.A04(r5)
            com.instagram.archive.fragment.ArchiveReelFragment.A02(r5)
            boolean r0 = r5.A0E
            if (r0 != 0) goto L_0x0351
            android.os.Bundle r2 = r5.requireArguments()
            r0 = 746(0x2ea, float:1.045E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            java.lang.String r1 = r2.getString(r0)
            if (r1 == 0) goto L_0x0351
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0351
            java.lang.String r0 = "archiveDay:"
            java.lang.String r7 = X.002.A0R(r0, r1)
            r0 = 747(0x2eb, float:1.047E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            int r12 = r2.getInt(r0)
            X.Jj7 r8 = r5.A03
            X.05G r0 = r8.A08
            java.lang.Object r0 = r0.getValue()
            X.Jvu r0 = (X.C61056Jvu) r0
            java.lang.Object r2 = r0.A02
            java.util.Map r2 = (java.util.Map) r2
            com.instagram.common.session.UserSession r1 = r8.A05
            boolean r0 = r8.A0B
            java.util.List r2 = X.C60308Jj7.A00(r1, r2, r0)
            int r1 = X.DbT.A02(r2, r4)
        L_0x0209:
            if (r1 < 0) goto L_0x0351
            java.lang.Object r0 = r2.get(r1)
            X.Hqi r0 = (X.C55977Hqi) r0
            com.instagram.model.reels.Reel r13 = r0.A02
            java.lang.String r0 = r13.getId()
            boolean r0 = X.2Ob.A00(r0, r7)
            if (r0 == 0) goto L_0x029d
            com.instagram.common.session.UserSession r0 = r5.A04
            java.util.List r0 = r13.A0O(r0)
            int r0 = r0.size()
            if (r0 <= r12) goto L_0x0351
            r5.A0E = r4
            com.instagram.common.session.UserSession r0 = r5.A04
            X.3uh r0 = r13.A0A(r0, r12)
            com.instagram.archive.fragment.ArchiveReelFragment.A07(r5, r0)
            X.32A r8 = r5.A07
            if (r8 != 0) goto L_0x0246
            com.instagram.common.session.UserSession r1 = r5.A04
            X.328 r0 = new X.328
            r0.<init>(r5)
            X.32A r8 = new X.32A
            r8.<init>(r5, r1, r0)
            r5.A07 = r8
        L_0x0246:
            java.lang.String r0 = r5.A0B
            r8.A0C = r0
            com.instagram.common.session.UserSession r0 = r5.A04
            java.lang.String r0 = r0.A06
            r8.A0D = r0
            X.32D r1 = new X.32D
            r1.<init>()
            com.instagram.model.reels.ReelViewerContextButtonType r0 = com.instagram.model.reels.ReelViewerContextButtonType.VIEW_ON_MAP
            r1.A00 = r0
            r1.A06 = r6
            com.instagram.model.reels.ReelViewerConfig r0 = new com.instagram.model.reels.ReelViewerConfig
            r0.<init>((X.AnonymousClass32D) r1)
            r8.A03 = r0
            X.3BQ r14 = X.AnonymousClass3BQ.ARCHIVE_DEEPLINK
            java.util.List r11 = java.util.Collections.singletonList(r13)
            java.util.List r7 = java.util.Collections.singletonList(r13)
            X.329 r0 = r8.A0L
            androidx.fragment.app.FragmentActivity r1 = r0.getActivity()
            if (r1 == 0) goto L_0x0351
            androidx.fragment.app.Fragment r0 = r0.B7p()
            if (r0 == 0) goto L_0x0351
            boolean r0 = r0.isAdded()
            if (r0 == 0) goto L_0x0351
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r2 = r11.iterator()
        L_0x0289:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02a1
            java.lang.Object r0 = r2.next()
            com.instagram.model.reels.Reel r0 = (com.instagram.model.reels.Reel) r0
            java.lang.String r0 = r0.getId()
            r10.add(r0)
            goto L_0x0289
        L_0x029d:
            int r1 = r1 + -1
            goto L_0x0209
        L_0x02a1:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r2 = r7.iterator()
        L_0x02aa:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02be
            java.lang.Object r0 = r2.next()
            com.instagram.model.reels.Reel r0 = (com.instagram.model.reels.Reel) r0
            java.lang.String r0 = r0.getId()
            r9.add(r0)
            goto L_0x02aa
        L_0x02be:
            X.6nn r0 = r8.A04
            if (r0 != 0) goto L_0x02d0
            com.instagram.common.session.UserSession r2 = r8.A0K
            X.1OP r0 = X.1OP.$redex_init_class
            X.0qQ.A0B(r2, r6)
            X.6kI r0 = new X.6kI
            r0.<init>(r2)
            r8.A04 = r0
        L_0x02d0:
            X.1OP r0 = X.1OP.$redex_init_class
            X.6Ye r7 = new X.6Ye
            r7.<init>()
            java.lang.String r0 = r13.getId()
            com.instagram.common.session.UserSession r2 = r8.A0K
            r7.A02(r2, r0, r11)
            r7.A09(r9)
            r7.A0A(r10)
            r7.A03(r14)
            boolean r0 = r11.contains(r13)
            if (r0 == 0) goto L_0x032d
            int r0 = r11.indexOf(r13)
        L_0x02f3:
            r7.A00 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            r7.A04(r0)
            r7.A01(r2)
            X.6nn r0 = r8.A04
            java.lang.String r0 = r0.A02
            r7.A06(r0)
            com.instagram.model.reels.ReelViewerConfig r0 = r8.A03
            r7.A03 = r0
            java.lang.String r0 = r8.A0B
            r7.A0K = r0
            com.instagram.search.common.analytics.SearchContext r0 = r8.A08
            r7.A06 = r0
            java.lang.String r0 = r8.A0C
            if (r0 == 0) goto L_0x0318
            r7.A0N = r0
        L_0x0318:
            X.6UX r0 = r8.A05
            if (r0 == 0) goto L_0x0321
            java.lang.String r0 = r0.A03
            r7.A07(r0)
        L_0x0321:
            android.os.Bundle r0 = r7.A00()
            X.6W8 r0 = X.AnonymousClass6W8.A01(r1, r0, r2)
            r0.A0C(r1)
            goto L_0x0351
        L_0x032d:
            r0 = 0
            goto L_0x02f3
        L_0x032f:
            android.widget.ListView r0 = r5.A0X()
            if (r0 == 0) goto L_0x033e
            android.widget.ListView r0 = r5.A0X()
            com.instagram.ui.widget.refresh.RefreshableListView r0 = (com.instagram.ui.widget.refresh.RefreshableListView) r0
            r0.setIsLoading(r4)
        L_0x033e:
            com.instagram.archive.fragment.ArchiveReelFragment.A06(r5)
            goto L_0x035e
        L_0x0342:
            androidx.fragment.app.FragmentActivity r2 = r5.getActivity()
            r1 = 2131956760(0x7f131418, float:1.9550085E38)
            java.lang.String r0 = "could_not_refresh_feed"
            X.C59689JTv.A01(r2, r0, r1, r6)
            com.instagram.archive.fragment.ArchiveReelFragment.A06(r5)
        L_0x0351:
            X.0S7.A00(r5)
            android.widget.ListView r0 = r5.A04
            com.instagram.ui.widget.refresh.RefreshableListView r0 = (com.instagram.ui.widget.refresh.RefreshableListView) r0
            r0.setIsLoading(r6)
            X.C46445Df7.A01(r5, r6)
        L_0x035e:
            java.lang.Object r0 = r3.A06
            int r1 = X.AnonymousClass7TE.A0M(r0)
            if (r1 == r4) goto L_0x03c6
            r0 = 2
            if (r1 == r0) goto L_0x03ba
            r0 = 0
            if (r1 != r0) goto L_0x0399
            android.content.Context r1 = r5.getContext()
            java.lang.String r0 = "ArchivePreferenceUpdate_error"
            X.C59689JTv.A0A(r1, r0)
        L_0x0375:
            X.6ST r0 = r5.A08
            if (r0 == 0) goto L_0x037c
            r0.dismiss()
        L_0x037c:
            com.instagram.archive.fragment.ArchiveReelFragment.A01(r5)
            com.instagram.archive.fragment.ArchiveReelFragment.A06(r5)
            X.Jj7 r0 = r5.A03
            X.05G r4 = r0.A08
        L_0x0386:
            java.lang.Object r2 = r4.getValue()
            r1 = r2
            X.Jvu r1 = (X.C61056Jvu) r1
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            X.Jvu r0 = X.C61056Jvu.A00(r1, (X.1Xj) null, (java.lang.Integer) null, r0, (java.lang.String) null, (java.util.Map) null, (java.util.Set) null, 0, 247, false)
            boolean r0 = r4.AIY(r2, r0)
            if (r0 == 0) goto L_0x0386
        L_0x0399:
            java.lang.String r6 = r3.A07
            if (r6 == 0) goto L_0x007a
            X.WT0 r1 = r5.A01
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            r0 = 1
            r1.A00 = r0
            java.util.Set r0 = r1.A04
            java.util.Iterator r1 = r0.iterator()
        L_0x03aa:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x04f2
            java.lang.Object r0 = r1.next()
            X.X7f r0 = (X.X7f) r0
            r0.Cxx(r6, r2)
            goto L_0x03aa
        L_0x03ba:
            android.content.Context r2 = r5.getContext()
            r1 = 2131974253(0x7f13586d, float:1.9585565E38)
            r0 = 0
            X.C59689JTv.A08(r2, r1, r0)
            goto L_0x0375
        L_0x03c6:
            android.content.Context r0 = r5.requireContext()
            X.6ST r2 = new X.6ST
            r2.<init>(r0)
            r5.A08 = r2
            androidx.fragment.app.FragmentActivity r1 = r5.requireActivity()
            r0 = 2131974267(0x7f13587b, float:1.9585593E38)
            java.lang.String r0 = r1.getString(r0)
            r2.A00(r0)
            X.6ST r0 = r5.A08
            X.AnonymousClass0fN.A00(r0)
            goto L_0x0399
        L_0x03e5:
            X.Tpd r3 = (X.C14087Tpd) r3
            com.instagram.model.shopping.ProductSource r1 = r3.A00
            if (r1 == 0) goto L_0x0400
            java.lang.Object r0 = r5.A01
            X.Uaj r0 = (X.C15334Uaj) r0
            X.VhN r0 = r0.A0B
            if (r0 != 0) goto L_0x03fd
            java.lang.String r0 = "productSourceRowController"
        L_0x03f5:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x03fd:
            r0.A00(r1)
        L_0x0400:
            boolean r0 = r3.A0C
            if (r0 == 0) goto L_0x0445
            java.lang.Object r4 = r5.A01
            X.Uaj r4 = (X.C15334Uaj) r4
            boolean r0 = r4.A0F
            if (r0 != 0) goto L_0x0419
            r0 = 1
            r4.A0F = r0
            X.Ugq r0 = r4.A0A
            if (r0 != 0) goto L_0x0416
            java.lang.String r0 = "shopVisibilityController"
            goto L_0x03f5
        L_0x0416:
            r0.A00()
        L_0x0419:
            androidx.recyclerview.widget.RecyclerView r0 = r4.A03
            if (r0 == 0) goto L_0x04c0
            r1 = 8
            r0.setVisibility(r1)
            android.view.View r0 = r4.A00
            if (r0 != 0) goto L_0x0429
            java.lang.String r0 = "productSourceRow"
            goto L_0x03f5
        L_0x0429:
            r0.setVisibility(r1)
            android.view.View r0 = r4.A01
            if (r0 != 0) goto L_0x0433
            java.lang.String r0 = "productSourceRowDivider"
            goto L_0x03f5
        L_0x0433:
            r0.setVisibility(r1)
            android.widget.FrameLayout r0 = r4.A02
            if (r0 == 0) goto L_0x04bc
            r1 = 0
            r0.setVisibility(r1)
            com.instagram.igds.components.search.IgdsInlineSearchBox r0 = r4.A07
            if (r0 != 0) goto L_0x04b1
            java.lang.String r0 = "inlineSearchBox"
            goto L_0x03f5
        L_0x0445:
            boolean r6 = r3.A09
            if (r6 == 0) goto L_0x0495
            java.lang.Object r1 = r5.A01
            X.Uaj r1 = (X.C15334Uaj) r1
            boolean r0 = r1.A0E
            if (r0 != 0) goto L_0x0495
            r0 = 1
            r1.A0E = r0
            X.Ugh r0 = r1.A09
            if (r0 != 0) goto L_0x045b
            java.lang.String r0 = "productTaggingNullStateController"
            goto L_0x03f5
        L_0x045b:
            X.Ugk r7 = r0.A01
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.lang.String r1 = r7.A04
            java.lang.String r0 = "entry_point"
            r8.put(r0, r1)
            java.lang.String r1 = r7.A06
            java.lang.String r0 = "waterfall_id"
            r8.put(r0, r1)
            java.lang.String r1 = r7.A05
            java.lang.String r0 = "prior_module"
            r8.put(r0, r1)
            android.content.Context r2 = r7.A00
            X.07i r1 = r7.A01
            r0 = 0
            X.2lw r4 = new X.2lw
            r4.<init>(r2, r1, r0)
            com.instagram.common.session.UserSession r1 = r7.A02
            java.lang.String r0 = "com.instagram.shopping.screens.seller_journey.upload_products_null_state"
            X.8ey r2 = X.C359988do.A06(r1, r0, r8)
            r1 = 3
            X.UcO r0 = new X.UcO
            r0.<init>(r7, r1)
            r2.A00(r0)
            r4.schedule(r2)
        L_0x0495:
            java.lang.Object r4 = r5.A01
            X.Uaj r4 = (X.C15334Uaj) r4
            androidx.recyclerview.widget.RecyclerView r2 = r4.A03
            if (r2 == 0) goto L_0x04c0
            r1 = 8
            int r0 = X.DbW.A00(r6)
            r2.setVisibility(r0)
            android.widget.FrameLayout r0 = r4.A02
            if (r0 == 0) goto L_0x04bc
            if (r6 == 0) goto L_0x04ad
            r1 = 0
        L_0x04ad:
            r0.setVisibility(r1)
            goto L_0x04b4
        L_0x04b1:
            r0.setEditTextAndCustomActionEnabled(r1)
        L_0x04b4:
            X.VOy r0 = r4.A08
            if (r0 != 0) goto L_0x04c4
            java.lang.String r0 = "adapterWrapper"
            goto L_0x03f5
        L_0x04bc:
            java.lang.String r0 = "nullStateContainer"
            goto L_0x03f5
        L_0x04c0:
            java.lang.String r0 = "recyclerView"
            goto L_0x03f5
        L_0x04c4:
            X.VhH r0 = r0.A00
            r0.A00(r3)
            return
        L_0x04ca:
            X.ULi r3 = (X.ULi) r3
            java.lang.Object r0 = r5.A01
            X.Uah r0 = (X.C15332Uah) r0
            X.0eM r0 = r0.A00
            java.lang.Object r0 = r0.getValue()
            X.VgF r0 = (X.C17802VgF) r0
            X.0qQ.A0A(r3)
            r0.A00(r3)
            return
        L_0x04df:
            java.lang.Object r1 = r5.A01
            com.instagram.archive.fragment.ArchiveReelRecycleBinFragment r1 = (com.instagram.archive.fragment.ArchiveReelRecycleBinFragment) r1
            android.widget.ListView r0 = r1.A0X()
            com.instagram.ui.widget.refresh.RefreshableListView r0 = (com.instagram.ui.widget.refresh.RefreshableListView) r0
            if (r0 == 0) goto L_0x04ee
            r0.setIsLoading(r2)
        L_0x04ee:
            com.instagram.archive.fragment.ArchiveReelRecycleBinFragment.A03(r1)
            return
        L_0x04f2:
            X.Jj7 r0 = r5.A03
            X.05G r4 = r0.A08
        L_0x04f6:
            java.lang.Object r3 = r4.getValue()
            r2 = r3
            X.Jvu r2 = (X.C61056Jvu) r2
            java.lang.String r0 = r2.A07
            boolean r0 = X.0qQ.A0K(r0, r6)
            if (r0 == 0) goto L_0x050c
            r1 = 0
            r0 = 239(0xef, float:3.35E-43)
            X.Jvu r2 = X.C61056Jvu.A00(r2, (X.1Xj) null, r1, (java.lang.Integer) null, (java.lang.String) null, (java.util.Map) null, r1, 0, r0, false)
        L_0x050c:
            boolean r0 = r4.AIY(r3, r2)
            if (r0 == 0) goto L_0x04f6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WEB.onChanged(java.lang.Object):void");
    }
}
