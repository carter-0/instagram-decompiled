package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.HVh  reason: case insensitive filesystem */
public abstract class C54850HVh {
    public static final void A00(C286575Wy r22, UserSession userSession, AnonymousClass4DU r24, String str, C62320sa r26, C62320sa r27, C62320sa r28, C62320sa r29, 0sP r30, 0sP r31, 0sP r32, int i) {
        int i2;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        AnonymousClass4DU r12 = r24;
        String str2 = str;
        0sP r6 = r30;
        AnonymousClass7TG.A1U(r12, str2, r6);
        C62320sa r10 = r26;
        0qQ.A0B(r10, 4);
        C62320sa r9 = r27;
        0sP r5 = r31;
        0sP r4 = r32;
        C51974G9v.A1N(r5, r9, r4);
        C62320sa r8 = r28;
        C62320sa r7 = r29;
        AnonymousClass7TF.A1G(r8, 8, r7);
        C286575Wy r13 = r22;
        r13.ExV(1839373428);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r13, userSession2) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r13, r12);
        }
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0Q(r13, str2);
        }
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0H(r13, r6);
        }
        if ((i3 & 24576) == 0) {
            i2 |= G9t.A0I(r13, r10);
        }
        if ((196608 & i) == 0) {
            i2 |= G9t.A0J(r13, r5);
        }
        if ((1572864 & i) == 0) {
            i2 |= G9t.A0K(r13, r9);
        }
        if ((12582912 & i) == 0) {
            i2 |= G9t.A0L(r13, r4);
        }
        if ((100663296 & i) == 0) {
            i2 |= G9t.A0M(r13, r8);
        }
        if ((805306368 & i) == 0) {
            i2 |= G9t.A0N(r13, r7);
        }
        if ((306783379 & i2) != 306783378 || !r13.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(795728733, "com.instagram.barcelonaig.fragment.BarcelonaIgScreen (BarcelonaIgScreen.kt:44)");
            }
            0sP r222 = r4;
            AnonymousClass4DU r23 = r12;
            C62320sa r20 = r10;
            0sP r21 = r5;
            UserSession userSession3 = userSession2;
            0sP r19 = r6;
            UserSession userSession4 = userSession2;
            C286575Wy r272 = r13;
            GZU.A00(r272, userSession4, r12.getModuleName(), AnonymousClass5PI.A01(r13, new C59239JBr(userSession3, r19, r20, r21, r222, r23, r9, r8, r7, str2, 0), 2131696089), ((i2 << 3) & 112) | 3072, 4, false);
            if (0fL.A02()) {
                0fL.A00(1467849085);
            }
        } else {
            r13.Evl();
        }
        C286625Xd ASQ = r13.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JBV(userSession2, r12, str2, r10, r9, r8, r7, r6, r5, r4, i3);
        }
    }
}
