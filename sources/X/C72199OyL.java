package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.OyL  reason: case insensitive filesystem */
public final class C72199OyL implements AnonymousClass0lh {
    public final UserSession A00;
    public final OBJ A01;
    public final HashSet A02 = AnonymousClass7TE.A1F();
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A01(new MMO(this, 0));
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A00(0eO.A02, new MMO(this, 1));
    public final AnonymousClass0eM A05 = AnonymousClass0eN.A01(new MMO(this, 2));
    public final AnonymousClass0eM A06 = AnonymousClass0eN.A01(new MMO(this, 3));

    public C72199OyL(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = new OBJ(userSession);
    }

    public static final boolean A01(C254703su r3) {
        String str;
        String str2 = null;
        if (r3 != null) {
            str = r3.A0l();
        } else {
            str = null;
        }
        if (!0qQ.A0K(str, "REPLY")) {
            if (r3 != null) {
                str2 = r3.A0l();
            }
            if (!0qQ.A0K(str2, "REACT")) {
                return false;
            }
        }
        if (0qQ.A0K(r3.A0n(), "NOTE") || 0qQ.A0K(r3.A0n(), "MEDIA_NOTE") || 0qQ.A0K(r3.A0n(), "STORY") || 0qQ.A0K(r3.A0n(), "STORY_HIGHLIGHT")) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01e6, code lost:
        if (r0.booleanValue() != false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        if (X.182.A06(r3, r4, r0) == false) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0087, code lost:
        if (X.C66582MXn.A0e(r7).AFJ(r3, r7) != false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r7.A2P != false) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f5, code lost:
        if ((java.lang.System.currentTimeMillis() - r10.A0C) > (r4 * 1000)) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x011d, code lost:
        r4 = r7.A10;
        r14 = X.OUd.A00;
        r0 = X.C3266377o.A01(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0125, code lost:
        if (r0 == null) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0127, code lost:
        r3 = r0.A0u;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0129, code lost:
        r0 = X.C3266377o.A01(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x012d, code lost:
        if (r0 == null) goto L_0x0154;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x012f, code lost:
        r1 = r0.A11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0131, code lost:
        r0 = X.C3266377o.A01(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0135, code lost:
        if (r0 == null) goto L_0x0139;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0137, code lost:
        r2 = r0.A0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0139, code lost:
        r7.A17(r4, r14.A00(r15, r9, r2, r3, r1));
        X.C66580MXl.A0e(r5).FKL(X.AnonymousClass7TE.A1I(r7), r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0153, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0154, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0156, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01c3, code lost:
        r0 = X.AnonymousClass7TF.A0R(r3, r4, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03(X.C254703su r21, java.lang.String r22) {
        /*
            r20 = this;
            r13 = 0
            r7 = r21
            boolean r0 = r7.A1T()
            r10 = 1
            if (r0 != 0) goto L_0x000f
            boolean r0 = r7.A2P
            r1 = 0
            if (r0 == 0) goto L_0x0010
        L_0x000f:
            r1 = 1
        L_0x0010:
            r8 = r20
            X.0eM r5 = r8.A05
            X.2Dm r0 = X.C66580MXl.A0e(r5)
            r6 = r22
            X.3U9 r0 = X.C66580MXl.A0d(r0, r6)
            r2 = 0
            if (r0 == 0) goto L_0x0211
            X.3Tu r0 = r0.AiM()
        L_0x0025:
            boolean r0 = X.C331057Pi.A02(r0)
            if (r1 != 0) goto L_0x0060
            if (r0 == 0) goto L_0x0060
            com.instagram.common.session.UserSession r4 = r8.A00
            X.0Tu r3 = X.0Tu.A05
            r0 = 36322809005222319(0x810b67000029af, double:3.0340289028902416E-306)
            boolean r12 = X.182.A06(r3, r4, r0)
            X.0eM r0 = r8.A06
            java.lang.Object r11 = r0.getValue()
            X.1Av r11 = (X.1Av) r11
            X.0s0 r9 = r11.A7r
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 510(0x1fe, float:7.15E-43)
            boolean r0 = X.AnonymousClass7TG.A1a(r11, r9, r1, r0)
            if (r0 != 0) goto L_0x00fe
            if (r12 == 0) goto L_0x00fe
        L_0x0050:
            return r13
        L_0x0051:
            X.Nl2 r0 = X.C69420Nl2.SHARE
            if (r9 != r0) goto L_0x011d
            r0 = 36322809006795207(0x810b67001829c7, double:3.0340289038849423E-306)
        L_0x005a:
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 == 0) goto L_0x011d
        L_0x0060:
            boolean r0 = r7.A1S()
            if (r0 == 0) goto L_0x0214
            java.lang.String r9 = r7.A0g()
            java.lang.String r0 = r7.A1o
            if (r9 == 0) goto L_0x0050
            if (r0 == 0) goto L_0x0050
            com.instagram.common.session.UserSession r3 = r8.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36327103972522155(0x810f4f000038ab, double:3.036745057505103E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x0097
            X.7Bu r0 = X.C66582MXn.A0e(r7)
            boolean r0 = r0.AFJ(r3, r7)
            if (r0 == 0) goto L_0x0050
        L_0x0089:
            r0 = 29
            X.N49 r1 = new X.N49
            r1.<init>(r6, r9, r0)
            java.util.HashSet r0 = r8.A02
            boolean r13 = r0.add(r1)
            return r13
        L_0x0097:
            X.3tC r10 = X.C3266377o.A01(r7)
            if (r10 == 0) goto L_0x0089
            com.instagram.model.mediasize.ExtendedImageUrl r1 = r10.A0X
            if (r1 == 0) goto L_0x0089
            X.7Bu r0 = X.C66582MXn.A0e(r7)
            boolean r0 = r0.AFJ(r3, r7)
            if (r0 == 0) goto L_0x0050
            boolean r0 = r10.A05()
            if (r0 != 0) goto L_0x0089
            java.lang.Long r0 = r1.B2i()
            if (r0 == 0) goto L_0x00c4
            long r11 = r0.longValue()
            long r4 = java.lang.System.currentTimeMillis()
            int r0 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x00c4
            goto L_0x0089
        L_0x00c4:
            java.lang.String r0 = r7.A0n()
            X.Nl3 r0 = X.C69421Nl3.A00(r0)
            X.0qQ.A07(r0)
            int r1 = r0.ordinal()
            r0 = 4
            if (r1 == r0) goto L_0x00f8
            r0 = 5
            if (r1 == r0) goto L_0x00f8
            r0 = 36608578949355231(0x820f4f000216df, double:3.214750966263098E-306)
        L_0x00de:
            long r4 = X.182.A01(r2, r3, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            X.0qQ.A0A(r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r0
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r10.A0C
            long r2 = r2 - r0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0050
            goto L_0x0089
        L_0x00f8:
            r0 = 36608578949420768(0x820f4f000316e0, double:3.214750966304544E-306)
            goto L_0x00de
        L_0x00fe:
            java.lang.String r0 = r7.A0n()
            X.Nl3 r15 = X.C69421Nl3.A00(r0)
            X.0qQ.A07(r15)
            java.lang.String r0 = r7.A0l()
            X.Nl2 r9 = X.C69420Nl2.A00(r0)
            X.0qQ.A07(r9)
            r11 = 4
            r12 = 2
            int r0 = r15.ordinal()
            switch(r0) {
                case 1: goto L_0x01ce;
                case 2: goto L_0x0158;
                case 3: goto L_0x01a0;
                case 4: goto L_0x0178;
                case 5: goto L_0x018c;
                case 6: goto L_0x01ab;
                case 7: goto L_0x01b6;
                case 8: goto L_0x0051;
                case 9: goto L_0x01fb;
                case 10: goto L_0x01f0;
                case 11: goto L_0x0158;
                case 12: goto L_0x0206;
                default: goto L_0x011d;
            }
        L_0x011d:
            X.2FW r4 = r7.A10
            X.OUd r14 = X.OUd.A00
            X.3tC r0 = X.C3266377o.A01(r7)
            if (r0 == 0) goto L_0x0156
            java.lang.String r3 = r0.A0u
        L_0x0129:
            X.3tC r0 = X.C3266377o.A01(r7)
            if (r0 == 0) goto L_0x0154
            java.lang.String r1 = r0.A11
        L_0x0131:
            X.3tC r0 = X.C3266377o.A01(r7)
            if (r0 == 0) goto L_0x0139
            java.lang.Integer r2 = r0.A0f
        L_0x0139:
            r19 = r1
            r16 = r9
            r17 = r2
            r18 = r3
            java.util.List r0 = r14.A00(r15, r16, r17, r18, r19)
            r7.A17(r4, r0)
            X.2Dm r1 = X.C66580MXl.A0e(r5)
            java.util.List r0 = X.AnonymousClass7TE.A1I(r7)
            r1.FKL(r0, r6)
            return r13
        L_0x0154:
            r1 = r2
            goto L_0x0131
        L_0x0156:
            r3 = r2
            goto L_0x0129
        L_0x0158:
            int r1 = r9.ordinal()
            if (r1 == r11) goto L_0x0172
            if (r1 == r10) goto L_0x016c
            r0 = 3
            if (r1 == r0) goto L_0x0166
            if (r1 == r12) goto L_0x0166
            goto L_0x011d
        L_0x0166:
            r0 = 36322809005943226(0x810b67000b29ba, double:3.034028903346146E-306)
            goto L_0x01c3
        L_0x016c:
            r0 = 36322809005287856(0x810b67000129b0, double:3.0340289029316875E-306)
            goto L_0x01c3
        L_0x0172:
            r0 = 36322809005877689(0x810b67000a29b9, double:3.0340289033047E-306)
            goto L_0x01c3
        L_0x0178:
            int r0 = r9.ordinal()
            if (r0 == r11) goto L_0x0186
            if (r0 != r10) goto L_0x011d
            r0 = 36322809006074300(0x810b67000d29bc, double:3.034028903429038E-306)
            goto L_0x01c3
        L_0x0186:
            r0 = 36322809005615541(0x810b67000629b5, double:3.034028903138917E-306)
            goto L_0x01c3
        L_0x018c:
            int r0 = r9.ordinal()
            if (r0 == r11) goto L_0x019a
            if (r0 != r10) goto L_0x011d
            r0 = 36322809006008763(0x810b67000c29bb, double:3.034028903387592E-306)
            goto L_0x01c3
        L_0x019a:
            r0 = 36322809005550004(0x810b67000529b4, double:3.034028903097471E-306)
            goto L_0x01c3
        L_0x01a0:
            X.Nl2 r0 = X.C69420Nl2.SHARE
            if (r9 != r0) goto L_0x011d
            r0 = 36322809005353393(0x810b67000229b1, double:3.0340289029731334E-306)
            goto L_0x005a
        L_0x01ab:
            X.Nl2 r0 = X.C69420Nl2.SHARE
            if (r9 != r0) goto L_0x011d
            r0 = 36322809005812152(0x810b67000929b8, double:3.0340289032632544E-306)
            goto L_0x005a
        L_0x01b6:
            int r0 = r9.ordinal()
            if (r0 == r11) goto L_0x01c8
            if (r0 != r10) goto L_0x011d
            r0 = 36322809006467522(0x810b67001329c2, double:3.034028903677713E-306)
        L_0x01c3:
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0R(r3, r4, r0)
            goto L_0x01e2
        L_0x01c8:
            r0 = 36322809005418930(0x810b67000329b2, double:3.034028903014579E-306)
            goto L_0x01c3
        L_0x01ce:
            int r0 = r9.ordinal()
            if (r0 == r11) goto L_0x01ea
            if (r0 != r12) goto L_0x011d
            r0 = 36322809005681078(0x810b67000729b6, double:3.0340289031803627E-306)
        L_0x01db:
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0R(r3, r4, r0)
            X.0qQ.A0A(r0)
        L_0x01e2:
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0060
            goto L_0x011d
        L_0x01ea:
            r0 = 36322809006860744(0x810b67001929c8, double:3.034028903926388E-306)
            goto L_0x01db
        L_0x01f0:
            X.Nl2 r0 = X.C69420Nl2.REPLY
            if (r9 != r0) goto L_0x011d
            r0 = 36322809006270911(0x810b67001029bf, double:3.0340289035533754E-306)
            goto L_0x005a
        L_0x01fb:
            X.Nl2 r0 = X.C69420Nl2.SHARE
            if (r9 != r0) goto L_0x011d
            r0 = 36322809005746615(0x810b67000829b7, double:3.0340289032218085E-306)
            goto L_0x005a
        L_0x0206:
            X.Nl2 r0 = X.C69420Nl2.REPLY
            if (r9 != r0) goto L_0x011d
            r0 = 36322809006729670(0x810b67001729c6, double:3.0340289038434965E-306)
            goto L_0x005a
        L_0x0211:
            r0 = r2
            goto L_0x0025
        L_0x0214:
            java.lang.IllegalStateException r0 = X.DbT.A0m()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72199OyL.A03(X.3su, java.lang.String):boolean");
    }

    public final void onSessionWillEnd() {
        this.A02.clear();
    }

    /* JADX WARNING: type inference failed for: r0v12, types: [X.1qK, java.lang.Object] */
    public static final void A00(C72199OyL oyL, String str, List list, List list2, Map map) {
        C242373Tu r4;
        if (!list2.isEmpty()) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            Iterator it = list.iterator();
            while (true) {
                r4 = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Iterator it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next2 = it2.next();
                    if (0qQ.A0K(C66580MXl.A0y(next2), next)) {
                        if (next2 != null) {
                            A1C.add(next2);
                        }
                    }
                }
            }
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            UserSession userSession = oyL.A00;
            long A012 = 182.A01(0Tu.A06, userSession, 36600306843258708L);
            ArrayList A1C3 = AnonymousClass7TE.A1C();
            ArrayList A1C4 = AnonymousClass7TE.A1C();
            C370748x0.A00();
            C72199OyL oyL2 = (C72199OyL) userSession.A01(C72199OyL.class, new C73661Pha(userSession, 49));
            Iterator it3 = A1C.iterator();
            while (it3.hasNext()) {
                C254703su A0a = C66580MXl.A0a(it3);
                String str2 = A0a.A1o;
                if (str2 != null && str2.length() != 0 && A0a.A1S() && oyL2.A03(A0a, str)) {
                    AnonymousClass7OQ.A05(A0a, A1C4, A1C3, A1C2, (int) A012);
                }
            }
            if (DbT.A1b(A1C3)) {
                AnonymousClass7TF.A1I(AnonymousClass7OQ.A00(A1C3), A1C4, A1C2);
            }
            if (DbT.A1b(A1C2)) {
                AnonymousClass3U9 A0d = C66580MXl.A0d(C66580MXl.A0e(oyL.A05), str);
                if (A0d != null) {
                    r4 = A0d.AiM();
                }
                if (!C331057Pi.A01(userSession, r4)) {
                    ((1Ng) oyL.A03.getValue()).A00(new Object());
                }
            }
            oyL.A02(str, A1C2, map, 0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003a, code lost:
        if (X.C66581MXm.A05(X.C66580MXl.A17(r3.A1o)) != -506811066) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0065, code lost:
        if (X.182.A06(X.0Tu.A05, r7.A00, 36322809006336448L) != false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0067, code lost:
        r8.add(r9);
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0313  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x01d9 A[EDGE_INSN: B:131:0x01d9->B:68:0x01d9 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x02ac  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02b1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(java.lang.String r52, java.util.List r53, java.util.Map r54, int r55) {
        /*
            r51 = this;
            java.util.Iterator r18 = r53.iterator()
        L_0x0004:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x0368
            X.0eP r6 = X.JTO.A1A(r18)
            java.lang.Object r4 = r6.A01
            java.util.List r4 = (java.util.List) r4
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r10 = r4.iterator()
        L_0x001e:
            boolean r0 = r10.hasNext()
            r7 = r51
            if (r0 == 0) goto L_0x007b
            java.lang.Object r9 = r10.next()
            r3 = r9
            X.3su r3 = (X.C254703su) r3
            java.lang.String r0 = r3.A1o     // Catch:{ JSONException -> 0x003d }
            org.json.JSONObject r0 = X.C66580MXl.A17(r0)     // Catch:{ JSONException -> 0x003d }
            int r1 = X.C66581MXm.A05(r0)
            r0 = -506811066(0xffffffffe1caad46, float:-4.67341E20)
            if (r1 == r0) goto L_0x0067
            goto L_0x0049
        L_0x003d:
            r2 = move-exception
            java.lang.String r1 = "ArmadilloExpressReceiverFetchRepository"
            r0 = 230(0xe6, float:3.22E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0KC.A0G(r1, r0, r2)
        L_0x0049:
            java.lang.String r0 = r3.A1o     // Catch:{ JSONException -> 0x006b }
            org.json.JSONObject r0 = X.C66580MXl.A17(r0)     // Catch:{ JSONException -> 0x006b }
            int r1 = X.C66581MXm.A05(r0)
            r0 = 727135314(0x2b573452, float:7.6455953E-13)
            if (r1 != r0) goto L_0x0077
            com.instagram.common.session.UserSession r3 = r7.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322809006336448(0x810b67001129c0, double:3.034028903594821E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0077
        L_0x0067:
            r8.add(r9)
            goto L_0x001e
        L_0x006b:
            r2 = move-exception
            java.lang.String r1 = "ArmadilloExpressReceiverFetchRepository"
            r0 = 230(0xe6, float:3.22E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0KC.A0G(r1, r0, r2)
        L_0x0077:
            r5.add(r9)
            goto L_0x001e
        L_0x007b:
            boolean r1 = X.DbT.A1b(r8)
            r0 = r52
            r50 = r54
            r19 = r55
            if (r1 == 0) goto L_0x00ec
            if (r55 <= 0) goto L_0x00ec
            com.instagram.common.session.UserSession r9 = r7.A00
            X.0Tu r3 = X.0Tu.A05
            r1 = 36322809006139837(0x810b67000e29bd, double:3.034028903470484E-306)
            boolean r1 = X.182.A06(r3, r9, r1)
            if (r1 == 0) goto L_0x00ec
            java.util.Iterator r9 = r8.iterator()
        L_0x009c:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x00b9
            java.lang.Object r2 = r9.next()
            java.util.HashSet r4 = r7.A02
            r1 = 11
            X.PqZ r3 = new X.PqZ
            r3.<init>(r2, r1)
            r2 = 0
            X.Pcv r1 = new X.Pcv
            r1.<init>(r3, r2)
            r4.removeIf(r1)
            goto L_0x009c
        L_0x00b9:
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r8)
            java.util.Iterator r2 = r8.iterator()
        L_0x00c1:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x00d7
            X.3su r1 = X.C66580MXl.A0a(r2)
            java.lang.String r1 = r1.A0g()
            if (r1 != 0) goto L_0x00d3
            java.lang.String r1 = ""
        L_0x00d3:
            r3.add(r1)
            goto L_0x00c1
        L_0x00d7:
            java.util.ArrayList r2 = X.00k.A0U(r3)
            r1 = r50
            A00(r7, r0, r2, r8, r1)
            boolean r1 = X.DbT.A1b(r5)
            if (r1 == 0) goto L_0x0004
            java.lang.Object r2 = r6.A00
            X.N1l r2 = (X.C68123N1l) r2
            r4 = r5
            goto L_0x00f0
        L_0x00ec:
            java.lang.Object r2 = r6.A00
            X.N1l r2 = (X.C68123N1l) r2
        L_0x00f0:
            X.0eM r1 = r7.A04
            java.lang.Object r9 = r1.getValue()
            X.ODQ r9 = (X.ODQ) r9
            if (r9 == 0) goto L_0x018b
            boolean r17 = X.AnonymousClass7TF.A1R(r19)
            long r33 = java.lang.System.currentTimeMillis()
            java.util.Iterator r16 = r4.iterator()
        L_0x0106:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x018b
            X.3su r8 = X.C66580MXl.A0a(r16)
            if (r17 == 0) goto L_0x0141
            java.lang.String r26 = r8.A0g()
            r21 = 0
            java.lang.String r3 = r8.A1o
            java.lang.String r30 = r8.A0l()
            X.N3J r1 = new X.N3J
            r22 = r21
            r23 = r21
            r24 = r21
            r25 = r21
            r27 = r21
            r28 = r21
            r29 = r3
            r31 = r21
            r32 = r21
            r20 = r1
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
        L_0x0137:
            r8.A0o = r1
            if (r1 == 0) goto L_0x0106
            X.0eM r1 = r9.A02
            r1.getValue()
            goto L_0x0106
        L_0x0141:
            X.N3J r1 = r8.A0o
            if (r1 == 0) goto L_0x0189
            java.lang.Long r38 = java.lang.Long.valueOf(r33)
            java.lang.String r3 = r1.A0A
            r23 = r3
            long r5 = r1.A00
            java.lang.Long r3 = r1.A02
            r22 = r3
            java.lang.Long r3 = r1.A01
            r21 = r3
            java.lang.Long r3 = r1.A04
            r20 = r3
            java.lang.Long r15 = r1.A03
            java.lang.String r14 = r1.A08
            java.lang.String r13 = r1.A0B
            java.lang.String r12 = r1.A09
            java.lang.String r11 = r1.A06
            java.lang.String r10 = r1.A07
            java.lang.String r3 = r1.A0C
            X.N3J r1 = new X.N3J
            r35 = r1
            r36 = r22
            r37 = r21
            r39 = r20
            r40 = r15
            r41 = r23
            r42 = r14
            r43 = r13
            r44 = r12
            r45 = r11
            r46 = r10
            r47 = r3
            r48 = r5
            r35.<init>(r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)
            goto L_0x0137
        L_0x0189:
            r1 = 0
            goto L_0x0137
        L_0x018b:
            X.OBJ r6 = r7.A01
            boolean r15 = X.AnonymousClass7TF.A1R(r19)
            X.OTc r10 = new X.OTc
            r11 = r7
            r12 = r0
            r13 = r4
            r14 = r50
            r10.<init>(r11, r12, r13, r14, r15)
            r3 = 0
            X.0qQ.A0B(r2, r3)
            r9 = 0
            X.1a8 r5 = new X.1a8
            r5.<init>(r9)
            boolean r1 = X.AnonymousClass7TE.A1b(r4)
            if (r1 == 0) goto L_0x02ac
            java.lang.Object r1 = r4.get(r3)
            X.3su r1 = (X.C254703su) r1
            boolean r14 = r1.A1T()
        L_0x01b5:
            X.0eM r1 = r6.A01
            X.2Dm r1 = X.C66580MXl.A0e(r1)
            X.3U9 r0 = X.C66580MXl.A0d(r1, r0)
            if (r0 == 0) goto L_0x02a9
            X.3Tu r0 = r0.AiM()
        L_0x01c5:
            boolean r15 = X.C331057Pi.A02(r0)
            com.instagram.common.session.UserSession r6 = r6.A00
            boolean r17 = X.C331057Pi.A01(r6, r0)
            boolean r0 = r4 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0288
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0288
        L_0x01d9:
            r8 = 0
        L_0x01da:
            X.0Tu r7 = X.0Tu.A05
            r0 = 36318831867599345(0x8107c9002019f1, double:3.031513745042825E-306)
            boolean r0 = X.182.A06(r7, r6, r0)
            boolean r16 = X.C51970G9q.A1U(r0)
            if (r8 == 0) goto L_0x0233
            X.0Tu r7 = X.0Tu.A06
            r0 = 36322809006401985(0x810b67001229c1, double:3.034028903636267E-306)
            boolean r0 = X.182.A06(r7, r6, r0)
            if (r0 != 0) goto L_0x0233
            r0 = r9
        L_0x01f9:
            r1 = 28
            X.Ay7 r7 = new X.Ay7
            r7.<init>(r6, r1)
            java.lang.Class<X.UIS> r1 = X.UIS.class
            java.lang.Object r8 = r6.A01(r1, r7)
            r1 = 16
            X.Phg r7 = new X.Phg
            r7.<init>(r1, r8, r6)
            java.lang.Class<X.OYi> r1 = X.C71010OYi.class
            java.lang.Object r6 = r6.A01(r1, r7)
            X.OYi r6 = (X.C71010OYi) r6
            X.61K r11 = X.AnonymousClass61K.ARMADILLO_EXPRESS_RECEIVER_FETCH
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r4 = r4.iterator()
        L_0x021f:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x02af
            X.3su r1 = X.C66580MXl.A0a(r4)
            java.lang.String r1 = r1.A0g()
            if (r1 == 0) goto L_0x021f
            r8.add(r1)
            goto L_0x021f
        L_0x0233:
            X.02m r12 = X.C51965G9l.A0l()
            X.2SP r0 = X.2SP.A01
            int r13 = r0.A03()
            r1 = 1
            r7 = 15000(0x3a98, double:7.411E-320)
            X.OMq r0 = new X.OMq
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17)
            X.02m r13 = r0.A01
            int r12 = r0.A00
            r11 = 20132336(0x13331f0, float:3.2912936E-38)
            r13.A0S(r11, r12, r7)
            java.lang.String r8 = "hummingbird"
            r7 = r19
            r13.markerAnnotate(r11, r12, r8, r7)
            java.lang.String r7 = "is_open_test"
            r13.markerAnnotate(r11, r12, r7, r3)
            java.lang.String r7 = "is_batched"
            r13.markerAnnotate(r11, r12, r7, r1)
            r1 = 1521(0x5f1, float:2.131E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r13.markerAnnotate(r11, r12, r1, r3)
            boolean r7 = r0.A02
            java.lang.String r1 = "is_disappearing_message"
            r13.markerAnnotate(r11, r12, r1, r7)
            boolean r7 = r0.A04
            java.lang.String r1 = "is_instamadillo_cutover"
            r13.markerAnnotate(r11, r12, r1, r7)
            boolean r7 = r0.A03
            java.lang.String r1 = "is_graphql"
            r13.markerAnnotate(r11, r12, r1, r7)
            boolean r7 = r0.A05
            java.lang.String r1 = "is_ttlc"
            r13.markerAnnotate(r11, r12, r1, r7)
            goto L_0x01f9
        L_0x0288:
            java.util.Iterator r7 = r4.iterator()
        L_0x028c:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x01d9
            X.3su r1 = X.C66580MXl.A0a(r7)
            boolean r0 = r1.A1S()
            if (r0 == 0) goto L_0x028c
            boolean r0 = r1.A1T()
            if (r0 != 0) goto L_0x028c
            boolean r0 = r1.A2P
            if (r0 != 0) goto L_0x028c
            r8 = 1
            goto L_0x01da
        L_0x02a9:
            r0 = r9
            goto L_0x01c5
        L_0x02ac:
            r14 = 0
            goto L_0x01b5
        L_0x02af:
            if (r16 == 0) goto L_0x0313
            com.google.common.collect.ImmutableList$Builder r4 = new com.google.common.collect.ImmutableList$Builder
            r4.<init>()
            com.google.common.collect.ImmutableList$Builder r7 = new com.google.common.collect.ImmutableList$Builder
            r7.<init>()
            java.lang.Class<X.N1k> r8 = X.C68122N1k.class
            java.lang.String r1 = "args"
            com.google.common.collect.ImmutableList r1 = r2.A02(r1, r8)
            X.3kO r11 = X.C66580MXl.A0J(r1)
        L_0x02c7:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x0332
            java.lang.Object r1 = r11.next()
            X.3FZ r1 = (X.AnonymousClass3FZ) r1
            org.json.JSONObject r8 = r1.A00
            java.lang.String r1 = "message_id"
            java.lang.String r1 = r8.optString(r1)
            r4.add(r1)
            java.lang.Class<X.N1j> r2 = X.C68121N1j.class
            r1 = 3311(0xcef, float:4.64E-42)
            java.lang.String r1 = X.C273654mx.A00(r1)
            org.json.JSONObject r8 = r8.optJSONObject(r1)
            if (r8 != 0) goto L_0x02fc
            r1 = r9
        L_0x02ed:
            java.lang.String r2 = "null cannot be cast to non-null type com.facebook.messaging.dataclasses.xmareceiverfetch.IgXmaReceiverFetchParamsImpl.ServerContentRef"
            X.0qQ.A0C(r1, r2)
            org.json.JSONObject r1 = r1.A00
            java.lang.String r1 = r1.toString()
            r7.add(r1)
            goto L_0x02c7
        L_0x02fc:
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            java.lang.Class[] r1 = new java.lang.Class[]{r1}     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0311 }
            java.lang.reflect.Constructor r2 = r2.getConstructor(r1)     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0311 }
            java.lang.Object[] r1 = new java.lang.Object[]{r8}     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0311 }
            java.lang.Object r1 = r2.newInstance(r1)     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0311 }
            X.3FZ r1 = (X.AnonymousClass3FZ) r1     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0311 }
            goto L_0x02ed
        L_0x0311:
            r1 = r9
            goto L_0x02ed
        L_0x0313:
            X.MYc r1 = X.C66594MYg.A03
            com.instagram.common.session.UserSession r7 = r6.A00
            X.MYg r1 = r1.A02(r7, r11)
            X.MYb r6 = r1.A01
            X.1aU r4 = r6.A07
            X.OvK r1 = new X.OvK
            r11 = r1
            r12 = r2
            r13 = r7
            r14 = r6
            r15 = r0
            r16 = r8
            r17 = r19
            r11.<init>(r12, r13, r14, r15, r16, r17)
            X.1aU r1 = r4.A0M(r1)
            goto L_0x035e
        L_0x0332:
            com.google.common.collect.ImmutableList r21 = r7.build()
            com.instagram.common.session.UserSession r1 = r6.A00
            java.lang.String r25 = X.C70106NxM.A00(r1)
            android.content.Context r2 = X.C60960kU.A00
            X.0qQ.A07(r2)
            boolean r1 = X.2Aj.A02(r1)
            java.lang.String r26 = X.0kS.A02(r2, r1)
            com.google.common.collect.ImmutableList r24 = r4.build()
            r28 = 1
            X.WSv r20 = new X.WSv
            r27 = r19
            r22 = r6
            r23 = r0
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28)
            X.1aU r1 = X.1aU.A06(r20)
        L_0x035e:
            X.PU9 r0 = new X.PU9
            r0.<init>(r3, r10, r5)
            r5.A02(r1, r0)
            goto L_0x0004
        L_0x0368:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72199OyL.A02(java.lang.String, java.util.List, java.util.Map, int):void");
    }
}
