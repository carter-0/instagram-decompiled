package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import kotlin.Deprecated;

@Deprecated(message = "")
/* renamed from: X.5qN  reason: invalid class name and case insensitive filesystem */
public final class C296625qN {
    public static final C296625qN A00 = new Object();

    public static final void A00(Context context, UserSession userSession, 1Xj r5, AnonymousClass4DU r6, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(context, 1);
        A00.A02(userSession, r5, r6, "video_full_viewed_time", i, i2, i3, i4, i5, i6, z);
    }

    public static final void A01(Context context, UserSession userSession, 1Xj r5, AnonymousClass4DU r6, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(context, 1);
        A00.A02(userSession, r5, r6, "video_viewed_time", i, i2, i3, i4, i5, i6, z);
    }

    /* JADX WARNING: type inference failed for: r8v3, types: [X.4Nx] */
    /* JADX WARNING: type inference failed for: r18v2, types: [X.5qP] */
    /* JADX WARNING: type inference failed for: r18v3, types: [X.5qO] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x019e, code lost:
        X.0KC.A0O("StructuredVideoEvent", "Follow status: %s not handled. Using 'unknown' instead.", new java.lang.Object[]{r5});
        r0 = X.C264094Oo.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01f7, code lost:
        if (r5.equals("unknown") != false) goto L_0x01f9;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A02(com.instagram.common.session.UserSession r29, X.1Xj r30, X.AnonymousClass4DU r31, java.lang.String r32, int r33, int r34, int r35, int r36, int r37, int r38, boolean r39) {
        /*
            r28 = this;
            X.1wD r0 = X.1w8.A00()
            int r0 = r0.A0C
            float r1 = (float) r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r0
            r0 = r33
            r2 = r35
            int r23 = java.lang.Math.min(r0, r2)
            java.lang.String r0 = "video_full_viewed_time"
            r3 = r32
            boolean r0 = r3.equals(r0)
            r17 = 0
            r11 = r29
            r10 = r30
            r24 = r34
            r9 = r37
            r22 = r38
            r27 = r39
            if (r0 == 0) goto L_0x0126
            X.5qO r8 = new X.5qO
            r20 = r10
            r21 = r1
            r25 = r2
            r26 = r9
            r18 = r8
            r19 = r11
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27)
        L_0x003b:
            X.4O3 r1 = new X.4O3
            r1.<init>()
            java.lang.String r0 = r10.getId()
            java.lang.String r0 = X.C231122qu.A0H(r11, r0)
            r1.A0x = r0
            r8.A06 = r1
        L_0x004c:
            r4 = 0
            r3 = 0
            r12 = -1
            java.lang.String r13 = "feed"
            java.lang.String r7 = r10.getId()
            r10.A1A()
            java.lang.String r0 = r10.getId()
            X.C231122qu.A0H(r11, r0)
            r14 = r31
            boolean r0 = X.AnonymousClass3WX.A02(r10, r14)
            if (r0 == 0) goto L_0x0107
            java.lang.String r0 = r10.getId()
            java.lang.String r0 = X.C231122qu.A0I(r11, r0)
        L_0x006f:
            boolean r1 = X.AnonymousClass3WX.A02(r10, r14)
            if (r1 == 0) goto L_0x00f9
            java.lang.String r6 = "ad"
        L_0x0077:
            X.1Xj r1 = r10.A1e(r11)
            com.instagram.user.model.User r1 = r1.A2A(r11)
            r5 = 0
            if (r1 == 0) goto L_0x008e
            java.lang.String r17 = r1.getId()
            com.instagram.user.model.FollowStatus r1 = r1.B6o()
            java.lang.String r5 = X.1aC.A06(r1)
        L_0x008e:
            r10.A1t()
            boolean r1 = r10.CeS()
            if (r1 == 0) goto L_0x00be
            X.3WR r16 = r10.CEL()
            boolean r1 = r16.A08()
            if (r1 == 0) goto L_0x00aa
            r12 = 1
            java.lang.String r1 = r16.A03()
            if (r1 == 0) goto L_0x00f6
            java.lang.String r4 = "dash"
        L_0x00aa:
            r16.A08()
            X.0Tu r15 = X.0Tu.A05
            r1 = 36321988666533762(0x810aa800012782, double:3.0335101174003594E-306)
            boolean r1 = X.182.A06(r15, r11, r1)
            if (r1 != 0) goto L_0x00be
            java.lang.String r3 = r16.A04()
        L_0x00be:
            boolean r1 = r14 instanceof X.C232682uF
            if (r1 == 0) goto L_0x00cc
            r1 = r14
            X.2uF r1 = (X.C232682uF) r1
            X.0jB r1 = r1.E4l(r10)
            r1.A00()
        L_0x00cc:
            boolean r1 = r10.A5D()
            if (r1 == 0) goto L_0x0164
            r1 = -1
            if (r9 == r1) goto L_0x0164
            X.1Xj r9 = r10.A1c(r9)
            if (r9 == 0) goto L_0x0164
            java.lang.String r1 = r9.getId()
            java.lang.String r2 = "Required value was null."
            if (r1 == 0) goto L_0x0145
            r1 = 0
            X.1Xj r1 = r10.A1c(r1)
            if (r1 == 0) goto L_0x014b
            java.lang.String r1 = r1.getId()
            if (r1 != 0) goto L_0x014b
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x00f6:
            java.lang.String r4 = "progressive"
            goto L_0x00aa
        L_0x00f9:
            boolean r1 = X.AnonymousClass3WX.A01(r10, r14)
            if (r1 == 0) goto L_0x0103
            java.lang.String r6 = "organic"
            goto L_0x0077
        L_0x0103:
            java.lang.String r6 = "none"
            goto L_0x0077
        L_0x0107:
            boolean r0 = X.AnonymousClass3WX.A01(r10, r14)
            if (r0 == 0) goto L_0x0115
            X.1Xy r0 = r10.A0C
            java.lang.String r0 = r0.getOrganicTrackingToken()
            goto L_0x006f
        L_0x0115:
            boolean r0 = r10.CUz()
            if (r0 == 0) goto L_0x0123
            X.1Xy r0 = r10.A0C
            java.lang.String r0 = r0.BGe()
            goto L_0x006f
        L_0x0123:
            r0 = 0
            goto L_0x006f
        L_0x0126:
            java.lang.String r0 = "video_viewed_time"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0141
            X.5qP r8 = new X.5qP
            r20 = r10
            r21 = r1
            r25 = r2
            r26 = r9
            r18 = r8
            r19 = r11
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x003b
        L_0x0141:
            r8 = r17
            goto L_0x004c
        L_0x0145:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x014b:
            r10.A0o()
            r9.BR7()
            X.3WR r2 = r9.CEL()
            boolean r1 = r2.A08()
            if (r1 == 0) goto L_0x0164
            r12 = 1
            java.lang.String r1 = r2.A03()
            if (r1 == 0) goto L_0x0201
            java.lang.String r4 = "dash"
        L_0x0164:
            X.0kM r1 = new X.0kM
            r1.<init>(r11)
            r1.A00 = r14
            X.0wc r10 = r1.A00()
            r11 = 0
            if (r8 == 0) goto L_0x01c4
            X.1QJ r1 = X.AnonymousClass1QI.A00
            X.1QM r1 = r1.A02
            java.lang.String r9 = r1.A00
            r8.A0F = r13
            if (r7 == 0) goto L_0x017e
            r8.A09 = r7
        L_0x017e:
            long r1 = r8.A02
            r8.A02 = r1
            r8.A0C = r0
            r8.A0D = r6
            if (r17 != 0) goto L_0x01fc
            r0 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            X.4Ny r0 = new X.4Ny
            r0.<init>(r1)
        L_0x0193:
            r8.A04 = r0
            if (r5 == 0) goto L_0x01f9
            int r0 = r5.hashCode()
            switch(r0) {
                case -284840886: goto L_0x01f1;
                case 237199080: goto L_0x01e6;
                case 517762085: goto L_0x01db;
                case 693933934: goto L_0x01d0;
                case 765915793: goto L_0x01c5;
                default: goto L_0x019e;
            }
        L_0x019e:
            java.lang.Object[] r2 = new java.lang.Object[]{r5}
            java.lang.String r1 = "StructuredVideoEvent"
            java.lang.String r0 = "Follow status: %s not handled. Using 'unknown' instead."
            X.0KC.A0O(r1, r0, r2)
            X.4Oo r0 = X.C264094Oo.UNKNOWN
        L_0x01ab:
            r8.A03 = r0
            r8.A00 = r12
            if (r4 == 0) goto L_0x01b3
            r8.A0B = r4
        L_0x01b3:
            r8.A0E = r3
            r0 = r36
            r8.A01 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            r8.A08 = r0
            r8.A0A = r9
            r8.A00(r10)
        L_0x01c4:
            return
        L_0x01c5:
            java.lang.String r0 = "following"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x019e
            X.4Oo r0 = X.C264094Oo.FOLLOWING
            goto L_0x01ab
        L_0x01d0:
            java.lang.String r0 = "requested"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x019e
            X.4Oo r0 = X.C264094Oo.REQUESTED
            goto L_0x01ab
        L_0x01db:
            java.lang.String r0 = "not_following"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x019e
            X.4Oo r0 = X.C264094Oo.NOT_FOLLOWING
            goto L_0x01ab
        L_0x01e6:
            java.lang.String r0 = "fetching"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x019e
            X.4Oo r0 = X.C264094Oo.FETCHING
            goto L_0x01ab
        L_0x01f1:
            java.lang.String r0 = "unknown"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x019e
        L_0x01f9:
            X.4Oo r0 = X.C264094Oo.UNKNOWN
            goto L_0x01ab
        L_0x01fc:
            X.4Ny r0 = X.C263944Ny.A00(r17)
            goto L_0x0193
        L_0x0201:
            java.lang.String r4 = "progressive"
            goto L_0x0164
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C296625qN.A02(com.instagram.common.session.UserSession, X.1Xj, X.4DU, java.lang.String, int, int, int, int, int, int, boolean):void");
    }
}
