package X;

import com.google.common.collect.MapMakerInternalMap;
import com.instagram.common.session.UserSession;
import java.util.Map;
import java.util.Set;

public final class GHH implements C250603lj {
    public final long A00;
    public final 02m A01;
    public final C61480nO A02;
    public final GHG A03;
    public final String A04;
    public final Map A05 = AnonymousClass7TE.A1H();
    public final Map A06;
    public final Set A07 = DbS.A0y();
    public final boolean A08;
    public final boolean A09;

    /* JADX WARNING: type inference failed for: r5v1, types: [X.0r1, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0131, code lost:
        if (r2 != null) goto L_0x0134;
     */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x018e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ATF(X.AnonymousClass30Y r35, X.C252093oY r36) {
        /*
            r34 = this;
            r14 = r34
            boolean r0 = r14.A08
            if (r0 == 0) goto L_0x0030
            r5 = r35
            if (r35 == 0) goto L_0x0030
            java.lang.Object r0 = r5.A03
            X.4bN r0 = (X.C267324bN) r0
            if (r0 == 0) goto L_0x0030
            r1 = r36
            if (r36 == 0) goto L_0x0030
            java.lang.Integer r4 = r1.CEk(r5)
            java.util.Map r3 = r14.A06
            java.lang.Object r7 = r3.get(r0)
            android.view.View r7 = (android.view.View) r7
            if (r7 == 0) goto L_0x0030
            float r2 = r1.CFe(r5)
            boolean r1 = r14.A09
            if (r1 == 0) goto L_0x0031
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x0031
        L_0x0030:
            return
        L_0x0031:
            java.lang.Object r1 = r5.A04
            X.GDe r1 = (X.C52058GDe) r1
            if (r1 == 0) goto L_0x005b
            int r21 = r1.A09()
        L_0x003b:
            int r2 = r4.intValue()
            r1 = 0
            if (r2 == r1) goto L_0x005e
            r1 = 1
            if (r2 == r1) goto L_0x005e
            int r1 = r0.hashCode()
            java.util.Map r0 = r14.A05
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.remove(r1)
            java.util.Set r0 = r14.A07
            r0.remove(r1)
            r3.clear()
            return
        L_0x005b:
            r21 = -1
            goto L_0x003b
        L_0x005e:
            int r20 = r0.hashCode()
            java.util.Set r6 = r14.A07
            java.lang.Integer r4 = java.lang.Integer.valueOf(r20)
            boolean r1 = r6.contains(r4)
            if (r1 != 0) goto L_0x0030
            java.util.Map r3 = r14.A05
            java.lang.Number r1 = X.C51966G9m.A14(r4, r3)
            r12 = -1
            if (r1 == 0) goto L_0x01c5
            long r10 = r1.longValue()
        L_0x007c:
            long r8 = android.os.SystemClock.elapsedRealtime()
            int r1 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r1 == 0) goto L_0x008b
            long r1 = r14.A00
            long r10 = r10 + r1
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r1 <= 0) goto L_0x0030
        L_0x008b:
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            r3.put(r4, r1)
            X.0rm r1 = X.C51965G9l.A11()
            r2 = 2131443767(0x7f0b4037, float:1.8509611E38)
            android.view.View r3 = r7.findViewById(r2)
            r1.A00 = r3
            X.0r1 r5 = new X.0r1
            r5.<init>()
            if (r3 != 0) goto L_0x00b1
            java.lang.String r2 = "automated_video_caption_view_tag"
            android.view.View r3 = r7.findViewWithTag(r2)
            r1.A00 = r3
            r2 = 1
            r5.A00 = r2
        L_0x00b1:
            if (r3 == 0) goto L_0x0030
            int r2 = r3.getVisibility()
            if (r2 != 0) goto L_0x0030
            r6.add(r4)
            java.lang.String r15 = X.C51966G9m.A1B(r0)
            if (r15 != 0) goto L_0x00c4
            java.lang.String r15 = "ad_id_undefined"
        L_0x00c4:
            X.GHG r2 = r14.A03
            X.2is r3 = r2.A00
            X.GBE r2 = r3.A09
            if (r2 == 0) goto L_0x01c9
            X.GHv r6 = r2.A0x
            X.GBn r2 = r6.A07
            X.4Nf r7 = r2.Auf()
            r22 = 0
            if (r7 == 0) goto L_0x0117
            X.Jw6 r2 = r6.A00
            r4 = 1
            if (r2 == 0) goto L_0x0117
            java.lang.Object r2 = r2.A03
            X.1Xj r2 = (X.1Xj) r2
            if (r2 == 0) goto L_0x0117
            com.instagram.common.session.UserSession r6 = r6.A06
            boolean r7 = r7.A00
            java.lang.Boolean r25 = java.lang.Boolean.valueOf(r7)
            boolean r30 = r2.CcK()
            boolean r31 = r2.CeS()
            boolean r32 = r2.A51()
            boolean r33 = r2.A4L()
            java.util.List r28 = X.C51965G9l.A0w(r2)
            X.3WR r24 = r2.CEL()
            java.lang.String r26 = X.C51973G9u.A0k(r2)
            java.lang.String r27 = X.C51966G9m.A1D(r2)
            r23 = r6
            r29 = r22
            boolean r2 = X.AnonymousClass3WP.A09(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            if (r2 != r4) goto L_0x0117
            r22 = 1
        L_0x0117:
            java.lang.Object r6 = r1.A00
            boolean r4 = r6 instanceof android.widget.TextView
            r2 = 3632(0xe30, float:5.09E-42)
            java.lang.String r8 = X.AnonymousClass000.A00(r2)
            if (r4 == 0) goto L_0x0191
            android.widget.TextView r6 = (android.widget.TextView) r6
            if (r6 == 0) goto L_0x0133
            java.lang.CharSequence r2 = r6.getText()
            if (r2 == 0) goto L_0x0133
            java.lang.String r2 = r2.toString()
            if (r2 != 0) goto L_0x0134
        L_0x0133:
            r2 = r8
        L_0x0134:
            X.1Xj r4 = r0.A02
            if (r4 == 0) goto L_0x0140
            X.1Xy r4 = r4.A0C
            java.lang.String r17 = r4.getVideoSubtitlesUri()
            if (r17 != 0) goto L_0x0142
        L_0x0140:
            r17 = r8
        L_0x0142:
            X.1Xj r4 = r0.A02
            if (r4 == 0) goto L_0x018e
            boolean r23 = r4.A51()
        L_0x014a:
            X.1Xj r4 = r0.A02
            if (r4 == 0) goto L_0x018b
            X.1Xy r4 = r4.A0C
            java.lang.Boolean r6 = r4.CEQ()
            r4 = 0
            boolean r4 = X.AnonymousClass7TF.A1Y(r6, r4)
            r24 = r4 ^ 1
        L_0x015b:
            X.1Xj r0 = r0.A02
            if (r0 == 0) goto L_0x0188
            boolean r25 = r0.CeS()
        L_0x0163:
            X.GBE r0 = r3.A09
            if (r0 == 0) goto L_0x01c9
            X.GHv r0 = r0.A0x
            X.GBn r0 = r0.A07
            X.4Nf r0 = r0.Auf()
            if (r0 == 0) goto L_0x0186
            boolean r3 = r0.A00
        L_0x0173:
            X.0nO r0 = r14.A02
            X.H8M r13 = new X.H8M
            r18 = r5
            r19 = r1
            r26 = r3
            r16 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r0.ATE(r13)
            return
        L_0x0186:
            r3 = 0
            goto L_0x0173
        L_0x0188:
            r25 = 0
            goto L_0x0163
        L_0x018b:
            r24 = 0
            goto L_0x015b
        L_0x018e:
            r23 = 0
            goto L_0x014a
        L_0x0191:
            boolean r2 = r6 instanceof com.facebook.litho.ComponentHost
            if (r2 == 0) goto L_0x0133
            java.lang.String r2 = ""
            com.facebook.litho.ComponentHost r6 = (com.facebook.litho.ComponentHost) r6
            java.util.List r4 = r6.getDrawables()
            java.util.Iterator r7 = r4.iterator()
        L_0x01a1:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L_0x0134
            java.lang.Object r6 = r7.next()
            android.graphics.drawable.Drawable r6 = (android.graphics.drawable.Drawable) r6
            boolean r4 = r6 instanceof X.C246283eK
            if (r4 == 0) goto L_0x01a1
            X.3eK r6 = (X.C246283eK) r6
            java.lang.CharSequence r4 = r6.A0D
            if (r4 == 0) goto L_0x01bd
            java.lang.String r6 = r4.toString()
            if (r6 != 0) goto L_0x01be
        L_0x01bd:
            r6 = r8
        L_0x01be:
            r4 = 124(0x7c, float:1.74E-43)
            java.lang.String r2 = X.002.A0S(r2, r6, r4)
            goto L_0x01a1
        L_0x01c5:
            r10 = -1
            goto L_0x007c
        L_0x01c9:
            java.lang.String r0 = "clipsViewerFragmentViewModel"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GHH.ATF(X.30Y, X.3oY):void");
    }

    public /* synthetic */ GHH(UserSession userSession, GHG ghg) {
        C61480nO A002 = 0nY.A00();
        02m r1 = 02m.A0p;
        C51973G9u.A0r(1, userSession, A002, r1);
        this.A03 = ghg;
        this.A02 = A002;
        this.A01 = r1;
        17j r12 = new 17j();
        r12.A04(MapMakerInternalMap.Strength.A01);
        r12.A01();
        this.A06 = r12.A00();
        0Tu r4 = 0Tu.A05;
        this.A00 = (long) 182.A00(r4, userSession, 37162651205304566L);
        this.A08 = 182.A06(r4, userSession, 36318226275112965L);
        this.A09 = 182.A06(r4, userSession, 36318226275440649L);
        this.A04 = AnonymousClass7TG.A0j();
    }
}
