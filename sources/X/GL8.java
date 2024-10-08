package X;

public final class GL8 extends 0Yg implements C62320sa {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GL8(int i, int i2, Object obj, Object obj2) {
        super(0);
        this.A00 = i2;
        this.A01 = i;
        this.A03 = obj;
        this.A02 = obj2;
    }

    public static GL8 A00(C286575Wy r1, Object obj, Object obj2, int i, int i2) {
        GL8 gl8 = new GL8(i, i2, obj, obj2);
        r1.FLL(gl8);
        return gl8;
    }

    /* JADX WARNING: type inference failed for: r1v198, types: [X.52R, X.52T, X.52S] */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x03b0, code lost:
        if (r3 == 2) goto L_0x03b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x03f4, code lost:
        if (r6.A03 != false) goto L_0x03f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x0893, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:?, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:?, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        r2.invoke(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0257, code lost:
        r6 = ((android.view.View) r2).findViewById(r0.A01);
        r0 = (X.0sP) r0.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0263, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0265, code lost:
        X.0qQ.A0A(r6);
        r0.invoke(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x026b, code lost:
        return r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r18 = this;
            r0 = r18
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x057e;
                case 1: goto L_0x0841;
                case 2: goto L_0x037c;
                case 3: goto L_0x0007;
                case 4: goto L_0x0007;
                case 5: goto L_0x0007;
                case 6: goto L_0x02bd;
                case 7: goto L_0x02bd;
                case 8: goto L_0x00b4;
                case 9: goto L_0x00b4;
                case 10: goto L_0x02ac;
                case 11: goto L_0x02ac;
                case 12: goto L_0x07dc;
                case 13: goto L_0x0299;
                case 14: goto L_0x0286;
                case 15: goto L_0x010c;
                case 16: goto L_0x026c;
                case 17: goto L_0x0224;
                case 18: goto L_0x0871;
                case 19: goto L_0x07cd;
                case 20: goto L_0x07be;
                case 21: goto L_0x0211;
                case 22: goto L_0x0211;
                case 23: goto L_0x0188;
                case 24: goto L_0x07a5;
                case 25: goto L_0x0761;
                case 26: goto L_0x071e;
                case 27: goto L_0x0255;
                case 28: goto L_0x017e;
                case 29: goto L_0x0855;
                case 30: goto L_0x016b;
                case 31: goto L_0x0158;
                case 32: goto L_0x070e;
                case 33: goto L_0x0700;
                case 34: goto L_0x06f0;
                case 35: goto L_0x06e0;
                case 36: goto L_0x06d0;
                case 37: goto L_0x06c0;
                case 38: goto L_0x0680;
                case 39: goto L_0x00f5;
                case 40: goto L_0x0668;
                case 41: goto L_0x00c2;
                case 42: goto L_0x05b0;
                case 43: goto L_0x00b4;
                case 44: goto L_0x009c;
                case 45: goto L_0x0086;
                case 46: goto L_0x0062;
                case 47: goto L_0x05a1;
                case 48: goto L_0x0019;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r2 = r0.A03
            X.0sL r2 = (X.0sL) r2
            int r1 = r0.A01
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.A02
        L_0x0013:
            r2.invoke(r1, r0)
        L_0x0016:
            X.0gF r6 = X.C60340gF.A00
        L_0x0018:
            return r6
        L_0x0019:
            java.lang.Object r1 = r0.A03
            X.GE0 r1 = (X.GE0) r1
            X.GIQ r3 = r1.A05
            int r2 = r0.A01
            java.lang.String r1 = "video_position"
            r3.A0G(r1, r2)
            java.lang.Object r2 = r0.A02
            X.9Ia r2 = (X.C376449Ia) r2
            boolean r1 = r2.A03
            java.lang.String r0 = "is_video_cached"
            r3.A0K(r0, r1)
            java.lang.Object r0 = r2.A02
            X.3wz r0 = (X.C257183wz) r0
            java.lang.String r1 = r0.name()
            java.lang.String r0 = "is_video_init_segment_cached"
            r3.A0J(r0, r1)
            java.lang.Object r0 = r2.A01
            X.3wz r0 = (X.C257183wz) r0
            java.lang.String r1 = r0.name()
            java.lang.String r0 = "is_video_first_data_segment_cached"
            r3.A0J(r0, r1)
            boolean r1 = r2.A04
            java.lang.String r0 = "is_video_player_warmed"
            r3.A0K(r0, r1)
            X.34p r0 = r3.A00
            if (r0 == 0) goto L_0x0059
            r0.A05()
        L_0x0059:
            r0 = 0
            r3.A00 = r0
            X.Dc1 r0 = r3.A03
            r0.A01()
            goto L_0x0016
        L_0x0062:
            java.lang.Object r2 = r0.A03
            X.GZC r2 = (X.GZC) r2
            X.GCs r3 = r2.A01
            java.lang.Object r4 = r0.A02
            android.view.View r4 = (android.view.View) r4
            X.4bN r1 = r2.A00
            X.3OA r7 = r1.A06()
            X.3Ds r5 = X.C238863Ds.GENERIC_CALL_TO_ACTION_BUTTON
            int r0 = r0.A01
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r6 = 0
            r3.A04(r4, r5, r6, r7, r8)
            X.0sa r0 = r2.A02
            if (r0 == 0) goto L_0x0016
            r0.invoke()
            goto L_0x0016
        L_0x0086:
            java.lang.Object r1 = r0.A03
            X.GuU r1 = (X.C53801GuU) r1
            X.0sL r2 = r1.A02
            int r1 = r0.A01
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.A02
            X.JMW r0 = (X.JMW) r0
            X.IdH r0 = (X.C57590IdH) r0
            X.Hsk r0 = r0.A00
            goto L_0x0013
        L_0x009c:
            java.lang.Object r1 = r0.A03
            X.GuU r1 = (X.C53801GuU) r1
            X.0sL r2 = r1.A03
            int r1 = r0.A01
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.A02
            X.JMW r0 = (X.JMW) r0
            X.IdH r0 = (X.C57590IdH) r0
            X.Hsk r0 = r0.A00
            java.lang.String r0 = r0.A01
            goto L_0x0013
        L_0x00b4:
            java.lang.Object r2 = r0.A02
            X.0sL r2 = (X.0sL) r2
            int r1 = r0.A01
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.A03
            goto L_0x0013
        L_0x00c2:
            int r1 = r0.A01
            r5 = 0
            X.2HY r1 = X.C229632nm.A0C(r5, r1)
            java.lang.Object r4 = r0.A03
            X.HtS r4 = (X.C56140HtS) r4
            java.lang.Object r3 = r0.A02
            X.0sP r3 = (X.0sP) r3
            java.util.Iterator r2 = r1.iterator()
        L_0x00d5:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0016
            r0 = r2
            X.0sh r0 = (X.0sh) r0
            r0.A00()
            X.F3q r0 = r4.A02
            r0.A04(r3)
            X.01W r0 = r4.A04
            r0.A0T()
            X.0sP r1 = r4.A05
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r1.invoke(r0)
            goto L_0x00d5
        L_0x00f5:
            java.lang.Object r1 = r0.A03
            X.Gv4 r1 = (X.C53837Gv4) r1
            X.0sK r3 = r1.A05
            if (r3 == 0) goto L_0x0016
            X.HnQ r2 = r1.A01
            java.lang.Object r1 = r0.A02
            int r0 = r0.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.invoke(r2, r1, r0)
            goto L_0x0016
        L_0x010c:
            java.lang.Object r7 = r0.A03
            X.K6H r7 = (X.K6H) r7
            int r5 = r0.A01
            java.lang.Object r0 = r0.A02
            X.LML r0 = (X.LML) r0
            boolean r6 = r0.A01
            androidx.recyclerview.widget.RecyclerView r0 = r7.A02
            java.lang.String r4 = "recyclerView"
            if (r0 == 0) goto L_0x0886
            X.3pI r3 = r0.A0D
            r0 = 7
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0qQ.A0C(r3, r0)
            androidx.recyclerview.widget.RecyclerView r2 = r7.A02
            if (r2 == 0) goto L_0x0886
            r1 = 1
            boolean r0 = r2.A1C()
            if (r0 != 0) goto L_0x0137
            r0 = 2
            r2.A0v(r0, r1)
        L_0x0137:
            r0 = 0
            X.Jm6 r1 = new X.Jm6
            r1.<init>(r0, r7, r6)
            androidx.recyclerview.widget.RecyclerView r0 = r7.A02
            if (r0 == 0) goto L_0x0886
            r0.A15(r1)
            android.content.Context r0 = r7.requireContext()
            X.52R r1 = new X.52R
            r1.<init>(r0)
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.A00 = r0
            r1.A00 = r5
            r3.A0t(r1)
            goto L_0x0016
        L_0x0158:
            java.lang.Object r1 = r0.A03
            X.4KG r1 = (X.AnonymousClass4KG) r1
            java.lang.Integer r1 = r1.A06
            if (r1 == 0) goto L_0x0016
            java.lang.Object r1 = r0.A02
            X.3uv r1 = (X.C255913uv) r1
            int r0 = r0.A01
            r1.setInactiveColor(r0)
            goto L_0x0016
        L_0x016b:
            java.lang.Object r1 = r0.A03
            X.4KG r1 = (X.AnonymousClass4KG) r1
            java.lang.Integer r1 = r1.A05
            if (r1 == 0) goto L_0x0016
            java.lang.Object r1 = r0.A02
            X.3uv r1 = (X.C255913uv) r1
            int r0 = r0.A01
            r1.setActiveColor(r0)
            goto L_0x0016
        L_0x017e:
            java.lang.Object r1 = r0.A03
            X.0eM r1 = (X.AnonymousClass0eM) r1
            java.lang.Object r2 = r1.getValue()
            goto L_0x0257
        L_0x0188:
            java.lang.String r5 = "connectivity_prober"
            java.lang.String r2 = "Probe attempt: %d."
            int r6 = r0.A01     // Catch:{ IOException -> 0x01ca }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch:{ IOException -> 0x01ca }
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch:{ IOException -> 0x01ca }
            X.0KC.A0P(r5, r2, r1)     // Catch:{ IOException -> 0x01ca }
            java.lang.Object r4 = r0.A03     // Catch:{ IOException -> 0x01ca }
            X.HoJ r4 = (X.C55836HoJ) r4     // Catch:{ IOException -> 0x01ca }
            java.lang.String r2 = r4.A05     // Catch:{ IOException -> 0x01ca }
            java.net.URL r1 = new java.net.URL     // Catch:{ IOException -> 0x01ca }
            r1.<init>(r2)     // Catch:{ IOException -> 0x01ca }
            java.net.URLConnection r3 = r1.openConnection()     // Catch:{ IOException -> 0x01ca }
            java.lang.String r1 = "null cannot be cast to non-null type java.net.HttpURLConnection"
            X.0qQ.A0C(r3, r1)     // Catch:{ IOException -> 0x01ca }
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ IOException -> 0x01ca }
            int r1 = r4.A00     // Catch:{ IOException -> 0x01ca }
            r3.setConnectTimeout(r1)     // Catch:{ IOException -> 0x01ca }
            r3.setReadTimeout(r1)     // Catch:{ IOException -> 0x01ca }
            r1 = -1320363971(0xffffffffb14cd83d, float:-2.9808824E-9)
            X.0fi.A02(r3, r1)     // Catch:{ IOException -> 0x01ca }
            java.lang.Object r2 = r0.A02     // Catch:{ IOException -> 0x01ca }
            X.JPU r2 = (X.JPU) r2     // Catch:{ IOException -> 0x01ca }
            int r1 = r3.getResponseCode()     // Catch:{ IOException -> 0x01ca }
            r2.Do9(r1, r6)     // Catch:{ IOException -> 0x01ca }
            goto L_0x0016
        L_0x01ca:
            r8 = move-exception
            java.lang.String r1 = r8.getMessage()
            java.lang.Object[] r2 = new java.lang.Object[]{r1}
            java.lang.String r1 = "Attempt failed with (%s)."
            X.0KC.A0P(r5, r1, r2)
            int r7 = r0.A01
            long r4 = (long) r7
            java.lang.Object r6 = r0.A03
            X.HoJ r6 = (X.C55836HoJ) r6
            long r2 = r6.A02
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 < 0) goto L_0x01f6
            java.lang.Object r1 = r0.A02
            X.JPU r1 = (X.JPU) r1
            java.lang.String r0 = r8.getMessage()
            if (r0 != 0) goto L_0x01f1
            java.lang.String r0 = ""
        L_0x01f1:
            r1.DEc(r0)
            goto L_0x0016
        L_0x01f6:
            java.lang.Object r5 = r0.A02
            int r4 = r7 + 1
            long r2 = r6.A01
            r1 = 23
            X.GL8 r0 = new X.GL8
            r0.<init>(r4, r1, r6, r5)
            X.H84 r1 = new X.H84
            r1.<init>(r0)
            X.0no r0 = X.0no.A00()
            r0.A01(r1, r2)
            goto L_0x0016
        L_0x0211:
            java.lang.Object r2 = r0.A03
            X.0sP r2 = (X.0sP) r2
            java.lang.Object r1 = r0.A02
            java.util.List r1 = (java.util.List) r1
            int r0 = r0.A01
            java.lang.Object r0 = r1.get(r0)
            r2.invoke(r0)
            goto L_0x0016
        L_0x0224:
            java.lang.Object r2 = r0.A03
            com.instagram.pando.livetree.LiveTreeJNI r2 = (com.instagram.pando.livetree.LiveTreeJNI) r2
            int r1 = r0.A01
            java.util.List r1 = r2.getOptionalStringListNative(r1)
            if (r1 == 0) goto L_0x088a
            java.lang.Object r2 = r0.A02
            X.0sP r2 = (X.0sP) r2
            r0 = 10
            int r0 = X.0Yv.A1E(r1, r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x0243:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0018
            java.lang.Object r0 = r1.next()
            java.lang.Object r0 = r2.invoke(r0)
            r6.add(r0)
            goto L_0x0243
        L_0x0255:
            java.lang.Object r2 = r0.A03
        L_0x0257:
            android.view.View r2 = (android.view.View) r2
            int r1 = r0.A01
            android.view.View r6 = r2.findViewById(r1)
            java.lang.Object r0 = r0.A02
            X.0sP r0 = (X.0sP) r0
            if (r0 == 0) goto L_0x0018
            X.0qQ.A0A(r6)
            r0.invoke(r6)
            return r6
        L_0x026c:
            java.lang.Object r1 = r0.A03
            X.E7b r1 = (X.C47538E7b) r1
            com.instagram.newsfeed.followrequests.data.FollowRequestsRepository r1 = r1.A03
            java.lang.Object r7 = r0.A02
            java.util.List r7 = (java.util.List) r7
            int r0 = r0.A01
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r2 = 0
            r3 = r2
            r4 = r2
            r6 = r2
            r8 = r2
            r1.A05(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0016
        L_0x0286:
            java.lang.Object r1 = r0.A03
            X.3bF r1 = (X.C244473bF) r1
            java.lang.Integer r1 = r1.A0A
            if (r1 == 0) goto L_0x0016
            java.lang.Object r1 = r0.A02
            android.widget.TextView r1 = (android.widget.TextView) r1
            int r0 = r0.A01
            r1.setMaxLines(r0)
            goto L_0x0016
        L_0x0299:
            java.lang.Object r1 = r0.A03
            X.3bF r1 = (X.C244473bF) r1
            java.lang.Integer r1 = r1.A09
            if (r1 == 0) goto L_0x0016
            java.lang.Object r1 = r0.A02
            android.widget.TextView r1 = (android.widget.TextView) r1
            int r0 = r0.A01
            r1.setGravity(r0)
            goto L_0x0016
        L_0x02ac:
            java.lang.Object r2 = r0.A02
            X.0sL r2 = (X.0sL) r2
            java.lang.Object r1 = r0.A03
            int r0 = r0.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.invoke(r1, r0)
            goto L_0x0016
        L_0x02bd:
            java.lang.Object r9 = r0.A03
            X.5tX r9 = (X.C298505tX) r9
            java.lang.Object r1 = r0.A02
            X.GmB r1 = (X.C53325GmB) r1
            X.Kp1 r2 = r1.A00
            boolean r3 = r1.A0A
            if (r3 == 0) goto L_0x031b
            androidx.fragment.app.FragmentActivity r8 = r9.getActivity()
            if (r8 == 0) goto L_0x02f0
            X.0eM r3 = r9.A05
            java.lang.Object r3 = r3.getValue()
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher r7 = new com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher
            r7.<init>(r3)
            java.lang.String r10 = r2.A03()
            X.0eM r3 = r9.A02
            java.lang.Object r11 = r3.getValue()
            java.lang.String r11 = (java.lang.String) r11
            r12 = 0
            r14 = 1
            r13 = r12
            r7.A08(r8, r9, r10, r11, r12, r13, r14)
        L_0x02f0:
            X.0eM r3 = r9.A00
            java.lang.Object r3 = r3.getValue()
            X.LRW r3 = (X.LRW) r3
            java.lang.String r8 = r1.A05
            java.lang.String r6 = r1.A06
            java.lang.String r7 = r2.A01()
            X.0eM r1 = r9.A04
            java.lang.Object r10 = r1.getValue()
            java.lang.String r10 = (java.lang.String) r10
            com.instagram.api.schemas.IGAIAgentType r4 = r2.A00()
            java.lang.String r11 = r2.A02()
            int r13 = r0.A01
            java.lang.String r9 = "seeAll"
            r5 = 0
            r12 = r5
            r3.A02(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0016
        L_0x031b:
            boolean r3 = r2 instanceof X.K0Y
            androidx.fragment.app.FragmentActivity r8 = r9.getActivity()
            if (r3 == 0) goto L_0x034c
            if (r8 == 0) goto L_0x02f0
            X.0eM r3 = r9.A05
            java.lang.Object r3 = r3.getValue()
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher r7 = new com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher
            r7.<init>(r3)
            X.0eM r3 = r9.A02
            java.lang.Object r11 = r3.getValue()
            java.lang.String r11 = (java.lang.String) r11
            r3 = r2
            X.K0Y r3 = (X.K0Y) r3
            java.lang.String r12 = r3.A00
            java.lang.String r13 = r1.A05
            java.lang.String r3 = r1.A03
            com.instagram.common.typedurl.SimpleImageUrl r10 = new com.instagram.common.typedurl.SimpleImageUrl
            r10.<init>(r3)
            r7.A04(r8, r9, r10, r11, r12, r13)
            goto L_0x02f0
        L_0x034c:
            if (r8 == 0) goto L_0x02f0
            X.0eM r3 = r9.A05
            java.lang.Object r3 = r3.getValue()
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher r7 = new com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher
            r7.<init>(r3)
            java.lang.String r11 = r1.A05
            java.lang.String r3 = r1.A03
            com.instagram.common.typedurl.SimpleImageUrl r10 = new com.instagram.common.typedurl.SimpleImageUrl
            r10.<init>(r3)
            java.lang.String r12 = r1.A08
            java.lang.String r13 = r2.A03()
            r14 = 0
            X.0eM r3 = r9.A02
            java.lang.Object r15 = r3.getValue()
            java.lang.String r15 = (java.lang.String) r15
            java.lang.String r3 = r1.A09
            r16 = r3
            r7.A06(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x02f0
        L_0x037c:
            java.lang.Object r6 = r0.A03
            X.QDM r6 = (X.QDM) r6
            java.util.List r2 = X.C11298SKh.A00()
            int r3 = r0.A01
            if (r3 == 0) goto L_0x040b
            r1 = 1
            if (r3 == r1) goto L_0x040b
            r1 = 2
            if (r3 == r1) goto L_0x0408
            r1 = 5
            if (r3 == r1) goto L_0x0408
            r1 = 0
        L_0x0392:
            r7 = 0
            int r2 = r2.indexOf(r1)
            r8 = 1
            r9 = 6
            if (r3 == 0) goto L_0x03a1
            if (r3 != r8) goto L_0x0405
            boolean r1 = r6.A05
            if (r1 == 0) goto L_0x0405
        L_0x03a1:
            r17 = 1
        L_0x03a3:
            r16 = 0
            if (r3 != r8) goto L_0x03a9
            r16 = 1
        L_0x03a9:
            r11 = 5
            r10 = 2
            r4 = 28
            if (r3 == r11) goto L_0x03b2
            r13 = 0
            if (r3 != r10) goto L_0x03b3
        L_0x03b2:
            r13 = 1
        L_0x03b3:
            r12 = 0
            if (r3 != r10) goto L_0x03b7
            r12 = 1
        L_0x03b7:
            X.2Fj r1 = r6.A0H
            java.lang.Object r1 = r1.A02()
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r1 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r1
            if (r1 == 0) goto L_0x0403
            com.facebookpay.expresscheckout.models.ECPPaymentConfiguration r1 = r1.A03
            if (r1 == 0) goto L_0x0403
            com.facebookpay.expresscheckout.models.KnownData r5 = r1.A01
        L_0x03c7:
            int r3 = r2 + 1
            java.util.List r1 = X.C11298SKh.A00()
            int r2 = r1.size()
        L_0x03d1:
            if (r3 >= r2) goto L_0x040e
            java.util.List r1 = X.C11298SKh.A00()
            java.lang.Object r1 = r1.get(r3)
            X.5tb r1 = (X.C298525tb) r1
            int r1 = r1.ordinal()
            if (r1 == r9) goto L_0x03ee
            if (r1 != r4) goto L_0x03eb
            boolean r1 = r6.A02
            if (r1 == 0) goto L_0x03eb
            r12 = 1
            r13 = 1
        L_0x03eb:
            int r3 = r3 + 1
            goto L_0x03d1
        L_0x03ee:
            if (r16 != 0) goto L_0x03f6
            boolean r1 = r6.A03
            r16 = 0
            if (r1 == 0) goto L_0x03f8
        L_0x03f6:
            r16 = 1
        L_0x03f8:
            if (r17 != 0) goto L_0x0400
            boolean r1 = r6.A05
            r17 = 0
            if (r1 == 0) goto L_0x03eb
        L_0x0400:
            r17 = 1
            goto L_0x03eb
        L_0x0403:
            r5 = 0
            goto L_0x03c7
        L_0x0405:
            r17 = 0
            goto L_0x03a3
        L_0x0408:
            X.5tb r1 = X.C298525tb.SHIPPING_ADDRESS
            goto L_0x0392
        L_0x040b:
            X.5tb r1 = X.C298525tb.CONTACT_INFORMATION
            goto L_0x0392
        L_0x040e:
            X.QD8 r2 = r6.A01
            java.lang.String r15 = "formViewModel"
            if (r2 == 0) goto L_0x088c
            r1 = 11
            X.SRc r3 = r2.A01(r1)
            java.lang.String r4 = "null cannot be cast to non-null type com.facebookpay.form.cell.text.TextCellViewModel"
            if (r3 == 0) goto L_0x04f9
            if (r12 == 0) goto L_0x0430
            X.SRc r2 = r3.A0D(r10)
            X.0qQ.A0C(r2, r4)
            X.Qfl r2 = (X.C8041Qfl) r2
            if (r5 == 0) goto L_0x057b
            java.lang.String r1 = r5.A02
        L_0x042d:
            r2.A0P(r1)
        L_0x0430:
            if (r13 == 0) goto L_0x04f9
            X.SOm r1 = X.AnonymousClass2E0.A01()
            X.Sto r13 = r1.A04
            com.facebookpay.logging.LoggingContext r12 = r6.A0R
            X.RIb r10 = X.RIb.SHIPPING_ADDRESS
            X.QDH r1 = r6.A0S
            X.SEB r2 = r1.A03()
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            X.SUU.A0A(r2, r1)
            r13.A0B(r10, r12, r1)
            r1 = 10
            X.SRc r12 = r3.A0D(r1)
            java.lang.String r1 = "null cannot be cast to non-null type com.facebookpay.form.cell.selector.CountrySelectorCellViewModel"
            X.0qQ.A0C(r12, r1)
            X.5tS r12 = (X.C298455tS) r12
            if (r5 == 0) goto L_0x0578
            com.facebookpay.shippingaddress.model.ShippingAddress r1 = r5.A00
            if (r1 == 0) goto L_0x0578
            java.lang.String r14 = r1.A02
        L_0x0462:
            com.google.common.collect.ImmutableList r13 = r12.A02
            int r10 = r13.size()
            r2 = 0
        L_0x0469:
            if (r2 >= r10) goto L_0x0490
            java.lang.Object r1 = r13.get(r2)
            com.facebookpay.form.model.FormCountry r1 = (com.facebookpay.form.model.FormCountry) r1
            if (r1 == 0) goto L_0x0575
            com.facebook.common.locale.Country r1 = r1.A00
            java.util.Locale r1 = r1.A00
            java.lang.String r1 = r1.getCountry()
        L_0x047b:
            boolean r1 = X.0qQ.A0K(r1, r14)
            if (r1 == 0) goto L_0x0571
            java.lang.Object r1 = r13.get(r2)
            com.facebookpay.form.model.FormCountry r1 = (com.facebookpay.form.model.FormCountry) r1
            if (r1 == 0) goto L_0x0490
            com.facebook.common.locale.Country r2 = r1.A00
            X.2gB r1 = r12.A05
            r1.A0B(r2)
        L_0x0490:
            X.SRc r2 = r3.A0D(r11)
            X.0qQ.A0C(r2, r4)
            X.Qfl r2 = (X.C8041Qfl) r2
            if (r5 == 0) goto L_0x056e
            com.facebookpay.shippingaddress.model.ShippingAddress r1 = r5.A00
            if (r1 == 0) goto L_0x056e
            java.lang.String r1 = r1.A08
        L_0x04a1:
            r2.A0P(r1)
            X.SRc r2 = r3.A0D(r9)
            X.0qQ.A0C(r2, r4)
            X.Qfl r2 = (X.C8041Qfl) r2
            if (r5 == 0) goto L_0x056b
            com.facebookpay.shippingaddress.model.ShippingAddress r1 = r5.A00
            if (r1 == 0) goto L_0x056b
            java.lang.String r1 = r1.A09
        L_0x04b5:
            r2.A0P(r1)
            r1 = 7
            X.SRc r2 = r3.A0D(r1)
            X.0qQ.A0C(r2, r4)
            X.Qfl r2 = (X.C8041Qfl) r2
            if (r5 == 0) goto L_0x0568
            com.facebookpay.shippingaddress.model.ShippingAddress r1 = r5.A00
            if (r1 == 0) goto L_0x0568
            java.lang.String r1 = r1.A01
        L_0x04ca:
            r2.A0P(r1)
            r1 = 8
            X.SRc r2 = r3.A0D(r1)
            X.0qQ.A0C(r2, r4)
            X.Qfl r2 = (X.C8041Qfl) r2
            if (r5 == 0) goto L_0x0565
            com.facebookpay.shippingaddress.model.ShippingAddress r1 = r5.A00
            if (r1 == 0) goto L_0x0565
            java.lang.String r1 = r1.A07
        L_0x04e0:
            r2.A0P(r1)
            r1 = 9
            X.SRc r2 = r3.A0D(r1)
            X.0qQ.A0C(r2, r4)
            X.Qfl r2 = (X.C8041Qfl) r2
            if (r5 == 0) goto L_0x0563
            com.facebookpay.shippingaddress.model.ShippingAddress r1 = r5.A00
            if (r1 == 0) goto L_0x0563
            java.lang.String r1 = r1.A06
        L_0x04f6:
            r2.A0P(r1)
        L_0x04f9:
            X.QD8 r2 = r6.A01
            if (r2 == 0) goto L_0x088c
            r1 = 36
            X.SRc r3 = r2.A01(r1)
            boolean r1 = r3 instanceof X.C298465tT
            if (r1 == 0) goto L_0x0561
            X.5tU r3 = (X.C298475tU) r3
        L_0x0509:
            if (r16 == 0) goto L_0x051d
            if (r3 == 0) goto L_0x055f
            X.SRc r2 = r3.A0L(r8)
        L_0x0511:
            X.0qQ.A0C(r2, r4)
            X.Qfl r2 = (X.C8041Qfl) r2
            if (r5 == 0) goto L_0x055d
            java.lang.String r1 = r5.A01
        L_0x051a:
            r2.A0P(r1)
        L_0x051d:
            if (r17 == 0) goto L_0x0531
            if (r3 == 0) goto L_0x055b
            X.SRc r2 = r3.A0L(r7)
        L_0x0525:
            X.0qQ.A0C(r2, r4)
            X.Qfl r2 = (X.C8041Qfl) r2
            if (r5 == 0) goto L_0x0559
            java.lang.String r1 = r5.A03
        L_0x052e:
            r2.A0P(r1)
        L_0x0531:
            if (r16 != 0) goto L_0x0535
            if (r17 == 0) goto L_0x0550
        L_0x0535:
            X.SOm r1 = X.AnonymousClass2E0.A01()
            X.Sto r5 = r1.A04
            com.facebookpay.logging.LoggingContext r4 = r6.A0R
            X.RIb r3 = X.RIb.CONTACT_INFO
            X.QDH r1 = r6.A0S
            X.SEB r2 = r1.A03()
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            X.SUU.A0A(r2, r1)
            r5.A0B(r3, r4, r1)
        L_0x0550:
            java.lang.Object r0 = r0.A02
            X.Qfl r0 = (X.C8041Qfl) r0
            r0.A0O()
            goto L_0x0016
        L_0x0559:
            r1 = 0
            goto L_0x052e
        L_0x055b:
            r2 = 0
            goto L_0x0525
        L_0x055d:
            r1 = 0
            goto L_0x051a
        L_0x055f:
            r2 = 0
            goto L_0x0511
        L_0x0561:
            r3 = 0
            goto L_0x0509
        L_0x0563:
            r1 = 0
            goto L_0x04f6
        L_0x0565:
            r1 = 0
            goto L_0x04e0
        L_0x0568:
            r1 = 0
            goto L_0x04ca
        L_0x056b:
            r1 = 0
            goto L_0x04b5
        L_0x056e:
            r1 = 0
            goto L_0x04a1
        L_0x0571:
            int r2 = r2 + 1
            goto L_0x0469
        L_0x0575:
            r1 = 0
            goto L_0x047b
        L_0x0578:
            r14 = 0
            goto L_0x0462
        L_0x057b:
            r1 = 0
            goto L_0x042d
        L_0x057e:
            java.lang.Object r1 = r0.A03
            com.google.android.gms.common.GoogleApiAvailabilityLight r1 = (com.google.android.gms.common.GoogleApiAvailabilityLight) r1
            java.lang.Object r5 = r0.A02
            android.app.Activity r5 = (android.app.Activity) r5
            int r4 = r0.A01
            r3 = 9000(0x2328, float:1.2612E-41)
            r2 = 0
            java.lang.String r0 = "d"
            android.content.Intent r1 = r1.A04(r5, r0, r4)
            X.5tW r0 = new X.5tW
            r0.<init>(r5, r1, r3)
            android.app.AlertDialog r0 = com.google.android.gms.common.GoogleApiAvailability.A00(r5, r2, r0, r4)
            if (r0 == 0) goto L_0x0016
            X.AnonymousClass0fN.A00(r0)
            goto L_0x0016
        L_0x05a1:
            java.lang.Object r2 = r0.A03
            X.GYo r2 = (X.C52589GYo) r2
            int r1 = r0.A01
            java.lang.Object r0 = r0.A02
            X.2WX r0 = (X.2WX) r0
            X.GvZ r6 = X.C52589GYo.A04(r0, r2, r1)
            return r6
        L_0x05b0:
            java.lang.Object r2 = r0.A03
            X.IdB r2 = (X.C57584IdB) r2
            int r1 = r0.A01
            java.lang.Object r8 = r0.A02
            java.lang.Integer r8 = (java.lang.Integer) r8
            android.content.Context r6 = r2.A00
            int[] r0 = X.C71382cm.A2Q
            android.content.res.TypedArray r5 = r6.obtainStyledAttributes(r1, r0)
            X.0qQ.A07(r5)
            r0 = 3
            java.lang.String r3 = r5.getString(r0)
            if (r3 != 0) goto L_0x05ce
            java.lang.String r3 = "sans-serif"
        L_0x05ce:
            r4 = 0
            r10 = 1097859072(0x41700000, float:15.0)
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            boolean r0 = r5.getValue(r4, r2)
            if (r0 == 0) goto L_0x05ee
            int r1 = r2.type
            r0 = 5
            if (r1 != r0) goto L_0x05ee
            int r2 = r2.data
            int r0 = r2 >> 0
            r1 = r0 & 15
            r0 = 2
            if (r1 != r0) goto L_0x064f
            float r10 = android.util.TypedValue.complexToFloat(r2)
        L_0x05ee:
            r2 = 1
            r6 = 0
            int r0 = r5.getInt(r2, r4)
            r0 = r0 & 1
            if (r0 == 0) goto L_0x05f9
            r6 = 1
        L_0x05f9:
            r1 = 4
            r0 = 0
            float r11 = r5.getFloat(r1, r0)
            r1 = 2
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r5.getFloat(r1, r0)
            r5.recycle()
            if (r8 != 0) goto L_0x061f
            if (r6 != 0) goto L_0x064c
            java.lang.String r0 = "bold"
            boolean r0 = X.00l.A0d(r3, r0, r4)
            if (r0 != 0) goto L_0x064c
            java.lang.String r0 = "medium"
            boolean r0 = X.00l.A0d(r3, r0, r4)
            if (r0 == 0) goto L_0x0649
            java.lang.Integer r8 = X.AnonymousClass05K.A01
        L_0x061f:
            boolean r0 = X.0oh.A08()
            if (r0 == 0) goto L_0x0633
            java.lang.Integer r0 = X.0oh.A05(r3, r6)
            int r0 = r0.intValue()
            if (r0 == r4) goto L_0x0646
            if (r0 == r2) goto L_0x0643
            java.lang.String r3 = "prism-bold"
        L_0x0633:
            X.IHn r9 = new X.IHn
            r9.<init>(r3)
            X.Hhc r7 = new X.Hhc
            r7.<init>(r1)
            X.Hnc r6 = new X.Hnc
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
        L_0x0643:
            java.lang.String r3 = "prism-medium"
            goto L_0x0633
        L_0x0646:
            java.lang.String r3 = "prism"
            goto L_0x0633
        L_0x0649:
            java.lang.Integer r8 = X.AnonymousClass05K.A00
            goto L_0x061f
        L_0x064c:
            java.lang.Integer r8 = X.AnonymousClass05K.A0N
            goto L_0x061f
        L_0x064f:
            android.content.res.Resources r0 = r6.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r1 = android.util.TypedValue.complexToDimension(r2, r0)
            android.content.res.Resources r0 = r6.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r10 = X.C54763HRv.A00(r0, r1)
            goto L_0x05ee
        L_0x0668:
            java.lang.Object r1 = r0.A03
            X.GvR r1 = (X.C53860GvR) r1
            X.HNN r3 = r1.A03
            if (r3 == 0) goto L_0x088a
            java.lang.Object r2 = r0.A02
            X.3Y5 r2 = (X.AnonymousClass3Y5) r2
            int r0 = r0.A01
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 0
            android.graphics.drawable.Drawable r6 = X.I61.A04(r2, r3, r0, r1)
            return r6
        L_0x0680:
            java.lang.Object r1 = r0.A03
            X.Gu3 r1 = (X.C53774Gu3) r1
            X.5ta r1 = r1.A00
            int r2 = r1.ordinal()
            r5 = 1
            r1 = 0
            if (r2 == r1) goto L_0x06b3
            if (r2 != r5) goto L_0x06ba
            java.lang.Object r4 = r0.A02
            X.3Y5 r4 = (X.AnonymousClass3Y5) r4
            r1 = 4633641066610819072(0x404e000000000000, double:60.0)
        L_0x0696:
            long r2 = java.lang.Double.doubleToRawLongBits(r1)
            X.2V4 r1 = r4.Bnf()
            int r1 = X.2Wd.A00(r1, r2)
            android.graphics.drawable.GradientDrawable r6 = new android.graphics.drawable.GradientDrawable
            r6.<init>()
            r6.setShape(r5)
            int r0 = r0.A01
            r6.setColor(r0)
            r6.setSize(r1, r1)
            return r6
        L_0x06b3:
            java.lang.Object r4 = r0.A02
            X.3Y5 r4 = (X.AnonymousClass3Y5) r4
            r1 = 4630826316843712512(0x4044000000000000, double:40.0)
            goto L_0x0696
        L_0x06ba:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x06c0:
            java.lang.Object r2 = r0.A03
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.Object r1 = r0.A02
            X.A91 r1 = (X.A91) r1
            int r0 = r0.A01
            X.AhC r6 = new X.AhC
            r6.<init>(r2, r1, r0)
            return r6
        L_0x06d0:
            java.lang.Object r2 = r0.A03
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.Object r1 = r0.A02
            android.content.Context r1 = (android.content.Context) r1
            int r0 = r0.A01
            X.WgJ r6 = new X.WgJ
            r6.<init>(r1, r2, r0)
            return r6
        L_0x06e0:
            java.lang.Object r2 = r0.A02
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r0.A03
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            int r0 = r0.A01
            X.WgK r6 = new X.WgK
            r6.<init>(r2, r1, r0)
            return r6
        L_0x06f0:
            java.lang.Object r2 = r0.A03
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.Object r1 = r0.A02
            X.A91 r1 = (X.A91) r1
            int r0 = r0.A01
            X.AhB r6 = new X.AhB
            r6.<init>(r2, r1, r0)
            return r6
        L_0x0700:
            java.lang.Object r1 = r0.A03
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.Object r0 = r0.A02
            X.X98 r0 = (X.X98) r0
            X.WXN r6 = new X.WXN
            r6.<init>(r1, r0)
            return r6
        L_0x070e:
            java.lang.Object r2 = r0.A02
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r0.A03
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            int r0 = r0.A01
            X.WgI r6 = new X.WgI
            r6.<init>(r2, r1, r0)
            return r6
        L_0x071e:
            java.lang.Object r3 = r0.A03
            X.9Wp r3 = (X.C380089Wp) r3
            android.content.Context r2 = r3.A0A
            int r1 = r3.A08
            X.6Ly r6 = new X.6Ly
            r6.<init>(r2, r1)
            java.lang.Object r1 = r0.A02
            com.instagram.music.common.model.MusicAssetModel r1 = (com.instagram.music.common.model.MusicAssetModel) r1
            int r2 = r0.A01
            r6.setCallback(r3)
            java.lang.String r0 = r1.A0I
            r6.A0M(r0)
            android.content.res.Resources r1 = r3.A0B
            r0 = 2131165231(0x7f07002f, float:1.7944673E38)
            int r0 = r1.getDimensionPixelSize(r0)
            float r0 = (float) r0
            r6.A0A(r0)
            int r0 = r3.A07
            if (r2 != r0) goto L_0x075a
            r0 = -1
        L_0x074b:
            r6.A0F(r0)
            android.graphics.Typeface r0 = android.graphics.Typeface.SANS_SERIF
            r1 = 1
            r6.A0J(r0, r1)
            java.lang.String r0 = "…"
            r6.A0G(r1, r0)
            return r6
        L_0x075a:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = X.0nH.A08(r2, r0)
            goto L_0x074b
        L_0x0761:
            java.lang.Object r3 = r0.A03
            X.9Wp r3 = (X.C380089Wp) r3
            android.content.Context r2 = r3.A0A
            int r1 = r3.A08
            X.6Ly r6 = new X.6Ly
            r6.<init>(r2, r1)
            java.lang.Object r1 = r0.A02
            com.instagram.music.common.model.MusicAssetModel r1 = (com.instagram.music.common.model.MusicAssetModel) r1
            int r2 = r0.A01
            r6.setCallback(r3)
            java.lang.String r0 = r1.A0D
            r6.A0M(r0)
            android.content.res.Resources r1 = r3.A0B
            r0 = 2131165231(0x7f07002f, float:1.7944673E38)
            int r0 = r1.getDimensionPixelSize(r0)
            float r0 = (float) r0
            r6.A0A(r0)
            int r0 = r3.A07
            if (r2 != r0) goto L_0x079e
            r0 = -1
        L_0x078e:
            r6.A0F(r0)
            android.graphics.Typeface r1 = android.graphics.Typeface.SANS_SERIF
            r0 = 0
            r6.A0J(r1, r0)
            java.lang.String r1 = "…"
            r0 = 1
            r6.A0G(r0, r1)
            return r6
        L_0x079e:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = X.0nH.A08(r2, r0)
            goto L_0x078e
        L_0x07a5:
            java.lang.Object r1 = r0.A03
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            android.view.View r2 = r1.requireView()
            int r1 = r0.A01
            android.view.View r6 = r2.findViewById(r1)
            java.lang.Object r0 = r0.A02
            X.0sP r0 = (X.0sP) r0
            X.0qQ.A0A(r6)
            r0.invoke(r6)
            return r6
        L_0x07be:
            java.lang.Object r2 = r0.A03
            com.instagram.pando.livetree.LiveTreeJNI r2 = (com.instagram.pando.livetree.LiveTreeJNI) r2
            int r1 = r0.A01
            java.lang.Object r0 = r0.A02
            java.lang.Class r0 = (java.lang.Class) r0
            com.facebook.pando.TreeJNI r6 = r2.getOptionalTreeValueNative(r1, r0)
            return r6
        L_0x07cd:
            java.lang.Object r2 = r0.A03
            com.instagram.pando.livetree.LiveTreeJNI r2 = (com.instagram.pando.livetree.LiveTreeJNI) r2
            int r1 = r0.A01
            java.lang.Object r0 = r0.A02
            java.lang.Class r0 = (java.lang.Class) r0
            java.util.List r6 = r2.getOptionalTreeListNative(r1, r0)
            return r6
        L_0x07dc:
            java.lang.String r3 = "Msys Debug Log "
            int r1 = r0.A01
            int r2 = r1 + 1
            java.lang.String r1 = ".txt"
            java.lang.String r3 = X.002.A0c(r3, r1, r2)
            java.lang.Object r2 = r0.A03
            r1 = 0
            X.0qQ.A0B(r2, r1)
            r4 = 1
            X.0qQ.A0B(r3, r4)
            java.io.File r6 = new java.io.File
            r6.<init>(r3)
            java.lang.String r1 = r6.getPath()
            X.0qQ.A07(r1)
            int r1 = X.C272144kC.A04(r1)
            if (r1 > 0) goto L_0x0830
            java.lang.String r3 = r2.toString()
            X.0qQ.A07(r3)
            int r1 = r3.length()
            if (r1 == 0) goto L_0x0838
            char r2 = java.io.File.separatorChar
            boolean r1 = X.00l.A0Y(r3, r2)
            if (r1 != 0) goto L_0x0838
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r2)
        L_0x0824:
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.io.File r6 = new java.io.File
            r6.<init>(r1)
        L_0x0830:
            java.lang.Object r0 = r0.A02
            java.io.File r0 = (java.io.File) r0
            X.AnonymousClass5Kg.A08(r0, r6, r4)
            return r6
        L_0x0838:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            goto L_0x0824
        L_0x0841:
            java.lang.Object r1 = r0.A03
            X.Q6K r1 = (X.Q6K) r1
            android.content.res.Resources r2 = r1.A01
            int r1 = r0.A01
            java.lang.Object r0 = r0.A02
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.CharSequence r6 = r2.getText(r1, r0)
            X.0qQ.A07(r6)
            return r6
        L_0x0855:
            java.lang.Object r1 = r0.A03
            X.0eM r1 = (X.AnonymousClass0eM) r1
            java.lang.Object r2 = r1.getValue()
            android.view.View r2 = (android.view.View) r2
            int r1 = r0.A01
            android.view.View r1 = r2.findViewById(r1)
            java.lang.Object r0 = r0.A02
            X.0sP r0 = (X.0sP) r0
            X.0qQ.A0A(r1)
            java.lang.Object r6 = r0.invoke(r1)
            return r6
        L_0x0871:
            java.lang.Object r2 = r0.A03
            com.instagram.pando.livetree.LiveTreeJNI r2 = (com.instagram.pando.livetree.LiveTreeJNI) r2
            int r1 = r0.A01
            java.lang.String r1 = r2.getOptionalStringValueNative(r1)
            if (r1 == 0) goto L_0x088a
            java.lang.Object r0 = r0.A02
            X.0sP r0 = (X.0sP) r0
            java.lang.Object r6 = r0.invoke(r1)
            return r6
        L_0x0886:
            X.0qQ.A0F(r4)
            goto L_0x088f
        L_0x088a:
            r6 = 0
            return r6
        L_0x088c:
            X.0qQ.A0F(r15)
        L_0x088f:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GL8.invoke():java.lang.Object");
    }
}
