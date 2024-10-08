package X;

import android.transition.Fade;
import android.transition.Slide;
import android.transition.TransitionSet;
import android.view.View;
import com.instagram.api.schemas.ClipChainType;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;

public final class GDD implements AnonymousClass32U {
    public C267324bN A00;
    public final UserSession A01;
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A00(0eO.A02, new C58676Ivl(this, 27));
    public final ClipsViewerConfig A03;
    public final AnonymousClass4DU A04;
    public final C233812wV A05;
    public final AnonymousClass93U A06;
    public final C227232is A07;
    public final C227232is A08;
    public final C227232is A09;
    public final C227232is A0A;
    public final GDB A0B;
    public final C55684Hlh A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final 0sJ A0H;
    public final boolean A0I;

    public final void DW0(int i) {
    }

    public final void DWA(int i, int i2) {
    }

    public final void DWY() {
    }

    public final void DhU(Integer num) {
    }

    private final void A00(int i) {
        View view;
        Integer valueOf;
        GDB gdb = this.A0B;
        if (gdb != null) {
            View view2 = gdb.A02;
            if ((view2 == null || (valueOf = Integer.valueOf(view2.getVisibility())) == null || valueOf.intValue() != i) && (view = gdb.A02) != null) {
                view.setVisibility(i);
            }
        }
    }

    public final void DVz(int i) {
        1Xj r0;
        DTA Anl;
        ClipChainType Ans;
        C52012GBj A0N = this.A0A.A0N();
        if (this.A0I) {
            C267324bN r1 = this.A00;
            C267324bN A0C2 = A0N.A0C(i);
            this.A00 = A0C2;
            if (0qQ.A0K(A0C2, r1)) {
                return;
            }
        }
        C227232is r12 = this.A07;
        C267324bN A0C3 = A0N.A0C(i);
        if (!(A0C3 == null || (r0 = A0C3.A02) == null || (Anl = r0.A0C.Anl()) == null || (Ans = Anl.Ans()) == null)) {
            GBE gbe = r12.A09;
            if (gbe == null) {
                0qQ.A0F("clipsViewerFragmentViewModel");
                throw AnonymousClass00P.createAndThrow();
            }
            C270754hF r13 = gbe.A0Z;
            if (r13 instanceof IMJ) {
                ((IMJ) r13).A00 = Ans;
            }
        }
        this.A0H.invoke(A0N.A0C(i), Integer.valueOf(i), Integer.valueOf(A0N.A08()), Boolean.valueOf(AnonymousClass7TF.A1T(i, A0N.A06())));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ee, code lost:
        if (r5.intValue() == 8) goto L_0x00af;
     */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x03d5  */
    /* JADX WARNING: Removed duplicated region for block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DW8(int r36, int r37) {
        /*
            r35 = this;
            r3 = r35
            X.2is r0 = r3.A0A
            X.GBj r1 = r0.A0N()
            X.GD6 r0 = r1.A09
            int r0 = X.GD6.A00(r0)
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)
            r8 = 0
            if (r0 != 0) goto L_0x0469
            r31 = r36
            if (r36 < 0) goto L_0x0469
            int r2 = r1.A08()
            r0 = r31
            if (r0 > r2) goto L_0x0469
            r30 = r37
            if (r37 < 0) goto L_0x0469
            int r2 = r1.A08()
            r0 = r30
            if (r0 > r2) goto L_0x0469
            r0 = r31
            X.4bN r2 = r1.A0C(r0)
            X.0eM r0 = r3.A02
            X.93a r7 = X.C51965G9l.A0p(r0)
            if (r7 == 0) goto L_0x008e
            X.4DU r0 = r3.A04
            java.lang.String r4 = r0.getModuleName()
            r6 = 1
            X.0qQ.A0B(r4, r6)
            boolean r0 = r7.A00
            if (r0 != 0) goto L_0x008e
            X.0XK r11 = new X.0XK
            r11.<init>()
            java.lang.String r0 = "analytics_module"
            r11.A00(r0, r4, r6)
            java.lang.String r5 = java.lang.String.valueOf(r31)
            r4 = 2
            java.lang.String r0 = "viewer_position"
            r11.A00(r0, r5, r4)
            if (r2 == 0) goto L_0x00f3
            X.5o2 r0 = r2.A01
        L_0x0061:
            java.lang.String r5 = java.lang.String.valueOf(r0)
            java.lang.String r4 = "NULL"
            if (r5 != 0) goto L_0x006a
            r5 = r4
        L_0x006a:
            java.lang.String r0 = "clips_item_type"
            r11.A00(r0, r5, r6)
            if (r2 == 0) goto L_0x0075
            java.lang.String r4 = r2.getId()
        L_0x0075:
            java.lang.String r0 = "item_id"
            r11.A00(r0, r4, r6)
            X.02m r6 = X.C3728893a.A00(r7)
            r7 = 976032351(0x3a2d125f, float:6.602164E-4)
            r9 = 7
            long r12 = java.lang.System.currentTimeMillis()
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.lang.String r10 = "viewer_position_update"
            r15 = r8
            r6.markerPoint(r7, r8, r9, r10, r11, r12, r14, r15)
        L_0x008e:
            if (r2 == 0) goto L_0x0453
            X.5o2 r12 = r2.A01
            X.5o2 r0 = X.C295365o2.GHOST
            if (r12 == r0) goto L_0x0453
            X.5o2 r4 = X.C295365o2.MIDCARD
            boolean r0 = X.C52213GJe.A00
            if (r12 != r4) goto L_0x00d2
            com.instagram.common.session.UserSession r6 = r3.A01
            X.0Tu r0 = X.0Tu.A05
            r4 = 36326833389582371(0x810f1000003823, double:3.0365739397644336E-306)
            boolean r0 = X.182.A06(r0, r6, r4)
            X.C52213GJe.A00 = r0
            if (r0 == 0) goto L_0x00b2
            r8 = 8
        L_0x00af:
            r3.A00(r8)
        L_0x00b2:
            r0 = r30
            X.4bN r9 = r1.A0C(r0)
            if (r9 == 0) goto L_0x00d0
            X.1Xj r0 = r9.A02
        L_0x00bc:
            java.lang.String r18 = X.GN9.A00(r0)
            X.2is r8 = r3.A08
            X.GBE r13 = r8.A09
            java.lang.String r0 = "clipsViewerFragmentViewModel"
            if (r13 != 0) goto L_0x00f6
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00d0:
            r0 = 0
            goto L_0x00bc
        L_0x00d2:
            X.GDB r0 = r3.A0B
            if (r0 == 0) goto L_0x00f1
            android.view.View r0 = r0.A02
            if (r0 == 0) goto L_0x00f1
            int r0 = r0.getVisibility()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
        L_0x00e2:
            boolean r0 = X.C52213GJe.A00
            if (r0 == 0) goto L_0x00b2
            r4 = 8
            if (r5 == 0) goto L_0x00b2
            int r0 = r5.intValue()
            if (r0 == r4) goto L_0x00af
            goto L_0x00b2
        L_0x00f1:
            r5 = 0
            goto L_0x00e2
        L_0x00f3:
            r0 = 0
            goto L_0x0061
        L_0x00f6:
            X.GMC r11 = r8.A05
            X.GME r10 = r13.A0H
            X.GD9 r0 = r8.A0O()
            X.0sa r0 = r0.A00
            int r7 = X.C52012GBj.A01(r0)
            X.GDB r6 = r8.A0A
            r5 = 0
            java.lang.String r15 = r2.A07
            r4 = 1
            if (r15 == 0) goto L_0x0450
            int r0 = r15.length()
            if (r0 == 0) goto L_0x0450
            java.lang.Integer r1 = java.lang.Integer.valueOf(r31)
            if (r6 == 0) goto L_0x0128
            X.HCB r14 = r6.A08
            if (r14 == 0) goto L_0x0128
            com.instagram.actionbar.ActionBarTitleViewSwitcher r0 = r14.A02
            r0.A02(r15)
            r0 = r31
            r14.A00 = r0
            X.HCB.A01(r14)
        L_0x0128:
            java.lang.String r15 = r13.A1O
            if (r15 == 0) goto L_0x0133
            X.2nF r14 = r13.A0X
            r0 = r31
            r14.A06(r2, r1, r15, r0)
        L_0x0133:
            X.0eM r0 = r13.A1p
            r20 = r0
            boolean r0 = X.AnonymousClass7TF.A1Z(r20)
            if (r0 == 0) goto L_0x0439
            if (r6 == 0) goto L_0x0142
            r6.A0A()
        L_0x0142:
            com.instagram.clips.intf.ClipsViewerConfig r0 = r13.A0Y
            com.instagram.clips.intf.ClipsViewerSource r0 = r0.A0J
            r19 = r0
            com.instagram.clips.intf.ClipsViewerSource r1 = com.instagram.clips.intf.ClipsViewerSource.SPOTLIGHT
            if (r0 != r1) goto L_0x0151
            if (r6 == 0) goto L_0x0151
            r6.A0C(r2)
        L_0x0151:
            X.0eM r0 = r13.A1n
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 == 0) goto L_0x01c5
            X.0eM r0 = r13.A1o
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 == 0) goto L_0x01c5
            if (r6 == 0) goto L_0x01c5
            android.widget.RelativeLayout r15 = r6.A05
            if (r15 == 0) goto L_0x01c5
            r0 = 2131430217(0x7f0b0b49, float:1.8482129E38)
            android.widget.TextView r17 = X.DbW.A0B(r15, r0)
            X.GD9 r0 = r6.A0M
            X.4bN r1 = r0.A02()
            if (r1 == 0) goto L_0x0435
            X.1Xj r0 = r1.A02
            if (r0 == 0) goto L_0x0182
            X.1Xy r0 = r0.A0C
            java.util.List r0 = r0.BsQ()
            if (r0 != 0) goto L_0x0186
        L_0x0182:
            java.util.List r0 = r1.A08
            if (r0 == 0) goto L_0x0435
        L_0x0186:
            java.lang.Object r14 = X.00k.A0J(r0)
            com.instagram.user.model.User r14 = (com.instagram.user.model.User) r14
            if (r14 == 0) goto L_0x0435
            int r1 = r0.size()
            android.content.Context r0 = r15.getContext()
            r15 = 2131972285(0x7f1350bd, float:1.9581573E38)
            java.lang.String r16 = X.AnonymousClass7TE.A16(r0, r15)
            if (r1 <= r4) goto L_0x0431
            java.lang.String r0 = ", +"
            int r1 = r1 - r4
            java.lang.String r15 = X.002.A0O(r0, r1)
        L_0x01a6:
            java.lang.StringBuilder r1 = X.AnonymousClass7TF.A0n(r16)
            r0 = 32
            r1.append(r0)
            java.lang.String r0 = r14.getUsername()
            r1.append(r0)
            java.lang.String r1 = X.AnonymousClass7TF.A0l(r15, r1)
            r0 = r17
            r0.setText(r1)
            r1 = 0
        L_0x01c0:
            r0 = r17
            r0.setVisibility(r1)
        L_0x01c5:
            X.0eM r0 = r13.A1m
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 == 0) goto L_0x0203
            X.0eM r0 = r13.A1t
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 == 0) goto L_0x0203
            X.0eM r0 = r13.A1u
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 != 0) goto L_0x0203
            boolean r0 = X.AnonymousClass7TF.A1Z(r20)
            if (r0 != 0) goto L_0x0203
            boolean r0 = r13.A0N
            X.GBE.A03(r11, r13, r10, r7, r0)
            r0 = r31
            if (r0 != r4) goto L_0x0203
            boolean r0 = r13.A0M
            if (r0 != 0) goto L_0x0203
            com.instagram.common.session.UserSession r15 = r13.A0a
            X.0Tu r14 = X.DbS.A0J(r15, r5)
            r0 = 36318634297137486(0x81079b0002194e, double:3.031388800687193E-306)
            boolean r0 = X.182.A06(r14, r15, r0)
            if (r0 == 0) goto L_0x0203
            r13.A0O = r4
        L_0x0203:
            X.0eM r0 = r13.A1r
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 == 0) goto L_0x0210
            boolean r0 = r13.A0N
            X.GBE.A03(r11, r13, r10, r7, r0)
        L_0x0210:
            com.instagram.clips.intf.ClipsViewerSource r1 = com.instagram.clips.intf.ClipsViewerSource.BLEND
            r0 = r19
            if (r0 != r1) goto L_0x0224
            if (r11 == 0) goto L_0x021b
            r11.A03(r5)
        L_0x021b:
            X.5o2 r0 = X.C295365o2.BLEND_END_OF_FEED
            if (r12 != r0) goto L_0x042a
            if (r10 == 0) goto L_0x0224
            r10.A0F()
        L_0x0224:
            com.instagram.common.session.UserSession r10 = r13.A0a
            boolean r0 = X.1KU.A07(r10)
            if (r0 == 0) goto L_0x0243
            X.0Tu r7 = X.DbS.A0J(r10, r5)
            r0 = 36321254227125448(0x8109fd000124c8, double:3.0330456549611915E-306)
            boolean r0 = X.182.A06(r7, r10, r0)
            if (r0 == 0) goto L_0x0243
            if (r6 == 0) goto L_0x0243
            r6.A0E(r5)
            r6.A09()
        L_0x0243:
            com.instagram.common.session.UserSession r6 = X.C227232is.A01(r8)
            X.0Tu r29 = X.0Tu.A06
            r0 = 36325703813248151(0x810e0900013497, double:3.035859591142234E-306)
            r5 = r29
            boolean r0 = X.182.A06(r5, r6, r0)
            if (r0 == 0) goto L_0x02a7
            android.content.Context r6 = r8.requireContext()
            X.Dc2 r5 = r8.A06
            com.instagram.clips.intf.ClipsViewerConfig r0 = X.C227232is.A00(r8)
            boolean r0 = r0.A1e
            if (r0 == 0) goto L_0x0425
            java.util.concurrent.atomic.AtomicBoolean r0 = X.1Xj.A0i
            com.instagram.clips.intf.ClipsViewerConfig r0 = X.C227232is.A00(r8)
            java.lang.String r0 = r0.A1H
            java.lang.String r1 = X.1Xv.A05(r0)
            X.1Xj r0 = r2.A02
            if (r0 == 0) goto L_0x0422
            java.lang.String r0 = r0.A30()
        L_0x0278:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0425
            if (r5 != 0) goto L_0x041d
            X.6ap r5 = X.DbS.A0a()
            r0 = 2131957156(0x7f1315a4, float:1.9550888E38)
            X.DbS.A19(r6, r5, r0)
            r0 = 2131964884(0x7f1333d4, float:1.9566562E38)
            X.DbW.A0q(r6, r5, r0)
            r5.A0L = r4
            r5.A06()
            r1 = 6
            X.IVR r0 = new X.IVR
            r0.<init>(r1, r8, r2)
            r5.A0A(r0)
            X.Dc2 r5 = r5.A00()
            r8.A06 = r5
        L_0x02a4:
            X.DbX.A1S(r5)
        L_0x02a7:
            if (r9 == 0) goto L_0x0472
            X.1Xj r7 = r9.A02
            if (r7 == 0) goto L_0x0472
            X.4DU r13 = r3.A04
            com.instagram.common.session.UserSession r12 = r3.A01
            X.93U r6 = r3.A06
            X.Hlh r0 = r3.A0C
            java.lang.String r11 = r0.A00
            java.lang.String r2 = r3.A0D
            r1 = r31
            r0 = r30
            if (r1 <= r0) goto L_0x03dd
            java.lang.String r0 = r3.A0G
            r34 = r0
            java.lang.String r0 = r3.A0F
            r33 = r0
            java.lang.String r0 = r3.A0E
            r32 = r0
            java.lang.String r28 = r13.getModuleName()
            r0 = r30
            long r0 = (long) r0
            java.lang.String r27 = r6.CFD()
            java.lang.String r26 = X.DbT.A0x(r7)
            X.1Xy r4 = r7.A0C
            java.lang.String r25 = r4.getMezqlToken()
            java.lang.String r24 = r7.getId()
            java.lang.String r23 = r6.AmZ()
            java.lang.String r22 = X.DbS.A0k()
            java.lang.Long r21 = X.DbZ.A0d(r18)
            java.lang.Long r10 = X.DbZ.A0d(r2)
            X.0wc r4 = X.AnonymousClass0kN.A01(r13, r12)
            java.lang.String r2 = "instagram_clips_viewer_swipe_forward"
            X.0Aj r14 = X.AnonymousClass7TE.A0e(r4, r2)
            java.lang.String r20 = "containermodule"
            r4 = r20
            r2 = r28
            r14.AAJ(r4, r2)
            java.lang.Long r19 = java.lang.Long.valueOf(r0)
            java.lang.String r18 = "media_index"
            r1 = r18
            r0 = r19
            r14.A9F(r1, r0)
            java.lang.String r17 = "viewer_session_id"
            r1 = r27
            r0 = r17
            r14.AAJ(r0, r1)
            java.lang.String r16 = "viewer_init_media_compound_key"
            r0 = r16
            r14.AAJ(r0, r11)
            java.lang.String r15 = "ranking_info_token"
            r0 = r26
            r14.AAJ(r15, r0)
            java.lang.String r9 = "mezql_token"
            r0 = r25
            r14.AAJ(r9, r0)
            java.lang.String r8 = "media_compound_key"
            r0 = r24
            r14.AAJ(r8, r0)
            java.lang.String r7 = "chaining_session_id"
            r0 = r23
            r14.AAJ(r7, r0)
            java.lang.String r6 = "nav_chain"
            r0 = r22
            r14.AAJ(r6, r0)
            java.lang.String r5 = "best_audio_cluster_id"
            r0 = r21
            r14.A9F(r5, r0)
            java.lang.String r4 = "search_session_id"
            r0 = r34
            r14.AAJ(r4, r0)
            java.lang.String r2 = "rank_token"
            r0 = r33
            r14.AAJ(r2, r0)
            java.lang.String r0 = "query_text"
            r1 = r32
            r14.AAJ(r0, r1)
            if (r10 == 0) goto L_0x0368
            X.C51965G9l.A1F(r14, r10)
        L_0x0368:
            r14.Cgf()
            X.0wc r13 = X.AnonymousClass0kN.A01(r13, r12)
            java.lang.String r1 = "instagram_clips_swipe_forward"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r13, r1)
            r14 = r20
            r13 = r28
            r1.AAJ(r14, r13)
            r14 = r18
            r13 = r19
            r1.A9F(r14, r13)
            r14 = r27
            r13 = r17
            r1.AAJ(r13, r14)
            r13 = r16
            r1.AAJ(r13, r11)
            r11 = r26
            r1.AAJ(r15, r11)
            r11 = r25
            r1.AAJ(r9, r11)
            r9 = r24
            r1.AAJ(r8, r9)
            r8 = r23
            r1.AAJ(r7, r8)
            r7 = r22
            r1.AAJ(r6, r7)
            r6 = r21
            r1.A9F(r5, r6)
            r5 = r34
            r1.AAJ(r4, r5)
            r4 = r33
            r1.AAJ(r2, r4)
            r2 = r32
            r1.AAJ(r0, r2)
        L_0x03bc:
            if (r10 == 0) goto L_0x03c1
            X.C51965G9l.A1F(r1, r10)
        L_0x03c1:
            r1.Cgf()
            r1 = 36320730241049378(0x81098300002322, double:3.032714284056762E-306)
            r0 = r29
            boolean r0 = X.182.A06(r0, r12, r1)
            if (r0 == 0) goto L_0x0472
            X.2wV r2 = r3.A05
            if (r2 == 0) goto L_0x0472
            r1 = r31
            r0 = r30
            r2.A0D(r1, r0)
            return
        L_0x03dd:
            X.0wc r1 = X.AnonymousClass0kN.A01(r13, r12)
            java.lang.String r0 = "instagram_clips_swipe_back"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            X.DbW.A16(r1, r13)
            r0 = r30
            long r4 = (long) r0
            X.C51974G9v.A0q(r1, r6, r4)
            java.lang.String r0 = "viewer_init_media_compound_key"
            r1.AAJ(r0, r11)
            X.C51972G9s.A14(r1, r7)
            java.lang.String r0 = r7.getId()
            X.C51965G9l.A1P(r1, r0)
            X.C51970G9q.A1F(r1, r6)
            X.1Xy r0 = r7.A0C
            java.lang.String r4 = r0.getMezqlToken()
            java.lang.String r0 = "mezql_token"
            X.C51973G9u.A14(r1, r0, r4)
            java.lang.Long r4 = X.C51972G9s.A0j(r18)
            java.lang.String r0 = "best_audio_cluster_id"
            r1.A9F(r0, r4)
            if (r2 == 0) goto L_0x03c1
            java.lang.Long r10 = X.AnonymousClass7TE.A10(r2)
            goto L_0x03bc
        L_0x041d:
            X.C227232is.A0G(r8)
            goto L_0x02a4
        L_0x0422:
            r0 = 0
            goto L_0x0278
        L_0x0425:
            X.C227232is.A0G(r8)
            goto L_0x02a7
        L_0x042a:
            if (r10 == 0) goto L_0x0224
            r10.A0H()
            goto L_0x0224
        L_0x0431:
            java.lang.String r15 = ""
            goto L_0x01a6
        L_0x0435:
            r1 = 8
            goto L_0x01c0
        L_0x0439:
            X.0eM r0 = r13.A1m
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 != 0) goto L_0x0449
            X.0eM r0 = r13.A1q
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 == 0) goto L_0x0142
        L_0x0449:
            if (r6 == 0) goto L_0x0142
            r6.A0B(r7)
            goto L_0x0142
        L_0x0450:
            r1 = 0
            goto L_0x0128
        L_0x0453:
            com.instagram.common.session.UserSession r1 = r3.A01
            boolean r0 = X.C328447Ev.A01(r1)
            if (r0 != 0) goto L_0x0461
            boolean r0 = X.C328447Ev.A00(r1)
            if (r0 == 0) goto L_0x0472
        L_0x0461:
            X.GDB r0 = r3.A0B
            if (r0 == 0) goto L_0x0472
            r0.A08()
            return
        L_0x0469:
            com.instagram.clips.intf.ClipsViewerConfig r0 = r3.A03
            boolean r0 = r0.A1a
            if (r0 != 0) goto L_0x0472
            r3.A00(r8)
        L_0x0472:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GDD.DW8(int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
        if (r1 != X.C295365o2.GHOST) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DhG(float r6, float r7) {
        /*
            r5 = this;
            X.2is r0 = r5.A0A
            X.GBj r4 = r0.A0N()
            com.instagram.common.session.UserSession r3 = r5.A01
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318509745313976(0x81077e002418b8, double:3.0313100336124754E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x002b
            int r1 = r4.A08()
            int r0 = r4.A06()
            if (r1 != r0) goto L_0x002b
            X.4bN r0 = r4.A0C(r0)
            if (r0 == 0) goto L_0x003e
            X.5o2 r1 = r0.A01
        L_0x0027:
            X.5o2 r0 = X.C295365o2.GHOST
            if (r1 == r0) goto L_0x0036
        L_0x002b:
            X.2wV r1 = r5.A05
            if (r1 == 0) goto L_0x0036
            int r0 = r4.A06()
            r1.A0C(r0)
        L_0x0036:
            androidx.viewpager2.widget.ViewPager2 r0 = r4.A00
            if (r0 == 0) goto L_0x003d
            X.GN4.A00(r0)
        L_0x003d:
            return
        L_0x003e:
            r1 = 0
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GDD.DhG(float, float):void");
    }

    public final void Dpv() {
        C227232is r3 = this.A09;
        GBE gbe = r3.A09;
        if (gbe == null) {
            0qQ.A0F("clipsViewerFragmentViewModel");
            throw AnonymousClass00P.createAndThrow();
        } else if (gbe.A21) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.addTransition(new Slide(48));
            transitionSet.addTransition(new Fade(1));
            r3.setReturnTransition(transitionSet);
            DbS.A0M(r3.requireActivity(), C227232is.A01(r3)).A06();
        }
    }

    public GDD(ClipsViewerConfig clipsViewerConfig, UserSession userSession, AnonymousClass4DU r6, C233812wV r7, AnonymousClass93U r8, C227232is r9, C227232is r10, C227232is r11, C227232is r12, GDB gdb, C55684Hlh hlh, 0sJ r15, boolean z) {
        AnonymousClass7TG.A1O(r6, userSession);
        AnonymousClass7TG.A1S(r8, hlh);
        0qQ.A0B(clipsViewerConfig, 10);
        this.A04 = r6;
        this.A01 = userSession;
        this.A0A = r9;
        this.A08 = r10;
        this.A06 = r8;
        this.A0C = hlh;
        this.A05 = r7;
        this.A09 = r11;
        this.A0I = z;
        this.A03 = clipsViewerConfig;
        this.A0B = gdb;
        this.A07 = r12;
        this.A0H = r15;
        this.A0D = clipsViewerConfig.A01;
        this.A0G = clipsViewerConfig.A18;
        this.A0F = clipsViewerConfig.A14;
        this.A0E = clipsViewerConfig.A13;
    }

    public final void Dpy(C267324bN r8, int i) {
        1Xj A0l = C51968G9o.A0l(r8);
        if (A0l != null) {
            AnonymousClass4DU r5 = this.A04;
            UserSession userSession = this.A01;
            AnonymousClass93U r4 = this.A06;
            String str = this.A03.A0m;
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r5, userSession), "instagram_clips_end_of_feed");
            String A30 = A0l.A30();
            String A0k = C51973G9u.A0k(A0l);
            if (A30 != null && A0k != null) {
                DbW.A16(A0e, r5);
                G9t.A1J(A0e, A30);
                G9t.A1K(A0e, A0k);
                C51969G9p.A16(A0e, i);
                C51970G9q.A1E(A0e, r4);
                C51973G9u.A10(A0e);
                C51972G9s.A14(A0e, A0l);
                if (str != null) {
                    A0e.A9F("blend_id", DbV.A0q(str));
                }
                DbX.A1L(A0e);
            }
        }
    }
}
