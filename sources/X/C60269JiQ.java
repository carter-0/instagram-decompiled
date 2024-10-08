package X;

import com.instagram.avatars.graphql.AvatarStickerGraphQLRepository;
import com.instagram.common.session.UserSession;

/* renamed from: X.JiQ  reason: case insensitive filesystem */
public final class C60269JiQ extends 2YL {
    public final AvatarStickerGraphQLRepository A00;
    public final UserSession A01;
    public final String A02;
    public final String A03;
    public final 05G A04 = DbS.A10(new C49640Ezx(C62618Kip.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "", "", (String) null, false));

    /* JADX WARNING: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C43750C7u r16, X.C60269JiQ r17) {
        /*
            r2 = 0
            if (r16 == 0) goto L_0x00a8
            X.C7t r0 = r16.A0E()
            if (r0 == 0) goto L_0x00a8
            X.C7s r0 = r0.A0E()
            if (r0 == 0) goto L_0x00a8
            X.C7r r0 = r0.A0E()
            if (r0 == 0) goto L_0x00a8
            com.google.common.collect.ImmutableList r1 = r0.A0E()
            if (r1 == 0) goto L_0x00a8
            r0 = 0
            java.lang.Object r4 = X.00k.A0O(r1, r0)
            X.3lr r4 = (X.C250663lr) r4
        L_0x0022:
            r3 = r17
            X.05G r6 = r3.A04
            r13 = 1
            if (r4 == 0) goto L_0x00a6
            java.lang.String r0 = "id"
            java.lang.String r10 = r4.A07(r0)
        L_0x002f:
            java.lang.String r7 = ""
            r14 = r7
            if (r10 != 0) goto L_0x0035
            r10 = r7
        L_0x0035:
            if (r4 == 0) goto L_0x003f
            java.lang.String r0 = "cdn_url"
            java.lang.String r11 = r4.getOptionalStringField(r13, r0)
            if (r11 != 0) goto L_0x0091
        L_0x003f:
            r11 = r7
            if (r4 != 0) goto L_0x0091
            r9 = r2
            r12 = r2
        L_0x0044:
            X.Ezx r8 = new X.Ezx
            r8.<init>(r9, r10, r11, r12, r13)
            r6.Epw(r8)
            if (r4 == 0) goto L_0x0061
            java.lang.String r0 = "cdn_url"
            java.lang.String r0 = r4.getOptionalStringField(r13, r0)
            if (r0 == 0) goto L_0x0057
            r7 = r0
        L_0x0057:
            X.Kip r2 = X.C62618Kip.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r1 = 10
            java.lang.String r0 = "media_type"
            java.lang.Enum r2 = r4.getOptionalEnumField(r1, r0, r2)
        L_0x0061:
            X.6nz r0 = X.C317876nz.A1e
            java.lang.String r13 = r3.A03
            com.instagram.common.typedurl.SimpleImageUrl r12 = X.DbS.A0V(r7)
            r15 = 1142292480(0x44160000, float:600.0)
            r17 = 1056964608(0x3f000000, float:0.5)
            r16 = r15
            X.6o8 r0 = X.C317966o8.A00(r12, r13, r14, r15, r16, r17)
            java.util.List r1 = X.AnonymousClass7TE.A1I(r0)
            X.Kip r0 = X.C62618Kip.CLIP
            if (r2 != r0) goto L_0x008e
            X.6oG r0 = X.C318046oG.AVATAR_ANIMATED
        L_0x007d:
            X.6nz r2 = new X.6nz
            r2.<init>(r0, r13, r1)
            com.instagram.avatars.graphql.AvatarStickerGraphQLRepository r0 = r3.A00
            X.6ay r0 = r0.A01
            java.lang.String r1 = r2.A0Z
            android.util.LruCache r0 = r0.A00
            r0.put(r1, r2)
            return
        L_0x008e:
            X.6oG r0 = X.C318046oG.AVATAR_STATIC
            goto L_0x007d
        L_0x0091:
            X.Kip r5 = X.C62618Kip.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r1 = 10
            java.lang.String r0 = "media_type"
            java.lang.Enum r9 = r4.getOptionalEnumField(r1, r0, r5)
            X.Kip r9 = (X.C62618Kip) r9
            r1 = 9
            java.lang.String r0 = "accessibility_label"
            java.lang.String r12 = r4.getOptionalStringField(r1, r0)
            goto L_0x0044
        L_0x00a6:
            r10 = r2
            goto L_0x002f
        L_0x00a8:
            r4 = r2
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60269JiQ.A00(X.C7u, X.JiQ):void");
    }

    public C60269JiQ(AvatarStickerGraphQLRepository avatarStickerGraphQLRepository, UserSession userSession, String str, String str2) {
        C51974G9v.A1L(userSession, str, avatarStickerGraphQLRepository);
        this.A01 = userSession;
        this.A03 = str;
        this.A02 = str2;
        this.A00 = avatarStickerGraphQLRepository;
    }
}
