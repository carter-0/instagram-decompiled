package X;

import androidx.recyclerview.widget.RecyclerView;

public final class UB1 extends C249403jg {
    public final int A00;
    public final Object A01;

    public UB1(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(RecyclerView recyclerView, Object obj, int i) {
        recyclerView.A15(new UB1(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0238, code lost:
        X.AnonymousClass0fD.A0A(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x023b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x023c, code lost:
        r0 = "inlineSearchBox";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x023e, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0245, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x025a, code lost:
        X.AnonymousClass0fD.A0A(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x025d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView r13, int r14) {
        /*
            r12 = this;
            int r0 = r12.A00
            switch(r0) {
                case 2: goto L_0x0246;
                case 3: goto L_0x0193;
                case 4: goto L_0x0179;
                case 5: goto L_0x0005;
                case 6: goto L_0x0160;
                case 7: goto L_0x0149;
                case 8: goto L_0x012a;
                case 9: goto L_0x0005;
                case 10: goto L_0x0005;
                case 11: goto L_0x0005;
                case 12: goto L_0x00e8;
                case 13: goto L_0x00d9;
                case 14: goto L_0x0005;
                case 15: goto L_0x00c0;
                case 16: goto L_0x021d;
                case 17: goto L_0x00a3;
                case 18: goto L_0x0086;
                case 19: goto L_0x0005;
                case 20: goto L_0x0069;
                case 21: goto L_0x0040;
                case 22: goto L_0x001f;
                case 23: goto L_0x0005;
                case 24: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.onScrollStateChanged(r13, r14)
            return
        L_0x0009:
            r0 = 1037765560(0x3ddb0bb8, float:0.106955945)
            int r4 = X.AnonymousClass7TG.A0D(r13, r0)
            java.lang.Object r0 = r12.A01
            com.instagram.shopping.widget.pdp.herocarousel.HeroCarouselScrollbarView r0 = (com.instagram.shopping.widget.pdp.herocarousel.HeroCarouselScrollbarView) r0
            com.instagram.shopping.widget.pdp.herocarousel.HeroCarouselScrollbarView.A01(r0)
            com.instagram.shopping.widget.pdp.herocarousel.HeroCarouselScrollbarView.A00(r13, r0)
            r0 = 1373106450(0x51d7f112, float:1.15932807E11)
            goto L_0x0238
        L_0x001f:
            r0 = 960914781(0x3946655d, float:1.8920512E-4)
            int r4 = X.AnonymousClass7TG.A0D(r13, r0)
            super.onScrollStateChanged(r13, r14)
            java.lang.Object r0 = r12.A01
            X.Uam r0 = (X.C15337Uam) r0
            com.instagram.igds.components.search.IgdsInlineSearchBox r1 = r0.A02
            if (r1 != 0) goto L_0x0035
            java.lang.String r0 = "searchBox"
            goto L_0x023e
        L_0x0035:
            r0 = 1
            if (r14 != r0) goto L_0x003b
            r1.A03()
        L_0x003b:
            r0 = -1549845249(0xffffffffa39f3cff, float:-1.7264647E-17)
            goto L_0x0238
        L_0x0040:
            r0 = -330768736(0xffffffffec48dea0, float:-9.713459E26)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r3 = 0
            X.0qQ.A0B(r13, r3)
            super.onScrollStateChanged(r13, r14)
            java.lang.Object r2 = r12.A01
            X.Uai r2 = (X.C15333Uai) r2
            X.6rV r1 = r2.A01
            X.0YZ[] r0 = X.C15333Uai.A0E
            r0 = r0[r3]
            java.lang.Object r1 = r1.A03(r2, r0)
            com.instagram.igds.components.search.IgdsInlineSearchBox r1 = (com.instagram.igds.components.search.IgdsInlineSearchBox) r1
            r0 = 1
            if (r14 != r0) goto L_0x0064
            r1.A03()
        L_0x0064:
            r0 = 1719663642(0x667ffc1a, float:3.0221348E23)
            goto L_0x0238
        L_0x0069:
            r0 = 1238095805(0x49cbd7bd, float:1669879.6)
            int r4 = X.AnonymousClass7TG.A0D(r13, r0)
            super.onScrollStateChanged(r13, r14)
            java.lang.Object r0 = r12.A01
            X.Uaj r0 = (X.C15334Uaj) r0
            com.instagram.igds.components.search.IgdsInlineSearchBox r1 = r0.A07
            if (r1 == 0) goto L_0x023c
            r0 = 1
            if (r14 != r0) goto L_0x0081
            r1.A03()
        L_0x0081:
            r0 = -1696283794(0xffffffff9ae4c36e, float:-9.4614324E-23)
            goto L_0x0238
        L_0x0086:
            r0 = -637203292(0xffffffffda050ca4, float:-9.3625176E15)
            int r4 = X.AnonymousClass7TG.A0D(r13, r0)
            super.onScrollStateChanged(r13, r14)
            java.lang.Object r0 = r12.A01
            X.Uaq r0 = (X.C15340Uaq) r0
            com.instagram.igds.components.search.IgdsInlineSearchBox r1 = r0.A00
            if (r1 == 0) goto L_0x023c
            r0 = 1
            if (r14 != r0) goto L_0x009e
            r1.A03()
        L_0x009e:
            r0 = -926818285(0xffffffffc8c1e013, float:-397056.6)
            goto L_0x0238
        L_0x00a3:
            r0 = -1193620479(0xffffffffb8dacc01, float:-1.0433049E-4)
            int r4 = X.AnonymousClass7TG.A0D(r13, r0)
            super.onScrollStateChanged(r13, r14)
            java.lang.Object r0 = r12.A01
            X.Uan r0 = (X.C15338Uan) r0
            com.instagram.igds.components.search.IgdsInlineSearchBox r1 = r0.A04
            if (r1 == 0) goto L_0x00bb
            r0 = 1
            if (r14 != r0) goto L_0x00bb
            r1.A03()
        L_0x00bb:
            r0 = 1280144026(0x4c4d729a, float:5.3856872E7)
            goto L_0x0238
        L_0x00c0:
            r0 = 1258856045(0x4b089e6d, float:8953453.0)
            int r4 = X.AnonymousClass7TG.A0D(r13, r0)
            super.onScrollStateChanged(r13, r14)
            java.lang.Object r1 = r12.A01
            com.instagram.igds.components.search.IgdsInlineSearchBox r1 = (com.instagram.igds.components.search.IgdsInlineSearchBox) r1
            r0 = 1
            if (r14 != r0) goto L_0x00d4
            r1.A03()
        L_0x00d4:
            r0 = 2081268505(0x7c0da319, float:2.9416875E36)
            goto L_0x0238
        L_0x00d9:
            r0 = -1947372702(0xffffffff8bed7362, float:-9.146269E-32)
            int r4 = X.AnonymousClass0fD.A03(r0)
            super.onScrollStateChanged(r13, r14)
            r0 = 2055515395(0x7a84ad03, float:3.4444614E35)
            goto L_0x0238
        L_0x00e8:
            r0 = -1657631769(0xffffffff9d328be7, float:-2.3630432E-21)
            int r6 = X.AnonymousClass0fD.A03(r0)
            r0 = 0
            X.0qQ.A0B(r13, r0)
            super.onScrollStateChanged(r13, r14)
            if (r14 == 0) goto L_0x0106
            r1 = 1
            if (r14 != r1) goto L_0x0101
            java.lang.Object r0 = r12.A01
            X.Wan r0 = (X.C19501Wan) r0
            r0.A03 = r1
        L_0x0101:
            r0 = -649596872(0xffffffffd947f038, float:-3.51735273E15)
            goto L_0x025a
        L_0x0106:
            java.lang.Object r5 = r12.A01
            X.Wan r5 = (X.C19501Wan) r5
            r5.A03 = r0
            boolean r0 = r5.A04
            if (r0 != 0) goto L_0x0101
            X.Vtm r4 = X.XAT.A00
            android.content.Context r3 = r5.A0A
            r2 = 2131967806(0x7f133f3e, float:1.9572489E38)
            int r1 = r5.A01
            int r0 = r5.A02
            java.lang.String r1 = r4.A00(r3, r2, r1, r0)
            android.view.View r0 = r5.A0C
            X.2eQ.A07(r0, r1)
            X.8a5 r0 = r5.A0F
            r0.DhZ(r5)
            goto L_0x0101
        L_0x012a:
            r0 = -1720693832(0xffffffff99704bb8, float:-1.24230005E-23)
            int r4 = X.AnonymousClass7TG.A0D(r13, r0)
            if (r14 != 0) goto L_0x0142
            java.lang.Object r1 = r12.A01
            X.713 r1 = (X.AnonymousClass713) r1
            X.3pI r0 = r13.A0D
            if (r0 == 0) goto L_0x0147
            android.os.Parcelable r0 = r0.A1M()
        L_0x013f:
            r1.DU6(r0)
        L_0x0142:
            r0 = 198978286(0xbdc2aee, float:8.480551E-32)
            goto L_0x0238
        L_0x0147:
            r0 = 0
            goto L_0x013f
        L_0x0149:
            r0 = 519290148(0x1ef3bd24, float:2.5806853E-20)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = 1
            if (r14 != r0) goto L_0x015b
            java.lang.Object r1 = r12.A01
            com.instagram.discovery.mediamap.fragment.LocationSearchFragment r1 = (com.instagram.discovery.mediamap.fragment.LocationSearchFragment) r1
            r0 = 0
            com.instagram.discovery.mediamap.fragment.LocationSearchFragment.A01(r1, r0)
        L_0x015b:
            r0 = 805064401(0x2ffc4ed1, float:4.5894535E-10)
            goto L_0x0238
        L_0x0160:
            r0 = -1690316096(0xffffffff9b3fd2c0, float:-1.5867247E-22)
            int r4 = X.AnonymousClass0fD.A03(r0)
            if (r14 == 0) goto L_0x0174
            java.lang.Object r0 = r12.A01
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment r0 = (com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment) r0
            android.view.View r0 = r0.mMainView
            if (r0 == 0) goto L_0x0174
            X.0nA.A0N(r0)
        L_0x0174:
            r0 = -1699315074(0xffffffff9ab6827e, float:-7.548426E-23)
            goto L_0x0238
        L_0x0179:
            r0 = -1396178329(0xffffffffacc80267, float:-5.6846086E-12)
            int r4 = X.AnonymousClass0fD.A03(r0)
            if (r14 != 0) goto L_0x018e
            java.lang.Object r0 = r12.A01
            X.Ugx r0 = (X.C15692Ugx) r0
            android.os.Handler r3 = r0.A03
            r2 = 0
            r0 = 200(0xc8, double:9.9E-322)
            r3.sendEmptyMessageDelayed(r2, r0)
        L_0x018e:
            r0 = -1085739109(0xffffffffbf48ef9b, float:-0.7849061)
            goto L_0x0238
        L_0x0193:
            r0 = -1507862182(0xffffffffa61fd95a, float:-5.5458773E-16)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r7 = 0
            X.0qQ.A0B(r13, r7)
            X.3pI r11 = r13.A0D
            java.lang.String r6 = "Required value was null."
            if (r11 == 0) goto L_0x0208
            androidx.recyclerview.widget.LinearLayoutManager r11 = (androidx.recyclerview.widget.LinearLayoutManager) r11
            int r8 = r11.A1a()
            X.2Rw r9 = r13.A0A
            if (r9 == 0) goto L_0x01ff
            android.widget.Adapter r9 = (android.widget.Adapter) r9
            java.lang.Object r5 = r12.A01
            X.Ugs r5 = (X.C15687Ugs) r5
            int r0 = r5.A00
            if (r8 <= r0) goto L_0x01d1
            java.util.List r10 = r5.A02
            int r3 = r10.size()
            r2 = 0
        L_0x01bf:
            if (r2 >= r3) goto L_0x01e8
            java.lang.Object r1 = r10.get(r2)
            X.2wk r1 = (X.C233952wk) r1
            int r0 = r11.A1b()
            r1.A02(r9, r0)
            int r2 = r2 + 1
            goto L_0x01bf
        L_0x01d1:
            if (r8 >= r0) goto L_0x01e8
            java.util.List r3 = r5.A02
            int r2 = r3.size()
            r1 = 0
        L_0x01da:
            if (r1 >= r2) goto L_0x01e8
            java.lang.Object r0 = r3.get(r1)
            X.2wk r0 = (X.C233952wk) r0
            r0.A03(r9, r8)
            int r1 = r1 + 1
            goto L_0x01da
        L_0x01e8:
            r5.A00 = r8
            X.3Cr r1 = r5.A01
            if (r1 == 0) goto L_0x0211
            if (r14 != 0) goto L_0x01fb
            r0 = 1
            r1.setEnabled(r0)
            r1.A00()
        L_0x01f7:
            r0 = 455490255(0x1b263acf, float:1.37502E-22)
            goto L_0x0238
        L_0x01fb:
            r1.setEnabled(r7)
            goto L_0x01f7
        L_0x01ff:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r6)
            r0 = -1413707263(0xffffffffabbc8a01, float:-1.3396507E-12)
            goto L_0x0219
        L_0x0208:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r6)
            r0 = -682001580(0xffffffffd7597b54, float:-2.39123713E14)
            goto L_0x0219
        L_0x0211:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r6)
            r0 = -403230544(0xffffffffe7f730b0, float:-2.3346453E24)
        L_0x0219:
            X.AnonymousClass0fD.A0A(r0, r4)
            throw r1
        L_0x021d:
            r0 = 1759615354(0x68e1997a, float:8.522909E24)
            int r4 = X.AnonymousClass7TG.A0D(r13, r0)
            super.onScrollStateChanged(r13, r14)
            java.lang.Object r0 = r12.A01
            X.Uar r0 = (X.C15341Uar) r0
            com.instagram.igds.components.search.IgdsInlineSearchBox r1 = r0.A02
            if (r1 == 0) goto L_0x023c
            r0 = 1
            if (r14 != r0) goto L_0x0235
            r1.A03()
        L_0x0235:
            r0 = 1580924582(0x5e3afea6, float:3.36859741E18)
        L_0x0238:
            X.AnonymousClass0fD.A0A(r0, r4)
            return
        L_0x023c:
            java.lang.String r0 = "inlineSearchBox"
        L_0x023e:
            X.0qQ.A0F(r0)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x0246:
            r0 = -157057666(0xfffffffff6a37d7e, float:-1.6579876E33)
            int r6 = X.AnonymousClass0fD.A03(r0)
            r0 = 1
            if (r14 != r0) goto L_0x0257
            java.lang.Object r0 = r12.A01
            com.instagram.archive.fragment.ArchiveReelCalendarFragment r0 = (com.instagram.archive.fragment.ArchiveReelCalendarFragment) r0
            com.instagram.archive.fragment.ArchiveReelCalendarFragment.A02(r0)
        L_0x0257:
            r0 = -108514031(0xfffffffff9883511, float:-8.840359E34)
        L_0x025a:
            X.AnonymousClass0fD.A0A(r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UB1.onScrollStateChanged(androidx.recyclerview.widget.RecyclerView, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:135:0x031b, code lost:
        X.AnonymousClass0fD.A0A(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x031e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x04d9, code lost:
        if (r9 < r4.A0H) goto L_0x04db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x04eb, code lost:
        if (r6 < r4.A0H) goto L_0x04ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0500, code lost:
        X.AnonymousClass0fD.A0A(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0503, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x025d, code lost:
        if (r1.A02 != false) goto L_0x025f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x026c, code lost:
        if (r1.A02 != false) goto L_0x026e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x026e, code lost:
        X.C15339Uap.A00(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x027c, code lost:
        X.AnonymousClass0fD.A0A(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x027f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onScrolled(androidx.recyclerview.widget.RecyclerView r16, int r17, int r18) {
        /*
            r15 = this;
            int r0 = r15.A00
            r7 = r16
            r8 = r17
            r3 = r18
            switch(r0) {
                case 0: goto L_0x04b5;
                case 1: goto L_0x0492;
                case 2: goto L_0x000b;
                case 3: goto L_0x000b;
                case 4: goto L_0x0334;
                case 5: goto L_0x0280;
                case 6: goto L_0x0272;
                case 7: goto L_0x000b;
                case 8: goto L_0x000b;
                case 9: goto L_0x0247;
                case 10: goto L_0x01e0;
                case 11: goto L_0x017a;
                case 12: goto L_0x0109;
                case 13: goto L_0x00d5;
                case 14: goto L_0x0081;
                case 15: goto L_0x000b;
                case 16: goto L_0x000b;
                case 17: goto L_0x000b;
                case 18: goto L_0x000b;
                case 19: goto L_0x0068;
                case 20: goto L_0x000b;
                case 21: goto L_0x000b;
                case 22: goto L_0x000b;
                case 23: goto L_0x004c;
                case 24: goto L_0x0036;
                case 25: goto L_0x000f;
                default: goto L_0x000b;
            }
        L_0x000b:
            super.onScrolled(r7, r8, r3)
            return
        L_0x000f:
            r0 = -546253341(0xffffffffdf70d5e3, float:-1.7354026E19)
            int r2 = X.AnonymousClass7TG.A0D(r7, r0)
            X.3pI r0 = r7.A0D
            if (r0 == 0) goto L_0x002b
            android.os.Parcelable r1 = r0.A1M()
            if (r1 == 0) goto L_0x0026
            java.lang.Object r0 = r15.A01
            X.VZd r0 = (X.C17524VZd) r0
            r0.A00 = r1
        L_0x0026:
            r0 = -262107120(0xfffffffff0609010, float:-2.7799521E29)
            goto L_0x027c
        L_0x002b:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = -1023899348(0xffffffffc2f8892c, float:-124.267914)
            X.AnonymousClass0fD.A0A(r0, r2)
            throw r1
        L_0x0036:
            r0 = 779621291(0x2e7813ab, float:5.640614E-11)
            int r4 = X.AnonymousClass7TG.A0D(r7, r0)
            java.lang.Object r0 = r15.A01
            com.instagram.shopping.widget.pdp.herocarousel.HeroCarouselScrollbarView r0 = (com.instagram.shopping.widget.pdp.herocarousel.HeroCarouselScrollbarView) r0
            com.instagram.shopping.widget.pdp.herocarousel.HeroCarouselScrollbarView.A01(r0)
            com.instagram.shopping.widget.pdp.herocarousel.HeroCarouselScrollbarView.A00(r7, r0)
            r0 = 1768803877(0x696dce25, float:1.7968057E25)
            goto L_0x031b
        L_0x004c:
            r0 = 1200446846(0x478d5d7e, float:72378.984)
            int r4 = X.AnonymousClass7TG.A0D(r7, r0)
            X.3pI r0 = r7.A0D
            if (r0 == 0) goto L_0x0063
            android.os.Parcelable r1 = r0.A1M()
            if (r1 == 0) goto L_0x0063
            java.lang.Object r0 = r15.A01
            X.VTs r0 = (X.C17391VTs) r0
            r0.A00 = r1
        L_0x0063:
            r0 = -2043089620(0xffffffff8638ed2c, float:-3.47808E-35)
            goto L_0x031b
        L_0x0068:
            r0 = 1632313392(0x614b2030, float:2.3418803E20)
            int r4 = X.AnonymousClass7TG.A0D(r7, r0)
            super.onScrolled(r7, r8, r3)
            java.lang.Object r2 = r15.A01
            X.Ub7 r2 = (X.C15356Ub7) r2
            float r1 = r2.A00
            float r0 = (float) r3
            float r1 = r1 + r0
            r2.A00 = r1
            r0 = -944916265(0xffffffffc7adb8d7, float:-88945.68)
            goto L_0x031b
        L_0x0081:
            r0 = 602707155(0x23ec94d3, float:2.56502E-17)
            int r4 = X.AnonymousClass0fD.A03(r0)
            super.onScrolled(r7, r8, r3)
            r8 = 1
            boolean r0 = r7.canScrollVertically(r8)
            if (r0 != 0) goto L_0x00d0
            java.lang.Object r1 = r15.A01
            com.instagram.shopping.fragment.destination.productcollection.ProductCollectionFragment r1 = (com.instagram.shopping.fragment.destination.productcollection.ProductCollectionFragment) r1
            X.Wej r0 = r1.A0C
            X.6z9 r0 = r0.A01
            boolean r0 = r0.A05()
            if (r0 != 0) goto L_0x00d0
            java.lang.String r7 = r1.A0I
            if (r7 == 0) goto L_0x00d0
            X.W2p r6 = r1.A07
            X.57K r5 = r1.A02
            java.lang.String r3 = r1.A0F
            X.0qQ.A0B(r5, r8)
            boolean r0 = r6.A00
            if (r0 != 0) goto L_0x00ce
            X.0wc r1 = r6.A02
            java.lang.String r0 = "instagram_shopping_product_collection_page_feed_end_impression"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r1 = r2.isSampled()
            r0 = 0
            if (r1 == 0) goto L_0x00ce
            X.327 r0 = X.C18802W2p.A02(r6, r0)
            X.C13988Tno.A17(r2, r0)
            X.4Ny r0 = X.C18802W2p.A03(r2, r5, r6, r7, r3)
            X.C18802W2p.A04(r0, r2, r6)
        L_0x00ce:
            r6.A00 = r8
        L_0x00d0:
            r0 = 1571247037(0x5da753bd, float:1.50714855E18)
            goto L_0x031b
        L_0x00d5:
            r0 = 1260999770(0x4b29545a, float:1.1097178E7)
            int r4 = X.AnonymousClass0fD.A03(r0)
            super.onScrolled(r7, r8, r3)
            java.lang.Object r6 = r15.A01
            X.VTd r6 = (X.C17376VTd) r6
            java.util.Set r0 = r6.A01
            java.util.Iterator r5 = r0.iterator()
        L_0x00e9:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0104
            java.lang.Object r2 = r5.next()
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            if (r2 == r7) goto L_0x00e9
            X.3jg r1 = r6.A00
            r2.A16(r1)
            r0 = 0
            r2.scrollBy(r0, r3)
            r2.A15(r1)
            goto L_0x00e9
        L_0x0104:
            r0 = 1898524065(0x71292da1, float:8.3773006E29)
            goto L_0x031b
        L_0x0109:
            r0 = 533921426(0x1fd2fe92, float:8.935961E-20)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r6 = 0
            X.0qQ.A0B(r7, r6)
            super.onScrolled(r7, r8, r3)
            java.lang.Object r5 = r15.A01
            X.Wan r5 = (X.C19501Wan) r5
            boolean r0 = r5.A03
            if (r0 != 0) goto L_0x0123
            boolean r0 = r5.A04
            if (r0 == 0) goto L_0x016c
        L_0x0123:
            androidx.recyclerview.widget.LinearLayoutManager r0 = r5.A0D
            int r8 = r0.A1a()
            androidx.recyclerview.widget.RecyclerView r0 = r5.A0E
            X.3kE r0 = r0.A0W(r8)
            if (r0 == 0) goto L_0x0178
            int r1 = r5.A09
            int r9 = r5.A08
            int r10 = r5.A00
            android.view.View r0 = r0.itemView
            int r12 = r0.getLeft()
            int r11 = r10 / 15
            r7 = 1000(0x3e8, float:1.401E-42)
            if (r7 >= r11) goto L_0x0144
            r7 = r11
        L_0x0144:
            int r1 = r1 - r9
            double r2 = (double) r1
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r0 = X.JTP.A01(r2, r0)
            int r0 = r0 - r12
            float r2 = (float) r0
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r0 >= r11) goto L_0x0153
            r0 = r11
        L_0x0153:
            float r1 = (float) r0
            float r0 = (float) r10
            float r1 = r1 / r0
            float r0 = (float) r9
            float r1 = r1 * r0
            int r0 = (int) r1
            float r0 = (float) r0
            float r2 = r2 / r0
            int r8 = r8 * r7
            float r1 = (float) r8
            float r0 = (float) r7
            float r2 = r2 * r0
            float r1 = r1 + r2
            int r0 = (int) r1
            int r1 = java.lang.Math.max(r0, r6)
        L_0x0165:
            r5.A01 = r1
            X.8a5 r0 = r5.A0F
            r0.Dhb(r5, r1)
        L_0x016c:
            boolean r0 = r5.A04()
            X.C19501Wan.A03(r5, r0)
            r0 = -1445287399(0xffffffffa9daaa19, float:-9.710652E-14)
            goto L_0x031b
        L_0x0178:
            r1 = 0
            goto L_0x0165
        L_0x017a:
            r0 = 542269207(0x20525f17, float:1.7819154E-19)
            int r5 = X.AnonymousClass7TG.A0D(r7, r0)
            super.onScrolled(r7, r8, r3)
            X.3pI r1 = r7.A0D
            boolean r0 = r1 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r0 == 0) goto L_0x01de
            androidx.recyclerview.widget.LinearLayoutManager r1 = (androidx.recyclerview.widget.LinearLayoutManager) r1
        L_0x018c:
            java.lang.Object r0 = r15.A01
            X.Ua9 r0 = (X.C15302Ua9) r0
            X.0eM r2 = r0.A02
            java.lang.Object r0 = r2.getValue()
            X.U8p r0 = (X.C14779U8p) r0
            boolean r0 = r0.A05
            if (r0 != 0) goto L_0x01d9
            if (r1 == 0) goto L_0x01d9
            int r1 = r1.A1d()
            java.lang.Object r0 = r2.getValue()
            X.U8p r0 = (X.C14779U8p) r0
            java.util.ArrayList r0 = r0.A0D
            int r0 = X.Pxe.A0A(r0)
            if (r1 != r0) goto L_0x01d9
            java.lang.Object r4 = r2.getValue()
            X.U8p r4 = (X.C14779U8p) r4
            boolean r0 = r4.A03
            if (r0 == 0) goto L_0x01d9
            com.instagram.common.session.UserSession r0 = r4.A07
            X.Vki r3 = new X.Vki
            r3.<init>(r0)
            java.lang.String r2 = r4.A0C
            if (r2 != 0) goto L_0x01c7
            java.lang.String r2 = ""
        L_0x01c7:
            com.instagram.api.schemas.LeadGenEntryPoint r1 = r4.A06
            java.lang.String r0 = r4.A02
            X.MCA r3 = r3.A00(r1, r2, r0)
            r2 = 0
            r1 = 3
            X.MH3 r0 = new X.MH3
            r0.<init>(r4, r2, r1)
            X.DbY.A19(r4, r0, r3)
        L_0x01d9:
            r0 = -321916893(0xffffffffeccff023, float:-2.0110533E27)
            goto L_0x0500
        L_0x01de:
            r1 = 0
            goto L_0x018c
        L_0x01e0:
            r0 = 1887333046(0x707e6ab6, float:3.149528E29)
            int r5 = X.AnonymousClass7TG.A0D(r7, r0)
            super.onScrolled(r7, r8, r3)
            X.3pI r1 = r7.A0D
            boolean r0 = r1 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r0 == 0) goto L_0x0245
            androidx.recyclerview.widget.LinearLayoutManager r1 = (androidx.recyclerview.widget.LinearLayoutManager) r1
        L_0x01f2:
            java.lang.Object r0 = r15.A01
            X.Ua8 r0 = (X.C15301Ua8) r0
            X.0eM r2 = r0.A02
            java.lang.Object r0 = r2.getValue()
            X.U8o r0 = (X.C14778U8o) r0
            boolean r0 = r0.A06
            if (r0 != 0) goto L_0x0240
            if (r1 == 0) goto L_0x0240
            int r1 = r1.A1d()
            java.lang.Object r0 = r2.getValue()
            X.U8o r0 = (X.C14778U8o) r0
            java.util.ArrayList r0 = r0.A0D
            int r0 = X.Pxe.A0A(r0)
            if (r1 != r0) goto L_0x0240
            java.lang.Object r4 = r2.getValue()
            X.U8o r4 = (X.C14778U8o) r4
            boolean r0 = r4.A04
            if (r0 == 0) goto L_0x0240
            com.instagram.common.session.UserSession r0 = r4.A08
            X.Vki r3 = new X.Vki
            r3.<init>(r0)
            java.lang.String r2 = r4.A02
            if (r2 != 0) goto L_0x022d
            java.lang.String r2 = ""
        L_0x022d:
            com.instagram.api.schemas.LeadGenEntryPoint r1 = r4.A07
            java.lang.String r0 = r4.A03
            X.MCA r3 = r3.A00(r1, r2, r0)
            r2 = 0
            r1 = 49
            X.MH0 r0 = new X.MH0
            r0.<init>(r4, r2, r1)
            X.DbY.A19(r4, r0, r3)
        L_0x0240:
            r0 = 1342205843(0x50006f93, float:8.6191831E9)
            goto L_0x0500
        L_0x0245:
            r1 = 0
            goto L_0x01f2
        L_0x0247:
            r0 = 240139165(0xe503b9d, float:2.5666682E-30)
            int r4 = X.AnonymousClass7TG.A0D(r7, r0)
            super.onScrolled(r7, r8, r3)
            int r2 = r7.computeVerticalScrollOffset()
            if (r2 != 0) goto L_0x0264
            java.lang.Object r1 = r15.A01
            X.Uap r1 = (X.C15339Uap) r1
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x026e
        L_0x025f:
            r0 = -401251112(0xffffffffe81564d8, float:-2.8219714E24)
            goto L_0x031b
        L_0x0264:
            if (r2 <= 0) goto L_0x025f
            java.lang.Object r1 = r15.A01
            X.Uap r1 = (X.C15339Uap) r1
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x025f
        L_0x026e:
            X.C15339Uap.A00(r1, r2)
            goto L_0x025f
        L_0x0272:
            r0 = -77900049(0xfffffffffb5b56ef, float:-1.1388762E36)
            int r2 = X.AnonymousClass0fD.A03(r0)
            r0 = 997189316(0x3b6fe6c4, float:0.0036606053)
        L_0x027c:
            X.AnonymousClass0fD.A0A(r0, r2)
            return
        L_0x0280:
            r0 = -2117711476(0xffffffff81c6498c, float:-7.283925E-38)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r2 = 0
            X.0qQ.A0B(r7, r2)
            super.onScrolled(r7, r8, r3)
            java.lang.Object r10 = r15.A01
            X.Uh2 r10 = (X.C15696Uh2) r10
            X.1Xj r0 = r10.A0H
            boolean r0 = r0.CeS()
            java.lang.String r7 = "Required value was null."
            if (r0 == 0) goto L_0x02b3
            X.2uK r3 = r10.A06
            if (r3 == 0) goto L_0x031f
            X.3OB r1 = r3.A0J()
            X.3OB r0 = X.AnonymousClass3OB.PLAYING
            if (r1 != r0) goto L_0x02ee
            boolean r0 = X.C15696Uh2.A02(r10)
            if (r0 != 0) goto L_0x02ee
            java.lang.String r0 = "scroll"
            r3.A0T(r0)
        L_0x02b3:
            int r5 = X.C15696Uh2.A00(r10)
            int r1 = r10.A0B
            int r0 = r1 - r5
            float r3 = (float) r0
            float r0 = (float) r1
            float r3 = r3 / r0
            X.WXB r0 = r10.A05
            if (r0 == 0) goto L_0x0328
            android.view.View r1 = r0.A01
            r0 = 1060320051(0x3f333333, float:0.7)
            float r3 = r3 * r0
            r1.setAlpha(r3)
            if (r5 > 0) goto L_0x0300
            boolean r0 = r10.A07
            if (r0 != 0) goto L_0x02e3
            r0 = 1
            r10.A07 = r0
            long r5 = java.lang.System.currentTimeMillis()
            long r2 = r10.A01
            long r0 = r10.A00
            long r8 = r5 - r0
            long r2 = r2 + r8
            r10.A01 = r2
            r10.A00 = r5
        L_0x02e3:
            r2 = 4
            X.WXB r0 = r10.A05
            if (r0 != 0) goto L_0x030d
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x02ee:
            X.3OB r0 = X.AnonymousClass3OB.IDLE
            if (r1 == r0) goto L_0x02f6
            X.3OB r0 = X.AnonymousClass3OB.PAUSED
            if (r1 != r0) goto L_0x02b3
        L_0x02f6:
            boolean r0 = X.C15696Uh2.A02(r10)
            if (r0 == 0) goto L_0x02b3
            r3.A0M()
            goto L_0x02b3
        L_0x0300:
            X.C15696Uh2.A01(r10)
            X.WXB r0 = r10.A05
            if (r0 != 0) goto L_0x030d
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x030d:
            com.instagram.ui.widget.framelayout.MediaFrameLayout r1 = r0.A06
            int r0 = r1.getVisibility()
            if (r2 == r0) goto L_0x0318
            r1.setVisibility(r2)
        L_0x0318:
            r0 = -1235657052(0xffffffffb6595ea4, float:-3.2390608E-6)
        L_0x031b:
            X.AnonymousClass0fD.A0A(r0, r4)
            return
        L_0x031f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r7)
            r0 = 280939315(0x10becb33, float:7.5254864E-29)
            goto L_0x0330
        L_0x0328:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r7)
            r0 = 218526144(0xd0671c0, float:4.142886E-31)
        L_0x0330:
            X.AnonymousClass0fD.A0A(r0, r4)
            throw r1
        L_0x0334:
            r0 = 649829027(0x26bb9aa3, float:1.3017646E-15)
            int r6 = X.AnonymousClass0fD.A03(r0)
            r5 = 0
            X.0qQ.A0B(r7, r5)
            super.onScrolled(r7, r8, r3)
            java.lang.Object r3 = r15.A01
            X.Ugx r3 = (X.C15692Ugx) r3
            boolean r0 = r3.A01
            if (r0 != 0) goto L_0x0351
            r0 = -871779895(0xffffffffcc09b1c9, float:-3.609578E7)
        L_0x034d:
            X.AnonymousClass0fD.A0A(r0, r6)
            return
        L_0x0351:
            X.Uu4 r9 = r3.A06
            X.4M3 r0 = r9.A02
            if (r0 == 0) goto L_0x035d
            X.4M1 r0 = (X.AnonymousClass4M1) r0
            X.3OB r1 = r0.A0M
            if (r1 != 0) goto L_0x035f
        L_0x035d:
            X.3OB r1 = X.AnonymousClass3OB.IDLE
        L_0x035f:
            X.Utz r0 = r9.A01
            if (r0 == 0) goto L_0x0477
            X.Ucm r10 = r0.A00
        L_0x0365:
            X.3OB r0 = X.AnonymousClass3OB.PLAYING
            if (r1 != r0) goto L_0x0468
            if (r10 == 0) goto L_0x0468
            androidx.recyclerview.widget.LinearLayoutManager r0 = r3.A04
            int r4 = r0.A1a()
            int r2 = r0.A1b()
            r8 = -1
            if (r4 > r2) goto L_0x0465
        L_0x0378:
            X.UAS r0 = r3.A05
            X.VRl r0 = r0.A02
            java.util.List r1 = r0.A00
            java.lang.Object r0 = r1.get(r4)
            boolean r0 = r0 instanceof X.C15436Ucm
            if (r0 == 0) goto L_0x0460
            java.lang.Object r1 = r1.get(r4)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.canvas.framework.model.data.VideoBlockData"
            X.0qQ.A0C(r1, r0)
            boolean r0 = r10.equals(r1)
            if (r0 == 0) goto L_0x0460
        L_0x0395:
            java.lang.String r2 = "scroll"
            if (r4 != r8) goto L_0x03a4
            X.4M3 r0 = r9.A02
            if (r0 == 0) goto L_0x03a0
            r0.EyP(r2, r5)
        L_0x03a0:
            r0 = 1657661878(0x62cde9b6, float:1.8992116E21)
            goto L_0x034d
        L_0x03a4:
            X.3kE r0 = r7.A0W(r4)
            X.UD6 r0 = (X.UD6) r0
            if (r0 == 0) goto L_0x03a0
            com.instagram.ui.widget.framelayout.MediaFrameLayout r7 = r0.A02
            r4 = 1056964608(0x3f000000, float:0.5)
            android.graphics.Rect r1 = r3.A02
            boolean r0 = r7.getGlobalVisibleRect(r1)
            if (r0 == 0) goto L_0x03c8
            int r0 = r1.height()
            float r1 = (float) r0
            int r0 = r7.getHeight()
            float r0 = (float) r0
            float r0 = r0 * r4
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x03c8
            goto L_0x03a0
        L_0x03c8:
            X.0iw r10 = r3.A07
            r7 = 1
            X.0qQ.A0B(r10, r7)
            X.4M3 r11 = r9.A02
            java.lang.String r4 = "Required value was null."
            if (r11 == 0) goto L_0x048c
            r11.E21(r2)
            X.Utz r3 = r9.A01
            if (r3 == 0) goto L_0x0486
            X.Ucm r0 = r3.A00
            java.lang.String r2 = r0.getId()
            if (r2 == 0) goto L_0x0480
            X.4M1 r11 = (X.AnonymousClass4M1) r11
            int r0 = r11.getCurrentPositionMs()
            r12 = 500(0x1f4, float:7.0E-43)
            if (r0 <= r12) goto L_0x0435
            boolean r0 = r11.A0W
            if (r0 == 0) goto L_0x0435
            com.instagram.common.session.UserSession r14 = r11.A0m
            X.0Tu r13 = X.0Tu.A05
            r0 = 36317728058971614(0x8106c8000115de, double:3.0308156920219674E-306)
            boolean r0 = X.182.A06(r13, r14, r0)
            if (r0 == 0) goto L_0x040b
            r1 = 2
            r12 = 0
            X.4X8 r0 = r11.A0P     // Catch:{ NullPointerException -> 0x0422 }
            if (r0 == 0) goto L_0x0435
            android.graphics.Bitmap r12 = r0.A01()     // Catch:{ NullPointerException -> 0x0422 }
            goto L_0x0422
        L_0x040b:
            int r0 = r11.getCurrentPositionMs()
            if (r0 <= r12) goto L_0x0435
            r1 = 0
            X.4X8 r0 = r11.A0P     // Catch:{ NullPointerException -> 0x041a }
            if (r0 == 0) goto L_0x0435
            android.graphics.Bitmap r1 = r0.A01()     // Catch:{ NullPointerException -> 0x041a }
        L_0x041a:
            if (r1 == 0) goto L_0x0435
            android.content.Context r0 = r11.A0k
            X.AnonymousClass4WY.A03(r0, r1, r2)
            goto L_0x0435
        L_0x0422:
            if (r12 == 0) goto L_0x0435
            android.content.Context r11 = r11.A0k
            X.0qQ.A0B(r11, r1)
            X.0nO r1 = X.0nY.A00()
            X.Ujx r0 = new X.Ujx
            r0.<init>(r11, r12, r2)
            r1.ATE(r0)
        L_0x0435:
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x045b
            boolean r0 = X.AnonymousClass4WY.A04(r2)
            if (r0 == 0) goto L_0x045b
            X.UD6 r0 = r3.A01
            com.instagram.feed.widget.IgProgressImageView r3 = r0.A01
            android.content.Context r1 = r9.A05
            com.instagram.common.session.UserSession r0 = r9.A06
            java.io.File r0 = X.AnonymousClass4WY.A01(r1, r0, r2)
            if (r0 == 0) goto L_0x047a
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
            X.0qQ.A07(r0)
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.C253833rU.A00(r0, r8, r8)
            r3.A09(r10, r0, r7)
        L_0x045b:
            X.C16387Uu4.A01(r9, r5)
            goto L_0x03a0
        L_0x0460:
            r0 = r4
            int r4 = r4 + 1
            if (r0 != r2) goto L_0x0378
        L_0x0465:
            r4 = -1
            goto L_0x0395
        L_0x0468:
            X.3OB r0 = X.AnonymousClass3OB.IDLE
            if (r1 == r0) goto L_0x0470
            X.3OB r0 = X.AnonymousClass3OB.PAUSED
            if (r1 != r0) goto L_0x03a0
        L_0x0470:
            android.os.Handler r0 = r3.A03
            r0.sendEmptyMessage(r5)
            goto L_0x03a0
        L_0x0477:
            r10 = 0
            goto L_0x0365
        L_0x047a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x0480:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x0486:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x048c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x0492:
            r0 = -668616838(0xffffffffd825b77a, float:-7.2882978E14)
            int r5 = X.AnonymousClass0fD.A03(r0)
            if (r17 == 0) goto L_0x04a5
            java.lang.Object r1 = r15.A01
            X.Ty5 r1 = (X.C14544Ty5) r1
            int r0 = r1.A04
            int r0 = r0 + r17
            r1.A04 = r0
        L_0x04a5:
            if (r18 == 0) goto L_0x04b1
            java.lang.Object r1 = r15.A01
            X.Ty5 r1 = (X.C14544Ty5) r1
            int r0 = r1.A05
            int r0 = r0 + r18
            r1.A05 = r0
        L_0x04b1:
            r0 = 636446102(0x25ef6596, float:4.1528728E-16)
            goto L_0x0500
        L_0x04b5:
            r0 = 1765163837(0x6936433d, float:1.3771376E25)
            int r5 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r4 = r15.A01
            X.UAl r4 = (X.UAl) r4
            int r10 = r7.computeHorizontalScrollOffset()
            int r2 = r7.computeVerticalScrollOffset()
            androidx.recyclerview.widget.RecyclerView r7 = r4.A0A
            int r11 = r7.computeVerticalScrollRange()
            int r9 = r4.A05
            int r0 = r11 - r9
            r1 = 0
            r3 = 1
            if (r0 <= 0) goto L_0x04db
            int r6 = r4.A0H
            r0 = 1
            if (r9 >= r6) goto L_0x04dc
        L_0x04db:
            r0 = 0
        L_0x04dc:
            r4.A0C = r0
            int r7 = r7.computeHorizontalScrollRange()
            int r6 = r4.A06
            int r0 = r7 - r6
            if (r0 <= 0) goto L_0x04ed
            int r0 = r4.A0H
            r8 = 1
            if (r6 >= r0) goto L_0x04ee
        L_0x04ed:
            r8 = 0
        L_0x04ee:
            r4.A0B = r8
            boolean r0 = r4.A0C
            if (r0 != 0) goto L_0x0504
            if (r8 != 0) goto L_0x0504
            int r0 = r4.A07
            if (r0 == 0) goto L_0x04fd
            r4.A01(r1)
        L_0x04fd:
            r0 = 535050647(0x1fe43997, float:9.665703E-20)
        L_0x0500:
            X.AnonymousClass0fD.A0A(r0, r5)
            return
        L_0x0504:
            r12 = 1073741824(0x40000000, float:2.0)
            if (r0 == 0) goto L_0x051c
            float r2 = (float) r2
            float r1 = (float) r9
            float r0 = r1 / r12
            float r2 = r2 + r0
            float r1 = r1 * r2
            float r0 = (float) r11
            float r1 = r1 / r0
            int r0 = (int) r1
            r4.A08 = r0
            int r0 = r9 * r9
            int r0 = r0 / r11
            int r0 = java.lang.Math.min(r9, r0)
            r4.A09 = r0
        L_0x051c:
            if (r8 == 0) goto L_0x0532
            float r2 = (float) r10
            float r1 = (float) r6
            float r0 = r1 / r12
            float r2 = r2 + r0
            float r1 = r1 * r2
            float r0 = (float) r7
            float r1 = r1 / r0
            int r0 = (int) r1
            r4.A03 = r0
            int r0 = r6 * r6
            int r0 = r0 / r7
            int r0 = java.lang.Math.min(r6, r0)
            r4.A04 = r0
        L_0x0532:
            int r0 = r4.A07
            if (r0 == 0) goto L_0x0538
            if (r0 != r3) goto L_0x04fd
        L_0x0538:
            r4.A01(r3)
            goto L_0x04fd
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UB1.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
