package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.JGe  reason: case insensitive filesystem */
public final class C59352JGe extends 0Yg implements 0sK {
    public final int A00;
    public final int A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59352JGe(int i, int i2, Object obj) {
        super(3);
        this.A00 = i2;
        this.A01 = i;
        this.A02 = obj;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        C286575Wy r9 = (C286575Wy) obj2;
        if (this.A00 != 0) {
            if (C51968G9o.A0D(obj3) != 16 || !r9.Bwn()) {
                if (0fL.A02()) {
                    0fL.A01(-636875507, "com.instagram.creator.achievements.modules.fragments.AboutAchievementsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AboutAchievementsFragment.kt:142)");
                }
                int i2 = this.A01;
                C53427GoJ goJ = (C53427GoJ) ((JRS) this.A02);
                C54931HYn.A00(r9, (Modifier) null, goJ.A01, goJ.A00, i2, 0, 1);
                if (0fL.A02()) {
                    i = -2046881938;
                }
                return C60340gF.A00;
            }
            r9.Evl();
            return C60340gF.A00;
        }
        int A0M = AnonymousClass7TE.A0M(obj3);
        0qQ.A0B(obj, 0);
        if ((A0M & 17) != 16 || !r9.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1566227293, "com.instagram.aistudio.editor.sectionHeaderItems.<anonymous> (AiConversationScreen.kt:111)");
            }
            C285245Qk r8 = Modifier.A00;
            Modifier A0B = C287195Zj.A0B(C51966G9m.A0T(r8), 16.0f, 24.0f, 16.0f, 0.0f);
            int i3 = this.A01;
            Number number = (Number) this.A02;
            AnonymousClass5RD A0V = C51968G9o.A0V(r9);
            int A002 = C287425a7.A00(r9);
            C286565Wx r4 = (C286565Wx) r9;
            AnonymousClass5RM A04 = C286565Wx.A04(r4);
            Modifier A012 = C287435a8.A01(r9, A0B);
            C51973G9u.A0y(r9, r4);
            C51971G9r.A12(r9, A0V, A04);
            0sL r1 = C287485aD.A02;
            if (r4.A0K || !C51972G9s.A1Q(r9, A002)) {
                C51971G9r.A13(r9, r1, A002);
            }
            C51965G9l.A18(r9, A012);
            AnonymousClass6FX r0 = AnonymousClass6FX.A00;
            String A003 = C288035bG.A00(r9, i3);
            AnonymousClass5ZZ.A0Q(r9, r0.A00(r8), C51965G9l.A0S(r9), A003, C51966G9m.A0H(r9));
            r9.ExS(-674816588);
            if (number != null) {
                AnonymousClass5ZZ.A0r(r9, C51965G9l.A0S(r9), C51968G9o.A13(r9, number), C51966G9m.A0D(r9));
            }
            if (C51971G9r.A1S(r9, r4, false)) {
                i = 301439150;
            }
            return C60340gF.A00;
        }
        r9.Evl();
        return C60340gF.A00;
        0fL.A00(i);
        return C60340gF.A00;
    }
}
