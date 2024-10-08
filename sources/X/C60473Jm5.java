package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Jm5  reason: case insensitive filesystem */
public final class C60473Jm5 extends C249403jg {
    public final int A00;
    public final Object A01;

    public C60473Jm5(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(RecyclerView recyclerView, Object obj, int i) {
        recyclerView.A15(new C60473Jm5(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0105, code lost:
        X.AnonymousClass0fD.A0A(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0108, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x016b, code lost:
        X.AnonymousClass0fD.A0A(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x016e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView r5, int r6) {
        /*
            r4 = this;
            int r0 = r4.A00
            switch(r0) {
                case 1: goto L_0x0151;
                case 2: goto L_0x0005;
                case 3: goto L_0x0137;
                case 4: goto L_0x0005;
                case 5: goto L_0x0116;
                case 6: goto L_0x00e8;
                case 7: goto L_0x0005;
                case 8: goto L_0x0005;
                case 9: goto L_0x00c9;
                case 10: goto L_0x00a0;
                case 11: goto L_0x007e;
                case 12: goto L_0x004c;
                case 13: goto L_0x0005;
                case 14: goto L_0x0005;
                case 15: goto L_0x0005;
                case 16: goto L_0x0005;
                case 17: goto L_0x002e;
                case 18: goto L_0x0005;
                case 19: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.onScrollStateChanged(r5, r6)
            return
        L_0x0009:
            r0 = 1982563144(0x762b8348, float:8.696733E32)
            int r2 = X.AnonymousClass7TG.A0D(r5, r0)
            super.onScrollStateChanged(r5, r6)
            r0 = 1
            if (r6 != r0) goto L_0x0029
            java.lang.Object r0 = r4.A01
            X.LGN r0 = (X.LGN) r0
            X.Ji1 r1 = r0.A01()
            boolean r0 = r1 instanceof com.instagram.video.live.mvvm.viewmodel.likes.IgLiveViewerLikesViewModel
            if (r0 == 0) goto L_0x0029
            com.instagram.video.live.mvvm.viewmodel.likes.IgLiveViewerLikesViewModel r1 = (com.instagram.video.live.mvvm.viewmodel.likes.IgLiveViewerLikesViewModel) r1
            if (r1 == 0) goto L_0x0029
            com.instagram.video.live.mvvm.viewmodel.likes.IgLiveViewerLikesViewModel.A04(r1)
        L_0x0029:
            r0 = 144620957(0x89ebd9d, float:9.553857E-34)
            goto L_0x016b
        L_0x002e:
            r0 = -1842660073(0xffffffff922b3d17, float:-5.4033385E-28)
            int r2 = X.AnonymousClass7TG.A0D(r5, r0)
            super.onScrollStateChanged(r5, r6)
            java.lang.Object r1 = r4.A01
            com.instagram.igds.components.search.IgdsInlineSearchBox r1 = (com.instagram.igds.components.search.IgdsInlineSearchBox) r1
            boolean r0 = r1.hasFocus()
            if (r0 == 0) goto L_0x0047
            if (r6 == 0) goto L_0x0047
            r1.A03()
        L_0x0047:
            r0 = 2000411591(0x773bdbc7, float:3.810223E33)
            goto L_0x016b
        L_0x004c:
            r0 = -8410248(0xffffffffff7fab78, float:-3.3984346E38)
            int r2 = X.AnonymousClass7TG.A0D(r5, r0)
            super.onScrollStateChanged(r5, r6)
            r0 = 1
            if (r6 != r0) goto L_0x0073
            java.lang.Object r1 = r4.A01
            com.instagram.music.search.MusicOverlayResultsListController r1 = (com.instagram.music.search.MusicOverlayResultsListController) r1
            int r0 = r1.A00
            if (r0 != 0) goto L_0x0064
            r1.A06()
        L_0x0064:
            boolean r0 = r1.A0A()
            if (r0 == 0) goto L_0x0073
            boolean r0 = r1.A0B()
            if (r0 == 0) goto L_0x0073
            com.instagram.music.search.MusicOverlayResultsListController.A03(r1)
        L_0x0073:
            java.lang.Object r0 = r4.A01
            com.instagram.music.search.MusicOverlayResultsListController r0 = (com.instagram.music.search.MusicOverlayResultsListController) r0
            r0.A00 = r6
            r0 = 1903233902(0x71710b6e, float:1.1935953E30)
            goto L_0x016b
        L_0x007e:
            r0 = -1488598308(0xffffffffa745cadc, float:-2.7449212E-15)
            int r3 = X.AnonymousClass7TG.A0D(r5, r0)
            super.onScrollStateChanged(r5, r6)
            r2 = 1
            if (r6 != r2) goto L_0x0092
            java.lang.Object r0 = r4.A01
            X.K6H r0 = (X.K6H) r0
            X.K6H.A03(r0)
        L_0x0092:
            java.lang.Object r1 = r4.A01
            X.K6H r1 = (X.K6H) r1
            r0 = 2
            if (r6 == r0) goto L_0x009a
            r2 = 0
        L_0x009a:
            r1.A0G = r2
            r0 = 778920951(0x2e6d63f7, float:5.3976348E-11)
            goto L_0x0105
        L_0x00a0:
            r0 = -371942736(0xffffffffe9d49ab0, float:-3.2127846E25)
            int r2 = X.AnonymousClass0fD.A03(r0)
            r3 = 0
            X.0qQ.A0B(r5, r3)
            super.onScrollStateChanged(r5, r6)
            java.lang.Object r1 = r4.A01
            com.instagram.creation.fragment.followersshare.FollowersShareFragment r1 = (com.instagram.creation.fragment.followersshare.FollowersShareFragment) r1
            boolean r0 = r1.isVisible()
            if (r0 == 0) goto L_0x00c0
            r0 = 1
            if (r6 == 0) goto L_0x00c5
            if (r6 != r0) goto L_0x00c0
            com.instagram.creation.fragment.followersshare.FollowersShareFragment.A0L(r1, r3)
        L_0x00c0:
            r0 = 1912618605(0x72003e6d, float:2.5401312E30)
            goto L_0x016b
        L_0x00c5:
            com.instagram.creation.fragment.followersshare.FollowersShareFragment.A0L(r1, r0)
            goto L_0x00c0
        L_0x00c9:
            r0 = 1143707718(0x442b9846, float:686.3793)
            int r2 = X.AnonymousClass0fD.A03(r0)
            r0 = 1
            if (r6 != r0) goto L_0x00e3
            java.lang.Object r1 = r4.A01
            com.instagram.creation.capture.quickcapture.thirdpartymedia.GiphyClipsBrowserFragment r1 = (com.instagram.creation.capture.quickcapture.thirdpartymedia.GiphyClipsBrowserFragment) r1
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r1.searchEditText
            if (r0 == 0) goto L_0x00de
            r0.clearFocus()
        L_0x00de:
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r1.searchEditText
            X.0nA.A0N(r0)
        L_0x00e3:
            r0 = 1956067414(0x74973856, float:9.58471E31)
            goto L_0x016b
        L_0x00e8:
            r0 = -2008026268(0xffffffff884ff364, float:-6.25779E-34)
            int r3 = X.AnonymousClass7TG.A0D(r5, r0)
            super.onScrollStateChanged(r5, r6)
            java.lang.Object r0 = r4.A01
            X.L7n r0 = (X.C63807L7n) r0
            com.instagram.ui.widget.searchedittext.SearchEditText r1 = r0.A00
            if (r1 != 0) goto L_0x0109
            java.lang.String r2 = "EffectSearchNullStateController"
            java.lang.String r1 = "onScrollStateChanged() should not have null mSearchEditText."
            r0 = 0
            X.0kD.A07(r2, r1, r0)
            r0 = -1211968740(0xffffffffb7c2d31c, float:-2.3224908E-5)
        L_0x0105:
            X.AnonymousClass0fD.A0A(r0, r3)
            return
        L_0x0109:
            r0 = 1
            if (r6 != r0) goto L_0x0112
            r1.A04()
            r1.clearFocus()
        L_0x0112:
            r0 = -553783546(0xffffffffdefdef06, float:-9.1489252E18)
            goto L_0x0105
        L_0x0116:
            r0 = 191434271(0xb690e1f, float:4.488479E-32)
            int r2 = X.AnonymousClass7TG.A0D(r5, r0)
            super.onScrollStateChanged(r5, r6)
            if (r6 != 0) goto L_0x0133
            java.lang.Object r1 = r4.A01
            X.K5V r1 = (X.K5V) r1
            android.view.View r0 = r1.requireView()
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0133
            X.K5V.A01(r1)
        L_0x0133:
            r0 = -1066674740(0xffffffffc06bd5cc, float:-3.6849241)
            goto L_0x016b
        L_0x0137:
            r0 = 629786647(0x2589c817, float:2.3901298E-16)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r4.A01
            X.JW8 r0 = (X.JW8) r0
            X.JWm r0 = r0.A0H
            X.JW7 r1 = r0.A00
            boolean r0 = r1.A1N
            if (r0 != 0) goto L_0x014d
            X.JW7.A0E(r1)
        L_0x014d:
            r0 = -673025579(0xffffffffd7e271d5, float:-4.97957065E14)
            goto L_0x016b
        L_0x0151:
            r0 = -425656742(0xffffffffe6a0fe5a, float:-3.801353E23)
            int r2 = X.AnonymousClass7TG.A0D(r5, r0)
            if (r6 != 0) goto L_0x0165
            java.lang.Object r0 = r4.A01
            X.LE4 r0 = (X.LE4) r0
            X.LrN r0 = r0.A00
            if (r0 == 0) goto L_0x016f
            X.C65324LrN.A02(r0)
        L_0x0165:
            super.onScrollStateChanged(r5, r6)
            r0 = -2036184304(0xffffffff86a24b10, float:-6.104792E-35)
        L_0x016b:
            X.AnonymousClass0fD.A0A(r0, r2)
            return
        L_0x016f:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = 726153751(0x2b483a17, float:7.113489E-13)
            X.AnonymousClass0fD.A0A(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60473Jm5.onScrollStateChanged(androidx.recyclerview.widget.RecyclerView, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02d9, code lost:
        X.AnonymousClass0fD.A0A(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02dc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02dd, code lost:
        r0 = "delegate";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02e0, code lost:
        r0 = "adapter";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02e2, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02e9, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0301, code lost:
        X.AnonymousClass0fD.A0A(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0304, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0066, code lost:
        if (r2.A1d() != (r2.A0U() - 2)) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0103, code lost:
        X.AnonymousClass0fD.A0A(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0106, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
        if ((r2.A0U() - r2.A1d()) > 3) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onScrolled(androidx.recyclerview.widget.RecyclerView r10, int r11, int r12) {
        /*
            r9 = this;
            int r0 = r9.A00
            switch(r0) {
                case 0: goto L_0x02ea;
                case 1: goto L_0x0247;
                case 2: goto L_0x0231;
                case 3: goto L_0x01fe;
                case 4: goto L_0x01c6;
                case 5: goto L_0x0005;
                case 6: goto L_0x0005;
                case 7: goto L_0x0185;
                case 8: goto L_0x0124;
                case 9: goto L_0x0005;
                case 10: goto L_0x0005;
                case 11: goto L_0x0005;
                case 12: goto L_0x0005;
                case 13: goto L_0x0280;
                case 14: goto L_0x0107;
                case 15: goto L_0x0090;
                case 16: goto L_0x0074;
                case 17: goto L_0x0005;
                case 18: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.onScrolled(r10, r11, r12)
            return
        L_0x0009:
            r0 = 2086565918(0x7c5e781e, float:4.6205047E36)
            int r5 = X.AnonymousClass0fD.A03(r0)
            r1 = 0
            X.0qQ.A0B(r10, r1)
            X.3pI r2 = r10.A0D
            boolean r0 = r2 instanceof androidx.recyclerview.widget.GridLayoutManager
            if (r0 == 0) goto L_0x004d
            androidx.recyclerview.widget.LinearLayoutManager r2 = (androidx.recyclerview.widget.LinearLayoutManager) r2
            X.0qQ.A0B(r2, r1)
            int r0 = r2.A0T()
            if (r0 == 0) goto L_0x0031
            int r1 = r2.A0U()
            int r0 = r2.A1d()
            int r1 = r1 - r0
            r0 = 3
            if (r1 > r0) goto L_0x0048
        L_0x0031:
            java.lang.Object r0 = r9.A01
            X.L2r r0 = (X.C63681L2r) r0
            X.M0a r0 = r0.A00
            X.Kcv r0 = r0.A0A
            X.0eM r0 = r0.A07
            X.2YL r2 = X.DbS.A0H(r0)
            X.6oS r1 = X.C318116oQ.A00(r2)
            r0 = 32
            X.C66184MGv.A02(r2, r1, r0)
        L_0x0048:
            r0 = -117020375(0xfffffffff9066929, float:-4.3618793E34)
            goto L_0x0103
        L_0x004d:
            boolean r0 = r2 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r0 == 0) goto L_0x0069
            androidx.recyclerview.widget.LinearLayoutManager r2 = (androidx.recyclerview.widget.LinearLayoutManager) r2
            X.0qQ.A0B(r2, r1)
            int r0 = r2.A0T()
            if (r0 == 0) goto L_0x0031
            int r1 = r2.A1d()
            int r0 = r2.A0U()
            int r0 = r0 + -2
            if (r1 != r0) goto L_0x0048
            goto L_0x0031
        L_0x0069:
            r0 = 1322(0x52a, float:1.853E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.UnsupportedOperationException r1 = X.AnonymousClass7TE.A1B(r0)
            throw r1
        L_0x0074:
            r0 = -1753977556(0xffffffff97746d2c, float:-7.8978446E-25)
            int r5 = X.AnonymousClass7TG.A0D(r10, r0)
            java.lang.Object r0 = r9.A01
            X.Luk r0 = (X.C65521Luk) r0
            android.view.View r1 = r0.A00
            if (r1 == 0) goto L_0x008c
            int r0 = r10.computeVerticalScrollOffset()
            float r0 = (float) r0
            float r0 = -r0
            r1.setTranslationY(r0)
        L_0x008c:
            r0 = -1986276583(0xffffffff899bd319, float:-3.7513408E-33)
            goto L_0x0103
        L_0x0090:
            r0 = 1617370792(0x60671ea8, float:6.6615733E19)
            int r5 = X.AnonymousClass0fD.A03(r0)
            r2 = 0
            X.0qQ.A0B(r10, r2)
            super.onScrolled(r10, r11, r12)
            java.lang.Object r7 = r9.A01
            X.Luk r7 = (X.C65521Luk) r7
            X.WW4 r6 = r7.A03
            if (r6 == 0) goto L_0x02dd
            X.3pI r1 = r10.A0D
            boolean r0 = r1 instanceof com.google.android.flexbox.FlexboxLayoutManager
            if (r0 == 0) goto L_0x0100
            com.google.android.flexbox.FlexboxLayoutManager r1 = (com.google.android.flexbox.FlexboxLayoutManager) r1
            if (r1 == 0) goto L_0x0100
            int r0 = r1.A0T()
            android.view.View r0 = com.google.android.flexbox.FlexboxLayoutManager.A0M(r1, r2, r0)
            if (r0 != 0) goto L_0x00fb
            r4 = -1
        L_0x00bb:
            int r0 = r1.A0T()
            int r0 = r0 + -1
            r3 = -1
            android.view.View r0 = com.google.android.flexbox.FlexboxLayoutManager.A0M(r1, r0, r3)
            if (r0 == 0) goto L_0x00cc
            int r3 = X.C252553pI.A06(r0)
        L_0x00cc:
            r0 = -1
            if (r4 == r0) goto L_0x0100
            if (r3 == r0) goto L_0x0100
            if (r4 > r3) goto L_0x0100
        L_0x00d3:
            X.3kE r2 = r10.A0W(r4)
            if (r2 == 0) goto L_0x0100
            X.JZz r0 = r7.A05
            if (r0 == 0) goto L_0x02e0
            X.2re r0 = r0.mDiffer
            java.util.List r0 = r0.A02
            X.0qQ.A07(r0)
            java.lang.Object r1 = X.00k.A0O(r0, r4)
            X.Dh0 r1 = (X.C46558Dh0) r1
            boolean r0 = r2 instanceof X.C59826Ja1
            if (r0 == 0) goto L_0x00f6
            if (r1 == 0) goto L_0x00f6
            X.Ja1 r2 = (X.C59826Ja1) r2
            r0 = 1
            r2.A00(r6, r1, r4, r0)
        L_0x00f6:
            if (r4 == r3) goto L_0x0100
            int r4 = r4 + 1
            goto L_0x00d3
        L_0x00fb:
            int r4 = X.C252553pI.A06(r0)
            goto L_0x00bb
        L_0x0100:
            r0 = 1164871729(0x456e8831, float:3816.512)
        L_0x0103:
            X.AnonymousClass0fD.A0A(r0, r5)
            return
        L_0x0107:
            r0 = 303993578(0x121e92ea, float:5.0037095E-28)
            int r6 = X.AnonymousClass7TG.A0D(r10, r0)
            java.lang.Object r0 = r9.A01
            X.JUw r0 = (X.C59713JUw) r0
            androidx.recyclerview.widget.RecyclerView r1 = r0.A01
            if (r1 == 0) goto L_0x011f
            int r0 = r10.computeVerticalScrollOffset()
            float r0 = (float) r0
            float r0 = -r0
            r1.setTranslationY(r0)
        L_0x011f:
            r0 = -1080192851(0xffffffffbf9d90ad, float:-1.2309777)
            goto L_0x02d9
        L_0x0124:
            r0 = 856008302(0x3305a66e, float:3.1117843E-8)
            int r4 = X.AnonymousClass7TG.A0D(r10, r0)
            super.onScrolled(r10, r11, r12)
            java.lang.Object r3 = r9.A01
            X.LEG r3 = (X.LEG) r3
            monitor-enter(r3)
            android.widget.FrameLayout r0 = r3.A04     // Catch:{ all -> 0x0182 }
            int r0 = r0.getVisibility()     // Catch:{ all -> 0x0182 }
            if (r0 != 0) goto L_0x017c
            X.Jdt r2 = r3.A09     // Catch:{ all -> 0x0182 }
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()     // Catch:{ all -> 0x0182 }
            if (r1 == 0) goto L_0x0175
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1     // Catch:{ all -> 0x0182 }
            int r0 = r1.getMarginStart()     // Catch:{ all -> 0x0182 }
            int r0 = r0 - r11
            r1.setMarginStart(r0)     // Catch:{ all -> 0x0182 }
            int r0 = r1.getMarginEnd()     // Catch:{ all -> 0x0182 }
            int r0 = r0 + r11
            r1.setMarginEnd(r0)     // Catch:{ all -> 0x0182 }
            r2.setLayoutParams(r1)     // Catch:{ all -> 0x0182 }
            android.view.View r2 = r3.A03     // Catch:{ all -> 0x0182 }
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()     // Catch:{ all -> 0x0182 }
            if (r1 == 0) goto L_0x016e
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1     // Catch:{ all -> 0x0182 }
            int r0 = r1.getMarginStart()     // Catch:{ all -> 0x0182 }
            int r0 = r0 - r11
            r1.setMarginStart(r0)     // Catch:{ all -> 0x0182 }
            r2.setLayoutParams(r1)     // Catch:{ all -> 0x0182 }
            goto L_0x017c
        L_0x016e:
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)     // Catch:{ all -> 0x0182 }
            goto L_0x017b
        L_0x0175:
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)     // Catch:{ all -> 0x0182 }
        L_0x017b:
            throw r0     // Catch:{ all -> 0x0182 }
        L_0x017c:
            monitor-exit(r3)
            r0 = 528859012(0x1f85bf84, float:5.664453E-20)
            goto L_0x0301
        L_0x0182:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0185:
            r0 = -259207320(0xfffffffff08ccf68, float:-3.4862912E29)
            int r4 = X.AnonymousClass0fD.A03(r0)
            if (r11 != 0) goto L_0x0193
            r0 = -546128620(0xffffffffdf72bd14, float:-1.7491159E19)
            goto L_0x0301
        L_0x0193:
            java.lang.Object r5 = r9.A01
            X.LAJ r5 = (X.LAJ) r5
            int r0 = r5.A00
            int r0 = r0 + r11
            int r0 = X.C51970G9q.A07(r0, r0)
            r5.A00 = r0
            X.861 r3 = r5.A06
            X.2Fj r0 = r3.A0A
            java.lang.Object r1 = r0.A02()
            X.8YU r0 = X.AnonymousClass8YU.PLAYING
            if (r1 == r0) goto L_0x01c1
            android.content.Context r2 = r5.A02
            int r0 = r5.A00
            float r1 = (float) r0
            float r0 = X.LQO.A00
            float r0 = X.JTS.A01(r2, r0)
            float r1 = r1 / r0
            int r1 = (int) r1
            int r0 = r5.A01
            if (r1 <= r0) goto L_0x01be
            r1 = r0
        L_0x01be:
            r3.A06(r1)
        L_0x01c1:
            r0 = 1827031405(0x6ce6496d, float:2.2271975E27)
            goto L_0x0301
        L_0x01c6:
            r0 = 805779205(0x30073705, float:4.91909E-10)
            int r4 = X.AnonymousClass7TG.A0D(r10, r0)
            super.onScrolled(r10, r11, r12)
            X.3pI r0 = r10.A0D
            int r3 = X.C240113Jq.A02(r0)
            java.lang.Object r2 = r9.A01
            X.JW8 r2 = (X.JW8) r2
            java.lang.Integer r1 = r2.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x01f9
            X.8gc r0 = r2.A0G
            X.JWL r0 = (X.JWL) r0
            int r1 = r0.getItemCount()
            int r1 = r1 - r3
            r0 = 10
            if (r1 >= r0) goto L_0x01f9
            X.8XW r0 = r2.A0O
            com.instagram.ui.widget.mediapicker.Folder r0 = r0.A02
            int r1 = r0.A02
            r0 = -1
            if (r1 != r0) goto L_0x01f9
            r2.A0G(r0)
        L_0x01f9:
            r0 = 1739296247(0x67ab8df7, float:1.6202869E24)
            goto L_0x0301
        L_0x01fe:
            r0 = 855415428(0x32fc9a84, float:2.9406927E-8)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r3 = r9.A01
            X.JW8 r3 = (X.JW8) r3
            X.JWm r0 = r3.A0H
            X.JW7 r1 = r0.A00
            boolean r0 = r1.A1N
            if (r0 != 0) goto L_0x0214
            X.JW7.A0E(r1)
        L_0x0214:
            androidx.recyclerview.widget.GridLayoutManager r0 = r3.A0A
            int r2 = r0.A1a()
            if (r2 < 0) goto L_0x022c
            X.8gm r1 = r3.A0N
            X.8gc r0 = r3.A0G
            X.JWL r0 = (X.JWL) r0
            int r0 = r0.AJv(r2)
            r1.A07(r0)
            r1.A06()
        L_0x022c:
            r0 = 70461308(0x433277c, float:2.105948E-36)
            goto L_0x0301
        L_0x0231:
            r0 = 1342397107(0x50035ab3, float:8.8150374E9)
            int r4 = X.AnonymousClass7TG.A0D(r10, r0)
            super.onScrolled(r10, r11, r12)
            java.lang.Object r0 = r9.A01
            X.JcE r0 = (X.C59948JcE) r0
            X.C59948JcE.A00(r0)
            r0 = 1874666866(0x6fbd2572, float:1.1707587E29)
            goto L_0x0301
        L_0x0247:
            r0 = -84796657(0xfffffffffaf21b0f, float:-6.2854233E35)
            int r4 = X.AnonymousClass7TG.A0D(r10, r0)
            if (r11 == 0) goto L_0x0270
            java.lang.Object r1 = r9.A01
            X.LE4 r1 = (X.LE4) r1
            androidx.recyclerview.widget.LinearLayoutManager r0 = r1.A03
            int r3 = r0.A1a()
            int r2 = r0.A1b()
            X.LrN r1 = r1.A00
            if (r1 == 0) goto L_0x0275
            int r0 = r1.A00
            if (r0 < r3) goto L_0x0268
            if (r0 <= r2) goto L_0x026d
        L_0x0268:
            java.lang.String r0 = "scroll"
            X.C65324LrN.A03(r1, r0)
        L_0x026d:
            super.onScrolled(r10, r11, r12)
        L_0x0270:
            r0 = -11696950(0xffffffffff4d84ca, float:-2.7318122E38)
            goto L_0x0301
        L_0x0275:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = 406741499(0x183e61fb, float:2.4606392E-24)
            X.AnonymousClass0fD.A0A(r0, r4)
            throw r1
        L_0x0280:
            r0 = -1295048260(0xffffffffb2cf21bc, float:-2.4113312E-8)
            int r6 = X.AnonymousClass0fD.A03(r0)
            r5 = 0
            X.0qQ.A0B(r10, r5)
            super.onScrolled(r10, r11, r12)
            java.lang.Object r8 = r9.A01
            X.JUw r8 = (X.C59713JUw) r8
            X.WW4 r7 = r8.A02
            if (r7 == 0) goto L_0x02dd
            X.3pI r1 = r10.A0D
            boolean r0 = r1 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r0 == 0) goto L_0x02d6
            androidx.recyclerview.widget.LinearLayoutManager r1 = (androidx.recyclerview.widget.LinearLayoutManager) r1
            if (r1 == 0) goto L_0x02d6
            int r4 = r1.A1a()
            int r3 = r1.A1b()
            r0 = -1
            if (r4 == r0) goto L_0x02d6
            if (r3 == r0) goto L_0x02d6
            if (r4 > r3) goto L_0x02d6
        L_0x02af:
            X.3kE r2 = r10.A0W(r4)
            if (r2 == 0) goto L_0x02d6
            X.JZz r0 = r8.A03
            if (r0 == 0) goto L_0x02e0
            X.2re r0 = r0.mDiffer
            java.util.List r0 = r0.A02
            X.0qQ.A07(r0)
            java.lang.Object r1 = X.00k.A0O(r0, r4)
            X.Dh0 r1 = (X.C46558Dh0) r1
            boolean r0 = r2 instanceof X.C59826Ja1
            if (r0 == 0) goto L_0x02d1
            if (r1 == 0) goto L_0x02d1
            X.Ja1 r2 = (X.C59826Ja1) r2
            r2.A00(r7, r1, r4, r5)
        L_0x02d1:
            if (r4 == r3) goto L_0x02d6
            int r4 = r4 + 1
            goto L_0x02af
        L_0x02d6:
            r0 = -342947713(0xffffffffeb8f087f, float:-3.4583303E26)
        L_0x02d9:
            X.AnonymousClass0fD.A0A(r0, r6)
            return
        L_0x02dd:
            java.lang.String r0 = "delegate"
            goto L_0x02e2
        L_0x02e0:
            java.lang.String r0 = "adapter"
        L_0x02e2:
            X.0qQ.A0F(r0)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x02ea:
            r0 = 186974652(0xb2501bc, float:3.177915E-32)
            int r4 = X.AnonymousClass7TG.A0D(r10, r0)
            super.onScrolled(r10, r11, r12)
            java.lang.Object r0 = r9.A01
            X.K5D r0 = (X.K5D) r0
            X.K5D.A02(r0)
            X.K5D.A00(r0)
            r0 = -401023074(0xffffffffe818df9e, float:-2.887699E24)
        L_0x0301:
            X.AnonymousClass0fD.A0A(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60473Jm5.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
