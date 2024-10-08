package X;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import com.instagram.api.schemas.ThumbnailInteractionType;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.clips.model.metadata.PlaylistContext;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.chaining.intf.DiscoveryChainingConfig;
import com.instagram.discovery.chaining.model.DiscoveryChainingItem;
import com.instagram.explore.intf.ExploreFragmentConfig;
import com.instagram.explore.topiccluster.ExploreTopicCluster;
import com.instagram.modal.ModalActivity;
import com.instagram.nido.impl.explore.NidoExploreViewModel;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import com.instagram.videofeed.intf.VideoFeedType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.GWh  reason: case insensitive filesystem */
public final class C52530GWh extends WW4 {
    public Context A00;
    public View A01;
    public C52529GWg A02;
    public GT0 A03;
    public GWY A04;
    public C232692uG A05;
    public C238133Ar A06;
    public AnonymousClass32A A07;
    public boolean A08;
    public final UserSession A09;
    public final C14005To7 A0A;
    public final GWW A0B;
    public final JSr A0C;
    public final C55918Hpf A0D;
    public final C3723190i A0E;
    public final C232682uF A0F;
    public final String A0G;
    public final String A0H;
    public final AnonymousClass0eM A0I = C58675Ivk.A00(this, 5);
    public final AnonymousClass0eM A0J = C58675Ivk.A00(this, 6);
    public final AnonymousClass0eM A0K = C58675Ivk.A00(this, 7);
    public final AnonymousClass0eM A0L = C58675Ivk.A00(this, 8);
    public final AnonymousClass0eM A0M = C58675Ivk.A00(this, 9);
    public final C267664bz A0N;
    public final C227762js A0O;
    public final 0wc A0P;
    public final GXC A0Q;
    public final X9Q A0R;
    public final C55919Hpg A0S;
    public final C52526GWd A0T;
    public final C60111Jfs A0U;
    public final C231002qi A0V;
    public final C230882qT A0W;
    public final AnonymousClass32Q A0X;
    public final C249763kK A0Y;
    public final String A0Z;
    public final boolean A0a;
    public final boolean A0b;

    public static String A01(0Tu r3, 0lg r4, C55918Hpf hpf) {
        if (182.A06(r3, r4, 36317431706293382L)) {
            return hpf.A00(2131961858, new Object[0]);
        }
        return null;
    }

    public static String A02(1Xj r4) {
        ThumbnailInteractionType C70 = r4.A0C.C70();
        if (C70 == null) {
            return null;
        }
        int ordinal = C70.ordinal();
        if (ordinal == 1) {
            return "likes";
        }
        if (ordinal == 2) {
            return "reshares";
        }
        return null;
    }

    public final void A0E(View view, C296995qz r14, C297035r4 r15) {
        C298795u2 r10;
        ArrayList arrayList;
        0qQ.A0B(r15, 0);
        C298785u1 r0 = r15.A01;
        0wc r4 = this.A0P;
        1Xj A002 = C44742CkB.A00(r0.A00);
        C296905qq r9 = r15.A02;
        C295805ow r3 = C295805ow.GUIDES;
        ExploreTopicCluster exploreTopicCluster = A0O().A02;
        String str = this.A0G;
        C295795ov r02 = r15.A03;
        if (r02 != null) {
            r10 = r02.A06;
        } else {
            r10 = null;
        }
        Long valueOf = Long.valueOf(r15.A00);
        DbW.A1O(r4, 0, str);
        C52534GWl A003 = A00(r14, r9, exploreTopicCluster, A002);
        String str2 = A003.A09;
        String str3 = A003.A0B;
        String str4 = A003.A0A;
        if (r10 != null) {
            str2 = r10.A03;
            str3 = C296875qn.A00(r10.A01());
            str4 = r10.A00().A04;
        }
        0Aj A0e = AnonymousClass7TE.A0e(r4, "explore_home_click");
        C51967G9n.A18(A0e, str);
        String str5 = A003.A05;
        if (str5 == null) {
            str5 = "";
        }
        A03(r3, A0e, A003, str5, str2);
        A04(A0e, A003, str3, str4, (String) null);
        List list = A003.A0C;
        String str6 = null;
        if (list != null) {
            arrayList = AnonymousClass7TF.A0p(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C51972G9s.A1H(arrayList, it);
            }
        } else {
            arrayList = null;
        }
        A05(A0e, valueOf, (String) null, arrayList);
        if (A002 != null) {
            str6 = A02(A002);
        }
        A0e.AAJ("social_proof_interaction_type", str6);
        A0e.AAJ("content_source_type", (String) null);
        A0e.Cgf();
        0qQ.A0F("instance");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A0F(View view, C296995qz r14, HAR har) {
        C298795u2 r10;
        ArrayList arrayList;
        0qQ.A0B(view, 2);
        if (AnonymousClass06S.A01(this.A0D.A00.getParentFragmentManager())) {
            C298745tx r3 = har.A01;
            1Xj r2 = r3.A00;
            if (r2 != null) {
                UserSession userSession = this.A09;
                if (C321536uL.A02(userSession)) {
                    C321536uL.A01(userSession, r2, true);
                    return;
                }
            }
            0wc r4 = this.A0P;
            1Xj r6 = r3.A00;
            C296905qq r11 = har.A02;
            C295805ow r32 = C295805ow.IGTV_MEDIA;
            ExploreTopicCluster exploreTopicCluster = A0O().A02;
            String str = this.A0G;
            C295795ov r0 = har.A03;
            if (r0 != null) {
                r10 = r0.A06;
            } else {
                r10 = null;
            }
            Long valueOf = Long.valueOf(har.A00);
            DbW.A1O(r4, 0, str);
            C52534GWl A002 = A00(r14, r11, exploreTopicCluster, r6);
            String str2 = A002.A09;
            String str3 = A002.A0B;
            String str4 = A002.A0A;
            if (r10 != null) {
                str2 = r10.A03;
                str3 = C296875qn.A00(r10.A01());
                str4 = r10.A00().A04;
            }
            0Aj A0e = AnonymousClass7TE.A0e(r4, "explore_home_click");
            C51967G9n.A18(A0e, str);
            String str5 = A002.A05;
            if (str5 == null) {
                str5 = "";
            }
            A03(r32, A0e, A002, str5, str2);
            A04(A0e, A002, str3, str4, (String) null);
            List list = A002.A0C;
            String str6 = null;
            if (list != null) {
                arrayList = AnonymousClass7TF.A0p(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C51972G9s.A1H(arrayList, it);
                }
            } else {
                arrayList = null;
            }
            A05(A0e, valueOf, (String) null, arrayList);
            if (r6 != null) {
                str6 = A02(r6);
            }
            A0e.AAJ("social_proof_interaction_type", str6);
            A0e.AAJ("content_source_type", (String) null);
            A0e.Cgf();
        }
    }

    public final void A0H(C296995qz r57, C67362Mme mme, C296925qs r59) {
        C298795u2 r9;
        String str;
        String str2;
        String str3;
        ArrayList arrayList;
        ClipsViewerSource clipsViewerSource;
        String str4;
        AnonymousClass9JG r1;
        String str5;
        String str6;
        ExploreTopicCluster exploreTopicCluster;
        String str7;
        String str8;
        boolean z;
        String str9;
        AnonymousClass3WR A092;
        C296925qs r7 = r59;
        0qQ.A0B(r7, 0);
        C296995qz r22 = r57;
        0qQ.A0B(r22, 1);
        0qQ.A0B(mme, 2);
        C55918Hpf hpf = this.A0D;
        if (AnonymousClass06S.A01(hpf.A00.getParentFragmentManager())) {
            r7.BPf();
            boolean z2 = true;
            UserSession userSession = this.A09;
            if (C321536uL.A02(userSession)) {
                C321536uL.A01(userSession, r7.BPf(), true);
                return;
            }
            0Tu r92 = 0Tu.A05;
            String str10 = null;
            if (182.A06(r92, userSession, 36312436659192940L) && (A092 = r7.A01.A00().A09(userSession, (Integer) null)) != null) {
                A0A(A092);
            }
            if (182.A06(r92, userSession, 36316817525838484L)) {
                1Xj BPf = r7.BPf();
                String id = BPf.getId();
                if (id != null) {
                    String A0r = C51972G9s.A0r(userSession, BPf);
                    C54664HMv hMv = C54664HMv.A05;
                    int i = BPf.BR7().A00;
                    String B2y = BPf.A0C.B2y();
                    C57098IOm A002 = Ha0.A00(userSession);
                    String str11 = this.A0H;
                    0qQ.A0B(str11, 0);
                    String A11 = DbT.A11(str11, A002.A00);
                    String A2R = BPf.A2R();
                    String A2v = BPf.A2v();
                    String A0t = DbX.A0t(BPf.A3e());
                    int A003 = C51973G9u.A00();
                    if (A003 == 0) {
                        z = false;
                    } else if (A003 == 3) {
                        z = true;
                    } else {
                        throw AnonymousClass7TE.A0w("All channel-related arguments must be provided");
                    }
                    DiscoveryChainingItem discoveryChainingItem = new DiscoveryChainingItem(hMv, (VideoFeedType) null, (Boolean) null, (Integer) null, id, A0r, B2y, A11, (String) null, str11, (String) null, (String) null, (String) null, A2R, A2v, A0t, (String) null, (String) null, (String) null, i, z);
                    String str12 = this.A0Z;
                    if (str12 != null) {
                        str10 = hpf.A00(2131972269, new Object[0]);
                    }
                    boolean z3 = this.A0b;
                    if (this.A0E.A05) {
                        str9 = "interest_explore";
                    } else if (z3) {
                        str9 = "reshare_hub";
                    } else {
                        str9 = "topical_explore";
                    }
                    if (str10 == null) {
                        str10 = this.A0C.ArD();
                    }
                    String str13 = this.A0G;
                    String moduleName = this.A0F.getModuleName();
                    C51973G9u.A0r(2, str10, str13, moduleName);
                    0sl r29 = 0sl.A00;
                    ExploreTopicCluster exploreTopicCluster2 = A0O().A02;
                    C14005To7 to7 = this.A0A;
                    Bundle A0B2 = DbV.A0B(to7, 0);
                    to7.A01(A0B2);
                    String A012 = A01(r92, userSession, hpf);
                    GWY gwy = this.A04;
                    if (gwy != null) {
                        boolean z4 = gwy.A02;
                        C296995qz r2 = r22;
                        Integer valueOf = Integer.valueOf((r2.A01 * 3) + r2.A00);
                        if (str12 == null) {
                            z2 = false;
                        }
                        DiscoveryChainingConfig discoveryChainingConfig = new DiscoveryChainingConfig(A0B2, discoveryChainingItem, exploreTopicCluster2, valueOf, (Integer) null, str10, str9, str13, moduleName, (String) null, str12, (String) null, (String) null, A012, (String) null, (HashMap) null, r29, true, true, false, z2, false, false, false, false, false, false, z4);
                        if (this.A0a) {
                            A08(discoveryChainingConfig);
                        } else {
                            A07(discoveryChainingConfig);
                        }
                    } else {
                        0qQ.A0F("viewController");
                        throw AnonymousClass00P.createAndThrow();
                    }
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            } else {
                C295825oy r15 = r7.A01;
                0wc r14 = this.A0P;
                1Xj r13 = r15.A00().A02;
                C296905qq r12 = r7.A02;
                C295805ow r18 = C295805ow.CLIPS;
                ExploreTopicCluster exploreTopicCluster3 = A0O().A02;
                String str14 = this.A0G;
                C295795ov r3 = r7.A03;
                if (r3 != null) {
                    r9 = r3.A06;
                } else {
                    r9 = null;
                }
                AnonymousClass9JG r32 = r15.A02;
                if (r32 != null) {
                    str = r32.A02;
                } else {
                    str = null;
                }
                Long valueOf2 = Long.valueOf(r7.A00);
                int ordinal = r15.A05.ordinal();
                if (ordinal == 2) {
                    str2 = "templates";
                } else if (ordinal != 3) {
                    str2 = null;
                } else {
                    str2 = "nearby";
                }
                1Xj r33 = r15.A00().A02;
                if (r33 != null) {
                    str3 = C51965G9l.A0t(r33);
                } else {
                    str3 = null;
                }
                String str15 = null;
                DbW.A1O(r14, 0, str14);
                C52534GWl A004 = A00(r22, r12, exploreTopicCluster3, r13);
                String str16 = A004.A09;
                String str17 = A004.A0B;
                String str18 = A004.A0A;
                if (r9 != null) {
                    str16 = r9.A03;
                    str17 = C296875qn.A00(r9.A01());
                    str18 = r9.A00().A04;
                }
                0Aj A0e = AnonymousClass7TE.A0e(r14, "explore_home_click");
                C51967G9n.A18(A0e, str14);
                String str19 = A004.A05;
                if (str19 == null) {
                    str19 = "";
                }
                A03(r18, A0e, A004, str19, str16);
                A04(A0e, A004, str17, str18, str3);
                List list = A004.A0C;
                String str20 = null;
                if (list != null) {
                    arrayList = AnonymousClass7TF.A0p(list);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C51972G9s.A1H(arrayList, it);
                    }
                } else {
                    arrayList = null;
                }
                A05(A0e, valueOf2, str, arrayList);
                if (r13 != null) {
                    str20 = A02(r13);
                }
                A0e.AAJ("social_proof_interaction_type", str20);
                A0e.AAJ("content_source_type", str2);
                A0e.AAJ("subtype", r15.A01().A00);
                A0e.Cgf();
                AnonymousClass9JG r34 = r15.A02;
                if (r34 == null || (str8 = r34.A02) == null || !C51966G9m.A1X(str8)) {
                    C295835oz r4 = r15.A05;
                    if (r4 == C295835oz.TEMPLATES) {
                        clipsViewerSource = ClipsViewerSource.EXPLORE_TILE_TWO_BY_TWO;
                    } else if (r4 == C295835oz.TRENDING) {
                        AnonymousClass9JG r35 = r15.A02;
                        if (r35 == null || (str4 = r35.A01) == null || !C51966G9m.A1X(str4)) {
                            clipsViewerSource = ClipsViewerSource.EXPLORE_TRENDING_MINOR_UNIT;
                        } else {
                            clipsViewerSource = ClipsViewerSource.EXPLORE_POPULAR_AGGREGATE_TREND_MINOR_UNIT;
                        }
                    } else if (r4 == C295835oz.NEARBY) {
                        clipsViewerSource = ClipsViewerSource.EXPLORE_NEARBY_MINOR_UNIT;
                    } else if (r15.A01() == C292535j7.MAJOR) {
                        clipsViewerSource = ClipsViewerSource.EXPLORE_POPULAR_MAJOR_UNIT;
                    } else if (this.A0E.A05) {
                        clipsViewerSource = ClipsViewerSource.EXPLORE_INTEREST_MINOR_UNIT;
                    } else {
                        clipsViewerSource = ClipsViewerSource.EXPLORE_POPULAR_MINOR_UNIT;
                    }
                } else {
                    clipsViewerSource = ClipsViewerSource.EXPLORE_TILE_TWO_BY_TWO;
                }
                C270634h3 A0i = C51965G9l.A0i(clipsViewerSource, userSession);
                A0i.A1B = r15.A0A;
                A0i.A1C = r15.A00().getId();
                A0i.A1E = this.A0Z;
                if (clipsViewerSource == ClipsViewerSource.EXPLORE_TILE_TWO_BY_TWO) {
                    AnonymousClass9JG r23 = r15.A02;
                    if (!(r23 == null || (str7 = r23.A00) == null || !C51966G9m.A1X(str7))) {
                        A0i.A0n = str7;
                    }
                    if (r15.A05 == C295835oz.TEMPLATES) {
                        A0O();
                        GT0 A0O2 = A0O();
                        0qQ.A0C(A0O2, "null cannot be cast to non-null type com.instagram.explore.repository.ExploreDataStore");
                        A0i.A0i = A0O2.A05;
                    } else {
                        AnonymousClass9JG r24 = r15.A02;
                        if (r24 != null) {
                            str10 = r24.A02;
                        }
                        A0i.A0J = new PlaylistContext(str10);
                        A0i.A1l = false;
                    }
                } else if (clipsViewerSource == ClipsViewerSource.EXPLORE_POPULAR_AGGREGATE_TREND_MINOR_UNIT) {
                    AnonymousClass9JG r25 = r15.A02;
                    if (!(r25 == null || (str6 = r25.A00) == null || !C51966G9m.A1X(str6))) {
                        AnonymousClass9JG r26 = r15.A02;
                        if (r26 != null) {
                            str10 = r26.A00;
                        }
                        A0i.A0n = str10;
                    }
                    AnonymousClass9JG r16 = r15.A02;
                    if (r16 != null) {
                        str15 = r16.A01;
                    }
                    A0i.A0t = str15;
                    A0i.A07 = AnonymousClass5OC.FEED_TRENDING;
                } else if (!(clipsViewerSource != ClipsViewerSource.EXPLORE_NEARBY_MINOR_UNIT || (r1 = r15.A02) == null || (str5 = r1.A00) == null)) {
                    A0i.A0n = str5;
                }
                A0i.A1c = false;
                C3723190i r27 = this.A0E;
                if (r27.A05 && (exploreTopicCluster = r27.A00) != null) {
                    A0i.A0n = exploreTopicCluster.A0A;
                    A0i.A0r = exploreTopicCluster.A06;
                }
                this.A0Q.A00(A0i, r7, true, false);
            }
        }
    }

    public final void A0I(C296995qz r4, C296955qv r5) {
        C55919Hpg hpg = this.A0S;
        1Xj BPf = r5.BPf();
        0qQ.A0B(BPf, 0);
        C14074TpO tpO = hpg.A00.A06;
        if (tpO == null) {
            0qQ.A0F("grid");
            throw AnonymousClass00P.createAndThrow();
        } else if (BPf.CeS()) {
            tpO.A0D.EHL();
        }
    }

    public final void A0J(ExploreTopicCluster exploreTopicCluster) {
        Integer num;
        C243443Yu.A00().A01.getValue();
        UserSession userSession = this.A09;
        ExploreFragmentConfig exploreFragmentConfig = new ExploreFragmentConfig(exploreTopicCluster, GX9.A00(userSession).A00, (String) null, 0, 1, false, false);
        Bundle A0a2 = AnonymousClass7TE.A0a();
        A0a2.putParcelable(AnonymousClass000.A00(941), exploreFragmentConfig);
        AnonymousClass32L r1 = new AnonymousClass32L();
        r1.setArguments(A0a2);
        Dba.A12(r1, DbW.A0H(this.A0D.A00, userSession));
        if (exploreTopicCluster.A01 == C296865qm.SUGGESTED) {
            num = AnonymousClass05K.A01;
        } else {
            num = AnonymousClass05K.A00;
        }
        0wc r2 = this.A0P;
        String str = exploreTopicCluster.A09;
        0qQ.A0B(r2, 0);
        0Aj A0e = AnonymousClass7TE.A0e(r2, "explore_topic_switch");
        A0e.AAJ("dest_topic_cluster_title", str);
        A0e.AAJ("dest_topic_cluster_type", C52569GXu.A00(num));
        A0e.Cgf();
    }

    public final void A0L(ExploreTopicCluster exploreTopicCluster, boolean z) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Context context;
        String A0h;
        Context context2;
        String string;
        C60111Jfs jfs = this.A0U;
        ExploreTopicCluster exploreTopicCluster2 = exploreTopicCluster;
        if (jfs != null) {
            NidoExploreViewModel nidoExploreViewModel = (NidoExploreViewModel) jfs;
            if (nidoExploreViewModel.A02.add(exploreTopicCluster.A06)) {
                ((C46556Dgy) nidoExploreViewModel.A03.getValue()).A03(exploreTopicCluster.A06);
                if (z) {
                    num2 = AnonymousClass05K.A01;
                    num4 = AnonymousClass05K.A00;
                    num3 = num4;
                } else {
                    num2 = AnonymousClass05K.A00;
                    num3 = num2;
                    num4 = AnonymousClass05K.A01;
                }
                boolean z2 = false;
                if (num4 == num3) {
                    z2 = true;
                    num5 = AnonymousClass05K.A0Y;
                } else {
                    num5 = num3;
                }
                NidoExploreViewModel.A01(exploreTopicCluster, nidoExploreViewModel, num5, num2);
                if (!(z2 || (context = this.A00) == null || (A0h = DbW.A0h(context, exploreTopicCluster.A09, 2131968368)) == null || (context2 = this.A00) == null || (string = context2.getString(2131968369)) == null)) {
                    C310336ap A0a2 = DbS.A0a();
                    A0a2.A0D = A0h;
                    A0a2.A0G = string;
                    A0a2.A0A(new IVR(2, this, exploreTopicCluster));
                    A0a2.A0L = true;
                    A0a2.A0M = true;
                    DbY.A1N(A0a2);
                }
                AnonymousClass0t1.A01.A01(nidoExploreViewModel.A01).A03.EYD(true);
                C318136oS A002 = C318116oQ.A00(nidoExploreViewModel);
                1Eo.A03(num3, 19B.A00, new MHL(num2, exploreTopicCluster2, this, nidoExploreViewModel, (AnonymousClass4D7) null, 8), A002);
            }
        }
        0wc r7 = this.A0P;
        UserSession userSession = this.A09;
        String str = exploreTopicCluster.A09;
        String str2 = exploreTopicCluster.A06;
        if (z) {
            num = AnonymousClass05K.A0N;
        } else {
            num = AnonymousClass05K.A01;
        }
        String str3 = userSession.A06;
        0qQ.A0B(r7, 0);
        if (z) {
            I3t.A00(userSession, str3, C52569GXu.A00(num), str, str2);
        } else {
            0Aj A0e = AnonymousClass7TE.A0e(r7, "explore_topic_switch");
            A0e.AAJ("dest_topic_cluster_title", str);
            A0e.AAJ("dest_topic_cluster_type", C52569GXu.A00(num));
            A0e.Cgf();
        }
        C296865qm r0 = C296865qm.INTERESTED;
        0qQ.A0B(r0, 0);
        exploreTopicCluster.A01 = r0;
    }

    public final void A0M(ExploreTopicCluster exploreTopicCluster, boolean z) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        C60111Jfs jfs = this.A0U;
        ExploreTopicCluster exploreTopicCluster2 = exploreTopicCluster;
        if (jfs != null) {
            NidoExploreViewModel nidoExploreViewModel = (NidoExploreViewModel) jfs;
            ((C46556Dgy) nidoExploreViewModel.A03.getValue()).A03(exploreTopicCluster.A06);
            if (z) {
                num2 = AnonymousClass05K.A01;
                num3 = AnonymousClass05K.A0C;
            } else {
                num2 = AnonymousClass05K.A00;
                num3 = AnonymousClass05K.A0N;
            }
            if (num3 == AnonymousClass05K.A0C) {
                num4 = AnonymousClass05K.A0N;
            } else {
                num4 = AnonymousClass05K.A01;
            }
            NidoExploreViewModel.A01(exploreTopicCluster, nidoExploreViewModel, num4, num2);
            AnonymousClass7TE.A1Z(new MHL(num2, exploreTopicCluster2, this, nidoExploreViewModel, (AnonymousClass4D7) null, 9), C318116oQ.A00(nidoExploreViewModel));
        }
        0wc r7 = this.A0P;
        UserSession userSession = this.A09;
        String str = exploreTopicCluster.A09;
        String str2 = exploreTopicCluster.A06;
        if (z) {
            num = AnonymousClass05K.A0Y;
        } else {
            num = AnonymousClass05K.A00;
        }
        String str3 = userSession.A06;
        0qQ.A0B(r7, 0);
        if (z) {
            I3t.A00(userSession, str3, C52569GXu.A00(num), str, str2);
        } else {
            0Aj A0e = AnonymousClass7TE.A0e(r7, "explore_topic_switch");
            A0e.AAJ("dest_topic_cluster_title", str);
            A0e.AAJ("dest_topic_cluster_type", C52569GXu.A00(num));
            A0e.Cgf();
        }
        C296865qm r0 = C296865qm.SUGGESTED;
        0qQ.A0B(r0, 0);
        exploreTopicCluster.A01 = r0;
    }

    public final void DJ3(1Xj r6) {
        0qQ.A0B(r6, 0);
        AnonymousClass32L r4 = this.A0S.A00;
        if (C321536uL.A02(r4.getSession())) {
            UserSession A032 = r4.getSession();
            0qQ.A0B(A032, 0);
            1sd.A00(A032).A02(r6, false);
            AnonymousClass1Nd.A00(A032).A00(new C57066INg(r6));
            C321536uL.A02.add(r6);
            HashSet hashSet = C321536uL.A01;
            if (hashSet.contains(r6)) {
                hashSet.remove(r6);
                return;
            }
            return;
        }
        C46498Dg1 dg1 = new C46498Dg1(r4.requireContext(), r4.getSession());
        dg1.A04(new ID2(19, (Object) r6, (Object) r4), 2131975876);
        C49945FFy.A00(r4, dg1);
    }

    public final void DQR(1Xj r8, Integer num, int i, int i2) {
        1Xj A002;
        String id;
        Integer num2;
        Integer num3;
        0qQ.A0B(r8, 0);
        C52526GWd gWd = this.A0T;
        if (gWd != null) {
            String moduleName = this.A0F.getModuleName();
            0qQ.A0B(moduleName, 0);
            if ("explore_popular".equals(moduleName) && (A002 = C52526GWd.A00(r8)) != null && (id = A002.getId()) != null && !gWd.A03.contains(id)) {
                if (gWd.A01 != null) {
                    C228362lW r4 = gWd.A08;
                    String str = gWd.A09;
                    if (gWd.A06) {
                        num2 = AnonymousClass05K.A0N;
                    } else {
                        num2 = AnonymousClass05K.A00;
                    }
                    r4.A01((1Xj) null, num2, AnonymousClass05K.A02, str);
                    if (gWd.A06) {
                        num3 = AnonymousClass05K.A0N;
                    } else {
                        num3 = AnonymousClass05K.A00;
                    }
                    r4.A03((1Xj) null, num3, str);
                }
                C228362lW r3 = gWd.A08;
                String str2 = gWd.A09;
                Integer num4 = AnonymousClass05K.A01;
                r3.A01(A002, num4, AnonymousClass05K.A02, str2);
                r3.A03(A002, num4, str2);
            }
        }
        if (num != null) {
            int intValue = num.intValue();
            C46550Dgs.A00(this.A09);
            if (AnonymousClass7TF.A1V(C51968G9o.A0z(C52524GWb.A01, intValue))) {
                02m r2 = 02m.A0p;
                r2.markerPoint(1011615852, intValue, "FIRST_ITEM_IN_RESPONSE_RENDER_FAILED");
                C52524GWb.A00(r2, intValue, 2);
            }
        }
    }

    public final void DQT(1Xj r8, Integer num, int i, int i2) {
        String id;
        Integer num2;
        0qQ.A0B(r8, 0);
        C52526GWd gWd = this.A0T;
        if (gWd != null) {
            String moduleName = this.A0F.getModuleName();
            0qQ.A0B(moduleName, 0);
            if ("explore_popular".equals(moduleName)) {
                1Xj A002 = C52526GWd.A00(r8);
                Integer num3 = null;
                if (!(A002 == null || (id = A002.getId()) == null)) {
                    if (gWd.A03.isEmpty()) {
                        C238133Ar r0 = gWd.A00;
                        if (r0 != null) {
                            num3 = Integer.valueOf(r0.AnH());
                        }
                        gWd.A01 = num3;
                    }
                    if (A002.CeS() && i == 0 && i2 == 2) {
                        gWd.A02 = id;
                    } else if (!gWd.A03.contains(id)) {
                        gWd.A03.add(id);
                        Integer num4 = gWd.A01;
                        int size = gWd.A03.size();
                        if (num4 != null && num4.intValue() == size) {
                            C228362lW r3 = gWd.A08;
                            String str = gWd.A09;
                            if (gWd.A06) {
                                num2 = AnonymousClass05K.A0N;
                            } else {
                                num2 = AnonymousClass05K.A00;
                            }
                            r3.A02((1Xj) null, num2, str);
                        }
                        if (gWd.A04.remove(id) && gWd.A04.isEmpty()) {
                            gWd.A08.A02((1Xj) null, AnonymousClass05K.A0C, gWd.A09);
                        }
                        gWd.A08.A02(A002, AnonymousClass05K.A01, gWd.A09);
                    }
                }
            }
        }
        if (num != null) {
            int intValue = num.intValue();
            C46550Dgs.A00(this.A09);
            String name = r8.BR7().name();
            if (AnonymousClass7TF.A1V(C51968G9o.A0z(C52524GWb.A01, intValue))) {
                02m r2 = 02m.A0p;
                r2.markerPoint(1011615852, intValue, "FIRST_ITEM_IN_RESPONSE_RENDERED");
                if (name != null) {
                    r2.markerAnnotate(1011615852, intValue, "FIRST_ITEM_IN_GRID_TYPE", name);
                }
                C52524GWb.A00(r2, intValue, 2);
            }
        }
    }

    public final boolean DQs(MotionEvent motionEvent, View view, C296995qz r9, 1Xj r10) {
        C232692uG r2;
        0qQ.A0B(r10, 0);
        AnonymousClass7TG.A1U(r9, view, motionEvent);
        UserSession userSession = this.A09;
        0Tu r5 = 0Tu.A05;
        if (!182.A06(r5, userSession, 36317431707866253L)) {
            if (182.A06(r5, userSession, 36312436659455088L) && r10.A50()) {
                A0A(r10.CEL());
            }
            if (C321536uL.A02(userSession) || (r2 = this.A05) == null) {
                return false;
            }
            return r2.Dsa(motionEvent, view, r10, (r9.A01 * 3) + r9.A00);
        }
        return false;
    }

    public C52530GWh(C267664bz r9, C227762js r10, 0wc r11, UserSession userSession, C14005To7 to7, GXC gxc, GWW gww, X9Q x9q, JSr jSr, C55918Hpf hpf, C55919Hpg hpg, C3723190i r20, C52526GWd gWd, C232682uF r22, C60111Jfs jfs, C231002qi r24, C230882qT r25, AnonymousClass32Q r26, C249763kK r27, String str, String str2, boolean z, boolean z2) {
        C55918Hpf hpf2 = hpf;
        C55919Hpg hpg2 = hpg;
        AnonymousClass7TG.A1U(hpf2, hpg2, userSession);
        0qQ.A0B(to7, 6);
        AnonymousClass32Q r5 = r26;
        0qQ.A0B(r5, 8);
        String str3 = str;
        DbW.A1P(r9, 9, str3);
        this.A0D = hpf2;
        this.A0S = hpg2;
        this.A09 = userSession;
        this.A0F = r22;
        this.A0P = r11;
        this.A0A = to7;
        this.A0C = jSr;
        this.A0X = r5;
        this.A0N = r9;
        this.A0Q = gxc;
        C249763kK r52 = r27;
        this.A0Y = r52;
        this.A0H = str3;
        this.A0V = r24;
        this.A0W = r25;
        this.A0Z = str2;
        this.A0a = z;
        this.A0b = z2;
        this.A0B = gww;
        this.A0E = r20;
        this.A0R = x9q;
        this.A0T = gWd;
        this.A0O = r10;
        this.A0U = jfs;
        this.A0G = r52.getSessionId();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.HnB, java.lang.Object] */
    public static C52534GWl A00(C296995qz r1, C296905qq r2, ExploreTopicCluster exploreTopicCluster, 1Xj r4) {
        ? obj = new Object();
        obj.A03 = r4;
        obj.A02 = exploreTopicCluster;
        obj.A00 = r1;
        obj.A01 = r2;
        return new C52534GWl(r1, r2, exploreTopicCluster, r4);
    }

    public static void A03(AnonymousClass0Ac r2, 0Aj r3, C52534GWl gWl, String str, String str2) {
        r3.AAJ("position", str);
        r3.AAJ("m_pk", gWl.A04);
        r3.A8M(r2, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        r3.AAJ("topic_cluster_id", str2);
    }

    public static void A04(0Aj r2, C52534GWl gWl, String str, String str2, String str3) {
        r2.AAJ("size", gWl.A07);
        r2.A8M(gWl.A00, "media_type");
        r2.AAJ("topic_cluster_type", str);
        r2.AAJ("topic_cluster_title", str2);
        r2.AAJ("inventory_source", str3);
        r2.AAJ("mezql_token", gWl.A03);
        r2.AAJ("algorithm", gWl.A01);
        r2.AAJ("connection_id", gWl.A02);
        r2.AAJ("topic_cluster_debug_info", gWl.A08);
        r2.AAJ("ranking_info_token", gWl.A06);
        r2.AAe("product_ids", gWl.A0D);
    }

    public static void A05(0Aj r1, Long l, String str, List list) {
        r1.AAe("merchant_ids", list);
        r1.AAJ("playlist_id", str);
        r1.A9F("page_num", l);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A06(X.C296995qz r10, X.C296935qt r11, X.C52530GWh r12, X.1Xj r13) {
        /*
            X.2uF r0 = r12.A0F
            X.0jB r1 = r0.E4k()
            X.0qQ.A07(r1)
            X.To7 r0 = r12.A0A
            r0.A02(r1)
            boolean r0 = r11 instanceof X.C296985qy
            r2 = 0
            if (r0 == 0) goto L_0x008a
            r0 = r11
            X.5qy r0 = (X.C296985qy) r0
            long r0 = r0.A00
        L_0x0018:
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
        L_0x001c:
            X.0wc r4 = r12.A0P
            X.5qq r3 = r11.A02
            X.5ow r8 = X.C295805ow.MEDIA
            X.GT0 r0 = r12.A0O()
            com.instagram.explore.topiccluster.ExploreTopicCluster r1 = r0.A02
            java.lang.String r9 = r12.A0G
            X.5ov r0 = r11.A03
            if (r0 == 0) goto L_0x0088
            X.5u2 r12 = r0.A06
        L_0x0030:
            r5 = 0
            if (r13 == 0) goto L_0x0037
            java.lang.String r2 = X.C51965G9l.A0t(r13)
        L_0x0037:
            r0 = 0
            X.0qQ.A0B(r4, r0)
            r6 = 2
            r0 = 6
            X.0qQ.A0B(r9, r0)
            X.GWl r10 = A00(r10, r3, r1, r13)
            java.lang.String r3 = r10.A09
            java.lang.String r11 = r10.A0B
            java.lang.String r1 = r10.A0A
            if (r12 == 0) goto L_0x005c
            java.lang.String r3 = r12.A03
            java.lang.Integer r0 = r12.A01()
            java.lang.String r11 = X.C296875qn.A00(r0)
            com.instagram.model.keyword.Keyword r0 = r12.A00()
            java.lang.String r1 = r0.A04
        L_0x005c:
            java.lang.String r0 = "explore_home_click"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r4, r0)
            X.C51967G9n.A18(r4, r9)
            java.lang.String r0 = r10.A05
            if (r0 != 0) goto L_0x006b
            java.lang.String r0 = ""
        L_0x006b:
            A03(r8, r4, r10, r0, r3)
            A04(r4, r10, r11, r1, r2)
            java.util.List r0 = r10.A0C
            r3 = 0
            if (r0 == 0) goto L_0x0096
            java.util.ArrayList r2 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x007e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0097
            X.C51972G9s.A1H(r2, r1)
            goto L_0x007e
        L_0x0088:
            r12 = r2
            goto L_0x0030
        L_0x008a:
            boolean r0 = r11 instanceof X.HAU
            if (r0 == 0) goto L_0x0094
            r0 = r11
            X.HAU r0 = (X.HAU) r0
            long r0 = r0.A00
            goto L_0x0018
        L_0x0094:
            r7 = r2
            goto L_0x001c
        L_0x0096:
            r2 = r5
        L_0x0097:
            A05(r4, r7, r5, r2)
            if (r13 == 0) goto L_0x00af
            X.1Xy r0 = r13.A0C
            com.instagram.api.schemas.ThumbnailInteractionType r0 = r0.C70()
            if (r0 == 0) goto L_0x00af
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x00bd
            if (r1 != r6) goto L_0x00af
            java.lang.String r3 = "reshares"
        L_0x00af:
            java.lang.String r0 = "social_proof_interaction_type"
            r4.AAJ(r0, r3)
            java.lang.String r0 = "content_source_type"
            r4.AAJ(r0, r5)
            r4.Cgf()
            return
        L_0x00bd:
            java.lang.String r3 = "likes"
            goto L_0x00af
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52530GWh.A06(X.5qz, X.5qt, X.GWh, X.1Xj):void");
    }

    private final void A07(DiscoveryChainingConfig discoveryChainingConfig) {
        C309516Yo A002 = C54974Ha7.A00(this.A0D.A00.requireActivity(), this.A09);
        A002.A0D(Ha1.A00(discoveryChainingConfig));
        A002.A07 = this.A0N;
        A002.A04();
        if (this.A04 == null) {
            0qQ.A0F("viewController");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A09(X.1Xj r12, java.lang.String r13, boolean r14, boolean r15) {
        /*
            r11 = this;
            com.instagram.common.session.UserSession r3 = r11.A09
            X.0Tu r2 = X.0Tu.A05
            r0 = 36312436659192940(0x8101f80000046c, double:3.027469389495177E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0016
            X.3WR r0 = r12.CEL()
            r11.A0A(r0)
        L_0x0016:
            r4 = 0
            if (r14 == 0) goto L_0x0028
            java.lang.String r1 = r12.A30()
            if (r1 == 0) goto L_0x00eb
            java.lang.String r0 = "explore"
            X.1OC r0 = X.C3724090s.A05(r3, r1, r0, r4)
            X.1ES.A03(r0)
        L_0x0028:
            X.90i r10 = r11.A0E
            boolean r9 = r10.A05
            boolean r0 = r12.CcK()
            if (r0 == 0) goto L_0x00d5
            r0 = 0
            X.0qQ.A0B(r3, r0)
            r0 = 36328620096568805(0x8110b000093de5, double:3.037703860457146E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x00d5
            com.instagram.clips.intf.ClipsViewerSource r1 = com.instagram.clips.intf.ClipsViewerSource.EXPLORE_GRID_AD_FEED_OF_ADS
        L_0x0043:
            X.Hpf r8 = r11.A0D
            X.32L r0 = r8.A00
            androidx.fragment.app.FragmentActivity r6 = r0.requireActivity()
            X.4h3 r5 = X.C51965G9l.A0i(r1, r3)
            r5.A1B = r13
            java.lang.String r0 = r12.getId()
            r5.A1C = r0
            r7 = 0
            r5.A1c = r7
            if (r9 == 0) goto L_0x00b3
            com.instagram.explore.topiccluster.ExploreTopicCluster r1 = r10.A00
            if (r1 == 0) goto L_0x0068
            java.lang.String r0 = r1.A0A
            r5.A0n = r0
            java.lang.String r0 = r1.A06
            r5.A0r = r0
        L_0x0068:
            boolean r0 = r12.CcK()
            if (r0 == 0) goto L_0x0094
            X.0qQ.A0B(r3, r7)
            r0 = 36328620096568805(0x8110b000093de5, double:3.037703860457146E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0094
            X.3lZ r0 = X.C51966G9m.A0w(r12)
            if (r0 == 0) goto L_0x00b1
            java.lang.String r0 = r0.AZ4()
        L_0x0086:
            r5.A17 = r0
            X.3lZ r0 = X.C51966G9m.A0w(r12)
            if (r0 == 0) goto L_0x0092
            java.lang.String r4 = r0.C9L()
        L_0x0092:
            r5.A1A = r4
        L_0x0094:
            com.instagram.model.mediatype.ProductType r1 = r12.A1v()
            com.instagram.model.mediatype.ProductType r0 = com.instagram.model.mediatype.ProductType.CLIPS
            if (r1 == r0) goto L_0x00ad
            boolean r0 = r12.CcK()
            if (r0 != 0) goto L_0x00ad
            r0 = 36328620096634342(0x8110b0000a3de6, double:3.037703860498592E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r5.A1f = r0
        L_0x00ad:
            X.DbU.A1M(r6, r5, r3)
            return
        L_0x00b1:
            r0 = r4
            goto L_0x0086
        L_0x00b3:
            r0 = 36328620096306657(0x8110b000053de1, double:3.0377038602913626E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0068
            r1 = 2131961860(0x7f132804, float:1.9560429E38)
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.String r0 = r8.A00(r1, r0)
            r5.A0n = r0
            r1 = 2131961859(0x7f132803, float:1.9560427E38)
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.String r0 = r8.A00(r1, r0)
            r5.A0o = r0
            goto L_0x0068
        L_0x00d5:
            if (r15 == 0) goto L_0x00e1
            if (r9 == 0) goto L_0x00dd
            com.instagram.clips.intf.ClipsViewerSource r1 = com.instagram.clips.intf.ClipsViewerSource.EXPLORE_INTEREST_DEFAULT_UNIT
            goto L_0x0043
        L_0x00dd:
            com.instagram.clips.intf.ClipsViewerSource r1 = com.instagram.clips.intf.ClipsViewerSource.EXPLORE_POPULAR_DEFAULT_UNIT
            goto L_0x0043
        L_0x00e1:
            if (r9 == 0) goto L_0x00e7
            com.instagram.clips.intf.ClipsViewerSource r1 = com.instagram.clips.intf.ClipsViewerSource.EXPLORE_INTEREST_MINOR_UNIT
            goto L_0x0043
        L_0x00e7:
            com.instagram.clips.intf.ClipsViewerSource r1 = com.instagram.clips.intf.ClipsViewerSource.EXPLORE_POPULAR_MINOR_UNIT
            goto L_0x0043
        L_0x00eb:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52530GWh.A09(X.1Xj, java.lang.String, boolean, boolean):void");
    }

    private final void A0A(AnonymousClass3WR r5) {
        AnonymousClass4U8 r1 = new AnonymousClass4U8(this.A0D.A00.requireActivity(), this.A09, r5, this.A0F.getModuleName());
        r1.A02 = true;
        r1.A01 = G9t.A1b(this.A0I);
        AnonymousClass4UA.A00(r1.A00());
    }

    public final void A0C(View view) {
        if (!this.A08) {
            C230882qT r2 = this.A0W;
            if (r2 != null) {
                r2.A00(view, QPTooltipAnchor.EXPLORE_GRID_1X2, this.A0V);
            }
            this.A08 = true;
        }
    }

    public final void A0D(View view, C296995qz r16, C296935qt r17, 1Xj r18) {
        C45282Ctl ctl;
        String str;
        0qQ.A0B(view, 3);
        HAV hav = (HAV) r17;
        C45216CsU csU = hav.A01;
        String str2 = null;
        if (csU != null && (ctl = csU.A00) != null) {
            A0P(ctl.A01);
            0wc r2 = this.A0P;
            C45282Ctl ctl2 = csU.A00;
            if (ctl2 != null) {
                str = ctl2.A00;
            } else {
                str = null;
            }
            if (str == null) {
                throw AnonymousClass7TE.A0w("Required value was null.");
            } else if (ctl2 != null) {
                String str3 = ctl2.A01;
                ExploreTopicCluster exploreTopicCluster = A0O().A02;
                if (exploreTopicCluster != null) {
                    str2 = exploreTopicCluster.A05;
                }
                String moduleName = this.A0F.getModuleName();
                1Xj r5 = hav.A02;
                if (r5 != null) {
                    String mezqlToken = r5.A0C.getMezqlToken();
                    String B2y = r5.A0C.B2y();
                    String A2n = r5.A2n();
                    if (A2n != null) {
                        long parseLong = Long.parseLong(A2n);
                        Long valueOf = Long.valueOf(hav.A00);
                        DbW.A1N(r2, 0, moduleName);
                        0Aj A0e = AnonymousClass7TE.A0e(r2, "explore_topic_tile_click");
                        DbS.A1O(A0e, moduleName);
                        A0e.AAJ("topic_cluster_id", str);
                        A0e.AAJ("topic_cluster_type", "interest_keyword");
                        A0e.AAJ("topic_cluster_title", str3);
                        A0e.A9F("media_type", C51971G9r.A0m());
                        A0e.A9F("media_igid", Long.valueOf(parseLong));
                        C51965G9l.A1K(A0e, "");
                        A0e.AAJ("explore_source_token", B2y);
                        A0e.A9F("page_num", valueOf);
                        A0e.AAJ("mezql_token", mezqlToken);
                        A0e.AAJ("topic_cluster_debug_info", str2);
                        A0e.Cgf();
                        return;
                    }
                }
                throw AnonymousClass7TE.A0w("Required value was null.");
            } else {
                throw AnonymousClass7TE.A0w("Required value was null.");
            }
        }
    }

    public final void A0G(View view, C296995qz r49, HAS has) {
        C298795u2 r9;
        ArrayList arrayList;
        VideoFeedType videoFeedType;
        boolean z;
        String str;
        0qQ.A0B(view, 2);
        C55918Hpf hpf = this.A0D;
        C55918Hpf hpf2 = hpf;
        if (AnonymousClass06S.A01(hpf.A00.getParentFragmentManager())) {
            HAS has2 = has;
            1Xj r0 = has2.A01;
            UserSession userSession = this.A09;
            if (C321536uL.A02(userSession)) {
                C321536uL.A01(userSession, r0, true);
                return;
            }
            C232682uF r43 = this.A0F;
            0jB E4k = r43.E4k();
            0qQ.A07(E4k);
            C14005To7 to7 = this.A0A;
            to7.A02(E4k);
            0wc r13 = this.A0P;
            C296905qq r4 = has2.A02;
            C295805ow r11 = C295805ow.CHANNEL;
            ExploreTopicCluster exploreTopicCluster = A0O().A02;
            String str2 = this.A0G;
            C295795ov r6 = has2.A03;
            if (r6 != null) {
                r9 = r6.A06;
            } else {
                r9 = null;
            }
            Long valueOf = Long.valueOf(has2.A00);
            String A0t = C51965G9l.A0t(r0);
            0qQ.A0B(r13, 0);
            0qQ.A0B(str2, 6);
            C296995qz r10 = r49;
            C52534GWl A002 = A00(r10, r4, exploreTopicCluster, r0);
            String str3 = A002.A09;
            String str4 = A002.A0B;
            String str5 = A002.A0A;
            if (r9 != null) {
                str3 = r9.A03;
                str4 = C296875qn.A00(r9.A01());
                str5 = r9.A00().A04;
            }
            0Aj A0e = AnonymousClass7TE.A0e(r13, "explore_home_click");
            C51967G9n.A18(A0e, str2);
            String str6 = A002.A05;
            if (str6 == null) {
                str6 = "";
            }
            A03(r11, A0e, A002, str6, str3);
            A04(A0e, A002, str4, str5, A0t);
            List list = A002.A0C;
            if (list != null) {
                arrayList = AnonymousClass7TF.A0p(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C51972G9s.A1H(arrayList, it);
                }
            } else {
                arrayList = null;
            }
            A05(A0e, valueOf, (String) null, arrayList);
            A0e.AAJ("social_proof_interaction_type", A02(r0));
            A0e.AAJ("content_source_type", (String) null);
            String str7 = has2.A05;
            A0e.AAJ("endpoint_type", str7);
            A0e.Cgf();
            0Tu r92 = 0Tu.A05;
            if (182.A06(r92, userSession, 36312436659324014L) && r0.A50()) {
                A0A(r0.CEL());
            }
            String id = r0.getId();
            if (id != null) {
                String A0r = C51972G9s.A0r(userSession, r0);
                C54664HMv hMv = C54664HMv.A05;
                int i = r0.BR7().A00;
                String B2y = r0.A0C.B2y();
                C57098IOm A003 = Ha0.A00(userSession);
                String str8 = this.A0H;
                0qQ.A0B(str8, 0);
                String A11 = DbT.A11(str8, A003.A00);
                String A2R = r0.A2R();
                String A2v = r0.A2v();
                String A0t2 = DbX.A0t(r0.A3e());
                if (has2.A02 == AnonymousClass05K.A01) {
                    videoFeedType = VideoFeedType.EXPLORE_IGTV_PREVIEW;
                    if (!0qQ.A0K(str7, "igtv_preview")) {
                        if (str7.equals("serp_videos")) {
                            videoFeedType = VideoFeedType.KEYWORD_CHANNEL;
                        } else {
                            videoFeedType = VideoFeedType.EXPLORE_CHANNEL;
                        }
                    }
                } else {
                    videoFeedType = VideoFeedType.EXPLORE_MEDIA_VIDEO_CHAINING;
                }
                String A022 = has2.getKey();
                int size = C51967G9n.A0s(new Object[]{videoFeedType, A022, str7}).size();
                if (size == 0) {
                    z = false;
                } else if (size == 3) {
                    z = true;
                } else {
                    throw AnonymousClass7TE.A0w("All channel-related arguments must be provided");
                }
                DiscoveryChainingItem discoveryChainingItem = new DiscoveryChainingItem(hMv, videoFeedType, (Boolean) null, (Integer) null, id, A0r, B2y, A11, (String) null, str8, (String) null, A022, str7, A2R, A2v, A0t2, (String) null, (String) null, (String) null, i, z);
                String str9 = has2.A04;
                boolean z2 = this.A0b;
                String str10 = str9;
                if (this.A0E.A05) {
                    str = "interest_explore";
                } else if (z2) {
                    str = "reshare_hub";
                } else {
                    str = "topical_explore";
                }
                if (str9 == null) {
                    str10 = this.A0C.ArD();
                }
                String moduleName = r43.getModuleName();
                DbW.A1N(str10, 2, moduleName);
                0sl r35 = 0sl.A00;
                ExploreTopicCluster exploreTopicCluster2 = A0O().A02;
                Bundle A0a2 = AnonymousClass7TE.A0a();
                to7.A01(A0a2);
                String A012 = A01(r92, userSession, hpf2);
                GWY gwy = this.A04;
                if (gwy != null) {
                    ExploreTopicCluster exploreTopicCluster3 = exploreTopicCluster2;
                    Bundle bundle = A0a2;
                    DiscoveryChainingConfig discoveryChainingConfig = new DiscoveryChainingConfig(bundle, discoveryChainingItem, exploreTopicCluster3, Integer.valueOf((r10.A01 * 3) + r10.A00), (Integer) null, str10, str, str2, moduleName, (String) null, this.A0Z, (String) null, (String) null, A012, (String) null, (HashMap) null, r35, true, true, false, false, true, false, false, false, false, false, gwy.A02);
                    if (this.A0a) {
                        A08(discoveryChainingConfig);
                    } else {
                        A07(discoveryChainingConfig);
                    }
                } else {
                    0qQ.A0F("viewController");
                    throw AnonymousClass00P.createAndThrow();
                }
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
    }

    public final void A0K(ExploreTopicCluster exploreTopicCluster) {
        String string;
        Context context = this.A00;
        if (context != null && (string = context.getString(2131975944)) != null) {
            C310336ap A0a2 = DbS.A0a();
            A0a2.A0D = string;
            A0a2.A05();
            A0a2.A0H = "follow_interest_failure";
            DbY.A1N(A0a2);
        }
    }

    public final GT0 A0O() {
        GT0 gt0 = this.A03;
        if (gt0 != null) {
            return gt0;
        }
        0qQ.A0F("dataStore");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A0P(String str) {
        C309516Yo A0Q2 = DbU.A0Q(this.A0D.A00.requireActivity(), this.A09);
        C14398TvR.A00();
        A0Q2.A0B((Bundle) null, C14452Twa.A01(AnonymousClass7TG.A0j(), str, this.A0F.getModuleName(), (String) null, (String) null, "0", (String) null, (String) null, true));
        A0Q2.A04();
    }

    public final boolean BVc() {
        return ((C52529GWg) this.A0S.A00.A0t.getValue()).A04();
    }

    public final AnonymousClass339 CGA() {
        C249763kK r10 = this.A0Y;
        Fragment fragment = this.A0D.A00;
        UserSession userSession = this.A09;
        View view = this.A01;
        if (view != null) {
            X9Q x9q = this.A0R;
            C238133Ar r9 = this.A06;
            C232682uF r7 = this.A0F;
            return new C377989Oa(view, fragment, this.A0O, userSession, x9q, r7, new AnonymousClass338(fragment, (C227762js) null, userSession, r7, (AnonymousClass2xS) null, (AnonymousClass4DV) null, r10, AnonymousClass337.EXPLORE_GRID_WATCH_AND_BROWSE), r9, r10);
        }
        0qQ.A0F("rootView");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x014e, code lost:
        if (r50 != null) goto L_0x00c3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x052d  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x0531  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DJt(android.view.View r47, X.C296995qz r48, X.C296935qt r49, X.1Xj r50) {
        /*
            r46 = this;
            r2 = r49
            r3 = 0
            r10 = r48
            int r21 = X.DbW.A02(r3, r2, r10)
            r11 = 3
            r0 = r47
            X.0qQ.A0B(r0, r11)
            r0 = r46
            X.Hpf r9 = r0.A0D
            X.32L r8 = r9.A00
            X.0hq r1 = r8.getParentFragmentManager()
            boolean r1 = X.AnonymousClass06S.A01(r1)
            if (r1 == 0) goto L_0x002f
            r7 = 1
            r1 = r50
            if (r50 == 0) goto L_0x0030
            com.instagram.common.session.UserSession r5 = r0.A09
            boolean r4 = X.C321536uL.A02(r5)
            if (r4 == 0) goto L_0x0030
            X.C321536uL.A01(r5, r1, r7)
        L_0x002f:
            return
        L_0x0030:
            X.GWg r14 = r0.A02
            java.lang.String r20 = "Required value was null."
            if (r50 == 0) goto L_0x0085
            if (r14 == 0) goto L_0x0085
            java.lang.String r13 = r1.getId()
            if (r13 == 0) goto L_0x0152
            boolean r4 = r14.A04()
            if (r4 == 0) goto L_0x0085
            r14.A01 = r13
            java.util.Map r12 = r14.A0A
            java.util.Map r4 = X.0Yt.A0B(r12)
            java.util.Iterator r19 = X.DbV.A16(r4)
        L_0x0050:
            boolean r4 = r19.hasNext()
            if (r4 == 0) goto L_0x0082
            java.lang.String r6 = X.AnonymousClass7TE.A18(r19)
            java.lang.Number r4 = X.C51966G9m.A14(r6, r12)
            if (r4 == 0) goto L_0x0050
            long r17 = r4.longValue()
            java.util.concurrent.TimeUnit r15 = java.util.concurrent.TimeUnit.SECONDS
            X.0eM r4 = r14.A0D
            java.lang.Object r4 = X.AnonymousClass7TE.A14(r4)
            long r4 = X.AnonymousClass7TE.A0R(r4)
            long r4 = r15.toMillis(r4)
            long r17 = r17 + r4
            long r15 = java.lang.System.currentTimeMillis()
            int r4 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r4 >= 0) goto L_0x0050
            X.C52529GWg.A01(r14, r6)
            goto L_0x0050
        L_0x0082:
            r12.remove(r13)
        L_0x0085:
            A06(r10, r2, r0, r1)
            if (r50 == 0) goto L_0x0096
            com.instagram.common.session.UserSession r4 = r0.A09
            X.2cc r5 = X.C71342cb.A00(r4)
            java.lang.String r4 = r1.A2n()
            r5.A07 = r4
        L_0x0096:
            boolean r6 = r2 instanceof X.C52435GSn
            if (r6 == 0) goto L_0x014e
            com.instagram.common.session.UserSession r13 = r0.A09
            X.0Tu r12 = X.0Tu.A06
            r4 = 36320365168828779(0x81092e0000216b, double:3.0324834109144276E-306)
            boolean r4 = X.182.A06(r12, r13, r4)
            if (r4 == 0) goto L_0x014e
            if (r50 == 0) goto L_0x0175
            X.1Xy r4 = r1.A0C
            X.4xI r4 = r4.Aq4()
            if (r4 == 0) goto L_0x00c3
            java.util.List r5 = r4.AiA()
            if (r5 == 0) goto L_0x00c3
            boolean r4 = r5 instanceof java.util.Collection
            if (r4 == 0) goto L_0x010a
            boolean r4 = r5.isEmpty()
            if (r4 == 0) goto L_0x010a
        L_0x00c3:
            com.instagram.model.mediatype.ProductType r5 = r1.A1v()
            com.instagram.model.mediatype.ProductType r4 = com.instagram.model.mediatype.ProductType.CLIPS
            if (r5 != r4) goto L_0x00e6
            com.instagram.common.session.UserSession r13 = r0.A09
            X.0Tu r12 = X.0Tu.A05
            r4 = 36316061611593617(0x81054400000f91, double:3.029761823989877E-306)
        L_0x00d4:
            boolean r4 = X.182.A06(r12, r13, r4)
            if (r4 == 0) goto L_0x0157
            boolean r3 = r1.A4R()
            java.lang.String r2 = r2.getKey()
            r0.A09(r1, r2, r3, r7)
            return
        L_0x00e6:
            boolean r4 = r1.CcK()
            if (r4 == 0) goto L_0x0100
            X.5qq r5 = r2.A02
            int r4 = r5.A04
            if (r4 != r7) goto L_0x0100
            int r4 = r5.A02
            if (r4 != r7) goto L_0x0100
            com.instagram.common.session.UserSession r13 = r0.A09
            X.0Tu r12 = X.0Tu.A05
            r4 = 36328620096175583(0x8110b000033ddf, double:3.037703860208471E-306)
            goto L_0x00d4
        L_0x0100:
            com.instagram.common.session.UserSession r13 = r0.A09
            X.0Tu r12 = X.0Tu.A05
            r4 = 36328620096110046(0x8110b000023dde, double:3.037703860167025E-306)
            goto L_0x00d4
        L_0x010a:
            java.util.Iterator r12 = r5.iterator()
        L_0x010e:
            boolean r4 = r12.hasNext()
            if (r4 == 0) goto L_0x00c3
            java.lang.Object r4 = r12.next()
            X.4xG r4 = (X.C278624xG) r4
            com.instagram.api.schemas.IGConsiderAndBrowseType r5 = r4.CGB()
            com.instagram.api.schemas.IGConsiderAndBrowseType r4 = com.instagram.api.schemas.IGConsiderAndBrowseType.EXPLORE_GRID_TILE_TAP_AND_BROWSE
            if (r5 != r4) goto L_0x010e
            boolean r4 = r2 instanceof X.HAP
            if (r4 == 0) goto L_0x00c3
            boolean r4 = r1.CcK()
            if (r4 == 0) goto L_0x00c3
            boolean r4 = r1.A5F()
            if (r4 != 0) goto L_0x00c3
            boolean r4 = r1.CeS()
            if (r4 != 0) goto L_0x00c3
            boolean r4 = r2 instanceof X.C14348TuX
            if (r4 != 0) goto L_0x00c3
            X.GSn r2 = (X.C52435GSn) r2
            X.3W1 r2 = r2.A00
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            java.lang.Integer r0 = r2.A13
            if (r0 == r1) goto L_0x002f
            r2.A13 = r1
            r0 = 50
            X.AnonymousClass3W1.A00(r2, r0)
            return
        L_0x014e:
            if (r50 == 0) goto L_0x0175
            goto L_0x00c3
        L_0x0152:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r20)
            throw r0
        L_0x0157:
            boolean r4 = r2 instanceof X.C14348TuX
            if (r4 == 0) goto L_0x0175
            X.0qQ.A0B(r13, r3)
            boolean r4 = r2 instanceof X.C15945UlF
            if (r4 == 0) goto L_0x0175
            r4 = 36315902700031664(0x81051f00220eb0, double:3.0296613276782126E-306)
            boolean r4 = X.182.A06(r12, r13, r4)
            if (r4 == 0) goto L_0x0175
            java.lang.String r2 = r2.getKey()
            r0.A09(r1, r2, r3, r3)
            return
        L_0x0175:
            com.instagram.model.keyword.Keyword r22 = X.C18243VoA.A00(r2)
            if (r22 == 0) goto L_0x02f3
            if (r50 == 0) goto L_0x0311
            r0.A0O()
            X.GT0 r4 = r0.A0O()
            java.lang.String r3 = "null cannot be cast to non-null type com.instagram.explore.repository.ExploreDataStore"
            X.0qQ.A0C(r4, r3)
            java.lang.String r13 = r4.A05
            androidx.fragment.app.FragmentActivity r17 = r8.requireActivity()
            com.instagram.common.session.UserSession r12 = r0.A09
            X.2uF r8 = r0.A0F
            java.lang.String r24 = r8.getModuleName()
            java.lang.String r23 = X.AnonymousClass7TG.A0j()
            X.GWW r0 = r0.A0B
            if (r0 == 0) goto L_0x02ca
            X.GWV r3 = r0.A01
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            boolean r0 = r2 instanceof X.C296985qy
            if (r0 == 0) goto L_0x02d8
            X.5ov r0 = r2.A03
            r6 = 0
            if (r0 == 0) goto L_0x01e1
            X.5u2 r0 = r0.A06
            if (r0 == 0) goto L_0x01e1
            java.lang.String r4 = r0.A03
        L_0x01b4:
            java.util.List r0 = r3.A03
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r5 = r0.iterator()
        L_0x01be:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x01e3
            java.lang.Object r3 = r5.next()
            r0 = r3
            X.5r0 r0 = (X.C297005r0) r0
            X.5ov r0 = r0.A01
            if (r0 == 0) goto L_0x01df
            X.5u2 r0 = r0.A06
            if (r0 == 0) goto L_0x01df
            java.lang.String r0 = r0.A03
        L_0x01d5:
            boolean r0 = X.0qQ.A0K(r0, r4)
            if (r0 == 0) goto L_0x01be
            r11.add(r3)
            goto L_0x01be
        L_0x01df:
            r0 = r6
            goto L_0x01d5
        L_0x01e1:
            r4 = r6
            goto L_0x01b4
        L_0x01e3:
            int r10 = r11.size()
            r7 = 0
        L_0x01e8:
            if (r7 >= r10) goto L_0x02d8
            java.lang.Object r6 = r11.get(r7)
            X.5r0 r6 = (X.C297005r0) r6
            java.util.List r0 = r6.A02
            int r5 = r0.size()
            r4 = 0
        L_0x01f7:
            if (r4 >= r5) goto L_0x022e
            java.util.List r3 = r6.A02
            java.lang.Object r0 = r3.get(r4)
            boolean r0 = X.0qQ.A0K(r0, r2)
            if (r0 == 0) goto L_0x022b
            int r0 = r3.size()
            X.2HY r0 = X.C229632nm.A0C(r4, r0)
            java.util.List r0 = X.00k.A0i(r3, r0)
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r4 = r0.iterator()
        L_0x0219:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0231
            java.lang.Object r2 = r4.next()
            boolean r0 = r2 instanceof X.C296985qy
            if (r0 == 0) goto L_0x0219
            r3.add(r2)
            goto L_0x0219
        L_0x022b:
            int r4 = r4 + 1
            goto L_0x01f7
        L_0x022e:
            int r7 = r7 + 1
            goto L_0x01e8
        L_0x0231:
            java.util.ArrayList r2 = X.AnonymousClass7TF.A0p(r3)
            java.util.Iterator r3 = r3.iterator()
        L_0x0239:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0256
            java.lang.Object r0 = r3.next()
            X.5qy r0 = (X.C296985qy) r0
            X.1Xj r0 = r0.A01
            java.lang.String r0 = r0.getId()
            if (r0 == 0) goto L_0x0251
            r2.add(r0)
            goto L_0x0239
        L_0x0251:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r20)
            throw r0
        L_0x0256:
            r9.addAll(r2)
            int r0 = X.C51966G9m.A06(r11)
            if (r7 >= r0) goto L_0x02d8
            int r2 = r7 + 1
            int r0 = r11.size()
            X.2HY r0 = X.C229632nm.A0C(r2, r0)
            java.util.List r0 = X.00k.A0i(r11, r0)
            java.util.ArrayList r3 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x0275:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0287
            java.lang.Object r0 = r2.next()
            X.5r0 r0 = (X.C297005r0) r0
            java.util.List r0 = r0.A02
            r3.add(r0)
            goto L_0x0275
        L_0x0287:
            java.util.ArrayList r0 = X.0Yv.A1F(r3)
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r0.iterator()
        L_0x0293:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x02a5
            java.lang.Object r2 = r3.next()
            boolean r0 = r2 instanceof X.C296985qy
            if (r0 == 0) goto L_0x0293
            r4.add(r2)
            goto L_0x0293
        L_0x02a5:
            java.util.ArrayList r3 = X.AnonymousClass7TF.A0p(r4)
            java.util.Iterator r2 = r4.iterator()
        L_0x02ad:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02d5
            java.lang.Object r0 = r2.next()
            X.5qy r0 = (X.C296985qy) r0
            X.1Xj r0 = r0.A01
            java.lang.String r0 = r0.getId()
            if (r0 == 0) goto L_0x02c5
            r3.add(r0)
            goto L_0x02ad
        L_0x02c5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r20)
            throw r0
        L_0x02ca:
            java.lang.String r0 = r1.getId()
            if (r0 == 0) goto L_0x02ee
            java.util.List r9 = X.AnonymousClass7TE.A1I(r0)
            goto L_0x02d8
        L_0x02d5:
            r9.addAll(r3)
        L_0x02d8:
            boolean r28 = X.C55141Hcp.A00(r12)
            r19 = 0
            r21 = r1
            r25 = r13
            r26 = r19
            r27 = r9
            r18 = r12
            r20 = r8
            X.C18243VoA.A01(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return
        L_0x02ee:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r20)
            throw r0
        L_0x02f3:
            if (r50 == 0) goto L_0x0311
            com.instagram.common.session.UserSession r12 = r0.A09
            X.0Tu r8 = X.0Tu.A05
            r4 = 36312436659389551(0x8101f80003046f, double:3.027469389619515E-306)
            boolean r4 = X.182.A06(r8, r12, r4)
            if (r4 == 0) goto L_0x0311
            boolean r4 = r1.A50()
            if (r4 == 0) goto L_0x0311
            X.3WR r4 = r1.CEL()
            r0.A0A(r4)
        L_0x0311:
            r4 = 817903268(0x30c036a4, float:1.3985368E-9)
            if (r50 == 0) goto L_0x054b
            com.instagram.common.session.UserSession r5 = r0.A09
            com.instagram.user.model.User r8 = r1.A2A(r5)
            if (r8 != 0) goto L_0x032e
            X.0wj r3 = X.0wj.A01
            java.lang.String r2 = "ExploreGridDelegate: clicked media has null author id, media id is "
            java.lang.String r0 = r1.getId()
            java.lang.String r0 = X.002.A0R(r2, r0)
            X.DbT.A1Q(r3, r0, r4)
            return
        L_0x032e:
            java.lang.String r28 = r1.getId()
            if (r28 == 0) goto L_0x0546
            java.lang.String r29 = X.C51972G9s.A0r(r5, r1)
            r22 = 0
            r12 = 0
            r14 = 0
            r13 = 0
            X.HMv r24 = X.C54664HMv.A05
            X.1iA r4 = r1.BR7()
            int r15 = r4.A00
            X.1Xy r4 = r1.A0C
            java.lang.String r30 = r4.B2y()
            X.IOm r4 = X.Ha0.A00(r5)
            java.lang.String r8 = r0.A0H
            X.0qQ.A0B(r8, r3)
            java.util.Map r4 = r4.A00
            java.lang.String r31 = X.DbT.A11(r8, r4)
            java.lang.String r37 = r1.A2R()
            java.lang.String r38 = r1.A2v()
            java.util.List r1 = r1.A3e()
            java.lang.String r39 = X.DbX.A0t(r1)
            if (r6 == 0) goto L_0x0372
            X.GSn r2 = (X.C52435GSn) r2
            java.lang.String r14 = r2.A06
            java.lang.String r13 = r2.A07
        L_0x0372:
            X.90i r4 = r0.A0E
            boolean r2 = r4.A05
            r1 = 0
            if (r2 == 0) goto L_0x037f
            com.instagram.explore.topiccluster.ExploreTopicCluster r6 = r4.A00
            if (r6 == 0) goto L_0x037f
            java.lang.String r12 = r6.A06
        L_0x037f:
            int r6 = X.C51973G9u.A00()
            if (r6 == 0) goto L_0x043d
            if (r6 != r11) goto L_0x053f
            r44 = 1
        L_0x0389:
            com.instagram.discovery.chaining.model.DiscoveryChainingItem r19 = new com.instagram.discovery.chaining.model.DiscoveryChainingItem
            r23 = r19
            r25 = r1
            r26 = r1
            r27 = r1
            r32 = r1
            r33 = r8
            r34 = r1
            r35 = r1
            r36 = r1
            r40 = r13
            r41 = r14
            r42 = r12
            r43 = r15
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)
            if (r2 == 0) goto L_0x042e
            com.instagram.explore.topiccluster.ExploreTopicCluster r4 = r4.A00
            if (r4 == 0) goto L_0x03b0
            java.lang.String r1 = r4.A0A
        L_0x03b0:
            boolean r4 = r0.A0b
            if (r2 == 0) goto L_0x0426
            java.lang.String r24 = "interest_explore"
        L_0x03b6:
            if (r1 != 0) goto L_0x03be
            X.JSr r1 = r0.A0C
            java.lang.String r1 = r1.ArD()
        L_0x03be:
            java.lang.String r11 = r0.A0G
            X.2uF r2 = r0.A0F
            java.lang.String r4 = r2.getModuleName()
            r2 = r21
            X.C51973G9u.A0r(r2, r1, r11, r4)
            X.0sl r14 = X.0sl.A00
            r34 = r14
            X.GT0 r2 = r0.A0O()
            com.instagram.explore.topiccluster.ExploreTopicCluster r13 = r2.A02
            X.To7 r6 = r0.A0A
            android.os.Bundle r2 = X.DbV.A0B(r6, r3)
            r6.A01(r2)
            X.0Tu r6 = X.0Tu.A05
            java.lang.String r31 = A01(r6, r5, r9)
            X.GWY r5 = r0.A04
            if (r5 == 0) goto L_0x0535
            boolean r12 = r5.A02
            java.lang.String r6 = r0.A0Z
            int r5 = r10.A01
            int r8 = r10.A00
            int r5 = r5 * 3
            int r5 = r5 + r8
            java.lang.Integer r21 = java.lang.Integer.valueOf(r5)
            if (r6 != 0) goto L_0x03fa
            r7 = 0
        L_0x03fa:
            X.0eM r5 = r0.A0K
            boolean r5 = X.G9t.A1b(r5)
            r30 = 0
            if (r5 == 0) goto L_0x0441
            X.GWW r5 = r0.A0B
            if (r5 == 0) goto L_0x04fc
            X.GWV r5 = r5.A01
            java.util.List r5 = r5.A02
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r10 = r5.iterator()
        L_0x0414:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L_0x04e5
            java.lang.Object r8 = r10.next()
            boolean r5 = r8 instanceof X.C296985qy
            if (r5 == 0) goto L_0x0414
            r9.add(r8)
            goto L_0x0414
        L_0x0426:
            if (r4 == 0) goto L_0x042b
            java.lang.String r24 = "reshare_hub"
            goto L_0x03b6
        L_0x042b:
            java.lang.String r24 = "topical_explore"
            goto L_0x03b6
        L_0x042e:
            java.lang.String r4 = r0.A0Z
            if (r4 == 0) goto L_0x03b0
            r4 = 2131972269(0x7f1350ad, float:1.958154E38)
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r1 = r9.A00(r4, r1)
            goto L_0x03b0
        L_0x043d:
            r44 = 0
            goto L_0x0389
        L_0x0441:
            X.0eM r5 = r0.A0J
            boolean r5 = X.G9t.A1b(r5)
            if (r5 == 0) goto L_0x047d
            X.GWW r5 = r0.A0B
            if (r5 == 0) goto L_0x04fc
            X.GWV r5 = r5.A01
            java.util.List r5 = r5.A02
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r10 = r5.iterator()
        L_0x0459:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L_0x046b
            java.lang.Object r8 = r10.next()
            boolean r5 = r8 instanceof X.C52435GSn
            if (r5 == 0) goto L_0x0459
            r9.add(r8)
            goto L_0x0459
        L_0x046b:
            java.lang.Object r8 = X.00k.A0I(r9)
            java.lang.String r5 = "null cannot be cast to non-null type com.instagram.discovery.recyclerview.model.AdsGridItemViewModel"
            X.0qQ.A0C(r8, r5)
            X.GSn r8 = (X.C52435GSn) r8
            if (r8 == 0) goto L_0x04fc
            X.1Xj r5 = r8.BPf()
            goto L_0x04f6
        L_0x047d:
            X.0eM r5 = r0.A0M
            boolean r5 = X.G9t.A1b(r5)
            if (r5 != 0) goto L_0x048d
            X.0eM r5 = r0.A0L
            boolean r5 = X.G9t.A1b(r5)
            if (r5 == 0) goto L_0x04fc
        L_0x048d:
            X.GWW r5 = r0.A0B
            if (r5 == 0) goto L_0x04e2
            X.GWV r5 = r5.A01
            java.util.List r5 = r5.A02
            java.util.List r5 = X.0jo.A1G(r5)
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r10 = r5.iterator()
        L_0x04a1:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L_0x04b3
            java.lang.Object r8 = r10.next()
            boolean r5 = r8 instanceof X.C296985qy
            if (r5 == 0) goto L_0x04a1
            r9.add(r8)
            goto L_0x04a1
        L_0x04b3:
            r5 = 100
            java.util.List r5 = X.00k.A0d(r9, r5)
            java.util.ArrayList r8 = X.AnonymousClass7TG.A0r(r5)
            java.util.Iterator r9 = r5.iterator()
        L_0x04c1:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto L_0x04de
            java.lang.Object r5 = r9.next()
            X.5qy r5 = (X.C296985qy) r5
            X.1Xj r5 = r5.A01
            java.lang.String r5 = r5.getId()
            if (r5 == 0) goto L_0x04d9
            r8.add(r5)
            goto L_0x04c1
        L_0x04d9:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r20)
            throw r0
        L_0x04de:
            java.util.Set r14 = X.00k.A0k(r8)
        L_0x04e2:
            r34 = r14
            goto L_0x04fc
        L_0x04e5:
            X.2SQ r5 = X.2SP.A00
            java.lang.Object r8 = X.00k.A0G(r9, r5)
            java.lang.String r5 = "null cannot be cast to non-null type com.instagram.discovery.recyclerview.model.ImageGridItemViewModel"
            X.0qQ.A0C(r8, r5)
            X.5qy r8 = (X.C296985qy) r8
            if (r8 == 0) goto L_0x04fc
            X.1Xj r5 = r8.A01
        L_0x04f6:
            if (r5 == 0) goto L_0x04fc
            java.lang.String r30 = r5.getId()
        L_0x04fc:
            r35 = 1
            com.instagram.discovery.chaining.intf.DiscoveryChainingConfig r5 = new com.instagram.discovery.chaining.intf.DiscoveryChainingConfig
            r20 = r13
            r23 = r1
            r25 = r11
            r26 = r4
            r28 = r6
            r29 = r22
            r33 = r22
            r36 = r35
            r37 = r3
            r38 = r7
            r39 = r3
            r40 = r3
            r41 = r3
            r42 = r3
            r43 = r3
            r44 = r3
            r45 = r12
            r17 = r5
            r18 = r2
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            boolean r1 = r0.A0a
            if (r1 == 0) goto L_0x0531
            r0.A08(r5)
            return
        L_0x0531:
            r0.A07(r5)
            return
        L_0x0535:
            java.lang.String r0 = "viewController"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x053f:
            java.lang.String r0 = "All channel-related arguments must be provided"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x0546:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r20)
            throw r0
        L_0x054b:
            X.0wj r1 = X.0wj.A01
            java.lang.String r0 = "ExploreGridDelegate: clckedmedia is null"
            X.DbT.A1Q(r1, r0, r4)
            X.0gF r0 = X.C60340gF.A00
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52530GWh.DJt(android.view.View, X.5qz, X.5qt, X.1Xj):void");
    }

    public final void DK3(1Xj r2) {
        if (r2 != null) {
            AnonymousClass32L r0 = this.A0S.A00;
            AnonymousClass32L.A01(r0);
            ((C52529GWg) r0.A0t.getValue()).A02(r2);
        }
    }

    public final void DK6(1Xj r3) {
        if (r3 != null) {
            C52529GWg gWg = (C52529GWg) this.A0S.A00.A0t.getValue();
            if (gWg.A04()) {
                r3.getId();
                gWg.A09.remove(r3);
            }
        }
    }

    private final void A08(DiscoveryChainingConfig discoveryChainingConfig) {
        Bundle A0a2 = AnonymousClass7TE.A0a();
        A0a2.putParcelable(C273654mx.A00(2287), discoveryChainingConfig);
        AnonymousClass32L r2 = this.A0D.A00;
        Dba.A0K(r2.requireActivity(), A0a2, this.A09, ModalActivity.class, C273654mx.A00(2331)).A0D(r2, 808);
    }

    public final void A0B() {
        Bundle A0a2 = AnonymousClass7TE.A0a();
        A0a2.putBoolean("IS_SIGN_UP_FLOW", false);
        C309516Yo A0M2 = DbS.A0M(this.A0D.A00.requireActivity(), this.A09);
        AnonymousClass35B.A00().A01();
        C47447E2t e2t = new C47447E2t();
        e2t.setArguments(A0a2);
        Dba.A0w((Bundle) null, e2t, A0M2);
        0wc r2 = this.A0P;
        0qQ.A0B(r2, 0);
        Integer num = AnonymousClass05K.A0C;
        0Aj A0e = AnonymousClass7TE.A0e(r2, "explore_topic_switch");
        A0e.AAJ("dest_topic_cluster_title", (String) null);
        A0e.AAJ("dest_topic_cluster_type", C52569GXu.A00(num));
        A0e.Cgf();
    }

    public final void A0N(Integer num, String str, String str2, int i, boolean z) {
        String str3;
        DbY.A1S(str, num);
        UserSession userSession = this.A09;
        0qQ.A0B(userSession, 0);
        GXL gxl = (GXL) userSession.A01(GXL.class, C52559GXk.A00);
        String str4 = this.A0G;
        ExploreTopicCluster exploreTopicCluster = this.A0E.A00;
        if (exploreTopicCluster != null) {
            str3 = exploreTopicCluster.A06;
        } else {
            str3 = "";
        }
        if (gxl.A00(str4, str3).add(str2)) {
            0wc r2 = this.A0P;
            String str5 = userSession.A06;
            DbW.A1O(r2, 0, str4);
            if (z) {
                I3t.A00(userSession, str5, "impression", str, str2);
                return;
            }
            0Aj A0e = AnonymousClass7TE.A0e(r2, "explore_topic_tray_impression");
            A0e.A9F("position", DbS.A0j(i));
            C51967G9n.A18(A0e, str4);
            A0e.AAJ("topic_cluster_id", str2);
            A0e.AAJ("topic_cluster_title", str);
            A0e.AAJ("topic_cluster_type", C52569GXu.A00(num));
            A0e.Cgf();
        }
    }
}
