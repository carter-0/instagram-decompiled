package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class P28 implements AnonymousClass7SA, AnonymousClass7SB, AnonymousClass7SC {
    public AnonymousClass7SD A00;
    public AnonymousClass2Ep A01;
    public final AnonymousClass1aS A02 = 1aF.A00();
    public final UserSession A03;
    public final AnonymousClass9HC A04;
    public final AnonymousClass7ZU A05;
    public final AnonymousClass0t1 A06;
    public final C331797Sk A07;
    public final AnonymousClass9HO A08;
    public final C331617Rr A09;

    public P28(UserSession userSession, AnonymousClass9HO r5, AnonymousClass9HC r6, C331617Rr r7) {
        this.A03 = userSession;
        this.A09 = r7;
        this.A04 = r6;
        this.A08 = r5;
        this.A06 = 0eE.A00(userSession);
        this.A05 = new AnonymousClass7ZU((Map) null, (Map) null, (DefaultConstructorMarker) null, 3);
        this.A07 = (C331797Sk) userSession.A01(C331797Sk.class, new C73918Ply(userSession, 18));
    }

    public final void DRt(List list) {
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, X.7Et] */
    public final void DRu(AnonymousClass7SD r5, List list, long j) {
        AnonymousClass7TF.A1H(r5, list);
        AnonymousClass7ZU r1 = this.A05;
        r1.A01.clear();
        r1.A00.clear();
        ArrayList A012 = A01(list);
        ? obj = new Object();
        obj.A00(0);
        obj.A00(A012.size() - 1);
        A02(obj, A012);
        this.A02.accept(A00(A012));
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, X.7Et] */
    public final void Dva(AnonymousClass7SD r16, Integer num, List list, List list2, List list3) {
        List list4;
        ArrayList arrayList;
        int size;
        ArrayList A0q = AnonymousClass7TF.A0q(r16, 0);
        AnonymousClass1aS r11 = this.A02;
        C61082JwK jwK = (C61082JwK) r11.A0X();
        if (jwK == null || (list4 = (List) jwK.A00) == null) {
            list4 = 0sn.A00;
        }
        List list5 = list;
        if (list != null) {
            arrayList = A01(list5);
        } else {
            arrayList = 0sn.A00;
        }
        ? obj = new Object();
        int i = 0;
        if (arrayList.isEmpty()) {
            A0q.addAll(list4);
        } else {
            if (list4.isEmpty()) {
                A0q.addAll(arrayList);
            } else {
                C327637Bp r14 = ((AnonymousClass7LQ) arrayList.get(DbT.A02(arrayList, 1))).A0F;
                C327637Bp r13 = ((AnonymousClass7LQ) list4.get(0)).A0F;
                long j = r14.A00;
                long j2 = r13.A00;
                if (j == j2) {
                    j = r14.A01;
                    j2 = r13.A01;
                }
                if (0qQ.A01(j, j2) < 0) {
                    A0q.addAll(arrayList);
                    A0q.addAll(list4);
                } else {
                    C327637Bp r142 = ((AnonymousClass7LQ) arrayList.get(0)).A0F;
                    C327637Bp r132 = ((AnonymousClass7LQ) list4.get(DbT.A02(list4, 1))).A0F;
                    long j3 = r142.A00;
                    long j4 = r132.A00;
                    if (j3 == j4) {
                        j3 = r142.A01;
                        j4 = r132.A01;
                    }
                    if (0qQ.A01(j3, j4) > 0) {
                        A0q.addAll(list4);
                        A0q.addAll(arrayList);
                        obj.A00(list4.size());
                        size = list4.size() + A0q.size();
                        obj.A00(size - 1);
                    } else {
                        0f9 AEf = 0wj.A01.AEf("on_update_thread_event_ready_for_UI_error", 20134884);
                        if (AnonymousClass7TE.A1b(arrayList)) {
                            AEf.ABQ("time_stamp_of_last_element_of_filtered_added_message", ((AnonymousClass7LQ) C66582MXn.A0r(arrayList)).A0F.toString());
                            AEf.ABQ("time_stamp_of_first_element_of_filtered_added_message", ((AnonymousClass7LQ) arrayList.get(0)).A0F.toString());
                        }
                        if (AnonymousClass7TE.A1b(list4)) {
                            AEf.ABQ("time_stamp_of_first_element_of_current_message", ((AnonymousClass7LQ) list4.get(0)).A0F.toString());
                            AEf.ABQ("time_stamp_of_last_element_of_current_message", ((AnonymousClass7LQ) C66582MXn.A0r(list4)).A0F.toString());
                        }
                        AEf.report();
                        A0q.addAll(list4);
                        A0q.addAll(arrayList);
                        if (A0q.size() > 1) {
                            C73429PcU.A01(23, A0q);
                        }
                    }
                }
            }
            obj.A00(0);
            size = A0q.size();
            obj.A00(size - 1);
        }
        List list6 = list3;
        if (list3 != null) {
            A01(list6);
        }
        List list7 = list2;
        if (list2 != null) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            Iterator it = A0q.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i < 0) {
                    0sr.A1T();
                    throw AnonymousClass00P.createAndThrow();
                }
                boolean A0u = 00k.A0u(list7, ((AnonymousClass7LQ) next).A0e.A0g());
                if (A0u) {
                    obj.A02(i);
                    if (!(!A0u)) {
                        i = i2;
                    }
                }
                A1C.add(next);
                i = i2;
            }
            A0q = 00k.A0U(A1C);
            Iterator it2 = list7.iterator();
            while (it2.hasNext()) {
                String A18 = AnonymousClass7TE.A18(it2);
                AnonymousClass7ZU r1 = this.A05;
                AnonymousClass7LQ A012 = r1.A01(A18);
                if (A012 != null) {
                    r1.A03(A012);
                }
            }
        }
        A02(obj, A0q);
        r11.accept(A00(A0q));
    }

    public final ArrayList F03(AnonymousClass7SD r10, List list) {
        AnonymousClass7SD r5 = r10;
        0qQ.A0B(r10, 0);
        C254793t3 r1 = r10.A0P;
        if (r1 == null || !AnonymousClass6W3.A08(r1)) {
            throw AnonymousClass7TE.A0z("threadMetadata's threadId is not an open thread id");
        }
        if (!r10.equals(this.A00)) {
            this.A00 = r10;
            this.A01 = C66581MXm.A0a(1bJ.A00(this.A03), C300965yF.A01(r1).A00);
        }
        C331797Sk r12 = this.A07;
        AnonymousClass2Ep r6 = this.A01;
        C331617Rr r7 = this.A09;
        return r12.A00(this.A08, this.A04, (AnonymousClass7SH) OSW.A00.getValue(), r5, r6, r7, list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
        if (X.0qQ.A0K(r1, r0) != false) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.C61082JwK A00(java.util.List r4) {
        /*
            r3 = this;
            X.1aS r0 = r3.A02
            java.lang.Object r0 = r0.A0X()
            X.JwK r0 = (X.C61082JwK) r0
            r2 = 1
            r1 = 0
            if (r0 == 0) goto L_0x0018
            boolean r0 = r0.A01
            if (r0 != r2) goto L_0x0018
        L_0x0010:
            r1 = 22
            X.JwK r0 = new X.JwK
            r0.<init>((int) r1, (boolean) r2, (java.util.List) r4)
            return r0
        L_0x0018:
            X.2Ep r0 = r3.A01
            if (r0 == 0) goto L_0x0045
            boolean r0 = r0.CKK()
            if (r0 != 0) goto L_0x0045
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0010
            java.lang.Object r0 = r4.get(r1)
            X.7LQ r0 = (X.AnonymousClass7LQ) r0
            X.3su r0 = r0.A0e
            java.lang.String r1 = r0.A0g()
            X.2Ep r0 = r3.A01
            if (r0 == 0) goto L_0x0043
            java.lang.String r0 = r0.C6P()
        L_0x003c:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0045
            goto L_0x0010
        L_0x0043:
            r0 = 0
            goto L_0x003c
        L_0x0045:
            r2 = 0
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P28.A00(java.util.List):X.JwK");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005d, code lost:
        if (r6.A1O() != false) goto L_0x005f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A02(X.C328427Et r12, java.util.List r13) {
        /*
            r11 = this;
            X.0eP r1 = r12.A00
            if (r1 == 0) goto L_0x0072
            java.lang.Object r0 = r1.A00
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0072
            java.lang.Object r1 = r1.A01
            java.lang.Number r1 = (java.lang.Number) r1
            if (r1 == 0) goto L_0x0072
            r2 = 0
            int r0 = r0.intValue()
            int r1 = r1.intValue()
            int r0 = r0 + -1
            int r4 = java.lang.Math.max(r0, r2)
            int r1 = r1 + 1
            int r0 = r13.size()
            int r3 = java.lang.Math.min(r1, r0)
            if (r4 > r3) goto L_0x0072
        L_0x002b:
            java.lang.Object r2 = X.00k.A0O(r13, r4)
            X.7LQ r2 = (X.AnonymousClass7LQ) r2
            if (r2 == 0) goto L_0x006b
            X.3su r6 = r2.A0e
            X.0qQ.A07(r6)
            int r0 = r4 + 1
            java.lang.Object r0 = X.00k.A0O(r13, r0)
            X.7LQ r0 = (X.AnonymousClass7LQ) r0
            if (r0 == 0) goto L_0x0070
            X.3su r7 = r0.A0e
        L_0x0044:
            X.7Bu r8 = X.C66582MXn.A0e(r6)
            X.0t1 r0 = r11.A06
            com.instagram.user.model.User r0 = r0.A00()
            com.instagram.direct.model.messaginguser.MessagingUser r5 = com.instagram.direct.model.messaginguser.MessagingUser.A00(r0)
            boolean r0 = r6.A1N()
            if (r0 != 0) goto L_0x005f
            boolean r0 = r6.A1O()
            r9 = 0
            if (r0 == 0) goto L_0x0060
        L_0x005f:
            r9 = 1
        L_0x0060:
            r10 = 1
            int r1 = X.C328487Ez.A00(r5, r6, r7, r8, r9, r10)
            int r0 = r2.A00
            if (r0 == r1) goto L_0x006b
            r2.A00 = r1
        L_0x006b:
            if (r4 == r3) goto L_0x0072
            int r4 = r4 + 1
            goto L_0x002b
        L_0x0070:
            r7 = 0
            goto L_0x0044
        L_0x0072:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P28.A02(X.7Et, java.util.List):void");
    }

    private final ArrayList A01(List list) {
        C254763t0 r0;
        C254793t3 r02;
        ArrayList A1C = AnonymousClass7TE.A1C();
        ArrayList<AnonymousClass7LQ> A1C2 = AnonymousClass7TE.A1C();
        for (Object next : list) {
            DbV.A1U(next, A1C2, ((AnonymousClass7LQ) next).A0e.A2D ? 1 : 0);
        }
        ArrayList A0r = AnonymousClass7TG.A0r(A1C2);
        for (AnonymousClass7LQ r6 : A1C2) {
            C254703su r7 = r6.A0e;
            0qQ.A07(r7);
            AnonymousClass7ZU r3 = this.A05;
            AnonymousClass7LQ A002 = r3.A00(r7);
            if (A002 != null) {
                C254703su r2 = A002.A0e;
                0qQ.A07(r2);
                if (!r2.equals(r7)) {
                    UserSession userSession = this.A03;
                    AnonymousClass7SD r03 = this.A00;
                    if (r03 == null || (r02 = r03.A0P) == null) {
                        r0 = null;
                    } else {
                        r0 = C300965yF.A02(r02);
                    }
                    r2.A10(userSession, r7, r0);
                }
                String A0g = r7.A0g();
                if (A0g != null) {
                    if (A0g.length() != 0) {
                        if (r3.A01.containsKey(A0g)) {
                        }
                    }
                }
                A0r.add(C60340gF.A00);
            } else {
                A1C.add(r6);
            }
            r3.A02(r6);
            A0r.add(C60340gF.A00);
        }
        return A1C;
    }
}
