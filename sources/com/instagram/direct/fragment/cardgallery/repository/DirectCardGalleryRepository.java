package com.instagram.direct.fragment.cardgallery.repository;

import X.00k;
import X.02z;
import X.05G;
import X.0qQ;
import X.0sn;
import X.106;
import X.10b;
import X.1E9;
import X.1Hj;
import X.1hu;
import X.1iA;
import X.2L2;
import X.AnonymousClass0Ud;
import X.AnonymousClass0lh;
import X.AnonymousClass371;
import X.AnonymousClass3U9;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C254703su;
import X.C254723sw;
import X.C254873tC;
import X.C51966G9m;
import X.C51970G9q;
import X.C51971G9r;
import X.C60340gF;
import X.C66581MXm;
import X.C66583MXo;
import X.C68156N2w;
import X.C68157N2x;
import X.C69285Nil;
import X.C69345Njk;
import X.C71127OdQ;
import X.C74184PqQ;
import X.C74521PwG;
import X.DbS;
import X.DbT;
import X.JTO;
import X.JTP;
import X.JTT;
import X.N2T;
import X.N37;
import X.N3B;
import X.N3F;
import X.N3N;
import X.N49;
import com.instagram.api.schemas.DirectMediaFallbackUrl;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.AdditionalCandidates;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.GifUrlImpl;
import com.instagram.model.mediasize.ImageInfoImpl;
import com.instagram.model.mediasize.SpriteSheetInfoCandidates;
import com.instagram.user.model.User;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class DirectCardGalleryRepository implements AnonymousClass0lh {
    public final UserSession A00;
    public final 05G A01;
    public final 05G A02;
    public final 05G A03;
    public final 05G A04;
    public final 05G A05;
    public final 05G A06;
    public final 05G A07;
    public final 05G A08;
    public final 05G A09;
    public final 05G A0A;
    public final 05G A0B;
    public final 05G A0C;
    public final 05G A0D;
    public final 05G A0E;
    public final 05G A0F;
    public final AnonymousClass0Ud A0G;
    public final AnonymousClass0Ud A0H;
    public final AnonymousClass0Ud A0I;
    public final AnonymousClass0Ud A0J;
    public final AnonymousClass0Ud A0K;
    public final AnonymousClass0Ud A0L;
    public final AnonymousClass0Ud A0M;
    public final AnonymousClass0Ud A0N;
    public final AnonymousClass0Ud A0O;
    public final AnonymousClass0Ud A0P;
    public final AnonymousClass0Ud A0Q;
    public final AnonymousClass0Ud A0R;
    public final AnonymousClass0Ud A0S;
    public final AnonymousClass0Ud A0T;
    public final AnonymousClass0Ud A0U;
    public final AnonymousClass0Ud A0V;
    public final AnonymousClass0Ud A0W;
    public final 05G A0X;
    public final 05G A0Y;

    public DirectCardGalleryRepository(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        02z A1J = JTO.A1J();
        this.A07 = A1J;
        this.A0M = 10b.A03(A1J);
        02z A012 = 106.A01((Object) null);
        this.A01 = A012;
        this.A0G = 10b.A03(A012);
        02z A013 = 106.A01((Object) null);
        this.A03 = A013;
        this.A0I = 10b.A03(A013);
        02z A014 = 106.A01((Object) null);
        this.A02 = A014;
        this.A0H = 10b.A03(A014);
        02z A10 = DbS.A10(C69345Njk.UNKNOWN);
        this.A04 = A10;
        this.A0J = 10b.A03(A10);
        02z A015 = 106.A01((Object) null);
        this.A0A = A015;
        this.A0P = 10b.A03(A015);
        02z A016 = 106.A01((Object) null);
        this.A0C = A016;
        this.A0R = 10b.A03(A016);
        02z A017 = 106.A01((Object) null);
        this.A0E = A017;
        this.A0V = 10b.A03(A017);
        02z A018 = 106.A01((Object) null);
        this.A0Y = A018;
        this.A0U = 10b.A03(A018);
        02z A019 = 106.A01((Object) null);
        this.A0B = A019;
        this.A0Q = 10b.A03(A019);
        02z A102 = DbS.A10(0);
        this.A05 = A102;
        this.A0K = 10b.A03(A102);
        02z A103 = C51970G9q.A10(false);
        this.A08 = A103;
        this.A0N = 10b.A03(A103);
        02z A0110 = 106.A01((Object) null);
        this.A0X = A0110;
        this.A0T = 10b.A03(A0110);
        02z A0111 = 106.A01((Object) null);
        this.A06 = A0111;
        this.A0L = 10b.A03(A0111);
        02z A0112 = 106.A01((Object) null);
        this.A09 = A0112;
        this.A0O = 10b.A03(A0112);
        02z A0113 = 106.A01((Object) null);
        this.A0D = A0113;
        this.A0S = 10b.A03(A0113);
        02z A0114 = 106.A01((Object) null);
        this.A0F = A0114;
        this.A0W = 10b.A03(A0114);
    }

    /* JADX WARNING: type inference failed for: r9v1, types: [X.MDs, X.4D7] */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* JADX WARNING: type inference failed for: r9v6 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository r14, java.lang.Integer r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, X.AnonymousClass4D7 r21, boolean r22) {
        /*
            r6 = r17
            r7 = r22
            r3 = 6
            r4 = r21
            boolean r0 = X.C66140MDs.A01(r3, r4)
            if (r0 == 0) goto L_0x00c7
            r9 = r4
            X.MDs r9 = (X.C66140MDs) r9
            int r2 = r9.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00c7
            int r2 = r2 - r1
            r9.A00 = r2
        L_0x001b:
            java.lang.Object r1 = r9.A03
            X.1Hj r8 = X.1Hj.A02
            int r0 = r9.A00
            r2 = 1
            if (r0 == 0) goto L_0x007a
            if (r0 != r2) goto L_0x01d7
            boolean r7 = r9.A05
            java.lang.Object r6 = r9.A02
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r14 = r9.A01
            com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository r14 = (com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository) r14
            X.0eS.A00(r1)
        L_0x0033:
            r8 = r1
            X.3Ii r8 = (X.C239803Ii) r8
            boolean r0 = r8 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0192
            X.3Ih r8 = (X.C239793Ih) r8
            java.lang.Object r3 = r8.A00
            X.371 r3 = (X.AnonymousClass371) r3
            if (r7 == 0) goto L_0x0073
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
        L_0x0046:
            com.instagram.common.session.UserSession r0 = r14.A00
            X.LP4 r0 = X.C69909NuB.A00(r0)
            r0.A02(r6)
            X.N3N r0 = A00(r3)
            java.util.List r0 = r0.A0E
            if (r0 == 0) goto L_0x00d1
            java.util.ArrayList r4 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x005f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00ce
            java.lang.Object r0 = r1.next()
            X.N3B r0 = (X.N3B) r0
            X.N3F r0 = X.C69906Nu8.A00(r0)
            r4.add(r0)
            goto L_0x005f
        L_0x0073:
            X.05G r0 = r14.A07
            java.util.ArrayList r5 = X.C66583MXo.A0k(r0)
            goto L_0x0046
        L_0x007a:
            X.0eS.A00(r1)
            com.instagram.common.session.UserSession r1 = r14.A00
            r0 = 2
            r11 = r16
            X.0qQ.A0B(r11, r0)
            r5 = 3
            r10 = r18
            X.AnonymousClass7TF.A1D(r6, r5, r10)
            r0 = r19
            X.0qQ.A0B(r0, r3)
            r4 = 0
            X.1NY r3 = X.AnonymousClass7TG.A0a(r1)
            X.C66584MXp.A12(r3, r0, r11, r10, r6)
            if (r15 == 0) goto L_0x00a3
            int r1 = r15.intValue()
            java.lang.String r0 = "batch_size"
            r3.A0C(r0, r1)
        L_0x00a3:
            r1 = r20
            if (r20 == 0) goto L_0x00ac
            java.lang.String r0 = "cursor"
            r3.A9m(r0, r1)
        L_0x00ac:
            X.1OC r1 = r3.A0M()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.GetCollectionGridItemsResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.GetCollectionGridItemsResponse>>"
            X.0qQ.A0C(r1, r0)
            r9.A01 = r14
            r9.A02 = r6
            r9.A05 = r7
            r9.A00 = r2
            r0 = 702489041(0x29df21d1, float:9.9090556E-14)
            java.lang.Object r1 = r1.A02(r9, r0, r5, r4)
            if (r1 != r8) goto L_0x0033
            return r8
        L_0x00c7:
            X.MDs r9 = new X.MDs
            r9.<init>(r14, r4, r3)
            goto L_0x001b
        L_0x00ce:
            r5.addAll(r4)
        L_0x00d1:
            X.05G r0 = r14.A07
            r0.Epw(r5)
            X.05G r1 = r14.A01
            X.N3N r0 = A00(r3)
            com.instagram.user.model.User r0 = r0.A01
            r1.Epw(r0)
            X.05G r1 = r14.A03
            X.N3N r0 = A00(r3)
            java.lang.String r0 = r0.A0B
            r1.Epw(r0)
            X.05G r1 = r14.A02
            X.N3N r0 = A00(r3)
            java.lang.String r0 = r0.A0A
            r1.Epw(r0)
            X.05G r1 = r14.A05
            X.N3N r0 = A00(r3)
            java.lang.Integer r0 = r0.A09
            r4 = 0
            int r0 = X.AnonymousClass7TG.A0A(r0)
            java.lang.Integer r0 = X.JTO.A0w(r0)
            r1.Epw(r0)
            X.N3N r0 = A00(r3)
            java.lang.Integer r0 = r0.A09
            int r0 = X.AnonymousClass7TG.A0A(r0)
            java.lang.Integer r0 = X.JTO.A0w(r0)
            r1.Epw(r0)
            X.05G r1 = r14.A08
            X.N3N r0 = A00(r3)
            java.lang.Boolean r0 = r0.A04
            boolean r0 = X.AnonymousClass7TG.A1X(r0)
            X.AnonymousClass7TF.A1O(r1, r0)
            X.05G r1 = r14.A0E
            X.N3N r0 = A00(r3)
            java.lang.Boolean r13 = r0.A04
            X.N3N r0 = A00(r3)
            java.lang.Double r8 = r0.A05
            X.N3N r0 = A00(r3)
            java.lang.Double r9 = r0.A06
            X.N3N r0 = A00(r3)
            java.lang.Double r10 = r0.A07
            X.N3N r0 = A00(r3)
            java.lang.Boolean r7 = r0.A02
            X.N3N r0 = A00(r3)
            java.lang.Boolean r11 = r0.A03
            X.N3N r0 = A00(r3)
            java.lang.Integer r12 = r0.A08
            r6 = 3
            X.GMQ r5 = new X.GMQ
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r1.Epw(r5)
            X.05G r1 = r14.A09
            X.N3N r0 = A00(r3)
            X.JwI r0 = r0.A00
            if (r0 == 0) goto L_0x0170
            java.lang.Object r0 = r0.A00
            boolean r4 = X.AnonymousClass7TF.A1Y(r0, r2)
        L_0x0170:
            X.AnonymousClass7TF.A1O(r1, r4)
            X.N3N r0 = A00(r3)
            java.lang.String r8 = r0.A0C
            if (r8 == 0) goto L_0x01a7
            X.05G r7 = r14.A04
            X.Njk[] r6 = X.C69345Njk.values()
            int r5 = r6.length
            r4 = 0
        L_0x0183:
            if (r4 >= r5) goto L_0x019b
            r1 = r6[r4]
            java.lang.String r0 = r1.A00
            boolean r0 = X.0qQ.A0K(r0, r8)
            if (r0 != 0) goto L_0x019d
            int r4 = r4 + 1
            goto L_0x0183
        L_0x0192:
            boolean r0 = r8 instanceof X.C297815sO
            if (r0 != 0) goto L_0x01b9
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x019b:
            X.Njk r1 = X.C69345Njk.UNKNOWN
        L_0x019d:
            r7.Epw(r1)
            X.05G r1 = r14.A0B
            X.Nil r0 = X.C69285Nil.NOT_LOADING
            r1.Epw(r0)
        L_0x01a7:
            X.05G r1 = r14.A0X
            X.N3N r0 = A00(r3)
            java.lang.String r0 = r0.A0D
            r1.Epw(r0)
            A02(r14)
            X.3Ih r8 = X.C51967G9n.A0d()
        L_0x01b9:
            boolean r0 = r8 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x01d1
            boolean r0 = r8 instanceof X.C297815sO
            if (r0 == 0) goto L_0x01d2
            X.05G r0 = r14.A0C
            X.AnonymousClass7TF.A1O(r0, r2)
            X.05G r1 = r14.A0B
            X.Nil r0 = X.C69285Nil.NOT_LOADING
            r1.Epw(r0)
            X.5sO r8 = X.DbU.A0f()
        L_0x01d1:
            return r8
        L_0x01d2:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x01d7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository.A01(com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.4D7, boolean):java.lang.Object");
    }

    public static final void A02(DirectCardGalleryRepository directCardGalleryRepository) {
        05G r6 = directCardGalleryRepository.A07;
        Iterable<N3F> iterable = (Iterable) r6.getValue();
        ArrayList A0r = AnonymousClass7TG.A0r(iterable);
        for (N3F A012 : iterable) {
            UserSession userSession = directCardGalleryRepository.A00;
            C69345Njk njk = (C69345Njk) directCardGalleryRepository.A04.getValue();
            0qQ.A0B(njk, 0);
            A0r.add(C71127OdQ.A01(userSession, A012, njk.A00));
        }
        r6.Epw(A0r);
    }

    private final void A03(String str) {
        this.A0Y.Epw(str);
        05G r2 = this.A0F;
        AbstractCollection abstractCollection = (AbstractCollection) r2.getValue();
        if (abstractCollection != null && abstractCollection.contains(str)) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            0sn r0 = (ArrayList) r2.getValue();
            if (r0 == null) {
                r0 = 0sn.A00;
            }
            A1C.addAll(r0);
            A1C.remove(str);
            r2.Epw(A1C);
        }
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDx, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(com.instagram.model.direct.DirectThreadKey r7, com.instagram.model.direct.messageid.MessageIdentifier r8, X.AnonymousClass4D7 r9, X.C62320sa r10) {
        /*
            r6 = this;
            r3 = 11
            boolean r0 = X.C66145MDx.A02(r3, r9)
            if (r0 == 0) goto L_0x0078
            r4 = r9
            X.MDx r4 = (X.C66145MDx) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0078
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r4.A03
            X.1Hj r5 = X.1Hj.A02
            int r0 = r4.A00
            r3 = 1
            if (r0 == 0) goto L_0x0050
            if (r0 != r3) goto L_0x0083
            java.lang.Object r10 = r4.A02
            X.0sa r10 = (X.C62320sa) r10
            java.lang.Object r1 = r4.A01
            com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository r1 = (com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository) r1
            X.0eS.A00(r2)
        L_0x002c:
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0047
            r10.invoke()
            X.3Ih r2 = X.C51967G9n.A0d()
        L_0x0037:
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0044
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 == 0) goto L_0x007e
            X.05G r0 = r1.A0C
            X.AnonymousClass7TF.A1O(r0, r3)
        L_0x0044:
            X.0gF r5 = X.C60340gF.A00
        L_0x0046:
            return r5
        L_0x0047:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0037
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0050:
            X.0eS.A00(r2)
            com.instagram.common.session.UserSession r2 = r6.A00
            X.0sn r1 = X.0sn.A00
            java.lang.String r0 = X.DbV.A0s()
            X.1NY r2 = X.C71151OeJ.A04(r2, r7, r8, r0, r1)
            java.lang.Class<X.NHZ> r1 = X.NHZ.class
            java.lang.Class<X.OQJ> r0 = X.OQJ.class
            X.1OC r1 = X.DbU.A0S(r2, r1, r0)
            r4.A01 = r6
            r4.A02 = r10
            r4.A00 = r3
            r0 = 702489041(0x29df21d1, float:9.9090556E-14)
            java.lang.Object r2 = r1.A00(r0, r4)
            if (r2 == r5) goto L_0x0046
            r1 = r6
            goto L_0x002c
        L_0x0078:
            X.MDx r4 = new X.MDx
            r4.<init>(r6, r9, r3)
            goto L_0x0016
        L_0x007e:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0083:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository.A04(com.instagram.model.direct.DirectThreadKey, com.instagram.model.direct.messageid.MessageIdentifier, X.4D7, X.0sa):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDx, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A05(com.instagram.model.direct.DirectThreadKey r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, X.AnonymousClass4D7 r16) {
        /*
            r11 = this;
            r3 = 12
            r5 = r16
            boolean r0 = X.C66145MDx.A02(r3, r5)
            if (r0 == 0) goto L_0x0081
            r4 = r5
            X.MDx r4 = (X.C66145MDx) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0081
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0018:
            java.lang.Object r5 = r4.A03
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x0052
            if (r0 != r2) goto L_0x008c
            java.lang.Object r15 = r4.A02
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r1 = r4.A01
            com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository r1 = (com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository) r1
            X.0eS.A00(r5)
        L_0x002e:
            boolean r0 = r5 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0049
            r1.A03(r15)
            X.3Ih r5 = X.C51967G9n.A0d()
        L_0x0039:
            boolean r0 = r5 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0046
            boolean r0 = r5 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0087
            X.05G r0 = r1.A0C
            X.AnonymousClass7TF.A1O(r0, r2)
        L_0x0046:
            X.0gF r3 = X.C60340gF.A00
        L_0x0048:
            return r3
        L_0x0049:
            boolean r0 = r5 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0039
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0052:
            X.0eS.A00(r5)
            com.instagram.common.session.UserSession r5 = r11.A00
            java.lang.Integer r8 = X.AnonymousClass05K.A01
            java.util.List r10 = X.AnonymousClass7TE.A1I(r15)
            com.instagram.model.direct.messageid.MessageIdentifier r7 = X.C66580MXl.A0i(r14, r13)
            r9 = 0
            r6 = r12
            X.1NY r6 = X.C71151OeJ.A03(r5, r6, r7, r8, r9, r10)
            java.lang.Class<X.NHZ> r5 = X.NHZ.class
            java.lang.Class<X.OQJ> r1 = X.OQJ.class
            r0 = 0
            X.1OC r1 = X.DbT.A0R(r9, r6, r5, r1, r0)
            r4.A01 = r11
            r4.A02 = r15
            r4.A00 = r2
            r0 = 702489041(0x29df21d1, float:9.9090556E-14)
            java.lang.Object r5 = r1.A00(r0, r4)
            if (r5 == r3) goto L_0x0048
            r1 = r11
            goto L_0x002e
        L_0x0081:
            X.MDx r4 = new X.MDx
            r4.<init>(r11, r5, r3)
            goto L_0x0018
        L_0x0087:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x008c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository.A05(com.instagram.model.direct.DirectThreadKey, java.lang.String, java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [X.MDl, X.4D7] */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: type inference failed for: r8v6 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A06(com.instagram.model.direct.DirectThreadKey r15, java.lang.String r16, java.lang.String r17, X.AnonymousClass4D7 r18, X.0sP r19, int r20) {
        /*
            r14 = this;
            r4 = r16
            r2 = r19
            r5 = r20
            r6 = 4
            r7 = r18
            boolean r0 = X.C66133MDl.A01(r6, r7)
            if (r0 == 0) goto L_0x00c9
            r8 = r7
            X.MDl r8 = (X.C66133MDl) r8
            int r3 = r8.A01
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x00c9
            int r3 = r3 - r1
            r8.A01 = r3
        L_0x001d:
            java.lang.Object r7 = r8.A05
            X.1Hj r6 = X.1Hj.A02
            int r0 = r8.A01
            r3 = 1
            if (r0 == 0) goto L_0x009f
            if (r0 != r3) goto L_0x00d5
            int r5 = r8.A00
            java.lang.Object r2 = r8.A04
            X.0sP r2 = (X.0sP) r2
            java.lang.Object r4 = r8.A03
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r1 = r8.A02
            com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository r1 = (com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository) r1
            X.0eS.A00(r7)
        L_0x0039:
            boolean r0 = r7 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0096
            r1.A03(r4)
            X.05G r4 = r1.A0B
            X.Nil r0 = X.C69285Nil.NOT_LOADING
            r4.Epw(r0)
            r0 = 154(0x9a, float:2.16E-43)
            if (r5 == r0) goto L_0x004f
            r0 = 162(0xa2, float:2.27E-43)
            if (r5 != r0) goto L_0x0072
        L_0x004f:
            X.05G r4 = r1.A0E
            java.lang.Object r0 = r4.getValue()
            X.GMQ r0 = (X.GMQ) r0
            if (r0 == 0) goto L_0x0094
            java.lang.Boolean r13 = X.AnonymousClass7TE.A0u()
            java.lang.Object r8 = r0.A02
            java.lang.Object r9 = r0.A03
            java.lang.Object r10 = r0.A04
            java.lang.Object r7 = r0.A01
            java.lang.Object r11 = r0.A05
            java.lang.Object r12 = r0.A06
            r6 = 3
            X.GMQ r5 = new X.GMQ
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
        L_0x006f:
            r4.Epw(r5)
        L_0x0072:
            X.C51968G9o.A1O(r2, r3)
            X.3Ih r7 = X.C51967G9n.A0d()
        L_0x0079:
            boolean r0 = r7 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0091
            boolean r0 = r7 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00d0
            X.05G r0 = r1.A0C
            X.AnonymousClass7TF.A1O(r0, r3)
            X.05G r1 = r1.A0B
            X.Nil r0 = X.C69285Nil.NOT_LOADING
            r1.Epw(r0)
            r0 = 0
            X.C51968G9o.A1O(r2, r0)
        L_0x0091:
            X.0gF r6 = X.C60340gF.A00
        L_0x0093:
            return r6
        L_0x0094:
            r5 = 0
            goto L_0x006f
        L_0x0096:
            boolean r0 = r7 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0079
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x009f:
            X.0eS.A00(r7)
            X.05G r1 = r14.A0B
            X.Nil r0 = X.C69285Nil.LOADING
            r1.Epw(r0)
            r1 = r17
            if (r17 == 0) goto L_0x0091
            com.instagram.common.session.UserSession r0 = r14.A00
            X.1OC r1 = com.instagram.direct.request.DirectThreadApi.A01(r0, r15, r1, r4, r5)
            r8.A02 = r14
            r8.A03 = r4
            r8.A04 = r2
            r8.A00 = r5
            r8.A01 = r3
            r0 = 702489041(0x29df21d1, float:9.9090556E-14)
            java.lang.Object r7 = r1.A00(r0, r8)
            if (r7 == r6) goto L_0x0093
            r1 = r14
            goto L_0x0039
        L_0x00c9:
            X.MDl r8 = new X.MDl
            r8.<init>(r14, r7, r6)
            goto L_0x001d
        L_0x00d0:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00d5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository.A06(com.instagram.model.direct.DirectThreadKey, java.lang.String, java.lang.String, X.4D7, X.0sP, int):java.lang.Object");
    }

    public final Object A07(Integer num, String str, String str2, String str3, String str4, String str5, AnonymousClass4D7 r43, boolean z, boolean z2) {
        C69285Nil nil;
        C254703su BRz;
        List list;
        N3B n3b;
        String str6;
        int i;
        List list2;
        List list3;
        String str7;
        Integer num2;
        if (z) {
            A0A();
        }
        AnonymousClass7TF.A1O(this.A0C, false);
        05G r1 = this.A0B;
        String str8 = str5;
        boolean z3 = z2;
        if (z2) {
            nil = C69285Nil.PTR;
        } else if (str5 == null) {
            nil = C69285Nil.LOADING;
        } else {
            nil = C69285Nil.LOADING_NEXT_PAGE;
        }
        r1.Epw(nil);
        String str9 = str2;
        if (str2 != null) {
            UserSession userSession = this.A00;
            String str10 = str4;
            AnonymousClass3U9 C60 = 2L2.A00(userSession).C60(str10);
            if (C60 == null || (BRz = 2L2.A00(userSession).BRz(C60.BJz(), str9)) == null || !BRz.A1S()) {
                Object A012 = A01(this, num, str, str9, str3, str10, str8, r43, z3);
                if (A012 == 1Hj.A02) {
                    return A012;
                }
            } else {
                C74184PqQ pqQ = new C74184PqQ(this, 21);
                Object obj = BRz.A1T;
                if ((obj instanceof List) && (list = (List) obj) != null) {
                    C254723sw r5 = BRz.A0m;
                    if (r5 == null) {
                        r5 = new C254723sw();
                        BRz.A0m = r5;
                    }
                    ArrayList A0p = AnonymousClass7TF.A0p(list);
                    for (Object next : list) {
                        if (next instanceof C254873tC) {
                            C254873tC r0 = (C254873tC) next;
                            ExtendedImageUrl extendedImageUrl = r0.A0X;
                            String valueOf = String.valueOf(r0.A0D);
                            HashMap A1E = AnonymousClass7TE.A1E();
                            User A0j = DbT.A0j(userSession);
                            Iterator A1G = AnonymousClass7TE.A1G(r5.A00);
                            while (true) {
                                if (!A1G.hasNext()) {
                                    break;
                                }
                                N2T n2t = (N2T) AnonymousClass7TF.A0a(A1G);
                                if (0qQ.A0K(n2t.A00, valueOf)) {
                                    ArrayList arrayList = n2t.A01;
                                    if (arrayList != null) {
                                        Iterator it = arrayList.iterator();
                                        str6 = null;
                                        while (it.hasNext()) {
                                            N49 n49 = (N49) it.next();
                                            String str11 = n49.A00;
                                            if (str11 != null) {
                                                C66581MXm.A1S(str11, A1E, AnonymousClass7TG.A0A(JTO.A0z(str11, A1E)) + 1);
                                                if (C51966G9m.A1W(userSession, n49.A01)) {
                                                    str6 = n49.A00;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            str6 = null;
                            GifUrlImpl gifUrlImpl = r0.A0Z;
                            if (gifUrlImpl != null) {
                                i = 1iA.A0a.A00;
                                Integer A0p2 = C66581MXm.A0p(gifUrlImpl.A02);
                                String valueOf2 = String.valueOf(r0.A0D);
                                list2 = AnonymousClass7TE.A1I(new C68157N2x((DirectMediaFallbackUrl) null, A0p2, Integer.valueOf(i), C66581MXm.A0p(gifUrlImpl.A03), C51971G9r.A0m(), valueOf2, gifUrlImpl.A09));
                            } else {
                                i = 1iA.A0Q.A00;
                                list2 = null;
                            }
                            new 1E9(new 1hu((UserSession) null), 6, false);
                            if (extendedImageUrl != null) {
                                list3 = AnonymousClass7TE.A1I(new ExtendedImageUrl(extendedImageUrl));
                            } else {
                                list3 = null;
                            }
                            Integer num3 = null;
                            ImageInfoImpl imageInfoImpl = new ImageInfoImpl((AdditionalCandidates) null, (SpriteSheetInfoCandidates) null, (SpriteSheetInfoCandidates) null, list3, (List) null);
                            Integer valueOf3 = Integer.valueOf(i);
                            if (extendedImageUrl != null) {
                                str7 = extendedImageUrl.A0A;
                                num3 = Integer.valueOf(extendedImageUrl.getHeight());
                                num2 = Integer.valueOf(extendedImageUrl.getWidth());
                            } else {
                                str7 = null;
                                num2 = null;
                            }
                            C68156N2w n2w = new C68156N2w(num3, (Integer) null, num2, (Long) null, (String) null, (String) null, str7);
                            String str12 = r0.A0x;
                            Integer valueOf4 = Integer.valueOf(AnonymousClass7TF.A1V(str12) ? 1 : 0);
                            ArrayList arrayList2 = null;
                            new 1E9(new 1hu((UserSession) null), 6, false);
                            if (list2 != null) {
                                arrayList2 = AnonymousClass7TF.A0p(list2);
                                Iterator it2 = list2.iterator();
                                while (it2.hasNext()) {
                                    JTT.A1U(arrayList2, it2);
                                }
                            }
                            N37 n37 = new N37(n2w, imageInfoImpl, A0j, valueOf4, valueOf3, (Integer) null, valueOf, str12, arrayList2);
                            new 1E9(new 1hu((UserSession) null), 6, false);
                            Long valueOf5 = Long.valueOf(TimeUnit.MICROSECONDS.toSeconds(BRz.C7c()));
                            new 1E9(new 1hu((UserSession) null), 6, false);
                            n3b = new N3B(n37, (C74521PwG) null, A0j, (Boolean) null, (Boolean) null, (Integer) null, valueOf5, valueOf, str6, new HashMap(A1E));
                        } else {
                            n3b = null;
                        }
                        A0p.add(n3b);
                    }
                    List A0X2 = 00k.A0X(A0p);
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    00k.A0r(A0X2, A1C);
                    pqQ.invoke(A1C);
                }
            }
        }
        return C60340gF.A00;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.MDh, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A08(java.lang.String r8, java.lang.String r9, java.lang.String r10, X.AnonymousClass4D7 r11, boolean r12) {
        /*
            r7 = this;
            r4 = 25
            boolean r0 = X.C66129MDh.A01(r4, r11)
            if (r0 == 0) goto L_0x0093
            r3 = r11
            X.MDh r3 = (X.C66129MDh) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0093
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0016:
            java.lang.Object r5 = r3.A02
            X.1Hj r4 = X.1Hj.A02
            int r0 = r3.A00
            r6 = 2
            r2 = 1
            if (r0 == 0) goto L_0x004e
            if (r0 == r2) goto L_0x009f
            if (r0 != r6) goto L_0x009a
            java.lang.Object r1 = r3.A01
            com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository r1 = (com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository) r1
            X.0eS.A00(r5)
        L_0x002b:
            boolean r0 = r5 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0045
            X.05G r0 = r1.A0A
            X.AnonymousClass7TF.A1O(r0, r2)
            X.3Ih r5 = X.C51967G9n.A0d()
        L_0x0038:
            boolean r0 = r5 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x00cf
            boolean r0 = r5 instanceof X.C297815sO
            if (r0 != 0) goto L_0x00ca
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0045:
            boolean r0 = r5 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0038
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x004e:
            X.0eS.A00(r5)
            r7.A0A()
            if (r12 == 0) goto L_0x007c
            com.instagram.common.session.UserSession r0 = r7.A00
            X.0qQ.A0B(r8, r2)
            X.1NY r1 = X.AnonymousClass7TG.A0a(r0)
            java.lang.String r0 = "direct_v2/threads/broadcast/delete_recurring_roll_call/"
            r1.A0A(r0)
            java.lang.String r0 = "thread_id"
            X.DbX.A1M(r1, r0, r8)
            X.1OC r1 = r1.A0M()
            r3.A01 = r7
            r3.A00 = r2
            r0 = 702489041(0x29df21d1, float:9.9090556E-14)
            java.lang.Object r5 = r1.A00(r0, r3)
            if (r5 == r4) goto L_0x00c9
            r1 = r7
            goto L_0x00a6
        L_0x007c:
            if (r9 == 0) goto L_0x00cf
            com.instagram.common.session.UserSession r0 = r7.A00
            X.1OC r1 = com.instagram.direct.request.DirectThreadApi.A0A(r0, r8, r9, r10)
            r3.A01 = r7
            r3.A00 = r6
            r0 = 702489041(0x29df21d1, float:9.9090556E-14)
            java.lang.Object r5 = r1.A00(r0, r3)
            if (r5 == r4) goto L_0x00c9
            r1 = r7
            goto L_0x002b
        L_0x0093:
            X.MDh r3 = new X.MDh
            r3.<init>(r7, r11, r4)
            goto L_0x0016
        L_0x009a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x009f:
            java.lang.Object r1 = r3.A01
            com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository r1 = (com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository) r1
            X.0eS.A00(r5)
        L_0x00a6:
            boolean r0 = r5 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00c0
            X.05G r0 = r1.A0A
            X.AnonymousClass7TF.A1O(r0, r2)
            X.3Ih r5 = X.C51967G9n.A0d()
        L_0x00b3:
            boolean r0 = r5 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x00cf
            boolean r0 = r5 instanceof X.C297815sO
            if (r0 != 0) goto L_0x00ca
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00c0:
            boolean r0 = r5 instanceof X.C297815sO
            if (r0 != 0) goto L_0x00b3
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00c9:
            return r4
        L_0x00ca:
            X.05G r0 = r1.A0A
            X.JTR.A1V(r0)
        L_0x00cf:
            X.0gF r0 = X.C60340gF.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository.A08(java.lang.String, java.lang.String, java.lang.String, X.4D7, boolean):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDh, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.String r7, java.lang.String r8, X.AnonymousClass4D7 r9) {
        /*
            r6 = this;
            r3 = 26
            boolean r0 = X.C66129MDh.A01(r3, r9)
            if (r0 == 0) goto L_0x007d
            r5 = r9
            X.MDh r5 = (X.C66129MDh) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x007d
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r5.A02
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x0053
            if (r0 != r3) goto L_0x0088
            java.lang.Object r1 = r5.A01
            com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository r1 = (com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository) r1
            X.0eS.A00(r2)
        L_0x0028:
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x004a
            X.05G r0 = r1.A0A
            X.AnonymousClass7TF.A1O(r0, r3)
            X.3Ih r2 = X.C51967G9n.A0d()
        L_0x0035:
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0047
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0083
            X.05G r0 = r1.A0C
            X.AnonymousClass7TF.A1O(r0, r3)
            X.05G r0 = r1.A0A
            X.JTR.A1V(r0)
        L_0x0047:
            X.0gF r4 = X.C60340gF.A00
        L_0x0049:
            return r4
        L_0x004a:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0035
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0053:
            X.0eS.A00(r2)
            com.instagram.common.session.UserSession r0 = r6.A00
            X.1NY r2 = X.DbU.A0N(r0)
            java.lang.String r0 = "direct_v2/shared_album/delete/"
            X.C66583MXo.A1F(r2, r0, r7)
            java.lang.String r0 = "album_id"
            r2.A9m(r0, r8)
            java.lang.Class<X.NHZ> r1 = X.NHZ.class
            java.lang.Class<X.OQJ> r0 = X.OQJ.class
            X.1OC r1 = X.DbU.A0S(r2, r1, r0)
            r5.A01 = r6
            r5.A00 = r3
            r0 = 702489041(0x29df21d1, float:9.9090556E-14)
            java.lang.Object r2 = r1.A00(r0, r5)
            if (r2 == r4) goto L_0x0049
            r1 = r6
            goto L_0x0028
        L_0x007d:
            X.MDh r5 = new X.MDh
            r5.<init>(r6, r9, r3)
            goto L_0x0016
        L_0x0083:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0088:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository.A09(java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    public final void A0A() {
        this.A07.Epw(0sn.A00);
        this.A01.Epw((Object) null);
        this.A03.Epw((Object) null);
        this.A0A.Epw((Object) null);
        this.A0C.Epw((Object) null);
        this.A0E.Epw((Object) null);
        this.A0Y.Epw((Object) null);
        this.A0B.Epw((Object) null);
        this.A04.Epw(C69345Njk.UNKNOWN);
        JTP.A1W(this.A05, 0);
        this.A0X.Epw((Object) null);
        this.A06.Epw((Object) null);
        this.A0D.Epw((Object) null);
        this.A09.Epw((Object) null);
        this.A0F.Epw(AnonymousClass7TE.A1C());
    }

    public final void A0B(String str, String str2) {
        05G r5 = this.A07;
        ArrayList A0k = C66583MXo.A0k(r5);
        int size = A0k.size();
        for (int i = 0; i < size; i++) {
            N3F n3f = (N3F) A0k.get(i);
            if (str.equals(n3f.A05)) {
                A0k.set(i, C71127OdQ.A01(this.A00, n3f, str2));
                r5.Epw(A0k);
                return;
            }
        }
    }

    public static N3N A00(AnonymousClass371 r0) {
        return (N3N) r0.FH3();
    }

    public final void onSessionWillEnd() {
        A0A();
    }
}
