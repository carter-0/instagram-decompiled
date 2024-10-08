package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.instagram.common.session.UserSession;

/* renamed from: X.6uX  reason: invalid class name and case insensitive filesystem */
public final class C321656uX {
    public final Context A00;
    public final UserSession A01;
    public final AnonymousClass4D6 A02;
    public final C324356z9 A03;
    public final AnonymousClass2mA A04;
    public final C321636uV A05;
    public final C294265mA A06;
    public final Dda A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    public C321656uX(Context context, UserSession userSession, AnonymousClass4D6 r11, C228312lJ r12, C321636uV r13, C294265mA r14, Dda dda, String str, boolean z) {
        AnonymousClass2mA r0;
        0qQ.A0B(r14, 5);
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = r11;
        this.A05 = r13;
        this.A06 = r14;
        this.A07 = dda;
        this.A03 = new C324356z9(new Handler(Looper.getMainLooper()), userSession, r11, str, (String) null, z);
        if (r12 != null) {
            r0 = new AnonymousClass2mA(r12);
        } else {
            r0 = null;
        }
        this.A04 = r0;
        0Tu r2 = 0Tu.A05;
        this.A0A = 182.A06(r2, userSession, 36317951397205688L);
        this.A0B = 182.A06(r2, userSession, 36329187031793513L);
        this.A09 = 182.A06(r2, userSession, 36317951397402297L);
        this.A08 = 182.A06(r2, userSession, 2342160960611161786L);
        this.A0D = 182.A06(r2, userSession, 36317951397926592L);
        0qQ.A0B(userSession, 0);
        this.A0E = 182.A06(r2, userSession, 36317951398123202L);
        this.A0G = C278764xU.A00(userSession);
        this.A0F = 182.A06(r2, userSession, 36317951398188739L);
        this.A0C = 182.A06(r2, userSession, 36317951398581960L);
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [X.2IR, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0035, code lost:
        if (r5.equals(r0.A01.A06) == false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
        if (r0.A0B == false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0047, code lost:
        if (r1 != false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x052f, code lost:
        if (r49 == false) goto L_0x0531;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        if (X.182.A06(X.0Tu.A05, r4, 36316388029174054L) == false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.1FR r47, X.G5K r48, boolean r49, boolean r50, boolean r51, boolean r52) {
        /*
            r46 = this;
            r8 = r48
            boolean r9 = r8 instanceof X.C46323Dbr
            r7 = 0
            if (r9 == 0) goto L_0x008e
            r0 = r8
            X.Dbr r0 = (X.C46323Dbr) r0
            if (r0 == 0) goto L_0x008e
            java.lang.String r5 = r0.A00
        L_0x000e:
            r0 = r46
            r44 = r49
            if (r49 == 0) goto L_0x0028
            com.instagram.common.session.UserSession r4 = r0.A01
            r1 = 0
            X.0qQ.A0B(r4, r1)
            X.0Tu r3 = X.0Tu.A05
            r1 = 36316388029174054(0x81059000011126, double:3.0299682517821236E-306)
            boolean r1 = X.182.A06(r3, r4, r1)
            r3 = 1
            if (r1 != 0) goto L_0x0029
        L_0x0028:
            r3 = 0
        L_0x0029:
            if (r5 == 0) goto L_0x0037
            com.instagram.common.session.UserSession r1 = r0.A01
            java.lang.String r1 = r1.A06
            boolean r1 = r5.equals(r1)
            r20 = 1
            if (r1 != 0) goto L_0x0039
        L_0x0037:
            r20 = 0
        L_0x0039:
            if (r49 == 0) goto L_0x0042
            if (r20 == 0) goto L_0x0042
            boolean r2 = r0.A0B
            r1 = 1
            if (r2 != 0) goto L_0x0043
        L_0x0042:
            r1 = 0
        L_0x0043:
            if (r3 != 0) goto L_0x0049
            r19 = 0
            if (r1 == 0) goto L_0x004b
        L_0x0049:
            r19 = 1
        L_0x004b:
            com.instagram.common.session.UserSession r6 = r0.A01
            r15 = 0
            X.0qQ.A0B(r6, r15)
            X.0Tu r4 = X.0Tu.A05
            r1 = 36317951397729981(0x8106fc000816bd, double:3.030956932352072E-306)
            boolean r3 = X.182.A06(r4, r6, r1)
            r1 = 36317951397861055(0x8106fc000a16bf, double:3.0309569324349634E-306)
            boolean r1 = X.182.A06(r4, r6, r1)
            r35 = r50
            if (r50 != 0) goto L_0x006d
            if (r3 != 0) goto L_0x0086
            if (r20 != 0) goto L_0x0086
        L_0x006d:
            java.lang.Integer r18 = X.AnonymousClass05K.A0C
        L_0x006f:
            X.5mA r3 = r0.A06
            int r1 = r3.ordinal()
            java.lang.String r10 = "Required value was null."
            r28 = r47
            r36 = r51
            switch(r1) {
                case 0: goto L_0x0296;
                case 1: goto L_0x021d;
                case 2: goto L_0x01e3;
                case 3: goto L_0x0157;
                case 4: goto L_0x01a9;
                case 5: goto L_0x007e;
                case 6: goto L_0x00cb;
                case 7: goto L_0x007e;
                case 8: goto L_0x0091;
                default: goto L_0x007e;
            }
        L_0x007e:
            java.lang.String r1 = "Unsupported profile feed source"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0086:
            if (r1 == 0) goto L_0x008b
            java.lang.Integer r18 = X.AnonymousClass05K.A0N
            goto L_0x006f
        L_0x008b:
            java.lang.Integer r18 = X.AnonymousClass05K.A00
            goto L_0x006f
        L_0x008e:
            r5 = r7
            goto L_0x000e
        L_0x0091:
            if (r48 == 0) goto L_0x00c5
            X.Dda r9 = r0.A07
            if (r49 == 0) goto L_0x00be
            r1 = r7
        L_0x0098:
            boolean r10 = r0.A0G
            if (r49 == 0) goto L_0x00b7
            r2 = r7
        L_0x009d:
            r37 = 1
            r29 = r6
            r30 = r9
            r31 = r8
            r32 = r1
            r33 = r2
            r34 = r7
            r36 = r10
            r38 = r35
            r39 = r15
            X.1GP r10 = X.AnonymousClass94B.A03(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            goto L_0x04f4
        L_0x00b7:
            X.6z9 r2 = r0.A03
            X.6zA r2 = r2.A03
            java.lang.String r2 = r2.A09
            goto L_0x009d
        L_0x00be:
            X.6z9 r1 = r0.A03
            X.6zA r1 = r1.A03
            java.lang.String r1 = r1.A07
            goto L_0x0098
        L_0x00c5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r10)
            throw r0
        L_0x00cb:
            boolean r1 = r0.A0A
            if (r1 == 0) goto L_0x0127
            X.1vn r11 = X.1vm.A01(r6)
            boolean r14 = r0.A09
            boolean r13 = r0.A0D
            if (r48 == 0) goto L_0x0121
            if (r49 == 0) goto L_0x0118
            r2 = r7
            r1 = r7
        L_0x00dd:
            boolean r12 = r0.A0C
            X.Dda r10 = r0.A07
            r9 = 1
            r24 = r18
            r25 = r2
            r26 = r1
            r27 = r7
            r28 = r14
            r29 = r13
            r30 = r15
            r31 = r9
            r32 = r36
            r33 = r15
            r34 = r12
            r21 = r6
            r22 = r10
            r23 = r8
            X.1Ef r8 = X.AnonymousClass94B.A00(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r1 = 146195775(0x8b6c53f, float:1.1000099E-33)
            X.0nX r2 = new X.0nX
            r2.<init>(r1)
            X.0qQ.A0B(r11, r9)
            r1 = 2
            X.0qQ.A0B(r8, r1)
            X.UmJ r10 = new X.UmJ
            r10.<init>(r8, r7, r11, r2)
            goto L_0x04f4
        L_0x0118:
            X.6z9 r1 = r0.A03
            X.6zA r1 = r1.A03
            java.lang.String r2 = r1.A07
            java.lang.String r1 = r1.A09
            goto L_0x00dd
        L_0x0121:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
            throw r0
        L_0x0127:
            if (r48 == 0) goto L_0x0151
            X.Dda r2 = r0.A07
            if (r49 == 0) goto L_0x014a
            r1 = r7
        L_0x012e:
            r28 = 1
            r21 = r6
            r22 = r2
            r23 = r8
            r24 = r1
            r25 = r7
            r26 = r7
            r27 = r36
            r29 = r15
            r30 = r15
            r31 = r15
            X.1OC r10 = X.AnonymousClass94B.A01(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            goto L_0x04f4
        L_0x014a:
            X.6z9 r1 = r0.A03
            X.6zA r1 = r1.A03
            java.lang.String r1 = r1.A07
            goto L_0x012e
        L_0x0151:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
            throw r0
        L_0x0157:
            if (r48 == 0) goto L_0x01a3
            if (r49 == 0) goto L_0x0194
            r1 = r7
        L_0x015c:
            if (r9 == 0) goto L_0x019b
            X.Dbr r8 = (X.C46323Dbr) r8
            java.lang.String r8 = r8.A00
            if (r8 == 0) goto L_0x019b
            r2 = -2
            X.1NY r9 = new X.1NY
            r9.<init>(r6, r2)
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
            r9.A08(r2)
            java.lang.String r2 = "fan_club/user_exclusive_feed_timeline/"
            r9.A0A(r2)
            java.lang.String r2 = "target_user_id"
            r9.A9m(r2, r8)
            if (r1 == 0) goto L_0x0180
            java.lang.String r2 = "max_id"
            r9.A9m(r2, r1)
        L_0x0180:
            java.lang.Class<X.94D> r8 = X.AnonymousClass94D.class
            X.0bH r2 = new X.0bH
            r2.<init>(r6)
            X.1NS r1 = new X.1NS
            r1.<init>(r2, r8)
            r9.A02 = r1
            X.1OC r10 = r9.A0M()
            goto L_0x04f4
        L_0x0194:
            X.6z9 r1 = r0.A03
            X.6zA r1 = r1.A03
            java.lang.String r1 = r1.A07
            goto L_0x015c
        L_0x019b:
            java.lang.String r1 = "fan club feed requires a user id"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x01a3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
            throw r0
        L_0x01a9:
            if (r5 == 0) goto L_0x01db
            if (r49 == 0) goto L_0x01d4
            r1 = r7
        L_0x01ae:
            r2 = -2
            X.1NY r9 = new X.1NY
            r9.<init>(r6, r2)
            r9.A05()
            java.lang.Object[] r8 = new java.lang.Object[]{r5}
            java.lang.String r2 = "repost/user/%s/"
            r9.A0K(r2, r8)
            java.lang.Class<X.4mz> r8 = X.C273664mz.class
            java.lang.Class<X.94D> r2 = X.AnonymousClass94D.class
            r9.A0O(r7, r8, r2, r15)
            if (r1 == 0) goto L_0x01ce
            java.lang.String r2 = "max_id"
            r9.A9m(r2, r1)
        L_0x01ce:
            X.1OC r10 = r9.A0M()
            goto L_0x04f4
        L_0x01d4:
            X.6z9 r1 = r0.A03
            X.6zA r1 = r1.A03
            java.lang.String r1 = r1.A07
            goto L_0x01ae
        L_0x01db:
            java.lang.String r1 = "Reposts feed requires a user id"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x01e3:
            if (r5 == 0) goto L_0x0215
            if (r49 == 0) goto L_0x020e
            r1 = r7
        L_0x01e8:
            r2 = -2
            X.1NY r9 = new X.1NY
            r9.<init>(r6, r2)
            r9.A05()
            java.lang.Object[] r8 = new java.lang.Object[]{r5}
            java.lang.String r2 = "usertags/%s/pending_review/"
            r9.A0K(r2, r8)
            java.lang.Class<X.4mz> r8 = X.C273664mz.class
            java.lang.Class<X.94D> r2 = X.AnonymousClass94D.class
            r9.A0O(r7, r8, r2, r15)
            if (r1 == 0) goto L_0x0208
            java.lang.String r2 = "max_id"
            r9.A9m(r2, r1)
        L_0x0208:
            X.1OC r10 = r9.A0M()
            goto L_0x04f4
        L_0x020e:
            X.6z9 r1 = r0.A03
            X.6zA r1 = r1.A03
            java.lang.String r1 = r1.A07
            goto L_0x01e8
        L_0x0215:
            java.lang.String r1 = "Pending Photos of You feed requires a user id"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x021d:
            if (r5 == 0) goto L_0x028e
            if (r49 == 0) goto L_0x0287
            r11 = r7
        L_0x0222:
            r2 = 12
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)
            r1 = -2
            X.1NY r9 = new X.1NY
            r9.<init>(r6, r1)
            java.lang.Integer r8 = X.AnonymousClass05K.A0N
            r9.A08(r8)
            java.lang.Object[] r12 = new java.lang.Object[]{r5}
            java.lang.String r1 = "usertags/%s/feed/"
            r9.A0K(r1, r12)
            java.lang.Class<X.4mz> r12 = X.C273664mz.class
            java.lang.Class<X.94D> r1 = X.AnonymousClass94D.class
            r9.A0O(r7, r12, r1, r15)
            if (r11 == 0) goto L_0x024a
            java.lang.String r1 = "max_id"
            r9.A9m(r1, r11)
        L_0x024a:
            java.lang.String r1 = "count"
            r9.A0C(r1, r2)
            r1 = 36609626921441149(0x8210430003177d, double:3.2154137080300775E-306)
            long r1 = X.182.A01(r4, r6, r1)
            r13 = 0
            int r12 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r12 <= 0) goto L_0x0281
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r5)
            if (r11 != 0) goto L_0x026a
            java.lang.String r11 = ""
        L_0x026a:
            r12.append(r11)
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            r9.A0A = r10
            r9.A07(r8)
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS
            long r1 = r8.toMillis(r1)
            r9.A01 = r1
        L_0x0281:
            X.1OC r10 = r9.A0M()
            goto L_0x04f4
        L_0x0287:
            X.6z9 r1 = r0.A03
            X.6zA r1 = r1.A03
            java.lang.String r11 = r1.A07
            goto L_0x0222
        L_0x028e:
            java.lang.String r1 = "Photos of You feed requires a user id"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0296:
            boolean r1 = r0.A0F
            if (r1 == 0) goto L_0x04bc
            if (r48 == 0) goto L_0x05d0
            X.Dda r11 = r0.A07
            boolean r1 = r0.A0E
            r29 = r1
            if (r49 == 0) goto L_0x04b4
            r2 = r7
        L_0x02a5:
            boolean r1 = r0.A0G
            r17 = r1
            if (r49 == 0) goto L_0x04a8
            r10 = r7
            r26 = r7
        L_0x02ae:
            boolean r1 = r0.A0C
            r14 = r1
            r1 = 146195775(0x8b6c53f, float:1.1000099E-33)
            X.0nX r13 = new X.0nX
            r13.<init>(r1)
            r16 = 1
            java.lang.String r12 = "profile_query_type"
            if (r9 == 0) goto L_0x0477
            if (r11 == 0) goto L_0x02c6
            java.lang.String r1 = "user_id"
            r11.A0J(r12, r1)
        L_0x02c6:
            r1 = r8
            X.Dbr r1 = (X.C46323Dbr) r1
            java.lang.String r1 = r1.A00
            r21 = r6
            r22 = r18
            r23 = r1
            r24 = r2
            r25 = r10
            r27 = r15
            r28 = r15
            r30 = r15
            r31 = r36
            r32 = r16
            r33 = r17
            r34 = r14
            X.1Ef r12 = X.AnonymousClass94C.A01(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
        L_0x02e7:
            java.lang.String r1 = "null cannot be cast to non-null type com.facebook.graphql.query.interfaces.IGraphQLRequest<com.facebook.graphql.modelutil.GraphQLModel>"
            X.0qQ.A0C(r12, r1)
            X.1NY r11 = X.AnonymousClass94C.A02(r6, r11, r8, r2)
            java.lang.String r14 = "exclude_comment"
            r1 = r36
            r11.A0H(r14, r1)
            r11.A03()
            if (r2 == 0) goto L_0x0301
            java.lang.String r1 = "max_id"
            r11.A9m(r1, r2)
        L_0x0301:
            java.lang.String r1 = "profile_grid_items_cursor"
            r11.A9m(r1, r10)
            java.lang.String r2 = "pinned_profile_grid_items_ids"
            r1 = r26
            r11.A9m(r2, r1)
            if (r17 == 0) goto L_0x0322
            java.lang.String r2 = "fetch_profile_grid_items"
            java.lang.String r1 = "true"
            r11.A9m(r2, r1)
            if (r9 == 0) goto L_0x046d
            X.Dbr r8 = (X.C46323Dbr) r8
            java.lang.String r1 = r8.A00
        L_0x031c:
            java.lang.String r1 = X.002.A0R(r1, r10)
            r11.A0A = r1
        L_0x0322:
            if (r50 == 0) goto L_0x032f
            r1 = 4960(0x1360, float:6.95E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r1)
            java.lang.String r1 = "true"
            r11.A9m(r2, r1)
        L_0x032f:
            int r1 = r12.hashCode()
            java.lang.String r2 = java.lang.String.valueOf(r1)
            java.lang.String r1 = "x_RESPONSE_SHAPE_LOGGING"
            r11.A0F(r1, r2)
            X.1OC r10 = r11.A0M()
            X.1vn r2 = X.1vm.A01(r6)
            r1 = r16
            X.0qQ.A0B(r2, r1)
            X.UmJ r1 = new X.UmJ
            r1.<init>(r12, r7, r2, r13)
            r8 = r7
        L_0x034f:
            android.content.Context r2 = r0.A00
            r21 = r2
            X.2mA r2 = r0.A04
            r17 = r2
            X.6uV r2 = r0.A05
            X.6zZ r7 = new X.6zZ
            r39 = r7
            r40 = r21
            r41 = r17
            r42 = r2
            r43 = r3
            r45 = r35
            r39.<init>(r40, r41, r42, r43, r44, r45)
            X.5mA r12 = X.C294265mA.MAIN_GRID
            java.lang.String r2 = "rest_network"
            java.lang.String r11 = "null cannot be cast to non-null type com.instagram.graphql.GraphQLObservableRequestTask"
            java.lang.String r9 = "profile_data_source"
            if (r3 != r12) goto L_0x03a3
            boolean r13 = r0.A0F
            if (r13 == 0) goto L_0x03a3
            X.1OC r10 = (X.1OC) r10
            if (r10 == 0) goto L_0x0388
            X.6z9 r3 = r0.A03
            r3.A03(r10, r7)
            X.Dda r3 = r0.A07
            if (r3 == 0) goto L_0x0388
            r3.A0J(r9, r2)
        L_0x0388:
            X.6z9 r4 = r0.A03
            X.0qQ.A0C(r1, r11)
            X.OrL r0 = new X.OrL
            r0.<init>()
            X.0qQ.A0B(r1, r15)
            X.6zA r3 = r4.A03
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            r1.A00 = r0
            X.4D6 r0 = r4.A02
            r0.schedule(r1)
            r3.A03 = r2
        L_0x03a2:
            return
        L_0x03a3:
            java.lang.String r13 = "null cannot be cast to non-null type com.instagram.common.api.base.StreamingHttpRequestTask<com.instagram.profile.api.responses.ProfileMediaFeedResponse>"
            if (r3 != r12) goto L_0x03bd
            if (r19 == 0) goto L_0x03bd
            X.0qQ.A0C(r10, r13)
            X.1GP r10 = (X.1GP) r10
            X.6z9 r1 = r0.A03
            r1.A04(r10, r7)
            X.Dda r1 = r0.A07
            if (r1 == 0) goto L_0x03a2
            java.lang.String r0 = "rest_streaming_network"
        L_0x03b9:
            r1.A0J(r9, r0)
            return
        L_0x03bd:
            boolean r1 = r0.A0A
            if (r1 == 0) goto L_0x044d
            if (r3 == r12) goto L_0x03c7
            X.5mA r1 = X.C294265mA.OPAL_MEDIA_GRID
            if (r3 != r1) goto L_0x044d
        L_0x03c7:
            X.6z9 r13 = r0.A03
            X.4D6 r1 = r0.A02
            X.WMu r14 = new X.WMu
            r36 = r14
            r37 = r21
            r38 = r6
            r39 = r1
            r40 = r13
            r36.<init>(r37, r38, r39, r40, r41, r42, r43, r44, r45)
            r1 = 36317951397533371(0x8106fc000516bb, double:3.030956932227735E-306)
            boolean r1 = X.182.A06(r4, r6, r1)
            if (r1 == 0) goto L_0x042c
            if (r3 != r12) goto L_0x042c
            if (r20 == 0) goto L_0x042c
            if (r8 == 0) goto L_0x042c
            X.6zA r1 = r13.A03
            java.lang.Integer r2 = r1.A03
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            if (r2 == r1) goto L_0x042c
            X.A94 r6 = X.C63008Kpy.A00(r6)
            X.92j r1 = X.C3727792j.GRAPHQL_PROFILE_FEED
            X.0qQ.A0A(r5)
            java.lang.String r11 = X.C3727392e.A01(r1, r5)
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            r20 = 0
            r1 = r18
            if (r1 != r2) goto L_0x040a
            r20 = 1
        L_0x040a:
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MINUTES
            r1 = 720(0x2d0, double:3.557E-321)
            long r17 = r3.toMillis(r1)
            r19 = 1
            X.92g r9 = new X.92g
            r16 = r9
            r21 = r15
            r16.<init>(r17, r19, r20, r21)
            r2 = 14
            X.G4S r1 = new X.G4S
            r1.<init>(r0, r2)
            r10 = r7
            r12 = r1
            r7 = r8
            r8 = r14
            r6.A00(r7, r8, r9, r10, r11, r12)
            return
        L_0x042c:
            X.0qQ.A0C(r10, r11)
            X.FZ9 r10 = (X.FZ9) r10
            X.0qQ.A0B(r10, r15)
            X.6zA r3 = r13.A03
            java.lang.Integer r1 = r3.A03
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            if (r1 == r2) goto L_0x0445
            r10.A00 = r14
            X.4D6 r1 = r13.A02
            r1.schedule(r10)
            r3.A03 = r2
        L_0x0445:
            X.Dda r1 = r0.A07
            if (r1 == 0) goto L_0x03a2
            java.lang.String r0 = "graphql_defer_network"
            goto L_0x03b9
        L_0x044d:
            X.5mA r1 = X.C294265mA.EDIT_PROFILE_HIGHLIGHTS_MANAGEMENT_SCREEN_GRID
            if (r3 != r1) goto L_0x045c
            X.0qQ.A0C(r10, r13)
            X.1GP r10 = (X.1GP) r10
            X.6z9 r0 = r0.A03
            r0.A04(r10, r7)
            return
        L_0x045c:
            X.1OC r10 = (X.1OC) r10
            if (r10 == 0) goto L_0x03a2
            X.6z9 r1 = r0.A03
            r1.A03(r10, r7)
            X.Dda r0 = r0.A07
            if (r0 == 0) goto L_0x03a2
            r0.A0J(r9, r2)
            return
        L_0x046d:
            boolean r1 = r8 instanceof X.C46456DfK
            if (r1 == 0) goto L_0x05c4
            X.DfK r8 = (X.C46456DfK) r8
            java.lang.String r1 = r8.A00
            goto L_0x031c
        L_0x0477:
            r9 = 0
            boolean r1 = r8 instanceof X.C46456DfK
            if (r1 == 0) goto L_0x05ca
            if (r11 == 0) goto L_0x0485
            java.lang.String r1 = X.Dbm.A01()
            r11.A0J(r12, r1)
        L_0x0485:
            r1 = r8
            X.DfK r1 = (X.C46456DfK) r1
            java.lang.String r1 = r1.A00
            r21 = r6
            r22 = r18
            r23 = r1
            r24 = r2
            r25 = r10
            r27 = r15
            r28 = r15
            r30 = r15
            r31 = r36
            r32 = r16
            r33 = r17
            r34 = r14
            X.1Ef r12 = X.AnonymousClass94C.A00(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            goto L_0x02e7
        L_0x04a8:
            X.6z9 r1 = r0.A03
            X.6zA r1 = r1.A03
            java.lang.String r10 = r1.A09
            java.lang.String r1 = r1.A08
            r26 = r1
            goto L_0x02ae
        L_0x04b4:
            X.6z9 r1 = r0.A03
            X.6zA r1 = r1.A03
            java.lang.String r2 = r1.A07
            goto L_0x02a5
        L_0x04bc:
            if (r19 == 0) goto L_0x0517
            if (r20 == 0) goto L_0x0508
            r1 = 36330101859959248(0x811209000441d0, double:3.0386409335918445E-306)
            boolean r1 = X.182.A06(r4, r6, r1)
            if (r1 == 0) goto L_0x0514
        L_0x04cb:
            r32 = 1
        L_0x04cd:
            if (r48 == 0) goto L_0x05d6
            X.Dda r9 = r0.A07
            if (r49 == 0) goto L_0x0501
            r1 = r7
        L_0x04d4:
            boolean r11 = r0.A0G
            if (r49 == 0) goto L_0x04f8
            r10 = r7
            r2 = r7
        L_0x04da:
            r21 = r28
            r22 = r6
            r23 = r9
            r24 = r8
            r25 = r1
            r26 = r10
            r27 = r2
            r28 = r35
            r29 = r11
            r30 = r15
            r31 = r35
            X.1GP r10 = X.AnonymousClass94B.A03(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
        L_0x04f4:
            r1 = r7
            r8 = r7
            goto L_0x034f
        L_0x04f8:
            X.6z9 r2 = r0.A03
            X.6zA r2 = r2.A03
            java.lang.String r10 = r2.A09
            java.lang.String r2 = r2.A08
            goto L_0x04da
        L_0x0501:
            X.6z9 r1 = r0.A03
            X.6zA r1 = r1.A03
            java.lang.String r1 = r1.A07
            goto L_0x04d4
        L_0x0508:
            r1 = 36330101859893711(0x811209000341cf, double:3.0386409335503986E-306)
            boolean r1 = X.182.A06(r4, r6, r1)
            if (r1 == 0) goto L_0x0514
            goto L_0x04cb
        L_0x0514:
            r32 = 0
            goto L_0x04cd
        L_0x0517:
            boolean r1 = r0.A0A
            if (r1 == 0) goto L_0x058d
            boolean r1 = r0.A09
            if (r1 == 0) goto L_0x058a
            boolean r1 = r0.A08
            if (r1 == 0) goto L_0x0525
            if (r49 == 0) goto L_0x058a
        L_0x0525:
            r28 = 1
        L_0x0527:
            boolean r13 = r0.A0D
            boolean r1 = r0.A0E
            if (r1 == 0) goto L_0x0531
            r30 = 1
            if (r49 != 0) goto L_0x0533
        L_0x0531:
            r30 = 0
        L_0x0533:
            if (r48 == 0) goto L_0x05dc
            if (r49 == 0) goto L_0x0583
            r1 = r7
        L_0x0538:
            boolean r12 = r0.A0G
            if (r49 == 0) goto L_0x057a
            r9 = r7
            r2 = r7
        L_0x053e:
            boolean r11 = r0.A0C
            X.Dda r10 = r0.A07
            r24 = r18
            r25 = r1
            r26 = r9
            r27 = r2
            r29 = r13
            r31 = r15
            r32 = r36
            r33 = r12
            r34 = r11
            r21 = r6
            r22 = r10
            r23 = r8
            X.1Ef r8 = X.AnonymousClass94B.A00(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            X.1vn r9 = X.1vm.A01(r6)
            r1 = 146195775(0x8b6c53f, float:1.1000099E-33)
            X.0nX r2 = new X.0nX
            r2.<init>(r1)
            r1 = 1
            X.0qQ.A0B(r9, r1)
            r1 = 2
            X.0qQ.A0B(r8, r1)
            X.UmJ r10 = new X.UmJ
            r10.<init>(r8, r7, r9, r2)
            r1 = r7
            goto L_0x034f
        L_0x057a:
            X.6z9 r2 = r0.A03
            X.6zA r2 = r2.A03
            java.lang.String r9 = r2.A09
            java.lang.String r2 = r2.A08
            goto L_0x053e
        L_0x0583:
            X.6z9 r1 = r0.A03
            X.6zA r1 = r1.A03
            java.lang.String r1 = r1.A07
            goto L_0x0538
        L_0x058a:
            r28 = 0
            goto L_0x0527
        L_0x058d:
            if (r48 == 0) goto L_0x05e2
            X.Dda r10 = r0.A07
            if (r49 == 0) goto L_0x05bd
            r1 = r7
        L_0x0594:
            boolean r11 = r0.A0G
            if (r49 == 0) goto L_0x05b4
            r9 = r7
            r2 = r7
        L_0x059a:
            r34 = r52
            r25 = r6
            r26 = r10
            r27 = r8
            r28 = r1
            r29 = r9
            r30 = r2
            r31 = r36
            r32 = r15
            r33 = r11
            X.1OC r10 = X.AnonymousClass94B.A01(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            goto L_0x04f4
        L_0x05b4:
            X.6z9 r2 = r0.A03
            X.6zA r2 = r2.A03
            java.lang.String r9 = r2.A09
            java.lang.String r2 = r2.A08
            goto L_0x059a
        L_0x05bd:
            X.6z9 r1 = r0.A03
            X.6zA r1 = r1.A03
            java.lang.String r1 = r1.A07
            goto L_0x0594
        L_0x05c4:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x05ca:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x05d0:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r10)
            throw r0
        L_0x05d6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r10)
            throw r0
        L_0x05dc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r10)
            throw r0
        L_0x05e2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C321656uX.A00(X.1FR, X.G5K, boolean, boolean, boolean, boolean):void");
    }

    public final boolean A01() {
        if (this.A03.A03.A03 == AnonymousClass05K.A01) {
            return true;
        }
        return false;
    }

    public final boolean A02() {
        if (this.A03.A03.A03 == AnonymousClass05K.A00) {
            return true;
        }
        return false;
    }
}
