package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public abstract class OPa {
    public static final C68868Na0 A00(AnonymousClass9JI r10, UserSession userSession, 1Xj r12, String str, String str2) {
        int i;
        String str3;
        0qQ.A0B(userSession, 0);
        String str4 = str2;
        C51974G9v.A1M(str2, r10, r12);
        User A2A = r12.A2A(userSession);
        C68868Na0 na0 = null;
        if (A2A != null) {
            if (!r12.A56() || (str3 = r10.A02) == null) {
                i = -1;
            } else {
                i = r12.A16(str3);
            }
            String id = r12.getId();
            if (id != null) {
                String str5 = str;
                na0 = new C68868Na0(r12.BR7(), id, r12.A0C.B2y(), str5, A2A.getId(), str4, i, AnonymousClass7TF.A1W(r12.A1u(), 1sw.A04));
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        return na0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0066, code lost:
        if (r0.A06 == false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b2, code lost:
        if (r0.A06 == false) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b6, code lost:
        if (r0 != null) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b8, code lost:
        r10 = r0.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ba, code lost:
        if (r10 != null) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bc, code lost:
        r10 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00be, code lost:
        r10 = X.C70050NwS.A00(r3, r10, r9.A0d, r25.A01, r12, r12, r12, r32);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d4, code lost:
        if (r10 == null) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d6, code lost:
        r8 = new X.C61084JwM(29, (java.lang.Object) null, (java.lang.Object) null, (java.lang.Object) r10);
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x013c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C328697Fu A01(android.content.Context r33, com.instagram.common.session.UserSession r34, X.AnonymousClass9HC r35, X.AnonymousClass7LQ r36, X.AnonymousClass7L2 r37) {
        /*
            r9 = 0
            r13 = r36
            X.3su r2 = r13.A0e
            X.0qQ.A07(r2)
            r3 = r34
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r3)
            boolean r6 = r2.A1j(r0)
            X.1Xj r1 = r2.A0T()
            if (r1 == 0) goto L_0x023c
            X.2Dm r4 = X.1bJ.A00(r3)
            X.7SD r0 = r13.A0G
            X.3t3 r0 = r0.A0P
            r7 = 0
            if (r0 == 0) goto L_0x0239
            java.lang.String r0 = X.C66580MXl.A0x(r0)
            if (r0 == 0) goto L_0x0239
            X.3U9 r15 = X.C66580MXl.A0d(r4, r0)
        L_0x002d:
            X.1Xj r4 = r2.A0R()
            X.1Xy r0 = r1.A0C
            com.instagram.model.hashtag.Hashtag r24 = r0.B6n()
            com.instagram.user.model.User r18 = r1.A2A(r3)
            X.1Xy r0 = r1.A0C
            com.instagram.user.model.User r0 = r0.B9t()
            if (r0 == 0) goto L_0x0231
            java.util.List r10 = X.AnonymousClass7TE.A1I(r0)
        L_0x0047:
            boolean r23 = r1.A4j()
            if (r18 != 0) goto L_0x01e1
            r0 = 0
        L_0x004e:
            X.9Iu r16 = X.C70865OPe.A00(r4)
            r5 = r33
            X.Nop r21 = X.C70026Nw4.A00(r5, r3, r4, r9)
            r33 = 1
            if (r0 != 0) goto L_0x016e
            java.lang.String r10 = ""
        L_0x005e:
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            if (r0 == 0) goto L_0x0068
            boolean r4 = r0.A06
            r28 = 0
            if (r4 != 0) goto L_0x006a
        L_0x0068:
            r28 = 1
        L_0x006a:
            com.instagram.user.model.User r4 = r1.A29()
            r9 = 0
            if (r4 == 0) goto L_0x0153
            java.lang.String r8 = r4.getUsername()
            r4 = 2131974136(0x7f1357f8, float:1.9585328E38)
            java.lang.String r4 = X.AnonymousClass7TE.A16(r5, r4)
            android.text.SpannableStringBuilder r9 = X.1sx.A01(r7, r8, r4)
        L_0x0080:
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
        L_0x0082:
            r4 = r37
            X.7Kz r8 = X.AnonymousClass7FB.A04(r4, r6)
            int r11 = r8.A06
            X.7Kz r8 = X.AnonymousClass7FB.A04(r4, r6)
            int r8 = r8.A05
            X.Na1 r14 = new X.Na1
            r25 = r14
            r26 = r10
            r27 = r9
            r29 = r11
            r30 = r8
            r25.<init>(r26, r27, r28, r29, r30)
            X.3gp r9 = r1.A1T()
            r8 = 0
            if (r9 == 0) goto L_0x00dd
            X.7Kz r10 = X.AnonymousClass7FB.A04(r4, r6)
            int r12 = r10.A02
            if (r0 == 0) goto L_0x00b4
            boolean r10 = r0.A06
            r32 = 1
            if (r10 != 0) goto L_0x00b8
        L_0x00b4:
            r32 = 0
            if (r0 == 0) goto L_0x00bc
        L_0x00b8:
            java.lang.String r10 = r0.A03
            if (r10 != 0) goto L_0x00be
        L_0x00bc:
            java.lang.String r10 = ""
        L_0x00be:
            java.lang.String r11 = r9.A0d
            int r9 = r14.A01
            r25 = r3
            r26 = r10
            r27 = r11
            r28 = r9
            r29 = r12
            r30 = r12
            r31 = r12
            java.lang.CharSequence r10 = X.C70050NwS.A00(r25, r26, r27, r28, r29, r30, r31, r32)
            if (r10 == 0) goto L_0x00dd
            r9 = 29
            X.JwM r8 = new X.JwM
            r8.<init>((int) r9, (java.lang.Object) r7, (java.lang.Object) r7, (java.lang.Object) r10)
        L_0x00dd:
            java.lang.String r12 = r2.A0g()
            java.lang.String r11 = r2.A1u
            X.0qQ.A07(r11)
            java.lang.Object r10 = r2.A1T
            java.lang.String r9 = "null cannot be cast to non-null type com.instagram.direct.model.DirectMediaShare"
            X.0qQ.A0C(r10, r9)
            X.9JI r10 = (X.AnonymousClass9JI) r10
            X.Na0 r22 = A00(r10, r3, r1, r12, r11)
            java.lang.String r27 = r1.getId()
            float r29 = r1.A0l()
            boolean r9 = r1.A6T(r3)
            if (r9 == 0) goto L_0x013c
            r1 = 2131238013(0x7f081c7d, float:1.8092293E38)
        L_0x0104:
            java.lang.Integer r25 = java.lang.Integer.valueOf(r1)
        L_0x0108:
            com.instagram.user.model.User r1 = X.AnonymousClass48N.A04(r3, r2, r15)
            if (r1 == 0) goto L_0x0139
            java.lang.String r28 = r1.B8Q()
        L_0x0112:
            r30 = 2131240248(0x7f082538, float:1.8096826E38)
            if (r6 != 0) goto L_0x0121
            r30 = 2131240244(0x7f082534, float:1.8096818E38)
            r1 = 2131237422(0x7f081a2e, float:1.8091094E38)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
        L_0x0121:
            r1 = r35
            X.7FE r19 = X.C66582MXn.A0U(r3, r1, r13, r4, r2)
            X.7FT r18 = X.C66580MXl.A0Y(r5, r3, r1, r13, r2)
            X.7Fu r15 = new X.7Fu
            r26 = r7
            r20 = r0
            r23 = r14
            r17 = r8
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            return r15
        L_0x0139:
            r28 = r7
            goto L_0x0112
        L_0x013c:
            boolean r9 = r1.A4u()
            if (r9 == 0) goto L_0x0146
            r1 = 2131238784(0x7f081f80, float:1.8093856E38)
            goto L_0x0104
        L_0x0146:
            boolean r1 = r1.A56()
            if (r1 == 0) goto L_0x0150
            r1 = 2131237287(0x7f0819a7, float:1.809082E38)
            goto L_0x0104
        L_0x0150:
            r25 = 0
            goto L_0x0108
        L_0x0153:
            if (r24 == 0) goto L_0x015b
            if (r0 == 0) goto L_0x0082
            java.lang.String r9 = r0.A03
            goto L_0x0082
        L_0x015b:
            boolean r4 = r1.A4j()
            if (r4 == 0) goto L_0x0082
            r4 = 2131963210(0x7f132d4a, float:1.9563167E38)
            if (r0 == 0) goto L_0x0168
            java.lang.String r9 = r0.A03
        L_0x0168:
            java.lang.String r9 = X.DbW.A0h(r5, r9, r4)
            goto L_0x0080
        L_0x016e:
            boolean r4 = r0.A06
            if (r4 == 0) goto L_0x0178
            java.lang.String r10 = X.C231122qu.A0G(r3, r1)
            goto L_0x005e
        L_0x0178:
            if (r24 == 0) goto L_0x0186
            r8 = 35
            java.lang.String r4 = r24.getName()
            java.lang.String r10 = X.002.A0D(r4, r8)
            goto L_0x005e
        L_0x0186:
            boolean r4 = r1.A4b()
            if (r4 == 0) goto L_0x01b9
            java.util.List r8 = r1.A3l(r3)
            java.util.List r4 = X.00k.A0X(r8)
            java.util.ArrayList r29 = X.AnonymousClass7TE.A1D(r4)
            int r30 = r8.size()
            int r31 = X.C51968G9o.A04(r5)
            r25 = r5
            r26 = r3
            r27 = r7
            r28 = r7
            r32 = r9
            r34 = r33
            X.3q3 r4 = X.AnonymousClass4i2.A00(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            android.text.SpannableStringBuilder r10 = r4.A00()
            X.0qQ.A0A(r10)
            goto L_0x005e
        L_0x01b9:
            boolean r4 = r1.A4j()
            java.lang.String r8 = "Required value was null."
            if (r4 == 0) goto L_0x01d8
            X.1Xy r4 = r1.A0C
            com.instagram.user.model.User r4 = r4.B9t()
            if (r4 == 0) goto L_0x01cf
            java.lang.String r10 = r4.getUsername()
            goto L_0x005e
        L_0x01cf:
            java.lang.String r10 = r0.A03
            if (r10 != 0) goto L_0x005e
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        L_0x01d8:
            java.lang.String r10 = r0.A03
            if (r10 != 0) goto L_0x005e
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        L_0x01e1:
            java.lang.String r19 = r18.getId()
            java.lang.String r20 = r18.getUsername()
            boolean r22 = r18.A2Q()
            if (r10 == 0) goto L_0x0213
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x0213
            X.01N r8 = X.0jo.A1H()
            java.util.ArrayList r5 = X.AnonymousClass7TG.A0r(r10)
            java.util.Iterator r10 = r10.iterator()
        L_0x0201:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0216
            com.instagram.user.model.User r0 = X.DbT.A0k(r10)
            com.instagram.common.typedurl.ImageUrl r0 = r0.Bh3()
            r5.add(r0)
            goto L_0x0201
        L_0x0213:
            r21 = 0
            goto L_0x0224
        L_0x0216:
            r8.addAll(r5)
            com.instagram.common.typedurl.ImageUrl r0 = r18.Bh3()
            r8.add(r0)
            X.01N r21 = X.0jo.A1I(r8)
        L_0x0224:
            com.instagram.common.typedurl.ImageUrl r17 = r18.Bh3()
            X.NZt r0 = new X.NZt
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            goto L_0x004e
        L_0x0231:
            X.1Xy r0 = r1.A0C
            java.util.List r10 = r0.getCoauthorProducers()
            goto L_0x0047
        L_0x0239:
            r15 = r7
            goto L_0x002d
        L_0x023c:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Media object for media share message is null. Message type: "
            r1.append(r0)
            X.2FW r0 = r2.A10
            r1.append(r0)
            java.lang.String r0 = " Message content: "
            r1.append(r0)
            java.lang.Object r0 = r2.A1T
            java.lang.String r0 = X.AnonymousClass7TF.A0i(r0, r1)
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OPa.A01(android.content.Context, com.instagram.common.session.UserSession, X.9HC, X.7LQ, X.7L2):X.7Fu");
    }
}
