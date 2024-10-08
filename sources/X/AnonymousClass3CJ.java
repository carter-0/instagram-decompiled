package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.3CJ  reason: invalid class name */
public abstract class AnonymousClass3CJ {
    /* JADX WARNING: type inference failed for: r11v1 */
    /* JADX WARNING: type inference failed for: r19v3, types: [X.3CK] */
    /* JADX WARNING: type inference failed for: r19v4, types: [X.WZn] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C308676Ve A00(android.content.Context r27, X.AnonymousClass07i r28, com.instagram.common.session.UserSession r29, X.C233172vA r30, X.AnonymousClass4DU r31, X.AnonymousClass3BQ r32, X.AnonymousClass6VU r33, X.C270424gi r34, X.1PX r35, X.C228812mN r36, X.C233212vI r37, X.C249863kU r38, X.C228232l0 r39, X.C249763kK r40, java.lang.String r41, boolean r42) {
        /*
            r0 = 7
            r15 = r38
            X.0qQ.A0B(r15, r0)
            r0 = 8
            r13 = r35
            X.0qQ.A0B(r13, r0)
            r7 = r29
            java.lang.Boolean r0 = X.AnonymousClass1P8.A00(r7)
            boolean r0 = r0.booleanValue()
            r18 = r41
            r17 = r40
            r5 = r27
            r8 = r30
            r9 = r31
            r10 = r32
            r25 = r36
            if (r0 == 0) goto L_0x0087
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323779671240200(0x810c4900342e08, double:3.034642755988508E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x0087
            X.WZn r11 = new X.WZn
            r19 = r11
            r20 = r5
            r21 = r7
            r22 = r8
            r23 = r9
            r24 = r10
            r26 = r17
            r27 = r18
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27)
        L_0x0049:
            X.3CL r11 = (X.AnonymousClass3CL) r11
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            X.0Tu r2 = X.0Tu.A05
            r0 = 36310542581891231(0x81003f0032009f, double:3.0262715673827394E-306)
            boolean r19 = X.182.A06(r2, r7, r0)
            r0 = 36310542582743207(0x81003f003f00a7, double:3.0262715679215324E-306)
            boolean r20 = X.182.A06(r2, r7, r0)
            X.6Vc r4 = new X.6Vc
            r16 = r39
            r14 = r37
            r21 = r42
            r6 = r28
            r12 = r34
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r3.add(r4)
            X.6Ve r1 = new X.6Ve
            r1.<init>(r3)
            r2 = r33
            if (r33 == 0) goto L_0x0086
            X.6Vf r0 = new X.6Vf
            r0.<init>(r7, r2, r12, r15)
            r1.A00 = r0
        L_0x0086:
            return r1
        L_0x0087:
            X.3CK r11 = new X.3CK
            r19 = r11
            r20 = r5
            r21 = r7
            r22 = r8
            r23 = r9
            r24 = r10
            r26 = r17
            r27 = r18
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x0049
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3CJ.A00(android.content.Context, X.07i, com.instagram.common.session.UserSession, X.2vA, X.4DU, X.3BQ, X.6VU, X.4gi, X.1PX, X.2mN, X.2vI, X.3kU, X.2l0, X.3kK, java.lang.String, boolean):X.6Ve");
    }

    public static final AnonymousClass3CO A01(Context context, AnonymousClass07i r23, UserSession userSession, C233172vA r25, AnonymousClass4DU r26, AnonymousClass3BQ r27, 1PX r28, C228812mN r29, C233212vI r30, C249863kU r31, C249763kK r32, String str) {
        C249863kU r11 = r31;
        0qQ.A0B(r11, 7);
        1PX r9 = r28;
        0qQ.A0B(r9, 8);
        Context context2 = context;
        UserSession userSession2 = userSession;
        C233172vA r6 = r25;
        AnonymousClass3BQ r7 = r27;
        C249763kK r12 = r32;
        String str2 = str;
        AnonymousClass3CK r14 = new AnonymousClass3CK(context2, userSession2, r6, r26, r7, r29, r12, str2);
        0Tu r2 = 0Tu.A05;
        AnonymousClass07i r4 = r23;
        C233212vI r10 = r30;
        if (!182.A06(r2, userSession2, 36317779600676370L) || !182.A06(r2, userSession2, 36317779601462814L)) {
            return new AnonymousClass3CO(context2, r4, userSession2, r6, r7, r14, r9, r10, r11, r12, str2);
        }
        return new HDL(context2, r4, userSession2, r6, r7, r14, r9, r10, r11, r12, str2);
    }
}
