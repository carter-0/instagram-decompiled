package X;

import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.List;

/* renamed from: X.5gf  reason: invalid class name and case insensitive filesystem */
public abstract class C291165gf {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: com.instagram.user.model.User} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: com.instagram.user.model.User} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.instagram.user.model.User} */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005e, code lost:
        if (r3.length() == 0) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0060, code lost:
        r3 = X.AnonymousClass50n.A00(r6, r8, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0064, code lost:
        r1 = (com.instagram.user.model.User) X.00k.A0N(r5.A0B);
        r15 = r26;
        r7 = r27;
        r6 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0072, code lost:
        if (r1 == null) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0076, code lost:
        if (r5.A0C == false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0078, code lost:
        r1.getId();
        r0 = java.util.Collections.unmodifiableList(r5.A0B);
        X.0qQ.A07(r0);
        r1 = (com.instagram.user.model.User) r0.get(0);
        r0 = r1.A03.BAq();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0090, code lost:
        if (r0 == null) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0096, code lost:
        if (r0.booleanValue() != false) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0098, code lost:
        r0 = r1.A03.Avp();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009e, code lost:
        if (r0 == null) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a4, code lost:
        if (r0.booleanValue() == false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ab, code lost:
        r14 = X.C66662MaV.A00(r5.A09, r4);
        r2 = r5.A0C;
        r11 = r5.A04;
        r21 = r3;
        r17 = r7;
        r8 = new com.instagram.model.direct.DirectShareTarget((com.instagram.direct.model.thread.ChannelsContextLine) null, r5.A03, r11, r5.A05, (X.2EN) null, r14, r15, java.lang.Boolean.valueOf(r5.A0D), r17, (java.lang.Integer) null, java.lang.Integer.valueOf(r5.A01), java.lang.Integer.valueOf(r5.A00), r21, (java.lang.String) null, r5.A06, (java.lang.String) null, r6, r4, r2, r5.A0H);
        r0 = r5.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ec, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ee, code lost:
        r8.A0H = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00f2, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f3, code lost:
        if (r3 != null) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return A01(r1, r15, r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return r8;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.instagram.model.direct.DirectShareTarget A00(X.AnonymousClass2hV r23, X.C290915gD r24, com.instagram.common.session.UserSession r25, java.lang.Boolean r26, java.lang.Double r27, java.lang.String r28) {
        /*
            r2 = 0
            r5 = r24
            X.0qQ.A0B(r5, r2)
            r7 = 1
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List r0 = r5.A0B
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            X.0qQ.A07(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x0019:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0038
            java.lang.Object r1 = r3.next()
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            r6 = r23
            if (r23 == 0) goto L_0x0034
            java.lang.String r0 = r1.getId()
            java.lang.Object r0 = r6.apply(r0)
            if (r0 == 0) goto L_0x0034
            r1 = r0
        L_0x0034:
            r4.add(r1)
            goto L_0x0019
        L_0x0038:
            java.util.ArrayList r4 = X.AnonymousClass48M.A01(r4)
            android.content.Context r6 = X.C60960kU.A00
            X.0qQ.A07(r6)
            java.lang.String r3 = r5.A0A
            r8 = r25
            java.lang.String r1 = X.AnonymousClass50n.A00(r6, r8, r4)
            X.0qQ.A07(r1)
            int r0 = r4.size()
            if (r0 <= r7) goto L_0x00f3
            boolean r0 = r1.equals(r3)
            if (r0 == 0) goto L_0x00f3
            java.lang.String r3 = ""
        L_0x005a:
            int r0 = r3.length()
            if (r0 != 0) goto L_0x0064
        L_0x0060:
            java.lang.String r3 = X.AnonymousClass50n.A00(r6, r8, r4)
        L_0x0064:
            java.util.List r0 = r5.A0B
            java.lang.Object r1 = X.00k.A0N(r0)
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            r15 = r26
            r7 = r27
            r6 = r28
            if (r1 == 0) goto L_0x00ab
            boolean r0 = r5.A0C
            if (r0 == 0) goto L_0x00ab
            r1.getId()
            java.util.List r0 = r5.A0B
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            X.0qQ.A07(r0)
            java.lang.Object r1 = r0.get(r2)
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            X.4Cl r0 = r1.A03
            java.lang.Boolean r0 = r0.BAq()
            if (r0 == 0) goto L_0x0098
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00a6
        L_0x0098:
            X.4Cl r0 = r1.A03
            java.lang.Boolean r0 = r0.Avp()
            if (r0 == 0) goto L_0x00ab
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00ab
        L_0x00a6:
            com.instagram.model.direct.DirectShareTarget r8 = A01(r1, r15, r7, r6)
        L_0x00aa:
            return r8
        L_0x00ab:
            java.lang.String r0 = r5.A09
            X.3t1 r14 = X.C66662MaV.A00(r0, r4)
            boolean r2 = r5.A0C
            r9 = 0
            com.instagram.direct.model.thread.CreatorSubscriberThreadInfo r11 = r5.A04
            com.instagram.direct.model.thread.CreatorBroadcastThreadInfo r10 = r5.A03
            com.instagram.direct.model.thread.DiscoverableThreadInfo r12 = r5.A05
            java.lang.String r1 = r5.A06
            boolean r0 = r5.A0D
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r0)
            int r0 = r5.A01
            java.lang.Integer r19 = java.lang.Integer.valueOf(r0)
            int r0 = r5.A00
            java.lang.Integer r20 = java.lang.Integer.valueOf(r0)
            boolean r0 = r5.A0H
            com.instagram.model.direct.DirectShareTarget r8 = new com.instagram.model.direct.DirectShareTarget
            r13 = r9
            r18 = r9
            r22 = r9
            r23 = r1
            r24 = r9
            r25 = r6
            r26 = r4
            r27 = r2
            r28 = r0
            r21 = r3
            r17 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            com.instagram.direct.model.thread.ChannelsContextLine r0 = r5.A02
            if (r0 == 0) goto L_0x00aa
            java.lang.String r0 = r0.A00
            r8.A0H = r0
            return r8
        L_0x00f3:
            if (r3 == 0) goto L_0x0060
            goto L_0x005a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C291165gf.A00(X.2hV, X.5gD, com.instagram.common.session.UserSession, java.lang.Boolean, java.lang.Double, java.lang.String):com.instagram.model.direct.DirectShareTarget");
    }

    public static final DirectShareTarget A01(User user, Boolean bool, Double d, String str) {
        Boolean Avp;
        List singletonList = Collections.singletonList(new PendingRecipient(user));
        0qQ.A07(singletonList);
        Boolean BAq = user.A03.BAq();
        Boolean bool2 = bool;
        Double d2 = d;
        if ((BAq == null || !BAq.booleanValue()) && ((Avp = user.A03.Avp()) == null || !Avp.booleanValue())) {
            return new DirectShareTarget(new C291175gg(singletonList), bool2, d, AnonymousClass50n.A07(user), singletonList, true);
        }
        List singletonList2 = Collections.singletonList(OXK.A00((AnonymousClass170) singletonList.get(0)));
        0qQ.A07(singletonList2);
        return new DirectShareTarget((2EN) null, new PIO(C254923tH.ACT, singletonList2), bool2, d2, AnonymousClass50n.A07(user), str, singletonList, true, true);
    }
}
