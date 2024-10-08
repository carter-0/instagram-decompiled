package com.instagram.comments.request;

import X.02m;
import X.0Rd;
import X.0Tu;
import X.0qQ;
import X.0wb;
import X.182;
import X.19B;
import X.1E4;
import X.1E5;
import X.1Eo;
import X.1Xj;
import X.1bK;
import X.AnonymousClass07V;
import X.AnonymousClass0xx;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass9MA;
import X.C20611Wvs;
import X.C247733gp;
import X.C333797aA;
import X.C334157al;
import X.C334197ap;
import X.C335777dW;
import X.C335827db;
import X.C381419bj;
import X.C39709A6a;
import X.C53383GnF;
import X.C71772f0;
import android.util.LruCache;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

public final class CommentsFetcher {
    public C334157al A00;
    public 1Xj A01;
    public boolean A02;
    public final AnonymousClass07V A03;
    public final C39709A6a A04;
    public final UserSession A05;
    public final int A06;
    public final String A07;
    public final boolean A08;

    public final void A03(C333797aA r20, Integer num, long j) {
        C334157al r6 = C334157al.INITIAL_LOADING;
        String id = this.A01.getId();
        if (id != null) {
            boolean z = this.A08;
            UserSession userSession = this.A05;
            C53383GnF gnF = new C53383GnF(r20, num, id, z, 182.A06(0Tu.A05, userSession, 36322147580258274L));
            C334197ap r14 = C334197ap.A00;
            0qQ.A0B(r6, 1);
            AnonymousClass9MA r1 = new AnonymousClass9MA(1, userSession, r6, true);
            02m r0 = 02m.A0p;
            0qQ.A07(r0);
            if (!r0.isMarkerOn(16659282, 0)) {
                r1.invoke();
            }
            C39709A6a a6a = this.A04;
            String str = gnF.A03;
            LruCache lruCache = a6a.A00;
            C381419bj r15 = (C381419bj) lruCache.get(str);
            if (r15 != null) {
                if (a6a.A01.now() - r15.A01 < r15.A00) {
                    0qQ.A0K(r15.A02, gnF);
                }
                lruCache.remove(str);
            }
            if (this.A00 == null) {
                Map map = a6a.A02;
                map.get(gnF);
                0qQ.A0B(r6, 1);
                02m r12 = 02m.A0p;
                0qQ.A07(r12);
                r12.markerPoint(16659282, "network_request_made");
                C334197ap.A00(r12, r6, true);
                AnonymousClass0xx A002 = C71772f0.A00(this.A03);
                map.put(gnF, 1Eo.A04(19B.A00, new CommentsFetcher$launchFetchJobAndMaybeAddToOngoingPrefetchJobMap$job$1(gnF, this, r6, (AnonymousClass4D7) null, j, false, true), A002));
                return;
            }
            02m r13 = 02m.A0p;
            0qQ.A07(r13);
            r13.markerPoint(16659282, "ongoing_fetch_clash");
            C334197ap.A00(r13, r6, true);
            r14.A01(userSession, r6, true);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.Avi, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C53383GnF r17, com.instagram.comments.request.CommentsFetcher r18, X.C334157al r19, X.AnonymousClass4D7 r20, long r21, boolean r23, boolean r24) {
        /*
            r5 = r20
            r6 = r18
            r7 = r19
            r8 = r17
            r2 = r24
            r14 = r21
            boolean r0 = r5 instanceof X.C41540Avi
            if (r0 == 0) goto L_0x01ac
            r4 = r5
            X.Avi r4 = (X.C41540Avi) r4
            int r3 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x01ac
            int r3 = r3 - r1
            r4.A00 = r3
        L_0x001e:
            java.lang.Object r1 = r4.A06
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r10 = 1
            if (r0 == 0) goto L_0x0095
            if (r0 != r10) goto L_0x01b8
            long r14 = r4.A01
            boolean r2 = r4.A05
            java.lang.Object r8 = r4.A04
            X.GnF r8 = (X.C53383GnF) r8
            java.lang.Object r7 = r4.A03
            X.7al r7 = (X.C334157al) r7
            java.lang.Object r6 = r4.A02
            com.instagram.comments.request.CommentsFetcher r6 = (com.instagram.comments.request.CommentsFetcher) r6
            X.0eS.A00(r1)
        L_0x003c:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x008c
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.7dW r0 = (X.C335777dW) r0
            r23 = 0
            r16 = r8
            r17 = r6
            r18 = r0
            r19 = r7
            r20 = r14
            r22 = r2
            A01(r16, r17, r18, r19, r20, r22, r23)
            X.0gF r0 = X.C60340gF.A00
            X.3Ih r1 = new X.3Ih
            r1.<init>(r0)
        L_0x0060:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0087
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x01b3
            X.5sO r1 = (X.C297815sO) r1
            java.lang.Object r1 = r1.A00
            X.4dm r1 = (X.C268654dm) r1
            boolean r0 = r1 instanceof X.C268674do
            r10 = 0
            if (r0 == 0) goto L_0x008a
            X.4do r1 = (X.C268674do) r1
            if (r1 == 0) goto L_0x008a
            java.lang.Object r1 = r1.A00
        L_0x0079:
            boolean r0 = r1 instanceof X.C335777dW
            if (r0 == 0) goto L_0x0080
            X.7dW r1 = (X.C335777dW) r1
            r10 = r1
        L_0x0080:
            r12 = 0
            r9 = r6
            r11 = r7
            r13 = r2
            A02(r8, r9, r10, r11, r12, r13)
        L_0x0087:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x008a:
            r1 = r10
            goto L_0x0079
        L_0x008c:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0060
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0095:
            X.0eS.A00(r1)
            r6.A00 = r7
            r24 = r23
            if (r2 != 0) goto L_0x012b
            com.instagram.common.session.UserSession r11 = r6.A05
            X.0Tu r5 = X.0Tu.A05
            r0 = 36319686563995193(0x81089000001e39, double:3.0320542584851455E-306)
            boolean r0 = X.182.A06(r5, r11, r0)
            if (r0 == 0) goto L_0x012b
            X.1Xj r13 = r6.A01
            X.1Xy r0 = r13.A0C
            X.DSk r0 = r0.Ba6()
            java.lang.String r0 = X.C334217ar.A00(r0, r11)
            if (r0 != 0) goto L_0x012b
            java.lang.String r0 = r6.A07
            r22 = r0
            int r0 = r6.A06
            r23 = r0
            r12 = 0
            r9 = 2
            r0 = 3
            X.AnonymousClass7TF.A1D(r7, r0, r8)
            java.lang.String r1 = r13.getId()
            r0 = 0
            r5 = 722993640(0x2b1801e8, float:5.4003893E-13)
            X.1FZ r4 = new X.1FZ
            r4.<init>(r11, r5, r9, r12)
            r4.A05()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r3 = "media/%s/stream_comments/"
            r4.A0K(r3, r1)
            java.lang.Class<X.7at> r19 = X.C334227at.class
            X.0bH r2 = new X.0bH
            r2.<init>(r11)
            X.1NX r1 = new X.1NX
            r1.<init>(r0)
            X.1Fj r0 = new X.1Fj
            r17 = r2
            r18 = r1
            r20 = r10
            r21 = r10
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21)
            r4.A00 = r0
            r21 = r22
            r22 = r3
            r19 = r7
            r20 = r13
            r17 = r4
            r18 = r11
            r16 = r8
            X.C334217ar.A01(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            X.1GP r1 = r4.A0M()
            r6.A02 = r10
            X.AXj r0 = new X.AXj
            r16 = r0
            r17 = r8
            r18 = r6
            r20 = r14
            r16.<init>(r17, r18, r19, r20)
            r1.A02(r0)
            X.1ES.A05(r1, r5, r9, r10, r12)
            goto L_0x0087
        L_0x012b:
            java.lang.String r0 = r6.A07
            r17 = r0
            com.instagram.common.session.UserSession r11 = r6.A05
            X.1Xj r9 = r6.A01
            int r5 = r6.A06
            r0 = 3
            X.AnonymousClass7TF.A1D(r7, r0, r8)
            X.1Xy r0 = r9.A0C
            X.DSk r13 = r0.Ba6()
            if (r13 == 0) goto L_0x0154
            X.0Tu r12 = X.0Tu.A05
            r0 = 36321078133400641(0x8109d400002441, double:3.032934292580551E-306)
            boolean r0 = X.182.A06(r12, r11, r0)
            if (r0 == 0) goto L_0x0154
            java.lang.String r16 = r13.getMediaId()
            if (r16 != 0) goto L_0x0158
        L_0x0154:
            java.lang.String r16 = r9.getId()
        L_0x0158:
            X.1Xy r0 = r9.A0C
            X.DSk r0 = r0.Ba6()
            java.lang.String r1 = X.C334217ar.A00(r0, r11)
            if (r1 == 0) goto L_0x01a9
            java.lang.String r13 = "media/%s/comments_for_pac_ad/"
        L_0x0166:
            X.1NY r12 = X.AnonymousClass7TG.A0b(r11)
            java.lang.Object[] r0 = new java.lang.Object[]{r16}
            r12.A0K(r13, r0)
            r0 = 1666(0x682, float:2.335E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r12.A0G(r0, r1)
            java.lang.Class<X.7dW> r1 = X.C335777dW.class
            java.lang.Class<X.7at> r0 = X.C334227at.class
            r12.A0Q(r1, r0)
            r21 = r17
            r22 = r13
            r23 = r5
            r20 = r9
            r17 = r12
            r18 = r11
            r16 = r8
            X.C334217ar.A01(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            X.1OC r0 = r12.A0M()
            r4.A02 = r6
            r4.A03 = r7
            r4.A04 = r8
            r4.A05 = r2
            r4.A01 = r14
            r4.A00 = r10
            java.lang.Object r1 = r0.A01(r4)
            if (r1 != r3) goto L_0x003c
            return r3
        L_0x01a9:
            java.lang.String r13 = "media/%s/comments/"
            goto L_0x0166
        L_0x01ac:
            X.Avi r4 = new X.Avi
            r4.<init>(r6, r5)
            goto L_0x001e
        L_0x01b3:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x01b8:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.comments.request.CommentsFetcher.A00(X.GnF, com.instagram.comments.request.CommentsFetcher, X.7al, X.4D7, long, boolean, boolean):java.lang.Object");
    }

    public static final void A01(C53383GnF gnF, CommentsFetcher commentsFetcher, C335777dW r18, C334157al r19, long j, boolean z, boolean z2) {
        C247733gp r11;
        C334197ap r3 = C334197ap.A00;
        CommentsFetcher commentsFetcher2 = commentsFetcher;
        UserSession userSession = commentsFetcher2.A05;
        C334157al r12 = r19;
        boolean z3 = z;
        r3.A03(r12, z3);
        C247733gp r1 = null;
        commentsFetcher2.A00 = null;
        if (r12 != C334157al.FB_FEEDBACK_ONLY) {
            C335777dW r6 = r18;
            if (z) {
                C39709A6a a6a = commentsFetcher2.A04;
                C53383GnF gnF2 = gnF;
                AnonymousClass7TF.A1B(r6, 0, gnF2);
                a6a.A00.put(gnF2.A03, new C381419bj(gnF2, r6, a6a.A01.now(), j));
                a6a.A02.remove(gnF2);
            } else {
                1E5 A002 = 1E4.A00(userSession);
                1bK r0 = r6.A02;
                if (r0 != null) {
                    r1 = C335827db.A00(A002, r0);
                }
                1Xj r10 = commentsFetcher2.A01;
                if (r10.CcK() && r1 == null) {
                    r10.A1T();
                }
                List A012 = C335827db.A01(A002, r6.A0D);
                List A013 = C335827db.A01(A002, r6.A0E);
                int i = r6.A01;
                boolean z4 = r6.A0G;
                0qQ.A0K(r6.A06, AnonymousClass7TE.A0v());
                boolean z5 = commentsFetcher2.A02;
                String str = r6.A0B;
                String str2 = r6.A0C;
                boolean z6 = r6.A0J;
                1bK r62 = r6.A03;
                if (r62 != null) {
                    r11 = C335827db.A00(A002, r62);
                } else {
                    r11 = null;
                }
                r10.A41(r11, r12, (Integer) null, str, str2, A012, A013, i, z4, z2, z5, z6);
                commentsFetcher2.A02 = false;
            }
        }
        r3.A01(userSession, r12, z3);
    }

    public static final void A02(C53383GnF gnF, CommentsFetcher commentsFetcher, C335777dW r6, C334157al r7, Throwable th, boolean z) {
        String str;
        String str2;
        C334197ap r3 = C334197ap.A00;
        UserSession userSession = commentsFetcher.A05;
        r3.A02(r7, z);
        commentsFetcher.A00 = null;
        if (z) {
            commentsFetcher.A04.A02.remove(gnF);
        }
        0qQ.A0B(r7, 0);
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("commentFetchType = ");
        A1A.append(r7);
        if (r6 != null) {
            StringBuilder A1A2 = AnonymousClass7TE.A1A();
            A1A2.append("|| Error Title: ");
            A1A2.append(r6.mErrorTitle);
            A1A2.append("|| Error Type: ");
            A1A2.append(r6.mErrorType);
            A1A2.append("|| Error Message: ");
            A1A2.append(r6.getErrorMessage());
            A1A2.append("|| Status: ");
            A1A2.append(r6.getStatus());
            A1A2.append("|| Status Code: ");
            A1A2.append(r6.mStatusCode);
            str = A1A2.toString();
        } else {
            str = "FetchCommentPageResponse = null || Error = null";
        }
        A1A.append(str);
        A1A.append(" || Throwable = ");
        if (th == null || (str2 = th.getMessage()) == null) {
            str2 = "null";
        }
        0wb.A03("CommentsFetcher#Comments Fetch Error", AnonymousClass7TF.A0l(str2, A1A));
        r3.A01(userSession, r7, z);
    }

    public CommentsFetcher(AnonymousClass07V r3, UserSession userSession, 1Xj r5, String str, int i) {
        this.A07 = str;
        this.A05 = userSession;
        this.A01 = r5;
        this.A06 = i;
        this.A03 = r3;
        this.A04 = (C39709A6a) userSession.A01(C39709A6a.class, new C20611Wvs(userSession, 9));
        this.A08 = new 0Rd(userSession).A00();
    }
}
