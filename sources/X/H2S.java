package X;

import com.instagram.common.session.UserSession;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class H2S extends C247303g7 {
    public final UserSession A00;
    public final H2U A01;

    public /* synthetic */ H2S(UserSession userSession) {
        H2U h2u = new H2U((H29) null, (H2A) null, (H2B) null, (H2F) null, (H2G) null, (H2R) null, (DefaultConstructorMarker) null, 63);
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = h2u;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ab, code lost:
        if (r7.A07 != com.instagram.api.schemas.MidCardLayoutType.MEGA_CARD) goto L_0x00ad;
     */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.02z A00(X.C53452Gok r11, X.H2S r12, java.util.List r13, int r14) {
        /*
            r7 = r11
            com.instagram.api.schemas.ClipsMidCardType r2 = r11.A04
            com.instagram.api.schemas.ClipsMidCardType r0 = com.instagram.api.schemas.ClipsMidCardType.POPULAR_REELS
            r11 = r14
            if (r2 != r0) goto L_0x004d
            com.instagram.api.schemas.MidCardLayoutType r1 = r7.A07
            com.instagram.api.schemas.MidCardLayoutType r0 = com.instagram.api.schemas.MidCardLayoutType.MEGA_CARD
            if (r1 != r0) goto L_0x004d
            X.Goh r4 = r7.A06
            X.Goi r0 = r4.A01
        L_0x0012:
            java.lang.String r0 = r0.A01
            X.GKw r0 = X.JUH.A00(r0)
        L_0x0018:
            X.02z r10 = X.106.A01(r0)
            java.util.List r0 = r4.A09
            int r0 = r0.size()
            if (r14 >= r0) goto L_0x004c
            java.lang.Object r1 = r13.get(r14)
            r0 = 2
            boolean r0 = X.C52648GaM.A00(r0, r1)
            if (r0 == 0) goto L_0x004c
            X.GaM r1 = (X.C52648GaM) r1
            if (r1 == 0) goto L_0x004c
            java.lang.Object r0 = r1.A02
            X.0r6 r0 = (X.AnonymousClass0r6) r0
            if (r0 == 0) goto L_0x004c
            r9 = 0
            X.ImN r6 = new X.ImN
            r8 = r12
            r6.<init>((X.C53452Gok) r7, (X.H2S) r8, (X.AnonymousClass4D7) r9, (X.05G) r10, (int) r11)
            X.0pz r1 = new X.0pz
            r1.<init>(r6, r0)
            X.4Cq r0 = r12.A03()
            X.AnonymousClass11O.A03(r0, r1)
        L_0x004c:
            return r10
        L_0x004d:
            com.instagram.api.schemas.ClipsMidCardType r0 = com.instagram.api.schemas.ClipsMidCardType.DRAFT
            r6 = 1
            r5 = 0
            if (r2 != r0) goto L_0x006a
            com.instagram.api.schemas.MidCardLayoutType r1 = r7.A07
            com.instagram.api.schemas.MidCardLayoutType r0 = com.instagram.api.schemas.MidCardLayoutType.MEGA_CARD
            if (r1 != r0) goto L_0x006a
            X.Goh r4 = r7.A06
            java.util.List r1 = r4.A09
            boolean r0 = X.AnonymousClass7TE.A1b(r1)
            if (r0 == 0) goto L_0x006a
            java.lang.Object r0 = r1.get(r5)
        L_0x0067:
            X.Goi r0 = (X.C53450Goi) r0
            goto L_0x0012
        L_0x006a:
            X.Goh r4 = r7.A06
            java.util.List r3 = r4.A09
            int r0 = r3.size()
            if (r14 >= r0) goto L_0x00bd
            java.lang.Object r1 = r13.get(r14)
            r0 = 2
            boolean r0 = X.C52648GaM.A00(r0, r1)
            if (r0 == 0) goto L_0x008d
            X.GaM r1 = (X.C52648GaM) r1
            if (r1 == 0) goto L_0x008d
            java.lang.Object r0 = r1.A02
            X.05G r0 = (X.05G) r0
            if (r0 == 0) goto L_0x008d
            boolean r5 = X.DbX.A1b(r0)
        L_0x008d:
            java.lang.Object r0 = r3.get(r14)
            X.Goi r0 = (X.C53450Goi) r0
            X.Goj r0 = r0.A00
            java.lang.Boolean r0 = r0.A08
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r6)
            if (r0 == 0) goto L_0x00b8
            if (r5 == 0) goto L_0x00b8
            com.instagram.api.schemas.ClipsMidCardType r0 = com.instagram.api.schemas.ClipsMidCardType.TRENDING_TRACK_WITH_SIMILAR_ACCOUNTS
            r3 = 0
            if (r2 != r0) goto L_0x00ad
            com.instagram.api.schemas.MidCardLayoutType r2 = r7.A07
            com.instagram.api.schemas.MidCardLayoutType r0 = com.instagram.api.schemas.MidCardLayoutType.MEGA_CARD
            r1 = 2131963576(0x7f132eb8, float:1.956391E38)
            if (r2 == r0) goto L_0x00b0
        L_0x00ad:
            r1 = 2131957188(0x7f1315c4, float:1.9550953E38)
        L_0x00b0:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            X.GKO r0 = X.DbS.A0Q(r0, r1)
            goto L_0x0018
        L_0x00b8:
            java.lang.Object r0 = r3.get(r14)
            goto L_0x0067
        L_0x00bd:
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r0 = 2131963566(0x7f132eae, float:1.956389E38)
            X.GKO r0 = X.DbS.A0Q(r1, r0)
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H2S.A00(X.Gok, X.H2S, java.util.List, int):X.02z");
    }
}
