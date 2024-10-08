package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.8xA  reason: invalid class name and case insensitive filesystem */
public final class C370848xA {
    public static volatile C370848xA A00;

    public final void A01(Context context, UserSession userSession, AnonymousClass48S r14, C254763t0 r15, List list, int i) {
        List list2 = list;
        0qQ.A0B(list2, 2);
        UserSession userSession2 = userSession;
        Context context2 = context;
        AnonymousClass48S r6 = r14;
        C254763t0 r7 = r15;
        int i2 = i;
        if (182.A06(0Tu.A05, userSession, 36330170580419066L)) {
            AnonymousClass19S A01 = AnonymousClass1HX.A01(381924220, 3);
            1Eo.A05(19B.A00, new JTw(context2, userSession2, this, r6, r7, list2, (AnonymousClass4D7) null, i2), A01);
            return;
        }
        A00(context, userSession, r14, r15, list2, i2);
    }

    /* JADX WARNING: type inference failed for: r12v3, types: [X.8xB, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v4, types: [X.8xB, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0263, code lost:
        if (r0.length() == 0) goto L_0x0265;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02b2, code lost:
        if (r0 != null) goto L_0x02b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02dc, code lost:
        if (r0 != null) goto L_0x02b4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0234  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.content.Context r21, com.instagram.common.session.UserSession r22, X.AnonymousClass48S r23, X.C254763t0 r24, java.util.List r25, int r26) {
        /*
            r11 = r25
            int r9 = r11.size()
            X.0Tu r3 = X.0Tu.A05
            r0 = 36609940454053830(0x82108c000317c6, double:3.2156119873168315E-306)
            r4 = r22
            long r1 = X.182.A01(r3, r4, r0)
            int r0 = (int) r1
            if (r0 <= 0) goto L_0x001a
            if (r0 <= r9) goto L_0x0019
            r0 = r9
        L_0x0019:
            r9 = r0
        L_0x001a:
            r7 = 0
        L_0x001b:
            if (r7 >= r9) goto L_0x02e2
            java.lang.Object r5 = r11.get(r7)
            X.3su r5 = (X.C254703su) r5
            r20 = r26
            java.lang.Integer r0 = java.lang.Integer.valueOf(r20)
            java.lang.Boolean r0 = r5.A0a(r0)
            boolean r0 = r0.booleanValue()
            r14 = r21
            if (r0 == 0) goto L_0x00e2
            r10 = 0
            X.0qQ.A0B(r4, r10)
            X.A4b r1 = X.C39661A4b.A01
            if (r1 != 0) goto L_0x0044
            X.A4b r1 = new X.A4b
            r1.<init>(r4)
            X.C39661A4b.A01 = r1
        L_0x0044:
            java.lang.String r6 = "direct_thread"
            r8 = 1
            X.0qQ.A0B(r14, r8)
            java.lang.Object r2 = r5.A1T
            boolean r0 = r2 instanceof X.C2609947v
            if (r0 == 0) goto L_0x008f
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.model.DirectVoiceMedia"
            X.0qQ.A0C(r2, r0)
            X.47v r2 = (X.C2609947v) r2
            com.instagram.common.session.UserSession r5 = r1.A00
            r0 = 36330170579501555(0x811219000541f3, double:3.038684392107111E-306)
            boolean r0 = X.182.A06(r3, r5, r0)
            if (r0 == 0) goto L_0x008c
            X.1Xj r2 = r2.A02
            if (r2 == 0) goto L_0x008c
            r0 = 36611645556332791(0x821219000718f7, double:3.216690300863942E-306)
            long r0 = X.182.A01(r3, r5, r0)
            X.3WR r8 = r2.CEL()
            int r2 = (int) r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            X.3vO r1 = new X.3vO
            r1.<init>(r8, r6)
            if (r0 == 0) goto L_0x0085
            int r0 = r2 * 1024
            r1.A02 = r0
        L_0x0085:
            X.3uP r0 = X.C255593uO.A00(r5)
            r0.A01(r1)
        L_0x008c:
            int r7 = r7 + 1
            goto L_0x001b
        L_0x008f:
            boolean r0 = r2 instanceof X.1Xj
            if (r0 == 0) goto L_0x008c
            X.1Xj r2 = (X.1Xj) r2
            if (r2 == 0) goto L_0x008c
            X.1iA r0 = r2.BR7()
            int r0 = r0.ordinal()
            if (r0 == r10) goto L_0x00cc
            if (r0 != r8) goto L_0x008c
            com.instagram.common.session.UserSession r5 = r1.A00
            r0 = 36330170579698165(0x811219000841f5, double:3.038684392231448E-306)
            boolean r0 = X.182.A06(r3, r5, r0)
            if (r0 == 0) goto L_0x008c
            r0 = 36611645556529401(0x821219000a18f9, double:3.216690300988279E-306)
            long r0 = X.182.A01(r3, r5, r0)
            X.3WR r8 = r2.CEL()
            int r2 = (int) r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            X.3vO r1 = new X.3vO
            r1.<init>(r8, r6)
            if (r0 == 0) goto L_0x0085
            r1.A01 = r2
            goto L_0x0085
        L_0x00cc:
            com.instagram.model.mediasize.ExtendedImageUrl r16 = r2.A1n(r14)
            if (r16 == 0) goto L_0x008c
            com.instagram.common.session.UserSession r15 = r1.A00
            r19 = r6
            r17 = r5
            r18 = r2
            X.1OO r0 = X.C70025Nw3.A00(r14, r15, r16, r17, r18, r19, r20)
            r0.A01()
            goto L_0x008c
        L_0x00e2:
            boolean r0 = r5.A1a()
            if (r0 == 0) goto L_0x01e0
            com.google.common.collect.ImmutableList r0 = r5.A0H()
            if (r0 == 0) goto L_0x0145
            java.util.List r2 = X.00k.A0a(r0)
        L_0x00f2:
            java.lang.String r8 = "direct_thread"
            r10 = 0
            r0 = 2
            X.0qQ.A0B(r14, r0)
            r0 = 5
            X.0qQ.A0B(r4, r0)
            r0 = 36328813369900651(0x8110dd00063e6b, double:3.037826087290455E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            r6 = 0
            if (r0 == 0) goto L_0x0148
            r0 = 36611645556726011(0x821219000d18fb, double:3.216690301112616E-306)
            long r0 = X.182.A01(r3, r4, r0)
            int r10 = r2.size()
            int r12 = (int) r0
            if (r10 <= r12) goto L_0x011a
            r10 = r12
        L_0x011a:
            r12 = 0
        L_0x011b:
            if (r12 >= r10) goto L_0x0181
            java.lang.Object r0 = r2.get(r12)
            X.3tC r0 = (X.C254873tC) r0
            com.instagram.model.mediasize.ExtendedImageUrl r13 = r0.A0X
            if (r13 == 0) goto L_0x0142
            long r0 = r0.A0K
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 0
            X.1Xj r18 = X.C70024Nw2.A00(r13, r0, r0, r1)
            if (r18 == 0) goto L_0x0142
            r15 = r4
            r16 = r13
            r17 = r5
            r19 = r8
            X.1OO r0 = X.C70025Nw3.A00(r14, r15, r16, r17, r18, r19, r20)
            r0.A01()
        L_0x0142:
            int r12 = r12 + 1
            goto L_0x011b
        L_0x0145:
            X.0sn r2 = X.0sn.A00
            goto L_0x00f2
        L_0x0148:
            boolean r0 = r2.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0181
            r0 = 36328465477221743(0x81108c00013d6f, double:3.037606078559462E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 == 0) goto L_0x0181
            java.lang.Object r0 = r2.get(r10)
            X.3tC r0 = (X.C254873tC) r0
            com.instagram.model.mediasize.ExtendedImageUrl r10 = r0.A0X
            if (r10 == 0) goto L_0x0181
            long r0 = r0.A0K
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 0
            X.1Xj r16 = X.C70024Nw2.A00(r10, r0, r0, r1)
            if (r16 == 0) goto L_0x0181
            r12 = r14
            r13 = r4
            r14 = r10
            r15 = r5
            r17 = r8
            r18 = r20
            X.1OO r0 = X.C70025Nw3.A00(r12, r13, r14, r15, r16, r17, r18)
            r0.A01()
        L_0x0181:
            r0 = 36330170579894774(0x811219000b41f6, double:3.038684392355784E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 == 0) goto L_0x008c
            r0 = 36611645556857084(0x821219000f18fc, double:3.216690301195507E-306)
            long r0 = X.182.A01(r3, r4, r0)
            int r5 = r2.size()
            int r10 = (int) r0
            if (r5 <= r10) goto L_0x019d
            r5 = r10
        L_0x019d:
            if (r6 >= r5) goto L_0x008c
            java.lang.Object r0 = r2.get(r6)
            X.3tC r0 = (X.C254873tC) r0
            com.instagram.model.mediasize.ExtendedImageUrl r13 = r0.A0X
            if (r13 == 0) goto L_0x01dd
            com.instagram.model.mediasize.GifUrlImpl r12 = r0.A0Z
            if (r12 == 0) goto L_0x01dd
            java.lang.String r10 = r0.A0x
            long r0 = r0.A0K
            java.lang.String r0 = java.lang.String.valueOf(r0)
            X.1Xj r10 = X.C70024Nw2.A00(r13, r12, r10, r0)
            if (r10 == 0) goto L_0x01dd
            r0 = 36611645556660474(0x821219000c18fa, double:3.21669030107117E-306)
            long r0 = X.182.A01(r3, r4, r0)
            X.3WR r12 = r10.CEL()
            int r10 = (int) r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            X.3vO r1 = new X.3vO
            r1.<init>(r12, r8)
            if (r0 == 0) goto L_0x01d6
            r1.A01 = r10
        L_0x01d6:
            X.3uP r0 = X.C255593uO.A00(r4)
            r0.A01(r1)
        L_0x01dd:
            int r6 = r6 + 1
            goto L_0x019d
        L_0x01e0:
            r10 = 0
            X.0qQ.A0B(r4, r10)
            X.5yA r6 = new X.5yA
            r6.<init>(r4)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.Object r13 = r5.A1T
            X.4ik r0 = r5.A0e
            r8 = 0
            if (r0 == 0) goto L_0x02df
            X.4iq r12 = r0.A04
        L_0x01f7:
            boolean r0 = r13 instanceof X.1Xj
            if (r0 != 0) goto L_0x0206
            r0 = 2
            boolean r0 = X.AnonymousClass9JI.A00(r0, r13)
            if (r0 == 0) goto L_0x0289
            X.9JI r13 = (X.AnonymousClass9JI) r13
            java.lang.Object r13 = r13.A00
        L_0x0206:
            X.1Xj r13 = (X.1Xj) r13
            r0 = 1
            X.0qQ.A0B(r14, r0)
            r0 = 2
            X.0qQ.A0B(r13, r0)
            X.8xB r12 = new X.8xB
            r12.<init>()
            com.instagram.model.mediasize.ExtendedImageUrl r0 = r13.A1n(r14)
            r12.A01 = r0
            long r0 = r13.A17()
            r12.A00 = r0
            boolean r10 = r13.A5D()
        L_0x0225:
            r12.A02 = r10
            r2.add(r12)
        L_0x022a:
            java.util.Iterator r8 = r2.iterator()
        L_0x022e:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x008c
            java.lang.Object r1 = r8.next()
            X.8xB r1 = (X.C370858xB) r1
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x022e
            com.instagram.common.typedurl.ImageUrl r2 = r1.A01
            if (r2 == 0) goto L_0x022e
            java.lang.String r0 = r5.A0g()
            r1 = r24
            if (r24 == 0) goto L_0x026e
            if (r0 == 0) goto L_0x026e
            r10 = r23
            if (r23 == 0) goto L_0x026e
            X.3su r0 = r10.A0J(r0)
            if (r0 == 0) goto L_0x0265
            java.util.LinkedHashMap r0 = r0.A1z
            if (r0 != 0) goto L_0x0284
            java.lang.String r0 = ""
        L_0x025c:
            X.0qQ.A07(r0)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x026e
        L_0x0265:
            X.3U9 r0 = r10.A0I
            int r0 = r0.C6a()
            r6.A02(r5, r1, r0)
        L_0x026e:
            X.1NK r1 = X.1NK.A00()
            java.lang.String r0 = "direct_thread"
            X.1OO r1 = r1.A0J(r2, r0)
            r1.A05 = r4
            r0 = 1
            r1.A0I = r0
            r0 = 0
            r1.A0F = r0
            r1.A01()
            goto L_0x022e
        L_0x0284:
            java.lang.String r0 = r0.toString()
            goto L_0x025c
        L_0x0289:
            if (r12 == 0) goto L_0x02a1
            com.instagram.model.mediasize.ImageInfo r0 = r12.A06
            if (r0 == 0) goto L_0x02a1
            com.instagram.model.mediasize.ExtendedImageUrl r8 = r12.A00(r14)
            long r0 = r12.A02
            boolean r10 = r12.A0R
        L_0x0297:
            X.8xB r12 = new X.8xB
            r12.<init>()
            r12.A01 = r8
            r12.A00 = r0
            goto L_0x0225
        L_0x02a1:
            X.3tC r0 = r5.A0j
            if (r0 == 0) goto L_0x02b9
            r0 = 36328465477221743(0x81108c00013d6f, double:3.037606078559462E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 == 0) goto L_0x02b9
            X.3tC r0 = r5.A0j
            if (r0 == 0) goto L_0x02b6
        L_0x02b4:
            com.instagram.model.mediasize.ExtendedImageUrl r8 = r0.A0X
        L_0x02b6:
            r0 = -1
            goto L_0x0297
        L_0x02b9:
            com.google.common.collect.ImmutableList r0 = r5.A0H()
            if (r0 == 0) goto L_0x022a
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x022a
            r0 = 36328465477221743(0x81108c00013d6f, double:3.037606078559462E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 == 0) goto L_0x022a
            com.google.common.collect.ImmutableList r0 = r5.A0H()
            if (r0 == 0) goto L_0x02b6
            java.lang.Object r0 = X.00k.A0J(r0)
            X.3tC r0 = (X.C254873tC) r0
            if (r0 == 0) goto L_0x02b6
            goto L_0x02b4
        L_0x02df:
            r12 = r8
            goto L_0x01f7
        L_0x02e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C370848xA.A00(android.content.Context, com.instagram.common.session.UserSession, X.48S, X.3t0, java.util.List, int):void");
    }
}
