package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;
import java.util.Map;

/* renamed from: X.HSp  reason: case insensitive filesystem */
public abstract class C54782HSp {
    public static final void A00(C286575Wy r30, C62320sa r31, C62320sa r32, int i) {
        int i2;
        C62320sa r4 = r31;
        C62320sa r3 = r32;
        boolean A1U = AnonymousClass7TF.A1U(0, r4, r3);
        C286575Wy r12 = r30;
        r12.ExV(-698927442);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r12, r4) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r12, r3);
        }
        if ((i2 & 19) != 18 || !r12.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(2093692779, "com.instagram.aistudio.editor.AiImproveResponseOptionsScreen (AiImproveResponseOptionsScreen.kt:19)");
            }
            C285245Qk r6 = Modifier.A00;
            Modifier A00 = JJP.A00(C51966G9m.A0T(r6), C287655aY.A00, 0);
            AnonymousClass5RD A0Z = C51969G9p.A0Z(r12, 0);
            int A002 = C287425a7.A00(r12);
            C286565Wx r5 = (C286565Wx) r12;
            AnonymousClass5RM A04 = C286565Wx.A04(r5);
            Modifier A01 = C287435a8.A01(r12, A00);
            C51973G9u.A0y(r12, r5);
            C51971G9r.A12(r12, A0Z, A04);
            0sL r9 = C287485aD.A02;
            if (r5.A0K || !C51972G9s.A1Q(r12, A002)) {
                C51971G9r.A13(r12, r9, A002);
            }
            C51965G9l.A18(r12, A01);
            boolean A1N = C51973G9u.A1N(r12, -705686997, i2);
            Object ECw = r12.ECw();
            if (A1N || ECw == AnonymousClass5XT.A00) {
                ECw = new MMM(r4, 46);
                r12.FLL(ECw);
            }
            C52636GaA.A00(r12, C287635aW.A05(r6, (C287625aV) null, (String) null, C51965G9l.A0y(r5, ECw, false), A1U), (Modifier) null, (AnonymousClass5RW) null, C287975bA.A00(r12, R.drawable.instagram_comment_pano_outline_24, 0), (C286025Tq) null, (C54611HKu) null, (C59489JLn) null, C304346Dc.A00(r12, 2131952660), C304346Dc.A00(r12, 2131952659), (String) null, (Map) null, r4, 0, 0, 0, 0, (i2 << 12) & 57344, 114636, 0, false);
            boolean A1Y = C51974G9v.A1Y(r12, -705674481, i2);
            Object ECw2 = r12.ECw();
            if (A1Y || ECw2 == AnonymousClass5XT.A00) {
                ECw2 = new MMM(r3, 47);
                r12.FLL(ECw2);
            }
            C52636GaA.A00(r12, C287635aW.A05(r6, (C287625aV) null, (String) null, C51965G9l.A0y(r5, ECw2, false), A1U), (Modifier) null, (AnonymousClass5RW) null, C287975bA.A00(r12, R.drawable.instagram_document_lined_pano_outline_24, 0), (C286025Tq) null, (C54611HKu) null, (C59489JLn) null, C304346Dc.A00(r12, 2131952662), C304346Dc.A00(r12, 2131952661), (String) null, (Map) null, r3, 0, 0, 0, 0, (i2 << 9) & 57344, 114636, 0, false);
            if (C51967G9n.A1R(r12)) {
                0fL.A00(1003664278);
            }
        } else {
            r12.Evl();
        }
        C286625Xd ASQ = r12.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JGL(r4, r3, i3, 11);
        }
    }
}
