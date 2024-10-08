package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.P9w  reason: case insensitive filesystem */
public final class C72539P9w implements AnonymousClass7XN {
    public final AnonymousClass4DH A00;
    public final UserSession A01;
    public final AnonymousClass7HC A02;
    public final AnonymousClass7SM A03;
    public final AnonymousClass0eK A04;
    public final AnonymousClass0eK A05;
    public final AnonymousClass0eM A06 = C73923Pm3.A00(this, 47);
    public final AnonymousClass0eM A07 = C73923Pm3.A01(this, 48);

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x006c, code lost:
        if (X.182.A06(X.0Tu.A05, r9, 36314257725327858L) == false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0204, code lost:
        if (r0 != null) goto L_0x02a6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01c2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Eur(X.AnonymousClass7FU r52, X.C69347Njm r53, com.instagram.model.direct.messageid.MessageIdentifier r54) {
        /*
            r51 = this;
            r7 = r51
            r0 = r52
            X.4DH r11 = r7.A00
            boolean r1 = r11.isAdded()
            if (r1 == 0) goto L_0x003a
            android.content.Context r1 = r11.getContext()
            if (r1 == 0) goto L_0x003a
            X.0eK r5 = r7.A04
            java.lang.Object r1 = X.C66580MXl.A0s(r5)
            X.7Zg r1 = (X.C333517Zg) r1
            X.7S7 r1 = r1.C6l()
            X.3sy r6 = r1.AfV()
            java.lang.Object r1 = X.C66580MXl.A0s(r5)
            X.7Zg r1 = (X.C333517Zg) r1
            X.7S7 r1 = r1.C6l()
            X.3t2 r16 = r1.C6c()
            X.0qQ.A07(r16)
            java.lang.String r10 = "DirectThreadFragment.showMessageReplyBar"
            if (r6 != 0) goto L_0x003b
            X.OPK.A01(r11, r10)
        L_0x003a:
            return
        L_0x003b:
            r12 = r54
            java.lang.String r4 = r12.A01
            java.lang.Object r1 = X.C66580MXl.A0s(r5)
            X.7Zg r1 = (X.C333517Zg) r1
            X.7S7 r3 = r1.C6l()
            android.content.Context r2 = r11.requireContext()
            com.instagram.common.session.UserSession r9 = r7.A01
            androidx.fragment.app.FragmentActivity r1 = r11.requireActivity()
            boolean r1 = X.C70104NxK.A00(r1, r2, r11, r9, r3)
            if (r1 != 0) goto L_0x003a
            boolean r1 = r6 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            r50 = 0
            r3 = 1
            if (r1 == 0) goto L_0x006e
            X.0Tu r6 = X.0Tu.A05
            r1 = 36314257725327858(0x8103a0000009f2, double:3.028621039051744E-306)
            boolean r1 = X.182.A06(r6, r9, r1)
            r2 = 1
            if (r1 != 0) goto L_0x006f
        L_0x006e:
            r2 = 0
        L_0x006f:
            java.lang.String r8 = "Required value was null."
            java.lang.Object r1 = X.C66580MXl.A0s(r5)
            r6 = r53
            X.7Zg r1 = (X.C333517Zg) r1
            if (r2 == 0) goto L_0x0328
            X.7ZY r1 = r1.BSN()
            java.lang.String r11 = r1.BsP(r12)
            X.0Tu r3 = X.0Tu.A05
            r1 = 36313055140054702(0x810288005506ae, double:3.027860519282578E-306)
            boolean r1 = X.182.A06(r3, r9, r1)
            if (r1 == 0) goto L_0x00aa
            X.0eK r1 = r7.A05
            java.lang.Object r1 = r1.get()
            boolean r1 = X.AnonymousClass7TE.A1a(r1)
            if (r1 != 0) goto L_0x00aa
            java.lang.Object r1 = X.C66580MXl.A0s(r5)
            X.7Zg r1 = (X.C333517Zg) r1
            boolean r1 = r1.CYZ(r4)
            if (r1 == 0) goto L_0x00aa
            r50 = 1
        L_0x00aa:
            X.7SM r15 = r7.A03
            X.0eM r1 = r7.A07
            java.lang.Object r3 = r1.getValue()
            X.OVC r3 = (X.OVC) r3
            if (r11 == 0) goto L_0x0354
            com.instagram.common.session.UserSession r1 = r3.A01
            X.17i r2 = X.17h.A00(r1)
            X.MYd r9 = X.AnonymousClass6FA.A00(r1)
            java.lang.String r1 = "contextMessageViewModel is null"
            X.17k.A07(r0, r1)
            com.instagram.user.model.User r1 = r2.A02(r11)
            if (r50 == 0) goto L_0x0322
            android.content.Context r2 = r3.A00
            r1 = 2131960108(0x7f13212c, float:1.9556875E38)
            java.lang.String r46 = r2.getString(r1)
        L_0x00d4:
            android.content.Context r8 = r3.A00
            r5 = 0
            r45 = 0
            r4 = 0
            r2 = 0
            r13 = -1
            com.instagram.model.direct.messageid.MessageIdentifier r1 = r0.BSG()
            java.lang.String r1 = r1.A01
            r37 = r1
            com.instagram.model.direct.messageid.MessageIdentifier r1 = r0.BSG()
            java.lang.String r35 = r1.A00()
            X.2FW r12 = r0.Aqm()
            r18 = 0
            java.lang.String r1 = "ReplyActionSource is null"
            X.17k.A07(r6, r1)
            java.lang.String r1 = r6.A00
            r17 = r1
            java.lang.Boolean r34 = java.lang.Boolean.valueOf(r5)
            if (r50 == 0) goto L_0x0183
            r0 = 2131960107(0x7f13212b, float:1.9556873E38)
            java.lang.String r4 = r8.getString(r0)
        L_0x0109:
            r43 = 0
            X.3tI r0 = new X.3tI
            r19 = r18
            r20 = r18
            r21 = r18
            r22 = r18
            r23 = r18
            r24 = r18
            r25 = r18
            r26 = r18
            r27 = r18
            r28 = r18
            r29 = r18
            r30 = r12
            r31 = r18
            r32 = r18
            r33 = r18
            r36 = r18
            r38 = r17
            r39 = r11
            r40 = r18
            r41 = r18
            r42 = r18
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
            X.OBo r1 = new X.OBo
            r1.<init>(r6, r0)
            X.OHv r0 = new X.OHv
            r47 = r13
            r49 = r5
            r40 = r0
            r41 = r2
            r42 = r1
            r43 = r12
            r44 = r4
            r40.<init>(r41, r42, r43, r44, r45, r46, r47, r49, r50)
            r15.A01(r0)
            X.7HC r1 = r7.A02
        L_0x0159:
            java.lang.String r2 = r12.A00
            X.0wc r1 = r1.A00
            java.lang.String r0 = "direct_quoted_reply_click"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x003a
            java.lang.String r0 = r6.A00
            X.DbS.A1J(r1, r0)
            java.lang.String r0 = "type"
            r1.AAJ(r0, r2)
            r0 = r16
            X.C66583MXo.A16(r1, r0)
            boolean r0 = X.AnonymousClass6W3.A07(r16)
            X.C66581MXm.A1H(r1, r0)
            r1.Cgf()
            return
        L_0x0183:
            X.Nzx r1 = X.C70267Nzx.$redex_init_class
            int r1 = r12.ordinal()
            r3 = 2
            if (r1 == r3) goto L_0x0315
            r10 = 11
            if (r1 == r10) goto L_0x0308
            r10 = 14
            if (r1 == r10) goto L_0x02ff
            r10 = 53
            if (r1 == r10) goto L_0x01d4
            r10 = 3
            if (r1 == r10) goto L_0x026f
            r10 = 12
            if (r1 == r10) goto L_0x02b2
            r10 = 42
            if (r1 == r10) goto L_0x0291
            r3 = 54
            if (r1 != r3) goto L_0x0109
            r3 = r34
            boolean r1 = r0 instanceof X.C66851Mdk
            if (r1 == 0) goto L_0x01cb
            X.Mdk r0 = (X.C66851Mdk) r0
            X.4iq r0 = r0.A02
            if (r0 == 0) goto L_0x01b9
            boolean r0 = r0.A0V
        L_0x01b5:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
        L_0x01b9:
            boolean r1 = r3.booleanValue()
            r0 = 2131960105(0x7f132129, float:1.955687E38)
            if (r1 == 0) goto L_0x01c5
            r0 = 2131960115(0x7f132133, float:1.955689E38)
        L_0x01c5:
            java.lang.String r4 = r8.getString(r0)
            goto L_0x0109
        L_0x01cb:
            boolean r1 = r0 instanceof X.C68819NYd
            if (r1 == 0) goto L_0x01b9
            X.NYd r0 = (X.C68819NYd) r0
            boolean r0 = r0.A0A
            goto L_0x01b5
        L_0x01d4:
            boolean r1 = r0 instanceof X.AnonymousClass752
            if (r1 == 0) goto L_0x0208
            X.752 r0 = (X.AnonymousClass752) r0
            X.7Fr r1 = r0.A03
            X.75J r0 = r0.A05
            if (r0 == 0) goto L_0x020f
            boolean r10 = r0 instanceof X.AnonymousClass75K
            if (r10 == 0) goto L_0x01ea
            X.75K r0 = (X.AnonymousClass75K) r0
            java.lang.String r4 = r0.A01
            goto L_0x0109
        L_0x01ea:
            boolean r10 = r0 instanceof X.AnonymousClass75I
            if (r10 == 0) goto L_0x020f
            X.75I r0 = (X.AnonymousClass75I) r0
            boolean r10 = r0.A01
            if (r10 == 0) goto L_0x020f
            com.instagram.common.typedurl.ImageUrl r0 = r0.A00
            java.lang.String r0 = r0.getUrl()
            X.0qQ.A0B(r9, r3)
            r1 = 2131960095(0x7f13211f, float:1.955685E38)
            java.lang.String r4 = r8.getString(r1)
            if (r0 == 0) goto L_0x0109
            goto L_0x02a6
        L_0x0208:
            boolean r1 = r0 instanceof X.C328667Fr
            if (r1 == 0) goto L_0x0109
            r1 = r0
            X.7Fr r1 = (X.C328667Fr) r1
        L_0x020f:
            if (r1 == 0) goto L_0x0109
            X.777 r3 = r1.A0F
            if (r3 == 0) goto L_0x022b
            boolean r0 = r3 instanceof X.AnonymousClass776
            if (r0 == 0) goto L_0x022b
            X.776 r3 = (X.AnonymousClass776) r3
            com.instagram.common.typedurl.ImageUrl r0 = r3.A00
            java.lang.String r0 = r0.getUrl()
            java.lang.String r0 = r9.A00(r0)
            if (r0 == 0) goto L_0x022b
            com.instagram.common.typedurl.SimpleImageUrl r2 = X.DbS.A0V(r0)
        L_0x022b:
            X.779 r0 = r1.A0K
            if (r0 == 0) goto L_0x0109
            boolean r4 = X.0mk.A02(r8)
            int r0 = r0.ordinal()
            switch(r0) {
                case 1: goto L_0x025d;
                case 2: goto L_0x025d;
                case 3: goto L_0x023a;
                case 4: goto L_0x0265;
                case 5: goto L_0x0265;
                case 6: goto L_0x026a;
                case 7: goto L_0x025d;
                case 8: goto L_0x0265;
                case 9: goto L_0x023a;
                case 10: goto L_0x023a;
                case 11: goto L_0x025d;
                case 12: goto L_0x023a;
                case 13: goto L_0x023a;
                case 14: goto L_0x023a;
                case 15: goto L_0x0265;
                case 16: goto L_0x023a;
                case 17: goto L_0x023a;
                case 18: goto L_0x0253;
                default: goto L_0x023a;
            }
        L_0x023a:
            r0 = 2131960110(0x7f13212e, float:1.955688E38)
            java.lang.String r3 = r8.getString(r0)
            if (r4 == 0) goto L_0x02ef
            android.text.SpannableStringBuilder r0 = X.C51965G9l.A0E()
            android.text.SpannableStringBuilder r1 = r0.append(r3)
            java.lang.String r0 = " 📎"
            android.text.SpannableStringBuilder r4 = r1.append(r0)
            goto L_0x0109
        L_0x0253:
            java.lang.CharSequence r0 = r1.A0P
            if (r0 == 0) goto L_0x023a
            java.lang.String r4 = r0.toString()
            goto L_0x0109
        L_0x025d:
            X.74T r0 = r1.A0D
            if (r0 == 0) goto L_0x023a
            java.lang.CharSequence r4 = r0.A09
            goto L_0x0109
        L_0x0265:
            r0 = 2131960111(0x7f13212f, float:1.9556881E38)
            goto L_0x01c5
        L_0x026a:
            r0 = 2131960097(0x7f132121, float:1.9556853E38)
            goto L_0x01c5
        L_0x026f:
            X.Mcv r0 = (X.C66809Mcv) r0
            X.0qQ.A0B(r0, r5)
            boolean r2 = r0.A0H
            r1 = 2131960105(0x7f132129, float:1.955687E38)
            if (r2 == 0) goto L_0x027e
            r1 = 2131960115(0x7f132133, float:1.955689E38)
        L_0x027e:
            java.lang.String r4 = r8.getString(r1)
            long r13 = r0.A04
            com.instagram.common.typedurl.ImageUrl r2 = r0.A00
            int r0 = r0.BIZ()
            if (r0 != r3) goto L_0x0109
            r5 = 1
            java.lang.Integer r45 = X.AnonymousClass05K.A0C
            goto L_0x0109
        L_0x0291:
            X.7Fs r0 = (X.C328677Fs) r0
            X.0qQ.A0B(r0, r5)
            X.0qQ.A0B(r9, r3)
            r1 = 2131960095(0x7f13211f, float:1.955685E38)
            java.lang.String r4 = r8.getString(r1)
            com.instagram.common.typedurl.ImageUrl r0 = r0.A00
            java.lang.String r0 = r0.getUrl()
        L_0x02a6:
            java.lang.String r1 = r9.A00(r0)
            if (r1 == 0) goto L_0x02d3
            com.instagram.common.typedurl.SimpleImageUrl r2 = X.DbS.A0V(r1)
            goto L_0x0109
        L_0x02b2:
            boolean r1 = r0 instanceof X.C328707Fv
            if (r1 == 0) goto L_0x02d9
            X.7Fv r0 = (X.C328707Fv) r0
            X.0qQ.A0B(r0, r5)
            X.0qQ.A0B(r9, r3)
            r1 = 2131960103(0x7f132127, float:1.9556865E38)
            java.lang.String r4 = r8.getString(r1)
            com.instagram.model.mediasize.GifUrlImpl r1 = r0.A02
        L_0x02c7:
            if (r1 == 0) goto L_0x0109
            java.lang.String r0 = r1.A09
            java.lang.String r0 = r9.A00(r0)
            if (r0 != 0) goto L_0x02d3
            java.lang.String r0 = r1.A09
        L_0x02d3:
            com.instagram.common.typedurl.SimpleImageUrl r2 = X.DbS.A0V(r0)
            goto L_0x0109
        L_0x02d9:
            boolean r1 = r0 instanceof X.NYR
            if (r1 == 0) goto L_0x0109
            X.NYR r0 = (X.NYR) r0
            X.0qQ.A0B(r0, r5)
            X.0qQ.A0B(r9, r3)
            r1 = 2131960095(0x7f13211f, float:1.955685E38)
            java.lang.String r4 = r8.getString(r1)
            com.instagram.model.mediasize.GifUrlImpl r1 = r0.A00
            goto L_0x02c7
        L_0x02ef:
            android.text.SpannableStringBuilder r1 = X.C51965G9l.A0E()
            java.lang.String r0 = "📎 "
            android.text.SpannableStringBuilder r0 = r1.append(r0)
            android.text.SpannableStringBuilder r4 = r0.append(r3)
            goto L_0x0109
        L_0x02ff:
            r0 = 2131960116(0x7f132134, float:1.9556892E38)
            java.lang.String r4 = r8.getString(r0)
            goto L_0x0109
        L_0x0308:
            X.NYI r0 = (X.NYI) r0
            X.0qQ.A0B(r0, r5)
            java.lang.CharSequence r0 = r0.A02
            java.lang.String r4 = r0.toString()
            goto L_0x0109
        L_0x0315:
            X.79c r0 = (X.AnonymousClass79c) r0
            X.0qQ.A0B(r0, r5)
            java.lang.CharSequence r0 = r0.A04
            java.lang.String r4 = r0.toString()
            goto L_0x0109
        L_0x0322:
            java.lang.String r46 = X.OVC.A00(r3, r1, r11)
            goto L_0x00d4
        L_0x0328:
            X.7S9 r0 = r1.AvL()
            X.7LQ r2 = r0.BSO(r4)
            if (r2 != 0) goto L_0x033b
            X.OPK.A00(r11)
            java.lang.String r0 = "MessageRowData is null"
            X.0wb.A04(r0, r10, r3)
            return
        L_0x033b:
            X.7SM r1 = r7.A03
            X.0eM r0 = r7.A07
            java.lang.Object r0 = r0.getValue()
            X.OVC r0 = (X.OVC) r0
            X.OHv r0 = r0.A01(r2, r6)
            r1.A01(r0)
            X.7HC r1 = r7.A02
            X.3su r0 = r2.A0e
            X.2FW r12 = r0.A10
            goto L_0x0159
        L_0x0354:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72539P9w.Eur(X.7FU, X.Njm, com.instagram.model.direct.messageid.MessageIdentifier):void");
    }

    public final void Eus(AnonymousClass7LQ r3, C69347Njm njm) {
        AnonymousClass4DH r1 = this.A00;
        if (r1.isAdded() && r1.getContext() != null) {
            1Ln A0D = C66584MXp.A0D(this.A06);
            if (DbT.A1Y(A0D)) {
                C66583MXo.A1B(A0D);
                C66580MXl.A1L(A0D, C273654mx.A00(2863));
                A0D.Cgf();
            }
            this.A03.A01(((OVC) this.A07.getValue()).A01(r3, njm));
        }
    }

    public C72539P9w(AnonymousClass4DH r2, AnonymousClass0iw r3, UserSession userSession, AnonymousClass7SM r5, AnonymousClass0eK r6, AnonymousClass0eK r7) {
        C51974G9v.A1M(r3, r2, r5);
        0qQ.A0B(r6, 5);
        this.A01 = userSession;
        this.A00 = r2;
        this.A03 = r5;
        this.A04 = r6;
        this.A05 = r7;
        this.A02 = new AnonymousClass7HC(r3, userSession);
    }
}
