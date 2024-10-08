package X;

/* renamed from: X.PhT  reason: case insensitive filesystem */
public final class C73654PhT extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73654PhT(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0308, code lost:
        if (r1 == 6) goto L_0x03c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x033a, code lost:
        if (r1.optInt("calling_tags") != 2) goto L_0x03c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x036a, code lost:
        if (r1.equals("null") == false) goto L_0x03c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0381, code lost:
        if (r0.size() > 1) goto L_0x03c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x03bf, code lost:
        if (r1.A0N.getValue() != null) goto L_0x03c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03c1, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x03e1, code lost:
        return java.lang.Boolean.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x03e2, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x019c, code lost:
        if (r1.A01() == 0) goto L_0x03c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01da, code lost:
        r2.A0O(r2.A02, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01e1, code lost:
        return X.C60340gF.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x013f;
                case 1: goto L_0x0142;
                case 2: goto L_0x0149;
                case 3: goto L_0x0150;
                case 4: goto L_0x0168;
                case 5: goto L_0x0185;
                case 6: goto L_0x018e;
                case 7: goto L_0x01a0;
                case 8: goto L_0x01a7;
                case 9: goto L_0x01b9;
                case 10: goto L_0x01c9;
                case 11: goto L_0x01d4;
                case 12: goto L_0x01e2;
                case 13: goto L_0x0013;
                case 14: goto L_0x01ec;
                case 15: goto L_0x01fe;
                case 16: goto L_0x0226;
                case 17: goto L_0x0231;
                case 18: goto L_0x0243;
                case 19: goto L_0x0037;
                case 20: goto L_0x0255;
                case 21: goto L_0x0279;
                case 22: goto L_0x02b0;
                case 23: goto L_0x004e;
                case 24: goto L_0x008b;
                case 25: goto L_0x02e1;
                case 26: goto L_0x031a;
                case 27: goto L_0x033e;
                case 28: goto L_0x0389;
                case 29: goto L_0x03ac;
                case 30: goto L_0x03c3;
                case 31: goto L_0x00a9;
                case 32: goto L_0x00c7;
                case 33: goto L_0x03e4;
                case 34: goto L_0x00e5;
                case 35: goto L_0x03ef;
                case 36: goto L_0x00fb;
                case 37: goto L_0x011d;
                case 38: goto L_0x03fa;
                case 39: goto L_0x0420;
                case 40: goto L_0x042a;
                case 41: goto L_0x043c;
                case 42: goto L_0x044e;
                case 43: goto L_0x0460;
                case 44: goto L_0x0472;
                case 45: goto L_0x0484;
                case 46: goto L_0x0496;
                case 47: goto L_0x04a8;
                case 48: goto L_0x04ba;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r5.A01
            X.Kcs r0 = (X.C62258Kcs) r0
            android.widget.RelativeLayout r1 = r0.A02
            r0 = 2131437466(0x7f0b279a, float:1.8496831E38)
            X.3oV r2 = X.C66581MXm.A0T(r1, r0)
        L_0x0012:
            return r2
        L_0x0013:
            java.lang.Object r0 = r5.A01
            X.OcE r0 = (X.C71092OcE) r0
            X.0eM r0 = r0.A05
            java.lang.Object r1 = r0.getValue()
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            r2 = 0
            if (r1 == 0) goto L_0x0035
            r0 = 5006(0x138e, float:7.015E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r1 = r1.optString(r0)
        L_0x002c:
            java.lang.String r0 = "null"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0012
            return r1
        L_0x0035:
            r1 = r2
            goto L_0x002c
        L_0x0037:
            java.lang.Object r0 = r5.A01
            X.OcE r0 = (X.C71092OcE) r0
            X.JwL r0 = r0.A00
            java.lang.Object r1 = r0.A00
            com.facebook.hyperthrift.HyperThriftBase r1 = (com.facebook.hyperthrift.HyperThriftBase) r1
            r0 = 8
            java.lang.Object r2 = r1.A00(r0)
            if (r2 != 0) goto L_0x0012
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x004e:
            java.lang.Object r0 = r5.A01
            X.OcE r0 = (X.C71092OcE) r0
            X.0eM r0 = r0.A0M
            java.lang.Object r1 = r0.getValue()
            com.facebook.hyperthrift.HyperThriftBase r1 = (com.facebook.hyperthrift.HyperThriftBase) r1
            r0 = 5
            java.lang.Object r0 = r1.A00(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x04ca
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r0.iterator()
        L_0x006b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0012
            java.lang.Object r1 = r3.next()
            com.facebook.hyperthrift.HyperThriftBase r1 = (com.facebook.hyperthrift.HyperThriftBase) r1
            r0 = 2
            java.lang.Object r1 = r1.A00(r0)
            com.facebook.hyperthrift.HyperThriftBase r1 = (com.facebook.hyperthrift.HyperThriftBase) r1
            if (r1 == 0) goto L_0x006b
            r0 = 0
            java.lang.Object r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x006b
            r2.add(r0)
            goto L_0x006b
        L_0x008b:
            java.lang.Object r1 = r5.A01
            X.OcE r1 = (X.C71092OcE) r1
            X.0eM r0 = r1.A0H
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            r2 = 0
            if (r0 == 0) goto L_0x0012
            X.0eM r0 = r1.A0L
            java.lang.Object r1 = r0.getValue()
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            if (r1 == 0) goto L_0x0012
            java.lang.String r0 = "group_name"
            java.lang.String r2 = r1.optString(r0)
            return r2
        L_0x00a9:
            java.lang.Object r1 = r5.A01
            X.OcE r1 = (X.C71092OcE) r1
            X.0eM r0 = r1.A0H
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            r2 = 0
            if (r0 == 0) goto L_0x0012
            X.0eM r0 = r1.A0L
            java.lang.Object r1 = r0.getValue()
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            if (r1 == 0) goto L_0x0012
            java.lang.String r0 = "msgr_thread_id"
            java.lang.String r2 = r1.optString(r0)
            return r2
        L_0x00c7:
            java.lang.Object r1 = r5.A01
            X.OcE r1 = (X.C71092OcE) r1
            X.0eM r0 = r1.A0H
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            r2 = 0
            if (r0 == 0) goto L_0x0012
            X.0eM r0 = r1.A0L
            java.lang.Object r1 = r0.getValue()
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            if (r1 == 0) goto L_0x0012
            java.lang.String r0 = "participant_usernames"
            java.lang.String r2 = r1.optString(r0)
            return r2
        L_0x00e5:
            java.lang.Object r0 = r5.A01
            X.OcE r0 = (X.C71092OcE) r0
            X.JwL r0 = r0.A00
            java.lang.Object r1 = r0.A00
            com.facebook.hyperthrift.HyperThriftBase r1 = (com.facebook.hyperthrift.HyperThriftBase) r1
            r0 = 6
            java.lang.Object r2 = r1.A00(r0)
            if (r2 != 0) goto L_0x0012
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x00fb:
            java.lang.Object r1 = r5.A01
            X.OcE r1 = (X.C71092OcE) r1
            X.0eM r0 = r1.A0H
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            r2 = 0
            if (r0 == 0) goto L_0x0012
            X.0eM r0 = r1.A0N
            java.lang.Object r1 = r0.getValue()
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            if (r1 == 0) goto L_0x0012
            r0 = 3898(0xf3a, float:5.462E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r2 = r1.getString(r0)
            return r2
        L_0x011d:
            java.lang.Object r1 = r5.A01
            X.OcE r1 = (X.C71092OcE) r1
            X.0eM r0 = r1.A0H
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            r2 = 0
            if (r0 == 0) goto L_0x0012
            X.0eM r0 = r1.A0N
            java.lang.Object r1 = r0.getValue()
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            if (r1 == 0) goto L_0x0012
            r0 = 3502(0xdae, float:4.907E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r2 = r1.getString(r0)
            return r2
        L_0x013f:
            java.lang.Object r2 = r5.A01
            return r2
        L_0x0142:
            java.lang.Object r0 = r5.A01
            java.lang.Object r2 = X.DbT.A0r(r0)
            return r2
        L_0x0149:
            java.lang.Object r0 = r5.A01
            X.07f r2 = X.DbY.A0I(r0)
            return r2
        L_0x0150:
            java.lang.Object r2 = r5.A01
            X.E6D r2 = (X.E6D) r2
            X.0eM r0 = r2.A05
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r2.A01
            java.lang.Object r0 = r0.getValue()
            X.JwH r0 = (X.C61079JwH) r0
            X.ExA r2 = new X.ExA
            r2.<init>(r0, r1)
            return r2
        L_0x0168:
            java.lang.Object r1 = r5.A01
            X.E6D r1 = (X.E6D) r1
            android.app.Application r4 = X.DbY.A05(r1)
            X.0eM r0 = r1.A05
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r1.A01
            java.lang.Object r1 = r0.getValue()
            X.JwH r1 = (X.C61079JwH) r1
            r0 = 0
            X.Dla r2 = new X.Dla
            r2.<init>(r4, r1, r3, r0)
            return r2
        L_0x0185:
            java.lang.Object r1 = r5.A01
            X.5Oz r1 = (X.C284945Oz) r1
            r0 = 0
            r1.Epw(r0)
            goto L_0x01df
        L_0x018e:
            java.lang.Object r1 = r5.A01
            androidx.compose.foundation.lazy.LazyListState r1 = (androidx.compose.foundation.lazy.LazyListState) r1
            int r0 = r1.A00()
            if (r0 != 0) goto L_0x03e2
            int r0 = r1.A01()
            if (r0 != 0) goto L_0x03e2
            goto L_0x03c1
        L_0x01a0:
            java.lang.Object r0 = r5.A01
            X.07f r2 = X.C51971G9r.A0U(r0)
            return r2
        L_0x01a7:
            java.lang.Object r0 = r5.A01
            X.E4f r0 = (X.C47480E4f) r0
            android.content.Context r1 = r0.requireContext()
            com.instagram.common.session.UserSession r0 = r0.A05()
            X.EF8 r2 = new X.EF8
            r2.<init>(r1, r0)
            return r2
        L_0x01b9:
            java.lang.Object r1 = r5.A01
            X.2Lk r1 = (X.2Lk) r1
            com.facebook.common.callercontext.CallerContext r0 = X.2Lk.A08
            android.content.Context r1 = r1.A01
            X.PiB r0 = X.C73688PiB.A00
            X.OTq r2 = new X.OTq
            r2.<init>(r1, r0)
            return r2
        L_0x01c9:
            java.lang.Object r2 = r5.A01
            X.18g r2 = (X.18g) r2
            r0 = 4347(0x10fb, float:6.091E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            goto L_0x01da
        L_0x01d4:
            java.lang.Object r2 = r5.A01
            X.18g r2 = (X.18g) r2
            java.lang.String r1 = "CACHED_FEED_END"
        L_0x01da:
            com.facebook.quicklog.LightweightQuickPerformanceLogger r0 = r2.A02
            r2.A0O(r0, r1)
        L_0x01df:
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x01e2:
            java.lang.Object r0 = r5.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.Ml0 r2 = new X.Ml0
            r2.<init>(r0)
            return r2
        L_0x01ec:
            java.lang.Object r0 = r5.A01
            X.OcE r0 = (X.C71092OcE) r0
            X.0eM r0 = r0.A0M
            java.lang.Object r1 = r0.getValue()
            com.facebook.hyperthrift.HyperThriftBase r1 = (com.facebook.hyperthrift.HyperThriftBase) r1
            r0 = 0
            java.lang.Object r2 = r1.A00(r0)
            return r2
        L_0x01fe:
            java.lang.Object r1 = r5.A01
            X.OcE r1 = (X.C71092OcE) r1
            X.0eM r0 = r1.A0H
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 == 0) goto L_0x021f
            X.0eM r0 = r1.A0L
            java.lang.Object r1 = r0.getValue()
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            if (r1 == 0) goto L_0x0417
            r0 = 47
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r2 = r1.getString(r0)
            return r2
        L_0x021f:
            java.lang.String r0 = "threadDisplayName"
            java.lang.String r2 = X.C71092OcE.A00(r1, r0)
            return r2
        L_0x0226:
            java.lang.Object r1 = r5.A01
            X.OcE r1 = (X.C71092OcE) r1
            java.lang.String r0 = "collision_context_payload"
            org.json.JSONObject r2 = X.C71092OcE.A02(r1, r0)
            return r2
        L_0x0231:
            java.lang.Object r0 = r5.A01
            X.OcE r0 = (X.C71092OcE) r0
            X.0eM r0 = r0.A08
            java.lang.Object r1 = r0.getValue()
            com.facebook.hyperthrift.HyperThriftBase r1 = (com.facebook.hyperthrift.HyperThriftBase) r1
            r0 = 1
            java.lang.Object r2 = r1.A00(r0)
            return r2
        L_0x0243:
            java.lang.Object r0 = r5.A01
            X.OcE r0 = (X.C71092OcE) r0
            X.0eM r0 = r0.A08
            java.lang.Object r1 = r0.getValue()
            com.facebook.hyperthrift.HyperThriftBase r1 = (com.facebook.hyperthrift.HyperThriftBase) r1
            r0 = 0
            java.lang.Object r2 = r1.A00(r0)
            return r2
        L_0x0255:
            java.lang.Object r1 = r5.A01
            X.OcE r1 = (X.C71092OcE) r1
            X.0eM r0 = r1.A0H
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 == 0) goto L_0x0272
            X.0eM r0 = r1.A0L
            java.lang.Object r1 = r0.getValue()
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            if (r1 == 0) goto L_0x0417
            java.lang.String r0 = "display_uri"
            java.lang.String r2 = r1.getString(r0)
            return r2
        L_0x0272:
            java.lang.String r0 = "avatar_url"
            java.lang.String r2 = X.C71092OcE.A00(r1, r0)
            return r2
        L_0x0279:
            java.lang.Object r2 = r5.A01
            X.OcE r2 = (X.C71092OcE) r2
            X.0eM r0 = r2.A0M
            java.lang.Object r1 = r0.getValue()
            com.facebook.hyperthrift.HyperThriftBase r1 = (com.facebook.hyperthrift.HyperThriftBase) r1
            r0 = 12
            java.lang.Object r1 = r1.A00(r0)
            com.facebook.hyperthrift.HyperThriftBase r1 = (com.facebook.hyperthrift.HyperThriftBase) r1
            if (r1 == 0) goto L_0x02ad
            r0 = 0
            java.lang.Object r0 = r1.A00(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            r1 = 2
            if (r0 == 0) goto L_0x02ad
            int r0 = r0.intValue()
            if (r0 != r1) goto L_0x02ad
            X.0eM r0 = r2.A0G
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 == 0) goto L_0x02aa
            X.Nid r2 = X.C69277Nid.GVC_E2EE
            return r2
        L_0x02aa:
            X.Nid r2 = X.C69277Nid.P2P_E2EE
            return r2
        L_0x02ad:
            X.Nid r2 = X.C69277Nid.NO_E2EE
            return r2
        L_0x02b0:
            java.lang.Object r0 = r5.A01
            X.OcE r0 = (X.C71092OcE) r0
            X.0eM r0 = r0.A0M
            java.lang.Object r1 = r0.getValue()
            com.facebook.hyperthrift.HyperThriftBase r1 = (com.facebook.hyperthrift.HyperThriftBase) r1
            r0 = 12
            java.lang.Object r0 = r1.A00(r0)
            com.facebook.hyperthrift.HyperThriftBase r0 = (com.facebook.hyperthrift.HyperThriftBase) r0
            if (r0 == 0) goto L_0x02de
            r2 = 2
            java.lang.Object r0 = r0.A00(r2)
            java.lang.Number r0 = (java.lang.Number) r0
            r1 = 1
            if (r0 == 0) goto L_0x02de
            int r0 = r0.intValue()
            if (r0 != r1) goto L_0x02d9
            X.Nie r2 = X.C69278Nie.CONTROL
            return r2
        L_0x02d9:
            if (r0 != r2) goto L_0x02de
            X.Nie r2 = X.C69278Nie.TEST
            return r2
        L_0x02de:
            X.Nie r2 = X.C69278Nie.NOT_SET
            return r2
        L_0x02e1:
            java.lang.Object r1 = r5.A01
            X.OcE r1 = (X.C71092OcE) r1
            X.0eM r0 = r1.A0H
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            r3 = 0
            if (r0 == 0) goto L_0x030c
            X.0eM r0 = r1.A0M
            java.lang.Object r0 = r0.getValue()
            com.facebook.hyperthrift.HyperThriftBase r0 = (com.facebook.hyperthrift.HyperThriftBase) r0
            r2 = 2
            java.lang.Object r0 = r0.A00(r2)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x03dd
            int r1 = r0.intValue()
            if (r1 == 0) goto L_0x03c1
            if (r1 == r2) goto L_0x03c1
            r0 = 6
            if (r1 != r0) goto L_0x03dd
            goto L_0x03c1
        L_0x030c:
            java.lang.String r0 = "is_audio_call"
            java.lang.String r0 = X.C71092OcE.A00(r1, r0)
            if (r0 == 0) goto L_0x03dd
            boolean r3 = java.lang.Boolean.parseBoolean(r0)
            goto L_0x03dd
        L_0x031a:
            java.lang.Object r2 = r5.A01
            X.OcE r2 = (X.C71092OcE) r2
            X.0eM r0 = r2.A0A
            java.lang.Object r1 = r0.getValue()
            X.Nid r0 = X.C69277Nid.NO_E2EE
            r3 = 0
            if (r1 == r0) goto L_0x03dd
            X.0eM r0 = r2.A05
            java.lang.Object r1 = r0.getValue()
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            if (r1 == 0) goto L_0x03c1
            java.lang.String r0 = "calling_tags"
            int r1 = r1.optInt(r0)
            r0 = 2
            if (r1 == r0) goto L_0x03dd
            goto L_0x03c1
        L_0x033e:
            java.lang.Object r2 = r5.A01
            X.OcE r2 = (X.C71092OcE) r2
            X.0eM r0 = r2.A0H
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            r3 = 0
            r1 = 1
            if (r0 == 0) goto L_0x036d
            X.0eM r0 = r2.A05
            java.lang.Object r1 = r0.getValue()
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            if (r1 == 0) goto L_0x03dd
            java.lang.String r0 = "group_thread_id"
            java.lang.String r1 = r1.optString(r0)
            if (r1 == 0) goto L_0x03dd
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x03dd
            java.lang.String r0 = "null"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x03dd
            goto L_0x03c1
        L_0x036d:
            X.0eM r0 = r2.A0M
            java.lang.Object r0 = r0.getValue()
            com.facebook.hyperthrift.HyperThriftBase r0 = (com.facebook.hyperthrift.HyperThriftBase) r0
            java.lang.Object r0 = r0.A00(r1)
            java.util.Set r0 = (java.util.Set) r0
            if (r0 == 0) goto L_0x0384
            int r0 = r0.size()
            if (r0 <= r1) goto L_0x03dd
            goto L_0x03c1
        L_0x0384:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0389:
            java.lang.Object r0 = r5.A01
            X.OcE r0 = (X.C71092OcE) r0
            X.JwL r0 = r0.A00
            java.lang.Object r0 = r0.A01
            com.facebook.hyperthrift.HyperThriftBase r0 = (com.facebook.hyperthrift.HyperThriftBase) r0
            r2 = 1
            java.lang.Object r1 = r0.A00(r2)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x03a7
            java.lang.String r0 = "ROOM:"
            boolean r0 = X.C66580MXl.A1a(r0, r2, r1)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            return r2
        L_0x03a7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x03ac:
            java.lang.Object r1 = r5.A01
            X.OcE r1 = (X.C71092OcE) r1
            X.0eM r0 = r1.A0H
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            r3 = 0
            if (r0 == 0) goto L_0x03dd
            X.0eM r0 = r1.A0N
            java.lang.Object r0 = r0.getValue()
            if (r0 == 0) goto L_0x03dd
        L_0x03c1:
            r3 = 1
            goto L_0x03dd
        L_0x03c3:
            java.lang.Object r0 = r5.A01
            X.OcE r0 = (X.C71092OcE) r0
            X.0eM r0 = r0.A0M
            java.lang.Object r1 = r0.getValue()
            com.facebook.hyperthrift.HyperThriftBase r1 = (com.facebook.hyperthrift.HyperThriftBase) r1
            r0 = 14
            java.lang.Object r0 = r1.A00(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x03e2
            boolean r3 = r0.booleanValue()
        L_0x03dd:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
            return r2
        L_0x03e2:
            r3 = 0
            goto L_0x03dd
        L_0x03e4:
            java.lang.Object r1 = r5.A01
            X.OcE r1 = (X.C71092OcE) r1
            java.lang.String r0 = "ring_data"
            org.json.JSONObject r2 = X.C71092OcE.A02(r1, r0)
            return r2
        L_0x03ef:
            java.lang.Object r1 = r5.A01
            X.OcE r1 = (X.C71092OcE) r1
            java.lang.String r0 = "room_metadata"
            org.json.JSONObject r2 = X.C71092OcE.A02(r1, r0)
            return r2
        L_0x03fa:
            java.lang.Object r1 = r5.A01
            X.OcE r1 = (X.C71092OcE) r1
            X.0eM r0 = r1.A0H
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 == 0) goto L_0x0419
            X.0eM r0 = r1.A0L
            java.lang.Object r1 = r0.getValue()
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            if (r1 == 0) goto L_0x0417
            java.lang.String r0 = "ig_thread_id"
            java.lang.String r2 = r1.getString(r0)
            return r2
        L_0x0417:
            r2 = 0
            return r2
        L_0x0419:
            java.lang.String r0 = "threadId"
            java.lang.String r2 = X.C71092OcE.A00(r1, r0)
            return r2
        L_0x0420:
            java.lang.Object r0 = r5.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.9Ta r2 = new X.9Ta
            r2.<init>(r0)
            return r2
        L_0x042a:
            java.lang.Object r0 = r5.A01
            X.OYt r0 = (X.C71018OYt) r0
            X.0eM r0 = r0.A0B
            android.view.View r1 = X.AnonymousClass7TH.A06(r0)
            r0 = 2131434308(0x7f0b1b44, float:1.8490426E38)
            android.view.View r2 = r1.requireViewById(r0)
            return r2
        L_0x043c:
            java.lang.Object r0 = r5.A01
            X.OYt r0 = (X.C71018OYt) r0
            X.0eM r0 = r0.A0B
            android.view.View r1 = X.AnonymousClass7TH.A06(r0)
            r0 = 2131434417(0x7f0b1bb1, float:1.8490647E38)
            android.view.View r2 = r1.requireViewById(r0)
            return r2
        L_0x044e:
            java.lang.Object r0 = r5.A01
            X.OYt r0 = (X.C71018OYt) r0
            X.0eM r0 = r0.A0B
            android.view.View r1 = X.AnonymousClass7TH.A06(r0)
            r0 = 2131434418(0x7f0b1bb2, float:1.849065E38)
            android.view.View r2 = r1.requireViewById(r0)
            return r2
        L_0x0460:
            java.lang.Object r0 = r5.A01
            X.OYt r0 = (X.C71018OYt) r0
            X.0eM r0 = r0.A0B
            android.view.View r1 = X.AnonymousClass7TH.A06(r0)
            r0 = 2131434421(0x7f0b1bb5, float:1.8490655E38)
            android.view.View r2 = r1.requireViewById(r0)
            return r2
        L_0x0472:
            java.lang.Object r0 = r5.A01
            X.OYt r0 = (X.C71018OYt) r0
            X.0eM r0 = r0.A0B
            android.view.View r1 = X.AnonymousClass7TH.A06(r0)
            r0 = 2131434400(0x7f0b1ba0, float:1.8490613E38)
            android.view.View r2 = r1.requireViewById(r0)
            return r2
        L_0x0484:
            java.lang.Object r0 = r5.A01
            X.OYt r0 = (X.C71018OYt) r0
            X.0eM r0 = r0.A0B
            android.view.View r1 = X.AnonymousClass7TH.A06(r0)
            r0 = 2131434402(0x7f0b1ba2, float:1.8490617E38)
            android.view.View r2 = r1.requireViewById(r0)
            return r2
        L_0x0496:
            java.lang.Object r0 = r5.A01
            X.OYt r0 = (X.C71018OYt) r0
            X.0eM r0 = r0.A0B
            android.view.View r1 = X.AnonymousClass7TH.A06(r0)
            r0 = 2131434403(0x7f0b1ba3, float:1.8490619E38)
            android.view.View r2 = r1.requireViewById(r0)
            return r2
        L_0x04a8:
            java.lang.Object r0 = r5.A01
            X.OYt r0 = (X.C71018OYt) r0
            X.0eM r0 = r0.A0B
            android.view.View r1 = X.AnonymousClass7TH.A06(r0)
            r0 = 2131434431(0x7f0b1bbf, float:1.8490676E38)
            android.view.View r2 = r1.requireViewById(r0)
            return r2
        L_0x04ba:
            java.lang.Object r0 = r5.A01
            android.content.Context r0 = (android.content.Context) r0
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            r0 = 2131626823(0x7f0e0b47, float:1.8880893E38)
            android.view.View r2 = X.DbU.A08(r1, r0)
            return r2
        L_0x04ca:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73654PhT.invoke():java.lang.Object");
    }
}
