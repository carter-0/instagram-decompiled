package com.instagram.stickersearch;

import X.0qQ;
import X.25x;
import X.AnonymousClass05E;
import X.AnonymousClass4D7;
import X.AnonymousClass7TG;
import X.C317846nw;
import X.C317866ny;
import X.C318056oJ;
import X.C318076oL;
import X.C61082JwK;
import X.C63509KyK;
import android.content.Context;
import com.instagram.avatars.store.AvatarStore;
import com.instagram.common.session.UserSession;
import com.instagram.stickersearch.api.ODRAvatarStickerRepository;

public final class AvatarStickerInteractor {
    public final Context A00;
    public final AvatarStore A01;
    public final UserSession A02;
    public final C318056oJ A03;
    public final ODRAvatarStickerRepository A04;

    public /* synthetic */ AvatarStickerInteractor(Context context, UserSession userSession, int i) {
        C318056oJ r3;
        AvatarStore avatarStore;
        if ((i & 2) != 0) {
            r3 = new C318056oJ(userSession);
        } else {
            r3 = null;
        }
        if ((i & 4) != 0) {
            avatarStore = 25x.A00(userSession);
        } else {
            avatarStore = null;
        }
        ODRAvatarStickerRepository oDRAvatarStickerRepository = null;
        context = (i & 8) != 0 ? null : context;
        if (!((i & 16) == 0 || !C318076oL.A00(userSession) || context == null)) {
            0qQ.A0B(userSession, 0);
            oDRAvatarStickerRepository = new ODRAvatarStickerRepository(C63509KyK.A00(context, userSession));
        }
        AnonymousClass7TG.A1U(userSession, r3, avatarStore);
        this.A02 = userSession;
        this.A03 = r3;
        this.A01 = avatarStore;
        this.A00 = context;
        this.A04 = oDRAvatarStickerRepository;
    }

    /* JADX WARNING: type inference failed for: r14v2, types: [X.MEB, X.4D7] */
    /* JADX WARNING: type inference failed for: r14v5 */
    /* JADX WARNING: type inference failed for: r14v6 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C61082JwK r11, X.C317846nw r12, X.C317866ny r13, com.instagram.stickersearch.AvatarStickerInteractor r14, java.lang.Integer r15, java.lang.String r16, X.AnonymousClass4D7 r17) {
        /*
            r4 = r14
            r3 = 43
            r5 = r17
            boolean r0 = X.MEB.A03(r3, r5)
            if (r0 == 0) goto L_0x007d
            r14 = r5
            X.MEB r14 = (X.MEB) r14
            int r2 = r14.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x007d
            int r2 = r2 - r1
            r14.A00 = r2
        L_0x0019:
            java.lang.Object r3 = r14.A02
            X.1Hj r2 = X.1Hj.A02
            int r0 = r14.A00
            r1 = 1
            if (r0 == 0) goto L_0x0061
            if (r0 != r1) goto L_0x009a
            java.lang.Object r4 = r14.A01
            com.instagram.stickersearch.AvatarStickerInteractor r4 = (com.instagram.stickersearch.AvatarStickerInteractor) r4
            X.0eS.A00(r3)
        L_0x002b:
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0058
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r2 = r3.A00
            X.K1h r2 = (X.C61294K1h) r2
            r0 = 0
            r2.A09 = r0
            X.0nO r1 = X.0nY.A00()
            X.KIr r0 = new X.KIr
            r0.<init>(r4, r2)
            r1.ATE(r0)
            X.KZx r0 = new X.KZx
            r0.<init>(r2)
            X.3Ih r3 = X.C41845B3m.A0d(r0)
        L_0x004f:
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0083
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r2 = r3.A00
            return r2
        L_0x0058:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 != 0) goto L_0x004f
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0061:
            X.0eS.A00(r3)
            X.6oJ r0 = r4.A03
            java.lang.Integer r9 = X.AnonymousClass05K.A01
            r10 = 0
            r14.A01 = r4
            r14.A00 = r1
            X.6oK r5 = r0.A02
            r6 = r11
            r7 = r12
            r8 = r13
            r11 = r15
            r12 = r16
            r13 = r10
            java.lang.Object r3 = r5.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            if (r3 != r2) goto L_0x002b
            return r2
        L_0x007d:
            X.MEB r14 = new X.MEB
            r14.<init>(r3, r5)
            goto L_0x0019
        L_0x0083:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0095
            X.4dm r0 = X.JTP.A0N(r3)
            java.lang.Throwable r0 = r0.A01()
            X.KZw r2 = new X.KZw
            r2.<init>(r0)
            return r2
        L_0x0095:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x009a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.stickersearch.AvatarStickerInteractor.A00(X.JwK, X.6nw, X.6ny, com.instagram.stickersearch.AvatarStickerInteractor, java.lang.Integer, java.lang.String, X.4D7):java.lang.Object");
    }

    public final AnonymousClass05E A03(C61082JwK jwK, C317846nw r14, C317866ny r15, Integer num, Integer num2, String str, boolean z, boolean z2) {
        0qQ.A0B(r14, 1);
        return new AnonymousClass05E(new AvatarStickerInteractor$loadAvatarStickers$1(jwK, r14, r15, this, num, num2, str, (AnonymousClass4D7) null, z, z2));
    }

    /* JADX WARNING: type inference failed for: r12v1, types: [X.MEB, X.4D7] */
    /* JADX WARNING: type inference failed for: r12v4 */
    /* JADX WARNING: type inference failed for: r12v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.C61082JwK r14, X.C317846nw r15, X.C317866ny r16, java.lang.Integer r17, java.lang.Integer r18, java.lang.String r19, X.AnonymousClass4D7 r20) {
        /*
            r13 = this;
            r3 = 42
            r4 = r20
            boolean r0 = X.MEB.A03(r3, r4)
            if (r0 == 0) goto L_0x006d
            r12 = r4
            X.MEB r12 = (X.MEB) r12
            int r2 = r12.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x006d
            int r2 = r2 - r1
            r12.A00 = r2
        L_0x0018:
            java.lang.Object r3 = r12.A01
            X.1Hj r2 = X.1Hj.A02
            int r0 = r12.A00
            r1 = 1
            if (r0 == 0) goto L_0x0050
            if (r0 != r1) goto L_0x008a
            X.0eS.A00(r3)
        L_0x0026:
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0047
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r1 = r3.A00
            X.K1h r1 = (X.C61294K1h) r1
            r0 = 0
            r1.A09 = r0
            X.KZx r0 = new X.KZx
            r0.<init>(r1)
            X.3Ih r3 = X.C41845B3m.A0d(r0)
        L_0x003e:
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0073
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r2 = r3.A00
            return r2
        L_0x0047:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 != 0) goto L_0x003e
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0050:
            X.0eS.A00(r3)
            X.6oJ r0 = r13.A03
            java.lang.Integer r7 = X.AnonymousClass05K.A01
            r11 = 0
            r12.A00 = r1
            X.6oK r3 = r0.A02
            r4 = r14
            r5 = r15
            r6 = r16
            r8 = r17
            r9 = r18
            r10 = r19
            java.lang.Object r3 = r3.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            if (r3 != r2) goto L_0x0026
            return r2
        L_0x006d:
            X.MEB r12 = new X.MEB
            r12.<init>(r13, r4, r3, r3)
            goto L_0x0018
        L_0x0073:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0085
            X.4dm r0 = X.JTP.A0N(r3)
            java.lang.Throwable r0 = r0.A01()
            X.KZw r2 = new X.KZw
            r2.<init>(r0)
            return r2
        L_0x0085:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x008a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.stickersearch.AvatarStickerInteractor.A01(X.JwK, X.6nw, X.6ny, java.lang.Integer, java.lang.Integer, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r17v0, types: [X.4D7] */
    /* JADX WARNING: type inference failed for: r6v2, types: [X.4D7] */
    /* JADX WARNING: type inference failed for: r29v0, types: [X.4D7] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0130 A[PHI: r1 
      PHI: (r1v1 java.lang.Object) = (r1v2 java.lang.Object), (r1v8 java.lang.Object), (r1v9 java.lang.Object), (r1v0 java.lang.Object) binds: [B:28:0x00f2, B:41:0x0128, B:23:0x00cb, B:44:0x012d] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.C61082JwK r31, X.C317846nw r32, X.C317866ny r33, java.lang.Integer r34, X.AnonymousClass4D7 r35) {
        /*
            r30 = this;
            r4 = r33
            r5 = r32
            r6 = r31
            r7 = r34
            r12 = 0
            r3 = 5
            r8 = r35
            boolean r0 = X.C59814JZl.A01(r3, r8)
            r13 = r30
            if (r0 == 0) goto L_0x003b
            r11 = r8
            X.JZl r11 = (X.C59814JZl) r11
            int r2 = r11.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x003b
            int r2 = r2 - r1
            r11.A00 = r2
        L_0x0022:
            java.lang.Object r1 = r11.A07
            X.1Hj r10 = X.1Hj.A02
            int r2 = r11.A00
            r19 = 3
            r9 = 2
            r8 = 1
            if (r2 == 0) goto L_0x005f
            if (r2 == r8) goto L_0x012d
            if (r2 == r9) goto L_0x0041
            r0 = r19
            if (r2 == r0) goto L_0x012d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x003b:
            X.JZl r11 = new X.JZl
            r11.<init>(r13, r8, r3)
            goto L_0x0022
        L_0x0041:
            java.lang.Object r9 = r11.A06
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r7 = r11.A05
            java.lang.Integer r7 = (java.lang.Integer) r7
            java.lang.Object r6 = r11.A04
            X.JwK r6 = (X.C61082JwK) r6
            java.lang.Object r5 = r11.A03
            X.6nw r5 = (X.C317846nw) r5
            java.lang.Object r4 = r11.A02
            X.6ny r4 = (X.C317866ny) r4
            java.lang.Object r3 = r11.A01
            com.instagram.stickersearch.AvatarStickerInteractor r3 = (com.instagram.stickersearch.AvatarStickerInteractor) r3
            X.0eS.A00(r1)
            r2 = r1
            r1 = r10
            goto L_0x00cf
        L_0x005f:
            X.0eS.A00(r1)
            boolean r14 = X.DbW.A1S(r8, r4, r5)
            X.6oJ r3 = r13.A03
            X.26t r1 = r3.A01
            X.6nx r2 = X.C317846nw.A01
            com.instagram.common.session.UserSession r0 = r3.A00
            java.lang.String r15 = r2.A00(r5, r4, r0, r14)
            X.0qQ.A0B(r15, r14)
            X.0xa r1 = r1.A00
            java.lang.String r0 = "KEY_AVATAR_CDN_EXPIRY"
            java.lang.String r0 = X.002.A0R(r0, r15)
            long r17 = X.DbW.A06(r1, r0)
            long r15 = X.AnonymousClass7TG.A0I()
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x010e
            com.instagram.common.session.UserSession r0 = r13.A02
            if (r31 == 0) goto L_0x00f5
            boolean r15 = r6.A01
        L_0x008f:
            java.lang.String r15 = r2.A00(r5, r4, r0, r15)
            X.0qQ.A0B(r15, r14)
            java.lang.String r0 = "KEY_FORCE_CACHE_REQUEST"
            java.lang.String r0 = X.002.A0R(r0, r15)
            boolean r0 = r1.getBoolean(r0, r14)
            if (r0 != 0) goto L_0x010e
            java.lang.Integer r24 = X.AnonymousClass05K.A0C
            r11.A01 = r13
            r11.A02 = r4
            r11.A03 = r5
            r11.A04 = r6
            r11.A05 = r7
            r11.A06 = r12
            r11.A00 = r9
            r1 = r10
            X.6oK r0 = r3.A02
            r23 = r4
            r25 = r12
            r26 = r7
            r27 = r12
            r28 = r12
            r29 = r11
            r20 = r0
            r21 = r6
            r22 = r5
            java.lang.Object r2 = r20.A00(r21, r22, r23, r24, r25, r26, r27, r28, r29)
            if (r2 == r10) goto L_0x0130
            r9 = r12
            r3 = r13
        L_0x00cf:
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00f7
            r11.A01 = r12
            r11.A02 = r12
            r11.A03 = r12
            r11.A04 = r12
            r11.A05 = r12
            r11.A06 = r12
            r0 = r19
            r11.A00 = r0
            r13 = r4
            r14 = r3
            r15 = r7
            r16 = r9
            r17 = r11
            r11 = r6
            r12 = r5
            java.lang.Object r0 = A00(r11, r12, r13, r14, r15, r16, r17)
            if (r0 == r10) goto L_0x0130
            return r0
        L_0x00f5:
            r15 = 0
            goto L_0x008f
        L_0x00f7:
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0109
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r0 = r2.A00
            X.K1h r0 = (X.C61294K1h) r0
            r0.A09 = r8
            X.KZx r1 = new X.KZx
            r1.<init>(r0)
            return r1
        L_0x0109:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x010e:
            com.instagram.common.session.UserSession r1 = r13.A02
            if (r31 == 0) goto L_0x012b
            boolean r0 = r6.A01
        L_0x0114:
            java.lang.String r0 = r2.A00(r5, r4, r1, r0)
            r3.A00(r14, r0)
            r11.A00 = r8
            r0 = r6
            r1 = r5
            r2 = r4
            r3 = r13
            r4 = r7
            r5 = r12
            r6 = r11
            java.lang.Object r1 = A00(r0, r1, r2, r3, r4, r5, r6)
            if (r1 != r10) goto L_0x0130
            return r10
        L_0x012b:
            r0 = 0
            goto L_0x0114
        L_0x012d:
            X.0eS.A00(r1)
        L_0x0130:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.stickersearch.AvatarStickerInteractor.A02(X.JwK, X.6nw, X.6ny, java.lang.Integer, X.4D7):java.lang.Object");
    }
}
