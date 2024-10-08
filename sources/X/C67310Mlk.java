package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.MarkerEditor;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Mlk  reason: case insensitive filesystem */
public final class C67310Mlk extends AnonymousClass659 {
    public final UserSession A00;
    public final 2EM A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final long A05;
    public final C2611948q A06;
    public final /* synthetic */ AnonymousClass43O A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67310Mlk(UserSession userSession, 2EM r3, AnonymousClass43O r4, C2611948q r5, String str, String str2, long j, long j2) {
        super(r4, Long.valueOf(j));
        this.A07 = r4;
        this.A00 = userSession;
        this.A05 = j2;
        this.A06 = r5;
        this.A03 = str;
        this.A02 = str2;
        this.A01 = r3;
        this.A04 = DbW.A1a(str);
    }

    public final int A00() {
        long A012 = 182.A01(0Tu.A05, this.A00, 36592318203494844L);
        if (A012 >= 0) {
            return (int) A012;
        }
        return -1;
    }

    public final void A01() {
        Integer num;
        UserSession userSession;
        0Tu r0;
        long j;
        Integer num2;
        AnonymousClass7BV r6;
        Integer num3;
        String str;
        AnonymousClass43O r62 = this.A07;
        int i = r62.A00;
        if (i != 0) {
            num = Integer.valueOf(i);
        } else {
            num = null;
        }
        boolean z = this.A04;
        if (z || !r62.A0E) {
            userSession = this.A00;
            if (!z) {
                r0 = 0Tu.A05;
                j = 36592318203363770L;
            } else {
                r0 = 0Tu.A06;
                j = 36592318203101624L;
            }
        } else {
            userSession = this.A00;
            r0 = 0Tu.A05;
            j = 36592318203232697L;
        }
        int A042 = DbS.A04(r0, userSession, j);
        if (A042 != 0) {
            num2 = Integer.valueOf(A042);
        } else {
            num2 = null;
        }
        C2611948q r3 = this.A06;
        2EM r14 = this.A01;
        String A012 = C66681Mao.A01(userSession, r14.A01, r3);
        AnonymousClass43L r5 = r62.A07;
        if (r5 != null) {
            long j2 = this.A05;
            boolean A002 = r62.A05.A00();
            boolean A022 = 2Aj.A02(userSession);
            Integer num4 = r14.A03;
            int i2 = r14.A00;
            if (z) {
                str = "snapshot";
            } else {
                str = "paging_new";
            }
            String str2 = this.A02;
            int i3 = this.A00;
            String str3 = this.A05;
            Long valueOf = Long.valueOf(j2);
            AnonymousClass7TF.A1D(userSession, 0, num4);
            0qQ.A0B(str3, 11);
            r6 = r5.A01(userSession, (Boolean) null, (Boolean) null, valueOf, 20119555, A002, A022, true);
            02m r10 = r5.A00;
            MarkerEditor withMarker = r10.withMarker(r6.A01, r6.A00);
            withMarker.annotate("inbox_type", C67312Mlm.A00(num4));
            withMarker.annotate("thread_folder_type", i2);
            withMarker.annotate("thread_filter", A012);
            withMarker.annotate("fetch_type", str);
            withMarker.annotate("is_feed_to_inbox_v2_on_when_start", r10.isMarkerOn(1060769838));
            withMarker.annotate("is_feed_to_inbox_v1_on_when_start", r10.isMarkerOn(31784971));
            withMarker.annotate("uuid", str3);
            withMarker.annotate(TraceFieldType.RetryCount, i3);
            if (num != null) {
                withMarker.annotate("thread_limit", num.intValue());
            }
            if (num2 != null) {
                withMarker.annotate("thread_message_limit", num2.intValue());
            }
            if (str2 != null) {
                withMarker.annotate("fetch_reason", str2);
            }
            withMarker.markerEditingCompleted();
        } else {
            r6 = null;
        }
        this.A03 = r6;
        String str4 = this.A03;
        if (str4 != null) {
            num3 = AnonymousClass05K.A01;
        } else {
            num3 = null;
        }
        Long l = this.A04;
        if (l != null) {
            AnonymousClass7BV r15 = r6;
            C66716MbN A003 = C67314Mlo.A00(userSession, r14, r15, false, num3, num, num2, str4, (String) null, A012, (String) null, this.A02, this.A05, (List) null, l.longValue());
            A003.A00(this);
            this.A02 = A003;
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void A02() {
        Long l;
        B72 b72;
        AnonymousClass43O r6 = this.A07;
        AnonymousClass43L r5 = r6.A07;
        if (r5 != null) {
            AnonymousClass7BV r3 = this.A03;
            C268654dm r0 = this.A01;
            if (r0 == null || (b72 = (B72) r0.A00()) == null) {
                l = null;
            } else {
                l = Long.valueOf(b72.A01);
            }
            if (r3 != null) {
                AnonymousClass43L.A00(r3, r5, l);
                r5.A0D(r3, (Boolean) null, false);
                r5.A00.markerEnd(20132917, 3);
            }
        }
        A03();
        r6.A0D(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0103, code lost:
        if (r5 != false) goto L_0x00bd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d2 A[LOOP:4: B:37:0x00cc->B:39:0x00d2, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0134  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04() {
        /*
            r19 = this;
            r3 = r19
            X.4dm r0 = r3.A01
            if (r0 == 0) goto L_0x030e
            java.lang.Object r15 = r0.A00()
            X.B72 r15 = (X.B72) r15
            if (r15 == 0) goto L_0x030e
            boolean r0 = r15.isOk()
            if (r0 == 0) goto L_0x030e
            X.7BV r13 = r3.A03
            X.8wb r0 = r15.A05
            java.util.List r8 = r0.A05
            X.0qQ.A07(r8)
            long r0 = r15.A01
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            X.43O r1 = r3.A07
            X.43L r2 = r1.A07
            if (r2 == 0) goto L_0x019b
            int r12 = r8.size()
            java.util.HashSet r7 = X.AnonymousClass7TE.A1F()
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r9 = r8.iterator()
        L_0x0039:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0056
            java.lang.Object r5 = r9.next()
            r0 = r5
            X.5xS r0 = (X.C300585xS) r0
            int r0 = r0.A0I
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r7.add(r0)
            if (r0 == 0) goto L_0x0039
            r6.add(r5)
            goto L_0x0039
        L_0x0056:
            java.util.ArrayList r10 = X.AnonymousClass7TF.A0p(r6)
            java.util.Iterator r5 = r6.iterator()
        L_0x005e:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0074
            java.lang.Object r0 = r5.next()
            X.5xS r0 = (X.C300585xS) r0
            int r0 = r0.A0I
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10.add(r0)
            goto L_0x005e
        L_0x0074:
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r9 = r8.iterator()
        L_0x007c:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0093
            java.lang.Object r6 = r9.next()
            r0 = r6
            X.5xS r0 = (X.C300585xS) r0
            int r5 = r0.A0I
            r0 = 29
            if (r5 != r0) goto L_0x007c
            r7.add(r6)
            goto L_0x007c
        L_0x0093:
            java.util.ArrayList r6 = X.AnonymousClass7TF.A0p(r7)
            java.util.Iterator r5 = r7.iterator()
        L_0x009b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00ad
            java.lang.Object r0 = r5.next()
            X.5xS r0 = (X.C300585xS) r0
            java.lang.String r0 = r0.A1J
            r6.add(r0)
            goto L_0x009b
        L_0x00ad:
            r9 = 0
            java.lang.String[] r7 = X.DbU.A1b(r6, r9)
            boolean r5 = r8 instanceof java.util.Collection
            if (r5 == 0) goto L_0x00e0
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x00e0
            r11 = 0
        L_0x00bd:
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0106
            r5 = 0
        L_0x00c4:
            java.util.ArrayList r6 = X.AnonymousClass7TF.A0p(r8)
            java.util.Iterator r8 = r8.iterator()
        L_0x00cc:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0128
            java.lang.Object r0 = r8.next()
            X.5xS r0 = (X.C300585xS) r0
            java.lang.Long r0 = r0.A00()
            r6.add(r0)
            goto L_0x00cc
        L_0x00e0:
            java.util.Iterator r6 = r8.iterator()
            r11 = 0
        L_0x00e5:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0103
            java.lang.Object r0 = r6.next()
            X.8wd r0 = (X.C370538wd) r0
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x00e5
            int r11 = r11 + 1
            if (r11 >= 0) goto L_0x00e5
        L_0x00fb:
            X.0sr.A1S()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0103:
            if (r5 == 0) goto L_0x0106
            goto L_0x00bd
        L_0x0106:
            java.util.Iterator r14 = r8.iterator()
            r5 = 0
        L_0x010b:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x00c4
            java.lang.Object r0 = r14.next()
            X.8wd r0 = (X.C370538wd) r0
            com.instagram.common.session.UserSession r6 = r3.A00
            X.3Tu r0 = r0.A0Z
            if (r0 == 0) goto L_0x010b
            boolean r0 = r0.A03(r6)
            if (r0 == 0) goto L_0x010b
            int r5 = r5 + 1
            if (r5 >= 0) goto L_0x010b
            goto L_0x00fb
        L_0x0128:
            java.lang.Long[] r0 = new java.lang.Long[r9]
            java.lang.Object[] r8 = r6.toArray(r0)
            r0 = 3
            X.DbW.A1O(r7, r0, r8)
            if (r13 == 0) goto L_0x019b
            X.AnonymousClass43L.A00(r13, r2, r4)
            X.02m r6 = r2.A00
            int r4 = r13.A01
            int r0 = r13.A00
            com.facebook.quicklog.MarkerEditor r6 = r6.withMarker(r4, r0)
            java.lang.String r0 = "fetched_thread_count"
            r6.annotate(r0, r12)
            int[] r4 = X.00k.A0x(r10)
            java.lang.String r0 = "thread_type_list"
            r6.annotate(r0, r4)
            java.lang.String r0 = "tlc_thread_count"
            r6.annotate(r0, r11)
            java.lang.String r0 = "ttlc_thread_count"
            r6.annotate(r0, r5)
            java.util.ArrayList r5 = X.AnonymousClass7TF.A0p(r10)
            java.util.Iterator r4 = r10.iterator()
        L_0x0161:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0179
            java.lang.Object r0 = r4.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.String r0 = X.AnonymousClass48O.A00(r0)
            r5.add(r0)
            goto L_0x0161
        L_0x0179:
            java.lang.String[] r4 = X.DbU.A1b(r5, r9)
            java.lang.String r0 = "thread_type_str_list"
            r6.annotate(r0, r4)
            java.lang.String r5 = ", "
            r4 = 0
            java.lang.String r0 = ""
            java.lang.String r4 = X.03t.A07(r5, r0, r0, r4, r8)
            java.lang.String r0 = "thread_jids"
            r6.annotate(r0, r4)
            int r0 = r7.length
            if (r0 == 0) goto L_0x0198
            java.lang.String r0 = "thread_id_list"
            r6.annotate(r0, r7)
        L_0x0198:
            r6.markerEditingCompleted()
        L_0x019b:
            com.instagram.user.model.User r4 = r15.A09
            if (r4 == 0) goto L_0x01c4
            com.instagram.common.session.UserSession r0 = r3.A00
            X.4kA r7 = X.AnonymousClass4k9.A00(r0)
            X.4Cl r0 = r4.A03
            com.instagram.api.schemas.BizUserInboxState r0 = r0.Ag1()
            if (r0 != 0) goto L_0x01af
            com.instagram.api.schemas.BizUserInboxState r0 = com.instagram.api.schemas.BizUserInboxState.NORMAL
        L_0x01af:
            java.lang.String r0 = r0.A00
            int r6 = java.lang.Integer.parseInt(r0)
            X.0s0 r5 = r7.A0R
            X.0YZ[] r4 = X.AnonymousClass4kA.A0c
            r0 = 9
            r4 = r4[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r5.Epx(r7, r0, r4)
        L_0x01c4:
            X.8wb r8 = r15.A05
            X.0qQ.A07(r8)
            X.2Eh r0 = r8.A01
            if (r0 != 0) goto L_0x0238
            java.lang.Boolean r0 = r8.A02
            if (r0 == 0) goto L_0x02c9
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x02c9
            java.util.List r0 = r8.A05
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x02ce
            java.util.List r4 = r8.A05
            int r0 = r0 + -1
            java.lang.Object r4 = r4.get(r0)
            X.5xS r4 = (X.C300585xS) r4
            java.lang.Long r0 = r4.A19
            if (r0 != 0) goto L_0x02c3
            r6 = 0
        L_0x01ef:
            java.lang.String r0 = r4.A1J
            double r4 = (double) r6
            r6 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r4 = r4 / r6
            double r4 = java.lang.Math.ceil(r4)
            int r6 = (int) r4
            if (r0 != 0) goto L_0x0205
            X.2Ee r0 = X.C69952Ee.A00
            java.lang.Object r0 = r0.A01
            java.lang.String r0 = (java.lang.String) r0
        L_0x0205:
            X.2Eh r9 = new X.2Eh
            r9.<init>(r6, r0)
            X.2Ee r5 = X.C69952Ee.A00
            java.util.Comparator r7 = r5.A02
            java.lang.String r0 = r9.A01
            java.lang.Object r4 = r5.A01
            int r0 = r7.compare(r0, r4)
            if (r0 == 0) goto L_0x02b5
            int r6 = r9.A00
            java.lang.String r5 = r9.A01
            int r0 = r7.compare(r5, r4)
            if (r0 == 0) goto L_0x0231
            java.math.BigInteger r4 = new java.math.BigInteger
            r4.<init>(r5)
            java.math.BigInteger r0 = java.math.BigInteger.ONE
            java.math.BigInteger r0 = r4.subtract(r0)
            java.lang.String r5 = r0.toString()
        L_0x0231:
            X.2Eh r9 = new X.2Eh
            r9.<init>(r6, r5)
        L_0x0236:
            r8.A01 = r9
        L_0x0238:
            boolean r5 = r3.A04
            if (r5 == 0) goto L_0x0248
            X.2Eh r0 = r8.A00
            if (r0 != 0) goto L_0x0248
            X.2Ec r0 = X.C69942Ec.A00
            java.lang.Object r0 = r0.A00
            X.2Eh r0 = (X.2Eh) r0
            r8.A00 = r0
        L_0x0248:
            java.lang.String r6 = r3.A02
            java.lang.String r0 = "public_tab_loading"
            boolean r0 = X.0qQ.A0K(r6, r0)
            if (r0 == 0) goto L_0x026d
            X.2Dm r0 = r1.A09
            X.2Dr r0 = (X.2Dr) r0
            X.2ED r8 = r0.A0C
            X.2EX r0 = X.AnonymousClass2EX.A00
            java.util.Set r7 = X.JTP.A0y(r0)
            X.8wb r0 = r15.A05
            java.util.List r0 = r0.A05
            X.0qQ.A07(r0)
            boolean r4 = X.AnonymousClass7TE.A1b(r0)
            r0 = 0
            r8.A0U(r7, r4, r0)
        L_0x026d:
            if (r2 == 0) goto L_0x0274
            X.7BV r0 = r3.A03
            r2.A04(r0)
        L_0x0274:
            X.2Dm r0 = r1.A09
            X.2Dr r0 = (X.2Dr) r0
            X.2ED r13 = r0.A0C
            X.2EM r14 = r3.A01
            X.48q r0 = r3.A06
            X.2Eo r16 = X.2Eo.A04
            r18 = r5
            r17 = r0
            r13.A0O(r14, r15, r16, r17, r18)
            r1.A0A(r3, r15)
            if (r2 == 0) goto L_0x0291
            X.7BV r0 = r3.A03
            r2.A03(r0)
        L_0x0291:
            X.8wb r0 = r15.A05
            java.util.List r0 = r0.A05
            X.0qQ.A07(r0)
            java.util.Iterator r5 = r0.iterator()
        L_0x029c:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x02d6
            java.lang.Object r4 = r5.next()
            X.8wd r4 = (X.C370538wd) r4
            r9 = 0
            java.lang.String r0 = r3.A05
            java.lang.String r11 = "makeup_for_inbox_fetch_due_to_instamadillo_failure"
            r7 = r1
            r8 = r4
            r10 = r0
            r12 = r6
            X.AnonymousClass43O.A01(r7, r8, r9, r10, r11, r12)
            goto L_0x029c
        L_0x02b5:
            int r4 = r9.A00
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 == r0) goto L_0x0236
            int r6 = r4 + -1
            java.lang.Object r5 = r5.A00
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x0231
        L_0x02c3:
            long r6 = r0.longValue()
            goto L_0x01ef
        L_0x02c9:
            X.2Ec r0 = X.C69942Ec.A00
            java.lang.Object r9 = r0.A01
            goto L_0x02d2
        L_0x02ce:
            X.2Ec r0 = X.C69942Ec.A00
            java.lang.Object r9 = r0.A00
        L_0x02d2:
            X.2Eh r9 = (X.2Eh) r9
            goto L_0x0236
        L_0x02d6:
            if (r2 == 0) goto L_0x030e
            X.7BV r5 = r3.A03
            X.8wb r0 = r15.A05
            java.util.List r0 = r0.A05
            X.0qQ.A07(r0)
            java.util.ArrayList r4 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x02e9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02fd
            java.lang.Object r0 = r1.next()
            X.5xS r0 = (X.C300585xS) r0
            java.lang.Long r0 = r0.A00()
            r4.add(r0)
            goto L_0x02e9
        L_0x02fd:
            r1 = 0
            java.lang.String r0 = ", "
            java.lang.String r1 = X.DbT.A0z(r0, r4, r1)
            java.lang.String r0 = "makeup_calls_for_threads_jid"
            r2.A09(r5, r0, r1)
            X.7BV r0 = r3.A03
            r2.A0C(r0)
        L_0x030e:
            r3.A03()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67310Mlk.A04():void");
    }

    public final void A07(boolean z) {
        Long l;
        B72 b72;
        AnonymousClass43O r6 = this.A07;
        AnonymousClass43L r5 = r6.A07;
        if (r5 != null) {
            AnonymousClass7BV r3 = this.A03;
            Boolean valueOf = Boolean.valueOf(z);
            C268654dm r0 = this.A01;
            if (r0 == null || (b72 = (B72) r0.A00()) == null) {
                l = null;
            } else {
                l = Long.valueOf(b72.A01);
            }
            if (r3 != null) {
                AnonymousClass43L.A00(r3, r5, l);
                r5.A0D(r3, valueOf, true);
                r5.A00.markerEnd(20132917, 3);
            }
        }
        if (z) {
            A03();
        }
        r6.A0D(true);
    }

    public final boolean A08() {
        if (!this.A06.isEmpty() || this.A04) {
            return false;
        }
        return true;
    }

    public final void onFail(C268654dm r4) {
        int A0D = AnonymousClass7TG.A0D(r4, 817186757);
        AnonymousClass43L r1 = this.A07.A07;
        if (r1 != null) {
            r1.A02(r4, this.A03);
        }
        super.onFail(r4);
        AnonymousClass0fD.A0A(1620242136, A0D);
    }

    public final void onStart() {
        int A032 = AnonymousClass0fD.A03(52476900);
        super.onStart();
        AnonymousClass43L r1 = this.A07.A07;
        if (r1 != null) {
            r1.A05(this.A03);
        }
        AnonymousClass0fD.A0A(-1164704159, A032);
    }

    public final String toString() {
        C66726MbX A002 = C66725MbW.A00(this);
        A002.A01(this.A03, "oldestCursor");
        return DbT.A10(A002);
    }
}
