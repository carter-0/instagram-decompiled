package X;

import com.instagram.avatars.common.AvatarInfo;
import com.instagram.avatars.graphql.AvatarMentionsRepository;
import com.instagram.avatars.store.AvatarStore;
import com.instagram.common.session.UserSession;
import com.instagram.stickersearch.AvatarStickerInteractor;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: X.Jir  reason: case insensitive filesystem */
public final class C60294Jir extends 2YL {
    public int A00;
    public int A01 = 1;
    public AvatarInfo A02;
    public C62719KlJ A03;
    public C62723KlN A04;
    public String A05 = "";
    public String A06;
    public List A07;
    public List A08;
    public boolean A09 = true;
    public boolean A0A;
    public final C61082JwK A0B;
    public final C317846nw A0C;
    public final C317866ny A0D;
    public final AvatarMentionsRepository A0E;
    public final C63831L8m A0F;
    public final AvatarStore A0G;
    public final 02m A0H = 02m.A0p;
    public final UserSession A0I;
    public final C310396ay A0J;
    public final C3261475o A0K;
    public final 26t A0L;
    public final AvatarStickerInteractor A0M;
    public final C62944Kow A0N;
    public final Integer A0O;
    public final String A0P;
    public final String A0Q;
    public final ArrayList A0R = AnonymousClass7TE.A1C();
    public final 05G A0S = 106.A01(K3Y.A00);
    public final 05G A0T = 106.A01(K3T.A00);
    public final boolean A0U;

    public /* synthetic */ C60294Jir(C61082JwK jwK, C317846nw r8, C317866ny r9, C63831L8m l8m, UserSession userSession, C310396ay r12, C3261475o r13, AvatarStickerInteractor avatarStickerInteractor, C62944Kow kow, Integer num, String str, String str2, boolean z) {
        AvatarMentionsRepository avatarMentionsRepository = new AvatarMentionsRepository(userSession);
        26t A002 = 26G.A00(userSession);
        AvatarStore A003 = 25x.A00(userSession);
        C51974G9v.A1M(userSession, r12, r9);
        C51973G9u.A0s(5, r8, r13, kow);
        0qQ.A0B(A002, 12);
        C51969G9p.A1P(A003, 13, l8m);
        this.A0M = avatarStickerInteractor;
        this.A0I = userSession;
        this.A0J = r12;
        this.A0D = r9;
        this.A0C = r8;
        this.A0Q = str;
        this.A0K = r13;
        this.A0N = kow;
        this.A0B = jwK;
        this.A0P = str2;
        this.A0E = avatarMentionsRepository;
        this.A0L = A002;
        this.A0G = A003;
        this.A0F = l8m;
        this.A0U = z;
        this.A0O = num;
        C318136oS A004 = C318116oQ.A00(this);
        MFS mfs = new MFS(this, (AnonymousClass4D7) null, 20);
        19B r3 = 19B.A00;
        1Eo.A05(r3, new MFS(this, (AnonymousClass4D7) null, 21), C51967G9n.A0M(this, r3, mfs, A004));
    }

    public final void A02() {
        this.A09 = true;
        this.A00 = 0;
        this.A0R.clear();
        A01();
    }

    public final void A03() {
        this.A03 = null;
        05G r3 = this.A0S;
        ArrayList arrayList = this.A0R;
        boolean isEmpty = arrayList.isEmpty();
        List list = arrayList;
        if (isEmpty) {
            list = this.A07;
        }
        r3.Epw(new K3X((ULT) null, (C62719KlJ) null, this.A04, list));
    }

    public final void A05(String str) {
        if (this.A0A) {
            Pattern pattern = 0mp.A00;
            if (str.length() == 1 && ((char) str.codePointAt(0)) == '@') {
                if (this.A05.length() == 0) {
                    DbZ.A1R(AnonymousClass0kN.A02(this.A0I), "avatar_mentions_search_bar_action");
                }
                this.A05 = str;
            }
        }
        if (this.A0A) {
            Pattern pattern2 = 0mp.A00;
            if (str.length() > 1 && ((char) str.codePointAt(0)) == '@') {
                String substring = str.substring(1);
                0qQ.A07(substring);
                1Eo.A05(DbX.A0c(AnonymousClass12T.A00), new MGE(this, substring, (AnonymousClass4D7) null, 14), JTP.A0K(this, C61340K3b.A00, this.A0S));
                this.A05 = str;
            }
        }
        if (str.length() > 0) {
            MGE.A01(this, str, JTP.A0K(this, C61340K3b.A00, this.A0S), 13);
        } else {
            ArrayList arrayList = this.A0R;
            if (arrayList.isEmpty()) {
                A02();
            } else {
                this.A0S.Epw(new K3X((ULT) null, this.A03, this.A04, arrayList));
            }
        }
        this.A05 = str;
    }

    public static final void A00(C60294Jir jir) {
        Object k3x;
        jir.A0H.markerEnd(129908197, 3);
        ArrayList arrayList = jir.A0R;
        boolean isEmpty = arrayList.isEmpty();
        05G r4 = jir.A0S;
        if (isEmpty) {
            k3x = C61341K3c.A00;
        } else {
            k3x = new K3X((ULT) null, jir.A03, jir.A04, arrayList);
        }
        r4.Epw(k3x);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b9, code lost:
        if (X.182.A06(X.0Tu.A05, r5, 36323053818358562L) == false) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f7, code lost:
        if (r4.A0P != null) goto L_0x00c5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
            r20 = this;
            r4 = r20
            X.05G r6 = r4.A0S
            java.lang.Object r0 = r6.getValue()
            X.K3a r2 = X.C61339K3a.A00
            boolean r0 = X.0qQ.A0K(r0, r2)
            if (r0 != 0) goto L_0x00ec
            boolean r0 = r4.A09
            if (r0 == 0) goto L_0x00ec
            java.lang.String r0 = r4.A05
            int r0 = r0.length()
            r3 = 1
            if (r0 > 0) goto L_0x00ec
            X.02m r8 = r4.A0H
            r9 = 129908197(0x7be3de5, float:2.86244E-34)
            r7 = 129908197(0x7be3de5, float:2.86244E-34)
            r8.markerStart(r9)
            X.6ny r14 = r4.A0D
            java.lang.String r1 = r14.A00
            java.lang.String r0 = "surface"
            r8.markerAnnotate(r9, r0, r1)
            X.6nx r1 = X.C317846nw.A01
            com.instagram.common.session.UserSession r5 = r4.A0I
            X.6nw r13 = r4.A0C
            X.JwK r12 = r4.A0B
            if (r12 == 0) goto L_0x0103
            boolean r0 = r12.A01
        L_0x003d:
            java.lang.String r1 = r1.A00(r13, r14, r5, r0)
            java.lang.String r0 = "sticker_pack_id"
            r8.markerAnnotate(r9, r0, r1)
            int r0 = r4.A01
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "page_number"
            r8.markerAnnotate(r9, r0, r1)
            java.lang.String r1 = r4.A0Q
            java.lang.String r0 = "avatar_session_id"
            r8.markerAnnotate(r9, r0, r1)
            com.instagram.avatars.store.AvatarStore r0 = r4.A0G
            X.27E r9 = r0.A01
            boolean r0 = r9 instanceof X.C293135kC
            r1 = 0
            if (r0 == 0) goto L_0x0100
            X.5kC r9 = (X.C293135kC) r9
            if (r9 == 0) goto L_0x0100
            X.5kB r10 = r9.A00
        L_0x0067:
            boolean r9 = r4.A0U
            if (r9 != 0) goto L_0x0074
            if (r10 == 0) goto L_0x00fd
            java.lang.String r11 = r10.A01
        L_0x006f:
            java.lang.String r0 = "avatar_id"
            r8.markerAnnotate(r7, r0, r11)
        L_0x0074:
            if (r10 == 0) goto L_0x008c
            java.lang.Integer r0 = r10.A00
            if (r0 == 0) goto L_0x008a
            int r1 = r0.intValue()
            if (r1 == r3) goto L_0x00fa
            r0 = 2
            if (r1 != r0) goto L_0x008a
            java.lang.String r1 = "2"
        L_0x0085:
            java.lang.String r0 = "style_id"
            r8.markerAnnotate(r7, r0, r1)
        L_0x008a:
            java.lang.String r1 = r10.A03
        L_0x008c:
            java.lang.String r0 = "avatar_revision_id"
            r8.markerAnnotate(r7, r0, r1)
            X.6ny r0 = X.C317866ny.DIRECT
            if (r14 != r0) goto L_0x009a
            java.lang.String r0 = "e2ee"
            r8.markerAnnotate(r7, r0, r9)
        L_0x009a:
            java.lang.String r0 = "sticker_request_start"
            r8.markerPoint(r7, r0)
            int r0 = r4.A01
            int r0 = r0 + 1
            r4.A01 = r0
            r6.Epw(r2)
            X.6ny r0 = X.C317866ny.COMMENTS
            if (r14 != r0) goto L_0x00bb
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323053818358562(0x810ba000002b22, double:3.034183723703385E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            r19 = 1
            if (r0 != 0) goto L_0x00bd
        L_0x00bb:
            r19 = 0
        L_0x00bd:
            com.instagram.stickersearch.AvatarStickerInteractor r11 = r4.A0M
            if (r12 == 0) goto L_0x00f3
            boolean r0 = r12.A01
            if (r0 != r3) goto L_0x00f3
        L_0x00c5:
            r18 = 1
        L_0x00c7:
            int r0 = r4.A00
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r0 = r4.A0O
            if (r0 == 0) goto L_0x00ed
            int r0 = r0.intValue()
        L_0x00d5:
            java.lang.Integer r16 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = r4.A0P
            r17 = r0
            X.05E r3 = r11.A03(r12, r13, r14, r15, r16, r17, r18, r19)
            r2 = 0
            r1 = 21
            X.MGZ r0 = new X.MGZ
            r0.<init>(r4, r2, r1)
            X.DbY.A19(r4, r0, r3)
        L_0x00ec:
            return
        L_0x00ed:
            r0 = 45
            if (r19 == 0) goto L_0x00d5
            r0 = -1
            goto L_0x00d5
        L_0x00f3:
            java.lang.String r0 = r4.A0P
            r18 = 0
            if (r0 == 0) goto L_0x00c7
            goto L_0x00c5
        L_0x00fa:
            java.lang.String r1 = "1"
            goto L_0x0085
        L_0x00fd:
            r11 = r1
            goto L_0x006f
        L_0x0100:
            r10 = r1
            goto L_0x0067
        L_0x0103:
            r0 = 0
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60294Jir.A01():void");
    }

    public final void A04(C317966o8 r6) {
        C318046oG r0;
        String str = r6.A0a;
        0qQ.A07(str);
        r6.A0S = r6.A0a;
        List A1I = AnonymousClass7TE.A1I(r6);
        if (r6.A04() == AnonymousClass05K.A0N) {
            r0 = C318046oG.AVATAR_ANIMATED;
        } else {
            r0 = C318046oG.AVATAR_STATIC;
        }
        C317876nz r2 = new C317876nz(r0, str, A1I);
        C310396ay r02 = this.A0J;
        r02.A00.put(r2.A0Z, r2);
    }
}
