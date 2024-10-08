package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Mbo  reason: case insensitive filesystem */
public final class C66743Mbo {
    public final UserSession A00;
    public final C71011OYj A01;

    /* JADX WARNING: Code restructure failed: missing block: B:136:0x032e, code lost:
        if (r2.equals(r4.A02.A06) == false) goto L_0x0330;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ef, code lost:
        if (r2.equals(r9.A02.A06) == false) goto L_0x00f1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A00(android.content.Context r44, X.C74421Pub r45, X.C254743sy r46, java.lang.String r47, java.util.List r48, int r49, int r50, int r51, boolean r52, boolean r53) {
        /*
            r43 = this;
            r12 = 0
            r6 = r44
            r26 = r46
            r0 = r26
            boolean r11 = X.AnonymousClass7TF.A1U(r12, r6, r0)
            r10 = 2
            r7 = r48
            X.0qQ.A0B(r7, r10)
            r3 = r43
            com.instagram.common.session.UserSession r8 = r3.A00
            java.lang.Class<X.Oxz> r2 = X.C72190Oxz.class
            r1 = 15
            X.Plp r0 = new X.Plp
            r0.<init>(r8, r1)
            java.lang.Object r4 = r8.A01(r2, r0)
            X.Oxz r4 = (X.C72190Oxz) r4
            r13 = 3
            X.0qQ.A0B(r4, r13)
            java.lang.String r1 = X.C66647MaG.A0B(r26)
            java.util.HashMap r22 = X.AnonymousClass7TE.A1E()
            if (r1 == 0) goto L_0x00bf
            java.util.Iterator r15 = r7.iterator()
        L_0x0036:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x00bf
            java.lang.Object r14 = r15.next()
            X.170 r14 = (X.AnonymousClass170) r14
            boolean r0 = r14.CXO()
            if (r0 == 0) goto L_0x009b
            java.lang.String r5 = r14.getId()
            monitor-enter(r4)
            X.0qQ.A0B(r5, r11)     // Catch:{ all -> 0x0305 }
            java.util.Set r2 = r4.A01     // Catch:{ all -> 0x0305 }
            r0 = 46
            java.lang.String r0 = X.002.A0T(r1, r5, r0)     // Catch:{ all -> 0x0305 }
            boolean r0 = r2.contains(r0)     // Catch:{ all -> 0x0305 }
            monitor-exit(r4)
            if (r0 != 0) goto L_0x009b
            java.lang.String r5 = r14.getId()
            int r0 = r14.BIW()
            if (r0 != 0) goto L_0x0096
            java.lang.String r0 = r14.getFullName()
            if (r0 == 0) goto L_0x0091
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0091
            r9 = 2131958654(0x7f131b7e, float:1.9553926E38)
            java.lang.String r2 = r14.getFullName()
            java.lang.String r0 = r14.getUsername()
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0}
            java.lang.String r2 = r6.getString(r9, r0)
            X.0qQ.A0A(r2)
        L_0x008b:
            r0 = r22
            r0.put(r5, r2)
            goto L_0x0036
        L_0x0091:
            java.lang.String r2 = r14.getUsername()
            goto L_0x008b
        L_0x0096:
            java.lang.String r2 = r14.getFullName()
            goto L_0x008b
        L_0x009b:
            boolean r0 = r14.CXO()
            if (r0 != 0) goto L_0x0036
            java.lang.String r5 = r14.getId()
            monitor-enter(r4)
            X.0qQ.A0B(r5, r11)     // Catch:{ all -> 0x0305 }
            java.util.Set r2 = r4.A01     // Catch:{ all -> 0x0305 }
            r0 = 46
            java.lang.String r0 = X.002.A0T(r1, r5, r0)     // Catch:{ all -> 0x0305 }
            boolean r0 = r2.remove(r0)     // Catch:{ all -> 0x0305 }
            if (r0 == 0) goto L_0x00bc
            X.OJv r0 = r4.A00     // Catch:{ all -> 0x0305 }
            r0.A00(r2)     // Catch:{ all -> 0x0305 }
        L_0x00bc:
            monitor-exit(r4)
            goto L_0x0036
        L_0x00bf:
            boolean r0 = r22.isEmpty()
            r21 = 1
            r0 = r0 ^ 1
            r23 = r45
            r2 = r47
            r28 = r49
            r29 = r50
            r31 = r51
            r1 = r53
            if (r0 == 0) goto L_0x0269
            X.OYj r9 = r3.A01
            X.76k r20 = X.C3263476j.A00(r1, r11)
            if (r52 == 0) goto L_0x014d
            X.Nlp r14 = X.C69445Nlp.GXAC
        L_0x00df:
            int r3 = r22.size()
            if (r47 == 0) goto L_0x00f1
            com.instagram.common.session.UserSession r0 = r9.A02
            java.lang.String r0 = r0.A06
            boolean r0 = r2.equals(r0)
            r42 = 0
            if (r0 != 0) goto L_0x00f3
        L_0x00f1:
            r42 = 1
        L_0x00f3:
            android.content.Context r8 = r9.A00
            android.content.res.Resources r1 = r8.getResources()
            boolean r19 = X.AnonymousClass7LY.A00(r29)
            r0 = 2131820643(0x7f110063, float:1.9274007E38)
            if (r19 == 0) goto L_0x0105
            r0 = 2131820642(0x7f110062, float:1.9274005E38)
        L_0x0105:
            java.lang.String r1 = X.DbY.A0d(r1, r3, r0)
            X.0qQ.A07(r1)
            java.util.Locale r0 = X.AnonymousClass1Q2.A02()
            int r0 = android.text.TextUtils.getLayoutDirectionFromLocale(r0)
            if (r0 != r13) goto L_0x014a
            java.lang.String r0 = "‎"
        L_0x0118:
            X.8ab r7 = X.DbS.A0Y(r8)
            r7.A05 = r1
            r6 = 2131964884(0x7f1333d4, float:1.9566562E38)
            java.lang.String r18 = X.AnonymousClass7TE.A16(r8, r6)
            java.lang.StringBuilder r17 = X.AnonymousClass7TF.A0n(r0)
            java.util.ArrayList r5 = X.DbS.A0v(r10)
            java.util.Iterator r2 = X.AnonymousClass7TF.A0s(r22)
            r1 = 0
        L_0x0132:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0150
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            r5.add(r0)
            int r1 = r1 + 1
            if (r1 >= r10) goto L_0x0150
            goto L_0x0132
        L_0x014a:
            java.lang.String r0 = "‏"
            goto L_0x0118
        L_0x014d:
            X.Nlp r14 = X.C69445Nlp.DEFAULT
            goto L_0x00df
        L_0x0150:
            java.util.ArrayList r4 = X.DbS.A0v(r10)
            int r16 = r5.size()
            r3 = 0
        L_0x0159:
            r0 = r16
            if (r3 >= r0) goto L_0x01ae
            java.lang.Object r2 = r5.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r0 = "("
            boolean r0 = X.00l.A0d(r2, r0, r12)
            if (r0 == 0) goto L_0x01a6
            r15 = 40
            X.0qQ.A0B(r2, r12)
            int r1 = r2.length()
            int r0 = r1 + -1
            int r0 = X.00l.A05(r2, r15, r0)
            int r15 = r0 + 1
            int r0 = r1 - r11
            java.lang.String r0 = r2.substring(r15, r0)
            X.0qQ.A07(r0)
            int r15 = r0.length()
            int r1 = r1 - r15
            int r1 = r1 - r13
            java.lang.String r2 = r2.substring(r12, r1)
            X.0qQ.A07(r2)
            r1 = 2131963748(0x7f132f64, float:1.9564258E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0}
        L_0x0199:
            java.lang.String r0 = r8.getString(r1, r0)
            X.0qQ.A07(r0)
            r4.add(r0)
            int r3 = r3 + 1
            goto L_0x0159
        L_0x01a6:
            r1 = 2131963749(0x7f132f65, float:1.956426E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r2}
            goto L_0x0199
        L_0x01ae:
            int r0 = r22.size()
            if (r0 != r11) goto L_0x0212
            if (r19 == 0) goto L_0x020e
            r3 = 2131959906(0x7f132062, float:1.9556466E38)
            if (r42 == 0) goto L_0x01be
            r3 = 2131959905(0x7f132061, float:1.9556464E38)
        L_0x01be:
            java.lang.Object r0 = r4.get(r12)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
        L_0x01c6:
            java.lang.String r1 = r8.getString(r3, r0)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r8, r6)
            java.lang.CharSequence[] r0 = new java.lang.CharSequence[]{r0}
            java.lang.CharSequence r1 = android.text.TextUtils.expandTemplate(r1, r0)
            X.0qQ.A0A(r1)
            r0 = r17
            java.lang.String r2 = X.AnonymousClass7TF.A0i(r1, r0)
            com.instagram.common.session.UserSession r3 = r9.A02
            r0 = 24
            X.Of1 r1 = new X.Of1
            r1.<init>(r0, r8, r3)
            r0 = r18
            r7.A0Z(r1, r2, r0)
            X.0iw r2 = r9.A01
            X.PFa r1 = new X.PFa
            r0 = r20
            r1.<init>(r0, r14, r2, r3)
            r32 = r1
            r34 = r9
            r35 = r7
            r36 = r26
            r37 = r22
            r40 = r12
            r33 = r23
            r38 = r28
            r39 = r29
            r41 = r31
            X.C71011OYj.A00(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            return r21
        L_0x020e:
            r3 = 2131959907(0x7f132063, float:1.9556468E38)
            goto L_0x01be
        L_0x0212:
            int r0 = r22.size()
            if (r0 != r10) goto L_0x0233
            if (r19 == 0) goto L_0x022f
            r3 = 2131960619(0x7f13232b, float:1.9557912E38)
            if (r42 == 0) goto L_0x0222
            r3 = 2131960618(0x7f13232a, float:1.955791E38)
        L_0x0222:
            java.lang.Object r1 = r4.get(r12)
            java.lang.Object r0 = r4.get(r11)
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            goto L_0x01c6
        L_0x022f:
            r3 = 2131960620(0x7f13232c, float:1.9557914E38)
            goto L_0x0222
        L_0x0233:
            int r0 = r22.size()
            int r0 = r0 - r10
            if (r0 != r11) goto L_0x0249
            if (r19 == 0) goto L_0x0245
            r3 = 2131960606(0x7f13231e, float:1.9557885E38)
            if (r42 == 0) goto L_0x0222
            r3 = 2131960605(0x7f13231d, float:1.9557883E38)
            goto L_0x0222
        L_0x0245:
            r3 = 2131960607(0x7f13231f, float:1.9557887E38)
            goto L_0x0222
        L_0x0249:
            if (r19 == 0) goto L_0x0265
            r3 = 2131959302(0x7f131e06, float:1.955524E38)
            if (r42 == 0) goto L_0x0253
            r3 = 2131959301(0x7f131e05, float:1.9555239E38)
        L_0x0253:
            java.lang.Object r2 = r4.get(r12)
            java.lang.Object r1 = r4.get(r11)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r1, r0}
            goto L_0x01c6
        L_0x0265:
            r3 = 2131959303(0x7f131e07, float:1.9555243E38)
            goto L_0x0253
        L_0x0269:
            java.lang.Class<X.Oy2> r5 = X.Oy2.class
            r4 = 16
            X.Plp r0 = new X.Plp
            r0.<init>(r8, r4)
            java.lang.Object r4 = r8.A01(r5, r0)
            X.Oy2 r4 = (X.Oy2) r4
            X.0qQ.A0B(r4, r13)
            java.lang.String r8 = X.C66647MaG.A0B(r26)
            java.util.HashMap r5 = X.AnonymousClass7TE.A1E()
            if (r8 == 0) goto L_0x0308
            java.util.Iterator r15 = r7.iterator()
        L_0x0289:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0308
            java.lang.Object r14 = r15.next()
            X.170 r14 = (X.AnonymousClass170) r14
            boolean r0 = r14.isRestricted()
            if (r0 == 0) goto L_0x02e1
            java.lang.String r9 = r14.getId()
            monitor-enter(r4)
            X.0qQ.A0B(r9, r11)     // Catch:{ all -> 0x0305 }
            java.util.Set r7 = r4.A01     // Catch:{ all -> 0x0305 }
            r0 = 46
            java.lang.String r0 = X.002.A0T(r8, r9, r0)     // Catch:{ all -> 0x0305 }
            boolean r0 = r7.contains(r0)     // Catch:{ all -> 0x0305 }
            monitor-exit(r4)
            if (r0 != 0) goto L_0x02e1
            java.lang.String r13 = r14.getId()
            java.lang.String r0 = r14.getFullName()
            if (r0 == 0) goto L_0x02dc
            int r0 = r0.length()
            if (r0 == 0) goto L_0x02dc
            r9 = 2131960255(0x7f1321bf, float:1.9557174E38)
            java.lang.String r7 = r14.getFullName()
            java.lang.String r0 = r14.getUsername()
            java.lang.Object[] r0 = new java.lang.Object[]{r7, r0}
            java.lang.String r0 = r6.getString(r9, r0)
            X.0qQ.A0A(r0)
        L_0x02d8:
            r5.put(r13, r0)
            goto L_0x0289
        L_0x02dc:
            java.lang.String r0 = r14.getUsername()
            goto L_0x02d8
        L_0x02e1:
            boolean r0 = r14.isRestricted()
            if (r0 != 0) goto L_0x0289
            java.lang.String r9 = r14.getId()
            monitor-enter(r4)
            X.0qQ.A0B(r9, r11)     // Catch:{ all -> 0x0305 }
            java.util.Set r7 = r4.A01     // Catch:{ all -> 0x0305 }
            r0 = 46
            java.lang.String r0 = X.002.A0T(r8, r9, r0)     // Catch:{ all -> 0x0305 }
            r7.remove(r0)     // Catch:{ all -> 0x0305 }
            boolean r0 = r4.A02     // Catch:{ all -> 0x0305 }
            if (r0 == 0) goto L_0x0303
            X.Mbp r0 = r4.A00     // Catch:{ all -> 0x0305 }
            r0.A00(r7)     // Catch:{ all -> 0x0305 }
        L_0x0303:
            monitor-exit(r4)
            goto L_0x0289
        L_0x0305:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0308:
            boolean r0 = r5.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x03ea
            X.1YZ r0 = X.1YZ.A02
            if (r0 == 0) goto L_0x03ea
            X.OYj r4 = r3.A01
            X.76k r3 = X.C3263476j.A00(r1, r11)
            if (r52 == 0) goto L_0x03e6
            X.Nlp r6 = X.C69445Nlp.GXAC
        L_0x031e:
            boolean r1 = X.AnonymousClass7LY.A00(r29)
            if (r47 == 0) goto L_0x0330
            com.instagram.common.session.UserSession r0 = r4.A02
            java.lang.String r0 = r0.A06
            boolean r0 = r2.equals(r0)
            r32 = 0
            if (r0 != 0) goto L_0x0332
        L_0x0330:
            r32 = 1
        L_0x0332:
            android.content.Context r7 = r4.A00
            r0 = 2131972323(0x7f1350e3, float:1.958165E38)
            if (r1 == 0) goto L_0x033c
            r0 = 2131972317(0x7f1350dd, float:1.9581638E38)
        L_0x033c:
            java.lang.String r0 = r7.getString(r0)
            X.8ab r2 = X.DbS.A0Y(r7)
            r2.A05 = r0
            if (r1 == 0) goto L_0x03d4
            r9 = 2131972316(0x7f1350dc, float:1.9581636E38)
            if (r32 == 0) goto L_0x0350
            r9 = 2131972315(0x7f1350db, float:1.9581634E38)
        L_0x0350:
            java.util.Iterator r15 = X.AnonymousClass7TF.A0s(r5)
            int r0 = r5.size()
            int r13 = r5.size()
            int r13 = r13 - r10
            if (r0 != r11) goto L_0x03a4
            java.lang.Object r0 = X.C51971G9r.A0p(r15)
            java.lang.String r0 = (java.lang.String) r0
        L_0x0365:
            java.lang.String r0 = X.002.A0B(r0)
            X.0qQ.A07(r0)
            java.lang.String r1 = X.DbW.A0h(r7, r0, r9)
            java.lang.CharSequence[] r0 = new java.lang.CharSequence[r12]
            java.lang.CharSequence r0 = android.text.TextUtils.expandTemplate(r1, r0)
            X.0qQ.A07(r0)
            r2.A0q(r0)
            com.instagram.common.session.UserSession r8 = r4.A02
            X.0iw r1 = r4.A01
            r0 = r26
            boolean r0 = r0 instanceof com.instagram.model.direct.DirectThreadKey
            if (r0 == 0) goto L_0x03a1
            java.lang.String r7 = X.C66647MaG.A09(r26)
        L_0x038a:
            X.0wc r1 = X.AnonymousClass0kN.A01(r1, r8)
            X.PFb r0 = new X.PFb
            r0.<init>(r3, r6, r1, r7)
            r22 = r0
            r24 = r4
            r25 = r2
            r27 = r5
            r30 = r11
            X.C71011OYj.A00(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            return r21
        L_0x03a1:
            java.lang.String r7 = "-1"
            goto L_0x038a
        L_0x03a4:
            if (r0 != r10) goto L_0x03b8
            if (r13 != 0) goto L_0x03b8
            r8 = 2131972324(0x7f1350e4, float:1.9581652E38)
            java.lang.Object r1 = X.C51971G9r.A0p(r15)
            java.lang.Object r0 = X.C51971G9r.A0p(r15)
            java.lang.String r0 = X.DbV.A0u(r7, r1, r0, r8)
            goto L_0x0365
        L_0x03b8:
            android.content.res.Resources r10 = r7.getResources()
            r8 = 2131820922(0x7f11017a, float:1.9274573E38)
            java.lang.Object r14 = X.C51971G9r.A0p(r15)
            java.lang.Object r1 = X.C51971G9r.A0p(r15)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            java.lang.Object[] r0 = new java.lang.Object[]{r14, r1, r0}
            java.lang.String r0 = r10.getQuantityString(r8, r13, r0)
            goto L_0x0365
        L_0x03d4:
            com.instagram.common.session.UserSession r1 = r4.A02
            X.0Tu r0 = X.0Tu.A05
            boolean r0 = X.182.A05(r0, r1)
            r9 = 2131972322(0x7f1350e2, float:1.9581648E38)
            if (r0 == 0) goto L_0x0350
            r9 = 2131972318(0x7f1350de, float:1.958164E38)
            goto L_0x0350
        L_0x03e6:
            X.Nlp r6 = X.C69445Nlp.DEFAULT
            goto L_0x031e
        L_0x03ea:
            r21 = 0
            return r21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66743Mbo.A00(android.content.Context, X.Pub, X.3sy, java.lang.String, java.util.List, int, int, int, boolean, boolean):boolean");
    }

    public C66743Mbo(Context context, AnonymousClass0iw r3, UserSession userSession, C333597Zo r5) {
        C51974G9v.A1L(context, userSession, r3);
        this.A00 = userSession;
        this.A01 = new C71011OYj(context, r3, userSession, r5);
    }
}
