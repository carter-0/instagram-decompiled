package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* renamed from: X.Od7  reason: case insensitive filesystem */
public final class C71114Od7 {
    public static final C71114Od7 A00 = new Object();

    public static final List A02(String str, List list, 0sP r7) {
        int i;
        int i2 = -1;
        if (str != null) {
            ListIterator A18 = C51968G9o.A18(list);
            while (true) {
                if (A18.hasPrevious()) {
                    if (0qQ.A0K(r7.invoke(A18.previous()), str)) {
                        i2 = A18.nextIndex();
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (i2 == -1) {
            return 00k.A0h(list, 30);
        }
        if (i2 < 14) {
            i = 0;
        } else if (list.size() <= i2 + 15) {
            i = DbT.A02(list, 30);
        } else {
            i = i2 - 14;
        }
        if (list.size() > 30) {
            return list.subList(i, i + 30);
        }
        return list;
    }

    /* JADX WARNING: type inference failed for: r9v3, types: [java.util.List] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List A00(com.instagram.common.session.UserSession r21, X.C69568NoC r22, X.AnonymousClass2Ep r23) {
        /*
            r1 = r21
            r5 = r22
            r0 = r23
            boolean r0 = r0.CVa(r1)
            if (r0 != 0) goto L_0x000f
            X.0sn r4 = X.0sn.A00
        L_0x000e:
            return r4
        L_0x000f:
            X.C370748x0.A00()
            r21 = 0
            X.MdY r3 = X.C66843Mdb.A01(r1)
            r20 = 1
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.lang.Long r19 = r23.C6I()
            X.7Qc r18 = new X.7Qc
            r1 = r18
            r0 = r23
            r1.<init>(r0)
            boolean r0 = r5 instanceof X.NTA
            java.lang.String r2 = "null cannot be cast to non-null type com.instagram.direct.msys.reverb.ReverbMessage"
            if (r0 == 0) goto L_0x0097
            r23.C6I()
            X.NTA r5 = (X.NTA) r5
            java.util.List r0 = r5.A00
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r1 = r0.iterator()
        L_0x0040:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0054
            java.lang.String r0 = X.AnonymousClass7TE.A18(r1)
            java.lang.String r0 = X.C2611348j.A03(r0)
            if (r0 == 0) goto L_0x0040
            r6.add(r0)
            goto L_0x0040
        L_0x0054:
            java.lang.String r9 = r19.toString()
            java.util.List r0 = r5.A01
            r8 = 0
            r13 = 1000(0x3e8, double:4.94E-321)
            r7 = r3
            r10 = r8
            r11 = r6
            r12 = r0
            r15 = r20
            X.0eP r0 = X.C66840MdY.A05(r7, r8, r9, r10, r11, r12, r13, r15)
            java.lang.Object r0 = r0.A00
            X.OAu r0 = (X.C70546OAu) r0
            if (r0 == 0) goto L_0x000e
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x000e
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r5 = r0.iterator()
        L_0x0079:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00e5
            java.lang.Object r1 = r5.next()
            X.0qQ.A0C(r1, r2)
            r0 = r1
            com.instagram.direct.msys.reverb.ReverbMessage r0 = (com.instagram.direct.msys.reverb.ReverbMessage) r0
            java.lang.String r0 = r0.getMessageId()
            boolean r0 = r6.contains(r0)
            if (r0 == 0) goto L_0x0079
            r9.add(r1)
            goto L_0x0079
        L_0x0097:
            boolean r0 = r5 instanceof X.NTB
            if (r0 == 0) goto L_0x01bd
            r23.C6I()
            X.NTB r5 = (X.NTB) r5
            java.lang.String r0 = r5.A01
            int r5 = r5.A00
            if (r0 == 0) goto L_0x00c7
            long r0 = X.C2611348j.A01(r0)
            long r0 = X.AnonymousClass7TE.A0P(r0)
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
        L_0x00b2:
            X.0qQ.A0A(r19)
            long r9 = r19.longValue()
            if (r7 != 0) goto L_0x00c9
            r7 = 0
            r6 = r3
            r8 = r5
            r11 = r20
            java.util.List r9 = X.C66840MdY.A02(r6, r7, r8, r9, r11)
            if (r9 != 0) goto L_0x00e5
            return r4
        L_0x00c7:
            r7 = 0
            goto L_0x00b2
        L_0x00c9:
            r6 = r3
            r8 = r5
            r11 = r20
            java.util.List r1 = X.C66840MdY.A02(r6, r7, r8, r9, r11)
            r11 = r21
            java.util.List r0 = X.C66840MdY.A02(r6, r7, r8, r9, r11)
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            if (r1 == 0) goto L_0x00e0
            r9.addAll(r1)
        L_0x00e0:
            if (r0 == 0) goto L_0x00e5
            r9.addAll(r0)
        L_0x00e5:
            int r17 = r9.size()
            r8 = 0
        L_0x00ea:
            r0 = r17
            if (r8 >= r0) goto L_0x000e
            java.lang.Object r7 = r9.get(r8)
            X.0qQ.A0C(r7, r2)
            com.instagram.direct.msys.reverb.ReverbMessage r7 = (com.instagram.direct.msys.reverb.ReverbMessage) r7
            X.ONE r0 = r3.A02
            r22 = r0
            long r13 = r19.longValue()
            r10 = r0
            r11 = r18
            r12 = r7
            r15 = r21
            X.0eP r0 = r10.A01(r11, r12, r13, r15)
            java.lang.Object r11 = r0.A00
            X.3su r11 = (X.C254703su) r11
            if (r11 == 0) goto L_0x01b9
            boolean r1 = r7.wasDeleted()
            boolean r0 = r11.A2D
            if (r0 == r1) goto L_0x011d
            r11.A2D = r1
            r0 = r20
            r11.A2C = r0
        L_0x011d:
            X.N4L r1 = r11.A0D
            if (r1 == 0) goto L_0x0127
            byte[] r0 = r7.getToplevelPayload()
            r1.A00 = r0
        L_0x0127:
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            com.instagram.model.direct.DirectThreadKey r0 = r23.BJy()
            X.3su r6 = X.C66840MdY.A01(r3, r11, r0)
            java.lang.Object r0 = r7.getSupplementalKeys()
            boolean r0 = r0 instanceof java.util.ArrayList
            if (r0 == 0) goto L_0x01b1
            java.lang.Object r1 = r7.getSupplementalKeys()
            java.lang.String r0 = "null cannot be cast to non-null type java.util.ArrayList<*>"
            X.0qQ.A0C(r1, r0)
            java.util.AbstractCollection r1 = (java.util.AbstractCollection) r1
        L_0x0146:
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r14 = r1.iterator()
        L_0x014e:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x016f
            java.lang.Object r13 = r14.next()
            boolean r0 = r13 instanceof java.lang.String
            if (r0 == 0) goto L_0x014e
            r12 = r13
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L_0x014e
            java.lang.String r1 = "edit:"
            boolean r1 = X.00l.A0d(r12, r1, r15)
            r0 = r20
            if (r1 != r0) goto L_0x014e
            r5.add(r13)
            goto L_0x014e
        L_0x016f:
            int r16 = r5.size()
            r12 = 0
        L_0x0174:
            r0 = r16
            if (r12 >= r0) goto L_0x01b6
            java.lang.Object r13 = r5.get(r12)
            X.DbS.A1Y(r13)
            java.lang.String r13 = (java.lang.String) r13
            r1 = r22
            r0 = r18
            r1.A02(r6, r0, r7, r13)
            long r0 = r7.getTimestampInMsForSupplementalKey(r13)
            com.instagram.model.direct.DirectThreadKey r14 = r23.BJy()
            X.3su r14 = X.C66840MdY.A01(r3, r6, r14)
            java.util.concurrent.TimeUnit r15 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = r15.toMicros(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r14.A1A(r0)
            X.N4L r1 = r14.A0D
            if (r1 == 0) goto L_0x01ab
            byte[] r0 = r7.getPayloadForSupplementalKey(r13)
            r1.A00 = r0
        L_0x01ab:
            r10.add(r14)
            int r12 = r12 + 1
            goto L_0x0174
        L_0x01b1:
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            goto L_0x0146
        L_0x01b6:
            X.AnonymousClass7TF.A1I(r11, r10, r4)
        L_0x01b9:
            int r8 = r8 + 1
            goto L_0x00ea
        L_0x01bd:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71114Od7.A00(com.instagram.common.session.UserSession, X.NoC, X.2Ep):java.util.List");
    }

    public static final void A03(UserSession userSession, AnonymousClass2Ep r6, List list, List list2, Map map) {
        NTA nta = new NTA(list, list2);
        C370748x0.A00();
        0qQ.A0B(userSession, 0);
        C66833MdR.A00(userSession);
        Iterator it = 0sn.A00.iterator();
        while (it.hasNext()) {
            0eP A1A = JTO.A1A(it);
            String A0y = C66580MXl.A0y(A1A.A00);
            if (A0y != null) {
                map.put(A0y, A1A);
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
        Iterator it2 = A00(userSession, nta, r6).iterator();
        while (it2.hasNext()) {
            0eP A1A2 = JTO.A1A(it2);
            String A0y2 = C66580MXl.A0y(A1A2.A00);
            if (A0y2 != null) {
                map.put(A0y2, A1A2);
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
    }

    public static final List A01(AnonymousClass2Ep r2, 2Dm r3) {
        List<Object> BSS = r3.BSS(C71811OrE.A00, r2.BJy(), (String) null);
        if (BSS == null) {
            return 0sn.A00;
        }
        ArrayList A0r = AnonymousClass7TG.A0r(BSS);
        for (Object A1I : BSS) {
            AnonymousClass7TF.A1I(A1I, 0sn.A00, A0r);
        }
        return A0r;
    }
}
