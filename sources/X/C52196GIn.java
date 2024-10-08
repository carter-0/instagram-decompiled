package X;

import android.content.Context;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.flashmedia.FlashMediaRepository;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.GIn  reason: case insensitive filesystem */
public final class C52196GIn extends C52050GCw implements C250603lj {
    public List A00;
    public C262204Co A01;
    public boolean A02;
    public boolean A03;
    public final Context A04;
    public final C57048IMo A05;
    public final C320446sO A06;
    public final ClipsViewerSource A07;
    public final UserSession A08;
    public final AnonymousClass93F A09;
    public final AnonymousClass93C A0A;
    public final 1Ua A0B;
    public final C295405o6 A0C;
    public final GD6 A0D;
    public final C52185GIb A0E;
    public final GE0 A0F;
    public final String A0G;
    public final Map A0H;
    public final AnonymousClass0eM A0I;
    public final AnonymousClass0eM A0J;
    public final C262224Cq A0K;
    public final C52280GLw A0L;
    public final GCH A0M;

    public static final C267324bN A00(C52196GIn gIn, List list, List list2) {
        String A2n;
        List A3b;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                1Xj r2 = (1Xj) it.next();
                if (!r2.CcK()) {
                    if (r2.A5z() || gIn.A0B.A03(r2.getId()) || (((A2n = r2.A2n()) != null && AnonymousClass2fL.A00(gIn.A08).A0P(A2n)) || (((A3b = r2.A3b()) != null && (!A3b.isEmpty())) || A03(r2, gIn)))) {
                        list2.add(r2);
                    } else {
                        C267324bN A022 = C295375o3.A02(r2);
                        UserSession userSession = gIn.A08;
                        0qQ.A0B(userSession, 0);
                        if (!182.A06(0Tu.A05, userSession, 36328250730888340L)) {
                            A022.A0D(AnonymousClass05K.A01);
                        }
                        if (!gIn.A0D.A0A.A0a(A022)) {
                            return A022;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static final boolean A02(C267324bN r14, C52196GIn gIn, boolean z) {
        Integer num;
        List list;
        if (r14 == null) {
            return false;
        }
        1Xj r1 = r14.A02;
        if (!(r1 == null || (list = gIn.A00) == null)) {
            list.remove(r1);
        }
        UserSession userSession = gIn.A08;
        if (182.A06(DbS.A0J(userSession, 0), userSession, 36328250730888340L)) {
            r14.A0D(AnonymousClass05K.A01);
        }
        GD6 gd6 = gIn.A0D;
        if (z) {
            gd6.A0B(AnonymousClass7TE.A1I(r14), true);
        } else {
            int A002 = GD6.A00(gd6) - 1;
            if (A002 < 0) {
                A002 = 0;
            }
            gd6.A0A.A0b(r14, A002);
        }
        C3728893a A0p = C51965G9l.A0p(gIn.A0I);
        if (A0p != null) {
            String id = r14.getId();
            if (!A0p.A00) {
                0XK r9 = new 0XK();
                r9.A00("media_id", id, 1);
                C3728893a.A00(A0p).markerPoint(976032351, 0, 7, "flash_cache_insertion", r9, System.currentTimeMillis(), TimeUnit.MILLISECONDS, 0);
            }
        }
        if (G9t.A1b(gIn.A0J)) {
            AnonymousClass3VK A003 = AnonymousClass3VI.A00(userSession);
            AnonymousClass3VL r4 = AnonymousClass3VL.REELS;
            if (z) {
                num = AnonymousClass05K.A15;
            } else {
                num = AnonymousClass05K.A0u;
            }
            int A004 = GD6.A00(gd6);
            if (!z) {
                A004--;
            }
            A003.A07(new C52567GXs(r4, num, Integer.valueOf(A004), (Integer) null, (Integer) null, (Integer) null, (String) null, r14.getId()));
        }
        return true;
    }

    public final void ATF(AnonymousClass30Y r6, C252093oY r7) {
        1Xj r3;
        0qQ.A0B(r6, 0);
        0qQ.A0B(r7, 1);
        Integer CEk = r7.CEk(r6);
        Integer num = AnonymousClass05K.A00;
        if (CEk == num && (r3 = ((C267324bN) r6.A03).A02) != null) {
            this.A09.EE4(r3, this.A0A);
            C295405o6 r2 = this.A0C;
            List singletonList = Collections.singletonList(r3);
            0qQ.A07(singletonList);
            r2.A00(C295415o7.FLASH_CACHE, num, singletonList);
        }
    }

    public static final void A01(C52228GJt gJt, C52196GIn gIn) {
        Integer num;
        UserSession userSession = gIn.A08;
        0Tu A0J2 = DbS.A0J(userSession, 0);
        if (!182.A06(A0J2, userSession, 36325918562465146L) || !1Bh.A00().A02()) {
            0qQ.A0B(userSession, 0);
            if ((182.A06(A0J2, userSession, 36325918562530683L) && 1Bh.A00().A03()) || !gIn.A02 || gIn.A0D.A0A.A0Z() || (num = gJt.A00) == AnonymousClass05K.A01) {
                return;
            }
            if ((!182.A06(A0J2, userSession, 36328250730560657L) || num != AnonymousClass05K.A00) && !182.A06(A0J2, userSession, 36317861203285618L) && !gIn.A03) {
                C320446sO r1 = gIn.A06;
                if (r1 != null) {
                    C320446sO.A02(r1, AnonymousClass05K.A0N);
                }
                gIn.A0C(new C58674Ivj(gIn, 7), new C58674Ivj(gIn, 8), true);
                gIn.A02 = false;
            }
        }
    }

    public final void A0C(C62320sa r12, C62320sa r13, boolean z) {
        C62320sa r7 = r13;
        C58206IoA ioA = new C58206IoA(9, r7, r12, this, z);
        if ((!182.A06(0Tu.A05, this.A08, 36323427480513688L) || !z) && this.A00 != null) {
            ioA.invoke();
            return;
        }
        GLS gls = new GLS(2, this, ioA);
        this.A09.B5y(new GKP(this.A06), gls, this.A0A);
    }

    public C52196GIn(Context context, C320446sO r8, ClipsViewerSource clipsViewerSource, UserSession userSession, GD6 gd6, C52185GIb gIb, GCH gch, GE0 ge0, String str, C262224Cq r16, boolean z) {
        FlashMediaRepository flashMediaRepository;
        C51974G9v.A1L(context, userSession, gch);
        AnonymousClass7TF.A1F(ge0, 5, clipsViewerSource);
        0qQ.A0B(gIb, 11);
        this.A04 = context;
        this.A08 = userSession;
        this.A0D = gd6;
        this.A0M = gch;
        this.A0F = ge0;
        this.A06 = r8;
        this.A0G = str;
        this.A07 = clipsViewerSource;
        this.A0K = r16;
        this.A0E = gIb;
        AnonymousClass93C r0 = AnonymousClass93C.A04;
        this.A0A = r0;
        this.A09 = AnonymousClass93D.A00(userSession, r0);
        this.A0C = C295395o5.A00(userSession);
        1Ua A0j = C51971G9r.A0j(userSession);
        0qQ.A07(A0j);
        this.A0B = A0j;
        this.A02 = AnonymousClass7TF.A1W(clipsViewerSource, ClipsViewerSource.CLIPS_TAB);
        0eO r3 = 0eO.A02;
        this.A0J = AnonymousClass0eN.A00(r3, new C58674Ivj(this, 6));
        this.A0I = AnonymousClass0eN.A00(r3, new C58674Ivj(this, 5));
        EnumMap enumMap = new EnumMap(GJR.class);
        enumMap.put(GJR.CLIPS, AnonymousClass7TE.A0v());
        UserSession userSession2 = this.A08;
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession2, 36319776758308479L)) {
            enumMap.put(GJR.PHOTO_WITHOUT_MUSIC, AnonymousClass7TF.A0R(r2, userSession2, 36319776758570627L));
            enumMap.put(GJR.PHOTO_WITH_MUSIC, AnonymousClass7TF.A0R(r2, userSession2, 36319776758636164L));
            enumMap.put(GJR.CAROUSEL_WITH_MUSIC, AnonymousClass7TF.A0R(r2, userSession2, 36319776758505090L));
            enumMap.put(GJR.CAROUSEL_WITH_PHOTO_IN_FIRST_POSITION, AnonymousClass7TF.A0R(r2, userSession2, 36319776758374016L));
            enumMap.put(GJR.CAROUSEL_WITH_VIDEO_IN_FIRST_POSITION, AnonymousClass7TF.A0R(r2, userSession2, 36319776758439553L));
        }
        this.A0H = enumMap;
        this.A05 = new C57048IMo(this, 4);
        C52280GLw gLw = new C52280GLw(this);
        this.A0L = gLw;
        gch.A03(gLw);
        if (1Pn.A02 && 182.A06(0Tu.A06, userSession, 36331089702568844L)) {
            UserSession userSession3 = this.A08;
            0qQ.A0B(userSession3, 0);
            if (182.A06(r2, userSession3, 36325918562465146L) && 1Bh.A00().A02()) {
                return;
            }
            if ((!182.A06(r2, userSession3, 36325918562530683L) || !1Bh.A00().A03()) && !z && this.A02 && !this.A0D.A0A.A0Z()) {
                18g A012 = C638918c.A01(C61170le.A00);
                A012.A0O(A012.A02, "REELS_TAB_FLASH_CACHE_INSERTION_STARTED");
                AnonymousClass93F r22 = this.A09;
                if ((r22 instanceof FlashMediaRepository) && (flashMediaRepository = (FlashMediaRepository) r22) != null) {
                    C55926Hpo hpo = new C55926Hpo(this);
                    flashMediaRepository.A01 = hpo;
                    if (flashMediaRepository.A06) {
                        hpo.A00(flashMediaRepository.A00);
                        flashMediaRepository.A01 = null;
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0030, code lost:
        if (X.182.A06(X.0Tu.A05, r6.A08, 36328620096503268L) == false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A03(X.1Xj r5, X.C52196GIn r6) {
        /*
            X.1sQ r0 = X.C51966G9m.A0n(r5)
            r4 = 1
            if (r0 == 0) goto L_0x0042
            java.lang.Boolean r0 = r0.Axb()
            boolean r2 = X.AnonymousClass7TF.A1Y(r0, r4)
        L_0x000f:
            java.util.Set r1 = X.C52076GDw.A02
            java.util.Set r0 = X.C52076GDw.A00
            java.util.LinkedHashSet r1 = X.094.A00(r0, r1)
            X.GJR r0 = X.C52076GDw.A00(r5)
            boolean r0 = r1.contains(r0)
            if (r2 == 0) goto L_0x0044
            if (r0 == 0) goto L_0x0032
            com.instagram.common.session.UserSession r3 = r6.A08
            X.0Tu r2 = X.0Tu.A05
            r0 = 36328620096503268(0x8110b000083de4, double:3.0377038604157E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x0041
        L_0x0032:
            com.instagram.common.session.UserSession r3 = r6.A08
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323174077967321(0x810bbc00082bd9, double:3.034259776364211E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0044
        L_0x0041:
            return r4
        L_0x0042:
            r2 = 0
            goto L_0x000f
        L_0x0044:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52196GIn.A03(X.1Xj, X.GIn):boolean");
    }

    public final void onDestroyView() {
        super.onDestroyView();
        C52012GBj gBj = this.A02;
        if (gBj != null) {
            gBj.A0K(this.A05);
        }
    }
}
