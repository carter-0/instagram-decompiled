package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class OVC {
    public final Context A00;
    public final UserSession A01;

    public static String A00(OVC ovc, User user, String str) {
        String str2;
        boolean equals = ovc.A01.A06.equals(str);
        Context context = ovc.A00;
        if (equals) {
            return context.getString(2131960109);
        }
        if (user != null) {
            str2 = AnonymousClass50n.A08(user);
        } else {
            str2 = "";
        }
        return DbW.A0h(context, str2, 2131960106);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0194, code lost:
        if (r5 == false) goto L_0x0196;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C70726OHv A01(X.AnonymousClass7LQ r51, X.C69347Njm r52) {
        /*
            r50 = this;
            r0 = r51
            X.3su r1 = r0.A0e
            com.instagram.user.model.User r2 = r0.A0K
            java.lang.String r9 = r1.A1q
            java.lang.String r0 = r1.A1u
            r5 = r50
            java.lang.String r45 = A00(r5, r2, r0)
            android.content.Context r2 = r5.A00
            r48 = 0
            r44 = 0
            r3 = 0
            r4 = 0
            r46 = -1
            java.lang.Object r0 = r1.A1T
            java.lang.String r36 = r1.A0g()
            java.lang.String r34 = r1.A0f()
            X.2FW r14 = r1.A10
            java.lang.String r13 = r1.A1u
            java.lang.String r6 = "ReplyActionSource is null"
            r10 = r52
            X.17k.A07(r10, r6)
            java.lang.String r12 = r10.A00
            boolean r6 = r1.A1S()
            r19 = 0
            r35 = 0
            r30 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r40 = 0
            r11 = 0
            r17 = 0
            r27 = 0
            r41 = 0
            r18 = 0
            r28 = 0
            r32 = 0
            r20 = 0
            r31 = 0
            r21 = 0
            r39 = 0
            r42 = 0
            r22 = 0
            java.lang.Boolean r33 = java.lang.Boolean.valueOf(r6)
            X.2FW r15 = r1.A10
            X.Nzx r6 = X.C70267Nzx.$redex_init_class
            int r6 = r15.ordinal()
            r8 = 1
            switch(r6) {
                case 2: goto L_0x02b0;
                case 3: goto L_0x01a1;
                case 4: goto L_0x0189;
                case 11: goto L_0x0113;
                case 12: goto L_0x0301;
                case 13: goto L_0x02e4;
                case 14: goto L_0x02a3;
                case 20: goto L_0x025a;
                case 22: goto L_0x015e;
                case 28: goto L_0x0149;
                case 36: goto L_0x011e;
                case 45: goto L_0x02d0;
                case 46: goto L_0x0136;
                case 53: goto L_0x024b;
                default: goto L_0x006c;
            }
        L_0x006c:
            X.2FW r0 = r1.A0z
            com.google.common.collect.ImmutableList r6 = r1.A0H()
            if (r6 == 0) goto L_0x0096
            int r5 = r6.size()
            if (r5 != r8) goto L_0x0096
            X.2FW r5 = X.2FW.A1g
            if (r0 == r5) goto L_0x0082
            X.2FW r5 = X.2FW.A0m
            if (r0 != r5) goto L_0x00ba
        L_0x0082:
            java.lang.String r5 = r1.A1q
            if (r5 == 0) goto L_0x00ba
            if (r9 != 0) goto L_0x0089
            r9 = r5
        L_0x0089:
            r28 = r0
            r40 = r6
            java.lang.String r0 = r9.toString()
            if (r0 == 0) goto L_0x0096
            r3 = r0
            r39 = r0
        L_0x0096:
            X.3tI r0 = new X.3tI
            r26 = r11
            r29 = r14
            r37 = r12
            r38 = r13
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            X.OBo r1 = new X.OBo
            r1.<init>(r10, r0)
            r49 = 0
            X.OHv r39 = new X.OHv
            r40 = r4
            r41 = r1
            r42 = r15
            r43 = r3
            r39.<init>(r40, r41, r42, r43, r44, r45, r46, r48, r49)
            return r39
        L_0x00ba:
            com.instagram.model.mediasize.ExtendedImageUrl r1 = r1.A16
            if (r1 == 0) goto L_0x00cd
            r0 = 2131960110(0x7f13212e, float:1.955688E38)
            java.lang.String r3 = r2.getString(r0)
            r4 = r1
            r40 = r6
            X.2FW r28 = X.2FW.A0m
            r32 = r1
            goto L_0x0096
        L_0x00cd:
            java.lang.Object r0 = X.AnonymousClass7TE.A13(r6)
            r0.getClass()
            X.3tC r0 = (X.C254873tC) r0
            boolean r5 = X.0mk.A02(r2)
            java.lang.String r3 = r0.A1N
            boolean r1 = X.AnonymousClass5He.A00(r3)
            if (r1 == 0) goto L_0x00f9
            android.text.SpannableStringBuilder r3 = X.C51965G9l.A0E()
            if (r5 == 0) goto L_0x0105
            r1 = 2131960110(0x7f13212e, float:1.955688E38)
            java.lang.String r1 = r2.getString(r1)
            android.text.SpannableStringBuilder r3 = r3.append(r1)
            java.lang.String r1 = " 📎"
        L_0x00f5:
            android.text.SpannableStringBuilder r3 = r3.append(r1)
        L_0x00f9:
            com.instagram.model.mediasize.ExtendedImageUrl r1 = r0.A0X
            if (r1 != 0) goto L_0x0101
            com.instagram.model.mediasize.ExtendedImageUrl r1 = r0.A0U
            if (r1 == 0) goto L_0x0102
        L_0x0101:
            r4 = r1
        L_0x0102:
            r40 = r6
            goto L_0x0096
        L_0x0105:
            java.lang.String r1 = "📎 "
            android.text.SpannableStringBuilder r3 = r3.append(r1)
            r1 = 2131960110(0x7f13212e, float:1.955688E38)
            java.lang.String r1 = r2.getString(r1)
            goto L_0x00f5
        L_0x0113:
            r0.getClass()
            X.9Iu r0 = (X.C376649Iu) r0
            java.lang.String r3 = r0.A01
            r17 = r0
            goto L_0x006c
        L_0x011e:
            X.55L r0 = (X.AnonymousClass55L) r0
            long r42 = r1.C7c()
            boolean r5 = r0.A07
            r3 = 2131960114(0x7f132132, float:1.9556888E38)
            if (r5 == 0) goto L_0x012e
            r3 = 2131960096(0x7f132120, float:1.9556851E38)
        L_0x012e:
            java.lang.String r3 = r2.getString(r3)
            r22 = r0
            goto L_0x006c
        L_0x0136:
            X.77X r0 = (X.AnonymousClass77X) r0
            r19 = r0
            X.1Xj r0 = r0.A01
            com.instagram.common.typedurl.ImageUrl r4 = r0.A1Q()
            r0 = 2131960097(0x7f132121, float:1.9556853E38)
            java.lang.String r3 = r2.getString(r0)
            goto L_0x006c
        L_0x0149:
            X.7FJ r0 = (X.AnonymousClass7FJ) r0
            X.1Xj r3 = r0.A01
            if (r3 == 0) goto L_0x0153
            com.instagram.common.typedurl.ImageUrl r4 = r3.A1Q()
        L_0x0153:
            r3 = 2131960111(0x7f13212f, float:1.9556881E38)
            java.lang.String r3 = r2.getString(r3)
            r21 = r0
            goto L_0x006c
        L_0x015e:
            X.7FN r0 = (X.AnonymousClass7FN) r0
            java.lang.String r5 = r0.A0A
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x016e
            java.lang.String r3 = r0.A0A
        L_0x016a:
            r20 = r0
            goto L_0x006c
        L_0x016e:
            X.1Xj r5 = r0.A02
            if (r5 == 0) goto L_0x016a
            X.7Q3 r6 = r0.A01
            r6.getClass()
            X.7Q3 r5 = X.AnonymousClass7Q3.MENTION
            if (r6 != r5) goto L_0x016a
            r3 = 2131960111(0x7f13212f, float:1.9556881E38)
            java.lang.String r3 = r2.getString(r3)
            X.1Xj r4 = r0.A02
            com.instagram.common.typedurl.ImageUrl r4 = r4.A1Q()
            goto L_0x016a
        L_0x0189:
            X.4ik r0 = (X.C271374ik) r0
            X.4iq r3 = r0.A04
            if (r3 == 0) goto L_0x0196
            boolean r5 = r3.A0V
            r3 = 2131960115(0x7f132133, float:1.955689E38)
            if (r5 != 0) goto L_0x0199
        L_0x0196:
            r3 = 2131960105(0x7f132129, float:1.955687E38)
        L_0x0199:
            java.lang.String r3 = r2.getString(r3)
            r23 = r0
            goto L_0x006c
        L_0x01a1:
            boolean r6 = r0 instanceof X.1Xj
            if (r6 == 0) goto L_0x006c
            X.1Xj r0 = (X.1Xj) r0
            X.1iA r4 = r0.BR7()
            X.1iA r3 = X.1iA.A0E
            if (r4 != r3) goto L_0x023d
            r3 = 2131960102(0x7f132126, float:1.9556863E38)
        L_0x01b2:
            java.lang.String r3 = r2.getString(r3)
            long r46 = r0.A17()
            com.instagram.model.mediasize.ExtendedImageUrl r4 = r0.A1n(r2)
            r27 = r0
            boolean r6 = r0.A5p()
            if (r6 == 0) goto L_0x006c
            java.util.LinkedHashMap r6 = r1.A1z
            if (r6 != 0) goto L_0x0238
            java.lang.String r6 = ""
        L_0x01cc:
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x006c
            com.instagram.common.session.UserSession r6 = r5.A01
            java.lang.String r0 = r0.getId()
            if (r0 == 0) goto L_0x01e6
            java.lang.Integer r5 = r1.A0d(r0)
            if (r5 == 0) goto L_0x01e6
            int r5 = r5.intValue()
            if (r5 == r8) goto L_0x01f8
        L_0x01e6:
            java.lang.String r7 = r1.A0j()
            java.lang.String r5 = "permanent"
            boolean r5 = X.0qQ.A0K(r7, r5)
            if (r5 == 0) goto L_0x020c
            boolean r5 = r1.A1b()
            if (r5 == 0) goto L_0x020c
        L_0x01f8:
            boolean r0 = r1.A1S()
            boolean r0 = X.C66797Mcj.A02(r6, r0)
            if (r0 == 0) goto L_0x006c
            com.google.common.collect.ImmutableMap r41 = r1.A0K()
            java.lang.Integer r44 = X.AnonymousClass05K.A0C
            r48 = 1
            goto L_0x006c
        L_0x020c:
            X.3tI r5 = r1.A0P()
            if (r5 == 0) goto L_0x0221
            if (r0 == 0) goto L_0x0221
            java.lang.Integer r5 = r5.A02(r0)
            if (r5 == 0) goto L_0x0221
            int r5 = r5.intValue()
            if (r5 != r8) goto L_0x0221
            goto L_0x01f8
        L_0x0221:
            boolean r5 = X.C66582MXn.A1R(r6, r1)
            if (r5 != 0) goto L_0x006c
            if (r0 == 0) goto L_0x006c
            java.lang.Integer r0 = r1.A0d(r0)
            r5 = 100
            if (r0 == 0) goto L_0x006c
            int r0 = r0.intValue()
            if (r0 != r5) goto L_0x006c
            goto L_0x01f8
        L_0x0238:
            java.lang.String r6 = r6.toString()
            goto L_0x01cc
        L_0x023d:
            boolean r4 = r0.CeS()
            r3 = 2131960105(0x7f132129, float:1.955687E38)
            if (r4 == 0) goto L_0x01b2
            r3 = 2131960115(0x7f132133, float:1.955689E38)
            goto L_0x01b2
        L_0x024b:
            X.3tC r0 = (X.C254873tC) r0
            r3 = 2131960101(0x7f132125, float:1.9556861E38)
            java.lang.String r3 = r2.getString(r3)
            com.instagram.model.mediasize.ExtendedImageUrl r4 = r0.A0X
            r25 = r0
            goto L_0x006c
        L_0x025a:
            X.9JI r0 = (X.AnonymousClass9JI) r0
            java.lang.Object r5 = r0.A00
            X.1Xj r5 = (X.1Xj) r5
            java.lang.String r3 = r0.A02
            if (r3 == 0) goto L_0x026a
            X.1Xj r4 = r5.A1f(r3)
            if (r4 != 0) goto L_0x026b
        L_0x026a:
            r4 = r5
        L_0x026b:
            r3 = 2131960104(0x7f132128, float:1.9556867E38)
            java.lang.String r3 = r2.getString(r3)
            X.4w4 r6 = r4.BQf()
            if (r6 == 0) goto L_0x029e
            boolean r6 = X.C52501GVd.A04(r6)
            if (r6 == 0) goto L_0x029e
            r48 = 1
            boolean r6 = X.C56587I2r.A02(r4)
            java.lang.Integer r44 = X.JTP.A0j(r6)
            java.lang.String r6 = r4.BTL()
            java.lang.String r4 = "preview:/"
            java.lang.String r4 = X.002.A0R(r4, r6)
            com.instagram.common.typedurl.SimpleImageUrl r4 = X.DbS.A0V(r4)
        L_0x0296:
            long r46 = r5.A17()
            r18 = r0
            goto L_0x006c
        L_0x029e:
            com.instagram.model.mediasize.ExtendedImageUrl r4 = r4.A1n(r2)
            goto L_0x0296
        L_0x02a3:
            X.47v r0 = (X.C2609947v) r0
            r3 = 2131960116(0x7f132134, float:1.9556892E38)
            java.lang.String r3 = r2.getString(r3)
            r24 = r0
            goto L_0x006c
        L_0x02b0:
            if (r9 == 0) goto L_0x02e1
            java.lang.String r0 = r9.toString()
        L_0x02b6:
            if (r0 == 0) goto L_0x006c
            java.lang.String r3 = r1.A1q
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x02dc
            X.79a r6 = X.C3270179a.A00
            com.instagram.common.session.UserSession r5 = r5.A01
            X.UVA r3 = r1.A0l
            java.lang.CharSequence r3 = r6.A00(r2, r3, r5, r0)
            X.UVA r11 = r1.A0l
        L_0x02cc:
            r39 = r0
            goto L_0x006c
        L_0x02d0:
            X.OMp r0 = (X.C70820OMp) r0
            java.lang.Integer r5 = r0.A01()
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            if (r5 != r3) goto L_0x02de
            java.lang.String r0 = "❤"
        L_0x02dc:
            r3 = r0
            goto L_0x02cc
        L_0x02de:
            java.lang.String r0 = r0.A05
            goto L_0x02dc
        L_0x02e1:
            java.lang.String r0 = r1.A1q
            goto L_0x02b6
        L_0x02e4:
            com.instagram.model.direct.stickerstore.DirectStoreStickerResponseItem r0 = r1.A15
            if (r0 == 0) goto L_0x006c
            r3 = 2131960095(0x7f13211f, float:1.955685E38)
            java.lang.String r3 = r2.getString(r3)
            java.lang.String r5 = r0.A09
            if (r5 == 0) goto L_0x02fd
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L_0x02fd
            com.instagram.common.typedurl.SimpleImageUrl r4 = X.DbS.A0V(r5)
        L_0x02fd:
            r31 = r0
            goto L_0x006c
        L_0x0301:
            X.53G r5 = r1.A12
            if (r5 == 0) goto L_0x006c
            boolean r3 = r5.A05
            r0 = 2131960103(0x7f132127, float:1.9556865E38)
            if (r3 == 0) goto L_0x030f
            r0 = 2131960095(0x7f13211f, float:1.955685E38)
        L_0x030f:
            java.lang.String r3 = r2.getString(r0)
            X.9IE r0 = r5.A00
            if (r0 == 0) goto L_0x0323
            java.lang.Object r0 = r0.A00
            com.instagram.model.mediasize.GifUrlImpl r0 = (com.instagram.model.mediasize.GifUrlImpl) r0
            if (r0 == 0) goto L_0x0323
            java.lang.String r0 = r0.A09
            com.instagram.common.typedurl.SimpleImageUrl r4 = X.DbS.A0V(r0)
        L_0x0323:
            r30 = r5
            goto L_0x006c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OVC.A01(X.7LQ, X.Njm):X.OHv");
    }

    public OVC(UserSession userSession, Context context) {
        this.A01 = userSession;
        this.A00 = context;
    }
}
