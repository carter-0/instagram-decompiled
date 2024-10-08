package X;

import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.MusicBrowseCategory;
import com.instagram.music.search.MusicOverlayResultsListController;
import java.util.List;
import java.util.Map;

/* renamed from: X.Lua  reason: case insensitive filesystem */
public final class C65512Lua implements MU3 {
    public boolean A00;
    public final AnonymousClass4DH A01;
    public final MusicOverlayResultsListController A02;
    public final MU1 A03;
    public final C66575MXg A04;
    public final ImmutableList A05;
    public final UserSession A06;

    public final void A01(K1P k1p) {
        0qQ.A0B(k1p, 0);
        MusicOverlayResultsListController musicOverlayResultsListController = this.A02;
        List list = k1p.A01;
        C60246Ji3 ji3 = musicOverlayResultsListController.A0G;
        List list2 = ji3.A08;
        list2.clear();
        list2.addAll(list);
        boolean isEmpty = list.isEmpty();
        boolean z = true;
        if (!(!isEmpty) || !AnonymousClass7TF.A1Z(ji3.A0A)) {
            z = false;
        }
        ji3.A05 = z;
        ji3.A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004a, code lost:
        if (r11.A00() == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        if (r7.isEmpty() == false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.CGO r11, X.LFH r12, boolean r13) {
        /*
            r10 = this;
            r0 = 1
            X.0qQ.A0B(r12, r0)
            java.util.List r1 = r11.A05
            com.google.common.collect.ImmutableList r0 = r10.A05
            java.util.ArrayList r7 = X.C64131LPf.A01(r1, r0)
            r8 = r13
            if (r13 == 0) goto L_0x0023
            java.lang.String r0 = r12.A01
            if (r0 == 0) goto L_0x0020
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0020
            boolean r0 = r7.isEmpty()
            r1 = 1
            if (r0 != 0) goto L_0x0021
        L_0x0020:
            r1 = 0
        L_0x0021:
            r10.A00 = r1
        L_0x0023:
            com.instagram.music.search.MusicOverlayResultsListController r3 = r10.A02
            X.4DH r1 = r10.A01
            r0 = 2131972831(0x7f1352df, float:1.958268E38)
            java.lang.String r2 = X.DbU.A0m(r1, r0)
            r4 = 0
            java.lang.String r1 = "search"
            java.lang.String r0 = "5928524597172606"
            com.instagram.music.common.model.MusicBrowseCategory r0 = X.C64181LSn.A03(r1, r0, r2)
            r3.A04 = r0
            java.lang.String r5 = r12.A01
            boolean r0 = r12.A04
            if (r0 == 0) goto L_0x004c
            boolean r0 = r11.CPt()
            if (r0 != 0) goto L_0x004c
            boolean r0 = r11.A00()
            r9 = 1
            if (r0 != 0) goto L_0x004d
        L_0x004c:
            r9 = 0
        L_0x004d:
            r6 = r4
            r3.A09(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65512Lua.A02(X.CGO, X.LFH, boolean):void");
    }

    public final void A00() {
        C60246Ji3 ji3 = this.A02.A0G;
        ji3.A08.clear();
        ji3.A00();
    }

    public final boolean isScrolledToBottom() {
        return this.A02.A0A();
    }

    public final boolean isScrolledToTop() {
        return this.A02.A0B();
    }

    public C65512Lua(C3515589i r41, C59725JVj jVj, ImmutableList immutableList, ImmutableList immutableList2, MusicProduct musicProduct, AnonymousClass4DH r46, UserSession userSession, C60090JfW jfW, ClipsCreationViewModel clipsCreationViewModel, AnonymousClass4DU r50, C234462xu r51, MU1 mu1, C66447MSb mSb, C66575MXg mXg, C60246Ji3 ji3, C60329JjY jjY, AnonymousClass80X r57, String str, String str2, Map map, int i, boolean z) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 2);
        MusicProduct musicProduct2 = musicProduct;
        String str3 = str;
        C51973G9u.A0s(5, musicProduct2, str3, str2);
        AnonymousClass80X r4 = r57;
        C59725JVj jVj2 = jVj;
        C51972G9s.A1F(r4, jVj2);
        C60090JfW jfW2 = jfW;
        0qQ.A0B(jfW2, 17);
        C60329JjY jjY2 = jjY;
        0qQ.A0B(jjY2, 18);
        C60246Ji3 ji32 = ji3;
        0qQ.A0B(ji32, 19);
        ClipsCreationViewModel clipsCreationViewModel2 = clipsCreationViewModel;
        0qQ.A0B(clipsCreationViewModel2, 20);
        this.A06 = userSession2;
        AnonymousClass4DH r2 = r46;
        this.A01 = r2;
        MusicBrowseCategory A032 = C64181LSn.A03("search", "5928524597172606", DbU.A0m(r2, 2131972831));
        C234462xu r26 = r51;
        UserSession userSession3 = userSession2;
        C234502xy A002 = C234472xv.A00(r2.requireContext(), userSession3, r50, r26, "MusicSearchResultsView", C234472xv.A02(userSession2));
        ImmutableList immutableList3 = immutableList;
        Map map2 = map;
        C66575MXg mXg2 = mXg;
        C3515589i r13 = r41;
        C66447MSb mSb2 = mSb;
        C60246Ji3 ji33 = ji32;
        C60329JjY jjY3 = jjY2;
        C66575MXg mXg3 = mXg2;
        AnonymousClass80X r31 = r4;
        String str4 = str3;
        C65319LrI lrI = new C65319LrI(this, 8);
        ClipsCreationViewModel clipsCreationViewModel3 = clipsCreationViewModel2;
        C60090JfW jfW3 = jfW2;
        UserSession userSession4 = userSession2;
        AnonymousClass4DH r18 = r2;
        MusicProduct musicProduct3 = musicProduct2;
        MusicOverlayResultsListController musicOverlayResultsListController = new MusicOverlayResultsListController(r13, jVj2, immutableList3, immutableList2, musicProduct3, r18, userSession4, jfW3, clipsCreationViewModel3, lrI, (MusicAttributionConfig) null, A032, A002, r26, mSb2, ji33, jjY3, mXg3, r31, str4, r2.getModuleName(), (String) null, "full_list", map2, i, false, z);
        this.A02 = musicOverlayResultsListController;
        this.A04 = mXg2;
        MU1 mu12 = mu1;
        this.A03 = mu12;
        this.A05 = immutableList3;
        r2.registerLifecycleListener(musicOverlayResultsListController);
        musicOverlayResultsListController.A05 = new L24(mu12);
    }
}
