package X;

/* renamed from: X.WXw  reason: case insensitive filesystem */
public final class C19403WXw implements X4E {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C19403WXw(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01c0, code lost:
        if (r7 < (r1 / r0.A06)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01c4, code lost:
        if (r0 == null) goto L_0x01c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01c6, code lost:
        X.0qQ.A0F(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0230, code lost:
        if (r0 == null) goto L_0x01c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0238, code lost:
        X.0qQ.A0F(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0248, code lost:
        r0.A04(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x024b, code lost:
        return r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x024c, code lost:
        r0.A04(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x024f, code lost:
        return r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0250, code lost:
        r2.setLabelText(((androidx.fragment.app.Fragment) r6.A02).getString(2131964775));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x025e, code lost:
        r0 = "confirmed";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0260, code lost:
        r3.A01 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0262, code lost:
        return r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0083, code lost:
        if (r0 != false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0091, code lost:
        if (r0 != false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0093, code lost:
        r2.setLabelText("");
        r3.A01 = "error";
        r0 = ((androidx.fragment.app.Fragment) r6.A02).getString(2131964775);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00fe, code lost:
        if (r7 < X.C51971G9r.A0I(r0.A1o, 0)) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0102, code lost:
        if (r0 == null) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0104, code lost:
        X.0qQ.A0F("nextButtonHolder");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x010b, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002d, code lost:
        r3.A00 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002f, code lost:
        return r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x016f, code lost:
        if (r0 == null) goto L_0x0104;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C17355VSi getState(X.C17355VSi r18, java.lang.CharSequence r19, boolean r20) {
        /*
            r17 = this;
            r6 = r17
            int r0 = r6.A00
            r3 = r18
            r7 = r19
            switch(r0) {
                case 0: goto L_0x0172;
                case 1: goto L_0x00b8;
                case 2: goto L_0x0086;
                case 3: goto L_0x0078;
                default: goto L_0x000b;
            }
        L_0x000b:
            r5 = 0
            boolean r4 = X.AnonymousClass7TF.A1U(r5, r3, r7)
            java.lang.String r2 = r7.toString()
            int r0 = r2.length()
            if (r0 != 0) goto L_0x0030
            java.lang.String r0 = "error"
            r3.A01 = r0
            java.lang.Object r0 = r6.A01
            android.content.Context r0 = (android.content.Context) r0
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131976356(0x7f1360a4, float:1.958983E38)
        L_0x0029:
            java.lang.String r0 = r1.getString(r0)
        L_0x002d:
            r3.A00 = r0
        L_0x002f:
            return r18
        L_0x0030:
            java.lang.Object r1 = r6.A02
            X.0sa r1 = (X.C62320sa) r1
            java.lang.Object r0 = r1.invoke()
            if (r0 == 0) goto L_0x004d
            java.lang.Object r0 = r1.invoke()
            X.F1D r0 = (X.F1D) r0
            if (r0 == 0) goto L_0x004b
            java.lang.String r0 = r0.A0O
        L_0x0044:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x004d
            return r18
        L_0x004b:
            r0 = 0
            goto L_0x0044
        L_0x004d:
            java.util.HashMap r0 = X.C49313Esw.A01
            java.lang.Object r0 = r0.get(r2)
            X.EVF r0 = (X.EVF) r0
            if (r0 == 0) goto L_0x00a8
            int r1 = r0.ordinal()
            if (r1 == r4) goto L_0x025e
            r0 = 2
            if (r1 == r0) goto L_0x0068
            if (r1 == r5) goto L_0x002f
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0068:
            java.lang.String r0 = "error"
            r3.A01 = r0
            java.lang.Object r0 = r6.A01
            android.content.Context r0 = (android.content.Context) r0
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131976363(0x7f1360ab, float:1.9589844E38)
            goto L_0x0029
        L_0x0078:
            X.AnonymousClass7TG.A1N(r3, r7)
            boolean r0 = X.00l.A0W(r7)
            java.lang.Object r2 = r6.A01
            com.instagram.igds.components.form.IgFormField r2 = (com.instagram.igds.components.form.IgFormField) r2
            if (r0 == 0) goto L_0x0250
            goto L_0x0093
        L_0x0086:
            X.AnonymousClass7TG.A1N(r3, r7)
            boolean r0 = X.00l.A0W(r7)
            java.lang.Object r2 = r6.A01
            com.instagram.igds.components.form.IgFormField r2 = (com.instagram.igds.components.form.IgFormField) r2
            if (r0 == 0) goto L_0x0250
        L_0x0093:
            java.lang.String r0 = ""
            r2.setLabelText(r0)
            java.lang.String r0 = "error"
            r3.A01 = r0
            java.lang.Object r1 = r6.A02
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            r0 = 2131964775(0x7f133367, float:1.9566341E38)
            java.lang.String r0 = r1.getString(r0)
            goto L_0x002d
        L_0x00a8:
            X.Dj0 r2 = X.C49313Esw.A00
            if (r2 == 0) goto L_0x00b4
            r2.removeMessages(r4)
            r0 = 1000(0x3e8, double:4.94E-321)
            r2.sendEmptyMessageDelayed(r4, r0)
        L_0x00b4:
            java.lang.String r0 = "loading"
            goto L_0x0260
        L_0x00b8:
            r4 = 0
            boolean r2 = X.AnonymousClass7TF.A1U(r4, r3, r7)
            java.lang.String r0 = r7.toString()
            java.lang.Integer r8 = X.00y.A0l(r0)
            boolean r0 = X.00l.A0W(r7)
            java.lang.String r10 = "nextButtonHolder"
            if (r0 != 0) goto L_0x0242
            boolean r0 = android.text.TextUtils.isDigitsOnly(r7)
            if (r0 == 0) goto L_0x0242
            if (r8 == 0) goto L_0x0242
            int r7 = r8.intValue()
            java.lang.Object r5 = r6.A02
            X.UaV r5 = (X.C15323UaV) r5
            if (r7 <= r4) goto L_0x0242
            r0 = 30
            if (r7 > r0) goto L_0x0242
            com.instagram.business.promote.model.PromoteData r0 = r5.A08
            java.lang.String r9 = "promoteData"
            if (r0 == 0) goto L_0x01c6
            java.util.List r0 = r0.A1o
            X.0qQ.A06(r0)
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x010c
            com.instagram.business.promote.model.PromoteData r0 = r5.A08
            if (r0 == 0) goto L_0x01c6
            java.util.List r0 = r0.A1o
            int r0 = X.C51971G9r.A0I(r0, r4)
            if (r7 >= r0) goto L_0x010c
        L_0x0100:
            X.Vw9 r0 = r5.A05
            if (r0 != 0) goto L_0x0248
        L_0x0104:
            X.0qQ.A0F(r10)
        L_0x0107:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x010c:
            com.instagram.business.promote.model.PromoteData r1 = r5.A08
            if (r1 == 0) goto L_0x01c6
            int r0 = r1.A0A
            if (r7 == r0) goto L_0x016d
            java.util.List r0 = r1.A1o
            boolean r0 = r0.contains(r8)
            if (r0 != 0) goto L_0x0131
            com.instagram.business.promote.model.PromoteData r0 = r5.A08
            if (r0 == 0) goto L_0x01c6
            java.util.List r0 = r0.A1o
            r0.add(r8)
            com.instagram.business.promote.model.PromoteData r0 = r5.A08
            if (r0 == 0) goto L_0x01c6
            java.util.List r0 = r0.A1o
            X.0qQ.A06(r0)
            X.01V.A1C(r0)
        L_0x0131:
            com.instagram.business.promote.model.PromoteState r1 = r5.A09
            java.lang.String r4 = "promoteState"
            if (r1 == 0) goto L_0x0238
            com.instagram.business.promote.model.PromoteData r0 = r5.A08
            if (r0 == 0) goto L_0x01c6
            r1.A08(r0, r7)
            android.content.Context r11 = r5.requireContext()
            com.instagram.common.session.UserSession r15 = r5.getSession()
            java.lang.Object r1 = r6.A01
            android.view.View r1 = (android.view.View) r1
            java.lang.String r0 = "duration_slider"
            X.VaL r12 = new X.VaL
            r12.<init>(r1, r0)
            android.content.Context r1 = r5.requireContext()
            com.instagram.business.promote.model.PromoteData r0 = r5.A08
            if (r0 == 0) goto L_0x01c6
            java.util.List r0 = r0.A1o
            X.0qQ.A06(r0)
            java.util.List r16 = X.W2x.A05(r1, r0)
            com.instagram.business.promote.model.PromoteData r13 = r5.A08
            if (r13 == 0) goto L_0x01c6
            com.instagram.business.promote.model.PromoteState r14 = r5.A09
            if (r14 == 0) goto L_0x0238
            X.VAH.A00(r11, r12, r13, r14, r15, r16)
        L_0x016d:
            X.Vw9 r0 = r5.A05
            if (r0 != 0) goto L_0x024c
            goto L_0x0104
        L_0x0172:
            r4 = 0
            boolean r2 = X.AnonymousClass7TF.A1U(r4, r3, r7)
            java.lang.String r0 = r7.toString()
            java.lang.Integer r1 = X.00y.A0l(r0)
            boolean r0 = X.00l.A0W(r7)
            java.lang.String r9 = "nextButtonHolder"
            if (r0 != 0) goto L_0x0233
            boolean r0 = android.text.TextUtils.isDigitsOnly(r7)
            if (r0 == 0) goto L_0x0233
            if (r1 == 0) goto L_0x0233
            int r7 = r1.intValue()
            java.lang.Object r5 = r6.A02
            X.UaV r5 = (X.C15323UaV) r5
            if (r7 <= r4) goto L_0x0233
            r0 = 100000000(0x5f5e100, float:2.3122341E-35)
            if (r7 > r0) goto L_0x0233
            com.instagram.business.promote.model.PromoteData r0 = r5.A08
            java.lang.String r8 = "promoteData"
            if (r0 == 0) goto L_0x023d
            java.util.List r0 = r0.A1n
            X.0qQ.A06(r0)
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x01cb
            com.instagram.business.promote.model.PromoteData r0 = r5.A08
            if (r0 == 0) goto L_0x023d
            java.util.List r0 = r0.A1n
            int r1 = X.C51971G9r.A0I(r0, r4)
            com.instagram.business.promote.model.PromoteData r0 = r5.A08
            if (r0 == 0) goto L_0x023d
            int r0 = r0.A06
            int r1 = r1 / r0
            if (r7 >= r1) goto L_0x01cb
        L_0x01c2:
            X.Vw9 r0 = r5.A05
            if (r0 != 0) goto L_0x0248
        L_0x01c6:
            X.0qQ.A0F(r9)
            goto L_0x0107
        L_0x01cb:
            com.instagram.business.promote.model.PromoteData r1 = r5.A08
            if (r1 == 0) goto L_0x023d
            int r0 = r1.A06
            int r7 = r7 * r0
            int r0 = r1.A07
            if (r7 == r0) goto L_0x022e
            java.util.List r0 = r1.A1n
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x01f7
            com.instagram.business.promote.model.PromoteData r0 = r5.A08
            if (r0 == 0) goto L_0x023d
            java.util.List r0 = r0.A1n
            r0.add(r1)
            com.instagram.business.promote.model.PromoteData r0 = r5.A08
            if (r0 == 0) goto L_0x023d
            java.util.List r0 = r0.A1n
            X.0qQ.A06(r0)
            X.01V.A1C(r0)
        L_0x01f7:
            com.instagram.business.promote.model.PromoteState r1 = r5.A09
            java.lang.String r4 = "promoteState"
            if (r1 == 0) goto L_0x0238
            com.instagram.business.promote.model.PromoteData r0 = r5.A08
            if (r0 == 0) goto L_0x023d
            r1.A07(r0, r7)
            android.content.Context r10 = r5.requireContext()
            com.instagram.common.session.UserSession r14 = r5.getSession()
            java.lang.Object r1 = r6.A01
            android.view.View r1 = (android.view.View) r1
            java.lang.String r0 = "budget_slider"
            X.VaL r11 = new X.VaL
            r11.<init>(r1, r0)
            android.content.Context r1 = r5.requireContext()
            com.instagram.business.promote.model.PromoteData r0 = r5.A08
            if (r0 == 0) goto L_0x023d
            java.util.List r15 = X.W2x.A04(r1, r0)
            com.instagram.business.promote.model.PromoteData r12 = r5.A08
            if (r12 == 0) goto L_0x023d
            com.instagram.business.promote.model.PromoteState r13 = r5.A09
            if (r13 == 0) goto L_0x0238
            X.VAH.A00(r10, r11, r12, r13, r14, r15)
        L_0x022e:
            X.Vw9 r0 = r5.A05
            if (r0 != 0) goto L_0x024c
            goto L_0x01c6
        L_0x0233:
            java.lang.Object r5 = r6.A02
            X.UaV r5 = (X.C15323UaV) r5
            goto L_0x01c2
        L_0x0238:
            X.0qQ.A0F(r4)
            goto L_0x0107
        L_0x023d:
            X.0qQ.A0F(r8)
            goto L_0x0107
        L_0x0242:
            java.lang.Object r5 = r6.A02
            X.UaV r5 = (X.C15323UaV) r5
            goto L_0x0100
        L_0x0248:
            r0.A04(r4)
            return r18
        L_0x024c:
            r0.A04(r2)
            return r18
        L_0x0250:
            java.lang.Object r1 = r6.A02
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            r0 = 2131964775(0x7f133367, float:1.9566341E38)
            java.lang.String r0 = r1.getString(r0)
            r2.setLabelText(r0)
        L_0x025e:
            java.lang.String r0 = "confirmed"
        L_0x0260:
            r3.A01 = r0
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19403WXw.getState(X.VSi, java.lang.CharSequence, boolean):X.VSi");
    }
}
