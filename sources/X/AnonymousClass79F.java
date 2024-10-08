package X;

import android.graphics.PointF;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.79F  reason: invalid class name */
public final class AnonymousClass79F {
    public static final AnonymousClass79F A00 = new Object();

    /* JADX WARNING: type inference failed for: r7v3, types: [X.79G, X.79H] */
    public static final AnonymousClass79G A02(PointF pointF, UserSession userSession, AnonymousClass9HC r17, C329967Kx r18, 2FW r19, 17i r20, Long l, String str, String str2, String str3, String str4, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        ImageUrl imageUrl;
        17i r6 = r20;
        0qQ.A0B(r6, 1);
        List<C2607246u> list2 = list;
        0qQ.A0B(list2, 2);
        2FW r14 = r19;
        0qQ.A0B(r14, 12);
        boolean z5 = z;
        AnonymousClass9HC r11 = r17;
        boolean z6 = z2;
        UserSession userSession2 = userSession;
        C329967Kx r13 = r18;
        Long l2 = l;
        String str5 = str3;
        String str6 = str4;
        if (z3) {
            List list3 = 0sn.A00;
            0qQ.A0B(list3, 1);
            return new AnonymousClass79H((PointF) null, userSession2, (ImageUrl) null, r11, (C2607246u) null, r13, r14, (MessageIdentifier) null, l2, "", str5, (String) null, str6, (String) null, list3, list3, 0Yt.A0E(), 0, z5, z6, false, !list2.isEmpty(), z4);
        }
        HashMap hashMap = new HashMap();
        for (C2607246u r1 : list2) {
            User A02 = r6.A02(r1.A00());
            String str7 = r1.A02;
            if (A02 == null || str7 == null) {
                0wb.A04("DirectReactionsMessagePillModelGenerator", "user in reaction list not in cache", 1);
            } else if (hashMap.containsKey(str7)) {
                List list4 = (List) hashMap.get(str7);
                if (list4 != null) {
                    list4.add(A02.getId());
                }
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(A02.getId());
                hashMap.put(str7, arrayList);
            }
        }
        HashMap hashMap2 = new HashMap();
        for (C2607246u r12 : list2) {
            User A022 = r6.A02(r12.A00());
            String A002 = r12.A00();
            if (A022 != null) {
                imageUrl = A022.Bh3();
            } else {
                imageUrl = null;
            }
            hashMap2.put(A002, imageUrl);
        }
        AnonymousClass79F r7 = A00;
        MessageIdentifier messageIdentifier = null;
        String str8 = str;
        if (str != null) {
            messageIdentifier = new MessageIdentifier(str8, (String) null);
        }
        return r7.A03(pointF, userSession2, r11, r13, r14, messageIdentifier, l2, str2, str5, str6, list2, hashMap, hashMap2, z5, z6, z4);
    }

    /* JADX WARNING: type inference failed for: r13v1, types: [X.79G, X.79H] */
    /* JADX WARNING: type inference failed for: r13v2, types: [X.79G, X.79H] */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x009a, code lost:
        if (r10.size() > 1) goto L_0x009c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass79G A03(android.graphics.PointF r38, com.instagram.common.session.UserSession r39, X.AnonymousClass9HC r40, X.C329967Kx r41, X.2FW r42, com.instagram.model.direct.messageid.MessageIdentifier r43, java.lang.Long r44, java.lang.String r45, java.lang.String r46, java.lang.String r47, java.util.List r48, java.util.Map r49, java.util.Map r50, boolean r51, boolean r52, boolean r53) {
        /*
            r37 = this;
            r3 = 0
            r1 = 1
            r9 = r48
            X.0qQ.A0B(r9, r1)
            r0 = 2
            r4 = r49
            X.0qQ.A0B(r4, r0)
            r13 = 3
            r11 = r50
            X.0qQ.A0B(r11, r13)
            r0 = 7
            r5 = r47
            X.0qQ.A0B(r5, r0)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Set r0 = r4.keySet()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r0)
            boolean r0 = r10.isEmpty()
            java.lang.String r8 = ""
            r36 = r53
            r17 = r40
            r33 = r52
            r15 = r39
            r32 = r51
            r14 = r38
            r19 = r41
            r20 = r42
            r21 = r43
            r22 = r44
            r25 = r45
            r24 = r46
            if (r0 == 0) goto L_0x0079
            X.0sn r2 = X.0sn.A00
            X.46u r18 = A01(r5, r9)
            X.46u r0 = A00(r5, r9)
            if (r0 == 0) goto L_0x0077
            com.instagram.model.mediasize.ExtendedImageUrl r0 = r0.A00
        L_0x005a:
            r27 = 0
            X.0qQ.A0B(r2, r1)
            X.79G r13 = new X.79G
            r26 = r5
            r28 = r2
            r29 = r2
            r30 = r4
            r31 = r3
            r34 = r3
            r35 = r3
            r23 = r8
            r16 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            return r13
        L_0x0077:
            r0 = 0
            goto L_0x005a
        L_0x0079:
            int r0 = r10.size()
            if (r0 != r1) goto L_0x00d6
            java.lang.Object r2 = r10.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            X.0qQ.A0A(r2)
            r7.add(r2)
            java.lang.Object r10 = r4.get(r2)
            if (r10 == 0) goto L_0x00ce
            java.util.List r10 = (java.util.List) r10
            if (r51 != 0) goto L_0x009c
            int r0 = r10.size()
            r12 = 0
            if (r0 <= r1) goto L_0x009d
        L_0x009c:
            r12 = 1
        L_0x009d:
            boolean r0 = r10.contains(r5)
            if (r0 != 0) goto L_0x00a4
            r2 = 0
        L_0x00a4:
            if (r12 == 0) goto L_0x0188
            int r12 = r10.size()
            if (r12 <= r13) goto L_0x00ad
            r12 = 3
        L_0x00ad:
            if (r0 == 0) goto L_0x00bb
            int r0 = r10.indexOf(r5)
            if (r0 <= 0) goto L_0x00bb
            r10.remove(r5)
            r10.add(r3, r5)
        L_0x00bb:
            r1 = 0
        L_0x00bc:
            if (r1 >= r12) goto L_0x0167
            java.lang.Object r0 = r10.get(r1)
            java.lang.Object r0 = r11.get(r0)
            if (r0 == 0) goto L_0x00cb
            r6.add(r0)
        L_0x00cb:
            int r1 = r1 + 1
            goto L_0x00bc
        L_0x00ce:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00d6:
            java.util.Set r0 = r4.keySet()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r0)
            X.PcO r0 = new X.PcO
            r0.<init>(r4)
            X.01V.A1D(r12, r0)
            int r11 = r12.size()
            if (r11 <= r13) goto L_0x00ee
            r11 = 3
        L_0x00ee:
            r2 = 0
        L_0x00ef:
            if (r2 >= r11) goto L_0x00fb
            java.lang.Object r0 = r12.get(r2)
            r7.add(r0)
            int r2 = r2 + 1
            goto L_0x00ef
        L_0x00fb:
            java.util.Set r0 = r4.entrySet()
            java.util.Iterator r11 = r0.iterator()
        L_0x0103:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x015e
            java.lang.Object r2 = r11.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r0 = r2.getValue()
            java.util.List r0 = (java.util.List) r0
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L_0x0103
            java.lang.Object r2 = r2.getKey()
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x013a
            int r0 = r2.length()
            if (r0 == 0) goto L_0x013a
            boolean r0 = r7.contains(r2)
            if (r0 != 0) goto L_0x013a
            int r0 = r7.size()
            int r0 = r0 - r1
            r7.remove(r0)
            r7.add(r2)
        L_0x013a:
            java.util.Iterator r1 = r10.iterator()
            X.0qQ.A07(r1)
            r31 = 0
        L_0x0143:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0160
            java.lang.Object r0 = r1.next()
            java.lang.Object r0 = r4.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x015c
            int r0 = r0.size()
        L_0x0159:
            int r31 = r31 + r0
            goto L_0x0143
        L_0x015c:
            r0 = 0
            goto L_0x0159
        L_0x015e:
            r2 = 0
            goto L_0x013a
        L_0x0160:
            if (r31 <= 0) goto L_0x018a
            java.lang.String r8 = java.lang.String.valueOf(r31)
            goto L_0x018a
        L_0x0167:
            int r1 = r10.size()
            int r0 = r6.size()
            if (r1 <= r0) goto L_0x0188
            int r1 = r10.size()
            int r0 = r6.size()
            int r1 = r1 - r0
            java.lang.String r0 = java.lang.String.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "+%s"
            java.lang.String r8 = X.0mp.A06(r0, r1)
        L_0x0188:
            r31 = 0
        L_0x018a:
            X.46u r18 = A01(r5, r9)
            X.46u r0 = A00(r5, r9)
            if (r0 == 0) goto L_0x01b2
            com.instagram.model.mediasize.ExtendedImageUrl r1 = r0.A00
        L_0x0196:
            r0 = 6
            X.0qQ.A0B(r8, r0)
            X.79G r13 = new X.79G
            r26 = r5
            r27 = r2
            r28 = r7
            r29 = r6
            r30 = r4
            r34 = r3
            r35 = r3
            r23 = r8
            r16 = r1
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            return r13
        L_0x01b2:
            r1 = 0
            goto L_0x0196
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass79F.A03(android.graphics.PointF, com.instagram.common.session.UserSession, X.9HC, X.7Kx, X.2FW, com.instagram.model.direct.messageid.MessageIdentifier, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.Map, java.util.Map, boolean, boolean, boolean):X.79G");
    }

    public static final C2607246u A00(String str, List list) {
        long j;
        Iterator it = list.iterator();
        C2607246u r7 = null;
        long j2 = 0;
        while (it.hasNext()) {
            C2607246u r6 = (C2607246u) it.next();
            boolean A0K = 0qQ.A0K(r6.A00(), str);
            if (r6.A00 != null) {
                Long l = r6.A01;
                if (l != null) {
                    j = l.longValue();
                } else if (A0K) {
                    return r6;
                } else {
                    j = 0;
                }
                if (j > j2) {
                    if (l != null) {
                        j2 = l.longValue();
                    } else {
                        j2 = 0;
                    }
                    r7 = r6;
                }
            }
        }
        return r7;
    }

    public static final C2607246u A01(String str, List list) {
        long j;
        Iterator it = list.iterator();
        C2607246u r7 = null;
        long j2 = 0;
        while (it.hasNext()) {
            C2607246u r6 = (C2607246u) it.next();
            boolean A0K = 0qQ.A0K(r6.A00(), str);
            String str2 = r6.A04;
            if (str2 != null && str2.equals(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT)) {
                Long l = r6.A01;
                if (l != null) {
                    j = l.longValue();
                } else if (A0K) {
                    return r6;
                } else {
                    j = 0;
                }
                if (j > j2) {
                    if (l != null) {
                        j2 = l.longValue();
                    } else {
                        j2 = 0;
                    }
                    r7 = r6;
                }
            }
        }
        return r7;
    }
}
