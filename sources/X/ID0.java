package X;

import android.view.View;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.user.model.User;

public final class ID0 implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public ID0(IgLinearLayout igLinearLayout, C53965Gx9 gx9, User user, int i) {
        this.A00 = i;
        this.A01 = igLinearLayout;
        if (19 - i != 0) {
            this.A03 = gx9;
            this.A02 = user;
        } else {
            this.A02 = user;
            this.A03 = gx9;
        }
    }

    public static void A00(View view, Object obj, Object obj2, Object obj3, int i) {
        AnonymousClass0fU.A00(new ID0(i, obj, obj2, obj3), view);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0579: MOVE  (r3v46 androidx.fragment.app.FragmentActivity) = (r3v45 androidx.fragment.app.FragmentActivity)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void onClick(android.view.View r32) {
        /*
            r31 = this;
            r0 = r31
            r3 = r32
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x0c9a;
                case 1: goto L_0x0bc8;
                case 2: goto L_0x0b88;
                case 3: goto L_0x0b34;
                case 4: goto L_0x0b1a;
                case 5: goto L_0x0b00;
                case 6: goto L_0x08dd;
                case 7: goto L_0x080a;
                case 8: goto L_0x07eb;
                case 9: goto L_0x07cc;
                case 10: goto L_0x076a;
                case 11: goto L_0x073f;
                case 12: goto L_0x0691;
                case 13: goto L_0x0672;
                case 14: goto L_0x0653;
                case 15: goto L_0x0633;
                case 16: goto L_0x060e;
                case 17: goto L_0x05f3;
                case 18: goto L_0x05d3;
                case 19: goto L_0x0593;
                case 20: goto L_0x0562;
                case 21: goto L_0x04f1;
                case 22: goto L_0x0459;
                case 23: goto L_0x03fb;
                case 24: goto L_0x0362;
                case 25: goto L_0x0341;
                case 26: goto L_0x02d8;
                case 27: goto L_0x02bd;
                case 28: goto L_0x0286;
                case 29: goto L_0x0245;
                case 30: goto L_0x0208;
                case 31: goto L_0x01e3;
                case 32: goto L_0x0180;
                case 33: goto L_0x0120;
                case 34: goto L_0x0101;
                case 35: goto L_0x00a6;
                case 36: goto L_0x002c;
                case 37: goto L_0x000a;
                default: goto L_0x0009;
            }
        L_0x0009:
            return
        L_0x000a:
            r1 = -470570830(0xffffffffe3f3a8b2, float:-8.989429E21)
            int r5 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r6 = r0.A03
            X.30x r6 = (X.C2357130x) r6
            com.instagram.common.session.UserSession r4 = r6.A0J
            java.lang.Object r3 = r0.A02
            java.lang.Object r1 = r0.A01
            r0 = 3
            X.II0 r2 = new X.II0
            r2.<init>(r0, r1, r6, r3)
            X.IHt r1 = X.C56924IHt.A00
            r0 = 0
            X.C54998HaV.A00(r1, r2, r4, r0)
            r0 = 380492643(0x16addb63, float:2.808811E-25)
            goto L_0x01d4
        L_0x002c:
            r1 = -1871618788(0xffffffff90715d1c, float:-4.7600598E-29)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r7 = r0.A02
            X.IUh r7 = (X.C57246IUh) r7
            X.4ac r2 = X.C266954ac.CLICKED_HIDE
            r7.EZ9(r2)
            java.lang.Object r6 = r0.A03
            X.30x r6 = (X.C2357130x) r6
            X.2rI r8 = r6.A0L
            X.2rX r9 = r8.A00
            X.2rW r9 = (X.AnonymousClass2rW) r9
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.LinkedList r2 = r9.A02
            java.util.Iterator r10 = X.AnonymousClass7TE.A1G(r2)
        L_0x0054:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x0073
            java.lang.Object r4 = r10.next()
            r3 = r4
            X.1Xg r3 = (X.1Xg) r3
            r2 = 0
            X.0qQ.A0B(r3, r2)
            X.1UQ r3 = r3.A06
            X.1UQ r2 = X.1UQ.A0N
            if (r3 == r2) goto L_0x006f
            r5.add(r4)
            goto L_0x0054
        L_0x006f:
            r11.add(r4)
            goto L_0x0054
        L_0x0073:
            java.util.Iterator r3 = r11.iterator()
        L_0x0077:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x0085
            java.lang.Object r2 = r3.next()
            r9.A0C(r2)
            goto L_0x0077
        L_0x0085:
            X.C51975G9x.A1C(r9, r5)
            r2 = -1
            r8.A0A(r2)
            java.lang.Object r5 = r0.A01
            X.WWQ r5 = (X.WWQ) r5
            int r4 = r7.getPosition()
            com.instagram.common.session.UserSession r3 = r6.A0J
            X.3kK r0 = r6.A0N
            java.lang.String r2 = r0.getSessionId()
            X.4DU r0 = r6.A0K
            X.AnonymousClass5ET.A01(r3, r5, r0, r2, r4)
            r0 = 1926182760(0x72cf3768, float:8.2086885E30)
            goto L_0x0cfb
        L_0x00a6:
            r1 = -349715828(0xffffffffeb27c28c, float:-2.0280933E26)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r7 = r0.A03
            X.H0A r7 = (X.H0A) r7
            java.lang.Object r4 = r0.A01
            android.content.Context r4 = (android.content.Context) r4
            X.0qQ.A0A(r4)
            java.lang.Object r0 = r0.A02
            com.instagram.api.schemas.PopularReelWithFollowersInsightMetadata r0 = (com.instagram.api.schemas.PopularReelWithFollowersInsightMetadata) r0
            java.util.List r3 = r0.BQJ()
            X.0eM r6 = r7.A00
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r6)
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.CREATOR_VIEWER_INSIGHT_MORE_SIMILAR_POPULAR_REELS
            X.4h3 r5 = X.C51965G9l.A0i(r0, r2)
            r0 = 0
            if (r3 == 0) goto L_0x00d7
            java.lang.String r2 = ","
            X.J6C r0 = X.J6C.A00
            java.lang.String r0 = X.DbT.A0z(r2, r3, r0)
        L_0x00d7:
            r5.A0s = r0
            r0 = 2131957151(0x7f13159f, float:1.9550878E38)
            java.lang.String r0 = r4.getString(r0)
            r5.A0n = r0
            r4 = 0
            r5.A1l = r4
            androidx.fragment.app.FragmentActivity r3 = r7.getActivity()
            if (r3 == 0) goto L_0x00f9
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r6)
            com.instagram.clips.intf.ClipsViewerConfig r0 = r5.A00()
            X.0qQ.A0B(r2, r4)
            X.C243473Yx.A07(r3, r0, r2, r4, r4)
        L_0x00f9:
            X.DbZ.A15(r7)
            r0 = 270572051(0x10209a13, float:3.167313E-29)
            goto L_0x0cfb
        L_0x0101:
            r1 = 1197692524(0x4763566c, float:58198.42)
            int r5 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r1 = r0.A02
            X.GiC r1 = (X.C53079GiC) r1
            X.0sL r2 = r1.A0A
            java.lang.Object r1 = r0.A01
            java.lang.Object r0 = r0.A03
            X.3kE r0 = (X.C249703kE) r0
            int r0 = r0.getPosition()
            X.C51967G9n.A1P(r1, r2, r0)
            r0 = 1031274220(0x3d77feec, float:0.060545847)
            goto L_0x01d4
        L_0x0120:
            r1 = -1085215029(0xffffffffbf50eecb, float:-0.8161437)
            int r5 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r6 = r0.A03
            X.GCi r6 = (X.C52036GCi) r6
            java.lang.Object r8 = r0.A01
            X.4bN r8 = (X.C267324bN) r8
            java.lang.Object r0 = r0.A02
            java.lang.String r7 = X.C51966G9m.A1E(r0)
            if (r7 == 0) goto L_0x0175
            X.HqC r0 = r6.A03
            X.GE2 r0 = r0.A00
            r4 = 0
            X.GE2.A03(r0, r4)
            androidx.fragment.app.FragmentActivity r0 = r6.A00
            X.8ab r3 = X.DbS.A0X(r0)
            r0 = 2131971984(0x7f134f90, float:1.9580963E38)
            r3.A09(r0)
            r0 = 2131971982(0x7f134f8e, float:1.9580959E38)
            r3.A08(r0)
            r2 = 2131971983(0x7f134f8f, float:1.958096E38)
            X.I8I r1 = new X.I8I
            r1.<init>(r8, r6, r7, r4)
            X.8ae r0 = X.C358278ae.RED
            r3.A0Q(r1, r0, r2)
            X.I8w r0 = X.C56716I8w.A00
            r3.A0C(r0)
            r1 = 10
            X.I9B r0 = new X.I9B
            r0.<init>(r6, r1)
            r3.A0f(r0)
            r0 = 1
            X.AnonymousClass7TH.A0a(r3, r0)
            r0 = 733817401(0x2bbd2a39, float:1.3440977E-12)
            goto L_0x01d4
        L_0x0175:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0y()
            r0 = -1531863536(0xffffffffa4b19e10, float:-7.702928E-17)
            X.AnonymousClass0fD.A0C(r0, r5)
            throw r2
        L_0x0180:
            r1 = 1664835809(0x633b60e1, float:3.456522E21)
            int r5 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r6 = r0.A03
            X.GCi r6 = (X.C52036GCi) r6
            java.lang.Object r8 = r0.A01
            X.4bN r8 = (X.C267324bN) r8
            java.lang.Object r0 = r0.A02
            java.lang.String r7 = X.C51966G9m.A1E(r0)
            if (r7 == 0) goto L_0x01d8
            X.HqC r0 = r6.A03
            X.GE2 r1 = r0.A00
            r0 = 0
            X.GE2.A03(r1, r0)
            androidx.fragment.app.FragmentActivity r0 = r6.A00
            X.8ab r4 = X.DbS.A0X(r0)
            r0 = 2131956083(0x7f131173, float:1.9548712E38)
            r4.A09(r0)
            r0 = 2131956084(0x7f131174, float:1.9548714E38)
            r4.A08(r0)
            r3 = 2131971974(0x7f134f86, float:1.9580942E38)
            r2 = 1
            X.I8I r1 = new X.I8I
            r1.<init>(r8, r6, r7, r2)
            X.8ae r0 = X.C358278ae.RED
            r4.A0Q(r1, r0, r3)
            X.I8x r0 = X.C56717I8x.A00
            r4.A0C(r0)
            r1 = 11
            X.I9B r0 = new X.I9B
            r0.<init>(r6, r1)
            r4.A0f(r0)
            X.AnonymousClass7TH.A0a(r4, r2)
            r0 = 1633298566(0x615a2886, float:2.5151939E20)
        L_0x01d4:
            X.AnonymousClass0fD.A0C(r0, r5)
            return
        L_0x01d8:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0y()
            r0 = 20584622(0x13a18ae, float:3.418051E-38)
            X.AnonymousClass0fD.A0C(r0, r5)
            throw r2
        L_0x01e3:
            r1 = -639564051(0xffffffffd9e106ed, float:-7.9174356E15)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A03
            X.GBI r2 = (X.GBI) r2
            java.lang.Object r7 = r0.A02
            X.1Xj r7 = (X.1Xj) r7
            java.lang.Object r6 = r0.A01
            X.GNW r6 = (X.GNW) r6
            androidx.fragment.app.FragmentActivity r3 = r2.A01
            com.instagram.common.session.UserSession r5 = r2.A04
            X.4DU r4 = r2.A05
            com.instagram.music.common.config.MusicAttributionConfig r8 = X.I7J.A03(r7)
            X.C52273GLp.A02(r3, r4, r5, r6, r7, r8)
            r0 = 1248863620(0x4a702584, float:3934561.0)
            goto L_0x0cfb
        L_0x0208:
            r1 = 1044913597(0x3e481dbd, float:0.19542594)
            int r1 = X.AnonymousClass0fD.A05(r1)
            long r7 = android.os.SystemClock.elapsedRealtime()
            java.lang.Object r6 = r0.A01
            java.util.Map r6 = (java.util.Map) r6
            java.lang.Number r2 = X.C51966G9m.A14(r3, r6)
            long r4 = X.DbY.A04(r2)
            long r7 = r7 - r4
            r4 = 1200(0x4b0, double:5.93E-321)
            int r2 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0240
            java.lang.Object r5 = r0.A03
            X.GHU r5 = (X.GHU) r5
            X.JTB r4 = r5.A07
            java.lang.Object r2 = r0.A02
            X.1Xj r2 = (X.1Xj) r2
            X.GDe r0 = r5.A03
            r4.Dzi(r0, r2)
            long r4 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r6.put(r3, r0)
        L_0x0240:
            r0 = 214809632(0xccdbc20, float:3.1698475E-31)
            goto L_0x0cfb
        L_0x0245:
            r1 = -1666310188(0xffffffff9cae1fd4, float:-1.1522582E-21)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A03
            X.GCb r3 = (X.C52029GCb) r3
            java.lang.Object r7 = r0.A01
            X.1Xj r7 = (X.1Xj) r7
            java.lang.Object r0 = r0.A02
            X.3W1 r0 = (X.AnonymousClass3W1) r0
            com.instagram.model.venue.Venue r2 = r7.A23()
            if (r2 == 0) goto L_0x0281
            X.4DU r5 = r3.A0D
            com.instagram.common.session.UserSession r6 = r3.A0C
            java.lang.String r8 = X.AnonymousClass7TG.A0j()
            X.HOu r4 = X.C54689HOu.A0E
            java.lang.String r9 = r2.A05()
            X.0qQ.A07(r9)
            int r0 = r0.getPosition()
            long r10 = (long) r0
            X.C52086GEg.A0O(r4, r5, r6, r7, r8, r9, r10)
            androidx.fragment.app.FragmentActivity r0 = r3.A07
            X.C52273GLp.A05(r0, r6, r2)
            r0 = -425496715(0xffffffffe6a36f75, float:-3.8590088E23)
            goto L_0x0cfb
        L_0x0281:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0y()
            throw r2
        L_0x0286:
            r1 = 125448656(0x77a31d0, float:1.8822548E-34)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A03
            X.Ght r2 = (X.C53061Ght) r2
            X.JQj r6 = r2.A03
            java.lang.Object r5 = r0.A01
            X.4bN r5 = (X.C267324bN) r5
            X.1Xj r4 = r5.A02
            if (r4 == 0) goto L_0x02b2
            r2 = 87
            java.lang.String r2 = X.C273654mx.A00(r2)
            X.0qQ.A0C(r3, r2)
            com.instagram.common.ui.base.IgSimpleImageView r3 = (com.instagram.common.ui.base.IgSimpleImageView) r3
            java.lang.Object r0 = r0.A02
            com.instagram.common.ui.widget.imageview.IgImageView r0 = (com.instagram.common.ui.widget.imageview.IgImageView) r0
            r6.D3m(r5, r3, r0, r4)
            r0 = -1930258497(0xffffffff8cf297bf, float:-3.7377333E-31)
            goto L_0x0cfb
        L_0x02b2:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0y()
            r0 = 222431618(0xd420982, float:5.979231E-31)
            X.AnonymousClass0fD.A0C(r0, r1)
            throw r2
        L_0x02bd:
            r1 = -560793364(0xffffffffde92f8ec, float:-5.295237E18)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A03
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            java.lang.Object r1 = r0.A02
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r0.A01
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            X.C52345GOp.A07(r3, r1, r0)
            r0 = 780128745(0x2e7fd1e9, float:5.8166725E-11)
            goto L_0x0b84
        L_0x02d8:
            r1 = 1803128792(0x6b798fd8, float:3.0170181E26)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r8 = r0.A03
            X.HFq r8 = (X.C54484HFq) r8
            X.0qQ.A0A(r3)
            java.lang.Object r2 = r0.A02
            com.instagram.api.schemas.ClipsMidCardType r2 = (com.instagram.api.schemas.ClipsMidCardType) r2
            java.lang.String r6 = r2.A00
            java.lang.Object r0 = r0.A01
            com.instagram.api.schemas.ClipsMidCardSubtype r0 = (com.instagram.api.schemas.ClipsMidCardSubtype) r0
            if (r0 == 0) goto L_0x033f
            java.lang.String r5 = r0.A00
        L_0x02f4:
            X.0eM r0 = r8.A03
            boolean r0 = X.G9t.A1b(r0)
            if (r0 == 0) goto L_0x0313
            X.0xx r0 = X.DbW.A0E(r8)
            r12 = 0
            r13 = 24
            X.MGN r7 = new X.MGN
            r10 = r6
            r11 = r5
            r9 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13)
            X.AnonymousClass7TE.A1Z(r7, r0)
        L_0x030e:
            r0 = -1187842987(0xffffffffb932f455, float:-1.7066424E-4)
            goto L_0x0cfb
        L_0x0313:
            androidx.fragment.app.FragmentActivity r2 = r8.requireActivity()
            X.0eM r0 = r8.A04
            X.6Yo r4 = X.DbX.A0N(r2, r0)
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            r0 = 0
            android.os.Bundle r2 = X.DbV.A0B(r3, r0)
            X.C227642jf.A04(r2, r3)
            java.lang.String r0 = "midcard_type_args"
            r2.putString(r0, r6)
            java.lang.String r0 = "midcard_subtype_args"
            r2.putString(r0, r5)
            X.H0T r0 = new X.H0T
            r0.<init>()
            r0.setArguments(r2)
            X.Dba.A12(r0, r4)
            goto L_0x030e
        L_0x033f:
            r5 = 0
            goto L_0x02f4
        L_0x0341:
            r1 = 132230173(0x7e1ac1d, float:3.3955396E-34)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A02
            X.JOV r4 = (X.JOV) r4
            java.lang.Object r1 = r0.A03
            X.H27 r1 = (X.H27) r1
            java.lang.String r3 = r1.A0A
            r1 = 0
            r4.ALd(r3, r1)
            java.lang.Object r0 = r0.A01
            X.7Pu r0 = (X.C331157Pu) r0
            r0.A07()
            r0 = 1669146767(0x637d288f, float:4.6699488E21)
            goto L_0x0b84
        L_0x0362:
            r1 = -204982619(0xfffffffff3c836a5, float:-3.1725088E31)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r6 = r0.A03
            com.instagram.save.model.SavedCollection r6 = (com.instagram.save.model.SavedCollection) r6
            com.instagram.save.model.CollaborativeCollectionMetadata r2 = r6.A05
            if (r2 == 0) goto L_0x0393
            java.lang.Object r3 = r0.A01
            android.content.Context r3 = (android.content.Context) r3
            X.6ap r2 = X.DbS.A0a()
            r0 = 2131970952(0x7f134b88, float:1.957887E38)
            X.DbS.A19(r3, r2, r0)
            r2.A02()
            r0 = 2131238261(0x7f081d75, float:1.8092796E38)
            android.graphics.drawable.Drawable r0 = r3.getDrawable(r0)
            r2.A04 = r0
            X.DbY.A1N(r2)
        L_0x038e:
            r0 = -55954801(0xfffffffffcaa328f, float:-7.0697273E36)
            goto L_0x0cfb
        L_0x0393:
            java.lang.Object r3 = r0.A02
            X.Hj4 r3 = (X.C55522Hj4) r3
            X.H15 r7 = r3.A00
            com.instagram.common.session.UserSession r0 = r7.A05
            X.7Pr r2 = X.DbS.A0W(r0)
            android.content.res.Resources r0 = X.DbV.A05(r7)
            X.7Pu r5 = X.C51975G9x.A0Y(r0, r2)
            X.C55115HcO.A00()
            r0 = 2
            X.TPN r2 = new X.TPN
            r2.<init>(r0, r3, r5, r6)
            X.H1i r4 = new X.H1i
            r4.<init>()
            X.IXH r0 = new X.IXH
            r0.<init>(r2)
            r4.A02 = r0
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            boolean r2 = r6.A06()
            java.lang.String r0 = "is_public_collection"
            r3.putBoolean(r0, r2)
            java.lang.Boolean r0 = r6.A0C
            if (r0 == 0) goto L_0x03d4
            boolean r2 = r0.booleanValue()
            r0 = 1
            if (r2 != 0) goto L_0x03d5
        L_0x03d4:
            r0 = 0
        L_0x03d5:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r2 = r0.booleanValue()
            java.lang.String r0 = "arg_has_private_media"
            r3.putBoolean(r0, r2)
            java.lang.String r2 = r6.A0F
            java.lang.String r0 = "audience_selector_collection_id"
            r3.putString(r0, r2)
            java.lang.String r0 = "audience_selector_collection"
            r3.putParcelable(r0, r6)
            r4.setArguments(r3)
            androidx.fragment.app.FragmentActivity r0 = r7.getActivity()
            if (r0 == 0) goto L_0x038e
            r5.A02(r0, r4)
            goto L_0x038e
        L_0x03fb:
            r1 = 1910213084(0x71db89dc, float:2.1742041E30)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r8 = r0.A03
            X.IWf r8 = (X.C57296IWf) r8
            com.instagram.common.session.UserSession r6 = r8.A01
            X.28D r2 = X.28D.A1L
            X.Hrt r7 = X.C250563lf.A0C(r2)
            java.lang.Object r3 = r0.A02
            android.net.Uri r3 = (android.net.Uri) r3
            java.lang.String r2 = "caption"
            java.lang.String r5 = r3.getQueryParameter(r2)
            java.lang.String r2 = "hashtag"
            java.lang.String r4 = r3.getQueryParameter(r2)
            r3 = 1
            if (r5 == 0) goto L_0x0448
            boolean r2 = X.C51966G9m.A1X(r5)
            if (r2 != r3) goto L_0x0448
        L_0x0427:
            r2 = 0
            X.0qQ.A0B(r5, r2)
            r7.A0b = r5
        L_0x042d:
            X.28D r5 = X.28D.A48
            X.4DH r4 = r8.A00
            androidx.fragment.app.FragmentActivity r3 = r4.requireActivity()
            android.os.Bundle r2 = r7.A00()
            X.I3M.A00(r3, r2, r4, r5, r6)
            java.lang.Object r0 = r0.A01
            X.LOZ r0 = (X.LOZ) r0
            r0.A01()
            r0 = 1138952430(0x43e308ee, float:454.06976)
            goto L_0x0cfb
        L_0x0448:
            if (r4 == 0) goto L_0x042d
            boolean r2 = X.C51966G9m.A1X(r4)
            if (r2 != r3) goto L_0x042d
            r3 = 35
            r2 = 32
            java.lang.String r5 = X.002.A0E(r4, r3, r2)
            goto L_0x0427
        L_0x0459:
            r1 = 690455070(0x2927821e, float:3.7194308E-14)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A03
            X.Hox r2 = (X.C55876Hox) r2
            X.Hl7 r6 = r2.A05
            java.lang.Object r3 = r0.A02
            X.IOV r3 = (X.IOV) r3
            com.instagram.user.model.ProductDetailsProductItemDictIntf r4 = r3.A00
            java.lang.String r3 = "null cannot be cast to non-null type com.instagram.user.model.ProductDetailsProductItemDict"
            X.0qQ.A0C(r4, r3)
            com.instagram.user.model.ProductDetailsProductItemDict r4 = (com.instagram.user.model.ProductDetailsProductItemDict) r4
            r13 = 0
            com.instagram.user.model.Product r11 = new com.instagram.user.model.Product
            r11.<init>(r13, r4)
            java.lang.Object r0 = r0.A01
            X.Gj5 r0 = (X.C53133Gj5) r0
            int r5 = r0.getLayoutPosition()
            android.view.View r7 = r0.A00
            r8 = 0
            X.H1L r6 = r6.A01
            androidx.fragment.app.FragmentActivity r9 = r6.getActivity()
            if (r9 == 0) goto L_0x0499
            X.0eM r0 = r6.A0B
            com.instagram.common.session.UserSession r10 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r12 = r6.A03
            java.lang.String r14 = r6.A0A
            X.FH7.A0A(r9, r10, r11, r12, r13, r14)
        L_0x0499:
            X.0eM r10 = r6.A0B
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r10)
            java.lang.String r3 = r6.A02
            java.lang.String r0 = r6.A03
            X.0qQ.A0B(r4, r8)
            if (r0 == 0) goto L_0x04d9
            X.1Xl r9 = X.C324666zh.A00(r4, r3, r0)
            if (r9 == 0) goto L_0x04d9
            X.3Ds r4 = X.C238863Ds.PROFILE_TAB_PRODUCT_TILE
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            X.0lg r0 = X.DbT.A0X(r10)
            X.3Dp r5 = X.C51967G9n.A0X(r0)
            X.3Dt r0 = new X.3Dt
            r0.<init>(r3, r4, r13, r13)
            r5.A08(r7, r0)
            X.1Xj r4 = r9.BPf()
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r10)
            X.3e7 r0 = new X.3e7
            r0.<init>(r13, r3, r4, r6)
            r5.A0A(r7, r0)
            java.lang.String[] r0 = new java.lang.String[r8]
            r5.A0B(r7, r0)
        L_0x04d9:
            com.instagram.common.session.UserSession r4 = r2.A03
            X.0iw r3 = r2.A02
            X.6rY r5 = X.C319986rY.SELF
            java.lang.String r7 = r4.A06
            java.lang.String r8 = r2.A06
            java.lang.String r9 = r2.A07
            java.lang.String r6 = "tap_product"
            java.lang.String r10 = "ads_products_tab"
            X.C319976rX.A08(r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = -366441818(0xffffffffea288aa6, float:-5.093857E25)
            goto L_0x0cfb
        L_0x04f1:
            r1 = 1719728081(0x6680f7d1, float:3.0451716E23)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A03
            X.Vzq r5 = (X.C18755Vzq) r5
            java.lang.Object r8 = r0.A02
            X.4DH r8 = (X.AnonymousClass4DH) r8
            java.lang.Object r6 = r0.A01
            android.app.Activity r6 = (android.app.Activity) r6
            com.instagram.common.session.UserSession r10 = r5.A04
            X.0wc r1 = X.AnonymousClass0kN.A01(r8, r10)
            java.lang.String r0 = "instagram_organic_use_hashtag"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r4.isSampled()
            if (r0 == 0) goto L_0x0538
            java.lang.String r3 = X.DbS.A0k()
            X.DbW.A16(r4, r8)
            com.instagram.model.hashtag.Hashtag r0 = r5.A05
            java.lang.String r0 = r0.getId()
            if (r0 == 0) goto L_0x055f
            java.lang.Long r0 = X.AnonymousClass7TE.A10(r0)
            if (r0 == 0) goto L_0x055f
            long r0 = r0.longValue()
        L_0x052f:
            X.C51970G9q.A1A(r4, r0)
            X.C51965G9l.A1K(r4, r3)
            r4.Cgf()
        L_0x0538:
            X.28D r9 = X.28D.A16
            X.Hrt r4 = X.C250563lf.A0C(r9)
            r3 = 35
            com.instagram.model.hashtag.Hashtag r0 = r5.A05
            java.lang.String r1 = r0.getName()
            r0 = 32
            java.lang.String r0 = X.002.A0E(r1, r3, r0)
            r12 = 0
            X.0qQ.A0B(r0, r12)
            r4.A0b = r0
            android.os.Bundle r7 = r4.A00()
            r11 = 1
            X.I3M.A01(r6, r7, r8, r9, r10, r11, r12)
            r0 = 1832673951(0x6d3c629f, float:3.6439005E27)
            goto L_0x0b84
        L_0x055f:
            r0 = 0
            goto L_0x052f
        L_0x0562:
            r1 = 968823689(0x39bf1389, float:3.6444914E-4)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r1 = r0.A01
            android.view.View r1 = (android.view.View) r1
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r1)
            android.app.Activity r3 = X.C61270mF.A00(r1)
            boolean r1 = r3 instanceof androidx.fragment.app.FragmentActivity
            if (r1 == 0) goto L_0x058e
            androidx.fragment.app.FragmentActivity r3 = (androidx.fragment.app.FragmentActivity) r3
            if (r3 == 0) goto L_0x058e
            java.lang.Object r1 = r0.A03
            X.Gx9 r1 = (X.C53965Gx9) r1
            com.instagram.common.session.UserSession r5 = r1.A02
            X.0iw r4 = r1.A01
            java.lang.Object r6 = r0.A02
            com.instagram.user.model.User r6 = (com.instagram.user.model.User) r6
            r7 = 0
            r8 = 0
            X.C56585I2p.A02(r3, r4, r5, r6, r7, r8)
        L_0x058e:
            r0 = -1993539557(0xffffffff892d001b, float:-2.0824167E-33)
            goto L_0x0b84
        L_0x0593:
            r1 = 1904220326(0x718018a6, float:1.2686041E30)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            android.view.View r2 = (android.view.View) r2
            android.content.Context r6 = X.AnonymousClass7TE.A0S(r2)
            java.lang.Object r5 = r0.A02
            com.instagram.user.model.User r5 = (com.instagram.user.model.User) r5
            java.lang.String r4 = r5.getUsername()
            java.lang.Object r3 = r0.A03
            X.Gx9 r3 = (X.C53965Gx9) r3
            X.9IZ r0 = r3.A00
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x05d0
            com.instagram.model.mediatype.ProductType r2 = com.instagram.model.mediatype.ProductType.CLIPS
        L_0x05b6:
            r0 = 0
            X.FGM.A02(r6, r0, r2, r4)
            com.instagram.common.session.UserSession r0 = r3.A02
            X.4lm r4 = X.C272994ll.A00(r0)
            java.lang.String r0 = r5.getId()
            long r2 = java.lang.Long.parseLong(r0)
            r4.A00(r2)
            r0 = 1543962453(0x5c06ff55, float:1.5199355E17)
            goto L_0x0cfb
        L_0x05d0:
            com.instagram.model.mediatype.ProductType r2 = com.instagram.model.mediatype.ProductType.FEED
            goto L_0x05b6
        L_0x05d3:
            r1 = 1631139789(0x613937cd, float:2.1354178E20)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A03
            X.3ZP r4 = (X.AnonymousClass3ZP) r4
            java.lang.Object r3 = r0.A01
            X.1Xj r3 = (X.1Xj) r3
            java.lang.Object r1 = r0.A02
            X.3W1 r1 = (X.AnonymousClass3W1) r1
            X.AnonymousClass7TG.A1N(r3, r1)
            X.3Wa r0 = r4.A01
            r0.D2n(r3, r1)
            r0 = -1682755039(0xffffffff9bb33221, float:-2.964546E-22)
            goto L_0x0b84
        L_0x05f3:
            r1 = 1933310260(0x733bf934, float:1.4892791E31)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A01
            X.3Wa r3 = (X.C242813Wa) r3
            java.lang.Object r1 = r0.A02
            X.1Xj r1 = (X.1Xj) r1
            java.lang.Object r0 = r0.A03
            X.3W1 r0 = (X.AnonymousClass3W1) r0
            r3.D2D(r1, r0)
            r0 = 1576072440(0x5df0f4f8, float:2.17034689E18)
            goto L_0x0b84
        L_0x060e:
            r1 = 1964847274(0x751d30aa, float:1.9926212E32)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r1 = r0.A02
            X.51k r1 = (X.C2803551k) r1
            java.lang.Object r4 = r0.A03
            X.51j r4 = (X.C2803451j) r4
            java.lang.Object r3 = r0.A01
            X.3W1 r3 = (X.AnonymousClass3W1) r3
            r0 = 1
            X.0qQ.A0B(r3, r0)
            X.51i r0 = r1.A00
            X.3Wa r1 = r0.A01
            X.1Xj r0 = r4.A00
            r1.D3C(r0, r3)
            r0 = -1097798458(0xffffffffbe90ecc6, float:-0.28305644)
            goto L_0x0b84
        L_0x0633:
            r1 = -468872708(0xffffffffe40d91fc, float:-1.0446041E22)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A03
            X.3ZP r4 = (X.AnonymousClass3ZP) r4
            java.lang.Object r3 = r0.A01
            X.1Xj r3 = (X.1Xj) r3
            java.lang.Object r1 = r0.A02
            X.3W1 r1 = (X.AnonymousClass3W1) r1
            X.AnonymousClass7TG.A1N(r3, r1)
            X.3Wa r0 = r4.A01
            r0.DVe(r3, r1)
            r0 = 1189552022(0x46e71f96, float:29583.793)
            goto L_0x0b84
        L_0x0653:
            r1 = 1231582399(0x496874bf, float:952139.94)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A03
            X.3ZP r4 = (X.AnonymousClass3ZP) r4
            java.lang.Object r3 = r0.A01
            X.1Xj r3 = (X.1Xj) r3
            java.lang.Object r1 = r0.A02
            X.3W1 r1 = (X.AnonymousClass3W1) r1
            int r0 = r1.getPosition()
            r4.A03(r3, r1, r0)
            r0 = -1032323256(0xffffffffc277ff48, float:-61.9993)
            goto L_0x0b84
        L_0x0672:
            r1 = 1762947038(0x69146fde, float:1.1215581E25)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A01
            X.3Wa r4 = (X.C242813Wa) r4
            java.lang.Object r3 = r0.A02
            X.1Xj r3 = (X.1Xj) r3
            java.lang.Object r1 = r0.A03
            X.3W1 r1 = (X.AnonymousClass3W1) r1
            int r0 = r1.getPosition()
            r4.D3M(r3, r1, r0)
            r0 = -1640636928(0xffffffff9e35de00, float:-9.627969E-21)
            goto L_0x0b84
        L_0x0691:
            r1 = 253717622(0xf1f6c76, float:7.860194E-30)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            com.instagram.user.model.User r3 = (com.instagram.user.model.User) r3
            com.instagram.user.model.FollowStatus r1 = r3.B6o()
            java.lang.String r17 = X.1aC.A06(r1)
            java.lang.Object r1 = r0.A03
            X.H09 r1 = (X.H09) r1
            com.instagram.feed.su.model.MiddleStateCardUser r4 = r1.A03
            java.lang.String r5 = "middleStateCardUser"
            if (r4 == 0) goto L_0x0a94
            boolean r5 = r4.A0A
            if (r5 == 0) goto L_0x06df
            java.lang.String r8 = r1.A0A
            if (r8 == 0) goto L_0x06fc
            java.lang.String r14 = r1.A07
            if (r14 != 0) goto L_0x06be
            java.lang.String r5 = "containerModule"
            goto L_0x0a94
        L_0x06be:
            java.lang.String r26 = "middle_state_profile"
            r15 = 0
            java.lang.String r18 = ""
            java.lang.String r13 = r4.A00
            int r11 = r1.A01
            int r10 = r1.A00
            java.lang.String r9 = r4.A07
            java.lang.String r7 = r4.A04
            java.lang.String r6 = r4.A05
            java.lang.String r5 = r4.A06
            java.lang.String r4 = r4.A03
            if (r4 == 0) goto L_0x06d7
            r18 = r4
        L_0x06d7:
            java.lang.String r4 = r1.A08
            if (r4 != 0) goto L_0x0700
            java.lang.String r5 = "displayFormat"
            goto L_0x0a94
        L_0x06df:
            X.5js r5 = r1.A04
            if (r5 == 0) goto L_0x071b
            java.lang.String r6 = r1.A0A
            if (r6 == 0) goto L_0x06fc
            int r11 = r1.A00
            java.lang.String r7 = r4.A01
            if (r7 == 0) goto L_0x06f7
            java.lang.String r9 = r4.A00
            java.lang.String r10 = r4.A07
            java.lang.String r8 = "middle_state_profile"
            r5.A02(r6, r7, r8, r9, r10, r11)
            goto L_0x071b
        L_0x06f7:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0y()
            throw r2
        L_0x06fc:
            java.lang.String r5 = "userId"
            goto L_0x0a94
        L_0x0700:
            X.2om r12 = r1.A06
            if (r12 == 0) goto L_0x071b
            r22 = r15
            r24 = r15
            r25 = r8
            r27 = r10
            r28 = r11
            r21 = r5
            r23 = r9
            r19 = r7
            r20 = r6
            r16 = r4
            X.C230012om.A06(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
        L_0x071b:
            java.lang.Object r5 = r0.A01
            X.4at r5 = (X.C267064at) r5
            X.0eM r4 = r1.A0E
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r4)
            java.lang.String r0 = r1.A0D
            r6 = 0
            r8 = r6
            r9 = r6
            r10 = r6
            r11 = r6
            r13 = r6
            r14 = r6
            r15 = r0
            r12 = r3
            r5.A04(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            r5.A03(r1, r0, r3)
            r0 = -901013177(0xffffffffca4ba147, float:-3336273.8)
            goto L_0x0b84
        L_0x073f:
            r1 = -2046451250(0xffffffff8605a1ce, float:-2.5133395E-35)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A03
            X.GxY r3 = (X.C53990GxY) r3
            com.instagram.common.session.UserSession r5 = r3.A00
            java.lang.Object r1 = r0.A02
            X.3Y5 r1 = (X.AnonymousClass3Y5) r1
            android.content.Context r4 = X.C51967G9n.A09(r1)
            java.lang.Object r0 = r0.A01
            r7 = 0
            X.IWA r6 = new X.IWA
            r6.<init>(r7, r0, r3, r1)
            X.0qQ.A0B(r5, r7)
            r8 = 1
            r9 = r7
            r10 = r7
            X.FEb.A01(r4, r5, r6, r7, r8, r9, r10)
            r0 = 1530972233(0x5b40c849, float:5.4263411E16)
            goto L_0x0b84
        L_0x076a:
            r1 = -426517580(0xffffffffe693dbb4, float:-3.4912034E23)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A03
            X.JM5 r5 = (X.JM5) r5
            X.GqC r5 = (X.C53541GqC) r5
            java.lang.Object r6 = r0.A01
            X.Hnm r6 = (X.C55806Hnm) r6
            java.lang.Object r0 = r0.A02
            X.2nI r0 = (X.C229382nI) r0
            X.0iw r7 = r0.A04
            X.0qQ.A07(r7)
            r3 = 0
            X.0qQ.A0B(r5, r3)
            com.instagram.model.fundraiser.FundraiserCampaignTypeEnum r0 = r5.A00
            if (r0 == 0) goto L_0x07c1
            int r2 = r0.ordinal()
            r0 = 9
            if (r2 != r0) goto L_0x07c1
            X.HLE r0 = X.HLE.FUNDRAISER_DONATE_BOTTOM_SHEET
        L_0x0796:
            int r0 = r0.ordinal()
            if (r0 == r3) goto L_0x07be
            r2 = 1
            java.lang.String r4 = r5.A06
            if (r4 == 0) goto L_0x07b2
            com.instagram.common.session.UserSession r0 = r6.A03
            java.lang.String r3 = r5.A03
            X.0wc r2 = X.C51967G9n.A0Z(r7, r0, r3, r2)
            java.lang.String r0 = "ig_cg_click_fundraiser_metatext"
            X.0Aj r0 = X.AnonymousClass7TE.A0e(r2, r0)
            X.G9w.A1D(r0, r3, r4)
        L_0x07b2:
            X.0sP r0 = r6.A01
        L_0x07b4:
            if (r0 == 0) goto L_0x07b9
            r0.invoke(r5)
        L_0x07b9:
            r0 = 1361716472(0x512a24f8, float:4.5672792E10)
            goto L_0x0cfb
        L_0x07be:
            X.0sP r0 = r6.A00
            goto L_0x07b4
        L_0x07c1:
            java.lang.String r2 = r5.A07
            java.lang.String r0 = r5.A03
            X.C240063Jl.A01 = r2
            X.C240063Jl.A00 = r0
            X.HLE r0 = X.HLE.FUNDRAISER_PAGE
            goto L_0x0796
        L_0x07cc:
            r1 = 677186623(0x285d0c3f, float:1.227062E-14)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r1 = r0.A03
            X.JwK r1 = (X.C61082JwK) r1
            java.lang.Object r1 = r1.A00
            X.GnX r1 = (X.C53400GnX) r1
            java.lang.Object r3 = r1.A01
            X.0sL r3 = (X.0sL) r3
            java.lang.Object r1 = r0.A01
            java.lang.Object r0 = r0.A02
            r3.invoke(r1, r0)
            r0 = 1494316584(0x59117628, float:2.55898661E15)
            goto L_0x0b84
        L_0x07eb:
            r1 = -315309278(0xffffffffed34c322, float:-3.4964502E27)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A01
            X.XBv r5 = (X.XBv) r5
            java.lang.Object r4 = r0.A03
            X.5qt r4 = (X.C296935qt) r4
            java.lang.Object r1 = r0.A02
            X.5qz r1 = (X.C296995qz) r1
            X.0qQ.A0A(r3)
            r0 = 0
            r5.DJt(r3, r1, r4, r0)
            r0 = -1187250929(0xffffffffb93bfd0f, float:-1.7927981E-4)
            goto L_0x0b84
        L_0x080a:
            r1 = 311657463(0x129383f7, float:9.309536E-28)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A03
            X.IOQ r2 = (X.IOQ) r2
            com.instagram.model.direct.DirectShareTarget r7 = r2.A00
            java.lang.String r3 = r7.A09()
            X.0qQ.A07(r3)
            java.lang.Object r6 = r0.A01
            X.Hkj r6 = (X.C55624Hkj) r6
            X.HmG r5 = r6.A01
            com.instagram.model.direct.DirectShareTarget r2 = r5.A00
            if (r2 == 0) goto L_0x08a9
            java.lang.String r2 = r2.A09()
        L_0x082c:
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x08b3
            java.lang.Object r0 = r0.A02
            X.3kE r0 = (X.C249703kE) r0
            int r3 = r0.getBindingAdapterPosition()
            r4 = 1
            com.instagram.model.direct.DirectShareTarget r0 = r5.A00
            if (r0 == 0) goto L_0x08a7
            X.2t9 r2 = r5.A01
            java.lang.String r0 = r0.A09()
            int r2 = r2.A02(r0)
        L_0x0849:
            r5.A00 = r7
            if (r2 < 0) goto L_0x0852
            X.2t9 r0 = r5.A01
            r0.notifyItemChanged(r2)
        L_0x0852:
            X.2t9 r0 = r5.A01
            r0.notifyItemChanged(r3)
            X.HiK r0 = r6.A00
            X.H1O r5 = r0.A00
            X.0eM r0 = r5.A0U
            java.lang.Object r0 = r0.getValue()
            X.7fy r0 = (X.C337257fy) r0
            java.lang.String r0 = r0.BiY()
            if (r0 == 0) goto L_0x0870
            int r2 = r0.length()
            r0 = 0
            if (r2 != 0) goto L_0x0871
        L_0x0870:
            r0 = 1
        L_0x0871:
            r0 = r0 ^ 1
            r5.A0F = r0
            r3 = 0
            com.instagram.igds.components.switchbutton.IgdsSwitch r0 = r5.A07
            if (r0 == 0) goto L_0x0881
            boolean r2 = r0.isChecked()
            r0 = 1
            if (r2 == r4) goto L_0x0882
        L_0x0881:
            r0 = 0
        L_0x0882:
            X.H1O.A08(r5, r0)
            androidx.fragment.app.FragmentActivity r0 = r5.requireActivity()
            X.0nA.A0J(r0)
            android.view.ViewGroup r0 = r5.A03
            if (r0 == 0) goto L_0x0898
            float r0 = r0.getTranslationY()
            java.lang.Float r3 = java.lang.Float.valueOf(r0)
        L_0x0898:
            r4 = 0
            boolean r0 = X.0qQ.A0I(r3, r4)
            if (r0 == 0) goto L_0x08b8
            android.view.View r0 = r5.A02
            if (r0 != 0) goto L_0x08ab
            java.lang.String r5 = "composerContainer"
            goto L_0x0a94
        L_0x08a7:
            r2 = -1
            goto L_0x0849
        L_0x08a9:
            r2 = 0
            goto L_0x082c
        L_0x08ab:
            float r0 = r0.getTranslationY()
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x08b8
        L_0x08b3:
            r0 = -1907081127(0xffffffff8e544059, float:-2.6162E-30)
            goto L_0x0cfb
        L_0x08b8:
            X.0eM r0 = r5.A0Q
            boolean r0 = X.G9t.A1b(r0)
            if (r0 == 0) goto L_0x08d3
            r3 = 1058642330(0x3f19999a, float:0.6)
            android.content.Context r0 = r5.requireContext()
            int r0 = X.AnonymousClass0nB.A00(r0)
            float r2 = (float) r0
            float r2 = r2 * r3
        L_0x08cd:
            X.Iqy r0 = X.C58379Iqy.A00
            X.H1O.A07(r5, r0, r4, r2)
            goto L_0x08b3
        L_0x08d3:
            java.lang.Integer r0 = r5.A09
            if (r0 == 0) goto L_0x08b3
            int r0 = r0.intValue()
            float r2 = (float) r0
            goto L_0x08cd
        L_0x08dd:
            r1 = 1677436260(0x63fba564, float:9.284101E21)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A01
            X.HiN r3 = (X.C55479HiN) r3
            java.lang.Object r2 = r0.A03
            X.IOZ r2 = (X.IOZ) r2
            com.instagram.save.model.SavedCollection r6 = r2.A00
            if (r6 == 0) goto L_0x0af5
            java.lang.Object r0 = r0.A02
            X.3kE r0 = (X.C249703kE) r0
            int r10 = r0.getBindingAdapterPosition()
            X.H1P r5 = r3.A00
            boolean r0 = r6.A05()
            r12 = r0 ^ 1
            X.0eM r8 = r5.A0K
            boolean r3 = com.instagram.save.api.SaveApiUtil.A0A(r5, r8)
            X.0eM r13 = r5.A0M
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r13)
            r9 = 0
            X.1NY r2 = X.AnonymousClass7TG.A0a(r0)
            java.lang.String r7 = "collections/"
            java.lang.String r4 = r6.A0F
            java.lang.String r0 = "/edit/"
            java.lang.String r0 = X.002.A0g(r7, r4, r0)
            r2.A0A(r0)
            java.lang.Class<X.1XP> r4 = X.1XP.class
            java.lang.Class<X.1XY> r0 = X.1XY.class
            r7 = 0
            r2.A0O(r9, r4, r0, r7)
            X.0eM r11 = r5.A0G
            com.instagram.direct.messagethread.collections.model.DirectCollectionArguments r0 = X.C51966G9m.A0q(r11)
            java.lang.Integer r0 = r0.A03
            java.lang.String r4 = X.C70864OPd.A00(r0)
            java.lang.String r0 = "surface"
            r2.A9m(r0, r4)
            com.instagram.direct.messagethread.collections.model.DirectCollectionArguments r0 = X.C51966G9m.A0q(r11)
            java.lang.String r4 = r0.A07
            java.lang.String r0 = "module_name"
            r2.A9m(r0, r4)
            com.instagram.direct.messagethread.collections.model.DirectCollectionArguments r0 = X.C51966G9m.A0q(r11)
            java.lang.String r0 = r0.A04
            if (r0 == 0) goto L_0x0ad5
            if (r12 == 0) goto L_0x0ad1
            java.lang.String r4 = "added_media_fbids"
        L_0x094e:
            com.instagram.direct.messagethread.collections.model.DirectCollectionArguments r0 = X.C51966G9m.A0q(r11)
            java.lang.String r0 = r0.A04
        L_0x0954:
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            java.lang.String r0 = X.C51970G9q.A0k(r0)
            r2.A9m(r4, r0)
            r4 = 1
            X.1OC r2 = X.DbT.A0U(r2, r4)
            X.H4G r0 = new X.H4G
            r0.<init>(r5, r6, r12, r3)
            r2.A00 = r0
            r5.schedule(r2)
            boolean r0 = r6.A05()
            java.lang.Boolean r0 = X.DbT.A0l(r0)
            r6.A09 = r0
            com.instagram.direct.messagethread.collections.model.DirectCollectionArguments r0 = X.C51966G9m.A0q(r11)
            com.instagram.model.direct.DirectThreadKey r14 = r0.A01
            com.instagram.direct.messagethread.collections.model.DirectCollectionArguments r0 = X.C51966G9m.A0q(r11)
            java.lang.String r12 = r0.A06
            if (r14 == 0) goto L_0x09b0
            if (r12 == 0) goto L_0x09b0
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r13)
            X.2Dm r3 = X.1bJ.A00(r0)
            java.util.List r15 = r5.A08
            boolean r0 = r15 instanceof java.util.Collection
            r2 = 0
            if (r0 == 0) goto L_0x0ab8
            boolean r0 = r15.isEmpty()
            if (r0 == 0) goto L_0x0ab8
        L_0x099d:
            r3.FKp(r14, r12, r2)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r13)
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r0)
            X.7MK r0 = new X.7MK
            r0.<init>(r14)
            r2.A00(r0)
        L_0x09b0:
            android.os.Bundle r2 = r5.requireArguments()
            r0 = 225(0xe1, float:3.15E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            int r3 = r2.getInt(r0)
            X.1Xj r2 = X.C51966G9m.A0v(r8)
            if (r2 == 0) goto L_0x0a2d
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r13)
            boolean r0 = X.I7Q.A08(r0)
            if (r0 == 0) goto L_0x0a2d
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r13)
            boolean r16 = X.I7Q.A09(r0, r2, r3)
            java.lang.Integer r21 = X.C51967G9n.A0l(r16)
            boolean r0 = X.I7Q.A0C(r6)
            if (r0 == 0) goto L_0x0a2d
            r0 = 0
            androidx.fragment.app.FragmentActivity r18 = r5.requireActivity()
            r12 = 2131952148(0x7f130214, float:1.954073E38)
            java.lang.String r22 = X.DbU.A0m(r5, r12)
            X.IxQ r12 = new X.IxQ
            r17 = r12
            r19 = r5
            r20 = r2
            r23 = r3
            r17.<init>(r18, r19, r20, r21, r22, r23)
            java.lang.String r15 = r6.A0F
            X.HMw r14 = X.C54665HMw.EMPTY_PRODUCT_AUTO_COLLECTION
            java.lang.String r14 = r14.A01
            boolean r14 = X.0qQ.A0K(r15, r14)
            if (r14 == 0) goto L_0x0aa4
            r0 = 2131956264(0x7f131228, float:1.9549079E38)
            java.lang.String r15 = X.DbU.A0m(r5, r0)
            r14 = 4
            X.EDL r0 = new X.EDL
            r0.<init>(r12, r5, r15, r14)
        L_0x0a12:
            android.content.Context r15 = r5.requireContext()
            com.instagram.common.session.UserSession r17 = X.AnonymousClass7TE.A0l(r13)
            if (r16 == 0) goto L_0x0aa0
            X.3Ym r20 = X.C243373Ym.NOT_SAVED
        L_0x0a1e:
            X.0eM r12 = r5.A0N
            java.lang.String r21 = X.DbS.A0t(r12)
            r18 = r2
            r22 = r3
            r16 = r0
            X.I7Q.A02(r15, r16, r17, r18, r19, r20, r21, r22)
        L_0x0a2d:
            boolean r12 = r6.A05()
            com.instagram.direct.messagethread.collections.model.DirectCollectionArguments r0 = X.C51966G9m.A0q(r11)
            java.lang.String r0 = r0.A05
            if (r0 == 0) goto L_0x0a6b
            X.1Xj r2 = X.C51966G9m.A0v(r8)
            if (r2 == 0) goto L_0x0a6b
            java.util.List r0 = r2.A3i()
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1D(r0)
            java.lang.String r0 = r6.A0F
            if (r12 == 0) goto L_0x0a9c
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x0a56
            java.lang.String r0 = r6.A0F
            r3.add(r0)
        L_0x0a56:
            X.3Ym r0 = X.C243373Ym.SAVED
            r2.EjB(r0)
        L_0x0a5b:
            X.1Xy r0 = r2.A0C
            r0.EjC(r3)
            X.0eM r0 = r5.A0J
            java.lang.Object r0 = r0.getValue()
            X.1E8 r0 = (X.1E8) r0
            r0.A01(r2, r4, r7)
        L_0x0a6b:
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r13)
            X.IOk r11 = X.C55124HcX.A00(r0)
            java.lang.String r4 = r6.A0F
            X.0qQ.A07(r4)
            java.lang.String r3 = r6.A0G
            X.1Xj r2 = r6.A04
            java.lang.Integer r0 = r6.A0E
            int r0 = X.AnonymousClass7TG.A0A(r0)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)
            r12 = r9
            r13 = r2
            r15 = r4
            r16 = r3
            r11.A03(r12, r13, r14, r15, r16)
            androidx.recyclerview.widget.RecyclerView r0 = r5.A00
            if (r0 != 0) goto L_0x0ae6
            java.lang.String r5 = "recyclerView"
        L_0x0a94:
            X.0qQ.A0F(r5)
            X.00P r2 = X.AnonymousClass00P.createAndThrow()
            throw r2
        L_0x0a9c:
            r3.remove(r0)
            goto L_0x0a5b
        L_0x0aa0:
            X.3Ym r20 = X.C243373Ym.SAVED
            goto L_0x0a1e
        L_0x0aa4:
            java.lang.String r15 = r6.A0F
            X.HMw r14 = X.C54665HMw.PRODUCT_AUTO_COLLECTION
            java.lang.String r14 = r14.A01
            boolean r14 = X.0qQ.A0K(r15, r14)
            if (r14 == 0) goto L_0x0a12
            r14 = 2
            X.H51 r0 = new X.H51
            r0.<init>((int) r14, (java.lang.Object) r6, (java.lang.Object) r12)
            goto L_0x0a12
        L_0x0ab8:
            java.util.Iterator r15 = r15.iterator()
        L_0x0abc:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x099d
            java.lang.Object r0 = r15.next()
            com.instagram.save.model.SavedCollection r0 = (com.instagram.save.model.SavedCollection) r0
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x0abc
            r2 = 1
            goto L_0x099d
        L_0x0ad1:
            java.lang.String r4 = "removed_media_fbids"
            goto L_0x094e
        L_0x0ad5:
            if (r12 == 0) goto L_0x0ae3
            java.lang.String r4 = "added_media_ids"
        L_0x0ad9:
            com.instagram.direct.messagethread.collections.model.DirectCollectionArguments r0 = X.C51966G9m.A0q(r11)
            java.lang.String r0 = r0.A00()
            goto L_0x0954
        L_0x0ae3:
            java.lang.String r4 = "removed_media_ids"
            goto L_0x0ad9
        L_0x0ae6:
            X.2Rw r0 = r0.A0A
            if (r0 == 0) goto L_0x0aed
            r0.notifyItemChanged(r10)
        L_0x0aed:
            X.H1P.A03(r5)
            r0 = -61959608(0xfffffffffc4e9248, float:-4.2903204E36)
            goto L_0x0cfb
        L_0x0af5:
            java.lang.IllegalArgumentException r2 = X.DbU.A0h()
            r0 = 1430900469(0x5549cef5, float:1.38681694E13)
            X.AnonymousClass0fD.A0C(r0, r1)
            throw r2
        L_0x0b00:
            r1 = 1322969918(0x4edaeb3e, float:1.83642496E9)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A01
            X.Hpe r3 = (X.C55917Hpe) r3
            java.lang.Object r1 = r0.A03
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            java.lang.Object r0 = r0.A02
            java.lang.Integer r0 = (java.lang.Integer) r0
            r3.A00(r1, r0)
            r0 = 1314501713(0x4e59b451, float:9.1311827E8)
            goto L_0x0b84
        L_0x0b1a:
            r1 = -2128590786(0xffffffff8120483e, float:-2.943919E-38)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A01
            X.Hpe r3 = (X.C55917Hpe) r3
            java.lang.Object r1 = r0.A03
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            java.lang.Object r0 = r0.A02
            java.lang.Integer r0 = (java.lang.Integer) r0
            r3.A00(r1, r0)
            r0 = -2021593850(0xffffffff8780ed06, float:-1.939861E-34)
            goto L_0x0b84
        L_0x0b34:
            r1 = 1997843331(0x7714ab83, float:3.0153852E33)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r1 = r0.A01
            X.Hpe r1 = (X.C55917Hpe) r1
            java.lang.Object r7 = r0.A03
            com.instagram.model.reels.Reel r7 = (com.instagram.model.reels.Reel) r7
            java.lang.Object r0 = r0.A02
            X.Hnj r0 = (X.C55803Hnj) r0
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r9 = r0.A04
            r0 = 1
            X.0qQ.A0B(r9, r0)
            java.util.List r10 = X.AnonymousClass7TE.A1I(r7)
            X.H07 r5 = r1.A00
            X.0eM r0 = r5.A09
            java.lang.Object r6 = r0.getValue()
            X.32A r6 = (X.AnonymousClass32A) r6
            X.0eM r0 = r5.A08
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r0)
            java.lang.String r0 = (java.lang.String) r0
            r6.A0C = r0
            androidx.fragment.app.FragmentActivity r4 = r5.getActivity()
            android.graphics.RectF r3 = r9.getAvatarBounds()
            r0 = 0
            X.IWn r1 = new X.IWn
            r1.<init>(r5, r0)
            X.Upq r0 = new X.Upq
            r0.<init>((android.app.Activity) r4, (android.graphics.RectF) r3, (X.C230222pE) r1)
            r6.A05 = r0
            X.3BQ r8 = X.AnonymousClass3BQ.CREATOR_INSPIRATION_HUB_ACCOUNT_TAB
            r11 = r10
            r12 = r10
            r6.A09(r7, r8, r9, r10, r11, r12)
            r0 = 1855211341(0x6e94474d, float:2.294499E28)
        L_0x0b84:
            X.AnonymousClass0fD.A0C(r0, r2)
            return
        L_0x0b88:
            r1 = 871804351(0x33f6adbf, float:1.1486872E-7)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r8 = r0.A01
            X.1Xj r8 = (X.1Xj) r8
            r3 = 1
            if (r8 == 0) goto L_0x0bc5
            boolean r2 = r8.CbC()
            if (r2 != r3) goto L_0x0bc5
            X.3Ym r11 = X.C243373Ym.NOT_SAVED
        L_0x0b9e:
            java.lang.Object r9 = r0.A03
            X.9ni r9 = (X.C388369ni) r9
            X.0eM r2 = r9.A05
            java.lang.Object r2 = r2.getValue()
            X.8Ns r2 = (X.C354878Ns) r2
            r7 = 0
            java.lang.Object r10 = r0.A02
            com.instagram.igds.components.mediabutton.IgdsMediaButton r10 = (com.instagram.igds.components.mediabutton.IgdsMediaButton) r10
            androidx.fragment.app.FragmentActivity r3 = r9.requireActivity()
            android.content.Context r4 = X.AnonymousClass7TE.A0S(r10)
            com.instagram.common.session.UserSession r6 = r9.A0O()
            X.293 r5 = r9.A04
            r2.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = -1471505965(0xffffffffa84a99d3, float:-1.1246608E-14)
            goto L_0x0cfb
        L_0x0bc5:
            X.3Ym r11 = X.C243373Ym.SAVED
            goto L_0x0b9e
        L_0x0bc8:
            r1 = -1181272290(0xffffffffb997371e, float:-2.884203E-4)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r7 = r0.A03
            com.instagram.creation.album.AlbumPostCapCropToggleButton r7 = (com.instagram.creation.album.AlbumPostCapCropToggleButton) r7
            android.content.Context r6 = X.AnonymousClass7TE.A0S(r7)
            java.lang.Object r2 = r0.A02
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            r12 = 0
            r5 = 0
            X.8Ov r4 = new X.8Ov
            r4.<init>(r6, r2, r12, r5)
            X.LMI r2 = r7.A00
            java.util.List r8 = r2.A01
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r8)
            java.util.Iterator r13 = r8.iterator()
        L_0x0bee:
            boolean r8 = r13.hasNext()
            if (r8 == 0) goto L_0x0c70
            java.lang.Object r9 = r13.next()
            X.514 r9 = (X.AnonymousClass514) r9
            r26 = 0
            int r11 = X.DbU.A02(r9, r5)
            r8 = 4
            if (r11 == r8) goto L_0x0c6c
            r8 = 6
            if (r11 == r8) goto L_0x0c68
            r8 = 5
            r10 = 2131238421(0x7f081e15, float:1.809312E38)
            if (r11 == r8) goto L_0x0c0f
            r10 = 2131238427(0x7f081e1b, float:1.8093132E38)
        L_0x0c0f:
            int r8 = r9.A02
            java.lang.String r20 = X.AnonymousClass7TE.A16(r6, r8)
            X.LMI r8 = r7.A00
            X.514 r8 = r8.A00
            if (r8 != r9) goto L_0x0c66
            r8 = 2131238067(0x7f081cb3, float:1.8092402E38)
            android.graphics.drawable.Drawable r15 = r6.getDrawable(r8)
        L_0x0c22:
            android.graphics.drawable.Drawable r16 = r6.getDrawable(r10)
            r8 = 2
            X.IVI r11 = new X.IVI
            r11.<init>((int) r8, (java.lang.Object) r9, (java.lang.Object) r7)
            android.content.res.Resources r10 = r7.getResources()
            int r22 = X.AnonymousClass7TE.A0B(r10)
            r8 = 2131165213(0x7f07001d, float:1.7944637E38)
            int r23 = r10.getDimensionPixelSize(r8)
            boolean r8 = X.C61670oa.A08()
            if (r8 == 0) goto L_0x0c49
            X.LMI r8 = r7.A00
            X.514 r8 = r8.A00
            if (r8 != r9) goto L_0x0c49
            r26 = 1
        L_0x0c49:
            r27 = 1
            X.8rI r14 = new X.8rI
            r19 = r12
            r21 = r5
            r24 = r5
            r25 = r5
            r28 = r5
            r29 = r5
            r30 = r5
            r18 = r11
            r17 = r12
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r2.add(r14)
            goto L_0x0bee
        L_0x0c66:
            r15 = 0
            goto L_0x0c22
        L_0x0c68:
            r10 = 2131238426(0x7f081e1a, float:1.809313E38)
            goto L_0x0c0f
        L_0x0c6c:
            r10 = 2131238424(0x7f081e18, float:1.8093126E38)
            goto L_0x0c0f
        L_0x0c70:
            r4.A02(r2)
            int r8 = r3.getHeight()
            android.content.res.Resources r6 = r7.getResources()
            r2 = 2131165217(0x7f070021, float:1.7944645E38)
            int r2 = r6.getDimensionPixelSize(r2)
            int r8 = r8 + r2
            X.0eP r2 = r4.A00()
            int r2 = X.C51969G9p.A0A(r2)
            int r8 = r8 - r2
            r4.showAsDropDown(r3, r5, r8)
            java.lang.Object r0 = r0.A01
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r0.onClick(r3)
            r0 = -1933464526(0xffffffff8cc1ac32, float:-2.9839995E-31)
            goto L_0x0cfb
        L_0x0c9a:
            r1 = 515710753(0x1ebd1f21, float:2.0024028E-20)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A03
            X.H1g r3 = (X.C54162H1g) r3
            X.0eM r2 = r3.A09
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r2)
            X.4JK r5 = X.AnonymousClass4JJ.A00(r2)
            java.lang.Object r2 = r0.A02
            X.Jvk r2 = (X.C61046Jvk) r2
            java.lang.String r8 = r2.A00
            X.0eM r4 = r3.A03
            com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState r2 = X.G9w.A0W(r4)
            java.lang.String r7 = r2.A0F
            com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState r2 = X.G9w.A0W(r4)
            java.lang.String r9 = r2.A0C
            com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState r2 = X.G9w.A0W(r4)
            java.lang.String r10 = r2.A0D
            com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState r2 = X.G9w.A0W(r4)
            java.lang.String r11 = r2.A0I
            java.lang.Object r2 = r4.getValue()
            com.instagram.contentnotes.ui.immersiveselfnote.ContentNotesImmersiveSelfNoteContent r2 = (com.instagram.contentnotes.ui.immersiveselfnote.ContentNotesImmersiveSelfNoteContent) r2
            com.instagram.contentnotes.data.metadata.ContentNoteMetadata r2 = r2.A00
            java.lang.String r12 = r2.A05
            java.lang.Object r2 = r4.getValue()
            com.instagram.contentnotes.ui.immersiveselfnote.ContentNotesImmersiveSelfNoteContent r2 = (com.instagram.contentnotes.ui.immersiveselfnote.ContentNotesImmersiveSelfNoteContent) r2
            com.instagram.contentnotes.data.metadata.ContentNoteMetadata r2 = r2.A00
            java.lang.Integer r6 = r2.A02
            java.lang.Object r0 = r0.A01
            android.view.View r0 = (android.view.View) r0
            android.content.Context r2 = r0.getContext()
            r0 = 2131957578(0x7f13174a, float:1.9551744E38)
            java.lang.String r13 = X.AnonymousClass7TE.A16(r2, r0)
            r5.A04(r6, r7, r8, r9, r10, r11, r12, r13)
            X.DbZ.A15(r3)
            r0 = -982954356(0xffffffffc5694e8c, float:-3732.9092)
        L_0x0cfb:
            X.AnonymousClass0fD.A0C(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ID0.onClick(android.view.View):void");
    }

    public ID0(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj3;
        this.A02 = obj2;
        this.A01 = obj;
    }
}
