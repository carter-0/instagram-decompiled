package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Kp2  reason: case insensitive filesystem */
public abstract class C62950Kp2 {
    public final C65227LpX A00() {
        AnonymousClass4DH r2;
        UserSession userSession;
        boolean A00;
        C66576MXh mXh;
        C61847KOm kOm;
        C66535MVp mVp;
        if (this instanceof C61826KNp) {
            C61826KNp kNp = (C61826KNp) this;
            r2 = kNp.A01;
            userSession = kNp.A06;
            A00 = LTP.A04(userSession);
            mXh = kNp.A08;
            kOm = kNp.A0D.A0Y;
            mVp = kNp.A09;
        } else {
            C61827KNq kNq = (C61827KNq) this;
            r2 = kNq.A00;
            userSession = kNq.A02;
            A00 = LTP.A00(userSession);
            mXh = kNq.A09;
            kOm = kNq.A08.A0O;
            mVp = kNq.A0A;
        }
        return new C65227LpX(r2, userSession, mXh, mVp, kOm, A00);
    }

    public final C65193Low A01() {
        AnonymousClass4DH r4;
        UserSession userSession;
        boolean A00;
        KOI koi;
        if (this instanceof C61826KNp) {
            C61826KNp kNp = (C61826KNp) this;
            r4 = kNp.A01;
            userSession = kNp.A06;
            A00 = LTP.A04(userSession);
            koi = kNp.A0D.A0M;
        } else {
            C61827KNq kNq = (C61827KNq) this;
            r4 = kNq.A00;
            userSession = kNq.A02;
            A00 = LTP.A00(userSession);
            koi = kNq.A08.A0J;
        }
        return new C65193Low(r4, userSession, koi, A00);
    }

    public final C65206LpC A02() {
        AnonymousClass4DH r2;
        UserSession userSession;
        boolean A00;
        boolean z;
        String string;
        0sP mp4;
        if (this instanceof C61826KNp) {
            C61826KNp kNp = (C61826KNp) this;
            r2 = kNp.A01;
            userSession = kNp.A06;
            A00 = LTP.A04(userSession);
            C61075JwD jwD = kNp.A0D.A01;
            if (jwD != null) {
                z = jwD.A0e;
            } else {
                z = false;
            }
            mp4 = new MP9(kNp, 0);
            string = null;
        } else {
            C61827KNq kNq = (C61827KNq) this;
            r2 = kNq.A00;
            userSession = kNq.A02;
            A00 = LTP.A00(userSession);
            z = kNq.A08.A03.A04().A4y;
            string = r2.getString(2131975570);
            mp4 = new MP4(kNq, 5);
        }
        return new C65206LpC(r2, userSession, string, mp4, A00, z);
    }

    public final C65225LpV A03() {
        AnonymousClass4DH r1;
        UserSession userSession;
        boolean A00;
        C66576MXh mXh;
        C62462KgC kgC;
        String str;
        if (this instanceof C61826KNp) {
            C61826KNp kNp = (C61826KNp) this;
            r1 = kNp.A01;
            userSession = kNp.A06;
            A00 = LTP.A04(userSession);
            mXh = kNp.A08;
            kgC = C62462KgC.CLIPS;
            str = "reel";
        } else {
            C61827KNq kNq = (C61827KNq) this;
            r1 = kNq.A00;
            userSession = kNq.A02;
            A00 = LTP.A00(userSession);
            mXh = kNq.A09;
            kgC = C62462KgC.FEED;
            str = "feed";
        }
        return new C65225LpV(r1, userSession, mXh, kgC, str, A00);
    }

    public final MVS A04() {
        if (this instanceof C61826KNp) {
            return null;
        }
        C61827KNq kNq = (C61827KNq) this;
        AnonymousClass4DH r3 = kNq.A00;
        UserSession userSession = kNq.A02;
        C61828KNr kNr = kNq.A08;
        String str = kNr.A03.A04().A3t;
        return new C65229LpZ(r3, userSession, kNr.A0D, kNq.A09, kNq.A0D, str);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0435 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.MVS A05(X.C62779KmH r21) {
        /*
            r20 = this;
            r0 = r21
            boolean r1 = r0 instanceof X.C61832KNv
            r2 = r20
            if (r1 == 0) goto L_0x0048
            X.KNv r0 = (X.C61832KNv) r0
            com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType r3 = r0.A00
            r4 = r2
            boolean r0 = r2 instanceof X.C61826KNp
            if (r0 == 0) goto L_0x0034
            X.KNp r4 = (X.C61826KNp) r4
            r0 = 0
            X.0qQ.A0B(r3, r0)
            com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType r0 = com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType.CROSSPOST
            if (r3 != r0) goto L_0x002b
            X.4DH r3 = r4.A01
            com.instagram.common.session.UserSession r2 = r4.A06
            X.KNs r0 = r4.A0D
            X.KOn r1 = r0.A0i
            X.MXh r0 = r4.A08
            X.KNu r6 = new X.KNu
            r6.<init>(r3, r2, r0, r1)
            return r6
        L_0x002b:
            X.4DH r2 = r4.A01
            X.MXh r1 = r4.A08
            X.KNs r0 = r4.A0D
            X.KOD r0 = r0.A08
            goto L_0x0042
        L_0x0034:
            X.KNq r4 = (X.C61827KNq) r4
            r0 = 0
            X.0qQ.A0B(r3, r0)
            X.4DH r2 = r4.A00
            X.MXh r1 = r4.A09
            X.KNr r0 = r4.A08
            X.KOD r0 = r0.A0B
        L_0x0042:
            X.KNt r6 = new X.KNt
            r6.<init>(r2, r0, r1, r3)
            return r6
        L_0x0048:
            boolean r1 = r0 instanceof X.C61834KNy
            if (r1 == 0) goto L_0x006f
            X.KNy r0 = (X.C61834KNy) r0
            java.lang.Integer r3 = r0.A00
            boolean r0 = r2 instanceof X.C61826KNp
            if (r0 == 0) goto L_0x0064
            X.KNp r2 = (X.C61826KNp) r2
            X.4DH r1 = r2.A01
            com.instagram.common.session.UserSession r0 = r2.A06
            boolean r0 = X.LTP.A04(r0)
        L_0x005e:
            X.LpQ r6 = new X.LpQ
            r6.<init>(r1, r3, r0)
            return r6
        L_0x0064:
            X.KNq r2 = (X.C61827KNq) r2
            X.4DH r1 = r2.A00
            com.instagram.common.session.UserSession r0 = r2.A02
            boolean r0 = X.LTP.A00(r0)
            goto L_0x005e
        L_0x006f:
            boolean r1 = r0 instanceof X.KNx
            if (r1 == 0) goto L_0x0087
            r1 = r2
            boolean r0 = r2 instanceof X.C61826KNp
            if (r0 == 0) goto L_0x0082
            X.KNp r1 = (X.C61826KNp) r1
            X.4DH r0 = r1.A01
        L_0x007c:
            X.Lof r6 = new X.Lof
            r6.<init>(r0)
            return r6
        L_0x0082:
            X.KNq r1 = (X.C61827KNq) r1
            X.4DH r0 = r1.A00
            goto L_0x007c
        L_0x0087:
            boolean r1 = r0 instanceof X.C61833KNw
            if (r1 == 0) goto L_0x0619
            r1 = r0
            X.KNw r1 = (X.C61833KNw) r1
            java.lang.Integer r1 = r1.A00
            int r1 = r1.intValue()
            switch(r1) {
                case 0: goto L_0x05f2;
                case 1: goto L_0x05d5;
                case 2: goto L_0x03f9;
                case 3: goto L_0x041e;
                case 4: goto L_0x03e2;
                case 5: goto L_0x03cb;
                case 6: goto L_0x0367;
                case 7: goto L_0x034e;
                case 8: goto L_0x05b5;
                case 9: goto L_0x00b4;
                case 10: goto L_0x0331;
                case 11: goto L_0x0588;
                case 12: goto L_0x00ae;
                case 13: goto L_0x0316;
                case 14: goto L_0x055e;
                case 15: goto L_0x02fc;
                case 16: goto L_0x02dd;
                case 17: goto L_0x02c3;
                case 18: goto L_0x02ad;
                case 19: goto L_0x0517;
                case 20: goto L_0x0295;
                case 21: goto L_0x0258;
                case 22: goto L_0x0242;
                case 23: goto L_0x00a8;
                case 24: goto L_0x0208;
                case 25: goto L_0x04ea;
                case 26: goto L_0x04b9;
                case 27: goto L_0x01ed;
                case 28: goto L_0x01d2;
                case 29: goto L_0x01ba;
                case 30: goto L_0x0495;
                case 31: goto L_0x046d;
                case 32: goto L_0x01a0;
                case 33: goto L_0x00a2;
                case 34: goto L_0x0177;
                case 35: goto L_0x015c;
                case 36: goto L_0x0144;
                case 37: goto L_0x0445;
                case 38: goto L_0x012c;
                case 39: goto L_0x0114;
                case 40: goto L_0x0102;
                case 41: goto L_0x009c;
                case 42: goto L_0x00ea;
                case 43: goto L_0x00d2;
                case 44: goto L_0x00ba;
                default: goto L_0x0097;
            }
        L_0x0097:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x009c:
            X.MVS r6 = r2.A04()
            goto L_0x0433
        L_0x00a2:
            X.LpC r6 = r2.A02()
            goto L_0x0433
        L_0x00a8:
            X.LpX r6 = r2.A00()
            goto L_0x0433
        L_0x00ae:
            X.LpV r6 = r2.A03()
            goto L_0x0433
        L_0x00b4:
            X.Low r6 = r2.A01()
            goto L_0x0433
        L_0x00ba:
            r5 = r2
            boolean r1 = r2 instanceof X.C61826KNp
            if (r1 == 0) goto L_0x0436
            X.KNp r5 = (X.C61826KNp) r5
            X.4DH r4 = r5.A01
            com.instagram.common.session.UserSession r3 = r5.A06
            X.KNs r1 = r5.A0D
            X.KOn r2 = r1.A0i
            X.MXh r1 = r5.A08
            X.Loq r6 = new X.Loq
            r6.<init>(r4, r3, r1, r2)
            goto L_0x0433
        L_0x00d2:
            r5 = r2
            boolean r1 = r2 instanceof X.C61826KNp
            if (r1 != 0) goto L_0x0436
            X.KNq r5 = (X.C61827KNq) r5
            X.4DH r4 = r5.A00
            com.instagram.common.session.UserSession r3 = r5.A02
            X.LAg r2 = r5.A06
            X.KNr r1 = r5.A08
            X.KOC r1 = r1.A06
            X.Lot r6 = new X.Lot
            r6.<init>(r4, r3, r2, r1)
            goto L_0x0433
        L_0x00ea:
            r5 = r2
            boolean r1 = r2 instanceof X.C61826KNp
            if (r1 != 0) goto L_0x0436
            X.KNq r5 = (X.C61827KNq) r5
            X.4DH r4 = r5.A00
            com.instagram.common.session.UserSession r3 = r5.A02
            X.KNr r1 = r5.A08
            X.KON r2 = r1.A0N
            X.MXh r1 = r5.A09
            X.Loo r6 = new X.Loo
            r6.<init>(r4, r3, r1, r2)
            goto L_0x0433
        L_0x0102:
            r3 = r2
            boolean r1 = r2 instanceof X.C61826KNp
            if (r1 != 0) goto L_0x0436
            X.KNq r3 = (X.C61827KNq) r3
            X.4DH r2 = r3.A00
            X.MXh r1 = r3.A09
            X.Log r6 = new X.Log
            r6.<init>(r2, r1)
            goto L_0x0433
        L_0x0114:
            r5 = r2
            boolean r1 = r2 instanceof X.C61826KNp
            if (r1 != 0) goto L_0x0436
            X.KNq r5 = (X.C61827KNq) r5
            X.4DH r4 = r5.A00
            com.instagram.common.session.UserSession r3 = r5.A02
            X.KNr r1 = r5.A08
            X.KOe r2 = r1.A07
            X.MXh r1 = r5.A09
            X.LpO r6 = new X.LpO
            r6.<init>(r4, r3, r2, r1)
            goto L_0x0433
        L_0x012c:
            r5 = r2
            boolean r1 = r2 instanceof X.C61826KNp
            if (r1 != 0) goto L_0x0436
            X.KNq r5 = (X.C61827KNq) r5
            X.4DH r4 = r5.A00
            com.instagram.common.session.UserSession r3 = r5.A02
            X.Jj3 r2 = r5.A05
            X.KNr r1 = r5.A08
            X.KOO r1 = r1.A0C
            X.Los r6 = new X.Los
            r6.<init>(r4, r3, r2, r1)
            goto L_0x0433
        L_0x0144:
            r5 = r2
            boolean r1 = r2 instanceof X.C61826KNp
            if (r1 == 0) goto L_0x0436
            X.KNp r5 = (X.C61826KNp) r5
            X.4DH r4 = r5.A01
            com.instagram.common.session.UserSession r3 = r5.A06
            X.KNs r1 = r5.A0D
            com.instagram.creation.sharesheet.update.trial.TrialUseCase r2 = r1.A0f
            X.MXh r1 = r5.A08
            X.LpR r6 = new X.LpR
            r6.<init>(r4, r3, r1, r2)
            goto L_0x0433
        L_0x015c:
            boolean r1 = r2 instanceof X.C61826KNp
            if (r1 == 0) goto L_0x0436
            X.KNp r2 = (X.C61826KNp) r2
            X.4DH r7 = r2.A01
            com.instagram.common.session.UserSession r8 = r2.A06
            boolean r10 = X.LTP.A04(r8)
            X.KNs r1 = r2.A0D
            boolean r11 = r1.A0l
            X.KOH r9 = r1.A0K
            X.Lor r6 = new X.Lor
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x0433
        L_0x0177:
            boolean r1 = r2 instanceof X.C61826KNp
            if (r1 == 0) goto L_0x0436
            X.KNp r2 = (X.C61826KNp) r2
            X.4DH r7 = r2.A01
            com.instagram.common.session.UserSession r9 = r2.A06
            boolean r12 = X.LTP.A04(r9)
            X.0iw r8 = r2.A05
            X.KNs r1 = r2.A0D
            X.JwD r1 = r1.A01
            if (r1 == 0) goto L_0x019e
            boolean r13 = r1.A0f
        L_0x018f:
            X.MXh r10 = r2.A08
            r1 = 1
            X.MP9 r11 = new X.MP9
            r11.<init>(r2, r1)
            X.LpM r6 = new X.LpM
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0433
        L_0x019e:
            r13 = 1
            goto L_0x018f
        L_0x01a0:
            r5 = r2
            boolean r1 = r2 instanceof X.C61826KNp
            if (r1 == 0) goto L_0x0436
            X.KNp r5 = (X.C61826KNp) r5
            X.4DH r4 = r5.A01
            com.instagram.common.session.UserSession r3 = r5.A06
            boolean r2 = X.LTP.A04(r3)
            X.KNs r1 = r5.A0D
            X.KOB r1 = r1.A0d
            X.Lp5 r6 = new X.Lp5
            r6.<init>(r4, r3, r1, r2)
            goto L_0x0433
        L_0x01ba:
            r5 = r2
            boolean r1 = r2 instanceof X.C61826KNp
            if (r1 == 0) goto L_0x0436
            X.KNp r5 = (X.C61826KNp) r5
            X.4DH r4 = r5.A01
            com.instagram.common.session.UserSession r3 = r5.A06
            X.KNs r1 = r5.A0D
            X.KO9 r2 = r1.A0C
            X.LMT r1 = r5.A0B
            X.Loj r6 = new X.Loj
            r6.<init>(r4, r3, r1, r2)
            goto L_0x0433
        L_0x01d2:
            boolean r1 = r2 instanceof X.C61826KNp
            if (r1 == 0) goto L_0x0436
            X.KNp r2 = (X.C61826KNp) r2
            X.4DH r7 = r2.A01
            com.instagram.common.session.UserSession r9 = r2.A06
            boolean r11 = X.LTP.A04(r9)
            X.0iw r8 = r2.A05
            X.KNs r1 = r2.A0D
            X.KOH r10 = r1.A0K
            X.LpJ r6 = new X.LpJ
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x0433
        L_0x01ed:
            boolean r1 = r2 instanceof X.C61826KNp
            if (r1 == 0) goto L_0x0436
            X.KNp r2 = (X.C61826KNp) r2
            X.4DH r7 = r2.A01
            com.instagram.common.session.UserSession r9 = r2.A06
            boolean r11 = X.LTP.A04(r9)
            X.0iw r8 = r2.A05
            X.KNs r1 = r2.A0D
            X.KOV r10 = r1.A0e
            X.Lp6 r6 = new X.Lp6
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x0433
        L_0x0208:
            r4 = r2
            boolean r1 = r2 instanceof X.C61826KNp
            if (r1 == 0) goto L_0x0436
            X.KNp r4 = (X.C61826KNp) r4
            com.instagram.common.session.UserSession r8 = r4.A06
            X.0Tu r3 = X.0Tu.A05
            r1 = 36330887838778180(0x8112c000014344, double:3.03913798976182E-306)
            boolean r1 = X.182.A06(r3, r8, r1)
            if (r1 == 0) goto L_0x022f
            X.4DH r3 = r4.A01
            X.KNs r1 = r4.A0D
            X.KOn r2 = r1.A0i
            X.MXh r1 = r4.A08
            X.Lp3 r6 = new X.Lp3
            r6.<init>(r3, r8, r1, r2)
        L_0x022b:
            X.MVS r6 = (X.MVS) r6
            goto L_0x0433
        L_0x022f:
            X.4DH r7 = r4.A01
            X.KNs r1 = r4.A0D
            X.KOn r11 = r1.A0i
            X.MXh r10 = r4.A08
            X.L0v r9 = new X.L0v
            r9.<init>(r4)
            X.LpU r6 = new X.LpU
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x022b
        L_0x0242:
            r4 = r2
            boolean r1 = r2 instanceof X.C61826KNp
            if (r1 == 0) goto L_0x0436
            X.KNp r4 = (X.C61826KNp) r4
            X.4DH r3 = r4.A01
            X.MXh r2 = r4.A08
            X.KNs r1 = r4.A0D
            X.KOK r1 = r1.A0X
            X.Lop r6 = new X.Lop
            r6.<init>(r3, r2, r1)
            goto L_0x0433
        L_0x0258:
            r4 = r2
            boolean r1 = r2 instanceof X.C61826KNp
            if (r1 == 0) goto L_0x0436
            X.KNp r4 = (X.C61826KNp) r4
            com.instagram.common.session.UserSession r8 = r4.A06
            X.0Tu r3 = X.0Tu.A05
            r1 = 36330887838778180(0x8112c000014344, double:3.03913798976182E-306)
            boolean r1 = X.182.A06(r3, r8, r1)
            if (r1 == 0) goto L_0x0282
            X.4DH r3 = r4.A01
            X.KNs r1 = r4.A0D
            X.KOn r2 = r1.A0i
            X.L0t r1 = new X.L0t
            r1.<init>(r4)
            X.Lp2 r6 = new X.Lp2
            r6.<init>(r3, r8, r1, r2)
        L_0x027e:
            X.MVS r6 = (X.MVS) r6
            goto L_0x0433
        L_0x0282:
            X.4DH r7 = r4.A01
            X.KNs r1 = r4.A0D
            X.KOn r11 = r1.A0i
            X.MXh r10 = r4.A08
            X.L0u r9 = new X.L0u
            r9.<init>(r4)
            X.LpH r6 = new X.LpH
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x027e
        L_0x0295:
            r5 = r2
            boolean r1 = r2 instanceof X.C61826KNp
            if (r1 == 0) goto L_0x0436
            X.KNp r5 = (X.C61826KNp) r5
            X.4DH r4 = r5.A01
            com.instagram.common.session.UserSession r3 = r5.A06
            X.KNs r1 = r5.A0D
            X.KOR r2 = r1.A0W
            X.MXh r1 = r5.A08
            X.Lon r6 = new X.Lon
            r6.<init>(r4, r3, r1, r2)
            goto L_0x0433
        L_0x02ad:
            r4 = r2
            boolean r1 = r2 instanceof X.C61826KNp
            if (r1 == 0) goto L_0x0436
            X.KNp r4 = (X.C61826KNp) r4
            X.4DH r3 = r4.A01
            com.instagram.common.session.UserSession r2 = r4.A06
            X.KNs r1 = r4.A0D
            X.KOY r1 = r1.A0a
            X.LpG r6 = new X.LpG
            r6.<init>(r3, r2, r1)
            goto L_0x0433
        L_0x02c3:
            r5 = r2
            boolean r1 = r2 instanceof X.C61826KNp
            if (r1 == 0) goto L_0x0436
            X.KNp r5 = (X.C61826KNp) r5
            X.4DH r4 = r5.A01
            com.instagram.common.session.UserSession r3 = r5.A06
            boolean r2 = X.LTP.A04(r3)
            X.KNs r1 = r5.A0D
            X.KOm r1 = r1.A0Y
            X.Lp1 r6 = new X.Lp1
            r6.<init>(r4, r3, r1, r2)
            goto L_0x0433
        L_0x02dd:
            boolean r1 = r2 instanceof X.C61826KNp
            if (r1 == 0) goto L_0x0436
            X.KNp r2 = (X.C61826KNp) r2
            X.4DH r7 = r2.A01
            com.instagram.common.session.UserSession r10 = r2.A06
            X.KNs r1 = r2.A0D
            X.KOg r11 = r1.A0T
            X.Jg0 r8 = r2.A02
            X.0iw r9 = r2.A05
            r1 = 44
            X.MMm r12 = X.C66303MMm.A01(r2, r1)
            X.LpF r6 = new X.LpF
            r6.<init>(r7, r8, r9, r10, r11, r12)
            goto L_0x0433
        L_0x02fc:
            r5 = r2
            boolean r1 = r2 instanceof X.C61826KNp
            if (r1 == 0) goto L_0x0436
            X.KNp r5 = (X.C61826KNp) r5
            X.4DH r4 = r5.A01
            com.instagram.common.session.UserSession r3 = r5.A06
            boolean r2 = X.LTP.A04(r3)
            X.KNs r1 = r5.A0D
            boolean r1 = r1.A0l
            X.Lom r6 = new X.Lom
            r6.<init>(r4, r3, r2, r1)
            goto L_0x0433
        L_0x0316:
            boolean r1 = r2 instanceof X.C61826KNp
            if (r1 == 0) goto L_0x0436
            X.KNp r2 = (X.C61826KNp) r2
            X.4DH r8 = r2.A01
            com.instagram.common.session.UserSession r10 = r2.A06
            X.JgB r7 = r2.A00
            X.KNs r1 = r2.A0D
            X.KOE r12 = r1.A0R
            X.MXh r11 = r2.A08
            X.0iw r9 = r2.A05
            X.LpE r6 = new X.LpE
            r6.<init>(r7, r8, r9, r10, r11, r12)
            goto L_0x0433
        L_0x0331:
            r6 = r2
            boolean r1 = r2 instanceof X.C61826KNp
            if (r1 == 0) goto L_0x0436
            X.KNp r6 = (X.C61826KNp) r6
            X.4DH r5 = r6.A01
            X.MXh r4 = r6.A08
            X.KNs r1 = r6.A0D
            X.KOZ r3 = r1.A0O
            r2 = 49
            X.MP4 r1 = new X.MP4
            r1.<init>(r6, r2)
            X.Lol r6 = new X.Lol
            r6.<init>(r5, r4, r3, r1)
            goto L_0x0433
        L_0x034e:
            boolean r1 = r2 instanceof X.C61826KNp
            if (r1 == 0) goto L_0x0436
            X.KNp r2 = (X.C61826KNp) r2
            X.4DH r7 = r2.A01
            com.instagram.common.session.UserSession r9 = r2.A06
            X.KNs r1 = r2.A0D
            X.KOG r11 = r1.A0F
            X.JiA r8 = r2.A04
            X.MXh r10 = r2.A08
            X.LpA r6 = new X.LpA
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x0433
        L_0x0367:
            r6 = r2
            boolean r1 = r2 instanceof X.C61826KNp
            if (r1 == 0) goto L_0x03ab
            X.KNp r6 = (X.C61826KNp) r6
            X.L0s r9 = new X.L0s
            r9.<init>(r6)
            com.instagram.common.session.UserSession r8 = r6.A06
            r1 = 0
            X.0qQ.A0B(r8, r1)
            boolean r1 = X.LTP.A04(r8)
            if (r1 == 0) goto L_0x039d
            X.0Tu r3 = X.0Tu.A05
            r1 = 36325751058150595(0x810e14000534c3, double:3.0358894690087796E-306)
            boolean r1 = X.182.A06(r3, r8, r1)
            if (r1 == 0) goto L_0x039d
            X.4DH r7 = r6.A01
            X.KNs r1 = r6.A0D
            X.KOl r11 = r1.A0E
            X.MXh r10 = r6.A08
            X.Lp9 r6 = new X.Lp9
            r6.<init>(r7, r8, r9, r10, r11)
        L_0x0399:
            X.MVS r6 = (X.MVS) r6
            goto L_0x0433
        L_0x039d:
            X.4DH r7 = r6.A01
            X.KNs r1 = r6.A0D
            X.KOl r11 = r1.A0E
            X.MXh r10 = r6.A08
            X.Lp8 r6 = new X.Lp8
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x0399
        L_0x03ab:
            X.KNq r6 = (X.C61827KNq) r6
            com.instagram.common.session.UserSession r5 = r6.A02
            boolean r4 = X.LTP.A00(r5)
            X.4DH r3 = r6.A00
            X.KNr r1 = r6.A08
            X.KOX r2 = r1.A05
            X.MXh r1 = r6.A09
            if (r4 == 0) goto L_0x03c5
            X.Loy r6 = new X.Loy
            r6.<init>(r3, r5, r2, r1)
        L_0x03c2:
            X.MVS r6 = (X.MVS) r6
            goto L_0x0433
        L_0x03c5:
            X.Lox r6 = new X.Lox
            r6.<init>(r3, r5, r2, r1)
            goto L_0x03c2
        L_0x03cb:
            r5 = r2
            boolean r1 = r2 instanceof X.C61826KNp
            if (r1 == 0) goto L_0x0436
            X.KNp r5 = (X.C61826KNp) r5
            X.4DH r4 = r5.A01
            com.instagram.common.session.UserSession r3 = r5.A06
            X.KNs r1 = r5.A0D
            X.KOY r2 = r1.A0a
            X.MXh r1 = r5.A08
            X.Lou r6 = new X.Lou
            r6.<init>(r4, r3, r1, r2)
            goto L_0x0433
        L_0x03e2:
            r5 = r2
            boolean r1 = r2 instanceof X.C61826KNp
            if (r1 == 0) goto L_0x0436
            X.KNp r5 = (X.C61826KNp) r5
            X.4DH r4 = r5.A01
            com.instagram.common.session.UserSession r3 = r5.A06
            X.KNs r1 = r5.A0D
            X.KOh r2 = r1.A0b
            X.GhF r1 = r5.A03
            X.LpW r6 = new X.LpW
            r6.<init>(r4, r1, r3, r2)
            goto L_0x0433
        L_0x03f9:
            boolean r1 = r2 instanceof X.C61826KNp
            if (r1 == 0) goto L_0x0436
            X.KNp r2 = (X.C61826KNp) r2
            X.4DH r7 = r2.A01
            com.instagram.common.session.UserSession r8 = r2.A06
            boolean r10 = X.LTP.A04(r8)
            X.KNs r1 = r2.A0D
            X.JwD r1 = r1.A01
            if (r1 == 0) goto L_0x041c
            boolean r11 = r1.A0Z
        L_0x040f:
            r1 = 48
            X.MP4 r9 = new X.MP4
            r9.<init>(r2, r1)
            X.Lok r6 = new X.Lok
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x0433
        L_0x041c:
            r11 = 0
            goto L_0x040f
        L_0x041e:
            boolean r1 = r2 instanceof X.C61826KNp
            if (r1 != 0) goto L_0x0436
            X.KNq r2 = (X.C61827KNq) r2
            X.4DH r4 = r2.A00
            com.instagram.common.session.UserSession r3 = r2.A02
            boolean r2 = r2.A0I
            boolean r1 = X.LTP.A00(r3)
            X.LpY r6 = new X.LpY
            r6.<init>(r4, r3, r2, r1)
        L_0x0433:
            if (r6 == 0) goto L_0x0436
            return r6
        L_0x0436:
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()
            java.lang.String r1 = "RowItem not supported: "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r0, r1, r2)
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass7TE.A1B(r0)
            throw r0
        L_0x0445:
            r1 = r2
            boolean r0 = r2 instanceof X.C61826KNp
            if (r0 == 0) goto L_0x045e
            X.KNp r1 = (X.C61826KNp) r1
            X.4DH r7 = r1.A01
            com.instagram.common.session.UserSession r8 = r1.A06
            X.MXh r9 = r1.A08
            X.KNs r0 = r1.A0D
            X.KOd r11 = r0.A0g
            X.KgC r10 = X.C62462KgC.CLIPS
        L_0x0458:
            X.LpK r6 = new X.LpK
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
        L_0x045e:
            X.KNq r1 = (X.C61827KNq) r1
            X.4DH r7 = r1.A00
            com.instagram.common.session.UserSession r8 = r1.A02
            X.MXh r9 = r1.A09
            X.KNr r0 = r1.A08
            X.KOd r11 = r0.A0Q
            X.KgC r10 = X.C62462KgC.FEED
            goto L_0x0458
        L_0x046d:
            r1 = r2
            boolean r0 = r2 instanceof X.C61826KNp
            if (r0 == 0) goto L_0x0486
            X.KNp r1 = (X.C61826KNp) r1
            X.4DH r7 = r1.A01
            com.instagram.common.session.UserSession r8 = r1.A06
            X.KNs r0 = r1.A0D
            X.KOM r11 = r0.A0Q
            X.LMT r10 = r1.A0B
            X.MXh r9 = r1.A08
        L_0x0480:
            X.Lp0 r6 = new X.Lp0
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
        L_0x0486:
            X.KNq r1 = (X.C61827KNq) r1
            X.4DH r7 = r1.A00
            com.instagram.common.session.UserSession r8 = r1.A02
            X.KNr r0 = r1.A08
            X.KOM r11 = r0.A0L
            X.LMT r10 = r1.A0B
            X.MXh r9 = r1.A09
            goto L_0x0480
        L_0x0495:
            r1 = r2
            boolean r0 = r2 instanceof X.C61826KNp
            if (r0 == 0) goto L_0x04ac
            X.KNp r1 = (X.C61826KNp) r1
            X.4DH r3 = r1.A01
            com.instagram.common.session.UserSession r2 = r1.A06
            X.KNs r0 = r1.A0D
            X.KOc r1 = r0.A0G
            X.KkS r0 = X.C62666KkS.BIO_IG_REELS
        L_0x04a6:
            X.LpB r6 = new X.LpB
            r6.<init>(r0, r3, r2, r1)
            return r6
        L_0x04ac:
            X.KNq r1 = (X.C61827KNq) r1
            X.4DH r3 = r1.A00
            com.instagram.common.session.UserSession r2 = r1.A02
            X.KNr r0 = r1.A08
            X.KOc r1 = r0.A0H
            X.KkS r0 = X.C62666KkS.BIO_IG_POST
            goto L_0x04a6
        L_0x04b9:
            r4 = r2
            boolean r0 = r2 instanceof X.C61826KNp
            if (r0 == 0) goto L_0x04d8
            X.KNp r4 = (X.C61826KNp) r4
            X.4DH r7 = r4.A01
            com.instagram.common.session.UserSession r8 = r4.A06
            X.KNs r0 = r4.A0D
            X.KOS r10 = r0.A0U
            X.JiL r0 = r4.A0C
            java.util.List r0 = r0.A05
            boolean r11 = r0.isEmpty()
            X.MXh r9 = r4.A08
            X.LpI r6 = new X.LpI
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
        L_0x04d8:
            X.KNq r4 = (X.C61827KNq) r4
            X.4DH r3 = r4.A00
            com.instagram.common.session.UserSession r2 = r4.A02
            X.KNr r0 = r4.A08
            X.KOb r1 = r0.A08
            X.MXh r0 = r4.A09
            X.IQZ r6 = new X.IQZ
            r6.<init>(r3, r2, r1, r0)
            return r6
        L_0x04ea:
            r1 = r2
            boolean r0 = r2 instanceof X.C61826KNp
            if (r0 == 0) goto L_0x0503
            X.KNp r1 = (X.C61826KNp) r1
            X.4DH r7 = r1.A01
            com.instagram.common.session.UserSession r8 = r1.A06
            X.KNs r0 = r1.A0D
            X.KOT r10 = r0.A0c
            X.Jik r11 = r1.A0E
            X.MXh r9 = r1.A08
            X.Lp4 r6 = new X.Lp4
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
        L_0x0503:
            X.KNq r1 = (X.C61827KNq) r1
            X.4DH r7 = r1.A00
            com.instagram.common.session.UserSession r8 = r1.A02
            X.82q r9 = r1.A04
            X.KNr r0 = r1.A08
            X.KOF r11 = r0.A0P
            X.MXh r10 = r1.A09
            X.Loz r6 = new X.Loz
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
        L_0x0517:
            r3 = r2
            boolean r0 = r2 instanceof X.C61826KNp
            if (r0 == 0) goto L_0x0532
            X.KNp r3 = (X.C61826KNp) r3
            X.4DH r7 = r3.A01
            com.instagram.common.session.UserSession r8 = r3.A06
            X.LMT r10 = r3.A0B
            X.MXh r9 = r3.A08
            X.KNs r0 = r3.A0D
            X.KOi r12 = r0.A0V
            X.KOU r11 = r0.A0H
            X.LpL r6 = new X.LpL
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return r6
        L_0x0532:
            X.KNq r3 = (X.C61827KNq) r3
            com.instagram.common.session.UserSession r8 = r3.A02
            X.4DH r7 = r3.A00
            X.LP7 r5 = r3.A0F
            X.KB3 r4 = r3.A0G
            X.LeQ r12 = r3.A07
            X.KNr r2 = r3.A08
            X.KOb r13 = r2.A08
            X.KOj r14 = r2.A0A
            X.L9K r1 = r3.A0E
            java.lang.String r0 = r3.A0H
            X.82q r10 = r3.A04
            X.82p r9 = r3.A03
            X.KO3 r11 = r2.A03
            X.MXh r15 = r3.A09
            X.LpP r6 = new X.LpP
            r17 = r5
            r18 = r4
            r19 = r0
            r16 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r6
        L_0x055e:
            r1 = r2
            boolean r0 = r2 instanceof X.C61826KNp
            if (r0 == 0) goto L_0x0578
            X.KNp r1 = (X.C61826KNp) r1
            X.4DH r7 = r1.A01
            com.instagram.common.session.UserSession r9 = r1.A06
            X.MXh r10 = r1.A08
            X.KNs r0 = r1.A0D
            X.KOp r11 = r0.A0S
            X.0iw r8 = r1.A05
            r12 = 1
        L_0x0572:
            X.LpN r6 = new X.LpN
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return r6
        L_0x0578:
            X.KNq r1 = (X.C61827KNq) r1
            X.4DH r7 = r1.A00
            com.instagram.common.session.UserSession r9 = r1.A02
            X.MXh r10 = r1.A09
            X.KNr r0 = r1.A08
            X.KOp r11 = r0.A0M
            X.0iw r8 = r1.A01
            r12 = 0
            goto L_0x0572
        L_0x0588:
            r1 = r2
            boolean r0 = r2 instanceof X.C61826KNp
            if (r0 == 0) goto L_0x05a1
            X.KNp r1 = (X.C61826KNp) r1
            X.4DH r7 = r1.A01
            com.instagram.common.session.UserSession r9 = r1.A06
            X.MXh r10 = r1.A08
            X.KNs r0 = r1.A0D
            X.KOJ r11 = r0.A0P
            X.0iw r8 = r1.A05
            X.LpT r6 = new X.LpT
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
        L_0x05a1:
            X.KNq r1 = (X.C61827KNq) r1
            com.instagram.common.session.UserSession r8 = r1.A02
            X.4DH r7 = r1.A00
            X.KNr r0 = r1.A08
            X.KOf r11 = r0.A0K
            X.KOX r9 = r0.A05
            X.KOb r10 = r0.A08
            X.LpD r6 = new X.LpD
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
        L_0x05b5:
            r4 = r2
            boolean r0 = r2 instanceof X.C61826KNp
            if (r0 == 0) goto L_0x05ca
            X.KNp r4 = (X.C61826KNp) r4
            X.4DH r3 = r4.A01
            com.instagram.common.session.UserSession r2 = r4.A06
            X.MXh r1 = r4.A08
            X.MVp r0 = r4.A09
        L_0x05c4:
            X.Lov r6 = new X.Lov
            r6.<init>(r3, r2, r1, r0)
            return r6
        L_0x05ca:
            X.KNq r4 = (X.C61827KNq) r4
            X.4DH r3 = r4.A00
            com.instagram.common.session.UserSession r2 = r4.A02
            X.MXh r1 = r4.A09
            X.MVp r0 = r4.A0A
            goto L_0x05c4
        L_0x05d5:
            r1 = r2
            boolean r0 = r2 instanceof X.C61826KNp
            if (r0 == 0) goto L_0x05e7
            X.KNp r1 = (X.C61826KNp) r1
            X.4DH r2 = r1.A01
            com.instagram.common.session.UserSession r1 = r1.A06
            r0 = 0
        L_0x05e1:
            X.Loh r6 = new X.Loh
            r6.<init>(r2, r1, r0)
            return r6
        L_0x05e7:
            X.KNq r1 = (X.C61827KNq) r1
            X.4DH r2 = r1.A00
            com.instagram.common.session.UserSession r1 = r1.A02
            boolean r0 = X.LTP.A00(r1)
            goto L_0x05e1
        L_0x05f2:
            r1 = r2
            boolean r0 = r2 instanceof X.C61826KNp
            if (r0 == 0) goto L_0x060a
            X.KNp r1 = (X.C61826KNp) r1
            X.4DH r7 = r1.A01
            com.instagram.common.session.UserSession r8 = r1.A06
            X.MXh r9 = r1.A08
            X.KNs r0 = r1.A0D
            X.KOQ r10 = r0.A0D
            r11 = 0
        L_0x0604:
            X.Lp7 r6 = new X.Lp7
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
        L_0x060a:
            X.KNq r1 = (X.C61827KNq) r1
            X.4DH r7 = r1.A00
            com.instagram.common.session.UserSession r8 = r1.A02
            X.MXh r9 = r1.A09
            X.KNr r0 = r1.A08
            X.KOQ r10 = r0.A0G
            X.LO1 r11 = r1.A0C
            goto L_0x0604
        L_0x0619:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62950Kp2.A05(X.KmH):X.MVS");
    }
}
