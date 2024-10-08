package X;

import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.7UH  reason: invalid class name */
public final class AnonymousClass7UH {
    public final int A00;
    public final 02m A01;
    public final UserSession A02;
    public final Map A03 = new LinkedHashMap();
    public final Set A04;
    public final 14i A05;
    public final C61110lV A06;

    public AnonymousClass7UH(02m r4, 14i r5, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r5, 3);
        this.A02 = userSession;
        this.A01 = r4;
        this.A05 = r5;
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        0qQ.A07(newSetFromMap);
        this.A04 = newSetFromMap;
        this.A00 = 182.A06(0Tu.A05, userSession, 2342167042284859074L) ? 20134487 : 20122678;
        this.A06 = new AnonymousClass7UI(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0088, code lost:
        if (X.182.A06(X.0Tu.A05, r2.A02, 36315146783951902L) == false) goto L_0x008a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C254923tH r19, X.C254783t2 r20, java.lang.Boolean r21, java.lang.Boolean r22, java.lang.Integer r23, java.lang.Integer r24, java.lang.String r25, java.util.Map r26, java.util.Map r27) {
        /*
            r18 = this;
            r7 = 0
            r3 = r25
            X.0qQ.A0B(r3, r7)
            r9 = 1
            r6 = 2
            r8 = r19
            X.0qQ.A0B(r8, r6)
            int r14 = r3.hashCode()
            r2 = r18
            java.util.Set r4 = r2.A04
            boolean r0 = r4.contains(r3)
            r5 = 3
            if (r0 == 0) goto L_0x0037
            X.02m r7 = r2.A01
            int r6 = r2.A00
            java.lang.String r1 = "error"
            r0 = 2993(0xbb1, float:4.194E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r7.markerAnnotate(r6, r14, r1, r0)
            r7.markerEnd(r6, r14, r5)
            r4.remove(r3)
            X.0lV r0 = r2.A06
            X.14i.A06(r0)
            return
        L_0x0037:
            X.02m r12 = r2.A01
            int r13 = r2.A00
            r12.markerStart(r13, r14)
            int r1 = r23.intValue()
            switch(r1) {
                case 0: goto L_0x00dc;
                case 1: goto L_0x00fc;
                case 2: goto L_0x00f8;
                case 3: goto L_0x00f4;
                case 4: goto L_0x00f0;
                case 5: goto L_0x00ec;
                case 6: goto L_0x00e8;
                case 7: goto L_0x00e4;
                case 8: goto L_0x00e0;
                default: goto L_0x0045;
            }
        L_0x0045:
            java.lang.String r0 = "ephemeral_video"
        L_0x0047:
            java.lang.String r10 = "message_type"
            r12.markerAnnotate(r13, r14, r10, r0)
            java.lang.String r10 = r8.A00
            java.lang.String r0 = "transport_type"
            r12.markerAnnotate(r13, r14, r0, r10)
            r0 = 941(0x3ad, float:1.319E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r12.markerAnnotate(r13, r14, r0, r3)
            java.lang.String r0 = "is_mixvm"
            r10 = r26
            java.lang.Object r0 = r10.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x00da
            boolean r11 = r0.booleanValue()
        L_0x006c:
            X.3tH r0 = X.C254923tH.ACT
            if (r8 != r0) goto L_0x0090
            if (r1 == r7) goto L_0x00c2
            if (r1 == r6) goto L_0x00b8
            if (r1 == r5) goto L_0x00cc
            if (r1 != r9) goto L_0x008a
            if (r11 != 0) goto L_0x008a
            com.instagram.common.session.UserSession r6 = r2.A02
            X.0Tu r5 = X.0Tu.A05
            r0 = 36315146783951902(0x81046f00060c1e, double:3.0291832833055413E-306)
            boolean r1 = X.182.A06(r5, r6, r0)
            r0 = 1
            if (r1 != 0) goto L_0x008b
        L_0x008a:
            r0 = 0
        L_0x008b:
            java.lang.String r1 = "is_tangerine"
            r12.markerAnnotate(r13, r14, r1, r0)
        L_0x0090:
            java.util.Set r0 = r10.entrySet()
            java.util.Iterator r5 = r0.iterator()
        L_0x0098:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0100
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r12.markerAnnotate(r13, r14, r1, r0)
            goto L_0x0098
        L_0x00b8:
            com.instagram.common.session.UserSession r6 = r2.A02
            X.0Tu r5 = X.0Tu.A05
            r0 = 36315146783755291(0x81046f00030c1b, double:3.029183283181204E-306)
            goto L_0x00d5
        L_0x00c2:
            com.instagram.common.session.UserSession r6 = r2.A02
            X.0Tu r5 = X.0Tu.A05
            r0 = 36315146783558682(0x81046f00000c1a, double:3.0291832830568674E-306)
            goto L_0x00d5
        L_0x00cc:
            com.instagram.common.session.UserSession r6 = r2.A02
            X.0Tu r5 = X.0Tu.A05
            r0 = 36315146783820828(0x81046f00040c1c, double:3.0291832832226496E-306)
        L_0x00d5:
            boolean r0 = X.182.A06(r5, r6, r0)
            goto L_0x008b
        L_0x00da:
            r11 = 0
            goto L_0x006c
        L_0x00dc:
            java.lang.String r0 = "text"
            goto L_0x0047
        L_0x00e0:
            java.lang.String r0 = "ephemeral_photo"
            goto L_0x0047
        L_0x00e4:
            java.lang.String r0 = "collection"
            goto L_0x0047
        L_0x00e8:
            java.lang.String r0 = "sticker"
            goto L_0x0047
        L_0x00ec:
            java.lang.String r0 = "gif"
            goto L_0x0047
        L_0x00f0:
            java.lang.String r0 = "reaction"
            goto L_0x0047
        L_0x00f4:
            java.lang.String r0 = "video"
            goto L_0x0047
        L_0x00f8:
            java.lang.String r0 = "photo"
            goto L_0x0047
        L_0x00fc:
            java.lang.String r0 = "audio"
            goto L_0x0047
        L_0x0100:
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            java.util.Set r0 = r27.entrySet()
            java.util.Iterator r7 = r0.iterator()
        L_0x010d:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x012b
            java.lang.Object r5 = r7.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r0 = r5.getValue()
            if (r0 == 0) goto L_0x010d
            java.lang.Object r1 = r5.getKey()
            java.lang.Object r0 = r5.getValue()
            r6.put(r1, r0)
            goto L_0x010d
        L_0x012b:
            java.util.Set r0 = r6.entrySet()
            java.util.Iterator r1 = r0.iterator()
        L_0x0133:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x015d
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r15 = r0.getKey()
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0155
            long r16 = r0.longValue()
            r12.markerAnnotate(r13, r14, r15, r16)
            goto L_0x0133
        L_0x0155:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x015d:
            if (r21 == 0) goto L_0x0168
            boolean r1 = r21.booleanValue()
            java.lang.String r0 = "is_group"
            r12.markerAnnotate(r13, r14, r0, r1)
        L_0x0168:
            if (r22 == 0) goto L_0x0173
            boolean r1 = r22.booleanValue()
            java.lang.String r0 = "is_instamadillo"
            r12.markerAnnotate(r13, r14, r0, r1)
        L_0x0173:
            if (r24 == 0) goto L_0x0187
            int r1 = r24.intValue()
            java.lang.String r0 = "thread_type_value"
            r12.markerAnnotate(r13, r14, r0, r1)
            java.lang.String r1 = X.AnonymousClass48O.A00(r1)
            java.lang.String r0 = "thread_type_str"
            r12.markerAnnotate(r13, r14, r0, r1)
        L_0x0187:
            if (r20 == 0) goto L_0x01a3
            java.lang.String r1 = X.AnonymousClass4KK.A02(r20)
            if (r1 == 0) goto L_0x0194
            java.lang.String r0 = "open_thread_id"
            r12.markerAnnotate(r13, r14, r0, r1)
        L_0x0194:
            java.lang.Long r0 = X.AnonymousClass4KK.A01(r20)
            if (r0 == 0) goto L_0x01a3
            long r16 = r0.longValue()
            java.lang.String r15 = "occamadillo_thread_id"
            r12.markerAnnotate(r13, r14, r15, r16)
        L_0x01a3:
            if (r24 == 0) goto L_0x01bf
            boolean r0 = X.AnonymousClass48O.A06(r24)
            if (r0 != r9) goto L_0x01bf
            com.instagram.common.session.UserSession r0 = r2.A02
            X.7TN r6 = X.AnonymousClass7TM.A00(r0)
            java.lang.String r5 = X.C395299zX.A00(r23)
            r1 = 40
            X.Phj r0 = new X.Phj
            r0.<init>(r5, r6, r1)
            X.AnonymousClass7TN.A00(r6, r0)
        L_0x01bf:
            r4.add(r3)
            X.0lV r1 = r2.A06
            X.15Y r0 = X.15Y.A03
            X.14i.A03(r0, r1)
            r2.A03(r3, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7UH.A00(X.3tH, X.3t2, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.String, java.util.Map, java.util.Map):void");
    }

    public final void A01(String str) {
        0qQ.A0B(str, 0);
        Set set = this.A04;
        if (set.contains(str)) {
            A04(str, false);
            this.A01.markerEnd(this.A00, str.hashCode(), 2);
            set.remove(str);
            this.A03.remove(str);
            14i.A06(this.A06);
        }
    }

    public final void A03(String str, boolean z) {
        String str2;
        0qQ.A0B(str, 0);
        if (this.A04.contains(str)) {
            if (182.A06(0Tu.A05, this.A02, 36314459588856376L)) {
                02m r4 = this.A01;
                int i = this.A00;
                int hashCode = str.hashCode();
                if (z) {
                    str2 = "_start";
                } else {
                    str2 = "_end";
                }
                r4.markerPoint(i, hashCode, 002.A0R("transport_message_to_send_service", str2));
            }
        }
    }

    public final void A04(String str, boolean z) {
        String str2;
        0qQ.A0B(str, 0);
        if (this.A04.contains(str)) {
            if (182.A06(0Tu.A05, this.A02, 36314459588856376L)) {
                02m r4 = this.A01;
                int i = this.A00;
                int hashCode = str.hashCode();
                String A002 = C66579MXk.A00(1138);
                if (z) {
                    str2 = "_start";
                } else {
                    str2 = "_end";
                }
                r4.markerPoint(i, hashCode, 002.A0R(A002, str2));
            }
        }
    }

    public final void A05(String str, boolean z) {
        String str2;
        0qQ.A0B(str, 0);
        if (this.A04.contains(str)) {
            if (182.A06(0Tu.A05, this.A02, 36314459588856376L)) {
                02m r4 = this.A01;
                int i = this.A00;
                int hashCode = str.hashCode();
                String A002 = C66579MXk.A00(1125);
                if (z) {
                    str2 = "_start";
                } else {
                    str2 = "_end";
                }
                r4.markerPoint(i, hashCode, 002.A0R(A002, str2));
            }
        }
    }

    public final void A02(String str, String str2) {
        int i;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        02m r2 = this.A01;
        int i2 = this.A00;
        r2.markerAnnotate(i2, i, "error", str2);
        r2.markerEnd(i2, i, 3);
        14i.A06(this.A06);
    }
}
