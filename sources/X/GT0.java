package X;

import android.content.Context;
import com.instagram.autoplay.models.AutoplayLayout;
import com.instagram.common.session.UserSession;
import com.instagram.explore.topiccluster.ExploreTopicCluster;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class GT0 {
    public GXP A00;
    public GXP A01;
    public ExploreTopicCluster A02;
    public GXO A03;
    public Long A04;
    public String A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public final Context A09;
    public final AnonymousClass07i A0A;
    public final GXR A0B;
    public final UserSession A0C;
    public final C52560GXl A0D;
    public final C52544GWv A0E;
    public final GWW A0F;
    public final GXN A0G = new GXN();
    public final C3723190i A0H;
    public final C52557GXi A0I;
    public final C60111Jfs A0J;
    public final C228312lJ A0K;
    public final AnonymousClass585 A0L;
    public final C228232l0 A0M;
    public final String A0N = "INITIAL_LOAD";
    public final String A0O = "LOAD_MORE";
    public final String A0P = "RELOAD";
    public final String A0Q;
    public final String A0R;
    public final String A0S;
    public final AnonymousClass0eM A0T = C58675Ivk.A00(this, 15);
    public final boolean A0U;
    public final boolean A0V;

    public final void A01(List list, String str) {
        this.A0F.A07(str, list);
        GXR gxr = this.A0B;
        if (gxr != null && !gxr.A00) {
            gxr.A00 = true;
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (Object next : list) {
                if (next instanceof C297005r0) {
                    A1C.add(next);
                }
            }
            List<C297005r0> A0d = 00k.A0d(A1C, Math.min(2, list.size()));
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            for (C297005r0 r0 : A0d) {
                018.A16(r0.A02, A1C2);
            }
            ArrayList A1C3 = AnonymousClass7TE.A1C();
            Iterator it = A1C2.iterator();
            while (it.hasNext()) {
                Object next2 = it.next();
                if (next2 instanceof C296925qs) {
                    A1C3.add(next2);
                }
            }
            int size = A1C3.size();
            AutoplayLayout autoplayLayout = AutoplayLayout.EXPLORE_DIAGONAL;
            if (size < 2) {
                autoplayLayout = AutoplayLayout.EXPLORE_LOW_DIAGONAL;
            }
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("onFirstLoad: ");
            A1A.append(size);
            0qQ.A0B(AnonymousClass7TG.A0m(autoplayLayout, " -> ", A1A), 0);
            C14077TpR tpR = gxr.A01;
            tpR.A00.A00 = autoplayLayout;
            tpR.A02.A00 = true;
            AnonymousClass0eM r1 = ((C46551Dgt) tpR.A04.getValue()).A01;
            if (!((0mM) r1.getValue()).A02) {
                ((0mM) r1.getValue()).A01(C60340gF.A00);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r9v2, types: [java.lang.Object, X.HQT] */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00e0, code lost:
        if (r2 == null) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x023e, code lost:
        if (r2 == null) goto L_0x0240;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C3723390k r27) {
        /*
            r26 = this;
            r1 = r27
            boolean r2 = r1.A0E
            java.lang.String r17 = "nonprofiledFeedNetworkSource"
            java.lang.String r16 = "feedNetworkSource"
            r4 = 0
            r6 = r26
            if (r2 == 0) goto L_0x0025
            X.GXP r0 = r6.A00
            if (r0 == 0) goto L_0x00e2
            X.6z9 r0 = r0.A00
            X.6zA r0 = r0.A03
            r0.A07 = r4
            r0.A02 = r4
            X.GXP r0 = r6.A01
            if (r0 == 0) goto L_0x0240
            X.6z9 r0 = r0.A00
            X.6zA r0 = r0.A03
            r0.A07 = r4
            r0.A02 = r4
        L_0x0025:
            boolean r8 = r1.A0F
            r6.A07 = r8
            if (r2 == 0) goto L_0x00e7
            boolean r2 = r1.A0H
            if (r2 == 0) goto L_0x0075
            X.0eM r0 = r6.A0T
            boolean r0 = X.G9t.A1b(r0)
            if (r0 == 0) goto L_0x0075
            com.instagram.common.session.UserSession r0 = r6.A0C
            android.content.Context r5 = r6.A09
            X.HDw r7 = X.C55104HcD.A00(r5, r0)
            r3 = 0
            X.GWZ r2 = new X.GWZ
            r2.<init>(r6, r1, r4, r3)
            r0 = 3
            X.H51 r10 = new X.H51
            r10.<init>((int) r0, (java.lang.Object) r2, (java.lang.Object) r6)
            X.07i r0 = r6.A0A
            X.2lw r2 = new X.2lw
            r2.<init>(r5, r0, r4)
            android.content.Context r0 = r7.A00
            X.Hj0 r11 = new X.Hj0
            r11.<init>(r0)
            com.instagram.common.session.UserSession r0 = r7.A05
            X.LAk r8 = X.C54442HDw.A00(r0, r1)
            X.HQT r9 = new X.HQT
            r9.<init>()
            r9.A00 = r3
            X.4Cq r0 = r7.A01
            r14 = 8
            X.MGO r6 = new X.MGO
            r12 = r2
            r13 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            X.AnonymousClass7TE.A1Z(r6, r0)
            return
        L_0x0075:
            boolean r0 = r1.A0I
            if (r0 != 0) goto L_0x0260
            if (r2 == 0) goto L_0x0260
            r10 = 1
            X.GWZ r2 = new X.GWZ
            r2.<init>(r6, r1, r4, r10)
            r0 = 3
            X.H51 r9 = new X.H51
            r9.<init>((int) r0, (java.lang.Object) r2, (java.lang.Object) r6)
            X.90i r0 = r6.A0H
            boolean r0 = r0.A04
            if (r0 != 0) goto L_0x0260
            com.instagram.common.session.UserSession r5 = r6.A0C
            X.2gj r2 = X.C226382gi.A00(r5)
            com.instagram.common.session.UserSession r0 = r2.A01
            X.1P2 r0 = X.1P1.A00(r0)
            long r2 = r2.A00
            java.lang.String r7 = "explore_prefetch"
            java.lang.Integer r0 = r0.A06(r7, r2, r10)
            r11 = 0
            int r0 = X.C51967G9n.A03(r0, r11)
            if (r0 == r11) goto L_0x00db
            if (r0 == r10) goto L_0x00d8
            java.lang.Integer r0 = r1.A00
        L_0x00ac:
            r1.A00 = r0
            X.2gj r3 = X.C226382gi.A00(r5)
            android.content.Context r2 = r6.A09
            X.07i r0 = r6.A0A
            X.2lw r5 = new X.2lw
            r5.<init>(r2, r0, r4)
            com.instagram.common.session.UserSession r0 = r3.A01
            X.1P2 r18 = X.1P1.A00(r0)
            long r2 = r3.A00
            r19 = r9
            r20 = r5
            r21 = r7
            r22 = r2
            r24 = r10
            r25 = r11
            java.lang.Integer r2 = r18.A05(r19, r20, r21, r22, r24, r25)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r2 == r0) goto L_0x0260
            return
        L_0x00d8:
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            goto L_0x00ac
        L_0x00db:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x00ac
        L_0x00de:
            X.GXP r2 = r6.A00
            if (r2 != 0) goto L_0x0263
        L_0x00e2:
            X.0qQ.A0F(r16)
            goto L_0x0243
        L_0x00e7:
            X.2lJ r2 = r6.A0K
            if (r2 == 0) goto L_0x0260
            int r0 = X.C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION
            X.2mA r0 = new X.2mA
            r0.<init>(r2)
        L_0x00f2:
            r10 = 0
            X.GWZ r9 = new X.GWZ
            r9.<init>(r6, r1, r0, r10)
            X.GXP r0 = r6.A00
            if (r0 == 0) goto L_0x00e2
            X.6z9 r0 = r0.A00
            X.6zA r0 = r0.A03
            java.lang.String r11 = r0.A07
            if (r8 == 0) goto L_0x010e
            X.GXP r0 = r6.A01
            if (r0 == 0) goto L_0x0240
            X.6z9 r0 = r0.A00
            X.6zA r0 = r0.A03
            java.lang.String r11 = r0.A07
        L_0x010e:
            com.instagram.common.session.UserSession r3 = r6.A0C
            X.90p r7 = new X.90p
            r7.<init>(r3)
            java.lang.String r0 = r1.A06
            r7.A08 = r0
            java.lang.String r0 = r6.A0Q
            r7.A0A = r0
            X.90i r5 = r6.A0H
            com.instagram.explore.topiccluster.ExploreTopicCluster r0 = r5.A00
            if (r0 == 0) goto L_0x025d
            java.lang.String r0 = r0.A06
        L_0x0125:
            r7.A0E = r0
            boolean r0 = r1.A0G
            r7.A0J = r0
            boolean r0 = r1.A0D
            r7.A0G = r0
            X.GWW r0 = r6.A0F
            X.GWV r2 = r0.A01
            java.util.List r0 = r2.A03
            int r12 = r0.size()
            java.lang.Integer r15 = r2.A01
            X.GSn r0 = r2.A00
            if (r0 == 0) goto L_0x025a
            X.1Xj r0 = r0.BPf()
        L_0x0143:
            boolean r2 = r7.A0J
            r13 = 0
            if (r2 != 0) goto L_0x0256
            boolean r2 = r7.A0I
            if (r2 != 0) goto L_0x0256
            org.json.JSONObject r2 = X.DbS.A11()
            if (r0 == 0) goto L_0x0253
            com.instagram.common.session.UserSession r13 = r7.A0L
            java.lang.String r14 = X.C231122qu.A07(r13, r0)
            java.lang.Integer r13 = r0.CBd()
        L_0x015c:
            java.lang.String r0 = "total_num_items"
            org.json.JSONObject r12 = r2.put(r0, r12)
            if (r15 == 0) goto L_0x0186
            if (r14 == 0) goto L_0x0186
            org.json.JSONObject r2 = X.DbS.A11()
            java.lang.String r0 = "id"
            org.json.JSONObject r14 = r2.put(r0, r14)
            int r2 = r15.intValue()
            java.lang.String r0 = "index"
            org.json.JSONObject r2 = r14.put(r0, r2)
            java.lang.String r0 = "type"
            org.json.JSONObject r2 = r2.put(r0, r13)
            java.lang.String r0 = "last_non_organic_item"
            org.json.JSONObject r12 = r12.put(r0, r2)
        L_0x0186:
            java.lang.String r0 = r12.toString()
            r7.A06 = r0
        L_0x018c:
            java.lang.String r0 = r6.A0R
            r7.A0C = r0
            r7.A09 = r11
            java.lang.String r0 = r1.A08
            r7.A0D = r0
            if (r0 == 0) goto L_0x01a0
            r0 = 3020(0xbcc, float:4.232E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.A07 = r0
        L_0x01a0:
            android.content.Context r0 = r6.A09
            r7.A01 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            r7.A03 = r0
            java.lang.String r1 = r6.A06
            boolean r0 = r7.A0J
            if (r0 != 0) goto L_0x01b6
            boolean r0 = r7.A0I
            if (r0 != 0) goto L_0x01b6
            r7.A0B = r1
        L_0x01b6:
            X.GWv r0 = r6.A0E
            if (r0 == 0) goto L_0x0250
            X.2uu r0 = r0.A01
            if (r0 == 0) goto L_0x024d
            java.util.Map r0 = r0.Bk0()
        L_0x01c2:
            r7.A0F = r0
            X.2l0 r0 = r6.A0M
            r7.A02 = r0
            X.0Tu r2 = X.0Tu.A05
            r0 = 36598906685427001(0x82068300270d39, double:3.208634187607805E-306)
            java.lang.Long r1 = X.AnonymousClass7TF.A0Y(r2, r3, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            r7.A04 = r0
            r7.A05 = r1
            r0 = 2342160440922739856(0x20810683002c1490, double:4.063408187370316E-152)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x01f6
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.HOURS
            r0 = 37161856639041713(0x840683002a00b1, double:3.564646005091264E-306)
            double r2 = X.182.A00(r2, r3, r0)
            long r0 = (long) r2
            long r0 = r11.toMillis(r0)
            r7.A00 = r0
        L_0x01f6:
            boolean r0 = r5.A05
            if (r0 == 0) goto L_0x0248
            com.instagram.common.session.UserSession r0 = r7.A0L
            X.1NY r2 = X.AnonymousClass7TG.A0b(r0)
            java.lang.String r0 = "discover/interest_grid/"
            r2.A0A(r0)
            java.lang.Class<X.90q> r1 = X.C3723890q.class
            java.lang.Class<X.90r> r0 = X.C3723990r.class
            r2.A0O(r4, r1, r0, r10)
            java.lang.String r1 = r7.A0A
            java.lang.String r0 = X.Py2.A00()
            r2.A9m(r0, r1)
            java.lang.String r1 = r7.A0C
            java.lang.String r0 = "module"
            r2.A0G(r0, r1)
            java.lang.String r1 = r7.A0E
            java.lang.String r0 = "topic_id"
            r2.A9m(r0, r1)
            java.lang.String r1 = r7.A06
            java.lang.String r0 = "paging_token"
            r2.A0G(r0, r1)
            java.lang.String r1 = r7.A0B
            java.lang.String r0 = "session_paging_token"
            r2.A0G(r0, r1)
            java.lang.String r0 = r7.A09
            X.C3724090s.A06(r2, r0)
            X.1OC r3 = r2.A0M()
        L_0x023a:
            if (r8 == 0) goto L_0x00de
            X.GXP r2 = r6.A01
            if (r2 != 0) goto L_0x0263
        L_0x0240:
            X.0qQ.A0F(r17)
        L_0x0243:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0248:
            X.1OC r3 = r7.A01()
            goto L_0x023a
        L_0x024d:
            r0 = 0
            goto L_0x01c2
        L_0x0250:
            r0 = r4
            goto L_0x01c2
        L_0x0253:
            r14 = r4
            goto L_0x015c
        L_0x0256:
            r7.A06 = r4
            goto L_0x018c
        L_0x025a:
            r0 = 0
            goto L_0x0143
        L_0x025d:
            r0 = r4
            goto L_0x0125
        L_0x0260:
            r0 = r4
            goto L_0x00f2
        L_0x0263:
            X.6z9 r1 = r2.A00
            X.GWa r0 = new X.GWa
            r0.<init>(r2, r9)
            r1.A03(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GT0.A00(X.90k):void");
    }

    public final void A02(List list, boolean z) {
        ExploreTopicCluster exploreTopicCluster;
        String str;
        if (list != null && (exploreTopicCluster = (ExploreTopicCluster) 00k.A0J(list)) != null) {
            this.A02 = exploreTopicCluster;
            GXO gxo = this.A03;
            if (gxo != null) {
                GWY gwy = gxo.A00;
                GWT gwt = gwy.A0C.A05;
                ExploreTopicCluster exploreTopicCluster2 = gwt.A00;
                if (exploreTopicCluster2 != null) {
                    str = exploreTopicCluster2.A06;
                } else {
                    str = null;
                }
                if (!0qQ.A0K(str, exploreTopicCluster.A06)) {
                    gwt.A00 = exploreTopicCluster;
                    gwt.A01 = ((GXL) gwt.A03.A01(GXL.class, C52559GXk.A00)).A00(gwt.A06, exploreTopicCluster.A06);
                }
                GX7 gx7 = gwy.A07;
                gx7.A00 = exploreTopicCluster;
                UserSession userSession = gx7.A02;
                AnonymousClass4DU r0 = gx7.A03;
                String str2 = gx7.A04;
                GXZ.A00(str2);
                0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r0, userSession), "explore_topic_switch");
                A0e.A8k("topic_nav_order", 0);
                A0e.A8k("dest_topic_cluster_position", 0);
                A0e.AAJ("dest_topic_cluster_debug_info", exploreTopicCluster.A05);
                A0e.AAJ("dest_topic_cluster_type", C296875qn.A00(exploreTopicCluster.A00()));
                A0e.AAJ("dest_topic_cluster_title", exploreTopicCluster.A0A);
                A0e.AAJ("dest_topic_cluster_id", exploreTopicCluster.A06);
                DbS.A1J(A0e, "LOAD");
                C51967G9n.A18(A0e, str2);
                1Xj r02 = exploreTopicCluster.A02;
                if (r02 != null) {
                    A0e.AAJ("dest_topic_cluster_cover_media_id", r02.getId());
                }
                A0e.Cgf();
                if (C71342cb.A00(userSession).A03 == null) {
                    GX7.A00(gx7);
                }
                gwy.A08.A00 = exploreTopicCluster;
                C55919Hpg hpg = gwy.A00;
                if (hpg != null) {
                    AnonymousClass32L r2 = hpg.A00;
                    AnonymousClass32L.A01(r2);
                    C52529GWg gWg = (C52529GWg) r2.A0t.getValue();
                    GT0 gt0 = r2.A0E;
                    if (gt0 == null) {
                        0qQ.A0F("dataStore");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    gWg.A00 = gt0.A02;
                }
            }
            if (z) {
                GX9.A00(this.A0C).A01 = list;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0024 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03() {
        /*
            r3 = this;
            boolean r0 = r3.A07
            r2 = 1
            if (r0 != 0) goto L_0x0013
            X.GXP r0 = r3.A00
            if (r0 != 0) goto L_0x001a
            java.lang.String r0 = "feedNetworkSource"
        L_0x000b:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0013:
            X.GXP r0 = r3.A01
            if (r0 != 0) goto L_0x001a
            java.lang.String r0 = "nonprofiledFeedNetworkSource"
            goto L_0x000b
        L_0x001a:
            X.6z9 r0 = r0.A00
            X.6zA r0 = r0.A03
            java.lang.Integer r1 = r0.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 == r0) goto L_0x0025
            r2 = 0
        L_0x0025:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GT0.A03():boolean");
    }

    public final boolean A04() {
        GXP gxp;
        String str;
        if (!this.A07) {
            gxp = this.A00;
            str = "feedNetworkSource";
        } else {
            gxp = this.A01;
            str = "nonprofiledFeedNetworkSource";
        }
        if (gxp == null) {
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        Integer num = gxp.A00.A03.A03;
        if (num == AnonymousClass05K.A00 || num == null) {
            return true;
        }
        return false;
    }

    public /* synthetic */ GT0(Context context, AnonymousClass07i r5, GXR gxr, UserSession userSession, C52544GWv gWv, GWW gww, C3723190i r10, C60111Jfs jfs, C228312lJ r12, C228232l0 r13, String str, String str2, String str3, boolean z, boolean z2) {
        AnonymousClass585 A002 = AnonymousClass584.A00(userSession);
        C52557GXi A003 = C52531GWi.A00(userSession);
        DbW.A1O(userSession, 3, gww);
        C51972G9s.A1F(A002, A003);
        this.A09 = context;
        this.A0A = r5;
        this.A0C = userSession;
        this.A0R = str;
        this.A0Q = str2;
        this.A0F = gww;
        this.A0H = r10;
        this.A0V = z;
        this.A0S = str3;
        this.A0L = A002;
        this.A0I = A003;
        this.A0K = r12;
        this.A0U = z2;
        this.A0E = gWv;
        this.A0M = r13;
        this.A0B = gxr;
        this.A0J = jfs;
        this.A02 = r10.A00;
        C52560GXl gXl = (C52560GXl) userSession.A01(C52560GXl.class, new C20405Wqp(userSession, 4));
        0qQ.A07(gXl);
        this.A0D = gXl;
    }
}
