package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.92f  reason: invalid class name */
public final class AnonymousClass92f implements AnonymousClass0lh {
    public static final C3727492g A0B = new C3727492g(TimeUnit.MINUTES.toMillis(720), false, false, true);
    public final long A00;
    public final UserSession A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final 1wn A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public AnonymousClass92f(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        0Tu r3 = 0Tu.A05;
        this.A07 = 182.A06(r3, userSession, 36328216370166866L);
        this.A04 = 182.A06(r3, userSession, 36316388029370665L);
        this.A05 = 182.A06(r3, userSession, 36317951397205688L);
        this.A03 = 182.A06(r3, userSession, 36316388029960495L);
        this.A08 = 182.A06(r3, userSession, 36316388029829421L);
        this.A0A = 182.A06(r3, userSession, 36316388029894958L);
        this.A02 = !182.A06(r3, userSession, 36325274316780342L);
        this.A00 = TimeUnit.MILLISECONDS.toSeconds(182.A01(r3, userSession, 36609691346933656L));
        this.A09 = C278764xU.A00(userSession);
        C3727592h r2 = new C3727592h(this);
        this.A06 = r2;
        AnonymousClass1Nd.A00(userSession).A01(r2, C2370936h.class);
    }

    public final void A09(String str) {
        C3727792j r0;
        0qQ.A0B(str, 0);
        if (this.A05) {
            r0 = C3727792j.GRAPHQL_PROFILE_FEED;
        } else {
            r0 = C3727792j.PROFILE_FEED;
        }
        1P1.A00(this.A01).A09(C3727392e.A01(r0, str));
    }

    public final boolean A0A(1P0 r12, AnonymousClass4D6 r13, C3727792j r14, String str) {
        0qQ.A0B(str, 1);
        0qQ.A0B(r13, 3);
        String A012 = C3727392e.A01(r14, str);
        if (1P1.A00(this.A01).A05(r12, r13, A012, TimeUnit.MINUTES.toSeconds(720), false, true) != AnonymousClass05K.A0C) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005d, code lost:
        if (r2 == false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009b, code lost:
        if ((java.lang.System.currentTimeMillis() - r7) > java.util.concurrent.TimeUnit.SECONDS.toMillis(r1)) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0050, code lost:
        if (r3 == -1) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0B(X.C3727792j r11, java.lang.String r12) {
        /*
            r10 = this;
            r0 = 0
            X.0qQ.A0B(r12, r0)
            r4 = 1
            X.0qQ.A0B(r11, r4)
            java.lang.String r5 = X.C3727392e.A01(r11, r12)
            com.instagram.common.session.UserSession r3 = r10.A01
            X.92j r0 = X.C3727792j.GRAPHQL_PROFILE_FEED
            if (r11 != r0) goto L_0x0065
            X.0Tu r2 = X.0Tu.A06
            r0 = 36317951397533371(0x8106fc000516bb, double:3.030956932227735E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0065
            X.A94 r8 = X.C63008Kpy.A00(r3)
            X.92g r1 = A0B
            r0 = 0
            X.0qQ.A0B(r5, r0)
            X.0qQ.A0B(r1, r4)
            java.util.Map r0 = r8.A04
            r0.get(r5)
            java.util.Map r0 = r8.A05
            java.lang.Object r0 = r0.get(r5)
            X.1XU r0 = (X.1XU) r0
            r9 = 0
            if (r0 == 0) goto L_0x0063
            long r3 = r1.A00
            long r6 = android.os.SystemClock.uptimeMillis()
            long r0 = r0.AjP()
            long r6 = r6 - r0
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0052
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r2 = 0
            if (r0 != 0) goto L_0x0053
        L_0x0052:
            r2 = 1
        L_0x0053:
            java.util.Map r0 = r8.A03
            java.lang.Object r1 = r0.get(r5)
            r0 = 0
            if (r1 == 0) goto L_0x005d
            r0 = 1
        L_0x005d:
            if (r2 != 0) goto L_0x0061
        L_0x005f:
            if (r0 == 0) goto L_0x0062
        L_0x0061:
            r9 = 1
        L_0x0062:
            return r9
        L_0x0063:
            r2 = 0
            goto L_0x0053
        L_0x0065:
            X.1P2 r6 = X.1P1.A00(r3)
            r0 = 0
            X.0qQ.A0B(r5, r0)
            java.util.Map r0 = r6.A00
            boolean r1 = r0.containsKey(r5)
            java.lang.Long r0 = r6.A07(r5)
            r9 = 0
            if (r0 == 0) goto L_0x00a1
            long r7 = r0.longValue()
            if (r1 == 0) goto L_0x009e
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MINUTES
            r0 = 720(0x2d0, double:3.557E-321)
            long r1 = r2.toSeconds(r0)
        L_0x0088:
            r3 = -1
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0061
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r7
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            long r1 = r0.toMillis(r1)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00a1
            goto L_0x0061
        L_0x009e:
            long r1 = r10.A00
            goto L_0x0088
        L_0x00a1:
            boolean r0 = r6.A0A(r5)
            goto L_0x005f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass92f.A0B(X.92j, java.lang.String):boolean");
    }

    private final String A00(String str) {
        1vn A012 = 1vm.A01(this.A01);
        C50175FSh A002 = C49063Eoh.A00();
        A002.A00(str);
        1Ef build = A002.build();
        0qQ.A07(build);
        boolean z = this.A03;
        if (z) {
            build.addAdditionalHttpHeader("x_RESPONSE_SHAPE_LOGGING", String.valueOf(build.hashCode()));
        }
        boolean z2 = this.A08;
        if (z2) {
            build.setEnsureCacheWrite(true);
            build.setNetworkTimeoutSeconds(4);
        } else if (this.A0A) {
            build.setCacheFallbackByDuration_EXPERIMENTAL(4000);
        }
        build.addTrackedHttpResponseHeader(AnonymousClass000.A00(63));
        A06(AnonymousClass9D0.A00(A012.A03(build)), this, str, z2);
        if (z) {
            return String.valueOf(build.hashCode());
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        if (r15.A04 != false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0054, code lost:
        if (X.182.A06(X.0Tu.A05, r3, 36329187032121198L) == false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0065, code lost:
        if (X.182.A06(X.0Tu.A05, r3, 36329187031727976L) == false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006a, code lost:
        if (r0 == false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009b, code lost:
        r4 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009f, code lost:
        if (r15.A03 == false) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a1, code lost:
        r0 = A00(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a5, code lost:
        if (r0 == null) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a7, code lost:
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a8, code lost:
        r5 = new X.1NY(r3, -2);
        r5.A08(X.AnonymousClass05K.A0N);
        r5.A0O((X.15p) null, X.C3727892k.class, X.C3727992l.class, false);
        r1 = X.C273654mx.A00(423);
        r5.A0A(r1);
        r5.A9m(com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, r2);
        r5.A0F("x_RESPONSE_SHAPE_LOGGING", r4);
        r5.A0A = r1;
        r5.A07(X.AnonymousClass05K.A0Y);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d6, code lost:
        if (r19 != false) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d8, code lost:
        r5.A0H("is_profile_prefetch", X.182.A06(X.0Tu.A05, r3, 36330101860024785L));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e8, code lost:
        r8 = r5.A0M();
        r4 = X.1P1.A00(r3);
        r10 = X.C3727392e.A01(X.C3727792j.USER_INFO, r2);
        X.0qQ.A0B(r10, 0);
        X.1P2.A00(r4, X.AnonymousClass93P.A00, (X.1P0) null, (X.1P0) null, r8, (X.1OC) null, r10, r15.A00, r15.A02, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0104, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r7 != false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A01(android.content.Context r16, X.C3727792j r17, java.lang.String r18, boolean r19, boolean r20) {
        /*
            r15 = this;
            com.instagram.common.session.UserSession r3 = r15.A01
            java.lang.String r0 = r3.A06
            r2 = r18
            boolean r7 = X.0qQ.A0K(r0, r2)
            r4 = r16
            if (r17 != 0) goto L_0x0075
            boolean r0 = r15.A05
            if (r0 == 0) goto L_0x0044
            X.Dbr r0 = new X.Dbr
            r0.<init>(r2)
            r15.A02(r4, r0)
        L_0x001a:
            if (r7 == 0) goto L_0x003c
        L_0x001c:
            if (r20 == 0) goto L_0x003c
            X.0Tu r5 = X.0Tu.A05
            r0 = 36329187032055661(0x81113400063f6d, double:3.0380623927419E-306)
            boolean r0 = X.182.A06(r5, r3, r0)
            if (r0 != 0) goto L_0x002e
            r15.A04(r4, r2)
        L_0x002e:
            r0 = 36329187032186735(0x81113400083f6f, double:3.0380623928247915E-306)
            boolean r0 = X.182.A06(r5, r3, r0)
            if (r0 != 0) goto L_0x003c
            r15.A07(r2)
        L_0x003c:
            boolean r0 = r15.A04
            if (r0 == 0) goto L_0x009b
        L_0x0040:
            r15.A00(r2)
        L_0x0043:
            return
        L_0x0044:
            if (r7 == 0) goto L_0x006c
            if (r20 == 0) goto L_0x0056
            X.0Tu r5 = X.0Tu.A05
            r0 = 36329187032121198(0x81113400073f6e, double:3.0380623927833456E-306)
            boolean r0 = X.182.A06(r5, r3, r0)
            r6 = 1
            if (r0 != 0) goto L_0x0057
        L_0x0056:
            r6 = 0
        L_0x0057:
            if (r19 == 0) goto L_0x0067
            X.0Tu r5 = X.0Tu.A05
            r0 = 36329187031727976(0x81113400013f68, double:3.0380623925346704E-306)
            boolean r1 = X.182.A06(r5, r3, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0068
        L_0x0067:
            r0 = 0
        L_0x0068:
            if (r6 != 0) goto L_0x001c
            if (r0 != 0) goto L_0x001c
        L_0x006c:
            X.Dbr r0 = new X.Dbr
            r0.<init>(r2)
            r15.A03(r4, r0)
            goto L_0x001a
        L_0x0075:
            int r0 = r17.ordinal()
            switch(r0) {
                case 0: goto L_0x007d;
                case 1: goto L_0x008a;
                case 2: goto L_0x0097;
                case 3: goto L_0x0105;
                case 4: goto L_0x010b;
                case 5: goto L_0x010f;
                default: goto L_0x007c;
            }
        L_0x007c:
            return
        L_0x007d:
            boolean r0 = r15.A05
            if (r0 != 0) goto L_0x0043
            X.Dbr r0 = new X.Dbr
            r0.<init>(r2)
            r15.A03(r4, r0)
            return
        L_0x008a:
            boolean r0 = r15.A05
            if (r0 == 0) goto L_0x0043
            X.Dbr r0 = new X.Dbr
            r0.<init>(r2)
            r15.A02(r4, r0)
            return
        L_0x0097:
            boolean r0 = r15.A04
            if (r0 != 0) goto L_0x0043
        L_0x009b:
            boolean r0 = r15.A03
            java.lang.String r4 = ""
            if (r0 == 0) goto L_0x00a8
            java.lang.String r0 = r15.A00(r2)
            if (r0 == 0) goto L_0x00a8
            r4 = r0
        L_0x00a8:
            r6 = 0
            r0 = -2
            X.1NY r5 = new X.1NY
            r5.<init>(r3, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r5.A08(r0)
            java.lang.Class<X.92k> r1 = X.C3727892k.class
            java.lang.Class<X.92l> r0 = X.C3727992l.class
            r14 = 0
            r5.A0O(r6, r1, r0, r14)
            r0 = 423(0x1a7, float:5.93E-43)
            java.lang.String r1 = X.C273654mx.A00(r0)
            r5.A0A(r1)
            java.lang.String r0 = "user_id"
            r5.A9m(r0, r2)
            java.lang.String r0 = "x_RESPONSE_SHAPE_LOGGING"
            r5.A0F(r0, r4)
            r5.A0A = r1
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            r5.A07(r0)
            if (r19 != 0) goto L_0x00e8
            X.0Tu r4 = X.0Tu.A05
            r0 = 36330101860024785(0x811209000541d1, double:3.0386409336332903E-306)
            boolean r1 = X.182.A06(r4, r3, r0)
            java.lang.String r0 = "is_profile_prefetch"
            r5.A0H(r0, r1)
        L_0x00e8:
            X.1OC r8 = r5.A0M()
            X.1P2 r4 = X.1P1.A00(r3)
            X.92j r0 = X.C3727792j.USER_INFO
            java.lang.String r10 = X.C3727392e.A01(r0, r2)
            X.0qQ.A0B(r10, r14)
            X.93P r5 = X.AnonymousClass93P.A00
            long r11 = r15.A00
            boolean r13 = r15.A02
            r7 = r6
            r9 = r6
            X.1P2.A00(r4, r5, r6, r7, r8, r9, r10, r11, r13, r14)
            return
        L_0x0105:
            boolean r0 = r15.A04
            if (r0 == 0) goto L_0x0043
            goto L_0x0040
        L_0x010b:
            r15.A04(r4, r2)
            return
        L_0x010f:
            r15.A07(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass92f.A01(android.content.Context, X.92j, java.lang.String, boolean, boolean):void");
    }

    private final void A02(Context context, C46323Dbr dbr) {
        Integer num;
        Throwable illegalStateException;
        String str = dbr.A00;
        UserSession userSession = this.A01;
        boolean A0K = 0qQ.A0K(userSession.A06, str);
        1vn A012 = 1vm.A01(userSession);
        0Tu r6 = 0Tu.A05;
        if (182.A06(r6, userSession, 36317951397861055L)) {
            num = AnonymousClass05K.A0N;
        } else {
            num = AnonymousClass05K.A0C;
        }
        1Ef A013 = AnonymousClass94C.A01(userSession, num, str, (String) null, (String) null, (String) null, false, false, false, false, false, false, this.A09, false, false);
        1OC A002 = AnonymousClass9D0.A00(A012.A03(A013));
        Context context2 = context;
        EBF ebf = new EBF(new AnonymousClass94E(context2, this, A0K), this);
        AnonymousClass94E r3 = new AnonymousClass94E(context2, this, A0K);
        if (182.A06(r6, userSession, 36317951397533371L)) {
            A94 A003 = C63008Kpy.A00(userSession);
            String A014 = C3727392e.A01(C3727792j.GRAPHQL_PROFILE_FEED, str);
            2IR ftn = new FTN(r3, this);
            C3727492g r62 = A0B;
            G4S g4s = new G4S(this, 15);
            0qQ.A0B(A014, 0);
            0qQ.A0B(r62, 4);
            AWX awx = new AWX(ftn, A003, r3, A014, g4s);
            if (A013.getMaxToleratedCacheAgeMs() <= 0 && !A013.getEnsureCacheWrite()) {
                illegalStateException = new IllegalArgumentException("Prefetch Request must be cacheable.");
            } else if (A003.A00.A00(1B2.A0G)) {
                illegalStateException = new IllegalStateException("Prefetch cannot run during peak hours");
            } else {
                A003.A00(A013, ftn, r62, r3, A014, g4s);
                return;
            }
            awx.onFailure(illegalStateException);
            return;
        }
        A05(ebf, A002, C3727792j.GRAPHQL_PROFILE_FEED, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0026, code lost:
        if (X.182.A06(r2, r6, 36330101859697100L) != false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A03(android.content.Context r18, X.C46323Dbr r19) {
        /*
            r17 = this;
            r8 = r19
            java.lang.String r3 = r8.A00
            r4 = r17
            com.instagram.common.session.UserSession r6 = r4.A01
            java.lang.String r0 = r6.A06
            boolean r5 = X.0qQ.A0K(r0, r3)
            r13 = 0
            X.0Tu r2 = X.0Tu.A05
            r0 = 36324737449668937(0x810d28003f3149, double:3.0352484589235054E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 != 0) goto L_0x0028
            r0 = 36330101859697100(0x811209000041cc, double:3.038640933426061E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            r15 = 0
            if (r0 == 0) goto L_0x0029
        L_0x0028:
            r15 = 1
        L_0x0029:
            boolean r14 = r4.A09
            r7 = 0
            r12 = 1
            r9 = r7
            r10 = r7
            r11 = r7
            r16 = r13
            X.1OC r2 = X.AnonymousClass94B.A01(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.94E r1 = new X.94E
            r0 = r18
            r1.<init>(r0, r4, r5)
            X.92j r0 = X.C3727792j.PROFILE_FEED
            r4.A05(r1, r2, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass92f.A03(android.content.Context, X.Dbr):void");
    }

    private final void A04(Context context, String str) {
        UserSession userSession = this.A01;
        String str2 = str;
        AnonymousClass4Z5 A052 = AnonymousClass738.A05(context, userSession, (Boolean) null, (Boolean) null, (Boolean) null, AnonymousClass05K.A0Y, (Integer) null, str2, true);
        1P2 A002 = 1P1.A00(userSession);
        String A012 = C3727392e.A01(C3727792j.STORY_HIGHLIGHTS, str2);
        0qQ.A0B(A012, 0);
        AnonymousClass93P r5 = AnonymousClass93P.A00;
        1OC r8 = A052.A00;
        0qQ.A0B(r8, 0);
        1P2.A00(A002, r5, (1P0) null, (1P0) null, r8, (1OC) null, A012, this.A00, this.A02, false);
    }

    private final void A05(1P0 r12, 1OC r13, C3727792j r14, String str) {
        1P2 A002 = 1P1.A00(this.A01);
        String A012 = C3727392e.A01(r14, str);
        0qQ.A0B(A012, 0);
        1P2.A00(A002, AnonymousClass93P.A00, (1P0) null, r12, r13, (1OC) null, A012, this.A00, this.A02, false);
    }

    public static final void A06(1OC r12, AnonymousClass92f r13, String str, boolean z) {
        1P2 A002 = 1P1.A00(r13.A01);
        String A012 = C3727392e.A01(C3727792j.GRAPHQL_USER_INFO, str);
        0qQ.A0B(A012, 0);
        1P2.A00(A002, AnonymousClass93P.A00, (1P0) null, new C385309ij(r13, str, z), r12, (1OC) null, A012, r13.A00, r13.A02, false);
    }

    private final void A07(String str) {
        UserSession userSession = this.A01;
        if (182.A06(0Tu.A05, userSession, 36328216370297939L)) {
            1OC A002 = 1OP.A00(userSession, str);
            0qQ.A07(A002);
            1P2 A003 = 1P1.A00(userSession);
            String A012 = C3727392e.A01(C3727792j.USER_STORY, str);
            0qQ.A0B(A012, 0);
            1P2.A00(A003, AnonymousClass93P.A00, (1P0) null, (1P0) null, A002, (1OC) null, A012, this.A00, this.A02, false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b5, code lost:
        if (X.182.A06(X.0Tu.A05, r4, 36323887042145872L) != false) goto L_0x00b7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(android.content.Context r22, java.lang.String r23, boolean r24, boolean r25) {
        /*
            r21 = this;
            r13 = r25
            r5 = 0
            r9 = r22
            X.0qQ.A0B(r9, r5)
            r2 = 1
            r11 = r23
            X.0qQ.A0B(r11, r2)
            r8 = r21
            boolean r0 = r8.A07
            r12 = r24
            if (r0 == 0) goto L_0x0059
            boolean r6 = r8.A05
            boolean r4 = r8.A04
            java.util.HashSet r0 = X.C3727692i.A00(r6, r4)
            java.util.Iterator r7 = r0.iterator()
        L_0x0022:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0080
            java.lang.Object r10 = r7.next()
            X.92j r10 = (X.C3727792j) r10
            r3 = 1
            if (r10 == 0) goto L_0x003d
            boolean r0 = r8.A0B(r10, r11)
            r3 = r0 ^ 1
        L_0x0037:
            if (r3 == 0) goto L_0x0022
            r8.A01(r9, r10, r11, r12, r13)
            goto L_0x0022
        L_0x003d:
            java.util.HashSet r0 = X.C3727692i.A00(r6, r4)
            java.util.Iterator r1 = r0.iterator()
        L_0x0045:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0037
            java.lang.Object r0 = r1.next()
            X.92j r0 = (X.C3727792j) r0
            boolean r0 = r8.A0B(r0, r11)
            if (r0 == 0) goto L_0x0045
            r3 = 0
            goto L_0x0045
        L_0x0059:
            r10 = 0
            r3 = 1
            boolean r1 = r8.A05
            boolean r0 = r8.A04
            java.util.HashSet r0 = X.C3727692i.A00(r1, r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0067:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x007b
            java.lang.Object r0 = r1.next()
            X.92j r0 = (X.C3727792j) r0
            boolean r0 = r8.A0B(r0, r11)
            if (r0 == 0) goto L_0x0067
            r3 = 0
            goto L_0x0067
        L_0x007b:
            if (r3 == 0) goto L_0x0080
            r8.A01(r9, r10, r11, r12, r13)
        L_0x0080:
            com.instagram.common.session.UserSession r4 = r8.A01
            java.lang.String r0 = r4.A06
            boolean r1 = X.0qQ.A0K(r0, r11)
            X.0t1 r0 = X.0eE.A00(r4)
            com.instagram.user.model.User r6 = r0.A00()
            boolean r0 = r6.A2L()
            if (r1 == 0) goto L_0x00cc
            if (r0 != 0) goto L_0x00b7
            java.lang.Integer r3 = r6.A0N()
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r1 = 0
            if (r3 != r0) goto L_0x00a2
            r1 = 1
        L_0x00a2:
            boolean r0 = r6.A2L()
            if (r1 != 0) goto L_0x00cc
            if (r0 != 0) goto L_0x00cc
            X.0Tu r3 = X.0Tu.A05
            r0 = 36323887042145872(0x810c6200022e50, double:3.034710657781603E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 == 0) goto L_0x00cc
        L_0x00b7:
            java.util.HashMap r18 = X.C375949Fw.A01(r5)
            long r19 = X.C375949Fw.A00()
            X.8dD r15 = new X.8dD
            r15.<init>(r4)
            java.lang.String r16 = "com.bloks.www.ig.pro_dash.entry_point.hypercard"
            r17 = 0
            r14 = r9
            X.C359638dF.A03(r14, r15, r16, r17, r18, r19)
        L_0x00cc:
            X.0Tu r3 = X.0Tu.A05
            r0 = 36330780464530189(0x8112a70000430d, double:3.039070085855029E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 != 0) goto L_0x00e2
            r0 = 2342168283530277683(0x20810da500023333, double:4.070058053292665E-152)
            boolean r13 = X.182.A06(r3, r4, r0)
        L_0x00e2:
            if (r13 == 0) goto L_0x00f6
            X.0t1 r0 = X.0eE.A00(r4)
            com.instagram.user.model.User r3 = r0.A00()
            X.92m r1 = new X.92m
            r1.<init>(r4)
            java.lang.String r0 = ""
            X.AnonymousClass92n.A00(r1, r4, r3, r0, r2)
        L_0x00f6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass92f.A08(android.content.Context, java.lang.String, boolean, boolean):void");
    }

    public final void onSessionWillEnd() {
        AnonymousClass1Nd.A00(this.A01).A02(this.A06, C2370936h.class);
    }
}
