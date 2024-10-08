package com.instagram.music.search;

import X.0Tu;
import X.0lg;
import X.0qQ;
import X.182;
import X.1YN;
import X.29E;
import X.29H;
import X.2bV;
import X.AnonymousClass00P;
import X.AnonymousClass0eM;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass2bO;
import X.AnonymousClass4DH;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass80X;
import X.C16294UsC;
import X.C227642jf;
import X.C234462xu;
import X.C238693Db;
import X.C3515589i;
import X.C47018DpA;
import X.C50735Fha;
import X.C59725JVj;
import X.C63352KvZ;
import X.C64161LRc;
import X.C65550Lva;
import X.C66447MSb;
import X.DbS;
import X.DbT;
import X.DbW;
import X.DbY;
import X.F0K;
import X.JTP;
import X.JTS;
import X.K7A;
import X.MU2;
import X.MU3;
import X.OIJ;
import X.XBP;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.MusicBrowseCategory;
import com.instagram.music.common.model.MusicBrowserCategoryModel;
import com.instagram.music.search.tabloader.MusicOverlaySearchTab;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.ui.widget.fixedtabbar.FixedTabBar;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;

public final class AudioBrowserBrowseLandingPageFragment extends AnonymousClass4DH implements MU3, C238693Db, XBP, MU2 {
    public int A00;
    public C3515589i A01;
    public C59725JVj A02;
    public ImmutableList A03;
    public ImmutableList A04;
    public MusicProduct A05;
    public C64161LRc A06;
    public MusicAttributionConfig A07;
    public C234462xu A08;
    public F0K A09;
    public C66447MSb A0A;
    public MusicOverlaySearchTab A0B;
    public AnonymousClass80X A0C;
    public String A0D;
    public String A0E;
    public Map A0F;
    public boolean A0G;
    public final AnonymousClass0eM A0H = C227642jf.A02(this);
    public FixedTabBar tabBar;
    public TabLayout tabLayout;
    public C16294UsC tabbedFragmentController;
    public ViewPager viewPager;

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void DqK(java.lang.Object r7) {
        /*
            r6 = this;
            r4 = 0
            X.0qQ.A0B(r7, r4)
            com.instagram.music.search.tabloader.MusicOverlaySearchTab r0 = com.instagram.music.search.tabloader.MusicOverlaySearchTab.A04
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x006f
            X.LRc r0 = r6.A06
            if (r0 != 0) goto L_0x001a
            java.lang.String r0 = "musicLogger"
        L_0x0012:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x001a:
            X.0eM r0 = r6.A0H
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r5 = r6.A0D
            if (r5 != 0) goto L_0x0027
            java.lang.String r0 = "browseSessionFullId"
            goto L_0x0012
        L_0x0027:
            X.0qQ.A0B(r0, r4)
            X.29R r1 = X.JTO.A0b(r0)
            X.1Ln r3 = X.JTO.A0N(r1)
            boolean r0 = X.DbT.A1Y(r3)
            if (r0 == 0) goto L_0x008a
            java.lang.String r0 = "AUDIO_BROWSER_BROWSE_TAB"
            r3.A0r(r0)
            X.29R.A00(r3, r1)
            X.JTQ.A18(r3, r1)
            X.283 r2 = r1.A04
            X.28D r0 = r2.A09
            r3.A0b(r0)
            r0 = 2
            r3.A0W(r0)
            java.lang.String r0 = "browse_session_id"
            r3.A0R(r0, r5)
            X.JTQ.A1A(r3)
            int r0 = X.JTR.A0D(r2)
            r3.A0V(r0)
            java.lang.Long r1 = X.C51971G9r.A0m()
            java.lang.String r0 = "capture_format_index"
            r3.A0Q(r0, r1)
            X.28t r0 = r2.A0A
            r3.A0c(r0)
            X.JTS.A1E(r3)
            goto L_0x008a
        L_0x006f:
            com.instagram.music.search.tabloader.MusicOverlaySearchTab r0 = com.instagram.music.search.tabloader.MusicOverlaySearchTab.A09
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x007f
            com.instagram.music.search.tabloader.MusicOverlaySearchTab r0 = com.instagram.music.search.tabloader.MusicOverlaySearchTab.A0A
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x008a
        L_0x007f:
            X.0eM r0 = r6.A0H
            X.27r r1 = X.C51971G9r.A0g(r0)
            X.8fP r0 = X.C360948fP.NORMAL
            r1.A0u(r0)
        L_0x008a:
            X.UsC r1 = r6.A02()
            java.util.List r0 = r1.A00
            int r0 = r0.indexOf(r7)
            androidx.fragment.app.Fragment r3 = r1.getItem(r0)
            X.0qQ.A07(r3)
            r0 = 1
            r3.setUserVisibleHint(r0)
            X.UsC r0 = r6.A02()
            java.util.List r0 = r0.A00
            int r2 = r0.size()
            r1 = 0
        L_0x00aa:
            if (r1 >= r2) goto L_0x00bf
            X.UsC r0 = r6.A02()
            androidx.fragment.app.Fragment r0 = r0.getItem(r1)
            X.0qQ.A07(r0)
            if (r0 == r3) goto L_0x00bc
            r0.setUserVisibleHint(r4)
        L_0x00bc:
            int r1 = r1 + 1
            goto L_0x00aa
        L_0x00bf:
            androidx.viewpager.widget.ViewPager r0 = r6.viewPager
            if (r0 == 0) goto L_0x00c7
            r0.requestFocus()
            return
        L_0x00c7:
            java.lang.String r0 = "viewPager"
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.music.search.AudioBrowserBrowseLandingPageFragment.DqK(java.lang.Object):void");
    }

    public final String getModuleName() {
        return "audio_browser_browse_landing_page";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0091, code lost:
        if (X.182.A06(r6, r5, r0) != false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0166, code lost:
        if (X.182.A06(X.0Tu.A05, r7, 36322637208365391L) != false) goto L_0x00cb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0156  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r18, android.os.Bundle r19) {
        /*
            r17 = this;
            r15 = 0
            r2 = r18
            X.0qQ.A0B(r2, r15)
            r13 = r17
            r0 = r19
            super.onViewCreated(r2, r0)
            X.0eM r4 = r13.A0H
            X.29H r8 = X.JTS.A0K(r4)
            com.instagram.api.schemas.MusicProduct r0 = r13.A05
            if (r0 == 0) goto L_0x018f
            java.lang.String r7 = r0.A00
            X.0qQ.A0B(r7, r15)
            long r0 = r8.A02
            r5 = 17641988(0x10d3204, double:8.7163E-317)
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x002c
            X.29E r5 = r8.A0E
            java.lang.String r3 = "music_browser_search_overlay_fragment_view_music_product : "
            X.JTP.A1L(r5, r3, r7, r0)
        L_0x002c:
            r0 = 2131436689(0x7f0b2491, float:1.8495256E38)
            android.view.View r0 = r2.requireViewById(r0)
            com.instagram.ui.widget.fixedtabbar.FixedTabBar r0 = (com.instagram.ui.widget.fixedtabbar.FixedTabBar) r0
            X.0qQ.A0B(r0, r15)
            r13.tabBar = r0
            r0 = 2131436691(0x7f0b2493, float:1.849526E38)
            android.view.View r0 = r2.requireViewById(r0)
            androidx.viewpager.widget.ViewPager r0 = (androidx.viewpager.widget.ViewPager) r0
            X.0qQ.A0B(r0, r15)
            r13.viewPager = r0
            r0 = 2131436690(0x7f0b2492, float:1.8495258E38)
            android.view.View r0 = r2.requireViewById(r0)
            com.google.android.material.tabs.TabLayout r0 = (com.google.android.material.tabs.TabLayout) r0
            X.0qQ.A0B(r0, r15)
            r13.tabLayout = r0
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r4)
            com.instagram.api.schemas.MusicProduct r1 = r13.A05
            if (r1 == 0) goto L_0x018f
            X.0qQ.A0B(r5, r15)
            com.instagram.api.schemas.MusicProduct r3 = com.instagram.api.schemas.MusicProduct.MUSIC_IN_FEED
            if (r1 != r3) goto L_0x016d
            X.0Tu r6 = X.0Tu.A05
            r0 = 36322637208693076(0x810b3f00212954, double:3.033920258073379E-306)
            boolean r0 = X.182.A06(r6, r5, r0)
            if (r0 != 0) goto L_0x00ba
            r0 = 36325042388415046(0x810d6f00033246, double:3.0354413034144345E-306)
            boolean r0 = X.182.A06(r6, r5, r0)
            if (r0 != 0) goto L_0x0093
            r0 = 36325042388546120(0x810d6f00053248, double:3.035441303497326E-306)
            boolean r0 = X.182.A06(r6, r5, r0)
            if (r0 != 0) goto L_0x0093
            r0 = 36322637208430928(0x810b3f001d2950, double:3.033920257907596E-306)
        L_0x008d:
            boolean r0 = X.182.A06(r6, r5, r0)
            if (r0 == 0) goto L_0x00ba
        L_0x0093:
            r0 = 2131440659(0x7f0b3413, float:1.8503308E38)
            android.view.View r1 = X.DbY.A0F(r2, r0)
            r0 = 9
            X.C64273LXz.A00(r1, r0, r13)
            boolean r0 = r13.A01()
            if (r0 == 0) goto L_0x00ba
            r0 = 2131429303(0x7f0b07b7, float:1.8480275E38)
            android.view.View r5 = r1.requireViewById(r0)
            android.content.res.Resources r1 = X.Dbb.A09(r13, r5)
            r0 = 2131165228(0x7f07002c, float:1.7944667E38)
            int r0 = r1.getDimensionPixelSize(r0)
            X.0nA.A0T(r5, r0)
        L_0x00ba:
            com.instagram.api.schemas.MusicProduct r1 = r13.A05
            java.lang.String r8 = "musicProduct"
            r5 = 0
            if (r1 == 0) goto L_0x01b2
            com.instagram.api.schemas.MusicProduct r0 = com.instagram.api.schemas.MusicProduct.BOOST_AUDIO_BROWSER
            if (r1 != r0) goto L_0x012e
            com.instagram.music.search.tabloader.MusicOverlaySearchTab r0 = com.instagram.music.search.tabloader.MusicOverlaySearchTab.A03
            java.util.List r14 = X.AnonymousClass7TE.A1I(r0)
        L_0x00cb:
            X.0hq r10 = r13.getChildFragmentManager()
            X.0qQ.A07(r10)
            androidx.viewpager.widget.ViewPager r11 = r13.viewPager
            if (r11 == 0) goto L_0x012a
            com.instagram.ui.widget.fixedtabbar.FixedTabBar r12 = r13.tabBar
            if (r12 == 0) goto L_0x0126
            X.UtG r9 = new X.UtG
            r16 = r15
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r13.tabbedFragmentController = r9
            X.UsC r1 = r13.A02()
            com.instagram.music.search.tabloader.MusicOverlaySearchTab r0 = r13.A0B
            if (r0 != 0) goto L_0x00ef
            java.lang.Object r0 = r14.get(r15)
        L_0x00ef:
            r1.A03(r0)
            boolean r0 = r13.A01()
            if (r0 == 0) goto L_0x0107
            com.instagram.ui.widget.fixedtabbar.FixedTabBar r0 = r13.tabBar
            if (r0 == 0) goto L_0x0126
            r1 = 8
            r0.setVisibility(r1)
            r0 = 2131436693(0x7f0b2495, float:1.8495264E38)
            X.Dbb.A0t(r2, r0, r1)
        L_0x0107:
            X.F0K r0 = r13.A09
            if (r0 == 0) goto L_0x0122
            X.2qi r1 = r0.A00
            if (r1 == 0) goto L_0x0122
            com.instagram.api.schemas.MusicProduct r0 = r13.A05
            if (r0 == 0) goto L_0x01b2
            boolean r0 = X.C14245TsS.A02(r0)
            if (r0 == 0) goto L_0x0123
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A1K
        L_0x011b:
            java.util.Set r0 = X.JTP.A0y(r0)
            r1.AVg(r0)
        L_0x0122:
            return
        L_0x0123:
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A1G
            goto L_0x011b
        L_0x0126:
            java.lang.String r8 = "tabBar"
            goto L_0x01b2
        L_0x012a:
            java.lang.String r8 = "viewPager"
            goto L_0x01b2
        L_0x012e:
            java.util.ArrayList r14 = X.AnonymousClass7TE.A1C()
            boolean r0 = X.C14245TsS.A02(r1)
            if (r0 == 0) goto L_0x016a
            X.0lg r7 = X.AnonymousClass7TF.A0L(r4, r15)
            X.0Tu r6 = X.0Tu.A05
            r0 = 36326300814554811(0x810e94000e36bb, double:3.036237137172497E-306)
            boolean r0 = X.182.A06(r6, r7, r0)
            if (r0 == 0) goto L_0x016a
            com.instagram.music.search.tabloader.MusicOverlaySearchTab r0 = com.instagram.music.search.tabloader.MusicOverlaySearchTab.A0C
        L_0x014b:
            r14.add(r0)
            X.0lg r7 = X.DbT.A0X(r4)
            com.instagram.api.schemas.MusicProduct r0 = r13.A05
            if (r0 == 0) goto L_0x01b2
            X.0qQ.A0B(r7, r15)
            if (r0 != r3) goto L_0x0192
            X.0Tu r6 = X.0Tu.A05
            r0 = 36322637208365391(0x810b3f001c294f, double:3.03392025786615E-306)
            boolean r0 = X.182.A06(r6, r7, r0)
            if (r0 == 0) goto L_0x0192
            goto L_0x00cb
        L_0x016a:
            com.instagram.music.search.tabloader.MusicOverlaySearchTab r0 = com.instagram.music.search.tabloader.MusicOverlaySearchTab.A0D
            goto L_0x014b
        L_0x016d:
            boolean r0 = X.C14245TsS.A02(r1)
            if (r0 == 0) goto L_0x0182
            boolean r0 = X.AnonymousClass30D.A0E(r5)
            if (r0 != 0) goto L_0x0093
            X.0Tu r6 = X.0Tu.A05
            r0 = 36322637208562002(0x810b3f001f2952, double:3.0339202579904875E-306)
            goto L_0x008d
        L_0x0182:
            com.instagram.api.schemas.MusicProduct r0 = com.instagram.api.schemas.MusicProduct.MUSIC_NOTES
            if (r1 != r0) goto L_0x00ba
            X.0Tu r6 = X.0Tu.A05
            r0 = 36322637208496465(0x810b3f001e2951, double:3.0339202579490417E-306)
            goto L_0x008d
        L_0x018f:
            java.lang.String r8 = "musicProduct"
            goto L_0x01b2
        L_0x0192:
            X.0lg r6 = X.DbT.A0X(r4)
            com.instagram.api.schemas.MusicProduct r0 = r13.A05
            if (r0 == 0) goto L_0x01b2
            X.0qQ.A0B(r6, r15)
            if (r0 != r3) goto L_0x01ce
            X.0Tu r3 = X.0Tu.A05
            r0 = 36322637208693076(0x810b3f00212954, double:3.033920258073379E-306)
            boolean r0 = X.182.A06(r3, r6, r0)
            if (r0 == 0) goto L_0x01ce
            com.google.common.collect.ImmutableList r1 = r13.A04
            if (r1 != 0) goto L_0x01ba
            java.lang.String r8 = "audioTrackTypesToExclude"
        L_0x01b2:
            X.0qQ.A0F(r8)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x01ba:
            com.instagram.music.common.constants.AudioTrackType r0 = com.instagram.music.common.constants.AudioTrackType.ORIGINAL
            boolean r0 = r1.contains(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01cb
            com.instagram.music.search.tabloader.MusicOverlaySearchTab r1 = com.instagram.music.search.tabloader.MusicOverlaySearchTab.A09
        L_0x01c6:
            com.instagram.music.common.model.MusicBrowseCategory r0 = r1.A01
            r0.A06 = r5
            goto L_0x01da
        L_0x01cb:
            com.instagram.music.search.tabloader.MusicOverlaySearchTab r1 = com.instagram.music.search.tabloader.MusicOverlaySearchTab.A0A
            goto L_0x01c6
        L_0x01ce:
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            boolean r0 = X.AnonymousClass30D.A08(r0)
            if (r0 == 0) goto L_0x01df
            com.instagram.music.search.tabloader.MusicOverlaySearchTab r1 = com.instagram.music.search.tabloader.MusicOverlaySearchTab.A04
        L_0x01da:
            r14.add(r1)
            goto L_0x00cb
        L_0x01df:
            com.instagram.music.search.tabloader.MusicOverlaySearchTab r0 = com.instagram.music.search.tabloader.MusicOverlaySearchTab.A08
            r14.add(r0)
            com.instagram.music.search.tabloader.MusicOverlaySearchTab r1 = com.instagram.music.search.tabloader.MusicOverlaySearchTab.A06
            goto L_0x01da
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.music.search.AudioBrowserBrowseLandingPageFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    private final boolean A00() {
        if (this.tabbedFragmentController == null || A02().A00.size() <= 0) {
            return false;
        }
        return true;
    }

    private final boolean A01() {
        MusicProduct musicProduct = this.A05;
        if (musicProduct != null) {
            if (musicProduct == MusicProduct.BOOST_AUDIO_BROWSER) {
                return true;
            }
            0lg A0X = DbT.A0X(this.A0H);
            MusicProduct musicProduct2 = this.A05;
            if (musicProduct2 != null) {
                0qQ.A0B(A0X, 0);
                if (musicProduct2 != MusicProduct.MUSIC_IN_FEED || !182.A06(0Tu.A05, A0X, 36322637208365391L)) {
                    return false;
                }
                return true;
            }
        }
        0qQ.A0F("musicProduct");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C16294UsC A02() {
        C16294UsC usC = this.tabbedFragmentController;
        if (usC != null) {
            return usC;
        }
        0qQ.A0F("tabbedFragmentController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ Fragment ALb(Object obj) {
        String str;
        Fragment A002;
        String str2;
        MusicOverlaySearchTab musicOverlaySearchTab = (MusicOverlaySearchTab) obj;
        0qQ.A0B(musicOverlaySearchTab, 0);
        MusicBrowseCategory musicBrowseCategory = musicOverlaySearchTab.A01;
        if ("gallery".equals(musicBrowseCategory.A00())) {
            AnonymousClass0eM r4 = this.A0H;
            if (182.A06(0Tu.A05, AnonymousClass7TF.A0L(r4, 0), 36314472473692734L)) {
                UserSession A0S = DbW.A0S(r4, 0);
                A002 = new K7A();
                A002.setArguments(DbY.A09(A0S));
                return A002;
            }
        }
        UserSession A0l = AnonymousClass7TE.A0l(this.A0H);
        MusicAttributionConfig musicAttributionConfig = this.A07;
        MusicProduct musicProduct = this.A05;
        if (musicProduct == null) {
            str2 = "musicProduct";
        } else {
            ImmutableList immutableList = this.A04;
            if (immutableList == null) {
                str2 = "audioTrackTypesToExclude";
            } else {
                String str3 = this.A0D;
                if (str3 == null) {
                    str2 = "browseSessionFullId";
                } else {
                    AnonymousClass80X r7 = this.A0C;
                    if (r7 == null) {
                        str2 = "captureState";
                    } else {
                        C59725JVj jVj = this.A02;
                        if (jVj == null) {
                            str2 = "surfaceType";
                        } else {
                            C3515589i r5 = this.A01;
                            ImmutableList immutableList2 = this.A03;
                            int i = this.A00;
                            String str4 = this.A0E;
                            boolean z = this.A0G;
                            Map map = this.A0F;
                            if (0qQ.A0K(musicBrowseCategory.A00(), "trending")) {
                                str = "full_list";
                            } else {
                                str = "preview";
                            }
                            AnonymousClass80X r22 = r7;
                            String str5 = str3;
                            MusicBrowseCategory musicBrowseCategory2 = musicBrowseCategory;
                            MusicOverlaySearchTab musicOverlaySearchTab2 = musicOverlaySearchTab;
                            MusicAttributionConfig musicAttributionConfig2 = musicAttributionConfig;
                            MusicProduct musicProduct2 = musicProduct;
                            ImmutableList immutableList3 = immutableList2;
                            ImmutableList immutableList4 = immutableList;
                            C59725JVj jVj2 = jVj;
                            C3515589i r13 = r5;
                            A002 = C63352KvZ.A00(r13, jVj2, immutableList4, immutableList3, musicProduct2, A0l, musicAttributionConfig2, musicBrowseCategory2, musicOverlaySearchTab2, r22, str5, str4, str, map, i, true, z);
                            C66447MSb mSb = this.A0A;
                            if (mSb == null) {
                                str2 = "trackSelectionDelegate";
                            } else {
                                A002.A05 = mSb;
                                C234462xu r0 = this.A08;
                                if (r0 != null) {
                                    A002.A03 = r0;
                                    return A002;
                                }
                                throw AnonymousClass7TE.A0y();
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ OIJ AN9(Object obj) {
        String string;
        MusicOverlaySearchTab musicOverlaySearchTab = (MusicOverlaySearchTab) obj;
        0qQ.A0B(musicOverlaySearchTab, 0);
        MusicBrowserCategoryModel musicBrowserCategoryModel = musicOverlaySearchTab.A02;
        if (musicBrowserCategoryModel != null) {
            string = musicBrowserCategoryModel.A01;
        } else {
            string = getString(musicOverlaySearchTab.A00);
        }
        String format = String.format(Locale.getDefault(), getString(2131967813), new Object[]{string});
        0qQ.A07(format);
        return new OIJ((Drawable) null, (Drawable) null, (View) null, string, format, -1, R.color.asset_picker_tab_colors, R.color.design_dark_default_color_on_background, -1, -1, R.color.fds_transparent, -1, -1, -1, -1, -1);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0H);
    }

    public final void DGh(Fragment fragment) {
        if (A00()) {
            A02().A01().setUserVisibleHint(false);
        }
    }

    public final void DGl(Fragment fragment) {
        if (A00()) {
            A02().A01().setUserVisibleHint(true);
        }
    }

    public final boolean isScrolledToBottom() {
        if (!A00()) {
            return true;
        }
        MU3 A012 = A02().A01();
        if (A012 instanceof MU3) {
            return A012.isScrolledToBottom();
        }
        return true;
    }

    public final boolean isScrolledToTop() {
        if (!A00()) {
            return true;
        }
        MU3 A012 = A02().A01();
        if (A012 instanceof MU3) {
            return A012.isScrolledToTop();
        }
        return true;
    }

    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        C3515589i r1;
        ImmutableList immutableList;
        int A022 = AnonymousClass0fD.A02(2106184280);
        AudioBrowserBrowseLandingPageFragment.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A0G = bundle2.getBoolean("shouldUseLightMode", false);
            this.A0F = (Map) bundle2.getSerializable("visualFeatures");
            Serializable serializable = bundle2.getSerializable("music_product");
            if (serializable != null) {
                this.A05 = (MusicProduct) serializable;
                ImmutableList.Builder builder = new ImmutableList.Builder();
                ArrayList parcelableArrayList = bundle2.getParcelableArrayList("audio_type_to_exclude");
                if (parcelableArrayList != null) {
                    builder.addAll(parcelableArrayList);
                    this.A04 = builder.build();
                    this.A0D = JTP.A0m(bundle2, "browse_session_full_id");
                    Serializable serializable2 = bundle2.getSerializable("capture_state");
                    if (serializable2 != null) {
                        this.A0C = (AnonymousClass80X) serializable2;
                        Serializable serializable3 = bundle2.getSerializable("camera_surface_type");
                        if (serializable3 != null) {
                            this.A02 = (C59725JVj) serializable3;
                            Serializable serializable4 = bundle2.getSerializable("camera_music_browser_entry_point");
                            if (serializable4 instanceof C3515589i) {
                                r1 = (C3515589i) serializable4;
                            } else {
                                r1 = null;
                            }
                            this.A01 = r1;
                            Serializable serializable5 = bundle2.getSerializable("camera_already_attached_tracks");
                            if (serializable5 instanceof ImmutableList) {
                                immutableList = (ImmutableList) serializable5;
                            } else {
                                immutableList = null;
                            }
                            this.A03 = immutableList;
                            this.A07 = (MusicAttributionConfig) bundle2.getParcelable("MusicOverlayBrowseResultsFragment.music_attribution_config");
                            this.A00 = bundle2.getInt("list_bottom_padding_px");
                            this.A0E = bundle2.getString("media_id");
                            if (bundle2.containsKey("defaultFocusedTab")) {
                                this.A0B = (MusicOverlaySearchTab) bundle2.getParcelable("defaultFocusedTab");
                            }
                            addFragmentVisibilityListener(this);
                            F0K f0k = this.A09;
                            if (f0k != null) {
                                1YN A002 = AnonymousClass2bO.A00();
                                UserSession userSession = f0k.A04;
                                QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A14;
                                AnonymousClass2bO.A00();
                                f0k.A00 = A002.A01(this, this, userSession, 2bV.A05(new C50735Fha(f0k, 5), C65550Lva.A00), quickPromotionSlot);
                            }
                            this.A06 = new C64161LRc();
                            29H A0K = JTS.A0K(this.A0H);
                            MusicProduct musicProduct = this.A05;
                            if (musicProduct == null) {
                                0qQ.A0F("musicProduct");
                                throw AnonymousClass00P.createAndThrow();
                            }
                            String str = musicProduct.A00;
                            0qQ.A0B(str, 0);
                            long j = A0K.A02;
                            int i2 = (j > 17641988 ? 1 : (j == 17641988 ? 0 : -1));
                            29E r5 = A0K.A0E;
                            if (i2 == 0) {
                                long A032 = r5.A03(17641988, A0K.A0B);
                                A0K.A02 = A032;
                                r5.A09(A032, "music_browser_entry_point", "unknown");
                            } else {
                                JTP.A1L(r5, "music_browser_search_overlay_fragment_music_product : ", str, j);
                            }
                            AnonymousClass0fD.A09(803880679, A022);
                            return;
                        }
                        illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                        i = -2072552052;
                    } else {
                        illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                        i = -1505153241;
                    }
                } else {
                    illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                    i = -569739723;
                }
            } else {
                illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                i = -11857277;
            }
        } else {
            illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
            i = -359099330;
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalStateException;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-648035775);
        0qQ.A0B(layoutInflater, 0);
        if (this.A0G) {
            layoutInflater = JTS.A09(requireContext(), layoutInflater);
        }
        View inflate = layoutInflater.inflate(R.layout.fragment_music_overlay_search_landing_page, viewGroup, false);
        AnonymousClass0fD.A09(1471296986, A022);
        return inflate;
    }

    public final void onDestroy() {
        C47018DpA dpA;
        int A022 = AnonymousClass0fD.A02(-853748717);
        super.onDestroy();
        F0K f0k = this.A09;
        if (f0k != null) {
            if (!(f0k.A02 == null || (dpA = f0k.A01) == null)) {
                IgImageView igImageView = dpA.A05;
                if (igImageView != null) {
                    igImageView.setVisibility(8);
                }
                TextView textView = dpA.A04;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                TextView textView2 = dpA.A02;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                TextView textView3 = dpA.A03;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
                ImageView imageView = dpA.A01;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
            }
            f0k.A01 = null;
            f0k.A02 = null;
            f0k.A00 = null;
        }
        AnonymousClass0fD.A09(606696231, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-658073385);
        super.onDestroyView();
        AudioBrowserBrowseLandingPageFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0fD.A09(1219639095, A022);
    }

    public final /* bridge */ /* synthetic */ MU2 Edi(C234462xu r1) {
        this.A08 = r1;
        return this;
    }

    public final /* bridge */ /* synthetic */ MU2 Ep4(C66447MSb mSb) {
        this.A0A = mSb;
        return this;
    }
}
