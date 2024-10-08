package X;

import android.os.SystemClock;
import com.instagram.adshistory.fragment.RecentAdActivityFragment;
import com.instagram.feed.ui.state.IntentAwareAdPivotState;
import com.instagram.ui.emptystaterow.EmptyStateView;
import com.instagram.ui.widget.refresh.RefreshableListView;

/* renamed from: X.H4m  reason: case insensitive filesystem */
public final class C54243H4m extends 1P0 {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public C54243H4m(int i, Object obj, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
    }

    public final void onFail(C268654dm r10) {
        int i;
        int i2;
        int i3;
        Integer num;
        switch (this.A00) {
            case 0:
                i = AnonymousClass0fD.A03(953237385);
                0qQ.A0B(r10, 0);
                C55827HoA hoA = (C55827HoA) this.A01;
                if (hoA.A02) {
                    1XQ r0 = (1XQ) r10.A00();
                    if (r0 != null) {
                        i3 = r0.mStatusCode;
                    } else {
                        i3 = 0;
                    }
                    IY1 iy1 = hoA.A03;
                    long elapsedRealtime = SystemClock.elapsedRealtime() - hoA.A00;
                    C233212vI r02 = iy1.A01;
                    if (r02 != null) {
                        r02.Cgz(i3, false, elapsedRealtime);
                    }
                    C55438Hhi hhi = hoA.A01;
                    if (hhi != null) {
                        boolean z = this.A02;
                        C54377HAs hAs = hhi.A00;
                        IntentAwareAdPivotState intentAwareAdPivotState = hAs.A00;
                        if (intentAwareAdPivotState == null) {
                            0qQ.A0F("intentAwareAdPivotState");
                            throw AnonymousClass00P.createAndThrow();
                        }
                        intentAwareAdPivotState.A0D = false;
                        C228362lW r3 = hAs.A0A.A04;
                        String str = hAs.A0B;
                        if (z) {
                            num = AnonymousClass05K.A00;
                        } else {
                            num = AnonymousClass05K.A0C;
                        }
                        r3.A03((1Xj) null, num, str);
                        if (z) {
                            hAs.A04 = false;
                        }
                        hAs.A09.DeI();
                    }
                    i2 = 2141576108;
                    break;
                } else {
                    i2 = 699476215;
                    break;
                }
            case 1:
                i = AnonymousClass0fD.A03(811561771);
                boolean z2 = this.A02;
                C56537I0m i0m = (C56537I0m) this.A01;
                if (z2) {
                    i0m.A02 = AnonymousClass05K.A0C;
                    1OC r03 = i0m.A01;
                    if (r03 != null) {
                        r03.cancel();
                        i0m.A01 = null;
                    }
                    RecentAdActivityFragment recentAdActivityFragment = i0m.A07;
                    C59689JTv.A01(recentAdActivityFragment.getContext(), (String) null, 2131972232, 1);
                    RefreshableListView refreshableListView = recentAdActivityFragment.A05;
                    if (refreshableListView != null) {
                        refreshableListView.setIsLoading(false);
                    }
                    EmptyStateView emptyStateView = recentAdActivityFragment.A04;
                    if (emptyStateView != null) {
                        emptyStateView.A0J();
                    }
                } else {
                    i0m.A02 = AnonymousClass05K.A01;
                    C59689JTv.A06(i0m.A07.getContext(), 2131952215);
                }
                i2 = -1966120407;
                break;
            case 2:
                i = AnonymousClass0fD.A03(1706119605);
                C59689JTv.A04(DbT.A08(this.A01));
                i2 = 1306310504;
                break;
            case 4:
                i = AnonymousClass0fD.A03(1548923223);
                H15 h15 = (H15) this.A01;
                H15.A01(h15);
                C55881Hp2 hp2 = h15.A09;
                if (hp2 != null) {
                    C55110HcJ.A00(hp2);
                }
                i2 = -867279801;
                break;
            default:
                C54243H4m.super.onFail(r10);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        if (r0 == 0) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFinish() {
        /*
            r4 = this;
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L_0x0009;
                case 1: goto L_0x0005;
                case 2: goto L_0x0041;
                case 3: goto L_0x0005;
                case 4: goto L_0x0062;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.C54243H4m.super.onFinish()
            return
        L_0x0009:
            r0 = -2128047567(0xffffffff81289231, float:-3.0961614E-38)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r3 = r4.A01
            X.HoA r3 = (X.C55827HoA) r3
            boolean r0 = r3.A02
            if (r0 != 0) goto L_0x001c
            r0 = 704612567(0x29ff88d7, float:1.1348013E-13)
            goto L_0x0077
        L_0x001c:
            X.IY1 r1 = r3.A03
            com.instagram.common.session.UserSession r0 = r1.A08
            boolean r0 = X.C54771HSd.A00(r0)
            if (r0 == 0) goto L_0x002e
            int r0 = r1.A00
            int r0 = r0 + -1
            r1.A00 = r0
            if (r0 != 0) goto L_0x0032
        L_0x002e:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r1.A02 = r0
        L_0x0032:
            X.Hhi r0 = r3.A01
            if (r0 == 0) goto L_0x003d
            X.HAs r0 = r0.A00
            X.JRI r0 = r0.A09
            r0.DeS()
        L_0x003d:
            r0 = 2013365441(0x780184c1, float:1.0507795E34)
            goto L_0x0077
        L_0x0041:
            r0 = -1480294881(0xffffffffa7c47e1f, float:-5.453767E-15)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r4.A01
            X.E4h r0 = (X.C47482E4h) r0
            X.2dZ r1 = r0.A02
            if (r1 != 0) goto L_0x005a
            java.lang.String r0 = "actionBarService"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x005a:
            r0 = 0
            r1.setIsLoading(r0)
            r0 = -1204393710(0xffffffffb8366912, float:-4.3490036E-5)
            goto L_0x0077
        L_0x0062:
            r0 = 75322638(0x47d550e, float:2.9779062E-36)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r4.A01
            X.H15 r0 = (X.H15) r0
            X.Hp2 r0 = r0.A09
            if (r0 == 0) goto L_0x0074
            X.C55110HcJ.A00(r0)
        L_0x0074:
            r0 = -1821256362(0xffffffff9371d556, float:-3.052366E-27)
        L_0x0077:
            X.AnonymousClass0fD.A0A(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54243H4m.onFinish():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007b, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0082, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b8, code lost:
        X.AnonymousClass0fD.A0A(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bb, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onStart() {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x0009;
                case 1: goto L_0x0005;
                case 2: goto L_0x006a;
                case 3: goto L_0x0005;
                case 4: goto L_0x008b;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.C54243H4m.super.onStart()
            return
        L_0x0009:
            r0 = 531137758(0x1fa884de, float:7.137058E-20)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r10.A01
            X.HoA r2 = (X.C55827HoA) r2
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x001d
            r0 = -1818082126(0xffffffff93a244b2, float:-4.096229E-27)
            goto L_0x00b8
        L_0x001d:
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2.A00 = r0
            X.Hhi r0 = r2.A01
            if (r0 == 0) goto L_0x0066
            boolean r9 = r10.A02
            X.HAs r8 = r0.A00
            X.GAQ r0 = r8.A0A
            r7 = 0
            r0.A08(r7, r9)
            X.2lW r6 = r0.A04
            java.lang.String r5 = r8.A0B
            if (r9 == 0) goto L_0x0052
            java.lang.Integer r1 = X.AnonymousClass05K.A00
        L_0x0039:
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            r2 = r3
            r0 = 881(0x371, float:1.235E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r6.A07(r1, r5, r0, r5)
            if (r9 != 0) goto L_0x0049
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
        L_0x0049:
            java.lang.String r1 = "AD_ID"
            java.lang.String r0 = r8.A01
            if (r0 != 0) goto L_0x0055
            java.lang.String r0 = "seedAdId"
            goto L_0x007b
        L_0x0052:
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            goto L_0x0039
        L_0x0055:
            r6.A07(r3, r5, r1, r0)
            if (r9 != 0) goto L_0x005c
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
        L_0x005c:
            java.lang.Integer r0 = X.AnonymousClass05K.A03
            r6.A01(r7, r2, r0, r5)
            X.JRI r0 = r8.A09
            r0.Dei()
        L_0x0066:
            r0 = 494192683(0x1d74c82b, float:3.2396616E-21)
            goto L_0x00b8
        L_0x006a:
            r0 = 758339212(0x2d33568c, float:1.0194189E-11)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r10.A01
            X.E4h r0 = (X.C47482E4h) r0
            X.2dZ r1 = r0.A02
            if (r1 != 0) goto L_0x0083
            java.lang.String r0 = "actionBarService"
        L_0x007b:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0083:
            r0 = 1
            r1.setIsLoading(r0)
            r0 = -1557238532(0xffffffffa32e6cfc, float:-9.455637E-18)
            goto L_0x00b8
        L_0x008b:
            r0 = -2004890658(0xffffffff887fcbde, float:-7.6975916E-34)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r10.A01
            X.H15 r0 = (X.H15) r0
            X.Hp2 r1 = r0.A09
            if (r1 == 0) goto L_0x00b5
            com.instagram.common.ui.widget.imageview.IgImageView r3 = r1.A08
            r0 = 1056964608(0x3f000000, float:0.5)
            r3.setAlpha(r0)
            android.widget.TextView r2 = r1.A03
            r2.setAlpha(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r1.A09
            r1.setAlpha(r0)
            r0 = 0
            r1.setOnClickListener(r0)
            r3.setOnClickListener(r0)
            r2.setOnClickListener(r0)
        L_0x00b5:
            r0 = -113542780(0xfffffffff93b7984, float:-6.083901E34)
        L_0x00b8:
            X.AnonymousClass0fD.A0A(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54243H4m.onStart():void");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.3mI, X.GV9] */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0272, code lost:
        if (r0.BQW().size() == 0) goto L_0x0274;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03d6, code lost:
        X.AnonymousClass0fD.A0A(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03d9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03e4, code lost:
        r14 = "adapter";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03e6, code lost:
        X.0qQ.A0F(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03ed, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r27) {
        /*
            r26 = this;
            r8 = r26
            r6 = r27
            int r0 = r8.A00
            switch(r0) {
                case 0: goto L_0x022f;
                case 1: goto L_0x0122;
                case 2: goto L_0x00ea;
                case 3: goto L_0x0089;
                case 4: goto L_0x004e;
                default: goto L_0x0009;
            }
        L_0x0009:
            r0 = 329401417(0x13a24449, float:4.0961884E-27)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.CEo r6 = (X.C43822CEo) r6
            r0 = -1834909689(0xffffffff92a18007, float:-1.019209E-27)
            int r5 = X.AnonymousClass0fD.A03(r0)
            r7 = 0
            X.0qQ.A0B(r6, r7)
            X.GlC r0 = r6.FH3()
            java.util.List r1 = r0.A01
            if (r1 == 0) goto L_0x0042
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0042
            r3 = 0
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r1 = r1.iterator()
        L_0x0034:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x03a7
            java.lang.String r0 = X.C51975G9x.A0k(r1)
            r2.add(r0)
            goto L_0x0034
        L_0x0042:
            java.lang.Object r0 = r8.A01
            X.HAr r0 = (X.C54376HAr) r0
            X.C54376HAr.A03(r0, r7)
            r0 = 1738339233(0x679cf3a1, float:1.4823667E24)
            goto L_0x03d0
        L_0x004e:
            r0 = 1315838223(0x4e6e190f, float:9.9865491E8)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = 366343863(0x15d5f6b7, float:8.641926E-26)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r8.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            boolean r0 = r1.isResumed()
            if (r0 == 0) goto L_0x007e
            android.view.View r0 = r1.mView
            if (r0 == 0) goto L_0x007e
            android.content.Context r0 = r1.getContext()
            if (r0 == 0) goto L_0x007e
            boolean r0 = r8.A02
            if (r0 == 0) goto L_0x007e
            android.content.Context r1 = r1.requireContext()
            r0 = 2131972614(0x7f135206, float:1.958224E38)
            X.C59689JTv.A07(r1, r0)
        L_0x007e:
            r0 = -623039875(0xffffffffdadd2a7d, float:-3.11263431E16)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = -981006376(0xffffffffc58707d8, float:-4320.9805)
            goto L_0x03d6
        L_0x0089:
            r0 = -1107434445(0xffffffffbdfde433, float:-0.12397041)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = -95997922(0xfffffffffa47301e, float:-2.5856075E35)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r9 = r8.A01
            X.H15 r9 = (X.H15) r9
            com.instagram.save.model.SavedCollection r5 = r9.A0C
            if (r5 == 0) goto L_0x00d1
            boolean r7 = r8.A02
            com.instagram.common.session.UserSession r6 = r9.A05
            X.0wc r1 = X.DbX.A0O(r9, r6)
            java.lang.String r0 = "ig_collections"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r7 != 0) goto L_0x00dc
            if (r0 == 0) goto L_0x00d1
            java.lang.String r1 = r9.getModuleName()
            java.lang.String r0 = "module_name"
            r2.AAJ(r0, r1)
            java.lang.String r1 = "collection_like"
        L_0x00c0:
            java.lang.String r0 = "event"
            java.lang.String r1 = X.C51975G9x.A0g(r2, r5, r0, r1)
            java.lang.String r0 = "collection_type"
            X.C51973G9u.A14(r2, r0, r1)
            X.I35.A02(r2, r6, r5)
            r2.Cgf()
        L_0x00d1:
            r0 = -1404922762(0xffffffffac429476, float:-2.765147E-12)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = 1190463070(0x46f5065e, float:31363.184)
            goto L_0x03d6
        L_0x00dc:
            if (r0 == 0) goto L_0x00d1
            java.lang.String r1 = r9.getModuleName()
            java.lang.String r0 = "module_name"
            r2.AAJ(r0, r1)
            java.lang.String r1 = "collection_unlike"
            goto L_0x00c0
        L_0x00ea:
            r0 = -126549675(0xfffffffff8750155, float:-1.9877184E34)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = -1410880865(0xffffffffabe7aa9f, float:-1.6460894E-12)
            int r5 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r3 = r8.A01
            X.E4h r3 = (X.C47482E4h) r3
            boolean r0 = r3.A08
            if (r0 != 0) goto L_0x0110
            X.0eM r0 = r3.A0D
            X.1Ng r2 = X.DbX.A0R(r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            X.6ur r0 = new X.6ur
            r0.<init>(r1)
            r2.A00(r0)
        L_0x0110:
            boolean r0 = r8.A02
            if (r0 == 0) goto L_0x0117
            X.DbT.A1J(r3)
        L_0x0117:
            r0 = 1652544339(0x627fd353, float:1.1797868E21)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = -2066153838(0xffffffff84d8fe92, float:-5.1015142E-36)
            goto L_0x03d6
        L_0x0122:
            r0 = -1156920583(0xffffffffbb0acaf9, float:-0.002117811)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.Gz0 r6 = (X.C54076Gz0) r6
            r0 = 1217505854(0x4891aa3e, float:298321.94)
            int r2 = X.AnonymousClass0fD.A03(r0)
            r4 = 0
            X.0qQ.A0B(r6, r4)
            java.lang.Object r5 = r8.A01
            X.I0m r5 = (X.C56537I0m) r5
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r5.A02 = r0
            boolean r0 = r6.A03
            r5.A05 = r0
            if (r0 == 0) goto L_0x014c
            java.lang.String r0 = r6.A01
            r5.A04 = r0
            java.lang.String r0 = r6.A00
            r5.A03 = r0
        L_0x014c:
            boolean r0 = r8.A02
            if (r0 == 0) goto L_0x01fe
            r5.A00 = r6
            com.instagram.adshistory.fragment.RecentAdActivityFragment r1 = r5.A07
            com.instagram.ui.widget.refresh.RefreshableListView r0 = r1.A05
            if (r0 == 0) goto L_0x015b
            r0.setIsLoading(r4)
        L_0x015b:
            java.util.List r0 = r6.A02
            if (r0 == 0) goto L_0x0165
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)
            if (r0 != 0) goto L_0x016c
        L_0x0165:
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of()
            X.0qQ.A07(r0)
        L_0x016c:
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x01cc
            com.instagram.ui.emptystaterow.EmptyStateView r0 = r1.A04
            if (r0 == 0) goto L_0x0179
            r0.A0I()
        L_0x0179:
            java.util.List r0 = r6.A02
            com.instagram.common.session.UserSession r9 = r5.A08
            java.lang.String r10 = "ads_history_data_fetcher"
            X.0xG r8 = X.DbS.A0O(r10)
            if (r0 != 0) goto L_0x01c7
            r1 = 0
        L_0x0186:
            java.lang.String r11 = "makeFeedRequest"
            X.HOF r7 = X.HOF.SEEN
            java.util.ArrayList r12 = X.AnonymousClass7TE.A1C()
            if (r1 == 0) goto L_0x021f
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x021f
            java.util.Iterator r6 = r1.iterator()
        L_0x019a:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x021f
            X.1Xj r0 = X.C51966G9m.A0t(r6)
            java.lang.String r0 = X.C231122qu.A07(r9, r0)
            java.lang.Long r5 = X.DbZ.A0d(r0)
            X.Gjj r4 = new X.Gjj
            r4.<init>()
            long r0 = X.AnonymousClass7TG.A0I()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "timestamp"
            r4.A05(r0, r1)
            java.lang.String r0 = "ad_id"
            r4.A05(r0, r5)
            r12.add(r4)
            goto L_0x019a
        L_0x01c7:
            java.util.List r1 = X.1Xi.A03(r0)
            goto L_0x0186
        L_0x01cc:
            X.H3s r4 = r1.A00
            if (r4 == 0) goto L_0x03e4
            java.util.List r0 = r6.A02
            if (r0 == 0) goto L_0x01da
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)
            if (r0 != 0) goto L_0x01e1
        L_0x01da:
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of()
            X.0qQ.A07(r0)
        L_0x01e1:
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x021a
            X.2rV r1 = r4.A01
            java.util.List r0 = r6.A02
            if (r0 == 0) goto L_0x01f3
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)
            if (r0 != 0) goto L_0x01fa
        L_0x01f3:
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of()
            X.0qQ.A07(r0)
        L_0x01fa:
            r1.A0A(r0)
            goto L_0x021a
        L_0x01fe:
            com.instagram.adshistory.fragment.RecentAdActivityFragment r0 = r5.A07
            X.H3s r4 = r0.A00
            if (r4 == 0) goto L_0x03e4
            java.util.List r0 = r6.A02
            if (r0 == 0) goto L_0x020e
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)
            if (r1 != 0) goto L_0x0215
        L_0x020e:
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of()
            X.0qQ.A07(r1)
        L_0x0215:
            X.2rV r0 = r4.A01
            r0.A0A(r1)
        L_0x021a:
            r4.A0C()
            goto L_0x0179
        L_0x021f:
            X.C55086Hbv.A00(r7, r8, r9, r10, r11, r12)
            r0 = 1514584366(0x5a46b92e, float:1.39839132E16)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = -597545106(0xffffffffdc622f6e, float:-2.54661977E17)
            X.AnonymousClass0fD.A0A(r0, r3)
            return
        L_0x022f:
            r0 = -1355798071(0xffffffffaf3029c9, float:-1.6021952E-10)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.Gz1 r6 = (X.C54077Gz1) r6
            r0 = -240866015(0xfffffffff1a4ad21, float:-1.630875E30)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r15 = 0
            X.0qQ.A0B(r6, r15)
            java.lang.Object r7 = r8.A01
            X.HoA r7 = (X.C55827HoA) r7
            boolean r0 = r7.A02
            if (r0 != 0) goto L_0x0256
            r0 = 535453928(0x1fea60e8, float:9.926317E-20)
        L_0x024e:
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = 533373810(0x1fcaa372, float:8.5820725E-20)
            goto L_0x03d6
        L_0x0256:
            com.instagram.common.session.UserSession r0 = r7.A04
            boolean r0 = X.C54771HSd.A00(r0)
            r25 = 1
            if (r0 == 0) goto L_0x02cc
            boolean r0 = r8.A02
            if (r0 != 0) goto L_0x02cc
            instagram.features.feed.fragment.ContextualFeedFragment r0 = r7.A05
            X.HDB r0 = r0.A0N
            if (r0 == 0) goto L_0x03e4
            java.util.List r0 = r0.BQW()
            int r0 = r0.size()
            if (r0 != 0) goto L_0x02cc
        L_0x0274:
            instagram.features.feed.fragment.ContextualFeedFragment r0 = r7.A05
            X.HDB r0 = r0.A0N
            if (r0 == 0) goto L_0x03e4
            java.util.List r0 = r0.BQW()
            int r5 = r0.size()
            java.util.List r0 = r6.A0B
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r9 = r0.iterator()
        L_0x028c:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x02cf
            java.lang.Object r0 = r9.next()
            X.Hpk r0 = (X.C55923Hpk) r0
            X.GV9 r1 = new X.GV9
            r1.<init>()
            X.1Xj r0 = r0.A00()
            r1.A0L = r0
            r12 = 0
            r20 = 16383(0x3fff, float:2.2957E-41)
            X.2vl r11 = new X.2vl
            r13 = r12
            r14 = r12
            r16 = r15
            r17 = r15
            r18 = r15
            r19 = r15
            r21 = r15
            r22 = r15
            r23 = r15
            r24 = r15
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r11.A0B(r5)
            r1.A00 = r11
            int r5 = r5 + 1
            X.GV8 r0 = r1.A01()
            r2.add(r0)
            goto L_0x028c
        L_0x02cc:
            r25 = 0
            goto L_0x0274
        L_0x02cf:
            X.IY1 r5 = r7.A03
            int r9 = r6.mStatusCode
            long r20 = android.os.SystemClock.elapsedRealtime()
            long r0 = r7.A00
            long r20 = r20 - r0
            boolean r1 = r8.A02
            X.2vI r0 = r5.A01
            if (r0 == 0) goto L_0x02ee
            X.4LN r17 = X.AnonymousClass4LN.A0D
            r22 = r15
            r16 = r0
            r18 = r2
            r19 = r9
            r16.Ch2(r17, r18, r19, r20, r22)
        L_0x02ee:
            com.instagram.common.session.UserSession r0 = r5.A08
            boolean r0 = X.C54771HSd.A00(r0)
            if (r0 == 0) goto L_0x0302
            if (r1 == 0) goto L_0x0302
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0302
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r5.A02 = r0
        L_0x0302:
            X.Hhi r0 = r7.A01
            if (r0 == 0) goto L_0x039b
            X.HAs r9 = r0.A00
            com.instagram.feed.ui.state.IntentAwareAdPivotState r7 = r9.A00
            java.lang.String r14 = "intentAwareAdPivotState"
            if (r7 == 0) goto L_0x03e6
            boolean r0 = r6.A0D
            r7.A0D = r0
            X.GAQ r0 = r9.A0A
            X.2lW r12 = r0.A04
            java.lang.String r11 = r9.A0B
            if (r1 == 0) goto L_0x038d
            java.lang.Integer r13 = X.AnonymousClass05K.A00
        L_0x031c:
            java.lang.Integer r10 = X.AnonymousClass05K.A0C
            java.lang.String r7 = "IS_EMPTY"
            java.util.List r0 = r6.A0B
            boolean r0 = r0.isEmpty()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r8 = 0
            r12.A07(r13, r11, r7, r0)
            if (r1 != 0) goto L_0x038a
            java.lang.String r24 = "IS_TAIL_LOAD_BEFORE_HEAD_LOAD"
            r21 = r8
            r22 = r10
            r23 = r11
            r20 = r12
            r20.A06(r21, r22, r23, r24, r25)
            r7 = r10
        L_0x033e:
            java.lang.Integer r0 = X.AnonymousClass05K.A04
            r12.A01(r8, r7, r0, r11)
            if (r1 == 0) goto L_0x0347
            java.lang.Integer r10 = X.AnonymousClass05K.A00
        L_0x0347:
            r12.A02(r8, r10, r11)
            if (r1 == 0) goto L_0x034e
            r9.A04 = r15
        L_0x034e:
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.List r0 = r6.A0B
            java.util.Iterator r11 = r0.iterator()
        L_0x0358:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0390
            java.lang.Object r6 = r11.next()
            X.Hpk r6 = (X.C55923Hpk) r6
            X.1Xj r0 = r6.A00()
            r7.add(r0)
            X.1Xj r0 = r6.A00()
            java.lang.String r10 = r0.getId()
            java.util.Set r6 = r9.A0C
            boolean r0 = X.00k.A0u(r6, r10)
            if (r0 != 0) goto L_0x0358
            if (r10 == 0) goto L_0x03df
            r6.add(r10)
            com.instagram.feed.ui.state.IntentAwareAdPivotState r0 = r9.A00
            if (r0 == 0) goto L_0x03e6
            java.util.List r0 = r0.A0F
            r0.add(r10)
            goto L_0x0358
        L_0x038a:
            java.lang.Integer r7 = X.AnonymousClass05K.A00
            goto L_0x033e
        L_0x038d:
            java.lang.Integer r13 = X.AnonymousClass05K.A0C
            goto L_0x031c
        L_0x0390:
            X.JRI r0 = r9.A09
            r9 = r0
            r10 = r8
            r11 = r8
            r12 = r7
            r13 = r15
            r14 = r1
            r9.Dex(r10, r11, r12, r13, r14)
        L_0x039b:
            if (r25 != 0) goto L_0x03a2
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r5.Dlz(r0, r2)
        L_0x03a2:
            r0 = 1734847269(0x6767ab25, float:1.0940237E24)
            goto L_0x024e
        L_0x03a7:
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1D(r2)
            java.util.List r1 = X.00k.A0X(r0)
            boolean r0 = X.AnonymousClass7TE.A1b(r1)
            if (r0 == 0) goto L_0x03cd
            java.lang.Object r2 = r8.A01
            X.HAr r2 = (X.C54376HAr) r2
            r2.A03 = r1
            boolean r0 = r8.A02
            r2.A0Q(r0, r7)
            X.GlC r0 = r6.FH3()
            java.lang.String r1 = r0.A00
            if (r1 == 0) goto L_0x03da
            r0 = 1
            r2.A04 = r0
            r2.A01 = r1
        L_0x03cd:
            r0 = 1423637034(0x54dafa2a, float:7.5239994E12)
        L_0x03d0:
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = -1455195869(0xffffffffa9437923, float:-4.3403767E-14)
        L_0x03d6:
            X.AnonymousClass0fD.A0A(r0, r4)
            return
        L_0x03da:
            r2.A04 = r7
            r2.A01 = r3
            goto L_0x03cd
        L_0x03df:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x03e4:
            java.lang.String r14 = "adapter"
        L_0x03e6:
            X.0qQ.A0F(r14)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54243H4m.onSuccess(java.lang.Object):void");
    }
}
