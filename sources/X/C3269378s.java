package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.78s  reason: invalid class name and case insensitive filesystem */
public final class C3269378s {
    public static final C3269378s A00 = new Object();

    public static final boolean A04(UserSession userSession, 2Er r6) {
        0qQ.A0B(userSession, 0);
        if (r6 == null || !0qQ.A0K(r6.Amk(), false)) {
            return false;
        }
        1Av A002 = 1Au.A00(userSession);
        String C6C = r6.C6C();
        if (C6C == null) {
            C6C = "";
        }
        if (!A002.A01.getBoolean(002.A0R("broadcast_chat_creator_education_nux/", C6C), false)) {
            return true;
        }
        return false;
    }

    public static final boolean A05(UserSession userSession, 2Er r6) {
        boolean z = false;
        if (r6.C6a() == 29) {
            z = true;
        }
        boolean A0j = 00p.A0j(r6.AsX(), userSession.A06, false);
        boolean A002 = C3269478t.A00(userSession, r6);
        if (!z || !A0j || A002) {
            return false;
        }
        return A07(userSession, r6) || A06(userSession, r6);
    }

    /* JADX WARNING: type inference failed for: r10v4, types: [java.util.List] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(android.content.Context r21, android.view.View r22, com.instagram.common.session.UserSession r23, X.AnonymousClass7L0 r24, X.2Er r25) {
        /*
            r20 = this;
            r3 = 0
            r9 = 4
            r5 = r22
            X.0qQ.A0B(r5, r9)
            r17 = r24
            if (r24 == 0) goto L_0x002b
            r6 = r25
            if (r25 == 0) goto L_0x002b
            java.lang.String r0 = r6.C6C()
            if (r0 == 0) goto L_0x002b
            r7 = 2131437189(0x7f0b2685, float:1.849627E38)
            android.view.View r1 = r5.findViewById(r7)
            r2 = 8
            if (r1 == 0) goto L_0x002b
            r4 = r23
            boolean r0 = A05(r4, r6)
            if (r0 != 0) goto L_0x002c
            r1.setVisibility(r2)
        L_0x002b:
            return
        L_0x002c:
            r1.setVisibility(r3)
            android.view.View r0 = r5.findViewById(r7)
            if (r0 == 0) goto L_0x0038
            r0.setVisibility(r3)
        L_0x0038:
            r0 = 2131437680(0x7f0b2870, float:1.8497265E38)
            android.view.View r8 = r5.findViewById(r0)
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            r8.removeAllViewsInLayout()
            java.lang.String r1 = r6.C6C()
            if (r1 == 0) goto L_0x0167
            boolean r0 = A04(r4, r6)
            r16 = 1
            r15 = 5
            r10 = 3
            r7 = 2
            r14 = 6
            if (r0 == 0) goto L_0x00db
            X.NiD r9 = X.C69251NiD.A0B
            X.NiD r10 = X.C69251NiD.A07
            X.NiD r11 = X.C69251NiD.A0C
            X.NiD r12 = X.C69251NiD.A05
            X.NiD r13 = X.C69251NiD.A0I
            X.NiD r14 = X.C69251NiD.A0H
            X.NiD[] r0 = new X.C69251NiD[]{r9, r10, r11, r12, r13, r14}
            java.util.List r10 = X.0sr.A1P(r0)
        L_0x006a:
            r14 = r21
            r18 = r6
            r19 = r10
            r16 = r4
            r15 = r8
            X.C69872Nta.A00(r14, r15, r16, r17, r18, r19)
            r0 = 2131442865(0x7f0b3cb1, float:1.8507782E38)
            android.view.View r8 = r5.findViewById(r0)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0 = 2131431953(0x7f0b1211, float:1.848565E38)
            android.view.View r5 = r5.findViewById(r0)
            X.0Tu r9 = X.0Tu.A05
            r0 = 36322727400909173(0x810b5400012975, double:3.033977295994014E-306)
            boolean r0 = X.182.A06(r9, r4, r0)
            if (r0 != 0) goto L_0x0160
            boolean r0 = A07(r4, r6)
            if (r0 == 0) goto L_0x00b7
            int r1 = r6.AdN()
            r0 = 2131954225(0x7f130a31, float:1.9544943E38)
            if (r1 != r7) goto L_0x00a5
            r0 = 2131974605(0x7f1359cd, float:1.9586279E38)
        L_0x00a5:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x0160
            int r0 = r0.intValue()
            java.lang.CharSequence r0 = r14.getText(r0)
            r8.setText(r0)
            return
        L_0x00b7:
            boolean r0 = A06(r4, r6)
            if (r0 == 0) goto L_0x0160
            X.1Av r0 = X.1Au.A00(r4)
            java.lang.String r4 = r6.C6C()
            if (r4 != 0) goto L_0x00c9
            java.lang.String r4 = ""
        L_0x00c9:
            X.0xa r1 = r0.A01
            java.lang.String r0 = "broadcast_channel_engagement_conversation_starters_nux/"
            java.lang.String r0 = X.002.A0R(r0, r4)
            boolean r0 = r1.getBoolean(r0, r3)
            if (r0 != 0) goto L_0x0160
            r0 = 2131954203(0x7f130a1b, float:1.9544899E38)
            goto L_0x00a5
        L_0x00db:
            X.1Av r0 = X.1Au.A00(r4)
            X.0xa r11 = r0.A01
            java.lang.String r0 = "broadcast_channel_upranked_replies_pill_impression_count/"
            java.lang.String r0 = X.002.A0R(r0, r1)
            r1 = 0
            int r0 = r11.getInt(r0, r3)
            if (r0 >= r10) goto L_0x00ef
            r1 = 1
        L_0x00ef:
            r13 = 7
            r12 = 9
            if (r1 == 0) goto L_0x013f
            X.0Tu r11 = X.0Tu.A05
            r0 = 36319407399312774(0x81084f007d1d86, double:3.031877713615878E-306)
            boolean r0 = X.182.A06(r11, r4, r0)
            if (r0 == 0) goto L_0x013f
            X.NiD[] r1 = new X.C69251NiD[r12]
            X.NiD r0 = X.C69251NiD.A0D
            r1[r3] = r0
            X.NiD r0 = X.C69251NiD.A0B
            r1[r16] = r0
            X.NiD r0 = X.C69251NiD.A07
            r1[r7] = r0
            X.NiD r0 = X.C69251NiD.A0C
            r1[r10] = r0
            X.NiD r0 = X.C69251NiD.A05
            r1[r9] = r0
            X.NiD r0 = X.C69251NiD.A0A
            r1[r15] = r0
            X.NiD r0 = X.C69251NiD.A0G
            r1[r14] = r0
            X.NiD r0 = X.C69251NiD.A06
        L_0x0121:
            r1[r13] = r0
            X.NiD r0 = X.C69251NiD.A09
            r1[r2] = r0
            java.util.ArrayList r10 = X.0sr.A1M(r1)
            X.0Tu r9 = X.0Tu.A05
            r0 = 36319407399509385(0x81084f00801d89, double:3.0318777137402154E-306)
            boolean r0 = X.182.A06(r9, r4, r0)
            if (r0 != 0) goto L_0x006a
            X.NiD r0 = X.C69251NiD.A08
            r10.add(r0)
            goto L_0x006a
        L_0x013f:
            X.NiD[] r1 = new X.C69251NiD[r12]
            X.NiD r0 = X.C69251NiD.A0B
            r1[r3] = r0
            X.NiD r0 = X.C69251NiD.A07
            r1[r16] = r0
            X.NiD r0 = X.C69251NiD.A0C
            r1[r7] = r0
            X.NiD r0 = X.C69251NiD.A05
            r1[r10] = r0
            X.NiD r0 = X.C69251NiD.A0A
            r1[r9] = r0
            X.NiD r0 = X.C69251NiD.A0G
            r1[r15] = r0
            X.NiD r0 = X.C69251NiD.A06
            r1[r14] = r0
            X.NiD r0 = X.C69251NiD.A0D
            goto L_0x0121
        L_0x0160:
            r8.setVisibility(r2)
            r5.setVisibility(r2)
            return
        L_0x0167:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3269378s.A08(android.content.Context, android.view.View, com.instagram.common.session.UserSession, X.7L0, X.2Er):void");
    }

    public final void A09(View view, UserSession userSession, C314466iJ r11, AnonymousClass7L0 r12, 2Er r13) {
        0Tu r2 = 0Tu.A05;
        UserSession userSession2 = userSession;
        View view2 = view;
        2Er r7 = r13;
        if (182.A06(r2, userSession, 36319407398329723L)) {
            boolean A06 = 182.A06(r2, userSession, 36319407398788480L);
            if (A07(userSession, r13)) {
                A01(userSession, r13);
                A02(userSession, r13);
            } else if (A06) {
                return;
            }
            Context context = view.getContext();
            0qQ.A07(context);
            A08(context, view2, userSession2, r12, r7);
            return;
        }
        A00(view, userSession, r11, r13);
    }

    public static final void A00(View view, UserSession userSession, C314466iJ r5, 2Er r6) {
        View findViewById = view.findViewById(R.id.nux_banner);
        if (findViewById != null && findViewById.getVisibility() == 0) {
            findViewById.setVisibility(8);
            r5.DUr();
            C3269378s r1 = A00;
            if (A07(userSession, r6)) {
                r1.A01(userSession, r6);
            } else if (A06(userSession, r6)) {
                String C6C = r6.C6C();
                if (C6C == null) {
                    C6C = "";
                }
                0xY AR4 = 1Au.A00(userSession).A01.AR4();
                AR4.E5c(002.A0R("broadcast_channel_conversation_starters_last_dismissed/", C6C), System.currentTimeMillis());
                AR4.apply();
                A03(userSession, r6, true);
            }
        }
    }

    private final void A01(UserSession userSession, 2Er r6) {
        1Av A002 = 1Au.A00(userSession);
        String C6C = r6.C6C();
        if (C6C == null) {
            C6C = "";
        }
        0xY AR4 = A002.A01.AR4();
        AR4.E5T(002.A0R("broadcast_chat_creator_education_nux/", C6C), true);
        AR4.apply();
        A03(userSession, r6, false);
    }

    public static final void A02(UserSession userSession, 2Er r8) {
        Long l;
        String str;
        C313756gx A002 = C313746gw.A00(userSession);
        int AdN = r8.AdN();
        String C6C = r8.C6C();
        String C6k = r8.C6k();
        boolean z = !A04(userSession, r8);
        1Ln A0E = 1Ln.A0E(A002.A03);
        if (A0E.A00.isSampled()) {
            A0E.A0h(Long.valueOf(A002.A02));
            A0E.A0l("first_message_banner_rendered");
            A0E.A0k("view");
            A0E.A0p("first_message_banner");
            A0E.A0q("thread_view");
            A0E.A0o(C313746gw.A01(Integer.valueOf(AdN)));
            A0E.A0s(C6C);
            if (C6k != null) {
                l = 00y.A0n(10, C6k);
            } else {
                l = null;
            }
            A0E.A0i(l);
            if (z) {
                str = "True";
            } else {
                str = "False";
            }
            A0E.A0w(0se.A0M(new 0eP("has_sent_first_message", str)));
            A0E.Cgf();
        }
    }

    public static final void A03(UserSession userSession, 2Er r6, boolean z) {
        Long l;
        String str;
        C313756gx A002 = C313746gw.A00(userSession);
        int AdN = r6.AdN();
        String C6C = r6.C6C();
        String C6k = r6.C6k();
        1Ln A0E = 1Ln.A0E(A002.A03);
        if (A0E.A00.isSampled()) {
            A0E.A0h(Long.valueOf(A002.A02));
            A0E.A0l("first_message_banner_dismissed");
            A0E.A0k("view");
            A0E.A0p("first_message_banner");
            A0E.A0q("thread_view");
            A0E.A0o(C313746gw.A01(Integer.valueOf(AdN)));
            A0E.A0s(C6C);
            if (C6k != null) {
                l = 00y.A0n(10, C6k);
            } else {
                l = null;
            }
            A0E.A0i(l);
            if (z) {
                str = "True";
            } else {
                str = "False";
            }
            A0E.A0w(0se.A0M(new 0eP("has_sent_first_message", str)));
            A0E.Cgf();
        }
    }

    public static final boolean A06(UserSession userSession, 2Er r10) {
        String C6C = r10.C6C();
        if (C6C == null) {
            C6C = "";
        }
        1Av A002 = 1Au.A00(userSession);
        0Tu r6 = 0Tu.A05;
        boolean z = false;
        if (System.currentTimeMillis() - A002.A01.getLong(002.A0R("broadcast_channel_conversation_starters_last_dismissed/", C6C), 0) >= 182.A01(r6, userSession, 36600882375102505L) * 1000) {
            z = true;
        }
        if (A04(userSession, r10) || !182.A06(r6, userSession, 36319407398329723L) || !z) {
            return false;
        }
        return true;
    }

    public static final boolean A07(UserSession userSession, 2Er r7) {
        if (!A04(userSession, r7)) {
            return false;
        }
        0Tu r4 = 0Tu.A05;
        if (182.A06(r4, userSession, 36322727400909173L)) {
            1Av A002 = 1Au.A00(userSession);
            String C6C = r7.C6C();
            if (C6C == null) {
                C6C = "";
            }
            if (!A002.A01.getBoolean(002.A0R("has_creator_activation_animation_been_seen", C6C), false) || !182.A06(r4, userSession, 36322727400974710L)) {
                return false;
            }
        }
        return true;
    }
}
