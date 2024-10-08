package X;

/* renamed from: X.9LH  reason: invalid class name */
public final class AnonymousClass9LH extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9LH(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:198:0x04ab, code lost:
        r2 = "clipsViewerFragmentViewModel";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0054, code lost:
        r2 = "viewerAdapter";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x04ff, code lost:
        X.0qQ.A0F(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0506, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        r2 = "clipsViewerViewPager";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r14 = this;
            int r0 = r14.A00
            switch(r0) {
                case 0: goto L_0x03d5;
                case 1: goto L_0x03cb;
                case 2: goto L_0x03c1;
                case 3: goto L_0x03b7;
                case 4: goto L_0x03ad;
                case 5: goto L_0x03a3;
                case 6: goto L_0x0399;
                case 7: goto L_0x038f;
                case 8: goto L_0x03f8;
                case 9: goto L_0x0385;
                case 10: goto L_0x0371;
                case 11: goto L_0x035e;
                case 12: goto L_0x0355;
                case 13: goto L_0x032c;
                case 14: goto L_0x030b;
                case 15: goto L_0x02f8;
                case 16: goto L_0x02eb;
                case 17: goto L_0x02de;
                case 18: goto L_0x02d1;
                case 19: goto L_0x0277;
                case 20: goto L_0x022c;
                case 21: goto L_0x0223;
                case 22: goto L_0x020f;
                case 23: goto L_0x0202;
                case 24: goto L_0x01de;
                case 25: goto L_0x04ae;
                case 26: goto L_0x0493;
                case 27: goto L_0x0459;
                case 28: goto L_0x0064;
                case 29: goto L_0x01ca;
                case 30: goto L_0x019c;
                case 31: goto L_0x0441;
                case 32: goto L_0x04f1;
                case 33: goto L_0x017c;
                case 34: goto L_0x0417;
                case 35: goto L_0x0166;
                case 36: goto L_0x03f5;
                case 37: goto L_0x015d;
                case 38: goto L_0x0005;
                case 39: goto L_0x03f5;
                case 40: goto L_0x015d;
                case 41: goto L_0x0005;
                case 42: goto L_0x013f;
                case 43: goto L_0x040c;
                case 44: goto L_0x004c;
                case 45: goto L_0x03fb;
                case 46: goto L_0x002c;
                case 47: goto L_0x0058;
                case 48: goto L_0x0020;
                case 49: goto L_0x0014;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r14.A01
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r0 = r0.getValue()
            X.07g r0 = (X.AnonymousClass07g) r0
            X.07f r5 = r0.getViewModelStore()
        L_0x0013:
            return r5
        L_0x0014:
            java.lang.Object r0 = r14.A01
            X.2is r0 = (X.C227232is) r0
            X.GBm r5 = r0.A0G
            if (r5 != 0) goto L_0x0013
            java.lang.String r2 = "endSceneController"
            goto L_0x04ff
        L_0x0020:
            java.lang.Object r0 = r14.A01
            X.2is r0 = (X.C227232is) r0
            X.2nI r5 = r0.A02
            if (r5 != 0) goto L_0x0013
            java.lang.String r2 = "bloksHost"
            goto L_0x04ff
        L_0x002c:
            java.lang.Object r0 = r14.A01
            X.2is r0 = (X.C227232is) r0
            com.instagram.common.session.UserSession r7 = X.C227232is.A01(r0)
            com.instagram.clips.intf.ClipsViewerConfig r6 = X.C227232is.A00(r0)
            X.GBj r10 = r0.A0N
            if (r10 == 0) goto L_0x0060
            X.GD6 r8 = r0.A0C
            if (r8 == 0) goto L_0x0054
            X.GBE r0 = r0.A09
            if (r0 == 0) goto L_0x04ab
            X.GCH r9 = r0.A1A
            X.GLY r5 = new X.GLY
            r5.<init>(r6, r7, r8, r9, r10)
            return r5
        L_0x004c:
            java.lang.Object r0 = r14.A01
            X.2is r0 = (X.C227232is) r0
            X.GD6 r5 = r0.A0C
            if (r5 != 0) goto L_0x0013
        L_0x0054:
            java.lang.String r2 = "viewerAdapter"
            goto L_0x04ff
        L_0x0058:
            java.lang.Object r0 = r14.A01
            X.2is r0 = (X.C227232is) r0
            X.GBj r5 = r0.A0N
            if (r5 != 0) goto L_0x0013
        L_0x0060:
            java.lang.String r2 = "clipsViewerViewPager"
            goto L_0x04ff
        L_0x0064:
            java.lang.Object r0 = r14.A01
            X.2is r0 = (X.C227232is) r0
            com.instagram.common.session.UserSession r3 = X.C227232is.A01(r0)
            com.instagram.clips.intf.ClipsViewerConfig r0 = X.C227232is.A00(r0)
            com.instagram.clips.intf.ClipsViewerSource r1 = r0.A0J
            r0 = 0
            X.0qQ.A0B(r3, r0)
            r0 = 1
            X.0qQ.A0B(r1, r0)
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.CLIPS_CONNECTED
            if (r1 == r0) goto L_0x0088
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.FEED_TIMELINE_FOLLOWING
            if (r1 != r0) goto L_0x0092
            boolean r0 = X.C52275GLr.A00(r3)
            if (r0 == 0) goto L_0x0092
        L_0x0088:
            X.GJY r0 = X.GJY.A09
        L_0x008a:
            java.util.List r5 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r5)
            return r5
        L_0x0092:
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.CLIPS_NEARBY
            if (r1 == r0) goto L_0x013b
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.CLIPS_NEARBY_PUSH
            if (r1 == r0) goto L_0x013b
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.CLIPS_MEDIA_NOTES
            if (r1 != r0) goto L_0x00a1
            X.GJY r0 = X.GJY.A0C
            goto L_0x008a
        L_0x00a1:
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.CLIPS_FRIENDLY_VIEWER_DOGFOODING
            if (r1 != r0) goto L_0x00a8
            X.GJY r0 = X.GJY.A0A
            goto L_0x008a
        L_0x00a8:
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.CLIPS_TAB
            if (r1 != r0) goto L_0x011f
            X.GJY r0 = X.GJY.A08
            X.GJY[] r0 = new X.GJY[]{r0}
            java.util.ArrayList r5 = X.0sr.A1M(r0)
            boolean r0 = X.C52275GLr.A00(r3)
            if (r0 == 0) goto L_0x00c1
            X.GJY r0 = X.GJY.A09
            r5.add(r0)
        L_0x00c1:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318866225568282(0x8107d100051a1a, double:3.031535473160729E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x00d3
            X.GJY r0 = X.GJY.A0B
            r5.add(r0)
        L_0x00d3:
            r0 = 36320652934652640(0x810971002e22e0, double:3.032665395180177E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x00e9
            r0 = 36320652934062809(0x810971002522d9, double:3.032665394807166E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x00ee
        L_0x00e9:
            X.GJY r0 = X.GJY.A0C
            r5.add(r0)
        L_0x00ee:
            r0 = 36318866226158115(0x8107d1000e1a23, double:3.031535473533742E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x00fe
            X.GJY r0 = X.GJY.A0A
            r5.add(r0)
        L_0x00fe:
            r0 = 36318866225699356(0x8107d100071a1c, double:3.031535473243621E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x010e
            X.GJY r0 = X.GJY.A0D
            r5.add(r0)
        L_0x010e:
            r0 = 36318866225764893(0x8107d100081a1d, double:3.031535473285067E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0013
            X.GJY r0 = X.GJY.A0E
            r5.add(r0)
            return r5
        L_0x011f:
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.MIXED_MEDIA_CHAINS
            if (r1 != r0) goto L_0x0127
            X.GJY r0 = X.GJY.A0D
            goto L_0x008a
        L_0x0127:
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.STAR_SEARCH
            if (r1 != r0) goto L_0x012f
            X.GJY r0 = X.GJY.A0E
            goto L_0x008a
        L_0x012f:
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.ADS_ONLY
            if (r1 != r0) goto L_0x0137
            X.GJY r0 = X.GJY.A07
            goto L_0x008a
        L_0x0137:
            X.GJY r0 = X.GJY.A08
            goto L_0x008a
        L_0x013b:
            X.GJY r0 = X.GJY.A0B
            goto L_0x008a
        L_0x013f:
            X.37E r1 = X.AnonymousClass37D.A00
            java.lang.Object r0 = r14.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            androidx.fragment.app.FragmentActivity r0 = r0.requireActivity()
            X.37D r0 = r1.A01(r0)
            r1 = 1
            if (r0 == 0) goto L_0x015b
            X.37F r0 = (X.AnonymousClass37F) r0
            boolean r0 = r0.A0g
            if (r0 != r1) goto L_0x015b
        L_0x0156:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
        L_0x015b:
            r1 = 0
            goto L_0x0156
        L_0x015d:
            java.lang.Object r0 = r14.A01
            X.0sa r0 = (X.C62320sa) r0
            java.lang.Object r5 = r0.invoke()
            return r5
        L_0x0166:
            java.lang.Object r2 = r14.A01
            X.2is r2 = (X.C227232is) r2
            com.instagram.common.session.UserSession r1 = X.C227232is.A01(r2)
            X.0eM r0 = r2.A0m
            java.lang.Object r0 = r0.getValue()
            X.GAc r0 = (X.C51979GAc) r0
            X.GCo r5 = new X.GCo
            r5.<init>(r2, r0, r1)
            return r5
        L_0x017c:
            java.lang.Object r3 = r14.A01
            X.2is r3 = (X.C227232is) r3
            android.content.Context r2 = r3.requireContext()
            androidx.fragment.app.FragmentActivity r1 = r3.getActivity()
            if (r1 == 0) goto L_0x0194
            com.instagram.common.session.UserSession r0 = X.C227232is.A01(r3)
            X.I4A r5 = new X.I4A
            r5.<init>(r2, r1, r3, r0)
            return r5
        L_0x0194:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x019c:
            java.lang.Object r4 = r14.A01
            X.2is r4 = (X.C227232is) r4
            com.instagram.common.session.UserSession r3 = X.C227232is.A01(r4)
            r0 = 0
            X.0qQ.A0B(r3, r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325416050373574(0x810dc6000033c6, double:3.0356776087416235E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x01c0
            r0 = 36325416050439111(0x810dc6000133c7, double:3.0356776087830694E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0275
        L_0x01c0:
            com.instagram.common.session.UserSession r0 = X.C227232is.A01(r4)
            X.H3C r5 = new X.H3C
            r5.<init>(r0)
            return r5
        L_0x01ca:
            java.lang.Object r0 = r14.A01
            X.2is r0 = (X.C227232is) r0
            com.instagram.common.session.UserSession r1 = X.C227232is.A01(r0)
            com.instagram.clips.intf.ClipsViewerConfig r0 = X.C227232is.A00(r0)
            java.lang.String r0 = r0.A00
            X.GDA r5 = new X.GDA
            r5.<init>(r1, r0)
            return r5
        L_0x01de:
            java.lang.Object r3 = r14.A01
            X.2is r3 = (X.C227232is) r3
            androidx.fragment.app.FragmentActivity r2 = r3.getActivity()
            if (r2 == 0) goto L_0x01fa
            X.0eM r0 = r3.A0m
            java.lang.Object r1 = r0.getValue()
            X.GAc r1 = (X.C51979GAc) r1
            com.instagram.common.session.UserSession r0 = X.C227232is.A01(r3)
            X.GCY r5 = new X.GCY
            r5.<init>(r2, r3, r0, r1)
            return r5
        L_0x01fa:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0202:
            java.lang.Object r0 = r14.A01
            X.2is r0 = (X.C227232is) r0
            com.instagram.common.session.UserSession r0 = X.C227232is.A01(r0)
            X.93a r5 = X.AnonymousClass93Z.A01(r0)
            return r5
        L_0x020f:
            java.lang.Object r0 = r14.A01
            X.2is r0 = (X.C227232is) r0
            com.instagram.common.session.UserSession r1 = X.C227232is.A01(r0)
            com.instagram.clips.intf.ClipsViewerConfig r0 = X.C227232is.A00(r0)
            java.lang.String r0 = r0.A1H
            X.A6u r5 = new X.A6u
            r5.<init>(r1, r0)
            return r5
        L_0x0223:
            java.lang.Object r1 = r14.A01
            r0 = 0
            X.IMo r5 = new X.IMo
            r5.<init>(r1, r0)
            return r5
        L_0x022c:
            java.lang.Object r7 = r14.A01
            X.2is r7 = (X.C227232is) r7
            com.instagram.common.session.UserSession r2 = X.C227232is.A01(r7)
            r6 = 0
            X.0qQ.A0B(r2, r6)
            X.0Tu r5 = X.0Tu.A06
            r0 = 36319239892245583(0x810828004a1c4f, double:3.0317717814720894E-306)
            boolean r0 = X.182.A06(r5, r2, r0)
            if (r0 != 0) goto L_0x0257
            com.instagram.common.session.UserSession r2 = X.C227232is.A01(r7)
            X.0qQ.A0B(r2, r6)
            r0 = 36319239892114510(0x81082800481c4e, double:3.031771781389198E-306)
            boolean r0 = X.182.A06(r5, r2, r0)
            if (r0 == 0) goto L_0x0275
        L_0x0257:
            androidx.fragment.app.FragmentActivity r4 = r7.requireActivity()
            com.instagram.common.session.UserSession r3 = X.C227232is.A01(r7)
            com.instagram.common.session.UserSession r2 = X.C227232is.A01(r7)
            X.0qQ.A0B(r2, r6)
            r0 = 36600714868887521(0x82082800490fe1, double:3.209777690109208E-306)
            long r0 = X.182.A01(r5, r2, r0)
            X.2pL r5 = new X.2pL
            r5.<init>(r4, r3, r0)
            return r5
        L_0x0275:
            r5 = 0
            return r5
        L_0x0277:
            java.lang.Object r5 = r14.A01
            X.2is r5 = (X.C227232is) r5
            com.instagram.common.session.UserSession r2 = X.C227232is.A01(r5)
            X.0Tu r3 = X.0Tu.A05
            r0 = 36325789712528623(0x810e1d000034ef, double:3.035913914193093E-306)
            boolean r0 = X.182.A06(r3, r2, r0)
            com.instagram.common.session.UserSession r2 = X.C227232is.A01(r5)
            if (r0 == 0) goto L_0x02a2
            com.instagram.clips.intf.ClipsViewerConfig r0 = X.C227232is.A00(r5)
            com.instagram.clips.intf.ClipsViewerSource r1 = r0.A0J
            com.instagram.clips.intf.ClipsViewerConfig r0 = X.C227232is.A00(r5)
            boolean r0 = r0.A1Y
            X.GOy r5 = new X.GOy
            r5.<init>(r1, r2, r0)
            return r5
        L_0x02a2:
            r0 = 36325789712594160(0x810e1d000134f0, double:3.035913914234539E-306)
            boolean r4 = X.182.A06(r3, r2, r0)
            com.instagram.common.session.UserSession r3 = X.C227232is.A01(r5)
            com.instagram.clips.intf.ClipsViewerConfig r0 = X.C227232is.A00(r5)
            com.instagram.clips.intf.ClipsViewerSource r2 = r0.A0J
            com.instagram.clips.intf.ClipsViewerConfig r0 = X.C227232is.A00(r5)
            boolean r1 = r0.A1Y
            if (r4 == 0) goto L_0x02cb
            r0 = 1
            X.0qQ.A0B(r3, r0)
            r0 = 2
            X.0qQ.A0B(r2, r0)
            X.GOr r5 = new X.GOr
            r5.<init>(r2, r3, r1)
            return r5
        L_0x02cb:
            X.GAg r5 = new X.GAg
            r5.<init>(r2, r3, r1)
            return r5
        L_0x02d1:
            java.lang.Object r0 = r14.A01
            X.2is r0 = (X.C227232is) r0
            com.instagram.common.session.UserSession r0 = X.C227232is.A01(r0)
            X.AYm r5 = X.C394779yg.A00(r0)
            return r5
        L_0x02de:
            java.lang.Object r0 = r14.A01
            X.2is r0 = (X.C227232is) r0
            com.instagram.common.session.UserSession r0 = X.C227232is.A01(r0)
            X.8A2 r5 = X.AnonymousClass8A1.A01(r0)
            return r5
        L_0x02eb:
            java.lang.Object r0 = r14.A01
            X.2is r0 = (X.C227232is) r0
            com.instagram.common.session.UserSession r0 = X.C227232is.A01(r0)
            X.27r r5 = X.27p.A01(r0)
            return r5
        L_0x02f8:
            java.lang.Object r0 = r14.A01
            X.2is r0 = (X.C227232is) r0
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
            com.instagram.common.session.UserSession r1 = X.C227232is.A01(r0)
            r0 = 0
            X.80c r5 = new X.80c
            r5.<init>(r2, r1, r0, r0)
            return r5
        L_0x030b:
            java.lang.Object r5 = r14.A01
            X.2is r5 = (X.C227232is) r5
            androidx.fragment.app.FragmentActivity r4 = r5.requireActivity()
            com.instagram.common.session.UserSession r3 = X.C227232is.A01(r5)
            X.0eM r0 = r5.A0m
            java.lang.Object r2 = r0.getValue()
            X.GAc r2 = (X.C51979GAc) r2
            r1 = 33
            X.IwI r0 = new X.IwI
            r0.<init>(r5, r1)
            X.GBJ r5 = new X.GBJ
            r5.<init>(r4, r3, r2, r0)
            return r5
        L_0x032c:
            java.lang.Object r1 = r14.A01
            X.2is r1 = (X.C227232is) r1
            com.instagram.common.session.UserSession r8 = X.C227232is.A01(r1)
            com.instagram.clips.intf.ClipsViewerConfig r7 = X.C227232is.A00(r1)
            com.instagram.clips.intf.ClipsViewerConfig r0 = X.C227232is.A00(r1)
            java.lang.String r10 = r0.A1H
            java.util.List r0 = X.C51990GAn.A01
            com.instagram.common.session.UserSession r0 = X.C227232is.A01(r1)
            X.GAn r6 = new X.GAn
            r6.<init>(r0)
            r0 = 4327(0x10e7, float:6.063E-42)
            java.lang.String r9 = X.AnonymousClass000.A00(r0)
            X.GAc r5 = new X.GAc
            r5.<init>(r6, r7, r8, r9, r10)
            return r5
        L_0x0355:
            java.lang.Object r1 = r14.A01
            r0 = 4
            X.Ghx r5 = new X.Ghx
            r5.<init>(r1, r0)
            return r5
        L_0x035e:
            java.lang.Object r0 = r14.A01
            X.7Ru r0 = (X.C331647Ru) r0
            X.7Rs r0 = r0.A00
            X.0sa r0 = r0.A02
            java.lang.Object r0 = r0.invoke()
            X.07g r0 = (X.AnonymousClass07g) r0
            X.07f r5 = r0.getViewModelStore()
            return r5
        L_0x0371:
            java.lang.Object r3 = r14.A01
            X.0lg r3 = (X.0lg) r3
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322272134309920(0x810aea00002820, double:3.033689383563435E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            return r5
        L_0x0385:
            java.lang.Object r0 = r14.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.5o6 r5 = new X.5o6
            r5.<init>(r0)
            return r5
        L_0x038f:
            java.lang.Object r0 = r14.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.93a r5 = new X.93a
            r5.<init>(r0)
            return r5
        L_0x0399:
            java.lang.Object r0 = r14.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLoggingController r5 = new com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLoggingController
            r5.<init>(r0)
            return r5
        L_0x03a3:
            java.lang.Object r0 = r14.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLoggingController r5 = new com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLoggingController
            r5.<init>(r0)
            return r5
        L_0x03ad:
            java.lang.Object r0 = r14.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLoggingController r5 = new com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLoggingController
            r5.<init>(r0)
            return r5
        L_0x03b7:
            java.lang.Object r0 = r14.A01
            X.0lg r0 = (X.0lg) r0
            X.3L1 r5 = new X.3L1
            r5.<init>(r0)
            return r5
        L_0x03c1:
            java.lang.Object r0 = r14.A01
            X.0lg r0 = (X.0lg) r0
            X.4iy r5 = new X.4iy
            r5.<init>(r0)
            return r5
        L_0x03cb:
            java.lang.Object r0 = r14.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.2Cu r5 = new X.2Cu
            r5.<init>(r0)
            return r5
        L_0x03d5:
            X.2Ls r5 = X.2Ls.A01
            X.2M1 r2 = X.2M1.A00()
            X.2Ls.A00 = r2
            X.0qQ.A0A(r2)
            r0 = -1
            r2.A00 = r0
            r0 = 0
            r2.A04 = r0
            X.2M1 r2 = X.2Ls.A00
            X.0qQ.A0A(r2)
            java.lang.Object r1 = r14.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            r0 = 1
            r2.A03(r1, r0)
            return r5
        L_0x03f5:
            java.lang.Object r5 = r14.A01
            return r5
        L_0x03f8:
            X.02m r5 = X.02m.A0p
            return r5
        L_0x03fb:
            java.lang.Object r0 = r14.A01
            X.2is r0 = (X.C227232is) r0
            X.GBE r2 = r0.A09
            if (r2 == 0) goto L_0x04ab
            r1 = 0
            X.0sn r0 = X.0sn.A00
            X.GBE.A05(r2, r0, r1, r1)
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x040c:
            java.lang.Object r0 = r14.A01
            X.2is r0 = (X.C227232is) r0
            X.GBE r0 = r0.A09
            if (r0 == 0) goto L_0x04ab
            X.GE5 r5 = r0.A0u
            return r5
        L_0x0417:
            java.lang.Object r1 = r14.A01
            X.2is r1 = (X.C227232is) r1
            com.instagram.common.session.UserSession r7 = X.C227232is.A01(r1)
            androidx.fragment.app.FragmentActivity r6 = r1.requireActivity()
            X.GBE r0 = r1.A09
            java.lang.String r2 = "clipsViewerFragmentViewModel"
            if (r0 == 0) goto L_0x04ff
            X.GF2 r9 = r0.A1H
            X.JU5 r8 = r0.A0e
            r0 = 40
            X.J6f r10 = new X.J6f
            r10.<init>(r1, r0)
            r0 = 41
            X.J6f r11 = new X.J6f
            r11.<init>(r1, r0)
            X.GBL r5 = new X.GBL
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r5
        L_0x0441:
            java.lang.Object r0 = r14.A01
            X.2is r0 = (X.C227232is) r0
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
            com.instagram.common.session.UserSession r1 = X.C227232is.A01(r0)
            X.GBE r0 = r0.A09
            if (r0 == 0) goto L_0x04ab
            X.GAc r0 = r0.A19
            X.Dci r5 = new X.Dci
            r5.<init>(r2, r1, r0)
            return r5
        L_0x0459:
            java.lang.Object r2 = r14.A01
            X.2is r2 = (X.C227232is) r2
            com.instagram.common.session.UserSession r7 = X.C227232is.A01(r2)
            X.GBE r0 = r2.A09
            java.lang.String r1 = "clipsViewerFragmentViewModel"
            if (r0 == 0) goto L_0x048f
            X.GAc r8 = r0.A19
            com.instagram.clips.intf.ClipsViewerConfig r0 = X.C227232is.A00(r2)
            com.instagram.search.common.analytics.SearchContext r10 = r0.A0S
            X.GBE r0 = r2.A09
            if (r0 == 0) goto L_0x048f
            X.93T r11 = r0.A1D
            X.0eM r0 = r2.A0w
            java.lang.Object r0 = r0.getValue()
            X.A6u r0 = (X.C39729A6u) r0
            X.GF2 r13 = r0.A02
            X.GBE r0 = r2.A09
            if (r0 == 0) goto L_0x048f
            X.JU5 r9 = r0.A0e
            X.Hlh r12 = r0.A1E
            X.4h9 r6 = r0.A0S
            X.GBG r5 = new X.GBG
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            return r5
        L_0x048f:
            X.0qQ.A0F(r1)
            goto L_0x0502
        L_0x0493:
            java.lang.Object r3 = r14.A01
            X.2is r3 = (X.C227232is) r3
            com.instagram.common.session.UserSession r2 = X.C227232is.A01(r3)
            X.GBE r0 = r3.A09
            if (r0 == 0) goto L_0x04ab
            X.GAc r1 = r0.A19
            androidx.fragment.app.FragmentActivity r0 = r3.requireActivity()
            X.JU3 r5 = new X.JU3
            r5.<init>(r0, r3, r2, r1)
            return r5
        L_0x04ab:
            java.lang.String r2 = "clipsViewerFragmentViewModel"
            goto L_0x04ff
        L_0x04ae:
            java.lang.Object r1 = r14.A01
            X.2is r1 = (X.C227232is) r1
            X.0eM r0 = r1.A0m
            java.lang.Object r9 = r0.getValue()
            X.GAc r9 = (X.C51979GAc) r9
            com.instagram.common.session.UserSession r4 = X.C227232is.A01(r1)
            com.instagram.clips.intf.ClipsViewerConfig r3 = X.C227232is.A00(r1)
            X.GBE r0 = r1.A09
            java.lang.String r2 = "clipsViewerFragmentViewModel"
            if (r0 == 0) goto L_0x04ff
            X.GF2 r11 = r0.A1H
            X.93T r6 = r0.A1D
            X.Hlh r10 = r0.A1E
            X.0eM r0 = r1.A11
            java.lang.Object r8 = r0.getValue()
            X.GBG r8 = (X.GBG) r8
            X.GBE r0 = r1.A09
            if (r0 == 0) goto L_0x04ff
            X.JU5 r5 = r0.A0e
            X.4h9 r2 = r0.A0S
            X.0eM r0 = r1.A14
            java.lang.Object r7 = r0.getValue()
            X.H3C r7 = (X.H3C) r7
            X.GBH r1 = new X.GBH
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            X.9O9 r5 = new X.9O9
            r5.<init>(r1)
            return r5
        L_0x04f1:
            java.lang.Object r0 = r14.A01
            X.2is r0 = (X.C227232is) r0
            com.instagram.common.session.UserSession r1 = X.C227232is.A01(r0)
            X.Hrp r0 = r0.A0J
            if (r0 != 0) goto L_0x0507
            java.lang.String r2 = "overlayFragmentController"
        L_0x04ff:
            X.0qQ.A0F(r2)
        L_0x0502:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0507:
            X.GBN r5 = new X.GBN
            r5.<init>(r1, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9LH.invoke():java.lang.Object");
    }
}
