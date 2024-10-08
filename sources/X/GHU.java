package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

public final class GHU extends C251343mx {
    public final GEG A00;
    public final ClipsViewerConfig A01;
    public final C267324bN A02;
    public final C52058GDe A03;
    public final UserSession A04;
    public final AnonymousClass3NK A05;
    public final AnonymousClass4DU A06;
    public final JTB A07;
    public final C52046GCs A08;
    public final boolean A09;
    public final boolean A0A;
    public final GJH A0B;
    public final JP4 A0C;
    public final C59515JMn A0D;

    public static final void A07(View.OnClickListener onClickListener, C70832Wc r6, CharSequence charSequence, 0r1 r8, 0rm r9) {
        r8.A00 = false;
        ((SpannableStringBuilder) r9.A00).append(C244013aV.A0E(r6, 2131961000));
        int length = ((SpannableStringBuilder) r9.A00).length();
        ((SpannableStringBuilder) r9.A00).append(charSequence);
        ((SpannableStringBuilder) r9.A00).setSpan(new C46679Dj8(onClickListener, 16), length, ((SpannableStringBuilder) r9.A00).length(), 17);
    }

    public final C251263mp A0X(AnonymousClass3Y5 r43) {
        JP4 jp4;
        AnonymousClass3Y5 r6 = r43;
        0qQ.A0B(r6, 0);
        C267324bN r15 = this.A02;
        1Xj r14 = r15.A02;
        if (r14 != null) {
            String moduleName = this.A06.getModuleName();
            C243673Zt A002 = C243633Zp.A00(r6, GHX.A00);
            UserSession userSession = this.A04;
            0qQ.A0B(userSession, 0);
            ((GJG) userSession.A01(GJG.class, new C20609Wvq(userSession, 42))).A00 = "false";
            C52046GCs gCs = this.A08;
            C238863Ds r7 = C238863Ds.SUBTITLE;
            J6F A003 = J6F.A00(this, 24);
            C244023aW A004 = GHY.A00(C56801ICy.A00(A003, 67), r7, gCs.A00, (Integer) null);
            C59515JMn jMn = this.A0D;
            if (!(jMn instanceof GJA) && (jMn instanceof C53580Gqv)) {
                int i = 0;
                ArrayList A1C = AnonymousClass7TE.A1C();
                C53580Gqv gqv = (C53580Gqv) jMn;
                for (GJH A005 : gqv.A00) {
                    A1C.add(A00(A004, A002, r6, r14, A005, moduleName, true));
                }
                for (JP3 jp3 : gqv.A01) {
                    i = jp3.BXC();
                    if (jp3 instanceof GK5) {
                        Context context = r6.A05.A0C;
                        0qQ.A07(context);
                        GK5 gk5 = (GK5) jp3;
                        CharSequence A006 = C66909Mes.A00(context, gk5.A03);
                        Drawable A0D2 = C244013aV.A0D(r6, gk5.A01);
                        A0D2.setColorFilter(AnonymousClass37O.A00(r6.Bnf().A02(R.color.canvas_bottom_sheet_description_text_color)));
                        long A062 = C244013aV.A06(r6);
                        AnonymousClass3XV r72 = 2WX.A02;
                        GH5 gh5 = new GH5(A0D2, (ImageView.ScaleType) null, new 2WX(new 2WX(new 2WX(new 2WX((2WX) null, new AnonymousClass9JR(AnonymousClass05K.A00, 0, A062)), new AnonymousClass9JR(AnonymousClass05K.A01, 0, A062)), new AnonymousClass9JQ(AnonymousClass05K.A0C, 0.0f, 1)), new AnonymousClass9JR(AnonymousClass05K.A08, 0, 9221401712017801224L)), false);
                        2WX r10 = new 2WX((2WX) null, new AnonymousClass9JR(AnonymousClass05K.A09, 0, C244013aV.A03(r6)));
                        long A0A2 = C244013aV.A0A(r6);
                        Integer num = AnonymousClass05K.A0u;
                        2WX r9 = new 2WX(r10, new AnonymousClass9JR(num, 0, A0A2));
                        2Wb r5 = new 2Wb(r6.Aqq(), new ArrayList());
                        r5.A00(gh5);
                        2WX r0 = new 2WX((2WX) null, new AnonymousClass9JR(num, 0, C244013aV.A05(r5)));
                        Integer valueOf = Integer.valueOf(R.attr.igds_color_secondary_text_on_media);
                        r5.A00(A05(TextUtils.TruncateAt.END, C56799ICw.A00, (AnonymousClass2VW) null, r5, r0, A006, valueOf, GN6.A00, GN5.A00, 0, true, false, false, false, false));
                        A1C.add(C243563Zg.A0G(r5, r6, r9));
                    }
                }
                if (AnonymousClass7TE.A1b(00k.A0X(A1C)) && (jp4 = this.A0C) != null) {
                    C52058GDe gDe = this.A03;
                    if (!gDe.A0R) {
                        int A092 = gDe.A09();
                        JTB jtb = this.A07;
                        AnonymousClass4Ew r2 = C53909GwF.A09;
                        return new C53909GwF(r15, gDe, userSession, r14, jtb, jp4, 00k.A0X(A1C), A092, i);
                    }
                }
            }
            return A00(A004, A002, r6, r14, this.A0B, moduleName, false);
        }
        throw AnonymousClass7TE.A0y();
    }

    private final 2Tp A04(View.OnClickListener onClickListener, AnonymousClass2VW r24, C243673Zt r25, C70832Wc r26, C62320sa r27, int i, int i2, boolean z) {
        C70832Wc r5 = r26;
        String A0E = C244013aV.A0E(r5, i);
        Drawable A0D2 = C244013aV.A0D(r5, i2);
        C51973G9u.A0x(A0D2, r5, R.color.fundraiser_sticker_donate_button_background_color);
        long A062 = C244013aV.A06(r5);
        AnonymousClass3XV r2 = 2WX.A02;
        Integer num = AnonymousClass05K.A00;
        GH5 gh5 = new GH5(A0D2, (ImageView.ScaleType) null, AnonymousClass9JR.A00(C51971G9r.A0X(C51974G9v.A0M((2WX) null, num, 0, A062), AnonymousClass05K.A0C, 0.0f, 1), AnonymousClass05K.A08, 0, 9221401712017801224L), false);
        2WX A002 = AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A09, 0, C244013aV.A03(r5));
        long A0A2 = C244013aV.A0A(r5);
        Integer num2 = AnonymousClass05K.A0u;
        2WX A0Z = C51971G9r.A0Z(AnonymousClass9JR.A00(A002, num2, 0, A0A2), num, J6R.A00(r27, r25, 47), (String) null);
        2Wb A0v = G9t.A0v(gh5, r5.Aqq());
        return C51967G9n.A0P(A05(TextUtils.TruncateAt.END, onClickListener, r24, A0v, AnonymousClass9JR.A00((2WX) null, num2, 0, C244013aV.A05(A0v)), A0E, Integer.valueOf(R.attr.igds_color_secondary_text_on_media), GN6.A00, GN5.A00, 0, true, false, false, false, z), A0v, r5, A0Z);
    }

    private final 2WW A05(TextUtils.TruncateAt truncateAt, View.OnClickListener onClickListener, AnonymousClass2VW r22, C70832Wc r23, 2WX r24, CharSequence charSequence, Integer num, 0sP r27, 0sP r28, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Integer num2;
        long A0A2;
        long j;
        long A0A3;
        int i2;
        2WX r5 = null;
        if (this.A0D instanceof C53580Gqv) {
            num2 = Integer.valueOf(R.attr.igds_color_secondary_text_on_media);
        } else {
            num2 = null;
        }
        2WX r8 = 2WX.A02;
        2WX r7 = r8;
        CharSequence charSequence2 = charSequence;
        if (charSequence != null) {
            r8 = C51971G9r.A0Y((2WX) null, AnonymousClass05K.A0N, charSequence2, 0);
        }
        C70832Wc r9 = r23;
        if (z2) {
            A0A2 = 9221401712017801216L;
        } else {
            A0A2 = C244013aV.A0A(r9);
        }
        if (z3) {
            j = 9221401712017801216L;
        } else {
            j = 9221401712017801224L;
        }
        AnonymousClass9JR A0c = C51965G9l.A0c(AnonymousClass05K.A08, 0, j);
        if (r8 == r7) {
            r8 = null;
        }
        2WX A0R = C51973G9u.A0R(r8, A0c, 0, A0A2);
        if (z4) {
            A0A3 = C51969G9p.A0D();
        } else {
            A0A3 = C244013aV.A0A(r9);
        }
        2WX A0Y = C51971G9r.A0Y(C51972G9s.A0R(A0R, 0, A0A3), AnonymousClass05K.A1F, J6F.A00(onClickListener, 25), 4);
        J6F A002 = J6F.A00(r27, 26);
        Integer num3 = AnonymousClass05K.A00;
        2WX A0Z = C51971G9r.A0Z(A0Y, num3, A002, (String) null);
        if (i != 0) {
            A0Z = C51971G9r.A0Y(A0Z, AnonymousClass05K.A0B, Integer.valueOf(i), 4);
        }
        2WX A003 = C51971G9r.A0Y(A0Z, AnonymousClass05K.A04, J6F.A00(r28, 27), 4).A00(r24);
        if (z5) {
            r5 = G9t.A0x((2WX) null, AnonymousClass05K.A0C, 0.0f);
        }
        2WX A004 = A003.A00(r5);
        2V1 Aqq = r9.Aqq();
        Context context = Aqq.A0C;
        if (num != null) {
            i2 = num.intValue();
        } else if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = R.attr.igds_color_primary_text_on_media;
        }
        int A0A4 = C51972G9s.A0A(context, r9, i2);
        long A0G = C51972G9s.A0G(12.0f);
        UserSession userSession = this.A04;
        long A032 = GHW.A03(userSession);
        int A022 = GHW.A02(userSession, C51969G9p.A08(r9, R.color.black));
        long A042 = GHW.A04(userSession);
        Integer A052 = GHW.A05(userSession, C51969G9p.A08(r9, R.color.black));
        Typeface typeface = Typeface.DEFAULT;
        long A0D2 = C51969G9p.A0D();
        C244103ae A13 = G9t.A13(Aqq, charSequence2, A0A4);
        C51971G9r.A1J(A13, r9.Bnf(), 0, A0G);
        A13.A0S(typeface);
        A13.A0O(A022);
        C51974G9v.A10(A13, r9, C51969G9p.A09(r9, A032), A0D2);
        C51974G9v.A11(A13, r9.Bnf(), A052, A042);
        A13.A0W(num3);
        C51974G9v.A15(A13, num3, 0, z);
        C51969G9p.A1J(A13);
        A13.A0T(truncateAt);
        return C51971G9r.A0c(r22, A004, A13);
    }

    private final 2WW A06(View.OnClickListener onClickListener, C70832Wc r18, CharSequence charSequence, 0sP r20, 0sP r21) {
        return A05(TextUtils.TruncateAt.END, onClickListener, (AnonymousClass2VW) null, r18, (2WX) null, charSequence, (Integer) null, r20, r21, 0, true, false, false, false, false);
    }

    public GHU(GEG geg, ClipsViewerConfig clipsViewerConfig, C267324bN r4, C52058GDe gDe, UserSession userSession, AnonymousClass3NK r7, AnonymousClass4DU r8, JTB jtb, GJH gjh, JP4 jp4, C59515JMn jMn, C52046GCs gCs, boolean z, boolean z2) {
        C51974G9v.A1S(userSession, r8, gDe, geg, clipsViewerConfig);
        AnonymousClass7TF.A1F(jtb, 7, gCs);
        C51969G9p.A1Q(r7, 10, gjh);
        this.A02 = r4;
        this.A04 = userSession;
        this.A06 = r8;
        this.A03 = gDe;
        this.A00 = geg;
        this.A01 = clipsViewerConfig;
        this.A07 = jtb;
        this.A08 = gCs;
        this.A05 = r7;
        this.A09 = z;
        this.A0D = jMn;
        this.A0C = jp4;
        this.A0A = z2;
        this.A0B = gjh;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v27, resolved type: android.text.SpannableStringBuilder} */
    /* JADX WARNING: type inference failed for: r10v2, types: [X.2VW, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r11v6, types: [android.view.View$OnClickListener] */
    /* JADX WARNING: type inference failed for: r2v31, types: [X.ICy] */
    /* JADX WARNING: type inference failed for: r8v8, types: [X.0r1, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v16, types: [X.0r1, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x03f8, code lost:
        if (X.AnonymousClass7TF.A1Y(r1.BXg(), true) != false) goto L_0x03fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0415, code lost:
        if (r1 != null) goto L_0x0417;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x041c, code lost:
        if (r4 != null) goto L_0x03e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0465, code lost:
        r1 = X.C56801ICy.A00(r0, r1);
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0471, code lost:
        r5 = X.C56799ICw.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0473, code lost:
        r12 = X.GN6.A00;
        r2 = X.GN5.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x048a, code lost:
        r1 = X.C56799ICw.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0496, code lost:
        return A06(r1, r7, r6, X.GN6.A00, X.GN5.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x056a, code lost:
        return A06(r5, r7, r6, r12, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x010f, code lost:
        if (X.182.A06(X.0Tu.A05, r3, 36326137605207591L) == false) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0299, code lost:
        if (X.GEK.A02(r3, r0.A04) == false) goto L_0x029b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x03ea  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.C251263mp A00(android.view.View.OnClickListener r39, X.C243673Zt r40, X.C70832Wc r41, X.1Xj r42, X.GJH r43, java.lang.String r44, boolean r45) {
        /*
            r38 = this;
            int r3 = r43.ordinal()
            r2 = 0
            r0 = r38
            r11 = r40
            r7 = r41
            r1 = r42
            r4 = r44
            switch(r3) {
                case 0: goto L_0x0047;
                case 1: goto L_0x02b3;
                case 2: goto L_0x02d4;
                case 3: goto L_0x026d;
                case 4: goto L_0x036d;
                case 5: goto L_0x02fa;
                case 6: goto L_0x030a;
                case 7: goto L_0x03c1;
                case 8: goto L_0x0479;
                case 9: goto L_0x046a;
                case 10: goto L_0x0499;
                case 11: goto L_0x0255;
                case 12: goto L_0x0226;
                case 13: goto L_0x0017;
                case 14: goto L_0x051e;
                case 15: goto L_0x04da;
                case 16: goto L_0x0548;
                case 17: goto L_0x0427;
                case 18: goto L_0x056b;
                default: goto L_0x0012;
            }
        L_0x0012:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0017:
            java.util.WeakHashMap r5 = new java.util.WeakHashMap
            r5.<init>()
            java.lang.String r4 = r1.A31()
            android.content.res.Resources r3 = X.C51971G9r.A0M(r7)
            r2 = 2131956148(0x7f1311b4, float:1.9548844E38)
            if (r4 == 0) goto L_0x0042
            android.text.Spanned r4 = X.DbU.A07(r3, r4, r2)
            X.0qQ.A07(r4)
            r3 = 30
            X.ID0 r2 = new X.ID0
            r2.<init>((int) r3, (java.lang.Object) r5, (java.lang.Object) r1, (java.lang.Object) r0)
            X.GN6 r5 = X.GN6.A00
            X.GN5 r6 = X.GN5.A00
            r1 = r0
            r3 = r7
            X.2WW r10 = r1.A06(r2, r3, r4, r5, r6)
            return r10
        L_0x0042:
            java.lang.IllegalArgumentException r0 = X.DbU.A0h()
            throw r0
        L_0x0047:
            X.0rm r9 = X.C51965G9l.A11()
            X.4bN r6 = r0.A02
            X.3OA r3 = r6.A06()
            java.lang.String r3 = r3.A0i
            android.text.SpannableStringBuilder r3 = X.DbS.A0C(r3)
            r9.A00 = r3
            boolean r13 = r0.A0A
            if (r13 == 0) goto L_0x0079
            X.GEG r3 = r0.A00
            boolean r3 = r3.A0K
            if (r3 != 0) goto L_0x0079
            r3 = 2131961000(0x7f1324a8, float:1.9558685E38)
            java.lang.String r3 = X.C244013aV.A0E(r7, r3)
            android.text.SpannableStringBuilder r4 = X.DbS.A0C(r3)
            r9.A00 = r4
            X.3OA r3 = r6.A06()
            java.lang.String r3 = r3.A0i
            r4.append(r3)
        L_0x0079:
            X.0r1 r8 = new X.0r1
            r8.<init>()
            r11 = 1
            r8.A00 = r11
            X.0r1 r4 = new X.0r1
            r4.<init>()
            r3 = 45
            X.ICy r17 = X.C56801ICy.A00(r0, r3)
            java.lang.Object r14 = r9.A00
            android.text.SpannableStringBuilder r14 = (android.text.SpannableStringBuilder) r14
            r5 = 16
            X.Dj8 r10 = new X.Dj8
            r3 = r17
            r10.<init>(r3, r5)
            r12 = 0
            java.lang.Object r3 = r9.A00
            android.text.SpannableStringBuilder r3 = (android.text.SpannableStringBuilder) r3
            int r5 = r3.length()
            r3 = 17
            r14.setSpan(r10, r12, r5, r3)
            boolean r3 = X.AnonymousClass3ZC.A0W(r1)
            if (r3 == 0) goto L_0x00ce
            boolean r3 = X.C231122qu.A0P(r2, r1)
            if (r3 != 0) goto L_0x00ce
            android.content.Context r10 = X.C243803a8.A00(r7)
            boolean r5 = r1.A5l()
            java.util.List r3 = r1.A3Q()
            android.text.SpannableStringBuilder r5 = X.C49946FGa.A01(r10, r3, r5)
            r3 = 49
            X.ICy r3 = X.C56801ICy.A00(r1, r3)
            A07(r3, r7, r5, r8, r9)
            r4.A00 = r11
        L_0x00ce:
            X.GEG r3 = r0.A00
            boolean r3 = r3.A05
            if (r3 == 0) goto L_0x00e5
            X.3OA r3 = r6.A06()
            java.lang.String r5 = r3.A0Z
            if (r5 == 0) goto L_0x0221
            r3 = 50
            X.ICy r3 = X.C56801ICy.A00(r0, r3)
            A07(r3, r7, r5, r8, r9)
        L_0x00e5:
            r3 = 8
            X.Iwx r15 = new X.Iwx
            r15.<init>(r3, r1, r0, r4)
            com.instagram.common.session.UserSession r3 = r0.A04
            X.0qQ.A0B(r3, r12)
            boolean r4 = r6.CcK()
            if (r4 == 0) goto L_0x0111
            boolean r4 = X.GEK.A00(r6)
            if (r4 != 0) goto L_0x0111
            boolean r4 = X.GEK.A01(r6)
            if (r4 != 0) goto L_0x0111
            X.0Tu r10 = X.0Tu.A05
            r4 = 36326137605207591(0x810e6e00053627, double:3.036133922924124E-306)
            boolean r5 = X.182.A06(r10, r3, r4)
            r4 = 1
            if (r5 != 0) goto L_0x0112
        L_0x0111:
            r4 = 0
        L_0x0112:
            java.lang.String r10 = "clips_sponsored_label_tag"
            if (r4 == 0) goto L_0x01d9
            com.instagram.clips.intf.ClipsViewerConfig r14 = r0.A01
            X.2V1 r16 = r7.Aqq()
            android.content.Context r19 = X.C51965G9l.A0B(r16)
            X.1Xj r5 = r6.A02
            if (r5 == 0) goto L_0x01d9
            X.1sQ r21 = X.C51966G9m.A0n(r5)
            X.GIT r18 = X.GIT.A00
            com.instagram.music.common.model.AudioOverlayTrack r4 = r14.A0Q
            if (r4 == 0) goto L_0x01d6
            com.instagram.music.common.model.MusicAssetModel r4 = r4.A08
        L_0x0130:
            r20 = r6
            r22 = r3
            r23 = r5
            r24 = r4
            X.4Ke r4 = r18.A02(r19, r20, r21, r22, r23, r24)
            if (r4 == 0) goto L_0x01d9
            java.lang.Object r5 = r9.A00
            android.text.SpannableStringBuilder r5 = (android.text.SpannableStringBuilder) r5
            r4 = 2131961000(0x7f1324a8, float:1.9558685E38)
            java.lang.String r4 = X.C244013aV.A0E(r7, r4)
            r5.append(r4)
            boolean r31 = X.GEK.A02(r6, r3)
            X.3Zh r33 = X.C243573Zh.CENTER
            X.2Wb r5 = X.AnonymousClass7TG.A0S(r16)
            java.lang.Object r4 = r9.A00
            android.text.SpannableStringBuilder r4 = (android.text.SpannableStringBuilder) r4
            boolean r9 = r8.A00
            X.3XV r7 = X.2WX.A02
            java.lang.Integer r8 = X.AnonymousClass05K.A0D
            r7 = 4
            X.2WX r8 = X.C51971G9r.A0Y(r2, r8, r10, r7)
            X.3aa r7 = X.C244063aa.SPONSORED_LABEL
            X.2WX r19 = X.C51973G9u.A0N(r7, r8)
            X.4DU r8 = r0.A06
            X.3Ds r18 = X.C238863Ds.SUBTITLE
            boolean r7 = r0.A09
            r21 = r3
            r22 = r8
            r23 = r7
            X.2WX r20 = X.GFM.A02(r18, r19, r20, r21, r22, r23)
            X.GN5 r24 = X.GN5.A00
            android.text.TextUtils$TruncateAt r16 = android.text.TextUtils.TruncateAt.END
            r25 = 2131430242(0x7f0b0b62, float:1.848218E38)
            r22 = r2
            r26 = r9
            r27 = r11
            r28 = r11
            r29 = r12
            r30 = r11
            r18 = r2
            r19 = r5
            r21 = r4
            r23 = r15
            r15 = r0
            X.2WW r4 = r15.A05(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r5.A00(r4)
            X.1sQ r26 = X.C51966G9m.A0n(r1)
            X.JTB r4 = r0.A07
            if (r31 == 0) goto L_0x01a8
            r17 = r2
        L_0x01a8:
            X.GDe r1 = r0.A03
            X.GMi r0 = new X.GMi
            r22 = r0
            r23 = r17
            r24 = r14
            r25 = r6
            r27 = r1
            r28 = r3
            r29 = r4
            r32 = r12
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r5.A00(r0)
            java.util.List r0 = r5.A01
            X.2Tp r10 = new X.2Tp
            r31 = r10
            r32 = r2
            r34 = r2
            r35 = r2
            r36 = r0
            r37 = r12
            r31.<init>(r32, r33, r34, r35, r36, r37)
            return r10
        L_0x01d6:
            r4 = 0
            goto L_0x0130
        L_0x01d9:
            java.lang.Object r1 = r9.A00
            android.text.SpannableStringBuilder r1 = (android.text.SpannableStringBuilder) r1
            boolean r4 = r8.A00
            X.3XV r5 = X.2WX.A02
            java.lang.Integer r8 = X.AnonymousClass05K.A0D
            r5 = 4
            X.2WX r8 = X.C51971G9r.A0Y(r2, r8, r10, r5)
            X.3aa r5 = X.C244063aa.SPONSORED_LABEL
            X.2WX r19 = X.C51973G9u.A0N(r5, r8)
            X.4DU r8 = r0.A06
            X.3Ds r18 = X.C238863Ds.SUBTITLE
            boolean r5 = r0.A09
            r20 = r6
            r21 = r3
            r22 = r8
            r23 = r5
            X.2WX r20 = X.GFM.A02(r18, r19, r20, r21, r22, r23)
            X.GN5 r24 = X.GN5.A00
            android.text.TextUtils$TruncateAt r16 = android.text.TextUtils.TruncateAt.END
            r25 = 2131430242(0x7f0b0b62, float:1.848218E38)
            r22 = r2
            r26 = r4
            r27 = r12
            r28 = r11
            r29 = r13
            r30 = r11
            r18 = r2
            r19 = r7
            r21 = r1
            r23 = r15
            r15 = r0
            X.2WW r10 = r15.A05(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            return r10
        L_0x0221:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0226:
            X.DTO r1 = r1.A1K()
            if (r1 == 0) goto L_0x0250
            java.lang.String r3 = r1.Bno()
            if (r3 == 0) goto L_0x0250
            android.content.res.Resources r2 = X.C51971G9r.A0M(r7)
            r1 = 2131956123(0x7f13119b, float:1.9548793E38)
            android.text.Spanned r3 = X.DbU.A07(r2, r3, r1)
            X.0qQ.A07(r3)
            r1 = 47
            X.ICy r1 = X.C56801ICy.A00(r0, r1)
            X.GN6 r4 = X.GN6.A00
            X.GN5 r5 = X.GN5.A00
            r2 = r7
            X.2WW r10 = r0.A06(r1, r2, r3, r4, r5)
            return r10
        L_0x0250:
            java.lang.IllegalArgumentException r0 = X.DbU.A0h()
            throw r0
        L_0x0255:
            android.content.Context r2 = X.C243803a8.A00(r7)
            java.lang.String r2 = r1.A34(r2)
            r1 = 2131955591(0x7f130f87, float:1.9547714E38)
            if (r2 == 0) goto L_0x0268
            java.lang.String r6 = X.C244013aV.A0F(r7, r2, r1)
            goto L_0x0471
        L_0x0268:
            java.lang.IllegalArgumentException r0 = X.DbU.A0h()
            throw r0
        L_0x026d:
            X.1sQ r14 = X.C51966G9m.A0n(r1)
            com.instagram.clips.intf.ClipsViewerConfig r5 = r0.A01
            X.JTB r4 = r0.A07
            X.4bN r3 = r0.A02
            boolean r1 = r3.CcK()
            if (r1 == 0) goto L_0x028b
            com.instagram.common.session.UserSession r1 = r0.A04
            boolean r1 = X.GEK.A02(r3, r1)
            if (r1 != 0) goto L_0x028b
            r1 = 45
            X.ICy r2 = X.C56801ICy.A00(r0, r1)
        L_0x028b:
            boolean r1 = r3.CcK()
            if (r1 == 0) goto L_0x029b
            com.instagram.common.session.UserSession r1 = r0.A04
            boolean r1 = X.GEK.A02(r3, r1)
            r19 = 1
            if (r1 != 0) goto L_0x029d
        L_0x029b:
            r19 = 0
        L_0x029d:
            r18 = 0
            com.instagram.common.session.UserSession r1 = r0.A04
            X.GDe r0 = r0.A03
            X.GMi r10 = new X.GMi
            r20 = r45
            r17 = r4
            r11 = r2
            r12 = r5
            r13 = r3
            r15 = r0
            r16 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r10
        L_0x02b3:
            android.content.Context r4 = X.C243803a8.A00(r7)
            com.instagram.common.session.UserSession r3 = r0.A04
            r2 = 2
            X.0qQ.A0B(r3, r2)
            android.text.SpannableString r6 = X.C52345GOp.A00(r4, r1)
            if (r6 != 0) goto L_0x02ca
            r1 = 2131955697(0x7f130ff1, float:1.9547929E38)
            java.lang.String r6 = X.AnonymousClass7TE.A16(r4, r1)
        L_0x02ca:
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r1 = 48
            X.ICy r5 = X.C56801ICy.A00(r0, r1)
            goto L_0x0473
        L_0x02d4:
            android.content.Context r5 = X.C243803a8.A00(r7)
            boolean r3 = r1.A5l()
            java.util.List r2 = r1.A3Q()
            android.text.SpannableStringBuilder r6 = X.C49946FGa.A01(r5, r2, r3)
            r2 = 10
            X.ID3 r5 = new X.ID3
            r5.<init>((X.1Xj) r1, (X.GHU) r0, (int) r2)
            r2 = 46
            X.J6R r12 = X.J6R.A00(r0, r1, r2)
            r3 = 45
            X.PmT r2 = new X.PmT
            r2.<init>(r0, r1, r4, r3)
            goto L_0x0561
        L_0x02fa:
            X.1Xy r1 = r1.A0C
            X.3ZV r1 = r1.AaD()
            if (r1 == 0) goto L_0x0497
            java.lang.String r6 = r1.Axr()
            if (r6 == 0) goto L_0x0497
            goto L_0x048a
        L_0x030a:
            X.4bN r8 = r0.A02
            com.instagram.user.model.User r4 = r8.A0K
            r10 = 0
            if (r4 == 0) goto L_0x03bb
            X.4Cl r1 = r4.A03
            java.lang.String r9 = r1.C9e()
            if (r9 == 0) goto L_0x03bb
            X.4Cl r1 = r4.A03
            java.lang.String r6 = r1.C9f()
            if (r6 == 0) goto L_0x03bb
            com.instagram.common.session.UserSession r5 = r0.A04
            android.content.Context r3 = X.C243803a8.A00(r7)
            java.lang.String r1 = r4.getId()
            X.RIv r11 = X.C8956RIv.REELS
            X.AnonymousClass3ZQ.A02(r3, r11, r5, r1, r6)
            X.1Xj r1 = r8.A02
            if (r1 == 0) goto L_0x034d
            java.lang.String r14 = r1.A2n()
            if (r14 == 0) goto L_0x034d
            X.70U r10 = new X.70U
            r10.<init>(r5)
            java.lang.String r12 = r4.getId()
            X.4Cl r1 = r4.A03
            java.lang.String r13 = r1.C9f()
            r15 = 0
            r10.A00(r11, r12, r13, r14, r15)
        L_0x034d:
            r3 = 11
            X.ID3 r1 = new X.ID3
            r1.<init>((int) r3, (java.lang.Object) r4, (java.lang.Object) r0)
            android.text.TextUtils$TruncateAt r4 = android.text.TextUtils.TruncateAt.MARQUEE
            X.GN6 r11 = X.GN6.A00
            X.GN5 r12 = X.GN5.A00
            r14 = 1
            r13 = 0
            r3 = r0
            r5 = r1
            r6 = r2
            r8 = r2
            r10 = r2
            r15 = r13
            r16 = r13
            r17 = r13
            r18 = r13
            X.2WW r10 = r3.A05(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r10
        L_0x036d:
            X.4bN r5 = r0.A02
            X.GDe r4 = r0.A03
            android.text.SpannableStringBuilder r15 = X.C51965G9l.A0E()
            X.1Xy r2 = r1.A0C
            java.lang.String r12 = r2.Ad2()
            if (r12 == 0) goto L_0x03bc
            android.content.Context r14 = X.C243803a8.A00(r7)
            com.instagram.common.session.UserSession r6 = r0.A04
            android.content.Context r3 = X.C243803a8.A00(r7)
            r2 = 2130970279(0x7f0406a7, float:1.7549264E38)
            int r18 = X.AnonymousClass7TF.A03(r3, r2)
            r19 = 1
            r13 = 21
            X.IoE r8 = new X.IoE
            r9 = r4
            r10 = r0
            r11 = r1
            r8.<init>(r9, r10, r11, r12, r13)
            r17 = r8
            r16 = r6
            X.C69766Nrp.A00(r14, r15, r16, r17, r18, r19)
            r3 = 9
            X.Iwx r2 = new X.Iwx
            r2.<init>(r3, r4, r0, r5)
            r13 = 3
            X.ICC r8 = new X.ICC
            r10 = r1
            r11 = r0
            r8.<init>(r9, r10, r11, r12, r13)
            X.GN5 r9 = X.GN5.A00
            r4 = r0
            r5 = r8
            r6 = r7
            r7 = r15
            r8 = r2
            X.2WW r10 = r4.A06(r5, r6, r7, r8, r9)
        L_0x03bb:
            return r10
        L_0x03bc:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x03c1:
            X.1sQ r4 = X.C51966G9m.A0n(r1)
            if (r4 == 0) goto L_0x041c
            com.instagram.api.schemas.MusicInfo r3 = r4.BUr()
            if (r3 == 0) goto L_0x040b
            com.instagram.music.common.model.MusicConsumptionModel r1 = r3.BUp()
            com.instagram.user.model.User r1 = r1.BEv()
            if (r1 != 0) goto L_0x0417
            com.instagram.api.schemas.TrackData r1 = r3.BUk()
            java.lang.String r2 = r1.getDisplayArtist()
            if (r2 != 0) goto L_0x03e3
            java.lang.String r2 = ""
        L_0x03e3:
            com.instagram.api.schemas.MusicInfo r1 = r4.BUr()
            r3 = 1
            if (r1 != 0) goto L_0x03fa
            com.instagram.api.schemas.OriginalSoundDataIntf r1 = r4.BZB()
            if (r1 == 0) goto L_0x041f
            java.lang.Boolean r1 = r1.BXg()
            boolean r1 = X.AnonymousClass7TF.A1Y(r1, r3)
            if (r1 == 0) goto L_0x041f
        L_0x03fa:
            android.content.res.Resources r3 = X.C51971G9r.A0M(r7)
            r1 = 2131953190(0x7f130626, float:1.9542844E38)
        L_0x0401:
            android.text.Spanned r6 = X.DbU.A07(r3, r2, r1)
            X.0qQ.A0A(r6)
            r1 = 46
            goto L_0x0465
        L_0x040b:
            com.instagram.api.schemas.OriginalSoundDataIntf r1 = r4.BZB()
            if (r1 == 0) goto L_0x041c
            com.instagram.user.model.User r1 = r1.BEv()
            if (r1 == 0) goto L_0x041c
        L_0x0417:
            java.lang.String r2 = r1.getUsername()
            goto L_0x03e3
        L_0x041c:
            if (r4 == 0) goto L_0x041f
            goto L_0x03e3
        L_0x041f:
            android.content.res.Resources r3 = X.C51971G9r.A0M(r7)
            r1 = 2131969094(0x7f134446, float:1.9575101E38)
            goto L_0x0401
        L_0x0427:
            java.lang.String r5 = r1.A2g()
            java.lang.String r3 = ""
            if (r5 != 0) goto L_0x0430
            r5 = r3
        L_0x0430:
            X.1Xy r1 = r1.A0C
            X.3dh r1 = r1.B2s()
            if (r1 == 0) goto L_0x043f
            java.lang.String r1 = r1.B2q()
            if (r1 == 0) goto L_0x043f
            r3 = r1
        L_0x043f:
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r2 = X.DbT.A12(r1, r3)
            java.lang.String r1 = X.DbT.A12(r1, r5)
            int r4 = X.C51971G9r.A0G(r2, r1)
            android.text.SpannableStringBuilder r6 = X.DbS.A0C(r3)
            r1 = -1
            if (r4 == r1) goto L_0x0463
            r1 = 1
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            r3.<init>(r1)
            int r2 = X.C51966G9m.A05(r5, r4)
            r1 = 33
            r6.setSpan(r3, r4, r2, r1)
        L_0x0463:
            r1 = 51
        L_0x0465:
            X.ICy r1 = X.C56801ICy.A00(r0, r1)
            goto L_0x048c
        L_0x046a:
            r1 = 2131962606(0x7f132aee, float:1.9561942E38)
            java.lang.String r6 = X.C244013aV.A0E(r7, r1)
        L_0x0471:
            X.ICw r5 = X.C56799ICw.A00
        L_0x0473:
            X.GN6 r12 = X.GN6.A00
            X.GN5 r2 = X.GN5.A00
            goto L_0x0561
        L_0x0479:
            com.instagram.user.model.User r1 = X.C51966G9m.A11(r1)
            if (r1 == 0) goto L_0x0497
            java.lang.String r2 = r1.getUsername()
            r1 = 2131963210(0x7f132d4a, float:1.9563167E38)
            java.lang.String r6 = X.C244013aV.A0F(r7, r2, r1)
        L_0x048a:
            X.ICw r1 = X.C56799ICw.A00
        L_0x048c:
            X.GN6 r4 = X.GN6.A00
            X.GN5 r5 = X.GN5.A00
            r2 = r7
            r3 = r6
            X.2WW r10 = r0.A06(r1, r2, r3, r4, r5)
            return r10
        L_0x0497:
            r10 = 0
            return r10
        L_0x0499:
            X.4bN r2 = r0.A02
            android.content.Context r5 = X.C243803a8.A00(r7)
            r1 = 0
            X.0qQ.A0B(r2, r1)
            com.instagram.user.model.User r1 = r2.A0K
            if (r1 == 0) goto L_0x04d7
            X.4Cl r1 = r1.A03
            java.lang.Integer r2 = r1.B6v()
            if (r2 == 0) goto L_0x04d7
            android.content.res.Resources r1 = X.AnonymousClass7TF.A0A(r5)
            java.lang.String r3 = X.C253673rC.A03(r1, r2)
            r2 = 32
            r1 = 2131962606(0x7f132aee, float:1.9561942E38)
            java.lang.String r1 = r5.getString(r1)
            java.lang.String r5 = X.002.A0T(r3, r1, r2)
        L_0x04c4:
            r2 = 10
            X.Iwl r1 = new X.Iwl
            r1.<init>(r4, r0, r2)
            X.GN6 r6 = X.GN6.A00
            r3 = r39
            r2 = r0
            r4 = r7
            r7 = r1
            X.2WW r10 = r2.A06(r3, r4, r5, r6, r7)
            return r10
        L_0x04d7:
            java.lang.String r5 = ""
            goto L_0x04c4
        L_0x04da:
            com.instagram.common.session.UserSession r5 = r0.A04
            X.4bN r3 = r0.A02
            X.3WR r3 = r3.A09(r5, r2)
            boolean r6 = X.AnonymousClass3WS.A0B(r5, r3)
            r3 = 0
            X.0qQ.A0B(r5, r3)
            r3 = 42
            X.Wvq r4 = new X.Wvq
            r4.<init>(r5, r3)
            java.lang.Class<X.GJG> r3 = X.GJG.class
            java.lang.Object r4 = r5.A01(r3, r4)
            X.GJG r4 = (X.GJG) r4
            java.lang.String r3 = java.lang.String.valueOf(r6)
            r4.A00 = r3
            r14 = 2131971517(0x7f134dbd, float:1.9580016E38)
            r15 = 2131238318(0x7f081dae, float:1.8092911E38)
            r3 = 36
            X.GL3 r5 = new X.GL3
            r5.<init>(r3, r1, r0, r6)
            r4 = 6
            X.IBk r3 = new X.IBk
            r3.<init>(r4, r1, r0, r6)
            r16 = 1
            r8 = r0
            r9 = r3
            r10 = r2
            r12 = r7
            r13 = r5
            X.2Tp r10 = r8.A04(r9, r10, r11, r12, r13, r14, r15, r16)
            return r10
        L_0x051e:
            X.2VW r10 = new X.2VW
            r10.<init>()
            r3 = 47
            X.Iw2 r2 = new X.Iw2
            r2.<init>(r3, r0, r1)
            r13 = 15
            X.ICB r9 = new X.ICB
            r12 = r9
            r14 = r7
            r15 = r10
            r16 = r1
            r17 = r0
            r12.<init>(r13, r14, r15, r16, r17)
            r14 = 2131971450(0x7f134d7a, float:1.957988E38)
            r15 = 2131238921(0x7f082009, float:1.8094134E38)
            r16 = 0
            r8 = r0
            r12 = r7
            r13 = r2
            X.2Tp r10 = r8.A04(r9, r10, r11, r12, r13, r14, r15, r16)
            return r10
        L_0x0548:
            X.3Y9 r3 = X.AnonymousClass3Y9.A00
            android.content.Context r2 = X.C243803a8.A00(r7)
            android.text.SpannableString r6 = r3.A03(r2, r1)
            r2 = 9
            X.ID3 r5 = new X.ID3
            r5.<init>((X.1Xj) r1, (X.GHU) r0, (int) r2)
            r1 = 28
            X.J6F r12 = X.J6F.A00(r0, r1)
            X.GN5 r2 = X.GN5.A00
        L_0x0561:
            r8 = r0
            r9 = r5
            r10 = r7
            r11 = r6
            r13 = r2
            X.2WW r10 = r8.A06(r9, r10, r11, r12, r13)
            return r10
        L_0x056b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GHU.A00(android.view.View$OnClickListener, X.3Zt, X.2Wc, X.1Xj, X.GJH, java.lang.String, boolean):X.3mp");
    }
}
