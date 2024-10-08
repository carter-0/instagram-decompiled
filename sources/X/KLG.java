package X;

import java.util.Map;

public final class KLG extends AnonymousClass8D8 {
    public final LwN A00;
    public final Map A01;

    public final Integer A05() {
        return AnonymousClass05K.A1I;
    }

    public final Map A06() {
        return this.A01;
    }

    public final void A07() {
        if (this.A00.A09 == null) {
            super.A07();
        }
    }

    /* JADX WARNING: type inference failed for: r15v9, types: [X.8v9] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x01a7 A[LOOP:0: B:18:0x01a1->B:20:0x01a7, LOOP_END] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public KLG(android.content.Context r33, com.instagram.common.session.UserSession r34, X.AnonymousClass8BA r35, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r36, X.LwN r37, java.lang.String r38) {
        /*
            r32 = this;
            r11 = 1
            r0 = 3
            r3 = 0
            r13 = 0
            r7 = 0
            r5 = 111(0x6f, float:1.56E-43)
            r31 = r32
            r2 = r35
            r1 = r31
            r4 = r3
            r6 = r7
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r5 = r37
            r1.A00 = r5
            X.6nz r1 = X.C317876nz.A0e
            java.util.ArrayList r16 = r1.A01()
            java.util.List r8 = r5.A09
            r4 = r33
            if (r8 == 0) goto L_0x0537
            X.0Tu r3 = X.0Tu.A05
            r1 = 36324312244301793(0x810cc500082fe1, double:3.034979557337159E-306)
            r6 = r34
            boolean r1 = X.182.A06(r3, r6, r1)
            r9 = r36
            r3 = r38
            if (r1 == 0) goto L_0x03f8
            X.LQX r14 = new X.LQX
            r14.<init>(r4, r6, r9, r3)
            java.util.LinkedHashMap r3 = X.AnonymousClass7TE.A1H()
            java.lang.Object r2 = X.00k.A0O(r8, r7)
            com.instagram.reels.channelchallenge.model.ChannelChallengeStickerWinnerModel r2 = (com.instagram.reels.channelchallenge.model.ChannelChallengeStickerWinnerModel) r2
            java.lang.Object r9 = X.00k.A0O(r8, r11)
            com.instagram.reels.channelchallenge.model.ChannelChallengeStickerWinnerModel r9 = (com.instagram.reels.channelchallenge.model.ChannelChallengeStickerWinnerModel) r9
            r1 = 2
            java.lang.Object r10 = X.00k.A0O(r8, r1)
            com.instagram.reels.channelchallenge.model.ChannelChallengeStickerWinnerModel r10 = (com.instagram.reels.channelchallenge.model.ChannelChallengeStickerWinnerModel) r10
            java.lang.Object r4 = X.00k.A0O(r8, r0)
            com.instagram.reels.channelchallenge.model.ChannelChallengeStickerWinnerModel r4 = (com.instagram.reels.channelchallenge.model.ChannelChallengeStickerWinnerModel) r4
            X.UNV r1 = r5.A00
            java.lang.String r15 = r1.A07
            java.lang.String r12 = r1.A03
            java.lang.String r8 = r5.A06
            r6 = 17
            X.Jvb r17 = new X.Jvb
            r1 = r17
            r1.<init>(r15, r12, r8, r6)
            android.content.Context r1 = r14.A01
            r30 = r1
            X.8v9 r15 = new X.8v9
            r15.<init>(r1, r5, r11)
            if (r2 == 0) goto L_0x0191
            if (r9 == 0) goto L_0x0272
            if (r10 == 0) goto L_0x01b1
            if (r4 == 0) goto L_0x02f6
            java.lang.Integer r1 = r5.A02
            int r12 = X.C51967G9n.A04(r1, r7)
            java.util.List r1 = r5.A0A
            if (r1 != 0) goto L_0x0085
            X.0sn r1 = X.0sn.A00
        L_0x0085:
            java.util.LinkedHashMap r6 = X.AnonymousClass7TE.A1H()
            android.content.res.Resources r8 = r30.getResources()
            r5 = 2131165289(0x7f070069, float:1.794479E38)
            int r23 = r8.getDimensionPixelSize(r5)
            android.content.res.Resources r8 = r30.getResources()
            r5 = 2131165283(0x7f070063, float:1.7944779E38)
            int r24 = r8.getDimensionPixelSize(r5)
            android.content.res.Resources r8 = r30.getResources()
            r5 = 2131165403(0x7f0700db, float:1.7945022E38)
            int r25 = r8.getDimensionPixelSize(r5)
            android.content.res.Resources r8 = r30.getResources()
            r5 = 2131165404(0x7f0700dc, float:1.7945024E38)
            int r26 = r8.getDimensionPixelSize(r5)
            r22 = -1054867456(0xffffffffc1200000, float:-10.0)
            java.lang.Integer r20 = X.AnonymousClass05K.A0N
            java.lang.Integer r21 = X.AnonymousClass05K.A01
            r27 = r7
            r28 = r7
            r29 = r7
            r18 = r14
            r19 = r2
            X.0eP r2 = X.LQX.A01(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            java.lang.Object r2 = r2.A00
            android.content.res.Resources r8 = r30.getResources()
            r5 = 2131165405(0x7f0700dd, float:1.7945026E38)
            int r25 = r8.getDimensionPixelSize(r5)
            android.content.res.Resources r8 = r30.getResources()
            r5 = 2131165406(0x7f0700de, float:1.7945028E38)
            int r26 = r8.getDimensionPixelSize(r5)
            r22 = 1092616192(0x41200000, float:10.0)
            r19 = r9
            X.0eP r5 = X.LQX.A01(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            java.lang.Object r5 = r5.A00
            android.content.res.Resources r9 = r30.getResources()
            r8 = 2131165407(0x7f0700df, float:1.794503E38)
            int r25 = r9.getDimensionPixelSize(r8)
            android.content.res.Resources r9 = r30.getResources()
            r8 = 2131165304(0x7f070078, float:1.7944821E38)
            int r26 = r9.getDimensionPixelSize(r8)
            r22 = 1094010798(0x413547ae, float:11.33)
            r19 = r10
            X.0eP r8 = X.LQX.A01(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            java.lang.Object r8 = r8.A00
            android.content.res.Resources r10 = r30.getResources()
            r9 = 2131165408(0x7f0700e0, float:1.7945032E38)
            int r25 = r10.getDimensionPixelSize(r9)
            android.content.res.Resources r10 = r30.getResources()
            r9 = 2131165265(0x7f070051, float:1.7944742E38)
            int r26 = r10.getDimensionPixelSize(r9)
            r22 = -1065353216(0xffffffffc0800000, float:-4.0)
            r19 = r4
            X.0eP r4 = X.LQX.A01(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            java.lang.Object r9 = r4.A00
            r4 = 4
            X.0eP r9 = (X.0eP) r9
            X.0eP r8 = (X.0eP) r8
            X.0eP r5 = (X.0eP) r5
            X.0eP r2 = (X.0eP) r2
            X.0eP[] r2 = new X.0eP[]{r9, r8, r5, r2}
            java.util.List r2 = X.0sr.A1P(r2)
            X.0Yt.A0F(r2, r6)
            if (r12 < r4) goto L_0x017a
            java.util.List r22 = X.00k.A0d(r1, r0)
            java.lang.String r0 = r14.A04
            X.8vB r4 = new X.8vB
            r18 = r4
            r19 = r30
            r20 = r17
            r21 = r0
            r23 = r12
            r24 = r11
            r18.<init>(r19, r20, r21, r22, r23, r24)
            android.content.res.Resources r1 = r30.getResources()
            r0 = 2131165410(0x7f0700e2, float:1.7945036E38)
            int r5 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r30.getResources()
            r0 = 2131165411(0x7f0700e3, float:1.7945038E38)
            int r2 = r1.getDimensionPixelSize(r0)
            r1 = 1082130432(0x40800000, float:4.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            X.6b1 r0 = X.LQX.A00(r0, r1, r5, r2)
            r6.put(r4, r0)
        L_0x017a:
            r3.putAll(r6)
            android.content.res.Resources r1 = r30.getResources()
            r0 = 2131165409(0x7f0700e1, float:1.7945034E38)
            int r1 = r1.getDimensionPixelSize(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            X.6b1 r0 = X.LQX.A00(r0, r13, r7, r1)
        L_0x018e:
            r3.put(r15, r0)
        L_0x0191:
            java.util.Set r1 = r3.keySet()
            int r0 = X.JTT.A08(r1)
            java.util.LinkedHashMap r4 = X.DbS.A0x(r0)
            java.util.Iterator r2 = r1.iterator()
        L_0x01a1:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x052d
            java.lang.Object r1 = r2.next()
            r0 = r16
            r4.put(r1, r0)
            goto L_0x01a1
        L_0x01b1:
            java.util.LinkedHashMap r0 = X.AnonymousClass7TE.A1H()
            android.content.res.Resources r4 = r30.getResources()
            r1 = 2131165289(0x7f070069, float:1.794479E38)
            int r23 = r4.getDimensionPixelSize(r1)
            android.content.res.Resources r4 = r30.getResources()
            r1 = 2131165283(0x7f070063, float:1.7944779E38)
            int r24 = r4.getDimensionPixelSize(r1)
            android.content.res.Resources r4 = r30.getResources()
            r1 = 2131165395(0x7f0700d3, float:1.7945006E38)
            int r25 = r4.getDimensionPixelSize(r1)
            android.content.res.Resources r4 = r30.getResources()
            r1 = 2131165276(0x7f07005c, float:1.7944765E38)
            int r26 = r4.getDimensionPixelSize(r1)
            android.content.res.Resources r5 = r30.getResources()
            r4 = 2131165213(0x7f07001d, float:1.7944637E38)
            r1 = 2131165213(0x7f07001d, float:1.7944637E38)
            int r27 = r5.getDimensionPixelSize(r4)
            java.lang.Integer r20 = X.AnonymousClass05K.A01
            android.content.res.Resources r5 = r30.getResources()
            r4 = 2131165320(0x7f070088, float:1.7944854E38)
            int r28 = r5.getDimensionPixelSize(r4)
            java.lang.Integer r21 = X.AnonymousClass05K.A0N
            r22 = -1065353216(0xffffffffc0800000, float:-4.0)
            r29 = r11
            r18 = r14
            r19 = r2
            X.0eP r2 = X.LQX.A01(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            java.lang.Object r4 = r2.A00
            java.lang.Object r2 = r2.A01
            android.content.res.Resources r6 = r30.getResources()
            r5 = 2131165290(0x7f07006a, float:1.7944793E38)
            int r25 = r6.getDimensionPixelSize(r5)
            android.content.res.Resources r6 = r30.getResources()
            r5 = 2131165367(0x7f0700b7, float:1.794495E38)
            int r26 = r6.getDimensionPixelSize(r5)
            r5 = r30
            int r27 = X.AnonymousClass7TF.A02(r5, r1)
            java.lang.Integer r20 = X.AnonymousClass05K.A00
            android.content.res.Resources r5 = r30.getResources()
            r1 = 2131165396(0x7f0700d4, float:1.7945008E38)
            int r28 = r5.getDimensionPixelSize(r1)
            r22 = 1082130432(0x40800000, float:4.0)
            r19 = r9
            X.0eP r1 = X.LQX.A01(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            java.lang.Object r5 = r1.A00
            java.lang.Object r1 = r1.A01
            X.0eP r5 = (X.0eP) r5
            X.0eP r4 = (X.0eP) r4
            X.0eP r1 = (X.0eP) r1
            X.0eP r2 = (X.0eP) r2
            X.0eP[] r1 = new X.0eP[]{r5, r4, r1, r2}
            X.0qQ.A0B(r1, r7)
            java.util.List r1 = X.03t.A0I(r1)
            X.0Yt.A0F(r1, r0)
            r3.putAll(r0)
            r4 = 1082130432(0x40800000, float:4.0)
            android.content.res.Resources r1 = r30.getResources()
            r0 = 2131165287(0x7f070067, float:1.7944787E38)
            int r2 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r30.getResources()
            r0 = 2131165397(0x7f0700d5, float:1.794501E38)
            goto L_0x03ec
        L_0x0272:
            android.content.res.Resources r1 = r30.getResources()
            r0 = 2131165394(0x7f0700d2, float:1.7945004E38)
            int r23 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r30.getResources()
            r0 = 2131165392(0x7f0700d0, float:1.7945E38)
            int r24 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r30.getResources()
            r0 = 2131165266(0x7f070052, float:1.7944744E38)
            int r25 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r30.getResources()
            r0 = 2131165393(0x7f0700d1, float:1.7945002E38)
            int r26 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r30.getResources()
            r0 = 2131165243(0x7f07003b, float:1.7944698E38)
            int r27 = r1.getDimensionPixelSize(r0)
            java.lang.Integer r20 = X.AnonymousClass05K.A0N
            android.content.res.Resources r1 = r30.getResources()
            r0 = 2131165266(0x7f070052, float:1.7944744E38)
            int r28 = r1.getDimensionPixelSize(r0)
            java.lang.Integer r21 = X.AnonymousClass05K.A01
            r22 = 1082130432(0x40800000, float:4.0)
            r29 = r11
            r18 = r14
            r19 = r2
            X.0eP r1 = X.LQX.A01(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            java.lang.Object r0 = r1.A00
            java.lang.Object r4 = r1.A01
            X.0eP r4 = (X.0eP) r4
            X.0eP r0 = (X.0eP) r0
            X.0eP[] r0 = new X.0eP[]{r0}
            java.util.LinkedHashMap r2 = X.0Yt.A07(r0)
            if (r4 == 0) goto L_0x02dd
            java.lang.Object r1 = r4.A00
            java.lang.Object r0 = r4.A01
            r2.put(r1, r0)
        L_0x02dd:
            r3.putAll(r2)
            r4 = -1065353216(0xffffffffc0800000, float:-4.0)
            android.content.res.Resources r1 = r30.getResources()
            r0 = 2131165390(0x7f0700ce, float:1.7944996E38)
            int r2 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r30.getResources()
            r0 = 2131165391(0x7f0700cf, float:1.7944998E38)
            goto L_0x03ec
        L_0x02f6:
            java.util.LinkedHashMap r5 = X.AnonymousClass7TE.A1H()
            android.content.res.Resources r1 = r30.getResources()
            r0 = 2131165258(0x7f07004a, float:1.7944728E38)
            int r23 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r30.getResources()
            r0 = 2131165359(0x7f0700af, float:1.7944933E38)
            int r24 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r30.getResources()
            r0 = 2131165398(0x7f0700d6, float:1.7945012E38)
            int r25 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r30.getResources()
            r0 = 2131165399(0x7f0700d7, float:1.7945014E38)
            int r26 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r30.getResources()
            r0 = 2131165204(0x7f070014, float:1.7944619E38)
            int r27 = r1.getDimensionPixelSize(r0)
            java.lang.Integer r20 = X.AnonymousClass05K.A0C
            int r28 = X.JTR.A09(r30)
            java.lang.Integer r21 = X.AnonymousClass05K.A01
            r22 = -1054867456(0xffffffffc1200000, float:-10.0)
            r29 = r11
            r18 = r14
            r19 = r2
            X.0eP r0 = X.LQX.A01(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            java.lang.Object r1 = r0.A00
            java.lang.Object r0 = r0.A01
            android.content.res.Resources r4 = r30.getResources()
            r2 = 2131165375(0x7f0700bf, float:1.7944965E38)
            int r25 = r4.getDimensionPixelSize(r2)
            android.content.res.Resources r4 = r30.getResources()
            r2 = 2131165227(0x7f07002b, float:1.7944665E38)
            int r26 = r4.getDimensionPixelSize(r2)
            int r27 = X.AnonymousClass7TG.A06(r30)
            java.lang.Integer r20 = X.AnonymousClass05K.A0N
            android.content.res.Resources r4 = r30.getResources()
            r2 = 2131165219(0x7f070023, float:1.7944649E38)
            int r28 = r4.getDimensionPixelSize(r2)
            r22 = 1092616192(0x41200000, float:10.0)
            r19 = r9
            X.0eP r2 = X.LQX.A01(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            java.lang.Object r4 = r2.A00
            java.lang.Object r2 = r2.A01
            android.content.res.Resources r8 = r30.getResources()
            r6 = 2131165400(0x7f0700d8, float:1.7945016E38)
            int r25 = r8.getDimensionPixelSize(r6)
            android.content.res.Resources r8 = r30.getResources()
            r6 = 2131165401(0x7f0700d9, float:1.7945018E38)
            int r26 = r8.getDimensionPixelSize(r6)
            android.content.res.Resources r8 = r30.getResources()
            r6 = 2131165259(0x7f07004b, float:1.794473E38)
            int r27 = r8.getDimensionPixelSize(r6)
            android.content.res.Resources r8 = r30.getResources()
            r6 = 2131165219(0x7f070023, float:1.7944649E38)
            int r28 = r8.getDimensionPixelSize(r6)
            java.lang.Integer r21 = X.AnonymousClass05K.A00
            r22 = -1065353216(0xffffffffc0800000, float:-4.0)
            r19 = r10
            X.0eP r6 = X.LQX.A01(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            java.lang.Object r8 = r6.A00
            java.lang.Object r6 = r6.A01
            X.0eP r8 = (X.0eP) r8
            X.0eP r4 = (X.0eP) r4
            X.0eP r1 = (X.0eP) r1
            X.0eP r6 = (X.0eP) r6
            X.0eP r2 = (X.0eP) r2
            X.0eP r0 = (X.0eP) r0
            r9 = r4
            r10 = r1
            r11 = r6
            r12 = r2
            r13 = r0
            X.0eP[] r0 = new X.0eP[]{r8, r9, r10, r11, r12, r13}
            X.0qQ.A0B(r0, r7)
            java.util.List r0 = X.03t.A0I(r0)
            X.0Yt.A0F(r0, r5)
            r3.putAll(r5)
            r4 = 1082130432(0x40800000, float:4.0)
            android.content.res.Resources r1 = r30.getResources()
            r0 = 2131165315(0x7f070083, float:1.7944844E38)
            int r2 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r30.getResources()
            r0 = 2131165402(0x7f0700da, float:1.794502E38)
        L_0x03ec:
            int r1 = r1.getDimensionPixelSize(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            X.6b1 r0 = X.LQX.A00(r0, r4, r2, r1)
            goto L_0x018e
        L_0x03f8:
            X.LSC r2 = new X.LSC
            r2.<init>(r4, r6, r9, r3)
            java.util.LinkedHashMap r3 = X.AnonymousClass7TE.A1H()
            int r12 = r8.size()
            java.lang.Integer r1 = r5.A02
            int r9 = X.AnonymousClass7TG.A0A(r1)
            if (r12 > r11) goto L_0x04ad
            int r1 = r2.A06
        L_0x040f:
            r2.A00 = r1
            if (r12 > r11) goto L_0x049e
            int r1 = r2.A05
        L_0x0415:
            r2.A01 = r1
            android.content.Context r6 = r2.A08
            X.8v9 r13 = new X.8v9
            r13.<init>(r6, r5, r7)
            r15 = 0
            if (r12 > r11) goto L_0x0422
            r15 = 1
        L_0x0422:
            int r4 = r13.getIntrinsicWidth()
            int r14 = r13.getIntrinsicHeight()
            int r1 = r2.A01
            float r10 = (float) r1
            float r1 = (float) r4
            float r10 = r10 / r1
            if (r15 == 0) goto L_0x0498
            r4 = 0
        L_0x0432:
            float r15 = (float) r14
            float r15 = r15 * r10
            r14 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r1 = r2.A00
            float r1 = (float) r1
            float r1 = r1 - r15
            float r14 = r14 * r1
            r1 = 1073741824(0x40000000, float:2.0)
            int r1 = X.JTO.A05(r14, r1)
            X.6b1 r10 = X.LSC.A01(r10, r4, r1)
            r3.put(r13, r10)
            int r1 = r13.getIntrinsicHeight()
            float r4 = (float) r1
            float r1 = r10.A04
            int r10 = X.AnonymousClass7TE.A06(r4, r1)
            X.UNV r1 = r5.A00
            java.lang.String r15 = r1.A07
            java.lang.String r14 = r1.A03
            java.lang.String r13 = r5.A06
            r1 = 17
            X.Jvb r4 = new X.Jvb
            r4.<init>(r15, r14, r13, r1)
            if (r12 <= 0) goto L_0x0191
            if (r12 != r11) goto L_0x0479
            java.lang.Object r1 = X.00k.A0O(r8, r7)
            com.instagram.reels.channelchallenge.model.ChannelChallengeStickerWinnerModel r1 = (com.instagram.reels.channelchallenge.model.ChannelChallengeStickerWinnerModel) r1
            if (r1 == 0) goto L_0x0191
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
        L_0x0470:
            java.util.LinkedHashMap r0 = X.LSC.A02(r4, r2, r1, r0, r10)
            r3.putAll(r0)
            goto L_0x0191
        L_0x0479:
            r1 = 2
            java.lang.Object r13 = X.00k.A0O(r8, r7)
            com.instagram.reels.channelchallenge.model.ChannelChallengeStickerWinnerModel r13 = (com.instagram.reels.channelchallenge.model.ChannelChallengeStickerWinnerModel) r13
            if (r12 != r1) goto L_0x04c8
            java.lang.Object r1 = X.00k.A0O(r8, r11)
            com.instagram.reels.channelchallenge.model.ChannelChallengeStickerWinnerModel r1 = (com.instagram.reels.channelchallenge.model.ChannelChallengeStickerWinnerModel) r1
            if (r13 == 0) goto L_0x0493
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            java.util.LinkedHashMap r0 = X.LSC.A02(r4, r2, r13, r0, r10)
            r3.putAll(r0)
        L_0x0493:
            if (r1 == 0) goto L_0x0191
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            goto L_0x0470
        L_0x0498:
            float r1 = r1 * r10
            int r4 = X.LSC.A00(r2, r1)
            goto L_0x0432
        L_0x049e:
            android.content.Context r1 = r2.A08
            android.content.res.Resources r4 = r1.getResources()
            r1 = 2131165435(0x7f0700fb, float:1.7945087E38)
            int r1 = r4.getDimensionPixelSize(r1)
            goto L_0x0415
        L_0x04ad:
            r1 = 2
            if (r12 != r1) goto L_0x04bf
            android.content.Context r1 = r2.A08
            android.content.res.Resources r4 = r1.getResources()
            r1 = 2131165436(0x7f0700fc, float:1.794509E38)
            int r1 = r4.getDimensionPixelSize(r1)
            goto L_0x040f
        L_0x04bf:
            int r1 = r2.A07
            int r4 = r1 * 2
            int r1 = r2.A02
            int r1 = r1 + r4
            goto L_0x040f
        L_0x04c8:
            java.lang.Object r11 = X.00k.A0O(r8, r11)
            com.instagram.reels.channelchallenge.model.ChannelChallengeStickerWinnerModel r11 = (com.instagram.reels.channelchallenge.model.ChannelChallengeStickerWinnerModel) r11
            java.lang.Object r8 = X.00k.A0O(r8, r1)
            com.instagram.reels.channelchallenge.model.ChannelChallengeStickerWinnerModel r8 = (com.instagram.reels.channelchallenge.model.ChannelChallengeStickerWinnerModel) r8
            if (r13 == 0) goto L_0x04df
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            java.util.LinkedHashMap r1 = X.LSC.A02(r4, r2, r13, r1, r10)
            r3.putAll(r1)
        L_0x04df:
            if (r11 == 0) goto L_0x04ea
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            java.util.LinkedHashMap r1 = X.LSC.A02(r4, r2, r11, r1, r10)
            r3.putAll(r1)
        L_0x04ea:
            if (r8 == 0) goto L_0x04f5
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            java.util.LinkedHashMap r1 = X.LSC.A02(r4, r2, r8, r1, r10)
            r3.putAll(r1)
        L_0x04f5:
            if (r9 <= r0) goto L_0x0191
            java.util.List r1 = r5.A0A
            if (r1 == 0) goto L_0x0507
            java.util.List r1 = X.00k.A0c(r1, r0)
            if (r1 == 0) goto L_0x0507
            java.util.List r12 = X.00k.A0d(r1, r0)
            if (r12 != 0) goto L_0x0509
        L_0x0507:
            X.0sn r12 = X.0sn.A00
        L_0x0509:
            int r13 = r9 + -3
            java.lang.String r0 = r2.A0B
            X.8vB r15 = new X.8vB
            r8 = r15
            r9 = r6
            r10 = r4
            r11 = r0
            r14 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14)
            int r0 = r2.A00
            int r1 = r0 / 2
            int r0 = r2.A02
            int r1 = r1 + r0
            int r0 = r15.getIntrinsicHeight()
            int r0 = r0 / 2
            int r1 = r1 + r0
            r0 = 1065353216(0x3f800000, float:1.0)
            X.6b1 r0 = X.LSC.A01(r0, r7, r1)
            goto L_0x018e
        L_0x052d:
            r0 = r31
            r0.A01 = r4
            java.util.Map r0 = r0.A04
            r0.putAll(r3)
            return
        L_0x0537:
            X.8v9 r1 = new X.8v9
            r1.<init>(r4, r5, r7)
            r0 = r16
            X.0eP[] r0 = X.DbW.A1b(r1, r0)
            java.util.LinkedHashMap r1 = X.0Yt.A07(r0)
            r0 = r31
            r0.A01 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KLG.<init>(android.content.Context, com.instagram.common.session.UserSession, X.8BA, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider, X.LwN, java.lang.String):void");
    }
}
