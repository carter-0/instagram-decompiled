package X;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.odin.model.OdinContext;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.ConfirmationStyle;
import com.instagram.api.schemas.MediaControlEventSourceEnum;
import com.instagram.api.schemas.MediaControlSurfaceEnum;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerDirectData;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.clips.model.ClipsReplyBarData;
import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;

@Deprecated(message = "This ViewModel is now deprecated. Please reference ClipsViewerViewModel.")
public final class GBE extends C52050GCw implements C229372nH, C59544JNq, C20963X6q, C233292vT, C227342j3, C227352j4 {
    public static final Set A25 = C51967G9n.A0t(new ClipsViewerSource[]{ClipsViewerSource.CONTEXTUAL_HIGHLIGHT_CHAIN, ClipsViewerSource.BREAKING_CREATOR_LABEL, ClipsViewerSource.AUDIO_PAGE_CHAIN}, 0);
    public int A00;
    public GJT A01;
    public C229372nH A02;
    public 1wn A03;
    public 1wn A04;
    public AnonymousClass348 A05;
    public C52029GCb A06;
    public C227232is A07;
    public C57050IMq A08;
    public GCB A09;
    public HK9 A0A;
    public GNH A0B;
    public GPN A0C;
    public C66907Meq A0D;
    public C52196GIn A0E;
    public HKA A0F;
    public HK8 A0G;
    public GME A0H;
    public GKU A0I;
    public C52272GLn A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public final Context A0Q;
    public final FragmentActivity A0R;
    public final C270694h9 A0S;
    public final C51990GAn A0T;
    public final C320446sO A0U;
    public final C52278GLu A0V;
    public final GMD A0W;
    public final C229352nF A0X;
    public final ClipsViewerConfig A0Y;
    public final C270754hF A0Z;
    public final UserSession A0a;
    public final 2el A0b;
    public final AnonymousClass7QE A0c;
    public final C234052wu A0d;
    public final JU5 A0e;
    public final C228312lJ A0f;
    public final AnonymousClass57M A0g;
    public final C231002qi A0h;
    public final C230882qT A0i;
    public final AnonymousClass3DW A0j;
    public final C14192TrX A0k;
    public final C52232GJx A0l;
    public final C55566Hjm A0m;
    public final C55948HqC A0n;
    public final C52051GCx A0o;
    public final C52231GJw A0p;
    public final C54575HJk A0q;
    public final GYI A0r;
    public final C57689Ies A0s;
    public final C52185GIb A0t;
    public final GE5 A0u;
    public final GD0 A0v;
    public final C40691Ah8 A0w;
    public final C52179GHv A0x;
    public final IOG A0y;
    public final GCA A0z;
    public final HK5 A10;
    public final GI5 A11;
    public final GE2 A12;
    public final HnV A13;
    public final C56043Hrq A14;
    public final GIN A15;
    public final GLR A16;
    public final H3C A17;
    public final GE3 A18;
    public final C51979GAc A19;
    public final GCH A1A;
    public final GE0 A1B;
    public final GE1 A1C;
    public final AnonymousClass93T A1D;
    public final C55684Hlh A1E;
    public final C52077GDx A1F;
    public final C52262GLd A1G;
    public final GF2 A1H;
    public final C55875How A1I;
    public final GE4 A1J;
    public final C52016GBn A1K;
    public final GD9 A1L;
    public final String A1M;
    public final String A1N;
    public final String A1O;
    public final List A1P = AnonymousClass7TE.A1C();
    public final AnonymousClass0eM A1Q;
    public final AnonymousClass0eM A1R;
    public final AnonymousClass0eM A1S;
    public final AnonymousClass0eM A1T;
    public final AnonymousClass0eM A1U;
    public final AnonymousClass0eM A1V;
    public final AnonymousClass0eM A1W;
    public final AnonymousClass0eM A1X;
    public final AnonymousClass0eM A1Y;
    public final AnonymousClass0eM A1Z;
    public final AnonymousClass0eM A1a;
    public final AnonymousClass0eM A1b = C58709IwI.A01(this, 46);
    public final AnonymousClass0eM A1c;
    public final AnonymousClass0eM A1d;
    public final AnonymousClass0eM A1e;
    public final AnonymousClass0eM A1f;
    public final AnonymousClass0eM A1g;
    public final AnonymousClass0eM A1h;
    public final AnonymousClass0eM A1i;
    public final AnonymousClass0eM A1j = C58676Ivl.A00(this, 5);
    public final AnonymousClass0eM A1k = C58676Ivl.A00(this, 7);
    public final AnonymousClass0eM A1l = C58676Ivl.A00(this, 8);
    public final AnonymousClass0eM A1m = C58676Ivl.A00(this, 9);
    public final AnonymousClass0eM A1n = C58676Ivl.A00(this, 10);
    public final AnonymousClass0eM A1o = C58676Ivl.A00(this, 11);
    public final AnonymousClass0eM A1p = C58676Ivl.A00(this, 12);
    public final AnonymousClass0eM A1q = C58676Ivl.A00(this, 13);
    public final AnonymousClass0eM A1r = C58676Ivl.A00(this, 14);
    public final AnonymousClass0eM A1s = C58676Ivl.A00(this, 15);
    public final AnonymousClass0eM A1t = C58676Ivl.A00(this, 16);
    public final AnonymousClass0eM A1u = C58676Ivl.A00(this, 17);
    public final C62320sa A1v;
    public final C62320sa A1w;
    public final C62320sa A1x;
    public final C62320sa A1y;
    public final C62320sa A1z;
    public final C62320sa A20;
    public final boolean A21;
    public final boolean A22;
    public final C55774Hn9 A23;
    public final C55682Hlf A24;

    private final boolean A06(boolean z) {
        ClipsViewerConfig clipsViewerConfig;
        String str;
        ImmutableList immutableList;
        1Xj r0;
        C296815qg Beg;
        if (!z) {
            C324366zA r1 = this.A1A.A04.A03;
            if (r1.A07 == null && r1.A03 != AnonymousClass05K.A0C) {
                UserSession userSession = this.A0a;
                if (182.A06(0Tu.A05, userSession, 36325918563054977L) && (str = (clipsViewerConfig = this.A0Y).A1H) != null && (immutableList = clipsViewerConfig.A0E) != null) {
                    Iterator A072 = C52009GBg.A07(this.A0q);
                    while (true) {
                        if (!A072.hasNext()) {
                            break;
                        }
                        C267324bN r12 = (C267324bN) A072.next();
                        if ((0qQ.A0K(r12.getId(), str) || immutableList.contains(r12.getId())) && (r0 = r12.A02) != null && (Beg = r0.A0C.Beg()) != null && 0qQ.A0K(Beg.Bu7(), true)) {
                            break;
                        }
                    }
                }
                if (1KU.A06(userSession) && !1KU.A02(userSession).contains(this.A0Y.A0J.name())) {
                    C52185GIb gIb = this.A0t;
                    return !gIb.A01 && gIb.A00;
                }
            }
        }
    }

    public final void A0I(View view, C267324bN r11) {
        Integer num;
        0qQ.A0B(r11, 0);
        GF2 gf2 = this.A1H;
        1Xj r1 = r11.A02;
        if (r1 != null) {
            C243993aT A002 = gf2.A01.A00(r1);
            C59721JVf jVf = gf2.A00;
            if (!(jVf == null || (num = gf2.A02) == null)) {
                0qQ.A0B(gf2.A03, 0);
                long currentTimeMillis = System.currentTimeMillis();
                Number number = (Number) jVf.A00;
                if (number != null) {
                    jVf.A01 = Long.valueOf(currentTimeMillis - number.longValue());
                    int intValue = num.intValue();
                    if (intValue == 0) {
                        jVf.A01(A002.A02);
                        A002.A02 = jVf;
                    } else if (intValue == 1) {
                        jVf.A01(A002.A00);
                        A002.A00 = jVf;
                    } else if (intValue == 2) {
                        jVf.A01(A002.A01);
                        A002.A01 = jVf;
                    } else {
                        throw AnonymousClass7TE.A1K();
                    }
                    gf2.A02 = null;
                    gf2.A00 = null;
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
        }
        0rq r2 = this.A0w.A00;
        if (r2 != null) {
            C638918c.A01(C61170le.A00);
            18g.A05(r2, "reels_tab_first_item_source", AnonymousClass9OK.A00(r11.A03));
            C58674Ivj ivj = new C58674Ivj(r2, 1);
            if (view != null) {
                view.post(new C57781IgM(ivj));
            } else {
                ivj.invoke();
            }
        }
    }

    public final void A0K(C267324bN r3, C52058GDe gDe) {
        0qQ.A0B(gDe, 1);
        C52029GCb gCb = this.A06;
        if (gCb != null) {
            C52033GCf gCf = gCb.A0Y;
            1Xj r0 = r3.A02;
            if (r0 != null) {
                C52034GCg gCg = gCf.A0H;
                gCg.A00 = r3;
                gCg.A02 = r0;
                gCg.A01 = gDe;
                gCg.A03 = gDe.A0E;
                gCg.A0D(HNR.A1g);
            }
        }
    }

    public final void A0N(C267324bN r17, String str, boolean z, boolean z2) {
        C54575HJk hJk = this.A0q;
        UserSession userSession = this.A0a;
        AnonymousClass7TG.A1O(hJk, userSession);
        C267324bN r3 = r17;
        1Xj r4 = r3.A02;
        boolean z3 = z;
        if (r4 != null) {
            1sd.A00(userSession).A02(r4, z3);
            if (!z) {
                hJk.Eie(r3, AnonymousClass3WA.A0F);
            }
        }
        1Xj r9 = r3.A02;
        if (r9 != null) {
            if (z) {
                AnonymousClass942 A002 = AnonymousClass941.A00(userSession);
                if (A002.A01(r9)) {
                    A002.A00(r9, AnonymousClass05K.A0N);
                    C51979GAc gAc = this.A19;
                    String str2 = this.A1D.A00;
                    MediaControlEventSourceEnum mediaControlEventSourceEnum = MediaControlEventSourceEnum.SEE_LESS_TAP;
                    C51974G9v.A1O(userSession, gAc, r9, str2);
                    C54971Ha4.A00(mediaControlEventSourceEnum, MediaControlSurfaceEnum.REELS, gAc, userSession, r9, str2, true);
                }
                this.A1K.A0N((C267324bN) null, "hide", false, true);
                this.A1P.add(r3);
            } else {
                this.A1K.A0D();
                GD0 gd0 = this.A0v;
                Handler handler = gd0.A02;
                handler.removeCallbacks(gd0.A06);
                handler.removeCallbacks(gd0.A07);
                this.A1P.remove(r3);
                hJk.Ek5(r3, HLU.A03);
            }
            C62320sa r42 = this.A20;
            long A092 = (long) GD6.A01(r42).BzC(r3).A09();
            r42.invoke();
            if (!z) {
                C51979GAc gAc2 = this.A19;
                AnonymousClass93T r6 = this.A1D;
                String str3 = this.A1E.A00;
                AnonymousClass7TF.A1D(gAc2, 0, r6);
                if (str3 != null && !182.A06(0Tu.A05, userSession, 36312183257236419L)) {
                    0Aj A0e2 = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(gAc2, userSession), "instagram_clips_see_less_undo");
                    A0e2.AAJ("action_source", "clips_viewer_undo_button");
                    C51979GAc.A01(A0e2, gAc2);
                    String id = r9.getId();
                    if (id != null) {
                        C51965G9l.A1P(A0e2, id);
                        C51970G9q.A19(A0e2, A092);
                        C51970G9q.A1G(A0e2, r6);
                        C51965G9l.A1R(A0e2, r6.AmZ());
                        A0e2.AAJ("viewer_init_media_compound_key", str3);
                        C51972G9s.A14(A0e2, r9);
                        C51972G9s.A15(A0e2, r9);
                        AnonymousClass7TH.A0V(A0e2);
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                }
            }
            if (!r3.CcK()) {
                I2R.A02(this.A19, userSession, r9, this.A1D.A00, str, A092, z3, z2);
            }
        }
    }

    public final void A0P(List list) {
        0qQ.A0B(list, 0);
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            1Xj A0n2 = C51968G9o.A0n(it);
            if (A0n2 != null) {
                String A2n = A0n2.A2n();
                String str = this.A1E.A00;
                if (str != null && 0qQ.A0K(A2n, 1Xv.A06(str)) && this.A0Y.A08 == i) {
                    this.A00 = i;
                    return;
                }
            }
            i = i2;
        }
    }

    public final void A0R(List list, Set set) {
        String str = this.A1O;
        if (str != null) {
            C229352nF r4 = this.A0X;
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            for (Object next : list) {
                if (!set.contains(next)) {
                    A1C2.add(next);
                }
            }
            r4.A08(str, A1C2, false, true);
        }
    }

    public final void Cvo(C267324bN r14, Integer num, String str) {
        long j;
        AnonymousClass5OC r0;
        Long A102;
        Integer num2 = num;
        0qQ.A0B(num, 1);
        1Xj r10 = r14.A02;
        if (r10 != null) {
            UserSession userSession = this.A0a;
            AnonymousClass3W1 r02 = C52057GDd.A01(r14, userSession, 1sd.A00(userSession), (AnonymousClass3W1) null, (C52054GDa) null).A0E;
            if (r02 != null) {
                C51979GAc gAc = this.A19;
                AnonymousClass93T r5 = this.A1D;
                String A2n = r10.A2n();
                String A0k2 = C51973G9u.A0k(r10);
                String A0x2 = DbT.A0x(r10);
                int position = r02.getPosition();
                Dba.A0j(1, gAc, userSession);
                0qQ.A0B(r5, 2);
                0Aj A0O2 = C51972G9s.A0O(gAc, userSession);
                if (A0O2.isSampled()) {
                    C51979GAc.A01(A0O2, gAc);
                    if (A2n == null || (A102 = AnonymousClass7TE.A10(A2n)) == null) {
                        j = 0;
                    } else {
                        j = A102.longValue();
                    }
                    C51974G9v.A0l(A0O2, position, j);
                    C51970G9q.A1G(A0O2, r5);
                    C51965G9l.A1H(A0O2, DbZ.A0d(A0k2));
                    A0O2.AAJ("chaining_session_id", r5.AmZ());
                    C51965G9l.A19(C52236GKd.A0Y, A0O2);
                    int intValue = num.intValue();
                    if (intValue == 4) {
                        r0 = AnonymousClass5OC.COMMENT_BUTTON;
                    } else if (intValue != 2) {
                        r0 = AnonymousClass5OC.ATTRIBUTE_PILLS;
                    } else {
                        r0 = AnonymousClass5OC.TAG_ABOVE_PROFILE;
                    }
                    C51965G9l.A1C(r0, A0O2);
                    A0O2.AAJ("chaining_session_id", r5.AmZ());
                    C51969G9p.A1D(A0O2, A0x2);
                }
                1Z0 A002 = AnonymousClass2BF.A00();
                C227232is r03 = this.A07;
                if (r03 != null) {
                    B55 b55 = r03.A0F;
                    if (b55 == null) {
                        0qQ.A0F("clipsViewerAppreciationGiftController");
                        throw AnonymousClass00P.createAndThrow();
                    } else {
                        ((LBW) A002.A00.getValue()).A00(this.A0R, b55, gAc, userSession, r10, num2, str);
                    }
                }
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
    }

    public final void D3p(C267324bN r1, Integer num, int i) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0077, code lost:
        if (r8 == null) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0079, code lost:
        r8 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007b, code lost:
        if (r7 == null) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007d, code lost:
        r7 = r7.A0C.AnZ();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0083, code lost:
        if (r7 != null) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0085, code lost:
        r0 = r6.A0I;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0087, code lost:
        if (r0 == null) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0089, code lost:
        r7 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008b, code lost:
        if (r7 == null) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008d, code lost:
        if (r1 == null) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008f, code lost:
        r0 = X.AnonymousClass7TE.A1I(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0093, code lost:
        r3.A03.add(0, new X.AnonymousClass9JD(r9, r8, r7, r0));
        r3.A00++;
        r7 = r13.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a5, code lost:
        if (r7 == null) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a7, code lost:
        r1 = r15.indexOf(r4) + 1;
        r0 = r7.A0N;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00af, code lost:
        if (r0 == null) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b1, code lost:
        r0.A0I(r1, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b4, code lost:
        r0 = r13.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b6, code lost:
        if (r0 == null) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b8, code lost:
        r0 = r0.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ba, code lost:
        if (r0 == null) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00bc, code lost:
        r0.A0A.A0b(r4, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c1, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c6, code lost:
        r0 = X.0sn.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c9, code lost:
        if (r7 != null) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00e1, code lost:
        throw X.AnonymousClass7TE.A0z("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x012e, code lost:
        r0 = "clipsViewerViewPager";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D3q(X.C276114sa r14, java.util.List r15, boolean r16, boolean r17) {
        /*
            r13 = this;
            r2 = 0
            X.0qQ.A0B(r15, r2)
            X.2is r0 = r13.A07
            r1 = 1
            if (r0 == 0) goto L_0x012a
            boolean r0 = r0.isAdded()
            if (r0 != r1) goto L_0x012a
            if (r16 != 0) goto L_0x012a
            com.instagram.clips.intf.ClipsViewerConfig r6 = r13.A0Y
            com.instagram.clips.intf.ClipsViewerSource r1 = r6.A0J
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.DIRECT
            if (r1 == r0) goto L_0x001d
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.DIRECT_AD_FEED_OF_ADS
            if (r1 != r0) goto L_0x012a
        L_0x001d:
            X.GMD r3 = r13.A0W
            com.google.common.collect.ImmutableList r0 = r3.A03()
            int r5 = r0.size()
            java.util.Iterator r12 = r15.iterator()
            r1 = 0
        L_0x002c:
            boolean r0 = r12.hasNext()
            r8 = 1
            if (r0 == 0) goto L_0x00ec
            X.4bN r4 = X.C51966G9m.A0m(r12)
            r13.A0M = r8
            java.util.List r0 = r4.A08
            if (r0 == 0) goto L_0x00cf
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00cf
            X.1Xj r7 = r4.A02
            java.util.List r0 = r4.A08
            java.lang.String r11 = "Required value was null."
            if (r0 == 0) goto L_0x00e7
            java.lang.Object r10 = r0.get(r2)
            if (r7 == 0) goto L_0x00cc
            X.1Xy r0 = r7.A0C
            java.lang.Long r0 = r0.AxD()
            if (r0 == 0) goto L_0x00e2
            long r0 = r0.longValue()
        L_0x005d:
            X.9IL r9 = new X.9IL
            r9.<init>(r0, r10, r8)
            r1 = 0
            if (r7 == 0) goto L_0x00c9
            X.1Xy r0 = r7.A0C
            X.DT4 r0 = r0.CF9()
            if (r0 == 0) goto L_0x00c9
            java.lang.String r1 = r0.getEmoji()
        L_0x0071:
            X.1Xy r0 = r7.A0C
            java.lang.String r8 = r0.Ax6()
            if (r8 != 0) goto L_0x007d
        L_0x0079:
            java.lang.String r8 = ""
            if (r7 == 0) goto L_0x0085
        L_0x007d:
            X.1Xy r0 = r7.A0C
            java.lang.String r7 = r0.AnZ()
            if (r7 != 0) goto L_0x008d
        L_0x0085:
            com.instagram.clips.intf.ClipsViewerDirectData r0 = r6.A0I
            if (r0 == 0) goto L_0x00dd
            java.lang.String r7 = r0.A00
            if (r7 == 0) goto L_0x00dd
        L_0x008d:
            if (r1 == 0) goto L_0x00c6
            java.util.List r0 = X.AnonymousClass7TE.A1I(r1)
        L_0x0093:
            X.9JD r1 = new X.9JD
            r1.<init>((X.AnonymousClass9IL) r9, (java.lang.String) r8, (java.lang.String) r7, (java.util.List) r0)
            java.util.List r0 = r3.A03
            r0.add(r2, r1)
            int r0 = r3.A00
            int r0 = r0 + 1
            r3.A00 = r0
            X.2is r7 = r13.A07
            if (r7 == 0) goto L_0x00b4
            int r0 = r15.indexOf(r4)
            int r1 = r0 + 1
            X.GBj r0 = r7.A0N
            if (r0 == 0) goto L_0x012e
            r0.A0I(r1, r2)
        L_0x00b4:
            X.2is r0 = r13.A07
            if (r0 == 0) goto L_0x00c1
            X.GD6 r0 = r0.A0C
            if (r0 == 0) goto L_0x012b
            X.GBg r0 = r0.A0A
            r0.A0b(r4, r2)
        L_0x00c1:
            r1 = 1
        L_0x00c2:
            int r5 = r5 + 1
            goto L_0x002c
        L_0x00c6:
            X.0sn r0 = X.0sn.A00
            goto L_0x0093
        L_0x00c9:
            if (r7 == 0) goto L_0x0079
            goto L_0x0071
        L_0x00cc:
            r0 = 0
            goto L_0x005d
        L_0x00cf:
            X.2is r0 = r13.A07
            if (r0 == 0) goto L_0x00c2
            X.GD6 r0 = r0.A0C
            if (r0 == 0) goto L_0x012b
            X.GBg r0 = r0.A0A
            r0.A0b(r4, r5)
            goto L_0x00c2
        L_0x00dd:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r11)
            throw r0
        L_0x00e2:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r11)
            throw r0
        L_0x00e7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r11)
            throw r0
        L_0x00ec:
            if (r1 == 0) goto L_0x0112
            boolean r0 = r13.A0O
            if (r0 != 0) goto L_0x0112
            com.instagram.common.session.UserSession r5 = r13.A0a
            X.0Tu r4 = X.DbS.A0J(r5, r2)
            r0 = 36318634297137486(0x81079b0002194e, double:3.031388800687193E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x0112
            X.2is r0 = r13.A07
            if (r0 == 0) goto L_0x0112
            int r1 = X.DbT.A02(r15, r8)
            X.GBj r0 = r0.A0N
            if (r0 == 0) goto L_0x012e
            r0.A0I(r1, r8)
        L_0x0112:
            r13.A0O = r2
            X.2is r0 = r13.A07
            if (r0 == 0) goto L_0x0128
            X.5o2 r1 = X.C295365o2.ORGANIC
            X.GD6 r0 = r0.A0C
            if (r0 == 0) goto L_0x012b
            X.GBg r0 = r0.A0A
            java.util.List r0 = r0.A0K(r1)
            if (r0 == 0) goto L_0x0128
            r3.A02 = r0
        L_0x0128:
            r13.A0M = r2
        L_0x012a:
            return
        L_0x012b:
            java.lang.String r0 = "viewerAdapter"
            goto L_0x0130
        L_0x012e:
            java.lang.String r0 = "clipsViewerViewPager"
        L_0x0130:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GBE.D3q(X.4sa, java.util.List, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (r9.BU8() != true) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D3v(X.C276114sa r9, java.util.List r10, boolean r11, boolean r12) {
        /*
            r8 = this;
            r5 = 0
            r2 = r10
            X.0qQ.A0B(r10, r5)
            X.2is r1 = r8.A07
            if (r1 == 0) goto L_0x0027
            r3 = 1
            if (r9 == 0) goto L_0x0013
            boolean r0 = r9.BU8()
            r6 = 1
            if (r0 == r3) goto L_0x0014
        L_0x0013:
            r6 = 0
        L_0x0014:
            X.GD6 r1 = r1.A0C
            if (r1 != 0) goto L_0x0022
            java.lang.String r0 = "viewerAdapter"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0022:
            r4 = r3
            r7 = r3
            r1.A0C(r2, r3, r4, r5, r6, r7)
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GBE.D3v(X.4sa, java.util.List, boolean, boolean):void");
    }

    private final String A00() {
        UserSession userSession = this.A0a;
        if (!1KU.A06(userSession) || 1KU.A02(userSession).contains(this.A0Y.A0J.name()) || !this.A0t.A00) {
            return null;
        }
        return "one_reel_chaining_cache_key";
    }

    private final void A01() {
        UserSession userSession = this.A0a;
        if (182.A06(0Tu.A05, userSession, 36326751785203666L)) {
            Context context = this.A0Q;
            AnonymousClass7TG.A1N(userSession, context);
            ((AnonymousClass408) ((C10807RyT) userSession.A01(C10807RyT.class, new TTP(19, context, userSession))).A03.getValue()).E3W((C258943zt) null, OdinContext.A05);
        }
    }

    public static final void A02(C267324bN r5, GBE gbe) {
        C62320sa r2 = gbe.A20;
        GD6.A01(r2).A0T(r5, true);
        Set singleton = Collections.singleton(r5);
        0qQ.A07(singleton);
        GD6 gd6 = (GD6) r2.invoke();
        List<C295365o2> A1P2 = 0sr.A1P(new C295365o2[]{C295365o2.ORGANIC, C295365o2.AD});
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        for (C295365o2 A0K2 : A1P2) {
            018.A16(gd6.A0A.A0K(A0K2), A1C2);
        }
        gbe.A0R(A1C2, singleton);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        if (X.AnonymousClass7TF.A1Z(r6.A1u) != false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
        if (r8 <= 0) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r8 <= 0) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.GMC r5, X.GBE r6, X.GME r7, int r8, boolean r9) {
        /*
            com.instagram.common.session.UserSession r0 = r6.A0a
            X.GMD r0 = X.GNS.A00(r0)
            X.0qQ.A07(r0)
            X.9JD r1 = r0.A01(r8)
            X.0eM r0 = r6.A1p
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            r2 = 1
            if (r0 == 0) goto L_0x0019
            r4 = 1
            if (r8 > 0) goto L_0x001a
        L_0x0019:
            r4 = 0
        L_0x001a:
            if (r1 != 0) goto L_0x0035
            X.0eM r0 = r6.A1m
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 == 0) goto L_0x0035
            X.0eM r0 = r6.A1t
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 == 0) goto L_0x0035
            X.0eM r0 = r6.A1u
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            r3 = 1
            if (r0 == 0) goto L_0x0036
        L_0x0035:
            r3 = 0
        L_0x0036:
            X.0eM r0 = r6.A1m
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 == 0) goto L_0x0046
            X.0eM r0 = r6.A1u
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 != 0) goto L_0x0051
        L_0x0046:
            X.0eM r0 = r6.A1r
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 == 0) goto L_0x0051
            r1 = 1
            if (r8 > 0) goto L_0x0052
        L_0x0051:
            r1 = 0
        L_0x0052:
            if (r9 != 0) goto L_0x005e
            com.instagram.clips.intf.ClipsViewerConfig r0 = r6.A0Y
            com.instagram.clips.intf.ClipsViewerDirectData r0 = r0.A0I
            if (r0 == 0) goto L_0x007c
            boolean r0 = r0.A03
            if (r0 != r2) goto L_0x007c
        L_0x005e:
            r0 = 0
        L_0x005f:
            if (r5 == 0) goto L_0x007b
            if (r0 == 0) goto L_0x0077
            if (r3 != 0) goto L_0x0069
            if (r4 != 0) goto L_0x0069
            if (r1 == 0) goto L_0x0077
        L_0x0069:
            if (r7 == 0) goto L_0x0078
            boolean r0 = r7.A0K()
            if (r0 == r2) goto L_0x0077
            boolean r0 = r7.A0J()
            if (r0 != r2) goto L_0x0078
        L_0x0077:
            r2 = 0
        L_0x0078:
            r5.A03(r2)
        L_0x007b:
            return
        L_0x007c:
            r0 = 1
            goto L_0x005f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GBE.A03(X.GMC, X.GBE, X.GME, int, boolean):void");
    }

    public static final void A04(GBE gbe) {
        if (gbe.A22) {
            GLR glr = gbe.A16;
            if (glr != null) {
                glr.A0B(C57629Idu.A00);
                return;
            }
            return;
        }
        C320416sL.A00(gbe.A1A, (Long) null, (String) null, 0sn.A00, false, false, false, false);
    }

    public static final void A05(GBE gbe, List list, boolean z, boolean z2) {
        GLR glr;
        C46224DRf gLb;
        List list2 = list;
        if (gbe.A22) {
            if (z) {
                glr = gbe.A16;
                if (glr != null) {
                    gLb = C57628Idt.A00;
                } else {
                    return;
                }
            } else {
                gbe.A01();
                glr = gbe.A16;
                if (glr != null) {
                    ClipsViewerSource clipsViewerSource = gbe.A0Y.A0J;
                    if (clipsViewerSource == ClipsViewerSource.MID_CARD_INJECT_TOOL) {
                        gLb = C57627Ids.A00;
                    } else {
                        boolean A062 = gbe.A06(z2);
                        String A002 = gbe.A00();
                        long millis = TimeUnit.MINUTES.toMillis(1KU.A01(gbe.A0a));
                        boolean A1W2 = AnonymousClass7TF.A1W(clipsViewerSource, ClipsViewerSource.CLIPS_MEDIA_NOTES_NOTIF_CHAIN);
                        gLb = new C52260GLb(Boolean.valueOf(A1W2), Long.valueOf(millis), A002, list2, A062);
                    }
                } else {
                    return;
                }
            }
            glr.A0B(gLb);
        } else if (z) {
            C320416sL.A00(gbe.A1A, (Long) null, (String) null, 0sn.A00, false, true, true, false);
        } else {
            gbe.A01();
            GCH gch = gbe.A1A;
            boolean A063 = gbe.A06(z2);
            gch.A04(Long.valueOf(TimeUnit.MINUTES.toMillis(1KU.A01(gbe.A0a))), gbe.A00(), list, A063);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        if (r0.A05 == true) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0077, code lost:
        if (r1.A03 == X.AnonymousClass05K.A0C) goto L_0x0079;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A0C() {
        /*
            r6 = this;
            X.GCH r0 = r6.A1A
            X.6z9 r0 = r0.A04
            X.6zA r1 = r0.A03
            java.lang.Integer r0 = r1.A02
            if (r0 == 0) goto L_0x0011
            int r2 = r0.intValue()
            if (r2 <= 0) goto L_0x0011
            return r2
        L_0x0011:
            X.Hlf r5 = r6.A24
            X.GLR r0 = r6.A16
            if (r0 == 0) goto L_0x006e
            X.GLa r0 = X.GLR.A01(r0)
            r4 = 1
            if (r0 == 0) goto L_0x0079
            boolean r0 = r0.A05
            if (r0 != r4) goto L_0x0079
        L_0x0022:
            boolean r0 = r5.A01
            if (r0 != 0) goto L_0x0040
            com.instagram.common.session.UserSession r3 = r5.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316697267475043(0x8105d8000b1263, double:3.030163815328872E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0040
            r0 = 36598172244446338(0x8205d8000f0c82, double:3.208169724174277E-306)
        L_0x003a:
            long r0 = X.182.A01(r2, r3, r0)
            int r2 = (int) r0
            return r2
        L_0x0040:
            com.instagram.common.session.UserSession r3 = r5.A00
            X.0Tu r2 = X.0Tu.A05
            if (r4 == 0) goto L_0x0057
            r0 = 36316697267147361(0x8105d800061261, double:3.030163815121644E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0068
            r0 = 36598172244053119(0x8205d800090c7f, double:3.208169723925604E-306)
            goto L_0x003a
        L_0x0057:
            r0 = 36316697267278434(0x8105d800081262, double:3.0301638152045354E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0068
            r0 = 36598172243922046(0x8205d800070c7e, double:3.2081697238427126E-306)
            goto L_0x003a
        L_0x0068:
            r0 = 36598172243725437(0x8205d800040c7d, double:3.208169723718376E-306)
            goto L_0x003a
        L_0x006e:
            java.lang.String r0 = r1.A07
            if (r0 != 0) goto L_0x0079
            java.lang.Integer r1 = r1.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r4 = 1
            if (r1 != r0) goto L_0x0022
        L_0x0079:
            r4 = 0
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GBE.A0C():int");
    }

    public final GNH A0D() {
        ClipsViewerConfig clipsViewerConfig = this.A0Y;
        String str = clipsViewerConfig.A1F;
        Boolean bool = clipsViewerConfig.A0V;
        28D r12 = clipsViewerConfig.A0A;
        SearchContext searchContext = clipsViewerConfig.A0S;
        C51979GAc gAc = this.A19;
        UserSession userSession = this.A0a;
        AnonymousClass93T r7 = this.A1D;
        C55684Hlh hlh = this.A1E;
        String str2 = this.A1M;
        String str3 = this.A1N;
        ClipsViewerSource clipsViewerSource = clipsViewerConfig.A0J;
        FragmentActivity fragmentActivity = this.A0R;
        boolean z = this.A0P;
        String str4 = str2;
        String str5 = str3;
        Integer num = clipsViewerConfig.A0X;
        String str6 = str;
        C55684Hlh hlh2 = hlh;
        Boolean bool2 = bool;
        AnonymousClass93T r22 = r7;
        GD6 gd6 = (GD6) this.A20.invoke();
        UserSession userSession2 = userSession;
        SearchContext searchContext2 = searchContext;
        ClipsViewerSource clipsViewerSource2 = clipsViewerSource;
        C51979GAc gAc2 = gAc;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        28D r17 = r12;
        GNH gnh = new GNH(fragmentActivity2, r17, clipsViewerSource2, gAc2, userSession2, searchContext2, r22, gd6, hlh2, bool2, num, str6, str4, str5, z, AnonymousClass7TF.A1Z(this.A1q));
        this.A0z.A00(gnh);
        this.A0B = gnh;
        return gnh;
    }

    public final void A0E() {
        GLR glr;
        C46224DRf dRf;
        C52231GJw gJw = this.A0p;
        gJw.A03.A02();
        ClipsViewerConfig clipsViewerConfig = gJw.A01;
        if (clipsViewerConfig.A1p && !clipsViewerConfig.A1q) {
            ClipsViewerSource clipsViewerSource = clipsViewerConfig.A0J;
            if (clipsViewerSource == ClipsViewerSource.DIRECT || clipsViewerSource == ClipsViewerSource.DIRECT_AD_FEED_OF_ADS) {
                if (182.A06(0Tu.A05, gJw.A02, 36318634297137486L)) {
                    if (gJw.A06) {
                        glr = gJw.A04;
                        if (glr != null) {
                            dRf = C57629Idu.A00;
                            glr.A0B(dRf);
                            return;
                        }
                        return;
                    }
                    C320416sL.A00(gJw.A05, (Long) null, (String) null, 0sn.A00, false, false, false, false);
                    return;
                }
            }
            if (gJw.A06) {
                glr = gJw.A04;
                if (glr != null) {
                    dRf = C57630Idv.A00;
                    glr.A0B(dRf);
                    return;
                }
                return;
            }
            gJw.A05.A01();
        }
    }

    public final void A0F() {
        ClipsReplyBarData clipsReplyBarData = this.A0Y.A0L;
        UserSession userSession = this.A0a;
        C66907Meq meq = new C66907Meq(this.A0R, clipsReplyBarData, this.A19, userSession);
        this.A0z.A00(meq);
        this.A0D = meq;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0G() {
        /*
            r6 = this;
            X.2is r3 = r6.A07
            if (r3 == 0) goto L_0x004e
            X.GD6 r1 = r3.A0C
            java.lang.String r5 = "viewerAdapter"
            r0 = 0
            if (r1 == 0) goto L_0x0063
            r1.A09(r0)
            X.GD9 r0 = r3.A0O()
            X.0sa r0 = r0.A00
            int r4 = X.C52012GBj.A01(r0)
            com.instagram.clips.intf.ClipsViewerConfig r0 = X.C227232is.A00(r3)
            com.instagram.clips.intf.ClipsViewerSource r1 = r0.A0J
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.MID_CARD_OPEN_REELS_CHAIN
            java.lang.String r2 = "clipsViewerViewPager"
            if (r1 == r0) goto L_0x002e
            com.instagram.clips.intf.ClipsViewerConfig r0 = X.C227232is.A00(r3)
            com.instagram.clips.intf.ClipsViewerSource r1 = r0.A0J
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.MID_CARD_CONTEXTUAL_CHAIN_WITH_RECIPE_SHEET_TRENDING_TRACK_WITH_SIMILAR_ACCOUNTS
            if (r1 != r0) goto L_0x004f
        L_0x002e:
            X.GD6 r0 = r3.A0C
            if (r0 == 0) goto L_0x0063
            int r0 = X.GD6.A00(r0)
            if (r0 <= 0) goto L_0x004f
            X.GD6 r1 = r3.A0C
            if (r1 == 0) goto L_0x0063
            int r0 = X.GD6.A00(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0A(r0)
        L_0x0047:
            X.GBj r0 = r3.A0N
            if (r0 == 0) goto L_0x0067
            r0.A0E()
        L_0x004e:
            return
        L_0x004f:
            X.GD6 r1 = r3.A0C
            if (r1 == 0) goto L_0x0063
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r1.A0A(r0)
            X.GBj r1 = r3.A0N
            if (r1 == 0) goto L_0x0067
            r0 = 1
            r1.A0I(r4, r0)
            goto L_0x0047
        L_0x0063:
            X.0qQ.A0F(r5)
            goto L_0x006a
        L_0x0067:
            X.0qQ.A0F(r2)
        L_0x006a:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GBE.A0G():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
        r1 = r4.A1L;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0H() {
        /*
            r4 = this;
            com.instagram.common.session.UserSession r3 = r4.A0a
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316937785119442(0x810610000312d2, double:3.0303159196556765E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r2 = 1
            if (r0 == 0) goto L_0x0037
            X.GD9 r1 = r4.A1L
            X.4bN r0 = r1.A02()
            if (r0 == 0) goto L_0x0037
            boolean r0 = r0.CcK()
            if (r0 != r2) goto L_0x0037
            X.4bN r0 = r1.A02()
            if (r0 == 0) goto L_0x0037
            X.3OA r0 = r0.A06()
            boolean r0 = r0.A06()
            if (r0 != r2) goto L_0x0037
            X.IgC r0 = new X.IgC
            r0.<init>(r4)
            X.11Z.A03(r0)
            return
        L_0x0037:
            X.GBn r0 = r4.A1K
            r0.A0D()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GBE.A0H():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d2, code lost:
        if (r11.isEmpty() != false) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0135, code lost:
        if (X.182.A06(X.0Tu.A05, r3.A0a, 36323972941622925L) != false) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0180, code lost:
        if (r10 == null) goto L_0x0182;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0J(X.C267324bN r24) {
        /*
            r23 = this;
            r3 = r23
            com.instagram.clips.intf.ClipsViewerConfig r2 = r3.A0Y
            java.lang.String r6 = r2.A1H
            boolean r4 = r2.A1t
            r10 = 1
            r7 = r4 ^ 1
            com.instagram.clips.intf.ClipsViewerDirectData r11 = r2.A0I
            r5 = 0
            if (r11 == 0) goto L_0x007c
            boolean r9 = r11.A0B
            boolean r1 = r11.A09
        L_0x0014:
            X.0eM r8 = r3.A1m
            boolean r0 = X.AnonymousClass7TF.A1Z(r8)
            if (r0 == 0) goto L_0x009b
            if (r1 == 0) goto L_0x009b
            if (r11 == 0) goto L_0x029a
            java.lang.String r1 = r11.A02
            if (r1 == 0) goto L_0x029a
            X.0eM r2 = r3.A1i
            java.lang.Object r0 = r2.getValue()
            X.2Dm r0 = (X.2Dm) r0
            X.3U9 r0 = r0.C60(r1)
            if (r0 == 0) goto L_0x029a
            com.instagram.model.direct.DirectThreadKey r1 = r0.BJz()
            java.lang.Object r0 = r2.getValue()
            X.2Dm r0 = (X.2Dm) r0
            X.2Dr r0 = (X.2Dr) r0
            org.json.JSONArray r4 = new org.json.JSONArray
            r4.<init>()
            java.util.ArrayList r0 = r0.CBx(r1)
            java.util.Iterator r2 = r0.iterator()
        L_0x004b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x007f
            java.lang.Object r0 = r2.next()
            X.3su r0 = (X.C254703su) r0
            com.google.common.collect.ImmutableList r0 = r0.A0H()
            if (r0 == 0) goto L_0x004b
            java.lang.Object r0 = X.00k.A0J(r0)
            X.3tC r0 = (X.C254873tC) r0
            if (r0 == 0) goto L_0x004b
            java.lang.String r0 = r0.A0u
            if (r0 == 0) goto L_0x004b
            android.net.Uri r1 = X.0cp.A03(r0)
            X.0qQ.A07(r1)
            java.lang.String r0 = "id"
            java.lang.String r0 = r1.getQueryParameter(r0)
            if (r0 == 0) goto L_0x004b
            r4.put(r0)
            goto L_0x004b
        L_0x007c:
            r9 = 0
            r1 = 0
            goto L_0x0014
        L_0x007f:
            X.1O9 r2 = new X.1O9
            r2.<init>()
            com.instagram.common.session.UserSession r1 = r3.A0a
            java.lang.String r0 = r4.toString()
            X.1OC r2 = X.AnonymousClass93V.A03(r2, r1, r0)
            r0 = 21
            X.H50.A00(r2, r3, r0)
            r1 = 1368380687(0x518fd50f, float:7.7219357E10)
            r0 = 2
            X.1ES.A05(r2, r1, r0, r10, r5)
            return
        L_0x009b:
            boolean r0 = X.AnonymousClass7TF.A1Z(r8)
            r14 = r24
            if (r0 == 0) goto L_0x00d4
            if (r9 != 0) goto L_0x00d4
            java.lang.String r0 = r2.A0w
            if (r0 == 0) goto L_0x016c
            boolean r0 = r2.A1i
            if (r0 == 0) goto L_0x016c
            X.0sn r11 = X.0sn.A00
        L_0x00af:
            boolean r0 = X.AnonymousClass7TE.A1b(r11)
            if (r0 == 0) goto L_0x00ce
            int r12 = r2.A08
            if (r12 < 0) goto L_0x00ce
            X.0eM r0 = r3.A1s
            boolean r0 = X.G9t.A1b(r0)
            if (r0 == 0) goto L_0x00ce
            int r1 = X.DbT.A02(r11, r10)
            X.2HY r0 = new X.2HY
            r0.<init>(r12, r1)
            java.util.List r11 = X.00k.A0i(r11, r0)
        L_0x00ce:
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L_0x00dd
        L_0x00d4:
            if (r24 != 0) goto L_0x011d
            com.google.common.collect.ImmutableList r11 = com.google.common.collect.ImmutableList.of()
        L_0x00da:
            X.0qQ.A07(r11)
        L_0x00dd:
            if (r24 == 0) goto L_0x01c7
            boolean r0 = r14.CcK()
            if (r0 == 0) goto L_0x00f1
            X.HJk r1 = r3.A0q
            r1.A0f(r14, r10)
            boolean r0 = r2.A1k
            if (r0 == 0) goto L_0x00f1
            r1.A0g(r14, r10)
        L_0x00f1:
            X.2is r0 = r3.A07
            if (r0 == 0) goto L_0x00f8
            r0.A0Q(r11, r7)
        L_0x00f8:
            X.GE0 r6 = r3.A1B
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            r0 = 20
            X.C58711IwK.A01(r6, r1, r0)
            boolean r0 = X.AnonymousClass7TF.A1Z(r8)
            if (r0 == 0) goto L_0x0203
            if (r9 != 0) goto L_0x0203
            X.2is r0 = r3.A07
            if (r0 == 0) goto L_0x0182
            X.5o2 r1 = X.C295365o2.ORGANIC
            X.GD6 r0 = r0.A0C
            if (r0 != 0) goto L_0x017a
            java.lang.String r0 = "viewerAdapter"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x011d:
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()
            com.instagram.clips.intf.ClipsViewerSource r1 = r2.A0J
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.CREATOR_INSPIRATION_HUB
            if (r1 != r0) goto L_0x0137
            com.instagram.common.session.UserSession r13 = r3.A0a
            X.0Tu r12 = X.0Tu.A05
            r0 = 36323972941622925(0x810c7600042e8d, double:3.0347649809567806E-306)
            boolean r0 = X.182.A06(r12, r13, r0)
            r13 = 1
            if (r0 == 0) goto L_0x013b
        L_0x0137:
            r13 = 0
            r11.add(r14)
        L_0x013b:
            com.google.common.collect.ImmutableList r1 = r2.A0E
            if (r1 == 0) goto L_0x0166
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0166
            java.util.Iterator r12 = r1.iterator()
        L_0x0149:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0161
            java.lang.Object r1 = r12.next()
            java.lang.String r1 = (java.lang.String) r1
            com.instagram.common.session.UserSession r0 = r3.A0a
            X.4bN r0 = X.GDY.A00(r2, r0, r1)
            if (r0 == 0) goto L_0x0149
            r11.add(r0)
            goto L_0x0149
        L_0x0161:
            if (r13 == 0) goto L_0x0166
            r3.A0Q(r11)
        L_0x0166:
            com.google.common.collect.ImmutableList r11 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r11)
            goto L_0x00da
        L_0x016c:
            X.0eM r0 = r3.A1h
            java.lang.Object r0 = r0.getValue()
            X.7YU r0 = (X.AnonymousClass7YU) r0
            com.google.common.collect.ImmutableList r11 = r0.A04()
            goto L_0x00af
        L_0x017a:
            X.GBg r0 = r0.A0A
            java.util.List r10 = r0.A0K(r1)
            if (r10 != 0) goto L_0x0184
        L_0x0182:
            X.0sn r10 = X.0sn.A00
        L_0x0184:
            com.instagram.common.session.UserSession r0 = r3.A0a
            X.GMD r9 = X.GNS.A00(r0)
            X.0qQ.A07(r9)
            X.0eM r0 = r3.A1s
            boolean r0 = X.G9t.A1b(r0)
            r9.A02 = r10
            if (r0 == 0) goto L_0x01c1
            java.util.List r0 = r9.A01
            if (r0 == 0) goto L_0x01c1
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x01c1
            int r8 = r9.A00
            if (r8 >= 0) goto L_0x01a8
            r9.A00 = r5
            r8 = 0
        L_0x01a8:
            java.util.List r6 = r9.A01
            if (r6 == 0) goto L_0x01c5
            int r1 = r0 + -1
            X.2HY r0 = new X.2HY
            r0.<init>(r8, r1)
            java.util.List r0 = X.00k.A0i(r6, r0)
            if (r0 == 0) goto L_0x01c5
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1D(r0)
        L_0x01bd:
            r9.A01 = r0
            r9.A00 = r5
        L_0x01c1:
            r3.A0P(r10)
            goto L_0x0203
        L_0x01c5:
            r0 = 0
            goto L_0x01bd
        L_0x01c7:
            if (r6 == 0) goto L_0x0203
            com.instagram.common.session.UserSession r9 = r3.A0a
            com.instagram.clips.intf.ClipsViewerSource r15 = r2.A0J
            java.lang.String r8 = r2.A00
            boolean r1 = r2.A1f
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r5)
            java.lang.String r0 = r2.A1L
            r20 = 0
            r18 = r8
            r19 = r0
            r21 = r1
            r16 = r9
            boolean r0 = X.C52047GCt.A00(r15, r16, r17, r18, r19, r20, r21)
            if (r0 != 0) goto L_0x0203
            X.0wj r9 = X.0wj.A01
            r8 = 817902720(0x30c03480, float:1.398476E-9)
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "ClipsMediaCacheMiss.ClipsViewerFragmentViewModel."
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r15, r0, r1)
            X.0f9 r1 = r9.AEf(r0, r8)
            java.lang.String r0 = "MediaCache does not include the media for media id = "
            java.lang.String r0 = X.002.A0R(r0, r6)
            X.C51969G9p.A1K(r1, r0)
        L_0x0203:
            if (r4 == 0) goto L_0x0217
            X.GCH r4 = r3.A1A
            X.5u8 r0 = X.C276114sa.A00
            X.5u9 r1 = r0.A00(r5)
            r0 = 0
            r1.A00 = r0
            X.4sZ r0 = r1.A00()
            r4.A02(r0)
        L_0x0217:
            com.instagram.common.session.UserSession r6 = r3.A0a
            X.0Tu r4 = X.0Tu.A05
            r0 = 36322770350516635(0x810b5e0000299b, double:3.034004457498717E-306)
            boolean r0 = X.182.A06(r4, r6, r0)
            if (r0 == 0) goto L_0x0266
            java.lang.String r1 = r2.A1L
            if (r1 == 0) goto L_0x0266
            com.instagram.clips.intf.ClipsViewerSource r9 = r2.A0J
            java.lang.String r8 = r2.A00
            boolean r0 = r2.A1f
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r5)
            r15 = 0
            r17 = r6
            r19 = r8
            r20 = r1
            r21 = r15
            r22 = r0
            r16 = r9
            boolean r0 = X.C52047GCt.A00(r16, r17, r18, r19, r20, r21, r22)
            if (r0 != 0) goto L_0x0266
            if (r24 == 0) goto L_0x0266
            X.0eM r0 = r3.A1f
            java.lang.Object r11 = r0.getValue()
            X.GCT r11 = (X.GCT) r11
            androidx.fragment.app.FragmentActivity r12 = r3.A0R
            java.lang.Integer r17 = java.lang.Integer.valueOf(r5)
            X.5OB r13 = r2.A0C
            r16 = r15
            r18 = r1
            r19 = r5
            r20 = r5
            r21 = r5
            r11.A00(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
        L_0x0266:
            X.GIb r1 = r3.A0t
            int r0 = r3.A00
            r1.A0C(r0)
            java.lang.String r0 = r2.A0w
            if (r0 == 0) goto L_0x028b
            com.instagram.clips.intf.ClipsViewerSource r1 = r2.A0J
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.MID_CARD_CONTEXTUAL_CHAIN_WITH_RECIPE_SHEET_TRENDING_TRACK_WITH_SIMILAR_ACCOUNTS
            if (r1 == r0) goto L_0x029a
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.MID_CARD_OPEN_REELS_CHAIN
            if (r1 != r0) goto L_0x0287
            r0 = 36330295133225523(0x81123600004233, double:3.038763160383686E-306)
            boolean r0 = X.182.A06(r4, r6, r0)
            if (r0 == 0) goto L_0x0287
            return
        L_0x0287:
            boolean r0 = r2.A1i
            if (r0 != 0) goto L_0x029a
        L_0x028b:
            boolean r0 = r2.A1Y
            if (r0 == 0) goto L_0x0293
            A04(r3)
            return
        L_0x0293:
            boolean r0 = r2.A1Z
            if (r0 != 0) goto L_0x029a
            r3.A0T(r7)
        L_0x029a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GBE.A0J(X.4bN):void");
    }

    public final void A0M(C267324bN r20, Integer num, String str, String str2, String str3) {
        C267324bN r2 = r20;
        1Xj r8 = r2.A02;
        if (r8 != null) {
            ConfirmationStyle confirmationStyle = null;
            if (num == AnonymousClass05K.A0j) {
                this.A10.A0C(r2, (JOG) null, this, (GD6) this.A20.invoke());
            } else {
                if (r2.CcK()) {
                    if (182.A06(0Tu.A05, this.A0a, 36319390212234446L)) {
                        return;
                    }
                }
                AnonymousClass1eD Anw = r8.A0C.Anw();
                if (Anw != null) {
                    confirmationStyle = Anw.Apx();
                }
                if (confirmationStyle != ConfirmationStyle.BOTTOMSHEET) {
                    GD0 gd0 = this.A0v;
                    gd0.A02.postDelayed(gd0.A06, 3000);
                }
            }
            long A092 = (long) GD6.A01(this.A20).BzC(r2).A09();
            if (num != null) {
                UserSession userSession = this.A0a;
                if (182.A06(0Tu.A05, userSession, 36312183257236419L)) {
                    I7O.A07(this.A19, userSession, r8, "sfplt_in_menu", r8.A0C.B2y(), this.A1D.A00, str, str2, str3, A092, true, false);
                }
            }
            this.A0q.Ek5(r2, HLU.COMPLETE);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:156:0x02a3, code lost:
        if (r0 == null) goto L_0x02a5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0O(java.util.List r15) {
        /*
            r14 = this;
            X.2is r2 = r14.A07
            if (r2 == 0) goto L_0x02b8
            boolean r0 = r2.isAdded()
            if (r0 == 0) goto L_0x02b8
            com.instagram.clips.intf.ClipsViewerConfig r0 = X.C227232is.A00(r2)
            int r0 = r0.A09
            r5 = 0
            if (r0 <= 0) goto L_0x007a
            com.instagram.common.session.UserSession r4 = X.C227232is.A01(r2)
            X.0Tu r3 = X.AnonymousClass7TF.A0H(r4)
            r0 = 36330346672833098(0x8112420000424a, double:3.0387957542390495E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 == 0) goto L_0x007a
            if (r15 == 0) goto L_0x007a
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r7 = r15.iterator()
        L_0x0030:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0061
            java.lang.Object r4 = r7.next()
            r3 = r4
            X.4bN r3 = (X.C267324bN) r3
            java.util.concurrent.atomic.AtomicBoolean r0 = X.1Xj.A0i
            com.instagram.clips.intf.ClipsViewerConfig r0 = X.C227232is.A00(r2)
            java.lang.String r0 = r0.A1H
            java.lang.String r1 = X.1Xv.A05(r0)
            X.1Xj r0 = r3.A02
            if (r0 == 0) goto L_0x005f
            java.lang.String r0 = r0.getId()
        L_0x0051:
            java.lang.String r0 = X.1Xv.A05(r0)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0030
            r6.add(r4)
            goto L_0x0030
        L_0x005f:
            r0 = r5
            goto L_0x0051
        L_0x0061:
            java.util.Iterator r3 = r6.iterator()
        L_0x0065:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x007a
            java.lang.Object r1 = r3.next()
            X.4bN r1 = (X.C267324bN) r1
            com.instagram.clips.intf.ClipsViewerConfig r0 = X.C227232is.A00(r2)
            int r0 = r0.A09
            r1.A00 = r0
            goto L_0x0065
        L_0x007a:
            X.GD9 r0 = r2.A0O()
            X.0sa r0 = r0.A00
            int r4 = X.C52012GBj.A01(r0)
            com.instagram.clips.intf.ClipsViewerConfig r0 = X.C227232is.A00(r2)
            com.instagram.clips.intf.ClipsViewerSource r1 = r0.A0J
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.MID_CARD_OPEN_REELS_CHAIN
            java.lang.String r13 = "clipsViewerFragmentViewModel"
            java.lang.String r12 = "clipsViewerViewPager"
            r3 = 0
            r8 = 1
            java.lang.String r11 = "viewerAdapter"
            if (r1 == r0) goto L_0x00a0
            com.instagram.clips.intf.ClipsViewerConfig r0 = X.C227232is.A00(r2)
            com.instagram.clips.intf.ClipsViewerSource r1 = r0.A0J
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.MID_CARD_CONTEXTUAL_CHAIN_WITH_RECIPE_SHEET_TRENDING_TRACK_WITH_SIMILAR_ACCOUNTS
            if (r1 != r0) goto L_0x00e7
        L_0x00a0:
            X.GD6 r0 = r2.A0C
            if (r0 == 0) goto L_0x02ac
            int r0 = X.GD6.A00(r0)
            if (r0 <= 0) goto L_0x00e7
            if (r15 == 0) goto L_0x00e7
            boolean r0 = r15.isEmpty()
            if (r0 != 0) goto L_0x00e7
            X.GD6 r0 = r2.A0C
            if (r0 == 0) goto L_0x02ac
            int r7 = X.GD6.A00(r0)
            int r7 = r7 - r8
            X.GD6 r0 = r2.A0C
            if (r0 == 0) goto L_0x02ac
            r0.A09(r5)
            java.util.Iterator r6 = r15.iterator()
        L_0x00c6:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0277
            java.lang.Object r5 = r6.next()
            X.4bN r5 = (X.C267324bN) r5
            X.GD6 r4 = r2.A0C
            if (r4 == 0) goto L_0x02ac
            int r1 = r7 + r3
            r0 = 0
            X.0qQ.A0B(r5, r0)
            X.GBg r0 = r4.A0A
            boolean r0 = r0.A0b(r5, r1)
            if (r0 == 0) goto L_0x00c6
            int r3 = r3 + 1
            goto L_0x00c6
        L_0x00e7:
            X.GD6 r1 = r2.A0C
            if (r1 == 0) goto L_0x02ac
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r1.A09(r0)
            if (r15 == 0) goto L_0x01d3
            boolean r0 = r15.isEmpty()
            if (r0 != 0) goto L_0x01d3
            java.lang.Object r7 = r15.get(r3)
            X.4bN r7 = (X.C267324bN) r7
            X.GD6 r0 = r2.A0C
            if (r0 == 0) goto L_0x02ac
            X.0qQ.A0B(r7, r3)
            X.GBg r0 = r0.A0A
            int r9 = r0.A0B(r7)
            if (r9 < 0) goto L_0x016f
            X.GD6 r0 = r2.A0C
            if (r0 == 0) goto L_0x02ac
            int r1 = X.GD6.A00(r0)
            int r0 = r15.size()
            if (r1 < r0) goto L_0x016f
            com.instagram.clips.intf.ClipsViewerConfig r0 = X.C227232is.A00(r2)
            boolean r0 = r0.A1i
            if (r0 == 0) goto L_0x0149
            int r10 = r15.size()
            r6 = 0
        L_0x012a:
            if (r3 >= r10) goto L_0x0149
            X.GD6 r5 = r2.A0C
            if (r5 == 0) goto L_0x02ac
            java.lang.Object r4 = r15.get(r3)
            X.4bN r4 = (X.C267324bN) r4
            int r1 = r3 - r6
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.GBg r0 = r5.A0A
            boolean r0 = r0.A0b(r4, r1)
            if (r0 != 0) goto L_0x0146
            int r6 = r6 + 1
        L_0x0146:
            int r3 = r3 + 1
            goto L_0x012a
        L_0x0149:
            X.GBj r0 = r2.A0N
            if (r0 == 0) goto L_0x02a5
            r0.A0I(r9, r8)
            com.instagram.clips.intf.ClipsViewerConfig r0 = X.C227232is.A00(r2)
            boolean r0 = r0.A1i
            if (r0 != 0) goto L_0x015f
            X.GBj r0 = r2.A0N
            if (r0 == 0) goto L_0x02a5
            r0.A0F()
        L_0x015f:
            X.C227232is.A0D(r7, r2)
            X.C227232is.A0A(r7, r2)
            X.C227232is.A0C(r7, r2)
            X.C227232is.A0E(r7, r2)
            X.C227232is.A0B(r7, r2)
            return
        L_0x016f:
            java.lang.String r6 = "ClipsViewerFragment"
            if (r9 < 0) goto L_0x0178
            java.lang.String r0 = "Should scroll to the item since it is present, modified in D46540694"
            X.0kD.A07(r6, r0, r5)
        L_0x0178:
            if (r4 == 0) goto L_0x0192
            X.GBj r0 = r2.A0N
            if (r0 == 0) goto L_0x02a5
            X.GD6 r0 = r0.A09
            int r0 = X.GD6.A00(r0)
            if (r0 < r8) goto L_0x0192
            X.GD6 r0 = r2.A0C
            if (r0 == 0) goto L_0x02ac
            int r0 = X.GD6.A00(r0)
            if (r4 >= r0) goto L_0x0192
            int r4 = r4 + 1
        L_0x0192:
            X.GD6 r0 = r2.A0C
            if (r0 == 0) goto L_0x02ac
            int r1 = X.GD6.A00(r0)
            int r0 = r15.size()
            int r0 = r0 + r4
            if (r1 >= r0) goto L_0x01a6
            java.lang.String r0 = "Loaded Items being inserted is larger size than viewerAdapter; index out of bounds exception (T169019251)"
            X.0kD.A07(r6, r0, r5)
        L_0x01a6:
            com.instagram.clips.intf.ClipsViewerConfig r0 = X.C227232is.A00(r2)
            boolean r0 = r0.A1i
            if (r0 == 0) goto L_0x01e9
            int r10 = r15.size()
            r9 = 0
            r6 = 0
        L_0x01b4:
            if (r9 >= r10) goto L_0x01f3
            X.GD6 r0 = r2.A0C
            if (r0 == 0) goto L_0x02ac
            java.lang.Object r5 = r15.get(r9)
            X.4bN r5 = (X.C267324bN) r5
            int r1 = r9 + r4
            int r1 = r1 - r6
            X.0qQ.A0B(r5, r3)
            X.GBg r0 = r0.A0A
            boolean r0 = r0.A0b(r5, r1)
            if (r0 != 0) goto L_0x01d0
            int r6 = r6 + 1
        L_0x01d0:
            int r9 = r9 + 1
            goto L_0x01b4
        L_0x01d3:
            X.GD6 r6 = r2.A0C
            if (r6 == 0) goto L_0x02ac
            X.5o2 r1 = X.C295365o2.UNAVAILABLE
            X.GEC r0 = new X.GEC
            r0.<init>(r1, r5)
            X.4bN r1 = new X.4bN
            r1.<init>((X.GEC) r0)
            X.GBg r0 = r6.A0A
            r0.A0b(r1, r4)
            goto L_0x0261
        L_0x01e9:
            X.GD6 r0 = r2.A0C
            if (r0 == 0) goto L_0x02ac
            X.GBg r0 = r0.A0A
            r0.A0O(r4, r15)
            r6 = 0
        L_0x01f3:
            X.GBE r0 = r2.A09
            if (r0 == 0) goto L_0x02b0
            X.GE0 r5 = r0.A1B
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            r0 = 18
            X.C58711IwK.A01(r5, r1, r0)
            X.GD6 r0 = r2.A0C
            if (r0 == 0) goto L_0x02ac
            int r1 = X.GD6.A00(r0)
            int r0 = r15.size()
            if (r1 != r0) goto L_0x02a9
            com.instagram.clips.intf.ClipsViewerConfig r0 = X.C227232is.A00(r2)
            boolean r0 = r0.A1t
            if (r0 != 0) goto L_0x02a9
            X.GD6 r1 = r2.A0C
            if (r1 == 0) goto L_0x02ac
            int r0 = r15.size()
            int r0 = r0 + r4
            int r0 = r0 - r6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0A(r0)
        L_0x0227:
            if (r4 != 0) goto L_0x0252
            X.GIi r9 = X.C52191GIi.A00
            com.instagram.clips.intf.ClipsViewerConfig r0 = X.C227232is.A00(r2)
            java.lang.String r6 = r0.A1H
            com.instagram.common.session.UserSession r5 = X.C227232is.A01(r2)
            com.instagram.clips.intf.ClipsViewerConfig r0 = X.C227232is.A00(r2)
            com.instagram.clips.intf.ClipsViewerSource r1 = r0.A0J
            X.GBE r0 = r2.A09
            if (r0 == 0) goto L_0x02b0
            X.GIb r0 = r0.A0t
            boolean r0 = r0.A0D()
            boolean r0 = r9.A00(r1, r5, r6, r0)
            if (r0 == 0) goto L_0x0252
            X.GBE r0 = r2.A09
            if (r0 == 0) goto L_0x02b0
            r0.A0T(r8)
        L_0x0252:
            X.C227232is.A0D(r7, r2)
            X.C227232is.A0A(r7, r2)
            X.C227232is.A0C(r7, r2)
            X.C227232is.A0E(r7, r2)
            X.C227232is.A0B(r7, r2)
        L_0x0261:
            com.instagram.clips.intf.ClipsViewerConfig r0 = X.C227232is.A00(r2)
            boolean r1 = r0.A1i
            X.GBj r0 = r2.A0N
            if (r1 == 0) goto L_0x02a3
            if (r0 == 0) goto L_0x02a5
            com.instagram.clips.intf.ClipsViewerConfig r1 = X.C227232is.A00(r2)
            int r4 = r1.A08
        L_0x0273:
            r0.A0I(r4, r3)
            goto L_0x029b
        L_0x0277:
            X.GDB r3 = r2.A0A
            if (r3 == 0) goto L_0x0289
            X.GD6 r0 = r2.A0C
            if (r0 == 0) goto L_0x02ac
            int r1 = X.GD6.A00(r0)
            X.HCB r0 = r3.A08
            if (r0 == 0) goto L_0x0289
            r0.A00 = r1
        L_0x0289:
            X.GBE r0 = r2.A09
            if (r0 == 0) goto L_0x02b0
            X.GNH r1 = r0.A0B
            if (r1 == 0) goto L_0x029b
            X.GD6 r0 = r2.A0C
            if (r0 == 0) goto L_0x02ac
            int r0 = X.GD6.A00(r0)
            r1.A00 = r0
        L_0x029b:
            X.GBj r0 = r2.A0N
            if (r0 == 0) goto L_0x02a5
            r0.A0F()
            return
        L_0x02a3:
            if (r0 != 0) goto L_0x0273
        L_0x02a5:
            X.0qQ.A0F(r12)
            goto L_0x02b3
        L_0x02a9:
            r8 = 0
            goto L_0x0227
        L_0x02ac:
            X.0qQ.A0F(r11)
            goto L_0x02b3
        L_0x02b0:
            X.0qQ.A0F(r13)
        L_0x02b3:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x02b8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GBE.A0O(java.util.List):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
        if (X.C51969G9p.A1W(r6, r7) != false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0093, code lost:
        if (r12.BU8() != true) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e8, code lost:
        if (X.C51969G9p.A1W(r11, r13) != false) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f7, code lost:
        if (r3.A0E == null) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00fb, code lost:
        if (r2.A00 != 0) goto L_0x015d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0S(X.C62320sa r22) {
        /*
            r21 = this;
            r2 = r21
            X.6sO r1 = r2.A0U
            if (r1 == 0) goto L_0x000b
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.C320446sO.A02(r1, r0)
        L_0x000b:
            java.lang.String r14 = r2.A1O
            if (r14 == 0) goto L_0x0171
            com.instagram.clips.intf.ClipsViewerConfig r3 = r2.A0Y
            boolean r0 = r3.A1U
            if (r0 != 0) goto L_0x0171
            com.instagram.clips.intf.ClipsViewerSource r8 = r3.A0J
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.AUDIO_PAGE_CHAIN
            if (r8 == r0) goto L_0x0171
            boolean r0 = r2.A22
            java.lang.Object r10 = r22.invoke()
            X.2nH r10 = (X.C229372nH) r10
            if (r0 == 0) goto L_0x007f
            r2.A02 = r10
            X.GLR r5 = r2.A16
            if (r5 == 0) goto L_0x007e
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.CLIPS_NETEGO
            r4 = 0
            boolean r17 = X.AnonymousClass7TF.A1W(r8, r0)
            com.instagram.common.session.UserSession r7 = r2.A0a
            X.0Tu r6 = X.0Tu.A05
            r0 = 36325918562661757(0x810e3b0011357d, double:3.035995399536125E-306)
            boolean r0 = X.182.A06(r6, r7, r0)
            if (r0 != 0) goto L_0x0048
            boolean r1 = X.C51969G9p.A1W(r6, r7)
            r0 = 0
            if (r1 == 0) goto L_0x0049
        L_0x0048:
            r0 = 1
        L_0x0049:
            boolean r18 = X.C52273GLp.A07(r8, r0)
            boolean r0 = X.1KU.A06(r7)
            if (r0 == 0) goto L_0x0068
            X.0qQ.A0B(r7, r4)
            r0 = 36325918562137461(0x810e3b00093575, double:3.035995399204558E-306)
            boolean r0 = X.182.A06(r6, r7, r0)
            if (r0 != 0) goto L_0x0067
            boolean r0 = X.C51969G9p.A1W(r6, r7)
            if (r0 == 0) goto L_0x0068
        L_0x0067:
            r4 = 1
        L_0x0068:
            int r1 = r2.A00
            X.GIb r0 = r2.A0t
            boolean r0 = r0.A01
            java.lang.String r15 = r3.A1H
            X.GN8 r13 = new X.GN8
            r19 = r4
            r20 = r0
            r16 = r1
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
        L_0x007b:
            r5.A0B(r13)
        L_0x007e:
            return
        L_0x007f:
            r9 = 0
            r7 = 1
            X.0qQ.A0B(r10, r7)
            X.2nF r6 = r2.A0X
            X.5nC r0 = r6.A02(r14)
            X.4sa r12 = r0.A01
            if (r12 == 0) goto L_0x0095
            boolean r0 = r12.BU8()
            r5 = 1
            if (r0 == r7) goto L_0x0096
        L_0x0095:
            r5 = 0
        L_0x0096:
            boolean r0 = r3.A1W
            if (r0 != 0) goto L_0x00a4
            X.GCH r1 = r2.A1A
            X.GM1 r0 = new X.GM1
            r0.<init>(r6, r14)
            r1.A03(r0)
        L_0x00a4:
            X.5nC r0 = r6.A02(r14)
            java.util.List r4 = r0.A03
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0163
            X.0wj r13 = X.0wj.A01
            r11 = 817902720(0x30c03480, float:1.398476E-9)
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "ClipsGridItemsStoreMiss.ClipsViewerFragmentViewModel."
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r8, r0, r1)
            X.0f9 r1 = r13.AEf(r0, r11)
            java.lang.String r0 = "ClipsGridItemsStore does not include clips items for grid id = "
            java.lang.String r0 = X.002.A0R(r0, r14)
            X.C51969G9p.A1K(r1, r0)
        L_0x00cc:
            boolean r1 = r3.A1t
            if (r1 != 0) goto L_0x014e
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.CLIPS_NETEGO
            if (r8 == r0) goto L_0x014e
            com.instagram.common.session.UserSession r13 = r2.A0a
            X.0Tu r11 = X.0Tu.A05
            r0 = 36325918562661757(0x810e3b0011357d, double:3.035995399536125E-306)
            boolean r0 = X.182.A06(r11, r13, r0)
            if (r0 != 0) goto L_0x00ea
            boolean r1 = X.C51969G9p.A1W(r11, r13)
            r0 = 0
            if (r1 == 0) goto L_0x00eb
        L_0x00ea:
            r0 = 1
        L_0x00eb:
            boolean r0 = X.C52273GLp.A07(r8, r0)
            if (r0 == 0) goto L_0x00fd
            java.lang.String r0 = r3.A1H
            if (r0 != 0) goto L_0x00f9
            com.google.common.collect.ImmutableList r0 = r3.A0E
            if (r0 == 0) goto L_0x015d
        L_0x00f9:
            int r0 = r2.A00
            if (r0 != 0) goto L_0x015d
        L_0x00fd:
            com.instagram.common.session.UserSession r11 = r2.A0a
            boolean r0 = X.1KU.A06(r11)
            if (r0 == 0) goto L_0x012d
            X.0Tu r8 = X.DbS.A0J(r11, r9)
            r0 = 36325918562137461(0x810e3b00093575, double:3.035995399204558E-306)
            boolean r0 = X.182.A06(r8, r11, r0)
            if (r0 != 0) goto L_0x011a
            boolean r0 = X.C51969G9p.A1W(r8, r11)
            if (r0 == 0) goto L_0x012d
        L_0x011a:
            X.GM9 r11 = X.C52166GHi.A00(r11)
            X.GIb r0 = r2.A0t
            boolean r8 = r0.A01
            int r1 = r2.A00
            java.lang.String r0 = r3.A1H
            java.util.List r4 = r11.A00(r0, r4, r1, r8)
            r6.A08(r14, r4, r9, r7)
        L_0x012d:
            X.2is r0 = r2.A07
            if (r0 == 0) goto L_0x0134
            r0.A0Q(r4, r5)
        L_0x0134:
            r2.A02 = r10
            r6.A04(r10, r14)
            X.GIb r1 = r2.A0t
            int r0 = r2.A00
            r1.A0C(r0)
            int r1 = r4.size()
            int r0 = r2.A0C()
            if (r1 > r0) goto L_0x007e
            r2.A0T(r5)
            return
        L_0x014e:
            r5 = r1 ^ 1
            X.5u8 r0 = X.C276114sa.A00
            X.5u9 r1 = r0.A00(r5)
            r0 = 0
            r1.A00 = r0
            X.4sZ r12 = r1.A00()
        L_0x015d:
            X.GCH r0 = r2.A1A
            r0.A02(r12)
            goto L_0x00fd
        L_0x0163:
            X.GE0 r11 = r2.A1B
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            r0 = 19
            X.C58711IwK.A01(r11, r1, r0)
            r2.A0Q(r4)
            goto L_0x00cc
        L_0x0171:
            com.instagram.clips.intf.ClipsViewerConfig r4 = r2.A0Y
            boolean r0 = r4.A1i
            if (r0 == 0) goto L_0x017b
            java.lang.String r0 = r4.A0w
            if (r0 != 0) goto L_0x007e
        L_0x017b:
            boolean r0 = r2.A22
            if (r0 == 0) goto L_0x0196
            java.lang.String r3 = r4.A1H
            if (r3 == 0) goto L_0x0194
            X.GLR r5 = r2.A16
            if (r5 == 0) goto L_0x007e
            java.lang.String r2 = r4.A1D
            int r1 = r4.A09
            boolean r0 = r4.A1k
            X.GM5 r13 = new X.GM5
            r13.<init>(r3, r2, r1, r0)
            goto L_0x007b
        L_0x0194:
            r0 = 0
            goto L_0x019e
        L_0x0196:
            com.instagram.common.session.UserSession r1 = r2.A0a
            java.lang.String r0 = r4.A1H
            X.4bN r0 = X.GDY.A00(r4, r1, r0)
        L_0x019e:
            r2.A0J(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GBE.A0S(X.0sa):void");
    }

    public final void A0T(boolean z) {
        if (this.A0E != null && z) {
            C52191GIi gIi = C52191GIi.A00;
            ClipsViewerConfig clipsViewerConfig = this.A0Y;
            String str = clipsViewerConfig.A1H;
            UserSession userSession = this.A0a;
            if (gIi.A00(clipsViewerConfig.A0J, userSession, str, this.A0t.A0D()) && !182.A06(DbS.A0J(userSession, 0), userSession, 36317861203285618L)) {
                C52196GIn gIn = this.A0E;
                if (gIn != null) {
                    gIn.A0C((C62320sa) null, new C58676Ivl(this, 6), false);
                    return;
                }
                return;
            }
        }
        A05(this, 0sn.A00, false, false);
    }

    public final boolean A0U() {
        return AnonymousClass7TF.A1Z(this.A1m);
    }

    public final boolean A0V() {
        boolean z;
        UserSession userSession = this.A0a;
        ClipsViewerConfig clipsViewerConfig = this.A0Y;
        ClipsViewerSource clipsViewerSource = clipsViewerConfig.A0J;
        boolean z2 = true;
        boolean A1V2 = AnonymousClass7TF.A1V(clipsViewerConfig.A0L);
        ClipsViewerDirectData clipsViewerDirectData = clipsViewerConfig.A0I;
        if (clipsViewerDirectData != null) {
            z = clipsViewerDirectData.A09;
        } else {
            z = false;
        }
        if (clipsViewerConfig.A0X == null) {
            z2 = false;
        }
        return GBF.A01(clipsViewerSource, userSession, A1V2, z, z2);
    }

    public final boolean A0W() {
        boolean z;
        if (this.A0N) {
            return false;
        }
        if (!AnonymousClass7TF.A1Z(this.A1m) && !AnonymousClass7TF.A1Z(this.A1q)) {
            return false;
        }
        UserSession userSession = this.A0a;
        ClipsViewerConfig clipsViewerConfig = this.A0Y;
        ClipsViewerSource clipsViewerSource = clipsViewerConfig.A0J;
        boolean A1V2 = AnonymousClass7TF.A1V(clipsViewerConfig.A0L);
        ClipsViewerDirectData clipsViewerDirectData = clipsViewerConfig.A0I;
        if (clipsViewerDirectData != null) {
            z = clipsViewerDirectData.A09;
        } else {
            z = false;
        }
        if (GBF.A00(clipsViewerSource, userSession, A1V2, z)) {
            return true;
        }
        return false;
    }

    public final String BCb() {
        C295365o2 r0;
        C52009GBg A012 = GD6.A01(this.A20);
        if (A012.A0A() > 0) {
            r0 = A012.A0E(0).A01;
        } else {
            r0 = null;
        }
        return GIO.A00(r0);
    }

    public final boolean CW7() {
        return AnonymousClass7TF.A1W(this.A18.A00, AnonymousClass05K.A01);
    }

    public final void DbC() {
        this.A1K.A0R("resume", false);
        2dZ.A0t.A03(this.A0R).A0P.setVisibility(0);
    }

    public final void DbD() {
        this.A1K.A0N((C267324bN) null, "dialog", false, true);
        2dZ.A0t.A03(this.A0R).A0P.setVisibility(8);
    }

    public final void FHG(boolean z) {
        if (z) {
            this.A1K.A0R("resume", false);
        } else {
            this.A1K.A0N((C267324bN) null, "debug_pause", true, true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r0.A58() != true) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
        if (r2 != false) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0L(X.C267324bN r12, X.C311526cp r13) {
        /*
            r11 = this;
            A02(r12, r11)
            r3 = 0
            X.1Xj r0 = r12.A02
            if (r0 == 0) goto L_0x0080
            java.lang.String r10 = r0.A2n()
        L_0x000c:
            java.lang.String r1 = "Required value was null."
            if (r10 == 0) goto L_0x0087
            X.1Xj r0 = r12.A02
            if (r0 == 0) goto L_0x0082
            X.1iA r8 = r0.BR7()
            com.instagram.clips.intf.ClipsViewerConfig r0 = r11.A0Y
            X.4gf r1 = r0.A0T
            if (r1 == 0) goto L_0x006c
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            com.instagram.common.session.UserSession r2 = r11.A0a
            X.GAc r0 = r11.A19
            X.F8R.A00(r0, r2, r1, r4, r10)
        L_0x0027:
            r4 = 1
            X.1Xj r0 = r12.A02
            if (r0 == 0) goto L_0x0033
            boolean r0 = r0.A58()
            r2 = 1
            if (r0 == r4) goto L_0x0034
        L_0x0033:
            r2 = 0
        L_0x0034:
            X.0sa r0 = r11.A20
            X.GBg r0 = X.GD6.A01(r0)
            int r0 = r0.A0A()
            if (r0 != 0) goto L_0x0044
            androidx.fragment.app.FragmentActivity r0 = r11.A0R
            if (r0 != 0) goto L_0x0047
        L_0x0044:
            r4 = 0
            if (r2 == 0) goto L_0x0064
        L_0x0047:
            r4 = 1
            if (r1 == 0) goto L_0x0056
            android.content.Intent r2 = X.C51976G9y.A04(r12)
            androidx.fragment.app.FragmentActivity r1 = r11.A0R
            if (r1 == 0) goto L_0x0056
            r0 = -1
            r1.setResult(r0, r2)
        L_0x0056:
            if (r13 == 0) goto L_0x0064
            boolean r0 = r13.A01()
            if (r0 != 0) goto L_0x0064
            androidx.fragment.app.FragmentActivity r0 = r11.A0R
            r0.onBackPressed()
        L_0x0063:
            return
        L_0x0064:
            r11.A0K = r4
            if (r13 == 0) goto L_0x0063
            r13.A00(r3, r4)
            return
        L_0x006c:
            X.1iA r0 = X.1iA.A0a
            if (r8 != r0) goto L_0x0027
            X.1pZ r4 = X.AnonymousClass1pc.A00()
            com.instagram.common.session.UserSession r7 = r11.A0a
            androidx.fragment.app.FragmentActivity r5 = r11.A0R
            X.GAc r6 = r11.A19
            X.HMr r9 = X.C54660HMr.DELETE_CLIPS
            r4.AP8(r5, r6, r7, r8, r9, r10)
            goto L_0x0027
        L_0x0080:
            r10 = r3
            goto L_0x000c
        L_0x0082:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x0087:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GBE.A0L(X.4bN, X.6cp):void");
    }

    public final void A0Q(List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            1Xj r0 = ((C267324bN) it.next()).A02;
            if (r0 != null) {
                String A2n = r0.A2n();
                String str = this.A1E.A00;
                if (str != null && 0qQ.A0K(A2n, 1Xv.A06(str))) {
                    this.A00 = i;
                    return;
                }
            }
            i = i2;
        }
    }

    public final void onDestroyView() {
        super.onDestroyView();
        C52029GCb gCb = this.A06;
        if (gCb != null) {
            gCb.A00 = null;
            gCb.A02 = null;
            C52033GCf gCf = gCb.A0Y;
            AnonymousClass2Q9 r0 = gCf.A02;
            if (r0 != null) {
                r0.AG7((CancellationException) null);
            }
            gCf.A02 = null;
            AnonymousClass2Q9 r02 = gCf.A00;
            if (r02 != null) {
                r02.AG7((CancellationException) null);
            }
            gCf.A00 = null;
            AnonymousClass2Q9 r03 = gCf.A03;
            if (r03 != null) {
                r03.AG7((CancellationException) null);
            }
            gCf.A03 = null;
            AnonymousClass2Q9 r04 = gCf.A01;
            if (r04 != null) {
                r04.AG7((CancellationException) null);
            }
            gCf.A01 = null;
            AnonymousClass32T r2 = gCb.A0F;
            C275794rx r05 = r2.A00;
            if (r05 != null) {
                r05.A03 = null;
                r05.A03(false);
                r2.A00 = null;
            }
        }
    }

    public GBE(Context context, FragmentActivity fragmentActivity, C270694h9 r24, C51990GAn gAn, C320446sO r26, C52278GLu gLu, GMD gmd, C229352nF r29, ClipsViewerConfig clipsViewerConfig, C270754hF r31, UserSession userSession, 2el r33, C55774Hn9 hn9, AnonymousClass7QE r35, C234052wu r36, JU5 ju5, C228312lJ r38, AnonymousClass57M r39, C231002qi r40, C230882qT r41, AnonymousClass3DW r42, C14192TrX trX, C52232GJx gJx, C55948HqC hqC, C52051GCx gCx, C52231GJw gJw, C54575HJk hJk, GYI gyi, C57689Ies ies, C52185GIb gIb, GE5 ge5, GD0 gd0, C40691Ah8 ah8, C52179GHv gHv, GCA gca, HK5 hk5, GI5 gi5, GE2 ge2, HnV hnV, C56043Hrq hrq, GIN gin, GLR glr, H3C h3c, GE3 ge3, C51979GAc gAc, C55682Hlf hlf, GCH gch, GE0 ge0, GE1 ge1, AnonymousClass93T r71, C55684Hlh hlh, C52077GDx gDx, C52262GLd gLd, GF2 gf2, C55875How how, GE4 ge4, C52016GBn gBn, GD9 gd9, C62320sa r80, C62320sa r81, C62320sa r82, C62320sa r83, C62320sa r84, C62320sa r85, boolean z) {
        AnonymousClass93T r15 = r71;
        0qQ.A0B(r15, 10);
        GF2 gf22 = gf2;
        0qQ.A0B(gf22, 11);
        C270754hF r17 = r31;
        0qQ.A0B(r17, 27);
        AnonymousClass3DW r14 = r42;
        0qQ.A0B(r14, 31);
        JU5 ju52 = ju5;
        0qQ.A0B(ju52, 43);
        C231002qi r10 = r40;
        0qQ.A0B(r10, 62);
        this.A0Q = context;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        this.A0R = fragmentActivity2;
        UserSession userSession2 = userSession;
        this.A0a = userSession2;
        ClipsViewerConfig clipsViewerConfig2 = clipsViewerConfig;
        this.A0Y = clipsViewerConfig2;
        this.A0W = gmd;
        this.A1y = r80;
        this.A1x = r81;
        this.A1z = r82;
        this.A1w = r83;
        this.A1D = r15;
        this.A1H = gf22;
        this.A1E = hlh;
        this.A0T = gAn;
        C51979GAc gAc2 = gAc;
        this.A19 = gAc2;
        this.A0S = r24;
        this.A0b = r33;
        this.A1L = gd9;
        this.A0w = ah8;
        this.A1B = ge0;
        this.A0f = r38;
        this.A0X = r29;
        this.A0g = r39;
        this.A0U = r26;
        this.A0V = gLu;
        this.A0i = r41;
        this.A0q = hJk;
        this.A0Z = r17;
        GCH gch2 = gch;
        this.A1A = gch2;
        this.A0z = gca;
        this.A23 = hn9;
        this.A0j = r14;
        this.A0d = r36;
        this.A1C = ge1;
        this.A14 = hrq;
        this.A0o = gCx;
        this.A0x = gHv;
        this.A0k = trX;
        C62320sa r172 = r84;
        this.A20 = r172;
        C62320sa r152 = r85;
        this.A1v = r152;
        this.A18 = ge3;
        this.A0v = gd0;
        this.A0s = ies;
        this.A0e = ju52;
        this.A1K = gBn;
        this.A10 = hk5;
        this.A1J = ge4;
        this.A22 = z;
        this.A16 = glr;
        C52262GLd gLd2 = gLd;
        this.A1G = gLd2;
        this.A0r = gyi;
        this.A0p = gJw;
        this.A24 = hlf;
        this.A0l = gJx;
        this.A0c = r35;
        this.A15 = gin;
        this.A11 = gi5;
        this.A12 = ge2;
        this.A0n = hqC;
        this.A13 = hnV;
        this.A0u = ge5;
        C52185GIb gIb2 = gIb;
        this.A0t = gIb2;
        this.A0h = r10;
        H3C h3c2 = h3c;
        this.A17 = h3c2;
        this.A1I = how;
        this.A1F = gDx;
        this.A1M = clipsViewerConfig2.A16;
        this.A1O = clipsViewerConfig2.A1J;
        this.A21 = A25.contains(clipsViewerConfig2.A0J);
        this.A1N = clipsViewerConfig2.A17;
        this.A1Q = C58709IwI.A01(this, 35);
        this.A1a = C58709IwI.A00(this, 45);
        this.A1f = C58676Ivl.A00(this, 0);
        this.A1e = C58709IwI.A01(this, 49);
        this.A1g = C58676Ivl.A00(this, 1);
        this.A1R = C58709IwI.A01(this, 36);
        this.A1S = C58709IwI.A01(this, 37);
        this.A1X = C58709IwI.A01(this, 42);
        this.A1U = C58709IwI.A01(this, 39);
        this.A1Y = C58709IwI.A01(this, 43);
        this.A1Z = C58709IwI.A01(this, 44);
        this.A1T = C58709IwI.A01(this, 38);
        this.A1V = C58709IwI.A01(this, 40);
        this.A1W = C58709IwI.A01(this, 41);
        this.A1d = C58709IwI.A01(this, 48);
        this.A1h = C58676Ivl.A00(this, 2);
        this.A1i = C58676Ivl.A00(this, 3);
        this.A0m = new C55566Hjm(this);
        IOG iog = new IOG(fragmentActivity2, userSession2, gAc2.getModuleName(), r152, r172);
        this.A0y = iog;
        this.A1c = C58709IwI.A01(this, 47);
        if (gLd != null) {
            gLd2.A02.add(new C55564Hjk(this));
            gLd2.A00.add(this);
        }
        if (1KU.A06(userSession2)) {
            gch2.A03(gIb2.A04);
        }
        14i.A03(15Y.A04, iog);
        if (h3c != null) {
            h3c2.A00 = new C55565Hjl(this);
        }
    }
}
