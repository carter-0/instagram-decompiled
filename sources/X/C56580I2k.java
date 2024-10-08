package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import java.util.List;

/* renamed from: X.I2k  reason: case insensitive filesystem */
public abstract class C56580I2k {
    public static final void A00(C286575Wy r15, C303876Bd r16, String str, String str2, String str3, String str4, int i) {
        int i2;
        C286575Wy r7 = r15;
        r15.ExV(1772771777);
        int i3 = i;
        C303876Bd r6 = r16;
        if ((i & 6) == 0) {
            i2 = C51970G9q.A05(G9t.A1T(r15, r6, i3) ? 1 : 0) | i;
        } else {
            i2 = i3;
        }
        String str5 = str;
        if ((i & 48) == 0) {
            i2 |= G9t.A0P(r15, str5);
        }
        String str6 = str2;
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0Q(r15, str6);
        }
        String str7 = str3;
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0R(r15, str7);
        }
        String str8 = str4;
        if ((i3 & 24576) == 0) {
            i2 |= G9t.A0S(r15, str8);
        }
        if ((i2 & 9363) != 9362 || !r15.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(214384360, "com.instagram.creator.agent.settings.avoidedtopics.fragment.AddLinkToString (AvoidedTopicsFragment.kt:217)");
            }
            if (00l.A0d(str5, str6, false)) {
                0qQ.A0B(str5, 0);
                int A0G = C51971G9r.A0G(str5, str6);
                int A05 = C51966G9m.A05(str6, A0G);
                r6.A06(new AnonymousClass5ZB((C268454dQ) null, (C291715hl) null, (C291725hm) null, AnonymousClass5ZD.A03, (C291795ht) null, 65530, C51966G9m.A0D(r15), 0, 0), A0G, A05);
                r6.A0A(str7, str8, A0G, A05);
            }
            if (0fL.A02()) {
                0fL.A00(-1462190913);
            }
        } else {
            r15.Evl();
        }
        C286625Xd ASQ = r7.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J8F(r6, str5, str6, str7, str8, i3);
        }
    }

    public static final void A01(C286575Wy r12, C61037Jvb jvb, 0sP r14, 0sP r15, int i) {
        int i2;
        C286575Wy r6 = r12;
        r12.ExV(899390154);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r12, jvb) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r12, r14);
        }
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r12, r15);
        }
        if ((i2 & 147) != 146 || !r12.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1288919493, "com.instagram.creator.agent.settings.avoidedtopics.fragment.AvoidedTopicItem (AvoidedTopicsFragment.kt:185)");
            }
            C285245Qk r3 = Modifier.A00;
            boolean A1U = C51966G9m.A1U(r12, jvb, C51973G9u.A1O(r12, 843576566, i2));
            Object ECw = r12.ECw();
            if (A1U || ECw == AnonymousClass5XT.A00) {
                ECw = C58689Ivy.A00(r12, jvb, r14, 32);
            }
            C51965G9l.A1V(r12);
            HZO.A00(r6, (Alignment) null, C287635aW.A06(r3, (C62320sa) ECw), JG1.A00(r12, r15, jvb, 47, -987767371), AnonymousClass5PI.A01(r12, C59342JFu.A00(jvb, 41), -1671997676), 3456, 2);
            if (0fL.A02()) {
                0fL.A00(-291642362);
            }
        } else {
            r12.Evl();
        }
        C286625Xd ASQ = r6.ASQ();
        if (ASQ != null) {
            ASQ.A06 = JGN.A01(jvb, r15, r14, i3, 27);
        }
    }

    public static final void A02(C286575Wy r15, C54617HLa hLa, List list, C62320sa r18, 0sP r19, 0sP r20, 0sP r21, int i) {
        int i2;
        C286575Wy r1 = r15;
        r15.ExV(-1064128814);
        int i3 = i;
        List list2 = list;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r15, list2) | i;
        } else {
            i2 = i3;
        }
        0sP r8 = r19;
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r15, r8);
        }
        0sP r12 = r20;
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r15, r12);
        }
        C62320sa r11 = r18;
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0H(r15, r11);
        }
        0sP r10 = r21;
        if ((i3 & 24576) == 0) {
            i2 |= G9t.A0I(r15, r10);
        }
        C54617HLa hLa2 = hLa;
        if ((196608 & i) == 0) {
            i2 |= G9t.A0T(r15, hLa2);
        }
        if ((74899 & i2) != 74898 || !r15.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1436877765, "com.instagram.creator.agent.settings.avoidedtopics.fragment.AvoidedTopicsContent (AvoidedTopicsFragment.kt:166)");
            }
            boolean z = true;
            boolean A1Z = C51967G9n.A1Z(r15, list2, 1301688770) | AnonymousClass7TF.A1S(i2 & 112, 32) | AnonymousClass7TF.A1S(i2 & 896, 256) | AnonymousClass7TF.A1S(i2 & 7168, C249703kE.FLAG_MOVED) | C51974G9v.A1W(i2);
            if ((i2 & 458752) != 131072) {
                z = false;
            }
            boolean z2 = A1Z | z;
            Object ECw = r15.ECw();
            if (z2 || ECw == AnonymousClass5XT.A00) {
                ECw = new C58799Ixk(7, hLa2, list2, r10, r8, r12, r11);
                r1.FLL(ECw);
            }
            C51968G9o.A1N(r1);
            AnonymousClass6HY.A09(r1, (0sP) ECw);
            if (0fL.A02()) {
                0fL.A00(-954843652);
            }
        } else {
            r15.Evl();
        }
        C286625Xd ASQ = r1.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JA2(r8, list2, r10, r11, r12, hLa2, i3, 4);
        }
    }
}
