package X;

import androidx.fragment.app.FragmentActivity;

public abstract class FBt {
    public static final void A01(FragmentActivity fragmentActivity, C307786Rm r11, C307896Rx r12, C276544tV r13) {
        AnonymousClass7TF.A1C(fragmentActivity, 0, r13);
        C358248ab A0Y = DbS.A0Y(fragmentActivity);
        String A0E = r13.A0E();
        if (!(A0E == null || A0E.length() == 0)) {
            A0Y.A05 = A0E;
        }
        String A0K = r13.A0K(35);
        if (!(A0K == null || A0K.length() == 0)) {
            A0Y.A0q(A0K);
        }
        C276544tV A07 = r13.A07(36);
        C307786Rm r5 = r11;
        C307896Rx r6 = r12;
        if (A07 != null) {
            C277014uI A0A = A07.A0A(35);
            String A0K2 = A07.A0K(36);
            if (!(A0K2 == null || A0A == null)) {
                A0Y.A0c(new C50024FJj(r5, r6, A07, A0A, 0), A0K2);
            }
        }
        C276544tV A072 = r13.A07(38);
        if (A072 != null) {
            C277014uI A0A2 = A072.A0A(35);
            String A0K3 = A072.A0K(36);
            if (!(A0K3 == null || A0A2 == null)) {
                A0Y.A0b(new C50024FJj(r5, r6, A072, A0A2, 1), A0K3);
            }
        }
        DbT.A1V(A0Y);
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [X.FpL, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0102, code lost:
        if (r1.A07 == null) goto L_0x00b6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C307896Rx r12, X.C276544tV r13, X.C276544tV r14, java.util.Map r15) {
        /*
            r7 = 0
            X.AnonymousClass7TG.A1O(r13, r15)
            X.6Rm r1 = X.C308206Td.A09(r12)
            X.4tV r0 = X.C46611Dhr.A02(r13)
            r2 = 0
            X.Dhv r6 = X.C46616Dhw.A00(r2, r1, r12, r0)
            X.2nI r5 = X.C308206Td.A06(r12)
            int r1 = r13.A04
            r0 = 13647(0x354f, float:1.9124E-41)
            if (r1 != r0) goto L_0x013b
            r0 = 49
            boolean r11 = r13.A0R(r0, r7)
        L_0x0021:
            r1 = 13883(0x363b, float:1.9454E-41)
            java.util.List r0 = X.C46611Dhr.A09(r13)
            X.4tV r1 = X.C46611Dhr.A03(r0, r1)
            r10 = 0
            if (r1 == 0) goto L_0x0137
            r2 = 43
            r0 = 1
            boolean r0 = r1.A0R(r2, r0)
            r11 = r0 ^ 1
            r0 = 41
            boolean r8 = r1.A0R(r0, r7)
            r0 = 42
            boolean r4 = r1.A0R(r0, r7)
            r0 = 46
            X.4uI r1 = r1.A0A(r0)
            r2 = 0
            if (r1 == 0) goto L_0x005f
            X.6Tm r0 = X.AnonymousClass6Tm.A01
            java.lang.Object r0 = X.C299275ur.A00(r12, r0, r1)
            if (r0 != 0) goto L_0x010c
            r0 = 467(0x1d3, float:6.54E-43)
            java.lang.String r1 = X.C273654mx.A00(r0)
            java.lang.String r0 = "Evaluating BKBloksDataContribScreenScreenIgConstants.ANALYTICS_EXTRAS returned null. A map was expected"
            X.1Kn.A02(r1, r0)
        L_0x005f:
            java.lang.String r9 = X.C46611Dhr.A07(r13)
            r1 = 15855(0x3def, float:2.2218E-41)
            java.util.List r0 = X.C46611Dhr.A09(r13)
            X.4tV r0 = X.C46611Dhr.A03(r0, r1)
            boolean r3 = X.AnonymousClass7TF.A1V(r0)
            X.0lg r0 = X.C308206Td.A0B(r12)
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = X.DbS.A0N(r0)
            if (r6 == 0) goto L_0x007e
            r1.A07(r6)
        L_0x007e:
            r0 = r11 ^ 1
            r1.A0l = r0
            r1.A0g = r8
            r1.A0h = r4
            boolean r0 = r5.A00
            r1.A0c = r0
            X.FpL r0 = new X.FpL
            r0.<init>()
            r1.A02 = r0
            r1.A0d = r3
            if (r14 == 0) goto L_0x009b
            r0 = 36
            boolean r10 = r14.A0R(r0, r7)
        L_0x009b:
            java.lang.String r0 = "push"
            if (r10 == 0) goto L_0x0105
            java.lang.String r0 = "none"
        L_0x00a1:
            java.lang.Integer r0 = X.C48718Ej3.A00(r0)
            r1.A0P = r0
            if (r3 == 0) goto L_0x00fc
            X.68u r4 = X.C46611Dhr.A01(r12, r13)
            if (r4 != 0) goto L_0x00b6
            java.lang.String r3 = "IgBloksScreenActionUtils"
            java.lang.String r0 = "ActionLoad contrib was sent but action_loaded_screen_parse_result doesn't exist in bk.data.screen.screen"
            X.1Kn.A02(r3, r0)
        L_0x00b6:
            r1.A07 = r4
        L_0x00b8:
            r1.A0Y = r2
            java.lang.String r0 = X.C46611Dhr.A06(r13)
            r1.A0R = r0
            X.C46611Dhr.A0D(r1, r13)
            r0 = 38
            java.util.Map r4 = X.C46611Dhr.A0B(r12, r14, r0)
            java.util.HashMap r0 = X.C308206Td.A0H(r15)
            X.DiU r3 = new X.DiU
            r3.<init>(r0, r4, r9)
            int r0 = X.C46611Dhr.A00(r13)
            r3.A00 = r0
            r3.A03 = r13
            r3.A04 = r14
            if (r2 != 0) goto L_0x00e2
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()
        L_0x00e2:
            java.util.Map r2 = (java.util.Map) r2
            r3.A0H(r2)
            java.util.Map r0 = X.C46611Dhr.A0A(r12, r13)
            r3.A0H(r0)
            java.lang.String r0 = X.C46611Dhr.A05(r13)
            r3.A05 = r0
            androidx.fragment.app.FragmentActivity r0 = X.C308206Td.A04(r12)
            r3.A0D(r0, r1)
            return
        L_0x00fc:
            X.68u r4 = X.C48717Ej2.A00(r12, r13)
            X.68u r0 = r1.A07
            if (r0 != 0) goto L_0x00b8
            goto L_0x00b6
        L_0x0105:
            if (r14 == 0) goto L_0x00a1
            java.lang.String r0 = X.DbV.A10(r14, r0)
            goto L_0x00a1
        L_0x010c:
            com.google.common.collect.ImmutableMap$Builder r3 = new com.google.common.collect.ImmutableMap$Builder
            r3.<init>()
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            java.util.Iterator r2 = X.AnonymousClass7TF.A0s(r0)
        L_0x0117:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0131
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r2)
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            if (r1 == 0) goto L_0x0117
            if (r0 == 0) goto L_0x0117
            r3.put(r1, r0)
            goto L_0x0117
        L_0x0131:
            com.google.common.collect.ImmutableMap r2 = r3.build()
            goto L_0x005f
        L_0x0137:
            r8 = 0
            r4 = 0
            goto L_0x005f
        L_0x013b:
            boolean r0 = X.C46611Dhr.A0F(r13)
            if (r0 == 0) goto L_0x0144
            r11 = 0
            goto L_0x0021
        L_0x0144:
            java.lang.String r0 = "screen should be an instance of BloksScreenData or BloksScreenV2Data"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FBt.A02(X.6Rx, X.4tV, X.4tV, java.util.Map):void");
    }

    public static final void A00(FragmentActivity fragmentActivity, 0hq r2) {
        AnonymousClass7TG.A1N(r2, fragmentActivity);
        if (r2.A0M() <= 0 || r2.A0G) {
            fragmentActivity.onBackPressed();
        } else {
            r2.A0c();
        }
    }
}
