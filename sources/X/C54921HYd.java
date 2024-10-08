package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.HYd  reason: case insensitive filesystem */
public abstract class C54921HYd {
    public static final void A00(C286575Wy r17, String str, AnonymousClass0r6 r19, int i, int i2) {
        String str2;
        String str3 = str;
        AnonymousClass0r6 r15 = r19;
        0qQ.A0B(r15, 0);
        C286575Wy r8 = r17;
        r8.ExV(-1574088655);
        int i3 = i2;
        if ((i2 & 2) != 0) {
            str3 = null;
        }
        if (0fL.A02()) {
            0fL.A01(475272243, "com.instagram.creation.genai.themes.ui.AiThemesLoadingStateContent (AiThemesLoadingStateContent.kt:21)");
        }
        C270284gU A01 = AnonymousClass6FW.A01(r8, C55328Hfv.A00.get(0), r15, 8);
        C285245Qk r6 = Modifier.A00;
        Modifier A0U = C51966G9m.A0U(r6);
        AnonymousClass5RD A0X = C51968G9o.A0X(r8);
        int A00 = C287425a7.A00(r8);
        C286565Wx r3 = (C286565Wx) r8;
        AnonymousClass5RM A04 = C286565Wx.A04(r3);
        Modifier A012 = C287435a8.A01(r8, A0U);
        C51973G9u.A0y(r8, r3);
        C51971G9r.A12(r8, A0X, A04);
        0sL r2 = C287485aD.A02;
        if (r3.A0K || !C51972G9s.A1Q(r8, A00)) {
            C51971G9r.A13(r8, r2, A00);
        }
        C51965G9l.A18(r8, A012);
        Modifier A002 = C304676Et.A00.A00(r6, true);
        r8.ExS(-640614949);
        if (str3 == null) {
            Object value = A01.getValue();
            0qQ.A07(value);
            str2 = C288035bG.A00(r8, AnonymousClass7TE.A0M(value));
        } else {
            str2 = str3;
        }
        C286565Wx.A0L(r3, false);
        HY4.A00(r8, A002, str2, 0, 0, C51966G9m.A0M(r8));
        if (C51967G9n.A1R(r8)) {
            0fL.A00(394798158);
        }
        C286625Xd ASQ = r8.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59139J7v(r15, str3, i3, i, 8);
        }
    }
}
