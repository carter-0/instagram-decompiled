package X;

import android.content.Intent;
import android.view.View;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicBrowseCategory;
import java.util.Map;
import java.util.Set;

public final class JYC implements MXG, MU0, C3515989m, C3493580b {
    public static final String __redex_internal_original_name = "StoriesMusicSearchController";
    public View A00;
    public C3515589i A01;
    public C59725JVj A02;
    public K6I A03;
    public JZ0 A04;
    public Map A05;
    public boolean A06;
    public final ViewStub A07;
    public final 0hq A08;
    public final UserSession A09;
    public final C3499982t A0A;
    public final C234462xu A0B;
    public final MVD A0C;
    public final String A0D;
    public final Set A0E = DbS.A0y();

    public JYC(ViewStub viewStub, 0hq r4, UserSession userSession, AnonymousClass80U r6, C3499982t r7, C234462xu r8, MVD mvd, Map map) {
        0qQ.A0B(viewStub, 1);
        AnonymousClass7TG.A1S(r7, r8);
        this.A07 = viewStub;
        this.A08 = r4;
        this.A09 = userSession;
        this.A0A = r7;
        this.A0B = r8;
        this.A0C = mvd;
        this.A05 = map;
        viewStub.getContext().getColor(R.color.black_50_transparent);
        this.A02 = C59725JVj.POST_CAPTURE;
        r6.A7w(this);
        this.A0D = "music_search";
    }

    public final int B7t(C62487Kgc kgc) {
        int A022 = DbU.A02(kgc, 0);
        if (A022 == 1) {
            return R.id.stories_music_search_search_results_container;
        }
        if (A022 == 0) {
            return R.id.stories_music_search_landing_page_container;
        }
        if (A022 == 2) {
            return R.id.stories_music_search_saved_page_container;
        }
        throw AnonymousClass7TE.A0w("Unsupported MusicSearchMode");
    }

    public final /* synthetic */ void CI8(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void Dfq() {
    }

    private final AnonymousClass80X A00() {
        int ordinal = this.A02.ordinal();
        if (ordinal == 0 || ordinal == 13) {
            return AnonymousClass80X.PRE_CAPTURE;
        }
        return AnonymousClass80X.POST_CAPTURE;
    }

    public final Set Acf() {
        return this.A0E;
    }

    public final boolean CII() {
        JZ0 jz0 = this.A04;
        if (jz0 != null) {
            return jz0.A0A();
        }
        K6I k6i = this.A03;
        if (k6i != null) {
            return k6i.onBackPressed();
        }
        return false;
    }

    public final void Cw3() {
        this.A0C.DT0();
    }

    public final void DSk() {
        this.A0C.DT0();
    }

    public final void DSm(C66569MWx mWx, MusicBrowseCategory musicBrowseCategory, String str, String str2) {
        this.A0C.DTF(mWx, musicBrowseCategory, str, str2);
    }

    public final /* bridge */ /* synthetic */ void Dmx(Object obj, Object obj2, Object obj3) {
        if (obj == AnonymousClass80V.ASSET_PICKER || obj == AnonymousClass80V.ASSET_PICKER_IN_STACKED_TIMELINE) {
            if (obj3 instanceof AnonymousClass8UN) {
                JZ0 jz0 = this.A04;
                if (jz0 != null) {
                    jz0.A09(AnonymousClass05K.A00);
                    return;
                }
                return;
            }
        } else if (obj2 != AnonymousClass80V.CAPTURE) {
            return;
        }
        JZ0 jz02 = this.A04;
        if (jz02 != null) {
            jz02.A08(AnonymousClass05K.A00);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0089, code lost:
        if (X.182.A06(X.0Tu.A05, r3, 36322637206989119L) == false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008e, code lost:
        if (r13.A00 != null) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0090, code lost:
        r2 = X.JTP.A0H(r13.A07, com.instagram.android.R.layout.layout_stories_music_search);
        r13.A00 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009b, code lost:
        if (r2 == null) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009d, code lost:
        r13.A0E.add(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a8, code lost:
        if (A00() != X.AnonymousClass80X.PRE_CAPTURE) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00aa, code lost:
        r7 = com.instagram.api.schemas.MusicProduct.MUSIC_FIRST;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ac, code lost:
        r8 = r13.A09;
        r5 = X.JTS.A0H(X.AnonymousClass30D.A0E(r8) ? 1 : 0);
        X.0qQ.A07(r5);
        r13.A04 = new X.JZ0(r2, r13.A08, r13.A01, r5, (com.google.common.collect.ImmutableList) null, r7, r8, r13.A0A, (com.instagram.music.common.config.MusicAttributionConfig) null, r13.A0B, r13.A0C, r13, A00(), (java.lang.String) null, (java.lang.String) null, r13.A05, 0, false, false, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00dd, code lost:
        r2 = r13.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00df, code lost:
        if (r2 == null) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e3, code lost:
        if (r13.A06 == false) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e5, code lost:
        r1 = com.instagram.music.search.tabloader.MusicOverlaySearchTab.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e7, code lost:
        r2.A07(r1, X.AnonymousClass05K.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ec, code lost:
        r2 = new X.C64161LRc();
        r8 = r13.A09;
        r9 = r13.A0D;
        r10 = r13.A0A.BUn();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r13.A04 == null) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0101, code lost:
        if (A00() != X.AnonymousClass80X.PRE_CAPTURE) goto L_0x0110;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0103, code lost:
        r7 = com.instagram.api.schemas.MusicProduct.MUSIC_FIRST;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0105, code lost:
        r2.A02((X.C62642Kk4) null, r13.A01, (X.C371088xY) null, r13.A02, r7, r8, r9, r10, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x010f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0110, code lost:
        r7 = com.instagram.api.schemas.MusicProduct.POST_CAPTURE_STICKER;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0113, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0115, code lost:
        r7 = com.instagram.api.schemas.MusicProduct.POST_CAPTURE_STICKER;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E0h() {
        /*
            r22 = this;
            r13 = r22
            android.view.View r0 = r13.A00
            r18 = 0
            if (r0 == 0) goto L_0x006f
            X.JZ0 r0 = r13.A04
            if (r0 != 0) goto L_0x008c
        L_0x000c:
            android.view.View r0 = r13.A00
            if (r0 != 0) goto L_0x0055
            android.view.ViewStub r1 = r13.A07
            r0 = 2131626963(0x7f0e0bd3, float:1.8881177E38)
            android.view.View r1 = X.JTP.A0H(r1, r0)
            r13.A00 = r1
            if (r1 == 0) goto L_0x0022
            java.util.Set r0 = r13.A0E
            r0.add(r1)
        L_0x0022:
            com.instagram.common.session.UserSession r3 = r13.A09
            X.80X r5 = r13.A00()
            X.82t r0 = r13.A0A
            java.lang.String r6 = r0.BUn()
            X.80X r1 = r13.A00()
            X.80X r0 = X.AnonymousClass80X.PRE_CAPTURE
            if (r1 != r0) goto L_0x006c
            com.instagram.api.schemas.MusicProduct r2 = com.instagram.api.schemas.MusicProduct.MUSIC_FIRST
        L_0x0038:
            boolean r0 = X.AnonymousClass30D.A0E(r3)
            com.google.common.collect.ImmutableList r1 = X.JTS.A0H(r0)
            X.0qQ.A07(r1)
            boolean r0 = r13.A06
            if (r0 == 0) goto L_0x006a
            com.instagram.music.search.tabloader.MusicOverlaySearchTab r4 = com.instagram.music.search.tabloader.MusicOverlaySearchTab.A04
        L_0x0049:
            X.89i r0 = r13.A01
            java.util.Map r7 = r13.A05
            X.K6I r0 = X.LJS.A01(r0, r1, r2, r3, r4, r5, r6, r7)
            r13.A03 = r0
            r0.A03 = r13
        L_0x0055:
            X.K6I r2 = r13.A03
            if (r2 == 0) goto L_0x0069
            X.0hq r0 = r13.A08
            X.0s1 r1 = new X.0s1
            r1.<init>(r0)
            r0 = 2131436642(0x7f0b2462, float:1.849516E38)
            r1.A0A(r2, r0)
            r1.A01()
        L_0x0069:
            return
        L_0x006a:
            r4 = 0
            goto L_0x0049
        L_0x006c:
            com.instagram.api.schemas.MusicProduct r2 = com.instagram.api.schemas.MusicProduct.POST_CAPTURE_STICKER
            goto L_0x0038
        L_0x006f:
            com.instagram.common.session.UserSession r3 = r13.A09
            X.0Tu r2 = X.0Tu.A06
            r0 = 36323960056458883(0x810c7300002e83, double:3.034756832327156E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x000c
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322637206989119(0x810b3f0007293f, double:3.03392025699579E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x008c
            goto L_0x000c
        L_0x008c:
            android.view.View r0 = r13.A00
            if (r0 != 0) goto L_0x00dd
            android.view.ViewStub r1 = r13.A07
            r0 = 2131627379(0x7f0e0d73, float:1.888202E38)
            android.view.View r2 = X.JTP.A0H(r1, r0)
            r13.A00 = r2
            if (r2 == 0) goto L_0x00dd
            java.util.Set r0 = r13.A0E
            r0.add(r2)
            X.80X r1 = r13.A00()
            X.80X r0 = X.AnonymousClass80X.PRE_CAPTURE
            if (r1 != r0) goto L_0x0115
            com.instagram.api.schemas.MusicProduct r7 = com.instagram.api.schemas.MusicProduct.MUSIC_FIRST
        L_0x00ac:
            com.instagram.common.session.UserSession r8 = r13.A09
            boolean r0 = X.AnonymousClass30D.A0E(r8)
            com.google.common.collect.ImmutableList r5 = X.JTS.A0H(r0)
            X.0qQ.A07(r5)
            X.0hq r3 = r13.A08
            X.82t r9 = r13.A0A
            X.2xu r11 = r13.A0B
            X.80X r14 = r13.A00()
            X.89i r4 = r13.A01
            r6 = 0
            X.MVD r12 = r13.A0C
            java.util.Map r0 = r13.A05
            X.JZ0 r1 = new X.JZ0
            r10 = r6
            r15 = r6
            r16 = r6
            r17 = r0
            r19 = r18
            r20 = r18
            r21 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r13.A04 = r1
        L_0x00dd:
            X.JZ0 r2 = r13.A04
            if (r2 == 0) goto L_0x00ec
            boolean r0 = r13.A06
            if (r0 == 0) goto L_0x0113
            com.instagram.music.search.tabloader.MusicOverlaySearchTab r1 = com.instagram.music.search.tabloader.MusicOverlaySearchTab.A04
        L_0x00e7:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r2.A07(r1, r0)
        L_0x00ec:
            X.LRc r2 = new X.LRc
            r2.<init>()
            com.instagram.common.session.UserSession r8 = r13.A09
            java.lang.String r9 = r13.A0D
            X.82t r0 = r13.A0A
            java.lang.String r10 = r0.BUn()
            X.80X r1 = r13.A00()
            X.80X r0 = X.AnonymousClass80X.PRE_CAPTURE
            if (r1 != r0) goto L_0x0110
            com.instagram.api.schemas.MusicProduct r7 = com.instagram.api.schemas.MusicProduct.MUSIC_FIRST
        L_0x0105:
            X.JVj r6 = r13.A02
            X.89i r4 = r13.A01
            r3 = 0
            r5 = r3
            r11 = r3
            r2.A02(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x0110:
            com.instagram.api.schemas.MusicProduct r7 = com.instagram.api.schemas.MusicProduct.POST_CAPTURE_STICKER
            goto L_0x0105
        L_0x0113:
            r1 = 0
            goto L_0x00e7
        L_0x0115:
            com.instagram.api.schemas.MusicProduct r7 = com.instagram.api.schemas.MusicProduct.POST_CAPTURE_STICKER
            goto L_0x00ac
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JYC.E0h():void");
    }

    public final void close() {
        JZ0 jz0 = this.A04;
        if (jz0 != null) {
            jz0.A08(AnonymousClass05K.A00);
        }
    }

    public final String getModuleName() {
        return this.A0D;
    }

    public final boolean isScrolledToBottom() {
        JZ0 jz0 = this.A04;
        if (jz0 != null) {
            MU3 A012 = JZ0.A01(jz0);
            if (A012 instanceof MU3) {
                return A012.isScrolledToBottom();
            }
            return true;
        }
        K6I k6i = this.A03;
        if (k6i != null) {
            return k6i.isScrolledToBottom();
        }
        return true;
    }

    public final boolean isScrolledToTop() {
        JZ0 jz0 = this.A04;
        if (jz0 != null) {
            MU3 A012 = JZ0.A01(jz0);
            if (A012 instanceof MU3) {
                return A012.isScrolledToTop();
            }
            if (A012 instanceof C273494mf) {
                return ((C273494mf) A012).isScrolledToTop();
            }
            return true;
        }
        K6I k6i = this.A03;
        if (k6i != null) {
            return k6i.isScrolledToTop();
        }
        return true;
    }

    public final String Aef(C62487Kgc kgc) {
        return AnonymousClass7TG.A0m(kgc, __redex_internal_original_name, C51975G9x.A0l(kgc));
    }
}
