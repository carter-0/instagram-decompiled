package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.Lock;

/* renamed from: X.Oah  reason: case insensitive filesystem */
public final class C71062Oah {
    public GAX A00;
    public C70683OGe A01 = new C70683OGe();
    public C70400O5c A02;
    public C62320sa A03 = C73689PiC.A00;
    public final LinkedList A04 = new LinkedList();

    /* JADX WARNING: type inference failed for: r1v16, types: [X.Nhx, X.Npp, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ec  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C71062Oah r18) {
        /*
            r8 = r18
            X.OGe r7 = r8.A01
            X.GAX r0 = r7.A00
            if (r0 == 0) goto L_0x02cc
            X.O5c r0 = r8.A02
            if (r0 == 0) goto L_0x02cc
            java.util.LinkedList r6 = r8.A04
            boolean r0 = X.AnonymousClass7TE.A1b(r6)
            if (r0 == 0) goto L_0x02cc
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>(r6)
            java.util.Iterator r18 = r0.iterator()
        L_0x001d:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x02cc
            java.lang.Object r5 = r18.next()
            X.OAx r5 = (X.C70549OAx) r5
            X.0qQ.A0A(r5)
            java.lang.String r12 = r5.A01
            int r9 = r12.length()
            r15 = 1
            if (r9 == 0) goto L_0x0216
            r3 = 0
            java.util.concurrent.locks.Lock r11 = r7.A04
            r11.lock()
            X.Npp r0 = r7.A01
            if (r0 == 0) goto L_0x02bc
            java.util.Collection r10 = A00(r0, r12)
            r11.unlock()
            X.0qQ.A0A(r10)
            X.GAX r0 = r8.A00
            if (r0 == 0) goto L_0x0213
            java.lang.Object r1 = r0.A05
        L_0x004f:
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r4) goto L_0x0060
            int r1 = r9 - r15
            char r2 = r12.charAt(r1)
            r1 = 32
            if (r2 != r1) goto L_0x0216
        L_0x0060:
            int r2 = r10.size()
            X.GAX r1 = r8.A00
            if (r1 == 0) goto L_0x006a
            int r0 = r1.A01
        L_0x006a:
            if (r2 < r0) goto L_0x0216
            r10 = 0
            if (r1 == 0) goto L_0x0210
            java.lang.Object r0 = r1.A04
        L_0x0071:
            boolean r17 = X.AnonymousClass7TF.A1W(r0, r4)
            X.0rm r4 = X.C51965G9l.A11()
            X.GAX r0 = r7.A00
            if (r0 == 0) goto L_0x00d2
            r11.lock()
            r11.lock()
            X.Npp r0 = r7.A01
            if (r0 == 0) goto L_0x02bc
            java.util.Collection r2 = A00(r0, r12)
            r11.unlock()
            X.0qQ.A0A(r2)
            X.OJM r0 = r7.A02
            java.util.Comparator r14 = r7.A03
            X.0qQ.A0B(r2, r3)
            X.0qQ.A0B(r14, r15)
            X.OVD r1 = r0.A00
            java.util.Iterator r16 = r2.iterator()
        L_0x00a1:
            boolean r0 = r16.hasNext()
            r2 = 0
            if (r0 == 0) goto L_0x00be
            java.lang.Object r13 = r16.next()
            if (r1 == 0) goto L_0x00d4
            boolean r0 = r1.A01
            if (r0 == r15) goto L_0x00d4
            X.0qQ.A0B(r13, r3)
            java.util.HashMap r0 = r1.A02
            java.lang.Object r1 = r0.get(r13)
            X.OVD r1 = (X.OVD) r1
            goto L_0x00a1
        L_0x00be:
            if (r1 == 0) goto L_0x00d4
            X.OAy r0 = new X.OAy
            r0.<init>(r14)
            r1.A01(r0)
            X.N2j r2 = r0.A00
            if (r2 != 0) goto L_0x00d4
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x00d2:
            r0 = r10
            goto L_0x00e8
        L_0x00d4:
            r11.unlock()
            if (r2 == 0) goto L_0x00d2
            int r1 = r2.A01
            X.GAX r0 = r7.A00
            if (r0 == 0) goto L_0x013b
            int r0 = r0.A02
        L_0x00e1:
            if (r1 < r0) goto L_0x00d2
            X.OnS r0 = new X.OnS
            r0.<init>(r2)
        L_0x00e8:
            r4.A00 = r0
            if (r17 == 0) goto L_0x0282
            X.GAX r0 = r7.A00
            if (r0 == 0) goto L_0x02ba
            r11.lock()
            r0 = 80
            if (r9 > r0) goto L_0x02ba
            r11.lock()
            X.Ni0 r1 = new X.Ni0
            r1.<init>()
            X.Nhz r0 = new X.Nhz
            r0.<init>()
            X.Npp[] r0 = new X.C69667Npp[]{r1, r0}
            X.Nhx r1 = new X.Nhx
            r1.<init>()
            java.util.List r0 = java.util.Arrays.asList(r0)
            r1.A00 = r0
            java.util.Collection r0 = A00(r1, r12)
            X.0qQ.A0A(r0)
            java.util.ArrayList r1 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r12 = r0.iterator()
        L_0x0122:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x013d
            java.lang.Object r2 = r12.next()
            X.Nhy r0 = new X.Nhy
            r0.<init>()
            java.lang.String r2 = (java.lang.String) r2
            java.util.Collection r0 = A00(r0, r2)
            r1.add(r0)
            goto L_0x0122
        L_0x013b:
            r0 = 0
            goto L_0x00e1
        L_0x013d:
            r11.unlock()
            X.OJM r12 = r7.A02
            java.util.HashMap r13 = X.AnonymousClass7TE.A1E()
            java.util.Iterator r16 = r1.iterator()
        L_0x014a:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x01a5
            java.lang.Object r0 = r16.next()
            java.util.Collection r0 = (java.util.Collection) r0
            X.0qQ.A0B(r0, r3)
            X.OVD r2 = r12.A00
            java.util.Iterator r15 = r0.iterator()
        L_0x015f:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0177
            java.lang.Object r14 = r15.next()
            if (r2 == 0) goto L_0x014a
            X.0qQ.A0B(r14, r3)
            java.util.HashMap r0 = r2.A02
            java.lang.Object r2 = r0.get(r14)
            X.OVD r2 = (X.OVD) r2
            goto L_0x015f
        L_0x0177:
            if (r2 == 0) goto L_0x014a
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            X.OVD.A00(r2, r0)
            java.util.Iterator r14 = r0.iterator()
        L_0x0184:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x014a
            java.lang.Object r2 = r14.next()
            boolean r0 = r13.containsKey(r2)
            if (r0 != 0) goto L_0x0197
            X.C66581MXm.A1S(r2, r13, r3)
        L_0x0197:
            java.lang.Number r0 = X.JTO.A0z(r2, r13)
            int r0 = X.AnonymousClass7TG.A0A(r0)
            int r0 = r0 + 1
            X.C66581MXm.A1S(r2, r13, r0)
            goto L_0x0184
        L_0x01a5:
            java.util.Iterator r15 = X.AnonymousClass7TF.A0s(r13)
            boolean r0 = r15.hasNext()
            r12 = 0
            if (r0 != 0) goto L_0x01e9
            r14 = r12
        L_0x01b1:
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            if (r14 == 0) goto L_0x024e
            int r0 = X.C66582MXn.A08(r14)
            double r2 = (double) r0
            int r0 = r1.size()
            double r0 = (double) r0
            double r2 = r2 / r0
            r15 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            int r0 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r0 < 0) goto L_0x024e
            java.util.LinkedHashMap r12 = X.AnonymousClass7TE.A1H()
            java.util.Iterator r3 = X.AnonymousClass7TF.A0s(r13)
        L_0x01d1:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x021c
            java.util.Map$Entry r2 = X.AnonymousClass7TE.A1J(r3)
            int r1 = X.C66582MXn.A08(r2)
            int r0 = X.C66582MXn.A08(r14)
            if (r1 != r0) goto L_0x01d1
            X.JTR.A1U(r12, r2)
            goto L_0x01d1
        L_0x01e9:
            java.lang.Object r14 = r15.next()
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x01b1
            r0 = r14
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            int r2 = X.C66582MXn.A08(r0)
        L_0x01fa:
            java.lang.Object r3 = r15.next()
            r0 = r3
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            int r0 = X.C66582MXn.A08(r0)
            if (r2 >= r0) goto L_0x0209
            r14 = r3
            r2 = r0
        L_0x0209:
            boolean r0 = r15.hasNext()
            if (r0 != 0) goto L_0x01fa
            goto L_0x01b1
        L_0x0210:
            r0 = r10
            goto L_0x0071
        L_0x0213:
            r1 = 0
            goto L_0x004f
        L_0x0216:
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of()
            goto L_0x02a9
        L_0x021c:
            java.util.Set r0 = r12.keySet()
            java.util.Iterator r3 = r0.iterator()
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x02c6
            java.lang.Object r12 = r3.next()
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x024c
            r0 = r12
            X.N2j r0 = (X.C68143N2j) r0
            int r2 = r0.A01
        L_0x0239:
            java.lang.Object r1 = r3.next()
            r0 = r1
            X.N2j r0 = (X.C68143N2j) r0
            int r0 = r0.A01
            if (r2 >= r0) goto L_0x0246
            r12 = r1
            r2 = r0
        L_0x0246:
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L_0x0239
        L_0x024c:
            X.N2j r12 = (X.C68143N2j) r12
        L_0x024e:
            r11.unlock()
            if (r12 == 0) goto L_0x02ba
            int r1 = r12.A01
            X.GAX r0 = r7.A00
            if (r0 == 0) goto L_0x02b8
            int r0 = r0.A02
        L_0x025b:
            if (r1 < r0) goto L_0x02ba
            X.OnS r0 = new X.OnS
            r0.<init>(r12)
        L_0x0262:
            java.lang.Object r1 = r4.A00
            X.Ptp r1 = (X.C74375Ptp) r1
            if (r1 == 0) goto L_0x02b6
            java.lang.String r1 = r1.B8R()
        L_0x026c:
            if (r0 == 0) goto L_0x0272
            java.lang.String r10 = r0.B8R()
        L_0x0272:
            boolean r1 = X.0qQ.A0K(r1, r10)
            if (r1 != 0) goto L_0x0282
            X.0sa r1 = r8.A03
            boolean r1 = X.C51971G9r.A1b(r1)
            if (r1 == 0) goto L_0x0282
            r4.A00 = r0
        L_0x0282:
            java.lang.Object r0 = r4.A00
            if (r0 == 0) goto L_0x0216
            X.0rm r2 = X.C51965G9l.A11()
            X.Ptp r0 = (X.C74375Ptp) r0
            java.lang.String r1 = r0.B8R()
            r2.A00 = r1
            int r0 = r1.length()
            if (r9 <= r0) goto L_0x0299
            r9 = r0
        L_0x0299:
            java.lang.String r0 = r1.substring(r9)
            X.0qQ.A07(r0)
            X.OnT r0 = new X.OnT
            r0.<init>(r4, r2)
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of(r0)
        L_0x02a9:
            X.0qQ.A07(r1)
            com.google.common.util.concurrent.SettableFuture r0 = r5.A00
            r0.set(r1)
            r6.remove(r5)
            goto L_0x001d
        L_0x02b6:
            r1 = r10
            goto L_0x026c
        L_0x02b8:
            r0 = 0
            goto L_0x025b
        L_0x02ba:
            r0 = r10
            goto L_0x0262
        L_0x02bc:
            java.lang.String r0 = "analyzer"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x02c6:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L_0x02cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71062Oah.A01(X.Oah):void");
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [X.Nhx, X.Npp, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v7, types: [X.Nhx, X.Npp, java.lang.Object] */
    public static final void A02(C71062Oah oah) {
        C69667Npp[] nppArr;
        C71062Oah oah2 = oah;
        GAX gax = oah2.A00;
        if (gax != null && oah2.A02 != null) {
            C70683OGe oGe = oah2.A01;
            List<C68143N2j> list = (List) gax.A03;
            ArrayList A0r = AnonymousClass7TG.A0r(list);
            for (C68143N2j n2j : list) {
                Integer num = n2j.A02;
                String str = n2j.A03;
                if (str != null) {
                    synchronized (oah2) {
                        C70400O5c o5c = oah2.A02;
                        if (o5c != null) {
                            str = 00p.A0g(str, "$USER_FNAME$", o5c.A00, false);
                        }
                        if (oah2.A02 != null) {
                            str = 00p.A0g(str, "$USER_LNAME$", "", false);
                        }
                    }
                    A0r.add(new C68143N2j(num, str, n2j.A04, n2j.A00, n2j.A01));
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
            GAX gax2 = new GAX((Integer) gax.A05, (Integer) gax.A04, (List) A0r, gax.A02, gax.A01);
            oGe.A00 = gax2;
            Lock lock = oGe.A04;
            lock.lock();
            Object obj = gax2.A05;
            Object obj2 = AnonymousClass05K.A01;
            if (obj == obj2) {
                nppArr = new C69667Npp[]{new C69246Ni0(), new C69245Nhz()};
            } else {
                nppArr = new C69667Npp[]{new C69246Ni0(), new C69245Nhz(), new C69244Nhy()};
            }
            ? obj3 = new Object();
            obj3.A00 = Arrays.asList(nppArr);
            oGe.A01 = obj3;
            List list2 = (List) gax2.A03;
            if (list2 != null) {
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    C68143N2j n2j2 = (C68143N2j) list2.get(i);
                    if (n2j2 != null) {
                        C69667Npp npp = oGe.A01;
                        if (npp == null) {
                            0qQ.A0F("analyzer");
                            throw AnonymousClass00P.createAndThrow();
                        }
                        Collection A002 = A00(npp, n2j2.A03);
                        OJM ojm = oGe.A02;
                        0qQ.A0A(A002);
                        ojm.A00(n2j2, A002, false);
                        if (obj == AnonymousClass05K.A00 && gax2.A04 == obj2) {
                            C69667Npp[] nppArr2 = {new C69246Ni0(), new C69245Nhz()};
                            ? obj4 = new Object();
                            obj4.A00 = Arrays.asList(nppArr2);
                            Collection A003 = A00(obj4, n2j2.A03);
                            0qQ.A0A(A003);
                            List A0a = 00k.A0a(A003);
                            C69244Nhy nhy = new C69244Nhy();
                            int size2 = A0a.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                Collection A004 = A00(nhy, AnonymousClass7TE.A19(A0a, i2));
                                0qQ.A0A(A004);
                                ojm.A00(n2j2, A004, true);
                            }
                        }
                    }
                }
            }
            lock.unlock();
            A01(oah2);
        }
    }

    public static Collection A00(C69667Npp npp, String str) {
        return npp.A00(Arrays.asList(new String[]{str}));
    }
}
