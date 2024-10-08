package X;

/* renamed from: X.LbE  reason: case insensitive filesystem */
public final class C64397LbE implements AnonymousClass2Kv {
    public final int A00;
    public final Object A01;

    public C64397LbE(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0400, code lost:
        if (r29 != null) goto L_0x0402;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0590, code lost:
        if (r10 != null) goto L_0x04fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x0737, code lost:
        if (r8 != null) goto L_0x0739;
     */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0541  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x056c  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x056f  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x057e  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0588  */
    /* JADX WARNING: Removed duplicated region for block: B:346:0x07d4  */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x07e3  */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x07ed  */
    /* JADX WARNING: Removed duplicated region for block: B:368:0x04cf A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(X.AnonymousClass3JD r29) {
        /*
            r28 = this;
            r2 = r28
            int r0 = r2.A00
            r3 = r29
            switch(r0) {
                case 0: goto L_0x06e7;
                case 1: goto L_0x0228;
                case 2: goto L_0x06df;
                case 3: goto L_0x06be;
                case 4: goto L_0x01b5;
                case 5: goto L_0x063b;
                case 6: goto L_0x05e0;
                case 7: goto L_0x047c;
                case 8: goto L_0x044f;
                case 9: goto L_0x044f;
                case 10: goto L_0x03a6;
                case 11: goto L_0x00c5;
                case 12: goto L_0x00b7;
                case 13: goto L_0x0009;
                case 14: goto L_0x039a;
                case 15: goto L_0x0009;
                case 16: goto L_0x0380;
                case 17: goto L_0x0366;
                case 18: goto L_0x034c;
                case 19: goto L_0x0313;
                case 20: goto L_0x0011;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r2.A01
            X.2IR r0 = (X.2IR) r0
            r0.onSuccess(r3)
        L_0x0010:
            return
        L_0x0011:
            java.lang.Object r4 = r2.A01
            X.LRa r4 = (X.C64159LRa) r4
            if (r29 == 0) goto L_0x0010
            java.lang.Object r3 = r3.Bny()
            if (r3 == 0) goto L_0x0010
            X.3lr r3 = (X.C250663lr) r3
            java.lang.Class<X.BvL> r2 = X.C43259BvL.class
            r6 = 0
            r0 = 3297(0xce1, float:4.62E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 47690923(0x2d7b4ab, float:3.169511E-37)
            X.3lr r1 = r3.getOptionalTreeField(r6, r1, r2, r0)
            if (r1 == 0) goto L_0x0010
            r0 = 3174(0xc66, float:4.448E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            double r7 = r1.getCoercedDoubleField(r6, r0)
            double r1 = r4.A09
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0010
            android.view.View r0 = r4.A01
            if (r0 == 0) goto L_0x0010
            com.instagram.common.session.UserSession r10 = r4.A0B
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317985757664987(0x810704000b16db, double:3.030978661713326E-306)
            boolean r0 = X.182.A06(r2, r10, r0)
            if (r0 == 0) goto L_0x0010
            r0 = 37162410687660257(0x840704000900e1, double:3.564996387668606E-306)
            double r1 = X.182.A00(r2, r10, r0)
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0010
            android.view.View r0 = r4.A00
            if (r0 == 0) goto L_0x00a5
            X.0xa r5 = X.AnonymousClass7TE.A0q(r10)
            java.lang.String r3 = "has_seen_fundraiser_caption_intent_upsell_in_feed_composer_count"
            int r7 = r5.getInt(r3, r6)
            long r0 = (long) r7
            java.lang.Long r2 = r4.A0E
            long r8 = r2.longValue()
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x00a5
            X.4DH r1 = r4.A0A
            r0 = 2131962818(0x7f132bc2, float:1.9562372E38)
            java.lang.String r0 = r1.getString(r0)
            X.6jx r2 = new X.6jx
            r2.<init>((java.lang.CharSequence) r0)
            androidx.fragment.app.FragmentActivity r0 = r1.requireActivity()
            X.5Gt r1 = new X.5Gt
            r1.<init>(r0, r2)
            android.view.View r0 = r4.A00
            r1.A03(r0)
            r1.A02()
            X.5Gv r0 = r1.A00()
            r0.A07(r10)
            int r0 = r7 + 1
            X.AnonymousClass7TG.A1M(r5, r3, r0)
        L_0x00a5:
            android.view.View r0 = r4.A01
            r0.setVisibility(r6)
            r13 = 0
            X.4DH r9 = r4.A0A
            java.lang.String r11 = "ml_fundraiser_creation_nudge"
            java.lang.String r12 = "FEED_COMPOSER"
            r14 = r13
            r15 = r13
            X.LTM.A06(r9, r10, r11, r12, r13, r14, r15)
            return
        L_0x00b7:
            if (r29 == 0) goto L_0x0010
            java.lang.Object r1 = r3.Bny()
            if (r1 == 0) goto L_0x0010
            java.lang.Object r0 = r2.A01
            X.C51965G9l.A1W(r0, r1)
            return
        L_0x00c5:
            X.3lr r4 = X.C41845B3m.A0U(r3)
            if (r4 == 0) goto L_0x0010
            java.lang.Class<X.Bdh> r3 = X.C42500Bdh.class
            r0 = 3135(0xc3f, float:4.393E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = -217154177(0xfffffffff30e7d7f, float:-1.1289238E31)
            com.google.common.collect.ImmutableList r0 = r4.A06(r3, r1, r0)
            if (r0 == 0) goto L_0x0010
            java.lang.Object r2 = r2.A01
            X.Jfu r2 = (X.C60113Jfu) r2
            java.util.LinkedHashMap r1 = X.AnonymousClass7TE.A1H()
            java.util.Iterator r10 = r0.iterator()
        L_0x00e8:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x07f7
            X.3lr r3 = X.C41845B3m.A0V(r10)
            java.lang.Class<X.Bdg> r6 = X.C42499Bdg.class
            r5 = 5
            java.lang.String r4 = "images"
            r0 = -533126340(0xffffffffe039233c, float:-5.336229E19)
            com.google.common.collect.ImmutableList r0 = X.C41845B3m.A0X(r3, r6, r4, r5, r0)
            java.util.ArrayList r6 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r7 = r0.iterator()
        L_0x0106:
            boolean r0 = r7.hasNext()
            java.lang.String r9 = "UNKNOWN"
            if (r0 == 0) goto L_0x014d
            X.3lr r5 = X.C41845B3m.A0V(r7)
            java.lang.String r0 = "sticker_id"
            java.lang.String r12 = r5.A07(r0)
            if (r12 != 0) goto L_0x011c
            java.lang.String r12 = ""
        L_0x011c:
            r0 = 4045(0xfcd, float:5.668E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r13 = r5.A08(r0)
            if (r13 != 0) goto L_0x0129
            r13 = r9
        L_0x0129:
            java.lang.String r0 = "cdn_url"
            java.lang.String r0 = r5.A09(r0)
            com.instagram.common.typedurl.SimpleImageUrl r11 = X.DbS.A0V(r0)
            r4 = 3
            java.lang.String r0 = "width"
            int r0 = r5.getCoercedIntField(r4, r0)
            float r14 = (float) r0
            r4 = 4
            java.lang.String r0 = "height"
            int r0 = r5.getCoercedIntField(r4, r0)
            float r15 = (float) r0
            r16 = 1065353216(0x3f800000, float:1.0)
            X.6o8 r0 = X.C317966o8.A00(r11, r12, r13, r14, r15, r16)
            r6.add(r0)
            goto L_0x0106
        L_0x014d:
            r8 = 2
            r0 = 4027(0xfbb, float:5.643E-42)
            java.lang.String r7 = X.AnonymousClass000.A00(r0)
            long r4 = r3.getCoercedTimeField(r8, r7)
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            java.lang.Object r0 = r1.get(r0)
            X.Jtl r0 = (X.C60927Jtl) r0
            if (r0 == 0) goto L_0x01b0
            java.util.List r0 = r0.A03
            if (r0 == 0) goto L_0x01b0
            java.util.ArrayList r13 = X.AnonymousClass7TE.A1D(r0)
        L_0x016c:
            r0 = 2738(0xab2, float:3.837E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r5 = r3.A07(r0)
            if (r5 == 0) goto L_0x0182
            X.6oG r4 = X.C318046oG.FITNESS_STICKER
            X.6nz r0 = new X.6nz
            r0.<init>(r4, r5, r6)
            r13.add(r0)
        L_0x0182:
            long r4 = r3.getCoercedTimeField(r8, r7)
            java.lang.Long r5 = java.lang.Long.valueOf(r4)
            long r14 = r3.getCoercedTimeField(r8, r7)
            r4 = 3
            r0 = 3607(0xe17, float:5.054E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            long r16 = r3.getCoercedTimeField(r4, r0)
            r0 = 585(0x249, float:8.2E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.String r12 = r3.A08(r0)
            if (r12 != 0) goto L_0x01a6
            r12 = r9
        L_0x01a6:
            X.Jtl r11 = new X.Jtl
            r11.<init>(r12, r13, r14, r16)
            r1.put(r5, r11)
            goto L_0x00e8
        L_0x01b0:
            java.util.ArrayList r13 = X.AnonymousClass7TE.A1C()
            goto L_0x016c
        L_0x01b5:
            if (r29 == 0) goto L_0x0010
            X.3lr r4 = X.C41845B3m.A0U(r3)
            if (r4 == 0) goto L_0x0010
            java.lang.Class<X.Bns> r3 = X.C42950Bns.class
            r7 = 0
            r0 = 698(0x2ba, float:9.78E-43)
            java.lang.String r1 = X.C273654mx.A00(r0)
            r0 = 2139629613(0x7f88282d, float:NaN)
            X.3lr r4 = r4.getOptionalTreeField(r7, r1, r3, r0)
            if (r4 == 0) goto L_0x0010
            java.lang.Class<X.Bnr> r3 = X.C42949Bnr.class
            java.lang.String r1 = "user_avatar"
            r0 = 936972892(0x37d9125c, float:2.5876965E-5)
            X.3lr r4 = r4.getOptionalTreeField(r7, r1, r3, r0)
            if (r4 == 0) goto L_0x0010
            java.lang.Class<X.Bnq> r3 = X.C42948Bnq.class
            r0 = 1436(0x59c, float:2.012E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = -1914548677(0xffffffff8de24e3b, float:-1.3947159E-30)
            X.3lr r3 = r4.getOptionalTreeField(r7, r1, r3, r0)
            if (r3 == 0) goto L_0x0010
            java.lang.Object r1 = r2.A01
            X.Kzf r1 = (X.C63592Kzf) r1
            java.lang.String r0 = "avatar_revision_id"
            java.lang.String r6 = r3.A09(r0)
            java.lang.String r0 = "config_hash"
            java.lang.String r5 = r3.A0A(r0)
            X.6nx r4 = X.C317846nw.A01
            X.Ddk r3 = r1.A00
            com.instagram.common.session.UserSession r2 = r3.A02
            X.6ny r1 = X.C317866ny.PROFILE
            boolean r0 = X.DcE.A00(r2)
            if (r0 == 0) goto L_0x0225
            X.6nw r0 = X.C317846nw.COIN_FLIP_CUSTOMIZATION_POSES_440_400
        L_0x020d:
            java.lang.String r4 = r4.A00(r0, r1, r2, r7)
            X.26t r3 = r3.A03
            java.lang.String r2 = "AvatarRefreshAPIVersionInfo(avatarRevision="
            r0 = 1053(0x41d, float:1.476E-42)
            java.lang.String r1 = X.C273654mx.A00(r0)
            r0 = 41
            java.lang.String r0 = X.002.A0v(r2, r6, r1, r5, r0)
            r3.A03(r4, r0)
            return
        L_0x0225:
            X.6nw r0 = X.C317846nw.COIN_FLIP_CUSTOMIZATION_ALL_POSES
            goto L_0x020d
        L_0x0228:
            r10 = 0
            if (r29 == 0) goto L_0x0010
            X.3lr r4 = X.C41845B3m.A0U(r3)
            if (r4 == 0) goto L_0x0010
            java.lang.Class<X.Btm> r3 = X.C43162Btm.class
            r0 = 4259(0x10a3, float:5.968E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = -182587845(0xfffffffff51dee3b, float:-2.002008E32)
            X.3lr r4 = r4.A03(r3, r1, r0)
            if (r4 == 0) goto L_0x0010
            java.lang.Class<X.Btl> r3 = X.C43161Btl.class
            r0 = 736(0x2e0, float:1.031E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 2122932484(0x7e896104, float:9.130398E37)
            X.3lr r9 = r4.A03(r3, r1, r0)
            if (r9 == 0) goto L_0x0010
            java.lang.Class<X.Btk> r5 = X.C43160Btk.class
            r0 = 3900(0xf3c, float:5.465E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r0)
            r3 = 29756409(0x1c60bf9, float:7.2750893E-38)
            X.3lr r1 = r9.A02(r5, r4, r3)
            if (r1 == 0) goto L_0x0010
            java.lang.String r0 = "text"
            java.lang.String r7 = r1.A07(r0)
            if (r7 == 0) goto L_0x0010
            boolean r0 = X.00l.A0W(r7)
            if (r0 != 0) goto L_0x0010
            X.3lr r5 = r9.A02(r5, r4, r3)
            if (r5 == 0) goto L_0x0310
            java.lang.Class<X.Btj> r4 = X.C43159Btj.class
            r3 = 1
            java.lang.String r1 = "ranges"
            r0 = -1707218353(0xffffffff9a3dea4f, float:-3.9273557E-23)
            com.google.common.collect.ImmutableList r0 = r5.getRequiredCompactedTreeListField(r3, r1, r4, r0)
            if (r0 == 0) goto L_0x0310
            java.lang.Object r8 = X.00k.A0J(r0)
            X.3lr r8 = (X.C250663lr) r8
        L_0x028c:
            java.lang.String r6 = ""
            if (r8 == 0) goto L_0x030e
            java.lang.String r1 = "offset"
            boolean r0 = r8.hasFieldValue(r1)
            if (r0 == 0) goto L_0x030e
            r0 = 0
            int r4 = r8.getCoercedIntField(r0, r1)
            int r3 = r8.getCoercedIntField(r0, r1)
            r1 = 1
            java.lang.String r0 = "length"
            int r0 = r8.getCoercedIntField(r1, r0)
            int r3 = r3 + r0
            java.lang.String r5 = X.C51967G9n.A0q(r7, r4, r3)
        L_0x02ad:
            r1 = 2
            r0 = 3901(0xf3d, float:5.466E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            com.google.common.collect.ImmutableList r4 = r9.getRequiredCompactedStringListField(r1, r0)
            if (r8 == 0) goto L_0x02d0
            java.lang.Class<X.Bti> r3 = X.C43158Bti.class
            java.lang.String r1 = "entity"
            r0 = -1218983648(0xffffffffb757c920, float:-1.2861827E-5)
            X.3lr r1 = r8.A04(r3, r1, r0)
            if (r1 == 0) goto L_0x02d0
            java.lang.String r0 = "url"
            java.lang.String r0 = r1.A07(r0)
            if (r0 == 0) goto L_0x02d0
            r6 = r0
        L_0x02d0:
            X.JwB r8 = new X.JwB
            r8.<init>((com.google.common.collect.ImmutableList) r4, (java.lang.String) r7, (java.lang.String) r5, (java.lang.String) r6)
            java.lang.Object r1 = r2.A01
            com.instagram.aistudio.editor.AiSettingsRepository r1 = (com.instagram.aistudio.editor.AiSettingsRepository) r1
            X.05G r0 = r1.A08
            X.Jvz r9 = X.JTP.A0M(r0)
            if (r9 == 0) goto L_0x0303
            r26 = 0
            r25 = 8323071(0x7effff, float:1.1663107E-38)
            r11 = r10
            r12 = r10
            r13 = r10
            r14 = r10
            r15 = r10
            r16 = r10
            r17 = r10
            r18 = r10
            r19 = r10
            r20 = r10
            r21 = r10
            r22 = r10
            r23 = r10
            r24 = r10
            r27 = r26
            X.Jvz r10 = X.C61061Jvz.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
        L_0x0303:
            r0.Epw(r10)
            X.1EO r0 = r1.A00
            if (r0 == 0) goto L_0x0010
            r0.cancel()
            return
        L_0x030e:
            r5 = r6
            goto L_0x02ad
        L_0x0310:
            r8 = r10
            goto L_0x028c
        L_0x0313:
            if (r29 == 0) goto L_0x0349
            X.3lr r4 = X.C41845B3m.A0U(r3)
            if (r4 == 0) goto L_0x0349
            java.lang.Class<X.Bqq> r3 = X.C43026Bqq.class
            r0 = 4238(0x108e, float:5.939E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 66997956(0x3fe4ec4, float:1.4946862E-36)
            X.3lr r3 = r4.A05(r3, r1, r0)
            if (r3 == 0) goto L_0x0349
            r1 = 2
            java.lang.String r0 = "badge_setting"
            java.lang.String r0 = r3.getRequiredStringField(r1, r0)
            if (r0 == 0) goto L_0x0349
            com.instagram.api.schemas.IGLiveBadgeSettings r3 = X.C2816858z.A00(r0)
        L_0x0339:
            java.lang.Object r0 = r2.A01
            X.L8Y r0 = (X.L8Y) r0
            X.05G r1 = r0.A02
            com.instagram.api.schemas.IGLiveBadgeSettings r0 = com.instagram.api.schemas.IGLiveBadgeSettings.ON
            boolean r0 = X.AnonymousClass7TF.A1W(r3, r0)
            X.AnonymousClass7TF.A1O(r1, r0)
            return
        L_0x0349:
            com.instagram.api.schemas.IGLiveBadgeSettings r3 = com.instagram.api.schemas.IGLiveBadgeSettings.UNSET
            goto L_0x0339
        L_0x034c:
            if (r29 == 0) goto L_0x035e
            java.lang.Object r1 = r3.Bny()
            if (r1 == 0) goto L_0x035e
            java.lang.Object r0 = r2.A01
            X.MUC r0 = (X.MUC) r0
            X.9ff r1 = (X.C383489ff) r1
            r0.DoV(r1)
            return
        L_0x035e:
            java.lang.Object r0 = r2.A01
            X.MUC r0 = (X.MUC) r0
            r0.DED()
            return
        L_0x0366:
            if (r29 == 0) goto L_0x0378
            java.lang.Object r1 = r3.Bny()
            if (r1 == 0) goto L_0x0378
            java.lang.Object r0 = r2.A01
            X.MUD r0 = (X.MUD) r0
            X.9R1 r1 = (X.AnonymousClass9R1) r1
            r0.DoW(r1)
            return
        L_0x0378:
            java.lang.Object r0 = r2.A01
            X.MUD r0 = (X.MUD) r0
            r0.DED()
            return
        L_0x0380:
            if (r29 == 0) goto L_0x0392
            java.lang.Object r1 = r3.Bny()
            if (r1 == 0) goto L_0x0392
            java.lang.Object r0 = r2.A01
            X.MUB r0 = (X.MUB) r0
            X.9fm r1 = (X.C383559fm) r1
            r0.DoX(r1)
            return
        L_0x0392:
            java.lang.Object r0 = r2.A01
            X.MUB r0 = (X.MUB) r0
            r0.DED()
            return
        L_0x039a:
            java.lang.Object r1 = r2.A01
            X.3jv r1 = (X.C249523jv) r1
            X.3Ih r0 = X.C41845B3m.A0d(r3)
            r1.FIG(r0)
            return
        L_0x03a6:
            if (r29 == 0) goto L_0x03fe
            java.lang.Object r0 = r3.Bny()
            X.C7e r0 = (X.C43734C7e) r0
            if (r0 == 0) goto L_0x03fe
            X.C7d r0 = r0.A0E()
            if (r0 == 0) goto L_0x03fe
            com.google.common.collect.ImmutableList r1 = r0.A0E()
            if (r1 == 0) goto L_0x03fe
            r0 = 4
            java.util.List r0 = X.00k.A0d(r1, r0)
            if (r0 == 0) goto L_0x03fe
            java.util.ArrayList r5 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r4 = r0.iterator()
        L_0x03cb:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0402
            X.3lr r1 = X.C41845B3m.A0V(r4)
            X.0qQ.A0A(r1)
            java.lang.String r0 = "strong_id__"
            java.lang.String r7 = r1.A07(r0)
            if (r7 != 0) goto L_0x03e2
            java.lang.String r7 = ""
        L_0x03e2:
            X.6oG r0 = X.C318046oG.AI_STICKER
            java.lang.String r8 = r0.toString()
            java.lang.String r0 = "url"
            java.lang.String r0 = r1.A08(r0)
            com.instagram.common.typedurl.SimpleImageUrl r6 = X.DbS.A0V(r0)
            r9 = 1065353216(0x3f800000, float:1.0)
            r10 = r9
            r11 = r9
            X.6o8 r0 = X.C317966o8.A00(r6, r7, r8, r9, r10, r11)
            r5.add(r0)
            goto L_0x03cb
        L_0x03fe:
            X.0sn r5 = X.0sn.A00
            if (r29 == 0) goto L_0x0432
        L_0x0402:
            java.lang.Object r0 = r3.Bny()
            X.C7e r0 = (X.C43734C7e) r0
            if (r0 == 0) goto L_0x0432
            X.C7d r4 = r0.A0E()
            if (r4 == 0) goto L_0x0432
            java.lang.Class<X.UQN> r3 = X.UQN.class
            java.lang.String r1 = "error"
            r0 = -1752600906(0xffffffff97896eb6, float:-8.881365E-25)
            X.3lr r1 = r4.A02(r3, r1, r0)
            if (r1 == 0) goto L_0x0432
            java.lang.String r0 = "ui_description"
            java.lang.String r3 = r1.A07(r0)
            if (r3 == 0) goto L_0x0432
            java.lang.Object r0 = r2.A01
            X.L68 r0 = (X.L68) r0
            X.L04 r0 = r0.A01
            X.Ll3 r1 = r0.A00
            r0 = 0
            X.C64964Ll3.A03(r1, r3, r0)
            return
        L_0x0432:
            java.lang.Object r0 = r2.A01
            X.L68 r0 = (X.L68) r0
            X.L04 r0 = r0.A01
            r4 = 0
            X.Ll3 r3 = r0.A00
            X.02m r2 = r3.A0J
            r1 = 31792419(0x1e51d23, float:8.4163124E-38)
            java.lang.String r0 = "API_CALL_SUCCESS"
            r2.markerPoint(r1, r0)
            java.util.List r0 = r3.A0N
            r0.addAll(r5)
            r0 = 0
            X.C64964Ll3.A03(r3, r0, r4)
            return
        L_0x044f:
            if (r29 == 0) goto L_0x0473
            X.3lr r3 = X.C41845B3m.A0U(r3)
            if (r3 == 0) goto L_0x0473
            r1 = 0
            java.lang.String r0 = "xfb_scheduled_content_num_per_day"
            int r3 = r3.getCoercedIntField(r1, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            if (r0 == 0) goto L_0x0473
            java.lang.Object r0 = r2.A01
            X.JgD r0 = (X.C60132JgD) r0
            X.05G r1 = r0.A01
            X.Jxx r0 = new X.Jxx
            r0.<init>(r3)
        L_0x046f:
            r1.Epw(r0)
            return
        L_0x0473:
            java.lang.Object r0 = r2.A01
            X.JgD r0 = (X.C60132JgD) r0
            X.05G r1 = r0.A01
            X.Ldc r0 = X.C64535Ldc.A00
            goto L_0x046f
        L_0x047c:
            r8 = 0
            if (r29 == 0) goto L_0x0596
            X.3lr r4 = X.C41845B3m.A0U(r3)
            if (r4 == 0) goto L_0x0596
            java.lang.Class<X.BYf> r3 = X.C42288BYf.class
            java.lang.String r1 = "cam_creator_profile"
            r0 = 104933612(0x64128ec, float:3.632933E-35)
            X.3lr r4 = r4.A03(r3, r1, r0)
            if (r4 == 0) goto L_0x0596
            java.lang.Class<X.BYe> r3 = X.C42287BYe.class
            java.lang.String r1 = "creator_profile"
            r0 = 1100579328(0x41998200, float:19.188477)
            X.3lr r4 = r4.A03(r3, r1, r0)
            if (r4 == 0) goto L_0x0596
            java.lang.Class<X.BYd> r3 = X.C42286BYd.class
            r0 = 2952(0xb88, float:4.137E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 539565041(0x20291bf1, float:1.4324102E-19)
            X.3lr r4 = r4.A03(r3, r1, r0)
            if (r4 == 0) goto L_0x0596
            java.lang.Class<X.BYb> r3 = X.C42284BYb.class
            java.lang.String r1 = "edges"
            r0 = -796256390(0xffffffffd08a177a, float:-1.85343549E10)
            com.google.common.collect.ImmutableList r0 = r4.A06(r3, r1, r0)
            if (r0 == 0) goto L_0x0596
            java.lang.Object r5 = r2.A01
            X.LeO r5 = (X.C64582LeO) r5
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.LinkedHashSet r7 = X.DbS.A0y()
            java.util.Iterator r14 = r0.iterator()
            r4 = 0
            r12 = 0
        L_0x04cf:
            boolean r0 = r14.hasNext()
            r2 = 0
            if (r0 == 0) goto L_0x05a5
            X.3lr r10 = X.C41845B3m.A0V(r14)
            if (r10 == 0) goto L_0x058f
            java.lang.Class<X.BYa> r3 = X.C42283BYa.class
            java.lang.String r1 = "node"
            r0 = -924392270(0xffffffffc8e6e4b2, float:-472869.56)
            X.3lr r9 = r10.A03(r3, r1, r0)
            if (r9 == 0) goto L_0x058f
            java.lang.Class<X.BYZ> r3 = X.BYZ.class
            java.lang.String r1 = "bcp_campaign"
            r0 = -246646217(0xfffffffff14c7a37, float:-1.01252305E30)
            X.3lr r1 = r9.A03(r3, r1, r0)
            if (r1 == 0) goto L_0x058f
            java.lang.String r0 = "name"
            java.lang.String r3 = r1.A08(r0)
        L_0x04fc:
            java.lang.Class<X.BYa> r12 = X.C42283BYa.class
            java.lang.String r11 = "node"
            r0 = -924392270(0xffffffffc8e6e4b2, float:-472869.56)
            X.3lr r13 = r10.A03(r12, r11, r0)
            if (r13 == 0) goto L_0x051c
            java.lang.Class<X.BYZ> r9 = X.BYZ.class
            java.lang.String r1 = "bcp_campaign"
            r0 = -246646217(0xfffffffff14c7a37, float:-1.01252305E30)
            X.3lr r1 = r13.A03(r9, r1, r0)
            if (r1 == 0) goto L_0x051c
            java.lang.String r0 = "strong_id__"
            java.lang.String r2 = r1.getOptionalStringField(r4, r0)
        L_0x051c:
            r0 = -924392270(0xffffffffc8e6e4b2, float:-472869.56)
            X.3lr r11 = r10.A03(r12, r11, r0)
            if (r11 == 0) goto L_0x0594
            java.lang.Class<X.BYZ> r9 = X.BYZ.class
            java.lang.String r1 = "bcp_campaign"
            r0 = -246646217(0xfffffffff14c7a37, float:-1.01252305E30)
            X.3lr r1 = r11.A03(r9, r1, r0)
            if (r1 == 0) goto L_0x0594
            java.lang.String r0 = "name"
            java.lang.String r0 = r1.A08(r0)
        L_0x0538:
            r12 = 1
            if (r0 == 0) goto L_0x0588
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0588
            r11 = 0
        L_0x0542:
            if (r10 == 0) goto L_0x057e
            java.lang.Class<X.BYa> r9 = X.C42283BYa.class
            java.lang.String r1 = "node"
            r0 = -924392270(0xffffffffc8e6e4b2, float:-472869.56)
            X.3lr r10 = r10.A03(r9, r1, r0)
            if (r10 == 0) goto L_0x057e
            java.lang.Class<X.BYZ> r9 = X.BYZ.class
            java.lang.String r1 = "bcp_campaign"
            r0 = -246646217(0xfffffffff14c7a37, float:-1.01252305E30)
            X.3lr r1 = r10.A03(r9, r1, r0)
            if (r1 == 0) goto L_0x057e
            java.lang.String r0 = "strong_id__"
            java.lang.String r0 = r1.getOptionalStringField(r4, r0)
            if (r0 == 0) goto L_0x057e
            int r0 = r0.length()
            if (r0 == 0) goto L_0x057e
            r12 = r11
        L_0x056d:
            if (r12 != 0) goto L_0x04cf
            java.lang.String r0 = ""
            if (r2 != 0) goto L_0x0574
            r2 = r0
        L_0x0574:
            if (r3 != 0) goto L_0x0577
            r3 = r0
        L_0x0577:
            r0 = 17
            X.JTP.A1T(r2, r3, r6, r0)
            goto L_0x04cf
        L_0x057e:
            r0 = 2757(0xac5, float:3.863E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.add(r0)
            goto L_0x056d
        L_0x0588:
            java.lang.String r0 = "campaign_id"
            r7.add(r0)
            r11 = 1
            goto L_0x0542
        L_0x058f:
            r3 = r8
            if (r10 == 0) goto L_0x0594
            goto L_0x04fc
        L_0x0594:
            r0 = r8
            goto L_0x0538
        L_0x0596:
            java.lang.Object r0 = r2.A01
            X.LeO r0 = (X.C64582LeO) r0
            X.05G r3 = r0.A04
            r2 = 1
            r1 = 10
            X.JwK r0 = new X.JwK
            r0.<init>(r8, r2, r1, r2)
            goto L_0x05dc
        L_0x05a5:
            if (r12 == 0) goto L_0x05b8
            com.instagram.common.session.UserSession r3 = r5.A00
            java.lang.Integer r2 = X.AnonymousClass05K.A0g
            java.lang.String r1 = r7.toString()
            java.lang.String r0 = "missing_fields"
            java.util.Map r0 = X.AnonymousClass7TF.A0w(r0, r1)
            X.JVF.A05(r5, r3, r2, r0)
        L_0x05b8:
            X.05G r3 = r5.A04
            r2 = 2
            r1 = 10
            X.JwK r0 = new X.JwK
            r0.<init>(r6, r2, r1, r4)
            r3.Epw(r0)
            X.05G r3 = r5.A03
            boolean r0 = X.DbT.A1b(r6)
            if (r0 == 0) goto L_0x05d8
            X.0xa r1 = r5.A02
            java.lang.String r0 = "has_user_seen_project_board"
            boolean r0 = r1.getBoolean(r0, r4)
            if (r0 != 0) goto L_0x05d8
            r4 = 1
        L_0x05d8:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
        L_0x05dc:
            r3.Epw(r0)
            return
        L_0x05e0:
            r5 = 0
            if (r29 == 0) goto L_0x0629
            X.3lr r4 = X.C41845B3m.A0U(r3)
            if (r4 == 0) goto L_0x0629
            java.lang.Class<X.BYV> r3 = X.BYV.class
            java.lang.String r1 = "cam_creator_profile"
            r0 = 265934746(0xfd9d79a, float:2.1480899E-29)
            X.3lr r4 = r4.A03(r3, r1, r0)
            if (r4 == 0) goto L_0x0629
            java.lang.Class<X.BYU> r3 = X.BYU.class
            java.lang.String r1 = "creator_profile"
            r0 = -1587776802(0xffffffffa15c72de, float:-7.4690925E-19)
            X.3lr r4 = r4.A03(r3, r1, r0)
            if (r4 == 0) goto L_0x0629
            java.lang.Class<X.BYT> r3 = X.BYT.class
            r0 = 1246(0x4de, float:1.746E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 564437363(0x21a4a173, float:1.1155808E-18)
            X.3lr r4 = r4.A03(r3, r1, r0)
            if (r4 == 0) goto L_0x0629
            java.lang.Class<X.UPW> r3 = X.UPW.class
            java.lang.String r1 = "nodes"
            r0 = -2020547369(0xffffffff8790e4d7, float:-2.1801212E-34)
            com.google.common.collect.ImmutableList r1 = r4.A06(r3, r1, r0)
            if (r1 == 0) goto L_0x0629
            java.lang.Object r0 = r2.A01
            com.instagram.brandedcontent.project.BrandedContentProjectRepository r0 = (com.instagram.brandedcontent.project.BrandedContentProjectRepository) r0
            com.instagram.brandedcontent.project.BrandedContentProjectRepository.A00(r0, r1)
            return
        L_0x0629:
            java.lang.Object r0 = r2.A01
            com.instagram.brandedcontent.project.BrandedContentProjectRepository r0 = (com.instagram.brandedcontent.project.BrandedContentProjectRepository) r0
            X.05G r3 = r0.A01
            r2 = 1
            r1 = 9
            X.JwK r0 = new X.JwK
            r0.<init>(r5, r2, r1, r2)
            r3.Epw(r0)
            return
        L_0x063b:
            r4 = 0
            if (r29 == 0) goto L_0x06b4
            java.lang.Object r6 = r3.Bny()
            if (r6 == 0) goto L_0x06b4
            X.3lr r6 = (X.C250663lr) r6
            if (r6 == 0) goto L_0x06b4
            java.lang.Class<com.instagram.avatars.suggestions.graphql.IGAIStickerContextualSuggestionResponseImpl$XfbAiStickersContextualSuggestions> r5 = com.instagram.avatars.suggestions.graphql.IGAIStickerContextualSuggestionResponseImpl.XfbAiStickersContextualSuggestions.class
            X.3sh r0 = X.C250663lr.Companion
            r3 = -1228959536(0xffffffffb6bf90d0, float:-5.709102E-6)
            r0 = 1951(0x79f, float:2.734E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            com.google.common.collect.ImmutableList r0 = r6.A06(r5, r1, r3)
            if (r0 == 0) goto L_0x06b4
            com.google.common.collect.ImmutableList r0 = r6.A06(r5, r1, r3)
            if (r0 == 0) goto L_0x06b4
            java.util.ArrayList r5 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r9 = r0.iterator()
        L_0x0669:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x06b3
            X.3lr r8 = X.C41845B3m.A0V(r9)
            java.lang.Class<com.instagram.avatars.suggestions.graphql.IGAIStickerContextualSuggestionResponseImpl$XfbAiStickersContextualSuggestions$Sticker> r7 = com.instagram.avatars.suggestions.graphql.IGAIStickerContextualSuggestionResponseImpl.XfbAiStickersContextualSuggestions.Sticker.class
            r6 = 1652439996(0x627e3bbc, float:1.1724443E21)
            java.lang.String r3 = "sticker"
            X.3lr r1 = r8.A02(r7, r3, r6)
            if (r1 == 0) goto L_0x06b1
            java.lang.String r0 = "strong_id__"
            java.lang.String r11 = r1.A07(r0)
        L_0x0686:
            java.lang.String r12 = ""
            if (r11 != 0) goto L_0x068b
            r11 = r12
        L_0x068b:
            X.3lr r1 = r8.A02(r7, r3, r6)
            if (r1 == 0) goto L_0x06af
            java.lang.String r0 = "url"
            java.lang.String r0 = r1.A08(r0)
        L_0x0697:
            com.instagram.common.typedurl.SimpleImageUrl r10 = X.DbS.A0V(r0)
            r13 = 1137180672(0x43c80000, float:400.0)
            r15 = 1056964608(0x3f000000, float:0.5)
            r14 = r13
            X.6o8 r3 = X.C317966o8.A00(r10, r11, r12, r13, r14, r15)
            r1 = 16
            X.JwJ r0 = new X.JwJ
            r0.<init>((java.lang.String) r12, (java.lang.Object) r3, (int) r1)
            r5.add(r0)
            goto L_0x0669
        L_0x06af:
            r0 = r4
            goto L_0x0697
        L_0x06b1:
            r11 = r4
            goto L_0x0686
        L_0x06b3:
            r4 = r5
        L_0x06b4:
            java.lang.Object r0 = r2.A01
            X.L7f r0 = (X.C63799L7f) r0
            X.0sP r0 = r0.A02
            r0.invoke(r4)
            return
        L_0x06be:
            java.lang.Object r4 = r2.A01
            X.3jv r4 = (X.C249523jv) r4
            if (r29 == 0) goto L_0x06d8
            java.lang.Object r2 = r3.Bny()
            if (r2 == 0) goto L_0x06d8
            r1 = 1
            X.JTj r0 = new X.JTj
            r0.<init>(r2, r1)
        L_0x06d0:
            r4.FIG(r0)
            r0 = 0
            r4.AI3(r0)
            return
        L_0x06d8:
            java.lang.String r0 = "success_result_should_not_be_null"
            X.JTj r0 = X.C59678JTj.A00(r0)
            goto L_0x06d0
        L_0x06df:
            java.lang.Object r0 = r2.A01
            X.AWX r0 = (X.AWX) r0
            r0.onSuccess(r3)
            return
        L_0x06e7:
            r9 = 0
            if (r29 == 0) goto L_0x07ef
            X.3lr r5 = X.C41845B3m.A0U(r3)
            if (r5 == 0) goto L_0x07ef
            java.lang.Class<X.BwF> r4 = X.C43315BwF.class
            r0 = 1956(0x7a4, float:2.741E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = -826255999(0xffffffffcec05581, float:-1.61341453E9)
            X.3lr r5 = r5.A03(r4, r1, r0)
            if (r5 == 0) goto L_0x07ef
            java.lang.Class<X.BwE> r4 = X.C43314BwE.class
            r0 = 736(0x2e0, float:1.031E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 1274109144(0x4bf15cd8, float:3.1635888E7)
            X.3lr r7 = r5.A03(r4, r1, r0)
        L_0x0710:
            java.lang.Object r5 = r2.A01
            X.KX0 r5 = (X.KX0) r5
            com.instagram.common.session.UserSession r4 = r5.A03
            X.0Tu r2 = X.0Tu.A05
            r0 = 36324076024246034(0x810c8e00382f12, double:3.034830170822715E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x0797
            if (r7 == 0) goto L_0x07a0
            java.lang.String r0 = "profile_image_url"
            java.lang.String r8 = r7.A08(r0)
            if (r8 != 0) goto L_0x0739
            r0 = 377(0x179, float:5.28E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r8 = r7.A09(r0)
        L_0x0737:
            if (r8 == 0) goto L_0x07a0
        L_0x0739:
            X.0eM r2 = r5.A09
            X.7I6 r1 = X.JTO.A0U(r2)
            java.lang.String r0 = "quick_create_image_gen_completed"
            r1.A05(r0)
            X.7I6 r1 = X.JTO.A0U(r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r1.A03(r0)
            X.05G r6 = r5.A0C
        L_0x074f:
            java.lang.Object r4 = r6.getValue()
            r3 = r4
            X.Jvz r3 = (X.C61061Jvz) r3
            if (r3 == 0) goto L_0x0795
            java.lang.String r0 = "image_prompt"
            java.lang.String r2 = r7.A0B(r0)
            if (r2 != 0) goto L_0x0762
            java.lang.String r2 = ""
        L_0x0762:
            com.instagram.common.typedurl.SimpleImageUrl r1 = X.DbS.A0V(r8)
            r0 = 3797(0xed5, float:5.321E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = r7.A0A(r0)
            X.Jvz r0 = X.C61061Jvz.A00((X.C61073JwB) null, r3, r1, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, r2, r0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, 8388495, false, false)
        L_0x0774:
            boolean r0 = r6.AIY(r4, r0)
            if (r0 == 0) goto L_0x074f
            java.lang.Object r2 = r6.getValue()
            if (r2 == 0) goto L_0x07f2
            X.Jvz r2 = (X.C61061Jvz) r2
            X.05G r0 = r5.A0W
            X.JTT.A1X(r6, r0)
            X.05G r1 = r5.A0V
            X.LcY r0 = new X.LcY
            r0.<init>(r2)
            r1.Epw(r0)
        L_0x0791:
            r5.A05()
            return
        L_0x0795:
            r0 = r9
            goto L_0x0774
        L_0x0797:
            if (r7 == 0) goto L_0x07a0
            java.lang.String r0 = "profile_image_url"
            java.lang.String r8 = r7.A08(r0)
            goto L_0x0737
        L_0x07a0:
            java.lang.String r2 = "quick_create_image_gen_error_received"
            X.0eM r1 = r5.A09
            X.7I6 r0 = X.JTO.A0U(r1)
            r0.A05(r2)
            X.7I6 r1 = X.JTO.A0U(r1)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r1.A03(r0)
            X.05G r0 = r5.A0U
            r4 = 1
            X.AnonymousClass7TF.A1O(r0, r4)
            X.0qQ.A0A(r3)
            X.3lr r3 = X.C41845B3m.A0U(r3)
            if (r3 == 0) goto L_0x07ed
            java.lang.Class<X.BwF> r2 = X.C43315BwF.class
            r0 = 1956(0x7a4, float:2.741E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = -826255999(0xffffffffcec05581, float:-1.61341453E9)
            X.3lr r2 = r3.A03(r2, r1, r0)
            if (r2 == 0) goto L_0x07ed
            X.Kis r1 = X.C62621Kis.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "error_type"
            java.lang.Enum r1 = r2.getOptionalEnumField(r4, r0, r1)
        L_0x07dc:
            X.Kis r0 = X.C62621Kis.NOT_RETRIABLE
            r2 = 2131952787(0x7f130493, float:1.9542027E38)
            if (r1 != r0) goto L_0x07e6
            r2 = 2131952786(0x7f130492, float:1.9542025E38)
        L_0x07e6:
            r1 = 0
            X.MJj r0 = X.C66228MJj.A00
            X.KX0.A04(r5, r0, r2, r1)
            goto L_0x0791
        L_0x07ed:
            r1 = 0
            goto L_0x07dc
        L_0x07ef:
            r7 = r9
            goto L_0x0710
        L_0x07f2:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x07f7:
            java.util.Collection r0 = r1.values()
            java.util.List r1 = X.00k.A0a(r0)
            X.2Fj r0 = r2.A00
            r0.A0A(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64397LbE.invoke(X.3JD):void");
    }
}
