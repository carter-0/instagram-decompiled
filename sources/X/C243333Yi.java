package X;

import android.content.Context;
import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Arrays;

/* renamed from: X.3Yi  reason: invalid class name and case insensitive filesystem */
public final class C243333Yi {
    public final UserSession A00;
    public final AnonymousClass310 A01;
    public final 0Pl A02;
    public final C2364033p A03;
    public final C249763kK A04;
    public final AnonymousClass0eM A05 = AnonymousClass0eN.A01(new AnonymousClass9LW(this, 35));
    public final AnonymousClass0eM A06 = AnonymousClass0eN.A01(new AnonymousClass9LW(this, 36));
    public final AnonymousClass0eM A07 = AnonymousClass0eN.A01(new AnonymousClass9LW(this, 37));
    public final AnonymousClass0eM A08 = AnonymousClass0eN.A01(new AnonymousClass9LW(this, 38));
    public final AnonymousClass0eM A09 = AnonymousClass0eN.A01(new AnonymousClass9LW(this, 39));
    public final AnonymousClass0eM A0A = AnonymousClass0eN.A01(new AnonymousClass9LW(this, 40));
    public final AnonymousClass0eM A0B = AnonymousClass0eN.A01(new AnonymousClass9LW(this, 41));
    public final AnonymousClass0eM A0C = AnonymousClass0eN.A01(new AnonymousClass9LW(this, 42));
    public final AnonymousClass0eM A0D = AnonymousClass0eN.A01(new AnonymousClass9LW(this, 43));
    public final AnonymousClass0eM A0E = AnonymousClass0eN.A01(new AnonymousClass9LW(this, 44));
    public final C243323Yh A0F;
    public final C243283Yd A0G;
    public final AnonymousClass33Y A0H;
    public final C243273Yc A0I;
    public final C243293Ye A0J;
    public final C231502rm A0K;
    public final 0rQ A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;

    public C243333Yi(UserSession userSession, C243323Yh r5, C243283Yd r6, AnonymousClass310 r7, C243273Yc r8, C243293Ye r9, 0Pl r10, C2364033p r11, 0rQ r12, C249763kK r13, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(r8, 1);
        0qQ.A0B(r6, 2);
        0qQ.A0B(r11, 10);
        this.A0I = r8;
        this.A0G = r6;
        this.A0J = r9;
        this.A0F = r5;
        this.A00 = userSession;
        this.A0N = z;
        this.A0O = z2;
        this.A01 = r7;
        this.A0M = z3;
        this.A03 = r11;
        this.A02 = r10;
        this.A0L = r12;
        this.A04 = r13;
        this.A0K = C231492rl.A00(userSession);
        0qQ.A0B(userSession, 0);
        this.A0H = (AnonymousClass33Y) userSession.A01(AnonymousClass33Y.class, new C58684Ivt(userSession, 37));
    }

    public final int A00(Context context, 1Xj r14, AnonymousClass3W1 r15) {
        Integer num;
        Integer num2;
        Object[] objArr;
        String str;
        Integer num3;
        Integer num4;
        String str2;
        0qQ.A0B(r14, 0);
        0qQ.A0B(r15, 1);
        0qQ.A0B(context, 2);
        boolean A0E2 = Systrace.A0E(1);
        if (A0E2) {
            0fS.A01("CoalescedFooterUseCase#getViewModelHash", -973768799);
        }
        boolean z = this.A0K.A0R;
        boolean CcK = r14.CcK();
        if (z) {
            String id = r14.getId();
            Integer valueOf = Integer.valueOf(this.A0I.A01(r14));
            Boolean valueOf2 = Boolean.valueOf(r15.A1q);
            Object obj = r15.A3b.A00;
            Integer valueOf3 = Integer.valueOf(AnonymousClass3Yn.A00(r14));
            if (CcK) {
                this.A09.getValue();
                num3 = Integer.valueOf(Arrays.hashCode(new Object[]{Integer.valueOf(r15.A03)}));
            } else {
                num3 = null;
            }
            if (!CcK || this.A0F == null) {
                num4 = null;
            } else {
                User A29 = r14.A29();
                if (A29 != null) {
                    str2 = A29.getUsername();
                } else {
                    str2 = null;
                }
                num4 = Integer.valueOf(Arrays.hashCode(new Object[]{str2}));
            }
            objArr = new Object[]{id, valueOf, valueOf2, obj, valueOf3, num3, num4};
        } else {
            Integer valueOf4 = Integer.valueOf(this.A0G.A00(r14));
            Integer valueOf5 = Integer.valueOf(this.A0I.A01(r14));
            this.A06.getValue();
            Integer valueOf6 = Integer.valueOf(Arrays.hashCode(new Object[]{Boolean.valueOf(r15.A1q)}));
            Integer valueOf7 = Integer.valueOf(AnonymousClass3Yn.A00(r14));
            this.A0B.getValue();
            Integer valueOf8 = Integer.valueOf(Arrays.hashCode(new Object[]{r15.A3b.A00}));
            if (CcK) {
                this.A09.getValue();
                num = Integer.valueOf(Arrays.hashCode(new Object[]{Integer.valueOf(r15.A03)}));
            } else {
                num = null;
            }
            if (!CcK || this.A0F == null) {
                num2 = null;
            } else {
                User A292 = r14.A29();
                if (A292 != null) {
                    str = A292.getUsername();
                } else {
                    str = null;
                }
                num2 = Integer.valueOf(Arrays.hashCode(new Object[]{str}));
            }
            Integer valueOf9 = Integer.valueOf(((C248083hO) this.A08.getValue()).A00(context, r14, AnonymousClass05K.A00));
            this.A05.getValue();
            objArr = new Object[]{valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, num, num2, valueOf9, Integer.valueOf(Arrays.hashCode(new Object[]{r14.getId()}))};
        }
        int hashCode = Arrays.hashCode(objArr);
        if (A0E2) {
            0fS.A00(2040537448);
        }
        return hashCode;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0059, code lost:
        if (r59 != false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007d, code lost:
        if (r7 != false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0151, code lost:
        if (X.182.A06(X.0Tu.A05, r6, 36327563534154246L) == false) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x015b, code lost:
        if (r1.A3E != false) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002e, code lost:
        if (r0.A4c() == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0228, code lost:
        if (r3.A06 != X.C252883pr.A09) goto L_0x022a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0240, code lost:
        if (r7.A1X().A02.contains(r6) == true) goto L_0x0242;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C248133hT A01(android.content.Context r54, X.1Xj r55, X.AnonymousClass4DU r56, X.AnonymousClass3W1 r57, X.C249763kK r58, boolean r59) {
        /*
            r53 = this;
            r15 = 0
            r0 = r55
            X.0qQ.A0B(r0, r15)
            r11 = 1
            r1 = r57
            X.0qQ.A0B(r1, r11)
            r16 = 1
            boolean r27 = com.facebook.systrace.Systrace.A0E(r16)
            if (r27 == 0) goto L_0x001c
            r3 = -853203555(0xffffffffcd25259d, float:-1.73169104E8)
            java.lang.String r2 = "CoalescedFooterUseCase#getUiState"
            X.0fS.A01(r2, r3)
        L_0x001c:
            r2 = r53
            com.instagram.common.session.UserSession r13 = r2.A00
            boolean r3 = X.2R8.A02(r13, r0)
            r26 = 0
            if (r3 == 0) goto L_0x0030
            boolean r3 = r0.A4c()
            r25 = 1
            if (r3 != 0) goto L_0x0032
        L_0x0030:
            r25 = 0
        L_0x0032:
            boolean r6 = r2.A0N
            r5 = r56
            java.lang.String r23 = r5.getModuleName()
            X.3YW r3 = new X.3YW
            r4 = r54
            r18 = r3
            r19 = r4
            r20 = r13
            r21 = r0
            r22 = r1
            r24 = r6
            r18.<init>(r19, r20, r21, r22, r23, r24)
            boolean r6 = r3.A06
            r24 = r6
            if (r6 != 0) goto L_0x005b
            boolean r6 = r3.A08
            if (r6 == 0) goto L_0x005b
            r23 = 1
            if (r59 == 0) goto L_0x005d
        L_0x005b:
            r23 = 0
        L_0x005d:
            X.3DI r6 = X.AnonymousClass3DI.A00
            boolean r22 = r6.A04(r13)
            X.0eM r6 = r2.A0C
            r36 = r6
            java.lang.Object r6 = r36.getValue()
            X.3fU r6 = (X.C246943fU) r6
            boolean r7 = r6.A03(r0, r5, r1)
            boolean r6 = r2.A0O
            if (r6 != 0) goto L_0x007f
            if (r24 != 0) goto L_0x007f
            boolean r6 = r3.A07
            if (r6 == 0) goto L_0x007f
            r20 = 1
            if (r7 == 0) goto L_0x0081
        L_0x007f:
            r20 = 0
        L_0x0081:
            X.1Xy r6 = r0.A0C
            X.DSX r6 = r6.Aqj()
            if (r6 != 0) goto L_0x008b
            r26 = 1
        L_0x008b:
            r21 = 0
            if (r59 != 0) goto L_0x036d
            X.33Y r7 = r2.A0H
            java.lang.String r6 = r5.getModuleName()
            java.lang.Integer r6 = r7.A00(r0, r6)
            if (r6 != 0) goto L_0x036d
            X.3Yc r7 = r2.A0I
            X.3fY r6 = new X.3fY
            r6.<init>(r4)
            r28 = r7
            r29 = r4
            r30 = r6
            r31 = r0
            r32 = r5
            r33 = r1
            X.3gM r41 = r28.A02(r29, r30, r31, r32, r33)
        L_0x00b2:
            X.3Ye r7 = r2.A0J
            if (r7 == 0) goto L_0x0369
            java.lang.String r6 = "cta_extension_tap_on_ufi"
            X.9J3 r35 = r7.A00(r0, r5, r1, r6)
        L_0x00bc:
            X.3Yd r7 = r2.A0G
            java.lang.Object r6 = r36.getValue()
            X.3fU r6 = (X.C246943fU) r6
            boolean r6 = r6.A02(r0, r5, r1)
            X.3gj r40 = r7.A01(r0, r5, r1, r6)
            X.0eM r6 = r2.A09
            java.lang.Object r6 = r6.getValue()
            X.3gk r6 = (X.C247683gk) r6
            X.0Pk r7 = X.0Pl.A0n
            com.instagram.common.session.UserSession r6 = r6.A00
            X.0Pl r8 = r7.A00(r4, r6)
            boolean r6 = r0.A5D()
            if (r6 == 0) goto L_0x0366
            int r6 = r1.A03
            X.1Xj r6 = r0.A1c(r6)
        L_0x00e8:
            r9 = 0
            if (r6 == 0) goto L_0x0362
            X.3gp r7 = r6.A1U()
            if (r7 == 0) goto L_0x0362
            java.lang.String r6 = r7.A0d
            if (r6 == 0) goto L_0x0362
            boolean r6 = X.00l.A0W(r6)
            if (r6 != 0) goto L_0x0362
            r6 = 2130971404(0x7f040b0c, float:1.7551545E38)
            int r6 = X.2Yu.A0F(r4, r6)
            android.text.Layout r8 = r8.A0B(r4, r7, r6)
            boolean r6 = r0.A5D()
            if (r6 == 0) goto L_0x0112
            int r6 = r1.A03
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
        L_0x0112:
            X.3ZH r7 = r0.A1Y()
            X.9Ig r18 = new X.9Ig
            r6 = r18
            r6.<init>((android.text.Layout) r8, (X.AnonymousClass3ZH) r7, (X.AnonymousClass3W1) r1, (java.lang.Integer) r9)
        L_0x011d:
            X.0eM r6 = r2.A06
            java.lang.Object r7 = r6.getValue()
            X.3gl r7 = (X.C247693gl) r7
            r14 = 4
            boolean r6 = r3.A03
            if (r6 != 0) goto L_0x0306
            r39 = 0
        L_0x012c:
            if (r23 == 0) goto L_0x0302
            X.0eM r6 = r2.A0E
            java.lang.Object r7 = r6.getValue()
            X.3pt r7 = (X.C252903pt) r7
            com.instagram.common.session.UserSession r6 = r7.A00
            boolean r8 = r0.A5n()
            if (r8 != 0) goto L_0x0153
            boolean r8 = r0.A5e()
            if (r8 != 0) goto L_0x0153
            X.0Tu r10 = X.0Tu.A05
            r8 = 36327563534154246(0x810fba00023a06, double:3.0370356861317436E-306)
            boolean r8 = X.182.A06(r10, r6, r8)
            r47 = 1
            if (r8 != 0) goto L_0x0155
        L_0x0153:
            r47 = 0
        L_0x0155:
            if (r47 == 0) goto L_0x015d
            boolean r8 = r1.A3E
            r46 = 0
            if (r8 == 0) goto L_0x015f
        L_0x015d:
            r46 = 1
        L_0x015f:
            r5.getModuleName()
            boolean r8 = X.AnonymousClass3YY.A04(r6, r0)
            if (r8 == 0) goto L_0x02a7
            X.4jz r30 = X.AnonymousClass3YY.A00(r0)
            r8 = 45
            X.9M5 r10 = new X.9M5
            r10.<init>(r8, r7, r0)
            r9 = 5
            X.9ME r8 = new X.9ME
            r8.<init>(r9, r0, r7, r1)
            r28 = r4
            r29 = r6
            r31 = r8
            r32 = r10
            r33 = r15
            r34 = r11
            java.lang.CharSequence r45 = X.AnonymousClass3YY.A01(r28, r29, r30, r31, r32, r33, r34)
        L_0x0189:
            X.9ME r8 = new X.9ME
            r8.<init>(r14, r0, r7, r1)
            r6 = 23
            X.9Ld r7 = new X.9Ld
            r7.<init>(r1, r6)
            X.4LL r6 = X.AnonymousClass4LL.A00
            X.9Ib r9 = new X.9Ib
            r9.<init>((X.C62320sa) r8, (X.0sP) r7, (X.0sP) r6)
            X.9If r32 = new X.9If
            r42 = r32
            r43 = r9
            r44 = r1
            r42.<init>((X.C376459Ib) r43, (X.AnonymousClass3W1) r44, (java.lang.CharSequence) r45, (boolean) r46, (boolean) r47)
        L_0x01a7:
            if (r22 == 0) goto L_0x02a3
            java.lang.Object r6 = r36.getValue()
            X.3fU r6 = (X.C246943fU) r6
            X.9Ib r31 = r6.A01(r0, r5, r1)
        L_0x01b3:
            if (r25 == 0) goto L_0x029f
            X.0eM r6 = r2.A07
            java.lang.Object r6 = r6.getValue()
            X.A8f r6 = (X.C39765A8f) r6
            X.JwG r36 = r6.A00(r0)
        L_0x01c1:
            X.0rQ r6 = r2.A0L
            r5.getModuleName()
            boolean r6 = r6.A05(r0)
            if (r6 != 0) goto L_0x029b
            X.310 r6 = r2.A01
            X.2oE r6 = r6.B5G()
            if (r6 == 0) goto L_0x029b
            X.0eM r6 = r2.A0A
            java.lang.Object r6 = r6.getValue()
            X.3gm r6 = (X.C247703gm) r6
            X.9J0 r34 = r6.A00(r0, r1)
        L_0x01e0:
            if (r20 == 0) goto L_0x0381
            java.util.List r3 = r3.A02
            java.util.List r6 = java.util.Collections.unmodifiableList(r3)
            X.0qQ.A07(r6)
            r3 = 10
            int r3 = X.0Yv.A1E(r6, r3)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r3)
            java.util.Iterator r20 = r6.iterator()
        L_0x01fa:
            boolean r3 = r20.hasNext()
            if (r3 == 0) goto L_0x0383
            java.lang.Object r3 = r20.next()
            X.3gp r3 = (X.C247733gp) r3
            X.0Pl r8 = r2.A02
            X.0qQ.A0A(r3)
            X.0qQ.A0B(r3, r14)
            boolean r19 = com.facebook.systrace.Systrace.A0E(r16)
            if (r19 == 0) goto L_0x021c
            r7 = -467724931(0xffffffffe41f157d, float:-1.1738323E22)
            java.lang.String r6 = "FeedCommentRowViewUseCase#getUiState"
            X.0fS.A01(r6, r7)
        L_0x021c:
            java.lang.Integer r7 = r3.A0Z
            java.lang.Integer r6 = X.AnonymousClass05K.A01
            if (r7 == r6) goto L_0x022a
            X.3pr r7 = r3.A06
            X.3pr r6 = X.C252883pr.Success
            r52 = 1
            if (r7 == r6) goto L_0x022c
        L_0x022a:
            r52 = 0
        L_0x022c:
            java.lang.String r6 = r3.A0F
            if (r6 == 0) goto L_0x0298
            r51 = 1
            X.1Xj r7 = r3.A07
            if (r7 == 0) goto L_0x0379
            X.1i7 r7 = r7.A1X()
            java.util.Set r7 = r7.A02
            boolean r6 = r7.contains(r6)
            if (r6 != r11) goto L_0x0298
        L_0x0242:
            int r9 = X.AnonymousClass3YX.A00(r0, r1, r11)
            int r6 = r1.A03
            boolean r50 = X.1sx.A0I(r3, r6)
            X.1sy r6 = r1.A0o
            r42 = r8
            r43 = r4
            r44 = r3
            r45 = r6
            r46 = r9
            r47 = r52
            r48 = r51
            r49 = r15
            android.text.Layout r43 = r42.A0C(r43, r44, r45, r46, r47, r48, r49, r50)
            X.1sy r12 = r1.A0o
            java.lang.String r50 = r0.getId()
            if (r50 == 0) goto L_0x0371
            X.3ZH r46 = r0.A1Y()
            X.3Ds r6 = X.C238863Ds.USER_MESSAGE
            X.9IE r8 = new X.9IE
            r8.<init>((X.C238863Ds) r6)
            X.3dY r7 = new X.3dY
            r7.<init>(r3, r0, r1, r9)
            X.5Hq r6 = new X.5Hq
            r42 = r6
            r44 = r8
            r45 = r3
            r47 = r7
            r48 = r1
            r49 = r12
            r42.<init>(r43, r44, r45, r46, r47, r48, r49, r50, r51, r52)
            if (r19 == 0) goto L_0x0293
            r3 = 1184881067(0x469fd9ab, float:20460.834)
            X.0fS.A00(r3)
        L_0x0293:
            r10.add(r6)
            goto L_0x01fa
        L_0x0298:
            r51 = 0
            goto L_0x0242
        L_0x029b:
            r34 = r21
            goto L_0x01e0
        L_0x029f:
            r36 = r21
            goto L_0x01c1
        L_0x02a3:
            r31 = r21
            goto L_0x01b3
        L_0x02a7:
            X.4LK r8 = X.AnonymousClass4LK.A00
            boolean r8 = r8.A05(r6, r0)
            if (r8 == 0) goto L_0x02c8
            com.instagram.api.schemas.CommentPrompt r8 = X.AnonymousClass4LK.A00(r0)
            java.lang.String r45 = ""
            if (r8 == 0) goto L_0x0189
            android.content.res.Resources r9 = r4.getResources()
            X.0qQ.A07(r9)
            java.lang.String r6 = X.AnonymousClass4LK.A02(r9, r8, r6, r15)
            if (r6 == 0) goto L_0x0189
            r45 = r6
            goto L_0x0189
        L_0x02c8:
            X.2ib r6 = r7.A01
            boolean r6 = r6.A02(r0)
            if (r6 == 0) goto L_0x02dc
            r6 = 2131976609(0x7f1361a1, float:1.9590343E38)
        L_0x02d3:
            java.lang.String r45 = r4.getString(r6)
        L_0x02d7:
            X.0qQ.A07(r45)
            goto L_0x0189
        L_0x02dc:
            int r8 = r0.A0r()
            if (r8 != r11) goto L_0x02e6
            r6 = 2131976605(0x7f13619d, float:1.9590335E38)
            goto L_0x02d3
        L_0x02e6:
            java.util.Locale r6 = X.AnonymousClass1Q2.A02()
            java.text.NumberFormat r6 = java.text.NumberFormat.getInstance(r6)
            long r8 = (long) r8
            java.lang.String r6 = r6.format(r8)
            X.0qQ.A07(r6)
            r8 = 2131976610(0x7f1361a2, float:1.9590345E38)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r45 = r4.getString(r8, r6)
            goto L_0x02d7
        L_0x0302:
            r32 = r21
            goto L_0x01a7
        L_0x0306:
            boolean r19 = com.facebook.systrace.Systrace.A0E(r16)
            if (r19 == 0) goto L_0x0314
            r8 = -309232985(0xffffffffed917aa7, float:-5.6279505E27)
            java.lang.String r6 = "MediaCaptionUseCase#getUiState"
            X.0fS.A01(r6, r8)
        L_0x0314:
            X.3gp r6 = r3.A00()
            int r9 = r3.A04
            X.1sy r8 = r1.A0o
            java.lang.String r12 = r5.getModuleName()
            X.1sy r10 = r1.A0o
            boolean r49 = X.AnonymousClass3VO.A06(r13, r0, r10, r12)
            int r10 = r1.A03
            boolean r50 = X.1sx.A0I(r6, r10)
            X.0Pl r7 = r7.A00
            r42 = r7
            r43 = r4
            r44 = r6
            r45 = r8
            r46 = r9
            r47 = r15
            r48 = r15
            android.text.Layout r29 = r42.A0C(r43, r44, r45, r46, r47, r48, r49, r50)
            X.3ZH r32 = r0.A1Y()
            X.3Ds r8 = X.C238863Ds.USER_MESSAGE
            X.9IE r7 = new X.9IE
            r7.<init>((X.C238863Ds) r8)
            X.3hW r39 = new X.3hW
            r28 = r39
            r30 = r7
            r31 = r6
            r33 = r1
            r28.<init>(r29, r30, r31, r32, r33)
            if (r19 == 0) goto L_0x012c
            r6 = 412000837(0x188ea245, float:3.686999E-24)
            X.0fS.A00(r6)
            goto L_0x012c
        L_0x0362:
            r18 = r9
            goto L_0x011d
        L_0x0366:
            r6 = r0
            goto L_0x00e8
        L_0x0369:
            r35 = r21
            goto L_0x00bc
        L_0x036d:
            r41 = r21
            goto L_0x00b2
        L_0x0371:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0379:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0381:
            r10 = r21
        L_0x0383:
            if (r26 == 0) goto L_0x03f8
            X.0eM r3 = r2.A0B
            java.lang.Object r3 = r3.getValue()
            X.3go r3 = (X.C247723go) r3
            X.9IP r29 = r3.A00(r4, r0, r1)
        L_0x0391:
            X.0eM r3 = r2.A0D
            java.lang.Object r3 = r3.getValue()
            X.3hI r3 = (X.C248023hI) r3
            X.9IV r30 = r3.A01(r0, r5, r1)
            X.0eM r3 = r2.A08
            java.lang.Object r3 = r3.getValue()
            X.3hO r3 = (X.C248083hO) r3
            java.lang.Integer r6 = X.AnonymousClass05K.A00
            int r44 = r3.A00(r4, r0, r6)
            boolean r6 = r2.A0M
            if (r6 == 0) goto L_0x03f5
            X.0eM r3 = r2.A05
            java.lang.Object r3 = r3.getValue()
            X.HqX r3 = (X.C55966HqX) r3
            r7 = r58
            X.3ha r38 = r3.A00(r0, r5, r1, r7)
        L_0x03bd:
            boolean r3 = r0.CcK()
            if (r3 == 0) goto L_0x03d9
            boolean r3 = r0.A4z()
            if (r3 == 0) goto L_0x03d9
            r3 = r21
            boolean r3 = X.C231122qu.A0P(r3, r0)
            if (r3 != 0) goto L_0x03d9
            X.3Yh r2 = r2.A0F
            if (r2 == 0) goto L_0x03d9
            X.JwM r21 = r2.A00(r4, r0, r1)
        L_0x03d9:
            X.2ib r42 = X.AnonymousClass3YZ.A00(r13)
            X.3hT r28 = new X.3hT
            r33 = r18
            r37 = r21
            r43 = r10
            r45 = r6
            r46 = r24
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)
            if (r27 == 0) goto L_0x03f4
            r0 = 1421711778(0x54bd99a2, float:6.5146108E12)
            X.0fS.A00(r0)
        L_0x03f4:
            return r28
        L_0x03f5:
            r38 = r21
            goto L_0x03bd
        L_0x03f8:
            r29 = r21
            goto L_0x0391
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C243333Yi.A01(android.content.Context, X.1Xj, X.4DU, X.3W1, X.3kK, boolean):X.3hT");
    }
}
