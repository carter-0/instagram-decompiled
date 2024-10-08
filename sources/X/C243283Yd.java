package X;

import com.instagram.common.session.UserSession;
import java.util.Arrays;

/* renamed from: X.3Yd  reason: invalid class name and case insensitive filesystem */
public final class C243283Yd {
    public final 1Ng A00;
    public final UserSession A01;
    public final 0Pl A02;
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A01(new AnonymousClass9LP(this, 0));

    public final int A00(1Xj r4) {
        Object[] objArr;
        0qQ.A0B(r4, 0);
        boolean A002 = C243353Yk.A00(this.A01, r4);
        if (!A002 || r4.A0v() <= 0) {
            objArr = new Object[]{Integer.valueOf(r4.A0v()), Boolean.valueOf(A002)};
        } else {
            objArr = new Object[]{Boolean.valueOf(A002)};
        }
        return Arrays.hashCode(objArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a1, code lost:
        if (r37 != false) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f2, code lost:
        if ((!r0.isEmpty()) != true) goto L_0x00f4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C247673gj A01(X.1Xj r34, X.AnonymousClass4DU r35, X.AnonymousClass3W1 r36, boolean r37) {
        /*
            r33 = this;
            r10 = 0
            r8 = r34
            X.0qQ.A0B(r8, r10)
            r6 = 1
            r7 = r36
            X.0qQ.A0B(r7, r6)
            r0 = 2
            r14 = r35
            X.0qQ.A0B(r14, r0)
            r0 = 1
            boolean r15 = com.facebook.systrace.Systrace.A0E(r0)
            if (r15 == 0) goto L_0x0022
            r1 = -1461650553(0xffffffffa8e0fb87, float:-2.4978078E-14)
            java.lang.String r0 = "MediaFeedbackUseCase#getUiState"
            X.0fS.A01(r0, r1)
        L_0x0022:
            X.2kQ r5 = X.C227942kP.A00(r14)
            r9 = r33
            com.instagram.common.session.UserSession r4 = r9.A01
            java.lang.String r1 = X.C231122qu.A0B(r4, r8)
            X.1sy r0 = r7.A0o
            boolean r0 = X.1sx.A0O(r8, r0)
            if (r0 == 0) goto L_0x0195
            if (r1 == 0) goto L_0x0195
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0195
            X.3ut r3 = new X.3ut
            r3.<init>(r1)
        L_0x0043:
            X.3gQ r3 = (X.C247493gQ) r3
            X.0qQ.A0B(r4, r10)
            X.0Tu r13 = X.0Tu.A05
            r0 = 36324037365935820(0x810c8500012ecc, double:3.034805723151671E-306)
            boolean r2 = X.182.A06(r13, r4, r0)
            java.lang.String r1 = X.C231122qu.A0D(r4, r8)
            if (r2 != 0) goto L_0x0191
            X.1sy r0 = r7.A0o
            boolean r0 = X.1sx.A0O(r8, r0)
            if (r0 == 0) goto L_0x0191
            if (r1 == 0) goto L_0x0191
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0191
            X.3us r12 = new X.3us
            r12.<init>(r1)
        L_0x006e:
            X.3xx r1 = X.C231122qu.A02(r4, r8)
            com.instagram.api.schemas.IGAdTransparencyDisclaimerPlacement r0 = com.instagram.api.schemas.IGAdTransparencyDisclaimerPlacement.BELOW_IMAGE
            java.lang.String r1 = X.C247573gZ.A00(r0, r1)
            if (r2 == 0) goto L_0x018d
            if (r1 == 0) goto L_0x018d
            int r0 = r1.length()
            if (r0 == 0) goto L_0x018d
            X.3ur r2 = new X.3ur
            r2.<init>(r1)
        L_0x0087:
            X.3gd r2 = (X.C247613gd) r2
            X.3ZH r22 = r8.A1Y()
            java.lang.String r23 = r8.getId()
            if (r23 == 0) goto L_0x0199
            X.1sy r0 = r7.A0o
            java.lang.String r1 = r5.A00
            boolean r0 = X.AnonymousClass3VO.A07(r4, r8, r0, r1)
            r21 = r37
            if (r0 == 0) goto L_0x00a3
            r24 = 1
            if (r37 == 0) goto L_0x00a5
        L_0x00a3:
            r24 = 0
        L_0x00a5:
            X.1sy r11 = r7.A0o
            X.1sy r0 = X.1sy.A0O
            r25 = 0
            if (r11 == r0) goto L_0x011a
            X.1Xy r0 = r8.A0C
            java.util.List r0 = r0.BxO()
            if (r0 == 0) goto L_0x00f4
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != r6) goto L_0x00f4
            X.1Xy r0 = r8.A0C
            java.util.List r0 = r0.BxO()
            if (r0 == 0) goto L_0x018a
            java.lang.Object r0 = X.00k.A0O(r0, r10)
            X.3yf r0 = (X.C258223yf) r0
            if (r0 == 0) goto L_0x018a
            com.instagram.api.schemas.SocialContextType r0 = r0.BxW()
        L_0x00d1:
            com.instagram.api.schemas.SocialContextType r11 = com.instagram.api.schemas.SocialContextType.FOLLOWED_BY
            if (r0 != r11) goto L_0x00f4
            X.1Xy r0 = r8.A0C
            java.util.List r0 = r0.BxO()
            if (r0 == 0) goto L_0x00f4
            java.lang.Object r0 = X.00k.A0O(r0, r10)
            X.3yf r0 = (X.C258223yf) r0
            if (r0 == 0) goto L_0x00f4
            java.util.List r0 = r0.BxQ()
            if (r0 == 0) goto L_0x00f4
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            r10 = 1
            if (r0 == r6) goto L_0x00f5
        L_0x00f4:
            r10 = 0
        L_0x00f5:
            boolean r0 = X.C247623ge.A00(r4, r8, r1)
            if (r0 == 0) goto L_0x0101
            boolean r0 = X.C247643gg.A0B(r4, r8)
            if (r0 == 0) goto L_0x0102
        L_0x0101:
            r6 = 0
        L_0x0102:
            boolean r0 = r8.CcK()
            if (r0 == 0) goto L_0x011a
            X.3Yy r0 = X.C243483Yy.A00
            java.util.List r0 = r0.A06(r4, r8)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x011a
            if (r6 == 0) goto L_0x011a
            if (r10 == 0) goto L_0x011a
            r25 = 1
        L_0x011a:
            X.0eM r0 = r9.A03
            java.lang.Object r0 = r0.getValue()
            X.3gf r0 = (X.C247633gf) r0
            r16 = r0
            r17 = r8
            r18 = r14
            r19 = r7
            r20 = r1
            X.3gi r18 = r16.A01(r17, r18, r19, r20, r21)
            r0 = 15
            X.9MC r11 = new X.9MC
            r11.<init>(r0, r9, r8, r5)
            r0 = 23
            X.9M5 r6 = new X.9M5
            r6.<init>(r0, r9, r8)
            r0 = 24
            X.9M5 r5 = new X.9M5
            r5.<init>(r0, r9, r8)
            r0 = 41
            X.9Lz r1 = new X.9Lz
            r1.<init>(r0, r8, r9)
            r0 = 25
            X.9M5 r9 = new X.9M5
            r9.<init>(r0, r7, r8)
            r10 = 26
            X.9M5 r0 = new X.9M5
            r0.<init>(r10, r7, r8)
            X.9Ij r17 = new X.9Ij
            r26 = r17
            r27 = r1
            r28 = r11
            r29 = r6
            r30 = r5
            r31 = r9
            r32 = r0
            r26.<init>((X.C62320sa) r27, (X.0sP) r28, (X.0sP) r29, (X.0sP) r30, (X.0sP) r31, (X.0sP) r32)
            r0 = 36324694495998201(0x810d1e000230f9, double:3.0352212948491714E-306)
            boolean r26 = X.182.A06(r13, r4, r0)
            X.3gj r16 = new X.3gj
            r19 = r2
            r20 = r3
            r21 = r12
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            if (r15 == 0) goto L_0x0189
            r0 = 1994453939(0x76e0f3b3, float:2.2812838E33)
            X.0fS.A00(r0)
        L_0x0189:
            return r16
        L_0x018a:
            r0 = 0
            goto L_0x00d1
        L_0x018d:
            X.3gc r2 = X.C247603gc.A00
            goto L_0x0087
        L_0x0191:
            X.3gS r12 = X.C247513gS.A00
            goto L_0x006e
        L_0x0195:
            X.3gP r3 = X.C247483gP.A00
            goto L_0x0043
        L_0x0199:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C243283Yd.A01(X.1Xj, X.4DU, X.3W1, boolean):X.3gj");
    }

    public C243283Yd(UserSession userSession, 0Pl r4) {
        this.A01 = userSession;
        this.A02 = r4;
        this.A00 = AnonymousClass1Nd.A00(userSession);
    }
}
