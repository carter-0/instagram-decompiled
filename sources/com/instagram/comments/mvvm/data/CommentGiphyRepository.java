package com.instagram.comments.mvvm.data;

import X.05G;
import X.0qQ;
import X.106;
import X.AnonymousClass43D;
import X.C252733pa;
import X.DbS;
import X.MG7;
import com.instagram.common.session.UserSession;

public final class CommentGiphyRepository extends C252733pa {
    public final UserSession A00;
    public final 05G A01 = 106.A01((Object) null);
    public final 05G A02 = DbS.A10("");

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentGiphyRepository(UserSession userSession) {
        super("CommentGiphySuggestionRepository", AnonymousClass43D.A00(974981769));
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        MG7.A01(this, this.A01, 19);
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDg, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.comments.mvvm.data.CommentGiphyRepository r8, java.lang.String r9, X.AnonymousClass4D7 r10) {
        /*
            r3 = 29
            boolean r0 = X.C66128MDg.A01(r3, r10)
            if (r0 == 0) goto L_0x009e
            r4 = r10
            X.MDg r4 = (X.C66128MDg) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x009e
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A02
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r5 = 3
            r2 = 2
            r7 = 1
            if (r0 == 0) goto L_0x002d
            if (r0 == r7) goto L_0x004a
            if (r0 == r2) goto L_0x007b
            if (r0 != r5) goto L_0x00a5
            X.0eS.A00(r1)
        L_0x002a:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x002d:
            X.0eS.A00(r1)
            com.instagram.common.session.UserSession r6 = r8.A00
            X.Khu r0 = X.C62564Khu.GIPHY_GIFS
            java.util.List r1 = X.AnonymousClass7TE.A1I(r0)
            com.instagram.api.schemas.GiphyRequestSurface r0 = com.instagram.api.schemas.GiphyRequestSurface.COMMENT
            X.1OC r1 = X.C63450KxF.A00(r0, r6, r9, r1)
            r4.A01 = r8
            r4.A00 = r7
            r0 = -5
            java.lang.Object r1 = r1.A00(r0, r4)
            if (r1 != r3) goto L_0x0051
            return r3
        L_0x004a:
            java.lang.Object r8 = r4.A01
            com.instagram.comments.mvvm.data.CommentGiphyRepository r8 = (com.instagram.comments.mvvm.data.CommentGiphyRepository) r8
            X.0eS.A00(r1)
        L_0x0051:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0072
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.K1g r0 = (X.C61293K1g) r0
            X.05G r1 = r8.A01
            X.Kot r0 = r0.A01
            java.util.List r0 = r0.A04
            java.util.List r0 = X.JTR.A16(r0)
            r4.A01 = r8
            r4.A00 = r2
            java.lang.Object r0 = r1.emit(r0, r4)
            if (r0 != r3) goto L_0x0082
            return r3
        L_0x0072:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0086
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x007b:
            java.lang.Object r8 = r4.A01
            com.instagram.comments.mvvm.data.CommentGiphyRepository r8 = (com.instagram.comments.mvvm.data.CommentGiphyRepository) r8
            X.0eS.A00(r1)
        L_0x0082:
            X.3Ih r1 = X.C51967G9n.A0d()
        L_0x0086:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x002a
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00aa
            X.05G r2 = r8.A01
            X.0sn r1 = X.0sn.A00
            r0 = 0
            r4.A01 = r0
            r4.A00 = r5
            java.lang.Object r0 = r2.emit(r1, r4)
            if (r0 != r3) goto L_0x002a
            return r3
        L_0x009e:
            X.MDg r4 = new X.MDg
            r4.<init>(r8, r10, r3)
            goto L_0x0016
        L_0x00a5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00aa:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.comments.mvvm.data.CommentGiphyRepository.A00(com.instagram.comments.mvvm.data.CommentGiphyRepository, java.lang.String, X.4D7):java.lang.Object");
    }
}
