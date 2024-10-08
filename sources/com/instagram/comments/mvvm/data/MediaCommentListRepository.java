package com.instagram.comments.mvvm.data;

import X.00k;
import X.02z;
import X.05G;
import X.0Yv;
import X.0qQ;
import X.0sJ;
import X.0sP;
import X.106;
import X.10b;
import X.136;
import X.19B;
import X.1Eo;
import X.1Hj;
import X.1Xj;
import X.1Xl;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass0Ud;
import X.AnonymousClass43D;
import X.AnonymousClass4D7;
import X.AnonymousClass4DU;
import X.AnonymousClass4HU;
import X.AnonymousClass4HW;
import X.AnonymousClass571;
import X.AnonymousClass572;
import X.AnonymousClass9IE;
import X.AnonymousClass9K3;
import X.AnonymousClass9MC;
import X.AnonymousClass9N5;
import X.AnonymousClass9N7;
import X.B1F;
import X.C225942fB;
import X.C2366634p;
import X.C252733pa;
import X.C262224Cq;
import X.C333717a0;
import X.C333757a5;
import X.C333777a7;
import X.C333787a8;
import X.C333867aH;
import X.C333877aI;
import X.C333887aJ;
import X.C333897aK;
import X.C333907aL;
import X.C333937aO;
import X.C335067cK;
import X.C335797dY;
import X.C335857de;
import X.C335907dj;
import X.C335927dl;
import X.C337227fv;
import X.C376649Iu;
import X.C376889Js;
import X.C376989Kc;
import X.C376999Kd;
import X.C377189Kw;
import X.C53285GlX;
import X.C53335GmL;
import X.C54039GyO;
import X.C56538I0n;
import X.C59674JTf;
import X.C59688JTu;
import X.C59700JUh;
import X.C60340gF;
import X.C62320sa;
import X.C66150MEd;
import X.C66156MFt;
import X.C66188MGz;
import X.C66430MRk;
import X.C73561Pfh;
import X.C74187PqT;
import X.JV6;
import X.JZW;
import X.MEW;
import X.MG0;
import X.MH4;
import X.MMP;
import com.instagram.api.schemas.CommentGiphyMediaInfo;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class MediaCommentListRepository extends C252733pa {
    public String A00;
    public final C333907aL A01;
    public final C333787a8 A02;
    public final C54039GyO A03;
    public final C53335GmL A04;
    public final C333757a5 A05;
    public final C333717a0 A06;
    public final AnonymousClass4HW A07;
    public final AnonymousClass4HW A08;
    public final AnonymousClass4HW A09;
    public final AnonymousClass4HW A0A;
    public final UserSession A0B;
    public final AnonymousClass4DU A0C;
    public final String A0D;
    public final Map A0E;
    public final 05G A0F;
    public final 05G A0G;
    public final 05G A0H;
    public final AnonymousClass0Ud A0I;
    public final AnonymousClass0Ud A0J;
    public final AnonymousClass0Ud A0K;
    public final AnonymousClass0Ud A0L;
    public final AnonymousClass0Ud A0M;
    public final AnonymousClass4HW A0N;
    public final 05G A0O;
    public final 05G A0P;
    public final 136 A0Q = new 136();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaCommentListRepository(C333787a8 r8, C54039GyO gyO, C53335GmL gmL, C333757a5 r11, C333717a0 r12, UserSession userSession, AnonymousClass4DU r14, String str) {
        super("MediaCommentListRepository", AnonymousClass43D.A01(722993640, 3));
        FollowStatus followStatus;
        User user;
        0qQ.A0B(userSession, 1);
        0qQ.A0B(str, 2);
        this.A0B = userSession;
        this.A0D = str;
        this.A04 = gmL;
        this.A05 = r11;
        this.A03 = gyO;
        this.A02 = r8;
        this.A06 = r12;
        this.A0C = r14;
        02z A012 = 106.A01(A00(this));
        this.A0H = A012;
        this.A0L = 10b.A03(A012);
        02z r0 = new 02z(new C333887aJ(C333877aI.NOT_SET, (List) null, false, false, false));
        this.A0P = r0;
        this.A0M = 10b.A03(r0);
        02z r02 = new 02z(new C376649Iu(C333897aK.SHOW_ORIGINAL, (String) null));
        this.A0G = r02;
        this.A0J = 10b.A03(r02);
        C333777a7 r03 = (C333777a7) r11.A03.getValue();
        if (r03 == null || (user = r03.A0A) == null) {
            followStatus = FollowStatus.A04;
        } else {
            followStatus = user.B6o();
        }
        02z r04 = new 02z(new AnonymousClass9IE(followStatus));
        this.A0F = r04;
        this.A0I = 10b.A03(r04);
        02z A013 = 106.A01((Object) null);
        this.A0O = A013;
        this.A0K = 10b.A03(A013);
        this.A0E = new LinkedHashMap();
        AnonymousClass4HU r2 = AnonymousClass4HU.A00;
        this.A09 = new AnonymousClass4HW(r2);
        this.A01 = (C333907aL) userSession.A01(C333907aL.class, new MMP(userSession, 46));
        this.A0N = new AnonymousClass4HW(r2);
        this.A08 = new AnonymousClass4HW(r2);
        this.A0A = new AnonymousClass4HW(r2);
        this.A07 = new AnonymousClass4HW(r2);
    }

    public static final Object A02(MediaCommentListRepository mediaCommentListRepository, C337227fv r3, String str, String str2, AnonymousClass4D7 r6) {
        Object A092 = A09(mediaCommentListRepository, r6, new AnonymousClass9N5(r3, str2, str, 0));
        if (A092 != 1Hj.A02) {
            return C60340gF.A00;
        }
        return A092;
    }

    public static final Object A03(MediaCommentListRepository mediaCommentListRepository, C335857de r7, Integer num, String str, String str2, AnonymousClass4D7 r11) {
        Object A092 = A09(mediaCommentListRepository, r11, new AnonymousClass9N7(num, r7, str2, str, 1));
        if (A092 != 1Hj.A02) {
            return C60340gF.A00;
        }
        return A092;
    }

    public static final Object A06(MediaCommentListRepository mediaCommentListRepository, String str, AnonymousClass4D7 r4, boolean z) {
        Object A092 = A09(mediaCommentListRepository, r4, new C74187PqT(str, z, 2));
        if (A092 != 1Hj.A02) {
            return C60340gF.A00;
        }
        return A092;
    }

    /* JADX WARNING: type inference failed for: r11v1, types: [X.9Jl, X.4D7] */
    /* JADX WARNING: type inference failed for: r11v12 */
    /* JADX WARNING: type inference failed for: r11v13 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A07(com.instagram.comments.mvvm.data.MediaCommentListRepository r12, java.util.Set r13, java.util.Set r14, X.AnonymousClass4D7 r15, X.C62320sa r16, X.0sJ r17, boolean r18) {
        /*
            r5 = r12
            r3 = r13
            r6 = r14
            r9 = r17
            r4 = r16
            r7 = r18
            r8 = 0
            r10 = r15
            boolean r0 = r15 instanceof X.C376819Jl
            if (r0 == 0) goto L_0x0199
            r11 = r10
            X.9Jl r11 = (X.C376819Jl) r11
            int r0 = r11.A0A
            if (r0 != r8) goto L_0x0199
            int r2 = r11.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0199
            int r2 = r2 - r1
            r11.A00 = r2
        L_0x0021:
            java.lang.Object r1 = r11.A08
            X.1Hj r10 = X.1Hj.A02
            int r0 = r11.A00
            r12 = 2
            r13 = 1
            if (r0 == 0) goto L_0x0112
            if (r0 == r13) goto L_0x0146
            if (r0 != r12) goto L_0x01a6
            boolean r7 = r11.A09
            java.lang.Object r2 = r11.A07
            X.JRW r2 = (X.JRW) r2
            java.lang.Object r14 = r11.A06
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r4 = r11.A05
            X.0sa r4 = (X.C62320sa) r4
            java.lang.Object r9 = r11.A04
            X.0sJ r9 = (X.0sJ) r9
            java.lang.Object r6 = r11.A03
            java.util.Set r6 = (java.util.Set) r6
            java.lang.Object r3 = r11.A02
            java.util.Set r3 = (java.util.Set) r3
            java.lang.Object r5 = r11.A01
            com.instagram.comments.mvvm.data.MediaCommentListRepository r5 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r5
            X.0eS.A00(r1)
        L_0x0050:
            X.7a5 r10 = r5.A05
            r1 = 31
            X.9Ly r0 = new X.9Ly
            r0.<init>((int) r1, (java.lang.Object) r5, (java.lang.Object) r3)
            r10.A01(r0)
            X.7a8 r10 = r5.A02
            if (r10 == 0) goto L_0x006e
            X.0qQ.A0B(r14, r8)
            java.util.concurrent.ConcurrentHashMap r1 = r10.A01
            r0 = 4069(0xfe5, float:5.702E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.C333787a8.A01(r10, r14, r0, r1)
        L_0x006e:
            java.util.ArrayList r0 = X.A27.A00
            X.GoW r2 = (X.C53438GoW) r2
            java.lang.String r1 = r2.A00
            if (r1 == 0) goto L_0x007d
            int r0 = r1.hashCode()
            switch(r0) {
                case 103422: goto L_0x00be;
                case 93832333: goto L_0x00c9;
                case 154679679: goto L_0x00d4;
                case 435254300: goto L_0x00e3;
                case 602896713: goto L_0x00f2;
                case 863339006: goto L_0x0102;
                default: goto L_0x007d;
            }
        L_0x007d:
            X.HMF r11 = X.HMF.COMMENT_DELETE_UPSELL_TYPE_NONE
        L_0x007f:
            java.util.List r10 = r2.A03
            java.util.List r1 = r2.A02
            java.lang.String r0 = r2.A01
            r9.invoke(r11, r10, r1, r0)
            X.0gF r0 = X.C60340gF.A00
            X.3Ih r1 = new X.3Ih
            r1.<init>(r0)
        L_0x008f:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x00bb
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x01a0
            X.5sO r1 = (X.C297815sO) r1
            java.lang.Object r2 = r1.A00
            java.lang.String r2 = (java.lang.String) r2
            X.7a8 r13 = r5.A02
            if (r13 == 0) goto L_0x00b5
            X.0qQ.A0B(r14, r8)
            java.util.concurrent.ConcurrentHashMap r1 = r13.A01
            r0 = 2987(0xbab, float:4.186E-42)
            java.lang.String r15 = X.AnonymousClass000.A00(r0)
            r16 = 0
            r17 = r2
            r18 = r1
            X.C333787a8.A00(r13, r14, r15, r16, r17, r18)
        L_0x00b5:
            r4.invoke()
            r5.A0R(r3, r6, r7)
        L_0x00bb:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x00be:
            java.lang.String r0 = "hmc"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x007d
            X.HMF r11 = X.HMF.COMMENT_DELETE_UPSELL_TYPE_HMC
            goto L_0x007f
        L_0x00c9:
            java.lang.String r0 = "block"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x007d
            X.HMF r11 = X.HMF.COMMENT_DELETE_UPSELL_TYPE_BLOCK
            goto L_0x007f
        L_0x00d4:
            r0 = 1861(0x745, float:2.608E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x007d
            X.HMF r11 = X.HMF.COMMENT_DELETE_UPSELL_TYPE_HIDDEN_WORDS_V2
            goto L_0x007f
        L_0x00e3:
            r0 = 1860(0x744, float:2.606E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x007d
            X.HMF r11 = X.HMF.COMMENT_DELETE_UPSELL_TYPE_HIDDEN_WORDS
            goto L_0x007f
        L_0x00f2:
            r0 = 1134(0x46e, float:1.589E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x007d
            X.HMF r11 = X.HMF.COMMENT_DELETE_UPSELL_TYPE_BLOCK_COMMENTS_FROM
            goto L_0x007f
        L_0x0102:
            r0 = 1416(0x588, float:1.984E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x007d
            X.HMF r11 = X.HMF.COMMENT_DELETE_UPSELL_TYPE_HRT_BLOCK_COMMENTS_FROM
            goto L_0x007f
        L_0x0112:
            X.0eS.A00(r1)
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r14 = r0.toString()
            X.0qQ.A07(r14)
            X.7a8 r0 = r5.A02
            if (r0 == 0) goto L_0x0127
            r0.A04(r14, r13)
        L_0x0127:
            com.instagram.common.session.UserSession r2 = r5.A0B
            X.GmL r0 = r5.A04
            java.lang.String r1 = r0.A0E
            java.lang.String r0 = r5.A0D
            r11.A01 = r5
            r11.A02 = r3
            r11.A03 = r6
            r11.A04 = r9
            r11.A05 = r4
            r11.A06 = r14
            r11.A09 = r7
            r11.A00 = r13
            java.lang.Object r1 = com.instagram.comments.mvvm.data.network.MediaCommentDeletionNetworkRequestsKt.A00(r2, r1, r0, r3, r11)
            if (r1 != r10) goto L_0x0163
            return r10
        L_0x0146:
            boolean r7 = r11.A09
            java.lang.Object r14 = r11.A06
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r4 = r11.A05
            X.0sa r4 = (X.C62320sa) r4
            java.lang.Object r9 = r11.A04
            X.0sJ r9 = (X.0sJ) r9
            java.lang.Object r6 = r11.A03
            java.util.Set r6 = (java.util.Set) r6
            java.lang.Object r3 = r11.A02
            java.util.Set r3 = (java.util.Set) r3
            java.lang.Object r5 = r11.A01
            com.instagram.comments.mvvm.data.MediaCommentListRepository r5 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r5
            X.0eS.A00(r1)
        L_0x0163:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x018f
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r2 = r1.A00
            X.JRW r2 = (X.JRW) r2
            r11.A01 = r5
            r11.A02 = r3
            r11.A03 = r6
            r11.A04 = r9
            r11.A05 = r4
            r11.A06 = r14
            r11.A07 = r2
            r11.A09 = r7
            r11.A00 = r12
            r1 = 32
            X.9Ly r0 = new X.9Ly
            r0.<init>((int) r1, (java.lang.Object) r3, (java.lang.Object) r6)
            java.lang.Object r0 = A09(r5, r11, r0)
            if (r0 != r10) goto L_0x0050
            return r10
        L_0x018f:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x008f
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0199:
            X.9Jl r11 = new X.9Jl
            r11.<init>(r12, r15, r8)
            goto L_0x0021
        L_0x01a0:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x01a6:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.comments.mvvm.data.MediaCommentListRepository.A07(com.instagram.comments.mvvm.data.MediaCommentListRepository, java.util.Set, java.util.Set, X.4D7, X.0sa, X.0sJ, boolean):java.lang.Object");
    }

    public final void A0F(CommentGiphyMediaInfo commentGiphyMediaInfo, C66430MRk mRk, B1F b1f, C53285GlX glX, AnonymousClass571 r18, AnonymousClass572 r19, 1Xl r20, String str) {
        C262224Cq r1 = this.A01;
        1Eo.A05(19B.A00, new C66156MFt(commentGiphyMediaInfo, mRk, b1f, this, glX, r18, r19, r20, str, (AnonymousClass4D7) null), r1);
    }

    public final void A0G(C66430MRk mRk, B1F b1f, 1Xl r12, String str, String str2) {
        C335907dj A022 = C335067cK.A02((C333867aH) this.A0L.getValue(), str, str2);
        if (A022 != null) {
            C262224Cq r1 = this.A01;
            1Eo.A05(19B.A00, new C59700JUh(mRk, b1f, this, A022, r12, (AnonymousClass4D7) null), r1);
        }
    }

    public final void A0H(1Xl r12, String str, String str2, boolean z, boolean z2) {
        0qQ.A0B(str, 0);
        C262224Cq r2 = this.A01;
        MediaCommentListRepository$likeCommentAction$1 mediaCommentListRepository$likeCommentAction$1 = new MediaCommentListRepository$likeCommentAction$1(this, r12, str, str2, (AnonymousClass4D7) null, z, z2);
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, mediaCommentListRepository$likeCommentAction$1, r2);
    }

    public final void A0K(Integer num, Integer num2, String str, String str2) {
        0qQ.A0B(num, 1);
        C262224Cq r2 = this.A01;
        C376999Kd r3 = new C376999Kd(this, num, num2, str2, str, (AnonymousClass4D7) null, 0);
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, r3, r2);
    }

    public final void A0L(String str, String str2) {
        0qQ.A0B(str, 0);
        C262224Cq r3 = this.A01;
        C376989Kc r2 = new C376989Kc(this, str, str2, (AnonymousClass4D7) null);
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, r3);
    }

    public final void A0M(String str, String str2) {
        C262224Cq r1 = this.A01;
        1Eo.A05(19B.A00, new C73561Pfh(this, str, str2, (AnonymousClass4D7) null, 3), r1);
    }

    public final void A0N(String str, String str2, boolean z) {
        C262224Cq r1 = this.A01;
        1Eo.A05(19B.A00, new C66150MEd(this, str, str2, (AnonymousClass4D7) null, 0, z), r1);
    }

    public final void A0O(String str, boolean z) {
        C262224Cq r1 = this.A01;
        1Eo.A05(19B.A00, new MEW(this, str, (AnonymousClass4D7) null, 2, z), r1);
    }

    public final void A0P(Set set, Set set2) {
        1Xj BPf;
        1Xl r0;
        1Xj BPf2;
        Set set3 = set;
        0qQ.A0B(set, 0);
        Set set4 = set2;
        0qQ.A0B(set2, 1);
        Iterator it = set.iterator();
        while (true) {
            if (it.hasNext()) {
                String str = (String) it.next();
                C225942fB A002 = C225942fB.A00(this.A0B);
                if (A002.A0F(str)) {
                    A002.A0B(str);
                }
                C333757a5 r1 = this.A05;
                1Xl r02 = r1.A00;
                if (!(r02 == null || (BPf = r02.BPf()) == null || !BPf.A67() || (r0 = r1.A00) == null || (BPf2 = r0.BPf()) == null)) {
                    JZW.A04(BPf2, str);
                }
            } else {
                C262224Cq r12 = this.A01;
                1Eo.A05(19B.A00, new MH4(set3, this, set4, (AnonymousClass4D7) null, 16), r12);
                return;
            }
        }
    }

    public final void A0Q(Set set, Set set2, C62320sa r14, 0sJ r15) {
        0qQ.A0B(set, 0);
        0qQ.A0B(set2, 1);
        C262224Cq r1 = this.A01;
        1Eo.A05(19B.A00, new C59688JTu(this, set, set2, r15, r14, (AnonymousClass4D7) null, 1, true), r1);
    }

    public final void A0R(Set set, Set set2, boolean z) {
        0qQ.A0B(set, 0);
        0qQ.A0B(set2, 1);
        C262224Cq r1 = this.A01;
        1Eo.A05(19B.A00, new C59674JTf(set, set2, this, (AnonymousClass4D7) null, 4, z), r1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0050, code lost:
        if (X.182.A06(r3, r4, 36323328696396889L) == false) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C333867aH A00(com.instagram.comments.mvvm.data.MediaCommentListRepository r22) {
        /*
            X.0sn r9 = X.0sn.A00
            r2 = r22
            X.GmL r0 = r2.A04
            java.lang.String r15 = r0.A0E
            java.lang.String r5 = r0.A0J
            java.lang.Integer r1 = r0.A06
            if (r1 == 0) goto L_0x00a1
            int r17 = r1.intValue()
        L_0x0012:
            java.lang.Integer r1 = r0.A04
            if (r1 == 0) goto L_0x009d
            int r18 = r1.intValue()
        L_0x001a:
            com.instagram.common.session.UserSession r4 = r2.A0B
            X.0Tu r3 = X.0Tu.A05
            r1 = 36322023026206612(0x810ab000002794, double:3.033531846595825E-306)
            boolean r1 = X.182.A06(r3, r4, r1)
            if (r1 != 0) goto L_0x0038
            boolean r1 = r0.A0a
            if (r1 == 0) goto L_0x009a
            r1 = 36322023026403223(0x810ab000032797, double:3.0335318467201626E-306)
            boolean r1 = X.182.A06(r3, r4, r1)
            if (r1 == 0) goto L_0x009a
        L_0x0038:
            r21 = 1
        L_0x003a:
            r1 = 36318771736943039(0x8107bb000f19bf, double:3.0314757181736505E-306)
            boolean r1 = X.182.A06(r3, r4, r1)
            if (r1 == 0) goto L_0x0052
            r1 = 36323328696396889(0x810be000022c59, double:3.034357557681668E-306)
            boolean r1 = X.182.A06(r3, r4, r1)
            r22 = 1
            if (r1 != 0) goto L_0x0054
        L_0x0052:
            r22 = 0
        L_0x0054:
            r3 = 0
            java.lang.Integer r14 = X.AnonymousClass05K.A0u
            X.7aA r13 = X.C333797aA.NOT_SET
            r11 = 0
            X.7aB r12 = new X.7aB
            r19 = r11
            r20 = r11
            r16 = r5
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r2 = 1
            X.7aC r5 = new X.7aC
            r16 = r5
            r17 = r12
            r18 = r3
            r19 = r2
            r21 = r11
            r16.<init>(r17, r18, r19, r20, r21)
            X.9In r1 = new X.9In
            r1.<init>(r15, r11)
            X.7aF r4 = new X.7aF
            r4.<init>(r1, r3, r2)
            X.9In r1 = new X.9In
            r1.<init>(r15, r2)
            X.7aG r6 = new X.7aG
            r6.<init>(r1)
            java.lang.String r8 = r0.A09
            java.lang.Integer r7 = r0.A03
            boolean r13 = r0.A0b
            boolean r14 = r0.A0X
            X.7aH r2 = new X.7aH
            r10 = r9
            r12 = r11
            r15 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r2
        L_0x009a:
            r21 = 0
            goto L_0x003a
        L_0x009d:
            r18 = 0
            goto L_0x001a
        L_0x00a1:
            r17 = 0
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.comments.mvvm.data.MediaCommentListRepository.A00(com.instagram.comments.mvvm.data.MediaCommentListRepository):X.7aH");
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.9Jl, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: type inference failed for: r7v6 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0134 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(X.C61081JwJ r33, X.B1F r34, com.instagram.comments.mvvm.data.MediaCommentListRepository r35, java.lang.String r36, java.lang.String r37, java.util.List r38, X.AnonymousClass4D7 r39, boolean r40) {
        /*
            r0 = r33
            r2 = r36
            r3 = r38
            r10 = r35
            r4 = r34
            r9 = r40
            r8 = 1
            r11 = r39
            boolean r1 = r11 instanceof X.C376819Jl
            if (r1 == 0) goto L_0x0138
            r7 = r11
            X.9Jl r7 = (X.C376819Jl) r7
            int r1 = r7.A0A
            if (r1 != r8) goto L_0x0138
            int r6 = r7.A00
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r6 & r5
            if (r1 == 0) goto L_0x0138
            int r6 = r6 - r5
            r7.A00 = r6
        L_0x0025:
            java.lang.Object r12 = r7.A08
            X.1Hj r6 = X.1Hj.A02
            int r1 = r7.A00
            java.lang.String r14 = "Required value was null."
            r5 = 2
            if (r1 == 0) goto L_0x0062
            if (r1 == r8) goto L_0x00e0
            if (r1 != r5) goto L_0x013f
            boolean r9 = r7.A09
            java.lang.Object r11 = r7.A06
            X.7dj r11 = (X.C335907dj) r11
            java.lang.Object r4 = r7.A05
            X.B1F r4 = (X.B1F) r4
            java.lang.Object r3 = r7.A04
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r2 = r7.A03
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r7.A02
            X.JwJ r0 = (X.C61081JwJ) r0
            java.lang.Object r10 = r7.A01
            com.instagram.comments.mvvm.data.MediaCommentListRepository r10 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r10
            X.0eS.A00(r12)
        L_0x0051:
            X.7a5 r5 = r10.A05
            X.Ayz r1 = X.C41708Ayz.A00
            r5.A01(r1)
            r5 = r0
            r6 = r11
            r7 = r2
            r8 = r3
            r4.Eyz(r5, r6, r7, r8, r9)
        L_0x005f:
            X.0gF r6 = X.C60340gF.A00
            return r6
        L_0x0062:
            X.0eS.A00(r12)
            X.0Ud r1 = r10.A0L
            java.lang.Object r1 = r1.getValue()
            X.7aH r1 = (X.C333867aH) r1
            r11 = r37
            X.7dj r1 = X.C335067cK.A02(r1, r2, r11)
            if (r1 == 0) goto L_0x005f
            java.lang.Object r11 = r0.A00
            X.3gp r11 = (X.C247733gp) r11
            java.lang.String r15 = r11.A0G
            long r11 = r11.A03
            java.lang.Integer r26 = X.AnonymousClass05K.A00
            r33 = 0
            r16 = 0
            java.lang.Long r13 = new java.lang.Long
            r13.<init>(r11)
            r31 = -1074855938(0xffffffffbfeefffe, float:-1.8671873)
            r32 = 65023(0xfdff, float:9.1117E-41)
            r18 = r16
            r19 = r16
            r20 = r16
            r21 = r16
            r22 = r16
            r23 = r16
            r24 = r16
            r25 = r16
            r27 = r13
            r28 = r15
            r29 = r16
            r30 = r16
            r34 = r8
            r35 = r33
            r36 = r33
            r37 = r33
            r38 = r33
            r39 = r33
            r40 = r33
            r17 = r1
            X.7dj r11 = X.C335907dj.A00(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            boolean r12 = r11.A0V
            if (r12 == 0) goto L_0x0101
            java.lang.String r12 = r11.A0N
            if (r12 == 0) goto L_0x0147
            r7.A01 = r10
            r7.A02 = r0
            r7.A03 = r2
            r7.A04 = r3
            r7.A05 = r4
            r7.A06 = r1
            r7.A07 = r11
            r7.A09 = r9
            r7.A00 = r8
            X.Pm9 r8 = new X.Pm9
            r8.<init>(r12)
            java.lang.Object r8 = A09(r10, r7, r8)
            if (r8 != r6) goto L_0x0101
            return r6
        L_0x00e0:
            boolean r9 = r7.A09
            java.lang.Object r11 = r7.A07
            X.7dj r11 = (X.C335907dj) r11
            java.lang.Object r1 = r7.A06
            X.7dj r1 = (X.C335907dj) r1
            java.lang.Object r4 = r7.A05
            X.B1F r4 = (X.B1F) r4
            java.lang.Object r3 = r7.A04
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r2 = r7.A03
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r7.A02
            X.JwJ r0 = (X.C61081JwJ) r0
            java.lang.Object r10 = r7.A01
            com.instagram.comments.mvvm.data.MediaCommentListRepository r10 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r10
            X.0eS.A00(r12)
        L_0x0101:
            java.lang.String r8 = r1.A0K
            java.util.Set r12 = java.util.Collections.singleton(r8)
            X.0qQ.A07(r12)
            java.lang.String r1 = r1.A0N
            if (r1 == 0) goto L_0x0135
            java.util.Set r8 = java.util.Collections.singleton(r1)
            X.0qQ.A07(r8)
        L_0x0115:
            r7.A01 = r10
            r7.A02 = r0
            r7.A03 = r2
            r7.A04 = r3
            r7.A05 = r4
            r7.A06 = r11
            r1 = 0
            r7.A07 = r1
            r7.A09 = r9
            r7.A00 = r5
            r5 = 7
            X.9MC r1 = new X.9MC
            r1.<init>(r5, r12, r11, r8)
            java.lang.Object r1 = A09(r10, r7, r1)
            if (r1 != r6) goto L_0x0051
            return r6
        L_0x0135:
            X.0sl r8 = X.0sl.A00
            goto L_0x0115
        L_0x0138:
            X.9Jl r7 = new X.9Jl
            r7.<init>(r10, r11, r8)
            goto L_0x0025
        L_0x013f:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0147:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.comments.mvvm.data.MediaCommentListRepository.A01(X.JwJ, X.B1F, com.instagram.comments.mvvm.data.MediaCommentListRepository, java.lang.String, java.lang.String, java.util.List, X.4D7, boolean):java.lang.Object");
    }

    public static final Object A04(MediaCommentListRepository mediaCommentListRepository, C335927dl r11, AnonymousClass4D7 r12, boolean z) {
        0sP r1;
        Object value;
        boolean z2;
        boolean z3;
        ArrayList arrayList;
        C2366634p r0;
        if (z) {
            C54039GyO gyO = mediaCommentListRepository.A03;
            if (!(gyO == null || (r0 = gyO.A00) == null)) {
                r0.A05();
            }
            05G r2 = mediaCommentListRepository.A0P;
            do {
                value = r2.getValue();
                z2 = !r11.A09;
                z3 = r11.A0A;
                List<C335797dY> list = r11.A06;
                if (list != null) {
                    arrayList = new ArrayList(0Yv.A1E(list, 10));
                    for (C335797dY r02 : list) {
                        String str = r02.A00;
                        if (str != null) {
                            arrayList.add(str);
                        } else {
                            0qQ.A0F("unicode");
                            throw AnonymousClass00P.createAndThrow();
                        }
                    }
                } else {
                    arrayList = null;
                }
            } while (!r2.AIY(value, new C333887aJ(r11.A01, arrayList, z2, z3, r11.A07)));
            C225942fB A002 = C225942fB.A00(mediaCommentListRepository.A0B);
            String str2 = mediaCommentListRepository.A04.A0E;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = A002.A05().iterator();
            while (it.hasNext()) {
                C56538I0n i0n = (C56538I0n) it.next();
                if (str2.equals(i0n.A00().A0E)) {
                    arrayList2.add(i0n.A00());
                }
            }
            r1 = new AnonymousClass9MC(8, mediaCommentListRepository, 00k.A0X(arrayList2), r11);
        } else {
            r1 = new C377189Kw(r11, 47);
        }
        Object A092 = A09(mediaCommentListRepository, r12, r1);
        if (A092 != 1Hj.A02) {
            return C60340gF.A00;
        }
        return A092;
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MDy, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A05(com.instagram.comments.mvvm.data.MediaCommentListRepository r7, java.lang.String r8, java.lang.String r9, X.AnonymousClass4D7 r10) {
        /*
            r3 = 38
            boolean r0 = X.C66146MDy.A02(r3, r10)
            if (r0 == 0) goto L_0x0074
            r6 = r10
            X.MDy r6 = (X.C66146MDy) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0074
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r6.A03
            X.1Hj r5 = X.1Hj.A02
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L_0x0034
            if (r0 != r4) goto L_0x007a
            java.lang.Object r8 = r6.A02
            java.lang.Object r7 = r6.A01
            com.instagram.comments.mvvm.data.MediaCommentListRepository r7 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r7
            X.0eS.A00(r1)
        L_0x002a:
            java.util.Map r0 = r7.A0E
            r0.remove(r8)
        L_0x002f:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            return r5
        L_0x0034:
            X.0eS.A00(r1)
            java.util.Map r1 = r7.A0E
            boolean r0 = r1.containsKey(r8)
            if (r0 == 0) goto L_0x0072
            java.lang.Object r1 = r1.get(r8)
            X.4Co r1 = (X.C262204Co) r1
            if (r1 == 0) goto L_0x004b
            r0 = 0
            r1.AG7(r0)
        L_0x004b:
            java.util.Set r3 = java.util.Collections.singleton(r8)
            X.0qQ.A07(r3)
            if (r9 == 0) goto L_0x006f
            java.util.Set r2 = java.util.Collections.singleton(r9)
            X.0qQ.A07(r2)
        L_0x005b:
            r6.A01 = r7
            r6.A02 = r8
            r6.A00 = r4
            r1 = 24
            X.J6j r0 = new X.J6j
            r0.<init>((int) r1, (java.lang.Object) r3, (java.lang.Object) r2)
            java.lang.Object r0 = A09(r7, r6, r0)
            if (r0 != r5) goto L_0x002a
            return r5
        L_0x006f:
            X.0sl r2 = X.0sl.A00
            goto L_0x005b
        L_0x0072:
            r4 = 0
            goto L_0x002f
        L_0x0074:
            X.MDy r6 = new X.MDy
            r6.<init>(r7, r10, r3)
            goto L_0x0016
        L_0x007a:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.comments.mvvm.data.MediaCommentListRepository.A05(com.instagram.comments.mvvm.data.MediaCommentListRepository, java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDg, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A08(com.instagram.comments.mvvm.data.MediaCommentListRepository r5, X.AnonymousClass4D7 r6) {
        /*
            r3 = 30
            boolean r0 = X.C66128MDg.A01(r3, r6)
            if (r0 == 0) goto L_0x0043
            r4 = r6
            X.MDg r4 = (X.C66128MDg) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0043
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A02
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x002e
            if (r0 != r2) goto L_0x0049
            java.lang.Object r5 = r4.A01
            com.instagram.comments.mvvm.data.MediaCommentListRepository r5 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r5
            X.0eS.A00(r1)
        L_0x0028:
            r0 = 0
            r5.A00 = r0
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x002e:
            X.0eS.A00(r1)
            r1 = 23
            X.J6O r0 = new X.J6O
            r0.<init>(r5, r1)
            r4.A01 = r5
            r4.A00 = r2
            java.lang.Object r0 = A09(r5, r4, r0)
            if (r0 != r3) goto L_0x0028
            return r3
        L_0x0043:
            X.MDg r4 = new X.MDg
            r4.<init>(r5, r6, r3)
            goto L_0x0016
        L_0x0049:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.comments.mvvm.data.MediaCommentListRepository.A08(com.instagram.comments.mvvm.data.MediaCommentListRepository, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.9Jd, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A09(com.instagram.comments.mvvm.data.MediaCommentListRepository r7, X.AnonymousClass4D7 r8, X.0sP r9) {
        /*
            r3 = 11
            boolean r0 = X.C376739Jd.A00(r3, r8)
            if (r0 == 0) goto L_0x0032
            r6 = r8
            X.9Jd r6 = (X.C376739Jd) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0032
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r5 = r6.A04
            X.1Hj r4 = X.1Hj.A02
            int r1 = r6.A00
            r3 = 0
            r0 = 1
            if (r1 == 0) goto L_0x0040
            if (r1 != r0) goto L_0x0038
            java.lang.Object r2 = r6.A03
            X.136 r2 = (X.136) r2
            java.lang.Object r9 = r6.A02
            X.0sP r9 = (X.0sP) r9
            java.lang.Object r7 = r6.A01
            com.instagram.comments.mvvm.data.MediaCommentListRepository r7 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r7
            X.0eS.A00(r5)
            goto L_0x0054
        L_0x0032:
            X.9Jd r6 = new X.9Jd
            r6.<init>(r7, r8, r3)
            goto L_0x0016
        L_0x0038:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0040:
            X.0eS.A00(r5)
            X.136 r2 = r7.A0Q
            r6.A01 = r7
            r6.A02 = r9
            r6.A03 = r2
            r6.A00 = r0
            java.lang.Object r0 = X.136.A00(r6, r2)
            if (r0 != r4) goto L_0x0054
            return r4
        L_0x0054:
            X.05G r1 = r7.A0H     // Catch:{ all -> 0x0069 }
            java.lang.Object r0 = r1.getValue()     // Catch:{ all -> 0x0069 }
            X.7aH r0 = (X.C333867aH) r0     // Catch:{ all -> 0x0069 }
            java.lang.Object r0 = r9.invoke(r0)     // Catch:{ all -> 0x0069 }
            r1.Epw(r0)     // Catch:{ all -> 0x0069 }
            X.0gF r4 = X.C60340gF.A00     // Catch:{ all -> 0x0069 }
            r2.A05(r3)
            return r4
        L_0x0069:
            r0 = move-exception
            r2.A05(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.comments.mvvm.data.MediaCommentListRepository.A09(com.instagram.comments.mvvm.data.MediaCommentListRepository, X.4D7, X.0sP):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDy, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0A(X.C247733gp r13, java.lang.String r14, X.AnonymousClass4D7 r15) {
        /*
            r12 = this;
            r3 = 36
            boolean r0 = X.C66146MDy.A02(r3, r15)
            if (r0 == 0) goto L_0x00b2
            r5 = r15
            X.MDy r5 = (X.C66146MDy) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00b2
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r5.A03
            X.1Hj r6 = X.1Hj.A02
            int r1 = r5.A00
            r0 = 1
            if (r1 == 0) goto L_0x0087
            if (r1 != r0) goto L_0x00bf
            java.lang.Object r13 = r5.A02
            X.3gp r13 = (X.C247733gp) r13
            java.lang.Object r3 = r5.A01
            X.3pa r3 = (X.C252733pa) r3
            X.0eS.A00(r2)
        L_0x002c:
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x007d
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r0 = r2.A00
            X.DvJ r0 = (X.DvJ) r0
            java.lang.String r0 = r0.A00
            X.3Ih r2 = new X.3Ih
            r2.<init>(r0)
        L_0x003f:
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0055
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00b9
            java.lang.String r1 = "MediaCommentListRepository"
            java.lang.String r0 = "Error loading permalink for media"
            X.0KC.A0C(r1, r0)
            X.0gF r0 = X.C60340gF.A00
            X.5sO r2 = new X.5sO
            r2.<init>(r0)
        L_0x0055:
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x007a
            java.lang.String r7 = r13.A0d
            X.0sn r9 = X.0sn.A00
            r4 = 0
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r8 = r2.A00
            java.lang.String r8 = (java.lang.String) r8
            r0 = 0
            com.instagram.api.schemas.MediaGenAIDetectionMethod r6 = com.instagram.api.schemas.MediaGenAIDetectionMethod.A0B
            X.9bt r5 = new X.9bt
            r10 = r9
            r11 = r9
            r5.<init>(r6, r7, r8, r9, r10, r11)
            X.4Cq r2 = r3.A01
            X.MGa r1 = new X.MGa
            r1.<init>(r5, r3, r4, r0)
            X.19B r0 = X.19B.A00
            X.1Eo.A05(r0, r1, r2)
        L_0x007a:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x007d:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 != 0) goto L_0x003f
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0087:
            X.0eS.A00(r2)
            if (r14 == 0) goto L_0x007a
            r5.A01 = r12
            r5.A02 = r13
            r5.A00 = r0
            com.instagram.common.session.UserSession r4 = r12.A0B
            X.1Xj r3 = r13.A07
            if (r3 == 0) goto L_0x00c7
            r2 = 0
            java.lang.Integer r1 = X.AnonymousClass05K.A07
            X.4DU r0 = r12.A0C
            java.lang.String r0 = r0.getModuleName()
            X.1OC r1 = X.FGA.A00(r4, r3, r2, r1, r0)
            r0 = 749780342(0x2cb0bd76, float:5.0232552E-12)
            java.lang.Object r2 = r1.A00(r0, r5)
            if (r2 != r6) goto L_0x00af
            return r6
        L_0x00af:
            r3 = r12
            goto L_0x002c
        L_0x00b2:
            X.MDy r5 = new X.MDy
            r5.<init>(r12, r15, r3)
            goto L_0x0016
        L_0x00b9:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x00bf:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00c7:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.comments.mvvm.data.MediaCommentListRepository.A0A(X.3gp, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDy, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v9 */
    /* JADX WARNING: type inference failed for: r5v10 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0B(java.lang.String r8, X.AnonymousClass4D7 r9) {
        /*
            r7 = this;
            r3 = 37
            boolean r0 = X.C66146MDy.A02(r3, r9)
            if (r0 == 0) goto L_0x0078
            r5 = r9
            X.MDy r5 = (X.C66146MDy) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0078
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r4 = r5.A03
            X.1Hj r2 = X.1Hj.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x0040
            if (r0 != r3) goto L_0x00c4
            java.lang.Object r8 = r5.A02
            java.lang.Object r1 = r5.A01
            com.instagram.comments.mvvm.data.MediaCommentListRepository r1 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r1
            X.0eS.A00(r4)
        L_0x002a:
            X.3Ii r4 = (X.C239803Ii) r4
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00b9
            X.3Ih r4 = (X.C239793Ih) r4
            java.lang.Object r2 = r4.A00
            java.util.List r2 = (java.util.List) r2
            X.05G r6 = r1.A0O
            X.9x7 r0 = X.C39873ACu.A01
            X.ACu r5 = X.C39873ACu.A02
            if (r5 != 0) goto L_0x008a
            monitor-enter(r0)
            goto L_0x007e
        L_0x0040:
            X.0eS.A00(r4)
            X.9x7 r0 = X.C39873ACu.A01
            X.ACu r1 = X.C39873ACu.A02
            if (r1 != 0) goto L_0x0056
            monitor-enter(r0)
            X.ACu r1 = X.C39873ACu.A02     // Catch:{ all -> 0x00cc }
            if (r1 != 0) goto L_0x0055
            X.ACu r1 = new X.ACu     // Catch:{ all -> 0x00cc }
            r1.<init>()     // Catch:{ all -> 0x00cc }
            X.C39873ACu.A02 = r1     // Catch:{ all -> 0x00cc }
        L_0x0055:
            monitor-exit(r0)
        L_0x0056:
            r0 = 0
            X.0qQ.A0B(r8, r0)
            android.util.LruCache r0 = r1.A00
            java.lang.Object r1 = r0.get(r8)
            if (r1 == 0) goto L_0x0068
            X.05G r0 = r7.A0O
            r0.Epw(r1)
            goto L_0x00d7
        L_0x0068:
            com.instagram.common.session.UserSession r0 = r7.A0B
            r5.A01 = r7
            r5.A02 = r8
            r5.A00 = r3
            java.lang.Object r4 = com.instagram.comments.mvvm.data.network.CarouselChildThumbnailRequestsKt.A00(r0, r8, r5)
            if (r4 == r2) goto L_0x00de
            r1 = r7
            goto L_0x002a
        L_0x0078:
            X.MDy r5 = new X.MDy
            r5.<init>(r7, r9, r3)
            goto L_0x0016
        L_0x007e:
            X.ACu r5 = X.C39873ACu.A02     // Catch:{ all -> 0x00cc }
            if (r5 != 0) goto L_0x0089
            X.ACu r5 = new X.ACu     // Catch:{ all -> 0x00cc }
            r5.<init>()     // Catch:{ all -> 0x00cc }
            X.C39873ACu.A02 = r5     // Catch:{ all -> 0x00cc }
        L_0x0089:
            monitor-exit(r0)
        L_0x008a:
            r0 = 0
            X.0qQ.A0B(r8, r0)
            X.0qQ.A0B(r2, r3)
            r0 = 10
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>(r0)
            r0 = 25
            X.JwI r4 = new X.JwI
            r4.<init>((java.lang.Object) r1, (int) r0)
            java.util.Iterator r3 = r2.iterator()
        L_0x00a3:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00cf
            java.lang.Object r2 = r3.next()
            X.9bn r2 = (X.C381459bn) r2
            java.lang.Object r1 = r4.A00
            java.util.AbstractMap r1 = (java.util.AbstractMap) r1
            java.lang.String r0 = r2.A01
            r1.put(r0, r2)
            goto L_0x00a3
        L_0x00b9:
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00be
            return r4
        L_0x00be:
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x00c4:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x00cc:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x00cf:
            android.util.LruCache r0 = r5.A00
            r0.put(r8, r4)
            r6.Epw(r4)
        L_0x00d7:
            X.0gF r0 = X.C60340gF.A00
            X.3Ih r2 = new X.3Ih
            r2.<init>(r0)
        L_0x00de:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.comments.mvvm.data.MediaCommentListRepository.A0B(java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.JUG, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0C(X.AnonymousClass4D7 r6) {
        /*
            r5 = this;
            r3 = 34
            boolean r0 = X.JUG.A03(r3, r6)
            if (r0 == 0) goto L_0x0054
            r4 = r6
            X.JUG r4 = (X.JUG) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0054
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A01
            X.1Hj r2 = X.1Hj.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x0046
            if (r0 != r1) goto L_0x005c
            X.0eS.A00(r3)
        L_0x0024:
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x003c
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r0 = r3.A00
            X.9hU r0 = (X.C384539hU) r0
            boolean r0 = r0.A00
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.3Ih r3 = new X.3Ih
            r3.<init>(r0)
        L_0x003b:
            return r3
        L_0x003c:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 != 0) goto L_0x003b
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x0046:
            X.0eS.A00(r3)
            com.instagram.common.session.UserSession r0 = r5.A0B
            r4.A00 = r1
            java.lang.Object r3 = com.instagram.comments.mvvm.data.network.DeleteCommentUpsellRequestsKt.A00(r0, r4)
            if (r3 != r2) goto L_0x0024
            return r2
        L_0x0054:
            r0 = 42
            X.JUG r4 = new X.JUG
            r4.<init>(r5, r6, r3, r0)
            goto L_0x0016
        L_0x005c:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.comments.mvvm.data.MediaCommentListRepository.A0C(X.4D7):java.lang.Object");
    }

    public final void A0D() {
        C262224Cq r3 = this.A01;
        1Eo.A05(19B.A00, new MG0(this, (AnonymousClass4D7) null, 1), r3);
    }

    public final void A0E() {
        C262224Cq r3 = this.A01;
        C376889Js r2 = new C376889Js(this, (AnonymousClass4D7) null, 12);
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, r3);
    }

    public final void A0I(C333937aO r5) {
        C262224Cq r3 = this.A01;
        AnonymousClass9K3 r2 = new AnonymousClass9K3((Object) this, (Object) r5, (AnonymousClass4D7) null, 28);
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, r3);
    }

    public final void A0J(Integer num) {
        if (((C333867aH) this.A0L.getValue()).A03.A00.A03 != num) {
            C262224Cq r3 = this.A01;
            1Eo.A05(19B.A00, new C66188MGz((Object) num, (Object) this, (AnonymousClass4D7) null, 21), r3);
        }
    }

    public final void A0S(C62320sa r5) {
        C262224Cq r3 = this.A01;
        AnonymousClass9K3 r2 = new AnonymousClass9K3((Object) this, (Object) r5, (AnonymousClass4D7) null, 27);
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, r3);
    }

    public final void A0T(boolean z) {
        C262224Cq r3 = this.A01;
        1Eo.A05(19B.A00, new JV6((Object) this, (AnonymousClass4D7) null, 14, z), r3);
    }
}
