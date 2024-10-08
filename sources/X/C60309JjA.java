package X;

import com.instagram.common.session.UserSession;
import com.instagram.shopping.service.destination.reconsideration.ShoppingReconsiderationDestinationFeedService$observeFeed$1;

/* renamed from: X.JjA  reason: case insensitive filesystem */
public final class C60309JjA extends 2YL {
    public C3034368u A00;
    public final 2Fk A01;
    public final 2Fk A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final W26 A05;
    public final C15335Uak A06;
    public final W1O A07;
    public final C64142LQe A08;
    public final String A09;
    public final AnonymousClass0r6 A0A;
    public final 05G A0B;
    public final 05G A0C;
    public final boolean A0D;
    public final boolean A0E;

    public /* synthetic */ C60309JjA(AnonymousClass0iw r19, UserSession userSession, W26 w26, C15335Uak uak, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        UserSession userSession2 = userSession;
        String str4 = str;
        String str5 = str2;
        boolean z4 = z2;
        C64142LQe lQe = new C64142LQe(userSession2, str4, str5, z4);
        int A022 = DbW.A02(1, userSession2, str4);
        AnonymousClass0iw r10 = r19;
        W26 w262 = w26;
        C15335Uak uak2 = uak;
        C51973G9u.A0s(6, uak2, r10, w262);
        this.A04 = userSession2;
        this.A09 = str5;
        this.A06 = uak2;
        this.A03 = r10;
        this.A05 = w262;
        this.A0E = z4;
        boolean z5 = z3;
        this.A0D = z5;
        this.A08 = lQe;
        String str6 = str3;
        this.A07 = new W1O(r10, userSession2, uak2, str6, new MIX(this, 14), new C20596WvZ(this, 18), z, z5);
        0pq A012 = AnonymousClass10H.A01(new ShoppingReconsiderationDestinationFeedService$observeFeed$1(lQe, (AnonymousClass4D7) null), lQe.A04, lQe.A03, lQe.A06, lQe.A05);
        this.A0A = A012;
        02z A10 = C51970G9q.A10(false);
        this.A0C = A10;
        02z A013 = 106.A01(0sl.A00);
        this.A0B = A013;
        AnonymousClass0r6 A002 = 10q.A00(new 0ic(new AnonymousClass0r6[]{AnonymousClass11E.A01(10q.A01(new C66186MGx(this, (AnonymousClass4D7) null, 23), A012)), AnonymousClass11E.A01(10q.A01(new C66186MGx(this, (AnonymousClass4D7) null, 24), A013))}, A022), 10q.A00);
        19B r1 = 19B.A00;
        this.A02 = C226292g8.A00(r1, A002);
        this.A01 = C226292g8.A00(r1, A10);
    }

    public static final 1Er A02(C60309JjA jjA, boolean z, boolean z2) {
        return C51966G9m.A1L(new MFa(jjA, (AnonymousClass4D7) null, 3, z2, z), C318116oQ.A00(jjA));
    }

    public static final Object A00(C60309JjA jjA, AnonymousClass4D7 r16, boolean z) {
        LOp.A00(C17052VGa.A00(jjA.A04), jjA.A09).A00 = 0sr.A1M(new C16679UzF[]{C16679UzF.CART, C16679UzF.WISH_LIST, C16679UzF.RECENTLY_VIEWED}).size();
        C318136oS A002 = C318116oQ.A00(jjA);
        boolean z2 = z;
        MGK mgk = new MGK(jjA, (AnonymousClass4D7) null, 5, z2, true);
        19B r3 = 19B.A00;
        return JTP.A0l(AnonymousClass42T.A01(0sr.A1P(new C262204Co[]{1Eo.A04(r3, mgk, A002), A02(jjA, z2, true), 1Eo.A04(r3, new MFa(jjA, (AnonymousClass4D7) null, 4, true, z2), C318116oQ.A00(jjA))}), r16));
    }

    /* JADX WARNING: type inference failed for: r1v46, types: [java.lang.Object, X.KGC] */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0110, code lost:
        r7 = r4.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x019e, code lost:
        if (r3.A00 != X.AnonymousClass05K.A01) goto L_0x01a0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02ce  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0322  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01bd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.util.List A01(X.C61074JwC r9, X.C60309JjA r10, java.util.Set r11, int r12) {
        /*
            r0 = r12 & 1
            if (r0 == 0) goto L_0x000c
            X.LQe r0 = r10.A08
            X.05G r0 = r0.A04
            X.JwC r9 = X.JTO.A0P(r0)
        L_0x000c:
            r0 = r12 & 2
            if (r0 == 0) goto L_0x0018
            X.05G r0 = r10.A0B
            java.lang.Object r11 = r0.getValue()
            java.util.Set r11 = (java.util.Set) r11
        L_0x0018:
            X.W1O r4 = r10.A07
            X.68u r2 = r10.A00
            r6 = 0
            X.0qQ.A0B(r9, r6)
            java.lang.Object r3 = r9.A00
            X.Jw7 r3 = (X.C61069Jw7) r3
            if (r3 == 0) goto L_0x0036
            java.lang.Object r1 = r3.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 == r0) goto L_0x0036
            java.lang.Object r0 = r3.A02
            java.util.List r0 = (java.util.List) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0071
        L_0x0036:
            java.lang.Object r0 = r9.A03
            X.Jw7 r0 = (X.C61069Jw7) r0
            boolean r0 = X.C64136LPl.A00(r0)
            if (r0 == 0) goto L_0x0071
            java.lang.Object r0 = r9.A02
            X.Jw7 r0 = (X.C61069Jw7) r0
            boolean r0 = X.C64136LPl.A00(r0)
            if (r0 == 0) goto L_0x0071
            X.72b r3 = new X.72b
            r3.<init>()
            r0 = 2131239153(0x7f0820f1, float:1.8094605E38)
            r3.A02 = r0
            r1 = 59
            X.LXz r0 = new X.LXz
            r0.<init>(r4, r1)
            r3.A05 = r0
            X.6rr r2 = X.C320156rr.ERROR
            r0 = 1
            X.0qQ.A0B(r3, r0)
            X.KGC r1 = new X.KGC
            r1.<init>()
            r1.A00 = r3
            r1.A01 = r2
        L_0x006c:
            java.util.List r0 = X.AnonymousClass7TE.A1I(r1)
            return r0
        L_0x0071:
            java.lang.Object r3 = r9.A00
            X.Jw7 r3 = (X.C61069Jw7) r3
            java.lang.Object r1 = r9.A03
            X.Jw7 r1 = (X.C61069Jw7) r1
            java.lang.Object r0 = r9.A02
            X.Jw7 r0 = (X.C61069Jw7) r0
            X.Jw7[] r0 = new X.C61069Jw7[]{r3, r1, r0}
            X.0qQ.A0B(r0, r6)
            java.util.List r1 = X.03t.A0I(r0)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x00b5
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x00b5
        L_0x0092:
            java.lang.String r1 = r4.A00
            if (r1 != 0) goto L_0x00a6
            r2 = 2131973819(0x7f1356bb, float:1.9584685E38)
            java.lang.Object[] r1 = new java.lang.Object[r6]
        L_0x009b:
            X.HsR r0 = new X.HsR
            r0.<init>(r1, r2)
            X.KGI r1 = new X.KGI
            r1.<init>(r0)
            goto L_0x006c
        L_0x00a6:
            java.lang.Object r0 = r9.A00
            r2 = 2131973815(0x7f1356b7, float:1.9584676E38)
            if (r0 == 0) goto L_0x00b0
            r2 = 2131973816(0x7f1356b8, float:1.9584678E38)
        L_0x00b0:
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            goto L_0x009b
        L_0x00b5:
            java.util.Iterator r1 = r1.iterator()
        L_0x00b9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0092
            java.lang.Object r0 = r1.next()
            X.Jw7 r0 = (X.C61069Jw7) r0
            boolean r0 = X.C64136LPl.A01(r0)
            if (r0 != 0) goto L_0x00b9
            java.lang.Object r1 = r9.A00
            X.Jw7 r1 = (X.C61069Jw7) r1
            if (r1 != 0) goto L_0x00d5
            java.lang.Object r1 = r9.A03
            X.Jw7 r1 = (X.C61069Jw7) r1
        L_0x00d5:
            java.lang.Object r0 = r1.A02
            java.util.List r0 = (java.util.List) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00f5
            java.lang.Object r1 = r1.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x00f5
            r3 = 0
            X.Gpa r2 = new X.Gpa
            r4 = r3
            r5 = r3
            r7 = r6
            r2.<init>(r3, r4, r5, r6, r7)
            X.HES r1 = new X.HES
            r1.<init>(r2)
            goto L_0x006c
        L_0x00f5:
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.lang.Object r0 = r9.A00
            X.Jw7 r0 = (X.C61069Jw7) r0
            r1 = 1
            if (r0 == 0) goto L_0x0229
            boolean r0 = X.C64136LPl.A01(r0)
            if (r0 != r1) goto L_0x0229
            java.lang.Object r0 = r9.A03
            X.Jw7 r0 = (X.C61069Jw7) r0
            boolean r0 = X.C64136LPl.A01(r0)
            if (r0 == 0) goto L_0x0229
            boolean r7 = r4.A04
            if (r7 != 0) goto L_0x0229
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            X.UzF r0 = X.C16679UzF.CART
            X.WSm r0 = r4.A02(r9, r0)
            r6.add(r0)
            X.UzF r1 = X.C16679UzF.WISH_LIST
            java.lang.String r0 = "_empty_state"
            java.lang.String r1 = r1.A00(r0)
            X.Jy9 r0 = new X.Jy9
            r0.<init>(r1)
        L_0x012e:
            r6.add(r0)
        L_0x0131:
            r5.addAll(r6)
            if (r7 == 0) goto L_0x017b
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.lang.Object r2 = r9.A01
            X.Jw7 r2 = (X.C61069Jw7) r2
            boolean r0 = X.C64136LPl.A01(r2)
            if (r0 != 0) goto L_0x0178
            X.UzF r3 = X.C16679UzF.LIKED
            java.lang.String r0 = "_divider"
            java.lang.String r1 = r3.A00(r0)
            X.WRt r0 = new X.WRt
            r0.<init>(r1)
            r6.add(r0)
            X.WSm r0 = r4.A02(r9, r3)
            r6.add(r0)
            java.util.List r0 = X.W1O.A01(r2, r4, r3, r11)
            r6.addAll(r0)
            java.lang.Object r1 = r2.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x0208
            X.EWS r2 = X.EWS.LOADING
            java.lang.String r0 = "_load_more_button"
            java.lang.String r0 = r3.A00(r0)
            X.FYP r1 = new X.FYP
            r1.<init>(r2, r0)
        L_0x0175:
            r6.add(r1)
        L_0x0178:
            r5.addAll(r6)
        L_0x017b:
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.lang.Object r3 = r9.A02
            X.Jw7 r3 = (X.C61069Jw7) r3
            boolean r0 = X.C64136LPl.A00(r3)
            if (r0 != 0) goto L_0x01b5
            boolean r0 = X.C64136LPl.A01(r3)
            if (r0 != 0) goto L_0x01b5
            java.lang.Object r0 = r3.A02
            java.util.List r0 = (java.util.List) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x01a0
            java.lang.Object r2 = r3.A00
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            r0 = 1
            if (r2 == r1) goto L_0x01a1
        L_0x01a0:
            r0 = 0
        L_0x01a1:
            java.lang.String r7 = "_load_more_button"
            if (r0 == 0) goto L_0x01bd
            X.EWS r3 = X.EWS.LOADING
            X.UzF r2 = X.C16679UzF.RECENTLY_VIEWED
        L_0x01a9:
            java.lang.String r0 = r2.A00(r7)
            X.FYP r1 = new X.FYP
            r1.<init>(r3, r0)
        L_0x01b2:
            r6.add(r1)
        L_0x01b5:
            r5.addAll(r6)
            java.util.List r0 = X.00k.A0a(r5)
            return r0
        L_0x01bd:
            X.UzF r2 = X.C16679UzF.RECENTLY_VIEWED
            java.lang.String r0 = "_divider"
            java.lang.String r1 = r2.A00(r0)
            X.WRt r0 = new X.WRt
            r0.<init>(r1)
            r6.add(r0)
            X.WSm r0 = r4.A02(r9, r2)
            r6.add(r0)
            java.util.List r0 = X.W1O.A00(r3, r4, r2, r11)
            r6.addAll(r0)
            java.lang.Object r1 = r3.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x01e4
            X.EWS r3 = X.EWS.LOADING
            goto L_0x01a9
        L_0x01e4:
            java.lang.Object r1 = r3.A01
            X.KZo r0 = X.C62084KZo.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x01b5
            java.lang.String r0 = "_see_more_row"
            java.lang.String r3 = r2.A00(r0)
            r0 = 2131973824(0x7f1356c0, float:1.9584695E38)
            X.HsR r2 = X.JTP.A0P(r0)
            r1 = 17
            X.Iw3 r0 = new X.Iw3
            r0.<init>(r3, r4, r1)
            X.UNv r1 = new X.UNv
            r1.<init>(r2, r3, r0)
            goto L_0x01b2
        L_0x0208:
            java.lang.Object r0 = r2.A01
            boolean r0 = r0 instanceof X.C62085KZp
            if (r0 == 0) goto L_0x0178
            java.lang.String r0 = "_see_more_row"
            java.lang.String r3 = r3.A00(r0)
            r0 = 2131973824(0x7f1356c0, float:1.9584695E38)
            X.HsR r2 = X.JTP.A0P(r0)
            r1 = 16
            X.Iw3 r0 = new X.Iw3
            r0.<init>(r3, r4, r1)
            X.UNv r1 = new X.UNv
            r1.<init>(r2, r3, r0)
            goto L_0x0175
        L_0x0229:
            if (r2 == 0) goto L_0x0233
            X.UO0 r0 = new X.UO0
            r0.<init>(r2)
            r5.add(r0)
        L_0x0233:
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.lang.Object r2 = r9.A00
            X.Jw7 r2 = (X.C61069Jw7) r2
            if (r2 == 0) goto L_0x0247
            boolean r0 = X.C64136LPl.A01(r2)
            if (r0 == 0) goto L_0x02dc
            boolean r0 = r4.A04
            if (r0 == 0) goto L_0x02dc
        L_0x0247:
            r5.addAll(r6)
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            boolean r7 = r4.A04
            java.lang.String r1 = "_divider"
            java.lang.String r8 = "_empty_state"
            java.lang.Object r3 = r9.A03
            X.Jw7 r3 = (X.C61069Jw7) r3
            if (r7 == 0) goto L_0x0270
            boolean r0 = X.C64136LPl.A01(r3)
            if (r0 == 0) goto L_0x02a6
            X.UzF r0 = X.C16679UzF.WISH_LIST
            java.lang.String r0 = r0.A00(r8)
            X.Lhk r2 = new X.Lhk
            r2.<init>(r0)
        L_0x026b:
            r6.add(r2)
            goto L_0x0131
        L_0x0270:
            boolean r0 = X.C64136LPl.A00(r3)
            if (r0 != 0) goto L_0x0131
            java.lang.Object r0 = r9.A00
            if (r0 == 0) goto L_0x0288
            X.UzF r0 = X.C16679UzF.WISH_LIST
            java.lang.String r1 = r0.A00(r1)
            X.WRt r0 = new X.WRt
            r0.<init>(r1)
            r6.add(r0)
        L_0x0288:
            X.UzF r2 = X.C16679UzF.WISH_LIST
            X.WSm r0 = r4.A02(r9, r2)
            r6.add(r0)
            boolean r0 = X.C64136LPl.A01(r3)
            if (r0 == 0) goto L_0x02a1
            java.lang.String r0 = r2.A00(r8)
            X.Jy9 r2 = new X.Jy9
            r2.<init>(r0)
            goto L_0x026b
        L_0x02a1:
            java.util.List r0 = X.W1O.A00(r3, r4, r2, r11)
            goto L_0x02c5
        L_0x02a6:
            java.lang.Object r0 = r9.A00
            if (r0 == 0) goto L_0x02b8
            X.UzF r0 = X.C16679UzF.WISH_LIST
            java.lang.String r1 = r0.A00(r1)
            X.WRt r0 = new X.WRt
            r0.<init>(r1)
            r6.add(r0)
        L_0x02b8:
            X.UzF r2 = X.C16679UzF.WISH_LIST
            X.WSm r0 = r4.A02(r9, r2)
            r6.add(r0)
            java.util.List r0 = X.W1O.A01(r3, r4, r2, r11)
        L_0x02c5:
            r6.addAll(r0)
            java.lang.Object r1 = r3.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x0322
            X.EWS r1 = X.EWS.LOADING
            java.lang.String r0 = "_load_more_button"
            java.lang.String r0 = r2.A00(r0)
            X.FYP r2 = new X.FYP
            r2.<init>(r1, r0)
            goto L_0x026b
        L_0x02dc:
            X.UzF r1 = X.C16679UzF.CART
            X.WSm r0 = r4.A02(r9, r1)
            r6.add(r0)
            boolean r0 = X.C64136LPl.A01(r2)
            if (r0 == 0) goto L_0x02fb
            java.lang.String r0 = "_empty_state"
            java.lang.String r0 = r1.A00(r0)
            X.Jy9 r1 = new X.Jy9
            r1.<init>(r0)
        L_0x02f6:
            r6.add(r1)
            goto L_0x0247
        L_0x02fb:
            java.util.List r0 = X.W1O.A00(r2, r4, r1, r11)
            r6.addAll(r0)
            java.lang.Object r0 = r2.A01
            boolean r0 = r0 instanceof X.C62085KZp
            if (r0 == 0) goto L_0x0247
            java.lang.String r0 = "_see_more_row"
            java.lang.String r3 = r1.A00(r0)
            r0 = 2131973824(0x7f1356c0, float:1.9584695E38)
            X.HsR r2 = X.JTP.A0P(r0)
            r1 = 15
            X.Iw3 r0 = new X.Iw3
            r0.<init>(r3, r4, r1)
            X.UNv r1 = new X.UNv
            r1.<init>(r2, r3, r0)
            goto L_0x02f6
        L_0x0322:
            java.lang.Object r0 = r3.A01
            boolean r0 = r0 instanceof X.C62085KZp
            if (r0 == 0) goto L_0x0131
            java.lang.String r0 = "_see_more_row"
            java.lang.String r3 = r2.A00(r0)
            r0 = 2131973824(0x7f1356c0, float:1.9584695E38)
            X.HsR r2 = X.JTP.A0P(r0)
            r0 = 18
            X.Iw3 r1 = new X.Iw3
            r1.<init>(r3, r4, r0)
            X.UNv r0 = new X.UNv
            r0.<init>(r2, r3, r1)
            goto L_0x012e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60309JjA.A01(X.JwC, X.JjA, java.util.Set, int):java.util.List");
    }

    public final void onCleared() {
        LOp A002 = C17052VGa.A00(this.A04);
        String str = this.A09;
        synchronized (A002) {
            C61047Jvl A003 = LOp.A00(A002, str);
            0sl r1 = 0sl.A00;
            0qQ.A0B(r1, 0);
            A003.A02 = r1;
            A003.A03 = r1;
        }
    }
}
