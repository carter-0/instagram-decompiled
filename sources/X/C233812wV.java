package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* renamed from: X.2wV  reason: invalid class name and case insensitive filesystem */
public final class C233812wV implements C61110lV, C233072uu, C233042ur, C233602vz, AnonymousClass2wW {
    public int A00;
    public int A01;
    public int A02 = -1;
    public C228352lS A03;
    public 1An A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public int A09 = -1;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E = -1;
    public int A0F = -1;
    public int A0G;
    public C233312vV A0H;
    public boolean A0I;
    public boolean A0J;
    public final long A0K;
    public final UserSession A0L;
    public final 1PG A0M;
    public final AnonymousClass2wI A0N;
    public final 1Ph A0O;
    public final AnonymousClass1PB A0P;
    public final C233632w4 A0Q;
    public final C228812mN A0R;
    public final C233452vk A0S;
    public final C233012uo A0T;
    public final C233402vf A0U;
    public final AnonymousClass2wH A0V;
    public final AnonymousClass2wO A0W;
    public final AnonymousClass2vG A0X;
    public final C249863kU A0Y;
    public final C233432vi A0Z;
    public final C233532vs A0a;
    public final Map A0b = new HashMap();
    public final Set A0c;
    public final Set A0d;
    public final Set A0e = new HashSet();
    public final Set A0f = new HashSet();
    public final Set A0g;
    public final boolean A0h;
    public final boolean A0i;
    public final boolean A0j;
    public final boolean A0k;
    public final boolean A0l;
    public final boolean A0m;
    public final int A0n;
    public final int A0o;
    public final int A0p;
    public final C61410nE A0q;
    public final C233682wC A0r;
    public final AnonymousClass2v7 A0s;
    public final C233372vc A0t;
    public final AnonymousClass3DW A0u;
    public final AnonymousClass2w6 A0v;
    public final AnonymousClass2lD A0w;
    public final C233612w1 A0x;
    public final C233612w1 A0y;
    public final String A0z;
    public final List A10;
    public final List A11;
    public final boolean A12;
    public final boolean A13;
    public final boolean A14;
    public final boolean A15;
    public final boolean A16;
    public final boolean A17;
    public final boolean A18;
    public final boolean A19;
    public final boolean A1A;
    public final boolean A1B;
    public final boolean A1C;
    public final boolean A1D;
    public final boolean A1E;
    public final boolean A1F;
    public final boolean A1G;

    private AnonymousClass3VZ A00() {
        AnonymousClass3VY Bx7 = this.A0s.Bx7();
        long j = 0;
        String str = "";
        String str2 = null;
        long j2 = (long) Bx7.A00;
        long j3 = (long) Bx7.A03;
        long j4 = (long) Bx7.A01;
        long j5 = (long) Bx7.A02;
        boolean CTb = this.A0T.CTb();
        long j6 = (long) this.A09;
        long j7 = (long) this.A0G;
        long j8 = (long) this.A0Q.A01;
        long j9 = (long) this.A0B;
        long j10 = (long) this.A0A;
        LinkedList linkedList = this.A0Y.A02;
        long size = (long) linkedList.size();
        C228812mN r3 = this.A0R;
        r3.getClass();
        Iterator it = linkedList.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (r3.CcL(((C251373n0) it.next()).BTb())) {
                i++;
            }
        }
        long j11 = (long) i;
        long j12 = (long) this.A0C;
        long size2 = (long) this.A0U.BYj().size();
        long size3 = (long) this.A0f.size();
        long j13 = (long) this.A0E;
        long j14 = (long) this.A0F;
        long j15 = (long) this.A02;
        AnonymousClass1PB r11 = this.A0P;
        1PG r9 = this.A0M;
        if (!(r9 == null || r11 == null)) {
            C233172vA A022 = r9.A02(this.A04, r11);
            str2 = A022.A0a;
            String str3 = A022.A0T;
            if (str3 != null) {
                str = str3;
            }
            Long l = A022.A0N;
            Long l2 = A022.A0L;
            if (!(l == null || l2 == null)) {
                j = l.longValue() - l2.longValue();
            }
        }
        return new AnonymousClass3VZ(str2, str, j2, j3, j4, j5, j6, j7, j8, j9, j10, size, j11, j12, size3, size2, j13, j14, j15, j, CTb);
    }

    private C268314dB A01(Integer num, Integer num2, Collection collection, boolean z) {
        AnonymousClass2wO r2 = this.A0W;
        boolean z2 = this.A1G;
        Map map = this.A0b;
        C271864ji E4e = r2.E4e(this.A0z, collection, map, z2);
        Collection<Object> collection2 = E4e.A01;
        for (Object BEZ : collection2) {
            C271744jW r1 = (C271744jW) map.get(this.A0R.BEZ(BEZ));
            r1.getClass();
            r1.Elr(C271754jX.IN_AD_POOL);
        }
        int BfG = this.A0T.BfG();
        C249863kU r7 = this.A0Y;
        if (BfG == -1) {
            BfG = this.A0Q.A02;
        }
        r7.A07(num, num2, collection2, BfG, z);
        Collection collection3 = E4e.A00;
        for (Object next : collection3) {
            C228812mN r8 = this.A0R;
            C271744jW r72 = (C271744jW) map.get(r8.BEZ(next));
            if (r72 == null) {
                if (182.A06(0Tu.A05, this.A0L, 36329436139765884L)) {
                    0f9 AEf = 0wj.A01.AEf("UNMATCHED_SPONSORED_INVALIDATED_CONTENT", 817903741);
                    AEf.ABQ(AnonymousClass000.A00(3605), r8.BEZ(next));
                    AEf.report();
                }
            }
            r72.getClass();
            C271754jX Bz6 = r72.Bz6();
            C271754jX r12 = C271754jX.INVALIDATED;
            if (Bz6 == C271754jX.UNDEFINED) {
                r72.Elr(r12);
            }
            this.A0V.D8O(next);
        }
        return new C268314dB(collection2, collection3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x021c, code lost:
        if (r6.A02.isEmpty() == false) goto L_0x021e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
        if (r3.hasNext() == true) goto L_0x004b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.LinkedList A02(boolean r18, boolean r19, boolean r20) {
        /*
            r17 = this;
            r0 = r17
            boolean r2 = r0.A06
            r1 = 0
            if (r2 == 0) goto L_0x019d
            if (r19 == 0) goto L_0x019d
            boolean r2 = r0.A0m
            if (r2 == 0) goto L_0x0164
            java.util.Map r2 = r0.A0b
            java.util.Map r9 = java.util.Collections.unmodifiableMap(r2)
            X.2mN r5 = r0.A0R
            X.2vf r4 = r0.A0U
            X.3kU r2 = r0.A0Y
            java.util.Collection r3 = r2.A03()
            boolean r8 = r0.A0i
            java.util.Set r7 = r0.A0c
            X.0qQ.A0B(r9, r1)
            r6 = 1
            X.0qQ.A0B(r5, r6)
            r2 = 2
            X.0qQ.A0B(r4, r2)
            r2 = 5
            X.0qQ.A0B(r7, r2)
            X.3n0 r11 = r4.Coa()
            r4 = 0
            if (r3 == 0) goto L_0x0161
            java.util.Iterator r3 = r3.iterator()
        L_0x003b:
            r10 = 0
            if (r11 != 0) goto L_0x0153
            r9 = 0
        L_0x003f:
            if (r8 != 0) goto L_0x00b5
            if (r9 != 0) goto L_0x004c
            if (r3 == 0) goto L_0x004c
            boolean r2 = r3.hasNext()
            if (r2 != r6) goto L_0x004c
        L_0x004b:
            r10 = 1
        L_0x004c:
            X.3kU r11 = r0.A0Y
            java.util.LinkedList r9 = r11.A04()
            X.2vk r5 = r0.A0S
            r5.AHQ()
            if (r10 <= 0) goto L_0x0167
            java.util.Iterator r8 = r9.iterator()
        L_0x005d:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x0167
            java.lang.Object r6 = r8.next()
            X.3n0 r6 = (X.C251373n0) r6
            if (r10 <= 0) goto L_0x009d
            java.lang.Object r7 = r6.BTb()
            r4 = 1
            r16 = 0
            java.lang.Object[] r2 = new java.lang.Object[]{r7}
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r4)
            r2 = r2[r16]
            r2.getClass()
            r3.add(r2)
            java.util.List r14 = java.util.Collections.unmodifiableList(r3)
            int r15 = r6.BnH()
            java.lang.Integer r12 = r6.Bxj()
            java.lang.Integer r13 = X.AnonymousClass05K.A00
            r11.A07(r12, r13, r14, r15, r16)
            r5.A9o(r7)
            r8.remove()
            int r10 = r10 + -1
            goto L_0x005d
        L_0x009d:
            if (r20 == 0) goto L_0x005d
            X.2vG r4 = r0.A0X
            X.2vi r3 = r0.A0Z
            X.2vf r2 = r0.A0U
            java.util.List r2 = r2.BYj()
            X.1PW r3 = r3.AGd(r2)
            java.lang.String r2 = "refresh_deletion_pre_request"
            r4.Chf(r6, r3, r2)
            int r1 = r1 + 1
            goto L_0x005d
        L_0x00b5:
            if (r3 == 0) goto L_0x00f4
            boolean r2 = r3.hasNext()
            if (r2 != r6) goto L_0x00f4
            java.lang.Object r2 = r3.next()
            X.3n0 r2 = (X.C251373n0) r2
            java.lang.Object r8 = r2.BTb()
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x00d7
            java.lang.Object r2 = r3.next()
            X.3n0 r2 = (X.C251373n0) r2
            java.lang.Object r4 = r2.BTb()
        L_0x00d7:
            r3 = r4
            r4 = r8
        L_0x00d9:
            boolean r2 = r7.isEmpty()
            if (r2 == 0) goto L_0x00f6
            if (r9 != 0) goto L_0x00f6
            if (r4 == 0) goto L_0x00f6
            int r2 = r5.AZD(r4)
            if (r2 != 0) goto L_0x00f6
            if (r3 == 0) goto L_0x00f6
            boolean r2 = r5.ACN(r4, r3)
            if (r2 == 0) goto L_0x00f6
            r10 = 2
            goto L_0x004c
        L_0x00f4:
            r3 = r4
            goto L_0x00d9
        L_0x00f6:
            if (r20 == 0) goto L_0x010c
            if (r9 == 0) goto L_0x004b
            if (r4 == 0) goto L_0x004c
            if (r11 == 0) goto L_0x004b
            java.lang.Object r2 = r11.BTb()
            if (r2 == 0) goto L_0x004b
            boolean r2 = r5.ACN(r2, r4)
            if (r2 != 0) goto L_0x004b
            goto L_0x004c
        L_0x010c:
            boolean r2 = r7.isEmpty()
            if (r2 == 0) goto L_0x011f
            if (r9 != 0) goto L_0x011f
            if (r4 == 0) goto L_0x011f
            int r3 = r5.AZD(r4)
            r2 = -1
            if (r3 != r2) goto L_0x011f
            goto L_0x004b
        L_0x011f:
            boolean r2 = r7.isEmpty()
            if (r2 == 0) goto L_0x0135
            if (r9 == 0) goto L_0x0135
            if (r11 == 0) goto L_0x0135
            java.lang.Object r2 = r11.BTb()
            int r2 = r5.AZD(r2)
            if (r2 < 0) goto L_0x0135
            goto L_0x004b
        L_0x0135:
            int r2 = r7.size()
            if (r2 != r6) goto L_0x004c
            if (r9 != 0) goto L_0x004c
            if (r4 == 0) goto L_0x004c
            int r2 = r5.AZD(r4)
            if (r2 != r6) goto L_0x004c
            if (r11 == 0) goto L_0x004c
            java.lang.Object r2 = r11.BTb()
            boolean r2 = r5.ACN(r4, r2)
            if (r2 == 0) goto L_0x004c
            goto L_0x004b
        L_0x0153:
            java.lang.Object r2 = r11.BTb()
            java.lang.String r2 = r5.BEZ(r2)
            boolean r9 = X.AnonymousClass2wI.A01(r2, r9)
            goto L_0x003f
        L_0x0161:
            r3 = r4
            goto L_0x003b
        L_0x0164:
            r10 = 0
            goto L_0x004c
        L_0x0167:
            if (r20 == 0) goto L_0x017d
            X.1PB r4 = r0.A0P
            X.1PG r3 = r0.A0M
            if (r3 == 0) goto L_0x017d
            if (r4 == 0) goto L_0x017d
            X.1An r2 = r0.A04
            X.2vA r2 = r3.A02(r2, r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.A0C = r1
        L_0x017d:
            java.util.Iterator r4 = r9.iterator()
        L_0x0181:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0252
            java.lang.Object r1 = r4.next()
            X.3n0 r1 = (X.C251373n0) r1
            java.util.Map r3 = r0.A0b
            X.2mN r2 = r0.A0R
            java.lang.Object r1 = r1.BTb()
            java.lang.String r1 = r2.BEZ(r1)
            r3.remove(r1)
            goto L_0x0181
        L_0x019d:
            boolean r2 = r0.A15
            if (r2 == 0) goto L_0x0251
            if (r19 != 0) goto L_0x0251
            X.3kU r6 = r0.A0Y
            if (r18 != 0) goto L_0x0216
            java.util.LinkedList r10 = r6.A02
            boolean r2 = r10.isEmpty()
            if (r2 != 0) goto L_0x01cc
            X.1PB r4 = r0.A0P
            X.1PG r3 = r0.A0M
            if (r3 == 0) goto L_0x01cc
            if (r4 == 0) goto L_0x01cc
            X.1An r2 = r0.A04
            X.2vA r3 = r3.A02(r2, r4)
            r2 = 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r3.A03 = r2
            java.lang.String r2 = "HEADLOAD"
            r3.A0X = r2
            java.lang.String r2 = "pool_replacement"
            r3.A0V = r2
        L_0x01cc:
            X.2vf r2 = r0.A0U
            java.util.List r3 = r2.BYj()
            X.2vi r2 = r0.A0Z
            X.1PW r9 = r2.AGd(r3)
            r10.size()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r10.iterator()
        L_0x01e4:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x0212
            java.lang.Object r5 = r7.next()
            X.3n0 r5 = (X.C251373n0) r5
            boolean r2 = r6.A09(r5)
            if (r2 == 0) goto L_0x01e4
            X.2vG r3 = r0.A0X
            r2 = 0
            r3.Chf(r5, r9, r2)
            java.util.Map r4 = r0.A0b
            X.2mN r2 = r0.A0R
            java.lang.Object r3 = r5.BTb()
            java.lang.String r2 = r2.BEZ(r3)
            r4.remove(r2)
            r8.add(r3)
            r7.remove()
            goto L_0x01e4
        L_0x0212:
            r10.size()
            goto L_0x021e
        L_0x0216:
            java.util.LinkedList r2 = r6.A02
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0251
        L_0x021e:
            X.2vf r9 = r0.A0U
            X.3n0 r5 = r9.Coa()
            if (r5 == 0) goto L_0x0251
            boolean r2 = r6.A09(r5)
            if (r2 == 0) goto L_0x0251
            X.1PB r4 = r0.A0P
            X.1PG r3 = r0.A0M
            r7 = 0
            if (r3 == 0) goto L_0x023b
            if (r4 == 0) goto L_0x023b
            X.1An r2 = r0.A04
            X.2vA r7 = r3.A02(r2, r4)
        L_0x023b:
            X.2wI r6 = r0.A0N
            java.lang.Object r12 = r5.BTb()
            X.2vG r10 = r0.A0X
            java.util.Map r13 = r0.A0b
            X.2mN r8 = r0.A0R
            X.2vi r11 = r0.A0Z
            r6.A02(r7, r8, r9, r10, r11, r12, r13)
            r0.A08 = r1
            r0.A03()
        L_0x0251:
            r9 = 0
        L_0x0252:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C233812wV.A02(boolean, boolean, boolean):java.util.LinkedList");
    }

    private void A03() {
        1Ph r2 = this.A0O;
        if (this.A0h && r2 != null && !this.A0J) {
            List AGf = this.A0U.AGf();
            0qQ.A0B(AGf, 0);
            List list = r2.A01;
            list.clear();
            018.A16(AGf, list);
        }
    }

    private void A04() {
        ArrayList arrayList = new ArrayList();
        for (C251373n0 BTb : this.A0Y.A03()) {
            Object BTb2 = BTb.BTb();
            this.A0S.A9o(BTb2);
            C228812mN r3 = this.A0R;
            C271744jW AMS = r3.AMS(BTb2);
            AMS.Elr(C271754jX.IN_AD_POOL);
            this.A0b.put(r3.BEZ(BTb2), AMS);
            arrayList.add(BTb2);
        }
        if (!arrayList.isEmpty()) {
            A09(arrayList);
        }
    }

    private void A05() {
        C249863kU r2 = this.A0Y;
        if (r2.A05) {
            LinkedList linkedList = r2.A02;
            linkedList.clear();
            LinkedList linkedList2 = r2.A03;
            linkedList.addAll(linkedList2);
            linkedList2.clear();
        }
        for (C251373n0 BTb : r2.A03()) {
            Map map = this.A0b;
            C228812mN r3 = this.A0R;
            Object BTb2 = BTb.BTb();
            if (!map.containsKey(r3.BEZ(BTb2))) {
                map.put(r3.BEZ(BTb2), r3.AMS(BTb2));
                this.A0S.A9o(BTb2);
            }
        }
    }

    public static void A06(C233812wV r6, boolean z) {
        if (r6.A0k || z) {
            1PW AGd = r6.A0Z.AGd(r6.A0U.BYj());
            for (C251373n0 r3 : r6.A0Y.A04()) {
                r6.A0X.Chf(r3, AGd, (String) null);
                r6.A0b.remove(r6.A0R.BEZ(r3.BTb()));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005a, code lost:
        if (java.lang.System.currentTimeMillis() <= r15) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A07(X.C233812wV r21, boolean r22) {
        /*
            r10 = r21
            boolean r0 = r10.A18
            if (r0 != 0) goto L_0x0095
            boolean r0 = r10.A17
            if (r0 == 0) goto L_0x00c4
            r20 = -9223372036854775808
        L_0x000c:
            boolean r0 = r10.A17
            if (r0 == 0) goto L_0x0092
            long r18 = java.lang.System.currentTimeMillis()
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MINUTES
            int r0 = r10.A0o
            long r0 = (long) r0
            long r0 = r2.toMillis(r0)
            long r18 = r18 - r0
        L_0x001f:
            X.2vf r0 = r10.A0U
            java.util.List r1 = r0.BYj()
            X.2vi r0 = r10.A0Z
            X.1PW r9 = r0.AGd(r1)
            X.3kU r8 = r10.A0Y
            java.util.LinkedList r7 = r8.A02
            int r5 = r7.size()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r17 = r7.iterator()
        L_0x003c:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x00a6
            java.lang.Object r11 = r17.next()
            X.3n0 r11 = (X.C251373n0) r11
            long r15 = r11.B2r()
            r13 = 0
            r3 = 1
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x005c
            long r1 = java.lang.System.currentTimeMillis()
            int r0 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            r12 = 1
            if (r0 > 0) goto L_0x005d
        L_0x005c:
            r12 = 0
        L_0x005d:
            java.lang.Integer r0 = r11.Bxj()
            int r1 = r0.intValue()
            if (r1 == r3) goto L_0x008b
            r0 = 2
            if (r1 != r0) goto L_0x003c
            long r3 = r11.AsM()
            r1 = r18
        L_0x0070:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x007a
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r0 > 0) goto L_0x003c
            if (r12 == 0) goto L_0x003c
        L_0x007a:
            X.2vG r1 = r10.A0X
            r0 = 0
            r1.Chf(r11, r9, r0)
            java.lang.Object r0 = r11.BTb()
            r6.add(r0)
            r17.remove()
            goto L_0x003c
        L_0x008b:
            long r3 = r11.AsM()
            r1 = r20
            goto L_0x0070
        L_0x0092:
            r18 = -9223372036854775808
            goto L_0x001f
        L_0x0095:
            long r20 = java.lang.System.currentTimeMillis()
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MINUTES
            int r0 = r10.A0p
            long r0 = (long) r0
            long r0 = r2.toMillis(r0)
            long r20 = r20 - r0
            goto L_0x000c
        L_0x00a6:
            int r2 = r7.size()
            if (r22 == 0) goto L_0x00c4
            if (r2 >= r5) goto L_0x00c4
            java.util.List r0 = r8.A00
            java.util.Iterator r1 = r0.iterator()
        L_0x00b4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00c4
            java.lang.Object r0 = r1.next()
            X.6Vs r0 = (X.C308816Vs) r0
            r0.DY6(r5, r2)
            goto L_0x00b4
        L_0x00c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C233812wV.A07(X.2wV, boolean):void");
    }

    private void A08(C251373n0 r9, 1PW r10) {
        0xY AR4;
        0lp A002 = 0lq.A00("SponsoredContentController.processInsertionAction");
        try {
            Object BTb = r9.BTb();
            C228812mN r1 = this.A0R;
            if (r1.CcL(BTb)) {
                Integer num = AnonymousClass05K.A01;
                Integer num2 = r10.A0C;
                if (num != num2) {
                    Integer num3 = AnonymousClass05K.A0j;
                    if (num3 != num2) {
                        if (AnonymousClass05K.A00 == num2) {
                            this.A0X.Cgu(r9, r10);
                            Integer num4 = r10.A0B;
                            if (!this.A19 && num4 == AnonymousClass05K.A0C) {
                                this.A0W.AWG(C54608HKr.A0I, r10, BTb);
                            }
                            if (num4 == AnonymousClass05K.A0N) {
                                this.A0W.AWG(C54608HKr.A05, r10, BTb);
                            }
                            if (num4 == AnonymousClass05K.A0Y) {
                                this.A0W.AWG(C54608HKr.A07, r10, BTb);
                            } else if (num4 == num3) {
                                this.A0W.AWG(C54608HKr.A0G, r10, BTb);
                            }
                        }
                        A002.close();
                    }
                } else {
                    this.A0s.CM5(AnonymousClass05K.A0C);
                }
                this.A0E = r10.A03;
                this.A0X.Cgv(r9, r10);
            } else {
                if (r1.CYA(BTb)) {
                    Integer num5 = AnonymousClass05K.A01;
                    Integer num6 = r10.A0C;
                    if (num5 == num6) {
                        this.A0s.CM5(AnonymousClass05K.A0N);
                        this.A0E = r10.A03;
                        this.A0X.CjS(r9, r10);
                    } else if (AnonymousClass05K.A00 == num6) {
                        this.A0X.CjR(r9, r10);
                    }
                } else {
                    this.A0X.Cj5(r9);
                }
                A002.close();
            }
            AnonymousClass1PB r3 = this.A0P;
            1PG r12 = this.A0M;
            if (!(r12 == null || r3 == null)) {
                C233172vA A022 = r12.A02(this.A04, r3);
                long currentTimeMillis = System.currentTimeMillis();
                Long valueOf = Long.valueOf(currentTimeMillis);
                A022.A0K = valueOf;
                0xa r0 = A022.A0g;
                if (!(r0 == null || (AR4 = r0.AR4()) == null)) {
                    if (valueOf == null) {
                        AR4.ED3("previousInjectionTimeMillis");
                    } else {
                        AR4.E5c("previousInjectionTimeMillis", currentTimeMillis);
                    }
                    AR4.apply();
                }
                A022.A0S = A022.A0d;
            }
            for (C233782wS D6A : this.A0g) {
                D6A.D6A(BTb, r10.A00(), r10.A03);
            }
            A002.close();
        } catch (Throwable th) {
            C9153RRe.A00(th, th);
            throw th;
        }
    }

    private void A09(Collection collection) {
        0lp A002 = 0lq.A00("SponsoredContentController.processValidatedContent");
        try {
            for (C233782wS Dwr : this.A0g) {
                Dwr.Dwr(collection, this.A0T.BWK());
            }
            if (!this.A0l || !this.A0k || !this.A07) {
                this.A0Z.Crm(this.A00);
            } else {
                C233682wC r18 = this.A0r;
                C233402vf r13 = this.A0U;
                AnonymousClass2vG r15 = this.A0X;
                C249863kU r8 = this.A0Y;
                C233432vi r14 = this.A0Z;
                C233012uo r6 = this.A0T;
                Map map = this.A0b;
                C228812mN r12 = this.A0R;
                boolean z = this.A1D;
                int i = this.A0n;
                boolean z2 = false;
                if (r6.BfG() == -1) {
                    z2 = true;
                }
                boolean z3 = this.A12;
                boolean z4 = this.A13;
                UserSession userSession = this.A0L;
                0qQ.A0B(r13, 0);
                0qQ.A0B(r15, 1);
                0qQ.A0B(r8, 2);
                0qQ.A0B(r14, 3);
                0qQ.A0B(map, 5);
                0qQ.A0B(r12, 6);
                if (z2) {
                    ArrayList arrayList = new ArrayList();
                    for (C251373n0 BTb : r8.A04()) {
                        Object BTb2 = BTb.BTb();
                        if (C233682wC.A00(userSession, r12, BTb2)) {
                            if (z) {
                                r13.E5F(BTb2);
                            }
                            if (!z3) {
                                r13.AHP(BTb2);
                            }
                            arrayList.add(BTb2);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        r8.A07(AnonymousClass05K.A0C, AnonymousClass05K.A00, 0u4.A00(arrayList), 0, true);
                        r6.Cmj(true);
                    }
                } else {
                    C228812mN r20 = r12;
                    C233012uo r21 = r6;
                    C233402vf r22 = r13;
                    UserSession userSession2 = userSession;
                    r18.A01(userSession2, r20, r21, r22, r15, r8, r14, map, i, z, z3, z4);
                }
            }
            AnonymousClass1PB r62 = this.A0P;
            1PG r5 = this.A0M;
            if (this.A16 && r5 != null && r62 != null && this.A1C) {
                C233682wC r4 = this.A0r;
                C233402vf r3 = this.A0U;
                Map map2 = this.A0b;
                r5.A07(r62, r4.A02(this.A0L, this.A0R, r3, map2));
            }
            A002.close();
        } catch (Throwable th) {
            C9153RRe.A00(th, th);
            throw th;
        }
    }

    private boolean A0A(C251373n0 r21, 1PW r22) {
        C271744jW r9;
        0lp A002 = 0lq.A00("SponsoredContentController.insertItem");
        1PW r3 = r22;
        try {
            int i = r3.A03;
            C251373n0 r4 = r21;
            Object BTb = r4.BTb();
            C228812mN r7 = this.A0R;
            String BEZ = r7.BEZ(BTb);
            Map map = this.A0b;
            if (!map.containsKey(BEZ)) {
                0wb.A03("SponsoredContentController::Delivery", 002.A0g("Attempting to insert an item: ", BEZ, " that hasn't been processed through delivery pipeline."));
                r9 = r7.AMS(BTb);
                map.put(BEZ, r7.AMS(BTb));
            } else {
                r9 = (C271744jW) map.get(BEZ);
            }
            int intValue = this.A0U.CNL(r4, r3, i).intValue();
            boolean z = true;
            if (intValue != 0) {
                z = false;
                if (intValue != 5) {
                    AnonymousClass2wO r1 = this.A0W;
                    C54608HKr hKr = C54608HKr.A02;
                    switch (intValue) {
                        case 1:
                            hKr = C54608HKr.A0A;
                            break;
                        case 2:
                            hKr = C54608HKr.A0C;
                            break;
                        case 3:
                            hKr = C54608HKr.A09;
                            break;
                        case 4:
                            hKr = C54608HKr.A08;
                            break;
                        case 6:
                            break;
                        case 7:
                            hKr = C54608HKr.A0B;
                            break;
                        case 8:
                            hKr = C54608HKr.A06;
                            break;
                        case 9:
                            hKr = C54608HKr.A0D;
                            break;
                        case 10:
                            hKr = C54608HKr.A0E;
                            break;
                        case 11:
                            hKr = C54608HKr.A03;
                            break;
                        default:
                            throw new RuntimeException();
                    }
                    r1.AWG(hKr, r3, BTb);
                    r9.getClass();
                    r9.Elr(C271754jX.INVALIDATED);
                    this.A0V.D8O(BTb);
                } else {
                    this.A0Y.A07(r4.Bxj(), r4.Bdb(), Collections.singleton(BTb), r4.BnH(), true);
                    this.A0Z.EIr();
                }
            } else {
                AnonymousClass3VX BtU = this.A0S.BtU();
                0qQ.A0B(r9, 0);
                BtU.A02.put("Is ad pod", String.valueOf(!0qQ.A0K(r9.AZC(), "")));
                C18625VvI vvI = BtU.A00;
                if (vvI != null) {
                    vvI.A01();
                }
                A03();
                r9.Elr(C271754jX.INSERTED_SUCCESSFULLY);
                r9.EZw(System.currentTimeMillis());
                r9.EZv(i);
                if (this.A06) {
                    this.A0d.add(BTb);
                }
            }
            A002.close();
            AnonymousClass3VX BtU2 = this.A0S.BtU();
            String BEZ2 = r7.BEZ(BTb);
            0qQ.A0B(BEZ2, 0);
            BtU2.A04.remove(BEZ2);
            C18625VvI vvI2 = BtU2.A00;
            if (vvI2 != null) {
                vvI2.A01();
            }
            if (z) {
                A08(r4, r3);
            }
            return z;
        } catch (Throwable th) {
            C9153RRe.A00(th, th);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0137, code lost:
        if (r8.A1A != false) goto L_0x0139;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B() {
        /*
            r30 = this;
            java.lang.String r0 = "SponsoredContentController.onSurfaceDestroy"
            X.0lp r16 = X.0lq.A00(r0)
            r0 = 1
            r8 = r30
            r8.A07 = r0     // Catch:{ all -> 0x0221 }
            X.1PB r7 = r8.A0P     // Catch:{ all -> 0x0221 }
            X.1PG r6 = r8.A0M     // Catch:{ all -> 0x0221 }
            if (r6 == 0) goto L_0x0042
            if (r7 == 0) goto L_0x0042
            X.2lS r0 = r8.A03     // Catch:{ all -> 0x0221 }
            if (r0 == 0) goto L_0x0042
            X.1An r0 = r8.A04     // Catch:{ all -> 0x0221 }
            X.2vA r4 = r6.A02(r0, r7)     // Catch:{ all -> 0x0221 }
            java.util.Set r0 = r8.A0e     // Catch:{ all -> 0x0221 }
            int r0 = r0.size()     // Catch:{ all -> 0x0221 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0221 }
            r4.A08 = r0     // Catch:{ all -> 0x0221 }
            java.util.Set r0 = r8.A0f     // Catch:{ all -> 0x0221 }
            int r0 = r0.size()     // Catch:{ all -> 0x0221 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0221 }
            r4.A0B = r0     // Catch:{ all -> 0x0221 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0221 }
            long r0 = r8.A0K     // Catch:{ all -> 0x0221 }
            long r2 = r2 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0221 }
            r4.A0O = r0     // Catch:{ all -> 0x0221 }
        L_0x0042:
            boolean r2 = r8.A16     // Catch:{ all -> 0x0221 }
            if (r2 == 0) goto L_0x0049
            X.14i.A07(r8)     // Catch:{ all -> 0x0221 }
        L_0x0049:
            X.2w6 r1 = r8.A0v     // Catch:{ all -> 0x0221 }
            X.2vi r3 = r8.A0Z     // Catch:{ all -> 0x0221 }
            X.2vf r11 = r8.A0U     // Catch:{ all -> 0x0221 }
            java.util.List r0 = r11.BYj()     // Catch:{ all -> 0x0221 }
            X.1PW r0 = r3.AGd(r0)     // Catch:{ all -> 0x0221 }
            r1.EJC(r0)     // Catch:{ all -> 0x0221 }
            java.util.Set r4 = r8.A0g     // Catch:{ all -> 0x0221 }
            java.util.Iterator r1 = r4.iterator()     // Catch:{ all -> 0x0221 }
        L_0x0060:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0221 }
            if (r0 == 0) goto L_0x0070
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0221 }
            X.2wS r0 = (X.C233782wS) r0     // Catch:{ all -> 0x0221 }
            r0.D1r()     // Catch:{ all -> 0x0221 }
            goto L_0x0060
        L_0x0070:
            r4.clear()     // Catch:{ all -> 0x0221 }
            X.2uo r0 = r8.A0T     // Catch:{ all -> 0x0221 }
            r20 = r0
            r20.deactivate()     // Catch:{ all -> 0x0221 }
            X.2lD r1 = r8.A0w     // Catch:{ all -> 0x0221 }
            X.2w1 r0 = r8.A0x     // Catch:{ all -> 0x0221 }
            r1.EDk(r0)     // Catch:{ all -> 0x0221 }
            X.2w1 r0 = r8.A0y     // Catch:{ all -> 0x0221 }
            r1.EDk(r0)     // Catch:{ all -> 0x0221 }
            X.3DW r5 = r8.A0u     // Catch:{ all -> 0x0221 }
            if (r5 == 0) goto L_0x00a9
            java.util.List r4 = r8.A11     // Catch:{ all -> 0x0221 }
            boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x0221 }
            if (r0 != 0) goto L_0x00a9
            java.util.Iterator r1 = r4.iterator()     // Catch:{ all -> 0x0221 }
        L_0x0096:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0221 }
            if (r0 == 0) goto L_0x00a6
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0221 }
            X.4lJ r0 = (X.AnonymousClass4lJ) r0     // Catch:{ all -> 0x0221 }
            r0.FJ5(r5)     // Catch:{ all -> 0x0221 }
            goto L_0x0096
        L_0x00a6:
            r4.clear()     // Catch:{ all -> 0x0221 }
        L_0x00a9:
            r3.EDQ(r8)     // Catch:{ all -> 0x0221 }
            X.2vk r0 = r8.A0S     // Catch:{ all -> 0x0221 }
            r0.EDO()     // Catch:{ all -> 0x0221 }
            X.2vV r0 = r8.A0H     // Catch:{ all -> 0x0221 }
            r9 = 0
            if (r0 == 0) goto L_0x00b8
            r0.A04 = r9     // Catch:{ all -> 0x0221 }
        L_0x00b8:
            X.2wC r10 = r8.A0r     // Catch:{ all -> 0x0221 }
            java.util.Map r5 = r8.A0b     // Catch:{ all -> 0x0221 }
            X.3kU r13 = r8.A0Y     // Catch:{ all -> 0x0221 }
            X.2mN r1 = r8.A0R     // Catch:{ all -> 0x0221 }
            boolean r0 = r10 instanceof X.C233692wD     // Catch:{ all -> 0x0221 }
            if (r0 == 0) goto L_0x00c6
            r14 = 0
            goto L_0x0131
        L_0x00c6:
            boolean r0 = r10 instanceof X.C233702wF     // Catch:{ all -> 0x0221 }
            if (r0 == 0) goto L_0x0102
            r0 = 0
            X.0qQ.A0B(r5, r0)     // Catch:{ all -> 0x0221 }
            r14 = 1
            r0 = 2
            X.0qQ.A0B(r13, r0)     // Catch:{ all -> 0x0221 }
            r0 = 3
            X.0qQ.A0B(r1, r0)     // Catch:{ all -> 0x0221 }
            X.3n0 r0 = r11.Coa()     // Catch:{ all -> 0x0221 }
            r4 = 0
            if (r0 == 0) goto L_0x00f9
            java.lang.Object r0 = r0.BTb()     // Catch:{ all -> 0x0221 }
            if (r0 == 0) goto L_0x00f9
            java.lang.String r0 = r1.BEZ(r0)     // Catch:{ all -> 0x0221 }
            java.lang.Object r0 = r5.get(r0)     // Catch:{ all -> 0x0221 }
            X.4jW r0 = (X.C271744jW) r0     // Catch:{ all -> 0x0221 }
            if (r0 == 0) goto L_0x00f4
            X.4jX r4 = r0.Bz6()     // Catch:{ all -> 0x0221 }
        L_0x00f4:
            X.4jX r0 = X.C271754jX.INSERTED_SUCCESSFULLY     // Catch:{ all -> 0x0221 }
            if (r4 != r0) goto L_0x00f9
            goto L_0x0131
        L_0x00f9:
            java.util.LinkedList r0 = r13.A02     // Catch:{ all -> 0x0221 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0221 }
            r14 = r0 ^ 1
            goto L_0x0131
        L_0x0102:
            r0 = 0
            X.0qQ.A0B(r5, r0)     // Catch:{ all -> 0x0221 }
            boolean r0 = r5.isEmpty()     // Catch:{ all -> 0x0221 }
            r14 = 0
            if (r0 != 0) goto L_0x0130
            java.util.Set r0 = r5.entrySet()     // Catch:{ all -> 0x0221 }
            java.util.Iterator r12 = r0.iterator()     // Catch:{ all -> 0x0221 }
        L_0x0115:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x0221 }
            if (r0 == 0) goto L_0x0130
            java.lang.Object r0 = r12.next()     // Catch:{ all -> 0x0221 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0221 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0221 }
            X.4jW r0 = (X.C271744jW) r0     // Catch:{ all -> 0x0221 }
            X.4jX r4 = r0.Bz6()     // Catch:{ all -> 0x0221 }
            X.4jX r0 = X.C271754jX.SEEN     // Catch:{ all -> 0x0221 }
            if (r4 != r0) goto L_0x0115
            goto L_0x0131
        L_0x0130:
            r14 = 1
        L_0x0131:
            r4 = 0
            if (r14 == 0) goto L_0x0139
            boolean r0 = r8.A1A     // Catch:{ all -> 0x0221 }
            r15 = 1
            if (r0 == 0) goto L_0x013d
        L_0x0139:
            r15 = 0
            A06(r8, r4)     // Catch:{ all -> 0x0221 }
        L_0x013d:
            java.util.List r0 = r8.A10     // Catch:{ all -> 0x0221 }
            java.util.Iterator r14 = r0.iterator()     // Catch:{ all -> 0x0221 }
        L_0x0143:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x0221 }
            if (r0 == 0) goto L_0x0155
            java.lang.Object r12 = r14.next()     // Catch:{ all -> 0x0221 }
            X.3CG r12 = (X.AnonymousClass3CG) r12     // Catch:{ all -> 0x0221 }
            java.util.List r0 = r13.A04     // Catch:{ all -> 0x0221 }
            r0.remove(r12)     // Catch:{ all -> 0x0221 }
            goto L_0x0143
        L_0x0155:
            if (r15 == 0) goto L_0x0185
            X.2vG r0 = r8.A0X     // Catch:{ all -> 0x0221 }
            r18 = r0
            boolean r0 = r8.A1D     // Catch:{ all -> 0x0221 }
            r17 = r0
            int r15 = r8.A0n     // Catch:{ all -> 0x0221 }
            boolean r14 = r8.A12     // Catch:{ all -> 0x0221 }
            boolean r12 = r8.A13     // Catch:{ all -> 0x0221 }
            com.instagram.common.session.UserSession r0 = r8.A0L     // Catch:{ all -> 0x0221 }
            r23 = r13
            r24 = r3
            r25 = r5
            r26 = r15
            r27 = r17
            r28 = r14
            r29 = r12
            r19 = r1
            r21 = r11
            r22 = r18
            r17 = r10
            r18 = r0
            int r0 = r17.A01(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)     // Catch:{ all -> 0x0221 }
            r8.A09 = r0     // Catch:{ all -> 0x0221 }
        L_0x0185:
            if (r2 == 0) goto L_0x01ac
            if (r6 == 0) goto L_0x01ac
            if (r7 == 0) goto L_0x01ac
            r6.A07(r7, r9)     // Catch:{ all -> 0x0221 }
            X.2vA r2 = r6.A03(r7)     // Catch:{ all -> 0x0221 }
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0221 }
            java.lang.Long r0 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0221 }
            r2.A0I = r0     // Catch:{ all -> 0x0221 }
            com.instagram.common.session.UserSession r0 = r8.A0L     // Catch:{ all -> 0x0221 }
            X.3n0 r1 = r10.A02(r0, r1, r11, r5)     // Catch:{ all -> 0x0221 }
            r0 = 0
            if (r1 == 0) goto L_0x01a6
            r0 = 1
        L_0x01a6:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0221 }
            r2.A07 = r0     // Catch:{ all -> 0x0221 }
        L_0x01ac:
            X.1Ph r1 = r8.A0O     // Catch:{ all -> 0x0221 }
            boolean r0 = r8.A0h     // Catch:{ all -> 0x0221 }
            if (r0 == 0) goto L_0x01b7
            if (r1 == 0) goto L_0x01b7
            r1.A01(r4)     // Catch:{ all -> 0x0221 }
        L_0x01b7:
            X.2vG r1 = r8.A0X     // Catch:{ all -> 0x0221 }
            X.3VZ r0 = r8.A00()     // Catch:{ all -> 0x0221 }
            r1.Ckm(r0)     // Catch:{ all -> 0x0221 }
            X.2lS r10 = r8.A03     // Catch:{ all -> 0x0221 }
            if (r7 == 0) goto L_0x01ea
            if (r10 == 0) goto L_0x01ea
            X.1PA r1 = X.AnonymousClass1PA.A00     // Catch:{ all -> 0x0221 }
            boolean r0 = r7.equals(r1)     // Catch:{ all -> 0x0221 }
            if (r0 == 0) goto L_0x01ea
            com.instagram.common.session.UserSession r0 = r10.A01     // Catch:{ all -> 0x0221 }
            X.1PG r0 = X.1PG.A00(r0)     // Catch:{ all -> 0x0221 }
            X.2vA r0 = r0.A03(r1)     // Catch:{ all -> 0x0221 }
            java.lang.Long r5 = r0.A0O     // Catch:{ all -> 0x0221 }
            java.lang.Integer r4 = r0.A08     // Catch:{ all -> 0x0221 }
            java.lang.Integer r2 = r0.A0B     // Catch:{ all -> 0x0221 }
            X.0nO r1 = X.0nY.A00()     // Catch:{ all -> 0x0221 }
            X.6Se r0 = new X.6Se     // Catch:{ all -> 0x0221 }
            r0.<init>(r10, r4, r2, r5)     // Catch:{ all -> 0x0221 }
            r1.ATE(r0)     // Catch:{ all -> 0x0221 }
        L_0x01ea:
            r8.A03 = r9     // Catch:{ all -> 0x0221 }
            if (r6 == 0) goto L_0x01fc
            if (r7 == 0) goto L_0x01fc
            boolean r0 = r8.A0k     // Catch:{ all -> 0x0221 }
            if (r0 == 0) goto L_0x01fc
            X.1An r0 = r8.A04     // Catch:{ all -> 0x0221 }
            X.2vA r0 = r6.A02(r0, r7)     // Catch:{ all -> 0x0221 }
            r0.A0N = r9     // Catch:{ all -> 0x0221 }
        L_0x01fc:
            java.util.Set r0 = r8.A0f     // Catch:{ all -> 0x0221 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0221 }
            if (r0 != 0) goto L_0x021a
            if (r6 == 0) goto L_0x021a
            if (r7 == 0) goto L_0x021a
            X.2vA r2 = r6.A03(r7)     // Catch:{ all -> 0x0221 }
            java.lang.String r0 = r2.A0f     // Catch:{ all -> 0x0221 }
            r2.A0T = r0     // Catch:{ all -> 0x0221 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0221 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0221 }
            r2.A0L = r0     // Catch:{ all -> 0x0221 }
        L_0x021a:
            r3.Dpb()     // Catch:{ all -> 0x0221 }
            r16.close()
            return
        L_0x0221:
            r1 = move-exception
            r16.close()     // Catch:{ all -> 0x0226 }
            throw r1
        L_0x0226:
            r0 = move-exception
            X.C9153RRe.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C233812wV.A0B():void");
    }

    public final void A0C(int i) {
        int max = Math.max(i, this.A00);
        this.A00 = max;
        this.A0G = i;
        this.A0Z.Crv(max);
    }

    public final void A0D(int i, int i2) {
        0lp A002 = 0lq.A00("SponsoredContentController.onCurrentIndexChanged");
        try {
            this.A0T.D69(i, i2);
            A002.close();
        } catch (Throwable th) {
            C9153RRe.A00(th, th);
            throw th;
        }
    }

    public final int Au2() {
        return this.A00;
    }

    public final Map Bk0() {
        return Collections.unmodifiableMap(this.A0b);
    }

    public final void CsA() {
        this.A0Z.Crm(this.A00);
    }

    public final void CsF(int i) {
        if (this.A06) {
            this.A0c.clear();
            if (this.A14) {
                A02(false, true, true);
            }
            this.A01 = this.A0F;
            AnonymousClass2wI r5 = this.A0N;
            Map map = this.A0b;
            Set set = this.A0d;
            C233402vf r1 = this.A0U;
            C228812mN r2 = this.A0R;
            if (r5 instanceof C233732wK) {
                C233732wK r52 = (C233732wK) r5;
                0qQ.A0B(map, 0);
                0qQ.A0B(set, 1);
                0qQ.A0B(r1, 2);
                0qQ.A0B(r2, 3);
                set.clear();
                r52.A00 = null;
                C251373n0 Coa = r1.Coa();
                if (Coa != null) {
                    Object BTb = Coa.BTb();
                    if (AnonymousClass2wI.A01(r2.BEZ(BTb), map)) {
                        r52.A00 = BTb;
                    }
                }
            }
        }
    }

    public final void D67() {
        0lp A002 = 0lq.A00("SponsoredContentController.onContentDeliveredExternally");
        try {
            A02(true, false, false);
            A04();
            A002.close();
        } catch (Throwable th) {
            C9153RRe.A00(th, th);
            throw th;
        }
    }

    public final void D6E(Object obj) {
        C228812mN r6 = this.A0R;
        String BEb = r6.BEb(obj);
        this.A0f.add(BEb);
        if (r6.CVy(obj)) {
            this.A0e.add(BEb);
            if (this.A06) {
                this.A0c.add(obj);
            }
        }
        if (r6.CVx(obj) && this.A06) {
            this.A0c.add(obj);
        }
        Map map = this.A0b;
        C271744jW r3 = (C271744jW) map.get(BEb);
        if (r3 != null) {
            r3.Elr(C271754jX.SEEN);
            r3.Ejc(System.currentTimeMillis());
            this.A0X.Cj9(r3.getId(), C266914aY.A01(r3.BJb()));
            this.A0F = r3.BHd();
            AnonymousClass1PB r4 = this.A0P;
            1PG r32 = this.A0M;
            if (this.A16 && r32 != null && r4 != null && this.A1C) {
                r32.A07(r4, this.A0r.A02(this.A0L, r6, this.A0U, map));
            }
        }
    }

    public final void DFK(AnonymousClass4LN r3) {
        this.A0X.Ch3(r3, this.A0Y.A03());
    }

    public final void DJI(1PW r3) {
        C251373n0 FIa;
        if (r3.A0C == AnonymousClass05K.A01 && !this.A08 && (FIa = this.A0U.FIa()) != null && FIa.BTb() != null) {
            A0A(FIa, r3);
            this.A08 = true;
            A03();
        }
    }

    public final void DKh(Integer num) {
        this.A0s.CM4(num);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00ab, code lost:
        r3 = r12.A0U;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean DKi(X.1PW r13) {
        /*
            r12 = this;
            java.lang.String r0 = r12.A0z
            r6 = 0
            X.0qQ.A0B(r0, r6)
            r13.A0E = r0
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            java.lang.Integer r1 = r13.A0C
            r4 = 1
            if (r0 != r1) goto L_0x0031
            r12.A03()
            X.3kU r5 = r12.A0Y
            X.3n0 r2 = r5.A01()
            X.2vG r1 = r12.A0X
            java.util.Collection r0 = r5.A03()
            r1.CjA(r2, r0)
            boolean r4 = r12.A0A(r2, r13)
        L_0x0025:
            X.2uo r1 = r12.A0T
            java.util.LinkedList r0 = r5.A02
            int r0 = r0.size()
            r1.DsJ(r0)
        L_0x0030:
            return r4
        L_0x0031:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r0 != r1) goto L_0x0067
            X.3kU r5 = r12.A0Y
            X.3n0 r3 = r5.A01()
            X.2vG r1 = r12.A0X
            java.util.Collection r0 = r5.A03()
            r1.CjA(r3, r0)
            r12.A08(r3, r13)
            X.2vk r0 = r12.A0S
            X.3VX r2 = r0.BtU()
            X.2mN r1 = r12.A0R
            java.lang.Object r0 = r3.BTb()
            java.lang.String r1 = r1.BEZ(r0)
            X.0qQ.A0B(r1, r6)
            java.util.Map r0 = r2.A04
            r0.remove(r1)
            X.VvI r0 = r2.A00
            if (r0 == 0) goto L_0x0025
            r0.A01()
            goto L_0x0025
        L_0x0067:
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            if (r0 != r1) goto L_0x0087
            r12.A03()
            X.2vf r5 = r12.A0U
            int r8 = r13.A07
            int r0 = r13.A03
            int r9 = r8 - r0
            int r10 = r13.A02
            java.util.List r7 = r13.A00()
            java.lang.String r6 = r13.A0F
            int r11 = r13.A06
            r5.E5G(r6, r7, r8, r9, r10, r11)
            r12.A03()
            return r4
        L_0x0087:
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            if (r0 != r1) goto L_0x0030
            X.3kU r2 = r12.A0Y
            X.3n0 r5 = r2.A01()
            X.2vG r1 = r12.A0X
            java.util.Collection r0 = r2.A03()
            r1.CjA(r5, r0)
            boolean r4 = r12.A0A(r5, r13)
            X.2uo r1 = r12.A0T
            java.util.LinkedList r0 = r2.A02
            int r0 = r0.size()
            r1.DsJ(r0)
            if (r4 == 0) goto L_0x0030
            X.2vf r3 = r12.A0U
            int r0 = r13.A03
            int r0 = r0 + 1
            java.lang.Object r2 = r3.BTe(r0)
            if (r2 == 0) goto L_0x0030
            r0 = 1029(0x405, float:1.442E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            X.Ika r0 = new X.Ika
            r0.<init>(r12, r5)
            boolean r0 = r3.FIZ(r2, r1, r0)
            if (r0 == 0) goto L_0x0030
            X.2wO r1 = r12.A0W
            X.HKr r0 = X.C54608HKr.A0F
            r1.AWG(r0, r13, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C233812wV.DKi(X.1PW):boolean");
    }

    public final void DfI() {
        this.A0s.DfI();
    }

    public final C268314dB Dlz(Integer num, List list) {
        return Dm0(num, AnonymousClass05K.A00, list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:115:0x025a, code lost:
        if (r31.size() >= 1) goto L_0x025c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x026e, code lost:
        if (r8.AZD(r12.BTb()) != 1) goto L_0x0270;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0271, code lost:
        if (r12 != null) goto L_0x0273;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0273, code lost:
        r12 = r12.BTb();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x027f, code lost:
        if (X.AnonymousClass2wI.A01(r8.BEZ(r12), r9) == false) goto L_0x0295;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0281, code lost:
        if (r13 != false) goto L_0x0295;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0283, code lost:
        if (r14 == false) goto L_0x0295;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0285, code lost:
        r7.A02(r6, r8, r25, r26, r27, r12, r9);
        r29 = "pool_replacement_and_injected_item_removal";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x02fb, code lost:
        if (r6.A01 == java.lang.Boolean.TRUE) goto L_0x02fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0382, code lost:
        if (r8 != false) goto L_0x02dd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02d4 A[Catch:{ all -> 0x0388, all -> 0x038d }] */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x036e A[Catch:{ all -> 0x0388, all -> 0x038d }] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x036f A[Catch:{ all -> 0x0388, all -> 0x038d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C268314dB Dm0(java.lang.Integer r37, java.lang.Integer r38, java.util.List r39) {
        /*
            r36 = this;
            java.lang.String r0 = "SponsoredContentController.onSponsoredContentDelivered"
            X.0lp r21 = X.0lq.A00(r0)
            r5 = r36
            boolean r0 = r5.A0l     // Catch:{ all -> 0x0388 }
            if (r0 == 0) goto L_0x0025
            boolean r0 = r5.A0k     // Catch:{ all -> 0x0388 }
            if (r0 == 0) goto L_0x0025
            boolean r0 = r5.A07     // Catch:{ all -> 0x0388 }
            if (r0 == 0) goto L_0x0025
            X.2uo r0 = r5.A0T     // Catch:{ all -> 0x0388 }
            boolean r0 = r0.AFi()     // Catch:{ all -> 0x0388 }
            if (r0 != 0) goto L_0x0025
            X.0sn r0 = X.0sn.A00     // Catch:{ all -> 0x0388 }
            X.4dB r3 = new X.4dB     // Catch:{ all -> 0x0388 }
            r3.<init>(r0, r0)     // Catch:{ all -> 0x0388 }
            goto L_0x0384
        L_0x0025:
            r6 = r39
            boolean r0 = r6.isEmpty()     // Catch:{ all -> 0x0388 }
            r2 = 1
            r4 = r37
            if (r0 == 0) goto L_0x0069
            java.util.Set r0 = r5.A0g     // Catch:{ all -> 0x0388 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0388 }
        L_0x0036:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0388 }
            if (r0 == 0) goto L_0x0040
            r1.next()     // Catch:{ all -> 0x0388 }
            goto L_0x0036
        L_0x0040:
            X.1PB r3 = r5.A0P     // Catch:{ all -> 0x0388 }
            X.1PG r1 = r5.A0M     // Catch:{ all -> 0x0388 }
            if (r1 == 0) goto L_0x0060
            if (r3 == 0) goto L_0x0060
            X.1An r0 = r5.A04     // Catch:{ all -> 0x0388 }
            X.2vA r1 = r1.A02(r0, r3)     // Catch:{ all -> 0x0388 }
            boolean r0 = r5.A06     // Catch:{ all -> 0x0388 }
            if (r0 == 0) goto L_0x0060
            java.lang.Integer r0 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x0388 }
            if (r4 != r0) goto L_0x0060
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x0388 }
            r1.A03 = r0     // Catch:{ all -> 0x0388 }
            java.lang.String r0 = "no_valid_refresh_item_delivered"
            r1.A0V = r0     // Catch:{ all -> 0x0388 }
        L_0x0060:
            X.0sn r0 = X.0sn.A00     // Catch:{ all -> 0x0388 }
            X.4dB r3 = new X.4dB     // Catch:{ all -> 0x0388 }
            r3.<init>(r0, r0)     // Catch:{ all -> 0x0388 }
            goto L_0x0384
        L_0x0069:
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x0388 }
            r7.<init>(r6)     // Catch:{ all -> 0x0388 }
            r20 = 0
            X.3kU r0 = r5.A0Y     // Catch:{ all -> 0x0388 }
            java.util.LinkedList r9 = r0.A02     // Catch:{ all -> 0x0388 }
            int r19 = r9.size()     // Catch:{ all -> 0x0388 }
            boolean r0 = r7.isEmpty()     // Catch:{ all -> 0x0388 }
            r1 = 0
            if (r0 != 0) goto L_0x0086
            java.lang.Integer r3 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x0388 }
            r0 = 0
            if (r4 != r3) goto L_0x0088
            r0 = 1
            goto L_0x0088
        L_0x0086:
            r10 = 0
            goto L_0x0090
        L_0x0088:
            java.util.LinkedList r20 = r5.A02(r1, r0, r1)     // Catch:{ all -> 0x0388 }
            int r10 = r9.size()     // Catch:{ all -> 0x0388 }
        L_0x0090:
            java.util.Iterator r12 = r6.iterator()     // Catch:{ all -> 0x0388 }
        L_0x0094:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x0388 }
            if (r0 == 0) goto L_0x00ef
            java.lang.Object r6 = r12.next()     // Catch:{ all -> 0x0388 }
            java.util.Map r11 = r5.A0b     // Catch:{ all -> 0x0388 }
            X.2mN r8 = r5.A0R     // Catch:{ all -> 0x0388 }
            java.lang.String r0 = r8.BEZ(r6)     // Catch:{ all -> 0x0388 }
            boolean r0 = r11.containsKey(r0)     // Catch:{ all -> 0x0388 }
            if (r0 != 0) goto L_0x00b7
            java.lang.String r3 = r8.BEZ(r6)     // Catch:{ all -> 0x0388 }
            X.4jW r0 = r8.AMS(r6)     // Catch:{ all -> 0x0388 }
            r11.put(r3, r0)     // Catch:{ all -> 0x0388 }
        L_0x00b7:
            boolean r0 = r8.CcL(r6)     // Catch:{ all -> 0x0388 }
            if (r0 == 0) goto L_0x00dd
            boolean r0 = r8.CcM(r6)     // Catch:{ all -> 0x0388 }
            if (r0 != 0) goto L_0x00dd
            boolean r0 = r8.CXm(r6)     // Catch:{ all -> 0x0388 }
            if (r0 == 0) goto L_0x00d8
            int r3 = r5.A0A     // Catch:{ all -> 0x0388 }
            int r0 = r8.AZx(r6)     // Catch:{ all -> 0x0388 }
            int r3 = r3 + r0
        L_0x00d0:
            r5.A0A = r3     // Catch:{ all -> 0x0388 }
            X.2vG r0 = r5.A0X     // Catch:{ all -> 0x0388 }
            r0.Cgt(r4, r6)     // Catch:{ all -> 0x0388 }
            goto L_0x0094
        L_0x00d8:
            int r0 = r5.A0A     // Catch:{ all -> 0x0388 }
            int r3 = r0 + 1
            goto L_0x00d0
        L_0x00dd:
            boolean r0 = r8.CYA(r6)     // Catch:{ all -> 0x0388 }
            if (r0 == 0) goto L_0x0094
            int r0 = r5.A0B     // Catch:{ all -> 0x0388 }
            int r0 = r0 + 1
            r5.A0B = r0     // Catch:{ all -> 0x0388 }
            X.2vG r0 = r5.A0X     // Catch:{ all -> 0x0388 }
            r0.CjQ(r6)     // Catch:{ all -> 0x0388 }
            goto L_0x0094
        L_0x00ef:
            r0 = r38
            X.4dB r3 = r5.A01(r4, r0, r7, r2)     // Catch:{ all -> 0x0388 }
            java.util.Collection r0 = r3.A01     // Catch:{ all -> 0x0388 }
            r35 = r0
            java.util.Iterator r12 = r35.iterator()     // Catch:{ all -> 0x0388 }
            r11 = 0
            r8 = 0
        L_0x00ff:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x0388 }
            if (r0 == 0) goto L_0x012e
            java.lang.Object r7 = r12.next()     // Catch:{ all -> 0x0388 }
            X.2mN r6 = r5.A0R     // Catch:{ all -> 0x0388 }
            boolean r0 = r6.CYA(r7)     // Catch:{ all -> 0x0388 }
            if (r0 == 0) goto L_0x0114
            int r11 = r11 + 1
            goto L_0x0125
        L_0x0114:
            boolean r0 = r6.CcL(r7)     // Catch:{ all -> 0x0388 }
            if (r0 == 0) goto L_0x0125
            boolean r0 = r6.CXm(r7)     // Catch:{ all -> 0x0388 }
            if (r0 == 0) goto L_0x012b
            int r0 = r6.AZx(r7)     // Catch:{ all -> 0x0388 }
            int r8 = r8 + r0
        L_0x0125:
            X.2vk r0 = r5.A0S     // Catch:{ all -> 0x0388 }
            r0.A9o(r7)     // Catch:{ all -> 0x0388 }
            goto L_0x00ff
        L_0x012b:
            int r8 = r8 + 1
            goto L_0x0125
        L_0x012e:
            int r0 = r5.A0B     // Catch:{ all -> 0x0388 }
            int r0 = r0 - r11
            r5.A0D = r0     // Catch:{ all -> 0x0388 }
            int r0 = r5.A0A     // Catch:{ all -> 0x0388 }
            int r0 = r0 - r8
            r5.A0C = r0     // Catch:{ all -> 0x0388 }
            java.lang.Integer r0 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x0388 }
            r6 = 0
            if (r4 != r0) goto L_0x013e
            r6 = 1
        L_0x013e:
            boolean r0 = r5.A06     // Catch:{ all -> 0x0388 }
            if (r0 == 0) goto L_0x02dd
            if (r6 == 0) goto L_0x02dd
            X.1PB r8 = r5.A0P     // Catch:{ all -> 0x0388 }
            X.1PG r7 = r5.A0M     // Catch:{ all -> 0x0388 }
            r6 = 0
            if (r7 == 0) goto L_0x0153
            if (r8 == 0) goto L_0x0153
            X.1An r0 = r5.A04     // Catch:{ all -> 0x0388 }
            X.2vA r6 = r7.A02(r0, r8)     // Catch:{ all -> 0x0388 }
        L_0x0153:
            int r0 = r9.size()     // Catch:{ all -> 0x0388 }
            if (r0 != r10) goto L_0x016a
            r5.A05()     // Catch:{ all -> 0x0388 }
            if (r6 == 0) goto L_0x0384
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x0388 }
            r6.A03 = r0     // Catch:{ all -> 0x0388 }
            java.lang.String r0 = "no_valid_refresh_item_delivered"
            r6.A0V = r0     // Catch:{ all -> 0x0388 }
            goto L_0x0384
        L_0x016a:
            X.2wI r7 = r5.A0N     // Catch:{ all -> 0x0388 }
            X.2vG r0 = r5.A0X     // Catch:{ all -> 0x0388 }
            r26 = r0
            java.util.Map r0 = r5.A0b     // Catch:{ all -> 0x0388 }
            r34 = r0
            java.util.Map r9 = java.util.Collections.unmodifiableMap(r34)     // Catch:{ all -> 0x0388 }
            X.2mN r8 = r5.A0R     // Catch:{ all -> 0x0388 }
            X.2vf r0 = r5.A0U     // Catch:{ all -> 0x0388 }
            r25 = r0
            X.2uo r12 = r5.A0T     // Catch:{ all -> 0x0388 }
            java.util.Set r14 = r5.A0d     // Catch:{ all -> 0x0388 }
            X.2vi r0 = r5.A0Z     // Catch:{ all -> 0x0388 }
            r27 = r0
            int r0 = r5.A00     // Catch:{ all -> 0x0388 }
            r32 = r0
            java.util.Set r0 = r5.A0c     // Catch:{ all -> 0x0388 }
            r31 = r0
            boolean r0 = r5.A0m     // Catch:{ all -> 0x0388 }
            r18 = r0
            boolean r13 = r5.A0j     // Catch:{ all -> 0x0388 }
            boolean r0 = r5.A0i     // Catch:{ all -> 0x0388 }
            r17 = r0
            boolean r0 = r7 instanceof X.C233732wK     // Catch:{ all -> 0x0388 }
            if (r0 == 0) goto L_0x02b1
            X.2wK r7 = (X.C233732wK) r7     // Catch:{ all -> 0x0388 }
            r0 = r26
            X.0qQ.A0B(r0, r2)     // Catch:{ all -> 0x0388 }
            r11 = 2
            X.0qQ.A0B(r9, r11)     // Catch:{ all -> 0x0388 }
            r0 = 3
            X.0qQ.A0B(r8, r0)     // Catch:{ all -> 0x0388 }
            r15 = 4
            r0 = r25
            X.0qQ.A0B(r0, r15)     // Catch:{ all -> 0x0388 }
            r0 = 5
            X.0qQ.A0B(r12, r0)     // Catch:{ all -> 0x0388 }
            r0 = 6
            X.0qQ.A0B(r14, r0)     // Catch:{ all -> 0x0388 }
            r14 = 7
            r0 = r27
            X.0qQ.A0B(r0, r14)     // Catch:{ all -> 0x0388 }
            r14 = 10
            r0 = r31
            X.0qQ.A0B(r0, r14)     // Catch:{ all -> 0x0388 }
            if (r13 == 0) goto L_0x0225
            java.lang.Object r13 = r7.A00     // Catch:{ all -> 0x0388 }
            if (r13 == 0) goto L_0x0225
            boolean r0 = r31.isEmpty()     // Catch:{ all -> 0x0388 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0225
            int r0 = r31.size()     // Catch:{ all -> 0x0388 }
            if (r0 != r11) goto L_0x0225
            java.util.Iterator r16 = r31.iterator()     // Catch:{ all -> 0x0388 }
        L_0x01de:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x0388 }
            if (r0 == 0) goto L_0x0225
            java.lang.Object r15 = r16.next()     // Catch:{ all -> 0x0388 }
            java.lang.String r14 = r8.BJS(r15)     // Catch:{ all -> 0x0388 }
            java.lang.String r0 = r8.BEZ(r13)     // Catch:{ all -> 0x0388 }
            boolean r0 = X.0qQ.A0K(r14, r0)     // Catch:{ all -> 0x0388 }
            if (r0 != 0) goto L_0x01de
            boolean r0 = r8.ACJ(r13, r15)     // Catch:{ all -> 0x0388 }
            if (r0 == 0) goto L_0x01de
            boolean r0 = X.AnonymousClass2wI.A01(r14, r9)     // Catch:{ all -> 0x0388 }
            if (r0 != 0) goto L_0x01de
            if (r6 == 0) goto L_0x0208
            java.lang.String r0 = "invalid_ad_pod_gap"
            r6.A0W = r0     // Catch:{ all -> 0x0388 }
        L_0x0208:
            boolean r0 = r7.A01     // Catch:{ all -> 0x0388 }
            if (r0 != 0) goto L_0x0214
            r0 = r32
            r12.Cn9(r0)     // Catch:{ all -> 0x0388 }
            r7.A01 = r2     // Catch:{ all -> 0x0388 }
            r0 = 1
        L_0x0214:
            int r9 = r31.size()     // Catch:{ all -> 0x0388 }
            java.lang.String r7 = "severe_replacement"
            r8 = r1
            r10 = r32
            r11 = r0
            X.AnonymousClass2wI.A00(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0388 }
            if (r6 == 0) goto L_0x0384
            goto L_0x02b5
        L_0x0225:
            java.util.List r0 = r25.BYj()     // Catch:{ all -> 0x0388 }
            java.util.ArrayList r12 = X.00k.A0U(r0)     // Catch:{ all -> 0x0388 }
            r0 = r27
            X.1PW r14 = r0.AGd(r12)     // Catch:{ all -> 0x0388 }
            if (r20 == 0) goto L_0x0251
            java.util.Iterator r15 = r20.iterator()     // Catch:{ all -> 0x0388 }
            r30 = 0
        L_0x023b:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x0388 }
            if (r0 == 0) goto L_0x0253
            java.lang.Object r13 = r15.next()     // Catch:{ all -> 0x0388 }
            X.3n0 r13 = (X.C251373n0) r13     // Catch:{ all -> 0x0388 }
            java.lang.String r12 = "refresh_deletion_response_handling"
            r0 = r26
            r0.Chf(r13, r14, r12)     // Catch:{ all -> 0x0388 }
            int r30 = r30 + 1
            goto L_0x023b
        L_0x0251:
            r30 = 0
        L_0x0253:
            if (r18 == 0) goto L_0x025c
            int r0 = r31.size()     // Catch:{ all -> 0x0388 }
            r14 = 0
            if (r0 < r2) goto L_0x025d
        L_0x025c:
            r14 = 1
        L_0x025d:
            X.3n0 r12 = r25.Coa()     // Catch:{ all -> 0x0388 }
            if (r17 == 0) goto L_0x0270
            if (r12 == 0) goto L_0x0295
            java.lang.Object r0 = r12.BTb()     // Catch:{ all -> 0x0388 }
            int r0 = r8.AZD(r0)     // Catch:{ all -> 0x0388 }
            r13 = 1
            if (r0 == r2) goto L_0x0273
        L_0x0270:
            r13 = 0
            if (r12 == 0) goto L_0x0295
        L_0x0273:
            java.lang.Object r12 = r12.BTb()     // Catch:{ all -> 0x0388 }
            java.lang.String r0 = r8.BEZ(r12)     // Catch:{ all -> 0x0388 }
            boolean r0 = X.AnonymousClass2wI.A01(r0, r9)     // Catch:{ all -> 0x0388 }
            if (r0 == 0) goto L_0x0295
            if (r13 != 0) goto L_0x0295
            if (r14 == 0) goto L_0x0295
            r22 = r7
            r23 = r6
            r24 = r8
            r28 = r12
            r29 = r9
            r22.A02(r23, r24, r25, r26, r27, r28, r29)     // Catch:{ all -> 0x0388 }
            java.lang.String r29 = "pool_replacement_and_injected_item_removal"
            goto L_0x02a2
        L_0x0295:
            if (r10 != r11) goto L_0x0298
            goto L_0x02a0
        L_0x0298:
            if (r10 != r2) goto L_0x029d
            java.lang.String r29 = "keep_one_item_in_pool"
            goto L_0x02a2
        L_0x029d:
            java.lang.String r29 = "pool_replacement"
            goto L_0x02a2
        L_0x02a0:
            java.lang.String r29 = "keep_two_items_in_pool"
        L_0x02a2:
            boolean r0 = r7.A01     // Catch:{ all -> 0x0388 }
            int r31 = r31.size()     // Catch:{ all -> 0x0388 }
            r28 = r6
            r33 = r0
            X.AnonymousClass2wI.A00(r28, r29, r30, r31, r32, r33)     // Catch:{ all -> 0x0388 }
            r7.A01 = r1     // Catch:{ all -> 0x0388 }
        L_0x02b1:
            r8 = 1
            if (r6 == 0) goto L_0x02dd
            goto L_0x02ca
        L_0x02b5:
            java.lang.String r0 = r6.A0V     // Catch:{ all -> 0x0388 }
            boolean r0 = X.2Ob.A00(r0, r7)     // Catch:{ all -> 0x0388 }
            if (r0 == 0) goto L_0x02ca
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0388 }
            java.lang.Boolean r0 = r6.A06     // Catch:{ all -> 0x0388 }
            boolean r0 = r7.equals(r0)     // Catch:{ all -> 0x0388 }
            if (r0 == 0) goto L_0x02ca
            r5.A05()     // Catch:{ all -> 0x0388 }
        L_0x02ca:
            java.lang.String r7 = r6.A0V     // Catch:{ all -> 0x0388 }
            java.lang.String r0 = "pool_replacement_and_injected_item_removal"
            boolean r0 = X.2Ob.A00(r7, r0)     // Catch:{ all -> 0x0388 }
            if (r0 == 0) goto L_0x0382
            java.lang.String r6 = r6.A0e     // Catch:{ all -> 0x0388 }
            r0 = r34
            r0.remove(r6)     // Catch:{ all -> 0x0388 }
            goto L_0x0382
        L_0x02dd:
            r0 = r35
            r5.A09(r0)     // Catch:{ all -> 0x0388 }
            X.1PB r7 = r5.A0P     // Catch:{ all -> 0x0388 }
            X.1PG r6 = r5.A0M     // Catch:{ all -> 0x0388 }
            if (r6 == 0) goto L_0x0384
            if (r7 == 0) goto L_0x0384
            X.1An r0 = r5.A04     // Catch:{ all -> 0x0388 }
            X.2vA r6 = r6.A02(r0, r7)     // Catch:{ all -> 0x0388 }
            java.util.Set r11 = r5.A0c     // Catch:{ all -> 0x0388 }
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x0388 }
            if (r4 == r0) goto L_0x02fd
            java.lang.Boolean r4 = r6.A01     // Catch:{ all -> 0x0388 }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0388 }
            r10 = 0
            if (r4 != r0) goto L_0x02fe
        L_0x02fd:
            r10 = 1
        L_0x02fe:
            int r9 = r5.A00     // Catch:{ all -> 0x0388 }
            java.lang.Integer r7 = r6.A0D     // Catch:{ all -> 0x0388 }
            com.instagram.common.session.UserSession r8 = r5.A0L     // Catch:{ all -> 0x0388 }
            X.0qQ.A0B(r11, r1)     // Catch:{ all -> 0x0388 }
            if (r8 == 0) goto L_0x033d
            X.0Tu r4 = X.0Tu.A05     // Catch:{ all -> 0x0388 }
            r0 = 36329152671924056(0x81112c00003f58, double:3.0380406632563156E-306)
            boolean r0 = X.182.A06(r4, r8, r0)     // Catch:{ all -> 0x0388 }
            if (r0 == 0) goto L_0x033d
            if (r10 == 0) goto L_0x0319
            goto L_0x032b
        L_0x0319:
            if (r7 == 0) goto L_0x0338
            int r0 = r7.intValue()     // Catch:{ all -> 0x0388 }
            if (r9 < r0) goto L_0x0338
            if (r10 != 0) goto L_0x0328
            if (r19 != 0) goto L_0x0338
            java.lang.String r0 = "ad_pool_exhausted"
            goto L_0x0335
        L_0x0328:
            java.lang.String r0 = "hp_rule_dissatisfied"
            goto L_0x0335
        L_0x032b:
            boolean r0 = r11.isEmpty()     // Catch:{ all -> 0x0388 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0319
            java.lang.String r0 = "hp_already_impressed"
        L_0x0335:
            r6.A0P = r0     // Catch:{ all -> 0x0388 }
            goto L_0x033d
        L_0x0338:
            r0 = 0
            r6.A0P = r0     // Catch:{ all -> 0x0388 }
            r0 = 1
            goto L_0x033e
        L_0x033d:
            r0 = 0
        L_0x033e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0388 }
            r6.A04 = r0     // Catch:{ all -> 0x0388 }
            int r5 = r5.A00     // Catch:{ all -> 0x0388 }
            r4 = 2
            if (r8 == 0) goto L_0x0384
            X.0Tu r7 = X.0Tu.A05     // Catch:{ all -> 0x0388 }
            r0 = 36329152671924056(0x81112c00003f58, double:3.0380406632563156E-306)
            boolean r0 = X.182.A06(r7, r8, r0)     // Catch:{ all -> 0x0388 }
            if (r0 == 0) goto L_0x0384
            java.lang.Boolean r1 = r6.A04     // Catch:{ all -> 0x0388 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x0388 }
            boolean r0 = X.0qQ.A0K(r1, r0)     // Catch:{ all -> 0x0388 }
            if (r0 != 0) goto L_0x0384
            java.lang.String r1 = r6.A0Q     // Catch:{ all -> 0x0388 }
            if (r1 == 0) goto L_0x036f
            java.lang.String r0 = "bad_network"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0388 }
            if (r0 != r2) goto L_0x036f
            goto L_0x0384
        L_0x036f:
            java.lang.Integer r0 = r6.A0F     // Catch:{ all -> 0x0388 }
            if (r0 == 0) goto L_0x037f
            int r0 = r0.intValue()     // Catch:{ all -> 0x0388 }
            int r5 = r5 - r0
            if (r5 < r4) goto L_0x037f
            java.lang.String r0 = "fast_user_consumption"
        L_0x037c:
            r6.A0Q = r0     // Catch:{ all -> 0x0388 }
            goto L_0x0384
        L_0x037f:
            java.lang.String r0 = "request_too_late"
            goto L_0x037c
        L_0x0382:
            if (r8 != 0) goto L_0x02dd
        L_0x0384:
            r21.close()
            return r3
        L_0x0388:
            r1 = move-exception
            r21.close()     // Catch:{ all -> 0x038d }
            throw r1
        L_0x038d:
            r0 = move-exception
            X.C9153RRe.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C233812wV.Dm0(java.lang.Integer, java.lang.Integer, java.util.List):X.4dB");
    }

    public final void Dpg(String str) {
        this.A0Z.Dpg(str);
    }

    public final void Dpi() {
        this.A0Z.EBI();
        AnonymousClass2vG r3 = this.A0X;
        r3.Dpj(A00());
        this.A09 = -1;
        this.A0B = 0;
        this.A0A = 0;
        this.A0D = 0;
        this.A0C = 0;
        this.A0E = -1;
        this.A0F = -1;
        this.A02 = -1;
        this.A0f.clear();
        this.A0e.clear();
        this.A01 = -1;
        if (this.A1F || this.A0I) {
            this.A0U.Dpi();
            this.A0b.clear();
            if (this.A1E) {
                A06(this, false);
            } else {
                A04();
            }
        }
        if (this.A1B) {
            this.A00 = 0;
            this.A0G = 0;
        }
        String obj = UUID.randomUUID().toString();
        this.A05 = obj;
        r3.ERc(obj);
    }

    public final void onAppBackgrounded() {
        int A032 = AnonymousClass0fD.A03(887526375);
        AnonymousClass1PB r6 = this.A0P;
        1PG r5 = this.A0M;
        if (!(!this.A16 || r5 == null || r6 == null)) {
            C233682wC r4 = this.A0r;
            C233402vf r3 = this.A0U;
            Map map = this.A0b;
            r5.A07(r6, r4.A02(this.A0L, this.A0R, r3, map));
        }
        AnonymousClass0fD.A0A(-579830870, A032);
    }

    public final void onAppForegrounded() {
        AnonymousClass0fD.A0A(346714357, AnonymousClass0fD.A03(-1673653492));
    }

    public C233812wV(UserSession userSession, C61410nE r17, C233312vV r18, C228352lS r19, 1An r20, 1PG r21, C233682wC r22, AnonymousClass2wI r23, AnonymousClass2v7 r24, AnonymousClass1PB r25, C233372vc r26, C233632w4 r27, C228812mN r28, C233452vk r29, C233012uo r30, C233402vf r31, AnonymousClass2wH r32, AnonymousClass2wO r33, AnonymousClass2vG r34, C249863kU r35, AnonymousClass3DW r36, C233432vi r37, AnonymousClass2w6 r38, AnonymousClass2lD r39, C233532vs r40, C233612w1 r41, String str, List list, Set set, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26) {
        1Ph r0;
        Set set2 = set;
        C233452vk r3 = r29;
        ArrayList arrayList = new ArrayList();
        this.A11 = arrayList;
        this.A05 = UUID.randomUUID().toString();
        this.A0d = new HashSet();
        this.A0c = new HashSet();
        this.A01 = -1;
        1PG r9 = r21;
        this.A0M = r9;
        this.A15 = z11;
        AnonymousClass1PB r8 = r25;
        this.A0P = r8;
        this.A16 = z6;
        this.A1C = z8;
        this.A0q = r17;
        this.A18 = z3;
        this.A0p = i;
        this.A17 = z4;
        this.A0o = i3;
        AnonymousClass2lD r6 = r39;
        this.A0w = r6;
        this.A0U = r31;
        this.A0W = r33;
        this.A0r = r22;
        AnonymousClass2vG r1 = r34;
        this.A0X = r1;
        C233012uo r13 = r30;
        this.A0T = r13;
        C228812mN r14 = r28;
        this.A0R = r14;
        C249863kU r12 = r35;
        this.A0Y = r12;
        C233632w4 r2 = r27;
        this.A0Q = r2;
        C233432vi r7 = r37;
        this.A0Z = r7;
        AnonymousClass2w6 r11 = r38;
        this.A0v = r11;
        this.A12 = z14;
        this.A13 = z15;
        this.A0L = userSession;
        this.A0I = z18;
        this.A0z = str;
        r3 = r29 == null ? new C233442vj() : r3;
        this.A0S = r3;
        this.A0s = r24;
        r7.EO6(r3);
        this.A0S.ENq(this);
        r1.ERc(this.A05);
        r1.EVW(r2.A02);
        this.A0N = r23;
        this.A0m = z21;
        this.A0j = z23;
        this.A0i = z24;
        this.A14 = z26;
        A07(this, false);
        boolean A7L = r13.A7L(r2, this, this);
        this.A0k = A7L;
        this.A1G = z;
        r7.A7t(this);
        r7.EIs(r11.Bo2());
        C233612w1 AMC = r7.AMC();
        this.A0x = AMC;
        r6.A8h(AMC);
        this.A0g = set == null ? new HashSet() : set2;
        this.A0a = r40;
        this.A0t = r26;
        long currentTimeMillis = System.currentTimeMillis();
        this.A0K = currentTimeMillis;
        Long valueOf = Long.valueOf(currentTimeMillis);
        AnonymousClass1PB r10 = this.A0P;
        1PG r15 = this.A0M;
        if (!(r15 == null || r10 == null || !this.A0k)) {
            r15.A02(this.A04, r10).A0N = valueOf;
        }
        C233312vV r02 = r18;
        this.A0H = r02;
        if (r18 != null) {
            r02.A04 = this;
        }
        this.A0h = z13;
        this.A0J = z17;
        if (!z13 || r25 == null) {
            r0 = null;
        } else {
            r0 = 1Pg.A02.A00(r8);
        }
        this.A0O = r0;
        if (z12 && !r12.A02.isEmpty() && r25 != null && r21 != null) {
            1PX A042 = r9.A04(r8);
            if (C54603HKm.A02.A00(A042.A0A, this, A042.A0B)) {
                C251373n0 A002 = r12.A00();
                1Pi BXm = r14.BXm(A002.BTb());
                if (!(this.A0O == null || BXm == null || !A002.CUo())) {
                    Integer num = AnonymousClass05K.A01;
                    1PW r03 = new 1PW(num);
                    r03.A03 = 0;
                    r03.A02 = 0;
                    r03.A0C = num;
                    DKi(r03);
                }
            }
        }
        this.A0V = r32;
        if (A7L) {
            if (z16) {
                this.A00 = this.A0Q.A01;
            }
            if (!z2) {
                A04();
            } else {
                ArrayList arrayList2 = new ArrayList();
                Integer num2 = AnonymousClass05K.A0Y;
                Integer num3 = AnonymousClass05K.A00;
                for (C251373n0 r04 : this.A0Y.A04()) {
                    Object BTb = r04.BTb();
                    num2 = r04.Bxj();
                    num3 = r04.Bdb();
                    arrayList2.add(BTb);
                    Map map = this.A0b;
                    C228812mN r05 = this.A0R;
                    map.put(r05.BEZ(BTb), r05.AMS(BTb));
                }
                Collection collection = A01(num2, num3, arrayList2, false).A01;
                if (!collection.isEmpty()) {
                    A09(collection);
                }
            }
        }
        C233612w1 r06 = r41;
        this.A0y = r06;
        r6.A8h(r06);
        this.A10 = list;
        this.A0n = i2;
        this.A1D = z5;
        this.A1B = z7;
        if (z6) {
            14i.A08.A0B(this);
        }
        this.A1A = z9;
        this.A0l = z10;
        this.A04 = r20;
        AnonymousClass3DW r210 = r36;
        this.A0u = r210;
        if (r36 != null) {
            arrayList.add(r7.AN3());
            arrayList.add(r13.AN3());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AnonymousClass4lJ) it.next()).EC5(r210);
            }
        }
        this.A03 = r19;
        this.A1F = z19;
        this.A06 = z20;
        this.A19 = z22;
        this.A1E = z25;
    }
}
