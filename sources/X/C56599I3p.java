package X;

import com.instagram.common.session.UserSession;
import org.webrtc.CameraCapturer;

/* renamed from: X.I3p  reason: case insensitive filesystem */
public abstract class C56599I3p {
    public static final C267314bM A00 = new C267304bL(C58316Ipx.A00);

    public static final AnonymousClass49S A00(C61068Jw6 jw6) {
        Integer num;
        Integer num2;
        Integer num3;
        int A0M = AnonymousClass7TE.A0M(jw6.A03);
        if (A0M == 0) {
            num = AnonymousClass05K.A00;
        } else if (A0M == 1) {
            num = AnonymousClass05K.A01;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        boolean z = jw6.A00;
        boolean z2 = jw6.A01;
        int A0M2 = AnonymousClass7TE.A0M(jw6.A04);
        if (A0M2 == 0) {
            num2 = AnonymousClass05K.A00;
        } else if (A0M2 == 1) {
            num2 = AnonymousClass05K.A01;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        int A0M3 = AnonymousClass7TE.A0M(jw6.A05);
        if (A0M3 == 0) {
            num3 = AnonymousClass05K.A00;
        } else if (A0M3 == 1) {
            num3 = AnonymousClass05K.A01;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        return new AnonymousClass49S((AnonymousClass49T) null, num2, num3, num, 432, z, z2, false);
    }

    public static final void A01(C286575Wy r14, C61068Jw6 jw6, 0sL r16, int i, int i2) {
        int i3;
        AnonymousClass49S r10;
        C61068Jw6 jw62 = jw6;
        0sL r4 = r16;
        0qQ.A0B(r4, 1);
        C286575Wy r6 = r14;
        r14.ExV(1649857331);
        int i4 = i2;
        int i5 = i2 & 1;
        int i6 = i;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = G9t.A0O(r14, jw6) | i;
        } else {
            i3 = i6;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= G9t.A0F(r14, r4);
        }
        if ((i3 & 91) != 18 || !r14.Bwn()) {
            if (i5 != 0) {
                jw62 = null;
            }
            if (0fL.A02()) {
                0fL.A01(-2055571512, "com.instagram.compose.core.viewpoint.ProvideMerlinNodeRegistry (LocalMerlinNodeRegistry.kt:100)");
            }
            C284945Oz A0M = C51968G9o.A0M(r14, C286955Yl.A00);
            boolean A1Y = C51967G9n.A1Y(r14, A0M, -30205859);
            Object ECw = r14.ECw();
            if (A1Y || ECw == AnonymousClass5XT.A00) {
                UserSession userSession = (UserSession) A0M.getValue();
                if (jw62 != null) {
                    r10 = A00(jw62);
                } else {
                    r10 = new AnonymousClass49S((AnonymousClass49T) null, (Integer) null, AnonymousClass05K.A00, (Integer) null, CameraCapturer.OPEN_CAMERA_DELAY_MS, false, 182.A06(0Tu.A05, (0lg) A0M.getValue(), 36313437388736509L), false);
                }
                ECw = new C55609HkU(userSession, r10);
                r6.FLL(ECw);
            }
            C51965G9l.A1V(r6);
            C51971G9r.A11(r6, A00.A02(ECw), new C59112J6u(r4, 7), 1356473971);
            if (0fL.A02()) {
                0fL.A00(578391259);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r6.ASQ();
        if (ASQ != null) {
            ASQ.A06 = GSJ.A01(jw62, r4, i4, i6, 20);
        }
    }
}
