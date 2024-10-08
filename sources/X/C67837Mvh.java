package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.ArEffectPickerRecyclerView;
import com.instagram.ui.widget.pageindicator.CirclePageIndicator;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.Mvh  reason: case insensitive filesystem */
public final class C67837Mvh extends C249403jg {
    public final int A00;
    public final Object A01;

    public C67837Mvh(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int i2;
        int i3;
        switch (this.A00) {
            case 2:
                i2 = AnonymousClass0fD.A03(844211303);
                0qQ.A0B(recyclerView, 0);
                C72286Ozv ozv = (C72286Ozv) this.A01;
                if (ozv.AFa()) {
                    ozv.A0B.A01();
                }
                if (!ozv.A06) {
                    if (i == 0) {
                        ozv.A0A.post(ozv.A0E);
                        Object obj = ozv.A0D.A00.first;
                        0qQ.A07(obj);
                        if ((obj == AnonymousClass80V.PRE_CAPTURE_AR_EFFECT_TRAY || obj == AnonymousClass80V.POST_CAPTURE_AR_EFFECT_TRAY) && ozv.A03 != null) {
                            int A002 = C394429y6.A00(recyclerView);
                            ozv.A00 = A002;
                            ArEffectPickerRecyclerView arEffectPickerRecyclerView = ozv.A03;
                            if (arEffectPickerRecyclerView != null) {
                                arEffectPickerRecyclerView.A0o(A002);
                            } else {
                                IllegalStateException A0y = AnonymousClass7TE.A0y();
                                AnonymousClass0fD.A0A(-1106677610, i2);
                                throw A0y;
                            }
                        }
                    } else if (i == 1) {
                        ozv.A0C.A01 = false;
                    }
                    i3 = -764259693;
                    break;
                } else {
                    i3 = 510765791;
                    break;
                }
            case 3:
                i2 = AnonymousClass7TG.A0D(recyclerView, 192160966);
                super.onScrollStateChanged(recyclerView, i);
                if (i == 0) {
                    C252553pI r3 = recyclerView.A0D;
                    0qQ.A0C(r3, C273654mx.A00(7));
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) r3;
                    CirclePageIndicator circlePageIndicator = ((NV4) this.A01).A03;
                    if (circlePageIndicator != null) {
                        circlePageIndicator.A02(linearLayoutManager.A1a());
                    }
                }
                i3 = 144119454;
                break;
            case 8:
                i2 = AnonymousClass0fD.A03(815354806);
                if (i != 0) {
                    0nA.A0N(((C71874OsH) this.A01).A00);
                }
                i3 = -218191941;
                break;
            case 13:
                i2 = AnonymousClass0fD.A03(1620446797);
                if (i == 1) {
                    C68483NKa nKa = (C68483NKa) this.A01;
                    SearchEditText searchEditText = nKa.A09;
                    if (searchEditText != null) {
                        searchEditText.clearFocus();
                    }
                    SearchEditText searchEditText2 = nKa.A09;
                    if (searchEditText2 != null) {
                        searchEditText2.A04();
                    }
                }
                i3 = -1056228206;
                break;
            default:
                super.onScrollStateChanged(recyclerView, i);
                return;
        }
        AnonymousClass0fD.A0A(i3, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02d9, code lost:
        X.AnonymousClass0fD.A0A(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02dc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0156, code lost:
        X.AnonymousClass0fD.A0A(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0159, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x015a, code lost:
        r7 = com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x015f, code lost:
        X.0qQ.A0F(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0166, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onScrolled(androidx.recyclerview.widget.RecyclerView r9, int r10, int r11) {
        /*
            r8 = this;
            int r0 = r8.A00
            switch(r0) {
                case 0: goto L_0x02c4;
                case 1: goto L_0x0281;
                case 2: goto L_0x0241;
                case 3: goto L_0x0005;
                case 4: goto L_0x021b;
                case 5: goto L_0x019b;
                case 6: goto L_0x0181;
                case 7: goto L_0x0167;
                case 8: goto L_0x0005;
                case 9: goto L_0x0132;
                case 10: goto L_0x00b3;
                case 11: goto L_0x006e;
                case 12: goto L_0x0054;
                case 13: goto L_0x0005;
                case 14: goto L_0x0023;
                case 15: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.onScrolled(r9, r10, r11)
            return
        L_0x0009:
            r0 = 950040403(0x38a07753, float:7.6516204E-5)
            int r3 = X.AnonymousClass7TG.A0D(r9, r0)
            super.onScrolled(r9, r10, r11)
            java.lang.Object r1 = r8.A01
            X.MzB r1 = (X.C68044MzB) r1
            int r0 = r1.getBindingAdapterPosition()
            r1.A00(r0)
            r0 = 1647547127(0x623392f7, float:8.281393E20)
            goto L_0x02d9
        L_0x0023:
            r0 = 703366214(0x29ec8446, float:1.0503451E-13)
            int r3 = X.AnonymousClass7TG.A0D(r9, r0)
            super.onScrolled(r9, r10, r11)
            int r0 = r9.getVisibility()
            if (r0 != 0) goto L_0x004f
            java.lang.Object r0 = r8.A01
            com.instagram.reels.storiestemplate.discovery.view.StoryTemplateDiscoverySurfaceFragment r0 = (com.instagram.reels.storiestemplate.discovery.view.StoryTemplateDiscoverySurfaceFragment) r0
            androidx.recyclerview.widget.LinearLayoutManager r0 = r0.getBrowserLayoutManager()
            int r2 = r0.A1c()
            r0 = -1
            if (r2 == r0) goto L_0x004f
            X.3kE r1 = r9.A0W(r2)
            boolean r0 = r1 instanceof X.C68044MzB
            if (r0 == 0) goto L_0x004f
            X.MzB r1 = (X.C68044MzB) r1
            r1.A00(r2)
        L_0x004f:
            r0 = -749038489(0xffffffffd35a9467, float:-9.3879265E11)
            goto L_0x02d9
        L_0x0054:
            r0 = 1972831227(0x759703fb, float:3.828699E32)
            int r3 = X.AnonymousClass7TG.A0D(r9, r0)
            super.onScrolled(r9, r10, r11)
            java.lang.Object r1 = r8.A01
            X.PRd r1 = (X.C72970PRd) r1
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x0069
            X.C72970PRd.A03(r1)
        L_0x0069:
            r0 = -78303637(0xfffffffffb552e6b, float:-1.1069007E36)
            goto L_0x02d9
        L_0x006e:
            r0 = -763804218(0xffffffffd27945c6, float:-2.67654365E11)
            int r3 = X.AnonymousClass7TG.A0D(r9, r0)
            super.onScrolled(r9, r10, r11)
            X.3pI r4 = r9.A0D
            boolean r0 = r4 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r0 == 0) goto L_0x00ae
            androidx.recyclerview.widget.LinearLayoutManager r4 = (androidx.recyclerview.widget.LinearLayoutManager) r4
            if (r4 == 0) goto L_0x00ae
            java.lang.Object r2 = r8.A01
            X.NIu r2 = (X.C68456NIu) r2
            X.PIF r0 = r2.A01
            if (r0 != 0) goto L_0x008e
            java.lang.String r7 = "reactionAdapter"
            goto L_0x015f
        L_0x008e:
            X.2t9 r0 = r0.A00
            int r1 = r0.getItemCount()
            if (r1 <= 0) goto L_0x00a9
            int r0 = r4.A1d()
            int r1 = r1 - r0
            r0 = 3
            if (r1 > r0) goto L_0x00a9
            X.0eM r0 = r2.A04
            java.lang.Object r0 = r0.getValue()
            X.JiI r0 = (X.C60261JiI) r0
            r0.A00()
        L_0x00a9:
            r0 = -1307268834(0xffffffffb214a91e, float:-8.653187E-9)
            goto L_0x02d9
        L_0x00ae:
            r0 = -739708048(0xffffffffd3e8f370, float:-2.00103323E12)
            goto L_0x02d9
        L_0x00b3:
            r0 = 1012069803(0x3c52f5ab, float:0.012875955)
            int r4 = X.AnonymousClass7TG.A0D(r9, r0)
            super.onScrolled(r9, r10, r11)
            X.3pI r1 = r9.A0D
            r0 = 7
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0qQ.A0C(r1, r0)
            androidx.recyclerview.widget.LinearLayoutManager r1 = (androidx.recyclerview.widget.LinearLayoutManager) r1
            int r1 = r1.A1b()
            java.lang.Object r5 = r8.A01
            X.NJV r5 = (X.NJV) r5
            X.2t9 r0 = r5.A02
            java.lang.String r7 = "adapter"
            if (r0 == 0) goto L_0x015f
            int r0 = r0.getItemCount()
            r6 = 1
            int r0 = r0 - r6
            if (r1 != r0) goto L_0x012b
            int r0 = r9.getChildCount()
            int r0 = r0 - r6
            android.view.View r0 = r9.getChildAt(r0)
            int r1 = r0.getBottom()
            int r0 = r9.getHeight()
            if (r1 > r0) goto L_0x012b
            X.OLg r0 = r5.A06
            if (r0 == 0) goto L_0x012f
            java.lang.Integer r1 = r0.A00
            if (r1 == 0) goto L_0x015a
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            if (r1 != r0) goto L_0x012b
            com.instagram.common.recyclerview.ViewModelListUpdate r3 = r5.A03
            if (r3 == 0) goto L_0x015d
            android.content.Context r1 = r5.requireContext()
            r0 = 2131972868(0x7f135304, float:1.9582756E38)
            java.lang.String r2 = r1.getString(r0)
            int r1 = r5.A01
            X.EGc r0 = new X.EGc
            r0.<init>(r2, r1, r6)
            r3.A00(r0)
            X.2t9 r1 = r5.A02
            if (r1 == 0) goto L_0x015f
            com.instagram.common.recyclerview.ViewModelListUpdate r0 = r5.A03
            if (r0 == 0) goto L_0x015d
            r1.A05(r0)
            X.OLg r1 = r5.A06
            if (r1 == 0) goto L_0x012f
            int r0 = r5.A00
            r1.A00(r0)
        L_0x012b:
            r0 = 1951641485(0x7453af8d, float:6.708589E31)
            goto L_0x0156
        L_0x012f:
            java.lang.String r7 = "messageSearchProvider"
            goto L_0x015f
        L_0x0132:
            r0 = -534056445(0xffffffffe02af203, float:-4.9271645E19)
            int r4 = X.AnonymousClass7TG.A0D(r9, r0)
            super.onScrolled(r9, r10, r11)
            java.lang.Object r3 = r8.A01
            X.NJu r3 = (X.C68477NJu) r3
            X.OLh r2 = r3.A01
            java.lang.String r7 = "resharedContentProvider"
            if (r2 == 0) goto L_0x015f
            java.lang.Integer r1 = r2.A00
            if (r1 == 0) goto L_0x015a
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            if (r1 != r0) goto L_0x0153
            java.lang.String r0 = r3.A02
            r2.A00(r0)
        L_0x0153:
            r0 = 524570386(0x1f444f12, float:4.157002E-20)
        L_0x0156:
            X.AnonymousClass0fD.A0A(r0, r4)
            return
        L_0x015a:
            java.lang.String r7 = "state"
            goto L_0x015f
        L_0x015d:
            java.lang.String r7 = "viewModelListUpdater"
        L_0x015f:
            X.0qQ.A0F(r7)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0167:
            r0 = 1826272553(0x6cdab529, float:2.1152107E27)
            int r3 = X.AnonymousClass7TG.A0D(r9, r0)
            r0 = 1
            boolean r0 = r9.canScrollVertically(r0)
            if (r0 != 0) goto L_0x017c
            java.lang.Object r0 = r8.A01
            X.NJU r0 = (X.NJU) r0
            X.NJU.A00(r0)
        L_0x017c:
            r0 = -747203389(0xffffffffd37694c3, float:-1.05905776E12)
            goto L_0x02d9
        L_0x0181:
            r0 = 1140063349(0x43f3fc75, float:487.97232)
            int r3 = X.AnonymousClass7TG.A0D(r9, r0)
            r0 = 1
            boolean r0 = r9.canScrollVertically(r0)
            if (r0 != 0) goto L_0x0196
            java.lang.Object r0 = r8.A01
            X.NJt r0 = (X.C68476NJt) r0
            X.C68476NJt.A01(r0)
        L_0x0196:
            r0 = 294587461(0x118f0c45, float:2.2568984E-28)
            goto L_0x02d9
        L_0x019b:
            r0 = -22713711(0xfffffffffea56a91, float:-1.0993797E38)
            int r3 = X.AnonymousClass0fD.A03(r0)
            super.onScrolled(r9, r10, r11)
            java.lang.Object r2 = r8.A01
            X.NKh r2 = (X.C68488NKh) r2
            androidx.recyclerview.widget.RecyclerView r0 = r2.A00
            X.3pI r0 = r0.A0D
            r0.getClass()
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            int r1 = r0.A1b()
            X.2t9 r0 = r2.A01
            int r0 = r0.getItemCount()
            int r0 = r0 + -1
            if (r1 != r0) goto L_0x0216
            androidx.recyclerview.widget.RecyclerView r1 = r2.A00
            int r0 = r1.getChildCount()
            int r0 = r0 + -1
            android.view.View r0 = r1.getChildAt(r0)
            int r1 = r0.getBottom()
            androidx.recyclerview.widget.RecyclerView r0 = r2.A00
            int r0 = r0.getHeight()
            if (r1 > r0) goto L_0x0216
            X.Pwd r0 = r2.A04
            if (r0 == 0) goto L_0x0216
            java.lang.Integer r1 = r0.Bz7()
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            if (r1 == r0) goto L_0x01e8
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x0216
        L_0x01e8:
            androidx.recyclerview.widget.RecyclerView r0 = r2.A00
            boolean r0 = r0.A1E()
            if (r0 != 0) goto L_0x0216
            X.Toc r1 = r2.A06
            if (r1 != 0) goto L_0x01fc
            X.2ms r0 = r2.A0O
            X.Toc r1 = X.C14036Toc.A00(r0)
            r2.A06 = r1
        L_0x01fc:
            com.instagram.common.recyclerview.ViewModelListUpdate r0 = r2.A02
            if (r0 == 0) goto L_0x020a
            r0.A00(r1)
            X.2t9 r1 = r2.A01
            com.instagram.common.recyclerview.ViewModelListUpdate r0 = r2.A02
            r1.A05(r0)
        L_0x020a:
            androidx.recyclerview.widget.RecyclerView r0 = r2.A00
            java.lang.Runnable r1 = r2.A0P
            r0.removeCallbacks(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r2.A00
            r0.post(r1)
        L_0x0216:
            r0 = -1951994016(0xffffffff8ba6ef60, float:-6.4301046E-32)
            goto L_0x02d9
        L_0x021b:
            r0 = 23673904(0x1693c30, float:4.2838524E-38)
            int r3 = X.AnonymousClass7TG.A0D(r9, r0)
            X.3pI r1 = r9.A0D
            r0 = 7
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0qQ.A0C(r1, r0)
            androidx.recyclerview.widget.LinearLayoutManager r1 = (androidx.recyclerview.widget.LinearLayoutManager) r1
            int r1 = r1.A1a()
            r0 = 5
            if (r1 >= r0) goto L_0x023c
            java.lang.Object r0 = r8.A01
            X.7Mt r0 = (X.C330437Mt) r0
            r0.A01()
        L_0x023c:
            r0 = -1663216975(0xffffffff9cdd52b1, float:-1.4645928E-21)
            goto L_0x02d9
        L_0x0241:
            r0 = 638309904(0x260bd610, float:4.851542E-16)
            int r3 = X.AnonymousClass7TG.A0D(r9, r0)
            java.lang.Object r5 = r8.A01
            X.Ozv r5 = (X.C72286Ozv) r5
            boolean r0 = r5.A06
            if (r0 != 0) goto L_0x0272
            X.NSs r4 = r5.A0C
            boolean r0 = r4.A01
            if (r0 != 0) goto L_0x0272
            int r2 = X.C394429y6.A00(r9)
            r5.A00 = r2
            int r0 = r4.A00
            if (r0 == r2) goto L_0x0272
            com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.ArEffectPickerRecyclerView r1 = r5.A03
            if (r1 == 0) goto L_0x0272
            boolean r0 = r1.A1E()
            if (r0 == 0) goto L_0x0276
            X.PYC r0 = new X.PYC
            r0.<init>(r5, r2)
            r1.post(r0)
        L_0x0272:
            r0 = 1413724716(0x5443ba2c, float:3.36256827E12)
            goto L_0x02d9
        L_0x0276:
            r4.A03(r2)
            X.2S0 r2 = X.AnonymousClass2S0.A01
            r0 = 3
            r2.A05(r0)
            goto L_0x0272
        L_0x0281:
            r0 = -1542390094(0xffffffffa410feb2, float:-3.1440758E-17)
            int r3 = X.AnonymousClass7TG.A0D(r9, r0)
            super.onScrolled(r9, r10, r11)
            X.3pI r4 = r9.A0D
            boolean r0 = r4 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r0 == 0) goto L_0x02c0
            androidx.recyclerview.widget.LinearLayoutManager r4 = (androidx.recyclerview.widget.LinearLayoutManager) r4
            if (r4 == 0) goto L_0x02c0
            java.lang.Object r2 = r8.A01
            X.H1g r2 = (X.C54162H1g) r2
            X.PIF r0 = r2.A01
            if (r0 == 0) goto L_0x02bc
            X.2t9 r0 = r0.A00
            int r1 = r0.getItemCount()
            if (r1 <= 0) goto L_0x02b8
            int r0 = r4.A1d()
            int r1 = r1 - r0
            r0 = 3
            if (r1 > r0) goto L_0x02b8
            X.0eM r0 = r2.A05
            java.lang.Object r0 = r0.getValue()
            X.JiI r0 = (X.C60261JiI) r0
            r0.A00()
        L_0x02b8:
            r0 = 1762226460(0x6909711c, float:1.0384811E25)
            goto L_0x02d9
        L_0x02bc:
            r0 = -894462523(0xffffffffcaaf95c5, float:-5753570.5)
            goto L_0x02d9
        L_0x02c0:
            r0 = 237286057(0xe24b2a9, float:2.0300582E-30)
            goto L_0x02d9
        L_0x02c4:
            r0 = 1926273512(0x72d099e8, float:8.263545E30)
            int r3 = X.AnonymousClass7TG.A0D(r9, r0)
            super.onScrolled(r9, r10, r11)
            java.lang.Object r1 = r8.A01
            com.facebook.rtc.views.omnigridview.OmniGridView r1 = (com.facebook.rtc.views.omnigridview.OmniGridView) r1
            r0 = 1
            com.facebook.rtc.views.omnigridview.OmniGridView.A03(r1, r0)
            r0 = -337454464(0xffffffffebe2da80, float:-5.4849814E26)
        L_0x02d9:
            X.AnonymousClass0fD.A0A(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67837Mvh.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
