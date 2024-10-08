package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.GifUrlImpl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.user.model.User;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.76s  reason: invalid class name and case insensitive filesystem */
public final class C3264276s {
    public final AnonymousClass773 A00;
    public final Map A01;

    public C3264276s() {
        this((AnonymousClass773) null, (Map) null, (DefaultConstructorMarker) null, 3);
    }

    public final C328667Fr A01(Context context, UserSession userSession, AnonymousClass7FE r10, AnonymousClass9HC r11, AnonymousClass7LQ r12) {
        Context context2 = context;
        0qQ.A0B(context, 0);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 2);
        AnonymousClass9HC r5 = r11;
        0qQ.A0B(r11, 4);
        AnonymousClass7LQ r6 = r12;
        C3264476u r1 = (C3264476u) this.A01.get(r12.A0e.A10);
        if (r1 == null) {
            r1 = this.A00;
        }
        return r1.AM8(context2, userSession2, r10, r5, r6);
    }

    public final C328667Fr A02(Context context, UserSession userSession, AnonymousClass7FE r67, AnonymousClass9HC r68, AnonymousClass7LQ r69, C254933tI r70) {
        C254873tC r8;
        long j;
        Context context2 = context;
        0qQ.A0B(context2, 0);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 3);
        AnonymousClass9HC r10 = r68;
        0qQ.A0B(r10, 5);
        C254933tI r9 = r70;
        2FW r7 = r9.A0F;
        AnonymousClass7FE r3 = r67;
        AnonymousClass7LQ r1 = r69;
        if (r7 == 2FW.A1i) {
            C254703su r5 = r1.A0e;
            0qQ.A07(r5);
            C254933tI A0P = r5.A0P();
            if (A0P != null) {
                AnonymousClass55L r72 = A0P.A05;
                if (r72 != null) {
                    DirectMessageIdentifier A0V = r5.A0V();
                    Long l = A0P.A0P;
                    if (l != null) {
                        j = l.longValue();
                    } else {
                        j = 0;
                    }
                    return AnonymousClass771.A01(AnonymousClass7FG.A02(userSession2, r1, A0P), r3, AnonymousClass771.A00(context2, userSession2, r1, r72, j, false), A0V);
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        } else if (r7 == 2FW.A1q) {
            C254703su r82 = r1.A0e;
            0qQ.A07(r82);
            C254933tI A0P2 = r82.A0P();
            if (A0P2 != null) {
                1Xj r73 = A0P2.A0C;
                if (r73 == null) {
                    return null;
                }
                DirectMessageIdentifier A0V2 = r82.A0V();
                ExtendedImageUrl A1n = r73.A1n(context2);
                if (A1n != null) {
                    String str = null;
                    AnonymousClass776 r13 = new AnonymousClass776(A1n, false, Float.valueOf(r73.A0l()), (Integer) null, (Integer) null, (Integer) null, (String) null);
                    2FW r102 = A0P2.A0F;
                    0qQ.A07(r102);
                    String str2 = r82.A1u;
                    0qQ.A07(str2);
                    AnonymousClass9J6 r15 = new AnonymousClass9J6(OP4.A01(userSession2, OP3.A00(), r102, r73, new C41655Ay7(userSession2, 22)), str2, 5);
                    C254883tD r28 = C254883tD.SINGLE;
                    User user = r1.A0K;
                    if (user != null) {
                        str = user.getUsername();
                    }
                    return new C328667Fr((C376649Iu) null, (C376649Iu) null, (AnonymousClass9J0) null, r15, (AnonymousClass9J6) null, (AnonymousClass9J6) null, (C61062Jw0) null, (C3259574v) null, AnonymousClass7FG.A02(userSession2, r1, A0P2), r3, (AnonymousClass74T) null, (AnonymousClass774) null, r13, (AnonymousClass778) null, (AnonymousClass77A) null, (AnonymousClass5FY) null, r28, (AnonymousClass779) null, A0V2, (C254793t3) null, (GifUrlImpl) null, (ImageInfo) null, (CharSequence) null, (Long) null, (Long) null, (Long) null, str, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, 0, 0, 0, false, false, false, false, false, false, false, false, false, false);
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        } else {
            ImmutableList A012 = r9.A01();
            if (A012 == null || (r8 = (C254873tC) 00k.A0O(A012, 0)) == null) {
                return null;
            }
            AnonymousClass773 r74 = this.A00;
            AnonymousClass774 A013 = AnonymousClass773.A01(r8, r10.A1C);
            AnonymousClass7SD r0 = r1.A0G;
            return r74.A06(context2, userSession2, r3, r10, A013, r1, r9, r8, AnonymousClass773.A05(r8, r0.A0P, r0.A08, true));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0112, code lost:
        if (((X.AnonymousClass7FV) r13.get(0)).A00.CU2() != false) goto L_0x0114;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C328687Ft A03(android.content.Context r37, com.instagram.common.session.UserSession r38, X.AnonymousClass7FE r39, X.AnonymousClass9HC r40, X.AnonymousClass7LQ r41, boolean r42) {
        /*
            r36 = this;
            r0 = 0
            r19 = 1
            r1 = r41
            X.3su r4 = r1.A0e
            X.0qQ.A07(r4)
            com.google.common.collect.ImmutableList r3 = r4.A0H()
            if (r3 != 0) goto L_0x0017
            com.google.common.collect.ImmutableList r3 = com.google.common.collect.ImmutableList.of()
            X.0qQ.A07(r3)
        L_0x0017:
            r2 = 10
            int r2 = X.0Yv.A1E(r3, r2)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>(r2)
            java.util.Iterator r10 = r3.iterator()
        L_0x0026:
            boolean r2 = r10.hasNext()
            r12 = 0
            r6 = r37
            r7 = r38
            r5 = r39
            if (r2 == 0) goto L_0x00c7
            java.lang.Object r9 = r10.next()
            X.3tC r9 = (X.C254873tC) r9
            int r25 = r1.A01()
            X.7SD r2 = r1.A0G
            int r2 = r2.A08
            r8 = 29
            if (r2 != r8) goto L_0x0095
            boolean r2 = X.C70887OQf.A01(r4)
            if (r2 == 0) goto L_0x0095
            java.lang.Boolean r2 = X.O0U.A00(r7)
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0095
            com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r24 = X.C70887OQf.A00(r4)
            r28 = 0
            r25 = 1
        L_0x005d:
            X.0qQ.A0A(r9)
            X.7SD r3 = r1.A0G
            int r2 = r3.A08
            if (r2 != r8) goto L_0x0093
            boolean r2 = r3.A0n
        L_0x0068:
            r32 = r40
            r29 = r6
            r30 = r7
            r31 = r5
            r33 = r1
            r34 = r9
            r35 = r2
            X.7Fr r22 = X.AnonymousClass773.A03(r29, r30, r31, r32, r33, r34, r35)
            boolean r29 = r4.A1S()
            com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams r23 = A00(r1)
            X.NYf r2 = new X.NYf
            r21 = r12
            r26 = r0
            r27 = r0
            r20 = r2
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r13.add(r2)
            goto L_0x0026
        L_0x0093:
            r2 = 1
            goto L_0x0068
        L_0x0095:
            boolean r2 = r4.A1a()
            if (r2 == 0) goto L_0x00c2
            com.instagram.model.mediasize.GifUrlImpl r2 = r9.A0Z
            if (r2 != 0) goto L_0x00c2
            long r2 = r9.A0K
            java.lang.String r2 = java.lang.String.valueOf(r2)
            X.76m r3 = new X.76m
            r3.<init>(r7, r4, r2)
            boolean r2 = r3.A05()
            if (r2 == 0) goto L_0x00c2
            int r25 = r3.A03()
            android.content.res.Resources r2 = r6.getResources()
            X.0qQ.A07(r2)
            com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r24 = r3.A04(r2, r0)
            r28 = 1
            goto L_0x005d
        L_0x00c2:
            r28 = 0
            r24 = r12
            goto L_0x005d
        L_0x00c7:
            X.46n r9 = r4.A0N
            if (r9 == 0) goto L_0x012d
            X.7L2 r8 = r5.A03
            java.lang.String r3 = r7.A06
            java.lang.String r2 = r4.BsI()
            boolean r27 = X.0qQ.A0K(r3, r2)
            r10 = r12
            r20 = r6
            r21 = r7
            r22 = r1
            r23 = r8
            r24 = r9
            r25 = r0
            r26 = r0
            r28 = r0
            X.74v r9 = X.C70863OPc.A01(r20, r21, r22, r23, r24, r25, r26, r27, r28)
        L_0x00ec:
            com.instagram.model.direct.messageid.DirectMessageIdentifier r11 = r4.A0V()
            X.7SD r2 = r1.A0G
            X.3t3 r2 = r2.A0P
            if (r2 == 0) goto L_0x00fa
            java.lang.String r12 = X.C300965yF.A07(r2)
        L_0x00fa:
            X.7SD r2 = r1.A0G
            int r15 = r2.A08
            boolean r2 = r13.isEmpty()
            if (r2 != 0) goto L_0x0114
            java.lang.Object r0 = r13.get(r0)
            X.7FV r0 = (X.AnonymousClass7FV) r0
            X.7FU r0 = r0.A00
            boolean r0 = r0.CU2()
            r18 = 1
            if (r0 == 0) goto L_0x0116
        L_0x0114:
            r18 = 0
        L_0x0116:
            int r16 = r1.A01()
            r1 = 12
            X.9Lz r0 = new X.9Lz
            r0.<init>(r1, r6, r5)
            X.0t0 r14 = X.AnonymousClass0eN.A01(r0)
            X.7Ft r8 = new X.7Ft
            r17 = r42
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r8
        L_0x012d:
            r10 = r12
            r9 = r12
            goto L_0x00ec
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3264276s.A03(android.content.Context, com.instagram.common.session.UserSession, X.7FE, X.9HC, X.7LQ, boolean):X.7Ft");
    }

    public /* synthetic */ C3264276s(AnonymousClass773 r16, Map map, DefaultConstructorMarker defaultConstructorMarker, int i) {
        0eP r2 = new 0eP(2FW.A1D, C3264376t.A00);
        2FW r0 = 2FW.A1O;
        C3264576v r1 = C3264576v.A00;
        0eP r3 = new 0eP(r0, r1);
        0eP r4 = new 0eP(2FW.A0H, r1);
        2FW r02 = 2FW.A1e;
        C3264676w r12 = C3264676w.A00;
        0eP r5 = new 0eP(r02, r12);
        0eP r6 = new 0eP(2FW.A1T, r12);
        0eP r7 = new 0eP(2FW.A18, r12);
        2FW r03 = 2FW.A0t;
        C3264776x r13 = C3264776x.A00;
        LinkedHashMap A06 = 0Yt.A06(new 0eP[]{r2, r3, r4, r5, r6, r7, new 0eP(r03, r13), new 0eP(2FW.A0W, r13), new 0eP(2FW.A19, C3264876y.A00), new 0eP(2FW.A0k, C3264976z.A00), new 0eP(2FW.A1Y, AnonymousClass770.A00), new 0eP(2FW.A1i, AnonymousClass771.A00), new 0eP(2FW.A1q, AnonymousClass772.A00)});
        AnonymousClass773 r14 = AnonymousClass773.A00;
        0qQ.A0B(A06, 1);
        0qQ.A0B(r14, 2);
        this.A01 = A06;
        this.A00 = r14;
    }

    public static final DirectThreadAnalyticsParams A00(AnonymousClass7LQ r3) {
        C254703su r2 = r3.A0e;
        if (r2.A1c()) {
            return null;
        }
        AnonymousClass7SD r1 = r3.A0G;
        0qQ.A07(r1);
        return C3263376i.A00(r1, r2.A2G);
    }
}
