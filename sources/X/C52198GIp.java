package X;

import android.content.Context;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;

/* renamed from: X.GIp  reason: case insensitive filesystem */
public final class C52198GIp extends C251343mx {
    public final UserSession A00;
    public final JR1 A01;
    public final C52197GIo A02;
    public final ClipsViewerConfig A03;
    public final JTB A04;
    public final JTE A05;
    public final JQX A06;
    public final boolean A07;

    /* JADX WARNING: type inference failed for: r0v27, types: [X.Gtl] */
    /* JADX WARNING: type inference failed for: r12v3, types: [X.2T3, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00ab, code lost:
        if (r14.A5l() != false) goto L_0x00ad;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0244  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C251263mp A0X(X.AnonymousClass3Y5 r25) {
        /*
            r24 = this;
            r8 = 0
            r9 = r25
            X.0qQ.A0B(r9, r8)
            java.util.LinkedHashMap r7 = X.AnonymousClass7TE.A1H()
            r10 = r24
            X.GIo r6 = r10.A02
            java.util.List r0 = r6.A05
            r23 = r0
            java.util.Iterator r11 = r23.iterator()
        L_0x0016:
            boolean r0 = r11.hasNext()
            java.lang.String r5 = "trans_key_secondary_pill_fade"
            if (r0 == 0) goto L_0x004a
            java.lang.Object r4 = r11.next()
            X.JP3 r4 = (X.JP3) r4
            boolean r0 = r4 instanceof X.GK5
            if (r0 == 0) goto L_0x0041
            X.GK5 r4 = (X.GK5) r4
            X.JTE r3 = r10.A05
            X.2WX r2 = r10.A00(r9, r5)
            com.instagram.common.session.UserSession r0 = r10.A00
            X.GK6 r1 = new X.GK6
            r1.<init>(r2, r0, r3, r4)
            boolean r0 = r4.A08
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.put(r1, r0)
            goto L_0x0016
        L_0x0041:
            boolean r0 = r4 instanceof X.C52194GIl
            if (r0 != 0) goto L_0x0016
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x004a:
            X.JMg r13 = r6.A02
            boolean r0 = r13 instanceof X.GK3
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0177
            r12 = r3
        L_0x0053:
            r22 = 0
        L_0x0055:
            java.lang.String r14 = "trans_key_music_pill_fade"
            X.2WX r13 = r10.A00(r9, r14)
            X.JMi r11 = r6.A03
            boolean r0 = r11 instanceof X.C53579Gqu
            if (r0 == 0) goto L_0x013e
            X.0wj r2 = X.0wj.A01
            r1 = 817902720(0x30c03480, float:1.398476E-9)
            java.lang.String r0 = "OrganicAttributionComponent"
            X.0f9 r2 = r2.AEf(r0, r1)
            java.lang.String r1 = "message"
            java.lang.String r0 = "Sponsored music attribution not supported in OrganicAttributionComponent"
            r2.ABQ(r1, r0)
            r2.report()
        L_0x0076:
            r0 = r3
        L_0x0077:
            X.3Zd r15 = X.C243533Zd.LOCAL
            java.lang.String r2 = "trans_key_attribution_hub_fade"
            java.lang.String r1 = "trans_key_overflow_pill_fade"
            java.lang.String[] r1 = new java.lang.String[]{r2, r14, r5, r1}
            X.4Ey r11 = X.2Vi.A01(r15, r1)
            r1 = 300(0x12c, float:4.2E-43)
            X.C51966G9m.A1M(r11, r1)
            X.3du r1 = X.C246033ds.A00
            float r5 = X.C51970G9q.A03(r11, r1)
            r11.A02(r5)
            X.AnonymousClass4F7.A00(r9, r11)
            X.3XV r1 = X.2WX.A02
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            X.2WX r13 = X.C51971G9r.A0X(r3, r1, r5, r4)
            X.1Xj r14 = r6.A01
            boolean r1 = r14.A4z()
            if (r1 != 0) goto L_0x00ad
            boolean r1 = r14.A5l()
            r11 = 0
            if (r1 == 0) goto L_0x00ae
        L_0x00ad:
            r11 = 1
        L_0x00ae:
            com.instagram.common.session.UserSession r5 = r10.A00
            boolean r1 = r14.CcK()
            boolean r1 = X.C52114GFi.A05(r5, r1, r11)
            r11 = 0
            if (r1 == 0) goto L_0x0125
            X.2V1 r1 = r9.Aqq()
        L_0x00bf:
            X.2WX r11 = X.C51971G9r.A0V(r1, r3, r15, r2)
        L_0x00c3:
            X.2WX r2 = r13.A00(r11)
            X.2Wb r1 = X.C51972G9s.A0Q(r9)
            boolean r3 = r10.A07
            if (r3 == 0) goto L_0x0244
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            r3.add(r12)
            r3.add(r0)
            java.util.Set r0 = r7.keySet()
            java.util.List r0 = X.00k.A0a(r0)
            r3.addAll(r0)
            java.util.List r0 = X.00k.A0X(r3)
            java.util.ArrayList r11 = X.00k.A0U(r0)
            java.util.Iterator r14 = r11.iterator()
        L_0x00f4:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x01de
            java.lang.Object r13 = r14.next()
            X.3mp r13 = (X.C251263mp) r13
            X.2T3 r12 = new X.2T3
            r12.<init>()
            X.2V1 r5 = r1.A00
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            X.2Wb r0 = new X.2Wb
            r0.<init>(r5, r3)
            r0.A00(r13)
            X.2Tp r0 = X.C243563Zg.A0A(r0, r1)
            r0.A0L(r5, r12, r8, r8)
            int r0 = r12.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.add(r0)
            goto L_0x00f4
        L_0x0125:
            X.JR1 r5 = r10.A01
            X.4bN r2 = r6.A00
            boolean r1 = r5.CRr(r2)
            if (r1 != 0) goto L_0x0135
            boolean r1 = r5.CRs(r2)
            if (r1 == 0) goto L_0x00c3
        L_0x0135:
            X.2V1 r1 = r9.Aqq()
            X.3Zd r15 = X.C243533Zd.GLOBAL
            java.lang.String r2 = "trans_key_autoscroll_attribution_hub"
            goto L_0x00bf
        L_0x013e:
            boolean r0 = r11 instanceof X.C52283GLz
            if (r0 != 0) goto L_0x0076
            boolean r0 = r11 instanceof X.C53578Gqt
            if (r0 == 0) goto L_0x0153
            com.instagram.common.session.UserSession r2 = r10.A00
            X.Gqt r11 = (X.C53578Gqt) r11
            X.JTB r1 = r10.A04
            X.Gtl r0 = new X.Gtl
            r0.<init>(r13, r2, r1, r11)
            goto L_0x0077
        L_0x0153:
            boolean r0 = r11 instanceof X.C52201GIs
            if (r0 == 0) goto L_0x026d
            X.GIs r11 = (X.C52201GIs) r11
            X.JQX r0 = r10.A06
            r16 = r0
            com.instagram.common.session.UserSession r15 = r10.A00
            com.instagram.clips.intf.ClipsViewerConfig r2 = r10.A03
            X.JTE r1 = r10.A05
            X.GIt r0 = new X.GIt
            r18 = r15
            r19 = r1
            r20 = r11
            r21 = r16
            r16 = r13
            r17 = r2
            r15 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0077
        L_0x0177:
            boolean r0 = r13 instanceof X.C53577Gqs
            if (r0 == 0) goto L_0x027b
            X.Gqs r13 = (X.C53577Gqs) r13
            int r0 = r13.A00
            if (r0 != r8) goto L_0x0272
            com.instagram.common.session.UserSession r11 = r10.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36327396030298523(0x810f930000399b, double:3.0369297560189005E-306)
            boolean r0 = X.182.A06(r2, r11, r0)
            if (r0 == 0) goto L_0x01d6
            X.JTE r1 = r10.A05
        L_0x0192:
            X.JPr r1 = (X.C59597JPr) r1
            X.2WX r0 = r10.A00(r9, r3)
            X.GtF r12 = new X.GtF
            r12.<init>(r13, r0, r1)
            boolean r0 = X.1KU.A07(r11)
            if (r0 == 0) goto L_0x0053
            X.0qQ.A0B(r11, r8)
            r0 = 36321254227256522(0x8109fd000324ca, double:3.033045655044083E-306)
            boolean r0 = X.182.A06(r2, r11, r0)
            if (r0 == 0) goto L_0x0053
            android.content.Context r0 = X.C243803a8.A00(r9)
            android.content.res.Resources r1 = X.AnonymousClass7TF.A0A(r0)
            r0 = 2131165218(0x7f070022, float:1.7944647E38)
            int r22 = r1.getDimensionPixelSize(r0)
            r0 = 2131165255(0x7f070047, float:1.7944722E38)
            int r2 = r1.getDimensionPixelSize(r0)
            r0 = 2131165190(0x7f070006, float:1.794459E38)
            int r1 = r1.getDimensionPixelSize(r0)
            int r0 = r2 * 2
            int r22 = r22 + r0
            int r22 = r22 + r1
            goto L_0x0055
        L_0x01d6:
            X.JTB r0 = r10.A04
            X.Idy r1 = new X.Idy
            r1.<init>(r0)
            goto L_0x0192
        L_0x01de:
            X.2V1 r0 = r1.Aqq()
            android.content.Context r0 = r0.A0C
            android.content.res.Resources r0 = X.AnonymousClass7TF.A0A(r0)
            int r12 = X.AnonymousClass3ZC.A00(r0)
            int r8 = X.00k.A02(r6)
            int r5 = r11.size()
            int r5 = r5 - r4
            r3 = 0
        L_0x01f6:
            r0 = -1
            if (r0 >= r5) goto L_0x0227
            if (r8 <= r12) goto L_0x0227
            java.lang.Object r13 = r11.get(r5)
            boolean r0 = r13 instanceof X.GK6
            if (r0 == 0) goto L_0x0224
            java.lang.Object r13 = r7.get(r13)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            boolean r0 = X.0qQ.A0K(r13, r0)
            if (r0 == 0) goto L_0x0224
            int r3 = r3 + 1
            java.lang.Object r0 = r6.get(r5)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r8 = r8 - r0
            r11.remove(r5)
            r6.remove(r5)
        L_0x0224:
            int r5 = r5 + -1
            goto L_0x01f6
        L_0x0227:
            if (r3 <= 0) goto L_0x0230
            X.GLT r0 = r10.A04(r1, r3)
            r11.add(r0)
        L_0x0230:
            java.util.Iterator r3 = r11.iterator()
        L_0x0234:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0268
            java.lang.Object r0 = r3.next()
            X.3mp r0 = (X.C251263mp) r0
            r1.A00(r0)
            goto L_0x0234
        L_0x0244:
            r1.A00(r12)
            r1.A00(r0)
            java.util.Set r0 = r7.keySet()
            java.lang.Object r0 = X.00k.A0A(r0)
            X.3mp r0 = (X.C251263mp) r0
            r1.A00(r0)
            java.lang.Object r0 = X.00k.A0I(r23)
            X.JP3 r0 = (X.JP3) r0
            int r0 = r0.BXC()
            X.GLT r0 = r10.A04(r1, r0)
            r1.A00(r0)
        L_0x0268:
            X.2Tp r0 = X.C243563Zg.A0B(r1, r9, r2)
            return r0
        L_0x026d:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0272:
            if (r0 != r4) goto L_0x027b
            java.lang.String r0 = "AudioControlSponsoredUiState not supported in OrganicAttributionComponent"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x027b:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52198GIp.A0X(X.3Y5):X.3mp");
    }

    private final 2WX A00(C70832Wc r5, String str) {
        2WX r3 = null;
        if (C262624Fg.A00(this.A00)) {
            AnonymousClass3XV r0 = 2WX.A02;
            r3 = new 2WX((2WX) null, new C243543Ze(r5.Aqq(), C243533Zd.LOCAL, str));
        }
        C52195GIm gIm = C52195GIm.A00;
        Context context = r5.Aqq().A0C;
        0qQ.A07(context);
        return gIm.A00(context, this.A02.A06).A00(r3);
    }

    private final GLT A04(C70832Wc r7, int i) {
        2WX A002 = A00(r7, "trans_key_overflow_pill_fade");
        C59511JMj jMj = this.A02.A04;
        if (!(jMj instanceof GLQ)) {
            return null;
        }
        return new GLT(A002, this.A00, this.A05, (GLQ) jMj, i);
    }

    public C52198GIp(ClipsViewerConfig clipsViewerConfig, UserSession userSession, JTB jtb, JR1 jr1, JTE jte, C52197GIo gIo, JQX jqx, boolean z) {
        C51974G9v.A1S(userSession, gIo, jte, jqx, clipsViewerConfig);
        AnonymousClass7TF.A1F(jtb, 7, jr1);
        this.A00 = userSession;
        this.A02 = gIo;
        this.A05 = jte;
        this.A06 = jqx;
        this.A03 = clipsViewerConfig;
        this.A04 = jtb;
        this.A01 = jr1;
        this.A07 = z;
    }
}
