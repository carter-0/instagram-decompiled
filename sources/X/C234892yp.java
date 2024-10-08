package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.hashtag.HashtagFollowStatus;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.2yp  reason: invalid class name and case insensitive filesystem */
public final class C234892yp implements C234902yq {
    public final UserSession A00;
    public final C232852uY A01;
    public final AnonymousClass4DU A02;
    public final C228182kv A03;
    public final C249763kK A04;
    public final 1sy A05;
    public final 1Ua A06;

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C254563sg A00(X.1Xj r18, X.AnonymousClass3W1 r19) {
        /*
            r17 = this;
            r5 = 0
            r12 = r18
            X.0qQ.A0B(r12, r5)
            r9 = 1
            r7 = r19
            X.0qQ.A0B(r7, r9)
            r6 = r17
            com.instagram.common.session.UserSession r4 = r6.A00
            X.37U r10 = X.AnonymousClass37T.A00(r4)
            com.instagram.common.session.UserSession r2 = r10.A04
            X.0Tu r3 = X.0Tu.A05
            r0 = 36329964420743562(0x8111e90000418a, double:3.0385540164784213E-306)
            boolean r0 = X.182.A06(r3, r2, r0)
            r8 = 0
            if (r0 == 0) goto L_0x0154
            X.1sy r1 = r6.A05
            X.1sy r0 = X.1sy.A0H
            if (r1 != r0) goto L_0x0154
            X.1Xv r0 = X.1Xj.A0h
            java.lang.String r1 = r12.A36(r2, r5)
            X.0wX r0 = r2.A03
            android.content.Context r0 = r0.A06()
            X.1Ua r0 = X.1UX.A00(r0, r2)
            boolean r11 = r0.A03(r1)
            int r1 = r7.getPosition()
            int r0 = r10.A01
            int r0 = java.lang.Math.max(r1, r0)
            r10.A01 = r0
            r10.A00 = r1
            if (r11 == 0) goto L_0x0145
            java.lang.String r11 = r12.A36(r2, r5)
            boolean r0 = r12.CcK()
            if (r0 == 0) goto L_0x00f1
            X.4zF r0 = X.C279754zF.AD_DO_NOT_TRACK
        L_0x005a:
            java.lang.String r11 = r12.A36(r2, r5)
            if (r11 == 0) goto L_0x0069
            java.util.Map r2 = r10.A05
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)
            r2.put(r11, r1)
        L_0x0069:
            int r0 = r0.ordinal()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L_0x0071:
            boolean r0 = r7.A0p()
            if (r0 != 0) goto L_0x00ec
            java.lang.String r1 = "position in media state is not set, media type is "
            X.1iA r0 = r12.BR7()
            java.lang.String r0 = r0.name()
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.String r0 = "FeedOrganicMerlinImpressionViewpointAction:handleImpression"
            X.0wb.A03(r0, r1)
            r15 = -1
        L_0x008b:
            X.2uY r11 = r6.A01
            X.4DU r13 = r6.A02
            int r0 = r7.A0W
            java.lang.String r14 = "impression"
            r16 = r0
            X.3sc r7 = r11.A04(r12, r13, r14, r15, r16)
            if (r7 == 0) goto L_0x00eb
            r7.A03()
            X.1QJ r0 = X.AnonymousClass1QI.A00
            X.1QM r0 = r0.A02
            java.lang.String r0 = r0.A00
            if (r0 == 0) goto L_0x00a8
            r7.A65 = r0
        L_0x00a8:
            r7.A02()
            r0 = 36311998572594006(0x81019200010356, double:3.027192341765978E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.A1u = r0
            r0 = 36329139787022164(0x81112900003f54, double:3.038032514792476E-306)
            boolean r1 = X.182.A06(r3, r4, r0)
            r0 = 0
            if (r1 == 0) goto L_0x00ce
            X.3kK r1 = r6.A04
            java.lang.String r1 = r1.getSessionId()
            r7.A6a = r1
        L_0x00ce:
            X.2kv r1 = r6.A03
            if (r1 == 0) goto L_0x00d4
            java.lang.String r0 = r1.A00
        L_0x00d4:
            r7.A5G = r0
            if (r2 == 0) goto L_0x00da
            r7.A2p = r2
        L_0x00da:
            java.util.HashMap r0 = X.C254453sV.A00(r4)
            r7.A89 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r7.A1f = r0
            X.3sg r8 = new X.3sg
            r8.<init>(r7)
        L_0x00eb:
            return r8
        L_0x00ec:
            int r15 = r7.getPosition()
            goto L_0x008b
        L_0x00f1:
            if (r11 == 0) goto L_0x00ff
            java.util.Map r0 = r10.A06
            java.lang.Object r0 = r0.get(r11)
            X.4zF r0 = (X.C279754zF) r0
            if (r0 == 0) goto L_0x00ff
            goto L_0x005a
        L_0x00ff:
            boolean r0 = r10.A02
            if (r0 == 0) goto L_0x0107
            X.4zF r0 = X.C279754zF.FRAGMENT_VISIBLE
            goto L_0x005a
        L_0x0107:
            int r1 = r10.A00
            int r0 = r10.A01
            if (r1 > r0) goto L_0x0121
            java.util.Map r0 = r10.A05
            java.lang.Object r1 = r0.get(r11)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0121
            X.4zF r0 = X.C279754zF.USER_SCROLL_UP
            goto L_0x005a
        L_0x0121:
            if (r11 == 0) goto L_0x0141
            java.util.Map r1 = r10.A05
            java.lang.Object r0 = r1.get(r11)
            if (r0 == 0) goto L_0x0141
            java.lang.Object r1 = r1.get(r11)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x013d
            X.4zF r0 = X.C279754zF.UNKNOWN_FIRST_TIME_SEEN
            goto L_0x005a
        L_0x013d:
            X.4zF r0 = X.C279754zF.UNKNOWN_SEEN_IN_CURRENT_SESSION
            goto L_0x005a
        L_0x0141:
            X.4zF r0 = X.C279754zF.UNKNOWN_UNTRACK
            goto L_0x005a
        L_0x0145:
            java.lang.String r2 = r12.A36(r2, r5)
            if (r2 == 0) goto L_0x0154
            java.util.Map r1 = r10.A05
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            r1.put(r2, r0)
        L_0x0154:
            r2 = r8
            goto L_0x0071
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C234892yp.A00(X.1Xj, X.3W1):X.3sg");
    }

    public final C254243sA E4s(AnonymousClass30Y r10, C252093oY r11, C254243sA r12) {
        String str;
        Long l;
        Long l2;
        Long l3;
        Long valueOf;
        List list;
        String str2;
        Long l4;
        String Bmx;
        Long valueOf2;
        String obj;
        int position;
        if (r12 == null) {
            Object obj2 = r10.A03;
            0qQ.A06(obj2);
            Object obj3 = r10.A04;
            0qQ.A06(obj3);
            r12 = A00((1Xj) obj2, (AnonymousClass3W1) obj3);
        }
        1Xj r3 = (1Xj) r10.A03;
        AnonymousClass3W1 r6 = (AnonymousClass3W1) r10.A04;
        if (r12 != null) {
            C233822wX.A0X(r12.BGZ(), r3, r6.A03);
            C254523sc BGZ = r12.BGZ();
            C245923dh B2s = r3.A0C.B2s();
            if (B2s != null) {
                str = B2s.C7s();
            } else {
                str = null;
            }
            BGZ.A4t = str;
            UserSession userSession = this.A00;
            BGZ.A3f = Long.valueOf(C254443sU.A00(r3, r6));
            String id = r3.getId();
            Integer num = null;
            if (id != null) {
                String A062 = 1Xv.A06(id);
                0qQ.A0B(A062, 0);
                l = 00y.A0n(10, A062);
            } else {
                l = null;
            }
            BGZ.A3e = l;
            User A2A = r3.A2A(userSession);
            if (A2A != null) {
                l2 = 00y.A0n(10, A2A.getId());
            } else {
                l2 = null;
            }
            BGZ.A3d = l2;
            BGZ.A27 = r6.A0y;
            List A3b = r3.A3b();
            if (A3b != null) {
                l3 = Long.valueOf((long) A3b.size());
            } else {
                l3 = null;
            }
            BGZ.A3v = l3;
            C243483Yy r8 = C243483Yy.A00;
            int size = r8.A06(userSession, r3).size();
            if (C243353Yk.A00(userSession, r3)) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf((long) Math.max(0, r3.A0v() - size));
            }
            BGZ.A3t = valueOf;
            BGZ.A3u = Long.valueOf((long) r8.A06(userSession, r3).size());
            BGZ.A5I = C254443sU.A0D(userSession, r3);
            List list2 = r6.A1f;
            if (list2 != null) {
                list = 00k.A0a(list2);
            } else {
                list = null;
            }
            BGZ.A7k = list;
            if (!182.A06(0Tu.A05, userSession, 36329139787022164L)) {
                r12.BGZ().A6a = this.A04.getSessionId();
            }
            if (r6.A0p() && (position = r6.getPosition()) != -1) {
                long j = (long) position;
                if (Long.valueOf(j) != null) {
                    r12.BGZ().A09((int) j);
                }
            }
            String str3 = r3.A0R;
            if (str3 != null) {
                r12.BGZ().A6v = str3;
            }
            String A002 = C243413Yr.A00(r3.A0e);
            if (A002 != null) {
                r12.BGZ().A50 = A002;
            }
            if (r3.A1t().ordinal() == 2 && (obj = AnonymousClass3QO.FAN_CLUB.toString()) != null) {
                r12.BGZ().A4U = obj;
            }
            int i = r6.A0W;
            if (!(Integer.valueOf(i) == null || i == -1 || (valueOf2 = Long.valueOf((long) i)) == null)) {
                r12.BGZ().A07 = (int) valueOf2.longValue();
            }
            C254523sc BGZ2 = r12.BGZ();
            Hashtag B6n = r3.A0C.B6n();
            if (B6n != null) {
                str2 = B6n.getName();
            } else {
                str2 = null;
            }
            BGZ2.A5R = str2;
            if (r3.A0C.B6n() != null) {
                r12.BGZ().A5Q = HashtagFollowStatus.FOLLOWING.A00;
            }
            AnonymousClass4DU r1 = this.A02;
            if (r1 instanceof C232682uF) {
                0jB E4k = ((C232682uF) r1).E4k();
                0qQ.A07(E4k);
                r12.BGZ().A6s = (String) E4k.A01(C297695sB.A02);
            }
            r12.BGZ().A0e = C254443sU.A01(r3);
            C254523sc BGZ3 = r12.BGZ();
            C46300DUd Bmy = r3.A0C.Bmy();
            if (Bmy == null || (Bmx = Bmy.Bmx()) == null) {
                l4 = null;
            } else {
                l4 = 00y.A0n(10, Bmx);
            }
            BGZ3.A49 = l4;
            r12.BGZ().A5m = r3.A0C.BIl();
            C254523sc BGZ4 = r12.BGZ();
            AnonymousClass1YY B5B = r3.A0C.B5B();
            if (B5B != null) {
                num = B5B.BkR();
            }
            BGZ4.A3B = num;
            r12.BGZ().A14 = Boolean.valueOf(this.A06.A03(r3.A36(userSession, false)));
        }
        return r12;
    }

    public final C254243sA E4t(AnonymousClass30Y r2, C252093oY r3, C254243sA r4) {
        return null;
    }

    public final C254243sA E4r(AnonymousClass30Y r3, C252093oY r4, C254243sA r5) {
        Object obj = r3.A03;
        0qQ.A06(obj);
        Object obj2 = r3.A04;
        0qQ.A06(obj2);
        return A00((1Xj) obj, (AnonymousClass3W1) obj2);
    }

    public C234892yp(UserSession userSession, C232852uY r2, AnonymousClass4DU r3, 1sy r4, C228182kv r5, C249763kK r6, 1Ua r7) {
        this.A00 = userSession;
        this.A02 = r3;
        this.A05 = r4;
        this.A01 = r2;
        this.A06 = r7;
        this.A04 = r6;
        this.A03 = r5;
    }
}
