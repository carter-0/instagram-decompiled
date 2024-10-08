package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Trn  reason: case insensitive filesystem */
public final class C14208Trn implements X8a {
    public String A00 = "";
    public boolean A01;
    public boolean A02;
    public final Context A03;
    public final UserSession A04;
    public final C14206Trl A05;
    public final C14445TwT A06;
    public final C14447TwV A07;
    public final Set A08 = new HashSet();
    public final boolean A09;
    public final int A0A;
    public final int A0B;
    public final C14206Trl A0C;
    public final C16729V3m A0D;
    public final C14445TwT A0E;
    public final C14447TwV A0F;
    public final boolean A0G;
    public final boolean A0H;

    /* JADX WARNING: type inference failed for: r0v10, types: [X.V3m, java.lang.Object] */
    public C14208Trn(Context context, UserSession userSession, C14206Trl trl, C14445TwT twT, C14447TwV twV) {
        0qQ.A0B(userSession, 1);
        this.A07 = twV;
        this.A05 = trl;
        this.A06 = twT;
        C14438TwM A002 = C14439TwN.A00(userSession);
        boolean z = false;
        if (!G9t.A1b(A002.A02) && (2R8.A00(userSession) || !G9t.A1b(A002.A01))) {
            z = C14471Twt.A05.A00(userSession).A00();
        }
        this.A02 = z;
        this.A04 = userSession;
        this.A03 = context;
        this.A0F = twV;
        this.A0C = trl;
        this.A0E = twT;
        0Tu r4 = 0Tu.A05;
        this.A09 = 182.A06(r4, userSession, 36325381690635179L);
        this.A0B = (int) 182.A01(r4, userSession, 36600762108874727L);
        this.A0A = (int) 182.A01(r4, userSession, 36592094864933142L);
        ? obj = new Object();
        obj.A00 = "";
        obj.A01 = false;
        obj.A02 = false;
        this.A0D = obj;
        this.A0G = C13988Tno.A1Y(userSession);
        this.A0H = C13988Tno.A1Y(userSession);
    }

    public static final C71969Otu A00(C14207Trm trm, String str) {
        C66966Mfz mfz = new C66966Mfz();
        mfz.A09 = "typeahead_echo";
        mfz.A05 = "server_results";
        mfz.A00 = trm.A00;
        mfz.A01 = trm.A01;
        mfz.A0H = true;
        return new C71969Otu(new C66967Mg0(mfz), str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0020, code lost:
        if (X.C14442TwQ.A00.A00(r14.A04) == false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01d1, code lost:
        if (r2 != true) goto L_0x01d3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00a0 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C14198Trd E38(java.lang.String r25, java.util.List r26) {
        /*
            r24 = this;
            r12 = 0
            r13 = r25
            X.0qQ.A0B(r13, r12)
            r11 = 1
            r23 = r26
            r0 = r23
            X.0qQ.A0B(r0, r11)
            r14 = r24
            boolean r0 = r14.A0G
            r19 = 0
            if (r0 == 0) goto L_0x0022
            X.TwQ r1 = X.C14442TwQ.A00
            com.instagram.common.session.UserSession r0 = r14.A04
            boolean r0 = r1.A00(r0)
            r21 = 1
            if (r0 != 0) goto L_0x0024
        L_0x0022:
            r21 = 0
        L_0x0024:
            boolean r0 = r23.isEmpty()
            r0 = r0 ^ 1
            r10 = 0
            if (r0 == 0) goto L_0x031f
            r0 = r23
            java.lang.Object r0 = r0.get(r12)
            X.V3n r0 = (X.C16730V3n) r0
            java.lang.String r6 = r0.A00
        L_0x0037:
            java.util.Set r0 = r14.A08
            boolean r2 = r0.contains(r13)
            java.lang.String r0 = r14.A00
            boolean r1 = r13.equals(r0)
            boolean r0 = r14.A02
            X.Trm r9 = new X.Trm
            r9.<init>(r2, r1, r0)
            X.Trl r4 = r14.A0C
            X.N3M r3 = r4.A00(r13)
            X.0eM r0 = X.0mp.A09
            int r8 = r13.length()
            int r0 = r23.size()
            r7 = 2
            r20 = 0
            if (r0 != r7) goto L_0x0061
            r20 = 1
        L_0x0061:
            if (r3 == 0) goto L_0x031c
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r9.A04(r0, r3)
            java.util.List r5 = X.C70278O0i.A00(r3)
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x031c
            X.Jw7 r2 = X.C18690Vwo.A01()
            X.O2f r1 = new X.O2f
            r1.<init>()
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r9.A05(r0, r2, r1)
            r9.A09(r5, r6)
            r5 = 1
        L_0x0084:
            X.DhA r2 = X.C46568DhA.FULL_WIDTH_WITH_BOTTOM_MARGIN
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            X.Trg r0 = r9.A02
            java.util.List r6 = r0.A00
            r6.add(r2)
            java.util.List r0 = r0.A01
            r0.add(r10)
            int r0 = r9.A00
            int r0 = r0 + 1
            r9.A00 = r0
            boolean r0 = r4.A04(r13)
            if (r0 != 0) goto L_0x00b1
            if (r3 == 0) goto L_0x00ac
            if (r5 == 0) goto L_0x00ac
            X.UqG r0 = new X.UqG
            r0.<init>(r3)
            r9.A04(r1, r0)
        L_0x00ac:
            X.Trd r0 = r9.A01()
            return r0
        L_0x00b1:
            if (r5 == 0) goto L_0x00c1
            X.Jw7 r2 = X.C18690Vwo.A00()
            X.O2f r1 = new X.O2f
            r1.<init>()
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r9.A05(r0, r2, r1)
        L_0x00c1:
            boolean r0 = r14.A01
            if (r0 != 0) goto L_0x00e8
            boolean r0 = r23.isEmpty()
            if (r0 == 0) goto L_0x015e
            int r0 = r14.A0A
            if (r8 >= r0) goto L_0x00e8
            X.TwV r0 = r14.A0F
            X.01N r1 = X.0jo.A1H()
            X.TwO r0 = r0.A03
            java.util.ArrayList r0 = r0.A00(r13)
            r1.addAll(r0)
            X.01N r0 = X.0jo.A1I(r1)
            r9.A06(r0, r10)
            r0.size()
        L_0x00e8:
            boolean r0 = r23.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00f3
            r14.A01(r9)
        L_0x00f3:
            boolean r0 = r14.A09
            if (r0 != 0) goto L_0x0109
            if (r8 < r7) goto L_0x0100
            if (r19 == 0) goto L_0x00fe
            int r8 = r8 - r11
            if (r8 < r7) goto L_0x0100
        L_0x00fe:
            if (r20 == 0) goto L_0x0109
        L_0x0100:
            X.Otu r1 = A00(r9, r13)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r9.A04(r0, r1)
        L_0x0109:
            com.instagram.common.session.UserSession r3 = r14.A04
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317427413161086(0x810682001e147e, double:3.030625562400786E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x00ac
            java.util.Iterator r3 = r23.iterator()
        L_0x011c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00ac
            java.lang.Object r0 = r3.next()
            X.V3n r0 = (X.C16730V3n) r0
            java.util.List r0 = r0.A02
            java.util.Iterator r2 = r0.iterator()
        L_0x012e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x011c
            java.lang.Object r1 = r2.next()
            X.Mfb r1 = (X.C66942Mfb) r1
            boolean r0 = r1 instanceof X.C66632Ma1
            if (r0 == 0) goto L_0x012e
            X.Ma1 r1 = (X.C66632Ma1) r1
            com.instagram.user.model.User r0 = r1.A06()
            X.4Cl r0 = r0.A03
            java.lang.Boolean r0 = r0.CeO()
            if (r0 == 0) goto L_0x012e
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x012e
            X.UqF r1 = new X.UqF
            r1.<init>()
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r9.A05(r0, r1, r10)
            goto L_0x00ac
        L_0x015e:
            java.util.Iterator r4 = r23.iterator()
            r2 = 0
        L_0x0163:
            r19 = 0
        L_0x0165:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x01c2
            java.lang.Object r3 = r4.next()
            X.V3n r3 = (X.C16730V3n) r3
            if (r2 != 0) goto L_0x018a
            java.util.List r1 = r3.A01
            java.util.List r0 = r3.A02
            java.util.ArrayList r1 = X.00k.A0S(r0, r1)
            boolean r0 = r9.A00
            r2 = 0
            if (r0 != 0) goto L_0x018a
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x01ae
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x01ae
        L_0x018a:
            if (r19 != 0) goto L_0x0165
            java.util.List r1 = r3.A02
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0199
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0199
            goto L_0x0163
        L_0x0199:
            java.util.Iterator r1 = r1.iterator()
        L_0x019d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0163
            java.lang.Object r0 = r1.next()
            boolean r0 = r0 instanceof X.C69160Nfj
            if (r0 == 0) goto L_0x019d
            r19 = 1
            goto L_0x0165
        L_0x01ae:
            java.util.Iterator r1 = r1.iterator()
        L_0x01b2:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x018a
            java.lang.Object r0 = r1.next()
            boolean r0 = r0 instanceof X.C67387Mn4
            if (r0 == 0) goto L_0x01b2
            r2 = 1
            goto L_0x018a
        L_0x01c2:
            X.V3m r5 = r14.A0D
            java.lang.String r0 = r5.A00
            boolean r1 = r13.equals(r0)
            if (r1 == 0) goto L_0x01d3
            boolean r0 = r5.A01
            if (r0 != 0) goto L_0x01d3
            r0 = 1
            if (r2 == r11) goto L_0x01d4
        L_0x01d3:
            r0 = 0
        L_0x01d4:
            if (r1 != 0) goto L_0x023e
            r5.A02 = r12
        L_0x01d8:
            r5.A00 = r13
            r5.A01 = r2
            java.util.Iterator r17 = r23.iterator()
            r16 = 0
        L_0x01e2:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x0247
            java.lang.Object r3 = r17.next()
            X.V3n r3 = (X.C16730V3n) r3
            boolean r0 = r14.A0H
            if (r0 != 0) goto L_0x0230
            int r0 = r14.A0A
            if (r8 >= r0) goto L_0x0230
            X.TwV r0 = r14.A0F
            java.lang.String r4 = r3.A00
            int r16 = r0.A01(r9, r13, r4)
            X.01N r1 = X.0jo.A1H()
            X.TwO r0 = r0.A03
            java.util.ArrayList r0 = r0.A00(r13)
            r1.addAll(r0)
            X.01N r0 = X.0jo.A1I(r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r15 = r0.iterator()
        L_0x0218:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x022a
            java.lang.Object r1 = r15.next()
            boolean r0 = r1 instanceof X.C67387Mn4
            if (r0 == 0) goto L_0x0218
            r2.add(r1)
            goto L_0x0218
        L_0x022a:
            r9.A06(r2, r4)
            r2.size()
        L_0x0230:
            boolean r0 = r5.A02
            if (r0 != 0) goto L_0x01e2
            java.util.List r2 = r3.A02
            java.lang.String r1 = r3.A00
            r0 = r21
            r9.A0A(r2, r0, r1, r13)
            goto L_0x01e2
        L_0x023e:
            if (r0 == 0) goto L_0x01d8
            boolean r0 = r5.A02
            if (r0 != 0) goto L_0x01d8
            r5.A02 = r11
            goto L_0x01d8
        L_0x0247:
            int r4 = r14.A0B
            int r4 = r4 - r16
            if (r4 >= r12) goto L_0x024e
            r4 = 0
        L_0x024e:
            java.util.Iterator r18 = r23.iterator()
        L_0x0252:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x02fe
            java.lang.Object r3 = r18.next()
            X.V3n r3 = (X.C16730V3n) r3
            boolean r0 = r14.A0H
            if (r0 == 0) goto L_0x0269
            X.TwV r1 = r14.A0F
            java.lang.String r0 = r3.A00
            r1.A01(r9, r13, r0)
        L_0x0269:
            java.util.List r1 = r3.A01
            java.lang.String r0 = r3.A00
            r22 = r0
            X.0qQ.A0B(r1, r12)
            boolean r0 = r9.A00
            r17 = r0
            r15 = 0
            if (r0 != 0) goto L_0x02af
            java.util.Iterator r16 = r1.iterator()
        L_0x027d:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x02af
            java.lang.Object r2 = r16.next()
            if (r15 == r4) goto L_0x02af
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Any"
            X.0qQ.A0C(r2, r0)
            boolean r0 = r6.contains(r2)
            if (r0 != 0) goto L_0x0296
            int r15 = r15 + 1
        L_0x0296:
            boolean r0 = r2 instanceof X.C67387Mn4
            if (r0 != 0) goto L_0x027d
            X.Mfz r1 = new X.Mfz
            r1.<init>()
            java.lang.String r0 = "client_side_matching"
            r1.A09 = r0
            r0 = r22
            r1.A06 = r0
            java.lang.String r0 = "server_results"
            r1.A05 = r0
            r9.A03(r1, r2)
            goto L_0x027d
        L_0x02af:
            int r4 = r4 - r15
            if (r4 >= r12) goto L_0x02b3
            r4 = 0
        L_0x02b3:
            java.util.List r0 = r3.A02
            X.0qQ.A0B(r0, r12)
            r3 = 0
            if (r17 != 0) goto L_0x02f8
            java.util.Iterator r15 = r0.iterator()
        L_0x02bf:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x02f8
            java.lang.Object r2 = r15.next()
            boolean r0 = r2 instanceof X.C67387Mn4
            if (r0 != 0) goto L_0x02bf
            if (r3 == r4) goto L_0x02f8
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Any"
            X.0qQ.A0C(r2, r0)
            boolean r0 = r6.contains(r2)
            if (r0 != 0) goto L_0x02dc
            int r3 = r3 + 1
        L_0x02dc:
            X.Mfz r1 = new X.Mfz
            r1.<init>()
            boolean r0 = r9.A01
            if (r0 == 0) goto L_0x02f5
            java.lang.String r0 = "server"
        L_0x02e7:
            r1.A09 = r0
            r0 = r22
            r1.A06 = r0
            java.lang.String r0 = "server_results"
            r1.A05 = r0
            r9.A03(r1, r2)
            goto L_0x02bf
        L_0x02f5:
            java.lang.String r0 = "query_cache"
            goto L_0x02e7
        L_0x02f8:
            int r4 = r4 - r3
            if (r4 >= r12) goto L_0x0252
            r4 = 0
            goto L_0x0252
        L_0x02fe:
            boolean r0 = r5.A02
            if (r0 == 0) goto L_0x00e8
            java.util.Iterator r3 = r23.iterator()
        L_0x0306:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00e8
            java.lang.Object r0 = r3.next()
            X.V3n r0 = (X.C16730V3n) r0
            java.util.List r2 = r0.A02
            java.lang.String r1 = r0.A00
            r0 = r21
            r9.A0A(r2, r0, r1, r13)
            goto L_0x0306
        L_0x031c:
            r5 = 0
            goto L_0x0084
        L_0x031f:
            r6 = r10
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14208Trn.E38(java.lang.String, java.util.List):X.Trd");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0065 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C14198Trd E3A(java.lang.String r22, java.lang.String r23, java.util.List r24, java.util.List r25) {
        /*
            r21 = this;
            r2 = 0
            r6 = r22
            r20 = r24
            r19 = r25
            r1 = r20
            r0 = r19
            boolean r1 = X.C51973G9u.A1b(r6, r1, r0)
            r8 = r21
            java.util.Set r0 = r8.A08
            boolean r4 = r0.contains(r6)
            java.lang.String r0 = r8.A00
            boolean r3 = r6.equals(r0)
            boolean r0 = r8.A02
            X.Trm r5 = new X.Trm
            r5.<init>(r4, r3, r0)
            X.Trl r13 = r8.A0C
            X.N3M r12 = r13.A00(r6)
            r9 = r23
            if (r12 == 0) goto L_0x01a2
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r5.A04(r0, r12)
            java.util.List r3 = X.C70278O0i.A00(r12)
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x01a2
            X.Jw7 r0 = X.C18690Vwo.A01()
            X.C14199Tre.A00(r5, r0)
            r5.A09(r3, r9)
            r14 = 1
        L_0x0048:
            X.DhA r11 = X.C46568DhA.FULL_WIDTH_WITH_BOTTOM_MARGIN
            java.lang.Integer r7 = X.AnonymousClass05K.A01
            X.Trg r0 = r5.A02
            r4 = 0
            java.util.List r10 = r0.A00
            r10.add(r11)
            java.util.List r3 = r0.A01
            r3.add(r4)
            int r0 = r5.A00
            int r0 = r0 + 1
            r5.A00 = r0
            boolean r0 = r13.A04(r6)
            if (r0 != 0) goto L_0x0076
            if (r12 == 0) goto L_0x0071
            if (r14 == 0) goto L_0x0071
            X.UqG r0 = new X.UqG
            r0.<init>(r12)
            r5.A04(r7, r0)
        L_0x0071:
            X.Trd r0 = r5.A01()
            return r0
        L_0x0076:
            if (r14 == 0) goto L_0x007f
            X.Jw7 r0 = X.C18690Vwo.A00()
            X.C14199Tre.A00(r5, r0)
        L_0x007f:
            boolean r0 = r8.A01
            if (r0 != 0) goto L_0x018e
            X.0eM r0 = X.0mp.A09
            int r12 = r6.length()
            int r0 = r8.A0A
            if (r12 >= r0) goto L_0x009d
            X.TwV r0 = r8.A0F
            int r18 = r0.A01(r5, r6, r9)
        L_0x0093:
            X.TwT r14 = r8.A0E
            X.1UV r15 = X.VKD.A00
            r0 = 4
            X.0qQ.A0B(r15, r0)
            monitor-enter(r14)
            goto L_0x00a0
        L_0x009d:
            r18 = 0
            goto L_0x0093
        L_0x00a0:
            java.util.concurrent.ConcurrentMap r0 = r14.A01     // Catch:{ all -> 0x01a5 }
            java.lang.Object r13 = r0.get(r6)     // Catch:{ all -> 0x01a5 }
            X.OEW r13 = (X.OEW) r13     // Catch:{ all -> 0x01a5 }
            monitor-exit(r14)
            if (r13 == 0) goto L_0x012b
            java.util.List r0 = r13.A02
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r17 = r0.iterator()
        L_0x00b6:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x00ca
            java.lang.Object r0 = r17.next()
            boolean r16 = r15.apply(r0)
            if (r16 == 0) goto L_0x00b6
            r12.add(r0)
            goto L_0x00b6
        L_0x00ca:
            java.util.Set r0 = r14.A00
            boolean r0 = r0.contains(r6)
            r16 = r12
            if (r0 != 0) goto L_0x00da
            int r0 = r13.A00
            java.util.List r16 = X.00k.A0d(r12, r0)
        L_0x00da:
            java.util.Iterator r15 = r16.iterator()
        L_0x00de:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x010d
            java.lang.Object r14 = r15.next()
            X.Mfb r14 = (X.C66942Mfb) r14
            boolean r0 = r14 instanceof X.C67387Mn4
            if (r0 == 0) goto L_0x00f4
            r0 = r14
            X.Mn4 r0 = (X.C67387Mn4) r0
            r0.A06(r6, r2)
        L_0x00f4:
            X.Mfz r13 = new X.Mfz
            r13.<init>()
            java.lang.String r0 = "server"
            r13.A09 = r0
            java.lang.String r0 = "SEE_MORE"
            r13.A08 = r0
            r13.A06 = r9
            java.lang.String r0 = "server_results"
            r13.A05 = r0
            r13.A0E = r1
            r5.A03(r13, r14)
            goto L_0x00de
        L_0x010d:
            int r1 = r16.size()
            int r0 = r12.size()
            if (r1 == r0) goto L_0x012b
            X.O2h r0 = new X.O2h
            r0.<init>()
            r5.A04(r7, r0)
            r10.add(r11)
            r3.add(r4)
            int r0 = r5.A00
            int r0 = r0 + 1
            r5.A00 = r0
        L_0x012b:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r19.iterator()
        L_0x0134:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0146
            java.lang.Object r1 = r3.next()
            boolean r0 = r1 instanceof X.C66632Ma1
            if (r0 == 0) goto L_0x0134
            r4.add(r1)
            goto L_0x0134
        L_0x0146:
            r5.A07(r4, r9)
            int r7 = r8.A0B
            int r7 = r7 - r18
            int r0 = r19.size()
            int r7 = r7 - r0
            if (r7 < r2) goto L_0x018e
            if (r7 == 0) goto L_0x018e
            r4 = 0
            java.util.Iterator r3 = r20.iterator()
        L_0x015b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x018e
            java.lang.Object r2 = r3.next()
            if (r4 == r7) goto L_0x018e
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Any"
            X.0qQ.A0C(r2, r0)
            boolean r0 = r10.contains(r2)
            if (r0 != 0) goto L_0x0174
            int r4 = r4 + 1
        L_0x0174:
            X.Mfz r1 = new X.Mfz
            r1.<init>()
            boolean r0 = r5.A01
            if (r0 == 0) goto L_0x018b
            java.lang.String r0 = "server"
        L_0x017f:
            r1.A09 = r0
            r1.A06 = r9
            java.lang.String r0 = "server_results"
            r1.A05 = r0
            r5.A03(r1, r2)
            goto L_0x015b
        L_0x018b:
            java.lang.String r0 = "query_cache"
            goto L_0x017f
        L_0x018e:
            boolean r0 = X.AnonymousClass7TE.A1b(r20)
            if (r0 == 0) goto L_0x0197
            r8.A01(r5)
        L_0x0197:
            X.Otu r1 = A00(r5, r6)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r5.A04(r0, r1)
            goto L_0x0071
        L_0x01a2:
            r14 = 0
            goto L_0x0048
        L_0x01a5:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14208Trn.E3A(java.lang.String, java.lang.String, java.util.List, java.util.List):X.Trd");
    }

    private final void A01(C14207Trm trm) {
        long j;
        UserSession userSession = this.A04;
        1Av A002 = 1Au.A00(userSession);
        if (!AnonymousClass7TG.A1a(A002, A002.A1u, 1Av.A8a, 487)) {
            Context context = this.A03;
            boolean A012 = C267044ar.A01(context, userSession);
            0Tu r3 = 0Tu.A05;
            if (A012) {
                j = 36322190530127861L;
            } else {
                j = 36322190531569658L;
            }
            if (182.A06(r3, userSession, j)) {
                trm.A04(AnonymousClass05K.A01, new C16194UqJ(new C69155Nfe("search_invites_upsell"), AnonymousClass05K.A0C, AnonymousClass7TF.A0d(context.getResources(), 2131972824), AnonymousClass7TF.A0d(context.getResources(), 2131972823), "search_invites_upsell", context.getResources().getString(2131972822), trm.A00));
            }
        }
    }

    public final void Dhi(UKV ukv) {
        int i;
        this.A02 = ukv.A02;
        C14440TwO twO = this.A07.A03;
        if (ukv.A03) {
            i = ukv.A00;
        } else {
            i = twO.A01;
        }
        twO.A00 = i;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.Tx9, X.Tre] */
    public final C14198Trd E39() {
        List A022;
        List A023;
        List A024;
        List list;
        Integer num;
        User user;
        List arrayList;
        int i;
        List list2;
        List list3;
        C49516Ewv ewv;
        C49516Ewv ewv2;
        int i2;
        int i3;
        int i4;
        ? tre = new C14199Tre(this.A02);
        C14447TwV twV = this.A07;
        01N A1H = 0jo.A1H();
        UserSession userSession = twV.A02;
        C14419Tvo A002 = C14416Tvl.A00(userSession);
        synchronized (A002) {
            A022 = A002.A00.A02();
        }
        A1H.addAll(A022);
        A1H.addAll(C14415Tvk.A00(userSession).A00.A02());
        C14420Tvp A003 = C14417Tvm.A00(userSession);
        synchronized (A003) {
            A023 = A003.A00.A02();
        }
        A1H.addAll(A023);
        if (AnonymousClass7TF.A1Z(twV.A04)) {
            A1H.addAll(C14433TwH.A00(userSession).A00.A02());
        }
        C14017ToJ A004 = C14025ToR.A00(userSession);
        synchronized (A004) {
            A024 = A004.A00.A02();
        }
        A1H.addAll(A024);
        01V.A1C(A1H);
        01N A1I = 0jo.A1I(A1H);
        boolean z = twV.A06;
        if (z && !twV.A07) {
            C14447TwV.A00(tre, twV);
        }
        Context context = twV.A01;
        if (C267044ar.A00(context, userSession) && 182.A06(0Tu.A05, userSession, 36320463953076706L)) {
            1Av A005 = 1Au.A00(userSession);
            long currentTimeMillis = System.currentTimeMillis();
            0xa r7 = A005.A01;
            0Tu r9 = 0Tu.A06;
            boolean A1T = C51970G9q.A1T((((long) r7.getInt("search_nullstate_ci_upsell_dismissed_count", 0)) > 182.A01(r9, userSession, 36601938929914237L) ? 1 : (((long) r7.getInt("search_nullstate_ci_upsell_dismissed_count", 0)) == 182.A01(r9, userSession, 36601938929914237L) ? 0 : -1)));
            TimeUnit timeUnit = TimeUnit.HOURS;
            boolean A1R = AnonymousClass7TF.A1R(((currentTimeMillis - r7.getLong("search_nullstate_ci_upsell_dismissed_timestamp", 0)) > timeUnit.toMillis(182.A01(r9, userSession, 36601938929848700L)) ? 1 : ((currentTimeMillis - r7.getLong("search_nullstate_ci_upsell_dismissed_timestamp", 0)) == timeUnit.toMillis(182.A01(r9, userSession, 36601938929848700L)) ? 0 : -1)));
            if (A1T && A1R) {
                long j = (long) r7.getInt("search_nullstate_ci_upsell_impression_count", 0);
                long A012 = 182.A01(r9, userSession, 36601938930045311L);
                long millis = timeUnit.toMillis(182.A01(r9, userSession, 36601938929979774L));
                if (j <= 0 || millis != 0) {
                    if (j >= A012) {
                        if (currentTimeMillis - r7.getLong("search_nullstate_ci_upsell_impression_timestamp", 0) > millis) {
                            AnonymousClass7TG.A1M(r7, "search_nullstate_ci_upsell_impression_count", 0);
                        }
                    }
                    boolean isEmpty = A1I.isEmpty();
                    Resources resources = context.getResources();
                    if (isEmpty) {
                        tre.A05(AnonymousClass05K.A00, new C66972Mg5(AnonymousClass7TF.A0d(resources, 2131955120)), (Object) null);
                    } else {
                        String A0d = AnonymousClass7TF.A0d(resources, 2131955120);
                        String A0d2 = AnonymousClass7TF.A0d(context.getResources(), 2131956510);
                        C69155Nfe nfe = new C69155Nfe("search_nullstate_ci_row_upsell");
                        Integer num2 = AnonymousClass05K.A00;
                        tre.A05(num2, new C16194UqJ(nfe, num2, A0d, A0d2, "search_nullstate_ci_row_upsell", (String) null, 0), (Object) null);
                    }
                }
            }
        }
        if (DbT.A1b(A1I)) {
            GKO gko = new GKO(new Object[0], 2131972863);
            Integer num3 = AnonymousClass05K.A0C;
            tre.A05(num3, new C61069Jw7((C266444Yx) gko, num3, AnonymousClass05K.A00), new Object());
            C67383Mmz A006 = C14408Tvb.A00(userSession);
            int i5 = A006.A01;
            if (i5 == 0 || !AnonymousClass7TE.A1b(A006.A02.A04) || i5 == 3) {
                i2 = -1;
            } else {
                i2 = A006.A00;
            }
            C14406TvZ A007 = C14205Trk.A00(userSession);
            if (!A007.A07 || !AnonymousClass7TE.A1b(A007.A03)) {
                i3 = -1;
            } else {
                i3 = A007.A04;
            }
            if (i2 > 0) {
                i4 = Math.min(Integer.MAX_VALUE, i2);
            } else {
                i4 = Integer.MAX_VALUE;
            }
            if (i3 > 0) {
                i4 = Math.min(i4, i3);
            }
            if (twV.A07) {
                i4 = Math.min(i4, 4);
            }
            if (i4 == Integer.MAX_VALUE) {
                i4 = -1;
            }
            if (i4 > 0) {
                A1I = A1I.subList(0, Math.min(i4, A1I.size()));
            }
            tre.A06("", A1I, twV.A05);
        }
        if (z && twV.A07) {
            C14447TwV.A00(tre, twV);
        }
        if (C14205Trk.A00(userSession).A07) {
            C14406TvZ A008 = C14205Trk.A00(userSession);
            if (A008.A07) {
                list = A008.A03;
            } else {
                list = 0sn.A00;
            }
            String str = C14205Trk.A00(userSession).A01;
            List list4 = C14205Trk.A00(userSession).A02;
            if (!(!AnonymousClass7TE.A1b(list) || str == null || str.length() == 0)) {
                boolean z2 = !182.A06(0Tu.A06, userSession, 36321121083401342L);
                C52255GKw gKw = new C52255GKw(str);
                if (z2) {
                    num = AnonymousClass05K.A0C;
                } else {
                    num = null;
                }
                C14199Tre.A00(tre, new C61069Jw7((C266444Yx) gKw, num, AnonymousClass05K.A1F));
                C49516Ewv ewv3 = C14434TwI.A00(userSession).A02;
                if (ewv3 != null) {
                    user = ewv3.A00;
                } else {
                    user = null;
                }
                if (!C14434TwI.A00(userSession).A06 || (ewv2 = C14434TwI.A00(userSession).A02) == null) {
                    arrayList = new ArrayList();
                } else {
                    arrayList = ewv2.A01;
                }
                if (C14434TwI.A00(userSession).A06 && (ewv = C14434TwI.A00(userSession).A02) != null) {
                    String id = ewv.A00.getId();
                    i = 0;
                    if (id.length() != 0) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            int i6 = i + 1;
                            if (i >= 0) {
                                if (0qQ.A0K(((C66942Mfb) next).A01(), id)) {
                                    break;
                                }
                                i = i6;
                            } else {
                                break;
                            }
                        }
                        0sr.A1T();
                        throw AnonymousClass00P.createAndThrow();
                    }
                }
                i = -1;
                if (user == null || !AnonymousClass7TE.A1b(arrayList) || i == -1) {
                    int i7 = 0;
                    for (Object next2 : list) {
                        int i8 = i7 + 1;
                        if (i7 >= 0) {
                            C66966Mfz mfz = new C66966Mfz();
                            mfz.A09 = "null_state_suggested_users";
                            mfz.A08 = "SUGGESTED_USERS";
                            mfz.A0G = true;
                            if (list4 != null) {
                                list2 = (List) 00k.A0O(list4, i7);
                            } else {
                                list2 = null;
                            }
                            mfz.A0B = list2;
                            mfz.A01 = i7;
                            Locale locale = Locale.getDefault();
                            0qQ.A07(locale);
                            String lowerCase = "SUGGESTED_USERS".toLowerCase(locale);
                            0qQ.A07(lowerCase);
                            mfz.A05 = lowerCase;
                            tre.A02(mfz, next2);
                            i7 = i8;
                        } else {
                            0sr.A1T();
                            throw AnonymousClass00P.createAndThrow();
                        }
                    }
                } else {
                    C16196UqL uqL = new C16196UqL(user, arrayList);
                    int i9 = 0;
                    for (Object next3 : list) {
                        int i10 = i9 + 1;
                        if (i9 >= 0) {
                            C66966Mfz mfz2 = new C66966Mfz();
                            mfz2.A09 = "null_state_suggested_users";
                            mfz2.A08 = "SUGGESTED_USERS";
                            mfz2.A0G = true;
                            if (list4 != null) {
                                list3 = (List) 00k.A0O(list4, i9);
                            } else {
                                list3 = null;
                            }
                            mfz2.A0B = list3;
                            mfz2.A01 = i9;
                            Locale locale2 = Locale.getDefault();
                            0qQ.A07(locale2);
                            String lowerCase2 = "SUGGESTED_USERS".toLowerCase(locale2);
                            0qQ.A07(lowerCase2);
                            mfz2.A05 = lowerCase2;
                            tre.A02(mfz2, next3);
                            if (i9 == i) {
                                C66966Mfz mfz3 = new C66966Mfz();
                                mfz3.A09 = "null_state_suggested_users";
                                mfz3.A08 = "SUGGESTED_USERS";
                                tre.A05(AnonymousClass05K.A00, uqL, new C66967Mg0(mfz3));
                            }
                            i9 = i10;
                        } else {
                            0sr.A1T();
                            throw AnonymousClass00P.createAndThrow();
                        }
                    }
                }
            }
            if (182.A06(0Tu.A06, userSession, 36321121083401342L)) {
                C16195UqK uqK = new C16195UqK();
                C14201Trg trg = tre.A02;
                trg.A00.add(uqK);
                trg.A01.add((Object) null);
                tre.A00++;
            }
        }
        if (C14408Tvb.A00(userSession).A01 != 3) {
            List list5 = C14408Tvb.A00(userSession).A02.A04;
            if (AnonymousClass7TE.A1b(list5)) {
                C14199Tre.A00(tre, new C61069Jw7((C266444Yx) new GKO(new Object[0], 2131972862), AnonymousClass05K.A01, AnonymousClass05K.A0u));
                for (Object next4 : list5) {
                    C66966Mfz mfz4 = new C66966Mfz();
                    mfz4.A09 = "null_state_popular";
                    mfz4.A08 = "POPULAR";
                    Locale locale3 = Locale.getDefault();
                    0qQ.A07(locale3);
                    String lowerCase3 = "POPULAR".toLowerCase(locale3);
                    0qQ.A07(lowerCase3);
                    mfz4.A05 = lowerCase3;
                    tre.A02(mfz4, next4);
                }
            }
        }
        return tre.A01();
    }
}
