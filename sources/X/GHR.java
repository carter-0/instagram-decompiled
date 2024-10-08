package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import java.util.List;

public final class GHR extends C251343mx {
    public final View.OnTouchListener A00;
    public final ClipsViewerConfig A01;
    public final C267324bN A02;
    public final UserSession A03;
    public final AnonymousClass3NK A04;
    public final AnonymousClass4DU A05;
    public final Reel A06;
    public final User A07;
    public final JTB A08;
    public final C52046GCs A09;
    public final boolean A0A;
    public final C54588HJx A0B;
    public final boolean A0C;
    public final boolean A0D;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: X.3gE} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: X.3bC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v3, resolved type: X.3bC} */
    /* JADX WARNING: type inference failed for: r4v2, types: [X.3mp] */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0092, code lost:
        if (r18 == null) goto L_0x0094;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C251263mp A0X(X.AnonymousClass3Y5 r31) {
        /*
            r30 = this;
            r2 = 0
            r3 = r31
            X.0qQ.A0B(r3, r2)
            r6 = r30
            X.4bN r13 = r6.A02
            X.1Xj r1 = r13.A02
            if (r1 == 0) goto L_0x02b6
            com.instagram.common.session.UserSession r4 = r6.A03
            boolean r0 = r6.A0C
            java.lang.Integer r10 = X.GEN.A01(r13, r4, r1, r0)
            X.HJx r1 = r6.A0B
            r11 = 0
            if (r1 == 0) goto L_0x029a
            X.2V5 r0 = r1.A05
        L_0x001d:
            java.lang.Object r9 = X.C52149GGr.A00(r3, r0)
            X.Gmw r9 = (X.C53372Gmw) r9
            if (r1 == 0) goto L_0x028f
            X.2V5 r1 = r1.A04
        L_0x0027:
            java.lang.Object r8 = X.C52149GGr.A00(r3, r1)
            java.lang.Number r8 = (java.lang.Number) r8
            boolean r0 = r6.A0D
            if (r0 == 0) goto L_0x028b
            java.lang.Integer r12 = X.AnonymousClass05K.A0Y
            if (r10 == r12) goto L_0x003d
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r10 == r0) goto L_0x003d
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r10 != r0) goto L_0x0287
        L_0x003d:
            com.instagram.model.reels.Reel r5 = r6.A06
            if (r5 == 0) goto L_0x0287
            X.2V1 r0 = r3.Aqq()
            android.content.Context r14 = X.C51965G9l.A0B(r0)
            r7 = 2131165344(0x7f0700a0, float:1.7944902E38)
            r0 = 2131165250(0x7f070042, float:1.7944712E38)
            float r0 = X.AnonymousClass0od.A04(r14, r7, r0)
            int r0 = (int) r0
            long r0 = X.C51969G9p.A0G(r0)
            r15 = 2131165253(0x7f070045, float:1.7944718E38)
            float r15 = X.AnonymousClass0od.A03(r14, r7, r15)
            float r14 = X.AnonymousClass0od.A02(r14, r7)
            X.3XV r7 = X.2WX.A02
            java.lang.Integer r7 = X.AnonymousClass05K.A00
            X.2WX r1 = X.C51974G9v.A0M(r11, r7, r2, r0)
            X.3b9 r0 = X.C244413b9.ABSOLUTE
            X.2WX r19 = X.G9t.A0z(r1, r12, r0)
            com.instagram.api.schemas.RingSpec r20 = r5.A05(r4)
            if (r20 != 0) goto L_0x007b
            com.instagram.api.schemas.RingSpec r20 = X.AnonymousClass3NW.A00(r4, r5)
        L_0x007b:
            boolean r0 = r5.A16(r4)
            if (r0 == 0) goto L_0x0283
            X.3b8 r21 = X.C244403b8.STATE_INACTIVE
        L_0x0083:
            java.lang.Float r22 = java.lang.Float.valueOf(r15)
            java.lang.Float r23 = java.lang.Float.valueOf(r14)
            X.3bA r18 = new X.3bA
            r18.<init>(r19, r20, r21, r22, r23)
        L_0x0090:
            r17 = 1
            if (r18 != 0) goto L_0x0096
        L_0x0094:
            r17 = 0
        L_0x0096:
            X.1Xj r7 = r13.A02
            if (r7 == 0) goto L_0x02b1
            r5 = 1
            X.H7o r12 = new X.H7o
            r12.<init>(r6, r5)
            X.0Pk r1 = X.0Pl.A0n
            android.content.Context r0 = X.C243803a8.A00(r3)
            X.0Pl r14 = r1.A00(r0, r4)
            int r15 = r10.intValue()
            r1 = 2
            r0 = 5
            r10 = 4
            if (r15 == r10) goto L_0x0232
            r16 = 0
            if (r15 == r0) goto L_0x01c5
            if (r15 == r5) goto L_0x01b1
            if (r15 == r1) goto L_0x024f
            X.3XV r0 = X.2WX.A02
            r14 = 2131165344(0x7f0700a0, float:1.7944902E38)
            long r0 = X.C244013aV.A0C(r3, r14)
            java.lang.Integer r8 = X.AnonymousClass05K.A00
            X.2WX r9 = X.AnonymousClass9JR.A00(r11, r8, r2, r0)
            long r0 = X.C244013aV.A0C(r3, r14)
            java.lang.Integer r8 = X.AnonymousClass05K.A01
            X.2WX r14 = X.AnonymousClass9JR.A00(r9, r8, r2, r0)
            r9 = 2131970055(0x7f134807, float:1.957705E38)
            com.instagram.user.model.User r1 = r6.A07
            java.lang.String r0 = r1.getUsername()
            java.lang.String r9 = X.C244013aV.A0F(r3, r0, r9)
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            X.2WX r0 = X.C51971G9r.A0Y(r14, r0, r9, r2)
            X.2WX r8 = X.C51972G9s.A0U(r0, r8, r2)
            r0 = 2131972408(0x7f135138, float:1.9581823E38)
            if (r17 == 0) goto L_0x01ab
            r0 = 2131972409(0x7f135139, float:1.9581825E38)
            java.lang.String r0 = X.C244013aV.A0E(r3, r0)
        L_0x00f7:
            java.lang.Integer r9 = X.AnonymousClass05K.A0C
            X.2WX r20 = X.C51971G9r.A0Y(r8, r9, r0, r2)
            X.4DU r8 = r6.A05
            X.3Ds r19 = X.C238863Ds.PAGE_PROFILE_PIC
            boolean r0 = r6.A0A
            r21 = r13
            r22 = r4
            r23 = r8
            r24 = r0
            X.2WX r13 = X.GFM.A02(r19, r20, r21, r22, r23, r24)
            java.lang.Integer r6 = X.AnonymousClass05K.A08
            java.lang.String r0 = "profile_picture"
            X.2WX r6 = X.C51971G9r.A0Y(r13, r6, r0, r10)
            r0 = 0
            X.2WX r9 = X.C51971G9r.A0X(r6, r9, r0, r5)
            java.lang.Integer r6 = X.AnonymousClass05K.A0D
            java.lang.String r0 = "clips_author_info_profile_pic_component"
            X.2WX r6 = X.C51971G9r.A0Y(r9, r6, r0, r10)
            X.3aa r0 = X.C244063aa.PROFILE_IMAGE
            X.2WX r20 = X.C51973G9u.A0N(r0, r6)
            X.3QO r6 = r7.A1t()
            X.3QO r0 = X.AnonymousClass3QO.OPAL
            if (r6 != r0) goto L_0x01a6
            X.4Cl r0 = r1.A03
            X.4bl r0 = r0.BYD()
            if (r0 == 0) goto L_0x01a1
            java.lang.String r0 = r0.Bh8()
            if (r0 == 0) goto L_0x01a1
            android.net.Uri r1 = X.DbT.A09(r0)
            r0 = -1
            com.instagram.common.typedurl.SimpleImageUrl r22 = X.C253833rU.A00(r1, r0, r0)
        L_0x0149:
            X.0Tu r6 = X.0Tu.A05
            r0 = 36327353081608560(0x810f89000f3970, double:3.0369025950944274E-306)
            boolean r29 = X.182.A06(r6, r4, r0)
            X.2V1 r6 = r3.A05
            android.content.Context r0 = r6.A0C
            int r0 = X.2Yu.A04(r0)
            int r24 = X.C51969G9p.A08(r3, r0)
            r26 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            X.3bC r4 = new X.3bC
            r27 = r2
            r28 = r5
            r19 = r4
            r21 = r8
            r23 = r12
            r25 = r2
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
        L_0x0173:
            android.content.Context r7 = X.C51965G9l.A0B(r6)
            r1 = 2131165344(0x7f0700a0, float:1.7944902E38)
            r0 = 2131165250(0x7f070042, float:1.7944712E38)
            float r0 = X.AnonymousClass0od.A04(r7, r1, r0)
            int r0 = (int) r0
            long r0 = X.C51969G9p.A0G(r0)
            X.3XV r7 = X.2WX.A02
            if (r18 == 0) goto L_0x02a1
            java.lang.Integer r5 = X.AnonymousClass05K.A0C
            X.2WX r7 = X.AnonymousClass9JR.A00(r11, r5, r2, r0)
            java.lang.Integer r5 = X.AnonymousClass05K.A0Y
            X.2WX r1 = X.AnonymousClass9JR.A00(r7, r5, r2, r0)
            r0 = r18
            X.2Wb r0 = X.C51973G9u.A0J(r4, r0, r6)
            X.2Tl r0 = X.C243563Zg.A05(r0, r3, r1)
            return r0
        L_0x01a1:
            com.instagram.common.typedurl.SimpleImageUrl r22 = X.DbS.A0V(r11)
            goto L_0x0149
        L_0x01a6:
            com.instagram.common.typedurl.ImageUrl r22 = r1.Bh3()
            goto L_0x0149
        L_0x01ab:
            java.lang.String r0 = X.C244013aV.A0E(r3, r0)
            goto L_0x00f7
        L_0x01b1:
            android.content.Context r8 = X.C243803a8.A00(r3)
            X.4DU r0 = r6.A05
            java.lang.String r0 = r0.getModuleName()
            android.graphics.drawable.Drawable r8 = r14.A07(r8, r7, r0)
            java.util.List r0 = r7.A3l(r4)
            goto L_0x026d
        L_0x01c5:
            if (r9 == 0) goto L_0x0230
            java.lang.Object r13 = r9.A04
        L_0x01c9:
            com.instagram.user.model.User r7 = X.C51966G9m.A11(r7)
            X.0sn r10 = X.0sn.A00
            r0 = 2131238719(0x7f081f3f, float:1.8093725E38)
            android.graphics.drawable.Drawable r9 = X.C244013aV.A0D(r3, r0)
            r0 = 2131099939(0x7f060123, float:1.7812245E38)
            int r0 = X.C51969G9p.A08(r3, r0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            if (r7 == 0) goto L_0x022d
            if (r13 == 0) goto L_0x0225
            boolean r0 = r7.equals(r13)
            if (r0 != 0) goto L_0x0225
            if (r8 == 0) goto L_0x0225
            int r0 = r8.intValue()
            if (r0 <= 0) goto L_0x0225
            com.instagram.user.model.User r13 = (com.instagram.user.model.User) r13
            com.instagram.user.model.User[] r0 = new com.instagram.user.model.User[]{r7, r13}
            java.util.List r10 = X.0sr.A1P(r0)
            r9 = r11
        L_0x01fe:
            android.content.Context r7 = X.C243803a8.A00(r3)
            X.4DU r0 = r6.A05
            java.lang.String r4 = r0.getModuleName()
            r0 = r16
            X.3b0 r4 = X.0Pl.A03(r7, r9, r0, r4, r10)
            X.2WX r0 = r6.A00(r3, r12, r10, r1)
            X.2V1 r6 = r3.A05
            X.3gG r1 = X.C247373gE.A00(r6)
            r1.A0D(r4)
            r1.A0B()
            r1.A0C()
            X.C244123ag.A00(r1, r0)
            goto L_0x027d
        L_0x0225:
            java.util.List r10 = X.AnonymousClass7TE.A1I(r7)
            r16 = r4
            r1 = 1
            goto L_0x01fe
        L_0x022d:
            r16 = r4
            goto L_0x01fe
        L_0x0230:
            r13 = r11
            goto L_0x01c9
        L_0x0232:
            android.content.Context r8 = X.C243803a8.A00(r3)
            X.4DU r0 = r6.A05
            java.lang.String r0 = r0.getModuleName()
            android.graphics.drawable.Drawable r8 = r14.A08(r8, r7, r0)
            com.instagram.user.model.User[] r9 = new com.instagram.user.model.User[r1]
            X.1Xy r0 = r7.A0C
            com.instagram.user.model.User r0 = r0.B9t()
            r9[r2] = r0
            com.instagram.user.model.User r0 = r7.A2A(r4)
            goto L_0x0267
        L_0x024f:
            android.content.Context r4 = X.C243803a8.A00(r3)
            X.4DU r0 = r6.A05
            java.lang.String r0 = r0.getModuleName()
            android.graphics.drawable.Drawable r8 = r14.A06(r4, r7, r0)
            com.instagram.user.model.User[] r9 = new com.instagram.user.model.User[r1]
            com.instagram.user.model.User r0 = r6.A07
            r9[r2] = r0
            com.instagram.user.model.User r0 = r7.A29()
        L_0x0267:
            r9[r5] = r0
            java.util.List r0 = X.0sr.A1P(r9)
        L_0x026d:
            X.2WX r0 = r6.A00(r3, r12, r0, r1)
            X.2V1 r6 = r3.A05
            X.3gG r1 = X.C51971G9r.A0a(r8, r6)
            r1.A0C()
            X.C244123ag.A00(r1, r0)
        L_0x027d:
            X.3gE r4 = r1.A0A()
            goto L_0x0173
        L_0x0283:
            X.3b8 r21 = X.C244403b8.STATE_ACTIVE
            goto L_0x0083
        L_0x0287:
            r18 = r11
            goto L_0x0090
        L_0x028b:
            r18 = r11
            goto L_0x0094
        L_0x028f:
            java.lang.Integer r0 = X.C51967G9n.A0j()
            X.2V5 r1 = new X.2V5
            r1.<init>(r0)
            goto L_0x0027
        L_0x029a:
            X.2V5 r0 = new X.2V5
            r0.<init>(r11)
            goto L_0x001d
        L_0x02a1:
            r1 = 0
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            X.2WX r1 = X.C51971G9r.A0X(r11, r0, r1, r5)
            X.2Wb r0 = X.G9t.A0v(r4, r6)
            X.2Tl r0 = X.C243563Zg.A03(r0, r3, r1)
            return r0
        L_0x02b1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x02b6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GHR.A0X(X.3Y5):X.3mp");
    }

    private final 2WX A00(C70832Wc r10, AnonymousClass3NK r11, List list, int i) {
        AnonymousClass3XV r0 = 2WX.A02;
        2WX A0Y = C51971G9r.A0Y(C51971G9r.A0Y(C51972G9s.A0V(G9t.A0x(C51971G9r.A0Y(C51974G9v.A0I((2WX) null, C51965G9l.A0c(AnonymousClass05K.A00, 0, C244013aV.A0C(r10, R.dimen.biz_sign_up_divider_bottom_margin)), r10, R.dimen.biz_sign_up_divider_bottom_margin), AnonymousClass05K.A08, "profile_picture", 4), AnonymousClass05K.A0C, 0.0f), J6Q.A00(r11, this, 3)), AnonymousClass05K.A03, J6Q.A00(r11, this, 4), 4), AnonymousClass05K.A04, J6F.A00(this, 44), 4);
        String A012 = AnonymousClass4i2.A01(C243803a8.A00(r10), C51970G9q.A0l(list), list.size(), AnonymousClass4i2.A03(this.A03, C51970G9q.A0l(list), i), AnonymousClass7TF.A1S(i, 2));
        0qQ.A07(A012);
        return C51971G9r.A0Y(C51973G9u.A0N(C244063aa.PROFILE_IMAGE, C51971G9r.A0Y(A0Y, AnonymousClass05K.A0N, C244013aV.A0F(r10, A012, 2131970055), 0)), AnonymousClass05K.A0D, "clips_author_info_profile_pic_component", 4);
    }

    public GHR(View.OnTouchListener onTouchListener, ClipsViewerConfig clipsViewerConfig, C267324bN r3, UserSession userSession, AnonymousClass3NK r5, AnonymousClass4DU r6, Reel reel, User user, JTB jtb, C54588HJx hJx, C52046GCs gCs, boolean z, boolean z2, boolean z3) {
        AnonymousClass7TG.A1Q(user, userSession);
        C51974G9v.A1N(clipsViewerConfig, jtb, gCs);
        this.A02 = r3;
        this.A07 = user;
        this.A03 = userSession;
        this.A05 = r6;
        this.A01 = clipsViewerConfig;
        this.A08 = jtb;
        this.A09 = gCs;
        this.A00 = onTouchListener;
        this.A04 = r5;
        this.A0C = z;
        this.A0D = z2;
        this.A06 = reel;
        this.A0A = z3;
        this.A0B = hJx;
    }
}
