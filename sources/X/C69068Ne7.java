package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ne7  reason: case insensitive filesystem */
public final class C69068Ne7 extends C252733pa implements MXR {
    public final UserSession A00;
    public final C69069Ne8 A01;
    public final C69070Ne9 A02;
    public final KX7 A03;
    public final C69071NeA A04;
    public final KX8 A05;
    public final KX9 A06;
    public final C69072NeB A07;
    public final Integer A08;
    public final List A09 = AnonymousClass7TE.A1C();
    public final List A0A = AnonymousClass7TE.A1C();
    public final List A0B = AnonymousClass7TE.A1C();
    public final 05G A0C;
    public final 05G A0D;
    public final 05G A0E;
    public final 05G A0F;
    public final 05G A0G;
    public final 05G A0H;
    public final AnonymousClass0Ud A0I;
    public final 05G A0J;
    public final 05G A0K;
    public final 05G A0L;
    public final 05G A0M;
    public final 05G A0N;
    public final 05G A0O;
    public final 05G A0P;
    public final AnonymousClass0Ud A0Q;
    public final AnonymousClass0Ud A0R;
    public final AnonymousClass0Ud A0S;
    public final AnonymousClass0Ud A0T;
    public final AnonymousClass0Ud A0U;
    public final AnonymousClass0Ud A0V;
    public final AnonymousClass0Ud A0W;
    public final AnonymousClass0Ud A0X;
    public final AnonymousClass0Ud A0Y;
    public final AnonymousClass0Ud A0Z;
    public final boolean A0a;

    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0287, code lost:
        if (r3 > r0) goto L_0x0289;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.ArrayList A00(X.C69068Ne7 r20, java.lang.String r21, java.util.List r22, java.util.List r23, java.util.List r24, java.util.Map r25) {
        /*
            r4 = r20
            r9 = r21
            com.instagram.common.session.UserSession r6 = r4.A00
            r5 = 1
            r7 = r22
            r22 = r25
            r0 = r22
            X.AnonymousClass7TF.A1B(r7, r5, r0)
            java.util.LinkedHashMap r21 = X.AnonymousClass7TE.A1H()
            java.util.Iterator r3 = r7.iterator()
        L_0x0018:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0041
            java.lang.Object r2 = r3.next()
            boolean r0 = r2 instanceof com.instagram.model.direct.DirectShareTarget
            if (r0 == 0) goto L_0x0018
            r1 = r2
            com.instagram.model.direct.DirectShareTarget r1 = (com.instagram.model.direct.DirectShareTarget) r1
            r0 = r22
            java.lang.Long r0 = X.C71101Ocb.A00(r6, r1, r0)
            if (r0 != 0) goto L_0x0037
            boolean r0 = r1.A0X()
            if (r0 == 0) goto L_0x0018
        L_0x0037:
            java.lang.String r1 = r1.A09()
            r0 = r21
            r0.put(r1, r2)
            goto L_0x0018
        L_0x0041:
            boolean r3 = r4.A0a
            if (r9 != 0) goto L_0x0047
            java.lang.String r9 = ""
        L_0x0047:
            r20 = 0
            r2 = r23
            r23 = r24
            r0 = r23
            X.AnonymousClass7TF.A1D(r2, r5, r0)
            X.0Tu r4 = X.0Tu.A05
            r0 = 36313853998532874(0x8103420002090a, double:3.028365720600919E-306)
            boolean r0 = X.182.A06(r4, r6, r0)
            if (r0 == 0) goto L_0x00b1
            if (r3 == 0) goto L_0x0072
            int r0 = r9.length()
            if (r0 > 0) goto L_0x0072
            r0 = 36313853998729483(0x8103420005090b, double:3.028365720725255E-306)
            boolean r0 = X.182.A06(r4, r6, r0)
            if (r0 == 0) goto L_0x00b1
        L_0x0072:
            r19 = 1
        L_0x0074:
            java.util.LinkedHashMap r3 = X.C71101Ocb.A01(r2)
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r15 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r14 = X.AnonymousClass7TE.A1D(r7)
            r7 = 36325385985733550(0x810dbf000233ae, double:3.035658595742212E-306)
            boolean r0 = X.182.A06(r4, r6, r7)
            if (r0 == 0) goto L_0x00b4
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r10 = r15.iterator()
        L_0x0097:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00b4
            java.lang.Object r1 = r10.next()
            boolean r0 = r1 instanceof com.instagram.model.direct.DirectMessageSearchMessage
            if (r0 != 0) goto L_0x00ad
            boolean r0 = r1 instanceof com.instagram.model.direct.DirectMessageSearchThread
            if (r0 != 0) goto L_0x00ad
            r11.add(r1)
            goto L_0x0097
        L_0x00ad:
            r14.add(r1)
            goto L_0x0097
        L_0x00b1:
            r19 = 0
            goto L_0x0074
        L_0x00b4:
            r0 = 36319411686088074(0x81085000001d8a, double:3.031880424589839E-306)
            boolean r0 = X.182.A06(r4, r6, r0)
            if (r0 == 0) goto L_0x016a
            java.util.LinkedHashMap r10 = X.AnonymousClass7TE.A1H()
            java.util.LinkedHashSet r13 = X.DbS.A0y()
            boolean r0 = X.DbT.A1b(r14)
            if (r0 == 0) goto L_0x013e
            int r0 = r9.length()
            long r11 = (long) r0
            r0 = 36600886662926382(0x8208500002102e, double:3.209886333351143E-306)
            long r16 = X.182.A01(r4, r6, r0)
            int r0 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x013e
            r12 = 0
            r11 = 0
        L_0x00e1:
            int r0 = r14.size()
            if (r12 >= r0) goto L_0x013e
            r0 = 36600886662860845(0x8208500001102d, double:3.209886333309697E-306)
            long r17 = X.182.A01(r4, r6, r0)
            long r0 = (long) r11
            int r16 = (r17 > r0 ? 1 : (r17 == r0 ? 0 : -1))
            if (r16 <= 0) goto L_0x013e
            int r16 = r12 + 1
            java.lang.Object r12 = r14.get(r12)
            boolean r0 = r12 instanceof com.instagram.model.direct.DirectShareTarget
            if (r0 == 0) goto L_0x013b
            r1 = r12
            com.instagram.model.direct.DirectShareTarget r1 = (com.instagram.model.direct.DirectShareTarget) r1
            boolean r0 = r1.A0O()
            if (r0 == 0) goto L_0x013b
            java.lang.String r0 = r1.A0A()
            boolean r0 = X.C71101Ocb.A02(r0, r9)
            if (r0 != 0) goto L_0x0128
            java.lang.String r0 = X.DbT.A0y(r1)
            boolean r0 = X.C71101Ocb.A02(r0, r9)
            if (r0 != 0) goto L_0x0128
            java.lang.String r0 = r1.A0J
            if (r0 != 0) goto L_0x0122
            java.lang.String r0 = ""
        L_0x0122:
            boolean r0 = X.C71101Ocb.A02(r0, r9)
            if (r0 == 0) goto L_0x013b
        L_0x0128:
            java.lang.String r0 = r1.A09()
            r10.put(r0, r12)
            int r11 = r11 + 1
            java.lang.String r0 = r1.A09()
            X.0qQ.A07(r0)
            r13.add(r0)
        L_0x013b:
            r12 = r16
            goto L_0x00e1
        L_0x013e:
            java.util.Iterator r11 = r14.iterator()
        L_0x0142:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x016e
            java.lang.Object r9 = r11.next()
            boolean r0 = r9 instanceof com.instagram.model.direct.DirectShareTarget
            if (r0 != 0) goto L_0x0158
            java.lang.String r0 = java.lang.String.valueOf(r9)
        L_0x0154:
            r10.put(r0, r9)
            goto L_0x0142
        L_0x0158:
            r1 = r9
            com.instagram.model.direct.DirectShareTarget r1 = (com.instagram.model.direct.DirectShareTarget) r1
            java.lang.String r0 = r1.A09()
            boolean r0 = r13.contains(r0)
            if (r0 != 0) goto L_0x0142
            java.lang.String r0 = r1.A09()
            goto L_0x0154
        L_0x016a:
            java.util.LinkedHashMap r10 = X.C71101Ocb.A01(r14)
        L_0x016e:
            boolean r0 = r10.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0226
            java.util.Iterator r12 = X.AnonymousClass7TF.A0s(r10)
        L_0x017a:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0226
            java.lang.Object r0 = X.AnonymousClass7TF.A0a(r12)
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r10 = r0.getKey()
            X.0qQ.A07(r10)
            java.lang.Object r1 = r0.getValue()
            boolean r0 = r1 instanceof com.instagram.model.direct.DirectShareTarget
            if (r0 != 0) goto L_0x0199
            r2.add(r1)
            goto L_0x017a
        L_0x0199:
            r9 = r1
            com.instagram.model.direct.DirectShareTarget r9 = (com.instagram.model.direct.DirectShareTarget) r9
            boolean r0 = r9.A0R()
            if (r0 == 0) goto L_0x01ad
            java.lang.String r0 = r9.A09()
            boolean r0 = r3.containsKey(r0)
            if (r0 == 0) goto L_0x01ad
            goto L_0x017a
        L_0x01ad:
            boolean r0 = r9.A0S
            if (r0 == 0) goto L_0x01b5
            r2.add(r9)
            goto L_0x017a
        L_0x01b5:
            r0 = r22
            java.lang.Long r0 = X.C71101Ocb.A00(r6, r9, r0)
            if (r0 == 0) goto L_0x01f2
            long r0 = r0.longValue()
            r11 = 0
            com.instagram.model.direct.threadkey.impl.MsysThreadId r11 = X.C66580MXl.A0j(r11, r0)
        L_0x01c6:
            r9.A09 = r11
            r9.A0T = r5
            r2.add(r9)
            r3.remove(r10)
        L_0x01d0:
            if (r19 == 0) goto L_0x017a
            boolean r0 = r3.containsKey(r10)
            if (r0 == 0) goto L_0x017a
            java.lang.Object r1 = r3.get(r10)
            if (r1 == 0) goto L_0x017a
            boolean r0 = r1 instanceof com.instagram.model.direct.DirectShareTarget
            if (r0 == 0) goto L_0x017a
            r0 = r1
            com.instagram.model.direct.DirectShareTarget r0 = (com.instagram.model.direct.DirectShareTarget) r0
            boolean r0 = r0.A0S()
            if (r0 == 0) goto L_0x017a
            r2.add(r1)
            r3.remove(r10)
            goto L_0x017a
        L_0x01f2:
            boolean r0 = r9.A0X()
            if (r0 == 0) goto L_0x0222
            java.util.List r0 = X.DbT.A14(r9)
            int r0 = r0.size()
            if (r0 != r5) goto L_0x0222
            r0 = r20
            com.instagram.pendingmedia.model.recipients.PendingRecipient r0 = X.DbY.A0W(r9, r0)
            X.0qQ.A0A(r0)
            com.instagram.model.direct.threadkey.impl.MsysPendingRecipient r0 = X.OXK.A00(r0)
            com.instagram.model.direct.threadkey.impl.MsysPendingRecipient[] r0 = new com.instagram.model.direct.threadkey.impl.MsysPendingRecipient[]{r0}
            java.util.List r1 = java.util.Arrays.asList(r0)
            X.0qQ.A07(r1)
            X.3tH r0 = X.C254923tH.ACT
            X.PIO r11 = new X.PIO
            r11.<init>(r0, r1)
            goto L_0x01c6
        L_0x0222:
            r2.add(r1)
            goto L_0x01d0
        L_0x0226:
            java.util.Iterator r10 = X.AnonymousClass7TF.A0t(r3)
        L_0x022a:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0252
            java.lang.Object r9 = r10.next()
            boolean r0 = r9 instanceof com.instagram.model.direct.DirectShareTarget
            if (r0 == 0) goto L_0x022a
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.model.direct.DirectShareTarget"
            X.0qQ.A0C(r9, r0)
            r3 = r9
            com.instagram.model.direct.DirectShareTarget r3 = (com.instagram.model.direct.DirectShareTarget) r3
            java.lang.String r1 = r3.A09()
            r0 = r21
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x024e
            r3.A0T = r5
        L_0x024e:
            r2.add(r9)
            goto L_0x022a
        L_0x0252:
            boolean r0 = X.182.A06(r4, r6, r7)
            if (r0 == 0) goto L_0x02cd
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            r6 = 0
            r5 = 0
            r8 = 0
        L_0x025f:
            int r0 = r15.size()
            if (r5 >= r0) goto L_0x02b1
            int r0 = r23.size()
            if (r8 >= r0) goto L_0x02b1
            java.lang.Object r1 = r15.get(r5)
            boolean r0 = r1 instanceof com.instagram.model.direct.DirectMessageSearchMessage
            if (r0 == 0) goto L_0x02a5
            com.instagram.model.direct.DirectMessageSearchMessage r1 = (com.instagram.model.direct.DirectMessageSearchMessage) r1
            long r3 = r1.A02
        L_0x0277:
            r0 = r23
            java.lang.Object r1 = r0.get(r8)
            boolean r0 = r1 instanceof com.instagram.model.direct.DirectMessageSearchMessage
            if (r0 == 0) goto L_0x0299
            com.instagram.model.direct.DirectMessageSearchMessage r1 = (com.instagram.model.direct.DirectMessageSearchMessage) r1
            long r0 = r1.A02
        L_0x0285:
            int r9 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r9 <= 0) goto L_0x02bd
        L_0x0289:
            int r1 = r5 + 1
            java.lang.Object r0 = r15.get(r5)
            r7.add(r0)
            r5 = r1
        L_0x0293:
            int r6 = r6 + 1
            r0 = 3
            if (r6 >= r0) goto L_0x02ca
            goto L_0x025f
        L_0x0299:
            boolean r0 = r1 instanceof com.instagram.model.direct.DirectMessageSearchThread
            if (r0 == 0) goto L_0x02a2
            com.instagram.model.direct.DirectMessageSearchThread r1 = (com.instagram.model.direct.DirectMessageSearchThread) r1
            long r0 = r1.A02
            goto L_0x0285
        L_0x02a2:
            r0 = 0
            goto L_0x0285
        L_0x02a5:
            boolean r0 = r1 instanceof com.instagram.model.direct.DirectMessageSearchThread
            if (r0 == 0) goto L_0x02ae
            com.instagram.model.direct.DirectMessageSearchThread r1 = (com.instagram.model.direct.DirectMessageSearchThread) r1
            long r3 = r1.A02
            goto L_0x0277
        L_0x02ae:
            r3 = 0
            goto L_0x0277
        L_0x02b1:
            int r0 = r15.size()
            if (r5 < r0) goto L_0x0289
            int r0 = r23.size()
            if (r8 >= r0) goto L_0x02ca
        L_0x02bd:
            int r1 = r8 + 1
            r0 = r23
            java.lang.Object r0 = r0.get(r8)
            r7.add(r0)
            r8 = r1
            goto L_0x0293
        L_0x02ca:
            r2.addAll(r7)
        L_0x02cd:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69068Ne7.A00(X.Ne7, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.Map):java.util.ArrayList");
    }

    public final AnonymousClass0Ud Amr() {
        return this.A0Q;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0Ud B3K() {
        return this.A0H;
    }

    public final AnonymousClass0Ud BjF() {
        return this.A0W;
    }

    public final AnonymousClass0Ud BnG() {
        return this.A0X;
    }

    public final AnonymousClass0Ud BqH() {
        return this.A0Y;
    }

    public final AnonymousClass0Ud Bqp() {
        return this.A0Z;
    }

    public final AnonymousClass0Ud CT4() {
        return this.A0S;
    }

    public final AnonymousClass0Ud CWW() {
        return this.A0T;
    }

    public final AnonymousClass0Ud CWY() {
        return this.A0U;
    }

    public final AnonymousClass0Ud CYK() {
        return this.A0V;
    }

    public final void FLH(String str) {
        JTR.A1W(this.A0F);
        this.A0O.Epw(0sn.A00);
        AnonymousClass7TE.A1Z(new C59842JaI((Object) this, str, (AnonymousClass4D7) null, 19), this.A01);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69068Ne7(UserSession userSession, C69069Ne8 ne8, C69070Ne9 ne9, KX7 kx7, C69071NeA neA, KX8 kx8, KX9 kx9, C69072NeB neB, Integer num, boolean z) {
        super("search_interop", AnonymousClass43D.A00(359266386));
        Boolean A0u = AnonymousClass7TE.A0u();
        this.A00 = userSession;
        this.A01 = ne8;
        this.A02 = ne9;
        this.A04 = neA;
        this.A05 = kx8;
        this.A06 = kx9;
        this.A07 = neB;
        this.A03 = kx7;
        this.A08 = num;
        this.A0a = z;
        02z A1J = JTO.A1J();
        this.A0O = A1J;
        this.A0Y = A1J;
        02z A10 = DbS.A10(A0u);
        this.A0E = A10;
        this.A0T = A10;
        02z A0q = JTQ.A0q();
        this.A0D = A0q;
        this.A0H = A0q;
        02z A102 = DbS.A10(A0u);
        this.A0F = A102;
        this.A0U = A102;
        02z A103 = DbS.A10(A0u);
        this.A0L = A103;
        this.A0S = A103;
        02z A012 = 106.A01((Object) null);
        this.A0N = A012;
        this.A0X = A012;
        02z A013 = 106.A01((Object) null);
        this.A0M = A013;
        this.A0W = A013;
        02z A014 = 106.A01((Object) null);
        this.A0C = A014;
        this.A0Q = A014;
        02z A015 = 106.A01((Object) null);
        this.A0P = A015;
        this.A0Z = A015;
        02z A104 = DbS.A10(A0u);
        this.A0G = A104;
        this.A0V = A104;
        02z A105 = DbS.A10(A0u);
        this.A0K = A105;
        this.A0R = A105;
        02z A0q2 = JTQ.A0q();
        this.A0J = A0q2;
        this.A0I = A0q2;
    }

    public static final void A01(C69068Ne7 ne7, List list) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        A1C.addAll(list);
        A1C.addAll(ne7.A0A);
        A1C.addAll(ne7.A0B);
        A1C.addAll(ne7.A09);
        ne7.A0O.Epw(A1C);
    }
}
