package X;

import android.graphics.drawable.ColorDrawable;
import com.instagram.common.session.UserSession;

/* renamed from: X.OPc  reason: case insensitive filesystem */
public abstract class C70863OPc {
    public static final ColorDrawable A00(UserSession userSession, AnonymousClass7LQ r3, AnonymousClass7L2 r4, boolean z, boolean z2) {
        AnonymousClass7SD r0 = r3.A0G;
        0qQ.A07(r0);
        if (!C308556Us.A0D(userSession, r0, true)) {
            if (z2 == z) {
                return null;
            }
        } else if (!z) {
            return null;
        }
        return new ColorDrawable(r4.A04.A0A);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0217, code lost:
        if (r10 == 0) goto L_0x0219;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0048, code lost:
        if (X.C308556Us.A0T(r5, r3) != false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01b7, code lost:
        if (r14 == 0) goto L_0x01b9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0104  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C3259574v A01(android.content.Context r25, com.instagram.common.session.UserSession r26, X.AnonymousClass7LQ r27, X.AnonymousClass7L2 r28, X.C2606546n r29, boolean r30, boolean r31, boolean r32, boolean r33) {
        /*
            r1 = 4
            r0 = r28
            X.0qQ.A0B(r0, r1)
            r6 = r29
            X.BBV r9 = r6.A01
            r18 = 0
            r7 = r25
            r5 = r26
            r2 = r27
            r21 = r31
            r23 = r32
            r19 = r33
            if (r9 == 0) goto L_0x0129
            r3 = 0
            boolean r1 = X.AnonymousClass5OS.A00(r5)
            if (r1 == 0) goto L_0x002c
            X.7SD r1 = r2.A0G
            X.3Tu r1 = r1.A0H
            boolean r1 = X.C331057Pi.A02(r1)
            if (r1 == 0) goto L_0x002c
            r3 = 1
        L_0x002c:
            r22 = 0
            if (r3 != 0) goto L_0x004a
            X.7SD r1 = r2.A0G
            X.4li r1 = r1.A0N
            java.lang.Long r1 = r1.A04
            boolean r3 = X.AnonymousClass7TF.A1V(r1)
            X.5Gf r1 = X.C283115Ge.A00(r5)
            boolean r1 = r1.A01()
            if (r1 == 0) goto L_0x00dd
            boolean r1 = X.C308556Us.A0T(r5, r3)
            if (r1 == 0) goto L_0x00dd
        L_0x004a:
            java.lang.String r3 = "security_alert_key_change"
            java.lang.String r10 = "security_alert_new_login"
            java.util.List r1 = X.C66581MXm.A11(r3, r10)
            java.lang.String r8 = r9.A00
            boolean r1 = r1.contains(r8)
            if (r1 == 0) goto L_0x00dd
            r1 = 8
            X.0qQ.A0B(r8, r1)
            com.instagram.user.model.User r1 = r2.A0K
            java.lang.String r9 = ""
            r11 = r9
            if (r1 == 0) goto L_0x00db
            java.lang.String r4 = r1.getUsername()
        L_0x006a:
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L_0x00d1
            r1 = 2131960461(0x7f13228d, float:1.9557591E38)
        L_0x0073:
            java.lang.String r9 = X.DbW.A0h(r7, r4, r1)
            X.0qQ.A0A(r9)
        L_0x007a:
            X.3su r7 = r2.A0e
            X.0qQ.A07(r7)
            java.lang.String r6 = r7.A0f()
            if (r6 != 0) goto L_0x0086
            r6 = r11
        L_0x0086:
            if (r3 == 0) goto L_0x00bf
            X.0Aj r4 = X.JTU.A09(r5)
            java.lang.String r1 = "in_thread"
            X.DbS.A1L(r4, r1)
            java.lang.String r3 = "render_key_changed"
        L_0x0093:
            java.lang.String r1 = "security_alert_action"
            r4.AAJ(r1, r3)
            java.lang.String r1 = "admin_message_id"
            X.C66582MXn.A1A(r4, r1, r6)
        L_0x009d:
            r1 = r19
            java.lang.String r19 = X.C66582MXn.A0s(r5, r7, r1)
            X.0sn r20 = X.0sn.A00
            r3 = r30
            r1 = r21
            android.graphics.drawable.ColorDrawable r16 = A00(r5, r2, r0, r3, r1)
            int r1 = r0.A00
            android.text.SpannableString r17 = X.C66580MXl.A0D(r9)
            boolean r24 = r0.A00()
            X.74v r15 = new X.74v
            r21 = r1
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return r15
        L_0x00bf:
            boolean r1 = r8.equals(r10)
            if (r1 == 0) goto L_0x009d
            X.0Aj r4 = X.JTU.A09(r5)
            java.lang.String r1 = "in_thread"
            X.DbS.A1L(r4, r1)
            java.lang.String r3 = "render_new_login"
            goto L_0x0093
        L_0x00d1:
            boolean r1 = r8.equals(r10)
            if (r1 == 0) goto L_0x007a
            r1 = 2131960441(0x7f132279, float:1.955755E38)
            goto L_0x0073
        L_0x00db:
            r4 = r9
            goto L_0x006a
        L_0x00dd:
            X.7SD r1 = r2.A0G
            X.3Tu r1 = r1.A0H
            boolean r1 = X.C331057Pi.A02(r1)
            if (r1 == 0) goto L_0x0129
            X.0Tu r1 = X.0Tu.A06
            r3 = 36314489653561975(0x8103d600000a77, double:3.0287677114009E-306)
            boolean r1 = X.DbY.A1Z(r1, r5, r3)
            if (r1 == 0) goto L_0x0129
            java.lang.String r8 = "security_icdc_detect"
            java.lang.String r4 = "security_icdc_clear"
            java.util.List r1 = X.C66581MXm.A11(r8, r4)
            java.lang.String r3 = r9.A00
            boolean r1 = r1.contains(r3)
            if (r1 == 0) goto L_0x0129
            r1 = 8
            X.0qQ.A0B(r3, r1)
            boolean r1 = r3.equals(r8)
            if (r1 == 0) goto L_0x011c
            r1 = 2131972966(0x7f135366, float:1.9582954E38)
        L_0x0112:
            java.lang.String r9 = X.C51967G9n.A0p(r7, r1)
        L_0x0116:
            X.3su r7 = r2.A0e
            X.0qQ.A07(r7)
            goto L_0x009d
        L_0x011c:
            boolean r1 = r3.equals(r4)
            if (r1 == 0) goto L_0x0126
            r1 = 2131972965(0x7f135365, float:1.9582952E38)
            goto L_0x0112
        L_0x0126:
            java.lang.String r9 = ""
            goto L_0x0116
        L_0x0129:
            java.lang.String r8 = r6.A03
            X.0qQ.A07(r8)
            java.util.List r1 = r6.A07
            if (r1 == 0) goto L_0x015c
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            if (r1 == 0) goto L_0x015c
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r9 = r1.iterator()
        L_0x0140:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x0161
            java.lang.Object r4 = r9.next()
            X.4wh r4 = (X.C278324wh) r4
            int r3 = r8.length()
            int r1 = r4.A01
            if (r1 > r3) goto L_0x0140
            int r1 = r4.A00
            if (r1 > r3) goto L_0x0140
            r10.add(r4)
            goto L_0x0140
        L_0x015c:
            java.util.ArrayList r17 = X.AnonymousClass7TE.A1C()
            goto L_0x0165
        L_0x0161:
            java.util.ArrayList r17 = X.00k.A0U(r10)
        L_0x0165:
            java.util.List r1 = r6.A08
            if (r1 == 0) goto L_0x016f
            java.util.List r3 = java.util.Collections.unmodifiableList(r1)
            if (r3 != 0) goto L_0x0173
        L_0x016f:
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
        L_0x0173:
            boolean r1 = X.AnonymousClass7TE.A1b(r3)
            java.lang.String r4 = "Required value was null."
            if (r1 == 0) goto L_0x01ee
            java.util.List r1 = r6.A08
            if (r1 == 0) goto L_0x01e9
            java.util.List r8 = java.util.Collections.unmodifiableList(r1)
            if (r8 == 0) goto L_0x01e9
            int r15 = r0.A00
            X.7Kx r1 = r0.A04
            int r14 = r1.A04
            r13 = 0
            r12 = 1
            java.lang.String r4 = ""
            X.PoX r1 = X.C74068PoX.A00
            java.lang.String r1 = X.00k.A0P(r4, r4, r4, r8, r1)
            android.text.SpannableString r1 = X.C66580MXl.A0D(r1)
            java.util.Iterator r16 = r8.iterator()
            r11 = 0
        L_0x019e:
            boolean r4 = r16.hasNext()
            if (r4 == 0) goto L_0x027c
            java.lang.Object r10 = r16.next()
            X.9JK r10 = (X.AnonymousClass9JK) r10
            java.lang.String r4 = r10.A04
            if (r4 == 0) goto L_0x01b9
            java.lang.Integer r8 = X.AnonymousClass5H9.A00(r4)
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            if (r8 != r4) goto L_0x01b9
            r8 = 1
            if (r14 != 0) goto L_0x01ba
        L_0x01b9:
            r8 = 0
        L_0x01ba:
            java.lang.String r4 = r10.A02
            if (r4 == 0) goto L_0x01d5
            int r4 = r4.length()
            if (r4 == 0) goto L_0x01d5
            if (r8 == 0) goto L_0x01d5
            X.4wh r4 = X.C71056OaZ.A00(r10, r11)
            X.C71056OaZ.A01(r1, r4, r14, r12, r13)
        L_0x01cd:
            java.lang.String r4 = r10.A05
            int r4 = X.DbX.A05(r4)
            int r11 = r11 + r4
            goto L_0x019e
        L_0x01d5:
            X.4wh r9 = X.C71056OaZ.A00(r10, r11)
            java.lang.String r4 = r10.A03
            java.lang.String r8 = "#999999"
            boolean r8 = X.0qQ.A0K(r4, r8)
            boolean r4 = X.DbW.A1a(r4)
            X.C71056OaZ.A01(r1, r9, r15, r8, r4)
            goto L_0x01cd
        L_0x01e9:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r4)
            throw r0
        L_0x01ee:
            boolean r1 = X.DbT.A1b(r17)
            if (r1 == 0) goto L_0x0237
            int r11 = r0.A00
            X.7Kx r1 = r0.A04
            int r10 = r1.A04
            android.text.SpannableString r1 = X.C66580MXl.A0D(r8)
            java.util.Iterator r12 = r17.iterator()
        L_0x0202:
            boolean r4 = r12.hasNext()
            if (r4 == 0) goto L_0x027c
            java.lang.Object r9 = r12.next()
            X.4wh r9 = (X.C278324wh) r9
            java.lang.Integer r8 = r9.A02
            if (r8 == 0) goto L_0x0219
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            if (r8 != r4) goto L_0x0219
            r8 = 1
            if (r10 != 0) goto L_0x021a
        L_0x0219:
            r8 = 0
        L_0x021a:
            java.lang.String r4 = r9.A03
            int r4 = X.C66580MXl.A06(r4)
            if (r4 == 0) goto L_0x022a
            if (r8 == 0) goto L_0x022a
            r8 = 1
            r4 = 0
            X.C71056OaZ.A01(r1, r9, r10, r8, r4)
            goto L_0x0202
        L_0x022a:
            java.lang.String r8 = r9.A04
            java.lang.String r4 = "#999999"
            boolean r8 = X.0qQ.A0K(r8, r4)
            r4 = 0
            X.C71056OaZ.A01(r1, r9, r11, r8, r4)
            goto L_0x0202
        L_0x0237:
            android.text.SpannableString r1 = r6.A00
            if (r1 != 0) goto L_0x0277
            java.lang.String r1 = r6.A03
            android.text.SpannableString r1 = X.C66580MXl.A0D(r1)
            r6.A00 = r1
            java.lang.String r1 = r6.A03
            int r11 = X.DbX.A05(r1)
            java.util.List r1 = r6.A06
            if (r1 == 0) goto L_0x0277
            java.util.Iterator r12 = r1.iterator()
        L_0x0251:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x0277
            java.lang.Object r4 = r12.next()
            X.4wf r4 = (X.C278304wf) r4
            int r1 = r4.A01
            if (r1 > r11) goto L_0x0251
            int r1 = r4.A00
            if (r1 > r11) goto L_0x0251
            android.text.SpannableString r10 = r6.A00
            r1 = 1
            android.text.style.StyleSpan r9 = new android.text.style.StyleSpan
            r9.<init>(r1)
            int r8 = r4.A01
            int r4 = r4.A00
            r1 = 17
            r10.setSpan(r9, r8, r4, r1)
            goto L_0x0251
        L_0x0277:
            android.text.SpannableString r1 = r6.A00
            X.0qQ.A0A(r1)
        L_0x027c:
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            boolean r9 = X.AnonymousClass7TE.A1b(r3)
            r4 = 33
            if (r9 == 0) goto L_0x02c8
            java.util.Iterator r15 = r3.iterator()
            r11 = 0
        L_0x028d:
            boolean r9 = r15.hasNext()
            if (r9 == 0) goto L_0x0328
            java.lang.Object r10 = r15.next()
            X.9JK r10 = (X.AnonymousClass9JK) r10
            java.lang.String r14 = r10.A05
            int r9 = X.DbX.A05(r14)
            int r12 = r11 + r9
            java.lang.String r10 = r10.A02
            if (r10 == 0) goto L_0x02c6
            int r9 = r10.length()
            if (r9 == 0) goto L_0x02c6
            java.lang.Integer r25 = X.AnonymousClass05K.A0u
            X.7Kx r9 = r0.A04
            int r13 = r9.A04
            r29 = 1
            java.lang.String r27 = ""
            X.3ud r9 = new X.3ud
            r24 = r9
            r26 = r14
            r28 = r13
            r24.<init>(r25, r26, r27, r28, r29)
            r1.setSpan(r9, r11, r12, r4)
            r8.add(r10)
        L_0x02c6:
            r11 = r12
            goto L_0x028d
        L_0x02c8:
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r12 = r17.iterator()
        L_0x02d0:
            boolean r9 = r12.hasNext()
            if (r9 == 0) goto L_0x02e9
            java.lang.Object r10 = r12.next()
            r9 = r10
            X.4wh r9 = (X.C278324wh) r9
            java.lang.String r9 = r9.A03
            int r9 = X.C66580MXl.A06(r9)
            if (r9 == 0) goto L_0x02d0
            r11.add(r10)
            goto L_0x02d0
        L_0x02e9:
            java.util.Iterator r13 = r11.iterator()
        L_0x02ed:
            boolean r9 = r13.hasNext()
            if (r9 == 0) goto L_0x0328
            java.lang.Object r10 = r13.next()
            X.4wh r10 = (X.C278324wh) r10
            int r11 = r10.A01
            int r9 = r10.A00
            java.lang.CharSequence r9 = r1.subSequence(r11, r9)
            java.lang.String r26 = r9.toString()
            java.lang.Integer r25 = X.AnonymousClass05K.A0u
            X.7Kx r9 = r0.A04
            int r11 = r9.A04
            r29 = 1
            java.lang.String r27 = ""
            X.3ud r9 = new X.3ud
            r24 = r9
            r28 = r11
            r24.<init>(r25, r26, r27, r28, r29)
            int r12 = r10.A01
            int r11 = r10.A00
            r1.setSpan(r9, r12, r11, r4)
            java.lang.String r9 = r10.A03
            X.0qQ.A07(r9)
            r8.add(r9)
            goto L_0x02ed
        L_0x0328:
            boolean r9 = r6 instanceof X.C68894NaW
            if (r9 == 0) goto L_0x03ff
            r9 = r6
            X.NaW r9 = (X.C68894NaW) r9
            if (r9 == 0) goto L_0x03ff
            java.lang.Integer r10 = r9.A01
        L_0x0333:
            java.lang.String r11 = r6.A02
            java.lang.String r9 = "ig_detected_outcome_order"
            boolean r9 = X.0qQ.A0K(r11, r9)
            if (r9 != 0) goto L_0x03f4
            java.lang.String r9 = r6.A02
            java.lang.String r6 = "ig_detected_outcome_lead"
            boolean r6 = X.0qQ.A0K(r9, r6)
            if (r6 != 0) goto L_0x03f4
            r12 = 1092616192(0x41200000, float:10.0)
        L_0x0349:
            X.3su r9 = r2.A0e
            X.0qQ.A07(r9)
            r6 = r19
            java.lang.String r19 = X.C66582MXn.A0s(r5, r9, r6)
            if (r10 == 0) goto L_0x0388
            int r6 = r10.intValue()
            int r11 = r0.A00
            android.graphics.drawable.Drawable r10 = r7.getDrawable(r6)
            if (r10 == 0) goto L_0x0388
            float r6 = X.C61380mr.A00(r7, r12)
            int r6 = (int) r6
            r9 = 0
            r10.setBounds(r9, r9, r6, r6)
            android.graphics.drawable.Drawable r6 = r10.mutate()
            X.AnonymousClass7TE.A1R(r6, r11)
            android.text.SpannableStringBuilder r7 = X.DbS.A0C(r1)
            java.lang.String r1 = "  "
            r7.insert(r9, r1)
            X.46l r6 = new X.46l
            r6.<init>(r10)
            r1 = 1
            r7.setSpan(r6, r9, r1, r4)
            android.text.SpannableString r1 = X.C66580MXl.A0D(r7)
        L_0x0388:
            java.util.List r20 = X.00k.A0a(r8)
            r22 = 1
            r4 = r17
            boolean r4 = r4 instanceof java.util.Collection
            if (r4 == 0) goto L_0x03d9
            boolean r4 = r17.isEmpty()
            if (r4 == 0) goto L_0x03d9
        L_0x039a:
            boolean r4 = r3 instanceof java.util.Collection
            if (r4 == 0) goto L_0x03be
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x03be
        L_0x03a4:
            r22 = 0
        L_0x03a6:
            r4 = r30
            r3 = r21
            android.graphics.drawable.ColorDrawable r16 = A00(r5, r2, r0, r4, r3)
            int r2 = r0.A00
            boolean r24 = r0.A00()
            X.74v r15 = new X.74v
            r17 = r1
            r21 = r2
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return r15
        L_0x03be:
            java.util.Iterator r4 = r3.iterator()
        L_0x03c2:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L_0x03a4
            java.lang.Object r3 = r4.next()
            X.9JK r3 = (X.AnonymousClass9JK) r3
            java.lang.String r3 = r3.A02
            if (r3 == 0) goto L_0x03c2
            int r3 = r3.length()
            if (r3 != 0) goto L_0x03a6
            goto L_0x03c2
        L_0x03d9:
            java.util.Iterator r6 = r17.iterator()
        L_0x03dd:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L_0x039a
            java.lang.Object r4 = r6.next()
            X.4wh r4 = (X.C278324wh) r4
            java.lang.String r4 = r4.A03
            if (r4 == 0) goto L_0x03dd
            int r4 = r4.length()
            if (r4 != 0) goto L_0x03a6
            goto L_0x03dd
        L_0x03f4:
            r6 = 2131237928(0x7f081c28, float:1.809212E38)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            r12 = 1094713344(0x41400000, float:12.0)
            goto L_0x0349
        L_0x03ff:
            r10 = 0
            goto L_0x0333
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70863OPc.A01(android.content.Context, com.instagram.common.session.UserSession, X.7LQ, X.7L2, X.46n, boolean, boolean, boolean, boolean):X.74v");
    }
}
