package X;

public final class NgJ extends C47518E6c {
    public static final String __redex_internal_original_name = "AiAgentSearchSourcesFragment";
    public final AnonymousClass0eM A00 = DbW.A0p(this, 14);
    public final AnonymousClass0eM A01 = C227642jf.A02(this);

    public final String getModuleName() {
        return "direct_agent_sources";
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r36, android.os.Bundle r37) {
        /*
            r35 = this;
            r5 = 0
            r1 = 0
            r0 = 0
            r3 = r36
            X.0qQ.A0B(r3, r0)
            r2 = r35
            r0 = r37
            super.onViewCreated(r3, r0)
            android.os.Bundle r3 = r2.requireArguments()
            java.lang.String r0 = "AiAgentSearchSourcesFragment.arg_sources_url"
            java.lang.String r3 = r3.getString(r0)
            if (r3 == 0) goto L_0x00bc
            java.lang.String r0 = "\\[[^\\]]*\\]"
            X.11S r4 = new X.11S
            r4.<init>(r0)
            java.lang.String r0 = "UTF-8"
            java.lang.String r3 = java.net.URLDecoder.decode(r3, r0)
            X.0qQ.A0A(r3)
            X.J2t r0 = X.C59008J2t.A00
            java.lang.String r0 = r4.A02(r3, r0)
            android.net.Uri r4 = android.net.Uri.parse(r0)
            X.0qQ.A07(r4)
            java.lang.String r0 = "source_query"
            java.lang.String r8 = r4.getQueryParameter(r0)
            java.lang.String r0 = "source_query_url"
            java.lang.String r3 = r4.getQueryParameter(r0)
            java.lang.String r0 = "source_titles"
            java.util.List r7 = r4.getQueryParameters(r0)
            java.lang.String r0 = "source_sub_titles"
            java.util.List r6 = r4.getQueryParameters(r0)
            java.lang.String r0 = "source_urls"
            java.util.List r4 = r4.getQueryParameters(r0)
            if (r8 == 0) goto L_0x00bc
            if (r3 == 0) goto L_0x00bc
            int r3 = r7.size()
            int r0 = r6.size()
            if (r3 != r0) goto L_0x00bc
            int r3 = r6.size()
            int r0 = r4.size()
            if (r3 != r0) goto L_0x00bc
            java.util.ArrayList r1 = X.00k.A0R(r7, r6)
            java.util.Iterator r7 = r1.iterator()
            java.util.Iterator r6 = r4.iterator()
            r0 = 10
            int r1 = X.0Yv.A1E(r1, r0)
            int r0 = X.0Yv.A1E(r4, r0)
            int r0 = java.lang.Math.min(r1, r0)
            java.util.ArrayList r5 = X.DbS.A0v(r0)
        L_0x008c:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00be
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00be
            java.lang.Object r0 = r7.next()
            java.lang.String r4 = X.AnonymousClass7TE.A18(r6)
            X.0eP r0 = (X.0eP) r0
            java.lang.Object r3 = r0.A00
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = r0.A01
            java.lang.String r1 = (java.lang.String) r1
            X.0qQ.A0A(r3)
            X.0qQ.A0A(r1)
            X.0qQ.A0A(r4)
            X.ODO r0 = new X.ODO
            r0.<init>(r3, r1, r4)
            r5.add(r0)
            goto L_0x008c
        L_0x00bc:
            r4 = 0
            goto L_0x00c0
        L_0x00be:
            r1 = r8
            r4 = 1
        L_0x00c0:
            android.os.Bundle r3 = r2.requireArguments()
            java.lang.String r0 = "AiAgentSearchSourcesFragment.arg_agent_id"
            java.lang.String r32 = r3.getString(r0)
            android.os.Bundle r3 = r2.requireArguments()
            java.lang.String r0 = "AiAgentSearchSourcesFragment.arg_bot_response_id"
            java.lang.String r33 = r3.getString(r0)
            if (r4 == 0) goto L_0x0174
            android.os.Bundle r3 = r2.requireArguments()
            java.lang.String r0 = "AiAgentSearchSourcesFragment.is_v2_design"
            boolean r11 = r3.getBoolean(r0)
            X.01N r0 = X.0jo.A1H()
            java.util.Iterator r10 = r5.iterator()
            r34 = 0
        L_0x00ea:
            boolean r3 = r10.hasNext()
            r28 = 1
            if (r3 == 0) goto L_0x0157
            java.lang.Object r8 = r10.next()
            int r9 = r34 + 1
            if (r34 >= 0) goto L_0x0102
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0102:
            X.ODO r8 = (X.ODO) r8
            java.lang.String r4 = r8.A01
            java.lang.String r3 = r8.A00
            r7 = 2132018616(0x7f1405b8, float:1.9675544E38)
            r6 = 2132018053(0x7f140385, float:1.9674402E38)
            android.content.Context r5 = r2.getContext()
            int r5 = X.2Yu.A06(r5)
            if (r11 == 0) goto L_0x0154
            java.lang.Integer r24 = java.lang.Integer.valueOf(r34)
        L_0x011c:
            X.OjB r13 = new X.OjB
            r29 = r13
            r30 = r2
            r31 = r8
            r29.<init>(r30, r31, r32, r33, r34)
            r14 = 0
            java.lang.Integer r19 = java.lang.Integer.valueOf(r7)
            java.lang.Integer r21 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r22 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r23 = java.lang.Integer.valueOf(r28)
            X.Njo r17 = X.C69349Njo.TYPE_UNKNOWN
            X.OIM r12 = new X.OIM
            r15 = r14
            r16 = r14
            r18 = r14
            r20 = r14
            r25 = r4
            r26 = r14
            r27 = r3
            r29 = r28
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r0.add(r12)
            r34 = r9
            goto L_0x00ea
        L_0x0154:
            r24 = 0
            goto L_0x011c
        L_0x0157:
            if (r11 != 0) goto L_0x016d
            int r3 = r1.length()
            if (r3 <= 0) goto L_0x016d
            r3 = 34
            java.lang.String r3 = X.002.A0E(r1, r3, r3)
            X.FGF r1 = new X.FGF
            r1.<init>((java.lang.CharSequence) r3)
            r0.add(r1)
        L_0x016d:
            X.01N r0 = X.0jo.A1I(r0)
            r2.setBottomSheetMenuItems(r0)
        L_0x0174:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NgJ.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }
}
