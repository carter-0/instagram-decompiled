package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.61J  reason: invalid class name */
public final class AnonymousClass61J {
    public final UserSession A00;
    public final AnonymousClass61N A01;
    public final 1aU A02;

    public AnonymousClass61J(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        AnonymousClass1aS r1 = 1aD.A00(userSession, AnonymousClass61K.SECURE_USER_CONSENT_CONTROLS).A02;
        0qQ.A07(r1);
        this.A02 = r1.A0L(AnonymousClass61L.A00);
        this.A01 = (AnonymousClass61N) userSession.A01(AnonymousClass61N.class, AnonymousClass61M.A00);
    }

    public final 1aU A02(String str) {
        UserSession userSession = this.A00;
        String str2 = str;
        if (!AnonymousClass61H.A00(userSession)) {
            return this.A02.A0M(new AnonymousClass61O(new C73932PmC(this, str)));
        }
        C70745OJr A002 = C70112NxS.A00(userSession);
        String str3 = (String) this.A01.A01.get(2);
        if (str3 == null) {
            str3 = "";
        }
        PCZ pcz = new PCZ(this, A002);
        C71619Onz A012 = AnonymousClass6EU.A05.A00(A002.A00).A01();
        if (A012 != null) {
            return new C70984OUy(A012).A01(str).A0U(new C73389Pbm(A012, pcz, A002, str3, str2));
        }
        return 1aU.A09(false);
    }

    public final 1aU A00() {
        return this.A02.A0M(new AnonymousClass61O(new C377089Km(this, 37)));
    }

    public final 1aU A01(int i, int i2, boolean z) {
        UserSession userSession = this.A00;
        C70745OJr A002 = C70112NxS.A00(userSession);
        int i3 = i;
        int i4 = i2;
        boolean z2 = z;
        if (!AnonymousClass61H.A00(userSession)) {
            return this.A02.A0M(new AnonymousClass61O(new C73945PmP(this, i, i2, z)));
        }
        boolean A012 = this.A01.A01(i);
        PCY pcy = new PCY(this, A002);
        C71619Onz A013 = AnonymousClass6EU.A05.A00(A002.A00).A01();
        if (A013 != null) {
            return C70984OUy.A00(new C70984OUy(A013)).A0M(new C72012Oum(new C73937PmH(i, i2, z))).A0U(new C73409Pc6(A013, pcy, A002, i3, i4, A012, z2));
        }
        return 1aU.A09(false);
    }

    public final void A03(C3023862z r14) {
        boolean A0K;
        boolean z;
        int i;
        boolean equals;
        int i2;
        int count = r14.mResultSet.getCount() - 1;
        if (count < 0) {
            AnonymousClass61N r1 = this.A01;
            r1.A00(108, true);
            r1.A00(110, true);
            r1.A00(109, true);
            return;
        }
        int i3 = 0;
        while (true) {
            int integer = r14.mResultSet.getInteger(i3, 0);
            if (integer != 1) {
                if (integer == 2) {
                    Boolean nullableBoolean = r14.mResultSet.getNullableBoolean(i3, 3);
                    i = 108;
                    if (nullableBoolean != null) {
                        equals = nullableBoolean.equals(r14.mResultSet.getNullableBoolean(i3, 5));
                        i2 = 111;
                    }
                    this.A01.A00(i, true);
                } else if (integer == 3) {
                    Boolean nullableBoolean2 = r14.mResultSet.getNullableBoolean(i3, 3);
                    i = 109;
                    if (nullableBoolean2 != null) {
                        equals = nullableBoolean2.equals(r14.mResultSet.getNullableBoolean(i3, 5));
                        i2 = 112;
                    }
                    this.A01.A00(i, true);
                } else if (integer == 4) {
                    String string = r14.mResultSet.getString(i3, 6);
                    i = 110;
                    if (string != null) {
                        String string2 = r14.mResultSet.getString(i3, 8);
                        if (string2 != null) {
                            UserSession userSession = this.A00;
                            1Av A002 = 1Au.A00(userSession);
                            0s0 r12 = A002.A5q;
                            AnonymousClass0YZ[] r122 = 1Av.A8a;
                            if (!string2.contentEquals((String) r12.CDM(A002, r122[437]))) {
                                1Au.A00(userSession).A1U(false);
                            }
                            r12.Epx(A002, string2, r122[437]);
                            this.A01.A01.put(114, string2);
                        }
                        equals = string.equals(string2);
                        i2 = 113;
                    }
                    this.A01.A00(i, true);
                }
                AnonymousClass61N r0 = this.A01;
                if (!equals) {
                    r0.A00(i2, true);
                } else {
                    r0.A00(i2, false);
                }
                r0.A00(i, false);
            } else {
                Boolean nullableBoolean3 = r14.mResultSet.getNullableBoolean(i3, 3);
                UserSession userSession2 = this.A00;
                if (182.A06(0Tu.A05, userSession2, 36327537764219383L)) {
                    if (0qQ.A0K(nullableBoolean3, true) && !0qQ.A0K(this.A01.A00.get(1), true)) {
                        if (1Au.A00(userSession2).A01.getLong("odnc_last_opt_in_timestamp_ms", 0) == 0) {
                            1Av A003 = 1Au.A00(userSession2);
                            long currentTimeMillis = System.currentTimeMillis();
                            0xY AR4 = A003.A01.AR4();
                            AR4.E5c("odnc_last_opt_in_timestamp_ms", currentTimeMillis);
                            AR4.apply();
                        }
                        C262224Cq r02 = LNv.A02;
                        String string3 = 1Au.A00(userSession2).A01.getString("odnc_model_downloaded_path", (String) null);
                        0Tu r8 = 0Tu.A06;
                        if ((182.A06(r8, userSession2, 36325897086842200L) || 182.A06(r8, userSession2, 36325897086776663L)) && (string3 == null || string3.length() == 0)) {
                            new LNv(userSession2).A00("igd_nudity_detection_model_loading_on_init");
                        }
                    } else if (0qQ.A0K(nullableBoolean3, false)) {
                        0xY AR42 = 1Au.A00(userSession2).A01.AR4();
                        AR42.E5c("odnc_last_opt_in_timestamp_ms", 0);
                        AR42.apply();
                    }
                }
                Boolean nullableBoolean4 = r14.mResultSet.getNullableBoolean(i3, 3);
                Boolean nullableBoolean5 = r14.mResultSet.getNullableBoolean(i3, 5);
                AnonymousClass61N r13 = this.A01;
                if (nullableBoolean4 != null) {
                    A0K = !nullableBoolean4.equals(nullableBoolean5);
                } else {
                    A0K = 0qQ.A0K(nullableBoolean5, true);
                }
                r13.A00(115, A0K);
                if (0qQ.A0K(nullableBoolean4, nullableBoolean5)) {
                    1Au.A00(userSession2).A1X(false);
                }
            }
            if (r14.mResultSet.getInteger(i3, 2) == 1) {
                AnonymousClass61N r7 = this.A01;
                int integer2 = r14.mResultSet.getInteger(i3, 0);
                Boolean nullableBoolean6 = r14.mResultSet.getNullableBoolean(i3, 3);
                if (nullableBoolean6 != null) {
                    z = nullableBoolean6.booleanValue();
                } else {
                    z = false;
                }
                r7.A00(integer2, z);
            } else if (r14.mResultSet.getInteger(i3, 2) == 2) {
                AnonymousClass61N r72 = this.A01;
                int integer3 = r14.mResultSet.getInteger(i3, 0);
                String string4 = r14.mResultSet.getString(i3, 6);
                if (string4 == null) {
                    string4 = "";
                }
                r72.A01.put(Integer.valueOf(integer3), string4);
            }
            if (i3 != count) {
                i3++;
            } else {
                return;
            }
        }
    }
}
