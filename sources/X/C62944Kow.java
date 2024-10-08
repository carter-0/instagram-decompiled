package X;

import com.instagram.direct.avatar.stickers.search.AvatarLocalStickerSearchRepository;
import com.instagram.direct.avatar.stickers.search.AvatarLocalStickerSearchUseCase;

/* renamed from: X.Kow  reason: case insensitive filesystem */
public abstract class C62944Kow {
    /* JADX WARNING: type inference failed for: r4v1, types: [X.ME0, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        if (r0 != null) goto L_0x001f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00fc A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.String r12, X.AnonymousClass4D7 r13) {
        /*
            r11 = this;
            boolean r0 = r11 instanceof X.C62094KZz
            if (r0 == 0) goto L_0x0041
            r2 = r11
            X.KZz r2 = (X.C62094KZz) r2
            com.instagram.stickersearch.api.AvatarStickerSearchRepository r4 = r2.A04
            X.6ny r0 = r2.A02
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x003a
            r0 = 0
            if (r1 == r0) goto L_0x0028
            r0 = 13
            if (r1 != r0) goto L_0x001d
            X.6nw r0 = r2.A01
            if (r0 != 0) goto L_0x001f
        L_0x001d:
            X.6nw r0 = X.C317846nw.STATIC_AVATAR_STICKERS
        L_0x001f:
            java.lang.Object r0 = r4.A01(r0, r12, r13)
            java.lang.Object r5 = X.JTP.A0l(r0)
        L_0x0027:
            return r5
        L_0x0028:
            com.instagram.common.session.UserSession r3 = r2.A03
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317075223876374(0x81063000001316, double:3.030402836478982E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x001d
            X.6nw r0 = X.C317846nw.MIXED_AVATAR_STICKERS
            goto L_0x001f
        L_0x003a:
            com.instagram.common.session.UserSession r0 = r2.A03
            X.6nw r0 = X.C348197y2.A00(r0)
            goto L_0x001f
        L_0x0041:
            r7 = r11
            com.instagram.direct.avatar.stickers.search.AvatarLocalStickerSearchUseCase r7 = (com.instagram.direct.avatar.stickers.search.AvatarLocalStickerSearchUseCase) r7
            r3 = 15
            boolean r0 = X.ME0.A02(r3, r13)
            if (r0 == 0) goto L_0x00fd
            r4 = r13
            X.ME0 r4 = (X.ME0) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00fd
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x005a:
            java.lang.Object r0 = r4.A05
            X.1Hj r5 = X.1Hj.A02
            int r1 = r4.A00
            r6 = 2
            r9 = 1
            if (r1 == 0) goto L_0x006e
            if (r1 == r9) goto L_0x0096
            if (r1 != r6) goto L_0x0104
            X.0eS.A00(r0)
        L_0x006b:
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x006e:
            X.0eS.A00(r0)
            X.05G r3 = r7.A02
            com.instagram.direct.avatar.stickers.search.AvatarLocalStickerSearchRepository r1 = r7.A01
            r4.A01 = r3
            r4.A02 = r12
            r4.A03 = r7
            r4.A04 = r12
            r4.A00 = r9
            java.util.List r0 = r1.A00
            if (r0 != 0) goto L_0x008f
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.A04
            boolean r0 = r0.getAndSet(r9)
            if (r0 != 0) goto L_0x0093
            java.lang.Object r0 = com.instagram.direct.avatar.stickers.search.AvatarLocalStickerSearchRepository.A00(r1, r4)
        L_0x008f:
            if (r0 == r5) goto L_0x0027
            r8 = r12
            goto L_0x00a5
        L_0x0093:
            X.0sn r0 = X.0sn.A00
            goto L_0x008f
        L_0x0096:
            java.lang.Object r8 = r4.A04
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r12 = r4.A02
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r3 = r4.A01
            X.0V2 r3 = (X.0V2) r3
            X.0eS.A00(r0)
        L_0x00a5:
            java.util.List r0 = (java.util.List) r0
            X.Dba.A0j(r9, r8, r0)
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r10 = r0.iterator()
        L_0x00b2:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00e4
            java.lang.Object r2 = r10.next()
            r0 = r2
            X.6nz r0 = (X.C317876nz) r0
            java.util.List r1 = r0.A0P
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x00cc
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x00cc
            goto L_0x00b2
        L_0x00cc:
            java.util.Iterator r1 = r1.iterator()
        L_0x00d0:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00b2
            java.lang.String r0 = X.AnonymousClass7TE.A18(r1)
            boolean r0 = X.00l.A0d(r0, r8, r9)
            if (r0 == 0) goto L_0x00d0
            r7.add(r2)
            goto L_0x00b2
        L_0x00e4:
            r0 = 23
            X.JwE r1 = new X.JwE
            r1.<init>((java.util.List) r7, (int) r0, (java.lang.String) r12)
            r0 = 0
            r4.A01 = r0
            r4.A02 = r0
            r4.A03 = r0
            r4.A04 = r0
            r4.A00 = r6
            java.lang.Object r0 = r3.emit(r1, r4)
            if (r0 != r5) goto L_0x006b
            return r5
        L_0x00fd:
            X.ME0 r4 = new X.ME0
            r4.<init>(r7, r13, r3)
            goto L_0x005a
        L_0x0104:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62944Kow.A00(java.lang.String, X.4D7):java.lang.Object");
    }

    public final void A01() {
        if (this instanceof C62094KZz) {
            ((C62094KZz) this).A04.A03.clear();
            return;
        }
        AvatarLocalStickerSearchRepository avatarLocalStickerSearchRepository = ((AvatarLocalStickerSearchUseCase) this).A01;
        avatarLocalStickerSearchRepository.A00 = null;
        avatarLocalStickerSearchRepository.A04.set(false);
    }
}
